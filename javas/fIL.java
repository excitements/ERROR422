import java.util.List;

public class fIL extends ajI {
  private UVr Dne;
  
  protected int bzF(int paramInt) {
    return (paramInt > 0) ? 1 : 0;
  }
  
  protected int a_(Qnq paramQnq, int paramInt1, int paramInt2, int paramInt3) {
    List list = null;
    if (this.Dne == UVr.Dne)
      list = paramQnq.FWm((sMa)null, Dne(paramInt1, paramInt2, paramInt3)); 
    if (this.Dne == UVr.FWm)
      list = paramQnq.Dne(FUH.class, Dne(paramInt1, paramInt2, paramInt3)); 
    if (this.Dne == UVr.bzF)
      list = paramQnq.Dne(FiG.class, Dne(paramInt1, paramInt2, paramInt3)); 
    if (!list.isEmpty())
      for (sMa sMa : list) {
        if (!sMa.FfS())
          return 15; 
      }  
    return 0;
  }
  
  protected fIL(int paramInt, String paramString, KFd paramKFd, UVr paramUVr) {
    super(paramInt, paramString, paramKFd);
    this.Dne = paramUVr;
  }
  
  protected int a_(int paramInt) {
    return (paramInt == 1) ? 15 : 0;
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\fIL.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */