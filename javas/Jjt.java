import java.util.List;

public class Jjt extends PBI {
  static {
  
  }
  
  public boolean FWm(NMq paramNMq) {
    return (paramNMq.Qnq() > 0);
  }
  
  public Jjt(int paramInt1, int paramInt2, float paramFloat, boolean paramBoolean) {
    super(paramInt1, paramInt2, paramFloat, paramBoolean);
    Dne(true);
  }
  
  public GXY Dne(NMq paramNMq) {
    return (paramNMq.Qnq() == 0) ? GXY.bzF : GXY.Qnq;
  }
  
  protected void Dne(NMq paramNMq, Qnq paramQnq, FiG paramFiG) {
    if (paramNMq.Qnq() > 0) {
      if (paramQnq.aFZ == null) {
        paramFiG.Qnq(new NAx(SXd.XHL.Dne, 600, 3));
        paramFiG.Qnq(new NAx(SXd.Zpi.Dne, 6000, 0));
        paramFiG.Qnq(new NAx(SXd.kGO.Dne, 6000, 0));
      } 
    } else {
      super.Dne(paramNMq, paramQnq, paramFiG);
    } 
  }
  
  public void Dne(int paramInt, JcN paramJcN, List<NMq> paramList) {
    paramList.add(new NMq(paramInt, 1, 0));
    paramList.add(new NMq(paramInt, 1, 1));
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\Jjt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */