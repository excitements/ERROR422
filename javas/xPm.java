import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.List;

public class xPm implements gDn {
  private float zGp;
  
  private List FWm;
  
  private int aFZ;
  
  protected int Dne;
  
  private float FWm;
  
  private final String Dne;
  
  private float Dne;
  
  protected int Qnq;
  
  private float bzF;
  
  protected int FWm;
  
  protected int bzF = 0;
  
  private float aFZ;
  
  private int zGp;
  
  protected boolean Dne;
  
  protected List Dne;
  
  private float Qnq = false;
  
  protected dmo Dne;
  
  public void Dne(xPm paramxPm) {
    Dne(paramxPm.Dne, (List)paramxPm.Dne, paramxPm.Dne, paramxPm.FWm, paramxPm.aFZ, paramxPm.zGp, paramxPm.Dne);
  }
  
  public float Qnq() {
    return this.Qnq;
  }
  
  public void Dne(BufferedReader paramBufferedReader) {
    ArrayList<INq> arrayList = new ArrayList();
    try {
      for (String str = paramBufferedReader.readLine(); str != null; str = paramBufferedReader.readLine()) {
        str = str.trim();
        if (str.length() > 0) {
          String[] arrayOfString1 = str.split(",");
          String[] arrayOfString2 = arrayOfString1;
          int i = arrayOfString1.length;
          for (byte b = 0; b < i; b++) {
            String str1 = arrayOfString2[b];
            int j = str1.indexOf('*');
            if (j > 0) {
              Integer integer1 = new Integer(str1.substring(0, j));
              Integer integer2 = new Integer(str1.substring(j + 1));
              arrayList.add(new INq(integer1, integer2));
            } else {
              arrayList.add(new INq(new Integer(str1), Integer.valueOf(1)));
            } 
          } 
        } 
      } 
    } catch (Exception exception) {
      System.err.println("Failed to read animation info for " + this.Dne + ": " + exception.getMessage());
    } 
    if (!arrayList.isEmpty() && arrayList.size() < 600)
      this.FWm = arrayList; 
  }
  
  public int Qnq() {
    return this.Dne.Qnq();
  }
  
  public int bzF() {
    return this.Dne.bzF();
  }
  
  public void Dne(dmo paramdmo, List paramList, int paramInt1, int paramInt2, int paramInt3, int paramInt4, boolean paramBoolean) {
    this.Dne = paramdmo;
    this.Dne = (dmo)paramList;
    this.Dne = paramInt1;
    this.FWm = paramInt2;
    this.aFZ = paramInt3;
    this.zGp = paramInt4;
    this.Dne = paramBoolean;
    float f1 = 0.01F / paramdmo.bzF();
    float f2 = 0.01F / paramdmo.Qnq();
    this.Dne = paramInt1 / paramdmo.bzF() + f1;
    this.FWm = (paramInt1 + paramInt3) / paramdmo.bzF() - f1;
    this.bzF = paramInt2 / paramdmo.Qnq() + f2;
    this.Qnq = (paramInt2 + paramInt4) / paramdmo.Qnq() - f2;
    this.aFZ = paramInt3 / 16.0F;
    this.zGp = paramInt4 / 16.0F;
  }
  
  public void Dne() {
    // Byte code:
    //   0: aload_0
    //   1: getfield FWm : Ljava/util/List;
    //   4: ifnull -> 168
    //   7: aload_0
    //   8: getfield FWm : Ljava/util/List;
    //   11: aload_0
    //   12: getfield bzF : I
    //   15: invokeinterface get : (I)Ljava/lang/Object;
    //   20: checkcast INq
    //   23: astore_1
    //   24: aload_0
    //   25: dup
    //   26: getfield Qnq : I
    //   29: iconst_1
    //   30: iadd
    //   31: putfield Qnq : I
    //   34: aload_0
    //   35: getfield Qnq : I
    //   38: aload_1
    //   39: invokevirtual FWm : ()Ljava/lang/Object;
    //   42: checkcast java/lang/Integer
    //   45: invokevirtual intValue : ()I
    //   48: if_icmplt -> 165
    //   51: aload_1
    //   52: invokevirtual Dne : ()Ljava/lang/Object;
    //   55: checkcast java/lang/Integer
    //   58: invokevirtual intValue : ()I
    //   61: istore_2
    //   62: aload_0
    //   63: aload_0
    //   64: getfield bzF : I
    //   67: iconst_1
    //   68: iadd
    //   69: aload_0
    //   70: getfield FWm : Ljava/util/List;
    //   73: invokeinterface size : ()I
    //   78: irem
    //   79: putfield bzF : I
    //   82: aload_0
    //   83: iconst_0
    //   84: putfield Qnq : I
    //   87: aload_0
    //   88: getfield FWm : Ljava/util/List;
    //   91: aload_0
    //   92: getfield bzF : I
    //   95: invokeinterface get : (I)Ljava/lang/Object;
    //   100: checkcast INq
    //   103: astore_1
    //   104: aload_1
    //   105: invokevirtual Dne : ()Ljava/lang/Object;
    //   108: checkcast java/lang/Integer
    //   111: invokevirtual intValue : ()I
    //   114: istore_3
    //   115: iload_2
    //   116: iload_3
    //   117: if_icmpeq -> 165
    //   120: iload_3
    //   121: iflt -> 165
    //   124: iload_3
    //   125: aload_0
    //   126: getfield Dne : Ljava/util/List;
    //   129: invokeinterface size : ()I
    //   134: if_icmpge -> 165
    //   137: aload_0
    //   138: getfield Dne : Ldmo;
    //   141: aload_0
    //   142: getfield Dne : I
    //   145: aload_0
    //   146: getfield FWm : I
    //   149: aload_0
    //   150: getfield Dne : Ljava/util/List;
    //   153: iload_3
    //   154: invokeinterface get : (I)Ljava/lang/Object;
    //   159: checkcast dmo
    //   162: invokevirtual Dne : (IILdmo;)V
    //   165: goto -> 232
    //   168: aload_0
    //   169: getfield bzF : I
    //   172: istore_1
    //   173: aload_0
    //   174: aload_0
    //   175: getfield bzF : I
    //   178: iconst_1
    //   179: iadd
    //   180: aload_0
    //   181: getfield Dne : Ljava/util/List;
    //   184: invokeinterface size : ()I
    //   189: irem
    //   190: putfield bzF : I
    //   193: iload_1
    //   194: aload_0
    //   195: getfield bzF : I
    //   198: if_icmpeq -> 232
    //   201: aload_0
    //   202: getfield Dne : Ldmo;
    //   205: aload_0
    //   206: getfield Dne : I
    //   209: aload_0
    //   210: getfield FWm : I
    //   213: aload_0
    //   214: getfield Dne : Ljava/util/List;
    //   217: aload_0
    //   218: getfield bzF : I
    //   221: invokeinterface get : (I)Ljava/lang/Object;
    //   226: checkcast dmo
    //   229: invokevirtual Dne : (IILdmo;)V
    //   232: return
  }
  
  public int Dne() {
    return this.Dne;
  }
  
  public String Dne() {
    return (String)this.Dne;
  }
  
  public int FWm() {
    return this.FWm;
  }
  
  public float FWm() {
    return this.FWm;
  }
  
  public float FWm(double paramDouble) {
    float f = this.Qnq - this.bzF;
    return this.bzF + f * (float)paramDouble / 16.0F;
  }
  
  public static xPm Dne(String paramString) {
    return "clock".equals(paramString) ? new KTL() : ("compass".equals(paramString) ? new qjt() : new xPm(paramString));
  }
  
  public float Dne(double paramDouble) {
    float f = this.FWm - this.Dne;
    return this.Dne + f * (float)paramDouble / 16.0F;
  }
  
  public float Dne() {
    return this.Dne;
  }
  
  protected xPm(String paramString) {
    this.Dne = (dmo)paramString;
  }
  
  public float bzF() {
    return this.bzF;
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\xPm.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */