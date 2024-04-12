import java.util.concurrent.Callable;

class QUe implements Callable {
  final VzZ Dne;
  
  public Object call() {
    return Dne();
  }
  
  public String Dne() {
    return VzZ.Dne(this.Dne).size() + " total; " + VzZ.Dne(this.Dne).toString();
  }
  
  QUe(VzZ paramVzZ) {
    this.Dne = paramVzZ;
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\QUe.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */