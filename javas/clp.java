import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class clp {
  private int Dne;
  
  private final RAN Dne;
  
  private Set Dne;
  
  private ZGT Dne = (ZGT)new HashSet();
  
  public void Dne(sMa paramsMa, int paramInt1, int paramInt2) {
    Dne(paramsMa, paramInt1, paramInt2, false);
  }
  
  public void Dne(sMa paramsMa) {
    if (paramsMa instanceof PJQ) {
      Dne(paramsMa, 512, 2);
      PJQ pJQ = (PJQ)paramsMa;
      for (phC phC : this.Dne) {
        if (phC.Dne != pJQ)
          phC.FWm(pJQ); 
      } 
    } else if (paramsMa instanceof cQz) {
      Dne(paramsMa, 64, 5, true);
    } else if (paramsMa instanceof hhc) {
      Dne(paramsMa, 64, 20, false);
    } else if (paramsMa instanceof Xzh) {
      Dne(paramsMa, 64, 10, false);
    } else if (paramsMa instanceof Tdr) {
      Dne(paramsMa, 64, 10, false);
    } else if (paramsMa instanceof KXX) {
      Dne(paramsMa, 64, 10, true);
    } else if (paramsMa instanceof Hhj) {
      Dne(paramsMa, 64, 10, true);
    } else if (paramsMa instanceof UMP) {
      Dne(paramsMa, 64, 4, true);
    } else if (paramsMa instanceof TCA) {
      Dne(paramsMa, 64, 10, true);
    } else if (paramsMa instanceof YgL) {
      Dne(paramsMa, 64, 10, true);
    } else if (paramsMa instanceof AEw) {
      Dne(paramsMa, 64, 10, true);
    } else if (paramsMa instanceof zMx) {
      Dne(paramsMa, 64, 10, true);
    } else if (paramsMa instanceof JiM) {
      Dne(paramsMa, 64, 20, true);
    } else if (paramsMa instanceof Ebp) {
      Dne(paramsMa, 80, 3, true);
    } else if (paramsMa instanceof iMX) {
      Dne(paramsMa, 80, 3, true);
    } else if (paramsMa instanceof Xxe) {
      Dne(paramsMa, 64, 3, true);
    } else if (paramsMa instanceof DhB) {
      Dne(paramsMa, 80, 3, false);
    } else if (paramsMa instanceof oaw) {
      Dne(paramsMa, 80, 3, false);
    } else if (paramsMa instanceof NbA) {
      Dne(paramsMa, 80, 3, true);
    } else if (paramsMa instanceof WSC) {
      Dne(paramsMa, 160, 3, true);
    } else if (paramsMa instanceof gqg) {
      Dne(paramsMa, 160, 10, true);
    } else if (paramsMa instanceof CiF) {
      Dne(paramsMa, 160, 20, true);
    } else if (paramsMa instanceof JCd) {
      Dne(paramsMa, 160, 2147483647, false);
    } else if (paramsMa instanceof alg) {
      Dne(paramsMa, 160, 20, true);
    } else if (paramsMa instanceof Ndk) {
      Dne(paramsMa, 256, 2147483647, false);
    } else if (paramsMa instanceof BPY) {
      Dne(paramsMa, 160, 2147483647, false);
    } 
  }
  
  public void Dne() {
    ArrayList<PJQ> arrayList = new ArrayList();
    for (phC phC : this.Dne) {
      phC.Dne(((RAN)this.Dne).Qnq);
      if (phC.Dne != 0.0D && phC.Dne instanceof PJQ)
        arrayList.add((PJQ)phC.Dne); 
    } 
    for (byte b = 0; b < arrayList.size(); b++) {
      PJQ pJQ = arrayList.get(b);
      for (phC phC : this.Dne) {
        if (phC.Dne != pJQ)
          phC.FWm(pJQ); 
      } 
    } 
  }
  
  public void Dne(PJQ paramPJQ, qMV paramqMV) {
    for (phC phC : this.Dne) {
      if (phC.Dne != paramPJQ && phC.Dne.IjH == paramqMV.Dne && phC.Dne.XHL == paramqMV.FWm)
        phC.FWm(paramPJQ); 
    } 
  }
  
  public void FWm(sMa paramsMa) {
    if (paramsMa instanceof PJQ) {
      PJQ pJQ = (PJQ)paramsMa;
      for (phC phC1 : this.Dne)
        phC1.Dne(pJQ); 
    } 
    phC phC = (phC)this.Dne.FWm(paramsMa.aFZ);
    if (phC != null) {
      this.Dne.remove(phC);
      phC.Dne();
    } 
  }
  
  public void FWm(sMa paramsMa, NER paramNER) {
    phC phC = (phC)this.Dne.Dne(paramsMa.aFZ);
    if (phC != null)
      phC.FWm(paramNER); 
  }
  
  public clp(RAN paramRAN) {
    this.Dne = new ZGT();
    this.Dne = (ZGT)paramRAN;
    this.Dne = paramRAN.Dne().Dne().Dne();
  }
  
  public void Dne(PJQ paramPJQ) {
    for (phC phC : this.Dne)
      phC.bzF(paramPJQ); 
  }
  
  public void Dne(sMa paramsMa, NER paramNER) {
    phC phC = (phC)this.Dne.Dne(paramsMa.aFZ);
    if (phC != null)
      phC.Dne(paramNER); 
  }
  
  public void Dne(sMa paramsMa, int paramInt1, int paramInt2, boolean paramBoolean) {
    // Byte code:
    //   0: iload_2
    //   1: aload_0
    //   2: getfield Dne : I
    //   5: if_icmple -> 13
    //   8: aload_0
    //   9: getfield Dne : I
    //   12: istore_2
    //   13: aload_0
    //   14: getfield Dne : LZGT;
    //   17: aload_1
    //   18: getfield aFZ : I
    //   21: invokevirtual Dne : (I)Z
    //   24: ifeq -> 37
    //   27: new java/lang/IllegalStateException
    //   30: dup
    //   31: ldc 'Entity is already tracked!'
    //   33: invokespecial <init> : (Ljava/lang/String;)V
    //   36: athrow
    //   37: new phC
    //   40: dup
    //   41: aload_1
    //   42: iload_2
    //   43: iload_3
    //   44: iload #4
    //   46: invokespecial <init> : (LsMa;IIZ)V
    //   49: astore #5
    //   51: aload_0
    //   52: getfield Dne : Ljava/util/Set;
    //   55: aload #5
    //   57: invokeinterface add : (Ljava/lang/Object;)Z
    //   62: pop
    //   63: aload_0
    //   64: getfield Dne : LZGT;
    //   67: aload_1
    //   68: getfield aFZ : I
    //   71: aload #5
    //   73: invokevirtual Dne : (ILjava/lang/Object;)V
    //   76: aload #5
    //   78: aload_0
    //   79: getfield Dne : LRAN;
    //   82: getfield Qnq : Ljava/util/List;
    //   85: invokevirtual FWm : (Ljava/util/List;)V
    //   88: goto -> 217
    //   91: astore #5
    //   93: aload #5
    //   95: ldc 'Adding entity to track'
    //   97: invokestatic Dne : (Ljava/lang/Throwable;Ljava/lang/String;)LMcM;
    //   100: astore #6
    //   102: aload #6
    //   104: ldc 'Entity To Track'
    //   106: invokevirtual Dne : (Ljava/lang/String;)LNoo;
    //   109: astore #7
    //   111: aload #7
    //   113: ldc 'Tracking range'
    //   115: new java/lang/StringBuilder
    //   118: dup
    //   119: invokespecial <init> : ()V
    //   122: iload_2
    //   123: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   126: ldc ' blocks'
    //   128: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   131: invokevirtual toString : ()Ljava/lang/String;
    //   134: invokevirtual Dne : (Ljava/lang/String;Ljava/lang/Object;)V
    //   137: aload #7
    //   139: ldc 'Update interval'
    //   141: new ZXl
    //   144: dup
    //   145: aload_0
    //   146: iload_3
    //   147: invokespecial <init> : (Lclp;I)V
    //   150: invokevirtual Dne : (Ljava/lang/String;Ljava/util/concurrent/Callable;)V
    //   153: aload_1
    //   154: aload #7
    //   156: invokevirtual Dne : (LNoo;)V
    //   159: aload #6
    //   161: ldc_w 'Entity That Is Already Tracked'
    //   164: invokevirtual Dne : (Ljava/lang/String;)LNoo;
    //   167: astore #8
    //   169: aload_0
    //   170: getfield Dne : LZGT;
    //   173: aload_1
    //   174: getfield aFZ : I
    //   177: invokevirtual Dne : (I)Ljava/lang/Object;
    //   180: checkcast phC
    //   183: getfield Dne : LsMa;
    //   186: aload #8
    //   188: invokevirtual Dne : (LNoo;)V
    //   191: new kaJ
    //   194: dup
    //   195: aload #6
    //   197: invokespecial <init> : (LMcM;)V
    //   200: athrow
    //   201: astore #9
    //   203: getstatic java/lang/System.err : Ljava/io/PrintStream;
    //   206: ldc_w '"Silently" catching entity tracking error.'
    //   209: invokevirtual println : (Ljava/lang/String;)V
    //   212: aload #9
    //   214: invokevirtual printStackTrace : ()V
    //   217: return
    // Exception table:
    //   from	to	target	type
    //   13	88	91	java/lang/Throwable
    //   191	201	201	kaJ
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\clp.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */