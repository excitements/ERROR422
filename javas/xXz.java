import java.io.File;

public class xXz extends yxO {
  public void Dne() {
    // Byte code:
    //   0: getstatic Osh.Dne : LOsh;
    //   3: invokevirtual Dne : ()V
    //   6: goto -> 14
    //   9: astore_1
    //   10: aload_1
    //   11: invokevirtual printStackTrace : ()V
    //   14: invokestatic Dne : ()V
    //   17: return
    // Exception table:
    //   from	to	target	type
    //   0	6	9	java/lang/InterruptedException
  }
  
  public void Dne(xoY paramxoY, WkD paramWkD) {
    paramxoY.Qnq(19133);
    super.Dne(paramxoY, paramWkD);
  }
  
  public YHU Dne(Jik paramJik) {
    File file = Dne();
    if (paramJik instanceof XjO) {
      File file1 = new File(file, "DIM-1");
      file1.mkdirs();
      return new EwP(file1);
    } 
    if (paramJik instanceof TKg) {
      File file1 = new File(file, "DIM1");
      file1.mkdirs();
      return new EwP(file1);
    } 
    return new EwP(file);
  }
  
  static {
  
  }
  
  public xXz(File paramFile, String paramString, boolean paramBoolean) {
    super(paramFile, paramString, paramBoolean);
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\xXz.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */