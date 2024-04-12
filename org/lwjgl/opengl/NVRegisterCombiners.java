/*     */ package org.lwjgl.opengl;
/*     */ 
/*     */ import java.nio.FloatBuffer;
/*     */ import java.nio.IntBuffer;
/*     */ import org.lwjgl.BufferChecks;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public final class NVRegisterCombiners
/*     */ {
/*     */   public static final int GL_REGISTER_COMBINERS_NV = 34082;
/*     */   public static final int GL_COMBINER0_NV = 34128;
/*     */   public static final int GL_COMBINER1_NV = 34129;
/*     */   public static final int GL_COMBINER2_NV = 34130;
/*     */   public static final int GL_COMBINER3_NV = 34131;
/*     */   public static final int GL_COMBINER4_NV = 34132;
/*     */   public static final int GL_COMBINER5_NV = 34133;
/*     */   public static final int GL_COMBINER6_NV = 34134;
/*     */   public static final int GL_COMBINER7_NV = 34135;
/*     */   public static final int GL_VARIABLE_A_NV = 34083;
/*     */   public static final int GL_VARIABLE_B_NV = 34084;
/*     */   public static final int GL_VARIABLE_C_NV = 34085;
/*     */   public static final int GL_VARIABLE_D_NV = 34086;
/*     */   public static final int GL_VARIABLE_E_NV = 34087;
/*     */   public static final int GL_VARIABLE_F_NV = 34088;
/*     */   public static final int GL_VARIABLE_G_NV = 34089;
/*     */   public static final int GL_CONSTANT_COLOR0_NV = 34090;
/*     */   public static final int GL_CONSTANT_COLOR1_NV = 34091;
/*     */   public static final int GL_PRIMARY_COLOR_NV = 34092;
/*     */   public static final int GL_SECONDARY_COLOR_NV = 34093;
/*     */   public static final int GL_SPARE0_NV = 34094;
/*     */   public static final int GL_SPARE1_NV = 34095;
/*     */   public static final int GL_UNSIGNED_IDENTITY_NV = 34102;
/*     */   public static final int GL_UNSIGNED_INVERT_NV = 34103;
/*     */   public static final int GL_EXPAND_NORMAL_NV = 34104;
/*     */   public static final int GL_EXPAND_NEGATE_NV = 34105;
/*     */   public static final int GL_HALF_BIAS_NORMAL_NV = 34106;
/*     */   public static final int GL_HALF_BIAS_NEGATE_NV = 34107;
/*     */   public static final int GL_SIGNED_IDENTITY_NV = 34108;
/*     */   public static final int GL_SIGNED_NEGATE_NV = 34109;
/*     */   public static final int GL_E_TIMES_F_NV = 34097;
/*     */   public static final int GL_SPARE0_PLUS_SECONDARY_COLOR_NV = 34098;
/*     */   public static final int GL_SCALE_BY_TWO_NV = 34110;
/*     */   public static final int GL_SCALE_BY_FOUR_NV = 34111;
/*     */   public static final int GL_SCALE_BY_ONE_HALF_NV = 34112;
/*     */   public static final int GL_BIAS_BY_NEGATIVE_ONE_HALF_NV = 34113;
/*     */   public static final int GL_DISCARD_NV = 34096;
/*     */   public static final int GL_COMBINER_INPUT_NV = 34114;
/*     */   public static final int GL_COMBINER_MAPPING_NV = 34115;
/*     */   public static final int GL_COMBINER_COMPONENT_USAGE_NV = 34116;
/*     */   public static final int GL_COMBINER_AB_DOT_PRODUCT_NV = 34117;
/*     */   public static final int GL_COMBINER_CD_DOT_PRODUCT_NV = 34118;
/*     */   public static final int GL_COMBINER_MUX_SUM_NV = 34119;
/*     */   public static final int GL_COMBINER_SCALE_NV = 34120;
/*     */   public static final int GL_COMBINER_BIAS_NV = 34121;
/*     */   public static final int GL_COMBINER_AB_OUTPUT_NV = 34122;
/*     */   public static final int GL_COMBINER_CD_OUTPUT_NV = 34123;
/*     */   public static final int GL_COMBINER_SUM_OUTPUT_NV = 34124;
/*     */   public static final int GL_NUM_GENERAL_COMBINERS_NV = 34126;
/*     */   public static final int GL_COLOR_SUM_CLAMP_NV = 34127;
/*     */   public static final int GL_MAX_GENERAL_COMBINERS_NV = 34125;
/*     */   
/*     */   private static native void nglCombinerParameterfNV(int paramInt, float paramFloat, long paramLong);
/*     */   
/*     */   public static void glCombinerParameterfNV(int pname, float param) {
/*  67 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  68 */     long function_pointer = caps.NV_register_combiners_glCombinerParameterfNV_pointer;
/*  69 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  70 */     nglCombinerParameterfNV(pname, param, function_pointer);
/*     */   }
/*     */   private static native void nglCombinerParameterfvNV(int paramInt1, FloatBuffer paramFloatBuffer, int paramInt2, long paramLong);
/*     */   
/*     */   public static void glCombinerParameterNV(int pname, FloatBuffer params) {
/*  75 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  76 */     long function_pointer = caps.NV_register_combiners_glCombinerParameterfvNV_pointer;
/*  77 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  78 */     BufferChecks.checkBuffer(params, 4);
/*  79 */     nglCombinerParameterfvNV(pname, params, params.position(), function_pointer);
/*     */   }
/*     */ 
/*     */   
/*     */   public static void glCombinerParameteriNV(int pname, int param) {
/*  84 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  85 */     long function_pointer = caps.NV_register_combiners_glCombinerParameteriNV_pointer;
/*  86 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  87 */     nglCombinerParameteriNV(pname, param, function_pointer);
/*     */   }
/*     */   private static native void nglCombinerParameteriNV(int paramInt1, int paramInt2, long paramLong);
/*     */   
/*     */   public static void glCombinerParameterNV(int pname, IntBuffer params) {
/*  92 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  93 */     long function_pointer = caps.NV_register_combiners_glCombinerParameterivNV_pointer;
/*  94 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  95 */     BufferChecks.checkBuffer(params, 4);
/*  96 */     nglCombinerParameterivNV(pname, params, params.position(), function_pointer);
/*     */   }
/*     */   private static native void nglCombinerParameterivNV(int paramInt1, IntBuffer paramIntBuffer, int paramInt2, long paramLong);
/*     */   
/*     */   public static void glCombinerInputNV(int stage, int portion, int variable, int input, int mapping, int componentUsage) {
/* 101 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 102 */     long function_pointer = caps.NV_register_combiners_glCombinerInputNV_pointer;
/* 103 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 104 */     nglCombinerInputNV(stage, portion, variable, input, mapping, componentUsage, function_pointer);
/*     */   }
/*     */   private static native void nglCombinerInputNV(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, long paramLong);
/*     */   
/*     */   public static void glCombinerOutputNV(int stage, int portion, int abOutput, int cdOutput, int sumOutput, int scale, int bias, boolean abDotProduct, boolean cdDotProduct, boolean muxSum) {
/* 109 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 110 */     long function_pointer = caps.NV_register_combiners_glCombinerOutputNV_pointer;
/* 111 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 112 */     nglCombinerOutputNV(stage, portion, abOutput, cdOutput, sumOutput, scale, bias, abDotProduct, cdDotProduct, muxSum, function_pointer);
/*     */   }
/*     */   private static native void nglCombinerOutputNV(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, long paramLong);
/*     */   
/*     */   public static void glFinalCombinerInputNV(int variable, int input, int mapping, int componentUsage) {
/* 117 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 118 */     long function_pointer = caps.NV_register_combiners_glFinalCombinerInputNV_pointer;
/* 119 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 120 */     nglFinalCombinerInputNV(variable, input, mapping, componentUsage, function_pointer);
/*     */   }
/*     */   private static native void nglFinalCombinerInputNV(int paramInt1, int paramInt2, int paramInt3, int paramInt4, long paramLong);
/*     */   
/*     */   public static void glGetCombinerInputParameterNV(int stage, int portion, int variable, int pname, FloatBuffer params) {
/* 125 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 126 */     long function_pointer = caps.NV_register_combiners_glGetCombinerInputParameterfvNV_pointer;
/* 127 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 128 */     BufferChecks.checkBuffer(params, 4);
/* 129 */     nglGetCombinerInputParameterfvNV(stage, portion, variable, pname, params, params.position(), function_pointer);
/*     */   }
/*     */   
/*     */   private static native void nglGetCombinerInputParameterfvNV(int paramInt1, int paramInt2, int paramInt3, int paramInt4, FloatBuffer paramFloatBuffer, int paramInt5, long paramLong);
/*     */   
/*     */   public static float glGetCombinerInputParameterfNV(int stage, int portion, int variable, int pname) {
/* 135 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 136 */     long function_pointer = caps.NV_register_combiners_glGetCombinerInputParameterfvNV_pointer;
/* 137 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 138 */     FloatBuffer params = APIUtils.getBufferFloat();
/* 139 */     nglGetCombinerInputParameterfvNV(stage, portion, variable, pname, params, params.position(), function_pointer);
/* 140 */     return params.get(0);
/*     */   }
/*     */   
/*     */   public static void glGetCombinerInputParameterNV(int stage, int portion, int variable, int pname, IntBuffer params) {
/* 144 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 145 */     long function_pointer = caps.NV_register_combiners_glGetCombinerInputParameterivNV_pointer;
/* 146 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 147 */     BufferChecks.checkBuffer(params, 4);
/* 148 */     nglGetCombinerInputParameterivNV(stage, portion, variable, pname, params, params.position(), function_pointer);
/*     */   }
/*     */   
/*     */   private static native void nglGetCombinerInputParameterivNV(int paramInt1, int paramInt2, int paramInt3, int paramInt4, IntBuffer paramIntBuffer, int paramInt5, long paramLong);
/*     */   
/*     */   public static int glGetCombinerInputParameteriNV(int stage, int portion, int variable, int pname) {
/* 154 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 155 */     long function_pointer = caps.NV_register_combiners_glGetCombinerInputParameterivNV_pointer;
/* 156 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 157 */     IntBuffer params = APIUtils.getBufferInt();
/* 158 */     nglGetCombinerInputParameterivNV(stage, portion, variable, pname, params, params.position(), function_pointer);
/* 159 */     return params.get(0);
/*     */   }
/*     */   
/*     */   public static void glGetCombinerOutputParameterNV(int stage, int portion, int pname, FloatBuffer params) {
/* 163 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 164 */     long function_pointer = caps.NV_register_combiners_glGetCombinerOutputParameterfvNV_pointer;
/* 165 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 166 */     BufferChecks.checkBuffer(params, 4);
/* 167 */     nglGetCombinerOutputParameterfvNV(stage, portion, pname, params, params.position(), function_pointer);
/*     */   }
/*     */   
/*     */   private static native void nglGetCombinerOutputParameterfvNV(int paramInt1, int paramInt2, int paramInt3, FloatBuffer paramFloatBuffer, int paramInt4, long paramLong);
/*     */   
/*     */   public static float glGetCombinerOutputParameterfNV(int stage, int portion, int pname) {
/* 173 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 174 */     long function_pointer = caps.NV_register_combiners_glGetCombinerOutputParameterfvNV_pointer;
/* 175 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 176 */     FloatBuffer params = APIUtils.getBufferFloat();
/* 177 */     nglGetCombinerOutputParameterfvNV(stage, portion, pname, params, params.position(), function_pointer);
/* 178 */     return params.get(0);
/*     */   }
/*     */   
/*     */   public static void glGetCombinerOutputParameterNV(int stage, int portion, int pname, IntBuffer params) {
/* 182 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 183 */     long function_pointer = caps.NV_register_combiners_glGetCombinerOutputParameterivNV_pointer;
/* 184 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 185 */     BufferChecks.checkBuffer(params, 4);
/* 186 */     nglGetCombinerOutputParameterivNV(stage, portion, pname, params, params.position(), function_pointer);
/*     */   }
/*     */   
/*     */   private static native void nglGetCombinerOutputParameterivNV(int paramInt1, int paramInt2, int paramInt3, IntBuffer paramIntBuffer, int paramInt4, long paramLong);
/*     */   
/*     */   public static int glGetCombinerOutputParameteriNV(int stage, int portion, int pname) {
/* 192 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 193 */     long function_pointer = caps.NV_register_combiners_glGetCombinerOutputParameterivNV_pointer;
/* 194 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 195 */     IntBuffer params = APIUtils.getBufferInt();
/* 196 */     nglGetCombinerOutputParameterivNV(stage, portion, pname, params, params.position(), function_pointer);
/* 197 */     return params.get(0);
/*     */   }
/*     */   
/*     */   public static void glGetFinalCombinerInputParameterNV(int variable, int pname, FloatBuffer params) {
/* 201 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 202 */     long function_pointer = caps.NV_register_combiners_glGetFinalCombinerInputParameterfvNV_pointer;
/* 203 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 204 */     BufferChecks.checkBuffer(params, 4);
/* 205 */     nglGetFinalCombinerInputParameterfvNV(variable, pname, params, params.position(), function_pointer);
/*     */   }
/*     */   
/*     */   private static native void nglGetFinalCombinerInputParameterfvNV(int paramInt1, int paramInt2, FloatBuffer paramFloatBuffer, int paramInt3, long paramLong);
/*     */   
/*     */   public static float glGetFinalCombinerInputParameterfNV(int variable, int pname) {
/* 211 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 212 */     long function_pointer = caps.NV_register_combiners_glGetFinalCombinerInputParameterfvNV_pointer;
/* 213 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 214 */     FloatBuffer params = APIUtils.getBufferFloat();
/* 215 */     nglGetFinalCombinerInputParameterfvNV(variable, pname, params, params.position(), function_pointer);
/* 216 */     return params.get(0);
/*     */   }
/*     */   
/*     */   public static void glGetFinalCombinerInputParameterNV(int variable, int pname, IntBuffer params) {
/* 220 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 221 */     long function_pointer = caps.NV_register_combiners_glGetFinalCombinerInputParameterivNV_pointer;
/* 222 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 223 */     BufferChecks.checkBuffer(params, 4);
/* 224 */     nglGetFinalCombinerInputParameterivNV(variable, pname, params, params.position(), function_pointer);
/*     */   }
/*     */   
/*     */   private static native void nglGetFinalCombinerInputParameterivNV(int paramInt1, int paramInt2, IntBuffer paramIntBuffer, int paramInt3, long paramLong);
/*     */   
/*     */   public static int glGetFinalCombinerInputParameteriNV(int variable, int pname) {
/* 230 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 231 */     long function_pointer = caps.NV_register_combiners_glGetFinalCombinerInputParameterivNV_pointer;
/* 232 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 233 */     IntBuffer params = APIUtils.getBufferInt();
/* 234 */     nglGetFinalCombinerInputParameterivNV(variable, pname, params, params.position(), function_pointer);
/* 235 */     return params.get(0);
/*     */   }
/*     */ }


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\org\lwjgl\opengl\NVRegisterCombiners.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */