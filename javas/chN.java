public class chN {
  public double Dne;
  
  public double FWm;
  
  public double bzF;
  
  public final ziS FWm;
  
  public static final ziS Dne = new ziS(-1, -1);
  
  public chN FWm(chN paramchN, double paramDouble) {
    double d1 = paramchN.Dne - this.Dne;
    double d2 = paramchN.FWm - this.FWm;
    double d3 = paramchN.bzF - this.bzF;
    if (d2 * d2 < 1.0000000116860974E-7D)
      return null; 
    double d4 = (paramDouble - this.FWm) / d2;
    return (d4 >= 0.0D && d4 <= 1.0D) ? this.FWm.Dne(this.Dne + d1 * d4, this.FWm + d2 * d4, this.bzF + d3 * d4) : null;
  }
  
  public static chN Dne(double paramDouble1, double paramDouble2, double paramDouble3) {
    return new chN(Dne, paramDouble1, paramDouble2, paramDouble3);
  }
  
  public chN FWm(chN paramchN) {
    return this.FWm.Dne(this.FWm * paramchN.bzF - this.bzF * paramchN.FWm, this.bzF * paramchN.Dne - this.Dne * paramchN.bzF, this.Dne * paramchN.FWm - this.FWm * paramchN.Dne);
  }
  
  public chN Dne() {
    double d = geR.Dne(this.Dne * this.Dne + this.FWm * this.FWm + this.bzF * this.bzF);
    return (d < 1.0E-4D) ? this.FWm.Dne(0.0D, 0.0D, 0.0D) : this.FWm.Dne(this.Dne / d, this.FWm / d, this.bzF / d);
  }
  
  public double Dne(double paramDouble1, double paramDouble2, double paramDouble3) {
    double d1 = paramDouble1 - this.Dne;
    double d2 = paramDouble2 - this.FWm;
    double d3 = paramDouble3 - this.bzF;
    return d1 * d1 + d2 * d2 + d3 * d3;
  }
  
  public chN Dne(chN paramchN, double paramDouble) {
    double d1 = paramchN.Dne - this.Dne;
    double d2 = paramchN.FWm - this.FWm;
    double d3 = paramchN.bzF - this.bzF;
    if (d1 * d1 < 1.0000000116860974E-7D)
      return null; 
    double d4 = (paramDouble - this.Dne) / d1;
    return (d4 >= 0.0D && d4 <= 1.0D) ? this.FWm.Dne(this.Dne + d1 * d4, this.FWm + d2 * d4, this.bzF + d3 * d4) : null;
  }
  
  public void Dne(float paramFloat) {
    float f1 = geR.FWm(paramFloat);
    float f2 = geR.Dne(paramFloat);
    ziS ziS1 = this.Dne;
    double d1 = this.FWm * f1 + this.bzF * f2;
    double d2 = this.bzF * f1 - this.FWm * f2;
    this.Dne = ziS1;
    this.FWm = d1;
    this.bzF = d2;
  }
  
  public void FWm(float paramFloat) {
    float f1 = geR.FWm(paramFloat);
    float f2 = geR.Dne(paramFloat);
    double d1 = this.Dne * f1 + this.bzF * f2;
    ziS ziS1 = this.FWm;
    double d2 = this.bzF * f1 - this.Dne * f2;
    this.Dne = d1;
    this.FWm = ziS1;
    this.bzF = d2;
  }
  
  public double bzF(chN paramchN) {
    double d1 = paramchN.Dne - this.Dne;
    double d2 = paramchN.FWm - this.FWm;
    double d3 = paramchN.bzF - this.bzF;
    return d1 * d1 + d2 * d2 + d3 * d3;
  }
  
  protected chN(ziS paramziS, double paramDouble1, double paramDouble2, double paramDouble3) {
    if (paramDouble1 == -0.0D)
      paramDouble1 = 0.0D; 
    if (paramDouble2 == -0.0D)
      paramDouble2 = 0.0D; 
    if (paramDouble3 == -0.0D)
      paramDouble3 = 0.0D; 
    this.Dne = paramDouble1;
    this.FWm = paramDouble2;
    this.bzF = paramDouble3;
    this.FWm = paramziS;
  }
  
  public String toString() {
    return "(" + this.Dne + ", " + this.FWm + ", " + this.bzF + ")";
  }
  
  public double Dne() {
    return geR.Dne(this.Dne * this.Dne + this.FWm * this.FWm + this.bzF * this.bzF);
  }
  
  protected chN FWm(double paramDouble1, double paramDouble2, double paramDouble3) {
    this.Dne = paramDouble1;
    this.FWm = paramDouble2;
    this.bzF = paramDouble3;
    return this;
  }
  
  public chN Dne(chN paramchN) {
    return this.FWm.Dne(paramchN.Dne - this.Dne, paramchN.FWm - this.FWm, paramchN.bzF - this.bzF);
  }
  
  public void bzF(float paramFloat) {
    float f1 = geR.FWm(paramFloat);
    float f2 = geR.Dne(paramFloat);
    double d1 = this.Dne * f1 + this.FWm * f2;
    double d2 = this.FWm * f1 - this.Dne * f2;
    double d3 = this.bzF;
    this.Dne = d1;
    this.FWm = d2;
    this.bzF = d3;
  }
  
  public double FWm(chN paramchN) {
    double d1 = paramchN.Dne - this.Dne;
    double d2 = paramchN.FWm - this.FWm;
    double d3 = paramchN.bzF - this.bzF;
    return geR.Dne(d1 * d1 + d2 * d2 + d3 * d3);
  }
  
  public double Dne(chN paramchN) {
    return this.Dne * paramchN.Dne + this.FWm * paramchN.FWm + this.bzF * paramchN.bzF;
  }
  
  public chN bzF(chN paramchN, double paramDouble) {
    double d1 = paramchN.Dne - this.Dne;
    double d2 = paramchN.FWm - this.FWm;
    double d3 = paramchN.bzF - this.bzF;
    if (d3 * d3 < 1.0000000116860974E-7D)
      return null; 
    double d4 = (paramDouble - this.bzF) / d3;
    return (d4 >= 0.0D && d4 <= 1.0D) ? this.FWm.Dne(this.Dne + d1 * d4, this.FWm + d2 * d4, this.bzF + d3 * d4) : null;
  }
  
  public chN bzF(double paramDouble1, double paramDouble2, double paramDouble3) {
    return this.FWm.Dne(this.Dne + paramDouble1, this.FWm + paramDouble2, this.bzF + paramDouble3);
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\chN.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */