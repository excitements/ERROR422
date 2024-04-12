/*      */ package org.lwjgl.opengl;
/*      */ 
/*      */ import java.nio.Buffer;
/*      */ import java.nio.ByteBuffer;
/*      */ import java.nio.DoubleBuffer;
/*      */ import java.nio.FloatBuffer;
/*      */ import java.nio.IntBuffer;
/*      */ import java.nio.ShortBuffer;
/*      */ import org.lwjgl.BufferChecks;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ public final class ARBImaging
/*      */ {
/*      */   public static final int GL_CONSTANT_COLOR = 32769;
/*      */   public static final int GL_ONE_MINUS_CONSTANT_COLOR = 32770;
/*      */   public static final int GL_CONSTANT_ALPHA = 32771;
/*      */   public static final int GL_ONE_MINUS_CONSTANT_ALPHA = 32772;
/*      */   public static final int GL_BLEND_COLOR = 32773;
/*      */   public static final int GL_FUNC_ADD = 32774;
/*      */   public static final int GL_MIN = 32775;
/*      */   public static final int GL_MAX = 32776;
/*      */   public static final int GL_BLEND_EQUATION = 32777;
/*      */   public static final int GL_FUNC_SUBTRACT = 32778;
/*      */   public static final int GL_FUNC_REVERSE_SUBTRACT = 32779;
/*      */   public static final int GL_COLOR_MATRIX = 32945;
/*      */   public static final int GL_COLOR_MATRIX_STACK_DEPTH = 32946;
/*      */   public static final int GL_MAX_COLOR_MATRIX_STACK_DEPTH = 32947;
/*      */   public static final int GL_POST_COLOR_MATRIX_RED_SCALE = 32948;
/*      */   public static final int GL_POST_COLOR_MATRIX_GREEN_SCALE = 32949;
/*      */   public static final int GL_POST_COLOR_MATRIX_BLUE_SCALE = 32950;
/*      */   public static final int GL_POST_COLOR_MATRIX_ALPHA_SCALE = 32951;
/*      */   public static final int GL_POST_COLOR_MATRIX_RED_BIAS = 32952;
/*      */   public static final int GL_POST_COLOR_MATRIX_GREEN_BIAS = 32953;
/*      */   public static final int GL_POST_COLOR_MATRIX_BLUE_BIAS = 32954;
/*      */   public static final int GL_POST_COLOR_MATRIX_ALPHA_BIAS = 32955;
/*      */   public static final int GL_COLOR_TABLE = 32976;
/*      */   public static final int GL_POST_CONVOLUTION_COLOR_TABLE = 32977;
/*      */   public static final int GL_POST_COLOR_MATRIX_COLOR_TABLE = 32978;
/*      */   public static final int GL_PROXY_COLOR_TABLE = 32979;
/*      */   public static final int GL_PROXY_POST_CONVOLUTION_COLOR_TABLE = 32980;
/*      */   public static final int GL_PROXY_POST_COLOR_MATRIX_COLOR_TABLE = 32981;
/*      */   public static final int GL_COLOR_TABLE_SCALE = 32982;
/*      */   public static final int GL_COLOR_TABLE_BIAS = 32983;
/*      */   public static final int GL_COLOR_TABLE_FORMAT = 32984;
/*      */   public static final int GL_COLOR_TABLE_WIDTH = 32985;
/*      */   public static final int GL_COLOR_TABLE_RED_SIZE = 32986;
/*      */   public static final int GL_COLOR_TABLE_GREEN_SIZE = 32987;
/*      */   public static final int GL_COLOR_TABLE_BLUE_SIZE = 32988;
/*      */   public static final int GL_COLOR_TABLE_ALPHA_SIZE = 32989;
/*      */   public static final int GL_COLOR_TABLE_LUMINANCE_SIZE = 32990;
/*      */   public static final int GL_COLOR_TABLE_INTENSITY_SIZE = 32991;
/*      */   public static final int GL_CONVOLUTION_1D = 32784;
/*      */   public static final int GL_CONVOLUTION_2D = 32785;
/*      */   public static final int GL_SEPARABLE_2D = 32786;
/*      */   public static final int GL_CONVOLUTION_BORDER_MODE = 32787;
/*      */   public static final int GL_CONVOLUTION_FILTER_SCALE = 32788;
/*      */   public static final int GL_CONVOLUTION_FILTER_BIAS = 32789;
/*      */   public static final int GL_REDUCE = 32790;
/*      */   public static final int GL_CONVOLUTION_FORMAT = 32791;
/*      */   public static final int GL_CONVOLUTION_WIDTH = 32792;
/*      */   public static final int GL_CONVOLUTION_HEIGHT = 32793;
/*      */   public static final int GL_MAX_CONVOLUTION_WIDTH = 32794;
/*      */   public static final int GL_MAX_CONVOLUTION_HEIGHT = 32795;
/*      */   public static final int GL_POST_CONVOLUTION_RED_SCALE = 32796;
/*      */   public static final int GL_POST_CONVOLUTION_GREEN_SCALE = 32797;
/*      */   public static final int GL_POST_CONVOLUTION_BLUE_SCALE = 32798;
/*      */   public static final int GL_POST_CONVOLUTION_ALPHA_SCALE = 32799;
/*      */   public static final int GL_POST_CONVOLUTION_RED_BIAS = 32800;
/*      */   public static final int GL_POST_CONVOLUTION_GREEN_BIAS = 32801;
/*      */   public static final int GL_POST_CONVOLUTION_BLUE_BIAS = 32802;
/*      */   public static final int GL_POST_CONVOLUTION_ALPHA_BIAS = 32803;
/*      */   public static final int GL_IGNORE_BORDER = 33104;
/*      */   public static final int GL_CONSTANT_BORDER = 33105;
/*      */   public static final int GL_REPLICATE_BORDER = 33107;
/*      */   public static final int GL_CONVOLUTION_BORDER_COLOR = 33108;
/*      */   public static final int GL_HISTOGRAM = 32804;
/*      */   public static final int GL_PROXY_HISTOGRAM = 32805;
/*      */   public static final int GL_HISTOGRAM_WIDTH = 32806;
/*      */   public static final int GL_HISTOGRAM_FORMAT = 32807;
/*      */   public static final int GL_HISTOGRAM_RED_SIZE = 32808;
/*      */   public static final int GL_HISTOGRAM_GREEN_SIZE = 32809;
/*      */   public static final int GL_HISTOGRAM_BLUE_SIZE = 32810;
/*      */   public static final int GL_HISTOGRAM_ALPHA_SIZE = 32811;
/*      */   public static final int GL_HISTOGRAM_LUMINANCE_SIZE = 32812;
/*      */   public static final int GL_HISTOGRAM_SINK = 32813;
/*      */   public static final int GL_MINMAX = 32814;
/*      */   public static final int GL_MINMAX_FORMAT = 32815;
/*      */   public static final int GL_MINMAX_SINK = 32816;
/*      */   public static final int GL_TABLE_TOO_LARGE = 32817;
/*      */   
/*      */   public static void glColorTable(int target, int internalFormat, int width, int format, int type, ByteBuffer data) {
/*   99 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  100 */     long function_pointer = caps.ARB_imaging_glColorTable_pointer;
/*  101 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  102 */     GLChecks.ensureUnpackPBOdisabled(caps);
/*  103 */     BufferChecks.checkBuffer(data, 256);
/*  104 */     nglColorTable(target, internalFormat, width, format, type, data, data.position(), function_pointer);
/*      */   }
/*      */   public static void glColorTable(int target, int internalFormat, int width, int format, int type, DoubleBuffer data) {
/*  107 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  108 */     long function_pointer = caps.ARB_imaging_glColorTable_pointer;
/*  109 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  110 */     GLChecks.ensureUnpackPBOdisabled(caps);
/*  111 */     BufferChecks.checkBuffer(data, 256);
/*  112 */     nglColorTable(target, internalFormat, width, format, type, data, data.position() << 3, function_pointer);
/*      */   }
/*      */   public static void glColorTable(int target, int internalFormat, int width, int format, int type, FloatBuffer data) {
/*  115 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  116 */     long function_pointer = caps.ARB_imaging_glColorTable_pointer;
/*  117 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  118 */     GLChecks.ensureUnpackPBOdisabled(caps);
/*  119 */     BufferChecks.checkBuffer(data, 256);
/*  120 */     nglColorTable(target, internalFormat, width, format, type, data, data.position() << 2, function_pointer);
/*      */   }
/*      */   
/*      */   public static void glColorTable(int target, int internalFormat, int width, int format, int type, long data_buffer_offset) {
/*  124 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  125 */     long function_pointer = caps.ARB_imaging_glColorTable_pointer;
/*  126 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  127 */     GLChecks.ensureUnpackPBOenabled(caps);
/*  128 */     nglColorTableBO(target, internalFormat, width, format, type, data_buffer_offset, function_pointer);
/*      */   }
/*      */   private static native void nglColorTable(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, Buffer paramBuffer, int paramInt6, long paramLong);
/*      */   private static native void nglColorTableBO(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, long paramLong1, long paramLong2);
/*      */   public static void glColorSubTable(int target, int start, int count, int format, int type, ByteBuffer data) {
/*  133 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  134 */     long function_pointer = caps.ARB_imaging_glColorSubTable_pointer;
/*  135 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  136 */     GLChecks.ensureUnpackPBOdisabled(caps);
/*  137 */     BufferChecks.checkBuffer(data, 256);
/*  138 */     nglColorSubTable(target, start, count, format, type, data, data.position(), function_pointer);
/*      */   }
/*      */   public static void glColorSubTable(int target, int start, int count, int format, int type, DoubleBuffer data) {
/*  141 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  142 */     long function_pointer = caps.ARB_imaging_glColorSubTable_pointer;
/*  143 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  144 */     GLChecks.ensureUnpackPBOdisabled(caps);
/*  145 */     BufferChecks.checkBuffer(data, 256);
/*  146 */     nglColorSubTable(target, start, count, format, type, data, data.position() << 3, function_pointer);
/*      */   }
/*      */   public static void glColorSubTable(int target, int start, int count, int format, int type, FloatBuffer data) {
/*  149 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  150 */     long function_pointer = caps.ARB_imaging_glColorSubTable_pointer;
/*  151 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  152 */     GLChecks.ensureUnpackPBOdisabled(caps);
/*  153 */     BufferChecks.checkBuffer(data, 256);
/*  154 */     nglColorSubTable(target, start, count, format, type, data, data.position() << 2, function_pointer);
/*      */   }
/*      */   private static native void nglColorSubTable(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, Buffer paramBuffer, int paramInt6, long paramLong);
/*      */   public static void glColorSubTable(int target, int start, int count, int format, int type, long data_buffer_offset) {
/*  158 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  159 */     long function_pointer = caps.ARB_imaging_glColorSubTable_pointer;
/*  160 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  161 */     GLChecks.ensureUnpackPBOenabled(caps);
/*  162 */     nglColorSubTableBO(target, start, count, format, type, data_buffer_offset, function_pointer);
/*      */   }
/*      */   private static native void nglColorSubTableBO(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, long paramLong1, long paramLong2);
/*      */   
/*      */   public static void glColorTableParameter(int target, int pname, IntBuffer params) {
/*  167 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  168 */     long function_pointer = caps.ARB_imaging_glColorTableParameteriv_pointer;
/*  169 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  170 */     BufferChecks.checkBuffer(params, 4);
/*  171 */     nglColorTableParameteriv(target, pname, params, params.position(), function_pointer);
/*      */   }
/*      */   private static native void nglColorTableParameteriv(int paramInt1, int paramInt2, IntBuffer paramIntBuffer, int paramInt3, long paramLong);
/*      */   
/*      */   public static void glColorTableParameter(int target, int pname, FloatBuffer params) {
/*  176 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  177 */     long function_pointer = caps.ARB_imaging_glColorTableParameterfv_pointer;
/*  178 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  179 */     BufferChecks.checkBuffer(params, 4);
/*  180 */     nglColorTableParameterfv(target, pname, params, params.position(), function_pointer);
/*      */   }
/*      */   private static native void nglColorTableParameterfv(int paramInt1, int paramInt2, FloatBuffer paramFloatBuffer, int paramInt3, long paramLong);
/*      */   
/*      */   public static void glCopyColorSubTable(int target, int start, int x, int y, int width) {
/*  185 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  186 */     long function_pointer = caps.ARB_imaging_glCopyColorSubTable_pointer;
/*  187 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  188 */     nglCopyColorSubTable(target, start, x, y, width, function_pointer);
/*      */   }
/*      */   private static native void nglCopyColorSubTable(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, long paramLong);
/*      */   
/*      */   public static void glCopyColorTable(int target, int internalformat, int x, int y, int width) {
/*  193 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  194 */     long function_pointer = caps.ARB_imaging_glCopyColorTable_pointer;
/*  195 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  196 */     nglCopyColorTable(target, internalformat, x, y, width, function_pointer);
/*      */   }
/*      */   private static native void nglCopyColorTable(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, long paramLong);
/*      */   
/*      */   public static void glGetColorTable(int target, int format, int type, ByteBuffer data) {
/*  201 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  202 */     long function_pointer = caps.ARB_imaging_glGetColorTable_pointer;
/*  203 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  204 */     BufferChecks.checkBuffer(data, 256);
/*  205 */     nglGetColorTable(target, format, type, data, data.position(), function_pointer);
/*      */   }
/*      */   public static void glGetColorTable(int target, int format, int type, DoubleBuffer data) {
/*  208 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  209 */     long function_pointer = caps.ARB_imaging_glGetColorTable_pointer;
/*  210 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  211 */     BufferChecks.checkBuffer(data, 256);
/*  212 */     nglGetColorTable(target, format, type, data, data.position() << 3, function_pointer);
/*      */   }
/*      */   public static void glGetColorTable(int target, int format, int type, FloatBuffer data) {
/*  215 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  216 */     long function_pointer = caps.ARB_imaging_glGetColorTable_pointer;
/*  217 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  218 */     BufferChecks.checkBuffer(data, 256);
/*  219 */     nglGetColorTable(target, format, type, data, data.position() << 2, function_pointer);
/*      */   }
/*      */   private static native void nglGetColorTable(int paramInt1, int paramInt2, int paramInt3, Buffer paramBuffer, int paramInt4, long paramLong);
/*      */   
/*      */   public static void glGetColorTableParameter(int target, int pname, IntBuffer params) {
/*  224 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  225 */     long function_pointer = caps.ARB_imaging_glGetColorTableParameteriv_pointer;
/*  226 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  227 */     BufferChecks.checkBuffer(params, 4);
/*  228 */     nglGetColorTableParameteriv(target, pname, params, params.position(), function_pointer);
/*      */   }
/*      */   private static native void nglGetColorTableParameteriv(int paramInt1, int paramInt2, IntBuffer paramIntBuffer, int paramInt3, long paramLong);
/*      */   
/*      */   public static void glGetColorTableParameter(int target, int pname, FloatBuffer params) {
/*  233 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  234 */     long function_pointer = caps.ARB_imaging_glGetColorTableParameterfv_pointer;
/*  235 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  236 */     BufferChecks.checkBuffer(params, 4);
/*  237 */     nglGetColorTableParameterfv(target, pname, params, params.position(), function_pointer);
/*      */   }
/*      */   private static native void nglGetColorTableParameterfv(int paramInt1, int paramInt2, FloatBuffer paramFloatBuffer, int paramInt3, long paramLong);
/*      */   
/*      */   public static void glBlendEquation(int mode) {
/*  242 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  243 */     long function_pointer = caps.ARB_imaging_glBlendEquation_pointer;
/*  244 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  245 */     nglBlendEquation(mode, function_pointer);
/*      */   }
/*      */   private static native void nglBlendEquation(int paramInt, long paramLong);
/*      */   
/*      */   public static void glBlendColor(float red, float green, float blue, float alpha) {
/*  250 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  251 */     long function_pointer = caps.ARB_imaging_glBlendColor_pointer;
/*  252 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  253 */     nglBlendColor(red, green, blue, alpha, function_pointer);
/*      */   }
/*      */   private static native void nglBlendColor(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, long paramLong);
/*      */   
/*      */   public static void glHistogram(int target, int width, int internalformat, boolean sink) {
/*  258 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  259 */     long function_pointer = caps.ARB_imaging_glHistogram_pointer;
/*  260 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  261 */     nglHistogram(target, width, internalformat, sink, function_pointer);
/*      */   }
/*      */   private static native void nglHistogram(int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean, long paramLong);
/*      */   
/*      */   public static void glResetHistogram(int target) {
/*  266 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  267 */     long function_pointer = caps.ARB_imaging_glResetHistogram_pointer;
/*  268 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  269 */     nglResetHistogram(target, function_pointer);
/*      */   }
/*      */   private static native void nglResetHistogram(int paramInt, long paramLong);
/*      */   
/*      */   public static void glGetHistogram(int target, boolean reset, int format, int type, ByteBuffer values) {
/*  274 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  275 */     long function_pointer = caps.ARB_imaging_glGetHistogram_pointer;
/*  276 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  277 */     GLChecks.ensurePackPBOdisabled(caps);
/*  278 */     BufferChecks.checkBuffer(values, 256);
/*  279 */     nglGetHistogram(target, reset, format, type, values, values.position(), function_pointer);
/*      */   }
/*      */   public static void glGetHistogram(int target, boolean reset, int format, int type, DoubleBuffer values) {
/*  282 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  283 */     long function_pointer = caps.ARB_imaging_glGetHistogram_pointer;
/*  284 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  285 */     GLChecks.ensurePackPBOdisabled(caps);
/*  286 */     BufferChecks.checkBuffer(values, 256);
/*  287 */     nglGetHistogram(target, reset, format, type, values, values.position() << 3, function_pointer);
/*      */   }
/*      */   public static void glGetHistogram(int target, boolean reset, int format, int type, FloatBuffer values) {
/*  290 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  291 */     long function_pointer = caps.ARB_imaging_glGetHistogram_pointer;
/*  292 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  293 */     GLChecks.ensurePackPBOdisabled(caps);
/*  294 */     BufferChecks.checkBuffer(values, 256);
/*  295 */     nglGetHistogram(target, reset, format, type, values, values.position() << 2, function_pointer);
/*      */   }
/*      */   public static void glGetHistogram(int target, boolean reset, int format, int type, IntBuffer values) {
/*  298 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  299 */     long function_pointer = caps.ARB_imaging_glGetHistogram_pointer;
/*  300 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  301 */     GLChecks.ensurePackPBOdisabled(caps);
/*  302 */     BufferChecks.checkBuffer(values, 256);
/*  303 */     nglGetHistogram(target, reset, format, type, values, values.position() << 2, function_pointer);
/*      */   }
/*      */   public static void glGetHistogram(int target, boolean reset, int format, int type, ShortBuffer values) {
/*  306 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  307 */     long function_pointer = caps.ARB_imaging_glGetHistogram_pointer;
/*  308 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  309 */     GLChecks.ensurePackPBOdisabled(caps);
/*  310 */     BufferChecks.checkBuffer(values, 256);
/*  311 */     nglGetHistogram(target, reset, format, type, values, values.position() << 1, function_pointer);
/*      */   }
/*      */   private static native void nglGetHistogram(int paramInt1, boolean paramBoolean, int paramInt2, int paramInt3, Buffer paramBuffer, int paramInt4, long paramLong);
/*      */   public static void glGetHistogram(int target, boolean reset, int format, int type, long values_buffer_offset) {
/*  315 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  316 */     long function_pointer = caps.ARB_imaging_glGetHistogram_pointer;
/*  317 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  318 */     GLChecks.ensurePackPBOenabled(caps);
/*  319 */     nglGetHistogramBO(target, reset, format, type, values_buffer_offset, function_pointer);
/*      */   }
/*      */   private static native void nglGetHistogramBO(int paramInt1, boolean paramBoolean, int paramInt2, int paramInt3, long paramLong1, long paramLong2);
/*      */   
/*      */   public static void glGetHistogramParameter(int target, int pname, FloatBuffer params) {
/*  324 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  325 */     long function_pointer = caps.ARB_imaging_glGetHistogramParameterfv_pointer;
/*  326 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  327 */     BufferChecks.checkBuffer(params, 256);
/*  328 */     nglGetHistogramParameterfv(target, pname, params, params.position(), function_pointer);
/*      */   }
/*      */   private static native void nglGetHistogramParameterfv(int paramInt1, int paramInt2, FloatBuffer paramFloatBuffer, int paramInt3, long paramLong);
/*      */   
/*      */   public static void glGetHistogramParameter(int target, int pname, IntBuffer params) {
/*  333 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  334 */     long function_pointer = caps.ARB_imaging_glGetHistogramParameteriv_pointer;
/*  335 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  336 */     BufferChecks.checkBuffer(params, 256);
/*  337 */     nglGetHistogramParameteriv(target, pname, params, params.position(), function_pointer);
/*      */   }
/*      */   private static native void nglGetHistogramParameteriv(int paramInt1, int paramInt2, IntBuffer paramIntBuffer, int paramInt3, long paramLong);
/*      */   
/*      */   public static void glMinmax(int target, int internalformat, boolean sink) {
/*  342 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  343 */     long function_pointer = caps.ARB_imaging_glMinmax_pointer;
/*  344 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  345 */     nglMinmax(target, internalformat, sink, function_pointer);
/*      */   }
/*      */   private static native void nglMinmax(int paramInt1, int paramInt2, boolean paramBoolean, long paramLong);
/*      */   
/*      */   public static void glResetMinmax(int target) {
/*  350 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  351 */     long function_pointer = caps.ARB_imaging_glResetMinmax_pointer;
/*  352 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  353 */     nglResetMinmax(target, function_pointer);
/*      */   }
/*      */   private static native void nglResetMinmax(int paramInt, long paramLong);
/*      */   
/*      */   public static void glGetMinmax(int target, boolean reset, int format, int types, ByteBuffer values) {
/*  358 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  359 */     long function_pointer = caps.ARB_imaging_glGetMinmax_pointer;
/*  360 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  361 */     GLChecks.ensurePackPBOdisabled(caps);
/*  362 */     BufferChecks.checkBuffer(values, 4);
/*  363 */     nglGetMinmax(target, reset, format, types, values, values.position(), function_pointer);
/*      */   }
/*      */   public static void glGetMinmax(int target, boolean reset, int format, int types, DoubleBuffer values) {
/*  366 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  367 */     long function_pointer = caps.ARB_imaging_glGetMinmax_pointer;
/*  368 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  369 */     GLChecks.ensurePackPBOdisabled(caps);
/*  370 */     BufferChecks.checkBuffer(values, 4);
/*  371 */     nglGetMinmax(target, reset, format, types, values, values.position() << 3, function_pointer);
/*      */   }
/*      */   public static void glGetMinmax(int target, boolean reset, int format, int types, FloatBuffer values) {
/*  374 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  375 */     long function_pointer = caps.ARB_imaging_glGetMinmax_pointer;
/*  376 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  377 */     GLChecks.ensurePackPBOdisabled(caps);
/*  378 */     BufferChecks.checkBuffer(values, 4);
/*  379 */     nglGetMinmax(target, reset, format, types, values, values.position() << 2, function_pointer);
/*      */   }
/*      */   public static void glGetMinmax(int target, boolean reset, int format, int types, IntBuffer values) {
/*  382 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  383 */     long function_pointer = caps.ARB_imaging_glGetMinmax_pointer;
/*  384 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  385 */     GLChecks.ensurePackPBOdisabled(caps);
/*  386 */     BufferChecks.checkBuffer(values, 4);
/*  387 */     nglGetMinmax(target, reset, format, types, values, values.position() << 2, function_pointer);
/*      */   }
/*      */   public static void glGetMinmax(int target, boolean reset, int format, int types, ShortBuffer values) {
/*  390 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  391 */     long function_pointer = caps.ARB_imaging_glGetMinmax_pointer;
/*  392 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  393 */     GLChecks.ensurePackPBOdisabled(caps);
/*  394 */     BufferChecks.checkBuffer(values, 4);
/*  395 */     nglGetMinmax(target, reset, format, types, values, values.position() << 1, function_pointer);
/*      */   }
/*      */   private static native void nglGetMinmax(int paramInt1, boolean paramBoolean, int paramInt2, int paramInt3, Buffer paramBuffer, int paramInt4, long paramLong);
/*      */   public static void glGetMinmax(int target, boolean reset, int format, int types, long values_buffer_offset) {
/*  399 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  400 */     long function_pointer = caps.ARB_imaging_glGetMinmax_pointer;
/*  401 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  402 */     GLChecks.ensurePackPBOenabled(caps);
/*  403 */     nglGetMinmaxBO(target, reset, format, types, values_buffer_offset, function_pointer);
/*      */   }
/*      */   private static native void nglGetMinmaxBO(int paramInt1, boolean paramBoolean, int paramInt2, int paramInt3, long paramLong1, long paramLong2);
/*      */   
/*      */   public static void glGetMinmaxParameter(int target, int pname, FloatBuffer params) {
/*  408 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  409 */     long function_pointer = caps.ARB_imaging_glGetMinmaxParameterfv_pointer;
/*  410 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  411 */     BufferChecks.checkBuffer(params, 4);
/*  412 */     nglGetMinmaxParameterfv(target, pname, params, params.position(), function_pointer);
/*      */   }
/*      */   private static native void nglGetMinmaxParameterfv(int paramInt1, int paramInt2, FloatBuffer paramFloatBuffer, int paramInt3, long paramLong);
/*      */   
/*      */   public static void glGetMinmaxParameter(int target, int pname, IntBuffer params) {
/*  417 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  418 */     long function_pointer = caps.ARB_imaging_glGetMinmaxParameteriv_pointer;
/*  419 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  420 */     BufferChecks.checkBuffer(params, 4);
/*  421 */     nglGetMinmaxParameteriv(target, pname, params, params.position(), function_pointer);
/*      */   }
/*      */   private static native void nglGetMinmaxParameteriv(int paramInt1, int paramInt2, IntBuffer paramIntBuffer, int paramInt3, long paramLong);
/*      */   
/*      */   public static void glConvolutionFilter1D(int target, int internalformat, int width, int format, int type, ByteBuffer image) {
/*  426 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  427 */     long function_pointer = caps.ARB_imaging_glConvolutionFilter1D_pointer;
/*  428 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  429 */     GLChecks.ensureUnpackPBOdisabled(caps);
/*  430 */     BufferChecks.checkBuffer(image, GLChecks.calculateImageStorage(image, format, type, width, 1, 1));
/*  431 */     nglConvolutionFilter1D(target, internalformat, width, format, type, image, image.position(), function_pointer);
/*      */   }
/*      */   public static void glConvolutionFilter1D(int target, int internalformat, int width, int format, int type, DoubleBuffer image) {
/*  434 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  435 */     long function_pointer = caps.ARB_imaging_glConvolutionFilter1D_pointer;
/*  436 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  437 */     GLChecks.ensureUnpackPBOdisabled(caps);
/*  438 */     BufferChecks.checkBuffer(image, GLChecks.calculateImageStorage(image, format, type, width, 1, 1));
/*  439 */     nglConvolutionFilter1D(target, internalformat, width, format, type, image, image.position() << 3, function_pointer);
/*      */   }
/*      */   public static void glConvolutionFilter1D(int target, int internalformat, int width, int format, int type, FloatBuffer image) {
/*  442 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  443 */     long function_pointer = caps.ARB_imaging_glConvolutionFilter1D_pointer;
/*  444 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  445 */     GLChecks.ensureUnpackPBOdisabled(caps);
/*  446 */     BufferChecks.checkBuffer(image, GLChecks.calculateImageStorage(image, format, type, width, 1, 1));
/*  447 */     nglConvolutionFilter1D(target, internalformat, width, format, type, image, image.position() << 2, function_pointer);
/*      */   }
/*      */   public static void glConvolutionFilter1D(int target, int internalformat, int width, int format, int type, IntBuffer image) {
/*  450 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  451 */     long function_pointer = caps.ARB_imaging_glConvolutionFilter1D_pointer;
/*  452 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  453 */     GLChecks.ensureUnpackPBOdisabled(caps);
/*  454 */     BufferChecks.checkBuffer(image, GLChecks.calculateImageStorage(image, format, type, width, 1, 1));
/*  455 */     nglConvolutionFilter1D(target, internalformat, width, format, type, image, image.position() << 2, function_pointer);
/*      */   }
/*      */   public static void glConvolutionFilter1D(int target, int internalformat, int width, int format, int type, ShortBuffer image) {
/*  458 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  459 */     long function_pointer = caps.ARB_imaging_glConvolutionFilter1D_pointer;
/*  460 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  461 */     GLChecks.ensureUnpackPBOdisabled(caps);
/*  462 */     BufferChecks.checkBuffer(image, GLChecks.calculateImageStorage(image, format, type, width, 1, 1));
/*  463 */     nglConvolutionFilter1D(target, internalformat, width, format, type, image, image.position() << 1, function_pointer);
/*      */   }
/*      */   private static native void nglConvolutionFilter1D(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, Buffer paramBuffer, int paramInt6, long paramLong);
/*      */   public static void glConvolutionFilter1D(int target, int internalformat, int width, int format, int type, long image_buffer_offset) {
/*  467 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  468 */     long function_pointer = caps.ARB_imaging_glConvolutionFilter1D_pointer;
/*  469 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  470 */     GLChecks.ensureUnpackPBOenabled(caps);
/*  471 */     nglConvolutionFilter1DBO(target, internalformat, width, format, type, image_buffer_offset, function_pointer);
/*      */   }
/*      */   private static native void nglConvolutionFilter1DBO(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, long paramLong1, long paramLong2);
/*      */   
/*      */   public static void glConvolutionFilter2D(int target, int internalformat, int width, int height, int format, int type, ByteBuffer image) {
/*  476 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  477 */     long function_pointer = caps.ARB_imaging_glConvolutionFilter2D_pointer;
/*  478 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  479 */     GLChecks.ensureUnpackPBOdisabled(caps);
/*  480 */     BufferChecks.checkBuffer(image, GLChecks.calculateImageStorage(image, format, type, width, height, 1));
/*  481 */     nglConvolutionFilter2D(target, internalformat, width, height, format, type, image, image.position(), function_pointer);
/*      */   }
/*      */   public static void glConvolutionFilter2D(int target, int internalformat, int width, int height, int format, int type, IntBuffer image) {
/*  484 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  485 */     long function_pointer = caps.ARB_imaging_glConvolutionFilter2D_pointer;
/*  486 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  487 */     GLChecks.ensureUnpackPBOdisabled(caps);
/*  488 */     BufferChecks.checkBuffer(image, GLChecks.calculateImageStorage(image, format, type, width, height, 1));
/*  489 */     nglConvolutionFilter2D(target, internalformat, width, height, format, type, image, image.position() << 2, function_pointer);
/*      */   }
/*      */   public static void glConvolutionFilter2D(int target, int internalformat, int width, int height, int format, int type, ShortBuffer image) {
/*  492 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  493 */     long function_pointer = caps.ARB_imaging_glConvolutionFilter2D_pointer;
/*  494 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  495 */     GLChecks.ensureUnpackPBOdisabled(caps);
/*  496 */     BufferChecks.checkBuffer(image, GLChecks.calculateImageStorage(image, format, type, width, height, 1));
/*  497 */     nglConvolutionFilter2D(target, internalformat, width, height, format, type, image, image.position() << 1, function_pointer);
/*      */   }
/*      */   private static native void nglConvolutionFilter2D(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, Buffer paramBuffer, int paramInt7, long paramLong);
/*      */   public static void glConvolutionFilter2D(int target, int internalformat, int width, int height, int format, int type, long image_buffer_offset) {
/*  501 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  502 */     long function_pointer = caps.ARB_imaging_glConvolutionFilter2D_pointer;
/*  503 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  504 */     GLChecks.ensureUnpackPBOenabled(caps);
/*  505 */     nglConvolutionFilter2DBO(target, internalformat, width, height, format, type, image_buffer_offset, function_pointer);
/*      */   }
/*      */   private static native void nglConvolutionFilter2DBO(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, long paramLong1, long paramLong2);
/*      */   
/*      */   public static void glConvolutionParameterf(int target, int pname, float params) {
/*  510 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  511 */     long function_pointer = caps.ARB_imaging_glConvolutionParameterf_pointer;
/*  512 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  513 */     nglConvolutionParameterf(target, pname, params, function_pointer);
/*      */   }
/*      */   private static native void nglConvolutionParameterf(int paramInt1, int paramInt2, float paramFloat, long paramLong);
/*      */   
/*      */   public static void glConvolutionParameter(int target, int pname, FloatBuffer params) {
/*  518 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  519 */     long function_pointer = caps.ARB_imaging_glConvolutionParameterfv_pointer;
/*  520 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  521 */     BufferChecks.checkBuffer(params, 4);
/*  522 */     nglConvolutionParameterfv(target, pname, params, params.position(), function_pointer);
/*      */   }
/*      */   private static native void nglConvolutionParameterfv(int paramInt1, int paramInt2, FloatBuffer paramFloatBuffer, int paramInt3, long paramLong);
/*      */   
/*      */   public static void glConvolutionParameteri(int target, int pname, int params) {
/*  527 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  528 */     long function_pointer = caps.ARB_imaging_glConvolutionParameteri_pointer;
/*  529 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  530 */     nglConvolutionParameteri(target, pname, params, function_pointer);
/*      */   }
/*      */   private static native void nglConvolutionParameteri(int paramInt1, int paramInt2, int paramInt3, long paramLong);
/*      */   
/*      */   public static void glConvolutionParameter(int target, int pname, IntBuffer params) {
/*  535 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  536 */     long function_pointer = caps.ARB_imaging_glConvolutionParameteriv_pointer;
/*  537 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  538 */     BufferChecks.checkBuffer(params, 4);
/*  539 */     nglConvolutionParameteriv(target, pname, params, params.position(), function_pointer);
/*      */   }
/*      */   private static native void nglConvolutionParameteriv(int paramInt1, int paramInt2, IntBuffer paramIntBuffer, int paramInt3, long paramLong);
/*      */   
/*      */   public static void glCopyConvolutionFilter1D(int target, int internalformat, int x, int y, int width) {
/*  544 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  545 */     long function_pointer = caps.ARB_imaging_glCopyConvolutionFilter1D_pointer;
/*  546 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  547 */     nglCopyConvolutionFilter1D(target, internalformat, x, y, width, function_pointer);
/*      */   }
/*      */   private static native void nglCopyConvolutionFilter1D(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, long paramLong);
/*      */   
/*      */   public static void glCopyConvolutionFilter2D(int target, int internalformat, int x, int y, int width, int height) {
/*  552 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  553 */     long function_pointer = caps.ARB_imaging_glCopyConvolutionFilter2D_pointer;
/*  554 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  555 */     nglCopyConvolutionFilter2D(target, internalformat, x, y, width, height, function_pointer);
/*      */   }
/*      */   private static native void nglCopyConvolutionFilter2D(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, long paramLong);
/*      */   
/*      */   public static void glGetConvolutionFilter(int target, int format, int type, ByteBuffer image) {
/*  560 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  561 */     long function_pointer = caps.ARB_imaging_glGetConvolutionFilter_pointer;
/*  562 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  563 */     GLChecks.ensurePackPBOdisabled(caps);
/*  564 */     BufferChecks.checkDirect(image);
/*  565 */     nglGetConvolutionFilter(target, format, type, image, image.position(), function_pointer);
/*      */   }
/*      */   public static void glGetConvolutionFilter(int target, int format, int type, DoubleBuffer image) {
/*  568 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  569 */     long function_pointer = caps.ARB_imaging_glGetConvolutionFilter_pointer;
/*  570 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  571 */     GLChecks.ensurePackPBOdisabled(caps);
/*  572 */     BufferChecks.checkDirect(image);
/*  573 */     nglGetConvolutionFilter(target, format, type, image, image.position() << 3, function_pointer);
/*      */   }
/*      */   public static void glGetConvolutionFilter(int target, int format, int type, FloatBuffer image) {
/*  576 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  577 */     long function_pointer = caps.ARB_imaging_glGetConvolutionFilter_pointer;
/*  578 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  579 */     GLChecks.ensurePackPBOdisabled(caps);
/*  580 */     BufferChecks.checkDirect(image);
/*  581 */     nglGetConvolutionFilter(target, format, type, image, image.position() << 2, function_pointer);
/*      */   }
/*      */   public static void glGetConvolutionFilter(int target, int format, int type, IntBuffer image) {
/*  584 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  585 */     long function_pointer = caps.ARB_imaging_glGetConvolutionFilter_pointer;
/*  586 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  587 */     GLChecks.ensurePackPBOdisabled(caps);
/*  588 */     BufferChecks.checkDirect(image);
/*  589 */     nglGetConvolutionFilter(target, format, type, image, image.position() << 2, function_pointer);
/*      */   }
/*      */   public static void glGetConvolutionFilter(int target, int format, int type, ShortBuffer image) {
/*  592 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  593 */     long function_pointer = caps.ARB_imaging_glGetConvolutionFilter_pointer;
/*  594 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  595 */     GLChecks.ensurePackPBOdisabled(caps);
/*  596 */     BufferChecks.checkDirect(image);
/*  597 */     nglGetConvolutionFilter(target, format, type, image, image.position() << 1, function_pointer);
/*      */   }
/*      */   private static native void nglGetConvolutionFilter(int paramInt1, int paramInt2, int paramInt3, Buffer paramBuffer, int paramInt4, long paramLong);
/*      */   public static void glGetConvolutionFilter(int target, int format, int type, long image_buffer_offset) {
/*  601 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  602 */     long function_pointer = caps.ARB_imaging_glGetConvolutionFilter_pointer;
/*  603 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  604 */     GLChecks.ensurePackPBOenabled(caps);
/*  605 */     nglGetConvolutionFilterBO(target, format, type, image_buffer_offset, function_pointer);
/*      */   }
/*      */   private static native void nglGetConvolutionFilterBO(int paramInt1, int paramInt2, int paramInt3, long paramLong1, long paramLong2);
/*      */   
/*      */   public static void glGetConvolutionParameter(int target, int pname, FloatBuffer params) {
/*  610 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  611 */     long function_pointer = caps.ARB_imaging_glGetConvolutionParameterfv_pointer;
/*  612 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  613 */     BufferChecks.checkBuffer(params, 4);
/*  614 */     nglGetConvolutionParameterfv(target, pname, params, params.position(), function_pointer);
/*      */   }
/*      */   private static native void nglGetConvolutionParameterfv(int paramInt1, int paramInt2, FloatBuffer paramFloatBuffer, int paramInt3, long paramLong);
/*      */   
/*      */   public static void glGetConvolutionParameter(int target, int pname, IntBuffer params) {
/*  619 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  620 */     long function_pointer = caps.ARB_imaging_glGetConvolutionParameteriv_pointer;
/*  621 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  622 */     BufferChecks.checkBuffer(params, 4);
/*  623 */     nglGetConvolutionParameteriv(target, pname, params, params.position(), function_pointer);
/*      */   }
/*      */   private static native void nglGetConvolutionParameteriv(int paramInt1, int paramInt2, IntBuffer paramIntBuffer, int paramInt3, long paramLong);
/*      */   
/*      */   public static void glSeparableFilter2D(int target, int internalformat, int width, int height, int format, int type, ByteBuffer row, ByteBuffer column) {
/*  628 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  629 */     long function_pointer = caps.ARB_imaging_glSeparableFilter2D_pointer;
/*  630 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  631 */     GLChecks.ensureUnpackPBOdisabled(caps);
/*  632 */     BufferChecks.checkDirect(row);
/*  633 */     BufferChecks.checkDirect(column);
/*  634 */     nglSeparableFilter2D(target, internalformat, width, height, format, type, row, row.position(), column, column.position(), function_pointer);
/*      */   }
/*      */   public static void glSeparableFilter2D(int target, int internalformat, int width, int height, int format, int type, ByteBuffer row, DoubleBuffer column) {
/*  637 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  638 */     long function_pointer = caps.ARB_imaging_glSeparableFilter2D_pointer;
/*  639 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  640 */     GLChecks.ensureUnpackPBOdisabled(caps);
/*  641 */     BufferChecks.checkDirect(row);
/*  642 */     BufferChecks.checkDirect(column);
/*  643 */     nglSeparableFilter2D(target, internalformat, width, height, format, type, row, row.position(), column, column.position() << 3, function_pointer);
/*      */   }
/*      */   public static void glSeparableFilter2D(int target, int internalformat, int width, int height, int format, int type, ByteBuffer row, FloatBuffer column) {
/*  646 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  647 */     long function_pointer = caps.ARB_imaging_glSeparableFilter2D_pointer;
/*  648 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  649 */     GLChecks.ensureUnpackPBOdisabled(caps);
/*  650 */     BufferChecks.checkDirect(row);
/*  651 */     BufferChecks.checkDirect(column);
/*  652 */     nglSeparableFilter2D(target, internalformat, width, height, format, type, row, row.position(), column, column.position() << 2, function_pointer);
/*      */   }
/*      */   public static void glSeparableFilter2D(int target, int internalformat, int width, int height, int format, int type, ByteBuffer row, IntBuffer column) {
/*  655 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  656 */     long function_pointer = caps.ARB_imaging_glSeparableFilter2D_pointer;
/*  657 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  658 */     GLChecks.ensureUnpackPBOdisabled(caps);
/*  659 */     BufferChecks.checkDirect(row);
/*  660 */     BufferChecks.checkDirect(column);
/*  661 */     nglSeparableFilter2D(target, internalformat, width, height, format, type, row, row.position(), column, column.position() << 2, function_pointer);
/*      */   }
/*      */   public static void glSeparableFilter2D(int target, int internalformat, int width, int height, int format, int type, ByteBuffer row, ShortBuffer column) {
/*  664 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  665 */     long function_pointer = caps.ARB_imaging_glSeparableFilter2D_pointer;
/*  666 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  667 */     GLChecks.ensureUnpackPBOdisabled(caps);
/*  668 */     BufferChecks.checkDirect(row);
/*  669 */     BufferChecks.checkDirect(column);
/*  670 */     nglSeparableFilter2D(target, internalformat, width, height, format, type, row, row.position(), column, column.position() << 1, function_pointer);
/*      */   }
/*      */   public static void glSeparableFilter2D(int target, int internalformat, int width, int height, int format, int type, DoubleBuffer row, ByteBuffer column) {
/*  673 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  674 */     long function_pointer = caps.ARB_imaging_glSeparableFilter2D_pointer;
/*  675 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  676 */     GLChecks.ensureUnpackPBOdisabled(caps);
/*  677 */     BufferChecks.checkDirect(row);
/*  678 */     BufferChecks.checkDirect(column);
/*  679 */     nglSeparableFilter2D(target, internalformat, width, height, format, type, row, row.position() << 3, column, column.position(), function_pointer);
/*      */   }
/*      */   public static void glSeparableFilter2D(int target, int internalformat, int width, int height, int format, int type, DoubleBuffer row, DoubleBuffer column) {
/*  682 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  683 */     long function_pointer = caps.ARB_imaging_glSeparableFilter2D_pointer;
/*  684 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  685 */     GLChecks.ensureUnpackPBOdisabled(caps);
/*  686 */     BufferChecks.checkDirect(row);
/*  687 */     BufferChecks.checkDirect(column);
/*  688 */     nglSeparableFilter2D(target, internalformat, width, height, format, type, row, row.position() << 3, column, column.position() << 3, function_pointer);
/*      */   }
/*      */   public static void glSeparableFilter2D(int target, int internalformat, int width, int height, int format, int type, DoubleBuffer row, FloatBuffer column) {
/*  691 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  692 */     long function_pointer = caps.ARB_imaging_glSeparableFilter2D_pointer;
/*  693 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  694 */     GLChecks.ensureUnpackPBOdisabled(caps);
/*  695 */     BufferChecks.checkDirect(row);
/*  696 */     BufferChecks.checkDirect(column);
/*  697 */     nglSeparableFilter2D(target, internalformat, width, height, format, type, row, row.position() << 3, column, column.position() << 2, function_pointer);
/*      */   }
/*      */   public static void glSeparableFilter2D(int target, int internalformat, int width, int height, int format, int type, DoubleBuffer row, IntBuffer column) {
/*  700 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  701 */     long function_pointer = caps.ARB_imaging_glSeparableFilter2D_pointer;
/*  702 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  703 */     GLChecks.ensureUnpackPBOdisabled(caps);
/*  704 */     BufferChecks.checkDirect(row);
/*  705 */     BufferChecks.checkDirect(column);
/*  706 */     nglSeparableFilter2D(target, internalformat, width, height, format, type, row, row.position() << 3, column, column.position() << 2, function_pointer);
/*      */   }
/*      */   public static void glSeparableFilter2D(int target, int internalformat, int width, int height, int format, int type, DoubleBuffer row, ShortBuffer column) {
/*  709 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  710 */     long function_pointer = caps.ARB_imaging_glSeparableFilter2D_pointer;
/*  711 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  712 */     GLChecks.ensureUnpackPBOdisabled(caps);
/*  713 */     BufferChecks.checkDirect(row);
/*  714 */     BufferChecks.checkDirect(column);
/*  715 */     nglSeparableFilter2D(target, internalformat, width, height, format, type, row, row.position() << 3, column, column.position() << 1, function_pointer);
/*      */   }
/*      */   public static void glSeparableFilter2D(int target, int internalformat, int width, int height, int format, int type, FloatBuffer row, ByteBuffer column) {
/*  718 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  719 */     long function_pointer = caps.ARB_imaging_glSeparableFilter2D_pointer;
/*  720 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  721 */     GLChecks.ensureUnpackPBOdisabled(caps);
/*  722 */     BufferChecks.checkDirect(row);
/*  723 */     BufferChecks.checkDirect(column);
/*  724 */     nglSeparableFilter2D(target, internalformat, width, height, format, type, row, row.position() << 2, column, column.position(), function_pointer);
/*      */   }
/*      */   public static void glSeparableFilter2D(int target, int internalformat, int width, int height, int format, int type, FloatBuffer row, DoubleBuffer column) {
/*  727 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  728 */     long function_pointer = caps.ARB_imaging_glSeparableFilter2D_pointer;
/*  729 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  730 */     GLChecks.ensureUnpackPBOdisabled(caps);
/*  731 */     BufferChecks.checkDirect(row);
/*  732 */     BufferChecks.checkDirect(column);
/*  733 */     nglSeparableFilter2D(target, internalformat, width, height, format, type, row, row.position() << 2, column, column.position() << 3, function_pointer);
/*      */   }
/*      */   public static void glSeparableFilter2D(int target, int internalformat, int width, int height, int format, int type, FloatBuffer row, FloatBuffer column) {
/*  736 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  737 */     long function_pointer = caps.ARB_imaging_glSeparableFilter2D_pointer;
/*  738 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  739 */     GLChecks.ensureUnpackPBOdisabled(caps);
/*  740 */     BufferChecks.checkDirect(row);
/*  741 */     BufferChecks.checkDirect(column);
/*  742 */     nglSeparableFilter2D(target, internalformat, width, height, format, type, row, row.position() << 2, column, column.position() << 2, function_pointer);
/*      */   }
/*      */   public static void glSeparableFilter2D(int target, int internalformat, int width, int height, int format, int type, FloatBuffer row, IntBuffer column) {
/*  745 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  746 */     long function_pointer = caps.ARB_imaging_glSeparableFilter2D_pointer;
/*  747 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  748 */     GLChecks.ensureUnpackPBOdisabled(caps);
/*  749 */     BufferChecks.checkDirect(row);
/*  750 */     BufferChecks.checkDirect(column);
/*  751 */     nglSeparableFilter2D(target, internalformat, width, height, format, type, row, row.position() << 2, column, column.position() << 2, function_pointer);
/*      */   }
/*      */   public static void glSeparableFilter2D(int target, int internalformat, int width, int height, int format, int type, FloatBuffer row, ShortBuffer column) {
/*  754 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  755 */     long function_pointer = caps.ARB_imaging_glSeparableFilter2D_pointer;
/*  756 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  757 */     GLChecks.ensureUnpackPBOdisabled(caps);
/*  758 */     BufferChecks.checkDirect(row);
/*  759 */     BufferChecks.checkDirect(column);
/*  760 */     nglSeparableFilter2D(target, internalformat, width, height, format, type, row, row.position() << 2, column, column.position() << 1, function_pointer);
/*      */   }
/*      */   public static void glSeparableFilter2D(int target, int internalformat, int width, int height, int format, int type, IntBuffer row, ByteBuffer column) {
/*  763 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  764 */     long function_pointer = caps.ARB_imaging_glSeparableFilter2D_pointer;
/*  765 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  766 */     GLChecks.ensureUnpackPBOdisabled(caps);
/*  767 */     BufferChecks.checkDirect(row);
/*  768 */     BufferChecks.checkDirect(column);
/*  769 */     nglSeparableFilter2D(target, internalformat, width, height, format, type, row, row.position() << 2, column, column.position(), function_pointer);
/*      */   }
/*      */   public static void glSeparableFilter2D(int target, int internalformat, int width, int height, int format, int type, IntBuffer row, DoubleBuffer column) {
/*  772 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  773 */     long function_pointer = caps.ARB_imaging_glSeparableFilter2D_pointer;
/*  774 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  775 */     GLChecks.ensureUnpackPBOdisabled(caps);
/*  776 */     BufferChecks.checkDirect(row);
/*  777 */     BufferChecks.checkDirect(column);
/*  778 */     nglSeparableFilter2D(target, internalformat, width, height, format, type, row, row.position() << 2, column, column.position() << 3, function_pointer);
/*      */   }
/*      */   public static void glSeparableFilter2D(int target, int internalformat, int width, int height, int format, int type, IntBuffer row, FloatBuffer column) {
/*  781 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  782 */     long function_pointer = caps.ARB_imaging_glSeparableFilter2D_pointer;
/*  783 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  784 */     GLChecks.ensureUnpackPBOdisabled(caps);
/*  785 */     BufferChecks.checkDirect(row);
/*  786 */     BufferChecks.checkDirect(column);
/*  787 */     nglSeparableFilter2D(target, internalformat, width, height, format, type, row, row.position() << 2, column, column.position() << 2, function_pointer);
/*      */   }
/*      */   public static void glSeparableFilter2D(int target, int internalformat, int width, int height, int format, int type, IntBuffer row, IntBuffer column) {
/*  790 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  791 */     long function_pointer = caps.ARB_imaging_glSeparableFilter2D_pointer;
/*  792 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  793 */     GLChecks.ensureUnpackPBOdisabled(caps);
/*  794 */     BufferChecks.checkDirect(row);
/*  795 */     BufferChecks.checkDirect(column);
/*  796 */     nglSeparableFilter2D(target, internalformat, width, height, format, type, row, row.position() << 2, column, column.position() << 2, function_pointer);
/*      */   }
/*      */   public static void glSeparableFilter2D(int target, int internalformat, int width, int height, int format, int type, IntBuffer row, ShortBuffer column) {
/*  799 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  800 */     long function_pointer = caps.ARB_imaging_glSeparableFilter2D_pointer;
/*  801 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  802 */     GLChecks.ensureUnpackPBOdisabled(caps);
/*  803 */     BufferChecks.checkDirect(row);
/*  804 */     BufferChecks.checkDirect(column);
/*  805 */     nglSeparableFilter2D(target, internalformat, width, height, format, type, row, row.position() << 2, column, column.position() << 1, function_pointer);
/*      */   }
/*      */   public static void glSeparableFilter2D(int target, int internalformat, int width, int height, int format, int type, ShortBuffer row, ByteBuffer column) {
/*  808 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  809 */     long function_pointer = caps.ARB_imaging_glSeparableFilter2D_pointer;
/*  810 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  811 */     GLChecks.ensureUnpackPBOdisabled(caps);
/*  812 */     BufferChecks.checkDirect(row);
/*  813 */     BufferChecks.checkDirect(column);
/*  814 */     nglSeparableFilter2D(target, internalformat, width, height, format, type, row, row.position() << 1, column, column.position(), function_pointer);
/*      */   }
/*      */   public static void glSeparableFilter2D(int target, int internalformat, int width, int height, int format, int type, ShortBuffer row, DoubleBuffer column) {
/*  817 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  818 */     long function_pointer = caps.ARB_imaging_glSeparableFilter2D_pointer;
/*  819 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  820 */     GLChecks.ensureUnpackPBOdisabled(caps);
/*  821 */     BufferChecks.checkDirect(row);
/*  822 */     BufferChecks.checkDirect(column);
/*  823 */     nglSeparableFilter2D(target, internalformat, width, height, format, type, row, row.position() << 1, column, column.position() << 3, function_pointer);
/*      */   }
/*      */   public static void glSeparableFilter2D(int target, int internalformat, int width, int height, int format, int type, ShortBuffer row, FloatBuffer column) {
/*  826 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  827 */     long function_pointer = caps.ARB_imaging_glSeparableFilter2D_pointer;
/*  828 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  829 */     GLChecks.ensureUnpackPBOdisabled(caps);
/*  830 */     BufferChecks.checkDirect(row);
/*  831 */     BufferChecks.checkDirect(column);
/*  832 */     nglSeparableFilter2D(target, internalformat, width, height, format, type, row, row.position() << 1, column, column.position() << 2, function_pointer);
/*      */   }
/*      */   public static void glSeparableFilter2D(int target, int internalformat, int width, int height, int format, int type, ShortBuffer row, IntBuffer column) {
/*  835 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  836 */     long function_pointer = caps.ARB_imaging_glSeparableFilter2D_pointer;
/*  837 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  838 */     GLChecks.ensureUnpackPBOdisabled(caps);
/*  839 */     BufferChecks.checkDirect(row);
/*  840 */     BufferChecks.checkDirect(column);
/*  841 */     nglSeparableFilter2D(target, internalformat, width, height, format, type, row, row.position() << 1, column, column.position() << 2, function_pointer);
/*      */   }
/*      */   public static void glSeparableFilter2D(int target, int internalformat, int width, int height, int format, int type, ShortBuffer row, ShortBuffer column) {
/*  844 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  845 */     long function_pointer = caps.ARB_imaging_glSeparableFilter2D_pointer;
/*  846 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  847 */     GLChecks.ensureUnpackPBOdisabled(caps);
/*  848 */     BufferChecks.checkDirect(row);
/*  849 */     BufferChecks.checkDirect(column);
/*  850 */     nglSeparableFilter2D(target, internalformat, width, height, format, type, row, row.position() << 1, column, column.position() << 1, function_pointer);
/*      */   }
/*      */   private static native void nglSeparableFilter2D(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, Buffer paramBuffer1, int paramInt7, Buffer paramBuffer2, int paramInt8, long paramLong);
/*      */   public static void glSeparableFilter2D(int target, int internalformat, int width, int height, int format, int type, long row_buffer_offset, long column_buffer_offset) {
/*  854 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  855 */     long function_pointer = caps.ARB_imaging_glSeparableFilter2D_pointer;
/*  856 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  857 */     GLChecks.ensureUnpackPBOenabled(caps);
/*  858 */     nglSeparableFilter2DBO(target, internalformat, width, height, format, type, row_buffer_offset, column_buffer_offset, function_pointer);
/*      */   }
/*      */   private static native void nglSeparableFilter2DBO(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, long paramLong1, long paramLong2, long paramLong3);
/*      */   
/*      */   public static void glGetSeparableFilter(int target, int format, int type, ByteBuffer row, ByteBuffer column, ByteBuffer span) {
/*  863 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  864 */     long function_pointer = caps.ARB_imaging_glGetSeparableFilter_pointer;
/*  865 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  866 */     GLChecks.ensurePackPBOdisabled(caps);
/*  867 */     BufferChecks.checkDirect(row);
/*  868 */     BufferChecks.checkDirect(column);
/*  869 */     BufferChecks.checkDirect(span);
/*  870 */     nglGetSeparableFilter(target, format, type, row, row.position(), column, column.position(), span, span.position(), function_pointer);
/*      */   }
/*      */   public static void glGetSeparableFilter(int target, int format, int type, ByteBuffer row, ByteBuffer column, DoubleBuffer span) {
/*  873 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  874 */     long function_pointer = caps.ARB_imaging_glGetSeparableFilter_pointer;
/*  875 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  876 */     GLChecks.ensurePackPBOdisabled(caps);
/*  877 */     BufferChecks.checkDirect(row);
/*  878 */     BufferChecks.checkDirect(column);
/*  879 */     BufferChecks.checkDirect(span);
/*  880 */     nglGetSeparableFilter(target, format, type, row, row.position(), column, column.position(), span, span.position() << 3, function_pointer);
/*      */   }
/*      */   public static void glGetSeparableFilter(int target, int format, int type, ByteBuffer row, ByteBuffer column, IntBuffer span) {
/*  883 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  884 */     long function_pointer = caps.ARB_imaging_glGetSeparableFilter_pointer;
/*  885 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  886 */     GLChecks.ensurePackPBOdisabled(caps);
/*  887 */     BufferChecks.checkDirect(row);
/*  888 */     BufferChecks.checkDirect(column);
/*  889 */     BufferChecks.checkDirect(span);
/*  890 */     nglGetSeparableFilter(target, format, type, row, row.position(), column, column.position(), span, span.position() << 2, function_pointer);
/*      */   }
/*      */   public static void glGetSeparableFilter(int target, int format, int type, ByteBuffer row, ByteBuffer column, ShortBuffer span) {
/*  893 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  894 */     long function_pointer = caps.ARB_imaging_glGetSeparableFilter_pointer;
/*  895 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  896 */     GLChecks.ensurePackPBOdisabled(caps);
/*  897 */     BufferChecks.checkDirect(row);
/*  898 */     BufferChecks.checkDirect(column);
/*  899 */     BufferChecks.checkDirect(span);
/*  900 */     nglGetSeparableFilter(target, format, type, row, row.position(), column, column.position(), span, span.position() << 1, function_pointer);
/*      */   }
/*      */   public static void glGetSeparableFilter(int target, int format, int type, ByteBuffer row, DoubleBuffer column, ByteBuffer span) {
/*  903 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  904 */     long function_pointer = caps.ARB_imaging_glGetSeparableFilter_pointer;
/*  905 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  906 */     GLChecks.ensurePackPBOdisabled(caps);
/*  907 */     BufferChecks.checkDirect(row);
/*  908 */     BufferChecks.checkDirect(column);
/*  909 */     BufferChecks.checkDirect(span);
/*  910 */     nglGetSeparableFilter(target, format, type, row, row.position(), column, column.position() << 3, span, span.position(), function_pointer);
/*      */   }
/*      */   public static void glGetSeparableFilter(int target, int format, int type, ByteBuffer row, DoubleBuffer column, DoubleBuffer span) {
/*  913 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  914 */     long function_pointer = caps.ARB_imaging_glGetSeparableFilter_pointer;
/*  915 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  916 */     GLChecks.ensurePackPBOdisabled(caps);
/*  917 */     BufferChecks.checkDirect(row);
/*  918 */     BufferChecks.checkDirect(column);
/*  919 */     BufferChecks.checkDirect(span);
/*  920 */     nglGetSeparableFilter(target, format, type, row, row.position(), column, column.position() << 3, span, span.position() << 3, function_pointer);
/*      */   }
/*      */   public static void glGetSeparableFilter(int target, int format, int type, ByteBuffer row, DoubleBuffer column, IntBuffer span) {
/*  923 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  924 */     long function_pointer = caps.ARB_imaging_glGetSeparableFilter_pointer;
/*  925 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  926 */     GLChecks.ensurePackPBOdisabled(caps);
/*  927 */     BufferChecks.checkDirect(row);
/*  928 */     BufferChecks.checkDirect(column);
/*  929 */     BufferChecks.checkDirect(span);
/*  930 */     nglGetSeparableFilter(target, format, type, row, row.position(), column, column.position() << 3, span, span.position() << 2, function_pointer);
/*      */   }
/*      */   public static void glGetSeparableFilter(int target, int format, int type, ByteBuffer row, DoubleBuffer column, ShortBuffer span) {
/*  933 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  934 */     long function_pointer = caps.ARB_imaging_glGetSeparableFilter_pointer;
/*  935 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  936 */     GLChecks.ensurePackPBOdisabled(caps);
/*  937 */     BufferChecks.checkDirect(row);
/*  938 */     BufferChecks.checkDirect(column);
/*  939 */     BufferChecks.checkDirect(span);
/*  940 */     nglGetSeparableFilter(target, format, type, row, row.position(), column, column.position() << 3, span, span.position() << 1, function_pointer);
/*      */   }
/*      */   public static void glGetSeparableFilter(int target, int format, int type, ByteBuffer row, IntBuffer column, ByteBuffer span) {
/*  943 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  944 */     long function_pointer = caps.ARB_imaging_glGetSeparableFilter_pointer;
/*  945 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  946 */     GLChecks.ensurePackPBOdisabled(caps);
/*  947 */     BufferChecks.checkDirect(row);
/*  948 */     BufferChecks.checkDirect(column);
/*  949 */     BufferChecks.checkDirect(span);
/*  950 */     nglGetSeparableFilter(target, format, type, row, row.position(), column, column.position() << 2, span, span.position(), function_pointer);
/*      */   }
/*      */   public static void glGetSeparableFilter(int target, int format, int type, ByteBuffer row, IntBuffer column, DoubleBuffer span) {
/*  953 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  954 */     long function_pointer = caps.ARB_imaging_glGetSeparableFilter_pointer;
/*  955 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  956 */     GLChecks.ensurePackPBOdisabled(caps);
/*  957 */     BufferChecks.checkDirect(row);
/*  958 */     BufferChecks.checkDirect(column);
/*  959 */     BufferChecks.checkDirect(span);
/*  960 */     nglGetSeparableFilter(target, format, type, row, row.position(), column, column.position() << 2, span, span.position() << 3, function_pointer);
/*      */   }
/*      */   public static void glGetSeparableFilter(int target, int format, int type, ByteBuffer row, IntBuffer column, IntBuffer span) {
/*  963 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  964 */     long function_pointer = caps.ARB_imaging_glGetSeparableFilter_pointer;
/*  965 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  966 */     GLChecks.ensurePackPBOdisabled(caps);
/*  967 */     BufferChecks.checkDirect(row);
/*  968 */     BufferChecks.checkDirect(column);
/*  969 */     BufferChecks.checkDirect(span);
/*  970 */     nglGetSeparableFilter(target, format, type, row, row.position(), column, column.position() << 2, span, span.position() << 2, function_pointer);
/*      */   }
/*      */   public static void glGetSeparableFilter(int target, int format, int type, ByteBuffer row, IntBuffer column, ShortBuffer span) {
/*  973 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  974 */     long function_pointer = caps.ARB_imaging_glGetSeparableFilter_pointer;
/*  975 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  976 */     GLChecks.ensurePackPBOdisabled(caps);
/*  977 */     BufferChecks.checkDirect(row);
/*  978 */     BufferChecks.checkDirect(column);
/*  979 */     BufferChecks.checkDirect(span);
/*  980 */     nglGetSeparableFilter(target, format, type, row, row.position(), column, column.position() << 2, span, span.position() << 1, function_pointer);
/*      */   }
/*      */   public static void glGetSeparableFilter(int target, int format, int type, ByteBuffer row, ShortBuffer column, ByteBuffer span) {
/*  983 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  984 */     long function_pointer = caps.ARB_imaging_glGetSeparableFilter_pointer;
/*  985 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  986 */     GLChecks.ensurePackPBOdisabled(caps);
/*  987 */     BufferChecks.checkDirect(row);
/*  988 */     BufferChecks.checkDirect(column);
/*  989 */     BufferChecks.checkDirect(span);
/*  990 */     nglGetSeparableFilter(target, format, type, row, row.position(), column, column.position() << 1, span, span.position(), function_pointer);
/*      */   }
/*      */   public static void glGetSeparableFilter(int target, int format, int type, ByteBuffer row, ShortBuffer column, DoubleBuffer span) {
/*  993 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  994 */     long function_pointer = caps.ARB_imaging_glGetSeparableFilter_pointer;
/*  995 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  996 */     GLChecks.ensurePackPBOdisabled(caps);
/*  997 */     BufferChecks.checkDirect(row);
/*  998 */     BufferChecks.checkDirect(column);
/*  999 */     BufferChecks.checkDirect(span);
/* 1000 */     nglGetSeparableFilter(target, format, type, row, row.position(), column, column.position() << 1, span, span.position() << 3, function_pointer);
/*      */   }
/*      */   public static void glGetSeparableFilter(int target, int format, int type, ByteBuffer row, ShortBuffer column, IntBuffer span) {
/* 1003 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 1004 */     long function_pointer = caps.ARB_imaging_glGetSeparableFilter_pointer;
/* 1005 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 1006 */     GLChecks.ensurePackPBOdisabled(caps);
/* 1007 */     BufferChecks.checkDirect(row);
/* 1008 */     BufferChecks.checkDirect(column);
/* 1009 */     BufferChecks.checkDirect(span);
/* 1010 */     nglGetSeparableFilter(target, format, type, row, row.position(), column, column.position() << 1, span, span.position() << 2, function_pointer);
/*      */   }
/*      */   public static void glGetSeparableFilter(int target, int format, int type, ByteBuffer row, ShortBuffer column, ShortBuffer span) {
/* 1013 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 1014 */     long function_pointer = caps.ARB_imaging_glGetSeparableFilter_pointer;
/* 1015 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 1016 */     GLChecks.ensurePackPBOdisabled(caps);
/* 1017 */     BufferChecks.checkDirect(row);
/* 1018 */     BufferChecks.checkDirect(column);
/* 1019 */     BufferChecks.checkDirect(span);
/* 1020 */     nglGetSeparableFilter(target, format, type, row, row.position(), column, column.position() << 1, span, span.position() << 1, function_pointer);
/*      */   }
/*      */   public static void glGetSeparableFilter(int target, int format, int type, DoubleBuffer row, ByteBuffer column, ByteBuffer span) {
/* 1023 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 1024 */     long function_pointer = caps.ARB_imaging_glGetSeparableFilter_pointer;
/* 1025 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 1026 */     GLChecks.ensurePackPBOdisabled(caps);
/* 1027 */     BufferChecks.checkDirect(row);
/* 1028 */     BufferChecks.checkDirect(column);
/* 1029 */     BufferChecks.checkDirect(span);
/* 1030 */     nglGetSeparableFilter(target, format, type, row, row.position() << 3, column, column.position(), span, span.position(), function_pointer);
/*      */   }
/*      */   public static void glGetSeparableFilter(int target, int format, int type, DoubleBuffer row, ByteBuffer column, DoubleBuffer span) {
/* 1033 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 1034 */     long function_pointer = caps.ARB_imaging_glGetSeparableFilter_pointer;
/* 1035 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 1036 */     GLChecks.ensurePackPBOdisabled(caps);
/* 1037 */     BufferChecks.checkDirect(row);
/* 1038 */     BufferChecks.checkDirect(column);
/* 1039 */     BufferChecks.checkDirect(span);
/* 1040 */     nglGetSeparableFilter(target, format, type, row, row.position() << 3, column, column.position(), span, span.position() << 3, function_pointer);
/*      */   }
/*      */   public static void glGetSeparableFilter(int target, int format, int type, DoubleBuffer row, ByteBuffer column, IntBuffer span) {
/* 1043 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 1044 */     long function_pointer = caps.ARB_imaging_glGetSeparableFilter_pointer;
/* 1045 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 1046 */     GLChecks.ensurePackPBOdisabled(caps);
/* 1047 */     BufferChecks.checkDirect(row);
/* 1048 */     BufferChecks.checkDirect(column);
/* 1049 */     BufferChecks.checkDirect(span);
/* 1050 */     nglGetSeparableFilter(target, format, type, row, row.position() << 3, column, column.position(), span, span.position() << 2, function_pointer);
/*      */   }
/*      */   public static void glGetSeparableFilter(int target, int format, int type, DoubleBuffer row, ByteBuffer column, ShortBuffer span) {
/* 1053 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 1054 */     long function_pointer = caps.ARB_imaging_glGetSeparableFilter_pointer;
/* 1055 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 1056 */     GLChecks.ensurePackPBOdisabled(caps);
/* 1057 */     BufferChecks.checkDirect(row);
/* 1058 */     BufferChecks.checkDirect(column);
/* 1059 */     BufferChecks.checkDirect(span);
/* 1060 */     nglGetSeparableFilter(target, format, type, row, row.position() << 3, column, column.position(), span, span.position() << 1, function_pointer);
/*      */   }
/*      */   public static void glGetSeparableFilter(int target, int format, int type, DoubleBuffer row, DoubleBuffer column, ByteBuffer span) {
/* 1063 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 1064 */     long function_pointer = caps.ARB_imaging_glGetSeparableFilter_pointer;
/* 1065 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 1066 */     GLChecks.ensurePackPBOdisabled(caps);
/* 1067 */     BufferChecks.checkDirect(row);
/* 1068 */     BufferChecks.checkDirect(column);
/* 1069 */     BufferChecks.checkDirect(span);
/* 1070 */     nglGetSeparableFilter(target, format, type, row, row.position() << 3, column, column.position() << 3, span, span.position(), function_pointer);
/*      */   }
/*      */   public static void glGetSeparableFilter(int target, int format, int type, DoubleBuffer row, DoubleBuffer column, DoubleBuffer span) {
/* 1073 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 1074 */     long function_pointer = caps.ARB_imaging_glGetSeparableFilter_pointer;
/* 1075 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 1076 */     GLChecks.ensurePackPBOdisabled(caps);
/* 1077 */     BufferChecks.checkDirect(row);
/* 1078 */     BufferChecks.checkDirect(column);
/* 1079 */     BufferChecks.checkDirect(span);
/* 1080 */     nglGetSeparableFilter(target, format, type, row, row.position() << 3, column, column.position() << 3, span, span.position() << 3, function_pointer);
/*      */   }
/*      */   public static void glGetSeparableFilter(int target, int format, int type, DoubleBuffer row, DoubleBuffer column, IntBuffer span) {
/* 1083 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 1084 */     long function_pointer = caps.ARB_imaging_glGetSeparableFilter_pointer;
/* 1085 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 1086 */     GLChecks.ensurePackPBOdisabled(caps);
/* 1087 */     BufferChecks.checkDirect(row);
/* 1088 */     BufferChecks.checkDirect(column);
/* 1089 */     BufferChecks.checkDirect(span);
/* 1090 */     nglGetSeparableFilter(target, format, type, row, row.position() << 3, column, column.position() << 3, span, span.position() << 2, function_pointer);
/*      */   }
/*      */   public static void glGetSeparableFilter(int target, int format, int type, DoubleBuffer row, DoubleBuffer column, ShortBuffer span) {
/* 1093 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 1094 */     long function_pointer = caps.ARB_imaging_glGetSeparableFilter_pointer;
/* 1095 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 1096 */     GLChecks.ensurePackPBOdisabled(caps);
/* 1097 */     BufferChecks.checkDirect(row);
/* 1098 */     BufferChecks.checkDirect(column);
/* 1099 */     BufferChecks.checkDirect(span);
/* 1100 */     nglGetSeparableFilter(target, format, type, row, row.position() << 3, column, column.position() << 3, span, span.position() << 1, function_pointer);
/*      */   }
/*      */   public static void glGetSeparableFilter(int target, int format, int type, DoubleBuffer row, IntBuffer column, ByteBuffer span) {
/* 1103 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 1104 */     long function_pointer = caps.ARB_imaging_glGetSeparableFilter_pointer;
/* 1105 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 1106 */     GLChecks.ensurePackPBOdisabled(caps);
/* 1107 */     BufferChecks.checkDirect(row);
/* 1108 */     BufferChecks.checkDirect(column);
/* 1109 */     BufferChecks.checkDirect(span);
/* 1110 */     nglGetSeparableFilter(target, format, type, row, row.position() << 3, column, column.position() << 2, span, span.position(), function_pointer);
/*      */   }
/*      */   public static void glGetSeparableFilter(int target, int format, int type, DoubleBuffer row, IntBuffer column, DoubleBuffer span) {
/* 1113 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 1114 */     long function_pointer = caps.ARB_imaging_glGetSeparableFilter_pointer;
/* 1115 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 1116 */     GLChecks.ensurePackPBOdisabled(caps);
/* 1117 */     BufferChecks.checkDirect(row);
/* 1118 */     BufferChecks.checkDirect(column);
/* 1119 */     BufferChecks.checkDirect(span);
/* 1120 */     nglGetSeparableFilter(target, format, type, row, row.position() << 3, column, column.position() << 2, span, span.position() << 3, function_pointer);
/*      */   }
/*      */   public static void glGetSeparableFilter(int target, int format, int type, DoubleBuffer row, IntBuffer column, IntBuffer span) {
/* 1123 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 1124 */     long function_pointer = caps.ARB_imaging_glGetSeparableFilter_pointer;
/* 1125 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 1126 */     GLChecks.ensurePackPBOdisabled(caps);
/* 1127 */     BufferChecks.checkDirect(row);
/* 1128 */     BufferChecks.checkDirect(column);
/* 1129 */     BufferChecks.checkDirect(span);
/* 1130 */     nglGetSeparableFilter(target, format, type, row, row.position() << 3, column, column.position() << 2, span, span.position() << 2, function_pointer);
/*      */   }
/*      */   public static void glGetSeparableFilter(int target, int format, int type, DoubleBuffer row, IntBuffer column, ShortBuffer span) {
/* 1133 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 1134 */     long function_pointer = caps.ARB_imaging_glGetSeparableFilter_pointer;
/* 1135 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 1136 */     GLChecks.ensurePackPBOdisabled(caps);
/* 1137 */     BufferChecks.checkDirect(row);
/* 1138 */     BufferChecks.checkDirect(column);
/* 1139 */     BufferChecks.checkDirect(span);
/* 1140 */     nglGetSeparableFilter(target, format, type, row, row.position() << 3, column, column.position() << 2, span, span.position() << 1, function_pointer);
/*      */   }
/*      */   public static void glGetSeparableFilter(int target, int format, int type, DoubleBuffer row, ShortBuffer column, ByteBuffer span) {
/* 1143 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 1144 */     long function_pointer = caps.ARB_imaging_glGetSeparableFilter_pointer;
/* 1145 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 1146 */     GLChecks.ensurePackPBOdisabled(caps);
/* 1147 */     BufferChecks.checkDirect(row);
/* 1148 */     BufferChecks.checkDirect(column);
/* 1149 */     BufferChecks.checkDirect(span);
/* 1150 */     nglGetSeparableFilter(target, format, type, row, row.position() << 3, column, column.position() << 1, span, span.position(), function_pointer);
/*      */   }
/*      */   public static void glGetSeparableFilter(int target, int format, int type, DoubleBuffer row, ShortBuffer column, DoubleBuffer span) {
/* 1153 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 1154 */     long function_pointer = caps.ARB_imaging_glGetSeparableFilter_pointer;
/* 1155 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 1156 */     GLChecks.ensurePackPBOdisabled(caps);
/* 1157 */     BufferChecks.checkDirect(row);
/* 1158 */     BufferChecks.checkDirect(column);
/* 1159 */     BufferChecks.checkDirect(span);
/* 1160 */     nglGetSeparableFilter(target, format, type, row, row.position() << 3, column, column.position() << 1, span, span.position() << 3, function_pointer);
/*      */   }
/*      */   public static void glGetSeparableFilter(int target, int format, int type, DoubleBuffer row, ShortBuffer column, IntBuffer span) {
/* 1163 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 1164 */     long function_pointer = caps.ARB_imaging_glGetSeparableFilter_pointer;
/* 1165 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 1166 */     GLChecks.ensurePackPBOdisabled(caps);
/* 1167 */     BufferChecks.checkDirect(row);
/* 1168 */     BufferChecks.checkDirect(column);
/* 1169 */     BufferChecks.checkDirect(span);
/* 1170 */     nglGetSeparableFilter(target, format, type, row, row.position() << 3, column, column.position() << 1, span, span.position() << 2, function_pointer);
/*      */   }
/*      */   public static void glGetSeparableFilter(int target, int format, int type, DoubleBuffer row, ShortBuffer column, ShortBuffer span) {
/* 1173 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 1174 */     long function_pointer = caps.ARB_imaging_glGetSeparableFilter_pointer;
/* 1175 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 1176 */     GLChecks.ensurePackPBOdisabled(caps);
/* 1177 */     BufferChecks.checkDirect(row);
/* 1178 */     BufferChecks.checkDirect(column);
/* 1179 */     BufferChecks.checkDirect(span);
/* 1180 */     nglGetSeparableFilter(target, format, type, row, row.position() << 3, column, column.position() << 1, span, span.position() << 1, function_pointer);
/*      */   }
/*      */   public static void glGetSeparableFilter(int target, int format, int type, FloatBuffer row, ByteBuffer column, ByteBuffer span) {
/* 1183 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 1184 */     long function_pointer = caps.ARB_imaging_glGetSeparableFilter_pointer;
/* 1185 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 1186 */     GLChecks.ensurePackPBOdisabled(caps);
/* 1187 */     BufferChecks.checkDirect(row);
/* 1188 */     BufferChecks.checkDirect(column);
/* 1189 */     BufferChecks.checkDirect(span);
/* 1190 */     nglGetSeparableFilter(target, format, type, row, row.position() << 2, column, column.position(), span, span.position(), function_pointer);
/*      */   }
/*      */   public static void glGetSeparableFilter(int target, int format, int type, FloatBuffer row, ByteBuffer column, DoubleBuffer span) {
/* 1193 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 1194 */     long function_pointer = caps.ARB_imaging_glGetSeparableFilter_pointer;
/* 1195 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 1196 */     GLChecks.ensurePackPBOdisabled(caps);
/* 1197 */     BufferChecks.checkDirect(row);
/* 1198 */     BufferChecks.checkDirect(column);
/* 1199 */     BufferChecks.checkDirect(span);
/* 1200 */     nglGetSeparableFilter(target, format, type, row, row.position() << 2, column, column.position(), span, span.position() << 3, function_pointer);
/*      */   }
/*      */   public static void glGetSeparableFilter(int target, int format, int type, FloatBuffer row, ByteBuffer column, IntBuffer span) {
/* 1203 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 1204 */     long function_pointer = caps.ARB_imaging_glGetSeparableFilter_pointer;
/* 1205 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 1206 */     GLChecks.ensurePackPBOdisabled(caps);
/* 1207 */     BufferChecks.checkDirect(row);
/* 1208 */     BufferChecks.checkDirect(column);
/* 1209 */     BufferChecks.checkDirect(span);
/* 1210 */     nglGetSeparableFilter(target, format, type, row, row.position() << 2, column, column.position(), span, span.position() << 2, function_pointer);
/*      */   }
/*      */   public static void glGetSeparableFilter(int target, int format, int type, FloatBuffer row, ByteBuffer column, ShortBuffer span) {
/* 1213 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 1214 */     long function_pointer = caps.ARB_imaging_glGetSeparableFilter_pointer;
/* 1215 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 1216 */     GLChecks.ensurePackPBOdisabled(caps);
/* 1217 */     BufferChecks.checkDirect(row);
/* 1218 */     BufferChecks.checkDirect(column);
/* 1219 */     BufferChecks.checkDirect(span);
/* 1220 */     nglGetSeparableFilter(target, format, type, row, row.position() << 2, column, column.position(), span, span.position() << 1, function_pointer);
/*      */   }
/*      */   public static void glGetSeparableFilter(int target, int format, int type, FloatBuffer row, DoubleBuffer column, ByteBuffer span) {
/* 1223 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 1224 */     long function_pointer = caps.ARB_imaging_glGetSeparableFilter_pointer;
/* 1225 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 1226 */     GLChecks.ensurePackPBOdisabled(caps);
/* 1227 */     BufferChecks.checkDirect(row);
/* 1228 */     BufferChecks.checkDirect(column);
/* 1229 */     BufferChecks.checkDirect(span);
/* 1230 */     nglGetSeparableFilter(target, format, type, row, row.position() << 2, column, column.position() << 3, span, span.position(), function_pointer);
/*      */   }
/*      */   public static void glGetSeparableFilter(int target, int format, int type, FloatBuffer row, DoubleBuffer column, DoubleBuffer span) {
/* 1233 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 1234 */     long function_pointer = caps.ARB_imaging_glGetSeparableFilter_pointer;
/* 1235 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 1236 */     GLChecks.ensurePackPBOdisabled(caps);
/* 1237 */     BufferChecks.checkDirect(row);
/* 1238 */     BufferChecks.checkDirect(column);
/* 1239 */     BufferChecks.checkDirect(span);
/* 1240 */     nglGetSeparableFilter(target, format, type, row, row.position() << 2, column, column.position() << 3, span, span.position() << 3, function_pointer);
/*      */   }
/*      */   public static void glGetSeparableFilter(int target, int format, int type, FloatBuffer row, DoubleBuffer column, IntBuffer span) {
/* 1243 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 1244 */     long function_pointer = caps.ARB_imaging_glGetSeparableFilter_pointer;
/* 1245 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 1246 */     GLChecks.ensurePackPBOdisabled(caps);
/* 1247 */     BufferChecks.checkDirect(row);
/* 1248 */     BufferChecks.checkDirect(column);
/* 1249 */     BufferChecks.checkDirect(span);
/* 1250 */     nglGetSeparableFilter(target, format, type, row, row.position() << 2, column, column.position() << 3, span, span.position() << 2, function_pointer);
/*      */   }
/*      */   public static void glGetSeparableFilter(int target, int format, int type, FloatBuffer row, DoubleBuffer column, ShortBuffer span) {
/* 1253 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 1254 */     long function_pointer = caps.ARB_imaging_glGetSeparableFilter_pointer;
/* 1255 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 1256 */     GLChecks.ensurePackPBOdisabled(caps);
/* 1257 */     BufferChecks.checkDirect(row);
/* 1258 */     BufferChecks.checkDirect(column);
/* 1259 */     BufferChecks.checkDirect(span);
/* 1260 */     nglGetSeparableFilter(target, format, type, row, row.position() << 2, column, column.position() << 3, span, span.position() << 1, function_pointer);
/*      */   }
/*      */   public static void glGetSeparableFilter(int target, int format, int type, FloatBuffer row, IntBuffer column, ByteBuffer span) {
/* 1263 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 1264 */     long function_pointer = caps.ARB_imaging_glGetSeparableFilter_pointer;
/* 1265 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 1266 */     GLChecks.ensurePackPBOdisabled(caps);
/* 1267 */     BufferChecks.checkDirect(row);
/* 1268 */     BufferChecks.checkDirect(column);
/* 1269 */     BufferChecks.checkDirect(span);
/* 1270 */     nglGetSeparableFilter(target, format, type, row, row.position() << 2, column, column.position() << 2, span, span.position(), function_pointer);
/*      */   }
/*      */   public static void glGetSeparableFilter(int target, int format, int type, FloatBuffer row, IntBuffer column, DoubleBuffer span) {
/* 1273 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 1274 */     long function_pointer = caps.ARB_imaging_glGetSeparableFilter_pointer;
/* 1275 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 1276 */     GLChecks.ensurePackPBOdisabled(caps);
/* 1277 */     BufferChecks.checkDirect(row);
/* 1278 */     BufferChecks.checkDirect(column);
/* 1279 */     BufferChecks.checkDirect(span);
/* 1280 */     nglGetSeparableFilter(target, format, type, row, row.position() << 2, column, column.position() << 2, span, span.position() << 3, function_pointer);
/*      */   }
/*      */   public static void glGetSeparableFilter(int target, int format, int type, FloatBuffer row, IntBuffer column, IntBuffer span) {
/* 1283 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 1284 */     long function_pointer = caps.ARB_imaging_glGetSeparableFilter_pointer;
/* 1285 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 1286 */     GLChecks.ensurePackPBOdisabled(caps);
/* 1287 */     BufferChecks.checkDirect(row);
/* 1288 */     BufferChecks.checkDirect(column);
/* 1289 */     BufferChecks.checkDirect(span);
/* 1290 */     nglGetSeparableFilter(target, format, type, row, row.position() << 2, column, column.position() << 2, span, span.position() << 2, function_pointer);
/*      */   }
/*      */   public static void glGetSeparableFilter(int target, int format, int type, FloatBuffer row, IntBuffer column, ShortBuffer span) {
/* 1293 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 1294 */     long function_pointer = caps.ARB_imaging_glGetSeparableFilter_pointer;
/* 1295 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 1296 */     GLChecks.ensurePackPBOdisabled(caps);
/* 1297 */     BufferChecks.checkDirect(row);
/* 1298 */     BufferChecks.checkDirect(column);
/* 1299 */     BufferChecks.checkDirect(span);
/* 1300 */     nglGetSeparableFilter(target, format, type, row, row.position() << 2, column, column.position() << 2, span, span.position() << 1, function_pointer);
/*      */   }
/*      */   public static void glGetSeparableFilter(int target, int format, int type, FloatBuffer row, ShortBuffer column, ByteBuffer span) {
/* 1303 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 1304 */     long function_pointer = caps.ARB_imaging_glGetSeparableFilter_pointer;
/* 1305 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 1306 */     GLChecks.ensurePackPBOdisabled(caps);
/* 1307 */     BufferChecks.checkDirect(row);
/* 1308 */     BufferChecks.checkDirect(column);
/* 1309 */     BufferChecks.checkDirect(span);
/* 1310 */     nglGetSeparableFilter(target, format, type, row, row.position() << 2, column, column.position() << 1, span, span.position(), function_pointer);
/*      */   }
/*      */   public static void glGetSeparableFilter(int target, int format, int type, FloatBuffer row, ShortBuffer column, DoubleBuffer span) {
/* 1313 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 1314 */     long function_pointer = caps.ARB_imaging_glGetSeparableFilter_pointer;
/* 1315 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 1316 */     GLChecks.ensurePackPBOdisabled(caps);
/* 1317 */     BufferChecks.checkDirect(row);
/* 1318 */     BufferChecks.checkDirect(column);
/* 1319 */     BufferChecks.checkDirect(span);
/* 1320 */     nglGetSeparableFilter(target, format, type, row, row.position() << 2, column, column.position() << 1, span, span.position() << 3, function_pointer);
/*      */   }
/*      */   public static void glGetSeparableFilter(int target, int format, int type, FloatBuffer row, ShortBuffer column, IntBuffer span) {
/* 1323 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 1324 */     long function_pointer = caps.ARB_imaging_glGetSeparableFilter_pointer;
/* 1325 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 1326 */     GLChecks.ensurePackPBOdisabled(caps);
/* 1327 */     BufferChecks.checkDirect(row);
/* 1328 */     BufferChecks.checkDirect(column);
/* 1329 */     BufferChecks.checkDirect(span);
/* 1330 */     nglGetSeparableFilter(target, format, type, row, row.position() << 2, column, column.position() << 1, span, span.position() << 2, function_pointer);
/*      */   }
/*      */   public static void glGetSeparableFilter(int target, int format, int type, FloatBuffer row, ShortBuffer column, ShortBuffer span) {
/* 1333 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 1334 */     long function_pointer = caps.ARB_imaging_glGetSeparableFilter_pointer;
/* 1335 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 1336 */     GLChecks.ensurePackPBOdisabled(caps);
/* 1337 */     BufferChecks.checkDirect(row);
/* 1338 */     BufferChecks.checkDirect(column);
/* 1339 */     BufferChecks.checkDirect(span);
/* 1340 */     nglGetSeparableFilter(target, format, type, row, row.position() << 2, column, column.position() << 1, span, span.position() << 1, function_pointer);
/*      */   }
/*      */   public static void glGetSeparableFilter(int target, int format, int type, IntBuffer row, ByteBuffer column, ByteBuffer span) {
/* 1343 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 1344 */     long function_pointer = caps.ARB_imaging_glGetSeparableFilter_pointer;
/* 1345 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 1346 */     GLChecks.ensurePackPBOdisabled(caps);
/* 1347 */     BufferChecks.checkDirect(row);
/* 1348 */     BufferChecks.checkDirect(column);
/* 1349 */     BufferChecks.checkDirect(span);
/* 1350 */     nglGetSeparableFilter(target, format, type, row, row.position() << 2, column, column.position(), span, span.position(), function_pointer);
/*      */   }
/*      */   public static void glGetSeparableFilter(int target, int format, int type, IntBuffer row, ByteBuffer column, DoubleBuffer span) {
/* 1353 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 1354 */     long function_pointer = caps.ARB_imaging_glGetSeparableFilter_pointer;
/* 1355 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 1356 */     GLChecks.ensurePackPBOdisabled(caps);
/* 1357 */     BufferChecks.checkDirect(row);
/* 1358 */     BufferChecks.checkDirect(column);
/* 1359 */     BufferChecks.checkDirect(span);
/* 1360 */     nglGetSeparableFilter(target, format, type, row, row.position() << 2, column, column.position(), span, span.position() << 3, function_pointer);
/*      */   }
/*      */   public static void glGetSeparableFilter(int target, int format, int type, IntBuffer row, ByteBuffer column, IntBuffer span) {
/* 1363 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 1364 */     long function_pointer = caps.ARB_imaging_glGetSeparableFilter_pointer;
/* 1365 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 1366 */     GLChecks.ensurePackPBOdisabled(caps);
/* 1367 */     BufferChecks.checkDirect(row);
/* 1368 */     BufferChecks.checkDirect(column);
/* 1369 */     BufferChecks.checkDirect(span);
/* 1370 */     nglGetSeparableFilter(target, format, type, row, row.position() << 2, column, column.position(), span, span.position() << 2, function_pointer);
/*      */   }
/*      */   public static void glGetSeparableFilter(int target, int format, int type, IntBuffer row, ByteBuffer column, ShortBuffer span) {
/* 1373 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 1374 */     long function_pointer = caps.ARB_imaging_glGetSeparableFilter_pointer;
/* 1375 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 1376 */     GLChecks.ensurePackPBOdisabled(caps);
/* 1377 */     BufferChecks.checkDirect(row);
/* 1378 */     BufferChecks.checkDirect(column);
/* 1379 */     BufferChecks.checkDirect(span);
/* 1380 */     nglGetSeparableFilter(target, format, type, row, row.position() << 2, column, column.position(), span, span.position() << 1, function_pointer);
/*      */   }
/*      */   public static void glGetSeparableFilter(int target, int format, int type, IntBuffer row, DoubleBuffer column, ByteBuffer span) {
/* 1383 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 1384 */     long function_pointer = caps.ARB_imaging_glGetSeparableFilter_pointer;
/* 1385 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 1386 */     GLChecks.ensurePackPBOdisabled(caps);
/* 1387 */     BufferChecks.checkDirect(row);
/* 1388 */     BufferChecks.checkDirect(column);
/* 1389 */     BufferChecks.checkDirect(span);
/* 1390 */     nglGetSeparableFilter(target, format, type, row, row.position() << 2, column, column.position() << 3, span, span.position(), function_pointer);
/*      */   }
/*      */   public static void glGetSeparableFilter(int target, int format, int type, IntBuffer row, DoubleBuffer column, DoubleBuffer span) {
/* 1393 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 1394 */     long function_pointer = caps.ARB_imaging_glGetSeparableFilter_pointer;
/* 1395 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 1396 */     GLChecks.ensurePackPBOdisabled(caps);
/* 1397 */     BufferChecks.checkDirect(row);
/* 1398 */     BufferChecks.checkDirect(column);
/* 1399 */     BufferChecks.checkDirect(span);
/* 1400 */     nglGetSeparableFilter(target, format, type, row, row.position() << 2, column, column.position() << 3, span, span.position() << 3, function_pointer);
/*      */   }
/*      */   public static void glGetSeparableFilter(int target, int format, int type, IntBuffer row, DoubleBuffer column, IntBuffer span) {
/* 1403 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 1404 */     long function_pointer = caps.ARB_imaging_glGetSeparableFilter_pointer;
/* 1405 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 1406 */     GLChecks.ensurePackPBOdisabled(caps);
/* 1407 */     BufferChecks.checkDirect(row);
/* 1408 */     BufferChecks.checkDirect(column);
/* 1409 */     BufferChecks.checkDirect(span);
/* 1410 */     nglGetSeparableFilter(target, format, type, row, row.position() << 2, column, column.position() << 3, span, span.position() << 2, function_pointer);
/*      */   }
/*      */   public static void glGetSeparableFilter(int target, int format, int type, IntBuffer row, DoubleBuffer column, ShortBuffer span) {
/* 1413 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 1414 */     long function_pointer = caps.ARB_imaging_glGetSeparableFilter_pointer;
/* 1415 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 1416 */     GLChecks.ensurePackPBOdisabled(caps);
/* 1417 */     BufferChecks.checkDirect(row);
/* 1418 */     BufferChecks.checkDirect(column);
/* 1419 */     BufferChecks.checkDirect(span);
/* 1420 */     nglGetSeparableFilter(target, format, type, row, row.position() << 2, column, column.position() << 3, span, span.position() << 1, function_pointer);
/*      */   }
/*      */   public static void glGetSeparableFilter(int target, int format, int type, IntBuffer row, IntBuffer column, ByteBuffer span) {
/* 1423 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 1424 */     long function_pointer = caps.ARB_imaging_glGetSeparableFilter_pointer;
/* 1425 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 1426 */     GLChecks.ensurePackPBOdisabled(caps);
/* 1427 */     BufferChecks.checkDirect(row);
/* 1428 */     BufferChecks.checkDirect(column);
/* 1429 */     BufferChecks.checkDirect(span);
/* 1430 */     nglGetSeparableFilter(target, format, type, row, row.position() << 2, column, column.position() << 2, span, span.position(), function_pointer);
/*      */   }
/*      */   public static void glGetSeparableFilter(int target, int format, int type, IntBuffer row, IntBuffer column, DoubleBuffer span) {
/* 1433 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 1434 */     long function_pointer = caps.ARB_imaging_glGetSeparableFilter_pointer;
/* 1435 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 1436 */     GLChecks.ensurePackPBOdisabled(caps);
/* 1437 */     BufferChecks.checkDirect(row);
/* 1438 */     BufferChecks.checkDirect(column);
/* 1439 */     BufferChecks.checkDirect(span);
/* 1440 */     nglGetSeparableFilter(target, format, type, row, row.position() << 2, column, column.position() << 2, span, span.position() << 3, function_pointer);
/*      */   }
/*      */   public static void glGetSeparableFilter(int target, int format, int type, IntBuffer row, IntBuffer column, IntBuffer span) {
/* 1443 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 1444 */     long function_pointer = caps.ARB_imaging_glGetSeparableFilter_pointer;
/* 1445 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 1446 */     GLChecks.ensurePackPBOdisabled(caps);
/* 1447 */     BufferChecks.checkDirect(row);
/* 1448 */     BufferChecks.checkDirect(column);
/* 1449 */     BufferChecks.checkDirect(span);
/* 1450 */     nglGetSeparableFilter(target, format, type, row, row.position() << 2, column, column.position() << 2, span, span.position() << 2, function_pointer);
/*      */   }
/*      */   public static void glGetSeparableFilter(int target, int format, int type, IntBuffer row, IntBuffer column, ShortBuffer span) {
/* 1453 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 1454 */     long function_pointer = caps.ARB_imaging_glGetSeparableFilter_pointer;
/* 1455 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 1456 */     GLChecks.ensurePackPBOdisabled(caps);
/* 1457 */     BufferChecks.checkDirect(row);
/* 1458 */     BufferChecks.checkDirect(column);
/* 1459 */     BufferChecks.checkDirect(span);
/* 1460 */     nglGetSeparableFilter(target, format, type, row, row.position() << 2, column, column.position() << 2, span, span.position() << 1, function_pointer);
/*      */   }
/*      */   public static void glGetSeparableFilter(int target, int format, int type, IntBuffer row, ShortBuffer column, ByteBuffer span) {
/* 1463 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 1464 */     long function_pointer = caps.ARB_imaging_glGetSeparableFilter_pointer;
/* 1465 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 1466 */     GLChecks.ensurePackPBOdisabled(caps);
/* 1467 */     BufferChecks.checkDirect(row);
/* 1468 */     BufferChecks.checkDirect(column);
/* 1469 */     BufferChecks.checkDirect(span);
/* 1470 */     nglGetSeparableFilter(target, format, type, row, row.position() << 2, column, column.position() << 1, span, span.position(), function_pointer);
/*      */   }
/*      */   public static void glGetSeparableFilter(int target, int format, int type, IntBuffer row, ShortBuffer column, DoubleBuffer span) {
/* 1473 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 1474 */     long function_pointer = caps.ARB_imaging_glGetSeparableFilter_pointer;
/* 1475 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 1476 */     GLChecks.ensurePackPBOdisabled(caps);
/* 1477 */     BufferChecks.checkDirect(row);
/* 1478 */     BufferChecks.checkDirect(column);
/* 1479 */     BufferChecks.checkDirect(span);
/* 1480 */     nglGetSeparableFilter(target, format, type, row, row.position() << 2, column, column.position() << 1, span, span.position() << 3, function_pointer);
/*      */   }
/*      */   public static void glGetSeparableFilter(int target, int format, int type, IntBuffer row, ShortBuffer column, IntBuffer span) {
/* 1483 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 1484 */     long function_pointer = caps.ARB_imaging_glGetSeparableFilter_pointer;
/* 1485 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 1486 */     GLChecks.ensurePackPBOdisabled(caps);
/* 1487 */     BufferChecks.checkDirect(row);
/* 1488 */     BufferChecks.checkDirect(column);
/* 1489 */     BufferChecks.checkDirect(span);
/* 1490 */     nglGetSeparableFilter(target, format, type, row, row.position() << 2, column, column.position() << 1, span, span.position() << 2, function_pointer);
/*      */   }
/*      */   public static void glGetSeparableFilter(int target, int format, int type, IntBuffer row, ShortBuffer column, ShortBuffer span) {
/* 1493 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 1494 */     long function_pointer = caps.ARB_imaging_glGetSeparableFilter_pointer;
/* 1495 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 1496 */     GLChecks.ensurePackPBOdisabled(caps);
/* 1497 */     BufferChecks.checkDirect(row);
/* 1498 */     BufferChecks.checkDirect(column);
/* 1499 */     BufferChecks.checkDirect(span);
/* 1500 */     nglGetSeparableFilter(target, format, type, row, row.position() << 2, column, column.position() << 1, span, span.position() << 1, function_pointer);
/*      */   }
/*      */   public static void glGetSeparableFilter(int target, int format, int type, ShortBuffer row, ByteBuffer column, ByteBuffer span) {
/* 1503 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 1504 */     long function_pointer = caps.ARB_imaging_glGetSeparableFilter_pointer;
/* 1505 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 1506 */     GLChecks.ensurePackPBOdisabled(caps);
/* 1507 */     BufferChecks.checkDirect(row);
/* 1508 */     BufferChecks.checkDirect(column);
/* 1509 */     BufferChecks.checkDirect(span);
/* 1510 */     nglGetSeparableFilter(target, format, type, row, row.position() << 1, column, column.position(), span, span.position(), function_pointer);
/*      */   }
/*      */   public static void glGetSeparableFilter(int target, int format, int type, ShortBuffer row, ByteBuffer column, DoubleBuffer span) {
/* 1513 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 1514 */     long function_pointer = caps.ARB_imaging_glGetSeparableFilter_pointer;
/* 1515 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 1516 */     GLChecks.ensurePackPBOdisabled(caps);
/* 1517 */     BufferChecks.checkDirect(row);
/* 1518 */     BufferChecks.checkDirect(column);
/* 1519 */     BufferChecks.checkDirect(span);
/* 1520 */     nglGetSeparableFilter(target, format, type, row, row.position() << 1, column, column.position(), span, span.position() << 3, function_pointer);
/*      */   }
/*      */   public static void glGetSeparableFilter(int target, int format, int type, ShortBuffer row, ByteBuffer column, IntBuffer span) {
/* 1523 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 1524 */     long function_pointer = caps.ARB_imaging_glGetSeparableFilter_pointer;
/* 1525 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 1526 */     GLChecks.ensurePackPBOdisabled(caps);
/* 1527 */     BufferChecks.checkDirect(row);
/* 1528 */     BufferChecks.checkDirect(column);
/* 1529 */     BufferChecks.checkDirect(span);
/* 1530 */     nglGetSeparableFilter(target, format, type, row, row.position() << 1, column, column.position(), span, span.position() << 2, function_pointer);
/*      */   }
/*      */   public static void glGetSeparableFilter(int target, int format, int type, ShortBuffer row, ByteBuffer column, ShortBuffer span) {
/* 1533 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 1534 */     long function_pointer = caps.ARB_imaging_glGetSeparableFilter_pointer;
/* 1535 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 1536 */     GLChecks.ensurePackPBOdisabled(caps);
/* 1537 */     BufferChecks.checkDirect(row);
/* 1538 */     BufferChecks.checkDirect(column);
/* 1539 */     BufferChecks.checkDirect(span);
/* 1540 */     nglGetSeparableFilter(target, format, type, row, row.position() << 1, column, column.position(), span, span.position() << 1, function_pointer);
/*      */   }
/*      */   public static void glGetSeparableFilter(int target, int format, int type, ShortBuffer row, DoubleBuffer column, ByteBuffer span) {
/* 1543 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 1544 */     long function_pointer = caps.ARB_imaging_glGetSeparableFilter_pointer;
/* 1545 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 1546 */     GLChecks.ensurePackPBOdisabled(caps);
/* 1547 */     BufferChecks.checkDirect(row);
/* 1548 */     BufferChecks.checkDirect(column);
/* 1549 */     BufferChecks.checkDirect(span);
/* 1550 */     nglGetSeparableFilter(target, format, type, row, row.position() << 1, column, column.position() << 3, span, span.position(), function_pointer);
/*      */   }
/*      */   public static void glGetSeparableFilter(int target, int format, int type, ShortBuffer row, DoubleBuffer column, DoubleBuffer span) {
/* 1553 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 1554 */     long function_pointer = caps.ARB_imaging_glGetSeparableFilter_pointer;
/* 1555 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 1556 */     GLChecks.ensurePackPBOdisabled(caps);
/* 1557 */     BufferChecks.checkDirect(row);
/* 1558 */     BufferChecks.checkDirect(column);
/* 1559 */     BufferChecks.checkDirect(span);
/* 1560 */     nglGetSeparableFilter(target, format, type, row, row.position() << 1, column, column.position() << 3, span, span.position() << 3, function_pointer);
/*      */   }
/*      */   public static void glGetSeparableFilter(int target, int format, int type, ShortBuffer row, DoubleBuffer column, IntBuffer span) {
/* 1563 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 1564 */     long function_pointer = caps.ARB_imaging_glGetSeparableFilter_pointer;
/* 1565 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 1566 */     GLChecks.ensurePackPBOdisabled(caps);
/* 1567 */     BufferChecks.checkDirect(row);
/* 1568 */     BufferChecks.checkDirect(column);
/* 1569 */     BufferChecks.checkDirect(span);
/* 1570 */     nglGetSeparableFilter(target, format, type, row, row.position() << 1, column, column.position() << 3, span, span.position() << 2, function_pointer);
/*      */   }
/*      */   public static void glGetSeparableFilter(int target, int format, int type, ShortBuffer row, DoubleBuffer column, ShortBuffer span) {
/* 1573 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 1574 */     long function_pointer = caps.ARB_imaging_glGetSeparableFilter_pointer;
/* 1575 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 1576 */     GLChecks.ensurePackPBOdisabled(caps);
/* 1577 */     BufferChecks.checkDirect(row);
/* 1578 */     BufferChecks.checkDirect(column);
/* 1579 */     BufferChecks.checkDirect(span);
/* 1580 */     nglGetSeparableFilter(target, format, type, row, row.position() << 1, column, column.position() << 3, span, span.position() << 1, function_pointer);
/*      */   }
/*      */   public static void glGetSeparableFilter(int target, int format, int type, ShortBuffer row, IntBuffer column, ByteBuffer span) {
/* 1583 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 1584 */     long function_pointer = caps.ARB_imaging_glGetSeparableFilter_pointer;
/* 1585 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 1586 */     GLChecks.ensurePackPBOdisabled(caps);
/* 1587 */     BufferChecks.checkDirect(row);
/* 1588 */     BufferChecks.checkDirect(column);
/* 1589 */     BufferChecks.checkDirect(span);
/* 1590 */     nglGetSeparableFilter(target, format, type, row, row.position() << 1, column, column.position() << 2, span, span.position(), function_pointer);
/*      */   }
/*      */   public static void glGetSeparableFilter(int target, int format, int type, ShortBuffer row, IntBuffer column, DoubleBuffer span) {
/* 1593 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 1594 */     long function_pointer = caps.ARB_imaging_glGetSeparableFilter_pointer;
/* 1595 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 1596 */     GLChecks.ensurePackPBOdisabled(caps);
/* 1597 */     BufferChecks.checkDirect(row);
/* 1598 */     BufferChecks.checkDirect(column);
/* 1599 */     BufferChecks.checkDirect(span);
/* 1600 */     nglGetSeparableFilter(target, format, type, row, row.position() << 1, column, column.position() << 2, span, span.position() << 3, function_pointer);
/*      */   }
/*      */   public static void glGetSeparableFilter(int target, int format, int type, ShortBuffer row, IntBuffer column, IntBuffer span) {
/* 1603 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 1604 */     long function_pointer = caps.ARB_imaging_glGetSeparableFilter_pointer;
/* 1605 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 1606 */     GLChecks.ensurePackPBOdisabled(caps);
/* 1607 */     BufferChecks.checkDirect(row);
/* 1608 */     BufferChecks.checkDirect(column);
/* 1609 */     BufferChecks.checkDirect(span);
/* 1610 */     nglGetSeparableFilter(target, format, type, row, row.position() << 1, column, column.position() << 2, span, span.position() << 2, function_pointer);
/*      */   }
/*      */   public static void glGetSeparableFilter(int target, int format, int type, ShortBuffer row, IntBuffer column, ShortBuffer span) {
/* 1613 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 1614 */     long function_pointer = caps.ARB_imaging_glGetSeparableFilter_pointer;
/* 1615 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 1616 */     GLChecks.ensurePackPBOdisabled(caps);
/* 1617 */     BufferChecks.checkDirect(row);
/* 1618 */     BufferChecks.checkDirect(column);
/* 1619 */     BufferChecks.checkDirect(span);
/* 1620 */     nglGetSeparableFilter(target, format, type, row, row.position() << 1, column, column.position() << 2, span, span.position() << 1, function_pointer);
/*      */   }
/*      */   public static void glGetSeparableFilter(int target, int format, int type, ShortBuffer row, ShortBuffer column, ByteBuffer span) {
/* 1623 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 1624 */     long function_pointer = caps.ARB_imaging_glGetSeparableFilter_pointer;
/* 1625 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 1626 */     GLChecks.ensurePackPBOdisabled(caps);
/* 1627 */     BufferChecks.checkDirect(row);
/* 1628 */     BufferChecks.checkDirect(column);
/* 1629 */     BufferChecks.checkDirect(span);
/* 1630 */     nglGetSeparableFilter(target, format, type, row, row.position() << 1, column, column.position() << 1, span, span.position(), function_pointer);
/*      */   }
/*      */   public static void glGetSeparableFilter(int target, int format, int type, ShortBuffer row, ShortBuffer column, DoubleBuffer span) {
/* 1633 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 1634 */     long function_pointer = caps.ARB_imaging_glGetSeparableFilter_pointer;
/* 1635 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 1636 */     GLChecks.ensurePackPBOdisabled(caps);
/* 1637 */     BufferChecks.checkDirect(row);
/* 1638 */     BufferChecks.checkDirect(column);
/* 1639 */     BufferChecks.checkDirect(span);
/* 1640 */     nglGetSeparableFilter(target, format, type, row, row.position() << 1, column, column.position() << 1, span, span.position() << 3, function_pointer);
/*      */   }
/*      */   public static void glGetSeparableFilter(int target, int format, int type, ShortBuffer row, ShortBuffer column, IntBuffer span) {
/* 1643 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 1644 */     long function_pointer = caps.ARB_imaging_glGetSeparableFilter_pointer;
/* 1645 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 1646 */     GLChecks.ensurePackPBOdisabled(caps);
/* 1647 */     BufferChecks.checkDirect(row);
/* 1648 */     BufferChecks.checkDirect(column);
/* 1649 */     BufferChecks.checkDirect(span);
/* 1650 */     nglGetSeparableFilter(target, format, type, row, row.position() << 1, column, column.position() << 1, span, span.position() << 2, function_pointer);
/*      */   }
/*      */   public static void glGetSeparableFilter(int target, int format, int type, ShortBuffer row, ShortBuffer column, ShortBuffer span) {
/* 1653 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 1654 */     long function_pointer = caps.ARB_imaging_glGetSeparableFilter_pointer;
/* 1655 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 1656 */     GLChecks.ensurePackPBOdisabled(caps);
/* 1657 */     BufferChecks.checkDirect(row);
/* 1658 */     BufferChecks.checkDirect(column);
/* 1659 */     BufferChecks.checkDirect(span);
/* 1660 */     nglGetSeparableFilter(target, format, type, row, row.position() << 1, column, column.position() << 1, span, span.position() << 1, function_pointer);
/*      */   }
/*      */   private static native void nglGetSeparableFilter(int paramInt1, int paramInt2, int paramInt3, Buffer paramBuffer1, int paramInt4, Buffer paramBuffer2, int paramInt5, Buffer paramBuffer3, int paramInt6, long paramLong);
/*      */   public static void glGetSeparableFilter(int target, int format, int type, long row_buffer_offset, long column_buffer_offset, long span_buffer_offset) {
/* 1664 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 1665 */     long function_pointer = caps.ARB_imaging_glGetSeparableFilter_pointer;
/* 1666 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 1667 */     GLChecks.ensurePackPBOenabled(caps);
/* 1668 */     nglGetSeparableFilterBO(target, format, type, row_buffer_offset, column_buffer_offset, span_buffer_offset, function_pointer);
/*      */   }
/*      */   
/*      */   private static native void nglGetSeparableFilterBO(int paramInt1, int paramInt2, int paramInt3, long paramLong1, long paramLong2, long paramLong3, long paramLong4);
/*      */ }


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\org\lwjgl\opengl\ARBImaging.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */