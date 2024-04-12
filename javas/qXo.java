import java.util.Random;

public class qXo extends OdI {
  public qXo(int paramInt) {
    super(paramInt);
    this.FWm.clear();
    this.Dne = (byte)((zKP)zKP.IjH).FWm;
    this.FWm = (byte)((zKP)zKP.IjH).FWm;
    this.Dne.Qnq = -999;
    this.Dne.DyG = 2;
    this.Dne.IjH = 50;
    this.Dne.mrb = 10;
  }
  
  static {
  
  }
  
  public void Dne(Qnq paramQnq, Random paramRandom, int paramInt1, int paramInt2) {
    super.Dne(paramQnq, paramRandom, paramInt1, paramInt2);
    if (paramRandom.nextInt(1000) == 0) {
      int i = paramInt1 + paramRandom.nextInt(16) + 8;
      int j = paramInt2 + paramRandom.nextInt(16) + 8;
      Lab lab = new Lab();
      lab.Dne(paramQnq, paramRandom, i, paramQnq.FWm(i, j) + 1, j);
    } 
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\qXo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */