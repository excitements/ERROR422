import java.util.Collection;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import net.minecraft.client.Minecraft;

public class VzZ extends Qnq {
  private Set FWm = new HashSet();
  
  private hMY Dne;
  
  private Set bzF = new HashSet();
  
  private final Minecraft Dne;
  
  private fzy Dne;
  
  private final Set Qnq;
  
  private ZGT Dne = new ZGT();
  
  static Set Dne(VzZ paramVzZ) {
    return paramVzZ.FWm;
  }
  
  protected void div() {
    super.div();
    this.Qnq.retainAll((Collection<?>)this.Dne);
    if (this.Qnq.size() == this.Dne.size())
      this.Qnq.clear(); 
    byte b = 0;
    for (Sxs sxs : this.Dne) {
      if (!this.Qnq.contains(sxs)) {
        int i = sxs.Dne * 16;
        int j = sxs.FWm * 16;
        this.Dne.Dne("getChunk");
        qMV qMV = FWm(sxs.Dne, sxs.FWm);
        Dne(i, j, qMV);
        this.Dne.FWm();
        this.Qnq.add(sxs);
        if (++b >= 10)
          return; 
      } 
    } 
  }
  
  public boolean FWm(sMa paramsMa) {
    boolean bool = super.FWm(paramsMa);
    this.FWm.add(paramsMa);
    if (!bool)
      this.bzF.add(paramsMa); 
    return bool;
  }
  
  public void Zpi() {
    this.Dne.removeAll(this.FWm);
    byte b;
    for (b = 0; b < this.FWm.size(); b++) {
      sMa sMa = this.FWm.get(b);
      double d = sMa.IjH;
      int i = sMa.XHL;
      if (sMa.trS != 0.0F && Dne(d, i))
        FWm(d, i).FWm(sMa); 
    } 
    for (b = 0; b < this.FWm.size(); b++)
      FWm(this.FWm.get(b)); 
    this.FWm.clear();
    for (b = 0; b < this.Dne.size(); b++) {
      sMa sMa = this.Dne.get(b);
      if (sMa.FWm != null) {
        if (sMa.FWm.Zpi == 0.0F && sMa.FWm.Dne == sMa)
          continue; 
        sMa.FWm.Dne = null;
        sMa.FWm = null;
      } 
      if (sMa.Zpi != 0.0F) {
        double d = sMa.IjH;
        int i = sMa.XHL;
        if (sMa.trS != 0.0F && Dne(d, i))
          FWm(d, i).FWm(sMa); 
        this.Dne.remove(b--);
        FWm(sMa);
      } 
      continue;
    } 
  }
  
  public sMa FWm(int paramInt) {
    sMa sMa = (sMa)this.Dne.FWm(paramInt);
    if (sMa != null) {
      this.FWm.remove(sMa);
      bzF(sMa);
    } 
    return sMa;
  }
  
  public VzZ(fzy paramfzy, mrb parammrb, int paramInt1, int paramInt2, Bkx paramBkx, dLs paramdLs) {
    super(new KQb(), "MpServer", Jik.Dne(paramInt1), parammrb, paramBkx, paramdLs);
    this.Dne = (ZGT)Minecraft.Dne();
    this.Qnq = new HashSet();
    this.Dne = (ZGT)paramfzy;
    this.aFZ = paramInt2;
    aFZ(8, 64, 8);
    this.Dne = paramfzy.Dne;
  }
  
  public void Dne(int paramInt1, int paramInt2, boolean paramBoolean) {
    if (paramBoolean) {
      this.Dne.FWm(paramInt1, paramInt2);
    } else {
      this.Dne.FWm(paramInt1, paramInt2);
    } 
    if (!paramBoolean)
      Dne(paramInt1 * 16, 0, paramInt2 * 16, paramInt1 * 16 + 15, 256, paramInt2 * 16 + 15); 
  }
  
  static Set FWm(VzZ paramVzZ) {
    return paramVzZ.bzF;
  }
  
  public void aFZ(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6) {}
  
  public sMa Dne(int paramInt) {
    return (paramInt == ((Minecraft)this.Dne).Dne.aFZ) ? ((Minecraft)this.Dne).Dne : (sMa)this.Dne.Dne(paramInt);
  }
  
  public void bzF(sMa paramsMa) {
    super.bzF(paramsMa);
    this.FWm.remove(paramsMa);
  }
  
  public void IjH() {
    this.Dne.Dne(new yZV("Quitting"));
  }
  
  protected void FWm(sMa paramsMa) {
    super.FWm(paramsMa);
    if (this.FWm.contains(paramsMa))
      if (paramsMa.udO()) {
        this.bzF.add(paramsMa);
      } else {
        this.FWm.remove(paramsMa);
      }  
  }
  
  public void zGp(int paramInt1, int paramInt2, int paramInt3) {
    byte b1 = 16;
    Random random = new Random();
    for (byte b2 = 0; b2 < 'Ϩ'; b2++) {
      int i = paramInt1 + this.Dne.nextInt(b1) - this.Dne.nextInt(b1);
      int j = paramInt2 + this.Dne.nextInt(b1) - this.Dne.nextInt(b1);
      int k = paramInt3 + this.Dne.nextInt(b1) - this.Dne.nextInt(b1);
      int m = Dne(i, j, k);
      if (m == 0 && this.Dne.nextInt(8) > j && this.Dne.Qnq()) {
        Dne("depthsuspend", (i + this.Dne.nextFloat()), (j + this.Dne.nextFloat()), (k + this.Dne.nextFloat()), 0.0D, 0.0D, 0.0D);
      } else if (m > 0) {
        zKP.Dne[m].FWm(this, i, j, k, random);
      } 
    } 
  }
  
  public boolean FWm(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5) {
    aFZ(paramInt1, paramInt2, paramInt3, paramInt1, paramInt2, paramInt3);
    return FWm(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, 3);
  }
  
  protected void Dne(sMa paramsMa) {
    super.Dne(paramsMa);
    if (this.bzF.contains(paramsMa))
      this.bzF.remove(paramsMa); 
  }
  
  public Noo Dne(McM paramMcM) {
    Noo noo = super.Dne(paramMcM);
    noo.Dne("Forced entities", new QUe(this));
    noo.Dne("Retry entities", new QIz(this));
    return noo;
  }
  
  public void Dne(SFA paramSFA) {
    this.Dne = (ZGT)paramSFA;
  }
  
  public qDW Dne(Ebp paramEbp) {
    return new TNI((mKT)((Minecraft)this.Dne).Dne, paramEbp, ((Minecraft)this.Dne).Dne);
  }
  
  protected void aFZ() {
    if (!((Jik)this.Dne).FWm) {
      this.Dne = (ZGT)this.FWm;
      if (this.Dne.FWm()) {
        this.FWm = (float)(this.FWm + 0.01D);
      } else {
        this.FWm = (float)(this.FWm - 0.01D);
      } 
      if (this.FWm < 0.0F)
        this.FWm = 0.0F; 
      if (this.FWm > 1.0F)
        this.FWm = 1.0F; 
      this.bzF = this.Qnq;
      if (this.Dne.Dne()) {
        this.Qnq = (float)(this.Qnq + 0.01D);
      } else {
        this.Qnq = (float)(this.Qnq - 0.01D);
      } 
      if (this.Qnq < 0.0F)
        this.Qnq = 0.0F; 
      if (this.Qnq > 1.0F)
        this.Qnq = 1.0F; 
    } 
  }
  
  public void Dne(double paramDouble1, double paramDouble2, double paramDouble3, String paramString, float paramFloat1, float paramFloat2, boolean paramBoolean) {
    float f = 16.0F;
    if (paramFloat1 > 1.0F)
      f *= paramFloat1; 
    double d = ((Minecraft)this.Dne).Dne.Dne(paramDouble1, paramDouble2, paramDouble3);
    if (d < (f * f))
      if (paramBoolean && d > 100.0D) {
        double d1 = Math.sqrt(d) / 40.0D;
        ((Minecraft)this.Dne).Dne.Dne(paramString, (float)paramDouble1, (float)paramDouble2, (float)paramDouble3, paramFloat1, paramFloat2, (int)Math.round(d1 * 20.0D));
      } else {
        ((Minecraft)this.Dne).Dne.Dne(paramString, (float)paramDouble1, (float)paramDouble2, (float)paramDouble3, paramFloat1, paramFloat2);
      }  
  }
  
  public void Qnq() {
    super.Qnq();
    Dne(FWm() + 1L);
    FWm(bzF() + 1L);
    this.Dne.Dne("reEntryProcessing");
    for (byte b = 0; b < 10 && !this.bzF.isEmpty(); b++) {
      sMa sMa = this.bzF.iterator().next();
      this.bzF.remove(sMa);
      if (!this.Dne.contains(sMa))
        FWm(sMa); 
    } 
    this.Dne.FWm("connection");
    this.Dne.FWm();
    this.Dne.FWm("chunkCache");
    this.Dne.Dne();
    this.Dne.FWm("tiles");
    div();
    this.Dne.FWm();
    QXI.Dne();
    if (QXI.Dne != null && ((PJQ)QXI.Dne).Zpi == 0.0F)
      fRU.Dne().Dne(); 
  }
  
  protected ZfC Dne() {
    this.Dne = (ZGT)new hMY(this);
    return (ZfC)this.Dne;
  }
  
  public void Dne(double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, double paramDouble5, double paramDouble6, WkD paramWkD) {
    ((Minecraft)this.Dne).Dne.Dne(new ZIm(this, paramDouble1, paramDouble2, paramDouble3, paramDouble4, paramDouble5, paramDouble6, (BMa)((Minecraft)this.Dne).Dne, paramWkD));
  }
  
  public void Dne(int paramInt, sMa paramsMa) {
    sMa sMa1 = Dne(paramInt);
    if (sMa1 != null)
      bzF(sMa1); 
    this.FWm.add(paramsMa);
    paramsMa.aFZ = paramInt;
    if (!FWm(paramsMa))
      this.bzF.add(paramsMa); 
    this.Dne.Dne(paramInt, paramsMa);
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\VzZ.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */