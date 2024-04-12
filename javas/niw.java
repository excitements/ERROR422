import java.io.DataInputStream;
import java.io.DataOutputStream;

public class niw extends NER {
  public int Dne;
  
  public String FWm;
  
  public String Dne = "";
  
  public int FWm = "";
  
  public niw(OHz paramOHz, int paramInt) {
    this.Dne = Character.MIN_VALUE;
    this.FWm = 0;
    this.Dne = paramOHz.Dne();
    this.FWm = paramOHz.Dne().Dne();
    this.Dne = paramOHz.Dne();
    this.FWm = paramInt;
  }
  
  public int Dne() {
    // Byte code:
    //   0: iconst_2
    //   1: aload_0
    //   2: getfield Dne : Ljava/lang/String;
    //   5: invokevirtual length : ()I
    //   8: iadd
    //   9: iconst_2
    //   10: iadd
    //   11: aload_0
    //   12: getfield FWm : Ljava/lang/String;
    //   15: invokevirtual length : ()I
    //   18: iadd
    //   19: iconst_4
    //   20: iadd
    //   21: iconst_1
    //   22: iadd
    //   23: ireturn
  }
  
  public niw(String paramString) {
    this.Dne = Character.MIN_VALUE;
    this.FWm = 0;
    this.Dne = paramString;
    this.FWm = "";
    this.Dne = Character.MIN_VALUE;
    this.FWm = 1;
  }
  
  public void Dne(pPV parampPV) {
    parampPV.Dne(this);
  }
  
  public void Dne(DataInputStream paramDataInputStream) {
    this.Dne = Dne(paramDataInputStream, 16);
    this.FWm = paramDataInputStream.readByte();
    if (this.FWm != 1) {
      this.FWm = Dne(paramDataInputStream, 16);
      this.Dne = paramDataInputStream.readInt();
    } 
  }
  
  public void Dne(DataOutputStream paramDataOutputStream) {
    Dne(this.Dne, paramDataOutputStream);
    paramDataOutputStream.writeByte(this.FWm);
    if (this.FWm != 1) {
      Dne(this.FWm, paramDataOutputStream);
      paramDataOutputStream.writeInt(this.Dne);
    } 
  }
  
  public niw() {
    this.Dne = Character.MIN_VALUE;
    this.FWm = 0;
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\niw.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */