import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import net.minecraft.client.Minecraft;
import org.lwjgl.input.Keyboard;
import org.lwjgl.input.Mouse;

public class SlE extends qVZ {
  private String FWm;
  
  private URI Dne;
  
  protected mHN Dne;
  
  private int Qnq;
  
  private int Dne;
  
  private List FWm;
  
  private boolean Qnq;
  
  private String Dne = "";
  
  private boolean bzF;
  
  public SlE(String paramString) {
    this.Dne = -1;
    this.bzF = false;
    this.Qnq = false;
    this.Qnq = false;
    this.FWm = new ArrayList();
    this.Dne = null;
    this.FWm = (List)"";
    this.FWm = (List)paramString;
  }
  
  public boolean Dne() {
    return false;
  }
  
  public void bzF() {
    this.Dne.Dne();
  }
  
  private void Dne(URI paramURI) {
    try {
      Class<?> clazz = Class.forName("java.awt.Desktop");
      Object object = clazz.getMethod("getDesktop", new Class[0]).invoke(null, new Object[0]);
      clazz.getMethod("browse", new Class[] { URI.class }).invoke(object, new Object[] { paramURI });
    } catch (Throwable throwable) {
      throwable.printStackTrace();
    } 
  }
  
  protected void Dne(char paramChar, int paramInt) {
    this.Qnq = false;
    if (paramInt == 15) {
      b_();
    } else {
      this.bzF = false;
    } 
    if (paramInt == 1) {
      this.Dne.Dne((qVZ)null);
    } else if (paramInt == 28) {
      String str = this.Dne.Dne().trim();
      if (str.length() > 0) {
        ((Minecraft)this.Dne).Dne.Dne().FWm(str);
        if (!this.Dne.Dne(str))
          ((Minecraft)this.Dne).Dne.FWm(str); 
      } 
      this.Dne.Dne((qVZ)null);
    } else if (paramInt == 200) {
      Dne(-1);
    } else if (paramInt == 208) {
      Dne(1);
    } else if (paramInt == 201) {
      ((Minecraft)this.Dne).Dne.Dne().FWm(((Minecraft)this.Dne).Dne.Dne().bzF() - 1);
    } else if (paramInt == 209) {
      ((Minecraft)this.Dne).Dne.Dne().FWm(-((Minecraft)this.Dne).Dne.Dne().bzF() + 1);
    } else {
      this.Dne.Dne(paramChar, paramInt);
    } 
  }
  
  private void Dne(String paramString1, String paramString2) {
    if (paramString1.length() >= 1) {
      ((MJs)((Minecraft)this.Dne).Dne).Dne.FWm(new efs(paramString1));
      this.Qnq = true;
    } 
  }
  
  public void Qnq() {
    super.Qnq();
    int i = Mouse.getEventDWheel();
    if (i != 0) {
      if (i > 1)
        i = 1; 
      if (i < -1)
        i = -1; 
      if (!bzF())
        i *= 7; 
      ((Minecraft)this.Dne).Dne.Dne().FWm(i);
    } 
  }
  
  public void FWm() {
    Keyboard.enableRepeatEvents(false);
    ((Minecraft)this.Dne).Dne.Dne().bzF();
  }
  
  public void b_() {
    if (this.bzF) {
      this.Dne.FWm(this.Dne.Dne(-1, this.Dne.FWm(), false) - this.Dne.FWm());
      if (this.Qnq >= this.FWm.size())
        this.Qnq = false; 
    } else {
      int i = this.Dne.Dne(-1, this.Dne.FWm(), false);
      this.FWm.clear();
      this.Qnq = false;
      String str2 = this.Dne.Dne().substring(i).toLowerCase();
      String str1 = this.Dne.Dne().substring(0, this.Dne.FWm());
      Dne(str1, str2);
      if (this.FWm.isEmpty())
        return; 
      this.bzF = true;
      this.Dne.FWm(i - this.Dne.FWm());
    } 
    if (this.FWm.size() > 1) {
      StringBuilder stringBuilder = new StringBuilder();
      for (String str : this.FWm) {
        if (stringBuilder.length() > 0)
          stringBuilder.append(", "); 
        stringBuilder.append(str);
      } 
      ((Minecraft)this.Dne).Dne.Dne().Dne(stringBuilder.toString(), 1);
    } 
    this.Dne.FWm(this.FWm.get(this.Qnq++));
  }
  
  protected void Dne(int paramInt1, int paramInt2, int paramInt3) {
    if (paramInt3 == 0 && ((fZI)((Minecraft)this.Dne).Dne).div) {
      Yuy yuy = ((Minecraft)this.Dne).Dne.Dne().Dne(Mouse.getX(), Mouse.getY());
      if (yuy != null) {
        URI uRI = yuy.Dne();
        if (uRI != null) {
          if (((fZI)((Minecraft)this.Dne).Dne).IjH != null) {
            this.Dne = (String)uRI;
            this.Dne.Dne(new vBZ(this, yuy.Dne(), 0, false));
          } else {
            Dne(uRI);
          } 
          return;
        } 
      } 
    } 
    this.Dne.Dne(paramInt1, paramInt2, paramInt3);
    super.Dne(paramInt1, paramInt2, paramInt3);
  }
  
  public void Dne() {
    Keyboard.enableRepeatEvents(true);
    this.Dne = ((Minecraft)this.Dne).Dne.Dne().Dne().size();
    this.Dne = (String)new mHN((msA)this.Dne, 4, this.bzF - 12, this.FWm - 4, 12);
    this.Dne.aFZ(100);
    this.Dne.Dne(false);
    this.Dne.FWm(true);
    this.Dne.Dne((String)this.FWm);
    this.Dne.Qnq(false);
  }
  
  public void Dne(int paramInt1, int paramInt2, float paramFloat) {
    Dne(2, this.bzF - 14, this.FWm - 2, this.bzF - 2, -2147483648);
    this.Dne.Qnq();
    super.Dne(paramInt1, paramInt2, paramFloat);
  }
  
  public void Dne(boolean paramBoolean, int paramInt) {
    if (paramInt == 0) {
      if (paramBoolean)
        Dne((URI)this.Dne); 
      this.Dne = null;
      this.Dne.Dne(this);
    } 
  }
  
  public void Dne(int paramInt) {
    int i = this.Dne + paramInt;
    int j = ((Minecraft)this.Dne).Dne.Dne().Dne().size();
    if (i < 0)
      i = 0; 
    if (i > j)
      i = j; 
    if (i != this.Dne)
      if (i == j) {
        this.Dne = j;
        this.Dne.Dne(this.Dne);
      } else {
        if (this.Dne == j)
          this.Dne = this.Dne.Dne(); 
        this.Dne.Dne(((Minecraft)this.Dne).Dne.Dne().Dne().get(i));
        this.Dne = i;
      }  
  }
  
  public SlE() {
    this.Dne = -1;
    this.bzF = false;
    this.Qnq = false;
    this.Qnq = false;
    this.FWm = new ArrayList();
    this.Dne = null;
    this.FWm = (List)"";
  }
  
  public void Dne(String[] paramArrayOfString) {
    if (this.Qnq) {
      this.FWm.clear();
      String[] arrayOfString = paramArrayOfString;
      int i = paramArrayOfString.length;
      for (byte b = 0; b < i; b++) {
        String str = arrayOfString[b];
        if (str.length() > 0)
          this.FWm.add(str); 
      } 
      if (this.FWm.size() > 0) {
        this.bzF = true;
        b_();
      } 
    } 
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\SlE.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */