import java.util.Random;

public class YHc extends ljW {
  public int Dne() {
    return 22;
  }
  
  protected boolean aFZ() {
    return true;
  }
  
  protected YHc(int paramInt) {
    super(paramInt, KFd.aFZ);
    Dne(JcN.FWm);
    Dne(0.0625F, 0.0F, 0.0625F, 0.9375F, 0.875F, 0.9375F);
  }
  
  public void FWm(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3, Random paramRandom) {
    for (byte b = 0; b < 3; b++) {
      double d1 = (paramInt1 + paramRandom.nextFloat());
      double d2 = (paramInt2 + paramRandom.nextFloat());
      d1 = (paramInt3 + paramRandom.nextFloat());
      double d3 = 0.0D;
      double d4 = 0.0D;
      double d5 = 0.0D;
      int i = paramRandom.nextInt(2) * 2 - 1;
      int j = paramRandom.nextInt(2) * 2 - 1;
      d3 = (paramRandom.nextFloat() - 0.5D) * 0.125D;
      d4 = (paramRandom.nextFloat() - 0.5D) * 0.125D;
      d5 = (paramRandom.nextFloat() - 0.5D) * 0.125D;
      double d6 = paramInt3 + 0.5D + 0.25D * j;
      d5 = (paramRandom.nextFloat() * 1.0F * j);
      double d7 = paramInt1 + 0.5D + 0.25D * i;
      d3 = (paramRandom.nextFloat() * 1.0F * i);
      paramQnq.Dne("portal", d7, d2, d6, d3, d4, d5);
    } 
  }
  
  public void Dne(Rbp paramRbp) {
    this.Qnq = paramRbp.Dne("obsidian");
  }
  
  public boolean FWm() {
    return false;
  }
  
  public ipD Dne(Qnq paramQnq) {
    return new RPI();
  }
  
  static {
  
  }
  
  public int Dne(Random paramRandom) {
    return 8;
  }
  
  public int Dne(int paramInt1, Random paramRandom, int paramInt2) {
    return zKP.cot.FWm;
  }
  
  public boolean Dne() {
    return false;
  }
  
  public void Dne(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3, FUH paramFUH, NMq paramNMq) {
    byte b = 0;
    int i = geR.FWm((paramFUH.mrb * 4.0F / 360.0F) + 0.5D) & 0x3;
    if (i == 0)
      b = 2; 
    if (i == 1)
      b = 5; 
    if (i == 2)
      b = 3; 
    if (i == 3)
      b = 4; 
    paramQnq.Dne(paramInt1, paramInt2, paramInt3, b, 2);
  }
  
  public boolean Dne(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3, FiG paramFiG, int paramInt4, float paramFloat1, float paramFloat2, float paramFloat3) {
    fTB fTB = paramFiG.Dne();
    RPI rPI = (RPI)paramQnq.Dne(paramInt1, paramInt2, paramInt3);
    if (fTB != null && rPI != null) {
      if (paramQnq.DyG(paramInt1, paramInt2 + 1, paramInt3))
        return true; 
      if (paramQnq.aFZ != null)
        return true; 
      fTB.Dne(rPI);
      paramFiG.Dne(fTB);
      return true;
    } 
    return true;
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\YHc.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */