public final class rtv extends PiY {
  private static final lEc Dne = new GZl();
  
  private static String Dne(EDm paramEDm, Object[] paramArrayOfObject, bab parambab) {
    return "Failed to find " + paramEDm.Dne.toString() + " at [" + EDm.Dne(paramEDm.Dne) + "] while resolving [" + Dne(paramArrayOfObject) + "] in " + Dne.Dne(parambab) + ".";
  }
  
  static rtv Dne(EDm paramEDm, Object[] paramArrayOfObject, bab parambab) {
    return new rtv(paramEDm, paramArrayOfObject, parambab);
  }
  
  private rtv(EDm paramEDm, Object[] paramArrayOfObject, bab parambab) {
    super(Dne(paramEDm, paramArrayOfObject, parambab));
  }
  
  private static String Dne(Object[] paramArrayOfObject) {
    StringBuilder stringBuilder = new StringBuilder();
    boolean bool = true;
    Object[] arrayOfObject = paramArrayOfObject;
    int i = paramArrayOfObject.length;
    for (byte b = 0; b < i; b++) {
      Object object = arrayOfObject[b];
      if (!bool)
        stringBuilder.append("."); 
      bool = false;
      if (object instanceof String) {
        stringBuilder.append("\"").append(object).append("\"");
      } else {
        stringBuilder.append(object);
      } 
    } 
    return stringBuilder.toString();
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\rtv.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */