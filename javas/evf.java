import java.lang.management.ManagementFactory;
import java.lang.management.RuntimeMXBean;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Timer;
import java.util.UUID;

public class evf {
  private Map Dne;
  
  private final Timer Dne;
  
  private final long Dne;
  
  private int Dne;
  
  private final String Dne;
  
  private final hur Dne;
  
  private boolean Dne;
  
  private final URL Dne;
  
  private final Object Dne = new HashMap<>();
  
  public evf(String paramString, hur paramhur) {
    this.Dne = UUID.randomUUID().toString();
    this.Dne = new Timer("Snooper Timer", true);
    this.Dne = new Object();
    this.Dne = System.currentTimeMillis();
    this.Dne = false;
    this.Dne = false;
    try {
      this.Dne = new URL("http://snoop.minecraft.net/" + paramString + "?version=" + '\001');
    } catch (MalformedURLException malformedURLException) {
      throw new IllegalArgumentException();
    } 
    this.Dne = paramhur;
  }
  
  static URL Dne(evf paramevf) {
    return (URL)paramevf.Dne;
  }
  
  static int Dne(evf paramevf) {
    return paramevf.Dne++;
  }
  
  public String Dne() {
    return (String)this.Dne;
  }
  
  static hur Dne(evf paramevf) {
    return (hur)paramevf.Dne;
  }
  
  public boolean Dne() {
    return this.Dne;
  }
  
  public void FWm() {
    Dne("memory_total", Long.valueOf(Runtime.getRuntime().totalMemory()));
    Dne("memory_max", Long.valueOf(Runtime.getRuntime().maxMemory()));
    Dne("memory_free", Long.valueOf(Runtime.getRuntime().freeMemory()));
    Dne("cpu_cores", Integer.valueOf(Runtime.getRuntime().availableProcessors()));
    Dne("run_time", Long.valueOf((System.currentTimeMillis() - this.Dne) / 60L * 1000L));
    this.Dne.Dne(this);
  }
  
  private void aFZ() {
    RuntimeMXBean runtimeMXBean = ManagementFactory.getRuntimeMXBean();
    List<String> list = runtimeMXBean.getInputArguments();
    byte b = 0;
    for (String str : list) {
      if (str.startsWith("-X"))
        Dne("jvm_arg[" + b++ + "]", str); 
    } 
    Dne("jvm_args", Integer.valueOf(b));
  }
  
  static Map Dne(evf paramevf) {
    return (Map)paramevf.Dne;
  }
  
  static Object Dne(evf paramevf) {
    return paramevf.Dne;
  }
  
  public Map Dne() {
    LinkedHashMap<Object, Object> linkedHashMap = new LinkedHashMap<>();
    Object object = this.Dne;
    synchronized (this.Dne) {
      FWm();
      for (Map.Entry entry : this.Dne.entrySet())
        linkedHashMap.put(entry.getKey(), entry.getValue().toString()); 
      return linkedHashMap;
    } 
  }
  
  public void Dne(String paramString, Object paramObject) {
    Object object = this.Dne;
    synchronized (this.Dne) {
      this.Dne.put(paramString, paramObject);
    } 
  }
  
  public void Dne() {
    if (this.Dne == null) {
      this.Dne = true;
      Qnq();
      this.Dne.schedule(new TFY(this), 0L, 900000L);
    } 
  }
  
  public void bzF() {
    this.Dne.cancel();
  }
  
  private void Qnq() {
    aFZ();
    Dne("snooper_token", this.Dne);
    Dne("os_name", System.getProperty("os.name"));
    Dne("os_version", System.getProperty("os.version"));
    Dne("os_architecture", System.getProperty("os.arch"));
    Dne("java_version", System.getProperty("java.version"));
    Dne("version", "UNKNOWN");
    this.Dne.FWm(this);
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\evf.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */