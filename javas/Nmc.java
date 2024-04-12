import net.minecraft.client.Minecraft;
import org.lwjgl.opengl.GL11;

class Nmc extends LSv {
  final KDD Dne;
  
  protected void Dne(int paramInt, boolean paramBoolean) {
    if (paramInt < KDD.Dne(this.Dne).Dne() + KDD.Dne(this.Dne).size()) {
      int i = KDD.Dne(this.Dne);
      KDD.Dne(this.Dne, paramInt);
      etB etB = (KDD.Dne(this.Dne).Dne() > paramInt) ? KDD.Dne(this.Dne).Dne(paramInt) : null;
      boolean bool1 = (KDD.Dne(this.Dne) >= 0 && KDD.Dne(this.Dne) < Dne() && (etB == null || etB.Dne == 61)) ? true : false;
      boolean bool2 = (KDD.Dne(this.Dne) < KDD.Dne(this.Dne).Dne()) ? true : false;
      (KDD.Dne(this.Dne)).Dne = bool1;
      (KDD.FWm(this.Dne)).Dne = bool2;
      (KDD.bzF(this.Dne)).Dne = bool2;
      if (paramBoolean && bool1) {
        KDD.Dne(this.Dne, paramInt);
      } else if (bool2 && qVZ.bzF() && i >= 0 && i < KDD.Dne(this.Dne).Dne()) {
        KDD.Dne(this.Dne).Dne(i, KDD.Dne(this.Dne));
      } 
    } 
  }
  
  protected int Dne() {
    return KDD.Dne(this.Dne).Dne() + KDD.Dne(this.Dne).size() + 1;
  }
  
  protected boolean Dne(int paramInt) {
    return (paramInt == KDD.Dne(this.Dne));
  }
  
  protected void Dne() {
    this.Dne.aFZ();
  }
  
  public Nmc(KDD paramKDD) {
    super((Minecraft)paramKDD.Dne, paramKDD.FWm, paramKDD.bzF, 32, paramKDD.bzF - 64, 36);
    this.Dne = paramKDD;
  }
  
  protected int bzF() {
    return Dne() * 36;
  }
  
  private void Qnq(int paramInt1, int paramInt2, int paramInt3, int paramInt4, WAR paramWAR) {
    int i;
    etB etB = KDD.Dne(this.Dne).Dne(paramInt1);
    synchronized (KDD.Dne()) {
      if (KDD.Dne() < 5 && !etB.Dne) {
        etB.Dne = true;
        etB.Dne = -2L;
        etB.Qnq = "";
        etB.bzF = "";
        KDD.FWm();
        (new FZs(this, etB)).start();
      } 
    } 
    boolean bool1 = (etB.Dne > 61) ? true : false;
    boolean bool2 = (etB.Dne < 61) ? true : false;
    boolean bool3 = (bool1 || bool2) ? true : false;
    this.Dne.FWm((msA)this.Dne.Dne, etB.Dne, paramInt2 + 2, paramInt3 + 1, 16777215);
    this.Dne.FWm((msA)this.Dne.Dne, etB.Qnq, paramInt2 + 2, paramInt3 + 12, 8421504);
    this.Dne.FWm((msA)this.Dne.Dne, etB.bzF, paramInt2 + 215 - this.Dne.Dne.Dne(etB.bzF), paramInt3 + 12, 8421504);
    if (bool3) {
      String str1 = Dne.aFZ + etB.aFZ;
      this.Dne.FWm((msA)this.Dne.Dne, str1, paramInt2 + 200 - this.Dne.Dne.Dne(str1), paramInt3 + 1, 8421504);
    } 
    if (((Minecraft)this.Dne.Dne).Dne.udO == null && !etB.bzF()) {
      this.Dne.FWm((msA)this.Dne.Dne, etB.FWm, paramInt2 + 2, paramInt3 + 12 + 11, 3158064);
    } else {
      this.Dne.FWm((msA)this.Dne.Dne, KGL.Dne("selectServer.hiddenAddress"), paramInt2 + 2, paramInt3 + 12 + 11, 3158064);
    } 
    GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
    ((Minecraft)this.Dne.Dne).Dne.Dne("/gui/icons.png");
    byte b1 = 0;
    boolean bool4 = false;
    String str = "";
    if (bool3) {
      str = bool1 ? "Client out of date!" : "Server out of date!";
      i = 5;
    } else if (etB.Dne && etB.Dne != -2L) {
      if (etB.Dne < 0L) {
        i = 5;
      } else if (etB.Dne < 150L) {
        i = 0;
      } else if (etB.Dne < 300L) {
        i = 1;
      } else if (etB.Dne < 600L) {
        i = 2;
      } else if (etB.Dne < 1000L) {
        i = 3;
      } else {
        i = 4;
      } 
      if (etB.Dne < 0L) {
        str = "(no connection)";
      } else {
        str = etB.Dne + "ms";
      } 
    } else {
      b1 = 1;
      i = (int)(Minecraft.Dne() / 100L + (paramInt1 * 2) & 0x7L);
      if (i > 4)
        i = 8 - i; 
      str = "Polling..";
    } 
    this.Dne.FWm(paramInt2 + 205, paramInt3, 0 + b1 * 10, 176 + i * 8, 10, 8);
    byte b2 = 4;
    if (this.aFZ >= paramInt2 + 205 - b2 && this.zGp >= paramInt3 - b2 && this.aFZ <= paramInt2 + 205 + 10 + b2 && this.zGp <= paramInt3 + 8 + b2)
      KDD.Dne(this.Dne, str); 
  }
  
  protected void Dne(int paramInt1, int paramInt2, int paramInt3, int paramInt4, WAR paramWAR) {
    if (paramInt1 < KDD.Dne(this.Dne).Dne()) {
      Qnq(paramInt1, paramInt2, paramInt3, paramInt4, paramWAR);
    } else if (paramInt1 < KDD.Dne(this.Dne).Dne() + KDD.Dne(this.Dne).size()) {
      FWm(paramInt1, paramInt2, paramInt3, paramInt4, paramWAR);
    } else {
      bzF(paramInt1, paramInt2, paramInt3, paramInt4, paramWAR);
    } 
  }
  
  private void FWm(int paramInt1, int paramInt2, int paramInt3, int paramInt4, WAR paramWAR) {
    jhx jhx = KDD.Dne(this.Dne).get(paramInt1 - KDD.Dne(this.Dne).Dne());
    this.Dne.FWm((msA)this.Dne.Dne, KGL.Dne("lanServer.title"), paramInt2 + 2, paramInt3 + 1, 16777215);
    this.Dne.FWm((msA)this.Dne.Dne, jhx.Dne(), paramInt2 + 2, paramInt3 + 12, 8421504);
    if (((Minecraft)this.Dne.Dne).Dne.udO != null) {
      this.Dne.FWm((msA)this.Dne.Dne, KGL.Dne("selectServer.hiddenAddress"), paramInt2 + 2, paramInt3 + 12 + 11, 3158064);
    } else {
      this.Dne.FWm((msA)this.Dne.Dne, jhx.FWm(), paramInt2 + 2, paramInt3 + 12 + 11, 3158064);
    } 
  }
  
  private void bzF(int paramInt1, int paramInt2, int paramInt3, int paramInt4, WAR paramWAR) {
    String str;
    this.Dne.Dne((msA)this.Dne.Dne, KGL.Dne("lanServer.scanning"), this.Dne.FWm / 2, paramInt3 + 1, 16777215);
    switch (KDD.FWm(this.Dne) / 3 % 4) {
      default:
        str = "O o o";
        break;
      case 1:
      case 3:
        str = "o O o";
        break;
      case 2:
        str = "o o O";
        break;
    } 
    this.Dne.Dne((msA)this.Dne.Dne, str, this.Dne.FWm / 2, paramInt3 + 12, 8421504);
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\Nmc.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */