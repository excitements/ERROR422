public class NQg extends cMv {
  FUH Dne;
  
  float Dne;
  
  FUH FWm;
  
  public boolean FWm() {
    return (this.Dne.aFZ == null);
  }
  
  public void Dne() {
    double d1 = this.FWm.div - this.Dne.div;
    double d2 = this.FWm.mrb - this.Dne.mrb;
    float f = geR.Dne(d1 * d1 + d2 * d2);
    this.Dne.XHL += d1 / f * 0.5D * 0.800000011920929D + this.Dne.XHL * 0.20000000298023224D;
    this.Dne.kGO += d2 / f * 0.5D * 0.800000011920929D + this.Dne.kGO * 0.20000000298023224D;
    this.Dne.Zpi = this.Dne;
  }
  
  public NQg(FUH paramFUH, float paramFloat) {
    this.Dne = paramFUH;
    this.Dne = paramFloat;
    Dne(5);
  }
  
  public boolean Dne() {
    // Byte code:
    //   0: aload_0
    //   1: aload_0
    //   2: getfield Dne : LFUH;
    //   5: invokevirtual bzF : ()LFUH;
    //   8: putfield FWm : LFUH;
    //   11: aload_0
    //   12: getfield FWm : LFUH;
    //   15: ifnonnull -> 20
    //   18: iconst_0
    //   19: ireturn
    //   20: aload_0
    //   21: getfield Dne : LFUH;
    //   24: aload_0
    //   25: getfield FWm : LFUH;
    //   28: invokevirtual Dne : (LsMa;)D
    //   31: dstore_1
    //   32: dload_1
    //   33: ldc2_w 4.0
    //   36: dcmpl
    //   37: iflt -> 84
    //   40: dload_1
    //   41: ldc2_w 16.0
    //   44: dcmpg
    //   45: ifgt -> 84
    //   48: aload_0
    //   49: getfield Dne : LFUH;
    //   52: getfield aFZ : Z
    //   55: ifne -> 62
    //   58: iconst_0
    //   59: goto -> 85
    //   62: aload_0
    //   63: getfield Dne : LFUH;
    //   66: invokevirtual Dne : ()Ljava/util/Random;
    //   69: iconst_5
    //   70: invokevirtual nextInt : (I)I
    //   73: ifne -> 80
    //   76: iconst_1
    //   77: goto -> 85
    //   80: iconst_0
    //   81: goto -> 85
    //   84: iconst_0
    //   85: ireturn
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\NQg.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */