import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class luM {
  private static final HashMap Dne = new HashMap<>();
  
  private ReadWriteLock Dne;
  
  private boolean Dne;
  
  private final Map Dne = true;
  
  private boolean FWm;
  
  public void FWm(int paramInt, Object paramObject) {
    uGR uGR = Dne(paramInt);
    if (!paramObject.equals(uGR.Dne())) {
      uGR.Dne(paramObject);
      uGR.Dne(true);
      this.FWm = true;
    } 
  }
  
  public void Dne(int paramInt1, int paramInt2) {
    uGR uGR = new uGR(paramInt2, paramInt1, null);
    this.Dne.writeLock().lock();
    this.Dne.put(Integer.valueOf(paramInt1), uGR);
    this.Dne.writeLock().unlock();
    this.Dne = false;
  }
  
  public boolean Dne() {
    return this.FWm;
  }
  
  public luM() {
    this.Dne = new HashMap<>();
    this.Dne = (Map)new ReentrantReadWriteLock();
  }
  
  static {
    Dne.put(Byte.class, Integer.valueOf(0));
    Dne.put(Short.class, Integer.valueOf(1));
    Dne.put(Integer.class, Integer.valueOf(2));
    Dne.put(Float.class, Integer.valueOf(3));
    Dne.put(String.class, Integer.valueOf(4));
    Dne.put(NMq.class, Integer.valueOf(5));
    Dne.put(iSh.class, Integer.valueOf(6));
  }
  
  public void Dne(int paramInt, Object paramObject) {
    Integer integer = (Integer)Dne.get(paramObject.getClass());
    if (integer == null)
      throw new IllegalArgumentException("Unknown data type: " + paramObject.getClass()); 
    if (paramInt > 31)
      throw new IllegalArgumentException("Data value id is too big with " + paramInt + "! (Max is " + '\037' + ")"); 
    if (this.Dne.containsKey(Integer.valueOf(paramInt)))
      throw new IllegalArgumentException("Duplicate id value for " + paramInt + "!"); 
    uGR uGR = new uGR(integer.intValue(), paramInt, paramObject);
    this.Dne.writeLock().lock();
    this.Dne.put(Integer.valueOf(paramInt), uGR);
    this.Dne.writeLock().unlock();
    this.Dne = false;
  }
  
  public boolean FWm() {
    return this.Dne;
  }
  
  public short Dne(int paramInt) {
    return ((Short)Dne(paramInt).Dne()).shortValue();
  }
  
  public List Dne() {
    ArrayList<uGR> arrayList = null;
    if (this.FWm) {
      this.Dne.readLock().lock();
      for (uGR uGR : this.Dne.values()) {
        if (uGR.Dne()) {
          uGR.Dne(false);
          if (arrayList == null)
            arrayList = new ArrayList(); 
          arrayList.add(uGR);
        } 
      } 
      this.Dne.readLock().unlock();
    } 
    this.FWm = false;
    return arrayList;
  }
  
  public void Dne(DataOutputStream paramDataOutputStream) {
    this.Dne.readLock().lock();
    for (uGR uGR : this.Dne.values())
      Dne(paramDataOutputStream, uGR); 
    this.Dne.readLock().unlock();
    paramDataOutputStream.writeByte(127);
  }
  
  public static List Dne(DataInputStream paramDataInputStream) {
    ArrayList<uGR> arrayList = null;
    for (byte b = paramDataInputStream.readByte(); b != Byte.MAX_VALUE; b = paramDataInputStream.readByte()) {
      int k;
      int m;
      int n;
      if (arrayList == null)
        arrayList = new ArrayList(); 
      int i = (b & 0xE0) >> 5;
      int j = b & 0x1F;
      uGR uGR = null;
      switch (i) {
        case 0:
          uGR = new uGR(i, j, Byte.valueOf(paramDataInputStream.readByte()));
          break;
        case 1:
          uGR = new uGR(i, j, Short.valueOf(paramDataInputStream.readShort()));
          break;
        case 2:
          uGR = new uGR(i, j, Integer.valueOf(paramDataInputStream.readInt()));
          break;
        case 3:
          uGR = new uGR(i, j, Float.valueOf(paramDataInputStream.readFloat()));
          break;
        case 4:
          uGR = new uGR(i, j, NER.Dne(paramDataInputStream, 64));
          break;
        case 5:
          uGR = new uGR(i, j, NER.Dne(paramDataInputStream));
          break;
        case 6:
          k = paramDataInputStream.readInt();
          m = paramDataInputStream.readInt();
          n = paramDataInputStream.readInt();
          uGR = new uGR(i, j, new iSh(k, m, n));
          break;
      } 
      arrayList.add(uGR);
    } 
    return arrayList;
  }
  
  public void Dne(int paramInt) {
    uGR.Dne(Dne(paramInt), true);
    this.FWm = true;
  }
  
  public String Dne(int paramInt) {
    return (String)Dne(paramInt).Dne();
  }
  
  private static void Dne(DataOutputStream paramDataOutputStream, uGR paramuGR) {
    NMq nMq;
    iSh iSh;
    int i = (paramuGR.FWm() << 5 | paramuGR.Dne() & 0x1F) & 0xFF;
    paramDataOutputStream.writeByte(i);
    switch (paramuGR.FWm()) {
      case 0:
        paramDataOutputStream.writeByte(((Byte)paramuGR.Dne()).byteValue());
        break;
      case 1:
        paramDataOutputStream.writeShort(((Short)paramuGR.Dne()).shortValue());
        break;
      case 2:
        paramDataOutputStream.writeInt(((Integer)paramuGR.Dne()).intValue());
        break;
      case 3:
        paramDataOutputStream.writeFloat(((Float)paramuGR.Dne()).floatValue());
        break;
      case 4:
        NER.Dne((String)paramuGR.Dne(), paramDataOutputStream);
        break;
      case 5:
        nMq = (NMq)paramuGR.Dne();
        NER.Dne(nMq, paramDataOutputStream);
        break;
      case 6:
        iSh = (iSh)paramuGR.Dne();
        paramDataOutputStream.writeInt(iSh.Dne);
        paramDataOutputStream.writeInt(iSh.FWm);
        paramDataOutputStream.writeInt(iSh.bzF);
        break;
    } 
  }
  
  public NMq Dne(int paramInt) {
    return (NMq)Dne(paramInt).Dne();
  }
  
  public static void Dne(List paramList, DataOutputStream paramDataOutputStream) {
    if (paramList != null)
      for (uGR uGR : paramList)
        Dne(paramDataOutputStream, uGR);  
    paramDataOutputStream.writeByte(127);
  }
  
  private uGR Dne(int paramInt) {
    uGR uGR;
    this.Dne.readLock().lock();
    try {
      uGR = (uGR)this.Dne.get(Integer.valueOf(paramInt));
    } catch (Throwable throwable) {
      McM mcM = McM.Dne(throwable, "Getting synched entity data");
      Noo noo = mcM.Dne("Synched entity data");
      noo.Dne("Data ID", Integer.valueOf(paramInt));
      throw new kaJ(mcM);
    } 
    this.Dne.readLock().unlock();
    return uGR;
  }
  
  public List FWm() {
    ArrayList<uGR> arrayList = null;
    this.Dne.readLock().lock();
    for (uGR uGR : this.Dne.values()) {
      if (arrayList == null)
        arrayList = new ArrayList(); 
      arrayList.add(uGR);
    } 
    this.Dne.readLock().unlock();
    return arrayList;
  }
  
  public void Dne(List paramList) {
    this.Dne.writeLock().lock();
    for (uGR uGR1 : paramList) {
      uGR uGR2 = (uGR)this.Dne.get(Integer.valueOf(uGR1.Dne()));
      if (uGR2 != null)
        uGR2.Dne(uGR1.Dne()); 
    } 
    this.Dne.writeLock().unlock();
  }
  
  public int Dne(int paramInt) {
    return ((Integer)Dne(paramInt).Dne()).intValue();
  }
  
  public byte Dne(int paramInt) {
    return ((Byte)Dne(paramInt).Dne()).byteValue();
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\luM.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */