public class gbV extends ljW {
  public void Dne(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    boolean bool = paramQnq.kGO(paramInt1, paramInt2, paramInt3);
    lDs lDs = (lDs)paramQnq.Dne(paramInt1, paramInt2, paramInt3);
    if (lDs != null && lDs.Dne != bool) {
      if (bool)
        lDs.Dne(paramQnq, paramInt1, paramInt2, paramInt3); 
      lDs.Dne = bool;
    } 
  }
  
  public gbV(int paramInt) {
    super(paramInt, KFd.Qnq);
    Dne(JcN.bzF);
  }
  
  static {
  
  }
  
  public boolean Dne(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3, FiG paramFiG, int paramInt4, float paramFloat1, float paramFloat2, float paramFloat3) {
    if (paramQnq.aFZ != null)
      return true; 
    lDs lDs = (lDs)paramQnq.Dne(paramInt1, paramInt2, paramInt3);
    if (lDs != null) {
      lDs.FWm();
      lDs.Dne(paramQnq, paramInt1, paramInt2, paramInt3);
    } 
    return true;
  }
  
  public void Dne(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3, FiG paramFiG) {
    if (paramQnq.aFZ == null) {
      lDs lDs = (lDs)paramQnq.Dne(paramInt1, paramInt2, paramInt3);
      if (lDs != null)
        lDs.Dne(paramQnq, paramInt1, paramInt2, paramInt3); 
    } 
  }
  
  public ipD Dne(Qnq paramQnq) {
    return new lDs();
  }
  
  public boolean Dne(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5) {
    float f = (float)Math.pow(2.0D, (paramInt5 - 12) / 12.0D);
    String str = "harp";
    if (paramInt4 == 1)
      str = "bd"; 
    if (paramInt4 == 2)
      str = "snare"; 
    if (paramInt4 == 3)
      str = "hat"; 
    if (paramInt4 == 4)
      str = "bassattack"; 
    paramQnq.Dne(paramInt1 + 0.5D, paramInt2 + 0.5D, paramInt3 + 0.5D, "note." + str, 3.0F, f);
    paramQnq.Dne("note", paramInt1 + 0.5D, paramInt2 + 1.2D, paramInt3 + 0.5D, paramInt5 / 24.0D, 0.0D, 0.0D);
    return true;
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\gbV.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */