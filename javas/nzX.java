import java.security.BasicPermission;
import java.security.Permission;
import java.util.StringTokenizer;

public class nzX extends BasicPermission {
  private final int Dne;
  
  private final String Dne = "all";
  
  public nzX(String paramString) {
    super(paramString);
    this.Dne = '\017';
  }
  
  public nzX(String paramString1, String paramString2) {
    super(paramString1, paramString2);
    this.Dne = Dne(paramString2);
  }
  
  public boolean equals(Object paramObject) {
    if (paramObject == this)
      return true; 
    if (!(paramObject instanceof nzX))
      return false; 
    nzX nzX1 = (nzX)paramObject;
    return (this.Dne == nzX1.Dne && getName().equals(nzX1.getName()));
  }
  
  public boolean implies(Permission paramPermission) {
    // Byte code:
    //   0: aload_1
    //   1: instanceof nzX
    //   4: ifne -> 9
    //   7: iconst_0
    //   8: ireturn
    //   9: aload_0
    //   10: invokevirtual getName : ()Ljava/lang/String;
    //   13: aload_1
    //   14: invokevirtual getName : ()Ljava/lang/String;
    //   17: invokevirtual equals : (Ljava/lang/Object;)Z
    //   20: ifne -> 25
    //   23: iconst_0
    //   24: ireturn
    //   25: aload_1
    //   26: checkcast nzX
    //   29: astore_2
    //   30: aload_0
    //   31: getfield Dne : I
    //   34: aload_2
    //   35: getfield Dne : I
    //   38: iand
    //   39: aload_2
    //   40: getfield Dne : I
    //   43: if_icmpne -> 50
    //   46: iconst_1
    //   47: goto -> 51
    //   50: iconst_0
    //   51: ireturn
  }
  
  public int hashCode() {
    return getName().hashCode() + this.Dne;
  }
  
  public String getActions() {
    return this.Dne;
  }
  
  private int Dne(String paramString) {
    StringTokenizer stringTokenizer = new StringTokenizer(wdv.Dne(paramString), " ,");
    int i = 0;
    while (stringTokenizer.hasMoreTokens()) {
      String str = stringTokenizer.nextToken();
      if (str.equals("threadlocalecimplicitlyca")) {
        i |= 0x1;
        continue;
      } 
      if (str.equals("ecimplicitlyca")) {
        i |= 0x2;
        continue;
      } 
      if (str.equals("threadlocaldhdefaultparams")) {
        i |= 0x4;
        continue;
      } 
      if (str.equals("dhdefaultparams")) {
        i |= 0x8;
        continue;
      } 
      if (str.equals("all"))
        i |= 0xF; 
    } 
    if (i == 0)
      throw new IllegalArgumentException("unknown permissions passed to mask"); 
    return i;
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\nzX.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */