import java.io.DataInputStream;
import java.io.DataOutputStream;

public class pDZ extends NER {
  public short Dne;
  
  public int Dne;
  
  public boolean Dne;
  
  public pDZ(int paramInt, short paramShort, boolean paramBoolean) {
    this.Dne = paramInt;
    this.Dne = paramShort;
    this.Dne = paramBoolean;
  }
  
  public void Dne(pPV parampPV) {
    parampPV.Dne(this);
  }
  
  public void Dne(DataOutputStream paramDataOutputStream) {
    paramDataOutputStream.writeByte(this.Dne);
    paramDataOutputStream.writeShort(this.Dne);
    paramDataOutputStream.writeByte(this.Dne ? 1 : 0);
  }
  
  public int Dne() {
    return 4;
  }
  
  public pDZ() {}
  
  public void Dne(DataInputStream paramDataInputStream) {
    this.Dne = paramDataInputStream.readByte();
    this.Dne = paramDataInputStream.readShort();
    this.Dne = (paramDataInputStream.readByte() != 0);
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\pDZ.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */