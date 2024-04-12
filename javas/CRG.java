import java.util.List;
import java.util.Random;

public class CRG extends zKP {
  private final String FWm;
  
  private final String Dne;
  
  private final boolean Dne;
  
  private gDn Dne;
  
  public gDn Dne() {
    return this.Dne;
  }
  
  protected CRG(int paramInt, String paramString1, String paramString2, KFd paramKFd, boolean paramBoolean) {
    super(paramInt, paramKFd);
    this.Dne = (gDn)paramString2;
    this.Dne = paramBoolean;
    this.FWm = paramString1;
    Dne(JcN.FWm);
  }
  
  public boolean Dne(Zpi paramZpi, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    int i = paramZpi.Dne(paramInt1, paramInt2, paramInt3);
    return (i == this.FWm) ? false : super.Dne(paramZpi, paramInt1, paramInt2, paramInt3, paramInt4);
  }
  
  public void Dne(Zpi paramZpi, int paramInt1, int paramInt2, int paramInt3) {
    float f1 = 0.4375F;
    float f2 = 0.5625F;
    float f3 = 0.4375F;
    float f4 = 0.5625F;
    boolean bool1 = Dne(paramZpi.Dne(paramInt1, paramInt2, paramInt3 - 1));
    boolean bool2 = Dne(paramZpi.Dne(paramInt1, paramInt2, paramInt3 + 1));
    boolean bool3 = Dne(paramZpi.Dne(paramInt1 - 1, paramInt2, paramInt3));
    boolean bool4 = Dne(paramZpi.Dne(paramInt1 + 1, paramInt2, paramInt3));
    if ((!bool3 || !bool4) && (bool3 || bool4 || bool1 || bool2)) {
      if (bool3 && !bool4) {
        f1 = 0.0F;
      } else if (!bool3 && bool4) {
        f2 = 1.0F;
      } 
    } else {
      f1 = 0.0F;
      f2 = 1.0F;
    } 
    if ((!bool1 || !bool2) && (bool3 || bool4 || bool1 || bool2)) {
      if (bool1 && !bool2) {
        f3 = 0.0F;
      } else if (!bool1 && bool2) {
        f4 = 1.0F;
      } 
    } else {
      f3 = 0.0F;
      f4 = 1.0F;
    } 
    Dne(f1, 0.0F, f3, f2, 1.0F, f4);
  }
  
  public final boolean Dne(int paramInt) {
    return (zKP.FWm[paramInt] != null || paramInt == this.FWm || paramInt == zKP.trS.FWm);
  }
  
  public int Dne() {
    return 18;
  }
  
  protected boolean aFZ() {
    return true;
  }
  
  public void Dne() {
    Dne(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
  }
  
  public void Dne(Rbp paramRbp) {
    this.Qnq = paramRbp.Dne(this.FWm);
    this.Dne = paramRbp.Dne((String)this.Dne);
  }
  
  public boolean FWm() {
    return false;
  }
  
  protected NMq Dne(int paramInt) {
    return new NMq(this.FWm, 1, paramInt);
  }
  
  public void Dne(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3, bSp parambSp, List paramList, sMa paramsMa) {
    boolean bool1 = Dne(paramQnq.Dne(paramInt1, paramInt2, paramInt3 - 1));
    boolean bool2 = Dne(paramQnq.Dne(paramInt1, paramInt2, paramInt3 + 1));
    boolean bool3 = Dne(paramQnq.Dne(paramInt1 - 1, paramInt2, paramInt3));
    boolean bool4 = Dne(paramQnq.Dne(paramInt1 + 1, paramInt2, paramInt3));
    if ((!bool3 || !bool4) && (bool3 || bool4 || bool1 || bool2)) {
      if (bool3 && !bool4) {
        Dne(0.0F, 0.0F, 0.4375F, 0.5F, 1.0F, 0.5625F);
        super.Dne(paramQnq, paramInt1, paramInt2, paramInt3, parambSp, paramList, paramsMa);
      } else if (!bool3 && bool4) {
        Dne(0.5F, 0.0F, 0.4375F, 1.0F, 1.0F, 0.5625F);
        super.Dne(paramQnq, paramInt1, paramInt2, paramInt3, parambSp, paramList, paramsMa);
      } 
    } else {
      Dne(0.0F, 0.0F, 0.4375F, 1.0F, 1.0F, 0.5625F);
      super.Dne(paramQnq, paramInt1, paramInt2, paramInt3, parambSp, paramList, paramsMa);
    } 
    if ((!bool1 || !bool2) && (bool3 || bool4 || bool1 || bool2)) {
      if (bool1 && !bool2) {
        Dne(0.4375F, 0.0F, 0.0F, 0.5625F, 1.0F, 0.5F);
        super.Dne(paramQnq, paramInt1, paramInt2, paramInt3, parambSp, paramList, paramsMa);
      } else if (!bool1 && bool2) {
        Dne(0.4375F, 0.0F, 0.5F, 0.5625F, 1.0F, 1.0F);
        super.Dne(paramQnq, paramInt1, paramInt2, paramInt3, parambSp, paramList, paramsMa);
      } 
    } else {
      Dne(0.4375F, 0.0F, 0.0F, 0.5625F, 1.0F, 1.0F);
      super.Dne(paramQnq, paramInt1, paramInt2, paramInt3, parambSp, paramList, paramsMa);
    } 
  }
  
  public boolean Dne() {
    return false;
  }
  
  public int Dne(int paramInt1, Random paramRandom, int paramInt2) {
    return (this.Dne == null) ? 0 : super.Dne(paramInt1, paramRandom, paramInt2);
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\CRG.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */