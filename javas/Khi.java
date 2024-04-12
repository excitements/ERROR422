import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class Khi extends sAy {
  private double Dne;
  
  private int FWm;
  
  private boolean Dne;
  
  private OdI[] Dne;
  
  private Sxs[] Dne = new OdI[] { 
      OdI.bzF, OdI.aFZ, OdI.Qnq, OdI.DyG, OdI.zGp, OdI.kGO, OdI.udO, OdI.ATE, OdI.Vxn, OdI.EyB, 
      OdI.FfS, OdI.OdI };
  
  protected List a_() {
    ArrayList<EyB> arrayList = new ArrayList();
    for (Sxs sxs : this.Dne) {
      if (sxs != null)
        arrayList.add(sxs.Dne(64)); 
    } 
    return arrayList;
  }
  
  public Khi() {
    this.Dne = new Sxs[3];
    this.Dne = 32.0D;
    this.FWm = 3;
  }
  
  protected boolean Dne(int paramInt1, int paramInt2) {
    if (this.Dne == null) {
      Random random = new Random();
      random.setSeed(this.Dne.Dne());
      double d = random.nextDouble() * Math.PI * 2.0D;
      int i = 1;
      for (byte b = 0; b < this.Dne.length; b++) {
        double d1 = (1.25D * i + random.nextDouble()) * this.Dne * i;
        int j = (int)Math.round(Math.cos(d) * d1);
        int k = (int)Math.round(Math.sin(d) * d1);
        ArrayList<? super Sxs> arrayList = new ArrayList();
        Collections.addAll(arrayList, this.Dne);
        EyB eyB = this.Dne.Dne().Dne((j << 4) + 8, (k << 4) + 8, 112, arrayList, random);
        if (eyB != null) {
          j = eyB.Dne >> 4;
          k = eyB.bzF >> 4;
        } 
        this.Dne[b] = new Sxs(j, k);
        d += 6.283185307179586D * i / this.FWm;
        if (b == this.FWm) {
          i += 2 + random.nextInt(5);
          this.FWm += 1 + random.nextInt(2);
        } 
      } 
      this.Dne = true;
    } 
    for (Sxs sxs : this.Dne) {
      if (paramInt1 == sxs.Dne && paramInt2 == sxs.FWm)
        return true; 
    } 
    return false;
  }
  
  protected JhS Dne(int paramInt1, int paramInt2) {
    AAE aAE = new AAE((Qnq)this.Dne, (Random)this.Dne, paramInt1, paramInt2);
    while (true) {
      if (aAE.Dne().isEmpty() || ((Kci)aAE.Dne().get(0)).Dne == null) {
        aAE = new AAE((Qnq)this.Dne, (Random)this.Dne, paramInt1, paramInt2);
        continue;
      } 
      return aAE;
    } 
  }
  
  public Khi(Map paramMap) {
    this.Dne = new Sxs[3];
    this.Dne = 32.0D;
    this.FWm = 3;
    for (Map.Entry entry : paramMap.entrySet()) {
      if (((String)entry.getKey()).equals("distance")) {
        this.Dne = geR.Dne((String)entry.getValue(), this.Dne, 1.0D);
        continue;
      } 
      if (((String)entry.getKey()).equals("count")) {
        this.Dne = new Sxs[geR.Dne((String)entry.getValue(), this.Dne.length, 1)];
        continue;
      } 
      if (((String)entry.getKey()).equals("spread"))
        this.FWm = geR.Dne((String)entry.getValue(), this.FWm, 1); 
    } 
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\Khi.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */