import java.util.List;
import java.util.Random;

public class Xmg extends zKP {
  public static final String[] Dne = new String[] { "stone", "cobble", "brick" };
  
  public int FWm(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3) {
    return paramQnq.bzF(paramInt1, paramInt2, paramInt3);
  }
  
  public void Dne(Rbp paramRbp) {}
  
  protected NMq Dne(int paramInt) {
    zKP zKP1 = zKP.Dne;
    if (paramInt == 1)
      boolean bool = zKP.bzF; 
    if (paramInt == 2)
      zKP1 = zKP.WvN; 
    return new NMq(zKP1);
  }
  
  public static int bzF(int paramInt) {
    return (paramInt == zKP.bzF.FWm) ? 1 : ((paramInt == zKP.WvN.FWm) ? 2 : 0);
  }
  
  public Xmg(int paramInt) {
    super(paramInt, KFd.RPx);
    bzF(0.0F);
    Dne(JcN.FWm);
  }
  
  public void bzF(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    if (paramQnq.aFZ == null) {
      zTy zTy = new zTy(paramQnq);
      zTy.FWm(paramInt1 + 0.5D, paramInt2, paramInt3 + 0.5D, 0.0F, 0.0F);
      paramQnq.FWm(zTy);
      zTy.Wwe();
    } 
    super.bzF(paramQnq, paramInt1, paramInt2, paramInt3, paramInt4);
  }
  
  public void Dne(int paramInt, JcN paramJcN, List<NMq> paramList) {
    for (byte b = 0; b < 3; b++)
      paramList.add(new NMq(paramInt, 1, b)); 
  }
  
  public int Dne(Random paramRandom) {
    return 0;
  }
  
  public gDn Dne(int paramInt1, int paramInt2) {
    // Byte code:
    //   0: iload_2
    //   1: iconst_1
    //   2: if_icmpne -> 15
    //   5: getstatic zKP.bzF : LzKP;
    //   8: iload_1
    //   9: invokevirtual FWm : (I)LgDn;
    //   12: goto -> 37
    //   15: iload_2
    //   16: iconst_2
    //   17: if_icmpne -> 30
    //   20: getstatic zKP.WvN : LzKP;
    //   23: iload_1
    //   24: invokevirtual FWm : (I)LgDn;
    //   27: goto -> 37
    //   30: getstatic zKP.Dne : LzKP;
    //   33: iload_1
    //   34: invokevirtual FWm : (I)LgDn;
    //   37: areturn
  }
  
  public static boolean Dne(int paramInt) {
    return (paramInt == zKP.Dne.FWm || paramInt == zKP.bzF.FWm || paramInt == zKP.WvN.FWm);
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\Xmg.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */