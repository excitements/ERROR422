import java.io.IOException;
import java.io.InputStream;

public class JQZ {
  static final int ATE;
  
  float FWm;
  
  int Vxn;
  
  static final int IjH;
  
  InputStream Dne;
  
  long[] FWm;
  
  tYH Dne;
  
  static final int bzF;
  
  static final int trS;
  
  static final int udO;
  
  boolean Dne;
  
  static final int mrb;
  
  static final int FWm;
  
  long bzF;
  
  Lth[] Dne;
  
  static final int aFZ;
  
  MOU Dne;
  
  int ceE;
  
  long[] Dne;
  
  static final int zGp;
  
  static final int kGO;
  
  static final int ooe;
  
  long FWm;
  
  static final int div;
  
  ytS Dne;
  
  long Dne;
  
  static final int Dne;
  
  static final int Zpi;
  
  float Dne;
  
  static final int XHL;
  
  int[] Dne;
  
  static final int qLR = -137;
  
  int EyB;
  
  static final int DyG;
  
  AOl Dne;
  
  long[] bzF;
  
  static final int Qnq;
  
  PRc[] Dne = false;
  
  boolean FWm;
  
  public int Qnq() {
    return this.Vxn;
  }
  
  private int Dne(aHQ paramaHQ) {
    PRc[] arrayOfPRc = this.Dne;
    int j = -1;
    while (j == -1) {
      long l = arrayOfPRc - 8500L;
      if (l < 0L)
        l = 0L; 
      Dne(l);
      while (this.Dne < l + 8500L) {
        int k = Dne(paramaHQ, l + 8500L - this.Dne);
        if (k == -128)
          return -128; 
        if (k < 0) {
          if (j == -1)
            throw new Njg(); 
          break;
        } 
        j = k;
      } 
    } 
    Dne(j);
    int i = Dne(paramaHQ, 8500L);
    return (i < 0) ? -129 : j;
  }
  
  private int DyG() {
    int i = this.Dne.Dne(8500);
    byte[] arrayOfByte = ((ytS)this.Dne).Dne;
    int j = 0;
    try {
      j = this.Dne.read(arrayOfByte, i, 8500);
    } catch (Exception exception) {
      return -128;
    } 
    this.Dne.FWm(j);
    if (j == -1)
      j = 0; 
    return j;
  }
  
  public boolean Dne() {
    return this.Dne;
  }
  
  public PRc[] Dne() {
    return this.Dne;
  }
  
  int Dne(byte[] paramArrayOfbyte, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int[] paramArrayOfint) {
    int i = zGp();
    byte b = 0;
    while (true) {
      if (this.FWm) {
        float[][][] arrayOfFloat1 = new float[1][][];
        int[] arrayOfInt = new int[(Dne(-1)).FWm];
        int j = this.Dne.Dne(arrayOfFloat1, arrayOfInt);
        float[][] arrayOfFloat = arrayOfFloat1[0];
        if (j != 0) {
          int[] arrayOfInt1 = (Dne(-1)).FWm;
          int k = paramInt3 * arrayOfInt1;
          if (j > paramInt1 / k)
            j = paramInt1 / k; 
          if (paramInt3 == 1) {
            byte b1 = (paramInt4 != 0) ? 0 : 128;
            for (byte b2 = 0; b2 < j; b2++) {
              for (byte b3 = 0; b3 < arrayOfInt1; b3++) {
                int m = (int)(arrayOfFloat[b3][arrayOfInt[b3] + b2] * 128.0D + 0.5D);
                if (m > 127) {
                  m = 127;
                } else if (m < -128) {
                  m = -128;
                } 
                paramArrayOfbyte[b++] = (byte)(m + b1);
              } 
            } 
          } else {
            byte b1 = (paramInt4 != 0) ? 0 : 32768;
            if (i == paramInt2) {
              if (paramInt4 != 0) {
                for (byte b2 = 0; b2 < arrayOfInt1; b2++) {
                  int m = arrayOfInt[b2];
                  int n = b2;
                  for (byte b3 = 0; b3 < j; b3++) {
                    int i1 = (int)(arrayOfFloat[b2][m + b3] * 32768.0D + 0.5D);
                    if (i1 > 32767) {
                      i1 = 32767;
                    } else if (i1 < -32768) {
                      i1 = -32768;
                    } 
                    paramArrayOfbyte[n] = (byte)(i1 >>> 8);
                    paramArrayOfbyte[n + 1] = (byte)i1;
                    n += arrayOfInt1 * 2;
                  } 
                } 
              } else {
                for (byte b2 = 0; b2 < arrayOfInt1; b2++) {
                  float[] arrayOfFloat2 = arrayOfFloat[b2];
                  int m = b2;
                  for (byte b3 = 0; b3 < j; b3++) {
                    int n = (int)(arrayOfFloat2[b3] * 32768.0D + 0.5D);
                    if (n > 32767) {
                      n = 32767;
                    } else if (n < -32768) {
                      n = -32768;
                    } 
                    paramArrayOfbyte[m] = (byte)(n + b1 >>> 8);
                    paramArrayOfbyte[m + 1] = (byte)(n + b1);
                    m += arrayOfInt1 * 2;
                  } 
                } 
              } 
            } else if (paramInt2 != 0) {
              for (byte b2 = 0; b2 < j; b2++) {
                for (byte b3 = 0; b3 < arrayOfInt1; b3++) {
                  int m = (int)(arrayOfFloat[b3][b2] * 32768.0D + 0.5D);
                  if (m > 32767) {
                    m = 32767;
                  } else if (m < -32768) {
                    m = -32768;
                  } 
                  m += b1;
                  paramArrayOfbyte[b++] = (byte)(m >>> 8);
                  paramArrayOfbyte[b++] = (byte)m;
                } 
              } 
            } else {
              for (byte b2 = 0; b2 < j; b2++) {
                for (byte b3 = 0; b3 < arrayOfInt1; b3++) {
                  int m = (int)(arrayOfFloat[b3][b2] * 32768.0D + 0.5D);
                  if (m > 32767) {
                    m = 32767;
                  } else if (m < -32768) {
                    m = -32768;
                  } 
                  m += b1;
                  paramArrayOfbyte[b++] = (byte)m;
                  paramArrayOfbyte[b++] = (byte)(m >>> 8);
                } 
              } 
            } 
          } 
          this.Dne.Dne(j);
          this.bzF += j;
          if (paramArrayOfint != null)
            paramArrayOfint[0] = this.EyB; 
          return j * k;
        } 
      } 
      switch (Dne(1)) {
        case 0:
          return 0;
        case -1:
          return -1;
      } 
    } 
  }
  
  int zGp() {
    return 1;
  }
  
  public int Qnq(int paramInt) {
    if (this.Dne == null)
      return -1; 
    if (paramInt < 0 || paramInt > this.Dne[this.Vxn]) {
      this.bzF = -1L;
      Dne();
      return -1;
    } 
    this.bzF = -1L;
    Dne();
    Dne(paramInt);
    switch (Dne(1)) {
      case 0:
        this.bzF = FWm(-1);
        return 0;
      case -1:
        this.bzF = -1L;
        Dne();
        return -1;
    } 
    while (true) {
      switch (Dne(0)) {
        case 0:
          return 0;
        case -1:
          this.bzF = -1L;
          Dne();
          return -1;
      } 
    } 
  }
  
  public int FWm(int paramInt) {
    if (paramInt >= this.Vxn)
      return -1; 
    if (this.Dne == null && paramInt != 0)
      return FWm(0); 
    if (paramInt < 0) {
      long l = 0L;
      for (byte b = 0; b < this.Vxn; b++)
        l += (this.Dne[b + 1] - this.FWm[b]) * 8L; 
      return (int)Math.rint(((float)l / Dne(-1)));
    } 
    return (this.Dne != null) ? (int)Math.rint(((float)((this.Dne[paramInt + 1] - this.FWm[paramInt]) * 8L) / Dne(paramInt))) : ((((Lth)this.Dne[paramInt]).aFZ > 0) ? ((Lth)this.Dne[paramInt]).aFZ : ((((Lth)this.Dne[paramInt]).Qnq > null) ? ((((Lth)this.Dne[paramInt]).zGp > 0) ? ((((Lth)this.Dne[paramInt]).Qnq + ((Lth)this.Dne[paramInt]).zGp) / 2) : ((Lth)this.Dne[paramInt]).Qnq) : -1));
  }
  
  static long Dne(InputStream paramInputStream) {
    try {
      if (paramInputStream instanceof TJY) {
        TJY tJY = (TJY)paramInputStream;
        return tJY.FWm();
      } 
    } catch (Exception exception) {}
    return 0L;
  }
  
  int Dne(Lth paramLth, PRc paramPRc, int[] paramArrayOfint, aHQ paramaHQ) {
    aHQ aHQ1 = new aHQ();
    qlF qlF = new qlF();
    if (paramaHQ == null) {
      int i = Dne(aHQ1, 8500L);
      if (i == -128)
        return -128; 
      if (i < 0)
        return -132; 
      paramaHQ = aHQ1;
    } 
    if (paramArrayOfint != null)
      paramArrayOfint[0] = paramaHQ.aFZ(); 
    this.Dne.Dne(paramaHQ.aFZ());
    paramLth.Dne();
    paramPRc.Dne();
    byte b = 0;
    while (b < 3) {
      this.Dne.Dne(paramaHQ);
      while (b < 3) {
        int i = this.Dne.FWm(qlF);
        if (i == 0)
          break; 
        if (i == -1) {
          paramLth.FWm();
          paramPRc.FWm();
          this.Dne.FWm();
          return -1;
        } 
        if (paramLth.Dne(paramPRc, qlF) != 0) {
          paramLth.FWm();
          paramPRc.FWm();
          this.Dne.FWm();
          return -1;
        } 
        b++;
      } 
      if (b < 3 && Dne(paramaHQ, 1L) < 0) {
        paramLth.FWm();
        paramPRc.FWm();
        this.Dne.FWm();
        return -1;
      } 
    } 
    return 0;
  }
  
  public Lth[] Dne() {
    return (Lth[])this.Dne;
  }
  
  int bzF() {
    this.Dne.Dne();
    this.Dne.Dne();
    this.Dne.FWm();
    if (this.Dne != null && this.Vxn != 0) {
      for (byte b = 0; b < this.Vxn; b++) {
        this.Dne[b].FWm();
        this.Dne[b].FWm();
      } 
      this.Dne = null;
      this.Dne = null;
    } 
    if (this.FWm != null)
      this.FWm = null; 
    if (this.bzF != null)
      this.bzF = null; 
    if (this.Dne != null)
      this.Dne = null; 
    if (this.Dne != null)
      this.Dne = null; 
    this.Dne.Dne();
    return 0;
  }
  
  void Dne(Lth paramLth, PRc paramPRc, int paramInt) {
    aHQ aHQ = new aHQ();
    this.Dne = (PRc[])new Lth[this.Vxn];
    this.Dne = new PRc[this.Vxn];
    this.FWm = new long[this.Vxn];
    this.bzF = new long[this.Vxn];
    this.Dne = (PRc[])new int[this.Vxn];
    for (byte b = 0; b < this.Vxn; b++) {
      if (paramLth != null && paramPRc != null && b == 0) {
        this.Dne[b] = (PRc)paramLth;
        this.Dne[b] = paramPRc;
        this.FWm[b] = paramInt;
      } else {
        Dne(this.Dne[b]);
        this.Dne[b] = (PRc)new Lth();
        this.Dne[b] = new PRc();
        if (Dne((Lth)this.Dne[b], this.Dne[b], null, null) == -1) {
          this.FWm[b] = -1L;
        } else {
          this.FWm[b] = this.Dne;
          this.Dne.FWm();
        } 
      } 
      PRc pRc = this.Dne[b + 1];
      Dne(pRc);
      while (true) {
        int i = Dne(aHQ);
        if (i == -1) {
          this.Dne[b].FWm();
          this.Dne[b].FWm();
          break;
        } 
        if (aHQ.Dne() != -1L) {
          this.Dne[b] = aHQ.aFZ();
          this.bzF[b] = aHQ.Dne();
          break;
        } 
      } 
    } 
  }
  
  public long Dne(int paramInt) {
    if (this.Dne == null || paramInt >= this.Vxn)
      return -1L; 
    if (paramInt < 0) {
      long l = 0L;
      for (byte b = 0; b < this.Vxn; b++)
        l += Dne(b); 
      return l;
    } 
    return this.Dne[paramInt + 1] - this.Dne[paramInt];
  }
  
  public Lth Dne(int paramInt) {
    return (Lth)((this.Dne != null) ? ((paramInt < 0) ? (this.FWm ? this.Dne[this.EyB] : null) : ((paramInt >= this.Vxn) ? null : this.Dne[paramInt])) : (this.FWm ? this.Dne[0] : null));
  }
  
  public void FWm() {
    this.Dne.close();
  }
  
  int Dne(int paramInt) {
    aHQ aHQ = new aHQ();
    while (true) {
      if (this.FWm) {
        qlF qlF = new qlF();
        int i = this.Dne.FWm(qlF);
        if (i > 0) {
          byte[] arrayOfByte = qlF.Dne;
          if (this.Dne.Dne(qlF) == 0) {
            int j = this.Dne.Dne((float[][][])null, (int[])null);
            this.Dne.Dne((MOU)this.Dne);
            this.FWm += (this.Dne.Dne((float[][][])null, (int[])null) - j);
            this.Dne += (qlF.FWm * 8);
            if (arrayOfByte != -1L && qlF.Qnq == 0) {
              j = (this.Dne != null) ? this.EyB : 0;
              int k = this.Dne.Dne((float[][][])null, (int[])null);
              long l = arrayOfByte - k;
              for (byte b = 0; b < j; b++)
                l += this.bzF[b]; 
              this.bzF = l;
            } 
            return 1;
          } 
        } 
      } 
      if (paramInt == 0)
        return 0; 
      if (Dne(aHQ, -1L) < 0)
        return 0; 
      this.Dne += (aHQ.FWm * 8);
      if (this.FWm && this.ceE != aHQ.aFZ())
        Dne(); 
      if (!this.FWm) {
        if (this.Dne != null) {
          this.ceE = aHQ.aFZ();
          byte b;
          for (b = 0; b < this.Vxn && this.Dne[b] != this.ceE; b++);
          if (b == this.Vxn)
            return -1; 
          this.EyB = b;
          this.Dne.Dne(this.ceE);
          this.Dne.FWm();
        } else {
          int[] arrayOfInt = new int[1];
          int i = Dne((Lth)this.Dne[0], this.Dne[0], arrayOfInt, aHQ);
          this.ceE = arrayOfInt[0];
          if (i != 0)
            return i; 
          this.EyB++;
          boolean bool = false;
        } 
        div();
      } 
      this.Dne.Dne(aHQ);
    } 
  }
  
  int Dne(float paramFloat) {
    int i = -1;
    long l1 = FWm(-1);
    float f = Dne(-1);
    if (this.Dne == null)
      return -1; 
    if (paramFloat < 0.0F || paramFloat > f) {
      this.bzF = -1L;
      Dne();
      return -1;
    } 
    for (i = this.Vxn - 1; i >= 0; i--) {
      l1 -= this.bzF[i];
      f -= Dne(i);
      if (paramFloat >= f)
        break; 
    } 
    long l2 = (long)((float)l1 + (paramFloat - f) * ((Lth)this.Dne[i]).bzF);
    return Dne(l2);
  }
  
  void Dne() {
    this.Dne.FWm();
    this.Dne.Dne();
    this.Dne.Dne();
    this.FWm = false;
    this.Dne = 0.0F;
    this.FWm = 0.0F;
  }
  
  private int div() {
    if (this.FWm)
      System.exit(1); 
    this.Dne.Dne((Lth)this.Dne[0]);
    this.Dne.Dne((AOl)this.Dne);
    this.FWm = true;
    return 0;
  }
  
  public long FWm() {
    return this.bzF;
  }
  
  private void Dne(long paramLong) {
    Dne((InputStream)this.Dne, paramLong, 0);
    this.Dne = paramLong;
    this.Dne.FWm();
  }
  
  private int Dne(aHQ paramaHQ, long paramLong) {
    if (paramLong > 0L)
      paramLong += this.Dne; 
    while (true) {
      if (paramLong > 0L && this.Dne >= paramLong)
        return -1; 
      int i = this.Dne.Dne(paramaHQ);
      if (i < 0) {
        this.Dne -= i;
        continue;
      } 
      if (i == 0) {
        if (paramLong == 0L)
          return -1; 
        int k = DyG();
        if (k == 0)
          return -2; 
        if (k < 0)
          return -128; 
        continue;
      } 
      int j = (int)this.Dne;
      this.Dne += i;
      return j;
    } 
  }
  
  static int Dne(InputStream paramInputStream, long paramLong, int paramInt) {
    if (paramInputStream instanceof TJY) {
      TJY tJY = (TJY)paramInputStream;
      try {
        if (paramInt == 0) {
          tJY.Dne(paramLong);
        } else if (paramInt == 2) {
          tJY.Dne(tJY.Dne() - paramLong);
        } 
      } catch (Exception exception) {}
      return 0;
    } 
    try {
      if (paramInt == 0)
        paramInputStream.reset(); 
      paramInputStream.skip(paramLong);
    } catch (Exception exception) {
      return -1;
    } 
    return 0;
  }
  
  public int aFZ() {
    boolean bool = (this.Dne != null) ? this.EyB : false;
    if (this.FWm == 0.0F)
      return -1; 
    int i = (int)((this.Dne / this.FWm * ((Lth)this.Dne[bool]).bzF) + 0.5D);
    this.Dne = 0.0F;
    this.FWm = 0.0F;
    return i;
  }
  
  public int bzF(int paramInt) {
    return (paramInt >= this.Vxn) ? -1 : ((this.Dne == null && paramInt >= 0) ? bzF(-1) : ((paramInt < 0) ? this.ceE : this.Dne[paramInt]));
  }
  
  public float Dne(int paramInt) {
    if (this.Dne == null || paramInt >= this.Vxn)
      return -1.0F; 
    if (paramInt < 0) {
      float f = 0.0F;
      for (byte b = 0; b < this.Vxn; b++)
        f += Dne(b); 
      return f;
    } 
    return (float)this.bzF[paramInt] / ((Lth)this.Dne[paramInt]).bzF;
  }
  
  public long FWm(int paramInt) {
    if (this.Dne == null || paramInt >= this.Vxn)
      return -1L; 
    if (paramInt < 0) {
      long l = 0L;
      for (byte b = 0; b < this.Vxn; b++)
        l += FWm(b); 
      return l;
    } 
    return this.bzF[paramInt];
  }
  
  public long Dne() {
    return this.Dne;
  }
  
  int FWm(InputStream paramInputStream, byte[] paramArrayOfbyte, int paramInt) {
    int i;
    this.Dne = (PRc[])paramInputStream;
    this.Dne.Dne();
    if (paramArrayOfbyte != null) {
      int j = this.Dne.Dne(paramInt);
      System.arraycopy(paramArrayOfbyte, 0, ((ytS)this.Dne).Dne, j, paramInt);
      this.Dne.FWm(paramInt);
    } 
    if (paramInputStream instanceof TJY) {
      i = Dne();
    } else {
      i = FWm();
    } 
    if (i != 0) {
      this.Dne = null;
      bzF();
    } 
    return i;
  }
  
  public PRc Dne(int paramInt) {
    return (this.Dne != null) ? ((paramInt < 0) ? (this.FWm ? this.Dne[this.EyB] : null) : ((paramInt >= this.Vxn) ? null : this.Dne[paramInt])) : (this.FWm ? this.Dne[0] : null);
  }
  
  int Dne(long paramLong1, long paramLong2, long paramLong3, int paramInt1, int paramInt2) {
    long l1 = paramLong3;
    long l2 = paramLong3;
    aHQ aHQ = new aHQ();
    while (paramLong2 < l1) {
      long l;
      if (l1 - paramLong2 < 8500L) {
        l = paramLong2;
      } else {
        l = (paramLong2 + l1) / 2L;
      } 
      Dne(l);
      int j = Dne(aHQ, -1L);
      if (j == -128)
        return -128; 
      if (j < 0 || aHQ.aFZ() != paramInt1) {
        l1 = l;
        if (j >= 0)
          l2 = j; 
        continue;
      } 
      paramLong2 = (j + aHQ.FWm + aHQ.Qnq);
    } 
    Dne(l2);
    int i = Dne(aHQ, -1L);
    if (i == -128)
      return -128; 
    if (paramLong2 >= paramLong3 || i == -1) {
      this.Vxn = paramInt2 + 1;
      this.Dne = (PRc[])new long[paramInt2 + 2];
      this.Dne[paramInt2 + 1] = paramLong2;
    } else {
      i = Dne(l2, this.Dne, paramLong3, aHQ.aFZ(), paramInt2 + 1);
      if (i == -128)
        return -128; 
    } 
    this.Dne[paramInt2] = paramLong1;
    return 0;
  }
  
  int FWm() {
    this.Vxn = 1;
    this.Dne = (PRc[])new Lth[this.Vxn];
    this.Dne[0] = (PRc)new Lth();
    this.Dne = new PRc[this.Vxn];
    this.Dne[0] = new PRc();
    int[] arrayOfInt = new int[1];
    if (Dne((Lth)this.Dne[0], this.Dne[0], arrayOfInt, null) == -1)
      return -1; 
    this.ceE = arrayOfInt[0];
    div();
    return 0;
  }
  
  int Dne(InputStream paramInputStream, byte[] paramArrayOfbyte, int paramInt) {
    return FWm(paramInputStream, paramArrayOfbyte, paramInt);
  }
  
  public int Dne(long paramLong) {
    int i = -1;
    long l1 = FWm(-1);
    if (this.Dne == null)
      return -1; 
    if (paramLong < 0L || paramLong > l1) {
      this.bzF = -1L;
      Dne();
      return -1;
    } 
    for (i = this.Vxn - 1; i >= 0; i--) {
      l1 -= this.bzF[i];
      if (paramLong >= l1)
        break; 
    } 
    long l2 = paramLong - l1;
    PRc pRc1 = this.Dne[i + 1];
    PRc pRc2 = this.Dne[i];
    int j = (int)pRc2;
    aHQ aHQ = new aHQ();
    while (pRc2 < pRc1) {
      long l4;
      if (pRc1 - pRc2 < 8500L) {
        PRc pRc = pRc2;
      } else {
        l4 = (pRc1 + pRc2) / 2L;
      } 
      Dne(l4);
      int k = Dne(aHQ, pRc1 - l4);
      if (k == -1) {
        long l = l4;
        continue;
      } 
      long l5 = aHQ.Dne();
      if (l5 < l2) {
        j = k;
        PRc[] arrayOfPRc = this.Dne;
        continue;
      } 
      long l3 = l4;
    } 
    if (Qnq(j) != 0) {
      this.bzF = -1L;
      Dne();
      return -1;
    } 
    if (this.bzF >= paramLong) {
      this.bzF = -1L;
      Dne();
      return -1;
    } 
    if (paramLong > FWm(-1)) {
      this.bzF = -1L;
      Dne();
      return -1;
    } 
    while (this.bzF < paramLong) {
      int k = (int)(paramLong - this.bzF);
      float[][][] arrayOfFloat = new float[1][][];
      int[] arrayOfInt = new int[(Dne(-1)).FWm];
      int m = this.Dne.Dne(arrayOfFloat, arrayOfInt);
      if (m > k)
        m = k; 
      this.Dne.Dne(m);
      this.bzF += m;
      if (m < k && Dne(1) == 0)
        this.bzF = FWm(-1); 
    } 
    return 0;
  }
  
  public JQZ(String paramString) {
    this.Dne = (PRc[])new ytS();
    this.FWm = false;
    this.Dne = (PRc[])new tYH();
    this.Dne = (PRc[])new AOl();
    this.Dne = (PRc[])new MOU((AOl)this.Dne);
    TJY tJY = null;
    try {
      tJY = new TJY(this, paramString);
      int i = Dne(tJY, (byte[])null, 0);
      if (i == -1)
        throw new Njg("VorbisFile: open return -1"); 
    } catch (Exception exception) {
      throw new Njg("VorbisFile: " + exception.toString());
    } finally {
      if (tJY != null)
        try {
          tJY.close();
        } catch (IOException iOException) {
          iOException.printStackTrace();
        }  
    } 
  }
  
  public JQZ(InputStream paramInputStream, byte[] paramArrayOfbyte, int paramInt) {
    this.Dne = (PRc[])new ytS();
    this.FWm = false;
    this.Dne = (PRc[])new tYH();
    this.Dne = (PRc[])new AOl();
    this.Dne = (PRc[])new MOU((AOl)this.Dne);
    int i = Dne(paramInputStream, paramArrayOfbyte, paramInt);
    if (i == -1);
  }
  
  static {
    FWm = false;
    bzF = true;
    udO = -134;
    ooe = -135;
    Dne = 'ℴ';
    DyG = -3;
    IjH = -129;
    aFZ = -1;
    mrb = -130;
    trS = -136;
    XHL = -131;
    zGp = -2;
    kGO = -133;
    ATE = -138;
    div = -128;
    Zpi = -132;
    Qnq = 2;
  }
  
  public float Dne() {
    int i = -1;
    long l = 0L;
    float f = 0.0F;
    if (this.Dne != null) {
      l = FWm(-1);
      f = Dne(-1);
      for (i = this.Vxn - 1; i >= 0; i--) {
        l -= this.bzF[i];
        f -= Dne(i);
        if (this.bzF >= l)
          break; 
      } 
    } 
    return f + (float)(this.bzF - l) / ((Lth)this.Dne[i]).bzF;
  }
  
  int Dne() {
    Lth lth = new Lth();
    PRc pRc = new PRc();
    aHQ aHQ = new aHQ();
    int[] arrayOfInt = new int[1];
    int j = Dne(lth, pRc, arrayOfInt, null);
    int i = arrayOfInt[0];
    int k = (int)this.Dne;
    this.Dne.FWm();
    if (j == -1)
      return -1; 
    if (j < 0)
      return j; 
    this.Dne = true;
    Dne((InputStream)this.Dne, 0L, 2);
    this.Dne = Dne((InputStream)this.Dne);
    PRc[] arrayOfPRc = this.Dne;
    long l = Dne(aHQ);
    if (aHQ.aFZ() != i) {
      if (Dne(0L, 0L, l + 1L, i, 0) < 0) {
        bzF();
        return -128;
      } 
    } else if (Dne(0L, l, l + 1L, i, 0) < 0) {
      bzF();
      return -128;
    } 
    Dne(lth, pRc, k);
    return 0;
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\JQZ.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */