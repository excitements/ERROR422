import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class RAN extends Qnq {
  private ZGT Dne;
  
  private final trS Dne;
  
  public boolean zGp;
  
  private final clp Dne;
  
  private boolean DyG;
  
  private int zGp = 0;
  
  private final Jwh Dne;
  
  private final wrs Dne;
  
  private TreeSet Dne;
  
  public EnH Dne;
  
  private Set FWm;
  
  private ArrayList Dne;
  
  private eGv[] Dne = new eGv[] { new eGv((JLE)null), new eGv((JLE)null) };
  
  private int DyG = 0;
  
  private static final fKu[] Dne = new fKu[] { new fKu(dEr.oIf.Qnq, 0, 1, 3, 10), new fKu(((zKP)zKP.Qnq).FWm, 0, 1, 3, 10), new fKu(zKP.udO.FWm, 0, 1, 3, 10), new fKu(dEr.Vxn.Qnq, 0, 1, 1, 3), new fKu(dEr.ooe.Qnq, 0, 1, 1, 5), new fKu(dEr.ATE.Qnq, 0, 1, 1, 3), new fKu(dEr.udO.Qnq, 0, 1, 1, 5), new fKu(dEr.aFZ.Qnq, 0, 2, 3, 5), new fKu(dEr.rPc.Qnq, 0, 2, 3, 3) };
  
  protected void FWm(mrb parammrb) {
    // Byte code:
    //   0: aload_0
    //   1: getfield Dne : LJik;
    //   4: invokevirtual FWm : ()Z
    //   7: ifne -> 29
    //   10: aload_0
    //   11: getfield Dne : LxoY;
    //   14: iconst_0
    //   15: aload_0
    //   16: getfield Dne : LJik;
    //   19: invokevirtual Dne : ()I
    //   22: iconst_0
    //   23: invokevirtual Dne : (III)V
    //   26: goto -> 222
    //   29: aload_0
    //   30: iconst_1
    //   31: putfield FWm : Z
    //   34: aload_0
    //   35: getfield Dne : LJik;
    //   38: getfield Dne : Ltgc;
    //   41: astore_2
    //   42: aload_2
    //   43: invokevirtual Dne : ()Ljava/util/List;
    //   46: astore_3
    //   47: new java/util/Random
    //   50: dup
    //   51: aload_0
    //   52: invokevirtual Dne : ()J
    //   55: invokespecial <init> : (J)V
    //   58: astore #4
    //   60: aload_2
    //   61: iconst_0
    //   62: iconst_0
    //   63: sipush #256
    //   66: aload_3
    //   67: aload #4
    //   69: invokevirtual Dne : (IIILjava/util/List;Ljava/util/Random;)LEyB;
    //   72: astore #5
    //   74: iconst_0
    //   75: istore #6
    //   77: aload_0
    //   78: getfield Dne : LJik;
    //   81: invokevirtual Dne : ()I
    //   84: istore #7
    //   86: iconst_0
    //   87: istore #8
    //   89: aload #5
    //   91: ifnull -> 111
    //   94: aload #5
    //   96: getfield Dne : I
    //   99: istore #6
    //   101: aload #5
    //   103: getfield bzF : I
    //   106: istore #8
    //   108: goto -> 122
    //   111: aload_0
    //   112: invokevirtual Dne : ()LdLs;
    //   115: ldc 'Unable to find spawn biome'
    //   117: invokeinterface FWm : (Ljava/lang/String;)V
    //   122: iconst_0
    //   123: istore #9
    //   125: aload_0
    //   126: getfield Dne : LJik;
    //   129: iload #6
    //   131: iload #8
    //   133: invokevirtual Dne : (II)Z
    //   136: ifne -> 193
    //   139: iload #6
    //   141: aload #4
    //   143: bipush #64
    //   145: invokevirtual nextInt : (I)I
    //   148: aload #4
    //   150: bipush #64
    //   152: invokevirtual nextInt : (I)I
    //   155: isub
    //   156: iadd
    //   157: istore #6
    //   159: iload #8
    //   161: aload #4
    //   163: bipush #64
    //   165: invokevirtual nextInt : (I)I
    //   168: aload #4
    //   170: bipush #64
    //   172: invokevirtual nextInt : (I)I
    //   175: isub
    //   176: iadd
    //   177: istore #8
    //   179: iinc #9, 1
    //   182: iload #9
    //   184: sipush #1000
    //   187: if_icmpne -> 125
    //   190: goto -> 193
    //   193: aload_0
    //   194: getfield Dne : LxoY;
    //   197: iload #6
    //   199: iload #7
    //   201: iload #8
    //   203: invokevirtual Dne : (III)V
    //   206: aload_0
    //   207: iconst_0
    //   208: putfield FWm : Z
    //   211: aload_1
    //   212: invokevirtual Dne : ()Z
    //   215: ifeq -> 222
    //   218: aload_0
    //   219: invokevirtual ooe : ()V
    //   222: return
  }
  
  protected void div() {
    super.div();
    byte b1 = 0;
    byte b2 = 0;
    for (Sxs sxs : this.Dne) {
      int i = sxs.Dne * 16;
      int j = sxs.FWm * 16;
      this.Dne.Dne("getChunk");
      qMV qMV = FWm(sxs.Dne, sxs.FWm);
      Dne(i, j, qMV);
      this.Dne.FWm("tickChunk");
      qMV.zGp();
      this.Dne.FWm("thunder");
      if (this.Dne.nextInt(100000) == 0 && bzF() && FWm()) {
        this.FWm = this.FWm * 3 + 1013904223;
        int k = this.FWm >> 2;
        int m = i + (k & 0xF);
        int n = j + (k >> 8 & 0xF);
        int i1 = Qnq(m, n);
        if (udO(m, i1, n))
          Dne(new xIh(this, m, i1, n)); 
      } 
      this.Dne.FWm("iceandsnow");
      if (this.Dne.nextInt(16) == 0) {
        this.FWm = this.FWm * 3 + 1013904223;
        int k = this.FWm >> 2;
        int m = k & 0xF;
        int n = k >> 8 & 0xF;
        int i1 = Qnq(m + i, n + j);
        if (XHL(m + i, i1 - 1, n + j))
          FWm(m + i, i1 - 1, n + j, zKP.xEx.FWm); 
        if (bzF() && Zpi(m + i, i1, n + j))
          FWm(m + i, i1, n + j, zKP.EwP.FWm); 
        if (bzF()) {
          OdI odI = Dne(m + i, n + j);
          if (odI.FWm()) {
            int i2 = Dne(m + i, i1 - 1, n + j);
            if (i2 != 0)
              zKP.Dne[i2].a_(this, m + i, i1 - 1, n + j); 
          } 
        } 
      } 
      this.Dne.FWm("tickTiles");
      for (cHy cHy : qMV.Dne()) {
        if (cHy != null && cHy.FWm())
          for (byte b = 0; b < 3; b++) {
            this.FWm = this.FWm * 3 + 1013904223;
            int k = this.FWm >> 2;
            int m = k & 0xF;
            int n = k >> 8 & 0xF;
            int i1 = k >> 16 & 0xF;
            int i2 = cHy.Dne(m, i1, n);
            b2++;
            dNT dNT = zKP.Dne[i2];
            if (dNT != null && dNT.IjH()) {
              b1++;
              dNT.Dne(this, m + i, i1 + cHy.Dne(), n + j, (Random)this.Dne);
            } 
          }  
      } 
      this.Dne.FWm();
    } 
  }
  
  public trS Dne() {
    return (trS)this.Dne;
  }
  
  public boolean Dne(boolean paramBoolean) {
    int i = this.Dne.size();
    if (i != this.FWm.size())
      throw new IllegalStateException("TickNextTick list out of synch"); 
    if (i > 1000)
      i = 1000; 
    this.Dne.Dne("cleaning");
    for (byte b = 0; b < i; b++) {
      Vxn vxn = this.Dne.first();
      if (!paramBoolean && vxn.Dne > this.Dne.FWm())
        break; 
      this.Dne.remove(vxn);
      this.FWm.remove(vxn);
      this.Dne.add(vxn);
    } 
    this.Dne.FWm();
    this.Dne.Dne("ticking");
    Iterator<Vxn> iterator = this.Dne.iterator();
    while (iterator.hasNext()) {
      Vxn vxn = iterator.next();
      iterator.remove();
      byte b1 = 0;
      if (Dne(vxn.Dne - b1, vxn.FWm - b1, vxn.bzF - b1, vxn.Dne + b1, vxn.FWm + b1, vxn.bzF + b1)) {
        int j = Dne(vxn.Dne, vxn.FWm, vxn.bzF);
        if (j > 0 && zKP.Dne(j, vxn.Qnq))
          try {
            zKP.Dne[j].Dne(this, vxn.Dne, vxn.FWm, vxn.bzF, (Random)this.Dne);
          } catch (Throwable throwable) {
            byte b2;
            McM mcM = McM.Dne(throwable, "Exception while ticking a block");
            Noo noo = mcM.Dne("Block being ticked");
            try {
              b2 = bzF(vxn.Dne, vxn.FWm, vxn.bzF);
            } catch (Throwable throwable1) {
              b2 = -1;
            } 
            Noo.Dne(noo, vxn.Dne, vxn.FWm, vxn.bzF, j, b2);
            throw new kaJ(mcM);
          }  
        continue;
      } 
      FWm(vxn.Dne, vxn.FWm, vxn.bzF, vxn.Qnq, 0);
    } 
    this.Dne.FWm();
    this.Dne.clear();
    return !this.Dne.isEmpty();
  }
  
  public void Qnq() {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial Qnq : ()V
    //   4: aload_0
    //   5: invokevirtual Dne : ()LxoY;
    //   8: invokevirtual Qnq : ()Z
    //   11: ifeq -> 27
    //   14: aload_0
    //   15: getfield aFZ : I
    //   18: iconst_3
    //   19: if_icmpge -> 27
    //   22: aload_0
    //   23: iconst_3
    //   24: putfield aFZ : I
    //   27: aload_0
    //   28: getfield Dne : LJik;
    //   31: getfield Dne : Ltgc;
    //   34: invokevirtual Dne : ()V
    //   37: aload_0
    //   38: invokevirtual aFZ : ()Z
    //   41: ifeq -> 95
    //   44: iconst_0
    //   45: istore_1
    //   46: aload_0
    //   47: getfield bzF : Z
    //   50: ifeq -> 61
    //   53: aload_0
    //   54: getfield aFZ : I
    //   57: iconst_1
    //   58: if_icmplt -> 61
    //   61: iload_1
    //   62: ifne -> 95
    //   65: aload_0
    //   66: getfield Dne : LxoY;
    //   69: invokevirtual bzF : ()J
    //   72: ldc2_w 24000
    //   75: ladd
    //   76: lstore_2
    //   77: aload_0
    //   78: getfield Dne : LxoY;
    //   81: lload_2
    //   82: lload_2
    //   83: ldc2_w 24000
    //   86: lrem
    //   87: lsub
    //   88: invokevirtual FWm : (J)V
    //   91: aload_0
    //   92: invokevirtual kGO : ()V
    //   95: aload_0
    //   96: getfield Dne : LBkx;
    //   99: ldc_w 'mobSpawner'
    //   102: invokevirtual Dne : (Ljava/lang/String;)V
    //   105: aload_0
    //   106: invokevirtual Dne : ()LaSc;
    //   109: ldc_w 'doMobSpawning'
    //   112: invokevirtual Dne : (Ljava/lang/String;)Z
    //   115: ifeq -> 152
    //   118: aload_0
    //   119: aload_0
    //   120: getfield bzF : Z
    //   123: aload_0
    //   124: getfield Qnq : Z
    //   127: aload_0
    //   128: getfield Dne : LxoY;
    //   131: invokevirtual FWm : ()J
    //   134: ldc2_w 400
    //   137: lrem
    //   138: lconst_0
    //   139: lcmp
    //   140: ifne -> 147
    //   143: iconst_1
    //   144: goto -> 148
    //   147: iconst_0
    //   148: invokestatic Dne : (LRAN;ZZZ)I
    //   151: pop
    //   152: aload_0
    //   153: getfield Dne : LBkx;
    //   156: ldc_w 'chunkSource'
    //   159: invokevirtual FWm : (Ljava/lang/String;)V
    //   162: aload_0
    //   163: getfield Dne : LZfC;
    //   166: invokeinterface Dne : ()Z
    //   171: pop
    //   172: aload_0
    //   173: fconst_1
    //   174: invokevirtual Dne : (F)I
    //   177: istore_1
    //   178: iload_1
    //   179: aload_0
    //   180: getfield Dne : I
    //   183: if_icmpeq -> 191
    //   186: aload_0
    //   187: iload_1
    //   188: putfield Dne : I
    //   191: aload_0
    //   192: getfield Dne : LxoY;
    //   195: aload_0
    //   196: getfield Dne : LxoY;
    //   199: invokevirtual FWm : ()J
    //   202: lconst_1
    //   203: ladd
    //   204: invokevirtual Dne : (J)V
    //   207: aload_0
    //   208: getfield Dne : LxoY;
    //   211: aload_0
    //   212: getfield Dne : LxoY;
    //   215: invokevirtual bzF : ()J
    //   218: lconst_1
    //   219: ladd
    //   220: invokevirtual FWm : (J)V
    //   223: aload_0
    //   224: getfield Dne : LBkx;
    //   227: ldc_w 'tickPending'
    //   230: invokevirtual FWm : (Ljava/lang/String;)V
    //   233: aload_0
    //   234: iconst_0
    //   235: invokevirtual Dne : (Z)Z
    //   238: pop
    //   239: aload_0
    //   240: getfield Dne : LBkx;
    //   243: ldc 'tickTiles'
    //   245: invokevirtual FWm : (Ljava/lang/String;)V
    //   248: aload_0
    //   249: invokevirtual div : ()V
    //   252: aload_0
    //   253: getfield Dne : LBkx;
    //   256: ldc_w 'chunkMap'
    //   259: invokevirtual FWm : (Ljava/lang/String;)V
    //   262: aload_0
    //   263: getfield Dne : Lwrs;
    //   266: invokevirtual Dne : ()V
    //   269: aload_0
    //   270: getfield Dne : LBkx;
    //   273: ldc_w 'village'
    //   276: invokevirtual FWm : (Ljava/lang/String;)V
    //   279: aload_0
    //   280: getfield Dne : LPrX;
    //   283: invokevirtual FWm : ()V
    //   286: aload_0
    //   287: getfield Dne : LoJI;
    //   290: invokevirtual Dne : ()V
    //   293: aload_0
    //   294: getfield Dne : LBkx;
    //   297: ldc_w 'portalForcer'
    //   300: invokevirtual FWm : (Ljava/lang/String;)V
    //   303: aload_0
    //   304: getfield Dne : LtrS;
    //   307: aload_0
    //   308: invokevirtual FWm : ()J
    //   311: invokevirtual Dne : (J)V
    //   314: aload_0
    //   315: getfield Dne : LBkx;
    //   318: invokevirtual FWm : ()V
    //   321: aload_0
    //   322: invokespecial Vxn : ()V
    //   325: return
  }
  
  public void trS() {
    if (this.Dne.FWm())
      this.Dne.Dne(); 
  }
  
  public void XHL() {
    // Byte code:
    //   0: aload_0
    //   1: aload_0
    //   2: getfield Qnq : Ljava/util/List;
    //   5: invokeinterface isEmpty : ()Z
    //   10: ifne -> 17
    //   13: iconst_1
    //   14: goto -> 18
    //   17: iconst_0
    //   18: putfield DyG : Z
    //   21: aload_0
    //   22: getfield Qnq : Ljava/util/List;
    //   25: invokeinterface iterator : ()Ljava/util/Iterator;
    //   30: astore_1
    //   31: aload_1
    //   32: invokeinterface hasNext : ()Z
    //   37: ifeq -> 68
    //   40: aload_1
    //   41: invokeinterface next : ()Ljava/lang/Object;
    //   46: checkcast FiG
    //   49: astore_2
    //   50: aload_2
    //   51: invokevirtual Wwe : ()Z
    //   54: ifne -> 65
    //   57: aload_0
    //   58: iconst_0
    //   59: putfield DyG : Z
    //   62: goto -> 68
    //   65: goto -> 31
    //   68: return
  }
  
  public void FWm(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6) {
    Vxn vxn = new Vxn(paramInt1, paramInt2, paramInt3, paramInt4);
    byte b = 0;
    if (this.Dne != null && paramInt4 > 0) {
      if (zKP.Dne[paramInt4].zGp()) {
        if (Dne(vxn.Dne - b, vxn.FWm - b, vxn.bzF - b, vxn.Dne + b, vxn.FWm + b, vxn.bzF + b)) {
          int i = Dne(vxn.Dne, vxn.FWm, vxn.bzF);
          if (i == vxn.Qnq && i > 0)
            zKP.Dne[i].Dne(this, vxn.Dne, vxn.FWm, vxn.bzF, (Random)this.Dne); 
        } 
        return;
      } 
      paramInt5 = 1;
    } 
    if (Dne(paramInt1 - b, paramInt2 - b, paramInt3 - b, paramInt1 + b, paramInt2 + b, paramInt3 + b)) {
      if (paramInt4 > 0) {
        vxn.Dne(paramInt5 + this.Dne.FWm());
        vxn.Dne(paramInt6);
      } 
      if (!this.FWm.contains(vxn)) {
        this.FWm.add(vxn);
        this.Dne.add(vxn);
      } 
    } 
  }
  
  public void FWm() {
    // Byte code:
    //   0: aload_0
    //   1: getfield Qnq : Ljava/util/List;
    //   4: invokeinterface isEmpty : ()Z
    //   9: ifeq -> 30
    //   12: aload_0
    //   13: dup
    //   14: getfield zGp : I
    //   17: dup_x1
    //   18: iconst_1
    //   19: iadd
    //   20: putfield zGp : I
    //   23: sipush #1200
    //   26: if_icmplt -> 34
    //   29: return
    //   30: aload_0
    //   31: invokevirtual udO : ()V
    //   34: aload_0
    //   35: invokespecial FWm : ()V
    //   38: return
  }
  
  public oIf Dne(Icc paramIcc, int paramInt1, int paramInt2, int paramInt3) {
    List list = FWm().Dne(paramIcc, paramInt1, paramInt2, paramInt3);
    return (list != null && !list.isEmpty()) ? (oIf)nGp.Dne((Random)this.Dne, list) : null;
  }
  
  protected ZfC Dne() {
    YHU yHU = this.Dne.Dne((Jik)this.Dne);
    this.Dne = (fKu[])new EnH(this, yHU, this.Dne.Dne());
    return (ZfC)this.Dne;
  }
  
  public RAN(Jwh paramJwh, iDE paramiDE, String paramString, int paramInt, mrb parammrb, Bkx paramBkx, dLs paramdLs) {
    super(paramiDE, paramString, parammrb, Jik.Dne(paramInt), paramBkx, paramdLs);
    this.Dne = (fKu[])new ArrayList();
    this.Dne = (fKu[])paramJwh;
    this.Dne = (fKu[])new clp(this);
    this.Dne = (fKu[])new wrs(this, paramJwh.Dne().Qnq());
    if (this.Dne == null)
      this.Dne = (fKu[])new ZGT(); 
    if (this.FWm == null)
      this.FWm = new HashSet(); 
    if (this.Dne == null)
      this.Dne = (fKu[])new TreeSet(); 
    this.Dne = (fKu[])new trS(this);
    this.Dne = (fKu[])new kXX(paramJwh);
    hlz hlz = (hlz)this.Dne.Dne(hlz.class, "scoreboard");
    if (hlz == null) {
      hlz = new hlz();
      this.Dne.Dne("scoreboard", hlz);
    } 
    hlz.Dne((SFA)this.Dne);
    ((kXX)this.Dne).Dne(hlz);
  }
  
  public void bzF(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6) {
    Vxn vxn = new Vxn(paramInt1, paramInt2, paramInt3, paramInt4);
    vxn.Dne(paramInt6);
    if (paramInt4 > 0)
      vxn.Dne(paramInt5 + this.Dne.FWm()); 
    if (!this.FWm.contains(vxn)) {
      this.FWm.add(vxn);
      this.Dne.add(vxn);
    } 
  }
  
  public boolean bzF(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    Vxn vxn = new Vxn(paramInt1, paramInt2, paramInt3, paramInt4);
    return this.Dne.contains(vxn);
  }
  
  public List Dne(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6) {
    ArrayList<ipD> arrayList = new ArrayList();
    for (byte b = 0; b < this.bzF.size(); b++) {
      ipD ipD = this.bzF.get(b);
      if (ipD.Qnq >= paramInt1 && ipD.aFZ >= paramInt2 && ipD.zGp >= paramInt3 && ipD.Qnq < paramInt4 && ipD.aFZ < paramInt5 && ipD.zGp < paramInt6)
        arrayList.add(ipD); 
    } 
    return arrayList;
  }
  
  public boolean aFZ() {
    // Byte code:
    //   0: aload_0
    //   1: getfield DyG : Z
    //   4: ifeq -> 54
    //   7: aload_0
    //   8: getfield aFZ : Z
    //   11: ifne -> 54
    //   14: aload_0
    //   15: getfield Qnq : Ljava/util/List;
    //   18: invokeinterface iterator : ()Ljava/util/Iterator;
    //   23: astore_1
    //   24: aload_1
    //   25: invokeinterface hasNext : ()Z
    //   30: ifne -> 35
    //   33: iconst_1
    //   34: ireturn
    //   35: aload_1
    //   36: invokeinterface next : ()Ljava/lang/Object;
    //   41: checkcast FiG
    //   44: astore_2
    //   45: aload_2
    //   46: invokevirtual qrB : ()Z
    //   49: ifne -> 24
    //   52: iconst_0
    //   53: ireturn
    //   54: iconst_0
    //   55: ireturn
  }
  
  protected void ooe() {
    WvN wvN = new WvN(Dne, 10);
    for (byte b = 0; b < 10; b++) {
      int i = this.Dne.Dne() + this.Dne.nextInt(6) - this.Dne.nextInt(6);
      int j = this.Dne.bzF() + this.Dne.nextInt(6) - this.Dne.nextInt(6);
      int k = aFZ(i, j) + 1;
      if (wvN.Dne(this, (Random)this.Dne, i, k, j))
        break; 
    } 
  }
  
  private void Vxn() {
    while (!this.Dne[this.DyG].isEmpty()) {
      int i = this.DyG;
      this.DyG ^= 0x1;
      for (ceE ceE : this.Dne[i]) {
        if (Dne(ceE))
          this.Dne.Dne().Dne(ceE.Dne(), ceE.FWm(), ceE.bzF(), 64.0D, ((Jik)this.Dne).Dne, new VJn(ceE.Dne(), ceE.FWm(), ceE.bzF(), ceE.zGp(), ceE.Qnq(), ceE.aFZ())); 
      } 
      this.Dne[i].clear();
    } 
  }
  
  public void FWm(sMa paramsMa, boolean paramBoolean) {
    super.Dne(paramsMa, paramBoolean);
  }
  
  public Jwh Dne() {
    return (Jwh)this.Dne;
  }
  
  public void Dne(sMa paramsMa, byte paramByte) {
    JGj jGj = new JGj(paramsMa.aFZ, paramByte);
    Dne().FWm(paramsMa, jGj);
  }
  
  public clp Dne() {
    return (clp)this.Dne;
  }
  
  public void qLR() {
    this.Dne.Dne();
  }
  
  protected void FWm(sMa paramsMa) {
    super.FWm(paramsMa);
    this.Dne.FWm(paramsMa.aFZ);
    sMa[] arrayOfSMa = paramsMa.Dne();
    if (arrayOfSMa != null)
      for (byte b = 0; b < arrayOfSMa.length; b++)
        this.Dne.FWm((arrayOfSMa[b]).aFZ);  
  }
  
  public List Dne(qMV paramqMV, boolean paramBoolean) {
    ArrayList<Vxn> arrayList = null;
    Sxs sxs = paramqMV.Dne();
    int i = (sxs.Dne << 4) - 2;
    int j = i + 16 + 2;
    int k = (sxs.FWm << 4) - 2;
    int m = k + 16 + 2;
    for (byte b = 0; b < 2; b++) {
      Iterator<Vxn> iterator;
      if (b == 0) {
        iterator = this.Dne.iterator();
      } else {
        iterator = this.Dne.iterator();
        if (!this.Dne.isEmpty())
          System.out.println(this.Dne.size()); 
      } 
      while (iterator.hasNext()) {
        Vxn vxn = iterator.next();
        if (vxn.Dne >= i && vxn.Dne < j && vxn.bzF >= k && vxn.bzF < m) {
          if (paramBoolean) {
            this.FWm.remove(vxn);
            iterator.remove();
          } 
          if (arrayList == null)
            arrayList = new ArrayList(); 
          arrayList.add(vxn);
        } 
      } 
    } 
    return arrayList;
  }
  
  protected void Zpi() {
    mrb();
    this.Dne.Dne((xoY)this.Dne, this.Dne.Dne().Dne());
    this.Dne.Dne();
  }
  
  public boolean Dne(sMa paramsMa) {
    if (super.Dne(paramsMa)) {
      this.Dne.Dne().Dne(paramsMa.div, paramsMa.IjH, paramsMa.mrb, 512.0D, ((Jik)this.Dne).Dne, new Rle(paramsMa));
      return true;
    } 
    return false;
  }
  
  public wrs Dne() {
    return (wrs)this.Dne;
  }
  
  private void ATE() {
    this.Dne.zGp(0);
    this.Dne.FWm(false);
    this.Dne.aFZ(0);
    this.Dne.Dne(false);
  }
  
  public boolean Dne(FiG paramFiG, int paramInt1, int paramInt2, int paramInt3) {
    return !this.Dne.Dne(this, paramInt1, paramInt2, paramInt3, paramFiG);
  }
  
  public void Dne(sMa paramsMa, boolean paramBoolean) {
    if (!this.Dne.ooe() && (paramsMa instanceof HzK || paramsMa instanceof DIk))
      paramsMa.g_(); 
    if (!this.Dne.trS() && paramsMa instanceof LUQ)
      paramsMa.g_(); 
    if (!(paramsMa.Dne instanceof FiG))
      super.Dne(paramsMa, paramBoolean); 
  }
  
  public void Qnq(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6) {
    ceE ceE2;
    ceE ceE1 = new ceE(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6);
    Iterator<E> iterator = this.Dne[this.DyG].iterator();
    do {
      if (!iterator.hasNext()) {
        this.Dne[this.DyG].add((E)ceE1);
        return;
      } 
      ceE2 = (ceE)iterator.next();
    } while (!ceE2.equals(ceE1));
  }
  
  private boolean Dne(ceE paramceE) {
    int i = Dne(paramceE.Dne(), paramceE.FWm(), paramceE.bzF());
    return (i == paramceE.zGp()) ? zKP.Dne[i].Dne(this, paramceE.Dne(), paramceE.FWm(), paramceE.bzF(), paramceE.Qnq(), paramceE.aFZ()) : false;
  }
  
  public iSh FWm() {
    return this.Dne.Dne();
  }
  
  public void udO() {
    this.zGp = 0;
  }
  
  protected void kGO() {
    // Byte code:
    //   0: aload_0
    //   1: iconst_0
    //   2: putfield DyG : Z
    //   5: aload_0
    //   6: getfield Qnq : Ljava/util/List;
    //   9: invokeinterface iterator : ()Ljava/util/Iterator;
    //   14: astore_1
    //   15: aload_1
    //   16: invokeinterface hasNext : ()Z
    //   21: ifeq -> 51
    //   24: aload_1
    //   25: invokeinterface next : ()Ljava/lang/Object;
    //   30: checkcast FiG
    //   33: astore_2
    //   34: aload_2
    //   35: invokevirtual Wwe : ()Z
    //   38: ifeq -> 48
    //   41: aload_2
    //   42: iconst_0
    //   43: iconst_0
    //   44: iconst_1
    //   45: invokevirtual Dne : (ZZZ)V
    //   48: goto -> 15
    //   51: aload_0
    //   52: invokespecial ATE : ()V
    //   55: return
  }
  
  public void FWm(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5) {
    FWm(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, 0);
  }
  
  public yTR Dne(sMa paramsMa, double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat, boolean paramBoolean1, boolean paramBoolean2) {
    // Byte code:
    //   0: new yTR
    //   3: dup
    //   4: aload_0
    //   5: aload_1
    //   6: dload_2
    //   7: dload #4
    //   9: dload #6
    //   11: fload #8
    //   13: invokespecial <init> : (LQnq;LsMa;DDDF)V
    //   16: astore #11
    //   18: aload #11
    //   20: iload #9
    //   22: putfield Dne : Z
    //   25: aload #11
    //   27: iload #10
    //   29: putfield FWm : Z
    //   32: aload #11
    //   34: invokevirtual Dne : ()V
    //   37: aload #11
    //   39: iconst_0
    //   40: invokevirtual Dne : (Z)V
    //   43: iload #10
    //   45: ifne -> 58
    //   48: aload #11
    //   50: getfield Dne : Ljava/util/List;
    //   53: invokeinterface clear : ()V
    //   58: aload_0
    //   59: getfield Qnq : Ljava/util/List;
    //   62: invokeinterface iterator : ()Ljava/util/Iterator;
    //   67: astore #12
    //   69: aload #12
    //   71: invokeinterface hasNext : ()Z
    //   76: ifeq -> 156
    //   79: aload #12
    //   81: invokeinterface next : ()Ljava/lang/Object;
    //   86: checkcast FiG
    //   89: astore #13
    //   91: aload #13
    //   93: dload_2
    //   94: dload #4
    //   96: dload #6
    //   98: invokevirtual Dne : (DDD)D
    //   101: ldc2_w 4096.0
    //   104: dcmpg
    //   105: ifge -> 153
    //   108: aload #13
    //   110: checkcast PJQ
    //   113: getfield Dne : LTnv;
    //   116: new UdA
    //   119: dup
    //   120: dload_2
    //   121: dload #4
    //   123: dload #6
    //   125: fload #8
    //   127: aload #11
    //   129: getfield Dne : Ljava/util/List;
    //   132: aload #11
    //   134: invokevirtual Dne : ()Ljava/util/Map;
    //   137: aload #13
    //   139: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   144: checkcast chN
    //   147: invokespecial <init> : (DDDFLjava/util/List;LchN;)V
    //   150: invokevirtual Dne : (LNER;)V
    //   153: goto -> 69
    //   156: aload #11
    //   158: areturn
  }
  
  public void Dne(boolean paramBoolean, TaY paramTaY) {
    if (this.Dne.FWm()) {
      if (paramTaY != null)
        paramTaY.FWm("Saving level"); 
      Zpi();
      if (paramTaY != null)
        paramTaY.Qnq("Saving chunks"); 
      this.Dne.Dne(paramBoolean, paramTaY);
    } 
  }
  
  protected void aFZ() {
    boolean bool = bzF();
    super.aFZ();
    if (bool != bzF())
      if (bool) {
        this.Dne.Dne().Dne(new Tnn(2, 0));
      } else {
        this.Dne.Dne().Dne(new Tnn(1, 0));
      }  
  }
  
  protected void Dne(mrb parammrb) {
    if (this.Dne == null)
      this.Dne = (fKu[])new ZGT(); 
    if (this.FWm == null)
      this.FWm = new HashSet(); 
    if (this.Dne == null)
      this.Dne = (fKu[])new TreeSet(); 
    FWm(parammrb);
    super.Dne(parammrb);
  }
  
  public void Dne() {
    if (this.Dne.FWm() <= 0)
      this.Dne.FWm(64); 
    int i = this.Dne.Dne();
    int j = this.Dne.bzF();
    byte b = 0;
    while (Dne(i, j) == 0) {
      i += this.Dne.nextInt(8) - this.Dne.nextInt(8);
      j += this.Dne.nextInt(8) - this.Dne.nextInt(8);
      if (++b == '✐')
        break; 
    } 
    this.Dne.Dne(i);
    this.Dne.bzF(j);
  }
  
  public sMa Dne(int paramInt) {
    return (sMa)this.Dne.Dne(paramInt);
  }
  
  protected void Dne(sMa paramsMa) {
    super.Dne(paramsMa);
    this.Dne.Dne(paramsMa.aFZ, paramsMa);
    sMa[] arrayOfSMa = paramsMa.Dne();
    if (arrayOfSMa != null)
      for (byte b = 0; b < arrayOfSMa.length; b++)
        this.Dne.Dne((arrayOfSMa[b]).aFZ, arrayOfSMa[b]);  
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\RAN.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */