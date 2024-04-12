import java.util.concurrent.Callable;

class isf implements Callable {
  final xoY Dne;
  
  public Object call() {
    return Dne();
  }
  
  isf(xoY paramxoY) {
    this.Dne = paramxoY;
  }
  
  public String Dne() {
    return String.format("Rain time: %d (now: %b), thunder time: %d (now: %b)", new Object[] { Integer.valueOf(xoY.zGp(this.Dne)), Boolean.valueOf(xoY.FWm(this.Dne)), Integer.valueOf(xoY.DyG(this.Dne)), Boolean.valueOf(xoY.bzF(this.Dne)) });
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\isf.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */