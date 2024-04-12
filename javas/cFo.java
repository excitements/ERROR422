import java.net.DatagramPacket;
import java.util.Date;
import java.util.Random;

class cFo {
  private int Dne;
  
  private byte[] FWm;
  
  private String Dne;
  
  final wGj Dne;
  
  private byte[] Dne;
  
  private long Dne;
  
  public cFo(wGj paramwGj, DatagramPacket paramDatagramPacket) {
    this.Dne = paramwGj;
    this.Dne = (new Date()).getTime();
    byte[] arrayOfByte = paramDatagramPacket.getData();
    this.Dne = new byte[4];
    this.Dne[0] = arrayOfByte[3];
    this.Dne[1] = arrayOfByte[4];
    this.Dne[2] = arrayOfByte[5];
    this.Dne[3] = arrayOfByte[6];
    this.Dne = new String(this.Dne);
    this.Dne = (new Random()).nextInt(16777216);
    this.FWm = String.format("\t%s%d\000", new Object[] { this.Dne, Integer.valueOf(this.Dne) }).getBytes();
  }
  
  public byte[] FWm() {
    return this.Dne;
  }
  
  public byte[] Dne() {
    return this.FWm;
  }
  
  public Boolean Dne(long paramLong) {
    return Boolean.valueOf((this.Dne < paramLong));
  }
  
  public int Dne() {
    return this.Dne;
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\cFo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */