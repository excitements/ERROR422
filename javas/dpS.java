import java.util.List;
import java.util.Random;

public class dpS extends dEr {
  public boolean FWm(NMq paramNMq) {
    return true;
  }
  
  public NMq Dne(RmG paramRmG) {
    NMq nMq = new NMq(this);
    Dne(nMq, paramRmG);
    return nMq;
  }
  
  public NMq Dne(Random paramRandom) {
    ycv ycv = ycv.FWm[paramRandom.nextInt(ycv.FWm.length)];
    NMq nMq = new NMq(this.Qnq, 1, 0);
    int i = geR.Dne(paramRandom, ycv.bzF(), ycv.Dne());
    Dne(nMq, new RmG(ycv, i));
    return nMq;
  }
  
  public GXY Dne(NMq paramNMq) {
    return (Dne(paramNMq).Dne() > 0) ? GXY.FWm : super.Dne(paramNMq);
  }
  
  public fKu Dne(Random paramRandom, int paramInt1, int paramInt2, int paramInt3) {
    ycv ycv = ycv.FWm[paramRandom.nextInt(ycv.FWm.length)];
    NMq nMq = new NMq(this.Qnq, 1, 0);
    int i = geR.Dne(paramRandom, ycv.bzF(), ycv.Dne());
    Dne(nMq, new RmG(ycv, i));
    return new fKu(nMq, paramInt1, paramInt2, paramInt3);
  }
  
  public boolean a_(NMq paramNMq) {
    return false;
  }
  
  static {
  
  }
  
  public void Dne(NMq paramNMq, FiG paramFiG, List<String> paramList, boolean paramBoolean) {
    super.Dne(paramNMq, paramFiG, paramList, paramBoolean);
    mbZ mbZ = Dne(paramNMq);
    if (mbZ != null)
      for (byte b = 0; b < mbZ.Dne(); b++) {
        short s1 = ((WkD)mbZ.FWm(b)).Dne("id");
        short s2 = ((WkD)mbZ.FWm(b)).Dne("lvl");
        if (ycv.Dne[s1] != null)
          paramList.add(ycv.Dne[s1].Dne(s2)); 
      }  
  }
  
  public void Dne(ycv paramycv, List<NMq> paramList) {
    for (int i = paramycv.bzF(); i <= paramycv.Dne(); i++)
      paramList.add(Dne(new RmG(paramycv, i))); 
  }
  
  public dpS(int paramInt) {
    super(paramInt);
  }
  
  public void Dne(NMq paramNMq, RmG paramRmG) {
    mbZ mbZ = Dne(paramNMq);
    boolean bool = true;
    for (byte b = 0; b < mbZ.Dne(); b++) {
      WkD wkD = (WkD)mbZ.FWm(b);
      if (wkD.Dne("id") == paramRmG.Dne.FWm) {
        if (wkD.Dne("lvl") < paramRmG.Dne)
          wkD.Dne("lvl", (short)paramRmG.Dne); 
        bool = false;
        break;
      } 
    } 
    if (bool) {
      WkD wkD = new WkD();
      wkD.Dne("id", (short)paramRmG.Dne.FWm);
      wkD.Dne("lvl", (short)paramRmG.Dne);
      mbZ.Dne(wkD);
    } 
    if (!paramNMq.aFZ())
      paramNMq.FWm(new WkD()); 
    paramNMq.Dne().Dne("StoredEnchantments", mbZ);
  }
  
  public mbZ Dne(NMq paramNMq) {
    // Byte code:
    //   0: aload_1
    //   1: getfield Dne : LWkD;
    //   4: ifnull -> 34
    //   7: aload_1
    //   8: getfield Dne : LWkD;
    //   11: ldc 'StoredEnchantments'
    //   13: invokevirtual Dne : (Ljava/lang/String;)Z
    //   16: ifeq -> 34
    //   19: aload_1
    //   20: getfield Dne : LWkD;
    //   23: ldc 'StoredEnchantments'
    //   25: invokevirtual Dne : (Ljava/lang/String;)LoNe;
    //   28: checkcast mbZ
    //   31: goto -> 41
    //   34: new mbZ
    //   37: dup
    //   38: invokespecial <init> : ()V
    //   41: areturn
  }
  
  public fKu Dne(Random paramRandom) {
    return Dne(paramRandom, 1, 1, 1);
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\dpS.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */