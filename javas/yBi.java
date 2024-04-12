public abstract class yBi {
  private long bzF;
  
  private long Dne;
  
  protected yBi Dne;
  
  private long FWm;
  
  protected int Dne(int paramInt) {
    int i = (int)((this.FWm >> 24L) % paramInt);
    if (i < 0)
      i += paramInt; 
    this.FWm *= this.FWm * 6364136223846793005L + 1442695040888963407L;
    this.FWm += this.Dne;
    return i;
  }
  
  public static yBi[] Dne(long paramLong, kGO paramkGO) {
    RyG ryG;
    hqP hqP = new hqP(1L);
    yIw yIw = new yIw(2000L, hqP);
    TKT tKT = new TKT(1L, yIw);
    yRM yRM = new yRM(2001L, tKT);
    tKT = new TKT(2L, yRM);
    Xor xor = new Xor(2L, tKT);
    yRM = new yRM(2002L, xor);
    tKT = new TKT(3L, yRM);
    yRM = new yRM(2003L, tKT);
    tKT = new TKT(4L, yRM);
    gxA gxA = new gxA(5L, tKT);
    byte b1 = 4;
    if (paramkGO == kGO.bzF)
      b1 = 6; 
    yBi yBi1 = yRM.Dne(1000L, gxA, 0);
    nnv nnv = new nnv(100L, yBi1);
    yBi1 = yRM.Dne(1000L, nnv, b1 + 2);
    ihb ihb = new ihb(1L, yBi1);
    AZg aZg1 = new AZg(1000L, ihb);
    yBi yBi2 = yRM.Dne(1000L, gxA, 0);
    uqp uqp = new uqp(200L, yBi2, paramkGO);
    yBi2 = yRM.Dne(1000L, uqp, 2);
    QJt qJt = new QJt(1000L, yBi2);
    for (byte b2 = 0; b2 < b1; b2++) {
      TKT tKT1;
      pRH pRH;
      yRM yRM1 = new yRM((1000 + b2), qJt);
      if (b2 == 0)
        tKT1 = new TKT(3L, yRM1); 
      if (b2 == 1)
        pRH = new pRH(1000L, tKT1); 
      if (b2 == 1)
        ryG = new RyG(1000L, pRH); 
    } 
    AZg aZg2 = new AZg(1000L, ryG);
    MHV mHV = new MHV(100L, aZg2, aZg1);
    JoZ joZ = new JoZ(10L, mHV);
    mHV.Dne(paramLong);
    joZ.Dne(paramLong);
    return new yBi[] { mHV, joZ, mHV };
  }
  
  public void Dne(long paramLong) {
    this.Dne = paramLong;
    if (this.Dne != null)
      this.Dne.Dne(paramLong); 
    this.Dne *= this.Dne * 6364136223846793005L + 1442695040888963407L;
    this.Dne += this.bzF;
    this.Dne *= this.Dne * 6364136223846793005L + 1442695040888963407L;
    this.Dne += this.bzF;
    this.Dne *= this.Dne * 6364136223846793005L + 1442695040888963407L;
    this.Dne += this.bzF;
  }
  
  public abstract int[] Dne(int paramInt1, int paramInt2, int paramInt3, int paramInt4);
  
  public void Dne(long paramLong1, long paramLong2) {
    this.FWm = this.Dne;
    this.FWm *= this.FWm * 6364136223846793005L + 1442695040888963407L;
    this.FWm += paramLong1;
    this.FWm *= this.FWm * 6364136223846793005L + 1442695040888963407L;
    this.FWm += paramLong2;
    this.FWm *= this.FWm * 6364136223846793005L + 1442695040888963407L;
    this.FWm += paramLong1;
    this.FWm *= this.FWm * 6364136223846793005L + 1442695040888963407L;
    this.FWm += paramLong2;
  }
  
  public yBi(long paramLong) {
    this.bzF = paramLong;
    this.bzF *= this.bzF * 6364136223846793005L + 1442695040888963407L;
    this.bzF += paramLong;
    this.bzF *= this.bzF * 6364136223846793005L + 1442695040888963407L;
    this.bzF += paramLong;
    this.bzF *= this.bzF * 6364136223846793005L + 1442695040888963407L;
    this.bzF += paramLong;
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\yBi.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */