import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.PortUnreachableException;
import java.net.SocketAddress;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class wGj extends JTM {
  private Map Dne;
  
  private String FWm;
  
  private DatagramSocket Dne;
  
  private Map FWm;
  
  private int bzF;
  
  private long Dne;
  
  private long bzF;
  
  private long FWm;
  
  private ybG Dne;
  
  private int FWm;
  
  private String bzF;
  
  private int Qnq;
  
  private DatagramPacket Dne;
  
  private String Dne;
  
  private String Qnq;
  
  private byte[] Dne = null;
  
  public void run() {
    FWm("Query running on " + this.Qnq + ":" + this.FWm);
    this.Dne = System.currentTimeMillis();
    this.Dne = (byte[])new DatagramPacket(this.Dne, this.Dne.length);
    try {
      while (this.Dne != null) {
        try {
          this.Dne.receive((DatagramPacket)this.Dne);
          bzF();
          Dne((DatagramPacket)this.Dne);
        } catch (SocketTimeoutException socketTimeoutException) {
          bzF();
        } catch (PortUnreachableException portUnreachableException) {
        
        } catch (IOException iOException) {
          Dne(iOException);
        } 
      } 
    } finally {
      FWm();
    } 
  }
  
  private void Dne(byte[] paramArrayOfbyte, DatagramPacket paramDatagramPacket) {
    this.Dne.send(new DatagramPacket(paramArrayOfbyte, paramArrayOfbyte.length, paramDatagramPacket.getSocketAddress()));
  }
  
  public wGj(xnW paramxnW) {
    super(paramxnW);
    this.Dne = new byte[1460];
    this.Dne = null;
    this.FWm = paramxnW.Dne("query.port", 0);
    this.Qnq = paramxnW.FWm();
    this.bzF = paramxnW.FWm();
    this.Dne = (byte[])paramxnW.bzF();
    this.Qnq = paramxnW.Qnq();
    this.FWm = paramxnW.aFZ();
    this.bzF = 0L;
    this.bzF = "0.0.0.0";
    if (0 != this.Qnq.length() && !this.bzF.equals(this.Qnq)) {
      this.bzF = this.Qnq;
    } else {
      this.Qnq = "0.0.0.0";
      try {
        InetAddress inetAddress = InetAddress.getLocalHost();
        this.bzF = inetAddress.getHostAddress();
      } catch (UnknownHostException unknownHostException) {
        bzF("Unable to determine local host IP, please set server-ip in '" + paramxnW.Dne() + "' : " + unknownHostException.getMessage());
      } 
    } 
    if (0 == this.FWm) {
      this.FWm = this.bzF;
      FWm("Setting default query port to " + this.FWm);
      paramxnW.Dne("query.port", Integer.valueOf(this.FWm));
      paramxnW.Dne("debug", Boolean.valueOf(false));
      paramxnW.Dne();
    } 
    this.Dne = (byte[])new HashMap<>();
    this.Dne = (byte[])new ybG(1460);
    this.FWm = new HashMap<>();
    this.FWm = (new Date()).getTime();
  }
  
  private boolean Dne(DatagramPacket paramDatagramPacket) {
    byte[] arrayOfByte = paramDatagramPacket.getData();
    int i = paramDatagramPacket.getLength();
    SocketAddress socketAddress = paramDatagramPacket.getSocketAddress();
    Dne("Packet len " + i + " [" + socketAddress + "]");
    if (3 <= i && -2 == arrayOfByte[0] && -3 == arrayOfByte[1]) {
      Dne("Packet '" + iwf.Dne(arrayOfByte[2]) + "' [" + socketAddress + "]");
      switch (arrayOfByte[2]) {
        case 0:
          if (!Dne(paramDatagramPacket).booleanValue()) {
            Dne("Invalid challenge [" + socketAddress + "]");
            return false;
          } 
          if (15 == i) {
            Dne(Dne(paramDatagramPacket), paramDatagramPacket);
            Dne("Rules [" + socketAddress + "]");
          } else {
            ybG ybG1 = new ybG(1460);
            ybG1.Dne(0);
            ybG1.Dne(Dne(paramDatagramPacket.getSocketAddress()));
            ybG1.Dne((String)this.Dne);
            ybG1.Dne("SMP");
            ybG1.Dne(this.FWm);
            ybG1.Dne(Integer.toString(Dne()));
            ybG1.Dne(Integer.toString(this.Qnq));
            ybG1.Dne((short)this.bzF);
            ybG1.Dne(this.bzF);
            Dne(ybG1.Dne(), paramDatagramPacket);
            Dne("Status [" + socketAddress + "]");
          } 
        case 9:
          Dne(paramDatagramPacket);
          Dne("Challenge [" + socketAddress + "]");
          return true;
      } 
      return true;
    } 
    Dne("Invalid packet [" + socketAddress + "]");
    return false;
  }
  
  private byte[] Dne(SocketAddress paramSocketAddress) {
    // Byte code:
    //   0: aload_0
    //   1: getfield FWm : Ljava/util/Map;
    //   4: aload_1
    //   5: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   10: checkcast cFo
    //   13: invokevirtual FWm : ()[B
    //   16: areturn
  }
  
  private void bzF() {
    // Byte code:
    //   0: aload_0
    //   1: getfield Dne : Z
    //   4: ifeq -> 93
    //   7: invokestatic currentTimeMillis : ()J
    //   10: lstore_1
    //   11: lload_1
    //   12: aload_0
    //   13: getfield Dne : J
    //   16: ldc2_w 30000
    //   19: ladd
    //   20: lcmp
    //   21: iflt -> 93
    //   24: aload_0
    //   25: lload_1
    //   26: putfield Dne : J
    //   29: aload_0
    //   30: getfield FWm : Ljava/util/Map;
    //   33: invokeinterface entrySet : ()Ljava/util/Set;
    //   38: invokeinterface iterator : ()Ljava/util/Iterator;
    //   43: astore_3
    //   44: aload_3
    //   45: invokeinterface hasNext : ()Z
    //   50: ifeq -> 93
    //   53: aload_3
    //   54: invokeinterface next : ()Ljava/lang/Object;
    //   59: checkcast java/util/Map$Entry
    //   62: astore #4
    //   64: aload #4
    //   66: invokeinterface getValue : ()Ljava/lang/Object;
    //   71: checkcast cFo
    //   74: lload_1
    //   75: invokevirtual Dne : (J)Ljava/lang/Boolean;
    //   78: invokevirtual booleanValue : ()Z
    //   81: ifeq -> 90
    //   84: aload_3
    //   85: invokeinterface remove : ()V
    //   90: goto -> 44
    //   93: return
  }
  
  private void Dne(DatagramPacket paramDatagramPacket) {
    // Byte code:
    //   0: new cFo
    //   3: dup
    //   4: aload_0
    //   5: aload_1
    //   6: invokespecial <init> : (LwGj;Ljava/net/DatagramPacket;)V
    //   9: astore_2
    //   10: aload_0
    //   11: getfield FWm : Ljava/util/Map;
    //   14: aload_1
    //   15: invokevirtual getSocketAddress : ()Ljava/net/SocketAddress;
    //   18: aload_2
    //   19: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   24: pop
    //   25: aload_0
    //   26: aload_2
    //   27: invokevirtual Dne : ()[B
    //   30: aload_1
    //   31: invokespecial Dne : ([BLjava/net/DatagramPacket;)V
    //   34: return
  }
  
  private byte[] Dne(DatagramPacket paramDatagramPacket) {
    long l = System.currentTimeMillis();
    if (l < this.bzF + 5000L) {
      byte[] arrayOfByte1 = this.Dne.Dne();
      byte[] arrayOfByte2 = Dne(paramDatagramPacket.getSocketAddress());
      arrayOfByte1[1] = arrayOfByte2[0];
      arrayOfByte1[2] = arrayOfByte2[1];
      arrayOfByte1[3] = arrayOfByte2[2];
      arrayOfByte1[4] = arrayOfByte2[3];
      return arrayOfByte1;
    } 
    this.bzF = l;
    this.Dne.Dne();
    this.Dne.Dne(0);
    this.Dne.Dne(Dne(paramDatagramPacket.getSocketAddress()));
    this.Dne.Dne("splitnum");
    this.Dne.Dne(128);
    this.Dne.Dne(0);
    this.Dne.Dne("hostname");
    this.Dne.Dne((String)this.Dne);
    this.Dne.Dne("gametype");
    this.Dne.Dne("SMP");
    this.Dne.Dne("game_id");
    this.Dne.Dne("MINECRAFT");
    this.Dne.Dne("version");
    this.Dne.Dne(this.Dne.Qnq());
    this.Dne.Dne("plugins");
    this.Dne.Dne(this.Dne.zGp());
    this.Dne.Dne("map");
    this.Dne.Dne(this.FWm);
    this.Dne.Dne("numplayers");
    this.Dne.Dne("" + Dne());
    this.Dne.Dne("maxplayers");
    this.Dne.Dne("" + this.Qnq);
    this.Dne.Dne("hostport");
    this.Dne.Dne("" + this.bzF);
    this.Dne.Dne("hostip");
    this.Dne.Dne(this.bzF);
    this.Dne.Dne(0);
    this.Dne.Dne(1);
    this.Dne.Dne("player_");
    this.Dne.Dne(0);
    String[] arrayOfString = this.Dne.Dne();
    byte b1 = (byte)arrayOfString.length;
    byte b2;
    for (b2 = (byte)(b1 - 1); b2 >= 0; b2 = (byte)(b2 - 1))
      this.Dne.Dne(arrayOfString[b2]); 
    this.Dne.Dne(0);
    return this.Dne.Dne();
  }
  
  public void Dne() {
    if (this.Dne == null)
      if (0 < this.FWm && 65535 >= this.FWm) {
        if (FWm())
          super.Dne(); 
      } else {
        bzF("Invalid query port " + this.FWm + " found in '" + this.Dne.Dne() + "' (queries disabled)");
      }  
  }
  
  private Boolean Dne(DatagramPacket paramDatagramPacket) {
    // Byte code:
    //   0: aload_1
    //   1: invokevirtual getSocketAddress : ()Ljava/net/SocketAddress;
    //   4: astore_2
    //   5: aload_0
    //   6: getfield FWm : Ljava/util/Map;
    //   9: aload_2
    //   10: invokeinterface containsKey : (Ljava/lang/Object;)Z
    //   15: ifne -> 23
    //   18: iconst_0
    //   19: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   22: areturn
    //   23: aload_1
    //   24: invokevirtual getData : ()[B
    //   27: astore_3
    //   28: aload_0
    //   29: getfield FWm : Ljava/util/Map;
    //   32: aload_2
    //   33: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   38: checkcast cFo
    //   41: invokevirtual Dne : ()I
    //   44: aload_3
    //   45: bipush #7
    //   47: aload_1
    //   48: invokevirtual getLength : ()I
    //   51: invokestatic FWm : ([BII)I
    //   54: if_icmpeq -> 64
    //   57: iconst_0
    //   58: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   61: goto -> 68
    //   64: iconst_1
    //   65: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   68: areturn
  }
  
  private boolean FWm() {
    try {
      this.Dne = (byte[])new DatagramSocket(this.FWm, InetAddress.getByName(this.Qnq));
      Dne((DatagramSocket)this.Dne);
      this.Dne.setSoTimeout(500);
      return true;
    } catch (SocketException socketException) {
      bzF("Unable to initialise query system on " + this.Qnq + ":" + this.FWm + " (Socket): " + socketException.getMessage());
    } catch (UnknownHostException unknownHostException) {
      bzF("Unable to initialise query system on " + this.Qnq + ":" + this.FWm + " (Unknown Host): " + unknownHostException.getMessage());
    } catch (Exception exception) {
      bzF("Unable to initialise query system on " + this.Qnq + ":" + this.FWm + " (E): " + exception.getMessage());
    } 
    return false;
  }
  
  private void Dne(Exception paramException) {
    if (this.Dne != null) {
      bzF("Unexpected exception, buggy JRE? (" + paramException.toString() + ")");
      if (!FWm()) {
        Qnq("Failed to recover from buggy JRE, shutting down!");
        this.Dne = false;
      } 
    } 
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\wGj.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */