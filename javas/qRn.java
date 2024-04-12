import java.io.File;
import java.io.FilenameFilter;

class qRn implements FilenameFilter {
  final Kjm Dne;
  
  public boolean accept(File paramFile, String paramString) {
    return paramString.endsWith(".mcr");
  }
  
  qRn(Kjm paramKjm) {
    this.Dne = paramKjm;
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\qRn.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */