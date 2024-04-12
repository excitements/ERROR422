import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class mQQ extends Thread {
  final iJs Dne;
  
  mQQ(iJs paramiJs) {
    this.Dne = paramiJs;
  }
  
  public void run() {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    try {
      String str;
      while (!this.Dne.Vxn() && this.Dne.XHL() && (str = bufferedReader.readLine()) != null)
        this.Dne.Dne(str, this.Dne); 
    } catch (IOException iOException) {
      iOException.printStackTrace();
    } 
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\mQQ.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */