import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class EnH implements ZfC {
  private List Dne;
  
  private YHU Dne;
  
  public boolean Dne;
  
  private Tfm Dne;
  
  private qMV Dne;
  
  private Set Dne;
  
  private ZfC Dne;
  
  private RAN Dne = (RAN)new HashSet();
  
  private void Dne(qMV paramqMV) {
    if (this.Dne != null)
      try {
        this.Dne.FWm(this.Dne, paramqMV);
      } catch (Exception exception) {
        exception.printStackTrace();
      }  
  }
  
  public EyB Dne(Qnq paramQnq, String paramString, int paramInt1, int paramInt2, int paramInt3) {
    return this.Dne.Dne(paramQnq, paramString, paramInt1, paramInt2, paramInt3);
  }
  
  public qMV Dne(int paramInt1, int paramInt2) {
    qMV qMV1 = (qMV)this.Dne.Dne(Sxs.Dne(paramInt1, paramInt2));
    return (qMV1 == null) ? ((this.Dne.FWm == null && this.Dne == null) ? (qMV)this.Dne : FWm(paramInt1, paramInt2)) : qMV1;
  }
  
  public String Dne() {
    return "ServerChunkCache: " + this.Dne.Dne() + " Drop: " + this.Dne.size();
  }
  
  public qMV FWm(int paramInt1, int paramInt2) {
    long l = Sxs.Dne(paramInt1, paramInt2);
    this.Dne.remove(Long.valueOf(l));
    qMV qMV1 = (qMV)this.Dne.Dne(l);
    if (qMV1 == null) {
      qMV1 = bzF(paramInt1, paramInt2);
      if (qMV1 == null)
        if (this.Dne == null) {
          RAN rAN = this.Dne;
        } else {
          try {
            qMV1 = this.Dne.Dne(paramInt1, paramInt2);
          } catch (Throwable throwable) {
            McM mcM = McM.Dne(throwable, "Exception generating new chunk");
            Noo noo = mcM.Dne("Chunk to be generated");
            noo.Dne("Location", String.format("%d,%d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) }));
            noo.Dne("Position hash", Long.valueOf(l));
            noo.Dne("Generator", this.Dne.Dne());
            throw new kaJ(mcM);
          } 
        }  
      this.Dne.Dne(l, qMV1);
      this.Dne.add(qMV1);
      if (qMV1 != null)
        qMV1.bzF(); 
      qMV1.Dne(this, this, paramInt1, paramInt2);
    } 
    return qMV1;
  }
  
  public boolean FWm() {
    return (this.Dne.zGp == 0);
  }
  
  public void Dne() {
    if (this.Dne != null)
      this.Dne.FWm(); 
  }
  
  public void FWm(int paramInt1, int paramInt2) {
    if (this.Dne.Dne.FWm()) {
      iSh iSh = this.Dne.Dne();
      int i = paramInt1 * 16 + 8 - iSh.Dne;
      int j = paramInt2 * 16 + 8 - iSh.bzF;
      char c = '';
      if (i < -c || i > c || j < -c || j > c)
        this.Dne.add(Long.valueOf(Sxs.Dne(paramInt1, paramInt2))); 
    } else {
      this.Dne.add(Long.valueOf(Sxs.Dne(paramInt1, paramInt2)));
    } 
  }
  
  public boolean Dne(int paramInt1, int paramInt2) {
    return this.Dne.Dne(Sxs.Dne(paramInt1, paramInt2));
  }
  
  public int Dne() {
    return this.Dne.Dne();
  }
  
  public void Dne(int paramInt1, int paramInt2) {}
  
  public void FWm() {
    for (qMV qMV1 : this.Dne)
      FWm(qMV1.Dne, qMV1.FWm); 
  }
  
  private void FWm(qMV paramqMV) {
    if (this.Dne != null)
      try {
        paramqMV.Dne = this.Dne.FWm();
        this.Dne.Dne(this.Dne, paramqMV);
      } catch (IOException iOException) {
        iOException.printStackTrace();
      } catch (div div) {
        div.printStackTrace();
      }  
  }
  
  public List Dne(Icc paramIcc, int paramInt1, int paramInt2, int paramInt3) {
    return this.Dne.Dne(paramIcc, paramInt1, paramInt2, paramInt3);
  }
  
  public boolean Dne() {
    if (this.Dne.zGp == 0) {
      for (byte b = 0; b < 100; b++) {
        if (!this.Dne.isEmpty()) {
          Long long_ = this.Dne.iterator().next();
          qMV qMV1 = (qMV)this.Dne.Dne(long_.longValue());
          qMV1.Qnq();
          FWm(qMV1);
          Dne(qMV1);
          this.Dne.remove(long_);
          this.Dne.FWm(long_.longValue());
          this.Dne.remove(qMV1);
        } 
      } 
      if (this.Dne != null)
        this.Dne.Dne(); 
    } 
    return this.Dne.Dne();
  }
  
  public void Dne(ZfC paramZfC, int paramInt1, int paramInt2) {
    qMV qMV1 = Dne(paramInt1, paramInt2);
    if (!qMV1.bzF) {
      qMV1.bzF = true;
      if (this.Dne != null) {
        this.Dne.Dne(paramZfC, paramInt1, paramInt2);
        qMV1.aFZ();
      } 
    } 
  }
  
  public boolean Dne(boolean paramBoolean, TaY paramTaY) {
    byte b1 = 0;
    for (byte b2 = 0; b2 < this.Dne.size(); b2++) {
      qMV qMV1 = this.Dne.get(b2);
      if (paramBoolean)
        Dne(qMV1); 
      if (qMV1.Dne(paramBoolean)) {
        FWm(qMV1);
        qMV1.Qnq = false;
        if (++b1 == 24 && !paramBoolean)
          return false; 
      } 
    } 
    return true;
  }
  
  private qMV bzF(int paramInt1, int paramInt2) {
    if (this.Dne == null)
      return null; 
    try {
      qMV qMV1 = this.Dne.Dne(this.Dne, paramInt1, paramInt2);
      if (qMV1 != null) {
        qMV1.Dne = this.Dne.FWm();
        if (this.Dne != null)
          this.Dne.Dne(paramInt1, paramInt2); 
      } 
      return qMV1;
    } catch (Exception exception) {
      exception.printStackTrace();
      return null;
    } 
  }
  
  public EnH(RAN paramRAN, YHU paramYHU, ZfC paramZfC) {
    this.Dne = true;
    this.Dne = (RAN)new Tfm();
    this.Dne = (RAN)new ArrayList();
    this.Dne = (RAN)new BJH(paramRAN, 0, 0);
    this.Dne = paramRAN;
    this.Dne = (RAN)paramYHU;
    this.Dne = (RAN)paramZfC;
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\EnH.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */