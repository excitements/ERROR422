import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class pjB extends Azh implements YzO, LUQ {
  private boolean RPx;
  
  uQr Dne;
  
  private int FWm;
  
  private boolean Fnk;
  
  private FiG FWm;
  
  private String aFZ;
  
  private int ZgS;
  
  private float Dne;
  
  private boolean FWm = false;
  
  private static final Map FWm;
  
  private static final Map Dne = new HashMap<>();
  
  private ybO Dne;
  
  private int One;
  
  private boolean vSL;
  
  private static int FWm(int paramInt, Random paramRandom) {
    INq iNq = (INq)FWm.get(Integer.valueOf(paramInt));
    return (iNq == null) ? 1 : ((((Integer)iNq.Dne()).intValue() >= ((Integer)iNq.FWm()).intValue()) ? ((Integer)iNq.Dne()).intValue() : (((Integer)iNq.Dne()).intValue() + paramRandom.nextInt(((Integer)iNq.FWm()).intValue() - ((Integer)iNq.Dne()).intValue())));
  }
  
  public FiG Dne() {
    return (FiG)this.FWm;
  }
  
  private static NMq Dne(int paramInt, Random paramRandom) {
    return new NMq(paramInt, Dne(paramInt, paramRandom), 0);
  }
  
  public void bzF(FUH paramFUH) {
    super.bzF(paramFUH);
    if (this.Dne != null && paramFUH != null) {
      this.Dne.Dne(paramFUH);
      if (paramFUH instanceof FiG) {
        byte b = -1;
        if (IjH())
          b = -3; 
        this.Dne.Dne(((FiG)paramFUH).a_(), b);
        if (udO())
          this.Dne.Dne(this, (byte)13); 
      } 
    } 
  }
  
  public pjB(Qnq paramQnq) {
    this(paramQnq, 0);
  }
  
  public int Dne() {
    return 20;
  }
  
  private static void Dne(ybO paramybO, int paramInt, Random paramRandom, float paramFloat) {
    if (paramRandom.nextFloat() < paramFloat)
      paramybO.add((E)new Vnr(Dne(paramInt, paramRandom), dEr.Kvh)); 
  }
  
  private static void FWm(ybO paramybO, int paramInt, Random paramRandom, float paramFloat) {
    if (paramRandom.nextFloat() < paramFloat) {
      NMq nMq1;
      NMq nMq2;
      int i = FWm(paramInt, paramRandom);
      if (i < 0) {
        nMq1 = new NMq(dEr.Kvh.Qnq, 1, 0);
        nMq2 = new NMq(paramInt, -i, 0);
      } else {
        nMq1 = new NMq(dEr.Kvh.Qnq, i, 0);
        nMq2 = new NMq(paramInt, 1, 0);
      } 
      paramybO.add((E)new Vnr(nMq1, nMq2));
    } 
  }
  
  protected String DyG() {
    return "mob.villager.defaulthurt";
  }
  
  protected void FWm() {
    super.FWm();
    this.Dne.Dne(16, Integer.valueOf(0));
  }
  
  public void kGO(int paramInt) {
    this.Dne.FWm(16, Integer.valueOf(paramInt));
  }
  
  private float bzF(float paramFloat) {
    float f = paramFloat + this.Dne;
    return (f > 0.9F) ? (0.9F - f - 0.9F) : f;
  }
  
  protected String zGp() {
    return "mob.villager.default";
  }
  
  public boolean a_(FiG paramFiG) {
    NMq nMq = paramFiG.Dne.Dne();
    boolean bool = (nMq != null && nMq.bzF == dEr.ghu.Qnq) ? true : false;
    if (!bool && udO() && !ZfC() && !IjH()) {
      if (((Qnq)this.Dne).aFZ == null) {
        Dne(paramFiG);
        paramFiG.Dne(this, IjH());
      } 
      return true;
    } 
    return super.a_(paramFiG);
  }
  
  static {
    FWm = new HashMap<>();
    Dne.put(Integer.valueOf(dEr.DyG.Qnq), new INq(Integer.valueOf(16), Integer.valueOf(24)));
    Dne.put(Integer.valueOf(dEr.IjH.Qnq), new INq(Integer.valueOf(8), Integer.valueOf(10)));
    Dne.put(Integer.valueOf(dEr.mrb.Qnq), new INq(Integer.valueOf(8), Integer.valueOf(10)));
    Dne.put(Integer.valueOf(dEr.div.Qnq), new INq(Integer.valueOf(4), Integer.valueOf(6)));
    Dne.put(Integer.valueOf(dEr.lMz.Qnq), new INq(Integer.valueOf(24), Integer.valueOf(36)));
    Dne.put(Integer.valueOf(dEr.TKg.Qnq), new INq(Integer.valueOf(11), Integer.valueOf(13)));
    Dne.put(Integer.valueOf(dEr.CLK.Qnq), new INq(Integer.valueOf(1), Integer.valueOf(1)));
    Dne.put(Integer.valueOf(dEr.iNH.Qnq), new INq(Integer.valueOf(3), Integer.valueOf(4)));
    Dne.put(Integer.valueOf(dEr.Woy.Qnq), new INq(Integer.valueOf(2), Integer.valueOf(3)));
    Dne.put(Integer.valueOf(dEr.qrB.Qnq), new INq(Integer.valueOf(14), Integer.valueOf(18)));
    Dne.put(Integer.valueOf(dEr.ipf.Qnq), new INq(Integer.valueOf(14), Integer.valueOf(18)));
    Dne.put(Integer.valueOf(dEr.qqL.Qnq), new INq(Integer.valueOf(14), Integer.valueOf(18)));
    Dne.put(Integer.valueOf(dEr.kSP.Qnq), new INq(Integer.valueOf(9), Integer.valueOf(13)));
    Dne.put(Integer.valueOf(dEr.mlD.Qnq), new INq(Integer.valueOf(34), Integer.valueOf(48)));
    Dne.put(Integer.valueOf(dEr.MUD.Qnq), new INq(Integer.valueOf(30), Integer.valueOf(38)));
    Dne.put(Integer.valueOf(dEr.LDH.Qnq), new INq(Integer.valueOf(30), Integer.valueOf(38)));
    Dne.put(Integer.valueOf(dEr.EWz.Qnq), new INq(Integer.valueOf(18), Integer.valueOf(22)));
    Dne.put(Integer.valueOf(zKP.RPx.FWm), new INq(Integer.valueOf(14), Integer.valueOf(22)));
    Dne.put(Integer.valueOf(dEr.gvF.Qnq), new INq(Integer.valueOf(36), Integer.valueOf(64)));
    FWm.put(Integer.valueOf(dEr.Qnq.Qnq), new INq(Integer.valueOf(3), Integer.valueOf(4)));
    FWm.put(Integer.valueOf(((ZtP)dEr.Dne).Qnq), new INq(Integer.valueOf(3), Integer.valueOf(4)));
    FWm.put(Integer.valueOf(dEr.XHL.Qnq), new INq(Integer.valueOf(7), Integer.valueOf(11)));
    FWm.put(Integer.valueOf(dEr.ceE.Qnq), new INq(Integer.valueOf(12), Integer.valueOf(14)));
    FWm.put(Integer.valueOf(dEr.bzF.Qnq), new INq(Integer.valueOf(6), Integer.valueOf(8)));
    FWm.put(Integer.valueOf(dEr.OdI.Qnq), new INq(Integer.valueOf(9), Integer.valueOf(12)));
    FWm.put(Integer.valueOf(dEr.FWm.Qnq), new INq(Integer.valueOf(7), Integer.valueOf(9)));
    FWm.put(Integer.valueOf(dEr.FfS.Qnq), new INq(Integer.valueOf(10), Integer.valueOf(12)));
    FWm.put(Integer.valueOf(dEr.Dne.Qnq), new INq(Integer.valueOf(4), Integer.valueOf(6)));
    FWm.put(Integer.valueOf(dEr.EyB.Qnq), new INq(Integer.valueOf(7), Integer.valueOf(8)));
    FWm.put(Integer.valueOf(dEr.One.Qnq), new INq(Integer.valueOf(4), Integer.valueOf(6)));
    FWm.put(Integer.valueOf(dEr.ZgS.Qnq), new INq(Integer.valueOf(7), Integer.valueOf(8)));
    FWm.put(Integer.valueOf(((Qoi)dEr.Zpi).Qnq), new INq(Integer.valueOf(4), Integer.valueOf(6)));
    FWm.put(Integer.valueOf(dEr.trS.Qnq), new INq(Integer.valueOf(7), Integer.valueOf(8)));
    FWm.put(Integer.valueOf(dEr.IjH.Qnq), new INq(Integer.valueOf(4), Integer.valueOf(6)));
    FWm.put(Integer.valueOf(((Qoi)dEr.kGO).Qnq), new INq(Integer.valueOf(7), Integer.valueOf(8)));
    FWm.put(Integer.valueOf(dEr.mrb.Qnq), new INq(Integer.valueOf(10), Integer.valueOf(14)));
    FWm.put(Integer.valueOf(((Qoi)dEr.udO).Qnq), new INq(Integer.valueOf(16), Integer.valueOf(19)));
    FWm.put(Integer.valueOf(((Qoi)dEr.XHL).Qnq), new INq(Integer.valueOf(8), Integer.valueOf(10)));
    FWm.put(Integer.valueOf(((Qoi)dEr.ooe).Qnq), new INq(Integer.valueOf(11), Integer.valueOf(14)));
    FWm.put(Integer.valueOf(dEr.div.Qnq), new INq(Integer.valueOf(5), Integer.valueOf(7)));
    FWm.put(Integer.valueOf(dEr.aFZ.Qnq), new INq(Integer.valueOf(5), Integer.valueOf(7)));
    FWm.put(Integer.valueOf(((Qoi)dEr.zGp).Qnq), new INq(Integer.valueOf(11), Integer.valueOf(15)));
    FWm.put(Integer.valueOf(((Qoi)dEr.DyG).Qnq), new INq(Integer.valueOf(9), Integer.valueOf(11)));
    FWm.put(Integer.valueOf(dEr.rPc.Qnq), new INq(Integer.valueOf(-4), Integer.valueOf(-2)));
    FWm.put(Integer.valueOf(dEr.gwq.Qnq), new INq(Integer.valueOf(-8), Integer.valueOf(-4)));
    FWm.put(Integer.valueOf(dEr.aFZ.Qnq), new INq(Integer.valueOf(-8), Integer.valueOf(-4)));
    FWm.put(Integer.valueOf(dEr.Lab.Qnq), new INq(Integer.valueOf(-10), Integer.valueOf(-7)));
    FWm.put(Integer.valueOf(zKP.trS.FWm), new INq(Integer.valueOf(-5), Integer.valueOf(-3)));
    FWm.put(Integer.valueOf(zKP.AgF.FWm), new INq(Integer.valueOf(3), Integer.valueOf(4)));
    FWm.put(Integer.valueOf(dEr.FWm.Qnq), new INq(Integer.valueOf(4), Integer.valueOf(5)));
    FWm.put(Integer.valueOf(dEr.Qnq.Qnq), new INq(Integer.valueOf(2), Integer.valueOf(4)));
    FWm.put(Integer.valueOf(((Qoi)dEr.Dne).Qnq), new INq(Integer.valueOf(2), Integer.valueOf(4)));
    FWm.put(Integer.valueOf(dEr.bzF.Qnq), new INq(Integer.valueOf(2), Integer.valueOf(4)));
    FWm.put(Integer.valueOf(dEr.YHU.Qnq), new INq(Integer.valueOf(6), Integer.valueOf(8)));
    FWm.put(Integer.valueOf(dEr.wns.Qnq), new INq(Integer.valueOf(-4), Integer.valueOf(-1)));
    FWm.put(Integer.valueOf(dEr.exS.Qnq), new INq(Integer.valueOf(-4), Integer.valueOf(-1)));
    FWm.put(Integer.valueOf(dEr.Suj.Qnq), new INq(Integer.valueOf(10), Integer.valueOf(12)));
    FWm.put(Integer.valueOf(dEr.fYA.Qnq), new INq(Integer.valueOf(10), Integer.valueOf(12)));
    FWm.put(Integer.valueOf(zKP.fYA.FWm), new INq(Integer.valueOf(-3), Integer.valueOf(-1)));
    FWm.put(Integer.valueOf(dEr.LVR.Qnq), new INq(Integer.valueOf(-7), Integer.valueOf(-5)));
    FWm.put(Integer.valueOf(dEr.mzX.Qnq), new INq(Integer.valueOf(-7), Integer.valueOf(-5)));
    FWm.put(Integer.valueOf(dEr.yIR.Qnq), new INq(Integer.valueOf(-8), Integer.valueOf(-6)));
    FWm.put(Integer.valueOf(dEr.Woy.Qnq), new INq(Integer.valueOf(7), Integer.valueOf(11)));
    FWm.put(Integer.valueOf(dEr.zGp.Qnq), new INq(Integer.valueOf(-12), Integer.valueOf(-8)));
  }
  
  public String bzF() {
    switch (qLR()) {
      case 0:
        return "/mob/villager/farmer.png";
      case 1:
        return "/mob/villager/librarian.png";
      case 2:
        return "/mob/villager/priest.png";
      case 3:
        return "/mob/villager/smith.png";
      case 4:
        return "/mob/villager/butcher.png";
    } 
    return super.bzF();
  }
  
  public void mrb(boolean paramBoolean) {
    this.vSL = paramBoolean;
  }
  
  public void Dne(WkD paramWkD) {
    super.Dne(paramWkD);
    paramWkD.Dne("Profession", qLR());
    paramWkD.Dne("Riches", this.ZgS);
    if (this.Dne != null)
      paramWkD.Dne("Offers", this.Dne.Dne()); 
  }
  
  private void udO(int paramInt) {
    byte b1;
    int[] arrayOfInt1;
    int[] arrayOfInt2;
    int i;
    if (this.Dne != null) {
      this.Dne = geR.bzF(this.Dne.size()) * 0.2F;
    } else {
      this.Dne = 0.0F;
    } 
    ybO ybO1 = new ybO();
    switch (qLR()) {
      case 0:
        Dne(ybO1, dEr.EWz.Qnq, (Random)this.Dne, bzF(0.9F));
        Dne(ybO1, zKP.RPx.FWm, (Random)this.Dne, bzF(0.5F));
        Dne(ybO1, dEr.qqL.Qnq, (Random)this.Dne, bzF(0.5F));
        Dne(ybO1, dEr.kSP.Qnq, (Random)this.Dne, bzF(0.4F));
        FWm(ybO1, dEr.rPc.Qnq, (Random)this.Dne, bzF(0.9F));
        FWm(ybO1, dEr.gwq.Qnq, (Random)this.Dne, bzF(0.3F));
        FWm(ybO1, dEr.aFZ.Qnq, (Random)this.Dne, bzF(0.3F));
        FWm(ybO1, dEr.Lab.Qnq, (Random)this.Dne, bzF(0.3F));
        FWm(ybO1, ((ZtP)dEr.Dne).Qnq, (Random)this.Dne, bzF(0.3F));
        FWm(ybO1, dEr.Qnq.Qnq, (Random)this.Dne, bzF(0.3F));
        FWm(ybO1, dEr.yIR.Qnq, (Random)this.Dne, bzF(0.3F));
        FWm(ybO1, dEr.zGp.Qnq, (Random)this.Dne, bzF(0.5F));
        if (this.Dne.nextFloat() < bzF(0.5F))
          ybO1.add((E)new Vnr(new NMq(zKP.mrb, 10), new NMq(dEr.Kvh), new NMq(dEr.haP.Qnq, 4 + this.Dne.nextInt(2), 0))); 
        break;
      case 1:
        Dne(ybO1, dEr.lMz.Qnq, (Random)this.Dne, bzF(0.8F));
        Dne(ybO1, dEr.TKg.Qnq, (Random)this.Dne, bzF(0.8F));
        Dne(ybO1, dEr.CLK.Qnq, (Random)this.Dne, bzF(0.3F));
        FWm(ybO1, zKP.AgF.FWm, (Random)this.Dne, bzF(0.8F));
        FWm(ybO1, zKP.trS.FWm, (Random)this.Dne, bzF(0.2F));
        FWm(ybO1, dEr.Suj.Qnq, (Random)this.Dne, bzF(0.2F));
        FWm(ybO1, dEr.fYA.Qnq, (Random)this.Dne, bzF(0.2F));
        if (this.Dne.nextFloat() < bzF(0.07F)) {
          ycv ycv = ycv.FWm[this.Dne.nextInt(ycv.FWm.length)];
          int k = geR.Dne((Random)this.Dne, ycv.bzF(), ycv.Dne());
          NMq nMq = dEr.Dne.Dne(new RmG(ycv, k));
          int j = 2 + this.Dne.nextInt(5 + k * 10) + 3 * k;
          ybO1.add((E)new Vnr(new NMq(dEr.TKg), new NMq(dEr.Kvh, j), nMq));
        } 
        break;
      case 2:
        FWm(ybO1, dEr.Woy.Qnq, (Random)this.Dne, bzF(0.3F));
        FWm(ybO1, dEr.wns.Qnq, (Random)this.Dne, bzF(0.2F));
        FWm(ybO1, dEr.exS.Qnq, (Random)this.Dne, bzF(0.4F));
        FWm(ybO1, zKP.fYA.FWm, (Random)this.Dne, bzF(0.3F));
        arrayOfInt1 = new int[] { dEr.XHL.Qnq, dEr.ceE.Qnq, dEr.mrb.Qnq, ((Qoi)dEr.udO).Qnq, dEr.bzF.Qnq, dEr.OdI.Qnq, dEr.FWm.Qnq, dEr.FfS.Qnq };
        arrayOfInt2 = arrayOfInt1;
        i = arrayOfInt1.length;
        for (b1 = 0; b1 < i; b1++) {
          int j = arrayOfInt2[b1];
          if (this.Dne.nextFloat() < bzF(0.05F))
            ybO1.add((E)new Vnr(new NMq(j, 1, 0), new NMq(dEr.Kvh, 2 + this.Dne.nextInt(3), 0), UYp.Dne((Random)this.Dne, new NMq(j, 1, 0), 5 + this.Dne.nextInt(15)))); 
        } 
        break;
      case 3:
        Dne(ybO1, dEr.DyG.Qnq, (Random)this.Dne, bzF(0.7F));
        Dne(ybO1, dEr.IjH.Qnq, (Random)this.Dne, bzF(0.5F));
        Dne(ybO1, dEr.mrb.Qnq, (Random)this.Dne, bzF(0.5F));
        Dne(ybO1, dEr.div.Qnq, (Random)this.Dne, bzF(0.5F));
        FWm(ybO1, dEr.XHL.Qnq, (Random)this.Dne, bzF(0.5F));
        FWm(ybO1, dEr.ceE.Qnq, (Random)this.Dne, bzF(0.5F));
        FWm(ybO1, dEr.bzF.Qnq, (Random)this.Dne, bzF(0.3F));
        FWm(ybO1, dEr.OdI.Qnq, (Random)this.Dne, bzF(0.3F));
        FWm(ybO1, dEr.FWm.Qnq, (Random)this.Dne, bzF(0.5F));
        FWm(ybO1, dEr.FfS.Qnq, (Random)this.Dne, bzF(0.5F));
        FWm(ybO1, dEr.Dne.Qnq, (Random)this.Dne, bzF(0.2F));
        FWm(ybO1, dEr.EyB.Qnq, (Random)this.Dne, bzF(0.2F));
        FWm(ybO1, dEr.One.Qnq, (Random)this.Dne, bzF(0.2F));
        FWm(ybO1, dEr.ZgS.Qnq, (Random)this.Dne, bzF(0.2F));
        FWm(ybO1, ((Qoi)dEr.Zpi).Qnq, (Random)this.Dne, bzF(0.2F));
        FWm(ybO1, dEr.trS.Qnq, (Random)this.Dne, bzF(0.2F));
        FWm(ybO1, dEr.IjH.Qnq, (Random)this.Dne, bzF(0.2F));
        FWm(ybO1, ((Qoi)dEr.kGO).Qnq, (Random)this.Dne, bzF(0.2F));
        FWm(ybO1, dEr.mrb.Qnq, (Random)this.Dne, bzF(0.2F));
        FWm(ybO1, ((Qoi)dEr.udO).Qnq, (Random)this.Dne, bzF(0.2F));
        FWm(ybO1, ((Qoi)dEr.XHL).Qnq, (Random)this.Dne, bzF(0.2F));
        FWm(ybO1, ((Qoi)dEr.ooe).Qnq, (Random)this.Dne, bzF(0.2F));
        FWm(ybO1, dEr.div.Qnq, (Random)this.Dne, bzF(0.1F));
        FWm(ybO1, dEr.aFZ.Qnq, (Random)this.Dne, bzF(0.1F));
        FWm(ybO1, ((Qoi)dEr.zGp).Qnq, (Random)this.Dne, bzF(0.1F));
        FWm(ybO1, ((Qoi)dEr.DyG).Qnq, (Random)this.Dne, bzF(0.1F));
        break;
      case 4:
        Dne(ybO1, dEr.DyG.Qnq, (Random)this.Dne, bzF(0.7F));
        Dne(ybO1, dEr.qrB.Qnq, (Random)this.Dne, bzF(0.5F));
        Dne(ybO1, dEr.ipf.Qnq, (Random)this.Dne, bzF(0.5F));
        FWm(ybO1, dEr.YHU.Qnq, (Random)this.Dne, bzF(0.1F));
        FWm(ybO1, dEr.FWm.Qnq, (Random)this.Dne, bzF(0.3F));
        FWm(ybO1, dEr.Qnq.Qnq, (Random)this.Dne, bzF(0.3F));
        FWm(ybO1, ((Qoi)dEr.Dne).Qnq, (Random)this.Dne, bzF(0.3F));
        FWm(ybO1, dEr.bzF.Qnq, (Random)this.Dne, bzF(0.3F));
        FWm(ybO1, dEr.LVR.Qnq, (Random)this.Dne, bzF(0.3F));
        FWm(ybO1, dEr.mzX.Qnq, (Random)this.Dne, bzF(0.3F));
        break;
    } 
    if (ybO1.isEmpty())
      Dne(ybO1, dEr.mrb.Qnq, (Random)this.Dne, 1.0F); 
    Collections.shuffle(ybO1);
    if (this.Dne == null)
      this.Dne = new ybO(); 
    for (byte b2 = 0; b2 < paramInt && b2 < ybO1.size(); b2++)
      this.Dne.Dne((Vnr)ybO1.get(b2)); 
  }
  
  public void Dne(Vnr paramVnr) {
    paramVnr.Dne();
    if (paramVnr.Dne((Vnr)this.Dne.get(this.Dne.size() - 1))) {
      this.One = 40;
      this.RPx = true;
      if (this.FWm != null) {
        this.aFZ = this.FWm.a_();
      } else {
        this.aFZ = null;
      } 
    } 
    if ((paramVnr.Dne()).bzF == dEr.Kvh.Qnq)
      this.ZgS += (paramVnr.Dne()).Dne; 
  }
  
  public ybO Dne(FiG paramFiG) {
    if (this.Dne == null)
      udO(1); 
    return this.Dne;
  }
  
  protected boolean yMz() {
    return false;
  }
  
  public void Dne(byte paramByte) {
    if (paramByte == 12) {
      Dne("heart");
    } else if (paramByte == 13) {
      Dne("angryVillager");
    } else if (paramByte == 14) {
      Dne("happyVillager");
    } else {
      super.Dne(paramByte);
    } 
  }
  
  public int qLR() {
    return this.Dne.Dne(16);
  }
  
  private void Dne(String paramString) {
    for (byte b = 0; b < 5; b++) {
      double d1 = this.Dne.nextGaussian() * 0.02D;
      double d2 = this.Dne.nextGaussian() * 0.02D;
      double d3 = this.Dne.nextGaussian() * 0.02D;
      this.Dne.Dne(paramString, this.div + (this.Dne.nextFloat() * this.ooe * 2.0F) - this.ooe, this.IjH + 1.0D + (this.Dne.nextFloat() * this.trS), this.mrb + (this.Dne.nextFloat() * this.ooe * 2.0F) - this.ooe, d1, d2, d3);
    } 
  }
  
  public boolean tgc() {
    return true;
  }
  
  public void FWm(WkD paramWkD) {
    super.FWm(paramWkD);
    kGO(paramWkD.Dne("Profession"));
    this.ZgS = paramWkD.Dne("Riches");
    if (paramWkD.Dne("Offers")) {
      WkD wkD = paramWkD.Dne("Offers");
      this.Dne = new ybO(wkD);
    } 
  }
  
  public boolean LVR() {
    return this.FWm;
  }
  
  public void ICU() {
    kGO(((Qnq)this.Dne).Dne.nextInt(5));
  }
  
  public void Dne(FiG paramFiG) {
    this.FWm = (Map)paramFiG;
  }
  
  protected void mlD() {
    if (--this.FWm <= null) {
      ((Qnq)this.Dne).Dne.Dne(geR.FWm(this.div), geR.FWm(this.IjH), geR.FWm(this.mrb));
      this.FWm = 70 + this.Dne.nextInt(50);
      this.Dne = (ybO)((Qnq)this.Dne).Dne.Dne(geR.FWm(this.div), geR.FWm(this.IjH), geR.FWm(this.mrb), 32);
      if (this.Dne == null) {
        AgF();
      } else {
        iSh iSh = this.Dne.Dne();
        FWm(iSh.Dne, iSh.FWm, iSh.bzF, (int)(this.Dne.Dne() * 0.6F));
        if (this.Fnk) {
          this.Fnk = false;
          this.Dne.FWm(5);
        } 
      } 
    } 
    if (!ZfC() && this.One > 0) {
      this.One--;
      if (this.One <= 0) {
        if (this.RPx) {
          if (this.Dne.size() > 1)
            for (Vnr vnr : this.Dne) {
              if (vnr.FWm())
                vnr.Dne(this.Dne.nextInt(6) + this.Dne.nextInt(6) + 2); 
            }  
          udO(1);
          this.RPx = false;
          if (this.Dne != null && this.aFZ != null) {
            this.Dne.Dne(this, (byte)14);
            this.Dne.Dne(this.aFZ, 1);
          } 
        } 
        Qnq(new NAx(SXd.XHL.Dne, 200, 0));
      } 
    } 
    super.mlD();
  }
  
  public void IjH(boolean paramBoolean) {
    this.FWm = paramBoolean;
  }
  
  public void Dne(zBn paramzBn) {
    if (this.Dne != null) {
      sMa sMa = paramzBn.FWm();
      if (sMa != null) {
        if (sMa instanceof FiG) {
          this.Dne.Dne(((FiG)sMa).a_(), -2);
        } else if (sMa instanceof ZFz) {
          this.Dne.Dne();
        } 
      } else if (sMa == null) {
        FiG fiG = this.Dne.Dne(this, 16.0D);
        if (fiG != null)
          this.Dne.Dne(); 
      } 
    } 
    super.Dne(paramzBn);
  }
  
  public pjB(Qnq paramQnq, int paramInt) {
    super(paramQnq);
    this.FWm = false;
    this.vSL = false;
    this.Dne = null;
    kGO(paramInt);
    this.bzF = (sMa)"/mob/villager/villager.png";
    this.cHy = 0.5F;
    Dne(0.6F, 1.8F);
    Dne().FWm(true);
    Dne().Dne(true);
    this.Dne.Dne(0, new Cyb(this));
    this.Dne.Dne(1, new RlP(this, zxd.class, 8.0F, 0.3F, 0.35F));
    this.Dne.Dne(1, new CfL(this));
    this.Dne.Dne(1, new zRI(this));
    this.Dne.Dne(2, new gNt(this));
    this.Dne.Dne(3, new SET(this));
    this.Dne.Dne(4, new Htk(this, true));
    this.Dne.Dne(5, new ZWx(this, 0.3F));
    this.Dne.Dne(6, new uxm(this));
    this.Dne.Dne(7, new YxX(this));
    this.Dne.Dne(8, new oZz(this, 0.32F));
    this.Dne.Dne(9, new mZE(this, FiG.class, 3.0F, 1.0F));
    this.Dne.Dne(9, new mZE(this, pjB.class, 5.0F, 0.02F));
    this.Dne.Dne(9, new IBw(this, 0.3F));
    this.Dne.Dne(10, new yws(this, FUH.class, 8.0F));
  }
  
  protected String div() {
    return "mob.villager.defaultdeath";
  }
  
  public boolean ZfC() {
    return (this.FWm != null);
  }
  
  public void Dne(ybO paramybO) {}
  
  public Azh Dne(Azh paramAzh) {
    return Dne(paramAzh);
  }
  
  private static int Dne(int paramInt, Random paramRandom) {
    INq iNq = (INq)Dne.get(Integer.valueOf(paramInt));
    return (iNq == null) ? 1 : ((((Integer)iNq.Dne()).intValue() >= ((Integer)iNq.FWm()).intValue()) ? ((Integer)iNq.Dne()).intValue() : (((Integer)iNq.Dne()).intValue() + paramRandom.nextInt(((Integer)iNq.FWm()).intValue() - ((Integer)iNq.Dne()).intValue())));
  }
  
  public void Qnq() {
    this.Fnk = true;
  }
  
  public pjB Dne(Azh paramAzh) {
    pjB pjB1 = new pjB((Qnq)this.Dne);
    pjB1.ICU();
    return pjB1;
  }
  
  public boolean ICU() {
    return this.vSL;
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\pjB.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */