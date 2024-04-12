import java.util.concurrent.Callable;

class PCC implements Callable {
  final iJs Dne;
  
  public String Dne() {
    String str = this.Dne.IjH();
    return !str.equals("vanilla") ? ("Definitely; Server brand changed to '" + str + "'") : "Unknown (can't tell)";
  }
  
  public Object call() {
    return Dne();
  }
  
  PCC(iJs paramiJs) {
    this.Dne = paramiJs;
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\PCC.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */