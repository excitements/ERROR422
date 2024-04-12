import java.util.List;

public class oGG extends dEr {
  private gDn FWm;
  
  public static oNe Dne(NMq paramNMq, String paramString) {
    if (paramNMq.aFZ()) {
      WkD wkD = paramNMq.Dne().Dne("Explosion");
      if (wkD != null)
        return wkD.Dne(paramString); 
    } 
    return null;
  }
  
  public void Dne(NMq paramNMq, FiG paramFiG, List paramList, boolean paramBoolean) {
    if (paramNMq.aFZ()) {
      WkD wkD = paramNMq.Dne().Dne("Explosion");
      if (wkD != null)
        Dne(wkD, paramList); 
    } 
  }
  
  public gDn Dne(int paramInt1, int paramInt2) {
    return (paramInt2 > 0) ? this.FWm : super.Dne(paramInt1, paramInt2);
  }
  
  public int Dne(NMq paramNMq, int paramInt) {
    if (paramInt != 1)
      return super.Dne(paramNMq, paramInt); 
    oNe oNe = Dne(paramNMq, "Colors");
    if (oNe == null)
      return 9079434; 
    xuY xuY = (xuY)oNe;
    if (xuY.Dne.length == 1)
      return xuY.Dne[0]; 
    int i = 0;
    int j = 0;
    int k = 0;
    for (int m : xuY.Dne) {
      i += (m & 0xFF0000) >> 16;
      j += (m & 0xFF00) >> 8;
      k += (m & 0xFF) >> 0;
    } 
    i /= xuY.Dne.length;
    j /= xuY.Dne.length;
    k /= xuY.Dne.length;
    return i << 16 | j << 8 | k;
  }
  
  public oGG(int paramInt) {
    super(paramInt);
  }
  
  public void Dne(Rbp paramRbp) {
    super.Dne(paramRbp);
    this.FWm = paramRbp.Dne("fireworksCharge_overlay");
  }
  
  public boolean Dne() {
    return true;
  }
  
  public static void Dne(WkD paramWkD, List<String> paramList) {
    byte b = paramWkD.Dne("Type");
    if (b >= 0 && b <= 4) {
      paramList.add(KGL.Dne("item.fireworksCharge.type." + b).trim());
    } else {
      paramList.add(KGL.Dne("item.fireworksCharge.type").trim());
    } 
    int[] arrayOfInt1 = paramWkD.Dne("Colors");
    if (arrayOfInt1.length > 0) {
      boolean bool = true;
      String str = "";
      int[] arrayOfInt = arrayOfInt1;
      int i = arrayOfInt1.length;
      for (byte b1 = 0; b1 < i; b1++) {
        int j = arrayOfInt[b1];
        if (!bool)
          str = str + ", "; 
        bool = false;
        boolean bool3 = false;
        for (byte b2 = 0; b2 < 16; b2++) {
          if (j == AvN.Dne[b2]) {
            bool3 = true;
            str = str + KGL.Dne("item.fireworksCharge." + AvN.Dne[b2]);
            break;
          } 
        } 
        if (!bool3)
          str = str + KGL.Dne("item.fireworksCharge.customColor"); 
      } 
      paramList.add(str);
    } 
    int[] arrayOfInt2 = paramWkD.Dne("FadeColors");
    if (arrayOfInt2.length > 0) {
      boolean bool = true;
      String str = KGL.Dne("item.fireworksCharge.fadeTo") + " ";
      int[] arrayOfInt = arrayOfInt2;
      int i = arrayOfInt2.length;
      for (byte b1 = 0; b1 < i; b1++) {
        int j = arrayOfInt[b1];
        if (!bool)
          str = str + ", "; 
        bool = false;
        boolean bool3 = false;
        for (byte b2 = 0; b2 < 16; b2++) {
          if (j == AvN.Dne[b2]) {
            bool3 = true;
            str = str + KGL.Dne("item.fireworksCharge." + AvN.Dne[b2]);
            break;
          } 
        } 
        if (!bool3)
          str = str + KGL.Dne("item.fireworksCharge.customColor"); 
      } 
      paramList.add(str);
    } 
    boolean bool1 = paramWkD.FWm("Trail");
    if (bool1)
      paramList.add(KGL.Dne("item.fireworksCharge.trail")); 
    boolean bool2 = paramWkD.FWm("Flicker");
    if (bool2)
      paramList.add(KGL.Dne("item.fireworksCharge.flicker")); 
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\oGG.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */