package org.lwjgl.util;

public interface WritableRectangle extends WritablePoint, WritableDimension {
  void setBounds(int paramInt1, int paramInt2, int paramInt3, int paramInt4);
  
  void setBounds(ReadablePoint paramReadablePoint, ReadableDimension paramReadableDimension);
  
  void setBounds(ReadableRectangle paramReadableRectangle);
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\org\lwjg\\util\WritableRectangle.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */