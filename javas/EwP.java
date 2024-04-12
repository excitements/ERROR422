import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class EwP implements ROX, YHU {
  private Object Dne;
  
  private List Dne;
  
  private final File Dne;
  
  private Set Dne = (Set)new ArrayList();
  
  public void FWm() {
    while (Dne());
  }
  
  protected void Dne(Sxs paramSxs, WkD paramWkD) {
    // Byte code:
    //   0: aload_0
    //   1: getfield Dne : Ljava/lang/Object;
    //   4: astore_3
    //   5: aload_0
    //   6: getfield Dne : Ljava/lang/Object;
    //   9: dup
    //   10: astore #4
    //   12: monitorenter
    //   13: aload_0
    //   14: getfield Dne : Ljava/util/Set;
    //   17: aload_1
    //   18: invokeinterface contains : (Ljava/lang/Object;)Z
    //   23: ifeq -> 98
    //   26: iconst_0
    //   27: istore #5
    //   29: iload #5
    //   31: aload_0
    //   32: getfield Dne : Ljava/util/List;
    //   35: invokeinterface size : ()I
    //   40: if_icmpge -> 98
    //   43: aload_0
    //   44: getfield Dne : Ljava/util/List;
    //   47: iload #5
    //   49: invokeinterface get : (I)Ljava/lang/Object;
    //   54: checkcast xEx
    //   57: getfield Dne : LSxs;
    //   60: aload_1
    //   61: invokevirtual equals : (Ljava/lang/Object;)Z
    //   64: ifeq -> 92
    //   67: aload_0
    //   68: getfield Dne : Ljava/util/List;
    //   71: iload #5
    //   73: new xEx
    //   76: dup
    //   77: aload_1
    //   78: aload_2
    //   79: invokespecial <init> : (LSxs;LWkD;)V
    //   82: invokeinterface set : (ILjava/lang/Object;)Ljava/lang/Object;
    //   87: pop
    //   88: aload #4
    //   90: monitorexit
    //   91: return
    //   92: iinc #5, 1
    //   95: goto -> 29
    //   98: aload_0
    //   99: getfield Dne : Ljava/util/List;
    //   102: new xEx
    //   105: dup
    //   106: aload_1
    //   107: aload_2
    //   108: invokespecial <init> : (LSxs;LWkD;)V
    //   111: invokeinterface add : (Ljava/lang/Object;)Z
    //   116: pop
    //   117: aload_0
    //   118: getfield Dne : Ljava/util/Set;
    //   121: aload_1
    //   122: invokeinterface add : (Ljava/lang/Object;)Z
    //   127: pop
    //   128: getstatic Osh.Dne : LOsh;
    //   131: aload_0
    //   132: invokevirtual Dne : (LROX;)V
    //   135: aload #4
    //   137: monitorexit
    //   138: goto -> 149
    //   141: astore #6
    //   143: aload #4
    //   145: monitorexit
    //   146: aload #6
    //   148: athrow
    //   149: return
    // Exception table:
    //   from	to	target	type
    //   13	91	141	finally
    //   92	138	141	finally
    //   141	146	141	finally
  }
  
  protected qMV Dne(Qnq paramQnq, int paramInt1, int paramInt2, WkD paramWkD) {
    if (!paramWkD.Dne("Level")) {
      paramQnq.Dne().bzF("Chunk file at " + paramInt1 + "," + paramInt2 + " is missing level data, skipping");
      return null;
    } 
    if (!paramWkD.Dne("Level").Dne("Sections")) {
      paramQnq.Dne().bzF("Chunk file at " + paramInt1 + "," + paramInt2 + " is missing block data, skipping");
      return null;
    } 
    qMV qMV = Dne(paramQnq, paramWkD.Dne("Level"));
    if (!qMV.Dne(paramInt1, paramInt2)) {
      paramQnq.Dne().bzF("Chunk file at " + paramInt1 + "," + paramInt2 + " is in the wrong location; relocating. (Expected " + paramInt1 + ", " + paramInt2 + ", got " + qMV.Dne + ", " + qMV.FWm + ")");
      paramWkD.Dne("xPos", paramInt1);
      paramWkD.Dne("zPos", paramInt2);
      qMV = Dne(paramQnq, paramWkD.Dne("Level"));
    } 
    return qMV;
  }
  
  private void Dne(xEx paramxEx) {
    DataOutputStream dataOutputStream = LoG.Dne((File)this.Dne, ((Sxs)paramxEx.Dne).Dne, ((Sxs)paramxEx.Dne).FWm);
    VVx.Dne(paramxEx.Dne, dataOutputStream);
    dataOutputStream.close();
  }
  
  public void Dne() {}
  
  public EwP(File paramFile) {
    this.Dne = new HashSet();
    this.Dne = (Set)new Object();
    this.Dne = (Set)paramFile;
  }
  
  private void Dne(qMV paramqMV, Qnq paramQnq, WkD paramWkD) {
    // Byte code:
    //   0: aload_3
    //   1: ldc 'xPos'
    //   3: aload_1
    //   4: getfield Dne : I
    //   7: invokevirtual Dne : (Ljava/lang/String;I)V
    //   10: aload_3
    //   11: ldc 'zPos'
    //   13: aload_1
    //   14: getfield FWm : I
    //   17: invokevirtual Dne : (Ljava/lang/String;I)V
    //   20: aload_3
    //   21: ldc 'LastUpdate'
    //   23: aload_2
    //   24: invokevirtual FWm : ()J
    //   27: invokevirtual Dne : (Ljava/lang/String;J)V
    //   30: aload_3
    //   31: ldc 'HeightMap'
    //   33: aload_1
    //   34: getfield FWm : [I
    //   37: invokevirtual Dne : (Ljava/lang/String;[I)V
    //   40: aload_3
    //   41: ldc 'TerrainPopulated'
    //   43: aload_1
    //   44: getfield bzF : Z
    //   47: invokevirtual Dne : (Ljava/lang/String;Z)V
    //   50: aload_1
    //   51: invokevirtual Dne : ()[LcHy;
    //   54: astore #4
    //   56: new mbZ
    //   59: dup
    //   60: ldc 'Sections'
    //   62: invokespecial <init> : (Ljava/lang/String;)V
    //   65: astore #5
    //   67: aload_2
    //   68: getfield Dne : LJik;
    //   71: getfield FWm : Z
    //   74: ifne -> 81
    //   77: iconst_1
    //   78: goto -> 82
    //   81: iconst_0
    //   82: istore #6
    //   84: aload #4
    //   86: astore #7
    //   88: aload #4
    //   90: arraylength
    //   91: istore #8
    //   93: iconst_0
    //   94: istore #10
    //   96: iload #10
    //   98: iload #8
    //   100: if_icmpge -> 264
    //   103: aload #7
    //   105: iload #10
    //   107: aaload
    //   108: astore #11
    //   110: aload #11
    //   112: ifnull -> 258
    //   115: new WkD
    //   118: dup
    //   119: invokespecial <init> : ()V
    //   122: astore #9
    //   124: aload #9
    //   126: ldc 'Y'
    //   128: aload #11
    //   130: invokevirtual Dne : ()I
    //   133: iconst_4
    //   134: ishr
    //   135: sipush #255
    //   138: iand
    //   139: i2b
    //   140: invokevirtual Dne : (Ljava/lang/String;B)V
    //   143: aload #9
    //   145: ldc 'Blocks'
    //   147: aload #11
    //   149: invokevirtual Dne : ()[B
    //   152: invokevirtual Dne : (Ljava/lang/String;[B)V
    //   155: aload #11
    //   157: invokevirtual Dne : ()LFYZ;
    //   160: ifnull -> 178
    //   163: aload #9
    //   165: ldc 'Add'
    //   167: aload #11
    //   169: invokevirtual Dne : ()LFYZ;
    //   172: getfield Dne : [B
    //   175: invokevirtual Dne : (Ljava/lang/String;[B)V
    //   178: aload #9
    //   180: ldc 'Data'
    //   182: aload #11
    //   184: invokevirtual FWm : ()LFYZ;
    //   187: getfield Dne : [B
    //   190: invokevirtual Dne : (Ljava/lang/String;[B)V
    //   193: aload #9
    //   195: ldc 'BlockLight'
    //   197: aload #11
    //   199: invokevirtual bzF : ()LFYZ;
    //   202: getfield Dne : [B
    //   205: invokevirtual Dne : (Ljava/lang/String;[B)V
    //   208: iload #6
    //   210: ifeq -> 232
    //   213: aload #9
    //   215: ldc_w 'SkyLight'
    //   218: aload #11
    //   220: invokevirtual Qnq : ()LFYZ;
    //   223: getfield Dne : [B
    //   226: invokevirtual Dne : (Ljava/lang/String;[B)V
    //   229: goto -> 251
    //   232: aload #9
    //   234: ldc_w 'SkyLight'
    //   237: aload #11
    //   239: invokevirtual bzF : ()LFYZ;
    //   242: getfield Dne : [B
    //   245: arraylength
    //   246: newarray byte
    //   248: invokevirtual Dne : (Ljava/lang/String;[B)V
    //   251: aload #5
    //   253: aload #9
    //   255: invokevirtual Dne : (LoNe;)V
    //   258: iinc #10, 1
    //   261: goto -> 96
    //   264: aload_3
    //   265: ldc 'Sections'
    //   267: aload #5
    //   269: invokevirtual Dne : (Ljava/lang/String;LoNe;)V
    //   272: aload_3
    //   273: ldc_w 'Biomes'
    //   276: aload_1
    //   277: invokevirtual Dne : ()[B
    //   280: invokevirtual Dne : (Ljava/lang/String;[B)V
    //   283: aload_1
    //   284: iconst_0
    //   285: putfield aFZ : Z
    //   288: new mbZ
    //   291: dup
    //   292: invokespecial <init> : ()V
    //   295: astore #10
    //   297: iconst_0
    //   298: istore #8
    //   300: iload #8
    //   302: aload_1
    //   303: getfield Dne : [Ljava/util/List;
    //   306: arraylength
    //   307: if_icmpge -> 386
    //   310: aload_1
    //   311: getfield Dne : [Ljava/util/List;
    //   314: iload #8
    //   316: aaload
    //   317: invokeinterface iterator : ()Ljava/util/Iterator;
    //   322: astore #11
    //   324: aload #11
    //   326: invokeinterface hasNext : ()Z
    //   331: ifeq -> 380
    //   334: aload #11
    //   336: invokeinterface next : ()Ljava/lang/Object;
    //   341: checkcast sMa
    //   344: astore #12
    //   346: new WkD
    //   349: dup
    //   350: invokespecial <init> : ()V
    //   353: astore #9
    //   355: aload #12
    //   357: aload #9
    //   359: invokevirtual FWm : (LWkD;)Z
    //   362: ifeq -> 377
    //   365: aload_1
    //   366: iconst_1
    //   367: putfield aFZ : Z
    //   370: aload #10
    //   372: aload #9
    //   374: invokevirtual Dne : (LoNe;)V
    //   377: goto -> 324
    //   380: iinc #8, 1
    //   383: goto -> 300
    //   386: aload_3
    //   387: ldc_w 'Entities'
    //   390: aload #10
    //   392: invokevirtual Dne : (Ljava/lang/String;LoNe;)V
    //   395: new mbZ
    //   398: dup
    //   399: invokespecial <init> : ()V
    //   402: astore #12
    //   404: aload_1
    //   405: getfield Dne : Ljava/util/Map;
    //   408: invokeinterface values : ()Ljava/util/Collection;
    //   413: invokeinterface iterator : ()Ljava/util/Iterator;
    //   418: astore #11
    //   420: aload #11
    //   422: invokeinterface hasNext : ()Z
    //   427: ifeq -> 468
    //   430: aload #11
    //   432: invokeinterface next : ()Ljava/lang/Object;
    //   437: checkcast ipD
    //   440: astore #13
    //   442: new WkD
    //   445: dup
    //   446: invokespecial <init> : ()V
    //   449: astore #9
    //   451: aload #13
    //   453: aload #9
    //   455: invokevirtual FWm : (LWkD;)V
    //   458: aload #12
    //   460: aload #9
    //   462: invokevirtual Dne : (LoNe;)V
    //   465: goto -> 420
    //   468: aload_3
    //   469: ldc_w 'TileEntities'
    //   472: aload #12
    //   474: invokevirtual Dne : (Ljava/lang/String;LoNe;)V
    //   477: aload_2
    //   478: aload_1
    //   479: iconst_0
    //   480: invokevirtual Dne : (LqMV;Z)Ljava/util/List;
    //   483: astore #13
    //   485: aload #13
    //   487: ifnull -> 646
    //   490: aload_2
    //   491: invokevirtual FWm : ()J
    //   494: lstore #14
    //   496: new mbZ
    //   499: dup
    //   500: invokespecial <init> : ()V
    //   503: astore #16
    //   505: aload #13
    //   507: invokeinterface iterator : ()Ljava/util/Iterator;
    //   512: astore #17
    //   514: aload #17
    //   516: invokeinterface hasNext : ()Z
    //   521: ifeq -> 637
    //   524: aload #17
    //   526: invokeinterface next : ()Ljava/lang/Object;
    //   531: checkcast Vxn
    //   534: astore #18
    //   536: new WkD
    //   539: dup
    //   540: invokespecial <init> : ()V
    //   543: astore #19
    //   545: aload #19
    //   547: ldc_w 'i'
    //   550: aload #18
    //   552: getfield Qnq : I
    //   555: invokevirtual Dne : (Ljava/lang/String;I)V
    //   558: aload #19
    //   560: ldc_w 'x'
    //   563: aload #18
    //   565: getfield Dne : I
    //   568: invokevirtual Dne : (Ljava/lang/String;I)V
    //   571: aload #19
    //   573: ldc_w 'y'
    //   576: aload #18
    //   578: getfield FWm : I
    //   581: invokevirtual Dne : (Ljava/lang/String;I)V
    //   584: aload #19
    //   586: ldc_w 'z'
    //   589: aload #18
    //   591: getfield bzF : I
    //   594: invokevirtual Dne : (Ljava/lang/String;I)V
    //   597: aload #19
    //   599: ldc_w 't'
    //   602: aload #18
    //   604: getfield Dne : J
    //   607: lload #14
    //   609: lsub
    //   610: l2i
    //   611: invokevirtual Dne : (Ljava/lang/String;I)V
    //   614: aload #19
    //   616: ldc_w 'p'
    //   619: aload #18
    //   621: getfield aFZ : I
    //   624: invokevirtual Dne : (Ljava/lang/String;I)V
    //   627: aload #16
    //   629: aload #19
    //   631: invokevirtual Dne : (LoNe;)V
    //   634: goto -> 514
    //   637: aload_3
    //   638: ldc_w 'TileTicks'
    //   641: aload #16
    //   643: invokevirtual Dne : (Ljava/lang/String;LoNe;)V
    //   646: return
  }
  
  private qMV Dne(Qnq paramQnq, WkD paramWkD) {
    int i = paramWkD.Dne("xPos");
    int j = paramWkD.Dne("zPos");
    qMV qMV = new qMV(paramQnq, i, j);
    qMV.FWm = paramWkD.Dne("HeightMap");
    qMV.bzF = paramWkD.FWm("TerrainPopulated");
    mbZ mbZ1 = paramWkD.Dne("Sections");
    byte b1 = 16;
    cHy[] arrayOfCHy = new cHy[b1];
    boolean bool = !((Jik)paramQnq.Dne).FWm ? true : false;
    for (byte b2 = 0; b2 < mbZ1.Dne(); b2++) {
      WkD wkD = (WkD)mbZ1.FWm(b2);
      byte b = wkD.Dne("Y");
      cHy cHy = new cHy(b << 4, bool);
      cHy.Dne(wkD.Dne("Blocks"));
      if (wkD.Dne("Add"))
        cHy.Dne(new FYZ(wkD.Dne("Add"), 4)); 
      cHy.FWm(new FYZ(wkD.Dne("Data"), 4));
      cHy.bzF(new FYZ(wkD.Dne("BlockLight"), 4));
      if (bool)
        cHy.Qnq(new FYZ(wkD.Dne("SkyLight"), 4)); 
      cHy.Dne();
      arrayOfCHy[b] = cHy;
    } 
    qMV.Dne(arrayOfCHy);
    if (paramWkD.Dne("Biomes"))
      qMV.Dne(paramWkD.Dne("Biomes")); 
    mbZ mbZ2 = paramWkD.Dne("Entities");
    if (mbZ2 != null)
      for (byte b = 0; b < mbZ2.Dne(); b++) {
        WkD wkD = (WkD)mbZ2.FWm(b);
        sMa sMa = Klb.Dne(wkD, paramQnq);
        qMV.aFZ = true;
        if (sMa != null) {
          qMV.Dne(sMa);
          sMa sMa1 = sMa;
          for (WkD wkD1 = wkD; wkD1.Dne("Riding"); wkD1 = wkD1.Dne("Riding")) {
            sMa sMa2 = Klb.Dne(wkD1.Dne("Riding"), paramQnq);
            if (sMa2 != null) {
              qMV.Dne(sMa2);
              sMa1.bzF(sMa2);
            } 
            sMa1 = sMa2;
          } 
        } 
      }  
    mbZ mbZ3 = paramWkD.Dne("TileEntities");
    if (mbZ3 != null)
      for (byte b = 0; b < mbZ3.Dne(); b++) {
        WkD wkD = (WkD)mbZ3.FWm(b);
        ipD ipD = ipD.Dne(wkD);
        if (ipD != null)
          qMV.Dne(ipD); 
      }  
    if (paramWkD.Dne("TileTicks")) {
      mbZ mbZ = paramWkD.Dne("TileTicks");
      if (mbZ != null)
        for (byte b = 0; b < mbZ.Dne(); b++) {
          WkD wkD = (WkD)mbZ.FWm(b);
          paramQnq.bzF(wkD.Dne("x"), wkD.Dne("y"), wkD.Dne("z"), wkD.Dne("i"), wkD.Dne("t"), wkD.Dne("p"));
        }  
    } 
    return qMV;
  }
  
  public void Dne(Qnq paramQnq, qMV paramqMV) {
    paramQnq.mrb();
    try {
      WkD wkD1 = new WkD();
      WkD wkD2 = new WkD();
      wkD1.Dne("Level", wkD2);
      Dne(paramqMV, paramQnq, wkD2);
      Dne(paramqMV.Dne(), wkD1);
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  public void FWm(Qnq paramQnq, qMV paramqMV) {}
  
  public qMV Dne(Qnq paramQnq, int paramInt1, int paramInt2) {
    WkD wkD = null;
    Sxs sxs = new Sxs(paramInt1, paramInt2);
    Set set = this.Dne;
    synchronized (this.Dne) {
      if (this.Dne.contains(sxs))
        for (byte b = 0; b < this.Dne.size(); b++) {
          if (((xEx)this.Dne.get(b)).Dne.equals(sxs)) {
            wkD = ((xEx)this.Dne.get(b)).Dne;
            break;
          } 
        }  
    } 
    if (wkD == null) {
      DataInputStream dataInputStream = LoG.Dne((File)this.Dne, paramInt1, paramInt2);
      if (dataInputStream == null)
        return null; 
      wkD = VVx.Dne(dataInputStream);
    } 
    return Dne(paramQnq, paramInt1, paramInt2, wkD);
  }
  
  public boolean Dne() {
    xEx xEx = null;
    Set set = this.Dne;
    synchronized (this.Dne) {
      if (this.Dne.isEmpty())
        return false; 
      xEx = this.Dne.remove(0);
      this.Dne.remove(xEx.Dne);
    } 
    if (xEx != null)
      try {
        Dne(xEx);
      } catch (Exception exception) {
        exception.printStackTrace();
      }  
    return true;
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\EwP.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */