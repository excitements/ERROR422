package org.lwjgl.opengl;

import java.awt.Canvas;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import org.lwjgl.LWJGLException;

interface DisplayImplementation extends InputImplementation {
  void createWindow(DisplayMode paramDisplayMode, Canvas paramCanvas, int paramInt1, int paramInt2) throws LWJGLException;
  
  void destroyWindow();
  
  void switchDisplayMode(DisplayMode paramDisplayMode) throws LWJGLException;
  
  void resetDisplayMode();
  
  int getGammaRampLength();
  
  void setGammaRamp(FloatBuffer paramFloatBuffer) throws LWJGLException;
  
  String getAdapter();
  
  String getVersion();
  
  DisplayMode init() throws LWJGLException;
  
  void setTitle(String paramString);
  
  boolean isCloseRequested();
  
  boolean isVisible();
  
  boolean isActive();
  
  boolean isDirty();
  
  PeerInfo createPeerInfo(PixelFormat paramPixelFormat) throws LWJGLException;
  
  void update();
  
  void reshape(int paramInt1, int paramInt2, int paramInt3, int paramInt4);
  
  DisplayMode[] getAvailableDisplayModes() throws LWJGLException;
  
  int getPbufferCapabilities();
  
  boolean isBufferLost(PeerInfo paramPeerInfo);
  
  PeerInfo createPbuffer(int paramInt1, int paramInt2, PixelFormat paramPixelFormat, IntBuffer paramIntBuffer1, IntBuffer paramIntBuffer2) throws LWJGLException;
  
  void setPbufferAttrib(PeerInfo paramPeerInfo, int paramInt1, int paramInt2);
  
  void bindTexImageToPbuffer(PeerInfo paramPeerInfo, int paramInt);
  
  void releaseTexImageFromPbuffer(PeerInfo paramPeerInfo, int paramInt);
  
  int setIcon(ByteBuffer[] paramArrayOfByteBuffer);
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\org\lwjgl\opengl\DisplayImplementation.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */