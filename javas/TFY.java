import java.util.HashMap;
import java.util.TimerTask;

class TFY extends TimerTask {
  final evf Dne;
  
  public void run() {
    if (evf.Dne(this.Dne).aFZ()) {
      HashMap<Object, Object> hashMap;
      synchronized (evf.Dne(this.Dne)) {
        hashMap = new HashMap<>(evf.Dne(this.Dne));
        hashMap.put("snooper_count", Integer.valueOf(evf.Dne(this.Dne)));
      } 
      fgp.Dne(evf.Dne(this.Dne).Dne(), evf.Dne(this.Dne), hashMap, true);
    } 
  }
  
  TFY(evf paramevf) {
    this.Dne = paramevf;
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\TFY.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */