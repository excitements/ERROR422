import java.io.DataInputStream;
import java.io.DataOutputStream;

public class ike extends NER {
  private String Dne;
  
  private int FWm;
  
  private int Dne;
  
  private String FWm;
  
  public int FWm() {
    return this.Dne;
  }
  
  public ike(int paramInt1, String paramString1, String paramString2, int paramInt2) {
    this.Dne = paramInt1;
    this.Dne = paramString1;
    this.FWm = paramString2;
    this.FWm = paramInt2;
  }
  
  public void Dne(DataInputStream paramDataInputStream) {
    this.Dne = paramDataInputStream.readByte();
    this.Dne = Dne(paramDataInputStream, 16);
    this.FWm = Dne(paramDataInputStream, 255);
    this.FWm = paramDataInputStream.readInt();
  }
  
  public void Dne(DataOutputStream paramDataOutputStream) {
    paramDataOutputStream.writeByte(this.Dne);
    Dne(this.Dne, paramDataOutputStream);
    Dne(this.FWm, paramDataOutputStream);
    paramDataOutputStream.writeInt(this.FWm);
  }
  
  public String Dne() {
    return this.Dne;
  }
  
  public int Dne() {
    // Byte code:
    //   0: iconst_3
    //   1: iconst_2
    //   2: aload_0
    //   3: getfield Dne : Ljava/lang/String;
    //   6: invokevirtual length : ()I
    //   9: imul
    //   10: iadd
    //   11: ireturn
  }
  
  public void Dne(pPV parampPV) {
    parampPV.Dne(this);
  }
  
  public ike() {}
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\ike.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */