import java.util.Random;

public class Nkb extends ycv {
  public static boolean Dne(NMq paramNMq, int paramInt, Random paramRandom) {
    return (paramNMq.Dne() instanceof Qoi && paramRandom.nextFloat() < 0.6F) ? false : ((paramRandom.nextInt(paramInt + 1) > 0));
  }
  
  static {
  
  }
  
  public int Dne() {
    return 3;
  }
  
  public int FWm(int paramInt) {
    return super.Dne(paramInt) + 50;
  }
  
  public int Dne(int paramInt) {
    return 5 + (paramInt - 1) * 8;
  }
  
  public boolean Dne(NMq paramNMq) {
    return paramNMq.FWm() ? true : super.Dne(paramNMq);
  }
  
  protected Nkb(int paramInt1, int paramInt2) {
    super(paramInt1, paramInt2, ACj.div);
    Dne("durability");
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\Nkb.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */