public class mHN extends ocu {
  private boolean Dne;
  
  private String Dne;
  
  private final msA Dne;
  
  private final int Dne = "";
  
  private int DyG;
  
  private final int FWm;
  
  private final int Qnq;
  
  private boolean FWm;
  
  private boolean Qnq;
  
  private int div;
  
  private int zGp;
  
  private int IjH;
  
  private boolean aFZ;
  
  private final int bzF;
  
  private boolean bzF;
  
  private int XHL;
  
  private int mrb;
  
  private int aFZ = 32;
  
  public String Dne() {
    return this.Dne;
  }
  
  public int Qnq() {
    return Dne() ? (this.bzF - 8) : this.bzF;
  }
  
  public void DyG(int paramInt) {
    this.XHL = paramInt;
  }
  
  public void FWm(boolean paramBoolean) {
    if (paramBoolean && !this.bzF)
      this.zGp = 0; 
    this.bzF = paramBoolean;
  }
  
  public void Dne(boolean paramBoolean) {
    this.Dne = paramBoolean;
  }
  
  public void aFZ(boolean paramBoolean) {
    this.aFZ = paramBoolean;
  }
  
  public mHN(msA parammsA, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    this.Dne = 1;
    this.FWm = true;
    this.bzF = false;
    this.Qnq = true;
    this.DyG = 0;
    this.div = 0;
    this.IjH = 0;
    this.mrb = 14737632;
    this.XHL = 7368816;
    this.aFZ = 1;
    this.Dne = parammsA;
    this.Dne = paramInt1;
    this.FWm = paramInt2;
    this.bzF = paramInt3;
    this.Qnq = paramInt4;
  }
  
  public int Dne() {
    return this.aFZ;
  }
  
  public int Dne(int paramInt1, int paramInt2, boolean paramBoolean) {
    // Byte code:
    //   0: iload_2
    //   1: istore #4
    //   3: iload_1
    //   4: ifge -> 11
    //   7: iconst_1
    //   8: goto -> 12
    //   11: iconst_0
    //   12: istore #5
    //   14: iload_1
    //   15: invokestatic abs : (I)I
    //   18: istore #6
    //   20: iconst_0
    //   21: istore #7
    //   23: iload #7
    //   25: iload #6
    //   27: if_icmpge -> 165
    //   30: iload #5
    //   32: ifeq -> 93
    //   35: iload_3
    //   36: ifeq -> 66
    //   39: iload #4
    //   41: ifle -> 66
    //   44: aload_0
    //   45: getfield Dne : Ljava/lang/String;
    //   48: iload #4
    //   50: iconst_1
    //   51: isub
    //   52: invokevirtual charAt : (I)C
    //   55: bipush #32
    //   57: if_icmpne -> 66
    //   60: iinc #4, -1
    //   63: goto -> 35
    //   66: iload #4
    //   68: ifle -> 159
    //   71: aload_0
    //   72: getfield Dne : Ljava/lang/String;
    //   75: iload #4
    //   77: iconst_1
    //   78: isub
    //   79: invokevirtual charAt : (I)C
    //   82: bipush #32
    //   84: if_icmpeq -> 159
    //   87: iinc #4, -1
    //   90: goto -> 66
    //   93: aload_0
    //   94: getfield Dne : Ljava/lang/String;
    //   97: invokevirtual length : ()I
    //   100: istore #8
    //   102: aload_0
    //   103: getfield Dne : Ljava/lang/String;
    //   106: bipush #32
    //   108: iload #4
    //   110: invokevirtual indexOf : (II)I
    //   113: istore #4
    //   115: iload #4
    //   117: iconst_m1
    //   118: if_icmpne -> 128
    //   121: iload #8
    //   123: istore #4
    //   125: goto -> 159
    //   128: iload_3
    //   129: ifeq -> 159
    //   132: iload #4
    //   134: iload #8
    //   136: if_icmpge -> 159
    //   139: aload_0
    //   140: getfield Dne : Ljava/lang/String;
    //   143: iload #4
    //   145: invokevirtual charAt : (I)C
    //   148: bipush #32
    //   150: if_icmpne -> 159
    //   153: iinc #4, 1
    //   156: goto -> 128
    //   159: iinc #7, 1
    //   162: goto -> 23
    //   165: iload #4
    //   167: ireturn
  }
  
  public void Qnq() {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual bzF : ()Z
    //   4: ifeq -> 537
    //   7: aload_0
    //   8: invokevirtual Dne : ()Z
    //   11: ifeq -> 84
    //   14: aload_0
    //   15: getfield Dne : I
    //   18: iconst_1
    //   19: isub
    //   20: aload_0
    //   21: getfield FWm : I
    //   24: iconst_1
    //   25: isub
    //   26: aload_0
    //   27: getfield Dne : I
    //   30: aload_0
    //   31: getfield bzF : I
    //   34: iadd
    //   35: iconst_1
    //   36: iadd
    //   37: aload_0
    //   38: getfield FWm : I
    //   41: aload_0
    //   42: getfield Qnq : I
    //   45: iadd
    //   46: iconst_1
    //   47: iadd
    //   48: ldc -6250336
    //   50: invokestatic Dne : (IIIII)V
    //   53: aload_0
    //   54: getfield Dne : I
    //   57: aload_0
    //   58: getfield FWm : I
    //   61: aload_0
    //   62: getfield Dne : I
    //   65: aload_0
    //   66: getfield bzF : I
    //   69: iadd
    //   70: aload_0
    //   71: getfield FWm : I
    //   74: aload_0
    //   75: getfield Qnq : I
    //   78: iadd
    //   79: ldc -16777216
    //   81: invokestatic Dne : (IIIII)V
    //   84: aload_0
    //   85: getfield Qnq : Z
    //   88: ifeq -> 98
    //   91: aload_0
    //   92: getfield mrb : I
    //   95: goto -> 102
    //   98: aload_0
    //   99: getfield XHL : I
    //   102: istore_1
    //   103: aload_0
    //   104: getfield div : I
    //   107: aload_0
    //   108: getfield DyG : I
    //   111: isub
    //   112: istore_2
    //   113: aload_0
    //   114: getfield IjH : I
    //   117: aload_0
    //   118: getfield DyG : I
    //   121: isub
    //   122: istore_3
    //   123: aload_0
    //   124: getfield Dne : LmsA;
    //   127: aload_0
    //   128: getfield Dne : Ljava/lang/String;
    //   131: aload_0
    //   132: getfield DyG : I
    //   135: invokevirtual substring : (I)Ljava/lang/String;
    //   138: aload_0
    //   139: invokevirtual Qnq : ()I
    //   142: invokevirtual Dne : (Ljava/lang/String;I)Ljava/lang/String;
    //   145: astore #4
    //   147: iload_2
    //   148: iflt -> 164
    //   151: iload_2
    //   152: aload #4
    //   154: invokevirtual length : ()I
    //   157: if_icmpgt -> 164
    //   160: iconst_1
    //   161: goto -> 165
    //   164: iconst_0
    //   165: istore #5
    //   167: aload_0
    //   168: getfield bzF : Z
    //   171: ifeq -> 195
    //   174: aload_0
    //   175: getfield zGp : I
    //   178: bipush #6
    //   180: idiv
    //   181: iconst_2
    //   182: irem
    //   183: ifne -> 195
    //   186: iload #5
    //   188: ifeq -> 195
    //   191: iconst_1
    //   192: goto -> 196
    //   195: iconst_0
    //   196: istore #6
    //   198: aload_0
    //   199: getfield Dne : Z
    //   202: ifeq -> 214
    //   205: aload_0
    //   206: getfield Dne : I
    //   209: iconst_4
    //   210: iadd
    //   211: goto -> 218
    //   214: aload_0
    //   215: getfield Dne : I
    //   218: istore #7
    //   220: aload_0
    //   221: getfield Dne : Z
    //   224: ifeq -> 244
    //   227: aload_0
    //   228: getfield FWm : I
    //   231: aload_0
    //   232: getfield Qnq : I
    //   235: bipush #8
    //   237: isub
    //   238: iconst_2
    //   239: idiv
    //   240: iadd
    //   241: goto -> 248
    //   244: aload_0
    //   245: getfield FWm : I
    //   248: istore #8
    //   250: iload #7
    //   252: istore #9
    //   254: iload_3
    //   255: aload #4
    //   257: invokevirtual length : ()I
    //   260: if_icmple -> 269
    //   263: aload #4
    //   265: invokevirtual length : ()I
    //   268: istore_3
    //   269: aload #4
    //   271: invokevirtual length : ()I
    //   274: ifle -> 312
    //   277: iload #5
    //   279: ifeq -> 292
    //   282: aload #4
    //   284: iconst_0
    //   285: iload_2
    //   286: invokevirtual substring : (II)Ljava/lang/String;
    //   289: goto -> 294
    //   292: aload #4
    //   294: astore #10
    //   296: aload_0
    //   297: getfield Dne : LmsA;
    //   300: aload #10
    //   302: iload #7
    //   304: iload #8
    //   306: iload_1
    //   307: invokevirtual Dne : (Ljava/lang/String;III)I
    //   310: istore #9
    //   312: aload_0
    //   313: getfield div : I
    //   316: aload_0
    //   317: getfield Dne : Ljava/lang/String;
    //   320: invokevirtual length : ()I
    //   323: if_icmplt -> 340
    //   326: aload_0
    //   327: getfield Dne : Ljava/lang/String;
    //   330: invokevirtual length : ()I
    //   333: aload_0
    //   334: invokevirtual Dne : ()I
    //   337: if_icmplt -> 344
    //   340: iconst_1
    //   341: goto -> 345
    //   344: iconst_0
    //   345: istore #10
    //   347: iload #9
    //   349: istore #11
    //   351: iload #5
    //   353: ifne -> 377
    //   356: iload_2
    //   357: ifle -> 370
    //   360: iload #7
    //   362: aload_0
    //   363: getfield bzF : I
    //   366: iadd
    //   367: goto -> 372
    //   370: iload #7
    //   372: istore #11
    //   374: goto -> 391
    //   377: iload #10
    //   379: ifeq -> 391
    //   382: iload #9
    //   384: iconst_1
    //   385: isub
    //   386: istore #11
    //   388: iinc #9, -1
    //   391: aload #4
    //   393: invokevirtual length : ()I
    //   396: ifle -> 432
    //   399: iload #5
    //   401: ifeq -> 432
    //   404: iload_2
    //   405: aload #4
    //   407: invokevirtual length : ()I
    //   410: if_icmpge -> 432
    //   413: aload_0
    //   414: getfield Dne : LmsA;
    //   417: aload #4
    //   419: iload_2
    //   420: invokevirtual substring : (I)Ljava/lang/String;
    //   423: iload #9
    //   425: iload #8
    //   427: iload_1
    //   428: invokevirtual Dne : (Ljava/lang/String;III)I
    //   431: pop
    //   432: iload #6
    //   434: ifeq -> 487
    //   437: iload #10
    //   439: ifeq -> 472
    //   442: iload #11
    //   444: iload #8
    //   446: iconst_1
    //   447: isub
    //   448: iload #11
    //   450: iconst_1
    //   451: iadd
    //   452: iload #8
    //   454: iconst_1
    //   455: iadd
    //   456: aload_0
    //   457: getfield Dne : LmsA;
    //   460: getfield Dne : I
    //   463: iadd
    //   464: ldc -3092272
    //   466: invokestatic Dne : (IIIII)V
    //   469: goto -> 487
    //   472: aload_0
    //   473: getfield Dne : LmsA;
    //   476: ldc '_'
    //   478: iload #11
    //   480: iload #8
    //   482: iload_1
    //   483: invokevirtual Dne : (Ljava/lang/String;III)I
    //   486: pop
    //   487: iload_3
    //   488: iload_2
    //   489: if_icmpeq -> 537
    //   492: iload #7
    //   494: aload_0
    //   495: getfield Dne : LmsA;
    //   498: aload #4
    //   500: iconst_0
    //   501: iload_3
    //   502: invokevirtual substring : (II)Ljava/lang/String;
    //   505: invokevirtual Dne : (Ljava/lang/String;)I
    //   508: iadd
    //   509: istore #12
    //   511: aload_0
    //   512: iload #11
    //   514: iload #8
    //   516: iconst_1
    //   517: isub
    //   518: iload #12
    //   520: iconst_1
    //   521: isub
    //   522: iload #8
    //   524: iconst_1
    //   525: iadd
    //   526: aload_0
    //   527: getfield Dne : LmsA;
    //   530: getfield Dne : I
    //   533: iadd
    //   534: invokespecial bzF : (IIII)V
    //   537: return
  }
  
  public void Dne(int paramInt1, int paramInt2, int paramInt3) {
    // Byte code:
    //   0: iload_1
    //   1: aload_0
    //   2: getfield Dne : I
    //   5: if_icmplt -> 46
    //   8: iload_1
    //   9: aload_0
    //   10: getfield Dne : I
    //   13: aload_0
    //   14: getfield bzF : I
    //   17: iadd
    //   18: if_icmpge -> 46
    //   21: iload_2
    //   22: aload_0
    //   23: getfield FWm : I
    //   26: if_icmplt -> 46
    //   29: iload_2
    //   30: aload_0
    //   31: getfield FWm : I
    //   34: aload_0
    //   35: getfield Qnq : I
    //   38: iadd
    //   39: if_icmpge -> 46
    //   42: iconst_1
    //   43: goto -> 47
    //   46: iconst_0
    //   47: istore #4
    //   49: aload_0
    //   50: getfield FWm : Z
    //   53: ifeq -> 77
    //   56: aload_0
    //   57: aload_0
    //   58: getfield Qnq : Z
    //   61: ifeq -> 73
    //   64: iload #4
    //   66: ifeq -> 73
    //   69: iconst_1
    //   70: goto -> 74
    //   73: iconst_0
    //   74: invokevirtual FWm : (Z)V
    //   77: aload_0
    //   78: getfield bzF : Z
    //   81: ifeq -> 153
    //   84: iload_3
    //   85: ifne -> 153
    //   88: iload_1
    //   89: aload_0
    //   90: getfield Dne : I
    //   93: isub
    //   94: istore #5
    //   96: aload_0
    //   97: getfield Dne : Z
    //   100: ifeq -> 106
    //   103: iinc #5, -4
    //   106: aload_0
    //   107: getfield Dne : LmsA;
    //   110: aload_0
    //   111: getfield Dne : Ljava/lang/String;
    //   114: aload_0
    //   115: getfield DyG : I
    //   118: invokevirtual substring : (I)Ljava/lang/String;
    //   121: aload_0
    //   122: invokevirtual Qnq : ()I
    //   125: invokevirtual Dne : (Ljava/lang/String;I)Ljava/lang/String;
    //   128: astore #6
    //   130: aload_0
    //   131: aload_0
    //   132: getfield Dne : LmsA;
    //   135: aload #6
    //   137: iload #5
    //   139: invokevirtual Dne : (Ljava/lang/String;I)Ljava/lang/String;
    //   142: invokevirtual length : ()I
    //   145: aload_0
    //   146: getfield DyG : I
    //   149: iadd
    //   150: invokevirtual Qnq : (I)V
    //   153: return
  }
  
  public boolean FWm() {
    return this.bzF;
  }
  
  public void div(int paramInt) {
    // Byte code:
    //   0: aload_0
    //   1: getfield Dne : Ljava/lang/String;
    //   4: invokevirtual length : ()I
    //   7: istore_2
    //   8: iload_1
    //   9: iload_2
    //   10: if_icmple -> 15
    //   13: iload_2
    //   14: istore_1
    //   15: iload_1
    //   16: ifge -> 21
    //   19: iconst_0
    //   20: istore_1
    //   21: aload_0
    //   22: iload_1
    //   23: putfield IjH : I
    //   26: aload_0
    //   27: getfield Dne : LmsA;
    //   30: ifnull -> 187
    //   33: aload_0
    //   34: getfield DyG : I
    //   37: iload_2
    //   38: if_icmple -> 46
    //   41: aload_0
    //   42: iload_2
    //   43: putfield DyG : I
    //   46: aload_0
    //   47: invokevirtual Qnq : ()I
    //   50: istore_3
    //   51: aload_0
    //   52: getfield Dne : LmsA;
    //   55: aload_0
    //   56: getfield Dne : Ljava/lang/String;
    //   59: aload_0
    //   60: getfield DyG : I
    //   63: invokevirtual substring : (I)Ljava/lang/String;
    //   66: iload_3
    //   67: invokevirtual Dne : (Ljava/lang/String;I)Ljava/lang/String;
    //   70: astore #4
    //   72: aload #4
    //   74: invokevirtual length : ()I
    //   77: aload_0
    //   78: getfield DyG : I
    //   81: iadd
    //   82: istore #5
    //   84: iload_1
    //   85: aload_0
    //   86: getfield DyG : I
    //   89: if_icmpne -> 117
    //   92: aload_0
    //   93: dup
    //   94: getfield DyG : I
    //   97: aload_0
    //   98: getfield Dne : LmsA;
    //   101: aload_0
    //   102: getfield Dne : Ljava/lang/String;
    //   105: iload_3
    //   106: iconst_1
    //   107: invokevirtual Dne : (Ljava/lang/String;IZ)Ljava/lang/String;
    //   110: invokevirtual length : ()I
    //   113: isub
    //   114: putfield DyG : I
    //   117: iload_1
    //   118: iload #5
    //   120: if_icmple -> 139
    //   123: aload_0
    //   124: dup
    //   125: getfield DyG : I
    //   128: iload_1
    //   129: iload #5
    //   131: isub
    //   132: iadd
    //   133: putfield DyG : I
    //   136: goto -> 162
    //   139: iload_1
    //   140: aload_0
    //   141: getfield DyG : I
    //   144: if_icmpgt -> 162
    //   147: aload_0
    //   148: dup
    //   149: getfield DyG : I
    //   152: aload_0
    //   153: getfield DyG : I
    //   156: iload_1
    //   157: isub
    //   158: isub
    //   159: putfield DyG : I
    //   162: aload_0
    //   163: getfield DyG : I
    //   166: ifge -> 174
    //   169: aload_0
    //   170: iconst_0
    //   171: putfield DyG : I
    //   174: aload_0
    //   175: getfield DyG : I
    //   178: iload_2
    //   179: if_icmple -> 187
    //   182: aload_0
    //   183: iload_2
    //   184: putfield DyG : I
    //   187: return
  }
  
  public int FWm() {
    return this.div;
  }
  
  public void FWm(String paramString) {
    // Byte code:
    //   0: ldc ''
    //   2: astore_2
    //   3: aload_1
    //   4: invokestatic Dne : (Ljava/lang/String;)Ljava/lang/String;
    //   7: astore_3
    //   8: aload_0
    //   9: getfield div : I
    //   12: aload_0
    //   13: getfield IjH : I
    //   16: if_icmpge -> 26
    //   19: aload_0
    //   20: getfield div : I
    //   23: goto -> 30
    //   26: aload_0
    //   27: getfield IjH : I
    //   30: istore #4
    //   32: aload_0
    //   33: getfield div : I
    //   36: aload_0
    //   37: getfield IjH : I
    //   40: if_icmpge -> 50
    //   43: aload_0
    //   44: getfield IjH : I
    //   47: goto -> 54
    //   50: aload_0
    //   51: getfield div : I
    //   54: istore #5
    //   56: aload_0
    //   57: getfield aFZ : I
    //   60: aload_0
    //   61: getfield Dne : Ljava/lang/String;
    //   64: invokevirtual length : ()I
    //   67: isub
    //   68: iload #4
    //   70: aload_0
    //   71: getfield IjH : I
    //   74: isub
    //   75: isub
    //   76: istore #6
    //   78: iconst_0
    //   79: istore #7
    //   81: aload_0
    //   82: getfield Dne : Ljava/lang/String;
    //   85: invokevirtual length : ()I
    //   88: ifle -> 119
    //   91: new java/lang/StringBuilder
    //   94: dup
    //   95: invokespecial <init> : ()V
    //   98: aload_2
    //   99: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   102: aload_0
    //   103: getfield Dne : Ljava/lang/String;
    //   106: iconst_0
    //   107: iload #4
    //   109: invokevirtual substring : (II)Ljava/lang/String;
    //   112: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   115: invokevirtual toString : ()Ljava/lang/String;
    //   118: astore_2
    //   119: iload #6
    //   121: aload_3
    //   122: invokevirtual length : ()I
    //   125: if_icmpge -> 160
    //   128: new java/lang/StringBuilder
    //   131: dup
    //   132: invokespecial <init> : ()V
    //   135: aload_2
    //   136: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   139: aload_3
    //   140: iconst_0
    //   141: iload #6
    //   143: invokevirtual substring : (II)Ljava/lang/String;
    //   146: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   149: invokevirtual toString : ()Ljava/lang/String;
    //   152: astore_2
    //   153: iload #6
    //   155: istore #8
    //   157: goto -> 185
    //   160: new java/lang/StringBuilder
    //   163: dup
    //   164: invokespecial <init> : ()V
    //   167: aload_2
    //   168: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   171: aload_3
    //   172: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   175: invokevirtual toString : ()Ljava/lang/String;
    //   178: astore_2
    //   179: aload_3
    //   180: invokevirtual length : ()I
    //   183: istore #8
    //   185: aload_0
    //   186: getfield Dne : Ljava/lang/String;
    //   189: invokevirtual length : ()I
    //   192: ifle -> 234
    //   195: iload #5
    //   197: aload_0
    //   198: getfield Dne : Ljava/lang/String;
    //   201: invokevirtual length : ()I
    //   204: if_icmpge -> 234
    //   207: new java/lang/StringBuilder
    //   210: dup
    //   211: invokespecial <init> : ()V
    //   214: aload_2
    //   215: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   218: aload_0
    //   219: getfield Dne : Ljava/lang/String;
    //   222: iload #5
    //   224: invokevirtual substring : (I)Ljava/lang/String;
    //   227: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   230: invokevirtual toString : ()Ljava/lang/String;
    //   233: astore_2
    //   234: aload_0
    //   235: aload_2
    //   236: putfield Dne : Ljava/lang/String;
    //   239: aload_0
    //   240: iload #4
    //   242: aload_0
    //   243: getfield IjH : I
    //   246: isub
    //   247: iload #8
    //   249: iadd
    //   250: invokevirtual bzF : (I)V
    //   253: return
  }
  
  public void bzF() {
    // Byte code:
    //   0: aload_0
    //   1: aload_0
    //   2: getfield Dne : Ljava/lang/String;
    //   5: invokevirtual length : ()I
    //   8: invokevirtual Qnq : (I)V
    //   11: return
  }
  
  public void Qnq(boolean paramBoolean) {
    this.FWm = paramBoolean;
  }
  
  public void Dne(int paramInt) {
    // Byte code:
    //   0: aload_0
    //   1: getfield Dne : Ljava/lang/String;
    //   4: invokevirtual length : ()I
    //   7: ifeq -> 44
    //   10: aload_0
    //   11: getfield IjH : I
    //   14: aload_0
    //   15: getfield div : I
    //   18: if_icmpeq -> 30
    //   21: aload_0
    //   22: ldc ''
    //   24: invokevirtual FWm : (Ljava/lang/String;)V
    //   27: goto -> 44
    //   30: aload_0
    //   31: aload_0
    //   32: iload_1
    //   33: invokevirtual Dne : (I)I
    //   36: aload_0
    //   37: getfield div : I
    //   40: isub
    //   41: invokevirtual FWm : (I)V
    //   44: return
  }
  
  public int Dne(int paramInt1, int paramInt2) {
    return Dne(paramInt1, FWm(), true);
  }
  
  public int bzF() {
    return this.IjH;
  }
  
  public void aFZ(int paramInt) {
    // Byte code:
    //   0: aload_0
    //   1: iload_1
    //   2: putfield aFZ : I
    //   5: aload_0
    //   6: getfield Dne : Ljava/lang/String;
    //   9: invokevirtual length : ()I
    //   12: iload_1
    //   13: if_icmple -> 29
    //   16: aload_0
    //   17: aload_0
    //   18: getfield Dne : Ljava/lang/String;
    //   21: iconst_0
    //   22: iload_1
    //   23: invokevirtual substring : (II)Ljava/lang/String;
    //   26: putfield Dne : Ljava/lang/String;
    //   29: return
  }
  
  private void bzF(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    // Byte code:
    //   0: iload_1
    //   1: iload_3
    //   2: if_icmpge -> 13
    //   5: iload_1
    //   6: istore #5
    //   8: iload_3
    //   9: istore_1
    //   10: iload #5
    //   12: istore_3
    //   13: iload_2
    //   14: iload #4
    //   16: if_icmpge -> 29
    //   19: iload_2
    //   20: istore #5
    //   22: iload #4
    //   24: istore_2
    //   25: iload #5
    //   27: istore #4
    //   29: getstatic WAR.Dne : LWAR;
    //   32: astore #6
    //   34: fconst_0
    //   35: fconst_0
    //   36: ldc 255.0
    //   38: ldc 255.0
    //   40: invokestatic glColor4f : (FFFF)V
    //   43: sipush #3553
    //   46: invokestatic glDisable : (I)V
    //   49: sipush #3058
    //   52: invokestatic glEnable : (I)V
    //   55: sipush #5387
    //   58: invokestatic glLogicOp : (I)V
    //   61: aload #6
    //   63: invokevirtual Dne : ()V
    //   66: aload #6
    //   68: iload_1
    //   69: i2d
    //   70: iload #4
    //   72: i2d
    //   73: dconst_0
    //   74: invokevirtual Dne : (DDD)V
    //   77: aload #6
    //   79: iload_3
    //   80: i2d
    //   81: iload #4
    //   83: i2d
    //   84: dconst_0
    //   85: invokevirtual Dne : (DDD)V
    //   88: aload #6
    //   90: iload_3
    //   91: i2d
    //   92: iload_2
    //   93: i2d
    //   94: dconst_0
    //   95: invokevirtual Dne : (DDD)V
    //   98: aload #6
    //   100: iload_1
    //   101: i2d
    //   102: iload_2
    //   103: i2d
    //   104: dconst_0
    //   105: invokevirtual Dne : (DDD)V
    //   108: aload #6
    //   110: invokevirtual Dne : ()I
    //   113: pop
    //   114: sipush #3058
    //   117: invokestatic glDisable : (I)V
    //   120: sipush #3553
    //   123: invokestatic glEnable : (I)V
    //   126: return
  }
  
  public boolean bzF() {
    return this.aFZ;
  }
  
  public boolean Dne() {
    return this.Dne;
  }
  
  public void zGp(int paramInt) {
    this.mrb = paramInt;
  }
  
  public void Dne(String paramString) {
    if (paramString.length() > this.aFZ) {
      this.Dne = paramString.substring(0, this.aFZ);
    } else {
      this.Dne = paramString;
    } 
    bzF();
  }
  
  public void bzF(int paramInt) {
    Qnq(this.IjH + paramInt);
  }
  
  public void Dne() {
    this.zGp++;
  }
  
  public void bzF(boolean paramBoolean) {
    this.Qnq = paramBoolean;
  }
  
  public int Dne(int paramInt) {
    return Dne(paramInt, FWm());
  }
  
  public void FWm(int paramInt) {
    // Byte code:
    //   0: aload_0
    //   1: getfield Dne : Ljava/lang/String;
    //   4: invokevirtual length : ()I
    //   7: ifeq -> 152
    //   10: aload_0
    //   11: getfield IjH : I
    //   14: aload_0
    //   15: getfield div : I
    //   18: if_icmpeq -> 30
    //   21: aload_0
    //   22: ldc ''
    //   24: invokevirtual FWm : (Ljava/lang/String;)V
    //   27: goto -> 152
    //   30: iload_1
    //   31: ifge -> 38
    //   34: iconst_1
    //   35: goto -> 39
    //   38: iconst_0
    //   39: istore_2
    //   40: iload_2
    //   41: ifeq -> 53
    //   44: aload_0
    //   45: getfield div : I
    //   48: iload_1
    //   49: iadd
    //   50: goto -> 57
    //   53: aload_0
    //   54: getfield div : I
    //   57: istore_3
    //   58: iload_2
    //   59: ifeq -> 69
    //   62: aload_0
    //   63: getfield div : I
    //   66: goto -> 75
    //   69: aload_0
    //   70: getfield div : I
    //   73: iload_1
    //   74: iadd
    //   75: istore #4
    //   77: ldc ''
    //   79: astore #5
    //   81: iload_3
    //   82: iflt -> 96
    //   85: aload_0
    //   86: getfield Dne : Ljava/lang/String;
    //   89: iconst_0
    //   90: iload_3
    //   91: invokevirtual substring : (II)Ljava/lang/String;
    //   94: astore #5
    //   96: iload #4
    //   98: aload_0
    //   99: getfield Dne : Ljava/lang/String;
    //   102: invokevirtual length : ()I
    //   105: if_icmpge -> 137
    //   108: new java/lang/StringBuilder
    //   111: dup
    //   112: invokespecial <init> : ()V
    //   115: aload #5
    //   117: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   120: aload_0
    //   121: getfield Dne : Ljava/lang/String;
    //   124: iload #4
    //   126: invokevirtual substring : (I)Ljava/lang/String;
    //   129: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   132: invokevirtual toString : ()Ljava/lang/String;
    //   135: astore #5
    //   137: aload_0
    //   138: aload #5
    //   140: putfield Dne : Ljava/lang/String;
    //   143: iload_2
    //   144: ifeq -> 152
    //   147: aload_0
    //   148: iload_1
    //   149: invokevirtual bzF : (I)V
    //   152: return
  }
  
  public void Qnq(int paramInt) {
    // Byte code:
    //   0: aload_0
    //   1: iload_1
    //   2: putfield div : I
    //   5: aload_0
    //   6: getfield Dne : Ljava/lang/String;
    //   9: invokevirtual length : ()I
    //   12: istore_2
    //   13: aload_0
    //   14: getfield div : I
    //   17: ifge -> 25
    //   20: aload_0
    //   21: iconst_0
    //   22: putfield div : I
    //   25: aload_0
    //   26: getfield div : I
    //   29: iload_2
    //   30: if_icmple -> 38
    //   33: aload_0
    //   34: iload_2
    //   35: putfield div : I
    //   38: aload_0
    //   39: aload_0
    //   40: getfield div : I
    //   43: invokevirtual div : (I)V
    //   46: return
  }
  
  public String FWm() {
    // Byte code:
    //   0: aload_0
    //   1: getfield div : I
    //   4: aload_0
    //   5: getfield IjH : I
    //   8: if_icmpge -> 18
    //   11: aload_0
    //   12: getfield div : I
    //   15: goto -> 22
    //   18: aload_0
    //   19: getfield IjH : I
    //   22: istore_1
    //   23: aload_0
    //   24: getfield div : I
    //   27: aload_0
    //   28: getfield IjH : I
    //   31: if_icmpge -> 41
    //   34: aload_0
    //   35: getfield IjH : I
    //   38: goto -> 45
    //   41: aload_0
    //   42: getfield div : I
    //   45: istore_2
    //   46: aload_0
    //   47: getfield Dne : Ljava/lang/String;
    //   50: iload_1
    //   51: iload_2
    //   52: invokevirtual substring : (II)Ljava/lang/String;
    //   55: areturn
  }
  
  public void FWm() {
    Qnq(0);
  }
  
  public boolean Dne(char paramChar, int paramInt) {
    // Byte code:
    //   0: aload_0
    //   1: getfield Qnq : Z
    //   4: ifeq -> 399
    //   7: aload_0
    //   8: getfield bzF : Z
    //   11: ifeq -> 399
    //   14: iload_1
    //   15: lookupswitch default -> 100, 1 -> 56, 3 -> 67, 22 -> 76, 24 -> 85
    //   56: aload_0
    //   57: invokevirtual bzF : ()V
    //   60: aload_0
    //   61: iconst_0
    //   62: invokevirtual div : (I)V
    //   65: iconst_1
    //   66: ireturn
    //   67: aload_0
    //   68: invokevirtual FWm : ()Ljava/lang/String;
    //   71: invokestatic bzF : (Ljava/lang/String;)V
    //   74: iconst_1
    //   75: ireturn
    //   76: aload_0
    //   77: invokestatic FWm : ()Ljava/lang/String;
    //   80: invokevirtual FWm : (Ljava/lang/String;)V
    //   83: iconst_1
    //   84: ireturn
    //   85: aload_0
    //   86: invokevirtual FWm : ()Ljava/lang/String;
    //   89: invokestatic bzF : (Ljava/lang/String;)V
    //   92: aload_0
    //   93: ldc ''
    //   95: invokevirtual FWm : (Ljava/lang/String;)V
    //   98: iconst_1
    //   99: ireturn
    //   100: iload_2
    //   101: lookupswitch default -> 380, 14 -> 160, 199 -> 181, 203 -> 201, 205 -> 267, 207 -> 333, 211 -> 359
    //   160: invokestatic FWm : ()Z
    //   163: ifeq -> 174
    //   166: aload_0
    //   167: iconst_m1
    //   168: invokevirtual Dne : (I)V
    //   171: goto -> 179
    //   174: aload_0
    //   175: iconst_m1
    //   176: invokevirtual FWm : (I)V
    //   179: iconst_1
    //   180: ireturn
    //   181: invokestatic bzF : ()Z
    //   184: ifeq -> 195
    //   187: aload_0
    //   188: iconst_0
    //   189: invokevirtual div : (I)V
    //   192: goto -> 199
    //   195: aload_0
    //   196: invokevirtual FWm : ()V
    //   199: iconst_1
    //   200: ireturn
    //   201: invokestatic bzF : ()Z
    //   204: ifeq -> 242
    //   207: invokestatic FWm : ()Z
    //   210: ifeq -> 229
    //   213: aload_0
    //   214: aload_0
    //   215: iconst_m1
    //   216: aload_0
    //   217: invokevirtual bzF : ()I
    //   220: invokevirtual Dne : (II)I
    //   223: invokevirtual div : (I)V
    //   226: goto -> 265
    //   229: aload_0
    //   230: aload_0
    //   231: invokevirtual bzF : ()I
    //   234: iconst_1
    //   235: isub
    //   236: invokevirtual div : (I)V
    //   239: goto -> 265
    //   242: invokestatic FWm : ()Z
    //   245: ifeq -> 260
    //   248: aload_0
    //   249: aload_0
    //   250: iconst_m1
    //   251: invokevirtual Dne : (I)I
    //   254: invokevirtual Qnq : (I)V
    //   257: goto -> 265
    //   260: aload_0
    //   261: iconst_m1
    //   262: invokevirtual bzF : (I)V
    //   265: iconst_1
    //   266: ireturn
    //   267: invokestatic bzF : ()Z
    //   270: ifeq -> 308
    //   273: invokestatic FWm : ()Z
    //   276: ifeq -> 295
    //   279: aload_0
    //   280: aload_0
    //   281: iconst_1
    //   282: aload_0
    //   283: invokevirtual bzF : ()I
    //   286: invokevirtual Dne : (II)I
    //   289: invokevirtual div : (I)V
    //   292: goto -> 331
    //   295: aload_0
    //   296: aload_0
    //   297: invokevirtual bzF : ()I
    //   300: iconst_1
    //   301: iadd
    //   302: invokevirtual div : (I)V
    //   305: goto -> 331
    //   308: invokestatic FWm : ()Z
    //   311: ifeq -> 326
    //   314: aload_0
    //   315: aload_0
    //   316: iconst_1
    //   317: invokevirtual Dne : (I)I
    //   320: invokevirtual Qnq : (I)V
    //   323: goto -> 331
    //   326: aload_0
    //   327: iconst_1
    //   328: invokevirtual bzF : (I)V
    //   331: iconst_1
    //   332: ireturn
    //   333: invokestatic bzF : ()Z
    //   336: ifeq -> 353
    //   339: aload_0
    //   340: aload_0
    //   341: getfield Dne : Ljava/lang/String;
    //   344: invokevirtual length : ()I
    //   347: invokevirtual div : (I)V
    //   350: goto -> 357
    //   353: aload_0
    //   354: invokevirtual bzF : ()V
    //   357: iconst_1
    //   358: ireturn
    //   359: invokestatic FWm : ()Z
    //   362: ifeq -> 373
    //   365: aload_0
    //   366: iconst_1
    //   367: invokevirtual Dne : (I)V
    //   370: goto -> 378
    //   373: aload_0
    //   374: iconst_1
    //   375: invokevirtual FWm : (I)V
    //   378: iconst_1
    //   379: ireturn
    //   380: iload_1
    //   381: invokestatic Dne : (C)Z
    //   384: ifeq -> 397
    //   387: aload_0
    //   388: iload_1
    //   389: invokestatic toString : (C)Ljava/lang/String;
    //   392: invokevirtual FWm : (Ljava/lang/String;)V
    //   395: iconst_1
    //   396: ireturn
    //   397: iconst_0
    //   398: ireturn
    //   399: iconst_0
    //   400: ireturn
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\mHN.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */