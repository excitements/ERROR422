import java.util.concurrent.Callable;

class VUG implements Callable {
  final McM Dne;
  
  VUG(McM paramMcM) {
    this.Dne = paramMcM;
  }
  
  public Object call() {
    return Dne();
  }
  
  public String Dne() {
    Runtime runtime = Runtime.getRuntime();
    long l1 = runtime.maxMemory();
    long l2 = runtime.totalMemory();
    long l3 = runtime.freeMemory();
    long l4 = l1 / 1024L / 1024L;
    long l5 = l2 / 1024L / 1024L;
    long l6 = l3 / 1024L / 1024L;
    return l3 + " bytes (" + l6 + " MB) / " + l2 + " bytes (" + l5 + " MB) up to " + l1 + " bytes (" + l4 + " MB)";
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\VUG.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */