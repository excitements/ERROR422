import java.util.Random;

public class vOA extends ljW {
  private Class Dne;
  
  private boolean Dne;
  
  public boolean Dne() {
    return false;
  }
  
  public bSp Dne(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3) {
    return null;
  }
  
  public gDn Dne(int paramInt1, int paramInt2) {
    return zKP.Qnq.FWm(paramInt1);
  }
  
  public boolean Dne(Zpi paramZpi, int paramInt1, int paramInt2, int paramInt3) {
    return true;
  }
  
  public void Dne(Rbp paramRbp) {}
  
  public ipD Dne(Qnq paramQnq) {
    // Byte code:
    //   0: aload_0
    //   1: getfield Dne : Ljava/lang/Class;
    //   4: invokevirtual newInstance : ()Ljava/lang/Object;
    //   7: checkcast ipD
    //   10: areturn
    //   11: astore_2
    //   12: new java/lang/RuntimeException
    //   15: dup
    //   16: aload_2
    //   17: invokespecial <init> : (Ljava/lang/Throwable;)V
    //   20: athrow
    // Exception table:
    //   from	to	target	type
    //   0	10	11	java/lang/Exception
  }
  
  public int Dne(int paramInt1, Random paramRandom, int paramInt2) {
    return dEr.FYZ.Qnq;
  }
  
  public bSp FWm(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3) {
    Dne(paramQnq, paramInt1, paramInt2, paramInt3);
    return super.FWm(paramQnq, paramInt1, paramInt2, paramInt3);
  }
  
  public boolean FWm() {
    return false;
  }
  
  public int Dne() {
    return -1;
  }
  
  public void Dne(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    boolean bool = false;
    if (this.Dne) {
      if (!paramQnq.Dne(paramInt1, paramInt2 - 1, paramInt3).Dne())
        bool = true; 
    } else {
      int i = paramQnq.bzF(paramInt1, paramInt2, paramInt3);
      bool = true;
      if (i == 2 && paramQnq.Dne(paramInt1, paramInt2, paramInt3 + 1).Dne())
        bool = false; 
      if (i == 3 && paramQnq.Dne(paramInt1, paramInt2, paramInt3 - 1).Dne())
        bool = false; 
      if (i == 4 && paramQnq.Dne(paramInt1 + 1, paramInt2, paramInt3).Dne())
        bool = false; 
      if (i == 5 && paramQnq.Dne(paramInt1 - 1, paramInt2, paramInt3).Dne())
        bool = false; 
    } 
    if (bool) {
      FWm(paramQnq, paramInt1, paramInt2, paramInt3, paramQnq.bzF(paramInt1, paramInt2, paramInt3), 0);
      paramQnq.Qnq(paramInt1, paramInt2, paramInt3);
    } 
    super.Dne(paramQnq, paramInt1, paramInt2, paramInt3, paramInt4);
  }
  
  public int Dne(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3) {
    return dEr.FYZ.Qnq;
  }
  
  public void Dne(Zpi paramZpi, int paramInt1, int paramInt2, int paramInt3) {
    if (!this.Dne) {
      int i = paramZpi.bzF(paramInt1, paramInt2, paramInt3);
      float f1 = 0.28125F;
      float f2 = 0.78125F;
      float f3 = 0.0F;
      float f4 = 1.0F;
      float f5 = 0.125F;
      Dne(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
      if (i == 2)
        Dne(f3, f1, 1.0F - f5, f4, f2, 1.0F); 
      if (i == 3)
        Dne(f3, f1, 0.0F, f4, f2, f5); 
      if (i == 4)
        Dne(1.0F - f5, f1, f3, 1.0F, f2, f4); 
      if (i == 5)
        Dne(0.0F, f1, f3, f5, f2, f4); 
    } 
  }
  
  protected vOA(int paramInt, Class paramClass, boolean paramBoolean) {
    super(paramInt, KFd.Qnq);
    this.Dne = paramBoolean;
    this.Dne = paramClass;
    float f1 = 0.25F;
    float f2 = 1.0F;
    Dne(0.5F - f1, 0.0F, 0.5F - f1, 0.5F + f1, f2, 0.5F + f1);
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\vOA.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */