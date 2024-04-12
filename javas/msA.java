import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
import java.text.Bidi;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import javax.imageio.ImageIO;
import net.minecraft.client.Minecraft;
import org.lwjgl.opengl.GL11;

public class msA {
  private float Dne;
  
  private boolean zGp;
  
  private boolean Qnq;
  
  private boolean FWm;
  
  private float aFZ;
  
  private int[] FWm;
  
  public int Dne;
  
  private int FWm;
  
  private float Qnq;
  
  private float FWm;
  
  private final String Dne;
  
  private int[] Dne;
  
  public Random Dne;
  
  private boolean Dne;
  
  private final Snh Dne;
  
  private boolean aFZ;
  
  private boolean DyG;
  
  private byte[] Dne = (byte[])new int[256];
  
  private float zGp;
  
  private float bzF;
  
  private boolean bzF;
  
  private static boolean FWm(char paramChar) {
    return ((paramChar >= 'k' && paramChar <= 'o') || (paramChar >= 'K' && paramChar <= 'O') || paramChar == 'r' || paramChar == 'R');
  }
  
  private void Dne(int paramInt) {
    String str = String.format("/font/glyph_%02X.png", new Object[] { Integer.valueOf(paramInt) });
    this.Dne.Dne(str);
  }
  
  private int FWm(String paramString, int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean) {
    if (paramString == null)
      return 0; 
    if ((paramInt3 & 0xFC000000) == 0)
      paramInt3 |= 0xFF000000; 
    if (paramBoolean)
      paramInt3 = (paramInt3 & 0xFCFCFC) >> 2 | paramInt3 & 0xFF000000; 
    this.bzF = (paramInt3 >> 16 & 0xFF) / 255.0F;
    this.Qnq = (paramInt3 >> 8 & 0xFF) / 255.0F;
    this.aFZ = (paramInt3 & 0xFF) / 255.0F;
    this.zGp = (paramInt3 >> 24 & 0xFF) / 255.0F;
    GL11.glColor4f(this.bzF, this.Qnq, this.aFZ, this.zGp);
    this.Dne = paramInt1;
    this.FWm = paramInt2;
    Dne(paramString, paramBoolean);
    return (int)this.Dne;
  }
  
  public int Dne(char paramChar) {
    if (paramChar == '§')
      return -1; 
    if (paramChar == ' ')
      return 4; 
    int i = BAQ.Dne.indexOf(paramChar);
    if (i >= 0 && this.Dne == null)
      return this.Dne[i + 32]; 
    if (this.Dne[paramChar] != 0) {
      int j = this.Dne[paramChar] >>> 4;
      int k = this.Dne[paramChar] & 0xF;
      if (k > 7) {
        k = 15;
        j = 0;
      } 
      return (++k - j) / 2 + 1;
    } 
    return 0;
  }
  
  private String FWm(String paramString) {
    while (paramString != null && paramString.endsWith("\n"))
      paramString = paramString.substring(0, paramString.length() - 1); 
    return paramString;
  }
  
  private int FWm(String paramString, int paramInt) {
    int i = paramString.length();
    int j = 0;
    byte b = 0;
    byte b1 = -1;
    boolean bool = false;
    while (b < i) {
      char c = paramString.charAt(b);
      switch (c) {
        case '\n':
          b--;
          break;
        case '§':
          if (b < i - 1) {
            char c1 = paramString.charAt(++b);
            if (c1 != 'l' && c1 != 'L') {
              if (c1 == 'r' || c1 == 'R' || Dne(c1))
                bool = false; 
              break;
            } 
            bool = true;
          } 
          break;
        case ' ':
          b1 = b;
        default:
          j += Dne(c);
          if (bool)
            j++; 
          break;
      } 
      if (c == '\n') {
        b1 = ++b;
        break;
      } 
      if (j > paramInt)
        break; 
      b++;
    } 
    return (b != i && b1 != -1 && b1 < b) ? b1 : b;
  }
  
  public int FWm(String paramString, int paramInt1, int paramInt2, int paramInt3) {
    return Dne(paramString, paramInt1, paramInt2, paramInt3, false);
  }
  
  private void Dne(String paramString) {
    BufferedImage bufferedImage;
    try {
      bufferedImage = ImageIO.read(Snh.class.getResourceAsStream(paramString));
    } catch (IOException iOException) {
      throw new RuntimeException(iOException);
    } 
    int i = bufferedImage.getWidth();
    int j = bufferedImage.getHeight();
    int[] arrayOfInt = new int[i * j];
    bufferedImage.getRGB(0, 0, i, j, arrayOfInt, 0, i);
    for (byte b = 0; b < 'Ā'; b++) {
      int k = b % 16;
      int m = b / 16;
      byte b1 = 7;
      while (b1 >= 0) {
        int n = k * 8 + b1;
        boolean bool = true;
        for (byte b2 = 0; b2 < 8 && bool; b2++) {
          int i1 = (m * 8 + b2) * i;
          int i2 = arrayOfInt[n + i1] & 0xFF;
          if (i2 > 0)
            bool = false; 
        } 
        if (bool)
          b1--; 
      } 
      if (b == 32)
        b1 = 2; 
      this.Dne[b] = b1 + 2;
    } 
  }
  
  private void bzF() {
    this.bzF = false;
    this.Qnq = false;
    this.aFZ = false;
    this.zGp = false;
    this.DyG = false;
  }
  
  public String Dne(String paramString, int paramInt, boolean paramBoolean) {
    StringBuilder stringBuilder = new StringBuilder();
    int i = 0;
    byte b1 = paramBoolean ? (paramString.length() - 1) : 0;
    byte b2 = paramBoolean ? -1 : 1;
    boolean bool1 = false;
    boolean bool2 = false;
    int j;
    for (j = b1; j && j < paramString.length() && i < paramInt; j += b2) {
      char c = paramString.charAt(j);
      int k = Dne(c);
      if (bool1) {
        bool1 = false;
        if (c != 'l' && c != 'L') {
          if (c == 'r' || c == 'R')
            bool2 = false; 
        } else {
          bool2 = true;
        } 
      } else if (k < 0) {
        bool1 = true;
      } else {
        i += k;
        if (bool2)
          i++; 
      } 
      if (i > paramInt)
        break; 
      if (paramBoolean) {
        stringBuilder.insert(0, c);
      } else {
        stringBuilder.append(c);
      } 
    } 
    return stringBuilder.toString();
  }
  
  String FWm(String paramString, int paramInt) {
    int i = FWm(paramString, paramInt);
    if (paramString.length() <= i)
      return paramString; 
    String str1 = paramString.substring(0, i);
    char c = paramString.charAt(i);
    boolean bool = (c == ' ' || c == '\n') ? true : false;
    String str2 = bzF(str1) + paramString.substring(i + (bool ? 1 : 0));
    return str1 + "\n" + FWm(str2, paramInt);
  }
  
  private String Dne(String paramString) {
    if (paramString != null && Bidi.requiresBidi(paramString.toCharArray(), 0, paramString.length())) {
      Bidi bidi = new Bidi(paramString, -2);
      byte[] arrayOfByte = new byte[bidi.getRunCount()];
      String[] arrayOfString1 = new String[arrayOfByte.length];
      for (byte b2 = 0; b2 < arrayOfByte.length; b2++) {
        int j = bidi.getRunStart(b2);
        int i = bidi.getRunLimit(b2);
        int k = bidi.getRunLevel(b2);
        String str = paramString.substring(j, i);
        arrayOfByte[b2] = (byte)k;
        arrayOfString1[b2] = str;
      } 
      String[] arrayOfString2 = (String[])arrayOfString1.clone();
      Bidi.reorderVisually(arrayOfByte, 0, (Object[])arrayOfString1, 0, arrayOfByte.length);
      StringBuilder stringBuilder = new StringBuilder();
      for (byte b1 = 0; b1 < arrayOfString1.length; b1++) {
        byte b = arrayOfByte[b1];
        int i = 0;
        while (i < arrayOfString2.length) {
          if (!arrayOfString2[i].equals(arrayOfString1[b1])) {
            i++;
            continue;
          } 
          b = arrayOfByte[i];
        } 
        if ((b & 0x1) == 0) {
          stringBuilder.append(arrayOfString1[b1]);
        } else {
          for (i = arrayOfString1[b1].length() - 1; i >= 0; i--) {
            char c = arrayOfString1[b1].charAt(i);
            if (c == '(') {
              c = ')';
            } else if (c == ')') {
              c = '(';
            } 
            stringBuilder.append(c);
          } 
        } 
      } 
      return stringBuilder.toString();
    } 
    return paramString;
  }
  
  private void Dne(String paramString, boolean paramBoolean) {
    // Byte code:
    //   0: iconst_0
    //   1: istore_3
    //   2: iload_3
    //   3: aload_1
    //   4: invokevirtual length : ()I
    //   7: if_icmpge -> 883
    //   10: aload_1
    //   11: iload_3
    //   12: invokevirtual charAt : (I)C
    //   15: istore #4
    //   17: iload #4
    //   19: sipush #167
    //   22: if_icmpne -> 296
    //   25: iload_3
    //   26: iconst_1
    //   27: iadd
    //   28: aload_1
    //   29: invokevirtual length : ()I
    //   32: if_icmpge -> 296
    //   35: ldc '0123456789abcdefklmnor'
    //   37: aload_1
    //   38: invokevirtual toLowerCase : ()Ljava/lang/String;
    //   41: iload_3
    //   42: iconst_1
    //   43: iadd
    //   44: invokevirtual charAt : (I)C
    //   47: invokevirtual indexOf : (I)I
    //   50: istore #5
    //   52: iload #5
    //   54: bipush #16
    //   56: if_icmpge -> 164
    //   59: aload_0
    //   60: iconst_0
    //   61: putfield bzF : Z
    //   64: aload_0
    //   65: iconst_0
    //   66: putfield Qnq : Z
    //   69: aload_0
    //   70: iconst_0
    //   71: putfield DyG : Z
    //   74: aload_0
    //   75: iconst_0
    //   76: putfield zGp : Z
    //   79: aload_0
    //   80: iconst_0
    //   81: putfield aFZ : Z
    //   84: iload #5
    //   86: iflt -> 96
    //   89: iload #5
    //   91: bipush #15
    //   93: if_icmple -> 100
    //   96: bipush #15
    //   98: istore #5
    //   100: iload_2
    //   101: ifeq -> 107
    //   104: iinc #5, 16
    //   107: aload_0
    //   108: getfield FWm : [I
    //   111: iload #5
    //   113: iaload
    //   114: istore #6
    //   116: aload_0
    //   117: iload #6
    //   119: putfield FWm : I
    //   122: iload #6
    //   124: bipush #16
    //   126: ishr
    //   127: i2f
    //   128: ldc 255.0
    //   130: fdiv
    //   131: iload #6
    //   133: bipush #8
    //   135: ishr
    //   136: sipush #255
    //   139: iand
    //   140: i2f
    //   141: ldc 255.0
    //   143: fdiv
    //   144: iload #6
    //   146: sipush #255
    //   149: iand
    //   150: i2f
    //   151: ldc 255.0
    //   153: fdiv
    //   154: aload_0
    //   155: getfield zGp : F
    //   158: invokestatic glColor4f : (FFFF)V
    //   161: goto -> 290
    //   164: iload #5
    //   166: bipush #16
    //   168: if_icmpne -> 179
    //   171: aload_0
    //   172: iconst_1
    //   173: putfield bzF : Z
    //   176: goto -> 290
    //   179: iload #5
    //   181: bipush #17
    //   183: if_icmpne -> 194
    //   186: aload_0
    //   187: iconst_1
    //   188: putfield Qnq : Z
    //   191: goto -> 290
    //   194: iload #5
    //   196: bipush #18
    //   198: if_icmpne -> 209
    //   201: aload_0
    //   202: iconst_1
    //   203: putfield DyG : Z
    //   206: goto -> 290
    //   209: iload #5
    //   211: bipush #19
    //   213: if_icmpne -> 224
    //   216: aload_0
    //   217: iconst_1
    //   218: putfield zGp : Z
    //   221: goto -> 290
    //   224: iload #5
    //   226: bipush #20
    //   228: if_icmpne -> 239
    //   231: aload_0
    //   232: iconst_1
    //   233: putfield aFZ : Z
    //   236: goto -> 290
    //   239: iload #5
    //   241: bipush #21
    //   243: if_icmpne -> 290
    //   246: aload_0
    //   247: iconst_0
    //   248: putfield bzF : Z
    //   251: aload_0
    //   252: iconst_0
    //   253: putfield Qnq : Z
    //   256: aload_0
    //   257: iconst_0
    //   258: putfield DyG : Z
    //   261: aload_0
    //   262: iconst_0
    //   263: putfield zGp : Z
    //   266: aload_0
    //   267: iconst_0
    //   268: putfield aFZ : Z
    //   271: aload_0
    //   272: getfield bzF : F
    //   275: aload_0
    //   276: getfield Qnq : F
    //   279: aload_0
    //   280: getfield aFZ : F
    //   283: aload_0
    //   284: getfield zGp : F
    //   287: invokestatic glColor4f : (FFFF)V
    //   290: iinc #3, 1
    //   293: goto -> 877
    //   296: getstatic BAQ.Dne : Ljava/lang/String;
    //   299: iload #4
    //   301: invokevirtual indexOf : (I)I
    //   304: istore #5
    //   306: aload_0
    //   307: getfield bzF : Z
    //   310: ifeq -> 360
    //   313: iload #5
    //   315: ifle -> 360
    //   318: aload_0
    //   319: getfield Dne : Ljava/util/Random;
    //   322: getstatic BAQ.Dne : Ljava/lang/String;
    //   325: invokevirtual length : ()I
    //   328: invokevirtual nextInt : (I)I
    //   331: istore #6
    //   333: aload_0
    //   334: getfield Dne : [I
    //   337: iload #5
    //   339: bipush #32
    //   341: iadd
    //   342: iaload
    //   343: aload_0
    //   344: getfield Dne : [I
    //   347: iload #6
    //   349: bipush #32
    //   351: iadd
    //   352: iaload
    //   353: if_icmpne -> 318
    //   356: iload #6
    //   358: istore #5
    //   360: aload_0
    //   361: getfield Dne : Z
    //   364: ifeq -> 372
    //   367: ldc 0.5
    //   369: goto -> 373
    //   372: fconst_1
    //   373: fstore #7
    //   375: iload #5
    //   377: ifle -> 387
    //   380: aload_0
    //   381: getfield Dne : Z
    //   384: ifeq -> 395
    //   387: iload_2
    //   388: ifeq -> 395
    //   391: iconst_1
    //   392: goto -> 396
    //   395: iconst_0
    //   396: istore #8
    //   398: iload #8
    //   400: ifeq -> 425
    //   403: aload_0
    //   404: dup
    //   405: getfield Dne : F
    //   408: fload #7
    //   410: fsub
    //   411: putfield Dne : F
    //   414: aload_0
    //   415: dup
    //   416: getfield FWm : F
    //   419: fload #7
    //   421: fsub
    //   422: putfield FWm : F
    //   425: aload_0
    //   426: iload #5
    //   428: iload #4
    //   430: aload_0
    //   431: getfield aFZ : Z
    //   434: invokespecial Dne : (ICZ)F
    //   437: fstore #9
    //   439: iload #8
    //   441: ifeq -> 466
    //   444: aload_0
    //   445: dup
    //   446: getfield Dne : F
    //   449: fload #7
    //   451: fadd
    //   452: putfield Dne : F
    //   455: aload_0
    //   456: dup
    //   457: getfield FWm : F
    //   460: fload #7
    //   462: fadd
    //   463: putfield FWm : F
    //   466: aload_0
    //   467: getfield Qnq : Z
    //   470: ifeq -> 568
    //   473: aload_0
    //   474: dup
    //   475: getfield Dne : F
    //   478: fload #7
    //   480: fadd
    //   481: putfield Dne : F
    //   484: iload #8
    //   486: ifeq -> 511
    //   489: aload_0
    //   490: dup
    //   491: getfield Dne : F
    //   494: fload #7
    //   496: fsub
    //   497: putfield Dne : F
    //   500: aload_0
    //   501: dup
    //   502: getfield FWm : F
    //   505: fload #7
    //   507: fsub
    //   508: putfield FWm : F
    //   511: aload_0
    //   512: iload #5
    //   514: iload #4
    //   516: aload_0
    //   517: getfield aFZ : Z
    //   520: invokespecial Dne : (ICZ)F
    //   523: pop
    //   524: aload_0
    //   525: dup
    //   526: getfield Dne : F
    //   529: fload #7
    //   531: fsub
    //   532: putfield Dne : F
    //   535: iload #8
    //   537: ifeq -> 562
    //   540: aload_0
    //   541: dup
    //   542: getfield Dne : F
    //   545: fload #7
    //   547: fadd
    //   548: putfield Dne : F
    //   551: aload_0
    //   552: dup
    //   553: getfield FWm : F
    //   556: fload #7
    //   558: fadd
    //   559: putfield FWm : F
    //   562: fload #9
    //   564: fconst_1
    //   565: fadd
    //   566: fstore #9
    //   568: aload_0
    //   569: getfield DyG : Z
    //   572: ifeq -> 709
    //   575: getstatic WAR.Dne : LWAR;
    //   578: astore #10
    //   580: sipush #3553
    //   583: invokestatic glDisable : (I)V
    //   586: aload #10
    //   588: invokevirtual Dne : ()V
    //   591: aload #10
    //   593: aload_0
    //   594: getfield Dne : F
    //   597: f2d
    //   598: aload_0
    //   599: getfield FWm : F
    //   602: aload_0
    //   603: getfield Dne : I
    //   606: iconst_2
    //   607: idiv
    //   608: i2f
    //   609: fadd
    //   610: f2d
    //   611: dconst_0
    //   612: invokevirtual Dne : (DDD)V
    //   615: aload #10
    //   617: aload_0
    //   618: getfield Dne : F
    //   621: fload #9
    //   623: fadd
    //   624: f2d
    //   625: aload_0
    //   626: getfield FWm : F
    //   629: aload_0
    //   630: getfield Dne : I
    //   633: iconst_2
    //   634: idiv
    //   635: i2f
    //   636: fadd
    //   637: f2d
    //   638: dconst_0
    //   639: invokevirtual Dne : (DDD)V
    //   642: aload #10
    //   644: aload_0
    //   645: getfield Dne : F
    //   648: fload #9
    //   650: fadd
    //   651: f2d
    //   652: aload_0
    //   653: getfield FWm : F
    //   656: aload_0
    //   657: getfield Dne : I
    //   660: iconst_2
    //   661: idiv
    //   662: i2f
    //   663: fadd
    //   664: fconst_1
    //   665: fsub
    //   666: f2d
    //   667: dconst_0
    //   668: invokevirtual Dne : (DDD)V
    //   671: aload #10
    //   673: aload_0
    //   674: getfield Dne : F
    //   677: f2d
    //   678: aload_0
    //   679: getfield FWm : F
    //   682: aload_0
    //   683: getfield Dne : I
    //   686: iconst_2
    //   687: idiv
    //   688: i2f
    //   689: fadd
    //   690: fconst_1
    //   691: fsub
    //   692: f2d
    //   693: dconst_0
    //   694: invokevirtual Dne : (DDD)V
    //   697: aload #10
    //   699: invokevirtual Dne : ()I
    //   702: pop
    //   703: sipush #3553
    //   706: invokestatic glEnable : (I)V
    //   709: aload_0
    //   710: getfield zGp : Z
    //   713: ifeq -> 864
    //   716: getstatic WAR.Dne : LWAR;
    //   719: astore #10
    //   721: sipush #3553
    //   724: invokestatic glDisable : (I)V
    //   727: aload #10
    //   729: invokevirtual Dne : ()V
    //   732: aload_0
    //   733: getfield zGp : Z
    //   736: ifeq -> 743
    //   739: iconst_m1
    //   740: goto -> 744
    //   743: iconst_0
    //   744: istore #11
    //   746: aload #10
    //   748: aload_0
    //   749: getfield Dne : F
    //   752: iload #11
    //   754: i2f
    //   755: fadd
    //   756: f2d
    //   757: aload_0
    //   758: getfield FWm : F
    //   761: aload_0
    //   762: getfield Dne : I
    //   765: i2f
    //   766: fadd
    //   767: f2d
    //   768: dconst_0
    //   769: invokevirtual Dne : (DDD)V
    //   772: aload #10
    //   774: aload_0
    //   775: getfield Dne : F
    //   778: fload #9
    //   780: fadd
    //   781: f2d
    //   782: aload_0
    //   783: getfield FWm : F
    //   786: aload_0
    //   787: getfield Dne : I
    //   790: i2f
    //   791: fadd
    //   792: f2d
    //   793: dconst_0
    //   794: invokevirtual Dne : (DDD)V
    //   797: aload #10
    //   799: aload_0
    //   800: getfield Dne : F
    //   803: fload #9
    //   805: fadd
    //   806: f2d
    //   807: aload_0
    //   808: getfield FWm : F
    //   811: aload_0
    //   812: getfield Dne : I
    //   815: i2f
    //   816: fadd
    //   817: fconst_1
    //   818: fsub
    //   819: f2d
    //   820: dconst_0
    //   821: invokevirtual Dne : (DDD)V
    //   824: aload #10
    //   826: aload_0
    //   827: getfield Dne : F
    //   830: iload #11
    //   832: i2f
    //   833: fadd
    //   834: f2d
    //   835: aload_0
    //   836: getfield FWm : F
    //   839: aload_0
    //   840: getfield Dne : I
    //   843: i2f
    //   844: fadd
    //   845: fconst_1
    //   846: fsub
    //   847: f2d
    //   848: dconst_0
    //   849: invokevirtual Dne : (DDD)V
    //   852: aload #10
    //   854: invokevirtual Dne : ()I
    //   857: pop
    //   858: sipush #3553
    //   861: invokestatic glEnable : (I)V
    //   864: aload_0
    //   865: dup
    //   866: getfield Dne : F
    //   869: fload #9
    //   871: f2i
    //   872: i2f
    //   873: fadd
    //   874: putfield Dne : F
    //   877: iinc #3, 1
    //   880: goto -> 2
    //   883: return
  }
  
  private float Dne(char paramChar, boolean paramBoolean) {
    if (this.Dne[paramChar] == 0)
      return 0.0F; 
    int i = paramChar / 256;
    Dne(i);
    int j = this.Dne[paramChar] >>> 4;
    int k = this.Dne[paramChar] & 0xF;
    float f1 = j;
    float f2 = (k + 1);
    float f3 = (paramChar % 16 * 16) + f1;
    float f4 = ((paramChar & 0xFF) / 16 * 16);
    float f5 = f2 - f1 - 0.02F;
    float f6 = paramBoolean ? 1.0F : 0.0F;
    GL11.glBegin(5);
    GL11.glTexCoord2f(f3 / 256.0F, f4 / 256.0F);
    GL11.glVertex3f(this.Dne + f6, this.FWm, 0.0F);
    GL11.glTexCoord2f(f3 / 256.0F, (f4 + 15.98F) / 256.0F);
    GL11.glVertex3f(this.Dne - f6, this.FWm + 7.99F, 0.0F);
    GL11.glTexCoord2f((f3 + f5) / 256.0F, f4 / 256.0F);
    GL11.glVertex3f(this.Dne + f5 / 2.0F + f6, this.FWm, 0.0F);
    GL11.glTexCoord2f((f3 + f5) / 256.0F, (f4 + 15.98F) / 256.0F);
    GL11.glVertex3f(this.Dne + f5 / 2.0F - f6, this.FWm + 7.99F, 0.0F);
    GL11.glEnd();
    return (f2 - f1) / 2.0F + 1.0F;
  }
  
  private static String bzF(String paramString) {
    String str = "";
    int i = -1;
    int j = paramString.length();
    while ((i = paramString.indexOf('§', i + 1)) != -1) {
      if (i < j - 1) {
        char c = paramString.charAt(i + 1);
        if (Dne(c)) {
          str = "§" + c;
          continue;
        } 
        if (FWm(c))
          str = str + "§" + c; 
      } 
    } 
    return str;
  }
  
  public boolean Dne() {
    return this.Dne;
  }
  
  public int Dne(String paramString, int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean) {
    int i;
    bzF();
    if (this.FWm != 0.0F)
      paramString = Dne(paramString); 
    if (paramBoolean) {
      i = FWm(paramString, paramInt1 + 1, paramInt2 + 1, paramInt3, true);
      i = Math.max(i, FWm(paramString, paramInt1, paramInt2, paramInt3, false));
    } else {
      i = FWm(paramString, paramInt1, paramInt2, paramInt3, false);
    } 
    return i;
  }
  
  public msA(fZI paramfZI, String paramString, Snh paramSnh, boolean paramBoolean) {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial <init> : ()V
    //   4: aload_0
    //   5: sipush #256
    //   8: newarray int
    //   10: putfield Dne : [I
    //   13: aload_0
    //   14: bipush #9
    //   16: putfield Dne : I
    //   19: aload_0
    //   20: new java/util/Random
    //   23: dup
    //   24: invokespecial <init> : ()V
    //   27: putfield Dne : Ljava/util/Random;
    //   30: aload_0
    //   31: ldc_w 65536
    //   34: newarray byte
    //   36: putfield Dne : [B
    //   39: aload_0
    //   40: bipush #32
    //   42: newarray int
    //   44: putfield FWm : [I
    //   47: aload_0
    //   48: iconst_0
    //   49: putfield bzF : Z
    //   52: aload_0
    //   53: iconst_0
    //   54: putfield Qnq : Z
    //   57: aload_0
    //   58: iconst_0
    //   59: putfield aFZ : Z
    //   62: aload_0
    //   63: iconst_0
    //   64: putfield zGp : Z
    //   67: aload_0
    //   68: iconst_0
    //   69: putfield DyG : Z
    //   72: aload_0
    //   73: aload_2
    //   74: putfield Dne : Ljava/lang/String;
    //   77: aload_0
    //   78: aload_3
    //   79: putfield Dne : LSnh;
    //   82: aload_0
    //   83: iload #4
    //   85: putfield Dne : Z
    //   88: aload_0
    //   89: invokevirtual Dne : ()V
    //   92: aload_3
    //   93: aload_2
    //   94: invokevirtual Dne : (Ljava/lang/String;)V
    //   97: iconst_0
    //   98: istore #5
    //   100: iload #5
    //   102: bipush #32
    //   104: if_icmpge -> 310
    //   107: iload #5
    //   109: iconst_3
    //   110: ishr
    //   111: iconst_1
    //   112: iand
    //   113: bipush #85
    //   115: imul
    //   116: istore #6
    //   118: iload #5
    //   120: iconst_2
    //   121: ishr
    //   122: iconst_1
    //   123: iand
    //   124: sipush #170
    //   127: imul
    //   128: iload #6
    //   130: iadd
    //   131: istore #7
    //   133: iload #5
    //   135: iconst_1
    //   136: ishr
    //   137: iconst_1
    //   138: iand
    //   139: sipush #170
    //   142: imul
    //   143: iload #6
    //   145: iadd
    //   146: istore #8
    //   148: iload #5
    //   150: iconst_0
    //   151: ishr
    //   152: iconst_1
    //   153: iand
    //   154: sipush #170
    //   157: imul
    //   158: iload #6
    //   160: iadd
    //   161: istore #9
    //   163: iload #5
    //   165: bipush #6
    //   167: if_icmpne -> 173
    //   170: iinc #7, 85
    //   173: aload_1
    //   174: getfield bzF : Z
    //   177: ifeq -> 246
    //   180: iload #7
    //   182: bipush #30
    //   184: imul
    //   185: iload #8
    //   187: bipush #59
    //   189: imul
    //   190: iadd
    //   191: iload #9
    //   193: bipush #11
    //   195: imul
    //   196: iadd
    //   197: bipush #100
    //   199: idiv
    //   200: istore #10
    //   202: iload #7
    //   204: bipush #30
    //   206: imul
    //   207: iload #8
    //   209: bipush #70
    //   211: imul
    //   212: iadd
    //   213: bipush #100
    //   215: idiv
    //   216: istore #11
    //   218: iload #7
    //   220: bipush #30
    //   222: imul
    //   223: iload #9
    //   225: bipush #70
    //   227: imul
    //   228: iadd
    //   229: bipush #100
    //   231: idiv
    //   232: istore #12
    //   234: iload #10
    //   236: istore #7
    //   238: iload #11
    //   240: istore #8
    //   242: iload #12
    //   244: istore #9
    //   246: iload #5
    //   248: bipush #16
    //   250: if_icmplt -> 271
    //   253: iload #7
    //   255: iconst_4
    //   256: idiv
    //   257: istore #7
    //   259: iload #8
    //   261: iconst_4
    //   262: idiv
    //   263: istore #8
    //   265: iload #9
    //   267: iconst_4
    //   268: idiv
    //   269: istore #9
    //   271: aload_0
    //   272: getfield FWm : [I
    //   275: iload #5
    //   277: iload #7
    //   279: sipush #255
    //   282: iand
    //   283: bipush #16
    //   285: ishl
    //   286: iload #8
    //   288: sipush #255
    //   291: iand
    //   292: bipush #8
    //   294: ishl
    //   295: ior
    //   296: iload #9
    //   298: sipush #255
    //   301: iand
    //   302: ior
    //   303: iastore
    //   304: iinc #5, 1
    //   307: goto -> 100
    //   310: return
  }
  
  public boolean FWm() {
    return this.FWm;
  }
  
  public String Dne(String paramString, int paramInt) {
    return Dne(paramString, paramInt, false);
  }
  
  public void FWm(boolean paramBoolean) {
    this.FWm = paramBoolean;
  }
  
  public void Dne() {
    FWm();
    Dne((String)this.Dne);
  }
  
  public int Dne(String paramString) {
    if (paramString == null)
      return 0; 
    int i = 0;
    boolean bool = false;
    for (byte b = 0; b < paramString.length(); b++) {
      char c = paramString.charAt(b);
      int j = Dne(c);
      if (j < 0 && b < paramString.length() - 1) {
        c = paramString.charAt(++b);
        if (c != 'l' && c != 'L') {
          if (c == 'r' || c == 'R')
            bool = false; 
        } else {
          bool = true;
        } 
        j = 0;
      } 
      i += j;
      if (bool)
        i++; 
    } 
    return i;
  }
  
  private static boolean Dne(char paramChar) {
    return ((paramChar >= '0' && paramChar <= '9') || (paramChar >= 'a' && paramChar <= 'f') || (paramChar >= 'A' && paramChar <= 'F'));
  }
  
  public int Dne(String paramString, int paramInt) {
    return this.Dne * Dne(paramString, paramInt).size();
  }
  
  private float Dne(int paramInt, boolean paramBoolean) {
    float f1 = (paramInt % 16 * 8);
    float f2 = (paramInt / 16 * 8);
    float f3 = paramBoolean ? 1.0F : 0.0F;
    this.Dne.Dne((String)this.Dne);
    float f4 = this.Dne[paramInt] - 0.01F;
    GL11.glBegin(5);
    GL11.glTexCoord2f(f1 / 128.0F, f2 / 128.0F);
    GL11.glVertex3f(this.Dne + f3, this.FWm, 0.0F);
    GL11.glTexCoord2f(f1 / 128.0F, (f2 + 7.99F) / 128.0F);
    GL11.glVertex3f(this.Dne - f3, this.FWm + 7.99F, 0.0F);
    GL11.glTexCoord2f((f1 + f4) / 128.0F, f2 / 128.0F);
    GL11.glVertex3f(this.Dne + f4 + f3, this.FWm, 0.0F);
    GL11.glTexCoord2f((f1 + f4) / 128.0F, (f2 + 7.99F) / 128.0F);
    GL11.glVertex3f(this.Dne + f4 - f3, this.FWm + 7.99F, 0.0F);
    GL11.glEnd();
    return this.Dne[paramInt];
  }
  
  msA() {
    this.Dne = 9;
    this.Dne = (byte[])new Random();
    this.Dne = new byte[65536];
    this.FWm = new int[32];
    this.bzF = false;
    this.Qnq = false;
    this.aFZ = false;
    this.zGp = false;
    this.DyG = false;
    this.Dne = null;
    this.Dne = null;
  }
  
  public List Dne(String paramString, int paramInt) {
    return Arrays.asList(FWm(paramString, paramInt).split("\n"));
  }
  
  public void Dne(boolean paramBoolean) {
    this.Dne = paramBoolean;
  }
  
  public void Dne(String paramString, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    bzF();
    this.FWm = paramInt4;
    paramString = FWm(paramString);
    Dne(paramString, paramInt1, paramInt2, paramInt3, false);
  }
  
  public int Dne(String paramString, int paramInt1, int paramInt2, int paramInt3) {
    return Dne(paramString, paramInt1, paramInt2, paramInt3, true);
  }
  
  private void Dne(String paramString, int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean) {
    List list = Dne(paramString, paramInt3);
    for (String str : list) {
      Dne(str, paramInt1, paramInt2, paramInt3, this.FWm, paramBoolean);
      paramInt2 += this.Dne;
    } 
  }
  
  private float Dne(int paramInt, char paramChar, boolean paramBoolean) {
    return (paramChar == ' ') ? 4.0F : ((paramInt > 0 && this.Dne == null) ? Dne(paramInt + 32, paramBoolean) : Dne(paramChar, paramBoolean));
  }
  
  private int Dne(String paramString, int paramInt1, int paramInt2, int paramInt3, int paramInt4, boolean paramBoolean) {
    if (this.FWm != 0.0F) {
      paramString = Dne(paramString);
      int i = Dne(paramString);
      paramInt1 = paramInt1 + paramInt3 - i;
    } 
    return FWm(paramString, paramInt1, paramInt2, paramInt4, paramBoolean);
  }
  
  private void FWm() {
    try {
      InputStream inputStream = (Minecraft.Dne()).Dne.Dne().Dne("/font/glyph_sizes.bin");
      inputStream.read(this.Dne);
    } catch (IOException iOException) {
      throw new RuntimeException(iOException);
    } 
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\msA.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */