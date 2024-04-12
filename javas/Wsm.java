import java.util.Random;

public class Wsm extends Gor {
  rxL[] Dne;
  
  rxL Dne = (rxL)new rxL[9];
  
  public void Dne(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6, sMa paramsMa) {
    for (byte b = 0; b < this.Dne.length; b++)
      (this.Dne[b]).zGp = 0.2F * geR.Dne(paramFloat3 * 0.3F + b) + 0.4F; 
  }
  
  public void Dne(sMa paramsMa, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6) {
    // Byte code:
    //   0: aload_0
    //   1: fload_2
    //   2: fload_3
    //   3: fload #4
    //   5: fload #5
    //   7: fload #6
    //   9: fload #7
    //   11: aload_1
    //   12: invokevirtual Dne : (FFFFFFLsMa;)V
    //   15: invokestatic glPushMatrix : ()V
    //   18: fconst_0
    //   19: ldc 0.6
    //   21: fconst_0
    //   22: invokestatic glTranslatef : (FFF)V
    //   25: aload_0
    //   26: getfield Dne : LrxL;
    //   29: fload #7
    //   31: invokevirtual Dne : (F)V
    //   34: aload_0
    //   35: getfield Dne : [LrxL;
    //   38: astore #8
    //   40: aload #8
    //   42: arraylength
    //   43: istore #9
    //   45: iconst_0
    //   46: istore #10
    //   48: iload #10
    //   50: iload #9
    //   52: if_icmpge -> 75
    //   55: aload #8
    //   57: iload #10
    //   59: aaload
    //   60: astore #11
    //   62: aload #11
    //   64: fload #7
    //   66: invokevirtual Dne : (F)V
    //   69: iinc #10, 1
    //   72: goto -> 48
    //   75: invokestatic glPopMatrix : ()V
    //   78: return
  }
  
  public Wsm() {
    byte b = -16;
    this.Dne = new rxL(this, 0, 0);
    this.Dne.Dne(-8.0F, -8.0F, -8.0F, 16, 16, 16);
    this.Dne.Qnq += (24 + b);
    Random random = new Random(1660L);
    for (byte b1 = 0; b1 < this.Dne.length; b1++) {
      this.Dne[b1] = new rxL(this, 0, 0);
      float f1 = (((b1 % 3) - (b1 / 3 % 2) * 0.5F + 0.25F) / 2.0F * 2.0F - 1.0F) * 5.0F;
      float f2 = ((b1 / 3) / 2.0F * 2.0F - 1.0F) * 5.0F;
      int i = random.nextInt(7) + 8;
      this.Dne[b1].Dne(-1.0F, 0.0F, -1.0F, 2, i, 2);
      (this.Dne[b1]).bzF = f1;
      (this.Dne[b1]).aFZ = f2;
      (this.Dne[b1]).Qnq = (31 + b);
    } 
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\Wsm.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */