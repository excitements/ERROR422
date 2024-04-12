import java.util.Iterator;
import java.util.Map;

public class sZS extends Pdb {
  private int Qnq;
  
  private Qnq Dne;
  
  private int zGp;
  
  private MqS Dne;
  
  public int FWm;
  
  private final FiG Dne;
  
  private int bzF;
  
  private String Dne = (String)new HuD();
  
  private int aFZ;
  
  private MqS FWm = new qhH(this, "Repair", true, 2);
  
  static MqS Dne(sZS paramsZS) {
    return paramsZS.FWm;
  }
  
  public void Dne(FiG paramFiG) {
    super.Dne(paramFiG);
    if (((Qnq)this.Dne).aFZ == null)
      for (byte b = 0; b < this.FWm.Qnq(); b++) {
        NMq nMq = this.FWm.FWm(b);
        if (nMq != null)
          paramFiG.Dne(nMq); 
      }  
  }
  
  public void bzF() {
    NMq nMq = this.FWm.Dne(0);
    this.FWm = false;
    int i = 0;
    byte b1 = 0;
    byte b2 = 0;
    if (nMq == null) {
      this.Dne.Dne(0, (NMq)null);
      this.FWm = false;
    } else {
      NMq nMq1 = nMq.Dne();
      NMq nMq2 = this.FWm.Dne(1);
      Map<Integer, Integer> map = UYp.Dne(nMq1);
      boolean bool = false;
      int j = b1 + nMq.DyG() + ((nMq2 == null) ? 0 : nMq2.DyG());
      this.zGp = 0;
      if (nMq2 != null) {
        bool = (nMq2.bzF == ((dpS)dEr.Dne).Qnq && dEr.Dne.Dne(nMq2).Dne() > 0) ? true : false;
        if (nMq1.FWm() && dEr.Dne[nMq1.bzF].Dne(nMq, nMq2)) {
          int k = Math.min(nMq1.bzF(), nMq1.aFZ() / 4);
          if (k <= 0) {
            this.Dne.Dne(0, (NMq)null);
            this.FWm = false;
            return;
          } 
          byte b3;
          for (b3 = 0; k > 0 && b3 < nMq2.Dne; b3++) {
            int m = nMq1.bzF() - k;
            nMq1.Dne(m);
            i += Math.max(1, k / 100) + map.size();
            k = Math.min(nMq1.bzF(), nMq1.aFZ() / 4);
          } 
          this.zGp = b3;
        } else {
          if (!bool && (nMq1.bzF != nMq2.bzF || !nMq1.FWm())) {
            this.Dne.Dne(0, (NMq)null);
            this.FWm = false;
            return;
          } 
          if (nMq1.FWm() && !bool) {
            int k = nMq.aFZ() - nMq.bzF();
            int m = nMq2.aFZ() - nMq2.bzF();
            int n = m + nMq1.aFZ() * 12 / 100;
            int i2 = k + n;
            int i1 = nMq1.aFZ() - i2;
            if (i1 < 0)
              i1 = 0; 
            if (i1 < nMq1.Qnq()) {
              nMq1.Dne(i1);
              i += Math.max(1, n / 100);
            } 
          } 
          Map map1 = UYp.Dne(nMq2);
          Iterator<Integer> iterator1 = map1.keySet().iterator();
          while (iterator1.hasNext()) {
            int i1;
            int k = ((Integer)iterator1.next()).intValue();
            String str = ycv.Dne[k];
            int m = map.containsKey(Integer.valueOf(k)) ? ((Integer)map.get(Integer.valueOf(k))).intValue() : 0;
            int n = ((Integer)map1.get(Integer.valueOf(k))).intValue();
            if (m == n) {
              i1 = ++n;
            } else {
              i1 = Math.max(n, m);
            } 
            n = i1;
            int i2 = n - m;
            boolean bool1 = str.Dne(nMq);
            if (((uqg)((FiG)this.Dne).Dne).Qnq || nMq.bzF == ((dpS)dpS.Dne).Qnq)
              bool1 = true; 
            Iterator<Integer> iterator2 = map.keySet().iterator();
            while (iterator2.hasNext()) {
              int i3 = ((Integer)iterator2.next()).intValue();
              if (i3 != k && !str.Dne((ycv)ycv.Dne[i3])) {
                bool1 = false;
                i += i2;
              } 
            } 
            if (bool1) {
              if (n > str.Dne())
                n = str.Dne(); 
              map.put(Integer.valueOf(k), Integer.valueOf(n));
              int i3 = 0;
              switch (str.FWm()) {
                case 1:
                  i3 = 8;
                  break;
                case 2:
                  i3 = 4;
                  break;
                case 5:
                  i3 = 2;
                  break;
                case 10:
                  i3 = 1;
                  break;
              } 
              if (bool)
                i3 = Math.max(1, i3 / 2); 
              i += i3 * i2;
            } 
          } 
        } 
      } 
      if (this.Dne != null && this.Dne.length() > 0 && !this.Dne.equalsIgnoreCase(this.Dne.Dne().FWm(nMq.Dne())) && !this.Dne.equals(nMq.FWm())) {
        b2 = nMq.FWm() ? 7 : (nMq.Dne * 5);
        i += b2;
        if (nMq.zGp())
          j += b2 / 2; 
        nMq1.Dne(this.Dne);
      } 
      byte b = 0;
      Iterator<Integer> iterator = map.keySet().iterator();
      while (iterator.hasNext()) {
        int k = ((Integer)iterator.next()).intValue();
        String str = ycv.Dne[k];
        int m = ((Integer)map.get(Integer.valueOf(k))).intValue();
        int n = 0;
        b++;
        switch (str.FWm()) {
          case 1:
            n = 8;
            break;
          case 2:
            n = 4;
            break;
          case 5:
            n = 2;
            break;
          case 10:
            n = 1;
            break;
        } 
        if (bool)
          n = Math.max(1, n / 2); 
        j += b + m * n;
      } 
      if (bool)
        j = Math.max(1, j / 2); 
      this.FWm = j + i;
      if (i <= 0)
        nMq1 = null; 
      if (b2 == i && b2 > 0 && this.FWm >= 40) {
        this.Dne.Dne().Dne("Naming an item only, cost too high; giving discount to cap cost to 39 levels");
        this.FWm = 39;
      } 
      if (this.FWm >= 40 && !((uqg)((FiG)this.Dne).Dne).Qnq)
        nMq1 = null; 
      if (nMq1 != null) {
        int k = nMq1.DyG();
        if (nMq2 != null && k < nMq2.DyG())
          k = nMq2.DyG(); 
        if (nMq1.zGp())
          k -= 9; 
        if (k < 0)
          k = 0; 
        k += 2;
        nMq1.FWm(k);
        UYp.Dne(map, nMq1);
      } 
      this.Dne.Dne(0, nMq1);
      Dne();
    } 
  }
  
  public void Dne(int paramInt1, int paramInt2) {
    if (paramInt1 == 0)
      this.FWm = paramInt2; 
  }
  
  public sZS(MOS paramMOS, Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3, FiG paramFiG) {
    this.FWm = false;
    this.zGp = 0;
    this.Dne = (String)paramQnq;
    this.bzF = paramInt1;
    this.Qnq = paramInt2;
    this.aFZ = paramInt3;
    this.Dne = (String)paramFiG;
    Dne(new onZ(this.FWm, 0, 27, 47));
    Dne(new onZ(this.FWm, 1, 76, 47));
    Dne(new HSg(this, (MqS)this.Dne, 2, 134, 47, paramQnq, paramInt1, paramInt2, paramInt3));
    byte b;
    for (b = 0; b < 3; b++) {
      for (byte b1 = 0; b1 < 9; b1++)
        Dne(new onZ(paramMOS, b1 + b * 9 + 9, 8 + b1 * 18, 84 + b * 18)); 
    } 
    for (b = 0; b < 9; b++)
      Dne(new onZ(paramMOS, b, 8 + b * 18, 142)); 
  }
  
  public void Dne(String paramString) {
    this.Dne = paramString;
    if (Dne(2).Dne())
      Dne(2).Dne().Dne(this.Dne); 
    bzF();
  }
  
  static int Dne(sZS paramsZS) {
    return paramsZS.zGp;
  }
  
  public boolean Dne(FiG paramFiG) {
    return (this.Dne.Dne(this.bzF, this.Qnq, this.aFZ) != zKP.etZ.FWm) ? false : ((paramFiG.Dne(this.bzF + 0.5D, this.Qnq + 0.5D, this.aFZ + 0.5D) <= 64.0D));
  }
  
  public void Dne(mXX parammXX) {
    super.Dne(parammXX);
    parammXX.Dne(this, 0, this.FWm);
  }
  
  public NMq Dne(FiG paramFiG, int paramInt) {
    // Byte code:
    //   0: aconst_null
    //   1: astore_3
    //   2: aload_0
    //   3: getfield bzF : Ljava/util/List;
    //   6: iload_2
    //   7: invokeinterface get : (I)Ljava/lang/Object;
    //   12: checkcast onZ
    //   15: astore #4
    //   17: aload #4
    //   19: ifnull -> 170
    //   22: aload #4
    //   24: invokevirtual Dne : ()Z
    //   27: ifeq -> 170
    //   30: aload #4
    //   32: invokevirtual Dne : ()LNMq;
    //   35: astore #5
    //   37: aload #5
    //   39: invokevirtual Dne : ()LNMq;
    //   42: astore_3
    //   43: iload_2
    //   44: iconst_2
    //   45: if_icmpne -> 74
    //   48: aload_0
    //   49: aload #5
    //   51: iconst_3
    //   52: bipush #39
    //   54: iconst_1
    //   55: invokevirtual Dne : (LNMq;IIZ)Z
    //   58: ifne -> 63
    //   61: aconst_null
    //   62: areturn
    //   63: aload #4
    //   65: aload #5
    //   67: aload_3
    //   68: invokevirtual Dne : (LNMq;LNMq;)V
    //   71: goto -> 123
    //   74: iload_2
    //   75: ifeq -> 108
    //   78: iload_2
    //   79: iconst_1
    //   80: if_icmpeq -> 108
    //   83: iload_2
    //   84: iconst_3
    //   85: if_icmplt -> 123
    //   88: iload_2
    //   89: bipush #39
    //   91: if_icmpge -> 123
    //   94: aload_0
    //   95: aload #5
    //   97: iconst_0
    //   98: iconst_2
    //   99: iconst_0
    //   100: invokevirtual Dne : (LNMq;IIZ)Z
    //   103: ifne -> 123
    //   106: aconst_null
    //   107: areturn
    //   108: aload_0
    //   109: aload #5
    //   111: iconst_3
    //   112: bipush #39
    //   114: iconst_0
    //   115: invokevirtual Dne : (LNMq;IIZ)Z
    //   118: ifne -> 123
    //   121: aconst_null
    //   122: areturn
    //   123: aload #5
    //   125: getfield Dne : I
    //   128: ifne -> 143
    //   131: aload #4
    //   133: aconst_null
    //   134: checkcast NMq
    //   137: invokevirtual Dne : (LNMq;)V
    //   140: goto -> 148
    //   143: aload #4
    //   145: invokevirtual Dne : ()V
    //   148: aload #5
    //   150: getfield Dne : I
    //   153: aload_3
    //   154: getfield Dne : I
    //   157: if_icmpne -> 162
    //   160: aconst_null
    //   161: areturn
    //   162: aload #4
    //   164: aload_1
    //   165: aload #5
    //   167: invokevirtual Dne : (LFiG;LNMq;)V
    //   170: aload_3
    //   171: areturn
  }
  
  public void Dne(MqS paramMqS) {
    super.Dne(paramMqS);
    if (paramMqS == this.FWm)
      bzF(); 
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\sZS.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */