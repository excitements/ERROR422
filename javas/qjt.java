import net.minecraft.client.Minecraft;

public class qjt extends xPm {
  public double FWm;
  
  public double Dne;
  
  public static qjt Dne;
  
  public qjt() {
    super("compass");
    Dne = this;
  }
  
  public void Dne(Qnq paramQnq, double paramDouble1, double paramDouble2, double paramDouble3, boolean paramBoolean1, boolean paramBoolean2) {
    double d = 0.0D;
    if (paramQnq != null && !paramBoolean1) {
      iSh iSh = paramQnq.Dne();
      double d1 = iSh.Dne - paramDouble1;
      double d2 = iSh.bzF - paramDouble2;
      paramDouble3 %= 360.0D;
      d = -((paramDouble3 - 90.0D) * Math.PI / 180.0D - Math.atan2(d2, d1));
      if (!paramQnq.Dne.Dne())
        d = Math.random() * Math.PI * 2.0D; 
    } 
    if (paramBoolean2) {
      this.Dne = d;
    } else {
      double d1;
      for (d1 = d - this.Dne; d1 < -3.141592653589793D; d1 += 6.283185307179586D);
      while (d1 >= Math.PI)
        d1 -= 6.283185307179586D; 
      if (d1 < -1.0D)
        d1 = -1.0D; 
      if (d1 > 1.0D)
        d1 = 1.0D; 
      this.FWm += d1 * 0.1D;
      this.FWm *= 0.8D;
      this.Dne += this.FWm;
    } 
    int i;
    for (i = (int)((this.Dne / 6.283185307179586D + 1.0D) * this.Dne.size()) % this.Dne.size(); i < 0; i = (i + this.Dne.size()) % this.Dne.size());
    if (i != this.bzF) {
      this.bzF = i;
      this.Dne.Dne(this.Dne, this.FWm, this.Dne.get(this.bzF), this.Dne);
    } 
  }
  
  public void Dne() {
    Minecraft minecraft = Minecraft.Dne();
    if (minecraft.Dne != null && minecraft.Dne != null) {
      Dne(minecraft.Dne, ((MJs)minecraft.Dne).div, ((MJs)minecraft.Dne).mrb, ((MJs)minecraft.Dne).mrb, false, false);
    } else {
      Dne((Qnq)null, 0.0D, 0.0D, 0.0D, true, false);
    } 
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\qjt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */