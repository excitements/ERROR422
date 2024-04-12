import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import net.minecraft.client.Minecraft;
import org.lwjgl.opengl.GL11;

public class wiU extends Sss {
  private TpA Dne;
  
  private UwI Dne;
  
  private boolean Qnq;
  
  protected void Dne(Pee paramPee) {
    if (paramPee.aFZ == -2) {
      this.Dne.Dne((qVZ)null);
    } else if (paramPee.aFZ == -1) {
      String str = "MC|Beacon";
      ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
      DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
      try {
        dataOutputStream.writeInt(this.Dne.Dne());
        dataOutputStream.writeInt(this.Dne.FWm());
        this.Dne.Dne().FWm(new FaB(str, byteArrayOutputStream.toByteArray()));
      } catch (Exception exception) {
        exception.printStackTrace();
      } 
      this.Dne.Dne((qVZ)null);
    } else if (paramPee instanceof cES) {
      if (((cES)paramPee).FWm())
        return; 
      int i = paramPee.aFZ;
      int j = i & 0xFF;
      int k = i >> 8;
      if (k < 3) {
        this.Dne.FWm(j);
      } else {
        this.Dne.bzF(j);
      } 
      this.Dne.clear();
      Dne();
      bzF();
    } 
  }
  
  protected void Dne(float paramFloat, int paramInt1, int paramInt2) {
    GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
    ((Minecraft)this.Dne).Dne.Dne("/gui/beacon.png");
    int i = (this.FWm - this.Dne) / 2;
    int j = (this.bzF - this.Qnq) / 2;
    FWm(i, j, 0, 0, this.Dne, this.Qnq);
    ((eKj)Dne).bzF = 100.0F;
    Dne.FWm((msA)this.Dne, ((Minecraft)this.Dne).Dne, new NMq(dEr.Kvh), i + 42, j + 109);
    Dne.FWm((msA)this.Dne, ((Minecraft)this.Dne).Dne, new NMq(dEr.div), i + 42 + 22, j + 109);
    Dne.FWm((msA)this.Dne, ((Minecraft)this.Dne).Dne, new NMq(dEr.mrb), i + 42 + 44, j + 109);
    Dne.FWm((msA)this.Dne, ((Minecraft)this.Dne).Dne, new NMq(dEr.IjH), i + 42 + 66, j + 109);
    ((eKj)Dne).bzF = 0.0F;
  }
  
  public void Dne() {
    super.Dne();
    this.Dne.add(this.Dne = new UwI(this, -1, this.aFZ + 164, this.zGp + 107));
    this.Dne.add(new Uwk(this, -2, this.aFZ + 190, this.zGp + 107));
    this.Qnq = true;
    this.Dne.Dne = false;
  }
  
  protected void Dne(int paramInt1, int paramInt2) {
    Cit.Dne();
    Dne((msA)this.Dne, KGL.Dne("tile.beacon.primary"), 62, 10, 14737632);
    Dne((msA)this.Dne, KGL.Dne("tile.beacon.secondary"), 169, 10, 14737632);
    for (Pee pee : this.Dne) {
      if (pee.Dne()) {
        pee.FWm(paramInt1 - this.aFZ, paramInt2 - this.zGp);
        break;
      } 
    } 
    Cit.bzF();
  }
  
  public void bzF() {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial bzF : ()V
    //   4: aload_0
    //   5: getfield Qnq : Z
    //   8: ifeq -> 461
    //   11: aload_0
    //   12: getfield Dne : LTpA;
    //   15: invokevirtual bzF : ()I
    //   18: iflt -> 461
    //   21: aload_0
    //   22: iconst_0
    //   23: putfield Qnq : Z
    //   26: iconst_0
    //   27: istore #6
    //   29: iload #6
    //   31: iconst_2
    //   32: if_icmpgt -> 188
    //   35: getstatic TpA.Dne : [[LSXd;
    //   38: iload #6
    //   40: aaload
    //   41: arraylength
    //   42: istore_1
    //   43: iload_1
    //   44: bipush #22
    //   46: imul
    //   47: iload_1
    //   48: iconst_1
    //   49: isub
    //   50: iconst_2
    //   51: imul
    //   52: iadd
    //   53: istore_2
    //   54: iconst_0
    //   55: istore_3
    //   56: iload_3
    //   57: iload_1
    //   58: if_icmpge -> 182
    //   61: getstatic TpA.Dne : [[LSXd;
    //   64: iload #6
    //   66: aaload
    //   67: iload_3
    //   68: aaload
    //   69: getfield Dne : I
    //   72: istore #4
    //   74: new cES
    //   77: dup
    //   78: aload_0
    //   79: iload #6
    //   81: bipush #8
    //   83: ishl
    //   84: iload #4
    //   86: ior
    //   87: aload_0
    //   88: getfield aFZ : I
    //   91: bipush #76
    //   93: iadd
    //   94: iload_3
    //   95: bipush #24
    //   97: imul
    //   98: iadd
    //   99: iload_2
    //   100: iconst_2
    //   101: idiv
    //   102: isub
    //   103: aload_0
    //   104: getfield zGp : I
    //   107: bipush #22
    //   109: iadd
    //   110: iload #6
    //   112: bipush #25
    //   114: imul
    //   115: iadd
    //   116: iload #4
    //   118: iload #6
    //   120: invokespecial <init> : (LwiU;IIIII)V
    //   123: astore #5
    //   125: aload_0
    //   126: getfield Dne : Ljava/util/List;
    //   129: aload #5
    //   131: invokeinterface add : (Ljava/lang/Object;)Z
    //   136: pop
    //   137: iload #6
    //   139: aload_0
    //   140: getfield Dne : LTpA;
    //   143: invokevirtual bzF : ()I
    //   146: if_icmplt -> 158
    //   149: aload #5
    //   151: iconst_0
    //   152: putfield Dne : Z
    //   155: goto -> 176
    //   158: iload #4
    //   160: aload_0
    //   161: getfield Dne : LTpA;
    //   164: invokevirtual Dne : ()I
    //   167: if_icmpne -> 176
    //   170: aload #5
    //   172: iconst_1
    //   173: invokevirtual Dne : (Z)V
    //   176: iinc #3, 1
    //   179: goto -> 56
    //   182: iinc #6, 1
    //   185: goto -> 29
    //   188: iconst_3
    //   189: istore #6
    //   191: getstatic TpA.Dne : [[LSXd;
    //   194: iload #6
    //   196: aaload
    //   197: arraylength
    //   198: iconst_1
    //   199: iadd
    //   200: istore_1
    //   201: iload_1
    //   202: bipush #22
    //   204: imul
    //   205: iload_1
    //   206: iconst_1
    //   207: isub
    //   208: iconst_2
    //   209: imul
    //   210: iadd
    //   211: istore_2
    //   212: iconst_0
    //   213: istore_3
    //   214: iload_3
    //   215: iload_1
    //   216: iconst_1
    //   217: isub
    //   218: if_icmpge -> 337
    //   221: getstatic TpA.Dne : [[LSXd;
    //   224: iload #6
    //   226: aaload
    //   227: iload_3
    //   228: aaload
    //   229: getfield Dne : I
    //   232: istore #4
    //   234: new cES
    //   237: dup
    //   238: aload_0
    //   239: iload #6
    //   241: bipush #8
    //   243: ishl
    //   244: iload #4
    //   246: ior
    //   247: aload_0
    //   248: getfield aFZ : I
    //   251: sipush #167
    //   254: iadd
    //   255: iload_3
    //   256: bipush #24
    //   258: imul
    //   259: iadd
    //   260: iload_2
    //   261: iconst_2
    //   262: idiv
    //   263: isub
    //   264: aload_0
    //   265: getfield zGp : I
    //   268: bipush #47
    //   270: iadd
    //   271: iload #4
    //   273: iload #6
    //   275: invokespecial <init> : (LwiU;IIIII)V
    //   278: astore #5
    //   280: aload_0
    //   281: getfield Dne : Ljava/util/List;
    //   284: aload #5
    //   286: invokeinterface add : (Ljava/lang/Object;)Z
    //   291: pop
    //   292: iload #6
    //   294: aload_0
    //   295: getfield Dne : LTpA;
    //   298: invokevirtual bzF : ()I
    //   301: if_icmplt -> 313
    //   304: aload #5
    //   306: iconst_0
    //   307: putfield Dne : Z
    //   310: goto -> 331
    //   313: iload #4
    //   315: aload_0
    //   316: getfield Dne : LTpA;
    //   319: invokevirtual FWm : ()I
    //   322: if_icmpne -> 331
    //   325: aload #5
    //   327: iconst_1
    //   328: invokevirtual Dne : (Z)V
    //   331: iinc #3, 1
    //   334: goto -> 214
    //   337: aload_0
    //   338: getfield Dne : LTpA;
    //   341: invokevirtual Dne : ()I
    //   344: ifle -> 461
    //   347: new cES
    //   350: dup
    //   351: aload_0
    //   352: iload #6
    //   354: bipush #8
    //   356: ishl
    //   357: aload_0
    //   358: getfield Dne : LTpA;
    //   361: invokevirtual Dne : ()I
    //   364: ior
    //   365: aload_0
    //   366: getfield aFZ : I
    //   369: sipush #167
    //   372: iadd
    //   373: iload_1
    //   374: iconst_1
    //   375: isub
    //   376: bipush #24
    //   378: imul
    //   379: iadd
    //   380: iload_2
    //   381: iconst_2
    //   382: idiv
    //   383: isub
    //   384: aload_0
    //   385: getfield zGp : I
    //   388: bipush #47
    //   390: iadd
    //   391: aload_0
    //   392: getfield Dne : LTpA;
    //   395: invokevirtual Dne : ()I
    //   398: iload #6
    //   400: invokespecial <init> : (LwiU;IIIII)V
    //   403: astore #7
    //   405: aload_0
    //   406: getfield Dne : Ljava/util/List;
    //   409: aload #7
    //   411: invokeinterface add : (Ljava/lang/Object;)Z
    //   416: pop
    //   417: iload #6
    //   419: aload_0
    //   420: getfield Dne : LTpA;
    //   423: invokevirtual bzF : ()I
    //   426: if_icmplt -> 438
    //   429: aload #7
    //   431: iconst_0
    //   432: putfield Dne : Z
    //   435: goto -> 461
    //   438: aload_0
    //   439: getfield Dne : LTpA;
    //   442: invokevirtual Dne : ()I
    //   445: aload_0
    //   446: getfield Dne : LTpA;
    //   449: invokevirtual FWm : ()I
    //   452: if_icmpne -> 461
    //   455: aload #7
    //   457: iconst_1
    //   458: invokevirtual Dne : (Z)V
    //   461: aload_0
    //   462: getfield Dne : LUwI;
    //   465: aload_0
    //   466: getfield Dne : LTpA;
    //   469: iconst_0
    //   470: invokevirtual Dne : (I)LNMq;
    //   473: ifnull -> 490
    //   476: aload_0
    //   477: getfield Dne : LTpA;
    //   480: invokevirtual Dne : ()I
    //   483: ifle -> 490
    //   486: iconst_1
    //   487: goto -> 491
    //   490: iconst_0
    //   491: putfield Dne : Z
    //   494: return
  }
  
  public wiU(MOS paramMOS, TpA paramTpA) {
    super(new eSp(paramMOS, paramTpA));
    this.Dne = (UwI)paramTpA;
    this.Dne = 'æ';
    this.Qnq = true;
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\wiU.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */