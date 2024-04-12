public class WoB extends RuntimeException {
  private Object[] Dne;
  
  public WoB(String paramString, Object... paramVarArgs) {
    super(paramString);
    this.Dne = paramVarArgs;
  }
  
  public Object[] Dne() {
    return this.Dne;
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\WoB.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */