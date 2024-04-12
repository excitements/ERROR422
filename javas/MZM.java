import java.util.List;

public class MZM extends zKP {
  public static final String[] Dne = new String[] { "normal", "mossy" };
  
  public boolean Dne(Zpi paramZpi, int paramInt1, int paramInt2, int paramInt3) {
    return false;
  }
  
  public bSp Dne(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3) {
    Dne(paramQnq, paramInt1, paramInt2, paramInt3);
    this.aFZ = 1.5D;
    return super.Dne(paramQnq, paramInt1, paramInt2, paramInt3);
  }
  
  public gDn Dne(int paramInt1, int paramInt2) {
    // Byte code:
    //   0: iload_2
    //   1: iconst_1
    //   2: if_icmpne -> 15
    //   5: getstatic zKP.yMz : LzKP;
    //   8: iload_1
    //   9: invokevirtual FWm : (I)LgDn;
    //   12: goto -> 22
    //   15: getstatic zKP.bzF : LzKP;
    //   18: iload_1
    //   19: invokevirtual FWm : (I)LgDn;
    //   22: areturn
  }
  
  public MZM(int paramInt, zKP paramzKP) {
    super(paramInt, (KFd)paramzKP.Dne);
    bzF(paramzKP.Dne);
    FWm(paramzKP.FWm / 3.0F);
    Dne((PsW)paramzKP.kGO);
    Dne(JcN.Dne);
  }
  
  public boolean Dne(Zpi paramZpi, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    return (paramInt4 == 0) ? super.Dne(paramZpi, paramInt1, paramInt2, paramInt3, paramInt4) : true;
  }
  
  public void Dne(Rbp paramRbp) {}
  
  public int Dne() {
    return 32;
  }
  
  public boolean FWm(Zpi paramZpi, int paramInt1, int paramInt2, int paramInt3) {
    int i = paramZpi.Dne(paramInt1, paramInt2, paramInt3);
    if (i != this.FWm && i != zKP.mzX.FWm) {
      dNT dNT = zKP.Dne[i];
      return (dNT != null && dNT.Dne.DyG() && dNT.Dne()) ? ((dNT.Dne != KFd.Fnk)) : false;
    } 
    return true;
  }
  
  public void Dne(Zpi paramZpi, int paramInt1, int paramInt2, int paramInt3) {
    boolean bool1 = FWm(paramZpi, paramInt1, paramInt2, paramInt3 - 1);
    boolean bool2 = FWm(paramZpi, paramInt1, paramInt2, paramInt3 + 1);
    boolean bool3 = FWm(paramZpi, paramInt1 - 1, paramInt2, paramInt3);
    boolean bool4 = FWm(paramZpi, paramInt1 + 1, paramInt2, paramInt3);
    float f1 = 0.25F;
    float f2 = 0.75F;
    float f3 = 0.25F;
    float f4 = 0.75F;
    float f5 = 1.0F;
    if (bool1)
      f3 = 0.0F; 
    if (bool2)
      f4 = 1.0F; 
    if (bool3)
      f1 = 0.0F; 
    if (bool4)
      f2 = 1.0F; 
    if (bool1 && bool2 && !bool3 && !bool4) {
      f5 = 0.8125F;
      f1 = 0.3125F;
      f2 = 0.6875F;
    } else if (!bool1 && !bool2 && bool3 && bool4) {
      f5 = 0.8125F;
      f3 = 0.3125F;
      f4 = 0.6875F;
    } 
    Dne(f1, 0.0F, f3, f2, f5, f4);
  }
  
  public int Dne(int paramInt) {
    return paramInt;
  }
  
  public boolean FWm() {
    return false;
  }
  
  public boolean Dne() {
    return false;
  }
  
  public void Dne(int paramInt, JcN paramJcN, List<NMq> paramList) {
    paramList.add(new NMq(paramInt, 1, 0));
    paramList.add(new NMq(paramInt, 1, 1));
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\MZM.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */