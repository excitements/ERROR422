import java.util.ArrayList;
import java.util.List;

class FOg extends Pdb {
  public List Dne = new ArrayList();
  
  public boolean Dne(onZ paramonZ) {
    return (paramonZ.Dne instanceof MOS || (paramonZ.zGp > 90 && paramonZ.aFZ <= 162));
  }
  
  public NMq Dne(FiG paramFiG, int paramInt) {
    if (paramInt >= this.bzF.size() - 9 && paramInt < this.bzF.size()) {
      onZ onZ = this.bzF.get(paramInt);
      if (onZ != null && onZ.Dne())
        onZ.Dne((NMq)null); 
    } 
    return null;
  }
  
  public void Dne(float paramFloat) {
    int i = this.Dne.size() / 9 - 5 + 1;
    int j = (int)((paramFloat * i) + 0.5D);
    if (j < 0)
      j = 0; 
    for (byte b = 0; b < 5; b++) {
      for (byte b1 = 0; b1 < 9; b1++) {
        int k = b1 + (b + j) * 9;
        if (k >= 0 && k < this.Dne.size()) {
          VXB.Dne().Dne(b1 + b * 9, this.Dne.get(k));
        } else {
          VXB.Dne().Dne(b1 + b * 9, (NMq)null);
        } 
      } 
    } 
  }
  
  public boolean Dne() {
    return (this.Dne.size() > 45);
  }
  
  protected void Dne(int paramInt1, int paramInt2, boolean paramBoolean, FiG paramFiG) {}
  
  public boolean Dne(NMq paramNMq, onZ paramonZ) {
    return (paramonZ.zGp > 90);
  }
  
  public FOg(FiG paramFiG) {
    Pdb pdb = paramFiG.Dne;
    byte b;
    for (b = 0; b < 5; b++) {
      for (byte b1 = 0; b1 < 9; b1++)
        Dne(new onZ(VXB.Dne(), b * 9 + b1, 9 + b1 * 18, 18 + b * 18)); 
    } 
    for (b = 0; b < 9; b++)
      Dne(new onZ((MqS)pdb, b, 9 + b * 18, 112)); 
    Dne(0.0F);
  }
  
  public boolean Dne(FiG paramFiG) {
    return true;
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\FOg.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */