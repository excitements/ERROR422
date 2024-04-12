import java.util.concurrent.Callable;

class Lzp implements Callable {
  final NER Dne;
  
  final Tnv Dne;
  
  public Object call() {
    return Dne();
  }
  
  Lzp(Tnv paramTnv, NER paramNER) {
    this.Dne = paramTnv;
    this.Dne = (Tnv)paramNER;
  }
  
  public String Dne() {
    return this.Dne.getClass().getCanonicalName();
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\Lzp.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */