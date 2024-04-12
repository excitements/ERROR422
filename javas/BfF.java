import java.util.Random;

public class BfF {
  private Random Dne;
  
  private String[] Dne = (String[])new Random();
  
  public static final BfF Dne = new BfF();
  
  public BfF() {
    this.Dne = (BfF)"the elder scrolls klaatu berata niktu xyzzy bless curse light darkness fire air earth water hot dry cold wet ignite snuff embiggen twist shorten stretch fiddle destroy imbue galvanize enchant free limited range of towards inside sphere cube self other ball mental physical grow shrink demon elemental spirit animal creature beast humanoid undead fresh stale ".split(" ");
  }
  
  public void Dne(long paramLong) {
    this.Dne.setSeed(paramLong);
  }
  
  public String Dne() {
    int i = this.Dne.nextInt(2) + 3;
    String str = "";
    for (byte b = 0; b < i; b++) {
      if (b > 0)
        str = str + " "; 
      str = str + this.Dne[this.Dne.nextInt(this.Dne.length)];
    } 
    return str;
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\BfF.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */