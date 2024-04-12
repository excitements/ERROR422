import java.util.ArrayList;
import java.util.List;

class JAu {
  private final Sxs Dne;
  
  private int Dne;
  
  final wrs Dne;
  
  private final List Dne;
  
  private short[] Dne;
  
  private int FWm;
  
  public void FWm(PJQ paramPJQ) {
    // Byte code:
    //   0: aload_0
    //   1: getfield Dne : Ljava/util/List;
    //   4: aload_1
    //   5: invokeinterface contains : (Ljava/lang/Object;)Z
    //   10: ifeq -> 179
    //   13: aload_1
    //   14: getfield Dne : LTnv;
    //   17: new pKI
    //   20: dup
    //   21: aload_0
    //   22: getfield Dne : Lwrs;
    //   25: invokestatic Dne : (Lwrs;)LRAN;
    //   28: aload_0
    //   29: getfield Dne : LSxs;
    //   32: getfield Dne : I
    //   35: aload_0
    //   36: getfield Dne : LSxs;
    //   39: getfield FWm : I
    //   42: invokevirtual FWm : (II)LqMV;
    //   45: iconst_1
    //   46: iconst_0
    //   47: invokespecial <init> : (LqMV;ZI)V
    //   50: invokevirtual Dne : (LNER;)V
    //   53: aload_0
    //   54: getfield Dne : Ljava/util/List;
    //   57: aload_1
    //   58: invokeinterface remove : (Ljava/lang/Object;)Z
    //   63: pop
    //   64: aload_1
    //   65: getfield Dne : Ljava/util/List;
    //   68: aload_0
    //   69: getfield Dne : LSxs;
    //   72: invokeinterface remove : (Ljava/lang/Object;)Z
    //   77: pop
    //   78: aload_0
    //   79: getfield Dne : Ljava/util/List;
    //   82: invokeinterface isEmpty : ()Z
    //   87: ifeq -> 179
    //   90: aload_0
    //   91: getfield Dne : LSxs;
    //   94: getfield Dne : I
    //   97: i2l
    //   98: ldc2_w 2147483647
    //   101: ladd
    //   102: aload_0
    //   103: getfield Dne : LSxs;
    //   106: getfield FWm : I
    //   109: i2l
    //   110: ldc2_w 2147483647
    //   113: ladd
    //   114: bipush #32
    //   116: lshl
    //   117: lor
    //   118: lstore_2
    //   119: aload_0
    //   120: getfield Dne : Lwrs;
    //   123: invokestatic Dne : (Lwrs;)LTfm;
    //   126: lload_2
    //   127: invokevirtual FWm : (J)Ljava/lang/Object;
    //   130: pop
    //   131: aload_0
    //   132: getfield Dne : I
    //   135: ifle -> 152
    //   138: aload_0
    //   139: getfield Dne : Lwrs;
    //   142: invokestatic Dne : (Lwrs;)Ljava/util/List;
    //   145: aload_0
    //   146: invokeinterface remove : (Ljava/lang/Object;)Z
    //   151: pop
    //   152: aload_0
    //   153: getfield Dne : Lwrs;
    //   156: invokevirtual Dne : ()LRAN;
    //   159: getfield Dne : LEnH;
    //   162: aload_0
    //   163: getfield Dne : LSxs;
    //   166: getfield Dne : I
    //   169: aload_0
    //   170: getfield Dne : LSxs;
    //   173: getfield FWm : I
    //   176: invokevirtual FWm : (II)V
    //   179: return
  }
  
  public void Dne(int paramInt1, int paramInt2, int paramInt3) {
    if (this.Dne == null)
      wrs.Dne((wrs)this.Dne).add(this); 
    this.FWm |= 1 << paramInt2 >> 4;
    if (this.Dne < 64) {
      short s = (short)(paramInt1 << 12 | paramInt3 << 8 | paramInt2);
      for (byte b = 0; b < this.Dne; b++) {
        if (this.Dne[b] == s)
          return; 
      } 
      this.Dne[this.Dne++] = s;
    } 
  }
  
  private void Dne(ipD paramipD) {
    if (paramipD != null) {
      NER nER = paramipD.Dne();
      if (nER != null)
        Dne(nER); 
    } 
  }
  
  public void Dne() {
    if (this.Dne != null) {
      if (this.Dne == true) {
        int i = ((Sxs)this.Dne).Dne * 16 + (this.Dne[0] >> 12 & 0xF);
        int j = this.Dne[0] & 0xFF;
        int k = ((Sxs)this.Dne).FWm * 16 + (this.Dne[0] >> 8 & 0xF);
        Dne(new cSs(i, j, k, wrs.Dne((wrs)this.Dne)));
        if (wrs.Dne((wrs)this.Dne).FWm(i, j, k))
          Dne(wrs.Dne((wrs)this.Dne).Dne(i, j, k)); 
      } else if (this.Dne == 64) {
        int i = ((Sxs)this.Dne).Dne * 16;
        int j = ((Sxs)this.Dne).FWm * 16;
        Dne(new pKI(wrs.Dne((wrs)this.Dne).FWm(((Sxs)this.Dne).Dne, ((Sxs)this.Dne).FWm), false, this.FWm));
        for (byte b = 0; b < 16; b++) {
          if ((this.FWm & 1 << b) != 0) {
            int k = b << 4;
            List<ipD> list = wrs.Dne((wrs)this.Dne).Dne(i, k, j, i + 16, k + 16, j + 16);
            for (byte b1 = 0; b1 < list.size(); b1++)
              Dne(list.get(b1)); 
          } 
        } 
      } else {
        Dne(new Ylf(((Sxs)this.Dne).Dne, ((Sxs)this.Dne).FWm, this.Dne, this.Dne, wrs.Dne((wrs)this.Dne)));
        for (byte b = 0; b < this.Dne; b++) {
          int i = ((Sxs)this.Dne).Dne * 16 + (this.Dne[b] >> 12 & 0xF);
          int j = this.Dne[b] & 0xFF;
          int k = ((Sxs)this.Dne).FWm * 16 + (this.Dne[b] >> 8 & 0xF);
          if (wrs.Dne((wrs)this.Dne).FWm(i, j, k))
            Dne(wrs.Dne((wrs)this.Dne).Dne(i, j, k)); 
        } 
      } 
      this.Dne = false;
      this.FWm = 0;
    } 
  }
  
  public void Dne(NER paramNER) {
    // Byte code:
    //   0: iconst_0
    //   1: istore_2
    //   2: iload_2
    //   3: aload_0
    //   4: getfield Dne : Ljava/util/List;
    //   7: invokeinterface size : ()I
    //   12: if_icmpge -> 59
    //   15: aload_0
    //   16: getfield Dne : Ljava/util/List;
    //   19: iload_2
    //   20: invokeinterface get : (I)Ljava/lang/Object;
    //   25: checkcast PJQ
    //   28: astore_3
    //   29: aload_3
    //   30: getfield Dne : Ljava/util/List;
    //   33: aload_0
    //   34: getfield Dne : LSxs;
    //   37: invokeinterface contains : (Ljava/lang/Object;)Z
    //   42: ifne -> 53
    //   45: aload_3
    //   46: getfield Dne : LTnv;
    //   49: aload_1
    //   50: invokevirtual Dne : (LNER;)V
    //   53: iinc #2, 1
    //   56: goto -> 2
    //   59: return
  }
  
  static Sxs Dne(JAu paramJAu) {
    return (Sxs)paramJAu.Dne;
  }
  
  public JAu(wrs paramwrs, int paramInt1, int paramInt2) {
    this.Dne = (short[])paramwrs;
    this.Dne = (short[])new ArrayList();
    this.Dne = new short[64];
    this.Dne = false;
    this.Dne = (short[])new Sxs(paramInt1, paramInt2);
    (paramwrs.Dne()).Dne.FWm(paramInt1, paramInt2);
  }
  
  public void Dne(PJQ paramPJQ) {
    // Byte code:
    //   0: aload_0
    //   1: getfield Dne : Ljava/util/List;
    //   4: aload_1
    //   5: invokeinterface contains : (Ljava/lang/Object;)Z
    //   10: ifeq -> 70
    //   13: new java/lang/IllegalStateException
    //   16: dup
    //   17: new java/lang/StringBuilder
    //   20: dup
    //   21: invokespecial <init> : ()V
    //   24: ldc 'Failed to add player. '
    //   26: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   29: aload_1
    //   30: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   33: ldc ' already is in chunk '
    //   35: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   38: aload_0
    //   39: getfield Dne : LSxs;
    //   42: getfield Dne : I
    //   45: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   48: ldc ', '
    //   50: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   53: aload_0
    //   54: getfield Dne : LSxs;
    //   57: getfield FWm : I
    //   60: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   63: invokevirtual toString : ()Ljava/lang/String;
    //   66: invokespecial <init> : (Ljava/lang/String;)V
    //   69: athrow
    //   70: aload_0
    //   71: getfield Dne : Ljava/util/List;
    //   74: aload_1
    //   75: invokeinterface add : (Ljava/lang/Object;)Z
    //   80: pop
    //   81: aload_1
    //   82: getfield Dne : Ljava/util/List;
    //   85: aload_0
    //   86: getfield Dne : LSxs;
    //   89: invokeinterface add : (Ljava/lang/Object;)Z
    //   94: pop
    //   95: return
  }
  
  static List Dne(JAu paramJAu) {
    return (List)paramJAu.Dne;
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\JAu.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */