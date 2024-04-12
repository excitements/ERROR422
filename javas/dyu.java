class dyu {
  int Dne;
  
  frg Dne = new frg();
  
  int FWm;
  
  void Dne() {
    this.Dne.Dne();
  }
  
  static float Dne(float paramFloat1, float paramFloat2) {
    return (float)Math.sqrt((paramFloat1 * paramFloat1 + paramFloat2 * paramFloat2));
  }
  
  void Dne(int paramInt1, int paramInt2) {
    this.Dne = paramInt1;
    this.FWm = paramInt2;
    this.Dne.Dne(paramInt1 * 2);
  }
  
  float Dne(float[] paramArrayOffloat1, float[] paramArrayOffloat2) {
    frg frg1 = this.Dne;
    float[] arrayOfFloat = new float[frg1 + frg1];
    float f = (float)(0.5D / frg1);
    byte b;
    for (b = 0; b < frg1; b++) {
      arrayOfFloat[b * 2] = paramArrayOffloat1[b] * f;
      arrayOfFloat[b * 2 + 1] = 0.0F;
    } 
    arrayOfFloat[frg1 * 2 - 1] = paramArrayOffloat1[frg1 - 1] * f;
    int i = frg1 * 2;
    this.Dne.Dne(arrayOfFloat);
    b = 0;
    int j = i / 2;
    while (b < i / 2) {
      float f1 = arrayOfFloat[b];
      arrayOfFloat[b++] = arrayOfFloat[j];
      arrayOfFloat[j++] = f1;
    } 
    return Dne(arrayOfFloat, paramArrayOffloat2, i, this.FWm);
  }
  
  static float Dne(float[] paramArrayOffloat1, float[] paramArrayOffloat2, int paramInt1, int paramInt2) {
    float[] arrayOfFloat = new float[paramInt2 + 1];
    int i = paramInt2 + 1;
    while (i-- != 0) {
      float f1 = 0.0F;
      for (int j = i; j < paramInt1; j++)
        f1 += paramArrayOffloat1[j] * paramArrayOffloat1[j - i]; 
      arrayOfFloat[i] = f1;
    } 
    float f = arrayOfFloat[0];
    for (byte b = 0; b < paramInt2; b++) {
      float f1 = -arrayOfFloat[b + 1];
      if (f == 0.0F) {
        for (byte b1 = 0; b1 < paramInt2; b1++)
          paramArrayOffloat2[b1] = 0.0F; 
        return 0.0F;
      } 
      for (i = 0; i < b; i++)
        f1 -= paramArrayOffloat2[i] * arrayOfFloat[b - i]; 
      f1 /= f;
      paramArrayOffloat2[b] = f1;
      for (i = 0; i < b / 2; i++) {
        float f2 = paramArrayOffloat2[i];
        paramArrayOffloat2[i] = paramArrayOffloat2[i] + f1 * paramArrayOffloat2[b - 1 - i];
        paramArrayOffloat2[b - 1 - i] = paramArrayOffloat2[b - 1 - i] + f1 * f2;
      } 
      if (b % 2 != 0)
        paramArrayOffloat2[i] = paramArrayOffloat2[i] + paramArrayOffloat2[i] * f1; 
      f = (float)(f * (1.0D - (f1 * f1)));
    } 
    return f;
  }
  
  void Dne(float[] paramArrayOffloat1, float[] paramArrayOffloat2, float paramFloat) {
    int i;
    for (i = 0; i < this.Dne * 2; i++)
      paramArrayOffloat1[i] = 0.0F; 
    if (paramFloat == 0.0F)
      return; 
    for (i = 0; i < this.FWm; i++) {
      paramArrayOffloat1[i * 2 + 1] = paramArrayOffloat2[i] / 4.0F * paramFloat;
      paramArrayOffloat1[i * 2 + 2] = -paramArrayOffloat2[i] / 4.0F * paramFloat;
    } 
    this.Dne.Dne(paramArrayOffloat1);
    i = this.Dne * 2;
    float f = (float)(1.0D / paramFloat);
    paramArrayOffloat1[0] = (float)(1.0D / (paramArrayOffloat1[0] * 2.0F + f));
    for (byte b = 1; b < this.Dne; b++) {
      float f1 = paramArrayOffloat1[b] + paramArrayOffloat1[i - b];
      float f2 = paramArrayOffloat1[b] - paramArrayOffloat1[i - b];
      float f3 = f1 + f;
      paramArrayOffloat1[b] = (float)(1.0D / Dne(f3, f2));
    } 
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\dyu.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */