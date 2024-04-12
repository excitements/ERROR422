import java.awt.image.BufferedImage;

public class BXL {
  private fZI Dne;
  
  private int Dne;
  
  private msA Dne;
  
  private int[] Dne = new int[16384];
  
  public void Dne(FiG paramFiG, Snh paramSnh, Ilk paramIlk) {
    // Byte code:
    //   0: iconst_0
    //   1: istore #4
    //   3: iload #4
    //   5: sipush #16384
    //   8: if_icmpge -> 259
    //   11: aload_3
    //   12: getfield Dne : [B
    //   15: iload #4
    //   17: baload
    //   18: istore #5
    //   20: iload #5
    //   22: iconst_4
    //   23: idiv
    //   24: ifne -> 57
    //   27: aload_0
    //   28: getfield Dne : [I
    //   31: iload #4
    //   33: iload #4
    //   35: iload #4
    //   37: sipush #128
    //   40: idiv
    //   41: iadd
    //   42: iconst_1
    //   43: iand
    //   44: bipush #8
    //   46: imul
    //   47: bipush #16
    //   49: iadd
    //   50: bipush #24
    //   52: ishl
    //   53: iastore
    //   54: goto -> 253
    //   57: getstatic UpO.Dne : [LUpO;
    //   60: iload #5
    //   62: iconst_4
    //   63: idiv
    //   64: aaload
    //   65: getfield Dne : I
    //   68: istore #6
    //   70: iload #5
    //   72: iconst_3
    //   73: iand
    //   74: istore #7
    //   76: sipush #220
    //   79: istore #8
    //   81: iload #7
    //   83: iconst_2
    //   84: if_icmpne -> 92
    //   87: sipush #255
    //   90: istore #8
    //   92: iload #7
    //   94: ifne -> 102
    //   97: sipush #180
    //   100: istore #8
    //   102: iload #6
    //   104: bipush #16
    //   106: ishr
    //   107: sipush #255
    //   110: iand
    //   111: iload #8
    //   113: imul
    //   114: sipush #255
    //   117: idiv
    //   118: istore #9
    //   120: iload #6
    //   122: bipush #8
    //   124: ishr
    //   125: sipush #255
    //   128: iand
    //   129: iload #8
    //   131: imul
    //   132: sipush #255
    //   135: idiv
    //   136: istore #10
    //   138: iload #6
    //   140: sipush #255
    //   143: iand
    //   144: iload #8
    //   146: imul
    //   147: sipush #255
    //   150: idiv
    //   151: istore #11
    //   153: aload_0
    //   154: getfield Dne : LfZI;
    //   157: getfield bzF : Z
    //   160: ifeq -> 229
    //   163: iload #9
    //   165: bipush #30
    //   167: imul
    //   168: iload #10
    //   170: bipush #59
    //   172: imul
    //   173: iadd
    //   174: iload #11
    //   176: bipush #11
    //   178: imul
    //   179: iadd
    //   180: bipush #100
    //   182: idiv
    //   183: istore #12
    //   185: iload #9
    //   187: bipush #30
    //   189: imul
    //   190: iload #10
    //   192: bipush #70
    //   194: imul
    //   195: iadd
    //   196: bipush #100
    //   198: idiv
    //   199: istore #13
    //   201: iload #9
    //   203: bipush #30
    //   205: imul
    //   206: iload #11
    //   208: bipush #70
    //   210: imul
    //   211: iadd
    //   212: bipush #100
    //   214: idiv
    //   215: istore #14
    //   217: iload #12
    //   219: istore #9
    //   221: iload #13
    //   223: istore #10
    //   225: iload #14
    //   227: istore #11
    //   229: aload_0
    //   230: getfield Dne : [I
    //   233: iload #4
    //   235: ldc -16777216
    //   237: iload #9
    //   239: bipush #16
    //   241: ishl
    //   242: ior
    //   243: iload #10
    //   245: bipush #8
    //   247: ishl
    //   248: ior
    //   249: iload #11
    //   251: ior
    //   252: iastore
    //   253: iinc #4, 1
    //   256: goto -> 3
    //   259: aload_2
    //   260: aload_0
    //   261: getfield Dne : [I
    //   264: sipush #128
    //   267: sipush #128
    //   270: aload_0
    //   271: getfield Dne : I
    //   274: invokevirtual Dne : ([IIII)V
    //   277: iconst_0
    //   278: istore #4
    //   280: iconst_0
    //   281: istore #5
    //   283: getstatic WAR.Dne : LWAR;
    //   286: astore #6
    //   288: fconst_0
    //   289: fstore #7
    //   291: sipush #3553
    //   294: aload_0
    //   295: getfield Dne : I
    //   298: invokestatic glBindTexture : (II)V
    //   301: sipush #3042
    //   304: invokestatic glEnable : (I)V
    //   307: iconst_1
    //   308: sipush #771
    //   311: invokestatic glBlendFunc : (II)V
    //   314: sipush #3008
    //   317: invokestatic glDisable : (I)V
    //   320: aload #6
    //   322: invokevirtual Dne : ()V
    //   325: aload #6
    //   327: iload #4
    //   329: iconst_0
    //   330: iadd
    //   331: i2f
    //   332: fload #7
    //   334: fadd
    //   335: f2d
    //   336: iload #5
    //   338: sipush #128
    //   341: iadd
    //   342: i2f
    //   343: fload #7
    //   345: fsub
    //   346: f2d
    //   347: ldc2_w -0.009999999776482582
    //   350: dconst_0
    //   351: dconst_1
    //   352: invokevirtual Dne : (DDDDD)V
    //   355: aload #6
    //   357: iload #4
    //   359: sipush #128
    //   362: iadd
    //   363: i2f
    //   364: fload #7
    //   366: fsub
    //   367: f2d
    //   368: iload #5
    //   370: sipush #128
    //   373: iadd
    //   374: i2f
    //   375: fload #7
    //   377: fsub
    //   378: f2d
    //   379: ldc2_w -0.009999999776482582
    //   382: dconst_1
    //   383: dconst_1
    //   384: invokevirtual Dne : (DDDDD)V
    //   387: aload #6
    //   389: iload #4
    //   391: sipush #128
    //   394: iadd
    //   395: i2f
    //   396: fload #7
    //   398: fsub
    //   399: f2d
    //   400: iload #5
    //   402: iconst_0
    //   403: iadd
    //   404: i2f
    //   405: fload #7
    //   407: fadd
    //   408: f2d
    //   409: ldc2_w -0.009999999776482582
    //   412: dconst_1
    //   413: dconst_0
    //   414: invokevirtual Dne : (DDDDD)V
    //   417: aload #6
    //   419: iload #4
    //   421: iconst_0
    //   422: iadd
    //   423: i2f
    //   424: fload #7
    //   426: fadd
    //   427: f2d
    //   428: iload #5
    //   430: iconst_0
    //   431: iadd
    //   432: i2f
    //   433: fload #7
    //   435: fadd
    //   436: f2d
    //   437: ldc2_w -0.009999999776482582
    //   440: dconst_0
    //   441: dconst_0
    //   442: invokevirtual Dne : (DDDDD)V
    //   445: aload #6
    //   447: invokevirtual Dne : ()I
    //   450: pop
    //   451: sipush #3008
    //   454: invokestatic glEnable : (I)V
    //   457: sipush #3042
    //   460: invokestatic glDisable : (I)V
    //   463: aload_2
    //   464: invokevirtual Dne : ()V
    //   467: aload_2
    //   468: ldc '/misc/mapicons.png'
    //   470: invokevirtual Dne : (Ljava/lang/String;)V
    //   473: iconst_0
    //   474: istore #8
    //   476: aload_3
    //   477: getfield Dne : Ljava/util/Map;
    //   480: invokeinterface values : ()Ljava/util/Collection;
    //   485: invokeinterface iterator : ()Ljava/util/Iterator;
    //   490: astore #9
    //   492: aload #9
    //   494: invokeinterface hasNext : ()Z
    //   499: ifeq -> 756
    //   502: aload #9
    //   504: invokeinterface next : ()Ljava/lang/Object;
    //   509: checkcast GHe
    //   512: astore #10
    //   514: invokestatic glPushMatrix : ()V
    //   517: iload #4
    //   519: i2f
    //   520: aload #10
    //   522: getfield FWm : B
    //   525: i2f
    //   526: fconst_2
    //   527: fdiv
    //   528: fadd
    //   529: ldc 64.0
    //   531: fadd
    //   532: iload #5
    //   534: i2f
    //   535: aload #10
    //   537: getfield bzF : B
    //   540: i2f
    //   541: fconst_2
    //   542: fdiv
    //   543: fadd
    //   544: ldc 64.0
    //   546: fadd
    //   547: ldc -0.02
    //   549: invokestatic glTranslatef : (FFF)V
    //   552: aload #10
    //   554: getfield Qnq : B
    //   557: sipush #360
    //   560: imul
    //   561: i2f
    //   562: ldc 16.0
    //   564: fdiv
    //   565: fconst_0
    //   566: fconst_0
    //   567: fconst_1
    //   568: invokestatic glRotatef : (FFFF)V
    //   571: ldc 4.0
    //   573: ldc 4.0
    //   575: ldc 3.0
    //   577: invokestatic glScalef : (FFF)V
    //   580: ldc -0.125
    //   582: ldc 0.125
    //   584: fconst_0
    //   585: invokestatic glTranslatef : (FFF)V
    //   588: aload #10
    //   590: getfield Dne : B
    //   593: iconst_4
    //   594: irem
    //   595: iconst_0
    //   596: iadd
    //   597: i2f
    //   598: ldc 4.0
    //   600: fdiv
    //   601: fstore #11
    //   603: aload #10
    //   605: getfield Dne : B
    //   608: iconst_4
    //   609: idiv
    //   610: iconst_0
    //   611: iadd
    //   612: i2f
    //   613: ldc 4.0
    //   615: fdiv
    //   616: fstore #12
    //   618: aload #10
    //   620: getfield Dne : B
    //   623: iconst_4
    //   624: irem
    //   625: iconst_1
    //   626: iadd
    //   627: i2f
    //   628: ldc 4.0
    //   630: fdiv
    //   631: fstore #13
    //   633: aload #10
    //   635: getfield Dne : B
    //   638: iconst_4
    //   639: idiv
    //   640: iconst_1
    //   641: iadd
    //   642: i2f
    //   643: ldc 4.0
    //   645: fdiv
    //   646: fstore #14
    //   648: aload #6
    //   650: invokevirtual Dne : ()V
    //   653: aload #6
    //   655: ldc2_w -1.0
    //   658: dconst_1
    //   659: iload #8
    //   661: i2f
    //   662: ldc 0.001
    //   664: fmul
    //   665: f2d
    //   666: fload #11
    //   668: f2d
    //   669: fload #12
    //   671: f2d
    //   672: invokevirtual Dne : (DDDDD)V
    //   675: aload #6
    //   677: dconst_1
    //   678: dconst_1
    //   679: iload #8
    //   681: i2f
    //   682: ldc 0.001
    //   684: fmul
    //   685: f2d
    //   686: fload #13
    //   688: f2d
    //   689: fload #12
    //   691: f2d
    //   692: invokevirtual Dne : (DDDDD)V
    //   695: aload #6
    //   697: dconst_1
    //   698: ldc2_w -1.0
    //   701: iload #8
    //   703: i2f
    //   704: ldc 0.001
    //   706: fmul
    //   707: f2d
    //   708: fload #13
    //   710: f2d
    //   711: fload #14
    //   713: f2d
    //   714: invokevirtual Dne : (DDDDD)V
    //   717: aload #6
    //   719: ldc2_w -1.0
    //   722: ldc2_w -1.0
    //   725: iload #8
    //   727: i2f
    //   728: ldc 0.001
    //   730: fmul
    //   731: f2d
    //   732: fload #11
    //   734: f2d
    //   735: fload #14
    //   737: f2d
    //   738: invokevirtual Dne : (DDDDD)V
    //   741: aload #6
    //   743: invokevirtual Dne : ()I
    //   746: pop
    //   747: invokestatic glPopMatrix : ()V
    //   750: iinc #8, 1
    //   753: goto -> 492
    //   756: invokestatic glPushMatrix : ()V
    //   759: fconst_0
    //   760: fconst_0
    //   761: ldc -0.04
    //   763: invokestatic glTranslatef : (FFF)V
    //   766: fconst_1
    //   767: fconst_1
    //   768: fconst_1
    //   769: invokestatic glScalef : (FFF)V
    //   772: invokestatic glPopMatrix : ()V
    //   775: return
  }
  
  public BXL(msA parammsA, fZI paramfZI, Snh paramSnh) {
    this.Dne = (int[])paramfZI;
    this.Dne = (int[])parammsA;
    this.Dne = paramSnh.Dne(new BufferedImage(128, 128, 2));
    for (byte b = 0; b < '䀀'; b++)
      this.Dne[b] = 0; 
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\BXL.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */