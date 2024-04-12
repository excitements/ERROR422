import java.io.File;
import java.io.FileWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class UPH extends xZE {
  private long Dne;
  
  private int Dne = 0L;
  
  private static String FWm() {
    String[] arrayOfString = { 
        "Shiny numbers!", "Am I not running fast enough? :(", "I'm working as hard as I can!", "Will I ever be good enough for you? :(", "Speedy. Zoooooom!", "Hello world", "40% better than a crash report.", "Now with extra numbers", "Now with less numbers", "Now with the same numbers", 
        "You should add flames to things, it makes them go faster!", "Do you feel the need for... optimization?", "*cracks redstone whip*", "Maybe if you treated it better then it'll have more motivation to work faster! Poor server." };
    try {
      return arrayOfString[(int)(System.nanoTime() % arrayOfString.length)];
    } catch (Throwable throwable) {
      return "Witty comment unavailable :(";
    } 
  }
  
  private String Dne(long paramLong, int paramInt) {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("---- Minecraft Profiler Results ----\n");
    stringBuilder.append("// ");
    stringBuilder.append(FWm());
    stringBuilder.append("\n\n");
    stringBuilder.append("Time span: ").append(paramLong).append(" ms\n");
    stringBuilder.append("Tick span: ").append(paramInt).append(" ticks\n");
    stringBuilder.append("// This is approximately ").append(String.format("%.2f", new Object[] { Float.valueOf(paramInt / (float)paramLong / 1000.0F) })).append(" ticks per second. It should be ").append(20).append(" ticks per second\n\n");
    stringBuilder.append("--- BEGIN PROFILE DUMP ---\n\n");
    Dne(0, "root", stringBuilder);
    stringBuilder.append("--- END PROFILE DUMP ---\n\n");
    return stringBuilder.toString();
  }
  
  private void Dne(int paramInt, String paramString, StringBuilder paramStringBuilder) {
    List<Gup> list = (Jwh.Dne()).Dne.Dne(paramString);
    if (list != null && list.size() >= 3)
      for (byte b = 1; b < list.size(); b++) {
        Gup gup = list.get(b);
        paramStringBuilder.append(String.format("[%02d] ", new Object[] { Integer.valueOf(paramInt) }));
        for (byte b1 = 0; b1 < paramInt; b1++)
          paramStringBuilder.append(" "); 
        paramStringBuilder.append(gup.Dne);
        paramStringBuilder.append(" - ");
        paramStringBuilder.append(String.format("%.2f", new Object[] { Double.valueOf(gup.Dne) }));
        paramStringBuilder.append("%/");
        paramStringBuilder.append(String.format("%.2f", new Object[] { Double.valueOf(gup.FWm) }));
        paramStringBuilder.append("%\n");
        if (!gup.Dne.equals("unspecified"))
          try {
            Dne(paramInt + 1, paramString + "." + gup.Dne, paramStringBuilder);
          } catch (Exception exception) {
            paramStringBuilder.append("[[ EXCEPTION " + exception + " ]]");
          }  
      }  
  }
  
  public int Dne() {
    return 3;
  }
  
  public void Dne(gnI paramgnI, String[] paramArrayOfString) {
    if (paramArrayOfString.length == 1) {
      if (paramArrayOfString[0].equals("start")) {
        Dne(paramgnI, "commands.debug.start", new Object[0]);
        Jwh.Dne().XHL();
        this.Dne = System.currentTimeMillis();
        this.Dne = Jwh.Dne().IjH();
        return;
      } 
      if (paramArrayOfString[0].equals("stop")) {
        if (!((Bkx)(Jwh.Dne()).Dne).Dne)
          throw new WoB("commands.debug.notStarted", new Object[0]); 
        long l1 = System.currentTimeMillis();
        int i = Jwh.Dne().IjH();
        long l2 = l1 - this.Dne;
        int j = i - this.Dne;
        Dne(l2, j);
        ((Bkx)(Jwh.Dne()).Dne).Dne = false;
        Dne(paramgnI, "commands.debug.stop", new Object[] { Float.valueOf((float)l2 / 1000.0F), Integer.valueOf(j) });
        return;
      } 
    } 
    throw new fxw("commands.debug.usage", new Object[0]);
  }
  
  public UPH() {
    this.Dne = 0;
  }
  
  public List Dne(gnI paramgnI, String[] paramArrayOfString) {
    return (paramArrayOfString.length == 1) ? Dne(paramArrayOfString, new String[] { "start", "stop" }) : null;
  }
  
  public String Dne() {
    return "debug";
  }
  
  private void Dne(long paramLong, int paramInt) {
    File file = new File(Jwh.Dne().Dne("debug"), "profile-results-" + (new SimpleDateFormat("yyyy-MM-dd_HH.mm.ss")).format(new Date()) + ".txt");
    file.getParentFile().mkdirs();
    try {
      FileWriter fileWriter = new FileWriter(file);
      fileWriter.write(Dne(paramLong, paramInt));
      fileWriter.close();
    } catch (Throwable throwable) {
      Jwh.Dne().Dne().FWm("Could not save profiler results to " + file, throwable);
    } 
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\UPH.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */