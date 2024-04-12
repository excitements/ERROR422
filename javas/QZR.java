import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.util.List;

public class QZR extends NER {
  public byte FWm;
  
  public int zGp;
  
  public int Dne;
  
  private List Dne;
  
  public byte Dne;
  
  public int FWm;
  
  public int div;
  
  public int DyG;
  
  public byte bzF;
  
  private luM Dne;
  
  public int Qnq;
  
  public int bzF;
  
  public int aFZ;
  
  public int Dne() {
    return 26;
  }
  
  public List Dne() {
    if (this.Dne == null)
      this.Dne = (luM)this.Dne.FWm(); 
    return (List)this.Dne;
  }
  
  public void Dne(pPV parampPV) {
    parampPV.Dne(this);
  }
  
  public void Dne(DataInputStream paramDataInputStream) {
    this.Dne = paramDataInputStream.readInt();
    this.FWm = paramDataInputStream.readByte() & 0xFF;
    this.bzF = paramDataInputStream.readInt();
    this.Qnq = paramDataInputStream.readInt();
    this.aFZ = paramDataInputStream.readInt();
    this.Dne = paramDataInputStream.readByte();
    this.FWm = paramDataInputStream.readByte();
    this.bzF = paramDataInputStream.readByte();
    this.zGp = paramDataInputStream.readShort();
    this.DyG = paramDataInputStream.readShort();
    this.div = paramDataInputStream.readShort();
    this.Dne = (luM)luM.Dne(paramDataInputStream);
  }
  
  public QZR() {}
  
  public void Dne(DataOutputStream paramDataOutputStream) {
    paramDataOutputStream.writeInt(this.Dne);
    paramDataOutputStream.writeByte(this.FWm & 0xFF);
    paramDataOutputStream.writeInt(this.bzF);
    paramDataOutputStream.writeInt(this.Qnq);
    paramDataOutputStream.writeInt(this.aFZ);
    paramDataOutputStream.writeByte(this.Dne);
    paramDataOutputStream.writeByte(this.FWm);
    paramDataOutputStream.writeByte(this.bzF);
    paramDataOutputStream.writeShort(this.zGp);
    paramDataOutputStream.writeShort(this.DyG);
    paramDataOutputStream.writeShort(this.div);
    this.Dne.Dne(paramDataOutputStream);
  }
  
  public QZR(FUH paramFUH) {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial <init> : ()V
    //   4: aload_0
    //   5: aload_1
    //   6: getfield aFZ : I
    //   9: putfield Dne : I
    //   12: aload_0
    //   13: aload_1
    //   14: invokestatic Dne : (LsMa;)I
    //   17: i2b
    //   18: putfield FWm : I
    //   21: aload_0
    //   22: aload_1
    //   23: getfield Dne : LbfY;
    //   26: aload_1
    //   27: getfield div : D
    //   30: invokevirtual Dne : (D)I
    //   33: putfield bzF : I
    //   36: aload_0
    //   37: aload_1
    //   38: getfield IjH : D
    //   41: ldc2_w 32.0
    //   44: dmul
    //   45: invokestatic FWm : (D)I
    //   48: putfield Qnq : I
    //   51: aload_0
    //   52: aload_1
    //   53: getfield Dne : LbfY;
    //   56: aload_1
    //   57: getfield mrb : D
    //   60: invokevirtual Dne : (D)I
    //   63: putfield aFZ : I
    //   66: aload_0
    //   67: aload_1
    //   68: getfield mrb : F
    //   71: ldc 256.0
    //   73: fmul
    //   74: ldc 360.0
    //   76: fdiv
    //   77: f2i
    //   78: i2b
    //   79: putfield Dne : B
    //   82: aload_0
    //   83: aload_1
    //   84: getfield XHL : F
    //   87: ldc 256.0
    //   89: fmul
    //   90: ldc 360.0
    //   92: fdiv
    //   93: f2i
    //   94: i2b
    //   95: putfield FWm : B
    //   98: aload_0
    //   99: aload_1
    //   100: getfield vSL : F
    //   103: ldc 256.0
    //   105: fmul
    //   106: ldc 360.0
    //   108: fdiv
    //   109: f2i
    //   110: i2b
    //   111: putfield bzF : B
    //   114: ldc2_w 3.9
    //   117: dstore_2
    //   118: aload_1
    //   119: getfield XHL : D
    //   122: dstore #4
    //   124: aload_1
    //   125: getfield Zpi : D
    //   128: dstore #6
    //   130: aload_1
    //   131: getfield kGO : D
    //   134: dstore #8
    //   136: dload #4
    //   138: dload_2
    //   139: dneg
    //   140: dcmpg
    //   141: ifge -> 148
    //   144: dload_2
    //   145: dneg
    //   146: dstore #4
    //   148: dload #6
    //   150: dload_2
    //   151: dneg
    //   152: dcmpg
    //   153: ifge -> 160
    //   156: dload_2
    //   157: dneg
    //   158: dstore #6
    //   160: dload #8
    //   162: dload_2
    //   163: dneg
    //   164: dcmpg
    //   165: ifge -> 172
    //   168: dload_2
    //   169: dneg
    //   170: dstore #8
    //   172: dload #4
    //   174: dload_2
    //   175: dcmpl
    //   176: ifle -> 182
    //   179: dload_2
    //   180: dstore #4
    //   182: dload #6
    //   184: dload_2
    //   185: dcmpl
    //   186: ifle -> 192
    //   189: dload_2
    //   190: dstore #6
    //   192: dload #8
    //   194: dload_2
    //   195: dcmpl
    //   196: ifle -> 202
    //   199: dload_2
    //   200: dstore #8
    //   202: aload_0
    //   203: dload #4
    //   205: ldc2_w 8000.0
    //   208: dmul
    //   209: d2i
    //   210: putfield zGp : I
    //   213: aload_0
    //   214: dload #6
    //   216: ldc2_w 8000.0
    //   219: dmul
    //   220: d2i
    //   221: putfield DyG : I
    //   224: aload_0
    //   225: dload #8
    //   227: ldc2_w 8000.0
    //   230: dmul
    //   231: d2i
    //   232: putfield div : I
    //   235: aload_0
    //   236: aload_1
    //   237: invokevirtual Dne : ()LluM;
    //   240: putfield Dne : LluM;
    //   243: return
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\QZR.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */