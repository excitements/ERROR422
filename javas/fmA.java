import java.io.DataInputStream;
import java.io.DataOutputStream;

public class fmA extends NER {
  public int FWm;
  
  public kGO Dne;
  
  public int bzF;
  
  public XHL Dne;
  
  public int Dne;
  
  public int Dne() {
    // Byte code:
    //   0: bipush #8
    //   2: aload_0
    //   3: getfield Dne : LkGO;
    //   6: ifnonnull -> 13
    //   9: iconst_0
    //   10: goto -> 23
    //   13: aload_0
    //   14: getfield Dne : LkGO;
    //   17: invokevirtual Dne : ()Ljava/lang/String;
    //   20: invokevirtual length : ()I
    //   23: iadd
    //   24: ireturn
  }
  
  public fmA(int paramInt1, byte paramByte, kGO paramkGO, int paramInt2, XHL paramXHL) {
    this.Dne = paramInt1;
    this.FWm = paramByte;
    this.bzF = paramInt2;
    this.Dne = paramXHL;
    this.Dne = paramkGO;
  }
  
  public void Dne(DataInputStream paramDataInputStream) {
    this.Dne = paramDataInputStream.readInt();
    this.FWm = paramDataInputStream.readByte();
    this.Dne = XHL.Dne(paramDataInputStream.readByte());
    this.bzF = paramDataInputStream.readShort();
    String str = Dne(paramDataInputStream, 16);
    this.Dne = kGO.Dne(str);
    if (this.Dne == null)
      this.Dne = kGO.Dne; 
  }
  
  public void Dne(pPV parampPV) {
    parampPV.Dne(this);
  }
  
  public void Dne(DataOutputStream paramDataOutputStream) {
    // Byte code:
    //   0: aload_1
    //   1: aload_0
    //   2: getfield Dne : I
    //   5: invokevirtual writeInt : (I)V
    //   8: aload_1
    //   9: aload_0
    //   10: getfield FWm : I
    //   13: invokevirtual writeByte : (I)V
    //   16: aload_1
    //   17: aload_0
    //   18: getfield Dne : LXHL;
    //   21: invokevirtual Dne : ()I
    //   24: invokevirtual writeByte : (I)V
    //   27: aload_1
    //   28: aload_0
    //   29: getfield bzF : I
    //   32: invokevirtual writeShort : (I)V
    //   35: aload_0
    //   36: getfield Dne : LkGO;
    //   39: invokevirtual Dne : ()Ljava/lang/String;
    //   42: aload_1
    //   43: invokestatic Dne : (Ljava/lang/String;Ljava/io/DataOutputStream;)V
    //   46: return
  }
  
  public fmA() {}
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\fmA.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */