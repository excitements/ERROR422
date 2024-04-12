import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import javax.imageio.ImageIO;
import net.minecraft.client.Minecraft;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL12;

public class dmo {
  private final int DyG;
  
  private boolean FWm;
  
  private final int IjH;
  
  private ByteBuffer Dne;
  
  private boolean Qnq;
  
  private boolean bzF;
  
  private final int mrb;
  
  private final boolean Dne;
  
  private final int div;
  
  private final int XHL;
  
  private final String Dne;
  
  private int FWm;
  
  private final int Qnq;
  
  private final int aFZ;
  
  private int bzF;
  
  private final int zGp;
  
  private int Dne;
  
  private fBi Dne;
  
  public void Dne(int paramInt1, int paramInt2, dmo paramdmo) {
    GL11.glBindTexture(this.div, this.Dne);
    GL11.glTexSubImage2D(this.div, 0, paramInt1, paramInt2, paramdmo.bzF(), paramdmo.Qnq(), this.DyG, 5121, (ByteBuffer)paramdmo.Dne().position(0));
    this.Qnq = 1;
  }
  
  public void Dne(fBi paramfBi, int paramInt) {
    if (this.div != 32879) {
      fBi fBi1 = new fBi(0, 0, this.Qnq, this.aFZ);
      fBi1.Dne(paramfBi);
      this.Dne.position(0);
      for (int i = fBi1.FWm(); i < fBi1.FWm() + fBi1.Qnq(); i++) {
        int j = i * this.Qnq * 4;
        for (int k = fBi1.Dne(); k < fBi1.Dne() + fBi1.bzF(); k++) {
          this.Dne.put(j + k * 4 + 0, (byte)(paramInt >> 24 & 0xFF));
          this.Dne.put(j + k * 4 + 1, (byte)(paramInt >> 16 & 0xFF));
          this.Dne.put(j + k * 4 + 2, (byte)(paramInt >> 8 & 0xFF));
          this.Dne.put(j + k * 4 + 3, (byte)(paramInt >> 0 & 0xFF));
        } 
      } 
      if (this.bzF != 0) {
        Dne();
      } else {
        this.Qnq = 0;
      } 
    } 
  }
  
  public int bzF() {
    return this.Qnq;
  }
  
  public int Qnq() {
    return this.aFZ;
  }
  
  public void Dne(BufferedImage paramBufferedImage) {
    if (this.div != 32879) {
      int i = paramBufferedImage.getWidth();
      int j = paramBufferedImage.getHeight();
      if (i <= this.Qnq && j <= this.aFZ) {
        int[] arrayOfInt1 = { 3, 0, 1, 2 };
        int[] arrayOfInt2 = { 3, 2, 1, 0 };
        int[] arrayOfInt3 = (this.DyG == 32993) ? arrayOfInt2 : arrayOfInt1;
        int[] arrayOfInt4 = new int[this.Qnq * this.aFZ];
        int k = paramBufferedImage.getTransparency();
        paramBufferedImage.getRGB(0, 0, this.Qnq, this.aFZ, arrayOfInt4, 0, i);
        byte[] arrayOfByte = new byte[this.Qnq * this.aFZ * 4];
        for (byte b = 0; b < this.aFZ; b++) {
          for (byte b1 = 0; b1 < this.Qnq; b1++) {
            int m = b * this.Qnq + b1;
            int n = m * 4;
            arrayOfByte[n + arrayOfInt3[0]] = (byte)(arrayOfInt4[m] >> 24 & 0xFF);
            arrayOfByte[n + arrayOfInt3[1]] = (byte)(arrayOfInt4[m] >> 16 & 0xFF);
            arrayOfByte[n + arrayOfInt3[2]] = (byte)(arrayOfInt4[m] >> 8 & 0xFF);
            arrayOfByte[n + arrayOfInt3[3]] = (byte)(arrayOfInt4[m] >> 0 & 0xFF);
          } 
        } 
        this.Dne = (fBi)ByteBuffer.allocateDirect(arrayOfByte.length);
        this.Dne.clear();
        this.Dne.put(arrayOfByte);
        this.Dne.limit(arrayOfByte.length);
        if (this.bzF != 0) {
          Dne();
        } else {
          this.Qnq = 0;
        } 
      } else {
        Minecraft.Dne().Dne().FWm("transferFromImage called with a BufferedImage with dimensions (" + i + ", " + j + ") larger than the Texture dimensions (" + this.Qnq + ", " + this.aFZ + "). Ignoring.");
      } 
    } 
  }
  
  public final fBi Dne() {
    return this.Dne;
  }
  
  private dmo(String paramString, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8) {
    this.Dne = (fBi)paramString;
    this.bzF = paramInt1;
    this.Qnq = paramInt2;
    this.aFZ = paramInt3;
    this.zGp = paramInt4;
    this.DyG = paramInt6;
    this.IjH = paramInt7;
    this.mrb = paramInt8;
    this.XHL = paramInt5;
    this.Dne = new fBi(0, 0, paramInt2, paramInt3);
    if (paramInt3 == 1 && paramInt4 == 1) {
      this.div = 3552;
    } else if (paramInt4 == 1) {
      this.div = 3553;
    } else {
      this.div = 32879;
    } 
    this.Dne = ((paramInt7 != 9728 && paramInt7 != 9729) || (paramInt8 != 9728 && paramInt8 != 9729)) ? 1 : 0;
    if (paramInt1 != 2) {
      this.Dne = GL11.glGenTextures();
      GL11.glBindTexture(this.div, this.Dne);
      GL11.glTexParameteri(this.div, 10241, paramInt7);
      GL11.glTexParameteri(this.div, 10240, paramInt8);
      GL11.glTexParameteri(this.div, 10242, paramInt5);
      GL11.glTexParameteri(this.div, 10243, paramInt5);
    } else {
      this.Dne = -1;
    } 
    this.FWm = zpX.Dne().Dne();
  }
  
  public String Dne() {
    return (String)this.Dne;
  }
  
  public int FWm() {
    return this.Dne;
  }
  
  public void Dne(int paramInt1, int paramInt2, dmo paramdmo, boolean paramBoolean) {
    if (this.div != 32879) {
      ByteBuffer byteBuffer = paramdmo.Dne();
      this.Dne.position(0);
      byteBuffer.position(0);
      for (byte b = 0; b < paramdmo.Qnq(); b++) {
        int i = paramInt2 + b;
        int j = b * paramdmo.bzF() * 4;
        int k = i * this.Qnq * 4;
        if (paramBoolean)
          i = paramInt2 + paramdmo.Qnq() - b; 
        for (byte b1 = 0; b1 < paramdmo.bzF(); b1++) {
          int m = k + (b1 + paramInt1) * 4;
          int n = j + b1 * 4;
          if (paramBoolean)
            m = paramInt1 + b1 * this.Qnq * 4 + i * 4; 
          this.Dne.put(m + 0, byteBuffer.get(n + 0));
          this.Dne.put(m + 1, byteBuffer.get(n + 1));
          this.Dne.put(m + 2, byteBuffer.get(n + 2));
          this.Dne.put(m + 3, byteBuffer.get(n + 3));
        } 
      } 
      this.Dne.position(this.Qnq * this.aFZ * 4);
      if (this.bzF != 0) {
        Dne();
      } else {
        this.Qnq = 0;
      } 
    } 
  }
  
  public int Dne() {
    return this.FWm;
  }
  
  public void Dne(int paramInt) {
    if (this.zGp == 1) {
      GL11.glEnable(3553);
    } else {
      GL11.glEnable(32879);
    } 
    oCF.Dne(oCF.Dne + paramInt);
    GL11.glBindTexture(this.div, this.Dne);
    if (this.Qnq == 0)
      Dne(); 
  }
  
  public dmo(String paramString, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, BufferedImage paramBufferedImage) {
    this(paramString, paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6, paramInt7, paramInt8);
    if (paramBufferedImage == null) {
      if (paramInt2 != -1 && paramInt3 != -1) {
        byte[] arrayOfByte = new byte[paramInt2 * paramInt3 * paramInt4 * 4];
        for (byte b = 0; b < arrayOfByte.length; b++)
          arrayOfByte[b] = 0; 
        this.Dne = (fBi)ByteBuffer.allocateDirect(arrayOfByte.length);
        this.Dne.clear();
        this.Dne.put(arrayOfByte);
        this.Dne.position(0).limit(arrayOfByte.length);
        if (this.bzF != 0) {
          Dne();
        } else {
          this.Qnq = 0;
        } 
      } else {
        this.FWm = 0;
      } 
    } else {
      this.FWm = 1;
      Dne(paramBufferedImage);
      if (paramInt1 != 2) {
        Dne();
        this.bzF = 0;
      } 
    } 
  }
  
  public dmo(String paramString, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, BufferedImage paramBufferedImage) {
    this(paramString, paramInt1, paramInt2, paramInt3, 1, paramInt4, paramInt5, paramInt6, paramInt7, paramBufferedImage);
  }
  
  public void Dne() {
    this.Dne.flip();
    if (this.aFZ != 1 && this.zGp != 1) {
      GL12.glTexImage3D(this.div, 0, this.DyG, this.Qnq, this.aFZ, this.zGp, 0, this.DyG, 5121, (ByteBuffer)this.Dne);
    } else if (this.aFZ != 1) {
      GL11.glTexImage2D(this.div, 0, this.DyG, this.Qnq, this.aFZ, 0, this.DyG, 5121, (ByteBuffer)this.Dne);
    } else {
      GL11.glTexImage1D(this.div, 0, this.DyG, this.Qnq, 0, this.DyG, 5121, (ByteBuffer)this.Dne);
    } 
    this.Qnq = 1;
  }
  
  public void Dne(String paramString) {
    BufferedImage bufferedImage = new BufferedImage(this.Qnq, this.aFZ, 2);
    ByteBuffer byteBuffer = Dne();
    byte[] arrayOfByte = new byte[this.Qnq * this.aFZ * 4];
    byteBuffer.position(0);
    byteBuffer.get(arrayOfByte);
    for (byte b = 0; b < this.Qnq; b++) {
      for (byte b1 = 0; b1 < this.aFZ; b1++) {
        int i = b1 * this.Qnq * 4 + b * 4;
        boolean bool = false;
        int j = bool | (arrayOfByte[i + 2] & 0xFF) << 0;
        j |= (arrayOfByte[i + 1] & 0xFF) << 8;
        j |= (arrayOfByte[i + 0] & 0xFF) << 16;
        j |= (arrayOfByte[i + 3] & 0xFF) << 24;
        bufferedImage.setRGB(b, b1, j);
      } 
    } 
    this.Dne.position(this.Qnq * this.aFZ * 4);
    try {
      ImageIO.write(bufferedImage, "png", new File(Minecraft.Dne(), paramString));
    } catch (IOException iOException) {
      iOException.printStackTrace();
    } 
  }
  
  public ByteBuffer Dne() {
    return (ByteBuffer)this.Dne;
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\dmo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */