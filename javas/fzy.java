import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import net.minecraft.client.Minecraft;

public class fzy extends pPV {
  private Map Dne;
  
  public LLx Dne;
  
  public int Dne;
  
  Random Dne;
  
  private Minecraft Dne;
  
  private RXf Dne;
  
  private VzZ Dne;
  
  private boolean FWm = false;
  
  public String Dne;
  
  public List Dne;
  
  private qVZ Dne;
  
  private boolean Dne = false;
  
  private static String Dne(String paramString) {
    return URLEncoder.encode(paramString, "UTF-8");
  }
  
  private String Dne(String paramString1, String paramString2, String paramString3) {
    try {
      URL uRL = new URL("http://session.minecraft.net/game/joinserver.jsp?user=" + Dne(paramString1) + "&sessionId=" + Dne(paramString2) + "&serverId=" + Dne(paramString3));
      BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(uRL.openStream()));
      String str = bufferedReader.readLine();
      bufferedReader.close();
      return str;
    } catch (IOException iOException) {
      return iOException.toString();
    } 
  }
  
  public void Dne(NVL paramNVL) {
    sMa sMa = Dne(paramNVL.Dne);
    if (sMa != null) {
      sMa.Zpi = paramNVL.FWm;
      sMa.kGO = paramNVL.bzF;
      sMa.udO = paramNVL.Qnq;
      double d1 = sMa.Zpi / 32.0D;
      double d2 = sMa.kGO / 32.0D + 0.015625D;
      double d3 = sMa.udO / 32.0D;
      float f1 = (paramNVL.Dne * 360) / 256.0F;
      float f2 = (paramNVL.FWm * 360) / 256.0F;
      sMa.Dne(d1, d2, d3, f1, f2, 3);
    } 
  }
  
  public fzy(Minecraft paramMinecraft, zHD paramzHD) {
    this.Dne = new LLx((iDE)null);
    this.Dne = new HashMap<>();
    this.Dne = new ArrayList();
    this.Dne = true;
    this.Dne = null;
    this.Dne = new Random();
    this.Dne = paramMinecraft;
    this.Dne = new bqd(paramMinecraft.Dne(), this);
    paramzHD.Dne().Dne((bqd)this.Dne, paramMinecraft.Dne.Dne);
  }
  
  public void Dne(SPR paramSPR) {
    // Byte code:
    //   0: aload_0
    //   1: getfield Dne : LVzZ;
    //   4: invokevirtual Dne : ()LSFA;
    //   7: astore_2
    //   8: aload_1
    //   9: getfield Dne : I
    //   12: ifne -> 27
    //   15: aload_2
    //   16: aload_1
    //   17: getfield Dne : Ljava/lang/String;
    //   20: invokevirtual FWm : (Ljava/lang/String;)LYGE;
    //   23: astore_3
    //   24: goto -> 36
    //   27: aload_2
    //   28: aload_1
    //   29: getfield Dne : Ljava/lang/String;
    //   32: invokevirtual Dne : (Ljava/lang/String;)LYGE;
    //   35: astore_3
    //   36: aload_1
    //   37: getfield Dne : I
    //   40: ifeq -> 51
    //   43: aload_1
    //   44: getfield Dne : I
    //   47: iconst_2
    //   48: if_icmpne -> 83
    //   51: aload_3
    //   52: aload_1
    //   53: getfield FWm : Ljava/lang/String;
    //   56: invokevirtual Dne : (Ljava/lang/String;)V
    //   59: aload_3
    //   60: aload_1
    //   61: getfield bzF : Ljava/lang/String;
    //   64: invokevirtual FWm : (Ljava/lang/String;)V
    //   67: aload_3
    //   68: aload_1
    //   69: getfield Qnq : Ljava/lang/String;
    //   72: invokevirtual bzF : (Ljava/lang/String;)V
    //   75: aload_3
    //   76: aload_1
    //   77: getfield FWm : I
    //   80: invokevirtual Dne : (I)V
    //   83: aload_1
    //   84: getfield Dne : I
    //   87: ifeq -> 98
    //   90: aload_1
    //   91: getfield Dne : I
    //   94: iconst_3
    //   95: if_icmpne -> 141
    //   98: aload_1
    //   99: getfield Dne : Ljava/util/Collection;
    //   102: invokeinterface iterator : ()Ljava/util/Iterator;
    //   107: astore #4
    //   109: aload #4
    //   111: invokeinterface hasNext : ()Z
    //   116: ifeq -> 141
    //   119: aload #4
    //   121: invokeinterface next : ()Ljava/lang/Object;
    //   126: checkcast java/lang/String
    //   129: astore #5
    //   131: aload_2
    //   132: aload #5
    //   134: aload_3
    //   135: invokevirtual Dne : (Ljava/lang/String;LYGE;)V
    //   138: goto -> 109
    //   141: aload_1
    //   142: getfield Dne : I
    //   145: iconst_4
    //   146: if_icmpne -> 192
    //   149: aload_1
    //   150: getfield Dne : Ljava/util/Collection;
    //   153: invokeinterface iterator : ()Ljava/util/Iterator;
    //   158: astore #4
    //   160: aload #4
    //   162: invokeinterface hasNext : ()Z
    //   167: ifeq -> 192
    //   170: aload #4
    //   172: invokeinterface next : ()Ljava/lang/Object;
    //   177: checkcast java/lang/String
    //   180: astore #5
    //   182: aload_2
    //   183: aload #5
    //   185: aload_3
    //   186: invokevirtual FWm : (Ljava/lang/String;LYGE;)V
    //   189: goto -> 160
    //   192: aload_1
    //   193: getfield Dne : I
    //   196: iconst_1
    //   197: if_icmpne -> 205
    //   200: aload_2
    //   201: aload_3
    //   202: invokevirtual Dne : (LYGE;)V
    //   205: return
  }
  
  public void Dne(FaB paramFaB) {
    if ("MC|TPack".equals(paramFaB.Dne)) {
      String[] arrayOfString = (new String(paramFaB.Dne)).split("\000");
      String str = arrayOfString[0];
      if (arrayOfString[1].equals("16"))
        if (this.Dne.Dne.bzF()) {
          this.Dne.Dne.Dne(str);
        } else if (this.Dne.Dne.FWm()) {
          this.Dne.Dne(new sHC(new rtF(this, str), irb.Dne().Dne("multiplayer.texturePrompt.line1"), irb.Dne().Dne("multiplayer.texturePrompt.line2"), 0));
        }  
    } else if ("MC|TrList".equals(paramFaB.Dne)) {
      DataInputStream dataInputStream = new DataInputStream(new ByteArrayInputStream(paramFaB.Dne));
      try {
        int i = dataInputStream.readInt();
        vwN vwN = this.Dne.Dne;
        if (vwN != null && vwN instanceof VFk && i == ((MJs)this.Dne.Dne).FWm.Dne) {
          YzO yzO = ((VFk)vwN).Dne();
          ybO ybO = ybO.Dne(dataInputStream);
          yzO.Dne(ybO);
        } 
      } catch (IOException iOException) {
        iOException.printStackTrace();
      } 
    } 
  }
  
  public void Dne(UVb paramUVb) {
    sMa sMa = Dne(paramUVb.Dne);
    if (sMa != null)
      if (paramUVb.FWm == 1) {
        FUH fUH = (FUH)sMa;
        fUH.bzF();
      } else if (paramUVb.FWm == 2) {
        sMa.gnI();
      } else if (paramUVb.FWm == 3) {
        FiG fiG = (FiG)sMa;
        fiG.Dne(false, false, false);
      } else if (paramUVb.FWm != 4) {
        if (paramUVb.FWm == 6) {
          this.Dne.Dne.Dne(new zUL((Qnq)this.Dne.Dne, sMa));
        } else if (paramUVb.FWm == 7) {
          zUL zUL = new zUL((Qnq)this.Dne.Dne, sMa, "magicCrit");
          this.Dne.Dne.Dne(zUL);
        } else if (paramUVb.FWm != 5 || sMa instanceof hIH) {
        
        } 
      }  
  }
  
  public void Dne(qHm paramqHm) {
    sMa sMa = Dne(paramqHm.Dne);
    if (sMa != null)
      sMa.a_(paramqHm.FWm, paramqHm.Dne()); 
  }
  
  public void Dne(RZL paramRZL) {
    // Byte code:
    //   0: aload_0
    //   1: getfield Dne : Lnet/minecraft/client/Minecraft;
    //   4: getfield Dne : LMJs;
    //   7: astore_2
    //   8: aload_1
    //   9: getfield Dne : I
    //   12: iconst_m1
    //   13: if_icmpne -> 30
    //   16: aload_2
    //   17: getfield Dne : LMOS;
    //   20: aload_1
    //   21: getfield Dne : LNMq;
    //   24: invokevirtual Dne : (LNMq;)V
    //   27: goto -> 211
    //   30: iconst_0
    //   31: istore_3
    //   32: aload_0
    //   33: getfield Dne : Lnet/minecraft/client/Minecraft;
    //   36: getfield Dne : LqVZ;
    //   39: instanceof VXB
    //   42: ifeq -> 77
    //   45: aload_0
    //   46: getfield Dne : Lnet/minecraft/client/Minecraft;
    //   49: getfield Dne : LqVZ;
    //   52: checkcast VXB
    //   55: astore #4
    //   57: aload #4
    //   59: invokevirtual Dne : ()I
    //   62: getstatic JcN.Zpi : LJcN;
    //   65: invokevirtual Dne : ()I
    //   68: if_icmpeq -> 75
    //   71: iconst_1
    //   72: goto -> 76
    //   75: iconst_0
    //   76: istore_3
    //   77: aload_1
    //   78: getfield Dne : I
    //   81: ifne -> 171
    //   84: aload_1
    //   85: getfield FWm : I
    //   88: bipush #36
    //   90: if_icmplt -> 171
    //   93: aload_1
    //   94: getfield FWm : I
    //   97: bipush #45
    //   99: if_icmpge -> 171
    //   102: aload_2
    //   103: getfield Dne : LPdb;
    //   106: aload_1
    //   107: getfield FWm : I
    //   110: invokevirtual Dne : (I)LonZ;
    //   113: invokevirtual Dne : ()LNMq;
    //   116: astore #4
    //   118: aload_1
    //   119: getfield Dne : LNMq;
    //   122: ifnull -> 153
    //   125: aload #4
    //   127: ifnull -> 145
    //   130: aload #4
    //   132: getfield Dne : I
    //   135: aload_1
    //   136: getfield Dne : LNMq;
    //   139: getfield Dne : I
    //   142: if_icmpge -> 153
    //   145: aload_1
    //   146: getfield Dne : LNMq;
    //   149: iconst_5
    //   150: putfield FWm : I
    //   153: aload_2
    //   154: getfield Dne : LPdb;
    //   157: aload_1
    //   158: getfield FWm : I
    //   161: aload_1
    //   162: getfield Dne : LNMq;
    //   165: invokevirtual Dne : (ILNMq;)V
    //   168: goto -> 211
    //   171: aload_1
    //   172: getfield Dne : I
    //   175: aload_2
    //   176: getfield FWm : LPdb;
    //   179: getfield Dne : I
    //   182: if_icmpne -> 211
    //   185: aload_1
    //   186: getfield Dne : I
    //   189: ifne -> 196
    //   192: iload_3
    //   193: ifne -> 211
    //   196: aload_2
    //   197: getfield FWm : LPdb;
    //   200: aload_1
    //   201: getfield FWm : I
    //   204: aload_1
    //   205: getfield Dne : LNMq;
    //   208: invokevirtual Dne : (ILNMq;)V
    //   211: return
  }
  
  public void Dne(eFM parameFM) {
    boolean bool = false;
    if (this.Dne.Dne.bzF(parameFM.Dne, parameFM.FWm, parameFM.bzF)) {
      ipD ipD = this.Dne.Dne.Dne(parameFM.Dne, parameFM.FWm, parameFM.bzF);
      if (ipD instanceof AjG) {
        AjG ajG = (AjG)ipD;
        if (ajG.Dne()) {
          for (byte b = 0; b < 4; b++)
            ajG.Dne[b] = parameFM.Dne[b]; 
          ajG.a_();
        } 
        bool = true;
      } 
    } 
    if (!bool && this.Dne.Dne != null)
      this.Dne.Dne.Dne("Unable to locate sign at " + parameFM.Dne + ", " + parameFM.FWm + ", " + parameFM.bzF); 
  }
  
  public fzy(Minecraft paramMinecraft, String paramString, int paramInt) {
    this.Dne = new LLx((iDE)null);
    this.Dne = new HashMap<>();
    this.Dne = new ArrayList();
    this.Dne = true;
    this.Dne = null;
    this.Dne = new Random();
    this.Dne = paramMinecraft;
    Socket socket = new Socket(InetAddress.getByName(paramString), paramInt);
    this.Dne = new Qyp(paramMinecraft.Dne(), socket, "Client", this);
  }
  
  public RXf Dne() {
    return this.Dne;
  }
  
  public void Dne(Rle paramRle) {
    // Byte code:
    //   0: aload_1
    //   1: getfield FWm : I
    //   4: i2d
    //   5: ldc2_w 32.0
    //   8: ddiv
    //   9: dstore_2
    //   10: aload_1
    //   11: getfield bzF : I
    //   14: i2d
    //   15: ldc2_w 32.0
    //   18: ddiv
    //   19: dstore #4
    //   21: aload_1
    //   22: getfield Qnq : I
    //   25: i2d
    //   26: ldc2_w 32.0
    //   29: ddiv
    //   30: dstore #6
    //   32: aconst_null
    //   33: astore #8
    //   35: aload_1
    //   36: getfield aFZ : I
    //   39: iconst_1
    //   40: if_icmpne -> 61
    //   43: new xIh
    //   46: dup
    //   47: aload_0
    //   48: getfield Dne : LVzZ;
    //   51: dload_2
    //   52: dload #4
    //   54: dload #6
    //   56: invokespecial <init> : (LQnq;DDD)V
    //   59: astore #8
    //   61: aload #8
    //   63: ifnull -> 124
    //   66: aload #8
    //   68: aload_1
    //   69: getfield FWm : I
    //   72: putfield Zpi : I
    //   75: aload #8
    //   77: aload_1
    //   78: getfield bzF : I
    //   81: putfield kGO : I
    //   84: aload #8
    //   86: aload_1
    //   87: getfield Qnq : I
    //   90: putfield udO : I
    //   93: aload #8
    //   95: fconst_0
    //   96: putfield mrb : F
    //   99: aload #8
    //   101: fconst_0
    //   102: putfield XHL : F
    //   105: aload #8
    //   107: aload_1
    //   108: getfield Dne : I
    //   111: putfield aFZ : I
    //   114: aload_0
    //   115: getfield Dne : LVzZ;
    //   118: aload #8
    //   120: invokevirtual Dne : (LsMa;)Z
    //   123: pop
    //   124: return
  }
  
  public void Dne(nsl paramnsl) {
    FWm(new Gle(0));
  }
  
  public void Dne(Tnn paramTnn) {
    // Byte code:
    //   0: aload_0
    //   1: getfield Dne : Lnet/minecraft/client/Minecraft;
    //   4: getfield Dne : LMJs;
    //   7: astore_2
    //   8: aload_1
    //   9: getfield Dne : I
    //   12: istore_3
    //   13: aload_1
    //   14: getfield FWm : I
    //   17: istore #4
    //   19: iload_3
    //   20: iflt -> 48
    //   23: iload_3
    //   24: getstatic Tnn.Dne : [Ljava/lang/String;
    //   27: arraylength
    //   28: if_icmpge -> 48
    //   31: getstatic Tnn.Dne : [Ljava/lang/String;
    //   34: iload_3
    //   35: aaload
    //   36: ifnull -> 48
    //   39: aload_2
    //   40: getstatic Tnn.Dne : [Ljava/lang/String;
    //   43: iload_3
    //   44: aaload
    //   45: invokevirtual bzF : (Ljava/lang/String;)V
    //   48: iload_3
    //   49: iconst_1
    //   50: if_icmpne -> 75
    //   53: aload_0
    //   54: getfield Dne : LVzZ;
    //   57: invokevirtual Dne : ()LxoY;
    //   60: iconst_1
    //   61: invokevirtual FWm : (Z)V
    //   64: aload_0
    //   65: getfield Dne : LVzZ;
    //   68: fconst_0
    //   69: invokevirtual Dne : (F)V
    //   72: goto -> 398
    //   75: iload_3
    //   76: iconst_2
    //   77: if_icmpne -> 102
    //   80: aload_0
    //   81: getfield Dne : LVzZ;
    //   84: invokevirtual Dne : ()LxoY;
    //   87: iconst_0
    //   88: invokevirtual FWm : (Z)V
    //   91: aload_0
    //   92: getfield Dne : LVzZ;
    //   95: fconst_1
    //   96: invokevirtual Dne : (F)V
    //   99: goto -> 398
    //   102: iload_3
    //   103: iconst_3
    //   104: if_icmpne -> 125
    //   107: aload_0
    //   108: getfield Dne : Lnet/minecraft/client/Minecraft;
    //   111: getfield Dne : LRJV;
    //   114: iload #4
    //   116: invokestatic Dne : (I)LXHL;
    //   119: invokevirtual Dne : (LXHL;)V
    //   122: goto -> 398
    //   125: iload_3
    //   126: iconst_4
    //   127: if_icmpne -> 147
    //   130: aload_0
    //   131: getfield Dne : Lnet/minecraft/client/Minecraft;
    //   134: new gvM
    //   137: dup
    //   138: invokespecial <init> : ()V
    //   141: invokevirtual Dne : (LqVZ;)V
    //   144: goto -> 398
    //   147: iload_3
    //   148: iconst_5
    //   149: if_icmpne -> 357
    //   152: aload_0
    //   153: getfield Dne : Lnet/minecraft/client/Minecraft;
    //   156: getfield Dne : LfZI;
    //   159: astore #5
    //   161: iload #4
    //   163: ifne -> 183
    //   166: aload_0
    //   167: getfield Dne : Lnet/minecraft/client/Minecraft;
    //   170: new yZI
    //   173: dup
    //   174: invokespecial <init> : ()V
    //   177: invokevirtual Dne : (LqVZ;)V
    //   180: goto -> 354
    //   183: iload #4
    //   185: bipush #101
    //   187: if_icmpne -> 269
    //   190: aload_0
    //   191: getfield Dne : Lnet/minecraft/client/Minecraft;
    //   194: getfield Dne : LaUl;
    //   197: invokevirtual Dne : ()LmuJ;
    //   200: ldc_w 'demo.help.movement'
    //   203: iconst_4
    //   204: anewarray java/lang/Object
    //   207: dup
    //   208: iconst_0
    //   209: aload #5
    //   211: getfield Dne : LulE;
    //   214: getfield Dne : I
    //   217: invokestatic getKeyName : (I)Ljava/lang/String;
    //   220: aastore
    //   221: dup
    //   222: iconst_1
    //   223: aload #5
    //   225: getfield FWm : LulE;
    //   228: getfield Dne : I
    //   231: invokestatic getKeyName : (I)Ljava/lang/String;
    //   234: aastore
    //   235: dup
    //   236: iconst_2
    //   237: aload #5
    //   239: getfield bzF : LulE;
    //   242: getfield Dne : I
    //   245: invokestatic getKeyName : (I)Ljava/lang/String;
    //   248: aastore
    //   249: dup
    //   250: iconst_3
    //   251: aload #5
    //   253: getfield Qnq : LulE;
    //   256: getfield Dne : I
    //   259: invokestatic getKeyName : (I)Ljava/lang/String;
    //   262: aastore
    //   263: invokevirtual Dne : (Ljava/lang/String;[Ljava/lang/Object;)V
    //   266: goto -> 354
    //   269: iload #4
    //   271: bipush #102
    //   273: if_icmpne -> 313
    //   276: aload_0
    //   277: getfield Dne : Lnet/minecraft/client/Minecraft;
    //   280: getfield Dne : LaUl;
    //   283: invokevirtual Dne : ()LmuJ;
    //   286: ldc_w 'demo.help.jump'
    //   289: iconst_1
    //   290: anewarray java/lang/Object
    //   293: dup
    //   294: iconst_0
    //   295: aload #5
    //   297: getfield aFZ : LulE;
    //   300: getfield Dne : I
    //   303: invokestatic getKeyName : (I)Ljava/lang/String;
    //   306: aastore
    //   307: invokevirtual Dne : (Ljava/lang/String;[Ljava/lang/Object;)V
    //   310: goto -> 354
    //   313: iload #4
    //   315: bipush #103
    //   317: if_icmpne -> 354
    //   320: aload_0
    //   321: getfield Dne : Lnet/minecraft/client/Minecraft;
    //   324: getfield Dne : LaUl;
    //   327: invokevirtual Dne : ()LmuJ;
    //   330: ldc_w 'demo.help.inventory'
    //   333: iconst_1
    //   334: anewarray java/lang/Object
    //   337: dup
    //   338: iconst_0
    //   339: aload #5
    //   341: getfield zGp : LulE;
    //   344: getfield Dne : I
    //   347: invokestatic getKeyName : (I)Ljava/lang/String;
    //   350: aastore
    //   351: invokevirtual Dne : (Ljava/lang/String;[Ljava/lang/Object;)V
    //   354: goto -> 398
    //   357: iload_3
    //   358: bipush #6
    //   360: if_icmpne -> 398
    //   363: aload_0
    //   364: getfield Dne : LVzZ;
    //   367: aload_2
    //   368: getfield div : D
    //   371: aload_2
    //   372: getfield IjH : D
    //   375: aload_2
    //   376: invokevirtual c_ : ()F
    //   379: f2d
    //   380: dadd
    //   381: aload_2
    //   382: getfield mrb : D
    //   385: ldc_w 'random.successful_hit'
    //   388: ldc_w 0.18
    //   391: ldc_w 0.45
    //   394: iconst_0
    //   395: invokevirtual Dne : (DDDLjava/lang/String;FFZ)V
    //   398: return
  }
  
  public boolean Dne() {
    return (this.Dne != null && this.Dne.Dne != null && this.Dne.Dne != null && this.Dne != null);
  }
  
  public void Dne(aig paramaig) {
    if (paramaig.Dne >= 0 && paramaig.Dne < MOS.Dne())
      ((MOS)((MJs)this.Dne.Dne).Dne).Dne = paramaig.Dne; 
  }
  
  public void Dne(wwJ paramwwJ) {
    if (paramwwJ.bzF()) {
      this.Dne.Dne.bzF(paramwwJ.Dne, paramwwJ.bzF, paramwwJ.Qnq, paramwwJ.aFZ, paramwwJ.FWm);
    } else {
      this.Dne.Dne.Qnq(paramwwJ.Dne, paramwwJ.bzF, paramwwJ.Qnq, paramwwJ.aFZ, paramwwJ.FWm);
    } 
  }
  
  public void FWm() {
    // Byte code:
    //   0: aload_0
    //   1: getfield Dne : Z
    //   4: ifne -> 23
    //   7: aload_0
    //   8: getfield Dne : LRXf;
    //   11: ifnull -> 23
    //   14: aload_0
    //   15: getfield Dne : LRXf;
    //   18: invokeinterface FWm : ()V
    //   23: aload_0
    //   24: getfield Dne : LRXf;
    //   27: ifnull -> 39
    //   30: aload_0
    //   31: getfield Dne : LRXf;
    //   34: invokeinterface Dne : ()V
    //   39: return
  }
  
  public void Dne(uYm paramuYm) {
    this.Dne.Dne.Dne(paramuYm.zGp);
    this.Dne.Dne.FWm(paramuYm.DyG);
  }
  
  public void Dne(JGj paramJGj) {
    sMa sMa = Dne(paramJGj.Dne);
    if (sMa != null)
      sMa.Dne(paramJGj.Dne); 
  }
  
  public void Dne(WXC paramWXC) {
    this.Dne.Dne.Dne(paramWXC.Dne, paramWXC.Dne, paramWXC.FWm);
  }
  
  public void Dne(tXK paramtXK) {
    // Byte code:
    //   0: iconst_0
    //   1: istore_2
    //   2: iload_2
    //   3: aload_1
    //   4: getfield Dne : [I
    //   7: arraylength
    //   8: if_icmpge -> 31
    //   11: aload_0
    //   12: getfield Dne : LVzZ;
    //   15: aload_1
    //   16: getfield Dne : [I
    //   19: iload_2
    //   20: iaload
    //   21: invokevirtual FWm : (I)LsMa;
    //   24: pop
    //   25: iinc #2, 1
    //   28: goto -> 2
    //   31: return
  }
  
  public void Dne(wFl paramwFl) {
    sMa sMa = Dne(paramwFl.Dne);
    if (sMa != null)
      sMa.aFZ(paramwFl.FWm / 8000.0D, paramwFl.bzF / 8000.0D, paramwFl.Qnq / 8000.0D); 
  }
  
  public void Dne(QKM paramQKM) {
    // Byte code:
    //   0: aload_0
    //   1: getfield Dne : Lnet/minecraft/client/Minecraft;
    //   4: getfield Dne : LMJs;
    //   7: astore_2
    //   8: aload_0
    //   9: aload_1
    //   10: invokevirtual bzF : (LNER;)V
    //   13: aload_2
    //   14: getfield FWm : LPdb;
    //   17: ifnull -> 49
    //   20: aload_2
    //   21: getfield FWm : LPdb;
    //   24: getfield Dne : I
    //   27: aload_1
    //   28: getfield Dne : I
    //   31: if_icmpne -> 49
    //   34: aload_2
    //   35: getfield FWm : LPdb;
    //   38: aload_1
    //   39: getfield FWm : I
    //   42: aload_1
    //   43: getfield bzF : I
    //   46: invokevirtual Dne : (II)V
    //   49: return
  }
  
  public void Dne(fmA paramfmA) {
    // Byte code:
    //   0: aload_1
    //   1: getfield Dne : I
    //   4: aload_0
    //   5: getfield Dne : Lnet/minecraft/client/Minecraft;
    //   8: getfield Dne : LMJs;
    //   11: getfield qLR : I
    //   14: if_icmpeq -> 150
    //   17: aload_0
    //   18: iconst_0
    //   19: putfield FWm : Z
    //   22: aload_0
    //   23: getfield Dne : LVzZ;
    //   26: invokevirtual Dne : ()LSFA;
    //   29: astore_2
    //   30: aload_0
    //   31: new VzZ
    //   34: dup
    //   35: aload_0
    //   36: new mrb
    //   39: dup
    //   40: lconst_0
    //   41: aload_1
    //   42: getfield Dne : LXHL;
    //   45: iconst_0
    //   46: aload_0
    //   47: getfield Dne : Lnet/minecraft/client/Minecraft;
    //   50: getfield Dne : LVzZ;
    //   53: invokevirtual Dne : ()LxoY;
    //   56: invokevirtual Qnq : ()Z
    //   59: aload_1
    //   60: getfield Dne : LkGO;
    //   63: invokespecial <init> : (JLXHL;ZZLkGO;)V
    //   66: aload_1
    //   67: getfield Dne : I
    //   70: aload_1
    //   71: getfield FWm : I
    //   74: aload_0
    //   75: getfield Dne : Lnet/minecraft/client/Minecraft;
    //   78: getfield Dne : LBkx;
    //   81: aload_0
    //   82: getfield Dne : Lnet/minecraft/client/Minecraft;
    //   85: invokevirtual Dne : ()LdLs;
    //   88: invokespecial <init> : (Lfzy;Lmrb;IILBkx;LdLs;)V
    //   91: putfield Dne : LVzZ;
    //   94: aload_0
    //   95: getfield Dne : LVzZ;
    //   98: aload_2
    //   99: invokevirtual Dne : (LSFA;)V
    //   102: aload_0
    //   103: getfield Dne : LVzZ;
    //   106: iconst_1
    //   107: putfield aFZ : Z
    //   110: aload_0
    //   111: getfield Dne : Lnet/minecraft/client/Minecraft;
    //   114: aload_0
    //   115: getfield Dne : LVzZ;
    //   118: invokevirtual Dne : (LVzZ;)V
    //   121: aload_0
    //   122: getfield Dne : Lnet/minecraft/client/Minecraft;
    //   125: getfield Dne : LMJs;
    //   128: aload_1
    //   129: getfield Dne : I
    //   132: putfield qLR : I
    //   135: aload_0
    //   136: getfield Dne : Lnet/minecraft/client/Minecraft;
    //   139: new bcj
    //   142: dup
    //   143: aload_0
    //   144: invokespecial <init> : (Lfzy;)V
    //   147: invokevirtual Dne : (LqVZ;)V
    //   150: aload_0
    //   151: getfield Dne : Lnet/minecraft/client/Minecraft;
    //   154: aload_1
    //   155: getfield Dne : I
    //   158: invokevirtual Dne : (I)V
    //   161: aload_0
    //   162: getfield Dne : Lnet/minecraft/client/Minecraft;
    //   165: getfield Dne : LRJV;
    //   168: aload_1
    //   169: getfield Dne : LXHL;
    //   172: invokevirtual Dne : (LXHL;)V
    //   175: return
  }
  
  public boolean FWm() {
    return false;
  }
  
  public void Dne(SnO paramSnO) {
    sMa sMa = Dne(paramSnO.Dne);
    if (sMa != null && paramSnO.Dne() != null)
      sMa.Dne().Dne(paramSnO.Dne()); 
  }
  
  public void Dne(ziQ paramziQ) {
    sMa sMa = Dne(paramziQ.Dne);
    if (sMa instanceof FUH) {
      NAx nAx = new NAx(paramziQ.Dne, paramziQ.Dne, paramziQ.FWm);
      nAx.FWm(paramziQ.bzF());
      ((FUH)sMa).Qnq(nAx);
    } 
  }
  
  public void Dne(AQV paramAQV) {
    this.Dne.Dne.Dne(paramAQV.Dne(), paramAQV.FWm(), paramAQV.bzF(), paramAQV.Dne(), paramAQV.Dne(), paramAQV.FWm(), false);
  }
  
  public void Dne(LjQ paramLjQ) {
    // Byte code:
    //   0: aload_0
    //   1: getfield Dne : LVzZ;
    //   4: invokevirtual Dne : ()LSFA;
    //   7: astore_2
    //   8: aload_1
    //   9: getfield Dne : Ljava/lang/String;
    //   12: invokevirtual length : ()I
    //   15: ifne -> 33
    //   18: aload_2
    //   19: aload_1
    //   20: getfield Dne : I
    //   23: aconst_null
    //   24: checkcast vfE
    //   27: invokevirtual Dne : (ILvfE;)V
    //   30: goto -> 51
    //   33: aload_2
    //   34: aload_1
    //   35: getfield Dne : Ljava/lang/String;
    //   38: invokevirtual Dne : (Ljava/lang/String;)LvfE;
    //   41: astore_3
    //   42: aload_2
    //   43: aload_1
    //   44: getfield Dne : I
    //   47: aload_3
    //   48: invokevirtual Dne : (ILvfE;)V
    //   51: return
  }
  
  public void Dne(MwE paramMwE) {
    // Byte code:
    //   0: aload_1
    //   1: getfield FWm : I
    //   4: i2d
    //   5: ldc2_w 32.0
    //   8: ddiv
    //   9: dstore_2
    //   10: aload_1
    //   11: getfield bzF : I
    //   14: i2d
    //   15: ldc2_w 32.0
    //   18: ddiv
    //   19: dstore #4
    //   21: aload_1
    //   22: getfield Qnq : I
    //   25: i2d
    //   26: ldc2_w 32.0
    //   29: ddiv
    //   30: dstore #6
    //   32: aload_1
    //   33: getfield Dne : B
    //   36: sipush #360
    //   39: imul
    //   40: i2f
    //   41: ldc 256.0
    //   43: fdiv
    //   44: fstore #8
    //   46: aload_1
    //   47: getfield FWm : B
    //   50: sipush #360
    //   53: imul
    //   54: i2f
    //   55: ldc 256.0
    //   57: fdiv
    //   58: fstore #9
    //   60: new hIH
    //   63: dup
    //   64: aload_0
    //   65: getfield Dne : Lnet/minecraft/client/Minecraft;
    //   68: getfield Dne : LVzZ;
    //   71: aload_1
    //   72: getfield Dne : Ljava/lang/String;
    //   75: invokespecial <init> : (LQnq;Ljava/lang/String;)V
    //   78: astore #10
    //   80: aload #10
    //   82: aload #10
    //   84: aload #10
    //   86: aload_1
    //   87: getfield FWm : I
    //   90: dup_x1
    //   91: putfield Zpi : I
    //   94: i2d
    //   95: dup2_x1
    //   96: putfield udO : D
    //   99: putfield aFZ : D
    //   102: aload #10
    //   104: aload #10
    //   106: aload #10
    //   108: aload_1
    //   109: getfield bzF : I
    //   112: dup_x1
    //   113: putfield kGO : I
    //   116: i2d
    //   117: dup2_x1
    //   118: putfield ooe : D
    //   121: putfield zGp : D
    //   124: aload #10
    //   126: aload #10
    //   128: aload #10
    //   130: aload_1
    //   131: getfield Qnq : I
    //   134: dup_x1
    //   135: putfield udO : I
    //   138: i2d
    //   139: dup2_x1
    //   140: putfield trS : D
    //   143: putfield DyG : D
    //   146: aload_1
    //   147: getfield aFZ : I
    //   150: istore #11
    //   152: iload #11
    //   154: ifne -> 178
    //   157: aload #10
    //   159: getfield Dne : LMOS;
    //   162: getfield Dne : [LNMq;
    //   165: aload #10
    //   167: getfield Dne : LMOS;
    //   170: getfield Dne : I
    //   173: aconst_null
    //   174: aastore
    //   175: goto -> 206
    //   178: aload #10
    //   180: getfield Dne : LMOS;
    //   183: getfield Dne : [LNMq;
    //   186: aload #10
    //   188: getfield Dne : LMOS;
    //   191: getfield Dne : I
    //   194: new NMq
    //   197: dup
    //   198: iload #11
    //   200: iconst_1
    //   201: iconst_0
    //   202: invokespecial <init> : (III)V
    //   205: aastore
    //   206: aload #10
    //   208: dload_2
    //   209: dload #4
    //   211: dload #6
    //   213: fload #8
    //   215: fload #9
    //   217: invokevirtual Dne : (DDDFF)V
    //   220: aload_0
    //   221: getfield Dne : LVzZ;
    //   224: aload_1
    //   225: getfield Dne : I
    //   228: aload #10
    //   230: invokevirtual Dne : (ILsMa;)V
    //   233: aload_1
    //   234: invokevirtual Dne : ()Ljava/util/List;
    //   237: astore #12
    //   239: aload #12
    //   241: ifnull -> 254
    //   244: aload #10
    //   246: invokevirtual Dne : ()LluM;
    //   249: aload #12
    //   251: invokevirtual Dne : (Ljava/util/List;)V
    //   254: return
  }
  
  public void Dne(wXa paramwXa) {
    // Byte code:
    //   0: aload_1
    //   1: getfield FWm : I
    //   4: i2d
    //   5: ldc2_w 32.0
    //   8: ddiv
    //   9: dstore_2
    //   10: aload_1
    //   11: getfield bzF : I
    //   14: i2d
    //   15: ldc2_w 32.0
    //   18: ddiv
    //   19: dstore #4
    //   21: aload_1
    //   22: getfield Qnq : I
    //   25: i2d
    //   26: ldc2_w 32.0
    //   29: ddiv
    //   30: dstore #6
    //   32: aconst_null
    //   33: astore #8
    //   35: aload_1
    //   36: getfield mrb : I
    //   39: bipush #10
    //   41: if_icmpne -> 65
    //   44: aload_0
    //   45: getfield Dne : LVzZ;
    //   48: dload_2
    //   49: dload #4
    //   51: dload #6
    //   53: aload_1
    //   54: getfield XHL : I
    //   57: invokestatic Dne : (LQnq;DDDI)LEbp;
    //   60: astore #8
    //   62: goto -> 778
    //   65: aload_1
    //   66: getfield mrb : I
    //   69: bipush #90
    //   71: if_icmpne -> 123
    //   74: aload_0
    //   75: aload_1
    //   76: getfield XHL : I
    //   79: invokespecial Dne : (I)LsMa;
    //   82: astore #9
    //   84: aload #9
    //   86: instanceof FiG
    //   89: ifeq -> 115
    //   92: new cQz
    //   95: dup
    //   96: aload_0
    //   97: getfield Dne : LVzZ;
    //   100: dload_2
    //   101: dload #4
    //   103: dload #6
    //   105: aload #9
    //   107: checkcast FiG
    //   110: invokespecial <init> : (LQnq;DDDLFiG;)V
    //   113: astore #8
    //   115: aload_1
    //   116: iconst_0
    //   117: putfield XHL : I
    //   120: goto -> 778
    //   123: aload_1
    //   124: getfield mrb : I
    //   127: bipush #60
    //   129: if_icmpne -> 153
    //   132: new hhc
    //   135: dup
    //   136: aload_0
    //   137: getfield Dne : LVzZ;
    //   140: dload_2
    //   141: dload #4
    //   143: dload #6
    //   145: invokespecial <init> : (LQnq;DDD)V
    //   148: astore #8
    //   150: goto -> 778
    //   153: aload_1
    //   154: getfield mrb : I
    //   157: bipush #61
    //   159: if_icmpne -> 183
    //   162: new KXX
    //   165: dup
    //   166: aload_0
    //   167: getfield Dne : LVzZ;
    //   170: dload_2
    //   171: dload #4
    //   173: dload #6
    //   175: invokespecial <init> : (LQnq;DDD)V
    //   178: astore #8
    //   180: goto -> 778
    //   183: aload_1
    //   184: getfield mrb : I
    //   187: bipush #71
    //   189: if_icmpne -> 225
    //   192: new BPY
    //   195: dup
    //   196: aload_0
    //   197: getfield Dne : LVzZ;
    //   200: dload_2
    //   201: d2i
    //   202: dload #4
    //   204: d2i
    //   205: dload #6
    //   207: d2i
    //   208: aload_1
    //   209: getfield XHL : I
    //   212: invokespecial <init> : (LQnq;IIII)V
    //   215: astore #8
    //   217: aload_1
    //   218: iconst_0
    //   219: putfield XHL : I
    //   222: goto -> 778
    //   225: aload_1
    //   226: getfield mrb : I
    //   229: bipush #65
    //   231: if_icmpne -> 255
    //   234: new Hhj
    //   237: dup
    //   238: aload_0
    //   239: getfield Dne : LVzZ;
    //   242: dload_2
    //   243: dload #4
    //   245: dload #6
    //   247: invokespecial <init> : (LQnq;DDD)V
    //   250: astore #8
    //   252: goto -> 778
    //   255: aload_1
    //   256: getfield mrb : I
    //   259: bipush #72
    //   261: if_icmpne -> 285
    //   264: new UMP
    //   267: dup
    //   268: aload_0
    //   269: getfield Dne : LVzZ;
    //   272: dload_2
    //   273: dload #4
    //   275: dload #6
    //   277: invokespecial <init> : (LQnq;DDD)V
    //   280: astore #8
    //   282: goto -> 778
    //   285: aload_1
    //   286: getfield mrb : I
    //   289: bipush #76
    //   291: if_icmpne -> 319
    //   294: new zMx
    //   297: dup
    //   298: aload_0
    //   299: getfield Dne : LVzZ;
    //   302: dload_2
    //   303: dload #4
    //   305: dload #6
    //   307: aconst_null
    //   308: checkcast NMq
    //   311: invokespecial <init> : (LQnq;DDDLNMq;)V
    //   314: astore #8
    //   316: goto -> 778
    //   319: aload_1
    //   320: getfield mrb : I
    //   323: bipush #63
    //   325: if_icmpne -> 381
    //   328: new iis
    //   331: dup
    //   332: aload_0
    //   333: getfield Dne : LVzZ;
    //   336: dload_2
    //   337: dload #4
    //   339: dload #6
    //   341: aload_1
    //   342: getfield aFZ : I
    //   345: i2d
    //   346: ldc2_w 8000.0
    //   349: ddiv
    //   350: aload_1
    //   351: getfield zGp : I
    //   354: i2d
    //   355: ldc2_w 8000.0
    //   358: ddiv
    //   359: aload_1
    //   360: getfield DyG : I
    //   363: i2d
    //   364: ldc2_w 8000.0
    //   367: ddiv
    //   368: invokespecial <init> : (LQnq;DDDDDD)V
    //   371: astore #8
    //   373: aload_1
    //   374: iconst_0
    //   375: putfield XHL : I
    //   378: goto -> 778
    //   381: aload_1
    //   382: getfield mrb : I
    //   385: bipush #64
    //   387: if_icmpne -> 443
    //   390: new Xzh
    //   393: dup
    //   394: aload_0
    //   395: getfield Dne : LVzZ;
    //   398: dload_2
    //   399: dload #4
    //   401: dload #6
    //   403: aload_1
    //   404: getfield aFZ : I
    //   407: i2d
    //   408: ldc2_w 8000.0
    //   411: ddiv
    //   412: aload_1
    //   413: getfield zGp : I
    //   416: i2d
    //   417: ldc2_w 8000.0
    //   420: ddiv
    //   421: aload_1
    //   422: getfield DyG : I
    //   425: i2d
    //   426: ldc2_w 8000.0
    //   429: ddiv
    //   430: invokespecial <init> : (LQnq;DDDDDD)V
    //   433: astore #8
    //   435: aload_1
    //   436: iconst_0
    //   437: putfield XHL : I
    //   440: goto -> 778
    //   443: aload_1
    //   444: getfield mrb : I
    //   447: bipush #66
    //   449: if_icmpne -> 505
    //   452: new YCH
    //   455: dup
    //   456: aload_0
    //   457: getfield Dne : LVzZ;
    //   460: dload_2
    //   461: dload #4
    //   463: dload #6
    //   465: aload_1
    //   466: getfield aFZ : I
    //   469: i2d
    //   470: ldc2_w 8000.0
    //   473: ddiv
    //   474: aload_1
    //   475: getfield zGp : I
    //   478: i2d
    //   479: ldc2_w 8000.0
    //   482: ddiv
    //   483: aload_1
    //   484: getfield DyG : I
    //   487: i2d
    //   488: ldc2_w 8000.0
    //   491: ddiv
    //   492: invokespecial <init> : (LQnq;DDDDDD)V
    //   495: astore #8
    //   497: aload_1
    //   498: iconst_0
    //   499: putfield XHL : I
    //   502: goto -> 778
    //   505: aload_1
    //   506: getfield mrb : I
    //   509: bipush #62
    //   511: if_icmpne -> 535
    //   514: new TCA
    //   517: dup
    //   518: aload_0
    //   519: getfield Dne : LVzZ;
    //   522: dload_2
    //   523: dload #4
    //   525: dload #6
    //   527: invokespecial <init> : (LQnq;DDD)V
    //   530: astore #8
    //   532: goto -> 778
    //   535: aload_1
    //   536: getfield mrb : I
    //   539: bipush #73
    //   541: if_icmpne -> 574
    //   544: new YgL
    //   547: dup
    //   548: aload_0
    //   549: getfield Dne : LVzZ;
    //   552: dload_2
    //   553: dload #4
    //   555: dload #6
    //   557: aload_1
    //   558: getfield XHL : I
    //   561: invokespecial <init> : (LQnq;DDDI)V
    //   564: astore #8
    //   566: aload_1
    //   567: iconst_0
    //   568: putfield XHL : I
    //   571: goto -> 778
    //   574: aload_1
    //   575: getfield mrb : I
    //   578: bipush #75
    //   580: if_icmpne -> 609
    //   583: new AEw
    //   586: dup
    //   587: aload_0
    //   588: getfield Dne : LVzZ;
    //   591: dload_2
    //   592: dload #4
    //   594: dload #6
    //   596: invokespecial <init> : (LQnq;DDD)V
    //   599: astore #8
    //   601: aload_1
    //   602: iconst_0
    //   603: putfield XHL : I
    //   606: goto -> 778
    //   609: aload_1
    //   610: getfield mrb : I
    //   613: iconst_1
    //   614: if_icmpne -> 638
    //   617: new iMX
    //   620: dup
    //   621: aload_0
    //   622: getfield Dne : LVzZ;
    //   625: dload_2
    //   626: dload #4
    //   628: dload #6
    //   630: invokespecial <init> : (LQnq;DDD)V
    //   633: astore #8
    //   635: goto -> 778
    //   638: aload_1
    //   639: getfield mrb : I
    //   642: bipush #50
    //   644: if_icmpne -> 672
    //   647: new gqg
    //   650: dup
    //   651: aload_0
    //   652: getfield Dne : LVzZ;
    //   655: dload_2
    //   656: dload #4
    //   658: dload #6
    //   660: aconst_null
    //   661: checkcast FUH
    //   664: invokespecial <init> : (LQnq;DDDLFUH;)V
    //   667: astore #8
    //   669: goto -> 778
    //   672: aload_1
    //   673: getfield mrb : I
    //   676: bipush #51
    //   678: if_icmpne -> 702
    //   681: new Ndk
    //   684: dup
    //   685: aload_0
    //   686: getfield Dne : LVzZ;
    //   689: dload_2
    //   690: dload #4
    //   692: dload #6
    //   694: invokespecial <init> : (LQnq;DDD)V
    //   697: astore #8
    //   699: goto -> 778
    //   702: aload_1
    //   703: getfield mrb : I
    //   706: iconst_2
    //   707: if_icmpne -> 731
    //   710: new JiM
    //   713: dup
    //   714: aload_0
    //   715: getfield Dne : LVzZ;
    //   718: dload_2
    //   719: dload #4
    //   721: dload #6
    //   723: invokespecial <init> : (LQnq;DDD)V
    //   726: astore #8
    //   728: goto -> 778
    //   731: aload_1
    //   732: getfield mrb : I
    //   735: bipush #70
    //   737: if_icmpne -> 778
    //   740: new CiF
    //   743: dup
    //   744: aload_0
    //   745: getfield Dne : LVzZ;
    //   748: dload_2
    //   749: dload #4
    //   751: dload #6
    //   753: aload_1
    //   754: getfield XHL : I
    //   757: ldc_w 65535
    //   760: iand
    //   761: aload_1
    //   762: getfield XHL : I
    //   765: bipush #16
    //   767: ishr
    //   768: invokespecial <init> : (LQnq;DDDII)V
    //   771: astore #8
    //   773: aload_1
    //   774: iconst_0
    //   775: putfield XHL : I
    //   778: aload #8
    //   780: ifnull -> 1032
    //   783: aload #8
    //   785: checkcast sMa
    //   788: aload_1
    //   789: getfield FWm : I
    //   792: putfield Zpi : I
    //   795: aload #8
    //   797: checkcast sMa
    //   800: aload_1
    //   801: getfield bzF : I
    //   804: putfield kGO : I
    //   807: aload #8
    //   809: checkcast sMa
    //   812: aload_1
    //   813: getfield Qnq : I
    //   816: putfield udO : I
    //   819: aload #8
    //   821: checkcast sMa
    //   824: aload_1
    //   825: getfield div : I
    //   828: sipush #360
    //   831: imul
    //   832: i2f
    //   833: ldc 256.0
    //   835: fdiv
    //   836: putfield XHL : F
    //   839: aload #8
    //   841: checkcast sMa
    //   844: aload_1
    //   845: getfield IjH : I
    //   848: sipush #360
    //   851: imul
    //   852: i2f
    //   853: ldc 256.0
    //   855: fdiv
    //   856: putfield mrb : F
    //   859: aload #8
    //   861: checkcast sMa
    //   864: invokevirtual Dne : ()[LsMa;
    //   867: astore #9
    //   869: aload #9
    //   871: ifnull -> 921
    //   874: aload_1
    //   875: getfield Dne : I
    //   878: aload #8
    //   880: checkcast sMa
    //   883: getfield aFZ : I
    //   886: isub
    //   887: istore #10
    //   889: iconst_0
    //   890: istore #11
    //   892: iload #11
    //   894: aload #9
    //   896: arraylength
    //   897: if_icmpge -> 921
    //   900: aload #9
    //   902: iload #11
    //   904: aaload
    //   905: dup
    //   906: getfield aFZ : I
    //   909: iload #10
    //   911: iadd
    //   912: putfield aFZ : I
    //   915: iinc #11, 1
    //   918: goto -> 892
    //   921: aload #8
    //   923: checkcast sMa
    //   926: aload_1
    //   927: getfield Dne : I
    //   930: putfield aFZ : I
    //   933: aload_0
    //   934: getfield Dne : LVzZ;
    //   937: aload_1
    //   938: getfield Dne : I
    //   941: aload #8
    //   943: checkcast sMa
    //   946: invokevirtual Dne : (ILsMa;)V
    //   949: aload_1
    //   950: getfield XHL : I
    //   953: ifle -> 1032
    //   956: aload_1
    //   957: getfield mrb : I
    //   960: bipush #60
    //   962: if_icmpne -> 997
    //   965: aload_0
    //   966: aload_1
    //   967: getfield XHL : I
    //   970: invokespecial Dne : (I)LsMa;
    //   973: astore #10
    //   975: aload #10
    //   977: instanceof FUH
    //   980: ifeq -> 997
    //   983: aload #8
    //   985: checkcast hhc
    //   988: astore #11
    //   990: aload #11
    //   992: aload #10
    //   994: putfield bzF : LsMa;
    //   997: aload #8
    //   999: checkcast sMa
    //   1002: aload_1
    //   1003: getfield aFZ : I
    //   1006: i2d
    //   1007: ldc2_w 8000.0
    //   1010: ddiv
    //   1011: aload_1
    //   1012: getfield zGp : I
    //   1015: i2d
    //   1016: ldc2_w 8000.0
    //   1019: ddiv
    //   1020: aload_1
    //   1021: getfield DyG : I
    //   1024: i2d
    //   1025: ldc2_w 8000.0
    //   1028: ddiv
    //   1029: invokevirtual aFZ : (DDD)V
    //   1032: return
  }
  
  public void Dne(eNn parameNn) {
    sMa sMa = Dne(parameNn.Dne);
    if (sMa != null) {
      float f = (parameNn.Dne * 360) / 256.0F;
      sMa.FWm(f);
    } 
  }
  
  public void Dne(gzk paramgzk) {
    sMa sMa = Dne(paramgzk.Dne);
    if (sMa instanceof FUH)
      ((FUH)sMa).mrb(paramgzk.Dne); 
  }
  
  public void Dne(niw paramniw) {
    // Byte code:
    //   0: aload_0
    //   1: getfield Dne : LVzZ;
    //   4: invokevirtual Dne : ()LSFA;
    //   7: astore_2
    //   8: aload_2
    //   9: aload_1
    //   10: getfield FWm : Ljava/lang/String;
    //   13: invokevirtual Dne : (Ljava/lang/String;)LvfE;
    //   16: astore_3
    //   17: aload_1
    //   18: getfield FWm : I
    //   21: ifne -> 47
    //   24: aload_2
    //   25: aload_1
    //   26: getfield Dne : Ljava/lang/String;
    //   29: aload_3
    //   30: invokevirtual Dne : (Ljava/lang/String;LvfE;)LOHz;
    //   33: astore #4
    //   35: aload #4
    //   37: aload_1
    //   38: getfield Dne : I
    //   41: invokevirtual bzF : (I)V
    //   44: goto -> 63
    //   47: aload_1
    //   48: getfield FWm : I
    //   51: iconst_1
    //   52: if_icmpne -> 63
    //   55: aload_2
    //   56: aload_1
    //   57: getfield Dne : Ljava/lang/String;
    //   60: invokevirtual Dne : (Ljava/lang/String;)V
    //   63: return
  }
  
  public void Dne(nPC paramnPC) {
    // Byte code:
    //   0: iconst_0
    //   1: istore_2
    //   2: iload_2
    //   3: aload_1
    //   4: invokevirtual FWm : ()I
    //   7: if_icmpge -> 188
    //   10: aload_1
    //   11: iload_2
    //   12: invokevirtual Dne : (I)I
    //   15: istore_3
    //   16: aload_1
    //   17: iload_2
    //   18: invokevirtual FWm : (I)I
    //   21: istore #4
    //   23: aload_0
    //   24: getfield Dne : LVzZ;
    //   27: iload_3
    //   28: iload #4
    //   30: iconst_1
    //   31: invokevirtual Dne : (IIZ)V
    //   34: aload_0
    //   35: getfield Dne : LVzZ;
    //   38: iload_3
    //   39: iconst_4
    //   40: ishl
    //   41: iconst_0
    //   42: iload #4
    //   44: iconst_4
    //   45: ishl
    //   46: iload_3
    //   47: iconst_4
    //   48: ishl
    //   49: bipush #15
    //   51: iadd
    //   52: sipush #256
    //   55: iload #4
    //   57: iconst_4
    //   58: ishl
    //   59: bipush #15
    //   61: iadd
    //   62: invokevirtual aFZ : (IIIIII)V
    //   65: aload_0
    //   66: getfield Dne : LVzZ;
    //   69: iload_3
    //   70: iload #4
    //   72: invokevirtual FWm : (II)LqMV;
    //   75: astore #5
    //   77: aload #5
    //   79: ifnonnull -> 105
    //   82: aload_0
    //   83: getfield Dne : LVzZ;
    //   86: iload_3
    //   87: iload #4
    //   89: iconst_1
    //   90: invokevirtual Dne : (IIZ)V
    //   93: aload_0
    //   94: getfield Dne : LVzZ;
    //   97: iload_3
    //   98: iload #4
    //   100: invokevirtual FWm : (II)LqMV;
    //   103: astore #5
    //   105: aload #5
    //   107: ifnull -> 182
    //   110: aload #5
    //   112: aload_1
    //   113: iload_2
    //   114: invokevirtual Dne : (I)[B
    //   117: aload_1
    //   118: getfield Dne : [I
    //   121: iload_2
    //   122: iaload
    //   123: aload_1
    //   124: getfield FWm : [I
    //   127: iload_2
    //   128: iaload
    //   129: iconst_1
    //   130: invokevirtual Dne : ([BIIZ)V
    //   133: aload_0
    //   134: getfield Dne : LVzZ;
    //   137: iload_3
    //   138: iconst_4
    //   139: ishl
    //   140: iconst_0
    //   141: iload #4
    //   143: iconst_4
    //   144: ishl
    //   145: iload_3
    //   146: iconst_4
    //   147: ishl
    //   148: bipush #15
    //   150: iadd
    //   151: sipush #256
    //   154: iload #4
    //   156: iconst_4
    //   157: ishl
    //   158: bipush #15
    //   160: iadd
    //   161: invokevirtual Dne : (IIIIII)V
    //   164: aload_0
    //   165: getfield Dne : LVzZ;
    //   168: getfield Dne : LJik;
    //   171: instanceof lMz
    //   174: ifne -> 182
    //   177: aload #5
    //   179: invokevirtual DyG : ()V
    //   182: iinc #2, 1
    //   185: goto -> 2
    //   188: return
  }
  
  public void Dne() {
    // Byte code:
    //   0: aload_0
    //   1: getfield Dne : LRXf;
    //   4: ifnull -> 16
    //   7: aload_0
    //   8: getfield Dne : LRXf;
    //   11: invokeinterface Dne : ()V
    //   16: aload_0
    //   17: aconst_null
    //   18: putfield Dne : LRXf;
    //   21: aload_0
    //   22: aconst_null
    //   23: putfield Dne : LVzZ;
    //   26: return
  }
  
  public void Dne(GJK paramGJK) {
    // Byte code:
    //   0: aload_1
    //   1: invokevirtual Dne : ()Ljava/lang/String;
    //   4: invokevirtual trim : ()Ljava/lang/String;
    //   7: astore_2
    //   8: aload_1
    //   9: invokevirtual Dne : ()Ljava/security/PublicKey;
    //   12: astore_3
    //   13: invokestatic Dne : ()Ljavax/crypto/SecretKey;
    //   16: astore #4
    //   18: ldc_w '-'
    //   21: aload_2
    //   22: invokevirtual equals : (Ljava/lang/Object;)Z
    //   25: ifne -> 110
    //   28: new java/math/BigInteger
    //   31: dup
    //   32: aload_2
    //   33: aload_3
    //   34: aload #4
    //   36: invokestatic Dne : (Ljava/lang/String;Ljava/security/PublicKey;Ljavax/crypto/SecretKey;)[B
    //   39: invokespecial <init> : ([B)V
    //   42: bipush #16
    //   44: invokevirtual toString : (I)Ljava/lang/String;
    //   47: astore #5
    //   49: aload_0
    //   50: aload_0
    //   51: getfield Dne : Lnet/minecraft/client/Minecraft;
    //   54: getfield Dne : LvwN;
    //   57: getfield Dne : Ljava/lang/String;
    //   60: aload_0
    //   61: getfield Dne : Lnet/minecraft/client/Minecraft;
    //   64: getfield Dne : LvwN;
    //   67: getfield FWm : Ljava/lang/String;
    //   70: aload #5
    //   72: invokespecial Dne : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   75: astore #6
    //   77: ldc_w 'ok'
    //   80: aload #6
    //   82: invokevirtual equalsIgnoreCase : (Ljava/lang/String;)Z
    //   85: ifne -> 110
    //   88: aload_0
    //   89: getfield Dne : LRXf;
    //   92: ldc_w 'disconnect.loginFailedInfo'
    //   95: iconst_1
    //   96: anewarray java/lang/Object
    //   99: dup
    //   100: iconst_0
    //   101: aload #6
    //   103: aastore
    //   104: invokeinterface Dne : (Ljava/lang/String;[Ljava/lang/Object;)V
    //   109: return
    //   110: aload_0
    //   111: new nsl
    //   114: dup
    //   115: aload #4
    //   117: aload_3
    //   118: aload_1
    //   119: invokevirtual Dne : ()[B
    //   122: invokespecial <init> : (Ljavax/crypto/SecretKey;Ljava/security/PublicKey;[B)V
    //   125: invokevirtual FWm : (LNER;)V
    //   128: return
  }
  
  public void Dne(mPe parammPe) {
    // Byte code:
    //   0: new alg
    //   3: dup
    //   4: aload_0
    //   5: getfield Dne : LVzZ;
    //   8: aload_1
    //   9: getfield FWm : I
    //   12: i2d
    //   13: aload_1
    //   14: getfield bzF : I
    //   17: i2d
    //   18: aload_1
    //   19: getfield Qnq : I
    //   22: i2d
    //   23: aload_1
    //   24: getfield aFZ : I
    //   27: invokespecial <init> : (LQnq;DDDI)V
    //   30: astore_2
    //   31: aload_2
    //   32: aload_1
    //   33: getfield FWm : I
    //   36: putfield Zpi : I
    //   39: aload_2
    //   40: aload_1
    //   41: getfield bzF : I
    //   44: putfield kGO : I
    //   47: aload_2
    //   48: aload_1
    //   49: getfield Qnq : I
    //   52: putfield udO : I
    //   55: aload_2
    //   56: fconst_0
    //   57: putfield mrb : F
    //   60: aload_2
    //   61: fconst_0
    //   62: putfield XHL : F
    //   65: aload_2
    //   66: aload_1
    //   67: getfield Dne : I
    //   70: putfield aFZ : I
    //   73: aload_0
    //   74: getfield Dne : LVzZ;
    //   77: aload_1
    //   78: getfield Dne : I
    //   81: aload_2
    //   82: invokevirtual Dne : (ILsMa;)V
    //   85: return
  }
  
  public void Dne(liE paramliE) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: getfield Dne : I
    //   5: invokespecial Dne : (I)LsMa;
    //   8: astore_2
    //   9: aload_0
    //   10: aload_1
    //   11: getfield FWm : I
    //   14: invokespecial Dne : (I)LsMa;
    //   17: checkcast FUH
    //   20: astore_3
    //   21: aload_3
    //   22: ifnonnull -> 33
    //   25: aload_0
    //   26: getfield Dne : Lnet/minecraft/client/Minecraft;
    //   29: getfield Dne : LMJs;
    //   32: astore_3
    //   33: aload_2
    //   34: ifnull -> 165
    //   37: aload_2
    //   38: instanceof alg
    //   41: ifeq -> 84
    //   44: aload_0
    //   45: getfield Dne : LVzZ;
    //   48: aload_2
    //   49: ldc_w 'random.orb'
    //   52: ldc_w 0.2
    //   55: aload_0
    //   56: getfield Dne : Ljava/util/Random;
    //   59: invokevirtual nextFloat : ()F
    //   62: aload_0
    //   63: getfield Dne : Ljava/util/Random;
    //   66: invokevirtual nextFloat : ()F
    //   69: fsub
    //   70: ldc_w 0.7
    //   73: fmul
    //   74: fconst_1
    //   75: fadd
    //   76: fconst_2
    //   77: fmul
    //   78: invokevirtual Dne : (LsMa;Ljava/lang/String;FF)V
    //   81: goto -> 121
    //   84: aload_0
    //   85: getfield Dne : LVzZ;
    //   88: aload_2
    //   89: ldc_w 'random.pop'
    //   92: ldc_w 0.2
    //   95: aload_0
    //   96: getfield Dne : Ljava/util/Random;
    //   99: invokevirtual nextFloat : ()F
    //   102: aload_0
    //   103: getfield Dne : Ljava/util/Random;
    //   106: invokevirtual nextFloat : ()F
    //   109: fsub
    //   110: ldc_w 0.7
    //   113: fmul
    //   114: fconst_1
    //   115: fadd
    //   116: fconst_2
    //   117: fmul
    //   118: invokevirtual Dne : (LsMa;Ljava/lang/String;FF)V
    //   121: aload_0
    //   122: getfield Dne : Lnet/minecraft/client/Minecraft;
    //   125: getfield Dne : LBMa;
    //   128: new Qnx
    //   131: dup
    //   132: aload_0
    //   133: getfield Dne : Lnet/minecraft/client/Minecraft;
    //   136: getfield Dne : LVzZ;
    //   139: aload_2
    //   140: aload_3
    //   141: checkcast sMa
    //   144: ldc_w -0.5
    //   147: invokespecial <init> : (LQnq;LsMa;LsMa;F)V
    //   150: invokevirtual Dne : (LCAZ;)V
    //   153: aload_0
    //   154: getfield Dne : LVzZ;
    //   157: aload_1
    //   158: getfield Dne : I
    //   161: invokevirtual FWm : (I)LsMa;
    //   164: pop
    //   165: return
  }
  
  public void Dne(Raa paramRaa) {
    this.Dne.Dne.FWm(trP.Dne(paramRaa.Dne), paramRaa.FWm);
  }
  
  public void Dne(String paramString, Object[] paramArrayOfObject) {
    if (!this.Dne) {
      this.Dne = true;
      this.Dne.Dne((VzZ)null);
      if (this.Dne != null) {
        this.Dne.Dne(new rNz(this.Dne, "disconnect.lost", paramString, paramArrayOfObject));
      } else {
        this.Dne.Dne(new fZp(new KDD(new MKS()), "disconnect.lost", paramString, paramArrayOfObject));
      } 
    } 
  }
  
  public void Dne(rXx paramrXx) {
    this.Dne.Dne.Dne().Dne(paramrXx.Dne);
  }
  
  public void Dne(ROw paramROw) {
    this.Dne.Dne.Dne(new iSh(paramROw.Dne, paramROw.FWm, paramROw.bzF), true);
    this.Dne.Dne.Dne().Dne(paramROw.Dne, paramROw.FWm, paramROw.bzF);
  }
  
  public void Dne(NER paramNER) {
    // Byte code:
    //   0: aload_0
    //   1: getfield Dne : Z
    //   4: ifne -> 26
    //   7: aload_0
    //   8: getfield Dne : LRXf;
    //   11: aload_1
    //   12: invokeinterface Dne : (LNER;)V
    //   17: aload_0
    //   18: getfield Dne : LRXf;
    //   21: invokeinterface bzF : ()V
    //   26: return
  }
  
  public void Dne(kwp paramkwp) {
    sMa sMa = Dne(paramkwp.Dne);
    if (sMa != null && paramkwp.aFZ == 0) {
      FiG fiG = (FiG)sMa;
      fiG.Dne(paramkwp.FWm, paramkwp.bzF, paramkwp.Qnq);
    } 
  }
  
  public void Dne(QZR paramQZR) {
    // Byte code:
    //   0: aload_1
    //   1: getfield bzF : I
    //   4: i2d
    //   5: ldc2_w 32.0
    //   8: ddiv
    //   9: dstore_2
    //   10: aload_1
    //   11: getfield Qnq : I
    //   14: i2d
    //   15: ldc2_w 32.0
    //   18: ddiv
    //   19: dstore #4
    //   21: aload_1
    //   22: getfield aFZ : I
    //   25: i2d
    //   26: ldc2_w 32.0
    //   29: ddiv
    //   30: dstore #6
    //   32: aload_1
    //   33: getfield Dne : B
    //   36: sipush #360
    //   39: imul
    //   40: i2f
    //   41: ldc 256.0
    //   43: fdiv
    //   44: fstore #8
    //   46: aload_1
    //   47: getfield FWm : B
    //   50: sipush #360
    //   53: imul
    //   54: i2f
    //   55: ldc 256.0
    //   57: fdiv
    //   58: fstore #9
    //   60: aload_1
    //   61: getfield FWm : I
    //   64: aload_0
    //   65: getfield Dne : Lnet/minecraft/client/Minecraft;
    //   68: getfield Dne : LVzZ;
    //   71: invokestatic Dne : (ILQnq;)LsMa;
    //   74: checkcast FUH
    //   77: astore #10
    //   79: aload #10
    //   81: aload_1
    //   82: getfield bzF : I
    //   85: putfield Zpi : I
    //   88: aload #10
    //   90: aload_1
    //   91: getfield Qnq : I
    //   94: putfield kGO : I
    //   97: aload #10
    //   99: aload_1
    //   100: getfield aFZ : I
    //   103: putfield udO : I
    //   106: aload #10
    //   108: aload_1
    //   109: getfield bzF : B
    //   112: sipush #360
    //   115: imul
    //   116: i2f
    //   117: ldc 256.0
    //   119: fdiv
    //   120: putfield vSL : F
    //   123: aload #10
    //   125: invokevirtual Dne : ()[LsMa;
    //   128: astore #11
    //   130: aload #11
    //   132: ifnull -> 179
    //   135: aload_1
    //   136: getfield Dne : I
    //   139: aload #10
    //   141: getfield aFZ : I
    //   144: isub
    //   145: istore #12
    //   147: iconst_0
    //   148: istore #13
    //   150: iload #13
    //   152: aload #11
    //   154: arraylength
    //   155: if_icmpge -> 179
    //   158: aload #11
    //   160: iload #13
    //   162: aaload
    //   163: dup
    //   164: getfield aFZ : I
    //   167: iload #12
    //   169: iadd
    //   170: putfield aFZ : I
    //   173: iinc #13, 1
    //   176: goto -> 150
    //   179: aload #10
    //   181: aload_1
    //   182: getfield Dne : I
    //   185: putfield aFZ : I
    //   188: aload #10
    //   190: dload_2
    //   191: dload #4
    //   193: dload #6
    //   195: fload #8
    //   197: fload #9
    //   199: invokevirtual Dne : (DDDFF)V
    //   202: aload #10
    //   204: aload_1
    //   205: getfield zGp : I
    //   208: i2f
    //   209: ldc_w 8000.0
    //   212: fdiv
    //   213: f2d
    //   214: putfield XHL : D
    //   217: aload #10
    //   219: aload_1
    //   220: getfield DyG : I
    //   223: i2f
    //   224: ldc_w 8000.0
    //   227: fdiv
    //   228: f2d
    //   229: putfield Zpi : D
    //   232: aload #10
    //   234: aload_1
    //   235: getfield div : I
    //   238: i2f
    //   239: ldc_w 8000.0
    //   242: fdiv
    //   243: f2d
    //   244: putfield kGO : D
    //   247: aload_0
    //   248: getfield Dne : LVzZ;
    //   251: aload_1
    //   252: getfield Dne : I
    //   255: aload #10
    //   257: invokevirtual Dne : (ILsMa;)V
    //   260: aload_1
    //   261: invokevirtual Dne : ()Ljava/util/List;
    //   264: astore #12
    //   266: aload #12
    //   268: ifnull -> 281
    //   271: aload #10
    //   273: invokevirtual Dne : ()LluM;
    //   276: aload #12
    //   278: invokevirtual Dne : (Ljava/util/List;)V
    //   281: return
  }
  
  public void Dne(pKI parampKI) {
    // Byte code:
    //   0: aload_1
    //   1: getfield Dne : Z
    //   4: ifeq -> 47
    //   7: aload_1
    //   8: getfield bzF : I
    //   11: ifne -> 31
    //   14: aload_0
    //   15: getfield Dne : LVzZ;
    //   18: aload_1
    //   19: getfield Dne : I
    //   22: aload_1
    //   23: getfield FWm : I
    //   26: iconst_0
    //   27: invokevirtual Dne : (IIZ)V
    //   30: return
    //   31: aload_0
    //   32: getfield Dne : LVzZ;
    //   35: aload_1
    //   36: getfield Dne : I
    //   39: aload_1
    //   40: getfield FWm : I
    //   43: iconst_1
    //   44: invokevirtual Dne : (IIZ)V
    //   47: aload_0
    //   48: getfield Dne : LVzZ;
    //   51: aload_1
    //   52: getfield Dne : I
    //   55: iconst_4
    //   56: ishl
    //   57: iconst_0
    //   58: aload_1
    //   59: getfield FWm : I
    //   62: iconst_4
    //   63: ishl
    //   64: aload_1
    //   65: getfield Dne : I
    //   68: iconst_4
    //   69: ishl
    //   70: bipush #15
    //   72: iadd
    //   73: sipush #256
    //   76: aload_1
    //   77: getfield FWm : I
    //   80: iconst_4
    //   81: ishl
    //   82: bipush #15
    //   84: iadd
    //   85: invokevirtual aFZ : (IIIIII)V
    //   88: aload_0
    //   89: getfield Dne : LVzZ;
    //   92: aload_1
    //   93: getfield Dne : I
    //   96: aload_1
    //   97: getfield FWm : I
    //   100: invokevirtual FWm : (II)LqMV;
    //   103: astore_2
    //   104: aload_1
    //   105: getfield Dne : Z
    //   108: ifeq -> 147
    //   111: aload_2
    //   112: ifnonnull -> 147
    //   115: aload_0
    //   116: getfield Dne : LVzZ;
    //   119: aload_1
    //   120: getfield Dne : I
    //   123: aload_1
    //   124: getfield FWm : I
    //   127: iconst_1
    //   128: invokevirtual Dne : (IIZ)V
    //   131: aload_0
    //   132: getfield Dne : LVzZ;
    //   135: aload_1
    //   136: getfield Dne : I
    //   139: aload_1
    //   140: getfield FWm : I
    //   143: invokevirtual FWm : (II)LqMV;
    //   146: astore_2
    //   147: aload_2
    //   148: ifnull -> 236
    //   151: aload_2
    //   152: aload_1
    //   153: invokevirtual Dne : ()[B
    //   156: aload_1
    //   157: getfield bzF : I
    //   160: aload_1
    //   161: getfield Qnq : I
    //   164: aload_1
    //   165: getfield Dne : Z
    //   168: invokevirtual Dne : ([BIIZ)V
    //   171: aload_0
    //   172: getfield Dne : LVzZ;
    //   175: aload_1
    //   176: getfield Dne : I
    //   179: iconst_4
    //   180: ishl
    //   181: iconst_0
    //   182: aload_1
    //   183: getfield FWm : I
    //   186: iconst_4
    //   187: ishl
    //   188: aload_1
    //   189: getfield Dne : I
    //   192: iconst_4
    //   193: ishl
    //   194: bipush #15
    //   196: iadd
    //   197: sipush #256
    //   200: aload_1
    //   201: getfield FWm : I
    //   204: iconst_4
    //   205: ishl
    //   206: bipush #15
    //   208: iadd
    //   209: invokevirtual Dne : (IIIIII)V
    //   212: aload_1
    //   213: getfield Dne : Z
    //   216: ifeq -> 232
    //   219: aload_0
    //   220: getfield Dne : LVzZ;
    //   223: getfield Dne : LJik;
    //   226: instanceof lMz
    //   229: ifne -> 236
    //   232: aload_2
    //   233: invokevirtual DyG : ()V
    //   236: return
  }
  
  public void FWm(NER paramNER) {
    // Byte code:
    //   0: aload_0
    //   1: getfield Dne : Z
    //   4: ifne -> 17
    //   7: aload_0
    //   8: getfield Dne : LRXf;
    //   11: aload_1
    //   12: invokeinterface Dne : (LNER;)V
    //   17: return
  }
  
  public void Dne(YVz paramYVz) {
    vwN vwN;
    sMa sMa1 = Dne(paramYVz.Dne);
    sMa sMa2 = Dne(paramYVz.FWm);
    if (paramYVz.Dne == ((MJs)this.Dne.Dne).aFZ) {
      vwN = this.Dne.Dne;
      if (sMa2 instanceof iMX)
        ((iMX)sMa2).FWm(false); 
    } else if (sMa2 instanceof iMX) {
      ((iMX)sMa2).FWm(true);
    } 
    if (vwN != null)
      ((sMa)vwN).bzF(sMa2); 
  }
  
  public void Dne(FQJ paramFQJ) {
    // Byte code:
    //   0: aload_0
    //   1: getfield Dne : Lnet/minecraft/client/Minecraft;
    //   4: getfield Dne : LMJs;
    //   7: astore_2
    //   8: aload_2
    //   9: getfield div : D
    //   12: dstore_3
    //   13: aload_2
    //   14: getfield IjH : D
    //   17: dstore #5
    //   19: aload_2
    //   20: getfield mrb : D
    //   23: dstore #7
    //   25: aload_2
    //   26: getfield mrb : F
    //   29: fstore #9
    //   31: aload_2
    //   32: getfield XHL : F
    //   35: fstore #10
    //   37: aload_1
    //   38: getfield FWm : Z
    //   41: ifeq -> 61
    //   44: aload_1
    //   45: getfield Dne : D
    //   48: dstore_3
    //   49: aload_1
    //   50: getfield FWm : D
    //   53: dstore #5
    //   55: aload_1
    //   56: getfield bzF : D
    //   59: dstore #7
    //   61: aload_1
    //   62: getfield bzF : Z
    //   65: ifeq -> 80
    //   68: aload_1
    //   69: getfield Dne : F
    //   72: fstore #9
    //   74: aload_1
    //   75: getfield FWm : F
    //   78: fstore #10
    //   80: aload_2
    //   81: fconst_0
    //   82: putfield EyB : F
    //   85: aload_2
    //   86: aload_2
    //   87: aload_2
    //   88: dconst_0
    //   89: dup2_x1
    //   90: putfield kGO : D
    //   93: dup2_x1
    //   94: putfield Zpi : D
    //   97: putfield XHL : D
    //   100: aload_2
    //   101: dload_3
    //   102: dload #5
    //   104: dload #7
    //   106: fload #9
    //   108: fload #10
    //   110: invokevirtual Dne : (DDDFF)V
    //   113: aload_1
    //   114: aload_2
    //   115: getfield div : D
    //   118: putfield Dne : D
    //   121: aload_1
    //   122: aload_2
    //   123: getfield Dne : LbSp;
    //   126: getfield FWm : D
    //   129: putfield FWm : D
    //   132: aload_1
    //   133: aload_2
    //   134: getfield mrb : D
    //   137: putfield bzF : D
    //   140: aload_1
    //   141: aload_2
    //   142: getfield IjH : D
    //   145: putfield Qnq : D
    //   148: aload_0
    //   149: getfield Dne : LRXf;
    //   152: aload_1
    //   153: invokeinterface Dne : (LNER;)V
    //   158: aload_0
    //   159: getfield FWm : Z
    //   162: ifne -> 241
    //   165: aload_0
    //   166: getfield Dne : Lnet/minecraft/client/Minecraft;
    //   169: getfield Dne : LMJs;
    //   172: aload_0
    //   173: getfield Dne : Lnet/minecraft/client/Minecraft;
    //   176: getfield Dne : LMJs;
    //   179: getfield div : D
    //   182: putfield aFZ : D
    //   185: aload_0
    //   186: getfield Dne : Lnet/minecraft/client/Minecraft;
    //   189: getfield Dne : LMJs;
    //   192: aload_0
    //   193: getfield Dne : Lnet/minecraft/client/Minecraft;
    //   196: getfield Dne : LMJs;
    //   199: getfield IjH : D
    //   202: putfield zGp : D
    //   205: aload_0
    //   206: getfield Dne : Lnet/minecraft/client/Minecraft;
    //   209: getfield Dne : LMJs;
    //   212: aload_0
    //   213: getfield Dne : Lnet/minecraft/client/Minecraft;
    //   216: getfield Dne : LMJs;
    //   219: getfield mrb : D
    //   222: putfield DyG : D
    //   225: aload_0
    //   226: iconst_1
    //   227: putfield FWm : Z
    //   230: aload_0
    //   231: getfield Dne : Lnet/minecraft/client/Minecraft;
    //   234: aconst_null
    //   235: checkcast qVZ
    //   238: invokevirtual Dne : (LqVZ;)V
    //   241: return
  }
  
  public void Dne(Krr paramKrr) {
    this.Dne.Dne.f_();
  }
  
  private sMa Dne(int paramInt) {
    // Byte code:
    //   0: iload_1
    //   1: aload_0
    //   2: getfield Dne : Lnet/minecraft/client/Minecraft;
    //   5: getfield Dne : LMJs;
    //   8: getfield aFZ : I
    //   11: if_icmpne -> 24
    //   14: aload_0
    //   15: getfield Dne : Lnet/minecraft/client/Minecraft;
    //   18: getfield Dne : LMJs;
    //   21: goto -> 32
    //   24: aload_0
    //   25: getfield Dne : LVzZ;
    //   28: iload_1
    //   29: invokevirtual Dne : (I)LsMa;
    //   32: areturn
  }
  
  public void Dne(bEj parambEj) {
    this.Dne.Dne.aFZ(parambEj.FWm(), parambEj.bzF(), parambEj.Qnq(), parambEj.zGp(), parambEj.DyG());
  }
  
  public void bzF() {
    // Byte code:
    //   0: aload_0
    //   1: iconst_1
    //   2: putfield Dne : Z
    //   5: aload_0
    //   6: getfield Dne : LRXf;
    //   9: invokeinterface Dne : ()V
    //   14: aload_0
    //   15: getfield Dne : LRXf;
    //   18: ldc_w 'disconnect.closed'
    //   21: iconst_0
    //   22: anewarray java/lang/Object
    //   25: invokeinterface Dne : (Ljava/lang/String;[Ljava/lang/Object;)V
    //   30: return
  }
  
  public void Dne(efs paramefs) {
    String[] arrayOfString = paramefs.Dne().split("\000");
    if (this.Dne.Dne instanceof SlE) {
      SlE slE = (SlE)this.Dne.Dne;
      slE.Dne(arrayOfString);
    } 
  }
  
  public void Dne(XsD paramXsD) {
    if (paramXsD.Dne == dEr.Dne.Qnq) {
      mva.Dne(paramXsD.FWm, (Qnq)this.Dne.Dne).Dne(paramXsD.Dne);
    } else {
      this.Dne.Dne().FWm("Unknown itemid: " + paramXsD.FWm);
    } 
  }
  
  public void Dne(zqT paramzqT) {
    this.Dne.Dne.a_(paramzqT.Dne);
    this.Dne.Dne.Dne().Dne(paramzqT.FWm);
    this.Dne.Dne.Dne().FWm(paramzqT.Dne);
  }
  
  public void Dne(Pwq paramPwq) {
    // Byte code:
    //   0: aload_0
    //   1: getfield Dne : Lnet/minecraft/client/Minecraft;
    //   4: getfield Dne : LMJs;
    //   7: astore_2
    //   8: aload_1
    //   9: getfield Dne : I
    //   12: ifne -> 29
    //   15: aload_2
    //   16: getfield Dne : LPdb;
    //   19: aload_1
    //   20: getfield Dne : [LNMq;
    //   23: invokevirtual Dne : ([LNMq;)V
    //   26: goto -> 54
    //   29: aload_1
    //   30: getfield Dne : I
    //   33: aload_2
    //   34: getfield FWm : LPdb;
    //   37: getfield Dne : I
    //   40: if_icmpne -> 54
    //   43: aload_2
    //   44: getfield FWm : LPdb;
    //   47: aload_1
    //   48: getfield Dne : [LNMq;
    //   51: invokevirtual Dne : ([LNMq;)V
    //   54: return
  }
  
  public void Dne(fPl paramfPl) {
    // Byte code:
    //   0: aload_0
    //   1: getfield Dne : Ljava/util/Map;
    //   4: aload_1
    //   5: getfield Dne : Ljava/lang/String;
    //   8: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   13: checkcast aCn
    //   16: astore_2
    //   17: aload_2
    //   18: ifnonnull -> 66
    //   21: aload_1
    //   22: getfield Dne : Z
    //   25: ifeq -> 66
    //   28: new aCn
    //   31: dup
    //   32: aload_1
    //   33: getfield Dne : Ljava/lang/String;
    //   36: invokespecial <init> : (Ljava/lang/String;)V
    //   39: astore_2
    //   40: aload_0
    //   41: getfield Dne : Ljava/util/Map;
    //   44: aload_1
    //   45: getfield Dne : Ljava/lang/String;
    //   48: aload_2
    //   49: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   54: pop
    //   55: aload_0
    //   56: getfield Dne : Ljava/util/List;
    //   59: aload_2
    //   60: invokeinterface add : (Ljava/lang/Object;)Z
    //   65: pop
    //   66: aload_2
    //   67: ifnull -> 102
    //   70: aload_1
    //   71: getfield Dne : Z
    //   74: ifne -> 102
    //   77: aload_0
    //   78: getfield Dne : Ljava/util/Map;
    //   81: aload_1
    //   82: getfield Dne : Ljava/lang/String;
    //   85: invokeinterface remove : (Ljava/lang/Object;)Ljava/lang/Object;
    //   90: pop
    //   91: aload_0
    //   92: getfield Dne : Ljava/util/List;
    //   95: aload_2
    //   96: invokeinterface remove : (Ljava/lang/Object;)Z
    //   101: pop
    //   102: aload_1
    //   103: getfield Dne : Z
    //   106: ifeq -> 121
    //   109: aload_2
    //   110: ifnull -> 121
    //   113: aload_2
    //   114: aload_1
    //   115: getfield Dne : I
    //   118: putfield Dne : I
    //   121: return
  }
  
  public void Dne(ipQ paramipQ) {
    if (this.Dne.Dne.bzF(paramipQ.Dne, paramipQ.FWm, paramipQ.bzF)) {
      ipD ipD = this.Dne.Dne.Dne(paramipQ.Dne, paramipQ.FWm, paramipQ.bzF);
      if (ipD != null)
        if (paramipQ.Qnq == 1 && ipD instanceof ySb) {
          ipD.Dne(paramipQ.Dne);
        } else if (paramipQ.Qnq == 2 && ipD instanceof FgE) {
          ipD.Dne(paramipQ.Dne);
        } else if (paramipQ.Qnq == 3 && ipD instanceof TpA) {
          ipD.Dne(paramipQ.Dne);
        } else if (paramipQ.Qnq == 4 && ipD instanceof CUf) {
          ipD.Dne(paramipQ.Dne);
        }  
    } 
  }
  
  public void Dne(VJn paramVJn) {
    this.Dne.Dne.Qnq(paramVJn.Dne, paramVJn.FWm, paramVJn.bzF, paramVJn.zGp, paramVJn.Qnq, paramVJn.aFZ);
  }
  
  public void Dne(iET paramiET) {
    sMa sMa = Dne(paramiET.Dne);
    if (sMa != null) {
      sMa.Zpi += paramiET.Dne;
      sMa.kGO += paramiET.FWm;
      sMa.udO += paramiET.bzF;
      double d1 = sMa.Zpi / 32.0D;
      double d2 = sMa.kGO / 32.0D;
      double d3 = sMa.udO / 32.0D;
      float f1 = (paramiET.Dne != 0) ? ((paramiET.Qnq * 360) / 256.0F) : sMa.mrb;
      float f2 = (paramiET.Dne != 0) ? ((paramiET.aFZ * 360) / 256.0F) : sMa.XHL;
      sMa.Dne(d1, d2, d3, f1, f2, 3);
    } 
  }
  
  public fzy(Minecraft paramMinecraft, String paramString, int paramInt, qVZ paramqVZ) {
    this.Dne = new LLx((iDE)null);
    this.Dne = new HashMap<>();
    this.Dne = new ArrayList();
    this.Dne = true;
    this.Dne = null;
    this.Dne = new Random();
    this.Dne = paramMinecraft;
    this.Dne = paramqVZ;
    Socket socket = new Socket(InetAddress.getByName(paramString), paramInt);
    this.Dne = new Qyp(paramMinecraft.Dne(), socket, "Client", this);
  }
  
  public void Dne(XGq paramXGq) {
    lqs lqs;
    UTs uTs;
    zio zio;
    TpA tpA;
    Aem aem;
    BDA bDA;
    vwN vwN = this.Dne.Dne;
    switch (paramXGq.FWm) {
      case 0:
        vwN.Dne(new pam(paramXGq.Dne, paramXGq.Dne, paramXGq.bzF));
        ((MJs)vwN).FWm.Dne = paramXGq.Dne;
        break;
      case 1:
        vwN.Dne(geR.FWm(((MJs)vwN).div), geR.FWm(((MJs)vwN).IjH), geR.FWm(((MJs)vwN).mrb));
        ((MJs)vwN).FWm.Dne = paramXGq.Dne;
        break;
      case 2:
        lqs = new lqs();
        if (paramXGq.Dne)
          lqs.Dne(paramXGq.Dne); 
        vwN.Dne(lqs);
        ((MJs)vwN).FWm.Dne = paramXGq.Dne;
        break;
      case 3:
        uTs = new UTs();
        if (paramXGq.Dne)
          uTs.Dne(paramXGq.Dne); 
        vwN.Dne(uTs);
        ((MJs)vwN).FWm.Dne = paramXGq.Dne;
        break;
      case 4:
        vwN.Dne(geR.FWm(((MJs)vwN).div), geR.FWm(((MJs)vwN).IjH), geR.FWm(((MJs)vwN).mrb), paramXGq.Dne ? paramXGq.Dne : null);
        ((MJs)vwN).FWm.Dne = paramXGq.Dne;
        break;
      case 5:
        zio = new zio();
        if (paramXGq.Dne)
          zio.Dne(paramXGq.Dne); 
        vwN.Dne(zio);
        ((MJs)vwN).FWm.Dne = paramXGq.Dne;
        break;
      case 6:
        vwN.Dne(new AXe((FiG)vwN), paramXGq.Dne ? paramXGq.Dne : null);
        ((MJs)vwN).FWm.Dne = paramXGq.Dne;
        break;
      case 7:
        tpA = new TpA();
        vwN.Dne(tpA);
        if (paramXGq.Dne)
          tpA.Dne(paramXGq.Dne); 
        ((MJs)vwN).FWm.Dne = paramXGq.Dne;
        break;
      case 8:
        vwN.FWm(geR.FWm(((MJs)vwN).div), geR.FWm(((MJs)vwN).IjH), geR.FWm(((MJs)vwN).mrb));
        ((MJs)vwN).FWm.Dne = paramXGq.Dne;
        break;
      case 9:
        aem = new Aem();
        if (paramXGq.Dne)
          aem.Dne(paramXGq.Dne); 
        vwN.Dne(aem);
        ((MJs)vwN).FWm.Dne = paramXGq.Dne;
        break;
      case 10:
        bDA = new BDA();
        if (paramXGq.Dne)
          bDA.Dne(paramXGq.Dne); 
        vwN.Dne(bDA);
        ((MJs)vwN).FWm.Dne = paramXGq.Dne;
        break;
    } 
  }
  
  public void Dne(Phv paramPhv) {
    FWm(new Phv(paramPhv.Dne));
  }
  
  public void Dne(bia parambia) {
    // Byte code:
    //   0: new JCd
    //   3: dup
    //   4: aload_0
    //   5: getfield Dne : LVzZ;
    //   8: aload_1
    //   9: getfield FWm : I
    //   12: aload_1
    //   13: getfield bzF : I
    //   16: aload_1
    //   17: getfield Qnq : I
    //   20: aload_1
    //   21: getfield aFZ : I
    //   24: aload_1
    //   25: getfield Dne : Ljava/lang/String;
    //   28: invokespecial <init> : (LQnq;IIIILjava/lang/String;)V
    //   31: astore_2
    //   32: aload_0
    //   33: getfield Dne : LVzZ;
    //   36: aload_1
    //   37: getfield Dne : I
    //   40: aload_2
    //   41: invokevirtual Dne : (ILsMa;)V
    //   44: return
  }
  
  public void Dne(cSs paramcSs) {
    // Byte code:
    //   0: aload_0
    //   1: getfield Dne : LVzZ;
    //   4: aload_1
    //   5: getfield Dne : I
    //   8: aload_1
    //   9: getfield FWm : I
    //   12: aload_1
    //   13: getfield bzF : I
    //   16: aload_1
    //   17: getfield Qnq : I
    //   20: aload_1
    //   21: getfield aFZ : I
    //   24: invokevirtual FWm : (IIIII)Z
    //   27: pop
    //   28: return
  }
  
  public void Dne(iQd paramiQd) {
    // Byte code:
    //   0: aload_0
    //   1: getfield Dne : LVzZ;
    //   4: invokevirtual Dne : ()LSFA;
    //   7: astore_2
    //   8: aload_1
    //   9: getfield Dne : I
    //   12: ifne -> 38
    //   15: aload_2
    //   16: aload_1
    //   17: getfield Dne : Ljava/lang/String;
    //   20: getstatic PAf.Dne : LPAf;
    //   23: invokevirtual Dne : (Ljava/lang/String;LPAf;)LvfE;
    //   26: astore_3
    //   27: aload_3
    //   28: aload_1
    //   29: getfield FWm : Ljava/lang/String;
    //   32: invokevirtual Dne : (Ljava/lang/String;)V
    //   35: goto -> 79
    //   38: aload_2
    //   39: aload_1
    //   40: getfield Dne : Ljava/lang/String;
    //   43: invokevirtual Dne : (Ljava/lang/String;)LvfE;
    //   46: astore_3
    //   47: aload_1
    //   48: getfield Dne : I
    //   51: iconst_1
    //   52: if_icmpne -> 63
    //   55: aload_2
    //   56: aload_3
    //   57: invokevirtual Dne : (LvfE;)V
    //   60: goto -> 79
    //   63: aload_1
    //   64: getfield Dne : I
    //   67: iconst_2
    //   68: if_icmpne -> 79
    //   71: aload_3
    //   72: aload_1
    //   73: getfield FWm : Ljava/lang/String;
    //   76: invokevirtual Dne : (Ljava/lang/String;)V
    //   79: return
  }
  
  public void Dne(VPw paramVPw) {
    this.Dne.Dne = (vwN)new RJV(this.Dne, this);
    this.Dne.Dne.Dne((RLC)trP.Qnq, 1);
    this.Dne = new VzZ(this, new mrb(0L, paramVPw.Dne, false, paramVPw.Dne, paramVPw.Dne), paramVPw.FWm, paramVPw.Dne, (Bkx)this.Dne.Dne, this.Dne.Dne());
    this.Dne.aFZ = true;
    this.Dne.Dne(this.Dne);
    ((MJs)this.Dne.Dne).qLR = paramVPw.FWm;
    this.Dne.Dne(new bcj(this));
    ((MJs)this.Dne.Dne).aFZ = paramVPw.Dne;
    this.Dne = paramVPw.bzF;
    this.Dne.Dne.Dne(paramVPw.Dne);
    this.Dne.Dne.bzF();
  }
  
  public void Dne(yZV paramyZV) {
    // Byte code:
    //   0: aload_0
    //   1: getfield Dne : LRXf;
    //   4: ldc_w 'disconnect.kicked'
    //   7: iconst_0
    //   8: anewarray java/lang/Object
    //   11: invokeinterface Dne : (Ljava/lang/String;[Ljava/lang/Object;)V
    //   16: aload_0
    //   17: iconst_1
    //   18: putfield Dne : Z
    //   21: aload_0
    //   22: getfield Dne : Lnet/minecraft/client/Minecraft;
    //   25: aconst_null
    //   26: checkcast VzZ
    //   29: invokevirtual Dne : (LVzZ;)V
    //   32: aload_0
    //   33: getfield Dne : LqVZ;
    //   36: ifnull -> 77
    //   39: aload_0
    //   40: getfield Dne : Lnet/minecraft/client/Minecraft;
    //   43: new rNz
    //   46: dup
    //   47: aload_0
    //   48: getfield Dne : LqVZ;
    //   51: ldc_w 'disconnect.disconnected'
    //   54: ldc_w 'disconnect.genericReason'
    //   57: iconst_1
    //   58: anewarray java/lang/Object
    //   61: dup
    //   62: iconst_0
    //   63: aload_1
    //   64: getfield Dne : Ljava/lang/String;
    //   67: aastore
    //   68: invokespecial <init> : (LqVZ;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   71: invokevirtual Dne : (LqVZ;)V
    //   74: goto -> 122
    //   77: aload_0
    //   78: getfield Dne : Lnet/minecraft/client/Minecraft;
    //   81: new fZp
    //   84: dup
    //   85: new KDD
    //   88: dup
    //   89: new MKS
    //   92: dup
    //   93: invokespecial <init> : ()V
    //   96: invokespecial <init> : (LqVZ;)V
    //   99: ldc_w 'disconnect.disconnected'
    //   102: ldc_w 'disconnect.genericReason'
    //   105: iconst_1
    //   106: anewarray java/lang/Object
    //   109: dup
    //   110: iconst_0
    //   111: aload_1
    //   112: getfield Dne : Ljava/lang/String;
    //   115: aastore
    //   116: invokespecial <init> : (LqVZ;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   119: invokevirtual Dne : (LqVZ;)V
    //   122: return
  }
  
  public void Dne(YLL paramYLL) {
    // Byte code:
    //   0: iconst_0
    //   1: istore_2
    //   2: iload_2
    //   3: aload_1
    //   4: invokevirtual FWm : ()I
    //   7: if_icmpge -> 142
    //   10: aload_0
    //   11: getfield Dne : Ljava/util/Random;
    //   14: invokevirtual nextGaussian : ()D
    //   17: aload_1
    //   18: invokevirtual Dne : ()F
    //   21: f2d
    //   22: dmul
    //   23: dstore_3
    //   24: aload_0
    //   25: getfield Dne : Ljava/util/Random;
    //   28: invokevirtual nextGaussian : ()D
    //   31: aload_1
    //   32: invokevirtual FWm : ()F
    //   35: f2d
    //   36: dmul
    //   37: dstore #5
    //   39: aload_0
    //   40: getfield Dne : Ljava/util/Random;
    //   43: invokevirtual nextGaussian : ()D
    //   46: aload_1
    //   47: invokevirtual bzF : ()F
    //   50: f2d
    //   51: dmul
    //   52: dstore #7
    //   54: aload_0
    //   55: getfield Dne : Ljava/util/Random;
    //   58: invokevirtual nextGaussian : ()D
    //   61: aload_1
    //   62: invokevirtual Qnq : ()F
    //   65: f2d
    //   66: dmul
    //   67: dstore #9
    //   69: aload_0
    //   70: getfield Dne : Ljava/util/Random;
    //   73: invokevirtual nextGaussian : ()D
    //   76: aload_1
    //   77: invokevirtual Qnq : ()F
    //   80: f2d
    //   81: dmul
    //   82: dstore #11
    //   84: aload_0
    //   85: getfield Dne : Ljava/util/Random;
    //   88: invokevirtual nextGaussian : ()D
    //   91: aload_1
    //   92: invokevirtual Qnq : ()F
    //   95: f2d
    //   96: dmul
    //   97: dstore #13
    //   99: aload_0
    //   100: getfield Dne : LVzZ;
    //   103: aload_1
    //   104: invokevirtual Dne : ()Ljava/lang/String;
    //   107: aload_1
    //   108: invokevirtual Dne : ()D
    //   111: dload_3
    //   112: dadd
    //   113: aload_1
    //   114: invokevirtual FWm : ()D
    //   117: dload #5
    //   119: dadd
    //   120: aload_1
    //   121: invokevirtual bzF : ()D
    //   124: dload #7
    //   126: dadd
    //   127: dload #9
    //   129: dload #11
    //   131: dload #13
    //   133: invokevirtual Dne : (Ljava/lang/String;DDDDDD)V
    //   136: iinc #2, 1
    //   139: goto -> 2
    //   142: return
  }
  
  public void Dne(pSe parampSe) {
    vwN vwN = this.Dne.Dne;
    ((uqg)((MJs)vwN).Dne).FWm = parampSe.Qnq();
    ((uqg)((MJs)vwN).Dne).Qnq = parampSe.zGp();
    ((uqg)((MJs)vwN).Dne).Dne = parampSe.bzF();
    ((uqg)((MJs)vwN).Dne).bzF = parampSe.aFZ();
    ((MJs)vwN).Dne.Dne(parampSe.Dne());
    ((MJs)vwN).Dne.FWm(parampSe.FWm());
  }
  
  public void Dne(UdA paramUdA) {
    yTR yTR = new yTR((Qnq)this.Dne.Dne, (sMa)null, paramUdA.Dne, paramUdA.FWm, paramUdA.bzF, paramUdA.Dne);
    yTR.Dne = paramUdA.Dne;
    yTR.Dne(true);
    ((MJs)this.Dne.Dne).XHL += paramUdA.Dne();
    ((MJs)this.Dne.Dne).Zpi += paramUdA.FWm();
    ((MJs)this.Dne.Dne).kGO += paramUdA.bzF();
  }
  
  public void Dne(Ylf paramYlf) {
    // Byte code:
    //   0: aload_1
    //   1: getfield Dne : I
    //   4: bipush #16
    //   6: imul
    //   7: istore_2
    //   8: aload_1
    //   9: getfield FWm : I
    //   12: bipush #16
    //   14: imul
    //   15: istore_3
    //   16: aload_1
    //   17: getfield Dne : [B
    //   20: ifnull -> 147
    //   23: new java/io/DataInputStream
    //   26: dup
    //   27: new java/io/ByteArrayInputStream
    //   30: dup
    //   31: aload_1
    //   32: getfield Dne : [B
    //   35: invokespecial <init> : ([B)V
    //   38: invokespecial <init> : (Ljava/io/InputStream;)V
    //   41: astore #4
    //   43: iconst_0
    //   44: istore #5
    //   46: iload #5
    //   48: aload_1
    //   49: getfield bzF : I
    //   52: if_icmpge -> 142
    //   55: aload #4
    //   57: invokevirtual readShort : ()S
    //   60: istore #6
    //   62: aload #4
    //   64: invokevirtual readShort : ()S
    //   67: istore #7
    //   69: iload #7
    //   71: iconst_4
    //   72: ishr
    //   73: sipush #4095
    //   76: iand
    //   77: istore #8
    //   79: iload #7
    //   81: bipush #15
    //   83: iand
    //   84: istore #9
    //   86: iload #6
    //   88: bipush #12
    //   90: ishr
    //   91: bipush #15
    //   93: iand
    //   94: istore #10
    //   96: iload #6
    //   98: bipush #8
    //   100: ishr
    //   101: bipush #15
    //   103: iand
    //   104: istore #11
    //   106: iload #6
    //   108: sipush #255
    //   111: iand
    //   112: istore #12
    //   114: aload_0
    //   115: getfield Dne : LVzZ;
    //   118: iload #10
    //   120: iload_2
    //   121: iadd
    //   122: iload #12
    //   124: iload #11
    //   126: iload_3
    //   127: iadd
    //   128: iload #8
    //   130: iload #9
    //   132: invokevirtual FWm : (IIIII)Z
    //   135: pop
    //   136: iinc #5, 1
    //   139: goto -> 46
    //   142: goto -> 147
    //   145: astore #5
    //   147: return
    // Exception table:
    //   from	to	target	type
    //   43	142	145	java/io/IOException
  }
  
  public void Dne(pDZ parampDZ) {
    boolean bool;
    fzy fzy1 = null;
    vwN vwN = this.Dne.Dne;
    if (!parampDZ.Dne) {
      fzy1 = ((MJs)vwN).Dne;
    } else if (parampDZ.Dne == ((MJs)vwN).FWm.Dne) {
      bool = ((MJs)vwN).FWm;
    } 
    if (bool != null && !parampDZ.Dne)
      FWm(new pDZ(parampDZ.Dne, parampDZ.Dne, true)); 
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\fzy.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */