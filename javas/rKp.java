import java.util.ArrayList;
import java.util.List;

public class rKp {
  final Oaf Dne;
  
  private List Dne;
  
  private int FWm;
  
  private int bzF;
  
  private int Dne;
  
  private final boolean Dne;
  
  private Qnq Dne;
  
  private boolean FWm(rKp paramrKp) {
    return Dne(paramrKp) ? true : ((this.Dne.size() == 2) ? false : (this.Dne.isEmpty() ? true : true));
  }
  
  private boolean Dne(rKp paramrKp) {
    for (byte b = 0; b < this.Dne.size(); b++) {
      EyB eyB = this.Dne.get(b);
      if (eyB.Dne == paramrKp.Dne && eyB.bzF == paramrKp.bzF)
        return true; 
    } 
    return false;
  }
  
  public void Dne(boolean paramBoolean1, boolean paramBoolean2) {
    boolean bool1 = bzF(this.Dne, this.FWm, this.bzF - 1);
    boolean bool2 = bzF(this.Dne, this.FWm, this.bzF + 1);
    boolean bool3 = bzF(this.Dne - 1, this.FWm, this.bzF);
    boolean bool4 = bzF(this.Dne + 1, this.FWm, this.bzF);
    byte b = -1;
    if ((bool1 || bool2) && !bool3 && !bool4)
      b = 0; 
    if ((bool3 || bool4) && !bool1 && !bool2)
      b = 1; 
    if (this.Dne == null) {
      if (bool2 && bool4 && !bool1 && !bool3)
        b = 6; 
      if (bool2 && bool3 && !bool1 && !bool4)
        b = 7; 
      if (bool1 && bool3 && !bool2 && !bool4)
        b = 8; 
      if (bool1 && bool4 && !bool2 && !bool3)
        b = 9; 
    } 
    if (b == -1) {
      if (bool1 || bool2)
        b = 0; 
      if (bool3 || bool4)
        b = 1; 
      if (this.Dne == null)
        if (paramBoolean1) {
          if (bool2 && bool4)
            b = 6; 
          if (bool3 && bool2)
            b = 7; 
          if (bool4 && bool1)
            b = 9; 
          if (bool1 && bool3)
            b = 8; 
        } else {
          if (bool1 && bool3)
            b = 8; 
          if (bool4 && bool1)
            b = 9; 
          if (bool3 && bool2)
            b = 7; 
          if (bool2 && bool4)
            b = 6; 
        }  
    } 
    if (b == 0) {
      if (Oaf.FWm(this.Dne, this.Dne, this.FWm + 1, this.bzF - 1))
        b = 4; 
      if (Oaf.FWm(this.Dne, this.Dne, this.FWm + 1, this.bzF + 1))
        b = 5; 
    } 
    if (b == 1) {
      if (Oaf.FWm(this.Dne, this.Dne + 1, this.FWm + 1, this.bzF))
        b = 2; 
      if (Oaf.FWm(this.Dne, this.Dne - 1, this.FWm + 1, this.bzF))
        b = 3; 
    } 
    if (b < 0)
      b = 0; 
    Dne(b);
    int i = b;
    if (this.Dne != null)
      i = this.Dne.bzF(this.Dne, this.FWm, this.bzF) & 0x8 | b; 
    if (paramBoolean2 || this.Dne.bzF(this.Dne, this.FWm, this.bzF) != i) {
      this.Dne.Dne(this.Dne, this.FWm, this.bzF, i, 3);
      for (byte b1 = 0; b1 < this.Dne.size(); b1++) {
        rKp rKp1 = Dne(this.Dne.get(b1));
        if (rKp1 != null) {
          rKp1.Dne();
          if (rKp1.FWm(this))
            rKp1.Dne(this); 
        } 
      } 
    } 
  }
  
  private rKp Dne(EyB paramEyB) {
    return Oaf.FWm(this.Dne, paramEyB.Dne, paramEyB.FWm, paramEyB.bzF) ? new rKp((Oaf)this.Dne, this.Dne, paramEyB.Dne, paramEyB.FWm, paramEyB.bzF) : (Oaf.FWm(this.Dne, paramEyB.Dne, paramEyB.FWm + 1, paramEyB.bzF) ? new rKp((Oaf)this.Dne, this.Dne, paramEyB.Dne, paramEyB.FWm + 1, paramEyB.bzF) : (Oaf.FWm(this.Dne, paramEyB.Dne, paramEyB.FWm - 1, paramEyB.bzF) ? new rKp((Oaf)this.Dne, this.Dne, paramEyB.Dne, paramEyB.FWm - 1, paramEyB.bzF) : null));
  }
  
  private boolean Dne(int paramInt1, int paramInt2, int paramInt3) {
    return Oaf.FWm(this.Dne, paramInt1, paramInt2, paramInt3) ? true : (Oaf.FWm(this.Dne, paramInt1, paramInt2 + 1, paramInt3) ? true : Oaf.FWm(this.Dne, paramInt1, paramInt2 - 1, paramInt3));
  }
  
  private void Dne(int paramInt) {
    this.Dne.clear();
    if (paramInt == 0) {
      this.Dne.add(new EyB(this.Dne, this.FWm, this.bzF - 1));
      this.Dne.add(new EyB(this.Dne, this.FWm, this.bzF + 1));
    } else if (paramInt == 1) {
      this.Dne.add(new EyB(this.Dne - 1, this.FWm, this.bzF));
      this.Dne.add(new EyB(this.Dne + 1, this.FWm, this.bzF));
    } else if (paramInt == 2) {
      this.Dne.add(new EyB(this.Dne - 1, this.FWm, this.bzF));
      this.Dne.add(new EyB(this.Dne + 1, this.FWm + 1, this.bzF));
    } else if (paramInt == 3) {
      this.Dne.add(new EyB(this.Dne - 1, this.FWm + 1, this.bzF));
      this.Dne.add(new EyB(this.Dne + 1, this.FWm, this.bzF));
    } else if (paramInt == 4) {
      this.Dne.add(new EyB(this.Dne, this.FWm + 1, this.bzF - 1));
      this.Dne.add(new EyB(this.Dne, this.FWm, this.bzF + 1));
    } else if (paramInt == 5) {
      this.Dne.add(new EyB(this.Dne, this.FWm, this.bzF - 1));
      this.Dne.add(new EyB(this.Dne, this.FWm + 1, this.bzF + 1));
    } else if (paramInt == 6) {
      this.Dne.add(new EyB(this.Dne + 1, this.FWm, this.bzF));
      this.Dne.add(new EyB(this.Dne, this.FWm, this.bzF + 1));
    } else if (paramInt == 7) {
      this.Dne.add(new EyB(this.Dne - 1, this.FWm, this.bzF));
      this.Dne.add(new EyB(this.Dne, this.FWm, this.bzF + 1));
    } else if (paramInt == 8) {
      this.Dne.add(new EyB(this.Dne - 1, this.FWm, this.bzF));
      this.Dne.add(new EyB(this.Dne, this.FWm, this.bzF - 1));
    } else if (paramInt == 9) {
      this.Dne.add(new EyB(this.Dne + 1, this.FWm, this.bzF));
      this.Dne.add(new EyB(this.Dne, this.FWm, this.bzF - 1));
    } 
  }
  
  private boolean FWm(int paramInt1, int paramInt2, int paramInt3) {
    for (byte b = 0; b < this.Dne.size(); b++) {
      EyB eyB = this.Dne.get(b);
      if (eyB.Dne == paramInt1 && eyB.bzF == paramInt3)
        return true; 
    } 
    return false;
  }
  
  private boolean bzF(int paramInt1, int paramInt2, int paramInt3) {
    rKp rKp1 = Dne(new EyB(paramInt1, paramInt2, paramInt3));
    if (rKp1 == null)
      return false; 
    rKp1.Dne();
    return rKp1.FWm(this);
  }
  
  private void Dne(rKp paramrKp) {
    this.Dne.add(new EyB(paramrKp.Dne, paramrKp.FWm, paramrKp.bzF));
    boolean bool1 = FWm(this.Dne, this.FWm, this.bzF - 1);
    boolean bool2 = FWm(this.Dne, this.FWm, this.bzF + 1);
    boolean bool3 = FWm(this.Dne - 1, this.FWm, this.bzF);
    boolean bool4 = FWm(this.Dne + 1, this.FWm, this.bzF);
    byte b = -1;
    if (bool1 || bool2)
      b = 0; 
    if (bool3 || bool4)
      b = 1; 
    if (this.Dne == null) {
      if (bool2 && bool4 && !bool1 && !bool3)
        b = 6; 
      if (bool2 && bool3 && !bool1 && !bool4)
        b = 7; 
      if (bool1 && bool3 && !bool2 && !bool4)
        b = 8; 
      if (bool1 && bool4 && !bool2 && !bool3)
        b = 9; 
    } 
    if (b == 0) {
      if (Oaf.FWm(this.Dne, this.Dne, this.FWm + 1, this.bzF - 1))
        b = 4; 
      if (Oaf.FWm(this.Dne, this.Dne, this.FWm + 1, this.bzF + 1))
        b = 5; 
    } 
    if (b == 1) {
      if (Oaf.FWm(this.Dne, this.Dne + 1, this.FWm + 1, this.bzF))
        b = 2; 
      if (Oaf.FWm(this.Dne, this.Dne - 1, this.FWm + 1, this.bzF))
        b = 3; 
    } 
    if (b < 0)
      b = 0; 
    int i = b;
    if (this.Dne != null)
      i = this.Dne.bzF(this.Dne, this.FWm, this.bzF) & 0x8 | b; 
    this.Dne.Dne(this.Dne, this.FWm, this.bzF, i, 3);
  }
  
  public rKp(Oaf paramOaf, Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3) {
    this.Dne = (Qnq)paramOaf;
    this.Dne = (Qnq)new ArrayList();
    this.Dne = paramQnq;
    this.Dne = paramInt1;
    this.FWm = paramInt2;
    this.bzF = paramInt3;
    int i = paramQnq.Dne(paramInt1, paramInt2, paramInt3);
    int j = paramQnq.bzF(paramInt1, paramInt2, paramInt3);
    if (((Oaf)zKP.Dne[i]).Dne) {
      this.Dne = true;
      j &= 0xFFFFFFF7;
    } else {
      this.Dne = false;
    } 
    Dne(j);
  }
  
  private void Dne() {
    for (byte b = 0; b < this.Dne.size(); b++) {
      rKp rKp1 = Dne(this.Dne.get(b));
      if (rKp1 != null && rKp1.Dne(this)) {
        this.Dne.set(b, new EyB(rKp1.Dne, rKp1.FWm, rKp1.bzF));
      } else {
        this.Dne.remove(b--);
      } 
    } 
  }
  
  protected int Dne() {
    byte b = 0;
    if (Dne(this.Dne, this.FWm, this.bzF - 1))
      b++; 
    if (Dne(this.Dne, this.FWm, this.bzF + 1))
      b++; 
    if (Dne(this.Dne - 1, this.FWm, this.bzF))
      b++; 
    if (Dne(this.Dne + 1, this.FWm, this.bzF))
      b++; 
    return b;
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\rKp.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */