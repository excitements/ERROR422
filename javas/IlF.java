public class IlF extends xZE {
  public boolean Dne(gnI paramgnI) {
    return (Jwh.Dne().Zpi() || super.Dne(paramgnI));
  }
  
  public void Dne(gnI paramgnI, String[] paramArrayOfString) {
    Qnq qnq = (Qnq)((paramgnI instanceof FiG) ? ((FiG)paramgnI).Dne : Jwh.Dne().Dne(0));
    paramgnI.Dne("Seed: " + ((Qnq)qnq).Dne());
  }
  
  public String Dne() {
    return "seed";
  }
  
  static {
  
  }
  
  public int Dne() {
    return 2;
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\IlF.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */