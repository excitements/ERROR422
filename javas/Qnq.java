import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Set;

public abstract class Qnq implements Zpi {
  public final Bkx Dne;
  
  public boolean Dne;
  
  private final dLs Dne;
  
  public List Dne;
  
  protected float bzF;
  
  public xoY Dne;
  
  public boolean FWm;
  
  int[] Dne;
  
  private long Dne;
  
  public Random Dne;
  
  private List DyG;
  
  public int Dne;
  
  public final Jik Dne;
  
  protected List FWm;
  
  protected float Dne;
  
  public boolean aFZ;
  
  protected boolean bzF;
  
  protected final iDE Dne;
  
  protected final int bzF = 1013904223;
  
  private boolean zGp;
  
  protected List zGp;
  
  protected final oJI Dne;
  
  private int zGp;
  
  protected SFA Dne;
  
  public final PrX Dne;
  
  private ArrayList Dne;
  
  protected float FWm;
  
  protected Set Dne;
  
  protected float Qnq;
  
  private final Calendar Dne;
  
  public int aFZ;
  
  public int Qnq;
  
  protected int FWm;
  
  public LLx Dne;
  
  private final ziS Dne;
  
  public List aFZ;
  
  private List div;
  
  public List Qnq;
  
  protected boolean Qnq;
  
  protected ZfC Dne = false;
  
  public List bzF;
  
  public void zGp(sMa paramsMa) {
    int i = geR.FWm(paramsMa.div / 16.0D);
    int j = geR.FWm(paramsMa.mrb / 16.0D);
    byte b = 2;
    for (int k = i - b; k <= i + b; k++) {
      for (int m = j - b; m <= j + b; m++)
        FWm(k, m); 
    } 
    if (!this.Dne.contains(paramsMa))
      this.Dne.add(paramsMa); 
  }
  
  public void Dne() {
    aFZ(8, 64, 8);
  }
  
  public float aFZ(float paramFloat) {
    return (this.bzF + (this.Qnq - this.bzF) * paramFloat) * zGp(paramFloat);
  }
  
  public void bzF(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    Qnq(paramInt1 - 1, paramInt2, paramInt3, paramInt4);
    Qnq(paramInt1 + 1, paramInt2, paramInt3, paramInt4);
    Qnq(paramInt1, paramInt2 - 1, paramInt3, paramInt4);
    Qnq(paramInt1, paramInt2 + 1, paramInt3, paramInt4);
    Qnq(paramInt1, paramInt2, paramInt3 - 1, paramInt4);
    Qnq(paramInt1, paramInt2, paramInt3 + 1, paramInt4);
  }
  
  public chN Dne(float paramFloat) {
    // Byte code:
    //   0: aload_0
    //   1: fload_1
    //   2: invokevirtual FWm : (F)F
    //   5: fstore_2
    //   6: fload_2
    //   7: ldc 3.1415927
    //   9: fmul
    //   10: fconst_2
    //   11: fmul
    //   12: invokestatic FWm : (F)F
    //   15: fconst_2
    //   16: fmul
    //   17: ldc 0.5
    //   19: fadd
    //   20: fstore_3
    //   21: fload_3
    //   22: fconst_0
    //   23: fcmpg
    //   24: ifge -> 29
    //   27: fconst_0
    //   28: fstore_3
    //   29: fload_3
    //   30: fconst_1
    //   31: fcmpl
    //   32: ifle -> 37
    //   35: fconst_1
    //   36: fstore_3
    //   37: aload_0
    //   38: getfield Dne : J
    //   41: bipush #16
    //   43: lshr
    //   44: ldc2_w 255
    //   47: land
    //   48: l2f
    //   49: ldc 255.0
    //   51: fdiv
    //   52: fstore #4
    //   54: aload_0
    //   55: getfield Dne : J
    //   58: bipush #8
    //   60: lshr
    //   61: ldc2_w 255
    //   64: land
    //   65: l2f
    //   66: ldc 255.0
    //   68: fdiv
    //   69: fstore #5
    //   71: aload_0
    //   72: getfield Dne : J
    //   75: ldc2_w 255
    //   78: land
    //   79: l2f
    //   80: ldc 255.0
    //   82: fdiv
    //   83: fstore #6
    //   85: aload_0
    //   86: fload_1
    //   87: invokevirtual zGp : (F)F
    //   90: fstore #7
    //   92: fload #7
    //   94: fconst_0
    //   95: fcmpl
    //   96: ifle -> 175
    //   99: fload #4
    //   101: ldc 0.3
    //   103: fmul
    //   104: fload #5
    //   106: ldc 0.59
    //   108: fmul
    //   109: fadd
    //   110: fload #6
    //   112: ldc 0.11
    //   114: fmul
    //   115: fadd
    //   116: ldc 0.6
    //   118: fmul
    //   119: fstore #8
    //   121: fconst_1
    //   122: fload #7
    //   124: ldc 0.95
    //   126: fmul
    //   127: fsub
    //   128: fstore #9
    //   130: fload #4
    //   132: fload #9
    //   134: fmul
    //   135: fload #8
    //   137: fconst_1
    //   138: fload #9
    //   140: fsub
    //   141: fmul
    //   142: fadd
    //   143: fstore #4
    //   145: fload #5
    //   147: fload #9
    //   149: fmul
    //   150: fload #8
    //   152: fconst_1
    //   153: fload #9
    //   155: fsub
    //   156: fmul
    //   157: fadd
    //   158: fstore #5
    //   160: fload #6
    //   162: fload #9
    //   164: fmul
    //   165: fload #8
    //   167: fconst_1
    //   168: fload #9
    //   170: fsub
    //   171: fmul
    //   172: fadd
    //   173: fstore #6
    //   175: fload #4
    //   177: fload_3
    //   178: ldc 0.9
    //   180: fmul
    //   181: ldc 0.1
    //   183: fadd
    //   184: fmul
    //   185: fstore #4
    //   187: fload #5
    //   189: fload_3
    //   190: ldc 0.9
    //   192: fmul
    //   193: ldc 0.1
    //   195: fadd
    //   196: fmul
    //   197: fstore #5
    //   199: fload #6
    //   201: fload_3
    //   202: ldc 0.85
    //   204: fmul
    //   205: ldc 0.15
    //   207: fadd
    //   208: fmul
    //   209: fstore #6
    //   211: aload_0
    //   212: fload_1
    //   213: invokevirtual aFZ : (F)F
    //   216: fstore #8
    //   218: fload #8
    //   220: fconst_0
    //   221: fcmpl
    //   222: ifle -> 301
    //   225: fload #4
    //   227: ldc 0.3
    //   229: fmul
    //   230: fload #5
    //   232: ldc 0.59
    //   234: fmul
    //   235: fadd
    //   236: fload #6
    //   238: ldc 0.11
    //   240: fmul
    //   241: fadd
    //   242: ldc 0.2
    //   244: fmul
    //   245: fstore #9
    //   247: fconst_1
    //   248: fload #8
    //   250: ldc 0.95
    //   252: fmul
    //   253: fsub
    //   254: fstore #10
    //   256: fload #4
    //   258: fload #10
    //   260: fmul
    //   261: fload #9
    //   263: fconst_1
    //   264: fload #10
    //   266: fsub
    //   267: fmul
    //   268: fadd
    //   269: fstore #4
    //   271: fload #5
    //   273: fload #10
    //   275: fmul
    //   276: fload #9
    //   278: fconst_1
    //   279: fload #10
    //   281: fsub
    //   282: fmul
    //   283: fadd
    //   284: fstore #5
    //   286: fload #6
    //   288: fload #10
    //   290: fmul
    //   291: fload #9
    //   293: fconst_1
    //   294: fload #10
    //   296: fsub
    //   297: fmul
    //   298: fadd
    //   299: fstore #6
    //   301: aload_0
    //   302: invokevirtual Dne : ()LziS;
    //   305: fload #4
    //   307: f2d
    //   308: fload #5
    //   310: f2d
    //   311: fload #6
    //   313: f2d
    //   314: invokevirtual Dne : (DDD)LchN;
    //   317: areturn
  }
  
  public wHH Dne(chN paramchN1, chN paramchN2, boolean paramBoolean1, boolean paramBoolean2) {
    if (!Double.isNaN(paramchN1.Dne) && !Double.isNaN(paramchN1.FWm) && !Double.isNaN(paramchN1.bzF)) {
      if (!Double.isNaN(paramchN2.Dne) && !Double.isNaN(paramchN2.FWm) && !Double.isNaN(paramchN2.bzF)) {
        int i = geR.FWm(paramchN2.Dne);
        int j = geR.FWm(paramchN2.FWm);
        int k = geR.FWm(paramchN2.bzF);
        int m = geR.FWm(paramchN1.Dne);
        int n = geR.FWm(paramchN1.FWm);
        int i1 = geR.FWm(paramchN1.bzF);
        int i2 = Dne(m, n, i1);
        int i3 = bzF(m, n, i1);
        dNT dNT = zKP.Dne[i2];
        if ((!paramBoolean2 || dNT == null || dNT.Dne(this, m, n, i1) != null) && i2 > 0 && dNT.Dne(i3, paramBoolean1)) {
          wHH wHH = dNT.Dne(this, m, n, i1, paramchN1, paramchN2);
          if (wHH != null)
            return wHH; 
        } 
        i2 = 200;
        while (i2-- >= 0) {
          byte b;
          if (Double.isNaN(paramchN1.Dne) || Double.isNaN(paramchN1.FWm) || Double.isNaN(paramchN1.bzF))
            return null; 
          if (m == i && n == j && i1 == k)
            return null; 
          boolean bool1 = true;
          boolean bool2 = true;
          boolean bool3 = true;
          double d1 = 999.0D;
          double d2 = 999.0D;
          double d3 = 999.0D;
          if (i > m) {
            d1 = m + 1.0D;
          } else if (i < m) {
            d1 = m + 0.0D;
          } else {
            bool1 = false;
          } 
          if (j > n) {
            d2 = n + 1.0D;
          } else if (j < n) {
            d2 = n + 0.0D;
          } else {
            bool2 = false;
          } 
          if (k > i1) {
            d3 = i1 + 1.0D;
          } else if (k < i1) {
            d3 = i1 + 0.0D;
          } else {
            bool3 = false;
          } 
          double d4 = 999.0D;
          double d5 = 999.0D;
          double d6 = 999.0D;
          double d7 = paramchN2.Dne - paramchN1.Dne;
          double d8 = paramchN2.FWm - paramchN1.FWm;
          double d9 = paramchN2.bzF - paramchN1.bzF;
          if (bool1)
            d4 = (d1 - paramchN1.Dne) / d7; 
          if (bool2)
            d5 = (d2 - paramchN1.FWm) / d8; 
          if (bool3)
            d6 = (d3 - paramchN1.bzF) / d9; 
          boolean bool4 = false;
          if (d4 < d5 && d4 < d6) {
            if (i > m) {
              b = 4;
            } else {
              b = 5;
            } 
            paramchN1.Dne = d1;
            paramchN1.FWm += d8 * d4;
            paramchN1.bzF += d9 * d4;
          } else if (d5 < d6) {
            if (j > n) {
              b = 0;
            } else {
              b = 1;
            } 
            paramchN1.Dne += d7 * d5;
            paramchN1.FWm = d2;
            paramchN1.bzF += d9 * d5;
          } else {
            if (k > i1) {
              b = 2;
            } else {
              b = 3;
            } 
            paramchN1.Dne += d7 * d6;
            paramchN1.FWm += d8 * d6;
            paramchN1.bzF = d3;
          } 
          chN chN1 = Dne().Dne(paramchN1.Dne, paramchN1.FWm, paramchN1.bzF);
          m = (int)(chN1.Dne = geR.FWm(paramchN1.Dne));
          if (b == 5) {
            m--;
            chN1.Dne++;
          } 
          n = (int)(chN1.FWm = geR.FWm(paramchN1.FWm));
          if (b == 1) {
            n--;
            chN1.FWm++;
          } 
          i1 = (int)(chN1.bzF = geR.FWm(paramchN1.bzF));
          if (b == 3) {
            i1--;
            chN1.bzF++;
          } 
          int i4 = Dne(m, n, i1);
          int i5 = bzF(m, n, i1);
          dNT dNT1 = zKP.Dne[i4];
          if ((!paramBoolean2 || dNT1 == null || dNT1.Dne(this, m, n, i1) != null) && i4 > 0 && dNT1.Dne(i5, paramBoolean1)) {
            wHH wHH = dNT1.Dne(this, m, n, i1, paramchN1, paramchN2);
            if (wHH != null)
              return wHH; 
          } 
        } 
        return null;
      } 
      return null;
    } 
    return null;
  }
  
  public int DyG(int paramInt1, int paramInt2, int paramInt3) {
    int i = 0;
    for (byte b = 0; b < 6; b++) {
      int j = bzF(paramInt1 + rrP.FWm[b], paramInt2 + rrP.bzF[b], paramInt3 + rrP.Qnq[b], b);
      if (j >= 15)
        return 15; 
      if (j > i)
        i = j; 
    } 
    return i;
  }
  
  public yTR Dne(sMa paramsMa, double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat, boolean paramBoolean) {
    return Dne(paramsMa, paramDouble1, paramDouble2, paramDouble3, paramFloat, false, paramBoolean);
  }
  
  public boolean Qnq(bSp parambSp) {
    int i = geR.FWm(parambSp.Dne);
    int j = geR.FWm(parambSp.Qnq + 1.0D);
    int k = geR.FWm(parambSp.FWm);
    int m = geR.FWm(parambSp.aFZ + 1.0D);
    int n = geR.FWm(parambSp.bzF);
    int i1 = geR.FWm(parambSp.zGp + 1.0D);
    if (Dne(i, k, n, j, m, i1))
      for (int i2 = i; i2 < j; i2++) {
        for (int i3 = k; i3 < m; i3++) {
          for (int i4 = n; i4 < i1; i4++) {
            int i5 = Dne(i2, i3, i4);
            if (i5 == ((iqp)zKP.Dne).FWm || i5 == ((byt)zKP.FWm).FWm || i5 == ((zKP)zKP.div).FWm)
              return true; 
          } 
        } 
      }  
    return false;
  }
  
  public wHH Dne(chN paramchN1, chN paramchN2) {
    return Dne(paramchN1, paramchN2, false, false);
  }
  
  public FiG FWm(double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4) {
    // Byte code:
    //   0: ldc2_w -1.0
    //   3: dstore #9
    //   5: aconst_null
    //   6: astore #11
    //   8: iconst_0
    //   9: istore #12
    //   11: iload #12
    //   13: aload_0
    //   14: getfield Qnq : Ljava/util/List;
    //   17: invokeinterface size : ()I
    //   22: if_icmpge -> 178
    //   25: aload_0
    //   26: getfield Qnq : Ljava/util/List;
    //   29: iload #12
    //   31: invokeinterface get : (I)Ljava/lang/Object;
    //   36: checkcast FiG
    //   39: astore #13
    //   41: aload #13
    //   43: getfield Dne : Luqg;
    //   46: getfield Dne : Z
    //   49: ifne -> 172
    //   52: aload #13
    //   54: invokevirtual udO : ()Z
    //   57: ifeq -> 172
    //   60: aload #13
    //   62: dload_1
    //   63: dload_3
    //   64: dload #5
    //   66: invokevirtual Dne : (DDD)D
    //   69: dstore #14
    //   71: dload #7
    //   73: dstore #16
    //   75: aload #13
    //   77: invokevirtual aFZ : ()Z
    //   80: ifeq -> 91
    //   83: dload #7
    //   85: ldc2_w 0.800000011920929
    //   88: dmul
    //   89: dstore #16
    //   91: aload #13
    //   93: invokevirtual Vxn : ()Z
    //   96: ifeq -> 129
    //   99: aload #13
    //   101: invokevirtual XHL : ()F
    //   104: fstore #18
    //   106: fload #18
    //   108: ldc 0.1
    //   110: fcmpg
    //   111: ifge -> 118
    //   114: ldc 0.1
    //   116: fstore #18
    //   118: dload #16
    //   120: ldc 0.7
    //   122: fload #18
    //   124: fmul
    //   125: f2d
    //   126: dmul
    //   127: dstore #16
    //   129: dload #7
    //   131: dconst_0
    //   132: dcmpg
    //   133: iflt -> 147
    //   136: dload #14
    //   138: dload #16
    //   140: dload #16
    //   142: dmul
    //   143: dcmpg
    //   144: ifge -> 172
    //   147: dload #9
    //   149: ldc2_w -1.0
    //   152: dcmpl
    //   153: ifeq -> 164
    //   156: dload #14
    //   158: dload #9
    //   160: dcmpg
    //   161: ifge -> 172
    //   164: dload #14
    //   166: dstore #9
    //   168: aload #13
    //   170: astore #11
    //   172: iinc #12, 1
    //   175: goto -> 11
    //   178: aload #11
    //   180: areturn
  }
  
  public void aFZ(int paramInt1, int paramInt2, int paramInt3) {
    this.Dne.Dne(paramInt1, paramInt2, paramInt3);
  }
  
  public aSc Dne() {
    return this.Dne.Dne();
  }
  
  public boolean kGO(int paramInt1, int paramInt2, int paramInt3) {
    return (bzF(paramInt1, paramInt2 - 1, paramInt3, 0) > 0) ? true : ((bzF(paramInt1, paramInt2 + 1, paramInt3, 1) > 0) ? true : ((bzF(paramInt1, paramInt2, paramInt3 - 1, 2) > 0) ? true : ((bzF(paramInt1, paramInt2, paramInt3 + 1, 3) > 0) ? true : ((bzF(paramInt1 - 1, paramInt2, paramInt3, 4) > 0) ? true : ((bzF(paramInt1 + 1, paramInt2, paramInt3, 5) > 0))))));
  }
  
  protected void DyG() {
    // Byte code:
    //   0: aload_0
    //   1: getfield Dne : Ljava/util/Set;
    //   4: invokeinterface clear : ()V
    //   9: aload_0
    //   10: getfield Dne : LBkx;
    //   13: ldc_w 'buildList'
    //   16: invokevirtual Dne : (Ljava/lang/String;)V
    //   19: iconst_0
    //   20: istore_1
    //   21: iload_1
    //   22: aload_0
    //   23: getfield Qnq : Ljava/util/List;
    //   26: invokeinterface size : ()I
    //   31: if_icmpge -> 145
    //   34: aload_0
    //   35: getfield Qnq : Ljava/util/List;
    //   38: iload_1
    //   39: invokeinterface get : (I)Ljava/lang/Object;
    //   44: checkcast FiG
    //   47: astore_2
    //   48: aload_2
    //   49: getfield div : D
    //   52: ldc2_w 16.0
    //   55: ddiv
    //   56: invokestatic FWm : (D)I
    //   59: istore_3
    //   60: aload_2
    //   61: getfield mrb : D
    //   64: ldc2_w 16.0
    //   67: ddiv
    //   68: invokestatic FWm : (D)I
    //   71: istore #4
    //   73: bipush #7
    //   75: istore #5
    //   77: iload #5
    //   79: ineg
    //   80: istore #6
    //   82: iload #6
    //   84: iload #5
    //   86: if_icmpgt -> 139
    //   89: iload #5
    //   91: ineg
    //   92: istore #7
    //   94: iload #7
    //   96: iload #5
    //   98: if_icmpgt -> 133
    //   101: aload_0
    //   102: getfield Dne : Ljava/util/Set;
    //   105: new Sxs
    //   108: dup
    //   109: iload #6
    //   111: iload_3
    //   112: iadd
    //   113: iload #7
    //   115: iload #4
    //   117: iadd
    //   118: invokespecial <init> : (II)V
    //   121: invokeinterface add : (Ljava/lang/Object;)Z
    //   126: pop
    //   127: iinc #7, 1
    //   130: goto -> 94
    //   133: iinc #6, 1
    //   136: goto -> 82
    //   139: iinc #1, 1
    //   142: goto -> 21
    //   145: aload_0
    //   146: getfield Dne : LBkx;
    //   149: invokevirtual FWm : ()V
    //   152: aload_0
    //   153: getfield zGp : I
    //   156: ifle -> 169
    //   159: aload_0
    //   160: dup
    //   161: getfield zGp : I
    //   164: iconst_1
    //   165: isub
    //   166: putfield zGp : I
    //   169: aload_0
    //   170: getfield Dne : LBkx;
    //   173: ldc_w 'playerCheckLight'
    //   176: invokevirtual Dne : (Ljava/lang/String;)V
    //   179: aload_0
    //   180: getfield Qnq : Ljava/util/List;
    //   183: invokeinterface isEmpty : ()Z
    //   188: ifne -> 293
    //   191: aload_0
    //   192: getfield Dne : Ljava/util/Random;
    //   195: aload_0
    //   196: getfield Qnq : Ljava/util/List;
    //   199: invokeinterface size : ()I
    //   204: invokevirtual nextInt : (I)I
    //   207: istore_1
    //   208: aload_0
    //   209: getfield Qnq : Ljava/util/List;
    //   212: iload_1
    //   213: invokeinterface get : (I)Ljava/lang/Object;
    //   218: checkcast FiG
    //   221: astore_2
    //   222: aload_2
    //   223: getfield div : D
    //   226: invokestatic FWm : (D)I
    //   229: aload_0
    //   230: getfield Dne : Ljava/util/Random;
    //   233: bipush #11
    //   235: invokevirtual nextInt : (I)I
    //   238: iadd
    //   239: iconst_5
    //   240: isub
    //   241: istore_3
    //   242: aload_2
    //   243: getfield IjH : D
    //   246: invokestatic FWm : (D)I
    //   249: aload_0
    //   250: getfield Dne : Ljava/util/Random;
    //   253: bipush #11
    //   255: invokevirtual nextInt : (I)I
    //   258: iadd
    //   259: iconst_5
    //   260: isub
    //   261: istore #4
    //   263: aload_2
    //   264: getfield mrb : D
    //   267: invokestatic FWm : (D)I
    //   270: aload_0
    //   271: getfield Dne : Ljava/util/Random;
    //   274: bipush #11
    //   276: invokevirtual nextInt : (I)I
    //   279: iadd
    //   280: iconst_5
    //   281: isub
    //   282: istore #5
    //   284: aload_0
    //   285: iload_3
    //   286: iload #4
    //   288: iload #5
    //   290: invokevirtual Qnq : (III)V
    //   293: aload_0
    //   294: getfield Dne : LBkx;
    //   297: invokevirtual FWm : ()V
    //   300: return
  }
  
  public void aFZ(sMa paramsMa) {
    Dne(paramsMa, true);
  }
  
  public qDW Dne(Ebp paramEbp) {
    return null;
  }
  
  public boolean Dne(FiG paramFiG, int paramInt1, int paramInt2, int paramInt3) {
    return true;
  }
  
  public boolean mrb(int paramInt1, int paramInt2, int paramInt3) {
    return bzF(paramInt1, paramInt2, paramInt3, false);
  }
  
  public int FWm(int paramInt1, int paramInt2) {
    if (paramInt1 >= -30000000 && paramInt2 >= -30000000 && paramInt1 < 30000000 && paramInt2 < 30000000) {
      if (!Dne(paramInt1 >> 4, paramInt2 >> 4))
        return 0; 
      qMV qMV = FWm(paramInt1 >> 4, paramInt2 >> 4);
      return qMV.Dne(paramInt1 & 0xF, paramInt2 & 0xF);
    } 
    return 0;
  }
  
  public float Qnq(float paramFloat) {
    float f1 = FWm(paramFloat);
    float f2 = 1.0F - geR.FWm(f1 * 3.1415927F * 2.0F) * 2.0F + 0.25F;
    if (f2 < 0.0F)
      f2 = 0.0F; 
    if (f2 > 1.0F)
      f2 = 1.0F; 
    return f2 * f2 * 0.5F;
  }
  
  public boolean Dne(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5) {
    if (paramInt1 >= -30000000 && paramInt3 >= -30000000 && paramInt1 < 30000000 && paramInt3 < 30000000) {
      if (paramInt2 < 0)
        return false; 
      if (paramInt2 >= 256)
        return false; 
      qMV qMV = FWm(paramInt1 >> 4, paramInt3 >> 4);
      int i = paramInt1 & 0xF;
      int j = paramInt3 & 0xF;
      boolean bool = qMV.Dne(i, paramInt2, j, paramInt4);
      if (bool) {
        int k = qMV.Dne(i, paramInt2, j);
        if ((paramInt5 & 0x2) != 0 && (this.aFZ == null || (paramInt5 & 0x4) == 0))
          Dne(paramInt1, paramInt2, paramInt3); 
        if (this.aFZ == null && (paramInt5 & 0x1) != 0) {
          Dne(paramInt1, paramInt2, paramInt3, k);
          dNT dNT = zKP.Dne[k];
          if (dNT != null && dNT.a_())
            aFZ(paramInt1, paramInt2, paramInt3, k); 
        } 
      } 
      return bool;
    } 
    return false;
  }
  
  public float Dne(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    int i = aFZ(paramInt1, paramInt2, paramInt3);
    if (i < paramInt4)
      i = paramInt4; 
    return ((Jik)this.Dne).Dne[i];
  }
  
  public boolean bzF(bSp parambSp) {
    int i = geR.FWm(parambSp.Dne);
    int j = geR.FWm(parambSp.Qnq + 1.0D);
    int k = geR.FWm(parambSp.FWm);
    int m = geR.FWm(parambSp.aFZ + 1.0D);
    int n = geR.FWm(parambSp.bzF);
    int i1 = geR.FWm(parambSp.zGp + 1.0D);
    if (parambSp.Dne < 0.0D)
      i--; 
    if (parambSp.FWm < 0.0D)
      k--; 
    if (parambSp.bzF < 0.0D)
      n--; 
    for (int i2 = i; i2 < j; i2++) {
      for (int i3 = k; i3 < m; i3++) {
        for (int i4 = n; i4 < i1; i4++) {
          dNT dNT = zKP.Dne[Dne(i2, i3, i4)];
          if (dNT != null && dNT.Dne.Qnq())
            return true; 
        } 
      } 
    } 
    return false;
  }
  
  public List FWm(sMa paramsMa, bSp parambSp) {
    return Dne(paramsMa, parambSp, (pUe)null);
  }
  
  public void Qnq(sMa paramsMa) {
    // Byte code:
    //   0: aload_1
    //   1: invokevirtual g_ : ()V
    //   4: aload_1
    //   5: instanceof FiG
    //   8: ifeq -> 26
    //   11: aload_0
    //   12: getfield Qnq : Ljava/util/List;
    //   15: aload_1
    //   16: invokeinterface remove : (Ljava/lang/Object;)Z
    //   21: pop
    //   22: aload_0
    //   23: invokevirtual XHL : ()V
    //   26: aload_1
    //   27: getfield IjH : I
    //   30: istore_2
    //   31: aload_1
    //   32: getfield XHL : I
    //   35: istore_3
    //   36: aload_1
    //   37: getfield trS : Z
    //   40: ifeq -> 62
    //   43: aload_0
    //   44: iload_2
    //   45: iload_3
    //   46: invokevirtual Dne : (II)Z
    //   49: ifeq -> 62
    //   52: aload_0
    //   53: iload_2
    //   54: iload_3
    //   55: invokevirtual FWm : (II)LqMV;
    //   58: aload_1
    //   59: invokevirtual FWm : (LsMa;)V
    //   62: aload_0
    //   63: getfield Dne : Ljava/util/List;
    //   66: aload_1
    //   67: invokeinterface remove : (Ljava/lang/Object;)Z
    //   72: pop
    //   73: aload_0
    //   74: aload_1
    //   75: invokevirtual FWm : (LsMa;)V
    //   78: return
  }
  
  public Random Dne(int paramInt1, int paramInt2, int paramInt3) {
    long l = paramInt1 * 341873128712L + paramInt2 * 132897987541L + Dne().Dne() + paramInt3;
    this.Dne.setSeed(l);
    return (Random)this.Dne;
  }
  
  public List Dne(qMV paramqMV, boolean paramBoolean) {
    return null;
  }
  
  public int Dne(udO paramudO, int paramInt1, int paramInt2, int paramInt3) {
    if (((Jik)this.Dne).FWm && paramudO == udO.Dne)
      return 0; 
    if (paramInt2 < 0)
      paramInt2 = 0; 
    if (paramInt2 >= 256)
      return paramudO.Dne; 
    if (paramInt1 >= -30000000 && paramInt3 >= -30000000 && paramInt1 < 30000000 && paramInt3 < 30000000) {
      int i = paramInt1 >> 4;
      int j = paramInt3 >> 4;
      if (!Dne(i, j))
        return paramudO.Dne; 
      if (zKP.Qnq[Dne(paramInt1, paramInt2, paramInt3)] != null) {
        int k = FWm(paramudO, paramInt1, paramInt2 + 1, paramInt3);
        int m = FWm(paramudO, paramInt1 + 1, paramInt2, paramInt3);
        int n = FWm(paramudO, paramInt1 - 1, paramInt2, paramInt3);
        int i1 = FWm(paramudO, paramInt1, paramInt2, paramInt3 + 1);
        int i2 = FWm(paramudO, paramInt1, paramInt2, paramInt3 - 1);
        if (m > k)
          k = m; 
        if (n > k)
          k = n; 
        if (i1 > k)
          k = i1; 
        if (i2 > k)
          k = i2; 
        return k;
      } 
      qMV qMV = FWm(i, j);
      return qMV.Dne(paramudO, paramInt1 & 0xF, paramInt2, paramInt3 & 0xF);
    } 
    return paramudO.Dne;
  }
  
  public int Dne(int paramInt1, int paramInt2, int paramInt3) {
    if (paramInt1 >= -30000000 && paramInt3 >= -30000000 && paramInt1 < 30000000 && paramInt3 < 30000000) {
      if (paramInt2 < 0)
        return 0; 
      if (paramInt2 >= 256)
        return 0; 
      qMV qMV = null;
      try {
        qMV = FWm(paramInt1 >> 4, paramInt3 >> 4);
        return qMV.Dne(paramInt1 & 0xF, paramInt2, paramInt3 & 0xF);
      } catch (Throwable throwable) {
        McM mcM = McM.Dne(throwable, "Exception getting block type in world");
        Noo noo = mcM.Dne("Requested block coordinates");
        noo.Dne("Found chunk", Boolean.valueOf((qMV == null)));
        noo.Dne("Location", Noo.Dne(paramInt1, paramInt2, paramInt3));
        throw new kaJ(mcM);
      } 
    } 
    return 0;
  }
  
  public int Dne(Class paramClass) {
    byte b1 = 0;
    for (byte b2 = 0; b2 < this.Dne.size(); b2++) {
      sMa sMa = this.Dne.get(b2);
      if ((!(sMa instanceof FUH) || !((FUH)sMa).rPc()) && paramClass.isAssignableFrom(sMa.getClass()))
        b1++; 
    } 
    return b1;
  }
  
  public String Dne() {
    return "All: " + this.Dne.size();
  }
  
  public iSh Dne() {
    return new iSh(this.Dne.Dne(), this.Dne.FWm(), this.Dne.bzF());
  }
  
  public int aFZ(int paramInt1, int paramInt2) {
    qMV qMV = Dne(paramInt1, paramInt2);
    int i = qMV.Dne() + 15;
    paramInt1 &= 0xF;
    paramInt2 &= 0xF;
    while (i > 0) {
      int j = qMV.Dne(paramInt1, i, paramInt2);
      if (j != 0 && (zKP.Dne[j]).Dne.bzF() && (zKP.Dne[j]).Dne != KFd.mrb)
        return i + 1; 
      i--;
    } 
    return -1;
  }
  
  public void Dne(List<sMa> paramList) {
    this.Dne.addAll(paramList);
    for (byte b = 0; b < paramList.size(); b++)
      Dne(paramList.get(b)); 
  }
  
  public FiG Dne(double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4) {
    // Byte code:
    //   0: ldc2_w -1.0
    //   3: dstore #9
    //   5: aconst_null
    //   6: astore #11
    //   8: iconst_0
    //   9: istore #12
    //   11: iload #12
    //   13: aload_0
    //   14: getfield Qnq : Ljava/util/List;
    //   17: invokeinterface size : ()I
    //   22: if_icmpge -> 101
    //   25: aload_0
    //   26: getfield Qnq : Ljava/util/List;
    //   29: iload #12
    //   31: invokeinterface get : (I)Ljava/lang/Object;
    //   36: checkcast FiG
    //   39: astore #13
    //   41: aload #13
    //   43: dload_1
    //   44: dload_3
    //   45: dload #5
    //   47: invokevirtual Dne : (DDD)D
    //   50: dstore #14
    //   52: dload #7
    //   54: dconst_0
    //   55: dcmpg
    //   56: iflt -> 70
    //   59: dload #14
    //   61: dload #7
    //   63: dload #7
    //   65: dmul
    //   66: dcmpg
    //   67: ifge -> 95
    //   70: dload #9
    //   72: ldc2_w -1.0
    //   75: dcmpl
    //   76: ifeq -> 87
    //   79: dload #14
    //   81: dload #9
    //   83: dcmpg
    //   84: ifge -> 95
    //   87: dload #14
    //   89: dstore #9
    //   91: aload #13
    //   93: astore #11
    //   95: iinc #12, 1
    //   98: goto -> 11
    //   101: aload #11
    //   103: areturn
  }
  
  private int Dne(int paramInt1, int paramInt2, int paramInt3, udO paramudO) {
    byte b1;
    if (paramudO == udO.Dne && aFZ(paramInt1, paramInt2, paramInt3))
      return 15; 
    int i = Dne(paramInt1, paramInt2, paramInt3);
    int j = (paramudO == udO.Dne) ? 0 : zKP.bzF[i];
    hbe hbe = zKP.FWm[i];
    if (hbe >= 15 && zKP.bzF[i])
      b1 = 1; 
    if (b1 < 1)
      b1 = 1; 
    if (b1 >= 15)
      return 0; 
    if (j >= 14)
      return j; 
    for (byte b2 = 0; b2 < 6; b2++) {
      int k = paramInt1 + rrP.FWm[b2];
      int m = paramInt2 + rrP.bzF[b2];
      int n = paramInt3 + rrP.Qnq[b2];
      int i1 = FWm(paramudO, k, m, n) - b1;
      if (i1 > j)
        j = i1; 
      if (j >= 14)
        return j; 
    } 
    return j;
  }
  
  public boolean Dne(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    return Dne(paramInt1 - paramInt4, paramInt2 - paramInt4, paramInt3 - paramInt4, paramInt1 + paramInt4, paramInt2 + paramInt4, paramInt3 + paramInt4);
  }
  
  public int bzF() {
    return ((Jik)this.Dne).FWm ? 128 : 256;
  }
  
  public void FWm(int paramInt1, int paramInt2, int paramInt3) {
    // Byte code:
    //   0: iconst_0
    //   1: istore #4
    //   3: iload #4
    //   5: aload_0
    //   6: getfield zGp : Ljava/util/List;
    //   9: invokeinterface size : ()I
    //   14: if_icmpge -> 45
    //   17: aload_0
    //   18: getfield zGp : Ljava/util/List;
    //   21: iload #4
    //   23: invokeinterface get : (I)Ljava/lang/Object;
    //   28: checkcast IjH
    //   31: iload_1
    //   32: iload_2
    //   33: iload_3
    //   34: invokeinterface FWm : (III)V
    //   39: iinc #4, 1
    //   42: goto -> 3
    //   45: return
  }
  
  public FiG Dne(String paramString) {
    // Byte code:
    //   0: iconst_0
    //   1: istore_2
    //   2: iload_2
    //   3: aload_0
    //   4: getfield Qnq : Ljava/util/List;
    //   7: invokeinterface size : ()I
    //   12: if_icmpge -> 58
    //   15: aload_1
    //   16: aload_0
    //   17: getfield Qnq : Ljava/util/List;
    //   20: iload_2
    //   21: invokeinterface get : (I)Ljava/lang/Object;
    //   26: checkcast FiG
    //   29: getfield aFZ : Ljava/lang/String;
    //   32: invokevirtual equals : (Ljava/lang/Object;)Z
    //   35: ifeq -> 52
    //   38: aload_0
    //   39: getfield Qnq : Ljava/util/List;
    //   42: iload_2
    //   43: invokeinterface get : (I)Ljava/lang/Object;
    //   48: checkcast FiG
    //   51: areturn
    //   52: iinc #2, 1
    //   55: goto -> 2
    //   58: aconst_null
    //   59: areturn
  }
  
  public void Dne(sMa paramsMa, String paramString, float paramFloat1, float paramFloat2) {
    // Byte code:
    //   0: aload_1
    //   1: ifnull -> 72
    //   4: aload_2
    //   5: ifnull -> 72
    //   8: iconst_0
    //   9: istore #5
    //   11: iload #5
    //   13: aload_0
    //   14: getfield zGp : Ljava/util/List;
    //   17: invokeinterface size : ()I
    //   22: if_icmpge -> 72
    //   25: aload_0
    //   26: getfield zGp : Ljava/util/List;
    //   29: iload #5
    //   31: invokeinterface get : (I)Ljava/lang/Object;
    //   36: checkcast IjH
    //   39: aload_2
    //   40: aload_1
    //   41: getfield div : D
    //   44: aload_1
    //   45: getfield IjH : D
    //   48: aload_1
    //   49: getfield udO : F
    //   52: f2d
    //   53: dsub
    //   54: aload_1
    //   55: getfield mrb : D
    //   58: fload_3
    //   59: fload #4
    //   61: invokeinterface Dne : (Ljava/lang/String;DDDFF)V
    //   66: iinc #5, 1
    //   69: goto -> 11
    //   72: return
  }
  
  public int Dne(String paramString) {
    return this.Dne.Dne(paramString);
  }
  
  public boolean Zpi(int paramInt1, int paramInt2, int paramInt3) {
    OdI odI = Dne(paramInt1, paramInt3);
    float f = odI.bzF();
    if (f > 0.15F)
      return false; 
    if (paramInt2 >= 0 && paramInt2 < 256 && FWm(udO.FWm, paramInt1, paramInt2, paramInt3) < 10) {
      int i = Dne(paramInt1, paramInt2 - 1, paramInt3);
      int j = Dne(paramInt1, paramInt2, paramInt3);
      if (j == 0 && zKP.EwP.Dne(this, paramInt1, paramInt2, paramInt3) && i != 0 && i != zKP.xEx.FWm && (zKP.Dne[i]).Dne.bzF())
        return true; 
    } 
    return false;
  }
  
  public boolean Dne(boolean paramBoolean) {
    return false;
  }
  
  public void Dne(boolean paramBoolean1, boolean paramBoolean2) {
    this.bzF = paramBoolean1;
    this.Qnq = paramBoolean2;
  }
  
  public OdI Dne(int paramInt1, int paramInt2) {
    // Byte code:
    //   0: aload_0
    //   1: iload_1
    //   2: iconst_0
    //   3: iload_2
    //   4: invokevirtual bzF : (III)Z
    //   7: ifeq -> 41
    //   10: aload_0
    //   11: iload_1
    //   12: iload_2
    //   13: invokevirtual Dne : (II)LqMV;
    //   16: astore_3
    //   17: aload_3
    //   18: ifnull -> 41
    //   21: aload_3
    //   22: iload_1
    //   23: bipush #15
    //   25: iand
    //   26: iload_2
    //   27: bipush #15
    //   29: iand
    //   30: aload_0
    //   31: getfield Dne : LJik;
    //   34: getfield Dne : Ltgc;
    //   37: invokevirtual Dne : (IILtgc;)LOdI;
    //   40: areturn
    //   41: aload_0
    //   42: getfield Dne : LJik;
    //   45: getfield Dne : Ltgc;
    //   48: iload_1
    //   49: iload_2
    //   50: invokevirtual Dne : (II)LOdI;
    //   53: areturn
  }
  
  public boolean FWm(int paramInt1, int paramInt2, int paramInt3) {
    int i = Dne(paramInt1, paramInt2, paramInt3);
    return (zKP.Dne[i] != null && zKP.Dne[i].mrb());
  }
  
  public iDE Dne() {
    return (iDE)this.Dne;
  }
  
  public void Dne(IjH paramIjH) {
    // Byte code:
    //   0: aload_0
    //   1: getfield zGp : Ljava/util/List;
    //   4: aload_1
    //   5: invokeinterface add : (Ljava/lang/Object;)Z
    //   10: pop
    //   11: return
  }
  
  public void Dne(int paramInt1, int paramInt2, int paramInt3) {
    // Byte code:
    //   0: iconst_0
    //   1: istore #4
    //   3: iload #4
    //   5: aload_0
    //   6: getfield zGp : Ljava/util/List;
    //   9: invokeinterface size : ()I
    //   14: if_icmpge -> 45
    //   17: aload_0
    //   18: getfield zGp : Ljava/util/List;
    //   21: iload #4
    //   23: invokeinterface get : (I)Ljava/lang/Object;
    //   28: checkcast IjH
    //   31: iload_1
    //   32: iload_2
    //   33: iload_3
    //   34: invokeinterface Dne : (III)V
    //   39: iinc #4, 1
    //   42: goto -> 3
    //   45: return
  }
  
  public void Dne(Collection paramCollection) {
    if (this.zGp != 0) {
      this.DyG.addAll(paramCollection);
    } else {
      this.bzF.addAll(paramCollection);
    } 
  }
  
  public boolean FWm(bSp parambSp, KFd paramKFd) {
    int i = geR.FWm(parambSp.Dne);
    int j = geR.FWm(parambSp.Qnq + 1.0D);
    int k = geR.FWm(parambSp.FWm);
    int m = geR.FWm(parambSp.aFZ + 1.0D);
    int n = geR.FWm(parambSp.bzF);
    int i1 = geR.FWm(parambSp.zGp + 1.0D);
    for (int i2 = i; i2 < j; i2++) {
      for (int i3 = k; i3 < m; i3++) {
        for (int i4 = n; i4 < i1; i4++) {
          dNT dNT = zKP.Dne[Dne(i2, i3, i4)];
          if (dNT != null && dNT.Dne == paramKFd) {
            int i5 = bzF(i2, i3, i4);
            double d = (i3 + 1);
            if (i5 < 8)
              d = (i3 + 1) - i5 / 8.0D; 
            if (d >= parambSp.FWm)
              return true; 
          } 
        } 
      } 
    } 
    return false;
  }
  
  public float Dne(int paramInt1, int paramInt2, int paramInt3) {
    return ((Jik)this.Dne).Dne[aFZ(paramInt1, paramInt2, paramInt3)];
  }
  
  public boolean Dne(int paramInt1, int paramInt2, int paramInt3) {
    return (Dne(paramInt1, paramInt2, paramInt3) == 0);
  }
  
  public xoY Dne() {
    return (xoY)this.Dne;
  }
  
  public ipD Dne(int paramInt1, int paramInt2, int paramInt3) {
    if (paramInt2 >= 0 && paramInt2 < 256) {
      ipD ipD = null;
      if (this.zGp != 0)
        for (byte b = 0; b < this.DyG.size(); b++) {
          ipD ipD1 = this.DyG.get(b);
          if (!ipD1.aFZ() && ipD1.Qnq == paramInt1 && ipD1.aFZ == paramInt2 && ipD1.zGp == paramInt3) {
            ipD = ipD1;
            break;
          } 
        }  
      if (ipD == null) {
        qMV qMV = FWm(paramInt1 >> 4, paramInt3 >> 4);
        if (qMV != null)
          ipD = qMV.Dne(paramInt1 & 0xF, paramInt2, paramInt3 & 0xF); 
      } 
      if (ipD == null)
        for (byte b = 0; b < this.DyG.size(); b++) {
          ipD ipD1 = this.DyG.get(b);
          if (!ipD1.aFZ() && ipD1.Qnq == paramInt1 && ipD1.aFZ == paramInt2 && ipD1.zGp == paramInt3) {
            ipD = ipD1;
            break;
          } 
        }  
      return ipD;
    } 
    return null;
  }
  
  public boolean IjH(int paramInt1, int paramInt2, int paramInt3) {
    dNT dNT = zKP.Dne[Dne(paramInt1, paramInt2, paramInt3)];
    return Dne(dNT, bzF(paramInt1, paramInt2, paramInt3));
  }
  
  public void IjH() {}
  
  public abstract sMa Dne(int paramInt);
  
  public boolean Dne(zKP paramzKP, int paramInt) {
    return (paramzKP == null) ? false : ((paramzKP.Dne.DyG() && paramzKP.Dne()) ? true : ((paramzKP instanceof vla) ? (((paramInt & 0x4) == 4)) : ((paramzKP instanceof dNT) ? (((paramInt & 0x8) == 8)) : ((paramzKP instanceof SrC) ? true : ((paramzKP instanceof XUv) ? (((paramInt & 0x7) == 7)) : false)))));
  }
  
  public List Dne(sMa paramsMa, bSp parambSp) {
    this.Dne.clear();
    int i = geR.FWm(parambSp.Dne);
    int j = geR.FWm(parambSp.Qnq + 1.0D);
    int k = geR.FWm(parambSp.FWm);
    int m = geR.FWm(parambSp.aFZ + 1.0D);
    int n = geR.FWm(parambSp.bzF);
    int i1 = geR.FWm(parambSp.zGp + 1.0D);
    for (int i2 = i; i2 < j; i2++) {
      for (int i3 = n; i3 < i1; i3++) {
        if (bzF(i2, 64, i3))
          for (int i4 = k - 1; i4 < m; i4++) {
            dNT dNT = zKP.Dne[Dne(i2, i4, i3)];
            if (dNT != null)
              dNT.Dne(this, i2, i4, i3, parambSp, (List)this.Dne, paramsMa); 
          }  
      } 
    } 
    double d = 0.25D;
    List<sMa> list = FWm(paramsMa, parambSp.FWm(d, d, d));
    for (byte b = 0; b < list.size(); b++) {
      bSp bSp1 = ((sMa)list.get(b)).Dne();
      if (bSp1 != null && bSp1.Dne(parambSp))
        this.Dne.add(bSp1); 
      bSp1 = paramsMa.Dne(list.get(b));
      if (bSp1 != null && bSp1.Dne(parambSp))
        this.Dne.add(bSp1); 
    } 
    return (List)this.Dne;
  }
  
  public int FWm(int paramInt1, int paramInt2, int paramInt3) {
    int i = Dne(paramInt1, paramInt2, paramInt3);
    return (zKP.Dne[i] != null) ? zKP.Dne[i].Dne() : -1;
  }
  
  public boolean FWm(int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean) {
    if (paramInt1 >= -30000000 && paramInt3 >= -30000000 && paramInt1 < 30000000 && paramInt3 < 30000000) {
      qMV qMV = this.Dne.Dne(paramInt1 >> 4, paramInt3 >> 4);
      if (qMV != null && !qMV.Dne()) {
        dNT dNT = zKP.Dne[Dne(paramInt1, paramInt2, paramInt3)];
        return (dNT == null) ? false : ((dNT.Dne.DyG() && dNT.Dne()));
      } 
      return paramBoolean;
    } 
    return paramBoolean;
  }
  
  public EyB Dne(String paramString, int paramInt1, int paramInt2, int paramInt3) {
    return FWm().Dne(this, paramString, paramInt1, paramInt2, paramInt3);
  }
  
  public void FWm(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    if (paramInt3 > paramInt4) {
      int i = paramInt4;
      paramInt4 = paramInt3;
      paramInt3 = i;
    } 
    if (!((Jik)this.Dne).FWm)
      for (int i = paramInt3; i <= paramInt4; i++)
        Dne((udO)udO.Dne, paramInt1, i, paramInt2);  
    Dne(paramInt1, paramInt3, paramInt2, paramInt1, paramInt4, paramInt2);
  }
  
  public int Dne(int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean) {
    if (paramInt1 >= -30000000 && paramInt3 >= -30000000 && paramInt1 < 30000000 && paramInt3 < 30000000) {
      if (paramBoolean) {
        int i = Dne(paramInt1, paramInt2, paramInt3);
        if (zKP.Qnq[i] != null) {
          int j = Dne(paramInt1, paramInt2 + 1, paramInt3, false);
          int k = Dne(paramInt1 + 1, paramInt2, paramInt3, false);
          int m = Dne(paramInt1 - 1, paramInt2, paramInt3, false);
          int n = Dne(paramInt1, paramInt2, paramInt3 + 1, false);
          int i1 = Dne(paramInt1, paramInt2, paramInt3 - 1, false);
          if (k > j)
            j = k; 
          if (m > j)
            j = m; 
          if (n > j)
            j = n; 
          if (i1 > j)
            j = i1; 
          return j;
        } 
      } 
      if (paramInt2 < 0)
        return 0; 
      if (paramInt2 >= 256)
        paramInt2 = 255; 
      qMV qMV = FWm(paramInt1 >> 4, paramInt3 >> 4);
      paramInt1 &= 0xF;
      paramInt3 &= 0xF;
      return qMV.Dne(paramInt1, paramInt2, paramInt3, this.Dne);
    } 
    return 15;
  }
  
  public void FWm() {
    // Byte code:
    //   0: aload_0
    //   1: getfield Dne : LBkx;
    //   4: ldc_w 'entities'
    //   7: invokevirtual Dne : (Ljava/lang/String;)V
    //   10: aload_0
    //   11: getfield Dne : LBkx;
    //   14: ldc_w 'global'
    //   17: invokevirtual Dne : (Ljava/lang/String;)V
    //   20: iconst_0
    //   21: istore_1
    //   22: iload_1
    //   23: aload_0
    //   24: getfield aFZ : Ljava/util/List;
    //   27: invokeinterface size : ()I
    //   32: if_icmpge -> 146
    //   35: aload_0
    //   36: getfield aFZ : Ljava/util/List;
    //   39: iload_1
    //   40: invokeinterface get : (I)Ljava/lang/Object;
    //   45: checkcast sMa
    //   48: astore_2
    //   49: aload_2
    //   50: dup
    //   51: getfield zGp : I
    //   54: iconst_1
    //   55: iadd
    //   56: putfield zGp : I
    //   59: aload_2
    //   60: invokevirtual Dne : ()V
    //   63: goto -> 119
    //   66: astore #5
    //   68: aload #5
    //   70: ldc_w 'Ticking entity'
    //   73: invokestatic Dne : (Ljava/lang/Throwable;Ljava/lang/String;)LMcM;
    //   76: astore_3
    //   77: aload_3
    //   78: ldc_w 'Entity being ticked'
    //   81: invokevirtual Dne : (Ljava/lang/String;)LNoo;
    //   84: astore #4
    //   86: aload_2
    //   87: ifnonnull -> 104
    //   90: aload #4
    //   92: ldc_w 'Entity'
    //   95: ldc_w '~~NULL~~'
    //   98: invokevirtual Dne : (Ljava/lang/String;Ljava/lang/Object;)V
    //   101: goto -> 110
    //   104: aload_2
    //   105: aload #4
    //   107: invokevirtual Dne : (LNoo;)V
    //   110: new kaJ
    //   113: dup
    //   114: aload_3
    //   115: invokespecial <init> : (LMcM;)V
    //   118: athrow
    //   119: aload_2
    //   120: getfield Zpi : Z
    //   123: ifeq -> 140
    //   126: aload_0
    //   127: getfield aFZ : Ljava/util/List;
    //   130: iload_1
    //   131: iinc #1, -1
    //   134: invokeinterface remove : (I)Ljava/lang/Object;
    //   139: pop
    //   140: iinc #1, 1
    //   143: goto -> 22
    //   146: aload_0
    //   147: getfield Dne : LBkx;
    //   150: ldc_w 'remove'
    //   153: invokevirtual FWm : (Ljava/lang/String;)V
    //   156: aload_0
    //   157: getfield Dne : Ljava/util/List;
    //   160: aload_0
    //   161: getfield FWm : Ljava/util/List;
    //   164: invokeinterface removeAll : (Ljava/util/Collection;)Z
    //   169: pop
    //   170: iconst_0
    //   171: istore_1
    //   172: iload_1
    //   173: aload_0
    //   174: getfield FWm : Ljava/util/List;
    //   177: invokeinterface size : ()I
    //   182: if_icmpge -> 247
    //   185: aload_0
    //   186: getfield FWm : Ljava/util/List;
    //   189: iload_1
    //   190: invokeinterface get : (I)Ljava/lang/Object;
    //   195: checkcast sMa
    //   198: astore_2
    //   199: aload_2
    //   200: getfield IjH : I
    //   203: istore #5
    //   205: aload_2
    //   206: getfield XHL : I
    //   209: istore #6
    //   211: aload_2
    //   212: getfield trS : Z
    //   215: ifeq -> 241
    //   218: aload_0
    //   219: iload #5
    //   221: iload #6
    //   223: invokevirtual Dne : (II)Z
    //   226: ifeq -> 241
    //   229: aload_0
    //   230: iload #5
    //   232: iload #6
    //   234: invokevirtual FWm : (II)LqMV;
    //   237: aload_2
    //   238: invokevirtual FWm : (LsMa;)V
    //   241: iinc #1, 1
    //   244: goto -> 172
    //   247: iconst_0
    //   248: istore_1
    //   249: iload_1
    //   250: aload_0
    //   251: getfield FWm : Ljava/util/List;
    //   254: invokeinterface size : ()I
    //   259: if_icmpge -> 285
    //   262: aload_0
    //   263: aload_0
    //   264: getfield FWm : Ljava/util/List;
    //   267: iload_1
    //   268: invokeinterface get : (I)Ljava/lang/Object;
    //   273: checkcast sMa
    //   276: invokevirtual FWm : (LsMa;)V
    //   279: iinc #1, 1
    //   282: goto -> 249
    //   285: aload_0
    //   286: getfield FWm : Ljava/util/List;
    //   289: invokeinterface clear : ()V
    //   294: aload_0
    //   295: getfield Dne : LBkx;
    //   298: ldc_w 'regular'
    //   301: invokevirtual FWm : (Ljava/lang/String;)V
    //   304: iconst_0
    //   305: istore_1
    //   306: iload_1
    //   307: aload_0
    //   308: getfield Dne : Ljava/util/List;
    //   311: invokeinterface size : ()I
    //   316: if_icmpge -> 535
    //   319: aload_0
    //   320: getfield Dne : Ljava/util/List;
    //   323: iload_1
    //   324: invokeinterface get : (I)Ljava/lang/Object;
    //   329: checkcast sMa
    //   332: astore_2
    //   333: aload_2
    //   334: getfield FWm : LsMa;
    //   337: ifnull -> 377
    //   340: aload_2
    //   341: getfield FWm : LsMa;
    //   344: getfield Zpi : Z
    //   347: ifne -> 364
    //   350: aload_2
    //   351: getfield FWm : LsMa;
    //   354: getfield Dne : LsMa;
    //   357: aload_2
    //   358: if_acmpne -> 364
    //   361: goto -> 529
    //   364: aload_2
    //   365: getfield FWm : LsMa;
    //   368: aconst_null
    //   369: putfield Dne : LsMa;
    //   372: aload_2
    //   373: aconst_null
    //   374: putfield FWm : LsMa;
    //   377: aload_0
    //   378: getfield Dne : LBkx;
    //   381: ldc_w 'tick'
    //   384: invokevirtual Dne : (Ljava/lang/String;)V
    //   387: aload_2
    //   388: getfield Zpi : Z
    //   391: ifne -> 437
    //   394: aload_0
    //   395: aload_2
    //   396: invokevirtual aFZ : (LsMa;)V
    //   399: goto -> 437
    //   402: astore #7
    //   404: aload #7
    //   406: ldc_w 'Ticking entity'
    //   409: invokestatic Dne : (Ljava/lang/Throwable;Ljava/lang/String;)LMcM;
    //   412: astore_3
    //   413: aload_3
    //   414: ldc_w 'Entity being ticked'
    //   417: invokevirtual Dne : (Ljava/lang/String;)LNoo;
    //   420: astore #4
    //   422: aload_2
    //   423: aload #4
    //   425: invokevirtual Dne : (LNoo;)V
    //   428: new kaJ
    //   431: dup
    //   432: aload_3
    //   433: invokespecial <init> : (LMcM;)V
    //   436: athrow
    //   437: aload_0
    //   438: getfield Dne : LBkx;
    //   441: invokevirtual FWm : ()V
    //   444: aload_0
    //   445: getfield Dne : LBkx;
    //   448: ldc_w 'remove'
    //   451: invokevirtual Dne : (Ljava/lang/String;)V
    //   454: aload_2
    //   455: getfield Zpi : Z
    //   458: ifeq -> 522
    //   461: aload_2
    //   462: getfield IjH : I
    //   465: istore #5
    //   467: aload_2
    //   468: getfield XHL : I
    //   471: istore #6
    //   473: aload_2
    //   474: getfield trS : Z
    //   477: ifeq -> 503
    //   480: aload_0
    //   481: iload #5
    //   483: iload #6
    //   485: invokevirtual Dne : (II)Z
    //   488: ifeq -> 503
    //   491: aload_0
    //   492: iload #5
    //   494: iload #6
    //   496: invokevirtual FWm : (II)LqMV;
    //   499: aload_2
    //   500: invokevirtual FWm : (LsMa;)V
    //   503: aload_0
    //   504: getfield Dne : Ljava/util/List;
    //   507: iload_1
    //   508: iinc #1, -1
    //   511: invokeinterface remove : (I)Ljava/lang/Object;
    //   516: pop
    //   517: aload_0
    //   518: aload_2
    //   519: invokevirtual FWm : (LsMa;)V
    //   522: aload_0
    //   523: getfield Dne : LBkx;
    //   526: invokevirtual FWm : ()V
    //   529: iinc #1, 1
    //   532: goto -> 306
    //   535: aload_0
    //   536: getfield Dne : LBkx;
    //   539: ldc_w 'tileEntities'
    //   542: invokevirtual FWm : (Ljava/lang/String;)V
    //   545: aload_0
    //   546: iconst_1
    //   547: putfield zGp : Z
    //   550: aload_0
    //   551: getfield bzF : Ljava/util/List;
    //   554: invokeinterface iterator : ()Ljava/util/Iterator;
    //   559: astore #7
    //   561: aload #7
    //   563: invokeinterface hasNext : ()Z
    //   568: ifeq -> 755
    //   571: aload #7
    //   573: invokeinterface next : ()Ljava/lang/Object;
    //   578: checkcast ipD
    //   581: astore #8
    //   583: aload #8
    //   585: invokevirtual aFZ : ()Z
    //   588: ifne -> 665
    //   591: aload #8
    //   593: invokevirtual Qnq : ()Z
    //   596: ifeq -> 665
    //   599: aload_0
    //   600: aload #8
    //   602: getfield Qnq : I
    //   605: aload #8
    //   607: getfield aFZ : I
    //   610: aload #8
    //   612: getfield zGp : I
    //   615: invokevirtual bzF : (III)Z
    //   618: ifeq -> 665
    //   621: aload #8
    //   623: invokevirtual Dne : ()V
    //   626: goto -> 665
    //   629: astore #9
    //   631: aload #9
    //   633: ldc_w 'Ticking tile entity'
    //   636: invokestatic Dne : (Ljava/lang/Throwable;Ljava/lang/String;)LMcM;
    //   639: astore_3
    //   640: aload_3
    //   641: ldc_w 'Tile entity being ticked'
    //   644: invokevirtual Dne : (Ljava/lang/String;)LNoo;
    //   647: astore #4
    //   649: aload #8
    //   651: aload #4
    //   653: invokevirtual Dne : (LNoo;)V
    //   656: new kaJ
    //   659: dup
    //   660: aload_3
    //   661: invokespecial <init> : (LMcM;)V
    //   664: athrow
    //   665: aload #8
    //   667: invokevirtual aFZ : ()Z
    //   670: ifeq -> 752
    //   673: aload #7
    //   675: invokeinterface remove : ()V
    //   680: aload_0
    //   681: aload #8
    //   683: getfield Qnq : I
    //   686: iconst_4
    //   687: ishr
    //   688: aload #8
    //   690: getfield zGp : I
    //   693: iconst_4
    //   694: ishr
    //   695: invokevirtual Dne : (II)Z
    //   698: ifeq -> 752
    //   701: aload_0
    //   702: aload #8
    //   704: getfield Qnq : I
    //   707: iconst_4
    //   708: ishr
    //   709: aload #8
    //   711: getfield zGp : I
    //   714: iconst_4
    //   715: ishr
    //   716: invokevirtual FWm : (II)LqMV;
    //   719: astore #9
    //   721: aload #9
    //   723: ifnull -> 752
    //   726: aload #9
    //   728: aload #8
    //   730: getfield Qnq : I
    //   733: bipush #15
    //   735: iand
    //   736: aload #8
    //   738: getfield aFZ : I
    //   741: aload #8
    //   743: getfield zGp : I
    //   746: bipush #15
    //   748: iand
    //   749: invokevirtual Dne : (III)V
    //   752: goto -> 561
    //   755: aload_0
    //   756: iconst_0
    //   757: putfield zGp : Z
    //   760: aload_0
    //   761: getfield div : Ljava/util/List;
    //   764: invokeinterface isEmpty : ()Z
    //   769: ifne -> 795
    //   772: aload_0
    //   773: getfield bzF : Ljava/util/List;
    //   776: aload_0
    //   777: getfield div : Ljava/util/List;
    //   780: invokeinterface removeAll : (Ljava/util/Collection;)Z
    //   785: pop
    //   786: aload_0
    //   787: getfield div : Ljava/util/List;
    //   790: invokeinterface clear : ()V
    //   795: aload_0
    //   796: getfield Dne : LBkx;
    //   799: ldc_w 'pendingTileEntities'
    //   802: invokevirtual FWm : (Ljava/lang/String;)V
    //   805: aload_0
    //   806: getfield DyG : Ljava/util/List;
    //   809: invokeinterface isEmpty : ()Z
    //   814: ifne -> 992
    //   817: iconst_0
    //   818: istore #8
    //   820: iload #8
    //   822: aload_0
    //   823: getfield DyG : Ljava/util/List;
    //   826: invokeinterface size : ()I
    //   831: if_icmpge -> 983
    //   834: aload_0
    //   835: getfield DyG : Ljava/util/List;
    //   838: iload #8
    //   840: invokeinterface get : (I)Ljava/lang/Object;
    //   845: checkcast ipD
    //   848: astore #9
    //   850: aload #9
    //   852: invokevirtual aFZ : ()Z
    //   855: ifne -> 977
    //   858: aload_0
    //   859: getfield bzF : Ljava/util/List;
    //   862: aload #9
    //   864: invokeinterface contains : (Ljava/lang/Object;)Z
    //   869: ifne -> 884
    //   872: aload_0
    //   873: getfield bzF : Ljava/util/List;
    //   876: aload #9
    //   878: invokeinterface add : (Ljava/lang/Object;)Z
    //   883: pop
    //   884: aload_0
    //   885: aload #9
    //   887: getfield Qnq : I
    //   890: iconst_4
    //   891: ishr
    //   892: aload #9
    //   894: getfield zGp : I
    //   897: iconst_4
    //   898: ishr
    //   899: invokevirtual Dne : (II)Z
    //   902: ifeq -> 958
    //   905: aload_0
    //   906: aload #9
    //   908: getfield Qnq : I
    //   911: iconst_4
    //   912: ishr
    //   913: aload #9
    //   915: getfield zGp : I
    //   918: iconst_4
    //   919: ishr
    //   920: invokevirtual FWm : (II)LqMV;
    //   923: astore #10
    //   925: aload #10
    //   927: ifnull -> 958
    //   930: aload #10
    //   932: aload #9
    //   934: getfield Qnq : I
    //   937: bipush #15
    //   939: iand
    //   940: aload #9
    //   942: getfield aFZ : I
    //   945: aload #9
    //   947: getfield zGp : I
    //   950: bipush #15
    //   952: iand
    //   953: aload #9
    //   955: invokevirtual Dne : (IIILipD;)V
    //   958: aload_0
    //   959: aload #9
    //   961: getfield Qnq : I
    //   964: aload #9
    //   966: getfield aFZ : I
    //   969: aload #9
    //   971: getfield zGp : I
    //   974: invokevirtual Dne : (III)V
    //   977: iinc #8, 1
    //   980: goto -> 820
    //   983: aload_0
    //   984: getfield DyG : Ljava/util/List;
    //   987: invokeinterface clear : ()V
    //   992: aload_0
    //   993: getfield Dne : LBkx;
    //   996: invokevirtual FWm : ()V
    //   999: aload_0
    //   1000: getfield Dne : LBkx;
    //   1003: invokevirtual FWm : ()V
    //   1006: return
    // Exception table:
    //   from	to	target	type
    //   49	63	66	java/lang/Throwable
    //   394	399	402	java/lang/Throwable
    //   621	626	629	java/lang/Throwable
  }
  
  public boolean Dne(bSp parambSp, KFd paramKFd, sMa paramsMa) {
    int i = geR.FWm(parambSp.Dne);
    int j = geR.FWm(parambSp.Qnq + 1.0D);
    int k = geR.FWm(parambSp.FWm);
    int m = geR.FWm(parambSp.aFZ + 1.0D);
    int n = geR.FWm(parambSp.bzF);
    int i1 = geR.FWm(parambSp.zGp + 1.0D);
    if (!Dne(i, k, n, j, m, i1))
      return false; 
    boolean bool = false;
    chN chN = Dne().Dne(0.0D, 0.0D, 0.0D);
    for (int i2 = i; i2 < j; i2++) {
      for (int i3 = k; i3 < m; i3++) {
        for (int i4 = n; i4 < i1; i4++) {
          dNT dNT = zKP.Dne[Dne(i2, i3, i4)];
          if (dNT != null && dNT.Dne == paramKFd) {
            double d = ((i3 + 1) - byt.Dne(bzF(i2, i3, i4)));
            if (m >= d) {
              bool = true;
              dNT.Dne(this, i2, i3, i4, paramsMa, chN);
            } 
          } 
        } 
      } 
    } 
    if (chN.Dne() > 0.0D && paramsMa.oIf()) {
      chN = chN.Dne();
      double d = 0.014D;
      paramsMa.XHL += chN.Dne * d;
      paramsMa.Zpi += chN.FWm * d;
      paramsMa.kGO += chN.bzF * d;
    } 
    return bool;
  }
  
  public boolean Qnq() {
    return false;
  }
  
  public boolean bzF(int paramInt1, int paramInt2, int paramInt3) {
    return (paramInt2 >= 0 && paramInt2 < 256) ? Dne(paramInt1 >> 4, paramInt3 >> 4) : false;
  }
  
  public int Qnq(int paramInt1, int paramInt2) {
    return Dne(paramInt1, paramInt2).FWm(paramInt1 & 0xF, paramInt2 & 0xF);
  }
  
  public sMa Dne(Class paramClass, bSp parambSp, sMa paramsMa) {
    List<sMa> list = Dne(paramClass, parambSp);
    sMa sMa1 = null;
    double d = Double.MAX_VALUE;
    for (byte b = 0; b < list.size(); b++) {
      sMa sMa2 = list.get(b);
      if (sMa2 != paramsMa) {
        double d1 = paramsMa.Dne(sMa2);
        if (d1 <= d) {
          sMa1 = sMa2;
          d = d1;
        } 
      } 
    } 
    return sMa1;
  }
  
  protected void Dne(sMa paramsMa) {
    // Byte code:
    //   0: iconst_0
    //   1: istore_2
    //   2: iload_2
    //   3: aload_0
    //   4: getfield zGp : Ljava/util/List;
    //   7: invokeinterface size : ()I
    //   12: if_icmpge -> 40
    //   15: aload_0
    //   16: getfield zGp : Ljava/util/List;
    //   19: iload_2
    //   20: invokeinterface get : (I)Ljava/lang/Object;
    //   25: checkcast IjH
    //   28: aload_1
    //   29: invokeinterface Dne : (LsMa;)V
    //   34: iinc #2, 1
    //   37: goto -> 2
    //   40: return
  }
  
  public float bzF(float paramFloat) {
    float f = FWm(paramFloat);
    return f * 3.1415927F * 2.0F;
  }
  
  public void FWm(long paramLong) {
    this.Dne.FWm(paramLong);
  }
  
  public float Dne(float paramFloat) {
    float f1 = FWm(paramFloat);
    float f2 = 1.0F - geR.FWm(f1 * 3.1415927F * 2.0F) * 2.0F + 0.2F;
    if (f2 < 0.0F)
      f2 = 0.0F; 
    if (f2 > 1.0F)
      f2 = 1.0F; 
    f2 = 1.0F - f2;
    f2 = (float)(f2 * (1.0D - (zGp(paramFloat) * 5.0F) / 16.0D));
    f2 = (float)(f2 * (1.0D - (aFZ(paramFloat) * 5.0F) / 16.0D));
    return f2 * 0.8F + 0.2F;
  }
  
  public boolean XHL(int paramInt1, int paramInt2, int paramInt3) {
    return bzF(paramInt1, paramInt2, paramInt3, true);
  }
  
  public boolean aFZ(int paramInt1, int paramInt2, int paramInt3) {
    return FWm(paramInt1 >> 4, paramInt3 >> 4).Dne(paramInt1 & 0xF, paramInt2, paramInt3 & 0xF);
  }
  
  public SFA Dne() {
    return (SFA)this.Dne;
  }
  
  public boolean zGp(int paramInt1, int paramInt2, int paramInt3) {
    dNT dNT = zKP.Dne[Dne(paramInt1, paramInt2, paramInt3)];
    return (dNT == null) ? false : dNT.FWm();
  }
  
  public wHH Dne(chN paramchN1, chN paramchN2, boolean paramBoolean) {
    return Dne(paramchN1, paramchN2, paramBoolean, false);
  }
  
  public List Dne(Class paramClass, bSp parambSp) {
    return Dne(paramClass, parambSp, (pUe)null);
  }
  
  public qMV Dne(int paramInt1, int paramInt2) {
    return FWm(paramInt1 >> 4, paramInt2 >> 4);
  }
  
  public void bzF(int paramInt1, int paramInt2, int paramInt3) {
    ipD ipD = Dne(paramInt1, paramInt2, paramInt3);
    if (ipD != null && this.zGp != 0) {
      ipD.zGp();
      this.DyG.remove(ipD);
    } else {
      if (ipD != null) {
        this.DyG.remove(ipD);
        this.bzF.remove(ipD);
      } 
      qMV qMV = FWm(paramInt1 >> 4, paramInt3 >> 4);
      if (qMV != null)
        qMV.Dne(paramInt1 & 0xF, paramInt2, paramInt3 & 0xF); 
    } 
  }
  
  public void FWm(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5) {}
  
  public boolean DyG(int paramInt1, int paramInt2, int paramInt3) {
    return zKP.DyG(Dne(paramInt1, paramInt2, paramInt3));
  }
  
  public dLs Dne() {
    return (dLs)this.Dne;
  }
  
  public List Dne(sMa paramsMa, bSp parambSp, pUe parampUe) {
    ArrayList arrayList = new ArrayList();
    int i = geR.FWm((parambSp.Dne - 2.0D) / 16.0D);
    int j = geR.FWm((parambSp.Qnq + 2.0D) / 16.0D);
    int k = geR.FWm((parambSp.bzF - 2.0D) / 16.0D);
    int m = geR.FWm((parambSp.zGp + 2.0D) / 16.0D);
    for (int n = i; n <= j; n++) {
      for (int i1 = k; i1 <= m; i1++) {
        if (Dne(n, i1))
          FWm(n, i1).Dne(paramsMa, parambSp, arrayList, parampUe); 
      } 
    } 
    return arrayList;
  }
  
  public boolean Dne(sMa paramsMa) {
    this.aFZ.add(paramsMa);
    return true;
  }
  
  public void aFZ(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    for (byte b = 0; b < 4; b++) {
      int i = paramInt1 + zxJ.Dne[b];
      int j = paramInt3 + zxJ.FWm[b];
      int k = Dne(i, paramInt2, j);
      if (k != 0) {
        dNT dNT = zKP.Dne[k];
        if (zKP.Dne.aFZ(k)) {
          dNT.Dne(this, i, paramInt2, j, paramInt4);
        } else if (zKP.DyG(k)) {
          i += zxJ.Dne[b];
          j += zxJ.FWm[b];
          k = Dne(i, paramInt2, j);
          dNT = zKP.Dne[k];
          if (zKP.Dne.aFZ(k))
            dNT.Dne(this, i, paramInt2, j, paramInt4); 
        } 
      } 
    } 
  }
  
  public boolean Dne(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6) {
    if (paramInt5 >= 0 && paramInt2 < 256) {
      paramInt1 >>= 4;
      paramInt3 >>= 4;
      paramInt4 >>= 4;
      paramInt6 >>= 4;
      for (int i = paramInt1; i <= paramInt4; i++) {
        for (int j = paramInt3; j <= paramInt6; j++) {
          if (!Dne(i, j))
            return false; 
        } 
      } 
      return true;
    } 
    return false;
  }
  
  public int FWm() {
    return 256;
  }
  
  public void FWm(List paramList) {
    // Byte code:
    //   0: aload_0
    //   1: getfield FWm : Ljava/util/List;
    //   4: aload_1
    //   5: invokeinterface addAll : (Ljava/util/Collection;)Z
    //   10: pop
    //   11: return
  }
  
  public KFd Dne(int paramInt1, int paramInt2, int paramInt3) {
    int i = Dne(paramInt1, paramInt2, paramInt3);
    return (i == 0) ? KFd.Dne : (KFd)(zKP.Dne[i]).Dne;
  }
  
  public void Dne(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6) {
    // Byte code:
    //   0: iconst_0
    //   1: istore #7
    //   3: iload #7
    //   5: aload_0
    //   6: getfield zGp : Ljava/util/List;
    //   9: invokeinterface size : ()I
    //   14: if_icmpge -> 51
    //   17: aload_0
    //   18: getfield zGp : Ljava/util/List;
    //   21: iload #7
    //   23: invokeinterface get : (I)Ljava/lang/Object;
    //   28: checkcast IjH
    //   31: iload_1
    //   32: iload_2
    //   33: iload_3
    //   34: iload #4
    //   36: iload #5
    //   38: iload #6
    //   40: invokeinterface Dne : (IIIIII)V
    //   45: iinc #7, 1
    //   48: goto -> 3
    //   51: return
  }
  
  public int bzF(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    if (DyG(paramInt1, paramInt2, paramInt3))
      return zGp(paramInt1, paramInt2, paramInt3); 
    int i = Dne(paramInt1, paramInt2, paramInt3);
    return (i == 0) ? 0 : zKP.Dne[i].Dne(this, paramInt1, paramInt2, paramInt3, paramInt4);
  }
  
  public boolean FWm(bSp parambSp) {
    int i = geR.FWm(parambSp.Dne);
    int j = geR.FWm(parambSp.Qnq + 1.0D);
    int k = geR.FWm(parambSp.FWm);
    int m = geR.FWm(parambSp.aFZ + 1.0D);
    int n = geR.FWm(parambSp.bzF);
    int i1 = geR.FWm(parambSp.zGp + 1.0D);
    if (parambSp.Dne < 0.0D)
      i--; 
    if (parambSp.FWm < 0.0D)
      k--; 
    if (parambSp.bzF < 0.0D)
      n--; 
    for (int i2 = i; i2 < j; i2++) {
      for (int i3 = k; i3 < m; i3++) {
        for (int i4 = n; i4 < i1; i4++) {
          dNT dNT = zKP.Dne[Dne(i2, i3, i4)];
          if (dNT != null)
            return true; 
        } 
      } 
    } 
    return false;
  }
  
  public int aFZ(int paramInt1, int paramInt2, int paramInt3) {
    return Dne(paramInt1, paramInt2, paramInt3, true);
  }
  
  public void Dne(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    bzF(paramInt1, paramInt2, paramInt3, paramInt4);
  }
  
  public double Dne() {
    return (this.Dne.Dne() == kGO.FWm) ? 0.0D : 63.0D;
  }
  
  public boolean Dne(int paramInt1, int paramInt2, int paramInt3, int paramInt4, boolean paramBoolean, int paramInt5, sMa paramsMa, NMq paramNMq) {
    int i = Dne(paramInt2, paramInt3, paramInt4);
    dNT dNT1 = zKP.Dne[i];
    dNT dNT2 = zKP.Dne[paramInt1];
    bSp bSp = dNT2.Dne(this, paramInt2, paramInt3, paramInt4);
    if (paramBoolean)
      bSp = null; 
    if (bSp != null && !Dne(bSp, paramsMa))
      return false; 
    if (dNT1 != null && (dNT1 == zKP.Dne || dNT1 == zKP.DyG || dNT1 == zKP.FWm || dNT1 == zKP.div || dNT1 == zKP.Dne || dNT1.Dne.zGp()))
      dNT1 = null; 
    return (dNT1 != null && dNT1.Dne == KFd.qLR && dNT2 == zKP.etZ) ? true : ((paramInt1 > 0 && dNT1 == null && dNT2.Dne(this, paramInt2, paramInt3, paramInt4, paramInt5, paramNMq)));
  }
  
  public List Dne() {
    return (List)this.Dne;
  }
  
  public void Dne(udO paramudO, int paramInt1, int paramInt2, int paramInt3) {
    // Byte code:
    //   0: aload_0
    //   1: iload_2
    //   2: iload_3
    //   3: iload #4
    //   5: bipush #17
    //   7: invokevirtual Dne : (IIII)Z
    //   10: ifeq -> 975
    //   13: iconst_0
    //   14: istore #5
    //   16: iconst_0
    //   17: istore #6
    //   19: aload_0
    //   20: getfield Dne : LBkx;
    //   23: ldc_w 'getBrightness'
    //   26: invokevirtual Dne : (Ljava/lang/String;)V
    //   29: aload_0
    //   30: aload_1
    //   31: iload_2
    //   32: iload_3
    //   33: iload #4
    //   35: invokevirtual FWm : (LudO;III)I
    //   38: istore #7
    //   40: aload_0
    //   41: iload_2
    //   42: iload_3
    //   43: iload #4
    //   45: aload_1
    //   46: invokespecial Dne : (IIILudO;)I
    //   49: istore #8
    //   51: iload #8
    //   53: iload #7
    //   55: if_icmple -> 74
    //   58: aload_0
    //   59: getfield Dne : [I
    //   62: iload #6
    //   64: iinc #6, 1
    //   67: ldc_w 133152
    //   70: iastore
    //   71: goto -> 407
    //   74: iload #8
    //   76: iload #7
    //   78: if_icmpge -> 407
    //   81: aload_0
    //   82: getfield Dne : [I
    //   85: iload #6
    //   87: iinc #6, 1
    //   90: ldc_w 133152
    //   93: iload #7
    //   95: bipush #18
    //   97: ishl
    //   98: ior
    //   99: iastore
    //   100: iload #5
    //   102: iload #6
    //   104: if_icmpge -> 404
    //   107: aload_0
    //   108: getfield Dne : [I
    //   111: iload #5
    //   113: iinc #5, 1
    //   116: iaload
    //   117: istore #9
    //   119: iload #9
    //   121: bipush #63
    //   123: iand
    //   124: bipush #32
    //   126: isub
    //   127: iload_2
    //   128: iadd
    //   129: istore #10
    //   131: iload #9
    //   133: bipush #6
    //   135: ishr
    //   136: bipush #63
    //   138: iand
    //   139: bipush #32
    //   141: isub
    //   142: iload_3
    //   143: iadd
    //   144: istore #11
    //   146: iload #9
    //   148: bipush #12
    //   150: ishr
    //   151: bipush #63
    //   153: iand
    //   154: bipush #32
    //   156: isub
    //   157: iload #4
    //   159: iadd
    //   160: istore #12
    //   162: iload #9
    //   164: bipush #18
    //   166: ishr
    //   167: bipush #15
    //   169: iand
    //   170: istore #13
    //   172: aload_0
    //   173: aload_1
    //   174: iload #10
    //   176: iload #11
    //   178: iload #12
    //   180: invokevirtual FWm : (LudO;III)I
    //   183: istore #14
    //   185: iload #14
    //   187: iload #13
    //   189: if_icmpne -> 100
    //   192: aload_0
    //   193: aload_1
    //   194: iload #10
    //   196: iload #11
    //   198: iload #12
    //   200: iconst_0
    //   201: invokevirtual Dne : (LudO;IIII)V
    //   204: iload #13
    //   206: ifle -> 100
    //   209: iload #10
    //   211: iload_2
    //   212: isub
    //   213: invokestatic Dne : (I)I
    //   216: istore #15
    //   218: iload #11
    //   220: iload_3
    //   221: isub
    //   222: invokestatic Dne : (I)I
    //   225: istore #16
    //   227: iload #12
    //   229: iload #4
    //   231: isub
    //   232: invokestatic Dne : (I)I
    //   235: istore #17
    //   237: iload #15
    //   239: iload #16
    //   241: iadd
    //   242: iload #17
    //   244: iadd
    //   245: bipush #17
    //   247: if_icmpge -> 100
    //   250: iconst_0
    //   251: istore #18
    //   253: iload #18
    //   255: bipush #6
    //   257: if_icmpge -> 401
    //   260: iload #10
    //   262: getstatic rrP.FWm : [I
    //   265: iload #18
    //   267: iaload
    //   268: iadd
    //   269: istore #19
    //   271: iload #11
    //   273: getstatic rrP.bzF : [I
    //   276: iload #18
    //   278: iaload
    //   279: iadd
    //   280: istore #20
    //   282: iload #12
    //   284: getstatic rrP.Qnq : [I
    //   287: iload #18
    //   289: iaload
    //   290: iadd
    //   291: istore #21
    //   293: iconst_1
    //   294: getstatic zKP.FWm : [I
    //   297: aload_0
    //   298: iload #19
    //   300: iload #20
    //   302: iload #21
    //   304: invokevirtual Dne : (III)I
    //   307: iaload
    //   308: invokestatic max : (II)I
    //   311: istore #22
    //   313: aload_0
    //   314: aload_1
    //   315: iload #19
    //   317: iload #20
    //   319: iload #21
    //   321: invokevirtual FWm : (LudO;III)I
    //   324: istore #14
    //   326: iload #14
    //   328: iload #13
    //   330: iload #22
    //   332: isub
    //   333: if_icmpne -> 395
    //   336: iload #6
    //   338: aload_0
    //   339: getfield Dne : [I
    //   342: arraylength
    //   343: if_icmpge -> 395
    //   346: aload_0
    //   347: getfield Dne : [I
    //   350: iload #6
    //   352: iinc #6, 1
    //   355: iload #19
    //   357: iload_2
    //   358: isub
    //   359: bipush #32
    //   361: iadd
    //   362: iload #20
    //   364: iload_3
    //   365: isub
    //   366: bipush #32
    //   368: iadd
    //   369: bipush #6
    //   371: ishl
    //   372: ior
    //   373: iload #21
    //   375: iload #4
    //   377: isub
    //   378: bipush #32
    //   380: iadd
    //   381: bipush #12
    //   383: ishl
    //   384: ior
    //   385: iload #13
    //   387: iload #22
    //   389: isub
    //   390: bipush #18
    //   392: ishl
    //   393: ior
    //   394: iastore
    //   395: iinc #18, 1
    //   398: goto -> 253
    //   401: goto -> 100
    //   404: iconst_0
    //   405: istore #5
    //   407: aload_0
    //   408: getfield Dne : LBkx;
    //   411: invokevirtual FWm : ()V
    //   414: aload_0
    //   415: getfield Dne : LBkx;
    //   418: ldc_w 'checkedPosition < toCheckCount'
    //   421: invokevirtual Dne : (Ljava/lang/String;)V
    //   424: iload #5
    //   426: iload #6
    //   428: if_icmpge -> 968
    //   431: aload_0
    //   432: getfield Dne : [I
    //   435: iload #5
    //   437: iinc #5, 1
    //   440: iaload
    //   441: istore #9
    //   443: iload #9
    //   445: bipush #63
    //   447: iand
    //   448: bipush #32
    //   450: isub
    //   451: iload_2
    //   452: iadd
    //   453: istore #10
    //   455: iload #9
    //   457: bipush #6
    //   459: ishr
    //   460: bipush #63
    //   462: iand
    //   463: bipush #32
    //   465: isub
    //   466: iload_3
    //   467: iadd
    //   468: istore #11
    //   470: iload #9
    //   472: bipush #12
    //   474: ishr
    //   475: bipush #63
    //   477: iand
    //   478: bipush #32
    //   480: isub
    //   481: iload #4
    //   483: iadd
    //   484: istore #12
    //   486: aload_0
    //   487: aload_1
    //   488: iload #10
    //   490: iload #11
    //   492: iload #12
    //   494: invokevirtual FWm : (LudO;III)I
    //   497: istore #13
    //   499: aload_0
    //   500: iload #10
    //   502: iload #11
    //   504: iload #12
    //   506: aload_1
    //   507: invokespecial Dne : (IIILudO;)I
    //   510: istore #14
    //   512: iload #14
    //   514: iload #13
    //   516: if_icmpeq -> 424
    //   519: aload_0
    //   520: aload_1
    //   521: iload #10
    //   523: iload #11
    //   525: iload #12
    //   527: iload #14
    //   529: invokevirtual Dne : (LudO;IIII)V
    //   532: iload #14
    //   534: iload #13
    //   536: if_icmple -> 424
    //   539: iload #10
    //   541: iload_2
    //   542: isub
    //   543: invokestatic abs : (I)I
    //   546: istore #15
    //   548: iload #11
    //   550: iload_3
    //   551: isub
    //   552: invokestatic abs : (I)I
    //   555: istore #16
    //   557: iload #12
    //   559: iload #4
    //   561: isub
    //   562: invokestatic abs : (I)I
    //   565: istore #17
    //   567: iload #6
    //   569: aload_0
    //   570: getfield Dne : [I
    //   573: arraylength
    //   574: bipush #6
    //   576: isub
    //   577: if_icmpge -> 584
    //   580: iconst_1
    //   581: goto -> 585
    //   584: iconst_0
    //   585: istore #18
    //   587: iload #15
    //   589: iload #16
    //   591: iadd
    //   592: iload #17
    //   594: iadd
    //   595: bipush #17
    //   597: if_icmpge -> 965
    //   600: iload #18
    //   602: ifeq -> 965
    //   605: aload_0
    //   606: aload_1
    //   607: iload #10
    //   609: iconst_1
    //   610: isub
    //   611: iload #11
    //   613: iload #12
    //   615: invokevirtual FWm : (LudO;III)I
    //   618: iload #14
    //   620: if_icmpge -> 665
    //   623: aload_0
    //   624: getfield Dne : [I
    //   627: iload #6
    //   629: iinc #6, 1
    //   632: iload #10
    //   634: iconst_1
    //   635: isub
    //   636: iload_2
    //   637: isub
    //   638: bipush #32
    //   640: iadd
    //   641: iload #11
    //   643: iload_3
    //   644: isub
    //   645: bipush #32
    //   647: iadd
    //   648: bipush #6
    //   650: ishl
    //   651: iadd
    //   652: iload #12
    //   654: iload #4
    //   656: isub
    //   657: bipush #32
    //   659: iadd
    //   660: bipush #12
    //   662: ishl
    //   663: iadd
    //   664: iastore
    //   665: aload_0
    //   666: aload_1
    //   667: iload #10
    //   669: iconst_1
    //   670: iadd
    //   671: iload #11
    //   673: iload #12
    //   675: invokevirtual FWm : (LudO;III)I
    //   678: iload #14
    //   680: if_icmpge -> 725
    //   683: aload_0
    //   684: getfield Dne : [I
    //   687: iload #6
    //   689: iinc #6, 1
    //   692: iload #10
    //   694: iconst_1
    //   695: iadd
    //   696: iload_2
    //   697: isub
    //   698: bipush #32
    //   700: iadd
    //   701: iload #11
    //   703: iload_3
    //   704: isub
    //   705: bipush #32
    //   707: iadd
    //   708: bipush #6
    //   710: ishl
    //   711: iadd
    //   712: iload #12
    //   714: iload #4
    //   716: isub
    //   717: bipush #32
    //   719: iadd
    //   720: bipush #12
    //   722: ishl
    //   723: iadd
    //   724: iastore
    //   725: aload_0
    //   726: aload_1
    //   727: iload #10
    //   729: iload #11
    //   731: iconst_1
    //   732: isub
    //   733: iload #12
    //   735: invokevirtual FWm : (LudO;III)I
    //   738: iload #14
    //   740: if_icmpge -> 785
    //   743: aload_0
    //   744: getfield Dne : [I
    //   747: iload #6
    //   749: iinc #6, 1
    //   752: iload #10
    //   754: iload_2
    //   755: isub
    //   756: bipush #32
    //   758: iadd
    //   759: iload #11
    //   761: iconst_1
    //   762: isub
    //   763: iload_3
    //   764: isub
    //   765: bipush #32
    //   767: iadd
    //   768: bipush #6
    //   770: ishl
    //   771: iadd
    //   772: iload #12
    //   774: iload #4
    //   776: isub
    //   777: bipush #32
    //   779: iadd
    //   780: bipush #12
    //   782: ishl
    //   783: iadd
    //   784: iastore
    //   785: aload_0
    //   786: aload_1
    //   787: iload #10
    //   789: iload #11
    //   791: iconst_1
    //   792: iadd
    //   793: iload #12
    //   795: invokevirtual FWm : (LudO;III)I
    //   798: iload #14
    //   800: if_icmpge -> 845
    //   803: aload_0
    //   804: getfield Dne : [I
    //   807: iload #6
    //   809: iinc #6, 1
    //   812: iload #10
    //   814: iload_2
    //   815: isub
    //   816: bipush #32
    //   818: iadd
    //   819: iload #11
    //   821: iconst_1
    //   822: iadd
    //   823: iload_3
    //   824: isub
    //   825: bipush #32
    //   827: iadd
    //   828: bipush #6
    //   830: ishl
    //   831: iadd
    //   832: iload #12
    //   834: iload #4
    //   836: isub
    //   837: bipush #32
    //   839: iadd
    //   840: bipush #12
    //   842: ishl
    //   843: iadd
    //   844: iastore
    //   845: aload_0
    //   846: aload_1
    //   847: iload #10
    //   849: iload #11
    //   851: iload #12
    //   853: iconst_1
    //   854: isub
    //   855: invokevirtual FWm : (LudO;III)I
    //   858: iload #14
    //   860: if_icmpge -> 905
    //   863: aload_0
    //   864: getfield Dne : [I
    //   867: iload #6
    //   869: iinc #6, 1
    //   872: iload #10
    //   874: iload_2
    //   875: isub
    //   876: bipush #32
    //   878: iadd
    //   879: iload #11
    //   881: iload_3
    //   882: isub
    //   883: bipush #32
    //   885: iadd
    //   886: bipush #6
    //   888: ishl
    //   889: iadd
    //   890: iload #12
    //   892: iconst_1
    //   893: isub
    //   894: iload #4
    //   896: isub
    //   897: bipush #32
    //   899: iadd
    //   900: bipush #12
    //   902: ishl
    //   903: iadd
    //   904: iastore
    //   905: aload_0
    //   906: aload_1
    //   907: iload #10
    //   909: iload #11
    //   911: iload #12
    //   913: iconst_1
    //   914: iadd
    //   915: invokevirtual FWm : (LudO;III)I
    //   918: iload #14
    //   920: if_icmpge -> 965
    //   923: aload_0
    //   924: getfield Dne : [I
    //   927: iload #6
    //   929: iinc #6, 1
    //   932: iload #10
    //   934: iload_2
    //   935: isub
    //   936: bipush #32
    //   938: iadd
    //   939: iload #11
    //   941: iload_3
    //   942: isub
    //   943: bipush #32
    //   945: iadd
    //   946: bipush #6
    //   948: ishl
    //   949: iadd
    //   950: iload #12
    //   952: iconst_1
    //   953: iadd
    //   954: iload #4
    //   956: isub
    //   957: bipush #32
    //   959: iadd
    //   960: bipush #12
    //   962: ishl
    //   963: iadd
    //   964: iastore
    //   965: goto -> 424
    //   968: aload_0
    //   969: getfield Dne : LBkx;
    //   972: invokevirtual FWm : ()V
    //   975: return
  }
  
  public void Dne(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5) {
    if (paramInt5 != 4)
      Qnq(paramInt1 - 1, paramInt2, paramInt3, paramInt4); 
    if (paramInt5 != 5)
      Qnq(paramInt1 + 1, paramInt2, paramInt3, paramInt4); 
    if (paramInt5 != 0)
      Qnq(paramInt1, paramInt2 - 1, paramInt3, paramInt4); 
    if (paramInt5 != 1)
      Qnq(paramInt1, paramInt2 + 1, paramInt3, paramInt4); 
    if (paramInt5 != 2)
      Qnq(paramInt1, paramInt2, paramInt3 - 1, paramInt4); 
    if (paramInt5 != 3)
      Qnq(paramInt1, paramInt2, paramInt3 + 1, paramInt4); 
  }
  
  public long FWm() {
    return this.Dne.FWm();
  }
  
  public boolean FWm() {
    return (aFZ(1.0F) > 0.9D);
  }
  
  public boolean Dne() {
    return (this.Dne < 4);
  }
  
  public qMV FWm(int paramInt1, int paramInt2) {
    return this.Dne.Dne(paramInt1, paramInt2);
  }
  
  public boolean FWm(sMa paramsMa) {
    // Byte code:
    //   0: aload_1
    //   1: getfield div : D
    //   4: ldc2_w 16.0
    //   7: ddiv
    //   8: invokestatic FWm : (D)I
    //   11: istore_2
    //   12: aload_1
    //   13: getfield mrb : D
    //   16: ldc2_w 16.0
    //   19: ddiv
    //   20: invokestatic FWm : (D)I
    //   23: istore_3
    //   24: aload_1
    //   25: getfield Qnq : Z
    //   28: istore #4
    //   30: aload_1
    //   31: instanceof FiG
    //   34: ifeq -> 40
    //   37: iconst_1
    //   38: istore #4
    //   40: iload #4
    //   42: ifne -> 56
    //   45: aload_0
    //   46: iload_2
    //   47: iload_3
    //   48: invokevirtual Dne : (II)Z
    //   51: ifne -> 56
    //   54: iconst_0
    //   55: ireturn
    //   56: aload_1
    //   57: instanceof FiG
    //   60: ifeq -> 85
    //   63: aload_1
    //   64: checkcast FiG
    //   67: astore #5
    //   69: aload_0
    //   70: getfield Qnq : Ljava/util/List;
    //   73: aload #5
    //   75: invokeinterface add : (Ljava/lang/Object;)Z
    //   80: pop
    //   81: aload_0
    //   82: invokevirtual XHL : ()V
    //   85: aload_0
    //   86: iload_2
    //   87: iload_3
    //   88: invokevirtual FWm : (II)LqMV;
    //   91: aload_1
    //   92: invokevirtual Dne : (LsMa;)V
    //   95: aload_0
    //   96: getfield Dne : Ljava/util/List;
    //   99: aload_1
    //   100: invokeinterface add : (Ljava/lang/Object;)Z
    //   105: pop
    //   106: aload_0
    //   107: aload_1
    //   108: invokevirtual Dne : (LsMa;)V
    //   111: iconst_1
    //   112: ireturn
  }
  
  public void XHL() {}
  
  public void Dne(ipD paramipD) {
    this.div.add(paramipD);
  }
  
  public void FWm(IjH paramIjH) {
    // Byte code:
    //   0: aload_0
    //   1: getfield zGp : Ljava/util/List;
    //   4: aload_1
    //   5: invokeinterface remove : (Ljava/lang/Object;)Z
    //   10: pop
    //   11: return
  }
  
  public void Qnq(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5) {
    Dne((FiG)null, paramInt1, paramInt2, paramInt3, paramInt4, paramInt5);
  }
  
  public List Dne(bSp parambSp) {
    this.Dne.clear();
    int i = geR.FWm(parambSp.Dne);
    int j = geR.FWm(parambSp.Qnq + 1.0D);
    int k = geR.FWm(parambSp.FWm);
    int m = geR.FWm(parambSp.aFZ + 1.0D);
    int n = geR.FWm(parambSp.bzF);
    int i1 = geR.FWm(parambSp.zGp + 1.0D);
    for (int i2 = i; i2 < j; i2++) {
      for (int i3 = n; i3 < i1; i3++) {
        if (bzF(i2, 64, i3))
          for (int i4 = k - 1; i4 < m; i4++) {
            dNT dNT = zKP.Dne[Dne(i2, i4, i3)];
            if (dNT != null)
              dNT.Dne(this, i2, i4, i3, parambSp, (List)this.Dne, (sMa)null); 
          }  
      } 
    } 
    return (List)this.Dne;
  }
  
  public wdG Dne(sMa paramsMa, int paramInt1, int paramInt2, int paramInt3, float paramFloat, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, boolean paramBoolean4) {
    this.Dne.Dne("pathfind");
    int i = geR.FWm(paramsMa.div);
    int j = geR.FWm(paramsMa.IjH);
    int k = geR.FWm(paramsMa.mrb);
    int m = (int)(paramFloat + 8.0F);
    int n = i - m;
    int i1 = j - m;
    int i2 = k - m;
    int i3 = i + m;
    int i4 = j + m;
    int i5 = k + m;
    ATE aTE = new ATE(this, n, i1, i2, i3, i4, i5, 0);
    wdG wdG = (new Seh(aTE, paramBoolean1, paramBoolean2, paramBoolean3, paramBoolean4)).Dne(paramsMa, paramInt1, paramInt2, paramInt3, paramFloat);
    this.Dne.FWm();
    return wdG;
  }
  
  protected abstract ZfC Dne();
  
  public boolean bzF() {
    return (zGp(1.0F) > 0.2D);
  }
  
  public boolean bzF(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    return false;
  }
  
  public long bzF() {
    return this.Dne.bzF();
  }
  
  public boolean bzF(int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean) {
    OdI odI = Dne(paramInt1, paramInt3);
    float f = odI.bzF();
    if (f > 0.15F)
      return false; 
    if (paramInt2 >= 0 && paramInt2 < 256 && FWm(udO.FWm, paramInt1, paramInt2, paramInt3) < 10) {
      int i = Dne(paramInt1, paramInt2, paramInt3);
      if ((i == ((zKP)zKP.DyG).FWm || i == ((byt)zKP.Dne).FWm) && bzF(paramInt1, paramInt2, paramInt3) == 0) {
        if (!paramBoolean)
          return true; 
        boolean bool = true;
        if (bool && Dne(paramInt1 - 1, paramInt2, paramInt3) != KFd.div)
          bool = false; 
        if (bool && Dne(paramInt1 + 1, paramInt2, paramInt3) != KFd.div)
          bool = false; 
        if (bool && Dne(paramInt1, paramInt2, paramInt3 - 1) != KFd.div)
          bool = false; 
        if (bool && Dne(paramInt1, paramInt2, paramInt3 + 1) != KFd.div)
          bool = false; 
        if (!bool)
          return true; 
      } 
    } 
    return false;
  }
  
  protected void Dne(mrb parammrb) {
    this.Dne.bzF(true);
  }
  
  public boolean Dne(bSp parambSp, KFd paramKFd) {
    int i = geR.FWm(parambSp.Dne);
    int j = geR.FWm(parambSp.Qnq + 1.0D);
    int k = geR.FWm(parambSp.FWm);
    int m = geR.FWm(parambSp.aFZ + 1.0D);
    int n = geR.FWm(parambSp.bzF);
    int i1 = geR.FWm(parambSp.zGp + 1.0D);
    for (int i2 = i; i2 < j; i2++) {
      for (int i3 = k; i3 < m; i3++) {
        for (int i4 = n; i4 < i1; i4++) {
          dNT dNT = zKP.Dne[Dne(i2, i3, i4)];
          if (dNT != null && dNT.Dne == paramKFd)
            return true; 
        } 
      } 
    } 
    return false;
  }
  
  public Qnq(iDE paramiDE, String paramString, mrb parammrb, Jik paramJik, Bkx paramBkx, dLs paramdLs) {
    this.Dne = (ZfC)new ArrayList();
    this.FWm = new ArrayList();
    this.bzF = new ArrayList();
    this.DyG = new ArrayList();
    this.div = new ArrayList();
    this.Qnq = new ArrayList();
    this.aFZ = new ArrayList();
    this.Dne = 16777215L;
    this.Dne = false;
    this.FWm = (new Random()).nextInt();
    this.bzF = 1013904223;
    this.Qnq = false;
    this.Dne = (ZfC)new Random();
    this.zGp = new ArrayList();
    this.Dne = (ZfC)new oJI(this);
    this.Dne = (ZfC)new ziS(300, 2000);
    this.Dne = (ZfC)Calendar.getInstance();
    this.Dne = (ZfC)new SFA();
    this.Dne = (ZfC)new ArrayList();
    this.bzF = true;
    this.Qnq = true;
    this.Dne = (ZfC)new HashSet();
    this.zGp = this.Dne.nextInt(12000);
    this.Dne = (ZfC)new int[32768];
    this.aFZ = false;
    this.Dne = (ZfC)paramiDE;
    this.Dne = (ZfC)paramBkx;
    this.Dne = (ZfC)new LLx(paramiDE);
    this.Dne = (ZfC)paramdLs;
    this.Dne = (ZfC)paramiDE.Dne();
    if (paramJik != null) {
      this.Dne = (ZfC)paramJik;
    } else if (this.Dne != null && this.Dne.Qnq() != 0) {
      this.Dne = (ZfC)Jik.Dne(this.Dne.Qnq());
    } else {
      this.Dne = (ZfC)Jik.Dne(0);
    } 
    if (this.Dne == null) {
      this.Dne = (ZfC)new xoY(parammrb, paramString);
    } else {
      this.Dne.Dne(paramString);
    } 
    this.Dne.Dne(this);
    this.Dne = Dne();
    if (!this.Dne.zGp()) {
      try {
        Dne(parammrb);
      } catch (Throwable throwable) {
        McM mcM = McM.Dne(throwable, "Exception initializing level");
        try {
          Dne(mcM);
        } catch (Throwable throwable1) {}
        throw new kaJ(mcM);
      } 
      this.Dne.bzF(true);
    } 
    PrX prX = (PrX)this.Dne.Dne(PrX.class, "villages");
    if (prX == null) {
      this.Dne = (ZfC)new PrX(this);
      this.Dne.Dne("villages", (vWZ)this.Dne);
    } else {
      this.Dne = (ZfC)prX;
      this.Dne.Dne(this);
    } 
    bzF();
    Zpi();
    xNA.Dne((xoY)this.Dne);
  }
  
  public Noo Dne(McM paramMcM) {
    Noo noo = paramMcM.Dne("Affected level", 1);
    noo.Dne("Level name", (this.Dne == null) ? "????" : this.Dne.Dne());
    noo.Dne("All players", new zGp(this));
    noo.Dne("Chunk stats", new DyG(this));
    try {
      this.Dne.Dne(noo);
    } catch (Throwable throwable) {
      noo.Dne("Level Data Unobtainable", throwable);
    } 
    return noo;
  }
  
  public ziS Dne() {
    return (ziS)this.Dne;
  }
  
  public ZfC FWm() {
    return this.Dne;
  }
  
  protected void div() {
    DyG();
  }
  
  public Calendar Dne() {
    if (FWm() % 600L == 0L)
      this.Dne.setTimeInMillis(System.currentTimeMillis()); 
    return (Calendar)this.Dne;
  }
  
  public void Qnq() {
    aFZ();
  }
  
  public wdG Dne(sMa paramsMa1, sMa paramsMa2, float paramFloat, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, boolean paramBoolean4) {
    this.Dne.Dne("pathfind");
    int i = geR.FWm(paramsMa1.div);
    int j = geR.FWm(paramsMa1.IjH + 1.0D);
    int k = geR.FWm(paramsMa1.mrb);
    int m = (int)(paramFloat + 16.0F);
    int n = i - m;
    int i1 = j - m;
    int i2 = k - m;
    int i3 = i + m;
    int i4 = j + m;
    int i5 = k + m;
    ATE aTE = new ATE(this, n, i1, i2, i3, i4, i5, 0);
    wdG wdG = (new Seh(aTE, paramBoolean1, paramBoolean2, paramBoolean3, paramBoolean4)).Dne(paramsMa1, paramsMa2, paramFloat);
    this.Dne.FWm();
    return wdG;
  }
  
  public int Dne() {
    return this.Dne.Dne(this.Dne.bzF());
  }
  
  public yTR Dne(sMa paramsMa, double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat, boolean paramBoolean1, boolean paramBoolean2) {
    yTR yTR = new yTR(this, paramsMa, paramDouble1, paramDouble2, paramDouble3, paramFloat);
    yTR.Dne = paramBoolean1;
    yTR.FWm = paramBoolean2;
    yTR.Dne();
    yTR.Dne(true);
    return yTR;
  }
  
  public Qnq(iDE paramiDE, String paramString, Jik paramJik, mrb parammrb, Bkx paramBkx, dLs paramdLs) {
    this.Dne = (ZfC)new ArrayList();
    this.FWm = new ArrayList();
    this.bzF = new ArrayList();
    this.DyG = new ArrayList();
    this.div = new ArrayList();
    this.Qnq = new ArrayList();
    this.aFZ = new ArrayList();
    this.Dne = 16777215L;
    this.Dne = false;
    this.FWm = (new Random()).nextInt();
    this.bzF = 1013904223;
    this.Qnq = false;
    this.Dne = (ZfC)new Random();
    this.zGp = new ArrayList();
    this.Dne = (ZfC)new oJI(this);
    this.Dne = (ZfC)new ziS(300, 2000);
    this.Dne = (ZfC)Calendar.getInstance();
    this.Dne = (ZfC)new SFA();
    this.Dne = (ZfC)new ArrayList();
    this.bzF = true;
    this.Qnq = true;
    this.Dne = (ZfC)new HashSet();
    this.zGp = this.Dne.nextInt(12000);
    this.Dne = (ZfC)new int[32768];
    this.aFZ = false;
    this.Dne = (ZfC)paramiDE;
    this.Dne = (ZfC)paramBkx;
    this.Dne = (ZfC)new xoY(parammrb, paramString);
    this.Dne = (ZfC)paramJik;
    this.Dne = (ZfC)new LLx(paramiDE);
    this.Dne = (ZfC)paramdLs;
    PrX prX = (PrX)this.Dne.Dne(PrX.class, "villages");
    if (prX == null) {
      this.Dne = (ZfC)new PrX(this);
      this.Dne.Dne("villages", (vWZ)this.Dne);
    } else {
      this.Dne = (ZfC)prX;
      this.Dne.Dne(this);
    } 
    paramJik.Dne(this);
    this.Dne = Dne();
    bzF();
    Zpi();
    xNA.Dne((xoY)this.Dne);
  }
  
  public void bzF(sMa paramsMa) {
    // Byte code:
    //   0: aload_1
    //   1: getfield Dne : LsMa;
    //   4: ifnull -> 18
    //   7: aload_1
    //   8: getfield Dne : LsMa;
    //   11: aconst_null
    //   12: checkcast sMa
    //   15: invokevirtual bzF : (LsMa;)V
    //   18: aload_1
    //   19: getfield FWm : LsMa;
    //   22: ifnull -> 33
    //   25: aload_1
    //   26: aconst_null
    //   27: checkcast sMa
    //   30: invokevirtual bzF : (LsMa;)V
    //   33: aload_1
    //   34: invokevirtual g_ : ()V
    //   37: aload_1
    //   38: instanceof FiG
    //   41: ifeq -> 59
    //   44: aload_0
    //   45: getfield Qnq : Ljava/util/List;
    //   48: aload_1
    //   49: invokeinterface remove : (Ljava/lang/Object;)Z
    //   54: pop
    //   55: aload_0
    //   56: invokevirtual XHL : ()V
    //   59: return
  }
  
  public boolean udO(int paramInt1, int paramInt2, int paramInt3) {
    if (!bzF())
      return false; 
    if (!aFZ(paramInt1, paramInt2, paramInt3))
      return false; 
    if (Qnq(paramInt1, paramInt3) > paramInt2)
      return false; 
    OdI odI = Dne(paramInt1, paramInt3);
    return odI.Dne() ? false : odI.FWm();
  }
  
  public float Dne(chN paramchN, bSp parambSp) {
    double d1 = 1.0D / ((parambSp.Qnq - parambSp.Dne) * 2.0D + 1.0D);
    double d2 = 1.0D / ((parambSp.aFZ - parambSp.FWm) * 2.0D + 1.0D);
    double d3 = 1.0D / ((parambSp.zGp - parambSp.bzF) * 2.0D + 1.0D);
    byte b1 = 0;
    byte b2 = 0;
    float f;
    for (f = 0.0F; f <= 1.0F; f = (float)(f + d1)) {
      float f1;
      for (f1 = 0.0F; f1 <= 1.0F; f1 = (float)(f1 + d2)) {
        float f2;
        for (f2 = 0.0F; f2 <= 1.0F; f2 = (float)(f2 + d3)) {
          double d4 = parambSp.Dne + (parambSp.Qnq - parambSp.Dne) * f;
          double d5 = parambSp.FWm + (parambSp.aFZ - parambSp.FWm) * f1;
          double d6 = parambSp.bzF + (parambSp.zGp - parambSp.bzF) * f2;
          if (Dne(Dne().Dne(d4, d5, d6), paramchN) == null)
            b1++; 
          b2++;
        } 
      } 
    } 
    return b1 / b2;
  }
  
  public void Dne(double paramDouble1, double paramDouble2, double paramDouble3, String paramString, float paramFloat1, float paramFloat2, boolean paramBoolean) {}
  
  public int FWm(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    int i = Dne(paramInt1, paramInt2, paramInt3);
    return (i == 0) ? 0 : zKP.Dne[i].FWm(this, paramInt1, paramInt2, paramInt3, paramInt4);
  }
  
  public void FWm(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6) {}
  
  public void Dne(long paramLong) {
    this.Dne.Dne(paramLong);
  }
  
  public List Dne(Class paramClass, bSp parambSp, pUe parampUe) {
    int i = geR.FWm((parambSp.Dne - 2.0D) / 16.0D);
    int j = geR.FWm((parambSp.Qnq + 2.0D) / 16.0D);
    int k = geR.FWm((parambSp.bzF - 2.0D) / 16.0D);
    int m = geR.FWm((parambSp.zGp + 2.0D) / 16.0D);
    ArrayList arrayList = new ArrayList();
    for (int n = i; n <= j; n++) {
      for (int i1 = k; i1 <= m; i1++) {
        if (Dne(n, i1))
          FWm(n, i1).Dne(paramClass, parambSp, arrayList, parampUe); 
      } 
    } 
    return arrayList;
  }
  
  public boolean Dne(bSp parambSp) {
    return Dne(parambSp, (sMa)null);
  }
  
  public boolean Dne(bSp parambSp, sMa paramsMa) {
    List<sMa> list = FWm((sMa)null, parambSp);
    for (byte b = 0; b < list.size(); b++) {
      sMa sMa1 = list.get(b);
      if (sMa1.Zpi == 0.0F && sMa1.bzF != 0 && sMa1 != paramsMa)
        return false; 
    } 
    return true;
  }
  
  public void Dne(sMa paramsMa, boolean paramBoolean) {
    int i = geR.FWm(paramsMa.div);
    int j = geR.FWm(paramsMa.mrb);
    byte b = 32;
    if (!paramBoolean || Dne(i - b, 0, j - b, i + b, 0, j + b)) {
      paramsMa.udO = paramsMa.div;
      paramsMa.ooe = paramsMa.IjH;
      paramsMa.trS = paramsMa.mrb;
      paramsMa.Zpi = paramsMa.mrb;
      paramsMa.kGO = paramsMa.XHL;
      if (paramBoolean && paramsMa.trS != 0.0F)
        if (paramsMa.FWm != null) {
          paramsMa.vSL();
        } else {
          paramsMa.zGp++;
          paramsMa.Dne();
        }  
      this.Dne.Dne("chunkCheck");
      if (Double.isNaN(paramsMa.div) || Double.isInfinite(paramsMa.div))
        paramsMa.div = paramsMa.udO; 
      if (Double.isNaN(paramsMa.IjH) || Double.isInfinite(paramsMa.IjH))
        paramsMa.IjH = paramsMa.ooe; 
      if (Double.isNaN(paramsMa.mrb) || Double.isInfinite(paramsMa.mrb))
        paramsMa.mrb = paramsMa.trS; 
      if (Double.isNaN(paramsMa.XHL) || Double.isInfinite(paramsMa.XHL))
        paramsMa.XHL = paramsMa.kGO; 
      if (Double.isNaN(paramsMa.mrb) || Double.isInfinite(paramsMa.mrb))
        paramsMa.mrb = paramsMa.Zpi; 
      int k = geR.FWm(paramsMa.div / 16.0D);
      int m = geR.FWm(paramsMa.IjH / 16.0D);
      int n = geR.FWm(paramsMa.mrb / 16.0D);
      if (paramsMa.trS == 0.0F || paramsMa.IjH != k || paramsMa.mrb != m || paramsMa.XHL != n) {
        if (paramsMa.trS != 0.0F && Dne(paramsMa.IjH, paramsMa.XHL))
          FWm(paramsMa.IjH, paramsMa.XHL).Dne(paramsMa, paramsMa.mrb); 
        if (Dne(k, n)) {
          paramsMa.trS = true;
          FWm(k, n).Dne(paramsMa);
        } else {
          paramsMa.trS = false;
        } 
      } 
      this.Dne.FWm();
      if (paramBoolean && paramsMa.trS != 0.0F && paramsMa.Dne != null)
        if (paramsMa.Dne.Zpi == 0.0F && paramsMa.Dne.FWm == paramsMa) {
          aFZ(paramsMa.Dne);
        } else {
          paramsMa.Dne.FWm = null;
          paramsMa.Dne = null;
        }  
    } 
  }
  
  public chN Dne(sMa paramsMa, float paramFloat) {
    float f1 = FWm(paramFloat);
    float f2 = geR.FWm(f1 * 3.1415927F * 2.0F) * 2.0F + 0.5F;
    if (f2 < 0.0F)
      f2 = 0.0F; 
    if (f2 > 1.0F)
      f2 = 1.0F; 
    int i = geR.FWm(paramsMa.div);
    int j = geR.FWm(paramsMa.mrb);
    OdI odI = Dne(i, j);
    float f3 = odI.bzF();
    int k = odI.Dne(f3);
    float f4 = (k >> 16 & 0xFF) / 255.0F;
    float f5 = (k >> 8 & 0xFF) / 255.0F;
    float f6 = (k & 0xFF) / 255.0F;
    f4 *= f2;
    f5 *= f2;
    f6 *= f2;
    float f7 = zGp(paramFloat);
    if (f7 > 0.0F) {
      float f9 = (f4 * 0.3F + f5 * 0.59F + f6 * 0.11F) * 0.6F;
      float f10 = 1.0F - f7 * 0.75F;
      f4 = f4 * f10 + f9 * (1.0F - f10);
      f5 = f5 * f10 + f9 * (1.0F - f10);
      f6 = f6 * f10 + f9 * (1.0F - f10);
    } 
    float f8 = aFZ(paramFloat);
    if (f8 > 0.0F) {
      float f9 = (f4 * 0.3F + f5 * 0.59F + f6 * 0.11F) * 0.2F;
      float f10 = 1.0F - f8 * 0.75F;
      f4 = f4 * f10 + f9 * (1.0F - f10);
      f5 = f5 * f10 + f9 * (1.0F - f10);
      f6 = f6 * f10 + f9 * (1.0F - f10);
    } 
    if (this.Qnq) {
      float f = this.Qnq - paramFloat;
      if (f > 1.0F)
        f = 1.0F; 
      f *= 0.45F;
      f4 = f4 * (1.0F - f) + 0.8F * f;
      f5 = f5 * (1.0F - f) + 0.8F * f;
      f6 = f6 * (1.0F - f) + 1.0F * f;
    } 
    return Dne().Dne(f4, f5, f6);
  }
  
  public long Dne() {
    return this.Dne.Dne();
  }
  
  public chN FWm(float paramFloat) {
    float f = FWm(paramFloat);
    return this.Dne.Dne(f, paramFloat);
  }
  
  public boolean FWm(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    return FWm(paramInt1, paramInt2, paramInt3, paramInt4, 0, 3);
  }
  
  public void Qnq(int paramInt1, int paramInt2, int paramInt3) {
    if (!((Jik)this.Dne).FWm)
      Dne((udO)udO.Dne, paramInt1, paramInt2, paramInt3); 
    Dne(udO.FWm, paramInt1, paramInt2, paramInt3);
  }
  
  public boolean Dne(int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean) {
    int i = Dne(paramInt1, paramInt2, paramInt3);
    if (i > 0) {
      int j = bzF(paramInt1, paramInt2, paramInt3);
      Qnq(2001, paramInt1, paramInt2, paramInt3, i + (j << 12));
      if (paramBoolean)
        zKP.Dne[i].FWm(this, paramInt1, paramInt2, paramInt3, j, 0); 
      return FWm(paramInt1, paramInt2, paramInt3, 0, 0, 3);
    } 
    return false;
  }
  
  protected void Dne(int paramInt1, int paramInt2, qMV paramqMV) {
    this.Dne.FWm("moodSound");
    if (this.zGp == 0 && this.aFZ == null) {
      this.FWm = this.FWm * 3 + 1013904223;
      int i = this.FWm >> 2;
      int j = i & 0xF;
      int k = i >> 8 & 0xF;
      int m = i >> 16 & 0x7F;
      int n = paramqMV.Dne(j, m, k);
      j += paramInt1;
      k += paramInt2;
      if (n == 0 && Qnq(j, m, k) <= this.Dne.nextInt(8) && FWm((udO)udO.Dne, j, m, k) <= 0) {
        FiG fiG = Dne(j + 0.5D, m + 0.5D, k + 0.5D, 8.0D);
        if (fiG != null && fiG.Dne(j + 0.5D, m + 0.5D, k + 0.5D) > 4.0D) {
          Dne(j + 0.5D, m + 0.5D, k + 0.5D, "ambient.cave.cave", 0.7F, 0.8F + this.Dne.nextFloat() * 0.2F);
          this.zGp = this.Dne.nextInt(12000) + 6000;
        } 
      } 
    } 
    this.Dne.FWm("checkLight");
    paramqMV.div();
  }
  
  public float FWm(float paramFloat) {
    return this.Dne.Dne(this.Dne.bzF(), paramFloat);
  }
  
  public void Dne(FiG paramFiG, String paramString, float paramFloat1, float paramFloat2) {
    // Byte code:
    //   0: aload_1
    //   1: ifnull -> 73
    //   4: aload_2
    //   5: ifnull -> 73
    //   8: iconst_0
    //   9: istore #5
    //   11: iload #5
    //   13: aload_0
    //   14: getfield zGp : Ljava/util/List;
    //   17: invokeinterface size : ()I
    //   22: if_icmpge -> 73
    //   25: aload_0
    //   26: getfield zGp : Ljava/util/List;
    //   29: iload #5
    //   31: invokeinterface get : (I)Ljava/lang/Object;
    //   36: checkcast IjH
    //   39: aload_1
    //   40: aload_2
    //   41: aload_1
    //   42: getfield div : D
    //   45: aload_1
    //   46: getfield IjH : D
    //   49: aload_1
    //   50: getfield udO : F
    //   53: f2d
    //   54: dsub
    //   55: aload_1
    //   56: getfield mrb : D
    //   59: fload_3
    //   60: fload #4
    //   62: invokeinterface Dne : (LFiG;Ljava/lang/String;DDDFF)V
    //   67: iinc #5, 1
    //   70: goto -> 11
    //   73: return
  }
  
  public int zGp(int paramInt1, int paramInt2, int paramInt3) {
    boolean bool = false;
    int i = Math.max(bool, FWm(paramInt1, paramInt2 - 1, paramInt3, 0));
    if (i >= 15)
      return i; 
    i = Math.max(i, FWm(paramInt1, paramInt2 + 1, paramInt3, 1));
    if (i >= 15)
      return i; 
    i = Math.max(i, FWm(paramInt1, paramInt2, paramInt3 - 1, 2));
    if (i >= 15)
      return i; 
    i = Math.max(i, FWm(paramInt1, paramInt2, paramInt3 + 1, 3));
    if (i >= 15)
      return i; 
    i = Math.max(i, FWm(paramInt1 - 1, paramInt2, paramInt3, 4));
    if (i >= 15)
      return i; 
    i = Math.max(i, FWm(paramInt1 + 1, paramInt2, paramInt3, 5));
    return (i >= 15) ? i : i;
  }
  
  public void Dne(int paramInt1, int paramInt2, int paramInt3, ipD paramipD) {
    if (paramipD != null && !paramipD.aFZ())
      if (this.zGp != 0) {
        paramipD.Qnq = paramInt1;
        paramipD.aFZ = paramInt2;
        paramipD.zGp = paramInt3;
        Iterator<ipD> iterator = this.DyG.iterator();
        while (iterator.hasNext()) {
          ipD ipD1 = iterator.next();
          if (ipD1.Qnq == paramInt1 && ipD1.aFZ == paramInt2 && ipD1.zGp == paramInt3) {
            ipD1.zGp();
            iterator.remove();
          } 
        } 
        this.DyG.add(paramipD);
      } else {
        this.bzF.add(paramipD);
        qMV qMV = FWm(paramInt1 >> 4, paramInt3 >> 4);
        if (qMV != null)
          qMV.Dne(paramInt1 & 0xF, paramInt2, paramInt3 & 0xF, paramipD); 
      }  
  }
  
  public int Dne(int paramInt1, int paramInt2) {
    byte b;
    for (b = 63; !Dne(paramInt1, b + 1, paramInt2); b++);
    return Dne(paramInt1, b, paramInt2);
  }
  
  public int bzF(int paramInt1, int paramInt2, int paramInt3) {
    if (paramInt1 >= -30000000 && paramInt3 >= -30000000 && paramInt1 < 30000000 && paramInt3 < 30000000) {
      if (paramInt2 < 0)
        return 0; 
      if (paramInt2 >= 256)
        return 0; 
      qMV qMV = FWm(paramInt1 >> 4, paramInt3 >> 4);
      paramInt1 &= 0xF;
      paramInt3 &= 0xF;
      return qMV.bzF(paramInt1, paramInt2, paramInt3);
    } 
    return 0;
  }
  
  public vWZ Dne(Class paramClass, String paramString) {
    return this.Dne.Dne(paramClass, paramString);
  }
  
  public int FWm(udO paramudO, int paramInt1, int paramInt2, int paramInt3) {
    if (paramInt2 < 0)
      paramInt2 = 0; 
    if (paramInt2 >= 256)
      paramInt2 = 255; 
    if (paramInt1 >= -30000000 && paramInt3 >= -30000000 && paramInt1 < 30000000 && paramInt3 < 30000000) {
      int i = paramInt1 >> 4;
      int j = paramInt3 >> 4;
      if (!Dne(i, j))
        return paramudO.Dne; 
      qMV qMV = FWm(i, j);
      return qMV.Dne(paramudO, paramInt1 & 0xF, paramInt2, paramInt3 & 0xF);
    } 
    return paramudO.Dne;
  }
  
  public FiG FWm(sMa paramsMa, double paramDouble) {
    return FWm(paramsMa.div, paramsMa.IjH, paramsMa.mrb, paramDouble);
  }
  
  public float zGp(float paramFloat) {
    return this.Dne + (this.FWm - this.Dne) * paramFloat;
  }
  
  public void mrb() {
    this.Dne.FWm();
  }
  
  public int Dne(float paramFloat) {
    float f1 = FWm(paramFloat);
    float f2 = 1.0F - geR.FWm(f1 * 3.1415927F * 2.0F) * 2.0F + 0.5F;
    if (f2 < 0.0F)
      f2 = 0.0F; 
    if (f2 > 1.0F)
      f2 = 1.0F; 
    f2 = 1.0F - f2;
    f2 = (float)(f2 * (1.0D - (zGp(paramFloat) * 5.0F) / 16.0D));
    f2 = (float)(f2 * (1.0D - (aFZ(paramFloat) * 5.0F) / 16.0D));
    f2 = 1.0F - f2;
    return (int)(f2 * 11.0F);
  }
  
  private void Zpi() {
    if (this.Dne.FWm()) {
      this.FWm = 1.0F;
      if (this.Dne.Dne())
        this.Qnq = 1.0F; 
    } 
  }
  
  public tgc Dne() {
    return ((Jik)this.Dne).Dne;
  }
  
  protected void FWm(sMa paramsMa) {
    // Byte code:
    //   0: iconst_0
    //   1: istore_2
    //   2: iload_2
    //   3: aload_0
    //   4: getfield zGp : Ljava/util/List;
    //   7: invokeinterface size : ()I
    //   12: if_icmpge -> 40
    //   15: aload_0
    //   16: getfield zGp : Ljava/util/List;
    //   19: iload_2
    //   20: invokeinterface get : (I)Ljava/lang/Object;
    //   25: checkcast IjH
    //   28: aload_1
    //   29: invokeinterface FWm : (LsMa;)V
    //   34: iinc #2, 1
    //   37: goto -> 2
    //   40: return
  }
  
  public boolean FWm(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6) {
    if (paramInt1 >= -30000000 && paramInt3 >= -30000000 && paramInt1 < 30000000 && paramInt3 < 30000000) {
      if (paramInt2 < 0)
        return false; 
      if (paramInt2 >= 256)
        return false; 
      qMV qMV = FWm(paramInt1 >> 4, paramInt3 >> 4);
      int i = 0;
      if ((paramInt6 & 0x1) != 0)
        i = qMV.Dne(paramInt1 & 0xF, paramInt2, paramInt3 & 0xF); 
      boolean bool = qMV.Dne(paramInt1 & 0xF, paramInt2, paramInt3 & 0xF, paramInt4, paramInt5);
      this.Dne.Dne("checkLight");
      Qnq(paramInt1, paramInt2, paramInt3);
      this.Dne.FWm();
      if (bool) {
        if ((paramInt6 & 0x2) != 0 && (this.aFZ == null || (paramInt6 & 0x4) == 0))
          Dne(paramInt1, paramInt2, paramInt3); 
        if (this.aFZ == null && (paramInt6 & 0x1) != 0) {
          Dne(paramInt1, paramInt2, paramInt3, i);
          dNT dNT = zKP.Dne[paramInt4];
          if (dNT != null && dNT.a_())
            aFZ(paramInt1, paramInt2, paramInt3, paramInt4); 
        } 
      } 
      return bool;
    } 
    return false;
  }
  
  protected boolean Dne(int paramInt1, int paramInt2) {
    return this.Dne.Dne(paramInt1, paramInt2);
  }
  
  public boolean div(int paramInt1, int paramInt2, int paramInt3) {
    int i = Dne(paramInt1, paramInt2, paramInt3);
    if (i != 0 && zKP.Dne[i] != null) {
      bSp bSp = zKP.Dne[i].Dne(this, paramInt1, paramInt2, paramInt3);
      return (bSp != null && bSp.Dne() >= 1.0D);
    } 
    return false;
  }
  
  public void Dne(double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, double paramDouble5, double paramDouble6, WkD paramWkD) {}
  
  public boolean ooe(int paramInt1, int paramInt2, int paramInt3) {
    OdI odI = Dne(paramInt1, paramInt3);
    return odI.bzF();
  }
  
  public void bzF(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6) {}
  
  public void Dne(String paramString, vWZ paramvWZ) {
    this.Dne.Dne(paramString, paramvWZ);
  }
  
  public void Dne(FiG paramFiG, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5) {
    // Byte code:
    //   0: iconst_0
    //   1: istore #7
    //   3: iload #7
    //   5: aload_0
    //   6: getfield zGp : Ljava/util/List;
    //   9: invokeinterface size : ()I
    //   14: if_icmpge -> 51
    //   17: aload_0
    //   18: getfield zGp : Ljava/util/List;
    //   21: iload #7
    //   23: invokeinterface get : (I)Ljava/lang/Object;
    //   28: checkcast IjH
    //   31: aload_1
    //   32: iload_2
    //   33: iload_3
    //   34: iload #4
    //   36: iload #5
    //   38: iload #6
    //   40: invokeinterface Dne : (LFiG;IIIII)V
    //   45: iinc #7, 1
    //   48: goto -> 3
    //   51: goto -> 136
    //   54: astore #7
    //   56: aload #7
    //   58: ldc_w 'Playing level event'
    //   61: invokestatic Dne : (Ljava/lang/Throwable;Ljava/lang/String;)LMcM;
    //   64: astore #8
    //   66: aload #8
    //   68: ldc_w 'Level event being played'
    //   71: invokevirtual Dne : (Ljava/lang/String;)LNoo;
    //   74: astore #9
    //   76: aload #9
    //   78: ldc_w 'Block coordinates'
    //   81: iload_3
    //   82: iload #4
    //   84: iload #5
    //   86: invokestatic Dne : (III)Ljava/lang/String;
    //   89: invokevirtual Dne : (Ljava/lang/String;Ljava/lang/Object;)V
    //   92: aload #9
    //   94: ldc_w 'Event source'
    //   97: aload_1
    //   98: invokevirtual Dne : (Ljava/lang/String;Ljava/lang/Object;)V
    //   101: aload #9
    //   103: ldc_w 'Event type'
    //   106: iload_2
    //   107: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   110: invokevirtual Dne : (Ljava/lang/String;Ljava/lang/Object;)V
    //   113: aload #9
    //   115: ldc_w 'Event data'
    //   118: iload #6
    //   120: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   123: invokevirtual Dne : (Ljava/lang/String;Ljava/lang/Object;)V
    //   126: new kaJ
    //   129: dup
    //   130: aload #8
    //   132: invokespecial <init> : (LMcM;)V
    //   135: athrow
    //   136: return
    // Exception table:
    //   from	to	target	type
    //   0	51	54	java/lang/Throwable
  }
  
  public void bzF() {
    int i = Dne(1.0F);
    if (i != this.Dne)
      this.Dne = i; 
  }
  
  public void Dne(double paramDouble1, double paramDouble2, double paramDouble3, String paramString, float paramFloat1, float paramFloat2) {
    // Byte code:
    //   0: aload #7
    //   2: ifnull -> 57
    //   5: iconst_0
    //   6: istore #10
    //   8: iload #10
    //   10: aload_0
    //   11: getfield zGp : Ljava/util/List;
    //   14: invokeinterface size : ()I
    //   19: if_icmpge -> 57
    //   22: aload_0
    //   23: getfield zGp : Ljava/util/List;
    //   26: iload #10
    //   28: invokeinterface get : (I)Ljava/lang/Object;
    //   33: checkcast IjH
    //   36: aload #7
    //   38: dload_1
    //   39: dload_3
    //   40: dload #5
    //   42: fload #8
    //   44: fload #9
    //   46: invokeinterface Dne : (Ljava/lang/String;DDDFF)V
    //   51: iinc #10, 1
    //   54: goto -> 8
    //   57: return
  }
  
  public void Dne(String paramString, double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, double paramDouble5, double paramDouble6) {
    // Byte code:
    //   0: iconst_0
    //   1: istore #14
    //   3: iload #14
    //   5: aload_0
    //   6: getfield zGp : Ljava/util/List;
    //   9: invokeinterface size : ()I
    //   14: if_icmpge -> 54
    //   17: aload_0
    //   18: getfield zGp : Ljava/util/List;
    //   21: iload #14
    //   23: invokeinterface get : (I)Ljava/lang/Object;
    //   28: checkcast IjH
    //   31: aload_1
    //   32: dload_2
    //   33: dload #4
    //   35: dload #6
    //   37: dload #8
    //   39: dload #10
    //   41: dload #12
    //   43: invokeinterface Dne : (Ljava/lang/String;DDDDDD)V
    //   48: iinc #14, 1
    //   51: goto -> 3
    //   54: return
  }
  
  public void aFZ(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5) {
    // Byte code:
    //   0: iconst_0
    //   1: istore #6
    //   3: iload #6
    //   5: aload_0
    //   6: getfield zGp : Ljava/util/List;
    //   9: invokeinterface size : ()I
    //   14: if_icmpge -> 53
    //   17: aload_0
    //   18: getfield zGp : Ljava/util/List;
    //   21: iload #6
    //   23: invokeinterface get : (I)Ljava/lang/Object;
    //   28: checkcast IjH
    //   31: astore #7
    //   33: aload #7
    //   35: iload_1
    //   36: iload_2
    //   37: iload_3
    //   38: iload #4
    //   40: iload #5
    //   42: invokeinterface FWm : (IIIII)V
    //   47: iinc #6, 1
    //   50: goto -> 3
    //   53: return
  }
  
  public int Qnq(int paramInt1, int paramInt2, int paramInt3) {
    if (paramInt2 < 0)
      return 0; 
    if (paramInt2 >= 256)
      paramInt2 = 255; 
    return FWm(paramInt1 >> 4, paramInt3 >> 4).Dne(paramInt1 & 0xF, paramInt2, paramInt3 & 0xF, 0);
  }
  
  public boolean Qnq(int paramInt1, int paramInt2, int paramInt3) {
    return FWm(paramInt1, paramInt2, paramInt3, 0, 0, 3);
  }
  
  public int bzF(int paramInt1, int paramInt2) {
    if (paramInt1 >= -30000000 && paramInt2 >= -30000000 && paramInt1 < 30000000 && paramInt2 < 30000000) {
      if (!Dne(paramInt1 >> 4, paramInt2 >> 4))
        return 0; 
      qMV qMV = FWm(paramInt1 >> 4, paramInt2 >> 4);
      return qMV.bzF;
    } 
    return 0;
  }
  
  protected void aFZ() {
    if (!((Jik)this.Dne).FWm) {
      int i = this.Dne.zGp();
      if (i <= 0) {
        if (this.Dne.Dne()) {
          this.Dne.aFZ(this.Dne.nextInt(12000) + 3600);
        } else {
          this.Dne.aFZ(this.Dne.nextInt(168000) + 12000);
        } 
      } else {
        this.Dne.aFZ(--i);
        if (i <= 0)
          this.Dne.Dne(!this.Dne.Dne()); 
      } 
      int j = this.Dne.DyG();
      if (j <= 0) {
        if (this.Dne.FWm()) {
          this.Dne.zGp(this.Dne.nextInt(12000) + 12000);
        } else {
          this.Dne.zGp(this.Dne.nextInt(168000) + 12000);
        } 
      } else {
        this.Dne.zGp(--j);
        if (j <= 0)
          this.Dne.FWm(!this.Dne.FWm()); 
      } 
      this.Dne = this.FWm;
      if (this.Dne.FWm()) {
        this.FWm = (float)(this.FWm + 0.01D);
      } else {
        this.FWm = (float)(this.FWm - 0.01D);
      } 
      if (this.FWm < 0.0F)
        this.FWm = 0.0F; 
      if (this.FWm > 1.0F)
        this.FWm = 1.0F; 
      this.bzF = this.Qnq;
      if (this.Dne.Dne()) {
        this.Qnq = (float)(this.Qnq + 0.01D);
      } else {
        this.Qnq = (float)(this.Qnq - 0.01D);
      } 
      if (this.Qnq < 0.0F)
        this.Qnq = 0.0F; 
      if (this.Qnq > 1.0F)
        this.Qnq = 1.0F; 
    } 
  }
  
  public FiG Dne(sMa paramsMa, double paramDouble) {
    return Dne(paramsMa.div, paramsMa.IjH, paramsMa.mrb, paramDouble);
  }
  
  public int Dne(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    int i = Dne((udO)udO.Dne, paramInt1, paramInt2, paramInt3);
    int j = Dne(udO.FWm, paramInt1, paramInt2, paramInt3);
    if (j < paramInt4)
      j = paramInt4; 
    return i << 20 | j << 4;
  }
  
  public void Dne(String paramString, int paramInt1, int paramInt2, int paramInt3) {
    // Byte code:
    //   0: iconst_0
    //   1: istore #5
    //   3: iload #5
    //   5: aload_0
    //   6: getfield zGp : Ljava/util/List;
    //   9: invokeinterface size : ()I
    //   14: if_icmpge -> 47
    //   17: aload_0
    //   18: getfield zGp : Ljava/util/List;
    //   21: iload #5
    //   23: invokeinterface get : (I)Ljava/lang/Object;
    //   28: checkcast IjH
    //   31: aload_1
    //   32: iload_2
    //   33: iload_3
    //   34: iload #4
    //   36: invokeinterface Dne : (Ljava/lang/String;III)V
    //   41: iinc #5, 1
    //   44: goto -> 3
    //   47: return
  }
  
  public String FWm() {
    return this.Dne.Dne();
  }
  
  public void bzF(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5) {
    // Byte code:
    //   0: iconst_0
    //   1: istore #6
    //   3: iload #6
    //   5: aload_0
    //   6: getfield zGp : Ljava/util/List;
    //   9: invokeinterface size : ()I
    //   14: if_icmpge -> 49
    //   17: aload_0
    //   18: getfield zGp : Ljava/util/List;
    //   21: iload #6
    //   23: invokeinterface get : (I)Ljava/lang/Object;
    //   28: checkcast IjH
    //   31: iload_1
    //   32: iload_2
    //   33: iload_3
    //   34: iload #4
    //   36: iload #5
    //   38: invokeinterface Dne : (IIIII)V
    //   43: iinc #6, 1
    //   46: goto -> 3
    //   49: return
  }
  
  public void Dne(udO paramudO, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    // Byte code:
    //   0: iload_2
    //   1: ldc_w -30000000
    //   4: if_icmplt -> 132
    //   7: iload #4
    //   9: ldc_w -30000000
    //   12: if_icmplt -> 132
    //   15: iload_2
    //   16: ldc_w 30000000
    //   19: if_icmpge -> 132
    //   22: iload #4
    //   24: ldc_w 30000000
    //   27: if_icmpge -> 132
    //   30: iload_3
    //   31: iflt -> 132
    //   34: iload_3
    //   35: sipush #256
    //   38: if_icmpge -> 132
    //   41: aload_0
    //   42: iload_2
    //   43: iconst_4
    //   44: ishr
    //   45: iload #4
    //   47: iconst_4
    //   48: ishr
    //   49: invokevirtual Dne : (II)Z
    //   52: ifeq -> 132
    //   55: aload_0
    //   56: iload_2
    //   57: iconst_4
    //   58: ishr
    //   59: iload #4
    //   61: iconst_4
    //   62: ishr
    //   63: invokevirtual FWm : (II)LqMV;
    //   66: astore #6
    //   68: aload #6
    //   70: aload_1
    //   71: iload_2
    //   72: bipush #15
    //   74: iand
    //   75: iload_3
    //   76: iload #4
    //   78: bipush #15
    //   80: iand
    //   81: iload #5
    //   83: invokevirtual Dne : (LudO;IIII)V
    //   86: iconst_0
    //   87: istore #7
    //   89: iload #7
    //   91: aload_0
    //   92: getfield zGp : Ljava/util/List;
    //   95: invokeinterface size : ()I
    //   100: if_icmpge -> 132
    //   103: aload_0
    //   104: getfield zGp : Ljava/util/List;
    //   107: iload #7
    //   109: invokeinterface get : (I)Ljava/lang/Object;
    //   114: checkcast IjH
    //   117: iload_2
    //   118: iload_3
    //   119: iload #4
    //   121: invokeinterface FWm : (III)V
    //   126: iinc #7, 1
    //   129: goto -> 89
    //   132: return
  }
  
  public void FWm(int paramInt1, int paramInt2, int paramInt3, ipD paramipD) {
    if (bzF(paramInt1, paramInt2, paramInt3))
      Dne(paramInt1, paramInt3).aFZ(); 
  }
  
  public void Dne(sMa paramsMa, byte paramByte) {}
  
  public void Qnq(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    if (this.aFZ == null) {
      int i = Dne(paramInt1, paramInt2, paramInt3);
      dNT dNT = zKP.Dne[i];
      if (dNT != null)
        try {
          dNT.Dne(this, paramInt1, paramInt2, paramInt3, paramInt4);
        } catch (Throwable throwable) {
          byte b;
          McM mcM = McM.Dne(throwable, "Exception while updating neighbours");
          Noo noo = mcM.Dne("Block being updated");
          try {
            b = bzF(paramInt1, paramInt2, paramInt3);
          } catch (Throwable throwable1) {
            b = -1;
          } 
          noo.Dne("Source block type", new aFZ(this, paramInt4));
          Noo.Dne(noo, paramInt1, paramInt2, paramInt3, i, b);
          throw new kaJ(mcM);
        }  
    } 
  }
  
  public void Qnq(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6) {
    if (paramInt4 > 0)
      zKP.Dne[paramInt4].Dne(this, paramInt1, paramInt2, paramInt3, paramInt5, paramInt6); 
  }
  
  public void Dne(float paramFloat) {
    this.Dne = paramFloat;
    this.FWm = paramFloat;
  }
  
  public void zGp() {
    this.Dne.zGp(1);
  }
  
  public boolean Qnq(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    return (bzF(paramInt1, paramInt2, paramInt3, paramInt4) > 0);
  }
  
  public boolean Dne(FiG paramFiG, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    if (paramInt4 == 0)
      paramInt2--; 
    if (paramInt4 == 1)
      paramInt2++; 
    if (paramInt4 == 2)
      paramInt3--; 
    if (paramInt4 == 3)
      paramInt3++; 
    if (paramInt4 == 4)
      paramInt1--; 
    if (paramInt4 == 5)
      paramInt1++; 
    if (Dne(paramInt1, paramInt2, paramInt3) == ((iqp)zKP.Dne).FWm) {
      Dne(paramFiG, 1004, paramInt1, paramInt2, paramInt3, 0);
      Qnq(paramInt1, paramInt2, paramInt3);
      return true;
    } 
    return false;
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\Qnq.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */