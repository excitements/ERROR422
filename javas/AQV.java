import java.io.DataInputStream;
import java.io.DataOutputStream;

public class AQV extends NER {
  private int Qnq;
  
  private int bzF;
  
  private int Dne;
  
  private float Dne;
  
  private String Dne;
  
  private int FWm = Integer.MAX_VALUE;
  
  public void Dne(pPV parampPV) {
    parampPV.Dne(this);
  }
  
  public void Dne(DataInputStream paramDataInputStream) {
    this.Dne = Dne(paramDataInputStream, 32);
    this.Dne = paramDataInputStream.readInt();
    this.FWm = paramDataInputStream.readInt();
    this.bzF = paramDataInputStream.readInt();
    this.Dne = paramDataInputStream.readFloat();
    this.Qnq = paramDataInputStream.readUnsignedByte();
  }
  
  public double FWm() {
    return (this.FWm / 8.0F);
  }
  
  public float FWm() {
    return this.Qnq / 63.0F;
  }
  
  public AQV(String paramString, double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat1, float paramFloat2) {
    this.Dne = paramString;
    this.Dne = (int)(paramDouble1 * 8.0D);
    this.FWm = (int)(paramDouble2 * 8.0D);
    this.bzF = (int)(paramDouble3 * 8.0D);
    this.Dne = paramFloat1;
    this.Qnq = (int)(paramFloat2 * 63.0F);
    if (this.Qnq < 0)
      this.Qnq = 0; 
    if (this.Qnq > 255)
      this.Qnq = 255; 
  }
  
  public double bzF() {
    return (this.bzF / 8.0F);
  }
  
  public AQV() {}
  
  public void Dne(DataOutputStream paramDataOutputStream) {
    Dne(this.Dne, paramDataOutputStream);
    paramDataOutputStream.writeInt(this.Dne);
    paramDataOutputStream.writeInt(this.FWm);
    paramDataOutputStream.writeInt(this.bzF);
    paramDataOutputStream.writeFloat(this.Dne);
    paramDataOutputStream.writeByte(this.Qnq);
  }
  
  public int Dne() {
    return 24;
  }
  
  public double Dne() {
    return (this.Dne / 8.0F);
  }
  
  public float Dne() {
    return this.Dne;
  }
  
  public String Dne() {
    return this.Dne;
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\AQV.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */