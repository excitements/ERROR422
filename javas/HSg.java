class HSg extends onZ {
  final int Dne;
  
  final Qnq Dne;
  
  final sZS Dne;
  
  final int bzF;
  
  final int FWm;
  
  public void Dne(FiG paramFiG, NMq paramNMq) {
    if (!((uqg)paramFiG.Dne).Qnq)
      paramFiG.FWm(-this.Dne.FWm); 
    sZS.Dne(this.Dne).Dne(0, (NMq)null);
    if (sZS.Dne(this.Dne) > 0) {
      NMq nMq = sZS.Dne(this.Dne).Dne(1);
      if (nMq != null && nMq.Dne > sZS.Dne(this.Dne)) {
        nMq.Dne -= sZS.Dne(this.Dne);
        sZS.Dne(this.Dne).Dne(1, nMq);
      } else {
        sZS.Dne(this.Dne).Dne(1, (NMq)null);
      } 
    } else {
      sZS.Dne(this.Dne).Dne(1, (NMq)null);
    } 
    this.Dne.FWm = false;
    if (!((uqg)paramFiG.Dne).Qnq && ((Qnq)this.Dne).aFZ == null && this.Dne.Dne(this.Dne, this.FWm, this.bzF) == zKP.etZ.FWm && paramFiG.Dne().nextFloat() < 0.12F) {
      int i = this.Dne.bzF(this.Dne, this.FWm, this.bzF);
      int j = i & 0x3;
      int k = i >> 2;
      if (++k > 2) {
        this.Dne.Qnq(this.Dne, this.FWm, this.bzF);
        this.Dne.Qnq(1020, this.Dne, this.FWm, this.bzF, 0);
      } else {
        this.Dne.Dne(this.Dne, this.FWm, this.bzF, j | k << 2, 2);
        this.Dne.Qnq(1021, this.Dne, this.FWm, this.bzF, 0);
      } 
    } else if (((Qnq)this.Dne).aFZ == null) {
      this.Dne.Qnq(1021, this.Dne, this.FWm, this.bzF, 0);
    } 
  }
  
  HSg(sZS paramsZS, MqS paramMqS, int paramInt1, int paramInt2, int paramInt3, Qnq paramQnq, int paramInt4, int paramInt5, int paramInt6) {
    super(paramMqS, paramInt1, paramInt2, paramInt3);
    this.Dne = paramsZS;
    this.Dne = (sZS)paramQnq;
    this.Dne = paramInt4;
    this.FWm = paramInt5;
    this.bzF = paramInt6;
  }
  
  public boolean Dne(FiG paramFiG) {
    return ((((uqg)paramFiG.Dne).Qnq || paramFiG.eHV >= this.Dne.FWm) && this.Dne.FWm > null && Dne());
  }
  
  public boolean Dne(NMq paramNMq) {
    return false;
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\HSg.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */