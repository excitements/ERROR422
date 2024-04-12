public class zRI extends yws {
  private final pjB Dne;
  
  public zRI(pjB parampjB) {
    super(parampjB, FiG.class, 8.0F);
    this.Dne = parampjB;
  }
  
  public boolean Dne() {
    if (this.Dne.ZfC()) {
      this.Dne = (pjB)this.Dne.Dne();
      return true;
    } 
    return false;
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\zRI.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */