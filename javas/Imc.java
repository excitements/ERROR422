import java.util.List;

public class Imc extends zKP {
  private gDn[] Dne;
  
  public static int b_(int paramInt) {
    return (paramInt ^ 0xFFFFFFFF) & 0xF;
  }
  
  public Imc() {
    super(35, KFd.udO);
    Dne(JcN.Dne);
  }
  
  public static int bzF(int paramInt) {
    return (paramInt ^ 0xFFFFFFFF) & 0xF;
  }
  
  public int Dne(int paramInt) {
    return paramInt;
  }
  
  public gDn Dne(int paramInt1, int paramInt2) {
    return this.Dne[paramInt2 % this.Dne.length];
  }
  
  public void Dne(Rbp paramRbp) {
    this.Dne = new gDn[16];
    for (byte b = 0; b < this.Dne.length; b++)
      this.Dne[b] = paramRbp.Dne("cloth_" + b); 
  }
  
  public void Dne(int paramInt, JcN paramJcN, List<NMq> paramList) {
    for (byte b = 0; b < 16; b++)
      paramList.add(new NMq(paramInt, 1, b)); 
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\Imc.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */