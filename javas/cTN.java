import java.util.HashMap;
import java.util.Map;

public class cTN {
  private Map FWm = new HashMap<>();
  
  private static final cTN Dne = new cTN();
  
  private Map Dne = new HashMap<>();
  
  public float Dne(int paramInt) {
    return this.FWm.containsKey(Integer.valueOf(paramInt)) ? ((Float)this.FWm.get(Integer.valueOf(paramInt))).floatValue() : 0.0F;
  }
  
  public static final cTN Dne() {
    return (cTN)Dne;
  }
  
  public NMq Dne(int paramInt) {
    return (NMq)this.Dne.get(Integer.valueOf(paramInt));
  }
  
  public Map Dne() {
    return this.Dne;
  }
  
  public void Dne(int paramInt, NMq paramNMq, float paramFloat) {
    this.Dne.put(Integer.valueOf(paramInt), paramNMq);
    this.FWm.put(Integer.valueOf(paramNMq.bzF), Float.valueOf(paramFloat));
  }
  
  private cTN() {
    Dne(((zKP)zKP.Zpi).FWm, new NMq(dEr.IjH), 0.7F);
    Dne(((zKP)zKP.XHL).FWm, new NMq(dEr.mrb), 1.0F);
    Dne(zKP.ZgS.FWm, new NMq(dEr.div), 1.0F);
    Dne(((zKP)zKP.IjH).FWm, new NMq(zKP.trS), 0.1F);
    Dne(dEr.qrB.Qnq, new NMq(dEr.LVR), 0.35F);
    Dne(dEr.ipf.Qnq, new NMq(dEr.mzX), 0.35F);
    Dne(dEr.qqL.Qnq, new NMq(dEr.yIR), 0.35F);
    Dne(dEr.Zlx.Qnq, new NMq(dEr.kSP), 0.35F);
    Dne(zKP.bzF.FWm, new NMq(zKP.Dne), 0.1F);
    Dne(dEr.Jik.Qnq, new NMq(dEr.xEx), 0.3F);
    Dne(zKP.XjO.FWm, new NMq(dEr.edi, 1, 2), 0.2F);
    Dne(zKP.udO.FWm, new NMq(dEr.DyG, 1, 1), 0.15F);
    Dne(zKP.ghu.FWm, new NMq(dEr.Kvh), 1.0F);
    Dne(dEr.dnY.Qnq, new NMq(dEr.jXR), 0.35F);
    Dne(zKP.KLR.FWm, new NMq(dEr.PpL), 0.1F);
    Dne(zKP.kGO.FWm, new NMq(dEr.DyG), 0.1F);
    Dne(zKP.JLG.FWm, new NMq(dEr.exS), 0.7F);
    Dne(zKP.qLR.FWm, new NMq(dEr.edi, 1, 4), 0.2F);
    Dne(zKP.NEG.FWm, new NMq(dEr.RMv), 0.2F);
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\cTN.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */