import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.util.List;

public class Pwq extends NER {
  public NMq[] Dne;
  
  public int Dne;
  
  public void Dne(DataOutputStream paramDataOutputStream) {
    paramDataOutputStream.writeByte(this.Dne);
    paramDataOutputStream.writeShort(this.Dne.length);
    for (byte b = 0; b < this.Dne.length; b++)
      Dne(this.Dne[b], paramDataOutputStream); 
  }
  
  public Pwq() {}
  
  public void Dne(pPV parampPV) {
    parampPV.Dne(this);
  }
  
  public int Dne() {
    return 3 + this.Dne.length * 5;
  }
  
  public Pwq(int paramInt, List<NMq> paramList) {
    this.Dne = paramInt;
    this.Dne = new NMq[paramList.size()];
    for (byte b = 0; b < this.Dne.length; b++) {
      NMq nMq = paramList.get(b);
      this.Dne[b] = (nMq == null) ? null : nMq.Dne();
    } 
  }
  
  public void Dne(DataInputStream paramDataInputStream) {
    this.Dne = paramDataInputStream.readByte();
    short s = paramDataInputStream.readShort();
    this.Dne = new NMq[s];
    for (byte b = 0; b < s; b++)
      this.Dne[b] = Dne(paramDataInputStream); 
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\Pwq.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */