public enum ONk {
  Fnk,
  Qnq,
  Dne("options.music", true, false),
  ceE("options.music", true, false),
  yMz("options.music", true, false),
  zGp("options.music", true, false),
  IjH("options.music", true, false),
  tgc("options.music", true, false),
  XHL("options.music", true, false),
  vSL("options.music", true, false),
  qXo("options.music", true, false),
  qLR("options.music", true, false),
  EyB("options.music", true, false),
  udO("options.music", true, false),
  ooe("options.music", true, false),
  bzF("options.music", true, false),
  oIf("options.music", true, false),
  ATE("options.music", true, false),
  div("options.music", true, false),
  OdI("options.music", true, false),
  mrb("options.music", true, false),
  FWm("options.sound", true, false),
  aFZ("options.sound", true, false),
  RPx("options.sound", true, false),
  DyG("options.sound", true, false),
  AgF("options.sound", true, false),
  Vxn("options.sound", true, false),
  gnI("options.sound", true, false),
  Zpi("options.sound", true, false),
  kGO("options.sound", true, false),
  trS("options.sound", true, false),
  FfS("options.sound", true, false);
  
  private final String Dne;
  
  private final boolean Dne;
  
  private final boolean FWm;
  
  public boolean FWm() {
    return this.FWm;
  }
  
  public int Dne() {
    return ordinal();
  }
  
  public boolean Dne() {
    return this.Dne;
  }
  
  ONk(String paramString1, boolean paramBoolean1, boolean paramBoolean2) {
    this.Dne = (ONk[])paramString1;
    this.Dne = paramBoolean1;
    this.FWm = paramBoolean2;
  }
  
  static {
    bzF = new ONk("INVERT_MOUSE", 2, "options.invertMouse", false, true);
    Qnq = new ONk("SENSITIVITY", 3, "options.sensitivity", true, false);
    aFZ = new ONk("FOV", 4, "options.fov", true, false);
    zGp = new ONk("GAMMA", 5, "options.gamma", true, false);
    DyG = new ONk("RENDER_DISTANCE", 6, "options.renderDistance", false, false);
    div = new ONk("VIEW_BOBBING", 7, "options.viewBobbing", false, true);
    IjH = new ONk("ANAGLYPH", 8, "options.anaglyph", false, true);
    mrb = new ONk("ADVANCED_OPENGL", 9, "options.advancedOpengl", false, true);
    XHL = new ONk("FRAMERATE_LIMIT", 10, "options.framerateLimit", false, false);
    Zpi = new ONk("DIFFICULTY", 11, "options.difficulty", false, false);
    kGO = new ONk("GRAPHICS", 12, "options.graphics", false, false);
    udO = new ONk("AMBIENT_OCCLUSION", 13, "options.ao", false, false);
    ooe = new ONk("GUI_SCALE", 14, "options.guiScale", false, false);
    trS = new ONk("RENDER_CLOUDS", 15, "options.renderClouds", false, true);
    qLR = new ONk("PARTICLES", 16, "options.particles", false, false);
    ATE = new ONk("CHAT_VISIBILITY", 17, "options.chat.visibility", false, false);
    Vxn = new ONk("CHAT_COLOR", 18, "options.chat.color", false, true);
    ceE = new ONk("CHAT_LINKS", 19, "options.chat.links", false, true);
    EyB = new ONk("CHAT_OPACITY", 20, "options.chat.opacity", true, false);
    FfS = new ONk("CHAT_LINKS_PROMPT", 21, "options.chat.links.prompt", false, true);
    OdI = new ONk("USE_SERVER_TEXTURES", 22, "options.serverTextures", false, true);
    oIf = new ONk("SNOOPER_ENABLED", 23, "options.snooper", false, true);
    vSL = new ONk("USE_FULLSCREEN", 24, "options.fullscreen", false, true);
    RPx = new ONk("ENABLE_VSYNC", 25, "options.vsync", false, true);
    Fnk = new ONk("SHOW_CAPE", 26, "options.showCape", false, true);
    gnI = new ONk("TOUCHSCREEN", 27, "options.touchscreen", false, true);
    tgc = new ONk("CHAT_SCALE", 28, "options.chat.scale", true, false);
    qXo = new ONk("CHAT_WIDTH", 29, "options.chat.width", true, false);
    AgF = new ONk("CHAT_HEIGHT_FOCUSED", 30, "options.chat.height.focused", true, false);
    yMz = new ONk("CHAT_HEIGHT_UNFOCUSED", 31, "options.chat.height.unfocused", true, false);
    Dne = new ONk[] { 
        (ONk)Dne, FWm, bzF, Qnq, aFZ, zGp, DyG, div, IjH, mrb, 
        XHL, Zpi, kGO, udO, ooe, trS, qLR, ATE, Vxn, ceE, 
        EyB, FfS, OdI, oIf, vSL, RPx, Fnk, gnI, tgc, qXo, 
        AgF, yMz };
  }
  
  public String Dne() {
    return (String)this.Dne;
  }
  
  public static ONk Dne(int paramInt) {
    for (ONk oNk : values()) {
      if (oNk.Dne() == paramInt)
        return oNk; 
    } 
    return null;
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\ONk.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */