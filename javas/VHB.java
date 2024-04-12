import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class VHB extends zKP {
  private boolean Dne;
  
  private gDn bzF;
  
  private Set Dne;
  
  private gDn FWm;
  
  private gDn Dne = true;
  
  private gDn aFZ;
  
  private int FWm(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    if (paramQnq.Dne(paramInt1, paramInt2, paramInt3) != this.FWm)
      return paramInt4; 
    int i = paramQnq.bzF(paramInt1, paramInt2, paramInt3);
    return (i > paramInt4) ? i : paramInt4;
  }
  
  private void bzF(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3) {
    Dne(paramQnq, paramInt1, paramInt2, paramInt3, paramInt1, paramInt2, paramInt3);
    ArrayList<EyB> arrayList = new ArrayList((Collection<?>)this.Dne);
    this.Dne.clear();
    for (byte b = 0; b < arrayList.size(); b++) {
      EyB eyB = arrayList.get(b);
      paramQnq.bzF(eyB.Dne, eyB.FWm, eyB.bzF, this.FWm);
    } 
  }
  
  public void Dne(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3) {
    super.Dne(paramQnq, paramInt1, paramInt2, paramInt3);
    if (paramQnq.aFZ == null) {
      bzF(paramQnq, paramInt1, paramInt2, paramInt3);
      paramQnq.bzF(paramInt1, paramInt2 + 1, paramInt3, this.FWm);
      paramQnq.bzF(paramInt1, paramInt2 - 1, paramInt3, this.FWm);
      Qnq(paramQnq, paramInt1 - 1, paramInt2, paramInt3);
      Qnq(paramQnq, paramInt1 + 1, paramInt2, paramInt3);
      Qnq(paramQnq, paramInt1, paramInt2, paramInt3 - 1);
      Qnq(paramQnq, paramInt1, paramInt2, paramInt3 + 1);
      if (paramQnq.DyG(paramInt1 - 1, paramInt2, paramInt3)) {
        Qnq(paramQnq, paramInt1 - 1, paramInt2 + 1, paramInt3);
      } else {
        Qnq(paramQnq, paramInt1 - 1, paramInt2 - 1, paramInt3);
      } 
      if (paramQnq.DyG(paramInt1 + 1, paramInt2, paramInt3)) {
        Qnq(paramQnq, paramInt1 + 1, paramInt2 + 1, paramInt3);
      } else {
        Qnq(paramQnq, paramInt1 + 1, paramInt2 - 1, paramInt3);
      } 
      if (paramQnq.DyG(paramInt1, paramInt2, paramInt3 - 1)) {
        Qnq(paramQnq, paramInt1, paramInt2 + 1, paramInt3 - 1);
      } else {
        Qnq(paramQnq, paramInt1, paramInt2 - 1, paramInt3 - 1);
      } 
      if (paramQnq.DyG(paramInt1, paramInt2, paramInt3 + 1)) {
        Qnq(paramQnq, paramInt1, paramInt2 + 1, paramInt3 + 1);
      } else {
        Qnq(paramQnq, paramInt1, paramInt2 - 1, paramInt3 + 1);
      } 
    } 
  }
  
  public static boolean bzF(Zpi paramZpi, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    int i = paramZpi.Dne(paramInt1, paramInt2, paramInt3);
    if (i == ((VHB)zKP.Dne).FWm)
      return true; 
    if (i == 0)
      return false; 
    if (!zKP.Dne.aFZ(i))
      return (zKP.Dne[i].bzF() && paramInt4 != -1); 
    int j = paramZpi.bzF(paramInt1, paramInt2, paramInt3);
    return (paramInt4 == (j & 0x3) || paramInt4 == zxJ.aFZ[j & 0x3]);
  }
  
  public int Dne(Zpi paramZpi, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    if (this.Dne == null)
      return 0; 
    int i = paramZpi.bzF(paramInt1, paramInt2, paramInt3);
    if (i == 0)
      return 0; 
    if (paramInt4 == 1)
      return i; 
    boolean bool1 = (Qnq(paramZpi, paramInt1 - 1, paramInt2, paramInt3, 1) || (!paramZpi.DyG(paramInt1 - 1, paramInt2, paramInt3) && Qnq(paramZpi, paramInt1 - 1, paramInt2 - 1, paramInt3, -1))) ? true : false;
    boolean bool2 = (Qnq(paramZpi, paramInt1 + 1, paramInt2, paramInt3, 3) || (!paramZpi.DyG(paramInt1 + 1, paramInt2, paramInt3) && Qnq(paramZpi, paramInt1 + 1, paramInt2 - 1, paramInt3, -1))) ? true : false;
    boolean bool3 = (Qnq(paramZpi, paramInt1, paramInt2, paramInt3 - 1, 2) || (!paramZpi.DyG(paramInt1, paramInt2, paramInt3 - 1) && Qnq(paramZpi, paramInt1, paramInt2 - 1, paramInt3 - 1, -1))) ? true : false;
    boolean bool4 = (Qnq(paramZpi, paramInt1, paramInt2, paramInt3 + 1, 0) || (!paramZpi.DyG(paramInt1, paramInt2, paramInt3 + 1) && Qnq(paramZpi, paramInt1, paramInt2 - 1, paramInt3 + 1, -1))) ? true : false;
    if (!paramZpi.DyG(paramInt1, paramInt2 + 1, paramInt3)) {
      if (paramZpi.DyG(paramInt1 - 1, paramInt2, paramInt3) && Qnq(paramZpi, paramInt1 - 1, paramInt2 + 1, paramInt3, -1))
        bool1 = true; 
      if (paramZpi.DyG(paramInt1 + 1, paramInt2, paramInt3) && Qnq(paramZpi, paramInt1 + 1, paramInt2 + 1, paramInt3, -1))
        bool2 = true; 
      if (paramZpi.DyG(paramInt1, paramInt2, paramInt3 - 1) && Qnq(paramZpi, paramInt1, paramInt2 + 1, paramInt3 - 1, -1))
        bool3 = true; 
      if (paramZpi.DyG(paramInt1, paramInt2, paramInt3 + 1) && Qnq(paramZpi, paramInt1, paramInt2 + 1, paramInt3 + 1, -1))
        bool4 = true; 
    } 
    return (!bool3 && !bool2 && !bool1 && !bool4 && paramInt4 >= 2 && paramInt4 <= 5) ? i : ((paramInt4 == 2 && bool3 && !bool1 && !bool2) ? i : ((paramInt4 == 3 && bool4 && !bool1 && !bool2) ? i : ((paramInt4 == 4 && bool1 && !bool3 && !bool4) ? i : ((paramInt4 == 5 && bool2 && !bool3 && !bool4) ? i : 0))));
  }
  
  public static gDn Dne(String paramString) {
    return (paramString == "redstoneDust_cross") ? ((VHB)zKP.Dne).Dne : ((paramString == "redstoneDust_line") ? ((VHB)zKP.Dne).FWm : ((paramString == "redstoneDust_cross_overlay") ? ((VHB)zKP.Dne).bzF : ((paramString == "redstoneDust_line_overlay") ? ((VHB)zKP.Dne).aFZ : null)));
  }
  
  public int Dne(int paramInt1, Random paramRandom, int paramInt2) {
    return dEr.exS.Qnq;
  }
  
  public static boolean Qnq(Zpi paramZpi, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    if (bzF(paramZpi, paramInt1, paramInt2, paramInt3, paramInt4))
      return true; 
    int i = paramZpi.Dne(paramInt1, paramInt2, paramInt3);
    if (i == ((xui)zKP.FWm).FWm) {
      int j = paramZpi.bzF(paramInt1, paramInt2, paramInt3);
      return (paramInt4 == (j & 0x3));
    } 
    return false;
  }
  
  public int Dne(Zpi paramZpi, int paramInt1, int paramInt2, int paramInt3) {
    return 8388608;
  }
  
  public void Dne(Rbp paramRbp) {
    this.Dne = paramRbp.Dne("redstoneDust_cross");
    this.FWm = paramRbp.Dne("redstoneDust_line");
    this.bzF = paramRbp.Dne("redstoneDust_cross_overlay");
    this.aFZ = paramRbp.Dne("redstoneDust_line_overlay");
    this.Qnq = this.Dne;
  }
  
  public void Dne(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5) {
    super.Dne(paramQnq, paramInt1, paramInt2, paramInt3, paramInt4, paramInt5);
    if (paramQnq.aFZ == null) {
      paramQnq.bzF(paramInt1, paramInt2 + 1, paramInt3, this.FWm);
      paramQnq.bzF(paramInt1, paramInt2 - 1, paramInt3, this.FWm);
      paramQnq.bzF(paramInt1 + 1, paramInt2, paramInt3, this.FWm);
      paramQnq.bzF(paramInt1 - 1, paramInt2, paramInt3, this.FWm);
      paramQnq.bzF(paramInt1, paramInt2, paramInt3 + 1, this.FWm);
      paramQnq.bzF(paramInt1, paramInt2, paramInt3 - 1, this.FWm);
      bzF(paramQnq, paramInt1, paramInt2, paramInt3);
      Qnq(paramQnq, paramInt1 - 1, paramInt2, paramInt3);
      Qnq(paramQnq, paramInt1 + 1, paramInt2, paramInt3);
      Qnq(paramQnq, paramInt1, paramInt2, paramInt3 - 1);
      Qnq(paramQnq, paramInt1, paramInt2, paramInt3 + 1);
      if (paramQnq.DyG(paramInt1 - 1, paramInt2, paramInt3)) {
        Qnq(paramQnq, paramInt1 - 1, paramInt2 + 1, paramInt3);
      } else {
        Qnq(paramQnq, paramInt1 - 1, paramInt2 - 1, paramInt3);
      } 
      if (paramQnq.DyG(paramInt1 + 1, paramInt2, paramInt3)) {
        Qnq(paramQnq, paramInt1 + 1, paramInt2 + 1, paramInt3);
      } else {
        Qnq(paramQnq, paramInt1 + 1, paramInt2 - 1, paramInt3);
      } 
      if (paramQnq.DyG(paramInt1, paramInt2, paramInt3 - 1)) {
        Qnq(paramQnq, paramInt1, paramInt2 + 1, paramInt3 - 1);
      } else {
        Qnq(paramQnq, paramInt1, paramInt2 - 1, paramInt3 - 1);
      } 
      if (paramQnq.DyG(paramInt1, paramInt2, paramInt3 + 1)) {
        Qnq(paramQnq, paramInt1, paramInt2 + 1, paramInt3 + 1);
      } else {
        Qnq(paramQnq, paramInt1, paramInt2 - 1, paramInt3 + 1);
      } 
    } 
  }
  
  public boolean Dne() {
    return false;
  }
  
  public boolean Dne(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3) {
    return (paramQnq.IjH(paramInt1, paramInt2 - 1, paramInt3) || paramQnq.Dne(paramInt1, paramInt2 - 1, paramInt3) == zKP.fYA.FWm);
  }
  
  private void Dne(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6) {
    int i = paramQnq.bzF(paramInt1, paramInt2, paramInt3);
    boolean bool = false;
    int j = FWm(paramQnq, paramInt4, paramInt5, paramInt6, bool);
    this.Dne = false;
    int k = paramQnq.DyG(paramInt1, paramInt2, paramInt3);
    this.Dne = true;
    if (k > 0 && k > j - 1)
      j = k; 
    int m = 0;
    for (byte b = 0; b < 4; b++) {
      int n = paramInt1;
      int i1 = paramInt3;
      if (b == 0)
        n = paramInt1 - 1; 
      if (b == 1)
        n++; 
      if (b == 2)
        i1 = paramInt3 - 1; 
      if (b == 3)
        i1++; 
      if (n != paramInt4 || i1 != paramInt6)
        m = FWm(paramQnq, n, paramInt2, i1, m); 
      if (paramQnq.DyG(n, paramInt2, i1) && !paramQnq.DyG(paramInt1, paramInt2 + 1, paramInt3)) {
        if ((n != paramInt4 || i1 != paramInt6) && paramInt2 >= paramInt5)
          m = FWm(paramQnq, n, paramInt2 + 1, i1, m); 
      } else if (!paramQnq.DyG(n, paramInt2, i1) && (n != paramInt4 || i1 != paramInt6) && paramInt2 <= paramInt5) {
        m = FWm(paramQnq, n, paramInt2 - 1, i1, m);
      } 
    } 
    if (m > j) {
      j = m - 1;
    } else if (j > 0) {
      j--;
    } else {
      j = 0;
    } 
    if (k > j - 1)
      j = k; 
    if (i != j) {
      paramQnq.Dne(paramInt1, paramInt2, paramInt3, j, 2);
      this.Dne.add(new EyB(paramInt1, paramInt2, paramInt3));
      this.Dne.add(new EyB(paramInt1 - 1, paramInt2, paramInt3));
      this.Dne.add(new EyB(paramInt1 + 1, paramInt2, paramInt3));
      this.Dne.add(new EyB(paramInt1, paramInt2 - 1, paramInt3));
      this.Dne.add(new EyB(paramInt1, paramInt2 + 1, paramInt3));
      this.Dne.add(new EyB(paramInt1, paramInt2, paramInt3 - 1));
      this.Dne.add(new EyB(paramInt1, paramInt2, paramInt3 + 1));
    } 
  }
  
  private void Qnq(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3) {
    if (paramQnq.Dne(paramInt1, paramInt2, paramInt3) == this.FWm) {
      paramQnq.bzF(paramInt1, paramInt2, paramInt3, this.FWm);
      paramQnq.bzF(paramInt1 - 1, paramInt2, paramInt3, this.FWm);
      paramQnq.bzF(paramInt1 + 1, paramInt2, paramInt3, this.FWm);
      paramQnq.bzF(paramInt1, paramInt2, paramInt3 - 1, this.FWm);
      paramQnq.bzF(paramInt1, paramInt2, paramInt3 + 1, this.FWm);
      paramQnq.bzF(paramInt1, paramInt2 - 1, paramInt3, this.FWm);
      paramQnq.bzF(paramInt1, paramInt2 + 1, paramInt3, this.FWm);
    } 
  }
  
  public void Dne(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    if (paramQnq.aFZ == null) {
      boolean bool = Dne(paramQnq, paramInt1, paramInt2, paramInt3);
      if (bool) {
        bzF(paramQnq, paramInt1, paramInt2, paramInt3);
      } else {
        FWm(paramQnq, paramInt1, paramInt2, paramInt3, 0, 0);
        paramQnq.Qnq(paramInt1, paramInt2, paramInt3);
      } 
      super.Dne(paramQnq, paramInt1, paramInt2, paramInt3, paramInt4);
    } 
  }
  
  public void FWm(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3, Random paramRandom) {
    int i = paramQnq.bzF(paramInt1, paramInt2, paramInt3);
    if (i > 0) {
      double d1 = paramInt1 + 0.5D + (paramRandom.nextFloat() - 0.5D) * 0.2D;
      double d2 = (paramInt2 + 0.0625F);
      double d3 = paramInt3 + 0.5D + (paramRandom.nextFloat() - 0.5D) * 0.2D;
      float f1 = i / 15.0F;
      float f2 = f1 * 0.6F + 0.4F;
      if (i == 0)
        f2 = 0.0F; 
      float f3 = f1 * f1 * 0.7F - 0.5F;
      float f4 = f1 * f1 * 0.6F - 0.7F;
      if (f3 < 0.0F)
        f3 = 0.0F; 
      if (f4 < 0.0F)
        f4 = 0.0F; 
      paramQnq.Dne("reddust", d1, d2, d3, f2, f3, f4);
    } 
  }
  
  public VHB(int paramInt) {
    super(paramInt, KFd.qLR);
    this.Dne = (gDn)new HashSet();
    Dne(0.0F, 0.0F, 0.0F, 1.0F, 0.0625F, 1.0F);
  }
  
  public int Dne(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3) {
    return dEr.exS.Qnq;
  }
  
  public int Dne() {
    return 5;
  }
  
  public int FWm(Zpi paramZpi, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    return (this.Dne == null) ? 0 : Dne(paramZpi, paramInt1, paramInt2, paramInt3, paramInt4);
  }
  
  public bSp Dne(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3) {
    return null;
  }
  
  public boolean FWm() {
    return false;
  }
  
  public boolean bzF() {
    return this.Dne;
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\VHB.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */