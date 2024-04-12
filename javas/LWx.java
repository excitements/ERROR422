import java.util.concurrent.Callable;

class LWx implements Callable {
  final sMa Dne;
  
  public String Dne() {
    return Klb.Dne(this.Dne) + " (" + this.Dne.getClass().getCanonicalName() + ")";
  }
  
  LWx(sMa paramsMa) {
    this.Dne = paramsMa;
  }
  
  public Object call() {
    return Dne();
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\LWx.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */