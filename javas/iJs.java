import java.io.File;
import java.io.IOException;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class iJs extends Jwh implements xnW {
  private final List Dne;
  
  private final dLs Dne;
  
  private wGj Dne;
  
  private qKl Dne;
  
  private XHL Dne;
  
  private euc Dne;
  
  private boolean Dne;
  
  private NuQ Dne = (NuQ)Collections.synchronizedList(new ArrayList());
  
  private boolean FWm = false;
  
  public String Dne(XHL paramXHL, boolean paramBoolean) {
    return "";
  }
  
  public McM Dne(McM paramMcM) {
    paramMcM = super.Dne(paramMcM);
    paramMcM.Dne().Dne("Is Modded", new PCC(this));
    paramMcM.Dne().Dne("Type", new ITD(this));
    return paramMcM;
  }
  
  public void Dne(String paramString, Object paramObject) {
    this.Dne.Dne(paramString, paramObject);
  }
  
  protected void Dne(McM paramMcM) {
    while (XHL()) {
      zGp();
      try {
        Thread.sleep(10L);
      } catch (InterruptedException interruptedException) {
        interruptedException.printStackTrace();
      } 
    } 
  }
  
  public iJs(File paramFile) {
    super(paramFile);
    this.Dne = (NuQ)new WQU("Minecraft-Server", (String)null, (new File(paramFile, "server.log")).getAbsolutePath());
    new qsp(this);
  }
  
  public String Dne() {
    File file = this.Dne.Dne();
    return (file != null) ? file.getAbsolutePath() : "No settings file";
  }
  
  public boolean bzF() {
    return this.Dne.Dne("hardcore", false);
  }
  
  public void zGp() {
    while (!this.Dne.isEmpty()) {
      KBG kBG = this.Dne.remove(0);
      Dne().Dne((gnI)kBG.Dne, kBG.Dne);
    } 
  }
  
  public void Dne(String paramString, gnI paramgnI) {
    this.Dne.add(new KBG(paramString, paramgnI));
  }
  
  public boolean div() {
    return this.Dne.Dne("allow-nether", true);
  }
  
  public int Dne() {
    return this.Dne.Dne("difficulty", 1);
  }
  
  public void aFZ() {
    super.aFZ();
    zGp();
  }
  
  public String Dne(String paramString1, String paramString2) {
    return this.Dne.Dne(paramString1, paramString2);
  }
  
  public boolean aFZ() {
    return this.Dne.Dne("snooper-enabled", true);
  }
  
  public boolean FWm() {
    return this.Dne;
  }
  
  public boolean DyG() {
    return this.Dne.Dne("enable-command-block", false);
  }
  
  public boolean Dne(String paramString, boolean paramBoolean) {
    return this.Dne.Dne(paramString, paramBoolean);
  }
  
  public boolean IjH() {
    return this.Dne.Dne("spawn-monsters", true);
  }
  
  public int Dne(String paramString, int paramInt) {
    return this.Dne.Dne(paramString, paramInt);
  }
  
  protected boolean Dne() {
    boolean bool;
    mQQ mQQ = new mQQ(this);
    mQQ.setDaemon(true);
    mQQ.start();
    Dne().Dne("Starting minecraft server version UNKNOWN");
    if (Runtime.getRuntime().maxMemory() / 1024L / 1024L < 512L)
      Dne().FWm("To start the server with more ram, launch it as \"java -Xmx1024M -Xms1024M -jar minecraft_server.jar\""); 
    Dne().Dne("Loading properties");
    this.Dne = (NuQ)new euc(new File("server.properties"), Dne());
    if (Zpi()) {
      DyG("127.0.0.1");
    } else {
      Qnq(this.Dne.Dne("online-mode", true));
      DyG(this.Dne.Dne("server-ip", ""));
    } 
    aFZ(this.Dne.Dne("spawn-animals", true));
    zGp(this.Dne.Dne("spawn-npcs", true));
    DyG(this.Dne.Dne("pvp", true));
    div(this.Dne.Dne("allow-flight", false));
    XHL(this.Dne.Dne("texture-pack", ""));
    Zpi(this.Dne.Dne("motd", "A Minecraft Server"));
    IjH(this.Dne.Dne("force-gamemode", false));
    if (this.Dne.Dne("difficulty", 1) < 0) {
      this.Dne.Dne("difficulty", Integer.valueOf(0));
    } else if (this.Dne.Dne("difficulty", 1) > 3) {
      this.Dne.Dne("difficulty", Integer.valueOf(3));
    } 
    this.Dne = this.Dne.Dne("generate-structures", true);
    int i = this.Dne.Dne("gamemode", XHL.FWm.Dne());
    this.Dne = (NuQ)mrb.Dne(i);
    Dne().Dne("Default game type: " + this.Dne);
    InetAddress inetAddress = null;
    if (div().length() > 0)
      inetAddress = InetAddress.getByName(div()); 
    if (zGp() < 0)
      Dne(this.Dne.Dne("server-port", 25565)); 
    Dne().Dne("Generating keypair");
    Dne(Mjb.Dne());
    Dne().Dne("Starting Minecraft server on " + ((div().length() == 0) ? "*" : div()) + ":" + zGp());
    try {
      this.Dne = new ysI(this, inetAddress, zGp());
    } catch (IOException iOException) {
      Dne().FWm("**** FAILED TO BIND TO PORT!");
      Dne().Dne("The exception was: {0}", new Object[] { iOException.toString() });
      Dne().FWm("Perhaps a server is already running on that port?");
      return false;
    } 
    if (!udO()) {
      Dne().FWm("**** SERVER IS RUNNING IN OFFLINE/INSECURE MODE!");
      Dne().FWm("The server will make no attempt to authenticate usernames. Beware.");
      Dne().FWm("While this makes the game possible to play without internet access, it also opens up the ability for hackers to connect with any username they choose.");
      Dne().FWm("To change this, set \"online-mode\" to \"true\" in the server.properties file.");
    } 
    Dne(new bjV(this));
    long l1 = System.nanoTime();
    if (aFZ() == null)
      IjH(this.Dne.Dne("level-name", "world")); 
    String str1 = this.Dne.Dne("level-seed", "");
    String str2 = this.Dne.Dne("level-type", "DEFAULT");
    String str3 = this.Dne.Dne("generator-settings", "");
    long l2 = (new Random()).nextLong();
    if (str1.length() > 0)
      try {
        long l = Long.parseLong(str1);
        if (l != 0L)
          l2 = l; 
      } catch (NumberFormatException numberFormatException) {
        l2 = str1.hashCode();
      }  
    kGO kGO = kGO.Dne(str2);
    if (kGO == null)
      bool = kGO.Dne; 
    bzF(this.Dne.Dne("max-build-height", 256));
    bzF((div() + 8) / 16 * 16);
    bzF(geR.Dne(div(), 64, 256));
    this.Dne.Dne("max-build-height", Integer.valueOf(div()));
    Dne().Dne("Preparing level \"" + aFZ() + "\"");
    Dne(aFZ(), aFZ(), l2, bool, str3);
    long l3 = System.nanoTime() - l1;
    String str4 = String.format("%.3fs", new Object[] { Double.valueOf(l3 / 1.0E9D) });
    Dne().Dne("Done (" + str4 + ")! For help, type \"help\" or \"?\"");
    if (this.Dne.Dne("enable-query", false)) {
      Dne().Dne("Starting GS4 status listener");
      this.Dne = (NuQ)new wGj(this);
      this.Dne.Dne();
    } 
    if (this.Dne.Dne("enable-rcon", false)) {
      Dne().Dne("Starting remote control listener");
      this.Dne = (NuQ)new qKl(this);
      this.Dne.Dne();
    } 
    return true;
  }
  
  public int aFZ() {
    return this.Dne.Dne("spawn-protection", super.aFZ());
  }
  
  public void Dne() {
    this.Dne.FWm();
  }
  
  public bjV Dne() {
    return (bjV)super.Dne();
  }
  
  public XHL Dne() {
    return (XHL)this.Dne;
  }
  
  public dLs Dne() {
    return (dLs)this.Dne;
  }
  
  public boolean mrb() {
    return this.FWm;
  }
  
  public dzN Dne() {
    return Dne();
  }
  
  public void Dne(evf paramevf) {
    paramevf.Dne("whitelist_enabled", Boolean.valueOf(Dne().Dne()));
    paramevf.Dne("whitelist_count", Integer.valueOf(Dne().Dne().size()));
    super.Dne(paramevf);
  }
  
  public boolean Qnq() {
    return true;
  }
  
  public NuQ Dne() {
    return this.Dne;
  }
  
  public boolean Dne(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3, FiG paramFiG) {
    if (((Jik)paramQnq.Dne).Dne != 0)
      return false; 
    if (Dne().FWm().isEmpty())
      return false; 
    if (Dne().FWm(paramFiG.aFZ))
      return false; 
    if (aFZ() <= 0)
      return false; 
    iSh iSh = paramQnq.Dne();
    int i = geR.Dne(paramInt1 - iSh.Dne);
    int j = geR.Dne(paramInt3 - iSh.bzF);
    int k = Math.max(i, j);
    return (k <= aFZ());
  }
  
  protected void Qnq() {
    System.exit(0);
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\iJs.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */