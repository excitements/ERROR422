import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Kjm extends XEr {
  public void Dne() {
    LoG.Dne();
  }
  
  private void Dne(File paramFile1, File paramFile2, tgc paramtgc, int paramInt1, int paramInt2, TaY paramTaY) {
    try {
      String str = paramFile2.getName();
      iNQ iNQ1 = new iNQ(paramFile2);
      iNQ iNQ2 = new iNQ(new File(paramFile1, str.substring(0, str.length() - ".mcr".length()) + ".mca"));
      for (byte b = 0; b < 32; b++) {
        int i;
        for (i = 0; i < 32; i++) {
          if (iNQ1.Dne(b, i) && !iNQ2.Dne(b, i)) {
            DataInputStream dataInputStream = iNQ1.Dne(b, i);
            if (dataInputStream == null) {
              Jwh.Dne().Dne().FWm("Failed to fetch input stream");
            } else {
              WkD wkD1 = VVx.Dne(dataInputStream);
              dataInputStream.close();
              WkD wkD2 = wkD1.Dne("Level");
              exS exS = JLG.Dne(wkD2);
              WkD wkD3 = new WkD();
              WkD wkD4 = new WkD();
              wkD3.Dne("Level", wkD4);
              JLG.Dne(exS, wkD4, paramtgc);
              DataOutputStream dataOutputStream = iNQ2.Dne(b, i);
              VVx.Dne(wkD3, dataOutputStream);
              dataOutputStream.close();
            } 
          } 
        } 
        i = (int)Math.round(100.0D * (paramInt1 * 1024) / (paramInt2 * 1024));
        int j = (int)Math.round(100.0D * ((b + 1) * 32 + paramInt1 * 1024) / (paramInt2 * 1024));
        if (j > i)
          paramTaY.Dne(j); 
      } 
      iNQ1.Dne();
      iNQ2.Dne();
    } catch (IOException iOException) {
      iOException.printStackTrace();
    } 
  }
  
  private void Dne(String paramString) {
    File file = new File(this.Dne, paramString);
    if (!file.exists()) {
      System.out.println("Warning: Unable to create level.dat_mcr backup");
    } else {
      File file1 = new File(file, "level.dat");
      if (!file1.exists()) {
        System.out.println("Warning: Unable to create level.dat_mcr backup");
      } else {
        File file2 = new File(file, "level.dat_mcr");
        if (!file1.renameTo(file2))
          System.out.println("Warning: Unable to create level.dat_mcr backup"); 
      } 
    } 
  }
  
  public boolean Dne(String paramString, TaY paramTaY) {
    paramTaY.Dne(0);
    ArrayList arrayList1 = new ArrayList();
    ArrayList arrayList2 = new ArrayList();
    ArrayList arrayList3 = new ArrayList();
    File file1 = new File(this.Dne, paramString);
    File file2 = new File(file1, "DIM-1");
    File file3 = new File(file1, "DIM1");
    Jwh.Dne().Dne().Dne("Scanning folders...");
    Dne(file1, arrayList1);
    if (file2.exists())
      Dne(file2, arrayList2); 
    if (file3.exists())
      Dne(file3, arrayList3); 
    int i = arrayList1.size() + arrayList2.size() + arrayList3.size();
    Jwh.Dne().Dne().Dne("Total conversion count is " + i);
    xoY xoY = Dne(paramString);
    tgc tgc = null;
    if (xoY.Dne() == kGO.FWm) {
      tgc = new yMz(OdI.FWm, 0.5F, 0.5F);
    } else {
      tgc = new tgc(xoY.Dne(), xoY.Dne());
    } 
    Dne(new File(file1, "region"), arrayList1, tgc, 0, i, paramTaY);
    Dne(new File(file2, "region"), arrayList2, new yMz(OdI.IjH, 1.0F, 0.0F), arrayList1.size(), i, paramTaY);
    Dne(new File(file3, "region"), arrayList3, new yMz(OdI.mrb, 0.5F, 0.0F), arrayList1.size() + arrayList2.size(), i, paramTaY);
    xoY.Qnq(19133);
    if (xoY.Dne() == kGO.Qnq)
      xoY.Dne(kGO.Dne); 
    Dne(paramString);
    iDE iDE = Dne(paramString, false);
    iDE.Dne(xoY);
    return true;
  }
  
  public boolean Dne(String paramString) {
    xoY xoY = Dne(paramString);
    return (xoY != null && xoY.aFZ() != Dne());
  }
  
  public Kjm(File paramFile) {
    super(paramFile);
  }
  
  private void Dne(File paramFile, Collection<? super File> paramCollection) {
    File file = new File(paramFile, "region");
    File[] arrayOfFile = file.listFiles(new qRn(this));
    if (arrayOfFile != null)
      Collections.addAll(paramCollection, arrayOfFile); 
  }
  
  static {
  
  }
  
  protected int Dne() {
    return 19133;
  }
  
  public iDE Dne(String paramString, boolean paramBoolean) {
    return new xXz(this.Dne, paramString, paramBoolean);
  }
  
  private void Dne(File paramFile, Iterable paramIterable, tgc paramtgc, int paramInt1, int paramInt2, TaY paramTaY) {
    for (File file : paramIterable) {
      Dne(paramFile, file, paramtgc, paramInt1, paramInt2, paramTaY);
      int i = (int)Math.round(100.0D * ++paramInt1 / paramInt2);
      paramTaY.Dne(i);
    } 
  }
  
  public List Dne() {
    if (this.Dne != null && this.Dne.exists() && this.Dne.isDirectory()) {
      ArrayList<pQP> arrayList = new ArrayList();
      File[] arrayOfFile1 = this.Dne.listFiles();
      File[] arrayOfFile2 = arrayOfFile1;
      int i = arrayOfFile1.length;
      for (byte b = 0; b < i; b++) {
        File file = arrayOfFile2[b];
        if (file.isDirectory()) {
          String str = file.getName();
          xoY xoY = Dne(str);
          if (xoY != null && (xoY.aFZ() == 19132 || xoY.aFZ() == 19133)) {
            boolean bool = (xoY.aFZ() != Dne()) ? true : false;
            String str1 = xoY.Dne();
            if (str1 == null || geR.Dne(str1))
              str1 = str; 
            long l = 0L;
            arrayList.add(new pQP(str, str1, xoY.aFZ(), l, xoY.Dne(), bool, xoY.Qnq(), xoY.aFZ()));
          } 
        } 
      } 
      return arrayList;
    } 
    throw new Ipl("Unable to read or access folder where game worlds are saved!");
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\Kjm.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */