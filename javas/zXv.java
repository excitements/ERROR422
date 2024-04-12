import java.net.URI;

public class zXv extends Pee {
  public zXv(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, String paramString) {
    super(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramString);
  }
  
  public void Dne(String paramString) {
    try {
      URI uRI = new URI(paramString);
      Class<?> clazz = Class.forName("java.awt.Desktop");
      Object object = clazz.getMethod("getDesktop", new Class[0]).invoke(null, new Object[0]);
      clazz.getMethod("browse", new Class[] { URI.class }).invoke(object, new Object[] { uRI });
    } catch (Throwable throwable) {
      throwable.printStackTrace();
    } 
  }
  
  static {
  
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\zXv.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */