import java.util.Comparator;

class Ddl implements Comparator {
  final aXt Dne;
  
  public int Dne(iQt paramiQt1, iQt paramiQt2) {
    return (paramiQt1 instanceof NDp && paramiQt2 instanceof UgS) ? 1 : ((paramiQt2 instanceof NDp && paramiQt1 instanceof UgS) ? -1 : ((paramiQt2.Dne() < paramiQt1.Dne()) ? -1 : ((paramiQt2.Dne() > paramiQt1.Dne()) ? 1 : 0)));
  }
  
  public int compare(Object paramObject1, Object paramObject2) {
    return Dne((iQt)paramObject1, (iQt)paramObject2);
  }
  
  Ddl(aXt paramaXt) {
    this.Dne = paramaXt;
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\Ddl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */