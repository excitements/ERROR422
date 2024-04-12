import java.io.DataInputStream;
import java.io.DataOutputStream;

public class VPw extends NER {
  public int Dne;
  
  public byte FWm;
  
  public kGO Dne;
  
  public XHL Dne;
  
  public byte Dne;
  
  public int FWm;
  
  public boolean Dne = false;
  
  public byte bzF;
  
  public VPw() {}
  
  public int Dne() {
    // Byte code:
    //   0: iconst_0
    //   1: istore_1
    //   2: aload_0
    //   3: getfield Dne : LkGO;
    //   6: ifnull -> 20
    //   9: aload_0
    //   10: getfield Dne : LkGO;
    //   13: invokevirtual Dne : ()Ljava/lang/String;
    //   16: invokevirtual length : ()I
    //   19: istore_1
    //   20: bipush #6
    //   22: iconst_2
    //   23: iload_1
    //   24: imul
    //   25: iadd
    //   26: iconst_4
    //   27: iadd
    //   28: iconst_4
    //   29: iadd
    //   30: iconst_1
    //   31: iadd
    //   32: iconst_1
    //   33: iadd
    //   34: iconst_1
    //   35: iadd
    //   36: ireturn
  }
  
  public void Dne(DataInputStream paramDataInputStream) {
    this.Dne = paramDataInputStream.readInt();
    String str = Dne(paramDataInputStream, 16);
    this.Dne = kGO.Dne(str);
    if (this.Dne == null)
      this.Dne = kGO.Dne; 
    byte b = paramDataInputStream.readByte();
    this.Dne = ((b & 0x8) == 8);
    int i = b & 0xFFFFFFF7;
    this.Dne = XHL.Dne(i);
    this.FWm = paramDataInputStream.readByte();
    this.Dne = paramDataInputStream.readByte();
    this.FWm = paramDataInputStream.readByte();
    this.bzF = paramDataInputStream.readByte();
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
    //   8: aload_0
    //   9: getfield Dne : LkGO;
    //   12: ifnonnull -> 20
    //   15: ldc ''
    //   17: goto -> 27
    //   20: aload_0
    //   21: getfield Dne : LkGO;
    //   24: invokevirtual Dne : ()Ljava/lang/String;
    //   27: aload_1
    //   28: invokestatic Dne : (Ljava/lang/String;Ljava/io/DataOutputStream;)V
    //   31: aload_0
    //   32: getfield Dne : LXHL;
    //   35: invokevirtual Dne : ()I
    //   38: istore_2
    //   39: aload_0
    //   40: getfield Dne : Z
    //   43: ifeq -> 51
    //   46: iload_2
    //   47: bipush #8
    //   49: ior
    //   50: istore_2
    //   51: aload_1
    //   52: iload_2
    //   53: invokevirtual writeByte : (I)V
    //   56: aload_1
    //   57: aload_0
    //   58: getfield FWm : I
    //   61: invokevirtual writeByte : (I)V
    //   64: aload_1
    //   65: aload_0
    //   66: getfield Dne : B
    //   69: invokevirtual writeByte : (I)V
    //   72: aload_1
    //   73: aload_0
    //   74: getfield FWm : B
    //   77: invokevirtual writeByte : (I)V
    //   80: aload_1
    //   81: aload_0
    //   82: getfield bzF : B
    //   85: invokevirtual writeByte : (I)V
    //   88: return
  }
  
  public VPw(int paramInt1, kGO paramkGO, XHL paramXHL, boolean paramBoolean, int paramInt2, int paramInt3, int paramInt4, int paramInt5) {
    this.Dne = paramInt1;
    this.Dne = paramkGO;
    this.FWm = paramInt2;
    this.Dne = (byte)paramInt3;
    this.Dne = paramXHL;
    this.FWm = (byte)paramInt4;
    this.bzF = (byte)paramInt5;
    this.Dne = paramBoolean;
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\VPw.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */