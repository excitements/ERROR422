import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import net.minecraft.client.Minecraft;
import org.lwjgl.input.Keyboard;
import org.lwjgl.opengl.GL11;

public class qTt extends qVZ {
  private Pee FWm;
  
  private Pee Dne;
  
  private boolean aFZ;
  
  private final FiG Dne;
  
  private int Qnq;
  
  private bod FWm;
  
  private boolean Qnq;
  
  private bod Dne;
  
  private int Dne;
  
  private final boolean bzF;
  
  private String Dne;
  
  private int aFZ = 192;
  
  private int DyG;
  
  private int zGp = 1;
  
  private Pee Qnq = 'À';
  
  private Pee bzF;
  
  private mbZ Dne;
  
  private final NMq Dne = (NMq)"";
  
  private void FWm(char paramChar, int paramInt) {
    String str;
    switch (paramChar) {
      case '\026':
        FWm(qVZ.FWm());
        return;
    } 
    switch (paramInt) {
      case 14:
        str = Dne();
        if (str.length() > 0)
          Dne(str.substring(0, str.length() - 1)); 
        return;
      case 28:
        FWm("\n");
        return;
    } 
    if (BAQ.Dne(paramChar))
      FWm(Character.toString(paramChar)); 
  }
  
  public qTt(FiG paramFiG, NMq paramNMq, boolean paramBoolean) {
    this.Dne = (NMq)paramFiG;
    this.Dne = paramNMq;
    this.bzF = paramBoolean;
    if (paramNMq.aFZ()) {
      WkD wkD = paramNMq.Dne();
      this.Dne = (NMq)wkD.Dne("pages");
      if (this.Dne != null) {
        this.Dne = (NMq)this.Dne.Dne();
        this.zGp = this.Dne.Dne();
        if (this.zGp < 1)
          this.zGp = 1; 
      } 
    } 
    if (this.Dne == null && paramBoolean) {
      this.Dne = (NMq)new mbZ("pages");
      this.Dne.Dne(new QNx("1", ""));
      this.zGp = 1;
    } 
  }
  
  protected void Dne(char paramChar, int paramInt) {
    super.Dne(paramChar, paramInt);
    if (this.bzF != null)
      if (this.aFZ != 0) {
        bzF(paramChar, paramInt);
      } else {
        FWm(paramChar, paramInt);
      }  
  }
  
  public void Dne(int paramInt1, int paramInt2, float paramFloat) {
    GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
    ((Minecraft)this.Dne).Dne.Dne("/gui/book.png");
    int i = (this.FWm - this.Qnq) / 2;
    byte b = 2;
    FWm(i, b, 0, 0, this.Qnq, this.aFZ);
    if (this.aFZ != 0) {
      String str1;
      NMq nMq = this.Dne;
      if (this.bzF != null)
        if (this.Dne / 6 % 2 == 0) {
          str1 = nMq + "" + Dne.Dne + "_";
        } else {
          str1 = str1 + "" + Dne.div + "_";
        }  
      String str2 = KGL.Dne("book.editTitle");
      int j = this.Dne.Dne(str2);
      this.Dne.FWm(str2, i + 36 + (116 - j) / 2, b + 16 + 16, 0);
      int k = this.Dne.Dne(str1);
      this.Dne.FWm(str1, i + 36 + (116 - k) / 2, b + 48, 0);
      String str3 = String.format(KGL.Dne("book.byAuthor"), new Object[] { ((FiG)this.Dne).aFZ });
      int m = this.Dne.Dne(str3);
      this.Dne.FWm(Dne.IjH + str3, i + 36 + (116 - m) / 2, b + 48 + 10, 0);
      String str4 = KGL.Dne("book.finalizeWarning");
      this.Dne.Dne(str4, i + 36, b + 80, 116, 0);
    } else {
      String str1 = String.format(KGL.Dne("book.pageIndicator"), new Object[] { Integer.valueOf(this.DyG + 1), Integer.valueOf(this.zGp) });
      String str2 = "";
      if (this.Dne != null && this.DyG >= 0 && this.DyG < this.Dne.Dne()) {
        QNx qNx = (QNx)this.Dne.FWm(this.DyG);
        str2 = qNx.toString();
      } 
      if (this.bzF != null)
        if (this.Dne.FWm()) {
          str2 = str2 + "_";
        } else if (this.Dne / 6 % 2 == 0) {
          str2 = str2 + "" + Dne.Dne + "_";
        } else {
          str2 = str2 + "" + Dne.div + "_";
        }  
      int j = this.Dne.Dne(str1);
      this.Dne.FWm(str1, i - j + this.Qnq - 44, b + 16, 0);
      this.Dne.Dne(str2, i + 36, b + 16 + 16, 116, 0);
    } 
    super.Dne(paramInt1, paramInt2, paramFloat);
  }
  
  private void IjH() {
    if (this.Dne != null && this.Dne.Dne() < 50) {
      this.Dne.Dne(new QNx("" + (this.zGp + 1), ""));
      this.zGp++;
      this.Qnq = true;
    } 
  }
  
  private void FWm(String paramString) {
    String str1 = Dne();
    String str2 = str1 + paramString;
    int i = this.Dne.Dne(str2 + "" + Dne.Dne + "_", 118);
    if (i <= 118 && str2.length() < 256)
      Dne(str2); 
  }
  
  public void FWm() {
    Keyboard.enableRepeatEvents(false);
  }
  
  private void Dne(boolean paramBoolean) {
    if (this.bzF != null && this.Qnq != null && this.Dne != null) {
      while (this.Dne.Dne() > 1) {
        QNx qNx = (QNx)this.Dne.FWm(this.Dne.Dne() - 1);
        if (qNx.Dne != null && qNx.Dne.length() != 0)
          break; 
        this.Dne.Dne(this.Dne.Dne() - 1);
      } 
      if (this.Dne.aFZ()) {
        WkD wkD = this.Dne.Dne();
        wkD.Dne("pages", (oNe)this.Dne);
      } else {
        this.Dne.Dne("pages", (oNe)this.Dne);
      } 
      String str = "MC|BEdit";
      if (paramBoolean) {
        str = "MC|BSign";
        this.Dne.Dne("author", new QNx("author", ((FiG)this.Dne).aFZ));
        this.Dne.Dne("title", new QNx("title", this.Dne.trim()));
        this.Dne.bzF = dEr.CLK.Qnq;
      } 
      ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
      DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
      try {
        NER.Dne(this.Dne, dataOutputStream);
        this.Dne.Dne().FWm(new FaB(str, byteArrayOutputStream.toByteArray()));
      } catch (Exception exception) {
        exception.printStackTrace();
      } 
    } 
  }
  
  private void Dne(String paramString) {
    if (this.Dne != null && this.DyG >= 0 && this.DyG < this.Dne.Dne()) {
      QNx qNx = (QNx)this.Dne.FWm(this.DyG);
      qNx.Dne = paramString;
      this.Qnq = true;
    } 
  }
  
  public void Dne() {
    this.Dne.clear();
    Keyboard.enableRepeatEvents(true);
    if (this.bzF != null) {
      this.Dne.add(this.FWm = (bod)new Pee(3, this.FWm / 2 - 100, 4 + this.aFZ, 98, 20, KGL.Dne("book.signButton")));
      this.Dne.add(this.Dne = (NMq)new Pee(0, this.FWm / 2 + 2, 4 + this.aFZ, 98, 20, KGL.Dne("gui.done")));
      this.Dne.add(this.bzF = new Pee(5, this.FWm / 2 - 100, 4 + this.aFZ, 98, 20, KGL.Dne("book.finalizeButton")));
      this.Dne.add(this.Qnq = new Pee(4, this.FWm / 2 + 2, 4 + this.aFZ, 98, 20, KGL.Dne("gui.cancel")));
    } else {
      this.Dne.add(this.Dne = (NMq)new Pee(0, this.FWm / 2 - 100, 4 + this.aFZ, 200, 20, KGL.Dne("gui.done")));
    } 
    int i = (this.FWm - this.Qnq) / 2;
    byte b = 2;
    this.Dne.add(this.Dne = (NMq)new bod(1, i + 120, b + 154, true));
    this.Dne.add(this.FWm = new bod(2, i + 38, b + 154, false));
    zGp();
  }
  
  protected void Dne(Pee paramPee) {
    if (paramPee.Dne != null) {
      if (paramPee.aFZ == 0) {
        this.Dne.Dne((qVZ)null);
        Dne(false);
      } else if (paramPee.aFZ == 3 && this.bzF != null) {
        this.aFZ = 1;
      } else if (paramPee.aFZ == 1) {
        if (this.DyG < this.zGp - 1) {
          this.DyG++;
        } else if (this.bzF != null) {
          IjH();
          if (this.DyG < this.zGp - 1)
            this.DyG++; 
        } 
      } else if (paramPee.aFZ == 2) {
        if (this.DyG > 0)
          this.DyG--; 
      } else if (paramPee.aFZ == 5 && this.aFZ != 0) {
        Dne(true);
        this.Dne.Dne((qVZ)null);
      } else if (paramPee.aFZ == 4 && this.aFZ != 0) {
        this.aFZ = 0;
      } 
      zGp();
    } 
  }
  
  private String Dne() {
    if (this.Dne != null && this.DyG >= 0 && this.DyG < this.Dne.Dne()) {
      QNx qNx = (QNx)this.Dne.FWm(this.DyG);
      return qNx.toString();
    } 
    return "";
  }
  
  private void zGp() {
    ((bod)this.Dne).FWm = (this.aFZ == 0 && (this.DyG < this.zGp - 1 || this.bzF != null));
    this.FWm.FWm = (this.aFZ == 0 && this.DyG > 0);
    ((Pee)this.Dne).FWm = (this.bzF == null || this.aFZ == 0);
    if (this.bzF != null) {
      this.FWm.FWm = (this.aFZ == 0);
      this.Qnq.FWm = this.aFZ;
      this.bzF.FWm = this.aFZ;
      this.bzF.Dne = (this.Dne.trim().length() > 0) ? 1 : 0;
    } 
  }
  
  private void bzF(char paramChar, int paramInt) {
    switch (paramInt) {
      case 14:
        if (this.Dne.length() > 0) {
          this.Dne = (NMq)this.Dne.substring(0, this.Dne.length() - 1);
          zGp();
        } 
        return;
      case 28:
        if (this.Dne.length() > 0) {
          Dne(true);
          this.Dne.Dne((qVZ)null);
        } 
        return;
    } 
    if (this.Dne.length() < 16 && BAQ.Dne(paramChar)) {
      this.Dne += Character.toString(paramChar);
      zGp();
      this.Qnq = true;
    } 
  }
  
  public void bzF() {
    super.bzF();
    this.Dne++;
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\qTt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */