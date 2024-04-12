import java.util.List;
import java.util.Random;

public class dSy extends ram {
  private int Dne;
  
  private final boolean Dne = true;
  
  public boolean Dne(Qnq paramQnq, Random paramRandom, CLK paramCLK) {
    // Byte code:
    //   0: aload_0
    //   1: getfield Dne : I
    //   4: ifge -> 49
    //   7: aload_0
    //   8: aload_0
    //   9: aload_1
    //   10: aload_3
    //   11: invokevirtual Dne : (LQnq;LCLK;)I
    //   14: putfield Dne : I
    //   17: aload_0
    //   18: getfield Dne : I
    //   21: ifge -> 26
    //   24: iconst_1
    //   25: ireturn
    //   26: aload_0
    //   27: getfield Dne : LCLK;
    //   30: iconst_0
    //   31: aload_0
    //   32: getfield Dne : I
    //   35: aload_0
    //   36: getfield Dne : LCLK;
    //   39: getfield aFZ : I
    //   42: isub
    //   43: iconst_3
    //   44: iadd
    //   45: iconst_0
    //   46: invokevirtual Dne : (III)V
    //   49: aload_0
    //   50: aload_1
    //   51: aload_3
    //   52: iconst_1
    //   53: iconst_0
    //   54: iconst_1
    //   55: iconst_4
    //   56: bipush #12
    //   58: iconst_4
    //   59: getstatic zKP.bzF : LzKP;
    //   62: getfield FWm : I
    //   65: getstatic zKP.Dne : Lbyt;
    //   68: getfield FWm : I
    //   71: iconst_0
    //   72: invokevirtual Dne : (LQnq;LCLK;IIIIIIIIZ)V
    //   75: aload_0
    //   76: aload_1
    //   77: iconst_0
    //   78: iconst_0
    //   79: iconst_2
    //   80: bipush #12
    //   82: iconst_2
    //   83: aload_3
    //   84: invokevirtual Dne : (LQnq;IIIIILCLK;)V
    //   87: aload_0
    //   88: aload_1
    //   89: iconst_0
    //   90: iconst_0
    //   91: iconst_3
    //   92: bipush #12
    //   94: iconst_2
    //   95: aload_3
    //   96: invokevirtual Dne : (LQnq;IIIIILCLK;)V
    //   99: aload_0
    //   100: aload_1
    //   101: iconst_0
    //   102: iconst_0
    //   103: iconst_2
    //   104: bipush #12
    //   106: iconst_3
    //   107: aload_3
    //   108: invokevirtual Dne : (LQnq;IIIIILCLK;)V
    //   111: aload_0
    //   112: aload_1
    //   113: iconst_0
    //   114: iconst_0
    //   115: iconst_3
    //   116: bipush #12
    //   118: iconst_3
    //   119: aload_3
    //   120: invokevirtual Dne : (LQnq;IIIIILCLK;)V
    //   123: aload_0
    //   124: aload_1
    //   125: getstatic zKP.sly : LzKP;
    //   128: getfield FWm : I
    //   131: iconst_0
    //   132: iconst_1
    //   133: bipush #13
    //   135: iconst_1
    //   136: aload_3
    //   137: invokevirtual Dne : (LQnq;IIIIILCLK;)V
    //   140: aload_0
    //   141: aload_1
    //   142: getstatic zKP.sly : LzKP;
    //   145: getfield FWm : I
    //   148: iconst_0
    //   149: iconst_1
    //   150: bipush #14
    //   152: iconst_1
    //   153: aload_3
    //   154: invokevirtual Dne : (LQnq;IIIIILCLK;)V
    //   157: aload_0
    //   158: aload_1
    //   159: getstatic zKP.sly : LzKP;
    //   162: getfield FWm : I
    //   165: iconst_0
    //   166: iconst_4
    //   167: bipush #13
    //   169: iconst_1
    //   170: aload_3
    //   171: invokevirtual Dne : (LQnq;IIIIILCLK;)V
    //   174: aload_0
    //   175: aload_1
    //   176: getstatic zKP.sly : LzKP;
    //   179: getfield FWm : I
    //   182: iconst_0
    //   183: iconst_4
    //   184: bipush #14
    //   186: iconst_1
    //   187: aload_3
    //   188: invokevirtual Dne : (LQnq;IIIIILCLK;)V
    //   191: aload_0
    //   192: aload_1
    //   193: getstatic zKP.sly : LzKP;
    //   196: getfield FWm : I
    //   199: iconst_0
    //   200: iconst_1
    //   201: bipush #13
    //   203: iconst_4
    //   204: aload_3
    //   205: invokevirtual Dne : (LQnq;IIIIILCLK;)V
    //   208: aload_0
    //   209: aload_1
    //   210: getstatic zKP.sly : LzKP;
    //   213: getfield FWm : I
    //   216: iconst_0
    //   217: iconst_1
    //   218: bipush #14
    //   220: iconst_4
    //   221: aload_3
    //   222: invokevirtual Dne : (LQnq;IIIIILCLK;)V
    //   225: aload_0
    //   226: aload_1
    //   227: getstatic zKP.sly : LzKP;
    //   230: getfield FWm : I
    //   233: iconst_0
    //   234: iconst_4
    //   235: bipush #13
    //   237: iconst_4
    //   238: aload_3
    //   239: invokevirtual Dne : (LQnq;IIIIILCLK;)V
    //   242: aload_0
    //   243: aload_1
    //   244: getstatic zKP.sly : LzKP;
    //   247: getfield FWm : I
    //   250: iconst_0
    //   251: iconst_4
    //   252: bipush #14
    //   254: iconst_4
    //   255: aload_3
    //   256: invokevirtual Dne : (LQnq;IIIIILCLK;)V
    //   259: aload_0
    //   260: aload_1
    //   261: aload_3
    //   262: iconst_1
    //   263: bipush #15
    //   265: iconst_1
    //   266: iconst_4
    //   267: bipush #15
    //   269: iconst_4
    //   270: getstatic zKP.bzF : LzKP;
    //   273: getfield FWm : I
    //   276: getstatic zKP.bzF : LzKP;
    //   279: getfield FWm : I
    //   282: iconst_0
    //   283: invokevirtual Dne : (LQnq;LCLK;IIIIIIIIZ)V
    //   286: iconst_0
    //   287: istore #4
    //   289: iload #4
    //   291: iconst_5
    //   292: if_icmpgt -> 369
    //   295: iconst_0
    //   296: istore #5
    //   298: iload #5
    //   300: iconst_5
    //   301: if_icmpgt -> 363
    //   304: iload #5
    //   306: ifeq -> 326
    //   309: iload #5
    //   311: iconst_5
    //   312: if_icmpeq -> 326
    //   315: iload #4
    //   317: ifeq -> 326
    //   320: iload #4
    //   322: iconst_5
    //   323: if_icmpne -> 357
    //   326: aload_0
    //   327: aload_1
    //   328: getstatic zKP.mrb : LzKP;
    //   331: getfield FWm : I
    //   334: iconst_0
    //   335: iload #5
    //   337: bipush #11
    //   339: iload #4
    //   341: aload_3
    //   342: invokevirtual Dne : (LQnq;IIIIILCLK;)V
    //   345: aload_0
    //   346: aload_1
    //   347: iload #5
    //   349: bipush #12
    //   351: iload #4
    //   353: aload_3
    //   354: invokevirtual Dne : (LQnq;IIILCLK;)V
    //   357: iinc #5, 1
    //   360: goto -> 298
    //   363: iinc #4, 1
    //   366: goto -> 289
    //   369: iconst_1
    //   370: ireturn
  }
  
  public dSy(opc paramopc, int paramInt1, Random paramRandom, int paramInt2, int paramInt3) {
    super(paramopc, paramInt1);
    this.Dne = true;
    this.aFZ = paramRandom.nextInt(4);
    switch (this.aFZ) {
      case 0:
      case 2:
        this.Dne = new CLK(paramInt2, 64, paramInt3, paramInt2 + 6 - 1, 78, paramInt3 + 6 - 1);
        return;
    } 
    this.Dne = new CLK(paramInt2, 64, paramInt3, paramInt2 + 6 - 1, 78, paramInt3 + 6 - 1);
  }
  
  public void Dne(bvz parambvz, List paramList, Random paramRandom) {
    wBl.FWm((opc)parambvz, paramList, paramRandom, this.Dne.Dne - 1, this.Dne.aFZ - 4, this.Dne.bzF + 1, 1, Dne());
    wBl.FWm((opc)parambvz, paramList, paramRandom, this.Dne.Qnq + 1, this.Dne.aFZ - 4, this.Dne.bzF + 1, 3, Dne());
    wBl.FWm((opc)parambvz, paramList, paramRandom, this.Dne.Dne + 1, this.Dne.aFZ - 4, this.Dne.bzF - 1, 2, Dne());
    wBl.FWm((opc)parambvz, paramList, paramRandom, this.Dne.Dne + 1, this.Dne.aFZ - 4, this.Dne.zGp + 1, 0, Dne());
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\dSy.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */