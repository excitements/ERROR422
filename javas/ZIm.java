import net.minecraft.client.Minecraft;

public class ZIm extends CAZ {
  private final BMa Dne;
  
  boolean Dne;
  
  private mbZ Dne;
  
  private int Vxn = 0;
  
  public void Dne() {
    if (this.Vxn == 0 && this.Dne != null) {
      boolean bool = Qnq();
      boolean bool1 = false;
      if (this.Dne.Dne() >= 3) {
        bool1 = true;
      } else {
        for (byte b = 0; b < this.Dne.Dne(); b++) {
          WkD wkD = (WkD)this.Dne.FWm(b);
          if (wkD.Dne("Type") == 1) {
            bool1 = true;
            break;
          } 
        } 
      } 
      String str = "fireworks." + (bool1 ? "largeBlast" : "blast") + (bool ? "_far" : "");
      this.Dne.Dne(this.div, this.IjH, this.mrb, str, 20.0F, 0.95F + this.Dne.nextFloat() * 0.1F, true);
    } 
    if (this.Vxn % 2 == 0 && this.Dne != null && this.Vxn / 2 < this.Dne.Dne()) {
      int i = this.Vxn / 2;
      WkD wkD = (WkD)this.Dne.FWm(i);
      byte b = wkD.Dne("Type");
      boolean bool1 = wkD.FWm("Trail");
      boolean bool2 = wkD.FWm("Flicker");
      int[] arrayOfInt1 = wkD.Dne("Colors");
      int[] arrayOfInt2 = wkD.Dne("FadeColors");
      if (b == 1) {
        Dne(0.5D, 4, arrayOfInt1, arrayOfInt2, bool1, bool2);
      } else if (b == 2) {
        Dne(0.5D, new double[][] { { 0.0D, 1.0D }, , { 0.3455D, 0.309D }, , { 0.9511D, 0.309D }, , { 0.3795918367346939D, -0.12653061224489795D }, , { 0.6122448979591837D, -0.8040816326530612D }, , { 0.0D, -0.35918367346938773D },  }, arrayOfInt1, arrayOfInt2, bool1, bool2, false);
      } else if (b == 3) {
        Dne(0.5D, new double[][] { 
              { 0.0D, 0.2D }, , { 0.2D, 0.2D }, , { 0.2D, 0.6D }, , { 0.6D, 0.6D }, , { 0.6D, 0.2D }, , { 0.2D, 0.2D }, , { 0.2D, 0.0D }, , { 0.4D, 0.0D }, , { 0.4D, -0.6D }, , { 0.2D, -0.6D }, , 
              { 0.2D, -0.4D }, , { 0.0D, -0.4D },  }, arrayOfInt1, arrayOfInt2, bool1, bool2, true);
      } else if (b == 4) {
        Dne(arrayOfInt1, arrayOfInt2, bool1, bool2);
      } else {
        Dne(0.25D, 2, arrayOfInt1, arrayOfInt2, bool1, bool2);
      } 
      int j = arrayOfInt1[0];
      float f1 = ((j & 0xFF0000) >> 16) / 255.0F;
      float f2 = ((j & 0xFF00) >> 8) / 255.0F;
      float f3 = ((j & 0xFF) >> 0) / 255.0F;
      bSX bSX = new bSX((Qnq)this.Dne, this.div, this.IjH, this.mrb);
      bSX.Dne(f1, f2, f3);
      this.Dne.Dne(bSX);
    } 
    this.Vxn++;
    if (this.Vxn > this.Qnq) {
      if (this.Dne != null) {
        boolean bool = Qnq();
        String str = "fireworks." + (bool ? "twinkle_far" : "twinkle");
        this.Dne.Dne(this.div, this.IjH, this.mrb, str, 20.0F, 0.9F + this.Dne.nextFloat() * 0.15F, true);
      } 
      g_();
    } 
  }
  
  private void Dne(double paramDouble, int paramInt, int[] paramArrayOfint1, int[] paramArrayOfint2, boolean paramBoolean1, boolean paramBoolean2) {
    float f1 = this.div;
    float f2 = this.IjH;
    float f3 = this.mrb;
    for (int i = -paramInt; i <= paramInt; i++) {
      for (int j = -paramInt; j <= paramInt; j++) {
        for (int k = -paramInt; k <= paramInt; k++) {
          double d1 = j + (this.Dne.nextDouble() - this.Dne.nextDouble()) * 0.5D;
          double d2 = i + (this.Dne.nextDouble() - this.Dne.nextDouble()) * 0.5D;
          double d3 = k + (this.Dne.nextDouble() - this.Dne.nextDouble()) * 0.5D;
          double d4 = geR.Dne(d1 * d1 + d2 * d2 + d3 * d3) / paramDouble + this.Dne.nextGaussian() * 0.05D;
          Dne(f1, f2, f3, d1 / d4, d2 / d4, d3 / d4, paramArrayOfint1, paramArrayOfint2, paramBoolean1, paramBoolean2);
          if (i != -paramInt && i != paramInt && j != -paramInt && j != paramInt)
            k += paramInt * 2 - 1; 
        } 
      } 
    } 
  }
  
  private void Dne(double paramDouble, double[][] paramArrayOfdouble, int[] paramArrayOfint1, int[] paramArrayOfint2, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3) {
    double d1 = paramArrayOfdouble[0][0];
    double d2 = paramArrayOfdouble[0][1];
    Dne(this.div, this.IjH, this.mrb, d1 * paramDouble, d2 * paramDouble, 0.0D, paramArrayOfint1, paramArrayOfint2, paramBoolean1, paramBoolean2);
    float f = this.Dne.nextFloat() * 3.1415927F;
    double d3 = paramBoolean3 ? 0.034D : 0.34D;
    for (byte b = 0; b < 3; b++) {
      double d4 = f + (b * 3.1415927F) * d3;
      double d5 = d1;
      double d6 = d2;
      for (byte b1 = 1; b1 < paramArrayOfdouble.length; b1++) {
        double d7 = paramArrayOfdouble[b1][0];
        double d8 = paramArrayOfdouble[b1][1];
        double d9;
        for (d9 = 0.25D; d9 <= 1.0D; d9 += 0.25D) {
          double d10 = (d5 + (d7 - d5) * d9) * paramDouble;
          double d11 = (d6 + (d8 - d6) * d9) * paramDouble;
          double d12 = d10 * Math.sin(d4);
          d10 *= Math.cos(d4);
          double d13;
          for (d13 = -1.0D; d13 <= 1.0D; d13 += 2.0D)
            Dne(this.div, this.IjH, this.mrb, d10 * d13, d11, d12 * d13, paramArrayOfint1, paramArrayOfint2, paramBoolean1, paramBoolean2); 
        } 
        d5 = d7;
        d6 = d8;
      } 
    } 
  }
  
  private boolean Qnq() {
    Minecraft minecraft = Minecraft.Dne();
    return (minecraft == null || minecraft.Dne == null || minecraft.Dne.Dne(this.div, this.IjH, this.mrb) >= 256.0D);
  }
  
  private void Dne(int[] paramArrayOfint1, int[] paramArrayOfint2, boolean paramBoolean1, boolean paramBoolean2) {
    double d1 = this.Dne.nextGaussian() * 0.05D;
    double d2 = this.Dne.nextGaussian() * 0.05D;
    for (byte b = 0; b < 70; b++) {
      double d3 = this.XHL * 0.5D + this.Dne.nextGaussian() * 0.15D + d1;
      double d4 = this.kGO * 0.5D + this.Dne.nextGaussian() * 0.15D + d2;
      double d5 = this.Zpi * 0.5D + this.Dne.nextDouble() * 0.5D;
      Dne(this.div, this.IjH, this.mrb, d3, d5, d4, paramArrayOfint1, paramArrayOfint2, paramBoolean1, paramBoolean2);
    } 
  }
  
  private void Dne(double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, double paramDouble5, double paramDouble6, int[] paramArrayOfint1, int[] paramArrayOfint2, boolean paramBoolean1, boolean paramBoolean2) {
    HkG hkG = new HkG((Qnq)this.Dne, paramDouble1, paramDouble2, paramDouble3, paramDouble4, paramDouble5, paramDouble6, (BMa)this.Dne);
    hkG.Dne(paramBoolean1);
    hkG.FWm(paramBoolean2);
    int i = this.Dne.nextInt(paramArrayOfint1.length);
    hkG.Dne(paramArrayOfint1[i]);
    if (paramArrayOfint2 != null && paramArrayOfint2.length > 0)
      hkG.FWm(paramArrayOfint2[this.Dne.nextInt(paramArrayOfint2.length)]); 
    this.Dne.Dne(hkG);
  }
  
  public void Dne(WAR paramWAR, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6) {}
  
  public ZIm(Qnq paramQnq, double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, double paramDouble5, double paramDouble6, BMa paramBMa, WkD paramWkD) {
    super(paramQnq, paramDouble1, paramDouble2, paramDouble3, 0.0D, 0.0D, 0.0D);
    this.XHL = paramDouble4;
    this.Zpi = paramDouble5;
    this.kGO = paramDouble6;
    this.Dne = (mbZ)paramBMa;
    this.Qnq = 8;
    if (paramWkD != null) {
      this.Dne = paramWkD.Dne("Explosions");
      if (this.Dne.Dne() == 0) {
        this.Dne = null;
      } else {
        this.Qnq = this.Dne.Dne() * 2 - 1;
        for (byte b = 0; b < this.Dne.Dne(); b++) {
          WkD wkD = (WkD)this.Dne.FWm(b);
          if (wkD.FWm("Flicker")) {
            this.Dne = true;
            this.Qnq += 15;
            break;
          } 
        } 
      } 
    } 
  }
  
  public int Dne() {
    return 0;
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\ZIm.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */