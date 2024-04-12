import java.util.List;

public class mva extends wJb {
  public void Dne(NMq paramNMq, Qnq paramQnq, sMa paramsMa, int paramInt, boolean paramBoolean) {
    if (paramQnq.aFZ == null) {
      Ilk ilk = Dne(paramNMq, paramQnq);
      if (paramsMa instanceof FiG) {
        FiG fiG = (FiG)paramsMa;
        ilk.Dne(fiG, paramNMq);
      } 
      if (paramBoolean)
        Dne(paramQnq, paramsMa, ilk); 
    } 
  }
  
  public static Ilk Dne(short paramShort, Qnq paramQnq) {
    String str = "map_" + paramShort;
    Ilk ilk = (Ilk)paramQnq.Dne(Ilk.class, str);
    if (ilk == null) {
      ilk = new Ilk(str);
      paramQnq.Dne(str, ilk);
    } 
    return ilk;
  }
  
  public void Dne(Qnq paramQnq, sMa paramsMa, Ilk paramIlk) {
    if (((Jik)paramQnq.Dne).Dne == paramIlk.Dne && paramsMa instanceof FiG) {
      char c1 = '';
      char c2 = '';
      int i = 1 << paramIlk.FWm;
      byte[] arrayOfByte = paramIlk.Dne;
      int j = paramIlk.FWm;
      int k = geR.FWm(paramsMa.div - arrayOfByte) / i + c1 / 2;
      int m = geR.FWm(paramsMa.mrb - j) / i + c2 / 2;
      int n = 128 / i;
      if (((Jik)paramQnq.Dne).FWm)
        n /= 2; 
      nJg nJg = paramIlk.Dne((FiG)paramsMa);
      nJg.Dne++;
      for (int i1 = k - n + 1; i1 < k + n; i1++) {
        if ((i1 & 0xF) == (nJg.Dne & 0xF)) {
          int i2 = 255;
          int i3 = 0;
          double d = 0.0D;
          for (int i4 = m - n - 1; i4 < m + n; i4++) {
            if (i1 >= 0 && i4 >= -1 && i1 < c1 && i4 < c2) {
              int i5 = i1 - k;
              int i6 = i4 - m;
              boolean bool = (i5 * i5 + i6 * i6 > (n - 2) * (n - 2)) ? true : false;
              int i7 = (arrayOfByte / i + i1 - c1 / 2) * i;
              int i8 = (j / i + i4 - c2 / 2) * i;
              int[] arrayOfInt = new int[256];
              qMV qMV = paramQnq.Dne(i7, i8);
              if (!qMV.Dne()) {
                int i9 = i7 & 0xF;
                int i10 = i8 & 0xF;
                int i11 = 0;
                double d1 = 0.0D;
                if (((Jik)paramQnq.Dne).FWm) {
                  int i14 = i7 + i8 * 231871;
                  i14 = i14 * i14 * 31287121 + i14 * 11;
                  if ((i14 >> 20 & 0x1) == 0) {
                    arrayOfInt[zKP.FWm.FWm] = arrayOfInt[zKP.FWm.FWm] + 10;
                  } else {
                    arrayOfInt[zKP.Dne.FWm] = arrayOfInt[zKP.Dne.FWm] + 10;
                  } 
                  d1 = 100.0D;
                } else {
                  for (byte b = 0; b < i; b++) {
                    for (byte b4 = 0; b4 < i; b4++) {
                      int i14 = qMV.Dne(b + i9, b4 + i10) + 1;
                      int i15 = 0;
                      if (i14 > 1) {
                        boolean bool1;
                        do {
                          bool1 = true;
                          i15 = qMV.Dne(b + i9, i14 - 1, b4 + i10);
                          if (i15 == 0) {
                            bool1 = false;
                          } else if (i14 > 0 && i15 > 0 && ((KFd)(zKP.Dne[i15]).Dne).Dne == UpO.Dne) {
                            bool1 = false;
                          } 
                          if (bool1)
                            continue; 
                          if (--i14 <= 0)
                            break; 
                          i15 = qMV.Dne(b + i9, i14 - 1, b4 + i10);
                        } while (i14 > 0 && !bool1);
                        if (i14 > 0 && i15 != 0 && (zKP.Dne[i15]).Dne.Qnq()) {
                          int i17;
                          int i16 = i14 - 1;
                          boolean bool2 = false;
                          do {
                            i17 = qMV.Dne(b + i9, i16--, b4 + i10);
                            i11++;
                          } while (i16 > 0 && i17 != 0 && (zKP.Dne[i17]).Dne.Qnq());
                        } 
                      } 
                      d1 += i14 / (i * i);
                      arrayOfInt[i15] = arrayOfInt[i15] + 1;
                    } 
                  } 
                } 
                i11 /= i * i;
                int i12 = 0;
                byte b1 = 0;
                for (byte b2 = 0; b2 < 'Ā'; b2++) {
                  if (arrayOfInt[b2] > i12) {
                    b1 = b2;
                    i12 = arrayOfInt[b2];
                  } 
                } 
                double d2 = (d1 - d) * 4.0D / (i + 4) + ((i1 + i4 & 0x1) - 0.5D) * 0.4D;
                byte b3 = 1;
                if (d2 > 0.6D)
                  b3 = 2; 
                if (d2 < -0.6D)
                  b3 = 0; 
                int i13 = 0;
                if (b1 > 0) {
                  boolean bool1 = ((KFd)(zKP.Dne[b1]).Dne).Dne;
                  if (bool1 == UpO.kGO) {
                    d2 = i11 * 0.1D + (i1 + i4 & 0x1) * 0.2D;
                    b3 = 1;
                    if (d2 < 0.5D)
                      b3 = 2; 
                    if (d2 > 0.9D)
                      b3 = 0; 
                  } 
                  i13 = bool1.FWm;
                } 
                d = d1;
                if (i4 >= 0 && i5 * i5 + i6 * i6 < n * n && (!bool || (i1 + i4 & 0x1) != 0)) {
                  byte b4 = paramIlk.Dne[i1 + i4 * c1];
                  byte b5 = (byte)(i13 * 4 + b3);
                  if (b4 != b5) {
                    if (i2 > i4)
                      i2 = i4; 
                    if (i3 < i4)
                      i3 = i4; 
                    paramIlk.Dne[i1 + i4 * c1] = b5;
                  } 
                } 
              } 
            } 
          } 
          if (i2 <= i3)
            paramIlk.Dne(i1, i2, i3); 
        } 
      } 
    } 
  }
  
  public Ilk Dne(NMq paramNMq, Qnq paramQnq) {
    String str = "map_" + paramNMq.Qnq();
    Ilk ilk = (Ilk)paramQnq.Dne(Ilk.class, str);
    if (ilk == null && paramQnq.aFZ == null) {
      paramNMq.Dne(paramQnq.Dne("map"));
      str = "map_" + paramNMq.Qnq();
      ilk = new Ilk(str);
      ilk.FWm = 3;
      int i = 128 * (1 << ilk.FWm);
      ilk.Dne = Math.round(paramQnq.Dne().Dne() / i) * i;
      ilk.FWm = Math.round((paramQnq.Dne().bzF() / i)) * i;
      ilk.Dne = (byte)((Jik)paramQnq.Dne).Dne;
      ilk.Dne();
      paramQnq.Dne(str, ilk);
    } 
    return ilk;
  }
  
  protected mva(int paramInt) {
    super(paramInt);
    Dne(true);
  }
  
  public void Dne(NMq paramNMq, FiG paramFiG, List<String> paramList, boolean paramBoolean) {
    Ilk ilk = Dne(paramNMq, (Qnq)paramFiG.Dne);
    if (paramBoolean)
      if (ilk == null) {
        paramList.add("Unknown map");
      } else {
        paramList.add("Scaling at 1:" + (1 << ilk.FWm));
        paramList.add("(Level " + ilk.FWm + "/" + '\004' + ")");
      }  
  }
  
  public NER Dne(NMq paramNMq, Qnq paramQnq, FiG paramFiG) {
    byte[] arrayOfByte = Dne(paramNMq, paramQnq).Dne(paramNMq, paramQnq, paramFiG);
    return (arrayOfByte == null) ? null : new XsD((short)dEr.Dne.Qnq, (short)paramNMq.Qnq(), arrayOfByte);
  }
  
  public void FWm(NMq paramNMq, Qnq paramQnq, FiG paramFiG) {
    if (paramNMq.aFZ() && paramNMq.Dne().FWm("map_is_scaling")) {
      Ilk ilk1 = dEr.Dne.Dne(paramNMq, paramQnq);
      paramNMq.Dne(paramQnq.Dne("map"));
      Ilk ilk2 = new Ilk("map_" + paramNMq.Qnq());
      ilk2.FWm = (byte)(ilk1.FWm + 1);
      if (ilk2.FWm > 4)
        ilk2.FWm = 4; 
      ilk2.Dne = ilk1.Dne;
      ilk2.FWm = ilk1.FWm;
      ilk2.Dne = ilk1.Dne;
      ilk2.Dne();
      paramQnq.Dne("map_" + paramNMq.Qnq(), ilk2);
    } 
  }
  
  static {
  
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\mva.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */