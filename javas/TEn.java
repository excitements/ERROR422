import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import org.lwjgl.input.Keyboard;

public class TEn extends qVZ {
  private LOM Dne;
  
  private final hcj Dne;
  
  private mHN Dne;
  
  private String Dne;
  
  private Pee Dne;
  
  private static eKj Dne = new eKj();
  
  private String FWm;
  
  private String bzF;
  
  private static final List FWm = new ArrayList();
  
  public void FWm() {
    Keyboard.enableRepeatEvents(false);
  }
  
  protected void Dne(int paramInt1, int paramInt2, int paramInt3) {
    this.Dne.Dne(paramInt1, paramInt2, paramInt3);
    super.Dne(paramInt1, paramInt2, paramInt3);
  }
  
  public void Dne(int paramInt1, int paramInt2, float paramFloat) {
    aFZ();
    this.Dne.Dne(paramInt1, paramInt2, paramFloat);
    Dne((msA)this.Dne, (String)this.Dne, this.FWm / 2, 8, 16777215);
    FWm((msA)this.Dne, (String)this.FWm, 50, 30, 10526880);
    FWm((msA)this.Dne, this.bzF, 50, 70, 10526880);
    this.Dne.Qnq();
    super.Dne(paramInt1, paramInt2, paramFloat);
  }
  
  public void bzF() {
    this.Dne.Dne();
    super.bzF();
  }
  
  public void Dne() {
    this.Dne.clear();
    Keyboard.enableRepeatEvents(true);
    this.Dne = (eKj)KGL.Dne("createWorld.customize.presets.title");
    this.FWm = (List)KGL.Dne("createWorld.customize.presets.share");
    this.bzF = KGL.Dne("createWorld.customize.presets.list");
    this.Dne = (eKj)new mHN((msA)this.Dne, 50, 40, this.FWm - 100, 20);
    this.Dne = (eKj)new LOM(this);
    this.Dne.aFZ(1230);
    this.Dne.Dne(this.Dne.Dne());
    this.Dne.add(this.Dne = (eKj)new Pee(0, this.FWm / 2 - 155, this.bzF - 28, 150, 20, KGL.Dne("createWorld.customize.presets.select")));
    this.Dne.add(new Pee(1, this.FWm / 2 + 5, this.bzF - 28, 150, 20, KGL.Dne("gui.cancel")));
    zGp();
  }
  
  protected void Dne(char paramChar, int paramInt) {
    if (!this.Dne.Dne(paramChar, paramInt))
      super.Dne(paramChar, paramInt); 
  }
  
  static mHN Dne(TEn paramTEn) {
    return (mHN)paramTEn.Dne;
  }
  
  private static void Dne(String paramString, int paramInt, OdI paramOdI, Jjb... paramVarArgs) {
    Dne(paramString, paramInt, paramOdI, (List)null, paramVarArgs);
  }
  
  public TEn(hcj paramhcj) {
    this.Dne = (eKj)paramhcj;
  }
  
  static LOM Dne(TEn paramTEn) {
    return (LOM)paramTEn.Dne;
  }
  
  static eKj Dne() {
    return Dne;
  }
  
  private static void Dne(String paramString, int paramInt, OdI paramOdI, List paramList, Jjb... paramVarArgs) {
    lDk lDk = new lDk();
    for (int i = paramVarArgs.length - 1; i >= 0; i--)
      lDk.Dne().add(paramVarArgs[i]); 
    lDk.Dne(paramOdI.Qnq);
    lDk.Dne();
    if (paramList != null)
      for (String str : paramList)
        lDk.Dne().put(str, new HashMap<>());  
    FWm.add(new hZu(paramInt, paramString, lDk.toString()));
  }
  
  public void zGp() {
    boolean bool = Qnq();
    ((Pee)this.Dne).Dne = bool;
  }
  
  protected void Dne(Pee paramPee) {
    if (paramPee.aFZ == 0 && Qnq()) {
      this.Dne.Dne(this.Dne.Dne());
      this.Dne.Dne((qVZ)this.Dne);
    } else if (paramPee.aFZ == 1) {
      this.Dne.Dne((qVZ)this.Dne);
    } 
  }
  
  private boolean Qnq() {
    return ((((LOM)this.Dne).Dne > -1 && ((LOM)this.Dne).Dne < FWm.size()) || this.Dne.Dne().length() > 1);
  }
  
  static List Dne() {
    return FWm;
  }
  
  static {
    Dne("Classic Flat", ((ZQN)zKP.Dne).FWm, OdI.FWm, Arrays.asList(new String[] { "village" }, ), new Jjb[] { new Jjb(1, ((ZQN)zKP.Dne).FWm), new Jjb(2, zKP.FWm.FWm), new Jjb(1, zKP.zGp.FWm) });
    Dne("Tunnelers' Dream", zKP.Dne.FWm, OdI.Qnq, Arrays.asList(new String[] { "biome_1", "dungeon", "decoration", "stronghold", "mineshaft" }, ), new Jjb[] { new Jjb(1, ((ZQN)zKP.Dne).FWm), new Jjb(5, zKP.FWm.FWm), new Jjb(230, zKP.Dne.FWm), new Jjb(1, zKP.zGp.FWm) });
    Dne("Water World", ((byt)zKP.Dne).FWm, OdI.FWm, Arrays.asList(new String[] { "village", "biome_1" }, ), new Jjb[] { new Jjb(90, ((zKP)zKP.DyG).FWm), new Jjb(5, ((zKP)zKP.IjH).FWm), new Jjb(5, zKP.FWm.FWm), new Jjb(5, zKP.Dne.FWm), new Jjb(1, zKP.zGp.FWm) });
    Dne("Overworld", ((Tte)zKP.Dne).FWm, OdI.FWm, Arrays.asList(new String[] { "village", "biome_1", "decoration", "stronghold", "mineshaft", "dungeon", "lake", "lava_lake" }, ), new Jjb[] { new Jjb(1, ((ZQN)zKP.Dne).FWm), new Jjb(3, zKP.FWm.FWm), new Jjb(59, zKP.Dne.FWm), new Jjb(1, zKP.zGp.FWm) });
    Dne("Snowy Kingdom", zKP.EwP.FWm, OdI.kGO, Arrays.asList(new String[] { "village", "biome_1" }, ), new Jjb[] { new Jjb(1, zKP.EwP.FWm), new Jjb(1, ((ZQN)zKP.Dne).FWm), new Jjb(3, zKP.FWm.FWm), new Jjb(59, zKP.Dne.FWm), new Jjb(1, zKP.zGp.FWm) });
    Dne("Bottomless Pit", dEr.yMz.Qnq, OdI.FWm, Arrays.asList(new String[] { "village", "biome_1" }, ), new Jjb[] { new Jjb(1, ((ZQN)zKP.Dne).FWm), new Jjb(3, zKP.FWm.FWm), new Jjb(2, zKP.bzF.FWm) });
    Dne("Desert", ((zKP)zKP.IjH).FWm, OdI.bzF, Arrays.asList(new String[] { "village", "biome_1", "decoration", "stronghold", "mineshaft", "dungeon" }, ), new Jjb[] { new Jjb(8, ((zKP)zKP.IjH).FWm), new Jjb(52, zKP.ceE.FWm), new Jjb(3, zKP.Dne.FWm), new Jjb(1, zKP.zGp.FWm) });
    Dne("Redstone Ready", dEr.exS.Qnq, OdI.bzF, new Jjb[] { new Jjb(52, zKP.ceE.FWm), new Jjb(3, zKP.Dne.FWm), new Jjb(1, zKP.zGp.FWm) });
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\TEn.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */