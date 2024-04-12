import java.net.URL;

class sQP implements Runnable {
  final MKS Dne;
  
  public void run() {
    try {
      String str = fgp.Dne(new URL("http://assets.minecraft.net/1_6_has_been_released.flag"));
      if (str != null && str.length() > 0) {
        str = str.trim();
        synchronized (MKS.Dne(this.Dne)) {
          MKS.Dne(this.Dne, Dne.ATE + "Notice!" + Dne.FfS + " Minecraft 1.6 is available for manual download.");
          MKS.FWm(this.Dne, str);
          MKS.Dne(this.Dne, MKS.Dne(this.Dne).Dne(MKS.Dne(this.Dne)));
          MKS.FWm(this.Dne, MKS.FWm(this.Dne).Dne((String)MKS.Dne));
          int i = Math.max(MKS.Dne(this.Dne), MKS.FWm(this.Dne));
          MKS.bzF(this.Dne, (this.Dne.FWm - i) / 2);
          MKS.Qnq(this.Dne, ((Pee)MKS.Dne(this.Dne).get(0)).Qnq - 24);
          MKS.aFZ(this.Dne, MKS.bzF(this.Dne) + i);
          MKS.zGp(this.Dne, MKS.Qnq(this.Dne) + 24);
        } 
      } 
    } catch (Throwable throwable) {
      throwable.printStackTrace();
    } 
  }
  
  sQP(MKS paramMKS) {
    this.Dne = paramMKS;
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\sQP.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */