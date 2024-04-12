import java.util.Random;

public abstract class Oaf extends zKP {
  protected final boolean Dne;
  
  public int FWm() {
    return 0;
  }
  
  public int Dne() {
    return 9;
  }
  
  public boolean Qnq() {
    return this.Dne;
  }
  
  public wHH Dne(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3, chN paramchN1, chN paramchN2) {
    Dne(paramQnq, paramInt1, paramInt2, paramInt3);
    return super.Dne(paramQnq, paramInt1, paramInt2, paramInt3, paramchN1, paramchN2);
  }
  
  public static final boolean Dne(int paramInt) {
    return (paramInt == zKP.FYZ.FWm || paramInt == zKP.OdI.FWm || paramInt == zKP.oIf.FWm || paramInt == zKP.Dsg.FWm);
  }
  
  public void Dne(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3) {
    if (paramQnq.aFZ == null) {
      Dne(paramQnq, paramInt1, paramInt2, paramInt3, true);
      if (this.Dne)
        Dne(paramQnq, paramInt1, paramInt2, paramInt3, this.FWm); 
    } 
  }
  
  public bSp Dne(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3) {
    return null;
  }
  
  public void Dne(Zpi paramZpi, int paramInt1, int paramInt2, int paramInt3) {
    int i = paramZpi.bzF(paramInt1, paramInt2, paramInt3);
    if (i >= 2 && i <= 5) {
      Dne(0.0F, 0.0F, 0.0F, 1.0F, 0.625F, 1.0F);
    } else {
      Dne(0.0F, 0.0F, 0.0F, 1.0F, 0.125F, 1.0F);
    } 
  }
  
  public int Dne(Random paramRandom) {
    return 1;
  }
  
  protected void Dne(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6) {}
  
  public boolean Dne(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3) {
    return paramQnq.IjH(paramInt1, paramInt2 - 1, paramInt3);
  }
  
  protected void Dne(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean) {
    if (paramQnq.aFZ == null)
      (new rKp(this, paramQnq, paramInt1, paramInt2, paramInt3)).Dne(paramQnq.kGO(paramInt1, paramInt2, paramInt3), paramBoolean); 
  }
  
  protected Oaf(int paramInt, boolean paramBoolean) {
    super(paramInt, KFd.qLR);
    this.Dne = paramBoolean;
    Dne(0.0F, 0.0F, 0.0F, 1.0F, 0.125F, 1.0F);
    Dne(JcN.Qnq);
  }
  
  public boolean FWm() {
    return false;
  }
  
  public void Dne(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    if (paramQnq.aFZ == null) {
      int i = paramQnq.bzF(paramInt1, paramInt2, paramInt3);
      int j = i;
      if (this.Dne)
        j = i & 0x7; 
      boolean bool = false;
      if (!paramQnq.IjH(paramInt1, paramInt2 - 1, paramInt3))
        bool = true; 
      if (j == 2 && !paramQnq.IjH(paramInt1 + 1, paramInt2, paramInt3))
        bool = true; 
      if (j == 3 && !paramQnq.IjH(paramInt1 - 1, paramInt2, paramInt3))
        bool = true; 
      if (j == 4 && !paramQnq.IjH(paramInt1, paramInt2, paramInt3 - 1))
        bool = true; 
      if (j == 5 && !paramQnq.IjH(paramInt1, paramInt2, paramInt3 + 1))
        bool = true; 
      if (bool) {
        FWm(paramQnq, paramInt1, paramInt2, paramInt3, paramQnq.bzF(paramInt1, paramInt2, paramInt3), 0);
        paramQnq.Qnq(paramInt1, paramInt2, paramInt3);
      } else {
        Dne(paramQnq, paramInt1, paramInt2, paramInt3, i, j, paramInt4);
      } 
    } 
  }
  
  public boolean Dne() {
    return false;
  }
  
  public static final boolean FWm(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3) {
    return Dne(paramQnq.Dne(paramInt1, paramInt2, paramInt3));
  }
  
  public void Dne(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5) {
    int i = paramInt5;
    if (this.Dne)
      i = paramInt5 & 0x7; 
    super.Dne(paramQnq, paramInt1, paramInt2, paramInt3, paramInt4, paramInt5);
    if (i == 2 || i == 3 || i == 4 || i == 5)
      paramQnq.bzF(paramInt1, paramInt2 + 1, paramInt3, paramInt4); 
    if (this.Dne) {
      paramQnq.bzF(paramInt1, paramInt2, paramInt3, paramInt4);
      paramQnq.bzF(paramInt1, paramInt2 - 1, paramInt3, paramInt4);
    } 
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\Oaf.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */