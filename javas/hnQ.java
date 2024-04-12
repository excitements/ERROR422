import java.util.List;

public class hnQ extends dEr {
  private static final String[] FWm = new String[] { "skeleton", "wither", "zombie", "char", "creeper" };
  
  private gDn[] Dne;
  
  public static final String[] Dne = new String[] { "skull_skeleton", "skull_wither", "skull_zombie", "skull_char", "skull_creeper" };
  
  public int Dne(int paramInt) {
    return paramInt;
  }
  
  public void Dne(int paramInt, JcN paramJcN, List<NMq> paramList) {
    for (byte b = 0; b < FWm.length; b++)
      paramList.add(new NMq(paramInt, 1, b)); 
  }
  
  public boolean Dne(NMq paramNMq, FiG paramFiG, Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3, int paramInt4, float paramFloat1, float paramFloat2, float paramFloat3) {
    if (paramInt4 == 0)
      return false; 
    if (!paramQnq.Dne(paramInt1, paramInt2, paramInt3).Dne())
      return false; 
    if (paramInt4 == 1)
      paramInt2++; 
    if (paramInt4 == 2)
      paramInt3--; 
    if (paramInt4 == 3)
      paramInt3++; 
    if (paramInt4 == 4)
      paramInt1--; 
    if (paramInt4 == 5)
      paramInt1++; 
    if (!paramFiG.Dne(paramInt1, paramInt2, paramInt3, paramInt4, paramNMq))
      return false; 
    if (!zKP.mfU.Dne(paramQnq, paramInt1, paramInt2, paramInt3))
      return false; 
    paramQnq.FWm(paramInt1, paramInt2, paramInt3, zKP.mfU.FWm, paramInt4, 2);
    int i = 0;
    if (paramInt4 == 1)
      i = geR.FWm((paramFiG.mrb * 16.0F / 360.0F) + 0.5D) & 0xF; 
    ipD ipD = paramQnq.Dne(paramInt1, paramInt2, paramInt3);
    if (ipD != null && ipD instanceof CUf) {
      String str = "";
      if (paramNMq.aFZ() && paramNMq.Dne().Dne("SkullOwner"))
        str = paramNMq.Dne().Dne("SkullOwner"); 
      ((CUf)ipD).Dne(paramNMq.Qnq(), str);
      ((CUf)ipD).Dne(i);
      ((jHN)zKP.mfU).Dne(paramQnq, paramInt1, paramInt2, paramInt3, (CUf)ipD);
    } 
    paramNMq.Dne--;
    return true;
  }
  
  public gDn Dne(int paramInt) {
    if (paramInt < 0 || paramInt >= FWm.length)
      paramInt = 0; 
    return (gDn)this.Dne[paramInt];
  }
  
  public String Qnq(NMq paramNMq) {
    return (paramNMq.Qnq() == 3 && paramNMq.aFZ() && paramNMq.Dne().Dne("SkullOwner")) ? KGL.Dne("item.skull.player.name", new Object[] { paramNMq.Dne().Dne("SkullOwner") }) : super.Qnq(paramNMq);
  }
  
  public void Dne(Rbp paramRbp) {
    this.Dne = (String[])new gDn[Dne.length];
    for (byte b = 0; b < Dne.length; b++)
      this.Dne[b] = (String)paramRbp.Dne(Dne[b]); 
  }
  
  public String Dne(NMq paramNMq) {
    int i = paramNMq.Qnq();
    if (i < 0 || i >= FWm.length)
      i = 0; 
    return FWm() + "." + FWm[i];
  }
  
  public hnQ(int paramInt) {
    super(paramInt);
    Dne(JcN.FWm);
    FWm(0);
    Dne(true);
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\hnQ.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */