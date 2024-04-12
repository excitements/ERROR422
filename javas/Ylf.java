import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class Ylf extends NER {
  public int Dne;
  
  private static byte[] FWm = new byte[0];
  
  public int FWm;
  
  public byte[] Dne;
  
  public int bzF;
  
  public void Dne(pPV parampPV) {
    parampPV.Dne(this);
  }
  
  public Ylf() {}
  
  public void Dne(DataOutputStream paramDataOutputStream) {
    paramDataOutputStream.writeInt(this.Dne);
    paramDataOutputStream.writeInt(this.FWm);
    paramDataOutputStream.writeShort((short)this.bzF);
    if (this.Dne != null) {
      paramDataOutputStream.writeInt(this.Dne.length);
      paramDataOutputStream.write(this.Dne);
    } else {
      paramDataOutputStream.writeInt(0);
    } 
  }
  
  public Ylf(int paramInt1, int paramInt2, short[] paramArrayOfshort, int paramInt3, Qnq paramQnq) {
    this.Dne = paramInt1;
    this.FWm = paramInt2;
    this.bzF = paramInt3;
    int i = 4 * paramInt3;
    qMV qMV = paramQnq.FWm(paramInt1, paramInt2);
    try {
      if (paramInt3 >= 64) {
        this.Dne.Dne("ChunkTilesUpdatePacket compress " + paramInt3);
        if (FWm.length < i)
          FWm = new byte[i]; 
      } else {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(i);
        DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        for (byte b = 0; b < paramInt3; b++) {
          int j = paramArrayOfshort[b] >> 12 & 0xF;
          int k = paramArrayOfshort[b] >> 8 & 0xF;
          int m = paramArrayOfshort[b] & 0xFF;
          dataOutputStream.writeShort(paramArrayOfshort[b]);
          dataOutputStream.writeShort((short)((qMV.Dne(j, m, k) & 0xFFF) << 4 | qMV.bzF(j, m, k) & 0xF));
        } 
        this.Dne = byteArrayOutputStream.toByteArray();
        if (this.Dne.length != i)
          throw new RuntimeException("Expected length " + i + " doesn't match received length " + this.Dne.length); 
      } 
    } catch (IOException iOException) {
      this.Dne.FWm("Couldn't create chunk packet", iOException);
      this.Dne = null;
    } 
  }
  
  public int Dne() {
    return 10 + this.bzF * 4;
  }
  
  public void Dne(DataInputStream paramDataInputStream) {
    this.Dne = paramDataInputStream.readInt();
    this.FWm = paramDataInputStream.readInt();
    this.bzF = paramDataInputStream.readShort() & 0xFFFF;
    int i = paramDataInputStream.readInt();
    if (i > 0) {
      this.Dne = new byte[i];
      paramDataInputStream.readFully(this.Dne);
    } 
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\Ylf.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */