import java.util.ArrayList;
import java.util.List;

public class wrs {
  private final Tfm Dne;
  
  private final RAN Dne;
  
  private final int Dne;
  
  private final List Dne;
  
  private final List FWm;
  
  private final int[][] Dne = (int[][])new ArrayList();
  
  public void Dne() {
    for (byte b = 0; b < this.FWm.size(); b++)
      ((JAu)this.FWm.get(b)).Dne(); 
    this.FWm.clear();
    if (this.Dne.isEmpty()) {
      fKu[] arrayOfFKu = ((RAN)this.Dne).Dne;
      if (!arrayOfFKu.FWm())
        ((RAN)this.Dne).Dne.FWm(); 
    } 
  }
  
  public RAN Dne() {
    return (RAN)this.Dne;
  }
  
  public static int Dne(int paramInt) {
    return paramInt * 16 - 16;
  }
  
  public void FWm(PJQ paramPJQ) {
    // Byte code:
    //   0: new java/util/ArrayList
    //   3: dup
    //   4: aload_1
    //   5: getfield Dne : Ljava/util/List;
    //   8: invokespecial <init> : (Ljava/util/Collection;)V
    //   11: astore_2
    //   12: iconst_0
    //   13: istore_3
    //   14: aload_0
    //   15: getfield Dne : I
    //   18: istore #4
    //   20: aload_1
    //   21: getfield div : D
    //   24: d2i
    //   25: iconst_4
    //   26: ishr
    //   27: istore #5
    //   29: aload_1
    //   30: getfield mrb : D
    //   33: d2i
    //   34: iconst_4
    //   35: ishr
    //   36: istore #6
    //   38: iconst_0
    //   39: istore #7
    //   41: iconst_0
    //   42: istore #8
    //   44: aload_0
    //   45: iload #5
    //   47: iload #6
    //   49: iconst_1
    //   50: invokespecial Dne : (IIZ)LJAu;
    //   53: invokestatic Dne : (LJAu;)LSxs;
    //   56: astore #9
    //   58: aload_1
    //   59: getfield Dne : Ljava/util/List;
    //   62: invokeinterface clear : ()V
    //   67: aload_2
    //   68: aload #9
    //   70: invokevirtual contains : (Ljava/lang/Object;)Z
    //   73: ifeq -> 88
    //   76: aload_1
    //   77: getfield Dne : Ljava/util/List;
    //   80: aload #9
    //   82: invokeinterface add : (Ljava/lang/Object;)Z
    //   87: pop
    //   88: iconst_1
    //   89: istore #10
    //   91: iload #10
    //   93: iload #4
    //   95: iconst_2
    //   96: imul
    //   97: if_icmpgt -> 209
    //   100: iconst_0
    //   101: istore #11
    //   103: iload #11
    //   105: iconst_2
    //   106: if_icmpge -> 203
    //   109: aload_0
    //   110: getfield Dne : [[I
    //   113: iload_3
    //   114: iinc #3, 1
    //   117: iconst_4
    //   118: irem
    //   119: aaload
    //   120: astore #12
    //   122: iconst_0
    //   123: istore #13
    //   125: iload #13
    //   127: iload #10
    //   129: if_icmpge -> 197
    //   132: iload #7
    //   134: aload #12
    //   136: iconst_0
    //   137: iaload
    //   138: iadd
    //   139: istore #7
    //   141: iload #8
    //   143: aload #12
    //   145: iconst_1
    //   146: iaload
    //   147: iadd
    //   148: istore #8
    //   150: aload_0
    //   151: iload #5
    //   153: iload #7
    //   155: iadd
    //   156: iload #6
    //   158: iload #8
    //   160: iadd
    //   161: iconst_1
    //   162: invokespecial Dne : (IIZ)LJAu;
    //   165: invokestatic Dne : (LJAu;)LSxs;
    //   168: astore #9
    //   170: aload_2
    //   171: aload #9
    //   173: invokevirtual contains : (Ljava/lang/Object;)Z
    //   176: ifeq -> 191
    //   179: aload_1
    //   180: getfield Dne : Ljava/util/List;
    //   183: aload #9
    //   185: invokeinterface add : (Ljava/lang/Object;)Z
    //   190: pop
    //   191: iinc #13, 1
    //   194: goto -> 125
    //   197: iinc #11, 1
    //   200: goto -> 103
    //   203: iinc #10, 1
    //   206: goto -> 91
    //   209: iload_3
    //   210: iconst_4
    //   211: irem
    //   212: istore_3
    //   213: iconst_0
    //   214: istore #10
    //   216: iload #10
    //   218: iload #4
    //   220: iconst_2
    //   221: imul
    //   222: if_icmpge -> 298
    //   225: iload #7
    //   227: aload_0
    //   228: getfield Dne : [[I
    //   231: iload_3
    //   232: aaload
    //   233: iconst_0
    //   234: iaload
    //   235: iadd
    //   236: istore #7
    //   238: iload #8
    //   240: aload_0
    //   241: getfield Dne : [[I
    //   244: iload_3
    //   245: aaload
    //   246: iconst_1
    //   247: iaload
    //   248: iadd
    //   249: istore #8
    //   251: aload_0
    //   252: iload #5
    //   254: iload #7
    //   256: iadd
    //   257: iload #6
    //   259: iload #8
    //   261: iadd
    //   262: iconst_1
    //   263: invokespecial Dne : (IIZ)LJAu;
    //   266: invokestatic Dne : (LJAu;)LSxs;
    //   269: astore #9
    //   271: aload_2
    //   272: aload #9
    //   274: invokevirtual contains : (Ljava/lang/Object;)Z
    //   277: ifeq -> 292
    //   280: aload_1
    //   281: getfield Dne : Ljava/util/List;
    //   284: aload #9
    //   286: invokeinterface add : (Ljava/lang/Object;)Z
    //   291: pop
    //   292: iinc #10, 1
    //   295: goto -> 216
    //   298: return
  }
  
  public void Dne(int paramInt1, int paramInt2, int paramInt3) {
    int i = paramInt1 >> 4;
    int j = paramInt3 >> 4;
    JAu jAu = Dne(i, j, false);
    if (jAu != null)
      jAu.Dne(paramInt1 & 0xF, paramInt2, paramInt3 & 0xF); 
  }
  
  public wrs(RAN paramRAN, int paramInt) {
    this.Dne = (int[][])new Tfm();
    this.FWm = new ArrayList();
    this.Dne = new int[][] { { 1, 0 }, { 0, 1 }, { -1, 0 }, { 0, -1 } };
    if (paramInt > 15)
      throw new IllegalArgumentException("Too big view radius!"); 
    if (paramInt < 3)
      throw new IllegalArgumentException("Too small view radius!"); 
    this.Dne = paramInt;
    this.Dne = (int[][])paramRAN;
  }
  
  static Tfm Dne(wrs paramwrs) {
    return (Tfm)paramwrs.Dne;
  }
  
  public boolean Dne(PJQ paramPJQ, int paramInt1, int paramInt2) {
    // Byte code:
    //   0: aload_0
    //   1: iload_2
    //   2: iload_3
    //   3: iconst_0
    //   4: invokespecial Dne : (IIZ)LJAu;
    //   7: astore #4
    //   9: aload #4
    //   11: ifnonnull -> 18
    //   14: iconst_0
    //   15: goto -> 54
    //   18: aload #4
    //   20: invokestatic Dne : (LJAu;)Ljava/util/List;
    //   23: aload_1
    //   24: invokeinterface contains : (Ljava/lang/Object;)Z
    //   29: ifeq -> 53
    //   32: aload_1
    //   33: getfield Dne : Ljava/util/List;
    //   36: aload #4
    //   38: invokestatic Dne : (LJAu;)LSxs;
    //   41: invokeinterface contains : (Ljava/lang/Object;)Z
    //   46: ifne -> 53
    //   49: iconst_1
    //   50: goto -> 54
    //   53: iconst_0
    //   54: ireturn
  }
  
  public void Dne(PJQ paramPJQ) {
    int i = (int)paramPJQ.div >> 4;
    int j = (int)paramPJQ.mrb >> 4;
    paramPJQ.Dne = paramPJQ.div;
    paramPJQ.FWm = paramPJQ.mrb;
    for (int k = i - this.Dne; k <= i + this.Dne; k++) {
      for (int m = j - this.Dne; m <= j + this.Dne; m++)
        Dne(k, m, true).Dne(paramPJQ); 
    } 
    this.Dne.add(paramPJQ);
    FWm(paramPJQ);
  }
  
  private boolean Dne(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5) {
    int i = paramInt1 - paramInt3;
    int j = paramInt2 - paramInt4;
    return (i >= -paramInt5 && i <= paramInt5) ? ((j >= -paramInt5 && j <= paramInt5)) : false;
  }
  
  public void bzF(PJQ paramPJQ) {
    int i = (int)paramPJQ.Dne >> 4;
    int j = (int)paramPJQ.FWm >> 4;
    for (int k = i - this.Dne; k <= i + this.Dne; k++) {
      for (int m = j - this.Dne; m <= j + this.Dne; m++) {
        JAu jAu = Dne(k, m, false);
        if (jAu != null)
          jAu.FWm(paramPJQ); 
      } 
    } 
    this.Dne.remove(paramPJQ);
  }
  
  static List Dne(wrs paramwrs) {
    return paramwrs.FWm;
  }
  
  private JAu Dne(int paramInt1, int paramInt2, boolean paramBoolean) {
    long l = paramInt1 + 2147483647L | paramInt2 + 2147483647L << 32L;
    JAu jAu = (JAu)this.Dne.Dne(l);
    if (jAu == null && paramBoolean) {
      jAu = new JAu(this, paramInt1, paramInt2);
      this.Dne.Dne(l, jAu);
    } 
    return jAu;
  }
  
  static RAN Dne(wrs paramwrs) {
    return (RAN)paramwrs.Dne;
  }
  
  public void Qnq(PJQ paramPJQ) {
    int i = (int)paramPJQ.div >> 4;
    int j = (int)paramPJQ.mrb >> 4;
    double d1 = paramPJQ.Dne - paramPJQ.div;
    double d2 = paramPJQ.FWm - paramPJQ.mrb;
    double d3 = d1 * d1 + d2 * d2;
    if (d3 >= 64.0D) {
      int k = (int)paramPJQ.Dne >> 4;
      int m = (int)paramPJQ.FWm >> 4;
      int[][] arrayOfInt = this.Dne;
      int n = i - k;
      int i1 = j - m;
      if (n != 0 || i1 != 0) {
        for (int i2 = i - arrayOfInt; i2 <= i + arrayOfInt; i2++) {
          for (int i3 = j - arrayOfInt; i3 <= j + arrayOfInt; i3++) {
            if (!Dne(i2, i3, k, m, arrayOfInt))
              Dne(i2, i3, true).Dne(paramPJQ); 
            if (!Dne(i2 - n, i3 - i1, i, j, arrayOfInt)) {
              JAu jAu = Dne(i2 - n, i3 - i1, false);
              if (jAu != null)
                jAu.FWm(paramPJQ); 
            } 
          } 
        } 
        FWm(paramPJQ);
        paramPJQ.Dne = paramPJQ.div;
        paramPJQ.FWm = paramPJQ.mrb;
      } 
    } 
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\wrs.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */