import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public abstract class NuQ {
  private final Jwh Dne;
  
  public volatile boolean Dne;
  
  private final List Dne = Collections.synchronizedList(new ArrayList());
  
  public void FWm() {
    for (byte b = 0; b < this.Dne.size(); b++) {
      Tnv tnv = this.Dne.get(b);
      try {
        tnv.Dne();
      } catch (Exception exception) {
        if (tnv.Dne instanceof bqd) {
          McM mcM = McM.Dne(exception, "Ticking memory connection");
          throw new kaJ(mcM);
        } 
        this.Dne.Dne().Dne("Failed to handle packet for " + tnv.Dne.Dne() + "/" + tnv.Dne.FWm() + ": " + exception, exception);
        tnv.Dne("Internal server error");
      } 
      if (tnv.Dne != null)
        this.Dne.remove(b--); 
      tnv.Dne.Dne();
    } 
  }
  
  public NuQ(Jwh paramJwh) {
    this.Dne = false;
    this.Dne = (List)paramJwh;
    this.Dne = true;
  }
  
  public void Dne() {
    this.Dne = false;
  }
  
  public Jwh Dne() {
    return (Jwh)this.Dne;
  }
  
  public void Dne(Tnv paramTnv) {
    this.Dne.add(paramTnv);
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\NuQ.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */