public class DOP {
  public float[] bzF;
  
  public float[] FWm;
  
  public float[] Dne;
  
  public float[][] Dne = new float[16][16];
  
  public DOP() {
    this.Dne = (float[][])new float[16];
    this.FWm = new float[16];
    this.bzF = new float[16];
  }
  
  public boolean Dne(double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, double paramDouble5, double paramDouble6) {
    for (byte b = 0; b < 6; b++) {
      if (this.Dne[b][0] * paramDouble1 + this.Dne[b][1] * paramDouble2 + this.Dne[b][2] * paramDouble3 + this.Dne[b][3] <= 0.0D && this.Dne[b][0] * paramDouble4 + this.Dne[b][1] * paramDouble2 + this.Dne[b][2] * paramDouble3 + this.Dne[b][3] <= 0.0D && this.Dne[b][0] * paramDouble1 + this.Dne[b][1] * paramDouble5 + this.Dne[b][2] * paramDouble3 + this.Dne[b][3] <= 0.0D && this.Dne[b][0] * paramDouble4 + this.Dne[b][1] * paramDouble5 + this.Dne[b][2] * paramDouble3 + this.Dne[b][3] <= 0.0D && this.Dne[b][0] * paramDouble1 + this.Dne[b][1] * paramDouble2 + this.Dne[b][2] * paramDouble6 + this.Dne[b][3] <= 0.0D && this.Dne[b][0] * paramDouble4 + this.Dne[b][1] * paramDouble2 + this.Dne[b][2] * paramDouble6 + this.Dne[b][3] <= 0.0D && this.Dne[b][0] * paramDouble1 + this.Dne[b][1] * paramDouble5 + this.Dne[b][2] * paramDouble6 + this.Dne[b][3] <= 0.0D && this.Dne[b][0] * paramDouble4 + this.Dne[b][1] * paramDouble5 + this.Dne[b][2] * paramDouble6 + this.Dne[b][3] <= 0.0D)
        return false; 
    } 
    return true;
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\DOP.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */