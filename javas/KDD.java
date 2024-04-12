import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.Collections;
import java.util.List;
import net.minecraft.client.Minecraft;
import org.lwjgl.input.Keyboard;

public class KDD extends qVZ {
  private jQO Dne;
  
  private static int Dne = Character.MIN_VALUE;
  
  private etB Dne;
  
  private svg Dne;
  
  private qVZ Dne;
  
  private int Qnq;
  
  private List FWm;
  
  private boolean zGp;
  
  private Pee bzF;
  
  private Nmc Dne;
  
  private Pee Dne;
  
  private boolean Qnq = true;
  
  private GNm Dne;
  
  private static Object Dne = new Object();
  
  private boolean aFZ;
  
  private Pee FWm;
  
  private int aFZ;
  
  private boolean DyG;
  
  private String Dne;
  
  private boolean bzF = false;
  
  public void FWm() {
    Keyboard.enableRepeatEvents(false);
    if (this.Dne != null) {
      this.Dne.interrupt();
      this.Dne = null;
    } 
  }
  
  static Pee Dne(KDD paramKDD) {
    return paramKDD.FWm;
  }
  
  static void Dne(KDD paramKDD, int paramInt) {
    paramKDD.Dne(paramInt);
  }
  
  public void Dne(int paramInt1, int paramInt2, float paramFloat) {
    this.Dne = null;
    irb irb = irb.Dne();
    aFZ();
    this.Dne.Dne(paramInt1, paramInt2, paramFloat);
    Dne((msA)this.Dne, irb.Dne("multiplayer.title"), this.FWm / 2, 20, 16777215);
    super.Dne(paramInt1, paramInt2, paramFloat);
    if (this.Dne != null)
      Dne(this.Dne, paramInt1, paramInt2); 
  }
  
  static int FWm(KDD paramKDD) {
    return paramKDD.aFZ;
  }
  
  static int Dne(KDD paramKDD, int paramInt) {
    return paramKDD.Qnq = paramInt;
  }
  
  protected void Dne(char paramChar, int paramInt) {
    boolean bool = this.Qnq;
    if (paramInt == 59) {
      ((Minecraft)this.Dne).Dne.udO = (((Minecraft)this.Dne).Dne.udO == null) ? 1 : 0;
      ((Minecraft)this.Dne).Dne.FWm();
    } else if (bzF() && paramInt == 200) {
      if (bool && bool < this.Dne.Dne()) {
        this.Dne.Dne(bool, bool - 1);
        this.Qnq--;
        if (bool < this.Dne.Dne() - 1)
          this.Dne.Dne(-((Nmc)this.Dne).Qnq); 
      } 
    } else if (bzF() && paramInt == 208) {
      if (bool < this.Dne.Dne() - 1) {
        this.Dne.Dne(bool, bool + 1);
        this.Qnq++;
        if (bool)
          this.Dne.Dne(((Nmc)this.Dne).Qnq); 
      } 
    } else if (paramChar == '\r') {
      Dne(this.Dne.get(2));
    } else {
      super.Dne(paramChar, paramInt);
    } 
  }
  
  static String Dne(KDD paramKDD, String paramString) {
    return paramKDD.Dne = paramString;
  }
  
  public void Dne(boolean paramBoolean, int paramInt) {
    if (this.bzF) {
      this.bzF = false;
      if (paramBoolean) {
        this.Dne.Dne(paramInt);
        this.Dne.FWm();
        this.Qnq = true;
      } 
      this.Dne.Dne(this);
    } else if (this.zGp) {
      this.zGp = false;
      if (paramBoolean) {
        FWm((etB)this.Dne);
      } else {
        this.Dne.Dne(this);
      } 
    } else if (this.Qnq) {
      this.Qnq = false;
      if (paramBoolean) {
        this.Dne.Dne((etB)this.Dne);
        this.Dne.FWm();
        this.Qnq = true;
      } 
      this.Dne.Dne(this);
    } else if (this.aFZ != 0) {
      this.aFZ = 0;
      if (paramBoolean) {
        etB etB1 = this.Dne.Dne(this.Qnq);
        etB1.Dne = ((etB)this.Dne).Dne;
        etB1.FWm = ((etB)this.Dne).FWm;
        etB1.FWm(this.Dne.bzF());
        this.Dne.FWm();
      } 
      this.Dne.Dne(this);
    } 
  }
  
  static int Dne() {
    return Dne;
  }
  
  public void Dne() {
    Keyboard.enableRepeatEvents(true);
    this.Dne.clear();
    if (!this.DyG) {
      this.DyG = true;
      this.Dne = (String)new GNm((Minecraft)this.Dne);
      this.Dne.Dne();
      this.Dne = (String)new jQO();
      try {
        this.Dne = (String)new svg((jQO)this.Dne);
        this.Dne.start();
      } catch (Exception exception) {
        this.Dne.Dne().FWm("Unable to start LAN server detection: " + exception.getMessage());
      } 
      this.Dne = (String)new Nmc(this);
    } else {
      this.Dne.Dne(this.FWm, this.bzF, 32, this.bzF - 64);
    } 
    zGp();
  }
  
  static Pee FWm(KDD paramKDD) {
    return (Pee)paramKDD.Dne;
  }
  
  static int Dne(KDD paramKDD) {
    return paramKDD.Qnq;
  }
  
  static Pee bzF(KDD paramKDD) {
    return paramKDD.bzF;
  }
  
  protected void Dne(String paramString, int paramInt1, int paramInt2) {
    if (paramString != null) {
      int i = paramInt1 + 12;
      int j = paramInt2 - 12;
      int k = this.Dne.Dne(paramString);
      Dne(i - 3, j - 3, i + k + 3, j + 8 + 3, -1073741824, -1073741824);
      this.Dne.Dne(paramString, i, j, -1);
    } 
  }
  
  public void bzF() {
    super.bzF();
    this.aFZ++;
    if (this.Dne.Dne()) {
      this.FWm = (Pee)this.Dne.Dne();
      this.Dne.Dne();
    } 
  }
  
  static List Dne(KDD paramKDD) {
    return (List)paramKDD.FWm;
  }
  
  public KDD(qVZ paramqVZ) {
    this.Qnq = false;
    this.aFZ = 0;
    this.zGp = false;
    this.Dne = null;
    this.Dne = null;
    this.FWm = Collections.emptyList();
    this.Dne = (String)paramqVZ;
  }
  
  private void Dne(int paramInt) {
    if (paramInt < this.Dne.Dne()) {
      FWm(this.Dne.Dne(paramInt));
    } else {
      paramInt -= this.Dne.Dne();
      if (paramInt < this.FWm.size()) {
        jhx jhx = this.FWm.get(paramInt);
        FWm(new etB(jhx.Dne(), jhx.FWm()));
      } 
    } 
  }
  
  static GNm Dne(KDD paramKDD) {
    return (GNm)paramKDD.Dne;
  }
  
  public void zGp() {
    irb irb = irb.Dne();
    this.Dne.add(this.Dne = (String)new Pee(7, this.FWm / 2 - 154, this.bzF - 28, 70, 20, irb.Dne("selectServer.edit")));
    this.Dne.add(this.bzF = new Pee(2, this.FWm / 2 - 74, this.bzF - 28, 70, 20, irb.Dne("selectServer.delete")));
    this.Dne.add(this.FWm = new Pee(1, this.FWm / 2 - 154, this.bzF - 52, 100, 20, irb.Dne("selectServer.select")));
    this.Dne.add(new Pee(4, this.FWm / 2 - 50, this.bzF - 52, 100, 20, irb.Dne("selectServer.direct")));
    this.Dne.add(new Pee(3, this.FWm / 2 + 4 + 50, this.bzF - 52, 100, 20, irb.Dne("selectServer.add")));
    this.Dne.add(new Pee(8, this.FWm / 2 + 4, this.bzF - 28, 70, 20, irb.Dne("selectServer.refresh")));
    this.Dne.add(new Pee(0, this.FWm / 2 + 4 + 76, this.bzF - 28, 75, 20, irb.Dne("gui.cancel")));
    boolean bool = (this.Qnq && this.Qnq < this.Dne.Dne()) ? true : false;
    this.FWm.Dne = bool;
    ((Pee)this.Dne).Dne = bool;
    this.bzF.Dne = bool;
  }
  
  private static void bzF(etB parametB) {
    Qyv qyv = Qyv.Dne(parametB.FWm);
    Socket socket = null;
    DataInputStream dataInputStream = null;
    DataOutputStream dataOutputStream = null;
    try {
      socket = new Socket();
      socket.setSoTimeout(3000);
      socket.setTcpNoDelay(true);
      socket.setTrafficClass(18);
      socket.connect(new InetSocketAddress(qyv.Dne(), qyv.Dne()), 3000);
      dataInputStream = new DataInputStream(socket.getInputStream());
      dataOutputStream = new DataOutputStream(socket.getOutputStream());
      dataOutputStream.write(254);
      dataOutputStream.write(1);
      if (dataInputStream.read() != 255)
        throw new IOException("Bad message"); 
      String str = NER.Dne(dataInputStream, 256);
      char[] arrayOfChar = str.toCharArray();
      int i;
      for (i = 0; i < arrayOfChar.length; i++) {
        if (arrayOfChar[i] != '§' && arrayOfChar[i] != '\000' && BAQ.Dne.indexOf(arrayOfChar[i]) < 0)
          arrayOfChar[i] = '?'; 
      } 
      str = new String(arrayOfChar);
      if (str.startsWith("§") && str.length() > 1) {
        String[] arrayOfString = str.substring(1).split("\000");
        if (geR.Dne(arrayOfString[0], 0) == 1) {
          parametB.Qnq = arrayOfString[3];
          parametB.Dne = geR.Dne(arrayOfString[1], parametB.Dne);
          parametB.aFZ = arrayOfString[2];
          i = geR.Dne(arrayOfString[4], 0);
          int j = geR.Dne(arrayOfString[5], 0);
          if (i >= 0 && j >= 0) {
            parametB.bzF = Dne.div + "" + i + "" + Dne.IjH + "/" + Dne.div + j;
          } else {
            parametB.bzF = "" + Dne.IjH + "???";
          } 
        } else {
          parametB.aFZ = "???";
          parametB.Qnq = "" + Dne.IjH + "???";
          parametB.Dne = true;
          parametB.bzF = "" + Dne.IjH + "???";
        } 
      } else {
        String[] arrayOfString = str.split("§");
        str = arrayOfString[0];
        i = -1;
        int j = -1;
        try {
          i = Integer.parseInt(arrayOfString[1]);
          j = Integer.parseInt(arrayOfString[2]);
        } catch (Exception exception) {}
        parametB.Qnq = Dne.div + str;
        if (i >= 0 && j > 0) {
          parametB.bzF = Dne.div + "" + i + "" + Dne.IjH + "/" + Dne.div + j;
        } else {
          parametB.bzF = "" + Dne.IjH + "???";
        } 
        parametB.aFZ = "1.3";
        parametB.Dne = true;
      } 
    } finally {
      try {
        if (dataInputStream != null)
          dataInputStream.close(); 
      } catch (Throwable throwable) {}
      try {
        if (dataOutputStream != null)
          dataOutputStream.close(); 
      } catch (Throwable throwable) {}
      try {
        if (socket != null)
          socket.close(); 
      } catch (Throwable throwable) {}
    } 
  }
  
  private void FWm(etB parametB) {
    this.Dne.Dne(new rND(this, (Minecraft)this.Dne, parametB));
  }
  
  static int bzF() {
    return Dne--;
  }
  
  static void Dne(etB parametB) {
    bzF(parametB);
  }
  
  static int FWm() {
    return Dne++;
  }
  
  protected void Dne(Pee paramPee) {
    if (paramPee.Dne != null)
      if (paramPee.aFZ == 2) {
        boolean bool = (this.Dne.Dne(this.Qnq)).Dne;
        if (bool != null) {
          this.bzF = true;
          irb irb = irb.Dne();
          String str1 = irb.Dne("selectServer.deleteQuestion");
          String str2 = "'" + bool + "' " + irb.Dne("selectServer.deleteWarning");
          String str3 = irb.Dne("selectServer.deleteButton");
          String str4 = irb.Dne("gui.cancel");
          sHC sHC = new sHC(this, str1, str2, str3, str4, this.Qnq);
          this.Dne.Dne(sHC);
        } 
      } else if (paramPee.aFZ == 1) {
        Dne(this.Qnq);
      } else if (paramPee.aFZ == 4) {
        this.zGp = true;
        this.Dne.Dne(new XZe(this, (etB)(this.Dne = (String)new etB(KGL.Dne("selectServer.defaultName"), ""))));
      } else if (paramPee.aFZ == 3) {
        this.Qnq = true;
        this.Dne.Dne(new ugH(this, (etB)(this.Dne = (String)new etB(KGL.Dne("selectServer.defaultName"), ""))));
      } else if (paramPee.aFZ == 7) {
        this.aFZ = 1;
        etB etB1 = this.Dne.Dne(this.Qnq);
        this.Dne = (String)new etB(etB1.Dne, etB1.FWm);
        this.Dne.FWm(etB1.bzF());
        this.Dne.Dne(new ugH(this, (etB)this.Dne));
      } else if (paramPee.aFZ == 0) {
        this.Dne.Dne((qVZ)this.Dne);
      } else if (paramPee.aFZ == 8) {
        this.Dne.Dne(new KDD((qVZ)this.Dne));
      } else {
        this.Dne.Dne(paramPee);
      }  
  }
  
  static Object Dne() {
    return Dne;
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\KDD.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */