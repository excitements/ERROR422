class VPj {
  private final String Dne;
  
  private final String FWm;
  
  public String Dne() {
    return this.Dne;
  }
  
  public VPj(String paramString, Object paramObject) {
    this.Dne = paramString;
    if (paramObject == null) {
      this.FWm = "~~NULL~~";
    } else if (paramObject instanceof Throwable) {
      Throwable throwable = (Throwable)paramObject;
      this.FWm = "~~ERROR~~ " + throwable.getClass().getSimpleName() + ": " + throwable.getMessage();
    } else {
      this.FWm = paramObject.toString();
    } 
  }
  
  public String FWm() {
    return this.FWm;
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\VPj.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */