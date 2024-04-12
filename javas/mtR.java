import java.util.concurrent.Callable;

class mtR implements Callable {
  final xoY Dne;
  
  public Object call() {
    return Dne();
  }
  
  mtR(xoY paramxoY) {
    this.Dne = paramxoY;
  }
  
  public String Dne() {
    String str = "Unknown?";
    try {
      switch (xoY.aFZ(this.Dne)) {
        case 19132:
          str = "McRegion";
          break;
        case 19133:
          str = "Anvil";
          break;
      } 
    } catch (Throwable throwable) {}
    return String.format("0x%05X - %s", new Object[] { Integer.valueOf(xoY.aFZ(this.Dne)), str });
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\mtR.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */