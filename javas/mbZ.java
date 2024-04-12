import java.io.DataInput;
import java.io.DataOutput;
import java.util.ArrayList;
import java.util.List;

public class mbZ extends oNe {
  public List Dne;
  
  private byte Dne = new ArrayList();
  
  public String toString() {
    // Byte code:
    //   0: new java/lang/StringBuilder
    //   3: dup
    //   4: invokespecial <init> : ()V
    //   7: ldc ''
    //   9: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   12: aload_0
    //   13: getfield Dne : Ljava/util/List;
    //   16: invokeinterface size : ()I
    //   21: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   24: ldc ' entries of type '
    //   26: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   29: aload_0
    //   30: getfield Dne : B
    //   33: invokestatic Dne : (B)Ljava/lang/String;
    //   36: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   39: invokevirtual toString : ()Ljava/lang/String;
    //   42: areturn
  }
  
  void Dne(DataInput paramDataInput) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: invokeinterface readByte : ()B
    //   7: putfield Dne : B
    //   10: aload_1
    //   11: invokeinterface readInt : ()I
    //   16: istore_2
    //   17: aload_0
    //   18: new java/util/ArrayList
    //   21: dup
    //   22: invokespecial <init> : ()V
    //   25: putfield Dne : Ljava/util/List;
    //   28: iconst_0
    //   29: istore_3
    //   30: iload_3
    //   31: iload_2
    //   32: if_icmpge -> 72
    //   35: aload_0
    //   36: getfield Dne : B
    //   39: aconst_null
    //   40: checkcast java/lang/String
    //   43: invokestatic Dne : (BLjava/lang/String;)LoNe;
    //   46: astore #4
    //   48: aload #4
    //   50: aload_1
    //   51: invokevirtual Dne : (Ljava/io/DataInput;)V
    //   54: aload_0
    //   55: getfield Dne : Ljava/util/List;
    //   58: aload #4
    //   60: invokeinterface add : (Ljava/lang/Object;)Z
    //   65: pop
    //   66: iinc #3, 1
    //   69: goto -> 30
    //   72: return
  }
  
  void Dne(DataOutput paramDataOutput) {
    // Byte code:
    //   0: aload_0
    //   1: getfield Dne : Ljava/util/List;
    //   4: invokeinterface isEmpty : ()Z
    //   9: ifne -> 35
    //   12: aload_0
    //   13: aload_0
    //   14: getfield Dne : Ljava/util/List;
    //   17: iconst_0
    //   18: invokeinterface get : (I)Ljava/lang/Object;
    //   23: checkcast oNe
    //   26: invokevirtual Dne : ()B
    //   29: putfield Dne : B
    //   32: goto -> 40
    //   35: aload_0
    //   36: iconst_1
    //   37: putfield Dne : B
    //   40: aload_1
    //   41: aload_0
    //   42: getfield Dne : B
    //   45: invokeinterface writeByte : (I)V
    //   50: aload_1
    //   51: aload_0
    //   52: getfield Dne : Ljava/util/List;
    //   55: invokeinterface size : ()I
    //   60: invokeinterface writeInt : (I)V
    //   65: iconst_0
    //   66: istore_2
    //   67: iload_2
    //   68: aload_0
    //   69: getfield Dne : Ljava/util/List;
    //   72: invokeinterface size : ()I
    //   77: if_icmpge -> 103
    //   80: aload_0
    //   81: getfield Dne : Ljava/util/List;
    //   84: iload_2
    //   85: invokeinterface get : (I)Ljava/lang/Object;
    //   90: checkcast oNe
    //   93: aload_1
    //   94: invokevirtual Dne : (Ljava/io/DataOutput;)V
    //   97: iinc #2, 1
    //   100: goto -> 67
    //   103: return
  }
  
  public void Dne(oNe paramoNe) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: invokevirtual Dne : ()B
    //   5: putfield Dne : B
    //   8: aload_0
    //   9: getfield Dne : Ljava/util/List;
    //   12: aload_1
    //   13: invokeinterface add : (Ljava/lang/Object;)Z
    //   18: pop
    //   19: return
  }
  
  public int Dne() {
    // Byte code:
    //   0: aload_0
    //   1: getfield Dne : Ljava/util/List;
    //   4: invokeinterface size : ()I
    //   9: ireturn
  }
  
  public byte Dne() {
    return 9;
  }
  
  public int hashCode() {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial hashCode : ()I
    //   4: aload_0
    //   5: getfield Dne : Ljava/util/List;
    //   8: invokeinterface hashCode : ()I
    //   13: ixor
    //   14: ireturn
  }
  
  public boolean equals(Object paramObject) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: invokespecial equals : (Ljava/lang/Object;)Z
    //   5: ifeq -> 38
    //   8: aload_1
    //   9: checkcast mbZ
    //   12: astore_2
    //   13: aload_0
    //   14: getfield Dne : B
    //   17: aload_2
    //   18: getfield Dne : B
    //   21: if_icmpne -> 38
    //   24: aload_0
    //   25: getfield Dne : Ljava/util/List;
    //   28: aload_2
    //   29: getfield Dne : Ljava/util/List;
    //   32: invokeinterface equals : (Ljava/lang/Object;)Z
    //   37: ireturn
    //   38: iconst_0
    //   39: ireturn
  }
  
  public oNe Dne(int paramInt) {
    // Byte code:
    //   0: aload_0
    //   1: getfield Dne : Ljava/util/List;
    //   4: iload_1
    //   5: invokeinterface remove : (I)Ljava/lang/Object;
    //   10: checkcast oNe
    //   13: areturn
  }
  
  public mbZ() {
    super("");
  }
  
  public oNe Dne() {
    // Byte code:
    //   0: new mbZ
    //   3: dup
    //   4: aload_0
    //   5: invokevirtual Dne : ()Ljava/lang/String;
    //   8: invokespecial <init> : (Ljava/lang/String;)V
    //   11: astore_1
    //   12: aload_1
    //   13: aload_0
    //   14: getfield Dne : B
    //   17: putfield Dne : B
    //   20: aload_0
    //   21: getfield Dne : Ljava/util/List;
    //   24: invokeinterface iterator : ()Ljava/util/Iterator;
    //   29: astore_2
    //   30: aload_2
    //   31: invokeinterface hasNext : ()Z
    //   36: ifeq -> 70
    //   39: aload_2
    //   40: invokeinterface next : ()Ljava/lang/Object;
    //   45: checkcast oNe
    //   48: astore_3
    //   49: aload_3
    //   50: invokevirtual Dne : ()LoNe;
    //   53: astore #4
    //   55: aload_1
    //   56: getfield Dne : Ljava/util/List;
    //   59: aload #4
    //   61: invokeinterface add : (Ljava/lang/Object;)Z
    //   66: pop
    //   67: goto -> 30
    //   70: aload_1
    //   71: areturn
  }
  
  public oNe FWm(int paramInt) {
    // Byte code:
    //   0: aload_0
    //   1: getfield Dne : Ljava/util/List;
    //   4: iload_1
    //   5: invokeinterface get : (I)Ljava/lang/Object;
    //   10: checkcast oNe
    //   13: areturn
  }
  
  public mbZ(String paramString) {
    super(paramString);
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\mbZ.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */