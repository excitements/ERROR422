import java.util.HashMap;
import java.util.Map;
import org.lwjgl.opengl.GL11;

public class ptH {
  public static double Dne;
  
  public double Qnq;
  
  public static ptH Dne = new ptH();
  
  public Snh Dne;
  
  public fZI Dne;
  
  public XyI Dne;
  
  public static double bzF;
  
  public double zGp;
  
  public static double FWm;
  
  public float Dne;
  
  public double aFZ;
  
  public float FWm;
  
  private Map Dne;
  
  public Qnq Dne;
  
  public static boolean Dne = false;
  
  public FUH FWm;
  
  public FUH Dne;
  
  private msA Dne = (msA)new HashMap<>();
  
  public QCe Dne(Class<sMa> paramClass) {
    QCe qCe = (QCe)this.Dne.get(paramClass);
    if (qCe == null && paramClass != sMa.class) {
      qCe = Dne(paramClass.getSuperclass());
      this.Dne.put(paramClass, qCe);
    } 
    return qCe;
  }
  
  public QCe Dne(sMa paramsMa) {
    return Dne(paramsMa.getClass());
  }
  
  public void Dne(sMa paramsMa, double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat1, float paramFloat2) {
    QCe qCe = null;
    try {
      qCe = Dne(paramsMa);
      if (qCe != null && this.Dne != null) {
        if (Dne != null && !paramsMa.Vxn())
          try {
            FWm(paramsMa, paramDouble1, paramDouble2, paramDouble3, paramFloat1, paramFloat2);
          } catch (Throwable throwable) {
            throw new kaJ(McM.Dne(throwable, "Rendering entity hitbox in world"));
          }  
        try {
          qCe.Dne(paramsMa, paramDouble1, paramDouble2, paramDouble3, paramFloat1, paramFloat2);
        } catch (Throwable throwable) {
          throw new kaJ(McM.Dne(throwable, "Rendering entity in world"));
        } 
        try {
          qCe.FWm(paramsMa, paramDouble1, paramDouble2, paramDouble3, paramFloat1, paramFloat2);
        } catch (Throwable throwable) {
          throw new kaJ(McM.Dne(throwable, "Post-rendering entity in world"));
        } 
      } 
    } catch (Throwable throwable) {
      McM mcM = McM.Dne(throwable, "Rendering entity in world");
      Noo noo1 = mcM.Dne("Entity being rendered");
      paramsMa.Dne(noo1);
      Noo noo2 = mcM.Dne("Renderer details");
      noo2.Dne("Assigned renderer", qCe);
      noo2.Dne("Location", Noo.Dne(paramDouble1, paramDouble2, paramDouble3));
      noo2.Dne("Rotation", Float.valueOf(paramFloat1));
      noo2.Dne("Delta", Float.valueOf(paramFloat2));
      throw new kaJ(mcM);
    } 
  }
  
  private ptH() {
    this.Dne.put(osi.class, new QUJ());
    this.Dne.put(PGM.class, new QUJ());
    this.Dne.put(fNv.class, new MHy(new aTM(), new aTM(0.5F), 0.7F));
    this.Dne.put(Pvd.class, new UJs(new vea(), new eXl(), 0.7F));
    this.Dne.put(wBN.class, new dTm(new pPF(), 0.7F));
    this.Dne.put(Ahh.class, new EyS(new pPF(), 0.7F));
    this.Dne.put(oEB.class, new Uyd(new cgN(), new cgN(), 0.5F));
    this.Dne.put(GRq.class, new xhL(new Gdb(), 0.3F));
    this.Dne.put(kQo.class, new pCU(new JgT(), 0.4F));
    this.Dne.put(zTy.class, new szg());
    this.Dne.put(gls.class, new WUR());
    this.Dne.put(iGp.class, new bLW());
    this.Dne.put(wao.class, new TrR());
    this.Dne.put(yXX.class, new Jvi());
    this.Dne.put(bVr.class, new Mlu());
    this.Dne.put(hlo.class, new vGU());
    this.Dne.put(zxd.class, new iqS());
    this.Dne.put(Tgj.class, new ENB(new Irw(16), new Irw(0), 0.25F));
    this.Dne.put(WDT.class, new OgB());
    this.Dne.put(FiG.class, new CSH());
    this.Dne.put(ZFJ.class, new KYQ(new fsj(), 0.5F, 6.0F));
    this.Dne.put(VAd.class, new ydy());
    this.Dne.put(Xxe.class, new QiJ(new HJR(), 0.7F));
    this.Dne.put(pjB.class, new olK());
    this.Dne.put(CDE.class, new vnj());
    this.Dne.put(FUH.class, new YAD(new Sgm(), 0.5F));
    this.Dne.put(oaw.class, new hMm());
    this.Dne.put(WSC.class, new JOY());
    this.Dne.put(Ndk.class, new wgU());
    this.Dne.put(DhB.class, new TSA());
    this.Dne.put(sMa.class, new zsp());
    this.Dne.put(JCd.class, new iDg());
    this.Dne.put(BPY.class, new WoI());
    this.Dne.put(hhc.class, new Non());
    this.Dne.put(KXX.class, new lkB(dEr.iNQ));
    this.Dne.put(Hhj.class, new lkB(dEr.iNH));
    this.Dne.put(UMP.class, new lkB(dEr.Woy));
    this.Dne.put(TCA.class, new lkB(dEr.KLR));
    this.Dne.put(YgL.class, new lkB(dEr.Dne, 16384));
    this.Dne.put(AEw.class, new lkB(dEr.wns));
    this.Dne.put(zMx.class, new lkB(dEr.kQw));
    this.Dne.put(iis.class, new svf(2.0F));
    this.Dne.put(Xzh.class, new svf(0.5F));
    this.Dne.put(YCH.class, new VmQ());
    this.Dne.put(JiM.class, new eKj());
    this.Dne.put(alg.class, new cZD());
    this.Dne.put(gqg.class, new UmO());
    this.Dne.put(CiF.class, new zWy());
    this.Dne.put(Art.class, new bga());
    this.Dne.put(sry.class, new Yck());
    this.Dne.put(Ebp.class, new dfe());
    this.Dne.put(iMX.class, new EmE());
    this.Dne.put(cQz.class, new GLU());
    this.Dne.put(xIh.class, new ehI());
    for (QCe qCe : this.Dne.values())
      qCe.Dne(this); 
  }
  
  public msA Dne() {
    return this.Dne;
  }
  
  public double Dne(double paramDouble1, double paramDouble2, double paramDouble3) {
    double d1 = paramDouble1 - this.Qnq;
    double d2 = paramDouble2 - this.aFZ;
    double d3 = paramDouble3 - this.zGp;
    return d1 * d1 + d2 * d2 + d3 * d3;
  }
  
  public void Dne(Qnq paramQnq) {
    this.Dne = (msA)paramQnq;
  }
  
  public void Dne(Qnq paramQnq, Snh paramSnh, msA parammsA, FUH paramFUH1, FUH paramFUH2, fZI paramfZI, float paramFloat) {
    this.Dne = (msA)paramQnq;
    this.Dne = (msA)paramSnh;
    this.Dne = (msA)paramfZI;
    this.Dne = (msA)paramFUH1;
    this.FWm = paramFUH2;
    this.Dne = parammsA;
    if (paramFUH1.Wwe()) {
      int i = paramQnq.Dne(geR.FWm(paramFUH1.div), geR.FWm(paramFUH1.IjH), geR.FWm(paramFUH1.mrb));
      if (i == zKP.FfS.FWm) {
        int j = paramQnq.bzF(geR.FWm(paramFUH1.div), geR.FWm(paramFUH1.IjH), geR.FWm(paramFUH1.mrb));
        int k = j & 0x3;
        this.Dne = (k * 90 + 180);
        this.FWm = 0.0F;
      } 
    } else {
      this.Dne = paramFUH1.Zpi + (paramFUH1.mrb - paramFUH1.Zpi) * paramFloat;
      this.FWm = paramFUH1.kGO + (paramFUH1.XHL - paramFUH1.kGO) * paramFloat;
    } 
    if (paramfZI.div == 2)
      this.Dne += 180.0F; 
    this.Qnq = paramFUH1.udO + (paramFUH1.div - paramFUH1.udO) * paramFloat;
    this.aFZ = paramFUH1.ooe + (paramFUH1.IjH - paramFUH1.ooe) * paramFloat;
    this.zGp = paramFUH1.trS + (paramFUH1.mrb - paramFUH1.trS) * paramFloat;
  }
  
  private void FWm(sMa paramsMa, double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat1, float paramFloat2) {
    // Byte code:
    //   0: iconst_0
    //   1: invokestatic glDepthMask : (Z)V
    //   4: sipush #3553
    //   7: invokestatic glDisable : (I)V
    //   10: sipush #2896
    //   13: invokestatic glDisable : (I)V
    //   16: sipush #2884
    //   19: invokestatic glDisable : (I)V
    //   22: sipush #3042
    //   25: invokestatic glDisable : (I)V
    //   28: invokestatic glPushMatrix : ()V
    //   31: getstatic WAR.Dne : LWAR;
    //   34: astore #10
    //   36: aload #10
    //   38: invokevirtual Dne : ()V
    //   41: aload #10
    //   43: sipush #255
    //   46: sipush #255
    //   49: sipush #255
    //   52: bipush #32
    //   54: invokevirtual Dne : (IIII)V
    //   57: aload_1
    //   58: getfield ooe : F
    //   61: fneg
    //   62: fconst_2
    //   63: fdiv
    //   64: f2d
    //   65: dstore #11
    //   67: aload_1
    //   68: getfield ooe : F
    //   71: fneg
    //   72: fconst_2
    //   73: fdiv
    //   74: f2d
    //   75: dstore #13
    //   77: aload_1
    //   78: getfield ooe : F
    //   81: fconst_2
    //   82: fdiv
    //   83: f2d
    //   84: dstore #15
    //   86: aload_1
    //   87: getfield ooe : F
    //   90: fneg
    //   91: fconst_2
    //   92: fdiv
    //   93: f2d
    //   94: dstore #17
    //   96: aload_1
    //   97: getfield ooe : F
    //   100: fneg
    //   101: fconst_2
    //   102: fdiv
    //   103: f2d
    //   104: dstore #19
    //   106: aload_1
    //   107: getfield ooe : F
    //   110: fconst_2
    //   111: fdiv
    //   112: f2d
    //   113: dstore #21
    //   115: aload_1
    //   116: getfield ooe : F
    //   119: fconst_2
    //   120: fdiv
    //   121: f2d
    //   122: dstore #23
    //   124: aload_1
    //   125: getfield ooe : F
    //   128: fconst_2
    //   129: fdiv
    //   130: f2d
    //   131: dstore #25
    //   133: aload_1
    //   134: getfield trS : F
    //   137: f2d
    //   138: dstore #27
    //   140: aload #10
    //   142: dload_2
    //   143: dload #11
    //   145: dadd
    //   146: dload #4
    //   148: dload #27
    //   150: dadd
    //   151: dload #6
    //   153: dload #13
    //   155: dadd
    //   156: invokevirtual Dne : (DDD)V
    //   159: aload #10
    //   161: dload_2
    //   162: dload #11
    //   164: dadd
    //   165: dload #4
    //   167: dload #6
    //   169: dload #13
    //   171: dadd
    //   172: invokevirtual Dne : (DDD)V
    //   175: aload #10
    //   177: dload_2
    //   178: dload #15
    //   180: dadd
    //   181: dload #4
    //   183: dload #6
    //   185: dload #17
    //   187: dadd
    //   188: invokevirtual Dne : (DDD)V
    //   191: aload #10
    //   193: dload_2
    //   194: dload #15
    //   196: dadd
    //   197: dload #4
    //   199: dload #27
    //   201: dadd
    //   202: dload #6
    //   204: dload #17
    //   206: dadd
    //   207: invokevirtual Dne : (DDD)V
    //   210: aload #10
    //   212: dload_2
    //   213: dload #23
    //   215: dadd
    //   216: dload #4
    //   218: dload #27
    //   220: dadd
    //   221: dload #6
    //   223: dload #25
    //   225: dadd
    //   226: invokevirtual Dne : (DDD)V
    //   229: aload #10
    //   231: dload_2
    //   232: dload #23
    //   234: dadd
    //   235: dload #4
    //   237: dload #6
    //   239: dload #25
    //   241: dadd
    //   242: invokevirtual Dne : (DDD)V
    //   245: aload #10
    //   247: dload_2
    //   248: dload #19
    //   250: dadd
    //   251: dload #4
    //   253: dload #6
    //   255: dload #21
    //   257: dadd
    //   258: invokevirtual Dne : (DDD)V
    //   261: aload #10
    //   263: dload_2
    //   264: dload #19
    //   266: dadd
    //   267: dload #4
    //   269: dload #27
    //   271: dadd
    //   272: dload #6
    //   274: dload #21
    //   276: dadd
    //   277: invokevirtual Dne : (DDD)V
    //   280: aload #10
    //   282: dload_2
    //   283: dload #15
    //   285: dadd
    //   286: dload #4
    //   288: dload #27
    //   290: dadd
    //   291: dload #6
    //   293: dload #17
    //   295: dadd
    //   296: invokevirtual Dne : (DDD)V
    //   299: aload #10
    //   301: dload_2
    //   302: dload #15
    //   304: dadd
    //   305: dload #4
    //   307: dload #6
    //   309: dload #17
    //   311: dadd
    //   312: invokevirtual Dne : (DDD)V
    //   315: aload #10
    //   317: dload_2
    //   318: dload #23
    //   320: dadd
    //   321: dload #4
    //   323: dload #6
    //   325: dload #25
    //   327: dadd
    //   328: invokevirtual Dne : (DDD)V
    //   331: aload #10
    //   333: dload_2
    //   334: dload #23
    //   336: dadd
    //   337: dload #4
    //   339: dload #27
    //   341: dadd
    //   342: dload #6
    //   344: dload #25
    //   346: dadd
    //   347: invokevirtual Dne : (DDD)V
    //   350: aload #10
    //   352: dload_2
    //   353: dload #19
    //   355: dadd
    //   356: dload #4
    //   358: dload #27
    //   360: dadd
    //   361: dload #6
    //   363: dload #21
    //   365: dadd
    //   366: invokevirtual Dne : (DDD)V
    //   369: aload #10
    //   371: dload_2
    //   372: dload #19
    //   374: dadd
    //   375: dload #4
    //   377: dload #6
    //   379: dload #21
    //   381: dadd
    //   382: invokevirtual Dne : (DDD)V
    //   385: aload #10
    //   387: dload_2
    //   388: dload #11
    //   390: dadd
    //   391: dload #4
    //   393: dload #6
    //   395: dload #13
    //   397: dadd
    //   398: invokevirtual Dne : (DDD)V
    //   401: aload #10
    //   403: dload_2
    //   404: dload #11
    //   406: dadd
    //   407: dload #4
    //   409: dload #27
    //   411: dadd
    //   412: dload #6
    //   414: dload #13
    //   416: dadd
    //   417: invokevirtual Dne : (DDD)V
    //   420: aload #10
    //   422: invokevirtual Dne : ()I
    //   425: pop
    //   426: invokestatic glPopMatrix : ()V
    //   429: sipush #3553
    //   432: invokestatic glEnable : (I)V
    //   435: sipush #2896
    //   438: invokestatic glEnable : (I)V
    //   441: sipush #2884
    //   444: invokestatic glEnable : (I)V
    //   447: sipush #3042
    //   450: invokestatic glDisable : (I)V
    //   453: iconst_1
    //   454: invokestatic glDepthMask : (Z)V
    //   457: return
  }
  
  public void Dne(sMa paramsMa, float paramFloat) {
    if (paramsMa.zGp == 0) {
      paramsMa.udO = paramsMa.div;
      paramsMa.ooe = paramsMa.IjH;
      paramsMa.trS = paramsMa.mrb;
    } 
    double d1 = paramsMa.udO + (paramsMa.div - paramsMa.udO) * paramFloat;
    double d2 = paramsMa.ooe + (paramsMa.IjH - paramsMa.ooe) * paramFloat;
    double d3 = paramsMa.trS + (paramsMa.mrb - paramsMa.trS) * paramFloat;
    float f = paramsMa.Zpi + (paramsMa.mrb - paramsMa.Zpi) * paramFloat;
    int i = paramsMa.Dne(paramFloat);
    if (paramsMa.trS())
      i = 15728880; 
    int j = i % 65536;
    int k = i / 65536;
    oCF.Dne(oCF.FWm, j / 1.0F, k / 1.0F);
    GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
    Dne(paramsMa, d1 - Dne, d2 - FWm, d3 - bzF, f, paramFloat);
  }
  
  public void Dne(Rbp paramRbp) {
    for (QCe qCe : this.Dne.values())
      qCe.Dne(paramRbp); 
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\ptH.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */