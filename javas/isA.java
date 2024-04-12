public class isA implements MqS {
  private MqS Dne;
  
  private String Dne;
  
  private MqS FWm;
  
  public int aFZ() {
    return this.Dne.aFZ();
  }
  
  public void a_() {
    this.Dne.a_();
    this.FWm.a_();
  }
  
  public boolean Dne(int paramInt, NMq paramNMq) {
    return true;
  }
  
  public boolean Dne(MqS paramMqS) {
    return (this.Dne == paramMqS || this.FWm == paramMqS);
  }
  
  public String b_() {
    return this.Dne.d_() ? this.Dne.b_() : (this.FWm.d_() ? this.FWm.b_() : this.Dne);
  }
  
  public NMq Dne(int paramInt1, int paramInt2) {
    return (paramInt1 >= this.Dne.Qnq()) ? this.FWm.Dne(paramInt1 - this.Dne.Qnq(), paramInt2) : this.Dne.Dne(paramInt1, paramInt2);
  }
  
  public NMq Dne(int paramInt) {
    return (paramInt >= this.Dne.Qnq()) ? this.FWm.Dne(paramInt - this.Dne.Qnq()) : this.Dne.Dne(paramInt);
  }
  
  public boolean Dne(FiG paramFiG) {
    return (this.Dne.Dne(paramFiG) && this.FWm.Dne(paramFiG));
  }
  
  public void Dne(int paramInt, NMq paramNMq) {
    if (paramInt >= this.Dne.Qnq()) {
      this.FWm.Dne(paramInt - this.Dne.Qnq(), paramNMq);
    } else {
      this.Dne.Dne(paramInt, paramNMq);
    } 
  }
  
  public boolean d_() {
    return (this.Dne.d_() || this.FWm.d_());
  }
  
  public void bzF() {
    this.Dne.bzF();
    this.FWm.bzF();
  }
  
  public void i_() {
    this.Dne.i_();
    this.FWm.i_();
  }
  
  public isA(String paramString, MqS paramMqS1, MqS paramMqS2) {
    this.Dne = paramString;
    if (paramMqS1 == null)
      paramMqS1 = paramMqS2; 
    if (paramMqS2 == null)
      paramMqS2 = paramMqS1; 
    this.Dne = (String)paramMqS1;
    this.FWm = paramMqS2;
  }
  
  public NMq FWm(int paramInt) {
    return (paramInt >= this.Dne.Qnq()) ? this.FWm.FWm(paramInt - this.Dne.Qnq()) : this.Dne.FWm(paramInt);
  }
  
  public int Qnq() {
    return this.Dne.Qnq() + this.FWm.Qnq();
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\isA.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */