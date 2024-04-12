import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Ilk extends vWZ {
  public byte Dne;
  
  public byte FWm;
  
  private Map FWm;
  
  public int Dne;
  
  public List Dne;
  
  public Map Dne;
  
  public int FWm;
  
  public byte[] Dne = new byte[16384];
  
  public void Dne(int paramInt1, int paramInt2, int paramInt3) {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial Dne : ()V
    //   4: iconst_0
    //   5: istore #4
    //   7: iload #4
    //   9: aload_0
    //   10: getfield Dne : Ljava/util/List;
    //   13: invokeinterface size : ()I
    //   18: if_icmpge -> 101
    //   21: aload_0
    //   22: getfield Dne : Ljava/util/List;
    //   25: iload #4
    //   27: invokeinterface get : (I)Ljava/lang/Object;
    //   32: checkcast nJg
    //   35: astore #5
    //   37: aload #5
    //   39: getfield Dne : [I
    //   42: iload_1
    //   43: iaload
    //   44: iflt -> 58
    //   47: aload #5
    //   49: getfield Dne : [I
    //   52: iload_1
    //   53: iaload
    //   54: iload_2
    //   55: if_icmple -> 66
    //   58: aload #5
    //   60: getfield Dne : [I
    //   63: iload_1
    //   64: iload_2
    //   65: iastore
    //   66: aload #5
    //   68: getfield FWm : [I
    //   71: iload_1
    //   72: iaload
    //   73: iflt -> 87
    //   76: aload #5
    //   78: getfield FWm : [I
    //   81: iload_1
    //   82: iaload
    //   83: iload_3
    //   84: if_icmpge -> 95
    //   87: aload #5
    //   89: getfield FWm : [I
    //   92: iload_1
    //   93: iload_3
    //   94: iastore
    //   95: iinc #4, 1
    //   98: goto -> 7
    //   101: return
  }
  
  public nJg Dne(FiG paramFiG) {
    // Byte code:
    //   0: aload_0
    //   1: getfield FWm : Ljava/util/Map;
    //   4: aload_1
    //   5: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   10: checkcast nJg
    //   13: astore_2
    //   14: aload_2
    //   15: ifnonnull -> 51
    //   18: new nJg
    //   21: dup
    //   22: aload_0
    //   23: aload_1
    //   24: invokespecial <init> : (LIlk;LFiG;)V
    //   27: astore_2
    //   28: aload_0
    //   29: getfield FWm : Ljava/util/Map;
    //   32: aload_1
    //   33: aload_2
    //   34: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   39: pop
    //   40: aload_0
    //   41: getfield Dne : Ljava/util/List;
    //   44: aload_2
    //   45: invokeinterface add : (Ljava/lang/Object;)Z
    //   50: pop
    //   51: aload_2
    //   52: areturn
  }
  
  public void Dne(byte[] paramArrayOfbyte) {
    if (paramArrayOfbyte[0] == 0) {
      int i = paramArrayOfbyte[1] & 0xFF;
      int j = paramArrayOfbyte[2] & 0xFF;
      for (byte b = 0; b < paramArrayOfbyte.length - 3; b++)
        this.Dne[(b + j) * 128 + i] = paramArrayOfbyte[b + 3]; 
      Dne();
    } else if (paramArrayOfbyte[0] == 1) {
      this.Dne.clear();
      for (byte b = 0; b < (paramArrayOfbyte.length - 1) / 3; b++) {
        byte b1 = (byte)(paramArrayOfbyte[b * 3 + 1] >> 4);
        byte b2 = paramArrayOfbyte[b * 3 + 2];
        byte b3 = paramArrayOfbyte[b * 3 + 3];
        byte b4 = (byte)(paramArrayOfbyte[b * 3 + 1] & 0xF);
        this.Dne.put("icon-" + b, new GHe(this, b1, b2, b3, b4));
      } 
    } else if (paramArrayOfbyte[0] == 2) {
      this.FWm = paramArrayOfbyte[1];
    } 
  }
  
  public void Dne(WkD paramWkD) {
    this.Dne = paramWkD.Dne("dimension");
    this.Dne = paramWkD.Dne("xCenter");
    this.FWm = paramWkD.Dne("zCenter");
    this.FWm = paramWkD.Dne("scale");
    if (this.FWm < 0)
      this.FWm = 0; 
    if (this.FWm > 4)
      this.FWm = 4; 
    short s1 = paramWkD.Dne("width");
    short s2 = paramWkD.Dne("height");
    if (s1 == 128 && s2 == 128) {
      this.Dne = paramWkD.Dne("colors");
    } else {
      byte[] arrayOfByte = paramWkD.Dne("colors");
      this.Dne = new byte[16384];
      int i = (128 - s1) / 2;
      int j = (128 - s2) / 2;
      for (byte b = 0; b < s2; b++) {
        int k = b + j;
        if (k >= 0 || k < 128)
          for (byte b1 = 0; b1 < s1; b1++) {
            int m = b1 + i;
            if (m >= 0 || m < 128)
              this.Dne[m + k * 128] = arrayOfByte[b1 + b * s1]; 
          }  
      } 
    } 
  }
  
  public byte[] Dne(NMq paramNMq, Qnq paramQnq, FiG paramFiG) {
    // Byte code:
    //   0: aload_0
    //   1: getfield FWm : Ljava/util/Map;
    //   4: aload_3
    //   5: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   10: checkcast nJg
    //   13: astore #4
    //   15: aload #4
    //   17: ifnonnull -> 24
    //   20: aconst_null
    //   21: goto -> 30
    //   24: aload #4
    //   26: aload_1
    //   27: invokevirtual Dne : (LNMq;)[B
    //   30: areturn
  }
  
  public void Dne(FiG paramFiG, NMq paramNMq) {
    // Byte code:
    //   0: aload_0
    //   1: getfield FWm : Ljava/util/Map;
    //   4: aload_1
    //   5: invokeinterface containsKey : (Ljava/lang/Object;)Z
    //   10: ifne -> 46
    //   13: new nJg
    //   16: dup
    //   17: aload_0
    //   18: aload_1
    //   19: invokespecial <init> : (LIlk;LFiG;)V
    //   22: astore_3
    //   23: aload_0
    //   24: getfield FWm : Ljava/util/Map;
    //   27: aload_1
    //   28: aload_3
    //   29: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   34: pop
    //   35: aload_0
    //   36: getfield Dne : Ljava/util/List;
    //   39: aload_3
    //   40: invokeinterface add : (Ljava/lang/Object;)Z
    //   45: pop
    //   46: aload_1
    //   47: getfield Dne : LMOS;
    //   50: aload_2
    //   51: invokevirtual FWm : (LNMq;)Z
    //   54: ifne -> 71
    //   57: aload_0
    //   58: getfield Dne : Ljava/util/Map;
    //   61: aload_1
    //   62: invokevirtual a_ : ()Ljava/lang/String;
    //   65: invokeinterface remove : (Ljava/lang/Object;)Ljava/lang/Object;
    //   70: pop
    //   71: iconst_0
    //   72: istore_3
    //   73: iload_3
    //   74: aload_0
    //   75: getfield Dne : Ljava/util/List;
    //   78: invokeinterface size : ()I
    //   83: if_icmpge -> 238
    //   86: aload_0
    //   87: getfield Dne : Ljava/util/List;
    //   90: iload_3
    //   91: invokeinterface get : (I)Ljava/lang/Object;
    //   96: checkcast nJg
    //   99: astore #4
    //   101: aload #4
    //   103: getfield Dne : LFiG;
    //   106: getfield Zpi : Z
    //   109: ifne -> 205
    //   112: aload #4
    //   114: getfield Dne : LFiG;
    //   117: getfield Dne : LMOS;
    //   120: aload_2
    //   121: invokevirtual FWm : (LNMq;)Z
    //   124: ifne -> 134
    //   127: aload_2
    //   128: invokevirtual XHL : ()Z
    //   131: ifeq -> 205
    //   134: aload_2
    //   135: invokevirtual XHL : ()Z
    //   138: ifne -> 232
    //   141: aload #4
    //   143: getfield Dne : LFiG;
    //   146: getfield qLR : I
    //   149: aload_0
    //   150: getfield Dne : B
    //   153: if_icmpne -> 232
    //   156: aload_0
    //   157: iconst_0
    //   158: aload #4
    //   160: getfield Dne : LFiG;
    //   163: getfield Dne : LQnq;
    //   166: aload #4
    //   168: getfield Dne : LFiG;
    //   171: invokevirtual a_ : ()Ljava/lang/String;
    //   174: aload #4
    //   176: getfield Dne : LFiG;
    //   179: getfield div : D
    //   182: aload #4
    //   184: getfield Dne : LFiG;
    //   187: getfield mrb : D
    //   190: aload #4
    //   192: getfield Dne : LFiG;
    //   195: getfield mrb : F
    //   198: f2d
    //   199: invokespecial Dne : (ILQnq;Ljava/lang/String;DDD)V
    //   202: goto -> 232
    //   205: aload_0
    //   206: getfield FWm : Ljava/util/Map;
    //   209: aload #4
    //   211: getfield Dne : LFiG;
    //   214: invokeinterface remove : (Ljava/lang/Object;)Ljava/lang/Object;
    //   219: pop
    //   220: aload_0
    //   221: getfield Dne : Ljava/util/List;
    //   224: aload #4
    //   226: invokeinterface remove : (Ljava/lang/Object;)Z
    //   231: pop
    //   232: iinc #3, 1
    //   235: goto -> 73
    //   238: aload_2
    //   239: invokevirtual XHL : ()Z
    //   242: ifeq -> 306
    //   245: aload_0
    //   246: iconst_1
    //   247: aload_1
    //   248: getfield Dne : LQnq;
    //   251: new java/lang/StringBuilder
    //   254: dup
    //   255: invokespecial <init> : ()V
    //   258: ldc 'frame-'
    //   260: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   263: aload_2
    //   264: invokevirtual Dne : ()LBPY;
    //   267: getfield aFZ : I
    //   270: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   273: invokevirtual toString : ()Ljava/lang/String;
    //   276: aload_2
    //   277: invokevirtual Dne : ()LBPY;
    //   280: getfield FWm : I
    //   283: i2d
    //   284: aload_2
    //   285: invokevirtual Dne : ()LBPY;
    //   288: getfield Qnq : I
    //   291: i2d
    //   292: aload_2
    //   293: invokevirtual Dne : ()LBPY;
    //   296: getfield Dne : I
    //   299: bipush #90
    //   301: imul
    //   302: i2d
    //   303: invokespecial Dne : (ILQnq;Ljava/lang/String;DDD)V
    //   306: return
  }
  
  public Ilk(String paramString) {
    super(paramString);
    this.Dne = (byte[])new ArrayList();
    this.FWm = new HashMap<>();
    this.Dne = (byte[])new LinkedHashMap<>();
  }
  
  public void FWm(WkD paramWkD) {
    paramWkD.Dne("dimension", this.Dne);
    paramWkD.Dne("xCenter", this.Dne);
    paramWkD.Dne("zCenter", this.FWm);
    paramWkD.Dne("scale", this.FWm);
    paramWkD.Dne("width", (short)128);
    paramWkD.Dne("height", (short)128);
    paramWkD.Dne("colors", this.Dne);
  }
  
  private void Dne(int paramInt, Qnq paramQnq, String paramString, double paramDouble1, double paramDouble2, double paramDouble3) {
    boolean bool;
    int i = 1 << this.FWm;
    float f1 = (float)(paramDouble1 - this.Dne) / i;
    float f2 = (float)(paramDouble2 - this.FWm) / i;
    byte b1 = (byte)(int)((f1 * 2.0F) + 0.5D);
    byte b2 = (byte)(int)((f2 * 2.0F) + 0.5D);
    byte b = 63;
    if (f1 >= -b && f2 >= -b && f1 <= b && f2 <= b) {
      paramDouble3 += (paramDouble3 < 0.0D) ? -8.0D : 8.0D;
      bool = (byte)(int)(paramDouble3 * 16.0D / 360.0D);
      if (this.Dne < null) {
        int j = (int)(paramQnq.Dne().bzF() / 10L);
        bool = (byte)(j * j * 34187121 + j * 121 >> 15 & 0xF);
      } 
    } else {
      if (Math.abs(f1) >= 320.0F || Math.abs(f2) >= 320.0F) {
        this.Dne.remove(paramString);
        return;
      } 
      paramInt = 6;
      bool = false;
      if (f1 <= -b)
        b1 = (byte)(int)((b * 2) + 2.5D); 
      if (f2 <= -b)
        b2 = (byte)(int)((b * 2) + 2.5D); 
      if (f1 >= b)
        b1 = (byte)(b * 2 + 1); 
      if (f2 >= b)
        b2 = (byte)(b * 2 + 1); 
    } 
    this.Dne.put(paramString, new GHe(this, (byte)paramInt, b1, b2, bool));
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\Ilk.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */