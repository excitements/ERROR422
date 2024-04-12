package org.lwjgl.opengl;

import java.awt.Canvas;
import java.awt.GraphicsConfiguration;
import java.awt.GraphicsDevice;
import org.lwjgl.LWJGLException;

interface AWTCanvasImplementation {
  PeerInfo createPeerInfo(Canvas paramCanvas, PixelFormat paramPixelFormat) throws LWJGLException;
  
  GraphicsConfiguration findConfiguration(GraphicsDevice paramGraphicsDevice, PixelFormat paramPixelFormat) throws LWJGLException;
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\org\lwjgl\opengl\AWTCanvasImplementation.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */