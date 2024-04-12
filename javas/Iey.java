public class Iey extends Twy {
  public final WkD Dne;
  
  final Nlm Dne;
  
  public final String Dne;
  
  public Iey(Nlm paramNlm, WkD paramWkD, String paramString) {
    super(1);
    this.Dne = (String)paramNlm;
    if (paramString.equals("Minecart"))
      if (paramWkD != null) {
        switch (paramWkD.Dne("Type")) {
          case 0:
            paramString = "MinecartRideable";
            break;
          case 1:
            paramString = "MinecartChest";
            break;
          case 2:
            paramString = "MinecartFurnace";
            break;
        } 
      } else {
        paramString = "MinecartRideable";
      }  
    this.Dne = (String)paramWkD;
    this.Dne = paramString;
  }
  
  public Iey(Nlm paramNlm, WkD paramWkD) {
    super(paramWkD.Dne("Weight"));
    this.Dne = (String)paramNlm;
    WkD wkD = paramWkD.Dne("Properties");
    String str = paramWkD.Dne("Type");
    if (str.equals("Minecart"))
      if (wkD != null) {
        switch (wkD.Dne("Type")) {
          case 0:
            str = "MinecartRideable";
            break;
          case 1:
            str = "MinecartChest";
            break;
          case 2:
            str = "MinecartFurnace";
            break;
        } 
      } else {
        str = "MinecartRideable";
      }  
    this.Dne = (String)wkD;
    this.Dne = str;
  }
  
  public WkD Dne() {
    WkD wkD = new WkD();
    wkD.Dne("Properties", (WkD)this.Dne);
    wkD.Dne("Type", this.Dne);
    wkD.Dne("Weight", this.bzF);
    return wkD;
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\Iey.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */