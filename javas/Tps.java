import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Tps extends jsv {
  public List Dne;
  
  public List FWm;
  
  public ZLf Dne;
  
  public ArrayList Dne = new ArrayList();
  
  public Tps(Random paramRandom, int paramInt1, int paramInt2) {
    super(paramRandom, paramInt1, paramInt2);
    this.Dne = new ArrayList();
    for (ZLf zLf : etZ.Dne()) {
      zLf.FWm = 0;
      this.Dne.add(zLf);
    } 
    this.FWm = new ArrayList();
    for (ZLf zLf : etZ.FWm()) {
      zLf.FWm = 0;
      this.FWm.add(zLf);
    } 
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\Tps.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */