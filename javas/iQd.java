import java.io.DataInputStream;
import java.io.DataOutputStream;

public class iQd extends NER {
  public String Dne;
  
  public String FWm;
  
  public int Dne;
  
  public iQd() {}
  
  public void Dne(DataInputStream paramDataInputStream) {
    this.Dne = Dne(paramDataInputStream, 16);
    this.FWm = Dne(paramDataInputStream, 32);
    this.Dne = paramDataInputStream.readByte();
  }
  
  public void Dne(DataOutputStream paramDataOutputStream) {
    Dne(this.Dne, paramDataOutputStream);
    Dne(this.FWm, paramDataOutputStream);
    paramDataOutputStream.writeByte(this.Dne);
  }
  
  public iQd(vfE paramvfE, int paramInt) {
    this.Dne = paramvfE.Dne();
    this.FWm = paramvfE.FWm();
    this.Dne = paramInt;
  }
  
  public void Dne(pPV parampPV) {
    parampPV.Dne(this);
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
    //   19: iconst_1
    //   20: iadd
    //   21: ireturn
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\iQd.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */