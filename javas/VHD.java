import java.util.Random;

public class VHD extends zKP {
  private final boolean Dne;
  
  public void Dne(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    if (paramQnq.aFZ == null)
      if (this.Dne && !paramQnq.kGO(paramInt1, paramInt2, paramInt3)) {
        paramQnq.FWm(paramInt1, paramInt2, paramInt3, this.FWm, 4);
      } else if (!this.Dne && paramQnq.kGO(paramInt1, paramInt2, paramInt3)) {
        paramQnq.FWm(paramInt1, paramInt2, paramInt3, zKP.yaZ.FWm, 0, 2);
      }  
  }
  
  public VHD(int paramInt, boolean paramBoolean) {
    super(paramInt, KFd.Vxn);
    this.Dne = paramBoolean;
    if (paramBoolean)
      Dne(1.0F); 
  }
  
  public void Dne(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3) {
    if (paramQnq.aFZ == null)
      if (this.Dne && !paramQnq.kGO(paramInt1, paramInt2, paramInt3)) {
        paramQnq.FWm(paramInt1, paramInt2, paramInt3, this.FWm, 4);
      } else if (!this.Dne && paramQnq.kGO(paramInt1, paramInt2, paramInt3)) {
        paramQnq.FWm(paramInt1, paramInt2, paramInt3, zKP.yaZ.FWm, 0, 2);
      }  
  }
  
  public int Dne(int paramInt1, Random paramRandom, int paramInt2) {
    return zKP.ZkM.FWm;
  }
  
  public void Dne(Rbp paramRbp) {
    if (this.Dne) {
      this.Qnq = paramRbp.Dne("redstoneLight_lit");
    } else {
      this.Qnq = paramRbp.Dne("redstoneLight");
    } 
  }
  
  public int Dne(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3) {
    return zKP.ZkM.FWm;
  }
  
  public void Dne(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3, Random paramRandom) {
    if (paramQnq.aFZ == null && this.Dne && !paramQnq.kGO(paramInt1, paramInt2, paramInt3))
      paramQnq.FWm(paramInt1, paramInt2, paramInt3, zKP.ZkM.FWm, 0, 2); 
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\VHD.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */