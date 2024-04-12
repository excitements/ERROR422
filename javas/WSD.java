import java.util.concurrent.Callable;

class WSD implements Callable {
  final ipD Dne;
  
  public Object call() {
    return Dne();
  }
  
  public String Dne() {
    return (String)ipD.Dne().get(this.Dne.getClass()) + " // " + this.Dne.getClass().getCanonicalName();
  }
  
  WSD(ipD paramipD) {
    this.Dne = paramipD;
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\WSD.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */