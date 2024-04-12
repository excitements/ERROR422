package paulscode.sound;

import java.util.ListIterator;

final class SoundSystemConfig$1 extends Thread {
  public void run() {
    synchronized (SoundSystemConfig.access$000()) {
      if (SoundSystemConfig.access$100() == null)
        return; 
      ListIterator<IStreamListener> listIterator = SoundSystemConfig.access$100().listIterator();
      while (listIterator.hasNext()) {
        IStreamListener iStreamListener = listIterator.next();
        if (iStreamListener == null) {
          listIterator.remove();
          continue;
        } 
        iStreamListener.endOfStream(srcName, qSize);
      } 
    } 
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\paulscode\sound\SoundSystemConfig$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */