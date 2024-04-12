import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
import java.nio.IntBuffer;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import javax.imageio.ImageIO;
import net.minecraft.client.Minecraft;
import org.lwjgl.opengl.GL11;

public class Snh {
  private IntBuffer Dne;
  
  private final fCQ Dne;
  
  private fZI Dne;
  
  private ZGT Dne;
  
  private ark Dne;
  
  private Map Dne;
  
  private HashMap FWm;
  
  private int Dne;
  
  private BufferedImage Dne;
  
  private final fCQ FWm = (fCQ)new HashMap<>();
  
  private HashMap Dne = new HashMap<>();
  
  public int Dne(String paramString1, String paramString2) {
    Pfo pfo = (Pfo)this.Dne.get(paramString1);
    if (pfo != null && pfo.Dne != null && pfo.Dne == null) {
      if (pfo.FWm < 0) {
        pfo.FWm = Dne(pfo.Dne);
      } else {
        Dne(pfo.Dne, pfo.FWm);
      } 
      pfo.Dne = true;
    } 
    return (pfo != null && pfo.FWm >= 0) ? pfo.FWm : ((paramString2 == null) ? -1 : Dne(paramString2));
  }
  
  public void FWm(String paramString) {
    Pfo pfo = (Pfo)this.Dne.get(paramString);
    if (pfo != null) {
      pfo.Dne--;
      if (pfo.Dne == null) {
        if (pfo.FWm >= 0)
          Dne(pfo.FWm); 
        this.Dne.remove(paramString);
      } 
    } 
  }
  
  public void FWm() {
    this.Dne.FWm();
    this.FWm.FWm();
  }
  
  public Pfo Dne(String paramString, fwN paramfwN) {
    Pfo pfo = (Pfo)this.Dne.get(paramString);
    if (pfo == null) {
      this.Dne.put(paramString, new Pfo(paramString, paramfwN));
    } else {
      pfo.Dne++;
    } 
    return pfo;
  }
  
  private void FWm(int paramInt) {
    if (paramInt != this.Dne) {
      GL11.glBindTexture(3553, paramInt);
      this.Dne = paramInt;
    } 
  }
  
  public void Dne(int paramInt) {
    this.Dne.FWm(paramInt);
    GL11.glDeleteTextures(paramInt);
  }
  
  public void Dne(BufferedImage paramBufferedImage, int paramInt) {
    Dne(paramBufferedImage, paramInt, false, false);
  }
  
  public void Qnq() {
    this.Dne.Dne();
    this.FWm.Dne();
  }
  
  public void Dne() {
    this.Dne = -1;
  }
  
  public Snh(ark paramark, fZI paramfZI) {
    this.Dne = (HashMap)new ZGT();
    this.Dne = (HashMap)pZS.Dne(4194304);
    this.Dne = new HashMap<>();
    this.Dne = (HashMap)new BufferedImage(64, 64, 2);
    this.Dne = (HashMap)paramark;
    this.Dne = (HashMap)paramfZI;
    Graphics graphics = this.Dne.getGraphics();
    graphics.setColor(Color.WHITE);
    graphics.fillRect(0, 0, 64, 64);
    graphics.setColor(Color.BLACK);
    int i = 10;
    byte b = 0;
    while (i < 64) {
      String str = (b++ % 2 == 0) ? "missing" : "texture";
      graphics.drawString(str, 1, i);
      i += graphics.getFont().getSize();
      if (b % 2 == 0)
        i += 5; 
    } 
    graphics.dispose();
    this.Dne = (HashMap)new fCQ(0, "terrain", "textures/blocks/", (BufferedImage)this.Dne);
    this.FWm = new fCQ(1, "items", "textures/items/", (BufferedImage)this.Dne);
  }
  
  private int[] Dne(int[] paramArrayOfint) {
    int[] arrayOfInt = new int[paramArrayOfint.length];
    for (byte b = 0; b < paramArrayOfint.length; b++) {
      int i = paramArrayOfint[b] >> 24 & 0xFF;
      int j = paramArrayOfint[b] >> 16 & 0xFF;
      int k = paramArrayOfint[b] >> 8 & 0xFF;
      int m = paramArrayOfint[b] & 0xFF;
      int n = (j * 30 + k * 59 + m * 11) / 100;
      int i1 = (j * 30 + k * 70) / 100;
      int i2 = (j * 30 + m * 70) / 100;
      arrayOfInt[b] = i << 24 | n << 16 | i1 << 8 | i2;
    } 
    return arrayOfInt;
  }
  
  public gDn Dne(int paramInt) {
    switch (paramInt) {
      case 0:
        return this.Dne.Dne();
    } 
    return this.FWm.Dne();
  }
  
  public void Dne(String paramString) {
    FWm(Dne(paramString));
  }
  
  private int Dne(String paramString) {
    if (paramString.equals("/terrain.png")) {
      this.Dne.Dne().Dne(0);
      return this.Dne.Dne().FWm();
    } 
    if (paramString.equals("/gui/items.png")) {
      this.FWm.Dne().Dne(0);
      return this.FWm.Dne().FWm();
    } 
    Integer integer = (Integer)this.Dne.get(paramString);
    if (integer != null)
      return integer.intValue(); 
    String str = paramString;
    try {
      int i = pZS.Dne();
      boolean bool1 = paramString.startsWith("%blur%");
      if (bool1)
        paramString = paramString.substring(6); 
      boolean bool2 = paramString.startsWith("%clamp%");
      if (bool2)
        paramString = paramString.substring(7); 
      InputStream inputStream = this.Dne.Dne().Dne(paramString);
      if (inputStream == null) {
        Dne((BufferedImage)this.Dne, i, bool1, bool2);
      } else {
        Dne(Dne(inputStream), i, bool1, bool2);
      } 
      this.Dne.put(str, Integer.valueOf(i));
      return i;
    } catch (Exception exception) {
      exception.printStackTrace();
      int i = pZS.Dne();
      Dne((BufferedImage)this.Dne, i);
      this.Dne.put(paramString, Integer.valueOf(i));
      return i;
    } 
  }
  
  private int[] Dne(BufferedImage paramBufferedImage) {
    return Dne(paramBufferedImage, new int[paramBufferedImage.getWidth() * paramBufferedImage.getHeight()]);
  }
  
  private BufferedImage Dne(InputStream paramInputStream) {
    BufferedImage bufferedImage = ImageIO.read(paramInputStream);
    paramInputStream.close();
    return bufferedImage;
  }
  
  public void bzF() {
    Gax gax = this.Dne.Dne();
    Qnq();
    null = this.Dne.Dne().iterator();
    while (null.hasNext()) {
      int i = ((Integer)null.next()).intValue();
      BufferedImage bufferedImage = (BufferedImage)this.Dne.Dne(i);
      Dne(bufferedImage, i);
    } 
    for (Pfo pfo : this.Dne.values())
      pfo.Dne = false; 
    for (String str : this.Dne.keySet()) {
      try {
        int i = ((Integer)this.Dne.get(str)).intValue();
        boolean bool1 = str.startsWith("%blur%");
        if (bool1)
          str = str.substring(6); 
        boolean bool2 = str.startsWith("%clamp%");
        if (bool2)
          str = str.substring(7); 
        BufferedImage bufferedImage = Dne(gax.Dne(str));
        Dne(bufferedImage, i, bool1, bool2);
      } catch (IOException iOException) {
        iOException.printStackTrace();
      } 
    } 
    for (String str : this.FWm.keySet()) {
      try {
        BufferedImage bufferedImage = Dne(gax.Dne(str));
        Dne(bufferedImage, (int[])this.FWm.get(str));
      } catch (IOException iOException) {
        iOException.printStackTrace();
      } 
    } 
    (Minecraft.Dne()).Dne.Dne();
    (Minecraft.Dne()).FWm.Dne();
  }
  
  public void Dne(BufferedImage paramBufferedImage, int paramInt, boolean paramBoolean1, boolean paramBoolean2) {
    FWm(paramInt);
    GL11.glTexParameteri(3553, 10241, 9728);
    GL11.glTexParameteri(3553, 10240, 9728);
    if (paramBoolean1) {
      GL11.glTexParameteri(3553, 10241, 9729);
      GL11.glTexParameteri(3553, 10240, 9729);
    } 
    if (paramBoolean2) {
      GL11.glTexParameteri(3553, 10242, 10496);
      GL11.glTexParameteri(3553, 10243, 10496);
    } else {
      GL11.glTexParameteri(3553, 10242, 10497);
      GL11.glTexParameteri(3553, 10243, 10497);
    } 
    int i = paramBufferedImage.getWidth();
    int j = paramBufferedImage.getHeight();
    int[] arrayOfInt = new int[i * j];
    paramBufferedImage.getRGB(0, 0, i, j, arrayOfInt, 0, i);
    if (this.Dne != null && ((fZI)this.Dne).bzF != null)
      arrayOfInt = Dne(arrayOfInt); 
    this.Dne.clear();
    this.Dne.put(arrayOfInt);
    this.Dne.position(0).limit(arrayOfInt.length);
    GL11.glTexImage2D(3553, 0, 6408, i, j, 0, 32993, 33639, (IntBuffer)this.Dne);
  }
  
  public void Dne(int[] paramArrayOfint, int paramInt1, int paramInt2, int paramInt3) {
    FWm(paramInt3);
    GL11.glTexParameteri(3553, 10241, 9728);
    GL11.glTexParameteri(3553, 10240, 9728);
    GL11.glTexParameteri(3553, 10242, 10497);
    GL11.glTexParameteri(3553, 10243, 10497);
    if (this.Dne != null && ((fZI)this.Dne).bzF != null)
      paramArrayOfint = Dne(paramArrayOfint); 
    if (QXI.Dne != null)
      for (byte b = 0; b < paramArrayOfint.length; b++)
        paramArrayOfint[b] = paramArrayOfint[b] + eCD.Dne(999900000);  
    this.Dne.clear();
    this.Dne.put(paramArrayOfint);
    this.Dne.position(0).limit(paramArrayOfint.length);
    GL11.glTexSubImage2D(3553, 0, 0, 0, paramInt1, paramInt2, 32993, 33639, (IntBuffer)this.Dne);
  }
  
  public int Dne(BufferedImage paramBufferedImage) {
    int i = pZS.Dne();
    Dne(paramBufferedImage, i);
    this.Dne.Dne(i, paramBufferedImage);
    return i;
  }
  
  public boolean Dne(String paramString) {
    return this.Dne.containsKey(paramString);
  }
  
  private int[] Dne(BufferedImage paramBufferedImage, int[] paramArrayOfint) {
    int i = paramBufferedImage.getWidth();
    int j = paramBufferedImage.getHeight();
    paramBufferedImage.getRGB(0, 0, i, j, paramArrayOfint, 0, i);
    return paramArrayOfint;
  }
  
  public int[] Dne(String paramString) {
    Gax gax = this.Dne.Dne();
    int[] arrayOfInt = (int[])this.FWm.get(paramString);
    if (arrayOfInt != null)
      return arrayOfInt; 
    try {
      int[] arrayOfInt1;
      InputStream inputStream = gax.Dne(paramString);
      if (inputStream == null) {
        arrayOfInt1 = Dne((BufferedImage)this.Dne);
      } else {
        arrayOfInt1 = Dne(Dne(inputStream));
      } 
      this.FWm.put(paramString, arrayOfInt1);
      return arrayOfInt1;
    } catch (IOException iOException) {
      iOException.printStackTrace();
      int[] arrayOfInt1 = Dne((BufferedImage)this.Dne);
      this.FWm.put(paramString, arrayOfInt1);
      return arrayOfInt1;
    } 
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\Snh.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */