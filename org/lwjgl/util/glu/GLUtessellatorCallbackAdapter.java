package org.lwjgl.util.glu;

public class GLUtessellatorCallbackAdapter implements GLUtessellatorCallback {
  public void begin(int type) {}
  
  public void edgeFlag(boolean boundaryEdge) {}
  
  public void vertex(Object vertexData) {}
  
  public void end() {}
  
  public void error(int errnum) {}
  
  public void combine(double[] coords, Object[] data, float[] weight, Object[] outData) {}
  
  public void beginData(int type, Object polygonData) {}
  
  public void edgeFlagData(boolean boundaryEdge, Object polygonData) {}
  
  public void vertexData(Object vertexData, Object polygonData) {}
  
  public void endData(Object polygonData) {}
  
  public void errorData(int errnum, Object polygonData) {}
  
  public void combineData(double[] coords, Object[] data, float[] weight, Object[] outData, Object polygonData) {}
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\org\lwjg\\util\glu\GLUtessellatorCallbackAdapter.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */