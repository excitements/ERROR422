public class Tfm {
  private int FWm = 12;
  
  private transient KHL[] Dne;
  
  private volatile transient int bzF;
  
  private transient int Dne;
  
  private final float Dne = new KHL[16];
  
  private static int Dne(int paramInt) {
    paramInt ^= paramInt >>> 20 ^ paramInt >>> 12;
    return paramInt ^ paramInt >>> 7 ^ paramInt >>> 4;
  }
  
  private static int Dne(int paramInt1, int paramInt2) {
    return paramInt1 & paramInt2 - 1;
  }
  
  public Tfm() {
    this.Dne = 0.75F;
  }
  
  public Object Dne(long paramLong) {
    int i = FWm(paramLong);
    float f = this.Dne[Dne(i, this.Dne.length)];
    while (f != null) {
      if (f.Dne == paramLong)
        return f.Dne; 
      int j = f.Dne;
    } 
    return null;
  }
  
  private void Dne(int paramInt1, long paramLong, Object paramObject, int paramInt2) {
    float f = this.Dne[paramInt2];
    this.Dne[paramInt2] = new KHL(paramInt1, paramLong, paramObject, f);
    if (this.Dne++ >= this.FWm)
      Dne(2 * this.Dne.length); 
  }
  
  private void Dne(int paramInt) {
    float f = this.Dne;
    int i = f.length;
    if (i == 1073741824) {
      this.FWm = Integer.MAX_VALUE;
    } else {
      KHL[] arrayOfKHL = new KHL[paramInt];
      Dne(arrayOfKHL);
      this.Dne = arrayOfKHL;
      getClass();
      this.FWm = (int)(paramInt * 0.75F);
    } 
  }
  
  final KHL FWm(long paramLong) {
    int k;
    int i = FWm(paramLong);
    int j = Dne(i, this.Dne.length);
    float f1 = this.Dne[j];
    float f2 = f1;
    while (f2 != null) {
      int m = f2.Dne;
      if (f2.Dne == paramLong) {
        this.bzF++;
        this.Dne--;
        if (f1 == f2) {
          this.Dne[j] = m;
        } else {
          f1.Dne = m;
        } 
        return f2;
      } 
      f1 = f2;
      k = m;
    } 
    return k;
  }
  
  public int Dne() {
    return this.Dne;
  }
  
  public void Dne(long paramLong, Object paramObject) {
    int i = FWm(paramLong);
    int j = Dne(i, this.Dne.length);
    float f = this.Dne[j];
    while (f != null) {
      if (f.Dne == paramLong) {
        f.Dne = paramObject;
        return;
      } 
      int k = f.Dne;
    } 
    this.bzF++;
    Dne(i, paramLong, paramObject, j);
  }
  
  private static int FWm(long paramLong) {
    return Dne((int)(paramLong ^ paramLong >>> 32L));
  }
  
  public Object FWm(long paramLong) {
    KHL kHL = FWm(paramLong);
    return (kHL == null) ? null : kHL.Dne;
  }
  
  private void Dne(KHL[] paramArrayOfKHL) {
    float f = this.Dne;
    int i = paramArrayOfKHL.length;
    for (byte b = 0; b < f.length; b++) {
      float f1 = f[b];
      if (f1 != null) {
        int j;
        f[b] = null;
        do {
          j = f1.Dne;
          int m = Dne(f1.Dne, i);
          f1.Dne = paramArrayOfKHL[m];
          paramArrayOfKHL[m] = f1;
          int k = j;
        } while (j != null);
      } 
    } 
  }
  
  static int Dne(long paramLong) {
    return FWm(paramLong);
  }
  
  public boolean Dne(long paramLong) {
    return (Dne(paramLong) != null);
  }
  
  final KHL Dne(long paramLong) {
    int i = FWm(paramLong);
    float f = this.Dne[Dne(i, this.Dne.length)];
    while (f != null) {
      if (f.Dne == paramLong)
        return f; 
      int j = f.Dne;
    } 
    return null;
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\Tfm.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */