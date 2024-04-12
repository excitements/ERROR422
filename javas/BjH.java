final class BjH implements tHk {
  private final iod Dne;
  
  private final iod FWm;
  
  public Object Dne(Object paramObject) {
    Object object;
    try {
      object = this.Dne.Dne(paramObject);
    } catch (EDm eDm) {
      throw EDm.FWm(eDm, this.Dne);
    } 
    try {
      return this.FWm.Dne(object);
    } catch (EDm eDm) {
      throw EDm.Dne(eDm, this.Dne);
    } 
  }
  
  BjH(iod paramiod1, iod paramiod2) {
    this.Dne = paramiod1;
    this.FWm = paramiod2;
  }
  
  public String Dne() {
    return this.FWm.Dne();
  }
  
  public String toString() {
    return this.Dne.toString() + ", with " + this.FWm.toString();
  }
  
  public boolean Dne(Object paramObject) {
    return (this.Dne.Dne(paramObject) && this.FWm.Dne(this.Dne.Dne(paramObject)));
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\BjH.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */