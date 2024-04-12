import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class fCQ implements Rbp {
  private final Map Dne;
  
  private final HashMap Dne;
  
  private final String FWm;
  
  private xPm Dne;
  
  private final String Dne;
  
  private final int Dne;
  
  private final List Dne;
  
  private final String bzF;
  
  private BufferedImage Dne;
  
  private dmo Dne = (dmo)new HashMap<>();
  
  public void FWm() {
    for (xPm xPm1 : this.Dne)
      xPm1.Dne(); 
  }
  
  public gDn Dne(String paramString) {
    if (paramString == null)
      (new RuntimeException("Don't register null!")).printStackTrace(); 
    xPm xPm1 = (xPm)this.Dne.get(paramString);
    if (xPm1 == null) {
      xPm1 = xPm.Dne(paramString);
      this.Dne.put(paramString, xPm1);
    } 
    return xPm1;
  }
  
  public fCQ(int paramInt, String paramString1, String paramString2, BufferedImage paramBufferedImage) {
    this.Dne = (dmo)new BufferedImage(64, 64, 2);
    this.Dne = (dmo)new ArrayList();
    this.Dne = (dmo)new HashMap<>();
    this.Dne = paramInt;
    this.Dne = (dmo)paramString1;
    this.FWm = paramString2;
    this.bzF = ".png";
    this.Dne = (dmo)paramBufferedImage;
  }
  
  public dmo Dne() {
    return this.Dne;
  }
  
  public gDn Dne() {
    return (gDn)this.Dne;
  }
  
  public void Dne() {
    // Byte code:
    //   0: aload_0
    //   1: getfield Dne : Ljava/util/Map;
    //   4: invokeinterface clear : ()V
    //   9: aload_0
    //   10: getfield Dne : I
    //   13: ifne -> 69
    //   16: getstatic zKP.Dne : [LzKP;
    //   19: astore_3
    //   20: aload_3
    //   21: arraylength
    //   22: istore_1
    //   23: iconst_0
    //   24: istore_2
    //   25: iload_2
    //   26: iload_1
    //   27: if_icmpge -> 52
    //   30: aload_3
    //   31: iload_2
    //   32: aaload
    //   33: astore #4
    //   35: aload #4
    //   37: ifnull -> 46
    //   40: aload #4
    //   42: aload_0
    //   43: invokevirtual Dne : (LRbp;)V
    //   46: iinc #2, 1
    //   49: goto -> 25
    //   52: invokestatic Dne : ()Lnet/minecraft/client/Minecraft;
    //   55: getfield Dne : Lrqj;
    //   58: aload_0
    //   59: invokevirtual Dne : (LRbp;)V
    //   62: getstatic ptH.Dne : LptH;
    //   65: aload_0
    //   66: invokevirtual Dne : (LRbp;)V
    //   69: getstatic dEr.Dne : [LdEr;
    //   72: astore_3
    //   73: aload_3
    //   74: arraylength
    //   75: istore_1
    //   76: iconst_0
    //   77: istore_2
    //   78: iload_2
    //   79: iload_1
    //   80: if_icmpge -> 117
    //   83: aload_3
    //   84: iload_2
    //   85: aaload
    //   86: astore #4
    //   88: aload #4
    //   90: ifnull -> 111
    //   93: aload #4
    //   95: invokevirtual bzF : ()I
    //   98: aload_0
    //   99: getfield Dne : I
    //   102: if_icmpne -> 111
    //   105: aload #4
    //   107: aload_0
    //   108: invokevirtual Dne : (LRbp;)V
    //   111: iinc #2, 1
    //   114: goto -> 78
    //   117: new java/util/HashMap
    //   120: dup
    //   121: invokespecial <init> : ()V
    //   124: astore #4
    //   126: invokestatic Dne : ()LzpX;
    //   129: aload_0
    //   130: getfield Dne : Ljava/lang/String;
    //   133: invokevirtual Dne : (Ljava/lang/String;)LdGv;
    //   136: astore #5
    //   138: aload_0
    //   139: getfield Dne : Ljava/util/HashMap;
    //   142: invokevirtual clear : ()V
    //   145: aload_0
    //   146: getfield Dne : Ljava/util/List;
    //   149: invokeinterface clear : ()V
    //   154: invokestatic Dne : ()LzpX;
    //   157: ldc 'missingno'
    //   159: iconst_2
    //   160: aload_0
    //   161: getfield Dne : Ljava/awt/image/BufferedImage;
    //   164: invokevirtual getWidth : ()I
    //   167: aload_0
    //   168: getfield Dne : Ljava/awt/image/BufferedImage;
    //   171: invokevirtual getHeight : ()I
    //   174: sipush #10496
    //   177: sipush #6408
    //   180: sipush #9728
    //   183: sipush #9728
    //   186: iconst_0
    //   187: aload_0
    //   188: getfield Dne : Ljava/awt/image/BufferedImage;
    //   191: invokevirtual Dne : (Ljava/lang/String;IIIIIIIZLjava/awt/image/BufferedImage;)Ldmo;
    //   194: astore #6
    //   196: new WbP
    //   199: dup
    //   200: aload #6
    //   202: invokespecial <init> : (Ldmo;)V
    //   205: astore #7
    //   207: aload #5
    //   209: aload #7
    //   211: invokevirtual Dne : (LWbP;)V
    //   214: aload #4
    //   216: aload #7
    //   218: iconst_1
    //   219: anewarray dmo
    //   222: dup
    //   223: iconst_0
    //   224: aload #6
    //   226: aastore
    //   227: invokestatic asList : ([Ljava/lang/Object;)Ljava/util/List;
    //   230: invokevirtual put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   233: pop
    //   234: aload_0
    //   235: getfield Dne : Ljava/util/Map;
    //   238: invokeinterface keySet : ()Ljava/util/Set;
    //   243: invokeinterface iterator : ()Ljava/util/Iterator;
    //   248: astore #8
    //   250: aload #8
    //   252: invokeinterface hasNext : ()Z
    //   257: ifeq -> 363
    //   260: aload #8
    //   262: invokeinterface next : ()Ljava/lang/Object;
    //   267: checkcast java/lang/String
    //   270: astore #9
    //   272: new java/lang/StringBuilder
    //   275: dup
    //   276: invokespecial <init> : ()V
    //   279: aload_0
    //   280: getfield FWm : Ljava/lang/String;
    //   283: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   286: aload #9
    //   288: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   291: aload_0
    //   292: getfield bzF : Ljava/lang/String;
    //   295: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   298: invokevirtual toString : ()Ljava/lang/String;
    //   301: astore #10
    //   303: invokestatic Dne : ()LzpX;
    //   306: aload #10
    //   308: invokevirtual Dne : (Ljava/lang/String;)Ljava/util/List;
    //   311: astore #11
    //   313: aload #11
    //   315: invokeinterface isEmpty : ()Z
    //   320: ifne -> 360
    //   323: new WbP
    //   326: dup
    //   327: aload #11
    //   329: iconst_0
    //   330: invokeinterface get : (I)Ljava/lang/Object;
    //   335: checkcast dmo
    //   338: invokespecial <init> : (Ldmo;)V
    //   341: astore #12
    //   343: aload #5
    //   345: aload #12
    //   347: invokevirtual Dne : (LWbP;)V
    //   350: aload #4
    //   352: aload #12
    //   354: aload #11
    //   356: invokevirtual put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   359: pop
    //   360: goto -> 250
    //   363: aload #5
    //   365: invokevirtual Dne : ()V
    //   368: goto -> 376
    //   371: astore #9
    //   373: aload #9
    //   375: athrow
    //   376: aload_0
    //   377: aload #5
    //   379: invokevirtual Dne : ()Ldmo;
    //   382: putfield Dne : Ldmo;
    //   385: aload #5
    //   387: invokevirtual Dne : ()Ljava/util/List;
    //   390: invokeinterface iterator : ()Ljava/util/Iterator;
    //   395: astore #8
    //   397: aload #8
    //   399: invokeinterface hasNext : ()Z
    //   404: ifeq -> 818
    //   407: aload #8
    //   409: invokeinterface next : ()Ljava/lang/Object;
    //   414: checkcast wjH
    //   417: astore #9
    //   419: aload #9
    //   421: invokevirtual Dne : ()LWbP;
    //   424: astore #10
    //   426: aload #10
    //   428: invokevirtual Dne : ()Ldmo;
    //   431: astore #11
    //   433: aload #11
    //   435: invokevirtual Dne : ()Ljava/lang/String;
    //   438: astore #12
    //   440: aload #4
    //   442: aload #10
    //   444: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   447: checkcast java/util/List
    //   450: astore #13
    //   452: aload_0
    //   453: getfield Dne : Ljava/util/Map;
    //   456: aload #12
    //   458: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   463: checkcast xPm
    //   466: astore #14
    //   468: iconst_0
    //   469: istore #15
    //   471: aload #14
    //   473: ifnonnull -> 539
    //   476: iconst_1
    //   477: istore #15
    //   479: aload #12
    //   481: invokestatic Dne : (Ljava/lang/String;)LxPm;
    //   484: astore #14
    //   486: aload #12
    //   488: ldc 'missingno'
    //   490: invokevirtual equals : (Ljava/lang/Object;)Z
    //   493: ifne -> 539
    //   496: invokestatic Dne : ()Lnet/minecraft/client/Minecraft;
    //   499: invokevirtual Dne : ()LdLs;
    //   502: new java/lang/StringBuilder
    //   505: dup
    //   506: invokespecial <init> : ()V
    //   509: ldc 'Couldn't find premade icon for '
    //   511: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   514: aload #12
    //   516: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   519: ldc ' doing '
    //   521: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   524: aload_0
    //   525: getfield Dne : Ljava/lang/String;
    //   528: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   531: invokevirtual toString : ()Ljava/lang/String;
    //   534: invokeinterface FWm : (Ljava/lang/String;)V
    //   539: aload #14
    //   541: aload_0
    //   542: getfield Dne : Ldmo;
    //   545: aload #13
    //   547: aload #9
    //   549: invokevirtual Dne : ()I
    //   552: aload #9
    //   554: invokevirtual FWm : ()I
    //   557: aload #10
    //   559: invokevirtual Dne : ()Ldmo;
    //   562: invokevirtual bzF : ()I
    //   565: aload #10
    //   567: invokevirtual Dne : ()Ldmo;
    //   570: invokevirtual Qnq : ()I
    //   573: aload #10
    //   575: invokevirtual Dne : ()Z
    //   578: invokevirtual Dne : (Ldmo;Ljava/util/List;IIIIZ)V
    //   581: aload_0
    //   582: getfield Dne : Ljava/util/HashMap;
    //   585: aload #12
    //   587: aload #14
    //   589: invokevirtual put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   592: pop
    //   593: iload #15
    //   595: ifne -> 610
    //   598: aload_0
    //   599: getfield Dne : Ljava/util/Map;
    //   602: aload #12
    //   604: invokeinterface remove : (Ljava/lang/Object;)Ljava/lang/Object;
    //   609: pop
    //   610: aload #13
    //   612: invokeinterface size : ()I
    //   617: iconst_1
    //   618: if_icmple -> 815
    //   621: aload_0
    //   622: getfield Dne : Ljava/util/List;
    //   625: aload #14
    //   627: invokeinterface add : (Ljava/lang/Object;)Z
    //   632: pop
    //   633: new java/lang/StringBuilder
    //   636: dup
    //   637: invokespecial <init> : ()V
    //   640: aload_0
    //   641: getfield FWm : Ljava/lang/String;
    //   644: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   647: aload #12
    //   649: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   652: ldc_w '.txt'
    //   655: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   658: invokevirtual toString : ()Ljava/lang/String;
    //   661: astore #16
    //   663: invokestatic Dne : ()Lnet/minecraft/client/Minecraft;
    //   666: getfield Dne : Lark;
    //   669: invokevirtual Dne : ()LGax;
    //   672: astore #17
    //   674: aload #17
    //   676: new java/lang/StringBuilder
    //   679: dup
    //   680: invokespecial <init> : ()V
    //   683: ldc_w '/'
    //   686: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   689: aload_0
    //   690: getfield FWm : Ljava/lang/String;
    //   693: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   696: aload #12
    //   698: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   701: ldc '.png'
    //   703: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   706: invokevirtual toString : ()Ljava/lang/String;
    //   709: iconst_0
    //   710: invokeinterface Dne : (Ljava/lang/String;Z)Z
    //   715: ifne -> 722
    //   718: iconst_1
    //   719: goto -> 723
    //   722: iconst_0
    //   723: istore #18
    //   725: aload #17
    //   727: new java/lang/StringBuilder
    //   730: dup
    //   731: invokespecial <init> : ()V
    //   734: ldc_w '/'
    //   737: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   740: aload #16
    //   742: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   745: invokevirtual toString : ()Ljava/lang/String;
    //   748: iload #18
    //   750: invokeinterface Dne : (Ljava/lang/String;Z)Ljava/io/InputStream;
    //   755: astore #19
    //   757: invokestatic Dne : ()Lnet/minecraft/client/Minecraft;
    //   760: invokevirtual Dne : ()LdLs;
    //   763: new java/lang/StringBuilder
    //   766: dup
    //   767: invokespecial <init> : ()V
    //   770: ldc_w 'Found animation info for: '
    //   773: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   776: aload #16
    //   778: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   781: invokevirtual toString : ()Ljava/lang/String;
    //   784: invokeinterface Dne : (Ljava/lang/String;)V
    //   789: aload #14
    //   791: new java/io/BufferedReader
    //   794: dup
    //   795: new java/io/InputStreamReader
    //   798: dup
    //   799: aload #19
    //   801: invokespecial <init> : (Ljava/io/InputStream;)V
    //   804: invokespecial <init> : (Ljava/io/Reader;)V
    //   807: invokevirtual Dne : (Ljava/io/BufferedReader;)V
    //   810: goto -> 815
    //   813: astore #19
    //   815: goto -> 397
    //   818: aload_0
    //   819: aload_0
    //   820: getfield Dne : Ljava/util/HashMap;
    //   823: ldc 'missingno'
    //   825: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   828: checkcast xPm
    //   831: putfield Dne : LxPm;
    //   834: aload_0
    //   835: getfield Dne : Ljava/util/Map;
    //   838: invokeinterface values : ()Ljava/util/Collection;
    //   843: invokeinterface iterator : ()Ljava/util/Iterator;
    //   848: astore #8
    //   850: aload #8
    //   852: invokeinterface hasNext : ()Z
    //   857: ifeq -> 884
    //   860: aload #8
    //   862: invokeinterface next : ()Ljava/lang/Object;
    //   867: checkcast xPm
    //   870: astore #9
    //   872: aload #9
    //   874: aload_0
    //   875: getfield Dne : LxPm;
    //   878: invokevirtual Dne : (LxPm;)V
    //   881: goto -> 850
    //   884: aload_0
    //   885: getfield Dne : Ldmo;
    //   888: new java/lang/StringBuilder
    //   891: dup
    //   892: invokespecial <init> : ()V
    //   895: ldc_w 'debug.stitched_'
    //   898: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   901: aload_0
    //   902: getfield Dne : Ljava/lang/String;
    //   905: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   908: ldc '.png'
    //   910: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   913: invokevirtual toString : ()Ljava/lang/String;
    //   916: invokevirtual Dne : (Ljava/lang/String;)V
    //   919: aload_0
    //   920: getfield Dne : Ldmo;
    //   923: invokevirtual Dne : ()V
    //   926: return
    // Exception table:
    //   from	to	target	type
    //   363	368	371	kmB
    //   725	810	813	java/io/IOException
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\fCQ.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */