import java.util.List;
import java.util.Random;

public class hLS extends dNT {
  private gDn Dne;
  
  public static final String[] Dne = new String[] { "stone", "sand", "wood", "cobble", "brick", "smoothStoneBrick", "netherBrick", "quartz" };
  
  public hLS(int paramInt, boolean paramBoolean) {
    super(paramInt, paramBoolean, KFd.aFZ);
    Dne(JcN.Dne);
  }
  
  public gDn Dne(int paramInt1, int paramInt2) {
    // Byte code:
    //   0: iload_2
    //   1: bipush #7
    //   3: iand
    //   4: istore_3
    //   5: aload_0
    //   6: getfield Dne : Z
    //   9: ifeq -> 21
    //   12: iload_2
    //   13: bipush #8
    //   15: iand
    //   16: ifeq -> 21
    //   19: iconst_1
    //   20: istore_1
    //   21: iload_3
    //   22: ifne -> 48
    //   25: iload_1
    //   26: iconst_1
    //   27: if_icmpeq -> 41
    //   30: iload_1
    //   31: ifeq -> 41
    //   34: aload_0
    //   35: getfield Dne : LgDn;
    //   38: goto -> 160
    //   41: aload_0
    //   42: getfield Qnq : LgDn;
    //   45: goto -> 160
    //   48: iload_3
    //   49: iconst_1
    //   50: if_icmpne -> 63
    //   53: getstatic zKP.ceE : LzKP;
    //   56: iload_1
    //   57: invokevirtual FWm : (I)LgDn;
    //   60: goto -> 160
    //   63: iload_3
    //   64: iconst_2
    //   65: if_icmpne -> 78
    //   68: getstatic zKP.Qnq : LzKP;
    //   71: iload_1
    //   72: invokevirtual FWm : (I)LgDn;
    //   75: goto -> 160
    //   78: iload_3
    //   79: iconst_3
    //   80: if_icmpne -> 93
    //   83: getstatic zKP.bzF : LzKP;
    //   86: iload_1
    //   87: invokevirtual FWm : (I)LgDn;
    //   90: goto -> 160
    //   93: iload_3
    //   94: iconst_4
    //   95: if_icmpne -> 108
    //   98: getstatic zKP.tgc : LzKP;
    //   101: iload_1
    //   102: invokevirtual FWm : (I)LgDn;
    //   105: goto -> 160
    //   108: iload_3
    //   109: iconst_5
    //   110: if_icmpne -> 124
    //   113: getstatic zKP.WvN : LzKP;
    //   116: iload_1
    //   117: iconst_0
    //   118: invokevirtual Dne : (II)LgDn;
    //   121: goto -> 160
    //   124: iload_3
    //   125: bipush #6
    //   127: if_icmpne -> 140
    //   130: getstatic zKP.iNH : LzKP;
    //   133: iconst_1
    //   134: invokevirtual FWm : (I)LgDn;
    //   137: goto -> 160
    //   140: iload_3
    //   141: bipush #7
    //   143: if_icmpne -> 156
    //   146: getstatic zKP.PpL : LzKP;
    //   149: iload_1
    //   150: invokevirtual FWm : (I)LgDn;
    //   153: goto -> 160
    //   156: aload_0
    //   157: getfield Qnq : LgDn;
    //   160: areturn
  }
  
  protected NMq Dne(int paramInt) {
    return new NMq(((dNT)zKP.FWm).FWm, 2, paramInt & 0x7);
  }
  
  public String Dne(int paramInt) {
    if (paramInt < 0 || paramInt >= Dne.length)
      paramInt = 0; 
    return bzF() + "." + Dne[paramInt];
  }
  
  public int Dne(int paramInt1, Random paramRandom, int paramInt2) {
    return ((dNT)zKP.FWm).FWm;
  }
  
  public void Dne(Rbp paramRbp) {
    this.Qnq = paramRbp.Dne("stoneslab_top");
    this.Dne = (String[])paramRbp.Dne("stoneslab_side");
  }
  
  public void Dne(int paramInt, JcN paramJcN, List<NMq> paramList) {
    if (paramInt != zKP.Dne.FWm)
      for (byte b = 0; b <= 7; b++) {
        if (b != 2)
          paramList.add(new NMq(paramInt, 1, b)); 
      }  
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\hLS.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */