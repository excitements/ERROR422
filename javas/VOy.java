import java.util.List;
import java.util.Random;

public class VOy extends nnF {
  public static final String[][] Dne;
  
  private int Dne;
  
  private gDn[][] Dne;
  
  int[] Dne = (int[])new gDn[2][];
  
  public static final String[] Dne = new String[] { "oak", "spruce", "birch", "jungle" };
  
  public void Dne(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3, int paramInt4, float paramFloat, int paramInt5) {
    if (paramQnq.aFZ == null) {
      int i = 20;
      if ((paramInt4 & 0x3) == 3)
        i = 40; 
      if (paramInt5 > 0) {
        i -= 2 << paramInt5;
        if (i < 10)
          i = 10; 
      } 
      if (paramQnq.Dne.nextInt(i) == 0) {
        int j = Dne(paramInt4, (Random)paramQnq.Dne, paramInt5);
        FWm(paramQnq, paramInt1, paramInt2, paramInt3, new NMq(j, 1, Dne(paramInt4)));
      } 
      i = 200;
      if (paramInt5 > 0) {
        i -= 10 << paramInt5;
        if (i < 40)
          i = 40; 
      } 
      if ((paramInt4 & 0x3) == 0 && paramQnq.Dne.nextInt(i) == 0)
        FWm(paramQnq, paramInt1, paramInt2, paramInt3, new NMq(dEr.aFZ, 1, 0)); 
    } 
  }
  
  public int Dne(int paramInt) {
    return paramInt & 0x3;
  }
  
  private void bzF(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3) {
    FWm(paramQnq, paramInt1, paramInt2, paramInt3, paramQnq.bzF(paramInt1, paramInt2, paramInt3), 0);
    paramQnq.Qnq(paramInt1, paramInt2, paramInt3);
  }
  
  public void Dne(int paramInt, JcN paramJcN, List<NMq> paramList) {
    paramList.add(new NMq(paramInt, 1, 0));
    paramList.add(new NMq(paramInt, 1, 1));
    paramList.add(new NMq(paramInt, 1, 2));
    paramList.add(new NMq(paramInt, 1, 3));
  }
  
  public void Dne(Qnq paramQnq, FiG paramFiG, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    if (paramQnq.aFZ == null && paramFiG.bzF() != null && (paramFiG.bzF()).bzF == ((ZtP)dEr.Dne).Qnq) {
      paramFiG.Dne(trP.Dne[this.FWm], 1);
      FWm(paramQnq, paramInt1, paramInt2, paramInt3, new NMq(((VOy)zKP.Dne).FWm, 1, paramInt4 & 0x3));
    } else {
      super.Dne(paramQnq, paramFiG, paramInt1, paramInt2, paramInt3, paramInt4);
    } 
  }
  
  public int Dne(Random paramRandom) {
    return (paramRandom.nextInt(20) == 0) ? 1 : 0;
  }
  
  public boolean FWm() {
    return (this.Dne == null);
  }
  
  public void Dne(boolean paramBoolean) {
    this.Dne = paramBoolean;
    this.Dne = paramBoolean ? 0 : 1;
  }
  
  protected NMq Dne(int paramInt) {
    return new NMq(this.FWm, 1, paramInt & 0x3);
  }
  
  protected VOy(int paramInt) {
    super(paramInt, KFd.mrb, false);
    Dne(true);
    Dne(JcN.FWm);
  }
  
  static {
    Dne = (String[])new String[][] { { "leaves", "leaves_spruce", "leaves", "leaves_jungle" }, { "leaves_opaque", "leaves_spruce_opaque", "leaves_opaque", "leaves_jungle_opaque" } };
  }
  
  public void Dne(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5) {
    byte b = 1;
    int i = b + 1;
    if (paramQnq.Dne(paramInt1 - i, paramInt2 - i, paramInt3 - i, paramInt1 + i, paramInt2 + i, paramInt3 + i))
      for (byte b1 = -b; b1 <= b; b1++) {
        for (byte b2 = -b; b2 <= b; b2++) {
          for (byte b3 = -b; b3 <= b; b3++) {
            int j = paramQnq.Dne(paramInt1 + b1, paramInt2 + b2, paramInt3 + b3);
            if (j == ((VOy)zKP.Dne).FWm) {
              int k = paramQnq.bzF(paramInt1 + b1, paramInt2 + b2, paramInt3 + b3);
              paramQnq.Dne(paramInt1 + b1, paramInt2 + b2, paramInt3 + b3, k | 0x8, 4);
            } 
          } 
        } 
      }  
  }
  
  public gDn Dne(int paramInt1, int paramInt2) {
    return ((paramInt2 & 0x3) == 1) ? (gDn)this.Dne[this.Dne][1] : (((paramInt2 & 0x3) == 3) ? (gDn)this.Dne[this.Dne][3] : (gDn)this.Dne[this.Dne][0]);
  }
  
  public int Dne(int paramInt1, Random paramRandom, int paramInt2) {
    return zKP.aFZ.FWm;
  }
  
  public void FWm(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3, Random paramRandom) {
    if (paramQnq.udO(paramInt1, paramInt2 + 1, paramInt3) && !paramQnq.IjH(paramInt1, paramInt2 - 1, paramInt3) && paramRandom.nextInt(15) == 1) {
      double d1 = (paramInt1 + paramRandom.nextFloat());
      double d2 = paramInt2 - 0.05D;
      double d3 = (paramInt3 + paramRandom.nextFloat());
      paramQnq.Dne("dripWater", d1, d2, d3, 0.0D, 0.0D, 0.0D);
    } 
  }
  
  public int b_() {
    double d1 = 0.5D;
    double d2 = 1.0D;
    return QFY.Dne(d1, d2);
  }
  
  public int Dne(Zpi paramZpi, int paramInt1, int paramInt2, int paramInt3) {
    int i = paramZpi.bzF(paramInt1, paramInt2, paramInt3);
    if ((i & 0x3) == 1)
      return QFY.Dne(); 
    if ((i & 0x3) == 2)
      return QFY.FWm(); 
    int j = 0;
    int k = 0;
    int m = 0;
    for (byte b = -1; b <= 1; b++) {
      for (byte b1 = -1; b1 <= 1; b1++) {
        int n = paramZpi.Dne(paramInt1 + b1, paramInt3 + b).Qnq();
        j += (n & 0xFF0000) >> 16;
        k += (n & 0xFF00) >> 8;
        m += n & 0xFF;
      } 
    } 
    return (j / 9 & 0xFF) << 16 | (k / 9 & 0xFF) << 8 | m / 9 & 0xFF;
  }
  
  public void Dne(Rbp paramRbp) {
    for (byte b = 0; b < Dne.length; b++) {
      this.Dne[b] = (String)new gDn[(Dne[b]).length];
      for (byte b1 = 0; b1 < (Dne[b]).length; b1++)
        this.Dne[b][b1] = (String)paramRbp.Dne(Dne[b][b1]); 
    } 
  }
  
  public int FWm(int paramInt) {
    return ((paramInt & 0x3) == 1) ? QFY.Dne() : (((paramInt & 0x3) == 2) ? QFY.FWm() : QFY.bzF());
  }
  
  public void Dne(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3, Random paramRandom) {
    if (paramQnq.aFZ == null) {
      int i = paramQnq.bzF(paramInt1, paramInt2, paramInt3);
      if ((i & 0x8) != 0 && (i & 0x4) == 0) {
        byte b1 = 4;
        int j = b1 + 1;
        byte b2 = 32;
        int k = b2 * b2;
        int m = b2 / 2;
        if (this.Dne == null)
          this.Dne = (String[])new int[b2 * b2 * b2]; 
        if (paramQnq.Dne(paramInt1 - j, paramInt2 - j, paramInt3 - j, paramInt1 + j, paramInt2 + j, paramInt3 + j)) {
          byte b;
          for (b = -b1; b <= b1; b++) {
            for (byte b3 = -b1; b3 <= b1; b3++) {
              for (byte b4 = -b1; b4 <= b1; b4++) {
                int n = paramQnq.Dne(paramInt1 + b, paramInt2 + b3, paramInt3 + b4);
                if (n == zKP.udO.FWm) {
                  this.Dne[(b + m) * k + (b3 + m) * b2 + b4 + m] = Character.MIN_VALUE;
                } else if (n == ((VOy)zKP.Dne).FWm) {
                  this.Dne[(b + m) * k + (b3 + m) * b2 + b4 + m] = -2;
                } else {
                  this.Dne[(b + m) * k + (b3 + m) * b2 + b4 + m] = -1;
                } 
              } 
            } 
          } 
          for (b = 1; b <= 4; b++) {
            for (byte b3 = -b1; b3 <= b1; b3++) {
              for (byte b4 = -b1; b4 <= b1; b4++) {
                for (byte b5 = -b1; b5 <= b1; b5++) {
                  if (this.Dne[(b3 + m) * k + (b4 + m) * b2 + b5 + m] == b - 1) {
                    if (this.Dne[(b3 + m - 1) * k + (b4 + m) * b2 + b5 + m] == -2)
                      this.Dne[(b3 + m - 1) * k + (b4 + m) * b2 + b5 + m] = b; 
                    if (this.Dne[(b3 + m + 1) * k + (b4 + m) * b2 + b5 + m] == -2)
                      this.Dne[(b3 + m + 1) * k + (b4 + m) * b2 + b5 + m] = b; 
                    if (this.Dne[(b3 + m) * k + (b4 + m - 1) * b2 + b5 + m] == -2)
                      this.Dne[(b3 + m) * k + (b4 + m - 1) * b2 + b5 + m] = b; 
                    if (this.Dne[(b3 + m) * k + (b4 + m + 1) * b2 + b5 + m] == -2)
                      this.Dne[(b3 + m) * k + (b4 + m + 1) * b2 + b5 + m] = b; 
                    if (this.Dne[(b3 + m) * k + (b4 + m) * b2 + b5 + m - 1] == -2)
                      this.Dne[(b3 + m) * k + (b4 + m) * b2 + b5 + m - 1] = b; 
                    if (this.Dne[(b3 + m) * k + (b4 + m) * b2 + b5 + m + 1] == -2)
                      this.Dne[(b3 + m) * k + (b4 + m) * b2 + b5 + m + 1] = b; 
                  } 
                } 
              } 
            } 
          } 
        } 
        String str = this.Dne[m * k + m * b2 + m];
        if (str >= null) {
          paramQnq.Dne(paramInt1, paramInt2, paramInt3, i & 0xFFFFFFF7, 4);
        } else {
          bzF(paramQnq, paramInt1, paramInt2, paramInt3);
        } 
      } 
    } 
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\VOy.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */