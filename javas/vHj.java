import java.util.List;
import java.util.Random;

public class vHj extends hbe {
  private gDn[] Dne;
  
  public static final String[] Dne = new String[] { "oak", "spruce", "birch", "jungle" };
  
  private static final String[] FWm = new String[] { "sapling", "sapling_spruce", "sapling_birch", "sapling_jungle" };
  
  public void Dne(Rbp paramRbp) {
    this.Dne = (String[])new gDn[FWm.length];
    for (byte b = 0; b < this.Dne.length; b++)
      this.Dne[b] = (String)paramRbp.Dne(FWm[b]); 
  }
  
  public boolean FWm(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    return (paramQnq.Dne(paramInt1, paramInt2, paramInt3) == this.FWm && (paramQnq.bzF(paramInt1, paramInt2, paramInt3) & 0x3) == paramInt4);
  }
  
  public void bzF(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3, Random paramRandom) {
    int i = paramQnq.bzF(paramInt1, paramInt2, paramInt3);
    if ((i & 0x8) == 0) {
      paramQnq.Dne(paramInt1, paramInt2, paramInt3, i | 0x8, 4);
    } else {
      Qnq(paramQnq, paramInt1, paramInt2, paramInt3, paramRandom);
    } 
  }
  
  public int Dne(int paramInt) {
    return paramInt & 0x3;
  }
  
  protected vHj(int paramInt) {
    super(paramInt);
    float f = 0.4F;
    Dne(0.5F - f, 0.0F, 0.5F - f, 0.5F + f, f * 2.0F, 0.5F + f);
    Dne(JcN.FWm);
  }
  
  public void Dne(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3, Random paramRandom) {
    if (paramQnq.aFZ == null) {
      super.Dne(paramQnq, paramInt1, paramInt2, paramInt3, paramRandom);
      if (paramQnq.aFZ(paramInt1, paramInt2 + 1, paramInt3) >= 9 && paramRandom.nextInt(7) == 0)
        bzF(paramQnq, paramInt1, paramInt2, paramInt3, paramRandom); 
    } 
  }
  
  public void Qnq(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3, Random paramRandom) {
    edi edi;
    int i = paramQnq.bzF(paramInt1, paramInt2, paramInt3) & 0x3;
    yaZ yaZ = null;
    byte b1 = 0;
    byte b2 = 0;
    boolean bool = false;
    if (i == 1) {
      yaZ = new yaZ(true);
    } else if (i == 2) {
      tIz tIz = new tIz(true);
    } else if (i == 3) {
      TpV tpV;
      for (b1 = 0; b1 >= -1; b1--) {
        for (b2 = 0; b2 >= -1; b2--) {
          if (FWm(paramQnq, paramInt1 + b1, paramInt2, paramInt3 + b2, 3) && FWm(paramQnq, paramInt1 + b1 + 1, paramInt2, paramInt3 + b2, 3) && FWm(paramQnq, paramInt1 + b1, paramInt2, paramInt3 + b2 + 1, 3) && FWm(paramQnq, paramInt1 + b1 + 1, paramInt2, paramInt3 + b2 + 1, 3)) {
            tpV = new TpV(true, 10 + paramRandom.nextInt(20), 3, 3);
            bool = true;
            break;
          } 
        } 
        if (tpV != null)
          break; 
      } 
      if (tpV == null) {
        b2 = 0;
        b1 = 0;
        ghu ghu = new ghu(true, 4 + paramRandom.nextInt(7), 3, 3, false);
      } 
    } else {
      ghu ghu = new ghu(true);
      if (paramRandom.nextInt(10) == 0)
        edi = new edi(true); 
    } 
    if (bool) {
      paramQnq.FWm(paramInt1 + b1, paramInt2, paramInt3 + b2, 0, 0, 4);
      paramQnq.FWm(paramInt1 + b1 + 1, paramInt2, paramInt3 + b2, 0, 0, 4);
      paramQnq.FWm(paramInt1 + b1, paramInt2, paramInt3 + b2 + 1, 0, 0, 4);
      paramQnq.FWm(paramInt1 + b1 + 1, paramInt2, paramInt3 + b2 + 1, 0, 0, 4);
    } else {
      paramQnq.FWm(paramInt1, paramInt2, paramInt3, 0, 0, 4);
    } 
    if (!edi.Dne(paramQnq, paramRandom, paramInt1 + b1, paramInt2, paramInt3 + b2))
      if (bool) {
        paramQnq.FWm(paramInt1 + b1, paramInt2, paramInt3 + b2, this.FWm, i, 4);
        paramQnq.FWm(paramInt1 + b1 + 1, paramInt2, paramInt3 + b2, this.FWm, i, 4);
        paramQnq.FWm(paramInt1 + b1, paramInt2, paramInt3 + b2 + 1, this.FWm, i, 4);
        paramQnq.FWm(paramInt1 + b1 + 1, paramInt2, paramInt3 + b2 + 1, this.FWm, i, 4);
      } else {
        paramQnq.FWm(paramInt1, paramInt2, paramInt3, this.FWm, i, 4);
      }  
  }
  
  public gDn Dne(int paramInt1, int paramInt2) {
    paramInt2 &= 0x3;
    return (gDn)this.Dne[paramInt2];
  }
  
  public void Dne(int paramInt, JcN paramJcN, List<NMq> paramList) {
    paramList.add(new NMq(paramInt, 1, 0));
    paramList.add(new NMq(paramInt, 1, 1));
    paramList.add(new NMq(paramInt, 1, 2));
    paramList.add(new NMq(paramInt, 1, 3));
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\vHj.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */