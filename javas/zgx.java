import java.util.concurrent.Callable;

class zgx implements Callable {
  final McM Dne;
  
  zgx(McM paramMcM) {
    this.Dne = paramMcM;
  }
  
  public Object call() {
    return Dne();
  }
  
  public String Dne() {
    return System.getProperty("java.vm.name") + " (" + System.getProperty("java.vm.info") + "), " + System.getProperty("java.vm.vendor");
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\zgx.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */