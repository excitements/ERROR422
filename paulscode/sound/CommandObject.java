package paulscode.sound;

public class CommandObject {
  public static final int STOP;
  
  public static final int CHECK_FADE_VOLUMES;
  
  public static final int MOVE_LISTENER;
  
  public static final int RAW_DATA_STREAM;
  
  public String[] stringArgs;
  
  public static final int NEW_SOURCE;
  
  public static final int SET_VOLUME;
  
  public static final int QUEUE_SOUND;
  
  public int Command;
  
  public long[] longArgs;
  
  public static final int NEW_LIBRARY;
  
  public static final int FEED_RAW_AUDIO_DATA;
  
  public static final int FADE_OUT_IN;
  
  public float[] floatArgs;
  
  public static final int SET_LISTENER_VELOCITY;
  
  public static final int FADE_OUT;
  
  public static final int CHANGE_DOPPLER_FACTOR;
  
  public boolean[] boolArgs;
  
  public static final int SET_TEMPORARY;
  
  public static final int SET_POSITION;
  
  public static final int CULL;
  
  public static final int SET_LISTENER_ORIENTATION;
  
  public byte[] buffer;
  
  public static final int TURN_LISTENER;
  
  public static final int SET_MASTER_VOLUME;
  
  public static final int CHANGE_DOPPLER_VELOCITY;
  
  public static final int DEQUEUE_SOUND;
  
  public static final int LOAD_DATA;
  
  public static final int PAUSE;
  
  public static final int SET_PITCH;
  
  public static final int ACTIVATE;
  
  public static final int SET_LISTENER_ANGLE;
  
  public Class[] classArgs;
  
  public static final int SET_PRIORITY;
  
  public static final int REWIND;
  
  public static final int LOAD_SOUND;
  
  public static final int PLAY;
  
  public static final int SET_VELOCITY;
  
  public static final int SET_DIST_OR_ROLL = 19;
  
  public static final int UNLOAD_SOUND = 4;
  
  public static final int SET_LOOPING;
  
  public static final int REMOVE_SOURCE;
  
  public Object[] objectArgs;
  
  public static final int FLUSH;
  
  public static final int QUICK_PLAY;
  
  public int[] intArgs;
  
  public static final int SET_LISTENER_POSITION;
  
  public static final int INITIALIZE;
  
  public static final int SET_ATTENUATION;
  
  public CommandObject(int paramInt, String paramString, boolean paramBoolean) {
    this.Command = paramInt;
    this.boolArgs = new boolean[1];
    this.stringArgs = new String[1];
    this.boolArgs[0] = paramBoolean;
    this.stringArgs[0] = paramString;
  }
  
  public CommandObject(int paramInt, String paramString, byte[] paramArrayOfbyte) {
    this.Command = paramInt;
    this.stringArgs = new String[1];
    this.stringArgs[0] = paramString;
    this.buffer = paramArrayOfbyte;
  }
  
  public CommandObject(int paramInt, String paramString, Object paramObject, long paramLong1, long paramLong2) {
    this.Command = paramInt;
    this.stringArgs = new String[1];
    this.stringArgs[0] = paramString;
    this.objectArgs = new Object[1];
    this.objectArgs[0] = paramObject;
    this.longArgs = new long[2];
    this.longArgs[0] = paramLong1;
    this.longArgs[1] = paramLong2;
  }
  
  public CommandObject(int paramInt1, String paramString, int paramInt2) {
    this.Command = paramInt1;
    this.intArgs = new int[1];
    this.stringArgs = new String[1];
    this.intArgs[0] = paramInt2;
    this.stringArgs[0] = paramString;
  }
  
  public CommandObject(int paramInt, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6) {
    this.Command = paramInt;
    this.floatArgs = new float[6];
    this.floatArgs[0] = paramFloat1;
    this.floatArgs[1] = paramFloat2;
    this.floatArgs[2] = paramFloat3;
    this.floatArgs[3] = paramFloat4;
    this.floatArgs[4] = paramFloat5;
    this.floatArgs[5] = paramFloat6;
  }
  
  static {
    CULL = 30;
    SET_LISTENER_ANGLE = 37;
    PLAY = 24;
    QUEUE_SOUND = 5;
    SET_LISTENER_POSITION = 35;
    SET_MASTER_VOLUME = 39;
    SET_LOOPING = 17;
    FEED_RAW_AUDIO_DATA = 25;
    PAUSE = 26;
    SET_VELOCITY = 22;
    NEW_LIBRARY = 40;
    SET_PRIORITY = 16;
    MOVE_LISTENER = 34;
    SET_ATTENUATION = 18;
    ACTIVATE = 31;
    REMOVE_SOURCE = 33;
    REWIND = 28;
    SET_VOLUME = 14;
    SET_PITCH = 15;
    CHANGE_DOPPLER_VELOCITY = 21;
    STOP = 27;
    FADE_OUT = 7;
    LOAD_SOUND = 2;
    SET_TEMPORARY = 32;
    NEW_SOURCE = 10;
    CHANGE_DOPPLER_FACTOR = 20;
    FADE_OUT_IN = 8;
    QUICK_PLAY = 12;
    DEQUEUE_SOUND = 6;
    LOAD_DATA = 3;
    FLUSH = 29;
    RAW_DATA_STREAM = 11;
    SET_LISTENER_VELOCITY = 23;
    CHECK_FADE_VOLUMES = 9;
    SET_LISTENER_ORIENTATION = 38;
    SET_POSITION = 13;
    INITIALIZE = 1;
    TURN_LISTENER = 36;
  }
  
  public CommandObject(int paramInt, float paramFloat) {
    this.Command = paramInt;
    this.floatArgs = new float[1];
    this.floatArgs[0] = paramFloat;
  }
  
  public CommandObject(int paramInt, float paramFloat1, float paramFloat2, float paramFloat3) {
    this.Command = paramInt;
    this.floatArgs = new float[3];
    this.floatArgs[0] = paramFloat1;
    this.floatArgs[1] = paramFloat2;
    this.floatArgs[2] = paramFloat3;
  }
  
  public CommandObject(int paramInt) {
    this.Command = paramInt;
  }
  
  public CommandObject(int paramInt, String paramString, float paramFloat) {
    this.Command = paramInt;
    this.floatArgs = new float[1];
    this.stringArgs = new String[1];
    this.floatArgs[0] = paramFloat;
    this.stringArgs[0] = paramString;
  }
  
  public CommandObject(int paramInt, String paramString, float paramFloat1, float paramFloat2, float paramFloat3) {
    this.Command = paramInt;
    this.floatArgs = new float[3];
    this.stringArgs = new String[1];
    this.floatArgs[0] = paramFloat1;
    this.floatArgs[1] = paramFloat2;
    this.floatArgs[2] = paramFloat3;
    this.stringArgs[0] = paramString;
  }
  
  public CommandObject(int paramInt1, int paramInt2) {
    this.Command = paramInt1;
    this.intArgs = new int[1];
    this.intArgs[0] = paramInt2;
  }
  
  public CommandObject(int paramInt1, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, String paramString, Object paramObject, float paramFloat1, float paramFloat2, float paramFloat3, int paramInt2, float paramFloat4) {
    this.Command = paramInt1;
    this.intArgs = new int[1];
    this.floatArgs = new float[4];
    this.boolArgs = new boolean[3];
    this.stringArgs = new String[1];
    this.objectArgs = new Object[1];
    this.intArgs[0] = paramInt2;
    this.floatArgs[0] = paramFloat1;
    this.floatArgs[1] = paramFloat2;
    this.floatArgs[2] = paramFloat3;
    this.floatArgs[3] = paramFloat4;
    this.boolArgs[0] = paramBoolean1;
    this.boolArgs[1] = paramBoolean2;
    this.boolArgs[2] = paramBoolean3;
    this.stringArgs[0] = paramString;
    this.objectArgs[0] = paramObject;
  }
  
  public CommandObject(int paramInt, String paramString, Object paramObject) {
    this.Command = paramInt;
    this.stringArgs = new String[1];
    this.stringArgs[0] = paramString;
    this.objectArgs = new Object[1];
    this.objectArgs[0] = paramObject;
  }
  
  public CommandObject(int paramInt, Object paramObject) {
    this.Command = paramInt;
    this.objectArgs = new Object[1];
    this.objectArgs[0] = paramObject;
  }
  
  public CommandObject(int paramInt1, Object paramObject, boolean paramBoolean, String paramString, float paramFloat1, float paramFloat2, float paramFloat3, int paramInt2, float paramFloat4) {
    this.Command = paramInt1;
    this.intArgs = new int[1];
    this.floatArgs = new float[4];
    this.boolArgs = new boolean[1];
    this.stringArgs = new String[1];
    this.objectArgs = new Object[1];
    this.intArgs[0] = paramInt2;
    this.floatArgs[0] = paramFloat1;
    this.floatArgs[1] = paramFloat2;
    this.floatArgs[2] = paramFloat3;
    this.floatArgs[3] = paramFloat4;
    this.boolArgs[0] = paramBoolean;
    this.stringArgs[0] = paramString;
    this.objectArgs[0] = paramObject;
  }
  
  public CommandObject(int paramInt, Class paramClass) {
    this.Command = paramInt;
    this.classArgs = new Class[1];
    this.classArgs[0] = paramClass;
  }
  
  public CommandObject(int paramInt, String paramString) {
    this.Command = paramInt;
    this.stringArgs = new String[1];
    this.stringArgs[0] = paramString;
  }
  
  public CommandObject(int paramInt1, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, String paramString, Object paramObject, float paramFloat1, float paramFloat2, float paramFloat3, int paramInt2, float paramFloat4, boolean paramBoolean4) {
    this.Command = paramInt1;
    this.intArgs = new int[1];
    this.floatArgs = new float[4];
    this.boolArgs = new boolean[4];
    this.stringArgs = new String[1];
    this.objectArgs = new Object[1];
    this.intArgs[0] = paramInt2;
    this.floatArgs[0] = paramFloat1;
    this.floatArgs[1] = paramFloat2;
    this.floatArgs[2] = paramFloat3;
    this.floatArgs[3] = paramFloat4;
    this.boolArgs[0] = paramBoolean1;
    this.boolArgs[1] = paramBoolean2;
    this.boolArgs[2] = paramBoolean3;
    this.boolArgs[3] = paramBoolean4;
    this.stringArgs[0] = paramString;
    this.objectArgs[0] = paramObject;
  }
  
  public CommandObject(int paramInt, String paramString, Object paramObject, long paramLong) {
    this.Command = paramInt;
    this.stringArgs = new String[1];
    this.stringArgs[0] = paramString;
    this.objectArgs = new Object[1];
    this.objectArgs[0] = paramObject;
    this.longArgs = new long[1];
    this.longArgs[0] = paramLong;
  }
  
  public CommandObject(int paramInt, String paramString1, String paramString2) {
    this.Command = paramInt;
    this.stringArgs = new String[2];
    this.stringArgs[0] = paramString1;
    this.stringArgs[1] = paramString2;
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\paulscode\sound\CommandObject.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */