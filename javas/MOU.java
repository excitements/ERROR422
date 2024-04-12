public class MOU {
  int zGp;
  
  int Qnq;
  
  long Dne;
  
  int div;
  
  int Dne;
  
  int bzF;
  
  int aFZ;
  
  int IjH;
  
  qbC Dne;
  
  int DyG;
  
  int FWm;
  
  int mrb;
  
  AOl Dne;
  
  long FWm;
  
  float[][] Dne = new float[0][];
  
  public int Dne() {
    if (this.Dne != null && ((AOl)this.Dne).bzF != 0)
      this.Dne.bzF(); 
    return 0;
  }
  
  public int Dne(qlF paramqlF) {
    int i = ((AOl)this.Dne).Dne;
    this.Dne.Dne(paramqlF.Dne, paramqlF.Dne, paramqlF.FWm);
    if (this.Dne.FWm(1) != 0)
      return -1; 
    int j = this.Dne.FWm(((AOl)this.Dne).Qnq);
    if (j == -1)
      return -1; 
    this.aFZ = j;
    this.FWm = (i.Dne[this.aFZ]).Dne;
    if (this.FWm != 0L) {
      this.Dne = this.Dne.FWm(1);
      this.bzF = this.Dne.FWm(1);
      if (this.bzF == -1)
        return -1; 
    } else {
      this.Dne = false;
      this.bzF = 0;
    } 
    this.Dne = (float[][])paramqlF.Dne;
    this.FWm = paramqlF.FWm - 3L;
    this.zGp = paramqlF.Qnq;
    this.Qnq = i.Dne[this.FWm];
    if (this.Dne.length < i.FWm)
      this.Dne = new float[i.FWm][]; 
    int k;
    for (k = 0; k < i.FWm; k++) {
      if (this.Dne[k] == null || (this.Dne[k]).length < this.Qnq) {
        this.Dne[k] = new float[this.Qnq];
      } else {
        for (byte b = 0; b < this.Qnq; b++)
          this.Dne[k][b] = 0.0F; 
      } 
    } 
    k = i.FWm[(i.Dne[this.aFZ]).Qnq];
    return ghN.Dne[k].Dne(this, ((AOl)this.Dne).Dne[this.aFZ]);
  }
  
  public void Dne(AOl paramAOl) {
    this.Dne = (float[][])paramAOl;
  }
  
  public MOU(AOl paramAOl) {
    this.Dne = (float[][])new qbC();
    this.Dne = (float[][])paramAOl;
    if (paramAOl.bzF != 0)
      this.Dne.Dne(); 
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\MOU.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */