import java.util.Random;

public class CVd extends ljW {
  public static final yEI Dne = new wXO(new tip());
  
  protected gDn FWm;
  
  protected gDn Dne;
  
  protected Random Dne = new Random();
  
  protected gDn bzF;
  
  public void Dne(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    boolean bool1 = (paramQnq.kGO(paramInt1, paramInt2, paramInt3) || paramQnq.kGO(paramInt1, paramInt2 + 1, paramInt3)) ? true : false;
    int i = paramQnq.bzF(paramInt1, paramInt2, paramInt3);
    boolean bool2 = ((i & 0x8) != 0) ? true : false;
    if (bool1 && !bool2) {
      paramQnq.FWm(paramInt1, paramInt2, paramInt3, this.FWm, Dne(paramQnq));
      paramQnq.Dne(paramInt1, paramInt2, paramInt3, i | 0x8, 4);
    } else if (!bool1 && bool2) {
      paramQnq.Dne(paramInt1, paramInt2, paramInt3, i & 0xFFFFFFF7, 4);
    } 
  }
  
  public int Dne(Qnq paramQnq) {
    return 4;
  }
  
  public static HQH Dne(int paramInt) {
    return HQH.Dne(paramInt & 0x7);
  }
  
  public void Dne(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3, FUH paramFUH, NMq paramNMq) {
    int i = XbN.Dne(paramQnq, paramInt1, paramInt2, paramInt3, paramFUH);
    paramQnq.Dne(paramInt1, paramInt2, paramInt3, i, 2);
    if (paramNMq.zGp())
      ((UTs)paramQnq.Dne(paramInt1, paramInt2, paramInt3)).Dne(paramNMq.FWm()); 
  }
  
  protected CVd(int paramInt) {
    super(paramInt, KFd.aFZ);
    Dne(JcN.bzF);
  }
  
  public static loO Dne(Cwq paramCwq) {
    HQH hQH = Dne(paramCwq.Qnq());
    double d1 = paramCwq.Dne() + 0.7D * hQH.Dne();
    double d2 = paramCwq.FWm() + 0.7D * hQH.FWm();
    double d3 = paramCwq.bzF() + 0.7D * hQH.bzF();
    return new gmI(d1, d2, d3);
  }
  
  public int Dne(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    return Pdb.Dne((MqS)paramQnq.Dne(paramInt1, paramInt2, paramInt3));
  }
  
  public gDn Dne(int paramInt1, int paramInt2) {
    int i = paramInt2 & 0x7;
    return (paramInt1 == i) ? ((i != 1 && i != 0) ? this.FWm : this.bzF) : ((i != 1 && i != 0) ? ((paramInt1 != 1 && paramInt1 != 0) ? this.Qnq : (gDn)this.Dne) : (gDn)this.Dne);
  }
  
  public void Dne(Rbp paramRbp) {
    this.Qnq = paramRbp.Dne("furnace_side");
    this.Dne = (Random)paramRbp.Dne("furnace_top");
    this.FWm = paramRbp.Dne("dispenser_front");
    this.bzF = paramRbp.Dne("dispenser_front_vertical");
  }
  
  public boolean Dne(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3, FiG paramFiG, int paramInt4, float paramFloat1, float paramFloat2, float paramFloat3) {
    if (paramQnq.aFZ != null)
      return true; 
    UTs uTs = (UTs)paramQnq.Dne(paramInt1, paramInt2, paramInt3);
    if (uTs != null)
      paramFiG.Dne(uTs); 
    return true;
  }
  
  protected void bzF(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3) {
    XSK xSK = new XSK(paramQnq, paramInt1, paramInt2, paramInt3);
    UTs uTs = (UTs)xSK.Dne();
    if (uTs != null) {
      int i = uTs.Dne();
      if (i < 0) {
        paramQnq.Qnq(1001, paramInt1, paramInt2, paramInt3, 0);
      } else {
        NMq nMq = uTs.Dne(i);
        ClS clS = Dne(nMq);
        if (clS != ClS.Dne) {
          NMq nMq1 = clS.Dne(xSK, nMq);
          uTs.Dne(i, (nMq1.Dne == 0) ? null : nMq1);
        } 
      } 
    } 
  }
  
  public boolean a_() {
    return true;
  }
  
  private void Qnq(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3) {
    if (paramQnq.aFZ == null) {
      int i = paramQnq.Dne(paramInt1, paramInt2, paramInt3 - 1);
      int j = paramQnq.Dne(paramInt1, paramInt2, paramInt3 + 1);
      int k = paramQnq.Dne(paramInt1 - 1, paramInt2, paramInt3);
      int m = paramQnq.Dne(paramInt1 + 1, paramInt2, paramInt3);
      byte b = 3;
      if (zKP.FWm[i] != null && zKP.FWm[j] == null)
        b = 3; 
      if (zKP.FWm[j] != null && zKP.FWm[i] == null)
        b = 2; 
      if (zKP.FWm[k] != null && zKP.FWm[m] == null)
        b = 5; 
      if (zKP.FWm[m] != null && zKP.FWm[k] == null)
        b = 4; 
      paramQnq.Dne(paramInt1, paramInt2, paramInt3, b, 2);
    } 
  }
  
  protected ClS Dne(NMq paramNMq) {
    return (ClS)Dne.Dne(paramNMq.Dne());
  }
  
  public void Dne(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3) {
    super.Dne(paramQnq, paramInt1, paramInt2, paramInt3);
    Qnq(paramQnq, paramInt1, paramInt2, paramInt3);
  }
  
  public ipD Dne(Qnq paramQnq) {
    return new UTs();
  }
  
  public void Dne(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5) {
    UTs uTs = (UTs)paramQnq.Dne(paramInt1, paramInt2, paramInt3);
    if (uTs != null) {
      for (byte b = 0; b < uTs.Qnq(); b++) {
        NMq nMq = uTs.Dne(b);
        if (nMq != null) {
          float f1 = this.Dne.nextFloat() * 0.8F + 0.1F;
          float f2 = this.Dne.nextFloat() * 0.8F + 0.1F;
          float f3 = this.Dne.nextFloat() * 0.8F + 0.1F;
          while (nMq.Dne > 0) {
            int i = this.Dne.nextInt(21) + 10;
            if (i > nMq.Dne)
              i = nMq.Dne; 
            nMq.Dne -= i;
            JiM jiM = new JiM(paramQnq, (paramInt1 + f1), (paramInt2 + f2), (paramInt3 + f3), new NMq(nMq.bzF, i, nMq.Qnq()));
            if (nMq.aFZ())
              jiM.Dne().FWm((WkD)nMq.Dne().Dne()); 
            float f = 0.05F;
            jiM.XHL = ((float)this.Dne.nextGaussian() * f);
            jiM.Zpi = ((float)this.Dne.nextGaussian() * f + 0.2F);
            jiM.kGO = ((float)this.Dne.nextGaussian() * f);
            paramQnq.FWm(jiM);
          } 
        } 
      } 
      paramQnq.aFZ(paramInt1, paramInt2, paramInt3, paramInt4);
    } 
    super.Dne(paramQnq, paramInt1, paramInt2, paramInt3, paramInt4, paramInt5);
  }
  
  public void Dne(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3, Random paramRandom) {
    if (paramQnq.aFZ == null)
      bzF(paramQnq, paramInt1, paramInt2, paramInt3); 
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\CVd.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */