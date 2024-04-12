import java.util.concurrent.Callable;

final class unI implements Callable {
  final int Dne;
  
  unI(int paramInt) {
    this.Dne = paramInt;
  }
  
  public String Dne() {
    if (this.Dne < 0)
      return "Unknown? (Got " + this.Dne + ")"; 
    String str = String.format("%4s", new Object[] { Integer.toBinaryString(this.Dne) }).replace(" ", "0");
    return String.format("%1$d / 0x%1$X / 0b%2$s", new Object[] { Integer.valueOf(this.Dne), str });
  }
  
  public Object call() {
    return Dne();
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar\\unI.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */