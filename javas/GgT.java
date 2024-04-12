import java.util.Random;

class GgT extends Xtu {
  private GgT() {}
  
  static {
  
  }
  
  GgT(ywz paramywz) {
    this();
  }
  
  public void Dne(Random paramRandom, int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean) {
    if (paramBoolean) {
      this.Dne = zKP.WvN.FWm;
      float f = paramRandom.nextFloat();
      if (f < 0.2F) {
        this.FWm = 2;
      } else if (f < 0.5F) {
        this.FWm = 1;
      } else if (f < 0.55F) {
        this.Dne = zKP.tIz.FWm;
        this.FWm = 2;
      } else {
        this.FWm = 0;
      } 
    } else {
      this.Dne = 0;
      this.FWm = 0;
    } 
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\GgT.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */