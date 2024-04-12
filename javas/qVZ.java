import java.awt.Toolkit;
import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import java.util.ArrayList;
import java.util.List;
import net.minecraft.client.Minecraft;
import org.lwjgl.input.Keyboard;
import org.lwjgl.input.Mouse;

public class qVZ extends ocu {
  protected Minecraft Dne;
  
  public int FWm;
  
  public boolean FWm = false;
  
  public int bzF;
  
  protected List Dne;
  
  public static final boolean Dne = (Minecraft.Dne() == ZPT.Qnq) ? 1 : 0;
  
  private long Dne;
  
  private int Qnq;
  
  public lJS Dne;
  
  protected msA Dne;
  
  private int Dne;
  
  private Pee Dne = (Pee)new ArrayList();
  
  public static boolean bzF() {
    return (Keyboard.isKeyDown(42) || Keyboard.isKeyDown(54));
  }
  
  protected void Dne(Pee paramPee) {}
  
  public void DyG() {
    while (Mouse.next())
      Qnq(); 
    while (Keyboard.next())
      div(); 
  }
  
  public void bzF() {}
  
  public void FWm(int paramInt) {
    if (((Minecraft)this.Dne).Dne != null) {
      Dne(0, 0, this.FWm, this.bzF, -1072689136, -804253680);
    } else {
      bzF(paramInt);
    } 
  }
  
  public static void bzF(String paramString) {
    try {
      StringSelection stringSelection = new StringSelection(paramString);
      Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, (ClipboardOwner)null);
    } catch (Exception exception) {}
  }
  
  public void aFZ() {
    FWm(0);
  }
  
  public boolean Dne() {
    return true;
  }
  
  public void Dne(int paramInt1, int paramInt2, float paramFloat) {
    for (byte b = 0; b < this.Dne.size(); b++) {
      Pee pee = this.Dne.get(b);
      pee.Dne((Minecraft)this.Dne, paramInt1, paramInt2);
    } 
  }
  
  public void Dne(Minecraft paramMinecraft, int paramInt1, int paramInt2) {
    this.Dne = (Pee)new lJS(paramMinecraft);
    this.Dne = (Pee)paramMinecraft;
    this.Dne = (Pee)paramMinecraft.Dne;
    this.FWm = paramInt1;
    this.bzF = paramInt2;
    this.Dne.clear();
    Dne();
  }
  
  public void FWm() {}
  
  protected void Dne(int paramInt1, int paramInt2, int paramInt3) {
    if (paramInt3 == 0)
      for (byte b = 0; b < this.Dne.size(); b++) {
        Pee pee = this.Dne.get(b);
        if (pee.Dne((Minecraft)this.Dne, paramInt1, paramInt2)) {
          this.Dne = pee;
          ((Minecraft)this.Dne).Dne.Dne("random.click", 1.0F, 1.0F);
          Dne(pee);
        } 
      }  
  }
  
  protected void Dne(char paramChar, int paramInt) {
    if (paramInt == 1) {
      this.Dne.Dne((qVZ)null);
      this.Dne.aFZ();
    } 
  }
  
  public void Dne(boolean paramBoolean, int paramInt) {}
  
  protected void Dne(int paramInt1, int paramInt2, int paramInt3, long paramLong) {}
  
  public static String FWm() {
    try {
      Transferable transferable = Toolkit.getDefaultToolkit().getSystemClipboard().getContents(null);
      if (transferable != null && transferable.isDataFlavorSupported(DataFlavor.stringFlavor))
        return (String)transferable.getTransferData(DataFlavor.stringFlavor); 
    } catch (Exception exception) {}
    return "";
  }
  
  public static boolean FWm() {
    boolean bool = (Keyboard.isKeyDown(28) && Keyboard.getEventCharacter() == '\000') ? true : false;
    return (Keyboard.isKeyDown(29) || Keyboard.isKeyDown(157) || (Dne != null && (bool || Keyboard.isKeyDown(219) || Keyboard.isKeyDown(220))));
  }
  
  public void Qnq() {
    int i = Mouse.getEventX() * this.FWm / ((Minecraft)this.Dne).Dne;
    int j = this.bzF - Mouse.getEventY() * this.bzF / ((Minecraft)this.Dne).FWm - 1;
    if (Mouse.getEventButtonState()) {
      if (((fZI)((Minecraft)this.Dne).Dne).ATE && this.Qnq++ > 0)
        return; 
      this.Dne = Mouse.getEventButton();
      this.Dne = Minecraft.Dne();
      Dne(i, j, this.Dne);
    } else if (Mouse.getEventButton() != -1) {
      if (((fZI)((Minecraft)this.Dne).Dne).ATE && --this.Qnq > 0)
        return; 
      this.Dne = -1;
      FWm(i, j, Mouse.getEventButton());
    } else if (this.Dne != -1 && this.Dne > 0L) {
      long l = Minecraft.Dne() - this.Dne;
      Dne(i, j, this.Dne, l);
    } 
  }
  
  public void div() {
    if (Keyboard.getEventKeyState()) {
      int i = Keyboard.getEventKey();
      char c = Keyboard.getEventCharacter();
      if (i == 87) {
        this.Dne.div();
        return;
      } 
      if (Dne != null && i == 28 && c == '\000')
        i = 29; 
      Dne(c, i);
    } 
  }
  
  public void Dne() {}
  
  public qVZ() {
    this.Dne = null;
    this.Dne = false;
    this.Dne = 0L;
    this.Qnq = 0;
  }
  
  protected void FWm(int paramInt1, int paramInt2, int paramInt3) {
    if (this.Dne != null && paramInt3 == 0) {
      this.Dne.Dne(paramInt1, paramInt2);
      this.Dne = null;
    } 
  }
  
  public void bzF(int paramInt) {
    // Byte code:
    //   0: sipush #2896
    //   3: invokestatic glDisable : (I)V
    //   6: sipush #2912
    //   9: invokestatic glDisable : (I)V
    //   12: getstatic WAR.Dne : LWAR;
    //   15: astore_2
    //   16: aload_0
    //   17: getfield Dne : Lnet/minecraft/client/Minecraft;
    //   20: getfield Dne : LSnh;
    //   23: ldc_w '/rock.png'
    //   26: invokevirtual Dne : (Ljava/lang/String;)V
    //   29: fconst_1
    //   30: fconst_1
    //   31: fconst_1
    //   32: fconst_1
    //   33: invokestatic glColor4f : (FFFF)V
    //   36: ldc_w 32.0
    //   39: fstore_3
    //   40: aload_2
    //   41: invokevirtual Dne : ()V
    //   44: aload_2
    //   45: ldc_w 4210752
    //   48: invokevirtual bzF : (I)V
    //   51: aload_2
    //   52: dconst_0
    //   53: aload_0
    //   54: getfield bzF : I
    //   57: i2d
    //   58: dconst_0
    //   59: dconst_0
    //   60: aload_0
    //   61: getfield bzF : I
    //   64: i2f
    //   65: fload_3
    //   66: fdiv
    //   67: iload_1
    //   68: i2f
    //   69: fadd
    //   70: f2d
    //   71: invokevirtual Dne : (DDDDD)V
    //   74: aload_2
    //   75: aload_0
    //   76: getfield FWm : I
    //   79: i2d
    //   80: aload_0
    //   81: getfield bzF : I
    //   84: i2d
    //   85: dconst_0
    //   86: aload_0
    //   87: getfield FWm : I
    //   90: i2f
    //   91: fload_3
    //   92: fdiv
    //   93: f2d
    //   94: aload_0
    //   95: getfield bzF : I
    //   98: i2f
    //   99: fload_3
    //   100: fdiv
    //   101: iload_1
    //   102: i2f
    //   103: fadd
    //   104: f2d
    //   105: invokevirtual Dne : (DDDDD)V
    //   108: aload_2
    //   109: aload_0
    //   110: getfield FWm : I
    //   113: i2d
    //   114: dconst_0
    //   115: dconst_0
    //   116: aload_0
    //   117: getfield FWm : I
    //   120: i2f
    //   121: fload_3
    //   122: fdiv
    //   123: f2d
    //   124: iload_1
    //   125: i2d
    //   126: invokevirtual Dne : (DDDDD)V
    //   129: aload_2
    //   130: dconst_0
    //   131: dconst_0
    //   132: dconst_0
    //   133: dconst_0
    //   134: iload_1
    //   135: i2d
    //   136: invokevirtual Dne : (DDDDD)V
    //   139: aload_2
    //   140: invokevirtual Dne : ()I
    //   143: pop
    //   144: return
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\qVZ.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */