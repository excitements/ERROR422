import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import net.minecraft.client.Minecraft;
import org.lwjgl.input.Keyboard;
import org.lwjgl.input.Mouse;
import org.lwjgl.opengl.Display;

public class fZI {
  public float Qnq;
  
  public int DyG;
  
  public float bzF;
  
  public int mrb;
  
  public float mrb;
  
  private File Dne;
  
  public boolean vSL;
  
  public ulE mrb;
  
  public ulE div;
  
  public boolean oIf;
  
  public ulE kGO;
  
  public boolean EyB;
  
  public float zGp;
  
  public String bzF;
  
  public ulE[] Dne;
  
  public float div;
  
  public boolean OdI;
  
  public float aFZ;
  
  public boolean FfS;
  
  public boolean IjH;
  
  public String FWm;
  
  public boolean trS;
  
  public ulE aFZ;
  
  public int IjH;
  
  public ulE FWm;
  
  public boolean FWm;
  
  public int div;
  
  public boolean bzF;
  
  public int zGp;
  
  public boolean zGp;
  
  public boolean div;
  
  public boolean qLR;
  
  public boolean udO;
  
  public ulE Dne;
  
  public int bzF;
  
  public float FWm;
  
  public int FWm = 1.0F;
  
  public int Dne;
  
  public boolean ceE;
  
  public boolean mrb;
  
  private static final String[] Dne = new String[] { "options.renderDistance.far", "options.renderDistance.normal", "options.renderDistance.short", "options.renderDistance.tiny" };
  
  public boolean DyG;
  
  private static final String[] FWm = new String[] { "options.difficulty.peaceful", "options.difficulty.easy", "options.difficulty.normal", "options.difficulty.hard" };
  
  public boolean Zpi;
  
  public ulE udO;
  
  public boolean ooe;
  
  public ulE XHL;
  
  public boolean kGO;
  
  private static final String[] aFZ;
  
  private static final String[] bzF = new String[] { "options.guiScale.auto", "options.guiScale.small", "options.guiScale.normal", "options.guiScale.large" };
  
  public ulE zGp;
  
  public float Zpi;
  
  private static final String[] DyG;
  
  public boolean Dne;
  
  private static final String[] zGp;
  
  public ulE Zpi;
  
  public ulE bzF = 0.5F;
  
  public String Dne;
  
  public boolean Vxn;
  
  public int aFZ;
  
  public int Qnq;
  
  public boolean Qnq;
  
  public float XHL;
  
  public ulE DyG;
  
  public boolean aFZ;
  
  public float DyG;
  
  public float Dne;
  
  public float IjH;
  
  public ulE IjH;
  
  public boolean ATE;
  
  private static final String[] Qnq = new String[] { "options.chat.visibility.full", "options.chat.visibility.system", "options.chat.visibility.hidden" };
  
  protected Minecraft Dne = 1.0F;
  
  public boolean XHL;
  
  public ulE Qnq;
  
  public boolean Dne() {
    return (this.Dne < 2 && this.zGp != null);
  }
  
  public boolean Dne(ONk paramONk) {
    switch (fMx.Dne[paramONk.ordinal()]) {
      case 1:
        return this.Dne;
      case 2:
        return this.FWm;
      case 3:
        return this.bzF;
      case 4:
        return this.Qnq;
      case 5:
        return this.zGp;
      case 6:
        return this.DyG;
      case 7:
        return this.div;
      case 8:
        return this.IjH;
      case 9:
        return this.mrb;
      case 10:
        return this.XHL;
      case 11:
        return this.Zpi;
      case 12:
        return this.kGO;
      case 13:
        return this.qLR;
      case 14:
        return this.ATE;
    } 
    return false;
  }
  
  public void Dne() {
    try {
      if (!this.Dne.exists())
        return; 
      BufferedReader bufferedReader = new BufferedReader(new FileReader((File)this.Dne));
      String str = "";
      while ((str = bufferedReader.readLine()) != null) {
        try {
          String[] arrayOfString = str.split(":");
          if (arrayOfString[0].equals("music"))
            this.Dne = Dne(arrayOfString[1]); 
          if (arrayOfString[0].equals("sound"))
            this.FWm = Dne(arrayOfString[1]); 
          if (arrayOfString[0].equals("mouseSensitivity"))
            this.bzF = Dne(arrayOfString[1]); 
          if (arrayOfString[0].equals("fov"))
            this.XHL = Dne(arrayOfString[1]); 
          if (arrayOfString[0].equals("gamma"))
            this.Zpi = Dne(arrayOfString[1]); 
          if (arrayOfString[0].equals("invertYMouse"))
            this.Dne = arrayOfString[1].equals("true"); 
          if (arrayOfString[0].equals("viewDistance"))
            this.Dne = Integer.parseInt(arrayOfString[1]); 
          if (arrayOfString[0].equals("guiScale"))
            this.IjH = Integer.parseInt(arrayOfString[1]); 
          if (arrayOfString[0].equals("particles"))
            this.mrb = Integer.parseInt(arrayOfString[1]); 
          if (arrayOfString[0].equals("bobView"))
            this.FWm = arrayOfString[1].equals("true"); 
          if (arrayOfString[0].equals("anaglyph3d"))
            this.bzF = arrayOfString[1].equals("true"); 
          if (arrayOfString[0].equals("advancedOpengl"))
            this.Qnq = arrayOfString[1].equals("true"); 
          if (arrayOfString[0].equals("fpsLimit"))
            this.FWm = Integer.parseInt(arrayOfString[1]); 
          if (arrayOfString[0].equals("difficulty"))
            this.DyG = Integer.parseInt(arrayOfString[1]); 
          if (arrayOfString[0].equals("fancyGraphics"))
            this.aFZ = arrayOfString[1].equals("true"); 
          if (arrayOfString[0].equals("ao"))
            if (arrayOfString[1].equals("true")) {
              this.bzF = 2;
            } else if (arrayOfString[1].equals("false")) {
              this.bzF = false;
            } else {
              this.bzF = Integer.parseInt(arrayOfString[1]);
            }  
          if (arrayOfString[0].equals("clouds"))
            this.zGp = arrayOfString[1].equals("true"); 
          if (arrayOfString[0].equals("skin"))
            this.Dne = (Minecraft)arrayOfString[1]; 
          if (arrayOfString[0].equals("lastServer") && arrayOfString.length >= 2)
            this.FWm = (String[])arrayOfString[1]; 
          if (arrayOfString[0].equals("chatVisibility"))
            this.Qnq = Integer.parseInt(arrayOfString[1]); 
          if (arrayOfString[0].equals("chatColors"))
            this.DyG = arrayOfString[1].equals("true"); 
          if (arrayOfString[0].equals("chatLinks"))
            this.div = arrayOfString[1].equals("true"); 
          if (arrayOfString[0].equals("chatLinksPrompt"))
            this.IjH = arrayOfString[1].equals("true"); 
          if (arrayOfString[0].equals("chatOpacity"))
            this.Qnq = Dne(arrayOfString[1]); 
          if (arrayOfString[0].equals("serverTextures"))
            this.mrb = arrayOfString[1].equals("true"); 
          if (arrayOfString[0].equals("snooperEnabled"))
            this.XHL = arrayOfString[1].equals("true"); 
          if (arrayOfString[0].equals("fullscreen"))
            this.Zpi = arrayOfString[1].equals("true"); 
          if (arrayOfString[0].equals("enableVsync"))
            this.kGO = arrayOfString[1].equals("true"); 
          if (arrayOfString[0].equals("hideServerAddress"))
            this.udO = arrayOfString[1].equals("true"); 
          if (arrayOfString[0].equals("advancedItemTooltips"))
            this.ooe = arrayOfString[1].equals("true"); 
          if (arrayOfString[0].equals("pauseOnLostFocus"))
            this.trS = arrayOfString[1].equals("true"); 
          if (arrayOfString[0].equals("showCape"))
            this.qLR = arrayOfString[1].equals("true"); 
          if (arrayOfString[0].equals("touchscreen"))
            this.ATE = arrayOfString[1].equals("true"); 
          if (arrayOfString[0].equals("overrideHeight"))
            this.zGp = Integer.parseInt(arrayOfString[1]); 
          if (arrayOfString[0].equals("overrideWidth"))
            this.aFZ = Integer.parseInt(arrayOfString[1]); 
          if (arrayOfString[0].equals("heldItemTooltips"))
            this.Vxn = arrayOfString[1].equals("true"); 
          if (arrayOfString[0].equals("chatHeightFocused"))
            this.div = Dne(arrayOfString[1]); 
          if (arrayOfString[0].equals("chatHeightUnfocused"))
            this.DyG = Dne(arrayOfString[1]); 
          if (arrayOfString[0].equals("chatScale"))
            this.aFZ = Dne(arrayOfString[1]); 
          if (arrayOfString[0].equals("chatWidth"))
            this.zGp = Dne(arrayOfString[1]); 
          for (byte b = 0; b < this.Dne.length; b++) {
            if (arrayOfString[0].equals("key_" + ((ulE)this.Dne[b]).Dne))
              ((ulE)this.Dne[b]).Dne = Integer.parseInt(arrayOfString[1]); 
          } 
        } catch (Exception exception) {
          this.Dne.Dne().FWm("Skipping bad option: " + str);
        } 
      } 
      ulE.FWm();
      bufferedReader.close();
    } catch (Exception exception) {
      this.Dne.Dne().FWm("Failed to load options");
      exception.printStackTrace();
    } 
  }
  
  public void Dne(ONk paramONk, float paramFloat) {
    if (paramONk == ONk.Dne) {
      this.Dne = paramFloat;
      this.Dne.Dne.Dne();
    } 
    if (paramONk == ONk.FWm) {
      this.FWm = paramFloat;
      this.Dne.Dne.Dne();
    } 
    if (paramONk == ONk.Qnq)
      this.bzF = paramFloat; 
    if (paramONk == ONk.aFZ)
      this.XHL = paramFloat; 
    if (paramONk == ONk.zGp)
      this.Zpi = paramFloat; 
    if (paramONk == ONk.EyB) {
      this.Qnq = paramFloat;
      this.Dne.Dne.Dne().FWm();
    } 
    if (paramONk == ONk.AgF) {
      this.div = paramFloat;
      this.Dne.Dne.Dne().FWm();
    } 
    if (paramONk == ONk.yMz) {
      this.DyG = paramFloat;
      this.Dne.Dne.Dne().FWm();
    } 
    if (paramONk == ONk.qXo) {
      this.zGp = paramFloat;
      this.Dne.Dne.Dne().FWm();
    } 
    if (paramONk == ONk.tgc) {
      this.aFZ = paramFloat;
      this.Dne.Dne.Dne().FWm();
    } 
  }
  
  public fZI() {
    this.Dne = false;
    this.Dne = false;
    this.FWm = true;
    this.bzF = false;
    this.Qnq = false;
    this.FWm = true;
    this.aFZ = true;
    this.bzF = 2;
    this.zGp = true;
    this.Dne = (Minecraft)"Default";
    this.Qnq = false;
    this.DyG = true;
    this.div = true;
    this.IjH = true;
    this.Qnq = 1.0F;
    this.mrb = true;
    this.XHL = true;
    this.Zpi = false;
    this.kGO = true;
    this.udO = false;
    this.ooe = false;
    this.trS = true;
    this.qLR = true;
    this.ATE = false;
    this.aFZ = false;
    this.zGp = false;
    this.Vxn = true;
    this.aFZ = 1.0F;
    this.zGp = 1.0F;
    this.DyG = 0.44366196F;
    this.div = 1.0F;
    this.Dne = (Minecraft)new ulE("key.forward", 17);
    this.FWm = (String[])new ulE("key.left", 30);
    this.bzF = new ulE("key.back", 31);
    this.Qnq = new ulE("key.right", 32);
    this.aFZ = new ulE("key.jump", 57);
    this.zGp = (String[])new ulE("key.inventory", 18);
    this.DyG = new ulE("key.drop", 16);
    this.div = new ulE("key.chat", 20);
    this.IjH = new ulE("key.sneak", 42);
    this.mrb = new ulE("key.attack", -100);
    this.XHL = new ulE("key.use", -99);
    this.Zpi = new ulE("key.playerlist", 15);
    this.kGO = new ulE("key.pickItem", -98);
    this.udO = new ulE("key.command", 53);
    this.Dne = (Minecraft)new ulE[] { 
        this.mrb, this.XHL, (ulE)this.Dne, (ulE)this.FWm, this.bzF, this.Qnq, this.aFZ, this.IjH, this.DyG, (ulE)this.zGp, 
        this.div, this.Zpi, this.kGO, this.udO };
    this.DyG = 2;
    this.ceE = false;
    this.div = false;
    this.EyB = false;
    this.FfS = false;
    this.FWm = (String[])"";
    this.OdI = false;
    this.oIf = false;
    this.vSL = false;
    this.IjH = 1.0F;
    this.mrb = 1.0F;
    this.XHL = 0.0F;
    this.Zpi = 0.0F;
    this.IjH = false;
    this.mrb = false;
    this.bzF = (ulE)"en_US";
  }
  
  public static String bzF(int paramInt) {
    return (paramInt < 0) ? KGL.Dne("key.mouseButton", new Object[] { Integer.valueOf(paramInt + 101) }) : Keyboard.getKeyName(paramInt);
  }
  
  public String FWm(int paramInt) {
    ZGT zGT = ((ulE)this.Dne[paramInt]).Dne;
    return bzF(zGT);
  }
  
  public String Dne(int paramInt) {
    irb irb = irb.Dne();
    return irb.Dne((String)((ulE)this.Dne[paramInt]).Dne);
  }
  
  private static String Dne(String[] paramArrayOfString, int paramInt) {
    if (paramInt < 0 || paramInt >= paramArrayOfString.length)
      paramInt = 0; 
    irb irb = irb.Dne();
    return irb.Dne(paramArrayOfString[paramInt]);
  }
  
  private float Dne(String paramString) {
    return paramString.equals("true") ? 1.0F : (paramString.equals("false") ? 0.0F : Float.parseFloat(paramString));
  }
  
  public void Dne(ONk paramONk, int paramInt) {
    if (paramONk == ONk.bzF)
      this.Dne = (this.Dne == null) ? 1 : 0; 
    if (paramONk == ONk.DyG)
      this.Dne = this.Dne + paramInt & 0x3; 
    if (paramONk == ONk.ooe)
      this.IjH = this.IjH + paramInt & 0x3; 
    if (paramONk == ONk.qLR)
      this.mrb = (this.mrb + paramInt) % 3; 
    if (paramONk == ONk.div)
      this.FWm = (this.FWm == null) ? 1 : 0; 
    if (paramONk == ONk.trS)
      this.zGp = (this.zGp == null) ? 1 : 0; 
    if (paramONk == ONk.mrb) {
      this.Qnq = (this.Qnq == null) ? 1 : 0;
      this.Dne.Dne.Dne();
    } 
    if (paramONk == ONk.IjH) {
      this.bzF = (this.bzF == null) ? 1 : 0;
      this.Dne.Dne.bzF();
    } 
    if (paramONk == ONk.XHL)
      this.FWm = (this.FWm + paramInt + 3) % 3; 
    if (paramONk == ONk.Zpi)
      this.DyG = this.DyG + paramInt & 0x3; 
    if (paramONk == ONk.kGO) {
      this.aFZ = !this.aFZ;
      this.Dne.Dne.Dne();
    } 
    if (paramONk == ONk.udO) {
      this.bzF = (this.bzF + paramInt) % 3;
      this.Dne.Dne.Dne();
    } 
    if (paramONk == ONk.ATE)
      this.Qnq = (this.Qnq + paramInt) % 3; 
    if (paramONk == ONk.Vxn)
      this.DyG = (this.DyG == 0.0F) ? true : false; 
    if (paramONk == ONk.ceE)
      this.div = !this.div; 
    if (paramONk == ONk.FfS)
      this.IjH = (this.IjH == null) ? 1 : 0; 
    if (paramONk == ONk.OdI)
      this.mrb = !this.mrb; 
    if (paramONk == ONk.oIf)
      this.XHL = !this.XHL; 
    if (paramONk == ONk.Fnk)
      this.qLR = !this.qLR; 
    if (paramONk == ONk.gnI)
      this.ATE = !this.ATE; 
    if (paramONk == ONk.vSL) {
      this.Zpi = (this.Zpi == null) ? 1 : 0;
      if (this.Dne.div() != this.Zpi)
        this.Dne.div(); 
    } 
    if (paramONk == ONk.RPx) {
      this.kGO = !this.kGO;
      Display.setVSyncEnabled(this.kGO);
    } 
    FWm();
  }
  
  static {
    aFZ = new String[] { "options.particles.all", "options.particles.decreased", "options.particles.minimal" };
    zGp = new String[] { "performance.max", "performance.balanced", "performance.powersaver" };
    DyG = new String[] { "options.ao.off", "options.ao.min", "options.ao.max" };
  }
  
  public void FWm() {
    try {
      PrintWriter printWriter = new PrintWriter(new FileWriter((File)this.Dne));
      printWriter.println("music:" + this.Dne);
      printWriter.println("sound:" + this.FWm);
      printWriter.println("invertYMouse:" + this.Dne);
      printWriter.println("mouseSensitivity:" + this.bzF);
      printWriter.println("fov:" + this.XHL);
      printWriter.println("gamma:" + this.Zpi);
      printWriter.println("viewDistance:" + this.Dne);
      printWriter.println("guiScale:" + this.IjH);
      printWriter.println("particles:" + this.mrb);
      printWriter.println("bobView:" + this.FWm);
      printWriter.println("anaglyph3d:" + this.bzF);
      printWriter.println("advancedOpengl:" + this.Qnq);
      printWriter.println("fpsLimit:" + this.FWm);
      printWriter.println("difficulty:" + this.DyG);
      printWriter.println("fancyGraphics:" + this.aFZ);
      printWriter.println("ao:" + this.bzF);
      printWriter.println("clouds:" + this.zGp);
      printWriter.println("skin:" + this.Dne);
      printWriter.println("lastServer:" + this.FWm);
      printWriter.println("lang:" + this.bzF);
      printWriter.println("chatVisibility:" + this.Qnq);
      printWriter.println("chatColors:" + this.DyG);
      printWriter.println("chatLinks:" + this.div);
      printWriter.println("chatLinksPrompt:" + this.IjH);
      printWriter.println("chatOpacity:" + this.Qnq);
      printWriter.println("serverTextures:" + this.mrb);
      printWriter.println("snooperEnabled:" + this.XHL);
      printWriter.println("fullscreen:" + this.Zpi);
      printWriter.println("enableVsync:" + this.kGO);
      printWriter.println("hideServerAddress:" + this.udO);
      printWriter.println("advancedItemTooltips:" + this.ooe);
      printWriter.println("pauseOnLostFocus:" + this.trS);
      printWriter.println("showCape:" + this.qLR);
      printWriter.println("touchscreen:" + this.ATE);
      printWriter.println("overrideWidth:" + this.aFZ);
      printWriter.println("overrideHeight:" + this.zGp);
      printWriter.println("heldItemTooltips:" + this.Vxn);
      printWriter.println("chatHeightFocused:" + this.div);
      printWriter.println("chatHeightUnfocused:" + this.DyG);
      printWriter.println("chatScale:" + this.aFZ);
      printWriter.println("chatWidth:" + this.zGp);
      for (byte b = 0; b < this.Dne.length; b++)
        printWriter.println("key_" + ((ulE)this.Dne[b]).Dne + ":" + ((ulE)this.Dne[b]).Dne); 
      printWriter.close();
    } catch (Exception exception) {
      this.Dne.Dne().FWm("Failed to save options");
      exception.printStackTrace();
    } 
    bzF();
  }
  
  public static boolean Dne(ulE paramulE) {
    return (paramulE.Dne < null) ? Mouse.isButtonDown(paramulE.Dne + 100) : Keyboard.isKeyDown(paramulE.Dne);
  }
  
  public void Dne(int paramInt1, int paramInt2) {
    ((ulE)this.Dne[paramInt1]).Dne = paramInt2;
    FWm();
  }
  
  public String Dne(ONk paramONk) {
    irb irb = irb.Dne();
    String str = irb.Dne(paramONk.Dne()) + ": ";
    if (paramONk.Dne()) {
      float f = Dne(paramONk);
      return (paramONk == ONk.Qnq) ? ((f == 0.0F) ? (str + irb.Dne("options.sensitivity.min")) : ((f == 1.0F) ? (str + irb.Dne("options.sensitivity.max")) : (str + (int)(f * 200.0F) + "%"))) : ((paramONk == ONk.aFZ) ? ((f == 0.0F) ? (str + irb.Dne("options.fov.min")) : ((f == 1.0F) ? (str + irb.Dne("options.fov.max")) : (str + (int)(70.0F + f * 40.0F)))) : ((paramONk == ONk.zGp) ? ((f == 0.0F) ? (str + irb.Dne("options.gamma.min")) : ((f == 1.0F) ? (str + irb.Dne("options.gamma.max")) : (str + "+" + (int)(f * 100.0F) + "%"))) : ((paramONk == ONk.EyB) ? (str + (int)(f * 90.0F + 10.0F) + "%") : ((paramONk == ONk.yMz) ? (str + muJ.FWm(f) + "px") : ((paramONk == ONk.AgF) ? (str + muJ.FWm(f) + "px") : ((paramONk == ONk.qXo) ? (str + muJ.Dne(f) + "px") : ((f == 0.0F) ? (str + irb.Dne("options.off")) : (str + (int)(f * 100.0F) + "%"))))))));
    } 
    if (paramONk.FWm()) {
      boolean bool = Dne(paramONk);
      return bool ? (str + irb.Dne("options.on")) : (str + irb.Dne("options.off"));
    } 
    return (paramONk == ONk.DyG) ? (str + Dne((String[])Dne, this.Dne)) : ((paramONk == ONk.Zpi) ? (str + Dne(FWm, this.DyG)) : ((paramONk == ONk.ooe) ? (str + Dne((String[])bzF, this.IjH)) : ((paramONk == ONk.ATE) ? (str + Dne((String[])Qnq, this.Qnq)) : ((paramONk == ONk.qLR) ? (str + Dne(aFZ, this.mrb)) : ((paramONk == ONk.XHL) ? (str + Dne(zGp, this.FWm)) : ((paramONk == ONk.udO) ? (str + Dne(DyG, this.bzF)) : ((paramONk == ONk.kGO) ? (this.aFZ ? (str + irb.Dne("options.graphics.fancy")) : (str + irb.Dne("options.graphics.fast"))) : str)))))));
  }
  
  public fZI(Minecraft paramMinecraft, File paramFile) {
    this.Dne = false;
    this.Dne = false;
    this.FWm = true;
    this.bzF = false;
    this.Qnq = false;
    this.FWm = true;
    this.aFZ = true;
    this.bzF = 2;
    this.zGp = true;
    this.Dne = (Minecraft)"Default";
    this.Qnq = false;
    this.DyG = true;
    this.div = true;
    this.IjH = true;
    this.Qnq = 1.0F;
    this.mrb = true;
    this.XHL = true;
    this.Zpi = false;
    this.kGO = true;
    this.udO = false;
    this.ooe = false;
    this.trS = true;
    this.qLR = true;
    this.ATE = false;
    this.aFZ = false;
    this.zGp = false;
    this.Vxn = true;
    this.aFZ = 1.0F;
    this.zGp = 1.0F;
    this.DyG = 0.44366196F;
    this.div = 1.0F;
    this.Dne = (Minecraft)new ulE("key.forward", 17);
    this.FWm = (String[])new ulE("key.left", 30);
    this.bzF = new ulE("key.back", 31);
    this.Qnq = new ulE("key.right", 32);
    this.aFZ = new ulE("key.jump", 57);
    this.zGp = (String[])new ulE("key.inventory", 18);
    this.DyG = new ulE("key.drop", 16);
    this.div = new ulE("key.chat", 20);
    this.IjH = new ulE("key.sneak", 42);
    this.mrb = new ulE("key.attack", -100);
    this.XHL = new ulE("key.use", -99);
    this.Zpi = new ulE("key.playerlist", 15);
    this.kGO = new ulE("key.pickItem", -98);
    this.udO = new ulE("key.command", 53);
    this.Dne = (Minecraft)new ulE[] { 
        this.mrb, this.XHL, (ulE)this.Dne, (ulE)this.FWm, this.bzF, this.Qnq, this.aFZ, this.IjH, this.DyG, (ulE)this.zGp, 
        this.div, this.Zpi, this.kGO, this.udO };
    this.DyG = 2;
    this.ceE = false;
    this.div = false;
    this.EyB = false;
    this.FfS = false;
    this.FWm = (String[])"";
    this.OdI = false;
    this.oIf = false;
    this.vSL = false;
    this.IjH = 1.0F;
    this.mrb = 1.0F;
    this.XHL = 0.0F;
    this.Zpi = 0.0F;
    this.IjH = false;
    this.mrb = false;
    this.bzF = (ulE)"en_US";
    this.Dne = paramMinecraft;
    this.Dne = (Minecraft)new File(paramFile, "options.txt");
    Dne();
  }
  
  public void bzF() {
    if (this.Dne.Dne != null)
      ((MJs)this.Dne.Dne).Dne.FWm(new yUQ((String)this.bzF, this.Dne, this.Qnq, this.DyG, this.DyG, this.qLR)); 
  }
  
  public float Dne(ONk paramONk) {
    return (paramONk == ONk.aFZ) ? this.XHL : ((paramONk == ONk.zGp) ? this.Zpi : ((paramONk == ONk.Dne) ? this.Dne : ((paramONk == ONk.FWm) ? this.FWm : ((paramONk == ONk.Qnq) ? this.bzF : ((paramONk == ONk.EyB) ? this.Qnq : ((paramONk == ONk.AgF) ? this.div : ((paramONk == ONk.yMz) ? this.DyG : ((paramONk == ONk.tgc) ? this.aFZ : ((paramONk == ONk.qXo) ? this.zGp : 0.0F)))))))));
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\fZI.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */