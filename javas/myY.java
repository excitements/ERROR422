import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class myY extends phH {
  private static Map Dne = new HashMap<>();
  
  private boolean Dne = false;
  
  public void FWm(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3, Random paramRandom) {
    if (this.Dne) {
      int i = paramQnq.bzF(paramInt1, paramInt2, paramInt3);
      double d1 = (paramInt1 + 0.5F) + (paramRandom.nextFloat() - 0.5F) * 0.2D;
      double d2 = (paramInt2 + 0.7F) + (paramRandom.nextFloat() - 0.5F) * 0.2D;
      double d3 = (paramInt3 + 0.5F) + (paramRandom.nextFloat() - 0.5F) * 0.2D;
      double d4 = 0.2199999988079071D;
      double d5 = 0.27000001072883606D;
      if (i == 1) {
        paramQnq.Dne("reddust", d1 - d5, d2 + d4, d3, 0.0D, 0.0D, 0.0D);
      } else if (i == 2) {
        paramQnq.Dne("reddust", d1 + d5, d2 + d4, d3, 0.0D, 0.0D, 0.0D);
      } else if (i == 3) {
        paramQnq.Dne("reddust", d1, d2 + d4, d3 - d5, 0.0D, 0.0D, 0.0D);
      } else if (i == 4) {
        paramQnq.Dne("reddust", d1, d2 + d4, d3 + d5, 0.0D, 0.0D, 0.0D);
      } else {
        paramQnq.Dne("reddust", d1, d2, d3, 0.0D, 0.0D, 0.0D);
      } 
    } 
  }
  
  public int Dne(int paramInt1, Random paramRandom, int paramInt2) {
    return zKP.CZC.FWm;
  }
  
  public void Dne(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    if (!FWm(paramQnq, paramInt1, paramInt2, paramInt3, paramInt4)) {
      boolean bool = Qnq(paramQnq, paramInt1, paramInt2, paramInt3);
      if ((this.Dne && bool) || (!this.Dne && !bool))
        paramQnq.FWm(paramInt1, paramInt2, paramInt3, this.FWm, Dne(paramQnq)); 
    } 
  }
  
  protected myY(int paramInt, boolean paramBoolean) {
    super(paramInt);
    this.Dne = paramBoolean;
    Dne(true);
    Dne((JcN)null);
  }
  
  public int Dne(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3) {
    return zKP.CZC.FWm;
  }
  
  public void Dne(Rbp paramRbp) {
    if (this.Dne) {
      this.Qnq = paramRbp.Dne("redtorch_lit");
    } else {
      this.Qnq = paramRbp.Dne("redtorch");
    } 
  }
  
  public void Dne(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5) {
    if (this.Dne) {
      paramQnq.bzF(paramInt1, paramInt2 - 1, paramInt3, this.FWm);
      paramQnq.bzF(paramInt1, paramInt2 + 1, paramInt3, this.FWm);
      paramQnq.bzF(paramInt1 - 1, paramInt2, paramInt3, this.FWm);
      paramQnq.bzF(paramInt1 + 1, paramInt2, paramInt3, this.FWm);
      paramQnq.bzF(paramInt1, paramInt2, paramInt3 - 1, this.FWm);
      paramQnq.bzF(paramInt1, paramInt2, paramInt3 + 1, this.FWm);
    } 
  }
  
  public int FWm(Zpi paramZpi, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    return (paramInt4 == 0) ? Dne(paramZpi, paramInt1, paramInt2, paramInt3, paramInt4) : 0;
  }
  
  public boolean zGp(int paramInt) {
    return (paramInt == zKP.iNQ.FWm || paramInt == zKP.CZC.FWm);
  }
  
  public void Dne(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3) {
    if (paramQnq.bzF(paramInt1, paramInt2, paramInt3) == 0)
      super.Dne(paramQnq, paramInt1, paramInt2, paramInt3); 
    if (this.Dne) {
      paramQnq.bzF(paramInt1, paramInt2 - 1, paramInt3, this.FWm);
      paramQnq.bzF(paramInt1, paramInt2 + 1, paramInt3, this.FWm);
      paramQnq.bzF(paramInt1 - 1, paramInt2, paramInt3, this.FWm);
      paramQnq.bzF(paramInt1 + 1, paramInt2, paramInt3, this.FWm);
      paramQnq.bzF(paramInt1, paramInt2, paramInt3 - 1, this.FWm);
      paramQnq.bzF(paramInt1, paramInt2, paramInt3 + 1, this.FWm);
    } 
  }
  
  public int Dne(Qnq paramQnq) {
    return 2;
  }
  
  private boolean Qnq(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3) {
    int i = paramQnq.bzF(paramInt1, paramInt2, paramInt3);
    return (i == 5 && paramQnq.Qnq(paramInt1, paramInt2 - 1, paramInt3, 0)) ? true : ((i == 3 && paramQnq.Qnq(paramInt1, paramInt2, paramInt3 - 1, 2)) ? true : ((i == 4 && paramQnq.Qnq(paramInt1, paramInt2, paramInt3 + 1, 3)) ? true : ((i == 1 && paramQnq.Qnq(paramInt1 - 1, paramInt2, paramInt3, 4)) ? true : ((i == 2 && paramQnq.Qnq(paramInt1 + 1, paramInt2, paramInt3, 5))))));
  }
  
  public boolean bzF() {
    return true;
  }
  
  public int Dne(Zpi paramZpi, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    if (!this.Dne)
      return 0; 
    int i = paramZpi.bzF(paramInt1, paramInt2, paramInt3);
    return (i == 5 && paramInt4 == 1) ? 0 : ((i == 3 && paramInt4 == 3) ? 0 : ((i == 4 && paramInt4 == 2) ? 0 : ((i == 1 && paramInt4 == 5) ? 0 : ((i == 2 && paramInt4 == 4) ? 0 : 15))));
  }
  
  public void Dne(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3, Random paramRandom) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: iload_2
    //   3: iload_3
    //   4: iload #4
    //   6: invokespecial Qnq : (LQnq;III)Z
    //   9: istore #6
    //   11: getstatic myY.Dne : Ljava/util/Map;
    //   14: aload_1
    //   15: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   20: checkcast java/util/List
    //   23: astore #7
    //   25: aload #7
    //   27: ifnull -> 78
    //   30: aload #7
    //   32: invokeinterface isEmpty : ()Z
    //   37: ifne -> 78
    //   40: aload_1
    //   41: invokevirtual FWm : ()J
    //   44: aload #7
    //   46: iconst_0
    //   47: invokeinterface get : (I)Ljava/lang/Object;
    //   52: checkcast lAp
    //   55: getfield Dne : J
    //   58: lsub
    //   59: ldc2_w 60
    //   62: lcmp
    //   63: ifle -> 78
    //   66: aload #7
    //   68: iconst_0
    //   69: invokeinterface remove : (I)Ljava/lang/Object;
    //   74: pop
    //   75: goto -> 25
    //   78: aload_0
    //   79: getfield Dne : Z
    //   82: ifeq -> 263
    //   85: iload #6
    //   87: ifeq -> 305
    //   90: aload_1
    //   91: iload_2
    //   92: iload_3
    //   93: iload #4
    //   95: getstatic zKP.iNQ : LzKP;
    //   98: getfield FWm : I
    //   101: aload_1
    //   102: iload_2
    //   103: iload_3
    //   104: iload #4
    //   106: invokevirtual bzF : (III)I
    //   109: iconst_3
    //   110: invokevirtual FWm : (IIIIII)Z
    //   113: pop
    //   114: aload_0
    //   115: aload_1
    //   116: iload_2
    //   117: iload_3
    //   118: iload #4
    //   120: iconst_1
    //   121: invokespecial Dne : (LQnq;IIIZ)Z
    //   124: ifeq -> 305
    //   127: aload_1
    //   128: iload_2
    //   129: i2f
    //   130: ldc 0.5
    //   132: fadd
    //   133: f2d
    //   134: iload_3
    //   135: i2f
    //   136: ldc 0.5
    //   138: fadd
    //   139: f2d
    //   140: iload #4
    //   142: i2f
    //   143: ldc 0.5
    //   145: fadd
    //   146: f2d
    //   147: ldc 'random.fizz'
    //   149: ldc 0.5
    //   151: ldc 2.6
    //   153: aload_1
    //   154: getfield Dne : Ljava/util/Random;
    //   157: invokevirtual nextFloat : ()F
    //   160: aload_1
    //   161: getfield Dne : Ljava/util/Random;
    //   164: invokevirtual nextFloat : ()F
    //   167: fsub
    //   168: ldc 0.8
    //   170: fmul
    //   171: fadd
    //   172: invokevirtual Dne : (DDDLjava/lang/String;FF)V
    //   175: iconst_0
    //   176: istore #8
    //   178: iload #8
    //   180: iconst_5
    //   181: if_icmpge -> 260
    //   184: iload_2
    //   185: i2d
    //   186: aload #5
    //   188: invokevirtual nextDouble : ()D
    //   191: ldc2_w 0.6
    //   194: dmul
    //   195: dadd
    //   196: ldc2_w 0.2
    //   199: dadd
    //   200: dstore #9
    //   202: iload_3
    //   203: i2d
    //   204: aload #5
    //   206: invokevirtual nextDouble : ()D
    //   209: ldc2_w 0.6
    //   212: dmul
    //   213: dadd
    //   214: ldc2_w 0.2
    //   217: dadd
    //   218: dstore #11
    //   220: iload #4
    //   222: i2d
    //   223: aload #5
    //   225: invokevirtual nextDouble : ()D
    //   228: ldc2_w 0.6
    //   231: dmul
    //   232: dadd
    //   233: ldc2_w 0.2
    //   236: dadd
    //   237: dstore #13
    //   239: aload_1
    //   240: ldc 'smoke'
    //   242: dload #9
    //   244: dload #11
    //   246: dload #13
    //   248: dconst_0
    //   249: dconst_0
    //   250: dconst_0
    //   251: invokevirtual Dne : (Ljava/lang/String;DDDDDD)V
    //   254: iinc #8, 1
    //   257: goto -> 178
    //   260: goto -> 305
    //   263: iload #6
    //   265: ifne -> 305
    //   268: aload_0
    //   269: aload_1
    //   270: iload_2
    //   271: iload_3
    //   272: iload #4
    //   274: iconst_0
    //   275: invokespecial Dne : (LQnq;IIIZ)Z
    //   278: ifne -> 305
    //   281: aload_1
    //   282: iload_2
    //   283: iload_3
    //   284: iload #4
    //   286: getstatic zKP.CZC : LzKP;
    //   289: getfield FWm : I
    //   292: aload_1
    //   293: iload_2
    //   294: iload_3
    //   295: iload #4
    //   297: invokevirtual bzF : (III)I
    //   300: iconst_3
    //   301: invokevirtual FWm : (IIIIII)Z
    //   304: pop
    //   305: return
  }
  
  private boolean Dne(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean) {
    // Byte code:
    //   0: getstatic myY.Dne : Ljava/util/Map;
    //   3: aload_1
    //   4: invokeinterface containsKey : (Ljava/lang/Object;)Z
    //   9: ifne -> 29
    //   12: getstatic myY.Dne : Ljava/util/Map;
    //   15: aload_1
    //   16: new java/util/ArrayList
    //   19: dup
    //   20: invokespecial <init> : ()V
    //   23: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   28: pop
    //   29: getstatic myY.Dne : Ljava/util/Map;
    //   32: aload_1
    //   33: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   38: checkcast java/util/List
    //   41: astore #6
    //   43: iload #5
    //   45: ifeq -> 71
    //   48: aload #6
    //   50: new lAp
    //   53: dup
    //   54: iload_2
    //   55: iload_3
    //   56: iload #4
    //   58: aload_1
    //   59: invokevirtual FWm : ()J
    //   62: invokespecial <init> : (IIIJ)V
    //   65: invokeinterface add : (Ljava/lang/Object;)Z
    //   70: pop
    //   71: iconst_0
    //   72: istore #7
    //   74: iconst_0
    //   75: istore #8
    //   77: iload #8
    //   79: aload #6
    //   81: invokeinterface size : ()I
    //   86: if_icmpge -> 149
    //   89: aload #6
    //   91: iload #8
    //   93: invokeinterface get : (I)Ljava/lang/Object;
    //   98: checkcast lAp
    //   101: astore #9
    //   103: aload #9
    //   105: getfield Dne : I
    //   108: iload_2
    //   109: if_icmpne -> 143
    //   112: aload #9
    //   114: getfield FWm : I
    //   117: iload_3
    //   118: if_icmpne -> 143
    //   121: aload #9
    //   123: getfield bzF : I
    //   126: iload #4
    //   128: if_icmpne -> 143
    //   131: iinc #7, 1
    //   134: iload #7
    //   136: bipush #8
    //   138: if_icmplt -> 143
    //   141: iconst_1
    //   142: ireturn
    //   143: iinc #8, 1
    //   146: goto -> 77
    //   149: iconst_0
    //   150: ireturn
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\myY.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */