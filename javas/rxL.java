import java.util.List;
import org.lwjgl.opengl.GL11;

public class rxL {
  public final String Dne;
  
  private int Dne;
  
  public boolean FWm;
  
  public boolean bzF;
  
  public List FWm;
  
  public float FWm;
  
  public float div;
  
  public float aFZ;
  
  public float Qnq;
  
  public float IjH;
  
  public float XHL;
  
  public float mrb;
  
  public boolean Dne;
  
  public float Dne;
  
  private boolean Qnq;
  
  public float zGp;
  
  private int bzF;
  
  public float bzF;
  
  private int FWm;
  
  public float DyG;
  
  public List Dne;
  
  private Gor Dne;
  
  public rxL(Gor paramGor, int paramInt1, int paramInt2) {
    this(paramGor);
    Dne(paramInt1, paramInt2);
  }
  
  public void Dne(float paramFloat1, float paramFloat2, float paramFloat3) {
    this.bzF = paramFloat1;
    this.Qnq = paramFloat2;
    this.aFZ = paramFloat3;
  }
  
  public void Dne(rxL paramrxL) {
    // Byte code:
    //   0: aload_0
    //   1: getfield FWm : Ljava/util/List;
    //   4: ifnonnull -> 18
    //   7: aload_0
    //   8: new java/util/ArrayList
    //   11: dup
    //   12: invokespecial <init> : ()V
    //   15: putfield FWm : Ljava/util/List;
    //   18: aload_0
    //   19: getfield FWm : Ljava/util/List;
    //   22: aload_1
    //   23: invokeinterface add : (Ljava/lang/Object;)Z
    //   28: pop
    //   29: return
  }
  
  public rxL Dne(String paramString, float paramFloat1, float paramFloat2, float paramFloat3, int paramInt1, int paramInt2, int paramInt3) {
    paramString = this.Dne + "." + paramString;
    EZg eZg = this.Dne.Dne(paramString);
    Dne(eZg.Dne, eZg.FWm);
    this.Dne.add((new UgT(this, this.Dne, this.FWm, paramFloat1, paramFloat2, paramFloat3, paramInt1, paramInt2, paramInt3, 0.0F)).Dne(paramString));
    return this;
  }
  
  public rxL(Gor paramGor) {
    this(paramGor, (String)null);
  }
  
  public void bzF(float paramFloat) {
    if (this.bzF == 0.0F && this.FWm != 0) {
      if (!this.Qnq)
        Qnq(paramFloat); 
      if (this.zGp == 0.0F && this.DyG == 0.0F && this.div == 0.0F) {
        if (this.bzF != 0.0F || this.Qnq != 0.0F || this.aFZ != 0.0F)
          GL11.glTranslatef(this.bzF * paramFloat, this.Qnq * paramFloat, this.aFZ * paramFloat); 
      } else {
        GL11.glTranslatef(this.bzF * paramFloat, this.Qnq * paramFloat, this.aFZ * paramFloat);
        if (this.div != 0.0F)
          GL11.glRotatef(this.div * 57.295776F, 0.0F, 0.0F, 1.0F); 
        if (this.DyG != 0.0F)
          GL11.glRotatef(this.DyG * 57.295776F, 0.0F, 1.0F, 0.0F); 
        if (this.zGp != 0.0F)
          GL11.glRotatef(this.zGp * 57.295776F, 1.0F, 0.0F, 0.0F); 
      } 
    } 
  }
  
  public rxL FWm(int paramInt1, int paramInt2) {
    this.Dne = paramInt1;
    this.FWm = paramInt2;
    return this;
  }
  
  public rxL Dne(float paramFloat1, float paramFloat2, float paramFloat3, int paramInt1, int paramInt2, int paramInt3) {
    this.Dne.add(new UgT(this, this.Dne, this.FWm, paramFloat1, paramFloat2, paramFloat3, paramInt1, paramInt2, paramInt3, 0.0F));
    return this;
  }
  
  public rxL(Gor paramGor, String paramString) {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial <init> : ()V
    //   4: aload_0
    //   5: ldc 64.0
    //   7: putfield Dne : F
    //   10: aload_0
    //   11: ldc 32.0
    //   13: putfield FWm : F
    //   16: aload_0
    //   17: iconst_0
    //   18: putfield Qnq : Z
    //   21: aload_0
    //   22: iconst_0
    //   23: putfield bzF : I
    //   26: aload_0
    //   27: iconst_0
    //   28: putfield Dne : Z
    //   31: aload_0
    //   32: iconst_1
    //   33: putfield FWm : Z
    //   36: aload_0
    //   37: iconst_0
    //   38: putfield bzF : Z
    //   41: aload_0
    //   42: new java/util/ArrayList
    //   45: dup
    //   46: invokespecial <init> : ()V
    //   49: putfield Dne : Ljava/util/List;
    //   52: aload_0
    //   53: aload_1
    //   54: putfield Dne : LGor;
    //   57: aload_1
    //   58: getfield Dne : Ljava/util/List;
    //   61: aload_0
    //   62: invokeinterface add : (Ljava/lang/Object;)Z
    //   67: pop
    //   68: aload_0
    //   69: aload_2
    //   70: putfield Dne : Ljava/lang/String;
    //   73: aload_0
    //   74: aload_1
    //   75: getfield bzF : I
    //   78: aload_1
    //   79: getfield Qnq : I
    //   82: invokevirtual FWm : (II)LrxL;
    //   85: pop
    //   86: return
  }
  
  public rxL Dne(int paramInt1, int paramInt2) {
    this.Dne = paramInt1;
    this.FWm = paramInt2;
    return this;
  }
  
  private void Qnq(float paramFloat) {
    this.bzF = pZS.Dne(1);
    GL11.glNewList(this.bzF, 4864);
    boolean bool = WAR.Dne;
    for (byte b = 0; b < this.Dne.size(); b++)
      ((UgT)this.Dne.get(b)).Dne(bool, paramFloat); 
    GL11.glEndList();
    this.Qnq = true;
  }
  
  public void Dne(float paramFloat) {
    // Byte code:
    //   0: aload_0
    //   1: getfield bzF : Z
    //   4: ifne -> 410
    //   7: aload_0
    //   8: getfield FWm : Z
    //   11: ifeq -> 410
    //   14: aload_0
    //   15: getfield Qnq : Z
    //   18: ifne -> 26
    //   21: aload_0
    //   22: fload_1
    //   23: invokespecial Qnq : (F)V
    //   26: aload_0
    //   27: getfield IjH : F
    //   30: aload_0
    //   31: getfield mrb : F
    //   34: aload_0
    //   35: getfield XHL : F
    //   38: invokestatic glTranslatef : (FFF)V
    //   41: aload_0
    //   42: getfield zGp : F
    //   45: fconst_0
    //   46: fcmpl
    //   47: ifne -> 247
    //   50: aload_0
    //   51: getfield DyG : F
    //   54: fconst_0
    //   55: fcmpl
    //   56: ifne -> 247
    //   59: aload_0
    //   60: getfield div : F
    //   63: fconst_0
    //   64: fcmpl
    //   65: ifne -> 247
    //   68: aload_0
    //   69: getfield bzF : F
    //   72: fconst_0
    //   73: fcmpl
    //   74: ifne -> 147
    //   77: aload_0
    //   78: getfield Qnq : F
    //   81: fconst_0
    //   82: fcmpl
    //   83: ifne -> 147
    //   86: aload_0
    //   87: getfield aFZ : F
    //   90: fconst_0
    //   91: fcmpl
    //   92: ifne -> 147
    //   95: aload_0
    //   96: getfield bzF : I
    //   99: invokestatic glCallList : (I)V
    //   102: aload_0
    //   103: getfield FWm : Ljava/util/List;
    //   106: ifnull -> 392
    //   109: iconst_0
    //   110: istore_2
    //   111: iload_2
    //   112: aload_0
    //   113: getfield FWm : Ljava/util/List;
    //   116: invokeinterface size : ()I
    //   121: if_icmpge -> 392
    //   124: aload_0
    //   125: getfield FWm : Ljava/util/List;
    //   128: iload_2
    //   129: invokeinterface get : (I)Ljava/lang/Object;
    //   134: checkcast rxL
    //   137: fload_1
    //   138: invokevirtual Dne : (F)V
    //   141: iinc #2, 1
    //   144: goto -> 111
    //   147: aload_0
    //   148: getfield bzF : F
    //   151: fload_1
    //   152: fmul
    //   153: aload_0
    //   154: getfield Qnq : F
    //   157: fload_1
    //   158: fmul
    //   159: aload_0
    //   160: getfield aFZ : F
    //   163: fload_1
    //   164: fmul
    //   165: invokestatic glTranslatef : (FFF)V
    //   168: aload_0
    //   169: getfield bzF : I
    //   172: invokestatic glCallList : (I)V
    //   175: aload_0
    //   176: getfield FWm : Ljava/util/List;
    //   179: ifnull -> 220
    //   182: iconst_0
    //   183: istore_2
    //   184: iload_2
    //   185: aload_0
    //   186: getfield FWm : Ljava/util/List;
    //   189: invokeinterface size : ()I
    //   194: if_icmpge -> 220
    //   197: aload_0
    //   198: getfield FWm : Ljava/util/List;
    //   201: iload_2
    //   202: invokeinterface get : (I)Ljava/lang/Object;
    //   207: checkcast rxL
    //   210: fload_1
    //   211: invokevirtual Dne : (F)V
    //   214: iinc #2, 1
    //   217: goto -> 184
    //   220: aload_0
    //   221: getfield bzF : F
    //   224: fneg
    //   225: fload_1
    //   226: fmul
    //   227: aload_0
    //   228: getfield Qnq : F
    //   231: fneg
    //   232: fload_1
    //   233: fmul
    //   234: aload_0
    //   235: getfield aFZ : F
    //   238: fneg
    //   239: fload_1
    //   240: fmul
    //   241: invokestatic glTranslatef : (FFF)V
    //   244: goto -> 392
    //   247: invokestatic glPushMatrix : ()V
    //   250: aload_0
    //   251: getfield bzF : F
    //   254: fload_1
    //   255: fmul
    //   256: aload_0
    //   257: getfield Qnq : F
    //   260: fload_1
    //   261: fmul
    //   262: aload_0
    //   263: getfield aFZ : F
    //   266: fload_1
    //   267: fmul
    //   268: invokestatic glTranslatef : (FFF)V
    //   271: aload_0
    //   272: getfield div : F
    //   275: fconst_0
    //   276: fcmpl
    //   277: ifeq -> 293
    //   280: aload_0
    //   281: getfield div : F
    //   284: ldc 57.295776
    //   286: fmul
    //   287: fconst_0
    //   288: fconst_0
    //   289: fconst_1
    //   290: invokestatic glRotatef : (FFFF)V
    //   293: aload_0
    //   294: getfield DyG : F
    //   297: fconst_0
    //   298: fcmpl
    //   299: ifeq -> 315
    //   302: aload_0
    //   303: getfield DyG : F
    //   306: ldc 57.295776
    //   308: fmul
    //   309: fconst_0
    //   310: fconst_1
    //   311: fconst_0
    //   312: invokestatic glRotatef : (FFFF)V
    //   315: aload_0
    //   316: getfield zGp : F
    //   319: fconst_0
    //   320: fcmpl
    //   321: ifeq -> 337
    //   324: aload_0
    //   325: getfield zGp : F
    //   328: ldc 57.295776
    //   330: fmul
    //   331: fconst_1
    //   332: fconst_0
    //   333: fconst_0
    //   334: invokestatic glRotatef : (FFFF)V
    //   337: aload_0
    //   338: getfield bzF : I
    //   341: invokestatic glCallList : (I)V
    //   344: aload_0
    //   345: getfield FWm : Ljava/util/List;
    //   348: ifnull -> 389
    //   351: iconst_0
    //   352: istore_2
    //   353: iload_2
    //   354: aload_0
    //   355: getfield FWm : Ljava/util/List;
    //   358: invokeinterface size : ()I
    //   363: if_icmpge -> 389
    //   366: aload_0
    //   367: getfield FWm : Ljava/util/List;
    //   370: iload_2
    //   371: invokeinterface get : (I)Ljava/lang/Object;
    //   376: checkcast rxL
    //   379: fload_1
    //   380: invokevirtual Dne : (F)V
    //   383: iinc #2, 1
    //   386: goto -> 353
    //   389: invokestatic glPopMatrix : ()V
    //   392: aload_0
    //   393: getfield IjH : F
    //   396: fneg
    //   397: aload_0
    //   398: getfield mrb : F
    //   401: fneg
    //   402: aload_0
    //   403: getfield XHL : F
    //   406: fneg
    //   407: invokestatic glTranslatef : (FFF)V
    //   410: return
  }
  
  public void Dne(float paramFloat1, float paramFloat2, float paramFloat3, int paramInt1, int paramInt2, int paramInt3, float paramFloat4) {
    this.Dne.add(new UgT(this, this.Dne, this.FWm, paramFloat1, paramFloat2, paramFloat3, paramInt1, paramInt2, paramInt3, paramFloat4));
  }
  
  public void FWm(float paramFloat) {
    if (this.bzF == 0.0F && this.FWm != 0) {
      if (!this.Qnq)
        Qnq(paramFloat); 
      GL11.glPushMatrix();
      GL11.glTranslatef(this.bzF * paramFloat, this.Qnq * paramFloat, this.aFZ * paramFloat);
      if (this.DyG != 0.0F)
        GL11.glRotatef(this.DyG * 57.295776F, 0.0F, 1.0F, 0.0F); 
      if (this.zGp != 0.0F)
        GL11.glRotatef(this.zGp * 57.295776F, 1.0F, 0.0F, 0.0F); 
      if (this.div != 0.0F)
        GL11.glRotatef(this.div * 57.295776F, 0.0F, 0.0F, 1.0F); 
      GL11.glCallList(this.bzF);
      GL11.glPopMatrix();
    } 
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\rxL.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */