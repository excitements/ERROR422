import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class RLC {
  public static DOt FWm;
  
  private final String FWm;
  
  private final DOt Qnq;
  
  public static DOt bzF;
  
  public final int bzF;
  
  private static NumberFormat Dne = NumberFormat.getIntegerInstance(Locale.US);
  
  public static DOt Dne = new QoI();
  
  public boolean Dne;
  
  public String Dne = false;
  
  private static DecimalFormat Dne = new DecimalFormat("########0.00");
  
  public RLC(int paramInt, String paramString) {
    this(paramInt, paramString, (DOt)Dne);
  }
  
  static {
    FWm = (String)new kNJ();
    bzF = new stM();
  }
  
  public String FWm() {
    return this.FWm;
  }
  
  static NumberFormat Dne() {
    return Dne;
  }
  
  public RLC(int paramInt, String paramString, DOt paramDOt) {
    this.bzF = paramInt;
    this.FWm = paramString;
    this.Qnq = paramDOt;
  }
  
  public RLC FWm() {
    this.Dne = true;
    return this;
  }
  
  static DecimalFormat Dne() {
    return Dne;
  }
  
  public boolean Dne() {
    return false;
  }
  
  public RLC Dne() {
    if (trP.Dne.containsKey(Integer.valueOf(this.bzF)))
      throw new RuntimeException("Duplicate stat id: \"" + ((RLC)trP.Dne.get(Integer.valueOf(this.bzF))).FWm + "\" and \"" + this.FWm + "\" at id " + this.bzF); 
    trP.Dne.add(this);
    trP.Dne.put(Integer.valueOf(this.bzF), this);
    this.Dne = (DecimalFormat)pLv.Dne(this.bzF);
    return this;
  }
  
  public String Dne(int paramInt) {
    return this.Qnq.Dne(paramInt);
  }
  
  public String toString() {
    return KGL.Dne(this.FWm);
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\RLC.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */