import java.io.DataInputStream;
import java.io.DataOutputStream;

public class FaB extends NER {
  public String Dne;
  
  public byte[] Dne;
  
  public int Dne;
  
  public void Dne(DataOutputStream paramDataOutputStream) {
    Dne(this.Dne, paramDataOutputStream);
    paramDataOutputStream.writeShort((short)this.Dne);
    if (this.Dne != null)
      paramDataOutputStream.write(this.Dne); 
  }
  
  public FaB() {}
  
  public void Dne(pPV parampPV) {
    parampPV.Dne(this);
  }
  
  public int Dne() {
    // Byte code:
    //   0: iconst_2
    //   1: aload_0
    //   2: getfield Dne : Ljava/lang/String;
    //   5: invokevirtual length : ()I
    //   8: iconst_2
    //   9: imul
    //   10: iadd
    //   11: iconst_2
    //   12: iadd
    //   13: aload_0
    //   14: getfield Dne : I
    //   17: iadd
    //   18: ireturn
  }
  
  public FaB(String paramString, byte[] paramArrayOfbyte) {
    this.Dne = paramString;
    this.Dne = paramArrayOfbyte;
    if (paramArrayOfbyte != null) {
      this.Dne = paramArrayOfbyte.length;
      if (this.Dne > 32767)
        throw new IllegalArgumentException("Payload may not be larger than 32k"); 
    } 
  }
  
  public void Dne(DataInputStream paramDataInputStream) {
    this.Dne = Dne(paramDataInputStream, 20);
    this.Dne = paramDataInputStream.readShort();
    if (this.Dne > 0 && this.Dne < 32767) {
      this.Dne = new byte[this.Dne];
      paramDataInputStream.readFully(this.Dne);
    } 
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\FaB.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */