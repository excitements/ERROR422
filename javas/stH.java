import java.util.concurrent.Callable;

class stH implements Callable {
  final McM Dne;
  
  public String Dne() {
    return System.getProperty("java.version") + ", " + System.getProperty("java.vendor");
  }
  
  stH(McM paramMcM) {
    this.Dne = paramMcM;
  }
  
  public Object call() {
    return Dne();
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\stH.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */