import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import net.minecraft.client.Minecraft;
import org.lwjgl.opengl.GL11;

public class muJ extends ocu {
  private boolean Dne;
  
  private int Dne;
  
  private final List FWm = new ArrayList();
  
  private final List Dne;
  
  private final Minecraft Dne = (Minecraft)new ArrayList();
  
  private final List bzF = new ArrayList();
  
  public void FWm(String paramString) {
    if (this.Dne.isEmpty() || !((String)this.Dne.get(this.Dne.size() - 1)).equals(paramString))
      this.Dne.add(paramString); 
  }
  
  public int bzF() {
    return FWm() / 9;
  }
  
  private void Dne(String paramString, int paramInt1, int paramInt2, boolean paramBoolean) {
    boolean bool = Dne();
    boolean bool1 = true;
    if (paramInt1 != 0)
      bzF(paramInt1); 
    for (String str : this.Dne.Dne.Dne(paramString, geR.Dne(Dne() / Dne()))) {
      if (bool && this.Dne > null) {
        this.Dne = true;
        FWm(1);
      } 
      if (!bool1)
        str = " " + str; 
      bool1 = false;
      this.bzF.add(0, new WMY(paramInt2, str, paramInt1));
    } 
    while (this.bzF.size() > 100)
      this.bzF.remove(this.bzF.size() - 1); 
    if (!paramBoolean) {
      this.FWm.add(0, new WMY(paramInt2, paramString.trim(), paramInt1));
      while (this.FWm.size() > 100)
        this.FWm.remove(this.FWm.size() - 1); 
    } 
  }
  
  public void Dne(String paramString, Object... paramVarArgs) {
    Dne(irb.Dne().Dne(paramString, paramVarArgs));
  }
  
  public int FWm() {
    return FWm(Dne() ? ((fZI)this.Dne.Dne).div : ((fZI)this.Dne.Dne).DyG);
  }
  
  public void FWm() {
    this.bzF.clear();
    bzF();
    for (int i = this.FWm.size() - 1; i >= 0; i--) {
      WMY wMY = this.FWm.get(i);
      Dne(wMY.Dne(), wMY.FWm(), wMY.Dne(), true);
    } 
  }
  
  public Yuy Dne(int paramInt1, int paramInt2) {
    if (!Dne())
      return null; 
    IJm iJm = new IJm((fZI)this.Dne.Dne, this.Dne.Dne, this.Dne.FWm);
    int i = iJm.bzF();
    float f = Dne();
    int j = paramInt1 / i - 3;
    int k = paramInt2 / i - 25;
    j = geR.Dne(j / f);
    k = geR.Dne(k / f);
    if (j >= 0 && k >= 0) {
      int m = Math.min(bzF(), this.bzF.size());
      if (j <= geR.Dne(Dne() / Dne()) && k < this.Dne.Dne.Dne * m + m) {
        int n = k / (this.Dne.Dne.Dne + 1) + this.Dne;
        return new Yuy(this.Dne.Dne, this.bzF.get(n), j, k - (n - this.Dne) * this.Dne.Dne.Dne + n);
      } 
      return null;
    } 
    return null;
  }
  
  public void bzF(int paramInt) {
    Iterator<WMY> iterator = this.bzF.iterator();
    while (true) {
      if (!iterator.hasNext()) {
        iterator = this.FWm.iterator();
        while (true) {
          if (!iterator.hasNext())
            return; 
          WMY wMY1 = iterator.next();
          if (wMY1.FWm() == paramInt) {
            iterator.remove();
            return;
          } 
        } 
        break;
      } 
      WMY wMY = iterator.next();
      if (wMY.FWm() == paramInt) {
        iterator.remove();
        return;
      } 
    } 
  }
  
  public int Dne() {
    return Dne(((fZI)this.Dne.Dne).zGp);
  }
  
  public void Dne(int paramInt) {
    if (((fZI)this.Dne.Dne).Qnq != 2) {
      int i = bzF();
      boolean bool = false;
      byte b = 0;
      int j = this.bzF.size();
      float f = ((fZI)this.Dne.Dne).Qnq * 0.9F + 0.1F;
      if (j > 0) {
        if (Dne())
          bool = true; 
        float f1 = Dne();
        int k = geR.FWm(Dne() / f1);
        GL11.glPushMatrix();
        GL11.glTranslatef(2.0F, 20.0F, 0.0F);
        GL11.glScalef(f1, f1, 1.0F);
        for (byte b1 = 0; b1 + this.Dne < this.bzF.size() && b1 < i; b1++) {
          WMY wMY = this.bzF.get(b1 + this.Dne);
          if (wMY != null) {
            int m = paramInt - wMY.Dne();
            if (m < 200 || bool) {
              double d = m / 200.0D;
              d = 1.0D - d;
              d *= 10.0D;
              if (d < 0.0D)
                d = 0.0D; 
              if (d > 1.0D)
                d = 1.0D; 
              d *= d;
              int n = (int)(255.0D * d);
              if (bool)
                n = 255; 
              n = (int)(n * f);
              b++;
              if (n > 3) {
                byte b2 = 0;
                int i1 = -b1 * 9;
                Dne(b2, i1 - 9, b2 + k + 4, i1, n / 2 << 24);
                GL11.glEnable(3042);
                String str = wMY.Dne();
                if (((fZI)this.Dne.Dne).DyG == 0.0F)
                  str = vCA.Dne(str); 
                this.Dne.Dne.Dne(str, b2, i1 - 8, 16777215 + (n << 24));
              } 
            } 
          } 
        } 
        if (bool) {
          byte[] arrayOfByte = this.Dne.Dne.Dne;
          GL11.glTranslatef(-3.0F, 0.0F, 0.0F);
          int n = j * arrayOfByte + j;
          int m = b * arrayOfByte + b;
          int i1 = this.Dne * m / j;
          int i2 = m * m / n;
          if (n != m) {
            byte b2 = (i1 > 0) ? 170 : 96;
            int i3 = (this.Dne != null) ? 13382451 : 3355562;
            Dne(0, -i1, 2, -i1 - i2, i3 + (b2 << 24));
            Dne(2, -i1, 1, -i1 - i2, 13421772 + (b2 << 24));
          } 
        } 
        GL11.glPopMatrix();
      } 
    } 
  }
  
  public boolean Dne() {
    return this.Dne.Dne instanceof SlE;
  }
  
  public static final int FWm(float paramFloat) {
    char c = '´';
    byte b = 20;
    return geR.Dne(paramFloat * (c - b) + b);
  }
  
  public List Dne() {
    return (List)this.Dne;
  }
  
  public void FWm(int paramInt) {
    this.Dne += paramInt;
    int i = this.bzF.size();
    if (this.Dne > i - bzF())
      this.Dne = i - bzF(); 
    if (this.Dne <= null) {
      this.Dne = false;
      this.Dne = false;
    } 
  }
  
  public void bzF() {
    this.Dne = false;
    this.Dne = false;
  }
  
  public static final int Dne(float paramFloat) {
    char c = 'ŀ';
    byte b = 40;
    return geR.Dne(paramFloat * (c - b) + b);
  }
  
  public float Dne() {
    return ((fZI)this.Dne.Dne).aFZ;
  }
  
  public muJ(Minecraft paramMinecraft) {
    this.Dne = false;
    this.Dne = false;
    this.Dne = paramMinecraft;
  }
  
  public void Dne() {
    this.bzF.clear();
    this.FWm.clear();
    this.Dne.clear();
  }
  
  public void Dne(String paramString, int paramInt) {
    Dne(paramString, paramInt, this.Dne.Dne.Dne(), false);
    this.Dne.Dne().Dne("[CHAT] " + paramString);
  }
  
  public void Dne(String paramString) {
    Dne(paramString, 0);
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\muJ.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */