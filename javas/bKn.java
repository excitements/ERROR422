import java.io.PushbackReader;
import java.io.Reader;

final class bKn implements BEs {
  private int FWm = 1;
  
  private boolean Dne;
  
  private int Dne;
  
  private final PushbackReader Dne = false;
  
  public bKn(Reader paramReader) {
    this.Dne = false;
    this.Dne = new PushbackReader(paramReader);
  }
  
  public int Dne() {
    int i = this.Dne.read();
    Dne(i);
    return i;
  }
  
  public int Dne(char[] paramArrayOfchar) {
    int i = this.Dne.read(paramArrayOfchar);
    char[] arrayOfChar = paramArrayOfchar;
    int j = paramArrayOfchar.length;
    for (byte b = 0; b < j; b++) {
      char c = arrayOfChar[b];
      Dne(c);
    } 
    return i;
  }
  
  public void Dne(char[] paramArrayOfchar) {
    this.Dne -= paramArrayOfchar.length;
    if (this.Dne < null)
      this.Dne = false; 
  }
  
  public int bzF() {
    return this.FWm;
  }
  
  public void Dne(char paramChar) {
    this.Dne--;
    if (this.Dne < null)
      this.Dne = false; 
    this.Dne.unread(paramChar);
  }
  
  private void Dne(int paramInt) {
    if (13 == paramInt) {
      this.Dne = false;
      this.FWm++;
      this.Dne = true;
    } else {
      if (10 == paramInt && this.Dne == null) {
        this.Dne = false;
        this.FWm++;
      } else {
        this.Dne++;
      } 
      this.Dne = false;
    } 
  }
  
  public int FWm() {
    return this.Dne;
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\bKn.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */