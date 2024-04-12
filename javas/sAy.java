import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public abstract class sAy extends Suj {
  protected Map Dne = new HashMap<>();
  
  public boolean Dne(Qnq paramQnq, Random paramRandom, int paramInt1, int paramInt2) {
    int i = (paramInt1 << 4) + 8;
    int j = (paramInt2 << 4) + 8;
    boolean bool = false;
    for (JhS jhS : this.Dne.values()) {
      if (jhS.Dne() && jhS.Dne().Dne(i, j, i + 15, j + 15)) {
        jhS.Dne(paramQnq, paramRandom, new CLK(i, j, i + 15, j + 15));
        bool = true;
      } 
    } 
    return bool;
  }
  
  public boolean Dne(int paramInt1, int paramInt2, int paramInt3) {
    for (JhS jhS : this.Dne.values()) {
      if (jhS.Dne() && jhS.Dne().Dne(paramInt1, paramInt3, paramInt1, paramInt3))
        for (bvz bvz : jhS.Dne()) {
          if (bvz.Dne().Dne(paramInt1, paramInt2, paramInt3))
            return true; 
        }  
    } 
    return false;
  }
  
  protected List a_() {
    return null;
  }
  
  public EyB Dne(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3) {
    this.Dne = (Map)paramQnq;
    this.Dne.setSeed(paramQnq.Dne());
    long l1 = this.Dne.nextLong();
    long l2 = this.Dne.nextLong();
    long l3 = (paramInt1 >> 4) * l1;
    long l4 = (paramInt3 >> 4) * l2;
    this.Dne.setSeed(l3 ^ l4 ^ paramQnq.Dne());
    Dne(paramQnq, paramInt1 >> 4, paramInt3 >> 4, 0, 0, (byte[])null);
    double d = Double.MAX_VALUE;
    EyB eyB = null;
    for (JhS jhS : this.Dne.values()) {
      if (jhS.Dne()) {
        bvz bvz = jhS.Dne().get(0);
        EyB eyB1 = bvz.Dne();
        int i = eyB1.Dne - paramInt1;
        int j = eyB1.FWm - paramInt2;
        int k = eyB1.bzF - paramInt3;
        double d1 = (i + i * j * j + k * k);
        if (d1 < d) {
          d = d1;
          eyB = eyB1;
        } 
      } 
    } 
    if (eyB != null)
      return eyB; 
    List list = a_();
    if (list != null) {
      EyB eyB1 = null;
      for (EyB eyB2 : list) {
        int i = eyB2.Dne - paramInt1;
        int j = eyB2.FWm - paramInt2;
        int k = eyB2.bzF - paramInt3;
        double d1 = (i + i * j * j + k * k);
        if (d1 < d) {
          d = d1;
          eyB1 = eyB2;
        } 
      } 
      return eyB1;
    } 
    return null;
  }
  
  protected void Dne(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3, int paramInt4, byte[] paramArrayOfbyte) {
    if (!this.Dne.containsKey(Long.valueOf(Sxs.Dne(paramInt1, paramInt2)))) {
      this.Dne.nextInt();
      try {
        if (Dne(paramInt1, paramInt2)) {
          JhS jhS = Dne(paramInt1, paramInt2);
          this.Dne.put(Long.valueOf(Sxs.Dne(paramInt1, paramInt2)), jhS);
        } 
      } catch (Throwable throwable) {
        McM mcM = McM.Dne(throwable, "Exception preparing structure feature");
        Noo noo = mcM.Dne("Feature being prepared");
        noo.Dne("Is feature chunk", new oeZ(this, paramInt1, paramInt2));
        noo.Dne("Chunk location", String.format("%d,%d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) }));
        noo.Dne("Chunk pos hash", new HRL(this, paramInt1, paramInt2));
        noo.Dne("Structure type", new zNA(this));
        throw new kaJ(mcM);
      } 
    } 
  }
  
  protected abstract JhS Dne(int paramInt1, int paramInt2);
  
  protected abstract boolean Dne(int paramInt1, int paramInt2);
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\sAy.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */