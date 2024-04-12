package org.lwjgl.util.glu;

public interface GLUtessellator {
  void gluDeleteTess();
  
  void gluTessProperty(int paramInt, double paramDouble);
  
  void gluGetTessProperty(int paramInt1, double[] paramArrayOfdouble, int paramInt2);
  
  void gluTessNormal(double paramDouble1, double paramDouble2, double paramDouble3);
  
  void gluTessCallback(int paramInt, GLUtessellatorCallback paramGLUtessellatorCallback);
  
  void gluTessVertex(double[] paramArrayOfdouble, int paramInt, Object paramObject);
  
  void gluTessBeginPolygon(Object paramObject);
  
  void gluTessBeginContour();
  
  void gluTessEndContour();
  
  void gluTessEndPolygon();
  
  void gluBeginPolygon();
  
  void gluNextContour(int paramInt);
  
  void gluEndPolygon();
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\org\lwjg\\util\glu\GLUtessellator.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */