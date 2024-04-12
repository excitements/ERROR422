import java.util.List;

public class JcN {
  private final int Dne;
  
  public static final JcN IjH;
  
  public static final JcN Qnq;
  
  public static final JcN mrb;
  
  public static final JcN FWm;
  
  public static final JcN Dne;
  
  public static final JcN zGp;
  
  public static final JcN[] Dne = new JcN[12];
  
  public static final JcN div;
  
  private String FWm;
  
  private final String Dne;
  
  public static final JcN Zpi;
  
  public static final JcN XHL;
  
  public static final JcN aFZ;
  
  public static final JcN DyG;
  
  private boolean Dne = true;
  
  private boolean FWm = "list_items.png";
  
  public static final JcN bzF;
  
  public boolean FWm() {
    return this.Dne;
  }
  
  public JcN Dne(String paramString) {
    this.FWm = paramString;
    return this;
  }
  
  public int FWm() {
    return 1;
  }
  
  public dEr Dne() {
    return dEr.Dne[FWm()];
  }
  
  public boolean Dne() {
    return this.FWm;
  }
  
  public String bzF() {
    return this.FWm;
  }
  
  public JcN Dne() {
    this.FWm = false;
    return this;
  }
  
  public JcN FWm() {
    this.Dne = false;
    return this;
  }
  
  public JcN(int paramInt, String paramString) {
    this.FWm = true;
    this.Dne = paramInt;
    this.Dne = paramString;
    Dne[paramInt] = this;
  }
  
  public int bzF() {
    return this.Dne % 6;
  }
  
  public boolean bzF() {
    return (this.Dne < 6);
  }
  
  public void Dne(List paramList) {
    // Byte code:
    //   0: getstatic dEr.Dne : [LdEr;
    //   3: astore_2
    //   4: aload_2
    //   5: arraylength
    //   6: istore_3
    //   7: iconst_0
    //   8: istore #4
    //   10: iload #4
    //   12: iload_3
    //   13: if_icmpge -> 54
    //   16: aload_2
    //   17: iload #4
    //   19: aaload
    //   20: astore #5
    //   22: aload #5
    //   24: ifnull -> 48
    //   27: aload #5
    //   29: invokevirtual Dne : ()LJcN;
    //   32: aload_0
    //   33: if_acmpne -> 48
    //   36: aload #5
    //   38: aload #5
    //   40: getfield Qnq : I
    //   43: aload_0
    //   44: aload_1
    //   45: invokevirtual Dne : (ILJcN;Ljava/util/List;)V
    //   48: iinc #4, 1
    //   51: goto -> 10
    //   54: return
  }
  
  public String Dne() {
    return this.Dne;
  }
  
  public String FWm() {
    return irb.Dne().Dne("itemGroup." + Dne());
  }
  
  public void Dne(List<NMq> paramList, ACj... paramVarArgs) {
    // Byte code:
    //   0: getstatic ycv.Dne : [Lycv;
    //   3: astore_3
    //   4: aload_3
    //   5: arraylength
    //   6: istore #4
    //   8: iconst_0
    //   9: istore #5
    //   11: iload #5
    //   13: iload #4
    //   15: if_icmpge -> 114
    //   18: aload_3
    //   19: iload #5
    //   21: aaload
    //   22: astore #6
    //   24: aload #6
    //   26: ifnull -> 108
    //   29: aload #6
    //   31: getfield Dne : LACj;
    //   34: ifnull -> 108
    //   37: iconst_0
    //   38: istore #7
    //   40: iconst_0
    //   41: istore #8
    //   43: iload #8
    //   45: aload_2
    //   46: arraylength
    //   47: if_icmpge -> 76
    //   50: iload #7
    //   52: ifne -> 76
    //   55: aload #6
    //   57: getfield Dne : LACj;
    //   60: aload_2
    //   61: iload #8
    //   63: aaload
    //   64: if_acmpne -> 70
    //   67: iconst_1
    //   68: istore #7
    //   70: iinc #8, 1
    //   73: goto -> 43
    //   76: iload #7
    //   78: ifeq -> 108
    //   81: aload_1
    //   82: getstatic dEr.Dne : LdpS;
    //   85: new RmG
    //   88: dup
    //   89: aload #6
    //   91: aload #6
    //   93: invokevirtual Dne : ()I
    //   96: invokespecial <init> : (Lycv;I)V
    //   99: invokevirtual Dne : (LRmG;)LNMq;
    //   102: invokeinterface add : (Ljava/lang/Object;)Z
    //   107: pop
    //   108: iinc #5, 1
    //   111: goto -> 11
    //   114: return
  }
  
  static {
    Dne = new nbD(0, "buildingBlocks");
    FWm = new MqY(1, "decorations");
    bzF = new tWP(2, "redstone");
    Qnq = new HgA(3, "transportation");
    aFZ = new aqs(4, "misc");
    zGp = (new BfU(5, "search")).Dne("search.png");
    DyG = new ILr(6, "food");
    div = new Fyz(7, "tools");
    IjH = new AWi(8, "combat");
    mrb = new Bnv(9, "brewing");
    XHL = new SUE(10, "materials");
    Zpi = (new jnv(11, "inventory")).Dne("survival_inv.png").FWm().Dne();
  }
  
  public int Dne() {
    return this.Dne;
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\JcN.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */