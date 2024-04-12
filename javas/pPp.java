public final class pPp extends Exception {
  private final int Dne;
  
  private final int FWm;
  
  pPp(String paramString, Throwable paramThrowable, BEs paramBEs) {
    super("At line " + paramBEs.bzF() + ", column " + paramBEs.FWm() + ":  " + paramString, paramThrowable);
    this.Dne = paramBEs.FWm();
    this.FWm = paramBEs.bzF();
  }
  
  pPp(String paramString, BEs paramBEs) {
    super("At line " + paramBEs.bzF() + ", column " + paramBEs.FWm() + ":  " + paramString);
    this.Dne = paramBEs.FWm();
    this.FWm = paramBEs.bzF();
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\pPp.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */