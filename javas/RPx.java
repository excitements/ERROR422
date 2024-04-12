public class RPx {
  public int FWm;
  
  public int Dne;
  
  final vSL Dne;
  
  public long Dne;
  
  public OdI[] Dne;
  
  public float[] FWm;
  
  public float[] Dne;
  
  public RPx(vSL paramvSL, int paramInt1, int paramInt2) {
    this.Dne = (float[])paramvSL;
    this.Dne = new float[256];
    this.FWm = new float[256];
    this.Dne = (float[])new OdI[256];
    this.Dne = paramInt1;
    this.FWm = paramInt2;
    vSL.Dne(paramvSL).FWm(this.Dne, paramInt1 << 4, paramInt2 << 4, 16, 16);
    vSL.Dne(paramvSL).Dne(this.FWm, paramInt1 << 4, paramInt2 << 4, 16, 16);
    vSL.Dne(paramvSL).Dne((OdI[])this.Dne, paramInt1 << 4, paramInt2 << 4, 16, 16, false);
  }
  
  public OdI Dne(int paramInt1, int paramInt2) {
    return this.Dne[paramInt1 & 0xF | (paramInt2 & 0xF) << 4];
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\RPx.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */