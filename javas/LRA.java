import java.util.List;

public class LRA extends zKP {
  private final String Dne;
  
  public boolean Dne(Zpi paramZpi, int paramInt1, int paramInt2, int paramInt3) {
    return false;
  }
  
  public LRA(int paramInt, String paramString, KFd paramKFd) {
    super(paramInt, paramKFd);
    this.Dne = paramString;
    Dne(JcN.FWm);
  }
  
  public boolean Dne() {
    return false;
  }
  
  public static boolean Dne(int paramInt) {
    return (paramInt == zKP.sly.FWm || paramInt == zKP.TpV.FWm);
  }
  
  public void Dne(Rbp paramRbp) {
    this.Qnq = paramRbp.Dne(this.Dne);
  }
  
  public boolean Dne(Zpi paramZpi, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    return true;
  }
  
  public void Dne(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3, bSp parambSp, List paramList, sMa paramsMa) {
    boolean bool1 = FWm(paramQnq, paramInt1, paramInt2, paramInt3 - 1);
    boolean bool2 = FWm(paramQnq, paramInt1, paramInt2, paramInt3 + 1);
    boolean bool3 = FWm(paramQnq, paramInt1 - 1, paramInt2, paramInt3);
    boolean bool4 = FWm(paramQnq, paramInt1 + 1, paramInt2, paramInt3);
    float f1 = 0.375F;
    float f2 = 0.625F;
    float f3 = 0.375F;
    float f4 = 0.625F;
    if (bool1)
      f3 = 0.0F; 
    if (bool2)
      f4 = 1.0F; 
    if (bool1 || bool2) {
      Dne(f1, 0.0F, f3, f2, 1.5F, f4);
      super.Dne(paramQnq, paramInt1, paramInt2, paramInt3, parambSp, paramList, paramsMa);
    } 
    f3 = 0.375F;
    f4 = 0.625F;
    if (bool3)
      f1 = 0.0F; 
    if (bool4)
      f2 = 1.0F; 
    if (bool3 || bool4 || (!bool1 && !bool2)) {
      Dne(f1, 0.0F, f3, f2, 1.5F, f4);
      super.Dne(paramQnq, paramInt1, paramInt2, paramInt3, parambSp, paramList, paramsMa);
    } 
    if (bool1)
      f3 = 0.0F; 
    if (bool2)
      f4 = 1.0F; 
    Dne(f1, 0.0F, f3, f2, 1.0F, f4);
  }
  
  public boolean FWm(Zpi paramZpi, int paramInt1, int paramInt2, int paramInt3) {
    int i = paramZpi.Dne(paramInt1, paramInt2, paramInt3);
    if (i != this.FWm && i != zKP.mzX.FWm) {
      dNT dNT = zKP.Dne[i];
      return (dNT != null && dNT.Dne.DyG() && dNT.Dne()) ? ((dNT.Dne != KFd.Fnk)) : false;
    } 
    return true;
  }
  
  public boolean FWm() {
    return false;
  }
  
  public void Dne(Zpi paramZpi, int paramInt1, int paramInt2, int paramInt3) {
    boolean bool1 = FWm(paramZpi, paramInt1, paramInt2, paramInt3 - 1);
    boolean bool2 = FWm(paramZpi, paramInt1, paramInt2, paramInt3 + 1);
    boolean bool3 = FWm(paramZpi, paramInt1 - 1, paramInt2, paramInt3);
    boolean bool4 = FWm(paramZpi, paramInt1 + 1, paramInt2, paramInt3);
    float f1 = 0.375F;
    float f2 = 0.625F;
    float f3 = 0.375F;
    float f4 = 0.625F;
    if (bool1)
      f3 = 0.0F; 
    if (bool2)
      f4 = 1.0F; 
    if (bool3)
      f1 = 0.0F; 
    if (bool4)
      f2 = 1.0F; 
    Dne(f1, 0.0F, f3, f2, 1.0F, f4);
  }
  
  public int Dne() {
    return 11;
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\LRA.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */