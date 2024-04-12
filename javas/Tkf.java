import java.util.List;
import java.util.Random;

public class Tkf extends zKP {
  public static final String[] FWm;
  
  public static final String[] Dne = new String[] { "oak", "spruce", "birch", "jungle" };
  
  private gDn[] Dne;
  
  private gDn Dne;
  
  public void Dne(Rbp paramRbp) {
    this.Dne = paramRbp.Dne("tree_top");
    this.Dne = (gDn)new gDn[FWm.length];
    for (byte b = 0; b < this.Dne.length; b++)
      this.Dne[b] = paramRbp.Dne(FWm[b]); 
  }
  
  public void Dne(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5) {
    byte b = 4;
    int i = b + 1;
    if (paramQnq.Dne(paramInt1 - i, paramInt2 - i, paramInt3 - i, paramInt1 + i, paramInt2 + i, paramInt3 + i))
      for (byte b1 = -b; b1 <= b; b1++) {
        for (byte b2 = -b; b2 <= b; b2++) {
          for (byte b3 = -b; b3 <= b; b3++) {
            int j = paramQnq.Dne(paramInt1 + b1, paramInt2 + b2, paramInt3 + b3);
            if (j == ((VOy)zKP.Dne).FWm) {
              int k = paramQnq.bzF(paramInt1 + b1, paramInt2 + b2, paramInt3 + b3);
              if ((k & 0x8) == 0)
                paramQnq.Dne(paramInt1 + b1, paramInt2 + b2, paramInt3 + b3, k | 0x8, 4); 
            } 
          } 
        } 
      }  
  }
  
  public int Dne(int paramInt1, Random paramRandom, int paramInt2) {
    return zKP.udO.FWm;
  }
  
  protected NMq Dne(int paramInt) {
    return new NMq(this.FWm, 1, bzF(paramInt));
  }
  
  public int Dne() {
    return 31;
  }
  
  static {
    FWm = new String[] { "tree_side", "tree_spruce", "tree_birch", "tree_jungle" };
  }
  
  public void Dne(int paramInt, JcN paramJcN, List<NMq> paramList) {
    paramList.add(new NMq(paramInt, 1, 0));
    paramList.add(new NMq(paramInt, 1, 1));
    paramList.add(new NMq(paramInt, 1, 2));
    paramList.add(new NMq(paramInt, 1, 3));
  }
  
  public gDn Dne(int paramInt1, int paramInt2) {
    int i = paramInt2 & 0xC;
    int j = paramInt2 & 0x3;
    return (i == 0 && (paramInt1 == 1 || paramInt1 == 0)) ? this.Dne : ((i == 4 && (paramInt1 == 5 || paramInt1 == 4)) ? this.Dne : ((i == 8 && (paramInt1 == 2 || paramInt1 == 3)) ? this.Dne : this.Dne[j]));
  }
  
  public int Dne(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3, int paramInt4, float paramFloat1, float paramFloat2, float paramFloat3, int paramInt5) {
    int i = paramInt5 & 0x3;
    byte b = 0;
    switch (paramInt4) {
      case 0:
      case 1:
        b = 0;
        break;
      case 2:
      case 3:
        b = 8;
        break;
      case 4:
      case 5:
        b = 4;
        break;
    } 
    return i | b;
  }
  
  protected Tkf(int paramInt) {
    super(paramInt, KFd.Qnq);
    Dne(JcN.Dne);
  }
  
  public static int bzF(int paramInt) {
    return paramInt & 0x3;
  }
  
  public int Dne(Random paramRandom) {
    return 1;
  }
  
  public int Dne(int paramInt) {
    return paramInt & 0x3;
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\Tkf.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */