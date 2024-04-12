import java.util.HashSet;
import java.util.Set;

public class ZGT {
  private transient int Dne;
  
  private transient AAk[] Dne;
  
  private final float Dne = 0.75F;
  
  private int FWm = 12;
  
  private Set Dne = (Set)new AAk[16];
  
  private volatile transient int bzF;
  
  private void Dne(AAk[] paramArrayOfAAk) {
    Set set = this.Dne;
    int i = paramArrayOfAAk.length;
    for (byte b = 0; b < set.length; b++) {
      Set set1 = set[b];
      if (set1 != null) {
        AAk aAk;
        set[b] = null;
        do {
          aAk = ((AAk)set1).Dne;
          int j = Dne(((AAk)set1).FWm, i);
          ((AAk)set1).Dne = paramArrayOfAAk[j];
          paramArrayOfAAk[j] = (AAk)set1;
          AAk aAk1 = aAk;
        } while (aAk != null);
      } 
    } 
  }
  
  public void Dne() {
    this.bzF++;
    Set set = this.Dne;
    for (byte b = 0; b < set.length; b++)
      set[b] = null; 
    this.Dne = false;
  }
  
  final AAk FWm(int paramInt) {
    AAk aAk;
    int i = FWm(paramInt);
    int j = Dne(i, this.Dne.length);
    Set set1 = this.Dne[j];
    Set set2 = set1;
    while (set2 != null) {
      AAk aAk1 = ((AAk)set2).Dne;
      if (((AAk)set2).Dne == paramInt) {
        this.bzF++;
        this.Dne--;
        if (set1 == set2) {
          this.Dne[j] = (Set)aAk1;
        } else {
          ((AAk)set1).Dne = aAk1;
        } 
        return (AAk)set2;
      } 
      set1 = set2;
      aAk = aAk1;
    } 
    return aAk;
  }
  
  public Object FWm(int paramInt) {
    this.Dne.remove(Integer.valueOf(paramInt));
    AAk aAk = FWm(paramInt);
    return (aAk == null) ? null : aAk.Dne;
  }
  
  public Set Dne() {
    return this.Dne;
  }
  
  private static int Dne(int paramInt1, int paramInt2) {
    return paramInt1 & paramInt2 - 1;
  }
  
  public ZGT() {
    this.Dne = 0.75F;
    this.Dne = new HashSet();
  }
  
  public Object Dne(int paramInt) {
    int i = FWm(paramInt);
    Set set = this.Dne[Dne(i, this.Dne.length)];
    while (set != null) {
      if (((AAk)set).Dne == paramInt)
        return ((AAk)set).Dne; 
      AAk aAk = ((AAk)set).Dne;
    } 
    return null;
  }
  
  public void Dne(int paramInt, Object paramObject) {
    this.Dne.add(Integer.valueOf(paramInt));
    int i = FWm(paramInt);
    int j = Dne(i, this.Dne.length);
    Set set = this.Dne[j];
    while (set != null) {
      if (((AAk)set).Dne == paramInt) {
        ((AAk)set).Dne = (AAk)paramObject;
        return;
      } 
      AAk aAk = ((AAk)set).Dne;
    } 
    this.bzF++;
    Dne(i, paramInt, paramObject, j);
  }
  
  private void Dne(int paramInt) {
    Set set = this.Dne;
    int i = set.length;
    if (i == 1073741824) {
      this.FWm = Integer.MAX_VALUE;
    } else {
      AAk[] arrayOfAAk = new AAk[paramInt];
      Dne(arrayOfAAk);
      this.Dne = (Set)arrayOfAAk;
      getClass();
      this.FWm = (int)(paramInt * 0.75F);
    } 
  }
  
  private static int FWm(int paramInt) {
    paramInt ^= paramInt >>> 20 ^ paramInt >>> 12;
    return paramInt ^ paramInt >>> 7 ^ paramInt >>> 4;
  }
  
  static int Dne(int paramInt) {
    return FWm(paramInt);
  }
  
  public boolean Dne(int paramInt) {
    return (Dne(paramInt) != null);
  }
  
  private void Dne(int paramInt1, int paramInt2, Object paramObject, int paramInt3) {
    Set set = this.Dne[paramInt3];
    this.Dne[paramInt3] = (Set)new AAk(paramInt1, paramInt2, paramObject, (AAk)set);
    if (this.Dne++ >= this.FWm)
      Dne(2 * this.Dne.length); 
  }
  
  final AAk Dne(int paramInt) {
    int i = FWm(paramInt);
    Set set = this.Dne[Dne(i, this.Dne.length)];
    while (set != null) {
      if (((AAk)set).Dne == paramInt)
        return (AAk)set; 
      AAk aAk = ((AAk)set).Dne;
    } 
    return null;
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\ZGT.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */