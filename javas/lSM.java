public class lSM {
  private float FWm;
  
  private float Dne;
  
  private float bzF;
  
  public float Dne(float paramFloat1, float paramFloat2) {
    this.Dne += paramFloat1;
    paramFloat1 = (this.Dne - this.FWm) * paramFloat2;
    this.bzF += (paramFloat1 - this.bzF) * 0.5F;
    if ((paramFloat1 > 0.0F && paramFloat1 > this.bzF) || (paramFloat1 < 0.0F && paramFloat1 < this.bzF))
      paramFloat1 = this.bzF; 
    this.FWm += paramFloat1;
    return paramFloat1;
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\lSM.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */