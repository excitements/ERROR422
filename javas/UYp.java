import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class UYp {
  private static final Random Dne = new Random();
  
  private static final pID Dne = new pID((FmY)null);
  
  private static final FEL Dne = new FEL((FmY)null);
  
  public static int Dne(FUH paramFUH1, FUH paramFUH2) {
    Dne.Dne = 0;
    Dne.Dne = paramFUH2;
    Dne(Dne, paramFUH1.Dne());
    return (Dne.Dne > 0) ? (1 + Dne.nextInt(Dne.Dne)) : 0;
  }
  
  public static int aFZ(FUH paramFUH) {
    return Dne(ycv.udO.FWm, paramFUH.Dne());
  }
  
  public static int bzF(FUH paramFUH) {
    return Dne(ycv.ooe.FWm, paramFUH.Dne());
  }
  
  public static boolean Dne(FUH paramFUH) {
    return (Dne(ycv.trS.FWm, paramFUH.Dne()) > 0);
  }
  
  public static Map Dne(int paramInt, NMq paramNMq) {
    // Byte code:
    //   0: aload_1
    //   1: invokevirtual Dne : ()LdEr;
    //   4: astore_2
    //   5: aconst_null
    //   6: astore_3
    //   7: aload_1
    //   8: getfield bzF : I
    //   11: getstatic dEr.TKg : LdEr;
    //   14: getfield Qnq : I
    //   17: if_icmpne -> 24
    //   20: iconst_1
    //   21: goto -> 25
    //   24: iconst_0
    //   25: istore #4
    //   27: getstatic ycv.Dne : [Lycv;
    //   30: astore #5
    //   32: aload #5
    //   34: arraylength
    //   35: istore #6
    //   37: iconst_0
    //   38: istore #7
    //   40: iload #7
    //   42: iload #6
    //   44: if_icmpge -> 163
    //   47: aload #5
    //   49: iload #7
    //   51: aaload
    //   52: astore #8
    //   54: aload #8
    //   56: ifnull -> 157
    //   59: aload #8
    //   61: getfield Dne : LACj;
    //   64: aload_2
    //   65: invokevirtual Dne : (LdEr;)Z
    //   68: ifne -> 76
    //   71: iload #4
    //   73: ifeq -> 157
    //   76: aload #8
    //   78: invokevirtual bzF : ()I
    //   81: istore #9
    //   83: iload #9
    //   85: aload #8
    //   87: invokevirtual Dne : ()I
    //   90: if_icmpgt -> 157
    //   93: iload_0
    //   94: aload #8
    //   96: iload #9
    //   98: invokevirtual Dne : (I)I
    //   101: if_icmplt -> 151
    //   104: iload_0
    //   105: aload #8
    //   107: iload #9
    //   109: invokevirtual FWm : (I)I
    //   112: if_icmpgt -> 151
    //   115: aload_3
    //   116: ifnonnull -> 127
    //   119: new java/util/HashMap
    //   122: dup
    //   123: invokespecial <init> : ()V
    //   126: astore_3
    //   127: aload_3
    //   128: aload #8
    //   130: getfield FWm : I
    //   133: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   136: new RmG
    //   139: dup
    //   140: aload #8
    //   142: iload #9
    //   144: invokespecial <init> : (Lycv;I)V
    //   147: invokevirtual put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   150: pop
    //   151: iinc #9, 1
    //   154: goto -> 83
    //   157: iinc #7, 1
    //   160: goto -> 40
    //   163: aload_3
    //   164: areturn
  }
  
  public static int Dne(int paramInt, NMq[] paramArrayOfNMq) {
    if (paramArrayOfNMq == null)
      return 0; 
    int i = 0;
    NMq[] arrayOfNMq = paramArrayOfNMq;
    int j = paramArrayOfNMq.length;
    for (byte b = 0; b < j; b++) {
      NMq nMq = arrayOfNMq[b];
      int k = Dne(paramInt, nMq);
      if (k > i)
        i = k; 
    } 
    return i;
  }
  
  public static int FWm(FUH paramFUH1, FUH paramFUH2) {
    return Dne(ycv.Zpi.FWm, paramFUH1.Dne());
  }
  
  public static void Dne(Map paramMap, NMq paramNMq) {
    mbZ mbZ = new mbZ();
    Iterator<Integer> iterator = paramMap.keySet().iterator();
    while (iterator.hasNext()) {
      int i = ((Integer)iterator.next()).intValue();
      WkD wkD = new WkD();
      wkD.Dne("id", (short)i);
      wkD.Dne("lvl", (short)((Integer)paramMap.get(Integer.valueOf(i))).intValue());
      mbZ.Dne(wkD);
      if (paramNMq.bzF == ((dpS)dEr.Dne).Qnq)
        dEr.Dne.Dne(paramNMq, new RmG(i, ((Integer)paramMap.get(Integer.valueOf(i))).intValue())); 
    } 
    if (mbZ.Dne() > 0) {
      if (paramNMq.bzF != ((dpS)dEr.Dne).Qnq)
        paramNMq.Dne("ench", mbZ); 
    } else if (paramNMq.aFZ()) {
      paramNMq.Dne().Dne("ench");
    } 
  }
  
  public static Map Dne(NMq paramNMq) {
    LinkedHashMap<Object, Object> linkedHashMap = new LinkedHashMap<>();
    mbZ mbZ = (paramNMq.bzF == ((dpS)dEr.Dne).Qnq) ? dEr.Dne.Dne(paramNMq) : paramNMq.Dne();
    if (mbZ != null)
      for (byte b = 0; b < mbZ.Dne(); b++) {
        short s1 = ((WkD)mbZ.FWm(b)).Dne("id");
        short s2 = ((WkD)mbZ.FWm(b)).Dne("lvl");
        linkedHashMap.put(Integer.valueOf(s1), Integer.valueOf(s2));
      }  
    return linkedHashMap;
  }
  
  public static int FWm(FUH paramFUH) {
    return Dne(ycv.zGp.FWm, paramFUH.Dne());
  }
  
  public static int Dne(FUH paramFUH) {
    return Dne(ycv.kGO.FWm, paramFUH.Dne());
  }
  
  public static NMq Dne(ycv paramycv, FUH paramFUH) {
    for (NMq nMq : paramFUH.Dne()) {
      if (nMq != null && Dne(paramycv.FWm, nMq) > 0)
        return nMq; 
    } 
    return null;
  }
  
  public static int Dne(NMq[] paramArrayOfNMq, zBn paramzBn) {
    ((pID)Dne).Dne = 0;
    ((pID)Dne).Dne = paramzBn;
    Dne(Dne, paramArrayOfNMq);
    if (((pID)Dne).Dne > 25)
      ((pID)Dne).Dne = 25; 
    return (((pID)Dne).Dne + 1 >> 1) + Dne.nextInt((((pID)Dne).Dne >> 1) + 1);
  }
  
  private static void Dne(PLz paramPLz, NMq paramNMq) {
    if (paramNMq != null) {
      mbZ mbZ = paramNMq.Dne();
      if (mbZ != null)
        for (byte b = 0; b < mbZ.Dne(); b++) {
          short s1 = ((WkD)mbZ.FWm(b)).Dne("id");
          short s2 = ((WkD)mbZ.FWm(b)).Dne("lvl");
          if (ycv.Dne[s1] != null)
            paramPLz.Dne((ycv)ycv.Dne[s1], s2); 
        }  
    } 
  }
  
  public static NMq Dne(Random paramRandom, NMq paramNMq, int paramInt) {
    List list = Dne(paramRandom, paramNMq, paramInt);
    boolean bool = (paramNMq.bzF == dEr.TKg.Qnq) ? true : false;
    if (bool)
      paramNMq.bzF = ((dpS)dEr.Dne).Qnq; 
    if (list != null)
      for (RmG rmG : list) {
        if (bool) {
          dEr.Dne.Dne(paramNMq, rmG);
          continue;
        } 
        paramNMq.Dne(rmG.Dne, rmG.Dne);
      }  
    return paramNMq;
  }
  
  public static int Dne(int paramInt, NMq paramNMq) {
    if (paramNMq == null)
      return 0; 
    mbZ mbZ = paramNMq.Dne();
    if (mbZ == null)
      return 0; 
    for (byte b = 0; b < mbZ.Dne(); b++) {
      short s1 = ((WkD)mbZ.FWm(b)).Dne("id");
      short s2 = ((WkD)mbZ.FWm(b)).Dne("lvl");
      if (s1 == paramInt)
        return s2; 
    } 
    return 0;
  }
  
  public static int Qnq(FUH paramFUH) {
    return Dne(ycv.ATE.FWm, paramFUH.Dne());
  }
  
  public static int zGp(FUH paramFUH) {
    return Dne(ycv.div.FWm, paramFUH.Dne());
  }
  
  public static List Dne(Random paramRandom, NMq paramNMq, int paramInt) {
    // Byte code:
    //   0: aload_1
    //   1: invokevirtual Dne : ()LdEr;
    //   4: astore_3
    //   5: aload_3
    //   6: invokevirtual Dne : ()I
    //   9: istore #4
    //   11: iload #4
    //   13: ifgt -> 18
    //   16: aconst_null
    //   17: areturn
    //   18: iload #4
    //   20: iconst_2
    //   21: idiv
    //   22: istore #4
    //   24: iconst_1
    //   25: aload_0
    //   26: iload #4
    //   28: iconst_1
    //   29: ishr
    //   30: iconst_1
    //   31: iadd
    //   32: invokevirtual nextInt : (I)I
    //   35: iadd
    //   36: aload_0
    //   37: iload #4
    //   39: iconst_1
    //   40: ishr
    //   41: iconst_1
    //   42: iadd
    //   43: invokevirtual nextInt : (I)I
    //   46: iadd
    //   47: istore #4
    //   49: iload #4
    //   51: iload_2
    //   52: iadd
    //   53: istore #5
    //   55: aload_0
    //   56: invokevirtual nextFloat : ()F
    //   59: aload_0
    //   60: invokevirtual nextFloat : ()F
    //   63: fadd
    //   64: fconst_1
    //   65: fsub
    //   66: ldc_w 0.15
    //   69: fmul
    //   70: fstore #6
    //   72: iload #5
    //   74: i2f
    //   75: fconst_1
    //   76: fload #6
    //   78: fadd
    //   79: fmul
    //   80: ldc_w 0.5
    //   83: fadd
    //   84: f2i
    //   85: istore #7
    //   87: iload #7
    //   89: iconst_1
    //   90: if_icmpge -> 96
    //   93: iconst_1
    //   94: istore #7
    //   96: aconst_null
    //   97: astore #8
    //   99: iload #7
    //   101: aload_1
    //   102: invokestatic Dne : (ILNMq;)Ljava/util/Map;
    //   105: astore #9
    //   107: aload #9
    //   109: ifnull -> 330
    //   112: aload #9
    //   114: invokeinterface isEmpty : ()Z
    //   119: ifne -> 330
    //   122: aload_0
    //   123: aload #9
    //   125: invokeinterface values : ()Ljava/util/Collection;
    //   130: invokestatic Dne : (Ljava/util/Random;Ljava/util/Collection;)LTwy;
    //   133: checkcast RmG
    //   136: astore #10
    //   138: aload #10
    //   140: ifnull -> 330
    //   143: new java/util/ArrayList
    //   146: dup
    //   147: invokespecial <init> : ()V
    //   150: astore #8
    //   152: aload #8
    //   154: aload #10
    //   156: invokevirtual add : (Ljava/lang/Object;)Z
    //   159: pop
    //   160: iload #7
    //   162: istore #11
    //   164: aload_0
    //   165: bipush #50
    //   167: invokevirtual nextInt : (I)I
    //   170: iload #11
    //   172: if_icmpgt -> 330
    //   175: aload #9
    //   177: invokeinterface keySet : ()Ljava/util/Set;
    //   182: invokeinterface iterator : ()Ljava/util/Iterator;
    //   187: astore #12
    //   189: aload #12
    //   191: invokeinterface hasNext : ()Z
    //   196: ifeq -> 287
    //   199: aload #12
    //   201: invokeinterface next : ()Ljava/lang/Object;
    //   206: checkcast java/lang/Integer
    //   209: astore #13
    //   211: iconst_1
    //   212: istore #14
    //   214: aload #8
    //   216: invokevirtual iterator : ()Ljava/util/Iterator;
    //   219: astore #15
    //   221: aload #15
    //   223: invokeinterface hasNext : ()Z
    //   228: ifeq -> 269
    //   231: aload #15
    //   233: invokeinterface next : ()Ljava/lang/Object;
    //   238: checkcast RmG
    //   241: astore #16
    //   243: aload #16
    //   245: getfield Dne : Lycv;
    //   248: getstatic ycv.Dne : [Lycv;
    //   251: aload #13
    //   253: invokevirtual intValue : ()I
    //   256: aaload
    //   257: invokevirtual Dne : (Lycv;)Z
    //   260: ifeq -> 266
    //   263: goto -> 221
    //   266: iconst_0
    //   267: istore #14
    //   269: iload #14
    //   271: ifne -> 284
    //   274: aload #12
    //   276: invokeinterface remove : ()V
    //   281: goto -> 284
    //   284: goto -> 189
    //   287: aload #9
    //   289: invokeinterface isEmpty : ()Z
    //   294: ifne -> 321
    //   297: aload_0
    //   298: aload #9
    //   300: invokeinterface values : ()Ljava/util/Collection;
    //   305: invokestatic Dne : (Ljava/util/Random;Ljava/util/Collection;)LTwy;
    //   308: checkcast RmG
    //   311: astore #13
    //   313: aload #8
    //   315: aload #13
    //   317: invokevirtual add : (Ljava/lang/Object;)Z
    //   320: pop
    //   321: iload #11
    //   323: iconst_1
    //   324: ishr
    //   325: istore #11
    //   327: goto -> 164
    //   330: aload #8
    //   332: areturn
  }
  
  public static int Dne(Random paramRandom, int paramInt1, int paramInt2, NMq paramNMq) {
    dEr dEr = paramNMq.Dne();
    int i = dEr.Dne();
    if (i <= 0)
      return 0; 
    if (paramInt2 > 15)
      paramInt2 = 15; 
    int j = paramRandom.nextInt(8) + 1 + (paramInt2 >> 1) + paramRandom.nextInt(paramInt2 + 1);
    return (paramInt1 == 0) ? Math.max(j / 3, 1) : ((paramInt1 == 1) ? (j * 2 / 3 + 1) : Math.max(j, paramInt2 * 2));
  }
  
  public static boolean FWm(FUH paramFUH) {
    return (Dne(ycv.DyG.FWm, paramFUH.Dne()) > 0);
  }
  
  private static void Dne(PLz paramPLz, NMq[] paramArrayOfNMq) {
    NMq[] arrayOfNMq = paramArrayOfNMq;
    int i = paramArrayOfNMq.length;
    for (byte b = 0; b < i; b++) {
      NMq nMq = arrayOfNMq[b];
      Dne(paramPLz, nMq);
    } 
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\UYp.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */