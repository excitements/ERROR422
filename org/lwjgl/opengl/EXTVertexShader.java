/*     */ package org.lwjgl.opengl;
/*     */ 
/*     */ import java.nio.Buffer;
/*     */ import java.nio.ByteBuffer;
/*     */ import java.nio.DoubleBuffer;
/*     */ import java.nio.FloatBuffer;
/*     */ import java.nio.IntBuffer;
/*     */ import java.nio.ShortBuffer;
/*     */ import org.lwjgl.BufferChecks;
/*     */ 
/*     */ 
/*     */ public final class EXTVertexShader
/*     */ {
/*     */   public static final int GL_VERTEX_SHADER_EXT = 34688;
/*     */   public static final int GL_VERTEX_SHADER_BINDING_EXT = 34689;
/*     */   public static final int GL_OP_INDEX_EXT = 34690;
/*     */   public static final int GL_OP_NEGATE_EXT = 34691;
/*     */   public static final int GL_OP_DOT3_EXT = 34692;
/*     */   public static final int GL_OP_DOT4_EXT = 34693;
/*     */   public static final int GL_OP_MUL_EXT = 34694;
/*     */   public static final int GL_OP_ADD_EXT = 34695;
/*     */   public static final int GL_OP_MADD_EXT = 34696;
/*     */   public static final int GL_OP_FRAC_EXT = 34697;
/*     */   public static final int GL_OP_MAX_EXT = 34698;
/*     */   public static final int GL_OP_MIN_EXT = 34699;
/*     */   public static final int GL_OP_SET_GE_EXT = 34700;
/*     */   public static final int GL_OP_SET_LT_EXT = 34701;
/*     */   public static final int GL_OP_CLAMP_EXT = 34702;
/*     */   public static final int GL_OP_FLOOR_EXT = 34703;
/*     */   public static final int GL_OP_ROUND_EXT = 34704;
/*     */   public static final int GL_OP_EXP_BASE_2_EXT = 34705;
/*     */   public static final int GL_OP_LOG_BASE_2_EXT = 34706;
/*     */   public static final int GL_OP_POWER_EXT = 34707;
/*     */   public static final int GL_OP_RECIP_EXT = 34708;
/*     */   public static final int GL_OP_RECIP_SQRT_EXT = 34709;
/*     */   public static final int GL_OP_SUB_EXT = 34710;
/*     */   public static final int GL_OP_CROSS_PRODUCT_EXT = 34711;
/*     */   public static final int GL_OP_MULTIPLY_MATRIX_EXT = 34712;
/*     */   public static final int GL_OP_MOV_EXT = 34713;
/*     */   public static final int GL_OUTPUT_VERTEX_EXT = 34714;
/*     */   public static final int GL_OUTPUT_COLOR0_EXT = 34715;
/*     */   public static final int GL_OUTPUT_COLOR1_EXT = 34716;
/*     */   public static final int GL_OUTPUT_TEXTURE_COORD0_EXT = 34717;
/*     */   public static final int GL_OUTPUT_TEXTURE_COORD1_EXT = 34718;
/*     */   public static final int GL_OUTPUT_TEXTURE_COORD2_EXT = 34719;
/*     */   public static final int GL_OUTPUT_TEXTURE_COORD3_EXT = 34720;
/*     */   public static final int GL_OUTPUT_TEXTURE_COORD4_EXT = 34721;
/*     */   public static final int GL_OUTPUT_TEXTURE_COORD5_EXT = 34722;
/*     */   public static final int GL_OUTPUT_TEXTURE_COORD6_EXT = 34723;
/*     */   public static final int GL_OUTPUT_TEXTURE_COORD7_EXT = 34724;
/*     */   public static final int GL_OUTPUT_TEXTURE_COORD8_EXT = 34725;
/*     */   public static final int GL_OUTPUT_TEXTURE_COORD9_EXT = 34726;
/*     */   public static final int GL_OUTPUT_TEXTURE_COORD10_EXT = 34727;
/*     */   public static final int GL_OUTPUT_TEXTURE_COORD11_EXT = 34728;
/*     */   public static final int GL_OUTPUT_TEXTURE_COORD12_EXT = 34729;
/*     */   public static final int GL_OUTPUT_TEXTURE_COORD13_EXT = 34730;
/*     */   public static final int GL_OUTPUT_TEXTURE_COORD14_EXT = 34731;
/*     */   public static final int GL_OUTPUT_TEXTURE_COORD15_EXT = 34732;
/*     */   public static final int GL_OUTPUT_TEXTURE_COORD16_EXT = 34733;
/*     */   public static final int GL_OUTPUT_TEXTURE_COORD17_EXT = 34734;
/*     */   public static final int GL_OUTPUT_TEXTURE_COORD18_EXT = 34735;
/*     */   public static final int GL_OUTPUT_TEXTURE_COORD19_EXT = 34736;
/*     */   public static final int GL_OUTPUT_TEXTURE_COORD20_EXT = 34737;
/*     */   public static final int GL_OUTPUT_TEXTURE_COORD21_EXT = 34738;
/*     */   public static final int GL_OUTPUT_TEXTURE_COORD22_EXT = 34739;
/*     */   public static final int GL_OUTPUT_TEXTURE_COORD23_EXT = 34740;
/*     */   public static final int GL_OUTPUT_TEXTURE_COORD24_EXT = 34741;
/*     */   public static final int GL_OUTPUT_TEXTURE_COORD25_EXT = 34742;
/*     */   public static final int GL_OUTPUT_TEXTURE_COORD26_EXT = 34743;
/*     */   public static final int GL_OUTPUT_TEXTURE_COORD27_EXT = 34744;
/*     */   public static final int GL_OUTPUT_TEXTURE_COORD28_EXT = 34745;
/*     */   public static final int GL_OUTPUT_TEXTURE_COORD29_EXT = 34746;
/*     */   public static final int GL_OUTPUT_TEXTURE_COORD30_EXT = 34747;
/*     */   public static final int GL_OUTPUT_TEXTURE_COORD31_EXT = 34748;
/*     */   public static final int GL_OUTPUT_FOG_EXT = 34749;
/*     */   public static final int GL_SCALAR_EXT = 34750;
/*     */   public static final int GL_VECTOR_EXT = 34751;
/*     */   public static final int GL_MATRIX_EXT = 34752;
/*     */   public static final int GL_VARIANT_EXT = 34753;
/*     */   public static final int GL_INVARIANT_EXT = 34754;
/*     */   public static final int GL_LOCAL_CONSTANT_EXT = 34755;
/*     */   public static final int GL_LOCAL_EXT = 34756;
/*     */   public static final int GL_MAX_VERTEX_SHADER_INSTRUCTIONS_EXT = 34757;
/*     */   public static final int GL_MAX_VERTEX_SHADER_VARIANTS_EXT = 34758;
/*     */   public static final int GL_MAX_VERTEX_SHADER_INVARIANTS_EXT = 34759;
/*     */   public static final int GL_MAX_VERTEX_SHADER_LOCAL_CONSTANTS_EXT = 34760;
/*     */   public static final int GL_MAX_VERTEX_SHADER_LOCALS_EXT = 34761;
/*     */   public static final int GL_MAX_OPTIMIZED_VERTEX_SHADER_INSTRUCTIONS_EXT = 34762;
/*     */   public static final int GL_MAX_OPTIMIZED_VERTEX_SHADER_VARIANTS_EXT = 34763;
/*     */   public static final int GL_MAX_OPTIMIZED_VERTEX_SHADER_INVARIANTS_EXT = 34764;
/*     */   public static final int GL_MAX_OPTIMIZED_VERTEX_SHADER_LOCAL_CONSTANTS_EXT = 34765;
/*     */   public static final int GL_MAX_OPTIMIZED_VERTEX_SHADER_LOCALS_EXT = 34766;
/*     */   public static final int GL_VERTEX_SHADER_INSTRUCTIONS_EXT = 34767;
/*     */   public static final int GL_VERTEX_SHADER_VARIANTS_EXT = 34768;
/*     */   public static final int GL_VERTEX_SHADER_INVARIANTS_EXT = 34769;
/*     */   public static final int GL_VERTEX_SHADER_LOCAL_CONSTANTS_EXT = 34770;
/*     */   public static final int GL_VERTEX_SHADER_LOCALS_EXT = 34771;
/*     */   public static final int GL_VERTEX_SHADER_OPTIMIZED_EXT = 34772;
/*     */   public static final int GL_X_EXT = 34773;
/*     */   public static final int GL_Y_EXT = 34774;
/*     */   public static final int GL_Z_EXT = 34775;
/*     */   public static final int GL_W_EXT = 34776;
/*     */   public static final int GL_NEGATIVE_X_EXT = 34777;
/*     */   public static final int GL_NEGATIVE_Y_EXT = 34778;
/*     */   public static final int GL_NEGATIVE_Z_EXT = 34779;
/*     */   public static final int GL_NEGATIVE_W_EXT = 34780;
/*     */   public static final int GL_ZERO_EXT = 34781;
/*     */   public static final int GL_ONE_EXT = 34782;
/*     */   public static final int GL_NEGATIVE_ONE_EXT = 34783;
/*     */   public static final int GL_NORMALIZED_RANGE_EXT = 34784;
/*     */   public static final int GL_FULL_RANGE_EXT = 34785;
/*     */   public static final int GL_CURRENT_VERTEX_EXT = 34786;
/*     */   public static final int GL_MVP_MATRIX_EXT = 34787;
/*     */   public static final int GL_VARIANT_VALUE_EXT = 34788;
/*     */   public static final int GL_VARIANT_DATATYPE_EXT = 34789;
/*     */   public static final int GL_VARIANT_ARRAY_STRIDE_EXT = 34790;
/*     */   public static final int GL_VARIANT_ARRAY_TYPE_EXT = 34791;
/*     */   public static final int GL_VARIANT_ARRAY_EXT = 34792;
/*     */   public static final int GL_VARIANT_ARRAY_POINTER_EXT = 34793;
/*     */   public static final int GL_INVARIANT_VALUE_EXT = 34794;
/*     */   public static final int GL_INVARIANT_DATATYPE_EXT = 34795;
/*     */   public static final int GL_LOCAL_CONSTANT_VALUE_EXT = 34796;
/*     */   public static final int GL_LOCAL_CONSTANT_DATATYPE_EXT = 34797;
/*     */   
/*     */   public static void glBeginVertexShaderEXT() {
/* 126 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 127 */     long function_pointer = caps.EXT_vertex_shader_glBeginVertexShaderEXT_pointer;
/* 128 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 129 */     nglBeginVertexShaderEXT(function_pointer);
/*     */   }
/*     */   private static native void nglBeginVertexShaderEXT(long paramLong);
/*     */   
/*     */   public static void glEndVertexShaderEXT() {
/* 134 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 135 */     long function_pointer = caps.EXT_vertex_shader_glEndVertexShaderEXT_pointer;
/* 136 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 137 */     nglEndVertexShaderEXT(function_pointer);
/*     */   }
/*     */   private static native void nglEndVertexShaderEXT(long paramLong);
/*     */   
/*     */   public static void glBindVertexShaderEXT(int id) {
/* 142 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 143 */     long function_pointer = caps.EXT_vertex_shader_glBindVertexShaderEXT_pointer;
/* 144 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 145 */     nglBindVertexShaderEXT(id, function_pointer);
/*     */   }
/*     */   private static native void nglBindVertexShaderEXT(int paramInt, long paramLong);
/*     */   
/*     */   public static int glGenVertexShadersEXT(int range) {
/* 150 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 151 */     long function_pointer = caps.EXT_vertex_shader_glGenVertexShadersEXT_pointer;
/* 152 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 153 */     int __result = nglGenVertexShadersEXT(range, function_pointer);
/* 154 */     return __result;
/*     */   }
/*     */   private static native int nglGenVertexShadersEXT(int paramInt, long paramLong);
/*     */   
/*     */   public static void glDeleteVertexShaderEXT(int id) {
/* 159 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 160 */     long function_pointer = caps.EXT_vertex_shader_glDeleteVertexShaderEXT_pointer;
/* 161 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 162 */     nglDeleteVertexShaderEXT(id, function_pointer);
/*     */   }
/*     */   private static native void nglDeleteVertexShaderEXT(int paramInt, long paramLong);
/*     */   
/*     */   public static void glShaderOp1EXT(int op, int res, int arg1) {
/* 167 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 168 */     long function_pointer = caps.EXT_vertex_shader_glShaderOp1EXT_pointer;
/* 169 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 170 */     nglShaderOp1EXT(op, res, arg1, function_pointer);
/*     */   }
/*     */   private static native void nglShaderOp1EXT(int paramInt1, int paramInt2, int paramInt3, long paramLong);
/*     */   
/*     */   public static void glShaderOp2EXT(int op, int res, int arg1, int arg2) {
/* 175 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 176 */     long function_pointer = caps.EXT_vertex_shader_glShaderOp2EXT_pointer;
/* 177 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 178 */     nglShaderOp2EXT(op, res, arg1, arg2, function_pointer);
/*     */   }
/*     */   private static native void nglShaderOp2EXT(int paramInt1, int paramInt2, int paramInt3, int paramInt4, long paramLong);
/*     */   
/*     */   public static void glShaderOp3EXT(int op, int res, int arg1, int arg2, int arg3) {
/* 183 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 184 */     long function_pointer = caps.EXT_vertex_shader_glShaderOp3EXT_pointer;
/* 185 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 186 */     nglShaderOp3EXT(op, res, arg1, arg2, arg3, function_pointer);
/*     */   }
/*     */   private static native void nglShaderOp3EXT(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, long paramLong);
/*     */   
/*     */   public static void glSwizzleEXT(int res, int in, int outX, int outY, int outZ, int outW) {
/* 191 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 192 */     long function_pointer = caps.EXT_vertex_shader_glSwizzleEXT_pointer;
/* 193 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 194 */     nglSwizzleEXT(res, in, outX, outY, outZ, outW, function_pointer);
/*     */   }
/*     */   private static native void nglSwizzleEXT(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, long paramLong);
/*     */   
/*     */   public static void glWriteMaskEXT(int res, int in, int outX, int outY, int outZ, int outW) {
/* 199 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 200 */     long function_pointer = caps.EXT_vertex_shader_glWriteMaskEXT_pointer;
/* 201 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 202 */     nglWriteMaskEXT(res, in, outX, outY, outZ, outW, function_pointer);
/*     */   }
/*     */   private static native void nglWriteMaskEXT(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, long paramLong);
/*     */   
/*     */   public static void glInsertComponentEXT(int res, int src, int num) {
/* 207 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 208 */     long function_pointer = caps.EXT_vertex_shader_glInsertComponentEXT_pointer;
/* 209 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 210 */     nglInsertComponentEXT(res, src, num, function_pointer);
/*     */   }
/*     */   private static native void nglInsertComponentEXT(int paramInt1, int paramInt2, int paramInt3, long paramLong);
/*     */   
/*     */   public static void glExtractComponentEXT(int res, int src, int num) {
/* 215 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 216 */     long function_pointer = caps.EXT_vertex_shader_glExtractComponentEXT_pointer;
/* 217 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 218 */     nglExtractComponentEXT(res, src, num, function_pointer);
/*     */   }
/*     */   private static native void nglExtractComponentEXT(int paramInt1, int paramInt2, int paramInt3, long paramLong);
/*     */   
/*     */   public static int glGenSymbolsEXT(int dataType, int storageType, int range, int components) {
/* 223 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 224 */     long function_pointer = caps.EXT_vertex_shader_glGenSymbolsEXT_pointer;
/* 225 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 226 */     int __result = nglGenSymbolsEXT(dataType, storageType, range, components, function_pointer);
/* 227 */     return __result;
/*     */   }
/*     */   private static native int nglGenSymbolsEXT(int paramInt1, int paramInt2, int paramInt3, int paramInt4, long paramLong);
/*     */   
/*     */   public static void glSetInvariantEXT(int id, DoubleBuffer pAddr) {
/* 232 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 233 */     long function_pointer = caps.EXT_vertex_shader_glSetInvariantEXT_pointer;
/* 234 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 235 */     BufferChecks.checkBuffer(pAddr, 4);
/* 236 */     nglSetInvariantEXT(id, 5130, pAddr, pAddr.position() << 3, function_pointer);
/*     */   }
/*     */   public static void glSetInvariantEXT(int id, FloatBuffer pAddr) {
/* 239 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 240 */     long function_pointer = caps.EXT_vertex_shader_glSetInvariantEXT_pointer;
/* 241 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 242 */     BufferChecks.checkBuffer(pAddr, 4);
/* 243 */     nglSetInvariantEXT(id, 5126, pAddr, pAddr.position() << 2, function_pointer);
/*     */   }
/*     */   public static void glSetInvariantEXT(int id, boolean unsigned, ByteBuffer pAddr) {
/* 246 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 247 */     long function_pointer = caps.EXT_vertex_shader_glSetInvariantEXT_pointer;
/* 248 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 249 */     BufferChecks.checkBuffer(pAddr, 4);
/* 250 */     nglSetInvariantEXT(id, unsigned ? 5121 : 5120, pAddr, pAddr.position(), function_pointer);
/*     */   }
/*     */   public static void glSetInvariantEXT(int id, boolean unsigned, IntBuffer pAddr) {
/* 253 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 254 */     long function_pointer = caps.EXT_vertex_shader_glSetInvariantEXT_pointer;
/* 255 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 256 */     BufferChecks.checkBuffer(pAddr, 4);
/* 257 */     nglSetInvariantEXT(id, unsigned ? 5125 : 5124, pAddr, pAddr.position() << 2, function_pointer);
/*     */   }
/*     */   public static void glSetInvariantEXT(int id, boolean unsigned, ShortBuffer pAddr) {
/* 260 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 261 */     long function_pointer = caps.EXT_vertex_shader_glSetInvariantEXT_pointer;
/* 262 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 263 */     BufferChecks.checkBuffer(pAddr, 4);
/* 264 */     nglSetInvariantEXT(id, unsigned ? 5123 : 5122, pAddr, pAddr.position() << 1, function_pointer);
/*     */   }
/*     */   private static native void nglSetInvariantEXT(int paramInt1, int paramInt2, Buffer paramBuffer, int paramInt3, long paramLong);
/*     */   
/*     */   public static void glSetLocalConstantEXT(int id, DoubleBuffer pAddr) {
/* 269 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 270 */     long function_pointer = caps.EXT_vertex_shader_glSetLocalConstantEXT_pointer;
/* 271 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 272 */     BufferChecks.checkBuffer(pAddr, 4);
/* 273 */     nglSetLocalConstantEXT(id, 5130, pAddr, pAddr.position() << 3, function_pointer);
/*     */   }
/*     */   public static void glSetLocalConstantEXT(int id, FloatBuffer pAddr) {
/* 276 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 277 */     long function_pointer = caps.EXT_vertex_shader_glSetLocalConstantEXT_pointer;
/* 278 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 279 */     BufferChecks.checkBuffer(pAddr, 4);
/* 280 */     nglSetLocalConstantEXT(id, 5126, pAddr, pAddr.position() << 2, function_pointer);
/*     */   }
/*     */   public static void glSetLocalConstantEXT(int id, boolean unsigned, ByteBuffer pAddr) {
/* 283 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 284 */     long function_pointer = caps.EXT_vertex_shader_glSetLocalConstantEXT_pointer;
/* 285 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 286 */     BufferChecks.checkBuffer(pAddr, 4);
/* 287 */     nglSetLocalConstantEXT(id, unsigned ? 5121 : 5120, pAddr, pAddr.position(), function_pointer);
/*     */   }
/*     */   public static void glSetLocalConstantEXT(int id, boolean unsigned, IntBuffer pAddr) {
/* 290 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 291 */     long function_pointer = caps.EXT_vertex_shader_glSetLocalConstantEXT_pointer;
/* 292 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 293 */     BufferChecks.checkBuffer(pAddr, 4);
/* 294 */     nglSetLocalConstantEXT(id, unsigned ? 5125 : 5124, pAddr, pAddr.position() << 2, function_pointer);
/*     */   }
/*     */   public static void glSetLocalConstantEXT(int id, boolean unsigned, ShortBuffer pAddr) {
/* 297 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 298 */     long function_pointer = caps.EXT_vertex_shader_glSetLocalConstantEXT_pointer;
/* 299 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 300 */     BufferChecks.checkBuffer(pAddr, 4);
/* 301 */     nglSetLocalConstantEXT(id, unsigned ? 5123 : 5122, pAddr, pAddr.position() << 1, function_pointer);
/*     */   }
/*     */   private static native void nglSetLocalConstantEXT(int paramInt1, int paramInt2, Buffer paramBuffer, int paramInt3, long paramLong);
/*     */   
/*     */   public static void glVariantEXT(int id, ByteBuffer pAddr) {
/* 306 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 307 */     long function_pointer = caps.EXT_vertex_shader_glVariantbvEXT_pointer;
/* 308 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 309 */     BufferChecks.checkBuffer(pAddr, 4);
/* 310 */     nglVariantbvEXT(id, pAddr, pAddr.position(), function_pointer);
/*     */   }
/*     */   private static native void nglVariantbvEXT(int paramInt1, ByteBuffer paramByteBuffer, int paramInt2, long paramLong);
/*     */   
/*     */   public static void glVariantEXT(int id, ShortBuffer pAddr) {
/* 315 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 316 */     long function_pointer = caps.EXT_vertex_shader_glVariantsvEXT_pointer;
/* 317 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 318 */     BufferChecks.checkBuffer(pAddr, 4);
/* 319 */     nglVariantsvEXT(id, pAddr, pAddr.position(), function_pointer);
/*     */   }
/*     */   private static native void nglVariantsvEXT(int paramInt1, ShortBuffer paramShortBuffer, int paramInt2, long paramLong);
/*     */   
/*     */   public static void glVariantEXT(int id, IntBuffer pAddr) {
/* 324 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 325 */     long function_pointer = caps.EXT_vertex_shader_glVariantivEXT_pointer;
/* 326 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 327 */     BufferChecks.checkBuffer(pAddr, 4);
/* 328 */     nglVariantivEXT(id, pAddr, pAddr.position(), function_pointer);
/*     */   }
/*     */   private static native void nglVariantivEXT(int paramInt1, IntBuffer paramIntBuffer, int paramInt2, long paramLong);
/*     */   
/*     */   public static void glVariantEXT(int id, FloatBuffer pAddr) {
/* 333 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 334 */     long function_pointer = caps.EXT_vertex_shader_glVariantfvEXT_pointer;
/* 335 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 336 */     BufferChecks.checkBuffer(pAddr, 4);
/* 337 */     nglVariantfvEXT(id, pAddr, pAddr.position(), function_pointer);
/*     */   }
/*     */   private static native void nglVariantfvEXT(int paramInt1, FloatBuffer paramFloatBuffer, int paramInt2, long paramLong);
/*     */   
/*     */   public static void glVariantEXT(int id, DoubleBuffer pAddr) {
/* 342 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 343 */     long function_pointer = caps.EXT_vertex_shader_glVariantdvEXT_pointer;
/* 344 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 345 */     BufferChecks.checkBuffer(pAddr, 4);
/* 346 */     nglVariantdvEXT(id, pAddr, pAddr.position(), function_pointer);
/*     */   }
/*     */   private static native void nglVariantdvEXT(int paramInt1, DoubleBuffer paramDoubleBuffer, int paramInt2, long paramLong);
/*     */   
/*     */   public static void glVariantuEXT(int id, ByteBuffer pAddr) {
/* 351 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 352 */     long function_pointer = caps.EXT_vertex_shader_glVariantubvEXT_pointer;
/* 353 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 354 */     BufferChecks.checkBuffer(pAddr, 4);
/* 355 */     nglVariantubvEXT(id, pAddr, pAddr.position(), function_pointer);
/*     */   }
/*     */   private static native void nglVariantubvEXT(int paramInt1, ByteBuffer paramByteBuffer, int paramInt2, long paramLong);
/*     */   
/*     */   public static void glVariantuEXT(int id, ShortBuffer pAddr) {
/* 360 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 361 */     long function_pointer = caps.EXT_vertex_shader_glVariantusvEXT_pointer;
/* 362 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 363 */     BufferChecks.checkBuffer(pAddr, 4);
/* 364 */     nglVariantusvEXT(id, pAddr, pAddr.position(), function_pointer);
/*     */   }
/*     */   private static native void nglVariantusvEXT(int paramInt1, ShortBuffer paramShortBuffer, int paramInt2, long paramLong);
/*     */   
/*     */   public static void glVariantuEXT(int id, IntBuffer pAddr) {
/* 369 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 370 */     long function_pointer = caps.EXT_vertex_shader_glVariantuivEXT_pointer;
/* 371 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 372 */     BufferChecks.checkBuffer(pAddr, 4);
/* 373 */     nglVariantuivEXT(id, pAddr, pAddr.position(), function_pointer);
/*     */   }
/*     */   private static native void nglVariantuivEXT(int paramInt1, IntBuffer paramIntBuffer, int paramInt2, long paramLong);
/*     */   
/*     */   public static void glVariantPointerEXT(int id, int stride, DoubleBuffer pAddr) {
/* 378 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 379 */     long function_pointer = caps.EXT_vertex_shader_glVariantPointerEXT_pointer;
/* 380 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 381 */     GLChecks.ensureArrayVBOdisabled(caps);
/* 382 */     BufferChecks.checkDirect(pAddr);
/* 383 */     (GLChecks.getReferences(caps)).EXT_vertex_shader_glVariantPointerEXT_pAddr = pAddr;
/* 384 */     nglVariantPointerEXT(id, 5130, stride, pAddr, pAddr.position() << 3, function_pointer);
/*     */   }
/*     */   public static void glVariantPointerEXT(int id, int stride, FloatBuffer pAddr) {
/* 387 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 388 */     long function_pointer = caps.EXT_vertex_shader_glVariantPointerEXT_pointer;
/* 389 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 390 */     GLChecks.ensureArrayVBOdisabled(caps);
/* 391 */     BufferChecks.checkDirect(pAddr);
/* 392 */     (GLChecks.getReferences(caps)).EXT_vertex_shader_glVariantPointerEXT_pAddr = pAddr;
/* 393 */     nglVariantPointerEXT(id, 5126, stride, pAddr, pAddr.position() << 2, function_pointer);
/*     */   }
/*     */   public static void glVariantPointerEXT(int id, boolean unsigned, int stride, ByteBuffer pAddr) {
/* 396 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 397 */     long function_pointer = caps.EXT_vertex_shader_glVariantPointerEXT_pointer;
/* 398 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 399 */     GLChecks.ensureArrayVBOdisabled(caps);
/* 400 */     BufferChecks.checkDirect(pAddr);
/* 401 */     (GLChecks.getReferences(caps)).EXT_vertex_shader_glVariantPointerEXT_pAddr = pAddr;
/* 402 */     nglVariantPointerEXT(id, unsigned ? 5121 : 5120, stride, pAddr, pAddr.position(), function_pointer);
/*     */   }
/*     */   public static void glVariantPointerEXT(int id, boolean unsigned, int stride, IntBuffer pAddr) {
/* 405 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 406 */     long function_pointer = caps.EXT_vertex_shader_glVariantPointerEXT_pointer;
/* 407 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 408 */     GLChecks.ensureArrayVBOdisabled(caps);
/* 409 */     BufferChecks.checkDirect(pAddr);
/* 410 */     (GLChecks.getReferences(caps)).EXT_vertex_shader_glVariantPointerEXT_pAddr = pAddr;
/* 411 */     nglVariantPointerEXT(id, unsigned ? 5125 : 5124, stride, pAddr, pAddr.position() << 2, function_pointer);
/*     */   }
/*     */   public static void glVariantPointerEXT(int id, boolean unsigned, int stride, ShortBuffer pAddr) {
/* 414 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 415 */     long function_pointer = caps.EXT_vertex_shader_glVariantPointerEXT_pointer;
/* 416 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 417 */     GLChecks.ensureArrayVBOdisabled(caps);
/* 418 */     BufferChecks.checkDirect(pAddr);
/* 419 */     (GLChecks.getReferences(caps)).EXT_vertex_shader_glVariantPointerEXT_pAddr = pAddr;
/* 420 */     nglVariantPointerEXT(id, unsigned ? 5123 : 5122, stride, pAddr, pAddr.position() << 1, function_pointer);
/*     */   }
/*     */   
/*     */   public static void glVariantPointerEXT(int id, int type, int stride, long pAddr_buffer_offset) {
/* 424 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 425 */     long function_pointer = caps.EXT_vertex_shader_glVariantPointerEXT_pointer;
/* 426 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 427 */     GLChecks.ensureArrayVBOenabled(caps);
/* 428 */     nglVariantPointerEXTBO(id, type, stride, pAddr_buffer_offset, function_pointer);
/*     */   }
/*     */   private static native void nglVariantPointerEXT(int paramInt1, int paramInt2, int paramInt3, Buffer paramBuffer, int paramInt4, long paramLong);
/*     */   private static native void nglVariantPointerEXTBO(int paramInt1, int paramInt2, int paramInt3, long paramLong1, long paramLong2);
/*     */   public static void glEnableVariantClientStateEXT(int id) {
/* 433 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 434 */     long function_pointer = caps.EXT_vertex_shader_glEnableVariantClientStateEXT_pointer;
/* 435 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 436 */     nglEnableVariantClientStateEXT(id, function_pointer);
/*     */   }
/*     */   private static native void nglEnableVariantClientStateEXT(int paramInt, long paramLong);
/*     */   
/*     */   public static void glDisableVariantClientStateEXT(int id) {
/* 441 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 442 */     long function_pointer = caps.EXT_vertex_shader_glDisableVariantClientStateEXT_pointer;
/* 443 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 444 */     nglDisableVariantClientStateEXT(id, function_pointer);
/*     */   }
/*     */   private static native void nglDisableVariantClientStateEXT(int paramInt, long paramLong);
/*     */   
/*     */   public static int glBindLightParameterEXT(int light, int value) {
/* 449 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 450 */     long function_pointer = caps.EXT_vertex_shader_glBindLightParameterEXT_pointer;
/* 451 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 452 */     int __result = nglBindLightParameterEXT(light, value, function_pointer);
/* 453 */     return __result;
/*     */   }
/*     */   private static native int nglBindLightParameterEXT(int paramInt1, int paramInt2, long paramLong);
/*     */   
/*     */   public static int glBindMaterialParameterEXT(int face, int value) {
/* 458 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 459 */     long function_pointer = caps.EXT_vertex_shader_glBindMaterialParameterEXT_pointer;
/* 460 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 461 */     int __result = nglBindMaterialParameterEXT(face, value, function_pointer);
/* 462 */     return __result;
/*     */   }
/*     */   private static native int nglBindMaterialParameterEXT(int paramInt1, int paramInt2, long paramLong);
/*     */   
/*     */   public static int glBindTexGenParameterEXT(int unit, int coord, int value) {
/* 467 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 468 */     long function_pointer = caps.EXT_vertex_shader_glBindTexGenParameterEXT_pointer;
/* 469 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 470 */     int __result = nglBindTexGenParameterEXT(unit, coord, value, function_pointer);
/* 471 */     return __result;
/*     */   }
/*     */   private static native int nglBindTexGenParameterEXT(int paramInt1, int paramInt2, int paramInt3, long paramLong);
/*     */   
/*     */   public static int glBindTextureUnitParameterEXT(int unit, int value) {
/* 476 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 477 */     long function_pointer = caps.EXT_vertex_shader_glBindTextureUnitParameterEXT_pointer;
/* 478 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 479 */     int __result = nglBindTextureUnitParameterEXT(unit, value, function_pointer);
/* 480 */     return __result;
/*     */   }
/*     */   private static native int nglBindTextureUnitParameterEXT(int paramInt1, int paramInt2, long paramLong);
/*     */   
/*     */   public static int glBindParameterEXT(int value) {
/* 485 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 486 */     long function_pointer = caps.EXT_vertex_shader_glBindParameterEXT_pointer;
/* 487 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 488 */     int __result = nglBindParameterEXT(value, function_pointer);
/* 489 */     return __result;
/*     */   }
/*     */   private static native int nglBindParameterEXT(int paramInt, long paramLong);
/*     */   
/*     */   public static boolean glIsVariantEnabledEXT(int id, int cap) {
/* 494 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 495 */     long function_pointer = caps.EXT_vertex_shader_glIsVariantEnabledEXT_pointer;
/* 496 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 497 */     boolean __result = nglIsVariantEnabledEXT(id, cap, function_pointer);
/* 498 */     return __result;
/*     */   }
/*     */   private static native boolean nglIsVariantEnabledEXT(int paramInt1, int paramInt2, long paramLong);
/*     */   
/*     */   public static void glGetVariantBooleanEXT(int id, int value, ByteBuffer pbData) {
/* 503 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 504 */     long function_pointer = caps.EXT_vertex_shader_glGetVariantBooleanvEXT_pointer;
/* 505 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 506 */     BufferChecks.checkBuffer(pbData, 4);
/* 507 */     nglGetVariantBooleanvEXT(id, value, pbData, pbData.position(), function_pointer);
/*     */   }
/*     */   private static native void nglGetVariantBooleanvEXT(int paramInt1, int paramInt2, ByteBuffer paramByteBuffer, int paramInt3, long paramLong);
/*     */   
/*     */   public static void glGetVariantIntegerEXT(int id, int value, IntBuffer pbData) {
/* 512 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 513 */     long function_pointer = caps.EXT_vertex_shader_glGetVariantIntegervEXT_pointer;
/* 514 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 515 */     BufferChecks.checkBuffer(pbData, 4);
/* 516 */     nglGetVariantIntegervEXT(id, value, pbData, pbData.position(), function_pointer);
/*     */   }
/*     */   private static native void nglGetVariantIntegervEXT(int paramInt1, int paramInt2, IntBuffer paramIntBuffer, int paramInt3, long paramLong);
/*     */   
/*     */   public static void glGetVariantFloatEXT(int id, int value, FloatBuffer pbData) {
/* 521 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 522 */     long function_pointer = caps.EXT_vertex_shader_glGetVariantFloatvEXT_pointer;
/* 523 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 524 */     BufferChecks.checkBuffer(pbData, 4);
/* 525 */     nglGetVariantFloatvEXT(id, value, pbData, pbData.position(), function_pointer);
/*     */   }
/*     */   private static native void nglGetVariantFloatvEXT(int paramInt1, int paramInt2, FloatBuffer paramFloatBuffer, int paramInt3, long paramLong);
/*     */   
/*     */   public static ByteBuffer glGetVariantPointerEXT(int id, int value, long result_size) {
/* 530 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 531 */     long function_pointer = caps.EXT_vertex_shader_glGetVariantPointervEXT_pointer;
/* 532 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 533 */     ByteBuffer __result = nglGetVariantPointervEXT(id, value, result_size, function_pointer);
/* 534 */     return __result;
/*     */   }
/*     */   private static native ByteBuffer nglGetVariantPointervEXT(int paramInt1, int paramInt2, long paramLong1, long paramLong2);
/*     */   
/*     */   public static void glGetInvariantBooleanEXT(int id, int value, ByteBuffer pbData) {
/* 539 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 540 */     long function_pointer = caps.EXT_vertex_shader_glGetInvariantBooleanvEXT_pointer;
/* 541 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 542 */     BufferChecks.checkBuffer(pbData, 4);
/* 543 */     nglGetInvariantBooleanvEXT(id, value, pbData, pbData.position(), function_pointer);
/*     */   }
/*     */   private static native void nglGetInvariantBooleanvEXT(int paramInt1, int paramInt2, ByteBuffer paramByteBuffer, int paramInt3, long paramLong);
/*     */   
/*     */   public static void glGetInvariantIntegerEXT(int id, int value, IntBuffer pbData) {
/* 548 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 549 */     long function_pointer = caps.EXT_vertex_shader_glGetInvariantIntegervEXT_pointer;
/* 550 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 551 */     BufferChecks.checkBuffer(pbData, 4);
/* 552 */     nglGetInvariantIntegervEXT(id, value, pbData, pbData.position(), function_pointer);
/*     */   }
/*     */   private static native void nglGetInvariantIntegervEXT(int paramInt1, int paramInt2, IntBuffer paramIntBuffer, int paramInt3, long paramLong);
/*     */   
/*     */   public static void glGetInvariantFloatEXT(int id, int value, FloatBuffer pbData) {
/* 557 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 558 */     long function_pointer = caps.EXT_vertex_shader_glGetInvariantFloatvEXT_pointer;
/* 559 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 560 */     BufferChecks.checkBuffer(pbData, 4);
/* 561 */     nglGetInvariantFloatvEXT(id, value, pbData, pbData.position(), function_pointer);
/*     */   }
/*     */   private static native void nglGetInvariantFloatvEXT(int paramInt1, int paramInt2, FloatBuffer paramFloatBuffer, int paramInt3, long paramLong);
/*     */   
/*     */   public static void glGetLocalConstantBooleanEXT(int id, int value, ByteBuffer pbData) {
/* 566 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 567 */     long function_pointer = caps.EXT_vertex_shader_glGetLocalConstantBooleanvEXT_pointer;
/* 568 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 569 */     BufferChecks.checkBuffer(pbData, 4);
/* 570 */     nglGetLocalConstantBooleanvEXT(id, value, pbData, pbData.position(), function_pointer);
/*     */   }
/*     */   private static native void nglGetLocalConstantBooleanvEXT(int paramInt1, int paramInt2, ByteBuffer paramByteBuffer, int paramInt3, long paramLong);
/*     */   
/*     */   public static void glGetLocalConstantIntegerEXT(int id, int value, IntBuffer pbData) {
/* 575 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 576 */     long function_pointer = caps.EXT_vertex_shader_glGetLocalConstantIntegervEXT_pointer;
/* 577 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 578 */     BufferChecks.checkBuffer(pbData, 4);
/* 579 */     nglGetLocalConstantIntegervEXT(id, value, pbData, pbData.position(), function_pointer);
/*     */   }
/*     */   private static native void nglGetLocalConstantIntegervEXT(int paramInt1, int paramInt2, IntBuffer paramIntBuffer, int paramInt3, long paramLong);
/*     */   
/*     */   public static void glGetLocalConstantFloatEXT(int id, int value, FloatBuffer pbData) {
/* 584 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 585 */     long function_pointer = caps.EXT_vertex_shader_glGetLocalConstantFloatvEXT_pointer;
/* 586 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 587 */     BufferChecks.checkBuffer(pbData, 4);
/* 588 */     nglGetLocalConstantFloatvEXT(id, value, pbData, pbData.position(), function_pointer);
/*     */   }
/*     */   
/*     */   private static native void nglGetLocalConstantFloatvEXT(int paramInt1, int paramInt2, FloatBuffer paramFloatBuffer, int paramInt3, long paramLong);
/*     */ }


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\org\lwjgl\opengl\EXTVertexShader.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */