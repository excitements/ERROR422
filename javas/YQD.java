import java.util.Arrays;

public final class YQD {
  public static iod Dne(Object... paramVarArgs) {
    return Dne(paramVarArgs, new iod(new etN()));
  }
  
  public static iod Dne(int paramInt) {
    return new iod(new Ofm(paramInt));
  }
  
  private static iod Dne(Object[] paramArrayOfObject, iod paramiod) {
    iod iod1 = paramiod;
    for (int i = paramArrayOfObject.length - 1; i >= 0; i--) {
      if (paramArrayOfObject[i] instanceof Integer) {
        iod1 = Dne(FWm(((Integer)paramArrayOfObject[i]).intValue()), iod1);
      } else {
        if (!(paramArrayOfObject[i] instanceof String))
          throw new IllegalArgumentException("Element [" + paramArrayOfObject[i] + "] of path elements [" + Arrays.toString(paramArrayOfObject) + "] was of illegal type [" + paramArrayOfObject[i].getClass().getCanonicalName() + "]; only Integer and String are valid."); 
        iod1 = Dne(FWm((String)paramArrayOfObject[i]), iod1);
      } 
    } 
    return iod1;
  }
  
  public static iod FWm(String paramString) {
    return aFZ(new Object[0]).Dne(Dne(paramString));
  }
  
  public static iod FWm(Object... paramVarArgs) {
    return Dne(paramVarArgs, new iod(new hNJ()));
  }
  
  public static iod Qnq(Object... paramVarArgs) {
    return Dne(paramVarArgs, new iod(new hAN()));
  }
  
  public static iod aFZ(Object... paramVarArgs) {
    return Dne(paramVarArgs, new iod(new ZHl()));
  }
  
  private static iod Dne(iod paramiod1, iod paramiod2) {
    return new iod(new BjH(paramiod1, paramiod2));
  }
  
  public static iod Dne(QUo paramQUo) {
    return new iod(new NYC(paramQUo));
  }
  
  public static iod Dne(String paramString) {
    return Dne(ACm.Dne(paramString));
  }
  
  static {
  
  }
  
  public static iod FWm(int paramInt) {
    return Qnq(new Object[0]).Dne(Dne(paramInt));
  }
  
  public static iod bzF(Object... paramVarArgs) {
    return Dne(paramVarArgs, new iod(new ujK()));
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\YQD.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */