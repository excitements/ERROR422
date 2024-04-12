package net.minecraft.client;

import BMa;
import KNk;
import java.applet.Applet;
import java.awt.BorderLayout;
import java.awt.Canvas;
import java.awt.Component;
import ulX;
import vwN;

public class FWm extends Applet {
  private Canvas Dne;
  
  private Minecraft Dne;
  
  private Thread Dne = null;
  
  public void stop() {
    if (this.Dne != null)
      ((Minecraft)this.Dne).bzF = 1; 
  }
  
  public void start() {
    if (this.Dne != null)
      ((Minecraft)this.Dne).bzF = 0; 
  }
  
  public void destroy() {
    FWm();
  }
  
  public void init() {
    this.Dne = (Thread)new ulX(this);
    boolean bool = "true".equalsIgnoreCase(getParameter("fullscreen"));
    this.Dne = (Thread)new KNk(this, (Canvas)this.Dne, this, getWidth(), getHeight(), bool);
    ((Minecraft)this.Dne).Dne = (BMa)getDocumentBase().getHost();
    if (getDocumentBase().getPort() > 0)
      ((Minecraft)this.Dne).Dne += ":" + getDocumentBase().getPort(); 
    if (getParameter("username") != null && getParameter("sessionid") != null) {
      ((Minecraft)this.Dne).Dne = (BMa)new vwN(getParameter("username"), getParameter("sessionid"));
      this.Dne.Dne().Dne("Setting user: " + ((vwN)((Minecraft)this.Dne).Dne).Dne);
      System.out.println("(Session ID is " + ((vwN)((Minecraft)this.Dne).Dne).FWm + ")");
    } else {
      ((Minecraft)this.Dne).Dne = (BMa)new vwN("Player", "");
    } 
    this.Dne.Dne("true".equals(getParameter("demo")));
    if (getParameter("server") != null && getParameter("port") != null)
      this.Dne.Dne(getParameter("server"), Integer.parseInt(getParameter("port"))); 
    ((Minecraft)this.Dne).FWm = !"true".equals(getParameter("stand-alone")) ? 1 : 0;
    setLayout(new BorderLayout());
    add((Component)this.Dne, "Center");
    this.Dne.setFocusable(true);
    this.Dne.setFocusTraversalKeysEnabled(false);
    validate();
  }
  
  public void FWm() {
    if (this.Dne != null) {
      this.Dne.Qnq();
      try {
        this.Dne.join(10000L);
      } catch (InterruptedException interruptedException) {
        try {
          this.Dne.FWm();
        } catch (Exception exception) {
          exception.printStackTrace();
        } 
      } 
      this.Dne = null;
    } 
  }
  
  public void Dne() {
    if (this.Dne == null) {
      this.Dne = new Thread(this.Dne, "Minecraft main thread");
      this.Dne.start();
    } 
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\net\minecraft\client\FWm.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */