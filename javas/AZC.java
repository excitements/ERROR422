import java.util.List;
import java.util.Random;

public class AZC extends dNT {
  public static final String[] Dne = new String[] { "oak", "spruce", "birch", "jungle" };
  
  public AZC(int paramInt, boolean paramBoolean) {
    super(paramInt, paramBoolean, KFd.Qnq);
    Dne(JcN.Dne);
  }
  
  protected NMq Dne(int paramInt) {
    return new NMq(((dNT)zKP.Qnq).FWm, 2, paramInt & 0x7);
  }
  
  public gDn Dne(int paramInt1, int paramInt2) {
    return zKP.Qnq.Dne(paramInt1, paramInt2 & 0x7);
  }
  
  public String Dne(int paramInt) {
    if (paramInt < 0 || paramInt >= Dne.length)
      paramInt = 0; 
    return bzF() + "." + Dne[paramInt];
  }
  
  public int Dne(int paramInt1, Random paramRandom, int paramInt2) {
    return ((dNT)zKP.Qnq).FWm;
  }
  
  public void Dne(int paramInt, JcN paramJcN, List<NMq> paramList) {
    if (paramInt != zKP.bzF.FWm)
      for (byte b = 0; b < 4; b++)
        paramList.add(new NMq(paramInt, 1, b));  
  }
  
  public void Dne(Rbp paramRbp) {}
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\AZC.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */