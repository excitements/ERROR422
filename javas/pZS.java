import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.lwjgl.opengl.GL11;

public class pZS {
  private static final List Dne;
  
  private static final Map Dne = new HashMap<>();
  
  public static synchronized void Dne() {
    for (byte b = 0; b < Dne.size(); b++)
      GL11.glDeleteTextures(((Integer)Dne.get(b)).intValue()); 
    Dne.clear();
  }
  
  public static synchronized int Dne(int paramInt) {
    int i = GL11.glGenLists(paramInt);
    Dne.put(Integer.valueOf(i), Integer.valueOf(paramInt));
    return i;
  }
  
  public static synchronized void FWm() {
    for (Map.Entry entry : Dne.entrySet())
      GL11.glDeleteLists(((Integer)entry.getKey()).intValue(), ((Integer)entry.getValue()).intValue()); 
    Dne.clear();
    Dne();
  }
  
  public static IntBuffer Dne(int paramInt) {
    return Dne(paramInt << 2).asIntBuffer();
  }
  
  public static synchronized int Dne() {
    int i = GL11.glGenTextures();
    Dne.add(Integer.valueOf(i));
    return i;
  }
  
  static {
    Dne = (Map)new ArrayList();
  }
  
  public static synchronized void Dne(int paramInt) {
    GL11.glDeleteLists(paramInt, ((Integer)Dne.remove(Integer.valueOf(paramInt))).intValue());
  }
  
  public static FloatBuffer Dne(int paramInt) {
    return Dne(paramInt << 2).asFloatBuffer();
  }
  
  public static synchronized ByteBuffer Dne(int paramInt) {
    return ByteBuffer.allocateDirect(paramInt).order(ByteOrder.nativeOrder());
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\pZS.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */