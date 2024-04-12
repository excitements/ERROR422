import java.io.IOException;
import net.minecraft.client.Minecraft;
import org.lwjgl.input.Keyboard;

public class JFs extends qVZ {
  private int aFZ;
  
  private Pee aFZ;
  
  private Pee FWm;
  
  private int zGp;
  
  private Pee Dne;
  
  private Pee DyG;
  
  private Pee bzF;
  
  private String Dne;
  
  private muh Dne;
  
  private Pee Qnq;
  
  private nSp Dne;
  
  private boolean bzF;
  
  private final qVZ Dne;
  
  private Pee zGp = -1;
  
  private int Qnq;
  
  private int Dne;
  
  static int FWm(JFs paramJFs, int paramInt) {
    return paramJFs.zGp = paramInt;
  }
  
  protected void Dne(int paramInt1, int paramInt2, int paramInt3) {
    super.Dne(paramInt1, paramInt2, paramInt3);
  }
  
  private void zGp() {
    mNp mNp = new mNp(this.Dne.Dne);
    try {
      Boolean bool = mNp.Dne(this.Dne.Dne);
      if (bool.booleanValue()) {
        this.bzF = true;
        this.Dne.bzF = "OPEN";
        Dne();
      } 
    } catch (lUu lUu) {
    
    } catch (IOException iOException) {}
  }
  
  static msA Dne(JFs paramJFs) {
    return paramJFs.Dne;
  }
  
  private void mrb() {
    if (this.zGp >= null && this.zGp < this.Dne.Dne.size()) {
      this.Dne = (String)this.Dne.Dne.get(this.zGp);
      irb irb = irb.Dne();
      sHC sHC = new sHC(this, "Warning!", irb.Dne("mco.configure.world.uninvite.question") + " '" + this.Dne + "'", 3);
      this.Dne.Dne(sHC);
    } 
  }
  
  public void FWm() {
    Keyboard.enableRepeatEvents(false);
  }
  
  public JFs(qVZ paramqVZ, muh parammuh) {
    this.Dne = paramqVZ;
    this.Dne = parammuh;
  }
  
  private String Dne() {
    // Byte code:
    //   0: aload_0
    //   1: getfield Dne : Lmuh;
    //   4: getfield Dne : Z
    //   7: ifeq -> 13
    //   10: ldc 'Expired'
    //   12: areturn
    //   13: aload_0
    //   14: getfield Dne : Lmuh;
    //   17: getfield bzF : Ljava/lang/String;
    //   20: invokevirtual toLowerCase : ()Ljava/lang/String;
    //   23: astore_1
    //   24: new java/lang/StringBuilder
    //   27: dup
    //   28: invokespecial <init> : ()V
    //   31: aload_1
    //   32: iconst_0
    //   33: invokevirtual charAt : (I)C
    //   36: invokestatic toUpperCase : (C)C
    //   39: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   42: aload_1
    //   43: iconst_1
    //   44: invokevirtual substring : (I)Ljava/lang/String;
    //   47: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   50: invokevirtual toString : ()Ljava/lang/String;
    //   53: areturn
  }
  
  static int FWm(JFs paramJFs) {
    return paramJFs.Qnq;
  }
  
  private void IjH() {
    mNp mNp = new mNp(this.Dne.Dne);
    try {
      boolean bool = mNp.FWm(this.Dne.Dne).booleanValue();
      if (bool) {
        this.bzF = true;
        this.Dne.bzF = "CLOSED";
        Dne();
      } 
    } catch (lUu lUu) {
    
    } catch (IOException iOException) {}
  }
  
  private void Dne(int paramInt) {
    this.Dne.Dne.remove(paramInt);
  }
  
  public void bzF() {}
  
  static int Dne(JFs paramJFs, int paramInt) {
    return paramJFs.Dne(paramInt);
  }
  
  static muh Dne(JFs paramJFs) {
    return paramJFs.Dne;
  }
  
  protected void Dne(Pee paramPee) {
    if (paramPee.Dne != null)
      if (paramPee.aFZ == 10) {
        if (this.bzF)
          ((wWl)this.Dne).Dne(this.Dne.Dne); 
        this.Dne.Dne(this.Dne);
      } else if (paramPee.aFZ == 5) {
        this.Dne.Dne(new PGU(this, this.Dne, this.Dne));
      } else if (paramPee.aFZ == 1) {
        irb irb = irb.Dne();
        String str1 = irb.Dne("mco.configure.world.close.question.line1");
        String str2 = irb.Dne("mco.configure.world.close.question.line2");
        this.Dne.Dne(new lSK(this, "Warning!", str1, str2, 1));
      } else if (paramPee.aFZ == 0) {
        zGp();
      } else if (paramPee.aFZ == 4) {
        this.Dne.Dne(new VqU(this.Dne, this, this.Dne));
      } else if (paramPee.aFZ == 3) {
        mrb();
      } else if (paramPee.aFZ == 6) {
        this.Dne.Dne(new MaG(this, this.Dne));
      } else if (paramPee.aFZ == 7) {
        this.Dne.Dne(new ZVE(this, this.Dne));
      }  
  }
  
  protected void Dne(char paramChar, int paramInt) {}
  
  static Minecraft Dne(JFs paramJFs) {
    return paramJFs.Dne;
  }
  
  static int bzF(JFs paramJFs) {
    return paramJFs.zGp;
  }
  
  public void Dne(boolean paramBoolean, int paramInt) {
    if (paramInt == 3) {
      if (paramBoolean) {
        mNp mNp = new mNp(this.Dne.Dne);
        try {
          mNp.Dne(this.Dne.Dne, this.Dne);
        } catch (lUu lUu) {
          System.err.println("Could not uninvite the selected user");
        } 
        Dne(this.zGp);
      } 
      this.Dne.Dne(new JFs(this.Dne, this.Dne));
    } 
    if (paramInt == 1) {
      if (paramBoolean)
        IjH(); 
      this.Dne.Dne(this);
    } 
  }
  
  public void Dne(int paramInt1, int paramInt2, float paramFloat) {
    // Byte code:
    //   0: invokestatic Dne : ()Lirb;
    //   3: astore #4
    //   5: aload_0
    //   6: invokevirtual aFZ : ()V
    //   9: aload_0
    //   10: getfield Dne : LnSp;
    //   13: iload_1
    //   14: iload_2
    //   15: fload_3
    //   16: invokevirtual Dne : (IIF)V
    //   19: aload_0
    //   20: aload_0
    //   21: getfield Dne : LmsA;
    //   24: aload #4
    //   26: ldc 'mco.configure.world.title'
    //   28: invokevirtual Dne : (Ljava/lang/String;)Ljava/lang/String;
    //   31: aload_0
    //   32: getfield FWm : I
    //   35: iconst_2
    //   36: idiv
    //   37: bipush #17
    //   39: ldc_w 16777215
    //   42: invokevirtual Dne : (LmsA;Ljava/lang/String;III)V
    //   45: aload_0
    //   46: aload_0
    //   47: getfield Dne : LmsA;
    //   50: aload #4
    //   52: ldc_w 'mco.configure.world.name'
    //   55: invokevirtual Dne : (Ljava/lang/String;)Ljava/lang/String;
    //   58: aload_0
    //   59: getfield Dne : I
    //   62: aload_0
    //   63: iconst_1
    //   64: invokespecial Dne : (I)I
    //   67: ldc_w 10526880
    //   70: invokevirtual FWm : (LmsA;Ljava/lang/String;III)V
    //   73: aload_0
    //   74: aload_0
    //   75: getfield Dne : LmsA;
    //   78: aload_0
    //   79: getfield Dne : Lmuh;
    //   82: invokevirtual FWm : ()Ljava/lang/String;
    //   85: aload_0
    //   86: getfield Dne : I
    //   89: aload_0
    //   90: iconst_2
    //   91: invokespecial Dne : (I)I
    //   94: ldc_w 16777215
    //   97: invokevirtual FWm : (LmsA;Ljava/lang/String;III)V
    //   100: aload_0
    //   101: aload_0
    //   102: getfield Dne : LmsA;
    //   105: aload #4
    //   107: ldc_w 'mco.configure.world.description'
    //   110: invokevirtual Dne : (Ljava/lang/String;)Ljava/lang/String;
    //   113: aload_0
    //   114: getfield Dne : I
    //   117: aload_0
    //   118: iconst_4
    //   119: invokespecial Dne : (I)I
    //   122: ldc_w 10526880
    //   125: invokevirtual FWm : (LmsA;Ljava/lang/String;III)V
    //   128: aload_0
    //   129: aload_0
    //   130: getfield Dne : LmsA;
    //   133: aload_0
    //   134: getfield Dne : Lmuh;
    //   137: invokevirtual Dne : ()Ljava/lang/String;
    //   140: aload_0
    //   141: getfield Dne : I
    //   144: aload_0
    //   145: iconst_5
    //   146: invokespecial Dne : (I)I
    //   149: ldc_w 16777215
    //   152: invokevirtual FWm : (LmsA;Ljava/lang/String;III)V
    //   155: aload_0
    //   156: aload_0
    //   157: getfield Dne : LmsA;
    //   160: aload #4
    //   162: ldc_w 'mco.configure.world.status'
    //   165: invokevirtual Dne : (Ljava/lang/String;)Ljava/lang/String;
    //   168: aload_0
    //   169: getfield Dne : I
    //   172: aload_0
    //   173: bipush #7
    //   175: invokespecial Dne : (I)I
    //   178: ldc_w 10526880
    //   181: invokevirtual FWm : (LmsA;Ljava/lang/String;III)V
    //   184: aload_0
    //   185: aload_0
    //   186: getfield Dne : LmsA;
    //   189: aload_0
    //   190: invokespecial Dne : ()Ljava/lang/String;
    //   193: aload_0
    //   194: getfield Dne : I
    //   197: aload_0
    //   198: bipush #8
    //   200: invokespecial Dne : (I)I
    //   203: ldc_w 16777215
    //   206: invokevirtual FWm : (LmsA;Ljava/lang/String;III)V
    //   209: aload_0
    //   210: aload_0
    //   211: getfield Dne : LmsA;
    //   214: aload #4
    //   216: ldc_w 'mco.configure.world.invited'
    //   219: invokevirtual Dne : (Ljava/lang/String;)Ljava/lang/String;
    //   222: aload_0
    //   223: getfield aFZ : I
    //   226: aload_0
    //   227: iconst_1
    //   228: invokespecial Dne : (I)I
    //   231: ldc_w 10526880
    //   234: invokevirtual FWm : (LmsA;Ljava/lang/String;III)V
    //   237: aload_0
    //   238: iload_1
    //   239: iload_2
    //   240: fload_3
    //   241: invokespecial Dne : (IIF)V
    //   244: return
  }
  
  public void Dne() {
    // Byte code:
    //   0: invokestatic Dne : ()Lirb;
    //   3: astore_1
    //   4: aload_0
    //   5: aload_0
    //   6: getfield FWm : I
    //   9: iconst_2
    //   10: idiv
    //   11: sipush #200
    //   14: isub
    //   15: putfield Dne : I
    //   18: aload_0
    //   19: sipush #180
    //   22: putfield Qnq : I
    //   25: aload_0
    //   26: aload_0
    //   27: getfield FWm : I
    //   30: iconst_2
    //   31: idiv
    //   32: putfield aFZ : I
    //   35: iconst_1
    //   36: invokestatic enableRepeatEvents : (Z)V
    //   39: aload_0
    //   40: getfield Dne : Ljava/util/List;
    //   43: invokeinterface clear : ()V
    //   48: aload_0
    //   49: getfield Dne : Lmuh;
    //   52: getfield bzF : Ljava/lang/String;
    //   55: ldc 'CLOSED'
    //   57: invokevirtual equals : (Ljava/lang/Object;)Z
    //   60: ifeq -> 138
    //   63: aload_0
    //   64: getfield Dne : Ljava/util/List;
    //   67: aload_0
    //   68: new Pee
    //   71: dup
    //   72: iconst_0
    //   73: aload_0
    //   74: getfield Dne : I
    //   77: aload_0
    //   78: bipush #12
    //   80: invokespecial Dne : (I)I
    //   83: aload_0
    //   84: getfield Qnq : I
    //   87: iconst_2
    //   88: idiv
    //   89: iconst_2
    //   90: isub
    //   91: bipush #20
    //   93: aload_1
    //   94: ldc_w 'mco.configure.world.buttons.open'
    //   97: invokevirtual Dne : (Ljava/lang/String;)Ljava/lang/String;
    //   100: invokespecial <init> : (IIIIILjava/lang/String;)V
    //   103: dup_x1
    //   104: putfield Dne : LPee;
    //   107: invokeinterface add : (Ljava/lang/Object;)Z
    //   112: pop
    //   113: aload_0
    //   114: getfield Dne : LPee;
    //   117: aload_0
    //   118: getfield Dne : Lmuh;
    //   121: getfield Dne : Z
    //   124: ifne -> 131
    //   127: iconst_1
    //   128: goto -> 132
    //   131: iconst_0
    //   132: putfield Dne : Z
    //   135: goto -> 210
    //   138: aload_0
    //   139: getfield Dne : Ljava/util/List;
    //   142: aload_0
    //   143: new Pee
    //   146: dup
    //   147: iconst_1
    //   148: aload_0
    //   149: getfield Dne : I
    //   152: aload_0
    //   153: bipush #12
    //   155: invokespecial Dne : (I)I
    //   158: aload_0
    //   159: getfield Qnq : I
    //   162: iconst_2
    //   163: idiv
    //   164: iconst_2
    //   165: isub
    //   166: bipush #20
    //   168: aload_1
    //   169: ldc_w 'mco.configure.world.buttons.close'
    //   172: invokevirtual Dne : (Ljava/lang/String;)Ljava/lang/String;
    //   175: invokespecial <init> : (IIIIILjava/lang/String;)V
    //   178: dup_x1
    //   179: putfield FWm : LPee;
    //   182: invokeinterface add : (Ljava/lang/Object;)Z
    //   187: pop
    //   188: aload_0
    //   189: getfield FWm : LPee;
    //   192: aload_0
    //   193: getfield Dne : Lmuh;
    //   196: getfield Dne : Z
    //   199: ifne -> 206
    //   202: iconst_1
    //   203: goto -> 207
    //   206: iconst_0
    //   207: putfield Dne : Z
    //   210: aload_0
    //   211: getfield Dne : Ljava/util/List;
    //   214: aload_0
    //   215: new Pee
    //   218: dup
    //   219: bipush #7
    //   221: aload_0
    //   222: getfield Dne : I
    //   225: aload_0
    //   226: getfield Qnq : I
    //   229: iconst_2
    //   230: idiv
    //   231: iadd
    //   232: iconst_2
    //   233: iadd
    //   234: aload_0
    //   235: bipush #12
    //   237: invokespecial Dne : (I)I
    //   240: aload_0
    //   241: getfield Qnq : I
    //   244: iconst_2
    //   245: idiv
    //   246: iconst_2
    //   247: isub
    //   248: bipush #20
    //   250: aload_1
    //   251: ldc_w 'mco.configure.world.buttons.subscription'
    //   254: invokevirtual Dne : (Ljava/lang/String;)Ljava/lang/String;
    //   257: invokespecial <init> : (IIIIILjava/lang/String;)V
    //   260: dup_x1
    //   261: putfield DyG : LPee;
    //   264: invokeinterface add : (Ljava/lang/Object;)Z
    //   269: pop
    //   270: aload_0
    //   271: getfield Dne : Ljava/util/List;
    //   274: aload_0
    //   275: new Pee
    //   278: dup
    //   279: iconst_5
    //   280: aload_0
    //   281: getfield Dne : I
    //   284: aload_0
    //   285: bipush #10
    //   287: invokespecial Dne : (I)I
    //   290: aload_0
    //   291: getfield Qnq : I
    //   294: iconst_2
    //   295: idiv
    //   296: iconst_2
    //   297: isub
    //   298: bipush #20
    //   300: aload_1
    //   301: ldc_w 'mco.configure.world.buttons.edit'
    //   304: invokevirtual Dne : (Ljava/lang/String;)Ljava/lang/String;
    //   307: invokespecial <init> : (IIIIILjava/lang/String;)V
    //   310: dup_x1
    //   311: putfield bzF : LPee;
    //   314: invokeinterface add : (Ljava/lang/Object;)Z
    //   319: pop
    //   320: aload_0
    //   321: getfield Dne : Ljava/util/List;
    //   324: aload_0
    //   325: new Pee
    //   328: dup
    //   329: bipush #6
    //   331: aload_0
    //   332: getfield Dne : I
    //   335: aload_0
    //   336: getfield Qnq : I
    //   339: iconst_2
    //   340: idiv
    //   341: iadd
    //   342: iconst_2
    //   343: iadd
    //   344: aload_0
    //   345: bipush #10
    //   347: invokespecial Dne : (I)I
    //   350: aload_0
    //   351: getfield Qnq : I
    //   354: iconst_2
    //   355: idiv
    //   356: iconst_2
    //   357: isub
    //   358: bipush #20
    //   360: aload_1
    //   361: ldc_w 'mco.configure.world.buttons.reset'
    //   364: invokevirtual Dne : (Ljava/lang/String;)Ljava/lang/String;
    //   367: invokespecial <init> : (IIIIILjava/lang/String;)V
    //   370: dup_x1
    //   371: putfield Qnq : LPee;
    //   374: invokeinterface add : (Ljava/lang/Object;)Z
    //   379: pop
    //   380: aload_0
    //   381: getfield Dne : Ljava/util/List;
    //   384: aload_0
    //   385: new Pee
    //   388: dup
    //   389: iconst_4
    //   390: aload_0
    //   391: getfield aFZ : I
    //   394: aload_0
    //   395: bipush #10
    //   397: invokespecial Dne : (I)I
    //   400: aload_0
    //   401: getfield Qnq : I
    //   404: iconst_2
    //   405: idiv
    //   406: iconst_2
    //   407: isub
    //   408: bipush #20
    //   410: aload_1
    //   411: ldc_w 'mco.configure.world.buttons.invite'
    //   414: invokevirtual Dne : (Ljava/lang/String;)Ljava/lang/String;
    //   417: invokespecial <init> : (IIIIILjava/lang/String;)V
    //   420: dup_x1
    //   421: putfield aFZ : LPee;
    //   424: invokeinterface add : (Ljava/lang/Object;)Z
    //   429: pop
    //   430: aload_0
    //   431: getfield Dne : Ljava/util/List;
    //   434: aload_0
    //   435: new Pee
    //   438: dup
    //   439: iconst_3
    //   440: aload_0
    //   441: getfield aFZ : I
    //   444: aload_0
    //   445: getfield Qnq : I
    //   448: iconst_2
    //   449: idiv
    //   450: iadd
    //   451: iconst_2
    //   452: iadd
    //   453: aload_0
    //   454: bipush #10
    //   456: invokespecial Dne : (I)I
    //   459: aload_0
    //   460: getfield Qnq : I
    //   463: iconst_2
    //   464: idiv
    //   465: iconst_2
    //   466: isub
    //   467: bipush #20
    //   469: aload_1
    //   470: ldc_w 'mco.configure.world.buttons.uninvite'
    //   473: invokevirtual Dne : (Ljava/lang/String;)Ljava/lang/String;
    //   476: invokespecial <init> : (IIIIILjava/lang/String;)V
    //   479: dup_x1
    //   480: putfield zGp : LPee;
    //   483: invokeinterface add : (Ljava/lang/Object;)Z
    //   488: pop
    //   489: aload_0
    //   490: getfield Dne : Ljava/util/List;
    //   493: new Pee
    //   496: dup
    //   497: bipush #10
    //   499: aload_0
    //   500: getfield aFZ : I
    //   503: aload_0
    //   504: bipush #12
    //   506: invokespecial Dne : (I)I
    //   509: aload_0
    //   510: getfield Qnq : I
    //   513: bipush #20
    //   515: aload_1
    //   516: ldc_w 'gui.back'
    //   519: invokevirtual Dne : (Ljava/lang/String;)Ljava/lang/String;
    //   522: invokespecial <init> : (IIIIILjava/lang/String;)V
    //   525: invokeinterface add : (Ljava/lang/Object;)Z
    //   530: pop
    //   531: aload_0
    //   532: new nSp
    //   535: dup
    //   536: aload_0
    //   537: invokespecial <init> : (LJFs;)V
    //   540: putfield Dne : LnSp;
    //   543: aload_0
    //   544: getfield bzF : LPee;
    //   547: aload_0
    //   548: getfield Dne : Lmuh;
    //   551: getfield Dne : Z
    //   554: ifne -> 561
    //   557: iconst_1
    //   558: goto -> 562
    //   561: iconst_0
    //   562: putfield Dne : Z
    //   565: aload_0
    //   566: getfield Qnq : LPee;
    //   569: aload_0
    //   570: getfield Dne : Lmuh;
    //   573: getfield Dne : Z
    //   576: ifne -> 583
    //   579: iconst_1
    //   580: goto -> 584
    //   583: iconst_0
    //   584: putfield Dne : Z
    //   587: aload_0
    //   588: getfield aFZ : LPee;
    //   591: aload_0
    //   592: getfield Dne : Lmuh;
    //   595: getfield Dne : Z
    //   598: ifne -> 605
    //   601: iconst_1
    //   602: goto -> 606
    //   605: iconst_0
    //   606: putfield Dne : Z
    //   609: aload_0
    //   610: getfield zGp : LPee;
    //   613: aload_0
    //   614: getfield Dne : Lmuh;
    //   617: getfield Dne : Z
    //   620: ifne -> 627
    //   623: iconst_1
    //   624: goto -> 628
    //   627: iconst_0
    //   628: putfield Dne : Z
    //   631: return
  }
  
  private int Dne(int paramInt) {
    return 40 + paramInt * 13;
  }
  
  static int Dne(JFs paramJFs) {
    return paramJFs.aFZ;
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\JFs.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */