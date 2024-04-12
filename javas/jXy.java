import java.util.List;

public class jXy extends xZE {
  public String Dne(gnI paramgnI) {
    return paramgnI.Dne("commands.time.usage", new Object[0]);
  }
  
  public void Dne(gnI paramgnI, String[] paramArrayOfString) {
    if (paramArrayOfString.length > 1) {
      if (paramArrayOfString[0].equals("set")) {
        int i;
        if (paramArrayOfString[1].equals("day")) {
          i = 0;
        } else if (paramArrayOfString[1].equals("night")) {
          i = 12500;
        } else {
          i = Dne(paramgnI, paramArrayOfString[1], 0);
        } 
        Dne(paramgnI, i);
        Dne(paramgnI, "commands.time.set", new Object[] { Integer.valueOf(i) });
        return;
      } 
      if (paramArrayOfString[0].equals("add")) {
        int i = Dne(paramgnI, paramArrayOfString[1], 0);
        FWm(paramgnI, i);
        Dne(paramgnI, "commands.time.added", new Object[] { Integer.valueOf(i) });
        return;
      } 
    } 
    throw new fxw("commands.time.usage", new Object[0]);
  }
  
  protected void Dne(gnI paramgnI, int paramInt) {
    // Byte code:
    //   0: iconst_0
    //   1: istore_3
    //   2: iload_3
    //   3: invokestatic Dne : ()LJwh;
    //   6: getfield Dne : [LRAN;
    //   9: arraylength
    //   10: if_icmpge -> 32
    //   13: invokestatic Dne : ()LJwh;
    //   16: getfield Dne : [LRAN;
    //   19: iload_3
    //   20: aaload
    //   21: iload_2
    //   22: i2l
    //   23: invokevirtual FWm : (J)V
    //   26: iinc #3, 1
    //   29: goto -> 2
    //   32: return
  }
  
  protected void FWm(gnI paramgnI, int paramInt) {
    // Byte code:
    //   0: iconst_0
    //   1: istore_3
    //   2: iload_3
    //   3: invokestatic Dne : ()LJwh;
    //   6: getfield Dne : [LRAN;
    //   9: arraylength
    //   10: if_icmpge -> 42
    //   13: invokestatic Dne : ()LJwh;
    //   16: getfield Dne : [LRAN;
    //   19: iload_3
    //   20: aaload
    //   21: astore #4
    //   23: aload #4
    //   25: aload #4
    //   27: invokevirtual bzF : ()J
    //   30: iload_2
    //   31: i2l
    //   32: ladd
    //   33: invokevirtual FWm : (J)V
    //   36: iinc #3, 1
    //   39: goto -> 2
    //   42: return
  }
  
  public List Dne(gnI paramgnI, String[] paramArrayOfString) {
    return (paramArrayOfString.length == 1) ? Dne(paramArrayOfString, new String[] { "set", "add" }) : ((paramArrayOfString.length == 2 && paramArrayOfString[0].equals("set")) ? Dne(paramArrayOfString, new String[] { "day", "night" }) : null);
  }
  
  public int Dne() {
    return 2;
  }
  
  static {
  
  }
  
  public String Dne() {
    return "time";
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\jXy.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */