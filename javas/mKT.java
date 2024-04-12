import java.io.File;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Set;
import net.minecraft.client.Minecraft;
import paulscode.sound.SoundSystem;
import paulscode.sound.SoundSystemConfig;
import paulscode.sound.codecs.CodecJOrbis;
import paulscode.sound.codecs.CodecWav;
import paulscode.sound.libraries.LibraryLWJGLOpenAL;

public class mKT {
  private ikJ Dne;
  
  public static SoundSystem Dne;
  
  private Set Dne;
  
  private ikJ bzF = new ikJ();
  
  private ikJ FWm;
  
  private fZI Dne;
  
  private static boolean Dne = false;
  
  private List Dne;
  
  private int FWm = new ikJ();
  
  private int Dne;
  
  private Random Dne = (Random)new ikJ();
  
  public void Dne(String paramString, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, int paramInt) {
    this.Dne.add(new IUq(paramString, paramFloat1, paramFloat2, paramFloat3, paramFloat4, paramFloat5, paramInt));
  }
  
  public void Dne(String paramString, sMa paramsMa, float paramFloat1, float paramFloat2, boolean paramBoolean) {
    if (paramsMa != null && Dne != null && (((fZI)this.Dne).FWm != 0.0F || paramString == null)) {
      String str = "entity_" + paramsMa.aFZ;
      if (this.Dne.contains(str)) {
        Dne(paramsMa);
      } else {
        if (Dne.playing(str))
          Dne.stop(str); 
        if (paramString == null)
          return; 
        OfD ofD = this.Dne.Dne(paramString);
        if (ofD != null && paramFloat1 > 0.0F) {
          float f = 16.0F;
          if (paramFloat1 > 1.0F)
            f *= paramFloat1; 
          Dne.newSource(paramBoolean, str, (URL)ofD.Dne, ofD.Dne, false, (float)paramsMa.div, (float)paramsMa.IjH, (float)paramsMa.mrb, 2, f);
          Dne.setLooping(str, true);
          Dne.setPitch(str, paramFloat2);
          if (paramFloat1 > 1.0F)
            paramFloat1 = 1.0F; 
          Dne.setVolume(str, paramFloat1 * ((fZI)this.Dne).FWm);
          Dne.setVelocity(str, (float)paramsMa.XHL, (float)paramsMa.Zpi, (float)paramsMa.kGO);
          Dne.play(str);
          this.Dne.add(str);
        } 
      } 
    } 
  }
  
  public mKT() {
    this.Dne = false;
    this.Dne = (Random)new HashSet();
    this.Dne = (Random)new ArrayList();
    this.Dne = new Random();
    this.FWm = this.Dne.nextInt(12000);
  }
  
  public void Dne(String paramString, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5) {
    if (Dne != null && ((fZI)this.Dne).FWm != 0.0F) {
      OfD ofD = this.Dne.Dne(paramString);
      if (ofD != null && paramFloat4 > 0.0F) {
        this.Dne = (this.Dne + 1) % 256;
        String str = "sound_" + this.Dne;
        float f = 16.0F;
        if (paramFloat4 > 1.0F)
          f *= paramFloat4; 
        Dne.newSource((paramFloat4 > 1.0F), str, (URL)ofD.Dne, ofD.Dne, false, paramFloat1, paramFloat2, paramFloat3, 2, f);
        Dne.setPitch(str, paramFloat5);
        if (paramFloat4 > 1.0F)
          paramFloat4 = 1.0F; 
        Dne.setVolume(str, paramFloat4 * ((fZI)this.Dne).FWm);
        if (eCD.Dne(100) == 0) {
          if (eCD.Dne(2) == 0) {
            Dne.setPitch(str, 0.0F);
          } else {
            Dne.setPitch(str, 2.0F);
          } 
          if (sRv.Dne)
            ((Minecraft)QXI.Dne).Dne.bzF("Sound was played with random pitch."); 
        } 
        Dne.play(str);
      } 
    } 
  }
  
  public void Dne(sMa paramsMa) {
    Dne(paramsMa, paramsMa);
  }
  
  public boolean Dne(sMa paramsMa) {
    if (paramsMa != null && Dne != null) {
      String str = "entity_" + paramsMa.aFZ;
      return Dne.playing(str);
    } 
    return false;
  }
  
  public void aFZ() {
    for (String str : this.Dne)
      Dne.pause(str); 
  }
  
  public void Dne(String paramString, float paramFloat1, float paramFloat2) {
    if (Dne != null && ((fZI)this.Dne).FWm != 0.0F) {
      OfD ofD = this.Dne.Dne(paramString);
      if (ofD != null) {
        this.Dne = (this.Dne + 1) % 256;
        String str = "sound_" + this.Dne;
        Dne.newSource(false, str, (URL)ofD.Dne, ofD.Dne, false, 0.0F, 0.0F, 0.0F, 0, 0.0F);
        if (paramFloat1 > 1.0F)
          paramFloat1 = 1.0F; 
        paramFloat1 *= 0.25F;
        Dne.setPitch(str, paramFloat2);
        Dne.setVolume(str, paramFloat1 * ((fZI)this.Dne).FWm);
        Dne.play(str);
      } 
    } 
  }
  
  public void Dne(String paramString, float paramFloat1, float paramFloat2, float paramFloat3) {
    // Byte code:
    //   0: getstatic mKT.Dne : Z
    //   3: ifeq -> 143
    //   6: aload_0
    //   7: getfield Dne : LfZI;
    //   10: getfield FWm : F
    //   13: fconst_0
    //   14: fcmpl
    //   15: ifne -> 22
    //   18: aload_1
    //   19: ifnonnull -> 143
    //   22: ldc 'streaming'
    //   24: astore #5
    //   26: getstatic mKT.Dne : Lpaulscode/sound/SoundSystem;
    //   29: aload #5
    //   31: invokevirtual playing : (Ljava/lang/String;)Z
    //   34: ifeq -> 45
    //   37: getstatic mKT.Dne : Lpaulscode/sound/SoundSystem;
    //   40: aload #5
    //   42: invokevirtual stop : (Ljava/lang/String;)V
    //   45: aload_1
    //   46: ifnull -> 143
    //   49: aload_0
    //   50: getfield FWm : LikJ;
    //   53: aload_1
    //   54: invokevirtual Dne : (Ljava/lang/String;)LOfD;
    //   57: astore #6
    //   59: aload #6
    //   61: ifnull -> 143
    //   64: getstatic mKT.Dne : Lpaulscode/sound/SoundSystem;
    //   67: ldc 'BgMusic'
    //   69: invokevirtual playing : (Ljava/lang/String;)Z
    //   72: ifeq -> 83
    //   75: getstatic mKT.Dne : Lpaulscode/sound/SoundSystem;
    //   78: ldc 'BgMusic'
    //   80: invokevirtual stop : (Ljava/lang/String;)V
    //   83: ldc 16.0
    //   85: fstore #7
    //   87: getstatic mKT.Dne : Lpaulscode/sound/SoundSystem;
    //   90: iconst_1
    //   91: aload #5
    //   93: aload #6
    //   95: getfield Dne : Ljava/net/URL;
    //   98: aload #6
    //   100: getfield Dne : Ljava/lang/String;
    //   103: iconst_0
    //   104: fload_2
    //   105: fload_3
    //   106: fload #4
    //   108: iconst_2
    //   109: fload #7
    //   111: ldc 4.0
    //   113: fmul
    //   114: invokevirtual newStreamingSource : (ZLjava/lang/String;Ljava/net/URL;Ljava/lang/String;ZFFFIF)V
    //   117: getstatic mKT.Dne : Lpaulscode/sound/SoundSystem;
    //   120: aload #5
    //   122: ldc 0.5
    //   124: aload_0
    //   125: getfield Dne : LfZI;
    //   128: getfield FWm : F
    //   131: fmul
    //   132: invokevirtual setVolume : (Ljava/lang/String;F)V
    //   135: getstatic mKT.Dne : Lpaulscode/sound/SoundSystem;
    //   138: aload #5
    //   140: invokevirtual play : (Ljava/lang/String;)V
    //   143: return
  }
  
  public void FWm(sMa paramsMa, float paramFloat) {
    if (paramsMa != null && Dne != null && Dne != null && ((fZI)this.Dne).FWm != 0.0F) {
      String str = "entity_" + paramsMa.aFZ;
      if (Dne.playing(str))
        Dne.setPitch(str, paramFloat); 
    } 
  }
  
  public void FWm(sMa paramsMa) {
    if (paramsMa != null && Dne != null) {
      String str = "entity_" + paramsMa.aFZ;
      if (this.Dne.contains(str)) {
        if (Dne.playing(str))
          Dne.stop(str); 
        this.Dne.remove(str);
      } 
    } 
  }
  
  public void Dne(sMa paramsMa, float paramFloat) {
    if (paramsMa != null && Dne != null && Dne != null && ((fZI)this.Dne).FWm != 0.0F) {
      String str = "entity_" + paramsMa.aFZ;
      if (Dne.playing(str))
        Dne.setVolume(str, paramFloat * ((fZI)this.Dne).FWm); 
    } 
  }
  
  public void Dne(String paramString, File paramFile) {
    this.Dne.Dne(paramString, paramFile);
  }
  
  public void bzF() {}
  
  private void div() {
    try {
      String[] arrayOfString = ((fZI)this.Dne).FWm;
      Minecraft minecraft = ((fZI)this.Dne).Dne;
      ((fZI)this.Dne).FWm = 0.0F;
      ((fZI)this.Dne).Dne = 0.0F;
      this.Dne.FWm();
      SoundSystemConfig.addLibrary(LibraryLWJGLOpenAL.class);
      SoundSystemConfig.setCodec("ogg", CodecJOrbis.class);
      SoundSystemConfig.setCodec("mus", Lrh.class);
      SoundSystemConfig.setCodec("wav", CodecWav.class);
      Dne = (Random)new SoundSystem();
      wlK wlK = new wlK();
      wlK.Dne();
      ((fZI)this.Dne).FWm = arrayOfString;
      ((fZI)this.Dne).Dne = minecraft;
      this.Dne.FWm();
    } catch (Throwable throwable) {
      throwable.printStackTrace();
      System.err.println("error linking with the LibraryJavaSound plug-in");
    } 
    Dne = true;
  }
  
  public void DyG() {
    if (!this.Dne.isEmpty()) {
      Iterator<IUq> iterator = this.Dne.iterator();
      while (iterator.hasNext()) {
        IUq iUq = iterator.next();
        iUq.Dne--;
        if (iUq.Dne <= 0) {
          Dne(iUq.Dne, iUq.Dne, iUq.FWm, iUq.bzF, iUq.Qnq, iUq.aFZ);
          iterator.remove();
        } 
      } 
    } 
  }
  
  public void Dne() {
    if (Dne == null && (((fZI)this.Dne).FWm != 0.0F || ((fZI)this.Dne).Dne != 0.0F))
      div(); 
    if (Dne != null)
      if (((fZI)this.Dne).Dne == 0.0F) {
        Dne.stop("BgMusic");
        Dne.stop("streaming");
      } else {
        Dne.setVolume("BgMusic", ((fZI)this.Dne).Dne);
        Dne.setVolume("streaming", ((fZI)this.Dne).Dne);
      }  
  }
  
  public void bzF(String paramString, File paramFile) {}
  
  public void Dne(fZI paramfZI) {
    this.FWm.Dne = false;
    this.Dne = (Random)paramfZI;
    if (Dne == null && (paramfZI == null || paramfZI.FWm != 0.0F || paramfZI.Dne != 0.0F))
      div(); 
  }
  
  public void zGp() {
    for (String str : this.Dne)
      Dne.play(str); 
  }
  
  public void Dne(FUH paramFUH, float paramFloat) {
    if (Dne != null && ((fZI)this.Dne).FWm != 0.0F && paramFUH != null) {
      float f1 = paramFUH.kGO + (paramFUH.XHL - paramFUH.kGO) * paramFloat;
      float f2 = paramFUH.Zpi + (paramFUH.mrb - paramFUH.Zpi) * paramFloat;
      double d1 = paramFUH.aFZ + (paramFUH.div - paramFUH.aFZ) * paramFloat;
      double d2 = paramFUH.zGp + (paramFUH.IjH - paramFUH.zGp) * paramFloat;
      double d3 = paramFUH.DyG + (paramFUH.mrb - paramFUH.DyG) * paramFloat;
      float f3 = geR.FWm(-f2 * 0.017453292F - 3.1415927F);
      float f4 = geR.Dne(-f2 * 0.017453292F - 3.1415927F);
      float f5 = -f4;
      float f6 = -geR.Dne(-f1 * 0.017453292F - 3.1415927F);
      float f7 = -f3;
      float f8 = 0.0F;
      float f9 = 1.0F;
      float f10 = 0.0F;
      Dne.setListenerPosition((float)d1, (float)d2, (float)d3);
      Dne.setListenerOrientation(f5, f6, f7, f8, f9, f10);
    } 
  }
  
  public void Dne(sMa paramsMa1, sMa paramsMa2) {
    String str = "entity_" + paramsMa1.aFZ;
    if (this.Dne.contains(str))
      if (Dne.playing(str)) {
        Dne.setPosition(str, (float)paramsMa2.div, (float)paramsMa2.IjH, (float)paramsMa2.mrb);
        Dne.setVelocity(str, (float)paramsMa2.XHL, (float)paramsMa2.Zpi, (float)paramsMa2.kGO);
      } else {
        this.Dne.remove(str);
      }  
  }
  
  public void FWm(String paramString, File paramFile) {
    // Byte code:
    //   0: aload_0
    //   1: getfield FWm : LikJ;
    //   4: aload_1
    //   5: aload_2
    //   6: invokevirtual Dne : (Ljava/lang/String;Ljava/io/File;)LOfD;
    //   9: pop
    //   10: return
  }
  
  public void FWm() {
    if (Dne != null)
      Dne.cleanup(); 
  }
  
  public void Qnq() {
    for (String str : this.Dne)
      Dne.stop(str); 
    this.Dne.clear();
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\mKT.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */