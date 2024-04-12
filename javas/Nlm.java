import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Random;

public abstract class Nlm {
  private Iey Dne;
  
  private int bzF;
  
  private int FWm;
  
  private sMa Dne;
  
  private int zGp;
  
  public int Dne;
  
  private List Dne;
  
  private int DyG;
  
  private int aFZ;
  
  public double FWm;
  
  public double Dne;
  
  private int Qnq;
  
  private String Dne = '\024';
  
  public boolean Dne(int paramInt) {
    if (paramInt == 1 && (Dne()).aFZ != null) {
      this.Dne = this.FWm;
      return true;
    } 
    return false;
  }
  
  public Iey Dne() {
    return (Iey)this.Dne;
  }
  
  public abstract int FWm();
  
  public void FWm(WkD paramWkD) {
    paramWkD.Dne("EntityId", Dne());
    paramWkD.Dne("Delay", (short)this.Dne);
    paramWkD.Dne("MinSpawnDelay", (short)this.FWm);
    paramWkD.Dne("MaxSpawnDelay", (short)this.bzF);
    paramWkD.Dne("SpawnCount", (short)this.Qnq);
    paramWkD.Dne("MaxNearbyEntities", (short)this.aFZ);
    paramWkD.Dne("RequiredPlayerRange", (short)this.zGp);
    paramWkD.Dne("SpawnRange", (short)this.DyG);
    if (Dne() != null)
      paramWkD.Dne("SpawnData", (WkD)(Dne()).Dne.Dne()); 
    if (Dne() != null || (this.Dne != null && this.Dne.size() > 0)) {
      mbZ mbZ = new mbZ();
      if (this.Dne != null && this.Dne.size() > 0) {
        for (Iey iey : this.Dne)
          mbZ.Dne(iey.Dne()); 
      } else {
        mbZ.Dne(Dne().Dne());
      } 
      paramWkD.Dne("SpawnPotentials", mbZ);
    } 
  }
  
  public void Dne() {
    if (Dne())
      if ((Dne()).aFZ != null) {
        double d2 = (Dne() + (Dne()).Dne.nextFloat());
        double d3 = (FWm() + (Dne()).Dne.nextFloat());
        double d1 = (bzF() + (Dne()).Dne.nextFloat());
        Dne().Dne("smoke", d2, d3, d1, 0.0D, 0.0D, 0.0D);
        Dne().Dne("flame", d2, d3, d1, 0.0D, 0.0D, 0.0D);
        if (this.Dne > null)
          this.Dne--; 
        this.FWm = this.Dne;
        this.Dne = (this.Dne + (1000.0F / (this.Dne + 200.0F))) % 360.0D;
      } else {
        if (this.Dne == -1)
          FWm(); 
        if (this.Dne > null) {
          this.Dne--;
          return;
        } 
        boolean bool = false;
        for (byte b = 0; b < this.Qnq; b++) {
          sMa sMa1 = Klb.Dne(Dne(), Dne());
          if (sMa1 == null)
            return; 
          int i = Dne().Dne(sMa1.getClass(), bSp.Dne().Dne(Dne(), FWm(), bzF(), (Dne() + 1), (FWm() + 1), (bzF() + 1)).FWm((this.DyG * 2), 4.0D, (this.DyG * 2))).size();
          if (i >= this.aFZ) {
            FWm();
            return;
          } 
          double d1 = Dne() + ((Dne()).Dne.nextDouble() - (Dne()).Dne.nextDouble()) * this.DyG;
          double d2 = (FWm() + (Dne()).Dne.nextInt(3) - 1);
          double d3 = bzF() + ((Dne()).Dne.nextDouble() - (Dne()).Dne.nextDouble()) * this.DyG;
          FUH fUH = (sMa1 instanceof FUH) ? (FUH)sMa1 : null;
          sMa1.FWm(d1, d2, d3, (Dne()).Dne.nextFloat() * 360.0F, 0.0F);
          if (fUH == null || fUH.cot()) {
            Dne(sMa1);
            Dne().Qnq(2004, Dne(), FWm(), bzF(), 0);
            if (fUH != null)
              fUH.Wwe(); 
            bool = true;
          } 
        } 
        if (bool)
          FWm(); 
      }  
  }
  
  private void FWm() {
    if (this.bzF <= this.FWm) {
      this.Dne = this.FWm;
    } else {
      int i = this.bzF - this.FWm;
      this.Dne = this.FWm + (Dne()).Dne.nextInt(i);
    } 
    if (this.Dne != null && this.Dne.size() > 0)
      Dne((Iey)nGp.Dne((Random)(Dne()).Dne, (Collection)this.Dne)); 
    Dne(1);
  }
  
  public sMa Dne() {
    if (this.Dne == null) {
      sMa sMa1 = Klb.Dne(Dne(), (Qnq)null);
      sMa1 = Dne(sMa1);
      this.Dne = (String)sMa1;
    } 
    return (sMa)this.Dne;
  }
  
  public boolean Dne() {
    return (Dne().Dne(Dne() + 0.5D, FWm() + 0.5D, bzF() + 0.5D, this.zGp) != null);
  }
  
  public abstract void Dne(int paramInt);
  
  public String Dne() {
    if (Dne() == null) {
      if (this.Dne.equals("Minecart"))
        this.Dne = "MinecartRideable"; 
      return this.Dne;
    } 
    return (Dne()).Dne;
  }
  
  public void Dne(String paramString) {
    this.Dne = paramString;
  }
  
  public void Dne(WkD paramWkD) {
    this.Dne = paramWkD.Dne("EntityId");
    this.Dne = paramWkD.Dne("Delay");
    if (paramWkD.Dne("SpawnPotentials")) {
      this.Dne = (String)new ArrayList();
      mbZ mbZ = paramWkD.Dne("SpawnPotentials");
      for (byte b = 0; b < mbZ.Dne(); b++)
        this.Dne.add(new Iey(this, (WkD)mbZ.FWm(b))); 
    } else {
      this.Dne = null;
    } 
    if (paramWkD.Dne("SpawnData")) {
      Dne(new Iey(this, paramWkD.Dne("SpawnData"), this.Dne));
    } else {
      Dne((Iey)null);
    } 
    if (paramWkD.Dne("MinSpawnDelay")) {
      this.FWm = paramWkD.Dne("MinSpawnDelay");
      this.bzF = paramWkD.Dne("MaxSpawnDelay");
      this.Qnq = paramWkD.Dne("SpawnCount");
    } 
    if (paramWkD.Dne("MaxNearbyEntities")) {
      this.aFZ = paramWkD.Dne("MaxNearbyEntities");
      this.zGp = paramWkD.Dne("RequiredPlayerRange");
    } 
    if (paramWkD.Dne("SpawnRange"))
      this.DyG = paramWkD.Dne("SpawnRange"); 
    if (Dne() != null && (Dne()).aFZ != null)
      this.Dne = null; 
  }
  
  public sMa Dne(sMa paramsMa) {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual Dne : ()LIey;
    //   4: ifnull -> 275
    //   7: new WkD
    //   10: dup
    //   11: invokespecial <init> : ()V
    //   14: astore_2
    //   15: aload_1
    //   16: aload_2
    //   17: invokevirtual FWm : (LWkD;)Z
    //   20: pop
    //   21: aload_0
    //   22: invokevirtual Dne : ()LIey;
    //   25: getfield Dne : LWkD;
    //   28: invokevirtual Dne : ()Ljava/util/Collection;
    //   31: invokeinterface iterator : ()Ljava/util/Iterator;
    //   36: astore_3
    //   37: aload_3
    //   38: invokeinterface hasNext : ()Z
    //   43: ifeq -> 74
    //   46: aload_3
    //   47: invokeinterface next : ()Ljava/lang/Object;
    //   52: checkcast oNe
    //   55: astore #4
    //   57: aload_2
    //   58: aload #4
    //   60: invokevirtual Dne : ()Ljava/lang/String;
    //   63: aload #4
    //   65: invokevirtual Dne : ()LoNe;
    //   68: invokevirtual Dne : (Ljava/lang/String;LoNe;)V
    //   71: goto -> 37
    //   74: aload_1
    //   75: aload_2
    //   76: invokevirtual Qnq : (LWkD;)V
    //   79: aload_1
    //   80: getfield Dne : LQnq;
    //   83: ifnull -> 95
    //   86: aload_1
    //   87: getfield Dne : LQnq;
    //   90: aload_1
    //   91: invokevirtual FWm : (LsMa;)Z
    //   94: pop
    //   95: aload_1
    //   96: astore #5
    //   98: aload_2
    //   99: ldc_w 'Riding'
    //   102: invokevirtual Dne : (Ljava/lang/String;)Z
    //   105: ifeq -> 272
    //   108: aload_2
    //   109: ldc_w 'Riding'
    //   112: invokevirtual Dne : (Ljava/lang/String;)LWkD;
    //   115: astore #4
    //   117: aload #4
    //   119: ldc_w 'id'
    //   122: invokevirtual Dne : (Ljava/lang/String;)Ljava/lang/String;
    //   125: aload_0
    //   126: invokevirtual Dne : ()LQnq;
    //   129: invokestatic Dne : (Ljava/lang/String;LQnq;)LsMa;
    //   132: astore #6
    //   134: aload #6
    //   136: ifnull -> 262
    //   139: new WkD
    //   142: dup
    //   143: invokespecial <init> : ()V
    //   146: astore #7
    //   148: aload #6
    //   150: aload #7
    //   152: invokevirtual FWm : (LWkD;)Z
    //   155: pop
    //   156: aload #4
    //   158: invokevirtual Dne : ()Ljava/util/Collection;
    //   161: invokeinterface iterator : ()Ljava/util/Iterator;
    //   166: astore #8
    //   168: aload #8
    //   170: invokeinterface hasNext : ()Z
    //   175: ifeq -> 208
    //   178: aload #8
    //   180: invokeinterface next : ()Ljava/lang/Object;
    //   185: checkcast oNe
    //   188: astore #9
    //   190: aload #7
    //   192: aload #9
    //   194: invokevirtual Dne : ()Ljava/lang/String;
    //   197: aload #9
    //   199: invokevirtual Dne : ()LoNe;
    //   202: invokevirtual Dne : (Ljava/lang/String;LoNe;)V
    //   205: goto -> 168
    //   208: aload #6
    //   210: aload #7
    //   212: invokevirtual Qnq : (LWkD;)V
    //   215: aload #6
    //   217: aload #5
    //   219: getfield div : D
    //   222: aload #5
    //   224: getfield IjH : D
    //   227: aload #5
    //   229: getfield mrb : D
    //   232: aload #5
    //   234: getfield mrb : F
    //   237: aload #5
    //   239: getfield XHL : F
    //   242: invokevirtual FWm : (DDDFF)V
    //   245: aload_0
    //   246: invokevirtual Dne : ()LQnq;
    //   249: aload #6
    //   251: invokevirtual FWm : (LsMa;)Z
    //   254: pop
    //   255: aload #5
    //   257: aload #6
    //   259: invokevirtual bzF : (LsMa;)V
    //   262: aload #6
    //   264: astore #5
    //   266: aload #4
    //   268: astore_2
    //   269: goto -> 98
    //   272: goto -> 305
    //   275: aload_1
    //   276: instanceof FUH
    //   279: ifeq -> 305
    //   282: aload_1
    //   283: getfield Dne : LQnq;
    //   286: ifnull -> 305
    //   289: aload_1
    //   290: checkcast FUH
    //   293: invokevirtual ICU : ()V
    //   296: aload_0
    //   297: invokevirtual Dne : ()LQnq;
    //   300: aload_1
    //   301: invokevirtual FWm : (LsMa;)Z
    //   304: pop
    //   305: aload_1
    //   306: areturn
  }
  
  public abstract int Dne();
  
  public abstract Qnq Dne();
  
  public void Dne(Iey paramIey) {
    this.Dne = (String)paramIey;
  }
  
  public abstract int bzF();
  
  public Nlm() {
    this.Dne = "Pig";
    this.Dne = null;
    this.Dne = null;
    this.FWm = 0.0D;
    this.FWm = 'È';
    this.bzF = 800;
    this.Qnq = 4;
    this.aFZ = 6;
    this.zGp = 16;
    this.DyG = 4;
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\Nlm.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */