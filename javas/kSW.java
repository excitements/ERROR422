import java.util.Comparator;

class kSW implements Comparator {
  final NZx Dne;
  
  kSW(NZx paramNZx) {
    this.Dne = paramNZx;
  }
  
  public int compare(Object paramObject1, Object paramObject2) {
    return Dne((Class)paramObject1, (Class)paramObject2);
  }
  
  public int Dne(Class paramClass1, Class paramClass2) {
    String str1 = (paramClass1.getPackage() == null) ? "" : paramClass1.getPackage().getName();
    String str2 = (paramClass2.getPackage() == null) ? "" : paramClass2.getPackage().getName();
    return str1.compareTo(str2);
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\kSW.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */