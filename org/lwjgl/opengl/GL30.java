/*      */ package org.lwjgl.opengl;
/*      */ 
/*      */ import java.nio.Buffer;
/*      */ import java.nio.ByteBuffer;
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
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ public final class GL30
/*      */ {
/*      */   public static final int GL_MAJOR_VERSION = 33307;
/*      */   public static final int GL_MINOR_VERSION = 33308;
/*      */   public static final int GL_NUM_EXTENSIONS = 33309;
/*      */   public static final int GL_CONTEXT_FLAGS = 33310;
/*      */   public static final int GL_CONTEXT_FLAG_FORWARD_COMPATIBLE_BIT = 1;
/*      */   public static final int GL_DEPTH_BUFFER = 33315;
/*      */   public static final int GL_STENCIL_BUFFER = 33316;
/*      */   public static final int GL_COMPRESSED_RED = 33317;
/*      */   public static final int GL_COMPRESSED_RG = 33318;
/*      */   public static final int GL_COMPARE_REF_TO_TEXTURE = 34894;
/*      */   public static final int GL_CLIP_DISTANCE0 = 12288;
/*      */   public static final int GL_CLIP_DISTANCE1 = 12289;
/*      */   public static final int GL_CLIP_DISTANCE2 = 12290;
/*      */   public static final int GL_CLIP_DISTANCE3 = 12291;
/*      */   public static final int GL_CLIP_DISTANCE4 = 12292;
/*      */   public static final int GL_CLIP_DISTANCE5 = 12293;
/*      */   public static final int GL_CLIP_DISTANCE6 = 12294;
/*      */   public static final int GL_CLIP_DISTANCE7 = 12295;
/*      */   public static final int GL_MAX_CLIP_DISTANCES = 3378;
/*      */   public static final int GL_MAX_VARYING_COMPONENTS = 35659;
/*      */   public static final int GL_BUFFER_ACCESS_FLAGS = 37151;
/*      */   public static final int GL_BUFFER_MAP_LENGTH = 37152;
/*      */   public static final int GL_BUFFER_MAP_OFFSET = 37153;
/*      */   public static final int GL_VERTEX_ATTRIB_ARRAY_INTEGER = 35069;
/*      */   public static final int GL_SAMPLER_BUFFER = 36290;
/*      */   public static final int GL_SAMPLER_CUBE_SHADOW = 36293;
/*      */   public static final int GL_UNSIGNED_INT_VEC2 = 36294;
/*      */   public static final int GL_UNSIGNED_INT_VEC3 = 36295;
/*      */   public static final int GL_UNSIGNED_INT_VEC4 = 36296;
/*      */   public static final int GL_INT_SAMPLER_1D = 36297;
/*      */   public static final int GL_INT_SAMPLER_2D = 36298;
/*      */   public static final int GL_INT_SAMPLER_3D = 36299;
/*      */   public static final int GL_INT_SAMPLER_CUBE = 36300;
/*      */   public static final int GL_INT_SAMPLER_2D_RECT = 36301;
/*      */   public static final int GL_INT_SAMPLER_1D_ARRAY = 36302;
/*      */   public static final int GL_INT_SAMPLER_2D_ARRAY = 36303;
/*      */   public static final int GL_INT_SAMPLER_BUFFER = 36304;
/*      */   public static final int GL_UNSIGNED_INT_SAMPLER_1D = 36305;
/*      */   public static final int GL_UNSIGNED_INT_SAMPLER_2D = 36306;
/*      */   public static final int GL_UNSIGNED_INT_SAMPLER_3D = 36307;
/*      */   public static final int GL_UNSIGNED_INT_SAMPLER_CUBE = 36308;
/*      */   public static final int GL_UNSIGNED_INT_SAMPLER_2D_RECT = 36309;
/*      */   public static final int GL_UNSIGNED_INT_SAMPLER_1D_ARRAY = 36310;
/*      */   public static final int GL_UNSIGNED_INT_SAMPLER_2D_ARRAY = 36311;
/*      */   public static final int GL_UNSIGNED_INT_SAMPLER_BUFFER = 36312;
/*      */   public static final int GL_MIN_PROGRAM_TEXEL_OFFSET = 35076;
/*      */   public static final int GL_MAX_PROGRAM_TEXEL_OFFSET = 35077;
/*      */   public static final int GL_QUERY_WAIT = 36371;
/*      */   public static final int GL_QUERY_NO_WAIT = 36372;
/*      */   public static final int GL_QUERY_BY_REGION_WAIT = 36373;
/*      */   public static final int GL_QUERY_BY_REGION_NO_WAIT = 36374;
/*      */   public static final int GL_MAP_READ_BIT = 1;
/*      */   public static final int GL_MAP_WRITE_BIT = 2;
/*      */   public static final int GL_MAP_INVALIDATE_RANGE_BIT = 4;
/*      */   public static final int GL_MAP_INVALIDATE_BUFFER_BIT = 8;
/*      */   public static final int GL_MAP_FLUSH_EXPLICIT_BIT = 16;
/*      */   public static final int GL_MAP_UNSYNCHRONIZED_BIT = 32;
/*      */   public static final int GL_CLAMP_VERTEX_COLOR = 35098;
/*      */   public static final int GL_CLAMP_FRAGMENT_COLOR = 35099;
/*      */   public static final int GL_CLAMP_READ_COLOR = 35100;
/*      */   public static final int GL_FIXED_ONLY = 35101;
/*      */   public static final int GL_DEPTH_COMPONENT32F = 36267;
/*      */   public static final int GL_DEPTH32F_STENCIL8 = 36268;
/*      */   public static final int GL_FLOAT_32_UNSIGNED_INT_24_8_REV = 36269;
/*      */   public static final int GL_TEXTURE_RED_TYPE = 35856;
/*      */   public static final int GL_TEXTURE_GREEN_TYPE = 35857;
/*      */   public static final int GL_TEXTURE_BLUE_TYPE = 35858;
/*      */   public static final int GL_TEXTURE_ALPHA_TYPE = 35859;
/*      */   public static final int GL_TEXTURE_LUMINANCE_TYPE = 35860;
/*      */   public static final int GL_TEXTURE_INTENSITY_TYPE = 35861;
/*      */   public static final int GL_TEXTURE_DEPTH_TYPE = 35862;
/*      */   public static final int GL_UNSIGNED_NORMALIZED = 35863;
/*      */   public static final int GL_RGBA32F = 34836;
/*      */   public static final int GL_RGB32F = 34837;
/*      */   public static final int GL_ALPHA32F = 34838;
/*      */   public static final int GL_RGBA16F = 34842;
/*      */   public static final int GL_RGB16F = 34843;
/*      */   public static final int GL_ALPHA16F = 34844;
/*      */   public static final int GL_R11F_G11F_B10F = 35898;
/*      */   public static final int GL_UNSIGNED_INT_10F_11F_11F_REV = 35899;
/*      */   public static final int GL_RGB9_E5 = 35901;
/*      */   public static final int GL_UNSIGNED_INT_5_9_9_9_REV = 35902;
/*      */   public static final int GL_TEXTURE_SHARED_SIZE = 35903;
/*      */   public static final int GL_FRAMEBUFFER = 36160;
/*      */   public static final int GL_RENDERBUFFER = 36161;
/*      */   public static final int GL_STENCIL_INDEX1 = 36166;
/*      */   public static final int GL_STENCIL_INDEX4 = 36167;
/*      */   public static final int GL_STENCIL_INDEX8 = 36168;
/*      */   public static final int GL_STENCIL_INDEX16 = 36169;
/*      */   public static final int GL_RENDERBUFFER_WIDTH = 36162;
/*      */   public static final int GL_RENDERBUFFER_HEIGHT = 36163;
/*      */   public static final int GL_RENDERBUFFER_INTERNAL_FORMAT = 36164;
/*      */   public static final int GL_RENDERBUFFER_RED_SIZE = 36176;
/*      */   public static final int GL_RENDERBUFFER_GREEN_SIZE = 36177;
/*      */   public static final int GL_RENDERBUFFER_BLUE_SIZE = 36178;
/*      */   public static final int GL_RENDERBUFFER_ALPHA_SIZE = 36179;
/*      */   public static final int GL_RENDERBUFFER_DEPTH_SIZE = 36180;
/*      */   public static final int GL_RENDERBUFFER_STENCIL_SIZE = 36181;
/*      */   public static final int GL_FRAMEBUFFER_ATTACHMENT_OBJECT_TYPE = 36048;
/*      */   public static final int GL_FRAMEBUFFER_ATTACHMENT_OBJECT_NAME = 36049;
/*      */   public static final int GL_FRAMEBUFFER_ATTACHMENT_TEXTURE_LEVEL = 36050;
/*      */   public static final int GL_FRAMEBUFFER_ATTACHMENT_TEXTURE_CUBE_MAP_FACE = 36051;
/*      */   public static final int GL_FRAMEBUFFER_ATTACHMENT_TEXTURE_3D_ZOFFSET = 36052;
/*      */   public static final int GL_COLOR_ATTACHMENT0 = 36064;
/*      */   public static final int GL_COLOR_ATTACHMENT1 = 36065;
/*      */   public static final int GL_COLOR_ATTACHMENT2 = 36066;
/*      */   public static final int GL_COLOR_ATTACHMENT3 = 36067;
/*      */   public static final int GL_COLOR_ATTACHMENT4 = 36068;
/*      */   public static final int GL_COLOR_ATTACHMENT5 = 36069;
/*      */   public static final int GL_COLOR_ATTACHMENT6 = 36070;
/*      */   public static final int GL_COLOR_ATTACHMENT7 = 36071;
/*      */   public static final int GL_COLOR_ATTACHMENT8 = 36072;
/*      */   public static final int GL_COLOR_ATTACHMENT9 = 36073;
/*      */   public static final int GL_COLOR_ATTACHMENT10 = 36074;
/*      */   public static final int GL_COLOR_ATTACHMENT11 = 36075;
/*      */   public static final int GL_COLOR_ATTACHMENT12 = 36076;
/*      */   public static final int GL_COLOR_ATTACHMENT13 = 36077;
/*      */   public static final int GL_COLOR_ATTACHMENT14 = 36078;
/*      */   public static final int GL_COLOR_ATTACHMENT15 = 36079;
/*      */   public static final int GL_DEPTH_ATTACHMENT = 36096;
/*      */   public static final int GL_STENCIL_ATTACHMENT = 36128;
/*      */   public static final int GL_FRAMEBUFFER_COMPLETE = 36053;
/*      */   public static final int GL_FRAMEBUFFER_INCOMPLETE_ATTACHMENT = 36054;
/*      */   public static final int GL_FRAMEBUFFER_INCOMPLETE_MISSING_ATTACHMENT = 36055;
/*      */   public static final int GL_FRAMEBUFFER_INCOMPLETE_DIMENSIONS = 36057;
/*      */   public static final int GL_FRAMEBUFFER_INCOMPLETE_FORMATS = 36058;
/*      */   public static final int GL_FRAMEBUFFER_INCOMPLETE_DRAW_BUFFER = 36059;
/*      */   public static final int GL_FRAMEBUFFER_INCOMPLETE_READ_BUFFER = 36060;
/*      */   public static final int GL_FRAMEBUFFER_UNSUPPORTED = 36061;
/*      */   public static final int GL_FRAMEBUFFER_BINDING = 36006;
/*      */   public static final int GL_RENDERBUFFER_BINDING = 36007;
/*      */   public static final int GL_MAX_COLOR_ATTACHMENTS = 36063;
/*      */   public static final int GL_MAX_RENDERBUFFER_SIZE = 34024;
/*      */   public static final int GL_INVALID_FRAMEBUFFER_OPERATION = 1286;
/*      */   public static final int GL_HALF_FLOAT = 5131;
/*      */   public static final int GL_RENDERBUFFER_SAMPLES = 36011;
/*      */   public static final int GL_FRAMEBUFFER_INCOMPLETE_MULTISAMPLE = 36182;
/*      */   public static final int GL_MAX_SAMPLES = 36183;
/*      */   public static final int GL_READ_FRAMEBUFFER = 36008;
/*      */   public static final int GL_DRAW_FRAMEBUFFER = 36009;
/*      */   public static final int GL_DRAW_FRAMEBUFFER_BINDING = 36006;
/*      */   public static final int GL_READ_FRAMEBUFFER_BINDING = 36010;
/*      */   public static final int GL_RGBA_INTEGER_MODE = 36254;
/*      */   public static final int GL_RGBA32UI = 36208;
/*      */   public static final int GL_RGB32UI = 36209;
/*      */   public static final int GL_ALPHA32UI = 36210;
/*      */   public static final int GL_RGBA16UI = 36214;
/*      */   public static final int GL_RGB16UI = 36215;
/*      */   public static final int GL_ALPHA16UI = 36216;
/*      */   public static final int GL_RGBA8UI = 36220;
/*      */   public static final int GL_RGB8UI = 36221;
/*      */   public static final int GL_ALPHA8UI = 36222;
/*      */   public static final int GL_RGBA32I = 36226;
/*      */   public static final int GL_RGB32I = 36227;
/*      */   public static final int GL_ALPHA32I = 36228;
/*      */   public static final int GL_RGBA16I = 36232;
/*      */   public static final int GL_RGB16I = 36233;
/*      */   public static final int GL_ALPHA16I = 36234;
/*      */   public static final int GL_RGBA8I = 36238;
/*      */   public static final int GL_RGB8I = 36239;
/*      */   public static final int GL_ALPHA8I = 36240;
/*      */   public static final int GL_RED_INTEGER = 36244;
/*      */   public static final int GL_GREEN_INTEGER = 36245;
/*      */   public static final int GL_BLUE_INTEGER = 36246;
/*      */   public static final int GL_ALPHA_INTEGER = 36247;
/*      */   public static final int GL_RGB_INTEGER = 36248;
/*      */   public static final int GL_RGBA_INTEGER = 36249;
/*      */   public static final int GL_BGR_INTEGER = 36250;
/*      */   public static final int GL_BGRA_INTEGER = 36251;
/*      */   public static final int GL_TEXTURE_1D_ARRAY = 35864;
/*      */   public static final int GL_TEXTURE_2D_ARRAY = 35866;
/*      */   public static final int GL_PROXY_TEXTURE_2D_ARRAY = 35867;
/*      */   public static final int GL_PROXY_TEXTURE_1D_ARRAY = 35865;
/*      */   public static final int GL_TEXTURE_BINDING_1D_ARRAY = 35868;
/*      */   public static final int GL_TEXTURE_BINDING_2D_ARRAY = 35869;
/*      */   public static final int GL_MAX_ARRAY_TEXTURE_LAYERS = 35071;
/*      */   public static final int GL_COMPARE_REF_DEPTH_TO_TEXTURE = 34894;
/*      */   public static final int GL_FRAMEBUFFER_ATTACHMENT_TEXTURE_LAYER = 36052;
/*      */   public static final int GL_SAMPLER_1D_ARRAY = 36288;
/*      */   public static final int GL_SAMPLER_2D_ARRAY = 36289;
/*      */   public static final int GL_SAMPLER_1D_ARRAY_SHADOW = 36291;
/*      */   public static final int GL_SAMPLER_2D_ARRAY_SHADOW = 36292;
/*      */   public static final int GL_DEPTH_STENCIL = 34041;
/*      */   public static final int GL_UNSIGNED_INT_24_8 = 34042;
/*      */   public static final int GL_DEPTH24_STENCIL8 = 35056;
/*      */   public static final int GL_TEXTURE_STENCIL_SIZE = 35057;
/*      */   public static final int GL_COMPRESSED_RED_RGTC1 = 36283;
/*      */   public static final int GL_COMPRESSED_SIGNED_RED_RGTC1 = 36284;
/*      */   public static final int GL_COMPRESSED_RED_GREEN_RGTC2 = 36285;
/*      */   public static final int GL_COMPRESSED_SIGNED_RED_GREEN_RGTC2 = 36286;
/*      */   public static final int GL_R8 = 33321;
/*      */   public static final int GL_R16 = 33322;
/*      */   public static final int GL_RG8 = 33323;
/*      */   public static final int GL_RG16 = 33324;
/*      */   public static final int GL_R16F = 33325;
/*      */   public static final int GL_R32F = 33326;
/*      */   public static final int GL_RG16F = 33327;
/*      */   public static final int GL_RG32F = 33328;
/*      */   public static final int GL_R8I = 33329;
/*      */   public static final int GL_R8UI = 33330;
/*      */   public static final int GL_R16I = 33331;
/*      */   public static final int GL_R16UI = 33332;
/*      */   public static final int GL_R32I = 33333;
/*      */   public static final int GL_R32UI = 33334;
/*      */   public static final int GL_RG8I = 33335;
/*      */   public static final int GL_RG8UI = 33336;
/*      */   public static final int GL_RG16I = 33337;
/*      */   public static final int GL_RG16UI = 33338;
/*      */   public static final int GL_RG32I = 33339;
/*      */   public static final int GL_RG32UI = 33340;
/*      */   public static final int GL_RG = 33319;
/*      */   public static final int GL_RG_INTEGER = 33320;
/*      */   public static final int GL_RED = 6403;
/*      */   public static final int GL_TRANSFORM_FEEDBACK_BUFFER = 35982;
/*      */   public static final int GL_TRANSFORM_FEEDBACK_BUFFER_START = 35972;
/*      */   public static final int GL_TRANSFORM_FEEDBACK_BUFFER_SIZE = 35973;
/*      */   public static final int GL_TRANSFORM_FEEDBACK_BUFFER_BINDING = 35983;
/*      */   public static final int GL_INTERLEAVED_ATTRIBS = 35980;
/*      */   public static final int GL_SEPARATE_ATTRIBS = 35981;
/*      */   public static final int GL_PRIMITIVES_GENERATED = 35975;
/*      */   public static final int GL_TRANSFORM_FEEDBACK_PRIMITIVES_WRITTEN = 35976;
/*      */   public static final int GL_RASTERIZER_DISCARD = 35977;
/*      */   public static final int GL_MAX_TRANSFORM_FEEDBACK_INTERLEAVED_COMPONENTS = 35978;
/*      */   public static final int GL_MAX_TRANSFORM_FEEDBACK_SEPARATE_ATTRIBS = 35979;
/*      */   public static final int GL_MAX_TRANSFORM_FEEDBACK_SEPARATE_COMPONENTS = 35968;
/*      */   public static final int GL_TRANSFORM_FEEDBACK_VARYINGS = 35971;
/*      */   public static final int GL_TRANSFORM_FEEDBACK_BUFFER_MODE = 35967;
/*      */   public static final int GL_TRANSFORM_FEEDBACK_VARYING_MAX_LENGTH = 35958;
/*      */   public static final int GL_VERTEX_ARRAY_BINDING = 34229;
/*      */   public static final int GL_FRAMEBUFFER_SRGB = 36281;
/*      */   public static final int GL_FRAMEBUFFER_SRGB_CAPABLE = 36282;
/*      */   
/*      */   public static String glGetStringi(int name, int index) {
/*  519 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  520 */     long function_pointer = caps.GL30_glGetStringi_pointer;
/*  521 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  522 */     String __result = nglGetStringi(name, index, function_pointer);
/*  523 */     return __result;
/*      */   }
/*      */   private static native String nglGetStringi(int paramInt1, int paramInt2, long paramLong);
/*      */   
/*      */   public static void glClearBuffer(int buffer, int drawbuffer, FloatBuffer value) {
/*  528 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  529 */     long function_pointer = caps.GL30_glClearBufferfv_pointer;
/*  530 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  531 */     BufferChecks.checkBuffer(value, 4);
/*  532 */     nglClearBufferfv(buffer, drawbuffer, value, value.position(), function_pointer);
/*      */   }
/*      */   private static native void nglClearBufferfv(int paramInt1, int paramInt2, FloatBuffer paramFloatBuffer, int paramInt3, long paramLong);
/*      */   
/*      */   public static void glClearBuffer(int buffer, int drawbuffer, IntBuffer value) {
/*  537 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  538 */     long function_pointer = caps.GL30_glClearBufferiv_pointer;
/*  539 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  540 */     BufferChecks.checkBuffer(value, 4);
/*  541 */     nglClearBufferiv(buffer, drawbuffer, value, value.position(), function_pointer);
/*      */   }
/*      */   private static native void nglClearBufferiv(int paramInt1, int paramInt2, IntBuffer paramIntBuffer, int paramInt3, long paramLong);
/*      */   
/*      */   public static void glClearBufferu(int buffer, int drawbuffer, IntBuffer value) {
/*  546 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  547 */     long function_pointer = caps.GL30_glClearBufferuiv_pointer;
/*  548 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  549 */     BufferChecks.checkBuffer(value, 4);
/*  550 */     nglClearBufferuiv(buffer, drawbuffer, value, value.position(), function_pointer);
/*      */   }
/*      */   private static native void nglClearBufferuiv(int paramInt1, int paramInt2, IntBuffer paramIntBuffer, int paramInt3, long paramLong);
/*      */   
/*      */   public static void glClearBufferfi(int buffer, int drawbuffer, float depth, int stencil) {
/*  555 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  556 */     long function_pointer = caps.GL30_glClearBufferfi_pointer;
/*  557 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  558 */     nglClearBufferfi(buffer, drawbuffer, depth, stencil, function_pointer);
/*      */   }
/*      */   private static native void nglClearBufferfi(int paramInt1, int paramInt2, float paramFloat, int paramInt3, long paramLong);
/*      */   
/*      */   public static void glVertexAttribI1i(int index, int x) {
/*  563 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  564 */     long function_pointer = caps.GL30_glVertexAttribI1i_pointer;
/*  565 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  566 */     nglVertexAttribI1i(index, x, function_pointer);
/*      */   }
/*      */   private static native void nglVertexAttribI1i(int paramInt1, int paramInt2, long paramLong);
/*      */   
/*      */   public static void glVertexAttribI2i(int index, int x, int y) {
/*  571 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  572 */     long function_pointer = caps.GL30_glVertexAttribI2i_pointer;
/*  573 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  574 */     nglVertexAttribI2i(index, x, y, function_pointer);
/*      */   }
/*      */   private static native void nglVertexAttribI2i(int paramInt1, int paramInt2, int paramInt3, long paramLong);
/*      */   
/*      */   public static void glVertexAttribI3i(int index, int x, int y, int z) {
/*  579 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  580 */     long function_pointer = caps.GL30_glVertexAttribI3i_pointer;
/*  581 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  582 */     nglVertexAttribI3i(index, x, y, z, function_pointer);
/*      */   }
/*      */   private static native void nglVertexAttribI3i(int paramInt1, int paramInt2, int paramInt3, int paramInt4, long paramLong);
/*      */   
/*      */   public static void glVertexAttribI4i(int index, int x, int y, int z, int w) {
/*  587 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  588 */     long function_pointer = caps.GL30_glVertexAttribI4i_pointer;
/*  589 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  590 */     nglVertexAttribI4i(index, x, y, z, w, function_pointer);
/*      */   }
/*      */   private static native void nglVertexAttribI4i(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, long paramLong);
/*      */   
/*      */   public static void glVertexAttribI1ui(int index, int x) {
/*  595 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  596 */     long function_pointer = caps.GL30_glVertexAttribI1ui_pointer;
/*  597 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  598 */     nglVertexAttribI1ui(index, x, function_pointer);
/*      */   }
/*      */   private static native void nglVertexAttribI1ui(int paramInt1, int paramInt2, long paramLong);
/*      */   
/*      */   public static void glVertexAttribI2ui(int index, int x, int y) {
/*  603 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  604 */     long function_pointer = caps.GL30_glVertexAttribI2ui_pointer;
/*  605 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  606 */     nglVertexAttribI2ui(index, x, y, function_pointer);
/*      */   }
/*      */   private static native void nglVertexAttribI2ui(int paramInt1, int paramInt2, int paramInt3, long paramLong);
/*      */   
/*      */   public static void glVertexAttribI3ui(int index, int x, int y, int z) {
/*  611 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  612 */     long function_pointer = caps.GL30_glVertexAttribI3ui_pointer;
/*  613 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  614 */     nglVertexAttribI3ui(index, x, y, z, function_pointer);
/*      */   }
/*      */   private static native void nglVertexAttribI3ui(int paramInt1, int paramInt2, int paramInt3, int paramInt4, long paramLong);
/*      */   
/*      */   public static void glVertexAttribI4ui(int index, int x, int y, int z, int w) {
/*  619 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  620 */     long function_pointer = caps.GL30_glVertexAttribI4ui_pointer;
/*  621 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  622 */     nglVertexAttribI4ui(index, x, y, z, w, function_pointer);
/*      */   }
/*      */   private static native void nglVertexAttribI4ui(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, long paramLong);
/*      */   
/*      */   public static void glVertexAttribI1(int index, IntBuffer v) {
/*  627 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  628 */     long function_pointer = caps.GL30_glVertexAttribI1iv_pointer;
/*  629 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  630 */     BufferChecks.checkBuffer(v, 1);
/*  631 */     nglVertexAttribI1iv(index, v, v.position(), function_pointer);
/*      */   }
/*      */   private static native void nglVertexAttribI1iv(int paramInt1, IntBuffer paramIntBuffer, int paramInt2, long paramLong);
/*      */   
/*      */   public static void glVertexAttribI2(int index, IntBuffer v) {
/*  636 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  637 */     long function_pointer = caps.GL30_glVertexAttribI2iv_pointer;
/*  638 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  639 */     BufferChecks.checkBuffer(v, 2);
/*  640 */     nglVertexAttribI2iv(index, v, v.position(), function_pointer);
/*      */   }
/*      */   private static native void nglVertexAttribI2iv(int paramInt1, IntBuffer paramIntBuffer, int paramInt2, long paramLong);
/*      */   
/*      */   public static void glVertexAttribI3(int index, IntBuffer v) {
/*  645 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  646 */     long function_pointer = caps.GL30_glVertexAttribI3iv_pointer;
/*  647 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  648 */     BufferChecks.checkBuffer(v, 3);
/*  649 */     nglVertexAttribI3iv(index, v, v.position(), function_pointer);
/*      */   }
/*      */   private static native void nglVertexAttribI3iv(int paramInt1, IntBuffer paramIntBuffer, int paramInt2, long paramLong);
/*      */   
/*      */   public static void glVertexAttribI4(int index, IntBuffer v) {
/*  654 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  655 */     long function_pointer = caps.GL30_glVertexAttribI4iv_pointer;
/*  656 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  657 */     BufferChecks.checkBuffer(v, 4);
/*  658 */     nglVertexAttribI4iv(index, v, v.position(), function_pointer);
/*      */   }
/*      */   private static native void nglVertexAttribI4iv(int paramInt1, IntBuffer paramIntBuffer, int paramInt2, long paramLong);
/*      */   
/*      */   public static void glVertexAttribI1u(int index, IntBuffer v) {
/*  663 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  664 */     long function_pointer = caps.GL30_glVertexAttribI1uiv_pointer;
/*  665 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  666 */     BufferChecks.checkBuffer(v, 1);
/*  667 */     nglVertexAttribI1uiv(index, v, v.position(), function_pointer);
/*      */   }
/*      */   private static native void nglVertexAttribI1uiv(int paramInt1, IntBuffer paramIntBuffer, int paramInt2, long paramLong);
/*      */   
/*      */   public static void glVertexAttribI2u(int index, IntBuffer v) {
/*  672 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  673 */     long function_pointer = caps.GL30_glVertexAttribI2uiv_pointer;
/*  674 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  675 */     BufferChecks.checkBuffer(v, 2);
/*  676 */     nglVertexAttribI2uiv(index, v, v.position(), function_pointer);
/*      */   }
/*      */   private static native void nglVertexAttribI2uiv(int paramInt1, IntBuffer paramIntBuffer, int paramInt2, long paramLong);
/*      */   
/*      */   public static void glVertexAttribI3u(int index, IntBuffer v) {
/*  681 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  682 */     long function_pointer = caps.GL30_glVertexAttribI3uiv_pointer;
/*  683 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  684 */     BufferChecks.checkBuffer(v, 3);
/*  685 */     nglVertexAttribI3uiv(index, v, v.position(), function_pointer);
/*      */   }
/*      */   private static native void nglVertexAttribI3uiv(int paramInt1, IntBuffer paramIntBuffer, int paramInt2, long paramLong);
/*      */   
/*      */   public static void glVertexAttribI4u(int index, IntBuffer v) {
/*  690 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  691 */     long function_pointer = caps.GL30_glVertexAttribI4uiv_pointer;
/*  692 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  693 */     BufferChecks.checkBuffer(v, 4);
/*  694 */     nglVertexAttribI4uiv(index, v, v.position(), function_pointer);
/*      */   }
/*      */   private static native void nglVertexAttribI4uiv(int paramInt1, IntBuffer paramIntBuffer, int paramInt2, long paramLong);
/*      */   
/*      */   public static void glVertexAttribI4(int index, ByteBuffer v) {
/*  699 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  700 */     long function_pointer = caps.GL30_glVertexAttribI4bv_pointer;
/*  701 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  702 */     BufferChecks.checkBuffer(v, 4);
/*  703 */     nglVertexAttribI4bv(index, v, v.position(), function_pointer);
/*      */   }
/*      */   private static native void nglVertexAttribI4bv(int paramInt1, ByteBuffer paramByteBuffer, int paramInt2, long paramLong);
/*      */   
/*      */   public static void glVertexAttribI4(int index, ShortBuffer v) {
/*  708 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  709 */     long function_pointer = caps.GL30_glVertexAttribI4sv_pointer;
/*  710 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  711 */     BufferChecks.checkBuffer(v, 4);
/*  712 */     nglVertexAttribI4sv(index, v, v.position(), function_pointer);
/*      */   }
/*      */   private static native void nglVertexAttribI4sv(int paramInt1, ShortBuffer paramShortBuffer, int paramInt2, long paramLong);
/*      */   
/*      */   public static void glVertexAttribI4u(int index, ByteBuffer v) {
/*  717 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  718 */     long function_pointer = caps.GL30_glVertexAttribI4ubv_pointer;
/*  719 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  720 */     BufferChecks.checkBuffer(v, 4);
/*  721 */     nglVertexAttribI4ubv(index, v, v.position(), function_pointer);
/*      */   }
/*      */   private static native void nglVertexAttribI4ubv(int paramInt1, ByteBuffer paramByteBuffer, int paramInt2, long paramLong);
/*      */   
/*      */   public static void glVertexAttribI4u(int index, ShortBuffer v) {
/*  726 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  727 */     long function_pointer = caps.GL30_glVertexAttribI4usv_pointer;
/*  728 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  729 */     BufferChecks.checkBuffer(v, 4);
/*  730 */     nglVertexAttribI4usv(index, v, v.position(), function_pointer);
/*      */   }
/*      */   private static native void nglVertexAttribI4usv(int paramInt1, ShortBuffer paramShortBuffer, int paramInt2, long paramLong);
/*      */   
/*      */   public static void glVertexAttribIPointer(int index, int size, int type, int stride, ByteBuffer buffer) {
/*  735 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  736 */     long function_pointer = caps.GL30_glVertexAttribIPointer_pointer;
/*  737 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  738 */     GLChecks.ensureArrayVBOdisabled(caps);
/*  739 */     BufferChecks.checkDirect(buffer);
/*  740 */     (GLChecks.getReferences(caps)).GL30_glVertexAttribIPointer_buffer = buffer;
/*  741 */     nglVertexAttribIPointer(index, size, type, stride, buffer, buffer.position(), function_pointer);
/*      */   }
/*      */   public static void glVertexAttribIPointer(int index, int size, int type, int stride, IntBuffer buffer) {
/*  744 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  745 */     long function_pointer = caps.GL30_glVertexAttribIPointer_pointer;
/*  746 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  747 */     GLChecks.ensureArrayVBOdisabled(caps);
/*  748 */     BufferChecks.checkDirect(buffer);
/*  749 */     (GLChecks.getReferences(caps)).GL30_glVertexAttribIPointer_buffer = buffer;
/*  750 */     nglVertexAttribIPointer(index, size, type, stride, buffer, buffer.position() << 2, function_pointer);
/*      */   }
/*      */   public static void glVertexAttribIPointer(int index, int size, int type, int stride, ShortBuffer buffer) {
/*  753 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  754 */     long function_pointer = caps.GL30_glVertexAttribIPointer_pointer;
/*  755 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  756 */     GLChecks.ensureArrayVBOdisabled(caps);
/*  757 */     BufferChecks.checkDirect(buffer);
/*  758 */     (GLChecks.getReferences(caps)).GL30_glVertexAttribIPointer_buffer = buffer;
/*  759 */     nglVertexAttribIPointer(index, size, type, stride, buffer, buffer.position() << 1, function_pointer);
/*      */   }
/*      */   
/*      */   public static void glVertexAttribIPointer(int index, int size, int type, int stride, long buffer_buffer_offset) {
/*  763 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  764 */     long function_pointer = caps.GL30_glVertexAttribIPointer_pointer;
/*  765 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  766 */     GLChecks.ensureArrayVBOenabled(caps);
/*  767 */     nglVertexAttribIPointerBO(index, size, type, stride, buffer_buffer_offset, function_pointer);
/*      */   }
/*      */   private static native void nglVertexAttribIPointer(int paramInt1, int paramInt2, int paramInt3, int paramInt4, Buffer paramBuffer, int paramInt5, long paramLong);
/*      */   private static native void nglVertexAttribIPointerBO(int paramInt1, int paramInt2, int paramInt3, int paramInt4, long paramLong1, long paramLong2);
/*      */   public static void glGetVertexAttribI(int index, int pname, IntBuffer params) {
/*  772 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  773 */     long function_pointer = caps.GL30_glGetVertexAttribIiv_pointer;
/*  774 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  775 */     BufferChecks.checkBuffer(params, 4);
/*  776 */     nglGetVertexAttribIiv(index, pname, params, params.position(), function_pointer);
/*      */   }
/*      */   private static native void nglGetVertexAttribIiv(int paramInt1, int paramInt2, IntBuffer paramIntBuffer, int paramInt3, long paramLong);
/*      */   
/*      */   public static void glGetVertexAttribIu(int index, int pname, IntBuffer params) {
/*  781 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  782 */     long function_pointer = caps.GL30_glGetVertexAttribIuiv_pointer;
/*  783 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  784 */     BufferChecks.checkBuffer(params, 4);
/*  785 */     nglGetVertexAttribIuiv(index, pname, params, params.position(), function_pointer);
/*      */   }
/*      */   private static native void nglGetVertexAttribIuiv(int paramInt1, int paramInt2, IntBuffer paramIntBuffer, int paramInt3, long paramLong);
/*      */   
/*      */   public static void glUniform1ui(int location, int v0) {
/*  790 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  791 */     long function_pointer = caps.GL30_glUniform1ui_pointer;
/*  792 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  793 */     nglUniform1ui(location, v0, function_pointer);
/*      */   }
/*      */   private static native void nglUniform1ui(int paramInt1, int paramInt2, long paramLong);
/*      */   
/*      */   public static void glUniform2ui(int location, int v0, int v1) {
/*  798 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  799 */     long function_pointer = caps.GL30_glUniform2ui_pointer;
/*  800 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  801 */     nglUniform2ui(location, v0, v1, function_pointer);
/*      */   }
/*      */   private static native void nglUniform2ui(int paramInt1, int paramInt2, int paramInt3, long paramLong);
/*      */   
/*      */   public static void glUniform3ui(int location, int v0, int v1, int v2) {
/*  806 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  807 */     long function_pointer = caps.GL30_glUniform3ui_pointer;
/*  808 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  809 */     nglUniform3ui(location, v0, v1, v2, function_pointer);
/*      */   }
/*      */   private static native void nglUniform3ui(int paramInt1, int paramInt2, int paramInt3, int paramInt4, long paramLong);
/*      */   
/*      */   public static void glUniform4ui(int location, int v0, int v1, int v2, int v3) {
/*  814 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  815 */     long function_pointer = caps.GL30_glUniform4ui_pointer;
/*  816 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  817 */     nglUniform4ui(location, v0, v1, v2, v3, function_pointer);
/*      */   }
/*      */   private static native void nglUniform4ui(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, long paramLong);
/*      */   
/*      */   public static void glUniform1u(int location, IntBuffer value) {
/*  822 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  823 */     long function_pointer = caps.GL30_glUniform1uiv_pointer;
/*  824 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  825 */     BufferChecks.checkDirect(value);
/*  826 */     nglUniform1uiv(location, value.remaining(), value, value.position(), function_pointer);
/*      */   }
/*      */   private static native void nglUniform1uiv(int paramInt1, int paramInt2, IntBuffer paramIntBuffer, int paramInt3, long paramLong);
/*      */   
/*      */   public static void glUniform2u(int location, IntBuffer value) {
/*  831 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  832 */     long function_pointer = caps.GL30_glUniform2uiv_pointer;
/*  833 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  834 */     BufferChecks.checkDirect(value);
/*  835 */     nglUniform2uiv(location, value.remaining() >> 1, value, value.position(), function_pointer);
/*      */   }
/*      */   private static native void nglUniform2uiv(int paramInt1, int paramInt2, IntBuffer paramIntBuffer, int paramInt3, long paramLong);
/*      */   
/*      */   public static void glUniform3u(int location, IntBuffer value) {
/*  840 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  841 */     long function_pointer = caps.GL30_glUniform3uiv_pointer;
/*  842 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  843 */     BufferChecks.checkDirect(value);
/*  844 */     nglUniform3uiv(location, value.remaining() / 3, value, value.position(), function_pointer);
/*      */   }
/*      */   private static native void nglUniform3uiv(int paramInt1, int paramInt2, IntBuffer paramIntBuffer, int paramInt3, long paramLong);
/*      */   
/*      */   public static void glUniform4u(int location, IntBuffer value) {
/*  849 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  850 */     long function_pointer = caps.GL30_glUniform4uiv_pointer;
/*  851 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  852 */     BufferChecks.checkDirect(value);
/*  853 */     nglUniform4uiv(location, value.remaining() >> 2, value, value.position(), function_pointer);
/*      */   }
/*      */   private static native void nglUniform4uiv(int paramInt1, int paramInt2, IntBuffer paramIntBuffer, int paramInt3, long paramLong);
/*      */   
/*      */   public static void glGetUniformu(int program, int location, IntBuffer params) {
/*  858 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  859 */     long function_pointer = caps.GL30_glGetUniformuiv_pointer;
/*  860 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  861 */     BufferChecks.checkDirect(params);
/*  862 */     nglGetUniformuiv(program, location, params, params.position(), function_pointer);
/*      */   }
/*      */   private static native void nglGetUniformuiv(int paramInt1, int paramInt2, IntBuffer paramIntBuffer, int paramInt3, long paramLong);
/*      */   
/*      */   public static void glBindFragDataLocation(int program, int colorNumber, ByteBuffer name) {
/*  867 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  868 */     long function_pointer = caps.GL30_glBindFragDataLocation_pointer;
/*  869 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  870 */     BufferChecks.checkDirect(name);
/*  871 */     BufferChecks.checkNullTerminated(name);
/*  872 */     nglBindFragDataLocation(program, colorNumber, name, name.position(), function_pointer);
/*      */   }
/*      */   
/*      */   private static native void nglBindFragDataLocation(int paramInt1, int paramInt2, ByteBuffer paramByteBuffer, int paramInt3, long paramLong);
/*      */   
/*      */   public static void glBindFragDataLocation(int program, int colorNumber, CharSequence name) {
/*  878 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  879 */     long function_pointer = caps.GL30_glBindFragDataLocation_pointer;
/*  880 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  881 */     nglBindFragDataLocation(program, colorNumber, APIUtils.getBufferNT(name), 0, function_pointer);
/*      */   }
/*      */   
/*      */   public static int glGetFragDataLocation(int program, ByteBuffer name) {
/*  885 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  886 */     long function_pointer = caps.GL30_glGetFragDataLocation_pointer;
/*  887 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  888 */     BufferChecks.checkDirect(name);
/*  889 */     BufferChecks.checkNullTerminated(name);
/*  890 */     int __result = nglGetFragDataLocation(program, name, name.position(), function_pointer);
/*  891 */     return __result;
/*      */   }
/*      */   
/*      */   private static native int nglGetFragDataLocation(int paramInt1, ByteBuffer paramByteBuffer, int paramInt2, long paramLong);
/*      */   
/*      */   public static int glGetFragDataLocation(int program, CharSequence name) {
/*  897 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  898 */     long function_pointer = caps.GL30_glGetFragDataLocation_pointer;
/*  899 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  900 */     int __result = nglGetFragDataLocation(program, APIUtils.getBufferNT(name), 0, function_pointer);
/*  901 */     return __result;
/*      */   }
/*      */   
/*      */   public static void glBeginConditionalRender(int id, int mode) {
/*  905 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  906 */     long function_pointer = caps.GL30_glBeginConditionalRender_pointer;
/*  907 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  908 */     nglBeginConditionalRender(id, mode, function_pointer);
/*      */   }
/*      */   private static native void nglBeginConditionalRender(int paramInt1, int paramInt2, long paramLong);
/*      */   
/*      */   public static void glEndConditionalRender() {
/*  913 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  914 */     long function_pointer = caps.GL30_glEndConditionalRender_pointer;
/*  915 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  916 */     nglEndConditionalRender(function_pointer);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private static native void nglEndConditionalRender(long paramLong);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static ByteBuffer glMapBufferRange(int target, long offset, long length, int access, ByteBuffer old_buffer) {
/*  933 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  934 */     long function_pointer = caps.GL30_glMapBufferRange_pointer;
/*  935 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  936 */     if (old_buffer != null)
/*  937 */       BufferChecks.checkDirect(old_buffer); 
/*  938 */     ByteBuffer __result = nglMapBufferRange(target, offset, length, access, old_buffer, function_pointer);
/*  939 */     return __result;
/*      */   }
/*      */   private static native ByteBuffer nglMapBufferRange(int paramInt1, long paramLong1, long paramLong2, int paramInt2, ByteBuffer paramByteBuffer, long paramLong3);
/*      */   
/*      */   public static void glFlushMappedBufferRange(int target, long offset, long length) {
/*  944 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  945 */     long function_pointer = caps.GL30_glFlushMappedBufferRange_pointer;
/*  946 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  947 */     nglFlushMappedBufferRange(target, offset, length, function_pointer);
/*      */   }
/*      */   private static native void nglFlushMappedBufferRange(int paramInt, long paramLong1, long paramLong2, long paramLong3);
/*      */   
/*      */   public static void glClampColor(int target, int clamp) {
/*  952 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  953 */     long function_pointer = caps.GL30_glClampColor_pointer;
/*  954 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  955 */     nglClampColor(target, clamp, function_pointer);
/*      */   }
/*      */   private static native void nglClampColor(int paramInt1, int paramInt2, long paramLong);
/*      */   
/*      */   public static boolean glIsRenderbuffer(int renderbuffer) {
/*  960 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  961 */     long function_pointer = caps.GL30_glIsRenderbuffer_pointer;
/*  962 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  963 */     boolean __result = nglIsRenderbuffer(renderbuffer, function_pointer);
/*  964 */     return __result;
/*      */   }
/*      */   private static native boolean nglIsRenderbuffer(int paramInt, long paramLong);
/*      */   
/*      */   public static void glBindRenderbuffer(int target, int renderbuffer) {
/*  969 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  970 */     long function_pointer = caps.GL30_glBindRenderbuffer_pointer;
/*  971 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  972 */     nglBindRenderbuffer(target, renderbuffer, function_pointer);
/*      */   }
/*      */   private static native void nglBindRenderbuffer(int paramInt1, int paramInt2, long paramLong);
/*      */   
/*      */   public static void glDeleteRenderbuffers(IntBuffer renderbuffers) {
/*  977 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  978 */     long function_pointer = caps.GL30_glDeleteRenderbuffers_pointer;
/*  979 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  980 */     BufferChecks.checkDirect(renderbuffers);
/*  981 */     nglDeleteRenderbuffers(renderbuffers.remaining(), renderbuffers, renderbuffers.position(), function_pointer);
/*      */   }
/*      */   
/*      */   private static native void nglDeleteRenderbuffers(int paramInt1, IntBuffer paramIntBuffer, int paramInt2, long paramLong);
/*      */   
/*      */   public static void glDeleteRenderbuffers(int renderbuffer) {
/*  987 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  988 */     long function_pointer = caps.GL30_glDeleteRenderbuffers_pointer;
/*  989 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  990 */     nglDeleteRenderbuffers(1, APIUtils.getBufferInt().put(0, renderbuffer), 0, function_pointer);
/*      */   }
/*      */   
/*      */   public static void glGenRenderbuffers(IntBuffer renderbuffers) {
/*  994 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  995 */     long function_pointer = caps.GL30_glGenRenderbuffers_pointer;
/*  996 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  997 */     BufferChecks.checkDirect(renderbuffers);
/*  998 */     nglGenRenderbuffers(renderbuffers.remaining(), renderbuffers, renderbuffers.position(), function_pointer);
/*      */   }
/*      */   
/*      */   private static native void nglGenRenderbuffers(int paramInt1, IntBuffer paramIntBuffer, int paramInt2, long paramLong);
/*      */   
/*      */   public static int glGenRenderbuffers() {
/* 1004 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 1005 */     long function_pointer = caps.GL30_glGenRenderbuffers_pointer;
/* 1006 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 1007 */     IntBuffer renderbuffers = APIUtils.getBufferInt();
/* 1008 */     nglGenRenderbuffers(1, renderbuffers, renderbuffers.position(), function_pointer);
/* 1009 */     return renderbuffers.get(0);
/*      */   }
/*      */   
/*      */   public static void glRenderbufferStorage(int target, int internalformat, int width, int height) {
/* 1013 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 1014 */     long function_pointer = caps.GL30_glRenderbufferStorage_pointer;
/* 1015 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 1016 */     nglRenderbufferStorage(target, internalformat, width, height, function_pointer);
/*      */   }
/*      */   private static native void nglRenderbufferStorage(int paramInt1, int paramInt2, int paramInt3, int paramInt4, long paramLong);
/*      */   
/*      */   public static void glGetRenderbufferParameter(int target, int pname, IntBuffer params) {
/* 1021 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 1022 */     long function_pointer = caps.GL30_glGetRenderbufferParameteriv_pointer;
/* 1023 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 1024 */     BufferChecks.checkBuffer(params, 4);
/* 1025 */     nglGetRenderbufferParameteriv(target, pname, params, params.position(), function_pointer);
/*      */   }
/*      */   
/*      */   private static native void nglGetRenderbufferParameteriv(int paramInt1, int paramInt2, IntBuffer paramIntBuffer, int paramInt3, long paramLong);
/*      */   
/*      */   public static int glGetRenderbufferParameter(int target, int pname) {
/* 1031 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 1032 */     long function_pointer = caps.GL30_glGetRenderbufferParameteriv_pointer;
/* 1033 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 1034 */     IntBuffer params = APIUtils.getBufferInt();
/* 1035 */     nglGetRenderbufferParameteriv(target, pname, params, params.position(), function_pointer);
/* 1036 */     return params.get(0);
/*      */   }
/*      */   
/*      */   public static boolean glIsFramebuffer(int framebuffer) {
/* 1040 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 1041 */     long function_pointer = caps.GL30_glIsFramebuffer_pointer;
/* 1042 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 1043 */     boolean __result = nglIsFramebuffer(framebuffer, function_pointer);
/* 1044 */     return __result;
/*      */   }
/*      */   private static native boolean nglIsFramebuffer(int paramInt, long paramLong);
/*      */   
/*      */   public static void glBindFramebuffer(int target, int framebuffer) {
/* 1049 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 1050 */     long function_pointer = caps.GL30_glBindFramebuffer_pointer;
/* 1051 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 1052 */     nglBindFramebuffer(target, framebuffer, function_pointer);
/*      */   }
/*      */   private static native void nglBindFramebuffer(int paramInt1, int paramInt2, long paramLong);
/*      */   
/*      */   public static void glDeleteFramebuffers(IntBuffer framebuffers) {
/* 1057 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 1058 */     long function_pointer = caps.GL30_glDeleteFramebuffers_pointer;
/* 1059 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 1060 */     BufferChecks.checkDirect(framebuffers);
/* 1061 */     nglDeleteFramebuffers(framebuffers.remaining(), framebuffers, framebuffers.position(), function_pointer);
/*      */   }
/*      */   
/*      */   private static native void nglDeleteFramebuffers(int paramInt1, IntBuffer paramIntBuffer, int paramInt2, long paramLong);
/*      */   
/*      */   public static void glDeleteFramebuffers(int framebuffer) {
/* 1067 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 1068 */     long function_pointer = caps.GL30_glDeleteFramebuffers_pointer;
/* 1069 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 1070 */     nglDeleteFramebuffers(1, APIUtils.getBufferInt().put(0, framebuffer), 0, function_pointer);
/*      */   }
/*      */   
/*      */   public static void glGenFramebuffers(IntBuffer framebuffers) {
/* 1074 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 1075 */     long function_pointer = caps.GL30_glGenFramebuffers_pointer;
/* 1076 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 1077 */     BufferChecks.checkDirect(framebuffers);
/* 1078 */     nglGenFramebuffers(framebuffers.remaining(), framebuffers, framebuffers.position(), function_pointer);
/*      */   }
/*      */   
/*      */   private static native void nglGenFramebuffers(int paramInt1, IntBuffer paramIntBuffer, int paramInt2, long paramLong);
/*      */   
/*      */   public static int glGenFramebuffers() {
/* 1084 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 1085 */     long function_pointer = caps.GL30_glGenFramebuffers_pointer;
/* 1086 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 1087 */     IntBuffer framebuffers = APIUtils.getBufferInt();
/* 1088 */     nglGenFramebuffers(1, framebuffers, framebuffers.position(), function_pointer);
/* 1089 */     return framebuffers.get(0);
/*      */   }
/*      */   
/*      */   public static int glCheckFramebufferStatus(int target) {
/* 1093 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 1094 */     long function_pointer = caps.GL30_glCheckFramebufferStatus_pointer;
/* 1095 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 1096 */     int __result = nglCheckFramebufferStatus(target, function_pointer);
/* 1097 */     return __result;
/*      */   }
/*      */   private static native int nglCheckFramebufferStatus(int paramInt, long paramLong);
/*      */   
/*      */   public static void glFramebufferTexture1D(int target, int attachment, int textarget, int texture, int level) {
/* 1102 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 1103 */     long function_pointer = caps.GL30_glFramebufferTexture1D_pointer;
/* 1104 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 1105 */     nglFramebufferTexture1D(target, attachment, textarget, texture, level, function_pointer);
/*      */   }
/*      */   private static native void nglFramebufferTexture1D(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, long paramLong);
/*      */   
/*      */   public static void glFramebufferTexture2D(int target, int attachment, int textarget, int texture, int level) {
/* 1110 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 1111 */     long function_pointer = caps.GL30_glFramebufferTexture2D_pointer;
/* 1112 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 1113 */     nglFramebufferTexture2D(target, attachment, textarget, texture, level, function_pointer);
/*      */   }
/*      */   private static native void nglFramebufferTexture2D(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, long paramLong);
/*      */   
/*      */   public static void glFramebufferTexture3D(int target, int attachment, int textarget, int texture, int level, int zoffset) {
/* 1118 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 1119 */     long function_pointer = caps.GL30_glFramebufferTexture3D_pointer;
/* 1120 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 1121 */     nglFramebufferTexture3D(target, attachment, textarget, texture, level, zoffset, function_pointer);
/*      */   }
/*      */   private static native void nglFramebufferTexture3D(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, long paramLong);
/*      */   
/*      */   public static void glFramebufferRenderbuffer(int target, int attachment, int renderbuffertarget, int renderbuffer) {
/* 1126 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 1127 */     long function_pointer = caps.GL30_glFramebufferRenderbuffer_pointer;
/* 1128 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 1129 */     nglFramebufferRenderbuffer(target, attachment, renderbuffertarget, renderbuffer, function_pointer);
/*      */   }
/*      */   private static native void nglFramebufferRenderbuffer(int paramInt1, int paramInt2, int paramInt3, int paramInt4, long paramLong);
/*      */   
/*      */   public static void glGetFramebufferAttachmentParameter(int target, int attachment, int pname, IntBuffer params) {
/* 1134 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 1135 */     long function_pointer = caps.GL30_glGetFramebufferAttachmentParameteriv_pointer;
/* 1136 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 1137 */     BufferChecks.checkBuffer(params, 4);
/* 1138 */     nglGetFramebufferAttachmentParameteriv(target, attachment, pname, params, params.position(), function_pointer);
/*      */   }
/*      */   
/*      */   private static native void nglGetFramebufferAttachmentParameteriv(int paramInt1, int paramInt2, int paramInt3, IntBuffer paramIntBuffer, int paramInt4, long paramLong);
/*      */   
/*      */   public static int glGetFramebufferAttachmentParameter(int target, int attachment, int pname) {
/* 1144 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 1145 */     long function_pointer = caps.GL30_glGetFramebufferAttachmentParameteriv_pointer;
/* 1146 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 1147 */     IntBuffer params = APIUtils.getBufferInt();
/* 1148 */     nglGetFramebufferAttachmentParameteriv(target, attachment, pname, params, params.position(), function_pointer);
/* 1149 */     return params.get(0);
/*      */   }
/*      */   
/*      */   public static void glGenerateMipmap(int target) {
/* 1153 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 1154 */     long function_pointer = caps.GL30_glGenerateMipmap_pointer;
/* 1155 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 1156 */     nglGenerateMipmap(target, function_pointer);
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   private static native void nglGenerateMipmap(int paramInt, long paramLong);
/*      */ 
/*      */   
/*      */   public static void glRenderbufferStorageMultisample(int target, int samples, int internalformat, int width, int height) {
/* 1165 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 1166 */     long function_pointer = caps.GL30_glRenderbufferStorageMultisample_pointer;
/* 1167 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 1168 */     nglRenderbufferStorageMultisample(target, samples, internalformat, width, height, function_pointer);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private static native void nglRenderbufferStorageMultisample(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, long paramLong);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void glBlitFramebuffer(int srcX0, int srcY0, int srcX1, int srcY1, int dstX0, int dstY0, int dstX1, int dstY1, int mask, int filter) {
/* 1190 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 1191 */     long function_pointer = caps.GL30_glBlitFramebuffer_pointer;
/* 1192 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 1193 */     nglBlitFramebuffer(srcX0, srcY0, srcX1, srcY1, dstX0, dstY0, dstX1, dstY1, mask, filter, function_pointer);
/*      */   }
/*      */   private static native void nglBlitFramebuffer(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, int paramInt9, int paramInt10, long paramLong);
/*      */   
/*      */   public static void glTexParameterI(int target, int pname, IntBuffer params) {
/* 1198 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 1199 */     long function_pointer = caps.GL30_glTexParameterIiv_pointer;
/* 1200 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 1201 */     BufferChecks.checkBuffer(params, 4);
/* 1202 */     nglTexParameterIiv(target, pname, params, params.position(), function_pointer);
/*      */   }
/*      */   
/*      */   private static native void nglTexParameterIiv(int paramInt1, int paramInt2, IntBuffer paramIntBuffer, int paramInt3, long paramLong);
/*      */   
/*      */   public static void glTexParameterIi(int target, int pname, int param) {
/* 1208 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 1209 */     long function_pointer = caps.GL30_glTexParameterIiv_pointer;
/* 1210 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 1211 */     nglTexParameterIiv(target, pname, APIUtils.getBufferInt().put(0, param), 0, function_pointer);
/*      */   }
/*      */   
/*      */   public static void glTexParameterIu(int target, int pname, IntBuffer params) {
/* 1215 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 1216 */     long function_pointer = caps.GL30_glTexParameterIuiv_pointer;
/* 1217 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 1218 */     BufferChecks.checkBuffer(params, 4);
/* 1219 */     nglTexParameterIuiv(target, pname, params, params.position(), function_pointer);
/*      */   }
/*      */   
/*      */   private static native void nglTexParameterIuiv(int paramInt1, int paramInt2, IntBuffer paramIntBuffer, int paramInt3, long paramLong);
/*      */   
/*      */   public static void glTexParameterIui(int target, int pname, int param) {
/* 1225 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 1226 */     long function_pointer = caps.GL30_glTexParameterIuiv_pointer;
/* 1227 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 1228 */     nglTexParameterIuiv(target, pname, APIUtils.getBufferInt().put(0, param), 0, function_pointer);
/*      */   }
/*      */   
/*      */   public static void glGetTexParameterI(int target, int pname, IntBuffer params) {
/* 1232 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 1233 */     long function_pointer = caps.GL30_glGetTexParameterIiv_pointer;
/* 1234 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 1235 */     BufferChecks.checkBuffer(params, 4);
/* 1236 */     nglGetTexParameterIiv(target, pname, params, params.position(), function_pointer);
/*      */   }
/*      */   
/*      */   private static native void nglGetTexParameterIiv(int paramInt1, int paramInt2, IntBuffer paramIntBuffer, int paramInt3, long paramLong);
/*      */   
/*      */   public static int glGetTexParameterIi(int target, int pname) {
/* 1242 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 1243 */     long function_pointer = caps.GL30_glGetTexParameterIiv_pointer;
/* 1244 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 1245 */     IntBuffer params = APIUtils.getBufferInt();
/* 1246 */     nglGetTexParameterIiv(target, pname, params, params.position(), function_pointer);
/* 1247 */     return params.get(0);
/*      */   }
/*      */   
/*      */   public static void glGetTexParameterIu(int target, int pname, IntBuffer params) {
/* 1251 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 1252 */     long function_pointer = caps.GL30_glGetTexParameterIuiv_pointer;
/* 1253 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 1254 */     BufferChecks.checkBuffer(params, 4);
/* 1255 */     nglGetTexParameterIuiv(target, pname, params, params.position(), function_pointer);
/*      */   }
/*      */   
/*      */   private static native void nglGetTexParameterIuiv(int paramInt1, int paramInt2, IntBuffer paramIntBuffer, int paramInt3, long paramLong);
/*      */   
/*      */   public static int glGetTexParameterIui(int target, int pname) {
/* 1261 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 1262 */     long function_pointer = caps.GL30_glGetTexParameterIuiv_pointer;
/* 1263 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 1264 */     IntBuffer params = APIUtils.getBufferInt();
/* 1265 */     nglGetTexParameterIuiv(target, pname, params, params.position(), function_pointer);
/* 1266 */     return params.get(0);
/*      */   }
/*      */   
/*      */   public static void glFramebufferTextureLayer(int target, int attachment, int texture, int level, int layer) {
/* 1270 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 1271 */     long function_pointer = caps.GL30_glFramebufferTextureLayer_pointer;
/* 1272 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 1273 */     nglFramebufferTextureLayer(target, attachment, texture, level, layer, function_pointer);
/*      */   }
/*      */   private static native void nglFramebufferTextureLayer(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, long paramLong);
/*      */   
/*      */   public static void glColorMaski(int buf, boolean r, boolean g, boolean b, boolean a) {
/* 1278 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 1279 */     long function_pointer = caps.GL30_glColorMaski_pointer;
/* 1280 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 1281 */     nglColorMaski(buf, r, g, b, a, function_pointer);
/*      */   }
/*      */   private static native void nglColorMaski(int paramInt, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, boolean paramBoolean4, long paramLong);
/*      */   
/*      */   public static void glGetBoolean(int value, int index, ByteBuffer data) {
/* 1286 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 1287 */     long function_pointer = caps.GL30_glGetBooleani_v_pointer;
/* 1288 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 1289 */     BufferChecks.checkBuffer(data, 4);
/* 1290 */     nglGetBooleani_v(value, index, data, data.position(), function_pointer);
/*      */   }
/*      */   
/*      */   private static native void nglGetBooleani_v(int paramInt1, int paramInt2, ByteBuffer paramByteBuffer, int paramInt3, long paramLong);
/*      */   
/*      */   public static boolean glGetBoolean(int value, int index) {
/* 1296 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 1297 */     long function_pointer = caps.GL30_glGetBooleani_v_pointer;
/* 1298 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 1299 */     ByteBuffer data = APIUtils.getBufferByte(1);
/* 1300 */     nglGetBooleani_v(value, index, data, data.position(), function_pointer);
/* 1301 */     return (data.get(0) == 1);
/*      */   }
/*      */   
/*      */   public static void glGetInteger(int value, int index, IntBuffer data) {
/* 1305 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 1306 */     long function_pointer = caps.GL30_glGetIntegeri_v_pointer;
/* 1307 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 1308 */     BufferChecks.checkBuffer(data, 4);
/* 1309 */     nglGetIntegeri_v(value, index, data, data.position(), function_pointer);
/*      */   }
/*      */   
/*      */   private static native void nglGetIntegeri_v(int paramInt1, int paramInt2, IntBuffer paramIntBuffer, int paramInt3, long paramLong);
/*      */   
/*      */   public static int glGetInteger(int value, int index) {
/* 1315 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 1316 */     long function_pointer = caps.GL30_glGetIntegeri_v_pointer;
/* 1317 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 1318 */     IntBuffer data = APIUtils.getBufferInt();
/* 1319 */     nglGetIntegeri_v(value, index, data, data.position(), function_pointer);
/* 1320 */     return data.get(0);
/*      */   }
/*      */   
/*      */   public static void glEnablei(int target, int index) {
/* 1324 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 1325 */     long function_pointer = caps.GL30_glEnablei_pointer;
/* 1326 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 1327 */     nglEnablei(target, index, function_pointer);
/*      */   }
/*      */   private static native void nglEnablei(int paramInt1, int paramInt2, long paramLong);
/*      */   
/*      */   public static void glDisablei(int target, int index) {
/* 1332 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 1333 */     long function_pointer = caps.GL30_glDisablei_pointer;
/* 1334 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 1335 */     nglDisablei(target, index, function_pointer);
/*      */   }
/*      */   private static native void nglDisablei(int paramInt1, int paramInt2, long paramLong);
/*      */   
/*      */   public static boolean glIsEnabledi(int target, int index) {
/* 1340 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 1341 */     long function_pointer = caps.GL30_glIsEnabledi_pointer;
/* 1342 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 1343 */     boolean __result = nglIsEnabledi(target, index, function_pointer);
/* 1344 */     return __result;
/*      */   }
/*      */   private static native boolean nglIsEnabledi(int paramInt1, int paramInt2, long paramLong);
/*      */   
/*      */   public static void glBindBufferRange(int target, int index, int buffer, long offset, long size) {
/* 1349 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 1350 */     long function_pointer = caps.GL30_glBindBufferRange_pointer;
/* 1351 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 1352 */     nglBindBufferRange(target, index, buffer, offset, size, function_pointer);
/*      */   }
/*      */   private static native void nglBindBufferRange(int paramInt1, int paramInt2, int paramInt3, long paramLong1, long paramLong2, long paramLong3);
/*      */   
/*      */   public static void glBindBufferBase(int target, int index, int buffer) {
/* 1357 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 1358 */     long function_pointer = caps.GL30_glBindBufferBase_pointer;
/* 1359 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 1360 */     nglBindBufferBase(target, index, buffer, function_pointer);
/*      */   }
/*      */   private static native void nglBindBufferBase(int paramInt1, int paramInt2, int paramInt3, long paramLong);
/*      */   
/*      */   public static void glBeginTransformFeedback(int primitiveMode) {
/* 1365 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 1366 */     long function_pointer = caps.GL30_glBeginTransformFeedback_pointer;
/* 1367 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 1368 */     nglBeginTransformFeedback(primitiveMode, function_pointer);
/*      */   }
/*      */   private static native void nglBeginTransformFeedback(int paramInt, long paramLong);
/*      */   
/*      */   public static void glEndTransformFeedback() {
/* 1373 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 1374 */     long function_pointer = caps.GL30_glEndTransformFeedback_pointer;
/* 1375 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 1376 */     nglEndTransformFeedback(function_pointer);
/*      */   }
/*      */   private static native void nglEndTransformFeedback(long paramLong);
/*      */   
/*      */   public static void glTransformFeedbackVaryings(int program, int count, ByteBuffer varyings, int bufferMode) {
/* 1381 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 1382 */     long function_pointer = caps.GL30_glTransformFeedbackVaryings_pointer;
/* 1383 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 1384 */     BufferChecks.checkDirect(varyings);
/* 1385 */     BufferChecks.checkNullTerminated(varyings, count);
/* 1386 */     nglTransformFeedbackVaryings(program, count, varyings, varyings.position(), bufferMode, function_pointer);
/*      */   }
/*      */   
/*      */   private static native void nglTransformFeedbackVaryings(int paramInt1, int paramInt2, ByteBuffer paramByteBuffer, int paramInt3, int paramInt4, long paramLong);
/*      */   
/*      */   public static void glTransformFeedbackVaryings(int program, CharSequence[] varyings, int bufferMode) {
/* 1392 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 1393 */     long function_pointer = caps.GL30_glTransformFeedbackVaryings_pointer;
/* 1394 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 1395 */     nglTransformFeedbackVaryings(program, varyings.length, APIUtils.getBufferNT(varyings), 0, bufferMode, function_pointer);
/*      */   }
/*      */   
/*      */   public static void glGetTransformFeedbackVarying(int program, int index, IntBuffer length, IntBuffer size, IntBuffer type, ByteBuffer name) {
/* 1399 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 1400 */     long function_pointer = caps.GL30_glGetTransformFeedbackVarying_pointer;
/* 1401 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 1402 */     if (length != null)
/* 1403 */       BufferChecks.checkBuffer(length, 1); 
/* 1404 */     BufferChecks.checkBuffer(size, 1);
/* 1405 */     BufferChecks.checkBuffer(type, 1);
/* 1406 */     BufferChecks.checkDirect(name);
/* 1407 */     nglGetTransformFeedbackVarying(program, index, name.remaining(), length, (length != null) ? length.position() : 0, size, size.position(), type, type.position(), name, name.position(), function_pointer);
/*      */   }
/*      */   
/*      */   private static native void nglGetTransformFeedbackVarying(int paramInt1, int paramInt2, int paramInt3, IntBuffer paramIntBuffer1, int paramInt4, IntBuffer paramIntBuffer2, int paramInt5, IntBuffer paramIntBuffer3, int paramInt6, ByteBuffer paramByteBuffer, int paramInt7, long paramLong);
/*      */   
/*      */   public static String glGetTransformFeedbackVarying(int program, int index, int bufSize, IntBuffer size, IntBuffer type) {
/* 1413 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 1414 */     long function_pointer = caps.GL30_glGetTransformFeedbackVarying_pointer;
/* 1415 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 1416 */     BufferChecks.checkBuffer(size, 1);
/* 1417 */     BufferChecks.checkBuffer(type, 1);
/* 1418 */     IntBuffer name_length = APIUtils.getLengths();
/* 1419 */     ByteBuffer name = APIUtils.getBufferByte(bufSize);
/* 1420 */     nglGetTransformFeedbackVarying(program, index, bufSize, name_length, 0, size, size.position(), type, type.position(), name, name.position(), function_pointer);
/* 1421 */     name.limit(name_length.get(0));
/* 1422 */     return APIUtils.getString(name);
/*      */   }
/*      */   
/*      */   public static void glBindVertexArray(int array) {
/* 1426 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 1427 */     long function_pointer = caps.GL30_glBindVertexArray_pointer;
/* 1428 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 1429 */     nglBindVertexArray(array, function_pointer);
/*      */   }
/*      */   private static native void nglBindVertexArray(int paramInt, long paramLong);
/*      */   
/*      */   public static void glDeleteVertexArrays(IntBuffer arrays) {
/* 1434 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 1435 */     long function_pointer = caps.GL30_glDeleteVertexArrays_pointer;
/* 1436 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 1437 */     BufferChecks.checkDirect(arrays);
/* 1438 */     nglDeleteVertexArrays(arrays.remaining(), arrays, arrays.position(), function_pointer);
/*      */   }
/*      */   
/*      */   private static native void nglDeleteVertexArrays(int paramInt1, IntBuffer paramIntBuffer, int paramInt2, long paramLong);
/*      */   
/*      */   public static void glDeleteVertexArrays(int array) {
/* 1444 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 1445 */     long function_pointer = caps.GL30_glDeleteVertexArrays_pointer;
/* 1446 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 1447 */     nglDeleteVertexArrays(1, APIUtils.getBufferInt().put(0, array), 0, function_pointer);
/*      */   }
/*      */   
/*      */   public static void glGenVertexArrays(IntBuffer arrays) {
/* 1451 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 1452 */     long function_pointer = caps.GL30_glGenVertexArrays_pointer;
/* 1453 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 1454 */     BufferChecks.checkDirect(arrays);
/* 1455 */     nglGenVertexArrays(arrays.remaining(), arrays, arrays.position(), function_pointer);
/*      */   }
/*      */   
/*      */   private static native void nglGenVertexArrays(int paramInt1, IntBuffer paramIntBuffer, int paramInt2, long paramLong);
/*      */   
/*      */   public static int glGenVertexArrays() {
/* 1461 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 1462 */     long function_pointer = caps.GL30_glGenVertexArrays_pointer;
/* 1463 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 1464 */     IntBuffer arrays = APIUtils.getBufferInt();
/* 1465 */     nglGenVertexArrays(1, arrays, arrays.position(), function_pointer);
/* 1466 */     return arrays.get(0);
/*      */   }
/*      */   
/*      */   public static boolean glIsVertexArray(int array) {
/* 1470 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 1471 */     long function_pointer = caps.GL30_glIsVertexArray_pointer;
/* 1472 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 1473 */     boolean __result = nglIsVertexArray(array, function_pointer);
/* 1474 */     return __result;
/*      */   }
/*      */   
/*      */   private static native boolean nglIsVertexArray(int paramInt, long paramLong);
/*      */ }


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\org\lwjgl\opengl\GL30.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */