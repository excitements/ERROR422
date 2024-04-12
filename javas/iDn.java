import java.util.ArrayList;
import java.util.List;
import java.util.Random;

abstract class iDn extends bvz {
  private bvz Dne(Tps paramTps, List<iDn> paramList, Random paramRandom, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, boolean paramBoolean) {
    if (Math.abs(paramInt1 - (paramTps.Dne()).Dne) <= 112 && Math.abs(paramInt3 - (paramTps.Dne()).bzF) <= 112) {
      List list = paramTps.Dne;
      if (paramBoolean)
        list = paramTps.FWm; 
      iDn iDn1 = Dne(paramTps, list, paramList, paramRandom, paramInt1, paramInt2, paramInt3, paramInt4, paramInt5 + 1);
      if (iDn1 != null) {
        paramList.add(iDn1);
        paramTps.Dne.add(iDn1);
      } 
      return iDn1;
    } 
    return Pwe.Dne(paramList, paramRandom, paramInt1, paramInt2, paramInt3, paramInt4, paramInt5);
  }
  
  protected bvz FWm(Tps paramTps, List paramList, Random paramRandom, int paramInt1, int paramInt2, boolean paramBoolean) {
    switch (this.aFZ) {
      case 0:
        return Dne(paramTps, paramList, paramRandom, this.Dne.Dne - 1, this.Dne.FWm + paramInt1, this.Dne.bzF + paramInt2, 1, Dne(), paramBoolean);
      case 1:
        return Dne(paramTps, paramList, paramRandom, this.Dne.Dne + paramInt2, this.Dne.FWm + paramInt1, this.Dne.bzF - 1, 2, Dne(), paramBoolean);
      case 2:
        return Dne(paramTps, paramList, paramRandom, this.Dne.Dne - 1, this.Dne.FWm + paramInt1, this.Dne.bzF + paramInt2, 1, Dne(), paramBoolean);
      case 3:
        return Dne(paramTps, paramList, paramRandom, this.Dne.Dne + paramInt2, this.Dne.FWm + paramInt1, this.Dne.bzF - 1, 2, Dne(), paramBoolean);
    } 
    return null;
  }
  
  private int Dne(List paramList) {
    boolean bool = false;
    int i = 0;
    for (ZLf zLf : paramList) {
      if (zLf.bzF > 0 && zLf.FWm < zLf.bzF)
        bool = true; 
      i += zLf.Dne;
    } 
    return bool ? i : -1;
  }
  
  static {
  
  }
  
  protected static boolean Dne(CLK paramCLK) {
    return (paramCLK != null && paramCLK.FWm > 10);
  }
  
  protected bvz bzF(Tps paramTps, List paramList, Random paramRandom, int paramInt1, int paramInt2, boolean paramBoolean) {
    switch (this.aFZ) {
      case 0:
        return Dne(paramTps, paramList, paramRandom, this.Dne.Qnq + 1, this.Dne.FWm + paramInt1, this.Dne.bzF + paramInt2, 3, Dne(), paramBoolean);
      case 1:
        return Dne(paramTps, paramList, paramRandom, this.Dne.Dne + paramInt2, this.Dne.FWm + paramInt1, this.Dne.zGp + 1, 0, Dne(), paramBoolean);
      case 2:
        return Dne(paramTps, paramList, paramRandom, this.Dne.Qnq + 1, this.Dne.FWm + paramInt1, this.Dne.bzF + paramInt2, 3, Dne(), paramBoolean);
      case 3:
        return Dne(paramTps, paramList, paramRandom, this.Dne.Dne + paramInt2, this.Dne.FWm + paramInt1, this.Dne.zGp + 1, 0, Dne(), paramBoolean);
    } 
    return null;
  }
  
  private iDn Dne(Tps paramTps, List paramList1, List paramList2, Random paramRandom, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5) {
    int i = Dne(paramList1);
    boolean bool = (i > 0 && paramInt5 <= 30) ? true : false;
    byte b = 0;
    while (b < 5 && bool) {
      b++;
      int j = paramRandom.nextInt(i);
      for (ZLf zLf : paramList1) {
        j -= zLf.Dne;
        if (j < 0) {
          if (!zLf.Dne(paramInt5) || (zLf == paramTps.Dne && zLf.Dne == null))
            break; 
          iDn iDn1 = etZ.Dne(zLf, paramList2, paramRandom, paramInt1, paramInt2, paramInt3, paramInt4, paramInt5);
          if (iDn1 != null) {
            zLf.FWm++;
            paramTps.Dne = (ArrayList)zLf;
            if (!zLf.Dne())
              paramList1.remove(zLf); 
            return iDn1;
          } 
        } 
      } 
    } 
    return Pwe.Dne(paramList2, paramRandom, paramInt1, paramInt2, paramInt3, paramInt4, paramInt5);
  }
  
  protected iDn(int paramInt) {
    super(paramInt);
  }
  
  protected bvz Dne(Tps paramTps, List paramList, Random paramRandom, int paramInt1, int paramInt2, boolean paramBoolean) {
    switch (this.aFZ) {
      case 0:
        return Dne(paramTps, paramList, paramRandom, this.Dne.Dne + paramInt1, this.Dne.FWm + paramInt2, this.Dne.zGp + 1, this.aFZ, Dne(), paramBoolean);
      case 1:
        return Dne(paramTps, paramList, paramRandom, this.Dne.Dne - 1, this.Dne.FWm + paramInt2, this.Dne.bzF + paramInt1, this.aFZ, Dne(), paramBoolean);
      case 2:
        return Dne(paramTps, paramList, paramRandom, this.Dne.Dne + paramInt1, this.Dne.FWm + paramInt2, this.Dne.bzF - 1, this.aFZ, Dne(), paramBoolean);
      case 3:
        return Dne(paramTps, paramList, paramRandom, this.Dne.Qnq + 1, this.Dne.FWm + paramInt2, this.Dne.bzF + paramInt1, this.aFZ, Dne(), paramBoolean);
    } 
    return null;
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\iDn.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */