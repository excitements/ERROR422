package paulscode.sound;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class StreamThread extends SimpleThread {
  private SoundSystemLogger logger = SoundSystemConfig.getLogger();
  
  private List streamingSources = new LinkedList();
  
  private final Object listLock = new Object();
  
  private void message(String paramString) {
    this.logger.message(paramString, 0);
  }
  
  private boolean errorCheck(boolean paramBoolean, String paramString) {
    return this.logger.errorCheck(paramBoolean, "StreamThread", paramString, 0);
  }
  
  private void importantMessage(String paramString) {
    this.logger.importantMessage(paramString, 0);
  }
  
  protected void cleanup() {
    kill();
    super.cleanup();
  }
  
  public void run() {
    snooze(3600000L);
    while (!dying()) {
      while (!dying() && !this.streamingSources.isEmpty()) {
        synchronized (this.listLock) {
          ListIterator<Source> listIterator = this.streamingSources.listIterator();
          while (!dying() && listIterator.hasNext()) {
            Source source = listIterator.next();
            if (source == null) {
              listIterator.remove();
              continue;
            } 
            if (source.stopped()) {
              if (!source.rawDataStream)
                listIterator.remove(); 
              continue;
            } 
            if (!source.active()) {
              if (source.toLoop || source.rawDataStream)
                source.toPlay = true; 
              listIterator.remove();
              continue;
            } 
            if (!source.paused()) {
              source.checkFadeOut();
              if (!source.stream() && !source.rawDataStream && (source.channel == null || !source.channel.processBuffer())) {
                if (source.nextCodec == null)
                  source.readBuffersFromNextSoundInSequence(); 
                if (source.toLoop) {
                  if (!source.playing()) {
                    SoundSystemConfig.notifyEOS(source.sourcename, source.getSoundSequenceQueueSize());
                    if (source.checkFadeOut()) {
                      source.preLoad = true;
                      continue;
                    } 
                    source.incrementSoundSequence();
                    source.preLoad = true;
                  } 
                  continue;
                } 
                if (!source.playing()) {
                  SoundSystemConfig.notifyEOS(source.sourcename, source.getSoundSequenceQueueSize());
                  if (!source.checkFadeOut()) {
                    if (source.incrementSoundSequence()) {
                      source.preLoad = true;
                      continue;
                    } 
                    listIterator.remove();
                  } 
                } 
              } 
            } 
          } 
        } 
        if (!dying() && !this.streamingSources.isEmpty())
          snooze(20L); 
      } 
      if (!dying() && this.streamingSources.isEmpty())
        snooze(3600000L); 
    } 
    cleanup();
  }
  
  private void errorMessage(String paramString) {
    this.logger.errorMessage("StreamThread", paramString, 0);
  }
  
  public void watch(Source paramSource) {
    if (paramSource == null)
      return; 
    if (this.streamingSources.contains(paramSource))
      return; 
    synchronized (this.listLock) {
      ListIterator<Source> listIterator = this.streamingSources.listIterator();
      while (listIterator.hasNext()) {
        Source source = listIterator.next();
        if (source == null) {
          listIterator.remove();
          continue;
        } 
        if (paramSource.channel == source.channel) {
          source.stop();
          listIterator.remove();
        } 
      } 
      this.streamingSources.add(paramSource);
    } 
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\paulscode\sound\StreamThread.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */