class frg {
  static float aFZ;
  
  static float FWm;
  
  int Dne;
  
  static int[] FWm = new int[] { 4, 2, 3, 5 };
  
  static float Qnq;
  
  static float bzF;
  
  float[] Dne;
  
  int[] Dne;
  
  static float Dne = 6.2831855F;
  
  static void Dne(int paramInt1, int paramInt2, float[] paramArrayOffloat1, float[] paramArrayOffloat2, float[] paramArrayOffloat3, int paramInt3, float[] paramArrayOffloat4, int paramInt4) {
    int i = paramInt2 * paramInt1;
    int j = 0;
    int k = i << 1;
    int m = paramInt1 << 1;
    int n = paramInt1 + (paramInt1 << 1);
    int i1 = 0;
    byte b;
    for (b = 0; b < paramInt2; b++) {
      float f3 = paramArrayOffloat1[m - 1] + paramArrayOffloat1[m - 1];
      float f2 = paramArrayOffloat1[i1] + Qnq * f3;
      paramArrayOffloat2[j] = paramArrayOffloat1[i1] + f3;
      float f1 = bzF * (paramArrayOffloat1[m] + paramArrayOffloat1[m]);
      paramArrayOffloat2[j + i] = f2 - f1;
      paramArrayOffloat2[j + k] = f2 + f1;
      j += paramInt1;
      m += n;
      i1 += n;
    } 
    if (paramInt1 == 1)
      return; 
    j = 0;
    m = paramInt1 << 1;
    for (b = 0; b < paramInt2; b++) {
      int i3 = j + (j << 1);
      int i2 = i1 = i3 + m;
      int i4 = j;
      int i5;
      int i6 = (i5 = j + i) + i;
      for (byte b1 = 2; b1 < paramInt1; b1 += 2) {
        i1 += 2;
        i2 -= 2;
        i3 += 2;
        i4 += 2;
        i5 += 2;
        i6 += 2;
        float f10 = paramArrayOffloat1[i1 - 1] + paramArrayOffloat1[i2 - 1];
        float f5 = paramArrayOffloat1[i3 - 1] + Qnq * f10;
        paramArrayOffloat2[i4 - 1] = paramArrayOffloat1[i3 - 1] + f10;
        float f9 = paramArrayOffloat1[i1] - paramArrayOffloat1[i2];
        float f1 = paramArrayOffloat1[i3] + Qnq * f9;
        paramArrayOffloat2[i4] = paramArrayOffloat1[i3] + f9;
        float f6 = bzF * (paramArrayOffloat1[i1 - 1] - paramArrayOffloat1[i2 - 1]);
        float f2 = bzF * (paramArrayOffloat1[i1] + paramArrayOffloat1[i2]);
        float f7 = f5 - f2;
        float f8 = f5 + f2;
        float f3 = f1 + f6;
        float f4 = f1 - f6;
        paramArrayOffloat2[i5 - 1] = paramArrayOffloat3[paramInt3 + b1 - 2] * f7 - paramArrayOffloat3[paramInt3 + b1 - 1] * f3;
        paramArrayOffloat2[i5] = paramArrayOffloat3[paramInt3 + b1 - 2] * f3 + paramArrayOffloat3[paramInt3 + b1 - 1] * f7;
        paramArrayOffloat2[i6 - 1] = paramArrayOffloat4[paramInt4 + b1 - 2] * f8 - paramArrayOffloat4[paramInt4 + b1 - 1] * f4;
        paramArrayOffloat2[i6] = paramArrayOffloat4[paramInt4 + b1 - 2] * f4 + paramArrayOffloat4[paramInt4 + b1 - 1] * f8;
      } 
      j += paramInt1;
    } 
  }
  
  static void Dne(int paramInt1, float[] paramArrayOffloat1, float[] paramArrayOffloat2, float[] paramArrayOffloat3, int paramInt2, int[] paramArrayOfint) {
    int j = 0;
    int n = 0;
    int i2 = 0;
    int i3 = 0;
    int m = paramArrayOfint[1];
    int k = 0;
    int i = 1;
    int i1 = 1;
    for (byte b2 = 0; b2 < m; b2++) {
      byte b = 100;
      while (true) {
        int i4;
        int i5;
        switch (b) {
          case 100:
            n = paramArrayOfint[b2 + 2];
            j = n * i;
            i2 = paramInt1 / j;
            i3 = i2 * i;
            if (n != 4) {
              b = 103;
              continue;
            } 
            i4 = i1 + i2;
            i5 = i4 + i2;
            if (k) {
              FWm(i2, i, paramArrayOffloat2, paramArrayOffloat1, paramArrayOffloat3, paramInt2 + i1 - 1, paramArrayOffloat3, paramInt2 + i4 - 1, paramArrayOffloat3, paramInt2 + i5 - 1);
            } else {
              FWm(i2, i, paramArrayOffloat1, paramArrayOffloat2, paramArrayOffloat3, paramInt2 + i1 - 1, paramArrayOffloat3, paramInt2 + i4 - 1, paramArrayOffloat3, paramInt2 + i5 - 1);
            } 
            k = 1 - k;
            b = 115;
          case 103:
            if (n != 2) {
              b = 106;
              continue;
            } 
            if (k != 0) {
              FWm(i2, i, paramArrayOffloat2, paramArrayOffloat1, paramArrayOffloat3, paramInt2 + i1 - 1);
            } else {
              FWm(i2, i, paramArrayOffloat1, paramArrayOffloat2, paramArrayOffloat3, paramInt2 + i1 - 1);
            } 
            k = 1 - k;
            b = 115;
          case 106:
            if (n != 3) {
              b = 109;
              continue;
            } 
            i4 = i1 + i2;
            if (k != 0) {
              Dne(i2, i, paramArrayOffloat2, paramArrayOffloat1, paramArrayOffloat3, paramInt2 + i1 - 1, paramArrayOffloat3, paramInt2 + i4 - 1);
            } else {
              Dne(i2, i, paramArrayOffloat1, paramArrayOffloat2, paramArrayOffloat3, paramInt2 + i1 - 1, paramArrayOffloat3, paramInt2 + i4 - 1);
            } 
            k = 1 - k;
            b = 115;
          case 109:
            if (k != 0) {
              FWm(i2, n, i, i3, paramArrayOffloat2, paramArrayOffloat2, paramArrayOffloat2, paramArrayOffloat1, paramArrayOffloat1, paramArrayOffloat3, paramInt2 + i1 - 1);
            } else {
              FWm(i2, n, i, i3, paramArrayOffloat1, paramArrayOffloat1, paramArrayOffloat1, paramArrayOffloat2, paramArrayOffloat2, paramArrayOffloat3, paramInt2 + i1 - 1);
            } 
            if (i2 == 1)
              k = 1 - k; 
            break;
          case 115:
            break;
        } 
      } 
      i = j;
      i1 += (n - 1) * i2;
    } 
    if (k == 0)
      return; 
    for (byte b1 = 0; b1 < paramInt1; b1++)
      paramArrayOffloat1[b1] = paramArrayOffloat2[b1]; 
  }
  
  void Dne(float[] paramArrayOffloat) {
    if (this.Dne == 1)
      return; 
    Dne(this.Dne, paramArrayOffloat, this.Dne, this.Dne, this.Dne, this.Dne);
  }
  
  static void Dne(int paramInt1, int paramInt2, int paramInt3, int paramInt4, float[] paramArrayOffloat1, float[] paramArrayOffloat2, float[] paramArrayOffloat3, float[] paramArrayOffloat4, float[] paramArrayOffloat5, float[] paramArrayOffloat6, int paramInt5) {
    int k = 0;
    float f1 = 0.0F;
    float f3 = 0.0F;
    float f2 = Dne / paramInt2;
    f1 = (float)Math.cos(f2);
    f3 = (float)Math.sin(f2);
    int i = paramInt2 + 1 >> 1;
    int i2 = paramInt2;
    int i1 = paramInt1;
    int n = paramInt1 - 1 >> 1;
    int j = paramInt3 * paramInt1;
    int m = paramInt2 * paramInt1;
    char c = 'd';
    while (true) {
      byte b1;
      byte b2;
      byte b3;
      byte b4;
      byte b5;
      int i3;
      int i4;
      int i5;
      int i6;
      int i7;
      float f4;
      float f5;
      switch (c) {
        case 101:
          if (paramInt1 == 1) {
            c = 'w';
            continue;
          } 
          for (b5 = 0; b5 < paramInt4; b5++)
            paramArrayOffloat5[b5] = paramArrayOffloat3[b5]; 
          i4 = 0;
          for (b2 = 1; b2 < paramInt2; b2++) {
            i4 += j;
            k = i4;
            for (byte b = 0; b < paramInt3; b++) {
              paramArrayOffloat4[k] = paramArrayOffloat2[k];
              k += paramInt1;
            } 
          } 
          i3 = -paramInt1;
          i4 = 0;
          if (n > paramInt3) {
            for (b2 = 1; b2 < paramInt2; b2++) {
              i4 += j;
              i3 += paramInt1;
              k = -paramInt1 + i4;
              for (byte b = 0; b < paramInt3; b++) {
                int i8 = i3 - 1;
                k += paramInt1;
                int i9 = k;
                for (byte b6 = 2; b6 < paramInt1; b6 += 2) {
                  i8 += 2;
                  i9 += 2;
                  paramArrayOffloat4[i9 - 1] = paramArrayOffloat6[paramInt5 + i8 - 1] * paramArrayOffloat2[i9 - 1] + paramArrayOffloat6[paramInt5 + i8] * paramArrayOffloat2[i9];
                  paramArrayOffloat4[i9] = paramArrayOffloat6[paramInt5 + i8 - 1] * paramArrayOffloat2[i9] - paramArrayOffloat6[paramInt5 + i8] * paramArrayOffloat2[i9 - 1];
                } 
              } 
            } 
          } else {
            for (b2 = 1; b2 < paramInt2; b2++) {
              i3 += paramInt1;
              int i8 = i3 - 1;
              i4 += j;
              k = i4;
              for (byte b = 2; b < paramInt1; b += 2) {
                i8 += 2;
                k += 2;
                int i9 = k;
                for (byte b6 = 0; b6 < paramInt3; b6++) {
                  paramArrayOffloat4[i9 - 1] = paramArrayOffloat6[paramInt5 + i8 - 1] * paramArrayOffloat2[i9 - 1] + paramArrayOffloat6[paramInt5 + i8] * paramArrayOffloat2[i9];
                  paramArrayOffloat4[i9] = paramArrayOffloat6[paramInt5 + i8 - 1] * paramArrayOffloat2[i9] - paramArrayOffloat6[paramInt5 + i8] * paramArrayOffloat2[i9 - 1];
                  i9 += paramInt1;
                } 
              } 
            } 
          } 
          i4 = 0;
          k = i2 * j;
          if (n < paramInt3) {
            for (b2 = 1; b2 < i; b2++) {
              i4 += j;
              k -= j;
              int i8 = i4;
              int i9 = k;
              for (byte b = 2; b < paramInt1; b += 2) {
                i8 += 2;
                i9 += 2;
                int i10 = i8 - paramInt1;
                int i11 = i9 - paramInt1;
                for (byte b6 = 0; b6 < paramInt3; b6++) {
                  i10 += paramInt1;
                  i11 += paramInt1;
                  paramArrayOffloat2[i10 - 1] = paramArrayOffloat4[i10 - 1] + paramArrayOffloat4[i11 - 1];
                  paramArrayOffloat2[i11 - 1] = paramArrayOffloat4[i10] - paramArrayOffloat4[i11];
                  paramArrayOffloat2[i10] = paramArrayOffloat4[i10] + paramArrayOffloat4[i11];
                  paramArrayOffloat2[i11] = paramArrayOffloat4[i11 - 1] - paramArrayOffloat4[i10 - 1];
                } 
              } 
            } 
          } else {
            for (b2 = 1; b2 < i; b2++) {
              i4 += j;
              k -= j;
              int i8 = i4;
              int i9 = k;
              for (byte b = 0; b < paramInt3; b++) {
                int i10 = i8;
                int i11 = i9;
                for (byte b6 = 2; b6 < paramInt1; b6 += 2) {
                  i10 += 2;
                  i11 += 2;
                  paramArrayOffloat2[i10 - 1] = paramArrayOffloat4[i10 - 1] + paramArrayOffloat4[i11 - 1];
                  paramArrayOffloat2[i11 - 1] = paramArrayOffloat4[i10] - paramArrayOffloat4[i11];
                  paramArrayOffloat2[i10] = paramArrayOffloat4[i10] + paramArrayOffloat4[i11];
                  paramArrayOffloat2[i11] = paramArrayOffloat4[i11 - 1] - paramArrayOffloat4[i10 - 1];
                } 
                i8 += paramInt1;
                i9 += paramInt1;
              } 
            } 
          } 
        case 119:
          for (b5 = 0; b5 < paramInt4; b5++)
            paramArrayOffloat3[b5] = paramArrayOffloat5[b5]; 
          i4 = 0;
          k = i2 * paramInt4;
          for (b2 = 1; b2 < i; b2++) {
            i4 += j;
            k -= j;
            int i8 = i4 - paramInt1;
            int i9 = k - paramInt1;
            for (byte b = 0; b < paramInt3; b++) {
              i8 += paramInt1;
              i9 += paramInt1;
              paramArrayOffloat2[i8] = paramArrayOffloat4[i8] + paramArrayOffloat4[i9];
              paramArrayOffloat2[i9] = paramArrayOffloat4[i9] - paramArrayOffloat4[i8];
            } 
          } 
          f5 = 1.0F;
          f4 = 0.0F;
          i4 = 0;
          k = i2 * paramInt4;
          i5 = (paramInt2 - 1) * paramInt4;
          for (b4 = 1; b4 < i; b4++) {
            i4 += paramInt4;
            k -= paramInt4;
            float f10 = f1 * f5 - f3 * f4;
            f4 = f1 * f4 + f3 * f5;
            f5 = f10;
            int i8 = i4;
            int i9 = k;
            int i10 = i5;
            int i11 = paramInt4;
            for (b5 = 0; b5 < paramInt4; b5++) {
              paramArrayOffloat5[i8++] = paramArrayOffloat3[b5] + f5 * paramArrayOffloat3[i11++];
              paramArrayOffloat5[i9++] = f4 * paramArrayOffloat3[i10++];
            } 
            float f6 = f5;
            float f9 = f4;
            float f8 = f5;
            float f7 = f4;
            i8 = paramInt4;
            i9 = (i2 - 1) * paramInt4;
            for (b2 = 2; b2 < i; b2++) {
              i8 += paramInt4;
              i9 -= paramInt4;
              float f = f6 * f8 - f9 * f7;
              f7 = f6 * f7 + f9 * f8;
              f8 = f;
              i10 = i4;
              i11 = k;
              int i12 = i8;
              int i13 = i9;
              for (b5 = 0; b5 < paramInt4; b5++) {
                paramArrayOffloat5[i10++] = paramArrayOffloat5[i10++] + f8 * paramArrayOffloat3[i12++];
                paramArrayOffloat5[i11++] = paramArrayOffloat5[i11++] + f7 * paramArrayOffloat3[i13++];
              } 
            } 
          } 
          i4 = 0;
          for (b2 = 1; b2 < i; b2++) {
            i4 += paramInt4;
            k = i4;
            for (b5 = 0; b5 < paramInt4; b5++)
              paramArrayOffloat5[b5] = paramArrayOffloat5[b5] + paramArrayOffloat3[k++]; 
          } 
          if (paramInt1 < paramInt3) {
            c = '';
            continue;
          } 
          i4 = 0;
          k = 0;
          for (b3 = 0; b3 < paramInt3; b3++) {
            i5 = i4;
            int i8 = k;
            for (byte b = 0; b < paramInt1; b++)
              paramArrayOffloat1[i8++] = paramArrayOffloat4[i5++]; 
            i4 += paramInt1;
            k += m;
          } 
          c = '';
        case 132:
          for (b1 = 0; b1 < paramInt1; b1++) {
            i4 = b1;
            k = b1;
            for (b3 = 0; b3 < paramInt3; b3++) {
              paramArrayOffloat1[k] = paramArrayOffloat4[i4];
              i4 += paramInt1;
              k += m;
            } 
          } 
        case 135:
          i4 = 0;
          k = paramInt1 << 1;
          i5 = 0;
          i6 = i2 * j;
          for (b2 = 1; b2 < i; b2++) {
            i4 += k;
            i5 += j;
            i6 -= j;
            int i8 = i4;
            int i9 = i5;
            int i10 = i6;
            for (b3 = 0; b3 < paramInt3; b3++) {
              paramArrayOffloat1[i8 - 1] = paramArrayOffloat4[i9];
              paramArrayOffloat1[i8] = paramArrayOffloat4[i10];
              i8 += m;
              i9 += paramInt1;
              i10 += paramInt1;
            } 
          } 
          if (paramInt1 == 1)
            return; 
          if (n < paramInt3) {
            c = '';
            continue;
          } 
          i4 = -paramInt1;
          i5 = 0;
          i6 = 0;
          i7 = i2 * j;
          for (b2 = 1; b2 < i; b2++) {
            i4 += k;
            i5 += k;
            i6 += j;
            i7 -= j;
            int i8 = i4;
            int i9 = i5;
            int i10 = i6;
            int i11 = i7;
            for (b3 = 0; b3 < paramInt3; b3++) {
              for (b1 = 2; b1 < paramInt1; b1 += 2) {
                int i12 = i1 - b1;
                paramArrayOffloat1[b1 + i9 - 1] = paramArrayOffloat4[b1 + i10 - 1] + paramArrayOffloat4[b1 + i11 - 1];
                paramArrayOffloat1[i12 + i8 - 1] = paramArrayOffloat4[b1 + i10 - 1] - paramArrayOffloat4[b1 + i11 - 1];
                paramArrayOffloat1[b1 + i9] = paramArrayOffloat4[b1 + i10] + paramArrayOffloat4[b1 + i11];
                paramArrayOffloat1[i12 + i8] = paramArrayOffloat4[b1 + i11] - paramArrayOffloat4[b1 + i10];
              } 
              i8 += m;
              i9 += m;
              i10 += paramInt1;
              i11 += paramInt1;
            } 
          } 
          return;
        case 141:
          i4 = -paramInt1;
          i5 = 0;
          i6 = 0;
          i7 = i2 * j;
          for (b2 = 1; b2 < i; b2++) {
            i4 += k;
            i5 += k;
            i6 += j;
            i7 -= j;
            for (b1 = 2; b1 < paramInt1; b1 += 2) {
              int i8 = i1 + i4 - b1;
              int i9 = b1 + i5;
              int i10 = b1 + i6;
              int i11 = b1 + i7;
              for (b3 = 0; b3 < paramInt3; b3++) {
                paramArrayOffloat1[i9 - 1] = paramArrayOffloat4[i10 - 1] + paramArrayOffloat4[i11 - 1];
                paramArrayOffloat1[i8 - 1] = paramArrayOffloat4[i10 - 1] - paramArrayOffloat4[i11 - 1];
                paramArrayOffloat1[i9] = paramArrayOffloat4[i10] + paramArrayOffloat4[i11];
                paramArrayOffloat1[i8] = paramArrayOffloat4[i11] - paramArrayOffloat4[i10];
                i8 += m;
                i9 += m;
                i10 += paramInt1;
                i11 += paramInt1;
              } 
            } 
          } 
          return;
      } 
    } 
  }
  
  static void FWm(int paramInt1, int paramInt2, float[] paramArrayOffloat1, float[] paramArrayOffloat2, float[] paramArrayOffloat3, int paramInt3, float[] paramArrayOffloat4, int paramInt4, float[] paramArrayOffloat5, int paramInt5) {
    int i = paramInt2 * paramInt1;
    int j = 0;
    int k = paramInt1 << 2;
    int m = 0;
    int i1 = paramInt1 << 1;
    byte b;
    for (b = 0; b < paramInt2; b++) {
      int i2 = m + i1;
      int i3 = j;
      float f3 = paramArrayOffloat1[i2 - 1] + paramArrayOffloat1[i2 - 1];
      float f4 = paramArrayOffloat1[i2] + paramArrayOffloat1[i2];
      float f1 = paramArrayOffloat1[m] - paramArrayOffloat1[(i2 += i1) - 1];
      float f2 = paramArrayOffloat1[m] + paramArrayOffloat1[i2 - 1];
      paramArrayOffloat2[i3] = f2 + f3;
      paramArrayOffloat2[i3 += i] = f1 - f4;
      paramArrayOffloat2[i3 += i] = f2 - f3;
      paramArrayOffloat2[i3 += i] = f1 + f4;
      j += paramInt1;
      m += k;
    } 
    if (paramInt1 < 2)
      return; 
    if (paramInt1 != 2) {
      j = 0;
      for (b = 0; b < paramInt2; b++) {
        int i2;
        int i3 = (i2 = m = (k = j << 2) + i1) + i1;
        int i4 = j;
        for (byte b1 = 2; b1 < paramInt1; b1 += 2) {
          k += 2;
          m += 2;
          i2 -= 2;
          i3 -= 2;
          i4 += 2;
          float f7 = paramArrayOffloat1[k] + paramArrayOffloat1[i3];
          float f8 = paramArrayOffloat1[k] - paramArrayOffloat1[i3];
          float f9 = paramArrayOffloat1[m] - paramArrayOffloat1[i2];
          float f14 = paramArrayOffloat1[m] + paramArrayOffloat1[i2];
          float f11 = paramArrayOffloat1[k - 1] - paramArrayOffloat1[i3 - 1];
          float f12 = paramArrayOffloat1[k - 1] + paramArrayOffloat1[i3 - 1];
          float f10 = paramArrayOffloat1[m - 1] - paramArrayOffloat1[i2 - 1];
          float f13 = paramArrayOffloat1[m - 1] + paramArrayOffloat1[i2 - 1];
          paramArrayOffloat2[i4 - 1] = f12 + f13;
          float f5 = f12 - f13;
          paramArrayOffloat2[i4] = f8 + f9;
          float f2 = f8 - f9;
          float f4 = f11 - f14;
          float f6 = f11 + f14;
          float f1 = f7 + f10;
          float f3 = f7 - f10;
          int i5;
          paramArrayOffloat2[(i5 = i4 + i) - 1] = paramArrayOffloat3[paramInt3 + b1 - 2] * f4 - paramArrayOffloat3[paramInt3 + b1 - 1] * f1;
          paramArrayOffloat2[i5] = paramArrayOffloat3[paramInt3 + b1 - 2] * f1 + paramArrayOffloat3[paramInt3 + b1 - 1] * f4;
          paramArrayOffloat2[(i5 += i) - 1] = paramArrayOffloat4[paramInt4 + b1 - 2] * f5 - paramArrayOffloat4[paramInt4 + b1 - 1] * f2;
          paramArrayOffloat2[i5] = paramArrayOffloat4[paramInt4 + b1 - 2] * f2 + paramArrayOffloat4[paramInt4 + b1 - 1] * f5;
          paramArrayOffloat2[(i5 += i) - 1] = paramArrayOffloat5[paramInt5 + b1 - 2] * f6 - paramArrayOffloat5[paramInt5 + b1 - 1] * f3;
          paramArrayOffloat2[i5] = paramArrayOffloat5[paramInt5 + b1 - 2] * f3 + paramArrayOffloat5[paramInt5 + b1 - 1] * f6;
        } 
        j += paramInt1;
      } 
      if (paramInt1 % 2 == 1)
        return; 
    } 
    j = paramInt1;
    k = paramInt1 << 2;
    m = paramInt1 - 1;
    int n = paramInt1 + (paramInt1 << 1);
    for (b = 0; b < paramInt2; b++) {
      int i2 = m;
      float f1 = paramArrayOffloat1[j] + paramArrayOffloat1[n];
      float f2 = paramArrayOffloat1[n] - paramArrayOffloat1[j];
      float f3 = paramArrayOffloat1[j - 1] - paramArrayOffloat1[n - 1];
      float f4 = paramArrayOffloat1[j - 1] + paramArrayOffloat1[n - 1];
      paramArrayOffloat2[i2] = f4 + f4;
      paramArrayOffloat2[i2 += i] = aFZ * (f3 - f1);
      paramArrayOffloat2[i2 += i] = f2 + f2;
      paramArrayOffloat2[i2 += i] = -aFZ * (f3 + f1);
      m += paramInt1;
      j += k;
      n += k;
    } 
  }
  
  static void Dne(int paramInt1, int paramInt2, float[] paramArrayOffloat1, float[] paramArrayOffloat2, float[] paramArrayOffloat3, int paramInt3) {
    int j = 0;
    int k = paramInt2 * paramInt1;
    int i = k;
    int m = paramInt1 << 1;
    byte b;
    for (b = 0; b < paramInt2; b++) {
      paramArrayOffloat2[j << 1] = paramArrayOffloat1[j] + paramArrayOffloat1[k];
      paramArrayOffloat2[(j << 1) + m - 1] = paramArrayOffloat1[j] - paramArrayOffloat1[k];
      j += paramInt1;
      k += paramInt1;
    } 
    if (paramInt1 < 2)
      return; 
    if (paramInt1 != 2) {
      j = 0;
      k = i;
      for (b = 0; b < paramInt2; b++) {
        m = k;
        int n = (j << 1) + (paramInt1 << 1);
        int i1 = j;
        int i2 = j + j;
        for (byte b1 = 2; b1 < paramInt1; b1 += 2) {
          m += 2;
          n -= 2;
          i1 += 2;
          i2 += 2;
          float f2 = paramArrayOffloat3[paramInt3 + b1 - 2] * paramArrayOffloat1[m - 1] + paramArrayOffloat3[paramInt3 + b1 - 1] * paramArrayOffloat1[m];
          float f1 = paramArrayOffloat3[paramInt3 + b1 - 2] * paramArrayOffloat1[m] - paramArrayOffloat3[paramInt3 + b1 - 1] * paramArrayOffloat1[m - 1];
          paramArrayOffloat2[i2] = paramArrayOffloat1[i1] + f1;
          paramArrayOffloat2[n] = f1 - paramArrayOffloat1[i1];
          paramArrayOffloat2[i2 - 1] = paramArrayOffloat1[i1 - 1] + f2;
          paramArrayOffloat2[n - 1] = paramArrayOffloat1[i1 - 1] - f2;
        } 
        j += paramInt1;
        k += paramInt1;
      } 
      if (paramInt1 % 2 == 1)
        return; 
    } 
    m = k = (j = paramInt1) - 1;
    k += i;
    for (b = 0; b < paramInt2; b++) {
      paramArrayOffloat2[j] = -paramArrayOffloat1[k];
      paramArrayOffloat2[j - 1] = paramArrayOffloat1[m];
      j += paramInt1 << 1;
      k += paramInt1;
      m += paramInt1;
    } 
  }
  
  void Dne(int paramInt) {
    this.Dne = paramInt;
    this.Dne = new float[3 * paramInt];
    this.Dne = new int[32];
    Dne(paramInt, this.Dne, this.Dne);
  }
  
  static void Dne(int paramInt1, int paramInt2, float[] paramArrayOffloat1, float[] paramArrayOffloat2, float[] paramArrayOffloat3, int paramInt3, float[] paramArrayOffloat4, int paramInt4, float[] paramArrayOffloat5, int paramInt5) {
    int i = paramInt2 * paramInt1;
    int j = i;
    int n = j << 1;
    int k = j + (j << 1);
    int m = 0;
    byte b;
    for (b = 0; b < paramInt2; b++) {
      float f1 = paramArrayOffloat1[j] + paramArrayOffloat1[k];
      float f2 = paramArrayOffloat1[m] + paramArrayOffloat1[n];
      int i3;
      paramArrayOffloat2[i3 = m << 2] = f1 + f2;
      paramArrayOffloat2[(paramInt1 << 2) + i3 - 1] = f2 - f1;
      paramArrayOffloat2[(i3 += paramInt1 << 1) - 1] = paramArrayOffloat1[m] - paramArrayOffloat1[n];
      paramArrayOffloat2[i3] = paramArrayOffloat1[k] - paramArrayOffloat1[j];
      j += paramInt1;
      k += paramInt1;
      m += paramInt1;
      n += paramInt1;
    } 
    if (paramInt1 < 2)
      return; 
    if (paramInt1 != 2) {
      j = 0;
      for (b = 0; b < paramInt2; b++) {
        k = j;
        n = j << 2;
        int i4;
        int i3 = (i4 = paramInt1 << 1) + n;
        for (byte b1 = 2; b1 < paramInt1; b1 += 2) {
          k += 2;
          m = k;
          n += 2;
          i3 -= 2;
          m += i;
          float f4 = paramArrayOffloat3[paramInt3 + b1 - 2] * paramArrayOffloat1[m - 1] + paramArrayOffloat3[paramInt3 + b1 - 1] * paramArrayOffloat1[m];
          float f1 = paramArrayOffloat3[paramInt3 + b1 - 2] * paramArrayOffloat1[m] - paramArrayOffloat3[paramInt3 + b1 - 1] * paramArrayOffloat1[m - 1];
          m += i;
          float f5 = paramArrayOffloat4[paramInt4 + b1 - 2] * paramArrayOffloat1[m - 1] + paramArrayOffloat4[paramInt4 + b1 - 1] * paramArrayOffloat1[m];
          float f2 = paramArrayOffloat4[paramInt4 + b1 - 2] * paramArrayOffloat1[m] - paramArrayOffloat4[paramInt4 + b1 - 1] * paramArrayOffloat1[m - 1];
          m += i;
          float f6 = paramArrayOffloat5[paramInt5 + b1 - 2] * paramArrayOffloat1[m - 1] + paramArrayOffloat5[paramInt5 + b1 - 1] * paramArrayOffloat1[m];
          float f3 = paramArrayOffloat5[paramInt5 + b1 - 2] * paramArrayOffloat1[m] - paramArrayOffloat5[paramInt5 + b1 - 1] * paramArrayOffloat1[m - 1];
          float f11 = f4 + f6;
          float f14 = f6 - f4;
          float f7 = f1 + f3;
          float f10 = f1 - f3;
          float f8 = paramArrayOffloat1[k] + f2;
          float f9 = paramArrayOffloat1[k] - f2;
          float f12 = paramArrayOffloat1[k - 1] + f5;
          float f13 = paramArrayOffloat1[k - 1] - f5;
          paramArrayOffloat2[n - 1] = f11 + f12;
          paramArrayOffloat2[n] = f7 + f8;
          paramArrayOffloat2[i3 - 1] = f13 - f10;
          paramArrayOffloat2[i3] = f14 - f9;
          paramArrayOffloat2[n + i4 - 1] = f10 + f13;
          paramArrayOffloat2[n + i4] = f14 + f9;
          paramArrayOffloat2[i3 + i4 - 1] = f12 - f11;
          paramArrayOffloat2[i3 + i4] = f7 - f8;
        } 
        j += paramInt1;
      } 
      if ((paramInt1 & 0x1) != 0)
        return; 
    } 
    k = (j = i + paramInt1 - 1) + (i << 1);
    m = paramInt1 << 2;
    n = paramInt1;
    int i1 = paramInt1 << 1;
    int i2 = paramInt1;
    for (b = 0; b < paramInt2; b++) {
      float f1 = -FWm * (paramArrayOffloat1[j] + paramArrayOffloat1[k]);
      float f2 = FWm * (paramArrayOffloat1[j] - paramArrayOffloat1[k]);
      paramArrayOffloat2[n - 1] = f2 + paramArrayOffloat1[i2 - 1];
      paramArrayOffloat2[n + i1 - 1] = paramArrayOffloat1[i2 - 1] - f2;
      paramArrayOffloat2[n] = f1 - paramArrayOffloat1[j + i];
      paramArrayOffloat2[n + i1] = f1 + paramArrayOffloat1[j + i];
      j += paramInt1;
      k += paramInt1;
      n += m;
      i2 += paramInt1;
    } 
  }
  
  void Dne() {
    if (this.Dne != null)
      this.Dne = null; 
    if (this.Dne != null)
      this.Dne = null; 
  }
  
  static void Dne(int paramInt, float[] paramArrayOffloat, int[] paramArrayOfint) {
    if (paramInt == 1)
      return; 
    Dne(paramInt, paramArrayOffloat, paramInt, paramArrayOfint);
  }
  
  static void Dne(int paramInt, float[] paramArrayOffloat1, float[] paramArrayOffloat2, float[] paramArrayOffloat3, int[] paramArrayOfint) {
    int k = paramArrayOfint[1];
    int j = 1;
    int i = paramInt;
    int m = paramInt;
    for (byte b2 = 0; b2 < k; b2++) {
      int i1 = k - b2;
      int i2 = paramArrayOfint[i1 + 1];
      int n = i / i2;
      int i3 = paramInt / i;
      int i4 = i3 * n;
      m -= (i2 - 1) * i3;
      j = 1 - j;
      byte b = 100;
      while (true) {
        int i5;
        int i6;
        switch (b) {
          case 100:
            if (i2 != 4) {
              b = 102;
              continue;
            } 
            i5 = m + i3;
            i6 = i5 + i3;
            if (j != 0) {
              Dne(i3, n, paramArrayOffloat2, paramArrayOffloat1, paramArrayOffloat3, m - 1, paramArrayOffloat3, i5 - 1, paramArrayOffloat3, i6 - 1);
            } else {
              Dne(i3, n, paramArrayOffloat1, paramArrayOffloat2, paramArrayOffloat3, m - 1, paramArrayOffloat3, i5 - 1, paramArrayOffloat3, i6 - 1);
            } 
            b = 110;
          case 102:
            if (i2 != 2) {
              b = 104;
              continue;
            } 
            if (j != 0) {
              b = 103;
              continue;
            } 
            Dne(i3, n, paramArrayOffloat1, paramArrayOffloat2, paramArrayOffloat3, m - 1);
            b = 110;
          case 103:
            Dne(i3, n, paramArrayOffloat2, paramArrayOffloat1, paramArrayOffloat3, m - 1);
          case 104:
            if (i3 == 1)
              j = 1 - j; 
            if (j != 0) {
              b = 109;
              continue;
            } 
            Dne(i3, i2, n, i4, paramArrayOffloat1, paramArrayOffloat1, paramArrayOffloat1, paramArrayOffloat2, paramArrayOffloat2, paramArrayOffloat3, m - 1);
            j = 1;
            b = 110;
          case 109:
            Dne(i3, i2, n, i4, paramArrayOffloat2, paramArrayOffloat2, paramArrayOffloat2, paramArrayOffloat1, paramArrayOffloat1, paramArrayOffloat3, m - 1);
            j = 0;
            break;
          case 110:
            break;
        } 
      } 
      i = n;
    } 
    if (j == 1)
      return; 
    for (byte b1 = 0; b1 < paramInt; b1++)
      paramArrayOffloat1[b1] = paramArrayOffloat2[b1]; 
  }
  
  static void FWm(int paramInt1, int paramInt2, int paramInt3, int paramInt4, float[] paramArrayOffloat1, float[] paramArrayOffloat2, float[] paramArrayOffloat3, float[] paramArrayOffloat4, float[] paramArrayOffloat5, float[] paramArrayOffloat6, int paramInt5) {
    int i = 0;
    int j = 0;
    int k = 0;
    int m = 0;
    float f1 = 0.0F;
    float f2 = 0.0F;
    int n = 0;
    char c = 'd';
    while (true) {
      byte b1;
      byte b2;
      byte b3;
      byte b4;
      byte b5;
      int i1;
      int i2;
      int i3;
      int i4;
      int i5;
      int i6;
      int i7;
      float f3;
      float f4;
      float f5;
      switch (c) {
        case 100:
          k = paramInt2 * paramInt1;
          j = paramInt3 * paramInt1;
          f5 = Dne / paramInt2;
          f1 = (float)Math.cos(f5);
          f2 = (float)Math.sin(f5);
          m = paramInt1 - 1 >>> 1;
          n = paramInt2;
          i = paramInt2 + 1 >>> 1;
          if (paramInt1 < paramInt3) {
            c = 'g';
            continue;
          } 
          i2 = 0;
          i3 = 0;
          for (b3 = 0; b3 < paramInt3; b3++) {
            int i8 = i2;
            int i9 = i3;
            for (byte b = 0; b < paramInt1; b++) {
              paramArrayOffloat4[i8] = paramArrayOffloat1[i9];
              i8++;
              i9++;
            } 
            i2 += paramInt1;
            i3 += k;
          } 
          c = 'j';
        case 103:
          i2 = 0;
          for (b1 = 0; b1 < paramInt1; b1++) {
            i3 = i2;
            int i8 = i2;
            for (b3 = 0; b3 < paramInt3; b3++) {
              paramArrayOffloat4[i3] = paramArrayOffloat1[i8];
              i3 += paramInt1;
              i8 += k;
            } 
            i2++;
          } 
        case 106:
          i2 = 0;
          i3 = n * j;
          i6 = i5 = paramInt1 << 1;
          for (b2 = 1; b2 < i; b2++) {
            i2 += j;
            i3 -= j;
            int i8 = i2;
            int i9 = i3;
            int i10 = i5;
            for (b3 = 0; b3 < paramInt3; b3++) {
              paramArrayOffloat4[i8] = paramArrayOffloat1[i10 - 1] + paramArrayOffloat1[i10 - 1];
              paramArrayOffloat4[i9] = paramArrayOffloat1[i10] + paramArrayOffloat1[i10];
              i8 += paramInt1;
              i9 += paramInt1;
              i10 += k;
            } 
            i5 += i6;
          } 
          if (paramInt1 == 1) {
            c = 't';
            continue;
          } 
          if (m < paramInt3) {
            c = 'p';
            continue;
          } 
          i2 = 0;
          i3 = n * j;
          i6 = 0;
          for (b2 = 1; b2 < i; b2++) {
            i2 += j;
            i3 -= j;
            int i8 = i2;
            int i9 = i3;
            i6 += paramInt1 << 1;
            int i10 = i6;
            for (b3 = 0; b3 < paramInt3; b3++) {
              i5 = i8;
              int i11 = i9;
              int i12 = i10;
              int i13 = i10;
              for (b1 = 2; b1 < paramInt1; b1 += 2) {
                i5 += 2;
                i11 += 2;
                i12 += 2;
                i13 -= 2;
                paramArrayOffloat4[i5 - 1] = paramArrayOffloat1[i12 - 1] + paramArrayOffloat1[i13 - 1];
                paramArrayOffloat4[i11 - 1] = paramArrayOffloat1[i12 - 1] - paramArrayOffloat1[i13 - 1];
                paramArrayOffloat4[i5] = paramArrayOffloat1[i12] - paramArrayOffloat1[i13];
                paramArrayOffloat4[i11] = paramArrayOffloat1[i12] + paramArrayOffloat1[i13];
              } 
              i8 += paramInt1;
              i9 += paramInt1;
              i10 += k;
            } 
          } 
          c = 't';
        case 112:
          i2 = 0;
          i3 = n * j;
          i6 = 0;
          for (b2 = 1; b2 < i; b2++) {
            i2 += j;
            i3 -= j;
            int i8 = i2;
            int i9 = i3;
            i6 += paramInt1 << 1;
            int i10 = i6;
            int i11 = i6;
            for (b1 = 2; b1 < paramInt1; b1 += 2) {
              i8 += 2;
              i9 += 2;
              i10 += 2;
              i11 -= 2;
              i5 = i8;
              int i12 = i9;
              int i13 = i10;
              int i14 = i11;
              for (b3 = 0; b3 < paramInt3; b3++) {
                paramArrayOffloat4[i5 - 1] = paramArrayOffloat1[i13 - 1] + paramArrayOffloat1[i14 - 1];
                paramArrayOffloat4[i12 - 1] = paramArrayOffloat1[i13 - 1] - paramArrayOffloat1[i14 - 1];
                paramArrayOffloat4[i5] = paramArrayOffloat1[i13] - paramArrayOffloat1[i14];
                paramArrayOffloat4[i12] = paramArrayOffloat1[i13] + paramArrayOffloat1[i14];
                i5 += paramInt1;
                i12 += paramInt1;
                i13 += k;
                i14 += k;
              } 
            } 
          } 
        case 116:
          f4 = 1.0F;
          f3 = 0.0F;
          i2 = 0;
          i7 = i3 = n * paramInt4;
          i4 = (paramInt2 - 1) * paramInt4;
          for (b4 = 1; b4 < i; b4++) {
            i2 += paramInt4;
            i3 -= paramInt4;
            float f10 = f1 * f4 - f2 * f3;
            f3 = f1 * f3 + f2 * f4;
            f4 = f10;
            int i8 = i2;
            i5 = i3;
            int i9 = 0;
            i6 = paramInt4;
            int i10 = i4;
            byte b;
            for (b = 0; b < paramInt4; b++) {
              paramArrayOffloat3[i8++] = paramArrayOffloat5[i9++] + f4 * paramArrayOffloat5[i6++];
              paramArrayOffloat3[i5++] = f3 * paramArrayOffloat5[i10++];
            } 
            float f6 = f4;
            float f9 = f3;
            float f8 = f4;
            float f7 = f3;
            i9 = paramInt4;
            i6 = i7 - paramInt4;
            for (b2 = 2; b2 < i; b2++) {
              i9 += paramInt4;
              i6 -= paramInt4;
              float f = f6 * f8 - f9 * f7;
              f7 = f6 * f7 + f9 * f8;
              f8 = f;
              i8 = i2;
              i5 = i3;
              int i11 = i9;
              int i12 = i6;
              for (b = 0; b < paramInt4; b++) {
                paramArrayOffloat3[i8++] = paramArrayOffloat3[i8++] + f8 * paramArrayOffloat5[i11++];
                paramArrayOffloat3[i5++] = paramArrayOffloat3[i5++] + f7 * paramArrayOffloat5[i12++];
              } 
            } 
          } 
          i2 = 0;
          for (b2 = 1; b2 < i; b2++) {
            i2 += paramInt4;
            i3 = i2;
            for (byte b = 0; b < paramInt4; b++)
              paramArrayOffloat5[b] = paramArrayOffloat5[b] + paramArrayOffloat5[i3++]; 
          } 
          i2 = 0;
          i3 = n * j;
          for (b2 = 1; b2 < i; b2++) {
            i2 += j;
            i3 -= j;
            i4 = i2;
            int i8 = i3;
            for (b3 = 0; b3 < paramInt3; b3++) {
              paramArrayOffloat4[i4] = paramArrayOffloat2[i4] - paramArrayOffloat2[i8];
              paramArrayOffloat4[i8] = paramArrayOffloat2[i4] + paramArrayOffloat2[i8];
              i4 += paramInt1;
              i8 += paramInt1;
            } 
          } 
          if (paramInt1 == 1) {
            c = '';
            continue;
          } 
          if (m < paramInt3) {
            c = '';
            continue;
          } 
          i2 = 0;
          i3 = n * j;
          for (b2 = 1; b2 < i; b2++) {
            i2 += j;
            i3 -= j;
            i4 = i2;
            int i8 = i3;
            for (b3 = 0; b3 < paramInt3; b3++) {
              i5 = i4;
              int i9 = i8;
              for (b1 = 2; b1 < paramInt1; b1 += 2) {
                i5 += 2;
                i9 += 2;
                paramArrayOffloat4[i5 - 1] = paramArrayOffloat2[i5 - 1] - paramArrayOffloat2[i9];
                paramArrayOffloat4[i9 - 1] = paramArrayOffloat2[i5 - 1] + paramArrayOffloat2[i9];
                paramArrayOffloat4[i5] = paramArrayOffloat2[i5] + paramArrayOffloat2[i9 - 1];
                paramArrayOffloat4[i9] = paramArrayOffloat2[i5] - paramArrayOffloat2[i9 - 1];
              } 
              i4 += paramInt1;
              i8 += paramInt1;
            } 
          } 
          c = '';
        case 128:
          i2 = 0;
          i3 = n * j;
          for (b2 = 1; b2 < i; b2++) {
            i2 += j;
            i3 -= j;
            i4 = i2;
            int i8 = i3;
            for (b1 = 2; b1 < paramInt1; b1 += 2) {
              i4 += 2;
              i8 += 2;
              i5 = i4;
              int i9 = i8;
              for (b3 = 0; b3 < paramInt3; b3++) {
                paramArrayOffloat4[i5 - 1] = paramArrayOffloat2[i5 - 1] - paramArrayOffloat2[i9];
                paramArrayOffloat4[i9 - 1] = paramArrayOffloat2[i5 - 1] + paramArrayOffloat2[i9];
                paramArrayOffloat4[i5] = paramArrayOffloat2[i5] + paramArrayOffloat2[i9 - 1];
                paramArrayOffloat4[i9] = paramArrayOffloat2[i5] - paramArrayOffloat2[i9 - 1];
                i5 += paramInt1;
                i9 += paramInt1;
              } 
            } 
          } 
        case 132:
          if (paramInt1 == 1)
            return; 
          for (b5 = 0; b5 < paramInt4; b5++)
            paramArrayOffloat3[b5] = paramArrayOffloat5[b5]; 
          i2 = 0;
          for (b2 = 1; b2 < paramInt2; b2++) {
            i3 = i2 += j;
            for (b3 = 0; b3 < paramInt3; b3++) {
              paramArrayOffloat2[i3] = paramArrayOffloat4[i3];
              i3 += paramInt1;
            } 
          } 
          if (m > paramInt3) {
            c = '';
            continue;
          } 
          i1 = -paramInt1 - 1;
          i2 = 0;
          for (b2 = 1; b2 < paramInt2; b2++) {
            i1 += paramInt1;
            i2 += j;
            int i8 = i1;
            i3 = i2;
            for (b1 = 2; b1 < paramInt1; b1 += 2) {
              i3 += 2;
              i8 += 2;
              i4 = i3;
              for (b3 = 0; b3 < paramInt3; b3++) {
                paramArrayOffloat2[i4 - 1] = paramArrayOffloat6[paramInt5 + i8 - 1] * paramArrayOffloat4[i4 - 1] - paramArrayOffloat6[paramInt5 + i8] * paramArrayOffloat4[i4];
                paramArrayOffloat2[i4] = paramArrayOffloat6[paramInt5 + i8 - 1] * paramArrayOffloat4[i4] + paramArrayOffloat6[paramInt5 + i8] * paramArrayOffloat4[i4 - 1];
                i4 += paramInt1;
              } 
            } 
          } 
          return;
        case 139:
          i1 = -paramInt1 - 1;
          i2 = 0;
          for (b2 = 1; b2 < paramInt2; b2++) {
            i1 += paramInt1;
            i2 += j;
            i3 = i2;
            for (b3 = 0; b3 < paramInt3; b3++) {
              int i8 = i1;
              i4 = i3;
              for (b1 = 2; b1 < paramInt1; b1 += 2) {
                i8 += 2;
                i4 += 2;
                paramArrayOffloat2[i4 - 1] = paramArrayOffloat6[paramInt5 + i8 - 1] * paramArrayOffloat4[i4 - 1] - paramArrayOffloat6[paramInt5 + i8] * paramArrayOffloat4[i4];
                paramArrayOffloat2[i4] = paramArrayOffloat6[paramInt5 + i8 - 1] * paramArrayOffloat4[i4] + paramArrayOffloat6[paramInt5 + i8] * paramArrayOffloat4[i4 - 1];
              } 
              i3 += paramInt1;
            } 
          } 
          return;
      } 
    } 
  }
  
  static {
    FWm = 0.70710677F;
    bzF = 0.8660254F;
    Qnq = -0.5F;
    aFZ = 1.4142135F;
  }
  
  static void Dne(int paramInt1, float[] paramArrayOffloat, int paramInt2, int[] paramArrayOfint) {
    int i = 0;
    byte b = -1;
    int j = paramInt1;
    byte b1 = 0;
    byte b2 = 101;
    while (true) {
      float f;
      int k;
      byte b3;
      int m;
      int n;
      int i1;
      int i2;
      int i3;
      switch (b2) {
        case 101:
          if (++b < 4) {
            i = FWm[b];
          } else {
            i += 2;
          } 
        case 104:
          i1 = j / i;
          i2 = j - i * i1;
          if (i2 != 0) {
            b2 = 101;
            continue;
          } 
          paramArrayOfint[++b1 + 1] = i;
          j = i1;
          if (i != 2) {
            b2 = 107;
            continue;
          } 
          if (b1 == 1) {
            b2 = 107;
            continue;
          } 
          for (k = 1; k < b1; k++) {
            int i4 = b1 - k + 1;
            paramArrayOfint[i4 + 1] = paramArrayOfint[i4];
          } 
          paramArrayOfint[2] = 2;
        case 107:
          if (j != 1) {
            b2 = 104;
            continue;
          } 
          paramArrayOfint[0] = paramInt1;
          paramArrayOfint[1] = b1;
          f = Dne / paramInt1;
          n = 0;
          i3 = b1 - 1;
          m = 1;
          if (i3 == 0)
            return; 
          for (b3 = 0; b3 < i3; b3++) {
            int i6 = paramArrayOfint[b3 + 2];
            int i5 = 0;
            int i4 = m * i6;
            int i7 = paramInt1 / i4;
            int i8 = i6 - 1;
            for (b = 0; b < i8; b++) {
              i5 += m;
              k = n;
              float f1 = i5 * f;
              float f2 = 0.0F;
              for (byte b4 = 2; b4 < i7; b4 += 2) {
                f2++;
                float f3 = f2 * f1;
                paramArrayOffloat[paramInt2 + k++] = (float)Math.cos(f3);
                paramArrayOffloat[paramInt2 + k++] = (float)Math.sin(f3);
              } 
              n += i7;
            } 
            m = i4;
          } 
          return;
      } 
    } 
  }
  
  static void FWm(int paramInt1, int paramInt2, float[] paramArrayOffloat1, float[] paramArrayOffloat2, float[] paramArrayOffloat3, int paramInt3) {
    int i = paramInt2 * paramInt1;
    int j = 0;
    int k = 0;
    int m = (paramInt1 << 1) - 1;
    byte b;
    for (b = 0; b < paramInt2; b++) {
      paramArrayOffloat2[j] = paramArrayOffloat1[k] + paramArrayOffloat1[m + k];
      paramArrayOffloat2[j + i] = paramArrayOffloat1[k] - paramArrayOffloat1[m + k];
      k = (j += paramInt1) << 1;
    } 
    if (paramInt1 < 2)
      return; 
    if (paramInt1 != 2) {
      j = 0;
      k = 0;
      for (b = 0; b < paramInt2; b++) {
        m = j;
        int n;
        int i1 = (n = k) + (paramInt1 << 1);
        int i2 = i + j;
        for (byte b1 = 2; b1 < paramInt1; b1 += 2) {
          m += 2;
          n += 2;
          i1 -= 2;
          i2 += 2;
          paramArrayOffloat2[m - 1] = paramArrayOffloat1[n - 1] + paramArrayOffloat1[i1 - 1];
          float f2 = paramArrayOffloat1[n - 1] - paramArrayOffloat1[i1 - 1];
          paramArrayOffloat2[m] = paramArrayOffloat1[n] - paramArrayOffloat1[i1];
          float f1 = paramArrayOffloat1[n] + paramArrayOffloat1[i1];
          paramArrayOffloat2[i2 - 1] = paramArrayOffloat3[paramInt3 + b1 - 2] * f2 - paramArrayOffloat3[paramInt3 + b1 - 1] * f1;
          paramArrayOffloat2[i2] = paramArrayOffloat3[paramInt3 + b1 - 2] * f1 + paramArrayOffloat3[paramInt3 + b1 - 1] * f2;
        } 
        k = (j += paramInt1) << 1;
      } 
      if (paramInt1 % 2 == 1)
        return; 
    } 
    j = paramInt1 - 1;
    k = paramInt1 - 1;
    for (b = 0; b < paramInt2; b++) {
      paramArrayOffloat2[j] = paramArrayOffloat1[k] + paramArrayOffloat1[k];
      paramArrayOffloat2[j + i] = -(paramArrayOffloat1[k + 1] + paramArrayOffloat1[k + 1]);
      j += paramInt1;
      k += paramInt1 << 1;
    } 
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\frg.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */