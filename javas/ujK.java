final class ujK extends MbX {
  public Boolean Dne(LIC paramLIC) {
    return Boolean.valueOf((BAS.aFZ == paramLIC.Dne()));
  }
  
  public String toString() {
    return "a true or false";
  }
  
  public Object FWm(Object paramObject) {
    return Dne((LIC)paramObject);
  }
  
  public boolean Dne(LIC paramLIC) {
    return (BAS.aFZ == paramLIC.Dne() || BAS.zGp == paramLIC.Dne());
  }
  
  public boolean Dne(Object paramObject) {
    return Dne((LIC)paramObject);
  }
  
  static {
  
  }
  
  public String Dne() {
    return "A short form boolean";
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar\\ujK.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */