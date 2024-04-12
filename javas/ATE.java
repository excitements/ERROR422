public class ATE implements Zpi {
  private int Dne;
  
  private qMV[][] Dne;
  
  private Qnq Dne;
  
  private boolean Dne;
  
  private int FWm;
  
  public ATE(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7) {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial <init> : ()V
    //   4: aload_0
    //   5: aload_1
    //   6: putfield Dne : LQnq;
    //   9: aload_0
    //   10: iload_2
    //   11: iload #8
    //   13: isub
    //   14: iconst_4
    //   15: ishr
    //   16: putfield Dne : I
    //   19: aload_0
    //   20: iload #4
    //   22: iload #8
    //   24: isub
    //   25: iconst_4
    //   26: ishr
    //   27: putfield FWm : I
    //   30: iload #5
    //   32: iload #8
    //   34: iadd
    //   35: iconst_4
    //   36: ishr
    //   37: istore #9
    //   39: iload #7
    //   41: iload #8
    //   43: iadd
    //   44: iconst_4
    //   45: ishr
    //   46: istore #10
    //   48: aload_0
    //   49: iload #9
    //   51: aload_0
    //   52: getfield Dne : I
    //   55: isub
    //   56: iconst_1
    //   57: iadd
    //   58: iload #10
    //   60: aload_0
    //   61: getfield FWm : I
    //   64: isub
    //   65: iconst_1
    //   66: iadd
    //   67: multianewarray[[LqMV; 2
    //   71: putfield Dne : [[LqMV;
    //   74: aload_0
    //   75: iconst_1
    //   76: putfield Dne : Z
    //   79: aload_0
    //   80: getfield Dne : I
    //   83: istore #11
    //   85: iload #11
    //   87: iload #9
    //   89: if_icmpgt -> 154
    //   92: aload_0
    //   93: getfield FWm : I
    //   96: istore #12
    //   98: iload #12
    //   100: iload #10
    //   102: if_icmpgt -> 148
    //   105: aload_1
    //   106: iload #11
    //   108: iload #12
    //   110: invokevirtual FWm : (II)LqMV;
    //   113: astore #13
    //   115: aload #13
    //   117: ifnull -> 142
    //   120: aload_0
    //   121: getfield Dne : [[LqMV;
    //   124: iload #11
    //   126: aload_0
    //   127: getfield Dne : I
    //   130: isub
    //   131: aaload
    //   132: iload #12
    //   134: aload_0
    //   135: getfield FWm : I
    //   138: isub
    //   139: aload #13
    //   141: aastore
    //   142: iinc #12, 1
    //   145: goto -> 98
    //   148: iinc #11, 1
    //   151: goto -> 85
    //   154: iload_2
    //   155: iconst_4
    //   156: ishr
    //   157: istore #11
    //   159: iload #11
    //   161: iload #5
    //   163: iconst_4
    //   164: ishr
    //   165: if_icmpgt -> 238
    //   168: iload #4
    //   170: iconst_4
    //   171: ishr
    //   172: istore #12
    //   174: iload #12
    //   176: iload #7
    //   178: iconst_4
    //   179: ishr
    //   180: if_icmpgt -> 232
    //   183: aload_0
    //   184: getfield Dne : [[LqMV;
    //   187: iload #11
    //   189: aload_0
    //   190: getfield Dne : I
    //   193: isub
    //   194: aaload
    //   195: iload #12
    //   197: aload_0
    //   198: getfield FWm : I
    //   201: isub
    //   202: aaload
    //   203: astore #13
    //   205: aload #13
    //   207: ifnull -> 226
    //   210: aload #13
    //   212: iload_3
    //   213: iload #6
    //   215: invokevirtual FWm : (II)Z
    //   218: ifne -> 226
    //   221: aload_0
    //   222: iconst_0
    //   223: putfield Dne : Z
    //   226: iinc #12, 1
    //   229: goto -> 174
    //   232: iinc #11, 1
    //   235: goto -> 159
    //   238: return
  }
  
  public float Dne(int paramInt1, int paramInt2, int paramInt3) {
    return ((Jik)this.Dne.Dne).Dne[FWm(paramInt1, paramInt2, paramInt3)];
  }
  
  public boolean DyG(int paramInt1, int paramInt2, int paramInt3) {
    dNT dNT = zKP.Dne[Dne(paramInt1, paramInt2, paramInt3)];
    return (dNT == null) ? false : ((dNT.Dne.bzF() && dNT.Dne()));
  }
  
  public boolean Qnq() {
    return this.Dne;
  }
  
  public OdI Dne(int paramInt1, int paramInt2) {
    // Byte code:
    //   0: aload_0
    //   1: getfield Dne : LQnq;
    //   4: iload_1
    //   5: iload_2
    //   6: invokevirtual Dne : (II)LOdI;
    //   9: areturn
  }
  
  public int Dne(int paramInt1, int paramInt2, int paramInt3) {
    // Byte code:
    //   0: iload_2
    //   1: ifge -> 6
    //   4: iconst_0
    //   5: ireturn
    //   6: iload_2
    //   7: sipush #256
    //   10: if_icmplt -> 15
    //   13: iconst_0
    //   14: ireturn
    //   15: iload_1
    //   16: iconst_4
    //   17: ishr
    //   18: aload_0
    //   19: getfield Dne : I
    //   22: isub
    //   23: istore #4
    //   25: iload_3
    //   26: iconst_4
    //   27: ishr
    //   28: aload_0
    //   29: getfield FWm : I
    //   32: isub
    //   33: istore #5
    //   35: iload #4
    //   37: iflt -> 104
    //   40: iload #4
    //   42: aload_0
    //   43: getfield Dne : [[LqMV;
    //   46: arraylength
    //   47: if_icmpge -> 104
    //   50: iload #5
    //   52: iflt -> 104
    //   55: iload #5
    //   57: aload_0
    //   58: getfield Dne : [[LqMV;
    //   61: iload #4
    //   63: aaload
    //   64: arraylength
    //   65: if_icmpge -> 104
    //   68: aload_0
    //   69: getfield Dne : [[LqMV;
    //   72: iload #4
    //   74: aaload
    //   75: iload #5
    //   77: aaload
    //   78: astore #6
    //   80: aload #6
    //   82: ifnonnull -> 89
    //   85: iconst_0
    //   86: goto -> 103
    //   89: aload #6
    //   91: iload_1
    //   92: bipush #15
    //   94: iand
    //   95: iload_2
    //   96: iload_3
    //   97: bipush #15
    //   99: iand
    //   100: invokevirtual Dne : (III)I
    //   103: ireturn
    //   104: iconst_0
    //   105: ireturn
  }
  
  public int Dne(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    int i = Dne((udO)udO.Dne, paramInt1, paramInt2, paramInt3);
    int j = Dne(udO.FWm, paramInt1, paramInt2, paramInt3);
    if (j < paramInt4)
      j = paramInt4; 
    return i << 20 | j << 4;
  }
  
  public int FWm() {
    return 256;
  }
  
  public ziS Dne() {
    // Byte code:
    //   0: aload_0
    //   1: getfield Dne : LQnq;
    //   4: invokevirtual Dne : ()LziS;
    //   7: areturn
  }
  
  public int FWm(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    int i = Dne(paramInt1, paramInt2, paramInt3);
    return (i == 0) ? 0 : zKP.Dne[i].FWm(this, paramInt1, paramInt2, paramInt3, paramInt4);
  }
  
  public int Dne(int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean) {
    // Byte code:
    //   0: iload_1
    //   1: ldc -30000000
    //   3: if_icmplt -> 286
    //   6: iload_3
    //   7: ldc -30000000
    //   9: if_icmplt -> 286
    //   12: iload_1
    //   13: ldc 30000000
    //   15: if_icmpge -> 286
    //   18: iload_3
    //   19: ldc 30000000
    //   21: if_icmpgt -> 286
    //   24: iload #4
    //   26: ifeq -> 200
    //   29: aload_0
    //   30: iload_1
    //   31: iload_2
    //   32: iload_3
    //   33: invokevirtual Dne : (III)I
    //   36: istore #5
    //   38: iload #5
    //   40: getstatic zKP.FWm : LdNT;
    //   43: getfield FWm : I
    //   46: if_icmpeq -> 93
    //   49: iload #5
    //   51: getstatic zKP.Qnq : LdNT;
    //   54: getfield FWm : I
    //   57: if_icmpeq -> 93
    //   60: iload #5
    //   62: getstatic zKP.rPc : LzKP;
    //   65: getfield FWm : I
    //   68: if_icmpeq -> 93
    //   71: iload #5
    //   73: getstatic zKP.One : LzKP;
    //   76: getfield FWm : I
    //   79: if_icmpeq -> 93
    //   82: iload #5
    //   84: getstatic zKP.BJH : LzKP;
    //   87: getfield FWm : I
    //   90: if_icmpne -> 200
    //   93: aload_0
    //   94: iload_1
    //   95: iload_2
    //   96: iconst_1
    //   97: iadd
    //   98: iload_3
    //   99: iconst_0
    //   100: invokevirtual Dne : (IIIZ)I
    //   103: istore #6
    //   105: aload_0
    //   106: iload_1
    //   107: iconst_1
    //   108: iadd
    //   109: iload_2
    //   110: iload_3
    //   111: iconst_0
    //   112: invokevirtual Dne : (IIIZ)I
    //   115: istore #7
    //   117: aload_0
    //   118: iload_1
    //   119: iconst_1
    //   120: isub
    //   121: iload_2
    //   122: iload_3
    //   123: iconst_0
    //   124: invokevirtual Dne : (IIIZ)I
    //   127: istore #8
    //   129: aload_0
    //   130: iload_1
    //   131: iload_2
    //   132: iload_3
    //   133: iconst_1
    //   134: iadd
    //   135: iconst_0
    //   136: invokevirtual Dne : (IIIZ)I
    //   139: istore #9
    //   141: aload_0
    //   142: iload_1
    //   143: iload_2
    //   144: iload_3
    //   145: iconst_1
    //   146: isub
    //   147: iconst_0
    //   148: invokevirtual Dne : (IIIZ)I
    //   151: istore #10
    //   153: iload #7
    //   155: iload #6
    //   157: if_icmple -> 164
    //   160: iload #7
    //   162: istore #6
    //   164: iload #8
    //   166: iload #6
    //   168: if_icmple -> 175
    //   171: iload #8
    //   173: istore #6
    //   175: iload #9
    //   177: iload #6
    //   179: if_icmple -> 186
    //   182: iload #9
    //   184: istore #6
    //   186: iload #10
    //   188: iload #6
    //   190: if_icmple -> 197
    //   193: iload #10
    //   195: istore #6
    //   197: iload #6
    //   199: ireturn
    //   200: iload_2
    //   201: ifge -> 206
    //   204: iconst_0
    //   205: ireturn
    //   206: iload_2
    //   207: sipush #256
    //   210: if_icmplt -> 236
    //   213: bipush #15
    //   215: aload_0
    //   216: getfield Dne : LQnq;
    //   219: getfield Dne : I
    //   222: isub
    //   223: istore #5
    //   225: iload #5
    //   227: ifge -> 233
    //   230: iconst_0
    //   231: istore #5
    //   233: iload #5
    //   235: ireturn
    //   236: iload_1
    //   237: iconst_4
    //   238: ishr
    //   239: aload_0
    //   240: getfield Dne : I
    //   243: isub
    //   244: istore #5
    //   246: iload_3
    //   247: iconst_4
    //   248: ishr
    //   249: aload_0
    //   250: getfield FWm : I
    //   253: isub
    //   254: istore #6
    //   256: aload_0
    //   257: getfield Dne : [[LqMV;
    //   260: iload #5
    //   262: aaload
    //   263: iload #6
    //   265: aaload
    //   266: iload_1
    //   267: bipush #15
    //   269: iand
    //   270: iload_2
    //   271: iload_3
    //   272: bipush #15
    //   274: iand
    //   275: aload_0
    //   276: getfield Dne : LQnq;
    //   279: getfield Dne : I
    //   282: invokevirtual Dne : (IIII)I
    //   285: ireturn
    //   286: bipush #15
    //   288: ireturn
  }
  
  public float Dne(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    int i = FWm(paramInt1, paramInt2, paramInt3);
    if (i < paramInt4)
      i = paramInt4; 
    return ((Jik)this.Dne.Dne).Dne[i];
  }
  
  public ipD Dne(int paramInt1, int paramInt2, int paramInt3) {
    // Byte code:
    //   0: iload_1
    //   1: iconst_4
    //   2: ishr
    //   3: aload_0
    //   4: getfield Dne : I
    //   7: isub
    //   8: istore #4
    //   10: iload_3
    //   11: iconst_4
    //   12: ishr
    //   13: aload_0
    //   14: getfield FWm : I
    //   17: isub
    //   18: istore #5
    //   20: aload_0
    //   21: getfield Dne : [[LqMV;
    //   24: iload #4
    //   26: aaload
    //   27: iload #5
    //   29: aaload
    //   30: iload_1
    //   31: bipush #15
    //   33: iand
    //   34: iload_2
    //   35: iload_3
    //   36: bipush #15
    //   38: iand
    //   39: invokevirtual Dne : (III)LipD;
    //   42: areturn
  }
  
  public int bzF(int paramInt1, int paramInt2, int paramInt3) {
    // Byte code:
    //   0: iload_2
    //   1: ifge -> 6
    //   4: iconst_0
    //   5: ireturn
    //   6: iload_2
    //   7: sipush #256
    //   10: if_icmplt -> 15
    //   13: iconst_0
    //   14: ireturn
    //   15: iload_1
    //   16: iconst_4
    //   17: ishr
    //   18: aload_0
    //   19: getfield Dne : I
    //   22: isub
    //   23: istore #4
    //   25: iload_3
    //   26: iconst_4
    //   27: ishr
    //   28: aload_0
    //   29: getfield FWm : I
    //   32: isub
    //   33: istore #5
    //   35: aload_0
    //   36: getfield Dne : [[LqMV;
    //   39: iload #4
    //   41: aaload
    //   42: iload #5
    //   44: aaload
    //   45: iload_1
    //   46: bipush #15
    //   48: iand
    //   49: iload_2
    //   50: iload_3
    //   51: bipush #15
    //   53: iand
    //   54: invokevirtual bzF : (III)I
    //   57: ireturn
  }
  
  public int FWm(udO paramudO, int paramInt1, int paramInt2, int paramInt3) {
    // Byte code:
    //   0: iload_3
    //   1: ifge -> 6
    //   4: iconst_0
    //   5: istore_3
    //   6: iload_3
    //   7: sipush #256
    //   10: if_icmplt -> 17
    //   13: sipush #255
    //   16: istore_3
    //   17: iload_3
    //   18: iflt -> 100
    //   21: iload_3
    //   22: sipush #256
    //   25: if_icmpge -> 100
    //   28: iload_2
    //   29: ldc -30000000
    //   31: if_icmplt -> 100
    //   34: iload #4
    //   36: ldc -30000000
    //   38: if_icmplt -> 100
    //   41: iload_2
    //   42: ldc 30000000
    //   44: if_icmpge -> 100
    //   47: iload #4
    //   49: ldc 30000000
    //   51: if_icmpgt -> 100
    //   54: iload_2
    //   55: iconst_4
    //   56: ishr
    //   57: aload_0
    //   58: getfield Dne : I
    //   61: isub
    //   62: istore #5
    //   64: iload #4
    //   66: iconst_4
    //   67: ishr
    //   68: aload_0
    //   69: getfield FWm : I
    //   72: isub
    //   73: istore #6
    //   75: aload_0
    //   76: getfield Dne : [[LqMV;
    //   79: iload #5
    //   81: aaload
    //   82: iload #6
    //   84: aaload
    //   85: aload_1
    //   86: iload_2
    //   87: bipush #15
    //   89: iand
    //   90: iload_3
    //   91: iload #4
    //   93: bipush #15
    //   95: iand
    //   96: invokevirtual Dne : (LudO;III)I
    //   99: ireturn
    //   100: aload_1
    //   101: getfield Dne : I
    //   104: ireturn
  }
  
  public int FWm(int paramInt1, int paramInt2, int paramInt3) {
    return Dne(paramInt1, paramInt2, paramInt3, true);
  }
  
  public boolean IjH(int paramInt1, int paramInt2, int paramInt3) {
    // Byte code:
    //   0: getstatic zKP.Dne : [LzKP;
    //   3: aload_0
    //   4: iload_1
    //   5: iload_2
    //   6: iload_3
    //   7: invokevirtual Dne : (III)I
    //   10: aaload
    //   11: astore #4
    //   13: aload_0
    //   14: getfield Dne : LQnq;
    //   17: aload #4
    //   19: aload_0
    //   20: iload_1
    //   21: iload_2
    //   22: iload_3
    //   23: invokevirtual bzF : (III)I
    //   26: invokevirtual Dne : (LzKP;I)Z
    //   29: ireturn
  }
  
  public KFd Dne(int paramInt1, int paramInt2, int paramInt3) {
    int i = Dne(paramInt1, paramInt2, paramInt3);
    return (i == 0) ? KFd.Dne : (KFd)(zKP.Dne[i]).Dne;
  }
  
  public boolean Dne(int paramInt1, int paramInt2, int paramInt3) {
    dNT dNT = zKP.Dne[Dne(paramInt1, paramInt2, paramInt3)];
    return (dNT == null);
  }
  
  public int Dne(udO paramudO, int paramInt1, int paramInt2, int paramInt3) {
    // Byte code:
    //   0: iload_3
    //   1: ifge -> 6
    //   4: iconst_0
    //   5: istore_3
    //   6: iload_3
    //   7: sipush #256
    //   10: if_icmplt -> 17
    //   13: sipush #255
    //   16: istore_3
    //   17: iload_3
    //   18: iflt -> 249
    //   21: iload_3
    //   22: sipush #256
    //   25: if_icmpge -> 249
    //   28: iload_2
    //   29: ldc -30000000
    //   31: if_icmplt -> 249
    //   34: iload #4
    //   36: ldc -30000000
    //   38: if_icmplt -> 249
    //   41: iload_2
    //   42: ldc 30000000
    //   44: if_icmpge -> 249
    //   47: iload #4
    //   49: ldc 30000000
    //   51: if_icmpgt -> 249
    //   54: aload_1
    //   55: getstatic udO.Dne : LudO;
    //   58: if_acmpne -> 76
    //   61: aload_0
    //   62: getfield Dne : LQnq;
    //   65: getfield Dne : LJik;
    //   68: getfield FWm : Z
    //   71: ifeq -> 76
    //   74: iconst_0
    //   75: ireturn
    //   76: getstatic zKP.Qnq : [Z
    //   79: aload_0
    //   80: iload_2
    //   81: iload_3
    //   82: iload #4
    //   84: invokevirtual Dne : (III)I
    //   87: baload
    //   88: ifeq -> 203
    //   91: aload_0
    //   92: aload_1
    //   93: iload_2
    //   94: iload_3
    //   95: iconst_1
    //   96: iadd
    //   97: iload #4
    //   99: invokevirtual FWm : (LudO;III)I
    //   102: istore #5
    //   104: aload_0
    //   105: aload_1
    //   106: iload_2
    //   107: iconst_1
    //   108: iadd
    //   109: iload_3
    //   110: iload #4
    //   112: invokevirtual FWm : (LudO;III)I
    //   115: istore #6
    //   117: aload_0
    //   118: aload_1
    //   119: iload_2
    //   120: iconst_1
    //   121: isub
    //   122: iload_3
    //   123: iload #4
    //   125: invokevirtual FWm : (LudO;III)I
    //   128: istore #7
    //   130: aload_0
    //   131: aload_1
    //   132: iload_2
    //   133: iload_3
    //   134: iload #4
    //   136: iconst_1
    //   137: iadd
    //   138: invokevirtual FWm : (LudO;III)I
    //   141: istore #8
    //   143: aload_0
    //   144: aload_1
    //   145: iload_2
    //   146: iload_3
    //   147: iload #4
    //   149: iconst_1
    //   150: isub
    //   151: invokevirtual FWm : (LudO;III)I
    //   154: istore #9
    //   156: iload #6
    //   158: iload #5
    //   160: if_icmple -> 167
    //   163: iload #6
    //   165: istore #5
    //   167: iload #7
    //   169: iload #5
    //   171: if_icmple -> 178
    //   174: iload #7
    //   176: istore #5
    //   178: iload #8
    //   180: iload #5
    //   182: if_icmple -> 189
    //   185: iload #8
    //   187: istore #5
    //   189: iload #9
    //   191: iload #5
    //   193: if_icmple -> 200
    //   196: iload #9
    //   198: istore #5
    //   200: iload #5
    //   202: ireturn
    //   203: iload_2
    //   204: iconst_4
    //   205: ishr
    //   206: aload_0
    //   207: getfield Dne : I
    //   210: isub
    //   211: istore #5
    //   213: iload #4
    //   215: iconst_4
    //   216: ishr
    //   217: aload_0
    //   218: getfield FWm : I
    //   221: isub
    //   222: istore #6
    //   224: aload_0
    //   225: getfield Dne : [[LqMV;
    //   228: iload #5
    //   230: aaload
    //   231: iload #6
    //   233: aaload
    //   234: aload_1
    //   235: iload_2
    //   236: bipush #15
    //   238: iand
    //   239: iload_3
    //   240: iload #4
    //   242: bipush #15
    //   244: iand
    //   245: invokevirtual Dne : (LudO;III)I
    //   248: ireturn
    //   249: aload_1
    //   250: getfield Dne : I
    //   253: ireturn
  }
  
  public boolean zGp(int paramInt1, int paramInt2, int paramInt3) {
    dNT dNT = zKP.Dne[Dne(paramInt1, paramInt2, paramInt3)];
    return (dNT == null) ? false : dNT.FWm();
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\ATE.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */