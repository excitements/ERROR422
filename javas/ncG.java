public class ncG extends ycv {
  public int Dne(int paramInt) {
    return 15 + (paramInt - 1) * 9;
  }
  
  protected ncG(int paramInt1, int paramInt2, ACj paramACj) {
    super(paramInt1, paramInt2, paramACj);
    Dne("lootBonus");
    if (paramACj == ACj.div)
      Dne("lootBonusDigger"); 
  }
  
  public boolean Dne(ycv paramycv) {
    return (super.Dne(paramycv) && paramycv.FWm != trS.FWm);
  }
  
  static {
  
  }
  
  public int FWm(int paramInt) {
    return super.Dne(paramInt) + 50;
  }
  
  public int Dne() {
    return 3;
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\ncG.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */