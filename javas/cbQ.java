import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Panel;
import java.awt.TextArea;
import java.io.File;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import net.minecraft.client.Minecraft;
import org.lwjgl.opengl.GL11;

public class cbQ extends Panel {
  public cbQ() {
    Minecraft.Dne.setTitle("🙂");
    setBackground(new Color(0));
    setLayout(new BorderLayout());
    StringWriter stringWriter = new StringWriter();
    String str1 = stringWriter.toString();
    String str2 = "";
    String str3 = "                                                                                                    \r\n                                                                                                    \r\n                                                                                                    \r\n   @@@@@@@@@@  @@@@@@@@    @@@@@@@@      @@@@@@    @@@@@@@@          @@@@    @@@@@@      @@@@@@     \r\n   @@          @@      @@  @@      @@  @@      @@  @@      @@      @@  @@  @@      @@  @@      @@   \r\n   @@@@@@      @@@@@@@@    @@@@@@@@    @@      @@  @@@@@@@@      @@    @@       @@@@        @@@@   \r\n   @@          @@      @@  @@      @@  @@      @@  @@      @@  @@@@@@@@@@    @@@         @@@         \r\n   @@          @@      @@  @@      @@  @@      @@  @@      @@          @@  @@      @@  @@      @@   \r\n   @@@@@@@@@@  @@      @@  @@      @@    @@@@@@    @@      @@          @@  @@@@@@@@@@  @@@@@@@@@@   \r\n                                                                                                    \r\n                                                                                                    ";
    TextArea textArea = new TextArea(str3, 0, 0, 1);
    textArea.setFont(new Font("Monospaced", 0, 12));
    textArea.setForeground(new Color(10682368));
    textArea.setBackground(new Color(0));
    add(new jfy(), "North");
    add(new wJw(80), "East");
    add(new wJw(80), "West");
    add(new wJw(100), "South");
    add(textArea, "Center");
  }
  
  public cbQ(McM paramMcM) {
    setBackground(new Color(0));
    setLayout(new BorderLayout());
    StringWriter stringWriter = new StringWriter();
    paramMcM.Dne().printStackTrace(new PrintWriter(stringWriter));
    String str1 = stringWriter.toString();
    String str2 = "";
    String str3 = "";
    try {
      str3 = str3 + "Generated " + (new SimpleDateFormat()).format(new Date()) + "\n";
      str3 = str3 + "\n";
      str3 = str3 + paramMcM.FWm();
      str2 = GL11.glGetString(7936);
    } catch (Throwable throwable) {
      str3 = str3 + "[failed to get system properties (" + throwable + ")]\n";
    } 
    str3 = str3 + "\n\n";
    str3 = str3 + str1;
    String str4 = "";
    str4 = str4 + "\n";
    str4 = str4 + "\n";
    if (str1.contains("Pixel format not accelerated")) {
      str4 = str4 + "      Bad video card drivers!      \n";
      str4 = str4 + "      -----------------------      \n";
      str4 = str4 + "\n";
      str4 = str4 + "Minecraft was unable to start because it failed to find an accelerated OpenGL mode.\n";
      str4 = str4 + "This can usually be fixed by updating the video card drivers.\n";
      if (str2.toLowerCase().contains("nvidia")) {
        str4 = str4 + "\n";
        str4 = str4 + "You might be able to find drivers for your video card here:\n";
        str4 = str4 + "  http://www.nvidia.com/\n";
      } else if (str2.toLowerCase().contains("ati")) {
        str4 = str4 + "\n";
        str4 = str4 + "You might be able to find drivers for your video card here:\n";
        str4 = str4 + "  http://www.amd.com/\n";
      } 
    } else {
      str4 = str4 + "      Minecraft has crashed!      \n";
      str4 = str4 + "      ----------------------      \n";
      str4 = str4 + "\n";
      str4 = str4 + "Minecraft has stopped running because it encountered a problem; " + paramMcM.Dne() + "\n\n";
      File file = paramMcM.Dne();
      if (file == null) {
        paramMcM.Dne(new File(new File(Minecraft.Dne(), "crash-reports"), "crash-" + (new SimpleDateFormat("yyyy-MM-dd_HH.mm.ss")).format(new Date()) + "-client.txt"), Minecraft.Dne().Dne());
        file = paramMcM.Dne();
      } 
      if (file != null) {
        String str = file.getAbsolutePath();
        str4 = str4 + "A full error report has been saved to " + str + " - Please include a copy of that file (Not this screen!) if you report this crash to anyone; without it, they will not be able to help fix the crash :(";
        str3 = "Full report at:\n" + str + "\nPlease show that file to Mojang, NOT just this screen!\n\n" + str3;
      } else {
        str4 = str4 + "We were unable to save this report to a file.";
      } 
      str4 = str4 + "\n";
    } 
    str4 = str4 + "\n";
    str4 = str4 + "\n";
    str4 = str4 + "\n";
    str4 = str4 + "--- BEGIN ERROR REPORT " + Integer.toHexString(str4.hashCode()) + " --------\n";
    str4 = str4 + str3;
    str4 = str4 + "--- END ERROR REPORT " + Integer.toHexString(str4.hashCode()) + " ----------\n";
    str4 = str4 + "\n";
    str4 = str4 + "\n";
    TextArea textArea = new TextArea(str4, 0, 0, 1);
    textArea.setFont(new Font("Monospaced", 0, 12));
    textArea.setForeground(new Color(10682368));
    textArea.setBackground(new Color(0));
    add(new jfy(), "North");
    add(new wJw(80), "East");
    add(new wJw(80), "West");
    add(new wJw(100), "South");
    add(textArea, "Center");
  }
  
  static {
  
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\cbQ.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */