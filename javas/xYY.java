import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import org.lwjgl.input.Mouse;

abstract class xYY extends LSv {
  protected int DyG;
  
  protected int div;
  
  final ZyA FWm;
  
  protected List Dne;
  
  protected Comparator Dne;
  
  protected int Dne;
  
  protected boolean Dne(int paramInt) {
    return false;
  }
  
  protected void Dne(int paramInt1, int paramInt2) {
    this.Dne = -1;
    if (paramInt1 >= 79 && paramInt1 < 115) {
      this.Dne = 0;
    } else if (paramInt1 >= 129 && paramInt1 < 165) {
      this.Dne = 1;
    } else if (paramInt1 >= 179 && paramInt1 < 215) {
      this.Dne = 2;
    } 
    if (this.Dne >= 0) {
      FWm(this.Dne);
      (ZyA.bzF(this.FWm)).Dne.Dne("random.click", 1.0F, 1.0F);
    } 
  }
  
  protected xYY(ZyA paramZyA) {
    super(ZyA.FWm(paramZyA), paramZyA.FWm, paramZyA.bzF, 32, paramZyA.bzF - 64, 20);
    this.FWm = paramZyA;
    this.Dne = -1;
    this.DyG = -1;
    this.div = 0;
    Dne(false);
    Dne(true, 20);
  }
  
  protected final int Dne() {
    // Byte code:
    //   0: aload_0
    //   1: getfield Dne : Ljava/util/List;
    //   4: invokeinterface size : ()I
    //   9: ireturn
  }
  
  protected abstract String Dne(int paramInt);
  
  protected void FWm(int paramInt) {
    if (paramInt != this.DyG) {
      this.DyG = paramInt;
      this.div = -1;
    } else if (this.div == -1) {
      this.div = 1;
    } else {
      this.DyG = -1;
      this.div = 0;
    } 
    Collections.sort(this.Dne, this.Dne);
  }
  
  protected void Dne(int paramInt, boolean paramBoolean) {}
  
  protected void Dne(isy paramisy, int paramInt1, int paramInt2, boolean paramBoolean) {
    if (paramisy != null) {
      String str = paramisy.Dne(ZyA.Dne(this.FWm).Dne(paramisy));
      this.FWm.FWm(ZyA.Qnq(this.FWm), str, paramInt1 - ZyA.aFZ(this.FWm).Dne(str), paramInt2 + 5, paramBoolean ? 16777215 : 9474192);
    } else {
      String str = "-";
      this.FWm.FWm(ZyA.zGp(this.FWm), str, paramInt1 - ZyA.DyG(this.FWm).Dne(str), paramInt2 + 5, paramBoolean ? 16777215 : 9474192);
    } 
  }
  
  protected final isy Dne(int paramInt) {
    // Byte code:
    //   0: aload_0
    //   1: getfield Dne : Ljava/util/List;
    //   4: iload_1
    //   5: invokeinterface get : (I)Ljava/lang/Object;
    //   10: checkcast isy
    //   13: areturn
  }
  
  protected void Dne() {
    this.FWm.aFZ();
  }
  
  protected void Dne(int paramInt1, int paramInt2, WAR paramWAR) {
    if (!Mouse.isButtonDown(0))
      this.Dne = -1; 
    if (this.Dne == 0) {
      ZyA.Dne(this.FWm, paramInt1 + 115 - 18, paramInt2 + 1, 0, 0);
    } else {
      ZyA.Dne(this.FWm, paramInt1 + 115 - 18, paramInt2 + 1, 0, 18);
    } 
    if (this.Dne == 1) {
      ZyA.Dne(this.FWm, paramInt1 + 165 - 18, paramInt2 + 1, 0, 0);
    } else {
      ZyA.Dne(this.FWm, paramInt1 + 165 - 18, paramInt2 + 1, 0, 18);
    } 
    if (this.Dne == 2) {
      ZyA.Dne(this.FWm, paramInt1 + 215 - 18, paramInt2 + 1, 0, 0);
    } else {
      ZyA.Dne(this.FWm, paramInt1 + 215 - 18, paramInt2 + 1, 0, 18);
    } 
    if (this.DyG != -1) {
      char c = 'O';
      byte b = 18;
      if (this.DyG == 1) {
        c = '';
      } else if (this.DyG == 2) {
        c = '³';
      } 
      if (this.div == 1)
        b = 36; 
      ZyA.Dne(this.FWm, paramInt1 + c, paramInt2 + 1, b, 0);
    } 
  }
  
  protected void Dne(isy paramisy, int paramInt1, int paramInt2) {
    if (paramisy != null) {
      mva mva = dEr.Dne[paramisy.Dne()];
      String str = ("" + irb.Dne().FWm(mva.FWm())).trim();
      if (str.length() > 0) {
        int i = paramInt1 + 12;
        int j = paramInt2 - 12;
        int k = ZyA.mrb(this.FWm).Dne(str);
        ZyA.FWm(this.FWm, i - 3, j - 3, i + k + 3, j + 8 + 3, -1073741824, -1073741824);
        ZyA.XHL(this.FWm).Dne(str, i, j, -1);
      } 
    } 
  }
  
  protected void FWm(int paramInt1, int paramInt2) {
    if (paramInt2 >= this.FWm && paramInt2 <= this.bzF) {
      int i = Dne(paramInt1, paramInt2);
      int j = this.FWm.FWm / 2 - 92 - 16;
      if (i >= 0) {
        if (paramInt1 < j + 40 || paramInt1 > j + 40 + 20)
          return; 
        isy isy = Dne(i);
        Dne(isy, paramInt1, paramInt2);
      } else {
        String str = "";
        if (paramInt1 >= j + 115 - 18 && paramInt1 <= j + 115) {
          str = Dne(0);
        } else if (paramInt1 >= j + 165 - 18 && paramInt1 <= j + 165) {
          str = Dne(1);
        } else {
          if (paramInt1 < j + 215 - 18 || paramInt1 > j + 215)
            return; 
          str = Dne(2);
        } 
        str = ("" + irb.Dne().Dne(str)).trim();
        if (str.length() > 0) {
          int k = paramInt1 + 12;
          int m = paramInt2 - 12;
          int n = ZyA.div(this.FWm).Dne(str);
          ZyA.Dne(this.FWm, k - 3, m - 3, k + n + 3, m + 8 + 3, -1073741824, -1073741824);
          ZyA.IjH(this.FWm).Dne(str, k, m, -1);
        } 
      } 
    } 
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\xYY.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */