import java.util.Map;

public class Kvh extends sAy {
  private double Dne = 0.01D;
  
  public Kvh() {}
  
  public Kvh(Map paramMap) {
    for (Map.Entry entry : paramMap.entrySet()) {
      if (((String)entry.getKey()).equals("chance"))
        this.Dne = geR.Dne((String)entry.getValue(), this.Dne); 
    } 
  }
  
  protected boolean Dne(int paramInt1, int paramInt2) {
    // Byte code:
    //   0: aload_0
    //   1: getfield Dne : Ljava/util/Random;
    //   4: invokevirtual nextDouble : ()D
    //   7: aload_0
    //   8: getfield Dne : D
    //   11: dcmpg
    //   12: ifge -> 42
    //   15: aload_0
    //   16: getfield Dne : Ljava/util/Random;
    //   19: bipush #80
    //   21: invokevirtual nextInt : (I)I
    //   24: iload_1
    //   25: invokestatic abs : (I)I
    //   28: iload_2
    //   29: invokestatic abs : (I)I
    //   32: invokestatic max : (II)I
    //   35: if_icmpge -> 42
    //   38: iconst_1
    //   39: goto -> 43
    //   42: iconst_0
    //   43: ireturn
  }
  
  protected JhS Dne(int paramInt1, int paramInt2) {
    return new HDz(this.Dne, this.Dne, paramInt1, paramInt2);
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\Kvh.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */