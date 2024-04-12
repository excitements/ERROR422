import java.io.DataInputStream;
import java.io.DataOutputStream;

public class XGq extends NER {
  public int FWm;
  
  public String Dne;
  
  public int bzF;
  
  public int Dne;
  
  public boolean Dne;
  
  public void Dne(pPV parampPV) {
    parampPV.Dne(this);
  }
  
  public XGq() {}
  
  public XGq(int paramInt1, int paramInt2, String paramString, int paramInt3, boolean paramBoolean) {
    this.Dne = paramInt1;
    this.FWm = paramInt2;
    this.Dne = paramString;
    this.bzF = paramInt3;
    this.Dne = paramBoolean;
  }
  
  public void Dne(DataInputStream paramDataInputStream) {
    this.Dne = paramDataInputStream.readByte() & 0xFF;
    this.FWm = paramDataInputStream.readByte() & 0xFF;
    this.Dne = Dne(paramDataInputStream, 32);
    this.bzF = paramDataInputStream.readByte() & 0xFF;
    this.Dne = paramDataInputStream.readBoolean();
  }
  
  public void Dne(DataOutputStream paramDataOutputStream) {
    paramDataOutputStream.writeByte(this.Dne & 0xFF);
    paramDataOutputStream.writeByte(this.FWm & 0xFF);
    Dne(this.Dne, paramDataOutputStream);
    paramDataOutputStream.writeByte(this.bzF & 0xFF);
    paramDataOutputStream.writeBoolean(this.Dne);
  }
  
  public int Dne() {
    // Byte code:
    //   0: iconst_4
    //   1: aload_0
    //   2: getfield Dne : Ljava/lang/String;
    //   5: invokevirtual length : ()I
    //   8: iadd
    //   9: ireturn
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\XGq.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */