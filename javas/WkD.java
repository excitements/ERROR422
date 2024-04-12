import java.io.DataInput;
import java.io.DataOutput;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class WkD extends oNe {
  private Map Dne = new HashMap<>();
  
  public void Dne(String paramString, float paramFloat) {
    this.Dne.put(paramString, new nOv(paramString, paramFloat));
  }
  
  public boolean equals(Object paramObject) {
    if (super.equals(paramObject)) {
      WkD wkD = (WkD)paramObject;
      return this.Dne.entrySet().equals(wkD.Dne.entrySet());
    } 
    return false;
  }
  
  public double Dne(String paramString) {
    try {
      return !this.Dne.containsKey(paramString) ? 0.0D : ((kJU)this.Dne.get(paramString)).Dne;
    } catch (ClassCastException classCastException) {
      throw new kaJ(Dne(paramString, 6, classCastException));
    } 
  }
  
  public boolean Dne() {
    return this.Dne.isEmpty();
  }
  
  public void Dne(String paramString, int[] paramArrayOfint) {
    this.Dne.put(paramString, new xuY(paramString, paramArrayOfint));
  }
  
  public byte Dne(String paramString) {
    try {
      return !this.Dne.containsKey(paramString) ? 0 : ((bCM)this.Dne.get(paramString)).Dne;
    } catch (ClassCastException classCastException) {
      throw new kaJ(Dne(paramString, 1, classCastException));
    } 
  }
  
  public oNe Dne() {
    WkD wkD = new WkD(Dne());
    for (String str : this.Dne.keySet())
      wkD.Dne(str, ((oNe)this.Dne.get(str)).Dne()); 
    return wkD;
  }
  
  public boolean FWm(String paramString) {
    return (Dne(paramString) != 0);
  }
  
  public void Dne(String paramString, long paramLong) {
    this.Dne.put(paramString, new zCY(paramString, paramLong));
  }
  
  public Collection Dne() {
    return this.Dne.values();
  }
  
  public byte Dne() {
    return 10;
  }
  
  void Dne(DataInput paramDataInput) {
    this.Dne.clear();
    oNe oNe1;
    while ((oNe1 = oNe.Dne(paramDataInput)).Dne() != 0)
      this.Dne.put(oNe1.Dne(), oNe1); 
  }
  
  public void Dne(String paramString, int paramInt) {
    this.Dne.put(paramString, new BYr(paramString, paramInt));
  }
  
  public int Dne(String paramString) {
    try {
      return !this.Dne.containsKey(paramString) ? 0 : ((BYr)this.Dne.get(paramString)).Dne;
    } catch (ClassCastException classCastException) {
      throw new kaJ(Dne(paramString, 3, classCastException));
    } 
  }
  
  public WkD Dne(String paramString) {
    try {
      return !this.Dne.containsKey(paramString) ? new WkD(paramString) : (WkD)this.Dne.get(paramString);
    } catch (ClassCastException classCastException) {
      throw new kaJ(Dne(paramString, 10, classCastException));
    } 
  }
  
  public WkD(String paramString) {
    super(paramString);
  }
  
  public int hashCode() {
    return super.hashCode() ^ this.Dne.hashCode();
  }
  
  public void Dne(String paramString1, String paramString2) {
    this.Dne.put(paramString1, new QNx(paramString1, paramString2));
  }
  
  public float Dne(String paramString) {
    try {
      return !this.Dne.containsKey(paramString) ? 0.0F : ((nOv)this.Dne.get(paramString)).Dne;
    } catch (ClassCastException classCastException) {
      throw new kaJ(Dne(paramString, 5, classCastException));
    } 
  }
  
  public oNe Dne(String paramString) {
    return (oNe)this.Dne.get(paramString);
  }
  
  public WkD() {
    super("");
  }
  
  static Map Dne(WkD paramWkD) {
    return paramWkD.Dne;
  }
  
  public void Dne(String paramString, short paramShort) {
    this.Dne.put(paramString, new phA(paramString, paramShort));
  }
  
  public void Dne(String paramString, byte paramByte) {
    this.Dne.put(paramString, new bCM(paramString, paramByte));
  }
  
  public String toString() {
    String str = Dne() + ":[";
    for (String str1 : this.Dne.keySet())
      str = str + str1 + ":" + this.Dne.get(str1) + ","; 
    return str + "]";
  }
  
  public boolean Dne(String paramString) {
    return this.Dne.containsKey(paramString);
  }
  
  public void Dne(String paramString) {
    this.Dne.remove(paramString);
  }
  
  public String Dne(String paramString) {
    try {
      return !this.Dne.containsKey(paramString) ? "" : ((QNx)this.Dne.get(paramString)).Dne;
    } catch (ClassCastException classCastException) {
      throw new kaJ(Dne(paramString, 8, classCastException));
    } 
  }
  
  public mbZ Dne(String paramString) {
    try {
      return !this.Dne.containsKey(paramString) ? new mbZ(paramString) : (mbZ)this.Dne.get(paramString);
    } catch (ClassCastException classCastException) {
      throw new kaJ(Dne(paramString, 9, classCastException));
    } 
  }
  
  public int[] Dne(String paramString) {
    try {
      return !this.Dne.containsKey(paramString) ? new int[0] : ((xuY)this.Dne.get(paramString)).Dne;
    } catch (ClassCastException classCastException) {
      throw new kaJ(Dne(paramString, 11, classCastException));
    } 
  }
  
  void Dne(DataOutput paramDataOutput) {
    for (oNe oNe1 : this.Dne.values())
      oNe.Dne(oNe1, paramDataOutput); 
    paramDataOutput.writeByte(0);
  }
  
  public long Dne(String paramString) {
    try {
      return !this.Dne.containsKey(paramString) ? 0L : ((zCY)this.Dne.get(paramString)).Dne;
    } catch (ClassCastException classCastException) {
      throw new kaJ(Dne(paramString, 4, classCastException));
    } 
  }
  
  public void Dne(String paramString, byte[] paramArrayOfbyte) {
    this.Dne.put(paramString, new kfd(paramString, paramArrayOfbyte));
  }
  
  private McM Dne(String paramString, int paramInt, ClassCastException paramClassCastException) {
    McM mcM = McM.Dne(paramClassCastException, "Reading NBT data");
    Noo noo = mcM.Dne("Corrupt NBT tag", 1);
    noo.Dne("Tag type found", new bip(this, paramString));
    noo.Dne("Tag type expected", new nVK(this, paramInt));
    noo.Dne("Tag name", paramString);
    if (Dne() != null && Dne().length() > 0)
      noo.Dne("Tag parent", Dne()); 
    return mcM;
  }
  
  public void Dne(String paramString, double paramDouble) {
    this.Dne.put(paramString, new kJU(paramString, paramDouble));
  }
  
  public void Dne(String paramString, WkD paramWkD) {
    this.Dne.put(paramString, paramWkD.FWm(paramString));
  }
  
  public void Dne(String paramString, oNe paramoNe) {
    this.Dne.put(paramString, paramoNe.FWm(paramString));
  }
  
  public short Dne(String paramString) {
    try {
      return !this.Dne.containsKey(paramString) ? 0 : ((phA)this.Dne.get(paramString)).Dne;
    } catch (ClassCastException classCastException) {
      throw new kaJ(Dne(paramString, 2, classCastException));
    } 
  }
  
  public void Dne(String paramString, boolean paramBoolean) {
    Dne(paramString, (byte)(paramBoolean ? 1 : 0));
  }
  
  public byte[] Dne(String paramString) {
    try {
      return !this.Dne.containsKey(paramString) ? new byte[0] : ((kfd)this.Dne.get(paramString)).Dne;
    } catch (ClassCastException classCastException) {
      throw new kaJ(Dne(paramString, 7, classCastException));
    } 
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\WkD.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */