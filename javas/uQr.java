import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.TreeMap;

public class uQr {
  private int bzF;
  
  private int FWm;
  
  private TreeMap Dne;
  
  private int Dne;
  
  private final iSh FWm;
  
  private int aFZ;
  
  private final List Dne;
  
  private int zGp;
  
  private int Qnq;
  
  private Qnq Dne;
  
  private List FWm;
  
  private final iSh Dne = (iSh)new ArrayList();
  
  public void Dne() {
    this.aFZ = this.bzF;
  }
  
  public int Dne() {
    return this.Dne;
  }
  
  public yQQ FWm(int paramInt1, int paramInt2, int paramInt3) {
    yQQ yQQ = null;
    int i = Integer.MAX_VALUE;
    for (yQQ yQQ1 : this.Dne) {
      int j = yQQ1.Dne(paramInt1, paramInt2, paramInt3);
      if (j > 256) {
        j *= 1000;
      } else {
        j = yQQ1.Qnq();
      } 
      if (j < i) {
        yQQ = yQQ1;
        i = j;
      } 
    } 
    return yQQ;
  }
  
  public uQr(Qnq paramQnq) {
    this.Dne = new iSh(0, 0, 0);
    this.FWm = (List)new iSh(0, 0, 0);
    this.Dne = false;
    this.FWm = false;
    this.bzF = 0;
    this.Qnq = 0;
    this.Dne = (iSh)new TreeMap<>();
    this.FWm = new ArrayList();
    this.zGp = 0;
    this.Dne = (iSh)paramQnq;
  }
  
  public uQr() {
    this.Dne = new iSh(0, 0, 0);
    this.FWm = (List)new iSh(0, 0, 0);
    this.Dne = false;
    this.FWm = false;
    this.bzF = 0;
    this.Qnq = 0;
    this.Dne = (iSh)new TreeMap<>();
    this.FWm = new ArrayList();
    this.zGp = 0;
  }
  
  public iSh Dne() {
    return (iSh)this.FWm;
  }
  
  public void Dne(yQQ paramyQQ) {
    this.Dne.add(paramyQQ);
    this.Dne.Dne += paramyQQ.Dne;
    this.Dne.FWm += paramyQQ.FWm;
    this.Dne.bzF += paramyQQ.bzF;
    zGp();
    this.FWm = paramyQQ.zGp;
  }
  
  public boolean Dne(int paramInt1, int paramInt2, int paramInt3) {
    return (this.FWm.Dne(paramInt1, paramInt2, paramInt3) < (this.Dne * this.Dne));
  }
  
  public yQQ Dne(int paramInt1, int paramInt2, int paramInt3) {
    yQQ yQQ = null;
    int i = Integer.MAX_VALUE;
    for (yQQ yQQ1 : this.Dne) {
      int j = yQQ1.Dne(paramInt1, paramInt2, paramInt3);
      if (j < i) {
        yQQ = yQQ1;
        i = j;
      } 
    } 
    return yQQ;
  }
  
  public int Dne(String paramString, int paramInt) {
    int i = Dne(paramString);
    int j = geR.Dne(i + paramInt, -30, 10);
    this.Dne.put(paramString, Integer.valueOf(j));
    return j;
  }
  
  private boolean Dne(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6) {
    if (!this.Dne.IjH(paramInt1, paramInt2 - 1, paramInt3))
      return false; 
    int i = paramInt1 - paramInt4 / 2;
    int j = paramInt3 - paramInt6 / 2;
    for (int k = i; k < i + paramInt4; k++) {
      for (int m = paramInt2; m < paramInt2 + paramInt5; m++) {
        for (int n = j; n < j + paramInt6; n++) {
          if (this.Dne.DyG(k, m, n))
            return false; 
        } 
      } 
    } 
    return true;
  }
  
  public int bzF() {
    return this.bzF - this.FWm;
  }
  
  public boolean Dne(String paramString) {
    return (Dne(paramString) <= -15);
  }
  
  private void aFZ() {
    boolean bool1 = false;
    boolean bool2 = (((Qnq)this.Dne).Dne.nextInt(50) == 0) ? true : false;
    Iterator<yQQ> iterator = this.Dne.iterator();
    while (iterator.hasNext()) {
      yQQ yQQ = iterator.next();
      if (bool2)
        yQQ.Dne(); 
      if (!FWm(yQQ.Dne, yQQ.FWm, yQQ.bzF) || Math.abs(this.bzF - yQQ.zGp) > 1200) {
        this.Dne.Dne -= yQQ.Dne;
        this.Dne.FWm -= yQQ.FWm;
        this.Dne.bzF -= yQQ.bzF;
        bool1 = true;
        yQQ.Dne = 1;
        iterator.remove();
      } 
    } 
    if (bool1)
      zGp(); 
  }
  
  private void FWm() {
    List list = this.Dne.Dne(CDE.class, bSp.Dne().Dne((((iSh)this.FWm).Dne - this.Dne), (((iSh)this.FWm).FWm - 4), (((iSh)this.FWm).bzF - this.Dne), (((iSh)this.FWm).Dne + this.Dne), (((iSh)this.FWm).FWm + 4), (((iSh)this.FWm).bzF + this.Dne)));
    this.zGp = list.size();
  }
  
  public int Dne(String paramString) {
    Integer integer = (Integer)this.Dne.get(paramString);
    return (integer != null) ? integer.intValue() : 0;
  }
  
  public List Dne() {
    return (List)this.Dne;
  }
  
  public void Dne(WkD paramWkD) {
    this.Qnq = paramWkD.Dne("PopSize");
    this.Dne = paramWkD.Dne("Radius");
    this.zGp = paramWkD.Dne("Golems");
    this.FWm = paramWkD.Dne("Stable");
    this.bzF = paramWkD.Dne("Tick");
    this.aFZ = paramWkD.Dne("MTick");
    ((iSh)this.FWm).Dne = paramWkD.Dne("CX");
    ((iSh)this.FWm).FWm = paramWkD.Dne("CY");
    ((iSh)this.FWm).bzF = paramWkD.Dne("CZ");
    this.Dne.Dne = paramWkD.Dne("ACX");
    this.Dne.FWm = paramWkD.Dne("ACY");
    this.Dne.bzF = paramWkD.Dne("ACZ");
    mbZ mbZ1 = paramWkD.Dne("Doors");
    for (byte b1 = 0; b1 < mbZ1.Dne(); b1++) {
      WkD wkD = (WkD)mbZ1.FWm(b1);
      yQQ yQQ = new yQQ(wkD.Dne("X"), wkD.Dne("Y"), wkD.Dne("Z"), wkD.Dne("IDX"), wkD.Dne("IDZ"), wkD.Dne("TS"));
      this.Dne.add(yQQ);
    } 
    mbZ mbZ2 = paramWkD.Dne("Players");
    for (byte b2 = 0; b2 < mbZ2.Dne(); b2++) {
      WkD wkD = (WkD)mbZ2.FWm(b2);
      this.Dne.put(wkD.Dne("Name"), Integer.valueOf(wkD.Dne("S")));
    } 
  }
  
  public boolean Dne() {
    return this.Dne.isEmpty();
  }
  
  public void Dne(int paramInt) {
    this.bzF = paramInt;
    aFZ();
    Qnq();
    if (paramInt % 20 == 0)
      bzF(); 
    if (paramInt % 30 == 0)
      FWm(); 
    int i = this.Qnq / 10;
    if (this.zGp < i && this.Dne.size() > 20 && ((Qnq)this.Dne).Dne.nextInt(7000) == 0) {
      chN chN = Dne(geR.Dne(((iSh)this.FWm).Dne), geR.Dne(((iSh)this.FWm).FWm), geR.Dne(((iSh)this.FWm).bzF), 2, 4, 2);
      if (chN != null) {
        CDE cDE = new CDE((Qnq)this.Dne);
        cDE.bzF(chN.Dne, chN.FWm, chN.bzF);
        this.Dne.FWm(cDE);
        this.zGp++;
      } 
    } 
  }
  
  private chN Dne(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6) {
    for (byte b = 0; b < 10; b++) {
      int i = paramInt1 + ((Qnq)this.Dne).Dne.nextInt(16) - 8;
      int j = paramInt2 + ((Qnq)this.Dne).Dne.nextInt(6) - 3;
      int k = paramInt3 + ((Qnq)this.Dne).Dne.nextInt(16) - 8;
      if (Dne(i, j, k) && Dne(i, j, k, paramInt4, paramInt5, paramInt6))
        return this.Dne.Dne().Dne(i, j, k); 
    } 
    return null;
  }
  
  private void bzF() {
    List list = this.Dne.Dne(pjB.class, bSp.Dne().Dne((((iSh)this.FWm).Dne - this.Dne), (((iSh)this.FWm).FWm - 4), (((iSh)this.FWm).bzF - this.Dne), (((iSh)this.FWm).Dne + this.Dne), (((iSh)this.FWm).FWm + 4), (((iSh)this.FWm).bzF + this.Dne)));
    this.Qnq = list.size();
    if (this.Qnq == 0)
      this.Dne.clear(); 
  }
  
  public void Dne(Qnq paramQnq) {
    this.Dne = (iSh)paramQnq;
  }
  
  public FUH Dne(FUH paramFUH) {
    double d = Double.MAX_VALUE;
    WaS waS = null;
    for (byte b = 0; b < this.FWm.size(); b++) {
      WaS waS1 = this.FWm.get(b);
      double d1 = waS1.Dne.Dne(paramFUH);
      if (d1 <= d) {
        waS = waS1;
        d = d1;
      } 
    } 
    return (waS != null) ? waS.Dne : null;
  }
  
  private void Qnq() {
    Iterator<WaS> iterator = this.FWm.iterator();
    while (iterator.hasNext()) {
      WaS waS = iterator.next();
      if (!waS.Dne.udO() || Math.abs(this.bzF - waS.Dne) > 300)
        iterator.remove(); 
    } 
  }
  
  public void FWm(WkD paramWkD) {
    paramWkD.Dne("PopSize", this.Qnq);
    paramWkD.Dne("Radius", this.Dne);
    paramWkD.Dne("Golems", this.zGp);
    paramWkD.Dne("Stable", this.FWm);
    paramWkD.Dne("Tick", this.bzF);
    paramWkD.Dne("MTick", this.aFZ);
    paramWkD.Dne("CX", ((iSh)this.FWm).Dne);
    paramWkD.Dne("CY", ((iSh)this.FWm).FWm);
    paramWkD.Dne("CZ", ((iSh)this.FWm).bzF);
    paramWkD.Dne("ACX", this.Dne.Dne);
    paramWkD.Dne("ACY", this.Dne.FWm);
    paramWkD.Dne("ACZ", this.Dne.bzF);
    mbZ mbZ1 = new mbZ("Doors");
    for (yQQ yQQ : this.Dne) {
      WkD wkD = new WkD("Door");
      wkD.Dne("X", yQQ.Dne);
      wkD.Dne("Y", yQQ.FWm);
      wkD.Dne("Z", yQQ.bzF);
      wkD.Dne("IDX", yQQ.Qnq);
      wkD.Dne("IDZ", yQQ.aFZ);
      wkD.Dne("TS", yQQ.zGp);
      mbZ1.Dne(wkD);
    } 
    paramWkD.Dne("Doors", mbZ1);
    mbZ mbZ2 = new mbZ("Players");
    for (String str : this.Dne.keySet()) {
      WkD wkD = new WkD(str);
      wkD.Dne("Name", str);
      wkD.Dne("S", ((Integer)this.Dne.get(str)).intValue());
      mbZ2.Dne(wkD);
    } 
    paramWkD.Dne("Players", mbZ2);
  }
  
  public FiG Dne(FUH paramFUH) {
    double d = Double.MAX_VALUE;
    FiG fiG = null;
    for (String str : this.Dne.keySet()) {
      if (Dne(str)) {
        FiG fiG1 = this.Dne.Dne(str);
        if (fiG1 != null) {
          double d1 = fiG1.Dne(paramFUH);
          if (d1 <= d) {
            fiG = fiG1;
            d = d1;
          } 
        } 
      } 
    } 
    return fiG;
  }
  
  public boolean FWm() {
    return (this.aFZ == 0 || this.bzF - this.aFZ >= 3600);
  }
  
  public yQQ bzF(int paramInt1, int paramInt2, int paramInt3) {
    if (this.FWm.Dne(paramInt1, paramInt2, paramInt3) > (this.Dne * this.Dne))
      return null; 
    Iterator<yQQ> iterator = this.Dne.iterator();
    while (true) {
      if (!iterator.hasNext())
        return null; 
      yQQ yQQ = iterator.next();
      if (yQQ.Dne == paramInt1 && yQQ.bzF == paramInt3 && Math.abs(yQQ.FWm - paramInt2) <= 1)
        return yQQ; 
    } 
  }
  
  private boolean FWm(int paramInt1, int paramInt2, int paramInt3) {
    int i = this.Dne.Dne(paramInt1, paramInt2, paramInt3);
    return (i <= 0) ? false : ((i == zKP.ICU.FWm));
  }
  
  public void FWm(int paramInt) {
    for (String str : this.Dne.keySet())
      Dne(str, paramInt); 
  }
  
  public int FWm() {
    return this.Dne.size();
  }
  
  private void zGp() {
    int i = this.Dne.size();
    if (i == 0) {
      this.FWm.Dne(0, 0, 0);
      this.Dne = false;
    } else {
      this.FWm.Dne(this.Dne.Dne / i, this.Dne.FWm / i, this.Dne.bzF / i);
      int j = 0;
      for (yQQ yQQ : this.Dne)
        j = Math.max(yQQ.Dne(((iSh)this.FWm).Dne, ((iSh)this.FWm).FWm, ((iSh)this.FWm).bzF), j); 
      this.Dne = Math.max(32, (int)Math.sqrt(j) + 1);
    } 
  }
  
  public int Qnq() {
    return this.Qnq;
  }
  
  public void Dne(FUH paramFUH) {
    Iterator<WaS> iterator = this.FWm.iterator();
    while (true) {
      if (!iterator.hasNext()) {
        this.FWm.add(new WaS(this, paramFUH, this.bzF));
        return;
      } 
      WaS waS = iterator.next();
      if (waS.Dne == paramFUH) {
        waS.Dne = this.bzF;
        return;
      } 
    } 
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar\\uQr.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */