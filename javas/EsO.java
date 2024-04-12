import net.minecraft.client.Minecraft;

public class EsO {
  private double Dne;
  
  private long Dne;
  
  public float Qnq = 0.0F;
  
  public float bzF;
  
  private double FWm;
  
  private long bzF = 1.0F;
  
  private long FWm;
  
  public int Dne;
  
  public float FWm = 1.0D;
  
  float Dne;
  
  public void Dne() {
    long l1 = Minecraft.Dne();
    long l2 = l1 - this.Dne;
    long l3 = System.nanoTime() / 1000000L;
    double d1 = l3 / 1000.0D;
    if (l2 <= 1000L && l2 >= 0L) {
      this.bzF += l2;
      if (this.bzF > 1000L) {
        long l = l3 - this.FWm;
        double d = this.bzF / l;
        this.FWm += (d - this.FWm) * 0.20000000298023224D;
        this.FWm = l3;
        this.bzF = 0L;
      } 
      if (this.bzF < 0L)
        this.FWm = l3; 
    } else {
      this.Dne = d1;
    } 
    this.Dne = l1;
    double d2 = (d1 - this.Dne) * this.FWm;
    this.Dne = d1;
    if (d2 < 0.0D)
      d2 = 0.0D; 
    if (d2 > 1.0D)
      d2 = 1.0D; 
    this.Qnq = (float)(this.Qnq + d2 * this.bzF * this.Dne);
    this.Dne = (int)this.Qnq;
    this.Qnq -= this.Dne;
    if (this.Dne > 10)
      this.Dne = 10; 
    this.FWm = this.Qnq;
  }
  
  public EsO(float paramFloat) {
    this.Dne = paramFloat;
    this.Dne = Minecraft.Dne();
    this.FWm = System.nanoTime() / 1000000L;
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\EsO.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */