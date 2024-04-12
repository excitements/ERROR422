package org.lwjgl.util.vector;

import java.io.Serializable;
import java.nio.FloatBuffer;

public abstract class Matrix implements Serializable {
  public abstract Matrix setIdentity();
  
  public abstract Matrix invert();
  
  public abstract Matrix load(FloatBuffer paramFloatBuffer);
  
  public abstract Matrix loadTranspose(FloatBuffer paramFloatBuffer);
  
  public abstract Matrix negate();
  
  public abstract Matrix store(FloatBuffer paramFloatBuffer);
  
  public abstract Matrix storeTranspose(FloatBuffer paramFloatBuffer);
  
  public abstract Matrix transpose();
  
  public abstract Matrix setZero();
  
  public abstract float determinant();
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\org\lwjg\\util\vector\Matrix.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */