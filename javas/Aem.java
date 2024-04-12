import java.util.List;

public class Aem extends ipD implements wjF {
  private NMq[] Dne;
  
  private String Dne;
  
  private int Dne = new NMq[5];
  
  private static boolean Dne(MqS paramMqS, NMq paramNMq, int paramInt1, int paramInt2) {
    return !paramMqS.Dne(paramInt1, paramNMq) ? false : ((!(paramMqS instanceof FMb) || ((FMb)paramMqS).Dne(paramInt1, paramNMq, paramInt2)));
  }
  
  public static boolean Dne(MqS paramMqS, JiM paramJiM) {
    boolean bool = false;
    if (paramJiM == null)
      return false; 
    NMq nMq1 = paramJiM.Dne().Dne();
    NMq nMq2 = Dne(paramMqS, nMq1, -1);
    if (nMq2 != null && nMq2.Dne != 0) {
      paramJiM.Dne(nMq2);
    } else {
      bool = true;
      paramJiM.g_();
    } 
    return bool;
  }
  
  public Aem() {
    this.Dne = -1;
  }
  
  public double FWm() {
    return this.aFZ;
  }
  
  private static boolean Dne(NMq paramNMq1, NMq paramNMq2) {
    return (paramNMq1.bzF != paramNMq2.bzF) ? false : ((paramNMq1.Qnq() != paramNMq2.Qnq()) ? false : ((paramNMq1.Dne > paramNMq1.FWm()) ? false : NMq.Dne(paramNMq1, paramNMq2)));
  }
  
  public int Qnq() {
    return this.Dne.length;
  }
  
  public boolean bzF() {
    return (this.Dne > 0);
  }
  
  public void Dne(int paramInt) {
    this.Dne = paramInt;
  }
  
  public boolean d_() {
    // Byte code:
    //   0: aload_0
    //   1: getfield Dne : Ljava/lang/String;
    //   4: ifnull -> 21
    //   7: aload_0
    //   8: getfield Dne : Ljava/lang/String;
    //   11: invokevirtual length : ()I
    //   14: ifle -> 21
    //   17: iconst_1
    //   18: goto -> 22
    //   21: iconst_0
    //   22: ireturn
  }
  
  public void i_() {}
  
  public void Dne(WkD paramWkD) {
    super.Dne(paramWkD);
    mbZ mbZ = paramWkD.Dne("Items");
    this.Dne = new NMq[Qnq()];
    if (paramWkD.Dne("CustomName"))
      this.Dne = paramWkD.Dne("CustomName"); 
    this.Dne = paramWkD.Dne("TransferCooldown");
    for (byte b = 0; b < mbZ.Dne(); b++) {
      WkD wkD = (WkD)mbZ.FWm(b);
      byte b1 = wkD.Dne("Slot");
      if (b1 >= 0 && b1 < this.Dne.length)
        this.Dne[b1] = NMq.Dne(wkD); 
    } 
  }
  
  public boolean Dne(int paramInt, NMq paramNMq) {
    return true;
  }
  
  public void bzF() {}
  
  public boolean Dne(FiG paramFiG) {
    // Byte code:
    //   0: aload_0
    //   1: getfield Dne : LQnq;
    //   4: aload_0
    //   5: getfield Qnq : I
    //   8: aload_0
    //   9: getfield aFZ : I
    //   12: aload_0
    //   13: getfield zGp : I
    //   16: invokevirtual Dne : (III)LipD;
    //   19: aload_0
    //   20: if_acmpeq -> 27
    //   23: iconst_0
    //   24: goto -> 70
    //   27: aload_1
    //   28: aload_0
    //   29: getfield Qnq : I
    //   32: i2d
    //   33: ldc2_w 0.5
    //   36: dadd
    //   37: aload_0
    //   38: getfield aFZ : I
    //   41: i2d
    //   42: ldc2_w 0.5
    //   45: dadd
    //   46: aload_0
    //   47: getfield zGp : I
    //   50: i2d
    //   51: ldc2_w 0.5
    //   54: dadd
    //   55: invokevirtual Dne : (DDD)D
    //   58: ldc2_w 64.0
    //   61: dcmpg
    //   62: ifgt -> 69
    //   65: iconst_1
    //   66: goto -> 70
    //   69: iconst_0
    //   70: ireturn
  }
  
  public void a_() {
    super.a_();
  }
  
  public static NMq Dne(MqS paramMqS, NMq paramNMq, int paramInt) {
    if (paramMqS instanceof FMb && paramInt > -1) {
      FMb fMb = (FMb)paramMqS;
      int[] arrayOfInt = fMb.Dne(paramInt);
      for (byte b = 0; b < arrayOfInt.length && paramNMq != null && paramNMq.Dne > 0; b++)
        paramNMq = Dne(paramMqS, paramNMq, arrayOfInt[b], paramInt); 
    } else {
      int i = paramMqS.Qnq();
      for (byte b = 0; b < i && paramNMq != null && paramNMq.Dne > 0; b++)
        paramNMq = Dne(paramMqS, paramNMq, b, paramInt); 
    } 
    if (paramNMq != null && paramNMq.Dne == 0)
      paramNMq = null; 
    return paramNMq;
  }
  
  public boolean FWm() {
    if (this.Dne != null && this.Dne.aFZ == null) {
      if (!bzF() && SrC.Dne(zGp())) {
        int i = zGp() | Dne(this);
        if (i != 0) {
          Dne(8);
          a_();
          return true;
        } 
      } 
      return false;
    } 
    return false;
  }
  
  public void Dne(String paramString) {
    this.Dne = paramString;
  }
  
  public NMq FWm(int paramInt) {
    if (this.Dne[paramInt] != null) {
      int i = this.Dne[paramInt];
      this.Dne[paramInt] = null;
      return i;
    } 
    return null;
  }
  
  private static NMq Dne(MqS paramMqS, NMq paramNMq, int paramInt1, int paramInt2) {
    NMq nMq = paramMqS.Dne(paramInt1);
    if (Dne(paramMqS, paramNMq, paramInt1, paramInt2)) {
      boolean bool = false;
      if (nMq == null) {
        paramMqS.Dne(paramInt1, paramNMq);
        paramNMq = null;
        bool = true;
      } else if (Dne(nMq, paramNMq)) {
        int i = paramNMq.FWm() - nMq.Dne;
        int j = Math.min(paramNMq.Dne, i);
        paramNMq.Dne -= j;
        nMq.Dne += j;
        bool = (j > 0) ? true : false;
      } 
      if (bool) {
        if (paramMqS instanceof Aem)
          ((Aem)paramMqS).Dne(8); 
        paramMqS.a_();
      } 
    } 
    return paramNMq;
  }
  
  public void Dne() {
    if (this.Dne != null && this.Dne.aFZ == null) {
      this.Dne--;
      if (!bzF()) {
        Dne(0);
        FWm();
      } 
    } 
  }
  
  public static MqS Dne(Qnq paramQnq, double paramDouble1, double paramDouble2, double paramDouble3) {
    MqS mqS = null;
    int i = geR.FWm(paramDouble1);
    int j = geR.FWm(paramDouble2);
    int k = geR.FWm(paramDouble3);
    ipD ipD1 = paramQnq.Dne(i, j, k);
    if (ipD1 != null && ipD1 instanceof MqS) {
      mqS = (MqS)ipD1;
      if (mqS instanceof GON) {
        int m = paramQnq.Dne(i, j, k);
        dNT dNT = zKP.Dne[m];
        if (dNT instanceof gHK)
          mqS = ((gHK)dNT).Dne(paramQnq, i, j, k); 
      } 
    } 
    if (mqS == null) {
      List<MqS> list = paramQnq.Dne((sMa)null, bSp.Dne().Dne(paramDouble1, paramDouble2, paramDouble3, paramDouble1 + 1.0D, paramDouble2 + 1.0D, paramDouble3 + 1.0D), pUe.FWm);
      if (list != null && list.size() > 0)
        mqS = list.get(paramQnq.Dne.nextInt(list.size())); 
    } 
    return mqS;
  }
  
  public int aFZ() {
    return erC.Dne;
  }
  
  public double bzF() {
    return this.zGp;
  }
  
  public void Dne(int paramInt, NMq paramNMq) {
    this.Dne[paramInt] = paramNMq;
    if (paramNMq != null && paramNMq.Dne > aFZ())
      paramNMq.Dne = aFZ(); 
  }
  
  public static boolean Dne(wjF paramwjF) {
    MqS mqS = Dne(paramwjF);
    if (mqS != null) {
      byte b = 0;
      if (mqS instanceof FMb && b > -1) {
        FMb fMb = (FMb)mqS;
        int[] arrayOfInt = fMb.Dne(b);
        for (byte b1 = 0; b1 < arrayOfInt.length; b1++) {
          if (Dne(paramwjF, mqS, arrayOfInt[b1], b))
            return true; 
        } 
      } else {
        int i = mqS.Qnq();
        for (byte b1 = 0; b1 < i; b1++) {
          if (Dne(paramwjF, mqS, b1, b))
            return true; 
        } 
      } 
    } else {
      JiM jiM = Dne(paramwjF.Dne(), paramwjF.Dne(), paramwjF.FWm() + 1.0D, paramwjF.bzF());
      if (jiM != null)
        return Dne(paramwjF, jiM); 
    } 
    return false;
  }
  
  public NMq Dne(int paramInt1, int paramInt2) {
    // Byte code:
    //   0: aload_0
    //   1: getfield Dne : [LNMq;
    //   4: iload_1
    //   5: aaload
    //   6: ifnull -> 70
    //   9: aload_0
    //   10: getfield Dne : [LNMq;
    //   13: iload_1
    //   14: aaload
    //   15: getfield Dne : I
    //   18: iload_2
    //   19: if_icmpgt -> 38
    //   22: aload_0
    //   23: getfield Dne : [LNMq;
    //   26: iload_1
    //   27: aaload
    //   28: astore_3
    //   29: aload_0
    //   30: getfield Dne : [LNMq;
    //   33: iload_1
    //   34: aconst_null
    //   35: aastore
    //   36: aload_3
    //   37: areturn
    //   38: aload_0
    //   39: getfield Dne : [LNMq;
    //   42: iload_1
    //   43: aaload
    //   44: iload_2
    //   45: invokevirtual Dne : (I)LNMq;
    //   48: astore_3
    //   49: aload_0
    //   50: getfield Dne : [LNMq;
    //   53: iload_1
    //   54: aaload
    //   55: getfield Dne : I
    //   58: ifne -> 68
    //   61: aload_0
    //   62: getfield Dne : [LNMq;
    //   65: iload_1
    //   66: aconst_null
    //   67: aastore
    //   68: aload_3
    //   69: areturn
    //   70: aconst_null
    //   71: areturn
  }
  
  public NMq Dne(int paramInt) {
    return this.Dne[paramInt];
  }
  
  public double Dne() {
    return this.Qnq;
  }
  
  public String b_() {
    return d_() ? this.Dne : "container.hopper";
  }
  
  private static boolean Dne(wjF paramwjF, MqS paramMqS, int paramInt1, int paramInt2) {
    NMq nMq = paramMqS.Dne(paramInt1);
    if (nMq != null && FWm(paramMqS, nMq, paramInt1, paramInt2)) {
      NMq nMq1 = nMq.Dne();
      NMq nMq2 = Dne(paramwjF, paramMqS.Dne(paramInt1, 1), -1);
      if (nMq2 == null || nMq2.Dne == 0) {
        paramMqS.a_();
        return true;
      } 
      paramMqS.Dne(paramInt1, nMq1);
    } 
    return false;
  }
  
  public void FWm(WkD paramWkD) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: invokespecial FWm : (LWkD;)V
    //   5: new mbZ
    //   8: dup
    //   9: invokespecial <init> : ()V
    //   12: astore_2
    //   13: iconst_0
    //   14: istore_3
    //   15: iload_3
    //   16: aload_0
    //   17: getfield Dne : [LNMq;
    //   20: arraylength
    //   21: if_icmpge -> 75
    //   24: aload_0
    //   25: getfield Dne : [LNMq;
    //   28: iload_3
    //   29: aaload
    //   30: ifnull -> 69
    //   33: new WkD
    //   36: dup
    //   37: invokespecial <init> : ()V
    //   40: astore #4
    //   42: aload #4
    //   44: ldc 'Slot'
    //   46: iload_3
    //   47: i2b
    //   48: invokevirtual Dne : (Ljava/lang/String;B)V
    //   51: aload_0
    //   52: getfield Dne : [LNMq;
    //   55: iload_3
    //   56: aaload
    //   57: aload #4
    //   59: invokevirtual Dne : (LWkD;)LWkD;
    //   62: pop
    //   63: aload_2
    //   64: aload #4
    //   66: invokevirtual Dne : (LoNe;)V
    //   69: iinc #3, 1
    //   72: goto -> 15
    //   75: aload_1
    //   76: ldc 'Items'
    //   78: aload_2
    //   79: invokevirtual Dne : (Ljava/lang/String;LoNe;)V
    //   82: aload_1
    //   83: ldc 'TransferCooldown'
    //   85: aload_0
    //   86: getfield Dne : I
    //   89: invokevirtual Dne : (Ljava/lang/String;I)V
    //   92: aload_0
    //   93: invokevirtual d_ : ()Z
    //   96: ifeq -> 109
    //   99: aload_1
    //   100: ldc 'CustomName'
    //   102: aload_0
    //   103: getfield Dne : Ljava/lang/String;
    //   106: invokevirtual Dne : (Ljava/lang/String;Ljava/lang/String;)V
    //   109: return
  }
  
  private static boolean FWm(MqS paramMqS, NMq paramNMq, int paramInt1, int paramInt2) {
    return (!(paramMqS instanceof FMb) || ((FMb)paramMqS).FWm(paramInt1, paramNMq, paramInt2));
  }
  
  private MqS Dne() {
    int i = SrC.bzF(zGp());
    return Dne(Dne(), (this.Qnq + rrP.FWm[i]), (this.aFZ + rrP.bzF[i]), (this.zGp + rrP.Qnq[i]));
  }
  
  public static JiM Dne(Qnq paramQnq, double paramDouble1, double paramDouble2, double paramDouble3) {
    List<JiM> list = paramQnq.Dne(JiM.class, bSp.Dne().Dne(paramDouble1, paramDouble2, paramDouble3, paramDouble1 + 1.0D, paramDouble2 + 1.0D, paramDouble3 + 1.0D), pUe.Dne);
    return (list.size() > 0) ? list.get(0) : null;
  }
  
  public static MqS Dne(wjF paramwjF) {
    return Dne(paramwjF.Dne(), paramwjF.Dne(), paramwjF.FWm() + 1.0D, paramwjF.bzF());
  }
  
  private boolean zGp() {
    MqS mqS = Dne();
    if (mqS == null)
      return false; 
    for (byte b = 0; b < Qnq(); b++) {
      if (Dne(b) != null) {
        NMq nMq1 = Dne(b).Dne();
        NMq nMq2 = Dne(mqS, Dne(b, 1), rrP.Dne[SrC.bzF(zGp())]);
        if (nMq2 == null || nMq2.Dne == 0) {
          mqS.a_();
          return true;
        } 
        Dne(b, nMq1);
      } 
    } 
    return false;
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\Aem.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */