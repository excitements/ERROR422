/*      */ package org.lwjgl.opengl;
/*      */ 
/*      */ import java.nio.IntBuffer;
/*      */ import java.util.HashSet;
/*      */ import java.util.Set;
/*      */ import org.lwjgl.BufferUtils;
/*      */ import org.lwjgl.LWJGLException;
/*      */ import org.lwjgl.LWJGLUtil;
/*      */ 
/*      */ 
/*      */ public class ContextCapabilities
/*      */ {
/*      */   static final boolean DEBUG = false;
/*   14 */   final StateTracker tracker = new StateTracker();
/*   15 */   final IntBuffer scratch_int_buffer = BufferUtils.createIntBuffer(16);
/*      */   
/*      */   public final boolean GL_AMD_conservative_depth;
/*      */   
/*      */   public final boolean GL_AMD_draw_buffers_blend;
/*      */   public final boolean GL_AMD_performance_monitor;
/*      */   public final boolean GL_AMD_seamless_cubemap_per_texture;
/*      */   public final boolean GL_AMD_shader_stencil_export;
/*      */   public final boolean GL_AMD_texture_texture4;
/*      */   public final boolean GL_AMD_vertex_shader_tessellator;
/*      */   public final boolean GL_APPLE_aux_depth_stencil;
/*      */   public final boolean GL_APPLE_client_storage;
/*      */   public final boolean GL_APPLE_element_array;
/*      */   public final boolean GL_APPLE_fence;
/*      */   public final boolean GL_APPLE_float_pixels;
/*      */   public final boolean GL_APPLE_flush_buffer_range;
/*      */   public final boolean GL_APPLE_object_purgeable;
/*      */   public final boolean GL_APPLE_packed_pixels;
/*      */   public final boolean GL_APPLE_rgb_422;
/*      */   public final boolean GL_APPLE_row_bytes;
/*      */   public final boolean GL_APPLE_texture_range;
/*      */   public final boolean GL_APPLE_vertex_array_object;
/*      */   public final boolean GL_APPLE_vertex_array_range;
/*      */   public final boolean GL_APPLE_vertex_program_evaluators;
/*      */   public final boolean GL_APPLE_ycbcr_422;
/*      */   public final boolean GL_ARB_blend_func_extended;
/*      */   public final boolean GL_ARB_color_buffer_float;
/*      */   public final boolean GL_ARB_compatibility;
/*      */   public final boolean GL_ARB_copy_buffer;
/*      */   public final boolean GL_ARB_depth_buffer_float;
/*      */   public final boolean GL_ARB_depth_clamp;
/*      */   public final boolean GL_ARB_depth_texture;
/*      */   public final boolean GL_ARB_draw_buffers;
/*      */   public final boolean GL_ARB_draw_buffers_blend;
/*      */   public final boolean GL_ARB_draw_elements_base_vertex;
/*      */   public final boolean GL_ARB_draw_indirect;
/*      */   public final boolean GL_ARB_draw_instanced;
/*      */   public final boolean GL_ARB_explicit_attrib_location;
/*      */   public final boolean GL_ARB_fragment_coord_conventions;
/*      */   public final boolean GL_ARB_fragment_program;
/*      */   public final boolean GL_ARB_fragment_program_shadow;
/*      */   public final boolean GL_ARB_fragment_shader;
/*      */   public final boolean GL_ARB_framebuffer_object;
/*      */   public final boolean GL_ARB_framebuffer_sRGB;
/*      */   public final boolean GL_ARB_geometry_shader4;
/*      */   public final boolean GL_ARB_gpu_shader5;
/*      */   public final boolean GL_ARB_gpu_shader_fp64;
/*      */   public final boolean GL_ARB_half_float_pixel;
/*      */   public final boolean GL_ARB_half_float_vertex;
/*      */   public final boolean GL_ARB_imaging;
/*      */   public final boolean GL_ARB_instanced_arrays;
/*      */   public final boolean GL_ARB_map_buffer_range;
/*      */   public final boolean GL_ARB_matrix_palette;
/*      */   public final boolean GL_ARB_multisample;
/*      */   public final boolean GL_ARB_multitexture;
/*      */   public final boolean GL_ARB_occlusion_query;
/*      */   public final boolean GL_ARB_occlusion_query2;
/*      */   public final boolean GL_ARB_pixel_buffer_object;
/*      */   public final boolean GL_ARB_point_parameters;
/*      */   public final boolean GL_ARB_point_sprite;
/*      */   public final boolean GL_ARB_provoking_vertex;
/*      */   public final boolean GL_ARB_sample_shading;
/*      */   public final boolean GL_ARB_sampler_objects;
/*      */   public final boolean GL_ARB_seamless_cube_map;
/*      */   public final boolean GL_ARB_shader_bit_encoding;
/*      */   public final boolean GL_ARB_shader_objects;
/*      */   public final boolean GL_ARB_shader_subroutine;
/*      */   public final boolean GL_ARB_shader_texture_lod;
/*      */   public final boolean GL_ARB_shading_language_100;
/*      */   public final boolean GL_ARB_shading_language_include;
/*      */   public final boolean GL_ARB_shadow;
/*      */   public final boolean GL_ARB_shadow_ambient;
/*      */   public final boolean GL_ARB_sync;
/*      */   public final boolean GL_ARB_tessellation_shader;
/*      */   public final boolean GL_ARB_texture_border_clamp;
/*      */   public final boolean GL_ARB_texture_buffer_object;
/*      */   public final boolean GL_ARB_texture_buffer_object_rgb32;
/*      */   public final boolean GL_ARB_texture_compression;
/*      */   public final boolean GL_ARB_texture_compression_bptc;
/*      */   public final boolean GL_ARB_texture_compression_rgtc;
/*      */   public final boolean GL_ARB_texture_cube_map;
/*      */   public final boolean GL_ARB_texture_cube_map_array;
/*      */   public final boolean GL_ARB_texture_env_add;
/*      */   public final boolean GL_ARB_texture_env_combine;
/*      */   public final boolean GL_ARB_texture_env_crossbar;
/*      */   public final boolean GL_ARB_texture_env_dot3;
/*      */   public final boolean GL_ARB_texture_float;
/*      */   public final boolean GL_ARB_texture_gather;
/*      */   public final boolean GL_ARB_texture_mirrored_repeat;
/*      */   public final boolean GL_ARB_texture_multisample;
/*      */   public final boolean GL_ARB_texture_non_power_of_two;
/*      */   public final boolean GL_ARB_texture_query_lod;
/*      */   public final boolean GL_ARB_texture_rectangle;
/*      */   public final boolean GL_ARB_texture_rg;
/*      */   public final boolean GL_ARB_texture_rgb10_a2ui;
/*      */   public final boolean GL_ARB_texture_swizzle;
/*      */   public final boolean GL_ARB_timer_query;
/*      */   public final boolean GL_ARB_transform_feedback2;
/*      */   public final boolean GL_ARB_transform_feedback3;
/*      */   public final boolean GL_ARB_transpose_matrix;
/*      */   public final boolean GL_ARB_uniform_buffer_object;
/*      */   public final boolean GL_ARB_vertex_array_bgra;
/*      */   public final boolean GL_ARB_vertex_array_object;
/*      */   public final boolean GL_ARB_vertex_blend;
/*      */   public final boolean GL_ARB_vertex_buffer_object;
/*      */   public final boolean GL_ARB_vertex_program;
/*      */   public final boolean GL_ARB_vertex_shader;
/*      */   public final boolean GL_ARB_vertex_type_2_10_10_10_rev;
/*      */   public final boolean GL_ARB_window_pos;
/*      */   public final boolean GL_ATI_draw_buffers;
/*      */   public final boolean GL_ATI_element_array;
/*      */   public final boolean GL_ATI_envmap_bumpmap;
/*      */   public final boolean GL_ATI_fragment_shader;
/*      */   public final boolean GL_ATI_map_object_buffer;
/*      */   public final boolean GL_ATI_meminfo;
/*      */   public final boolean GL_ATI_pn_triangles;
/*      */   public final boolean GL_ATI_separate_stencil;
/*      */   public final boolean GL_ATI_shader_texture_lod;
/*      */   public final boolean GL_ATI_text_fragment_shader;
/*      */   public final boolean GL_ATI_texture_compression_3dc;
/*      */   public final boolean GL_ATI_texture_env_combine3;
/*      */   public final boolean GL_ATI_texture_float;
/*      */   public final boolean GL_ATI_texture_mirror_once;
/*      */   public final boolean GL_ATI_vertex_array_object;
/*      */   public final boolean GL_ATI_vertex_attrib_array_object;
/*      */   public final boolean GL_ATI_vertex_streams;
/*      */   public final boolean GL_EXT_abgr;
/*      */   public final boolean GL_EXT_bgra;
/*      */   public final boolean GL_EXT_bindable_uniform;
/*      */   public final boolean GL_EXT_blend_color;
/*      */   public final boolean GL_EXT_blend_equation_separate;
/*      */   public final boolean GL_EXT_blend_func_separate;
/*      */   public final boolean GL_EXT_blend_minmax;
/*      */   public final boolean GL_EXT_blend_subtract;
/*      */   public final boolean GL_EXT_Cg_shader;
/*      */   public final boolean GL_EXT_compiled_vertex_array;
/*      */   public final boolean GL_EXT_depth_bounds_test;
/*      */   public final boolean GL_EXT_direct_state_access;
/*      */   public final boolean GL_EXT_draw_buffers2;
/*      */   public final boolean GL_EXT_draw_instanced;
/*      */   public final boolean GL_EXT_draw_range_elements;
/*      */   public final boolean GL_EXT_fog_coord;
/*      */   public final boolean GL_EXT_framebuffer_blit;
/*      */   public final boolean GL_EXT_framebuffer_multisample;
/*      */   public final boolean GL_EXT_framebuffer_object;
/*      */   public final boolean GL_EXT_framebuffer_sRGB;
/*      */   public final boolean GL_EXT_geometry_shader4;
/*      */   public final boolean GL_EXT_gpu_program_parameters;
/*      */   public final boolean GL_EXT_gpu_shader4;
/*      */   public final boolean GL_EXT_multi_draw_arrays;
/*      */   public final boolean GL_EXT_packed_depth_stencil;
/*      */   public final boolean GL_EXT_packed_float;
/*      */   public final boolean GL_EXT_packed_pixels;
/*      */   public final boolean GL_EXT_paletted_texture;
/*      */   public final boolean GL_EXT_pixel_buffer_object;
/*      */   public final boolean GL_EXT_point_parameters;
/*      */   public final boolean GL_EXT_provoking_vertex;
/*      */   public final boolean GL_EXT_rescale_normal;
/*      */   public final boolean GL_EXT_secondary_color;
/*      */   public final boolean GL_EXT_separate_shader_objects;
/*      */   public final boolean GL_EXT_separate_specular_color;
/*      */   public final boolean GL_EXT_shader_image_load_store;
/*      */   public final boolean GL_EXT_shadow_funcs;
/*      */   public final boolean GL_EXT_shared_texture_palette;
/*      */   public final boolean GL_EXT_stencil_clear_tag;
/*      */   public final boolean GL_EXT_stencil_two_side;
/*      */   public final boolean GL_EXT_stencil_wrap;
/*      */   public final boolean GL_EXT_texture_3d;
/*      */   public final boolean GL_EXT_texture_array;
/*      */   public final boolean GL_EXT_texture_buffer_object;
/*      */   public final boolean GL_EXT_texture_compression_latc;
/*      */   public final boolean GL_EXT_texture_compression_rgtc;
/*      */   public final boolean GL_EXT_texture_compression_s3tc;
/*      */   public final boolean GL_EXT_texture_env_combine;
/*      */   public final boolean GL_EXT_texture_env_dot3;
/*      */   public final boolean GL_EXT_texture_filter_anisotropic;
/*      */   public final boolean GL_EXT_texture_integer;
/*      */   public final boolean GL_EXT_texture_lod_bias;
/*      */   public final boolean GL_EXT_texture_mirror_clamp;
/*      */   public final boolean GL_EXT_texture_rectangle;
/*      */   public final boolean GL_EXT_texture_sRGB;
/*      */   public final boolean GL_EXT_texture_shared_exponent;
/*      */   public final boolean GL_EXT_texture_snorm;
/*      */   public final boolean GL_EXT_texture_swizzle;
/*      */   public final boolean GL_EXT_timer_query;
/*      */   public final boolean GL_EXT_transform_feedback;
/*      */   public final boolean GL_EXT_vertex_array_bgra;
/*      */   public final boolean GL_EXT_vertex_attrib_64bit;
/*      */   public final boolean GL_EXT_vertex_shader;
/*      */   public final boolean GL_EXT_vertex_weighting;
/*      */   public final boolean OpenGL11;
/*      */   public final boolean OpenGL12;
/*      */   public final boolean OpenGL13;
/*      */   public final boolean OpenGL14;
/*      */   public final boolean OpenGL15;
/*      */   public final boolean OpenGL20;
/*      */   public final boolean OpenGL21;
/*      */   public final boolean OpenGL30;
/*      */   public final boolean OpenGL31;
/*      */   public final boolean OpenGL32;
/*      */   public final boolean OpenGL33;
/*      */   public final boolean OpenGL40;
/*      */   public final boolean GL_GREMEDY_string_marker;
/*      */   public final boolean GL_HP_occlusion_test;
/*      */   public final boolean GL_IBM_rasterpos_clip;
/*      */   public final boolean GL_NVX_gpu_memory_info;
/*      */   public final boolean GL_NV_blend_square;
/*      */   public final boolean GL_NV_conditional_render;
/*      */   public final boolean GL_NV_copy_depth_to_color;
/*      */   public final boolean GL_NV_copy_image;
/*      */   public final boolean GL_NV_depth_buffer_float;
/*      */   public final boolean GL_NV_depth_clamp;
/*      */   public final boolean GL_NV_evaluators;
/*      */   public final boolean GL_NV_explicit_multisample;
/*      */   public final boolean GL_NV_fence;
/*      */   public final boolean GL_NV_float_buffer;
/*      */   public final boolean GL_NV_fog_distance;
/*      */   public final boolean GL_NV_fragment_program;
/*      */   public final boolean GL_NV_fragment_program2;
/*      */   public final boolean GL_NV_fragment_program4;
/*      */   public final boolean GL_NV_fragment_program_option;
/*      */   public final boolean GL_NV_framebuffer_multisample_coverage;
/*      */   public final boolean GL_NV_geometry_program4;
/*      */   public final boolean GL_NV_geometry_shader4;
/*      */   public final boolean GL_NV_gpu_program4;
/*      */   public final boolean GL_NV_gpu_program5;
/*      */   public final boolean GL_NV_gpu_shader5;
/*      */   public final boolean GL_NV_half_float;
/*      */   public final boolean GL_NV_light_max_exponent;
/*      */   public final boolean GL_NV_multisample_filter_hint;
/*      */   public final boolean GL_NV_occlusion_query;
/*      */   public final boolean GL_NV_packed_depth_stencil;
/*      */   public final boolean GL_NV_parameter_buffer_object;
/*      */   public final boolean GL_NV_parameter_buffer_object2;
/*      */   public final boolean GL_NV_pixel_data_range;
/*      */   public final boolean GL_NV_point_sprite;
/*      */   public final boolean GL_NV_primitive_restart;
/*      */   public final boolean GL_NV_register_combiners;
/*      */   public final boolean GL_NV_register_combiners2;
/*      */   public final boolean GL_NV_shader_buffer_load;
/*      */   public final boolean GL_NV_shader_buffer_store;
/*      */   public final boolean GL_NV_tessellation_program5;
/*      */   public final boolean GL_NV_texgen_reflection;
/*      */   public final boolean GL_NV_texture_barrier;
/*      */   public final boolean GL_NV_texture_compression_vtc;
/*      */   public final boolean GL_NV_texture_env_combine4;
/*      */   public final boolean GL_NV_texture_expand_normal;
/*      */   public final boolean GL_NV_texture_rectangle;
/*      */   public final boolean GL_NV_texture_shader;
/*      */   public final boolean GL_NV_texture_shader2;
/*      */   public final boolean GL_NV_texture_shader3;
/*      */   public final boolean GL_NV_transform_feedback;
/*      */   public final boolean GL_NV_transform_feedback2;
/*      */   public final boolean GL_NV_vertex_array_range;
/*      */   public final boolean GL_NV_vertex_array_range2;
/*      */   public final boolean GL_NV_vertex_attrib_integer_64bit;
/*      */   public final boolean GL_NV_vertex_buffer_unified_memory;
/*      */   public final boolean GL_NV_vertex_program;
/*      */   public final boolean GL_NV_vertex_program1_1;
/*      */   public final boolean GL_NV_vertex_program2;
/*      */   public final boolean GL_NV_vertex_program2_option;
/*      */   public final boolean GL_NV_vertex_program3;
/*      */   public final boolean GL_NV_vertex_program4;
/*      */   public final boolean GL_SGIS_generate_mipmap;
/*      */   public final boolean GL_SGIS_texture_lod;
/*      */   public final boolean GL_SUN_slice_accum;
/*      */   long AMD_draw_buffers_blend_glBlendFuncIndexedAMD_pointer;
/*      */   long AMD_draw_buffers_blend_glBlendFuncSeparateIndexedAMD_pointer;
/*      */   long AMD_draw_buffers_blend_glBlendEquationIndexedAMD_pointer;
/*      */   long AMD_draw_buffers_blend_glBlendEquationSeparateIndexedAMD_pointer;
/*      */   long AMD_performance_monitor_glGetPerfMonitorGroupsAMD_pointer;
/*      */   long AMD_performance_monitor_glGetPerfMonitorCountersAMD_pointer;
/*      */   long AMD_performance_monitor_glGetPerfMonitorGroupStringAMD_pointer;
/*      */   long AMD_performance_monitor_glGetPerfMonitorCounterStringAMD_pointer;
/*      */   long AMD_performance_monitor_glGetPerfMonitorCounterInfoAMD_pointer;
/*      */   long AMD_performance_monitor_glGenPerfMonitorsAMD_pointer;
/*      */   long AMD_performance_monitor_glDeletePerfMonitorsAMD_pointer;
/*      */   long AMD_performance_monitor_glSelectPerfMonitorCountersAMD_pointer;
/*      */   long AMD_performance_monitor_glBeginPerfMonitorAMD_pointer;
/*      */   long AMD_performance_monitor_glEndPerfMonitorAMD_pointer;
/*      */   long AMD_performance_monitor_glGetPerfMonitorCounterDataAMD_pointer;
/*      */   long AMD_vertex_shader_tessellator_glTessellationFactorAMD_pointer;
/*      */   long AMD_vertex_shader_tessellator_glTessellationModeAMD_pointer;
/*      */   long APPLE_element_array_glElementPointerAPPLE_pointer;
/*      */   long APPLE_element_array_glDrawElementArrayAPPLE_pointer;
/*      */   long APPLE_element_array_glDrawRangeElementArrayAPPLE_pointer;
/*      */   long APPLE_element_array_glMultiDrawElementArrayAPPLE_pointer;
/*      */   long APPLE_element_array_glMultiDrawRangeElementArrayAPPLE_pointer;
/*      */   long APPLE_fence_glGenFencesAPPLE_pointer;
/*      */   long APPLE_fence_glDeleteFencesAPPLE_pointer;
/*      */   long APPLE_fence_glSetFenceAPPLE_pointer;
/*      */   long APPLE_fence_glIsFenceAPPLE_pointer;
/*      */   long APPLE_fence_glTestFenceAPPLE_pointer;
/*      */   long APPLE_fence_glFinishFenceAPPLE_pointer;
/*      */   long APPLE_fence_glTestObjectAPPLE_pointer;
/*      */   long APPLE_fence_glFinishObjectAPPLE_pointer;
/*      */   long APPLE_flush_buffer_range_glBufferParameteriAPPLE_pointer;
/*      */   long APPLE_flush_buffer_range_glFlushMappedBufferRangeAPPLE_pointer;
/*      */   long APPLE_object_purgeable_glObjectPurgeableAPPLE_pointer;
/*      */   long APPLE_object_purgeable_glObjectUnpurgeableAPPLE_pointer;
/*      */   long APPLE_object_purgeable_glGetObjectParameterivAPPLE_pointer;
/*      */   long APPLE_texture_range_glTextureRangeAPPLE_pointer;
/*      */   long APPLE_texture_range_glGetTexParameterPointervAPPLE_pointer;
/*      */   long APPLE_vertex_array_object_glBindVertexArrayAPPLE_pointer;
/*      */   long APPLE_vertex_array_object_glDeleteVertexArraysAPPLE_pointer;
/*      */   long APPLE_vertex_array_object_glGenVertexArraysAPPLE_pointer;
/*      */   long APPLE_vertex_array_object_glIsVertexArrayAPPLE_pointer;
/*      */   long APPLE_vertex_array_range_glVertexArrayRangeAPPLE_pointer;
/*      */   long APPLE_vertex_array_range_glFlushVertexArrayRangeAPPLE_pointer;
/*      */   long APPLE_vertex_array_range_glVertexArrayParameteriAPPLE_pointer;
/*      */   long APPLE_vertex_program_evaluators_glEnableVertexAttribAPPLE_pointer;
/*      */   long APPLE_vertex_program_evaluators_glDisableVertexAttribAPPLE_pointer;
/*      */   long APPLE_vertex_program_evaluators_glIsVertexAttribEnabledAPPLE_pointer;
/*      */   long APPLE_vertex_program_evaluators_glMapVertexAttrib1dAPPLE_pointer;
/*      */   long APPLE_vertex_program_evaluators_glMapVertexAttrib1fAPPLE_pointer;
/*      */   long APPLE_vertex_program_evaluators_glMapVertexAttrib2dAPPLE_pointer;
/*      */   long APPLE_vertex_program_evaluators_glMapVertexAttrib2fAPPLE_pointer;
/*      */   long ARB_blend_func_extended_glBindFragDataLocationIndexed_pointer;
/*      */   long ARB_blend_func_extended_glGetFragDataIndex_pointer;
/*      */   long ARB_buffer_object_glBindBufferARB_pointer;
/*      */   long ARB_buffer_object_glDeleteBuffersARB_pointer;
/*      */   long ARB_buffer_object_glGenBuffersARB_pointer;
/*      */   long ARB_buffer_object_glIsBufferARB_pointer;
/*      */   long ARB_buffer_object_glBufferDataARB_pointer;
/*      */   long ARB_buffer_object_glBufferSubDataARB_pointer;
/*      */   long ARB_buffer_object_glGetBufferSubDataARB_pointer;
/*      */   long ARB_buffer_object_glMapBufferARB_pointer;
/*      */   long ARB_buffer_object_glUnmapBufferARB_pointer;
/*      */   long ARB_buffer_object_glGetBufferParameterivARB_pointer;
/*      */   long ARB_buffer_object_glGetBufferPointervARB_pointer;
/*      */   long ARB_color_buffer_float_glClampColorARB_pointer;
/*      */   long ARB_copy_buffer_glCopyBufferSubData_pointer;
/*      */   long ARB_draw_buffers_glDrawBuffersARB_pointer;
/*      */   long ARB_draw_buffers_blend_glBlendEquationiARB_pointer;
/*      */   long ARB_draw_buffers_blend_glBlendEquationSeparateiARB_pointer;
/*      */   long ARB_draw_buffers_blend_glBlendFunciARB_pointer;
/*      */   long ARB_draw_buffers_blend_glBlendFuncSeparateiARB_pointer;
/*      */   long ARB_draw_elements_base_vertex_glDrawElementsBaseVertex_pointer;
/*      */   long ARB_draw_elements_base_vertex_glDrawRangeElementsBaseVertex_pointer;
/*      */   long ARB_draw_elements_base_vertex_glDrawElementsInstancedBaseVertex_pointer;
/*      */   long ARB_draw_indirect_glDrawArraysIndirect_pointer;
/*      */   long ARB_draw_indirect_glDrawElementsIndirect_pointer;
/*      */   long ARB_draw_instanced_glDrawArraysInstancedARB_pointer;
/*      */   long ARB_draw_instanced_glDrawElementsInstancedARB_pointer;
/*      */   long ARB_framebuffer_object_glIsRenderbuffer_pointer;
/*      */   long ARB_framebuffer_object_glBindRenderbuffer_pointer;
/*      */   long ARB_framebuffer_object_glDeleteRenderbuffers_pointer;
/*      */   long ARB_framebuffer_object_glGenRenderbuffers_pointer;
/*      */   long ARB_framebuffer_object_glRenderbufferStorage_pointer;
/*      */   long ARB_framebuffer_object_glRenderbufferStorageMultisample_pointer;
/*      */   long ARB_framebuffer_object_glGetRenderbufferParameteriv_pointer;
/*      */   long ARB_framebuffer_object_glIsFramebuffer_pointer;
/*      */   long ARB_framebuffer_object_glBindFramebuffer_pointer;
/*      */   long ARB_framebuffer_object_glDeleteFramebuffers_pointer;
/*      */   long ARB_framebuffer_object_glGenFramebuffers_pointer;
/*      */   long ARB_framebuffer_object_glCheckFramebufferStatus_pointer;
/*      */   long ARB_framebuffer_object_glFramebufferTexture1D_pointer;
/*      */   long ARB_framebuffer_object_glFramebufferTexture2D_pointer;
/*      */   long ARB_framebuffer_object_glFramebufferTexture3D_pointer;
/*      */   long ARB_framebuffer_object_glFramebufferTextureLayer_pointer;
/*      */   long ARB_framebuffer_object_glFramebufferRenderbuffer_pointer;
/*      */   long ARB_framebuffer_object_glGetFramebufferAttachmentParameteriv_pointer;
/*      */   long ARB_framebuffer_object_glBlitFramebuffer_pointer;
/*      */   long ARB_framebuffer_object_glGenerateMipmap_pointer;
/*      */   long ARB_geometry_shader4_glProgramParameteriARB_pointer;
/*      */   long ARB_geometry_shader4_glFramebufferTextureARB_pointer;
/*      */   long ARB_geometry_shader4_glFramebufferTextureLayerARB_pointer;
/*      */   long ARB_geometry_shader4_glFramebufferTextureFaceARB_pointer;
/*      */   long ARB_gpu_shader_fp64_glUniform1d_pointer;
/*      */   long ARB_gpu_shader_fp64_glUniform2d_pointer;
/*      */   long ARB_gpu_shader_fp64_glUniform3d_pointer;
/*      */   long ARB_gpu_shader_fp64_glUniform4d_pointer;
/*      */   long ARB_gpu_shader_fp64_glUniform1dv_pointer;
/*      */   long ARB_gpu_shader_fp64_glUniform2dv_pointer;
/*      */   long ARB_gpu_shader_fp64_glUniform3dv_pointer;
/*      */   long ARB_gpu_shader_fp64_glUniform4dv_pointer;
/*      */   long ARB_gpu_shader_fp64_glUniformMatrix2dv_pointer;
/*      */   long ARB_gpu_shader_fp64_glUniformMatrix3dv_pointer;
/*      */   long ARB_gpu_shader_fp64_glUniformMatrix4dv_pointer;
/*      */   long ARB_gpu_shader_fp64_glUniformMatrix2x3dv_pointer;
/*      */   long ARB_gpu_shader_fp64_glUniformMatrix2x4dv_pointer;
/*      */   long ARB_gpu_shader_fp64_glUniformMatrix3x2dv_pointer;
/*      */   long ARB_gpu_shader_fp64_glUniformMatrix3x4dv_pointer;
/*      */   long ARB_gpu_shader_fp64_glUniformMatrix4x2dv_pointer;
/*      */   long ARB_gpu_shader_fp64_glUniformMatrix4x3dv_pointer;
/*      */   long ARB_gpu_shader_fp64_glGetUniformdv_pointer;
/*      */   long ARB_gpu_shader_fp64_glProgramUniform1dEXT_pointer;
/*      */   long ARB_gpu_shader_fp64_glProgramUniform2dEXT_pointer;
/*      */   long ARB_gpu_shader_fp64_glProgramUniform3dEXT_pointer;
/*      */   long ARB_gpu_shader_fp64_glProgramUniform4dEXT_pointer;
/*      */   long ARB_gpu_shader_fp64_glProgramUniform1dvEXT_pointer;
/*      */   long ARB_gpu_shader_fp64_glProgramUniform2dvEXT_pointer;
/*      */   long ARB_gpu_shader_fp64_glProgramUniform3dvEXT_pointer;
/*      */   long ARB_gpu_shader_fp64_glProgramUniform4dvEXT_pointer;
/*      */   long ARB_gpu_shader_fp64_glProgramUniformMatrix2dvEXT_pointer;
/*      */   long ARB_gpu_shader_fp64_glProgramUniformMatrix3dvEXT_pointer;
/*      */   long ARB_gpu_shader_fp64_glProgramUniformMatrix4dvEXT_pointer;
/*      */   long ARB_gpu_shader_fp64_glProgramUniformMatrix2x3dvEXT_pointer;
/*      */   long ARB_gpu_shader_fp64_glProgramUniformMatrix2x4dvEXT_pointer;
/*      */   long ARB_gpu_shader_fp64_glProgramUniformMatrix3x2dvEXT_pointer;
/*      */   long ARB_gpu_shader_fp64_glProgramUniformMatrix3x4dvEXT_pointer;
/*      */   long ARB_gpu_shader_fp64_glProgramUniformMatrix4x2dvEXT_pointer;
/*      */   long ARB_gpu_shader_fp64_glProgramUniformMatrix4x3dvEXT_pointer;
/*      */   long ARB_imaging_glColorTable_pointer;
/*      */   long ARB_imaging_glColorSubTable_pointer;
/*      */   long ARB_imaging_glColorTableParameteriv_pointer;
/*      */   long ARB_imaging_glColorTableParameterfv_pointer;
/*      */   long ARB_imaging_glCopyColorSubTable_pointer;
/*      */   long ARB_imaging_glCopyColorTable_pointer;
/*      */   long ARB_imaging_glGetColorTable_pointer;
/*      */   long ARB_imaging_glGetColorTableParameteriv_pointer;
/*      */   long ARB_imaging_glGetColorTableParameterfv_pointer;
/*      */   long ARB_imaging_glBlendEquation_pointer;
/*      */   long ARB_imaging_glBlendColor_pointer;
/*      */   long ARB_imaging_glHistogram_pointer;
/*      */   long ARB_imaging_glResetHistogram_pointer;
/*      */   long ARB_imaging_glGetHistogram_pointer;
/*      */   long ARB_imaging_glGetHistogramParameterfv_pointer;
/*      */   long ARB_imaging_glGetHistogramParameteriv_pointer;
/*      */   long ARB_imaging_glMinmax_pointer;
/*      */   long ARB_imaging_glResetMinmax_pointer;
/*      */   long ARB_imaging_glGetMinmax_pointer;
/*      */   long ARB_imaging_glGetMinmaxParameterfv_pointer;
/*      */   long ARB_imaging_glGetMinmaxParameteriv_pointer;
/*      */   long ARB_imaging_glConvolutionFilter1D_pointer;
/*      */   long ARB_imaging_glConvolutionFilter2D_pointer;
/*      */   long ARB_imaging_glConvolutionParameterf_pointer;
/*      */   long ARB_imaging_glConvolutionParameterfv_pointer;
/*      */   long ARB_imaging_glConvolutionParameteri_pointer;
/*      */   long ARB_imaging_glConvolutionParameteriv_pointer;
/*      */   long ARB_imaging_glCopyConvolutionFilter1D_pointer;
/*      */   long ARB_imaging_glCopyConvolutionFilter2D_pointer;
/*      */   long ARB_imaging_glGetConvolutionFilter_pointer;
/*      */   long ARB_imaging_glGetConvolutionParameterfv_pointer;
/*      */   long ARB_imaging_glGetConvolutionParameteriv_pointer;
/*      */   long ARB_imaging_glSeparableFilter2D_pointer;
/*      */   long ARB_imaging_glGetSeparableFilter_pointer;
/*      */   long ARB_instanced_arrays_glVertexAttribDivisorARB_pointer;
/*      */   long ARB_map_buffer_range_glMapBufferRange_pointer;
/*      */   long ARB_map_buffer_range_glFlushMappedBufferRange_pointer;
/*      */   long ARB_matrix_palette_glCurrentPaletteMatrixARB_pointer;
/*      */   long ARB_matrix_palette_glMatrixIndexPointerARB_pointer;
/*      */   long ARB_matrix_palette_glMatrixIndexubvARB_pointer;
/*      */   long ARB_matrix_palette_glMatrixIndexusvARB_pointer;
/*      */   long ARB_matrix_palette_glMatrixIndexuivARB_pointer;
/*      */   long ARB_multisample_glSampleCoverageARB_pointer;
/*      */   long ARB_multitexture_glClientActiveTextureARB_pointer;
/*      */   long ARB_multitexture_glActiveTextureARB_pointer;
/*      */   long ARB_multitexture_glMultiTexCoord1fARB_pointer;
/*      */   long ARB_multitexture_glMultiTexCoord1dARB_pointer;
/*      */   long ARB_multitexture_glMultiTexCoord1iARB_pointer;
/*      */   long ARB_multitexture_glMultiTexCoord1sARB_pointer;
/*      */   long ARB_multitexture_glMultiTexCoord2fARB_pointer;
/*      */   long ARB_multitexture_glMultiTexCoord2dARB_pointer;
/*      */   long ARB_multitexture_glMultiTexCoord2iARB_pointer;
/*      */   long ARB_multitexture_glMultiTexCoord2sARB_pointer;
/*      */   long ARB_multitexture_glMultiTexCoord3fARB_pointer;
/*      */   long ARB_multitexture_glMultiTexCoord3dARB_pointer;
/*      */   long ARB_multitexture_glMultiTexCoord3iARB_pointer;
/*      */   long ARB_multitexture_glMultiTexCoord3sARB_pointer;
/*      */   long ARB_multitexture_glMultiTexCoord4fARB_pointer;
/*      */   long ARB_multitexture_glMultiTexCoord4dARB_pointer;
/*      */   long ARB_multitexture_glMultiTexCoord4iARB_pointer;
/*      */   long ARB_multitexture_glMultiTexCoord4sARB_pointer;
/*      */   long ARB_occlusion_query_glGenQueriesARB_pointer;
/*      */   long ARB_occlusion_query_glDeleteQueriesARB_pointer;
/*      */   long ARB_occlusion_query_glIsQueryARB_pointer;
/*      */   long ARB_occlusion_query_glBeginQueryARB_pointer;
/*      */   long ARB_occlusion_query_glEndQueryARB_pointer;
/*      */   long ARB_occlusion_query_glGetQueryivARB_pointer;
/*      */   long ARB_occlusion_query_glGetQueryObjectivARB_pointer;
/*      */   long ARB_occlusion_query_glGetQueryObjectuivARB_pointer;
/*      */   long ARB_point_parameters_glPointParameterfARB_pointer;
/*      */   long ARB_point_parameters_glPointParameterfvARB_pointer;
/*      */   long ARB_program_glProgramStringARB_pointer;
/*      */   long ARB_program_glBindProgramARB_pointer;
/*      */   long ARB_program_glDeleteProgramsARB_pointer;
/*      */   long ARB_program_glGenProgramsARB_pointer;
/*      */   long ARB_program_glProgramEnvParameter4fARB_pointer;
/*      */   long ARB_program_glProgramEnvParameter4dARB_pointer;
/*      */   long ARB_program_glProgramEnvParameter4fvARB_pointer;
/*      */   long ARB_program_glProgramEnvParameter4dvARB_pointer;
/*      */   long ARB_program_glProgramLocalParameter4fARB_pointer;
/*      */   long ARB_program_glProgramLocalParameter4dARB_pointer;
/*      */   long ARB_program_glProgramLocalParameter4fvARB_pointer;
/*      */   long ARB_program_glProgramLocalParameter4dvARB_pointer;
/*      */   long ARB_program_glGetProgramEnvParameterfvARB_pointer;
/*      */   long ARB_program_glGetProgramEnvParameterdvARB_pointer;
/*      */   long ARB_program_glGetProgramLocalParameterfvARB_pointer;
/*      */   long ARB_program_glGetProgramLocalParameterdvARB_pointer;
/*      */   long ARB_program_glGetProgramivARB_pointer;
/*      */   long ARB_program_glGetProgramStringARB_pointer;
/*      */   long ARB_program_glIsProgramARB_pointer;
/*      */   long ARB_provoking_vertex_glProvokingVertex_pointer;
/*      */   long ARB_sample_shading_glMinSampleShadingARB_pointer;
/*      */   long ARB_sampler_objects_glGenSamplers_pointer;
/*      */   long ARB_sampler_objects_glDeleteSamplers_pointer;
/*      */   long ARB_sampler_objects_glIsSampler_pointer;
/*      */   long ARB_sampler_objects_glBindSampler_pointer;
/*      */   long ARB_sampler_objects_glSamplerParameteri_pointer;
/*      */   long ARB_sampler_objects_glSamplerParameterf_pointer;
/*      */   long ARB_sampler_objects_glSamplerParameteriv_pointer;
/*      */   long ARB_sampler_objects_glSamplerParameterfv_pointer;
/*      */   long ARB_sampler_objects_glSamplerParameterIiv_pointer;
/*      */   long ARB_sampler_objects_glSamplerParameterIuiv_pointer;
/*      */   long ARB_sampler_objects_glGetSamplerParameteriv_pointer;
/*      */   long ARB_sampler_objects_glGetSamplerParameterfv_pointer;
/*      */   long ARB_sampler_objects_glGetSamplerParameterIiv_pointer;
/*      */   long ARB_sampler_objects_glGetSamplerParameterIuiv_pointer;
/*      */   long ARB_shader_objects_glDeleteObjectARB_pointer;
/*      */   long ARB_shader_objects_glGetHandleARB_pointer;
/*      */   long ARB_shader_objects_glDetachObjectARB_pointer;
/*      */   long ARB_shader_objects_glCreateShaderObjectARB_pointer;
/*      */   long ARB_shader_objects_glShaderSourceARB_pointer;
/*      */   long ARB_shader_objects_glCompileShaderARB_pointer;
/*      */   long ARB_shader_objects_glCreateProgramObjectARB_pointer;
/*      */   long ARB_shader_objects_glAttachObjectARB_pointer;
/*      */   long ARB_shader_objects_glLinkProgramARB_pointer;
/*      */   long ARB_shader_objects_glUseProgramObjectARB_pointer;
/*      */   long ARB_shader_objects_glValidateProgramARB_pointer;
/*      */   long ARB_shader_objects_glUniform1fARB_pointer;
/*      */   long ARB_shader_objects_glUniform2fARB_pointer;
/*      */   long ARB_shader_objects_glUniform3fARB_pointer;
/*      */   long ARB_shader_objects_glUniform4fARB_pointer;
/*      */   long ARB_shader_objects_glUniform1iARB_pointer;
/*      */   long ARB_shader_objects_glUniform2iARB_pointer;
/*      */   long ARB_shader_objects_glUniform3iARB_pointer;
/*      */   long ARB_shader_objects_glUniform4iARB_pointer;
/*      */   long ARB_shader_objects_glUniform1fvARB_pointer;
/*      */   long ARB_shader_objects_glUniform2fvARB_pointer;
/*      */   long ARB_shader_objects_glUniform3fvARB_pointer;
/*      */   long ARB_shader_objects_glUniform4fvARB_pointer;
/*      */   long ARB_shader_objects_glUniform1ivARB_pointer;
/*      */   long ARB_shader_objects_glUniform2ivARB_pointer;
/*      */   long ARB_shader_objects_glUniform3ivARB_pointer;
/*      */   long ARB_shader_objects_glUniform4ivARB_pointer;
/*      */   long ARB_shader_objects_glUniformMatrix2fvARB_pointer;
/*      */   long ARB_shader_objects_glUniformMatrix3fvARB_pointer;
/*      */   long ARB_shader_objects_glUniformMatrix4fvARB_pointer;
/*      */   long ARB_shader_objects_glGetObjectParameterfvARB_pointer;
/*      */   long ARB_shader_objects_glGetObjectParameterivARB_pointer;
/*      */   long ARB_shader_objects_glGetInfoLogARB_pointer;
/*      */   long ARB_shader_objects_glGetAttachedObjectsARB_pointer;
/*      */   long ARB_shader_objects_glGetUniformLocationARB_pointer;
/*      */   long ARB_shader_objects_glGetActiveUniformARB_pointer;
/*      */   long ARB_shader_objects_glGetUniformfvARB_pointer;
/*      */   long ARB_shader_objects_glGetUniformivARB_pointer;
/*      */   long ARB_shader_objects_glGetShaderSourceARB_pointer;
/*      */   long ARB_shader_subroutine_glGetSubroutineUniformLocation_pointer;
/*      */   long ARB_shader_subroutine_glGetSubroutineIndex_pointer;
/*      */   long ARB_shader_subroutine_glGetActiveSubroutineUniformiv_pointer;
/*      */   long ARB_shader_subroutine_glGetActiveSubroutineUniformName_pointer;
/*      */   long ARB_shader_subroutine_glGetActiveSubroutineName_pointer;
/*      */   long ARB_shader_subroutine_glUniformSubroutinesuiv_pointer;
/*      */   long ARB_shader_subroutine_glGetUniformSubroutineuiv_pointer;
/*      */   long ARB_shader_subroutine_glGetProgramStageiv_pointer;
/*      */   long ARB_shading_language_include_glNamedStringARB_pointer;
/*      */   long ARB_shading_language_include_glDeleteNamedStringARB_pointer;
/*      */   long ARB_shading_language_include_glCompileShaderIncludeARB_pointer;
/*      */   long ARB_shading_language_include_glIsNamedStringARB_pointer;
/*      */   long ARB_shading_language_include_glGetNamedStringARB_pointer;
/*      */   long ARB_shading_language_include_glGetNamedStringivARB_pointer;
/*      */   long ARB_sync_glFenceSync_pointer;
/*      */   long ARB_sync_glIsSync_pointer;
/*      */   long ARB_sync_glDeleteSync_pointer;
/*      */   long ARB_sync_glClientWaitSync_pointer;
/*      */   long ARB_sync_glWaitSync_pointer;
/*      */   long ARB_sync_glGetInteger64v_pointer;
/*      */   long ARB_sync_glGetSynciv_pointer;
/*      */   long ARB_tessellation_shader_glPatchParameteri_pointer;
/*      */   long ARB_tessellation_shader_glPatchParameterfv_pointer;
/*      */   long ARB_texture_buffer_object_glTexBufferARB_pointer;
/*      */   long ARB_texture_compression_glCompressedTexImage1DARB_pointer;
/*      */   long ARB_texture_compression_glCompressedTexImage2DARB_pointer;
/*      */   long ARB_texture_compression_glCompressedTexImage3DARB_pointer;
/*      */   long ARB_texture_compression_glCompressedTexSubImage1DARB_pointer;
/*      */   long ARB_texture_compression_glCompressedTexSubImage2DARB_pointer;
/*      */   long ARB_texture_compression_glCompressedTexSubImage3DARB_pointer;
/*      */   long ARB_texture_compression_glGetCompressedTexImageARB_pointer;
/*      */   long ARB_texture_multisample_glTexImage2DMultisample_pointer;
/*      */   long ARB_texture_multisample_glTexImage3DMultisample_pointer;
/*      */   long ARB_texture_multisample_glGetMultisamplefv_pointer;
/*      */   long ARB_texture_multisample_glSampleMaski_pointer;
/*      */   long ARB_timer_query_glQueryCounter_pointer;
/*      */   long ARB_timer_query_glGetQueryObjecti64v_pointer;
/*      */   long ARB_timer_query_glGetQueryObjectui64v_pointer;
/*      */   long ARB_transform_feedback2_glBindTransformFeedback_pointer;
/*      */   long ARB_transform_feedback2_glDeleteTransformFeedbacks_pointer;
/*      */   long ARB_transform_feedback2_glGenTransformFeedbacks_pointer;
/*      */   long ARB_transform_feedback2_glIsTransformFeedback_pointer;
/*      */   long ARB_transform_feedback2_glPauseTransformFeedback_pointer;
/*      */   long ARB_transform_feedback2_glResumeTransformFeedback_pointer;
/*      */   long ARB_transform_feedback2_glDrawTransformFeedback_pointer;
/*      */   long ARB_transform_feedback3_glDrawTransformFeedbackStream_pointer;
/*      */   long ARB_transform_feedback3_glBeginQueryIndexed_pointer;
/*      */   long ARB_transform_feedback3_glEndQueryIndexed_pointer;
/*      */   long ARB_transform_feedback3_glGetQueryIndexediv_pointer;
/*      */   long ARB_transpose_matrix_glLoadTransposeMatrixfARB_pointer;
/*      */   long ARB_transpose_matrix_glMultTransposeMatrixfARB_pointer;
/*      */   long ARB_uniform_buffer_object_glGetUniformIndices_pointer;
/*      */   long ARB_uniform_buffer_object_glGetActiveUniformsiv_pointer;
/*      */   long ARB_uniform_buffer_object_glGetActiveUniformName_pointer;
/*      */   long ARB_uniform_buffer_object_glGetUniformBlockIndex_pointer;
/*      */   long ARB_uniform_buffer_object_glGetActiveUniformBlockiv_pointer;
/*      */   long ARB_uniform_buffer_object_glGetActiveUniformBlockName_pointer;
/*      */   long ARB_uniform_buffer_object_glBindBufferRange_pointer;
/*      */   long ARB_uniform_buffer_object_glBindBufferBase_pointer;
/*      */   long ARB_uniform_buffer_object_glGetIntegeri_v_pointer;
/*      */   long ARB_uniform_buffer_object_glUniformBlockBinding_pointer;
/*      */   long ARB_vertex_array_object_glBindVertexArray_pointer;
/*      */   long ARB_vertex_array_object_glDeleteVertexArrays_pointer;
/*      */   long ARB_vertex_array_object_glGenVertexArrays_pointer;
/*      */   long ARB_vertex_array_object_glIsVertexArray_pointer;
/*      */   long ARB_vertex_blend_glWeightbvARB_pointer;
/*      */   long ARB_vertex_blend_glWeightsvARB_pointer;
/*      */   long ARB_vertex_blend_glWeightivARB_pointer;
/*      */   long ARB_vertex_blend_glWeightfvARB_pointer;
/*      */   long ARB_vertex_blend_glWeightdvARB_pointer;
/*      */   long ARB_vertex_blend_glWeightubvARB_pointer;
/*      */   long ARB_vertex_blend_glWeightusvARB_pointer;
/*      */   long ARB_vertex_blend_glWeightuivARB_pointer;
/*      */   long ARB_vertex_blend_glWeightPointerARB_pointer;
/*      */   long ARB_vertex_blend_glVertexBlendARB_pointer;
/*      */   long ARB_vertex_program_glVertexAttrib1sARB_pointer;
/*      */   long ARB_vertex_program_glVertexAttrib1fARB_pointer;
/*      */   long ARB_vertex_program_glVertexAttrib1dARB_pointer;
/*      */   long ARB_vertex_program_glVertexAttrib2sARB_pointer;
/*      */   long ARB_vertex_program_glVertexAttrib2fARB_pointer;
/*      */   long ARB_vertex_program_glVertexAttrib2dARB_pointer;
/*      */   long ARB_vertex_program_glVertexAttrib3sARB_pointer;
/*      */   long ARB_vertex_program_glVertexAttrib3fARB_pointer;
/*      */   long ARB_vertex_program_glVertexAttrib3dARB_pointer;
/*      */   long ARB_vertex_program_glVertexAttrib4sARB_pointer;
/*      */   long ARB_vertex_program_glVertexAttrib4fARB_pointer;
/*      */   long ARB_vertex_program_glVertexAttrib4dARB_pointer;
/*      */   long ARB_vertex_program_glVertexAttrib4NubARB_pointer;
/*      */   long ARB_vertex_program_glVertexAttribPointerARB_pointer;
/*      */   long ARB_vertex_program_glEnableVertexAttribArrayARB_pointer;
/*      */   long ARB_vertex_program_glDisableVertexAttribArrayARB_pointer;
/*      */   long ARB_vertex_program_glGetVertexAttribfvARB_pointer;
/*      */   long ARB_vertex_program_glGetVertexAttribdvARB_pointer;
/*      */   long ARB_vertex_program_glGetVertexAttribivARB_pointer;
/*      */   long ARB_vertex_program_glGetVertexAttribPointervARB_pointer;
/*      */   long ARB_vertex_shader_glVertexAttrib1sARB_pointer;
/*      */   long ARB_vertex_shader_glVertexAttrib1fARB_pointer;
/*      */   long ARB_vertex_shader_glVertexAttrib1dARB_pointer;
/*      */   long ARB_vertex_shader_glVertexAttrib2sARB_pointer;
/*      */   long ARB_vertex_shader_glVertexAttrib2fARB_pointer;
/*      */   long ARB_vertex_shader_glVertexAttrib2dARB_pointer;
/*      */   long ARB_vertex_shader_glVertexAttrib3sARB_pointer;
/*      */   long ARB_vertex_shader_glVertexAttrib3fARB_pointer;
/*      */   long ARB_vertex_shader_glVertexAttrib3dARB_pointer;
/*      */   long ARB_vertex_shader_glVertexAttrib4sARB_pointer;
/*      */   long ARB_vertex_shader_glVertexAttrib4fARB_pointer;
/*      */   long ARB_vertex_shader_glVertexAttrib4dARB_pointer;
/*      */   long ARB_vertex_shader_glVertexAttrib4NubARB_pointer;
/*      */   long ARB_vertex_shader_glVertexAttribPointerARB_pointer;
/*      */   long ARB_vertex_shader_glEnableVertexAttribArrayARB_pointer;
/*      */   long ARB_vertex_shader_glDisableVertexAttribArrayARB_pointer;
/*      */   long ARB_vertex_shader_glBindAttribLocationARB_pointer;
/*      */   long ARB_vertex_shader_glGetActiveAttribARB_pointer;
/*      */   long ARB_vertex_shader_glGetAttribLocationARB_pointer;
/*      */   long ARB_vertex_shader_glGetVertexAttribfvARB_pointer;
/*      */   long ARB_vertex_shader_glGetVertexAttribdvARB_pointer;
/*      */   long ARB_vertex_shader_glGetVertexAttribivARB_pointer;
/*      */   long ARB_vertex_shader_glGetVertexAttribPointervARB_pointer;
/*      */   long ARB_vertex_type_2_10_10_10_rev_glVertexP2ui_pointer;
/*      */   long ARB_vertex_type_2_10_10_10_rev_glVertexP3ui_pointer;
/*      */   long ARB_vertex_type_2_10_10_10_rev_glVertexP4ui_pointer;
/*      */   long ARB_vertex_type_2_10_10_10_rev_glVertexP2uiv_pointer;
/*      */   long ARB_vertex_type_2_10_10_10_rev_glVertexP3uiv_pointer;
/*      */   long ARB_vertex_type_2_10_10_10_rev_glVertexP4uiv_pointer;
/*      */   long ARB_vertex_type_2_10_10_10_rev_glTexCoordP1ui_pointer;
/*      */   long ARB_vertex_type_2_10_10_10_rev_glTexCoordP2ui_pointer;
/*      */   long ARB_vertex_type_2_10_10_10_rev_glTexCoordP3ui_pointer;
/*      */   long ARB_vertex_type_2_10_10_10_rev_glTexCoordP4ui_pointer;
/*      */   long ARB_vertex_type_2_10_10_10_rev_glTexCoordP1uiv_pointer;
/*      */   long ARB_vertex_type_2_10_10_10_rev_glTexCoordP2uiv_pointer;
/*      */   long ARB_vertex_type_2_10_10_10_rev_glTexCoordP3uiv_pointer;
/*      */   long ARB_vertex_type_2_10_10_10_rev_glTexCoordP4uiv_pointer;
/*      */   long ARB_vertex_type_2_10_10_10_rev_glMultiTexCoordP1ui_pointer;
/*      */   long ARB_vertex_type_2_10_10_10_rev_glMultiTexCoordP2ui_pointer;
/*      */   long ARB_vertex_type_2_10_10_10_rev_glMultiTexCoordP3ui_pointer;
/*      */   long ARB_vertex_type_2_10_10_10_rev_glMultiTexCoordP4ui_pointer;
/*      */   long ARB_vertex_type_2_10_10_10_rev_glMultiTexCoordP1uiv_pointer;
/*      */   long ARB_vertex_type_2_10_10_10_rev_glMultiTexCoordP2uiv_pointer;
/*      */   long ARB_vertex_type_2_10_10_10_rev_glMultiTexCoordP3uiv_pointer;
/*      */   long ARB_vertex_type_2_10_10_10_rev_glMultiTexCoordP4uiv_pointer;
/*      */   long ARB_vertex_type_2_10_10_10_rev_glNormalP3ui_pointer;
/*      */   long ARB_vertex_type_2_10_10_10_rev_glNormalP3uiv_pointer;
/*      */   long ARB_vertex_type_2_10_10_10_rev_glColorP3ui_pointer;
/*      */   long ARB_vertex_type_2_10_10_10_rev_glColorP4ui_pointer;
/*      */   long ARB_vertex_type_2_10_10_10_rev_glColorP3uiv_pointer;
/*      */   long ARB_vertex_type_2_10_10_10_rev_glColorP4uiv_pointer;
/*      */   long ARB_vertex_type_2_10_10_10_rev_glSecondaryColorP3ui_pointer;
/*      */   long ARB_vertex_type_2_10_10_10_rev_glSecondaryColorP3uiv_pointer;
/*      */   long ARB_vertex_type_2_10_10_10_rev_glVertexAttribP1ui_pointer;
/*      */   long ARB_vertex_type_2_10_10_10_rev_glVertexAttribP2ui_pointer;
/*      */   long ARB_vertex_type_2_10_10_10_rev_glVertexAttribP3ui_pointer;
/*      */   long ARB_vertex_type_2_10_10_10_rev_glVertexAttribP4ui_pointer;
/*      */   long ARB_vertex_type_2_10_10_10_rev_glVertexAttribP1uiv_pointer;
/*      */   long ARB_vertex_type_2_10_10_10_rev_glVertexAttribP2uiv_pointer;
/*      */   long ARB_vertex_type_2_10_10_10_rev_glVertexAttribP3uiv_pointer;
/*      */   long ARB_vertex_type_2_10_10_10_rev_glVertexAttribP4uiv_pointer;
/*      */   long ARB_window_pos_glWindowPos2fARB_pointer;
/*      */   long ARB_window_pos_glWindowPos2dARB_pointer;
/*      */   long ARB_window_pos_glWindowPos2iARB_pointer;
/*      */   long ARB_window_pos_glWindowPos2sARB_pointer;
/*      */   long ARB_window_pos_glWindowPos3fARB_pointer;
/*      */   long ARB_window_pos_glWindowPos3dARB_pointer;
/*      */   long ARB_window_pos_glWindowPos3iARB_pointer;
/*      */   long ARB_window_pos_glWindowPos3sARB_pointer;
/*      */   long ATI_draw_buffers_glDrawBuffersATI_pointer;
/*      */   long ATI_element_array_glElementPointerATI_pointer;
/*      */   long ATI_element_array_glDrawElementArrayATI_pointer;
/*      */   long ATI_element_array_glDrawRangeElementArrayATI_pointer;
/*      */   long ATI_envmap_bumpmap_glTexBumpParameterfvATI_pointer;
/*      */   long ATI_envmap_bumpmap_glTexBumpParameterivATI_pointer;
/*      */   long ATI_envmap_bumpmap_glGetTexBumpParameterfvATI_pointer;
/*      */   long ATI_envmap_bumpmap_glGetTexBumpParameterivATI_pointer;
/*      */   long ATI_fragment_shader_glGenFragmentShadersATI_pointer;
/*      */   long ATI_fragment_shader_glBindFragmentShaderATI_pointer;
/*      */   long ATI_fragment_shader_glDeleteFragmentShaderATI_pointer;
/*      */   long ATI_fragment_shader_glBeginFragmentShaderATI_pointer;
/*      */   long ATI_fragment_shader_glEndFragmentShaderATI_pointer;
/*      */   long ATI_fragment_shader_glPassTexCoordATI_pointer;
/*      */   long ATI_fragment_shader_glSampleMapATI_pointer;
/*      */   long ATI_fragment_shader_glColorFragmentOp1ATI_pointer;
/*      */   long ATI_fragment_shader_glColorFragmentOp2ATI_pointer;
/*      */   long ATI_fragment_shader_glColorFragmentOp3ATI_pointer;
/*      */   long ATI_fragment_shader_glAlphaFragmentOp1ATI_pointer;
/*      */   long ATI_fragment_shader_glAlphaFragmentOp2ATI_pointer;
/*      */   long ATI_fragment_shader_glAlphaFragmentOp3ATI_pointer;
/*      */   long ATI_fragment_shader_glSetFragmentShaderConstantATI_pointer;
/*      */   long ATI_map_object_buffer_glMapObjectBufferATI_pointer;
/*      */   long ATI_map_object_buffer_glUnmapObjectBufferATI_pointer;
/*      */   long ATI_pn_triangles_glPNTrianglesfATI_pointer;
/*      */   long ATI_pn_triangles_glPNTrianglesiATI_pointer;
/*      */   long ATI_separate_stencil_glStencilOpSeparateATI_pointer;
/*      */   long ATI_separate_stencil_glStencilFuncSeparateATI_pointer;
/*      */   long ATI_vertex_array_object_glNewObjectBufferATI_pointer;
/*      */   long ATI_vertex_array_object_glIsObjectBufferATI_pointer;
/*      */   long ATI_vertex_array_object_glUpdateObjectBufferATI_pointer;
/*      */   long ATI_vertex_array_object_glGetObjectBufferfvATI_pointer;
/*      */   long ATI_vertex_array_object_glGetObjectBufferivATI_pointer;
/*      */   long ATI_vertex_array_object_glFreeObjectBufferATI_pointer;
/*      */   long ATI_vertex_array_object_glArrayObjectATI_pointer;
/*      */   long ATI_vertex_array_object_glGetArrayObjectfvATI_pointer;
/*      */   long ATI_vertex_array_object_glGetArrayObjectivATI_pointer;
/*      */   long ATI_vertex_array_object_glVariantArrayObjectATI_pointer;
/*      */   long ATI_vertex_array_object_glGetVariantArrayObjectfvATI_pointer;
/*      */   long ATI_vertex_array_object_glGetVariantArrayObjectivATI_pointer;
/*      */   long ATI_vertex_attrib_array_object_glVertexAttribArrayObjectATI_pointer;
/*      */   long ATI_vertex_attrib_array_object_glGetVertexAttribArrayObjectfvATI_pointer;
/*      */   long ATI_vertex_attrib_array_object_glGetVertexAttribArrayObjectivATI_pointer;
/*      */   long ATI_vertex_streams_glVertexStream2fATI_pointer;
/*      */   long ATI_vertex_streams_glVertexStream2dATI_pointer;
/*      */   long ATI_vertex_streams_glVertexStream2iATI_pointer;
/*      */   long ATI_vertex_streams_glVertexStream2sATI_pointer;
/*      */   long ATI_vertex_streams_glVertexStream3fATI_pointer;
/*      */   long ATI_vertex_streams_glVertexStream3dATI_pointer;
/*      */   long ATI_vertex_streams_glVertexStream3iATI_pointer;
/*      */   long ATI_vertex_streams_glVertexStream3sATI_pointer;
/*      */   long ATI_vertex_streams_glVertexStream4fATI_pointer;
/*      */   long ATI_vertex_streams_glVertexStream4dATI_pointer;
/*      */   long ATI_vertex_streams_glVertexStream4iATI_pointer;
/*      */   long ATI_vertex_streams_glVertexStream4sATI_pointer;
/*      */   long ATI_vertex_streams_glNormalStream3bATI_pointer;
/*      */   long ATI_vertex_streams_glNormalStream3fATI_pointer;
/*      */   long ATI_vertex_streams_glNormalStream3dATI_pointer;
/*      */   long ATI_vertex_streams_glNormalStream3iATI_pointer;
/*      */   long ATI_vertex_streams_glNormalStream3sATI_pointer;
/*      */   long ATI_vertex_streams_glClientActiveVertexStreamATI_pointer;
/*      */   long ATI_vertex_streams_glVertexBlendEnvfATI_pointer;
/*      */   long ATI_vertex_streams_glVertexBlendEnviATI_pointer;
/*      */   long EXT_bindable_uniform_glUniformBufferEXT_pointer;
/*      */   long EXT_bindable_uniform_glGetUniformBufferSizeEXT_pointer;
/*      */   long EXT_bindable_uniform_glGetUniformOffsetEXT_pointer;
/*      */   long EXT_blend_color_glBlendColorEXT_pointer;
/*      */   long EXT_blend_equation_separate_glBlendEquationSeparateEXT_pointer;
/*      */   long EXT_blend_func_separate_glBlendFuncSeparateEXT_pointer;
/*      */   long EXT_blend_minmax_glBlendEquationEXT_pointer;
/*      */   long EXT_compiled_vertex_array_glLockArraysEXT_pointer;
/*      */   long EXT_compiled_vertex_array_glUnlockArraysEXT_pointer;
/*      */   long EXT_depth_bounds_test_glDepthBoundsEXT_pointer;
/*      */   long EXT_direct_state_access_glClientAttribDefaultEXT_pointer;
/*      */   long EXT_direct_state_access_glPushClientAttribDefaultEXT_pointer;
/*      */   long EXT_direct_state_access_glMatrixLoadfEXT_pointer;
/*      */   long EXT_direct_state_access_glMatrixLoaddEXT_pointer;
/*      */   long EXT_direct_state_access_glMatrixMultfEXT_pointer;
/*      */   long EXT_direct_state_access_glMatrixMultdEXT_pointer;
/*      */   long EXT_direct_state_access_glMatrixLoadIdentityEXT_pointer;
/*      */   long EXT_direct_state_access_glMatrixRotatefEXT_pointer;
/*      */   long EXT_direct_state_access_glMatrixRotatedEXT_pointer;
/*      */   long EXT_direct_state_access_glMatrixScalefEXT_pointer;
/*      */   long EXT_direct_state_access_glMatrixScaledEXT_pointer;
/*      */   long EXT_direct_state_access_glMatrixTranslatefEXT_pointer;
/*      */   long EXT_direct_state_access_glMatrixTranslatedEXT_pointer;
/*      */   long EXT_direct_state_access_glMatrixOrthoEXT_pointer;
/*      */   long EXT_direct_state_access_glMatrixFrustumEXT_pointer;
/*      */   long EXT_direct_state_access_glMatrixPushEXT_pointer;
/*      */   long EXT_direct_state_access_glMatrixPopEXT_pointer;
/*      */   long EXT_direct_state_access_glTextureParameteriEXT_pointer;
/*      */   long EXT_direct_state_access_glTextureParameterivEXT_pointer;
/*      */   long EXT_direct_state_access_glTextureParameterfEXT_pointer;
/*      */   long EXT_direct_state_access_glTextureParameterfvEXT_pointer;
/*      */   long EXT_direct_state_access_glTextureImage1DEXT_pointer;
/*      */   long EXT_direct_state_access_glTextureImage2DEXT_pointer;
/*      */   long EXT_direct_state_access_glTextureSubImage1DEXT_pointer;
/*      */   long EXT_direct_state_access_glTextureSubImage2DEXT_pointer;
/*      */   long EXT_direct_state_access_glCopyTextureImage1DEXT_pointer;
/*      */   long EXT_direct_state_access_glCopyTextureImage2DEXT_pointer;
/*      */   long EXT_direct_state_access_glCopyTextureSubImage1DEXT_pointer;
/*      */   long EXT_direct_state_access_glCopyTextureSubImage2DEXT_pointer;
/*      */   long EXT_direct_state_access_glGetTextureImageEXT_pointer;
/*      */   long EXT_direct_state_access_glGetTextureParameterfvEXT_pointer;
/*      */   long EXT_direct_state_access_glGetTextureParameterivEXT_pointer;
/*      */   long EXT_direct_state_access_glGetTextureLevelParameterfvEXT_pointer;
/*      */   long EXT_direct_state_access_glGetTextureLevelParameterivEXT_pointer;
/*      */   long EXT_direct_state_access_glTextureImage3DEXT_pointer;
/*      */   long EXT_direct_state_access_glTextureSubImage3DEXT_pointer;
/*      */   long EXT_direct_state_access_glCopyTextureSubImage3DEXT_pointer;
/*      */   long EXT_direct_state_access_glBindMultiTextureEXT_pointer;
/*      */   long EXT_direct_state_access_glMultiTexCoordPointerEXT_pointer;
/*      */   long EXT_direct_state_access_glMultiTexEnvfEXT_pointer;
/*      */   long EXT_direct_state_access_glMultiTexEnvfvEXT_pointer;
/*      */   long EXT_direct_state_access_glMultiTexEnviEXT_pointer;
/*      */   long EXT_direct_state_access_glMultiTexEnvivEXT_pointer;
/*      */   long EXT_direct_state_access_glMultiTexGendEXT_pointer;
/*      */   long EXT_direct_state_access_glMultiTexGendvEXT_pointer;
/*      */   long EXT_direct_state_access_glMultiTexGenfEXT_pointer;
/*      */   long EXT_direct_state_access_glMultiTexGenfvEXT_pointer;
/*      */   long EXT_direct_state_access_glMultiTexGeniEXT_pointer;
/*      */   long EXT_direct_state_access_glMultiTexGenivEXT_pointer;
/*      */   long EXT_direct_state_access_glGetMultiTexEnvfvEXT_pointer;
/*      */   long EXT_direct_state_access_glGetMultiTexEnvivEXT_pointer;
/*      */   long EXT_direct_state_access_glGetMultiTexGendvEXT_pointer;
/*      */   long EXT_direct_state_access_glGetMultiTexGenfvEXT_pointer;
/*      */   long EXT_direct_state_access_glGetMultiTexGenivEXT_pointer;
/*      */   long EXT_direct_state_access_glMultiTexParameteriEXT_pointer;
/*      */   long EXT_direct_state_access_glMultiTexParameterivEXT_pointer;
/*      */   long EXT_direct_state_access_glMultiTexParameterfEXT_pointer;
/*      */   long EXT_direct_state_access_glMultiTexParameterfvEXT_pointer;
/*      */   long EXT_direct_state_access_glMultiTexImage1DEXT_pointer;
/*      */   long EXT_direct_state_access_glMultiTexImage2DEXT_pointer;
/*      */   long EXT_direct_state_access_glMultiTexSubImage1DEXT_pointer;
/*      */   long EXT_direct_state_access_glMultiTexSubImage2DEXT_pointer;
/*      */   long EXT_direct_state_access_glCopyMultiTexImage1DEXT_pointer;
/*      */   long EXT_direct_state_access_glCopyMultiTexImage2DEXT_pointer;
/*      */   long EXT_direct_state_access_glCopyMultiTexSubImage1DEXT_pointer;
/*      */   long EXT_direct_state_access_glCopyMultiTexSubImage2DEXT_pointer;
/*      */   long EXT_direct_state_access_glGetMultiTexImageEXT_pointer;
/*      */   long EXT_direct_state_access_glGetMultiTexParameterfvEXT_pointer;
/*      */   long EXT_direct_state_access_glGetMultiTexParameterivEXT_pointer;
/*      */   long EXT_direct_state_access_glGetMultiTexLevelParameterfvEXT_pointer;
/*      */   long EXT_direct_state_access_glGetMultiTexLevelParameterivEXT_pointer;
/*      */   long EXT_direct_state_access_glMultiTexImage3DEXT_pointer;
/*      */   long EXT_direct_state_access_glMultiTexSubImage3DEXT_pointer;
/*      */   long EXT_direct_state_access_glCopyMultiTexSubImage3DEXT_pointer;
/*      */   long EXT_direct_state_access_glEnableClientStateIndexedEXT_pointer;
/*      */   long EXT_direct_state_access_glDisableClientStateIndexedEXT_pointer;
/*      */   long EXT_direct_state_access_glEnableClientStateiEXT_pointer;
/*      */   long EXT_direct_state_access_glDisableClientStateiEXT_pointer;
/*      */   long EXT_direct_state_access_glGetFloatIndexedvEXT_pointer;
/*      */   long EXT_direct_state_access_glGetDoubleIndexedvEXT_pointer;
/*      */   long EXT_direct_state_access_glGetPointerIndexedvEXT_pointer;
/*      */   long EXT_direct_state_access_glGetFloati_vEXT_pointer;
/*      */   long EXT_direct_state_access_glGetDoublei_vEXT_pointer;
/*      */   long EXT_direct_state_access_glGetPointeri_vEXT_pointer;
/*      */   long EXT_direct_state_access_glEnableIndexedEXT_pointer;
/*      */   long EXT_direct_state_access_glDisableIndexedEXT_pointer;
/*      */   long EXT_direct_state_access_glIsEnabledIndexedEXT_pointer;
/*      */   long EXT_direct_state_access_glGetIntegerIndexedvEXT_pointer;
/*      */   long EXT_direct_state_access_glGetBooleanIndexedvEXT_pointer;
/*      */   long EXT_direct_state_access_glNamedProgramStringEXT_pointer;
/*      */   long EXT_direct_state_access_glNamedProgramLocalParameter4dEXT_pointer;
/*      */   long EXT_direct_state_access_glNamedProgramLocalParameter4dvEXT_pointer;
/*      */   long EXT_direct_state_access_glNamedProgramLocalParameter4fEXT_pointer;
/*      */   long EXT_direct_state_access_glNamedProgramLocalParameter4fvEXT_pointer;
/*      */   long EXT_direct_state_access_glGetNamedProgramLocalParameterdvEXT_pointer;
/*      */   long EXT_direct_state_access_glGetNamedProgramLocalParameterfvEXT_pointer;
/*      */   long EXT_direct_state_access_glGetNamedProgramivEXT_pointer;
/*      */   long EXT_direct_state_access_glGetNamedProgramStringEXT_pointer;
/*      */   long EXT_direct_state_access_glCompressedTextureImage3DEXT_pointer;
/*      */   long EXT_direct_state_access_glCompressedTextureImage2DEXT_pointer;
/*      */   long EXT_direct_state_access_glCompressedTextureImage1DEXT_pointer;
/*      */   long EXT_direct_state_access_glCompressedTextureSubImage3DEXT_pointer;
/*      */   long EXT_direct_state_access_glCompressedTextureSubImage2DEXT_pointer;
/*      */   long EXT_direct_state_access_glCompressedTextureSubImage1DEXT_pointer;
/*      */   long EXT_direct_state_access_glGetCompressedTextureImageEXT_pointer;
/*      */   long EXT_direct_state_access_glCompressedMultiTexImage3DEXT_pointer;
/*      */   long EXT_direct_state_access_glCompressedMultiTexImage2DEXT_pointer;
/*      */   long EXT_direct_state_access_glCompressedMultiTexImage1DEXT_pointer;
/*      */   long EXT_direct_state_access_glCompressedMultiTexSubImage3DEXT_pointer;
/*      */   long EXT_direct_state_access_glCompressedMultiTexSubImage2DEXT_pointer;
/*      */   long EXT_direct_state_access_glCompressedMultiTexSubImage1DEXT_pointer;
/*      */   long EXT_direct_state_access_glGetCompressedMultiTexImageEXT_pointer;
/*      */   long EXT_direct_state_access_glGetCompressedTexImage_pointer;
/*      */   long EXT_direct_state_access_glMatrixLoadTransposefEXT_pointer;
/*      */   long EXT_direct_state_access_glMatrixLoadTransposedEXT_pointer;
/*      */   long EXT_direct_state_access_glMatrixMultTransposefEXT_pointer;
/*      */   long EXT_direct_state_access_glMatrixMultTransposedEXT_pointer;
/*      */   long EXT_direct_state_access_glNamedBufferDataEXT_pointer;
/*      */   long EXT_direct_state_access_glNamedBufferSubDataEXT_pointer;
/*      */   long EXT_direct_state_access_glMapNamedBufferEXT_pointer;
/*      */   long EXT_direct_state_access_glUnmapNamedBufferEXT_pointer;
/*      */   long EXT_direct_state_access_glGetNamedBufferParameterivEXT_pointer;
/*      */   long EXT_direct_state_access_glGetNamedBufferPointervEXT_pointer;
/*      */   long EXT_direct_state_access_glGetNamedBufferSubDataEXT_pointer;
/*      */   long EXT_direct_state_access_glProgramUniform1fEXT_pointer;
/*      */   long EXT_direct_state_access_glProgramUniform2fEXT_pointer;
/*      */   long EXT_direct_state_access_glProgramUniform3fEXT_pointer;
/*      */   long EXT_direct_state_access_glProgramUniform4fEXT_pointer;
/*      */   long EXT_direct_state_access_glProgramUniform1iEXT_pointer;
/*      */   long EXT_direct_state_access_glProgramUniform2iEXT_pointer;
/*      */   long EXT_direct_state_access_glProgramUniform3iEXT_pointer;
/*      */   long EXT_direct_state_access_glProgramUniform4iEXT_pointer;
/*      */   long EXT_direct_state_access_glProgramUniform1fvEXT_pointer;
/*      */   long EXT_direct_state_access_glProgramUniform2fvEXT_pointer;
/*      */   long EXT_direct_state_access_glProgramUniform3fvEXT_pointer;
/*      */   long EXT_direct_state_access_glProgramUniform4fvEXT_pointer;
/*      */   long EXT_direct_state_access_glProgramUniform1ivEXT_pointer;
/*      */   long EXT_direct_state_access_glProgramUniform2ivEXT_pointer;
/*      */   long EXT_direct_state_access_glProgramUniform3ivEXT_pointer;
/*      */   long EXT_direct_state_access_glProgramUniform4ivEXT_pointer;
/*      */   long EXT_direct_state_access_glProgramUniformMatrix2fvEXT_pointer;
/*      */   long EXT_direct_state_access_glProgramUniformMatrix3fvEXT_pointer;
/*      */   long EXT_direct_state_access_glProgramUniformMatrix4fvEXT_pointer;
/*      */   long EXT_direct_state_access_glProgramUniformMatrix2x3fvEXT_pointer;
/*      */   long EXT_direct_state_access_glProgramUniformMatrix3x2fvEXT_pointer;
/*      */   long EXT_direct_state_access_glProgramUniformMatrix2x4fvEXT_pointer;
/*      */   long EXT_direct_state_access_glProgramUniformMatrix4x2fvEXT_pointer;
/*      */   long EXT_direct_state_access_glProgramUniformMatrix3x4fvEXT_pointer;
/*      */   long EXT_direct_state_access_glProgramUniformMatrix4x3fvEXT_pointer;
/*      */   long EXT_direct_state_access_glTextureBufferEXT_pointer;
/*      */   long EXT_direct_state_access_glMultiTexBufferEXT_pointer;
/*      */   long EXT_direct_state_access_glTextureParameterIivEXT_pointer;
/*      */   long EXT_direct_state_access_glTextureParameterIuivEXT_pointer;
/*      */   long EXT_direct_state_access_glGetTextureParameterIivEXT_pointer;
/*      */   long EXT_direct_state_access_glGetTextureParameterIuivEXT_pointer;
/*      */   long EXT_direct_state_access_glMultiTexParameterIivEXT_pointer;
/*      */   long EXT_direct_state_access_glMultiTexParameterIuivEXT_pointer;
/*      */   long EXT_direct_state_access_glGetMultiTexParameterIivEXT_pointer;
/*      */   long EXT_direct_state_access_glGetMultiTexParameterIuivEXT_pointer;
/*      */   long EXT_direct_state_access_glProgramUniform1uiEXT_pointer;
/*      */   long EXT_direct_state_access_glProgramUniform2uiEXT_pointer;
/*      */   long EXT_direct_state_access_glProgramUniform3uiEXT_pointer;
/*      */   long EXT_direct_state_access_glProgramUniform4uiEXT_pointer;
/*      */   long EXT_direct_state_access_glProgramUniform1uivEXT_pointer;
/*      */   long EXT_direct_state_access_glProgramUniform2uivEXT_pointer;
/*      */   long EXT_direct_state_access_glProgramUniform3uivEXT_pointer;
/*      */   long EXT_direct_state_access_glProgramUniform4uivEXT_pointer;
/*      */   long EXT_direct_state_access_glNamedProgramLocalParameters4fvEXT_pointer;
/*      */   long EXT_direct_state_access_glNamedProgramLocalParameterI4iEXT_pointer;
/*      */   long EXT_direct_state_access_glNamedProgramLocalParameterI4ivEXT_pointer;
/*      */   long EXT_direct_state_access_glNamedProgramLocalParametersI4ivEXT_pointer;
/*      */   long EXT_direct_state_access_glNamedProgramLocalParameterI4uiEXT_pointer;
/*      */   long EXT_direct_state_access_glNamedProgramLocalParameterI4uivEXT_pointer;
/*      */   long EXT_direct_state_access_glNamedProgramLocalParametersI4uivEXT_pointer;
/*      */   long EXT_direct_state_access_glGetNamedProgramLocalParameterIivEXT_pointer;
/*      */   long EXT_direct_state_access_glGetNamedProgramLocalParameterIuivEXT_pointer;
/*      */   long EXT_direct_state_access_glNamedRenderbufferStorageEXT_pointer;
/*      */   long EXT_direct_state_access_glGetNamedRenderbufferParameterivEXT_pointer;
/*      */   long EXT_direct_state_access_glNamedRenderbufferStorageMultisampleEXT_pointer;
/*      */   long EXT_direct_state_access_glNamedRenderbufferStorageMultisampleCoverageEXT_pointer;
/*      */   long EXT_direct_state_access_glCheckNamedFramebufferStatusEXT_pointer;
/*      */   long EXT_direct_state_access_glNamedFramebufferTexture1DEXT_pointer;
/*      */   long EXT_direct_state_access_glNamedFramebufferTexture2DEXT_pointer;
/*      */   long EXT_direct_state_access_glNamedFramebufferTexture3DEXT_pointer;
/*      */   long EXT_direct_state_access_glNamedFramebufferRenderbufferEXT_pointer;
/*      */   long EXT_direct_state_access_glGetNamedFramebufferAttachmentParameterivEXT_pointer;
/*      */   long EXT_direct_state_access_glGenerateTextureMipmapEXT_pointer;
/*      */   long EXT_direct_state_access_glGenerateMultiTexMipmapEXT_pointer;
/*      */   long EXT_direct_state_access_glFramebufferDrawBufferEXT_pointer;
/*      */   long EXT_direct_state_access_glFramebufferDrawBuffersEXT_pointer;
/*      */   long EXT_direct_state_access_glFramebufferReadBufferEXT_pointer;
/*      */   long EXT_direct_state_access_glGetFramebufferParameterivEXT_pointer;
/*      */   long EXT_direct_state_access_glNamedCopyBufferSubDataEXT_pointer;
/*      */   long EXT_direct_state_access_glNamedFramebufferTextureEXT_pointer;
/*      */   long EXT_direct_state_access_glNamedFramebufferTextureLayerEXT_pointer;
/*      */   long EXT_direct_state_access_glNamedFramebufferTextureFaceEXT_pointer;
/*      */   long EXT_direct_state_access_glTextureRenderbufferEXT_pointer;
/*      */   long EXT_direct_state_access_glMultiTexRenderbufferEXT_pointer;
/*      */   long EXT_direct_state_access_glVertexArrayVertexOffsetEXT_pointer;
/*      */   long EXT_direct_state_access_glVertexArrayColorOffsetEXT_pointer;
/*      */   long EXT_direct_state_access_glVertexArrayEdgeFlagOffsetEXT_pointer;
/*      */   long EXT_direct_state_access_glVertexArrayIndexOffsetEXT_pointer;
/*      */   long EXT_direct_state_access_glVertexArrayNormalOffsetEXT_pointer;
/*      */   long EXT_direct_state_access_glVertexArrayTexCoordOffsetEXT_pointer;
/*      */   long EXT_direct_state_access_glVertexArrayMultiTexCoordOffsetEXT_pointer;
/*      */   long EXT_direct_state_access_glVertexArrayFogCoordOffsetEXT_pointer;
/*      */   long EXT_direct_state_access_glVertexArraySecondaryColorOffsetEXT_pointer;
/*      */   long EXT_direct_state_access_glVertexArrayVertexAttribOffsetEXT_pointer;
/*      */   long EXT_direct_state_access_glVertexArrayVertexAttribIOffsetEXT_pointer;
/*      */   long EXT_direct_state_access_glEnableVertexArrayEXT_pointer;
/*      */   long EXT_direct_state_access_glDisableVertexArrayEXT_pointer;
/*      */   long EXT_direct_state_access_glEnableVertexArrayAttribEXT_pointer;
/*      */   long EXT_direct_state_access_glDisableVertexArrayAttribEXT_pointer;
/*      */   long EXT_direct_state_access_glGetVertexArrayIntegervEXT_pointer;
/*      */   long EXT_direct_state_access_glGetVertexArrayPointervEXT_pointer;
/*      */   long EXT_direct_state_access_glGetVertexArrayIntegeri_vEXT_pointer;
/*      */   long EXT_direct_state_access_glGetVertexArrayPointeri_vEXT_pointer;
/*      */   long EXT_direct_state_access_glMapNamedBufferRangeEXT_pointer;
/*      */   long EXT_direct_state_access_glFlushMappedNamedBufferRangeEXT_pointer;
/*      */   long EXT_draw_buffers2_glColorMaskIndexedEXT_pointer;
/*      */   long EXT_draw_buffers2_glGetBooleanIndexedvEXT_pointer;
/*      */   long EXT_draw_buffers2_glGetIntegerIndexedvEXT_pointer;
/*      */   long EXT_draw_buffers2_glEnableIndexedEXT_pointer;
/*      */   long EXT_draw_buffers2_glDisableIndexedEXT_pointer;
/*      */   long EXT_draw_buffers2_glIsEnabledIndexedEXT_pointer;
/*      */   long EXT_draw_instanced_glDrawArraysInstancedEXT_pointer;
/*      */   long EXT_draw_instanced_glDrawElementsInstancedEXT_pointer;
/*      */   long EXT_draw_range_elements_glDrawRangeElementsEXT_pointer;
/*      */   long EXT_fog_coord_glFogCoordfEXT_pointer;
/*      */   long EXT_fog_coord_glFogCoorddEXT_pointer;
/*      */   long EXT_fog_coord_glFogCoordPointerEXT_pointer;
/*      */   long EXT_framebuffer_blit_glBlitFramebufferEXT_pointer;
/*      */   long EXT_framebuffer_multisample_glRenderbufferStorageMultisampleEXT_pointer;
/*      */   long EXT_framebuffer_object_glIsRenderbufferEXT_pointer;
/*      */   long EXT_framebuffer_object_glBindRenderbufferEXT_pointer;
/*      */   long EXT_framebuffer_object_glDeleteRenderbuffersEXT_pointer;
/*      */   long EXT_framebuffer_object_glGenRenderbuffersEXT_pointer;
/*      */   long EXT_framebuffer_object_glRenderbufferStorageEXT_pointer;
/*      */   long EXT_framebuffer_object_glGetRenderbufferParameterivEXT_pointer;
/*      */   long EXT_framebuffer_object_glIsFramebufferEXT_pointer;
/*      */   long EXT_framebuffer_object_glBindFramebufferEXT_pointer;
/*      */   long EXT_framebuffer_object_glDeleteFramebuffersEXT_pointer;
/*      */   long EXT_framebuffer_object_glGenFramebuffersEXT_pointer;
/*      */   long EXT_framebuffer_object_glCheckFramebufferStatusEXT_pointer;
/*      */   long EXT_framebuffer_object_glFramebufferTexture1DEXT_pointer;
/*      */   long EXT_framebuffer_object_glFramebufferTexture2DEXT_pointer;
/*      */   long EXT_framebuffer_object_glFramebufferTexture3DEXT_pointer;
/*      */   long EXT_framebuffer_object_glFramebufferRenderbufferEXT_pointer;
/*      */   long EXT_framebuffer_object_glGetFramebufferAttachmentParameterivEXT_pointer;
/*      */   long EXT_framebuffer_object_glGenerateMipmapEXT_pointer;
/*      */   long EXT_geometry_shader4_glProgramParameteriEXT_pointer;
/*      */   long EXT_geometry_shader4_glFramebufferTextureEXT_pointer;
/*      */   long EXT_geometry_shader4_glFramebufferTextureLayerEXT_pointer;
/*      */   long EXT_geometry_shader4_glFramebufferTextureFaceEXT_pointer;
/*      */   long EXT_gpu_program_parameters_glProgramEnvParameters4fvEXT_pointer;
/*      */   long EXT_gpu_program_parameters_glProgramLocalParameters4fvEXT_pointer;
/*      */   long EXT_gpu_shader4_glVertexAttribI1iEXT_pointer;
/*      */   long EXT_gpu_shader4_glVertexAttribI2iEXT_pointer;
/*      */   long EXT_gpu_shader4_glVertexAttribI3iEXT_pointer;
/*      */   long EXT_gpu_shader4_glVertexAttribI4iEXT_pointer;
/*      */   long EXT_gpu_shader4_glVertexAttribI1uiEXT_pointer;
/*      */   long EXT_gpu_shader4_glVertexAttribI2uiEXT_pointer;
/*      */   long EXT_gpu_shader4_glVertexAttribI3uiEXT_pointer;
/*      */   long EXT_gpu_shader4_glVertexAttribI4uiEXT_pointer;
/*      */   long EXT_gpu_shader4_glVertexAttribI1ivEXT_pointer;
/*      */   long EXT_gpu_shader4_glVertexAttribI2ivEXT_pointer;
/*      */   long EXT_gpu_shader4_glVertexAttribI3ivEXT_pointer;
/*      */   long EXT_gpu_shader4_glVertexAttribI4ivEXT_pointer;
/*      */   long EXT_gpu_shader4_glVertexAttribI1uivEXT_pointer;
/*      */   long EXT_gpu_shader4_glVertexAttribI2uivEXT_pointer;
/*      */   long EXT_gpu_shader4_glVertexAttribI3uivEXT_pointer;
/*      */   long EXT_gpu_shader4_glVertexAttribI4uivEXT_pointer;
/*      */   long EXT_gpu_shader4_glVertexAttribI4bvEXT_pointer;
/*      */   long EXT_gpu_shader4_glVertexAttribI4svEXT_pointer;
/*      */   long EXT_gpu_shader4_glVertexAttribI4ubvEXT_pointer;
/*      */   long EXT_gpu_shader4_glVertexAttribI4usvEXT_pointer;
/*      */   long EXT_gpu_shader4_glVertexAttribIPointerEXT_pointer;
/*      */   long EXT_gpu_shader4_glGetVertexAttribIivEXT_pointer;
/*      */   long EXT_gpu_shader4_glGetVertexAttribIuivEXT_pointer;
/*      */   long EXT_gpu_shader4_glUniform1uiEXT_pointer;
/*      */   long EXT_gpu_shader4_glUniform2uiEXT_pointer;
/*      */   long EXT_gpu_shader4_glUniform3uiEXT_pointer;
/*      */   long EXT_gpu_shader4_glUniform4uiEXT_pointer;
/*      */   long EXT_gpu_shader4_glUniform1uivEXT_pointer;
/*      */   long EXT_gpu_shader4_glUniform2uivEXT_pointer;
/*      */   long EXT_gpu_shader4_glUniform3uivEXT_pointer;
/*      */   long EXT_gpu_shader4_glUniform4uivEXT_pointer;
/*      */   long EXT_gpu_shader4_glGetUniformuivEXT_pointer;
/*      */   long EXT_gpu_shader4_glBindFragDataLocationEXT_pointer;
/*      */   long EXT_gpu_shader4_glGetFragDataLocationEXT_pointer;
/*      */   long EXT_multi_draw_arrays_glMultiDrawArraysEXT_pointer;
/*      */   long EXT_paletted_texture_glColorTableEXT_pointer;
/*      */   long EXT_paletted_texture_glColorSubTableEXT_pointer;
/*      */   long EXT_paletted_texture_glGetColorTableEXT_pointer;
/*      */   long EXT_paletted_texture_glGetColorTableParameterivEXT_pointer;
/*      */   long EXT_paletted_texture_glGetColorTableParameterfvEXT_pointer;
/*      */   long EXT_point_parameters_glPointParameterfEXT_pointer;
/*      */   long EXT_point_parameters_glPointParameterfvEXT_pointer;
/*      */   long EXT_provoking_vertex_glProvokingVertexEXT_pointer;
/*      */   long EXT_secondary_color_glSecondaryColor3bEXT_pointer;
/*      */   long EXT_secondary_color_glSecondaryColor3fEXT_pointer;
/*      */   long EXT_secondary_color_glSecondaryColor3dEXT_pointer;
/*      */   long EXT_secondary_color_glSecondaryColor3ubEXT_pointer;
/*      */   long EXT_secondary_color_glSecondaryColorPointerEXT_pointer;
/*      */   long EXT_separate_shader_objects_glUseShaderProgramEXT_pointer;
/*      */   long EXT_separate_shader_objects_glActiveProgramEXT_pointer;
/*      */   long EXT_separate_shader_objects_glCreateShaderProgramEXT_pointer;
/*      */   long EXT_shader_image_load_store_glBindImageTextureEXT_pointer;
/*      */   long EXT_shader_image_load_store_glMemoryBarrierEXT_pointer;
/*      */   long EXT_stencil_clear_tag_glStencilClearTagEXT_pointer;
/*      */   long EXT_stencil_two_side_glActiveStencilFaceEXT_pointer;
/*      */   long EXT_texture_array_glFramebufferTextureLayerEXT_pointer;
/*      */   long EXT_texture_buffer_object_glTexBufferEXT_pointer;
/*      */   long EXT_texture_integer_glClearColorIiEXT_pointer;
/*      */   long EXT_texture_integer_glClearColorIuiEXT_pointer;
/*      */   long EXT_texture_integer_glTexParameterIivEXT_pointer;
/*      */   long EXT_texture_integer_glTexParameterIuivEXT_pointer;
/*      */   long EXT_texture_integer_glGetTexParameterIivEXT_pointer;
/*      */   long EXT_texture_integer_glGetTexParameterIuivEXT_pointer;
/*      */   long EXT_timer_query_glGetQueryObjecti64vEXT_pointer;
/*      */   long EXT_timer_query_glGetQueryObjectui64vEXT_pointer;
/*      */   long EXT_transform_feedback_glBindBufferRangeEXT_pointer;
/*      */   long EXT_transform_feedback_glBindBufferOffsetEXT_pointer;
/*      */   long EXT_transform_feedback_glBindBufferBaseEXT_pointer;
/*      */   long EXT_transform_feedback_glBeginTransformFeedbackEXT_pointer;
/*      */   long EXT_transform_feedback_glEndTransformFeedbackEXT_pointer;
/*      */   long EXT_transform_feedback_glTransformFeedbackVaryingsEXT_pointer;
/*      */   long EXT_transform_feedback_glGetTransformFeedbackVaryingEXT_pointer;
/*      */   long EXT_vertex_attrib_64bit_glVertexAttribL1dEXT_pointer;
/*      */   long EXT_vertex_attrib_64bit_glVertexAttribL2dEXT_pointer;
/*      */   long EXT_vertex_attrib_64bit_glVertexAttribL3dEXT_pointer;
/*      */   long EXT_vertex_attrib_64bit_glVertexAttribL4dEXT_pointer;
/*      */   long EXT_vertex_attrib_64bit_glVertexAttribL1dvEXT_pointer;
/*      */   long EXT_vertex_attrib_64bit_glVertexAttribL2dvEXT_pointer;
/*      */   long EXT_vertex_attrib_64bit_glVertexAttribL3dvEXT_pointer;
/*      */   long EXT_vertex_attrib_64bit_glVertexAttribL4dvEXT_pointer;
/*      */   long EXT_vertex_attrib_64bit_glVertexAttribLPointerEXT_pointer;
/*      */   long EXT_vertex_attrib_64bit_glGetVertexAttribLdvEXT_pointer;
/*      */   long EXT_vertex_attrib_64bit_glVertexArrayVertexAttribLOffsetEXT_pointer;
/*      */   long EXT_vertex_shader_glBeginVertexShaderEXT_pointer;
/*      */   long EXT_vertex_shader_glEndVertexShaderEXT_pointer;
/*      */   long EXT_vertex_shader_glBindVertexShaderEXT_pointer;
/*      */   long EXT_vertex_shader_glGenVertexShadersEXT_pointer;
/*      */   long EXT_vertex_shader_glDeleteVertexShaderEXT_pointer;
/*      */   long EXT_vertex_shader_glShaderOp1EXT_pointer;
/*      */   long EXT_vertex_shader_glShaderOp2EXT_pointer;
/*      */   long EXT_vertex_shader_glShaderOp3EXT_pointer;
/*      */   long EXT_vertex_shader_glSwizzleEXT_pointer;
/*      */   long EXT_vertex_shader_glWriteMaskEXT_pointer;
/*      */   long EXT_vertex_shader_glInsertComponentEXT_pointer;
/*      */   long EXT_vertex_shader_glExtractComponentEXT_pointer;
/*      */   long EXT_vertex_shader_glGenSymbolsEXT_pointer;
/*      */   long EXT_vertex_shader_glSetInvariantEXT_pointer;
/*      */   long EXT_vertex_shader_glSetLocalConstantEXT_pointer;
/*      */   long EXT_vertex_shader_glVariantbvEXT_pointer;
/*      */   long EXT_vertex_shader_glVariantsvEXT_pointer;
/*      */   long EXT_vertex_shader_glVariantivEXT_pointer;
/*      */   long EXT_vertex_shader_glVariantfvEXT_pointer;
/*      */   long EXT_vertex_shader_glVariantdvEXT_pointer;
/*      */   long EXT_vertex_shader_glVariantubvEXT_pointer;
/*      */   long EXT_vertex_shader_glVariantusvEXT_pointer;
/*      */   long EXT_vertex_shader_glVariantuivEXT_pointer;
/*      */   long EXT_vertex_shader_glVariantPointerEXT_pointer;
/*      */   long EXT_vertex_shader_glEnableVariantClientStateEXT_pointer;
/*      */   long EXT_vertex_shader_glDisableVariantClientStateEXT_pointer;
/*      */   long EXT_vertex_shader_glBindLightParameterEXT_pointer;
/*      */   long EXT_vertex_shader_glBindMaterialParameterEXT_pointer;
/*      */   long EXT_vertex_shader_glBindTexGenParameterEXT_pointer;
/*      */   long EXT_vertex_shader_glBindTextureUnitParameterEXT_pointer;
/*      */   long EXT_vertex_shader_glBindParameterEXT_pointer;
/*      */   long EXT_vertex_shader_glIsVariantEnabledEXT_pointer;
/*      */   long EXT_vertex_shader_glGetVariantBooleanvEXT_pointer;
/*      */   long EXT_vertex_shader_glGetVariantIntegervEXT_pointer;
/*      */   long EXT_vertex_shader_glGetVariantFloatvEXT_pointer;
/*      */   long EXT_vertex_shader_glGetVariantPointervEXT_pointer;
/*      */   long EXT_vertex_shader_glGetInvariantBooleanvEXT_pointer;
/*      */   long EXT_vertex_shader_glGetInvariantIntegervEXT_pointer;
/*      */   long EXT_vertex_shader_glGetInvariantFloatvEXT_pointer;
/*      */   long EXT_vertex_shader_glGetLocalConstantBooleanvEXT_pointer;
/*      */   long EXT_vertex_shader_glGetLocalConstantIntegervEXT_pointer;
/*      */   long EXT_vertex_shader_glGetLocalConstantFloatvEXT_pointer;
/*      */   long EXT_vertex_weighting_glVertexWeightfEXT_pointer;
/*      */   long EXT_vertex_weighting_glVertexWeightPointerEXT_pointer;
/*      */   long GL11_glAccum_pointer;
/*      */   long GL11_glAlphaFunc_pointer;
/*      */   long GL11_glClearColor_pointer;
/*      */   long GL11_glClearAccum_pointer;
/*      */   long GL11_glClear_pointer;
/*      */   long GL11_glCallLists_pointer;
/*      */   long GL11_glCallList_pointer;
/*      */   long GL11_glBlendFunc_pointer;
/*      */   long GL11_glBitmap_pointer;
/*      */   long GL11_glBindTexture_pointer;
/*      */   long GL11_glPrioritizeTextures_pointer;
/*      */   long GL11_glAreTexturesResident_pointer;
/*      */   long GL11_glBegin_pointer;
/*      */   long GL11_glEnd_pointer;
/*      */   long GL11_glArrayElement_pointer;
/*      */   long GL11_glClearDepth_pointer;
/*      */   long GL11_glDeleteLists_pointer;
/*      */   long GL11_glDeleteTextures_pointer;
/*      */   long GL11_glCullFace_pointer;
/*      */   long GL11_glCopyTexSubImage2D_pointer;
/*      */   long GL11_glCopyTexSubImage1D_pointer;
/*      */   long GL11_glCopyTexImage2D_pointer;
/*      */   long GL11_glCopyTexImage1D_pointer;
/*      */   long GL11_glCopyPixels_pointer;
/*      */   long GL11_glColorPointer_pointer;
/*      */   long GL11_glColorMaterial_pointer;
/*      */   long GL11_glColorMask_pointer;
/*      */   long GL11_glColor3b_pointer;
/*      */   long GL11_glColor3f_pointer;
/*      */   long GL11_glColor3d_pointer;
/*      */   long GL11_glColor3ub_pointer;
/*      */   long GL11_glColor4b_pointer;
/*      */   long GL11_glColor4f_pointer;
/*      */   long GL11_glColor4d_pointer;
/*      */   long GL11_glColor4ub_pointer;
/*      */   long GL11_glClipPlane_pointer;
/*      */   long GL11_glClearStencil_pointer;
/*      */   long GL11_glEvalPoint1_pointer;
/*      */   long GL11_glEvalPoint2_pointer;
/*      */   long GL11_glEvalMesh1_pointer;
/*      */   long GL11_glEvalMesh2_pointer;
/*      */   long GL11_glEvalCoord1f_pointer;
/*      */   long GL11_glEvalCoord1d_pointer;
/*      */   long GL11_glEvalCoord2f_pointer;
/*      */   long GL11_glEvalCoord2d_pointer;
/*      */   long GL11_glEnableClientState_pointer;
/*      */   long GL11_glDisableClientState_pointer;
/*      */   long GL11_glEnable_pointer;
/*      */   long GL11_glDisable_pointer;
/*      */   long GL11_glEdgeFlagPointer_pointer;
/*      */   long GL11_glEdgeFlag_pointer;
/*      */   long GL11_glDrawPixels_pointer;
/*      */   long GL11_glDrawElements_pointer;
/*      */   long GL11_glDrawBuffer_pointer;
/*      */   long GL11_glDrawArrays_pointer;
/*      */   long GL11_glDepthRange_pointer;
/*      */   long GL11_glDepthMask_pointer;
/*      */   long GL11_glDepthFunc_pointer;
/*      */   long GL11_glFeedbackBuffer_pointer;
/*      */   long GL11_glGetPixelMapfv_pointer;
/*      */   long GL11_glGetPixelMapuiv_pointer;
/*      */   long GL11_glGetPixelMapusv_pointer;
/*      */   long GL11_glGetMaterialfv_pointer;
/*      */   long GL11_glGetMaterialiv_pointer;
/*      */   long GL11_glGetMapfv_pointer;
/*      */   long GL11_glGetMapdv_pointer;
/*      */   long GL11_glGetMapiv_pointer;
/*      */   long GL11_glGetLightfv_pointer;
/*      */   long GL11_glGetLightiv_pointer;
/*      */   long GL11_glGetError_pointer;
/*      */   long GL11_glGetClipPlane_pointer;
/*      */   long GL11_glGetBooleanv_pointer;
/*      */   long GL11_glGetDoublev_pointer;
/*      */   long GL11_glGetFloatv_pointer;
/*      */   long GL11_glGetIntegerv_pointer;
/*      */   long GL11_glGenTextures_pointer;
/*      */   long GL11_glGenLists_pointer;
/*      */   long GL11_glFrustum_pointer;
/*      */   long GL11_glFrontFace_pointer;
/*      */   long GL11_glFogf_pointer;
/*      */   long GL11_glFogi_pointer;
/*      */   long GL11_glFogfv_pointer;
/*      */   long GL11_glFogiv_pointer;
/*      */   long GL11_glFlush_pointer;
/*      */   long GL11_glFinish_pointer;
/*      */   long GL11_glGetPointerv_pointer;
/*      */   long GL11_glIsEnabled_pointer;
/*      */   long GL11_glInterleavedArrays_pointer;
/*      */   long GL11_glInitNames_pointer;
/*      */   long GL11_glHint_pointer;
/*      */   long GL11_glGetTexParameterfv_pointer;
/*      */   long GL11_glGetTexParameteriv_pointer;
/*      */   long GL11_glGetTexLevelParameterfv_pointer;
/*      */   long GL11_glGetTexLevelParameteriv_pointer;
/*      */   long GL11_glGetTexImage_pointer;
/*      */   long GL11_glGetTexGeniv_pointer;
/*      */   long GL11_glGetTexGenfv_pointer;
/*      */   long GL11_glGetTexGendv_pointer;
/*      */   long GL11_glGetTexEnviv_pointer;
/*      */   long GL11_glGetTexEnvfv_pointer;
/*      */   long GL11_glGetString_pointer;
/*      */   long GL11_glGetPolygonStipple_pointer;
/*      */   long GL11_glIsList_pointer;
/*      */   long GL11_glMaterialf_pointer;
/*      */   long GL11_glMateriali_pointer;
/*      */   long GL11_glMaterialfv_pointer;
/*      */   long GL11_glMaterialiv_pointer;
/*      */   long GL11_glMapGrid1f_pointer;
/*      */   long GL11_glMapGrid1d_pointer;
/*      */   long GL11_glMapGrid2f_pointer;
/*      */   long GL11_glMapGrid2d_pointer;
/*      */   long GL11_glMap2f_pointer;
/*      */   long GL11_glMap2d_pointer;
/*      */   long GL11_glMap1f_pointer;
/*      */   long GL11_glMap1d_pointer;
/*      */   long GL11_glLogicOp_pointer;
/*      */   long GL11_glLoadName_pointer;
/*      */   long GL11_glLoadMatrixf_pointer;
/*      */   long GL11_glLoadMatrixd_pointer;
/*      */   long GL11_glLoadIdentity_pointer;
/*      */   long GL11_glListBase_pointer;
/*      */   long GL11_glLineWidth_pointer;
/*      */   long GL11_glLineStipple_pointer;
/*      */   long GL11_glLightModelf_pointer;
/*      */   long GL11_glLightModeli_pointer;
/*      */   long GL11_glLightModelfv_pointer;
/*      */   long GL11_glLightModeliv_pointer;
/*      */   long GL11_glLightf_pointer;
/*      */   long GL11_glLighti_pointer;
/*      */   long GL11_glLightfv_pointer;
/*      */   long GL11_glLightiv_pointer;
/*      */   long GL11_glIsTexture_pointer;
/*      */   long GL11_glMatrixMode_pointer;
/*      */   long GL11_glPolygonStipple_pointer;
/*      */   long GL11_glPolygonOffset_pointer;
/*      */   long GL11_glPolygonMode_pointer;
/*      */   long GL11_glPointSize_pointer;
/*      */   long GL11_glPixelZoom_pointer;
/*      */   long GL11_glPixelTransferf_pointer;
/*      */   long GL11_glPixelTransferi_pointer;
/*      */   long GL11_glPixelStoref_pointer;
/*      */   long GL11_glPixelStorei_pointer;
/*      */   long GL11_glPixelMapfv_pointer;
/*      */   long GL11_glPixelMapuiv_pointer;
/*      */   long GL11_glPixelMapusv_pointer;
/*      */   long GL11_glPassThrough_pointer;
/*      */   long GL11_glOrtho_pointer;
/*      */   long GL11_glNormalPointer_pointer;
/*      */   long GL11_glNormal3b_pointer;
/*      */   long GL11_glNormal3f_pointer;
/*      */   long GL11_glNormal3d_pointer;
/*      */   long GL11_glNormal3i_pointer;
/*      */   long GL11_glNewList_pointer;
/*      */   long GL11_glEndList_pointer;
/*      */   long GL11_glMultMatrixf_pointer;
/*      */   long GL11_glMultMatrixd_pointer;
/*      */   long GL11_glShadeModel_pointer;
/*      */   long GL11_glSelectBuffer_pointer;
/*      */   long GL11_glScissor_pointer;
/*      */   long GL11_glScalef_pointer;
/*      */   long GL11_glScaled_pointer;
/*      */   long GL11_glRotatef_pointer;
/*      */   long GL11_glRenderMode_pointer;
/*      */   long GL11_glRectf_pointer;
/*      */   long GL11_glRectd_pointer;
/*      */   long GL11_glRecti_pointer;
/*      */   long GL11_glReadPixels_pointer;
/*      */   long GL11_glReadBuffer_pointer;
/*      */   long GL11_glRasterPos2f_pointer;
/*      */   long GL11_glRasterPos2d_pointer;
/*      */   long GL11_glRasterPos2i_pointer;
/*      */   long GL11_glRasterPos3f_pointer;
/*      */   long GL11_glRasterPos3d_pointer;
/*      */   long GL11_glRasterPos3i_pointer;
/*      */   long GL11_glRasterPos4f_pointer;
/*      */   long GL11_glRasterPos4d_pointer;
/*      */   long GL11_glRasterPos4i_pointer;
/*      */   long GL11_glPushName_pointer;
/*      */   long GL11_glPopName_pointer;
/*      */   long GL11_glPushMatrix_pointer;
/*      */   long GL11_glPopMatrix_pointer;
/*      */   long GL11_glPushClientAttrib_pointer;
/*      */   long GL11_glPopClientAttrib_pointer;
/*      */   long GL11_glPushAttrib_pointer;
/*      */   long GL11_glPopAttrib_pointer;
/*      */   long GL11_glStencilFunc_pointer;
/*      */   long GL11_glVertexPointer_pointer;
/*      */   long GL11_glVertex2f_pointer;
/*      */   long GL11_glVertex2d_pointer;
/*      */   long GL11_glVertex2i_pointer;
/*      */   long GL11_glVertex3f_pointer;
/*      */   long GL11_glVertex3d_pointer;
/*      */   long GL11_glVertex3i_pointer;
/*      */   long GL11_glVertex4f_pointer;
/*      */   long GL11_glVertex4d_pointer;
/*      */   long GL11_glVertex4i_pointer;
/*      */   long GL11_glTranslatef_pointer;
/*      */   long GL11_glTranslated_pointer;
/*      */   long GL11_glTexImage1D_pointer;
/*      */   long GL11_glTexImage2D_pointer;
/*      */   long GL11_glTexSubImage1D_pointer;
/*      */   long GL11_glTexSubImage2D_pointer;
/*      */   long GL11_glTexParameterf_pointer;
/*      */   long GL11_glTexParameteri_pointer;
/*      */   long GL11_glTexParameterfv_pointer;
/*      */   long GL11_glTexParameteriv_pointer;
/*      */   long GL11_glTexGenf_pointer;
/*      */   long GL11_glTexGend_pointer;
/*      */   long GL11_glTexGenfv_pointer;
/*      */   long GL11_glTexGendv_pointer;
/*      */   long GL11_glTexGeni_pointer;
/*      */   long GL11_glTexGeniv_pointer;
/*      */   long GL11_glTexEnvf_pointer;
/*      */   long GL11_glTexEnvi_pointer;
/*      */   long GL11_glTexEnvfv_pointer;
/*      */   long GL11_glTexEnviv_pointer;
/*      */   long GL11_glTexCoordPointer_pointer;
/*      */   long GL11_glTexCoord1f_pointer;
/*      */   long GL11_glTexCoord1d_pointer;
/*      */   long GL11_glTexCoord2f_pointer;
/*      */   long GL11_glTexCoord2d_pointer;
/*      */   long GL11_glTexCoord3f_pointer;
/*      */   long GL11_glTexCoord3d_pointer;
/*      */   long GL11_glTexCoord4f_pointer;
/*      */   long GL11_glTexCoord4d_pointer;
/*      */   long GL11_glStencilOp_pointer;
/*      */   long GL11_glStencilMask_pointer;
/*      */   long GL11_glViewport_pointer;
/*      */   long GL12_glDrawRangeElements_pointer;
/*      */   long GL12_glTexImage3D_pointer;
/*      */   long GL12_glTexSubImage3D_pointer;
/*      */   long GL12_glCopyTexSubImage3D_pointer;
/*      */   long GL13_glActiveTexture_pointer;
/*      */   long GL13_glClientActiveTexture_pointer;
/*      */   long GL13_glCompressedTexImage1D_pointer;
/*      */   long GL13_glCompressedTexImage2D_pointer;
/*      */   long GL13_glCompressedTexImage3D_pointer;
/*      */   long GL13_glCompressedTexSubImage1D_pointer;
/*      */   long GL13_glCompressedTexSubImage2D_pointer;
/*      */   long GL13_glCompressedTexSubImage3D_pointer;
/*      */   long GL13_glGetCompressedTexImage_pointer;
/*      */   long GL13_glMultiTexCoord1f_pointer;
/*      */   long GL13_glMultiTexCoord1d_pointer;
/*      */   long GL13_glMultiTexCoord2f_pointer;
/*      */   long GL13_glMultiTexCoord2d_pointer;
/*      */   long GL13_glMultiTexCoord3f_pointer;
/*      */   long GL13_glMultiTexCoord3d_pointer;
/*      */   long GL13_glMultiTexCoord4f_pointer;
/*      */   long GL13_glMultiTexCoord4d_pointer;
/*      */   long GL13_glLoadTransposeMatrixf_pointer;
/*      */   long GL13_glLoadTransposeMatrixd_pointer;
/*      */   long GL13_glMultTransposeMatrixf_pointer;
/*      */   long GL13_glMultTransposeMatrixd_pointer;
/*      */   long GL13_glSampleCoverage_pointer;
/*      */   long GL14_glBlendEquation_pointer;
/*      */   long GL14_glBlendColor_pointer;
/*      */   long GL14_glFogCoordf_pointer;
/*      */   long GL14_glFogCoordd_pointer;
/*      */   long GL14_glFogCoordPointer_pointer;
/*      */   long GL14_glMultiDrawArrays_pointer;
/*      */   long GL14_glPointParameteri_pointer;
/*      */   long GL14_glPointParameterf_pointer;
/*      */   long GL14_glPointParameteriv_pointer;
/*      */   long GL14_glPointParameterfv_pointer;
/*      */   long GL14_glSecondaryColor3b_pointer;
/*      */   long GL14_glSecondaryColor3f_pointer;
/*      */   long GL14_glSecondaryColor3d_pointer;
/*      */   long GL14_glSecondaryColor3ub_pointer;
/*      */   long GL14_glSecondaryColorPointer_pointer;
/*      */   long GL14_glBlendFuncSeparate_pointer;
/*      */   long GL14_glWindowPos2f_pointer;
/*      */   long GL14_glWindowPos2d_pointer;
/*      */   long GL14_glWindowPos2i_pointer;
/*      */   long GL14_glWindowPos3f_pointer;
/*      */   long GL14_glWindowPos3d_pointer;
/*      */   long GL14_glWindowPos3i_pointer;
/*      */   long GL15_glBindBuffer_pointer;
/*      */   long GL15_glDeleteBuffers_pointer;
/*      */   long GL15_glGenBuffers_pointer;
/*      */   long GL15_glIsBuffer_pointer;
/*      */   long GL15_glBufferData_pointer;
/*      */   long GL15_glBufferSubData_pointer;
/*      */   long GL15_glGetBufferSubData_pointer;
/*      */   long GL15_glMapBuffer_pointer;
/*      */   long GL15_glUnmapBuffer_pointer;
/*      */   long GL15_glGetBufferParameteriv_pointer;
/*      */   long GL15_glGetBufferPointerv_pointer;
/*      */   long GL15_glGenQueries_pointer;
/*      */   long GL15_glDeleteQueries_pointer;
/*      */   long GL15_glIsQuery_pointer;
/*      */   long GL15_glBeginQuery_pointer;
/*      */   long GL15_glEndQuery_pointer;
/*      */   long GL15_glGetQueryiv_pointer;
/*      */   long GL15_glGetQueryObjectiv_pointer;
/*      */   long GL15_glGetQueryObjectuiv_pointer;
/*      */   long GL20_glShaderSource_pointer;
/*      */   long GL20_glCreateShader_pointer;
/*      */   long GL20_glIsShader_pointer;
/*      */   long GL20_glCompileShader_pointer;
/*      */   long GL20_glDeleteShader_pointer;
/*      */   long GL20_glCreateProgram_pointer;
/*      */   long GL20_glIsProgram_pointer;
/*      */   long GL20_glAttachShader_pointer;
/*      */   long GL20_glDetachShader_pointer;
/*      */   long GL20_glLinkProgram_pointer;
/*      */   long GL20_glUseProgram_pointer;
/*      */   long GL20_glValidateProgram_pointer;
/*      */   long GL20_glDeleteProgram_pointer;
/*      */   long GL20_glUniform1f_pointer;
/*      */   long GL20_glUniform2f_pointer;
/*      */   long GL20_glUniform3f_pointer;
/*      */   long GL20_glUniform4f_pointer;
/*      */   long GL20_glUniform1i_pointer;
/*      */   long GL20_glUniform2i_pointer;
/*      */   long GL20_glUniform3i_pointer;
/*      */   long GL20_glUniform4i_pointer;
/*      */   long GL20_glUniform1fv_pointer;
/*      */   long GL20_glUniform2fv_pointer;
/*      */   long GL20_glUniform3fv_pointer;
/*      */   long GL20_glUniform4fv_pointer;
/*      */   long GL20_glUniform1iv_pointer;
/*      */   long GL20_glUniform2iv_pointer;
/*      */   long GL20_glUniform3iv_pointer;
/*      */   long GL20_glUniform4iv_pointer;
/*      */   long GL20_glUniformMatrix2fv_pointer;
/*      */   long GL20_glUniformMatrix3fv_pointer;
/*      */   long GL20_glUniformMatrix4fv_pointer;
/*      */   long GL20_glGetShaderiv_pointer;
/*      */   long GL20_glGetProgramiv_pointer;
/*      */   long GL20_glGetShaderInfoLog_pointer;
/*      */   long GL20_glGetProgramInfoLog_pointer;
/*      */   long GL20_glGetAttachedShaders_pointer;
/*      */   long GL20_glGetUniformLocation_pointer;
/*      */   long GL20_glGetActiveUniform_pointer;
/*      */   long GL20_glGetUniformfv_pointer;
/*      */   long GL20_glGetUniformiv_pointer;
/*      */   long GL20_glGetShaderSource_pointer;
/*      */   long GL20_glVertexAttrib1s_pointer;
/*      */   long GL20_glVertexAttrib1f_pointer;
/*      */   long GL20_glVertexAttrib1d_pointer;
/*      */   long GL20_glVertexAttrib2s_pointer;
/*      */   long GL20_glVertexAttrib2f_pointer;
/*      */   long GL20_glVertexAttrib2d_pointer;
/*      */   long GL20_glVertexAttrib3s_pointer;
/*      */   long GL20_glVertexAttrib3f_pointer;
/*      */   long GL20_glVertexAttrib3d_pointer;
/*      */   long GL20_glVertexAttrib4s_pointer;
/*      */   long GL20_glVertexAttrib4f_pointer;
/*      */   long GL20_glVertexAttrib4d_pointer;
/*      */   long GL20_glVertexAttrib4Nub_pointer;
/*      */   long GL20_glVertexAttribPointer_pointer;
/*      */   long GL20_glEnableVertexAttribArray_pointer;
/*      */   long GL20_glDisableVertexAttribArray_pointer;
/*      */   long GL20_glGetVertexAttribfv_pointer;
/*      */   long GL20_glGetVertexAttribdv_pointer;
/*      */   long GL20_glGetVertexAttribiv_pointer;
/*      */   long GL20_glGetVertexAttribPointerv_pointer;
/*      */   long GL20_glBindAttribLocation_pointer;
/*      */   long GL20_glGetActiveAttrib_pointer;
/*      */   long GL20_glGetAttribLocation_pointer;
/*      */   long GL20_glDrawBuffers_pointer;
/*      */   long GL20_glStencilOpSeparate_pointer;
/*      */   long GL20_glStencilFuncSeparate_pointer;
/*      */   long GL20_glStencilMaskSeparate_pointer;
/*      */   long GL20_glBlendEquationSeparate_pointer;
/*      */   long GL21_glUniformMatrix2x3fv_pointer;
/*      */   long GL21_glUniformMatrix3x2fv_pointer;
/*      */   long GL21_glUniformMatrix2x4fv_pointer;
/*      */   long GL21_glUniformMatrix4x2fv_pointer;
/*      */   long GL21_glUniformMatrix3x4fv_pointer;
/*      */   long GL21_glUniformMatrix4x3fv_pointer;
/*      */   long GL30_glGetStringi_pointer;
/*      */   long GL30_glClearBufferfv_pointer;
/*      */   long GL30_glClearBufferiv_pointer;
/*      */   long GL30_glClearBufferuiv_pointer;
/*      */   long GL30_glClearBufferfi_pointer;
/*      */   long GL30_glVertexAttribI1i_pointer;
/*      */   long GL30_glVertexAttribI2i_pointer;
/*      */   long GL30_glVertexAttribI3i_pointer;
/*      */   long GL30_glVertexAttribI4i_pointer;
/*      */   long GL30_glVertexAttribI1ui_pointer;
/*      */   long GL30_glVertexAttribI2ui_pointer;
/*      */   long GL30_glVertexAttribI3ui_pointer;
/*      */   long GL30_glVertexAttribI4ui_pointer;
/*      */   long GL30_glVertexAttribI1iv_pointer;
/*      */   long GL30_glVertexAttribI2iv_pointer;
/*      */   long GL30_glVertexAttribI3iv_pointer;
/*      */   long GL30_glVertexAttribI4iv_pointer;
/*      */   long GL30_glVertexAttribI1uiv_pointer;
/*      */   long GL30_glVertexAttribI2uiv_pointer;
/*      */   long GL30_glVertexAttribI3uiv_pointer;
/*      */   long GL30_glVertexAttribI4uiv_pointer;
/*      */   long GL30_glVertexAttribI4bv_pointer;
/*      */   long GL30_glVertexAttribI4sv_pointer;
/*      */   long GL30_glVertexAttribI4ubv_pointer;
/*      */   long GL30_glVertexAttribI4usv_pointer;
/*      */   long GL30_glVertexAttribIPointer_pointer;
/*      */   long GL30_glGetVertexAttribIiv_pointer;
/*      */   long GL30_glGetVertexAttribIuiv_pointer;
/*      */   long GL30_glUniform1ui_pointer;
/*      */   long GL30_glUniform2ui_pointer;
/*      */   long GL30_glUniform3ui_pointer;
/*      */   long GL30_glUniform4ui_pointer;
/*      */   long GL30_glUniform1uiv_pointer;
/*      */   long GL30_glUniform2uiv_pointer;
/*      */   long GL30_glUniform3uiv_pointer;
/*      */   long GL30_glUniform4uiv_pointer;
/*      */   long GL30_glGetUniformuiv_pointer;
/*      */   long GL30_glBindFragDataLocation_pointer;
/*      */   long GL30_glGetFragDataLocation_pointer;
/*      */   long GL30_glBeginConditionalRender_pointer;
/*      */   long GL30_glEndConditionalRender_pointer;
/*      */   long GL30_glMapBufferRange_pointer;
/*      */   long GL30_glFlushMappedBufferRange_pointer;
/*      */   long GL30_glClampColor_pointer;
/*      */   long GL30_glIsRenderbuffer_pointer;
/*      */   long GL30_glBindRenderbuffer_pointer;
/*      */   long GL30_glDeleteRenderbuffers_pointer;
/*      */   long GL30_glGenRenderbuffers_pointer;
/*      */   long GL30_glRenderbufferStorage_pointer;
/*      */   long GL30_glGetRenderbufferParameteriv_pointer;
/*      */   long GL30_glIsFramebuffer_pointer;
/*      */   long GL30_glBindFramebuffer_pointer;
/*      */   long GL30_glDeleteFramebuffers_pointer;
/*      */   long GL30_glGenFramebuffers_pointer;
/*      */   long GL30_glCheckFramebufferStatus_pointer;
/*      */   long GL30_glFramebufferTexture1D_pointer;
/*      */   long GL30_glFramebufferTexture2D_pointer;
/*      */   long GL30_glFramebufferTexture3D_pointer;
/*      */   long GL30_glFramebufferRenderbuffer_pointer;
/*      */   long GL30_glGetFramebufferAttachmentParameteriv_pointer;
/*      */   long GL30_glGenerateMipmap_pointer;
/*      */   long GL30_glRenderbufferStorageMultisample_pointer;
/*      */   long GL30_glBlitFramebuffer_pointer;
/*      */   long GL30_glTexParameterIiv_pointer;
/*      */   long GL30_glTexParameterIuiv_pointer;
/*      */   long GL30_glGetTexParameterIiv_pointer;
/*      */   long GL30_glGetTexParameterIuiv_pointer;
/*      */   long GL30_glFramebufferTextureLayer_pointer;
/*      */   long GL30_glColorMaski_pointer;
/*      */   long GL30_glGetBooleani_v_pointer;
/*      */   long GL30_glGetIntegeri_v_pointer;
/*      */   long GL30_glEnablei_pointer;
/*      */   long GL30_glDisablei_pointer;
/*      */   long GL30_glIsEnabledi_pointer;
/*      */   long GL30_glBindBufferRange_pointer;
/*      */   long GL30_glBindBufferBase_pointer;
/*      */   long GL30_glBeginTransformFeedback_pointer;
/*      */   long GL30_glEndTransformFeedback_pointer;
/*      */   long GL30_glTransformFeedbackVaryings_pointer;
/*      */   long GL30_glGetTransformFeedbackVarying_pointer;
/*      */   long GL30_glBindVertexArray_pointer;
/*      */   long GL30_glDeleteVertexArrays_pointer;
/*      */   long GL30_glGenVertexArrays_pointer;
/*      */   long GL30_glIsVertexArray_pointer;
/*      */   long GL31_glDrawArraysInstanced_pointer;
/*      */   long GL31_glDrawElementsInstanced_pointer;
/*      */   long GL31_glCopyBufferSubData_pointer;
/*      */   long GL31_glPrimitiveRestartIndex_pointer;
/*      */   long GL31_glTexBuffer_pointer;
/*      */   long GL31_glGetUniformIndices_pointer;
/*      */   long GL31_glGetActiveUniformsiv_pointer;
/*      */   long GL31_glGetActiveUniformName_pointer;
/*      */   long GL31_glGetUniformBlockIndex_pointer;
/*      */   long GL31_glGetActiveUniformBlockiv_pointer;
/*      */   long GL31_glGetActiveUniformBlockName_pointer;
/*      */   long GL31_glUniformBlockBinding_pointer;
/*      */   long GL32_glDrawElementsBaseVertex_pointer;
/*      */   long GL32_glDrawRangeElementsBaseVertex_pointer;
/*      */   long GL32_glDrawElementsInstancedBaseVertex_pointer;
/*      */   long GL32_glProvokingVertex_pointer;
/*      */   long GL32_glTexImage2DMultisample_pointer;
/*      */   long GL32_glTexImage3DMultisample_pointer;
/*      */   long GL32_glGetMultisamplefv_pointer;
/*      */   long GL32_glSampleMaski_pointer;
/*      */   long GL32_glFramebufferTexture_pointer;
/*      */   long GL32_glFramebufferTextureLayer_pointer;
/*      */   long GL32_glFenceSync_pointer;
/*      */   long GL32_glIsSync_pointer;
/*      */   long GL32_glDeleteSync_pointer;
/*      */   long GL32_glClientWaitSync_pointer;
/*      */   long GL32_glWaitSync_pointer;
/*      */   long GL32_glGetInteger64v_pointer;
/*      */   long GL32_glGetInteger64i_v_pointer;
/*      */   long GL32_glGetSynciv_pointer;
/*      */   long GL33_glBindFragDataLocationIndexed_pointer;
/*      */   long GL33_glGetFragDataIndex_pointer;
/*      */   long GL33_glGenSamplers_pointer;
/*      */   long GL33_glDeleteSamplers_pointer;
/*      */   long GL33_glIsSampler_pointer;
/*      */   long GL33_glBindSampler_pointer;
/*      */   long GL33_glSamplerParameteri_pointer;
/*      */   long GL33_glSamplerParameterf_pointer;
/*      */   long GL33_glSamplerParameteriv_pointer;
/*      */   long GL33_glSamplerParameterfv_pointer;
/*      */   long GL33_glSamplerParameterIiv_pointer;
/*      */   long GL33_glSamplerParameterIuiv_pointer;
/*      */   long GL33_glGetSamplerParameteriv_pointer;
/*      */   long GL33_glGetSamplerParameterfv_pointer;
/*      */   long GL33_glGetSamplerParameterIiv_pointer;
/*      */   long GL33_glGetSamplerParameterIuiv_pointer;
/*      */   long GL33_glQueryCounter_pointer;
/*      */   long GL33_glGetQueryObjecti64v_pointer;
/*      */   long GL33_glGetQueryObjectui64v_pointer;
/*      */   long GL33_glVertexAttribDivisor_pointer;
/*      */   long GL33_glVertexP2ui_pointer;
/*      */   long GL33_glVertexP3ui_pointer;
/*      */   long GL33_glVertexP4ui_pointer;
/*      */   long GL33_glVertexP2uiv_pointer;
/*      */   long GL33_glVertexP3uiv_pointer;
/*      */   long GL33_glVertexP4uiv_pointer;
/*      */   long GL33_glTexCoordP1ui_pointer;
/*      */   long GL33_glTexCoordP2ui_pointer;
/*      */   long GL33_glTexCoordP3ui_pointer;
/*      */   long GL33_glTexCoordP4ui_pointer;
/*      */   long GL33_glTexCoordP1uiv_pointer;
/*      */   long GL33_glTexCoordP2uiv_pointer;
/*      */   long GL33_glTexCoordP3uiv_pointer;
/*      */   long GL33_glTexCoordP4uiv_pointer;
/*      */   long GL33_glMultiTexCoordP1ui_pointer;
/*      */   long GL33_glMultiTexCoordP2ui_pointer;
/*      */   long GL33_glMultiTexCoordP3ui_pointer;
/*      */   long GL33_glMultiTexCoordP4ui_pointer;
/*      */   long GL33_glMultiTexCoordP1uiv_pointer;
/*      */   long GL33_glMultiTexCoordP2uiv_pointer;
/*      */   long GL33_glMultiTexCoordP3uiv_pointer;
/*      */   long GL33_glMultiTexCoordP4uiv_pointer;
/*      */   long GL33_glNormalP3ui_pointer;
/*      */   long GL33_glNormalP3uiv_pointer;
/*      */   long GL33_glColorP3ui_pointer;
/*      */   long GL33_glColorP4ui_pointer;
/*      */   long GL33_glColorP3uiv_pointer;
/*      */   long GL33_glColorP4uiv_pointer;
/*      */   long GL33_glSecondaryColorP3ui_pointer;
/*      */   long GL33_glSecondaryColorP3uiv_pointer;
/*      */   long GL33_glVertexAttribP1ui_pointer;
/*      */   long GL33_glVertexAttribP2ui_pointer;
/*      */   long GL33_glVertexAttribP3ui_pointer;
/*      */   long GL33_glVertexAttribP4ui_pointer;
/*      */   long GL33_glVertexAttribP1uiv_pointer;
/*      */   long GL33_glVertexAttribP2uiv_pointer;
/*      */   long GL33_glVertexAttribP3uiv_pointer;
/*      */   long GL33_glVertexAttribP4uiv_pointer;
/*      */   long GL40_glBlendEquationi_pointer;
/*      */   long GL40_glBlendEquationSeparatei_pointer;
/*      */   long GL40_glBlendFunci_pointer;
/*      */   long GL40_glBlendFuncSeparatei_pointer;
/*      */   long GL40_glDrawArraysIndirect_pointer;
/*      */   long GL40_glDrawElementsIndirect_pointer;
/*      */   long GL40_glUniform1d_pointer;
/*      */   long GL40_glUniform2d_pointer;
/*      */   long GL40_glUniform3d_pointer;
/*      */   long GL40_glUniform4d_pointer;
/*      */   long GL40_glUniform1dv_pointer;
/*      */   long GL40_glUniform2dv_pointer;
/*      */   long GL40_glUniform3dv_pointer;
/*      */   long GL40_glUniform4dv_pointer;
/*      */   long GL40_glUniformMatrix2dv_pointer;
/*      */   long GL40_glUniformMatrix3dv_pointer;
/*      */   long GL40_glUniformMatrix4dv_pointer;
/*      */   long GL40_glUniformMatrix2x3dv_pointer;
/*      */   long GL40_glUniformMatrix2x4dv_pointer;
/*      */   long GL40_glUniformMatrix3x2dv_pointer;
/*      */   long GL40_glUniformMatrix3x4dv_pointer;
/*      */   long GL40_glUniformMatrix4x2dv_pointer;
/*      */   long GL40_glUniformMatrix4x3dv_pointer;
/*      */   long GL40_glGetUniformdv_pointer;
/*      */   long GL40_glMinSampleShading_pointer;
/*      */   long GL40_glGetSubroutineUniformLocation_pointer;
/*      */   long GL40_glGetSubroutineIndex_pointer;
/*      */   long GL40_glGetActiveSubroutineUniformiv_pointer;
/*      */   long GL40_glGetActiveSubroutineUniformName_pointer;
/*      */   long GL40_glGetActiveSubroutineName_pointer;
/*      */   long GL40_glUniformSubroutinesuiv_pointer;
/*      */   long GL40_glGetUniformSubroutineuiv_pointer;
/*      */   long GL40_glGetProgramStageiv_pointer;
/*      */   long GL40_glPatchParameteri_pointer;
/*      */   long GL40_glPatchParameterfv_pointer;
/*      */   long GL40_glBindTransformFeedback_pointer;
/*      */   long GL40_glDeleteTransformFeedbacks_pointer;
/*      */   long GL40_glGenTransformFeedbacks_pointer;
/*      */   long GL40_glIsTransformFeedback_pointer;
/*      */   long GL40_glPauseTransformFeedback_pointer;
/*      */   long GL40_glResumeTransformFeedback_pointer;
/*      */   long GL40_glDrawTransformFeedback_pointer;
/*      */   long GL40_glDrawTransformFeedbackStream_pointer;
/*      */   long GL40_glBeginQueryIndexed_pointer;
/*      */   long GL40_glEndQueryIndexed_pointer;
/*      */   long GL40_glGetQueryIndexediv_pointer;
/*      */   long GREMEDY_string_marker_glStringMarkerGREMEDY_pointer;
/*      */   long NV_conditional_render_glBeginConditionalRenderNV_pointer;
/*      */   long NV_conditional_render_glEndConditionalRenderNV_pointer;
/*      */   long NV_copy_image_glCopyImageSubDataNV_pointer;
/*      */   long NV_depth_buffer_float_glDepthRangedNV_pointer;
/*      */   long NV_depth_buffer_float_glClearDepthdNV_pointer;
/*      */   long NV_depth_buffer_float_glDepthBoundsdNV_pointer;
/*      */   long NV_evaluators_glGetMapControlPointsNV_pointer;
/*      */   long NV_evaluators_glMapControlPointsNV_pointer;
/*      */   long NV_evaluators_glMapParameterfvNV_pointer;
/*      */   long NV_evaluators_glMapParameterivNV_pointer;
/*      */   long NV_evaluators_glGetMapParameterfvNV_pointer;
/*      */   long NV_evaluators_glGetMapParameterivNV_pointer;
/*      */   long NV_evaluators_glGetMapAttribParameterfvNV_pointer;
/*      */   long NV_evaluators_glGetMapAttribParameterivNV_pointer;
/*      */   long NV_evaluators_glEvalMapsNV_pointer;
/*      */   long NV_explicit_multisample_glGetBooleanIndexedvEXT_pointer;
/*      */   long NV_explicit_multisample_glGetIntegerIndexedvEXT_pointer;
/*      */   long NV_explicit_multisample_glGetMultisamplefvNV_pointer;
/*      */   long NV_explicit_multisample_glSampleMaskIndexedNV_pointer;
/*      */   long NV_explicit_multisample_glTexRenderbufferNV_pointer;
/*      */   long NV_fence_glGenFencesNV_pointer;
/*      */   long NV_fence_glDeleteFencesNV_pointer;
/*      */   long NV_fence_glSetFenceNV_pointer;
/*      */   long NV_fence_glTestFenceNV_pointer;
/*      */   long NV_fence_glFinishFenceNV_pointer;
/*      */   long NV_fence_glIsFenceNV_pointer;
/*      */   long NV_fence_glGetFenceivNV_pointer;
/*      */   long NV_fragment_program_glProgramNamedParameter4fNV_pointer;
/*      */   long NV_fragment_program_glProgramNamedParameter4dNV_pointer;
/*      */   long NV_fragment_program_glGetProgramNamedParameterfvNV_pointer;
/*      */   long NV_fragment_program_glGetProgramNamedParameterdvNV_pointer;
/*      */   long NV_framebuffer_multisample_coverage_glRenderbufferStorageMultisampleCoverageNV_pointer;
/*      */   long NV_geometry_program4_glProgramVertexLimitNV_pointer;
/*      */   long NV_geometry_program4_glFramebufferTextureEXT_pointer;
/*      */   long NV_geometry_program4_glFramebufferTextureLayerEXT_pointer;
/*      */   long NV_geometry_program4_glFramebufferTextureFaceEXT_pointer;
/*      */   long NV_gpu_program4_glProgramLocalParameterI4iNV_pointer;
/*      */   long NV_gpu_program4_glProgramLocalParameterI4ivNV_pointer;
/*      */   long NV_gpu_program4_glProgramLocalParametersI4ivNV_pointer;
/*      */   long NV_gpu_program4_glProgramLocalParameterI4uiNV_pointer;
/*      */   long NV_gpu_program4_glProgramLocalParameterI4uivNV_pointer;
/*      */   long NV_gpu_program4_glProgramLocalParametersI4uivNV_pointer;
/*      */   long NV_gpu_program4_glProgramEnvParameterI4iNV_pointer;
/*      */   long NV_gpu_program4_glProgramEnvParameterI4ivNV_pointer;
/*      */   long NV_gpu_program4_glProgramEnvParametersI4ivNV_pointer;
/*      */   long NV_gpu_program4_glProgramEnvParameterI4uiNV_pointer;
/*      */   long NV_gpu_program4_glProgramEnvParameterI4uivNV_pointer;
/*      */   long NV_gpu_program4_glProgramEnvParametersI4uivNV_pointer;
/*      */   long NV_gpu_program4_glGetProgramLocalParameterIivNV_pointer;
/*      */   long NV_gpu_program4_glGetProgramLocalParameterIuivNV_pointer;
/*      */   long NV_gpu_program4_glGetProgramEnvParameterIivNV_pointer;
/*      */   long NV_gpu_program4_glGetProgramEnvParameterIuivNV_pointer;
/*      */   long NV_gpu_shader5_glUniform1i64NV_pointer;
/*      */   long NV_gpu_shader5_glUniform2i64NV_pointer;
/*      */   long NV_gpu_shader5_glUniform3i64NV_pointer;
/*      */   long NV_gpu_shader5_glUniform4i64NV_pointer;
/*      */   long NV_gpu_shader5_glUniform1i64vNV_pointer;
/*      */   long NV_gpu_shader5_glUniform2i64vNV_pointer;
/*      */   long NV_gpu_shader5_glUniform3i64vNV_pointer;
/*      */   long NV_gpu_shader5_glUniform4i64vNV_pointer;
/*      */   long NV_gpu_shader5_glUniform1ui64NV_pointer;
/*      */   long NV_gpu_shader5_glUniform2ui64NV_pointer;
/*      */   long NV_gpu_shader5_glUniform3ui64NV_pointer;
/*      */   long NV_gpu_shader5_glUniform4ui64NV_pointer;
/*      */   long NV_gpu_shader5_glUniform1ui64vNV_pointer;
/*      */   long NV_gpu_shader5_glUniform2ui64vNV_pointer;
/*      */   long NV_gpu_shader5_glUniform3ui64vNV_pointer;
/*      */   long NV_gpu_shader5_glUniform4ui64vNV_pointer;
/*      */   long NV_gpu_shader5_glGetUniformi64vNV_pointer;
/*      */   long NV_gpu_shader5_glGetUniformui64vNV_pointer;
/*      */   long NV_gpu_shader5_glProgramUniform1i64NV_pointer;
/*      */   long NV_gpu_shader5_glProgramUniform2i64NV_pointer;
/*      */   long NV_gpu_shader5_glProgramUniform3i64NV_pointer;
/*      */   long NV_gpu_shader5_glProgramUniform4i64NV_pointer;
/*      */   long NV_gpu_shader5_glProgramUniform1i64vNV_pointer;
/*      */   long NV_gpu_shader5_glProgramUniform2i64vNV_pointer;
/*      */   long NV_gpu_shader5_glProgramUniform3i64vNV_pointer;
/*      */   long NV_gpu_shader5_glProgramUniform4i64vNV_pointer;
/*      */   long NV_gpu_shader5_glProgramUniform1ui64NV_pointer;
/*      */   long NV_gpu_shader5_glProgramUniform2ui64NV_pointer;
/*      */   long NV_gpu_shader5_glProgramUniform3ui64NV_pointer;
/*      */   long NV_gpu_shader5_glProgramUniform4ui64NV_pointer;
/*      */   long NV_gpu_shader5_glProgramUniform1ui64vNV_pointer;
/*      */   long NV_gpu_shader5_glProgramUniform2ui64vNV_pointer;
/*      */   long NV_gpu_shader5_glProgramUniform3ui64vNV_pointer;
/*      */   long NV_gpu_shader5_glProgramUniform4ui64vNV_pointer;
/*      */   long NV_half_float_glVertex2hNV_pointer;
/*      */   long NV_half_float_glVertex3hNV_pointer;
/*      */   long NV_half_float_glVertex4hNV_pointer;
/*      */   long NV_half_float_glNormal3hNV_pointer;
/*      */   long NV_half_float_glColor3hNV_pointer;
/*      */   long NV_half_float_glColor4hNV_pointer;
/*      */   long NV_half_float_glTexCoord1hNV_pointer;
/*      */   long NV_half_float_glTexCoord2hNV_pointer;
/*      */   long NV_half_float_glTexCoord3hNV_pointer;
/*      */   long NV_half_float_glTexCoord4hNV_pointer;
/*      */   long NV_half_float_glMultiTexCoord1hNV_pointer;
/*      */   long NV_half_float_glMultiTexCoord2hNV_pointer;
/*      */   long NV_half_float_glMultiTexCoord3hNV_pointer;
/*      */   long NV_half_float_glMultiTexCoord4hNV_pointer;
/*      */   long NV_half_float_glFogCoordhNV_pointer;
/*      */   long NV_half_float_glSecondaryColor3hNV_pointer;
/*      */   long NV_half_float_glVertexWeighthNV_pointer;
/*      */   long NV_half_float_glVertexAttrib1hNV_pointer;
/*      */   long NV_half_float_glVertexAttrib2hNV_pointer;
/*      */   long NV_half_float_glVertexAttrib3hNV_pointer;
/*      */   long NV_half_float_glVertexAttrib4hNV_pointer;
/*      */   long NV_half_float_glVertexAttribs1hvNV_pointer;
/*      */   long NV_half_float_glVertexAttribs2hvNV_pointer;
/*      */   long NV_half_float_glVertexAttribs3hvNV_pointer;
/*      */   long NV_half_float_glVertexAttribs4hvNV_pointer;
/*      */   long NV_occlusion_query_glGenOcclusionQueriesNV_pointer;
/*      */   long NV_occlusion_query_glDeleteOcclusionQueriesNV_pointer;
/*      */   long NV_occlusion_query_glIsOcclusionQueryNV_pointer;
/*      */   long NV_occlusion_query_glBeginOcclusionQueryNV_pointer;
/*      */   long NV_occlusion_query_glEndOcclusionQueryNV_pointer;
/*      */   long NV_occlusion_query_glGetOcclusionQueryuivNV_pointer;
/*      */   long NV_occlusion_query_glGetOcclusionQueryivNV_pointer;
/*      */   long NV_parameter_buffer_object_glProgramBufferParametersfvNV_pointer;
/*      */   long NV_parameter_buffer_object_glProgramBufferParametersIivNV_pointer;
/*      */   long NV_parameter_buffer_object_glProgramBufferParametersIuivNV_pointer;
/*      */   long NV_pixel_data_range_glPixelDataRangeNV_pointer;
/*      */   long NV_pixel_data_range_glFlushPixelDataRangeNV_pointer;
/*      */   long NV_point_sprite_glPointParameteriNV_pointer;
/*      */   long NV_point_sprite_glPointParameterivNV_pointer;
/*      */   long NV_primitive_restart_glPrimitiveRestartNV_pointer;
/*      */   long NV_primitive_restart_glPrimitiveRestartIndexNV_pointer;
/*      */   long NV_program_glLoadProgramNV_pointer;
/*      */   long NV_program_glBindProgramNV_pointer;
/*      */   long NV_program_glDeleteProgramsNV_pointer;
/*      */   long NV_program_glGenProgramsNV_pointer;
/*      */   long NV_program_glGetProgramivNV_pointer;
/*      */   long NV_program_glGetProgramStringNV_pointer;
/*      */   long NV_program_glIsProgramNV_pointer;
/*      */   long NV_program_glAreProgramsResidentNV_pointer;
/*      */   long NV_program_glRequestResidentProgramsNV_pointer;
/*      */   long NV_register_combiners_glCombinerParameterfNV_pointer;
/*      */   long NV_register_combiners_glCombinerParameterfvNV_pointer;
/*      */   long NV_register_combiners_glCombinerParameteriNV_pointer;
/*      */   long NV_register_combiners_glCombinerParameterivNV_pointer;
/*      */   long NV_register_combiners_glCombinerInputNV_pointer;
/*      */   long NV_register_combiners_glCombinerOutputNV_pointer;
/*      */   long NV_register_combiners_glFinalCombinerInputNV_pointer;
/*      */   long NV_register_combiners_glGetCombinerInputParameterfvNV_pointer;
/*      */   long NV_register_combiners_glGetCombinerInputParameterivNV_pointer;
/*      */   long NV_register_combiners_glGetCombinerOutputParameterfvNV_pointer;
/*      */   long NV_register_combiners_glGetCombinerOutputParameterivNV_pointer;
/*      */   long NV_register_combiners_glGetFinalCombinerInputParameterfvNV_pointer;
/*      */   long NV_register_combiners_glGetFinalCombinerInputParameterivNV_pointer;
/*      */   long NV_register_combiners2_glCombinerStageParameterfvNV_pointer;
/*      */   long NV_register_combiners2_glGetCombinerStageParameterfvNV_pointer;
/*      */   long NV_shader_buffer_load_glMakeBufferResidentNV_pointer;
/*      */   long NV_shader_buffer_load_glMakeBufferNonResidentNV_pointer;
/*      */   long NV_shader_buffer_load_glIsBufferResidentNV_pointer;
/*      */   long NV_shader_buffer_load_glMakeNamedBufferResidentNV_pointer;
/*      */   long NV_shader_buffer_load_glMakeNamedBufferNonResidentNV_pointer;
/*      */   long NV_shader_buffer_load_glIsNamedBufferResidentNV_pointer;
/*      */   long NV_shader_buffer_load_glGetBufferParameterui64vNV_pointer;
/*      */   long NV_shader_buffer_load_glGetNamedBufferParameterui64vNV_pointer;
/*      */   long NV_shader_buffer_load_glGetIntegerui64vNV_pointer;
/*      */   long NV_shader_buffer_load_glUniformui64NV_pointer;
/*      */   long NV_shader_buffer_load_glUniformui64vNV_pointer;
/*      */   long NV_shader_buffer_load_glGetUniformui64vNV_pointer;
/*      */   long NV_shader_buffer_load_glProgramUniformui64NV_pointer;
/*      */   long NV_shader_buffer_load_glProgramUniformui64vNV_pointer;
/*      */   long NV_texture_barrier_glTextureBarrierNV_pointer;
/*      */   long NV_transform_feedback_glBindBufferRangeNV_pointer;
/*      */   long NV_transform_feedback_glBindBufferOffsetNV_pointer;
/*      */   long NV_transform_feedback_glBindBufferBaseNV_pointer;
/*      */   long NV_transform_feedback_glTransformFeedbackAttribsNV_pointer;
/*      */   long NV_transform_feedback_glTransformFeedbackVaryingsNV_pointer;
/*      */   long NV_transform_feedback_glBeginTransformFeedbackNV_pointer;
/*      */   long NV_transform_feedback_glEndTransformFeedbackNV_pointer;
/*      */   long NV_transform_feedback_glGetVaryingLocationNV_pointer;
/*      */   long NV_transform_feedback_glGetActiveVaryingNV_pointer;
/*      */   long NV_transform_feedback_glActiveVaryingNV_pointer;
/*      */   long NV_transform_feedback_glGetTransformFeedbackVaryingNV_pointer;
/*      */   long NV_transform_feedback2_glBindTransformFeedbackNV_pointer;
/*      */   long NV_transform_feedback2_glDeleteTransformFeedbacksNV_pointer;
/*      */   long NV_transform_feedback2_glGenTransformFeedbacksNV_pointer;
/*      */   long NV_transform_feedback2_glIsTransformFeedbackNV_pointer;
/*      */   long NV_transform_feedback2_glPauseTransformFeedbackNV_pointer;
/*      */   long NV_transform_feedback2_glResumeTransformFeedbackNV_pointer;
/*      */   long NV_transform_feedback2_glDrawTransformFeedbackNV_pointer;
/*      */   long NV_vertex_array_range_glVertexArrayRangeNV_pointer;
/*      */   long NV_vertex_array_range_glFlushVertexArrayRangeNV_pointer;
/*      */   long NV_vertex_array_range_glAllocateMemoryNV_pointer;
/*      */   long NV_vertex_array_range_glFreeMemoryNV_pointer;
/*      */   long NV_vertex_attrib_integer_64bit_glVertexAttribL1i64NV_pointer;
/*      */   long NV_vertex_attrib_integer_64bit_glVertexAttribL2i64NV_pointer;
/*      */   long NV_vertex_attrib_integer_64bit_glVertexAttribL3i64NV_pointer;
/*      */   long NV_vertex_attrib_integer_64bit_glVertexAttribL4i64NV_pointer;
/*      */   long NV_vertex_attrib_integer_64bit_glVertexAttribL1i64vNV_pointer;
/*      */   long NV_vertex_attrib_integer_64bit_glVertexAttribL2i64vNV_pointer;
/*      */   long NV_vertex_attrib_integer_64bit_glVertexAttribL3i64vNV_pointer;
/*      */   long NV_vertex_attrib_integer_64bit_glVertexAttribL4i64vNV_pointer;
/*      */   long NV_vertex_attrib_integer_64bit_glVertexAttribL1ui64NV_pointer;
/*      */   long NV_vertex_attrib_integer_64bit_glVertexAttribL2ui64NV_pointer;
/*      */   long NV_vertex_attrib_integer_64bit_glVertexAttribL3ui64NV_pointer;
/*      */   long NV_vertex_attrib_integer_64bit_glVertexAttribL4ui64NV_pointer;
/*      */   long NV_vertex_attrib_integer_64bit_glVertexAttribL1ui64vNV_pointer;
/*      */   long NV_vertex_attrib_integer_64bit_glVertexAttribL2ui64vNV_pointer;
/*      */   long NV_vertex_attrib_integer_64bit_glVertexAttribL3ui64vNV_pointer;
/*      */   long NV_vertex_attrib_integer_64bit_glVertexAttribL4ui64vNV_pointer;
/*      */   long NV_vertex_attrib_integer_64bit_glGetVertexAttribLi64vNV_pointer;
/*      */   long NV_vertex_attrib_integer_64bit_glGetVertexAttribLui64vNV_pointer;
/*      */   long NV_vertex_attrib_integer_64bit_glVertexAttribLFormatNV_pointer;
/*      */   long NV_vertex_buffer_unified_memory_glBufferAddressRangeNV_pointer;
/*      */   long NV_vertex_buffer_unified_memory_glVertexFormatNV_pointer;
/*      */   long NV_vertex_buffer_unified_memory_glNormalFormatNV_pointer;
/*      */   long NV_vertex_buffer_unified_memory_glColorFormatNV_pointer;
/*      */   long NV_vertex_buffer_unified_memory_glIndexFormatNV_pointer;
/*      */   long NV_vertex_buffer_unified_memory_glTexCoordFormatNV_pointer;
/*      */   long NV_vertex_buffer_unified_memory_glEdgeFlagFormatNV_pointer;
/*      */   long NV_vertex_buffer_unified_memory_glSecondaryColorFormatNV_pointer;
/*      */   long NV_vertex_buffer_unified_memory_glFogCoordFormatNV_pointer;
/*      */   long NV_vertex_buffer_unified_memory_glVertexAttribFormatNV_pointer;
/*      */   long NV_vertex_buffer_unified_memory_glVertexAttribIFormatNV_pointer;
/*      */   long NV_vertex_buffer_unified_memory_glGetIntegerui64i_vNV_pointer;
/*      */   long NV_vertex_program_glExecuteProgramNV_pointer;
/*      */   long NV_vertex_program_glGetProgramParameterfvNV_pointer;
/*      */   long NV_vertex_program_glGetProgramParameterdvNV_pointer;
/*      */   long NV_vertex_program_glGetTrackMatrixivNV_pointer;
/*      */   long NV_vertex_program_glGetVertexAttribfvNV_pointer;
/*      */   long NV_vertex_program_glGetVertexAttribdvNV_pointer;
/*      */   long NV_vertex_program_glGetVertexAttribivNV_pointer;
/*      */   long NV_vertex_program_glGetVertexAttribPointervNV_pointer;
/*      */   long NV_vertex_program_glProgramParameter4fNV_pointer;
/*      */   long NV_vertex_program_glProgramParameter4dNV_pointer;
/*      */   long NV_vertex_program_glProgramParameters4fvNV_pointer;
/*      */   long NV_vertex_program_glProgramParameters4dvNV_pointer;
/*      */   long NV_vertex_program_glTrackMatrixNV_pointer;
/*      */   long NV_vertex_program_glVertexAttribPointerNV_pointer;
/*      */   long NV_vertex_program_glVertexAttrib1sNV_pointer;
/*      */   long NV_vertex_program_glVertexAttrib1fNV_pointer;
/*      */   long NV_vertex_program_glVertexAttrib1dNV_pointer;
/*      */   long NV_vertex_program_glVertexAttrib2sNV_pointer;
/*      */   long NV_vertex_program_glVertexAttrib2fNV_pointer;
/*      */   long NV_vertex_program_glVertexAttrib2dNV_pointer;
/*      */   long NV_vertex_program_glVertexAttrib3sNV_pointer;
/*      */   long NV_vertex_program_glVertexAttrib3fNV_pointer;
/*      */   long NV_vertex_program_glVertexAttrib3dNV_pointer;
/*      */   long NV_vertex_program_glVertexAttrib4sNV_pointer;
/*      */   long NV_vertex_program_glVertexAttrib4fNV_pointer;
/*      */   long NV_vertex_program_glVertexAttrib4dNV_pointer;
/*      */   long NV_vertex_program_glVertexAttrib4ubNV_pointer;
/*      */   long NV_vertex_program_glVertexAttribs1svNV_pointer;
/*      */   long NV_vertex_program_glVertexAttribs1fvNV_pointer;
/*      */   long NV_vertex_program_glVertexAttribs1dvNV_pointer;
/*      */   long NV_vertex_program_glVertexAttribs2svNV_pointer;
/*      */   long NV_vertex_program_glVertexAttribs2fvNV_pointer;
/*      */   long NV_vertex_program_glVertexAttribs2dvNV_pointer;
/*      */   long NV_vertex_program_glVertexAttribs3svNV_pointer;
/*      */   long NV_vertex_program_glVertexAttribs3fvNV_pointer;
/*      */   long NV_vertex_program_glVertexAttribs3dvNV_pointer;
/*      */   long NV_vertex_program_glVertexAttribs4svNV_pointer;
/*      */   long NV_vertex_program_glVertexAttribs4fvNV_pointer;
/*      */   long NV_vertex_program_glVertexAttribs4dvNV_pointer;
/*      */   
/*      */   private boolean AMD_draw_buffers_blend_initNativeFunctionAddresses() {
/* 2033 */     return (((this.AMD_draw_buffers_blend_glBlendFuncIndexedAMD_pointer = GLContext.getFunctionAddress("glBlendFuncIndexedAMD")) != 0L)) & (((this.AMD_draw_buffers_blend_glBlendFuncSeparateIndexedAMD_pointer = GLContext.getFunctionAddress("glBlendFuncSeparateIndexedAMD")) != 0L)) & (((this.AMD_draw_buffers_blend_glBlendEquationIndexedAMD_pointer = GLContext.getFunctionAddress("glBlendEquationIndexedAMD")) != 0L) ? 1 : 0) & (((this.AMD_draw_buffers_blend_glBlendEquationSeparateIndexedAMD_pointer = GLContext.getFunctionAddress("glBlendEquationSeparateIndexedAMD")) != 0L) ? 1 : 0);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private boolean AMD_performance_monitor_initNativeFunctionAddresses() {
/* 2041 */     return (((this.AMD_performance_monitor_glGetPerfMonitorGroupsAMD_pointer = GLContext.getFunctionAddress("glGetPerfMonitorGroupsAMD")) != 0L)) & (((this.AMD_performance_monitor_glGetPerfMonitorCountersAMD_pointer = GLContext.getFunctionAddress("glGetPerfMonitorCountersAMD")) != 0L)) & (((this.AMD_performance_monitor_glGetPerfMonitorGroupStringAMD_pointer = GLContext.getFunctionAddress("glGetPerfMonitorGroupStringAMD")) != 0L) ? 1 : 0) & (((this.AMD_performance_monitor_glGetPerfMonitorCounterStringAMD_pointer = GLContext.getFunctionAddress("glGetPerfMonitorCounterStringAMD")) != 0L) ? 1 : 0) & (((this.AMD_performance_monitor_glGetPerfMonitorCounterInfoAMD_pointer = GLContext.getFunctionAddress("glGetPerfMonitorCounterInfoAMD")) != 0L) ? 1 : 0) & (((this.AMD_performance_monitor_glGenPerfMonitorsAMD_pointer = GLContext.getFunctionAddress("glGenPerfMonitorsAMD")) != 0L) ? 1 : 0) & (((this.AMD_performance_monitor_glDeletePerfMonitorsAMD_pointer = GLContext.getFunctionAddress("glDeletePerfMonitorsAMD")) != 0L) ? 1 : 0) & (((this.AMD_performance_monitor_glSelectPerfMonitorCountersAMD_pointer = GLContext.getFunctionAddress("glSelectPerfMonitorCountersAMD")) != 0L) ? 1 : 0) & (((this.AMD_performance_monitor_glBeginPerfMonitorAMD_pointer = GLContext.getFunctionAddress("glBeginPerfMonitorAMD")) != 0L) ? 1 : 0) & (((this.AMD_performance_monitor_glEndPerfMonitorAMD_pointer = GLContext.getFunctionAddress("glEndPerfMonitorAMD")) != 0L) ? 1 : 0) & (((this.AMD_performance_monitor_glGetPerfMonitorCounterDataAMD_pointer = GLContext.getFunctionAddress("glGetPerfMonitorCounterDataAMD")) != 0L) ? 1 : 0);
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
/*      */ 
/*      */ 
/*      */   
/*      */   private boolean AMD_vertex_shader_tessellator_initNativeFunctionAddresses() {
/* 2056 */     return (((this.AMD_vertex_shader_tessellator_glTessellationFactorAMD_pointer = GLContext.getFunctionAddress("glTessellationFactorAMD")) != 0L)) & (((this.AMD_vertex_shader_tessellator_glTessellationModeAMD_pointer = GLContext.getFunctionAddress("glTessellationModeAMD")) != 0L));
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   private boolean APPLE_element_array_initNativeFunctionAddresses() {
/* 2062 */     return (((this.APPLE_element_array_glElementPointerAPPLE_pointer = GLContext.getFunctionAddress("glElementPointerAPPLE")) != 0L)) & (((this.APPLE_element_array_glDrawElementArrayAPPLE_pointer = GLContext.getFunctionAddress("glDrawElementArrayAPPLE")) != 0L)) & (((this.APPLE_element_array_glDrawRangeElementArrayAPPLE_pointer = GLContext.getFunctionAddress("glDrawRangeElementArrayAPPLE")) != 0L) ? 1 : 0) & (((this.APPLE_element_array_glMultiDrawElementArrayAPPLE_pointer = GLContext.getFunctionAddress("glMultiDrawElementArrayAPPLE")) != 0L) ? 1 : 0) & (((this.APPLE_element_array_glMultiDrawRangeElementArrayAPPLE_pointer = GLContext.getFunctionAddress("glMultiDrawRangeElementArrayAPPLE")) != 0L) ? 1 : 0);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private boolean APPLE_fence_initNativeFunctionAddresses() {
/* 2071 */     return (((this.APPLE_fence_glGenFencesAPPLE_pointer = GLContext.getFunctionAddress("glGenFencesAPPLE")) != 0L)) & (((this.APPLE_fence_glDeleteFencesAPPLE_pointer = GLContext.getFunctionAddress("glDeleteFencesAPPLE")) != 0L)) & (((this.APPLE_fence_glSetFenceAPPLE_pointer = GLContext.getFunctionAddress("glSetFenceAPPLE")) != 0L) ? 1 : 0) & (((this.APPLE_fence_glIsFenceAPPLE_pointer = GLContext.getFunctionAddress("glIsFenceAPPLE")) != 0L) ? 1 : 0) & (((this.APPLE_fence_glTestFenceAPPLE_pointer = GLContext.getFunctionAddress("glTestFenceAPPLE")) != 0L) ? 1 : 0) & (((this.APPLE_fence_glFinishFenceAPPLE_pointer = GLContext.getFunctionAddress("glFinishFenceAPPLE")) != 0L) ? 1 : 0) & (((this.APPLE_fence_glTestObjectAPPLE_pointer = GLContext.getFunctionAddress("glTestObjectAPPLE")) != 0L) ? 1 : 0) & (((this.APPLE_fence_glFinishObjectAPPLE_pointer = GLContext.getFunctionAddress("glFinishObjectAPPLE")) != 0L) ? 1 : 0);
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
/*      */   private boolean APPLE_flush_buffer_range_initNativeFunctionAddresses() {
/* 2083 */     return (((this.APPLE_flush_buffer_range_glBufferParameteriAPPLE_pointer = GLContext.getFunctionAddress("glBufferParameteriAPPLE")) != 0L)) & (((this.APPLE_flush_buffer_range_glFlushMappedBufferRangeAPPLE_pointer = GLContext.getFunctionAddress("glFlushMappedBufferRangeAPPLE")) != 0L));
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   private boolean APPLE_object_purgeable_initNativeFunctionAddresses() {
/* 2089 */     return (((this.APPLE_object_purgeable_glObjectPurgeableAPPLE_pointer = GLContext.getFunctionAddress("glObjectPurgeableAPPLE")) != 0L)) & (((this.APPLE_object_purgeable_glObjectUnpurgeableAPPLE_pointer = GLContext.getFunctionAddress("glObjectUnpurgeableAPPLE")) != 0L)) & (((this.APPLE_object_purgeable_glGetObjectParameterivAPPLE_pointer = GLContext.getFunctionAddress("glGetObjectParameterivAPPLE")) != 0L) ? 1 : 0);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private boolean APPLE_texture_range_initNativeFunctionAddresses() {
/* 2096 */     return (((this.APPLE_texture_range_glTextureRangeAPPLE_pointer = GLContext.getFunctionAddress("glTextureRangeAPPLE")) != 0L)) & (((this.APPLE_texture_range_glGetTexParameterPointervAPPLE_pointer = GLContext.getFunctionAddress("glGetTexParameterPointervAPPLE")) != 0L));
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   private boolean APPLE_vertex_array_object_initNativeFunctionAddresses() {
/* 2102 */     return (((this.APPLE_vertex_array_object_glBindVertexArrayAPPLE_pointer = GLContext.getFunctionAddress("glBindVertexArrayAPPLE")) != 0L)) & (((this.APPLE_vertex_array_object_glDeleteVertexArraysAPPLE_pointer = GLContext.getFunctionAddress("glDeleteVertexArraysAPPLE")) != 0L)) & (((this.APPLE_vertex_array_object_glGenVertexArraysAPPLE_pointer = GLContext.getFunctionAddress("glGenVertexArraysAPPLE")) != 0L) ? 1 : 0) & (((this.APPLE_vertex_array_object_glIsVertexArrayAPPLE_pointer = GLContext.getFunctionAddress("glIsVertexArrayAPPLE")) != 0L) ? 1 : 0);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private boolean APPLE_vertex_array_range_initNativeFunctionAddresses() {
/* 2110 */     return (((this.APPLE_vertex_array_range_glVertexArrayRangeAPPLE_pointer = GLContext.getFunctionAddress("glVertexArrayRangeAPPLE")) != 0L)) & (((this.APPLE_vertex_array_range_glFlushVertexArrayRangeAPPLE_pointer = GLContext.getFunctionAddress("glFlushVertexArrayRangeAPPLE")) != 0L)) & (((this.APPLE_vertex_array_range_glVertexArrayParameteriAPPLE_pointer = GLContext.getFunctionAddress("glVertexArrayParameteriAPPLE")) != 0L) ? 1 : 0);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private boolean APPLE_vertex_program_evaluators_initNativeFunctionAddresses() {
/* 2117 */     return (((this.APPLE_vertex_program_evaluators_glEnableVertexAttribAPPLE_pointer = GLContext.getFunctionAddress("glEnableVertexAttribAPPLE")) != 0L)) & (((this.APPLE_vertex_program_evaluators_glDisableVertexAttribAPPLE_pointer = GLContext.getFunctionAddress("glDisableVertexAttribAPPLE")) != 0L)) & (((this.APPLE_vertex_program_evaluators_glIsVertexAttribEnabledAPPLE_pointer = GLContext.getFunctionAddress("glIsVertexAttribEnabledAPPLE")) != 0L) ? 1 : 0) & (((this.APPLE_vertex_program_evaluators_glMapVertexAttrib1dAPPLE_pointer = GLContext.getFunctionAddress("glMapVertexAttrib1dAPPLE")) != 0L) ? 1 : 0) & (((this.APPLE_vertex_program_evaluators_glMapVertexAttrib1fAPPLE_pointer = GLContext.getFunctionAddress("glMapVertexAttrib1fAPPLE")) != 0L) ? 1 : 0) & (((this.APPLE_vertex_program_evaluators_glMapVertexAttrib2dAPPLE_pointer = GLContext.getFunctionAddress("glMapVertexAttrib2dAPPLE")) != 0L) ? 1 : 0) & (((this.APPLE_vertex_program_evaluators_glMapVertexAttrib2fAPPLE_pointer = GLContext.getFunctionAddress("glMapVertexAttrib2fAPPLE")) != 0L) ? 1 : 0);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private boolean ARB_blend_func_extended_initNativeFunctionAddresses() {
/* 2128 */     return (((this.ARB_blend_func_extended_glBindFragDataLocationIndexed_pointer = GLContext.getFunctionAddress("glBindFragDataLocationIndexed")) != 0L)) & (((this.ARB_blend_func_extended_glGetFragDataIndex_pointer = GLContext.getFunctionAddress("glGetFragDataIndex")) != 0L));
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   private boolean ARB_buffer_object_initNativeFunctionAddresses() {
/* 2134 */     return (((this.ARB_buffer_object_glBindBufferARB_pointer = GLContext.getFunctionAddress("glBindBufferARB")) != 0L)) & (((this.ARB_buffer_object_glDeleteBuffersARB_pointer = GLContext.getFunctionAddress("glDeleteBuffersARB")) != 0L)) & (((this.ARB_buffer_object_glGenBuffersARB_pointer = GLContext.getFunctionAddress("glGenBuffersARB")) != 0L) ? 1 : 0) & (((this.ARB_buffer_object_glIsBufferARB_pointer = GLContext.getFunctionAddress("glIsBufferARB")) != 0L) ? 1 : 0) & (((this.ARB_buffer_object_glBufferDataARB_pointer = GLContext.getFunctionAddress("glBufferDataARB")) != 0L) ? 1 : 0) & (((this.ARB_buffer_object_glBufferSubDataARB_pointer = GLContext.getFunctionAddress("glBufferSubDataARB")) != 0L) ? 1 : 0) & (((this.ARB_buffer_object_glGetBufferSubDataARB_pointer = GLContext.getFunctionAddress("glGetBufferSubDataARB")) != 0L) ? 1 : 0) & (((this.ARB_buffer_object_glMapBufferARB_pointer = GLContext.getFunctionAddress("glMapBufferARB")) != 0L) ? 1 : 0) & (((this.ARB_buffer_object_glUnmapBufferARB_pointer = GLContext.getFunctionAddress("glUnmapBufferARB")) != 0L) ? 1 : 0) & (((this.ARB_buffer_object_glGetBufferParameterivARB_pointer = GLContext.getFunctionAddress("glGetBufferParameterivARB")) != 0L) ? 1 : 0) & (((this.ARB_buffer_object_glGetBufferPointervARB_pointer = GLContext.getFunctionAddress("glGetBufferPointervARB")) != 0L) ? 1 : 0);
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
/*      */ 
/*      */ 
/*      */   
/*      */   private boolean ARB_color_buffer_float_initNativeFunctionAddresses() {
/* 2149 */     return ((this.ARB_color_buffer_float_glClampColorARB_pointer = GLContext.getFunctionAddress("glClampColorARB")) != 0L);
/*      */   }
/*      */ 
/*      */   
/*      */   private boolean ARB_copy_buffer_initNativeFunctionAddresses() {
/* 2154 */     return ((this.ARB_copy_buffer_glCopyBufferSubData_pointer = GLContext.getFunctionAddress("glCopyBufferSubData")) != 0L);
/*      */   }
/*      */ 
/*      */   
/*      */   private boolean ARB_draw_buffers_initNativeFunctionAddresses() {
/* 2159 */     return ((this.ARB_draw_buffers_glDrawBuffersARB_pointer = GLContext.getFunctionAddress("glDrawBuffersARB")) != 0L);
/*      */   }
/*      */ 
/*      */   
/*      */   private boolean ARB_draw_buffers_blend_initNativeFunctionAddresses() {
/* 2164 */     return (((this.ARB_draw_buffers_blend_glBlendEquationiARB_pointer = GLContext.getFunctionAddress("glBlendEquationiARB")) != 0L)) & (((this.ARB_draw_buffers_blend_glBlendEquationSeparateiARB_pointer = GLContext.getFunctionAddress("glBlendEquationSeparateiARB")) != 0L)) & (((this.ARB_draw_buffers_blend_glBlendFunciARB_pointer = GLContext.getFunctionAddress("glBlendFunciARB")) != 0L) ? 1 : 0) & (((this.ARB_draw_buffers_blend_glBlendFuncSeparateiARB_pointer = GLContext.getFunctionAddress("glBlendFuncSeparateiARB")) != 0L) ? 1 : 0);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private boolean ARB_draw_elements_base_vertex_initNativeFunctionAddresses() {
/* 2172 */     return (((this.ARB_draw_elements_base_vertex_glDrawElementsBaseVertex_pointer = GLContext.getFunctionAddress("glDrawElementsBaseVertex")) != 0L)) & (((this.ARB_draw_elements_base_vertex_glDrawRangeElementsBaseVertex_pointer = GLContext.getFunctionAddress("glDrawRangeElementsBaseVertex")) != 0L)) & (((this.ARB_draw_elements_base_vertex_glDrawElementsInstancedBaseVertex_pointer = GLContext.getFunctionAddress("glDrawElementsInstancedBaseVertex")) != 0L) ? 1 : 0);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private boolean ARB_draw_indirect_initNativeFunctionAddresses() {
/* 2179 */     return (((this.ARB_draw_indirect_glDrawArraysIndirect_pointer = GLContext.getFunctionAddress("glDrawArraysIndirect")) != 0L)) & (((this.ARB_draw_indirect_glDrawElementsIndirect_pointer = GLContext.getFunctionAddress("glDrawElementsIndirect")) != 0L));
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   private boolean ARB_draw_instanced_initNativeFunctionAddresses() {
/* 2185 */     return (((this.ARB_draw_instanced_glDrawArraysInstancedARB_pointer = GLContext.getFunctionAddress("glDrawArraysInstancedARB")) != 0L)) & (((this.ARB_draw_instanced_glDrawElementsInstancedARB_pointer = GLContext.getFunctionAddress("glDrawElementsInstancedARB")) != 0L));
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   private boolean ARB_framebuffer_object_initNativeFunctionAddresses() {
/* 2191 */     return (((this.ARB_framebuffer_object_glIsRenderbuffer_pointer = GLContext.getFunctionAddress("glIsRenderbuffer")) != 0L)) & (((this.ARB_framebuffer_object_glBindRenderbuffer_pointer = GLContext.getFunctionAddress("glBindRenderbuffer")) != 0L)) & (((this.ARB_framebuffer_object_glDeleteRenderbuffers_pointer = GLContext.getFunctionAddress("glDeleteRenderbuffers")) != 0L) ? 1 : 0) & (((this.ARB_framebuffer_object_glGenRenderbuffers_pointer = GLContext.getFunctionAddress("glGenRenderbuffers")) != 0L) ? 1 : 0) & (((this.ARB_framebuffer_object_glRenderbufferStorage_pointer = GLContext.getFunctionAddress("glRenderbufferStorage")) != 0L) ? 1 : 0) & (((this.ARB_framebuffer_object_glRenderbufferStorageMultisample_pointer = GLContext.getFunctionAddress("glRenderbufferStorageMultisample")) != 0L) ? 1 : 0) & (((this.ARB_framebuffer_object_glGetRenderbufferParameteriv_pointer = GLContext.getFunctionAddress("glGetRenderbufferParameteriv")) != 0L) ? 1 : 0) & (((this.ARB_framebuffer_object_glIsFramebuffer_pointer = GLContext.getFunctionAddress("glIsFramebuffer")) != 0L) ? 1 : 0) & (((this.ARB_framebuffer_object_glBindFramebuffer_pointer = GLContext.getFunctionAddress("glBindFramebuffer")) != 0L) ? 1 : 0) & (((this.ARB_framebuffer_object_glDeleteFramebuffers_pointer = GLContext.getFunctionAddress("glDeleteFramebuffers")) != 0L) ? 1 : 0) & (((this.ARB_framebuffer_object_glGenFramebuffers_pointer = GLContext.getFunctionAddress("glGenFramebuffers")) != 0L) ? 1 : 0) & (((this.ARB_framebuffer_object_glCheckFramebufferStatus_pointer = GLContext.getFunctionAddress("glCheckFramebufferStatus")) != 0L) ? 1 : 0) & (((this.ARB_framebuffer_object_glFramebufferTexture1D_pointer = GLContext.getFunctionAddress("glFramebufferTexture1D")) != 0L) ? 1 : 0) & (((this.ARB_framebuffer_object_glFramebufferTexture2D_pointer = GLContext.getFunctionAddress("glFramebufferTexture2D")) != 0L) ? 1 : 0) & (((this.ARB_framebuffer_object_glFramebufferTexture3D_pointer = GLContext.getFunctionAddress("glFramebufferTexture3D")) != 0L) ? 1 : 0) & (((this.ARB_framebuffer_object_glFramebufferTextureLayer_pointer = GLContext.getFunctionAddress("glFramebufferTextureLayer")) != 0L) ? 1 : 0) & (((this.ARB_framebuffer_object_glFramebufferRenderbuffer_pointer = GLContext.getFunctionAddress("glFramebufferRenderbuffer")) != 0L) ? 1 : 0) & (((this.ARB_framebuffer_object_glGetFramebufferAttachmentParameteriv_pointer = GLContext.getFunctionAddress("glGetFramebufferAttachmentParameteriv")) != 0L) ? 1 : 0) & (((this.ARB_framebuffer_object_glBlitFramebuffer_pointer = GLContext.getFunctionAddress("glBlitFramebuffer")) != 0L) ? 1 : 0) & (((this.ARB_framebuffer_object_glGenerateMipmap_pointer = GLContext.getFunctionAddress("glGenerateMipmap")) != 0L) ? 1 : 0);
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
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private boolean ARB_geometry_shader4_initNativeFunctionAddresses() {
/* 2215 */     return (((this.ARB_geometry_shader4_glProgramParameteriARB_pointer = GLContext.getFunctionAddress("glProgramParameteriARB")) != 0L)) & (((this.ARB_geometry_shader4_glFramebufferTextureARB_pointer = GLContext.getFunctionAddress("glFramebufferTextureARB")) != 0L)) & (((this.ARB_geometry_shader4_glFramebufferTextureLayerARB_pointer = GLContext.getFunctionAddress("glFramebufferTextureLayerARB")) != 0L) ? 1 : 0) & (((this.ARB_geometry_shader4_glFramebufferTextureFaceARB_pointer = GLContext.getFunctionAddress("glFramebufferTextureFaceARB")) != 0L) ? 1 : 0);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private boolean ARB_gpu_shader_fp64_initNativeFunctionAddresses(Set supported_extensions) {
/* 2223 */     return (((this.ARB_gpu_shader_fp64_glUniform1d_pointer = GLContext.getFunctionAddress("glUniform1d")) != 0L)) & (((this.ARB_gpu_shader_fp64_glUniform2d_pointer = GLContext.getFunctionAddress("glUniform2d")) != 0L)) & (((this.ARB_gpu_shader_fp64_glUniform3d_pointer = GLContext.getFunctionAddress("glUniform3d")) != 0L) ? 1 : 0) & (((this.ARB_gpu_shader_fp64_glUniform4d_pointer = GLContext.getFunctionAddress("glUniform4d")) != 0L) ? 1 : 0) & (((this.ARB_gpu_shader_fp64_glUniform1dv_pointer = GLContext.getFunctionAddress("glUniform1dv")) != 0L) ? 1 : 0) & (((this.ARB_gpu_shader_fp64_glUniform2dv_pointer = GLContext.getFunctionAddress("glUniform2dv")) != 0L) ? 1 : 0) & (((this.ARB_gpu_shader_fp64_glUniform3dv_pointer = GLContext.getFunctionAddress("glUniform3dv")) != 0L) ? 1 : 0) & (((this.ARB_gpu_shader_fp64_glUniform4dv_pointer = GLContext.getFunctionAddress("glUniform4dv")) != 0L) ? 1 : 0) & (((this.ARB_gpu_shader_fp64_glUniformMatrix2dv_pointer = GLContext.getFunctionAddress("glUniformMatrix2dv")) != 0L) ? 1 : 0) & (((this.ARB_gpu_shader_fp64_glUniformMatrix3dv_pointer = GLContext.getFunctionAddress("glUniformMatrix3dv")) != 0L) ? 1 : 0) & (((this.ARB_gpu_shader_fp64_glUniformMatrix4dv_pointer = GLContext.getFunctionAddress("glUniformMatrix4dv")) != 0L) ? 1 : 0) & (((this.ARB_gpu_shader_fp64_glUniformMatrix2x3dv_pointer = GLContext.getFunctionAddress("glUniformMatrix2x3dv")) != 0L) ? 1 : 0) & (((this.ARB_gpu_shader_fp64_glUniformMatrix2x4dv_pointer = GLContext.getFunctionAddress("glUniformMatrix2x4dv")) != 0L) ? 1 : 0) & (((this.ARB_gpu_shader_fp64_glUniformMatrix3x2dv_pointer = GLContext.getFunctionAddress("glUniformMatrix3x2dv")) != 0L) ? 1 : 0) & (((this.ARB_gpu_shader_fp64_glUniformMatrix3x4dv_pointer = GLContext.getFunctionAddress("glUniformMatrix3x4dv")) != 0L) ? 1 : 0) & (((this.ARB_gpu_shader_fp64_glUniformMatrix4x2dv_pointer = GLContext.getFunctionAddress("glUniformMatrix4x2dv")) != 0L) ? 1 : 0) & (((this.ARB_gpu_shader_fp64_glUniformMatrix4x3dv_pointer = GLContext.getFunctionAddress("glUniformMatrix4x3dv")) != 0L) ? 1 : 0) & (((this.ARB_gpu_shader_fp64_glGetUniformdv_pointer = GLContext.getFunctionAddress("glGetUniformdv")) != 0L) ? 1 : 0) & ((!supported_extensions.contains("GL_EXT_direct_state_access") || (this.ARB_gpu_shader_fp64_glProgramUniform1dEXT_pointer = GLContext.getFunctionAddress("glProgramUniform1dEXT")) != 0L) ? 1 : 0) & ((!supported_extensions.contains("GL_EXT_direct_state_access") || (this.ARB_gpu_shader_fp64_glProgramUniform2dEXT_pointer = GLContext.getFunctionAddress("glProgramUniform2dEXT")) != 0L) ? 1 : 0) & ((!supported_extensions.contains("GL_EXT_direct_state_access") || (this.ARB_gpu_shader_fp64_glProgramUniform3dEXT_pointer = GLContext.getFunctionAddress("glProgramUniform3dEXT")) != 0L) ? 1 : 0) & ((!supported_extensions.contains("GL_EXT_direct_state_access") || (this.ARB_gpu_shader_fp64_glProgramUniform4dEXT_pointer = GLContext.getFunctionAddress("glProgramUniform4dEXT")) != 0L) ? 1 : 0) & ((!supported_extensions.contains("GL_EXT_direct_state_access") || (this.ARB_gpu_shader_fp64_glProgramUniform1dvEXT_pointer = GLContext.getFunctionAddress("glProgramUniform1dvEXT")) != 0L) ? 1 : 0) & ((!supported_extensions.contains("GL_EXT_direct_state_access") || (this.ARB_gpu_shader_fp64_glProgramUniform2dvEXT_pointer = GLContext.getFunctionAddress("glProgramUniform2dvEXT")) != 0L) ? 1 : 0) & ((!supported_extensions.contains("GL_EXT_direct_state_access") || (this.ARB_gpu_shader_fp64_glProgramUniform3dvEXT_pointer = GLContext.getFunctionAddress("glProgramUniform3dvEXT")) != 0L) ? 1 : 0) & ((!supported_extensions.contains("GL_EXT_direct_state_access") || (this.ARB_gpu_shader_fp64_glProgramUniform4dvEXT_pointer = GLContext.getFunctionAddress("glProgramUniform4dvEXT")) != 0L) ? 1 : 0) & ((!supported_extensions.contains("GL_EXT_direct_state_access") || (this.ARB_gpu_shader_fp64_glProgramUniformMatrix2dvEXT_pointer = GLContext.getFunctionAddress("glProgramUniformMatrix2dvEXT")) != 0L) ? 1 : 0) & ((!supported_extensions.contains("GL_EXT_direct_state_access") || (this.ARB_gpu_shader_fp64_glProgramUniformMatrix3dvEXT_pointer = GLContext.getFunctionAddress("glProgramUniformMatrix3dvEXT")) != 0L) ? 1 : 0) & ((!supported_extensions.contains("GL_EXT_direct_state_access") || (this.ARB_gpu_shader_fp64_glProgramUniformMatrix4dvEXT_pointer = GLContext.getFunctionAddress("glProgramUniformMatrix4dvEXT")) != 0L) ? 1 : 0) & ((!supported_extensions.contains("GL_EXT_direct_state_access") || (this.ARB_gpu_shader_fp64_glProgramUniformMatrix2x3dvEXT_pointer = GLContext.getFunctionAddress("glProgramUniformMatrix2x3dvEXT")) != 0L) ? 1 : 0) & ((!supported_extensions.contains("GL_EXT_direct_state_access") || (this.ARB_gpu_shader_fp64_glProgramUniformMatrix2x4dvEXT_pointer = GLContext.getFunctionAddress("glProgramUniformMatrix2x4dvEXT")) != 0L) ? 1 : 0) & ((!supported_extensions.contains("GL_EXT_direct_state_access") || (this.ARB_gpu_shader_fp64_glProgramUniformMatrix3x2dvEXT_pointer = GLContext.getFunctionAddress("glProgramUniformMatrix3x2dvEXT")) != 0L) ? 1 : 0) & ((!supported_extensions.contains("GL_EXT_direct_state_access") || (this.ARB_gpu_shader_fp64_glProgramUniformMatrix3x4dvEXT_pointer = GLContext.getFunctionAddress("glProgramUniformMatrix3x4dvEXT")) != 0L) ? 1 : 0) & ((!supported_extensions.contains("GL_EXT_direct_state_access") || (this.ARB_gpu_shader_fp64_glProgramUniformMatrix4x2dvEXT_pointer = GLContext.getFunctionAddress("glProgramUniformMatrix4x2dvEXT")) != 0L) ? 1 : 0) & ((!supported_extensions.contains("GL_EXT_direct_state_access") || (this.ARB_gpu_shader_fp64_glProgramUniformMatrix4x3dvEXT_pointer = GLContext.getFunctionAddress("glProgramUniformMatrix4x3dvEXT")) != 0L) ? 1 : 0);
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
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private boolean ARB_imaging_initNativeFunctionAddresses(boolean forwardCompatible) {
/* 2262 */     return ((forwardCompatible || (this.ARB_imaging_glColorTable_pointer = GLContext.getFunctionAddress("glColorTable")) != 0L)) & ((forwardCompatible || (this.ARB_imaging_glColorSubTable_pointer = GLContext.getFunctionAddress("glColorSubTable")) != 0L)) & ((forwardCompatible || (this.ARB_imaging_glColorTableParameteriv_pointer = GLContext.getFunctionAddress("glColorTableParameteriv")) != 0L) ? 1 : 0) & ((forwardCompatible || (this.ARB_imaging_glColorTableParameterfv_pointer = GLContext.getFunctionAddress("glColorTableParameterfv")) != 0L) ? 1 : 0) & ((forwardCompatible || (this.ARB_imaging_glCopyColorSubTable_pointer = GLContext.getFunctionAddress("glCopyColorSubTable")) != 0L) ? 1 : 0) & ((forwardCompatible || (this.ARB_imaging_glCopyColorTable_pointer = GLContext.getFunctionAddress("glCopyColorTable")) != 0L) ? 1 : 0) & ((forwardCompatible || (this.ARB_imaging_glGetColorTable_pointer = GLContext.getFunctionAddress("glGetColorTable")) != 0L) ? 1 : 0) & ((forwardCompatible || (this.ARB_imaging_glGetColorTableParameteriv_pointer = GLContext.getFunctionAddress("glGetColorTableParameteriv")) != 0L) ? 1 : 0) & ((forwardCompatible || (this.ARB_imaging_glGetColorTableParameterfv_pointer = GLContext.getFunctionAddress("glGetColorTableParameterfv")) != 0L) ? 1 : 0) & (((this.ARB_imaging_glBlendEquation_pointer = GLContext.getFunctionAddress("glBlendEquation")) != 0L) ? 1 : 0) & (((this.ARB_imaging_glBlendColor_pointer = GLContext.getFunctionAddress("glBlendColor")) != 0L) ? 1 : 0) & ((forwardCompatible || (this.ARB_imaging_glHistogram_pointer = GLContext.getFunctionAddress("glHistogram")) != 0L) ? 1 : 0) & ((forwardCompatible || (this.ARB_imaging_glResetHistogram_pointer = GLContext.getFunctionAddress("glResetHistogram")) != 0L) ? 1 : 0) & ((forwardCompatible || (this.ARB_imaging_glGetHistogram_pointer = GLContext.getFunctionAddress("glGetHistogram")) != 0L) ? 1 : 0) & ((forwardCompatible || (this.ARB_imaging_glGetHistogramParameterfv_pointer = GLContext.getFunctionAddress("glGetHistogramParameterfv")) != 0L) ? 1 : 0) & ((forwardCompatible || (this.ARB_imaging_glGetHistogramParameteriv_pointer = GLContext.getFunctionAddress("glGetHistogramParameteriv")) != 0L) ? 1 : 0) & ((forwardCompatible || (this.ARB_imaging_glMinmax_pointer = GLContext.getFunctionAddress("glMinmax")) != 0L) ? 1 : 0) & ((forwardCompatible || (this.ARB_imaging_glResetMinmax_pointer = GLContext.getFunctionAddress("glResetMinmax")) != 0L) ? 1 : 0) & ((forwardCompatible || (this.ARB_imaging_glGetMinmax_pointer = GLContext.getFunctionAddress("glGetMinmax")) != 0L) ? 1 : 0) & ((forwardCompatible || (this.ARB_imaging_glGetMinmaxParameterfv_pointer = GLContext.getFunctionAddress("glGetMinmaxParameterfv")) != 0L) ? 1 : 0) & ((forwardCompatible || (this.ARB_imaging_glGetMinmaxParameteriv_pointer = GLContext.getFunctionAddress("glGetMinmaxParameteriv")) != 0L) ? 1 : 0) & ((forwardCompatible || (this.ARB_imaging_glConvolutionFilter1D_pointer = GLContext.getFunctionAddress("glConvolutionFilter1D")) != 0L) ? 1 : 0) & ((forwardCompatible || (this.ARB_imaging_glConvolutionFilter2D_pointer = GLContext.getFunctionAddress("glConvolutionFilter2D")) != 0L) ? 1 : 0) & ((forwardCompatible || (this.ARB_imaging_glConvolutionParameterf_pointer = GLContext.getFunctionAddress("glConvolutionParameterf")) != 0L) ? 1 : 0) & ((forwardCompatible || (this.ARB_imaging_glConvolutionParameterfv_pointer = GLContext.getFunctionAddress("glConvolutionParameterfv")) != 0L) ? 1 : 0) & ((forwardCompatible || (this.ARB_imaging_glConvolutionParameteri_pointer = GLContext.getFunctionAddress("glConvolutionParameteri")) != 0L) ? 1 : 0) & ((forwardCompatible || (this.ARB_imaging_glConvolutionParameteriv_pointer = GLContext.getFunctionAddress("glConvolutionParameteriv")) != 0L) ? 1 : 0) & ((forwardCompatible || (this.ARB_imaging_glCopyConvolutionFilter1D_pointer = GLContext.getFunctionAddress("glCopyConvolutionFilter1D")) != 0L) ? 1 : 0) & ((forwardCompatible || (this.ARB_imaging_glCopyConvolutionFilter2D_pointer = GLContext.getFunctionAddress("glCopyConvolutionFilter2D")) != 0L) ? 1 : 0) & ((forwardCompatible || (this.ARB_imaging_glGetConvolutionFilter_pointer = GLContext.getFunctionAddress("glGetConvolutionFilter")) != 0L) ? 1 : 0) & ((forwardCompatible || (this.ARB_imaging_glGetConvolutionParameterfv_pointer = GLContext.getFunctionAddress("glGetConvolutionParameterfv")) != 0L) ? 1 : 0) & ((forwardCompatible || (this.ARB_imaging_glGetConvolutionParameteriv_pointer = GLContext.getFunctionAddress("glGetConvolutionParameteriv")) != 0L) ? 1 : 0) & ((forwardCompatible || (this.ARB_imaging_glSeparableFilter2D_pointer = GLContext.getFunctionAddress("glSeparableFilter2D")) != 0L) ? 1 : 0) & ((forwardCompatible || (this.ARB_imaging_glGetSeparableFilter_pointer = GLContext.getFunctionAddress("glGetSeparableFilter")) != 0L) ? 1 : 0);
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
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private boolean ARB_instanced_arrays_initNativeFunctionAddresses() {
/* 2300 */     return ((this.ARB_instanced_arrays_glVertexAttribDivisorARB_pointer = GLContext.getFunctionAddress("glVertexAttribDivisorARB")) != 0L);
/*      */   }
/*      */ 
/*      */   
/*      */   private boolean ARB_map_buffer_range_initNativeFunctionAddresses() {
/* 2305 */     return (((this.ARB_map_buffer_range_glMapBufferRange_pointer = GLContext.getFunctionAddress("glMapBufferRange")) != 0L)) & (((this.ARB_map_buffer_range_glFlushMappedBufferRange_pointer = GLContext.getFunctionAddress("glFlushMappedBufferRange")) != 0L));
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   private boolean ARB_matrix_palette_initNativeFunctionAddresses() {
/* 2311 */     return (((this.ARB_matrix_palette_glCurrentPaletteMatrixARB_pointer = GLContext.getFunctionAddress("glCurrentPaletteMatrixARB")) != 0L)) & (((this.ARB_matrix_palette_glMatrixIndexPointerARB_pointer = GLContext.getFunctionAddress("glMatrixIndexPointerARB")) != 0L)) & (((this.ARB_matrix_palette_glMatrixIndexubvARB_pointer = GLContext.getFunctionAddress("glMatrixIndexubvARB")) != 0L) ? 1 : 0) & (((this.ARB_matrix_palette_glMatrixIndexusvARB_pointer = GLContext.getFunctionAddress("glMatrixIndexusvARB")) != 0L) ? 1 : 0) & (((this.ARB_matrix_palette_glMatrixIndexuivARB_pointer = GLContext.getFunctionAddress("glMatrixIndexuivARB")) != 0L) ? 1 : 0);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private boolean ARB_multisample_initNativeFunctionAddresses() {
/* 2320 */     return ((this.ARB_multisample_glSampleCoverageARB_pointer = GLContext.getFunctionAddress("glSampleCoverageARB")) != 0L);
/*      */   }
/*      */ 
/*      */   
/*      */   private boolean ARB_multitexture_initNativeFunctionAddresses() {
/* 2325 */     return (((this.ARB_multitexture_glClientActiveTextureARB_pointer = GLContext.getFunctionAddress("glClientActiveTextureARB")) != 0L)) & (((this.ARB_multitexture_glActiveTextureARB_pointer = GLContext.getFunctionAddress("glActiveTextureARB")) != 0L)) & (((this.ARB_multitexture_glMultiTexCoord1fARB_pointer = GLContext.getFunctionAddress("glMultiTexCoord1fARB")) != 0L) ? 1 : 0) & (((this.ARB_multitexture_glMultiTexCoord1dARB_pointer = GLContext.getFunctionAddress("glMultiTexCoord1dARB")) != 0L) ? 1 : 0) & (((this.ARB_multitexture_glMultiTexCoord1iARB_pointer = GLContext.getFunctionAddress("glMultiTexCoord1iARB")) != 0L) ? 1 : 0) & (((this.ARB_multitexture_glMultiTexCoord1sARB_pointer = GLContext.getFunctionAddress("glMultiTexCoord1sARB")) != 0L) ? 1 : 0) & (((this.ARB_multitexture_glMultiTexCoord2fARB_pointer = GLContext.getFunctionAddress("glMultiTexCoord2fARB")) != 0L) ? 1 : 0) & (((this.ARB_multitexture_glMultiTexCoord2dARB_pointer = GLContext.getFunctionAddress("glMultiTexCoord2dARB")) != 0L) ? 1 : 0) & (((this.ARB_multitexture_glMultiTexCoord2iARB_pointer = GLContext.getFunctionAddress("glMultiTexCoord2iARB")) != 0L) ? 1 : 0) & (((this.ARB_multitexture_glMultiTexCoord2sARB_pointer = GLContext.getFunctionAddress("glMultiTexCoord2sARB")) != 0L) ? 1 : 0) & (((this.ARB_multitexture_glMultiTexCoord3fARB_pointer = GLContext.getFunctionAddress("glMultiTexCoord3fARB")) != 0L) ? 1 : 0) & (((this.ARB_multitexture_glMultiTexCoord3dARB_pointer = GLContext.getFunctionAddress("glMultiTexCoord3dARB")) != 0L) ? 1 : 0) & (((this.ARB_multitexture_glMultiTexCoord3iARB_pointer = GLContext.getFunctionAddress("glMultiTexCoord3iARB")) != 0L) ? 1 : 0) & (((this.ARB_multitexture_glMultiTexCoord3sARB_pointer = GLContext.getFunctionAddress("glMultiTexCoord3sARB")) != 0L) ? 1 : 0) & (((this.ARB_multitexture_glMultiTexCoord4fARB_pointer = GLContext.getFunctionAddress("glMultiTexCoord4fARB")) != 0L) ? 1 : 0) & (((this.ARB_multitexture_glMultiTexCoord4dARB_pointer = GLContext.getFunctionAddress("glMultiTexCoord4dARB")) != 0L) ? 1 : 0) & (((this.ARB_multitexture_glMultiTexCoord4iARB_pointer = GLContext.getFunctionAddress("glMultiTexCoord4iARB")) != 0L) ? 1 : 0) & (((this.ARB_multitexture_glMultiTexCoord4sARB_pointer = GLContext.getFunctionAddress("glMultiTexCoord4sARB")) != 0L) ? 1 : 0);
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
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private boolean ARB_occlusion_query_initNativeFunctionAddresses() {
/* 2347 */     return (((this.ARB_occlusion_query_glGenQueriesARB_pointer = GLContext.getFunctionAddress("glGenQueriesARB")) != 0L)) & (((this.ARB_occlusion_query_glDeleteQueriesARB_pointer = GLContext.getFunctionAddress("glDeleteQueriesARB")) != 0L)) & (((this.ARB_occlusion_query_glIsQueryARB_pointer = GLContext.getFunctionAddress("glIsQueryARB")) != 0L) ? 1 : 0) & (((this.ARB_occlusion_query_glBeginQueryARB_pointer = GLContext.getFunctionAddress("glBeginQueryARB")) != 0L) ? 1 : 0) & (((this.ARB_occlusion_query_glEndQueryARB_pointer = GLContext.getFunctionAddress("glEndQueryARB")) != 0L) ? 1 : 0) & (((this.ARB_occlusion_query_glGetQueryivARB_pointer = GLContext.getFunctionAddress("glGetQueryivARB")) != 0L) ? 1 : 0) & (((this.ARB_occlusion_query_glGetQueryObjectivARB_pointer = GLContext.getFunctionAddress("glGetQueryObjectivARB")) != 0L) ? 1 : 0) & (((this.ARB_occlusion_query_glGetQueryObjectuivARB_pointer = GLContext.getFunctionAddress("glGetQueryObjectuivARB")) != 0L) ? 1 : 0);
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
/*      */   private boolean ARB_point_parameters_initNativeFunctionAddresses() {
/* 2359 */     return (((this.ARB_point_parameters_glPointParameterfARB_pointer = GLContext.getFunctionAddress("glPointParameterfARB")) != 0L)) & (((this.ARB_point_parameters_glPointParameterfvARB_pointer = GLContext.getFunctionAddress("glPointParameterfvARB")) != 0L));
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   private boolean ARB_program_initNativeFunctionAddresses() {
/* 2365 */     return (((this.ARB_program_glProgramStringARB_pointer = GLContext.getFunctionAddress("glProgramStringARB")) != 0L)) & (((this.ARB_program_glBindProgramARB_pointer = GLContext.getFunctionAddress("glBindProgramARB")) != 0L)) & (((this.ARB_program_glDeleteProgramsARB_pointer = GLContext.getFunctionAddress("glDeleteProgramsARB")) != 0L) ? 1 : 0) & (((this.ARB_program_glGenProgramsARB_pointer = GLContext.getFunctionAddress("glGenProgramsARB")) != 0L) ? 1 : 0) & (((this.ARB_program_glProgramEnvParameter4fARB_pointer = GLContext.getFunctionAddress("glProgramEnvParameter4fARB")) != 0L) ? 1 : 0) & (((this.ARB_program_glProgramEnvParameter4dARB_pointer = GLContext.getFunctionAddress("glProgramEnvParameter4dARB")) != 0L) ? 1 : 0) & (((this.ARB_program_glProgramEnvParameter4fvARB_pointer = GLContext.getFunctionAddress("glProgramEnvParameter4fvARB")) != 0L) ? 1 : 0) & (((this.ARB_program_glProgramEnvParameter4dvARB_pointer = GLContext.getFunctionAddress("glProgramEnvParameter4dvARB")) != 0L) ? 1 : 0) & (((this.ARB_program_glProgramLocalParameter4fARB_pointer = GLContext.getFunctionAddress("glProgramLocalParameter4fARB")) != 0L) ? 1 : 0) & (((this.ARB_program_glProgramLocalParameter4dARB_pointer = GLContext.getFunctionAddress("glProgramLocalParameter4dARB")) != 0L) ? 1 : 0) & (((this.ARB_program_glProgramLocalParameter4fvARB_pointer = GLContext.getFunctionAddress("glProgramLocalParameter4fvARB")) != 0L) ? 1 : 0) & (((this.ARB_program_glProgramLocalParameter4dvARB_pointer = GLContext.getFunctionAddress("glProgramLocalParameter4dvARB")) != 0L) ? 1 : 0) & (((this.ARB_program_glGetProgramEnvParameterfvARB_pointer = GLContext.getFunctionAddress("glGetProgramEnvParameterfvARB")) != 0L) ? 1 : 0) & (((this.ARB_program_glGetProgramEnvParameterdvARB_pointer = GLContext.getFunctionAddress("glGetProgramEnvParameterdvARB")) != 0L) ? 1 : 0) & (((this.ARB_program_glGetProgramLocalParameterfvARB_pointer = GLContext.getFunctionAddress("glGetProgramLocalParameterfvARB")) != 0L) ? 1 : 0) & (((this.ARB_program_glGetProgramLocalParameterdvARB_pointer = GLContext.getFunctionAddress("glGetProgramLocalParameterdvARB")) != 0L) ? 1 : 0) & (((this.ARB_program_glGetProgramivARB_pointer = GLContext.getFunctionAddress("glGetProgramivARB")) != 0L) ? 1 : 0) & (((this.ARB_program_glGetProgramStringARB_pointer = GLContext.getFunctionAddress("glGetProgramStringARB")) != 0L) ? 1 : 0) & (((this.ARB_program_glIsProgramARB_pointer = GLContext.getFunctionAddress("glIsProgramARB")) != 0L) ? 1 : 0);
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
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private boolean ARB_provoking_vertex_initNativeFunctionAddresses() {
/* 2388 */     return ((this.ARB_provoking_vertex_glProvokingVertex_pointer = GLContext.getFunctionAddress("glProvokingVertex")) != 0L);
/*      */   }
/*      */ 
/*      */   
/*      */   private boolean ARB_sample_shading_initNativeFunctionAddresses() {
/* 2393 */     return ((this.ARB_sample_shading_glMinSampleShadingARB_pointer = GLContext.getFunctionAddress("glMinSampleShadingARB")) != 0L);
/*      */   }
/*      */ 
/*      */   
/*      */   private boolean ARB_sampler_objects_initNativeFunctionAddresses() {
/* 2398 */     return (((this.ARB_sampler_objects_glGenSamplers_pointer = GLContext.getFunctionAddress("glGenSamplers")) != 0L)) & (((this.ARB_sampler_objects_glDeleteSamplers_pointer = GLContext.getFunctionAddress("glDeleteSamplers")) != 0L)) & (((this.ARB_sampler_objects_glIsSampler_pointer = GLContext.getFunctionAddress("glIsSampler")) != 0L) ? 1 : 0) & (((this.ARB_sampler_objects_glBindSampler_pointer = GLContext.getFunctionAddress("glBindSampler")) != 0L) ? 1 : 0) & (((this.ARB_sampler_objects_glSamplerParameteri_pointer = GLContext.getFunctionAddress("glSamplerParameteri")) != 0L) ? 1 : 0) & (((this.ARB_sampler_objects_glSamplerParameterf_pointer = GLContext.getFunctionAddress("glSamplerParameterf")) != 0L) ? 1 : 0) & (((this.ARB_sampler_objects_glSamplerParameteriv_pointer = GLContext.getFunctionAddress("glSamplerParameteriv")) != 0L) ? 1 : 0) & (((this.ARB_sampler_objects_glSamplerParameterfv_pointer = GLContext.getFunctionAddress("glSamplerParameterfv")) != 0L) ? 1 : 0) & (((this.ARB_sampler_objects_glSamplerParameterIiv_pointer = GLContext.getFunctionAddress("glSamplerParameterIiv")) != 0L) ? 1 : 0) & (((this.ARB_sampler_objects_glSamplerParameterIuiv_pointer = GLContext.getFunctionAddress("glSamplerParameterIuiv")) != 0L) ? 1 : 0) & (((this.ARB_sampler_objects_glGetSamplerParameteriv_pointer = GLContext.getFunctionAddress("glGetSamplerParameteriv")) != 0L) ? 1 : 0) & (((this.ARB_sampler_objects_glGetSamplerParameterfv_pointer = GLContext.getFunctionAddress("glGetSamplerParameterfv")) != 0L) ? 1 : 0) & (((this.ARB_sampler_objects_glGetSamplerParameterIiv_pointer = GLContext.getFunctionAddress("glGetSamplerParameterIiv")) != 0L) ? 1 : 0) & (((this.ARB_sampler_objects_glGetSamplerParameterIuiv_pointer = GLContext.getFunctionAddress("glGetSamplerParameterIuiv")) != 0L) ? 1 : 0);
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
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private boolean ARB_shader_objects_initNativeFunctionAddresses() {
/* 2416 */     return (((this.ARB_shader_objects_glDeleteObjectARB_pointer = GLContext.getFunctionAddress("glDeleteObjectARB")) != 0L)) & (((this.ARB_shader_objects_glGetHandleARB_pointer = GLContext.getFunctionAddress("glGetHandleARB")) != 0L)) & (((this.ARB_shader_objects_glDetachObjectARB_pointer = GLContext.getFunctionAddress("glDetachObjectARB")) != 0L) ? 1 : 0) & (((this.ARB_shader_objects_glCreateShaderObjectARB_pointer = GLContext.getFunctionAddress("glCreateShaderObjectARB")) != 0L) ? 1 : 0) & (((this.ARB_shader_objects_glShaderSourceARB_pointer = GLContext.getFunctionAddress("glShaderSourceARB")) != 0L) ? 1 : 0) & (((this.ARB_shader_objects_glCompileShaderARB_pointer = GLContext.getFunctionAddress("glCompileShaderARB")) != 0L) ? 1 : 0) & (((this.ARB_shader_objects_glCreateProgramObjectARB_pointer = GLContext.getFunctionAddress("glCreateProgramObjectARB")) != 0L) ? 1 : 0) & (((this.ARB_shader_objects_glAttachObjectARB_pointer = GLContext.getFunctionAddress("glAttachObjectARB")) != 0L) ? 1 : 0) & (((this.ARB_shader_objects_glLinkProgramARB_pointer = GLContext.getFunctionAddress("glLinkProgramARB")) != 0L) ? 1 : 0) & (((this.ARB_shader_objects_glUseProgramObjectARB_pointer = GLContext.getFunctionAddress("glUseProgramObjectARB")) != 0L) ? 1 : 0) & (((this.ARB_shader_objects_glValidateProgramARB_pointer = GLContext.getFunctionAddress("glValidateProgramARB")) != 0L) ? 1 : 0) & (((this.ARB_shader_objects_glUniform1fARB_pointer = GLContext.getFunctionAddress("glUniform1fARB")) != 0L) ? 1 : 0) & (((this.ARB_shader_objects_glUniform2fARB_pointer = GLContext.getFunctionAddress("glUniform2fARB")) != 0L) ? 1 : 0) & (((this.ARB_shader_objects_glUniform3fARB_pointer = GLContext.getFunctionAddress("glUniform3fARB")) != 0L) ? 1 : 0) & (((this.ARB_shader_objects_glUniform4fARB_pointer = GLContext.getFunctionAddress("glUniform4fARB")) != 0L) ? 1 : 0) & (((this.ARB_shader_objects_glUniform1iARB_pointer = GLContext.getFunctionAddress("glUniform1iARB")) != 0L) ? 1 : 0) & (((this.ARB_shader_objects_glUniform2iARB_pointer = GLContext.getFunctionAddress("glUniform2iARB")) != 0L) ? 1 : 0) & (((this.ARB_shader_objects_glUniform3iARB_pointer = GLContext.getFunctionAddress("glUniform3iARB")) != 0L) ? 1 : 0) & (((this.ARB_shader_objects_glUniform4iARB_pointer = GLContext.getFunctionAddress("glUniform4iARB")) != 0L) ? 1 : 0) & (((this.ARB_shader_objects_glUniform1fvARB_pointer = GLContext.getFunctionAddress("glUniform1fvARB")) != 0L) ? 1 : 0) & (((this.ARB_shader_objects_glUniform2fvARB_pointer = GLContext.getFunctionAddress("glUniform2fvARB")) != 0L) ? 1 : 0) & (((this.ARB_shader_objects_glUniform3fvARB_pointer = GLContext.getFunctionAddress("glUniform3fvARB")) != 0L) ? 1 : 0) & (((this.ARB_shader_objects_glUniform4fvARB_pointer = GLContext.getFunctionAddress("glUniform4fvARB")) != 0L) ? 1 : 0) & (((this.ARB_shader_objects_glUniform1ivARB_pointer = GLContext.getFunctionAddress("glUniform1ivARB")) != 0L) ? 1 : 0) & (((this.ARB_shader_objects_glUniform2ivARB_pointer = GLContext.getFunctionAddress("glUniform2ivARB")) != 0L) ? 1 : 0) & (((this.ARB_shader_objects_glUniform3ivARB_pointer = GLContext.getFunctionAddress("glUniform3ivARB")) != 0L) ? 1 : 0) & (((this.ARB_shader_objects_glUniform4ivARB_pointer = GLContext.getFunctionAddress("glUniform4ivARB")) != 0L) ? 1 : 0) & (((this.ARB_shader_objects_glUniformMatrix2fvARB_pointer = GLContext.getFunctionAddress("glUniformMatrix2fvARB")) != 0L) ? 1 : 0) & (((this.ARB_shader_objects_glUniformMatrix3fvARB_pointer = GLContext.getFunctionAddress("glUniformMatrix3fvARB")) != 0L) ? 1 : 0) & (((this.ARB_shader_objects_glUniformMatrix4fvARB_pointer = GLContext.getFunctionAddress("glUniformMatrix4fvARB")) != 0L) ? 1 : 0) & (((this.ARB_shader_objects_glGetObjectParameterfvARB_pointer = GLContext.getFunctionAddress("glGetObjectParameterfvARB")) != 0L) ? 1 : 0) & (((this.ARB_shader_objects_glGetObjectParameterivARB_pointer = GLContext.getFunctionAddress("glGetObjectParameterivARB")) != 0L) ? 1 : 0) & (((this.ARB_shader_objects_glGetInfoLogARB_pointer = GLContext.getFunctionAddress("glGetInfoLogARB")) != 0L) ? 1 : 0) & (((this.ARB_shader_objects_glGetAttachedObjectsARB_pointer = GLContext.getFunctionAddress("glGetAttachedObjectsARB")) != 0L) ? 1 : 0) & (((this.ARB_shader_objects_glGetUniformLocationARB_pointer = GLContext.getFunctionAddress("glGetUniformLocationARB")) != 0L) ? 1 : 0) & (((this.ARB_shader_objects_glGetActiveUniformARB_pointer = GLContext.getFunctionAddress("glGetActiveUniformARB")) != 0L) ? 1 : 0) & (((this.ARB_shader_objects_glGetUniformfvARB_pointer = GLContext.getFunctionAddress("glGetUniformfvARB")) != 0L) ? 1 : 0) & (((this.ARB_shader_objects_glGetUniformivARB_pointer = GLContext.getFunctionAddress("glGetUniformivARB")) != 0L) ? 1 : 0) & (((this.ARB_shader_objects_glGetShaderSourceARB_pointer = GLContext.getFunctionAddress("glGetShaderSourceARB")) != 0L) ? 1 : 0);
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
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private boolean ARB_shader_subroutine_initNativeFunctionAddresses() {
/* 2459 */     return (((this.ARB_shader_subroutine_glGetSubroutineUniformLocation_pointer = GLContext.getFunctionAddress("glGetSubroutineUniformLocation")) != 0L)) & (((this.ARB_shader_subroutine_glGetSubroutineIndex_pointer = GLContext.getFunctionAddress("glGetSubroutineIndex")) != 0L)) & (((this.ARB_shader_subroutine_glGetActiveSubroutineUniformiv_pointer = GLContext.getFunctionAddress("glGetActiveSubroutineUniformiv")) != 0L) ? 1 : 0) & (((this.ARB_shader_subroutine_glGetActiveSubroutineUniformName_pointer = GLContext.getFunctionAddress("glGetActiveSubroutineUniformName")) != 0L) ? 1 : 0) & (((this.ARB_shader_subroutine_glGetActiveSubroutineName_pointer = GLContext.getFunctionAddress("glGetActiveSubroutineName")) != 0L) ? 1 : 0) & (((this.ARB_shader_subroutine_glUniformSubroutinesuiv_pointer = GLContext.getFunctionAddress("glUniformSubroutinesuiv")) != 0L) ? 1 : 0) & (((this.ARB_shader_subroutine_glGetUniformSubroutineuiv_pointer = GLContext.getFunctionAddress("glGetUniformSubroutineuiv")) != 0L) ? 1 : 0) & (((this.ARB_shader_subroutine_glGetProgramStageiv_pointer = GLContext.getFunctionAddress("glGetProgramStageiv")) != 0L) ? 1 : 0);
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
/*      */   private boolean ARB_shading_language_include_initNativeFunctionAddresses() {
/* 2471 */     return (((this.ARB_shading_language_include_glNamedStringARB_pointer = GLContext.getFunctionAddress("glNamedStringARB")) != 0L)) & (((this.ARB_shading_language_include_glDeleteNamedStringARB_pointer = GLContext.getFunctionAddress("glDeleteNamedStringARB")) != 0L)) & (((this.ARB_shading_language_include_glCompileShaderIncludeARB_pointer = GLContext.getFunctionAddress("glCompileShaderIncludeARB")) != 0L) ? 1 : 0) & (((this.ARB_shading_language_include_glIsNamedStringARB_pointer = GLContext.getFunctionAddress("glIsNamedStringARB")) != 0L) ? 1 : 0) & (((this.ARB_shading_language_include_glGetNamedStringARB_pointer = GLContext.getFunctionAddress("glGetNamedStringARB")) != 0L) ? 1 : 0) & (((this.ARB_shading_language_include_glGetNamedStringivARB_pointer = GLContext.getFunctionAddress("glGetNamedStringivARB")) != 0L) ? 1 : 0);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private boolean ARB_sync_initNativeFunctionAddresses() {
/* 2481 */     return (((this.ARB_sync_glFenceSync_pointer = GLContext.getFunctionAddress("glFenceSync")) != 0L)) & (((this.ARB_sync_glIsSync_pointer = GLContext.getFunctionAddress("glIsSync")) != 0L)) & (((this.ARB_sync_glDeleteSync_pointer = GLContext.getFunctionAddress("glDeleteSync")) != 0L) ? 1 : 0) & (((this.ARB_sync_glClientWaitSync_pointer = GLContext.getFunctionAddress("glClientWaitSync")) != 0L) ? 1 : 0) & (((this.ARB_sync_glWaitSync_pointer = GLContext.getFunctionAddress("glWaitSync")) != 0L) ? 1 : 0) & (((this.ARB_sync_glGetInteger64v_pointer = GLContext.getFunctionAddress("glGetInteger64v")) != 0L) ? 1 : 0) & (((this.ARB_sync_glGetSynciv_pointer = GLContext.getFunctionAddress("glGetSynciv")) != 0L) ? 1 : 0);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private boolean ARB_tessellation_shader_initNativeFunctionAddresses() {
/* 2492 */     return (((this.ARB_tessellation_shader_glPatchParameteri_pointer = GLContext.getFunctionAddress("glPatchParameteri")) != 0L)) & (((this.ARB_tessellation_shader_glPatchParameterfv_pointer = GLContext.getFunctionAddress("glPatchParameterfv")) != 0L));
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   private boolean ARB_texture_buffer_object_initNativeFunctionAddresses() {
/* 2498 */     return ((this.ARB_texture_buffer_object_glTexBufferARB_pointer = GLContext.getFunctionAddress("glTexBufferARB")) != 0L);
/*      */   }
/*      */ 
/*      */   
/*      */   private boolean ARB_texture_compression_initNativeFunctionAddresses() {
/* 2503 */     return (((this.ARB_texture_compression_glCompressedTexImage1DARB_pointer = GLContext.getFunctionAddress("glCompressedTexImage1DARB")) != 0L)) & (((this.ARB_texture_compression_glCompressedTexImage2DARB_pointer = GLContext.getFunctionAddress("glCompressedTexImage2DARB")) != 0L)) & (((this.ARB_texture_compression_glCompressedTexImage3DARB_pointer = GLContext.getFunctionAddress("glCompressedTexImage3DARB")) != 0L) ? 1 : 0) & (((this.ARB_texture_compression_glCompressedTexSubImage1DARB_pointer = GLContext.getFunctionAddress("glCompressedTexSubImage1DARB")) != 0L) ? 1 : 0) & (((this.ARB_texture_compression_glCompressedTexSubImage2DARB_pointer = GLContext.getFunctionAddress("glCompressedTexSubImage2DARB")) != 0L) ? 1 : 0) & (((this.ARB_texture_compression_glCompressedTexSubImage3DARB_pointer = GLContext.getFunctionAddress("glCompressedTexSubImage3DARB")) != 0L) ? 1 : 0) & (((this.ARB_texture_compression_glGetCompressedTexImageARB_pointer = GLContext.getFunctionAddress("glGetCompressedTexImageARB")) != 0L) ? 1 : 0);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private boolean ARB_texture_multisample_initNativeFunctionAddresses() {
/* 2514 */     return (((this.ARB_texture_multisample_glTexImage2DMultisample_pointer = GLContext.getFunctionAddress("glTexImage2DMultisample")) != 0L)) & (((this.ARB_texture_multisample_glTexImage3DMultisample_pointer = GLContext.getFunctionAddress("glTexImage3DMultisample")) != 0L)) & (((this.ARB_texture_multisample_glGetMultisamplefv_pointer = GLContext.getFunctionAddress("glGetMultisamplefv")) != 0L) ? 1 : 0) & (((this.ARB_texture_multisample_glSampleMaski_pointer = GLContext.getFunctionAddress("glSampleMaski")) != 0L) ? 1 : 0);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private boolean ARB_timer_query_initNativeFunctionAddresses() {
/* 2522 */     return (((this.ARB_timer_query_glQueryCounter_pointer = GLContext.getFunctionAddress("glQueryCounter")) != 0L)) & (((this.ARB_timer_query_glGetQueryObjecti64v_pointer = GLContext.getFunctionAddress("glGetQueryObjecti64v")) != 0L)) & (((this.ARB_timer_query_glGetQueryObjectui64v_pointer = GLContext.getFunctionAddress("glGetQueryObjectui64v")) != 0L) ? 1 : 0);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private boolean ARB_transform_feedback2_initNativeFunctionAddresses() {
/* 2529 */     return (((this.ARB_transform_feedback2_glBindTransformFeedback_pointer = GLContext.getFunctionAddress("glBindTransformFeedback")) != 0L)) & (((this.ARB_transform_feedback2_glDeleteTransformFeedbacks_pointer = GLContext.getFunctionAddress("glDeleteTransformFeedbacks")) != 0L)) & (((this.ARB_transform_feedback2_glGenTransformFeedbacks_pointer = GLContext.getFunctionAddress("glGenTransformFeedbacks")) != 0L) ? 1 : 0) & (((this.ARB_transform_feedback2_glIsTransformFeedback_pointer = GLContext.getFunctionAddress("glIsTransformFeedback")) != 0L) ? 1 : 0) & (((this.ARB_transform_feedback2_glPauseTransformFeedback_pointer = GLContext.getFunctionAddress("glPauseTransformFeedback")) != 0L) ? 1 : 0) & (((this.ARB_transform_feedback2_glResumeTransformFeedback_pointer = GLContext.getFunctionAddress("glResumeTransformFeedback")) != 0L) ? 1 : 0) & (((this.ARB_transform_feedback2_glDrawTransformFeedback_pointer = GLContext.getFunctionAddress("glDrawTransformFeedback")) != 0L) ? 1 : 0);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private boolean ARB_transform_feedback3_initNativeFunctionAddresses() {
/* 2540 */     return (((this.ARB_transform_feedback3_glDrawTransformFeedbackStream_pointer = GLContext.getFunctionAddress("glDrawTransformFeedbackStream")) != 0L)) & (((this.ARB_transform_feedback3_glBeginQueryIndexed_pointer = GLContext.getFunctionAddress("glBeginQueryIndexed")) != 0L)) & (((this.ARB_transform_feedback3_glEndQueryIndexed_pointer = GLContext.getFunctionAddress("glEndQueryIndexed")) != 0L) ? 1 : 0) & (((this.ARB_transform_feedback3_glGetQueryIndexediv_pointer = GLContext.getFunctionAddress("glGetQueryIndexediv")) != 0L) ? 1 : 0);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private boolean ARB_transpose_matrix_initNativeFunctionAddresses() {
/* 2548 */     return (((this.ARB_transpose_matrix_glLoadTransposeMatrixfARB_pointer = GLContext.getFunctionAddress("glLoadTransposeMatrixfARB")) != 0L)) & (((this.ARB_transpose_matrix_glMultTransposeMatrixfARB_pointer = GLContext.getFunctionAddress("glMultTransposeMatrixfARB")) != 0L));
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   private boolean ARB_uniform_buffer_object_initNativeFunctionAddresses() {
/* 2554 */     return (((this.ARB_uniform_buffer_object_glGetUniformIndices_pointer = GLContext.getFunctionAddress("glGetUniformIndices")) != 0L)) & (((this.ARB_uniform_buffer_object_glGetActiveUniformsiv_pointer = GLContext.getFunctionAddress("glGetActiveUniformsiv")) != 0L)) & (((this.ARB_uniform_buffer_object_glGetActiveUniformName_pointer = GLContext.getFunctionAddress("glGetActiveUniformName")) != 0L) ? 1 : 0) & (((this.ARB_uniform_buffer_object_glGetUniformBlockIndex_pointer = GLContext.getFunctionAddress("glGetUniformBlockIndex")) != 0L) ? 1 : 0) & (((this.ARB_uniform_buffer_object_glGetActiveUniformBlockiv_pointer = GLContext.getFunctionAddress("glGetActiveUniformBlockiv")) != 0L) ? 1 : 0) & (((this.ARB_uniform_buffer_object_glGetActiveUniformBlockName_pointer = GLContext.getFunctionAddress("glGetActiveUniformBlockName")) != 0L) ? 1 : 0) & (((this.ARB_uniform_buffer_object_glBindBufferRange_pointer = GLContext.getFunctionAddress("glBindBufferRange")) != 0L) ? 1 : 0) & (((this.ARB_uniform_buffer_object_glBindBufferBase_pointer = GLContext.getFunctionAddress("glBindBufferBase")) != 0L) ? 1 : 0) & (((this.ARB_uniform_buffer_object_glGetIntegeri_v_pointer = GLContext.getFunctionAddress("glGetIntegeri_v")) != 0L) ? 1 : 0) & (((this.ARB_uniform_buffer_object_glUniformBlockBinding_pointer = GLContext.getFunctionAddress("glUniformBlockBinding")) != 0L) ? 1 : 0);
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
/*      */ 
/*      */   
/*      */   private boolean ARB_vertex_array_object_initNativeFunctionAddresses() {
/* 2568 */     return (((this.ARB_vertex_array_object_glBindVertexArray_pointer = GLContext.getFunctionAddress("glBindVertexArray")) != 0L)) & (((this.ARB_vertex_array_object_glDeleteVertexArrays_pointer = GLContext.getFunctionAddress("glDeleteVertexArrays")) != 0L)) & (((this.ARB_vertex_array_object_glGenVertexArrays_pointer = GLContext.getFunctionAddress("glGenVertexArrays")) != 0L) ? 1 : 0) & (((this.ARB_vertex_array_object_glIsVertexArray_pointer = GLContext.getFunctionAddress("glIsVertexArray")) != 0L) ? 1 : 0);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private boolean ARB_vertex_blend_initNativeFunctionAddresses() {
/* 2576 */     return (((this.ARB_vertex_blend_glWeightbvARB_pointer = GLContext.getFunctionAddress("glWeightbvARB")) != 0L)) & (((this.ARB_vertex_blend_glWeightsvARB_pointer = GLContext.getFunctionAddress("glWeightsvARB")) != 0L)) & (((this.ARB_vertex_blend_glWeightivARB_pointer = GLContext.getFunctionAddress("glWeightivARB")) != 0L) ? 1 : 0) & (((this.ARB_vertex_blend_glWeightfvARB_pointer = GLContext.getFunctionAddress("glWeightfvARB")) != 0L) ? 1 : 0) & (((this.ARB_vertex_blend_glWeightdvARB_pointer = GLContext.getFunctionAddress("glWeightdvARB")) != 0L) ? 1 : 0) & (((this.ARB_vertex_blend_glWeightubvARB_pointer = GLContext.getFunctionAddress("glWeightubvARB")) != 0L) ? 1 : 0) & (((this.ARB_vertex_blend_glWeightusvARB_pointer = GLContext.getFunctionAddress("glWeightusvARB")) != 0L) ? 1 : 0) & (((this.ARB_vertex_blend_glWeightuivARB_pointer = GLContext.getFunctionAddress("glWeightuivARB")) != 0L) ? 1 : 0) & (((this.ARB_vertex_blend_glWeightPointerARB_pointer = GLContext.getFunctionAddress("glWeightPointerARB")) != 0L) ? 1 : 0) & (((this.ARB_vertex_blend_glVertexBlendARB_pointer = GLContext.getFunctionAddress("glVertexBlendARB")) != 0L) ? 1 : 0);
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
/*      */ 
/*      */   
/*      */   private boolean ARB_vertex_program_initNativeFunctionAddresses() {
/* 2590 */     return (((this.ARB_vertex_program_glVertexAttrib1sARB_pointer = GLContext.getFunctionAddress("glVertexAttrib1sARB")) != 0L)) & (((this.ARB_vertex_program_glVertexAttrib1fARB_pointer = GLContext.getFunctionAddress("glVertexAttrib1fARB")) != 0L)) & (((this.ARB_vertex_program_glVertexAttrib1dARB_pointer = GLContext.getFunctionAddress("glVertexAttrib1dARB")) != 0L) ? 1 : 0) & (((this.ARB_vertex_program_glVertexAttrib2sARB_pointer = GLContext.getFunctionAddress("glVertexAttrib2sARB")) != 0L) ? 1 : 0) & (((this.ARB_vertex_program_glVertexAttrib2fARB_pointer = GLContext.getFunctionAddress("glVertexAttrib2fARB")) != 0L) ? 1 : 0) & (((this.ARB_vertex_program_glVertexAttrib2dARB_pointer = GLContext.getFunctionAddress("glVertexAttrib2dARB")) != 0L) ? 1 : 0) & (((this.ARB_vertex_program_glVertexAttrib3sARB_pointer = GLContext.getFunctionAddress("glVertexAttrib3sARB")) != 0L) ? 1 : 0) & (((this.ARB_vertex_program_glVertexAttrib3fARB_pointer = GLContext.getFunctionAddress("glVertexAttrib3fARB")) != 0L) ? 1 : 0) & (((this.ARB_vertex_program_glVertexAttrib3dARB_pointer = GLContext.getFunctionAddress("glVertexAttrib3dARB")) != 0L) ? 1 : 0) & (((this.ARB_vertex_program_glVertexAttrib4sARB_pointer = GLContext.getFunctionAddress("glVertexAttrib4sARB")) != 0L) ? 1 : 0) & (((this.ARB_vertex_program_glVertexAttrib4fARB_pointer = GLContext.getFunctionAddress("glVertexAttrib4fARB")) != 0L) ? 1 : 0) & (((this.ARB_vertex_program_glVertexAttrib4dARB_pointer = GLContext.getFunctionAddress("glVertexAttrib4dARB")) != 0L) ? 1 : 0) & (((this.ARB_vertex_program_glVertexAttrib4NubARB_pointer = GLContext.getFunctionAddress("glVertexAttrib4NubARB")) != 0L) ? 1 : 0) & (((this.ARB_vertex_program_glVertexAttribPointerARB_pointer = GLContext.getFunctionAddress("glVertexAttribPointerARB")) != 0L) ? 1 : 0) & (((this.ARB_vertex_program_glEnableVertexAttribArrayARB_pointer = GLContext.getFunctionAddress("glEnableVertexAttribArrayARB")) != 0L) ? 1 : 0) & (((this.ARB_vertex_program_glDisableVertexAttribArrayARB_pointer = GLContext.getFunctionAddress("glDisableVertexAttribArrayARB")) != 0L) ? 1 : 0) & (((this.ARB_vertex_program_glGetVertexAttribfvARB_pointer = GLContext.getFunctionAddress("glGetVertexAttribfvARB")) != 0L) ? 1 : 0) & (((this.ARB_vertex_program_glGetVertexAttribdvARB_pointer = GLContext.getFunctionAddress("glGetVertexAttribdvARB")) != 0L) ? 1 : 0) & (((this.ARB_vertex_program_glGetVertexAttribivARB_pointer = GLContext.getFunctionAddress("glGetVertexAttribivARB")) != 0L) ? 1 : 0) & (((this.ARB_vertex_program_glGetVertexAttribPointervARB_pointer = GLContext.getFunctionAddress("glGetVertexAttribPointervARB")) != 0L) ? 1 : 0);
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
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private boolean ARB_vertex_shader_initNativeFunctionAddresses() {
/* 2614 */     return (((this.ARB_vertex_shader_glVertexAttrib1sARB_pointer = GLContext.getFunctionAddress("glVertexAttrib1sARB")) != 0L)) & (((this.ARB_vertex_shader_glVertexAttrib1fARB_pointer = GLContext.getFunctionAddress("glVertexAttrib1fARB")) != 0L)) & (((this.ARB_vertex_shader_glVertexAttrib1dARB_pointer = GLContext.getFunctionAddress("glVertexAttrib1dARB")) != 0L) ? 1 : 0) & (((this.ARB_vertex_shader_glVertexAttrib2sARB_pointer = GLContext.getFunctionAddress("glVertexAttrib2sARB")) != 0L) ? 1 : 0) & (((this.ARB_vertex_shader_glVertexAttrib2fARB_pointer = GLContext.getFunctionAddress("glVertexAttrib2fARB")) != 0L) ? 1 : 0) & (((this.ARB_vertex_shader_glVertexAttrib2dARB_pointer = GLContext.getFunctionAddress("glVertexAttrib2dARB")) != 0L) ? 1 : 0) & (((this.ARB_vertex_shader_glVertexAttrib3sARB_pointer = GLContext.getFunctionAddress("glVertexAttrib3sARB")) != 0L) ? 1 : 0) & (((this.ARB_vertex_shader_glVertexAttrib3fARB_pointer = GLContext.getFunctionAddress("glVertexAttrib3fARB")) != 0L) ? 1 : 0) & (((this.ARB_vertex_shader_glVertexAttrib3dARB_pointer = GLContext.getFunctionAddress("glVertexAttrib3dARB")) != 0L) ? 1 : 0) & (((this.ARB_vertex_shader_glVertexAttrib4sARB_pointer = GLContext.getFunctionAddress("glVertexAttrib4sARB")) != 0L) ? 1 : 0) & (((this.ARB_vertex_shader_glVertexAttrib4fARB_pointer = GLContext.getFunctionAddress("glVertexAttrib4fARB")) != 0L) ? 1 : 0) & (((this.ARB_vertex_shader_glVertexAttrib4dARB_pointer = GLContext.getFunctionAddress("glVertexAttrib4dARB")) != 0L) ? 1 : 0) & (((this.ARB_vertex_shader_glVertexAttrib4NubARB_pointer = GLContext.getFunctionAddress("glVertexAttrib4NubARB")) != 0L) ? 1 : 0) & (((this.ARB_vertex_shader_glVertexAttribPointerARB_pointer = GLContext.getFunctionAddress("glVertexAttribPointerARB")) != 0L) ? 1 : 0) & (((this.ARB_vertex_shader_glEnableVertexAttribArrayARB_pointer = GLContext.getFunctionAddress("glEnableVertexAttribArrayARB")) != 0L) ? 1 : 0) & (((this.ARB_vertex_shader_glDisableVertexAttribArrayARB_pointer = GLContext.getFunctionAddress("glDisableVertexAttribArrayARB")) != 0L) ? 1 : 0) & (((this.ARB_vertex_shader_glBindAttribLocationARB_pointer = GLContext.getFunctionAddress("glBindAttribLocationARB")) != 0L) ? 1 : 0) & (((this.ARB_vertex_shader_glGetActiveAttribARB_pointer = GLContext.getFunctionAddress("glGetActiveAttribARB")) != 0L) ? 1 : 0) & (((this.ARB_vertex_shader_glGetAttribLocationARB_pointer = GLContext.getFunctionAddress("glGetAttribLocationARB")) != 0L) ? 1 : 0) & (((this.ARB_vertex_shader_glGetVertexAttribfvARB_pointer = GLContext.getFunctionAddress("glGetVertexAttribfvARB")) != 0L) ? 1 : 0) & (((this.ARB_vertex_shader_glGetVertexAttribdvARB_pointer = GLContext.getFunctionAddress("glGetVertexAttribdvARB")) != 0L) ? 1 : 0) & (((this.ARB_vertex_shader_glGetVertexAttribivARB_pointer = GLContext.getFunctionAddress("glGetVertexAttribivARB")) != 0L) ? 1 : 0) & (((this.ARB_vertex_shader_glGetVertexAttribPointervARB_pointer = GLContext.getFunctionAddress("glGetVertexAttribPointervARB")) != 0L) ? 1 : 0);
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
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private boolean ARB_vertex_type_2_10_10_10_rev_initNativeFunctionAddresses() {
/* 2641 */     return (((this.ARB_vertex_type_2_10_10_10_rev_glVertexP2ui_pointer = GLContext.getFunctionAddress("glVertexP2ui")) != 0L)) & (((this.ARB_vertex_type_2_10_10_10_rev_glVertexP3ui_pointer = GLContext.getFunctionAddress("glVertexP3ui")) != 0L)) & (((this.ARB_vertex_type_2_10_10_10_rev_glVertexP4ui_pointer = GLContext.getFunctionAddress("glVertexP4ui")) != 0L) ? 1 : 0) & (((this.ARB_vertex_type_2_10_10_10_rev_glVertexP2uiv_pointer = GLContext.getFunctionAddress("glVertexP2uiv")) != 0L) ? 1 : 0) & (((this.ARB_vertex_type_2_10_10_10_rev_glVertexP3uiv_pointer = GLContext.getFunctionAddress("glVertexP3uiv")) != 0L) ? 1 : 0) & (((this.ARB_vertex_type_2_10_10_10_rev_glVertexP4uiv_pointer = GLContext.getFunctionAddress("glVertexP4uiv")) != 0L) ? 1 : 0) & (((this.ARB_vertex_type_2_10_10_10_rev_glTexCoordP1ui_pointer = GLContext.getFunctionAddress("glTexCoordP1ui")) != 0L) ? 1 : 0) & (((this.ARB_vertex_type_2_10_10_10_rev_glTexCoordP2ui_pointer = GLContext.getFunctionAddress("glTexCoordP2ui")) != 0L) ? 1 : 0) & (((this.ARB_vertex_type_2_10_10_10_rev_glTexCoordP3ui_pointer = GLContext.getFunctionAddress("glTexCoordP3ui")) != 0L) ? 1 : 0) & (((this.ARB_vertex_type_2_10_10_10_rev_glTexCoordP4ui_pointer = GLContext.getFunctionAddress("glTexCoordP4ui")) != 0L) ? 1 : 0) & (((this.ARB_vertex_type_2_10_10_10_rev_glTexCoordP1uiv_pointer = GLContext.getFunctionAddress("glTexCoordP1uiv")) != 0L) ? 1 : 0) & (((this.ARB_vertex_type_2_10_10_10_rev_glTexCoordP2uiv_pointer = GLContext.getFunctionAddress("glTexCoordP2uiv")) != 0L) ? 1 : 0) & (((this.ARB_vertex_type_2_10_10_10_rev_glTexCoordP3uiv_pointer = GLContext.getFunctionAddress("glTexCoordP3uiv")) != 0L) ? 1 : 0) & (((this.ARB_vertex_type_2_10_10_10_rev_glTexCoordP4uiv_pointer = GLContext.getFunctionAddress("glTexCoordP4uiv")) != 0L) ? 1 : 0) & (((this.ARB_vertex_type_2_10_10_10_rev_glMultiTexCoordP1ui_pointer = GLContext.getFunctionAddress("glMultiTexCoordP1ui")) != 0L) ? 1 : 0) & (((this.ARB_vertex_type_2_10_10_10_rev_glMultiTexCoordP2ui_pointer = GLContext.getFunctionAddress("glMultiTexCoordP2ui")) != 0L) ? 1 : 0) & (((this.ARB_vertex_type_2_10_10_10_rev_glMultiTexCoordP3ui_pointer = GLContext.getFunctionAddress("glMultiTexCoordP3ui")) != 0L) ? 1 : 0) & (((this.ARB_vertex_type_2_10_10_10_rev_glMultiTexCoordP4ui_pointer = GLContext.getFunctionAddress("glMultiTexCoordP4ui")) != 0L) ? 1 : 0) & (((this.ARB_vertex_type_2_10_10_10_rev_glMultiTexCoordP1uiv_pointer = GLContext.getFunctionAddress("glMultiTexCoordP1uiv")) != 0L) ? 1 : 0) & (((this.ARB_vertex_type_2_10_10_10_rev_glMultiTexCoordP2uiv_pointer = GLContext.getFunctionAddress("glMultiTexCoordP2uiv")) != 0L) ? 1 : 0) & (((this.ARB_vertex_type_2_10_10_10_rev_glMultiTexCoordP3uiv_pointer = GLContext.getFunctionAddress("glMultiTexCoordP3uiv")) != 0L) ? 1 : 0) & (((this.ARB_vertex_type_2_10_10_10_rev_glMultiTexCoordP4uiv_pointer = GLContext.getFunctionAddress("glMultiTexCoordP4uiv")) != 0L) ? 1 : 0) & (((this.ARB_vertex_type_2_10_10_10_rev_glNormalP3ui_pointer = GLContext.getFunctionAddress("glNormalP3ui")) != 0L) ? 1 : 0) & (((this.ARB_vertex_type_2_10_10_10_rev_glNormalP3uiv_pointer = GLContext.getFunctionAddress("glNormalP3uiv")) != 0L) ? 1 : 0) & (((this.ARB_vertex_type_2_10_10_10_rev_glColorP3ui_pointer = GLContext.getFunctionAddress("glColorP3ui")) != 0L) ? 1 : 0) & (((this.ARB_vertex_type_2_10_10_10_rev_glColorP4ui_pointer = GLContext.getFunctionAddress("glColorP4ui")) != 0L) ? 1 : 0) & (((this.ARB_vertex_type_2_10_10_10_rev_glColorP3uiv_pointer = GLContext.getFunctionAddress("glColorP3uiv")) != 0L) ? 1 : 0) & (((this.ARB_vertex_type_2_10_10_10_rev_glColorP4uiv_pointer = GLContext.getFunctionAddress("glColorP4uiv")) != 0L) ? 1 : 0) & (((this.ARB_vertex_type_2_10_10_10_rev_glSecondaryColorP3ui_pointer = GLContext.getFunctionAddress("glSecondaryColorP3ui")) != 0L) ? 1 : 0) & (((this.ARB_vertex_type_2_10_10_10_rev_glSecondaryColorP3uiv_pointer = GLContext.getFunctionAddress("glSecondaryColorP3uiv")) != 0L) ? 1 : 0) & (((this.ARB_vertex_type_2_10_10_10_rev_glVertexAttribP1ui_pointer = GLContext.getFunctionAddress("glVertexAttribP1ui")) != 0L) ? 1 : 0) & (((this.ARB_vertex_type_2_10_10_10_rev_glVertexAttribP2ui_pointer = GLContext.getFunctionAddress("glVertexAttribP2ui")) != 0L) ? 1 : 0) & (((this.ARB_vertex_type_2_10_10_10_rev_glVertexAttribP3ui_pointer = GLContext.getFunctionAddress("glVertexAttribP3ui")) != 0L) ? 1 : 0) & (((this.ARB_vertex_type_2_10_10_10_rev_glVertexAttribP4ui_pointer = GLContext.getFunctionAddress("glVertexAttribP4ui")) != 0L) ? 1 : 0) & (((this.ARB_vertex_type_2_10_10_10_rev_glVertexAttribP1uiv_pointer = GLContext.getFunctionAddress("glVertexAttribP1uiv")) != 0L) ? 1 : 0) & (((this.ARB_vertex_type_2_10_10_10_rev_glVertexAttribP2uiv_pointer = GLContext.getFunctionAddress("glVertexAttribP2uiv")) != 0L) ? 1 : 0) & (((this.ARB_vertex_type_2_10_10_10_rev_glVertexAttribP3uiv_pointer = GLContext.getFunctionAddress("glVertexAttribP3uiv")) != 0L) ? 1 : 0) & (((this.ARB_vertex_type_2_10_10_10_rev_glVertexAttribP4uiv_pointer = GLContext.getFunctionAddress("glVertexAttribP4uiv")) != 0L) ? 1 : 0);
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
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private boolean ARB_window_pos_initNativeFunctionAddresses(boolean forwardCompatible) {
/* 2683 */     return ((forwardCompatible || (this.ARB_window_pos_glWindowPos2fARB_pointer = GLContext.getFunctionAddress("glWindowPos2fARB")) != 0L)) & ((forwardCompatible || (this.ARB_window_pos_glWindowPos2dARB_pointer = GLContext.getFunctionAddress("glWindowPos2dARB")) != 0L)) & ((forwardCompatible || (this.ARB_window_pos_glWindowPos2iARB_pointer = GLContext.getFunctionAddress("glWindowPos2iARB")) != 0L) ? 1 : 0) & ((forwardCompatible || (this.ARB_window_pos_glWindowPos2sARB_pointer = GLContext.getFunctionAddress("glWindowPos2sARB")) != 0L) ? 1 : 0) & ((forwardCompatible || (this.ARB_window_pos_glWindowPos3fARB_pointer = GLContext.getFunctionAddress("glWindowPos3fARB")) != 0L) ? 1 : 0) & ((forwardCompatible || (this.ARB_window_pos_glWindowPos3dARB_pointer = GLContext.getFunctionAddress("glWindowPos3dARB")) != 0L) ? 1 : 0) & ((forwardCompatible || (this.ARB_window_pos_glWindowPos3iARB_pointer = GLContext.getFunctionAddress("glWindowPos3iARB")) != 0L) ? 1 : 0) & ((forwardCompatible || (this.ARB_window_pos_glWindowPos3sARB_pointer = GLContext.getFunctionAddress("glWindowPos3sARB")) != 0L) ? 1 : 0);
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
/*      */   private boolean ATI_draw_buffers_initNativeFunctionAddresses() {
/* 2695 */     return ((this.ATI_draw_buffers_glDrawBuffersATI_pointer = GLContext.getFunctionAddress("glDrawBuffersATI")) != 0L);
/*      */   }
/*      */ 
/*      */   
/*      */   private boolean ATI_element_array_initNativeFunctionAddresses() {
/* 2700 */     return (((this.ATI_element_array_glElementPointerATI_pointer = GLContext.getFunctionAddress("glElementPointerATI")) != 0L)) & (((this.ATI_element_array_glDrawElementArrayATI_pointer = GLContext.getFunctionAddress("glDrawElementArrayATI")) != 0L)) & (((this.ATI_element_array_glDrawRangeElementArrayATI_pointer = GLContext.getFunctionAddress("glDrawRangeElementArrayATI")) != 0L) ? 1 : 0);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private boolean ATI_envmap_bumpmap_initNativeFunctionAddresses() {
/* 2707 */     return (((this.ATI_envmap_bumpmap_glTexBumpParameterfvATI_pointer = GLContext.getFunctionAddress("glTexBumpParameterfvATI")) != 0L)) & (((this.ATI_envmap_bumpmap_glTexBumpParameterivATI_pointer = GLContext.getFunctionAddress("glTexBumpParameterivATI")) != 0L)) & (((this.ATI_envmap_bumpmap_glGetTexBumpParameterfvATI_pointer = GLContext.getFunctionAddress("glGetTexBumpParameterfvATI")) != 0L) ? 1 : 0) & (((this.ATI_envmap_bumpmap_glGetTexBumpParameterivATI_pointer = GLContext.getFunctionAddress("glGetTexBumpParameterivATI")) != 0L) ? 1 : 0);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private boolean ATI_fragment_shader_initNativeFunctionAddresses() {
/* 2715 */     return (((this.ATI_fragment_shader_glGenFragmentShadersATI_pointer = GLContext.getFunctionAddress("glGenFragmentShadersATI")) != 0L)) & (((this.ATI_fragment_shader_glBindFragmentShaderATI_pointer = GLContext.getFunctionAddress("glBindFragmentShaderATI")) != 0L)) & (((this.ATI_fragment_shader_glDeleteFragmentShaderATI_pointer = GLContext.getFunctionAddress("glDeleteFragmentShaderATI")) != 0L) ? 1 : 0) & (((this.ATI_fragment_shader_glBeginFragmentShaderATI_pointer = GLContext.getFunctionAddress("glBeginFragmentShaderATI")) != 0L) ? 1 : 0) & (((this.ATI_fragment_shader_glEndFragmentShaderATI_pointer = GLContext.getFunctionAddress("glEndFragmentShaderATI")) != 0L) ? 1 : 0) & (((this.ATI_fragment_shader_glPassTexCoordATI_pointer = GLContext.getFunctionAddress("glPassTexCoordATI")) != 0L) ? 1 : 0) & (((this.ATI_fragment_shader_glSampleMapATI_pointer = GLContext.getFunctionAddress("glSampleMapATI")) != 0L) ? 1 : 0) & (((this.ATI_fragment_shader_glColorFragmentOp1ATI_pointer = GLContext.getFunctionAddress("glColorFragmentOp1ATI")) != 0L) ? 1 : 0) & (((this.ATI_fragment_shader_glColorFragmentOp2ATI_pointer = GLContext.getFunctionAddress("glColorFragmentOp2ATI")) != 0L) ? 1 : 0) & (((this.ATI_fragment_shader_glColorFragmentOp3ATI_pointer = GLContext.getFunctionAddress("glColorFragmentOp3ATI")) != 0L) ? 1 : 0) & (((this.ATI_fragment_shader_glAlphaFragmentOp1ATI_pointer = GLContext.getFunctionAddress("glAlphaFragmentOp1ATI")) != 0L) ? 1 : 0) & (((this.ATI_fragment_shader_glAlphaFragmentOp2ATI_pointer = GLContext.getFunctionAddress("glAlphaFragmentOp2ATI")) != 0L) ? 1 : 0) & (((this.ATI_fragment_shader_glAlphaFragmentOp3ATI_pointer = GLContext.getFunctionAddress("glAlphaFragmentOp3ATI")) != 0L) ? 1 : 0) & (((this.ATI_fragment_shader_glSetFragmentShaderConstantATI_pointer = GLContext.getFunctionAddress("glSetFragmentShaderConstantATI")) != 0L) ? 1 : 0);
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
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private boolean ATI_map_object_buffer_initNativeFunctionAddresses() {
/* 2733 */     return (((this.ATI_map_object_buffer_glMapObjectBufferATI_pointer = GLContext.getFunctionAddress("glMapObjectBufferATI")) != 0L)) & (((this.ATI_map_object_buffer_glUnmapObjectBufferATI_pointer = GLContext.getFunctionAddress("glUnmapObjectBufferATI")) != 0L));
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   private boolean ATI_pn_triangles_initNativeFunctionAddresses() {
/* 2739 */     return (((this.ATI_pn_triangles_glPNTrianglesfATI_pointer = GLContext.getFunctionAddress("glPNTrianglesfATI")) != 0L)) & (((this.ATI_pn_triangles_glPNTrianglesiATI_pointer = GLContext.getFunctionAddress("glPNTrianglesiATI")) != 0L));
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   private boolean ATI_separate_stencil_initNativeFunctionAddresses() {
/* 2745 */     return (((this.ATI_separate_stencil_glStencilOpSeparateATI_pointer = GLContext.getFunctionAddress("glStencilOpSeparateATI")) != 0L)) & (((this.ATI_separate_stencil_glStencilFuncSeparateATI_pointer = GLContext.getFunctionAddress("glStencilFuncSeparateATI")) != 0L));
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   private boolean ATI_vertex_array_object_initNativeFunctionAddresses() {
/* 2751 */     return (((this.ATI_vertex_array_object_glNewObjectBufferATI_pointer = GLContext.getFunctionAddress("glNewObjectBufferATI")) != 0L)) & (((this.ATI_vertex_array_object_glIsObjectBufferATI_pointer = GLContext.getFunctionAddress("glIsObjectBufferATI")) != 0L)) & (((this.ATI_vertex_array_object_glUpdateObjectBufferATI_pointer = GLContext.getFunctionAddress("glUpdateObjectBufferATI")) != 0L) ? 1 : 0) & (((this.ATI_vertex_array_object_glGetObjectBufferfvATI_pointer = GLContext.getFunctionAddress("glGetObjectBufferfvATI")) != 0L) ? 1 : 0) & (((this.ATI_vertex_array_object_glGetObjectBufferivATI_pointer = GLContext.getFunctionAddress("glGetObjectBufferivATI")) != 0L) ? 1 : 0) & (((this.ATI_vertex_array_object_glFreeObjectBufferATI_pointer = GLContext.getFunctionAddress("glFreeObjectBufferATI")) != 0L) ? 1 : 0) & (((this.ATI_vertex_array_object_glArrayObjectATI_pointer = GLContext.getFunctionAddress("glArrayObjectATI")) != 0L) ? 1 : 0) & (((this.ATI_vertex_array_object_glGetArrayObjectfvATI_pointer = GLContext.getFunctionAddress("glGetArrayObjectfvATI")) != 0L) ? 1 : 0) & (((this.ATI_vertex_array_object_glGetArrayObjectivATI_pointer = GLContext.getFunctionAddress("glGetArrayObjectivATI")) != 0L) ? 1 : 0) & (((this.ATI_vertex_array_object_glVariantArrayObjectATI_pointer = GLContext.getFunctionAddress("glVariantArrayObjectATI")) != 0L) ? 1 : 0) & (((this.ATI_vertex_array_object_glGetVariantArrayObjectfvATI_pointer = GLContext.getFunctionAddress("glGetVariantArrayObjectfvATI")) != 0L) ? 1 : 0) & (((this.ATI_vertex_array_object_glGetVariantArrayObjectivATI_pointer = GLContext.getFunctionAddress("glGetVariantArrayObjectivATI")) != 0L) ? 1 : 0);
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
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private boolean ATI_vertex_attrib_array_object_initNativeFunctionAddresses() {
/* 2767 */     return (((this.ATI_vertex_attrib_array_object_glVertexAttribArrayObjectATI_pointer = GLContext.getFunctionAddress("glVertexAttribArrayObjectATI")) != 0L)) & (((this.ATI_vertex_attrib_array_object_glGetVertexAttribArrayObjectfvATI_pointer = GLContext.getFunctionAddress("glGetVertexAttribArrayObjectfvATI")) != 0L)) & (((this.ATI_vertex_attrib_array_object_glGetVertexAttribArrayObjectivATI_pointer = GLContext.getFunctionAddress("glGetVertexAttribArrayObjectivATI")) != 0L) ? 1 : 0);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private boolean ATI_vertex_streams_initNativeFunctionAddresses() {
/* 2774 */     return (((this.ATI_vertex_streams_glVertexStream2fATI_pointer = GLContext.getFunctionAddress("glVertexStream2fATI")) != 0L)) & (((this.ATI_vertex_streams_glVertexStream2dATI_pointer = GLContext.getFunctionAddress("glVertexStream2dATI")) != 0L)) & (((this.ATI_vertex_streams_glVertexStream2iATI_pointer = GLContext.getFunctionAddress("glVertexStream2iATI")) != 0L) ? 1 : 0) & (((this.ATI_vertex_streams_glVertexStream2sATI_pointer = GLContext.getFunctionAddress("glVertexStream2sATI")) != 0L) ? 1 : 0) & (((this.ATI_vertex_streams_glVertexStream3fATI_pointer = GLContext.getFunctionAddress("glVertexStream3fATI")) != 0L) ? 1 : 0) & (((this.ATI_vertex_streams_glVertexStream3dATI_pointer = GLContext.getFunctionAddress("glVertexStream3dATI")) != 0L) ? 1 : 0) & (((this.ATI_vertex_streams_glVertexStream3iATI_pointer = GLContext.getFunctionAddress("glVertexStream3iATI")) != 0L) ? 1 : 0) & (((this.ATI_vertex_streams_glVertexStream3sATI_pointer = GLContext.getFunctionAddress("glVertexStream3sATI")) != 0L) ? 1 : 0) & (((this.ATI_vertex_streams_glVertexStream4fATI_pointer = GLContext.getFunctionAddress("glVertexStream4fATI")) != 0L) ? 1 : 0) & (((this.ATI_vertex_streams_glVertexStream4dATI_pointer = GLContext.getFunctionAddress("glVertexStream4dATI")) != 0L) ? 1 : 0) & (((this.ATI_vertex_streams_glVertexStream4iATI_pointer = GLContext.getFunctionAddress("glVertexStream4iATI")) != 0L) ? 1 : 0) & (((this.ATI_vertex_streams_glVertexStream4sATI_pointer = GLContext.getFunctionAddress("glVertexStream4sATI")) != 0L) ? 1 : 0) & (((this.ATI_vertex_streams_glNormalStream3bATI_pointer = GLContext.getFunctionAddress("glNormalStream3bATI")) != 0L) ? 1 : 0) & (((this.ATI_vertex_streams_glNormalStream3fATI_pointer = GLContext.getFunctionAddress("glNormalStream3fATI")) != 0L) ? 1 : 0) & (((this.ATI_vertex_streams_glNormalStream3dATI_pointer = GLContext.getFunctionAddress("glNormalStream3dATI")) != 0L) ? 1 : 0) & (((this.ATI_vertex_streams_glNormalStream3iATI_pointer = GLContext.getFunctionAddress("glNormalStream3iATI")) != 0L) ? 1 : 0) & (((this.ATI_vertex_streams_glNormalStream3sATI_pointer = GLContext.getFunctionAddress("glNormalStream3sATI")) != 0L) ? 1 : 0) & (((this.ATI_vertex_streams_glClientActiveVertexStreamATI_pointer = GLContext.getFunctionAddress("glClientActiveVertexStreamATI")) != 0L) ? 1 : 0) & (((this.ATI_vertex_streams_glVertexBlendEnvfATI_pointer = GLContext.getFunctionAddress("glVertexBlendEnvfATI")) != 0L) ? 1 : 0) & (((this.ATI_vertex_streams_glVertexBlendEnviATI_pointer = GLContext.getFunctionAddress("glVertexBlendEnviATI")) != 0L) ? 1 : 0);
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
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private boolean EXT_bindable_uniform_initNativeFunctionAddresses() {
/* 2798 */     return (((this.EXT_bindable_uniform_glUniformBufferEXT_pointer = GLContext.getFunctionAddress("glUniformBufferEXT")) != 0L)) & (((this.EXT_bindable_uniform_glGetUniformBufferSizeEXT_pointer = GLContext.getFunctionAddress("glGetUniformBufferSizeEXT")) != 0L)) & (((this.EXT_bindable_uniform_glGetUniformOffsetEXT_pointer = GLContext.getFunctionAddress("glGetUniformOffsetEXT")) != 0L) ? 1 : 0);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private boolean EXT_blend_color_initNativeFunctionAddresses() {
/* 2805 */     return ((this.EXT_blend_color_glBlendColorEXT_pointer = GLContext.getFunctionAddress("glBlendColorEXT")) != 0L);
/*      */   }
/*      */ 
/*      */   
/*      */   private boolean EXT_blend_equation_separate_initNativeFunctionAddresses() {
/* 2810 */     return ((this.EXT_blend_equation_separate_glBlendEquationSeparateEXT_pointer = GLContext.getFunctionAddress("glBlendEquationSeparateEXT")) != 0L);
/*      */   }
/*      */ 
/*      */   
/*      */   private boolean EXT_blend_func_separate_initNativeFunctionAddresses() {
/* 2815 */     return ((this.EXT_blend_func_separate_glBlendFuncSeparateEXT_pointer = GLContext.getFunctionAddress("glBlendFuncSeparateEXT")) != 0L);
/*      */   }
/*      */ 
/*      */   
/*      */   private boolean EXT_blend_minmax_initNativeFunctionAddresses() {
/* 2820 */     return ((this.EXT_blend_minmax_glBlendEquationEXT_pointer = GLContext.getFunctionAddress("glBlendEquationEXT")) != 0L);
/*      */   }
/*      */ 
/*      */   
/*      */   private boolean EXT_compiled_vertex_array_initNativeFunctionAddresses() {
/* 2825 */     return (((this.EXT_compiled_vertex_array_glLockArraysEXT_pointer = GLContext.getFunctionAddress("glLockArraysEXT")) != 0L)) & (((this.EXT_compiled_vertex_array_glUnlockArraysEXT_pointer = GLContext.getFunctionAddress("glUnlockArraysEXT")) != 0L));
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   private boolean EXT_depth_bounds_test_initNativeFunctionAddresses() {
/* 2831 */     return ((this.EXT_depth_bounds_test_glDepthBoundsEXT_pointer = GLContext.getFunctionAddress("glDepthBoundsEXT")) != 0L);
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
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private boolean EXT_direct_state_access_initNativeFunctionAddresses(boolean forwardCompatible, Set supported_extensions) {
/*      */     // Byte code:
/*      */     //   0: iload_1
/*      */     //   1: ifne -> 20
/*      */     //   4: aload_0
/*      */     //   5: ldc_w 'glClientAttribDefaultEXT'
/*      */     //   8: invokestatic getFunctionAddress : (Ljava/lang/String;)J
/*      */     //   11: dup2_x1
/*      */     //   12: putfield EXT_direct_state_access_glClientAttribDefaultEXT_pointer : J
/*      */     //   15: lconst_0
/*      */     //   16: lcmp
/*      */     //   17: ifeq -> 24
/*      */     //   20: iconst_1
/*      */     //   21: goto -> 25
/*      */     //   24: iconst_0
/*      */     //   25: iload_1
/*      */     //   26: ifne -> 45
/*      */     //   29: aload_0
/*      */     //   30: ldc_w 'glPushClientAttribDefaultEXT'
/*      */     //   33: invokestatic getFunctionAddress : (Ljava/lang/String;)J
/*      */     //   36: dup2_x1
/*      */     //   37: putfield EXT_direct_state_access_glPushClientAttribDefaultEXT_pointer : J
/*      */     //   40: lconst_0
/*      */     //   41: lcmp
/*      */     //   42: ifeq -> 49
/*      */     //   45: iconst_1
/*      */     //   46: goto -> 50
/*      */     //   49: iconst_0
/*      */     //   50: iand
/*      */     //   51: iload_1
/*      */     //   52: ifne -> 71
/*      */     //   55: aload_0
/*      */     //   56: ldc_w 'glMatrixLoadfEXT'
/*      */     //   59: invokestatic getFunctionAddress : (Ljava/lang/String;)J
/*      */     //   62: dup2_x1
/*      */     //   63: putfield EXT_direct_state_access_glMatrixLoadfEXT_pointer : J
/*      */     //   66: lconst_0
/*      */     //   67: lcmp
/*      */     //   68: ifeq -> 75
/*      */     //   71: iconst_1
/*      */     //   72: goto -> 76
/*      */     //   75: iconst_0
/*      */     //   76: iand
/*      */     //   77: iload_1
/*      */     //   78: ifne -> 97
/*      */     //   81: aload_0
/*      */     //   82: ldc_w 'glMatrixLoaddEXT'
/*      */     //   85: invokestatic getFunctionAddress : (Ljava/lang/String;)J
/*      */     //   88: dup2_x1
/*      */     //   89: putfield EXT_direct_state_access_glMatrixLoaddEXT_pointer : J
/*      */     //   92: lconst_0
/*      */     //   93: lcmp
/*      */     //   94: ifeq -> 101
/*      */     //   97: iconst_1
/*      */     //   98: goto -> 102
/*      */     //   101: iconst_0
/*      */     //   102: iand
/*      */     //   103: iload_1
/*      */     //   104: ifne -> 123
/*      */     //   107: aload_0
/*      */     //   108: ldc_w 'glMatrixMultfEXT'
/*      */     //   111: invokestatic getFunctionAddress : (Ljava/lang/String;)J
/*      */     //   114: dup2_x1
/*      */     //   115: putfield EXT_direct_state_access_glMatrixMultfEXT_pointer : J
/*      */     //   118: lconst_0
/*      */     //   119: lcmp
/*      */     //   120: ifeq -> 127
/*      */     //   123: iconst_1
/*      */     //   124: goto -> 128
/*      */     //   127: iconst_0
/*      */     //   128: iand
/*      */     //   129: iload_1
/*      */     //   130: ifne -> 149
/*      */     //   133: aload_0
/*      */     //   134: ldc_w 'glMatrixMultdEXT'
/*      */     //   137: invokestatic getFunctionAddress : (Ljava/lang/String;)J
/*      */     //   140: dup2_x1
/*      */     //   141: putfield EXT_direct_state_access_glMatrixMultdEXT_pointer : J
/*      */     //   144: lconst_0
/*      */     //   145: lcmp
/*      */     //   146: ifeq -> 153
/*      */     //   149: iconst_1
/*      */     //   150: goto -> 154
/*      */     //   153: iconst_0
/*      */     //   154: iand
/*      */     //   155: iload_1
/*      */     //   156: ifne -> 175
/*      */     //   159: aload_0
/*      */     //   160: ldc_w 'glMatrixLoadIdentityEXT'
/*      */     //   163: invokestatic getFunctionAddress : (Ljava/lang/String;)J
/*      */     //   166: dup2_x1
/*      */     //   167: putfield EXT_direct_state_access_glMatrixLoadIdentityEXT_pointer : J
/*      */     //   170: lconst_0
/*      */     //   171: lcmp
/*      */     //   172: ifeq -> 179
/*      */     //   175: iconst_1
/*      */     //   176: goto -> 180
/*      */     //   179: iconst_0
/*      */     //   180: iand
/*      */     //   181: iload_1
/*      */     //   182: ifne -> 201
/*      */     //   185: aload_0
/*      */     //   186: ldc_w 'glMatrixRotatefEXT'
/*      */     //   189: invokestatic getFunctionAddress : (Ljava/lang/String;)J
/*      */     //   192: dup2_x1
/*      */     //   193: putfield EXT_direct_state_access_glMatrixRotatefEXT_pointer : J
/*      */     //   196: lconst_0
/*      */     //   197: lcmp
/*      */     //   198: ifeq -> 205
/*      */     //   201: iconst_1
/*      */     //   202: goto -> 206
/*      */     //   205: iconst_0
/*      */     //   206: iand
/*      */     //   207: iload_1
/*      */     //   208: ifne -> 227
/*      */     //   211: aload_0
/*      */     //   212: ldc_w 'glMatrixRotatedEXT'
/*      */     //   215: invokestatic getFunctionAddress : (Ljava/lang/String;)J
/*      */     //   218: dup2_x1
/*      */     //   219: putfield EXT_direct_state_access_glMatrixRotatedEXT_pointer : J
/*      */     //   222: lconst_0
/*      */     //   223: lcmp
/*      */     //   224: ifeq -> 231
/*      */     //   227: iconst_1
/*      */     //   228: goto -> 232
/*      */     //   231: iconst_0
/*      */     //   232: iand
/*      */     //   233: iload_1
/*      */     //   234: ifne -> 253
/*      */     //   237: aload_0
/*      */     //   238: ldc_w 'glMatrixScalefEXT'
/*      */     //   241: invokestatic getFunctionAddress : (Ljava/lang/String;)J
/*      */     //   244: dup2_x1
/*      */     //   245: putfield EXT_direct_state_access_glMatrixScalefEXT_pointer : J
/*      */     //   248: lconst_0
/*      */     //   249: lcmp
/*      */     //   250: ifeq -> 257
/*      */     //   253: iconst_1
/*      */     //   254: goto -> 258
/*      */     //   257: iconst_0
/*      */     //   258: iand
/*      */     //   259: iload_1
/*      */     //   260: ifne -> 279
/*      */     //   263: aload_0
/*      */     //   264: ldc_w 'glMatrixScaledEXT'
/*      */     //   267: invokestatic getFunctionAddress : (Ljava/lang/String;)J
/*      */     //   270: dup2_x1
/*      */     //   271: putfield EXT_direct_state_access_glMatrixScaledEXT_pointer : J
/*      */     //   274: lconst_0
/*      */     //   275: lcmp
/*      */     //   276: ifeq -> 283
/*      */     //   279: iconst_1
/*      */     //   280: goto -> 284
/*      */     //   283: iconst_0
/*      */     //   284: iand
/*      */     //   285: iload_1
/*      */     //   286: ifne -> 305
/*      */     //   289: aload_0
/*      */     //   290: ldc_w 'glMatrixTranslatefEXT'
/*      */     //   293: invokestatic getFunctionAddress : (Ljava/lang/String;)J
/*      */     //   296: dup2_x1
/*      */     //   297: putfield EXT_direct_state_access_glMatrixTranslatefEXT_pointer : J
/*      */     //   300: lconst_0
/*      */     //   301: lcmp
/*      */     //   302: ifeq -> 309
/*      */     //   305: iconst_1
/*      */     //   306: goto -> 310
/*      */     //   309: iconst_0
/*      */     //   310: iand
/*      */     //   311: iload_1
/*      */     //   312: ifne -> 331
/*      */     //   315: aload_0
/*      */     //   316: ldc_w 'glMatrixTranslatedEXT'
/*      */     //   319: invokestatic getFunctionAddress : (Ljava/lang/String;)J
/*      */     //   322: dup2_x1
/*      */     //   323: putfield EXT_direct_state_access_glMatrixTranslatedEXT_pointer : J
/*      */     //   326: lconst_0
/*      */     //   327: lcmp
/*      */     //   328: ifeq -> 335
/*      */     //   331: iconst_1
/*      */     //   332: goto -> 336
/*      */     //   335: iconst_0
/*      */     //   336: iand
/*      */     //   337: iload_1
/*      */     //   338: ifne -> 357
/*      */     //   341: aload_0
/*      */     //   342: ldc_w 'glMatrixOrthoEXT'
/*      */     //   345: invokestatic getFunctionAddress : (Ljava/lang/String;)J
/*      */     //   348: dup2_x1
/*      */     //   349: putfield EXT_direct_state_access_glMatrixOrthoEXT_pointer : J
/*      */     //   352: lconst_0
/*      */     //   353: lcmp
/*      */     //   354: ifeq -> 361
/*      */     //   357: iconst_1
/*      */     //   358: goto -> 362
/*      */     //   361: iconst_0
/*      */     //   362: iand
/*      */     //   363: iload_1
/*      */     //   364: ifne -> 383
/*      */     //   367: aload_0
/*      */     //   368: ldc_w 'glMatrixFrustumEXT'
/*      */     //   371: invokestatic getFunctionAddress : (Ljava/lang/String;)J
/*      */     //   374: dup2_x1
/*      */     //   375: putfield EXT_direct_state_access_glMatrixFrustumEXT_pointer : J
/*      */     //   378: lconst_0
/*      */     //   379: lcmp
/*      */     //   380: ifeq -> 387
/*      */     //   383: iconst_1
/*      */     //   384: goto -> 388
/*      */     //   387: iconst_0
/*      */     //   388: iand
/*      */     //   389: iload_1
/*      */     //   390: ifne -> 409
/*      */     //   393: aload_0
/*      */     //   394: ldc_w 'glMatrixPushEXT'
/*      */     //   397: invokestatic getFunctionAddress : (Ljava/lang/String;)J
/*      */     //   400: dup2_x1
/*      */     //   401: putfield EXT_direct_state_access_glMatrixPushEXT_pointer : J
/*      */     //   404: lconst_0
/*      */     //   405: lcmp
/*      */     //   406: ifeq -> 413
/*      */     //   409: iconst_1
/*      */     //   410: goto -> 414
/*      */     //   413: iconst_0
/*      */     //   414: iand
/*      */     //   415: iload_1
/*      */     //   416: ifne -> 435
/*      */     //   419: aload_0
/*      */     //   420: ldc_w 'glMatrixPopEXT'
/*      */     //   423: invokestatic getFunctionAddress : (Ljava/lang/String;)J
/*      */     //   426: dup2_x1
/*      */     //   427: putfield EXT_direct_state_access_glMatrixPopEXT_pointer : J
/*      */     //   430: lconst_0
/*      */     //   431: lcmp
/*      */     //   432: ifeq -> 439
/*      */     //   435: iconst_1
/*      */     //   436: goto -> 440
/*      */     //   439: iconst_0
/*      */     //   440: iand
/*      */     //   441: aload_0
/*      */     //   442: ldc_w 'glTextureParameteriEXT'
/*      */     //   445: invokestatic getFunctionAddress : (Ljava/lang/String;)J
/*      */     //   448: dup2_x1
/*      */     //   449: putfield EXT_direct_state_access_glTextureParameteriEXT_pointer : J
/*      */     //   452: lconst_0
/*      */     //   453: lcmp
/*      */     //   454: ifeq -> 461
/*      */     //   457: iconst_1
/*      */     //   458: goto -> 462
/*      */     //   461: iconst_0
/*      */     //   462: iand
/*      */     //   463: aload_0
/*      */     //   464: ldc_w 'glTextureParameterivEXT'
/*      */     //   467: invokestatic getFunctionAddress : (Ljava/lang/String;)J
/*      */     //   470: dup2_x1
/*      */     //   471: putfield EXT_direct_state_access_glTextureParameterivEXT_pointer : J
/*      */     //   474: lconst_0
/*      */     //   475: lcmp
/*      */     //   476: ifeq -> 483
/*      */     //   479: iconst_1
/*      */     //   480: goto -> 484
/*      */     //   483: iconst_0
/*      */     //   484: iand
/*      */     //   485: aload_0
/*      */     //   486: ldc_w 'glTextureParameterfEXT'
/*      */     //   489: invokestatic getFunctionAddress : (Ljava/lang/String;)J
/*      */     //   492: dup2_x1
/*      */     //   493: putfield EXT_direct_state_access_glTextureParameterfEXT_pointer : J
/*      */     //   496: lconst_0
/*      */     //   497: lcmp
/*      */     //   498: ifeq -> 505
/*      */     //   501: iconst_1
/*      */     //   502: goto -> 506
/*      */     //   505: iconst_0
/*      */     //   506: iand
/*      */     //   507: aload_0
/*      */     //   508: ldc_w 'glTextureParameterfvEXT'
/*      */     //   511: invokestatic getFunctionAddress : (Ljava/lang/String;)J
/*      */     //   514: dup2_x1
/*      */     //   515: putfield EXT_direct_state_access_glTextureParameterfvEXT_pointer : J
/*      */     //   518: lconst_0
/*      */     //   519: lcmp
/*      */     //   520: ifeq -> 527
/*      */     //   523: iconst_1
/*      */     //   524: goto -> 528
/*      */     //   527: iconst_0
/*      */     //   528: iand
/*      */     //   529: aload_0
/*      */     //   530: ldc_w 'glTextureImage1DEXT'
/*      */     //   533: invokestatic getFunctionAddress : (Ljava/lang/String;)J
/*      */     //   536: dup2_x1
/*      */     //   537: putfield EXT_direct_state_access_glTextureImage1DEXT_pointer : J
/*      */     //   540: lconst_0
/*      */     //   541: lcmp
/*      */     //   542: ifeq -> 549
/*      */     //   545: iconst_1
/*      */     //   546: goto -> 550
/*      */     //   549: iconst_0
/*      */     //   550: iand
/*      */     //   551: aload_0
/*      */     //   552: ldc_w 'glTextureImage2DEXT'
/*      */     //   555: invokestatic getFunctionAddress : (Ljava/lang/String;)J
/*      */     //   558: dup2_x1
/*      */     //   559: putfield EXT_direct_state_access_glTextureImage2DEXT_pointer : J
/*      */     //   562: lconst_0
/*      */     //   563: lcmp
/*      */     //   564: ifeq -> 571
/*      */     //   567: iconst_1
/*      */     //   568: goto -> 572
/*      */     //   571: iconst_0
/*      */     //   572: iand
/*      */     //   573: aload_0
/*      */     //   574: ldc_w 'glTextureSubImage1DEXT'
/*      */     //   577: invokestatic getFunctionAddress : (Ljava/lang/String;)J
/*      */     //   580: dup2_x1
/*      */     //   581: putfield EXT_direct_state_access_glTextureSubImage1DEXT_pointer : J
/*      */     //   584: lconst_0
/*      */     //   585: lcmp
/*      */     //   586: ifeq -> 593
/*      */     //   589: iconst_1
/*      */     //   590: goto -> 594
/*      */     //   593: iconst_0
/*      */     //   594: iand
/*      */     //   595: aload_0
/*      */     //   596: ldc_w 'glTextureSubImage2DEXT'
/*      */     //   599: invokestatic getFunctionAddress : (Ljava/lang/String;)J
/*      */     //   602: dup2_x1
/*      */     //   603: putfield EXT_direct_state_access_glTextureSubImage2DEXT_pointer : J
/*      */     //   606: lconst_0
/*      */     //   607: lcmp
/*      */     //   608: ifeq -> 615
/*      */     //   611: iconst_1
/*      */     //   612: goto -> 616
/*      */     //   615: iconst_0
/*      */     //   616: iand
/*      */     //   617: aload_0
/*      */     //   618: ldc_w 'glCopyTextureImage1DEXT'
/*      */     //   621: invokestatic getFunctionAddress : (Ljava/lang/String;)J
/*      */     //   624: dup2_x1
/*      */     //   625: putfield EXT_direct_state_access_glCopyTextureImage1DEXT_pointer : J
/*      */     //   628: lconst_0
/*      */     //   629: lcmp
/*      */     //   630: ifeq -> 637
/*      */     //   633: iconst_1
/*      */     //   634: goto -> 638
/*      */     //   637: iconst_0
/*      */     //   638: iand
/*      */     //   639: aload_0
/*      */     //   640: ldc_w 'glCopyTextureImage2DEXT'
/*      */     //   643: invokestatic getFunctionAddress : (Ljava/lang/String;)J
/*      */     //   646: dup2_x1
/*      */     //   647: putfield EXT_direct_state_access_glCopyTextureImage2DEXT_pointer : J
/*      */     //   650: lconst_0
/*      */     //   651: lcmp
/*      */     //   652: ifeq -> 659
/*      */     //   655: iconst_1
/*      */     //   656: goto -> 660
/*      */     //   659: iconst_0
/*      */     //   660: iand
/*      */     //   661: aload_0
/*      */     //   662: ldc_w 'glCopyTextureSubImage1DEXT'
/*      */     //   665: invokestatic getFunctionAddress : (Ljava/lang/String;)J
/*      */     //   668: dup2_x1
/*      */     //   669: putfield EXT_direct_state_access_glCopyTextureSubImage1DEXT_pointer : J
/*      */     //   672: lconst_0
/*      */     //   673: lcmp
/*      */     //   674: ifeq -> 681
/*      */     //   677: iconst_1
/*      */     //   678: goto -> 682
/*      */     //   681: iconst_0
/*      */     //   682: iand
/*      */     //   683: aload_0
/*      */     //   684: ldc_w 'glCopyTextureSubImage2DEXT'
/*      */     //   687: invokestatic getFunctionAddress : (Ljava/lang/String;)J
/*      */     //   690: dup2_x1
/*      */     //   691: putfield EXT_direct_state_access_glCopyTextureSubImage2DEXT_pointer : J
/*      */     //   694: lconst_0
/*      */     //   695: lcmp
/*      */     //   696: ifeq -> 703
/*      */     //   699: iconst_1
/*      */     //   700: goto -> 704
/*      */     //   703: iconst_0
/*      */     //   704: iand
/*      */     //   705: aload_0
/*      */     //   706: ldc_w 'glGetTextureImageEXT'
/*      */     //   709: invokestatic getFunctionAddress : (Ljava/lang/String;)J
/*      */     //   712: dup2_x1
/*      */     //   713: putfield EXT_direct_state_access_glGetTextureImageEXT_pointer : J
/*      */     //   716: lconst_0
/*      */     //   717: lcmp
/*      */     //   718: ifeq -> 725
/*      */     //   721: iconst_1
/*      */     //   722: goto -> 726
/*      */     //   725: iconst_0
/*      */     //   726: iand
/*      */     //   727: aload_0
/*      */     //   728: ldc_w 'glGetTextureParameterfvEXT'
/*      */     //   731: invokestatic getFunctionAddress : (Ljava/lang/String;)J
/*      */     //   734: dup2_x1
/*      */     //   735: putfield EXT_direct_state_access_glGetTextureParameterfvEXT_pointer : J
/*      */     //   738: lconst_0
/*      */     //   739: lcmp
/*      */     //   740: ifeq -> 747
/*      */     //   743: iconst_1
/*      */     //   744: goto -> 748
/*      */     //   747: iconst_0
/*      */     //   748: iand
/*      */     //   749: aload_0
/*      */     //   750: ldc_w 'glGetTextureParameterivEXT'
/*      */     //   753: invokestatic getFunctionAddress : (Ljava/lang/String;)J
/*      */     //   756: dup2_x1
/*      */     //   757: putfield EXT_direct_state_access_glGetTextureParameterivEXT_pointer : J
/*      */     //   760: lconst_0
/*      */     //   761: lcmp
/*      */     //   762: ifeq -> 769
/*      */     //   765: iconst_1
/*      */     //   766: goto -> 770
/*      */     //   769: iconst_0
/*      */     //   770: iand
/*      */     //   771: aload_0
/*      */     //   772: ldc_w 'glGetTextureLevelParameterfvEXT'
/*      */     //   775: invokestatic getFunctionAddress : (Ljava/lang/String;)J
/*      */     //   778: dup2_x1
/*      */     //   779: putfield EXT_direct_state_access_glGetTextureLevelParameterfvEXT_pointer : J
/*      */     //   782: lconst_0
/*      */     //   783: lcmp
/*      */     //   784: ifeq -> 791
/*      */     //   787: iconst_1
/*      */     //   788: goto -> 792
/*      */     //   791: iconst_0
/*      */     //   792: iand
/*      */     //   793: aload_0
/*      */     //   794: ldc_w 'glGetTextureLevelParameterivEXT'
/*      */     //   797: invokestatic getFunctionAddress : (Ljava/lang/String;)J
/*      */     //   800: dup2_x1
/*      */     //   801: putfield EXT_direct_state_access_glGetTextureLevelParameterivEXT_pointer : J
/*      */     //   804: lconst_0
/*      */     //   805: lcmp
/*      */     //   806: ifeq -> 813
/*      */     //   809: iconst_1
/*      */     //   810: goto -> 814
/*      */     //   813: iconst_0
/*      */     //   814: iand
/*      */     //   815: aload_2
/*      */     //   816: ldc_w 'OpenGL12'
/*      */     //   819: invokeinterface contains : (Ljava/lang/Object;)Z
/*      */     //   824: ifeq -> 843
/*      */     //   827: aload_0
/*      */     //   828: ldc_w 'glTextureImage3DEXT'
/*      */     //   831: invokestatic getFunctionAddress : (Ljava/lang/String;)J
/*      */     //   834: dup2_x1
/*      */     //   835: putfield EXT_direct_state_access_glTextureImage3DEXT_pointer : J
/*      */     //   838: lconst_0
/*      */     //   839: lcmp
/*      */     //   840: ifeq -> 847
/*      */     //   843: iconst_1
/*      */     //   844: goto -> 848
/*      */     //   847: iconst_0
/*      */     //   848: iand
/*      */     //   849: aload_2
/*      */     //   850: ldc_w 'OpenGL12'
/*      */     //   853: invokeinterface contains : (Ljava/lang/Object;)Z
/*      */     //   858: ifeq -> 877
/*      */     //   861: aload_0
/*      */     //   862: ldc_w 'glTextureSubImage3DEXT'
/*      */     //   865: invokestatic getFunctionAddress : (Ljava/lang/String;)J
/*      */     //   868: dup2_x1
/*      */     //   869: putfield EXT_direct_state_access_glTextureSubImage3DEXT_pointer : J
/*      */     //   872: lconst_0
/*      */     //   873: lcmp
/*      */     //   874: ifeq -> 881
/*      */     //   877: iconst_1
/*      */     //   878: goto -> 882
/*      */     //   881: iconst_0
/*      */     //   882: iand
/*      */     //   883: aload_2
/*      */     //   884: ldc_w 'OpenGL12'
/*      */     //   887: invokeinterface contains : (Ljava/lang/Object;)Z
/*      */     //   892: ifeq -> 911
/*      */     //   895: aload_0
/*      */     //   896: ldc_w 'glCopyTextureSubImage3DEXT'
/*      */     //   899: invokestatic getFunctionAddress : (Ljava/lang/String;)J
/*      */     //   902: dup2_x1
/*      */     //   903: putfield EXT_direct_state_access_glCopyTextureSubImage3DEXT_pointer : J
/*      */     //   906: lconst_0
/*      */     //   907: lcmp
/*      */     //   908: ifeq -> 915
/*      */     //   911: iconst_1
/*      */     //   912: goto -> 916
/*      */     //   915: iconst_0
/*      */     //   916: iand
/*      */     //   917: aload_2
/*      */     //   918: ldc_w 'OpenGL13'
/*      */     //   921: invokeinterface contains : (Ljava/lang/Object;)Z
/*      */     //   926: ifeq -> 945
/*      */     //   929: aload_0
/*      */     //   930: ldc_w 'glBindMultiTextureEXT'
/*      */     //   933: invokestatic getFunctionAddress : (Ljava/lang/String;)J
/*      */     //   936: dup2_x1
/*      */     //   937: putfield EXT_direct_state_access_glBindMultiTextureEXT_pointer : J
/*      */     //   940: lconst_0
/*      */     //   941: lcmp
/*      */     //   942: ifeq -> 949
/*      */     //   945: iconst_1
/*      */     //   946: goto -> 950
/*      */     //   949: iconst_0
/*      */     //   950: iand
/*      */     //   951: iload_1
/*      */     //   952: ifne -> 983
/*      */     //   955: aload_2
/*      */     //   956: ldc_w 'OpenGL13'
/*      */     //   959: invokeinterface contains : (Ljava/lang/Object;)Z
/*      */     //   964: ifeq -> 983
/*      */     //   967: aload_0
/*      */     //   968: ldc_w 'glMultiTexCoordPointerEXT'
/*      */     //   971: invokestatic getFunctionAddress : (Ljava/lang/String;)J
/*      */     //   974: dup2_x1
/*      */     //   975: putfield EXT_direct_state_access_glMultiTexCoordPointerEXT_pointer : J
/*      */     //   978: lconst_0
/*      */     //   979: lcmp
/*      */     //   980: ifeq -> 987
/*      */     //   983: iconst_1
/*      */     //   984: goto -> 988
/*      */     //   987: iconst_0
/*      */     //   988: iand
/*      */     //   989: iload_1
/*      */     //   990: ifne -> 1021
/*      */     //   993: aload_2
/*      */     //   994: ldc_w 'OpenGL13'
/*      */     //   997: invokeinterface contains : (Ljava/lang/Object;)Z
/*      */     //   1002: ifeq -> 1021
/*      */     //   1005: aload_0
/*      */     //   1006: ldc_w 'glMultiTexEnvfEXT'
/*      */     //   1009: invokestatic getFunctionAddress : (Ljava/lang/String;)J
/*      */     //   1012: dup2_x1
/*      */     //   1013: putfield EXT_direct_state_access_glMultiTexEnvfEXT_pointer : J
/*      */     //   1016: lconst_0
/*      */     //   1017: lcmp
/*      */     //   1018: ifeq -> 1025
/*      */     //   1021: iconst_1
/*      */     //   1022: goto -> 1026
/*      */     //   1025: iconst_0
/*      */     //   1026: iand
/*      */     //   1027: iload_1
/*      */     //   1028: ifne -> 1059
/*      */     //   1031: aload_2
/*      */     //   1032: ldc_w 'OpenGL13'
/*      */     //   1035: invokeinterface contains : (Ljava/lang/Object;)Z
/*      */     //   1040: ifeq -> 1059
/*      */     //   1043: aload_0
/*      */     //   1044: ldc_w 'glMultiTexEnvfvEXT'
/*      */     //   1047: invokestatic getFunctionAddress : (Ljava/lang/String;)J
/*      */     //   1050: dup2_x1
/*      */     //   1051: putfield EXT_direct_state_access_glMultiTexEnvfvEXT_pointer : J
/*      */     //   1054: lconst_0
/*      */     //   1055: lcmp
/*      */     //   1056: ifeq -> 1063
/*      */     //   1059: iconst_1
/*      */     //   1060: goto -> 1064
/*      */     //   1063: iconst_0
/*      */     //   1064: iand
/*      */     //   1065: iload_1
/*      */     //   1066: ifne -> 1097
/*      */     //   1069: aload_2
/*      */     //   1070: ldc_w 'OpenGL13'
/*      */     //   1073: invokeinterface contains : (Ljava/lang/Object;)Z
/*      */     //   1078: ifeq -> 1097
/*      */     //   1081: aload_0
/*      */     //   1082: ldc_w 'glMultiTexEnviEXT'
/*      */     //   1085: invokestatic getFunctionAddress : (Ljava/lang/String;)J
/*      */     //   1088: dup2_x1
/*      */     //   1089: putfield EXT_direct_state_access_glMultiTexEnviEXT_pointer : J
/*      */     //   1092: lconst_0
/*      */     //   1093: lcmp
/*      */     //   1094: ifeq -> 1101
/*      */     //   1097: iconst_1
/*      */     //   1098: goto -> 1102
/*      */     //   1101: iconst_0
/*      */     //   1102: iand
/*      */     //   1103: iload_1
/*      */     //   1104: ifne -> 1135
/*      */     //   1107: aload_2
/*      */     //   1108: ldc_w 'OpenGL13'
/*      */     //   1111: invokeinterface contains : (Ljava/lang/Object;)Z
/*      */     //   1116: ifeq -> 1135
/*      */     //   1119: aload_0
/*      */     //   1120: ldc_w 'glMultiTexEnvivEXT'
/*      */     //   1123: invokestatic getFunctionAddress : (Ljava/lang/String;)J
/*      */     //   1126: dup2_x1
/*      */     //   1127: putfield EXT_direct_state_access_glMultiTexEnvivEXT_pointer : J
/*      */     //   1130: lconst_0
/*      */     //   1131: lcmp
/*      */     //   1132: ifeq -> 1139
/*      */     //   1135: iconst_1
/*      */     //   1136: goto -> 1140
/*      */     //   1139: iconst_0
/*      */     //   1140: iand
/*      */     //   1141: iload_1
/*      */     //   1142: ifne -> 1173
/*      */     //   1145: aload_2
/*      */     //   1146: ldc_w 'OpenGL13'
/*      */     //   1149: invokeinterface contains : (Ljava/lang/Object;)Z
/*      */     //   1154: ifeq -> 1173
/*      */     //   1157: aload_0
/*      */     //   1158: ldc_w 'glMultiTexGendEXT'
/*      */     //   1161: invokestatic getFunctionAddress : (Ljava/lang/String;)J
/*      */     //   1164: dup2_x1
/*      */     //   1165: putfield EXT_direct_state_access_glMultiTexGendEXT_pointer : J
/*      */     //   1168: lconst_0
/*      */     //   1169: lcmp
/*      */     //   1170: ifeq -> 1177
/*      */     //   1173: iconst_1
/*      */     //   1174: goto -> 1178
/*      */     //   1177: iconst_0
/*      */     //   1178: iand
/*      */     //   1179: iload_1
/*      */     //   1180: ifne -> 1211
/*      */     //   1183: aload_2
/*      */     //   1184: ldc_w 'OpenGL13'
/*      */     //   1187: invokeinterface contains : (Ljava/lang/Object;)Z
/*      */     //   1192: ifeq -> 1211
/*      */     //   1195: aload_0
/*      */     //   1196: ldc_w 'glMultiTexGendvEXT'
/*      */     //   1199: invokestatic getFunctionAddress : (Ljava/lang/String;)J
/*      */     //   1202: dup2_x1
/*      */     //   1203: putfield EXT_direct_state_access_glMultiTexGendvEXT_pointer : J
/*      */     //   1206: lconst_0
/*      */     //   1207: lcmp
/*      */     //   1208: ifeq -> 1215
/*      */     //   1211: iconst_1
/*      */     //   1212: goto -> 1216
/*      */     //   1215: iconst_0
/*      */     //   1216: iand
/*      */     //   1217: iload_1
/*      */     //   1218: ifne -> 1249
/*      */     //   1221: aload_2
/*      */     //   1222: ldc_w 'OpenGL13'
/*      */     //   1225: invokeinterface contains : (Ljava/lang/Object;)Z
/*      */     //   1230: ifeq -> 1249
/*      */     //   1233: aload_0
/*      */     //   1234: ldc_w 'glMultiTexGenfEXT'
/*      */     //   1237: invokestatic getFunctionAddress : (Ljava/lang/String;)J
/*      */     //   1240: dup2_x1
/*      */     //   1241: putfield EXT_direct_state_access_glMultiTexGenfEXT_pointer : J
/*      */     //   1244: lconst_0
/*      */     //   1245: lcmp
/*      */     //   1246: ifeq -> 1253
/*      */     //   1249: iconst_1
/*      */     //   1250: goto -> 1254
/*      */     //   1253: iconst_0
/*      */     //   1254: iand
/*      */     //   1255: iload_1
/*      */     //   1256: ifne -> 1287
/*      */     //   1259: aload_2
/*      */     //   1260: ldc_w 'OpenGL13'
/*      */     //   1263: invokeinterface contains : (Ljava/lang/Object;)Z
/*      */     //   1268: ifeq -> 1287
/*      */     //   1271: aload_0
/*      */     //   1272: ldc_w 'glMultiTexGenfvEXT'
/*      */     //   1275: invokestatic getFunctionAddress : (Ljava/lang/String;)J
/*      */     //   1278: dup2_x1
/*      */     //   1279: putfield EXT_direct_state_access_glMultiTexGenfvEXT_pointer : J
/*      */     //   1282: lconst_0
/*      */     //   1283: lcmp
/*      */     //   1284: ifeq -> 1291
/*      */     //   1287: iconst_1
/*      */     //   1288: goto -> 1292
/*      */     //   1291: iconst_0
/*      */     //   1292: iand
/*      */     //   1293: iload_1
/*      */     //   1294: ifne -> 1325
/*      */     //   1297: aload_2
/*      */     //   1298: ldc_w 'OpenGL13'
/*      */     //   1301: invokeinterface contains : (Ljava/lang/Object;)Z
/*      */     //   1306: ifeq -> 1325
/*      */     //   1309: aload_0
/*      */     //   1310: ldc_w 'glMultiTexGeniEXT'
/*      */     //   1313: invokestatic getFunctionAddress : (Ljava/lang/String;)J
/*      */     //   1316: dup2_x1
/*      */     //   1317: putfield EXT_direct_state_access_glMultiTexGeniEXT_pointer : J
/*      */     //   1320: lconst_0
/*      */     //   1321: lcmp
/*      */     //   1322: ifeq -> 1329
/*      */     //   1325: iconst_1
/*      */     //   1326: goto -> 1330
/*      */     //   1329: iconst_0
/*      */     //   1330: iand
/*      */     //   1331: iload_1
/*      */     //   1332: ifne -> 1363
/*      */     //   1335: aload_2
/*      */     //   1336: ldc_w 'OpenGL13'
/*      */     //   1339: invokeinterface contains : (Ljava/lang/Object;)Z
/*      */     //   1344: ifeq -> 1363
/*      */     //   1347: aload_0
/*      */     //   1348: ldc_w 'glMultiTexGenivEXT'
/*      */     //   1351: invokestatic getFunctionAddress : (Ljava/lang/String;)J
/*      */     //   1354: dup2_x1
/*      */     //   1355: putfield EXT_direct_state_access_glMultiTexGenivEXT_pointer : J
/*      */     //   1358: lconst_0
/*      */     //   1359: lcmp
/*      */     //   1360: ifeq -> 1367
/*      */     //   1363: iconst_1
/*      */     //   1364: goto -> 1368
/*      */     //   1367: iconst_0
/*      */     //   1368: iand
/*      */     //   1369: iload_1
/*      */     //   1370: ifne -> 1401
/*      */     //   1373: aload_2
/*      */     //   1374: ldc_w 'OpenGL13'
/*      */     //   1377: invokeinterface contains : (Ljava/lang/Object;)Z
/*      */     //   1382: ifeq -> 1401
/*      */     //   1385: aload_0
/*      */     //   1386: ldc_w 'glGetMultiTexEnvfvEXT'
/*      */     //   1389: invokestatic getFunctionAddress : (Ljava/lang/String;)J
/*      */     //   1392: dup2_x1
/*      */     //   1393: putfield EXT_direct_state_access_glGetMultiTexEnvfvEXT_pointer : J
/*      */     //   1396: lconst_0
/*      */     //   1397: lcmp
/*      */     //   1398: ifeq -> 1405
/*      */     //   1401: iconst_1
/*      */     //   1402: goto -> 1406
/*      */     //   1405: iconst_0
/*      */     //   1406: iand
/*      */     //   1407: iload_1
/*      */     //   1408: ifne -> 1439
/*      */     //   1411: aload_2
/*      */     //   1412: ldc_w 'OpenGL13'
/*      */     //   1415: invokeinterface contains : (Ljava/lang/Object;)Z
/*      */     //   1420: ifeq -> 1439
/*      */     //   1423: aload_0
/*      */     //   1424: ldc_w 'glGetMultiTexEnvivEXT'
/*      */     //   1427: invokestatic getFunctionAddress : (Ljava/lang/String;)J
/*      */     //   1430: dup2_x1
/*      */     //   1431: putfield EXT_direct_state_access_glGetMultiTexEnvivEXT_pointer : J
/*      */     //   1434: lconst_0
/*      */     //   1435: lcmp
/*      */     //   1436: ifeq -> 1443
/*      */     //   1439: iconst_1
/*      */     //   1440: goto -> 1444
/*      */     //   1443: iconst_0
/*      */     //   1444: iand
/*      */     //   1445: iload_1
/*      */     //   1446: ifne -> 1477
/*      */     //   1449: aload_2
/*      */     //   1450: ldc_w 'OpenGL13'
/*      */     //   1453: invokeinterface contains : (Ljava/lang/Object;)Z
/*      */     //   1458: ifeq -> 1477
/*      */     //   1461: aload_0
/*      */     //   1462: ldc_w 'glGetMultiTexGendvEXT'
/*      */     //   1465: invokestatic getFunctionAddress : (Ljava/lang/String;)J
/*      */     //   1468: dup2_x1
/*      */     //   1469: putfield EXT_direct_state_access_glGetMultiTexGendvEXT_pointer : J
/*      */     //   1472: lconst_0
/*      */     //   1473: lcmp
/*      */     //   1474: ifeq -> 1481
/*      */     //   1477: iconst_1
/*      */     //   1478: goto -> 1482
/*      */     //   1481: iconst_0
/*      */     //   1482: iand
/*      */     //   1483: iload_1
/*      */     //   1484: ifne -> 1515
/*      */     //   1487: aload_2
/*      */     //   1488: ldc_w 'OpenGL13'
/*      */     //   1491: invokeinterface contains : (Ljava/lang/Object;)Z
/*      */     //   1496: ifeq -> 1515
/*      */     //   1499: aload_0
/*      */     //   1500: ldc_w 'glGetMultiTexGenfvEXT'
/*      */     //   1503: invokestatic getFunctionAddress : (Ljava/lang/String;)J
/*      */     //   1506: dup2_x1
/*      */     //   1507: putfield EXT_direct_state_access_glGetMultiTexGenfvEXT_pointer : J
/*      */     //   1510: lconst_0
/*      */     //   1511: lcmp
/*      */     //   1512: ifeq -> 1519
/*      */     //   1515: iconst_1
/*      */     //   1516: goto -> 1520
/*      */     //   1519: iconst_0
/*      */     //   1520: iand
/*      */     //   1521: iload_1
/*      */     //   1522: ifne -> 1553
/*      */     //   1525: aload_2
/*      */     //   1526: ldc_w 'OpenGL13'
/*      */     //   1529: invokeinterface contains : (Ljava/lang/Object;)Z
/*      */     //   1534: ifeq -> 1553
/*      */     //   1537: aload_0
/*      */     //   1538: ldc_w 'glGetMultiTexGenivEXT'
/*      */     //   1541: invokestatic getFunctionAddress : (Ljava/lang/String;)J
/*      */     //   1544: dup2_x1
/*      */     //   1545: putfield EXT_direct_state_access_glGetMultiTexGenivEXT_pointer : J
/*      */     //   1548: lconst_0
/*      */     //   1549: lcmp
/*      */     //   1550: ifeq -> 1557
/*      */     //   1553: iconst_1
/*      */     //   1554: goto -> 1558
/*      */     //   1557: iconst_0
/*      */     //   1558: iand
/*      */     //   1559: aload_2
/*      */     //   1560: ldc_w 'OpenGL13'
/*      */     //   1563: invokeinterface contains : (Ljava/lang/Object;)Z
/*      */     //   1568: ifeq -> 1587
/*      */     //   1571: aload_0
/*      */     //   1572: ldc_w 'glMultiTexParameteriEXT'
/*      */     //   1575: invokestatic getFunctionAddress : (Ljava/lang/String;)J
/*      */     //   1578: dup2_x1
/*      */     //   1579: putfield EXT_direct_state_access_glMultiTexParameteriEXT_pointer : J
/*      */     //   1582: lconst_0
/*      */     //   1583: lcmp
/*      */     //   1584: ifeq -> 1591
/*      */     //   1587: iconst_1
/*      */     //   1588: goto -> 1592
/*      */     //   1591: iconst_0
/*      */     //   1592: iand
/*      */     //   1593: aload_2
/*      */     //   1594: ldc_w 'OpenGL13'
/*      */     //   1597: invokeinterface contains : (Ljava/lang/Object;)Z
/*      */     //   1602: ifeq -> 1621
/*      */     //   1605: aload_0
/*      */     //   1606: ldc_w 'glMultiTexParameterivEXT'
/*      */     //   1609: invokestatic getFunctionAddress : (Ljava/lang/String;)J
/*      */     //   1612: dup2_x1
/*      */     //   1613: putfield EXT_direct_state_access_glMultiTexParameterivEXT_pointer : J
/*      */     //   1616: lconst_0
/*      */     //   1617: lcmp
/*      */     //   1618: ifeq -> 1625
/*      */     //   1621: iconst_1
/*      */     //   1622: goto -> 1626
/*      */     //   1625: iconst_0
/*      */     //   1626: iand
/*      */     //   1627: aload_2
/*      */     //   1628: ldc_w 'OpenGL13'
/*      */     //   1631: invokeinterface contains : (Ljava/lang/Object;)Z
/*      */     //   1636: ifeq -> 1655
/*      */     //   1639: aload_0
/*      */     //   1640: ldc_w 'glMultiTexParameterfEXT'
/*      */     //   1643: invokestatic getFunctionAddress : (Ljava/lang/String;)J
/*      */     //   1646: dup2_x1
/*      */     //   1647: putfield EXT_direct_state_access_glMultiTexParameterfEXT_pointer : J
/*      */     //   1650: lconst_0
/*      */     //   1651: lcmp
/*      */     //   1652: ifeq -> 1659
/*      */     //   1655: iconst_1
/*      */     //   1656: goto -> 1660
/*      */     //   1659: iconst_0
/*      */     //   1660: iand
/*      */     //   1661: aload_2
/*      */     //   1662: ldc_w 'OpenGL13'
/*      */     //   1665: invokeinterface contains : (Ljava/lang/Object;)Z
/*      */     //   1670: ifeq -> 1689
/*      */     //   1673: aload_0
/*      */     //   1674: ldc_w 'glMultiTexParameterfvEXT'
/*      */     //   1677: invokestatic getFunctionAddress : (Ljava/lang/String;)J
/*      */     //   1680: dup2_x1
/*      */     //   1681: putfield EXT_direct_state_access_glMultiTexParameterfvEXT_pointer : J
/*      */     //   1684: lconst_0
/*      */     //   1685: lcmp
/*      */     //   1686: ifeq -> 1693
/*      */     //   1689: iconst_1
/*      */     //   1690: goto -> 1694
/*      */     //   1693: iconst_0
/*      */     //   1694: iand
/*      */     //   1695: aload_2
/*      */     //   1696: ldc_w 'OpenGL13'
/*      */     //   1699: invokeinterface contains : (Ljava/lang/Object;)Z
/*      */     //   1704: ifeq -> 1723
/*      */     //   1707: aload_0
/*      */     //   1708: ldc_w 'glMultiTexImage1DEXT'
/*      */     //   1711: invokestatic getFunctionAddress : (Ljava/lang/String;)J
/*      */     //   1714: dup2_x1
/*      */     //   1715: putfield EXT_direct_state_access_glMultiTexImage1DEXT_pointer : J
/*      */     //   1718: lconst_0
/*      */     //   1719: lcmp
/*      */     //   1720: ifeq -> 1727
/*      */     //   1723: iconst_1
/*      */     //   1724: goto -> 1728
/*      */     //   1727: iconst_0
/*      */     //   1728: iand
/*      */     //   1729: aload_2
/*      */     //   1730: ldc_w 'OpenGL13'
/*      */     //   1733: invokeinterface contains : (Ljava/lang/Object;)Z
/*      */     //   1738: ifeq -> 1757
/*      */     //   1741: aload_0
/*      */     //   1742: ldc_w 'glMultiTexImage2DEXT'
/*      */     //   1745: invokestatic getFunctionAddress : (Ljava/lang/String;)J
/*      */     //   1748: dup2_x1
/*      */     //   1749: putfield EXT_direct_state_access_glMultiTexImage2DEXT_pointer : J
/*      */     //   1752: lconst_0
/*      */     //   1753: lcmp
/*      */     //   1754: ifeq -> 1761
/*      */     //   1757: iconst_1
/*      */     //   1758: goto -> 1762
/*      */     //   1761: iconst_0
/*      */     //   1762: iand
/*      */     //   1763: aload_2
/*      */     //   1764: ldc_w 'OpenGL13'
/*      */     //   1767: invokeinterface contains : (Ljava/lang/Object;)Z
/*      */     //   1772: ifeq -> 1791
/*      */     //   1775: aload_0
/*      */     //   1776: ldc_w 'glMultiTexSubImage1DEXT'
/*      */     //   1779: invokestatic getFunctionAddress : (Ljava/lang/String;)J
/*      */     //   1782: dup2_x1
/*      */     //   1783: putfield EXT_direct_state_access_glMultiTexSubImage1DEXT_pointer : J
/*      */     //   1786: lconst_0
/*      */     //   1787: lcmp
/*      */     //   1788: ifeq -> 1795
/*      */     //   1791: iconst_1
/*      */     //   1792: goto -> 1796
/*      */     //   1795: iconst_0
/*      */     //   1796: iand
/*      */     //   1797: aload_2
/*      */     //   1798: ldc_w 'OpenGL13'
/*      */     //   1801: invokeinterface contains : (Ljava/lang/Object;)Z
/*      */     //   1806: ifeq -> 1825
/*      */     //   1809: aload_0
/*      */     //   1810: ldc_w 'glMultiTexSubImage2DEXT'
/*      */     //   1813: invokestatic getFunctionAddress : (Ljava/lang/String;)J
/*      */     //   1816: dup2_x1
/*      */     //   1817: putfield EXT_direct_state_access_glMultiTexSubImage2DEXT_pointer : J
/*      */     //   1820: lconst_0
/*      */     //   1821: lcmp
/*      */     //   1822: ifeq -> 1829
/*      */     //   1825: iconst_1
/*      */     //   1826: goto -> 1830
/*      */     //   1829: iconst_0
/*      */     //   1830: iand
/*      */     //   1831: aload_2
/*      */     //   1832: ldc_w 'OpenGL13'
/*      */     //   1835: invokeinterface contains : (Ljava/lang/Object;)Z
/*      */     //   1840: ifeq -> 1859
/*      */     //   1843: aload_0
/*      */     //   1844: ldc_w 'glCopyMultiTexImage1DEXT'
/*      */     //   1847: invokestatic getFunctionAddress : (Ljava/lang/String;)J
/*      */     //   1850: dup2_x1
/*      */     //   1851: putfield EXT_direct_state_access_glCopyMultiTexImage1DEXT_pointer : J
/*      */     //   1854: lconst_0
/*      */     //   1855: lcmp
/*      */     //   1856: ifeq -> 1863
/*      */     //   1859: iconst_1
/*      */     //   1860: goto -> 1864
/*      */     //   1863: iconst_0
/*      */     //   1864: iand
/*      */     //   1865: aload_2
/*      */     //   1866: ldc_w 'OpenGL13'
/*      */     //   1869: invokeinterface contains : (Ljava/lang/Object;)Z
/*      */     //   1874: ifeq -> 1893
/*      */     //   1877: aload_0
/*      */     //   1878: ldc_w 'glCopyMultiTexImage2DEXT'
/*      */     //   1881: invokestatic getFunctionAddress : (Ljava/lang/String;)J
/*      */     //   1884: dup2_x1
/*      */     //   1885: putfield EXT_direct_state_access_glCopyMultiTexImage2DEXT_pointer : J
/*      */     //   1888: lconst_0
/*      */     //   1889: lcmp
/*      */     //   1890: ifeq -> 1897
/*      */     //   1893: iconst_1
/*      */     //   1894: goto -> 1898
/*      */     //   1897: iconst_0
/*      */     //   1898: iand
/*      */     //   1899: aload_2
/*      */     //   1900: ldc_w 'OpenGL13'
/*      */     //   1903: invokeinterface contains : (Ljava/lang/Object;)Z
/*      */     //   1908: ifeq -> 1927
/*      */     //   1911: aload_0
/*      */     //   1912: ldc_w 'glCopyMultiTexSubImage1DEXT'
/*      */     //   1915: invokestatic getFunctionAddress : (Ljava/lang/String;)J
/*      */     //   1918: dup2_x1
/*      */     //   1919: putfield EXT_direct_state_access_glCopyMultiTexSubImage1DEXT_pointer : J
/*      */     //   1922: lconst_0
/*      */     //   1923: lcmp
/*      */     //   1924: ifeq -> 1931
/*      */     //   1927: iconst_1
/*      */     //   1928: goto -> 1932
/*      */     //   1931: iconst_0
/*      */     //   1932: iand
/*      */     //   1933: aload_2
/*      */     //   1934: ldc_w 'OpenGL13'
/*      */     //   1937: invokeinterface contains : (Ljava/lang/Object;)Z
/*      */     //   1942: ifeq -> 1961
/*      */     //   1945: aload_0
/*      */     //   1946: ldc_w 'glCopyMultiTexSubImage2DEXT'
/*      */     //   1949: invokestatic getFunctionAddress : (Ljava/lang/String;)J
/*      */     //   1952: dup2_x1
/*      */     //   1953: putfield EXT_direct_state_access_glCopyMultiTexSubImage2DEXT_pointer : J
/*      */     //   1956: lconst_0
/*      */     //   1957: lcmp
/*      */     //   1958: ifeq -> 1965
/*      */     //   1961: iconst_1
/*      */     //   1962: goto -> 1966
/*      */     //   1965: iconst_0
/*      */     //   1966: iand
/*      */     //   1967: aload_2
/*      */     //   1968: ldc_w 'OpenGL13'
/*      */     //   1971: invokeinterface contains : (Ljava/lang/Object;)Z
/*      */     //   1976: ifeq -> 1995
/*      */     //   1979: aload_0
/*      */     //   1980: ldc_w 'glGetMultiTexImageEXT'
/*      */     //   1983: invokestatic getFunctionAddress : (Ljava/lang/String;)J
/*      */     //   1986: dup2_x1
/*      */     //   1987: putfield EXT_direct_state_access_glGetMultiTexImageEXT_pointer : J
/*      */     //   1990: lconst_0
/*      */     //   1991: lcmp
/*      */     //   1992: ifeq -> 1999
/*      */     //   1995: iconst_1
/*      */     //   1996: goto -> 2000
/*      */     //   1999: iconst_0
/*      */     //   2000: iand
/*      */     //   2001: aload_2
/*      */     //   2002: ldc_w 'OpenGL13'
/*      */     //   2005: invokeinterface contains : (Ljava/lang/Object;)Z
/*      */     //   2010: ifeq -> 2029
/*      */     //   2013: aload_0
/*      */     //   2014: ldc_w 'glGetMultiTexParameterfvEXT'
/*      */     //   2017: invokestatic getFunctionAddress : (Ljava/lang/String;)J
/*      */     //   2020: dup2_x1
/*      */     //   2021: putfield EXT_direct_state_access_glGetMultiTexParameterfvEXT_pointer : J
/*      */     //   2024: lconst_0
/*      */     //   2025: lcmp
/*      */     //   2026: ifeq -> 2033
/*      */     //   2029: iconst_1
/*      */     //   2030: goto -> 2034
/*      */     //   2033: iconst_0
/*      */     //   2034: iand
/*      */     //   2035: aload_2
/*      */     //   2036: ldc_w 'OpenGL13'
/*      */     //   2039: invokeinterface contains : (Ljava/lang/Object;)Z
/*      */     //   2044: ifeq -> 2063
/*      */     //   2047: aload_0
/*      */     //   2048: ldc_w 'glGetMultiTexParameterivEXT'
/*      */     //   2051: invokestatic getFunctionAddress : (Ljava/lang/String;)J
/*      */     //   2054: dup2_x1
/*      */     //   2055: putfield EXT_direct_state_access_glGetMultiTexParameterivEXT_pointer : J
/*      */     //   2058: lconst_0
/*      */     //   2059: lcmp
/*      */     //   2060: ifeq -> 2067
/*      */     //   2063: iconst_1
/*      */     //   2064: goto -> 2068
/*      */     //   2067: iconst_0
/*      */     //   2068: iand
/*      */     //   2069: aload_2
/*      */     //   2070: ldc_w 'OpenGL13'
/*      */     //   2073: invokeinterface contains : (Ljava/lang/Object;)Z
/*      */     //   2078: ifeq -> 2097
/*      */     //   2081: aload_0
/*      */     //   2082: ldc_w 'glGetMultiTexLevelParameterfvEXT'
/*      */     //   2085: invokestatic getFunctionAddress : (Ljava/lang/String;)J
/*      */     //   2088: dup2_x1
/*      */     //   2089: putfield EXT_direct_state_access_glGetMultiTexLevelParameterfvEXT_pointer : J
/*      */     //   2092: lconst_0
/*      */     //   2093: lcmp
/*      */     //   2094: ifeq -> 2101
/*      */     //   2097: iconst_1
/*      */     //   2098: goto -> 2102
/*      */     //   2101: iconst_0
/*      */     //   2102: iand
/*      */     //   2103: aload_2
/*      */     //   2104: ldc_w 'OpenGL13'
/*      */     //   2107: invokeinterface contains : (Ljava/lang/Object;)Z
/*      */     //   2112: ifeq -> 2131
/*      */     //   2115: aload_0
/*      */     //   2116: ldc_w 'glGetMultiTexLevelParameterivEXT'
/*      */     //   2119: invokestatic getFunctionAddress : (Ljava/lang/String;)J
/*      */     //   2122: dup2_x1
/*      */     //   2123: putfield EXT_direct_state_access_glGetMultiTexLevelParameterivEXT_pointer : J
/*      */     //   2126: lconst_0
/*      */     //   2127: lcmp
/*      */     //   2128: ifeq -> 2135
/*      */     //   2131: iconst_1
/*      */     //   2132: goto -> 2136
/*      */     //   2135: iconst_0
/*      */     //   2136: iand
/*      */     //   2137: aload_2
/*      */     //   2138: ldc_w 'OpenGL13'
/*      */     //   2141: invokeinterface contains : (Ljava/lang/Object;)Z
/*      */     //   2146: ifeq -> 2165
/*      */     //   2149: aload_0
/*      */     //   2150: ldc_w 'glMultiTexImage3DEXT'
/*      */     //   2153: invokestatic getFunctionAddress : (Ljava/lang/String;)J
/*      */     //   2156: dup2_x1
/*      */     //   2157: putfield EXT_direct_state_access_glMultiTexImage3DEXT_pointer : J
/*      */     //   2160: lconst_0
/*      */     //   2161: lcmp
/*      */     //   2162: ifeq -> 2169
/*      */     //   2165: iconst_1
/*      */     //   2166: goto -> 2170
/*      */     //   2169: iconst_0
/*      */     //   2170: iand
/*      */     //   2171: aload_2
/*      */     //   2172: ldc_w 'OpenGL13'
/*      */     //   2175: invokeinterface contains : (Ljava/lang/Object;)Z
/*      */     //   2180: ifeq -> 2199
/*      */     //   2183: aload_0
/*      */     //   2184: ldc_w 'glMultiTexSubImage3DEXT'
/*      */     //   2187: invokestatic getFunctionAddress : (Ljava/lang/String;)J
/*      */     //   2190: dup2_x1
/*      */     //   2191: putfield EXT_direct_state_access_glMultiTexSubImage3DEXT_pointer : J
/*      */     //   2194: lconst_0
/*      */     //   2195: lcmp
/*      */     //   2196: ifeq -> 2203
/*      */     //   2199: iconst_1
/*      */     //   2200: goto -> 2204
/*      */     //   2203: iconst_0
/*      */     //   2204: iand
/*      */     //   2205: aload_2
/*      */     //   2206: ldc_w 'OpenGL13'
/*      */     //   2209: invokeinterface contains : (Ljava/lang/Object;)Z
/*      */     //   2214: ifeq -> 2233
/*      */     //   2217: aload_0
/*      */     //   2218: ldc_w 'glCopyMultiTexSubImage3DEXT'
/*      */     //   2221: invokestatic getFunctionAddress : (Ljava/lang/String;)J
/*      */     //   2224: dup2_x1
/*      */     //   2225: putfield EXT_direct_state_access_glCopyMultiTexSubImage3DEXT_pointer : J
/*      */     //   2228: lconst_0
/*      */     //   2229: lcmp
/*      */     //   2230: ifeq -> 2237
/*      */     //   2233: iconst_1
/*      */     //   2234: goto -> 2238
/*      */     //   2237: iconst_0
/*      */     //   2238: iand
/*      */     //   2239: iload_1
/*      */     //   2240: ifne -> 2271
/*      */     //   2243: aload_2
/*      */     //   2244: ldc_w 'OpenGL13'
/*      */     //   2247: invokeinterface contains : (Ljava/lang/Object;)Z
/*      */     //   2252: ifeq -> 2271
/*      */     //   2255: aload_0
/*      */     //   2256: ldc_w 'glEnableClientStateIndexedEXT'
/*      */     //   2259: invokestatic getFunctionAddress : (Ljava/lang/String;)J
/*      */     //   2262: dup2_x1
/*      */     //   2263: putfield EXT_direct_state_access_glEnableClientStateIndexedEXT_pointer : J
/*      */     //   2266: lconst_0
/*      */     //   2267: lcmp
/*      */     //   2268: ifeq -> 2275
/*      */     //   2271: iconst_1
/*      */     //   2272: goto -> 2276
/*      */     //   2275: iconst_0
/*      */     //   2276: iand
/*      */     //   2277: iload_1
/*      */     //   2278: ifne -> 2309
/*      */     //   2281: aload_2
/*      */     //   2282: ldc_w 'OpenGL13'
/*      */     //   2285: invokeinterface contains : (Ljava/lang/Object;)Z
/*      */     //   2290: ifeq -> 2309
/*      */     //   2293: aload_0
/*      */     //   2294: ldc_w 'glDisableClientStateIndexedEXT'
/*      */     //   2297: invokestatic getFunctionAddress : (Ljava/lang/String;)J
/*      */     //   2300: dup2_x1
/*      */     //   2301: putfield EXT_direct_state_access_glDisableClientStateIndexedEXT_pointer : J
/*      */     //   2304: lconst_0
/*      */     //   2305: lcmp
/*      */     //   2306: ifeq -> 2313
/*      */     //   2309: iconst_1
/*      */     //   2310: goto -> 2314
/*      */     //   2313: iconst_0
/*      */     //   2314: iand
/*      */     //   2315: aload_2
/*      */     //   2316: ldc_w 'OpenGL30'
/*      */     //   2319: invokeinterface contains : (Ljava/lang/Object;)Z
/*      */     //   2324: ifeq -> 2343
/*      */     //   2327: aload_0
/*      */     //   2328: ldc_w 'glEnableClientStateiEXT'
/*      */     //   2331: invokestatic getFunctionAddress : (Ljava/lang/String;)J
/*      */     //   2334: dup2_x1
/*      */     //   2335: putfield EXT_direct_state_access_glEnableClientStateiEXT_pointer : J
/*      */     //   2338: lconst_0
/*      */     //   2339: lcmp
/*      */     //   2340: ifne -> 2343
/*      */     //   2343: iconst_1
/*      */     //   2344: iand
/*      */     //   2345: aload_2
/*      */     //   2346: ldc_w 'OpenGL30'
/*      */     //   2349: invokeinterface contains : (Ljava/lang/Object;)Z
/*      */     //   2354: ifeq -> 2373
/*      */     //   2357: aload_0
/*      */     //   2358: ldc_w 'glDisableClientStateiEXT'
/*      */     //   2361: invokestatic getFunctionAddress : (Ljava/lang/String;)J
/*      */     //   2364: dup2_x1
/*      */     //   2365: putfield EXT_direct_state_access_glDisableClientStateiEXT_pointer : J
/*      */     //   2368: lconst_0
/*      */     //   2369: lcmp
/*      */     //   2370: ifne -> 2373
/*      */     //   2373: iconst_1
/*      */     //   2374: iand
/*      */     //   2375: aload_2
/*      */     //   2376: ldc_w 'OpenGL13'
/*      */     //   2379: invokeinterface contains : (Ljava/lang/Object;)Z
/*      */     //   2384: ifeq -> 2403
/*      */     //   2387: aload_0
/*      */     //   2388: ldc_w 'glGetFloatIndexedvEXT'
/*      */     //   2391: invokestatic getFunctionAddress : (Ljava/lang/String;)J
/*      */     //   2394: dup2_x1
/*      */     //   2395: putfield EXT_direct_state_access_glGetFloatIndexedvEXT_pointer : J
/*      */     //   2398: lconst_0
/*      */     //   2399: lcmp
/*      */     //   2400: ifeq -> 2407
/*      */     //   2403: iconst_1
/*      */     //   2404: goto -> 2408
/*      */     //   2407: iconst_0
/*      */     //   2408: iand
/*      */     //   2409: aload_2
/*      */     //   2410: ldc_w 'OpenGL13'
/*      */     //   2413: invokeinterface contains : (Ljava/lang/Object;)Z
/*      */     //   2418: ifeq -> 2437
/*      */     //   2421: aload_0
/*      */     //   2422: ldc_w 'glGetDoubleIndexedvEXT'
/*      */     //   2425: invokestatic getFunctionAddress : (Ljava/lang/String;)J
/*      */     //   2428: dup2_x1
/*      */     //   2429: putfield EXT_direct_state_access_glGetDoubleIndexedvEXT_pointer : J
/*      */     //   2432: lconst_0
/*      */     //   2433: lcmp
/*      */     //   2434: ifeq -> 2441
/*      */     //   2437: iconst_1
/*      */     //   2438: goto -> 2442
/*      */     //   2441: iconst_0
/*      */     //   2442: iand
/*      */     //   2443: aload_2
/*      */     //   2444: ldc_w 'OpenGL13'
/*      */     //   2447: invokeinterface contains : (Ljava/lang/Object;)Z
/*      */     //   2452: ifeq -> 2471
/*      */     //   2455: aload_0
/*      */     //   2456: ldc_w 'glGetPointerIndexedvEXT'
/*      */     //   2459: invokestatic getFunctionAddress : (Ljava/lang/String;)J
/*      */     //   2462: dup2_x1
/*      */     //   2463: putfield EXT_direct_state_access_glGetPointerIndexedvEXT_pointer : J
/*      */     //   2466: lconst_0
/*      */     //   2467: lcmp
/*      */     //   2468: ifeq -> 2475
/*      */     //   2471: iconst_1
/*      */     //   2472: goto -> 2476
/*      */     //   2475: iconst_0
/*      */     //   2476: iand
/*      */     //   2477: aload_2
/*      */     //   2478: ldc_w 'OpenGL30'
/*      */     //   2481: invokeinterface contains : (Ljava/lang/Object;)Z
/*      */     //   2486: ifeq -> 2505
/*      */     //   2489: aload_0
/*      */     //   2490: ldc_w 'glGetFloati_vEXT'
/*      */     //   2493: invokestatic getFunctionAddress : (Ljava/lang/String;)J
/*      */     //   2496: dup2_x1
/*      */     //   2497: putfield EXT_direct_state_access_glGetFloati_vEXT_pointer : J
/*      */     //   2500: lconst_0
/*      */     //   2501: lcmp
/*      */     //   2502: ifne -> 2505
/*      */     //   2505: iconst_1
/*      */     //   2506: iand
/*      */     //   2507: aload_2
/*      */     //   2508: ldc_w 'OpenGL30'
/*      */     //   2511: invokeinterface contains : (Ljava/lang/Object;)Z
/*      */     //   2516: ifeq -> 2535
/*      */     //   2519: aload_0
/*      */     //   2520: ldc_w 'glGetDoublei_vEXT'
/*      */     //   2523: invokestatic getFunctionAddress : (Ljava/lang/String;)J
/*      */     //   2526: dup2_x1
/*      */     //   2527: putfield EXT_direct_state_access_glGetDoublei_vEXT_pointer : J
/*      */     //   2530: lconst_0
/*      */     //   2531: lcmp
/*      */     //   2532: ifne -> 2535
/*      */     //   2535: iconst_1
/*      */     //   2536: iand
/*      */     //   2537: aload_2
/*      */     //   2538: ldc_w 'OpenGL30'
/*      */     //   2541: invokeinterface contains : (Ljava/lang/Object;)Z
/*      */     //   2546: ifeq -> 2565
/*      */     //   2549: aload_0
/*      */     //   2550: ldc_w 'glGetPointeri_vEXT'
/*      */     //   2553: invokestatic getFunctionAddress : (Ljava/lang/String;)J
/*      */     //   2556: dup2_x1
/*      */     //   2557: putfield EXT_direct_state_access_glGetPointeri_vEXT_pointer : J
/*      */     //   2560: lconst_0
/*      */     //   2561: lcmp
/*      */     //   2562: ifne -> 2565
/*      */     //   2565: iconst_1
/*      */     //   2566: iand
/*      */     //   2567: aload_2
/*      */     //   2568: ldc_w 'GL_EXT_draw_buffers2'
/*      */     //   2571: invokeinterface contains : (Ljava/lang/Object;)Z
/*      */     //   2576: ifeq -> 2595
/*      */     //   2579: aload_0
/*      */     //   2580: ldc_w 'glEnableIndexedEXT'
/*      */     //   2583: invokestatic getFunctionAddress : (Ljava/lang/String;)J
/*      */     //   2586: dup2_x1
/*      */     //   2587: putfield EXT_direct_state_access_glEnableIndexedEXT_pointer : J
/*      */     //   2590: lconst_0
/*      */     //   2591: lcmp
/*      */     //   2592: ifeq -> 2599
/*      */     //   2595: iconst_1
/*      */     //   2596: goto -> 2600
/*      */     //   2599: iconst_0
/*      */     //   2600: iand
/*      */     //   2601: aload_2
/*      */     //   2602: ldc_w 'GL_EXT_draw_buffers2'
/*      */     //   2605: invokeinterface contains : (Ljava/lang/Object;)Z
/*      */     //   2610: ifeq -> 2629
/*      */     //   2613: aload_0
/*      */     //   2614: ldc_w 'glDisableIndexedEXT'
/*      */     //   2617: invokestatic getFunctionAddress : (Ljava/lang/String;)J
/*      */     //   2620: dup2_x1
/*      */     //   2621: putfield EXT_direct_state_access_glDisableIndexedEXT_pointer : J
/*      */     //   2624: lconst_0
/*      */     //   2625: lcmp
/*      */     //   2626: ifeq -> 2633
/*      */     //   2629: iconst_1
/*      */     //   2630: goto -> 2634
/*      */     //   2633: iconst_0
/*      */     //   2634: iand
/*      */     //   2635: aload_2
/*      */     //   2636: ldc_w 'GL_EXT_draw_buffers2'
/*      */     //   2639: invokeinterface contains : (Ljava/lang/Object;)Z
/*      */     //   2644: ifeq -> 2663
/*      */     //   2647: aload_0
/*      */     //   2648: ldc_w 'glIsEnabledIndexedEXT'
/*      */     //   2651: invokestatic getFunctionAddress : (Ljava/lang/String;)J
/*      */     //   2654: dup2_x1
/*      */     //   2655: putfield EXT_direct_state_access_glIsEnabledIndexedEXT_pointer : J
/*      */     //   2658: lconst_0
/*      */     //   2659: lcmp
/*      */     //   2660: ifeq -> 2667
/*      */     //   2663: iconst_1
/*      */     //   2664: goto -> 2668
/*      */     //   2667: iconst_0
/*      */     //   2668: iand
/*      */     //   2669: aload_2
/*      */     //   2670: ldc_w 'GL_EXT_draw_buffers2'
/*      */     //   2673: invokeinterface contains : (Ljava/lang/Object;)Z
/*      */     //   2678: ifeq -> 2697
/*      */     //   2681: aload_0
/*      */     //   2682: ldc_w 'glGetIntegerIndexedvEXT'
/*      */     //   2685: invokestatic getFunctionAddress : (Ljava/lang/String;)J
/*      */     //   2688: dup2_x1
/*      */     //   2689: putfield EXT_direct_state_access_glGetIntegerIndexedvEXT_pointer : J
/*      */     //   2692: lconst_0
/*      */     //   2693: lcmp
/*      */     //   2694: ifeq -> 2701
/*      */     //   2697: iconst_1
/*      */     //   2698: goto -> 2702
/*      */     //   2701: iconst_0
/*      */     //   2702: iand
/*      */     //   2703: aload_2
/*      */     //   2704: ldc_w 'GL_EXT_draw_buffers2'
/*      */     //   2707: invokeinterface contains : (Ljava/lang/Object;)Z
/*      */     //   2712: ifeq -> 2731
/*      */     //   2715: aload_0
/*      */     //   2716: ldc_w 'glGetBooleanIndexedvEXT'
/*      */     //   2719: invokestatic getFunctionAddress : (Ljava/lang/String;)J
/*      */     //   2722: dup2_x1
/*      */     //   2723: putfield EXT_direct_state_access_glGetBooleanIndexedvEXT_pointer : J
/*      */     //   2726: lconst_0
/*      */     //   2727: lcmp
/*      */     //   2728: ifeq -> 2735
/*      */     //   2731: iconst_1
/*      */     //   2732: goto -> 2736
/*      */     //   2735: iconst_0
/*      */     //   2736: iand
/*      */     //   2737: aload_2
/*      */     //   2738: ldc_w 'GL_ARB_vertex_program'
/*      */     //   2741: invokeinterface contains : (Ljava/lang/Object;)Z
/*      */     //   2746: ifeq -> 2765
/*      */     //   2749: aload_0
/*      */     //   2750: ldc_w 'glNamedProgramStringEXT'
/*      */     //   2753: invokestatic getFunctionAddress : (Ljava/lang/String;)J
/*      */     //   2756: dup2_x1
/*      */     //   2757: putfield EXT_direct_state_access_glNamedProgramStringEXT_pointer : J
/*      */     //   2760: lconst_0
/*      */     //   2761: lcmp
/*      */     //   2762: ifeq -> 2769
/*      */     //   2765: iconst_1
/*      */     //   2766: goto -> 2770
/*      */     //   2769: iconst_0
/*      */     //   2770: iand
/*      */     //   2771: aload_2
/*      */     //   2772: ldc_w 'GL_ARB_vertex_program'
/*      */     //   2775: invokeinterface contains : (Ljava/lang/Object;)Z
/*      */     //   2780: ifeq -> 2799
/*      */     //   2783: aload_0
/*      */     //   2784: ldc_w 'glNamedProgramLocalParameter4dEXT'
/*      */     //   2787: invokestatic getFunctionAddress : (Ljava/lang/String;)J
/*      */     //   2790: dup2_x1
/*      */     //   2791: putfield EXT_direct_state_access_glNamedProgramLocalParameter4dEXT_pointer : J
/*      */     //   2794: lconst_0
/*      */     //   2795: lcmp
/*      */     //   2796: ifeq -> 2803
/*      */     //   2799: iconst_1
/*      */     //   2800: goto -> 2804
/*      */     //   2803: iconst_0
/*      */     //   2804: iand
/*      */     //   2805: aload_2
/*      */     //   2806: ldc_w 'GL_ARB_vertex_program'
/*      */     //   2809: invokeinterface contains : (Ljava/lang/Object;)Z
/*      */     //   2814: ifeq -> 2833
/*      */     //   2817: aload_0
/*      */     //   2818: ldc_w 'glNamedProgramLocalParameter4dvEXT'
/*      */     //   2821: invokestatic getFunctionAddress : (Ljava/lang/String;)J
/*      */     //   2824: dup2_x1
/*      */     //   2825: putfield EXT_direct_state_access_glNamedProgramLocalParameter4dvEXT_pointer : J
/*      */     //   2828: lconst_0
/*      */     //   2829: lcmp
/*      */     //   2830: ifeq -> 2837
/*      */     //   2833: iconst_1
/*      */     //   2834: goto -> 2838
/*      */     //   2837: iconst_0
/*      */     //   2838: iand
/*      */     //   2839: aload_2
/*      */     //   2840: ldc_w 'GL_ARB_vertex_program'
/*      */     //   2843: invokeinterface contains : (Ljava/lang/Object;)Z
/*      */     //   2848: ifeq -> 2867
/*      */     //   2851: aload_0
/*      */     //   2852: ldc_w 'glNamedProgramLocalParameter4fEXT'
/*      */     //   2855: invokestatic getFunctionAddress : (Ljava/lang/String;)J
/*      */     //   2858: dup2_x1
/*      */     //   2859: putfield EXT_direct_state_access_glNamedProgramLocalParameter4fEXT_pointer : J
/*      */     //   2862: lconst_0
/*      */     //   2863: lcmp
/*      */     //   2864: ifeq -> 2871
/*      */     //   2867: iconst_1
/*      */     //   2868: goto -> 2872
/*      */     //   2871: iconst_0
/*      */     //   2872: iand
/*      */     //   2873: aload_2
/*      */     //   2874: ldc_w 'GL_ARB_vertex_program'
/*      */     //   2877: invokeinterface contains : (Ljava/lang/Object;)Z
/*      */     //   2882: ifeq -> 2901
/*      */     //   2885: aload_0
/*      */     //   2886: ldc_w 'glNamedProgramLocalParameter4fvEXT'
/*      */     //   2889: invokestatic getFunctionAddress : (Ljava/lang/String;)J
/*      */     //   2892: dup2_x1
/*      */     //   2893: putfield EXT_direct_state_access_glNamedProgramLocalParameter4fvEXT_pointer : J
/*      */     //   2896: lconst_0
/*      */     //   2897: lcmp
/*      */     //   2898: ifeq -> 2905
/*      */     //   2901: iconst_1
/*      */     //   2902: goto -> 2906
/*      */     //   2905: iconst_0
/*      */     //   2906: iand
/*      */     //   2907: aload_2
/*      */     //   2908: ldc_w 'GL_ARB_vertex_program'
/*      */     //   2911: invokeinterface contains : (Ljava/lang/Object;)Z
/*      */     //   2916: ifeq -> 2935
/*      */     //   2919: aload_0
/*      */     //   2920: ldc_w 'glGetNamedProgramLocalParameterdvEXT'
/*      */     //   2923: invokestatic getFunctionAddress : (Ljava/lang/String;)J
/*      */     //   2926: dup2_x1
/*      */     //   2927: putfield EXT_direct_state_access_glGetNamedProgramLocalParameterdvEXT_pointer : J
/*      */     //   2930: lconst_0
/*      */     //   2931: lcmp
/*      */     //   2932: ifeq -> 2939
/*      */     //   2935: iconst_1
/*      */     //   2936: goto -> 2940
/*      */     //   2939: iconst_0
/*      */     //   2940: iand
/*      */     //   2941: aload_2
/*      */     //   2942: ldc_w 'GL_ARB_vertex_program'
/*      */     //   2945: invokeinterface contains : (Ljava/lang/Object;)Z
/*      */     //   2950: ifeq -> 2969
/*      */     //   2953: aload_0
/*      */     //   2954: ldc_w 'glGetNamedProgramLocalParameterfvEXT'
/*      */     //   2957: invokestatic getFunctionAddress : (Ljava/lang/String;)J
/*      */     //   2960: dup2_x1
/*      */     //   2961: putfield EXT_direct_state_access_glGetNamedProgramLocalParameterfvEXT_pointer : J
/*      */     //   2964: lconst_0
/*      */     //   2965: lcmp
/*      */     //   2966: ifeq -> 2973
/*      */     //   2969: iconst_1
/*      */     //   2970: goto -> 2974
/*      */     //   2973: iconst_0
/*      */     //   2974: iand
/*      */     //   2975: aload_2
/*      */     //   2976: ldc_w 'GL_ARB_vertex_program'
/*      */     //   2979: invokeinterface contains : (Ljava/lang/Object;)Z
/*      */     //   2984: ifeq -> 3003
/*      */     //   2987: aload_0
/*      */     //   2988: ldc_w 'glGetNamedProgramivEXT'
/*      */     //   2991: invokestatic getFunctionAddress : (Ljava/lang/String;)J
/*      */     //   2994: dup2_x1
/*      */     //   2995: putfield EXT_direct_state_access_glGetNamedProgramivEXT_pointer : J
/*      */     //   2998: lconst_0
/*      */     //   2999: lcmp
/*      */     //   3000: ifeq -> 3007
/*      */     //   3003: iconst_1
/*      */     //   3004: goto -> 3008
/*      */     //   3007: iconst_0
/*      */     //   3008: iand
/*      */     //   3009: aload_2
/*      */     //   3010: ldc_w 'GL_ARB_vertex_program'
/*      */     //   3013: invokeinterface contains : (Ljava/lang/Object;)Z
/*      */     //   3018: ifeq -> 3037
/*      */     //   3021: aload_0
/*      */     //   3022: ldc_w 'glGetNamedProgramStringEXT'
/*      */     //   3025: invokestatic getFunctionAddress : (Ljava/lang/String;)J
/*      */     //   3028: dup2_x1
/*      */     //   3029: putfield EXT_direct_state_access_glGetNamedProgramStringEXT_pointer : J
/*      */     //   3032: lconst_0
/*      */     //   3033: lcmp
/*      */     //   3034: ifeq -> 3041
/*      */     //   3037: iconst_1
/*      */     //   3038: goto -> 3042
/*      */     //   3041: iconst_0
/*      */     //   3042: iand
/*      */     //   3043: aload_2
/*      */     //   3044: ldc_w 'OpenGL13'
/*      */     //   3047: invokeinterface contains : (Ljava/lang/Object;)Z
/*      */     //   3052: ifeq -> 3071
/*      */     //   3055: aload_0
/*      */     //   3056: ldc_w 'glCompressedTextureImage3DEXT'
/*      */     //   3059: invokestatic getFunctionAddress : (Ljava/lang/String;)J
/*      */     //   3062: dup2_x1
/*      */     //   3063: putfield EXT_direct_state_access_glCompressedTextureImage3DEXT_pointer : J
/*      */     //   3066: lconst_0
/*      */     //   3067: lcmp
/*      */     //   3068: ifeq -> 3075
/*      */     //   3071: iconst_1
/*      */     //   3072: goto -> 3076
/*      */     //   3075: iconst_0
/*      */     //   3076: iand
/*      */     //   3077: aload_2
/*      */     //   3078: ldc_w 'OpenGL13'
/*      */     //   3081: invokeinterface contains : (Ljava/lang/Object;)Z
/*      */     //   3086: ifeq -> 3105
/*      */     //   3089: aload_0
/*      */     //   3090: ldc_w 'glCompressedTextureImage2DEXT'
/*      */     //   3093: invokestatic getFunctionAddress : (Ljava/lang/String;)J
/*      */     //   3096: dup2_x1
/*      */     //   3097: putfield EXT_direct_state_access_glCompressedTextureImage2DEXT_pointer : J
/*      */     //   3100: lconst_0
/*      */     //   3101: lcmp
/*      */     //   3102: ifeq -> 3109
/*      */     //   3105: iconst_1
/*      */     //   3106: goto -> 3110
/*      */     //   3109: iconst_0
/*      */     //   3110: iand
/*      */     //   3111: aload_2
/*      */     //   3112: ldc_w 'OpenGL13'
/*      */     //   3115: invokeinterface contains : (Ljava/lang/Object;)Z
/*      */     //   3120: ifeq -> 3139
/*      */     //   3123: aload_0
/*      */     //   3124: ldc_w 'glCompressedTextureImage1DEXT'
/*      */     //   3127: invokestatic getFunctionAddress : (Ljava/lang/String;)J
/*      */     //   3130: dup2_x1
/*      */     //   3131: putfield EXT_direct_state_access_glCompressedTextureImage1DEXT_pointer : J
/*      */     //   3134: lconst_0
/*      */     //   3135: lcmp
/*      */     //   3136: ifeq -> 3143
/*      */     //   3139: iconst_1
/*      */     //   3140: goto -> 3144
/*      */     //   3143: iconst_0
/*      */     //   3144: iand
/*      */     //   3145: aload_2
/*      */     //   3146: ldc_w 'OpenGL13'
/*      */     //   3149: invokeinterface contains : (Ljava/lang/Object;)Z
/*      */     //   3154: ifeq -> 3173
/*      */     //   3157: aload_0
/*      */     //   3158: ldc_w 'glCompressedTextureSubImage3DEXT'
/*      */     //   3161: invokestatic getFunctionAddress : (Ljava/lang/String;)J
/*      */     //   3164: dup2_x1
/*      */     //   3165: putfield EXT_direct_state_access_glCompressedTextureSubImage3DEXT_pointer : J
/*      */     //   3168: lconst_0
/*      */     //   3169: lcmp
/*      */     //   3170: ifeq -> 3177
/*      */     //   3173: iconst_1
/*      */     //   3174: goto -> 3178
/*      */     //   3177: iconst_0
/*      */     //   3178: iand
/*      */     //   3179: aload_2
/*      */     //   3180: ldc_w 'OpenGL13'
/*      */     //   3183: invokeinterface contains : (Ljava/lang/Object;)Z
/*      */     //   3188: ifeq -> 3207
/*      */     //   3191: aload_0
/*      */     //   3192: ldc_w 'glCompressedTextureSubImage2DEXT'
/*      */     //   3195: invokestatic getFunctionAddress : (Ljava/lang/String;)J
/*      */     //   3198: dup2_x1
/*      */     //   3199: putfield EXT_direct_state_access_glCompressedTextureSubImage2DEXT_pointer : J
/*      */     //   3202: lconst_0
/*      */     //   3203: lcmp
/*      */     //   3204: ifeq -> 3211
/*      */     //   3207: iconst_1
/*      */     //   3208: goto -> 3212
/*      */     //   3211: iconst_0
/*      */     //   3212: iand
/*      */     //   3213: aload_2
/*      */     //   3214: ldc_w 'OpenGL13'
/*      */     //   3217: invokeinterface contains : (Ljava/lang/Object;)Z
/*      */     //   3222: ifeq -> 3241
/*      */     //   3225: aload_0
/*      */     //   3226: ldc_w 'glCompressedTextureSubImage1DEXT'
/*      */     //   3229: invokestatic getFunctionAddress : (Ljava/lang/String;)J
/*      */     //   3232: dup2_x1
/*      */     //   3233: putfield EXT_direct_state_access_glCompressedTextureSubImage1DEXT_pointer : J
/*      */     //   3236: lconst_0
/*      */     //   3237: lcmp
/*      */     //   3238: ifeq -> 3245
/*      */     //   3241: iconst_1
/*      */     //   3242: goto -> 3246
/*      */     //   3245: iconst_0
/*      */     //   3246: iand
/*      */     //   3247: aload_2
/*      */     //   3248: ldc_w 'OpenGL13'
/*      */     //   3251: invokeinterface contains : (Ljava/lang/Object;)Z
/*      */     //   3256: ifeq -> 3275
/*      */     //   3259: aload_0
/*      */     //   3260: ldc_w 'glGetCompressedTextureImageEXT'
/*      */     //   3263: invokestatic getFunctionAddress : (Ljava/lang/String;)J
/*      */     //   3266: dup2_x1
/*      */     //   3267: putfield EXT_direct_state_access_glGetCompressedTextureImageEXT_pointer : J
/*      */     //   3270: lconst_0
/*      */     //   3271: lcmp
/*      */     //   3272: ifeq -> 3279
/*      */     //   3275: iconst_1
/*      */     //   3276: goto -> 3280
/*      */     //   3279: iconst_0
/*      */     //   3280: iand
/*      */     //   3281: aload_2
/*      */     //   3282: ldc_w 'OpenGL13'
/*      */     //   3285: invokeinterface contains : (Ljava/lang/Object;)Z
/*      */     //   3290: ifeq -> 3309
/*      */     //   3293: aload_0
/*      */     //   3294: ldc_w 'glCompressedMultiTexImage3DEXT'
/*      */     //   3297: invokestatic getFunctionAddress : (Ljava/lang/String;)J
/*      */     //   3300: dup2_x1
/*      */     //   3301: putfield EXT_direct_state_access_glCompressedMultiTexImage3DEXT_pointer : J
/*      */     //   3304: lconst_0
/*      */     //   3305: lcmp
/*      */     //   3306: ifeq -> 3313
/*      */     //   3309: iconst_1
/*      */     //   3310: goto -> 3314
/*      */     //   3313: iconst_0
/*      */     //   3314: iand
/*      */     //   3315: aload_2
/*      */     //   3316: ldc_w 'OpenGL13'
/*      */     //   3319: invokeinterface contains : (Ljava/lang/Object;)Z
/*      */     //   3324: ifeq -> 3343
/*      */     //   3327: aload_0
/*      */     //   3328: ldc_w 'glCompressedMultiTexImage2DEXT'
/*      */     //   3331: invokestatic getFunctionAddress : (Ljava/lang/String;)J
/*      */     //   3334: dup2_x1
/*      */     //   3335: putfield EXT_direct_state_access_glCompressedMultiTexImage2DEXT_pointer : J
/*      */     //   3338: lconst_0
/*      */     //   3339: lcmp
/*      */     //   3340: ifeq -> 3347
/*      */     //   3343: iconst_1
/*      */     //   3344: goto -> 3348
/*      */     //   3347: iconst_0
/*      */     //   3348: iand
/*      */     //   3349: aload_2
/*      */     //   3350: ldc_w 'OpenGL13'
/*      */     //   3353: invokeinterface contains : (Ljava/lang/Object;)Z
/*      */     //   3358: ifeq -> 3377
/*      */     //   3361: aload_0
/*      */     //   3362: ldc_w 'glCompressedMultiTexImage1DEXT'
/*      */     //   3365: invokestatic getFunctionAddress : (Ljava/lang/String;)J
/*      */     //   3368: dup2_x1
/*      */     //   3369: putfield EXT_direct_state_access_glCompressedMultiTexImage1DEXT_pointer : J
/*      */     //   3372: lconst_0
/*      */     //   3373: lcmp
/*      */     //   3374: ifeq -> 3381
/*      */     //   3377: iconst_1
/*      */     //   3378: goto -> 3382
/*      */     //   3381: iconst_0
/*      */     //   3382: iand
/*      */     //   3383: aload_2
/*      */     //   3384: ldc_w 'OpenGL13'
/*      */     //   3387: invokeinterface contains : (Ljava/lang/Object;)Z
/*      */     //   3392: ifeq -> 3411
/*      */     //   3395: aload_0
/*      */     //   3396: ldc_w 'glCompressedMultiTexSubImage3DEXT'
/*      */     //   3399: invokestatic getFunctionAddress : (Ljava/lang/String;)J
/*      */     //   3402: dup2_x1
/*      */     //   3403: putfield EXT_direct_state_access_glCompressedMultiTexSubImage3DEXT_pointer : J
/*      */     //   3406: lconst_0
/*      */     //   3407: lcmp
/*      */     //   3408: ifeq -> 3415
/*      */     //   3411: iconst_1
/*      */     //   3412: goto -> 3416
/*      */     //   3415: iconst_0
/*      */     //   3416: iand
/*      */     //   3417: aload_2
/*      */     //   3418: ldc_w 'OpenGL13'
/*      */     //   3421: invokeinterface contains : (Ljava/lang/Object;)Z
/*      */     //   3426: ifeq -> 3445
/*      */     //   3429: aload_0
/*      */     //   3430: ldc_w 'glCompressedMultiTexSubImage2DEXT'
/*      */     //   3433: invokestatic getFunctionAddress : (Ljava/lang/String;)J
/*      */     //   3436: dup2_x1
/*      */     //   3437: putfield EXT_direct_state_access_glCompressedMultiTexSubImage2DEXT_pointer : J
/*      */     //   3440: lconst_0
/*      */     //   3441: lcmp
/*      */     //   3442: ifeq -> 3449
/*      */     //   3445: iconst_1
/*      */     //   3446: goto -> 3450
/*      */     //   3449: iconst_0
/*      */     //   3450: iand
/*      */     //   3451: aload_2
/*      */     //   3452: ldc_w 'OpenGL13'
/*      */     //   3455: invokeinterface contains : (Ljava/lang/Object;)Z
/*      */     //   3460: ifeq -> 3479
/*      */     //   3463: aload_0
/*      */     //   3464: ldc_w 'glCompressedMultiTexSubImage1DEXT'
/*      */     //   3467: invokestatic getFunctionAddress : (Ljava/lang/String;)J
/*      */     //   3470: dup2_x1
/*      */     //   3471: putfield EXT_direct_state_access_glCompressedMultiTexSubImage1DEXT_pointer : J
/*      */     //   3474: lconst_0
/*      */     //   3475: lcmp
/*      */     //   3476: ifeq -> 3483
/*      */     //   3479: iconst_1
/*      */     //   3480: goto -> 3484
/*      */     //   3483: iconst_0
/*      */     //   3484: iand
/*      */     //   3485: aload_2
/*      */     //   3486: ldc_w 'OpenGL13'
/*      */     //   3489: invokeinterface contains : (Ljava/lang/Object;)Z
/*      */     //   3494: ifeq -> 3513
/*      */     //   3497: aload_0
/*      */     //   3498: ldc_w 'glGetCompressedMultiTexImageEXT'
/*      */     //   3501: invokestatic getFunctionAddress : (Ljava/lang/String;)J
/*      */     //   3504: dup2_x1
/*      */     //   3505: putfield EXT_direct_state_access_glGetCompressedMultiTexImageEXT_pointer : J
/*      */     //   3508: lconst_0
/*      */     //   3509: lcmp
/*      */     //   3510: ifeq -> 3517
/*      */     //   3513: iconst_1
/*      */     //   3514: goto -> 3518
/*      */     //   3517: iconst_0
/*      */     //   3518: iand
/*      */     //   3519: aload_2
/*      */     //   3520: ldc_w 'OpenGL13'
/*      */     //   3523: invokeinterface contains : (Ljava/lang/Object;)Z
/*      */     //   3528: ifeq -> 3547
/*      */     //   3531: aload_0
/*      */     //   3532: ldc_w 'glGetCompressedTexImage'
/*      */     //   3535: invokestatic getFunctionAddress : (Ljava/lang/String;)J
/*      */     //   3538: dup2_x1
/*      */     //   3539: putfield EXT_direct_state_access_glGetCompressedTexImage_pointer : J
/*      */     //   3542: lconst_0
/*      */     //   3543: lcmp
/*      */     //   3544: ifeq -> 3551
/*      */     //   3547: iconst_1
/*      */     //   3548: goto -> 3552
/*      */     //   3551: iconst_0
/*      */     //   3552: iand
/*      */     //   3553: iload_1
/*      */     //   3554: ifne -> 3585
/*      */     //   3557: aload_2
/*      */     //   3558: ldc_w 'OpenGL13'
/*      */     //   3561: invokeinterface contains : (Ljava/lang/Object;)Z
/*      */     //   3566: ifeq -> 3585
/*      */     //   3569: aload_0
/*      */     //   3570: ldc_w 'glMatrixLoadTransposefEXT'
/*      */     //   3573: invokestatic getFunctionAddress : (Ljava/lang/String;)J
/*      */     //   3576: dup2_x1
/*      */     //   3577: putfield EXT_direct_state_access_glMatrixLoadTransposefEXT_pointer : J
/*      */     //   3580: lconst_0
/*      */     //   3581: lcmp
/*      */     //   3582: ifeq -> 3589
/*      */     //   3585: iconst_1
/*      */     //   3586: goto -> 3590
/*      */     //   3589: iconst_0
/*      */     //   3590: iand
/*      */     //   3591: iload_1
/*      */     //   3592: ifne -> 3623
/*      */     //   3595: aload_2
/*      */     //   3596: ldc_w 'OpenGL13'
/*      */     //   3599: invokeinterface contains : (Ljava/lang/Object;)Z
/*      */     //   3604: ifeq -> 3623
/*      */     //   3607: aload_0
/*      */     //   3608: ldc_w 'glMatrixLoadTransposedEXT'
/*      */     //   3611: invokestatic getFunctionAddress : (Ljava/lang/String;)J
/*      */     //   3614: dup2_x1
/*      */     //   3615: putfield EXT_direct_state_access_glMatrixLoadTransposedEXT_pointer : J
/*      */     //   3618: lconst_0
/*      */     //   3619: lcmp
/*      */     //   3620: ifeq -> 3627
/*      */     //   3623: iconst_1
/*      */     //   3624: goto -> 3628
/*      */     //   3627: iconst_0
/*      */     //   3628: iand
/*      */     //   3629: iload_1
/*      */     //   3630: ifne -> 3661
/*      */     //   3633: aload_2
/*      */     //   3634: ldc_w 'OpenGL13'
/*      */     //   3637: invokeinterface contains : (Ljava/lang/Object;)Z
/*      */     //   3642: ifeq -> 3661
/*      */     //   3645: aload_0
/*      */     //   3646: ldc_w 'glMatrixMultTransposefEXT'
/*      */     //   3649: invokestatic getFunctionAddress : (Ljava/lang/String;)J
/*      */     //   3652: dup2_x1
/*      */     //   3653: putfield EXT_direct_state_access_glMatrixMultTransposefEXT_pointer : J
/*      */     //   3656: lconst_0
/*      */     //   3657: lcmp
/*      */     //   3658: ifeq -> 3665
/*      */     //   3661: iconst_1
/*      */     //   3662: goto -> 3666
/*      */     //   3665: iconst_0
/*      */     //   3666: iand
/*      */     //   3667: iload_1
/*      */     //   3668: ifne -> 3699
/*      */     //   3671: aload_2
/*      */     //   3672: ldc_w 'OpenGL13'
/*      */     //   3675: invokeinterface contains : (Ljava/lang/Object;)Z
/*      */     //   3680: ifeq -> 3699
/*      */     //   3683: aload_0
/*      */     //   3684: ldc_w 'glMatrixMultTransposedEXT'
/*      */     //   3687: invokestatic getFunctionAddress : (Ljava/lang/String;)J
/*      */     //   3690: dup2_x1
/*      */     //   3691: putfield EXT_direct_state_access_glMatrixMultTransposedEXT_pointer : J
/*      */     //   3694: lconst_0
/*      */     //   3695: lcmp
/*      */     //   3696: ifeq -> 3703
/*      */     //   3699: iconst_1
/*      */     //   3700: goto -> 3704
/*      */     //   3703: iconst_0
/*      */     //   3704: iand
/*      */     //   3705: aload_2
/*      */     //   3706: ldc_w 'OpenGL15'
/*      */     //   3709: invokeinterface contains : (Ljava/lang/Object;)Z
/*      */     //   3714: ifeq -> 3733
/*      */     //   3717: aload_0
/*      */     //   3718: ldc_w 'glNamedBufferDataEXT'
/*      */     //   3721: invokestatic getFunctionAddress : (Ljava/lang/String;)J
/*      */     //   3724: dup2_x1
/*      */     //   3725: putfield EXT_direct_state_access_glNamedBufferDataEXT_pointer : J
/*      */     //   3728: lconst_0
/*      */     //   3729: lcmp
/*      */     //   3730: ifeq -> 3737
/*      */     //   3733: iconst_1
/*      */     //   3734: goto -> 3738
/*      */     //   3737: iconst_0
/*      */     //   3738: iand
/*      */     //   3739: aload_2
/*      */     //   3740: ldc_w 'OpenGL15'
/*      */     //   3743: invokeinterface contains : (Ljava/lang/Object;)Z
/*      */     //   3748: ifeq -> 3767
/*      */     //   3751: aload_0
/*      */     //   3752: ldc_w 'glNamedBufferSubDataEXT'
/*      */     //   3755: invokestatic getFunctionAddress : (Ljava/lang/String;)J
/*      */     //   3758: dup2_x1
/*      */     //   3759: putfield EXT_direct_state_access_glNamedBufferSubDataEXT_pointer : J
/*      */     //   3762: lconst_0
/*      */     //   3763: lcmp
/*      */     //   3764: ifeq -> 3771
/*      */     //   3767: iconst_1
/*      */     //   3768: goto -> 3772
/*      */     //   3771: iconst_0
/*      */     //   3772: iand
/*      */     //   3773: aload_2
/*      */     //   3774: ldc_w 'OpenGL15'
/*      */     //   3777: invokeinterface contains : (Ljava/lang/Object;)Z
/*      */     //   3782: ifeq -> 3801
/*      */     //   3785: aload_0
/*      */     //   3786: ldc_w 'glMapNamedBufferEXT'
/*      */     //   3789: invokestatic getFunctionAddress : (Ljava/lang/String;)J
/*      */     //   3792: dup2_x1
/*      */     //   3793: putfield EXT_direct_state_access_glMapNamedBufferEXT_pointer : J
/*      */     //   3796: lconst_0
/*      */     //   3797: lcmp
/*      */     //   3798: ifeq -> 3805
/*      */     //   3801: iconst_1
/*      */     //   3802: goto -> 3806
/*      */     //   3805: iconst_0
/*      */     //   3806: iand
/*      */     //   3807: aload_2
/*      */     //   3808: ldc_w 'OpenGL15'
/*      */     //   3811: invokeinterface contains : (Ljava/lang/Object;)Z
/*      */     //   3816: ifeq -> 3835
/*      */     //   3819: aload_0
/*      */     //   3820: ldc_w 'glUnmapNamedBufferEXT'
/*      */     //   3823: invokestatic getFunctionAddress : (Ljava/lang/String;)J
/*      */     //   3826: dup2_x1
/*      */     //   3827: putfield EXT_direct_state_access_glUnmapNamedBufferEXT_pointer : J
/*      */     //   3830: lconst_0
/*      */     //   3831: lcmp
/*      */     //   3832: ifeq -> 3839
/*      */     //   3835: iconst_1
/*      */     //   3836: goto -> 3840
/*      */     //   3839: iconst_0
/*      */     //   3840: iand
/*      */     //   3841: aload_2
/*      */     //   3842: ldc_w 'OpenGL15'
/*      */     //   3845: invokeinterface contains : (Ljava/lang/Object;)Z
/*      */     //   3850: ifeq -> 3869
/*      */     //   3853: aload_0
/*      */     //   3854: ldc_w 'glGetNamedBufferParameterivEXT'
/*      */     //   3857: invokestatic getFunctionAddress : (Ljava/lang/String;)J
/*      */     //   3860: dup2_x1
/*      */     //   3861: putfield EXT_direct_state_access_glGetNamedBufferParameterivEXT_pointer : J
/*      */     //   3864: lconst_0
/*      */     //   3865: lcmp
/*      */     //   3866: ifeq -> 3873
/*      */     //   3869: iconst_1
/*      */     //   3870: goto -> 3874
/*      */     //   3873: iconst_0
/*      */     //   3874: iand
/*      */     //   3875: aload_2
/*      */     //   3876: ldc_w 'OpenGL15'
/*      */     //   3879: invokeinterface contains : (Ljava/lang/Object;)Z
/*      */     //   3884: ifeq -> 3903
/*      */     //   3887: aload_0
/*      */     //   3888: ldc_w 'glGetNamedBufferPointervEXT'
/*      */     //   3891: invokestatic getFunctionAddress : (Ljava/lang/String;)J
/*      */     //   3894: dup2_x1
/*      */     //   3895: putfield EXT_direct_state_access_glGetNamedBufferPointervEXT_pointer : J
/*      */     //   3898: lconst_0
/*      */     //   3899: lcmp
/*      */     //   3900: ifeq -> 3907
/*      */     //   3903: iconst_1
/*      */     //   3904: goto -> 3908
/*      */     //   3907: iconst_0
/*      */     //   3908: iand
/*      */     //   3909: aload_2
/*      */     //   3910: ldc_w 'OpenGL15'
/*      */     //   3913: invokeinterface contains : (Ljava/lang/Object;)Z
/*      */     //   3918: ifeq -> 3937
/*      */     //   3921: aload_0
/*      */     //   3922: ldc_w 'glGetNamedBufferSubDataEXT'
/*      */     //   3925: invokestatic getFunctionAddress : (Ljava/lang/String;)J
/*      */     //   3928: dup2_x1
/*      */     //   3929: putfield EXT_direct_state_access_glGetNamedBufferSubDataEXT_pointer : J
/*      */     //   3932: lconst_0
/*      */     //   3933: lcmp
/*      */     //   3934: ifeq -> 3941
/*      */     //   3937: iconst_1
/*      */     //   3938: goto -> 3942
/*      */     //   3941: iconst_0
/*      */     //   3942: iand
/*      */     //   3943: aload_2
/*      */     //   3944: ldc_w 'OpenGL20'
/*      */     //   3947: invokeinterface contains : (Ljava/lang/Object;)Z
/*      */     //   3952: ifeq -> 3971
/*      */     //   3955: aload_0
/*      */     //   3956: ldc_w 'glProgramUniform1fEXT'
/*      */     //   3959: invokestatic getFunctionAddress : (Ljava/lang/String;)J
/*      */     //   3962: dup2_x1
/*      */     //   3963: putfield EXT_direct_state_access_glProgramUniform1fEXT_pointer : J
/*      */     //   3966: lconst_0
/*      */     //   3967: lcmp
/*      */     //   3968: ifeq -> 3975
/*      */     //   3971: iconst_1
/*      */     //   3972: goto -> 3976
/*      */     //   3975: iconst_0
/*      */     //   3976: iand
/*      */     //   3977: aload_2
/*      */     //   3978: ldc_w 'OpenGL20'
/*      */     //   3981: invokeinterface contains : (Ljava/lang/Object;)Z
/*      */     //   3986: ifeq -> 4005
/*      */     //   3989: aload_0
/*      */     //   3990: ldc_w 'glProgramUniform2fEXT'
/*      */     //   3993: invokestatic getFunctionAddress : (Ljava/lang/String;)J
/*      */     //   3996: dup2_x1
/*      */     //   3997: putfield EXT_direct_state_access_glProgramUniform2fEXT_pointer : J
/*      */     //   4000: lconst_0
/*      */     //   4001: lcmp
/*      */     //   4002: ifeq -> 4009
/*      */     //   4005: iconst_1
/*      */     //   4006: goto -> 4010
/*      */     //   4009: iconst_0
/*      */     //   4010: iand
/*      */     //   4011: aload_2
/*      */     //   4012: ldc_w 'OpenGL20'
/*      */     //   4015: invokeinterface contains : (Ljava/lang/Object;)Z
/*      */     //   4020: ifeq -> 4039
/*      */     //   4023: aload_0
/*      */     //   4024: ldc_w 'glProgramUniform3fEXT'
/*      */     //   4027: invokestatic getFunctionAddress : (Ljava/lang/String;)J
/*      */     //   4030: dup2_x1
/*      */     //   4031: putfield EXT_direct_state_access_glProgramUniform3fEXT_pointer : J
/*      */     //   4034: lconst_0
/*      */     //   4035: lcmp
/*      */     //   4036: ifeq -> 4043
/*      */     //   4039: iconst_1
/*      */     //   4040: goto -> 4044
/*      */     //   4043: iconst_0
/*      */     //   4044: iand
/*      */     //   4045: aload_2
/*      */     //   4046: ldc_w 'OpenGL20'
/*      */     //   4049: invokeinterface contains : (Ljava/lang/Object;)Z
/*      */     //   4054: ifeq -> 4073
/*      */     //   4057: aload_0
/*      */     //   4058: ldc_w 'glProgramUniform4fEXT'
/*      */     //   4061: invokestatic getFunctionAddress : (Ljava/lang/String;)J
/*      */     //   4064: dup2_x1
/*      */     //   4065: putfield EXT_direct_state_access_glProgramUniform4fEXT_pointer : J
/*      */     //   4068: lconst_0
/*      */     //   4069: lcmp
/*      */     //   4070: ifeq -> 4077
/*      */     //   4073: iconst_1
/*      */     //   4074: goto -> 4078
/*      */     //   4077: iconst_0
/*      */     //   4078: iand
/*      */     //   4079: aload_2
/*      */     //   4080: ldc_w 'OpenGL20'
/*      */     //   4083: invokeinterface contains : (Ljava/lang/Object;)Z
/*      */     //   4088: ifeq -> 4107
/*      */     //   4091: aload_0
/*      */     //   4092: ldc_w 'glProgramUniform1iEXT'
/*      */     //   4095: invokestatic getFunctionAddress : (Ljava/lang/String;)J
/*      */     //   4098: dup2_x1
/*      */     //   4099: putfield EXT_direct_state_access_glProgramUniform1iEXT_pointer : J
/*      */     //   4102: lconst_0
/*      */     //   4103: lcmp
/*      */     //   4104: ifeq -> 4111
/*      */     //   4107: iconst_1
/*      */     //   4108: goto -> 4112
/*      */     //   4111: iconst_0
/*      */     //   4112: iand
/*      */     //   4113: aload_2
/*      */     //   4114: ldc_w 'OpenGL20'
/*      */     //   4117: invokeinterface contains : (Ljava/lang/Object;)Z
/*      */     //   4122: ifeq -> 4141
/*      */     //   4125: aload_0
/*      */     //   4126: ldc_w 'glProgramUniform2iEXT'
/*      */     //   4129: invokestatic getFunctionAddress : (Ljava/lang/String;)J
/*      */     //   4132: dup2_x1
/*      */     //   4133: putfield EXT_direct_state_access_glProgramUniform2iEXT_pointer : J
/*      */     //   4136: lconst_0
/*      */     //   4137: lcmp
/*      */     //   4138: ifeq -> 4145
/*      */     //   4141: iconst_1
/*      */     //   4142: goto -> 4146
/*      */     //   4145: iconst_0
/*      */     //   4146: iand
/*      */     //   4147: aload_2
/*      */     //   4148: ldc_w 'OpenGL20'
/*      */     //   4151: invokeinterface contains : (Ljava/lang/Object;)Z
/*      */     //   4156: ifeq -> 4175
/*      */     //   4159: aload_0
/*      */     //   4160: ldc_w 'glProgramUniform3iEXT'
/*      */     //   4163: invokestatic getFunctionAddress : (Ljava/lang/String;)J
/*      */     //   4166: dup2_x1
/*      */     //   4167: putfield EXT_direct_state_access_glProgramUniform3iEXT_pointer : J
/*      */     //   4170: lconst_0
/*      */     //   4171: lcmp
/*      */     //   4172: ifeq -> 4179
/*      */     //   4175: iconst_1
/*      */     //   4176: goto -> 4180
/*      */     //   4179: iconst_0
/*      */     //   4180: iand
/*      */     //   4181: aload_2
/*      */     //   4182: ldc_w 'OpenGL20'
/*      */     //   4185: invokeinterface contains : (Ljava/lang/Object;)Z
/*      */     //   4190: ifeq -> 4209
/*      */     //   4193: aload_0
/*      */     //   4194: ldc_w 'glProgramUniform4iEXT'
/*      */     //   4197: invokestatic getFunctionAddress : (Ljava/lang/String;)J
/*      */     //   4200: dup2_x1
/*      */     //   4201: putfield EXT_direct_state_access_glProgramUniform4iEXT_pointer : J
/*      */     //   4204: lconst_0
/*      */     //   4205: lcmp
/*      */     //   4206: ifeq -> 4213
/*      */     //   4209: iconst_1
/*      */     //   4210: goto -> 4214
/*      */     //   4213: iconst_0
/*      */     //   4214: iand
/*      */     //   4215: aload_2
/*      */     //   4216: ldc_w 'OpenGL20'
/*      */     //   4219: invokeinterface contains : (Ljava/lang/Object;)Z
/*      */     //   4224: ifeq -> 4243
/*      */     //   4227: aload_0
/*      */     //   4228: ldc_w 'glProgramUniform1fvEXT'
/*      */     //   4231: invokestatic getFunctionAddress : (Ljava/lang/String;)J
/*      */     //   4234: dup2_x1
/*      */     //   4235: putfield EXT_direct_state_access_glProgramUniform1fvEXT_pointer : J
/*      */     //   4238: lconst_0
/*      */     //   4239: lcmp
/*      */     //   4240: ifeq -> 4247
/*      */     //   4243: iconst_1
/*      */     //   4244: goto -> 4248
/*      */     //   4247: iconst_0
/*      */     //   4248: iand
/*      */     //   4249: aload_2
/*      */     //   4250: ldc_w 'OpenGL20'
/*      */     //   4253: invokeinterface contains : (Ljava/lang/Object;)Z
/*      */     //   4258: ifeq -> 4277
/*      */     //   4261: aload_0
/*      */     //   4262: ldc_w 'glProgramUniform2fvEXT'
/*      */     //   4265: invokestatic getFunctionAddress : (Ljava/lang/String;)J
/*      */     //   4268: dup2_x1
/*      */     //   4269: putfield EXT_direct_state_access_glProgramUniform2fvEXT_pointer : J
/*      */     //   4272: lconst_0
/*      */     //   4273: lcmp
/*      */     //   4274: ifeq -> 4281
/*      */     //   4277: iconst_1
/*      */     //   4278: goto -> 4282
/*      */     //   4281: iconst_0
/*      */     //   4282: iand
/*      */     //   4283: aload_2
/*      */     //   4284: ldc_w 'OpenGL20'
/*      */     //   4287: invokeinterface contains : (Ljava/lang/Object;)Z
/*      */     //   4292: ifeq -> 4311
/*      */     //   4295: aload_0
/*      */     //   4296: ldc_w 'glProgramUniform3fvEXT'
/*      */     //   4299: invokestatic getFunctionAddress : (Ljava/lang/String;)J
/*      */     //   4302: dup2_x1
/*      */     //   4303: putfield EXT_direct_state_access_glProgramUniform3fvEXT_pointer : J
/*      */     //   4306: lconst_0
/*      */     //   4307: lcmp
/*      */     //   4308: ifeq -> 4315
/*      */     //   4311: iconst_1
/*      */     //   4312: goto -> 4316
/*      */     //   4315: iconst_0
/*      */     //   4316: iand
/*      */     //   4317: aload_2
/*      */     //   4318: ldc_w 'OpenGL20'
/*      */     //   4321: invokeinterface contains : (Ljava/lang/Object;)Z
/*      */     //   4326: ifeq -> 4345
/*      */     //   4329: aload_0
/*      */     //   4330: ldc_w 'glProgramUniform4fvEXT'
/*      */     //   4333: invokestatic getFunctionAddress : (Ljava/lang/String;)J
/*      */     //   4336: dup2_x1
/*      */     //   4337: putfield EXT_direct_state_access_glProgramUniform4fvEXT_pointer : J
/*      */     //   4340: lconst_0
/*      */     //   4341: lcmp
/*      */     //   4342: ifeq -> 4349
/*      */     //   4345: iconst_1
/*      */     //   4346: goto -> 4350
/*      */     //   4349: iconst_0
/*      */     //   4350: iand
/*      */     //   4351: aload_2
/*      */     //   4352: ldc_w 'OpenGL20'
/*      */     //   4355: invokeinterface contains : (Ljava/lang/Object;)Z
/*      */     //   4360: ifeq -> 4379
/*      */     //   4363: aload_0
/*      */     //   4364: ldc_w 'glProgramUniform1ivEXT'
/*      */     //   4367: invokestatic getFunctionAddress : (Ljava/lang/String;)J
/*      */     //   4370: dup2_x1
/*      */     //   4371: putfield EXT_direct_state_access_glProgramUniform1ivEXT_pointer : J
/*      */     //   4374: lconst_0
/*      */     //   4375: lcmp
/*      */     //   4376: ifeq -> 4383
/*      */     //   4379: iconst_1
/*      */     //   4380: goto -> 4384
/*      */     //   4383: iconst_0
/*      */     //   4384: iand
/*      */     //   4385: aload_2
/*      */     //   4386: ldc_w 'OpenGL20'
/*      */     //   4389: invokeinterface contains : (Ljava/lang/Object;)Z
/*      */     //   4394: ifeq -> 4413
/*      */     //   4397: aload_0
/*      */     //   4398: ldc_w 'glProgramUniform2ivEXT'
/*      */     //   4401: invokestatic getFunctionAddress : (Ljava/lang/String;)J
/*      */     //   4404: dup2_x1
/*      */     //   4405: putfield EXT_direct_state_access_glProgramUniform2ivEXT_pointer : J
/*      */     //   4408: lconst_0
/*      */     //   4409: lcmp
/*      */     //   4410: ifeq -> 4417
/*      */     //   4413: iconst_1
/*      */     //   4414: goto -> 4418
/*      */     //   4417: iconst_0
/*      */     //   4418: iand
/*      */     //   4419: aload_2
/*      */     //   4420: ldc_w 'OpenGL20'
/*      */     //   4423: invokeinterface contains : (Ljava/lang/Object;)Z
/*      */     //   4428: ifeq -> 4447
/*      */     //   4431: aload_0
/*      */     //   4432: ldc_w 'glProgramUniform3ivEXT'
/*      */     //   4435: invokestatic getFunctionAddress : (Ljava/lang/String;)J
/*      */     //   4438: dup2_x1
/*      */     //   4439: putfield EXT_direct_state_access_glProgramUniform3ivEXT_pointer : J
/*      */     //   4442: lconst_0
/*      */     //   4443: lcmp
/*      */     //   4444: ifeq -> 4451
/*      */     //   4447: iconst_1
/*      */     //   4448: goto -> 4452
/*      */     //   4451: iconst_0
/*      */     //   4452: iand
/*      */     //   4453: aload_2
/*      */     //   4454: ldc_w 'OpenGL20'
/*      */     //   4457: invokeinterface contains : (Ljava/lang/Object;)Z
/*      */     //   4462: ifeq -> 4481
/*      */     //   4465: aload_0
/*      */     //   4466: ldc_w 'glProgramUniform4ivEXT'
/*      */     //   4469: invokestatic getFunctionAddress : (Ljava/lang/String;)J
/*      */     //   4472: dup2_x1
/*      */     //   4473: putfield EXT_direct_state_access_glProgramUniform4ivEXT_pointer : J
/*      */     //   4476: lconst_0
/*      */     //   4477: lcmp
/*      */     //   4478: ifeq -> 4485
/*      */     //   4481: iconst_1
/*      */     //   4482: goto -> 4486
/*      */     //   4485: iconst_0
/*      */     //   4486: iand
/*      */     //   4487: aload_2
/*      */     //   4488: ldc_w 'OpenGL20'
/*      */     //   4491: invokeinterface contains : (Ljava/lang/Object;)Z
/*      */     //   4496: ifeq -> 4515
/*      */     //   4499: aload_0
/*      */     //   4500: ldc_w 'glProgramUniformMatrix2fvEXT'
/*      */     //   4503: invokestatic getFunctionAddress : (Ljava/lang/String;)J
/*      */     //   4506: dup2_x1
/*      */     //   4507: putfield EXT_direct_state_access_glProgramUniformMatrix2fvEXT_pointer : J
/*      */     //   4510: lconst_0
/*      */     //   4511: lcmp
/*      */     //   4512: ifeq -> 4519
/*      */     //   4515: iconst_1
/*      */     //   4516: goto -> 4520
/*      */     //   4519: iconst_0
/*      */     //   4520: iand
/*      */     //   4521: aload_2
/*      */     //   4522: ldc_w 'OpenGL20'
/*      */     //   4525: invokeinterface contains : (Ljava/lang/Object;)Z
/*      */     //   4530: ifeq -> 4549
/*      */     //   4533: aload_0
/*      */     //   4534: ldc_w 'glProgramUniformMatrix3fvEXT'
/*      */     //   4537: invokestatic getFunctionAddress : (Ljava/lang/String;)J
/*      */     //   4540: dup2_x1
/*      */     //   4541: putfield EXT_direct_state_access_glProgramUniformMatrix3fvEXT_pointer : J
/*      */     //   4544: lconst_0
/*      */     //   4545: lcmp
/*      */     //   4546: ifeq -> 4553
/*      */     //   4549: iconst_1
/*      */     //   4550: goto -> 4554
/*      */     //   4553: iconst_0
/*      */     //   4554: iand
/*      */     //   4555: aload_2
/*      */     //   4556: ldc_w 'OpenGL20'
/*      */     //   4559: invokeinterface contains : (Ljava/lang/Object;)Z
/*      */     //   4564: ifeq -> 4583
/*      */     //   4567: aload_0
/*      */     //   4568: ldc_w 'glProgramUniformMatrix4fvEXT'
/*      */     //   4571: invokestatic getFunctionAddress : (Ljava/lang/String;)J
/*      */     //   4574: dup2_x1
/*      */     //   4575: putfield EXT_direct_state_access_glProgramUniformMatrix4fvEXT_pointer : J
/*      */     //   4578: lconst_0
/*      */     //   4579: lcmp
/*      */     //   4580: ifeq -> 4587
/*      */     //   4583: iconst_1
/*      */     //   4584: goto -> 4588
/*      */     //   4587: iconst_0
/*      */     //   4588: iand
/*      */     //   4589: aload_2
/*      */     //   4590: ldc_w 'OpenGL21'
/*      */     //   4593: invokeinterface contains : (Ljava/lang/Object;)Z
/*      */     //   4598: ifeq -> 4617
/*      */     //   4601: aload_0
/*      */     //   4602: ldc_w 'glProgramUniformMatrix2x3fvEXT'
/*      */     //   4605: invokestatic getFunctionAddress : (Ljava/lang/String;)J
/*      */     //   4608: dup2_x1
/*      */     //   4609: putfield EXT_direct_state_access_glProgramUniformMatrix2x3fvEXT_pointer : J
/*      */     //   4612: lconst_0
/*      */     //   4613: lcmp
/*      */     //   4614: ifeq -> 4621
/*      */     //   4617: iconst_1
/*      */     //   4618: goto -> 4622
/*      */     //   4621: iconst_0
/*      */     //   4622: iand
/*      */     //   4623: aload_2
/*      */     //   4624: ldc_w 'OpenGL21'
/*      */     //   4627: invokeinterface contains : (Ljava/lang/Object;)Z
/*      */     //   4632: ifeq -> 4651
/*      */     //   4635: aload_0
/*      */     //   4636: ldc_w 'glProgramUniformMatrix3x2fvEXT'
/*      */     //   4639: invokestatic getFunctionAddress : (Ljava/lang/String;)J
/*      */     //   4642: dup2_x1
/*      */     //   4643: putfield EXT_direct_state_access_glProgramUniformMatrix3x2fvEXT_pointer : J
/*      */     //   4646: lconst_0
/*      */     //   4647: lcmp
/*      */     //   4648: ifeq -> 4655
/*      */     //   4651: iconst_1
/*      */     //   4652: goto -> 4656
/*      */     //   4655: iconst_0
/*      */     //   4656: iand
/*      */     //   4657: aload_2
/*      */     //   4658: ldc_w 'OpenGL21'
/*      */     //   4661: invokeinterface contains : (Ljava/lang/Object;)Z
/*      */     //   4666: ifeq -> 4685
/*      */     //   4669: aload_0
/*      */     //   4670: ldc_w 'glProgramUniformMatrix2x4fvEXT'
/*      */     //   4673: invokestatic getFunctionAddress : (Ljava/lang/String;)J
/*      */     //   4676: dup2_x1
/*      */     //   4677: putfield EXT_direct_state_access_glProgramUniformMatrix2x4fvEXT_pointer : J
/*      */     //   4680: lconst_0
/*      */     //   4681: lcmp
/*      */     //   4682: ifeq -> 4689
/*      */     //   4685: iconst_1
/*      */     //   4686: goto -> 4690
/*      */     //   4689: iconst_0
/*      */     //   4690: iand
/*      */     //   4691: aload_2
/*      */     //   4692: ldc_w 'OpenGL21'
/*      */     //   4695: invokeinterface contains : (Ljava/lang/Object;)Z
/*      */     //   4700: ifeq -> 4719
/*      */     //   4703: aload_0
/*      */     //   4704: ldc_w 'glProgramUniformMatrix4x2fvEXT'
/*      */     //   4707: invokestatic getFunctionAddress : (Ljava/lang/String;)J
/*      */     //   4710: dup2_x1
/*      */     //   4711: putfield EXT_direct_state_access_glProgramUniformMatrix4x2fvEXT_pointer : J
/*      */     //   4714: lconst_0
/*      */     //   4715: lcmp
/*      */     //   4716: ifeq -> 4723
/*      */     //   4719: iconst_1
/*      */     //   4720: goto -> 4724
/*      */     //   4723: iconst_0
/*      */     //   4724: iand
/*      */     //   4725: aload_2
/*      */     //   4726: ldc_w 'OpenGL21'
/*      */     //   4729: invokeinterface contains : (Ljava/lang/Object;)Z
/*      */     //   4734: ifeq -> 4753
/*      */     //   4737: aload_0
/*      */     //   4738: ldc_w 'glProgramUniformMatrix3x4fvEXT'
/*      */     //   4741: invokestatic getFunctionAddress : (Ljava/lang/String;)J
/*      */     //   4744: dup2_x1
/*      */     //   4745: putfield EXT_direct_state_access_glProgramUniformMatrix3x4fvEXT_pointer : J
/*      */     //   4748: lconst_0
/*      */     //   4749: lcmp
/*      */     //   4750: ifeq -> 4757
/*      */     //   4753: iconst_1
/*      */     //   4754: goto -> 4758
/*      */     //   4757: iconst_0
/*      */     //   4758: iand
/*      */     //   4759: aload_2
/*      */     //   4760: ldc_w 'OpenGL21'
/*      */     //   4763: invokeinterface contains : (Ljava/lang/Object;)Z
/*      */     //   4768: ifeq -> 4787
/*      */     //   4771: aload_0
/*      */     //   4772: ldc_w 'glProgramUniformMatrix4x3fvEXT'
/*      */     //   4775: invokestatic getFunctionAddress : (Ljava/lang/String;)J
/*      */     //   4778: dup2_x1
/*      */     //   4779: putfield EXT_direct_state_access_glProgramUniformMatrix4x3fvEXT_pointer : J
/*      */     //   4782: lconst_0
/*      */     //   4783: lcmp
/*      */     //   4784: ifeq -> 4791
/*      */     //   4787: iconst_1
/*      */     //   4788: goto -> 4792
/*      */     //   4791: iconst_0
/*      */     //   4792: iand
/*      */     //   4793: aload_2
/*      */     //   4794: ldc_w 'GL_EXT_texture_buffer_object'
/*      */     //   4797: invokeinterface contains : (Ljava/lang/Object;)Z
/*      */     //   4802: ifeq -> 4821
/*      */     //   4805: aload_0
/*      */     //   4806: ldc_w 'glTextureBufferEXT'
/*      */     //   4809: invokestatic getFunctionAddress : (Ljava/lang/String;)J
/*      */     //   4812: dup2_x1
/*      */     //   4813: putfield EXT_direct_state_access_glTextureBufferEXT_pointer : J
/*      */     //   4816: lconst_0
/*      */     //   4817: lcmp
/*      */     //   4818: ifeq -> 4825
/*      */     //   4821: iconst_1
/*      */     //   4822: goto -> 4826
/*      */     //   4825: iconst_0
/*      */     //   4826: iand
/*      */     //   4827: aload_2
/*      */     //   4828: ldc_w 'GL_EXT_texture_buffer_object'
/*      */     //   4831: invokeinterface contains : (Ljava/lang/Object;)Z
/*      */     //   4836: ifeq -> 4855
/*      */     //   4839: aload_0
/*      */     //   4840: ldc_w 'glMultiTexBufferEXT'
/*      */     //   4843: invokestatic getFunctionAddress : (Ljava/lang/String;)J
/*      */     //   4846: dup2_x1
/*      */     //   4847: putfield EXT_direct_state_access_glMultiTexBufferEXT_pointer : J
/*      */     //   4850: lconst_0
/*      */     //   4851: lcmp
/*      */     //   4852: ifeq -> 4859
/*      */     //   4855: iconst_1
/*      */     //   4856: goto -> 4860
/*      */     //   4859: iconst_0
/*      */     //   4860: iand
/*      */     //   4861: aload_2
/*      */     //   4862: ldc_w 'GL_EXT_texture_integer'
/*      */     //   4865: invokeinterface contains : (Ljava/lang/Object;)Z
/*      */     //   4870: ifeq -> 4889
/*      */     //   4873: aload_0
/*      */     //   4874: ldc_w 'glTextureParameterIivEXT'
/*      */     //   4877: invokestatic getFunctionAddress : (Ljava/lang/String;)J
/*      */     //   4880: dup2_x1
/*      */     //   4881: putfield EXT_direct_state_access_glTextureParameterIivEXT_pointer : J
/*      */     //   4884: lconst_0
/*      */     //   4885: lcmp
/*      */     //   4886: ifeq -> 4893
/*      */     //   4889: iconst_1
/*      */     //   4890: goto -> 4894
/*      */     //   4893: iconst_0
/*      */     //   4894: iand
/*      */     //   4895: aload_2
/*      */     //   4896: ldc_w 'GL_EXT_texture_integer'
/*      */     //   4899: invokeinterface contains : (Ljava/lang/Object;)Z
/*      */     //   4904: ifeq -> 4923
/*      */     //   4907: aload_0
/*      */     //   4908: ldc_w 'glTextureParameterIuivEXT'
/*      */     //   4911: invokestatic getFunctionAddress : (Ljava/lang/String;)J
/*      */     //   4914: dup2_x1
/*      */     //   4915: putfield EXT_direct_state_access_glTextureParameterIuivEXT_pointer : J
/*      */     //   4918: lconst_0
/*      */     //   4919: lcmp
/*      */     //   4920: ifeq -> 4927
/*      */     //   4923: iconst_1
/*      */     //   4924: goto -> 4928
/*      */     //   4927: iconst_0
/*      */     //   4928: iand
/*      */     //   4929: aload_2
/*      */     //   4930: ldc_w 'GL_EXT_texture_integer'
/*      */     //   4933: invokeinterface contains : (Ljava/lang/Object;)Z
/*      */     //   4938: ifeq -> 4957
/*      */     //   4941: aload_0
/*      */     //   4942: ldc_w 'glGetTextureParameterIivEXT'
/*      */     //   4945: invokestatic getFunctionAddress : (Ljava/lang/String;)J
/*      */     //   4948: dup2_x1
/*      */     //   4949: putfield EXT_direct_state_access_glGetTextureParameterIivEXT_pointer : J
/*      */     //   4952: lconst_0
/*      */     //   4953: lcmp
/*      */     //   4954: ifeq -> 4961
/*      */     //   4957: iconst_1
/*      */     //   4958: goto -> 4962
/*      */     //   4961: iconst_0
/*      */     //   4962: iand
/*      */     //   4963: aload_2
/*      */     //   4964: ldc_w 'GL_EXT_texture_integer'
/*      */     //   4967: invokeinterface contains : (Ljava/lang/Object;)Z
/*      */     //   4972: ifeq -> 4991
/*      */     //   4975: aload_0
/*      */     //   4976: ldc_w 'glGetTextureParameterIuivEXT'
/*      */     //   4979: invokestatic getFunctionAddress : (Ljava/lang/String;)J
/*      */     //   4982: dup2_x1
/*      */     //   4983: putfield EXT_direct_state_access_glGetTextureParameterIuivEXT_pointer : J
/*      */     //   4986: lconst_0
/*      */     //   4987: lcmp
/*      */     //   4988: ifeq -> 4995
/*      */     //   4991: iconst_1
/*      */     //   4992: goto -> 4996
/*      */     //   4995: iconst_0
/*      */     //   4996: iand
/*      */     //   4997: aload_2
/*      */     //   4998: ldc_w 'GL_EXT_texture_integer'
/*      */     //   5001: invokeinterface contains : (Ljava/lang/Object;)Z
/*      */     //   5006: ifeq -> 5025
/*      */     //   5009: aload_0
/*      */     //   5010: ldc_w 'glMultiTexParameterIivEXT'
/*      */     //   5013: invokestatic getFunctionAddress : (Ljava/lang/String;)J
/*      */     //   5016: dup2_x1
/*      */     //   5017: putfield EXT_direct_state_access_glMultiTexParameterIivEXT_pointer : J
/*      */     //   5020: lconst_0
/*      */     //   5021: lcmp
/*      */     //   5022: ifeq -> 5029
/*      */     //   5025: iconst_1
/*      */     //   5026: goto -> 5030
/*      */     //   5029: iconst_0
/*      */     //   5030: iand
/*      */     //   5031: aload_2
/*      */     //   5032: ldc_w 'GL_EXT_texture_integer'
/*      */     //   5035: invokeinterface contains : (Ljava/lang/Object;)Z
/*      */     //   5040: ifeq -> 5059
/*      */     //   5043: aload_0
/*      */     //   5044: ldc_w 'glMultiTexParameterIuivEXT'
/*      */     //   5047: invokestatic getFunctionAddress : (Ljava/lang/String;)J
/*      */     //   5050: dup2_x1
/*      */     //   5051: putfield EXT_direct_state_access_glMultiTexParameterIuivEXT_pointer : J
/*      */     //   5054: lconst_0
/*      */     //   5055: lcmp
/*      */     //   5056: ifeq -> 5063
/*      */     //   5059: iconst_1
/*      */     //   5060: goto -> 5064
/*      */     //   5063: iconst_0
/*      */     //   5064: iand
/*      */     //   5065: aload_2
/*      */     //   5066: ldc_w 'GL_EXT_texture_integer'
/*      */     //   5069: invokeinterface contains : (Ljava/lang/Object;)Z
/*      */     //   5074: ifeq -> 5093
/*      */     //   5077: aload_0
/*      */     //   5078: ldc_w 'glGetMultiTexParameterIivEXT'
/*      */     //   5081: invokestatic getFunctionAddress : (Ljava/lang/String;)J
/*      */     //   5084: dup2_x1
/*      */     //   5085: putfield EXT_direct_state_access_glGetMultiTexParameterIivEXT_pointer : J
/*      */     //   5088: lconst_0
/*      */     //   5089: lcmp
/*      */     //   5090: ifeq -> 5097
/*      */     //   5093: iconst_1
/*      */     //   5094: goto -> 5098
/*      */     //   5097: iconst_0
/*      */     //   5098: iand
/*      */     //   5099: aload_2
/*      */     //   5100: ldc_w 'GL_EXT_texture_integer'
/*      */     //   5103: invokeinterface contains : (Ljava/lang/Object;)Z
/*      */     //   5108: ifeq -> 5127
/*      */     //   5111: aload_0
/*      */     //   5112: ldc_w 'glGetMultiTexParameterIuivEXT'
/*      */     //   5115: invokestatic getFunctionAddress : (Ljava/lang/String;)J
/*      */     //   5118: dup2_x1
/*      */     //   5119: putfield EXT_direct_state_access_glGetMultiTexParameterIuivEXT_pointer : J
/*      */     //   5122: lconst_0
/*      */     //   5123: lcmp
/*      */     //   5124: ifeq -> 5131
/*      */     //   5127: iconst_1
/*      */     //   5128: goto -> 5132
/*      */     //   5131: iconst_0
/*      */     //   5132: iand
/*      */     //   5133: aload_2
/*      */     //   5134: ldc_w 'GL_EXT_gpu_shader4'
/*      */     //   5137: invokeinterface contains : (Ljava/lang/Object;)Z
/*      */     //   5142: ifeq -> 5161
/*      */     //   5145: aload_0
/*      */     //   5146: ldc_w 'glProgramUniform1uiEXT'
/*      */     //   5149: invokestatic getFunctionAddress : (Ljava/lang/String;)J
/*      */     //   5152: dup2_x1
/*      */     //   5153: putfield EXT_direct_state_access_glProgramUniform1uiEXT_pointer : J
/*      */     //   5156: lconst_0
/*      */     //   5157: lcmp
/*      */     //   5158: ifeq -> 5165
/*      */     //   5161: iconst_1
/*      */     //   5162: goto -> 5166
/*      */     //   5165: iconst_0
/*      */     //   5166: iand
/*      */     //   5167: aload_2
/*      */     //   5168: ldc_w 'GL_EXT_gpu_shader4'
/*      */     //   5171: invokeinterface contains : (Ljava/lang/Object;)Z
/*      */     //   5176: ifeq -> 5195
/*      */     //   5179: aload_0
/*      */     //   5180: ldc_w 'glProgramUniform2uiEXT'
/*      */     //   5183: invokestatic getFunctionAddress : (Ljava/lang/String;)J
/*      */     //   5186: dup2_x1
/*      */     //   5187: putfield EXT_direct_state_access_glProgramUniform2uiEXT_pointer : J
/*      */     //   5190: lconst_0
/*      */     //   5191: lcmp
/*      */     //   5192: ifeq -> 5199
/*      */     //   5195: iconst_1
/*      */     //   5196: goto -> 5200
/*      */     //   5199: iconst_0
/*      */     //   5200: iand
/*      */     //   5201: aload_2
/*      */     //   5202: ldc_w 'GL_EXT_gpu_shader4'
/*      */     //   5205: invokeinterface contains : (Ljava/lang/Object;)Z
/*      */     //   5210: ifeq -> 5229
/*      */     //   5213: aload_0
/*      */     //   5214: ldc_w 'glProgramUniform3uiEXT'
/*      */     //   5217: invokestatic getFunctionAddress : (Ljava/lang/String;)J
/*      */     //   5220: dup2_x1
/*      */     //   5221: putfield EXT_direct_state_access_glProgramUniform3uiEXT_pointer : J
/*      */     //   5224: lconst_0
/*      */     //   5225: lcmp
/*      */     //   5226: ifeq -> 5233
/*      */     //   5229: iconst_1
/*      */     //   5230: goto -> 5234
/*      */     //   5233: iconst_0
/*      */     //   5234: iand
/*      */     //   5235: aload_2
/*      */     //   5236: ldc_w 'GL_EXT_gpu_shader4'
/*      */     //   5239: invokeinterface contains : (Ljava/lang/Object;)Z
/*      */     //   5244: ifeq -> 5263
/*      */     //   5247: aload_0
/*      */     //   5248: ldc_w 'glProgramUniform4uiEXT'
/*      */     //   5251: invokestatic getFunctionAddress : (Ljava/lang/String;)J
/*      */     //   5254: dup2_x1
/*      */     //   5255: putfield EXT_direct_state_access_glProgramUniform4uiEXT_pointer : J
/*      */     //   5258: lconst_0
/*      */     //   5259: lcmp
/*      */     //   5260: ifeq -> 5267
/*      */     //   5263: iconst_1
/*      */     //   5264: goto -> 5268
/*      */     //   5267: iconst_0
/*      */     //   5268: iand
/*      */     //   5269: aload_2
/*      */     //   5270: ldc_w 'GL_EXT_gpu_shader4'
/*      */     //   5273: invokeinterface contains : (Ljava/lang/Object;)Z
/*      */     //   5278: ifeq -> 5297
/*      */     //   5281: aload_0
/*      */     //   5282: ldc_w 'glProgramUniform1uivEXT'
/*      */     //   5285: invokestatic getFunctionAddress : (Ljava/lang/String;)J
/*      */     //   5288: dup2_x1
/*      */     //   5289: putfield EXT_direct_state_access_glProgramUniform1uivEXT_pointer : J
/*      */     //   5292: lconst_0
/*      */     //   5293: lcmp
/*      */     //   5294: ifeq -> 5301
/*      */     //   5297: iconst_1
/*      */     //   5298: goto -> 5302
/*      */     //   5301: iconst_0
/*      */     //   5302: iand
/*      */     //   5303: aload_2
/*      */     //   5304: ldc_w 'GL_EXT_gpu_shader4'
/*      */     //   5307: invokeinterface contains : (Ljava/lang/Object;)Z
/*      */     //   5312: ifeq -> 5331
/*      */     //   5315: aload_0
/*      */     //   5316: ldc_w 'glProgramUniform2uivEXT'
/*      */     //   5319: invokestatic getFunctionAddress : (Ljava/lang/String;)J
/*      */     //   5322: dup2_x1
/*      */     //   5323: putfield EXT_direct_state_access_glProgramUniform2uivEXT_pointer : J
/*      */     //   5326: lconst_0
/*      */     //   5327: lcmp
/*      */     //   5328: ifeq -> 5335
/*      */     //   5331: iconst_1
/*      */     //   5332: goto -> 5336
/*      */     //   5335: iconst_0
/*      */     //   5336: iand
/*      */     //   5337: aload_2
/*      */     //   5338: ldc_w 'GL_EXT_gpu_shader4'
/*      */     //   5341: invokeinterface contains : (Ljava/lang/Object;)Z
/*      */     //   5346: ifeq -> 5365
/*      */     //   5349: aload_0
/*      */     //   5350: ldc_w 'glProgramUniform3uivEXT'
/*      */     //   5353: invokestatic getFunctionAddress : (Ljava/lang/String;)J
/*      */     //   5356: dup2_x1
/*      */     //   5357: putfield EXT_direct_state_access_glProgramUniform3uivEXT_pointer : J
/*      */     //   5360: lconst_0
/*      */     //   5361: lcmp
/*      */     //   5362: ifeq -> 5369
/*      */     //   5365: iconst_1
/*      */     //   5366: goto -> 5370
/*      */     //   5369: iconst_0
/*      */     //   5370: iand
/*      */     //   5371: aload_2
/*      */     //   5372: ldc_w 'GL_EXT_gpu_shader4'
/*      */     //   5375: invokeinterface contains : (Ljava/lang/Object;)Z
/*      */     //   5380: ifeq -> 5399
/*      */     //   5383: aload_0
/*      */     //   5384: ldc_w 'glProgramUniform4uivEXT'
/*      */     //   5387: invokestatic getFunctionAddress : (Ljava/lang/String;)J
/*      */     //   5390: dup2_x1
/*      */     //   5391: putfield EXT_direct_state_access_glProgramUniform4uivEXT_pointer : J
/*      */     //   5394: lconst_0
/*      */     //   5395: lcmp
/*      */     //   5396: ifeq -> 5403
/*      */     //   5399: iconst_1
/*      */     //   5400: goto -> 5404
/*      */     //   5403: iconst_0
/*      */     //   5404: iand
/*      */     //   5405: aload_2
/*      */     //   5406: ldc_w 'GL_EXT_gpu_program_parameters'
/*      */     //   5409: invokeinterface contains : (Ljava/lang/Object;)Z
/*      */     //   5414: ifeq -> 5433
/*      */     //   5417: aload_0
/*      */     //   5418: ldc_w 'glNamedProgramLocalParameters4fvEXT'
/*      */     //   5421: invokestatic getFunctionAddress : (Ljava/lang/String;)J
/*      */     //   5424: dup2_x1
/*      */     //   5425: putfield EXT_direct_state_access_glNamedProgramLocalParameters4fvEXT_pointer : J
/*      */     //   5428: lconst_0
/*      */     //   5429: lcmp
/*      */     //   5430: ifeq -> 5437
/*      */     //   5433: iconst_1
/*      */     //   5434: goto -> 5438
/*      */     //   5437: iconst_0
/*      */     //   5438: iand
/*      */     //   5439: aload_2
/*      */     //   5440: ldc_w 'GL_NV_gpu_program4'
/*      */     //   5443: invokeinterface contains : (Ljava/lang/Object;)Z
/*      */     //   5448: ifeq -> 5467
/*      */     //   5451: aload_0
/*      */     //   5452: ldc_w 'glNamedProgramLocalParameterI4iEXT'
/*      */     //   5455: invokestatic getFunctionAddress : (Ljava/lang/String;)J
/*      */     //   5458: dup2_x1
/*      */     //   5459: putfield EXT_direct_state_access_glNamedProgramLocalParameterI4iEXT_pointer : J
/*      */     //   5462: lconst_0
/*      */     //   5463: lcmp
/*      */     //   5464: ifeq -> 5471
/*      */     //   5467: iconst_1
/*      */     //   5468: goto -> 5472
/*      */     //   5471: iconst_0
/*      */     //   5472: iand
/*      */     //   5473: aload_2
/*      */     //   5474: ldc_w 'GL_NV_gpu_program4'
/*      */     //   5477: invokeinterface contains : (Ljava/lang/Object;)Z
/*      */     //   5482: ifeq -> 5501
/*      */     //   5485: aload_0
/*      */     //   5486: ldc_w 'glNamedProgramLocalParameterI4ivEXT'
/*      */     //   5489: invokestatic getFunctionAddress : (Ljava/lang/String;)J
/*      */     //   5492: dup2_x1
/*      */     //   5493: putfield EXT_direct_state_access_glNamedProgramLocalParameterI4ivEXT_pointer : J
/*      */     //   5496: lconst_0
/*      */     //   5497: lcmp
/*      */     //   5498: ifeq -> 5505
/*      */     //   5501: iconst_1
/*      */     //   5502: goto -> 5506
/*      */     //   5505: iconst_0
/*      */     //   5506: iand
/*      */     //   5507: aload_2
/*      */     //   5508: ldc_w 'GL_NV_gpu_program4'
/*      */     //   5511: invokeinterface contains : (Ljava/lang/Object;)Z
/*      */     //   5516: ifeq -> 5535
/*      */     //   5519: aload_0
/*      */     //   5520: ldc_w 'glNamedProgramLocalParametersI4ivEXT'
/*      */     //   5523: invokestatic getFunctionAddress : (Ljava/lang/String;)J
/*      */     //   5526: dup2_x1
/*      */     //   5527: putfield EXT_direct_state_access_glNamedProgramLocalParametersI4ivEXT_pointer : J
/*      */     //   5530: lconst_0
/*      */     //   5531: lcmp
/*      */     //   5532: ifeq -> 5539
/*      */     //   5535: iconst_1
/*      */     //   5536: goto -> 5540
/*      */     //   5539: iconst_0
/*      */     //   5540: iand
/*      */     //   5541: aload_2
/*      */     //   5542: ldc_w 'GL_NV_gpu_program4'
/*      */     //   5545: invokeinterface contains : (Ljava/lang/Object;)Z
/*      */     //   5550: ifeq -> 5569
/*      */     //   5553: aload_0
/*      */     //   5554: ldc_w 'glNamedProgramLocalParameterI4uiEXT'
/*      */     //   5557: invokestatic getFunctionAddress : (Ljava/lang/String;)J
/*      */     //   5560: dup2_x1
/*      */     //   5561: putfield EXT_direct_state_access_glNamedProgramLocalParameterI4uiEXT_pointer : J
/*      */     //   5564: lconst_0
/*      */     //   5565: lcmp
/*      */     //   5566: ifeq -> 5573
/*      */     //   5569: iconst_1
/*      */     //   5570: goto -> 5574
/*      */     //   5573: iconst_0
/*      */     //   5574: iand
/*      */     //   5575: aload_2
/*      */     //   5576: ldc_w 'GL_NV_gpu_program4'
/*      */     //   5579: invokeinterface contains : (Ljava/lang/Object;)Z
/*      */     //   5584: ifeq -> 5603
/*      */     //   5587: aload_0
/*      */     //   5588: ldc_w 'glNamedProgramLocalParameterI4uivEXT'
/*      */     //   5591: invokestatic getFunctionAddress : (Ljava/lang/String;)J
/*      */     //   5594: dup2_x1
/*      */     //   5595: putfield EXT_direct_state_access_glNamedProgramLocalParameterI4uivEXT_pointer : J
/*      */     //   5598: lconst_0
/*      */     //   5599: lcmp
/*      */     //   5600: ifeq -> 5607
/*      */     //   5603: iconst_1
/*      */     //   5604: goto -> 5608
/*      */     //   5607: iconst_0
/*      */     //   5608: iand
/*      */     //   5609: aload_2
/*      */     //   5610: ldc_w 'GL_NV_gpu_program4'
/*      */     //   5613: invokeinterface contains : (Ljava/lang/Object;)Z
/*      */     //   5618: ifeq -> 5637
/*      */     //   5621: aload_0
/*      */     //   5622: ldc_w 'glNamedProgramLocalParametersI4uivEXT'
/*      */     //   5625: invokestatic getFunctionAddress : (Ljava/lang/String;)J
/*      */     //   5628: dup2_x1
/*      */     //   5629: putfield EXT_direct_state_access_glNamedProgramLocalParametersI4uivEXT_pointer : J
/*      */     //   5632: lconst_0
/*      */     //   5633: lcmp
/*      */     //   5634: ifeq -> 5641
/*      */     //   5637: iconst_1
/*      */     //   5638: goto -> 5642
/*      */     //   5641: iconst_0
/*      */     //   5642: iand
/*      */     //   5643: aload_2
/*      */     //   5644: ldc_w 'GL_NV_gpu_program4'
/*      */     //   5647: invokeinterface contains : (Ljava/lang/Object;)Z
/*      */     //   5652: ifeq -> 5671
/*      */     //   5655: aload_0
/*      */     //   5656: ldc_w 'glGetNamedProgramLocalParameterIivEXT'
/*      */     //   5659: invokestatic getFunctionAddress : (Ljava/lang/String;)J
/*      */     //   5662: dup2_x1
/*      */     //   5663: putfield EXT_direct_state_access_glGetNamedProgramLocalParameterIivEXT_pointer : J
/*      */     //   5666: lconst_0
/*      */     //   5667: lcmp
/*      */     //   5668: ifeq -> 5675
/*      */     //   5671: iconst_1
/*      */     //   5672: goto -> 5676
/*      */     //   5675: iconst_0
/*      */     //   5676: iand
/*      */     //   5677: aload_2
/*      */     //   5678: ldc_w 'GL_NV_gpu_program4'
/*      */     //   5681: invokeinterface contains : (Ljava/lang/Object;)Z
/*      */     //   5686: ifeq -> 5705
/*      */     //   5689: aload_0
/*      */     //   5690: ldc_w 'glGetNamedProgramLocalParameterIuivEXT'
/*      */     //   5693: invokestatic getFunctionAddress : (Ljava/lang/String;)J
/*      */     //   5696: dup2_x1
/*      */     //   5697: putfield EXT_direct_state_access_glGetNamedProgramLocalParameterIuivEXT_pointer : J
/*      */     //   5700: lconst_0
/*      */     //   5701: lcmp
/*      */     //   5702: ifeq -> 5709
/*      */     //   5705: iconst_1
/*      */     //   5706: goto -> 5710
/*      */     //   5709: iconst_0
/*      */     //   5710: iand
/*      */     //   5711: aload_2
/*      */     //   5712: ldc_w 'OpenGL30'
/*      */     //   5715: invokeinterface contains : (Ljava/lang/Object;)Z
/*      */     //   5720: ifne -> 5735
/*      */     //   5723: aload_2
/*      */     //   5724: ldc_w 'GL_EXT_framebuffer_object'
/*      */     //   5727: invokeinterface contains : (Ljava/lang/Object;)Z
/*      */     //   5732: ifeq -> 5751
/*      */     //   5735: aload_0
/*      */     //   5736: ldc_w 'glNamedRenderbufferStorageEXT'
/*      */     //   5739: invokestatic getFunctionAddress : (Ljava/lang/String;)J
/*      */     //   5742: dup2_x1
/*      */     //   5743: putfield EXT_direct_state_access_glNamedRenderbufferStorageEXT_pointer : J
/*      */     //   5746: lconst_0
/*      */     //   5747: lcmp
/*      */     //   5748: ifeq -> 5755
/*      */     //   5751: iconst_1
/*      */     //   5752: goto -> 5756
/*      */     //   5755: iconst_0
/*      */     //   5756: iand
/*      */     //   5757: aload_2
/*      */     //   5758: ldc_w 'OpenGL30'
/*      */     //   5761: invokeinterface contains : (Ljava/lang/Object;)Z
/*      */     //   5766: ifne -> 5781
/*      */     //   5769: aload_2
/*      */     //   5770: ldc_w 'GL_EXT_framebuffer_object'
/*      */     //   5773: invokeinterface contains : (Ljava/lang/Object;)Z
/*      */     //   5778: ifeq -> 5797
/*      */     //   5781: aload_0
/*      */     //   5782: ldc_w 'glGetNamedRenderbufferParameterivEXT'
/*      */     //   5785: invokestatic getFunctionAddress : (Ljava/lang/String;)J
/*      */     //   5788: dup2_x1
/*      */     //   5789: putfield EXT_direct_state_access_glGetNamedRenderbufferParameterivEXT_pointer : J
/*      */     //   5792: lconst_0
/*      */     //   5793: lcmp
/*      */     //   5794: ifeq -> 5801
/*      */     //   5797: iconst_1
/*      */     //   5798: goto -> 5802
/*      */     //   5801: iconst_0
/*      */     //   5802: iand
/*      */     //   5803: aload_2
/*      */     //   5804: ldc_w 'OpenGL30'
/*      */     //   5807: invokeinterface contains : (Ljava/lang/Object;)Z
/*      */     //   5812: ifne -> 5827
/*      */     //   5815: aload_2
/*      */     //   5816: ldc_w 'GL_EXT_framebuffer_multisample'
/*      */     //   5819: invokeinterface contains : (Ljava/lang/Object;)Z
/*      */     //   5824: ifeq -> 5843
/*      */     //   5827: aload_0
/*      */     //   5828: ldc_w 'glNamedRenderbufferStorageMultisampleEXT'
/*      */     //   5831: invokestatic getFunctionAddress : (Ljava/lang/String;)J
/*      */     //   5834: dup2_x1
/*      */     //   5835: putfield EXT_direct_state_access_glNamedRenderbufferStorageMultisampleEXT_pointer : J
/*      */     //   5838: lconst_0
/*      */     //   5839: lcmp
/*      */     //   5840: ifeq -> 5847
/*      */     //   5843: iconst_1
/*      */     //   5844: goto -> 5848
/*      */     //   5847: iconst_0
/*      */     //   5848: iand
/*      */     //   5849: aload_2
/*      */     //   5850: ldc_w 'GL_NV_framebuffer_multisample_coverage'
/*      */     //   5853: invokeinterface contains : (Ljava/lang/Object;)Z
/*      */     //   5858: ifeq -> 5877
/*      */     //   5861: aload_0
/*      */     //   5862: ldc_w 'glNamedRenderbufferStorageMultisampleCoverageEXT'
/*      */     //   5865: invokestatic getFunctionAddress : (Ljava/lang/String;)J
/*      */     //   5868: dup2_x1
/*      */     //   5869: putfield EXT_direct_state_access_glNamedRenderbufferStorageMultisampleCoverageEXT_pointer : J
/*      */     //   5872: lconst_0
/*      */     //   5873: lcmp
/*      */     //   5874: ifeq -> 5881
/*      */     //   5877: iconst_1
/*      */     //   5878: goto -> 5882
/*      */     //   5881: iconst_0
/*      */     //   5882: iand
/*      */     //   5883: aload_2
/*      */     //   5884: ldc_w 'OpenGL30'
/*      */     //   5887: invokeinterface contains : (Ljava/lang/Object;)Z
/*      */     //   5892: ifne -> 5907
/*      */     //   5895: aload_2
/*      */     //   5896: ldc_w 'GL_EXT_framebuffer_object'
/*      */     //   5899: invokeinterface contains : (Ljava/lang/Object;)Z
/*      */     //   5904: ifeq -> 5923
/*      */     //   5907: aload_0
/*      */     //   5908: ldc_w 'glCheckNamedFramebufferStatusEXT'
/*      */     //   5911: invokestatic getFunctionAddress : (Ljava/lang/String;)J
/*      */     //   5914: dup2_x1
/*      */     //   5915: putfield EXT_direct_state_access_glCheckNamedFramebufferStatusEXT_pointer : J
/*      */     //   5918: lconst_0
/*      */     //   5919: lcmp
/*      */     //   5920: ifeq -> 5927
/*      */     //   5923: iconst_1
/*      */     //   5924: goto -> 5928
/*      */     //   5927: iconst_0
/*      */     //   5928: iand
/*      */     //   5929: aload_2
/*      */     //   5930: ldc_w 'OpenGL30'
/*      */     //   5933: invokeinterface contains : (Ljava/lang/Object;)Z
/*      */     //   5938: ifne -> 5953
/*      */     //   5941: aload_2
/*      */     //   5942: ldc_w 'GL_EXT_framebuffer_object'
/*      */     //   5945: invokeinterface contains : (Ljava/lang/Object;)Z
/*      */     //   5950: ifeq -> 5969
/*      */     //   5953: aload_0
/*      */     //   5954: ldc_w 'glNamedFramebufferTexture1DEXT'
/*      */     //   5957: invokestatic getFunctionAddress : (Ljava/lang/String;)J
/*      */     //   5960: dup2_x1
/*      */     //   5961: putfield EXT_direct_state_access_glNamedFramebufferTexture1DEXT_pointer : J
/*      */     //   5964: lconst_0
/*      */     //   5965: lcmp
/*      */     //   5966: ifeq -> 5973
/*      */     //   5969: iconst_1
/*      */     //   5970: goto -> 5974
/*      */     //   5973: iconst_0
/*      */     //   5974: iand
/*      */     //   5975: aload_2
/*      */     //   5976: ldc_w 'OpenGL30'
/*      */     //   5979: invokeinterface contains : (Ljava/lang/Object;)Z
/*      */     //   5984: ifne -> 5999
/*      */     //   5987: aload_2
/*      */     //   5988: ldc_w 'GL_EXT_framebuffer_object'
/*      */     //   5991: invokeinterface contains : (Ljava/lang/Object;)Z
/*      */     //   5996: ifeq -> 6015
/*      */     //   5999: aload_0
/*      */     //   6000: ldc_w 'glNamedFramebufferTexture2DEXT'
/*      */     //   6003: invokestatic getFunctionAddress : (Ljava/lang/String;)J
/*      */     //   6006: dup2_x1
/*      */     //   6007: putfield EXT_direct_state_access_glNamedFramebufferTexture2DEXT_pointer : J
/*      */     //   6010: lconst_0
/*      */     //   6011: lcmp
/*      */     //   6012: ifeq -> 6019
/*      */     //   6015: iconst_1
/*      */     //   6016: goto -> 6020
/*      */     //   6019: iconst_0
/*      */     //   6020: iand
/*      */     //   6021: aload_2
/*      */     //   6022: ldc_w 'OpenGL30'
/*      */     //   6025: invokeinterface contains : (Ljava/lang/Object;)Z
/*      */     //   6030: ifne -> 6045
/*      */     //   6033: aload_2
/*      */     //   6034: ldc_w 'GL_EXT_framebuffer_object'
/*      */     //   6037: invokeinterface contains : (Ljava/lang/Object;)Z
/*      */     //   6042: ifeq -> 6061
/*      */     //   6045: aload_0
/*      */     //   6046: ldc_w 'glNamedFramebufferTexture3DEXT'
/*      */     //   6049: invokestatic getFunctionAddress : (Ljava/lang/String;)J
/*      */     //   6052: dup2_x1
/*      */     //   6053: putfield EXT_direct_state_access_glNamedFramebufferTexture3DEXT_pointer : J
/*      */     //   6056: lconst_0
/*      */     //   6057: lcmp
/*      */     //   6058: ifeq -> 6065
/*      */     //   6061: iconst_1
/*      */     //   6062: goto -> 6066
/*      */     //   6065: iconst_0
/*      */     //   6066: iand
/*      */     //   6067: aload_2
/*      */     //   6068: ldc_w 'OpenGL30'
/*      */     //   6071: invokeinterface contains : (Ljava/lang/Object;)Z
/*      */     //   6076: ifne -> 6091
/*      */     //   6079: aload_2
/*      */     //   6080: ldc_w 'GL_EXT_framebuffer_object'
/*      */     //   6083: invokeinterface contains : (Ljava/lang/Object;)Z
/*      */     //   6088: ifeq -> 6107
/*      */     //   6091: aload_0
/*      */     //   6092: ldc_w 'glNamedFramebufferRenderbufferEXT'
/*      */     //   6095: invokestatic getFunctionAddress : (Ljava/lang/String;)J
/*      */     //   6098: dup2_x1
/*      */     //   6099: putfield EXT_direct_state_access_glNamedFramebufferRenderbufferEXT_pointer : J
/*      */     //   6102: lconst_0
/*      */     //   6103: lcmp
/*      */     //   6104: ifeq -> 6111
/*      */     //   6107: iconst_1
/*      */     //   6108: goto -> 6112
/*      */     //   6111: iconst_0
/*      */     //   6112: iand
/*      */     //   6113: aload_2
/*      */     //   6114: ldc_w 'OpenGL30'
/*      */     //   6117: invokeinterface contains : (Ljava/lang/Object;)Z
/*      */     //   6122: ifne -> 6137
/*      */     //   6125: aload_2
/*      */     //   6126: ldc_w 'GL_EXT_framebuffer_object'
/*      */     //   6129: invokeinterface contains : (Ljava/lang/Object;)Z
/*      */     //   6134: ifeq -> 6153
/*      */     //   6137: aload_0
/*      */     //   6138: ldc_w 'glGetNamedFramebufferAttachmentParameterivEXT'
/*      */     //   6141: invokestatic getFunctionAddress : (Ljava/lang/String;)J
/*      */     //   6144: dup2_x1
/*      */     //   6145: putfield EXT_direct_state_access_glGetNamedFramebufferAttachmentParameterivEXT_pointer : J
/*      */     //   6148: lconst_0
/*      */     //   6149: lcmp
/*      */     //   6150: ifeq -> 6157
/*      */     //   6153: iconst_1
/*      */     //   6154: goto -> 6158
/*      */     //   6157: iconst_0
/*      */     //   6158: iand
/*      */     //   6159: aload_2
/*      */     //   6160: ldc_w 'OpenGL30'
/*      */     //   6163: invokeinterface contains : (Ljava/lang/Object;)Z
/*      */     //   6168: ifne -> 6183
/*      */     //   6171: aload_2
/*      */     //   6172: ldc_w 'GL_EXT_framebuffer_object'
/*      */     //   6175: invokeinterface contains : (Ljava/lang/Object;)Z
/*      */     //   6180: ifeq -> 6199
/*      */     //   6183: aload_0
/*      */     //   6184: ldc_w 'glGenerateTextureMipmapEXT'
/*      */     //   6187: invokestatic getFunctionAddress : (Ljava/lang/String;)J
/*      */     //   6190: dup2_x1
/*      */     //   6191: putfield EXT_direct_state_access_glGenerateTextureMipmapEXT_pointer : J
/*      */     //   6194: lconst_0
/*      */     //   6195: lcmp
/*      */     //   6196: ifeq -> 6203
/*      */     //   6199: iconst_1
/*      */     //   6200: goto -> 6204
/*      */     //   6203: iconst_0
/*      */     //   6204: iand
/*      */     //   6205: aload_2
/*      */     //   6206: ldc_w 'OpenGL30'
/*      */     //   6209: invokeinterface contains : (Ljava/lang/Object;)Z
/*      */     //   6214: ifne -> 6229
/*      */     //   6217: aload_2
/*      */     //   6218: ldc_w 'GL_EXT_framebuffer_object'
/*      */     //   6221: invokeinterface contains : (Ljava/lang/Object;)Z
/*      */     //   6226: ifeq -> 6245
/*      */     //   6229: aload_0
/*      */     //   6230: ldc_w 'glGenerateMultiTexMipmapEXT'
/*      */     //   6233: invokestatic getFunctionAddress : (Ljava/lang/String;)J
/*      */     //   6236: dup2_x1
/*      */     //   6237: putfield EXT_direct_state_access_glGenerateMultiTexMipmapEXT_pointer : J
/*      */     //   6240: lconst_0
/*      */     //   6241: lcmp
/*      */     //   6242: ifeq -> 6249
/*      */     //   6245: iconst_1
/*      */     //   6246: goto -> 6250
/*      */     //   6249: iconst_0
/*      */     //   6250: iand
/*      */     //   6251: aload_2
/*      */     //   6252: ldc_w 'OpenGL30'
/*      */     //   6255: invokeinterface contains : (Ljava/lang/Object;)Z
/*      */     //   6260: ifne -> 6275
/*      */     //   6263: aload_2
/*      */     //   6264: ldc_w 'GL_EXT_framebuffer_object'
/*      */     //   6267: invokeinterface contains : (Ljava/lang/Object;)Z
/*      */     //   6272: ifeq -> 6291
/*      */     //   6275: aload_0
/*      */     //   6276: ldc_w 'glFramebufferDrawBufferEXT'
/*      */     //   6279: invokestatic getFunctionAddress : (Ljava/lang/String;)J
/*      */     //   6282: dup2_x1
/*      */     //   6283: putfield EXT_direct_state_access_glFramebufferDrawBufferEXT_pointer : J
/*      */     //   6286: lconst_0
/*      */     //   6287: lcmp
/*      */     //   6288: ifeq -> 6295
/*      */     //   6291: iconst_1
/*      */     //   6292: goto -> 6296
/*      */     //   6295: iconst_0
/*      */     //   6296: iand
/*      */     //   6297: aload_2
/*      */     //   6298: ldc_w 'OpenGL30'
/*      */     //   6301: invokeinterface contains : (Ljava/lang/Object;)Z
/*      */     //   6306: ifne -> 6321
/*      */     //   6309: aload_2
/*      */     //   6310: ldc_w 'GL_EXT_framebuffer_object'
/*      */     //   6313: invokeinterface contains : (Ljava/lang/Object;)Z
/*      */     //   6318: ifeq -> 6337
/*      */     //   6321: aload_0
/*      */     //   6322: ldc_w 'glFramebufferDrawBuffersEXT'
/*      */     //   6325: invokestatic getFunctionAddress : (Ljava/lang/String;)J
/*      */     //   6328: dup2_x1
/*      */     //   6329: putfield EXT_direct_state_access_glFramebufferDrawBuffersEXT_pointer : J
/*      */     //   6332: lconst_0
/*      */     //   6333: lcmp
/*      */     //   6334: ifeq -> 6341
/*      */     //   6337: iconst_1
/*      */     //   6338: goto -> 6342
/*      */     //   6341: iconst_0
/*      */     //   6342: iand
/*      */     //   6343: aload_2
/*      */     //   6344: ldc_w 'OpenGL30'
/*      */     //   6347: invokeinterface contains : (Ljava/lang/Object;)Z
/*      */     //   6352: ifne -> 6367
/*      */     //   6355: aload_2
/*      */     //   6356: ldc_w 'GL_EXT_framebuffer_object'
/*      */     //   6359: invokeinterface contains : (Ljava/lang/Object;)Z
/*      */     //   6364: ifeq -> 6383
/*      */     //   6367: aload_0
/*      */     //   6368: ldc_w 'glFramebufferReadBufferEXT'
/*      */     //   6371: invokestatic getFunctionAddress : (Ljava/lang/String;)J
/*      */     //   6374: dup2_x1
/*      */     //   6375: putfield EXT_direct_state_access_glFramebufferReadBufferEXT_pointer : J
/*      */     //   6378: lconst_0
/*      */     //   6379: lcmp
/*      */     //   6380: ifeq -> 6387
/*      */     //   6383: iconst_1
/*      */     //   6384: goto -> 6388
/*      */     //   6387: iconst_0
/*      */     //   6388: iand
/*      */     //   6389: aload_2
/*      */     //   6390: ldc_w 'OpenGL30'
/*      */     //   6393: invokeinterface contains : (Ljava/lang/Object;)Z
/*      */     //   6398: ifne -> 6413
/*      */     //   6401: aload_2
/*      */     //   6402: ldc_w 'GL_EXT_framebuffer_object'
/*      */     //   6405: invokeinterface contains : (Ljava/lang/Object;)Z
/*      */     //   6410: ifeq -> 6429
/*      */     //   6413: aload_0
/*      */     //   6414: ldc_w 'glGetFramebufferParameterivEXT'
/*      */     //   6417: invokestatic getFunctionAddress : (Ljava/lang/String;)J
/*      */     //   6420: dup2_x1
/*      */     //   6421: putfield EXT_direct_state_access_glGetFramebufferParameterivEXT_pointer : J
/*      */     //   6424: lconst_0
/*      */     //   6425: lcmp
/*      */     //   6426: ifeq -> 6433
/*      */     //   6429: iconst_1
/*      */     //   6430: goto -> 6434
/*      */     //   6433: iconst_0
/*      */     //   6434: iand
/*      */     //   6435: aload_2
/*      */     //   6436: ldc_w 'OpenGL31'
/*      */     //   6439: invokeinterface contains : (Ljava/lang/Object;)Z
/*      */     //   6444: ifne -> 6459
/*      */     //   6447: aload_2
/*      */     //   6448: ldc_w 'GL_ARB_copy_buffer'
/*      */     //   6451: invokeinterface contains : (Ljava/lang/Object;)Z
/*      */     //   6456: ifeq -> 6475
/*      */     //   6459: aload_0
/*      */     //   6460: ldc_w 'glNamedCopyBufferSubDataEXT'
/*      */     //   6463: invokestatic getFunctionAddress : (Ljava/lang/String;)J
/*      */     //   6466: dup2_x1
/*      */     //   6467: putfield EXT_direct_state_access_glNamedCopyBufferSubDataEXT_pointer : J
/*      */     //   6470: lconst_0
/*      */     //   6471: lcmp
/*      */     //   6472: ifeq -> 6479
/*      */     //   6475: iconst_1
/*      */     //   6476: goto -> 6480
/*      */     //   6479: iconst_0
/*      */     //   6480: iand
/*      */     //   6481: aload_2
/*      */     //   6482: ldc_w 'GL_EXT_geometry_shader4'
/*      */     //   6485: invokeinterface contains : (Ljava/lang/Object;)Z
/*      */     //   6490: ifne -> 6505
/*      */     //   6493: aload_2
/*      */     //   6494: ldc_w 'NV_geometry_program4'
/*      */     //   6497: invokeinterface contains : (Ljava/lang/Object;)Z
/*      */     //   6502: ifeq -> 6521
/*      */     //   6505: aload_0
/*      */     //   6506: ldc_w 'glNamedFramebufferTextureEXT'
/*      */     //   6509: invokestatic getFunctionAddress : (Ljava/lang/String;)J
/*      */     //   6512: dup2_x1
/*      */     //   6513: putfield EXT_direct_state_access_glNamedFramebufferTextureEXT_pointer : J
/*      */     //   6516: lconst_0
/*      */     //   6517: lcmp
/*      */     //   6518: ifeq -> 6525
/*      */     //   6521: iconst_1
/*      */     //   6522: goto -> 6526
/*      */     //   6525: iconst_0
/*      */     //   6526: iand
/*      */     //   6527: aload_2
/*      */     //   6528: ldc_w 'GL_EXT_geometry_shader4'
/*      */     //   6531: invokeinterface contains : (Ljava/lang/Object;)Z
/*      */     //   6536: ifne -> 6551
/*      */     //   6539: aload_2
/*      */     //   6540: ldc_w 'NV_geometry_program4'
/*      */     //   6543: invokeinterface contains : (Ljava/lang/Object;)Z
/*      */     //   6548: ifeq -> 6567
/*      */     //   6551: aload_0
/*      */     //   6552: ldc_w 'glNamedFramebufferTextureLayerEXT'
/*      */     //   6555: invokestatic getFunctionAddress : (Ljava/lang/String;)J
/*      */     //   6558: dup2_x1
/*      */     //   6559: putfield EXT_direct_state_access_glNamedFramebufferTextureLayerEXT_pointer : J
/*      */     //   6562: lconst_0
/*      */     //   6563: lcmp
/*      */     //   6564: ifeq -> 6571
/*      */     //   6567: iconst_1
/*      */     //   6568: goto -> 6572
/*      */     //   6571: iconst_0
/*      */     //   6572: iand
/*      */     //   6573: aload_2
/*      */     //   6574: ldc_w 'GL_EXT_geometry_shader4'
/*      */     //   6577: invokeinterface contains : (Ljava/lang/Object;)Z
/*      */     //   6582: ifne -> 6597
/*      */     //   6585: aload_2
/*      */     //   6586: ldc_w 'NV_geometry_program4'
/*      */     //   6589: invokeinterface contains : (Ljava/lang/Object;)Z
/*      */     //   6594: ifeq -> 6613
/*      */     //   6597: aload_0
/*      */     //   6598: ldc_w 'glNamedFramebufferTextureFaceEXT'
/*      */     //   6601: invokestatic getFunctionAddress : (Ljava/lang/String;)J
/*      */     //   6604: dup2_x1
/*      */     //   6605: putfield EXT_direct_state_access_glNamedFramebufferTextureFaceEXT_pointer : J
/*      */     //   6608: lconst_0
/*      */     //   6609: lcmp
/*      */     //   6610: ifeq -> 6617
/*      */     //   6613: iconst_1
/*      */     //   6614: goto -> 6618
/*      */     //   6617: iconst_0
/*      */     //   6618: iand
/*      */     //   6619: aload_2
/*      */     //   6620: ldc_w 'GL_NV_explicit_multisample'
/*      */     //   6623: invokeinterface contains : (Ljava/lang/Object;)Z
/*      */     //   6628: ifeq -> 6647
/*      */     //   6631: aload_0
/*      */     //   6632: ldc_w 'glTextureRenderbufferEXT'
/*      */     //   6635: invokestatic getFunctionAddress : (Ljava/lang/String;)J
/*      */     //   6638: dup2_x1
/*      */     //   6639: putfield EXT_direct_state_access_glTextureRenderbufferEXT_pointer : J
/*      */     //   6642: lconst_0
/*      */     //   6643: lcmp
/*      */     //   6644: ifeq -> 6651
/*      */     //   6647: iconst_1
/*      */     //   6648: goto -> 6652
/*      */     //   6651: iconst_0
/*      */     //   6652: iand
/*      */     //   6653: aload_2
/*      */     //   6654: ldc_w 'GL_NV_explicit_multisample'
/*      */     //   6657: invokeinterface contains : (Ljava/lang/Object;)Z
/*      */     //   6662: ifeq -> 6681
/*      */     //   6665: aload_0
/*      */     //   6666: ldc_w 'glMultiTexRenderbufferEXT'
/*      */     //   6669: invokestatic getFunctionAddress : (Ljava/lang/String;)J
/*      */     //   6672: dup2_x1
/*      */     //   6673: putfield EXT_direct_state_access_glMultiTexRenderbufferEXT_pointer : J
/*      */     //   6676: lconst_0
/*      */     //   6677: lcmp
/*      */     //   6678: ifeq -> 6685
/*      */     //   6681: iconst_1
/*      */     //   6682: goto -> 6686
/*      */     //   6685: iconst_0
/*      */     //   6686: iand
/*      */     //   6687: iload_1
/*      */     //   6688: ifne -> 6719
/*      */     //   6691: aload_2
/*      */     //   6692: ldc_w 'OpenGL30'
/*      */     //   6695: invokeinterface contains : (Ljava/lang/Object;)Z
/*      */     //   6700: ifeq -> 6719
/*      */     //   6703: aload_0
/*      */     //   6704: ldc_w 'glVertexArrayVertexOffsetEXT'
/*      */     //   6707: invokestatic getFunctionAddress : (Ljava/lang/String;)J
/*      */     //   6710: dup2_x1
/*      */     //   6711: putfield EXT_direct_state_access_glVertexArrayVertexOffsetEXT_pointer : J
/*      */     //   6714: lconst_0
/*      */     //   6715: lcmp
/*      */     //   6716: ifeq -> 6723
/*      */     //   6719: iconst_1
/*      */     //   6720: goto -> 6724
/*      */     //   6723: iconst_0
/*      */     //   6724: iand
/*      */     //   6725: iload_1
/*      */     //   6726: ifne -> 6757
/*      */     //   6729: aload_2
/*      */     //   6730: ldc_w 'OpenGL30'
/*      */     //   6733: invokeinterface contains : (Ljava/lang/Object;)Z
/*      */     //   6738: ifeq -> 6757
/*      */     //   6741: aload_0
/*      */     //   6742: ldc_w 'glVertexArrayColorOffsetEXT'
/*      */     //   6745: invokestatic getFunctionAddress : (Ljava/lang/String;)J
/*      */     //   6748: dup2_x1
/*      */     //   6749: putfield EXT_direct_state_access_glVertexArrayColorOffsetEXT_pointer : J
/*      */     //   6752: lconst_0
/*      */     //   6753: lcmp
/*      */     //   6754: ifeq -> 6761
/*      */     //   6757: iconst_1
/*      */     //   6758: goto -> 6762
/*      */     //   6761: iconst_0
/*      */     //   6762: iand
/*      */     //   6763: iload_1
/*      */     //   6764: ifne -> 6795
/*      */     //   6767: aload_2
/*      */     //   6768: ldc_w 'OpenGL30'
/*      */     //   6771: invokeinterface contains : (Ljava/lang/Object;)Z
/*      */     //   6776: ifeq -> 6795
/*      */     //   6779: aload_0
/*      */     //   6780: ldc_w 'glVertexArrayEdgeFlagOffsetEXT'
/*      */     //   6783: invokestatic getFunctionAddress : (Ljava/lang/String;)J
/*      */     //   6786: dup2_x1
/*      */     //   6787: putfield EXT_direct_state_access_glVertexArrayEdgeFlagOffsetEXT_pointer : J
/*      */     //   6790: lconst_0
/*      */     //   6791: lcmp
/*      */     //   6792: ifeq -> 6799
/*      */     //   6795: iconst_1
/*      */     //   6796: goto -> 6800
/*      */     //   6799: iconst_0
/*      */     //   6800: iand
/*      */     //   6801: aload_2
/*      */     //   6802: ldc_w 'OpenGL30'
/*      */     //   6805: invokeinterface contains : (Ljava/lang/Object;)Z
/*      */     //   6810: ifeq -> 6829
/*      */     //   6813: aload_0
/*      */     //   6814: ldc_w 'glVertexArrayIndexOffsetEXT'
/*      */     //   6817: invokestatic getFunctionAddress : (Ljava/lang/String;)J
/*      */     //   6820: dup2_x1
/*      */     //   6821: putfield EXT_direct_state_access_glVertexArrayIndexOffsetEXT_pointer : J
/*      */     //   6824: lconst_0
/*      */     //   6825: lcmp
/*      */     //   6826: ifeq -> 6833
/*      */     //   6829: iconst_1
/*      */     //   6830: goto -> 6834
/*      */     //   6833: iconst_0
/*      */     //   6834: iand
/*      */     //   6835: iload_1
/*      */     //   6836: ifne -> 6867
/*      */     //   6839: aload_2
/*      */     //   6840: ldc_w 'OpenGL30'
/*      */     //   6843: invokeinterface contains : (Ljava/lang/Object;)Z
/*      */     //   6848: ifeq -> 6867
/*      */     //   6851: aload_0
/*      */     //   6852: ldc_w 'glVertexArrayNormalOffsetEXT'
/*      */     //   6855: invokestatic getFunctionAddress : (Ljava/lang/String;)J
/*      */     //   6858: dup2_x1
/*      */     //   6859: putfield EXT_direct_state_access_glVertexArrayNormalOffsetEXT_pointer : J
/*      */     //   6862: lconst_0
/*      */     //   6863: lcmp
/*      */     //   6864: ifeq -> 6871
/*      */     //   6867: iconst_1
/*      */     //   6868: goto -> 6872
/*      */     //   6871: iconst_0
/*      */     //   6872: iand
/*      */     //   6873: iload_1
/*      */     //   6874: ifne -> 6905
/*      */     //   6877: aload_2
/*      */     //   6878: ldc_w 'OpenGL30'
/*      */     //   6881: invokeinterface contains : (Ljava/lang/Object;)Z
/*      */     //   6886: ifeq -> 6905
/*      */     //   6889: aload_0
/*      */     //   6890: ldc_w 'glVertexArrayTexCoordOffsetEXT'
/*      */     //   6893: invokestatic getFunctionAddress : (Ljava/lang/String;)J
/*      */     //   6896: dup2_x1
/*      */     //   6897: putfield EXT_direct_state_access_glVertexArrayTexCoordOffsetEXT_pointer : J
/*      */     //   6900: lconst_0
/*      */     //   6901: lcmp
/*      */     //   6902: ifeq -> 6909
/*      */     //   6905: iconst_1
/*      */     //   6906: goto -> 6910
/*      */     //   6909: iconst_0
/*      */     //   6910: iand
/*      */     //   6911: iload_1
/*      */     //   6912: ifne -> 6943
/*      */     //   6915: aload_2
/*      */     //   6916: ldc_w 'OpenGL30'
/*      */     //   6919: invokeinterface contains : (Ljava/lang/Object;)Z
/*      */     //   6924: ifeq -> 6943
/*      */     //   6927: aload_0
/*      */     //   6928: ldc_w 'glVertexArrayMultiTexCoordOffsetEXT'
/*      */     //   6931: invokestatic getFunctionAddress : (Ljava/lang/String;)J
/*      */     //   6934: dup2_x1
/*      */     //   6935: putfield EXT_direct_state_access_glVertexArrayMultiTexCoordOffsetEXT_pointer : J
/*      */     //   6938: lconst_0
/*      */     //   6939: lcmp
/*      */     //   6940: ifeq -> 6947
/*      */     //   6943: iconst_1
/*      */     //   6944: goto -> 6948
/*      */     //   6947: iconst_0
/*      */     //   6948: iand
/*      */     //   6949: iload_1
/*      */     //   6950: ifne -> 6981
/*      */     //   6953: aload_2
/*      */     //   6954: ldc_w 'OpenGL30'
/*      */     //   6957: invokeinterface contains : (Ljava/lang/Object;)Z
/*      */     //   6962: ifeq -> 6981
/*      */     //   6965: aload_0
/*      */     //   6966: ldc_w 'glVertexArrayFogCoordOffsetEXT'
/*      */     //   6969: invokestatic getFunctionAddress : (Ljava/lang/String;)J
/*      */     //   6972: dup2_x1
/*      */     //   6973: putfield EXT_direct_state_access_glVertexArrayFogCoordOffsetEXT_pointer : J
/*      */     //   6976: lconst_0
/*      */     //   6977: lcmp
/*      */     //   6978: ifeq -> 6985
/*      */     //   6981: iconst_1
/*      */     //   6982: goto -> 6986
/*      */     //   6985: iconst_0
/*      */     //   6986: iand
/*      */     //   6987: iload_1
/*      */     //   6988: ifne -> 7019
/*      */     //   6991: aload_2
/*      */     //   6992: ldc_w 'OpenGL30'
/*      */     //   6995: invokeinterface contains : (Ljava/lang/Object;)Z
/*      */     //   7000: ifeq -> 7019
/*      */     //   7003: aload_0
/*      */     //   7004: ldc_w 'glVertexArraySecondaryColorOffsetEXT'
/*      */     //   7007: invokestatic getFunctionAddress : (Ljava/lang/String;)J
/*      */     //   7010: dup2_x1
/*      */     //   7011: putfield EXT_direct_state_access_glVertexArraySecondaryColorOffsetEXT_pointer : J
/*      */     //   7014: lconst_0
/*      */     //   7015: lcmp
/*      */     //   7016: ifeq -> 7023
/*      */     //   7019: iconst_1
/*      */     //   7020: goto -> 7024
/*      */     //   7023: iconst_0
/*      */     //   7024: iand
/*      */     //   7025: aload_2
/*      */     //   7026: ldc_w 'OpenGL30'
/*      */     //   7029: invokeinterface contains : (Ljava/lang/Object;)Z
/*      */     //   7034: ifeq -> 7053
/*      */     //   7037: aload_0
/*      */     //   7038: ldc_w 'glVertexArrayVertexAttribOffsetEXT'
/*      */     //   7041: invokestatic getFunctionAddress : (Ljava/lang/String;)J
/*      */     //   7044: dup2_x1
/*      */     //   7045: putfield EXT_direct_state_access_glVertexArrayVertexAttribOffsetEXT_pointer : J
/*      */     //   7048: lconst_0
/*      */     //   7049: lcmp
/*      */     //   7050: ifeq -> 7057
/*      */     //   7053: iconst_1
/*      */     //   7054: goto -> 7058
/*      */     //   7057: iconst_0
/*      */     //   7058: iand
/*      */     //   7059: aload_2
/*      */     //   7060: ldc_w 'OpenGL30'
/*      */     //   7063: invokeinterface contains : (Ljava/lang/Object;)Z
/*      */     //   7068: ifeq -> 7087
/*      */     //   7071: aload_0
/*      */     //   7072: ldc_w 'glVertexArrayVertexAttribIOffsetEXT'
/*      */     //   7075: invokestatic getFunctionAddress : (Ljava/lang/String;)J
/*      */     //   7078: dup2_x1
/*      */     //   7079: putfield EXT_direct_state_access_glVertexArrayVertexAttribIOffsetEXT_pointer : J
/*      */     //   7082: lconst_0
/*      */     //   7083: lcmp
/*      */     //   7084: ifeq -> 7091
/*      */     //   7087: iconst_1
/*      */     //   7088: goto -> 7092
/*      */     //   7091: iconst_0
/*      */     //   7092: iand
/*      */     //   7093: aload_2
/*      */     //   7094: ldc_w 'OpenGL30'
/*      */     //   7097: invokeinterface contains : (Ljava/lang/Object;)Z
/*      */     //   7102: ifeq -> 7121
/*      */     //   7105: aload_0
/*      */     //   7106: ldc_w 'glEnableVertexArrayEXT'
/*      */     //   7109: invokestatic getFunctionAddress : (Ljava/lang/String;)J
/*      */     //   7112: dup2_x1
/*      */     //   7113: putfield EXT_direct_state_access_glEnableVertexArrayEXT_pointer : J
/*      */     //   7116: lconst_0
/*      */     //   7117: lcmp
/*      */     //   7118: ifeq -> 7125
/*      */     //   7121: iconst_1
/*      */     //   7122: goto -> 7126
/*      */     //   7125: iconst_0
/*      */     //   7126: iand
/*      */     //   7127: aload_2
/*      */     //   7128: ldc_w 'OpenGL30'
/*      */     //   7131: invokeinterface contains : (Ljava/lang/Object;)Z
/*      */     //   7136: ifeq -> 7155
/*      */     //   7139: aload_0
/*      */     //   7140: ldc_w 'glDisableVertexArrayEXT'
/*      */     //   7143: invokestatic getFunctionAddress : (Ljava/lang/String;)J
/*      */     //   7146: dup2_x1
/*      */     //   7147: putfield EXT_direct_state_access_glDisableVertexArrayEXT_pointer : J
/*      */     //   7150: lconst_0
/*      */     //   7151: lcmp
/*      */     //   7152: ifeq -> 7159
/*      */     //   7155: iconst_1
/*      */     //   7156: goto -> 7160
/*      */     //   7159: iconst_0
/*      */     //   7160: iand
/*      */     //   7161: aload_2
/*      */     //   7162: ldc_w 'OpenGL30'
/*      */     //   7165: invokeinterface contains : (Ljava/lang/Object;)Z
/*      */     //   7170: ifeq -> 7189
/*      */     //   7173: aload_0
/*      */     //   7174: ldc_w 'glEnableVertexArrayAttribEXT'
/*      */     //   7177: invokestatic getFunctionAddress : (Ljava/lang/String;)J
/*      */     //   7180: dup2_x1
/*      */     //   7181: putfield EXT_direct_state_access_glEnableVertexArrayAttribEXT_pointer : J
/*      */     //   7184: lconst_0
/*      */     //   7185: lcmp
/*      */     //   7186: ifeq -> 7193
/*      */     //   7189: iconst_1
/*      */     //   7190: goto -> 7194
/*      */     //   7193: iconst_0
/*      */     //   7194: iand
/*      */     //   7195: aload_2
/*      */     //   7196: ldc_w 'OpenGL30'
/*      */     //   7199: invokeinterface contains : (Ljava/lang/Object;)Z
/*      */     //   7204: ifeq -> 7223
/*      */     //   7207: aload_0
/*      */     //   7208: ldc_w 'glDisableVertexArrayAttribEXT'
/*      */     //   7211: invokestatic getFunctionAddress : (Ljava/lang/String;)J
/*      */     //   7214: dup2_x1
/*      */     //   7215: putfield EXT_direct_state_access_glDisableVertexArrayAttribEXT_pointer : J
/*      */     //   7218: lconst_0
/*      */     //   7219: lcmp
/*      */     //   7220: ifeq -> 7227
/*      */     //   7223: iconst_1
/*      */     //   7224: goto -> 7228
/*      */     //   7227: iconst_0
/*      */     //   7228: iand
/*      */     //   7229: aload_2
/*      */     //   7230: ldc_w 'OpenGL30'
/*      */     //   7233: invokeinterface contains : (Ljava/lang/Object;)Z
/*      */     //   7238: ifeq -> 7257
/*      */     //   7241: aload_0
/*      */     //   7242: ldc_w 'glGetVertexArrayIntegervEXT'
/*      */     //   7245: invokestatic getFunctionAddress : (Ljava/lang/String;)J
/*      */     //   7248: dup2_x1
/*      */     //   7249: putfield EXT_direct_state_access_glGetVertexArrayIntegervEXT_pointer : J
/*      */     //   7252: lconst_0
/*      */     //   7253: lcmp
/*      */     //   7254: ifeq -> 7261
/*      */     //   7257: iconst_1
/*      */     //   7258: goto -> 7262
/*      */     //   7261: iconst_0
/*      */     //   7262: iand
/*      */     //   7263: aload_2
/*      */     //   7264: ldc_w 'OpenGL30'
/*      */     //   7267: invokeinterface contains : (Ljava/lang/Object;)Z
/*      */     //   7272: ifeq -> 7291
/*      */     //   7275: aload_0
/*      */     //   7276: ldc_w 'glGetVertexArrayPointervEXT'
/*      */     //   7279: invokestatic getFunctionAddress : (Ljava/lang/String;)J
/*      */     //   7282: dup2_x1
/*      */     //   7283: putfield EXT_direct_state_access_glGetVertexArrayPointervEXT_pointer : J
/*      */     //   7286: lconst_0
/*      */     //   7287: lcmp
/*      */     //   7288: ifeq -> 7295
/*      */     //   7291: iconst_1
/*      */     //   7292: goto -> 7296
/*      */     //   7295: iconst_0
/*      */     //   7296: iand
/*      */     //   7297: aload_2
/*      */     //   7298: ldc_w 'OpenGL30'
/*      */     //   7301: invokeinterface contains : (Ljava/lang/Object;)Z
/*      */     //   7306: ifeq -> 7325
/*      */     //   7309: aload_0
/*      */     //   7310: ldc_w 'glGetVertexArrayIntegeri_vEXT'
/*      */     //   7313: invokestatic getFunctionAddress : (Ljava/lang/String;)J
/*      */     //   7316: dup2_x1
/*      */     //   7317: putfield EXT_direct_state_access_glGetVertexArrayIntegeri_vEXT_pointer : J
/*      */     //   7320: lconst_0
/*      */     //   7321: lcmp
/*      */     //   7322: ifeq -> 7329
/*      */     //   7325: iconst_1
/*      */     //   7326: goto -> 7330
/*      */     //   7329: iconst_0
/*      */     //   7330: iand
/*      */     //   7331: aload_2
/*      */     //   7332: ldc_w 'OpenGL30'
/*      */     //   7335: invokeinterface contains : (Ljava/lang/Object;)Z
/*      */     //   7340: ifeq -> 7359
/*      */     //   7343: aload_0
/*      */     //   7344: ldc_w 'glGetVertexArrayPointeri_vEXT'
/*      */     //   7347: invokestatic getFunctionAddress : (Ljava/lang/String;)J
/*      */     //   7350: dup2_x1
/*      */     //   7351: putfield EXT_direct_state_access_glGetVertexArrayPointeri_vEXT_pointer : J
/*      */     //   7354: lconst_0
/*      */     //   7355: lcmp
/*      */     //   7356: ifeq -> 7363
/*      */     //   7359: iconst_1
/*      */     //   7360: goto -> 7364
/*      */     //   7363: iconst_0
/*      */     //   7364: iand
/*      */     //   7365: aload_2
/*      */     //   7366: ldc_w 'OpenGL30'
/*      */     //   7369: invokeinterface contains : (Ljava/lang/Object;)Z
/*      */     //   7374: ifeq -> 7393
/*      */     //   7377: aload_0
/*      */     //   7378: ldc_w 'glMapNamedBufferRangeEXT'
/*      */     //   7381: invokestatic getFunctionAddress : (Ljava/lang/String;)J
/*      */     //   7384: dup2_x1
/*      */     //   7385: putfield EXT_direct_state_access_glMapNamedBufferRangeEXT_pointer : J
/*      */     //   7388: lconst_0
/*      */     //   7389: lcmp
/*      */     //   7390: ifeq -> 7397
/*      */     //   7393: iconst_1
/*      */     //   7394: goto -> 7398
/*      */     //   7397: iconst_0
/*      */     //   7398: iand
/*      */     //   7399: aload_2
/*      */     //   7400: ldc_w 'OpenGL30'
/*      */     //   7403: invokeinterface contains : (Ljava/lang/Object;)Z
/*      */     //   7408: ifeq -> 7427
/*      */     //   7411: aload_0
/*      */     //   7412: ldc_w 'glFlushMappedNamedBufferRangeEXT'
/*      */     //   7415: invokestatic getFunctionAddress : (Ljava/lang/String;)J
/*      */     //   7418: dup2_x1
/*      */     //   7419: putfield EXT_direct_state_access_glFlushMappedNamedBufferRangeEXT_pointer : J
/*      */     //   7422: lconst_0
/*      */     //   7423: lcmp
/*      */     //   7424: ifeq -> 7431
/*      */     //   7427: iconst_1
/*      */     //   7428: goto -> 7432
/*      */     //   7431: iconst_0
/*      */     //   7432: iand
/*      */     //   7433: ireturn
/*      */     // Line number table:
/*      */     //   Java source line number -> byte code offset
/*      */     //   #2836	-> 0
/*      */     // Local variable table:
/*      */     //   start	length	slot	name	descriptor
/*      */     //   0	7434	0	this	Lorg/lwjgl/opengl/ContextCapabilities;
/*      */     //   0	7434	1	forwardCompatible	Z
/*      */     //   0	7434	2	supported_extensions	Ljava/util/Set;
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
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private boolean EXT_draw_buffers2_initNativeFunctionAddresses() {
/* 3059 */     return (((this.EXT_draw_buffers2_glColorMaskIndexedEXT_pointer = GLContext.getFunctionAddress("glColorMaskIndexedEXT")) != 0L)) & (((this.EXT_draw_buffers2_glGetBooleanIndexedvEXT_pointer = GLContext.getFunctionAddress("glGetBooleanIndexedvEXT")) != 0L)) & (((this.EXT_draw_buffers2_glGetIntegerIndexedvEXT_pointer = GLContext.getFunctionAddress("glGetIntegerIndexedvEXT")) != 0L) ? 1 : 0) & (((this.EXT_draw_buffers2_glEnableIndexedEXT_pointer = GLContext.getFunctionAddress("glEnableIndexedEXT")) != 0L) ? 1 : 0) & (((this.EXT_draw_buffers2_glDisableIndexedEXT_pointer = GLContext.getFunctionAddress("glDisableIndexedEXT")) != 0L) ? 1 : 0) & (((this.EXT_draw_buffers2_glIsEnabledIndexedEXT_pointer = GLContext.getFunctionAddress("glIsEnabledIndexedEXT")) != 0L) ? 1 : 0);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private boolean EXT_draw_instanced_initNativeFunctionAddresses() {
/* 3069 */     return (((this.EXT_draw_instanced_glDrawArraysInstancedEXT_pointer = GLContext.getFunctionAddress("glDrawArraysInstancedEXT")) != 0L)) & (((this.EXT_draw_instanced_glDrawElementsInstancedEXT_pointer = GLContext.getFunctionAddress("glDrawElementsInstancedEXT")) != 0L));
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   private boolean EXT_draw_range_elements_initNativeFunctionAddresses() {
/* 3075 */     return ((this.EXT_draw_range_elements_glDrawRangeElementsEXT_pointer = GLContext.getFunctionAddress("glDrawRangeElementsEXT")) != 0L);
/*      */   }
/*      */ 
/*      */   
/*      */   private boolean EXT_fog_coord_initNativeFunctionAddresses() {
/* 3080 */     return (((this.EXT_fog_coord_glFogCoordfEXT_pointer = GLContext.getFunctionAddress("glFogCoordfEXT")) != 0L)) & (((this.EXT_fog_coord_glFogCoorddEXT_pointer = GLContext.getFunctionAddress("glFogCoorddEXT")) != 0L)) & (((this.EXT_fog_coord_glFogCoordPointerEXT_pointer = GLContext.getFunctionAddress("glFogCoordPointerEXT")) != 0L) ? 1 : 0);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private boolean EXT_framebuffer_blit_initNativeFunctionAddresses() {
/* 3087 */     return ((this.EXT_framebuffer_blit_glBlitFramebufferEXT_pointer = GLContext.getFunctionAddress("glBlitFramebufferEXT")) != 0L);
/*      */   }
/*      */ 
/*      */   
/*      */   private boolean EXT_framebuffer_multisample_initNativeFunctionAddresses() {
/* 3092 */     return ((this.EXT_framebuffer_multisample_glRenderbufferStorageMultisampleEXT_pointer = GLContext.getFunctionAddress("glRenderbufferStorageMultisampleEXT")) != 0L);
/*      */   }
/*      */ 
/*      */   
/*      */   private boolean EXT_framebuffer_object_initNativeFunctionAddresses() {
/* 3097 */     return (((this.EXT_framebuffer_object_glIsRenderbufferEXT_pointer = GLContext.getFunctionAddress("glIsRenderbufferEXT")) != 0L)) & (((this.EXT_framebuffer_object_glBindRenderbufferEXT_pointer = GLContext.getFunctionAddress("glBindRenderbufferEXT")) != 0L)) & (((this.EXT_framebuffer_object_glDeleteRenderbuffersEXT_pointer = GLContext.getFunctionAddress("glDeleteRenderbuffersEXT")) != 0L) ? 1 : 0) & (((this.EXT_framebuffer_object_glGenRenderbuffersEXT_pointer = GLContext.getFunctionAddress("glGenRenderbuffersEXT")) != 0L) ? 1 : 0) & (((this.EXT_framebuffer_object_glRenderbufferStorageEXT_pointer = GLContext.getFunctionAddress("glRenderbufferStorageEXT")) != 0L) ? 1 : 0) & (((this.EXT_framebuffer_object_glGetRenderbufferParameterivEXT_pointer = GLContext.getFunctionAddress("glGetRenderbufferParameterivEXT")) != 0L) ? 1 : 0) & (((this.EXT_framebuffer_object_glIsFramebufferEXT_pointer = GLContext.getFunctionAddress("glIsFramebufferEXT")) != 0L) ? 1 : 0) & (((this.EXT_framebuffer_object_glBindFramebufferEXT_pointer = GLContext.getFunctionAddress("glBindFramebufferEXT")) != 0L) ? 1 : 0) & (((this.EXT_framebuffer_object_glDeleteFramebuffersEXT_pointer = GLContext.getFunctionAddress("glDeleteFramebuffersEXT")) != 0L) ? 1 : 0) & (((this.EXT_framebuffer_object_glGenFramebuffersEXT_pointer = GLContext.getFunctionAddress("glGenFramebuffersEXT")) != 0L) ? 1 : 0) & (((this.EXT_framebuffer_object_glCheckFramebufferStatusEXT_pointer = GLContext.getFunctionAddress("glCheckFramebufferStatusEXT")) != 0L) ? 1 : 0) & (((this.EXT_framebuffer_object_glFramebufferTexture1DEXT_pointer = GLContext.getFunctionAddress("glFramebufferTexture1DEXT")) != 0L) ? 1 : 0) & (((this.EXT_framebuffer_object_glFramebufferTexture2DEXT_pointer = GLContext.getFunctionAddress("glFramebufferTexture2DEXT")) != 0L) ? 1 : 0) & (((this.EXT_framebuffer_object_glFramebufferTexture3DEXT_pointer = GLContext.getFunctionAddress("glFramebufferTexture3DEXT")) != 0L) ? 1 : 0) & (((this.EXT_framebuffer_object_glFramebufferRenderbufferEXT_pointer = GLContext.getFunctionAddress("glFramebufferRenderbufferEXT")) != 0L) ? 1 : 0) & (((this.EXT_framebuffer_object_glGetFramebufferAttachmentParameterivEXT_pointer = GLContext.getFunctionAddress("glGetFramebufferAttachmentParameterivEXT")) != 0L) ? 1 : 0) & (((this.EXT_framebuffer_object_glGenerateMipmapEXT_pointer = GLContext.getFunctionAddress("glGenerateMipmapEXT")) != 0L) ? 1 : 0);
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
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private boolean EXT_geometry_shader4_initNativeFunctionAddresses() {
/* 3118 */     return (((this.EXT_geometry_shader4_glProgramParameteriEXT_pointer = GLContext.getFunctionAddress("glProgramParameteriEXT")) != 0L)) & (((this.EXT_geometry_shader4_glFramebufferTextureEXT_pointer = GLContext.getFunctionAddress("glFramebufferTextureEXT")) != 0L)) & (((this.EXT_geometry_shader4_glFramebufferTextureLayerEXT_pointer = GLContext.getFunctionAddress("glFramebufferTextureLayerEXT")) != 0L) ? 1 : 0) & (((this.EXT_geometry_shader4_glFramebufferTextureFaceEXT_pointer = GLContext.getFunctionAddress("glFramebufferTextureFaceEXT")) != 0L) ? 1 : 0);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private boolean EXT_gpu_program_parameters_initNativeFunctionAddresses() {
/* 3126 */     return (((this.EXT_gpu_program_parameters_glProgramEnvParameters4fvEXT_pointer = GLContext.getFunctionAddress("glProgramEnvParameters4fvEXT")) != 0L)) & (((this.EXT_gpu_program_parameters_glProgramLocalParameters4fvEXT_pointer = GLContext.getFunctionAddress("glProgramLocalParameters4fvEXT")) != 0L));
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   private boolean EXT_gpu_shader4_initNativeFunctionAddresses() {
/* 3132 */     return (((this.EXT_gpu_shader4_glVertexAttribI1iEXT_pointer = GLContext.getFunctionAddress("glVertexAttribI1iEXT")) != 0L)) & (((this.EXT_gpu_shader4_glVertexAttribI2iEXT_pointer = GLContext.getFunctionAddress("glVertexAttribI2iEXT")) != 0L)) & (((this.EXT_gpu_shader4_glVertexAttribI3iEXT_pointer = GLContext.getFunctionAddress("glVertexAttribI3iEXT")) != 0L) ? 1 : 0) & (((this.EXT_gpu_shader4_glVertexAttribI4iEXT_pointer = GLContext.getFunctionAddress("glVertexAttribI4iEXT")) != 0L) ? 1 : 0) & (((this.EXT_gpu_shader4_glVertexAttribI1uiEXT_pointer = GLContext.getFunctionAddress("glVertexAttribI1uiEXT")) != 0L) ? 1 : 0) & (((this.EXT_gpu_shader4_glVertexAttribI2uiEXT_pointer = GLContext.getFunctionAddress("glVertexAttribI2uiEXT")) != 0L) ? 1 : 0) & (((this.EXT_gpu_shader4_glVertexAttribI3uiEXT_pointer = GLContext.getFunctionAddress("glVertexAttribI3uiEXT")) != 0L) ? 1 : 0) & (((this.EXT_gpu_shader4_glVertexAttribI4uiEXT_pointer = GLContext.getFunctionAddress("glVertexAttribI4uiEXT")) != 0L) ? 1 : 0) & (((this.EXT_gpu_shader4_glVertexAttribI1ivEXT_pointer = GLContext.getFunctionAddress("glVertexAttribI1ivEXT")) != 0L) ? 1 : 0) & (((this.EXT_gpu_shader4_glVertexAttribI2ivEXT_pointer = GLContext.getFunctionAddress("glVertexAttribI2ivEXT")) != 0L) ? 1 : 0) & (((this.EXT_gpu_shader4_glVertexAttribI3ivEXT_pointer = GLContext.getFunctionAddress("glVertexAttribI3ivEXT")) != 0L) ? 1 : 0) & (((this.EXT_gpu_shader4_glVertexAttribI4ivEXT_pointer = GLContext.getFunctionAddress("glVertexAttribI4ivEXT")) != 0L) ? 1 : 0) & (((this.EXT_gpu_shader4_glVertexAttribI1uivEXT_pointer = GLContext.getFunctionAddress("glVertexAttribI1uivEXT")) != 0L) ? 1 : 0) & (((this.EXT_gpu_shader4_glVertexAttribI2uivEXT_pointer = GLContext.getFunctionAddress("glVertexAttribI2uivEXT")) != 0L) ? 1 : 0) & (((this.EXT_gpu_shader4_glVertexAttribI3uivEXT_pointer = GLContext.getFunctionAddress("glVertexAttribI3uivEXT")) != 0L) ? 1 : 0) & (((this.EXT_gpu_shader4_glVertexAttribI4uivEXT_pointer = GLContext.getFunctionAddress("glVertexAttribI4uivEXT")) != 0L) ? 1 : 0) & (((this.EXT_gpu_shader4_glVertexAttribI4bvEXT_pointer = GLContext.getFunctionAddress("glVertexAttribI4bvEXT")) != 0L) ? 1 : 0) & (((this.EXT_gpu_shader4_glVertexAttribI4svEXT_pointer = GLContext.getFunctionAddress("glVertexAttribI4svEXT")) != 0L) ? 1 : 0) & (((this.EXT_gpu_shader4_glVertexAttribI4ubvEXT_pointer = GLContext.getFunctionAddress("glVertexAttribI4ubvEXT")) != 0L) ? 1 : 0) & (((this.EXT_gpu_shader4_glVertexAttribI4usvEXT_pointer = GLContext.getFunctionAddress("glVertexAttribI4usvEXT")) != 0L) ? 1 : 0) & (((this.EXT_gpu_shader4_glVertexAttribIPointerEXT_pointer = GLContext.getFunctionAddress("glVertexAttribIPointerEXT")) != 0L) ? 1 : 0) & (((this.EXT_gpu_shader4_glGetVertexAttribIivEXT_pointer = GLContext.getFunctionAddress("glGetVertexAttribIivEXT")) != 0L) ? 1 : 0) & (((this.EXT_gpu_shader4_glGetVertexAttribIuivEXT_pointer = GLContext.getFunctionAddress("glGetVertexAttribIuivEXT")) != 0L) ? 1 : 0) & (((this.EXT_gpu_shader4_glUniform1uiEXT_pointer = GLContext.getFunctionAddress("glUniform1uiEXT")) != 0L) ? 1 : 0) & (((this.EXT_gpu_shader4_glUniform2uiEXT_pointer = GLContext.getFunctionAddress("glUniform2uiEXT")) != 0L) ? 1 : 0) & (((this.EXT_gpu_shader4_glUniform3uiEXT_pointer = GLContext.getFunctionAddress("glUniform3uiEXT")) != 0L) ? 1 : 0) & (((this.EXT_gpu_shader4_glUniform4uiEXT_pointer = GLContext.getFunctionAddress("glUniform4uiEXT")) != 0L) ? 1 : 0) & (((this.EXT_gpu_shader4_glUniform1uivEXT_pointer = GLContext.getFunctionAddress("glUniform1uivEXT")) != 0L) ? 1 : 0) & (((this.EXT_gpu_shader4_glUniform2uivEXT_pointer = GLContext.getFunctionAddress("glUniform2uivEXT")) != 0L) ? 1 : 0) & (((this.EXT_gpu_shader4_glUniform3uivEXT_pointer = GLContext.getFunctionAddress("glUniform3uivEXT")) != 0L) ? 1 : 0) & (((this.EXT_gpu_shader4_glUniform4uivEXT_pointer = GLContext.getFunctionAddress("glUniform4uivEXT")) != 0L) ? 1 : 0) & (((this.EXT_gpu_shader4_glGetUniformuivEXT_pointer = GLContext.getFunctionAddress("glGetUniformuivEXT")) != 0L) ? 1 : 0) & (((this.EXT_gpu_shader4_glBindFragDataLocationEXT_pointer = GLContext.getFunctionAddress("glBindFragDataLocationEXT")) != 0L) ? 1 : 0) & (((this.EXT_gpu_shader4_glGetFragDataLocationEXT_pointer = GLContext.getFunctionAddress("glGetFragDataLocationEXT")) != 0L) ? 1 : 0);
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
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private boolean EXT_multi_draw_arrays_initNativeFunctionAddresses() {
/* 3170 */     return ((this.EXT_multi_draw_arrays_glMultiDrawArraysEXT_pointer = GLContext.getFunctionAddress("glMultiDrawArraysEXT")) != 0L);
/*      */   }
/*      */ 
/*      */   
/*      */   private boolean EXT_paletted_texture_initNativeFunctionAddresses() {
/* 3175 */     return (((this.EXT_paletted_texture_glColorTableEXT_pointer = GLContext.getFunctionAddress("glColorTableEXT")) != 0L)) & (((this.EXT_paletted_texture_glColorSubTableEXT_pointer = GLContext.getFunctionAddress("glColorSubTableEXT")) != 0L)) & (((this.EXT_paletted_texture_glGetColorTableEXT_pointer = GLContext.getFunctionAddress("glGetColorTableEXT")) != 0L) ? 1 : 0) & (((this.EXT_paletted_texture_glGetColorTableParameterivEXT_pointer = GLContext.getFunctionAddress("glGetColorTableParameterivEXT")) != 0L) ? 1 : 0) & (((this.EXT_paletted_texture_glGetColorTableParameterfvEXT_pointer = GLContext.getFunctionAddress("glGetColorTableParameterfvEXT")) != 0L) ? 1 : 0);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private boolean EXT_point_parameters_initNativeFunctionAddresses() {
/* 3184 */     return (((this.EXT_point_parameters_glPointParameterfEXT_pointer = GLContext.getFunctionAddress("glPointParameterfEXT")) != 0L)) & (((this.EXT_point_parameters_glPointParameterfvEXT_pointer = GLContext.getFunctionAddress("glPointParameterfvEXT")) != 0L));
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   private boolean EXT_provoking_vertex_initNativeFunctionAddresses() {
/* 3190 */     return ((this.EXT_provoking_vertex_glProvokingVertexEXT_pointer = GLContext.getFunctionAddress("glProvokingVertexEXT")) != 0L);
/*      */   }
/*      */ 
/*      */   
/*      */   private boolean EXT_secondary_color_initNativeFunctionAddresses() {
/* 3195 */     return (((this.EXT_secondary_color_glSecondaryColor3bEXT_pointer = GLContext.getFunctionAddress("glSecondaryColor3bEXT")) != 0L)) & (((this.EXT_secondary_color_glSecondaryColor3fEXT_pointer = GLContext.getFunctionAddress("glSecondaryColor3fEXT")) != 0L)) & (((this.EXT_secondary_color_glSecondaryColor3dEXT_pointer = GLContext.getFunctionAddress("glSecondaryColor3dEXT")) != 0L) ? 1 : 0) & (((this.EXT_secondary_color_glSecondaryColor3ubEXT_pointer = GLContext.getFunctionAddress("glSecondaryColor3ubEXT")) != 0L) ? 1 : 0) & (((this.EXT_secondary_color_glSecondaryColorPointerEXT_pointer = GLContext.getFunctionAddress("glSecondaryColorPointerEXT")) != 0L) ? 1 : 0);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private boolean EXT_separate_shader_objects_initNativeFunctionAddresses() {
/* 3204 */     return (((this.EXT_separate_shader_objects_glUseShaderProgramEXT_pointer = GLContext.getFunctionAddress("glUseShaderProgramEXT")) != 0L)) & (((this.EXT_separate_shader_objects_glActiveProgramEXT_pointer = GLContext.getFunctionAddress("glActiveProgramEXT")) != 0L)) & (((this.EXT_separate_shader_objects_glCreateShaderProgramEXT_pointer = GLContext.getFunctionAddress("glCreateShaderProgramEXT")) != 0L) ? 1 : 0);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private boolean EXT_shader_image_load_store_initNativeFunctionAddresses() {
/* 3211 */     return (((this.EXT_shader_image_load_store_glBindImageTextureEXT_pointer = GLContext.getFunctionAddress("glBindImageTextureEXT")) != 0L)) & (((this.EXT_shader_image_load_store_glMemoryBarrierEXT_pointer = GLContext.getFunctionAddress("glMemoryBarrierEXT")) != 0L));
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   private boolean EXT_stencil_clear_tag_initNativeFunctionAddresses() {
/* 3217 */     return ((this.EXT_stencil_clear_tag_glStencilClearTagEXT_pointer = GLContext.getFunctionAddress("glStencilClearTagEXT")) != 0L);
/*      */   }
/*      */ 
/*      */   
/*      */   private boolean EXT_stencil_two_side_initNativeFunctionAddresses() {
/* 3222 */     return ((this.EXT_stencil_two_side_glActiveStencilFaceEXT_pointer = GLContext.getFunctionAddress("glActiveStencilFaceEXT")) != 0L);
/*      */   }
/*      */ 
/*      */   
/*      */   private boolean EXT_texture_array_initNativeFunctionAddresses() {
/* 3227 */     return ((this.EXT_texture_array_glFramebufferTextureLayerEXT_pointer = GLContext.getFunctionAddress("glFramebufferTextureLayerEXT")) != 0L);
/*      */   }
/*      */ 
/*      */   
/*      */   private boolean EXT_texture_buffer_object_initNativeFunctionAddresses() {
/* 3232 */     return ((this.EXT_texture_buffer_object_glTexBufferEXT_pointer = GLContext.getFunctionAddress("glTexBufferEXT")) != 0L);
/*      */   }
/*      */ 
/*      */   
/*      */   private boolean EXT_texture_integer_initNativeFunctionAddresses() {
/* 3237 */     return (((this.EXT_texture_integer_glClearColorIiEXT_pointer = GLContext.getFunctionAddress("glClearColorIiEXT")) != 0L)) & (((this.EXT_texture_integer_glClearColorIuiEXT_pointer = GLContext.getFunctionAddress("glClearColorIuiEXT")) != 0L)) & (((this.EXT_texture_integer_glTexParameterIivEXT_pointer = GLContext.getFunctionAddress("glTexParameterIivEXT")) != 0L) ? 1 : 0) & (((this.EXT_texture_integer_glTexParameterIuivEXT_pointer = GLContext.getFunctionAddress("glTexParameterIuivEXT")) != 0L) ? 1 : 0) & (((this.EXT_texture_integer_glGetTexParameterIivEXT_pointer = GLContext.getFunctionAddress("glGetTexParameterIivEXT")) != 0L) ? 1 : 0) & (((this.EXT_texture_integer_glGetTexParameterIuivEXT_pointer = GLContext.getFunctionAddress("glGetTexParameterIuivEXT")) != 0L) ? 1 : 0);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private boolean EXT_timer_query_initNativeFunctionAddresses() {
/* 3247 */     return (((this.EXT_timer_query_glGetQueryObjecti64vEXT_pointer = GLContext.getFunctionAddress("glGetQueryObjecti64vEXT")) != 0L)) & (((this.EXT_timer_query_glGetQueryObjectui64vEXT_pointer = GLContext.getFunctionAddress("glGetQueryObjectui64vEXT")) != 0L));
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   private boolean EXT_transform_feedback_initNativeFunctionAddresses() {
/* 3253 */     return (((this.EXT_transform_feedback_glBindBufferRangeEXT_pointer = GLContext.getFunctionAddress("glBindBufferRangeEXT")) != 0L)) & (((this.EXT_transform_feedback_glBindBufferOffsetEXT_pointer = GLContext.getFunctionAddress("glBindBufferOffsetEXT")) != 0L)) & (((this.EXT_transform_feedback_glBindBufferBaseEXT_pointer = GLContext.getFunctionAddress("glBindBufferBaseEXT")) != 0L) ? 1 : 0) & (((this.EXT_transform_feedback_glBeginTransformFeedbackEXT_pointer = GLContext.getFunctionAddress("glBeginTransformFeedbackEXT")) != 0L) ? 1 : 0) & (((this.EXT_transform_feedback_glEndTransformFeedbackEXT_pointer = GLContext.getFunctionAddress("glEndTransformFeedbackEXT")) != 0L) ? 1 : 0) & (((this.EXT_transform_feedback_glTransformFeedbackVaryingsEXT_pointer = GLContext.getFunctionAddress("glTransformFeedbackVaryingsEXT")) != 0L) ? 1 : 0) & (((this.EXT_transform_feedback_glGetTransformFeedbackVaryingEXT_pointer = GLContext.getFunctionAddress("glGetTransformFeedbackVaryingEXT")) != 0L) ? 1 : 0);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private boolean EXT_vertex_attrib_64bit_initNativeFunctionAddresses(Set supported_extensions) {
/* 3264 */     return (((this.EXT_vertex_attrib_64bit_glVertexAttribL1dEXT_pointer = GLContext.getFunctionAddress("glVertexAttribL1dEXT")) != 0L)) & (((this.EXT_vertex_attrib_64bit_glVertexAttribL2dEXT_pointer = GLContext.getFunctionAddress("glVertexAttribL2dEXT")) != 0L)) & (((this.EXT_vertex_attrib_64bit_glVertexAttribL3dEXT_pointer = GLContext.getFunctionAddress("glVertexAttribL3dEXT")) != 0L) ? 1 : 0) & (((this.EXT_vertex_attrib_64bit_glVertexAttribL4dEXT_pointer = GLContext.getFunctionAddress("glVertexAttribL4dEXT")) != 0L) ? 1 : 0) & (((this.EXT_vertex_attrib_64bit_glVertexAttribL1dvEXT_pointer = GLContext.getFunctionAddress("glVertexAttribL1dvEXT")) != 0L) ? 1 : 0) & (((this.EXT_vertex_attrib_64bit_glVertexAttribL2dvEXT_pointer = GLContext.getFunctionAddress("glVertexAttribL2dvEXT")) != 0L) ? 1 : 0) & (((this.EXT_vertex_attrib_64bit_glVertexAttribL3dvEXT_pointer = GLContext.getFunctionAddress("glVertexAttribL3dvEXT")) != 0L) ? 1 : 0) & (((this.EXT_vertex_attrib_64bit_glVertexAttribL4dvEXT_pointer = GLContext.getFunctionAddress("glVertexAttribL4dvEXT")) != 0L) ? 1 : 0) & (((this.EXT_vertex_attrib_64bit_glVertexAttribLPointerEXT_pointer = GLContext.getFunctionAddress("glVertexAttribLPointerEXT")) != 0L) ? 1 : 0) & (((this.EXT_vertex_attrib_64bit_glGetVertexAttribLdvEXT_pointer = GLContext.getFunctionAddress("glGetVertexAttribLdvEXT")) != 0L) ? 1 : 0) & ((!supported_extensions.contains("EXT_direct_state_access") || (this.EXT_vertex_attrib_64bit_glVertexArrayVertexAttribLOffsetEXT_pointer = GLContext.getFunctionAddress("glVertexArrayVertexAttribLOffsetEXT")) != 0L) ? 1 : 0);
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
/*      */ 
/*      */ 
/*      */   
/*      */   private boolean EXT_vertex_shader_initNativeFunctionAddresses() {
/* 3279 */     return (((this.EXT_vertex_shader_glBeginVertexShaderEXT_pointer = GLContext.getFunctionAddress("glBeginVertexShaderEXT")) != 0L)) & (((this.EXT_vertex_shader_glEndVertexShaderEXT_pointer = GLContext.getFunctionAddress("glEndVertexShaderEXT")) != 0L)) & (((this.EXT_vertex_shader_glBindVertexShaderEXT_pointer = GLContext.getFunctionAddress("glBindVertexShaderEXT")) != 0L) ? 1 : 0) & (((this.EXT_vertex_shader_glGenVertexShadersEXT_pointer = GLContext.getFunctionAddress("glGenVertexShadersEXT")) != 0L) ? 1 : 0) & (((this.EXT_vertex_shader_glDeleteVertexShaderEXT_pointer = GLContext.getFunctionAddress("glDeleteVertexShaderEXT")) != 0L) ? 1 : 0) & (((this.EXT_vertex_shader_glShaderOp1EXT_pointer = GLContext.getFunctionAddress("glShaderOp1EXT")) != 0L) ? 1 : 0) & (((this.EXT_vertex_shader_glShaderOp2EXT_pointer = GLContext.getFunctionAddress("glShaderOp2EXT")) != 0L) ? 1 : 0) & (((this.EXT_vertex_shader_glShaderOp3EXT_pointer = GLContext.getFunctionAddress("glShaderOp3EXT")) != 0L) ? 1 : 0) & (((this.EXT_vertex_shader_glSwizzleEXT_pointer = GLContext.getFunctionAddress("glSwizzleEXT")) != 0L) ? 1 : 0) & (((this.EXT_vertex_shader_glWriteMaskEXT_pointer = GLContext.getFunctionAddress("glWriteMaskEXT")) != 0L) ? 1 : 0) & (((this.EXT_vertex_shader_glInsertComponentEXT_pointer = GLContext.getFunctionAddress("glInsertComponentEXT")) != 0L) ? 1 : 0) & (((this.EXT_vertex_shader_glExtractComponentEXT_pointer = GLContext.getFunctionAddress("glExtractComponentEXT")) != 0L) ? 1 : 0) & (((this.EXT_vertex_shader_glGenSymbolsEXT_pointer = GLContext.getFunctionAddress("glGenSymbolsEXT")) != 0L) ? 1 : 0) & (((this.EXT_vertex_shader_glSetInvariantEXT_pointer = GLContext.getFunctionAddress("glSetInvariantEXT")) != 0L) ? 1 : 0) & (((this.EXT_vertex_shader_glSetLocalConstantEXT_pointer = GLContext.getFunctionAddress("glSetLocalConstantEXT")) != 0L) ? 1 : 0) & (((this.EXT_vertex_shader_glVariantbvEXT_pointer = GLContext.getFunctionAddress("glVariantbvEXT")) != 0L) ? 1 : 0) & (((this.EXT_vertex_shader_glVariantsvEXT_pointer = GLContext.getFunctionAddress("glVariantsvEXT")) != 0L) ? 1 : 0) & (((this.EXT_vertex_shader_glVariantivEXT_pointer = GLContext.getFunctionAddress("glVariantivEXT")) != 0L) ? 1 : 0) & (((this.EXT_vertex_shader_glVariantfvEXT_pointer = GLContext.getFunctionAddress("glVariantfvEXT")) != 0L) ? 1 : 0) & (((this.EXT_vertex_shader_glVariantdvEXT_pointer = GLContext.getFunctionAddress("glVariantdvEXT")) != 0L) ? 1 : 0) & (((this.EXT_vertex_shader_glVariantubvEXT_pointer = GLContext.getFunctionAddress("glVariantubvEXT")) != 0L) ? 1 : 0) & (((this.EXT_vertex_shader_glVariantusvEXT_pointer = GLContext.getFunctionAddress("glVariantusvEXT")) != 0L) ? 1 : 0) & (((this.EXT_vertex_shader_glVariantuivEXT_pointer = GLContext.getFunctionAddress("glVariantuivEXT")) != 0L) ? 1 : 0) & (((this.EXT_vertex_shader_glVariantPointerEXT_pointer = GLContext.getFunctionAddress("glVariantPointerEXT")) != 0L) ? 1 : 0) & (((this.EXT_vertex_shader_glEnableVariantClientStateEXT_pointer = GLContext.getFunctionAddress("glEnableVariantClientStateEXT")) != 0L) ? 1 : 0) & (((this.EXT_vertex_shader_glDisableVariantClientStateEXT_pointer = GLContext.getFunctionAddress("glDisableVariantClientStateEXT")) != 0L) ? 1 : 0) & (((this.EXT_vertex_shader_glBindLightParameterEXT_pointer = GLContext.getFunctionAddress("glBindLightParameterEXT")) != 0L) ? 1 : 0) & (((this.EXT_vertex_shader_glBindMaterialParameterEXT_pointer = GLContext.getFunctionAddress("glBindMaterialParameterEXT")) != 0L) ? 1 : 0) & (((this.EXT_vertex_shader_glBindTexGenParameterEXT_pointer = GLContext.getFunctionAddress("glBindTexGenParameterEXT")) != 0L) ? 1 : 0) & (((this.EXT_vertex_shader_glBindTextureUnitParameterEXT_pointer = GLContext.getFunctionAddress("glBindTextureUnitParameterEXT")) != 0L) ? 1 : 0) & (((this.EXT_vertex_shader_glBindParameterEXT_pointer = GLContext.getFunctionAddress("glBindParameterEXT")) != 0L) ? 1 : 0) & (((this.EXT_vertex_shader_glIsVariantEnabledEXT_pointer = GLContext.getFunctionAddress("glIsVariantEnabledEXT")) != 0L) ? 1 : 0) & (((this.EXT_vertex_shader_glGetVariantBooleanvEXT_pointer = GLContext.getFunctionAddress("glGetVariantBooleanvEXT")) != 0L) ? 1 : 0) & (((this.EXT_vertex_shader_glGetVariantIntegervEXT_pointer = GLContext.getFunctionAddress("glGetVariantIntegervEXT")) != 0L) ? 1 : 0) & (((this.EXT_vertex_shader_glGetVariantFloatvEXT_pointer = GLContext.getFunctionAddress("glGetVariantFloatvEXT")) != 0L) ? 1 : 0) & (((this.EXT_vertex_shader_glGetVariantPointervEXT_pointer = GLContext.getFunctionAddress("glGetVariantPointervEXT")) != 0L) ? 1 : 0) & (((this.EXT_vertex_shader_glGetInvariantBooleanvEXT_pointer = GLContext.getFunctionAddress("glGetInvariantBooleanvEXT")) != 0L) ? 1 : 0) & (((this.EXT_vertex_shader_glGetInvariantIntegervEXT_pointer = GLContext.getFunctionAddress("glGetInvariantIntegervEXT")) != 0L) ? 1 : 0) & (((this.EXT_vertex_shader_glGetInvariantFloatvEXT_pointer = GLContext.getFunctionAddress("glGetInvariantFloatvEXT")) != 0L) ? 1 : 0) & (((this.EXT_vertex_shader_glGetLocalConstantBooleanvEXT_pointer = GLContext.getFunctionAddress("glGetLocalConstantBooleanvEXT")) != 0L) ? 1 : 0) & (((this.EXT_vertex_shader_glGetLocalConstantIntegervEXT_pointer = GLContext.getFunctionAddress("glGetLocalConstantIntegervEXT")) != 0L) ? 1 : 0) & (((this.EXT_vertex_shader_glGetLocalConstantFloatvEXT_pointer = GLContext.getFunctionAddress("glGetLocalConstantFloatvEXT")) != 0L) ? 1 : 0);
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
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private boolean EXT_vertex_weighting_initNativeFunctionAddresses() {
/* 3325 */     return (((this.EXT_vertex_weighting_glVertexWeightfEXT_pointer = GLContext.getFunctionAddress("glVertexWeightfEXT")) != 0L)) & (((this.EXT_vertex_weighting_glVertexWeightPointerEXT_pointer = GLContext.getFunctionAddress("glVertexWeightPointerEXT")) != 0L));
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   private boolean GL11_initNativeFunctionAddresses(boolean forwardCompatible) {
/* 3331 */     return ((forwardCompatible || (this.GL11_glAccum_pointer = GLContext.getFunctionAddress("glAccum")) != 0L)) & ((forwardCompatible || (this.GL11_glAlphaFunc_pointer = GLContext.getFunctionAddress("glAlphaFunc")) != 0L)) & (((this.GL11_glClearColor_pointer = GLContext.getFunctionAddress("glClearColor")) != 0L) ? 1 : 0) & ((forwardCompatible || (this.GL11_glClearAccum_pointer = GLContext.getFunctionAddress("glClearAccum")) != 0L) ? 1 : 0) & (((this.GL11_glClear_pointer = GLContext.getFunctionAddress("glClear")) != 0L) ? 1 : 0) & ((forwardCompatible || (this.GL11_glCallLists_pointer = GLContext.getFunctionAddress("glCallLists")) != 0L) ? 1 : 0) & ((forwardCompatible || (this.GL11_glCallList_pointer = GLContext.getFunctionAddress("glCallList")) != 0L) ? 1 : 0) & (((this.GL11_glBlendFunc_pointer = GLContext.getFunctionAddress("glBlendFunc")) != 0L) ? 1 : 0) & ((forwardCompatible || (this.GL11_glBitmap_pointer = GLContext.getFunctionAddress("glBitmap")) != 0L) ? 1 : 0) & (((this.GL11_glBindTexture_pointer = GLContext.getFunctionAddress("glBindTexture")) != 0L) ? 1 : 0) & ((forwardCompatible || (this.GL11_glPrioritizeTextures_pointer = GLContext.getFunctionAddress("glPrioritizeTextures")) != 0L) ? 1 : 0) & ((forwardCompatible || (this.GL11_glAreTexturesResident_pointer = GLContext.getFunctionAddress("glAreTexturesResident")) != 0L) ? 1 : 0) & ((forwardCompatible || (this.GL11_glBegin_pointer = GLContext.getFunctionAddress("glBegin")) != 0L) ? 1 : 0) & ((forwardCompatible || (this.GL11_glEnd_pointer = GLContext.getFunctionAddress("glEnd")) != 0L) ? 1 : 0) & (((this.GL11_glArrayElement_pointer = GLContext.getFunctionAddress("glArrayElement")) != 0L) ? 1 : 0) & (((this.GL11_glClearDepth_pointer = GLContext.getFunctionAddress("glClearDepth")) != 0L) ? 1 : 0) & ((forwardCompatible || (this.GL11_glDeleteLists_pointer = GLContext.getFunctionAddress("glDeleteLists")) != 0L) ? 1 : 0) & (((this.GL11_glDeleteTextures_pointer = GLContext.getFunctionAddress("glDeleteTextures")) != 0L) ? 1 : 0) & (((this.GL11_glCullFace_pointer = GLContext.getFunctionAddress("glCullFace")) != 0L) ? 1 : 0) & (((this.GL11_glCopyTexSubImage2D_pointer = GLContext.getFunctionAddress("glCopyTexSubImage2D")) != 0L) ? 1 : 0) & (((this.GL11_glCopyTexSubImage1D_pointer = GLContext.getFunctionAddress("glCopyTexSubImage1D")) != 0L) ? 1 : 0) & (((this.GL11_glCopyTexImage2D_pointer = GLContext.getFunctionAddress("glCopyTexImage2D")) != 0L) ? 1 : 0) & (((this.GL11_glCopyTexImage1D_pointer = GLContext.getFunctionAddress("glCopyTexImage1D")) != 0L) ? 1 : 0) & (((this.GL11_glCopyPixels_pointer = GLContext.getFunctionAddress("glCopyPixels")) != 0L) ? 1 : 0) & ((forwardCompatible || (this.GL11_glColorPointer_pointer = GLContext.getFunctionAddress("glColorPointer")) != 0L) ? 1 : 0) & ((forwardCompatible || (this.GL11_glColorMaterial_pointer = GLContext.getFunctionAddress("glColorMaterial")) != 0L) ? 1 : 0) & (((this.GL11_glColorMask_pointer = GLContext.getFunctionAddress("glColorMask")) != 0L) ? 1 : 0) & ((forwardCompatible || (this.GL11_glColor3b_pointer = GLContext.getFunctionAddress("glColor3b")) != 0L) ? 1 : 0) & ((forwardCompatible || (this.GL11_glColor3f_pointer = GLContext.getFunctionAddress("glColor3f")) != 0L) ? 1 : 0) & ((forwardCompatible || (this.GL11_glColor3d_pointer = GLContext.getFunctionAddress("glColor3d")) != 0L) ? 1 : 0) & ((forwardCompatible || (this.GL11_glColor3ub_pointer = GLContext.getFunctionAddress("glColor3ub")) != 0L) ? 1 : 0) & ((forwardCompatible || (this.GL11_glColor4b_pointer = GLContext.getFunctionAddress("glColor4b")) != 0L) ? 1 : 0) & ((forwardCompatible || (this.GL11_glColor4f_pointer = GLContext.getFunctionAddress("glColor4f")) != 0L) ? 1 : 0) & ((forwardCompatible || (this.GL11_glColor4d_pointer = GLContext.getFunctionAddress("glColor4d")) != 0L) ? 1 : 0) & ((forwardCompatible || (this.GL11_glColor4ub_pointer = GLContext.getFunctionAddress("glColor4ub")) != 0L) ? 1 : 0) & (((this.GL11_glClipPlane_pointer = GLContext.getFunctionAddress("glClipPlane")) != 0L) ? 1 : 0) & (((this.GL11_glClearStencil_pointer = GLContext.getFunctionAddress("glClearStencil")) != 0L) ? 1 : 0) & ((forwardCompatible || (this.GL11_glEvalPoint1_pointer = GLContext.getFunctionAddress("glEvalPoint1")) != 0L) ? 1 : 0) & ((forwardCompatible || (this.GL11_glEvalPoint2_pointer = GLContext.getFunctionAddress("glEvalPoint2")) != 0L) ? 1 : 0) & ((forwardCompatible || (this.GL11_glEvalMesh1_pointer = GLContext.getFunctionAddress("glEvalMesh1")) != 0L) ? 1 : 0) & ((forwardCompatible || (this.GL11_glEvalMesh2_pointer = GLContext.getFunctionAddress("glEvalMesh2")) != 0L) ? 1 : 0) & ((forwardCompatible || (this.GL11_glEvalCoord1f_pointer = GLContext.getFunctionAddress("glEvalCoord1f")) != 0L) ? 1 : 0) & ((forwardCompatible || (this.GL11_glEvalCoord1d_pointer = GLContext.getFunctionAddress("glEvalCoord1d")) != 0L) ? 1 : 0) & ((forwardCompatible || (this.GL11_glEvalCoord2f_pointer = GLContext.getFunctionAddress("glEvalCoord2f")) != 0L) ? 1 : 0) & ((forwardCompatible || (this.GL11_glEvalCoord2d_pointer = GLContext.getFunctionAddress("glEvalCoord2d")) != 0L) ? 1 : 0) & ((forwardCompatible || (this.GL11_glEnableClientState_pointer = GLContext.getFunctionAddress("glEnableClientState")) != 0L) ? 1 : 0) & ((forwardCompatible || (this.GL11_glDisableClientState_pointer = GLContext.getFunctionAddress("glDisableClientState")) != 0L) ? 1 : 0) & (((this.GL11_glEnable_pointer = GLContext.getFunctionAddress("glEnable")) != 0L) ? 1 : 0) & (((this.GL11_glDisable_pointer = GLContext.getFunctionAddress("glDisable")) != 0L) ? 1 : 0) & ((forwardCompatible || (this.GL11_glEdgeFlagPointer_pointer = GLContext.getFunctionAddress("glEdgeFlagPointer")) != 0L) ? 1 : 0) & ((forwardCompatible || (this.GL11_glEdgeFlag_pointer = GLContext.getFunctionAddress("glEdgeFlag")) != 0L) ? 1 : 0) & ((forwardCompatible || (this.GL11_glDrawPixels_pointer = GLContext.getFunctionAddress("glDrawPixels")) != 0L) ? 1 : 0) & (((this.GL11_glDrawElements_pointer = GLContext.getFunctionAddress("glDrawElements")) != 0L) ? 1 : 0) & (((this.GL11_glDrawBuffer_pointer = GLContext.getFunctionAddress("glDrawBuffer")) != 0L) ? 1 : 0) & (((this.GL11_glDrawArrays_pointer = GLContext.getFunctionAddress("glDrawArrays")) != 0L) ? 1 : 0) & (((this.GL11_glDepthRange_pointer = GLContext.getFunctionAddress("glDepthRange")) != 0L) ? 1 : 0) & (((this.GL11_glDepthMask_pointer = GLContext.getFunctionAddress("glDepthMask")) != 0L) ? 1 : 0) & (((this.GL11_glDepthFunc_pointer = GLContext.getFunctionAddress("glDepthFunc")) != 0L) ? 1 : 0) & ((forwardCompatible || (this.GL11_glFeedbackBuffer_pointer = GLContext.getFunctionAddress("glFeedbackBuffer")) != 0L) ? 1 : 0) & ((forwardCompatible || (this.GL11_glGetPixelMapfv_pointer = GLContext.getFunctionAddress("glGetPixelMapfv")) != 0L) ? 1 : 0) & ((forwardCompatible || (this.GL11_glGetPixelMapuiv_pointer = GLContext.getFunctionAddress("glGetPixelMapuiv")) != 0L) ? 1 : 0) & ((forwardCompatible || (this.GL11_glGetPixelMapusv_pointer = GLContext.getFunctionAddress("glGetPixelMapusv")) != 0L) ? 1 : 0) & ((forwardCompatible || (this.GL11_glGetMaterialfv_pointer = GLContext.getFunctionAddress("glGetMaterialfv")) != 0L) ? 1 : 0) & ((forwardCompatible || (this.GL11_glGetMaterialiv_pointer = GLContext.getFunctionAddress("glGetMaterialiv")) != 0L) ? 1 : 0) & ((forwardCompatible || (this.GL11_glGetMapfv_pointer = GLContext.getFunctionAddress("glGetMapfv")) != 0L) ? 1 : 0) & ((forwardCompatible || (this.GL11_glGetMapdv_pointer = GLContext.getFunctionAddress("glGetMapdv")) != 0L) ? 1 : 0) & ((forwardCompatible || (this.GL11_glGetMapiv_pointer = GLContext.getFunctionAddress("glGetMapiv")) != 0L) ? 1 : 0) & ((forwardCompatible || (this.GL11_glGetLightfv_pointer = GLContext.getFunctionAddress("glGetLightfv")) != 0L) ? 1 : 0) & ((forwardCompatible || (this.GL11_glGetLightiv_pointer = GLContext.getFunctionAddress("glGetLightiv")) != 0L) ? 1 : 0) & (((this.GL11_glGetError_pointer = GLContext.getFunctionAddress("glGetError")) != 0L) ? 1 : 0) & (((this.GL11_glGetClipPlane_pointer = GLContext.getFunctionAddress("glGetClipPlane")) != 0L) ? 1 : 0) & (((this.GL11_glGetBooleanv_pointer = GLContext.getFunctionAddress("glGetBooleanv")) != 0L) ? 1 : 0) & (((this.GL11_glGetDoublev_pointer = GLContext.getFunctionAddress("glGetDoublev")) != 0L) ? 1 : 0) & (((this.GL11_glGetFloatv_pointer = GLContext.getFunctionAddress("glGetFloatv")) != 0L) ? 1 : 0) & (((this.GL11_glGetIntegerv_pointer = GLContext.getFunctionAddress("glGetIntegerv")) != 0L) ? 1 : 0) & (((this.GL11_glGenTextures_pointer = GLContext.getFunctionAddress("glGenTextures")) != 0L) ? 1 : 0) & ((forwardCompatible || (this.GL11_glGenLists_pointer = GLContext.getFunctionAddress("glGenLists")) != 0L) ? 1 : 0) & ((forwardCompatible || (this.GL11_glFrustum_pointer = GLContext.getFunctionAddress("glFrustum")) != 0L) ? 1 : 0) & (((this.GL11_glFrontFace_pointer = GLContext.getFunctionAddress("glFrontFace")) != 0L) ? 1 : 0) & ((forwardCompatible || (this.GL11_glFogf_pointer = GLContext.getFunctionAddress("glFogf")) != 0L) ? 1 : 0) & ((forwardCompatible || (this.GL11_glFogi_pointer = GLContext.getFunctionAddress("glFogi")) != 0L) ? 1 : 0) & ((forwardCompatible || (this.GL11_glFogfv_pointer = GLContext.getFunctionAddress("glFogfv")) != 0L) ? 1 : 0) & ((forwardCompatible || (this.GL11_glFogiv_pointer = GLContext.getFunctionAddress("glFogiv")) != 0L) ? 1 : 0) & (((this.GL11_glFlush_pointer = GLContext.getFunctionAddress("glFlush")) != 0L) ? 1 : 0) & (((this.GL11_glFinish_pointer = GLContext.getFunctionAddress("glFinish")) != 0L) ? 1 : 0) & (((this.GL11_glGetPointerv_pointer = GLContext.getFunctionAddress("glGetPointerv")) != 0L) ? 1 : 0) & (((this.GL11_glIsEnabled_pointer = GLContext.getFunctionAddress("glIsEnabled")) != 0L) ? 1 : 0) & (((this.GL11_glInterleavedArrays_pointer = GLContext.getFunctionAddress("glInterleavedArrays")) != 0L) ? 1 : 0) & ((forwardCompatible || (this.GL11_glInitNames_pointer = GLContext.getFunctionAddress("glInitNames")) != 0L) ? 1 : 0) & (((this.GL11_glHint_pointer = GLContext.getFunctionAddress("glHint")) != 0L) ? 1 : 0) & (((this.GL11_glGetTexParameterfv_pointer = GLContext.getFunctionAddress("glGetTexParameterfv")) != 0L) ? 1 : 0) & (((this.GL11_glGetTexParameteriv_pointer = GLContext.getFunctionAddress("glGetTexParameteriv")) != 0L) ? 1 : 0) & (((this.GL11_glGetTexLevelParameterfv_pointer = GLContext.getFunctionAddress("glGetTexLevelParameterfv")) != 0L) ? 1 : 0) & (((this.GL11_glGetTexLevelParameteriv_pointer = GLContext.getFunctionAddress("glGetTexLevelParameteriv")) != 0L) ? 1 : 0) & (((this.GL11_glGetTexImage_pointer = GLContext.getFunctionAddress("glGetTexImage")) != 0L) ? 1 : 0) & ((forwardCompatible || (this.GL11_glGetTexGeniv_pointer = GLContext.getFunctionAddress("glGetTexGeniv")) != 0L) ? 1 : 0) & ((forwardCompatible || (this.GL11_glGetTexGenfv_pointer = GLContext.getFunctionAddress("glGetTexGenfv")) != 0L) ? 1 : 0) & ((forwardCompatible || (this.GL11_glGetTexGendv_pointer = GLContext.getFunctionAddress("glGetTexGendv")) != 0L) ? 1 : 0) & (((this.GL11_glGetTexEnviv_pointer = GLContext.getFunctionAddress("glGetTexEnviv")) != 0L) ? 1 : 0) & (((this.GL11_glGetTexEnvfv_pointer = GLContext.getFunctionAddress("glGetTexEnvfv")) != 0L) ? 1 : 0) & (((this.GL11_glGetString_pointer = GLContext.getFunctionAddress("glGetString")) != 0L) ? 1 : 0) & ((forwardCompatible || (this.GL11_glGetPolygonStipple_pointer = GLContext.getFunctionAddress("glGetPolygonStipple")) != 0L) ? 1 : 0) & ((forwardCompatible || (this.GL11_glIsList_pointer = GLContext.getFunctionAddress("glIsList")) != 0L) ? 1 : 0) & ((forwardCompatible || (this.GL11_glMaterialf_pointer = GLContext.getFunctionAddress("glMaterialf")) != 0L) ? 1 : 0) & ((forwardCompatible || (this.GL11_glMateriali_pointer = GLContext.getFunctionAddress("glMateriali")) != 0L) ? 1 : 0) & ((forwardCompatible || (this.GL11_glMaterialfv_pointer = GLContext.getFunctionAddress("glMaterialfv")) != 0L) ? 1 : 0) & ((forwardCompatible || (this.GL11_glMaterialiv_pointer = GLContext.getFunctionAddress("glMaterialiv")) != 0L) ? 1 : 0) & ((forwardCompatible || (this.GL11_glMapGrid1f_pointer = GLContext.getFunctionAddress("glMapGrid1f")) != 0L) ? 1 : 0) & ((forwardCompatible || (this.GL11_glMapGrid1d_pointer = GLContext.getFunctionAddress("glMapGrid1d")) != 0L) ? 1 : 0) & ((forwardCompatible || (this.GL11_glMapGrid2f_pointer = GLContext.getFunctionAddress("glMapGrid2f")) != 0L) ? 1 : 0) & ((forwardCompatible || (this.GL11_glMapGrid2d_pointer = GLContext.getFunctionAddress("glMapGrid2d")) != 0L) ? 1 : 0) & ((forwardCompatible || (this.GL11_glMap2f_pointer = GLContext.getFunctionAddress("glMap2f")) != 0L) ? 1 : 0) & ((forwardCompatible || (this.GL11_glMap2d_pointer = GLContext.getFunctionAddress("glMap2d")) != 0L) ? 1 : 0) & ((forwardCompatible || (this.GL11_glMap1f_pointer = GLContext.getFunctionAddress("glMap1f")) != 0L) ? 1 : 0) & ((forwardCompatible || (this.GL11_glMap1d_pointer = GLContext.getFunctionAddress("glMap1d")) != 0L) ? 1 : 0) & (((this.GL11_glLogicOp_pointer = GLContext.getFunctionAddress("glLogicOp")) != 0L) ? 1 : 0) & ((forwardCompatible || (this.GL11_glLoadName_pointer = GLContext.getFunctionAddress("glLoadName")) != 0L) ? 1 : 0) & ((forwardCompatible || (this.GL11_glLoadMatrixf_pointer = GLContext.getFunctionAddress("glLoadMatrixf")) != 0L) ? 1 : 0) & ((forwardCompatible || (this.GL11_glLoadMatrixd_pointer = GLContext.getFunctionAddress("glLoadMatrixd")) != 0L) ? 1 : 0) & ((forwardCompatible || (this.GL11_glLoadIdentity_pointer = GLContext.getFunctionAddress("glLoadIdentity")) != 0L) ? 1 : 0) & ((forwardCompatible || (this.GL11_glListBase_pointer = GLContext.getFunctionAddress("glListBase")) != 0L) ? 1 : 0) & (((this.GL11_glLineWidth_pointer = GLContext.getFunctionAddress("glLineWidth")) != 0L) ? 1 : 0) & ((forwardCompatible || (this.GL11_glLineStipple_pointer = GLContext.getFunctionAddress("glLineStipple")) != 0L) ? 1 : 0) & ((forwardCompatible || (this.GL11_glLightModelf_pointer = GLContext.getFunctionAddress("glLightModelf")) != 0L) ? 1 : 0) & ((forwardCompatible || (this.GL11_glLightModeli_pointer = GLContext.getFunctionAddress("glLightModeli")) != 0L) ? 1 : 0) & ((forwardCompatible || (this.GL11_glLightModelfv_pointer = GLContext.getFunctionAddress("glLightModelfv")) != 0L) ? 1 : 0) & ((forwardCompatible || (this.GL11_glLightModeliv_pointer = GLContext.getFunctionAddress("glLightModeliv")) != 0L) ? 1 : 0) & ((forwardCompatible || (this.GL11_glLightf_pointer = GLContext.getFunctionAddress("glLightf")) != 0L) ? 1 : 0) & ((forwardCompatible || (this.GL11_glLighti_pointer = GLContext.getFunctionAddress("glLighti")) != 0L) ? 1 : 0) & ((forwardCompatible || (this.GL11_glLightfv_pointer = GLContext.getFunctionAddress("glLightfv")) != 0L) ? 1 : 0) & ((forwardCompatible || (this.GL11_glLightiv_pointer = GLContext.getFunctionAddress("glLightiv")) != 0L) ? 1 : 0) & (((this.GL11_glIsTexture_pointer = GLContext.getFunctionAddress("glIsTexture")) != 0L) ? 1 : 0) & ((forwardCompatible || (this.GL11_glMatrixMode_pointer = GLContext.getFunctionAddress("glMatrixMode")) != 0L) ? 1 : 0) & ((forwardCompatible || (this.GL11_glPolygonStipple_pointer = GLContext.getFunctionAddress("glPolygonStipple")) != 0L) ? 1 : 0) & (((this.GL11_glPolygonOffset_pointer = GLContext.getFunctionAddress("glPolygonOffset")) != 0L) ? 1 : 0) & (((this.GL11_glPolygonMode_pointer = GLContext.getFunctionAddress("glPolygonMode")) != 0L) ? 1 : 0) & (((this.GL11_glPointSize_pointer = GLContext.getFunctionAddress("glPointSize")) != 0L) ? 1 : 0) & ((forwardCompatible || (this.GL11_glPixelZoom_pointer = GLContext.getFunctionAddress("glPixelZoom")) != 0L) ? 1 : 0) & ((forwardCompatible || (this.GL11_glPixelTransferf_pointer = GLContext.getFunctionAddress("glPixelTransferf")) != 0L) ? 1 : 0) & ((forwardCompatible || (this.GL11_glPixelTransferi_pointer = GLContext.getFunctionAddress("glPixelTransferi")) != 0L) ? 1 : 0) & (((this.GL11_glPixelStoref_pointer = GLContext.getFunctionAddress("glPixelStoref")) != 0L) ? 1 : 0) & (((this.GL11_glPixelStorei_pointer = GLContext.getFunctionAddress("glPixelStorei")) != 0L) ? 1 : 0) & ((forwardCompatible || (this.GL11_glPixelMapfv_pointer = GLContext.getFunctionAddress("glPixelMapfv")) != 0L) ? 1 : 0) & ((forwardCompatible || (this.GL11_glPixelMapuiv_pointer = GLContext.getFunctionAddress("glPixelMapuiv")) != 0L) ? 1 : 0) & ((forwardCompatible || (this.GL11_glPixelMapusv_pointer = GLContext.getFunctionAddress("glPixelMapusv")) != 0L) ? 1 : 0) & ((forwardCompatible || (this.GL11_glPassThrough_pointer = GLContext.getFunctionAddress("glPassThrough")) != 0L) ? 1 : 0) & ((forwardCompatible || (this.GL11_glOrtho_pointer = GLContext.getFunctionAddress("glOrtho")) != 0L) ? 1 : 0) & ((forwardCompatible || (this.GL11_glNormalPointer_pointer = GLContext.getFunctionAddress("glNormalPointer")) != 0L) ? 1 : 0) & ((forwardCompatible || (this.GL11_glNormal3b_pointer = GLContext.getFunctionAddress("glNormal3b")) != 0L) ? 1 : 0) & ((forwardCompatible || (this.GL11_glNormal3f_pointer = GLContext.getFunctionAddress("glNormal3f")) != 0L) ? 1 : 0) & ((forwardCompatible || (this.GL11_glNormal3d_pointer = GLContext.getFunctionAddress("glNormal3d")) != 0L) ? 1 : 0) & ((forwardCompatible || (this.GL11_glNormal3i_pointer = GLContext.getFunctionAddress("glNormal3i")) != 0L) ? 1 : 0) & ((forwardCompatible || (this.GL11_glNewList_pointer = GLContext.getFunctionAddress("glNewList")) != 0L) ? 1 : 0) & ((forwardCompatible || (this.GL11_glEndList_pointer = GLContext.getFunctionAddress("glEndList")) != 0L) ? 1 : 0) & ((forwardCompatible || (this.GL11_glMultMatrixf_pointer = GLContext.getFunctionAddress("glMultMatrixf")) != 0L) ? 1 : 0) & ((forwardCompatible || (this.GL11_glMultMatrixd_pointer = GLContext.getFunctionAddress("glMultMatrixd")) != 0L) ? 1 : 0) & (((this.GL11_glShadeModel_pointer = GLContext.getFunctionAddress("glShadeModel")) != 0L) ? 1 : 0) & ((forwardCompatible || (this.GL11_glSelectBuffer_pointer = GLContext.getFunctionAddress("glSelectBuffer")) != 0L) ? 1 : 0) & (((this.GL11_glScissor_pointer = GLContext.getFunctionAddress("glScissor")) != 0L) ? 1 : 0) & ((forwardCompatible || (this.GL11_glScalef_pointer = GLContext.getFunctionAddress("glScalef")) != 0L) ? 1 : 0) & ((forwardCompatible || (this.GL11_glScaled_pointer = GLContext.getFunctionAddress("glScaled")) != 0L) ? 1 : 0) & ((forwardCompatible || (this.GL11_glRotatef_pointer = GLContext.getFunctionAddress("glRotatef")) != 0L) ? 1 : 0) & ((forwardCompatible || (this.GL11_glRenderMode_pointer = GLContext.getFunctionAddress("glRenderMode")) != 0L) ? 1 : 0) & ((forwardCompatible || (this.GL11_glRectf_pointer = GLContext.getFunctionAddress("glRectf")) != 0L) ? 1 : 0) & ((forwardCompatible || (this.GL11_glRectd_pointer = GLContext.getFunctionAddress("glRectd")) != 0L) ? 1 : 0) & ((forwardCompatible || (this.GL11_glRecti_pointer = GLContext.getFunctionAddress("glRecti")) != 0L) ? 1 : 0) & (((this.GL11_glReadPixels_pointer = GLContext.getFunctionAddress("glReadPixels")) != 0L) ? 1 : 0) & (((this.GL11_glReadBuffer_pointer = GLContext.getFunctionAddress("glReadBuffer")) != 0L) ? 1 : 0) & ((forwardCompatible || (this.GL11_glRasterPos2f_pointer = GLContext.getFunctionAddress("glRasterPos2f")) != 0L) ? 1 : 0) & ((forwardCompatible || (this.GL11_glRasterPos2d_pointer = GLContext.getFunctionAddress("glRasterPos2d")) != 0L) ? 1 : 0) & ((forwardCompatible || (this.GL11_glRasterPos2i_pointer = GLContext.getFunctionAddress("glRasterPos2i")) != 0L) ? 1 : 0) & ((forwardCompatible || (this.GL11_glRasterPos3f_pointer = GLContext.getFunctionAddress("glRasterPos3f")) != 0L) ? 1 : 0) & ((forwardCompatible || (this.GL11_glRasterPos3d_pointer = GLContext.getFunctionAddress("glRasterPos3d")) != 0L) ? 1 : 0) & ((forwardCompatible || (this.GL11_glRasterPos3i_pointer = GLContext.getFunctionAddress("glRasterPos3i")) != 0L) ? 1 : 0) & ((forwardCompatible || (this.GL11_glRasterPos4f_pointer = GLContext.getFunctionAddress("glRasterPos4f")) != 0L) ? 1 : 0) & ((forwardCompatible || (this.GL11_glRasterPos4d_pointer = GLContext.getFunctionAddress("glRasterPos4d")) != 0L) ? 1 : 0) & ((forwardCompatible || (this.GL11_glRasterPos4i_pointer = GLContext.getFunctionAddress("glRasterPos4i")) != 0L) ? 1 : 0) & ((forwardCompatible || (this.GL11_glPushName_pointer = GLContext.getFunctionAddress("glPushName")) != 0L) ? 1 : 0) & ((forwardCompatible || (this.GL11_glPopName_pointer = GLContext.getFunctionAddress("glPopName")) != 0L) ? 1 : 0) & ((forwardCompatible || (this.GL11_glPushMatrix_pointer = GLContext.getFunctionAddress("glPushMatrix")) != 0L) ? 1 : 0) & ((forwardCompatible || (this.GL11_glPopMatrix_pointer = GLContext.getFunctionAddress("glPopMatrix")) != 0L) ? 1 : 0) & ((forwardCompatible || (this.GL11_glPushClientAttrib_pointer = GLContext.getFunctionAddress("glPushClientAttrib")) != 0L) ? 1 : 0) & ((forwardCompatible || (this.GL11_glPopClientAttrib_pointer = GLContext.getFunctionAddress("glPopClientAttrib")) != 0L) ? 1 : 0) & ((forwardCompatible || (this.GL11_glPushAttrib_pointer = GLContext.getFunctionAddress("glPushAttrib")) != 0L) ? 1 : 0) & ((forwardCompatible || (this.GL11_glPopAttrib_pointer = GLContext.getFunctionAddress("glPopAttrib")) != 0L) ? 1 : 0) & (((this.GL11_glStencilFunc_pointer = GLContext.getFunctionAddress("glStencilFunc")) != 0L) ? 1 : 0) & ((forwardCompatible || (this.GL11_glVertexPointer_pointer = GLContext.getFunctionAddress("glVertexPointer")) != 0L) ? 1 : 0) & ((forwardCompatible || (this.GL11_glVertex2f_pointer = GLContext.getFunctionAddress("glVertex2f")) != 0L) ? 1 : 0) & ((forwardCompatible || (this.GL11_glVertex2d_pointer = GLContext.getFunctionAddress("glVertex2d")) != 0L) ? 1 : 0) & ((forwardCompatible || (this.GL11_glVertex2i_pointer = GLContext.getFunctionAddress("glVertex2i")) != 0L) ? 1 : 0) & ((forwardCompatible || (this.GL11_glVertex3f_pointer = GLContext.getFunctionAddress("glVertex3f")) != 0L) ? 1 : 0) & ((forwardCompatible || (this.GL11_glVertex3d_pointer = GLContext.getFunctionAddress("glVertex3d")) != 0L) ? 1 : 0) & ((forwardCompatible || (this.GL11_glVertex3i_pointer = GLContext.getFunctionAddress("glVertex3i")) != 0L) ? 1 : 0) & ((forwardCompatible || (this.GL11_glVertex4f_pointer = GLContext.getFunctionAddress("glVertex4f")) != 0L) ? 1 : 0) & ((forwardCompatible || (this.GL11_glVertex4d_pointer = GLContext.getFunctionAddress("glVertex4d")) != 0L) ? 1 : 0) & ((forwardCompatible || (this.GL11_glVertex4i_pointer = GLContext.getFunctionAddress("glVertex4i")) != 0L) ? 1 : 0) & ((forwardCompatible || (this.GL11_glTranslatef_pointer = GLContext.getFunctionAddress("glTranslatef")) != 0L) ? 1 : 0) & ((forwardCompatible || (this.GL11_glTranslated_pointer = GLContext.getFunctionAddress("glTranslated")) != 0L) ? 1 : 0) & (((this.GL11_glTexImage1D_pointer = GLContext.getFunctionAddress("glTexImage1D")) != 0L) ? 1 : 0) & (((this.GL11_glTexImage2D_pointer = GLContext.getFunctionAddress("glTexImage2D")) != 0L) ? 1 : 0) & (((this.GL11_glTexSubImage1D_pointer = GLContext.getFunctionAddress("glTexSubImage1D")) != 0L) ? 1 : 0) & (((this.GL11_glTexSubImage2D_pointer = GLContext.getFunctionAddress("glTexSubImage2D")) != 0L) ? 1 : 0) & (((this.GL11_glTexParameterf_pointer = GLContext.getFunctionAddress("glTexParameterf")) != 0L) ? 1 : 0) & (((this.GL11_glTexParameteri_pointer = GLContext.getFunctionAddress("glTexParameteri")) != 0L) ? 1 : 0) & (((this.GL11_glTexParameterfv_pointer = GLContext.getFunctionAddress("glTexParameterfv")) != 0L) ? 1 : 0) & (((this.GL11_glTexParameteriv_pointer = GLContext.getFunctionAddress("glTexParameteriv")) != 0L) ? 1 : 0) & ((forwardCompatible || (this.GL11_glTexGenf_pointer = GLContext.getFunctionAddress("glTexGenf")) != 0L) ? 1 : 0) & ((forwardCompatible || (this.GL11_glTexGend_pointer = GLContext.getFunctionAddress("glTexGend")) != 0L) ? 1 : 0) & ((forwardCompatible || (this.GL11_glTexGenfv_pointer = GLContext.getFunctionAddress("glTexGenfv")) != 0L) ? 1 : 0) & ((forwardCompatible || (this.GL11_glTexGendv_pointer = GLContext.getFunctionAddress("glTexGendv")) != 0L) ? 1 : 0) & ((forwardCompatible || (this.GL11_glTexGeni_pointer = GLContext.getFunctionAddress("glTexGeni")) != 0L) ? 1 : 0) & ((forwardCompatible || (this.GL11_glTexGeniv_pointer = GLContext.getFunctionAddress("glTexGeniv")) != 0L) ? 1 : 0) & (((this.GL11_glTexEnvf_pointer = GLContext.getFunctionAddress("glTexEnvf")) != 0L) ? 1 : 0) & (((this.GL11_glTexEnvi_pointer = GLContext.getFunctionAddress("glTexEnvi")) != 0L) ? 1 : 0) & (((this.GL11_glTexEnvfv_pointer = GLContext.getFunctionAddress("glTexEnvfv")) != 0L) ? 1 : 0) & (((this.GL11_glTexEnviv_pointer = GLContext.getFunctionAddress("glTexEnviv")) != 0L) ? 1 : 0) & ((forwardCompatible || (this.GL11_glTexCoordPointer_pointer = GLContext.getFunctionAddress("glTexCoordPointer")) != 0L) ? 1 : 0) & ((forwardCompatible || (this.GL11_glTexCoord1f_pointer = GLContext.getFunctionAddress("glTexCoord1f")) != 0L) ? 1 : 0) & ((forwardCompatible || (this.GL11_glTexCoord1d_pointer = GLContext.getFunctionAddress("glTexCoord1d")) != 0L) ? 1 : 0) & ((forwardCompatible || (this.GL11_glTexCoord2f_pointer = GLContext.getFunctionAddress("glTexCoord2f")) != 0L) ? 1 : 0) & ((forwardCompatible || (this.GL11_glTexCoord2d_pointer = GLContext.getFunctionAddress("glTexCoord2d")) != 0L) ? 1 : 0) & ((forwardCompatible || (this.GL11_glTexCoord3f_pointer = GLContext.getFunctionAddress("glTexCoord3f")) != 0L) ? 1 : 0) & ((forwardCompatible || (this.GL11_glTexCoord3d_pointer = GLContext.getFunctionAddress("glTexCoord3d")) != 0L) ? 1 : 0) & ((forwardCompatible || (this.GL11_glTexCoord4f_pointer = GLContext.getFunctionAddress("glTexCoord4f")) != 0L) ? 1 : 0) & ((forwardCompatible || (this.GL11_glTexCoord4d_pointer = GLContext.getFunctionAddress("glTexCoord4d")) != 0L) ? 1 : 0) & (((this.GL11_glStencilOp_pointer = GLContext.getFunctionAddress("glStencilOp")) != 0L) ? 1 : 0) & (((this.GL11_glStencilMask_pointer = GLContext.getFunctionAddress("glStencilMask")) != 0L) ? 1 : 0) & (((this.GL11_glViewport_pointer = GLContext.getFunctionAddress("glViewport")) != 0L) ? 1 : 0);
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
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private boolean GL12_initNativeFunctionAddresses() {
/* 3563 */     return (((this.GL12_glDrawRangeElements_pointer = GLContext.getFunctionAddress("glDrawRangeElements")) != 0L)) & (((this.GL12_glTexImage3D_pointer = GLContext.getFunctionAddress("glTexImage3D")) != 0L)) & (((this.GL12_glTexSubImage3D_pointer = GLContext.getFunctionAddress("glTexSubImage3D")) != 0L) ? 1 : 0) & (((this.GL12_glCopyTexSubImage3D_pointer = GLContext.getFunctionAddress("glCopyTexSubImage3D")) != 0L) ? 1 : 0);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private boolean GL13_initNativeFunctionAddresses(boolean forwardCompatible) {
/* 3571 */     return (((this.GL13_glActiveTexture_pointer = GLContext.getFunctionAddress("glActiveTexture")) != 0L)) & ((forwardCompatible || (this.GL13_glClientActiveTexture_pointer = GLContext.getFunctionAddress("glClientActiveTexture")) != 0L)) & (((this.GL13_glCompressedTexImage1D_pointer = GLContext.getFunctionAddress("glCompressedTexImage1D")) != 0L) ? 1 : 0) & (((this.GL13_glCompressedTexImage2D_pointer = GLContext.getFunctionAddress("glCompressedTexImage2D")) != 0L) ? 1 : 0) & (((this.GL13_glCompressedTexImage3D_pointer = GLContext.getFunctionAddress("glCompressedTexImage3D")) != 0L) ? 1 : 0) & (((this.GL13_glCompressedTexSubImage1D_pointer = GLContext.getFunctionAddress("glCompressedTexSubImage1D")) != 0L) ? 1 : 0) & (((this.GL13_glCompressedTexSubImage2D_pointer = GLContext.getFunctionAddress("glCompressedTexSubImage2D")) != 0L) ? 1 : 0) & (((this.GL13_glCompressedTexSubImage3D_pointer = GLContext.getFunctionAddress("glCompressedTexSubImage3D")) != 0L) ? 1 : 0) & (((this.GL13_glGetCompressedTexImage_pointer = GLContext.getFunctionAddress("glGetCompressedTexImage")) != 0L) ? 1 : 0) & ((forwardCompatible || (this.GL13_glMultiTexCoord1f_pointer = GLContext.getFunctionAddress("glMultiTexCoord1f")) != 0L) ? 1 : 0) & ((forwardCompatible || (this.GL13_glMultiTexCoord1d_pointer = GLContext.getFunctionAddress("glMultiTexCoord1d")) != 0L) ? 1 : 0) & ((forwardCompatible || (this.GL13_glMultiTexCoord2f_pointer = GLContext.getFunctionAddress("glMultiTexCoord2f")) != 0L) ? 1 : 0) & ((forwardCompatible || (this.GL13_glMultiTexCoord2d_pointer = GLContext.getFunctionAddress("glMultiTexCoord2d")) != 0L) ? 1 : 0) & ((forwardCompatible || (this.GL13_glMultiTexCoord3f_pointer = GLContext.getFunctionAddress("glMultiTexCoord3f")) != 0L) ? 1 : 0) & ((forwardCompatible || (this.GL13_glMultiTexCoord3d_pointer = GLContext.getFunctionAddress("glMultiTexCoord3d")) != 0L) ? 1 : 0) & ((forwardCompatible || (this.GL13_glMultiTexCoord4f_pointer = GLContext.getFunctionAddress("glMultiTexCoord4f")) != 0L) ? 1 : 0) & ((forwardCompatible || (this.GL13_glMultiTexCoord4d_pointer = GLContext.getFunctionAddress("glMultiTexCoord4d")) != 0L) ? 1 : 0) & ((forwardCompatible || (this.GL13_glLoadTransposeMatrixf_pointer = GLContext.getFunctionAddress("glLoadTransposeMatrixf")) != 0L) ? 1 : 0) & ((forwardCompatible || (this.GL13_glLoadTransposeMatrixd_pointer = GLContext.getFunctionAddress("glLoadTransposeMatrixd")) != 0L) ? 1 : 0) & ((forwardCompatible || (this.GL13_glMultTransposeMatrixf_pointer = GLContext.getFunctionAddress("glMultTransposeMatrixf")) != 0L) ? 1 : 0) & ((forwardCompatible || (this.GL13_glMultTransposeMatrixd_pointer = GLContext.getFunctionAddress("glMultTransposeMatrixd")) != 0L) ? 1 : 0) & (((this.GL13_glSampleCoverage_pointer = GLContext.getFunctionAddress("glSampleCoverage")) != 0L) ? 1 : 0);
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
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private boolean GL14_initNativeFunctionAddresses(boolean forwardCompatible) {
/* 3597 */     return (((this.GL14_glBlendEquation_pointer = GLContext.getFunctionAddress("glBlendEquation")) != 0L)) & (((this.GL14_glBlendColor_pointer = GLContext.getFunctionAddress("glBlendColor")) != 0L)) & ((forwardCompatible || (this.GL14_glFogCoordf_pointer = GLContext.getFunctionAddress("glFogCoordf")) != 0L) ? 1 : 0) & ((forwardCompatible || (this.GL14_glFogCoordd_pointer = GLContext.getFunctionAddress("glFogCoordd")) != 0L) ? 1 : 0) & ((forwardCompatible || (this.GL14_glFogCoordPointer_pointer = GLContext.getFunctionAddress("glFogCoordPointer")) != 0L) ? 1 : 0) & (((this.GL14_glMultiDrawArrays_pointer = GLContext.getFunctionAddress("glMultiDrawArrays")) != 0L) ? 1 : 0) & (((this.GL14_glPointParameteri_pointer = GLContext.getFunctionAddress("glPointParameteri")) != 0L) ? 1 : 0) & (((this.GL14_glPointParameterf_pointer = GLContext.getFunctionAddress("glPointParameterf")) != 0L) ? 1 : 0) & (((this.GL14_glPointParameteriv_pointer = GLContext.getFunctionAddress("glPointParameteriv")) != 0L) ? 1 : 0) & (((this.GL14_glPointParameterfv_pointer = GLContext.getFunctionAddress("glPointParameterfv")) != 0L) ? 1 : 0) & ((forwardCompatible || (this.GL14_glSecondaryColor3b_pointer = GLContext.getFunctionAddress("glSecondaryColor3b")) != 0L) ? 1 : 0) & ((forwardCompatible || (this.GL14_glSecondaryColor3f_pointer = GLContext.getFunctionAddress("glSecondaryColor3f")) != 0L) ? 1 : 0) & ((forwardCompatible || (this.GL14_glSecondaryColor3d_pointer = GLContext.getFunctionAddress("glSecondaryColor3d")) != 0L) ? 1 : 0) & ((forwardCompatible || (this.GL14_glSecondaryColor3ub_pointer = GLContext.getFunctionAddress("glSecondaryColor3ub")) != 0L) ? 1 : 0) & ((forwardCompatible || (this.GL14_glSecondaryColorPointer_pointer = GLContext.getFunctionAddress("glSecondaryColorPointer")) != 0L) ? 1 : 0) & (((this.GL14_glBlendFuncSeparate_pointer = GLContext.getFunctionAddress("glBlendFuncSeparate")) != 0L) ? 1 : 0) & ((forwardCompatible || (this.GL14_glWindowPos2f_pointer = GLContext.getFunctionAddress("glWindowPos2f")) != 0L) ? 1 : 0) & ((forwardCompatible || (this.GL14_glWindowPos2d_pointer = GLContext.getFunctionAddress("glWindowPos2d")) != 0L) ? 1 : 0) & ((forwardCompatible || (this.GL14_glWindowPos2i_pointer = GLContext.getFunctionAddress("glWindowPos2i")) != 0L) ? 1 : 0) & ((forwardCompatible || (this.GL14_glWindowPos3f_pointer = GLContext.getFunctionAddress("glWindowPos3f")) != 0L) ? 1 : 0) & ((forwardCompatible || (this.GL14_glWindowPos3d_pointer = GLContext.getFunctionAddress("glWindowPos3d")) != 0L) ? 1 : 0) & ((forwardCompatible || (this.GL14_glWindowPos3i_pointer = GLContext.getFunctionAddress("glWindowPos3i")) != 0L) ? 1 : 0);
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
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private boolean GL15_initNativeFunctionAddresses() {
/* 3623 */     return (((this.GL15_glBindBuffer_pointer = GLContext.getFunctionAddress("glBindBuffer")) != 0L)) & (((this.GL15_glDeleteBuffers_pointer = GLContext.getFunctionAddress("glDeleteBuffers")) != 0L)) & (((this.GL15_glGenBuffers_pointer = GLContext.getFunctionAddress("glGenBuffers")) != 0L) ? 1 : 0) & (((this.GL15_glIsBuffer_pointer = GLContext.getFunctionAddress("glIsBuffer")) != 0L) ? 1 : 0) & (((this.GL15_glBufferData_pointer = GLContext.getFunctionAddress("glBufferData")) != 0L) ? 1 : 0) & (((this.GL15_glBufferSubData_pointer = GLContext.getFunctionAddress("glBufferSubData")) != 0L) ? 1 : 0) & (((this.GL15_glGetBufferSubData_pointer = GLContext.getFunctionAddress("glGetBufferSubData")) != 0L) ? 1 : 0) & (((this.GL15_glMapBuffer_pointer = GLContext.getFunctionAddress("glMapBuffer")) != 0L) ? 1 : 0) & (((this.GL15_glUnmapBuffer_pointer = GLContext.getFunctionAddress("glUnmapBuffer")) != 0L) ? 1 : 0) & (((this.GL15_glGetBufferParameteriv_pointer = GLContext.getFunctionAddress("glGetBufferParameteriv")) != 0L) ? 1 : 0) & (((this.GL15_glGetBufferPointerv_pointer = GLContext.getFunctionAddress("glGetBufferPointerv")) != 0L) ? 1 : 0) & (((this.GL15_glGenQueries_pointer = GLContext.getFunctionAddress("glGenQueries")) != 0L) ? 1 : 0) & (((this.GL15_glDeleteQueries_pointer = GLContext.getFunctionAddress("glDeleteQueries")) != 0L) ? 1 : 0) & (((this.GL15_glIsQuery_pointer = GLContext.getFunctionAddress("glIsQuery")) != 0L) ? 1 : 0) & (((this.GL15_glBeginQuery_pointer = GLContext.getFunctionAddress("glBeginQuery")) != 0L) ? 1 : 0) & (((this.GL15_glEndQuery_pointer = GLContext.getFunctionAddress("glEndQuery")) != 0L) ? 1 : 0) & (((this.GL15_glGetQueryiv_pointer = GLContext.getFunctionAddress("glGetQueryiv")) != 0L) ? 1 : 0) & (((this.GL15_glGetQueryObjectiv_pointer = GLContext.getFunctionAddress("glGetQueryObjectiv")) != 0L) ? 1 : 0) & (((this.GL15_glGetQueryObjectuiv_pointer = GLContext.getFunctionAddress("glGetQueryObjectuiv")) != 0L) ? 1 : 0);
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
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private boolean GL20_initNativeFunctionAddresses() {
/* 3646 */     return (((this.GL20_glShaderSource_pointer = GLContext.getFunctionAddress("glShaderSource")) != 0L)) & (((this.GL20_glCreateShader_pointer = GLContext.getFunctionAddress("glCreateShader")) != 0L)) & (((this.GL20_glIsShader_pointer = GLContext.getFunctionAddress("glIsShader")) != 0L) ? 1 : 0) & (((this.GL20_glCompileShader_pointer = GLContext.getFunctionAddress("glCompileShader")) != 0L) ? 1 : 0) & (((this.GL20_glDeleteShader_pointer = GLContext.getFunctionAddress("glDeleteShader")) != 0L) ? 1 : 0) & (((this.GL20_glCreateProgram_pointer = GLContext.getFunctionAddress("glCreateProgram")) != 0L) ? 1 : 0) & (((this.GL20_glIsProgram_pointer = GLContext.getFunctionAddress("glIsProgram")) != 0L) ? 1 : 0) & (((this.GL20_glAttachShader_pointer = GLContext.getFunctionAddress("glAttachShader")) != 0L) ? 1 : 0) & (((this.GL20_glDetachShader_pointer = GLContext.getFunctionAddress("glDetachShader")) != 0L) ? 1 : 0) & (((this.GL20_glLinkProgram_pointer = GLContext.getFunctionAddress("glLinkProgram")) != 0L) ? 1 : 0) & (((this.GL20_glUseProgram_pointer = GLContext.getFunctionAddress("glUseProgram")) != 0L) ? 1 : 0) & (((this.GL20_glValidateProgram_pointer = GLContext.getFunctionAddress("glValidateProgram")) != 0L) ? 1 : 0) & (((this.GL20_glDeleteProgram_pointer = GLContext.getFunctionAddress("glDeleteProgram")) != 0L) ? 1 : 0) & (((this.GL20_glUniform1f_pointer = GLContext.getFunctionAddress("glUniform1f")) != 0L) ? 1 : 0) & (((this.GL20_glUniform2f_pointer = GLContext.getFunctionAddress("glUniform2f")) != 0L) ? 1 : 0) & (((this.GL20_glUniform3f_pointer = GLContext.getFunctionAddress("glUniform3f")) != 0L) ? 1 : 0) & (((this.GL20_glUniform4f_pointer = GLContext.getFunctionAddress("glUniform4f")) != 0L) ? 1 : 0) & (((this.GL20_glUniform1i_pointer = GLContext.getFunctionAddress("glUniform1i")) != 0L) ? 1 : 0) & (((this.GL20_glUniform2i_pointer = GLContext.getFunctionAddress("glUniform2i")) != 0L) ? 1 : 0) & (((this.GL20_glUniform3i_pointer = GLContext.getFunctionAddress("glUniform3i")) != 0L) ? 1 : 0) & (((this.GL20_glUniform4i_pointer = GLContext.getFunctionAddress("glUniform4i")) != 0L) ? 1 : 0) & (((this.GL20_glUniform1fv_pointer = GLContext.getFunctionAddress("glUniform1fv")) != 0L) ? 1 : 0) & (((this.GL20_glUniform2fv_pointer = GLContext.getFunctionAddress("glUniform2fv")) != 0L) ? 1 : 0) & (((this.GL20_glUniform3fv_pointer = GLContext.getFunctionAddress("glUniform3fv")) != 0L) ? 1 : 0) & (((this.GL20_glUniform4fv_pointer = GLContext.getFunctionAddress("glUniform4fv")) != 0L) ? 1 : 0) & (((this.GL20_glUniform1iv_pointer = GLContext.getFunctionAddress("glUniform1iv")) != 0L) ? 1 : 0) & (((this.GL20_glUniform2iv_pointer = GLContext.getFunctionAddress("glUniform2iv")) != 0L) ? 1 : 0) & (((this.GL20_glUniform3iv_pointer = GLContext.getFunctionAddress("glUniform3iv")) != 0L) ? 1 : 0) & (((this.GL20_glUniform4iv_pointer = GLContext.getFunctionAddress("glUniform4iv")) != 0L) ? 1 : 0) & (((this.GL20_glUniformMatrix2fv_pointer = GLContext.getFunctionAddress("glUniformMatrix2fv")) != 0L) ? 1 : 0) & (((this.GL20_glUniformMatrix3fv_pointer = GLContext.getFunctionAddress("glUniformMatrix3fv")) != 0L) ? 1 : 0) & (((this.GL20_glUniformMatrix4fv_pointer = GLContext.getFunctionAddress("glUniformMatrix4fv")) != 0L) ? 1 : 0) & (((this.GL20_glGetShaderiv_pointer = GLContext.getFunctionAddress("glGetShaderiv")) != 0L) ? 1 : 0) & (((this.GL20_glGetProgramiv_pointer = GLContext.getFunctionAddress("glGetProgramiv")) != 0L) ? 1 : 0) & (((this.GL20_glGetShaderInfoLog_pointer = GLContext.getFunctionAddress("glGetShaderInfoLog")) != 0L) ? 1 : 0) & (((this.GL20_glGetProgramInfoLog_pointer = GLContext.getFunctionAddress("glGetProgramInfoLog")) != 0L) ? 1 : 0) & (((this.GL20_glGetAttachedShaders_pointer = GLContext.getFunctionAddress("glGetAttachedShaders")) != 0L) ? 1 : 0) & (((this.GL20_glGetUniformLocation_pointer = GLContext.getFunctionAddress("glGetUniformLocation")) != 0L) ? 1 : 0) & (((this.GL20_glGetActiveUniform_pointer = GLContext.getFunctionAddress("glGetActiveUniform")) != 0L) ? 1 : 0) & (((this.GL20_glGetUniformfv_pointer = GLContext.getFunctionAddress("glGetUniformfv")) != 0L) ? 1 : 0) & (((this.GL20_glGetUniformiv_pointer = GLContext.getFunctionAddress("glGetUniformiv")) != 0L) ? 1 : 0) & (((this.GL20_glGetShaderSource_pointer = GLContext.getFunctionAddress("glGetShaderSource")) != 0L) ? 1 : 0) & (((this.GL20_glVertexAttrib1s_pointer = GLContext.getFunctionAddress("glVertexAttrib1s")) != 0L) ? 1 : 0) & (((this.GL20_glVertexAttrib1f_pointer = GLContext.getFunctionAddress("glVertexAttrib1f")) != 0L) ? 1 : 0) & (((this.GL20_glVertexAttrib1d_pointer = GLContext.getFunctionAddress("glVertexAttrib1d")) != 0L) ? 1 : 0) & (((this.GL20_glVertexAttrib2s_pointer = GLContext.getFunctionAddress("glVertexAttrib2s")) != 0L) ? 1 : 0) & (((this.GL20_glVertexAttrib2f_pointer = GLContext.getFunctionAddress("glVertexAttrib2f")) != 0L) ? 1 : 0) & (((this.GL20_glVertexAttrib2d_pointer = GLContext.getFunctionAddress("glVertexAttrib2d")) != 0L) ? 1 : 0) & (((this.GL20_glVertexAttrib3s_pointer = GLContext.getFunctionAddress("glVertexAttrib3s")) != 0L) ? 1 : 0) & (((this.GL20_glVertexAttrib3f_pointer = GLContext.getFunctionAddress("glVertexAttrib3f")) != 0L) ? 1 : 0) & (((this.GL20_glVertexAttrib3d_pointer = GLContext.getFunctionAddress("glVertexAttrib3d")) != 0L) ? 1 : 0) & (((this.GL20_glVertexAttrib4s_pointer = GLContext.getFunctionAddress("glVertexAttrib4s")) != 0L) ? 1 : 0) & (((this.GL20_glVertexAttrib4f_pointer = GLContext.getFunctionAddress("glVertexAttrib4f")) != 0L) ? 1 : 0) & (((this.GL20_glVertexAttrib4d_pointer = GLContext.getFunctionAddress("glVertexAttrib4d")) != 0L) ? 1 : 0) & (((this.GL20_glVertexAttrib4Nub_pointer = GLContext.getFunctionAddress("glVertexAttrib4Nub")) != 0L) ? 1 : 0) & (((this.GL20_glVertexAttribPointer_pointer = GLContext.getFunctionAddress("glVertexAttribPointer")) != 0L) ? 1 : 0) & (((this.GL20_glEnableVertexAttribArray_pointer = GLContext.getFunctionAddress("glEnableVertexAttribArray")) != 0L) ? 1 : 0) & (((this.GL20_glDisableVertexAttribArray_pointer = GLContext.getFunctionAddress("glDisableVertexAttribArray")) != 0L) ? 1 : 0) & (((this.GL20_glGetVertexAttribfv_pointer = GLContext.getFunctionAddress("glGetVertexAttribfv")) != 0L) ? 1 : 0) & (((this.GL20_glGetVertexAttribdv_pointer = GLContext.getFunctionAddress("glGetVertexAttribdv")) != 0L) ? 1 : 0) & (((this.GL20_glGetVertexAttribiv_pointer = GLContext.getFunctionAddress("glGetVertexAttribiv")) != 0L) ? 1 : 0) & (((this.GL20_glGetVertexAttribPointerv_pointer = GLContext.getFunctionAddress("glGetVertexAttribPointerv")) != 0L) ? 1 : 0) & (((this.GL20_glBindAttribLocation_pointer = GLContext.getFunctionAddress("glBindAttribLocation")) != 0L) ? 1 : 0) & (((this.GL20_glGetActiveAttrib_pointer = GLContext.getFunctionAddress("glGetActiveAttrib")) != 0L) ? 1 : 0) & (((this.GL20_glGetAttribLocation_pointer = GLContext.getFunctionAddress("glGetAttribLocation")) != 0L) ? 1 : 0) & (((this.GL20_glDrawBuffers_pointer = GLContext.getFunctionAddress("glDrawBuffers")) != 0L) ? 1 : 0) & (((this.GL20_glStencilOpSeparate_pointer = GLContext.getFunctionAddress("glStencilOpSeparate")) != 0L) ? 1 : 0) & (((this.GL20_glStencilFuncSeparate_pointer = GLContext.getFunctionAddress("glStencilFuncSeparate")) != 0L) ? 1 : 0) & (((this.GL20_glStencilMaskSeparate_pointer = GLContext.getFunctionAddress("glStencilMaskSeparate")) != 0L) ? 1 : 0) & (((this.GL20_glBlendEquationSeparate_pointer = GLContext.getFunctionAddress("glBlendEquationSeparate")) != 0L) ? 1 : 0);
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
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private boolean GL21_initNativeFunctionAddresses() {
/* 3720 */     return (((this.GL21_glUniformMatrix2x3fv_pointer = GLContext.getFunctionAddress("glUniformMatrix2x3fv")) != 0L)) & (((this.GL21_glUniformMatrix3x2fv_pointer = GLContext.getFunctionAddress("glUniformMatrix3x2fv")) != 0L)) & (((this.GL21_glUniformMatrix2x4fv_pointer = GLContext.getFunctionAddress("glUniformMatrix2x4fv")) != 0L) ? 1 : 0) & (((this.GL21_glUniformMatrix4x2fv_pointer = GLContext.getFunctionAddress("glUniformMatrix4x2fv")) != 0L) ? 1 : 0) & (((this.GL21_glUniformMatrix3x4fv_pointer = GLContext.getFunctionAddress("glUniformMatrix3x4fv")) != 0L) ? 1 : 0) & (((this.GL21_glUniformMatrix4x3fv_pointer = GLContext.getFunctionAddress("glUniformMatrix4x3fv")) != 0L) ? 1 : 0);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private boolean GL30_initNativeFunctionAddresses() {
/* 3730 */     return (((this.GL30_glGetStringi_pointer = GLContext.getFunctionAddress("glGetStringi")) != 0L)) & (((this.GL30_glClearBufferfv_pointer = GLContext.getFunctionAddress("glClearBufferfv")) != 0L)) & (((this.GL30_glClearBufferiv_pointer = GLContext.getFunctionAddress("glClearBufferiv")) != 0L) ? 1 : 0) & (((this.GL30_glClearBufferuiv_pointer = GLContext.getFunctionAddress("glClearBufferuiv")) != 0L) ? 1 : 0) & (((this.GL30_glClearBufferfi_pointer = GLContext.getFunctionAddress("glClearBufferfi")) != 0L) ? 1 : 0) & (((this.GL30_glVertexAttribI1i_pointer = GLContext.getFunctionAddress("glVertexAttribI1i")) != 0L) ? 1 : 0) & (((this.GL30_glVertexAttribI2i_pointer = GLContext.getFunctionAddress("glVertexAttribI2i")) != 0L) ? 1 : 0) & (((this.GL30_glVertexAttribI3i_pointer = GLContext.getFunctionAddress("glVertexAttribI3i")) != 0L) ? 1 : 0) & (((this.GL30_glVertexAttribI4i_pointer = GLContext.getFunctionAddress("glVertexAttribI4i")) != 0L) ? 1 : 0) & (((this.GL30_glVertexAttribI1ui_pointer = GLContext.getFunctionAddress("glVertexAttribI1ui")) != 0L) ? 1 : 0) & (((this.GL30_glVertexAttribI2ui_pointer = GLContext.getFunctionAddress("glVertexAttribI2ui")) != 0L) ? 1 : 0) & (((this.GL30_glVertexAttribI3ui_pointer = GLContext.getFunctionAddress("glVertexAttribI3ui")) != 0L) ? 1 : 0) & (((this.GL30_glVertexAttribI4ui_pointer = GLContext.getFunctionAddress("glVertexAttribI4ui")) != 0L) ? 1 : 0) & (((this.GL30_glVertexAttribI1iv_pointer = GLContext.getFunctionAddress("glVertexAttribI1iv")) != 0L) ? 1 : 0) & (((this.GL30_glVertexAttribI2iv_pointer = GLContext.getFunctionAddress("glVertexAttribI2iv")) != 0L) ? 1 : 0) & (((this.GL30_glVertexAttribI3iv_pointer = GLContext.getFunctionAddress("glVertexAttribI3iv")) != 0L) ? 1 : 0) & (((this.GL30_glVertexAttribI4iv_pointer = GLContext.getFunctionAddress("glVertexAttribI4iv")) != 0L) ? 1 : 0) & (((this.GL30_glVertexAttribI1uiv_pointer = GLContext.getFunctionAddress("glVertexAttribI1uiv")) != 0L) ? 1 : 0) & (((this.GL30_glVertexAttribI2uiv_pointer = GLContext.getFunctionAddress("glVertexAttribI2uiv")) != 0L) ? 1 : 0) & (((this.GL30_glVertexAttribI3uiv_pointer = GLContext.getFunctionAddress("glVertexAttribI3uiv")) != 0L) ? 1 : 0) & (((this.GL30_glVertexAttribI4uiv_pointer = GLContext.getFunctionAddress("glVertexAttribI4uiv")) != 0L) ? 1 : 0) & (((this.GL30_glVertexAttribI4bv_pointer = GLContext.getFunctionAddress("glVertexAttribI4bv")) != 0L) ? 1 : 0) & (((this.GL30_glVertexAttribI4sv_pointer = GLContext.getFunctionAddress("glVertexAttribI4sv")) != 0L) ? 1 : 0) & (((this.GL30_glVertexAttribI4ubv_pointer = GLContext.getFunctionAddress("glVertexAttribI4ubv")) != 0L) ? 1 : 0) & (((this.GL30_glVertexAttribI4usv_pointer = GLContext.getFunctionAddress("glVertexAttribI4usv")) != 0L) ? 1 : 0) & (((this.GL30_glVertexAttribIPointer_pointer = GLContext.getFunctionAddress("glVertexAttribIPointer")) != 0L) ? 1 : 0) & (((this.GL30_glGetVertexAttribIiv_pointer = GLContext.getFunctionAddress("glGetVertexAttribIiv")) != 0L) ? 1 : 0) & (((this.GL30_glGetVertexAttribIuiv_pointer = GLContext.getFunctionAddress("glGetVertexAttribIuiv")) != 0L) ? 1 : 0) & (((this.GL30_glUniform1ui_pointer = GLContext.getFunctionAddress("glUniform1ui")) != 0L) ? 1 : 0) & (((this.GL30_glUniform2ui_pointer = GLContext.getFunctionAddress("glUniform2ui")) != 0L) ? 1 : 0) & (((this.GL30_glUniform3ui_pointer = GLContext.getFunctionAddress("glUniform3ui")) != 0L) ? 1 : 0) & (((this.GL30_glUniform4ui_pointer = GLContext.getFunctionAddress("glUniform4ui")) != 0L) ? 1 : 0) & (((this.GL30_glUniform1uiv_pointer = GLContext.getFunctionAddress("glUniform1uiv")) != 0L) ? 1 : 0) & (((this.GL30_glUniform2uiv_pointer = GLContext.getFunctionAddress("glUniform2uiv")) != 0L) ? 1 : 0) & (((this.GL30_glUniform3uiv_pointer = GLContext.getFunctionAddress("glUniform3uiv")) != 0L) ? 1 : 0) & (((this.GL30_glUniform4uiv_pointer = GLContext.getFunctionAddress("glUniform4uiv")) != 0L) ? 1 : 0) & (((this.GL30_glGetUniformuiv_pointer = GLContext.getFunctionAddress("glGetUniformuiv")) != 0L) ? 1 : 0) & (((this.GL30_glBindFragDataLocation_pointer = GLContext.getFunctionAddress("glBindFragDataLocation")) != 0L) ? 1 : 0) & (((this.GL30_glGetFragDataLocation_pointer = GLContext.getFunctionAddress("glGetFragDataLocation")) != 0L) ? 1 : 0) & (((this.GL30_glBeginConditionalRender_pointer = GLContext.getFunctionAddress("glBeginConditionalRender")) != 0L) ? 1 : 0) & (((this.GL30_glEndConditionalRender_pointer = GLContext.getFunctionAddress("glEndConditionalRender")) != 0L) ? 1 : 0) & (((this.GL30_glMapBufferRange_pointer = GLContext.getFunctionAddress("glMapBufferRange")) != 0L) ? 1 : 0) & (((this.GL30_glFlushMappedBufferRange_pointer = GLContext.getFunctionAddress("glFlushMappedBufferRange")) != 0L) ? 1 : 0) & (((this.GL30_glClampColor_pointer = GLContext.getFunctionAddress("glClampColor")) != 0L) ? 1 : 0) & (((this.GL30_glIsRenderbuffer_pointer = GLContext.getFunctionAddress("glIsRenderbuffer")) != 0L) ? 1 : 0) & (((this.GL30_glBindRenderbuffer_pointer = GLContext.getFunctionAddress("glBindRenderbuffer")) != 0L) ? 1 : 0) & (((this.GL30_glDeleteRenderbuffers_pointer = GLContext.getFunctionAddress("glDeleteRenderbuffers")) != 0L) ? 1 : 0) & (((this.GL30_glGenRenderbuffers_pointer = GLContext.getFunctionAddress("glGenRenderbuffers")) != 0L) ? 1 : 0) & (((this.GL30_glRenderbufferStorage_pointer = GLContext.getFunctionAddress("glRenderbufferStorage")) != 0L) ? 1 : 0) & (((this.GL30_glGetRenderbufferParameteriv_pointer = GLContext.getFunctionAddress("glGetRenderbufferParameteriv")) != 0L) ? 1 : 0) & (((this.GL30_glIsFramebuffer_pointer = GLContext.getFunctionAddress("glIsFramebuffer")) != 0L) ? 1 : 0) & (((this.GL30_glBindFramebuffer_pointer = GLContext.getFunctionAddress("glBindFramebuffer")) != 0L) ? 1 : 0) & (((this.GL30_glDeleteFramebuffers_pointer = GLContext.getFunctionAddress("glDeleteFramebuffers")) != 0L) ? 1 : 0) & (((this.GL30_glGenFramebuffers_pointer = GLContext.getFunctionAddress("glGenFramebuffers")) != 0L) ? 1 : 0) & (((this.GL30_glCheckFramebufferStatus_pointer = GLContext.getFunctionAddress("glCheckFramebufferStatus")) != 0L) ? 1 : 0) & (((this.GL30_glFramebufferTexture1D_pointer = GLContext.getFunctionAddress("glFramebufferTexture1D")) != 0L) ? 1 : 0) & (((this.GL30_glFramebufferTexture2D_pointer = GLContext.getFunctionAddress("glFramebufferTexture2D")) != 0L) ? 1 : 0) & (((this.GL30_glFramebufferTexture3D_pointer = GLContext.getFunctionAddress("glFramebufferTexture3D")) != 0L) ? 1 : 0) & (((this.GL30_glFramebufferRenderbuffer_pointer = GLContext.getFunctionAddress("glFramebufferRenderbuffer")) != 0L) ? 1 : 0) & (((this.GL30_glGetFramebufferAttachmentParameteriv_pointer = GLContext.getFunctionAddress("glGetFramebufferAttachmentParameteriv")) != 0L) ? 1 : 0) & (((this.GL30_glGenerateMipmap_pointer = GLContext.getFunctionAddress("glGenerateMipmap")) != 0L) ? 1 : 0) & (((this.GL30_glRenderbufferStorageMultisample_pointer = GLContext.getFunctionAddress("glRenderbufferStorageMultisample")) != 0L) ? 1 : 0) & (((this.GL30_glBlitFramebuffer_pointer = GLContext.getFunctionAddress("glBlitFramebuffer")) != 0L) ? 1 : 0) & (((this.GL30_glTexParameterIiv_pointer = GLContext.getFunctionAddress("glTexParameterIiv")) != 0L) ? 1 : 0) & (((this.GL30_glTexParameterIuiv_pointer = GLContext.getFunctionAddress("glTexParameterIuiv")) != 0L) ? 1 : 0) & (((this.GL30_glGetTexParameterIiv_pointer = GLContext.getFunctionAddress("glGetTexParameterIiv")) != 0L) ? 1 : 0) & (((this.GL30_glGetTexParameterIuiv_pointer = GLContext.getFunctionAddress("glGetTexParameterIuiv")) != 0L) ? 1 : 0) & (((this.GL30_glFramebufferTextureLayer_pointer = GLContext.getFunctionAddress("glFramebufferTextureLayer")) != 0L) ? 1 : 0) & (((this.GL30_glColorMaski_pointer = GLContext.getFunctionAddress("glColorMaski")) != 0L) ? 1 : 0) & (((this.GL30_glGetBooleani_v_pointer = GLContext.getFunctionAddress("glGetBooleani_v")) != 0L) ? 1 : 0) & (((this.GL30_glGetIntegeri_v_pointer = GLContext.getFunctionAddress("glGetIntegeri_v")) != 0L) ? 1 : 0) & (((this.GL30_glEnablei_pointer = GLContext.getFunctionAddress("glEnablei")) != 0L) ? 1 : 0) & (((this.GL30_glDisablei_pointer = GLContext.getFunctionAddress("glDisablei")) != 0L) ? 1 : 0) & (((this.GL30_glIsEnabledi_pointer = GLContext.getFunctionAddress("glIsEnabledi")) != 0L) ? 1 : 0) & (((this.GL30_glBindBufferRange_pointer = GLContext.getFunctionAddress("glBindBufferRange")) != 0L) ? 1 : 0) & (((this.GL30_glBindBufferBase_pointer = GLContext.getFunctionAddress("glBindBufferBase")) != 0L) ? 1 : 0) & (((this.GL30_glBeginTransformFeedback_pointer = GLContext.getFunctionAddress("glBeginTransformFeedback")) != 0L) ? 1 : 0) & (((this.GL30_glEndTransformFeedback_pointer = GLContext.getFunctionAddress("glEndTransformFeedback")) != 0L) ? 1 : 0) & (((this.GL30_glTransformFeedbackVaryings_pointer = GLContext.getFunctionAddress("glTransformFeedbackVaryings")) != 0L) ? 1 : 0) & (((this.GL30_glGetTransformFeedbackVarying_pointer = GLContext.getFunctionAddress("glGetTransformFeedbackVarying")) != 0L) ? 1 : 0) & (((this.GL30_glBindVertexArray_pointer = GLContext.getFunctionAddress("glBindVertexArray")) != 0L) ? 1 : 0) & (((this.GL30_glDeleteVertexArrays_pointer = GLContext.getFunctionAddress("glDeleteVertexArrays")) != 0L) ? 1 : 0) & (((this.GL30_glGenVertexArrays_pointer = GLContext.getFunctionAddress("glGenVertexArrays")) != 0L) ? 1 : 0) & (((this.GL30_glIsVertexArray_pointer = GLContext.getFunctionAddress("glIsVertexArray")) != 0L) ? 1 : 0);
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
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private boolean GL31_initNativeFunctionAddresses() {
/* 3818 */     return (((this.GL31_glDrawArraysInstanced_pointer = GLContext.getFunctionAddress("glDrawArraysInstanced")) != 0L)) & (((this.GL31_glDrawElementsInstanced_pointer = GLContext.getFunctionAddress("glDrawElementsInstanced")) != 0L)) & (((this.GL31_glCopyBufferSubData_pointer = GLContext.getFunctionAddress("glCopyBufferSubData")) != 0L) ? 1 : 0) & (((this.GL31_glPrimitiveRestartIndex_pointer = GLContext.getFunctionAddress("glPrimitiveRestartIndex")) != 0L) ? 1 : 0) & (((this.GL31_glTexBuffer_pointer = GLContext.getFunctionAddress("glTexBuffer")) != 0L) ? 1 : 0) & (((this.GL31_glGetUniformIndices_pointer = GLContext.getFunctionAddress("glGetUniformIndices")) != 0L) ? 1 : 0) & (((this.GL31_glGetActiveUniformsiv_pointer = GLContext.getFunctionAddress("glGetActiveUniformsiv")) != 0L) ? 1 : 0) & (((this.GL31_glGetActiveUniformName_pointer = GLContext.getFunctionAddress("glGetActiveUniformName")) != 0L) ? 1 : 0) & (((this.GL31_glGetUniformBlockIndex_pointer = GLContext.getFunctionAddress("glGetUniformBlockIndex")) != 0L) ? 1 : 0) & (((this.GL31_glGetActiveUniformBlockiv_pointer = GLContext.getFunctionAddress("glGetActiveUniformBlockiv")) != 0L) ? 1 : 0) & (((this.GL31_glGetActiveUniformBlockName_pointer = GLContext.getFunctionAddress("glGetActiveUniformBlockName")) != 0L) ? 1 : 0) & (((this.GL31_glUniformBlockBinding_pointer = GLContext.getFunctionAddress("glUniformBlockBinding")) != 0L) ? 1 : 0);
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
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private boolean GL32_initNativeFunctionAddresses() {
/*      */     // Byte code:
/*      */     //   0: aload_0
/*      */     //   1: ldc 'glDrawElementsBaseVertex'
/*      */     //   3: invokestatic getFunctionAddress : (Ljava/lang/String;)J
/*      */     //   6: dup2_x1
/*      */     //   7: putfield GL32_glDrawElementsBaseVertex_pointer : J
/*      */     //   10: lconst_0
/*      */     //   11: lcmp
/*      */     //   12: ifeq -> 19
/*      */     //   15: iconst_1
/*      */     //   16: goto -> 20
/*      */     //   19: iconst_0
/*      */     //   20: aload_0
/*      */     //   21: ldc 'glDrawRangeElementsBaseVertex'
/*      */     //   23: invokestatic getFunctionAddress : (Ljava/lang/String;)J
/*      */     //   26: dup2_x1
/*      */     //   27: putfield GL32_glDrawRangeElementsBaseVertex_pointer : J
/*      */     //   30: lconst_0
/*      */     //   31: lcmp
/*      */     //   32: ifeq -> 39
/*      */     //   35: iconst_1
/*      */     //   36: goto -> 40
/*      */     //   39: iconst_0
/*      */     //   40: iand
/*      */     //   41: aload_0
/*      */     //   42: ldc 'glDrawElementsInstancedBaseVertex'
/*      */     //   44: invokestatic getFunctionAddress : (Ljava/lang/String;)J
/*      */     //   47: dup2_x1
/*      */     //   48: putfield GL32_glDrawElementsInstancedBaseVertex_pointer : J
/*      */     //   51: lconst_0
/*      */     //   52: lcmp
/*      */     //   53: ifeq -> 60
/*      */     //   56: iconst_1
/*      */     //   57: goto -> 61
/*      */     //   60: iconst_0
/*      */     //   61: iand
/*      */     //   62: aload_0
/*      */     //   63: ldc_w 'glProvokingVertex'
/*      */     //   66: invokestatic getFunctionAddress : (Ljava/lang/String;)J
/*      */     //   69: dup2_x1
/*      */     //   70: putfield GL32_glProvokingVertex_pointer : J
/*      */     //   73: lconst_0
/*      */     //   74: lcmp
/*      */     //   75: ifeq -> 82
/*      */     //   78: iconst_1
/*      */     //   79: goto -> 83
/*      */     //   82: iconst_0
/*      */     //   83: iand
/*      */     //   84: aload_0
/*      */     //   85: ldc_w 'glTexImage2DMultisample'
/*      */     //   88: invokestatic getFunctionAddress : (Ljava/lang/String;)J
/*      */     //   91: dup2_x1
/*      */     //   92: putfield GL32_glTexImage2DMultisample_pointer : J
/*      */     //   95: lconst_0
/*      */     //   96: lcmp
/*      */     //   97: ifeq -> 104
/*      */     //   100: iconst_1
/*      */     //   101: goto -> 105
/*      */     //   104: iconst_0
/*      */     //   105: iand
/*      */     //   106: aload_0
/*      */     //   107: ldc_w 'glTexImage3DMultisample'
/*      */     //   110: invokestatic getFunctionAddress : (Ljava/lang/String;)J
/*      */     //   113: dup2_x1
/*      */     //   114: putfield GL32_glTexImage3DMultisample_pointer : J
/*      */     //   117: lconst_0
/*      */     //   118: lcmp
/*      */     //   119: ifeq -> 126
/*      */     //   122: iconst_1
/*      */     //   123: goto -> 127
/*      */     //   126: iconst_0
/*      */     //   127: iand
/*      */     //   128: aload_0
/*      */     //   129: ldc_w 'glGetMultisamplefv'
/*      */     //   132: invokestatic getFunctionAddress : (Ljava/lang/String;)J
/*      */     //   135: dup2_x1
/*      */     //   136: putfield GL32_glGetMultisamplefv_pointer : J
/*      */     //   139: lconst_0
/*      */     //   140: lcmp
/*      */     //   141: ifeq -> 148
/*      */     //   144: iconst_1
/*      */     //   145: goto -> 149
/*      */     //   148: iconst_0
/*      */     //   149: iand
/*      */     //   150: aload_0
/*      */     //   151: ldc_w 'glSampleMaski'
/*      */     //   154: invokestatic getFunctionAddress : (Ljava/lang/String;)J
/*      */     //   157: dup2_x1
/*      */     //   158: putfield GL32_glSampleMaski_pointer : J
/*      */     //   161: lconst_0
/*      */     //   162: lcmp
/*      */     //   163: ifeq -> 170
/*      */     //   166: iconst_1
/*      */     //   167: goto -> 171
/*      */     //   170: iconst_0
/*      */     //   171: iand
/*      */     //   172: aload_0
/*      */     //   173: ldc_w 'glFramebufferTexture'
/*      */     //   176: invokestatic getFunctionAddress : (Ljava/lang/String;)J
/*      */     //   179: dup2_x1
/*      */     //   180: putfield GL32_glFramebufferTexture_pointer : J
/*      */     //   183: lconst_0
/*      */     //   184: lcmp
/*      */     //   185: ifeq -> 192
/*      */     //   188: iconst_1
/*      */     //   189: goto -> 193
/*      */     //   192: iconst_0
/*      */     //   193: iand
/*      */     //   194: aload_0
/*      */     //   195: ldc 'glFramebufferTextureLayer'
/*      */     //   197: invokestatic getFunctionAddress : (Ljava/lang/String;)J
/*      */     //   200: dup2_x1
/*      */     //   201: putfield GL32_glFramebufferTextureLayer_pointer : J
/*      */     //   204: lconst_0
/*      */     //   205: lcmp
/*      */     //   206: ifeq -> 213
/*      */     //   209: iconst_1
/*      */     //   210: goto -> 214
/*      */     //   213: iconst_0
/*      */     //   214: iand
/*      */     //   215: aload_0
/*      */     //   216: ldc_w 'glFenceSync'
/*      */     //   219: invokestatic getFunctionAddress : (Ljava/lang/String;)J
/*      */     //   222: dup2_x1
/*      */     //   223: putfield GL32_glFenceSync_pointer : J
/*      */     //   226: lconst_0
/*      */     //   227: lcmp
/*      */     //   228: ifeq -> 235
/*      */     //   231: iconst_1
/*      */     //   232: goto -> 236
/*      */     //   235: iconst_0
/*      */     //   236: iand
/*      */     //   237: aload_0
/*      */     //   238: ldc_w 'glIsSync'
/*      */     //   241: invokestatic getFunctionAddress : (Ljava/lang/String;)J
/*      */     //   244: dup2_x1
/*      */     //   245: putfield GL32_glIsSync_pointer : J
/*      */     //   248: lconst_0
/*      */     //   249: lcmp
/*      */     //   250: ifeq -> 257
/*      */     //   253: iconst_1
/*      */     //   254: goto -> 258
/*      */     //   257: iconst_0
/*      */     //   258: iand
/*      */     //   259: aload_0
/*      */     //   260: ldc_w 'glDeleteSync'
/*      */     //   263: invokestatic getFunctionAddress : (Ljava/lang/String;)J
/*      */     //   266: dup2_x1
/*      */     //   267: putfield GL32_glDeleteSync_pointer : J
/*      */     //   270: lconst_0
/*      */     //   271: lcmp
/*      */     //   272: ifeq -> 279
/*      */     //   275: iconst_1
/*      */     //   276: goto -> 280
/*      */     //   279: iconst_0
/*      */     //   280: iand
/*      */     //   281: aload_0
/*      */     //   282: ldc_w 'glClientWaitSync'
/*      */     //   285: invokestatic getFunctionAddress : (Ljava/lang/String;)J
/*      */     //   288: dup2_x1
/*      */     //   289: putfield GL32_glClientWaitSync_pointer : J
/*      */     //   292: lconst_0
/*      */     //   293: lcmp
/*      */     //   294: ifeq -> 301
/*      */     //   297: iconst_1
/*      */     //   298: goto -> 302
/*      */     //   301: iconst_0
/*      */     //   302: iand
/*      */     //   303: aload_0
/*      */     //   304: ldc_w 'glWaitSync'
/*      */     //   307: invokestatic getFunctionAddress : (Ljava/lang/String;)J
/*      */     //   310: dup2_x1
/*      */     //   311: putfield GL32_glWaitSync_pointer : J
/*      */     //   314: lconst_0
/*      */     //   315: lcmp
/*      */     //   316: ifeq -> 323
/*      */     //   319: iconst_1
/*      */     //   320: goto -> 324
/*      */     //   323: iconst_0
/*      */     //   324: iand
/*      */     //   325: aload_0
/*      */     //   326: ldc_w 'glGetInteger64v'
/*      */     //   329: invokestatic getFunctionAddress : (Ljava/lang/String;)J
/*      */     //   332: dup2_x1
/*      */     //   333: putfield GL32_glGetInteger64v_pointer : J
/*      */     //   336: lconst_0
/*      */     //   337: lcmp
/*      */     //   338: ifeq -> 345
/*      */     //   341: iconst_1
/*      */     //   342: goto -> 346
/*      */     //   345: iconst_0
/*      */     //   346: iand
/*      */     //   347: aload_0
/*      */     //   348: ldc_w 'glGetInteger64i_v'
/*      */     //   351: invokestatic getFunctionAddress : (Ljava/lang/String;)J
/*      */     //   354: dup2_x1
/*      */     //   355: putfield GL32_glGetInteger64i_v_pointer : J
/*      */     //   358: lconst_0
/*      */     //   359: lcmp
/*      */     //   360: ifne -> 363
/*      */     //   363: iconst_1
/*      */     //   364: iand
/*      */     //   365: aload_0
/*      */     //   366: ldc_w 'glGetSynciv'
/*      */     //   369: invokestatic getFunctionAddress : (Ljava/lang/String;)J
/*      */     //   372: dup2_x1
/*      */     //   373: putfield GL32_glGetSynciv_pointer : J
/*      */     //   376: lconst_0
/*      */     //   377: lcmp
/*      */     //   378: ifeq -> 385
/*      */     //   381: iconst_1
/*      */     //   382: goto -> 386
/*      */     //   385: iconst_0
/*      */     //   386: iand
/*      */     //   387: ireturn
/*      */     // Line number table:
/*      */     //   Java source line number -> byte code offset
/*      */     //   #3834	-> 0
/*      */     // Local variable table:
/*      */     //   start	length	slot	name	descriptor
/*      */     //   0	388	0	this	Lorg/lwjgl/opengl/ContextCapabilities;
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
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private boolean GL33_initNativeFunctionAddresses(boolean forwardCompatible) {
/* 3856 */     return (((this.GL33_glBindFragDataLocationIndexed_pointer = GLContext.getFunctionAddress("glBindFragDataLocationIndexed")) != 0L)) & (((this.GL33_glGetFragDataIndex_pointer = GLContext.getFunctionAddress("glGetFragDataIndex")) != 0L)) & (((this.GL33_glGenSamplers_pointer = GLContext.getFunctionAddress("glGenSamplers")) != 0L) ? 1 : 0) & (((this.GL33_glDeleteSamplers_pointer = GLContext.getFunctionAddress("glDeleteSamplers")) != 0L) ? 1 : 0) & (((this.GL33_glIsSampler_pointer = GLContext.getFunctionAddress("glIsSampler")) != 0L) ? 1 : 0) & (((this.GL33_glBindSampler_pointer = GLContext.getFunctionAddress("glBindSampler")) != 0L) ? 1 : 0) & (((this.GL33_glSamplerParameteri_pointer = GLContext.getFunctionAddress("glSamplerParameteri")) != 0L) ? 1 : 0) & (((this.GL33_glSamplerParameterf_pointer = GLContext.getFunctionAddress("glSamplerParameterf")) != 0L) ? 1 : 0) & (((this.GL33_glSamplerParameteriv_pointer = GLContext.getFunctionAddress("glSamplerParameteriv")) != 0L) ? 1 : 0) & (((this.GL33_glSamplerParameterfv_pointer = GLContext.getFunctionAddress("glSamplerParameterfv")) != 0L) ? 1 : 0) & (((this.GL33_glSamplerParameterIiv_pointer = GLContext.getFunctionAddress("glSamplerParameterIiv")) != 0L) ? 1 : 0) & (((this.GL33_glSamplerParameterIuiv_pointer = GLContext.getFunctionAddress("glSamplerParameterIuiv")) != 0L) ? 1 : 0) & (((this.GL33_glGetSamplerParameteriv_pointer = GLContext.getFunctionAddress("glGetSamplerParameteriv")) != 0L) ? 1 : 0) & (((this.GL33_glGetSamplerParameterfv_pointer = GLContext.getFunctionAddress("glGetSamplerParameterfv")) != 0L) ? 1 : 0) & (((this.GL33_glGetSamplerParameterIiv_pointer = GLContext.getFunctionAddress("glGetSamplerParameterIiv")) != 0L) ? 1 : 0) & (((this.GL33_glGetSamplerParameterIuiv_pointer = GLContext.getFunctionAddress("glGetSamplerParameterIuiv")) != 0L) ? 1 : 0) & (((this.GL33_glQueryCounter_pointer = GLContext.getFunctionAddress("glQueryCounter")) != 0L) ? 1 : 0) & (((this.GL33_glGetQueryObjecti64v_pointer = GLContext.getFunctionAddress("glGetQueryObjecti64v")) != 0L) ? 1 : 0) & (((this.GL33_glGetQueryObjectui64v_pointer = GLContext.getFunctionAddress("glGetQueryObjectui64v")) != 0L) ? 1 : 0) & (((this.GL33_glVertexAttribDivisor_pointer = GLContext.getFunctionAddress("glVertexAttribDivisor")) != 0L) ? 1 : 0) & ((forwardCompatible || (this.GL33_glVertexP2ui_pointer = GLContext.getFunctionAddress("glVertexP2ui")) != 0L) ? 1 : 0) & ((forwardCompatible || (this.GL33_glVertexP3ui_pointer = GLContext.getFunctionAddress("glVertexP3ui")) != 0L) ? 1 : 0) & ((forwardCompatible || (this.GL33_glVertexP4ui_pointer = GLContext.getFunctionAddress("glVertexP4ui")) != 0L) ? 1 : 0) & ((forwardCompatible || (this.GL33_glVertexP2uiv_pointer = GLContext.getFunctionAddress("glVertexP2uiv")) != 0L) ? 1 : 0) & ((forwardCompatible || (this.GL33_glVertexP3uiv_pointer = GLContext.getFunctionAddress("glVertexP3uiv")) != 0L) ? 1 : 0) & ((forwardCompatible || (this.GL33_glVertexP4uiv_pointer = GLContext.getFunctionAddress("glVertexP4uiv")) != 0L) ? 1 : 0) & ((forwardCompatible || (this.GL33_glTexCoordP1ui_pointer = GLContext.getFunctionAddress("glTexCoordP1ui")) != 0L) ? 1 : 0) & ((forwardCompatible || (this.GL33_glTexCoordP2ui_pointer = GLContext.getFunctionAddress("glTexCoordP2ui")) != 0L) ? 1 : 0) & ((forwardCompatible || (this.GL33_glTexCoordP3ui_pointer = GLContext.getFunctionAddress("glTexCoordP3ui")) != 0L) ? 1 : 0) & ((forwardCompatible || (this.GL33_glTexCoordP4ui_pointer = GLContext.getFunctionAddress("glTexCoordP4ui")) != 0L) ? 1 : 0) & ((forwardCompatible || (this.GL33_glTexCoordP1uiv_pointer = GLContext.getFunctionAddress("glTexCoordP1uiv")) != 0L) ? 1 : 0) & ((forwardCompatible || (this.GL33_glTexCoordP2uiv_pointer = GLContext.getFunctionAddress("glTexCoordP2uiv")) != 0L) ? 1 : 0) & ((forwardCompatible || (this.GL33_glTexCoordP3uiv_pointer = GLContext.getFunctionAddress("glTexCoordP3uiv")) != 0L) ? 1 : 0) & ((forwardCompatible || (this.GL33_glTexCoordP4uiv_pointer = GLContext.getFunctionAddress("glTexCoordP4uiv")) != 0L) ? 1 : 0) & ((forwardCompatible || (this.GL33_glMultiTexCoordP1ui_pointer = GLContext.getFunctionAddress("glMultiTexCoordP1ui")) != 0L) ? 1 : 0) & ((forwardCompatible || (this.GL33_glMultiTexCoordP2ui_pointer = GLContext.getFunctionAddress("glMultiTexCoordP2ui")) != 0L) ? 1 : 0) & ((forwardCompatible || (this.GL33_glMultiTexCoordP3ui_pointer = GLContext.getFunctionAddress("glMultiTexCoordP3ui")) != 0L) ? 1 : 0) & ((forwardCompatible || (this.GL33_glMultiTexCoordP4ui_pointer = GLContext.getFunctionAddress("glMultiTexCoordP4ui")) != 0L) ? 1 : 0) & ((forwardCompatible || (this.GL33_glMultiTexCoordP1uiv_pointer = GLContext.getFunctionAddress("glMultiTexCoordP1uiv")) != 0L) ? 1 : 0) & ((forwardCompatible || (this.GL33_glMultiTexCoordP2uiv_pointer = GLContext.getFunctionAddress("glMultiTexCoordP2uiv")) != 0L) ? 1 : 0) & ((forwardCompatible || (this.GL33_glMultiTexCoordP3uiv_pointer = GLContext.getFunctionAddress("glMultiTexCoordP3uiv")) != 0L) ? 1 : 0) & ((forwardCompatible || (this.GL33_glMultiTexCoordP4uiv_pointer = GLContext.getFunctionAddress("glMultiTexCoordP4uiv")) != 0L) ? 1 : 0) & ((forwardCompatible || (this.GL33_glNormalP3ui_pointer = GLContext.getFunctionAddress("glNormalP3ui")) != 0L) ? 1 : 0) & ((forwardCompatible || (this.GL33_glNormalP3uiv_pointer = GLContext.getFunctionAddress("glNormalP3uiv")) != 0L) ? 1 : 0) & ((forwardCompatible || (this.GL33_glColorP3ui_pointer = GLContext.getFunctionAddress("glColorP3ui")) != 0L) ? 1 : 0) & ((forwardCompatible || (this.GL33_glColorP4ui_pointer = GLContext.getFunctionAddress("glColorP4ui")) != 0L) ? 1 : 0) & ((forwardCompatible || (this.GL33_glColorP3uiv_pointer = GLContext.getFunctionAddress("glColorP3uiv")) != 0L) ? 1 : 0) & ((forwardCompatible || (this.GL33_glColorP4uiv_pointer = GLContext.getFunctionAddress("glColorP4uiv")) != 0L) ? 1 : 0) & ((forwardCompatible || (this.GL33_glSecondaryColorP3ui_pointer = GLContext.getFunctionAddress("glSecondaryColorP3ui")) != 0L) ? 1 : 0) & ((forwardCompatible || (this.GL33_glSecondaryColorP3uiv_pointer = GLContext.getFunctionAddress("glSecondaryColorP3uiv")) != 0L) ? 1 : 0) & ((forwardCompatible || (this.GL33_glVertexAttribP1ui_pointer = GLContext.getFunctionAddress("glVertexAttribP1ui")) != 0L) ? 1 : 0) & ((forwardCompatible || (this.GL33_glVertexAttribP2ui_pointer = GLContext.getFunctionAddress("glVertexAttribP2ui")) != 0L) ? 1 : 0) & ((forwardCompatible || (this.GL33_glVertexAttribP3ui_pointer = GLContext.getFunctionAddress("glVertexAttribP3ui")) != 0L) ? 1 : 0) & ((forwardCompatible || (this.GL33_glVertexAttribP4ui_pointer = GLContext.getFunctionAddress("glVertexAttribP4ui")) != 0L) ? 1 : 0) & ((forwardCompatible || (this.GL33_glVertexAttribP1uiv_pointer = GLContext.getFunctionAddress("glVertexAttribP1uiv")) != 0L) ? 1 : 0) & ((forwardCompatible || (this.GL33_glVertexAttribP2uiv_pointer = GLContext.getFunctionAddress("glVertexAttribP2uiv")) != 0L) ? 1 : 0) & ((forwardCompatible || (this.GL33_glVertexAttribP3uiv_pointer = GLContext.getFunctionAddress("glVertexAttribP3uiv")) != 0L) ? 1 : 0) & ((forwardCompatible || (this.GL33_glVertexAttribP4uiv_pointer = GLContext.getFunctionAddress("glVertexAttribP4uiv")) != 0L) ? 1 : 0);
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
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private boolean GL40_initNativeFunctionAddresses() {
/*      */     // Byte code:
/*      */     //   0: aload_0
/*      */     //   1: ldc_w 'glBlendEquationi'
/*      */     //   4: invokestatic getFunctionAddress : (Ljava/lang/String;)J
/*      */     //   7: dup2_x1
/*      */     //   8: putfield GL40_glBlendEquationi_pointer : J
/*      */     //   11: lconst_0
/*      */     //   12: lcmp
/*      */     //   13: ifne -> 16
/*      */     //   16: iconst_1
/*      */     //   17: aload_0
/*      */     //   18: ldc_w 'glBlendEquationSeparatei'
/*      */     //   21: invokestatic getFunctionAddress : (Ljava/lang/String;)J
/*      */     //   24: dup2_x1
/*      */     //   25: putfield GL40_glBlendEquationSeparatei_pointer : J
/*      */     //   28: lconst_0
/*      */     //   29: lcmp
/*      */     //   30: ifne -> 33
/*      */     //   33: iconst_1
/*      */     //   34: iand
/*      */     //   35: aload_0
/*      */     //   36: ldc_w 'glBlendFunci'
/*      */     //   39: invokestatic getFunctionAddress : (Ljava/lang/String;)J
/*      */     //   42: dup2_x1
/*      */     //   43: putfield GL40_glBlendFunci_pointer : J
/*      */     //   46: lconst_0
/*      */     //   47: lcmp
/*      */     //   48: ifne -> 51
/*      */     //   51: iconst_1
/*      */     //   52: iand
/*      */     //   53: aload_0
/*      */     //   54: ldc_w 'glBlendFuncSeparatei'
/*      */     //   57: invokestatic getFunctionAddress : (Ljava/lang/String;)J
/*      */     //   60: dup2_x1
/*      */     //   61: putfield GL40_glBlendFuncSeparatei_pointer : J
/*      */     //   64: lconst_0
/*      */     //   65: lcmp
/*      */     //   66: ifne -> 69
/*      */     //   69: iconst_1
/*      */     //   70: iand
/*      */     //   71: aload_0
/*      */     //   72: ldc 'glDrawArraysIndirect'
/*      */     //   74: invokestatic getFunctionAddress : (Ljava/lang/String;)J
/*      */     //   77: dup2_x1
/*      */     //   78: putfield GL40_glDrawArraysIndirect_pointer : J
/*      */     //   81: lconst_0
/*      */     //   82: lcmp
/*      */     //   83: ifeq -> 90
/*      */     //   86: iconst_1
/*      */     //   87: goto -> 91
/*      */     //   90: iconst_0
/*      */     //   91: iand
/*      */     //   92: aload_0
/*      */     //   93: ldc 'glDrawElementsIndirect'
/*      */     //   95: invokestatic getFunctionAddress : (Ljava/lang/String;)J
/*      */     //   98: dup2_x1
/*      */     //   99: putfield GL40_glDrawElementsIndirect_pointer : J
/*      */     //   102: lconst_0
/*      */     //   103: lcmp
/*      */     //   104: ifeq -> 111
/*      */     //   107: iconst_1
/*      */     //   108: goto -> 112
/*      */     //   111: iconst_0
/*      */     //   112: iand
/*      */     //   113: aload_0
/*      */     //   114: ldc 'glUniform1d'
/*      */     //   116: invokestatic getFunctionAddress : (Ljava/lang/String;)J
/*      */     //   119: dup2_x1
/*      */     //   120: putfield GL40_glUniform1d_pointer : J
/*      */     //   123: lconst_0
/*      */     //   124: lcmp
/*      */     //   125: ifeq -> 132
/*      */     //   128: iconst_1
/*      */     //   129: goto -> 133
/*      */     //   132: iconst_0
/*      */     //   133: iand
/*      */     //   134: aload_0
/*      */     //   135: ldc 'glUniform2d'
/*      */     //   137: invokestatic getFunctionAddress : (Ljava/lang/String;)J
/*      */     //   140: dup2_x1
/*      */     //   141: putfield GL40_glUniform2d_pointer : J
/*      */     //   144: lconst_0
/*      */     //   145: lcmp
/*      */     //   146: ifeq -> 153
/*      */     //   149: iconst_1
/*      */     //   150: goto -> 154
/*      */     //   153: iconst_0
/*      */     //   154: iand
/*      */     //   155: aload_0
/*      */     //   156: ldc 'glUniform3d'
/*      */     //   158: invokestatic getFunctionAddress : (Ljava/lang/String;)J
/*      */     //   161: dup2_x1
/*      */     //   162: putfield GL40_glUniform3d_pointer : J
/*      */     //   165: lconst_0
/*      */     //   166: lcmp
/*      */     //   167: ifeq -> 174
/*      */     //   170: iconst_1
/*      */     //   171: goto -> 175
/*      */     //   174: iconst_0
/*      */     //   175: iand
/*      */     //   176: aload_0
/*      */     //   177: ldc 'glUniform4d'
/*      */     //   179: invokestatic getFunctionAddress : (Ljava/lang/String;)J
/*      */     //   182: dup2_x1
/*      */     //   183: putfield GL40_glUniform4d_pointer : J
/*      */     //   186: lconst_0
/*      */     //   187: lcmp
/*      */     //   188: ifeq -> 195
/*      */     //   191: iconst_1
/*      */     //   192: goto -> 196
/*      */     //   195: iconst_0
/*      */     //   196: iand
/*      */     //   197: aload_0
/*      */     //   198: ldc 'glUniform1dv'
/*      */     //   200: invokestatic getFunctionAddress : (Ljava/lang/String;)J
/*      */     //   203: dup2_x1
/*      */     //   204: putfield GL40_glUniform1dv_pointer : J
/*      */     //   207: lconst_0
/*      */     //   208: lcmp
/*      */     //   209: ifeq -> 216
/*      */     //   212: iconst_1
/*      */     //   213: goto -> 217
/*      */     //   216: iconst_0
/*      */     //   217: iand
/*      */     //   218: aload_0
/*      */     //   219: ldc 'glUniform2dv'
/*      */     //   221: invokestatic getFunctionAddress : (Ljava/lang/String;)J
/*      */     //   224: dup2_x1
/*      */     //   225: putfield GL40_glUniform2dv_pointer : J
/*      */     //   228: lconst_0
/*      */     //   229: lcmp
/*      */     //   230: ifeq -> 237
/*      */     //   233: iconst_1
/*      */     //   234: goto -> 238
/*      */     //   237: iconst_0
/*      */     //   238: iand
/*      */     //   239: aload_0
/*      */     //   240: ldc 'glUniform3dv'
/*      */     //   242: invokestatic getFunctionAddress : (Ljava/lang/String;)J
/*      */     //   245: dup2_x1
/*      */     //   246: putfield GL40_glUniform3dv_pointer : J
/*      */     //   249: lconst_0
/*      */     //   250: lcmp
/*      */     //   251: ifeq -> 258
/*      */     //   254: iconst_1
/*      */     //   255: goto -> 259
/*      */     //   258: iconst_0
/*      */     //   259: iand
/*      */     //   260: aload_0
/*      */     //   261: ldc 'glUniform4dv'
/*      */     //   263: invokestatic getFunctionAddress : (Ljava/lang/String;)J
/*      */     //   266: dup2_x1
/*      */     //   267: putfield GL40_glUniform4dv_pointer : J
/*      */     //   270: lconst_0
/*      */     //   271: lcmp
/*      */     //   272: ifeq -> 279
/*      */     //   275: iconst_1
/*      */     //   276: goto -> 280
/*      */     //   279: iconst_0
/*      */     //   280: iand
/*      */     //   281: aload_0
/*      */     //   282: ldc 'glUniformMatrix2dv'
/*      */     //   284: invokestatic getFunctionAddress : (Ljava/lang/String;)J
/*      */     //   287: dup2_x1
/*      */     //   288: putfield GL40_glUniformMatrix2dv_pointer : J
/*      */     //   291: lconst_0
/*      */     //   292: lcmp
/*      */     //   293: ifeq -> 300
/*      */     //   296: iconst_1
/*      */     //   297: goto -> 301
/*      */     //   300: iconst_0
/*      */     //   301: iand
/*      */     //   302: aload_0
/*      */     //   303: ldc 'glUniformMatrix3dv'
/*      */     //   305: invokestatic getFunctionAddress : (Ljava/lang/String;)J
/*      */     //   308: dup2_x1
/*      */     //   309: putfield GL40_glUniformMatrix3dv_pointer : J
/*      */     //   312: lconst_0
/*      */     //   313: lcmp
/*      */     //   314: ifeq -> 321
/*      */     //   317: iconst_1
/*      */     //   318: goto -> 322
/*      */     //   321: iconst_0
/*      */     //   322: iand
/*      */     //   323: aload_0
/*      */     //   324: ldc 'glUniformMatrix4dv'
/*      */     //   326: invokestatic getFunctionAddress : (Ljava/lang/String;)J
/*      */     //   329: dup2_x1
/*      */     //   330: putfield GL40_glUniformMatrix4dv_pointer : J
/*      */     //   333: lconst_0
/*      */     //   334: lcmp
/*      */     //   335: ifeq -> 342
/*      */     //   338: iconst_1
/*      */     //   339: goto -> 343
/*      */     //   342: iconst_0
/*      */     //   343: iand
/*      */     //   344: aload_0
/*      */     //   345: ldc 'glUniformMatrix2x3dv'
/*      */     //   347: invokestatic getFunctionAddress : (Ljava/lang/String;)J
/*      */     //   350: dup2_x1
/*      */     //   351: putfield GL40_glUniformMatrix2x3dv_pointer : J
/*      */     //   354: lconst_0
/*      */     //   355: lcmp
/*      */     //   356: ifeq -> 363
/*      */     //   359: iconst_1
/*      */     //   360: goto -> 364
/*      */     //   363: iconst_0
/*      */     //   364: iand
/*      */     //   365: aload_0
/*      */     //   366: ldc 'glUniformMatrix2x4dv'
/*      */     //   368: invokestatic getFunctionAddress : (Ljava/lang/String;)J
/*      */     //   371: dup2_x1
/*      */     //   372: putfield GL40_glUniformMatrix2x4dv_pointer : J
/*      */     //   375: lconst_0
/*      */     //   376: lcmp
/*      */     //   377: ifeq -> 384
/*      */     //   380: iconst_1
/*      */     //   381: goto -> 385
/*      */     //   384: iconst_0
/*      */     //   385: iand
/*      */     //   386: aload_0
/*      */     //   387: ldc 'glUniformMatrix3x2dv'
/*      */     //   389: invokestatic getFunctionAddress : (Ljava/lang/String;)J
/*      */     //   392: dup2_x1
/*      */     //   393: putfield GL40_glUniformMatrix3x2dv_pointer : J
/*      */     //   396: lconst_0
/*      */     //   397: lcmp
/*      */     //   398: ifeq -> 405
/*      */     //   401: iconst_1
/*      */     //   402: goto -> 406
/*      */     //   405: iconst_0
/*      */     //   406: iand
/*      */     //   407: aload_0
/*      */     //   408: ldc 'glUniformMatrix3x4dv'
/*      */     //   410: invokestatic getFunctionAddress : (Ljava/lang/String;)J
/*      */     //   413: dup2_x1
/*      */     //   414: putfield GL40_glUniformMatrix3x4dv_pointer : J
/*      */     //   417: lconst_0
/*      */     //   418: lcmp
/*      */     //   419: ifeq -> 426
/*      */     //   422: iconst_1
/*      */     //   423: goto -> 427
/*      */     //   426: iconst_0
/*      */     //   427: iand
/*      */     //   428: aload_0
/*      */     //   429: ldc 'glUniformMatrix4x2dv'
/*      */     //   431: invokestatic getFunctionAddress : (Ljava/lang/String;)J
/*      */     //   434: dup2_x1
/*      */     //   435: putfield GL40_glUniformMatrix4x2dv_pointer : J
/*      */     //   438: lconst_0
/*      */     //   439: lcmp
/*      */     //   440: ifeq -> 447
/*      */     //   443: iconst_1
/*      */     //   444: goto -> 448
/*      */     //   447: iconst_0
/*      */     //   448: iand
/*      */     //   449: aload_0
/*      */     //   450: ldc 'glUniformMatrix4x3dv'
/*      */     //   452: invokestatic getFunctionAddress : (Ljava/lang/String;)J
/*      */     //   455: dup2_x1
/*      */     //   456: putfield GL40_glUniformMatrix4x3dv_pointer : J
/*      */     //   459: lconst_0
/*      */     //   460: lcmp
/*      */     //   461: ifeq -> 468
/*      */     //   464: iconst_1
/*      */     //   465: goto -> 469
/*      */     //   468: iconst_0
/*      */     //   469: iand
/*      */     //   470: aload_0
/*      */     //   471: ldc 'glGetUniformdv'
/*      */     //   473: invokestatic getFunctionAddress : (Ljava/lang/String;)J
/*      */     //   476: dup2_x1
/*      */     //   477: putfield GL40_glGetUniformdv_pointer : J
/*      */     //   480: lconst_0
/*      */     //   481: lcmp
/*      */     //   482: ifeq -> 489
/*      */     //   485: iconst_1
/*      */     //   486: goto -> 490
/*      */     //   489: iconst_0
/*      */     //   490: iand
/*      */     //   491: aload_0
/*      */     //   492: ldc_w 'glMinSampleShading'
/*      */     //   495: invokestatic getFunctionAddress : (Ljava/lang/String;)J
/*      */     //   498: dup2_x1
/*      */     //   499: putfield GL40_glMinSampleShading_pointer : J
/*      */     //   502: lconst_0
/*      */     //   503: lcmp
/*      */     //   504: ifne -> 507
/*      */     //   507: iconst_1
/*      */     //   508: iand
/*      */     //   509: aload_0
/*      */     //   510: ldc_w 'glGetSubroutineUniformLocation'
/*      */     //   513: invokestatic getFunctionAddress : (Ljava/lang/String;)J
/*      */     //   516: dup2_x1
/*      */     //   517: putfield GL40_glGetSubroutineUniformLocation_pointer : J
/*      */     //   520: lconst_0
/*      */     //   521: lcmp
/*      */     //   522: ifeq -> 529
/*      */     //   525: iconst_1
/*      */     //   526: goto -> 530
/*      */     //   529: iconst_0
/*      */     //   530: iand
/*      */     //   531: aload_0
/*      */     //   532: ldc_w 'glGetSubroutineIndex'
/*      */     //   535: invokestatic getFunctionAddress : (Ljava/lang/String;)J
/*      */     //   538: dup2_x1
/*      */     //   539: putfield GL40_glGetSubroutineIndex_pointer : J
/*      */     //   542: lconst_0
/*      */     //   543: lcmp
/*      */     //   544: ifeq -> 551
/*      */     //   547: iconst_1
/*      */     //   548: goto -> 552
/*      */     //   551: iconst_0
/*      */     //   552: iand
/*      */     //   553: aload_0
/*      */     //   554: ldc_w 'glGetActiveSubroutineUniformiv'
/*      */     //   557: invokestatic getFunctionAddress : (Ljava/lang/String;)J
/*      */     //   560: dup2_x1
/*      */     //   561: putfield GL40_glGetActiveSubroutineUniformiv_pointer : J
/*      */     //   564: lconst_0
/*      */     //   565: lcmp
/*      */     //   566: ifeq -> 573
/*      */     //   569: iconst_1
/*      */     //   570: goto -> 574
/*      */     //   573: iconst_0
/*      */     //   574: iand
/*      */     //   575: aload_0
/*      */     //   576: ldc_w 'glGetActiveSubroutineUniformName'
/*      */     //   579: invokestatic getFunctionAddress : (Ljava/lang/String;)J
/*      */     //   582: dup2_x1
/*      */     //   583: putfield GL40_glGetActiveSubroutineUniformName_pointer : J
/*      */     //   586: lconst_0
/*      */     //   587: lcmp
/*      */     //   588: ifeq -> 595
/*      */     //   591: iconst_1
/*      */     //   592: goto -> 596
/*      */     //   595: iconst_0
/*      */     //   596: iand
/*      */     //   597: aload_0
/*      */     //   598: ldc_w 'glGetActiveSubroutineName'
/*      */     //   601: invokestatic getFunctionAddress : (Ljava/lang/String;)J
/*      */     //   604: dup2_x1
/*      */     //   605: putfield GL40_glGetActiveSubroutineName_pointer : J
/*      */     //   608: lconst_0
/*      */     //   609: lcmp
/*      */     //   610: ifeq -> 617
/*      */     //   613: iconst_1
/*      */     //   614: goto -> 618
/*      */     //   617: iconst_0
/*      */     //   618: iand
/*      */     //   619: aload_0
/*      */     //   620: ldc_w 'glUniformSubroutinesuiv'
/*      */     //   623: invokestatic getFunctionAddress : (Ljava/lang/String;)J
/*      */     //   626: dup2_x1
/*      */     //   627: putfield GL40_glUniformSubroutinesuiv_pointer : J
/*      */     //   630: lconst_0
/*      */     //   631: lcmp
/*      */     //   632: ifeq -> 639
/*      */     //   635: iconst_1
/*      */     //   636: goto -> 640
/*      */     //   639: iconst_0
/*      */     //   640: iand
/*      */     //   641: aload_0
/*      */     //   642: ldc_w 'glGetUniformSubroutineuiv'
/*      */     //   645: invokestatic getFunctionAddress : (Ljava/lang/String;)J
/*      */     //   648: dup2_x1
/*      */     //   649: putfield GL40_glGetUniformSubroutineuiv_pointer : J
/*      */     //   652: lconst_0
/*      */     //   653: lcmp
/*      */     //   654: ifeq -> 661
/*      */     //   657: iconst_1
/*      */     //   658: goto -> 662
/*      */     //   661: iconst_0
/*      */     //   662: iand
/*      */     //   663: aload_0
/*      */     //   664: ldc_w 'glGetProgramStageiv'
/*      */     //   667: invokestatic getFunctionAddress : (Ljava/lang/String;)J
/*      */     //   670: dup2_x1
/*      */     //   671: putfield GL40_glGetProgramStageiv_pointer : J
/*      */     //   674: lconst_0
/*      */     //   675: lcmp
/*      */     //   676: ifeq -> 683
/*      */     //   679: iconst_1
/*      */     //   680: goto -> 684
/*      */     //   683: iconst_0
/*      */     //   684: iand
/*      */     //   685: aload_0
/*      */     //   686: ldc_w 'glPatchParameteri'
/*      */     //   689: invokestatic getFunctionAddress : (Ljava/lang/String;)J
/*      */     //   692: dup2_x1
/*      */     //   693: putfield GL40_glPatchParameteri_pointer : J
/*      */     //   696: lconst_0
/*      */     //   697: lcmp
/*      */     //   698: ifeq -> 705
/*      */     //   701: iconst_1
/*      */     //   702: goto -> 706
/*      */     //   705: iconst_0
/*      */     //   706: iand
/*      */     //   707: aload_0
/*      */     //   708: ldc_w 'glPatchParameterfv'
/*      */     //   711: invokestatic getFunctionAddress : (Ljava/lang/String;)J
/*      */     //   714: dup2_x1
/*      */     //   715: putfield GL40_glPatchParameterfv_pointer : J
/*      */     //   718: lconst_0
/*      */     //   719: lcmp
/*      */     //   720: ifeq -> 727
/*      */     //   723: iconst_1
/*      */     //   724: goto -> 728
/*      */     //   727: iconst_0
/*      */     //   728: iand
/*      */     //   729: aload_0
/*      */     //   730: ldc_w 'glBindTransformFeedback'
/*      */     //   733: invokestatic getFunctionAddress : (Ljava/lang/String;)J
/*      */     //   736: dup2_x1
/*      */     //   737: putfield GL40_glBindTransformFeedback_pointer : J
/*      */     //   740: lconst_0
/*      */     //   741: lcmp
/*      */     //   742: ifeq -> 749
/*      */     //   745: iconst_1
/*      */     //   746: goto -> 750
/*      */     //   749: iconst_0
/*      */     //   750: iand
/*      */     //   751: aload_0
/*      */     //   752: ldc_w 'glDeleteTransformFeedbacks'
/*      */     //   755: invokestatic getFunctionAddress : (Ljava/lang/String;)J
/*      */     //   758: dup2_x1
/*      */     //   759: putfield GL40_glDeleteTransformFeedbacks_pointer : J
/*      */     //   762: lconst_0
/*      */     //   763: lcmp
/*      */     //   764: ifeq -> 771
/*      */     //   767: iconst_1
/*      */     //   768: goto -> 772
/*      */     //   771: iconst_0
/*      */     //   772: iand
/*      */     //   773: aload_0
/*      */     //   774: ldc_w 'glGenTransformFeedbacks'
/*      */     //   777: invokestatic getFunctionAddress : (Ljava/lang/String;)J
/*      */     //   780: dup2_x1
/*      */     //   781: putfield GL40_glGenTransformFeedbacks_pointer : J
/*      */     //   784: lconst_0
/*      */     //   785: lcmp
/*      */     //   786: ifeq -> 793
/*      */     //   789: iconst_1
/*      */     //   790: goto -> 794
/*      */     //   793: iconst_0
/*      */     //   794: iand
/*      */     //   795: aload_0
/*      */     //   796: ldc_w 'glIsTransformFeedback'
/*      */     //   799: invokestatic getFunctionAddress : (Ljava/lang/String;)J
/*      */     //   802: dup2_x1
/*      */     //   803: putfield GL40_glIsTransformFeedback_pointer : J
/*      */     //   806: lconst_0
/*      */     //   807: lcmp
/*      */     //   808: ifeq -> 815
/*      */     //   811: iconst_1
/*      */     //   812: goto -> 816
/*      */     //   815: iconst_0
/*      */     //   816: iand
/*      */     //   817: aload_0
/*      */     //   818: ldc_w 'glPauseTransformFeedback'
/*      */     //   821: invokestatic getFunctionAddress : (Ljava/lang/String;)J
/*      */     //   824: dup2_x1
/*      */     //   825: putfield GL40_glPauseTransformFeedback_pointer : J
/*      */     //   828: lconst_0
/*      */     //   829: lcmp
/*      */     //   830: ifeq -> 837
/*      */     //   833: iconst_1
/*      */     //   834: goto -> 838
/*      */     //   837: iconst_0
/*      */     //   838: iand
/*      */     //   839: aload_0
/*      */     //   840: ldc_w 'glResumeTransformFeedback'
/*      */     //   843: invokestatic getFunctionAddress : (Ljava/lang/String;)J
/*      */     //   846: dup2_x1
/*      */     //   847: putfield GL40_glResumeTransformFeedback_pointer : J
/*      */     //   850: lconst_0
/*      */     //   851: lcmp
/*      */     //   852: ifeq -> 859
/*      */     //   855: iconst_1
/*      */     //   856: goto -> 860
/*      */     //   859: iconst_0
/*      */     //   860: iand
/*      */     //   861: aload_0
/*      */     //   862: ldc_w 'glDrawTransformFeedback'
/*      */     //   865: invokestatic getFunctionAddress : (Ljava/lang/String;)J
/*      */     //   868: dup2_x1
/*      */     //   869: putfield GL40_glDrawTransformFeedback_pointer : J
/*      */     //   872: lconst_0
/*      */     //   873: lcmp
/*      */     //   874: ifeq -> 881
/*      */     //   877: iconst_1
/*      */     //   878: goto -> 882
/*      */     //   881: iconst_0
/*      */     //   882: iand
/*      */     //   883: aload_0
/*      */     //   884: ldc_w 'glDrawTransformFeedbackStream'
/*      */     //   887: invokestatic getFunctionAddress : (Ljava/lang/String;)J
/*      */     //   890: dup2_x1
/*      */     //   891: putfield GL40_glDrawTransformFeedbackStream_pointer : J
/*      */     //   894: lconst_0
/*      */     //   895: lcmp
/*      */     //   896: ifeq -> 903
/*      */     //   899: iconst_1
/*      */     //   900: goto -> 904
/*      */     //   903: iconst_0
/*      */     //   904: iand
/*      */     //   905: aload_0
/*      */     //   906: ldc_w 'glBeginQueryIndexed'
/*      */     //   909: invokestatic getFunctionAddress : (Ljava/lang/String;)J
/*      */     //   912: dup2_x1
/*      */     //   913: putfield GL40_glBeginQueryIndexed_pointer : J
/*      */     //   916: lconst_0
/*      */     //   917: lcmp
/*      */     //   918: ifeq -> 925
/*      */     //   921: iconst_1
/*      */     //   922: goto -> 926
/*      */     //   925: iconst_0
/*      */     //   926: iand
/*      */     //   927: aload_0
/*      */     //   928: ldc_w 'glEndQueryIndexed'
/*      */     //   931: invokestatic getFunctionAddress : (Ljava/lang/String;)J
/*      */     //   934: dup2_x1
/*      */     //   935: putfield GL40_glEndQueryIndexed_pointer : J
/*      */     //   938: lconst_0
/*      */     //   939: lcmp
/*      */     //   940: ifeq -> 947
/*      */     //   943: iconst_1
/*      */     //   944: goto -> 948
/*      */     //   947: iconst_0
/*      */     //   948: iand
/*      */     //   949: aload_0
/*      */     //   950: ldc_w 'glGetQueryIndexediv'
/*      */     //   953: invokestatic getFunctionAddress : (Ljava/lang/String;)J
/*      */     //   956: dup2_x1
/*      */     //   957: putfield GL40_glGetQueryIndexediv_pointer : J
/*      */     //   960: lconst_0
/*      */     //   961: lcmp
/*      */     //   962: ifeq -> 969
/*      */     //   965: iconst_1
/*      */     //   966: goto -> 970
/*      */     //   969: iconst_0
/*      */     //   970: iand
/*      */     //   971: ireturn
/*      */     // Line number table:
/*      */     //   Java source line number -> byte code offset
/*      */     //   #3918	-> 0
/*      */     // Local variable table:
/*      */     //   start	length	slot	name	descriptor
/*      */     //   0	972	0	this	Lorg/lwjgl/opengl/ContextCapabilities;
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
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private boolean GREMEDY_string_marker_initNativeFunctionAddresses() {
/* 3968 */     return ((this.GREMEDY_string_marker_glStringMarkerGREMEDY_pointer = GLContext.getFunctionAddress("glStringMarkerGREMEDY")) != 0L);
/*      */   }
/*      */ 
/*      */   
/*      */   private boolean NV_conditional_render_initNativeFunctionAddresses() {
/* 3973 */     return (((this.NV_conditional_render_glBeginConditionalRenderNV_pointer = GLContext.getFunctionAddress("glBeginConditionalRenderNV")) != 0L)) & (((this.NV_conditional_render_glEndConditionalRenderNV_pointer = GLContext.getFunctionAddress("glEndConditionalRenderNV")) != 0L));
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   private boolean NV_copy_image_initNativeFunctionAddresses() {
/* 3979 */     return ((this.NV_copy_image_glCopyImageSubDataNV_pointer = GLContext.getFunctionAddress("glCopyImageSubDataNV")) != 0L);
/*      */   }
/*      */ 
/*      */   
/*      */   private boolean NV_depth_buffer_float_initNativeFunctionAddresses() {
/* 3984 */     return (((this.NV_depth_buffer_float_glDepthRangedNV_pointer = GLContext.getFunctionAddress("glDepthRangedNV")) != 0L)) & (((this.NV_depth_buffer_float_glClearDepthdNV_pointer = GLContext.getFunctionAddress("glClearDepthdNV")) != 0L)) & (((this.NV_depth_buffer_float_glDepthBoundsdNV_pointer = GLContext.getFunctionAddress("glDepthBoundsdNV")) != 0L) ? 1 : 0);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private boolean NV_evaluators_initNativeFunctionAddresses() {
/* 3991 */     return (((this.NV_evaluators_glGetMapControlPointsNV_pointer = GLContext.getFunctionAddress("glGetMapControlPointsNV")) != 0L)) & (((this.NV_evaluators_glMapControlPointsNV_pointer = GLContext.getFunctionAddress("glMapControlPointsNV")) != 0L)) & (((this.NV_evaluators_glMapParameterfvNV_pointer = GLContext.getFunctionAddress("glMapParameterfvNV")) != 0L) ? 1 : 0) & (((this.NV_evaluators_glMapParameterivNV_pointer = GLContext.getFunctionAddress("glMapParameterivNV")) != 0L) ? 1 : 0) & (((this.NV_evaluators_glGetMapParameterfvNV_pointer = GLContext.getFunctionAddress("glGetMapParameterfvNV")) != 0L) ? 1 : 0) & (((this.NV_evaluators_glGetMapParameterivNV_pointer = GLContext.getFunctionAddress("glGetMapParameterivNV")) != 0L) ? 1 : 0) & (((this.NV_evaluators_glGetMapAttribParameterfvNV_pointer = GLContext.getFunctionAddress("glGetMapAttribParameterfvNV")) != 0L) ? 1 : 0) & (((this.NV_evaluators_glGetMapAttribParameterivNV_pointer = GLContext.getFunctionAddress("glGetMapAttribParameterivNV")) != 0L) ? 1 : 0) & (((this.NV_evaluators_glEvalMapsNV_pointer = GLContext.getFunctionAddress("glEvalMapsNV")) != 0L) ? 1 : 0);
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
/*      */   
/*      */   private boolean NV_explicit_multisample_initNativeFunctionAddresses() {
/* 4004 */     return (((this.NV_explicit_multisample_glGetBooleanIndexedvEXT_pointer = GLContext.getFunctionAddress("glGetBooleanIndexedvEXT")) != 0L)) & (((this.NV_explicit_multisample_glGetIntegerIndexedvEXT_pointer = GLContext.getFunctionAddress("glGetIntegerIndexedvEXT")) != 0L)) & (((this.NV_explicit_multisample_glGetMultisamplefvNV_pointer = GLContext.getFunctionAddress("glGetMultisamplefvNV")) != 0L) ? 1 : 0) & (((this.NV_explicit_multisample_glSampleMaskIndexedNV_pointer = GLContext.getFunctionAddress("glSampleMaskIndexedNV")) != 0L) ? 1 : 0) & (((this.NV_explicit_multisample_glTexRenderbufferNV_pointer = GLContext.getFunctionAddress("glTexRenderbufferNV")) != 0L) ? 1 : 0);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private boolean NV_fence_initNativeFunctionAddresses() {
/* 4013 */     return (((this.NV_fence_glGenFencesNV_pointer = GLContext.getFunctionAddress("glGenFencesNV")) != 0L)) & (((this.NV_fence_glDeleteFencesNV_pointer = GLContext.getFunctionAddress("glDeleteFencesNV")) != 0L)) & (((this.NV_fence_glSetFenceNV_pointer = GLContext.getFunctionAddress("glSetFenceNV")) != 0L) ? 1 : 0) & (((this.NV_fence_glTestFenceNV_pointer = GLContext.getFunctionAddress("glTestFenceNV")) != 0L) ? 1 : 0) & (((this.NV_fence_glFinishFenceNV_pointer = GLContext.getFunctionAddress("glFinishFenceNV")) != 0L) ? 1 : 0) & (((this.NV_fence_glIsFenceNV_pointer = GLContext.getFunctionAddress("glIsFenceNV")) != 0L) ? 1 : 0) & (((this.NV_fence_glGetFenceivNV_pointer = GLContext.getFunctionAddress("glGetFenceivNV")) != 0L) ? 1 : 0);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private boolean NV_fragment_program_initNativeFunctionAddresses() {
/* 4024 */     return (((this.NV_fragment_program_glProgramNamedParameter4fNV_pointer = GLContext.getFunctionAddress("glProgramNamedParameter4fNV")) != 0L)) & (((this.NV_fragment_program_glProgramNamedParameter4dNV_pointer = GLContext.getFunctionAddress("glProgramNamedParameter4dNV")) != 0L)) & (((this.NV_fragment_program_glGetProgramNamedParameterfvNV_pointer = GLContext.getFunctionAddress("glGetProgramNamedParameterfvNV")) != 0L) ? 1 : 0) & (((this.NV_fragment_program_glGetProgramNamedParameterdvNV_pointer = GLContext.getFunctionAddress("glGetProgramNamedParameterdvNV")) != 0L) ? 1 : 0);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private boolean NV_framebuffer_multisample_coverage_initNativeFunctionAddresses() {
/* 4032 */     return ((this.NV_framebuffer_multisample_coverage_glRenderbufferStorageMultisampleCoverageNV_pointer = GLContext.getFunctionAddress("glRenderbufferStorageMultisampleCoverageNV")) != 0L);
/*      */   }
/*      */ 
/*      */   
/*      */   private boolean NV_geometry_program4_initNativeFunctionAddresses() {
/* 4037 */     return (((this.NV_geometry_program4_glProgramVertexLimitNV_pointer = GLContext.getFunctionAddress("glProgramVertexLimitNV")) != 0L)) & (((this.NV_geometry_program4_glFramebufferTextureEXT_pointer = GLContext.getFunctionAddress("glFramebufferTextureEXT")) != 0L)) & (((this.NV_geometry_program4_glFramebufferTextureLayerEXT_pointer = GLContext.getFunctionAddress("glFramebufferTextureLayerEXT")) != 0L) ? 1 : 0) & (((this.NV_geometry_program4_glFramebufferTextureFaceEXT_pointer = GLContext.getFunctionAddress("glFramebufferTextureFaceEXT")) != 0L) ? 1 : 0);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private boolean NV_gpu_program4_initNativeFunctionAddresses() {
/* 4045 */     return (((this.NV_gpu_program4_glProgramLocalParameterI4iNV_pointer = GLContext.getFunctionAddress("glProgramLocalParameterI4iNV")) != 0L)) & (((this.NV_gpu_program4_glProgramLocalParameterI4ivNV_pointer = GLContext.getFunctionAddress("glProgramLocalParameterI4ivNV")) != 0L)) & (((this.NV_gpu_program4_glProgramLocalParametersI4ivNV_pointer = GLContext.getFunctionAddress("glProgramLocalParametersI4ivNV")) != 0L) ? 1 : 0) & (((this.NV_gpu_program4_glProgramLocalParameterI4uiNV_pointer = GLContext.getFunctionAddress("glProgramLocalParameterI4uiNV")) != 0L) ? 1 : 0) & (((this.NV_gpu_program4_glProgramLocalParameterI4uivNV_pointer = GLContext.getFunctionAddress("glProgramLocalParameterI4uivNV")) != 0L) ? 1 : 0) & (((this.NV_gpu_program4_glProgramLocalParametersI4uivNV_pointer = GLContext.getFunctionAddress("glProgramLocalParametersI4uivNV")) != 0L) ? 1 : 0) & (((this.NV_gpu_program4_glProgramEnvParameterI4iNV_pointer = GLContext.getFunctionAddress("glProgramEnvParameterI4iNV")) != 0L) ? 1 : 0) & (((this.NV_gpu_program4_glProgramEnvParameterI4ivNV_pointer = GLContext.getFunctionAddress("glProgramEnvParameterI4ivNV")) != 0L) ? 1 : 0) & (((this.NV_gpu_program4_glProgramEnvParametersI4ivNV_pointer = GLContext.getFunctionAddress("glProgramEnvParametersI4ivNV")) != 0L) ? 1 : 0) & (((this.NV_gpu_program4_glProgramEnvParameterI4uiNV_pointer = GLContext.getFunctionAddress("glProgramEnvParameterI4uiNV")) != 0L) ? 1 : 0) & (((this.NV_gpu_program4_glProgramEnvParameterI4uivNV_pointer = GLContext.getFunctionAddress("glProgramEnvParameterI4uivNV")) != 0L) ? 1 : 0) & (((this.NV_gpu_program4_glProgramEnvParametersI4uivNV_pointer = GLContext.getFunctionAddress("glProgramEnvParametersI4uivNV")) != 0L) ? 1 : 0) & (((this.NV_gpu_program4_glGetProgramLocalParameterIivNV_pointer = GLContext.getFunctionAddress("glGetProgramLocalParameterIivNV")) != 0L) ? 1 : 0) & (((this.NV_gpu_program4_glGetProgramLocalParameterIuivNV_pointer = GLContext.getFunctionAddress("glGetProgramLocalParameterIuivNV")) != 0L) ? 1 : 0) & (((this.NV_gpu_program4_glGetProgramEnvParameterIivNV_pointer = GLContext.getFunctionAddress("glGetProgramEnvParameterIivNV")) != 0L) ? 1 : 0) & (((this.NV_gpu_program4_glGetProgramEnvParameterIuivNV_pointer = GLContext.getFunctionAddress("glGetProgramEnvParameterIuivNV")) != 0L) ? 1 : 0);
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
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private boolean NV_gpu_shader5_initNativeFunctionAddresses(Set supported_extensions) {
/* 4065 */     return (((this.NV_gpu_shader5_glUniform1i64NV_pointer = GLContext.getFunctionAddress("glUniform1i64NV")) != 0L)) & (((this.NV_gpu_shader5_glUniform2i64NV_pointer = GLContext.getFunctionAddress("glUniform2i64NV")) != 0L)) & (((this.NV_gpu_shader5_glUniform3i64NV_pointer = GLContext.getFunctionAddress("glUniform3i64NV")) != 0L) ? 1 : 0) & (((this.NV_gpu_shader5_glUniform4i64NV_pointer = GLContext.getFunctionAddress("glUniform4i64NV")) != 0L) ? 1 : 0) & (((this.NV_gpu_shader5_glUniform1i64vNV_pointer = GLContext.getFunctionAddress("glUniform1i64vNV")) != 0L) ? 1 : 0) & (((this.NV_gpu_shader5_glUniform2i64vNV_pointer = GLContext.getFunctionAddress("glUniform2i64vNV")) != 0L) ? 1 : 0) & (((this.NV_gpu_shader5_glUniform3i64vNV_pointer = GLContext.getFunctionAddress("glUniform3i64vNV")) != 0L) ? 1 : 0) & (((this.NV_gpu_shader5_glUniform4i64vNV_pointer = GLContext.getFunctionAddress("glUniform4i64vNV")) != 0L) ? 1 : 0) & (((this.NV_gpu_shader5_glUniform1ui64NV_pointer = GLContext.getFunctionAddress("glUniform1ui64NV")) != 0L) ? 1 : 0) & (((this.NV_gpu_shader5_glUniform2ui64NV_pointer = GLContext.getFunctionAddress("glUniform2ui64NV")) != 0L) ? 1 : 0) & (((this.NV_gpu_shader5_glUniform3ui64NV_pointer = GLContext.getFunctionAddress("glUniform3ui64NV")) != 0L) ? 1 : 0) & (((this.NV_gpu_shader5_glUniform4ui64NV_pointer = GLContext.getFunctionAddress("glUniform4ui64NV")) != 0L) ? 1 : 0) & (((this.NV_gpu_shader5_glUniform1ui64vNV_pointer = GLContext.getFunctionAddress("glUniform1ui64vNV")) != 0L) ? 1 : 0) & (((this.NV_gpu_shader5_glUniform2ui64vNV_pointer = GLContext.getFunctionAddress("glUniform2ui64vNV")) != 0L) ? 1 : 0) & (((this.NV_gpu_shader5_glUniform3ui64vNV_pointer = GLContext.getFunctionAddress("glUniform3ui64vNV")) != 0L) ? 1 : 0) & (((this.NV_gpu_shader5_glUniform4ui64vNV_pointer = GLContext.getFunctionAddress("glUniform4ui64vNV")) != 0L) ? 1 : 0) & (((this.NV_gpu_shader5_glGetUniformi64vNV_pointer = GLContext.getFunctionAddress("glGetUniformi64vNV")) != 0L) ? 1 : 0) & (((this.NV_gpu_shader5_glGetUniformui64vNV_pointer = GLContext.getFunctionAddress("glGetUniformui64vNV")) != 0L) ? 1 : 0) & ((!supported_extensions.contains("EXT_direct_state_access") || (this.NV_gpu_shader5_glProgramUniform1i64NV_pointer = GLContext.getFunctionAddress("glProgramUniform1i64NV")) != 0L) ? 1 : 0) & ((!supported_extensions.contains("EXT_direct_state_access") || (this.NV_gpu_shader5_glProgramUniform2i64NV_pointer = GLContext.getFunctionAddress("glProgramUniform2i64NV")) != 0L) ? 1 : 0) & ((!supported_extensions.contains("EXT_direct_state_access") || (this.NV_gpu_shader5_glProgramUniform3i64NV_pointer = GLContext.getFunctionAddress("glProgramUniform3i64NV")) != 0L) ? 1 : 0) & ((!supported_extensions.contains("EXT_direct_state_access") || (this.NV_gpu_shader5_glProgramUniform4i64NV_pointer = GLContext.getFunctionAddress("glProgramUniform4i64NV")) != 0L) ? 1 : 0) & ((!supported_extensions.contains("EXT_direct_state_access") || (this.NV_gpu_shader5_glProgramUniform1i64vNV_pointer = GLContext.getFunctionAddress("glProgramUniform1i64vNV")) != 0L) ? 1 : 0) & ((!supported_extensions.contains("EXT_direct_state_access") || (this.NV_gpu_shader5_glProgramUniform2i64vNV_pointer = GLContext.getFunctionAddress("glProgramUniform2i64vNV")) != 0L) ? 1 : 0) & ((!supported_extensions.contains("EXT_direct_state_access") || (this.NV_gpu_shader5_glProgramUniform3i64vNV_pointer = GLContext.getFunctionAddress("glProgramUniform3i64vNV")) != 0L) ? 1 : 0) & ((!supported_extensions.contains("EXT_direct_state_access") || (this.NV_gpu_shader5_glProgramUniform4i64vNV_pointer = GLContext.getFunctionAddress("glProgramUniform4i64vNV")) != 0L) ? 1 : 0) & ((!supported_extensions.contains("EXT_direct_state_access") || (this.NV_gpu_shader5_glProgramUniform1ui64NV_pointer = GLContext.getFunctionAddress("glProgramUniform1ui64NV")) != 0L) ? 1 : 0) & ((!supported_extensions.contains("EXT_direct_state_access") || (this.NV_gpu_shader5_glProgramUniform2ui64NV_pointer = GLContext.getFunctionAddress("glProgramUniform2ui64NV")) != 0L) ? 1 : 0) & ((!supported_extensions.contains("EXT_direct_state_access") || (this.NV_gpu_shader5_glProgramUniform3ui64NV_pointer = GLContext.getFunctionAddress("glProgramUniform3ui64NV")) != 0L) ? 1 : 0) & ((!supported_extensions.contains("EXT_direct_state_access") || (this.NV_gpu_shader5_glProgramUniform4ui64NV_pointer = GLContext.getFunctionAddress("glProgramUniform4ui64NV")) != 0L) ? 1 : 0) & ((!supported_extensions.contains("EXT_direct_state_access") || (this.NV_gpu_shader5_glProgramUniform1ui64vNV_pointer = GLContext.getFunctionAddress("glProgramUniform1ui64vNV")) != 0L) ? 1 : 0) & ((!supported_extensions.contains("EXT_direct_state_access") || (this.NV_gpu_shader5_glProgramUniform2ui64vNV_pointer = GLContext.getFunctionAddress("glProgramUniform2ui64vNV")) != 0L) ? 1 : 0) & ((!supported_extensions.contains("EXT_direct_state_access") || (this.NV_gpu_shader5_glProgramUniform3ui64vNV_pointer = GLContext.getFunctionAddress("glProgramUniform3ui64vNV")) != 0L) ? 1 : 0) & ((!supported_extensions.contains("EXT_direct_state_access") || (this.NV_gpu_shader5_glProgramUniform4ui64vNV_pointer = GLContext.getFunctionAddress("glProgramUniform4ui64vNV")) != 0L) ? 1 : 0);
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
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private boolean NV_half_float_initNativeFunctionAddresses() {
/*      */     // Byte code:
/*      */     //   0: aload_0
/*      */     //   1: ldc_w 'glVertex2hNV'
/*      */     //   4: invokestatic getFunctionAddress : (Ljava/lang/String;)J
/*      */     //   7: dup2_x1
/*      */     //   8: putfield NV_half_float_glVertex2hNV_pointer : J
/*      */     //   11: lconst_0
/*      */     //   12: lcmp
/*      */     //   13: ifeq -> 20
/*      */     //   16: iconst_1
/*      */     //   17: goto -> 21
/*      */     //   20: iconst_0
/*      */     //   21: aload_0
/*      */     //   22: ldc_w 'glVertex3hNV'
/*      */     //   25: invokestatic getFunctionAddress : (Ljava/lang/String;)J
/*      */     //   28: dup2_x1
/*      */     //   29: putfield NV_half_float_glVertex3hNV_pointer : J
/*      */     //   32: lconst_0
/*      */     //   33: lcmp
/*      */     //   34: ifeq -> 41
/*      */     //   37: iconst_1
/*      */     //   38: goto -> 42
/*      */     //   41: iconst_0
/*      */     //   42: iand
/*      */     //   43: aload_0
/*      */     //   44: ldc_w 'glVertex4hNV'
/*      */     //   47: invokestatic getFunctionAddress : (Ljava/lang/String;)J
/*      */     //   50: dup2_x1
/*      */     //   51: putfield NV_half_float_glVertex4hNV_pointer : J
/*      */     //   54: lconst_0
/*      */     //   55: lcmp
/*      */     //   56: ifeq -> 63
/*      */     //   59: iconst_1
/*      */     //   60: goto -> 64
/*      */     //   63: iconst_0
/*      */     //   64: iand
/*      */     //   65: aload_0
/*      */     //   66: ldc_w 'glNormal3hNV'
/*      */     //   69: invokestatic getFunctionAddress : (Ljava/lang/String;)J
/*      */     //   72: dup2_x1
/*      */     //   73: putfield NV_half_float_glNormal3hNV_pointer : J
/*      */     //   76: lconst_0
/*      */     //   77: lcmp
/*      */     //   78: ifeq -> 85
/*      */     //   81: iconst_1
/*      */     //   82: goto -> 86
/*      */     //   85: iconst_0
/*      */     //   86: iand
/*      */     //   87: aload_0
/*      */     //   88: ldc_w 'glColor3hNV'
/*      */     //   91: invokestatic getFunctionAddress : (Ljava/lang/String;)J
/*      */     //   94: dup2_x1
/*      */     //   95: putfield NV_half_float_glColor3hNV_pointer : J
/*      */     //   98: lconst_0
/*      */     //   99: lcmp
/*      */     //   100: ifeq -> 107
/*      */     //   103: iconst_1
/*      */     //   104: goto -> 108
/*      */     //   107: iconst_0
/*      */     //   108: iand
/*      */     //   109: aload_0
/*      */     //   110: ldc_w 'glColor4hNV'
/*      */     //   113: invokestatic getFunctionAddress : (Ljava/lang/String;)J
/*      */     //   116: dup2_x1
/*      */     //   117: putfield NV_half_float_glColor4hNV_pointer : J
/*      */     //   120: lconst_0
/*      */     //   121: lcmp
/*      */     //   122: ifeq -> 129
/*      */     //   125: iconst_1
/*      */     //   126: goto -> 130
/*      */     //   129: iconst_0
/*      */     //   130: iand
/*      */     //   131: aload_0
/*      */     //   132: ldc_w 'glTexCoord1hNV'
/*      */     //   135: invokestatic getFunctionAddress : (Ljava/lang/String;)J
/*      */     //   138: dup2_x1
/*      */     //   139: putfield NV_half_float_glTexCoord1hNV_pointer : J
/*      */     //   142: lconst_0
/*      */     //   143: lcmp
/*      */     //   144: ifeq -> 151
/*      */     //   147: iconst_1
/*      */     //   148: goto -> 152
/*      */     //   151: iconst_0
/*      */     //   152: iand
/*      */     //   153: aload_0
/*      */     //   154: ldc_w 'glTexCoord2hNV'
/*      */     //   157: invokestatic getFunctionAddress : (Ljava/lang/String;)J
/*      */     //   160: dup2_x1
/*      */     //   161: putfield NV_half_float_glTexCoord2hNV_pointer : J
/*      */     //   164: lconst_0
/*      */     //   165: lcmp
/*      */     //   166: ifeq -> 173
/*      */     //   169: iconst_1
/*      */     //   170: goto -> 174
/*      */     //   173: iconst_0
/*      */     //   174: iand
/*      */     //   175: aload_0
/*      */     //   176: ldc_w 'glTexCoord3hNV'
/*      */     //   179: invokestatic getFunctionAddress : (Ljava/lang/String;)J
/*      */     //   182: dup2_x1
/*      */     //   183: putfield NV_half_float_glTexCoord3hNV_pointer : J
/*      */     //   186: lconst_0
/*      */     //   187: lcmp
/*      */     //   188: ifeq -> 195
/*      */     //   191: iconst_1
/*      */     //   192: goto -> 196
/*      */     //   195: iconst_0
/*      */     //   196: iand
/*      */     //   197: aload_0
/*      */     //   198: ldc_w 'glTexCoord4hNV'
/*      */     //   201: invokestatic getFunctionAddress : (Ljava/lang/String;)J
/*      */     //   204: dup2_x1
/*      */     //   205: putfield NV_half_float_glTexCoord4hNV_pointer : J
/*      */     //   208: lconst_0
/*      */     //   209: lcmp
/*      */     //   210: ifeq -> 217
/*      */     //   213: iconst_1
/*      */     //   214: goto -> 218
/*      */     //   217: iconst_0
/*      */     //   218: iand
/*      */     //   219: aload_0
/*      */     //   220: ldc_w 'glMultiTexCoord1hNV'
/*      */     //   223: invokestatic getFunctionAddress : (Ljava/lang/String;)J
/*      */     //   226: dup2_x1
/*      */     //   227: putfield NV_half_float_glMultiTexCoord1hNV_pointer : J
/*      */     //   230: lconst_0
/*      */     //   231: lcmp
/*      */     //   232: ifeq -> 239
/*      */     //   235: iconst_1
/*      */     //   236: goto -> 240
/*      */     //   239: iconst_0
/*      */     //   240: iand
/*      */     //   241: aload_0
/*      */     //   242: ldc_w 'glMultiTexCoord2hNV'
/*      */     //   245: invokestatic getFunctionAddress : (Ljava/lang/String;)J
/*      */     //   248: dup2_x1
/*      */     //   249: putfield NV_half_float_glMultiTexCoord2hNV_pointer : J
/*      */     //   252: lconst_0
/*      */     //   253: lcmp
/*      */     //   254: ifeq -> 261
/*      */     //   257: iconst_1
/*      */     //   258: goto -> 262
/*      */     //   261: iconst_0
/*      */     //   262: iand
/*      */     //   263: aload_0
/*      */     //   264: ldc_w 'glMultiTexCoord3hNV'
/*      */     //   267: invokestatic getFunctionAddress : (Ljava/lang/String;)J
/*      */     //   270: dup2_x1
/*      */     //   271: putfield NV_half_float_glMultiTexCoord3hNV_pointer : J
/*      */     //   274: lconst_0
/*      */     //   275: lcmp
/*      */     //   276: ifeq -> 283
/*      */     //   279: iconst_1
/*      */     //   280: goto -> 284
/*      */     //   283: iconst_0
/*      */     //   284: iand
/*      */     //   285: aload_0
/*      */     //   286: ldc_w 'glMultiTexCoord4hNV'
/*      */     //   289: invokestatic getFunctionAddress : (Ljava/lang/String;)J
/*      */     //   292: dup2_x1
/*      */     //   293: putfield NV_half_float_glMultiTexCoord4hNV_pointer : J
/*      */     //   296: lconst_0
/*      */     //   297: lcmp
/*      */     //   298: ifeq -> 305
/*      */     //   301: iconst_1
/*      */     //   302: goto -> 306
/*      */     //   305: iconst_0
/*      */     //   306: iand
/*      */     //   307: aload_0
/*      */     //   308: ldc_w 'glFogCoordhNV'
/*      */     //   311: invokestatic getFunctionAddress : (Ljava/lang/String;)J
/*      */     //   314: dup2_x1
/*      */     //   315: putfield NV_half_float_glFogCoordhNV_pointer : J
/*      */     //   318: lconst_0
/*      */     //   319: lcmp
/*      */     //   320: ifeq -> 327
/*      */     //   323: iconst_1
/*      */     //   324: goto -> 328
/*      */     //   327: iconst_0
/*      */     //   328: iand
/*      */     //   329: aload_0
/*      */     //   330: ldc_w 'glSecondaryColor3hNV'
/*      */     //   333: invokestatic getFunctionAddress : (Ljava/lang/String;)J
/*      */     //   336: dup2_x1
/*      */     //   337: putfield NV_half_float_glSecondaryColor3hNV_pointer : J
/*      */     //   340: lconst_0
/*      */     //   341: lcmp
/*      */     //   342: ifeq -> 349
/*      */     //   345: iconst_1
/*      */     //   346: goto -> 350
/*      */     //   349: iconst_0
/*      */     //   350: iand
/*      */     //   351: aload_0
/*      */     //   352: ldc_w 'glVertexWeighthNV'
/*      */     //   355: invokestatic getFunctionAddress : (Ljava/lang/String;)J
/*      */     //   358: dup2_x1
/*      */     //   359: putfield NV_half_float_glVertexWeighthNV_pointer : J
/*      */     //   362: lconst_0
/*      */     //   363: lcmp
/*      */     //   364: ifne -> 367
/*      */     //   367: iconst_1
/*      */     //   368: iand
/*      */     //   369: aload_0
/*      */     //   370: ldc_w 'glVertexAttrib1hNV'
/*      */     //   373: invokestatic getFunctionAddress : (Ljava/lang/String;)J
/*      */     //   376: dup2_x1
/*      */     //   377: putfield NV_half_float_glVertexAttrib1hNV_pointer : J
/*      */     //   380: lconst_0
/*      */     //   381: lcmp
/*      */     //   382: ifne -> 385
/*      */     //   385: iconst_1
/*      */     //   386: iand
/*      */     //   387: aload_0
/*      */     //   388: ldc_w 'glVertexAttrib2hNV'
/*      */     //   391: invokestatic getFunctionAddress : (Ljava/lang/String;)J
/*      */     //   394: dup2_x1
/*      */     //   395: putfield NV_half_float_glVertexAttrib2hNV_pointer : J
/*      */     //   398: lconst_0
/*      */     //   399: lcmp
/*      */     //   400: ifne -> 403
/*      */     //   403: iconst_1
/*      */     //   404: iand
/*      */     //   405: aload_0
/*      */     //   406: ldc_w 'glVertexAttrib3hNV'
/*      */     //   409: invokestatic getFunctionAddress : (Ljava/lang/String;)J
/*      */     //   412: dup2_x1
/*      */     //   413: putfield NV_half_float_glVertexAttrib3hNV_pointer : J
/*      */     //   416: lconst_0
/*      */     //   417: lcmp
/*      */     //   418: ifne -> 421
/*      */     //   421: iconst_1
/*      */     //   422: iand
/*      */     //   423: aload_0
/*      */     //   424: ldc_w 'glVertexAttrib4hNV'
/*      */     //   427: invokestatic getFunctionAddress : (Ljava/lang/String;)J
/*      */     //   430: dup2_x1
/*      */     //   431: putfield NV_half_float_glVertexAttrib4hNV_pointer : J
/*      */     //   434: lconst_0
/*      */     //   435: lcmp
/*      */     //   436: ifne -> 439
/*      */     //   439: iconst_1
/*      */     //   440: iand
/*      */     //   441: aload_0
/*      */     //   442: ldc_w 'glVertexAttribs1hvNV'
/*      */     //   445: invokestatic getFunctionAddress : (Ljava/lang/String;)J
/*      */     //   448: dup2_x1
/*      */     //   449: putfield NV_half_float_glVertexAttribs1hvNV_pointer : J
/*      */     //   452: lconst_0
/*      */     //   453: lcmp
/*      */     //   454: ifne -> 457
/*      */     //   457: iconst_1
/*      */     //   458: iand
/*      */     //   459: aload_0
/*      */     //   460: ldc_w 'glVertexAttribs2hvNV'
/*      */     //   463: invokestatic getFunctionAddress : (Ljava/lang/String;)J
/*      */     //   466: dup2_x1
/*      */     //   467: putfield NV_half_float_glVertexAttribs2hvNV_pointer : J
/*      */     //   470: lconst_0
/*      */     //   471: lcmp
/*      */     //   472: ifne -> 475
/*      */     //   475: iconst_1
/*      */     //   476: iand
/*      */     //   477: aload_0
/*      */     //   478: ldc_w 'glVertexAttribs3hvNV'
/*      */     //   481: invokestatic getFunctionAddress : (Ljava/lang/String;)J
/*      */     //   484: dup2_x1
/*      */     //   485: putfield NV_half_float_glVertexAttribs3hvNV_pointer : J
/*      */     //   488: lconst_0
/*      */     //   489: lcmp
/*      */     //   490: ifne -> 493
/*      */     //   493: iconst_1
/*      */     //   494: iand
/*      */     //   495: aload_0
/*      */     //   496: ldc_w 'glVertexAttribs4hvNV'
/*      */     //   499: invokestatic getFunctionAddress : (Ljava/lang/String;)J
/*      */     //   502: dup2_x1
/*      */     //   503: putfield NV_half_float_glVertexAttribs4hvNV_pointer : J
/*      */     //   506: lconst_0
/*      */     //   507: lcmp
/*      */     //   508: ifne -> 511
/*      */     //   511: iconst_1
/*      */     //   512: iand
/*      */     //   513: ireturn
/*      */     // Line number table:
/*      */     //   Java source line number -> byte code offset
/*      */     //   #4103	-> 0
/*      */     // Local variable table:
/*      */     //   start	length	slot	name	descriptor
/*      */     //   0	514	0	this	Lorg/lwjgl/opengl/ContextCapabilities;
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
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private boolean NV_occlusion_query_initNativeFunctionAddresses() {
/* 4132 */     return (((this.NV_occlusion_query_glGenOcclusionQueriesNV_pointer = GLContext.getFunctionAddress("glGenOcclusionQueriesNV")) != 0L)) & (((this.NV_occlusion_query_glDeleteOcclusionQueriesNV_pointer = GLContext.getFunctionAddress("glDeleteOcclusionQueriesNV")) != 0L)) & (((this.NV_occlusion_query_glIsOcclusionQueryNV_pointer = GLContext.getFunctionAddress("glIsOcclusionQueryNV")) != 0L) ? 1 : 0) & (((this.NV_occlusion_query_glBeginOcclusionQueryNV_pointer = GLContext.getFunctionAddress("glBeginOcclusionQueryNV")) != 0L) ? 1 : 0) & (((this.NV_occlusion_query_glEndOcclusionQueryNV_pointer = GLContext.getFunctionAddress("glEndOcclusionQueryNV")) != 0L) ? 1 : 0) & (((this.NV_occlusion_query_glGetOcclusionQueryuivNV_pointer = GLContext.getFunctionAddress("glGetOcclusionQueryuivNV")) != 0L) ? 1 : 0) & (((this.NV_occlusion_query_glGetOcclusionQueryivNV_pointer = GLContext.getFunctionAddress("glGetOcclusionQueryivNV")) != 0L) ? 1 : 0);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private boolean NV_parameter_buffer_object_initNativeFunctionAddresses() {
/* 4143 */     return (((this.NV_parameter_buffer_object_glProgramBufferParametersfvNV_pointer = GLContext.getFunctionAddress("glProgramBufferParametersfvNV")) != 0L)) & (((this.NV_parameter_buffer_object_glProgramBufferParametersIivNV_pointer = GLContext.getFunctionAddress("glProgramBufferParametersIivNV")) != 0L)) & (((this.NV_parameter_buffer_object_glProgramBufferParametersIuivNV_pointer = GLContext.getFunctionAddress("glProgramBufferParametersIuivNV")) != 0L) ? 1 : 0);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private boolean NV_pixel_data_range_initNativeFunctionAddresses() {
/* 4150 */     return (((this.NV_pixel_data_range_glPixelDataRangeNV_pointer = GLContext.getFunctionAddress("glPixelDataRangeNV")) != 0L)) & (((this.NV_pixel_data_range_glFlushPixelDataRangeNV_pointer = GLContext.getFunctionAddress("glFlushPixelDataRangeNV")) != 0L));
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   private boolean NV_point_sprite_initNativeFunctionAddresses() {
/* 4156 */     return (((this.NV_point_sprite_glPointParameteriNV_pointer = GLContext.getFunctionAddress("glPointParameteriNV")) != 0L)) & (((this.NV_point_sprite_glPointParameterivNV_pointer = GLContext.getFunctionAddress("glPointParameterivNV")) != 0L));
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   private boolean NV_primitive_restart_initNativeFunctionAddresses() {
/* 4162 */     return (((this.NV_primitive_restart_glPrimitiveRestartNV_pointer = GLContext.getFunctionAddress("glPrimitiveRestartNV")) != 0L)) & (((this.NV_primitive_restart_glPrimitiveRestartIndexNV_pointer = GLContext.getFunctionAddress("glPrimitiveRestartIndexNV")) != 0L));
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   private boolean NV_program_initNativeFunctionAddresses() {
/* 4168 */     return (((this.NV_program_glLoadProgramNV_pointer = GLContext.getFunctionAddress("glLoadProgramNV")) != 0L)) & (((this.NV_program_glBindProgramNV_pointer = GLContext.getFunctionAddress("glBindProgramNV")) != 0L)) & (((this.NV_program_glDeleteProgramsNV_pointer = GLContext.getFunctionAddress("glDeleteProgramsNV")) != 0L) ? 1 : 0) & (((this.NV_program_glGenProgramsNV_pointer = GLContext.getFunctionAddress("glGenProgramsNV")) != 0L) ? 1 : 0) & (((this.NV_program_glGetProgramivNV_pointer = GLContext.getFunctionAddress("glGetProgramivNV")) != 0L) ? 1 : 0) & (((this.NV_program_glGetProgramStringNV_pointer = GLContext.getFunctionAddress("glGetProgramStringNV")) != 0L) ? 1 : 0) & (((this.NV_program_glIsProgramNV_pointer = GLContext.getFunctionAddress("glIsProgramNV")) != 0L) ? 1 : 0) & (((this.NV_program_glAreProgramsResidentNV_pointer = GLContext.getFunctionAddress("glAreProgramsResidentNV")) != 0L) ? 1 : 0) & (((this.NV_program_glRequestResidentProgramsNV_pointer = GLContext.getFunctionAddress("glRequestResidentProgramsNV")) != 0L) ? 1 : 0);
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
/*      */   
/*      */   private boolean NV_register_combiners_initNativeFunctionAddresses() {
/* 4181 */     return (((this.NV_register_combiners_glCombinerParameterfNV_pointer = GLContext.getFunctionAddress("glCombinerParameterfNV")) != 0L)) & (((this.NV_register_combiners_glCombinerParameterfvNV_pointer = GLContext.getFunctionAddress("glCombinerParameterfvNV")) != 0L)) & (((this.NV_register_combiners_glCombinerParameteriNV_pointer = GLContext.getFunctionAddress("glCombinerParameteriNV")) != 0L) ? 1 : 0) & (((this.NV_register_combiners_glCombinerParameterivNV_pointer = GLContext.getFunctionAddress("glCombinerParameterivNV")) != 0L) ? 1 : 0) & (((this.NV_register_combiners_glCombinerInputNV_pointer = GLContext.getFunctionAddress("glCombinerInputNV")) != 0L) ? 1 : 0) & (((this.NV_register_combiners_glCombinerOutputNV_pointer = GLContext.getFunctionAddress("glCombinerOutputNV")) != 0L) ? 1 : 0) & (((this.NV_register_combiners_glFinalCombinerInputNV_pointer = GLContext.getFunctionAddress("glFinalCombinerInputNV")) != 0L) ? 1 : 0) & (((this.NV_register_combiners_glGetCombinerInputParameterfvNV_pointer = GLContext.getFunctionAddress("glGetCombinerInputParameterfvNV")) != 0L) ? 1 : 0) & (((this.NV_register_combiners_glGetCombinerInputParameterivNV_pointer = GLContext.getFunctionAddress("glGetCombinerInputParameterivNV")) != 0L) ? 1 : 0) & (((this.NV_register_combiners_glGetCombinerOutputParameterfvNV_pointer = GLContext.getFunctionAddress("glGetCombinerOutputParameterfvNV")) != 0L) ? 1 : 0) & (((this.NV_register_combiners_glGetCombinerOutputParameterivNV_pointer = GLContext.getFunctionAddress("glGetCombinerOutputParameterivNV")) != 0L) ? 1 : 0) & (((this.NV_register_combiners_glGetFinalCombinerInputParameterfvNV_pointer = GLContext.getFunctionAddress("glGetFinalCombinerInputParameterfvNV")) != 0L) ? 1 : 0) & (((this.NV_register_combiners_glGetFinalCombinerInputParameterivNV_pointer = GLContext.getFunctionAddress("glGetFinalCombinerInputParameterivNV")) != 0L) ? 1 : 0);
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
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private boolean NV_register_combiners2_initNativeFunctionAddresses() {
/* 4198 */     return (((this.NV_register_combiners2_glCombinerStageParameterfvNV_pointer = GLContext.getFunctionAddress("glCombinerStageParameterfvNV")) != 0L)) & (((this.NV_register_combiners2_glGetCombinerStageParameterfvNV_pointer = GLContext.getFunctionAddress("glGetCombinerStageParameterfvNV")) != 0L));
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   private boolean NV_shader_buffer_load_initNativeFunctionAddresses() {
/* 4204 */     return (((this.NV_shader_buffer_load_glMakeBufferResidentNV_pointer = GLContext.getFunctionAddress("glMakeBufferResidentNV")) != 0L)) & (((this.NV_shader_buffer_load_glMakeBufferNonResidentNV_pointer = GLContext.getFunctionAddress("glMakeBufferNonResidentNV")) != 0L)) & (((this.NV_shader_buffer_load_glIsBufferResidentNV_pointer = GLContext.getFunctionAddress("glIsBufferResidentNV")) != 0L) ? 1 : 0) & (((this.NV_shader_buffer_load_glMakeNamedBufferResidentNV_pointer = GLContext.getFunctionAddress("glMakeNamedBufferResidentNV")) != 0L) ? 1 : 0) & (((this.NV_shader_buffer_load_glMakeNamedBufferNonResidentNV_pointer = GLContext.getFunctionAddress("glMakeNamedBufferNonResidentNV")) != 0L) ? 1 : 0) & (((this.NV_shader_buffer_load_glIsNamedBufferResidentNV_pointer = GLContext.getFunctionAddress("glIsNamedBufferResidentNV")) != 0L) ? 1 : 0) & (((this.NV_shader_buffer_load_glGetBufferParameterui64vNV_pointer = GLContext.getFunctionAddress("glGetBufferParameterui64vNV")) != 0L) ? 1 : 0) & (((this.NV_shader_buffer_load_glGetNamedBufferParameterui64vNV_pointer = GLContext.getFunctionAddress("glGetNamedBufferParameterui64vNV")) != 0L) ? 1 : 0) & (((this.NV_shader_buffer_load_glGetIntegerui64vNV_pointer = GLContext.getFunctionAddress("glGetIntegerui64vNV")) != 0L) ? 1 : 0) & (((this.NV_shader_buffer_load_glUniformui64NV_pointer = GLContext.getFunctionAddress("glUniformui64NV")) != 0L) ? 1 : 0) & (((this.NV_shader_buffer_load_glUniformui64vNV_pointer = GLContext.getFunctionAddress("glUniformui64vNV")) != 0L) ? 1 : 0) & (((this.NV_shader_buffer_load_glGetUniformui64vNV_pointer = GLContext.getFunctionAddress("glGetUniformui64vNV")) != 0L) ? 1 : 0) & (((this.NV_shader_buffer_load_glProgramUniformui64NV_pointer = GLContext.getFunctionAddress("glProgramUniformui64NV")) != 0L) ? 1 : 0) & (((this.NV_shader_buffer_load_glProgramUniformui64vNV_pointer = GLContext.getFunctionAddress("glProgramUniformui64vNV")) != 0L) ? 1 : 0);
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
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private boolean NV_texture_barrier_initNativeFunctionAddresses() {
/* 4222 */     return ((this.NV_texture_barrier_glTextureBarrierNV_pointer = GLContext.getFunctionAddress("glTextureBarrierNV")) != 0L);
/*      */   }
/*      */ 
/*      */   
/*      */   private boolean NV_transform_feedback_initNativeFunctionAddresses() {
/* 4227 */     return (((this.NV_transform_feedback_glBindBufferRangeNV_pointer = GLContext.getFunctionAddress("glBindBufferRangeNV")) != 0L)) & (((this.NV_transform_feedback_glBindBufferOffsetNV_pointer = GLContext.getFunctionAddress("glBindBufferOffsetNV")) != 0L)) & (((this.NV_transform_feedback_glBindBufferBaseNV_pointer = GLContext.getFunctionAddress("glBindBufferBaseNV")) != 0L) ? 1 : 0) & (((this.NV_transform_feedback_glTransformFeedbackAttribsNV_pointer = GLContext.getFunctionAddress("glTransformFeedbackAttribsNV")) != 0L) ? 1 : 0) & (((this.NV_transform_feedback_glTransformFeedbackVaryingsNV_pointer = GLContext.getFunctionAddress("glTransformFeedbackVaryingsNV")) != 0L) ? 1 : 0) & (((this.NV_transform_feedback_glBeginTransformFeedbackNV_pointer = GLContext.getFunctionAddress("glBeginTransformFeedbackNV")) != 0L) ? 1 : 0) & (((this.NV_transform_feedback_glEndTransformFeedbackNV_pointer = GLContext.getFunctionAddress("glEndTransformFeedbackNV")) != 0L) ? 1 : 0) & (((this.NV_transform_feedback_glGetVaryingLocationNV_pointer = GLContext.getFunctionAddress("glGetVaryingLocationNV")) != 0L) ? 1 : 0) & (((this.NV_transform_feedback_glGetActiveVaryingNV_pointer = GLContext.getFunctionAddress("glGetActiveVaryingNV")) != 0L) ? 1 : 0) & (((this.NV_transform_feedback_glActiveVaryingNV_pointer = GLContext.getFunctionAddress("glActiveVaryingNV")) != 0L) ? 1 : 0) & (((this.NV_transform_feedback_glGetTransformFeedbackVaryingNV_pointer = GLContext.getFunctionAddress("glGetTransformFeedbackVaryingNV")) != 0L) ? 1 : 0);
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
/*      */ 
/*      */ 
/*      */   
/*      */   private boolean NV_transform_feedback2_initNativeFunctionAddresses() {
/* 4242 */     return (((this.NV_transform_feedback2_glBindTransformFeedbackNV_pointer = GLContext.getFunctionAddress("glBindTransformFeedbackNV")) != 0L)) & (((this.NV_transform_feedback2_glDeleteTransformFeedbacksNV_pointer = GLContext.getFunctionAddress("glDeleteTransformFeedbacksNV")) != 0L)) & (((this.NV_transform_feedback2_glGenTransformFeedbacksNV_pointer = GLContext.getFunctionAddress("glGenTransformFeedbacksNV")) != 0L) ? 1 : 0) & (((this.NV_transform_feedback2_glIsTransformFeedbackNV_pointer = GLContext.getFunctionAddress("glIsTransformFeedbackNV")) != 0L) ? 1 : 0) & (((this.NV_transform_feedback2_glPauseTransformFeedbackNV_pointer = GLContext.getFunctionAddress("glPauseTransformFeedbackNV")) != 0L) ? 1 : 0) & (((this.NV_transform_feedback2_glResumeTransformFeedbackNV_pointer = GLContext.getFunctionAddress("glResumeTransformFeedbackNV")) != 0L) ? 1 : 0) & (((this.NV_transform_feedback2_glDrawTransformFeedbackNV_pointer = GLContext.getFunctionAddress("glDrawTransformFeedbackNV")) != 0L) ? 1 : 0);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private boolean NV_vertex_array_range_initNativeFunctionAddresses() {
/* 4253 */     return (((this.NV_vertex_array_range_glVertexArrayRangeNV_pointer = GLContext.getFunctionAddress("glVertexArrayRangeNV")) != 0L)) & (((this.NV_vertex_array_range_glFlushVertexArrayRangeNV_pointer = GLContext.getFunctionAddress("glFlushVertexArrayRangeNV")) != 0L)) & (((this.NV_vertex_array_range_glAllocateMemoryNV_pointer = GLContext.getPlatformSpecificFunctionAddress("gl", new String[] { "Windows", "Linux" }, new String[] { "wgl", "glX" }, "glAllocateMemoryNV")) != 0L) ? 1 : 0) & (((this.NV_vertex_array_range_glFreeMemoryNV_pointer = GLContext.getPlatformSpecificFunctionAddress("gl", new String[] { "Windows", "Linux" }, new String[] { "wgl", "glX" }, "glFreeMemoryNV")) != 0L) ? 1 : 0);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private boolean NV_vertex_attrib_integer_64bit_initNativeFunctionAddresses(Set supported_extensions) {
/* 4261 */     return (((this.NV_vertex_attrib_integer_64bit_glVertexAttribL1i64NV_pointer = GLContext.getFunctionAddress("glVertexAttribL1i64NV")) != 0L)) & (((this.NV_vertex_attrib_integer_64bit_glVertexAttribL2i64NV_pointer = GLContext.getFunctionAddress("glVertexAttribL2i64NV")) != 0L)) & (((this.NV_vertex_attrib_integer_64bit_glVertexAttribL3i64NV_pointer = GLContext.getFunctionAddress("glVertexAttribL3i64NV")) != 0L) ? 1 : 0) & (((this.NV_vertex_attrib_integer_64bit_glVertexAttribL4i64NV_pointer = GLContext.getFunctionAddress("glVertexAttribL4i64NV")) != 0L) ? 1 : 0) & (((this.NV_vertex_attrib_integer_64bit_glVertexAttribL1i64vNV_pointer = GLContext.getFunctionAddress("glVertexAttribL1i64vNV")) != 0L) ? 1 : 0) & (((this.NV_vertex_attrib_integer_64bit_glVertexAttribL2i64vNV_pointer = GLContext.getFunctionAddress("glVertexAttribL2i64vNV")) != 0L) ? 1 : 0) & (((this.NV_vertex_attrib_integer_64bit_glVertexAttribL3i64vNV_pointer = GLContext.getFunctionAddress("glVertexAttribL3i64vNV")) != 0L) ? 1 : 0) & (((this.NV_vertex_attrib_integer_64bit_glVertexAttribL4i64vNV_pointer = GLContext.getFunctionAddress("glVertexAttribL4i64vNV")) != 0L) ? 1 : 0) & (((this.NV_vertex_attrib_integer_64bit_glVertexAttribL1ui64NV_pointer = GLContext.getFunctionAddress("glVertexAttribL1ui64NV")) != 0L) ? 1 : 0) & (((this.NV_vertex_attrib_integer_64bit_glVertexAttribL2ui64NV_pointer = GLContext.getFunctionAddress("glVertexAttribL2ui64NV")) != 0L) ? 1 : 0) & (((this.NV_vertex_attrib_integer_64bit_glVertexAttribL3ui64NV_pointer = GLContext.getFunctionAddress("glVertexAttribL3ui64NV")) != 0L) ? 1 : 0) & (((this.NV_vertex_attrib_integer_64bit_glVertexAttribL4ui64NV_pointer = GLContext.getFunctionAddress("glVertexAttribL4ui64NV")) != 0L) ? 1 : 0) & (((this.NV_vertex_attrib_integer_64bit_glVertexAttribL1ui64vNV_pointer = GLContext.getFunctionAddress("glVertexAttribL1ui64vNV")) != 0L) ? 1 : 0) & (((this.NV_vertex_attrib_integer_64bit_glVertexAttribL2ui64vNV_pointer = GLContext.getFunctionAddress("glVertexAttribL2ui64vNV")) != 0L) ? 1 : 0) & (((this.NV_vertex_attrib_integer_64bit_glVertexAttribL3ui64vNV_pointer = GLContext.getFunctionAddress("glVertexAttribL3ui64vNV")) != 0L) ? 1 : 0) & (((this.NV_vertex_attrib_integer_64bit_glVertexAttribL4ui64vNV_pointer = GLContext.getFunctionAddress("glVertexAttribL4ui64vNV")) != 0L) ? 1 : 0) & (((this.NV_vertex_attrib_integer_64bit_glGetVertexAttribLi64vNV_pointer = GLContext.getFunctionAddress("glGetVertexAttribLi64vNV")) != 0L) ? 1 : 0) & (((this.NV_vertex_attrib_integer_64bit_glGetVertexAttribLui64vNV_pointer = GLContext.getFunctionAddress("glGetVertexAttribLui64vNV")) != 0L) ? 1 : 0) & ((!supported_extensions.contains("NV_vertex_buffer_unified_memory") || (this.NV_vertex_attrib_integer_64bit_glVertexAttribLFormatNV_pointer = GLContext.getFunctionAddress("glVertexAttribLFormatNV")) != 0L) ? 1 : 0);
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
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private boolean NV_vertex_buffer_unified_memory_initNativeFunctionAddresses() {
/* 4284 */     return (((this.NV_vertex_buffer_unified_memory_glBufferAddressRangeNV_pointer = GLContext.getFunctionAddress("glBufferAddressRangeNV")) != 0L)) & (((this.NV_vertex_buffer_unified_memory_glVertexFormatNV_pointer = GLContext.getFunctionAddress("glVertexFormatNV")) != 0L)) & (((this.NV_vertex_buffer_unified_memory_glNormalFormatNV_pointer = GLContext.getFunctionAddress("glNormalFormatNV")) != 0L) ? 1 : 0) & (((this.NV_vertex_buffer_unified_memory_glColorFormatNV_pointer = GLContext.getFunctionAddress("glColorFormatNV")) != 0L) ? 1 : 0) & (((this.NV_vertex_buffer_unified_memory_glIndexFormatNV_pointer = GLContext.getFunctionAddress("glIndexFormatNV")) != 0L) ? 1 : 0) & (((this.NV_vertex_buffer_unified_memory_glTexCoordFormatNV_pointer = GLContext.getFunctionAddress("glTexCoordFormatNV")) != 0L) ? 1 : 0) & (((this.NV_vertex_buffer_unified_memory_glEdgeFlagFormatNV_pointer = GLContext.getFunctionAddress("glEdgeFlagFormatNV")) != 0L) ? 1 : 0) & (((this.NV_vertex_buffer_unified_memory_glSecondaryColorFormatNV_pointer = GLContext.getFunctionAddress("glSecondaryColorFormatNV")) != 0L) ? 1 : 0) & (((this.NV_vertex_buffer_unified_memory_glFogCoordFormatNV_pointer = GLContext.getFunctionAddress("glFogCoordFormatNV")) != 0L) ? 1 : 0) & (((this.NV_vertex_buffer_unified_memory_glVertexAttribFormatNV_pointer = GLContext.getFunctionAddress("glVertexAttribFormatNV")) != 0L) ? 1 : 0) & (((this.NV_vertex_buffer_unified_memory_glVertexAttribIFormatNV_pointer = GLContext.getFunctionAddress("glVertexAttribIFormatNV")) != 0L) ? 1 : 0) & (((this.NV_vertex_buffer_unified_memory_glGetIntegerui64i_vNV_pointer = GLContext.getFunctionAddress("glGetIntegerui64i_vNV")) != 0L) ? 1 : 0);
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
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private boolean NV_vertex_program_initNativeFunctionAddresses() {
/* 4300 */     return (((this.NV_vertex_program_glExecuteProgramNV_pointer = GLContext.getFunctionAddress("glExecuteProgramNV")) != 0L)) & (((this.NV_vertex_program_glGetProgramParameterfvNV_pointer = GLContext.getFunctionAddress("glGetProgramParameterfvNV")) != 0L)) & (((this.NV_vertex_program_glGetProgramParameterdvNV_pointer = GLContext.getFunctionAddress("glGetProgramParameterdvNV")) != 0L) ? 1 : 0) & (((this.NV_vertex_program_glGetTrackMatrixivNV_pointer = GLContext.getFunctionAddress("glGetTrackMatrixivNV")) != 0L) ? 1 : 0) & (((this.NV_vertex_program_glGetVertexAttribfvNV_pointer = GLContext.getFunctionAddress("glGetVertexAttribfvNV")) != 0L) ? 1 : 0) & (((this.NV_vertex_program_glGetVertexAttribdvNV_pointer = GLContext.getFunctionAddress("glGetVertexAttribdvNV")) != 0L) ? 1 : 0) & (((this.NV_vertex_program_glGetVertexAttribivNV_pointer = GLContext.getFunctionAddress("glGetVertexAttribivNV")) != 0L) ? 1 : 0) & (((this.NV_vertex_program_glGetVertexAttribPointervNV_pointer = GLContext.getFunctionAddress("glGetVertexAttribPointervNV")) != 0L) ? 1 : 0) & (((this.NV_vertex_program_glProgramParameter4fNV_pointer = GLContext.getFunctionAddress("glProgramParameter4fNV")) != 0L) ? 1 : 0) & (((this.NV_vertex_program_glProgramParameter4dNV_pointer = GLContext.getFunctionAddress("glProgramParameter4dNV")) != 0L) ? 1 : 0) & (((this.NV_vertex_program_glProgramParameters4fvNV_pointer = GLContext.getFunctionAddress("glProgramParameters4fvNV")) != 0L) ? 1 : 0) & (((this.NV_vertex_program_glProgramParameters4dvNV_pointer = GLContext.getFunctionAddress("glProgramParameters4dvNV")) != 0L) ? 1 : 0) & (((this.NV_vertex_program_glTrackMatrixNV_pointer = GLContext.getFunctionAddress("glTrackMatrixNV")) != 0L) ? 1 : 0) & (((this.NV_vertex_program_glVertexAttribPointerNV_pointer = GLContext.getFunctionAddress("glVertexAttribPointerNV")) != 0L) ? 1 : 0) & (((this.NV_vertex_program_glVertexAttrib1sNV_pointer = GLContext.getFunctionAddress("glVertexAttrib1sNV")) != 0L) ? 1 : 0) & (((this.NV_vertex_program_glVertexAttrib1fNV_pointer = GLContext.getFunctionAddress("glVertexAttrib1fNV")) != 0L) ? 1 : 0) & (((this.NV_vertex_program_glVertexAttrib1dNV_pointer = GLContext.getFunctionAddress("glVertexAttrib1dNV")) != 0L) ? 1 : 0) & (((this.NV_vertex_program_glVertexAttrib2sNV_pointer = GLContext.getFunctionAddress("glVertexAttrib2sNV")) != 0L) ? 1 : 0) & (((this.NV_vertex_program_glVertexAttrib2fNV_pointer = GLContext.getFunctionAddress("glVertexAttrib2fNV")) != 0L) ? 1 : 0) & (((this.NV_vertex_program_glVertexAttrib2dNV_pointer = GLContext.getFunctionAddress("glVertexAttrib2dNV")) != 0L) ? 1 : 0) & (((this.NV_vertex_program_glVertexAttrib3sNV_pointer = GLContext.getFunctionAddress("glVertexAttrib3sNV")) != 0L) ? 1 : 0) & (((this.NV_vertex_program_glVertexAttrib3fNV_pointer = GLContext.getFunctionAddress("glVertexAttrib3fNV")) != 0L) ? 1 : 0) & (((this.NV_vertex_program_glVertexAttrib3dNV_pointer = GLContext.getFunctionAddress("glVertexAttrib3dNV")) != 0L) ? 1 : 0) & (((this.NV_vertex_program_glVertexAttrib4sNV_pointer = GLContext.getFunctionAddress("glVertexAttrib4sNV")) != 0L) ? 1 : 0) & (((this.NV_vertex_program_glVertexAttrib4fNV_pointer = GLContext.getFunctionAddress("glVertexAttrib4fNV")) != 0L) ? 1 : 0) & (((this.NV_vertex_program_glVertexAttrib4dNV_pointer = GLContext.getFunctionAddress("glVertexAttrib4dNV")) != 0L) ? 1 : 0) & (((this.NV_vertex_program_glVertexAttrib4ubNV_pointer = GLContext.getFunctionAddress("glVertexAttrib4ubNV")) != 0L) ? 1 : 0) & (((this.NV_vertex_program_glVertexAttribs1svNV_pointer = GLContext.getFunctionAddress("glVertexAttribs1svNV")) != 0L) ? 1 : 0) & (((this.NV_vertex_program_glVertexAttribs1fvNV_pointer = GLContext.getFunctionAddress("glVertexAttribs1fvNV")) != 0L) ? 1 : 0) & (((this.NV_vertex_program_glVertexAttribs1dvNV_pointer = GLContext.getFunctionAddress("glVertexAttribs1dvNV")) != 0L) ? 1 : 0) & (((this.NV_vertex_program_glVertexAttribs2svNV_pointer = GLContext.getFunctionAddress("glVertexAttribs2svNV")) != 0L) ? 1 : 0) & (((this.NV_vertex_program_glVertexAttribs2fvNV_pointer = GLContext.getFunctionAddress("glVertexAttribs2fvNV")) != 0L) ? 1 : 0) & (((this.NV_vertex_program_glVertexAttribs2dvNV_pointer = GLContext.getFunctionAddress("glVertexAttribs2dvNV")) != 0L) ? 1 : 0) & (((this.NV_vertex_program_glVertexAttribs3svNV_pointer = GLContext.getFunctionAddress("glVertexAttribs3svNV")) != 0L) ? 1 : 0) & (((this.NV_vertex_program_glVertexAttribs3fvNV_pointer = GLContext.getFunctionAddress("glVertexAttribs3fvNV")) != 0L) ? 1 : 0) & (((this.NV_vertex_program_glVertexAttribs3dvNV_pointer = GLContext.getFunctionAddress("glVertexAttribs3dvNV")) != 0L) ? 1 : 0) & (((this.NV_vertex_program_glVertexAttribs4svNV_pointer = GLContext.getFunctionAddress("glVertexAttribs4svNV")) != 0L) ? 1 : 0) & (((this.NV_vertex_program_glVertexAttribs4fvNV_pointer = GLContext.getFunctionAddress("glVertexAttribs4fvNV")) != 0L) ? 1 : 0) & (((this.NV_vertex_program_glVertexAttribs4dvNV_pointer = GLContext.getFunctionAddress("glVertexAttribs4dvNV")) != 0L) ? 1 : 0);
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
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private static void remove(Set supported_extensions, String extension) {
/* 4344 */     LWJGLUtil.log(extension + " was reported as available but an entry point is missing");
/* 4345 */     supported_extensions.remove(extension);
/*      */   }
/*      */   
/*      */   private Set initAllStubs(boolean forwardCompatible) throws LWJGLException {
/* 4349 */     this.GL11_glGetError_pointer = GLContext.getFunctionAddress("glGetError");
/* 4350 */     this.GL11_glGetString_pointer = GLContext.getFunctionAddress("glGetString");
/* 4351 */     this.GL11_glGetIntegerv_pointer = GLContext.getFunctionAddress("glGetIntegerv");
/* 4352 */     this.GL30_glGetStringi_pointer = GLContext.getFunctionAddress("glGetStringi");
/* 4353 */     GLContext.setCapabilities(this);
/* 4354 */     Set supported_extensions = new HashSet(256);
/* 4355 */     int profileMask = GLContext.getSupportedExtensions(supported_extensions);
/* 4356 */     if (supported_extensions.contains("OpenGL31") && !supported_extensions.contains("GL_ARB_compatibility") && (profileMask & 0x2) == 0)
/* 4357 */       forwardCompatible = true; 
/* 4358 */     if (!GL11_initNativeFunctionAddresses(forwardCompatible))
/* 4359 */       throw new LWJGLException("GL11 not supported"); 
/* 4360 */     if (supported_extensions.contains("GL_ARB_fragment_program"))
/* 4361 */       supported_extensions.add("GL_ARB_program"); 
/* 4362 */     if (supported_extensions.contains("GL_ARB_pixel_buffer_object"))
/* 4363 */       supported_extensions.add("GL_ARB_buffer_object"); 
/* 4364 */     if (supported_extensions.contains("GL_ARB_vertex_buffer_object"))
/* 4365 */       supported_extensions.add("GL_ARB_buffer_object"); 
/* 4366 */     if (supported_extensions.contains("GL_ARB_vertex_program"))
/* 4367 */       supported_extensions.add("GL_ARB_program"); 
/* 4368 */     if (supported_extensions.contains("GL_EXT_pixel_buffer_object"))
/* 4369 */       supported_extensions.add("GL_ARB_buffer_object"); 
/* 4370 */     if (supported_extensions.contains("GL_NV_fragment_program"))
/* 4371 */       supported_extensions.add("GL_NV_program"); 
/* 4372 */     if (supported_extensions.contains("GL_NV_vertex_program"))
/* 4373 */       supported_extensions.add("GL_NV_program"); 
/* 4374 */     if (supported_extensions.contains("GL_AMD_draw_buffers_blend") && !AMD_draw_buffers_blend_initNativeFunctionAddresses())
/* 4375 */       remove(supported_extensions, "GL_AMD_draw_buffers_blend"); 
/* 4376 */     if (supported_extensions.contains("GL_AMD_performance_monitor") && !AMD_performance_monitor_initNativeFunctionAddresses())
/* 4377 */       remove(supported_extensions, "GL_AMD_performance_monitor"); 
/* 4378 */     if (supported_extensions.contains("GL_AMD_vertex_shader_tessellator") && !AMD_vertex_shader_tessellator_initNativeFunctionAddresses())
/* 4379 */       remove(supported_extensions, "GL_AMD_vertex_shader_tessellator"); 
/* 4380 */     if (supported_extensions.contains("GL_APPLE_element_array") && !APPLE_element_array_initNativeFunctionAddresses())
/* 4381 */       remove(supported_extensions, "GL_APPLE_element_array"); 
/* 4382 */     if (supported_extensions.contains("GL_APPLE_fence") && !APPLE_fence_initNativeFunctionAddresses())
/* 4383 */       remove(supported_extensions, "GL_APPLE_fence"); 
/* 4384 */     if (supported_extensions.contains("GL_APPLE_flush_buffer_range") && !APPLE_flush_buffer_range_initNativeFunctionAddresses())
/* 4385 */       remove(supported_extensions, "GL_APPLE_flush_buffer_range"); 
/* 4386 */     if (supported_extensions.contains("GL_APPLE_object_purgeable") && !APPLE_object_purgeable_initNativeFunctionAddresses())
/* 4387 */       remove(supported_extensions, "GL_APPLE_object_purgeable"); 
/* 4388 */     if (supported_extensions.contains("GL_APPLE_texture_range") && !APPLE_texture_range_initNativeFunctionAddresses())
/* 4389 */       remove(supported_extensions, "GL_APPLE_texture_range"); 
/* 4390 */     if (supported_extensions.contains("GL_APPLE_vertex_array_object") && !APPLE_vertex_array_object_initNativeFunctionAddresses())
/* 4391 */       remove(supported_extensions, "GL_APPLE_vertex_array_object"); 
/* 4392 */     if (supported_extensions.contains("GL_APPLE_vertex_array_range") && !APPLE_vertex_array_range_initNativeFunctionAddresses())
/* 4393 */       remove(supported_extensions, "GL_APPLE_vertex_array_range"); 
/* 4394 */     if (supported_extensions.contains("GL_APPLE_vertex_program_evaluators") && !APPLE_vertex_program_evaluators_initNativeFunctionAddresses())
/* 4395 */       remove(supported_extensions, "GL_APPLE_vertex_program_evaluators"); 
/* 4396 */     if (supported_extensions.contains("GL_ARB_blend_func_extended") && !ARB_blend_func_extended_initNativeFunctionAddresses())
/* 4397 */       remove(supported_extensions, "GL_ARB_blend_func_extended"); 
/* 4398 */     if (supported_extensions.contains("GL_ARB_buffer_object") && !ARB_buffer_object_initNativeFunctionAddresses())
/* 4399 */       remove(supported_extensions, "GL_ARB_buffer_object"); 
/* 4400 */     if (supported_extensions.contains("GL_ARB_color_buffer_float") && !ARB_color_buffer_float_initNativeFunctionAddresses())
/* 4401 */       remove(supported_extensions, "GL_ARB_color_buffer_float"); 
/* 4402 */     if (supported_extensions.contains("GL_ARB_copy_buffer") && !ARB_copy_buffer_initNativeFunctionAddresses())
/* 4403 */       remove(supported_extensions, "GL_ARB_copy_buffer"); 
/* 4404 */     if (supported_extensions.contains("GL_ARB_draw_buffers") && !ARB_draw_buffers_initNativeFunctionAddresses())
/* 4405 */       remove(supported_extensions, "GL_ARB_draw_buffers"); 
/* 4406 */     if (supported_extensions.contains("GL_ARB_draw_buffers_blend") && !ARB_draw_buffers_blend_initNativeFunctionAddresses())
/* 4407 */       remove(supported_extensions, "GL_ARB_draw_buffers_blend"); 
/* 4408 */     if (supported_extensions.contains("GL_ARB_draw_elements_base_vertex") && !ARB_draw_elements_base_vertex_initNativeFunctionAddresses())
/* 4409 */       remove(supported_extensions, "GL_ARB_draw_elements_base_vertex"); 
/* 4410 */     if (supported_extensions.contains("GL_ARB_draw_indirect") && !ARB_draw_indirect_initNativeFunctionAddresses())
/* 4411 */       remove(supported_extensions, "GL_ARB_draw_indirect"); 
/* 4412 */     if (supported_extensions.contains("GL_ARB_draw_instanced") && !ARB_draw_instanced_initNativeFunctionAddresses())
/* 4413 */       remove(supported_extensions, "GL_ARB_draw_instanced"); 
/* 4414 */     if (supported_extensions.contains("GL_ARB_framebuffer_object") && !ARB_framebuffer_object_initNativeFunctionAddresses())
/* 4415 */       remove(supported_extensions, "GL_ARB_framebuffer_object"); 
/* 4416 */     if (supported_extensions.contains("GL_ARB_geometry_shader4") && !ARB_geometry_shader4_initNativeFunctionAddresses())
/* 4417 */       remove(supported_extensions, "GL_ARB_geometry_shader4"); 
/* 4418 */     if (supported_extensions.contains("GL_ARB_gpu_shader_fp64") && !ARB_gpu_shader_fp64_initNativeFunctionAddresses(supported_extensions))
/* 4419 */       remove(supported_extensions, "GL_ARB_gpu_shader_fp64"); 
/* 4420 */     if (supported_extensions.contains("GL_ARB_imaging") && !ARB_imaging_initNativeFunctionAddresses(forwardCompatible))
/* 4421 */       remove(supported_extensions, "GL_ARB_imaging"); 
/* 4422 */     if (supported_extensions.contains("GL_ARB_instanced_arrays") && !ARB_instanced_arrays_initNativeFunctionAddresses())
/* 4423 */       remove(supported_extensions, "GL_ARB_instanced_arrays"); 
/* 4424 */     if (supported_extensions.contains("GL_ARB_map_buffer_range") && !ARB_map_buffer_range_initNativeFunctionAddresses())
/* 4425 */       remove(supported_extensions, "GL_ARB_map_buffer_range"); 
/* 4426 */     if (supported_extensions.contains("GL_ARB_matrix_palette") && !ARB_matrix_palette_initNativeFunctionAddresses())
/* 4427 */       remove(supported_extensions, "GL_ARB_matrix_palette"); 
/* 4428 */     if (supported_extensions.contains("GL_ARB_multisample") && !ARB_multisample_initNativeFunctionAddresses())
/* 4429 */       remove(supported_extensions, "GL_ARB_multisample"); 
/* 4430 */     if (supported_extensions.contains("GL_ARB_multitexture") && !ARB_multitexture_initNativeFunctionAddresses())
/* 4431 */       remove(supported_extensions, "GL_ARB_multitexture"); 
/* 4432 */     if (supported_extensions.contains("GL_ARB_occlusion_query") && !ARB_occlusion_query_initNativeFunctionAddresses())
/* 4433 */       remove(supported_extensions, "GL_ARB_occlusion_query"); 
/* 4434 */     if (supported_extensions.contains("GL_ARB_point_parameters") && !ARB_point_parameters_initNativeFunctionAddresses())
/* 4435 */       remove(supported_extensions, "GL_ARB_point_parameters"); 
/* 4436 */     if (supported_extensions.contains("GL_ARB_program") && !ARB_program_initNativeFunctionAddresses())
/* 4437 */       remove(supported_extensions, "GL_ARB_program"); 
/* 4438 */     if (supported_extensions.contains("GL_ARB_provoking_vertex") && !ARB_provoking_vertex_initNativeFunctionAddresses())
/* 4439 */       remove(supported_extensions, "GL_ARB_provoking_vertex"); 
/* 4440 */     if (supported_extensions.contains("GL_ARB_sample_shading") && !ARB_sample_shading_initNativeFunctionAddresses())
/* 4441 */       remove(supported_extensions, "GL_ARB_sample_shading"); 
/* 4442 */     if (supported_extensions.contains("GL_ARB_sampler_objects") && !ARB_sampler_objects_initNativeFunctionAddresses())
/* 4443 */       remove(supported_extensions, "GL_ARB_sampler_objects"); 
/* 4444 */     if (supported_extensions.contains("GL_ARB_shader_objects") && !ARB_shader_objects_initNativeFunctionAddresses())
/* 4445 */       remove(supported_extensions, "GL_ARB_shader_objects"); 
/* 4446 */     if (supported_extensions.contains("GL_ARB_shader_subroutine") && !ARB_shader_subroutine_initNativeFunctionAddresses())
/* 4447 */       remove(supported_extensions, "GL_ARB_shader_subroutine"); 
/* 4448 */     if (supported_extensions.contains("GL_ARB_shading_language_include") && !ARB_shading_language_include_initNativeFunctionAddresses())
/* 4449 */       remove(supported_extensions, "GL_ARB_shading_language_include"); 
/* 4450 */     if (supported_extensions.contains("GL_ARB_sync") && !ARB_sync_initNativeFunctionAddresses())
/* 4451 */       remove(supported_extensions, "GL_ARB_sync"); 
/* 4452 */     if (supported_extensions.contains("GL_ARB_tessellation_shader") && !ARB_tessellation_shader_initNativeFunctionAddresses())
/* 4453 */       remove(supported_extensions, "GL_ARB_tessellation_shader"); 
/* 4454 */     if (supported_extensions.contains("GL_ARB_texture_buffer_object") && !ARB_texture_buffer_object_initNativeFunctionAddresses())
/* 4455 */       remove(supported_extensions, "GL_ARB_texture_buffer_object"); 
/* 4456 */     if (supported_extensions.contains("GL_ARB_texture_compression") && !ARB_texture_compression_initNativeFunctionAddresses())
/* 4457 */       remove(supported_extensions, "GL_ARB_texture_compression"); 
/* 4458 */     if (supported_extensions.contains("GL_ARB_texture_multisample") && !ARB_texture_multisample_initNativeFunctionAddresses())
/* 4459 */       remove(supported_extensions, "GL_ARB_texture_multisample"); 
/* 4460 */     if (supported_extensions.contains("GL_ARB_timer_query") && !ARB_timer_query_initNativeFunctionAddresses())
/* 4461 */       remove(supported_extensions, "GL_ARB_timer_query"); 
/* 4462 */     if (supported_extensions.contains("GL_ARB_transform_feedback2") && !ARB_transform_feedback2_initNativeFunctionAddresses())
/* 4463 */       remove(supported_extensions, "GL_ARB_transform_feedback2"); 
/* 4464 */     if (supported_extensions.contains("GL_ARB_transform_feedback3") && !ARB_transform_feedback3_initNativeFunctionAddresses())
/* 4465 */       remove(supported_extensions, "GL_ARB_transform_feedback3"); 
/* 4466 */     if (supported_extensions.contains("GL_ARB_transpose_matrix") && !ARB_transpose_matrix_initNativeFunctionAddresses())
/* 4467 */       remove(supported_extensions, "GL_ARB_transpose_matrix"); 
/* 4468 */     if (supported_extensions.contains("GL_ARB_uniform_buffer_object") && !ARB_uniform_buffer_object_initNativeFunctionAddresses())
/* 4469 */       remove(supported_extensions, "GL_ARB_uniform_buffer_object"); 
/* 4470 */     if (supported_extensions.contains("GL_ARB_vertex_array_object") && !ARB_vertex_array_object_initNativeFunctionAddresses())
/* 4471 */       remove(supported_extensions, "GL_ARB_vertex_array_object"); 
/* 4472 */     if (supported_extensions.contains("GL_ARB_vertex_blend") && !ARB_vertex_blend_initNativeFunctionAddresses())
/* 4473 */       remove(supported_extensions, "GL_ARB_vertex_blend"); 
/* 4474 */     if (supported_extensions.contains("GL_ARB_vertex_program") && !ARB_vertex_program_initNativeFunctionAddresses())
/* 4475 */       remove(supported_extensions, "GL_ARB_vertex_program"); 
/* 4476 */     if (supported_extensions.contains("GL_ARB_vertex_shader") && !ARB_vertex_shader_initNativeFunctionAddresses())
/* 4477 */       remove(supported_extensions, "GL_ARB_vertex_shader"); 
/* 4478 */     if (supported_extensions.contains("GL_ARB_vertex_type_2_10_10_10_rev") && !ARB_vertex_type_2_10_10_10_rev_initNativeFunctionAddresses())
/* 4479 */       remove(supported_extensions, "GL_ARB_vertex_type_2_10_10_10_rev"); 
/* 4480 */     if (supported_extensions.contains("GL_ARB_window_pos") && !ARB_window_pos_initNativeFunctionAddresses(forwardCompatible))
/* 4481 */       remove(supported_extensions, "GL_ARB_window_pos"); 
/* 4482 */     if (supported_extensions.contains("GL_ATI_draw_buffers") && !ATI_draw_buffers_initNativeFunctionAddresses())
/* 4483 */       remove(supported_extensions, "GL_ATI_draw_buffers"); 
/* 4484 */     if (supported_extensions.contains("GL_ATI_element_array") && !ATI_element_array_initNativeFunctionAddresses())
/* 4485 */       remove(supported_extensions, "GL_ATI_element_array"); 
/* 4486 */     if (supported_extensions.contains("GL_ATI_envmap_bumpmap") && !ATI_envmap_bumpmap_initNativeFunctionAddresses())
/* 4487 */       remove(supported_extensions, "GL_ATI_envmap_bumpmap"); 
/* 4488 */     if (supported_extensions.contains("GL_ATI_fragment_shader") && !ATI_fragment_shader_initNativeFunctionAddresses())
/* 4489 */       remove(supported_extensions, "GL_ATI_fragment_shader"); 
/* 4490 */     if (supported_extensions.contains("GL_ATI_map_object_buffer") && !ATI_map_object_buffer_initNativeFunctionAddresses())
/* 4491 */       remove(supported_extensions, "GL_ATI_map_object_buffer"); 
/* 4492 */     if (supported_extensions.contains("GL_ATI_pn_triangles") && !ATI_pn_triangles_initNativeFunctionAddresses())
/* 4493 */       remove(supported_extensions, "GL_ATI_pn_triangles"); 
/* 4494 */     if (supported_extensions.contains("GL_ATI_separate_stencil") && !ATI_separate_stencil_initNativeFunctionAddresses())
/* 4495 */       remove(supported_extensions, "GL_ATI_separate_stencil"); 
/* 4496 */     if (supported_extensions.contains("GL_ATI_vertex_array_object") && !ATI_vertex_array_object_initNativeFunctionAddresses())
/* 4497 */       remove(supported_extensions, "GL_ATI_vertex_array_object"); 
/* 4498 */     if (supported_extensions.contains("GL_ATI_vertex_attrib_array_object") && !ATI_vertex_attrib_array_object_initNativeFunctionAddresses())
/* 4499 */       remove(supported_extensions, "GL_ATI_vertex_attrib_array_object"); 
/* 4500 */     if (supported_extensions.contains("GL_ATI_vertex_streams") && !ATI_vertex_streams_initNativeFunctionAddresses())
/* 4501 */       remove(supported_extensions, "GL_ATI_vertex_streams"); 
/* 4502 */     if (supported_extensions.contains("GL_EXT_bindable_uniform") && !EXT_bindable_uniform_initNativeFunctionAddresses())
/* 4503 */       remove(supported_extensions, "GL_EXT_bindable_uniform"); 
/* 4504 */     if (supported_extensions.contains("GL_EXT_blend_color") && !EXT_blend_color_initNativeFunctionAddresses())
/* 4505 */       remove(supported_extensions, "GL_EXT_blend_color"); 
/* 4506 */     if (supported_extensions.contains("GL_EXT_blend_equation_separate") && !EXT_blend_equation_separate_initNativeFunctionAddresses())
/* 4507 */       remove(supported_extensions, "GL_EXT_blend_equation_separate"); 
/* 4508 */     if (supported_extensions.contains("GL_EXT_blend_func_separate") && !EXT_blend_func_separate_initNativeFunctionAddresses())
/* 4509 */       remove(supported_extensions, "GL_EXT_blend_func_separate"); 
/* 4510 */     if (supported_extensions.contains("GL_EXT_blend_minmax") && !EXT_blend_minmax_initNativeFunctionAddresses())
/* 4511 */       remove(supported_extensions, "GL_EXT_blend_minmax"); 
/* 4512 */     if (supported_extensions.contains("GL_EXT_compiled_vertex_array") && !EXT_compiled_vertex_array_initNativeFunctionAddresses())
/* 4513 */       remove(supported_extensions, "GL_EXT_compiled_vertex_array"); 
/* 4514 */     if (supported_extensions.contains("GL_EXT_depth_bounds_test") && !EXT_depth_bounds_test_initNativeFunctionAddresses())
/* 4515 */       remove(supported_extensions, "GL_EXT_depth_bounds_test"); 
/* 4516 */     supported_extensions.add("GL_EXT_direct_state_access");
/* 4517 */     if (supported_extensions.contains("GL_EXT_direct_state_access") && !EXT_direct_state_access_initNativeFunctionAddresses(forwardCompatible, supported_extensions))
/* 4518 */       remove(supported_extensions, "GL_EXT_direct_state_access"); 
/* 4519 */     if (supported_extensions.contains("GL_EXT_draw_buffers2") && !EXT_draw_buffers2_initNativeFunctionAddresses())
/* 4520 */       remove(supported_extensions, "GL_EXT_draw_buffers2"); 
/* 4521 */     if (supported_extensions.contains("GL_EXT_draw_instanced") && !EXT_draw_instanced_initNativeFunctionAddresses())
/* 4522 */       remove(supported_extensions, "GL_EXT_draw_instanced"); 
/* 4523 */     if (supported_extensions.contains("GL_EXT_draw_range_elements") && !EXT_draw_range_elements_initNativeFunctionAddresses())
/* 4524 */       remove(supported_extensions, "GL_EXT_draw_range_elements"); 
/* 4525 */     if (supported_extensions.contains("GL_EXT_fog_coord") && !EXT_fog_coord_initNativeFunctionAddresses())
/* 4526 */       remove(supported_extensions, "GL_EXT_fog_coord"); 
/* 4527 */     if (supported_extensions.contains("GL_EXT_framebuffer_blit") && !EXT_framebuffer_blit_initNativeFunctionAddresses())
/* 4528 */       remove(supported_extensions, "GL_EXT_framebuffer_blit"); 
/* 4529 */     if (supported_extensions.contains("GL_EXT_framebuffer_multisample") && !EXT_framebuffer_multisample_initNativeFunctionAddresses())
/* 4530 */       remove(supported_extensions, "GL_EXT_framebuffer_multisample"); 
/* 4531 */     if (supported_extensions.contains("GL_EXT_framebuffer_object") && !EXT_framebuffer_object_initNativeFunctionAddresses())
/* 4532 */       remove(supported_extensions, "GL_EXT_framebuffer_object"); 
/* 4533 */     if (supported_extensions.contains("GL_EXT_geometry_shader4") && !EXT_geometry_shader4_initNativeFunctionAddresses())
/* 4534 */       remove(supported_extensions, "GL_EXT_geometry_shader4"); 
/* 4535 */     if (supported_extensions.contains("GL_EXT_gpu_program_parameters") && !EXT_gpu_program_parameters_initNativeFunctionAddresses())
/* 4536 */       remove(supported_extensions, "GL_EXT_gpu_program_parameters"); 
/* 4537 */     if (supported_extensions.contains("GL_EXT_gpu_shader4") && !EXT_gpu_shader4_initNativeFunctionAddresses())
/* 4538 */       remove(supported_extensions, "GL_EXT_gpu_shader4"); 
/* 4539 */     if (supported_extensions.contains("GL_EXT_multi_draw_arrays") && !EXT_multi_draw_arrays_initNativeFunctionAddresses())
/* 4540 */       remove(supported_extensions, "GL_EXT_multi_draw_arrays"); 
/* 4541 */     if (supported_extensions.contains("GL_EXT_paletted_texture") && !EXT_paletted_texture_initNativeFunctionAddresses())
/* 4542 */       remove(supported_extensions, "GL_EXT_paletted_texture"); 
/* 4543 */     if (supported_extensions.contains("GL_EXT_point_parameters") && !EXT_point_parameters_initNativeFunctionAddresses())
/* 4544 */       remove(supported_extensions, "GL_EXT_point_parameters"); 
/* 4545 */     if (supported_extensions.contains("GL_EXT_provoking_vertex") && !EXT_provoking_vertex_initNativeFunctionAddresses())
/* 4546 */       remove(supported_extensions, "GL_EXT_provoking_vertex"); 
/* 4547 */     if (supported_extensions.contains("GL_EXT_secondary_color") && !EXT_secondary_color_initNativeFunctionAddresses())
/* 4548 */       remove(supported_extensions, "GL_EXT_secondary_color"); 
/* 4549 */     if (supported_extensions.contains("GL_EXT_separate_shader_objects") && !EXT_separate_shader_objects_initNativeFunctionAddresses())
/* 4550 */       remove(supported_extensions, "GL_EXT_separate_shader_objects"); 
/* 4551 */     if (supported_extensions.contains("GL_EXT_shader_image_load_store") && !EXT_shader_image_load_store_initNativeFunctionAddresses())
/* 4552 */       remove(supported_extensions, "GL_EXT_shader_image_load_store"); 
/* 4553 */     if (supported_extensions.contains("GL_EXT_stencil_clear_tag") && !EXT_stencil_clear_tag_initNativeFunctionAddresses())
/* 4554 */       remove(supported_extensions, "GL_EXT_stencil_clear_tag"); 
/* 4555 */     if (supported_extensions.contains("GL_EXT_stencil_two_side") && !EXT_stencil_two_side_initNativeFunctionAddresses())
/* 4556 */       remove(supported_extensions, "GL_EXT_stencil_two_side"); 
/* 4557 */     if (supported_extensions.contains("GL_EXT_texture_array") && !EXT_texture_array_initNativeFunctionAddresses())
/* 4558 */       remove(supported_extensions, "GL_EXT_texture_array"); 
/* 4559 */     if (supported_extensions.contains("GL_EXT_texture_buffer_object") && !EXT_texture_buffer_object_initNativeFunctionAddresses())
/* 4560 */       remove(supported_extensions, "GL_EXT_texture_buffer_object"); 
/* 4561 */     if (supported_extensions.contains("GL_EXT_texture_integer") && !EXT_texture_integer_initNativeFunctionAddresses())
/* 4562 */       remove(supported_extensions, "GL_EXT_texture_integer"); 
/* 4563 */     if (supported_extensions.contains("GL_EXT_timer_query") && !EXT_timer_query_initNativeFunctionAddresses())
/* 4564 */       remove(supported_extensions, "GL_EXT_timer_query"); 
/* 4565 */     if (supported_extensions.contains("GL_EXT_transform_feedback") && !EXT_transform_feedback_initNativeFunctionAddresses())
/* 4566 */       remove(supported_extensions, "GL_EXT_transform_feedback"); 
/* 4567 */     if (supported_extensions.contains("GL_EXT_vertex_attrib_64bit") && !EXT_vertex_attrib_64bit_initNativeFunctionAddresses(supported_extensions))
/* 4568 */       remove(supported_extensions, "GL_EXT_vertex_attrib_64bit"); 
/* 4569 */     if (supported_extensions.contains("GL_EXT_vertex_shader") && !EXT_vertex_shader_initNativeFunctionAddresses())
/* 4570 */       remove(supported_extensions, "GL_EXT_vertex_shader"); 
/* 4571 */     if (supported_extensions.contains("GL_EXT_vertex_weighting") && !EXT_vertex_weighting_initNativeFunctionAddresses())
/* 4572 */       remove(supported_extensions, "GL_EXT_vertex_weighting"); 
/* 4573 */     if (supported_extensions.contains("OpenGL12") && !GL12_initNativeFunctionAddresses())
/* 4574 */       remove(supported_extensions, "OpenGL12"); 
/* 4575 */     if (supported_extensions.contains("OpenGL13") && !GL13_initNativeFunctionAddresses(forwardCompatible))
/* 4576 */       remove(supported_extensions, "OpenGL13"); 
/* 4577 */     if (supported_extensions.contains("OpenGL14") && !GL14_initNativeFunctionAddresses(forwardCompatible))
/* 4578 */       remove(supported_extensions, "OpenGL14"); 
/* 4579 */     if (supported_extensions.contains("OpenGL15") && !GL15_initNativeFunctionAddresses())
/* 4580 */       remove(supported_extensions, "OpenGL15"); 
/* 4581 */     if (supported_extensions.contains("OpenGL20") && !GL20_initNativeFunctionAddresses())
/* 4582 */       remove(supported_extensions, "OpenGL20"); 
/* 4583 */     if (supported_extensions.contains("OpenGL21") && !GL21_initNativeFunctionAddresses())
/* 4584 */       remove(supported_extensions, "OpenGL21"); 
/* 4585 */     if (supported_extensions.contains("OpenGL30") && !GL30_initNativeFunctionAddresses())
/* 4586 */       remove(supported_extensions, "OpenGL30"); 
/* 4587 */     if (supported_extensions.contains("OpenGL31") && !GL31_initNativeFunctionAddresses())
/* 4588 */       remove(supported_extensions, "OpenGL31"); 
/* 4589 */     if (supported_extensions.contains("OpenGL32") && !GL32_initNativeFunctionAddresses())
/* 4590 */       remove(supported_extensions, "OpenGL32"); 
/* 4591 */     if (supported_extensions.contains("OpenGL33") && !GL33_initNativeFunctionAddresses(forwardCompatible))
/* 4592 */       remove(supported_extensions, "OpenGL33"); 
/* 4593 */     if (supported_extensions.contains("OpenGL40") && !GL40_initNativeFunctionAddresses())
/* 4594 */       remove(supported_extensions, "OpenGL40"); 
/* 4595 */     if (supported_extensions.contains("GL_GREMEDY_string_marker") && !GREMEDY_string_marker_initNativeFunctionAddresses())
/* 4596 */       remove(supported_extensions, "GL_GREMEDY_string_marker"); 
/* 4597 */     if (supported_extensions.contains("GL_NV_conditional_render") && !NV_conditional_render_initNativeFunctionAddresses())
/* 4598 */       remove(supported_extensions, "GL_NV_conditional_render"); 
/* 4599 */     if (supported_extensions.contains("GL_NV_copy_image") && !NV_copy_image_initNativeFunctionAddresses())
/* 4600 */       remove(supported_extensions, "GL_NV_copy_image"); 
/* 4601 */     if (supported_extensions.contains("GL_NV_depth_buffer_float") && !NV_depth_buffer_float_initNativeFunctionAddresses())
/* 4602 */       remove(supported_extensions, "GL_NV_depth_buffer_float"); 
/* 4603 */     if (supported_extensions.contains("GL_NV_evaluators") && !NV_evaluators_initNativeFunctionAddresses())
/* 4604 */       remove(supported_extensions, "GL_NV_evaluators"); 
/* 4605 */     if (supported_extensions.contains("GL_NV_explicit_multisample") && !NV_explicit_multisample_initNativeFunctionAddresses())
/* 4606 */       remove(supported_extensions, "GL_NV_explicit_multisample"); 
/* 4607 */     if (supported_extensions.contains("GL_NV_fence") && !NV_fence_initNativeFunctionAddresses())
/* 4608 */       remove(supported_extensions, "GL_NV_fence"); 
/* 4609 */     if (supported_extensions.contains("GL_NV_fragment_program") && !NV_fragment_program_initNativeFunctionAddresses())
/* 4610 */       remove(supported_extensions, "GL_NV_fragment_program"); 
/* 4611 */     if (supported_extensions.contains("GL_NV_framebuffer_multisample_coverage") && !NV_framebuffer_multisample_coverage_initNativeFunctionAddresses())
/* 4612 */       remove(supported_extensions, "GL_NV_framebuffer_multisample_coverage"); 
/* 4613 */     if (supported_extensions.contains("GL_NV_geometry_program4") && !NV_geometry_program4_initNativeFunctionAddresses())
/* 4614 */       remove(supported_extensions, "GL_NV_geometry_program4"); 
/* 4615 */     if (supported_extensions.contains("GL_NV_gpu_program4") && !NV_gpu_program4_initNativeFunctionAddresses())
/* 4616 */       remove(supported_extensions, "GL_NV_gpu_program4"); 
/* 4617 */     if (supported_extensions.contains("GL_NV_gpu_shader5") && !NV_gpu_shader5_initNativeFunctionAddresses(supported_extensions))
/* 4618 */       remove(supported_extensions, "GL_NV_gpu_shader5"); 
/* 4619 */     if (supported_extensions.contains("GL_NV_half_float") && !NV_half_float_initNativeFunctionAddresses())
/* 4620 */       remove(supported_extensions, "GL_NV_half_float"); 
/* 4621 */     if (supported_extensions.contains("GL_NV_occlusion_query") && !NV_occlusion_query_initNativeFunctionAddresses())
/* 4622 */       remove(supported_extensions, "GL_NV_occlusion_query"); 
/* 4623 */     if (supported_extensions.contains("GL_NV_parameter_buffer_object") && !NV_parameter_buffer_object_initNativeFunctionAddresses())
/* 4624 */       remove(supported_extensions, "GL_NV_parameter_buffer_object"); 
/* 4625 */     if (supported_extensions.contains("GL_NV_pixel_data_range") && !NV_pixel_data_range_initNativeFunctionAddresses())
/* 4626 */       remove(supported_extensions, "GL_NV_pixel_data_range"); 
/* 4627 */     if (supported_extensions.contains("GL_NV_point_sprite") && !NV_point_sprite_initNativeFunctionAddresses())
/* 4628 */       remove(supported_extensions, "GL_NV_point_sprite"); 
/* 4629 */     supported_extensions.add("GL_NV_primitive_restart");
/* 4630 */     if (supported_extensions.contains("GL_NV_primitive_restart") && !NV_primitive_restart_initNativeFunctionAddresses())
/* 4631 */       remove(supported_extensions, "GL_NV_primitive_restart"); 
/* 4632 */     if (supported_extensions.contains("GL_NV_program") && !NV_program_initNativeFunctionAddresses())
/* 4633 */       remove(supported_extensions, "GL_NV_program"); 
/* 4634 */     if (supported_extensions.contains("GL_NV_register_combiners") && !NV_register_combiners_initNativeFunctionAddresses())
/* 4635 */       remove(supported_extensions, "GL_NV_register_combiners"); 
/* 4636 */     if (supported_extensions.contains("GL_NV_register_combiners2") && !NV_register_combiners2_initNativeFunctionAddresses())
/* 4637 */       remove(supported_extensions, "GL_NV_register_combiners2"); 
/* 4638 */     if (supported_extensions.contains("GL_NV_shader_buffer_load") && !NV_shader_buffer_load_initNativeFunctionAddresses())
/* 4639 */       remove(supported_extensions, "GL_NV_shader_buffer_load"); 
/* 4640 */     if (supported_extensions.contains("GL_NV_texture_barrier") && !NV_texture_barrier_initNativeFunctionAddresses())
/* 4641 */       remove(supported_extensions, "GL_NV_texture_barrier"); 
/* 4642 */     if (supported_extensions.contains("GL_NV_transform_feedback") && !NV_transform_feedback_initNativeFunctionAddresses())
/* 4643 */       remove(supported_extensions, "GL_NV_transform_feedback"); 
/* 4644 */     if (supported_extensions.contains("GL_NV_transform_feedback2") && !NV_transform_feedback2_initNativeFunctionAddresses())
/* 4645 */       remove(supported_extensions, "GL_NV_transform_feedback2"); 
/* 4646 */     if (supported_extensions.contains("GL_NV_vertex_array_range") && !NV_vertex_array_range_initNativeFunctionAddresses())
/* 4647 */       remove(supported_extensions, "GL_NV_vertex_array_range"); 
/* 4648 */     if (supported_extensions.contains("GL_NV_vertex_attrib_integer_64bit") && !NV_vertex_attrib_integer_64bit_initNativeFunctionAddresses(supported_extensions))
/* 4649 */       remove(supported_extensions, "GL_NV_vertex_attrib_integer_64bit"); 
/* 4650 */     if (supported_extensions.contains("GL_NV_vertex_buffer_unified_memory") && !NV_vertex_buffer_unified_memory_initNativeFunctionAddresses())
/* 4651 */       remove(supported_extensions, "GL_NV_vertex_buffer_unified_memory"); 
/* 4652 */     if (supported_extensions.contains("GL_NV_vertex_program") && !NV_vertex_program_initNativeFunctionAddresses())
/* 4653 */       remove(supported_extensions, "GL_NV_vertex_program"); 
/* 4654 */     return supported_extensions;
/*      */   }
/*      */ 
/*      */   
/*      */   static void unloadAllStubs() {}
/*      */   
/*      */   ContextCapabilities(boolean forwardCompatible) throws LWJGLException {
/* 4661 */     Set supported_extensions = initAllStubs(forwardCompatible);
/* 4662 */     this.GL_AMD_conservative_depth = supported_extensions.contains("GL_AMD_conservative_depth");
/* 4663 */     this.GL_AMD_draw_buffers_blend = supported_extensions.contains("GL_AMD_draw_buffers_blend");
/* 4664 */     this.GL_AMD_performance_monitor = supported_extensions.contains("GL_AMD_performance_monitor");
/* 4665 */     this.GL_AMD_seamless_cubemap_per_texture = supported_extensions.contains("GL_AMD_seamless_cubemap_per_texture");
/* 4666 */     this.GL_AMD_shader_stencil_export = supported_extensions.contains("GL_AMD_shader_stencil_export");
/* 4667 */     this.GL_AMD_texture_texture4 = supported_extensions.contains("GL_AMD_texture_texture4");
/* 4668 */     this.GL_AMD_vertex_shader_tessellator = supported_extensions.contains("GL_AMD_vertex_shader_tessellator");
/* 4669 */     this.GL_APPLE_aux_depth_stencil = supported_extensions.contains("GL_APPLE_aux_depth_stencil");
/* 4670 */     this.GL_APPLE_client_storage = supported_extensions.contains("GL_APPLE_client_storage");
/* 4671 */     this.GL_APPLE_element_array = supported_extensions.contains("GL_APPLE_element_array");
/* 4672 */     this.GL_APPLE_fence = supported_extensions.contains("GL_APPLE_fence");
/* 4673 */     this.GL_APPLE_float_pixels = supported_extensions.contains("GL_APPLE_float_pixels");
/* 4674 */     this.GL_APPLE_flush_buffer_range = supported_extensions.contains("GL_APPLE_flush_buffer_range");
/* 4675 */     this.GL_APPLE_object_purgeable = supported_extensions.contains("GL_APPLE_object_purgeable");
/* 4676 */     this.GL_APPLE_packed_pixels = supported_extensions.contains("GL_APPLE_packed_pixels");
/* 4677 */     this.GL_APPLE_rgb_422 = supported_extensions.contains("GL_APPLE_rgb_422");
/* 4678 */     this.GL_APPLE_row_bytes = supported_extensions.contains("GL_APPLE_row_bytes");
/* 4679 */     this.GL_APPLE_texture_range = supported_extensions.contains("GL_APPLE_texture_range");
/* 4680 */     this.GL_APPLE_vertex_array_object = supported_extensions.contains("GL_APPLE_vertex_array_object");
/* 4681 */     this.GL_APPLE_vertex_array_range = supported_extensions.contains("GL_APPLE_vertex_array_range");
/* 4682 */     this.GL_APPLE_vertex_program_evaluators = supported_extensions.contains("GL_APPLE_vertex_program_evaluators");
/* 4683 */     this.GL_APPLE_ycbcr_422 = supported_extensions.contains("GL_APPLE_ycbcr_422");
/* 4684 */     this.GL_ARB_blend_func_extended = supported_extensions.contains("GL_ARB_blend_func_extended");
/* 4685 */     this.GL_ARB_color_buffer_float = supported_extensions.contains("GL_ARB_color_buffer_float");
/* 4686 */     this.GL_ARB_compatibility = supported_extensions.contains("GL_ARB_compatibility");
/* 4687 */     this.GL_ARB_copy_buffer = supported_extensions.contains("GL_ARB_copy_buffer");
/* 4688 */     this.GL_ARB_depth_buffer_float = supported_extensions.contains("GL_ARB_depth_buffer_float");
/* 4689 */     this.GL_ARB_depth_clamp = supported_extensions.contains("GL_ARB_depth_clamp");
/* 4690 */     this.GL_ARB_depth_texture = supported_extensions.contains("GL_ARB_depth_texture");
/* 4691 */     this.GL_ARB_draw_buffers = supported_extensions.contains("GL_ARB_draw_buffers");
/* 4692 */     this.GL_ARB_draw_buffers_blend = supported_extensions.contains("GL_ARB_draw_buffers_blend");
/* 4693 */     this.GL_ARB_draw_elements_base_vertex = supported_extensions.contains("GL_ARB_draw_elements_base_vertex");
/* 4694 */     this.GL_ARB_draw_indirect = supported_extensions.contains("GL_ARB_draw_indirect");
/* 4695 */     this.GL_ARB_draw_instanced = supported_extensions.contains("GL_ARB_draw_instanced");
/* 4696 */     this.GL_ARB_explicit_attrib_location = supported_extensions.contains("GL_ARB_explicit_attrib_location");
/* 4697 */     this.GL_ARB_fragment_coord_conventions = supported_extensions.contains("GL_ARB_fragment_coord_conventions");
/* 4698 */     this.GL_ARB_fragment_program = (supported_extensions.contains("GL_ARB_fragment_program") && supported_extensions.contains("GL_ARB_program"));
/*      */     
/* 4700 */     this.GL_ARB_fragment_program_shadow = supported_extensions.contains("GL_ARB_fragment_program_shadow");
/* 4701 */     this.GL_ARB_fragment_shader = supported_extensions.contains("GL_ARB_fragment_shader");
/* 4702 */     this.GL_ARB_framebuffer_object = supported_extensions.contains("GL_ARB_framebuffer_object");
/* 4703 */     this.GL_ARB_framebuffer_sRGB = supported_extensions.contains("GL_ARB_framebuffer_sRGB");
/* 4704 */     this.GL_ARB_geometry_shader4 = supported_extensions.contains("GL_ARB_geometry_shader4");
/* 4705 */     this.GL_ARB_gpu_shader5 = supported_extensions.contains("GL_ARB_gpu_shader5");
/* 4706 */     this.GL_ARB_gpu_shader_fp64 = supported_extensions.contains("GL_ARB_gpu_shader_fp64");
/* 4707 */     this.GL_ARB_half_float_pixel = supported_extensions.contains("GL_ARB_half_float_pixel");
/* 4708 */     this.GL_ARB_half_float_vertex = supported_extensions.contains("GL_ARB_half_float_vertex");
/* 4709 */     this.GL_ARB_imaging = supported_extensions.contains("GL_ARB_imaging");
/* 4710 */     this.GL_ARB_instanced_arrays = supported_extensions.contains("GL_ARB_instanced_arrays");
/* 4711 */     this.GL_ARB_map_buffer_range = supported_extensions.contains("GL_ARB_map_buffer_range");
/* 4712 */     this.GL_ARB_matrix_palette = supported_extensions.contains("GL_ARB_matrix_palette");
/* 4713 */     this.GL_ARB_multisample = supported_extensions.contains("GL_ARB_multisample");
/* 4714 */     this.GL_ARB_multitexture = supported_extensions.contains("GL_ARB_multitexture");
/* 4715 */     this.GL_ARB_occlusion_query = supported_extensions.contains("GL_ARB_occlusion_query");
/* 4716 */     this.GL_ARB_occlusion_query2 = supported_extensions.contains("GL_ARB_occlusion_query2");
/* 4717 */     this.GL_ARB_pixel_buffer_object = (supported_extensions.contains("GL_ARB_pixel_buffer_object") && supported_extensions.contains("GL_ARB_buffer_object"));
/*      */     
/* 4719 */     this.GL_ARB_point_parameters = supported_extensions.contains("GL_ARB_point_parameters");
/* 4720 */     this.GL_ARB_point_sprite = supported_extensions.contains("GL_ARB_point_sprite");
/* 4721 */     this.GL_ARB_provoking_vertex = supported_extensions.contains("GL_ARB_provoking_vertex");
/* 4722 */     this.GL_ARB_sample_shading = supported_extensions.contains("GL_ARB_sample_shading");
/* 4723 */     this.GL_ARB_sampler_objects = supported_extensions.contains("GL_ARB_sampler_objects");
/* 4724 */     this.GL_ARB_seamless_cube_map = supported_extensions.contains("GL_ARB_seamless_cube_map");
/* 4725 */     this.GL_ARB_shader_bit_encoding = supported_extensions.contains("GL_ARB_shader_bit_encoding");
/* 4726 */     this.GL_ARB_shader_objects = supported_extensions.contains("GL_ARB_shader_objects");
/* 4727 */     this.GL_ARB_shader_subroutine = supported_extensions.contains("GL_ARB_shader_subroutine");
/* 4728 */     this.GL_ARB_shader_texture_lod = supported_extensions.contains("GL_ARB_shader_texture_lod");
/* 4729 */     this.GL_ARB_shading_language_100 = supported_extensions.contains("GL_ARB_shading_language_100");
/* 4730 */     this.GL_ARB_shading_language_include = supported_extensions.contains("GL_ARB_shading_language_include");
/* 4731 */     this.GL_ARB_shadow = supported_extensions.contains("GL_ARB_shadow");
/* 4732 */     this.GL_ARB_shadow_ambient = supported_extensions.contains("GL_ARB_shadow_ambient");
/* 4733 */     this.GL_ARB_sync = supported_extensions.contains("GL_ARB_sync");
/* 4734 */     this.GL_ARB_tessellation_shader = supported_extensions.contains("GL_ARB_tessellation_shader");
/* 4735 */     this.GL_ARB_texture_border_clamp = supported_extensions.contains("GL_ARB_texture_border_clamp");
/* 4736 */     this.GL_ARB_texture_buffer_object = supported_extensions.contains("GL_ARB_texture_buffer_object");
/* 4737 */     this.GL_ARB_texture_buffer_object_rgb32 = supported_extensions.contains("GL_ARB_texture_buffer_object_rgb32");
/* 4738 */     this.GL_ARB_texture_compression = supported_extensions.contains("GL_ARB_texture_compression");
/* 4739 */     this.GL_ARB_texture_compression_bptc = supported_extensions.contains("GL_ARB_texture_compression_bptc");
/* 4740 */     this.GL_ARB_texture_compression_rgtc = supported_extensions.contains("GL_ARB_texture_compression_rgtc");
/* 4741 */     this.GL_ARB_texture_cube_map = supported_extensions.contains("GL_ARB_texture_cube_map");
/* 4742 */     this.GL_ARB_texture_cube_map_array = supported_extensions.contains("GL_ARB_texture_cube_map_array");
/* 4743 */     this.GL_ARB_texture_env_add = supported_extensions.contains("GL_ARB_texture_env_add");
/* 4744 */     this.GL_ARB_texture_env_combine = supported_extensions.contains("GL_ARB_texture_env_combine");
/* 4745 */     this.GL_ARB_texture_env_crossbar = supported_extensions.contains("GL_ARB_texture_env_crossbar");
/* 4746 */     this.GL_ARB_texture_env_dot3 = supported_extensions.contains("GL_ARB_texture_env_dot3");
/* 4747 */     this.GL_ARB_texture_float = supported_extensions.contains("GL_ARB_texture_float");
/* 4748 */     this.GL_ARB_texture_gather = supported_extensions.contains("GL_ARB_texture_gather");
/* 4749 */     this.GL_ARB_texture_mirrored_repeat = supported_extensions.contains("GL_ARB_texture_mirrored_repeat");
/* 4750 */     this.GL_ARB_texture_multisample = supported_extensions.contains("GL_ARB_texture_multisample");
/* 4751 */     this.GL_ARB_texture_non_power_of_two = supported_extensions.contains("GL_ARB_texture_non_power_of_two");
/* 4752 */     this.GL_ARB_texture_query_lod = supported_extensions.contains("GL_ARB_texture_query_lod");
/* 4753 */     this.GL_ARB_texture_rectangle = supported_extensions.contains("GL_ARB_texture_rectangle");
/* 4754 */     this.GL_ARB_texture_rg = supported_extensions.contains("GL_ARB_texture_rg");
/* 4755 */     this.GL_ARB_texture_rgb10_a2ui = supported_extensions.contains("GL_ARB_texture_rgb10_a2ui");
/* 4756 */     this.GL_ARB_texture_swizzle = supported_extensions.contains("GL_ARB_texture_swizzle");
/* 4757 */     this.GL_ARB_timer_query = supported_extensions.contains("GL_ARB_timer_query");
/* 4758 */     this.GL_ARB_transform_feedback2 = supported_extensions.contains("GL_ARB_transform_feedback2");
/* 4759 */     this.GL_ARB_transform_feedback3 = supported_extensions.contains("GL_ARB_transform_feedback3");
/* 4760 */     this.GL_ARB_transpose_matrix = supported_extensions.contains("GL_ARB_transpose_matrix");
/* 4761 */     this.GL_ARB_uniform_buffer_object = supported_extensions.contains("GL_ARB_uniform_buffer_object");
/* 4762 */     this.GL_ARB_vertex_array_bgra = supported_extensions.contains("GL_ARB_vertex_array_bgra");
/* 4763 */     this.GL_ARB_vertex_array_object = supported_extensions.contains("GL_ARB_vertex_array_object");
/* 4764 */     this.GL_ARB_vertex_blend = supported_extensions.contains("GL_ARB_vertex_blend");
/* 4765 */     this.GL_ARB_vertex_buffer_object = (supported_extensions.contains("GL_ARB_vertex_buffer_object") && supported_extensions.contains("GL_ARB_buffer_object"));
/*      */     
/* 4767 */     this.GL_ARB_vertex_program = (supported_extensions.contains("GL_ARB_vertex_program") && supported_extensions.contains("GL_ARB_program"));
/*      */     
/* 4769 */     this.GL_ARB_vertex_shader = supported_extensions.contains("GL_ARB_vertex_shader");
/* 4770 */     this.GL_ARB_vertex_type_2_10_10_10_rev = supported_extensions.contains("GL_ARB_vertex_type_2_10_10_10_rev");
/* 4771 */     this.GL_ARB_window_pos = supported_extensions.contains("GL_ARB_window_pos");
/* 4772 */     this.GL_ATI_draw_buffers = supported_extensions.contains("GL_ATI_draw_buffers");
/* 4773 */     this.GL_ATI_element_array = supported_extensions.contains("GL_ATI_element_array");
/* 4774 */     this.GL_ATI_envmap_bumpmap = supported_extensions.contains("GL_ATI_envmap_bumpmap");
/* 4775 */     this.GL_ATI_fragment_shader = supported_extensions.contains("GL_ATI_fragment_shader");
/* 4776 */     this.GL_ATI_map_object_buffer = supported_extensions.contains("GL_ATI_map_object_buffer");
/* 4777 */     this.GL_ATI_meminfo = supported_extensions.contains("GL_ATI_meminfo");
/* 4778 */     this.GL_ATI_pn_triangles = supported_extensions.contains("GL_ATI_pn_triangles");
/* 4779 */     this.GL_ATI_separate_stencil = supported_extensions.contains("GL_ATI_separate_stencil");
/* 4780 */     this.GL_ATI_shader_texture_lod = supported_extensions.contains("GL_ATI_shader_texture_lod");
/* 4781 */     this.GL_ATI_text_fragment_shader = supported_extensions.contains("GL_ATI_text_fragment_shader");
/* 4782 */     this.GL_ATI_texture_compression_3dc = supported_extensions.contains("GL_ATI_texture_compression_3dc");
/* 4783 */     this.GL_ATI_texture_env_combine3 = supported_extensions.contains("GL_ATI_texture_env_combine3");
/* 4784 */     this.GL_ATI_texture_float = supported_extensions.contains("GL_ATI_texture_float");
/* 4785 */     this.GL_ATI_texture_mirror_once = supported_extensions.contains("GL_ATI_texture_mirror_once");
/* 4786 */     this.GL_ATI_vertex_array_object = supported_extensions.contains("GL_ATI_vertex_array_object");
/* 4787 */     this.GL_ATI_vertex_attrib_array_object = supported_extensions.contains("GL_ATI_vertex_attrib_array_object");
/* 4788 */     this.GL_ATI_vertex_streams = supported_extensions.contains("GL_ATI_vertex_streams");
/* 4789 */     this.GL_EXT_abgr = supported_extensions.contains("GL_EXT_abgr");
/* 4790 */     this.GL_EXT_bgra = supported_extensions.contains("GL_EXT_bgra");
/* 4791 */     this.GL_EXT_bindable_uniform = supported_extensions.contains("GL_EXT_bindable_uniform");
/* 4792 */     this.GL_EXT_blend_color = supported_extensions.contains("GL_EXT_blend_color");
/* 4793 */     this.GL_EXT_blend_equation_separate = supported_extensions.contains("GL_EXT_blend_equation_separate");
/* 4794 */     this.GL_EXT_blend_func_separate = supported_extensions.contains("GL_EXT_blend_func_separate");
/* 4795 */     this.GL_EXT_blend_minmax = supported_extensions.contains("GL_EXT_blend_minmax");
/* 4796 */     this.GL_EXT_blend_subtract = supported_extensions.contains("GL_EXT_blend_subtract");
/* 4797 */     this.GL_EXT_Cg_shader = supported_extensions.contains("GL_EXT_Cg_shader");
/* 4798 */     this.GL_EXT_compiled_vertex_array = supported_extensions.contains("GL_EXT_compiled_vertex_array");
/* 4799 */     this.GL_EXT_depth_bounds_test = supported_extensions.contains("GL_EXT_depth_bounds_test");
/* 4800 */     this.GL_EXT_direct_state_access = supported_extensions.contains("GL_EXT_direct_state_access");
/* 4801 */     this.GL_EXT_draw_buffers2 = supported_extensions.contains("GL_EXT_draw_buffers2");
/* 4802 */     this.GL_EXT_draw_instanced = supported_extensions.contains("GL_EXT_draw_instanced");
/* 4803 */     this.GL_EXT_draw_range_elements = supported_extensions.contains("GL_EXT_draw_range_elements");
/* 4804 */     this.GL_EXT_fog_coord = supported_extensions.contains("GL_EXT_fog_coord");
/* 4805 */     this.GL_EXT_framebuffer_blit = supported_extensions.contains("GL_EXT_framebuffer_blit");
/* 4806 */     this.GL_EXT_framebuffer_multisample = supported_extensions.contains("GL_EXT_framebuffer_multisample");
/* 4807 */     this.GL_EXT_framebuffer_object = supported_extensions.contains("GL_EXT_framebuffer_object");
/* 4808 */     this.GL_EXT_framebuffer_sRGB = supported_extensions.contains("GL_EXT_framebuffer_sRGB");
/* 4809 */     this.GL_EXT_geometry_shader4 = supported_extensions.contains("GL_EXT_geometry_shader4");
/* 4810 */     this.GL_EXT_gpu_program_parameters = supported_extensions.contains("GL_EXT_gpu_program_parameters");
/* 4811 */     this.GL_EXT_gpu_shader4 = supported_extensions.contains("GL_EXT_gpu_shader4");
/* 4812 */     this.GL_EXT_multi_draw_arrays = supported_extensions.contains("GL_EXT_multi_draw_arrays");
/* 4813 */     this.GL_EXT_packed_depth_stencil = supported_extensions.contains("GL_EXT_packed_depth_stencil");
/* 4814 */     this.GL_EXT_packed_float = supported_extensions.contains("GL_EXT_packed_float");
/* 4815 */     this.GL_EXT_packed_pixels = supported_extensions.contains("GL_EXT_packed_pixels");
/* 4816 */     this.GL_EXT_paletted_texture = supported_extensions.contains("GL_EXT_paletted_texture");
/* 4817 */     this.GL_EXT_pixel_buffer_object = (supported_extensions.contains("GL_EXT_pixel_buffer_object") && supported_extensions.contains("GL_ARB_buffer_object"));
/*      */     
/* 4819 */     this.GL_EXT_point_parameters = supported_extensions.contains("GL_EXT_point_parameters");
/* 4820 */     this.GL_EXT_provoking_vertex = supported_extensions.contains("GL_EXT_provoking_vertex");
/* 4821 */     this.GL_EXT_rescale_normal = supported_extensions.contains("GL_EXT_rescale_normal");
/* 4822 */     this.GL_EXT_secondary_color = supported_extensions.contains("GL_EXT_secondary_color");
/* 4823 */     this.GL_EXT_separate_shader_objects = supported_extensions.contains("GL_EXT_separate_shader_objects");
/* 4824 */     this.GL_EXT_separate_specular_color = supported_extensions.contains("GL_EXT_separate_specular_color");
/* 4825 */     this.GL_EXT_shader_image_load_store = supported_extensions.contains("GL_EXT_shader_image_load_store");
/* 4826 */     this.GL_EXT_shadow_funcs = supported_extensions.contains("GL_EXT_shadow_funcs");
/* 4827 */     this.GL_EXT_shared_texture_palette = supported_extensions.contains("GL_EXT_shared_texture_palette");
/* 4828 */     this.GL_EXT_stencil_clear_tag = supported_extensions.contains("GL_EXT_stencil_clear_tag");
/* 4829 */     this.GL_EXT_stencil_two_side = supported_extensions.contains("GL_EXT_stencil_two_side");
/* 4830 */     this.GL_EXT_stencil_wrap = supported_extensions.contains("GL_EXT_stencil_wrap");
/* 4831 */     this.GL_EXT_texture_3d = supported_extensions.contains("GL_EXT_texture_3d");
/* 4832 */     this.GL_EXT_texture_array = supported_extensions.contains("GL_EXT_texture_array");
/* 4833 */     this.GL_EXT_texture_buffer_object = supported_extensions.contains("GL_EXT_texture_buffer_object");
/* 4834 */     this.GL_EXT_texture_compression_latc = supported_extensions.contains("GL_EXT_texture_compression_latc");
/* 4835 */     this.GL_EXT_texture_compression_rgtc = supported_extensions.contains("GL_EXT_texture_compression_rgtc");
/* 4836 */     this.GL_EXT_texture_compression_s3tc = supported_extensions.contains("GL_EXT_texture_compression_s3tc");
/* 4837 */     this.GL_EXT_texture_env_combine = supported_extensions.contains("GL_EXT_texture_env_combine");
/* 4838 */     this.GL_EXT_texture_env_dot3 = supported_extensions.contains("GL_EXT_texture_env_dot3");
/* 4839 */     this.GL_EXT_texture_filter_anisotropic = supported_extensions.contains("GL_EXT_texture_filter_anisotropic");
/* 4840 */     this.GL_EXT_texture_integer = supported_extensions.contains("GL_EXT_texture_integer");
/* 4841 */     this.GL_EXT_texture_lod_bias = supported_extensions.contains("GL_EXT_texture_lod_bias");
/* 4842 */     this.GL_EXT_texture_mirror_clamp = supported_extensions.contains("GL_EXT_texture_mirror_clamp");
/* 4843 */     this.GL_EXT_texture_rectangle = supported_extensions.contains("GL_EXT_texture_rectangle");
/* 4844 */     this.GL_EXT_texture_sRGB = supported_extensions.contains("GL_EXT_texture_sRGB");
/* 4845 */     this.GL_EXT_texture_shared_exponent = supported_extensions.contains("GL_EXT_texture_shared_exponent");
/* 4846 */     this.GL_EXT_texture_snorm = supported_extensions.contains("GL_EXT_texture_snorm");
/* 4847 */     this.GL_EXT_texture_swizzle = supported_extensions.contains("GL_EXT_texture_swizzle");
/* 4848 */     this.GL_EXT_timer_query = supported_extensions.contains("GL_EXT_timer_query");
/* 4849 */     this.GL_EXT_transform_feedback = supported_extensions.contains("GL_EXT_transform_feedback");
/* 4850 */     this.GL_EXT_vertex_array_bgra = supported_extensions.contains("GL_EXT_vertex_array_bgra");
/* 4851 */     this.GL_EXT_vertex_attrib_64bit = supported_extensions.contains("GL_EXT_vertex_attrib_64bit");
/* 4852 */     this.GL_EXT_vertex_shader = supported_extensions.contains("GL_EXT_vertex_shader");
/* 4853 */     this.GL_EXT_vertex_weighting = supported_extensions.contains("GL_EXT_vertex_weighting");
/* 4854 */     this.OpenGL11 = supported_extensions.contains("OpenGL11");
/* 4855 */     this.OpenGL12 = supported_extensions.contains("OpenGL12");
/* 4856 */     this.OpenGL13 = supported_extensions.contains("OpenGL13");
/* 4857 */     this.OpenGL14 = supported_extensions.contains("OpenGL14");
/* 4858 */     this.OpenGL15 = supported_extensions.contains("OpenGL15");
/* 4859 */     this.OpenGL20 = supported_extensions.contains("OpenGL20");
/* 4860 */     this.OpenGL21 = supported_extensions.contains("OpenGL21");
/* 4861 */     this.OpenGL30 = supported_extensions.contains("OpenGL30");
/* 4862 */     this.OpenGL31 = supported_extensions.contains("OpenGL31");
/* 4863 */     this.OpenGL32 = supported_extensions.contains("OpenGL32");
/* 4864 */     this.OpenGL33 = supported_extensions.contains("OpenGL33");
/* 4865 */     this.OpenGL40 = supported_extensions.contains("OpenGL40");
/* 4866 */     this.GL_GREMEDY_string_marker = supported_extensions.contains("GL_GREMEDY_string_marker");
/* 4867 */     this.GL_HP_occlusion_test = supported_extensions.contains("GL_HP_occlusion_test");
/* 4868 */     this.GL_IBM_rasterpos_clip = supported_extensions.contains("GL_IBM_rasterpos_clip");
/* 4869 */     this.GL_NVX_gpu_memory_info = supported_extensions.contains("GL_NVX_gpu_memory_info");
/* 4870 */     this.GL_NV_blend_square = supported_extensions.contains("GL_NV_blend_square");
/* 4871 */     this.GL_NV_conditional_render = supported_extensions.contains("GL_NV_conditional_render");
/* 4872 */     this.GL_NV_copy_depth_to_color = supported_extensions.contains("GL_NV_copy_depth_to_color");
/* 4873 */     this.GL_NV_copy_image = supported_extensions.contains("GL_NV_copy_image");
/* 4874 */     this.GL_NV_depth_buffer_float = supported_extensions.contains("GL_NV_depth_buffer_float");
/* 4875 */     this.GL_NV_depth_clamp = supported_extensions.contains("GL_NV_depth_clamp");
/* 4876 */     this.GL_NV_evaluators = supported_extensions.contains("GL_NV_evaluators");
/* 4877 */     this.GL_NV_explicit_multisample = supported_extensions.contains("GL_NV_explicit_multisample");
/* 4878 */     this.GL_NV_fence = supported_extensions.contains("GL_NV_fence");
/* 4879 */     this.GL_NV_float_buffer = supported_extensions.contains("GL_NV_float_buffer");
/* 4880 */     this.GL_NV_fog_distance = supported_extensions.contains("GL_NV_fog_distance");
/* 4881 */     this.GL_NV_fragment_program = (supported_extensions.contains("GL_NV_fragment_program") && supported_extensions.contains("GL_NV_program"));
/*      */     
/* 4883 */     this.GL_NV_fragment_program2 = supported_extensions.contains("GL_NV_fragment_program2");
/* 4884 */     this.GL_NV_fragment_program4 = supported_extensions.contains("GL_NV_fragment_program4");
/* 4885 */     this.GL_NV_fragment_program_option = supported_extensions.contains("GL_NV_fragment_program_option");
/* 4886 */     this.GL_NV_framebuffer_multisample_coverage = supported_extensions.contains("GL_NV_framebuffer_multisample_coverage");
/* 4887 */     this.GL_NV_geometry_program4 = supported_extensions.contains("GL_NV_geometry_program4");
/* 4888 */     this.GL_NV_geometry_shader4 = supported_extensions.contains("GL_NV_geometry_shader4");
/* 4889 */     this.GL_NV_gpu_program4 = supported_extensions.contains("GL_NV_gpu_program4");
/* 4890 */     this.GL_NV_gpu_program5 = supported_extensions.contains("GL_NV_gpu_program5");
/* 4891 */     this.GL_NV_gpu_shader5 = supported_extensions.contains("GL_NV_gpu_shader5");
/* 4892 */     this.GL_NV_half_float = supported_extensions.contains("GL_NV_half_float");
/* 4893 */     this.GL_NV_light_max_exponent = supported_extensions.contains("GL_NV_light_max_exponent");
/* 4894 */     this.GL_NV_multisample_filter_hint = supported_extensions.contains("GL_NV_multisample_filter_hint");
/* 4895 */     this.GL_NV_occlusion_query = supported_extensions.contains("GL_NV_occlusion_query");
/* 4896 */     this.GL_NV_packed_depth_stencil = supported_extensions.contains("GL_NV_packed_depth_stencil");
/* 4897 */     this.GL_NV_parameter_buffer_object = supported_extensions.contains("GL_NV_parameter_buffer_object");
/* 4898 */     this.GL_NV_parameter_buffer_object2 = supported_extensions.contains("GL_NV_parameter_buffer_object2");
/* 4899 */     this.GL_NV_pixel_data_range = supported_extensions.contains("GL_NV_pixel_data_range");
/* 4900 */     this.GL_NV_point_sprite = supported_extensions.contains("GL_NV_point_sprite");
/* 4901 */     this.GL_NV_primitive_restart = supported_extensions.contains("GL_NV_primitive_restart");
/* 4902 */     this.GL_NV_register_combiners = supported_extensions.contains("GL_NV_register_combiners");
/* 4903 */     this.GL_NV_register_combiners2 = supported_extensions.contains("GL_NV_register_combiners2");
/* 4904 */     this.GL_NV_shader_buffer_load = supported_extensions.contains("GL_NV_shader_buffer_load");
/* 4905 */     this.GL_NV_shader_buffer_store = supported_extensions.contains("GL_NV_shader_buffer_store");
/* 4906 */     this.GL_NV_tessellation_program5 = supported_extensions.contains("GL_NV_tessellation_program5");
/* 4907 */     this.GL_NV_texgen_reflection = supported_extensions.contains("GL_NV_texgen_reflection");
/* 4908 */     this.GL_NV_texture_barrier = supported_extensions.contains("GL_NV_texture_barrier");
/* 4909 */     this.GL_NV_texture_compression_vtc = supported_extensions.contains("GL_NV_texture_compression_vtc");
/* 4910 */     this.GL_NV_texture_env_combine4 = supported_extensions.contains("GL_NV_texture_env_combine4");
/* 4911 */     this.GL_NV_texture_expand_normal = supported_extensions.contains("GL_NV_texture_expand_normal");
/* 4912 */     this.GL_NV_texture_rectangle = supported_extensions.contains("GL_NV_texture_rectangle");
/* 4913 */     this.GL_NV_texture_shader = supported_extensions.contains("GL_NV_texture_shader");
/* 4914 */     this.GL_NV_texture_shader2 = supported_extensions.contains("GL_NV_texture_shader2");
/* 4915 */     this.GL_NV_texture_shader3 = supported_extensions.contains("GL_NV_texture_shader3");
/* 4916 */     this.GL_NV_transform_feedback = supported_extensions.contains("GL_NV_transform_feedback");
/* 4917 */     this.GL_NV_transform_feedback2 = supported_extensions.contains("GL_NV_transform_feedback2");
/* 4918 */     this.GL_NV_vertex_array_range = supported_extensions.contains("GL_NV_vertex_array_range");
/* 4919 */     this.GL_NV_vertex_array_range2 = supported_extensions.contains("GL_NV_vertex_array_range2");
/* 4920 */     this.GL_NV_vertex_attrib_integer_64bit = supported_extensions.contains("GL_NV_vertex_attrib_integer_64bit");
/* 4921 */     this.GL_NV_vertex_buffer_unified_memory = supported_extensions.contains("GL_NV_vertex_buffer_unified_memory");
/* 4922 */     this.GL_NV_vertex_program = (supported_extensions.contains("GL_NV_vertex_program") && supported_extensions.contains("GL_NV_program"));
/*      */     
/* 4924 */     this.GL_NV_vertex_program1_1 = supported_extensions.contains("GL_NV_vertex_program1_1");
/* 4925 */     this.GL_NV_vertex_program2 = supported_extensions.contains("GL_NV_vertex_program2");
/* 4926 */     this.GL_NV_vertex_program2_option = supported_extensions.contains("GL_NV_vertex_program2_option");
/* 4927 */     this.GL_NV_vertex_program3 = supported_extensions.contains("GL_NV_vertex_program3");
/* 4928 */     this.GL_NV_vertex_program4 = supported_extensions.contains("GL_NV_vertex_program4");
/* 4929 */     this.GL_SGIS_generate_mipmap = supported_extensions.contains("GL_SGIS_generate_mipmap");
/* 4930 */     this.GL_SGIS_texture_lod = supported_extensions.contains("GL_SGIS_texture_lod");
/* 4931 */     this.GL_SUN_slice_accum = supported_extensions.contains("GL_SUN_slice_accum");
/* 4932 */     this.tracker.init();
/*      */   }
/*      */ }


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\org\lwjgl\opengl\ContextCapabilities.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */