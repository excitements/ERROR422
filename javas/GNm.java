import java.io.File;
import java.util.ArrayList;
import java.util.List;
import net.minecraft.client.Minecraft;

public class GNm {
  private final List Dne;
  
  private final Minecraft Dne = (Minecraft)new ArrayList();
  
  public void FWm() {
    try {
      mbZ mbZ = new mbZ();
      for (etB etB : this.Dne)
        mbZ.Dne(etB.Dne()); 
      WkD wkD = new WkD();
      wkD.Dne("servers", mbZ);
      VVx.Dne(wkD, new File(this.Dne.Dne, "servers.dat"));
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  public void Dne(etB parametB) {
    this.Dne.add(parametB);
  }
  
  public etB Dne(int paramInt) {
    return this.Dne.get(paramInt);
  }
  
  public static void FWm(etB parametB) {
    // Byte code:
    //   0: new GNm
    //   3: dup
    //   4: invokestatic Dne : ()Lnet/minecraft/client/Minecraft;
    //   7: invokespecial <init> : (Lnet/minecraft/client/Minecraft;)V
    //   10: astore_1
    //   11: aload_1
    //   12: invokevirtual Dne : ()V
    //   15: iconst_0
    //   16: istore_2
    //   17: iload_2
    //   18: aload_1
    //   19: invokevirtual Dne : ()I
    //   22: if_icmpge -> 74
    //   25: aload_1
    //   26: iload_2
    //   27: invokevirtual Dne : (I)LetB;
    //   30: astore_3
    //   31: aload_3
    //   32: getfield Dne : Ljava/lang/String;
    //   35: aload_0
    //   36: getfield Dne : Ljava/lang/String;
    //   39: invokevirtual equals : (Ljava/lang/Object;)Z
    //   42: ifeq -> 68
    //   45: aload_3
    //   46: getfield FWm : Ljava/lang/String;
    //   49: aload_0
    //   50: getfield FWm : Ljava/lang/String;
    //   53: invokevirtual equals : (Ljava/lang/Object;)Z
    //   56: ifeq -> 68
    //   59: aload_1
    //   60: iload_2
    //   61: aload_0
    //   62: invokevirtual Dne : (ILetB;)V
    //   65: goto -> 74
    //   68: iinc #2, 1
    //   71: goto -> 17
    //   74: aload_1
    //   75: invokevirtual FWm : ()V
    //   78: return
  }
  
  public void Dne(int paramInt) {
    this.Dne.remove(paramInt);
  }
  
  public void Dne(int paramInt, etB parametB) {
    this.Dne.set(paramInt, parametB);
  }
  
  public void Dne() {
    try {
      WkD wkD = VVx.Dne(new File(this.Dne.Dne, "servers.dat"));
      mbZ mbZ = wkD.Dne("servers");
      this.Dne.clear();
      for (byte b = 0; b < mbZ.Dne(); b++)
        this.Dne.add(etB.Dne((WkD)mbZ.FWm(b))); 
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  public GNm(Minecraft paramMinecraft) {
    this.Dne = paramMinecraft;
    Dne();
  }
  
  public void Dne(int paramInt1, int paramInt2) {
    etB etB = Dne(paramInt1);
    this.Dne.set(paramInt1, Dne(paramInt2));
    this.Dne.set(paramInt2, etB);
    FWm();
  }
  
  public int Dne() {
    return this.Dne.size();
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\GNm.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */