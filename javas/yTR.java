import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class yTR {
  public double bzF;
  
  private int Dne;
  
  public double FWm;
  
  public boolean FWm = true;
  
  public float Dne;
  
  public boolean Dne;
  
  private Qnq Dne;
  
  private Random Dne;
  
  public List Dne;
  
  private Map Dne;
  
  public double Dne;
  
  public sMa Dne = false;
  
  public yTR(Qnq paramQnq, sMa paramsMa, double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat) {
    this.Dne = 16;
    this.Dne = (sMa)new Random();
    this.Dne = (sMa)new ArrayList();
    this.Dne = (sMa)new HashMap<>();
    this.Dne = (sMa)paramQnq;
    this.Dne = paramsMa;
    this.Dne = paramFloat;
    this.Dne = paramDouble1;
    this.FWm = paramDouble2;
    this.bzF = paramDouble3;
  }
  
  public void Dne(boolean paramBoolean) {
    this.Dne.Dne(this.Dne, this.FWm, this.bzF, "random.explode", 4.0F, (1.0F + (((Qnq)this.Dne).Dne.nextFloat() - ((Qnq)this.Dne).Dne.nextFloat()) * 0.2F) * 0.7F);
    if (this.Dne >= 2.0F && this.FWm) {
      this.Dne.Dne("hugeexplosion", this.Dne, this.FWm, this.bzF, 1.0D, 0.0D, 0.0D);
    } else {
      this.Dne.Dne("largeexplode", this.Dne, this.FWm, this.bzF, 1.0D, 0.0D, 0.0D);
    } 
    if (this.FWm)
      for (EyB eyB : this.Dne) {
        int i = eyB.Dne;
        int j = eyB.FWm;
        int k = eyB.bzF;
        int m = this.Dne.Dne(i, j, k);
        if (paramBoolean) {
          double d1 = (i + ((Qnq)this.Dne).Dne.nextFloat());
          double d2 = (j + ((Qnq)this.Dne).Dne.nextFloat());
          double d3 = (k + ((Qnq)this.Dne).Dne.nextFloat());
          double d4 = d1 - this.Dne;
          double d5 = d2 - this.FWm;
          double d6 = d3 - this.bzF;
          double d7 = geR.Dne(d4 * d4 + d5 * d5 + d6 * d6);
          d4 /= d7;
          d5 /= d7;
          d6 /= d7;
          double d8 = 0.5D / (d7 / this.Dne + 0.1D);
          d8 *= (((Qnq)this.Dne).Dne.nextFloat() * ((Qnq)this.Dne).Dne.nextFloat() + 0.3F);
          d4 *= d8;
          d5 *= d8;
          d6 *= d8;
          this.Dne.Dne("explode", (d1 + this.Dne * 1.0D) / 2.0D, (d2 + this.FWm * 1.0D) / 2.0D, (d3 + this.bzF * 1.0D) / 2.0D, d4, d5, d6);
          this.Dne.Dne("smoke", d1, d2, d3, d4, d5, d6);
        } 
        if (m > 0) {
          dNT dNT = zKP.Dne[m];
          if (dNT.Dne(this))
            dNT.Dne((Qnq)this.Dne, i, j, k, this.Dne.bzF(i, j, k), 1.0F / this.Dne, 0); 
          this.Dne.FWm(i, j, k, 0, 0, 3);
          dNT.Dne((Qnq)this.Dne, i, j, k, this);
        } 
      }  
    if (this.Dne != null)
      for (EyB eyB : this.Dne) {
        int i = eyB.Dne;
        int j = eyB.FWm;
        int k = eyB.bzF;
        int m = this.Dne.Dne(i, j, k);
        int n = this.Dne.Dne(i, j - 1, k);
        if (m == 0 && zKP.FWm[n] != null && this.Dne.nextInt(3) == 0)
          this.Dne.FWm(i, j, k, ((iqp)zKP.Dne).FWm); 
      }  
  }
  
  public void Dne() {
    sMa sMa1 = this.Dne;
    HashSet<EyB> hashSet = new HashSet();
    int i;
    for (i = 0; i < this.Dne; i++) {
      for (byte b1 = 0; b1 < this.Dne; b1++) {
        for (byte b2 = 0; b2 < this.Dne; b2++) {
          if (i == 0 || i == this.Dne - 1 || b1 == 0 || b1 == this.Dne - 1 || b2 == 0 || b2 == this.Dne - 1) {
            double d2 = (i / (this.Dne - 1.0F) * 2.0F - 1.0F);
            double d3 = (b1 / (this.Dne - 1.0F) * 2.0F - 1.0F);
            double d4 = (b2 / (this.Dne - 1.0F) * 2.0F - 1.0F);
            double d5 = Math.sqrt(d2 * d2 + d3 * d3 + d4 * d4);
            d2 /= d5;
            d3 /= d5;
            d4 /= d5;
            float f1 = this.Dne * (0.7F + ((Qnq)this.Dne).Dne.nextFloat() * 0.6F);
            sMa sMa2 = this.Dne;
            boolean bool = this.FWm;
            double d1 = this.bzF;
            float f2 = 0.3F;
            while (f1 > 0.0F) {
              int i2 = geR.FWm(sMa2);
              int i3 = geR.FWm(bool);
              int i4 = geR.FWm(d1);
              int i5 = this.Dne.Dne(i2, i3, i4);
              if (i5 > 0) {
                dNT dNT = zKP.Dne[i5];
                float f = (this.Dne != null) ? this.Dne.Dne(this, (Qnq)this.Dne, i2, i3, i4, dNT) : dNT.Dne(this.Dne);
                f1 -= (f + 0.3F) * f2;
              } 
              if (f1 > 0.0F && (this.Dne == null || this.Dne.Dne(this, (Qnq)this.Dne, i2, i3, i4, i5, f1)))
                hashSet.add(new EyB(i2, i3, i4)); 
              double d6 = sMa2 + d2 * f2;
              double d7 = bool + d3 * f2;
              d1 += d4 * f2;
              f1 -= f2 * 0.75F;
            } 
          } 
        } 
      } 
    } 
    this.Dne.addAll(hashSet);
    this.Dne *= 2.0F;
    i = geR.FWm(this.Dne - this.Dne - 1.0D);
    int j = geR.FWm(this.Dne + this.Dne + 1.0D);
    int k = geR.FWm(this.FWm - this.Dne - 1.0D);
    int m = geR.FWm(this.FWm + this.Dne + 1.0D);
    int n = geR.FWm(this.bzF - this.Dne - 1.0D);
    int i1 = geR.FWm(this.bzF + this.Dne + 1.0D);
    List<sMa> list = this.Dne.FWm(this.Dne, bSp.Dne().Dne(i, k, n, j, m, i1));
    chN chN = this.Dne.Dne().Dne(this.Dne, this.FWm, this.bzF);
    for (byte b = 0; b < list.size(); b++) {
      sMa sMa2 = list.get(b);
      double d = sMa2.FWm(this.Dne, this.FWm, this.bzF) / this.Dne;
      if (d <= 1.0D) {
        double d1 = sMa2.div - this.Dne;
        double d2 = sMa2.IjH + sMa2.c_() - this.FWm;
        double d3 = sMa2.mrb - this.bzF;
        double d4 = geR.Dne(d1 * d1 + d2 * d2 + d3 * d3);
        if (d4 != 0.0D) {
          d1 /= d4;
          d2 /= d4;
          d3 /= d4;
          double d5 = this.Dne.Dne(chN, sMa2.Dne);
          double d6 = (1.0D - d) * d5;
          sMa2.Dne(zBn.Dne(this), (int)((d6 * d6 + d6) / 2.0D * 8.0D * this.Dne + 1.0D));
          double d7 = oAi.Dne(sMa2, d6);
          sMa2.XHL += d1 * d7;
          sMa2.Zpi += d2 * d7;
          sMa2.kGO += d3 * d7;
          if (sMa2 instanceof FiG)
            this.Dne.put((FiG)sMa2, this.Dne.Dne().Dne(d1 * d6, d2 * d6, d3 * d6)); 
        } 
      } 
    } 
    this.Dne = sMa1;
  }
  
  public Map Dne() {
    return (Map)this.Dne;
  }
  
  public FUH Dne() {
    return (this.Dne == null) ? null : ((this.Dne instanceof gqg) ? ((gqg)this.Dne).Dne() : ((this.Dne instanceof FUH) ? (FUH)this.Dne : null));
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\yTR.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */