import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.util.List;
import net.minecraft.client.Minecraft;
import org.lwjgl.Sys;

public class SbO extends qVZ {
  private int Dne;
  
  private fZI Dne;
  
  protected qVZ Dne;
  
  private XIv Dne;
  
  private String Dne = -1;
  
  static Minecraft DyG(SbO paramSbO) {
    return (Minecraft)paramSbO.Dne;
  }
  
  protected void Dne(Pee paramPee) {
    if (paramPee.Dne != null)
      if (paramPee.aFZ == 5) {
        if (Minecraft.Dne() == ZPT.Qnq) {
          try {
            this.Dne.Dne().Dne(this.Dne);
            Runtime.getRuntime().exec(new String[] { "/usr/bin/open", this.Dne });
            return;
          } catch (IOException iOException) {
            iOException.printStackTrace();
          } 
        } else if (Minecraft.Dne() == ZPT.bzF) {
          String str = String.format("cmd.exe /C start \"Open file\" \"%s\"", new Object[] { this.Dne });
          try {
            Runtime.getRuntime().exec(str);
            return;
          } catch (IOException iOException) {
            iOException.printStackTrace();
          } 
        } 
        boolean bool = false;
        try {
          Class<?> clazz = Class.forName("java.awt.Desktop");
          Object object = clazz.getMethod("getDesktop", new Class[0]).invoke(null, new Object[0]);
          clazz.getMethod("browse", new Class[] { URI.class }).invoke(object, new Object[] { (new File(Minecraft.Dne(), "texturepacks")).toURI() });
        } catch (Throwable throwable) {
          throwable.printStackTrace();
          bool = true;
        } 
        if (bool) {
          this.Dne.Dne().Dne("Opening via system class!");
          Sys.openURL("file://" + this.Dne);
        } 
      } else if (paramPee.aFZ == 6) {
        this.Dne.Dne((qVZ)this.Dne);
      } else {
        this.Dne.Dne(paramPee);
      }  
  }
  
  protected void Dne(int paramInt1, int paramInt2, int paramInt3) {
    super.Dne(paramInt1, paramInt2, paramInt3);
  }
  
  static Minecraft zGp(SbO paramSbO) {
    return (Minecraft)paramSbO.Dne;
  }
  
  static Minecraft FWm(SbO paramSbO) {
    return (Minecraft)paramSbO.Dne;
  }
  
  static msA bzF(SbO paramSbO) {
    return (msA)paramSbO.Dne;
  }
  
  public void bzF() {
    super.bzF();
    this.Dne--;
  }
  
  static Minecraft Dne(SbO paramSbO) {
    return (Minecraft)paramSbO.Dne;
  }
  
  static Minecraft Qnq(SbO paramSbO) {
    return (Minecraft)paramSbO.Dne;
  }
  
  static Minecraft div(SbO paramSbO) {
    return (Minecraft)paramSbO.Dne;
  }
  
  static Minecraft kGO(SbO paramSbO) {
    return (Minecraft)paramSbO.Dne;
  }
  
  static Minecraft bzF(SbO paramSbO) {
    return (Minecraft)paramSbO.Dne;
  }
  
  static Minecraft mrb(SbO paramSbO) {
    return (Minecraft)paramSbO.Dne;
  }
  
  static Minecraft aFZ(SbO paramSbO) {
    return (Minecraft)paramSbO.Dne;
  }
  
  public void Dne() {
    irb irb = irb.Dne();
    this.Dne.add(new Cpw(5, this.FWm / 2 - 154, this.bzF - 48, irb.Dne("texturePack.openFolder")));
    this.Dne.add(new Cpw(6, this.FWm / 2 + 4, this.bzF - 48, irb.Dne("gui.done")));
    ((Minecraft)this.Dne).Dne.FWm();
    this.Dne = (new File(Minecraft.Dne(), "texturepacks")).getAbsolutePath();
    this.Dne = (String)new XIv(this);
    this.Dne.Dne((List)this.Dne, 7, 8);
  }
  
  static msA Dne(SbO paramSbO) {
    return (msA)paramSbO.Dne;
  }
  
  static msA FWm(SbO paramSbO) {
    return (msA)paramSbO.Dne;
  }
  
  static Minecraft IjH(SbO paramSbO) {
    return (Minecraft)paramSbO.Dne;
  }
  
  static Minecraft Zpi(SbO paramSbO) {
    return (Minecraft)paramSbO.Dne;
  }
  
  public SbO(qVZ paramqVZ, fZI paramfZI) {
    this.Dne = "";
    this.Dne = (String)paramqVZ;
    this.Dne = (String)paramfZI;
  }
  
  protected void FWm(int paramInt1, int paramInt2, int paramInt3) {
    super.FWm(paramInt1, paramInt2, paramInt3);
  }
  
  public void Dne(int paramInt1, int paramInt2, float paramFloat) {
    this.Dne.Dne(paramInt1, paramInt2, paramFloat);
    if (this.Dne <= null) {
      ((Minecraft)this.Dne).Dne.FWm();
      this.Dne += 20;
    } 
    irb irb = irb.Dne();
    Dne((msA)this.Dne, irb.Dne("texturePack.title"), this.FWm / 2, 16, 16777215);
    Dne((msA)this.Dne, irb.Dne("texturePack.folderInfo"), this.FWm / 2 - 77, this.bzF - 26, 8421504);
    super.Dne(paramInt1, paramInt2, paramFloat);
  }
  
  static Minecraft XHL(SbO paramSbO) {
    return (Minecraft)paramSbO.Dne;
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\SbO.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */