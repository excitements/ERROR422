import java.awt.image.BufferedImage;
import java.io.File;
import java.nio.IntBuffer;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.imageio.ImageIO;
import org.lwjgl.BufferUtils;
import org.lwjgl.opengl.GL11;

public class qQe {
  private static final DateFormat Dne = new SimpleDateFormat("yyyy-MM-dd_HH.mm.ss");
  
  private static int[] Dne;
  
  private static IntBuffer Dne;
  
  public static String Dne(File paramFile, String paramString, int paramInt1, int paramInt2) {
    try {
      File file2;
      File file1 = new File(paramFile, "screenshots");
      file1.mkdir();
      int i = paramInt1 * paramInt2;
      if (Dne == null || Dne.capacity() < i) {
        Dne = BufferUtils.createIntBuffer(i);
        Dne = (IntBuffer)new int[i];
      } 
      GL11.glPixelStorei(3333, 1);
      GL11.glPixelStorei(3317, 1);
      Dne.clear();
      GL11.glReadPixels(0, 0, paramInt1, paramInt2, 32993, 33639, Dne);
      Dne.get((int[])Dne);
      Dne((int[])Dne, paramInt1, paramInt2);
      BufferedImage bufferedImage = new BufferedImage(paramInt1, paramInt2, 1);
      bufferedImage.setRGB(0, 0, paramInt1, paramInt2, (int[])Dne, 0, paramInt1);
      if (paramString == null) {
        file2 = Dne(file1);
      } else {
        file2 = new File(file1, paramString);
      } 
      ImageIO.write(bufferedImage, "png", file2);
      return "Saved screenshot as " + file2.getName();
    } catch (Exception exception) {
      exception.printStackTrace();
      return "Failed to save: " + exception;
    } 
  }
  
  public static String Dne(File paramFile, int paramInt1, int paramInt2) {
    return Dne(paramFile, (String)null, paramInt1, paramInt2);
  }
  
  private static void Dne(int[] paramArrayOfint, int paramInt1, int paramInt2) {
    int[] arrayOfInt = new int[paramInt1];
    int i = paramInt2 / 2;
    for (byte b = 0; b < i; b++) {
      System.arraycopy(paramArrayOfint, b * paramInt1, arrayOfInt, 0, paramInt1);
      System.arraycopy(paramArrayOfint, (paramInt2 - 1 - b) * paramInt1, paramArrayOfint, b * paramInt1, paramInt1);
      System.arraycopy(arrayOfInt, 0, paramArrayOfint, (paramInt2 - 1 - b) * paramInt1, paramInt1);
    } 
  }
  
  private static File Dne(File paramFile) {
    String str = Dne.format(new Date()).toString();
    for (byte b = 1;; b++) {
      File file = new File(paramFile, str + ((b == 1) ? "" : ("_" + b)) + ".png");
      if (!file.exists())
        return file; 
    } 
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\qQe.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */