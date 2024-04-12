import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import net.minecraft.client.Minecraft;
import org.lwjgl.input.Keyboard;
import org.lwjgl.opengl.GL11;

public abstract class Sss extends qVZ {
  private NMq FWm;
  
  private NMq bzF;
  
  private int IjH;
  
  private boolean zGp;
  
  private onZ bzF;
  
  private int DyG;
  
  private int Zpi;
  
  private int mrb;
  
  protected final Set Dne;
  
  private boolean aFZ;
  
  private onZ Dne;
  
  private NMq Dne;
  
  protected int Dne;
  
  private boolean Qnq;
  
  private long FWm;
  
  private long bzF;
  
  protected int Qnq;
  
  protected int aFZ;
  
  private int div;
  
  protected int zGp;
  
  private onZ aFZ;
  
  private int XHL;
  
  private long Dne;
  
  private onZ FWm = null;
  
  private onZ Qnq = '¦';
  
  protected boolean bzF;
  
  protected static eKj Dne = new eKj();
  
  public Pdb Dne = '°';
  
  public void bzF() {
    super.bzF();
    if (!((Minecraft)this.Dne).Dne.udO() || ((Minecraft)this.Dne).Dne.Zpi != 0.0F)
      ((Minecraft)this.Dne).Dne.aFZ(); 
  }
  
  public void Dne(int paramInt1, int paramInt2, float paramFloat) {
    aFZ();
    onZ onZ1 = this.aFZ;
    int i = this.zGp;
    Dne(paramFloat, paramInt1, paramInt2);
    GL11.glDisable(32826);
    Cit.Dne();
    GL11.glDisable(2896);
    GL11.glDisable(2929);
    super.Dne(paramInt1, paramInt2, paramFloat);
    Cit.bzF();
    GL11.glPushMatrix();
    GL11.glTranslatef(onZ1, i, 0.0F);
    GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
    GL11.glEnable(32826);
    this.Dne = null;
    char c1 = 'ð';
    char c2 = 'ð';
    oCF.Dne(oCF.FWm, c1 / 1.0F, c2 / 1.0F);
    GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
    for (byte b = 0; b < this.Dne.bzF.size(); b++) {
      onZ onZ2 = this.Dne.bzF.get(b);
      Dne(onZ2);
      if (Dne(onZ2, paramInt1, paramInt2)) {
        this.Dne = (Pdb)onZ2;
        GL11.glDisable(2896);
        GL11.glDisable(2929);
        int k = onZ2.aFZ;
        int j = onZ2.zGp;
        Dne(k, j, k + 16, j + 16, -2130706433, -2130706433);
        GL11.glEnable(2896);
        GL11.glEnable(2929);
      } 
    } 
    Dne(paramInt1, paramInt2);
    fzy fzy = ((Minecraft)this.Dne).Dne.Dne;
    NMq nMq = (NMq)((this.Dne == null) ? fzy.FWm() : this.Dne);
    if (nMq != null) {
      byte b2 = 8;
      byte b1 = (this.Dne == null) ? 8 : 16;
      String str = null;
      if (this.Dne != null && this.Qnq != null) {
        nMq = nMq.Dne();
        nMq.Dne = geR.FWm(nMq.Dne / 2.0F);
      } else if (this.bzF && this.Dne.size() > 1) {
        nMq = nMq.Dne();
        nMq.Dne = this.XHL;
        if (nMq.Dne == 0)
          str = "" + Dne.ooe + "0"; 
      } 
      Dne(nMq, paramInt1 - onZ1 - b2, paramInt2 - i - b1, str);
    } 
    if (this.FWm != null) {
      float f = (float)(Minecraft.Dne() - this.Dne) / 100.0F;
      if (f >= 1.0F) {
        f = 1.0F;
        this.FWm = null;
      } 
      int j = this.bzF.aFZ - this.DyG;
      int k = this.bzF.zGp - this.div;
      int m = this.DyG + (int)(j * f);
      int n = this.div + (int)(k * f);
      Dne((NMq)this.FWm, m, n, (String)null);
    } 
    GL11.glPopMatrix();
    if (fzy.FWm() == null && this.Dne != null && this.Dne.Dne()) {
      NMq nMq1 = this.Dne.Dne();
      Dne(nMq1, paramInt1, paramInt2);
    } 
    GL11.glEnable(2896);
    GL11.glEnable(2929);
    Cit.FWm();
  }
  
  protected void Dne(onZ paramonZ, int paramInt1, int paramInt2, int paramInt3) {
    if (paramonZ != null)
      paramInt1 = paramonZ.Qnq; 
    ((Minecraft)this.Dne).Dne.Dne(this.Dne.Dne, paramInt1, paramInt2, paramInt3, ((Minecraft)this.Dne).Dne);
  }
  
  protected void Dne(List<String> paramList, int paramInt1, int paramInt2) {
    if (!paramList.isEmpty()) {
      GL11.glDisable(32826);
      Cit.Dne();
      GL11.glDisable(2896);
      GL11.glDisable(2929);
      int i = 0;
      for (String str : paramList) {
        int i3 = this.Dne.Dne(str);
        if (i3 > i)
          i = i3; 
      } 
      int j = paramInt1 + 12;
      int k = paramInt2 - 12;
      int m = 8;
      if (paramList.size() > 1)
        m += 2 + (paramList.size() - 1) * 10; 
      if (j + i > this.FWm)
        j -= 28 + i; 
      if (k + m + 6 > this.bzF)
        k = this.bzF - m - 6; 
      this.FWm = 300.0F;
      ((eKj)Dne).bzF = 300.0F;
      int n = -267386864;
      Dne(j - 3, k - 4, j + i + 3, k - 3, n, n);
      Dne(j - 3, k + m + 3, j + i + 3, k + m + 4, n, n);
      Dne(j - 3, k - 3, j + i + 3, k + m + 3, n, n);
      Dne(j - 4, k - 3, j - 3, k + m + 3, n, n);
      Dne(j + i + 3, k - 3, j + i + 4, k + m + 3, n, n);
      int i1 = 1347420415;
      int i2 = (i1 & 0xFEFEFE) >> 1 | i1 & 0xFF000000;
      Dne(j - 3, k - 3 + 1, j - 3 + 1, k + m + 3 - 1, i1, i2);
      Dne(j + i + 2, k - 3 + 1, j + i + 3, k + m + 3 - 1, i1, i2);
      Dne(j - 3, k - 3, j + i + 3, k - 3 + 1, i1, i1);
      Dne(j - 3, k + m + 2, j + i + 3, k + m + 3, i2, i2);
      for (byte b = 0; b < paramList.size(); b++) {
        String str = paramList.get(b);
        this.Dne.Dne(str, j, k, -1);
        if (b == 0)
          k += 2; 
        k += 10;
      } 
      this.FWm = 0.0F;
      ((eKj)Dne).bzF = 0.0F;
      GL11.glEnable(2896);
      GL11.glEnable(2929);
      Cit.FWm();
      GL11.glEnable(32826);
    } 
  }
  
  protected void Dne(int paramInt1, int paramInt2, int paramInt3) {
    super.Dne(paramInt1, paramInt2, paramInt3);
    boolean bool = (paramInt3 == ((fZI)((Minecraft)this.Dne).Dne).kGO.Dne + 100) ? true : false;
    onZ onZ1 = Dne(paramInt1, paramInt2);
    long l = Minecraft.Dne();
    this.zGp = (this.aFZ == onZ1 && l - this.bzF < 250L && this.Zpi == paramInt3) ? 1 : 0;
    this.aFZ = false;
    if (paramInt3 == 0 || paramInt3 == 1 || bool) {
      onZ onZ2 = this.aFZ;
      int i = this.zGp;
      boolean bool1 = (paramInt1 < onZ2 || paramInt2 < i || paramInt1 >= onZ2 + this.Dne || paramInt2 >= i + this.Qnq) ? true : false;
      int j = -1;
      if (onZ1 != null)
        j = onZ1.Qnq; 
      if (bool1)
        j = -999; 
      if (((fZI)((Minecraft)this.Dne).Dne).ATE && bool1 && ((Minecraft)this.Dne).Dne.Dne.FWm() == null) {
        this.Dne.Dne((qVZ)null);
        return;
      } 
      if (j != -1)
        if (((fZI)((Minecraft)this.Dne).Dne).ATE) {
          if (onZ1 != null && onZ1.Dne()) {
            this.FWm = onZ1;
            this.Dne = null;
            this.Qnq = (paramInt3 == 1) ? 1 : 0;
          } else {
            this.FWm = null;
          } 
        } else if (!this.bzF) {
          if (((Minecraft)this.Dne).Dne.Dne.FWm() == null) {
            if (paramInt3 == ((fZI)((Minecraft)this.Dne).Dne).kGO.Dne + 100) {
              Dne(onZ1, j, paramInt3, 3);
            } else {
              boolean bool2 = (j != -999 && (Keyboard.isKeyDown(42) || Keyboard.isKeyDown(54))) ? true : false;
              byte b = 0;
              if (bool2) {
                this.bzF = (onZ1 != null && onZ1.Dne()) ? onZ1.Dne() : null;
                b = 1;
              } else if (j == -999) {
                b = 4;
              } 
              Dne(onZ1, j, paramInt3, b);
            } 
            this.aFZ = true;
          } else {
            this.bzF = true;
            this.mrb = paramInt3;
            this.Dne.clear();
            if (paramInt3 == 0) {
              this.IjH = 0;
            } else if (paramInt3 == 1) {
              this.IjH = 1;
            } 
          } 
        }  
    } 
    this.aFZ = onZ1;
    this.bzF = l;
    this.Zpi = paramInt3;
  }
  
  public void FWm() {
    if (((Minecraft)this.Dne).Dne != null)
      this.Dne.Dne(((Minecraft)this.Dne).Dne); 
  }
  
  private onZ Dne(int paramInt1, int paramInt2) {
    for (byte b = 0; b < this.Dne.bzF.size(); b++) {
      onZ onZ1 = this.Dne.bzF.get(b);
      if (Dne(onZ1, paramInt1, paramInt2))
        return onZ1; 
    } 
    return null;
  }
  
  private boolean Dne(onZ paramonZ, int paramInt1, int paramInt2) {
    return Dne(paramonZ.aFZ, paramonZ.zGp, 16, 16, paramInt1, paramInt2);
  }
  
  public boolean Dne() {
    return false;
  }
  
  private void Dne(onZ paramonZ) {
    int i = paramonZ.aFZ;
    int j = paramonZ.zGp;
    NMq nMq1 = paramonZ.Dne();
    boolean bool1 = false;
    boolean bool2 = (paramonZ == this.FWm && this.Dne != null && this.Qnq == null) ? true : false;
    NMq nMq2 = ((Minecraft)this.Dne).Dne.Dne.FWm();
    String str = null;
    if (paramonZ == this.FWm && this.Dne != null && this.Qnq != null && nMq1 != null) {
      nMq1 = nMq1.Dne();
      nMq1.Dne /= 2;
    } else if (this.bzF && this.Dne.contains(paramonZ) && nMq2 != null) {
      if (this.Dne.size() == 1)
        return; 
      if (Pdb.Dne(paramonZ, nMq2, true) && this.Dne.Dne(paramonZ)) {
        nMq1 = nMq2.Dne();
        bool1 = true;
        Pdb.Dne((Set)this.Dne, this.IjH, nMq1, (paramonZ.Dne() == null) ? 0 : (paramonZ.Dne()).Dne);
        if (nMq1.Dne > nMq1.FWm()) {
          str = Dne.ooe + "" + nMq1.FWm();
          nMq1.Dne = nMq1.FWm();
        } 
        if (nMq1.Dne > paramonZ.Dne()) {
          str = Dne.ooe + "" + paramonZ.Dne();
          nMq1.Dne = paramonZ.Dne();
        } 
      } else {
        this.Dne.remove(paramonZ);
        zGp();
      } 
    } 
    this.FWm = 100.0F;
    ((eKj)Dne).bzF = 100.0F;
    if (nMq1 == null) {
      gDn gDn = paramonZ.Dne();
      if (gDn != null) {
        GL11.glDisable(2896);
        ((Minecraft)this.Dne).Dne.Dne("/gui/items.png");
        Dne(i, j, gDn, 16, 16);
        GL11.glEnable(2896);
        bool2 = true;
      } 
    } 
    if (!bool2) {
      if (bool1)
        Dne(i, j, i + 16, j + 16, -2130706433); 
      GL11.glEnable(2929);
      Dne.FWm((msA)this.Dne, (Snh)((Minecraft)this.Dne).Dne, nMq1, i, j);
      Dne.Dne((msA)this.Dne, (Snh)((Minecraft)this.Dne).Dne, nMq1, i, j, str);
    } 
    ((eKj)Dne).bzF = 0.0F;
    this.FWm = 0.0F;
  }
  
  public Sss(Pdb paramPdb) {
    this.Qnq = false;
    this.Dne = null;
    this.DyG = 0;
    this.div = 0;
    this.bzF = null;
    this.Dne = 0L;
    this.FWm = null;
    this.Qnq = null;
    this.FWm = 0L;
    this.Dne = (Pdb)new HashSet();
    this.IjH = 0;
    this.mrb = 0;
    this.aFZ = false;
    this.bzF = 0L;
    this.aFZ = null;
    this.Zpi = 0;
    this.bzF = null;
    this.Dne = paramPdb;
    this.aFZ = true;
  }
  
  protected boolean Dne(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6) {
    onZ onZ1 = this.aFZ;
    int i = this.zGp;
    paramInt5 -= onZ1;
    paramInt6 -= i;
    return (paramInt5 >= paramInt1 - 1 && paramInt5 < paramInt1 + paramInt3 + 1 && paramInt6 >= paramInt2 - 1 && paramInt6 < paramInt2 + paramInt4 + 1);
  }
  
  protected void Dne(String paramString, int paramInt1, int paramInt2) {
    Dne(Arrays.asList(new String[] { paramString }, ), paramInt1, paramInt2);
  }
  
  protected void Dne(char paramChar, int paramInt) {
    if (paramInt == 1 || paramInt == ((ulE)((fZI)((Minecraft)this.Dne).Dne).zGp).Dne)
      ((Minecraft)this.Dne).Dne.aFZ(); 
    Dne(paramInt);
    if (this.Dne != null && this.Dne.Dne())
      if (paramInt == ((fZI)((Minecraft)this.Dne).Dne).kGO.Dne) {
        Dne((onZ)this.Dne, ((onZ)this.Dne).Qnq, 0, 3);
      } else if (paramInt == ((fZI)((Minecraft)this.Dne).Dne).DyG.Dne) {
        Dne((onZ)this.Dne, ((onZ)this.Dne).Qnq, FWm() ? 1 : 0, 4);
      }  
  }
  
  protected void Dne(NMq paramNMq, int paramInt1, int paramInt2) {
    List<String> list = paramNMq.Dne(((Minecraft)this.Dne).Dne, ((fZI)((Minecraft)this.Dne).Dne).ooe);
    for (byte b = 0; b < list.size(); b++) {
      if (b == 0) {
        list.set(b, "§" + Integer.toHexString((paramNMq.Dne()).Dne) + (String)list.get(b));
      } else {
        list.set(b, Dne.div + (String)list.get(b));
      } 
    } 
    Dne(list, paramInt1, paramInt2);
  }
  
  protected void Dne(int paramInt1, int paramInt2, int paramInt3, long paramLong) {
    onZ onZ1 = Dne(paramInt1, paramInt2);
    NMq nMq = ((Minecraft)this.Dne).Dne.Dne.FWm();
    if (this.FWm != null && ((fZI)((Minecraft)this.Dne).Dne).ATE) {
      if (paramInt3 == 0 || paramInt3 == 1)
        if (this.Dne == null) {
          if (onZ1 != this.FWm)
            this.Dne = (Pdb)this.FWm.Dne().Dne(); 
        } else if (((NMq)this.Dne).Dne > 1 && onZ1 != null && Pdb.Dne(onZ1, (NMq)this.Dne, false)) {
          long l = Minecraft.Dne();
          if (this.Qnq == onZ1) {
            if (l - this.FWm > 500L) {
              Dne(this.FWm, this.FWm.Qnq, 0, 0);
              Dne(onZ1, onZ1.Qnq, 1, 0);
              Dne(this.FWm, this.FWm.Qnq, 0, 0);
              this.FWm = l + 750L;
              ((NMq)this.Dne).Dne--;
            } 
          } else {
            this.Qnq = onZ1;
            this.FWm = l;
          } 
        }  
    } else if (this.bzF && onZ1 != null && nMq != null && nMq.Dne > this.Dne.size() && Pdb.Dne(onZ1, nMq, true) && onZ1.Dne(nMq) && this.Dne.Dne(onZ1)) {
      this.Dne.add(onZ1);
      zGp();
    } 
  }
  
  protected void FWm(int paramInt1, int paramInt2, int paramInt3) {
    onZ onZ1 = Dne(paramInt1, paramInt2);
    onZ onZ2 = this.aFZ;
    int i = this.zGp;
    boolean bool = (paramInt1 < onZ2 || paramInt2 < i || paramInt1 >= onZ2 + this.Dne || paramInt2 >= i + this.Qnq) ? true : false;
    int j = -1;
    if (onZ1 != null)
      j = onZ1.Qnq; 
    if (bool)
      j = -999; 
    if (this.zGp != 0 && onZ1 != null && paramInt3 == 0 && this.Dne.Dne((NMq)null, onZ1)) {
      if (bzF()) {
        if (onZ1 != null && onZ1.Dne != null && this.bzF != null)
          for (onZ onZ3 : this.Dne.bzF) {
            if (onZ3 != null && onZ3.Dne(((Minecraft)this.Dne).Dne) && onZ3.Dne() && onZ3.Dne == onZ1.Dne && Pdb.Dne(onZ3, this.bzF, true))
              Dne(onZ3, onZ3.Qnq, paramInt3, 1); 
          }  
      } else {
        Dne(onZ1, j, paramInt3, 6);
      } 
      this.zGp = 0;
      this.bzF = 0L;
    } else {
      if (this.bzF && this.mrb != paramInt3) {
        this.bzF = false;
        this.Dne.clear();
        this.aFZ = true;
        return;
      } 
      if (this.aFZ != null) {
        this.aFZ = false;
        return;
      } 
      if (this.FWm != null && ((fZI)((Minecraft)this.Dne).Dne).ATE) {
        if (paramInt3 == 0 || paramInt3 == 1) {
          if (this.Dne == null && onZ1 != this.FWm)
            this.Dne = (Pdb)this.FWm.Dne(); 
          boolean bool1 = Pdb.Dne(onZ1, (NMq)this.Dne, false);
          if (j != -1 && this.Dne != null && bool1) {
            Dne(this.FWm, this.FWm.Qnq, paramInt3, 0);
            Dne(onZ1, j, 0, 0);
            if (((Minecraft)this.Dne).Dne.Dne.FWm() != null) {
              Dne(this.FWm, this.FWm.Qnq, paramInt3, 0);
              this.DyG = paramInt1 - onZ2;
              this.div = paramInt2 - i;
              this.bzF = this.FWm;
              this.FWm = (onZ)this.Dne;
              this.Dne = Minecraft.Dne();
            } else {
              this.FWm = null;
            } 
          } else if (this.Dne != null) {
            this.DyG = paramInt1 - onZ2;
            this.div = paramInt2 - i;
            this.bzF = this.FWm;
            this.FWm = (onZ)this.Dne;
            this.Dne = Minecraft.Dne();
          } 
          this.Dne = null;
          this.FWm = null;
        } 
      } else if (this.bzF && !this.Dne.isEmpty()) {
        Dne((onZ)null, -999, Pdb.Dne(0, this.IjH), 5);
        for (onZ onZ3 : this.Dne)
          Dne(onZ3, onZ3.Qnq, Pdb.Dne(1, this.IjH), 5); 
        Dne((onZ)null, -999, Pdb.Dne(2, this.IjH), 5);
      } else if (((Minecraft)this.Dne).Dne.Dne.FWm() != null) {
        if (paramInt3 == ((fZI)((Minecraft)this.Dne).Dne).kGO.Dne + 100) {
          Dne(onZ1, j, paramInt3, 3);
        } else {
          boolean bool1 = (j != -999 && (Keyboard.isKeyDown(42) || Keyboard.isKeyDown(54))) ? true : false;
          if (bool1)
            this.bzF = (onZ1 != null && onZ1.Dne()) ? onZ1.Dne() : null; 
          Dne(onZ1, j, paramInt3, bool1 ? 1 : 0);
        } 
      } 
    } 
    if (((Minecraft)this.Dne).Dne.Dne.FWm() == null)
      this.bzF = 0L; 
    this.bzF = false;
  }
  
  private void zGp() {
    NMq nMq = ((Minecraft)this.Dne).Dne.Dne.FWm();
    if (nMq != null && this.bzF) {
      this.XHL = nMq.Dne;
      for (onZ onZ1 : this.Dne) {
        NMq nMq1 = nMq.Dne();
        byte b = (onZ1.Dne() == null) ? 0 : (onZ1.Dne()).Dne;
        Pdb.Dne((Set)this.Dne, this.IjH, nMq1, b);
        if (nMq1.Dne > nMq1.FWm())
          nMq1.Dne = nMq1.FWm(); 
        if (nMq1.Dne > onZ1.Dne())
          nMq1.Dne = onZ1.Dne(); 
        this.XHL -= nMq1.Dne - b;
      } 
    } 
  }
  
  protected abstract void Dne(float paramFloat, int paramInt1, int paramInt2);
  
  public void Dne() {
    super.Dne();
    ((Minecraft)this.Dne).Dne.FWm = this.Dne;
    this.aFZ = (this.FWm - this.Dne) / 2;
    this.zGp = (this.bzF - this.Qnq) / 2;
  }
  
  protected void Dne(int paramInt1, int paramInt2) {}
  
  protected boolean Dne(int paramInt) {
    if (((Minecraft)this.Dne).Dne.Dne.FWm() == null && this.Dne != null)
      for (byte b = 0; b < 9; b++) {
        if (paramInt == 2 + b) {
          Dne((onZ)this.Dne, ((onZ)this.Dne).Qnq, b, 2);
          return true;
        } 
      }  
    return false;
  }
  
  private void Dne(NMq paramNMq, int paramInt1, int paramInt2, String paramString) {
    GL11.glTranslatef(0.0F, 0.0F, 32.0F);
    this.FWm = 200.0F;
    ((eKj)Dne).bzF = 200.0F;
    Dne.FWm((msA)this.Dne, (Snh)((Minecraft)this.Dne).Dne, paramNMq, paramInt1, paramInt2);
    Dne.Dne((msA)this.Dne, (Snh)((Minecraft)this.Dne).Dne, paramNMq, paramInt1, paramInt2 - ((this.Dne == null) ? 0 : 8), paramString);
    this.FWm = 0.0F;
    ((eKj)Dne).bzF = 0.0F;
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\Sss.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */