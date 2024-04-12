import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Deflater;
import java.util.zip.Inflater;

public class pKI extends NER {
  public int FWm;
  
  private byte[] Dne;
  
  private byte[] FWm;
  
  private static byte[] bzF = new byte[196864];
  
  public int Dne;
  
  private int aFZ;
  
  public int Qnq = 1;
  
  public int bzF;
  
  public boolean Dne;
  
  public static uqn Dne(qMV paramqMV, boolean paramBoolean, int paramInt) {
    int i = 0;
    cHy[] arrayOfCHy = paramqMV.Dne();
    byte b1 = 0;
    uqn uqn = new uqn();
    int j = bzF;
    if (paramBoolean)
      paramqMV.zGp = true; 
    byte b2;
    for (b2 = 0; b2 < arrayOfCHy.length; b2++) {
      if (arrayOfCHy[b2] != null && (!paramBoolean || !arrayOfCHy[b2].Dne()) && (paramInt & 1 << b2) != 0) {
        uqn.Dne |= 1 << b2;
        if (arrayOfCHy[b2].Dne() != null) {
          uqn.FWm |= 1 << b2;
          b1++;
        } 
      } 
    } 
    for (b2 = 0; b2 < arrayOfCHy.length; b2++) {
      if (arrayOfCHy[b2] != null && (!paramBoolean || !arrayOfCHy[b2].Dne()) && (paramInt & 1 << b2) != 0) {
        byte[] arrayOfByte = arrayOfCHy[b2].Dne();
        System.arraycopy(arrayOfByte, 0, j, i, arrayOfByte.length);
        i += arrayOfByte.length;
      } 
    } 
    for (b2 = 0; b2 < arrayOfCHy.length; b2++) {
      if (arrayOfCHy[b2] != null && (!paramBoolean || !arrayOfCHy[b2].Dne()) && (paramInt & 1 << b2) != 0) {
        FYZ fYZ = arrayOfCHy[b2].FWm();
        System.arraycopy(fYZ.Dne, 0, j, i, fYZ.Dne.length);
        i += fYZ.Dne.length;
      } 
    } 
    for (b2 = 0; b2 < arrayOfCHy.length; b2++) {
      if (arrayOfCHy[b2] != null && (!paramBoolean || !arrayOfCHy[b2].Dne()) && (paramInt & 1 << b2) != 0) {
        FYZ fYZ = arrayOfCHy[b2].bzF();
        System.arraycopy(fYZ.Dne, 0, j, i, fYZ.Dne.length);
        i += fYZ.Dne.length;
      } 
    } 
    if (!((Jik)paramqMV.Dne.Dne).FWm)
      for (b2 = 0; b2 < arrayOfCHy.length; b2++) {
        if (arrayOfCHy[b2] != null && (!paramBoolean || !arrayOfCHy[b2].Dne()) && (paramInt & 1 << b2) != 0) {
          FYZ fYZ = arrayOfCHy[b2].Qnq();
          System.arraycopy(fYZ.Dne, 0, j, i, fYZ.Dne.length);
          i += fYZ.Dne.length;
        } 
      }  
    if (b1 > 0)
      for (b2 = 0; b2 < arrayOfCHy.length; b2++) {
        if (arrayOfCHy[b2] != null && (!paramBoolean || !arrayOfCHy[b2].Dne()) && arrayOfCHy[b2].Dne() != null && (paramInt & 1 << b2) != 0) {
          FYZ fYZ = arrayOfCHy[b2].Dne();
          System.arraycopy(fYZ.Dne, 0, j, i, fYZ.Dne.length);
          i += fYZ.Dne.length;
        } 
      }  
    if (paramBoolean) {
      byte[] arrayOfByte = paramqMV.Dne();
      System.arraycopy(arrayOfByte, 0, j, i, arrayOfByte.length);
      i += arrayOfByte.length;
    } 
    uqn.Dne = new byte[i];
    System.arraycopy(j, 0, uqn.Dne, 0, i);
    return uqn;
  }
  
  public void Dne(pPV parampPV) {
    parampPV.Dne(this);
  }
  
  public int Dne() {
    return 17 + this.aFZ;
  }
  
  public void Dne(DataOutputStream paramDataOutputStream) {
    paramDataOutputStream.writeInt(this.Dne);
    paramDataOutputStream.writeInt(this.FWm);
    paramDataOutputStream.writeBoolean(this.Dne);
    paramDataOutputStream.writeShort((short)(this.bzF & 0xFFFF));
    paramDataOutputStream.writeShort((short)(this.Qnq & 0xFFFF));
    paramDataOutputStream.writeInt(this.aFZ);
    paramDataOutputStream.write(this.Dne, 0, this.aFZ);
  }
  
  public pKI() {}
  
  public void Dne(DataInputStream paramDataInputStream) {
    this.Dne = paramDataInputStream.readInt();
    this.FWm = paramDataInputStream.readInt();
    this.Dne = paramDataInputStream.readBoolean();
    this.bzF = paramDataInputStream.readShort();
    this.Qnq = paramDataInputStream.readShort();
    this.aFZ = paramDataInputStream.readInt();
    if (bzF.length < this.aFZ)
      bzF = new byte[this.aFZ]; 
    paramDataInputStream.readFully(bzF, 0, this.aFZ);
    int i = 0;
    int j;
    for (j = 0; j < 16; j++)
      i += this.bzF >> j & 0x1; 
    j = 12288 * i;
    if (this.Dne)
      j += 256; 
    this.FWm = new byte[j];
    Inflater inflater = new Inflater();
    inflater.setInput(bzF, 0, this.aFZ);
    try {
      inflater.inflate(this.FWm);
    } catch (DataFormatException dataFormatException) {
      throw new IOException("Bad compressed data format");
    } finally {
      inflater.end();
    } 
  }
  
  public byte[] Dne() {
    return this.FWm;
  }
  
  public pKI(qMV paramqMV, boolean paramBoolean, int paramInt) {
    this.Dne = paramqMV.Dne;
    this.FWm = paramqMV.FWm;
    this.Dne = paramBoolean;
    uqn uqn = Dne(paramqMV, paramBoolean, paramInt);
    Deflater deflater = new Deflater(-1);
    this.Qnq = uqn.FWm;
    this.bzF = uqn.Dne;
    try {
      this.FWm = uqn.Dne;
      deflater.setInput(uqn.Dne, 0, uqn.Dne.length);
      deflater.finish();
      this.Dne = new byte[uqn.Dne.length];
      this.aFZ = deflater.deflate(this.Dne);
    } finally {
      deflater.end();
    } 
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\pKI.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */