import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class sly implements ZfC {
  private gvF Dne;
  
  private final boolean Dne;
  
  private final List Dne;
  
  private gvF FWm;
  
  private final byte[] Dne;
  
  private Random Dne;
  
  private final boolean FWm;
  
  private final byte[] FWm = new byte[256];
  
  private final lDk Dne;
  
  private Qnq Dne = (Qnq)new byte[256];
  
  public void Dne(int paramInt1, int paramInt2) {
    for (sAy sAy : this.Dne)
      sAy.Dne(this, this.Dne, paramInt1, paramInt2, (byte[])null); 
  }
  
  public int Dne() {
    return 0;
  }
  
  public boolean FWm() {
    return true;
  }
  
  public boolean Dne(int paramInt1, int paramInt2) {
    return true;
  }
  
  public qMV FWm(int paramInt1, int paramInt2) {
    return Dne(paramInt1, paramInt2);
  }
  
  public EyB Dne(Qnq paramQnq, String paramString, int paramInt1, int paramInt2, int paramInt3) {
    if ("Stronghold".equals(paramString))
      for (sAy sAy : this.Dne) {
        if (sAy instanceof Khi)
          return sAy.Dne(paramQnq, paramInt1, paramInt2, paramInt3); 
      }  
    return null;
  }
  
  public qMV Dne(int paramInt1, int paramInt2) {
    // Byte code:
    //   0: new qMV
    //   3: dup
    //   4: aload_0
    //   5: getfield Dne : LQnq;
    //   8: iload_1
    //   9: iload_2
    //   10: invokespecial <init> : (LQnq;II)V
    //   13: astore_3
    //   14: iconst_0
    //   15: istore #4
    //   17: iload #4
    //   19: aload_0
    //   20: getfield Dne : [B
    //   23: arraylength
    //   24: if_icmpge -> 169
    //   27: iload #4
    //   29: iconst_4
    //   30: ishr
    //   31: istore #5
    //   33: aload_3
    //   34: invokevirtual Dne : ()[LcHy;
    //   37: iload #5
    //   39: aaload
    //   40: astore #6
    //   42: aload #6
    //   44: ifnonnull -> 85
    //   47: new cHy
    //   50: dup
    //   51: iload #4
    //   53: aload_0
    //   54: getfield Dne : LQnq;
    //   57: getfield Dne : LJik;
    //   60: getfield FWm : Z
    //   63: ifne -> 70
    //   66: iconst_1
    //   67: goto -> 71
    //   70: iconst_0
    //   71: invokespecial <init> : (IZ)V
    //   74: astore #6
    //   76: aload_3
    //   77: invokevirtual Dne : ()[LcHy;
    //   80: iload #5
    //   82: aload #6
    //   84: aastore
    //   85: iconst_0
    //   86: istore #7
    //   88: iload #7
    //   90: bipush #16
    //   92: if_icmpge -> 163
    //   95: iconst_0
    //   96: istore #8
    //   98: iload #8
    //   100: bipush #16
    //   102: if_icmpge -> 157
    //   105: aload #6
    //   107: iload #7
    //   109: iload #4
    //   111: bipush #15
    //   113: iand
    //   114: iload #8
    //   116: aload_0
    //   117: getfield Dne : [B
    //   120: iload #4
    //   122: baload
    //   123: sipush #255
    //   126: iand
    //   127: invokevirtual Dne : (IIII)V
    //   130: aload #6
    //   132: iload #7
    //   134: iload #4
    //   136: bipush #15
    //   138: iand
    //   139: iload #8
    //   141: aload_0
    //   142: getfield FWm : [B
    //   145: iload #4
    //   147: baload
    //   148: invokevirtual FWm : (IIII)V
    //   151: iinc #8, 1
    //   154: goto -> 98
    //   157: iinc #7, 1
    //   160: goto -> 88
    //   163: iinc #4, 1
    //   166: goto -> 17
    //   169: aload_3
    //   170: invokevirtual FWm : ()V
    //   173: aload_0
    //   174: getfield Dne : LQnq;
    //   177: invokevirtual Dne : ()Ltgc;
    //   180: aconst_null
    //   181: checkcast [LOdI;
    //   184: iload_1
    //   185: bipush #16
    //   187: imul
    //   188: iload_2
    //   189: bipush #16
    //   191: imul
    //   192: bipush #16
    //   194: bipush #16
    //   196: invokevirtual FWm : ([LOdI;IIII)[LOdI;
    //   199: astore #4
    //   201: aload_3
    //   202: invokevirtual Dne : ()[B
    //   205: astore #5
    //   207: iconst_0
    //   208: istore #6
    //   210: iload #6
    //   212: aload #5
    //   214: arraylength
    //   215: if_icmpge -> 238
    //   218: aload #5
    //   220: iload #6
    //   222: aload #4
    //   224: iload #6
    //   226: aaload
    //   227: getfield Qnq : I
    //   230: i2b
    //   231: bastore
    //   232: iinc #6, 1
    //   235: goto -> 210
    //   238: aload_0
    //   239: getfield Dne : Ljava/util/List;
    //   242: invokeinterface iterator : ()Ljava/util/Iterator;
    //   247: astore #6
    //   249: aload #6
    //   251: invokeinterface hasNext : ()Z
    //   256: ifeq -> 290
    //   259: aload #6
    //   261: invokeinterface next : ()Ljava/lang/Object;
    //   266: checkcast sAy
    //   269: astore #7
    //   271: aload #7
    //   273: aload_0
    //   274: aload_0
    //   275: getfield Dne : LQnq;
    //   278: iload_1
    //   279: iload_2
    //   280: aconst_null
    //   281: checkcast [B
    //   284: invokevirtual Dne : (LZfC;LQnq;II[B)V
    //   287: goto -> 249
    //   290: aload_3
    //   291: invokevirtual FWm : ()V
    //   294: aload_3
    //   295: areturn
  }
  
  public sly(Qnq paramQnq, long paramLong, boolean paramBoolean, String paramString) {
    this.Dne = (Qnq)new ArrayList();
    this.Dne = paramQnq;
    this.Dne = (Qnq)new Random(paramLong);
    this.Dne = (Qnq)lDk.Dne(paramString);
    if (paramBoolean) {
      Map map = this.Dne.Dne();
      if (map.containsKey("village")) {
        Map<String, String> map1 = (Map)map.get("village");
        if (!map1.containsKey("size"))
          map1.put("size", "1"); 
        this.Dne.add(new cXw(map1));
      } 
      if (map.containsKey("biome_1"))
        this.Dne.add(new tMg((Map)map.get("biome_1"))); 
      if (map.containsKey("mineshaft"))
        this.Dne.add(new Kvh((Map)map.get("mineshaft"))); 
      if (map.containsKey("stronghold"))
        this.Dne.add(new Khi((Map)map.get("stronghold"))); 
    } 
    this.Dne = this.Dne.Dne().containsKey("decoration");
    if (this.Dne.Dne().containsKey("lake"))
      this.Dne = (Qnq)new gvF(((zKP)zKP.DyG).FWm); 
    if (this.Dne.Dne().containsKey("lava_lake"))
      this.FWm = (byte[])new gvF(((zKP)zKP.div).FWm); 
    this.FWm = this.Dne.Dne().containsKey("dungeon");
    for (Jjb jjb : this.Dne.Dne()) {
      for (int i = jjb.Qnq(); i < jjb.Qnq() + jjb.Dne(); i++) {
        this.Dne[i] = (byte)(jjb.FWm() & 0xFF);
        this.FWm[i] = (byte)jjb.bzF();
      } 
    } 
  }
  
  public List Dne(Icc paramIcc, int paramInt1, int paramInt2, int paramInt3) {
    OdI odI = this.Dne.Dne(paramInt1, paramInt3);
    return (odI == null) ? null : odI.Dne(paramIcc);
  }
  
  public boolean Dne(boolean paramBoolean, TaY paramTaY) {
    return true;
  }
  
  public void Dne(ZfC paramZfC, int paramInt1, int paramInt2) {
    int i = paramInt1 * 16;
    int j = paramInt2 * 16;
    OdI odI = this.Dne.Dne(i + 16, j + 16);
    boolean bool = false;
    this.Dne.setSeed(this.Dne.Dne());
    long l1 = this.Dne.nextLong() / 2L * 2L + 1L;
    long l2 = this.Dne.nextLong() / 2L * 2L + 1L;
    this.Dne.setSeed(paramInt1 * l1 + paramInt2 * l2 ^ this.Dne.Dne());
    for (sAy sAy : this.Dne) {
      boolean bool1 = sAy.Dne(this.Dne, (Random)this.Dne, paramInt1, paramInt2);
      if (sAy instanceof cXw)
        bool |= bool1; 
    } 
    if (this.Dne != null && !bool && this.Dne.nextInt(4) == 0) {
      int k = i + this.Dne.nextInt(16) + 8;
      int m = this.Dne.nextInt(128);
      int n = j + this.Dne.nextInt(16) + 8;
      this.Dne.Dne(this.Dne, (Random)this.Dne, k, m, n);
    } 
    if (this.FWm != null && !bool && this.Dne.nextInt(8) == 0) {
      int k = i + this.Dne.nextInt(16) + 8;
      int m = this.Dne.nextInt(this.Dne.nextInt(120) + 8);
      int n = j + this.Dne.nextInt(16) + 8;
      if (m < 63 || this.Dne.nextInt(10) == 0)
        this.FWm.Dne(this.Dne, (Random)this.Dne, k, m, n); 
    } 
    if (this.FWm != null)
      for (byte b = 0; b < 8; b++) {
        int k = i + this.Dne.nextInt(16) + 8;
        int m = this.Dne.nextInt(128);
        int n = j + this.Dne.nextInt(16) + 8;
        (new ivB()).Dne(this.Dne, (Random)this.Dne, k, m, n);
      }  
    if (this.Dne != null)
      odI.Dne(this.Dne, (Random)this.Dne, i, j); 
  }
  
  public boolean Dne() {
    return false;
  }
  
  public void Dne() {}
  
  public String Dne() {
    return "FlatLevelSource";
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\sly.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */