import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.net.URL;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import net.minecraft.client.Minecraft;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class YBR extends Thread {
  private boolean Dne;
  
  public File Dne;
  
  private Minecraft Dne = false;
  
  public YBR(File paramFile, Minecraft paramMinecraft) {
    this.Dne = paramMinecraft;
    setName("Resource download thread");
    setDaemon(true);
    this.Dne = (Minecraft)new File(paramFile, "resources/");
    if (!this.Dne.exists() && !this.Dne.mkdirs())
      throw new RuntimeException("The working directory could not be created: " + this.Dne); 
  }
  
  public void run() {
    try {
      URL uRL = new URL("http://s3.amazonaws.com/MinecraftResources/");
      DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
      DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
      Document document = documentBuilder.parse(uRL.openStream());
      NodeList nodeList = document.getElementsByTagName("Contents");
      for (byte b = 0; b < 2; b++) {
        for (byte b1 = 0; b1 < nodeList.getLength(); b1++) {
          Node node = nodeList.item(b1);
          if (node.getNodeType() == 1) {
            Element element = (Element)node;
            String str = element.getElementsByTagName("Key").item(0).getChildNodes().item(0).getNodeValue();
            long l = Long.parseLong(element.getElementsByTagName("Size").item(0).getChildNodes().item(0).getNodeValue());
            if (l > 0L) {
              Dne(uRL, str, l, b);
              if (this.Dne != null)
                return; 
            } 
          } 
        } 
      } 
    } catch (Exception exception) {
      Dne((File)this.Dne, "");
      exception.printStackTrace();
    } 
  }
  
  public void FWm() {
    this.Dne = true;
  }
  
  private void Dne(URL paramURL, File paramFile, long paramLong) {
    byte[] arrayOfByte = new byte[4096];
    DataInputStream dataInputStream = new DataInputStream(paramURL.openStream());
    DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(paramFile));
    boolean bool = false;
    do {
      int i;
      if ((i = dataInputStream.read(arrayOfByte)) < 0) {
        dataInputStream.close();
        dataOutputStream.close();
        return;
      } 
      dataOutputStream.write(arrayOfByte, 0, i);
    } while (this.Dne == null);
  }
  
  private void Dne(File paramFile, String paramString) {
    File[] arrayOfFile = paramFile.listFiles();
    for (byte b = 0; b < arrayOfFile.length; b++) {
      if (arrayOfFile[b].isDirectory()) {
        Dne(arrayOfFile[b], paramString + arrayOfFile[b].getName() + "/");
      } else {
        try {
          this.Dne.Dne(paramString + arrayOfFile[b].getName(), arrayOfFile[b]);
        } catch (Exception exception) {
          this.Dne.Dne().FWm("Failed to add " + paramString + arrayOfFile[b].getName() + " in resources");
        } 
      } 
    } 
  }
  
  private void Dne(URL paramURL, String paramString, long paramLong, int paramInt) {
    try {
      int i = paramString.indexOf("/");
      String str = paramString.substring(0, i);
      if (str.equalsIgnoreCase("sound3")) {
        if (paramInt != 0)
          return; 
      } else if (paramInt != 1) {
        return;
      } 
      File file = new File((File)this.Dne, paramString);
      if (!file.exists() || file.length() != paramLong) {
        file.getParentFile().mkdirs();
        String str1 = paramString.replaceAll(" ", "%20");
        Dne(new URL(paramURL, str1), file, paramLong);
        if (this.Dne != null)
          return; 
      } 
      this.Dne.Dne(paramString, file);
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  public void Dne() {
    Dne((File)this.Dne, "");
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\YBR.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */