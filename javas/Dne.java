import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

public enum Dne {
  bzF,
  FfS,
  ceE,
  Dne('0'),
  trS('0'),
  qLR('0'),
  div('0'),
  XHL('0'),
  EyB('0'),
  udO('0'),
  Qnq('0'),
  ATE('0'),
  Zpi('0'),
  aFZ('0'),
  ooe('0'),
  IjH('0'),
  kGO('0'),
  FWm('1'),
  Vxn('1'),
  DyG('1'),
  mrb('1'),
  zGp('1');
  
  private final boolean Dne;
  
  private final char Dne;
  
  private static final Map FWm;
  
  private final String Dne;
  
  private static final Map Dne;
  
  private static final Pattern Dne;
  
  public static Dne Dne(String paramString) {
    return (paramString == null) ? null : (Dne)FWm.get(paramString.toLowerCase());
  }
  
  public String Dne() {
    return name().toLowerCase();
  }
  
  public static Collection Dne(boolean paramBoolean1, boolean paramBoolean2) {
    ArrayList<String> arrayList = new ArrayList();
    for (Dne dne : values()) {
      if ((!dne.FWm() || paramBoolean1) && (!dne.Dne() || paramBoolean2))
        arrayList.add(dne.Dne()); 
    } 
    return arrayList;
  }
  
  Dne(char paramChar, boolean paramBoolean) {
    this.Dne = paramChar;
    this.Dne = paramBoolean;
    this.Dne = (Pattern)("§" + paramChar);
  }
  
  static {
    bzF = new Dne("DARK_GREEN", 2, '2');
    Qnq = new Dne("DARK_AQUA", 3, '3');
    aFZ = new Dne("DARK_RED", 4, '4');
    zGp = new Dne("DARK_PURPLE", 5, '5');
    DyG = new Dne("GOLD", 6, '6');
    div = new Dne("GRAY", 7, '7');
    IjH = new Dne("DARK_GRAY", 8, '8');
    mrb = new Dne("BLUE", 9, '9');
    XHL = new Dne("GREEN", 10, 'a');
    Zpi = new Dne("AQUA", 11, 'b');
    kGO = new Dne("RED", 12, 'c');
    udO = new Dne("LIGHT_PURPLE", 13, 'd');
    ooe = new Dne("YELLOW", 14, 'e');
    trS = new Dne("WHITE", 15, 'f');
    qLR = new Dne("OBFUSCATED", 16, 'k', true);
    ATE = new Dne("BOLD", 17, 'l', true);
    Vxn = new Dne("STRIKETHROUGH", 18, 'm', true);
    ceE = new Dne("UNDERLINE", 19, 'n', true);
    EyB = new Dne("ITALIC", 20, 'o', true);
    FfS = new Dne("RESET", 21, 'r');
    Dne = (Pattern)new Dne[] { 
        (Dne)Dne, FWm, bzF, Qnq, aFZ, zGp, DyG, div, IjH, mrb, 
        XHL, Zpi, kGO, udO, ooe, trS, qLR, ATE, Vxn, ceE, 
        EyB, FfS };
    Dne = (Pattern)new HashMap<>();
    FWm = (Dne)new HashMap<>();
    Dne = Pattern.compile("(?i)" + String.valueOf('§') + "[0-9A-FK-OR]");
    for (Dne dne : values()) {
      Dne.put(Character.valueOf(dne.Dne()), dne);
      FWm.put(dne.Dne(), dne);
    } 
  }
  
  public String toString() {
    return (String)this.Dne;
  }
  
  public boolean FWm() {
    return (this.Dne == null && this != FfS);
  }
  
  public char Dne() {
    return this.Dne;
  }
  
  public boolean Dne() {
    return this.Dne;
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\Dne.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */