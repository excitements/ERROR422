import java.util.List;

final class Ofm extends MbX {
  final int Dne;
  
  Ofm(int paramInt) {
    this.Dne = paramInt;
  }
  
  public boolean Dne(Object paramObject) {
    return Dne((List)paramObject);
  }
  
  public LIC Dne(List<LIC> paramList) {
    return paramList.get(this.Dne);
  }
  
  public boolean Dne(List paramList) {
    return (paramList.size() > this.Dne);
  }
  
  public String toString() {
    return "an element at index [" + this.Dne + "]";
  }
  
  public String Dne() {
    return Integer.toString(this.Dne);
  }
  
  public Object FWm(Object paramObject) {
    return Dne((List)paramObject);
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\Ofm.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */