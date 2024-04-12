import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class kXX extends SFA {
  private hlz Dne;
  
  private final Jwh Dne;
  
  private final Set Dne = new HashSet();
  
  public void Qnq(vfE paramvfE) {
    super.Qnq(paramvfE);
    if (this.Dne.contains(paramvfE))
      zGp(paramvfE); 
    Dne();
  }
  
  protected void Dne() {
    if (this.Dne != null)
      this.Dne.Dne(); 
  }
  
  public void bzF(YGE paramYGE) {
    super.bzF(paramYGE);
    this.Dne.Dne().Dne(new SPR(paramYGE, 2));
    Dne();
  }
  
  public List FWm(vfE paramvfE) {
    ArrayList<iQd> arrayList = new ArrayList();
    arrayList.add(new iQd(paramvfE, 1));
    for (byte b = 0; b < 3; b++) {
      if (Dne(b) == paramvfE)
        arrayList.add(new LjQ(b, paramvfE)); 
    } 
    return arrayList;
  }
  
  public void Qnq(YGE paramYGE) {
    super.Qnq(paramYGE);
    this.Dne.Dne().Dne(new SPR(paramYGE, 1));
    Dne();
  }
  
  public void aFZ(vfE paramvfE) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: invokevirtual Dne : (LvfE;)Ljava/util/List;
    //   5: astore_2
    //   6: aload_0
    //   7: getfield Dne : LJwh;
    //   10: invokevirtual Dne : ()LdzN;
    //   13: getfield Dne : Ljava/util/List;
    //   16: invokeinterface iterator : ()Ljava/util/Iterator;
    //   21: astore_3
    //   22: aload_3
    //   23: invokeinterface hasNext : ()Z
    //   28: ifeq -> 88
    //   31: aload_3
    //   32: invokeinterface next : ()Ljava/lang/Object;
    //   37: checkcast PJQ
    //   40: astore #4
    //   42: aload_2
    //   43: invokeinterface iterator : ()Ljava/util/Iterator;
    //   48: astore #5
    //   50: aload #5
    //   52: invokeinterface hasNext : ()Z
    //   57: ifeq -> 85
    //   60: aload #5
    //   62: invokeinterface next : ()Ljava/lang/Object;
    //   67: checkcast NER
    //   70: astore #6
    //   72: aload #4
    //   74: getfield Dne : LTnv;
    //   77: aload #6
    //   79: invokevirtual Dne : (LNER;)V
    //   82: goto -> 50
    //   85: goto -> 22
    //   88: aload_0
    //   89: getfield Dne : Ljava/util/Set;
    //   92: aload_1
    //   93: invokeinterface add : (Ljava/lang/Object;)Z
    //   98: pop
    //   99: return
  }
  
  public void FWm(String paramString) {
    super.FWm(paramString);
    this.Dne.Dne().Dne(new niw(paramString));
    Dne();
  }
  
  public void FWm(YGE paramYGE) {
    super.FWm(paramYGE);
    this.Dne.Dne().Dne(new SPR(paramYGE, 0));
    Dne();
  }
  
  public List Dne(vfE paramvfE) {
    ArrayList<iQd> arrayList = new ArrayList();
    arrayList.add(new iQd(paramvfE, 0));
    for (byte b = 0; b < 3; b++) {
      if (Dne(b) == paramvfE)
        arrayList.add(new LjQ(b, paramvfE)); 
    } 
    for (OHz oHz : Dne(paramvfE))
      arrayList.add(new niw(oHz, 0)); 
    return arrayList;
  }
  
  public void FWm(vfE paramvfE) {
    super.FWm(paramvfE);
    Dne();
  }
  
  public void Dne(hlz paramhlz) {
    this.Dne = (Set)paramhlz;
  }
  
  public void zGp(vfE paramvfE) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: invokevirtual FWm : (LvfE;)Ljava/util/List;
    //   5: astore_2
    //   6: aload_0
    //   7: getfield Dne : LJwh;
    //   10: invokevirtual Dne : ()LdzN;
    //   13: getfield Dne : Ljava/util/List;
    //   16: invokeinterface iterator : ()Ljava/util/Iterator;
    //   21: astore_3
    //   22: aload_3
    //   23: invokeinterface hasNext : ()Z
    //   28: ifeq -> 88
    //   31: aload_3
    //   32: invokeinterface next : ()Ljava/lang/Object;
    //   37: checkcast PJQ
    //   40: astore #4
    //   42: aload_2
    //   43: invokeinterface iterator : ()Ljava/util/Iterator;
    //   48: astore #5
    //   50: aload #5
    //   52: invokeinterface hasNext : ()Z
    //   57: ifeq -> 85
    //   60: aload #5
    //   62: invokeinterface next : ()Ljava/lang/Object;
    //   67: checkcast NER
    //   70: astore #6
    //   72: aload #4
    //   74: getfield Dne : LTnv;
    //   77: aload #6
    //   79: invokevirtual Dne : (LNER;)V
    //   82: goto -> 50
    //   85: goto -> 22
    //   88: aload_0
    //   89: getfield Dne : Ljava/util/Set;
    //   92: aload_1
    //   93: invokeinterface remove : (Ljava/lang/Object;)Z
    //   98: pop
    //   99: return
  }
  
  public void bzF(vfE paramvfE) {
    super.bzF(paramvfE);
    if (this.Dne.contains(paramvfE))
      this.Dne.Dne().Dne(new iQd(paramvfE, 2)); 
    Dne();
  }
  
  public void Dne(String paramString, YGE paramYGE) {
    super.Dne(paramString, paramYGE);
    this.Dne.Dne().Dne(new SPR(paramYGE, Arrays.asList(new String[] { paramString }, ), 3));
    Dne();
  }
  
  public int Dne(vfE paramvfE) {
    byte b1 = 0;
    for (byte b2 = 0; b2 < 3; b2++) {
      if (Dne(b2) == paramvfE)
        b1++; 
    } 
    return b1;
  }
  
  public void FWm(String paramString, YGE paramYGE) {
    super.FWm(paramString, paramYGE);
    this.Dne.Dne().Dne(new SPR(paramYGE, Arrays.asList(new String[] { paramString }, ), 4));
    Dne();
  }
  
  public void Dne(int paramInt, vfE paramvfE) {
    vfE vfE1 = Dne(paramInt);
    super.Dne(paramInt, paramvfE);
    if (vfE1 != paramvfE && vfE1 != null)
      if (Dne(vfE1) > 0) {
        this.Dne.Dne().Dne(new LjQ(paramInt, paramvfE));
      } else {
        zGp(vfE1);
      }  
    if (paramvfE != null)
      if (this.Dne.contains(paramvfE)) {
        this.Dne.Dne().Dne(new LjQ(paramInt, paramvfE));
      } else {
        aFZ(paramvfE);
      }  
    Dne();
  }
  
  public void Dne(OHz paramOHz) {
    super.Dne(paramOHz);
    if (this.Dne.contains(paramOHz.Dne()))
      this.Dne.Dne().Dne(new niw(paramOHz, 0)); 
    Dne();
  }
  
  public kXX(Jwh paramJwh) {
    this.Dne = (Set)paramJwh;
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\kXX.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */