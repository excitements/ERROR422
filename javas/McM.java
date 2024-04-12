import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class McM {
  private final Noo Dne;
  
  private final String Dne;
  
  private StackTraceElement[] Dne;
  
  private final Throwable Dne;
  
  private File Dne;
  
  private boolean Dne;
  
  private final List Dne = (List)new Noo(this, "System Details");
  
  public Throwable Dne() {
    return (Throwable)this.Dne;
  }
  
  public static McM Dne(Throwable paramThrowable, String paramString) {
    McM mcM;
    if (paramThrowable instanceof kaJ) {
      mcM = ((kaJ)paramThrowable).Dne();
    } else {
      mcM = new McM(paramString, paramThrowable);
    } 
    return mcM;
  }
  
  public File Dne() {
    return (File)this.Dne;
  }
  
  public void Dne(StringBuilder paramStringBuilder) {
    // Byte code:
    //   0: aload_0
    //   1: getfield Dne : [Ljava/lang/StackTraceElement;
    //   4: ifnull -> 92
    //   7: aload_0
    //   8: getfield Dne : [Ljava/lang/StackTraceElement;
    //   11: arraylength
    //   12: ifle -> 92
    //   15: aload_1
    //   16: ldc '-- Head --\\n'
    //   18: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   21: pop
    //   22: aload_1
    //   23: ldc 'Stacktrace:\\n'
    //   25: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   28: pop
    //   29: aload_0
    //   30: getfield Dne : [Ljava/lang/StackTraceElement;
    //   33: astore_2
    //   34: aload_2
    //   35: arraylength
    //   36: istore_3
    //   37: iconst_0
    //   38: istore #4
    //   40: iload #4
    //   42: iload_3
    //   43: if_icmpge -> 85
    //   46: aload_2
    //   47: iload #4
    //   49: aaload
    //   50: astore #5
    //   52: aload_1
    //   53: ldc '\\t'
    //   55: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   58: ldc 'at '
    //   60: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   63: aload #5
    //   65: invokevirtual toString : ()Ljava/lang/String;
    //   68: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   71: pop
    //   72: aload_1
    //   73: ldc '\\n'
    //   75: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   78: pop
    //   79: iinc #4, 1
    //   82: goto -> 40
    //   85: aload_1
    //   86: ldc '\\n'
    //   88: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   91: pop
    //   92: aload_0
    //   93: getfield Dne : Ljava/util/List;
    //   96: invokeinterface iterator : ()Ljava/util/Iterator;
    //   101: astore_2
    //   102: aload_2
    //   103: invokeinterface hasNext : ()Z
    //   108: ifeq -> 136
    //   111: aload_2
    //   112: invokeinterface next : ()Ljava/lang/Object;
    //   117: checkcast Noo
    //   120: astore_3
    //   121: aload_3
    //   122: aload_1
    //   123: invokevirtual Dne : (Ljava/lang/StringBuilder;)V
    //   126: aload_1
    //   127: ldc '\\n\\n'
    //   129: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   132: pop
    //   133: goto -> 102
    //   136: aload_0
    //   137: getfield Dne : LNoo;
    //   140: aload_1
    //   141: invokevirtual Dne : (Ljava/lang/StringBuilder;)V
    //   144: return
  }
  
  private static String aFZ() {
    String[] arrayOfString = { 
        "Who set us up the TNT?", "Everything's going to plan. No, really, that was supposed to happen.", "Uh... Did I do that?", "Oops.", "Why did you do that?", "I feel sad now :(", "My bad.", "I'm sorry, Dave.", "I let you down. Sorry :(", "On the bright side, I bought you a teddy bear!", 
        "Daisy, daisy...", "Oh - I know what I did wrong!", "Hey, that tickles! Hehehe!", "I blame Dinnerbone.", "You should try our sister game, Minceraft!", "Don't be sad. I'll do better next time, I promise!", "Don't be sad, have a hug! <3", "I just don't know what went wrong :(", "Shall we play a game?", "Quite honestly, I wouldn't worry myself about that.", 
        "I bet Cylons wouldn't have this problem.", "Sorry :(", "Surprise! Haha. Well, this is awkward.", "Would you like a cupcake?", "Hi. I'm Minecraft, and I'm a crashaholic.", "Ooh. Shiny.", "This doesn't make any sense!", "Why is it breaking :(", "Don't do that.", "Ouch. That hurt :(", 
        "You're mean.", "This is a token for 1 free hug. Redeem at your nearest Mojangsta: [~~HUG~~]", "There are four lights!" };
    try {
      return arrayOfString[(int)(System.nanoTime() % arrayOfString.length)];
    } catch (Throwable throwable) {
      return "Witty comment unavailable :(";
    } 
  }
  
  private void Dne() {
    this.Dne.Dne("Minecraft Version", new vgL(this));
    this.Dne.Dne("Operating System", new RlT(this));
    this.Dne.Dne("Java Version", new stH(this));
    this.Dne.Dne("Java VM Version", new zgx(this));
    this.Dne.Dne("Memory", new VUG(this));
    this.Dne.Dne("JVM Flags", new DhS(this));
    this.Dne.Dne("AABB Pool Size", new Hdu(this));
    this.Dne.Dne("Suspicious classes", new NZx(this));
    this.Dne.Dne("IntCache", new zxR(this));
  }
  
  public Noo Dne(String paramString) {
    return Dne(paramString, 1);
  }
  
  public Noo Dne() {
    return (Noo)this.Dne;
  }
  
  public String FWm() {
    StringBuilder stringBuilder = new StringBuilder();
    Dne(stringBuilder);
    return stringBuilder.toString();
  }
  
  public String Dne() {
    return (String)this.Dne;
  }
  
  public McM(String paramString, Throwable paramThrowable) {
    this.Dne = new ArrayList();
    this.Dne = null;
    this.Dne = true;
    this.Dne = (List)new StackTraceElement[0];
    this.Dne = (List)paramString;
    this.Dne = (List)paramThrowable;
    Dne();
  }
  
  public String Qnq() {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("---- Minecraft Crash Report ----\n");
    stringBuilder.append("// ");
    stringBuilder.append(aFZ());
    stringBuilder.append("\n\n");
    stringBuilder.append("Time: ");
    stringBuilder.append((new SimpleDateFormat()).format(new Date()));
    stringBuilder.append("\n");
    stringBuilder.append("Description: ");
    stringBuilder.append((String)this.Dne);
    stringBuilder.append("\n\n");
    stringBuilder.append(bzF());
    stringBuilder.append("\n\nA detailed walkthrough of the error, its code path and all known details is as follows:\n");
    for (byte b = 0; b < 87; b++)
      stringBuilder.append("-"); 
    stringBuilder.append("\n\n");
    Dne(stringBuilder);
    return stringBuilder.toString();
  }
  
  public boolean Dne(File paramFile, dLs paramdLs) {
    if (this.Dne != null)
      return false; 
    if (paramFile.getParentFile() != null)
      paramFile.getParentFile().mkdirs(); 
    try {
      FileWriter fileWriter = new FileWriter(paramFile);
      fileWriter.write(Qnq());
      fileWriter.close();
      this.Dne = (List)paramFile;
      return true;
    } catch (Throwable throwable) {
      paramdLs.FWm("Could not save crash report to " + paramFile, throwable);
      return false;
    } 
  }
  
  public String bzF() {
    StringWriter stringWriter = null;
    PrintWriter printWriter = null;
    String str = this.Dne.toString();
    try {
      stringWriter = new StringWriter();
      printWriter = new PrintWriter(stringWriter);
      this.Dne.printStackTrace(printWriter);
      str = stringWriter.toString();
    } finally {
      try {
        if (stringWriter != null)
          stringWriter.close(); 
        if (printWriter != null)
          printWriter.close(); 
      } catch (IOException iOException) {}
    } 
    return str;
  }
  
  public Noo Dne(String paramString, int paramInt) {
    Noo noo = new Noo(this, paramString);
    if (this.Dne != null) {
      int i = noo.Dne(paramInt);
      StackTraceElement[] arrayOfStackTraceElement = this.Dne.getStackTrace();
      StackTraceElement stackTraceElement1 = null;
      StackTraceElement stackTraceElement2 = null;
      if (arrayOfStackTraceElement != null && arrayOfStackTraceElement.length - i < arrayOfStackTraceElement.length) {
        stackTraceElement1 = arrayOfStackTraceElement[arrayOfStackTraceElement.length - i];
        if (arrayOfStackTraceElement.length + 1 - i < arrayOfStackTraceElement.length)
          stackTraceElement2 = arrayOfStackTraceElement[arrayOfStackTraceElement.length + 1 - i]; 
      } 
      this.Dne = noo.Dne(stackTraceElement1, stackTraceElement2);
      if (i > 0 && !this.Dne.isEmpty()) {
        Noo noo1 = this.Dne.get(this.Dne.size() - 1);
        noo1.Dne(i);
      } else if (arrayOfStackTraceElement != null && arrayOfStackTraceElement.length >= i) {
        this.Dne = (List)new StackTraceElement[arrayOfStackTraceElement.length - i];
        System.arraycopy(arrayOfStackTraceElement, 0, this.Dne, 0, this.Dne.length);
      } else {
        this.Dne = false;
      } 
    } 
    this.Dne.add(noo);
    return noo;
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\McM.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */