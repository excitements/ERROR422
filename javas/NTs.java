import java.util.concurrent.Callable;

class NTs implements Callable {
  final ipD Dne;
  
  NTs(ipD paramipD) {
    this.Dne = paramipD;
  }
  
  public String Dne() {
    int i = this.Dne.Dne.bzF(this.Dne.Qnq, this.Dne.aFZ, this.Dne.zGp);
    if (i < 0)
      return "Unknown? (Got " + i + ")"; 
    String str = String.format("%4s", new Object[] { Integer.toBinaryString(i) }).replace(" ", "0");
    return String.format("%1$d / 0x%1$X / 0b%2$s", new Object[] { Integer.valueOf(i), str });
  }
  
  public Object call() {
    return Dne();
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\NTs.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */