import java.util.Random;

public class kqp extends ycv {
  public static int Dne(int paramInt, Random paramRandom) {
    return (paramInt > 10) ? (paramInt - 10) : (1 + paramRandom.nextInt(4));
  }
  
  static {
  
  }
  
  public static void Dne(sMa paramsMa, FUH paramFUH, Random paramRandom) {
    int i = UYp.zGp(paramFUH);
    NMq nMq = UYp.Dne(ycv.div, paramFUH);
    if (Dne(i, paramRandom)) {
      paramsMa.Dne(zBn.Dne(paramFUH), Dne(i, paramRandom));
      paramsMa.Dne("damage.thorns", 0.5F, 1.0F);
      if (nMq != null)
        nMq.Dne(3, paramFUH); 
    } else if (nMq != null) {
      nMq.Dne(1, paramFUH);
    } 
  }
  
  public static boolean Dne(int paramInt, Random paramRandom) {
    return (paramInt <= 0) ? false : ((paramRandom.nextFloat() < 0.15F * paramInt));
  }
  
  public int Dne(int paramInt) {
    return 10 + 20 * (paramInt - 1);
  }
  
  public int FWm(int paramInt) {
    return super.Dne(paramInt) + 50;
  }
  
  public kqp(int paramInt1, int paramInt2) {
    super(paramInt1, paramInt2, ACj.aFZ);
    Dne("thorns");
  }
  
  public boolean Dne(NMq paramNMq) {
    return (paramNMq.Dne() instanceof Qoi) ? true : super.Dne(paramNMq);
  }
  
  public int Dne() {
    return 3;
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\kqp.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */