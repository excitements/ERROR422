import java.util.Collection;
import java.util.Iterator;
import java.util.Random;

public class nGp {
  public static Twy Dne(Random paramRandom, Twy[] paramArrayOfTwy) {
    return Dne(paramRandom, paramArrayOfTwy, Dne(paramArrayOfTwy));
  }
  
  public static int Dne(Twy[] paramArrayOfTwy) {
    int i = 0;
    Twy[] arrayOfTwy = paramArrayOfTwy;
    int j = paramArrayOfTwy.length;
    for (byte b = 0; b < j; b++) {
      Twy twy = arrayOfTwy[b];
      i += twy.bzF;
    } 
    return i;
  }
  
  public static Twy Dne(Random paramRandom, Collection paramCollection, int paramInt) {
    if (paramInt <= 0)
      throw new IllegalArgumentException(); 
    int i = paramRandom.nextInt(paramInt);
    Iterator<Twy> iterator = paramCollection.iterator();
    while (true) {
      if (!iterator.hasNext())
        return null; 
      Twy twy = iterator.next();
      i -= twy.bzF;
      if (i < 0)
        return twy; 
    } 
  }
  
  public static Twy Dne(Random paramRandom, Collection paramCollection) {
    return Dne(paramRandom, paramCollection, Dne(paramCollection));
  }
  
  static {
  
  }
  
  public static Twy Dne(Random paramRandom, Twy[] paramArrayOfTwy, int paramInt) {
    if (paramInt <= 0)
      throw new IllegalArgumentException(); 
    int i = paramRandom.nextInt(paramInt);
    Twy[] arrayOfTwy = paramArrayOfTwy;
    int j = paramArrayOfTwy.length;
    for (byte b = 0; b < j; b++) {
      Twy twy = arrayOfTwy[b];
      i -= twy.bzF;
      if (i < 0)
        return twy; 
    } 
    return null;
  }
  
  public static int Dne(Collection paramCollection) {
    int i = 0;
    for (Twy twy : paramCollection)
      i += twy.bzF; 
    return i;
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\nGp.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */