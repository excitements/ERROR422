import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;

public class mNp {
  private static oCt Dne = oCt.Dne();
  
  private final String Dne;
  
  private final String FWm;
  
  private static String bzF = "https://mcoapi.minecraft.net/";
  
  public mNp(vwN paramvwN) {
    this.Dne = paramvwN.FWm;
    this.FWm = paramvwN.Dne;
  }
  
  private String Dne(String paramString) {
    return URLEncoder.encode(paramString, "UTF-8");
  }
  
  private String Dne(EKF paramEKF) {
    paramEKF.Dne("sid", this.Dne);
    paramEKF.Dne("user", this.FWm);
    if (Dne instanceof nXq) {
      Lur lur = (Lur)Dne.Dne();
      paramEKF.Dne((String)lur.Dne(), (String)lur.FWm());
    } 
    try {
      int i = paramEKF.Dne();
      if (i == 503)
        throw new Ybw(10); 
      if (i >= 200 && i < 300) {
        oCt oCt1 = paramEKF.Dne();
        if (oCt1 instanceof nXq)
          Dne = (String)oCt1; 
        return paramEKF.Dne();
      } 
      throw new lUu(paramEKF.Dne(), paramEKF.Dne());
    } catch (HFd hFd) {
      throw new lUu(500, "Server not available!");
    } 
  }
  
  public Boolean Dne(long paramLong) {
    String str1 = bzF + "worlds" + "/$WORLD_ID/open".replace("$WORLD_ID", String.valueOf(paramLong));
    String str2 = Dne(EKF.FWm(str1, ""));
    return Boolean.valueOf(str2);
  }
  
  public Boolean FWm(long paramLong) {
    String str1 = bzF + "worlds" + "/$WORLD_ID/close".replace("$WORLD_ID", String.valueOf(paramLong));
    String str2 = Dne(EKF.FWm(str1, ""));
    return Boolean.valueOf(str2);
  }
  
  public void Dne(long paramLong, String paramString) {
    String str = bzF + "worlds" + "/$WORLD_ID/invites/$USER_NAME".replace("$WORLD_ID", String.valueOf(paramLong)).replace("$USER_NAME", paramString);
    Dne(EKF.FWm(str));
  }
  
  public ksB Dne() {
    String str = Dne(EKF.Dne(bzF + "worlds"));
    return ksB.Dne(str);
  }
  
  public muh Dne(long paramLong, String paramString) {
    String str1 = bzF + "worlds" + "/$WORLD_ID/invites/$USER_NAME".replace("$WORLD_ID", String.valueOf(paramLong)).replace("$USER_NAME", paramString);
    String str2 = Dne(EKF.Dne(str1, ""));
    return muh.Dne(str2);
  }
  
  public HMg Dne(long paramLong) {
    String str1 = bzF + "worlds" + "/$ID/join".replace("$ID", "" + paramLong);
    String str2 = Dne(EKF.Dne(str1));
    return HMg.Dne(str2);
  }
  
  public Boolean Dne(long paramLong, String paramString) {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(bzF).append("worlds").append("/$WORLD_ID/reset".replace("$WORLD_ID", String.valueOf(paramLong)));
    if (paramString != null && paramString.length() > 0)
      stringBuilder.append("?seed=").append(Dne(paramString)); 
    String str = Dne(EKF.FWm(stringBuilder.toString(), "", 30000, 80000));
    return Boolean.valueOf(str);
  }
  
  public YGW Dne(long paramLong) {
    String str = Dne(EKF.Dne(bzF + "subscriptions" + "/$WORLD_ID".replace("$WORLD_ID", String.valueOf(paramLong))));
    return YGW.Dne(str);
  }
  
  public muh Dne(long paramLong) {
    String str = Dne(EKF.Dne(bzF + "worlds" + "/$ID".replace("$ID", String.valueOf(paramLong))));
    return muh.Dne(str);
  }
  
  public void Dne(String paramString1, String paramString2, String paramString3, String paramString4) {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(bzF).append("worlds").append("/$NAME/$LOCATION_ID".replace("$NAME", Dne(paramString1)).replace("$LOCATION_ID", paramString3));
    HashMap<Object, Object> hashMap = new HashMap<>();
    if (paramString2 != null && !paramString2.trim().equals(""))
      hashMap.put("motd", paramString2); 
    if (paramString4 != null && !paramString4.equals(""))
      hashMap.put("seed", paramString4); 
    if (!hashMap.isEmpty()) {
      boolean bool = true;
      for (Map.Entry<Object, Object> entry : hashMap.entrySet()) {
        if (bool) {
          stringBuilder.append("?");
          bool = false;
        } else {
          stringBuilder.append("&");
        } 
        stringBuilder.append((String)entry.getKey()).append("=").append(Dne((String)entry.getValue()));
      } 
    } 
    Dne(EKF.Dne(stringBuilder.toString(), "", 5000, 30000));
  }
  
  public void Dne(long paramLong, String paramString1, String paramString2, int paramInt1, int paramInt2) {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(bzF).append("worlds").append("/$WORLD_ID/$NAME".replace("$WORLD_ID", String.valueOf(paramLong)).replace("$NAME", Dne(paramString1)));
    if (paramString2 != null && !paramString2.trim().equals(""))
      stringBuilder.append("?motd=").append(Dne(paramString2)); 
    stringBuilder.append("&difficulty=").append(paramInt1).append("&gameMode=").append(paramInt2);
    Dne(EKF.FWm(stringBuilder.toString(), ""));
  }
  
  public Boolean Dne() {
    String str1 = bzF + "mco/available";
    String str2 = Dne(EKF.Dne(str1));
    return Boolean.valueOf(str2);
  }
  
  public int Dne() {
    String str1 = bzF + "payments/unused";
    String str2 = Dne(EKF.Dne(str1));
    return Integer.valueOf(str2).intValue();
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\mNp.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */