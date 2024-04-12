import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class trS {
  private final List Dne;
  
  private final Tfm Dne;
  
  private final Random Dne;
  
  private final RAN Dne = (RAN)new Tfm();
  
  public void Dne(sMa paramsMa, double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat) {
    if (((Jik)this.Dne.Dne).Dne != 1) {
      if (!Dne(paramsMa, paramDouble1, paramDouble2, paramDouble3, paramFloat)) {
        Dne(paramsMa);
        Dne(paramsMa, paramDouble1, paramDouble2, paramDouble3, paramFloat);
      } 
    } else {
      int i = geR.FWm(paramsMa.div);
      int j = geR.FWm(paramsMa.IjH) - 1;
      int k = geR.FWm(paramsMa.mrb);
      byte b1 = 1;
      byte b2 = 0;
      for (byte b = -2; b <= 2; b++) {
        for (byte b3 = -2; b3 <= 2; b3++) {
          for (byte b4 = -1; b4 < 3; b4++) {
            int m = i + b3 * b1 + b * b2;
            int n = j + b4;
            int i1 = k + b3 * b2 - b * b1;
            boolean bool = (b4 < 0) ? true : false;
            this.Dne.FWm(m, n, i1, bool ? zKP.cot.FWm : 0);
          } 
        } 
      } 
      paramsMa.FWm(i, j, k, paramsMa.mrb, 0.0F);
      paramsMa.Zpi = paramsMa.kGO = 0.0D;
      (paramsMa.kGO = 0.0D).XHL = paramsMa;
    } 
  }
  
  public boolean Dne(sMa paramsMa) {
    byte b1 = 16;
    double d = -1.0D;
    int i = geR.FWm(paramsMa.div);
    int j = geR.FWm(paramsMa.IjH);
    int k = geR.FWm(paramsMa.mrb);
    int m = i;
    int n = j;
    int i1 = k;
    int i2 = 0;
    int i3 = this.Dne.nextInt(4);
    int i4;
    for (i4 = i - b1; i4 <= i + b1; i4++) {
      double d1 = i4 + 0.5D - paramsMa.div;
      for (int i10 = k - b1; i10 <= k + b1; i10++) {
        double d2 = i10 + 0.5D - paramsMa.mrb;
        int i11;
        label170: for (i11 = this.Dne.bzF() - 1; i11 >= 0; i11--) {
          if (this.Dne.Dne(i4, i11, i10)) {
            while (i11 > 0 && this.Dne.Dne(i4, i11 - 1, i10))
              i11--; 
            for (int i12 = i3; i12 < i3 + 4; i12++) {
              int i13 = i12 % 2;
              int i14 = 1 - i13;
              if (i12 % 4 >= 2) {
                i13 = -i13;
                i14 = -i14;
              } 
              for (byte b = 0; b < 3; b++) {
                for (byte b3 = 0; b3 < 4; b3++) {
                  byte b4 = -1;
                  while (b4 < 4) {
                    int i15 = i4 + (b3 - 1) * i13 + b * i14;
                    int i16 = i11 + b4;
                    int i17 = i10 + (b3 - 1) * i14 - b * i13;
                    if (b4 >= 0 || this.Dne.Dne(i15, i16, i17).Dne()) {
                      if (b4 >= 0 && !this.Dne.Dne(i15, i16, i17))
                        continue label170; 
                      b4++;
                      continue;
                    } 
                    continue label170;
                  } 
                } 
              } 
              double d3 = i11 + 0.5D - paramsMa.IjH;
              double d4 = d1 * d1 + d3 * d3 + d2 * d2;
              if (d < 0.0D || d4 < d) {
                d = d4;
                m = i4;
                n = i11;
                i1 = i10;
                i2 = i12 % 4;
              } 
            } 
          } 
        } 
      } 
    } 
    if (d < 0.0D)
      for (i4 = i - b1; i4 <= i + b1; i4++) {
        double d1 = i4 + 0.5D - paramsMa.div;
        for (int i10 = k - b1; i10 <= k + b1; i10++) {
          double d2 = i10 + 0.5D - paramsMa.mrb;
          int i11;
          label167: for (i11 = this.Dne.bzF() - 1; i11 >= 0; i11--) {
            if (this.Dne.Dne(i4, i11, i10)) {
              while (i11 > 0 && this.Dne.Dne(i4, i11 - 1, i10))
                i11--; 
              for (int i12 = i3; i12 < i3 + 2; i12++) {
                int i13 = i12 % 2;
                int i14 = 1 - i13;
                for (byte b = 0; b < 4; b++) {
                  byte b3 = -1;
                  while (b3 < 4) {
                    int i15 = i4 + (b - 1) * i13;
                    int i16 = i11 + b3;
                    int i17 = i10 + (b - 1) * i14;
                    if (b3 >= 0 || this.Dne.Dne(i15, i16, i17).Dne()) {
                      if (b3 >= 0 && !this.Dne.Dne(i15, i16, i17))
                        continue label167; 
                      b3++;
                      continue;
                    } 
                    continue label167;
                  } 
                } 
                double d3 = i11 + 0.5D - paramsMa.IjH;
                double d4 = d1 * d1 + d3 * d3 + d2 * d2;
                if (d < 0.0D || d4 < d) {
                  d = d4;
                  m = i4;
                  n = i11;
                  i1 = i10;
                  i2 = i12 % 2;
                } 
              } 
            } 
          } 
        } 
      }  
    int i6 = m;
    int i7 = n;
    int i5 = i1;
    int i8 = i2 % 2;
    int i9 = 1 - i8;
    if (i2 % 4 >= 2) {
      i8 = -i8;
      i9 = -i9;
    } 
    if (d < 0.0D) {
      if (n < 70)
        n = 70; 
      if (n > this.Dne.bzF() - 10)
        n = this.Dne.bzF() - 10; 
      i7 = n;
      for (byte b = -1; b <= 1; b++) {
        for (byte b3 = 1; b3 < 3; b3++) {
          for (byte b4 = -1; b4 < 3; b4++) {
            int i10 = i6 + (b3 - 1) * i8 + b * i9;
            int i11 = i7 + b4;
            int i12 = i5 + (b3 - 1) * i9 - b * i8;
            boolean bool = (b4 < 0) ? true : false;
            this.Dne.FWm(i10, i11, i12, bool ? zKP.cot.FWm : 0);
          } 
        } 
      } 
    } 
    for (byte b2 = 0; b2 < 4; b2++) {
      byte b;
      for (b = 0; b < 4; b++) {
        for (byte b3 = -1; b3 < 4; b3++) {
          int i10 = i6 + (b - 1) * i8;
          int i11 = i7 + b3;
          int i12 = i5 + (b - 1) * i9;
          boolean bool = (b == 0 || b == 3 || b3 == -1 || b3 == 3) ? true : false;
          this.Dne.FWm(i10, i11, i12, bool ? zKP.cot.FWm : ((QkV)zKP.Dne).FWm, 0, 2);
        } 
      } 
      for (b = 0; b < 4; b++) {
        for (byte b3 = -1; b3 < 4; b3++) {
          int i10 = i6 + (b - 1) * i8;
          int i11 = i7 + b3;
          int i12 = i5 + (b - 1) * i9;
          this.Dne.bzF(i10, i11, i12, this.Dne.Dne(i10, i11, i12));
        } 
      } 
    } 
    return true;
  }
  
  public void Dne(long paramLong) {
    if (paramLong % 100L == 0L) {
      Iterator<Long> iterator = this.Dne.iterator();
      long l = paramLong - 600L;
      while (iterator.hasNext()) {
        Long long_ = iterator.next();
        qLR qLR = (qLR)this.Dne.Dne(long_.longValue());
        if (qLR == null || qLR.Dne < l) {
          iterator.remove();
          this.Dne.FWm(long_.longValue());
        } 
      } 
    } 
  }
  
  public trS(RAN paramRAN) {
    this.Dne = (RAN)new ArrayList();
    this.Dne = paramRAN;
    this.Dne = (RAN)new Random(paramRAN.Dne());
  }
  
  public boolean Dne(sMa paramsMa, double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat) {
    char c = '';
    double d = -1.0D;
    int i = 0;
    int j = 0;
    int k = 0;
    int m = geR.FWm(paramsMa.div);
    int n = geR.FWm(paramsMa.mrb);
    long l = Sxs.Dne(m, n);
    boolean bool = true;
    if (this.Dne.Dne(l)) {
      qLR qLR = (qLR)this.Dne.Dne(l);
      d = 0.0D;
      long l1 = qLR.Dne;
      j = qLR.FWm;
      k = qLR.bzF;
      qLR.Dne = this.Dne.FWm();
      bool = false;
    } else {
      for (int i1 = m - c; i1 <= m + c; i1++) {
        double d1 = i1 + 0.5D - paramsMa.div;
        for (int i2 = n - c; i2 <= n + c; i2++) {
          double d2 = i2 + 0.5D - paramsMa.mrb;
          for (int i3 = this.Dne.bzF() - 1; i3 >= 0; i3--) {
            if (this.Dne.Dne(i1, i3, i2) == ((QkV)zKP.Dne).FWm) {
              while (this.Dne.Dne(i1, i3 - 1, i2) == ((QkV)zKP.Dne).FWm)
                i3--; 
              double d3 = i3 + 0.5D - paramsMa.IjH;
              double d4 = d1 * d1 + d3 * d3 + d2 * d2;
              if (d < 0.0D || d4 < d) {
                d = d4;
                i = i1;
                j = i3;
                k = i2;
              } 
            } 
          } 
        } 
      } 
    } 
    if (d >= 0.0D) {
      if (bool) {
        this.Dne.Dne(l, new qLR(this, i, j, k, this.Dne.FWm()));
        this.Dne.add(Long.valueOf(l));
      } 
      double d2 = i + 0.5D;
      double d3 = j + 0.5D;
      double d1 = k + 0.5D;
      int i1 = -1;
      if (this.Dne.Dne(i - 1, j, k) == ((QkV)zKP.Dne).FWm)
        i1 = 2; 
      if (this.Dne.Dne(i + 1, j, k) == ((QkV)zKP.Dne).FWm)
        i1 = 0; 
      if (this.Dne.Dne(i, j, k - 1) == ((QkV)zKP.Dne).FWm)
        i1 = 3; 
      if (this.Dne.Dne(i, j, k + 1) == ((QkV)zKP.Dne).FWm)
        i1 = 1; 
      int i2 = paramsMa.IjH();
      if (i1 > -1) {
        int i3 = zxJ.DyG[i1];
        String str1 = zxJ.Dne[i1];
        int i4 = zxJ.FWm[i1];
        String str2 = zxJ.Dne[i3];
        int i5 = zxJ.FWm[i3];
        boolean bool1 = (!this.Dne.Dne(i + str1 + str2, j, k + i4 + i5) || !this.Dne.Dne(i + str1 + str2, j + 1, k + i4 + i5)) ? true : false;
        boolean bool2 = (!this.Dne.Dne(i + str1, j, k + i4) || !this.Dne.Dne(i + str1, j + 1, k + i4)) ? true : false;
        if (bool1 && bool2) {
          i1 = zxJ.aFZ[i1];
          i3 = zxJ.aFZ[i3];
          str1 = zxJ.Dne[i1];
          i4 = zxJ.FWm[i1];
          str2 = zxJ.Dne[i3];
          i5 = zxJ.FWm[i3];
          int i7 = i - str2;
          d2 -= str2;
          int i8 = k - i5;
          d1 -= i5;
          bool1 = (!this.Dne.Dne(i7 + str1 + str2, j, i8 + i4 + i5) || !this.Dne.Dne(i7 + str1 + str2, j + 1, i8 + i4 + i5)) ? true : false;
          bool2 = (!this.Dne.Dne(i7 + str1, j, i8 + i4) || !this.Dne.Dne(i7 + str1, j + 1, i8 + i4)) ? true : false;
        } 
        float f1 = 0.5F;
        float f2 = 0.5F;
        if (!bool1 && bool2) {
          f1 = 1.0F;
        } else if (bool1 && !bool2) {
          f1 = 0.0F;
        } else if (bool1 && bool2) {
          f2 = 0.0F;
        } 
        d2 += (str2 * f1 + f2 * str1);
        d1 += (i5 * f1 + f2 * i4);
        float f3 = 0.0F;
        float f4 = 0.0F;
        float f5 = 0.0F;
        float f6 = 0.0F;
        if (i1 == i2) {
          f3 = 1.0F;
          f4 = 1.0F;
        } else if (i1 == zxJ.aFZ[i2]) {
          f3 = -1.0F;
          f4 = -1.0F;
        } else if (i1 == zxJ.zGp[i2]) {
          f5 = 1.0F;
          f6 = -1.0F;
        } else {
          f5 = -1.0F;
          f6 = 1.0F;
        } 
        int i6 = paramsMa.XHL;
        float f7 = paramsMa.kGO;
        paramsMa.XHL = i6 * f3 + f7 * f6;
        paramsMa.kGO = i6 * f5 + f7 * f4;
        paramsMa.mrb = paramFloat - (i2 * 90) + (i1 * 90);
      } else {
        paramsMa.Zpi = paramsMa.kGO = 0.0D;
        (paramsMa.kGO = 0.0D).XHL = paramsMa;
      } 
      paramsMa.FWm(d2, d3, d1, paramsMa.mrb, paramsMa.XHL);
      return true;
    } 
    return false;
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\trS.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */