/*     */ package org.lwjgl.opengl;
/*     */ 
/*     */ import java.nio.ByteBuffer;
/*     */ import java.nio.IntBuffer;
/*     */ import org.lwjgl.BufferChecks;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public final class AMDPerformanceMonitor
/*     */ {
/*     */   public static final int GL_COUNTER_TYPE_AMD = 35776;
/*     */   public static final int GL_COUNTER_RANGE_AMD = 35777;
/*     */   public static final int GL_UNSIGNED_INT = 5125;
/*     */   public static final int GL_FLOAT = 5126;
/*     */   public static final int GL_UNSIGNED_INT64_AMD = 35778;
/*     */   public static final int GL_PERCENTAGE_AMD = 35779;
/*     */   public static final int GL_PERFMON_RESULT_AVAILABLE_AMD = 35780;
/*     */   public static final int GL_PERFMON_RESULT_SIZE_AMD = 35781;
/*     */   public static final int GL_PERFMON_RESULT_AMD = 35782;
/*     */   
/*     */   private static native void nglGetPerfMonitorGroupsAMD(IntBuffer paramIntBuffer1, int paramInt1, int paramInt2, IntBuffer paramIntBuffer2, int paramInt3, long paramLong);
/*     */   
/*     */   public static void glGetPerfMonitorGroupsAMD(IntBuffer numGroups, IntBuffer groups) {
/*  35 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  36 */     long function_pointer = caps.AMD_performance_monitor_glGetPerfMonitorGroupsAMD_pointer;
/*  37 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  38 */     if (numGroups != null)
/*  39 */       BufferChecks.checkBuffer(numGroups, 1); 
/*  40 */     BufferChecks.checkDirect(groups);
/*  41 */     nglGetPerfMonitorGroupsAMD(numGroups, (numGroups != null) ? numGroups.position() : 0, groups.remaining(), groups, groups.position(), function_pointer);
/*     */   }
/*     */ 
/*     */   
/*     */   public static void glGetPerfMonitorCountersAMD(int group, IntBuffer numCounters, IntBuffer maxActiveCounters, IntBuffer counters) {
/*  46 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  47 */     long function_pointer = caps.AMD_performance_monitor_glGetPerfMonitorCountersAMD_pointer;
/*  48 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  49 */     BufferChecks.checkBuffer(numCounters, 1);
/*  50 */     BufferChecks.checkBuffer(maxActiveCounters, 1);
/*  51 */     BufferChecks.checkDirect(counters);
/*  52 */     nglGetPerfMonitorCountersAMD(group, numCounters, numCounters.position(), maxActiveCounters, maxActiveCounters.position(), counters.remaining(), counters, counters.position(), function_pointer);
/*     */   }
/*     */ 
/*     */   
/*     */   public static void glGetPerfMonitorGroupStringAMD(int group, IntBuffer length, ByteBuffer groupString) {
/*  57 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  58 */     long function_pointer = caps.AMD_performance_monitor_glGetPerfMonitorGroupStringAMD_pointer;
/*  59 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  60 */     if (length != null)
/*  61 */       BufferChecks.checkBuffer(length, 1); 
/*  62 */     BufferChecks.checkDirect(groupString);
/*  63 */     nglGetPerfMonitorGroupStringAMD(group, groupString.remaining(), length, (length != null) ? length.position() : 0, groupString, groupString.position(), function_pointer);
/*     */   }
/*     */   private static native void nglGetPerfMonitorCountersAMD(int paramInt1, IntBuffer paramIntBuffer1, int paramInt2, IntBuffer paramIntBuffer2, int paramInt3, int paramInt4, IntBuffer paramIntBuffer3, int paramInt5, long paramLong);
/*     */   private static native void nglGetPerfMonitorGroupStringAMD(int paramInt1, int paramInt2, IntBuffer paramIntBuffer, int paramInt3, ByteBuffer paramByteBuffer, int paramInt4, long paramLong);
/*     */   
/*     */   public static String glGetPerfMonitorGroupStringAMD(int group, int bufSize) {
/*  69 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  70 */     long function_pointer = caps.AMD_performance_monitor_glGetPerfMonitorGroupStringAMD_pointer;
/*  71 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  72 */     IntBuffer groupString_length = APIUtils.getLengths();
/*  73 */     ByteBuffer groupString = APIUtils.getBufferByte(bufSize);
/*  74 */     nglGetPerfMonitorGroupStringAMD(group, bufSize, groupString_length, 0, groupString, groupString.position(), function_pointer);
/*  75 */     groupString.limit(groupString_length.get(0));
/*  76 */     return APIUtils.getString(groupString);
/*     */   }
/*     */   
/*     */   public static void glGetPerfMonitorCounterStringAMD(int group, int counter, IntBuffer length, ByteBuffer counterString) {
/*  80 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  81 */     long function_pointer = caps.AMD_performance_monitor_glGetPerfMonitorCounterStringAMD_pointer;
/*  82 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  83 */     if (length != null)
/*  84 */       BufferChecks.checkBuffer(length, 1); 
/*  85 */     BufferChecks.checkDirect(counterString);
/*  86 */     nglGetPerfMonitorCounterStringAMD(group, counter, counterString.remaining(), length, (length != null) ? length.position() : 0, counterString, counterString.position(), function_pointer);
/*     */   }
/*     */   
/*     */   private static native void nglGetPerfMonitorCounterStringAMD(int paramInt1, int paramInt2, int paramInt3, IntBuffer paramIntBuffer, int paramInt4, ByteBuffer paramByteBuffer, int paramInt5, long paramLong);
/*     */   
/*     */   public static String glGetPerfMonitorCounterStringAMD(int group, int counter, int bufSize) {
/*  92 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  93 */     long function_pointer = caps.AMD_performance_monitor_glGetPerfMonitorCounterStringAMD_pointer;
/*  94 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  95 */     IntBuffer counterString_length = APIUtils.getLengths();
/*  96 */     ByteBuffer counterString = APIUtils.getBufferByte(bufSize);
/*  97 */     nglGetPerfMonitorCounterStringAMD(group, counter, bufSize, counterString_length, 0, counterString, counterString.position(), function_pointer);
/*  98 */     counterString.limit(counterString_length.get(0));
/*  99 */     return APIUtils.getString(counterString);
/*     */   }
/*     */   
/*     */   public static void glGetPerfMonitorCounterInfoAMD(int group, int counter, int pname, ByteBuffer data) {
/* 103 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 104 */     long function_pointer = caps.AMD_performance_monitor_glGetPerfMonitorCounterInfoAMD_pointer;
/* 105 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 106 */     BufferChecks.checkBuffer(data, 16);
/* 107 */     nglGetPerfMonitorCounterInfoAMD(group, counter, pname, data, data.position(), function_pointer);
/*     */   }
/*     */   private static native void nglGetPerfMonitorCounterInfoAMD(int paramInt1, int paramInt2, int paramInt3, ByteBuffer paramByteBuffer, int paramInt4, long paramLong);
/*     */   
/*     */   public static void glGenPerfMonitorsAMD(IntBuffer monitors) {
/* 112 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 113 */     long function_pointer = caps.AMD_performance_monitor_glGenPerfMonitorsAMD_pointer;
/* 114 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 115 */     BufferChecks.checkDirect(monitors);
/* 116 */     nglGenPerfMonitorsAMD(monitors.remaining(), monitors, monitors.position(), function_pointer);
/*     */   }
/*     */   
/*     */   private static native void nglGenPerfMonitorsAMD(int paramInt1, IntBuffer paramIntBuffer, int paramInt2, long paramLong);
/*     */   
/*     */   public static int glGenPerfMonitorsAMD() {
/* 122 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 123 */     long function_pointer = caps.AMD_performance_monitor_glGenPerfMonitorsAMD_pointer;
/* 124 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 125 */     IntBuffer monitors = APIUtils.getBufferInt();
/* 126 */     nglGenPerfMonitorsAMD(1, monitors, monitors.position(), function_pointer);
/* 127 */     return monitors.get(0);
/*     */   }
/*     */   
/*     */   public static void glDeletePerfMonitorsAMD(IntBuffer monitors) {
/* 131 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 132 */     long function_pointer = caps.AMD_performance_monitor_glDeletePerfMonitorsAMD_pointer;
/* 133 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 134 */     BufferChecks.checkDirect(monitors);
/* 135 */     nglDeletePerfMonitorsAMD(monitors.remaining(), monitors, monitors.position(), function_pointer);
/*     */   }
/*     */   
/*     */   private static native void nglDeletePerfMonitorsAMD(int paramInt1, IntBuffer paramIntBuffer, int paramInt2, long paramLong);
/*     */   
/*     */   public static void glDeletePerfMonitorsAMD(int monitor) {
/* 141 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 142 */     long function_pointer = caps.AMD_performance_monitor_glDeletePerfMonitorsAMD_pointer;
/* 143 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 144 */     nglDeletePerfMonitorsAMD(1, APIUtils.getBufferInt().put(0, monitor), 0, function_pointer);
/*     */   }
/*     */   
/*     */   public static void glSelectPerfMonitorCountersAMD(int monitor, boolean enable, int group, IntBuffer counterList) {
/* 148 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 149 */     long function_pointer = caps.AMD_performance_monitor_glSelectPerfMonitorCountersAMD_pointer;
/* 150 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 151 */     BufferChecks.checkDirect(counterList);
/* 152 */     nglSelectPerfMonitorCountersAMD(monitor, enable, group, counterList.remaining(), counterList, counterList.position(), function_pointer);
/*     */   }
/*     */   
/*     */   private static native void nglSelectPerfMonitorCountersAMD(int paramInt1, boolean paramBoolean, int paramInt2, int paramInt3, IntBuffer paramIntBuffer, int paramInt4, long paramLong);
/*     */   
/*     */   public static void glSelectPerfMonitorCountersAMD(int monitor, boolean enable, int group, int counter) {
/* 158 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 159 */     long function_pointer = caps.AMD_performance_monitor_glSelectPerfMonitorCountersAMD_pointer;
/* 160 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 161 */     nglSelectPerfMonitorCountersAMD(monitor, enable, group, 1, APIUtils.getBufferInt().put(0, counter), 0, function_pointer);
/*     */   }
/*     */   
/*     */   public static void glBeginPerfMonitorAMD(int monitor) {
/* 165 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 166 */     long function_pointer = caps.AMD_performance_monitor_glBeginPerfMonitorAMD_pointer;
/* 167 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 168 */     nglBeginPerfMonitorAMD(monitor, function_pointer);
/*     */   }
/*     */   private static native void nglBeginPerfMonitorAMD(int paramInt, long paramLong);
/*     */   
/*     */   public static void glEndPerfMonitorAMD(int monitor) {
/* 173 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 174 */     long function_pointer = caps.AMD_performance_monitor_glEndPerfMonitorAMD_pointer;
/* 175 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 176 */     nglEndPerfMonitorAMD(monitor, function_pointer);
/*     */   }
/*     */   private static native void nglEndPerfMonitorAMD(int paramInt, long paramLong);
/*     */   
/*     */   public static void glGetPerfMonitorCounterDataAMD(int monitor, int pname, IntBuffer data, IntBuffer bytesWritten) {
/* 181 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 182 */     long function_pointer = caps.AMD_performance_monitor_glGetPerfMonitorCounterDataAMD_pointer;
/* 183 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 184 */     BufferChecks.checkDirect(data);
/* 185 */     if (bytesWritten != null)
/* 186 */       BufferChecks.checkBuffer(bytesWritten, 1); 
/* 187 */     nglGetPerfMonitorCounterDataAMD(monitor, pname, data.remaining(), data, data.position(), bytesWritten, (bytesWritten != null) ? bytesWritten.position() : 0, function_pointer);
/*     */   }
/*     */   
/*     */   private static native void nglGetPerfMonitorCounterDataAMD(int paramInt1, int paramInt2, int paramInt3, IntBuffer paramIntBuffer1, int paramInt4, IntBuffer paramIntBuffer2, int paramInt5, long paramLong);
/*     */   
/*     */   public static int glGetPerfMonitorCounterDataAMD(int monitor, int pname) {
/* 193 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 194 */     long function_pointer = caps.AMD_performance_monitor_glGetPerfMonitorCounterDataAMD_pointer;
/* 195 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 196 */     IntBuffer data = APIUtils.getBufferInt();
/* 197 */     nglGetPerfMonitorCounterDataAMD(monitor, pname, 4, data, data.position(), null, 0, function_pointer);
/* 198 */     return data.get(0);
/*     */   }
/*     */ }


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\org\lwjgl\opengl\AMDPerformanceMonitor.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */