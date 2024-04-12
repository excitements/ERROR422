final class QCn {
  private final String Dne;
  
  QCn(String paramString) {
    this.Dne = paramString.replace("\\", "\\\\").replace("\"", "\\\"").replace("\b", "\\b").replace("\f", "\\f").replace("\n", "\\n").replace("\r", "\\r").replace("\t", "\\t");
  }
  
  public String toString() {
    return this.Dne;
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\QCn.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */