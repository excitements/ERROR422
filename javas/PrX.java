import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PrX extends vWZ {
  private int Dne;
  
  private final List Dne;
  
  private final List bzF = new ArrayList();
  
  private final List FWm = new ArrayList();
  
  private Qnq Dne = (Qnq)new ArrayList();
  
  private void Dne(iSh paramiSh) {
    byte b1 = 16;
    byte b2 = 4;
    byte b3 = 16;
    for (int i = paramiSh.Dne - b1; i < paramiSh.Dne + b1; i++) {
      for (int j = paramiSh.FWm - b2; j < paramiSh.FWm + b2; j++) {
        for (int k = paramiSh.bzF - b3; k < paramiSh.bzF + b3; k++) {
          if (FWm(i, j, k)) {
            yQQ yQQ = Dne(i, j, k);
            if (yQQ == null) {
              FWm(i, j, k);
            } else {
              yQQ.zGp = this.Dne;
            } 
          } 
        } 
      } 
    } 
  }
  
  private void FWm(int paramInt1, int paramInt2, int paramInt3) {
    int i = ((oqu)zKP.ICU).a_(this.Dne, paramInt1, paramInt2, paramInt3);
    if (i != 0 && i != 2) {
      byte b = 0;
      byte b1;
      for (b1 = -5; b1 < 0; b1++) {
        if (this.Dne.aFZ(paramInt1, paramInt2, paramInt3 + b1))
          b--; 
      } 
      for (b1 = 1; b1 <= 5; b1++) {
        if (this.Dne.aFZ(paramInt1, paramInt2, paramInt3 + b1))
          b++; 
      } 
      if (b != 0)
        this.FWm.add(new yQQ(paramInt1, paramInt2, paramInt3, 0, (b > 0) ? -2 : 2, this.Dne)); 
    } else {
      byte b = 0;
      byte b1;
      for (b1 = -5; b1 < 0; b1++) {
        if (this.Dne.aFZ(paramInt1 + b1, paramInt2, paramInt3))
          b--; 
      } 
      for (b1 = 1; b1 <= 5; b1++) {
        if (this.Dne.aFZ(paramInt1 + b1, paramInt2, paramInt3))
          b++; 
      } 
      if (b != 0)
        this.FWm.add(new yQQ(paramInt1, paramInt2, paramInt3, (b > 0) ? -2 : 2, 0, this.Dne)); 
    } 
  }
  
  private void Qnq() {
    if (!this.Dne.isEmpty())
      Dne(this.Dne.remove(0)); 
  }
  
  public uQr Dne(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    uQr uQr = null;
    float f = Float.MAX_VALUE;
    for (uQr uQr1 : this.bzF) {
      float f1 = uQr1.Dne().Dne(paramInt1, paramInt2, paramInt3);
      if (f1 < f) {
        int i = paramInt4 + uQr1.Dne();
        if (f1 <= (i * i)) {
          uQr = uQr1;
          f = f1;
        } 
      } 
    } 
    return uQr;
  }
  
  public List Dne() {
    return this.bzF;
  }
  
  public void Dne(WkD paramWkD) {
    this.Dne = paramWkD.Dne("Tick");
    mbZ mbZ = paramWkD.Dne("Villages");
    for (byte b = 0; b < mbZ.Dne(); b++) {
      WkD wkD = (WkD)mbZ.FWm(b);
      uQr uQr = new uQr();
      uQr.Dne(wkD);
      this.bzF.add(uQr);
    } 
  }
  
  private void bzF() {
    Iterator<uQr> iterator = this.bzF.iterator();
    while (iterator.hasNext()) {
      uQr uQr = iterator.next();
      if (uQr.Dne()) {
        iterator.remove();
        Dne();
      } 
    } 
  }
  
  private void aFZ() {
    for (byte b = 0; b < this.FWm.size(); b++) {
      yQQ yQQ = this.FWm.get(b);
      boolean bool = false;
      for (uQr uQr : this.bzF) {
        int i = (int)uQr.Dne().Dne(yQQ.Dne, yQQ.FWm, yQQ.bzF);
        int j = 32 + uQr.Dne();
        if (i > j * j)
          continue; 
        uQr.Dne(yQQ);
        bool = true;
      } 
      if (!bool) {
        uQr uQr = new uQr(this.Dne);
        uQr.Dne(yQQ);
        this.bzF.add(uQr);
        Dne();
      } 
    } 
    this.FWm.clear();
  }
  
  private boolean Dne(int paramInt1, int paramInt2, int paramInt3) {
    Iterator<iSh> iterator = this.Dne.iterator();
    while (true) {
      if (!iterator.hasNext())
        return false; 
      iSh iSh = iterator.next();
      if (iSh.Dne == paramInt1 && iSh.FWm == paramInt2 && iSh.bzF == paramInt3)
        return true; 
    } 
  }
  
  public void Dne(int paramInt1, int paramInt2, int paramInt3) {
    if (this.Dne.size() <= 64 && !Dne(paramInt1, paramInt2, paramInt3))
      this.Dne.add(new iSh(paramInt1, paramInt2, paramInt3)); 
  }
  
  private boolean FWm(int paramInt1, int paramInt2, int paramInt3) {
    int i = this.Dne.Dne(paramInt1, paramInt2, paramInt3);
    return (i == zKP.ICU.FWm);
  }
  
  public void Dne(Qnq paramQnq) {
    this.Dne = paramQnq;
    for (uQr uQr : this.bzF)
      uQr.Dne(paramQnq); 
  }
  
  public PrX(Qnq paramQnq) {
    super("villages");
    this.Dne = false;
    this.Dne = paramQnq;
    Dne();
  }
  
  private yQQ Dne(int paramInt1, int paramInt2, int paramInt3) {
    Iterator<uQr> iterator = this.FWm.iterator();
    while (true) {
      if (!iterator.hasNext()) {
        iterator = this.bzF.iterator();
        while (true) {
          if (!iterator.hasNext())
            return null; 
          uQr uQr = iterator.next();
          yQQ yQQ1 = uQr.bzF(paramInt1, paramInt2, paramInt3);
          if (yQQ1 != null)
            return yQQ1; 
        } 
        break;
      } 
      yQQ yQQ = (yQQ)iterator.next();
      if (yQQ.Dne == paramInt1 && yQQ.bzF == paramInt3 && Math.abs(yQQ.FWm - paramInt2) <= 1)
        return yQQ; 
    } 
  }
  
  public void FWm(WkD paramWkD) {
    paramWkD.Dne("Tick", this.Dne);
    mbZ mbZ = new mbZ("Villages");
    for (uQr uQr : this.bzF) {
      WkD wkD = new WkD("Village");
      uQr.FWm(wkD);
      mbZ.Dne(wkD);
    } 
    paramWkD.Dne("Villages", mbZ);
  }
  
  public PrX(String paramString) {
    super(paramString);
    this.Dne = false;
  }
  
  public void FWm() {
    this.Dne++;
    for (uQr uQr : this.bzF)
      uQr.Dne(this.Dne); 
    bzF();
    Qnq();
    aFZ();
    if (this.Dne % 400 == 0)
      Dne(); 
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\PrX.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */