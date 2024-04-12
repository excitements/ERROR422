import org.lwjgl.opengl.GL11;

public class iDg extends QCe {
  public void Dne(sMa paramsMa, double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat1, float paramFloat2) {
    Dne((JCd)paramsMa, paramDouble1, paramDouble2, paramDouble3, paramFloat1, paramFloat2);
  }
  
  static {
  
  }
  
  public void Dne(JCd paramJCd, double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat1, float paramFloat2) {
    GL11.glPushMatrix();
    GL11.glTranslatef((float)paramDouble1, (float)paramDouble2, (float)paramDouble3);
    GL11.glRotatef(paramFloat1, 0.0F, 1.0F, 0.0F);
    GL11.glEnable(32826);
    Dne("/art/kz.png");
    uCl uCl = paramJCd.Dne;
    float f = 0.0625F;
    GL11.glScalef(f, f, f);
    Dne(paramJCd, uCl.FWm, uCl.bzF, uCl.Qnq, uCl.aFZ);
    GL11.glDisable(32826);
    GL11.glPopMatrix();
  }
  
  private void Dne(JCd paramJCd, float paramFloat1, float paramFloat2) {
    int i = geR.FWm(paramJCd.div);
    int j = geR.FWm(paramJCd.IjH + (paramFloat2 / 16.0F));
    int k = geR.FWm(paramJCd.mrb);
    if (paramJCd.Dne == 2)
      i = geR.FWm(paramJCd.div + (paramFloat1 / 16.0F)); 
    if (paramJCd.Dne == true)
      k = geR.FWm(paramJCd.mrb - (paramFloat1 / 16.0F)); 
    if (paramJCd.Dne == null)
      i = geR.FWm(paramJCd.div - (paramFloat1 / 16.0F)); 
    if (paramJCd.Dne == 3)
      k = geR.FWm(paramJCd.mrb + (paramFloat1 / 16.0F)); 
    int m = this.Dne.Dne.Dne(i, j, k, 0);
    int n = m % 65536;
    int i1 = m / 65536;
    oCF.Dne(oCF.FWm, n, i1);
    GL11.glColor3f(1.0F, 1.0F, 1.0F);
  }
  
  private void Dne(JCd paramJCd, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    // Byte code:
    //   0: iload_2
    //   1: ineg
    //   2: i2f
    //   3: fconst_2
    //   4: fdiv
    //   5: fstore #6
    //   7: iload_3
    //   8: ineg
    //   9: i2f
    //   10: fconst_2
    //   11: fdiv
    //   12: fstore #7
    //   14: ldc 0.5
    //   16: fstore #8
    //   18: ldc 0.75
    //   20: fstore #9
    //   22: ldc 0.8125
    //   24: fstore #10
    //   26: fconst_0
    //   27: fstore #11
    //   29: ldc 0.0625
    //   31: fstore #12
    //   33: ldc 0.75
    //   35: fstore #13
    //   37: ldc 0.8125
    //   39: fstore #14
    //   41: ldc 0.001953125
    //   43: fstore #15
    //   45: ldc 0.001953125
    //   47: fstore #16
    //   49: ldc 0.7519531
    //   51: fstore #17
    //   53: ldc 0.7519531
    //   55: fstore #18
    //   57: fconst_0
    //   58: fstore #19
    //   60: ldc 0.0625
    //   62: fstore #20
    //   64: iconst_0
    //   65: istore #21
    //   67: iload #21
    //   69: iload_2
    //   70: bipush #16
    //   72: idiv
    //   73: if_icmpge -> 794
    //   76: iconst_0
    //   77: istore #22
    //   79: iload #22
    //   81: iload_3
    //   82: bipush #16
    //   84: idiv
    //   85: if_icmpge -> 788
    //   88: fload #6
    //   90: iload #21
    //   92: iconst_1
    //   93: iadd
    //   94: bipush #16
    //   96: imul
    //   97: i2f
    //   98: fadd
    //   99: fstore #23
    //   101: fload #6
    //   103: iload #21
    //   105: bipush #16
    //   107: imul
    //   108: i2f
    //   109: fadd
    //   110: fstore #24
    //   112: fload #7
    //   114: iload #22
    //   116: iconst_1
    //   117: iadd
    //   118: bipush #16
    //   120: imul
    //   121: i2f
    //   122: fadd
    //   123: fstore #25
    //   125: fload #7
    //   127: iload #22
    //   129: bipush #16
    //   131: imul
    //   132: i2f
    //   133: fadd
    //   134: fstore #26
    //   136: aload_0
    //   137: aload_1
    //   138: fload #23
    //   140: fload #24
    //   142: fadd
    //   143: fconst_2
    //   144: fdiv
    //   145: fload #25
    //   147: fload #26
    //   149: fadd
    //   150: fconst_2
    //   151: fdiv
    //   152: invokespecial Dne : (LJCd;FF)V
    //   155: iload #4
    //   157: iload_2
    //   158: iadd
    //   159: iload #21
    //   161: bipush #16
    //   163: imul
    //   164: isub
    //   165: i2f
    //   166: ldc 256.0
    //   168: fdiv
    //   169: fstore #27
    //   171: iload #4
    //   173: iload_2
    //   174: iadd
    //   175: iload #21
    //   177: iconst_1
    //   178: iadd
    //   179: bipush #16
    //   181: imul
    //   182: isub
    //   183: i2f
    //   184: ldc 256.0
    //   186: fdiv
    //   187: fstore #28
    //   189: iload #5
    //   191: iload_3
    //   192: iadd
    //   193: iload #22
    //   195: bipush #16
    //   197: imul
    //   198: isub
    //   199: i2f
    //   200: ldc 256.0
    //   202: fdiv
    //   203: fstore #29
    //   205: iload #5
    //   207: iload_3
    //   208: iadd
    //   209: iload #22
    //   211: iconst_1
    //   212: iadd
    //   213: bipush #16
    //   215: imul
    //   216: isub
    //   217: i2f
    //   218: ldc 256.0
    //   220: fdiv
    //   221: fstore #30
    //   223: getstatic WAR.Dne : LWAR;
    //   226: astore #31
    //   228: aload #31
    //   230: invokevirtual Dne : ()V
    //   233: aload #31
    //   235: fconst_0
    //   236: fconst_0
    //   237: ldc -1.0
    //   239: invokevirtual FWm : (FFF)V
    //   242: aload #31
    //   244: fload #23
    //   246: f2d
    //   247: fload #26
    //   249: f2d
    //   250: fload #8
    //   252: fneg
    //   253: f2d
    //   254: fload #28
    //   256: f2d
    //   257: fload #29
    //   259: f2d
    //   260: invokevirtual Dne : (DDDDD)V
    //   263: aload #31
    //   265: fload #24
    //   267: f2d
    //   268: fload #26
    //   270: f2d
    //   271: fload #8
    //   273: fneg
    //   274: f2d
    //   275: fload #27
    //   277: f2d
    //   278: fload #29
    //   280: f2d
    //   281: invokevirtual Dne : (DDDDD)V
    //   284: aload #31
    //   286: fload #24
    //   288: f2d
    //   289: fload #25
    //   291: f2d
    //   292: fload #8
    //   294: fneg
    //   295: f2d
    //   296: fload #27
    //   298: f2d
    //   299: fload #30
    //   301: f2d
    //   302: invokevirtual Dne : (DDDDD)V
    //   305: aload #31
    //   307: fload #23
    //   309: f2d
    //   310: fload #25
    //   312: f2d
    //   313: fload #8
    //   315: fneg
    //   316: f2d
    //   317: fload #28
    //   319: f2d
    //   320: fload #30
    //   322: f2d
    //   323: invokevirtual Dne : (DDDDD)V
    //   326: aload #31
    //   328: fconst_0
    //   329: fconst_0
    //   330: fconst_1
    //   331: invokevirtual FWm : (FFF)V
    //   334: aload #31
    //   336: fload #23
    //   338: f2d
    //   339: fload #25
    //   341: f2d
    //   342: fload #8
    //   344: f2d
    //   345: fload #9
    //   347: f2d
    //   348: fload #11
    //   350: f2d
    //   351: invokevirtual Dne : (DDDDD)V
    //   354: aload #31
    //   356: fload #24
    //   358: f2d
    //   359: fload #25
    //   361: f2d
    //   362: fload #8
    //   364: f2d
    //   365: fload #10
    //   367: f2d
    //   368: fload #11
    //   370: f2d
    //   371: invokevirtual Dne : (DDDDD)V
    //   374: aload #31
    //   376: fload #24
    //   378: f2d
    //   379: fload #26
    //   381: f2d
    //   382: fload #8
    //   384: f2d
    //   385: fload #10
    //   387: f2d
    //   388: fload #12
    //   390: f2d
    //   391: invokevirtual Dne : (DDDDD)V
    //   394: aload #31
    //   396: fload #23
    //   398: f2d
    //   399: fload #26
    //   401: f2d
    //   402: fload #8
    //   404: f2d
    //   405: fload #9
    //   407: f2d
    //   408: fload #12
    //   410: f2d
    //   411: invokevirtual Dne : (DDDDD)V
    //   414: aload #31
    //   416: fconst_0
    //   417: fconst_1
    //   418: fconst_0
    //   419: invokevirtual FWm : (FFF)V
    //   422: aload #31
    //   424: fload #23
    //   426: f2d
    //   427: fload #25
    //   429: f2d
    //   430: fload #8
    //   432: fneg
    //   433: f2d
    //   434: fload #13
    //   436: f2d
    //   437: fload #15
    //   439: f2d
    //   440: invokevirtual Dne : (DDDDD)V
    //   443: aload #31
    //   445: fload #24
    //   447: f2d
    //   448: fload #25
    //   450: f2d
    //   451: fload #8
    //   453: fneg
    //   454: f2d
    //   455: fload #14
    //   457: f2d
    //   458: fload #15
    //   460: f2d
    //   461: invokevirtual Dne : (DDDDD)V
    //   464: aload #31
    //   466: fload #24
    //   468: f2d
    //   469: fload #25
    //   471: f2d
    //   472: fload #8
    //   474: f2d
    //   475: fload #14
    //   477: f2d
    //   478: fload #16
    //   480: f2d
    //   481: invokevirtual Dne : (DDDDD)V
    //   484: aload #31
    //   486: fload #23
    //   488: f2d
    //   489: fload #25
    //   491: f2d
    //   492: fload #8
    //   494: f2d
    //   495: fload #13
    //   497: f2d
    //   498: fload #16
    //   500: f2d
    //   501: invokevirtual Dne : (DDDDD)V
    //   504: aload #31
    //   506: fconst_0
    //   507: ldc -1.0
    //   509: fconst_0
    //   510: invokevirtual FWm : (FFF)V
    //   513: aload #31
    //   515: fload #23
    //   517: f2d
    //   518: fload #26
    //   520: f2d
    //   521: fload #8
    //   523: f2d
    //   524: fload #13
    //   526: f2d
    //   527: fload #15
    //   529: f2d
    //   530: invokevirtual Dne : (DDDDD)V
    //   533: aload #31
    //   535: fload #24
    //   537: f2d
    //   538: fload #26
    //   540: f2d
    //   541: fload #8
    //   543: f2d
    //   544: fload #14
    //   546: f2d
    //   547: fload #15
    //   549: f2d
    //   550: invokevirtual Dne : (DDDDD)V
    //   553: aload #31
    //   555: fload #24
    //   557: f2d
    //   558: fload #26
    //   560: f2d
    //   561: fload #8
    //   563: fneg
    //   564: f2d
    //   565: fload #14
    //   567: f2d
    //   568: fload #16
    //   570: f2d
    //   571: invokevirtual Dne : (DDDDD)V
    //   574: aload #31
    //   576: fload #23
    //   578: f2d
    //   579: fload #26
    //   581: f2d
    //   582: fload #8
    //   584: fneg
    //   585: f2d
    //   586: fload #13
    //   588: f2d
    //   589: fload #16
    //   591: f2d
    //   592: invokevirtual Dne : (DDDDD)V
    //   595: aload #31
    //   597: ldc -1.0
    //   599: fconst_0
    //   600: fconst_0
    //   601: invokevirtual FWm : (FFF)V
    //   604: aload #31
    //   606: fload #23
    //   608: f2d
    //   609: fload #25
    //   611: f2d
    //   612: fload #8
    //   614: f2d
    //   615: fload #18
    //   617: f2d
    //   618: fload #19
    //   620: f2d
    //   621: invokevirtual Dne : (DDDDD)V
    //   624: aload #31
    //   626: fload #23
    //   628: f2d
    //   629: fload #26
    //   631: f2d
    //   632: fload #8
    //   634: f2d
    //   635: fload #18
    //   637: f2d
    //   638: fload #20
    //   640: f2d
    //   641: invokevirtual Dne : (DDDDD)V
    //   644: aload #31
    //   646: fload #23
    //   648: f2d
    //   649: fload #26
    //   651: f2d
    //   652: fload #8
    //   654: fneg
    //   655: f2d
    //   656: fload #17
    //   658: f2d
    //   659: fload #20
    //   661: f2d
    //   662: invokevirtual Dne : (DDDDD)V
    //   665: aload #31
    //   667: fload #23
    //   669: f2d
    //   670: fload #25
    //   672: f2d
    //   673: fload #8
    //   675: fneg
    //   676: f2d
    //   677: fload #17
    //   679: f2d
    //   680: fload #19
    //   682: f2d
    //   683: invokevirtual Dne : (DDDDD)V
    //   686: aload #31
    //   688: fconst_1
    //   689: fconst_0
    //   690: fconst_0
    //   691: invokevirtual FWm : (FFF)V
    //   694: aload #31
    //   696: fload #24
    //   698: f2d
    //   699: fload #25
    //   701: f2d
    //   702: fload #8
    //   704: fneg
    //   705: f2d
    //   706: fload #18
    //   708: f2d
    //   709: fload #19
    //   711: f2d
    //   712: invokevirtual Dne : (DDDDD)V
    //   715: aload #31
    //   717: fload #24
    //   719: f2d
    //   720: fload #26
    //   722: f2d
    //   723: fload #8
    //   725: fneg
    //   726: f2d
    //   727: fload #18
    //   729: f2d
    //   730: fload #20
    //   732: f2d
    //   733: invokevirtual Dne : (DDDDD)V
    //   736: aload #31
    //   738: fload #24
    //   740: f2d
    //   741: fload #26
    //   743: f2d
    //   744: fload #8
    //   746: f2d
    //   747: fload #17
    //   749: f2d
    //   750: fload #20
    //   752: f2d
    //   753: invokevirtual Dne : (DDDDD)V
    //   756: aload #31
    //   758: fload #24
    //   760: f2d
    //   761: fload #25
    //   763: f2d
    //   764: fload #8
    //   766: f2d
    //   767: fload #17
    //   769: f2d
    //   770: fload #19
    //   772: f2d
    //   773: invokevirtual Dne : (DDDDD)V
    //   776: aload #31
    //   778: invokevirtual Dne : ()I
    //   781: pop
    //   782: iinc #22, 1
    //   785: goto -> 79
    //   788: iinc #21, 1
    //   791: goto -> 67
    //   794: return
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\iDg.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */