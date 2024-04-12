import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import javax.imageio.ImageIO;
import net.minecraft.client.Minecraft;

public class zpX {
  private final HashMap FWm;
  
  private int Dne;
  
  private final HashMap Dne = false;
  
  private static zpX Dne;
  
  public zpX() {
    this.Dne = (zpX)new HashMap<>();
    this.FWm = new HashMap<>();
  }
  
  public int Dne() {
    return this.Dne++;
  }
  
  private String Dne(String paramString) {
    File file = new File(paramString);
    return file.getName().substring(0, file.getName().lastIndexOf('.'));
  }
  
  public dGv Dne(String paramString) {
    int i = Minecraft.Dne();
    return new dGv(paramString, i, i, true);
  }
  
  public void Dne(String paramString, dmo paramdmo) {
    this.FWm.put(paramString, Integer.valueOf(paramdmo.Dne()));
    if (!this.Dne.containsKey(Integer.valueOf(paramdmo.Dne())))
      this.Dne.put(Integer.valueOf(paramdmo.Dne()), paramdmo); 
  }
  
  public static zpX Dne() {
    return Dne;
  }
  
  public dmo Dne(String paramString, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    return Dne(paramString, paramInt1, paramInt2, paramInt3, 10496, paramInt4, 9728, 9728, false, (BufferedImage)null);
  }
  
  public void Dne(dmo paramdmo) {
    if (this.Dne.containsValue(paramdmo)) {
      Minecraft.Dne().Dne().FWm("TextureManager.registerTexture called, but this texture has already been registered. ignoring.");
    } else {
      this.Dne.put(Integer.valueOf(paramdmo.Dne()), paramdmo);
    } 
  }
  
  public List Dne(String paramString) {
    ArrayList<dmo> arrayList = new ArrayList();
    Gax gax = (Minecraft.Dne()).Dne.Dne();
    try {
      BufferedImage bufferedImage = ImageIO.read(gax.Dne("/" + paramString));
      int i = bufferedImage.getHeight();
      int j = bufferedImage.getWidth();
      String str = Dne(paramString);
      if (Dne(paramString, gax)) {
        int k = j;
        int m = j;
        int n = i / j;
        for (byte b = 0; b < n; b++) {
          dmo dmo = Dne(str, 2, k, m, 10496, 6408, 9728, 9728, false, bufferedImage.getSubimage(0, m * b, k, m));
          arrayList.add(dmo);
        } 
      } else if (j == i) {
        arrayList.add(Dne(str, 2, j, i, 10496, 6408, 9728, 9728, false, bufferedImage));
      } else {
        Minecraft.Dne().Dne().FWm("TextureManager.createTexture: Skipping " + paramString + " because of broken aspect ratio and not animation");
      } 
      return arrayList;
    } catch (FileNotFoundException fileNotFoundException) {
      Minecraft.Dne().Dne().FWm("TextureManager.createTexture called for file " + paramString + ", but that file does not exist. Ignoring.");
    } catch (IOException iOException) {
      Minecraft.Dne().Dne().FWm("TextureManager.createTexture encountered an IOException when trying to read file " + paramString + ". Ignoring.");
    } 
    return arrayList;
  }
  
  private boolean Dne(String paramString, Gax paramGax) {
    String str = "/" + paramString.substring(0, paramString.lastIndexOf('.')) + ".txt";
    boolean bool = paramGax.Dne("/" + paramString, false);
    return (Minecraft.Dne()).Dne.Dne().Dne(str, !bool);
  }
  
  public static void Dne() {
    Dne = new zpX();
  }
  
  public dmo Dne(String paramString, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, boolean paramBoolean, BufferedImage paramBufferedImage) {
    dmo dmo = new dmo(paramString, paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6, paramInt7, paramBufferedImage);
    Dne(dmo);
    return dmo;
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\zpX.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */