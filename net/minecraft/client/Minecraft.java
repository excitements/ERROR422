package net.minecraft.client;

import ALq;
import Afj;
import Ayv;
import BMa;
import BPY;
import Bkx;
import BwZ;
import Ebp;
import EsO;
import Ext;
import FNi;
import FUH;
import FiG;
import FkP;
import Gup;
import IJm;
import Jvu;
import KGL;
import Kjm;
import Klb;
import MCb;
import MJs;
import MKS;
import MOS;
import McM;
import NMq;
import Noo;
import OEA;
import ONk;
import Pdb;
import QFY;
import QPH;
import QXI;
import Qnq;
import RJV;
import RXf;
import SlE;
import Snh;
import Tsf;
import Tub;
import Vmi;
import VzZ;
import WAR;
import WGf;
import WQU;
import XyI;
import YBR;
import YcA;
import YiY;
import ZPT;
import aDx;
import aUl;
import arC;
import ark;
import bSp;
import bqd;
import bzF;
import bze;
import chN;
import dEr;
import dLs;
import etB;
import evf;
import fZI;
import fgp;
import fhF;
import fjc;
import fzy;
import gTB;
import geR;
import gks;
import hdK;
import hur;
import iDE;
import irb;
import java.applet.AppletStub;
import java.awt.BorderLayout;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.WindowListener;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Callable;
import javax.swing.JPanel;
import kaJ;
import mKT;
import mrb;
import msA;
import oCF;
import org.lwjgl.LWJGLException;
import org.lwjgl.Sys;
import org.lwjgl.input.Keyboard;
import org.lwjgl.input.Mouse;
import org.lwjgl.opengl.ContextCapabilities;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.DisplayMode;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GLContext;
import org.lwjgl.opengl.PixelFormat;
import org.lwjgl.util.glu.GLU;
import pZS;
import ptH;
import qCF;
import qKn;
import qQe;
import qVZ;
import qlg;
import rND;
import rXx;
import rqj;
import sMa;
import snt;
import tAS;
import trP;
import ulE;
import uqg;
import vmT;
import vwN;
import wHH;
import wzJ;
import xEs;
import xoY;
import yIW;
import zHD;
import zKP;
import zVu;
import zpX;

public abstract class Minecraft implements hur, Runnable {
  public Afj Dne;
  
  public msA Dne;
  
  public RJV Dne;
  
  private int div;
  
  public static byte[] Dne = new byte[10485760];
  
  public qVZ Dne;
  
  public rqj Dne;
  
  private etB Dne;
  
  private EsO Dne;
  
  public boolean Qnq;
  
  public Tsf Dne;
  
  private YiY Dne;
  
  long FWm;
  
  private int zGp;
  
  private int mrb;
  
  private int aFZ;
  
  long Dne;
  
  public msA FWm;
  
  public MJs Dne;
  
  public boolean FWm;
  
  private static File FWm = null;
  
  private boolean XHL;
  
  boolean aFZ;
  
  private String Qnq;
  
  public Jvu Dne;
  
  private int Qnq;
  
  private String bzF;
  
  public String FWm;
  
  public int FWm;
  
  long bzF;
  
  private int IjH;
  
  private McM Dne;
  
  public String Dne;
  
  private evf Dne;
  
  public ark Dne;
  
  private boolean IjH;
  
  private zHD Dne;
  
  public final Bkx Dne;
  
  public aUl Dne;
  
  public OEA Dne;
  
  public Snh Dne;
  
  protected FWm FWm;
  
  public volatile boolean bzF;
  
  int bzF;
  
  public vwN Dne;
  
  private final dLs Dne;
  
  private boolean div = false;
  
  private static Minecraft Dne;
  
  private RXf Dne;
  
  private static int DyG;
  
  public volatile boolean DyG;
  
  private YBR Dne;
  
  public File Dne;
  
  public FkP Dne;
  
  public boolean Dne;
  
  private boolean mrb;
  
  public int Dne;
  
  public mKT Dne;
  
  public FUH FWm;
  
  public FUH Dne;
  
  public Canvas Dne;
  
  public static Frame Dne;
  
  public boolean zGp;
  
  public fZI Dne;
  
  public wHH Dne;
  
  private long Qnq;
  
  public VzZ Dne;
  
  public BMa Dne = (BMa)new WQU("Minecraft-Client", " [CLIENT]", (new File(Dne(), "output-client.log")).getAbsolutePath());
  
  public static int Dne() {
    for (int i = 16384; i > 0; i >>= 1) {
      GL11.glTexImage2D(32868, 0, 6408, i, i, 0, 6408, 5121, (ByteBuffer)null);
      int j = GL11.glGetTexLevelParameteri(32868, 0, 4096);
      if (j != 0)
        return i; 
    } 
    return -1;
  }
  
  public static boolean FWm() {
    return (Dne == null || !((fZI)((Minecraft)Dne).Dne).ceE);
  }
  
  public boolean div() {
    return this.div;
  }
  
  public void Dne(VzZ paramVzZ) {
    Dne(paramVzZ, "");
  }
  
  public etB Dne() {
    return (etB)this.Dne;
  }
  
  public String bzF() {
    return this.Dne.FWm();
  }
  
  private void Dne(int paramInt1, int paramInt2) {
    this.Dne = (paramInt1 <= 0) ? 1 : paramInt1;
    this.FWm = (paramInt2 <= 0) ? 1 : paramInt2;
    if (this.Dne != null) {
      IJm iJm = new IJm((fZI)this.Dne, paramInt1, paramInt2);
      int i = iJm.Dne();
      int j = iJm.FWm();
      this.Dne.Dne(this, i, j);
    } 
  }
  
  public abstract void Dne(McM paramMcM);
  
  public void FWm(McM paramMcM) {
    this.Dne = true;
    this.Dne = (BMa)paramMcM;
  }
  
  public void Dne(String paramString, int paramInt) {
    this.bzF = paramString;
    this.IjH = paramInt;
  }
  
  public void Dne(qVZ paramqVZ) {
    MKS mKS;
    YcA ycA;
    if (this.Dne != null)
      this.Dne.FWm(); 
    this.Dne.Dne();
    if (paramqVZ == null && this.Dne == null) {
      mKS = new MKS();
    } else if (mKS == null && this.Dne.XHL() <= 0) {
      ycA = new YcA();
    } 
    if (ycA instanceof MKS) {
      ((fZI)this.Dne).EyB = false;
      this.Dne.Dne().Dne();
    } 
    this.Dne = (BMa)ycA;
    if (ycA != null) {
      zGp();
      IJm iJm = new IJm((fZI)this.Dne, this.Dne, this.FWm);
      int i = iJm.Dne();
      int j = iJm.FWm();
      ycA.Dne(this, i, j);
      this.Qnq = 0L;
    } else {
      aFZ();
    } 
  }
  
  public void FWm() {
    try {
      this.Dne.Dne();
      try {
        if (this.Dne != null)
          this.Dne.FWm(); 
      } catch (Exception exception) {}
      Dne().Dne("Stopping!");
      try {
        Dne((VzZ)null);
      } catch (Throwable throwable) {}
      try {
        pZS.FWm();
      } catch (Throwable throwable) {}
      this.Dne.FWm();
      Mouse.destroy();
      Keyboard.destroy();
    } finally {
      Display.destroy();
      if (this.Dne == null)
        System.exit(0); 
    } 
    System.gc();
  }
  
  public boolean zGp() {
    return this.XHL;
  }
  
  public void zGp() {
    if (this.zGp) {
      ulE.Dne();
      this.zGp = false;
      this.Dne.FWm();
    } 
  }
  
  public void Qnq() {
    this.DyG = false;
  }
  
  public String Qnq() {
    return "P: " + this.Dne.Dne() + ". T: " + this.Dne.Dne();
  }
  
  public final boolean Dne() {
    return this.mrb;
  }
  
  public void Dne() {
    if (this.Dne != null) {
      Graphics graphics = this.Dne.getGraphics();
      if (graphics != null) {
        graphics.setColor(Color.BLACK);
        graphics.fillRect(0, 0, this.Dne, this.FWm);
        graphics.dispose();
      } 
      Display.setParent((Canvas)this.Dne);
    } else if (this.div) {
      Display.setFullscreen(true);
      this.Dne = Display.getDisplayMode().getWidth();
      this.FWm = Display.getDisplayMode().getHeight();
      if (this.Dne <= null)
        this.Dne = true; 
      if (this.FWm <= null)
        this.FWm = true; 
    } else {
      Display.setDisplayMode(new DisplayMode(this.Dne, this.FWm));
    } 
    Display.setTitle("M̶i̶n̶e̶c̶r̶a̶f̶t̶  ERROR422");
    Dne().Dne("LWJGL Version: " + Sys.getVersion());
    try {
      Display.create((new PixelFormat()).withDepthBits(24));
    } catch (LWJGLException lWJGLException) {
      lWJGLException.printStackTrace();
      try {
        Thread.sleep(1000L);
      } catch (InterruptedException interruptedException) {}
      Display.create();
    } 
    oCF.Dne();
    this.Dne = (BMa)Dne();
    this.Dne = (BMa)new Kjm(new File((File)this.Dne, "saves"));
    this.Dne = (BMa)new fZI(this, (File)this.Dne);
    this.Dne = (BMa)new ark((File)this.Dne, this);
    this.Dne = (BMa)new Snh((ark)this.Dne, (fZI)this.Dne);
    kGO();
    this.Dne = (BMa)new msA((fZI)this.Dne, "/font/default.png", (Snh)this.Dne, false);
    this.FWm = (FUH)new msA((fZI)this.Dne, "/font/alternate.png", (Snh)this.Dne, false);
    if (((fZI)this.Dne).bzF != null) {
      irb.Dne().Dne(((fZI)this.Dne).bzF, false);
      this.Dne.Dne(irb.Dne().Dne());
      this.Dne.FWm(irb.FWm(((fZI)this.Dne).bzF));
    } 
    bzF.Dne(this.Dne.Dne("/misc/grasscolor.png"));
    QFY.Dne(this.Dne.Dne("/misc/foliagecolor.png"));
    this.Dne = (BMa)new OEA(this);
    ptH.Dne.Dne = (ptH)new XyI(this);
    this.Dne = (BMa)new FkP((vwN)this.Dne, (File)this.Dne);
    qlg.Dne.Dne((WGf)new Ayv(this));
    kGO();
    Mouse.create();
    this.Dne = (BMa)new Jvu((Component)this.Dne, (fZI)this.Dne);
    Dne("Pre startup");
    GL11.glEnable(3553);
    GL11.glShadeModel(7425);
    GL11.glClearDepth(1.0D);
    GL11.glEnable(2929);
    GL11.glDepthFunc(515);
    GL11.glEnable(3008);
    GL11.glAlphaFunc(516, 0.1F);
    GL11.glCullFace(1029);
    GL11.glMatrixMode(5889);
    GL11.glLoadIdentity();
    GL11.glMatrixMode(5888);
    Dne("Startup");
    this.Dne.Dne((fZI)this.Dne);
    this.Dne = (BMa)new rqj(this, (Snh)this.Dne);
    this.Dne.Qnq();
    GL11.glViewport(0, 0, this.Dne, this.FWm);
    this.Dne = new BMa((Qnq)this.Dne, (Snh)this.Dne);
    try {
      this.Dne = (BMa)new YBR((File)this.Dne, this);
      this.Dne.start();
    } catch (Exception exception) {}
    Dne("Post startup");
    this.Dne = (BMa)new aUl(this);
    if (this.bzF != null) {
      Dne((qVZ)new rND((qVZ)new MKS(), this, this.bzF, this.IjH));
    } else {
      Dne((qVZ)new MKS());
    } 
    this.Dne = (BMa)new Afj(this);
    if (((fZI)this.Dne).Zpi && !this.div)
      div(); 
  }
  
  public void aFZ() {
    if (Display.isActive() && !this.zGp) {
      this.zGp = true;
      this.Dne.Dne();
      Dne((qVZ)null);
      this.Qnq = 10000L;
    } 
  }
  
  public static ZPT Dne() {
    String str = System.getProperty("os.name").toLowerCase();
    return str.contains("win") ? ZPT.bzF : (str.contains("mac") ? ZPT.Qnq : (str.contains("solaris") ? ZPT.FWm : (str.contains("sunos") ? ZPT.FWm : (str.contains("linux") ? ZPT.Dne : (str.contains("unix") ? ZPT.Dne : ZPT.aFZ)))));
  }
  
  public boolean DyG() {
    return (this.XHL && this.Dne != null);
  }
  
  public void Dne(String paramString, File paramFile) {
    int i = paramString.indexOf("/");
    String str = paramString.substring(0, i);
    paramString = paramString.substring(i + 1);
    if (str.equalsIgnoreCase("sound3")) {
      this.Dne.Dne(paramString, paramFile);
    } else if (str.equalsIgnoreCase("streaming")) {
      this.Dne.FWm(paramString, paramFile);
    } else if (!str.equalsIgnoreCase("music") && !str.equalsIgnoreCase("newmusic")) {
      if (str.equalsIgnoreCase("lang"))
        irb.Dne().Dne(paramString, paramFile); 
    } else {
      this.Dne.bzF(paramString, paramFile);
    } 
  }
  
  public static long Dne() {
    return Sys.getTime() * 1000L / Sys.getTimerResolution();
  }
  
  public dLs Dne() {
    return (dLs)this.Dne;
  }
  
  public McM Dne(McM paramMcM) {
    paramMcM.Dne().Dne("LWJGL", (Callable)new BwZ(this));
    paramMcM.Dne().Dne("OpenGL", (Callable)new fhF(this));
    paramMcM.Dne().Dne("Is Modded", (Callable)new Tub(this));
    paramMcM.Dne().Dne("Type", (Callable)new FNi(this));
    paramMcM.Dne().Dne("Texture Pack", (Callable)new yIW(this));
    paramMcM.Dne().Dne("Profiler Position", (Callable)new QPH(this));
    paramMcM.Dne().Dne("Vec3 Pool Size", (Callable)new qCF(this));
    if (this.Dne != null)
      this.Dne.Dne(paramMcM); 
    return paramMcM;
  }
  
  private void ooe() {
    if (Keyboard.isKeyDown(60)) {
      if (!this.aFZ) {
        this.aFZ = true;
        this.Dne.Dne().Dne(qQe.Dne((File)FWm, this.Dne, this.FWm));
      } 
    } else {
      this.aFZ = false;
    } 
  }
  
  public evf Dne() {
    return (evf)this.Dne;
  }
  
  public static boolean Qnq() {
    return (Dne != null && ((fZI)((Minecraft)Dne).Dne).bzF != null);
  }
  
  private void Dne(int paramInt, boolean paramBoolean) {
    if (!paramBoolean)
      this.Qnq = 0L; 
    if (paramInt != 0 || this.Qnq <= 0L)
      if (paramBoolean && this.Dne != null && ((wHH)this.Dne).Dne == gks.Dne && paramInt == 0) {
        gks gks = ((wHH)this.Dne).Dne;
        int i = ((wHH)this.Dne).FWm;
        int j = ((wHH)this.Dne).bzF;
        this.Dne.FWm(gks, i, j, ((wHH)this.Dne).Qnq);
        if (this.Dne.FWm(gks, i, j)) {
          this.Dne.Dne(gks, i, j, ((wHH)this.Dne).Qnq);
          this.Dne.bzF();
        } 
      } else {
        this.Dne.Dne();
      }  
  }
  
  public static void XHL() {
    if (Dne != null) {
      zHD zHD1 = Dne.Dne();
      if (zHD1 != null)
        zHD1.FWm(); 
    } 
  }
  
  public void Dne(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6) {
    float f1 = 0.00390625F;
    float f2 = 0.00390625F;
    WAR wAR = WAR.Dne;
    wAR.Dne();
    wAR.Dne((paramInt1 + 0), (paramInt2 + paramInt6), 0.0D, ((paramInt3 + 0) * f1), ((paramInt4 + paramInt6) * f2));
    wAR.Dne((paramInt1 + paramInt5), (paramInt2 + paramInt6), 0.0D, ((paramInt3 + paramInt5) * f1), ((paramInt4 + paramInt6) * f2));
    wAR.Dne((paramInt1 + paramInt5), (paramInt2 + 0), 0.0D, ((paramInt3 + paramInt5) * f1), ((paramInt4 + 0) * f2));
    wAR.Dne((paramInt1 + 0), (paramInt2 + 0), 0.0D, ((paramInt3 + 0) * f1), ((paramInt4 + 0) * f2));
    wAR.Dne();
  }
  
  public void Dne(etB parametB) {
    this.Dne = (BMa)parametB;
  }
  
  private void qLR() {
    if (this.Dne != null) {
      int j;
      boolean bool1 = ((MJs)this.Dne).Dne.Qnq;
      int i = 0;
      boolean bool2 = false;
      if (((wHH)this.Dne).Dne == gks.Dne) {
        gks gks = ((wHH)this.Dne).Dne;
        int k = ((wHH)this.Dne).FWm;
        int m = ((wHH)this.Dne).bzF;
        zKP zKP = zKP.Dne[this.Dne.Dne(gks, k, m)];
        if (zKP == null)
          return; 
        j = zKP.Dne((Qnq)this.Dne, gks, k, m);
        if (j == 0)
          return; 
        bool2 = dEr.Dne[j].zGp();
        int n = (j < 256 && !zKP.Dne[zKP.FWm].div()) ? j : zKP.FWm;
        i = zKP.Dne[n].FWm((Qnq)this.Dne, gks, k, m);
      } else {
        if (((wHH)this.Dne).Dne != gks.FWm || ((wHH)this.Dne).Dne == null || !bool1)
          return; 
        if (((wHH)this.Dne).Dne instanceof JCd) {
          j = dEr.ICU.Qnq;
        } else if (((wHH)this.Dne).Dne instanceof BPY) {
          BPY bPY = (BPY)((wHH)this.Dne).Dne;
          if (bPY.Dne() == null) {
            j = dEr.FUM.Qnq;
          } else {
            j = (bPY.Dne()).bzF;
            i = bPY.Dne().Qnq();
            bool2 = true;
          } 
        } else if (((wHH)this.Dne).Dne instanceof Ebp) {
          Ebp ebp = (Ebp)((wHH)this.Dne).Dne;
          if (ebp.XHL() == 2) {
            j = dEr.aJO.Qnq;
          } else if (ebp.XHL() == 1) {
            j = dEr.sly.Qnq;
          } else if (ebp.XHL() == 3) {
            j = dEr.Dsg.Qnq;
          } else if (ebp.XHL() == 5) {
            j = dEr.yHt.Qnq;
          } else {
            j = dEr.IYC.Qnq;
          } 
        } else if (((wHH)this.Dne).Dne instanceof iMX) {
          j = dEr.CZC.Qnq;
        } else {
          j = dEr.ghu.Qnq;
          i = Klb.Dne((sMa)((wHH)this.Dne).Dne);
          bool2 = true;
          if (i <= 0 || !Klb.Dne.containsKey(Integer.valueOf(i)))
            return; 
        } 
      } 
      ((MJs)this.Dne).Dne.Dne(j, i, bool2, bool1);
      if (bool1) {
        int k = ((Pdb)((MJs)this.Dne).Dne).bzF.size() - 9 + ((MOS)((MJs)this.Dne).Dne).Dne;
        this.Dne.Dne(((MJs)this.Dne).Dne.Dne(((MOS)((MJs)this.Dne).Dne).Dne), k);
      } 
    } 
  }
  
  public void mrb() {
    this.IjH = true;
  }
  
  public static Minecraft Dne() {
    return (Minecraft)Dne;
  }
  
  public void run() {
    this.DyG = true;
    try {
      Dne();
    } catch (Exception exception) {
      exception.printStackTrace();
      bzF(Dne(new McM("Failed to start game", exception)));
      return;
    } 
    try {
      while (this.DyG) {
        if (this.Dne != null && this.Dne != null) {
          bzF((McM)this.Dne);
          return;
        } 
        if (this.IjH) {
          this.IjH = false;
          this.Dne.bzF();
        } 
        try {
          udO();
        } catch (OutOfMemoryError outOfMemoryError) {
          bzF();
          Dne((qVZ)new qKn());
          System.gc();
        } 
      } 
    } catch (MCb mCb) {
    
    } catch (kaJ kaJ) {
      Dne(kaJ.Dne());
      bzF();
      kaJ.printStackTrace();
      bzF(kaJ.Dne());
    } catch (Throwable throwable) {
      McM mcM = Dne(new McM("Unexpected error", throwable));
      bzF();
      throwable.printStackTrace();
      bzF(mcM);
    } finally {
      FWm();
    } 
  }
  
  public boolean aFZ() {
    return ((fZI)this.Dne).XHL;
  }
  
  public static void main(String[] paramArrayOfString) {
    HashMap<Object, Object> hashMap = new HashMap<>();
    boolean bool1 = false;
    boolean bool2 = true;
    boolean bool3 = false;
    String str1 = "Player" + (Dne() % 1000L);
    String str2 = str1;
    if (paramArrayOfString.length > 0)
      str2 = paramArrayOfString[0]; 
    String str3 = "-";
    if (paramArrayOfString.length > 1)
      str3 = paramArrayOfString[1]; 
    ArrayList<String> arrayList = new ArrayList();
    for (byte b = 2; b < paramArrayOfString.length; b++) {
      String str4 = paramArrayOfString[b];
      String str5 = (b == paramArrayOfString.length - 1) ? null : paramArrayOfString[b + 1];
      boolean bool = false;
      if (!str4.equals("-demo") && !str4.equals("--demo")) {
        if (str4.equals("--applet")) {
          bool2 = false;
        } else if (str4.equals("--password") && str5 != null) {
          String[] arrayOfString = fgp.Dne((dLs)null, str2, str5);
          if (arrayOfString != null) {
            str2 = arrayOfString[0];
            str3 = arrayOfString[1];
            arrayList.add("Logged in insecurely as " + str2);
          } else {
            arrayList.add("Could not log in as " + str2 + " with given password");
          } 
          bool = true;
        } 
      } else {
        bool1 = true;
      } 
      if (bool)
        b++; 
    } 
    if (str2.contains("@") && str3.length() <= 1)
      str2 = str1; 
    hashMap.put("demo", "" + bool1);
    hashMap.put("stand-alone", "" + bool2);
    hashMap.put("username", str2);
    hashMap.put("fullscreen", "" + bool3);
    hashMap.put("sessionid", str3);
    Frame frame = new Frame();
    Dne = (BMa)frame;
    frame.setTitle("É̷̩̰̠͇͙͂̿̽̿̉̈́͋͌̃̓̃R̶̢͙̺̜͕̟͛͒̈́̏͌R̷̞̝̦̦̖̒̈́͗̋̓̒Ỏ̵͚̣̜͉͇̘̫̳̦̭̄̚͝Ṟ̵͚̩͈̖̙̬̻̤͂̋̂͌̀͐̓͌͂̆4̸̰̻̝̰͚͔̜͒͑̐̿͛̊͒̄͝͝2̶̨̨̗͇͙̰͚̯̫̈́̽̉̽̕͠2̶̢̭̜̭͉̟̳͔̗̻́͑͌̋̌̒̚͜");
    frame.setBackground(Color.BLACK);
    JPanel jPanel = new JPanel();
    frame.setLayout(new BorderLayout());
    jPanel.setPreferredSize(new Dimension(854, 480));
    frame.add(jPanel, "Center");
    frame.pack();
    frame.setLocationRelativeTo((Component)null);
    frame.setVisible(true);
    frame.addWindowListener((WindowListener)new fjc());
    ALq aLq = new ALq(hashMap);
    FWm fWm = new FWm();
    fWm.setStub((AppletStub)aLq);
    aLq.setLayout(new BorderLayout());
    aLq.add(fWm, "Center");
    aLq.validate();
    frame.removeAll();
    frame.setLayout(new BorderLayout());
    frame.add((Component)aLq, "Center");
    frame.validate();
    fWm.init();
    for (String str : arrayList)
      Dne().Dne().Dne(str); 
    fWm.start();
    Runtime.getRuntime().addShutdownHook((Thread)new arC());
  }
  
  public void FWm(evf paramevf) {
    paramevf.Dne("opengl_version", GL11.glGetString(7938));
    paramevf.Dne("opengl_vendor", GL11.glGetString(7936));
    paramevf.Dne("client_brand", Dne.Dne());
    paramevf.Dne("applet", Boolean.valueOf(this.FWm));
    ContextCapabilities contextCapabilities = GLContext.getCapabilities();
    paramevf.Dne("gl_caps[ARB_multitexture]", Boolean.valueOf(contextCapabilities.GL_ARB_multitexture));
    paramevf.Dne("gl_caps[ARB_multisample]", Boolean.valueOf(contextCapabilities.GL_ARB_multisample));
    paramevf.Dne("gl_caps[ARB_texture_cube_map]", Boolean.valueOf(contextCapabilities.GL_ARB_texture_cube_map));
    paramevf.Dne("gl_caps[ARB_vertex_blend]", Boolean.valueOf(contextCapabilities.GL_ARB_vertex_blend));
    paramevf.Dne("gl_caps[ARB_matrix_palette]", Boolean.valueOf(contextCapabilities.GL_ARB_matrix_palette));
    paramevf.Dne("gl_caps[ARB_vertex_program]", Boolean.valueOf(contextCapabilities.GL_ARB_vertex_program));
    paramevf.Dne("gl_caps[ARB_vertex_shader]", Boolean.valueOf(contextCapabilities.GL_ARB_vertex_shader));
    paramevf.Dne("gl_caps[ARB_fragment_program]", Boolean.valueOf(contextCapabilities.GL_ARB_fragment_program));
    paramevf.Dne("gl_caps[ARB_fragment_shader]", Boolean.valueOf(contextCapabilities.GL_ARB_fragment_shader));
    paramevf.Dne("gl_caps[ARB_shader_objects]", Boolean.valueOf(contextCapabilities.GL_ARB_shader_objects));
    paramevf.Dne("gl_caps[ARB_vertex_buffer_object]", Boolean.valueOf(contextCapabilities.GL_ARB_vertex_buffer_object));
    paramevf.Dne("gl_caps[ARB_framebuffer_object]", Boolean.valueOf(contextCapabilities.GL_ARB_framebuffer_object));
    paramevf.Dne("gl_caps[ARB_pixel_buffer_object]", Boolean.valueOf(contextCapabilities.GL_ARB_pixel_buffer_object));
    paramevf.Dne("gl_caps[ARB_uniform_buffer_object]", Boolean.valueOf(contextCapabilities.GL_ARB_uniform_buffer_object));
    paramevf.Dne("gl_caps[ARB_texture_non_power_of_two]", Boolean.valueOf(contextCapabilities.GL_ARB_texture_non_power_of_two));
    paramevf.Dne("gl_caps[gl_max_vertex_uniforms]", Integer.valueOf(GL11.glGetInteger(35658)));
    paramevf.Dne("gl_caps[gl_max_fragment_uniforms]", Integer.valueOf(GL11.glGetInteger(35657)));
    paramevf.Dne("gl_max_texture_size", Integer.valueOf(Dne()));
  }
  
  public void IjH() {
    if (this.div)
      this.div--; 
    this.Dne.Dne("stats");
    this.Dne.FWm();
    this.Dne.FWm("gui");
    if (this.bzF == 0)
      this.Dne.Dne(); 
    this.Dne.FWm("pick");
    this.Dne.Dne(1.0F);
    this.Dne.FWm("gameMode");
    if (this.bzF == 0 && this.Dne != null)
      this.Dne.FWm(); 
    this.Dne.Dne("/terrain.png");
    this.Dne.FWm("textures");
    if (this.bzF == 0)
      this.Dne.FWm(); 
    if (this.Dne == null && this.Dne != null) {
      if (this.Dne.XHL() <= 0) {
        Dne((qVZ)null);
      } else if (this.Dne.Wwe() && this.Dne != null) {
        Dne((qVZ)new vmT());
      } 
    } else if (this.Dne != null && this.Dne instanceof vmT && !this.Dne.Wwe()) {
      Dne((qVZ)null);
    } 
    if (this.Dne != null)
      this.Qnq = 10000L; 
    if (this.Dne != null) {
      try {
        this.Dne.DyG();
      } catch (Throwable throwable) {
        McM mcM = McM.Dne(throwable, "Updating screen events");
        Noo noo = mcM.Dne("Affected screen");
        noo.Dne("Screen name", (Callable)new aDx(this));
        throw new kaJ(mcM);
      } 
      if (this.Dne != null) {
        try {
          ((qVZ)this.Dne).Dne.Dne();
        } catch (Throwable throwable) {
          McM mcM = McM.Dne(throwable, "Ticking screen particles");
          Noo noo = mcM.Dne("Affected screen");
          noo.Dne("Screen name", (Callable)new wzJ(this));
          throw new kaJ(mcM);
        } 
        try {
          this.Dne.bzF();
        } catch (Throwable throwable) {
          McM mcM = McM.Dne(throwable, "Ticking screen");
          Noo noo = mcM.Dne("Affected screen");
          noo.Dne("Screen name", (Callable)new xEs(this));
          throw new kaJ(mcM);
        } 
      } 
    } 
    if (this.Dne == null || ((qVZ)this.Dne).FWm) {
      this.Dne.FWm("mouse");
      while (Mouse.next() && QXI.Dne == null && QXI.Dne == null) {
        ulE.Dne(Mouse.getEventButton() - 100, Mouse.getEventButtonState());
        if (Mouse.getEventButtonState())
          ulE.Dne(Mouse.getEventButton() - 100); 
        long l = Dne() - this.Dne;
        if (l <= 200L) {
          int i = Mouse.getEventDWheel();
          if (i != 0) {
            ((MJs)this.Dne).Dne.Dne(i);
            if (((fZI)this.Dne).OdI) {
              if (i > 0)
                i = 1; 
              if (i < 0)
                i = -1; 
              ((fZI)this.Dne).IjH += i * 0.25F;
            } 
          } 
          if (this.Dne == null) {
            if (!this.zGp && Mouse.getEventButtonState())
              aFZ(); 
            continue;
          } 
          if (this.Dne != null)
            this.Dne.Qnq(); 
        } 
      } 
      if (this.Qnq > 0L)
        this.Qnq--; 
      this.Dne.FWm("keyboard");
      while (Keyboard.next() && QXI.Dne == null && (QXI.Dne != hdK.Dne || this.Dne == null)) {
        ulE.Dne(Keyboard.getEventKey(), Keyboard.getEventKeyState());
        if (Keyboard.getEventKeyState())
          ulE.Dne(Keyboard.getEventKey()); 
        if (this.Qnq > 0L) {
          if (Dne() - this.Qnq >= 6000L)
            throw new kaJ(new McM("Manually triggered debug crash", new Throwable())); 
          if (!Keyboard.isKeyDown(46) || !Keyboard.isKeyDown(61))
            this.Qnq = -1L; 
        } else if (Keyboard.isKeyDown(46) && Keyboard.isKeyDown(61)) {
          this.Qnq = Dne();
        } 
        if (Keyboard.getEventKeyState()) {
          if (Keyboard.getEventKey() == 87) {
            div();
            continue;
          } 
          if (this.Dne != null) {
            this.Dne.div();
          } else {
            if (Keyboard.getEventKey() == 1)
              DyG(); 
            if (Keyboard.getEventKey() == 31 && Keyboard.isKeyDown(61))
              trS(); 
            if (Keyboard.getEventKey() == 20 && Keyboard.isKeyDown(61)) {
              this.Dne.bzF();
              this.Dne.Dne();
            } 
            if (Keyboard.getEventKey() == 33 && Keyboard.isKeyDown(61)) {
              int i = Keyboard.isKeyDown(42) | Keyboard.isKeyDown(54);
              this.Dne.Dne(ONk.DyG, (i != 0) ? -1 : 1);
            } 
            if (Keyboard.getEventKey() == 30 && Keyboard.isKeyDown(61))
              this.Dne.Dne(); 
            if (Keyboard.getEventKey() == 35 && Keyboard.isKeyDown(61)) {
              ((fZI)this.Dne).ooe = !((fZI)this.Dne).ooe;
              this.Dne.FWm();
            } 
            if (Keyboard.getEventKey() == 48 && Keyboard.isKeyDown(61))
              ptH.Dne = (ptH.Dne == null) ? 1 : 0; 
            if (Keyboard.getEventKey() == 25 && Keyboard.isKeyDown(61)) {
              ((fZI)this.Dne).trS = !((fZI)this.Dne).trS;
              this.Dne.FWm();
            } 
            if (Keyboard.getEventKey() == 59)
              ((fZI)this.Dne).ceE = !((fZI)this.Dne).ceE; 
            if (Keyboard.getEventKey() == 61) {
              ((fZI)this.Dne).EyB = !((fZI)this.Dne).EyB;
              ((fZI)this.Dne).FfS = qVZ.bzF();
            } 
            if (Keyboard.getEventKey() == 63) {
              ((fZI)this.Dne).div++;
              if (((fZI)this.Dne).div > 2)
                ((fZI)this.Dne).div = 0; 
            } 
            if (Keyboard.getEventKey() == 66)
              ((fZI)this.Dne).oIf = !((fZI)this.Dne).oIf; 
          } 
          byte b;
          for (b = 0; b < 9; b++) {
            if (Keyboard.getEventKey() == 2 + b)
              ((MOS)((MJs)this.Dne).Dne).Dne = b; 
          } 
          if (((fZI)this.Dne).EyB && ((fZI)this.Dne).FfS) {
            if (Keyboard.getEventKey() == 11)
              FWm(0); 
            for (b = 0; b < 9; b++) {
              if (Keyboard.getEventKey() == 2 + b)
                FWm(b + 1); 
            } 
          } 
        } 
      } 
      boolean bool = (((fZI)this.Dne).Qnq != 2) ? true : false;
      while (((fZI)this.Dne).zGp.Dne())
        Dne((qVZ)new gTB((FiG)this.Dne)); 
      while (((fZI)this.Dne).DyG.Dne())
        this.Dne.Dne(qVZ.FWm()); 
      while (((fZI)this.Dne).div.Dne() && bool)
        Dne((qVZ)new SlE()); 
      if (this.Dne == null && ((fZI)this.Dne).udO.Dne() && bool)
        Dne((qVZ)new SlE("/")); 
      if (this.Dne.haP()) {
        if (!((fZI)this.Dne).XHL.Dne)
          this.Dne.bzF((FiG)this.Dne); 
        do {
        
        } while (((fZI)this.Dne).mrb.Dne());
        while (((fZI)this.Dne).XHL.Dne());
        while (((fZI)this.Dne).kGO.Dne());
      } else {
        while (((fZI)this.Dne).mrb.Dne())
          bzF(0); 
        while (((fZI)this.Dne).XHL.Dne())
          bzF(1); 
        while (((fZI)this.Dne).kGO.Dne())
          qLR(); 
      } 
      if (((fZI)this.Dne).XHL.Dne && !this.div && !this.Dne.haP())
        bzF(1); 
      Dne(0, (this.Dne == null && ((fZI)this.Dne).mrb.Dne && this.zGp));
    } 
    if (this.Dne != null) {
      if (this.Dne != null) {
        this.mrb++;
        if (this.mrb == 30) {
          this.mrb = false;
          this.Dne.zGp((sMa)this.Dne);
        } 
      } 
      this.Dne.FWm("gameRenderer");
      if (this.bzF == 0)
        this.Dne.Dne(); 
      this.Dne.FWm("levelRenderer");
      if (this.bzF == 0)
        this.Dne.FWm(); 
      this.Dne.FWm("level");
      if (this.bzF == 0) {
        if (((VzZ)this.Dne).Qnq > 0)
          ((VzZ)this.Dne).Qnq--; 
        this.Dne.FWm();
      } 
      if (this.bzF == 0) {
        this.Dne.Dne((((VzZ)this.Dne).aFZ > 0), true);
        try {
          this.Dne.Qnq();
        } catch (Throwable throwable) {
          McM mcM = McM.Dne(throwable, "Exception in world tick");
          if (this.Dne == null) {
            Noo noo = mcM.Dne("Affected level");
            noo.Dne("Problem", "Level is null!");
          } else {
            this.Dne.Dne(mcM);
          } 
          throw new kaJ(mcM);
        } 
      } 
      this.Dne.FWm("animateTick");
      if (this.bzF == 0 && this.Dne != null)
        this.Dne.zGp(geR.FWm(((MJs)this.Dne).div), geR.FWm(((MJs)this.Dne).IjH), geR.FWm(((MJs)this.Dne).mrb)); 
      this.Dne.FWm("particles");
      if (this.bzF == 0)
        this.Dne.Dne(); 
    } else if (this.Dne != null) {
      this.Dne.FWm("pendingConnection");
      this.Dne.FWm();
    } 
    this.Dne.FWm();
    this.Dne = Dne();
  }
  
  public void div() {
    try {
      this.div = !this.div;
      if (this.div) {
        Display.setDisplayMode(Display.getDesktopDisplayMode());
        this.Dne = Display.getDisplayMode().getWidth();
        this.FWm = Display.getDisplayMode().getHeight();
        if (this.Dne <= null)
          this.Dne = true; 
        if (this.FWm <= null)
          this.FWm = true; 
      } else {
        if (this.Dne != null) {
          this.Dne = this.Dne.getWidth();
          this.FWm = this.Dne.getHeight();
        } else {
          this.Dne = this.aFZ;
          this.FWm = this.zGp;
        } 
        if (this.Dne <= null)
          this.Dne = true; 
        if (this.FWm <= null)
          this.FWm = true; 
      } 
      if (this.Dne != null)
        Dne(this.Dne, this.FWm); 
      Display.setFullscreen(this.div);
      Display.setVSyncEnabled(((fZI)this.Dne).kGO);
      Display.update();
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  public boolean Dne(String paramString) {
    return !paramString.startsWith("/") ? false : false;
  }
  
  private void Dne(String paramString) {
    int i = GL11.glGetError();
    if (i != 0) {
      String str = GLU.gluErrorString(i);
      Dne().bzF("########## GL ERROR ##########");
      Dne().bzF("@ " + paramString);
      Dne().bzF(i + ": " + str);
    } 
  }
  
  public static boolean bzF() {
    return (Dne != null && ((fZI)((Minecraft)Dne).Dne).aFZ);
  }
  
  public void bzF() {
    try {
      Dne = (BMa)new byte[0];
      this.Dne.bzF();
    } catch (Throwable throwable) {}
    try {
      System.gc();
      bSp.Dne().FWm();
      this.Dne.Dne().FWm();
    } catch (Throwable throwable) {}
    try {
      System.gc();
      Dne((VzZ)null);
    } catch (Throwable throwable) {}
    System.gc();
  }
  
  public zHD Dne() {
    return (zHD)this.Dne;
  }
  
  public Minecraft(Canvas paramCanvas, FWm paramFWm, int paramInt1, int paramInt2, boolean paramBoolean) {
    this.Dne = false;
    this.Dne = (BMa)new EsO(20.0F);
    this.Dne = (BMa)new evf("client", this);
    this.Dne = null;
    this.FWm = false;
    this.bzF = 0;
    this.Dne = null;
    this.Qnq = 0L;
    this.Qnq = 0L;
    this.Dne = null;
    this.Dne = (BMa)new mKT();
    this.div = false;
    this.aFZ = false;
    this.zGp = false;
    this.Dne = Dne();
    this.mrb = false;
    this.Dne = (BMa)new Bkx();
    this.Qnq = -1L;
    this.DyG = true;
    this.FWm = (FUH)"";
    this.FWm = Dne();
    this.bzF = 0;
    this.bzF = -1L;
    this.Qnq = "root";
    trP.Dne();
    this.zGp = paramInt2;
    this.div = paramBoolean;
    this.FWm = (FUH)paramFWm;
    rXx.Dne = 32767;
    Zpi();
    this.Dne = (BMa)paramCanvas;
    this.Dne = paramInt1;
    this.FWm = paramInt2;
    this.div = paramBoolean;
    Dne = (BMa)this;
    zpX.Dne();
    this.Dne = (BMa)new Tsf(this);
  }
  
  public String FWm() {
    return this.Dne.FWm();
  }
  
  public fzy Dne() {
    return (this.Dne != null) ? (fzy)((MJs)this.Dne).Dne : null;
  }
  
  public void Dne(VzZ paramVzZ, String paramString) {
    this.Dne.Dne();
    if (paramVzZ == null) {
      fzy fzy = Dne();
      if (fzy != null)
        fzy.Dne(); 
      if (this.Dne != null)
        this.Dne.Qnq(); 
      if (this.Dne != null)
        this.Dne.bzF(); 
      this.Dne = null;
    } 
    this.Dne = null;
    this.Dne = null;
    if (this.Dne != null) {
      this.Dne.Dne(paramString);
      this.Dne.Qnq("");
    } 
    if (paramVzZ == null && this.Dne != null) {
      if (this.Dne.Dne())
        this.Dne.Dne(); 
      Dne((etB)null);
      this.XHL = false;
    } 
    this.Dne.Dne((String)null, 0.0F, 0.0F, 0.0F);
    this.Dne.Qnq();
    this.Dne = (BMa)paramVzZ;
    if (paramVzZ != null) {
      if (this.Dne != null)
        this.Dne.Dne(paramVzZ); 
      if (this.Dne != null)
        this.Dne.Dne((Qnq)paramVzZ); 
      if (this.Dne == null) {
        this.Dne = (BMa)this.Dne.Dne((Qnq)paramVzZ);
        this.Dne.FWm((FiG)this.Dne);
      } 
      this.Dne.ATE();
      paramVzZ.FWm((sMa)this.Dne);
      ((MJs)this.Dne).Dne = (uqg)new Vmi((fZI)this.Dne);
      this.Dne.Dne((FiG)this.Dne);
      this.Dne = this.Dne;
    } else {
      this.Dne.Dne();
      this.Dne = null;
    } 
    System.gc();
    this.Dne = 0L;
  }
  
  private void FWm(int paramInt) {
    // Byte code:
    //   0: aload_0
    //   1: getfield Dne : LBkx;
    //   4: aload_0
    //   5: getfield Qnq : Ljava/lang/String;
    //   8: invokevirtual Dne : (Ljava/lang/String;)Ljava/util/List;
    //   11: astore_2
    //   12: aload_2
    //   13: ifnull -> 193
    //   16: aload_2
    //   17: invokeinterface isEmpty : ()Z
    //   22: ifne -> 193
    //   25: aload_2
    //   26: iconst_0
    //   27: invokeinterface remove : (I)Ljava/lang/Object;
    //   32: checkcast Gup
    //   35: astore_3
    //   36: iload_1
    //   37: ifne -> 84
    //   40: aload_3
    //   41: getfield Dne : Ljava/lang/String;
    //   44: invokevirtual length : ()I
    //   47: ifle -> 193
    //   50: aload_0
    //   51: getfield Qnq : Ljava/lang/String;
    //   54: ldc_w '.'
    //   57: invokevirtual lastIndexOf : (Ljava/lang/String;)I
    //   60: istore #4
    //   62: iload #4
    //   64: iflt -> 81
    //   67: aload_0
    //   68: aload_0
    //   69: getfield Qnq : Ljava/lang/String;
    //   72: iconst_0
    //   73: iload #4
    //   75: invokevirtual substring : (II)Ljava/lang/String;
    //   78: putfield Qnq : Ljava/lang/String;
    //   81: goto -> 193
    //   84: iinc #1, -1
    //   87: iload_1
    //   88: aload_2
    //   89: invokeinterface size : ()I
    //   94: if_icmpge -> 193
    //   97: aload_2
    //   98: iload_1
    //   99: invokeinterface get : (I)Ljava/lang/Object;
    //   104: checkcast Gup
    //   107: getfield Dne : Ljava/lang/String;
    //   110: ldc_w 'unspecified'
    //   113: invokevirtual equals : (Ljava/lang/Object;)Z
    //   116: ifne -> 193
    //   119: aload_0
    //   120: getfield Qnq : Ljava/lang/String;
    //   123: invokevirtual length : ()I
    //   126: ifle -> 156
    //   129: aload_0
    //   130: new java/lang/StringBuilder
    //   133: dup
    //   134: invokespecial <init> : ()V
    //   137: aload_0
    //   138: getfield Qnq : Ljava/lang/String;
    //   141: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   144: ldc_w '.'
    //   147: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   150: invokevirtual toString : ()Ljava/lang/String;
    //   153: putfield Qnq : Ljava/lang/String;
    //   156: aload_0
    //   157: new java/lang/StringBuilder
    //   160: dup
    //   161: invokespecial <init> : ()V
    //   164: aload_0
    //   165: getfield Qnq : Ljava/lang/String;
    //   168: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   171: aload_2
    //   172: iload_1
    //   173: invokeinterface get : (I)Ljava/lang/Object;
    //   178: checkcast Gup
    //   181: getfield Dne : Ljava/lang/String;
    //   184: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   187: invokevirtual toString : ()Ljava/lang/String;
    //   190: putfield Qnq : Ljava/lang/String;
    //   193: return
  }
  
  public void DyG() {
    if (this.Dne == null) {
      if (QXI.Dne == null && QXI.Dne == null)
        Dne((qVZ)new bze()); 
      if (DyG() && !this.Dne.c_())
        this.Dne.aFZ(); 
    } 
  }
  
  public static File Dne() {
    if (FWm == null)
      FWm = (FUH)Dne("minecraft"); 
    return (File)FWm;
  }
  
  public void Dne(evf paramevf) {
    paramevf.Dne("fps", Integer.valueOf(DyG));
    paramevf.Dne("texpack_name", this.Dne.Dne().FWm());
    paramevf.Dne("vsync_enabled", Boolean.valueOf(((fZI)this.Dne).kGO));
    paramevf.Dne("display_frequency", Integer.valueOf(Display.getDisplayMode().getFrequency()));
    paramevf.Dne("display_type", this.div ? "fullscreen" : "windowed");
    if (this.Dne != null && this.Dne.Dne() != null)
      paramevf.Dne("snooper_partner", this.Dne.Dne().Dne()); 
  }
  
  public void Dne(String paramString1, String paramString2, mrb parammrb) {
    Dne((VzZ)null);
    System.gc();
    iDE iDE = this.Dne.Dne(paramString1, false);
    xoY xoY = iDE.Dne();
    if (xoY == null && parammrb != null) {
      this.Dne.Dne(trP.FWm, 1);
      xoY = new xoY(parammrb, paramString1);
      iDE.Dne(xoY);
    } 
    if (parammrb == null)
      parammrb = new mrb(xoY); 
    this.Dne.Dne(trP.Dne, 1);
    this.Dne = (BMa)new zHD(this, paramString1, paramString2, parammrb);
    this.Dne.IjH();
    this.XHL = true;
    this.Dne.FWm(KGL.Dne("menu.loadingLevel"));
    while (!this.Dne.ceE()) {
      String str = this.Dne.DyG();
      if (str != null) {
        this.Dne.Qnq(KGL.Dne(str));
      } else {
        this.Dne.Qnq("");
      } 
      try {
        Thread.sleep(200L);
      } catch (InterruptedException interruptedException) {}
    } 
    Dne((qVZ)null);
    try {
      fzy fzy = new fzy(this, (zHD)this.Dne);
      this.Dne = (BMa)fzy.Dne();
    } catch (IOException iOException) {
      bzF(Dne(new McM("Connecting to integrated server", iOException)));
    } 
  }
  
  private void kGO() {
    ((fZI)this.Dne).bzF = Character.MIN_VALUE;
    IJm iJm = new IJm((fZI)this.Dne, this.Dne, this.FWm);
    GL11.glClear(16640);
    GL11.glMatrixMode(5889);
    GL11.glLoadIdentity();
    GL11.glOrtho(0.0D, iJm.Dne(), iJm.FWm(), 0.0D, 1000.0D, 3000.0D);
    GL11.glMatrixMode(5888);
    GL11.glLoadIdentity();
    GL11.glTranslatef(0.0F, 0.0F, -2000.0F);
    GL11.glViewport(0, 0, this.Dne, this.FWm);
    GL11.glClearColor(0.0F, 0.0F, 0.0F, 0.0F);
    GL11.glDisable(2896);
    GL11.glEnable(3553);
    GL11.glDisable(2912);
    WAR wAR = WAR.Dne;
    this.Dne.Dne("/title/mojang.png");
    wAR.Dne();
    wAR.bzF(16777215);
    wAR.Dne(0.0D, this.FWm, 0.0D, 0.0D, 0.0D);
    wAR.Dne(this.Dne, this.FWm, 0.0D, 0.0D, 0.0D);
    wAR.Dne(this.Dne, 0.0D, 0.0D, 0.0D, 0.0D);
    wAR.Dne(0.0D, 0.0D, 0.0D, 0.0D, 0.0D);
    wAR.Dne();
    GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
    wAR.bzF(16777215);
    char c1 = 'Ā';
    char c2 = 'Ā';
    Dne((iJm.Dne() - c1) / 2, (iJm.FWm() - c2) / 2, 0, 0, c1, c2);
    GL11.glDisable(2896);
    GL11.glDisable(2912);
    GL11.glEnable(3008);
    GL11.glAlphaFunc(516, 0.1F);
    Display.swapBuffers();
  }
  
  private void trS() {
    Dne().Dne("FORCING RELOAD!");
    if (this.Dne != null)
      this.Dne.Qnq(); 
    this.Dne = (BMa)new mKT();
    this.Dne.Dne((fZI)this.Dne);
    this.Dne.Dne();
  }
  
  public void bzF(McM paramMcM) {
    this.Dne = true;
    Dne(paramMcM);
  }
  
  public void Dne(int paramInt) {
    this.Dne.Dne();
    this.Dne.Zpi();
    int i = 0;
    if (this.Dne != null) {
      i = ((MJs)this.Dne).aFZ;
      this.Dne.bzF((sMa)this.Dne);
    } 
    this.Dne = null;
    this.Dne = (BMa)this.Dne.Dne((Qnq)this.Dne);
    ((MJs)this.Dne).qLR = paramInt;
    this.Dne = this.Dne;
    this.Dne.ATE();
    this.Dne.FWm((sMa)this.Dne);
    this.Dne.FWm((FiG)this.Dne);
    ((MJs)this.Dne).Dne = (uqg)new Vmi((fZI)this.Dne);
    ((MJs)this.Dne).aFZ = i;
    this.Dne.Dne((FiG)this.Dne);
    if (this.Dne instanceof YcA)
      Dne((qVZ)null); 
  }
  
  private void Dne(long paramLong) {
    if (((Bkx)this.Dne).Dne) {
      List<Gup> list = this.Dne.Dne(this.Qnq);
      Gup gup = list.remove(0);
      GL11.glClear(256);
      GL11.glMatrixMode(5889);
      GL11.glEnable(2903);
      GL11.glLoadIdentity();
      GL11.glOrtho(0.0D, this.Dne, this.FWm, 0.0D, 1000.0D, 3000.0D);
      GL11.glMatrixMode(5888);
      GL11.glLoadIdentity();
      GL11.glTranslatef(0.0F, 0.0F, -2000.0F);
      GL11.glLineWidth(1.0F);
      GL11.glDisable(3553);
      WAR wAR = WAR.Dne;
      char c = ' ';
      int i = this.Dne - c - 10;
      int j = this.FWm - c * 2;
      GL11.glEnable(3042);
      wAR.Dne();
      wAR.Dne(0, 200);
      wAR.Dne((i - c * 1.1F), (j - c * 0.6F - 16.0F), 0.0D);
      wAR.Dne((i - c * 1.1F), (j + c * 2), 0.0D);
      wAR.Dne((i + c * 1.1F), (j + c * 2), 0.0D);
      wAR.Dne((i + c * 1.1F), (j - c * 0.6F - 16.0F), 0.0D);
      wAR.Dne();
      GL11.glDisable(3042);
      double d = 0.0D;
      for (byte b1 = 0; b1 < list.size(); b1++) {
        Gup gup1 = list.get(b1);
        int m = geR.FWm(gup1.Dne / 4.0D) + 1;
        wAR.Dne(6);
        wAR.bzF(gup1.Dne());
        wAR.Dne(i, j, 0.0D);
        int n;
        for (n = m; n >= 0; n--) {
          float f1 = (float)((d + gup1.Dne * n / m) * Math.PI * 2.0D / 100.0D);
          float f2 = geR.Dne(f1) * c;
          float f3 = geR.FWm(f1) * c * 0.5F;
          wAR.Dne((i + f2), (j - f3), 0.0D);
        } 
        wAR.Dne();
        wAR.Dne(5);
        wAR.bzF((gup1.Dne() & 0xFEFEFE) >> 1);
        for (n = m; n >= 0; n--) {
          float f1 = (float)((d + gup1.Dne * n / m) * Math.PI * 2.0D / 100.0D);
          float f2 = geR.Dne(f1) * c;
          float f3 = geR.FWm(f1) * c * 0.5F;
          wAR.Dne((i + f2), (j - f3), 0.0D);
          wAR.Dne((i + f2), (j - f3 + 10.0F), 0.0D);
        } 
        wAR.Dne();
        d += gup1.Dne;
      } 
      DecimalFormat decimalFormat = new DecimalFormat("##0.00");
      GL11.glEnable(3553);
      String str = "";
      if (!gup.Dne.equals("unspecified"))
        str = str + "[0] "; 
      if (gup.Dne.length() == 0) {
        str = str + "ROOT ";
      } else {
        str = str + gup.Dne + " ";
      } 
      int k = 16777215;
      this.Dne.Dne(str, i - c, j - c / 2 - 16, k);
      this.Dne.Dne(str = decimalFormat.format(gup.FWm) + "%", i + c - this.Dne.Dne(str), j - c / 2 - 16, k);
      for (byte b2 = 0; b2 < list.size(); b2++) {
        Gup gup1 = list.get(b2);
        String str1 = "";
        if (gup1.Dne.equals("unspecified")) {
          str1 = str1 + "[?] ";
        } else {
          str1 = str1 + "[" + (b2 + 1) + "] ";
        } 
        str1 = str1 + gup1.Dne;
        this.Dne.Dne(str1, i - c, j + c / 2 + b2 * 8 + 20, gup1.Dne());
        this.Dne.Dne(str1 = decimalFormat.format(gup1.Dne) + "%", i + c - 50 - this.Dne.Dne(str1), j + c / 2 + b2 * 8 + 20, gup1.Dne());
        this.Dne.Dne(str1 = decimalFormat.format(gup1.FWm) + "%", i + c - this.Dne.Dne(str1), j + c / 2 + b2 * 8 + 20, gup1.Dne());
      } 
    } 
  }
  
  private void Zpi() {
    tAS tAS = new tAS(this, "Timer hack thread");
    tAS.setDaemon(true);
    tAS.start();
  }
  
  private void bzF(int paramInt) {
    if (paramInt != 0 || this.Qnq <= 0L) {
      if (paramInt == 0)
        this.Dne.bzF(); 
      if (paramInt == 1)
        this.div = true; 
      boolean bool = true;
      NMq nMq = ((MJs)this.Dne).Dne.Dne();
      if (this.Dne == null) {
        if (paramInt == 0 && this.Dne.Qnq())
          this.Qnq = 10L; 
      } else if (((wHH)this.Dne).Dne == gks.FWm) {
        if (paramInt == 0)
          this.Dne.Dne((FiG)this.Dne, (sMa)((wHH)this.Dne).Dne); 
        if (paramInt == 1 && this.Dne.Dne((FiG)this.Dne, (sMa)((wHH)this.Dne).Dne))
          bool = false; 
      } else if (((wHH)this.Dne).Dne == gks.Dne) {
        gks gks = ((wHH)this.Dne).Dne;
        int i = ((wHH)this.Dne).FWm;
        int j = ((wHH)this.Dne).bzF;
        int k = ((wHH)this.Dne).Qnq;
        if (paramInt == 0) {
          this.Dne.Dne(gks, i, j, ((wHH)this.Dne).Qnq);
        } else {
          boolean bool1 = (nMq != null) ? nMq.Dne : false;
          if (this.Dne.Dne((FiG)this.Dne, (Qnq)this.Dne, nMq, gks, i, j, k, (chN)((wHH)this.Dne).Dne)) {
            bool = false;
            this.Dne.bzF();
          } 
          if (nMq == null)
            return; 
          if (nMq.Dne == 0) {
            ((MOS)((MJs)this.Dne).Dne).Dne[((MOS)((MJs)this.Dne).Dne).Dne] = null;
          } else if (nMq.Dne != bool1 || this.Dne.aFZ()) {
            ((OEA)this.Dne).Dne.FWm();
          } 
        } 
      } 
      if (bool && paramInt == 1) {
        NMq nMq1 = ((MJs)this.Dne).Dne.Dne();
        if (nMq1 != null && this.Dne.Dne((FiG)this.Dne, (Qnq)this.Dne, nMq1))
          ((OEA)this.Dne).Dne.bzF(); 
      } 
    } 
  }
  
  public YiY Dne() {
    return (YiY)this.Dne;
  }
  
  public static File Dne(String paramString) {
    File file;
    String str2;
    String str1 = System.getProperty("user.home", ".");
    switch (Ext.Dne[Dne().ordinal()]) {
      case 1:
      case 2:
        file = new File(str1, '.' + paramString + '/');
        break;
      case 3:
        str2 = System.getenv("APPDATA");
        if (str2 != null) {
          file = new File(str2, "." + paramString + '/');
          break;
        } 
        file = new File(str1, '.' + paramString + '/');
        break;
      case 4:
        file = new File(str1, "Library/Application Support/" + paramString);
        break;
      default:
        file = new File(str1, paramString + '/');
        break;
    } 
    if (!file.exists() && !file.mkdirs())
      throw new RuntimeException("The working directory could not be created: " + file); 
    return file;
  }
  
  void Dne(boolean paramBoolean) {
    this.mrb = paramBoolean;
  }
  
  public String Dne() {
    return this.Dne.Dne();
  }
  
  private int FWm() {
    return (this.Dne != null && this.Dne instanceof MKS) ? 2 : ((fZI)this.Dne).FWm;
  }
  
  private void udO() {
    if (this.FWm != null && !this.FWm.isActive()) {
      this.DyG = false;
    } else {
      bSp.Dne().Dne();
      if (this.Dne != null)
        this.Dne.Dne().Dne(); 
      this.Dne.Dne("root");
      if (this.Dne == null && Display.isCloseRequested())
        Qnq(); 
      if (this.bzF != 0 && this.Dne != null) {
        float f = ((EsO)this.Dne).FWm;
        this.Dne.Dne();
        ((EsO)this.Dne).FWm = f;
      } else {
        this.Dne.Dne();
      } 
      long l1 = System.nanoTime();
      this.Dne.Dne("tick");
      for (byte b = 0; b < ((EsO)this.Dne).Dne; b++)
        IjH(); 
      this.Dne.FWm("preRenderErrors");
      long l2 = System.nanoTime() - l1;
      Dne("Pre render");
      zVu.Dne = ((fZI)this.Dne).aFZ;
      this.Dne.FWm("sound");
      this.Dne.Dne((FUH)this.Dne, ((EsO)this.Dne).FWm);
      if (this.bzF == 0)
        this.Dne.DyG(); 
      this.Dne.FWm();
      this.Dne.Dne("render");
      this.Dne.Dne("display");
      GL11.glEnable(3553);
      if (!Keyboard.isKeyDown(65))
        Display.update(); 
      if (this.Dne != null && this.Dne.ooe())
        ((fZI)this.Dne).div = 0; 
      this.Dne.FWm();
      if (this.Qnq == 0L) {
        this.Dne.FWm("gameRenderer");
        this.Dne.FWm(((EsO)this.Dne).FWm);
        this.Dne.FWm();
      } 
      GL11.glFlush();
      this.Dne.FWm();
      if (!Display.isActive() && this.div)
        div(); 
      if (((fZI)this.Dne).EyB && ((fZI)this.Dne).FfS) {
        if (!((Bkx)this.Dne).Dne)
          this.Dne.Dne(); 
        ((Bkx)this.Dne).Dne = true;
        Dne(l2);
      } else {
        ((Bkx)this.Dne).Dne = false;
        this.bzF = System.nanoTime();
      } 
      this.Dne.Dne();
      this.Dne.Dne("root");
      Thread.yield();
      if (Keyboard.isKeyDown(65))
        Display.update(); 
      ooe();
      if (this.Dne != null && !this.div && (this.Dne.getWidth() != this.Dne || this.Dne.getHeight() != this.FWm)) {
        this.Dne = this.Dne.getWidth();
        this.FWm = this.Dne.getHeight();
        if (this.Dne <= null)
          this.Dne = true; 
        if (this.FWm <= null)
          this.FWm = true; 
        Dne(this.Dne, this.FWm);
      } 
      Dne("Post render");
      int i = ++this.bzF;
      this.bzF = (DyG() && this.Dne != null && this.Dne.Dne() && !this.Dne.c_()) ? 1 : 0;
      if (zGp() && this.Dne != null && ((MJs)this.Dne).Dne != null && this.bzF != i)
        ((bqd)((MJs)this.Dne).Dne.Dne()).Dne(this.bzF); 
      while (Dne() >= this.FWm + 1000L) {
        DyG = this.bzF;
        this.FWm = (FUH)(DyG + " fps, " + snt.Dne + " chunk updates");
        snt.Dne = 0;
        this.FWm += 1000L;
        this.bzF = 0;
        this.Dne.FWm();
        if (!this.Dne.Dne())
          this.Dne.Dne(); 
      } 
      this.Dne.FWm();
      if (FWm() > 0)
        Display.sync(OEA.Dne(FWm())); 
    } 
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\net\minecraft\client\Minecraft.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */