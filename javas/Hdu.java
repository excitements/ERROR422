import java.util.concurrent.Callable;

class Hdu implements Callable {
  final McM Dne;
  
  Hdu(McM paramMcM) {
    this.Dne = paramMcM;
  }
  
  public String Dne() {
    int i = bSp.Dne().Dne();
    int j = 56 * i;
    int k = j / 1024 / 1024;
    int m = bSp.Dne().FWm();
    int n = 56 * m;
    int i1 = n / 1024 / 1024;
    return i + " (" + j + " bytes; " + k + " MB) allocated, " + m + " (" + n + " bytes; " + i1 + " MB) used";
  }
  
  public Object call() {
    return Dne();
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\Hdu.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */