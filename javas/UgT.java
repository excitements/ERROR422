public class UgT {
  public final float zGp;
  
  public final float bzF;
  
  public final float Dne;
  
  private mUU[] Dne;
  
  public final float aFZ;
  
  private laH[] Dne;
  
  public String Dne;
  
  public final float Qnq;
  
  public final float FWm;
  
  public void Dne(WAR paramWAR, float paramFloat) {
    for (byte b = 0; b < this.Dne.length; b++)
      this.Dne[b].Dne(paramWAR, paramFloat); 
  }
  
  public UgT(rxL paramrxL, int paramInt1, int paramInt2, float paramFloat1, float paramFloat2, float paramFloat3, int paramInt3, int paramInt4, int paramInt5, float paramFloat4) {
    this.Dne = paramFloat1;
    this.FWm = paramFloat2;
    this.bzF = paramFloat3;
    this.Qnq = paramFloat1 + paramInt3;
    this.aFZ = paramFloat2 + paramInt4;
    this.zGp = paramFloat3 + paramInt5;
    this.Dne = (String)new laH[8];
    this.Dne = (String)new mUU[6];
    float f1 = paramFloat1 + paramInt3;
    float f2 = paramFloat2 + paramInt4;
    float f3 = paramFloat3 + paramInt5;
    paramFloat1 -= paramFloat4;
    paramFloat2 -= paramFloat4;
    paramFloat3 -= paramFloat4;
    f1 += paramFloat4;
    f2 += paramFloat4;
    f3 += paramFloat4;
    if (paramrxL.Dne != null) {
      float f = f1;
      f1 = paramFloat1;
      paramFloat1 = f;
    } 
    laH laH1 = new laH(paramFloat1, paramFloat2, paramFloat3, 0.0F, 0.0F);
    laH laH2 = new laH(f1, paramFloat2, paramFloat3, 0.0F, 8.0F);
    laH laH3 = new laH(f1, f2, paramFloat3, 8.0F, 8.0F);
    laH laH4 = new laH(paramFloat1, f2, paramFloat3, 8.0F, 0.0F);
    laH laH5 = new laH(paramFloat1, paramFloat2, f3, 0.0F, 0.0F);
    laH laH6 = new laH(f1, paramFloat2, f3, 0.0F, 8.0F);
    laH laH7 = new laH(f1, f2, f3, 8.0F, 8.0F);
    laH laH8 = new laH(paramFloat1, f2, f3, 8.0F, 0.0F);
    this.Dne[0] = (String)laH1;
    this.Dne[1] = (String)laH2;
    this.Dne[2] = (String)laH3;
    this.Dne[3] = (String)laH4;
    this.Dne[4] = (String)laH5;
    this.Dne[5] = (String)laH6;
    this.Dne[6] = (String)laH7;
    this.Dne[7] = (String)laH8;
    this.Dne[0] = (String)new mUU(new laH[] { laH6, laH2, laH3, laH7 }, paramInt1 + paramInt5 + paramInt3, paramInt2 + paramInt5, paramInt1 + paramInt5 + paramInt3 + paramInt5, paramInt2 + paramInt5 + paramInt4, paramrxL.Dne, paramrxL.FWm);
    this.Dne[1] = (String)new mUU(new laH[] { laH1, laH5, laH8, laH4 }, paramInt1, paramInt2 + paramInt5, paramInt1 + paramInt5, paramInt2 + paramInt5 + paramInt4, paramrxL.Dne, paramrxL.FWm);
    this.Dne[2] = (String)new mUU(new laH[] { laH6, laH5, laH1, laH2 }, paramInt1 + paramInt5, paramInt2, paramInt1 + paramInt5 + paramInt3, paramInt2 + paramInt5, paramrxL.Dne, paramrxL.FWm);
    this.Dne[3] = (String)new mUU(new laH[] { laH3, laH4, laH8, laH7 }, paramInt1 + paramInt5 + paramInt3, paramInt2 + paramInt5, paramInt1 + paramInt5 + paramInt3 + paramInt3, paramInt2, paramrxL.Dne, paramrxL.FWm);
    this.Dne[4] = (String)new mUU(new laH[] { laH2, laH1, laH4, laH3 }, paramInt1 + paramInt5, paramInt2 + paramInt5, paramInt1 + paramInt5 + paramInt3, paramInt2 + paramInt5 + paramInt4, paramrxL.Dne, paramrxL.FWm);
    this.Dne[5] = (String)new mUU(new laH[] { laH5, laH6, laH7, laH8 }, paramInt1 + paramInt5 + paramInt3 + paramInt5, paramInt2 + paramInt5, paramInt1 + paramInt5 + paramInt3 + paramInt5 + paramInt3, paramInt2 + paramInt5 + paramInt4, paramrxL.Dne, paramrxL.FWm);
    if (paramrxL.Dne != null)
      for (byte b = 0; b < this.Dne.length; b++)
        this.Dne[b].Dne();  
  }
  
  public UgT Dne(String paramString) {
    this.Dne = paramString;
    return this;
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\UgT.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */