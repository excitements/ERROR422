class iVH {
  private double Dne;
  
  private boolean Dne;
  
  private String Dne;
  
  private int Dne;
  
  public boolean Dne() {
    return this.Dne;
  }
  
  public void Dne(String paramString) {
    this.Dne = paramString;
    this.Dne = Boolean.parseBoolean(paramString);
    try {
      this.Dne = Integer.parseInt(paramString);
    } catch (NumberFormatException numberFormatException) {}
    try {
      this.Dne = Double.parseDouble(paramString);
    } catch (NumberFormatException numberFormatException) {}
  }
  
  public iVH(String paramString) {
    Dne(paramString);
  }
  
  public String Dne() {
    return this.Dne;
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\iVH.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */