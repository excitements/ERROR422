import java.io.DataInputStream;
import java.io.DataOutputStream;

public class tXK extends NER {
  public int[] Dne;
  
  public tXK() {}
  
  public int Dne() {
    return 1 + this.Dne.length * 4;
  }
  
  public void Dne(pPV parampPV) {
    parampPV.Dne(this);
  }
  
  public void Dne(DataInputStream paramDataInputStream) {
    this.Dne = new int[paramDataInputStream.readByte()];
    for (byte b = 0; b < this.Dne.length; b++)
      this.Dne[b] = paramDataInputStream.readInt(); 
  }
  
  public void Dne(DataOutputStream paramDataOutputStream) {
    paramDataOutputStream.writeByte(this.Dne.length);
    for (byte b = 0; b < this.Dne.length; b++)
      paramDataOutputStream.writeInt(this.Dne[b]); 
  }
  
  public tXK(int... paramVarArgs) {
    this.Dne = paramVarArgs;
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\tXK.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */