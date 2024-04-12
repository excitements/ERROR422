public class PBI extends dEr {
  private int bzF;
  
  private final boolean bzF;
  
  private int DyG;
  
  private int zGp;
  
  private boolean Qnq;
  
  private final int FWm;
  
  private float FWm;
  
  public final int Dne;
  
  private final float Dne = 32;
  
  public float Dne() {
    return this.Dne;
  }
  
  public PBI(int paramInt1, int paramInt2, boolean paramBoolean) {
    this(paramInt1, paramInt2, 0.6F, paramBoolean);
  }
  
  public int a_(NMq paramNMq) {
    return 32;
  }
  
  public PBI Dne(int paramInt1, int paramInt2, int paramInt3, float paramFloat) {
    this.bzF = paramInt1;
    this.zGp = paramInt2;
    this.DyG = paramInt3;
    this.FWm = paramFloat;
    return this;
  }
  
  public boolean aFZ() {
    return this.bzF;
  }
  
  public int FWm() {
    return this.FWm;
  }
  
  public NMq FWm(NMq paramNMq, Qnq paramQnq, FiG paramFiG) {
    paramNMq.Dne--;
    paramFiG.Dne().Dne(this);
    paramQnq.Dne(paramFiG, "random.burp", 0.5F, paramQnq.Dne.nextFloat() * 0.1F + 0.9F);
    Dne(paramNMq, paramQnq, paramFiG);
    return paramNMq;
  }
  
  public PBI(int paramInt1, int paramInt2, float paramFloat, boolean paramBoolean) {
    super(paramInt1);
    this.FWm = paramInt2;
    this.bzF = paramBoolean;
    this.Dne = paramFloat;
    Dne(JcN.DyG);
  }
  
  public PBI Dne() {
    this.Qnq = true;
    return this;
  }
  
  public NMq Dne(NMq paramNMq, Qnq paramQnq, FiG paramFiG) {
    if (paramFiG.Dne(this.Qnq))
      paramFiG.Dne(paramNMq, a_(paramNMq)); 
    return paramNMq;
  }
  
  protected void Dne(NMq paramNMq, Qnq paramQnq, FiG paramFiG) {
    if (paramQnq.aFZ == null && this.bzF && paramQnq.Dne.nextFloat() < this.FWm)
      paramFiG.Qnq(new NAx(this.bzF, this.zGp * 20, this.DyG)); 
  }
  
  public een Dne(NMq paramNMq) {
    return een.FWm;
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\PBI.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */