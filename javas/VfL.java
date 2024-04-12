import java.util.ArrayList;

public class VfL implements iQt {
  private NMq Dne;
  
  public NMq Dne(Uqm paramUqm) {
    return this.Dne.Dne();
  }
  
  public int Dne() {
    return 10;
  }
  
  public boolean Dne(Uqm paramUqm, Qnq paramQnq) {
    this.Dne = null;
    byte b1 = 0;
    byte b2 = 0;
    byte b3 = 0;
    byte b4 = 0;
    int i = 0;
    byte b5 = 0;
    for (byte b6 = 0; b6 < paramUqm.Qnq(); b6++) {
      NMq nMq = paramUqm.Dne(b6);
      if (nMq != null)
        if (nMq.bzF == dEr.cot.Qnq) {
          b2++;
        } else if (nMq.bzF == dEr.mte.Qnq) {
          b4++;
        } else if (nMq.bzF == dEr.edi.Qnq) {
          b3++;
        } else if (nMq.bzF == dEr.lMz.Qnq) {
          b1++;
        } else if (nMq.bzF == dEr.XwR.Qnq) {
          i++;
        } else if (nMq.bzF == dEr.div.Qnq) {
          i++;
        } else if (nMq.bzF == dEr.lDk.Qnq) {
          b5++;
        } else if (nMq.bzF == dEr.yMz.Qnq) {
          b5++;
        } else if (nMq.bzF == dEr.uzC.Qnq) {
          b5++;
        } else {
          if (nMq.bzF != dEr.mfU.Qnq)
            return false; 
          b5++;
        }  
    } 
    i += b3 + b5;
    if (b2 <= 3 && b1 <= 1) {
      if (b2 >= 1 && b1 == 1 && i == 0) {
        this.Dne = new NMq(dEr.kQw);
        if (b4 > 0) {
          WkD wkD1 = new WkD();
          WkD wkD2 = new WkD("Fireworks");
          mbZ mbZ = new mbZ("Explosions");
          for (byte b = 0; b < paramUqm.Qnq(); b++) {
            NMq nMq = paramUqm.Dne(b);
            if (nMq != null && nMq.bzF == dEr.mte.Qnq && nMq.aFZ() && nMq.Dne().Dne("Explosion"))
              mbZ.Dne(nMq.Dne().Dne("Explosion")); 
          } 
          wkD2.Dne("Explosions", mbZ);
          wkD2.Dne("Flight", (byte)b2);
          wkD1.Dne("Fireworks", wkD2);
          this.Dne.FWm(wkD1);
        } 
        return true;
      } 
      if (b2 == 1 && b1 == 0 && b4 == 0 && b3 > 0 && b5 <= 1) {
        this.Dne = new NMq(dEr.mte);
        WkD wkD1 = new WkD();
        WkD wkD2 = new WkD("Explosion");
        byte b7 = 0;
        ArrayList<Integer> arrayList = new ArrayList();
        for (byte b8 = 0; b8 < paramUqm.Qnq(); b8++) {
          NMq nMq = paramUqm.Dne(b8);
          if (nMq != null)
            if (nMq.bzF == dEr.edi.Qnq) {
              arrayList.add(Integer.valueOf(AvN.Dne[nMq.Qnq()]));
            } else if (nMq.bzF == dEr.XwR.Qnq) {
              wkD2.Dne("Flicker", true);
            } else if (nMq.bzF == dEr.div.Qnq) {
              wkD2.Dne("Trail", true);
            } else if (nMq.bzF == dEr.lDk.Qnq) {
              b7 = 1;
            } else if (nMq.bzF == dEr.yMz.Qnq) {
              b7 = 4;
            } else if (nMq.bzF == dEr.uzC.Qnq) {
              b7 = 2;
            } else if (nMq.bzF == dEr.mfU.Qnq) {
              b7 = 3;
            }  
        } 
        int[] arrayOfInt = new int[arrayList.size()];
        for (byte b9 = 0; b9 < arrayOfInt.length; b9++)
          arrayOfInt[b9] = ((Integer)arrayList.get(b9)).intValue(); 
        wkD2.Dne("Colors", arrayOfInt);
        wkD2.Dne("Type", b7);
        wkD1.Dne("Explosion", wkD2);
        this.Dne.FWm(wkD1);
        return true;
      } 
      if (b2 == 0 && b1 == 0 && b4 == 1 && b3 > 0 && b3 == i) {
        ArrayList<Integer> arrayList = new ArrayList();
        for (byte b7 = 0; b7 < paramUqm.Qnq(); b7++) {
          NMq nMq = paramUqm.Dne(b7);
          if (nMq != null)
            if (nMq.bzF == dEr.edi.Qnq) {
              arrayList.add(Integer.valueOf(AvN.Dne[nMq.Qnq()]));
            } else if (nMq.bzF == dEr.mte.Qnq) {
              this.Dne = nMq.Dne();
              this.Dne.Dne = 1;
            }  
        } 
        int[] arrayOfInt = new int[arrayList.size()];
        for (byte b8 = 0; b8 < arrayOfInt.length; b8++)
          arrayOfInt[b8] = ((Integer)arrayList.get(b8)).intValue(); 
        if (this.Dne != null && this.Dne.aFZ()) {
          WkD wkD = this.Dne.Dne().Dne("Explosion");
          if (wkD == null)
            return false; 
          wkD.Dne("FadeColors", arrayOfInt);
          return true;
        } 
        return false;
      } 
      return false;
    } 
    return false;
  }
  
  public NMq Dne() {
    return this.Dne;
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\VfL.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */