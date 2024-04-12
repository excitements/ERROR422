import java.io.FileInputStream;
import java.io.InputStream;

class tpx {
  static int Dne = ' ';
  
  static byte[] Dne = new byte[Dne];
  
  public static void Dne(String[] paramArrayOfString) {
    InputStream inputStream = System.in;
    if (paramArrayOfString.length > 0)
      try {
        inputStream = new FileInputStream(paramArrayOfString[0]);
      } catch (Exception exception) {
        System.err.println(exception);
      }  
    ytS ytS = new ytS();
    tYH tYH = new tYH();
    aHQ aHQ = new aHQ();
    qlF qlF = new qlF();
    Lth lth = new Lth();
    PRc pRc = new PRc();
    AOl aOl = new AOl();
    MOU mOU = new MOU(aOl);
    int i = 0;
    ytS.Dne();
    while (true) {
      boolean bool = false;
      int j = ytS.Dne(4096);
      byte[] arrayOfByte = ytS.Dne;
      try {
        i = inputStream.read(arrayOfByte, j, 4096);
      } catch (Exception exception) {
        System.err.println(exception);
        System.exit(-1);
      } 
      ytS.FWm(i);
      if (ytS.FWm(aHQ) != 1) {
        if (i < 4096) {
          ytS.Dne();
          System.err.println("Done.");
          return;
        } 
        System.err.println("Input does not appear to be an Ogg bitstream.");
        System.exit(1);
      } 
      tYH.Dne(aHQ.aFZ());
      lth.Dne();
      pRc.Dne();
      if (tYH.Dne(aHQ) < 0) {
        System.err.println("Error reading first page of Ogg bitstream data.");
        System.exit(1);
      } 
      if (tYH.FWm(qlF) != 1) {
        System.err.println("Error reading initial header packet.");
        System.exit(1);
      } 
      if (lth.Dne(pRc, qlF) < 0) {
        System.err.println("This Ogg bitstream does not contain Vorbis audio data.");
        System.exit(1);
      } 
      byte b1 = 0;
      while (b1 < 2) {
        while (b1 < 2) {
          int k = ytS.FWm(aHQ);
          if (k == 0)
            break; 
          if (k == 1) {
            tYH.Dne(aHQ);
            while (b1 < 2) {
              k = tYH.FWm(qlF);
              if (k == 0)
                break; 
              if (k == -1) {
                System.err.println("Corrupt secondary header.  Exiting.");
                System.exit(1);
              } 
              lth.Dne(pRc, qlF);
              b1++;
            } 
          } 
        } 
        j = ytS.Dne(4096);
        arrayOfByte = ytS.Dne;
        try {
          i = inputStream.read(arrayOfByte, j, 4096);
        } catch (Exception exception) {
          System.err.println(exception);
          System.exit(1);
        } 
        if (i == 0 && b1 < 2) {
          System.err.println("End of file before finding all Vorbis headers!");
          System.exit(1);
        } 
        ytS.FWm(i);
      } 
      byte[][] arrayOfByte1 = pRc.Dne;
      for (byte b2 = 0; b2 < arrayOfByte1.length && arrayOfByte1[b2] != null; b2++)
        System.err.println(new String(arrayOfByte1[b2], 0, (arrayOfByte1[b2]).length - 1)); 
      System.err.println("\nBitstream is " + lth.FWm + " channel, " + lth.bzF + "Hz");
      System.err.println("Encoded by: " + new String((byte[])pRc.Dne, 0, pRc.Dne.length - 1) + "\n");
      Dne = 4096 / lth.FWm;
      aOl.Dne(lth);
      mOU.Dne(aOl);
      float[][][] arrayOfFloat = new float[1][][];
      int[] arrayOfInt = new int[lth.FWm];
      while (!bool) {
        while (!bool) {
          int k = ytS.FWm(aHQ);
          if (k == 0)
            break; 
          if (k == -1) {
            System.err.println("Corrupt or missing data in bitstream; continuing...");
            continue;
          } 
          tYH.Dne(aHQ);
          while (true) {
            k = tYH.FWm(qlF);
            if (k == 0) {
              if (aHQ.Qnq() != 0)
                bool = true; 
              continue;
            } 
            if (k == -1)
              continue; 
            if (mOU.Dne(qlF) == 0)
              aOl.Dne(mOU); 
            int m;
            while ((m = aOl.Dne(arrayOfFloat, arrayOfInt)) > 0) {
              float[][] arrayOfFloat1 = arrayOfFloat[0];
              byte b = (m < Dne) ? m : Dne;
              for (b1 = 0; b1 < lth.FWm; b1++) {
                int n = b1 * 2;
                int i1 = arrayOfInt[b1];
                for (byte b3 = 0; b3 < b; b3++) {
                  int i2 = (int)(arrayOfFloat1[b1][i1 + b3] * 32767.0D);
                  if (i2 > 32767)
                    i2 = 32767; 
                  if (i2 < -32768)
                    i2 = -32768; 
                  if (i2 < 0)
                    i2 |= 0x8000; 
                  Dne[n] = (byte)i2;
                  Dne[n + 1] = (byte)(i2 >>> 8);
                  n += 2 * lth.FWm;
                } 
              } 
              System.out.write(Dne, 0, 2 * lth.FWm * b);
              aOl.Dne(b);
            } 
          } 
        } 
        if (!bool) {
          j = ytS.Dne(4096);
          arrayOfByte = ytS.Dne;
          try {
            i = inputStream.read(arrayOfByte, j, 4096);
          } catch (Exception exception) {
            System.err.println(exception);
            System.exit(1);
          } 
          ytS.FWm(i);
          if (i == 0)
            bool = true; 
        } 
      } 
      tYH.FWm();
      mOU.Dne();
      aOl.Dne();
      lth.FWm();
    } 
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\tpx.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */