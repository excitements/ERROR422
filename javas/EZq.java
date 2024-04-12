public class EZq extends dEr {
  protected CNI Dne;
  
  public boolean FWm() {
    return true;
  }
  
  public boolean Dne(NMq paramNMq, FiG paramFiG, Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3, int paramInt4, float paramFloat1, float paramFloat2, float paramFloat3) {
    if (!paramFiG.Dne(paramInt1, paramInt2, paramInt3, paramInt4, paramNMq))
      return false; 
    int i = paramQnq.Dne(paramInt1, paramInt2, paramInt3);
    int j = paramQnq.Dne(paramInt1, paramInt2 + 1, paramInt3);
    if ((paramInt4 == 0 || j != 0 || i != ((ZQN)zKP.Dne).FWm) && i != zKP.FWm.FWm)
      return false; 
    zKP zKP = zKP.rPc;
    paramQnq.Dne((paramInt1 + 0.5F), (paramInt2 + 0.5F), (paramInt3 + 0.5F), zKP.kGO.bzF(), (zKP.kGO.Dne() + 1.0F) / 2.0F, zKP.kGO.FWm() * 0.8F);
    if (paramQnq.aFZ != null)
      return true; 
    paramQnq.FWm(paramInt1, paramInt2, paramInt3, zKP.FWm);
    paramNMq.Dne(1, paramFiG);
    return true;
  }
  
  public EZq(int paramInt, CNI paramCNI) {
    super(paramInt);
    this.Dne = paramCNI;
    this.aFZ = 1;
    FWm(paramCNI.Dne());
    Dne(JcN.div);
  }
  
  public String Dne() {
    return this.Dne.toString();
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\EZq.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */