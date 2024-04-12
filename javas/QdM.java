import java.util.concurrent.Callable;

final class QdM implements Callable {
  final int Dne;
  
  QdM(int paramInt) {
    this.Dne = paramInt;
  }
  
  public Object call() {
    return Dne();
  }
  
  public String Dne() {
    try {
      return String.format("ID #%d (%s // %s)", new Object[] { Integer.valueOf(this.Dne), zKP.Dne[this.Dne].bzF(), zKP.Dne[this.Dne].getClass().getCanonicalName() });
    } catch (Throwable throwable) {
      return "ID #" + this.Dne;
    } 
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\QdM.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */