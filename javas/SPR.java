import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.util.ArrayList;
import java.util.Collection;

public class SPR extends NER {
  public String bzF = "";
  
  public int FWm;
  
  public String Qnq = "";
  
  public String Dne;
  
  public Collection Dne;
  
  public int Dne = "";
  
  public String FWm = "";
  
  public void Dne(DataInputStream paramDataInputStream) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: bipush #16
    //   4: invokestatic Dne : (Ljava/io/DataInputStream;I)Ljava/lang/String;
    //   7: putfield Dne : Ljava/lang/String;
    //   10: aload_0
    //   11: aload_1
    //   12: invokevirtual readByte : ()B
    //   15: putfield Dne : I
    //   18: aload_0
    //   19: getfield Dne : I
    //   22: ifeq -> 33
    //   25: aload_0
    //   26: getfield Dne : I
    //   29: iconst_2
    //   30: if_icmpne -> 71
    //   33: aload_0
    //   34: aload_1
    //   35: bipush #32
    //   37: invokestatic Dne : (Ljava/io/DataInputStream;I)Ljava/lang/String;
    //   40: putfield FWm : Ljava/lang/String;
    //   43: aload_0
    //   44: aload_1
    //   45: bipush #16
    //   47: invokestatic Dne : (Ljava/io/DataInputStream;I)Ljava/lang/String;
    //   50: putfield bzF : Ljava/lang/String;
    //   53: aload_0
    //   54: aload_1
    //   55: bipush #16
    //   57: invokestatic Dne : (Ljava/io/DataInputStream;I)Ljava/lang/String;
    //   60: putfield Qnq : Ljava/lang/String;
    //   63: aload_0
    //   64: aload_1
    //   65: invokevirtual readByte : ()B
    //   68: putfield FWm : I
    //   71: aload_0
    //   72: getfield Dne : I
    //   75: ifeq -> 94
    //   78: aload_0
    //   79: getfield Dne : I
    //   82: iconst_3
    //   83: if_icmpeq -> 94
    //   86: aload_0
    //   87: getfield Dne : I
    //   90: iconst_4
    //   91: if_icmpne -> 128
    //   94: aload_1
    //   95: invokevirtual readShort : ()S
    //   98: istore_2
    //   99: iconst_0
    //   100: istore_3
    //   101: iload_3
    //   102: iload_2
    //   103: if_icmpge -> 128
    //   106: aload_0
    //   107: getfield Dne : Ljava/util/Collection;
    //   110: aload_1
    //   111: bipush #16
    //   113: invokestatic Dne : (Ljava/io/DataInputStream;I)Ljava/lang/String;
    //   116: invokeinterface add : (Ljava/lang/Object;)Z
    //   121: pop
    //   122: iinc #3, 1
    //   125: goto -> 101
    //   128: return
  }
  
  public void Dne(DataOutputStream paramDataOutputStream) {
    // Byte code:
    //   0: aload_0
    //   1: getfield Dne : Ljava/lang/String;
    //   4: aload_1
    //   5: invokestatic Dne : (Ljava/lang/String;Ljava/io/DataOutputStream;)V
    //   8: aload_1
    //   9: aload_0
    //   10: getfield Dne : I
    //   13: invokevirtual writeByte : (I)V
    //   16: aload_0
    //   17: getfield Dne : I
    //   20: ifeq -> 31
    //   23: aload_0
    //   24: getfield Dne : I
    //   27: iconst_2
    //   28: if_icmpne -> 63
    //   31: aload_0
    //   32: getfield FWm : Ljava/lang/String;
    //   35: aload_1
    //   36: invokestatic Dne : (Ljava/lang/String;Ljava/io/DataOutputStream;)V
    //   39: aload_0
    //   40: getfield bzF : Ljava/lang/String;
    //   43: aload_1
    //   44: invokestatic Dne : (Ljava/lang/String;Ljava/io/DataOutputStream;)V
    //   47: aload_0
    //   48: getfield Qnq : Ljava/lang/String;
    //   51: aload_1
    //   52: invokestatic Dne : (Ljava/lang/String;Ljava/io/DataOutputStream;)V
    //   55: aload_1
    //   56: aload_0
    //   57: getfield FWm : I
    //   60: invokevirtual writeByte : (I)V
    //   63: aload_0
    //   64: getfield Dne : I
    //   67: ifeq -> 86
    //   70: aload_0
    //   71: getfield Dne : I
    //   74: iconst_3
    //   75: if_icmpeq -> 86
    //   78: aload_0
    //   79: getfield Dne : I
    //   82: iconst_4
    //   83: if_icmpne -> 136
    //   86: aload_1
    //   87: aload_0
    //   88: getfield Dne : Ljava/util/Collection;
    //   91: invokeinterface size : ()I
    //   96: invokevirtual writeShort : (I)V
    //   99: aload_0
    //   100: getfield Dne : Ljava/util/Collection;
    //   103: invokeinterface iterator : ()Ljava/util/Iterator;
    //   108: astore_2
    //   109: aload_2
    //   110: invokeinterface hasNext : ()Z
    //   115: ifeq -> 136
    //   118: aload_2
    //   119: invokeinterface next : ()Ljava/lang/Object;
    //   124: checkcast java/lang/String
    //   127: astore_3
    //   128: aload_3
    //   129: aload_1
    //   130: invokestatic Dne : (Ljava/lang/String;Ljava/io/DataOutputStream;)V
    //   133: goto -> 109
    //   136: return
  }
  
  public void Dne(pPV parampPV) {
    parampPV.Dne(this);
  }
  
  public SPR(YGE paramYGE, int paramInt) {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial <init> : ()V
    //   4: aload_0
    //   5: ldc ''
    //   7: putfield Dne : Ljava/lang/String;
    //   10: aload_0
    //   11: ldc ''
    //   13: putfield FWm : Ljava/lang/String;
    //   16: aload_0
    //   17: ldc ''
    //   19: putfield bzF : Ljava/lang/String;
    //   22: aload_0
    //   23: ldc ''
    //   25: putfield Qnq : Ljava/lang/String;
    //   28: aload_0
    //   29: new java/util/ArrayList
    //   32: dup
    //   33: invokespecial <init> : ()V
    //   36: putfield Dne : Ljava/util/Collection;
    //   39: aload_0
    //   40: iconst_0
    //   41: putfield Dne : I
    //   44: aload_0
    //   45: aload_1
    //   46: invokevirtual Dne : ()Ljava/lang/String;
    //   49: putfield Dne : Ljava/lang/String;
    //   52: aload_0
    //   53: iload_2
    //   54: putfield Dne : I
    //   57: iload_2
    //   58: ifeq -> 66
    //   61: iload_2
    //   62: iconst_2
    //   63: if_icmpne -> 98
    //   66: aload_0
    //   67: aload_1
    //   68: invokevirtual FWm : ()Ljava/lang/String;
    //   71: putfield FWm : Ljava/lang/String;
    //   74: aload_0
    //   75: aload_1
    //   76: invokevirtual bzF : ()Ljava/lang/String;
    //   79: putfield bzF : Ljava/lang/String;
    //   82: aload_0
    //   83: aload_1
    //   84: invokevirtual Qnq : ()Ljava/lang/String;
    //   87: putfield Qnq : Ljava/lang/String;
    //   90: aload_0
    //   91: aload_1
    //   92: invokevirtual Dne : ()I
    //   95: putfield FWm : I
    //   98: iload_2
    //   99: ifne -> 116
    //   102: aload_0
    //   103: getfield Dne : Ljava/util/Collection;
    //   106: aload_1
    //   107: invokevirtual Dne : ()Ljava/util/Collection;
    //   110: invokeinterface addAll : (Ljava/util/Collection;)Z
    //   115: pop
    //   116: return
  }
  
  public SPR() {
    this.Dne = new ArrayList();
    this.Dne = 0;
  }
  
  public SPR(YGE paramYGE, Collection paramCollection, int paramInt) {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial <init> : ()V
    //   4: aload_0
    //   5: ldc ''
    //   7: putfield Dne : Ljava/lang/String;
    //   10: aload_0
    //   11: ldc ''
    //   13: putfield FWm : Ljava/lang/String;
    //   16: aload_0
    //   17: ldc ''
    //   19: putfield bzF : Ljava/lang/String;
    //   22: aload_0
    //   23: ldc ''
    //   25: putfield Qnq : Ljava/lang/String;
    //   28: aload_0
    //   29: new java/util/ArrayList
    //   32: dup
    //   33: invokespecial <init> : ()V
    //   36: putfield Dne : Ljava/util/Collection;
    //   39: aload_0
    //   40: iconst_0
    //   41: putfield Dne : I
    //   44: iload_3
    //   45: iconst_3
    //   46: if_icmpeq -> 64
    //   49: iload_3
    //   50: iconst_4
    //   51: if_icmpeq -> 64
    //   54: new java/lang/IllegalArgumentException
    //   57: dup
    //   58: ldc 'Method must be join or leave for player constructor'
    //   60: invokespecial <init> : (Ljava/lang/String;)V
    //   63: athrow
    //   64: aload_2
    //   65: ifnull -> 104
    //   68: aload_2
    //   69: invokeinterface isEmpty : ()Z
    //   74: ifne -> 104
    //   77: aload_0
    //   78: iload_3
    //   79: putfield Dne : I
    //   82: aload_0
    //   83: aload_1
    //   84: invokevirtual Dne : ()Ljava/lang/String;
    //   87: putfield Dne : Ljava/lang/String;
    //   90: aload_0
    //   91: getfield Dne : Ljava/util/Collection;
    //   94: aload_2
    //   95: invokeinterface addAll : (Ljava/util/Collection;)Z
    //   100: pop
    //   101: goto -> 114
    //   104: new java/lang/IllegalArgumentException
    //   107: dup
    //   108: ldc 'Players cannot be null/empty'
    //   110: invokespecial <init> : (Ljava/lang/String;)V
    //   113: athrow
    //   114: return
  }
  
  public int Dne() {
    // Byte code:
    //   0: iconst_3
    //   1: aload_0
    //   2: getfield Dne : Ljava/lang/String;
    //   5: invokevirtual length : ()I
    //   8: iadd
    //   9: ireturn
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\SPR.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */