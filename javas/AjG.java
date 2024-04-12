public class AjG extends ipD {
  public int Dne;
  
  private boolean Dne;
  
  public String[] Dne = new String[] { "", "", "", "" };
  
  public NER Dne() {
    String[] arrayOfString = new String[4];
    System.arraycopy(this.Dne, 0, arrayOfString, 0, 4);
    return new eFM(this.Qnq, this.aFZ, this.zGp, arrayOfString);
  }
  
  public AjG() {
    this.Dne = -1;
    this.Dne = true;
  }
  
  public void Dne(WkD paramWkD) {
    this.Dne = false;
    super.Dne(paramWkD);
    for (byte b = 0; b < 4; b++) {
      this.Dne[b] = paramWkD.Dne("Text" + (b + 1));
      if (this.Dne[b].length() > 15)
        this.Dne[b] = this.Dne[b].substring(0, 15); 
    } 
  }
  
  public void Dne(boolean paramBoolean) {
    this.Dne = paramBoolean;
  }
  
  public void FWm(WkD paramWkD) {
    super.FWm(paramWkD);
    paramWkD.Dne("Text1", this.Dne[0]);
    paramWkD.Dne("Text2", this.Dne[1]);
    paramWkD.Dne("Text3", this.Dne[2]);
    paramWkD.Dne("Text4", this.Dne[3]);
  }
  
  public boolean Dne() {
    return this.Dne;
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\AjG.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */