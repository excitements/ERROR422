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
/*      */ public final class GL11
/*      */ {
/*      */   public static final int GL_ACCUM = 256;
/*      */   public static final int GL_LOAD = 257;
/*      */   public static final int GL_RETURN = 258;
/*      */   public static final int GL_MULT = 259;
/*      */   public static final int GL_ADD = 260;
/*      */   public static final int GL_NEVER = 512;
/*      */   public static final int GL_LESS = 513;
/*      */   public static final int GL_EQUAL = 514;
/*      */   public static final int GL_LEQUAL = 515;
/*      */   public static final int GL_GREATER = 516;
/*      */   public static final int GL_NOTEQUAL = 517;
/*      */   public static final int GL_GEQUAL = 518;
/*      */   public static final int GL_ALWAYS = 519;
/*      */   public static final int GL_CURRENT_BIT = 1;
/*      */   public static final int GL_POINT_BIT = 2;
/*      */   public static final int GL_LINE_BIT = 4;
/*      */   public static final int GL_POLYGON_BIT = 8;
/*      */   public static final int GL_POLYGON_STIPPLE_BIT = 16;
/*      */   public static final int GL_PIXEL_MODE_BIT = 32;
/*      */   public static final int GL_LIGHTING_BIT = 64;
/*      */   public static final int GL_FOG_BIT = 128;
/*      */   public static final int GL_DEPTH_BUFFER_BIT = 256;
/*      */   public static final int GL_ACCUM_BUFFER_BIT = 512;
/*      */   public static final int GL_STENCIL_BUFFER_BIT = 1024;
/*      */   public static final int GL_VIEWPORT_BIT = 2048;
/*      */   public static final int GL_TRANSFORM_BIT = 4096;
/*      */   public static final int GL_ENABLE_BIT = 8192;
/*      */   public static final int GL_COLOR_BUFFER_BIT = 16384;
/*      */   public static final int GL_HINT_BIT = 32768;
/*      */   public static final int GL_EVAL_BIT = 65536;
/*      */   public static final int GL_LIST_BIT = 131072;
/*      */   public static final int GL_TEXTURE_BIT = 262144;
/*      */   public static final int GL_SCISSOR_BIT = 524288;
/*      */   public static final int GL_ALL_ATTRIB_BITS = 1048575;
/*      */   public static final int GL_POINTS = 0;
/*      */   public static final int GL_LINES = 1;
/*      */   public static final int GL_LINE_LOOP = 2;
/*      */   public static final int GL_LINE_STRIP = 3;
/*      */   public static final int GL_TRIANGLES = 4;
/*      */   public static final int GL_TRIANGLE_STRIP = 5;
/*      */   public static final int GL_TRIANGLE_FAN = 6;
/*      */   public static final int GL_QUADS = 7;
/*      */   public static final int GL_QUAD_STRIP = 8;
/*      */   public static final int GL_POLYGON = 9;
/*      */   public static final int GL_ZERO = 0;
/*      */   public static final int GL_ONE = 1;
/*      */   public static final int GL_SRC_COLOR = 768;
/*      */   public static final int GL_ONE_MINUS_SRC_COLOR = 769;
/*      */   public static final int GL_SRC_ALPHA = 770;
/*      */   public static final int GL_ONE_MINUS_SRC_ALPHA = 771;
/*      */   public static final int GL_DST_ALPHA = 772;
/*      */   public static final int GL_ONE_MINUS_DST_ALPHA = 773;
/*      */   public static final int GL_DST_COLOR = 774;
/*      */   public static final int GL_ONE_MINUS_DST_COLOR = 775;
/*      */   public static final int GL_SRC_ALPHA_SATURATE = 776;
/*      */   public static final int GL_CONSTANT_COLOR = 32769;
/*      */   public static final int GL_ONE_MINUS_CONSTANT_COLOR = 32770;
/*      */   public static final int GL_CONSTANT_ALPHA = 32771;
/*      */   public static final int GL_ONE_MINUS_CONSTANT_ALPHA = 32772;
/*      */   public static final int GL_TRUE = 1;
/*      */   public static final int GL_FALSE = 0;
/*      */   public static final int GL_CLIP_PLANE0 = 12288;
/*      */   public static final int GL_CLIP_PLANE1 = 12289;
/*      */   public static final int GL_CLIP_PLANE2 = 12290;
/*      */   public static final int GL_CLIP_PLANE3 = 12291;
/*      */   public static final int GL_CLIP_PLANE4 = 12292;
/*      */   public static final int GL_CLIP_PLANE5 = 12293;
/*      */   public static final int GL_BYTE = 5120;
/*      */   public static final int GL_UNSIGNED_BYTE = 5121;
/*      */   public static final int GL_SHORT = 5122;
/*      */   public static final int GL_UNSIGNED_SHORT = 5123;
/*      */   public static final int GL_INT = 5124;
/*      */   public static final int GL_UNSIGNED_INT = 5125;
/*      */   public static final int GL_FLOAT = 5126;
/*      */   public static final int GL_2_BYTES = 5127;
/*      */   public static final int GL_3_BYTES = 5128;
/*      */   public static final int GL_4_BYTES = 5129;
/*      */   public static final int GL_DOUBLE = 5130;
/*      */   public static final int GL_NONE = 0;
/*      */   public static final int GL_FRONT_LEFT = 1024;
/*      */   public static final int GL_FRONT_RIGHT = 1025;
/*      */   public static final int GL_BACK_LEFT = 1026;
/*      */   public static final int GL_BACK_RIGHT = 1027;
/*      */   public static final int GL_FRONT = 1028;
/*      */   public static final int GL_BACK = 1029;
/*      */   public static final int GL_LEFT = 1030;
/*      */   public static final int GL_RIGHT = 1031;
/*      */   public static final int GL_FRONT_AND_BACK = 1032;
/*      */   public static final int GL_AUX0 = 1033;
/*      */   public static final int GL_AUX1 = 1034;
/*      */   public static final int GL_AUX2 = 1035;
/*      */   public static final int GL_AUX3 = 1036;
/*      */   public static final int GL_NO_ERROR = 0;
/*      */   public static final int GL_INVALID_ENUM = 1280;
/*      */   public static final int GL_INVALID_VALUE = 1281;
/*      */   public static final int GL_INVALID_OPERATION = 1282;
/*      */   public static final int GL_STACK_OVERFLOW = 1283;
/*      */   public static final int GL_STACK_UNDERFLOW = 1284;
/*      */   public static final int GL_OUT_OF_MEMORY = 1285;
/*      */   public static final int GL_2D = 1536;
/*      */   public static final int GL_3D = 1537;
/*      */   public static final int GL_3D_COLOR = 1538;
/*      */   public static final int GL_3D_COLOR_TEXTURE = 1539;
/*      */   public static final int GL_4D_COLOR_TEXTURE = 1540;
/*      */   public static final int GL_PASS_THROUGH_TOKEN = 1792;
/*      */   public static final int GL_POINT_TOKEN = 1793;
/*      */   public static final int GL_LINE_TOKEN = 1794;
/*      */   public static final int GL_POLYGON_TOKEN = 1795;
/*      */   public static final int GL_BITMAP_TOKEN = 1796;
/*      */   public static final int GL_DRAW_PIXEL_TOKEN = 1797;
/*      */   public static final int GL_COPY_PIXEL_TOKEN = 1798;
/*      */   public static final int GL_LINE_RESET_TOKEN = 1799;
/*      */   public static final int GL_EXP = 2048;
/*      */   public static final int GL_EXP2 = 2049;
/*      */   public static final int GL_CW = 2304;
/*      */   public static final int GL_CCW = 2305;
/*      */   public static final int GL_COEFF = 2560;
/*      */   public static final int GL_ORDER = 2561;
/*      */   public static final int GL_DOMAIN = 2562;
/*      */   public static final int GL_CURRENT_COLOR = 2816;
/*      */   public static final int GL_CURRENT_INDEX = 2817;
/*      */   public static final int GL_CURRENT_NORMAL = 2818;
/*      */   public static final int GL_CURRENT_TEXTURE_COORDS = 2819;
/*      */   public static final int GL_CURRENT_RASTER_COLOR = 2820;
/*      */   public static final int GL_CURRENT_RASTER_INDEX = 2821;
/*      */   public static final int GL_CURRENT_RASTER_TEXTURE_COORDS = 2822;
/*      */   public static final int GL_CURRENT_RASTER_POSITION = 2823;
/*      */   public static final int GL_CURRENT_RASTER_POSITION_VALID = 2824;
/*      */   public static final int GL_CURRENT_RASTER_DISTANCE = 2825;
/*      */   public static final int GL_POINT_SMOOTH = 2832;
/*      */   public static final int GL_POINT_SIZE = 2833;
/*      */   public static final int GL_POINT_SIZE_RANGE = 2834;
/*      */   public static final int GL_POINT_SIZE_GRANULARITY = 2835;
/*      */   public static final int GL_LINE_SMOOTH = 2848;
/*      */   public static final int GL_LINE_WIDTH = 2849;
/*      */   public static final int GL_LINE_WIDTH_RANGE = 2850;
/*      */   public static final int GL_LINE_WIDTH_GRANULARITY = 2851;
/*      */   public static final int GL_LINE_STIPPLE = 2852;
/*      */   public static final int GL_LINE_STIPPLE_PATTERN = 2853;
/*      */   public static final int GL_LINE_STIPPLE_REPEAT = 2854;
/*      */   public static final int GL_LIST_MODE = 2864;
/*      */   public static final int GL_MAX_LIST_NESTING = 2865;
/*      */   public static final int GL_LIST_BASE = 2866;
/*      */   public static final int GL_LIST_INDEX = 2867;
/*      */   public static final int GL_POLYGON_MODE = 2880;
/*      */   public static final int GL_POLYGON_SMOOTH = 2881;
/*      */   public static final int GL_POLYGON_STIPPLE = 2882;
/*      */   public static final int GL_EDGE_FLAG = 2883;
/*      */   public static final int GL_CULL_FACE = 2884;
/*      */   public static final int GL_CULL_FACE_MODE = 2885;
/*      */   public static final int GL_FRONT_FACE = 2886;
/*      */   public static final int GL_LIGHTING = 2896;
/*      */   public static final int GL_LIGHT_MODEL_LOCAL_VIEWER = 2897;
/*      */   public static final int GL_LIGHT_MODEL_TWO_SIDE = 2898;
/*      */   public static final int GL_LIGHT_MODEL_AMBIENT = 2899;
/*      */   public static final int GL_SHADE_MODEL = 2900;
/*      */   public static final int GL_COLOR_MATERIAL_FACE = 2901;
/*      */   public static final int GL_COLOR_MATERIAL_PARAMETER = 2902;
/*      */   public static final int GL_COLOR_MATERIAL = 2903;
/*      */   public static final int GL_FOG = 2912;
/*      */   public static final int GL_FOG_INDEX = 2913;
/*      */   public static final int GL_FOG_DENSITY = 2914;
/*      */   public static final int GL_FOG_START = 2915;
/*      */   public static final int GL_FOG_END = 2916;
/*      */   public static final int GL_FOG_MODE = 2917;
/*      */   public static final int GL_FOG_COLOR = 2918;
/*      */   public static final int GL_DEPTH_RANGE = 2928;
/*      */   public static final int GL_DEPTH_TEST = 2929;
/*      */   public static final int GL_DEPTH_WRITEMASK = 2930;
/*      */   public static final int GL_DEPTH_CLEAR_VALUE = 2931;
/*      */   public static final int GL_DEPTH_FUNC = 2932;
/*      */   public static final int GL_ACCUM_CLEAR_VALUE = 2944;
/*      */   public static final int GL_STENCIL_TEST = 2960;
/*      */   public static final int GL_STENCIL_CLEAR_VALUE = 2961;
/*      */   public static final int GL_STENCIL_FUNC = 2962;
/*      */   public static final int GL_STENCIL_VALUE_MASK = 2963;
/*      */   public static final int GL_STENCIL_FAIL = 2964;
/*      */   public static final int GL_STENCIL_PASS_DEPTH_FAIL = 2965;
/*      */   public static final int GL_STENCIL_PASS_DEPTH_PASS = 2966;
/*      */   public static final int GL_STENCIL_REF = 2967;
/*      */   public static final int GL_STENCIL_WRITEMASK = 2968;
/*      */   public static final int GL_MATRIX_MODE = 2976;
/*      */   public static final int GL_NORMALIZE = 2977;
/*      */   public static final int GL_VIEWPORT = 2978;
/*      */   public static final int GL_MODELVIEW_STACK_DEPTH = 2979;
/*      */   public static final int GL_PROJECTION_STACK_DEPTH = 2980;
/*      */   public static final int GL_TEXTURE_STACK_DEPTH = 2981;
/*      */   public static final int GL_MODELVIEW_MATRIX = 2982;
/*      */   public static final int GL_PROJECTION_MATRIX = 2983;
/*      */   public static final int GL_TEXTURE_MATRIX = 2984;
/*      */   public static final int GL_ATTRIB_STACK_DEPTH = 2992;
/*      */   public static final int GL_CLIENT_ATTRIB_STACK_DEPTH = 2993;
/*      */   public static final int GL_ALPHA_TEST = 3008;
/*      */   public static final int GL_ALPHA_TEST_FUNC = 3009;
/*      */   public static final int GL_ALPHA_TEST_REF = 3010;
/*      */   public static final int GL_DITHER = 3024;
/*      */   public static final int GL_BLEND_DST = 3040;
/*      */   public static final int GL_BLEND_SRC = 3041;
/*      */   public static final int GL_BLEND = 3042;
/*      */   public static final int GL_LOGIC_OP_MODE = 3056;
/*      */   public static final int GL_INDEX_LOGIC_OP = 3057;
/*      */   public static final int GL_COLOR_LOGIC_OP = 3058;
/*      */   public static final int GL_AUX_BUFFERS = 3072;
/*      */   public static final int GL_DRAW_BUFFER = 3073;
/*      */   public static final int GL_READ_BUFFER = 3074;
/*      */   public static final int GL_SCISSOR_BOX = 3088;
/*      */   public static final int GL_SCISSOR_TEST = 3089;
/*      */   public static final int GL_INDEX_CLEAR_VALUE = 3104;
/*      */   public static final int GL_INDEX_WRITEMASK = 3105;
/*      */   public static final int GL_COLOR_CLEAR_VALUE = 3106;
/*      */   public static final int GL_COLOR_WRITEMASK = 3107;
/*      */   public static final int GL_INDEX_MODE = 3120;
/*      */   public static final int GL_RGBA_MODE = 3121;
/*      */   public static final int GL_DOUBLEBUFFER = 3122;
/*      */   public static final int GL_STEREO = 3123;
/*      */   public static final int GL_RENDER_MODE = 3136;
/*      */   public static final int GL_PERSPECTIVE_CORRECTION_HINT = 3152;
/*      */   public static final int GL_POINT_SMOOTH_HINT = 3153;
/*      */   public static final int GL_LINE_SMOOTH_HINT = 3154;
/*      */   public static final int GL_POLYGON_SMOOTH_HINT = 3155;
/*      */   public static final int GL_FOG_HINT = 3156;
/*      */   public static final int GL_TEXTURE_GEN_S = 3168;
/*      */   public static final int GL_TEXTURE_GEN_T = 3169;
/*      */   public static final int GL_TEXTURE_GEN_R = 3170;
/*      */   public static final int GL_TEXTURE_GEN_Q = 3171;
/*      */   public static final int GL_PIXEL_MAP_I_TO_I = 3184;
/*      */   public static final int GL_PIXEL_MAP_S_TO_S = 3185;
/*      */   public static final int GL_PIXEL_MAP_I_TO_R = 3186;
/*      */   public static final int GL_PIXEL_MAP_I_TO_G = 3187;
/*      */   public static final int GL_PIXEL_MAP_I_TO_B = 3188;
/*      */   public static final int GL_PIXEL_MAP_I_TO_A = 3189;
/*      */   public static final int GL_PIXEL_MAP_R_TO_R = 3190;
/*      */   public static final int GL_PIXEL_MAP_G_TO_G = 3191;
/*      */   public static final int GL_PIXEL_MAP_B_TO_B = 3192;
/*      */   public static final int GL_PIXEL_MAP_A_TO_A = 3193;
/*      */   public static final int GL_PIXEL_MAP_I_TO_I_SIZE = 3248;
/*      */   public static final int GL_PIXEL_MAP_S_TO_S_SIZE = 3249;
/*      */   public static final int GL_PIXEL_MAP_I_TO_R_SIZE = 3250;
/*      */   public static final int GL_PIXEL_MAP_I_TO_G_SIZE = 3251;
/*      */   public static final int GL_PIXEL_MAP_I_TO_B_SIZE = 3252;
/*      */   public static final int GL_PIXEL_MAP_I_TO_A_SIZE = 3253;
/*      */   public static final int GL_PIXEL_MAP_R_TO_R_SIZE = 3254;
/*      */   public static final int GL_PIXEL_MAP_G_TO_G_SIZE = 3255;
/*      */   public static final int GL_PIXEL_MAP_B_TO_B_SIZE = 3256;
/*      */   public static final int GL_PIXEL_MAP_A_TO_A_SIZE = 3257;
/*      */   public static final int GL_UNPACK_SWAP_BYTES = 3312;
/*      */   public static final int GL_UNPACK_LSB_FIRST = 3313;
/*      */   public static final int GL_UNPACK_ROW_LENGTH = 3314;
/*      */   public static final int GL_UNPACK_SKIP_ROWS = 3315;
/*      */   public static final int GL_UNPACK_SKIP_PIXELS = 3316;
/*      */   public static final int GL_UNPACK_ALIGNMENT = 3317;
/*      */   public static final int GL_PACK_SWAP_BYTES = 3328;
/*      */   public static final int GL_PACK_LSB_FIRST = 3329;
/*      */   public static final int GL_PACK_ROW_LENGTH = 3330;
/*      */   public static final int GL_PACK_SKIP_ROWS = 3331;
/*      */   public static final int GL_PACK_SKIP_PIXELS = 3332;
/*      */   public static final int GL_PACK_ALIGNMENT = 3333;
/*      */   public static final int GL_MAP_COLOR = 3344;
/*      */   public static final int GL_MAP_STENCIL = 3345;
/*      */   public static final int GL_INDEX_SHIFT = 3346;
/*      */   public static final int GL_INDEX_OFFSET = 3347;
/*      */   public static final int GL_RED_SCALE = 3348;
/*      */   public static final int GL_RED_BIAS = 3349;
/*      */   public static final int GL_ZOOM_X = 3350;
/*      */   public static final int GL_ZOOM_Y = 3351;
/*      */   public static final int GL_GREEN_SCALE = 3352;
/*      */   public static final int GL_GREEN_BIAS = 3353;
/*      */   public static final int GL_BLUE_SCALE = 3354;
/*      */   public static final int GL_BLUE_BIAS = 3355;
/*      */   public static final int GL_ALPHA_SCALE = 3356;
/*      */   public static final int GL_ALPHA_BIAS = 3357;
/*      */   public static final int GL_DEPTH_SCALE = 3358;
/*      */   public static final int GL_DEPTH_BIAS = 3359;
/*      */   public static final int GL_MAX_EVAL_ORDER = 3376;
/*      */   public static final int GL_MAX_LIGHTS = 3377;
/*      */   public static final int GL_MAX_CLIP_PLANES = 3378;
/*      */   public static final int GL_MAX_TEXTURE_SIZE = 3379;
/*      */   public static final int GL_MAX_PIXEL_MAP_TABLE = 3380;
/*      */   public static final int GL_MAX_ATTRIB_STACK_DEPTH = 3381;
/*      */   public static final int GL_MAX_MODELVIEW_STACK_DEPTH = 3382;
/*      */   public static final int GL_MAX_NAME_STACK_DEPTH = 3383;
/*      */   public static final int GL_MAX_PROJECTION_STACK_DEPTH = 3384;
/*      */   public static final int GL_MAX_TEXTURE_STACK_DEPTH = 3385;
/*      */   public static final int GL_MAX_VIEWPORT_DIMS = 3386;
/*      */   public static final int GL_MAX_CLIENT_ATTRIB_STACK_DEPTH = 3387;
/*      */   public static final int GL_SUBPIXEL_BITS = 3408;
/*      */   public static final int GL_INDEX_BITS = 3409;
/*      */   public static final int GL_RED_BITS = 3410;
/*      */   public static final int GL_GREEN_BITS = 3411;
/*      */   public static final int GL_BLUE_BITS = 3412;
/*      */   public static final int GL_ALPHA_BITS = 3413;
/*      */   public static final int GL_DEPTH_BITS = 3414;
/*      */   public static final int GL_STENCIL_BITS = 3415;
/*      */   public static final int GL_ACCUM_RED_BITS = 3416;
/*      */   public static final int GL_ACCUM_GREEN_BITS = 3417;
/*      */   public static final int GL_ACCUM_BLUE_BITS = 3418;
/*      */   public static final int GL_ACCUM_ALPHA_BITS = 3419;
/*      */   public static final int GL_NAME_STACK_DEPTH = 3440;
/*      */   public static final int GL_AUTO_NORMAL = 3456;
/*      */   public static final int GL_MAP1_COLOR_4 = 3472;
/*      */   public static final int GL_MAP1_INDEX = 3473;
/*      */   public static final int GL_MAP1_NORMAL = 3474;
/*      */   public static final int GL_MAP1_TEXTURE_COORD_1 = 3475;
/*      */   public static final int GL_MAP1_TEXTURE_COORD_2 = 3476;
/*      */   public static final int GL_MAP1_TEXTURE_COORD_3 = 3477;
/*      */   public static final int GL_MAP1_TEXTURE_COORD_4 = 3478;
/*      */   public static final int GL_MAP1_VERTEX_3 = 3479;
/*      */   public static final int GL_MAP1_VERTEX_4 = 3480;
/*      */   public static final int GL_MAP2_COLOR_4 = 3504;
/*      */   public static final int GL_MAP2_INDEX = 3505;
/*      */   public static final int GL_MAP2_NORMAL = 3506;
/*      */   public static final int GL_MAP2_TEXTURE_COORD_1 = 3507;
/*      */   public static final int GL_MAP2_TEXTURE_COORD_2 = 3508;
/*      */   public static final int GL_MAP2_TEXTURE_COORD_3 = 3509;
/*      */   public static final int GL_MAP2_TEXTURE_COORD_4 = 3510;
/*      */   public static final int GL_MAP2_VERTEX_3 = 3511;
/*      */   public static final int GL_MAP2_VERTEX_4 = 3512;
/*      */   public static final int GL_MAP1_GRID_DOMAIN = 3536;
/*      */   public static final int GL_MAP1_GRID_SEGMENTS = 3537;
/*      */   public static final int GL_MAP2_GRID_DOMAIN = 3538;
/*      */   public static final int GL_MAP2_GRID_SEGMENTS = 3539;
/*      */   public static final int GL_TEXTURE_1D = 3552;
/*      */   public static final int GL_TEXTURE_2D = 3553;
/*      */   public static final int GL_FEEDBACK_BUFFER_POINTER = 3568;
/*      */   public static final int GL_FEEDBACK_BUFFER_SIZE = 3569;
/*      */   public static final int GL_FEEDBACK_BUFFER_TYPE = 3570;
/*      */   public static final int GL_SELECTION_BUFFER_POINTER = 3571;
/*      */   public static final int GL_SELECTION_BUFFER_SIZE = 3572;
/*      */   public static final int GL_TEXTURE_WIDTH = 4096;
/*      */   public static final int GL_TEXTURE_HEIGHT = 4097;
/*      */   public static final int GL_TEXTURE_INTERNAL_FORMAT = 4099;
/*      */   public static final int GL_TEXTURE_BORDER_COLOR = 4100;
/*      */   public static final int GL_TEXTURE_BORDER = 4101;
/*      */   public static final int GL_DONT_CARE = 4352;
/*      */   public static final int GL_FASTEST = 4353;
/*      */   public static final int GL_NICEST = 4354;
/*      */   public static final int GL_LIGHT0 = 16384;
/*      */   public static final int GL_LIGHT1 = 16385;
/*      */   public static final int GL_LIGHT2 = 16386;
/*      */   public static final int GL_LIGHT3 = 16387;
/*      */   public static final int GL_LIGHT4 = 16388;
/*      */   public static final int GL_LIGHT5 = 16389;
/*      */   public static final int GL_LIGHT6 = 16390;
/*      */   public static final int GL_LIGHT7 = 16391;
/*      */   public static final int GL_AMBIENT = 4608;
/*      */   public static final int GL_DIFFUSE = 4609;
/*      */   public static final int GL_SPECULAR = 4610;
/*      */   public static final int GL_POSITION = 4611;
/*      */   public static final int GL_SPOT_DIRECTION = 4612;
/*      */   public static final int GL_SPOT_EXPONENT = 4613;
/*      */   public static final int GL_SPOT_CUTOFF = 4614;
/*      */   public static final int GL_CONSTANT_ATTENUATION = 4615;
/*      */   public static final int GL_LINEAR_ATTENUATION = 4616;
/*      */   public static final int GL_QUADRATIC_ATTENUATION = 4617;
/*      */   public static final int GL_COMPILE = 4864;
/*      */   public static final int GL_COMPILE_AND_EXECUTE = 4865;
/*      */   public static final int GL_CLEAR = 5376;
/*      */   public static final int GL_AND = 5377;
/*      */   public static final int GL_AND_REVERSE = 5378;
/*      */   public static final int GL_COPY = 5379;
/*      */   public static final int GL_AND_INVERTED = 5380;
/*      */   public static final int GL_NOOP = 5381;
/*      */   public static final int GL_XOR = 5382;
/*      */   public static final int GL_OR = 5383;
/*      */   public static final int GL_NOR = 5384;
/*      */   public static final int GL_EQUIV = 5385;
/*      */   public static final int GL_INVERT = 5386;
/*      */   public static final int GL_OR_REVERSE = 5387;
/*      */   public static final int GL_COPY_INVERTED = 5388;
/*      */   public static final int GL_OR_INVERTED = 5389;
/*      */   public static final int GL_NAND = 5390;
/*      */   public static final int GL_SET = 5391;
/*      */   public static final int GL_EMISSION = 5632;
/*      */   public static final int GL_SHININESS = 5633;
/*      */   public static final int GL_AMBIENT_AND_DIFFUSE = 5634;
/*      */   public static final int GL_COLOR_INDEXES = 5635;
/*      */   public static final int GL_MODELVIEW = 5888;
/*      */   public static final int GL_PROJECTION = 5889;
/*      */   public static final int GL_TEXTURE = 5890;
/*      */   public static final int GL_COLOR = 6144;
/*      */   public static final int GL_DEPTH = 6145;
/*      */   public static final int GL_STENCIL = 6146;
/*      */   public static final int GL_COLOR_INDEX = 6400;
/*      */   public static final int GL_STENCIL_INDEX = 6401;
/*      */   public static final int GL_DEPTH_COMPONENT = 6402;
/*      */   public static final int GL_RED = 6403;
/*      */   public static final int GL_GREEN = 6404;
/*      */   public static final int GL_BLUE = 6405;
/*      */   public static final int GL_ALPHA = 6406;
/*      */   public static final int GL_RGB = 6407;
/*      */   public static final int GL_RGBA = 6408;
/*      */   public static final int GL_LUMINANCE = 6409;
/*      */   public static final int GL_LUMINANCE_ALPHA = 6410;
/*      */   public static final int GL_BITMAP = 6656;
/*      */   public static final int GL_POINT = 6912;
/*      */   public static final int GL_LINE = 6913;
/*      */   public static final int GL_FILL = 6914;
/*      */   public static final int GL_RENDER = 7168;
/*      */   public static final int GL_FEEDBACK = 7169;
/*      */   public static final int GL_SELECT = 7170;
/*      */   public static final int GL_FLAT = 7424;
/*      */   public static final int GL_SMOOTH = 7425;
/*      */   public static final int GL_KEEP = 7680;
/*      */   public static final int GL_REPLACE = 7681;
/*      */   public static final int GL_INCR = 7682;
/*      */   public static final int GL_DECR = 7683;
/*      */   public static final int GL_VENDOR = 7936;
/*      */   public static final int GL_RENDERER = 7937;
/*      */   public static final int GL_VERSION = 7938;
/*      */   public static final int GL_EXTENSIONS = 7939;
/*      */   public static final int GL_S = 8192;
/*      */   public static final int GL_T = 8193;
/*      */   public static final int GL_R = 8194;
/*      */   public static final int GL_Q = 8195;
/*      */   public static final int GL_MODULATE = 8448;
/*      */   public static final int GL_DECAL = 8449;
/*      */   public static final int GL_TEXTURE_ENV_MODE = 8704;
/*      */   public static final int GL_TEXTURE_ENV_COLOR = 8705;
/*      */   public static final int GL_TEXTURE_ENV = 8960;
/*      */   public static final int GL_EYE_LINEAR = 9216;
/*      */   public static final int GL_OBJECT_LINEAR = 9217;
/*      */   public static final int GL_SPHERE_MAP = 9218;
/*      */   public static final int GL_TEXTURE_GEN_MODE = 9472;
/*      */   public static final int GL_OBJECT_PLANE = 9473;
/*      */   public static final int GL_EYE_PLANE = 9474;
/*      */   public static final int GL_NEAREST = 9728;
/*      */   public static final int GL_LINEAR = 9729;
/*      */   public static final int GL_NEAREST_MIPMAP_NEAREST = 9984;
/*      */   public static final int GL_LINEAR_MIPMAP_NEAREST = 9985;
/*      */   public static final int GL_NEAREST_MIPMAP_LINEAR = 9986;
/*      */   public static final int GL_LINEAR_MIPMAP_LINEAR = 9987;
/*      */   public static final int GL_TEXTURE_MAG_FILTER = 10240;
/*      */   public static final int GL_TEXTURE_MIN_FILTER = 10241;
/*      */   public static final int GL_TEXTURE_WRAP_S = 10242;
/*      */   public static final int GL_TEXTURE_WRAP_T = 10243;
/*      */   public static final int GL_CLAMP = 10496;
/*      */   public static final int GL_REPEAT = 10497;
/*      */   public static final int GL_CLIENT_PIXEL_STORE_BIT = 1;
/*      */   public static final int GL_CLIENT_VERTEX_ARRAY_BIT = 2;
/*      */   public static final int GL_ALL_CLIENT_ATTRIB_BITS = -1;
/*      */   public static final int GL_POLYGON_OFFSET_FACTOR = 32824;
/*      */   public static final int GL_POLYGON_OFFSET_UNITS = 10752;
/*      */   public static final int GL_POLYGON_OFFSET_POINT = 10753;
/*      */   public static final int GL_POLYGON_OFFSET_LINE = 10754;
/*      */   public static final int GL_POLYGON_OFFSET_FILL = 32823;
/*      */   public static final int GL_ALPHA4 = 32827;
/*      */   public static final int GL_ALPHA8 = 32828;
/*      */   public static final int GL_ALPHA12 = 32829;
/*      */   public static final int GL_ALPHA16 = 32830;
/*      */   public static final int GL_LUMINANCE4 = 32831;
/*      */   public static final int GL_LUMINANCE8 = 32832;
/*      */   public static final int GL_LUMINANCE12 = 32833;
/*      */   public static final int GL_LUMINANCE16 = 32834;
/*      */   public static final int GL_LUMINANCE4_ALPHA4 = 32835;
/*      */   public static final int GL_LUMINANCE6_ALPHA2 = 32836;
/*      */   public static final int GL_LUMINANCE8_ALPHA8 = 32837;
/*      */   public static final int GL_LUMINANCE12_ALPHA4 = 32838;
/*      */   public static final int GL_LUMINANCE12_ALPHA12 = 32839;
/*      */   public static final int GL_LUMINANCE16_ALPHA16 = 32840;
/*      */   public static final int GL_INTENSITY = 32841;
/*      */   public static final int GL_INTENSITY4 = 32842;
/*      */   public static final int GL_INTENSITY8 = 32843;
/*      */   public static final int GL_INTENSITY12 = 32844;
/*      */   public static final int GL_INTENSITY16 = 32845;
/*      */   public static final int GL_R3_G3_B2 = 10768;
/*      */   public static final int GL_RGB4 = 32847;
/*      */   public static final int GL_RGB5 = 32848;
/*      */   public static final int GL_RGB8 = 32849;
/*      */   public static final int GL_RGB10 = 32850;
/*      */   public static final int GL_RGB12 = 32851;
/*      */   public static final int GL_RGB16 = 32852;
/*      */   public static final int GL_RGBA2 = 32853;
/*      */   public static final int GL_RGBA4 = 32854;
/*      */   public static final int GL_RGB5_A1 = 32855;
/*      */   public static final int GL_RGBA8 = 32856;
/*      */   public static final int GL_RGB10_A2 = 32857;
/*      */   public static final int GL_RGBA12 = 32858;
/*      */   public static final int GL_RGBA16 = 32859;
/*      */   public static final int GL_TEXTURE_RED_SIZE = 32860;
/*      */   public static final int GL_TEXTURE_GREEN_SIZE = 32861;
/*      */   public static final int GL_TEXTURE_BLUE_SIZE = 32862;
/*      */   public static final int GL_TEXTURE_ALPHA_SIZE = 32863;
/*      */   public static final int GL_TEXTURE_LUMINANCE_SIZE = 32864;
/*      */   public static final int GL_TEXTURE_INTENSITY_SIZE = 32865;
/*      */   public static final int GL_PROXY_TEXTURE_1D = 32867;
/*      */   public static final int GL_PROXY_TEXTURE_2D = 32868;
/*      */   public static final int GL_TEXTURE_PRIORITY = 32870;
/*      */   public static final int GL_TEXTURE_RESIDENT = 32871;
/*      */   public static final int GL_TEXTURE_BINDING_1D = 32872;
/*      */   public static final int GL_TEXTURE_BINDING_2D = 32873;
/*      */   public static final int GL_VERTEX_ARRAY = 32884;
/*      */   public static final int GL_NORMAL_ARRAY = 32885;
/*      */   public static final int GL_COLOR_ARRAY = 32886;
/*      */   public static final int GL_INDEX_ARRAY = 32887;
/*      */   public static final int GL_TEXTURE_COORD_ARRAY = 32888;
/*      */   public static final int GL_EDGE_FLAG_ARRAY = 32889;
/*      */   public static final int GL_VERTEX_ARRAY_SIZE = 32890;
/*      */   public static final int GL_VERTEX_ARRAY_TYPE = 32891;
/*      */   public static final int GL_VERTEX_ARRAY_STRIDE = 32892;
/*      */   public static final int GL_NORMAL_ARRAY_TYPE = 32894;
/*      */   public static final int GL_NORMAL_ARRAY_STRIDE = 32895;
/*      */   public static final int GL_COLOR_ARRAY_SIZE = 32897;
/*      */   public static final int GL_COLOR_ARRAY_TYPE = 32898;
/*      */   public static final int GL_COLOR_ARRAY_STRIDE = 32899;
/*      */   public static final int GL_INDEX_ARRAY_TYPE = 32901;
/*      */   public static final int GL_INDEX_ARRAY_STRIDE = 32902;
/*      */   public static final int GL_TEXTURE_COORD_ARRAY_SIZE = 32904;
/*      */   public static final int GL_TEXTURE_COORD_ARRAY_TYPE = 32905;
/*      */   public static final int GL_TEXTURE_COORD_ARRAY_STRIDE = 32906;
/*      */   public static final int GL_EDGE_FLAG_ARRAY_STRIDE = 32908;
/*      */   public static final int GL_VERTEX_ARRAY_POINTER = 32910;
/*      */   public static final int GL_NORMAL_ARRAY_POINTER = 32911;
/*      */   public static final int GL_COLOR_ARRAY_POINTER = 32912;
/*      */   public static final int GL_INDEX_ARRAY_POINTER = 32913;
/*      */   public static final int GL_TEXTURE_COORD_ARRAY_POINTER = 32914;
/*      */   public static final int GL_EDGE_FLAG_ARRAY_POINTER = 32915;
/*      */   public static final int GL_V2F = 10784;
/*      */   public static final int GL_V3F = 10785;
/*      */   public static final int GL_C4UB_V2F = 10786;
/*      */   public static final int GL_C4UB_V3F = 10787;
/*      */   public static final int GL_C3F_V3F = 10788;
/*      */   public static final int GL_N3F_V3F = 10789;
/*      */   public static final int GL_C4F_N3F_V3F = 10790;
/*      */   public static final int GL_T2F_V3F = 10791;
/*      */   public static final int GL_T4F_V4F = 10792;
/*      */   public static final int GL_T2F_C4UB_V3F = 10793;
/*      */   public static final int GL_T2F_C3F_V3F = 10794;
/*      */   public static final int GL_T2F_N3F_V3F = 10795;
/*      */   public static final int GL_T2F_C4F_N3F_V3F = 10796;
/*      */   public static final int GL_T4F_C4F_N3F_V4F = 10797;
/*      */   public static final int GL_LOGIC_OP = 3057;
/*      */   public static final int GL_TEXTURE_COMPONENTS = 4099;
/*      */   
/*      */   public static void glAccum(int op, float value) {
/*  554 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  555 */     long function_pointer = caps.GL11_glAccum_pointer;
/*  556 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  557 */     nglAccum(op, value, function_pointer);
/*      */   }
/*      */   private static native void nglAccum(int paramInt, float paramFloat, long paramLong);
/*      */   
/*      */   public static void glAlphaFunc(int func, float ref) {
/*  562 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  563 */     long function_pointer = caps.GL11_glAlphaFunc_pointer;
/*  564 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  565 */     nglAlphaFunc(func, ref, function_pointer);
/*      */   }
/*      */   private static native void nglAlphaFunc(int paramInt, float paramFloat, long paramLong);
/*      */   
/*      */   public static void glClearColor(float red, float green, float blue, float alpha) {
/*  570 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  571 */     long function_pointer = caps.GL11_glClearColor_pointer;
/*  572 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  573 */     nglClearColor(red, green, blue, alpha, function_pointer);
/*      */   }
/*      */   private static native void nglClearColor(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, long paramLong);
/*      */   
/*      */   public static void glClearAccum(float red, float green, float blue, float alpha) {
/*  578 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  579 */     long function_pointer = caps.GL11_glClearAccum_pointer;
/*  580 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  581 */     nglClearAccum(red, green, blue, alpha, function_pointer);
/*      */   }
/*      */   private static native void nglClearAccum(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, long paramLong);
/*      */   
/*      */   public static void glClear(int mask) {
/*  586 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  587 */     long function_pointer = caps.GL11_glClear_pointer;
/*  588 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  589 */     nglClear(mask, function_pointer);
/*      */   }
/*      */   private static native void nglClear(int paramInt, long paramLong);
/*      */   
/*      */   public static void glCallLists(ByteBuffer lists) {
/*  594 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  595 */     long function_pointer = caps.GL11_glCallLists_pointer;
/*  596 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  597 */     BufferChecks.checkDirect(lists);
/*  598 */     nglCallLists(lists.remaining(), 5121, lists, lists.position(), function_pointer);
/*      */   }
/*      */   public static void glCallLists(IntBuffer lists) {
/*  601 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  602 */     long function_pointer = caps.GL11_glCallLists_pointer;
/*  603 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  604 */     BufferChecks.checkDirect(lists);
/*  605 */     nglCallLists(lists.remaining(), 5125, lists, lists.position() << 2, function_pointer);
/*      */   }
/*      */   public static void glCallLists(ShortBuffer lists) {
/*  608 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  609 */     long function_pointer = caps.GL11_glCallLists_pointer;
/*  610 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  611 */     BufferChecks.checkDirect(lists);
/*  612 */     nglCallLists(lists.remaining(), 5123, lists, lists.position() << 1, function_pointer);
/*      */   }
/*      */   private static native void nglCallLists(int paramInt1, int paramInt2, Buffer paramBuffer, int paramInt3, long paramLong);
/*      */   
/*      */   public static void glCallList(int list) {
/*  617 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  618 */     long function_pointer = caps.GL11_glCallList_pointer;
/*  619 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  620 */     nglCallList(list, function_pointer);
/*      */   }
/*      */   private static native void nglCallList(int paramInt, long paramLong);
/*      */   
/*      */   public static void glBlendFunc(int sfactor, int dfactor) {
/*  625 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  626 */     long function_pointer = caps.GL11_glBlendFunc_pointer;
/*  627 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  628 */     nglBlendFunc(sfactor, dfactor, function_pointer);
/*      */   }
/*      */   private static native void nglBlendFunc(int paramInt1, int paramInt2, long paramLong);
/*      */   
/*      */   public static void glBitmap(int width, int height, float xorig, float yorig, float xmove, float ymove, ByteBuffer bitmap) {
/*  633 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  634 */     long function_pointer = caps.GL11_glBitmap_pointer;
/*  635 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  636 */     GLChecks.ensureUnpackPBOdisabled(caps);
/*  637 */     BufferChecks.checkBuffer(bitmap, (width + 7) / 8 * height);
/*  638 */     nglBitmap(width, height, xorig, yorig, xmove, ymove, bitmap, bitmap.position(), function_pointer);
/*      */   }
/*      */   
/*      */   public static void glBitmap(int width, int height, float xorig, float yorig, float xmove, float ymove, long bitmap_buffer_offset) {
/*  642 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  643 */     long function_pointer = caps.GL11_glBitmap_pointer;
/*  644 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  645 */     GLChecks.ensureUnpackPBOenabled(caps);
/*  646 */     nglBitmapBO(width, height, xorig, yorig, xmove, ymove, bitmap_buffer_offset, function_pointer);
/*      */   }
/*      */   private static native void nglBitmap(int paramInt1, int paramInt2, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, ByteBuffer paramByteBuffer, int paramInt3, long paramLong);
/*      */   private static native void nglBitmapBO(int paramInt1, int paramInt2, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, long paramLong1, long paramLong2);
/*      */   public static void glBindTexture(int target, int texture) {
/*  651 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  652 */     long function_pointer = caps.GL11_glBindTexture_pointer;
/*  653 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  654 */     nglBindTexture(target, texture, function_pointer);
/*      */   }
/*      */   private static native void nglBindTexture(int paramInt1, int paramInt2, long paramLong);
/*      */   
/*      */   public static void glPrioritizeTextures(IntBuffer textures, FloatBuffer priorities) {
/*  659 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  660 */     long function_pointer = caps.GL11_glPrioritizeTextures_pointer;
/*  661 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  662 */     BufferChecks.checkDirect(textures);
/*  663 */     BufferChecks.checkBuffer(priorities, textures.remaining());
/*  664 */     nglPrioritizeTextures(textures.remaining(), textures, textures.position(), priorities, priorities.position(), function_pointer);
/*      */   }
/*      */   private static native void nglPrioritizeTextures(int paramInt1, IntBuffer paramIntBuffer, int paramInt2, FloatBuffer paramFloatBuffer, int paramInt3, long paramLong);
/*      */   
/*      */   public static boolean glAreTexturesResident(IntBuffer textures, ByteBuffer residences) {
/*  669 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  670 */     long function_pointer = caps.GL11_glAreTexturesResident_pointer;
/*  671 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  672 */     BufferChecks.checkDirect(textures);
/*  673 */     BufferChecks.checkBuffer(residences, textures.remaining());
/*  674 */     boolean __result = nglAreTexturesResident(textures.remaining(), textures, textures.position(), residences, residences.position(), function_pointer);
/*  675 */     return __result;
/*      */   }
/*      */   private static native boolean nglAreTexturesResident(int paramInt1, IntBuffer paramIntBuffer, int paramInt2, ByteBuffer paramByteBuffer, int paramInt3, long paramLong);
/*      */   
/*      */   public static void glBegin(int mode) {
/*  680 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  681 */     long function_pointer = caps.GL11_glBegin_pointer;
/*  682 */     BufferChecks.checkFunctionAddress(function_pointer);
/*      */     
/*  684 */     nglBegin(mode, function_pointer);
/*      */   }
/*      */   private static native void nglBegin(int paramInt, long paramLong);
/*      */   
/*      */   public static void glEnd() {
/*  689 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  690 */     long function_pointer = caps.GL11_glEnd_pointer;
/*  691 */     BufferChecks.checkFunctionAddress(function_pointer);
/*      */     
/*  693 */     nglEnd(function_pointer);
/*      */   }
/*      */   private static native void nglEnd(long paramLong);
/*      */   
/*      */   public static void glArrayElement(int i) {
/*  698 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  699 */     long function_pointer = caps.GL11_glArrayElement_pointer;
/*  700 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  701 */     nglArrayElement(i, function_pointer);
/*      */   }
/*      */   private static native void nglArrayElement(int paramInt, long paramLong);
/*      */   
/*      */   public static void glClearDepth(double depth) {
/*  706 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  707 */     long function_pointer = caps.GL11_glClearDepth_pointer;
/*  708 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  709 */     nglClearDepth(depth, function_pointer);
/*      */   }
/*      */   private static native void nglClearDepth(double paramDouble, long paramLong);
/*      */   
/*      */   public static void glDeleteLists(int list, int range) {
/*  714 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  715 */     long function_pointer = caps.GL11_glDeleteLists_pointer;
/*  716 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  717 */     nglDeleteLists(list, range, function_pointer);
/*      */   }
/*      */   private static native void nglDeleteLists(int paramInt1, int paramInt2, long paramLong);
/*      */   
/*      */   public static void glDeleteTextures(IntBuffer textures) {
/*  722 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  723 */     long function_pointer = caps.GL11_glDeleteTextures_pointer;
/*  724 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  725 */     BufferChecks.checkDirect(textures);
/*  726 */     nglDeleteTextures(textures.remaining(), textures, textures.position(), function_pointer);
/*      */   }
/*      */   
/*      */   private static native void nglDeleteTextures(int paramInt1, IntBuffer paramIntBuffer, int paramInt2, long paramLong);
/*      */   
/*      */   public static void glDeleteTextures(int texture) {
/*  732 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  733 */     long function_pointer = caps.GL11_glDeleteTextures_pointer;
/*  734 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  735 */     nglDeleteTextures(1, APIUtils.getBufferInt().put(0, texture), 0, function_pointer);
/*      */   }
/*      */   
/*      */   public static void glCullFace(int mode) {
/*  739 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  740 */     long function_pointer = caps.GL11_glCullFace_pointer;
/*  741 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  742 */     nglCullFace(mode, function_pointer);
/*      */   }
/*      */   private static native void nglCullFace(int paramInt, long paramLong);
/*      */   
/*      */   public static void glCopyTexSubImage2D(int target, int level, int xoffset, int yoffset, int x, int y, int width, int height) {
/*  747 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  748 */     long function_pointer = caps.GL11_glCopyTexSubImage2D_pointer;
/*  749 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  750 */     nglCopyTexSubImage2D(target, level, xoffset, yoffset, x, y, width, height, function_pointer);
/*      */   }
/*      */   private static native void nglCopyTexSubImage2D(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, long paramLong);
/*      */   
/*      */   public static void glCopyTexSubImage1D(int target, int level, int xoffset, int x, int y, int width) {
/*  755 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  756 */     long function_pointer = caps.GL11_glCopyTexSubImage1D_pointer;
/*  757 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  758 */     nglCopyTexSubImage1D(target, level, xoffset, x, y, width, function_pointer);
/*      */   }
/*      */   private static native void nglCopyTexSubImage1D(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, long paramLong);
/*      */   
/*      */   public static void glCopyTexImage2D(int target, int level, int internalFormat, int x, int y, int width, int height, int border) {
/*  763 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  764 */     long function_pointer = caps.GL11_glCopyTexImage2D_pointer;
/*  765 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  766 */     nglCopyTexImage2D(target, level, internalFormat, x, y, width, height, border, function_pointer);
/*      */   }
/*      */   private static native void nglCopyTexImage2D(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, long paramLong);
/*      */   
/*      */   public static void glCopyTexImage1D(int target, int level, int internalFormat, int x, int y, int width, int border) {
/*  771 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  772 */     long function_pointer = caps.GL11_glCopyTexImage1D_pointer;
/*  773 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  774 */     nglCopyTexImage1D(target, level, internalFormat, x, y, width, border, function_pointer);
/*      */   }
/*      */   private static native void nglCopyTexImage1D(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, long paramLong);
/*      */   
/*      */   public static void glCopyPixels(int x, int y, int width, int height, int type) {
/*  779 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  780 */     long function_pointer = caps.GL11_glCopyPixels_pointer;
/*  781 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  782 */     nglCopyPixels(x, y, width, height, type, function_pointer);
/*      */   }
/*      */   private static native void nglCopyPixels(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, long paramLong);
/*      */   
/*      */   public static void glColorPointer(int size, int stride, DoubleBuffer pointer) {
/*  787 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  788 */     long function_pointer = caps.GL11_glColorPointer_pointer;
/*  789 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  790 */     GLChecks.ensureArrayVBOdisabled(caps);
/*  791 */     BufferChecks.checkDirect(pointer);
/*  792 */     (GLChecks.getReferences(caps)).GL11_glColorPointer_pointer = pointer;
/*  793 */     nglColorPointer(size, 5130, stride, pointer, pointer.position() << 3, function_pointer);
/*      */   }
/*      */   public static void glColorPointer(int size, int stride, FloatBuffer pointer) {
/*  796 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  797 */     long function_pointer = caps.GL11_glColorPointer_pointer;
/*  798 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  799 */     GLChecks.ensureArrayVBOdisabled(caps);
/*  800 */     BufferChecks.checkDirect(pointer);
/*  801 */     (GLChecks.getReferences(caps)).GL11_glColorPointer_pointer = pointer;
/*  802 */     nglColorPointer(size, 5126, stride, pointer, pointer.position() << 2, function_pointer);
/*      */   }
/*      */   public static void glColorPointer(int size, boolean unsigned, int stride, ByteBuffer pointer) {
/*  805 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  806 */     long function_pointer = caps.GL11_glColorPointer_pointer;
/*  807 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  808 */     GLChecks.ensureArrayVBOdisabled(caps);
/*  809 */     BufferChecks.checkDirect(pointer);
/*  810 */     (GLChecks.getReferences(caps)).GL11_glColorPointer_pointer = pointer;
/*  811 */     nglColorPointer(size, unsigned ? 5121 : 5120, stride, pointer, pointer.position(), function_pointer);
/*      */   }
/*      */   private static native void nglColorPointer(int paramInt1, int paramInt2, int paramInt3, Buffer paramBuffer, int paramInt4, long paramLong);
/*      */   public static void glColorPointer(int size, int type, int stride, long pointer_buffer_offset) {
/*  815 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  816 */     long function_pointer = caps.GL11_glColorPointer_pointer;
/*  817 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  818 */     GLChecks.ensureArrayVBOenabled(caps);
/*  819 */     nglColorPointerBO(size, type, stride, pointer_buffer_offset, function_pointer);
/*      */   }
/*      */   private static native void nglColorPointerBO(int paramInt1, int paramInt2, int paramInt3, long paramLong1, long paramLong2);
/*      */   
/*      */   public static void glColorMaterial(int face, int mode) {
/*  824 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  825 */     long function_pointer = caps.GL11_glColorMaterial_pointer;
/*  826 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  827 */     nglColorMaterial(face, mode, function_pointer);
/*      */   }
/*      */   private static native void nglColorMaterial(int paramInt1, int paramInt2, long paramLong);
/*      */   
/*      */   public static void glColorMask(boolean red, boolean green, boolean blue, boolean alpha) {
/*  832 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  833 */     long function_pointer = caps.GL11_glColorMask_pointer;
/*  834 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  835 */     nglColorMask(red, green, blue, alpha, function_pointer);
/*      */   }
/*      */   private static native void nglColorMask(boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, boolean paramBoolean4, long paramLong);
/*      */   
/*      */   public static void glColor3b(byte red, byte green, byte blue) {
/*  840 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  841 */     long function_pointer = caps.GL11_glColor3b_pointer;
/*  842 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  843 */     nglColor3b(red, green, blue, function_pointer);
/*      */   }
/*      */   private static native void nglColor3b(byte paramByte1, byte paramByte2, byte paramByte3, long paramLong);
/*      */   
/*      */   public static void glColor3f(float red, float green, float blue) {
/*  848 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  849 */     long function_pointer = caps.GL11_glColor3f_pointer;
/*  850 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  851 */     nglColor3f(red, green, blue, function_pointer);
/*      */   }
/*      */   private static native void nglColor3f(float paramFloat1, float paramFloat2, float paramFloat3, long paramLong);
/*      */   
/*      */   public static void glColor3d(double red, double green, double blue) {
/*  856 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  857 */     long function_pointer = caps.GL11_glColor3d_pointer;
/*  858 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  859 */     nglColor3d(red, green, blue, function_pointer);
/*      */   }
/*      */   private static native void nglColor3d(double paramDouble1, double paramDouble2, double paramDouble3, long paramLong);
/*      */   
/*      */   public static void glColor3ub(byte red, byte green, byte blue) {
/*  864 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  865 */     long function_pointer = caps.GL11_glColor3ub_pointer;
/*  866 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  867 */     nglColor3ub(red, green, blue, function_pointer);
/*      */   }
/*      */   private static native void nglColor3ub(byte paramByte1, byte paramByte2, byte paramByte3, long paramLong);
/*      */   
/*      */   public static void glColor4b(byte red, byte green, byte blue, byte alpha) {
/*  872 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  873 */     long function_pointer = caps.GL11_glColor4b_pointer;
/*  874 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  875 */     nglColor4b(red, green, blue, alpha, function_pointer);
/*      */   }
/*      */   private static native void nglColor4b(byte paramByte1, byte paramByte2, byte paramByte3, byte paramByte4, long paramLong);
/*      */   
/*      */   public static void glColor4f(float red, float green, float blue, float alpha) {
/*  880 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  881 */     long function_pointer = caps.GL11_glColor4f_pointer;
/*  882 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  883 */     nglColor4f(red, green, blue, alpha, function_pointer);
/*      */   }
/*      */   private static native void nglColor4f(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, long paramLong);
/*      */   
/*      */   public static void glColor4d(double red, double green, double blue, double alpha) {
/*  888 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  889 */     long function_pointer = caps.GL11_glColor4d_pointer;
/*  890 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  891 */     nglColor4d(red, green, blue, alpha, function_pointer);
/*      */   }
/*      */   private static native void nglColor4d(double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, long paramLong);
/*      */   
/*      */   public static void glColor4ub(byte red, byte green, byte blue, byte alpha) {
/*  896 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  897 */     long function_pointer = caps.GL11_glColor4ub_pointer;
/*  898 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  899 */     nglColor4ub(red, green, blue, alpha, function_pointer);
/*      */   }
/*      */   private static native void nglColor4ub(byte paramByte1, byte paramByte2, byte paramByte3, byte paramByte4, long paramLong);
/*      */   
/*      */   public static void glClipPlane(int plane, DoubleBuffer equation) {
/*  904 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  905 */     long function_pointer = caps.GL11_glClipPlane_pointer;
/*  906 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  907 */     BufferChecks.checkBuffer(equation, 4);
/*  908 */     nglClipPlane(plane, equation, equation.position(), function_pointer);
/*      */   }
/*      */   private static native void nglClipPlane(int paramInt1, DoubleBuffer paramDoubleBuffer, int paramInt2, long paramLong);
/*      */   
/*      */   public static void glClearStencil(int s) {
/*  913 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  914 */     long function_pointer = caps.GL11_glClearStencil_pointer;
/*  915 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  916 */     nglClearStencil(s, function_pointer);
/*      */   }
/*      */   private static native void nglClearStencil(int paramInt, long paramLong);
/*      */   
/*      */   public static void glEvalPoint1(int i) {
/*  921 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  922 */     long function_pointer = caps.GL11_glEvalPoint1_pointer;
/*  923 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  924 */     nglEvalPoint1(i, function_pointer);
/*      */   }
/*      */   private static native void nglEvalPoint1(int paramInt, long paramLong);
/*      */   
/*      */   public static void glEvalPoint2(int i, int j) {
/*  929 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  930 */     long function_pointer = caps.GL11_glEvalPoint2_pointer;
/*  931 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  932 */     nglEvalPoint2(i, j, function_pointer);
/*      */   }
/*      */   private static native void nglEvalPoint2(int paramInt1, int paramInt2, long paramLong);
/*      */   
/*      */   public static void glEvalMesh1(int mode, int i1, int i2) {
/*  937 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  938 */     long function_pointer = caps.GL11_glEvalMesh1_pointer;
/*  939 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  940 */     nglEvalMesh1(mode, i1, i2, function_pointer);
/*      */   }
/*      */   private static native void nglEvalMesh1(int paramInt1, int paramInt2, int paramInt3, long paramLong);
/*      */   
/*      */   public static void glEvalMesh2(int mode, int i1, int i2, int j1, int j2) {
/*  945 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  946 */     long function_pointer = caps.GL11_glEvalMesh2_pointer;
/*  947 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  948 */     nglEvalMesh2(mode, i1, i2, j1, j2, function_pointer);
/*      */   }
/*      */   private static native void nglEvalMesh2(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, long paramLong);
/*      */   
/*      */   public static void glEvalCoord1f(float u) {
/*  953 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  954 */     long function_pointer = caps.GL11_glEvalCoord1f_pointer;
/*  955 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  956 */     nglEvalCoord1f(u, function_pointer);
/*      */   }
/*      */   private static native void nglEvalCoord1f(float paramFloat, long paramLong);
/*      */   
/*      */   public static void glEvalCoord1d(double u) {
/*  961 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  962 */     long function_pointer = caps.GL11_glEvalCoord1d_pointer;
/*  963 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  964 */     nglEvalCoord1d(u, function_pointer);
/*      */   }
/*      */   private static native void nglEvalCoord1d(double paramDouble, long paramLong);
/*      */   
/*      */   public static void glEvalCoord2f(float u, float v) {
/*  969 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  970 */     long function_pointer = caps.GL11_glEvalCoord2f_pointer;
/*  971 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  972 */     nglEvalCoord2f(u, v, function_pointer);
/*      */   }
/*      */   private static native void nglEvalCoord2f(float paramFloat1, float paramFloat2, long paramLong);
/*      */   
/*      */   public static void glEvalCoord2d(double u, double v) {
/*  977 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  978 */     long function_pointer = caps.GL11_glEvalCoord2d_pointer;
/*  979 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  980 */     nglEvalCoord2d(u, v, function_pointer);
/*      */   }
/*      */   private static native void nglEvalCoord2d(double paramDouble1, double paramDouble2, long paramLong);
/*      */   
/*      */   public static void glEnableClientState(int cap) {
/*  985 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  986 */     long function_pointer = caps.GL11_glEnableClientState_pointer;
/*  987 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  988 */     nglEnableClientState(cap, function_pointer);
/*      */   }
/*      */   private static native void nglEnableClientState(int paramInt, long paramLong);
/*      */   
/*      */   public static void glDisableClientState(int cap) {
/*  993 */     ContextCapabilities caps = GLContext.getCapabilities();
/*  994 */     long function_pointer = caps.GL11_glDisableClientState_pointer;
/*  995 */     BufferChecks.checkFunctionAddress(function_pointer);
/*  996 */     nglDisableClientState(cap, function_pointer);
/*      */   }
/*      */   private static native void nglDisableClientState(int paramInt, long paramLong);
/*      */   
/*      */   public static void glEnable(int cap) {
/* 1001 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 1002 */     long function_pointer = caps.GL11_glEnable_pointer;
/* 1003 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 1004 */     nglEnable(cap, function_pointer);
/*      */   }
/*      */   private static native void nglEnable(int paramInt, long paramLong);
/*      */   
/*      */   public static void glDisable(int cap) {
/* 1009 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 1010 */     long function_pointer = caps.GL11_glDisable_pointer;
/* 1011 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 1012 */     nglDisable(cap, function_pointer);
/*      */   }
/*      */   private static native void nglDisable(int paramInt, long paramLong);
/*      */   
/*      */   public static void glEdgeFlagPointer(int stride, ByteBuffer pointer) {
/* 1017 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 1018 */     long function_pointer = caps.GL11_glEdgeFlagPointer_pointer;
/* 1019 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 1020 */     GLChecks.ensureArrayVBOdisabled(caps);
/* 1021 */     BufferChecks.checkDirect(pointer);
/* 1022 */     (GLChecks.getReferences(caps)).GL11_glEdgeFlagPointer_pointer = pointer;
/* 1023 */     nglEdgeFlagPointer(stride, pointer, pointer.position(), function_pointer);
/*      */   }
/*      */   private static native void nglEdgeFlagPointer(int paramInt1, Buffer paramBuffer, int paramInt2, long paramLong);
/*      */   public static void glEdgeFlagPointer(int stride, long pointer_buffer_offset) {
/* 1027 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 1028 */     long function_pointer = caps.GL11_glEdgeFlagPointer_pointer;
/* 1029 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 1030 */     GLChecks.ensureArrayVBOenabled(caps);
/* 1031 */     nglEdgeFlagPointerBO(stride, pointer_buffer_offset, function_pointer);
/*      */   }
/*      */   private static native void nglEdgeFlagPointerBO(int paramInt, long paramLong1, long paramLong2);
/*      */   
/*      */   public static void glEdgeFlag(boolean flag) {
/* 1036 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 1037 */     long function_pointer = caps.GL11_glEdgeFlag_pointer;
/* 1038 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 1039 */     nglEdgeFlag(flag, function_pointer);
/*      */   }
/*      */   private static native void nglEdgeFlag(boolean paramBoolean, long paramLong);
/*      */   
/*      */   public static void glDrawPixels(int width, int height, int format, int type, ByteBuffer pixels) {
/* 1044 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 1045 */     long function_pointer = caps.GL11_glDrawPixels_pointer;
/* 1046 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 1047 */     GLChecks.ensureUnpackPBOdisabled(caps);
/* 1048 */     BufferChecks.checkBuffer(pixels, GLChecks.calculateImageStorage(pixels, format, type, width, height, 1));
/* 1049 */     nglDrawPixels(width, height, format, type, pixels, pixels.position(), function_pointer);
/*      */   }
/*      */   public static void glDrawPixels(int width, int height, int format, int type, IntBuffer pixels) {
/* 1052 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 1053 */     long function_pointer = caps.GL11_glDrawPixels_pointer;
/* 1054 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 1055 */     GLChecks.ensureUnpackPBOdisabled(caps);
/* 1056 */     BufferChecks.checkBuffer(pixels, GLChecks.calculateImageStorage(pixels, format, type, width, height, 1));
/* 1057 */     nglDrawPixels(width, height, format, type, pixels, pixels.position() << 2, function_pointer);
/*      */   }
/*      */   public static void glDrawPixels(int width, int height, int format, int type, ShortBuffer pixels) {
/* 1060 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 1061 */     long function_pointer = caps.GL11_glDrawPixels_pointer;
/* 1062 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 1063 */     GLChecks.ensureUnpackPBOdisabled(caps);
/* 1064 */     BufferChecks.checkBuffer(pixels, GLChecks.calculateImageStorage(pixels, format, type, width, height, 1));
/* 1065 */     nglDrawPixels(width, height, format, type, pixels, pixels.position() << 1, function_pointer);
/*      */   }
/*      */   private static native void nglDrawPixels(int paramInt1, int paramInt2, int paramInt3, int paramInt4, Buffer paramBuffer, int paramInt5, long paramLong);
/*      */   public static void glDrawPixels(int width, int height, int format, int type, long pixels_buffer_offset) {
/* 1069 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 1070 */     long function_pointer = caps.GL11_glDrawPixels_pointer;
/* 1071 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 1072 */     GLChecks.ensureUnpackPBOenabled(caps);
/* 1073 */     nglDrawPixelsBO(width, height, format, type, pixels_buffer_offset, function_pointer);
/*      */   }
/*      */   private static native void nglDrawPixelsBO(int paramInt1, int paramInt2, int paramInt3, int paramInt4, long paramLong1, long paramLong2);
/*      */   
/*      */   public static void glDrawElements(int mode, ByteBuffer indices) {
/* 1078 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 1079 */     long function_pointer = caps.GL11_glDrawElements_pointer;
/* 1080 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 1081 */     GLChecks.ensureElementVBOdisabled(caps);
/* 1082 */     BufferChecks.checkDirect(indices);
/* 1083 */     nglDrawElements(mode, indices.remaining(), 5121, indices, indices.position(), function_pointer);
/*      */   }
/*      */   public static void glDrawElements(int mode, IntBuffer indices) {
/* 1086 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 1087 */     long function_pointer = caps.GL11_glDrawElements_pointer;
/* 1088 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 1089 */     GLChecks.ensureElementVBOdisabled(caps);
/* 1090 */     BufferChecks.checkDirect(indices);
/* 1091 */     nglDrawElements(mode, indices.remaining(), 5125, indices, indices.position() << 2, function_pointer);
/*      */   }
/*      */   public static void glDrawElements(int mode, ShortBuffer indices) {
/* 1094 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 1095 */     long function_pointer = caps.GL11_glDrawElements_pointer;
/* 1096 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 1097 */     GLChecks.ensureElementVBOdisabled(caps);
/* 1098 */     BufferChecks.checkDirect(indices);
/* 1099 */     nglDrawElements(mode, indices.remaining(), 5123, indices, indices.position() << 1, function_pointer);
/*      */   }
/*      */   private static native void nglDrawElements(int paramInt1, int paramInt2, int paramInt3, Buffer paramBuffer, int paramInt4, long paramLong);
/*      */   public static void glDrawElements(int mode, int count, int type, long indices_buffer_offset) {
/* 1103 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 1104 */     long function_pointer = caps.GL11_glDrawElements_pointer;
/* 1105 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 1106 */     GLChecks.ensureElementVBOenabled(caps);
/* 1107 */     nglDrawElementsBO(mode, count, type, indices_buffer_offset, function_pointer);
/*      */   }
/*      */   private static native void nglDrawElementsBO(int paramInt1, int paramInt2, int paramInt3, long paramLong1, long paramLong2);
/*      */   
/*      */   public static void glDrawBuffer(int mode) {
/* 1112 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 1113 */     long function_pointer = caps.GL11_glDrawBuffer_pointer;
/* 1114 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 1115 */     nglDrawBuffer(mode, function_pointer);
/*      */   }
/*      */   private static native void nglDrawBuffer(int paramInt, long paramLong);
/*      */   
/*      */   public static void glDrawArrays(int mode, int first, int count) {
/* 1120 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 1121 */     long function_pointer = caps.GL11_glDrawArrays_pointer;
/* 1122 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 1123 */     nglDrawArrays(mode, first, count, function_pointer);
/*      */   }
/*      */   private static native void nglDrawArrays(int paramInt1, int paramInt2, int paramInt3, long paramLong);
/*      */   
/*      */   public static void glDepthRange(double zNear, double zFar) {
/* 1128 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 1129 */     long function_pointer = caps.GL11_glDepthRange_pointer;
/* 1130 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 1131 */     nglDepthRange(zNear, zFar, function_pointer);
/*      */   }
/*      */   private static native void nglDepthRange(double paramDouble1, double paramDouble2, long paramLong);
/*      */   
/*      */   public static void glDepthMask(boolean flag) {
/* 1136 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 1137 */     long function_pointer = caps.GL11_glDepthMask_pointer;
/* 1138 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 1139 */     nglDepthMask(flag, function_pointer);
/*      */   }
/*      */   private static native void nglDepthMask(boolean paramBoolean, long paramLong);
/*      */   
/*      */   public static void glDepthFunc(int func) {
/* 1144 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 1145 */     long function_pointer = caps.GL11_glDepthFunc_pointer;
/* 1146 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 1147 */     nglDepthFunc(func, function_pointer);
/*      */   }
/*      */   private static native void nglDepthFunc(int paramInt, long paramLong);
/*      */   
/*      */   public static void glFeedbackBuffer(int type, FloatBuffer buffer) {
/* 1152 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 1153 */     long function_pointer = caps.GL11_glFeedbackBuffer_pointer;
/* 1154 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 1155 */     BufferChecks.checkDirect(buffer);
/* 1156 */     nglFeedbackBuffer(buffer.remaining(), type, buffer, buffer.position(), function_pointer);
/*      */   }
/*      */   private static native void nglFeedbackBuffer(int paramInt1, int paramInt2, FloatBuffer paramFloatBuffer, int paramInt3, long paramLong);
/*      */   
/*      */   public static void glGetPixelMap(int map, FloatBuffer values) {
/* 1161 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 1162 */     long function_pointer = caps.GL11_glGetPixelMapfv_pointer;
/* 1163 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 1164 */     GLChecks.ensurePackPBOdisabled(caps);
/* 1165 */     BufferChecks.checkBuffer(values, 256);
/* 1166 */     nglGetPixelMapfv(map, values, values.position(), function_pointer);
/*      */   }
/*      */   private static native void nglGetPixelMapfv(int paramInt1, FloatBuffer paramFloatBuffer, int paramInt2, long paramLong);
/*      */   public static void glGetPixelMapfv(int map, long values_buffer_offset) {
/* 1170 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 1171 */     long function_pointer = caps.GL11_glGetPixelMapfv_pointer;
/* 1172 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 1173 */     GLChecks.ensurePackPBOenabled(caps);
/* 1174 */     nglGetPixelMapfvBO(map, values_buffer_offset, function_pointer);
/*      */   }
/*      */   private static native void nglGetPixelMapfvBO(int paramInt, long paramLong1, long paramLong2);
/*      */   
/*      */   public static void glGetPixelMapu(int map, IntBuffer values) {
/* 1179 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 1180 */     long function_pointer = caps.GL11_glGetPixelMapuiv_pointer;
/* 1181 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 1182 */     GLChecks.ensurePackPBOdisabled(caps);
/* 1183 */     BufferChecks.checkBuffer(values, 256);
/* 1184 */     nglGetPixelMapuiv(map, values, values.position(), function_pointer);
/*      */   }
/*      */   private static native void nglGetPixelMapuiv(int paramInt1, IntBuffer paramIntBuffer, int paramInt2, long paramLong);
/*      */   public static void glGetPixelMapuiv(int map, long values_buffer_offset) {
/* 1188 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 1189 */     long function_pointer = caps.GL11_glGetPixelMapuiv_pointer;
/* 1190 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 1191 */     GLChecks.ensurePackPBOenabled(caps);
/* 1192 */     nglGetPixelMapuivBO(map, values_buffer_offset, function_pointer);
/*      */   }
/*      */   private static native void nglGetPixelMapuivBO(int paramInt, long paramLong1, long paramLong2);
/*      */   
/*      */   public static void glGetPixelMapu(int map, ShortBuffer values) {
/* 1197 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 1198 */     long function_pointer = caps.GL11_glGetPixelMapusv_pointer;
/* 1199 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 1200 */     GLChecks.ensurePackPBOdisabled(caps);
/* 1201 */     BufferChecks.checkBuffer(values, 256);
/* 1202 */     nglGetPixelMapusv(map, values, values.position(), function_pointer);
/*      */   }
/*      */   private static native void nglGetPixelMapusv(int paramInt1, ShortBuffer paramShortBuffer, int paramInt2, long paramLong);
/*      */   public static void glGetPixelMapusv(int map, long values_buffer_offset) {
/* 1206 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 1207 */     long function_pointer = caps.GL11_glGetPixelMapusv_pointer;
/* 1208 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 1209 */     GLChecks.ensurePackPBOenabled(caps);
/* 1210 */     nglGetPixelMapusvBO(map, values_buffer_offset, function_pointer);
/*      */   }
/*      */   private static native void nglGetPixelMapusvBO(int paramInt, long paramLong1, long paramLong2);
/*      */   
/*      */   public static void glGetMaterial(int face, int pname, FloatBuffer params) {
/* 1215 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 1216 */     long function_pointer = caps.GL11_glGetMaterialfv_pointer;
/* 1217 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 1218 */     BufferChecks.checkBuffer(params, 4);
/* 1219 */     nglGetMaterialfv(face, pname, params, params.position(), function_pointer);
/*      */   }
/*      */   private static native void nglGetMaterialfv(int paramInt1, int paramInt2, FloatBuffer paramFloatBuffer, int paramInt3, long paramLong);
/*      */   
/*      */   public static void glGetMaterial(int face, int pname, IntBuffer params) {
/* 1224 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 1225 */     long function_pointer = caps.GL11_glGetMaterialiv_pointer;
/* 1226 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 1227 */     BufferChecks.checkBuffer(params, 4);
/* 1228 */     nglGetMaterialiv(face, pname, params, params.position(), function_pointer);
/*      */   }
/*      */   private static native void nglGetMaterialiv(int paramInt1, int paramInt2, IntBuffer paramIntBuffer, int paramInt3, long paramLong);
/*      */   
/*      */   public static void glGetMap(int target, int query, FloatBuffer v) {
/* 1233 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 1234 */     long function_pointer = caps.GL11_glGetMapfv_pointer;
/* 1235 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 1236 */     BufferChecks.checkBuffer(v, 256);
/* 1237 */     nglGetMapfv(target, query, v, v.position(), function_pointer);
/*      */   }
/*      */   private static native void nglGetMapfv(int paramInt1, int paramInt2, FloatBuffer paramFloatBuffer, int paramInt3, long paramLong);
/*      */   
/*      */   public static void glGetMap(int target, int query, DoubleBuffer v) {
/* 1242 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 1243 */     long function_pointer = caps.GL11_glGetMapdv_pointer;
/* 1244 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 1245 */     BufferChecks.checkBuffer(v, 256);
/* 1246 */     nglGetMapdv(target, query, v, v.position(), function_pointer);
/*      */   }
/*      */   private static native void nglGetMapdv(int paramInt1, int paramInt2, DoubleBuffer paramDoubleBuffer, int paramInt3, long paramLong);
/*      */   
/*      */   public static void glGetMap(int target, int query, IntBuffer v) {
/* 1251 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 1252 */     long function_pointer = caps.GL11_glGetMapiv_pointer;
/* 1253 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 1254 */     BufferChecks.checkBuffer(v, 256);
/* 1255 */     nglGetMapiv(target, query, v, v.position(), function_pointer);
/*      */   }
/*      */   private static native void nglGetMapiv(int paramInt1, int paramInt2, IntBuffer paramIntBuffer, int paramInt3, long paramLong);
/*      */   
/*      */   public static void glGetLight(int light, int pname, FloatBuffer params) {
/* 1260 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 1261 */     long function_pointer = caps.GL11_glGetLightfv_pointer;
/* 1262 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 1263 */     BufferChecks.checkBuffer(params, 4);
/* 1264 */     nglGetLightfv(light, pname, params, params.position(), function_pointer);
/*      */   }
/*      */   private static native void nglGetLightfv(int paramInt1, int paramInt2, FloatBuffer paramFloatBuffer, int paramInt3, long paramLong);
/*      */   
/*      */   public static void glGetLight(int light, int pname, IntBuffer params) {
/* 1269 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 1270 */     long function_pointer = caps.GL11_glGetLightiv_pointer;
/* 1271 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 1272 */     BufferChecks.checkBuffer(params, 4);
/* 1273 */     nglGetLightiv(light, pname, params, params.position(), function_pointer);
/*      */   }
/*      */   private static native void nglGetLightiv(int paramInt1, int paramInt2, IntBuffer paramIntBuffer, int paramInt3, long paramLong);
/*      */   
/*      */   public static int glGetError() {
/* 1278 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 1279 */     long function_pointer = caps.GL11_glGetError_pointer;
/* 1280 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 1281 */     int __result = nglGetError(function_pointer);
/* 1282 */     return __result;
/*      */   }
/*      */   private static native int nglGetError(long paramLong);
/*      */   
/*      */   public static void glGetClipPlane(int plane, DoubleBuffer equation) {
/* 1287 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 1288 */     long function_pointer = caps.GL11_glGetClipPlane_pointer;
/* 1289 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 1290 */     BufferChecks.checkBuffer(equation, 4);
/* 1291 */     nglGetClipPlane(plane, equation, equation.position(), function_pointer);
/*      */   }
/*      */   private static native void nglGetClipPlane(int paramInt1, DoubleBuffer paramDoubleBuffer, int paramInt2, long paramLong);
/*      */   
/*      */   public static void glGetBoolean(int pname, ByteBuffer params) {
/* 1296 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 1297 */     long function_pointer = caps.GL11_glGetBooleanv_pointer;
/* 1298 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 1299 */     BufferChecks.checkBuffer(params, 16);
/* 1300 */     nglGetBooleanv(pname, params, params.position(), function_pointer);
/*      */   }
/*      */   
/*      */   private static native void nglGetBooleanv(int paramInt1, ByteBuffer paramByteBuffer, int paramInt2, long paramLong);
/*      */   
/*      */   public static boolean glGetBoolean(int pname) {
/* 1306 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 1307 */     long function_pointer = caps.GL11_glGetBooleanv_pointer;
/* 1308 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 1309 */     ByteBuffer params = APIUtils.getBufferByte(1);
/* 1310 */     nglGetBooleanv(pname, params, params.position(), function_pointer);
/* 1311 */     return (params.get(0) == 1);
/*      */   }
/*      */   
/*      */   public static void glGetDouble(int pname, DoubleBuffer params) {
/* 1315 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 1316 */     long function_pointer = caps.GL11_glGetDoublev_pointer;
/* 1317 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 1318 */     BufferChecks.checkBuffer(params, 16);
/* 1319 */     nglGetDoublev(pname, params, params.position(), function_pointer);
/*      */   }
/*      */   
/*      */   private static native void nglGetDoublev(int paramInt1, DoubleBuffer paramDoubleBuffer, int paramInt2, long paramLong);
/*      */   
/*      */   public static double glGetDouble(int pname) {
/* 1325 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 1326 */     long function_pointer = caps.GL11_glGetDoublev_pointer;
/* 1327 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 1328 */     DoubleBuffer params = APIUtils.getBufferDouble();
/* 1329 */     nglGetDoublev(pname, params, params.position(), function_pointer);
/* 1330 */     return params.get(0);
/*      */   }
/*      */   
/*      */   public static void glGetFloat(int pname, FloatBuffer params) {
/* 1334 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 1335 */     long function_pointer = caps.GL11_glGetFloatv_pointer;
/* 1336 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 1337 */     BufferChecks.checkBuffer(params, 16);
/* 1338 */     nglGetFloatv(pname, params, params.position(), function_pointer);
/*      */   }
/*      */   
/*      */   private static native void nglGetFloatv(int paramInt1, FloatBuffer paramFloatBuffer, int paramInt2, long paramLong);
/*      */   
/*      */   public static float glGetFloat(int pname) {
/* 1344 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 1345 */     long function_pointer = caps.GL11_glGetFloatv_pointer;
/* 1346 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 1347 */     FloatBuffer params = APIUtils.getBufferFloat();
/* 1348 */     nglGetFloatv(pname, params, params.position(), function_pointer);
/* 1349 */     return params.get(0);
/*      */   }
/*      */   
/*      */   public static void glGetInteger(int pname, IntBuffer params) {
/* 1353 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 1354 */     long function_pointer = caps.GL11_glGetIntegerv_pointer;
/* 1355 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 1356 */     BufferChecks.checkBuffer(params, 16);
/* 1357 */     nglGetIntegerv(pname, params, params.position(), function_pointer);
/*      */   }
/*      */   
/*      */   private static native void nglGetIntegerv(int paramInt1, IntBuffer paramIntBuffer, int paramInt2, long paramLong);
/*      */   
/*      */   public static int glGetInteger(int pname) {
/* 1363 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 1364 */     long function_pointer = caps.GL11_glGetIntegerv_pointer;
/* 1365 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 1366 */     IntBuffer params = APIUtils.getBufferInt();
/* 1367 */     nglGetIntegerv(pname, params, params.position(), function_pointer);
/* 1368 */     return params.get(0);
/*      */   }
/*      */   
/*      */   public static void glGenTextures(IntBuffer textures) {
/* 1372 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 1373 */     long function_pointer = caps.GL11_glGenTextures_pointer;
/* 1374 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 1375 */     BufferChecks.checkDirect(textures);
/* 1376 */     nglGenTextures(textures.remaining(), textures, textures.position(), function_pointer);
/*      */   }
/*      */   
/*      */   private static native void nglGenTextures(int paramInt1, IntBuffer paramIntBuffer, int paramInt2, long paramLong);
/*      */   
/*      */   public static int glGenTextures() {
/* 1382 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 1383 */     long function_pointer = caps.GL11_glGenTextures_pointer;
/* 1384 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 1385 */     IntBuffer textures = APIUtils.getBufferInt();
/* 1386 */     nglGenTextures(1, textures, textures.position(), function_pointer);
/* 1387 */     return textures.get(0);
/*      */   }
/*      */   
/*      */   public static int glGenLists(int range) {
/* 1391 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 1392 */     long function_pointer = caps.GL11_glGenLists_pointer;
/* 1393 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 1394 */     int __result = nglGenLists(range, function_pointer);
/* 1395 */     return __result;
/*      */   }
/*      */   private static native int nglGenLists(int paramInt, long paramLong);
/*      */   
/*      */   public static void glFrustum(double left, double right, double bottom, double top, double zNear, double zFar) {
/* 1400 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 1401 */     long function_pointer = caps.GL11_glFrustum_pointer;
/* 1402 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 1403 */     nglFrustum(left, right, bottom, top, zNear, zFar, function_pointer);
/*      */   }
/*      */   private static native void nglFrustum(double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, double paramDouble5, double paramDouble6, long paramLong);
/*      */   
/*      */   public static void glFrontFace(int mode) {
/* 1408 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 1409 */     long function_pointer = caps.GL11_glFrontFace_pointer;
/* 1410 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 1411 */     nglFrontFace(mode, function_pointer);
/*      */   }
/*      */   private static native void nglFrontFace(int paramInt, long paramLong);
/*      */   
/*      */   public static void glFogf(int pname, float param) {
/* 1416 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 1417 */     long function_pointer = caps.GL11_glFogf_pointer;
/* 1418 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 1419 */     nglFogf(pname, param, function_pointer);
/*      */   }
/*      */   private static native void nglFogf(int paramInt, float paramFloat, long paramLong);
/*      */   
/*      */   public static void glFogi(int pname, int param) {
/* 1424 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 1425 */     long function_pointer = caps.GL11_glFogi_pointer;
/* 1426 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 1427 */     nglFogi(pname, param, function_pointer);
/*      */   }
/*      */   private static native void nglFogi(int paramInt1, int paramInt2, long paramLong);
/*      */   
/*      */   public static void glFog(int pname, FloatBuffer params) {
/* 1432 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 1433 */     long function_pointer = caps.GL11_glFogfv_pointer;
/* 1434 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 1435 */     BufferChecks.checkBuffer(params, 4);
/* 1436 */     nglFogfv(pname, params, params.position(), function_pointer);
/*      */   }
/*      */   private static native void nglFogfv(int paramInt1, FloatBuffer paramFloatBuffer, int paramInt2, long paramLong);
/*      */   
/*      */   public static void glFog(int pname, IntBuffer params) {
/* 1441 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 1442 */     long function_pointer = caps.GL11_glFogiv_pointer;
/* 1443 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 1444 */     BufferChecks.checkBuffer(params, 4);
/* 1445 */     nglFogiv(pname, params, params.position(), function_pointer);
/*      */   }
/*      */   private static native void nglFogiv(int paramInt1, IntBuffer paramIntBuffer, int paramInt2, long paramLong);
/*      */   
/*      */   public static void glFlush() {
/* 1450 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 1451 */     long function_pointer = caps.GL11_glFlush_pointer;
/* 1452 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 1453 */     nglFlush(function_pointer);
/*      */   }
/*      */   private static native void nglFlush(long paramLong);
/*      */   
/*      */   public static void glFinish() {
/* 1458 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 1459 */     long function_pointer = caps.GL11_glFinish_pointer;
/* 1460 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 1461 */     nglFinish(function_pointer);
/*      */   }
/*      */   private static native void nglFinish(long paramLong);
/*      */   
/*      */   public static ByteBuffer glGetPointer(int pname, long result_size) {
/* 1466 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 1467 */     long function_pointer = caps.GL11_glGetPointerv_pointer;
/* 1468 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 1469 */     ByteBuffer __result = nglGetPointerv(pname, result_size, function_pointer);
/* 1470 */     return __result;
/*      */   }
/*      */   private static native ByteBuffer nglGetPointerv(int paramInt, long paramLong1, long paramLong2);
/*      */   
/*      */   public static boolean glIsEnabled(int cap) {
/* 1475 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 1476 */     long function_pointer = caps.GL11_glIsEnabled_pointer;
/* 1477 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 1478 */     boolean __result = nglIsEnabled(cap, function_pointer);
/* 1479 */     return __result;
/*      */   }
/*      */   private static native boolean nglIsEnabled(int paramInt, long paramLong);
/*      */   
/*      */   public static void glInterleavedArrays(int format, int stride, ByteBuffer pointer) {
/* 1484 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 1485 */     long function_pointer = caps.GL11_glInterleavedArrays_pointer;
/* 1486 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 1487 */     GLChecks.ensureArrayVBOdisabled(caps);
/* 1488 */     BufferChecks.checkDirect(pointer);
/* 1489 */     nglInterleavedArrays(format, stride, pointer, pointer.position(), function_pointer);
/*      */   }
/*      */   public static void glInterleavedArrays(int format, int stride, DoubleBuffer pointer) {
/* 1492 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 1493 */     long function_pointer = caps.GL11_glInterleavedArrays_pointer;
/* 1494 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 1495 */     GLChecks.ensureArrayVBOdisabled(caps);
/* 1496 */     BufferChecks.checkDirect(pointer);
/* 1497 */     nglInterleavedArrays(format, stride, pointer, pointer.position() << 3, function_pointer);
/*      */   }
/*      */   public static void glInterleavedArrays(int format, int stride, FloatBuffer pointer) {
/* 1500 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 1501 */     long function_pointer = caps.GL11_glInterleavedArrays_pointer;
/* 1502 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 1503 */     GLChecks.ensureArrayVBOdisabled(caps);
/* 1504 */     BufferChecks.checkDirect(pointer);
/* 1505 */     nglInterleavedArrays(format, stride, pointer, pointer.position() << 2, function_pointer);
/*      */   }
/*      */   public static void glInterleavedArrays(int format, int stride, IntBuffer pointer) {
/* 1508 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 1509 */     long function_pointer = caps.GL11_glInterleavedArrays_pointer;
/* 1510 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 1511 */     GLChecks.ensureArrayVBOdisabled(caps);
/* 1512 */     BufferChecks.checkDirect(pointer);
/* 1513 */     nglInterleavedArrays(format, stride, pointer, pointer.position() << 2, function_pointer);
/*      */   }
/*      */   public static void glInterleavedArrays(int format, int stride, ShortBuffer pointer) {
/* 1516 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 1517 */     long function_pointer = caps.GL11_glInterleavedArrays_pointer;
/* 1518 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 1519 */     GLChecks.ensureArrayVBOdisabled(caps);
/* 1520 */     BufferChecks.checkDirect(pointer);
/* 1521 */     nglInterleavedArrays(format, stride, pointer, pointer.position() << 1, function_pointer);
/*      */   }
/*      */   private static native void nglInterleavedArrays(int paramInt1, int paramInt2, Buffer paramBuffer, int paramInt3, long paramLong);
/*      */   public static void glInterleavedArrays(int format, int stride, long pointer_buffer_offset) {
/* 1525 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 1526 */     long function_pointer = caps.GL11_glInterleavedArrays_pointer;
/* 1527 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 1528 */     GLChecks.ensureArrayVBOenabled(caps);
/* 1529 */     nglInterleavedArraysBO(format, stride, pointer_buffer_offset, function_pointer);
/*      */   }
/*      */   private static native void nglInterleavedArraysBO(int paramInt1, int paramInt2, long paramLong1, long paramLong2);
/*      */   
/*      */   public static void glInitNames() {
/* 1534 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 1535 */     long function_pointer = caps.GL11_glInitNames_pointer;
/* 1536 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 1537 */     nglInitNames(function_pointer);
/*      */   }
/*      */   private static native void nglInitNames(long paramLong);
/*      */   
/*      */   public static void glHint(int target, int mode) {
/* 1542 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 1543 */     long function_pointer = caps.GL11_glHint_pointer;
/* 1544 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 1545 */     nglHint(target, mode, function_pointer);
/*      */   }
/*      */   private static native void nglHint(int paramInt1, int paramInt2, long paramLong);
/*      */   
/*      */   public static void glGetTexParameter(int target, int pname, FloatBuffer params) {
/* 1550 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 1551 */     long function_pointer = caps.GL11_glGetTexParameterfv_pointer;
/* 1552 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 1553 */     BufferChecks.checkBuffer(params, 4);
/* 1554 */     nglGetTexParameterfv(target, pname, params, params.position(), function_pointer);
/*      */   }
/*      */   
/*      */   private static native void nglGetTexParameterfv(int paramInt1, int paramInt2, FloatBuffer paramFloatBuffer, int paramInt3, long paramLong);
/*      */   
/*      */   public static float glGetTexParameterf(int target, int pname) {
/* 1560 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 1561 */     long function_pointer = caps.GL11_glGetTexParameterfv_pointer;
/* 1562 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 1563 */     FloatBuffer params = APIUtils.getBufferFloat();
/* 1564 */     nglGetTexParameterfv(target, pname, params, params.position(), function_pointer);
/* 1565 */     return params.get(0);
/*      */   }
/*      */   
/*      */   public static void glGetTexParameter(int target, int pname, IntBuffer params) {
/* 1569 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 1570 */     long function_pointer = caps.GL11_glGetTexParameteriv_pointer;
/* 1571 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 1572 */     BufferChecks.checkBuffer(params, 4);
/* 1573 */     nglGetTexParameteriv(target, pname, params, params.position(), function_pointer);
/*      */   }
/*      */   
/*      */   private static native void nglGetTexParameteriv(int paramInt1, int paramInt2, IntBuffer paramIntBuffer, int paramInt3, long paramLong);
/*      */   
/*      */   public static int glGetTexParameteri(int target, int pname) {
/* 1579 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 1580 */     long function_pointer = caps.GL11_glGetTexParameteriv_pointer;
/* 1581 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 1582 */     IntBuffer params = APIUtils.getBufferInt();
/* 1583 */     nglGetTexParameteriv(target, pname, params, params.position(), function_pointer);
/* 1584 */     return params.get(0);
/*      */   }
/*      */   
/*      */   public static void glGetTexLevelParameter(int target, int level, int pname, FloatBuffer params) {
/* 1588 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 1589 */     long function_pointer = caps.GL11_glGetTexLevelParameterfv_pointer;
/* 1590 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 1591 */     BufferChecks.checkBuffer(params, 4);
/* 1592 */     nglGetTexLevelParameterfv(target, level, pname, params, params.position(), function_pointer);
/*      */   }
/*      */   
/*      */   private static native void nglGetTexLevelParameterfv(int paramInt1, int paramInt2, int paramInt3, FloatBuffer paramFloatBuffer, int paramInt4, long paramLong);
/*      */   
/*      */   public static float glGetTexLevelParameterf(int target, int level, int pname) {
/* 1598 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 1599 */     long function_pointer = caps.GL11_glGetTexLevelParameterfv_pointer;
/* 1600 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 1601 */     FloatBuffer params = APIUtils.getBufferFloat();
/* 1602 */     nglGetTexLevelParameterfv(target, level, pname, params, params.position(), function_pointer);
/* 1603 */     return params.get(0);
/*      */   }
/*      */   
/*      */   public static void glGetTexLevelParameter(int target, int level, int pname, IntBuffer params) {
/* 1607 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 1608 */     long function_pointer = caps.GL11_glGetTexLevelParameteriv_pointer;
/* 1609 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 1610 */     BufferChecks.checkBuffer(params, 4);
/* 1611 */     nglGetTexLevelParameteriv(target, level, pname, params, params.position(), function_pointer);
/*      */   }
/*      */   
/*      */   private static native void nglGetTexLevelParameteriv(int paramInt1, int paramInt2, int paramInt3, IntBuffer paramIntBuffer, int paramInt4, long paramLong);
/*      */   
/*      */   public static int glGetTexLevelParameteri(int target, int level, int pname) {
/* 1617 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 1618 */     long function_pointer = caps.GL11_glGetTexLevelParameteriv_pointer;
/* 1619 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 1620 */     IntBuffer params = APIUtils.getBufferInt();
/* 1621 */     nglGetTexLevelParameteriv(target, level, pname, params, params.position(), function_pointer);
/* 1622 */     return params.get(0);
/*      */   }
/*      */   
/*      */   public static void glGetTexImage(int target, int level, int format, int type, ByteBuffer pixels) {
/* 1626 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 1627 */     long function_pointer = caps.GL11_glGetTexImage_pointer;
/* 1628 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 1629 */     GLChecks.ensurePackPBOdisabled(caps);
/* 1630 */     BufferChecks.checkBuffer(pixels, GLChecks.calculateImageStorage(pixels, format, type, 1, 1, 1));
/* 1631 */     nglGetTexImage(target, level, format, type, pixels, pixels.position(), function_pointer);
/*      */   }
/*      */   public static void glGetTexImage(int target, int level, int format, int type, DoubleBuffer pixels) {
/* 1634 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 1635 */     long function_pointer = caps.GL11_glGetTexImage_pointer;
/* 1636 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 1637 */     GLChecks.ensurePackPBOdisabled(caps);
/* 1638 */     BufferChecks.checkBuffer(pixels, GLChecks.calculateImageStorage(pixels, format, type, 1, 1, 1));
/* 1639 */     nglGetTexImage(target, level, format, type, pixels, pixels.position() << 3, function_pointer);
/*      */   }
/*      */   public static void glGetTexImage(int target, int level, int format, int type, FloatBuffer pixels) {
/* 1642 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 1643 */     long function_pointer = caps.GL11_glGetTexImage_pointer;
/* 1644 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 1645 */     GLChecks.ensurePackPBOdisabled(caps);
/* 1646 */     BufferChecks.checkBuffer(pixels, GLChecks.calculateImageStorage(pixels, format, type, 1, 1, 1));
/* 1647 */     nglGetTexImage(target, level, format, type, pixels, pixels.position() << 2, function_pointer);
/*      */   }
/*      */   public static void glGetTexImage(int target, int level, int format, int type, IntBuffer pixels) {
/* 1650 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 1651 */     long function_pointer = caps.GL11_glGetTexImage_pointer;
/* 1652 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 1653 */     GLChecks.ensurePackPBOdisabled(caps);
/* 1654 */     BufferChecks.checkBuffer(pixels, GLChecks.calculateImageStorage(pixels, format, type, 1, 1, 1));
/* 1655 */     nglGetTexImage(target, level, format, type, pixels, pixels.position() << 2, function_pointer);
/*      */   }
/*      */   public static void glGetTexImage(int target, int level, int format, int type, ShortBuffer pixels) {
/* 1658 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 1659 */     long function_pointer = caps.GL11_glGetTexImage_pointer;
/* 1660 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 1661 */     GLChecks.ensurePackPBOdisabled(caps);
/* 1662 */     BufferChecks.checkBuffer(pixels, GLChecks.calculateImageStorage(pixels, format, type, 1, 1, 1));
/* 1663 */     nglGetTexImage(target, level, format, type, pixels, pixels.position() << 1, function_pointer);
/*      */   }
/*      */   private static native void nglGetTexImage(int paramInt1, int paramInt2, int paramInt3, int paramInt4, Buffer paramBuffer, int paramInt5, long paramLong);
/*      */   public static void glGetTexImage(int target, int level, int format, int type, long pixels_buffer_offset) {
/* 1667 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 1668 */     long function_pointer = caps.GL11_glGetTexImage_pointer;
/* 1669 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 1670 */     GLChecks.ensurePackPBOenabled(caps);
/* 1671 */     nglGetTexImageBO(target, level, format, type, pixels_buffer_offset, function_pointer);
/*      */   }
/*      */   private static native void nglGetTexImageBO(int paramInt1, int paramInt2, int paramInt3, int paramInt4, long paramLong1, long paramLong2);
/*      */   
/*      */   public static void glGetTexGen(int coord, int pname, IntBuffer params) {
/* 1676 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 1677 */     long function_pointer = caps.GL11_glGetTexGeniv_pointer;
/* 1678 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 1679 */     BufferChecks.checkBuffer(params, 4);
/* 1680 */     nglGetTexGeniv(coord, pname, params, params.position(), function_pointer);
/*      */   }
/*      */   
/*      */   private static native void nglGetTexGeniv(int paramInt1, int paramInt2, IntBuffer paramIntBuffer, int paramInt3, long paramLong);
/*      */   
/*      */   public static int glGetTexGeni(int coord, int pname) {
/* 1686 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 1687 */     long function_pointer = caps.GL11_glGetTexGeniv_pointer;
/* 1688 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 1689 */     IntBuffer params = APIUtils.getBufferInt();
/* 1690 */     nglGetTexGeniv(coord, pname, params, params.position(), function_pointer);
/* 1691 */     return params.get(0);
/*      */   }
/*      */   
/*      */   public static void glGetTexGen(int coord, int pname, FloatBuffer params) {
/* 1695 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 1696 */     long function_pointer = caps.GL11_glGetTexGenfv_pointer;
/* 1697 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 1698 */     BufferChecks.checkBuffer(params, 4);
/* 1699 */     nglGetTexGenfv(coord, pname, params, params.position(), function_pointer);
/*      */   }
/*      */   
/*      */   private static native void nglGetTexGenfv(int paramInt1, int paramInt2, FloatBuffer paramFloatBuffer, int paramInt3, long paramLong);
/*      */   
/*      */   public static float glGetTexGenf(int coord, int pname) {
/* 1705 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 1706 */     long function_pointer = caps.GL11_glGetTexGenfv_pointer;
/* 1707 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 1708 */     FloatBuffer params = APIUtils.getBufferFloat();
/* 1709 */     nglGetTexGenfv(coord, pname, params, params.position(), function_pointer);
/* 1710 */     return params.get(0);
/*      */   }
/*      */   
/*      */   public static void glGetTexGen(int coord, int pname, DoubleBuffer params) {
/* 1714 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 1715 */     long function_pointer = caps.GL11_glGetTexGendv_pointer;
/* 1716 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 1717 */     BufferChecks.checkBuffer(params, 4);
/* 1718 */     nglGetTexGendv(coord, pname, params, params.position(), function_pointer);
/*      */   }
/*      */   
/*      */   private static native void nglGetTexGendv(int paramInt1, int paramInt2, DoubleBuffer paramDoubleBuffer, int paramInt3, long paramLong);
/*      */   
/*      */   public static double glGetTexGend(int coord, int pname) {
/* 1724 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 1725 */     long function_pointer = caps.GL11_glGetTexGendv_pointer;
/* 1726 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 1727 */     DoubleBuffer params = APIUtils.getBufferDouble();
/* 1728 */     nglGetTexGendv(coord, pname, params, params.position(), function_pointer);
/* 1729 */     return params.get(0);
/*      */   }
/*      */   
/*      */   public static void glGetTexEnv(int coord, int pname, IntBuffer params) {
/* 1733 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 1734 */     long function_pointer = caps.GL11_glGetTexEnviv_pointer;
/* 1735 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 1736 */     BufferChecks.checkBuffer(params, 4);
/* 1737 */     nglGetTexEnviv(coord, pname, params, params.position(), function_pointer);
/*      */   }
/*      */   
/*      */   private static native void nglGetTexEnviv(int paramInt1, int paramInt2, IntBuffer paramIntBuffer, int paramInt3, long paramLong);
/*      */   
/*      */   public static int glGetTexEnvi(int coord, int pname) {
/* 1743 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 1744 */     long function_pointer = caps.GL11_glGetTexEnviv_pointer;
/* 1745 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 1746 */     IntBuffer params = APIUtils.getBufferInt();
/* 1747 */     nglGetTexEnviv(coord, pname, params, params.position(), function_pointer);
/* 1748 */     return params.get(0);
/*      */   }
/*      */   
/*      */   public static void glGetTexEnv(int coord, int pname, FloatBuffer params) {
/* 1752 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 1753 */     long function_pointer = caps.GL11_glGetTexEnvfv_pointer;
/* 1754 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 1755 */     BufferChecks.checkBuffer(params, 4);
/* 1756 */     nglGetTexEnvfv(coord, pname, params, params.position(), function_pointer);
/*      */   }
/*      */   
/*      */   private static native void nglGetTexEnvfv(int paramInt1, int paramInt2, FloatBuffer paramFloatBuffer, int paramInt3, long paramLong);
/*      */   
/*      */   public static float glGetTexEnvf(int coord, int pname) {
/* 1762 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 1763 */     long function_pointer = caps.GL11_glGetTexEnvfv_pointer;
/* 1764 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 1765 */     FloatBuffer params = APIUtils.getBufferFloat();
/* 1766 */     nglGetTexEnvfv(coord, pname, params, params.position(), function_pointer);
/* 1767 */     return params.get(0);
/*      */   }
/*      */   
/*      */   public static String glGetString(int name) {
/* 1771 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 1772 */     long function_pointer = caps.GL11_glGetString_pointer;
/* 1773 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 1774 */     String __result = nglGetString(name, function_pointer);
/* 1775 */     return __result;
/*      */   }
/*      */   private static native String nglGetString(int paramInt, long paramLong);
/*      */   
/*      */   public static void glGetPolygonStipple(ByteBuffer mask) {
/* 1780 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 1781 */     long function_pointer = caps.GL11_glGetPolygonStipple_pointer;
/* 1782 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 1783 */     GLChecks.ensurePackPBOdisabled(caps);
/* 1784 */     BufferChecks.checkBuffer(mask, 1024);
/* 1785 */     nglGetPolygonStipple(mask, mask.position(), function_pointer);
/*      */   }
/*      */   private static native void nglGetPolygonStipple(ByteBuffer paramByteBuffer, int paramInt, long paramLong);
/*      */   public static void glGetPolygonStipple(long mask_buffer_offset) {
/* 1789 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 1790 */     long function_pointer = caps.GL11_glGetPolygonStipple_pointer;
/* 1791 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 1792 */     GLChecks.ensurePackPBOenabled(caps);
/* 1793 */     nglGetPolygonStippleBO(mask_buffer_offset, function_pointer);
/*      */   }
/*      */   private static native void nglGetPolygonStippleBO(long paramLong1, long paramLong2);
/*      */   
/*      */   public static boolean glIsList(int list) {
/* 1798 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 1799 */     long function_pointer = caps.GL11_glIsList_pointer;
/* 1800 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 1801 */     boolean __result = nglIsList(list, function_pointer);
/* 1802 */     return __result;
/*      */   }
/*      */   private static native boolean nglIsList(int paramInt, long paramLong);
/*      */   
/*      */   public static void glMaterialf(int face, int pname, float param) {
/* 1807 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 1808 */     long function_pointer = caps.GL11_glMaterialf_pointer;
/* 1809 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 1810 */     nglMaterialf(face, pname, param, function_pointer);
/*      */   }
/*      */   private static native void nglMaterialf(int paramInt1, int paramInt2, float paramFloat, long paramLong);
/*      */   
/*      */   public static void glMateriali(int face, int pname, int param) {
/* 1815 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 1816 */     long function_pointer = caps.GL11_glMateriali_pointer;
/* 1817 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 1818 */     nglMateriali(face, pname, param, function_pointer);
/*      */   }
/*      */   private static native void nglMateriali(int paramInt1, int paramInt2, int paramInt3, long paramLong);
/*      */   
/*      */   public static void glMaterial(int face, int pname, FloatBuffer params) {
/* 1823 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 1824 */     long function_pointer = caps.GL11_glMaterialfv_pointer;
/* 1825 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 1826 */     BufferChecks.checkBuffer(params, 4);
/* 1827 */     nglMaterialfv(face, pname, params, params.position(), function_pointer);
/*      */   }
/*      */   private static native void nglMaterialfv(int paramInt1, int paramInt2, FloatBuffer paramFloatBuffer, int paramInt3, long paramLong);
/*      */   
/*      */   public static void glMaterial(int face, int pname, IntBuffer params) {
/* 1832 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 1833 */     long function_pointer = caps.GL11_glMaterialiv_pointer;
/* 1834 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 1835 */     BufferChecks.checkBuffer(params, 4);
/* 1836 */     nglMaterialiv(face, pname, params, params.position(), function_pointer);
/*      */   }
/*      */   private static native void nglMaterialiv(int paramInt1, int paramInt2, IntBuffer paramIntBuffer, int paramInt3, long paramLong);
/*      */   
/*      */   public static void glMapGrid1f(int un, float u1, float u2) {
/* 1841 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 1842 */     long function_pointer = caps.GL11_glMapGrid1f_pointer;
/* 1843 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 1844 */     nglMapGrid1f(un, u1, u2, function_pointer);
/*      */   }
/*      */   private static native void nglMapGrid1f(int paramInt, float paramFloat1, float paramFloat2, long paramLong);
/*      */   
/*      */   public static void glMapGrid1d(int un, double u1, double u2) {
/* 1849 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 1850 */     long function_pointer = caps.GL11_glMapGrid1d_pointer;
/* 1851 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 1852 */     nglMapGrid1d(un, u1, u2, function_pointer);
/*      */   }
/*      */   private static native void nglMapGrid1d(int paramInt, double paramDouble1, double paramDouble2, long paramLong);
/*      */   
/*      */   public static void glMapGrid2f(int un, float u1, float u2, int vn, float v1, float v2) {
/* 1857 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 1858 */     long function_pointer = caps.GL11_glMapGrid2f_pointer;
/* 1859 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 1860 */     nglMapGrid2f(un, u1, u2, vn, v1, v2, function_pointer);
/*      */   }
/*      */   private static native void nglMapGrid2f(int paramInt1, float paramFloat1, float paramFloat2, int paramInt2, float paramFloat3, float paramFloat4, long paramLong);
/*      */   
/*      */   public static void glMapGrid2d(int un, double u1, double u2, int vn, double v1, double v2) {
/* 1865 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 1866 */     long function_pointer = caps.GL11_glMapGrid2d_pointer;
/* 1867 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 1868 */     nglMapGrid2d(un, u1, u2, vn, v1, v2, function_pointer);
/*      */   }
/*      */   private static native void nglMapGrid2d(int paramInt1, double paramDouble1, double paramDouble2, int paramInt2, double paramDouble3, double paramDouble4, long paramLong);
/*      */   
/*      */   public static void glMap2f(int target, float u1, float u2, int ustride, int uorder, float v1, float v2, int vstride, int vorder, FloatBuffer points) {
/* 1873 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 1874 */     long function_pointer = caps.GL11_glMap2f_pointer;
/* 1875 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 1876 */     BufferChecks.checkDirect(points);
/* 1877 */     nglMap2f(target, u1, u2, ustride, uorder, v1, v2, vstride, vorder, points, points.position(), function_pointer);
/*      */   }
/*      */   private static native void nglMap2f(int paramInt1, float paramFloat1, float paramFloat2, int paramInt2, int paramInt3, float paramFloat3, float paramFloat4, int paramInt4, int paramInt5, FloatBuffer paramFloatBuffer, int paramInt6, long paramLong);
/*      */   
/*      */   public static void glMap2d(int target, double u1, double u2, int ustride, int uorder, double v1, double v2, int vstride, int vorder, DoubleBuffer points) {
/* 1882 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 1883 */     long function_pointer = caps.GL11_glMap2d_pointer;
/* 1884 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 1885 */     BufferChecks.checkDirect(points);
/* 1886 */     nglMap2d(target, u1, u2, ustride, uorder, v1, v2, vstride, vorder, points, points.position(), function_pointer);
/*      */   }
/*      */   private static native void nglMap2d(int paramInt1, double paramDouble1, double paramDouble2, int paramInt2, int paramInt3, double paramDouble3, double paramDouble4, int paramInt4, int paramInt5, DoubleBuffer paramDoubleBuffer, int paramInt6, long paramLong);
/*      */   
/*      */   public static void glMap1f(int target, float u1, float u2, int stride, int order, FloatBuffer points) {
/* 1891 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 1892 */     long function_pointer = caps.GL11_glMap1f_pointer;
/* 1893 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 1894 */     BufferChecks.checkDirect(points);
/* 1895 */     nglMap1f(target, u1, u2, stride, order, points, points.position(), function_pointer);
/*      */   }
/*      */   private static native void nglMap1f(int paramInt1, float paramFloat1, float paramFloat2, int paramInt2, int paramInt3, FloatBuffer paramFloatBuffer, int paramInt4, long paramLong);
/*      */   
/*      */   public static void glMap1d(int target, double u1, double u2, int stride, int order, DoubleBuffer points) {
/* 1900 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 1901 */     long function_pointer = caps.GL11_glMap1d_pointer;
/* 1902 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 1903 */     BufferChecks.checkDirect(points);
/* 1904 */     nglMap1d(target, u1, u2, stride, order, points, points.position(), function_pointer);
/*      */   }
/*      */   private static native void nglMap1d(int paramInt1, double paramDouble1, double paramDouble2, int paramInt2, int paramInt3, DoubleBuffer paramDoubleBuffer, int paramInt4, long paramLong);
/*      */   
/*      */   public static void glLogicOp(int opcode) {
/* 1909 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 1910 */     long function_pointer = caps.GL11_glLogicOp_pointer;
/* 1911 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 1912 */     nglLogicOp(opcode, function_pointer);
/*      */   }
/*      */   private static native void nglLogicOp(int paramInt, long paramLong);
/*      */   
/*      */   public static void glLoadName(int name) {
/* 1917 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 1918 */     long function_pointer = caps.GL11_glLoadName_pointer;
/* 1919 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 1920 */     nglLoadName(name, function_pointer);
/*      */   }
/*      */   private static native void nglLoadName(int paramInt, long paramLong);
/*      */   
/*      */   public static void glLoadMatrix(FloatBuffer m) {
/* 1925 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 1926 */     long function_pointer = caps.GL11_glLoadMatrixf_pointer;
/* 1927 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 1928 */     BufferChecks.checkBuffer(m, 16);
/* 1929 */     nglLoadMatrixf(m, m.position(), function_pointer);
/*      */   }
/*      */   private static native void nglLoadMatrixf(FloatBuffer paramFloatBuffer, int paramInt, long paramLong);
/*      */   
/*      */   public static void glLoadMatrix(DoubleBuffer m) {
/* 1934 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 1935 */     long function_pointer = caps.GL11_glLoadMatrixd_pointer;
/* 1936 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 1937 */     BufferChecks.checkBuffer(m, 16);
/* 1938 */     nglLoadMatrixd(m, m.position(), function_pointer);
/*      */   }
/*      */   private static native void nglLoadMatrixd(DoubleBuffer paramDoubleBuffer, int paramInt, long paramLong);
/*      */   
/*      */   public static void glLoadIdentity() {
/* 1943 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 1944 */     long function_pointer = caps.GL11_glLoadIdentity_pointer;
/* 1945 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 1946 */     nglLoadIdentity(function_pointer);
/*      */   }
/*      */   private static native void nglLoadIdentity(long paramLong);
/*      */   
/*      */   public static void glListBase(int base) {
/* 1951 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 1952 */     long function_pointer = caps.GL11_glListBase_pointer;
/* 1953 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 1954 */     nglListBase(base, function_pointer);
/*      */   }
/*      */   private static native void nglListBase(int paramInt, long paramLong);
/*      */   
/*      */   public static void glLineWidth(float width) {
/* 1959 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 1960 */     long function_pointer = caps.GL11_glLineWidth_pointer;
/* 1961 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 1962 */     nglLineWidth(width, function_pointer);
/*      */   }
/*      */   private static native void nglLineWidth(float paramFloat, long paramLong);
/*      */   
/*      */   public static void glLineStipple(int factor, short pattern) {
/* 1967 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 1968 */     long function_pointer = caps.GL11_glLineStipple_pointer;
/* 1969 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 1970 */     nglLineStipple(factor, pattern, function_pointer);
/*      */   }
/*      */   private static native void nglLineStipple(int paramInt, short paramShort, long paramLong);
/*      */   
/*      */   public static void glLightModelf(int pname, float param) {
/* 1975 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 1976 */     long function_pointer = caps.GL11_glLightModelf_pointer;
/* 1977 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 1978 */     nglLightModelf(pname, param, function_pointer);
/*      */   }
/*      */   private static native void nglLightModelf(int paramInt, float paramFloat, long paramLong);
/*      */   
/*      */   public static void glLightModeli(int pname, int param) {
/* 1983 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 1984 */     long function_pointer = caps.GL11_glLightModeli_pointer;
/* 1985 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 1986 */     nglLightModeli(pname, param, function_pointer);
/*      */   }
/*      */   private static native void nglLightModeli(int paramInt1, int paramInt2, long paramLong);
/*      */   
/*      */   public static void glLightModel(int pname, FloatBuffer params) {
/* 1991 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 1992 */     long function_pointer = caps.GL11_glLightModelfv_pointer;
/* 1993 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 1994 */     BufferChecks.checkBuffer(params, 4);
/* 1995 */     nglLightModelfv(pname, params, params.position(), function_pointer);
/*      */   }
/*      */   private static native void nglLightModelfv(int paramInt1, FloatBuffer paramFloatBuffer, int paramInt2, long paramLong);
/*      */   
/*      */   public static void glLightModel(int pname, IntBuffer params) {
/* 2000 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 2001 */     long function_pointer = caps.GL11_glLightModeliv_pointer;
/* 2002 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 2003 */     BufferChecks.checkBuffer(params, 4);
/* 2004 */     nglLightModeliv(pname, params, params.position(), function_pointer);
/*      */   }
/*      */   private static native void nglLightModeliv(int paramInt1, IntBuffer paramIntBuffer, int paramInt2, long paramLong);
/*      */   
/*      */   public static void glLightf(int light, int pname, float param) {
/* 2009 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 2010 */     long function_pointer = caps.GL11_glLightf_pointer;
/* 2011 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 2012 */     nglLightf(light, pname, param, function_pointer);
/*      */   }
/*      */   private static native void nglLightf(int paramInt1, int paramInt2, float paramFloat, long paramLong);
/*      */   
/*      */   public static void glLighti(int light, int pname, int param) {
/* 2017 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 2018 */     long function_pointer = caps.GL11_glLighti_pointer;
/* 2019 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 2020 */     nglLighti(light, pname, param, function_pointer);
/*      */   }
/*      */   private static native void nglLighti(int paramInt1, int paramInt2, int paramInt3, long paramLong);
/*      */   
/*      */   public static void glLight(int light, int pname, FloatBuffer params) {
/* 2025 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 2026 */     long function_pointer = caps.GL11_glLightfv_pointer;
/* 2027 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 2028 */     BufferChecks.checkBuffer(params, 4);
/* 2029 */     nglLightfv(light, pname, params, params.position(), function_pointer);
/*      */   }
/*      */   private static native void nglLightfv(int paramInt1, int paramInt2, FloatBuffer paramFloatBuffer, int paramInt3, long paramLong);
/*      */   
/*      */   public static void glLight(int light, int pname, IntBuffer params) {
/* 2034 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 2035 */     long function_pointer = caps.GL11_glLightiv_pointer;
/* 2036 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 2037 */     BufferChecks.checkBuffer(params, 4);
/* 2038 */     nglLightiv(light, pname, params, params.position(), function_pointer);
/*      */   }
/*      */   private static native void nglLightiv(int paramInt1, int paramInt2, IntBuffer paramIntBuffer, int paramInt3, long paramLong);
/*      */   
/*      */   public static boolean glIsTexture(int texture) {
/* 2043 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 2044 */     long function_pointer = caps.GL11_glIsTexture_pointer;
/* 2045 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 2046 */     boolean __result = nglIsTexture(texture, function_pointer);
/* 2047 */     return __result;
/*      */   }
/*      */   private static native boolean nglIsTexture(int paramInt, long paramLong);
/*      */   
/*      */   public static void glMatrixMode(int mode) {
/* 2052 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 2053 */     long function_pointer = caps.GL11_glMatrixMode_pointer;
/* 2054 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 2055 */     nglMatrixMode(mode, function_pointer);
/*      */   }
/*      */   private static native void nglMatrixMode(int paramInt, long paramLong);
/*      */   
/*      */   public static void glPolygonStipple(ByteBuffer mask) {
/* 2060 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 2061 */     long function_pointer = caps.GL11_glPolygonStipple_pointer;
/* 2062 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 2063 */     GLChecks.ensureUnpackPBOdisabled(caps);
/* 2064 */     BufferChecks.checkBuffer(mask, 1024);
/* 2065 */     nglPolygonStipple(mask, mask.position(), function_pointer);
/*      */   }
/*      */   private static native void nglPolygonStipple(ByteBuffer paramByteBuffer, int paramInt, long paramLong);
/*      */   public static void glPolygonStipple(long mask_buffer_offset) {
/* 2069 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 2070 */     long function_pointer = caps.GL11_glPolygonStipple_pointer;
/* 2071 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 2072 */     GLChecks.ensureUnpackPBOenabled(caps);
/* 2073 */     nglPolygonStippleBO(mask_buffer_offset, function_pointer);
/*      */   }
/*      */   private static native void nglPolygonStippleBO(long paramLong1, long paramLong2);
/*      */   
/*      */   public static void glPolygonOffset(float factor, float units) {
/* 2078 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 2079 */     long function_pointer = caps.GL11_glPolygonOffset_pointer;
/* 2080 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 2081 */     nglPolygonOffset(factor, units, function_pointer);
/*      */   }
/*      */   private static native void nglPolygonOffset(float paramFloat1, float paramFloat2, long paramLong);
/*      */   
/*      */   public static void glPolygonMode(int face, int mode) {
/* 2086 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 2087 */     long function_pointer = caps.GL11_glPolygonMode_pointer;
/* 2088 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 2089 */     nglPolygonMode(face, mode, function_pointer);
/*      */   }
/*      */   private static native void nglPolygonMode(int paramInt1, int paramInt2, long paramLong);
/*      */   
/*      */   public static void glPointSize(float size) {
/* 2094 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 2095 */     long function_pointer = caps.GL11_glPointSize_pointer;
/* 2096 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 2097 */     nglPointSize(size, function_pointer);
/*      */   }
/*      */   private static native void nglPointSize(float paramFloat, long paramLong);
/*      */   
/*      */   public static void glPixelZoom(float xfactor, float yfactor) {
/* 2102 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 2103 */     long function_pointer = caps.GL11_glPixelZoom_pointer;
/* 2104 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 2105 */     nglPixelZoom(xfactor, yfactor, function_pointer);
/*      */   }
/*      */   private static native void nglPixelZoom(float paramFloat1, float paramFloat2, long paramLong);
/*      */   
/*      */   public static void glPixelTransferf(int pname, float param) {
/* 2110 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 2111 */     long function_pointer = caps.GL11_glPixelTransferf_pointer;
/* 2112 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 2113 */     nglPixelTransferf(pname, param, function_pointer);
/*      */   }
/*      */   private static native void nglPixelTransferf(int paramInt, float paramFloat, long paramLong);
/*      */   
/*      */   public static void glPixelTransferi(int pname, int param) {
/* 2118 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 2119 */     long function_pointer = caps.GL11_glPixelTransferi_pointer;
/* 2120 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 2121 */     nglPixelTransferi(pname, param, function_pointer);
/*      */   }
/*      */   private static native void nglPixelTransferi(int paramInt1, int paramInt2, long paramLong);
/*      */   
/*      */   public static void glPixelStoref(int pname, float param) {
/* 2126 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 2127 */     long function_pointer = caps.GL11_glPixelStoref_pointer;
/* 2128 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 2129 */     nglPixelStoref(pname, param, function_pointer);
/*      */   }
/*      */   private static native void nglPixelStoref(int paramInt, float paramFloat, long paramLong);
/*      */   
/*      */   public static void glPixelStorei(int pname, int param) {
/* 2134 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 2135 */     long function_pointer = caps.GL11_glPixelStorei_pointer;
/* 2136 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 2137 */     nglPixelStorei(pname, param, function_pointer);
/*      */   }
/*      */   private static native void nglPixelStorei(int paramInt1, int paramInt2, long paramLong);
/*      */   
/*      */   public static void glPixelMap(int map, FloatBuffer values) {
/* 2142 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 2143 */     long function_pointer = caps.GL11_glPixelMapfv_pointer;
/* 2144 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 2145 */     GLChecks.ensureUnpackPBOdisabled(caps);
/* 2146 */     BufferChecks.checkDirect(values);
/* 2147 */     nglPixelMapfv(map, values.remaining(), values, values.position(), function_pointer);
/*      */   }
/*      */   private static native void nglPixelMapfv(int paramInt1, int paramInt2, FloatBuffer paramFloatBuffer, int paramInt3, long paramLong);
/*      */   public static void glPixelMapfv(int map, int mapsize, long values_buffer_offset) {
/* 2151 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 2152 */     long function_pointer = caps.GL11_glPixelMapfv_pointer;
/* 2153 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 2154 */     GLChecks.ensureUnpackPBOenabled(caps);
/* 2155 */     nglPixelMapfvBO(map, mapsize, values_buffer_offset, function_pointer);
/*      */   }
/*      */   private static native void nglPixelMapfvBO(int paramInt1, int paramInt2, long paramLong1, long paramLong2);
/*      */   
/*      */   public static void glPixelMapu(int map, IntBuffer values) {
/* 2160 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 2161 */     long function_pointer = caps.GL11_glPixelMapuiv_pointer;
/* 2162 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 2163 */     GLChecks.ensureUnpackPBOdisabled(caps);
/* 2164 */     BufferChecks.checkDirect(values);
/* 2165 */     nglPixelMapuiv(map, values.remaining(), values, values.position(), function_pointer);
/*      */   }
/*      */   private static native void nglPixelMapuiv(int paramInt1, int paramInt2, IntBuffer paramIntBuffer, int paramInt3, long paramLong);
/*      */   public static void glPixelMapuiv(int map, int mapsize, long values_buffer_offset) {
/* 2169 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 2170 */     long function_pointer = caps.GL11_glPixelMapuiv_pointer;
/* 2171 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 2172 */     GLChecks.ensureUnpackPBOenabled(caps);
/* 2173 */     nglPixelMapuivBO(map, mapsize, values_buffer_offset, function_pointer);
/*      */   }
/*      */   private static native void nglPixelMapuivBO(int paramInt1, int paramInt2, long paramLong1, long paramLong2);
/*      */   
/*      */   public static void glPixelMapu(int map, ShortBuffer values) {
/* 2178 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 2179 */     long function_pointer = caps.GL11_glPixelMapusv_pointer;
/* 2180 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 2181 */     GLChecks.ensureUnpackPBOdisabled(caps);
/* 2182 */     BufferChecks.checkDirect(values);
/* 2183 */     nglPixelMapusv(map, values.remaining(), values, values.position(), function_pointer);
/*      */   }
/*      */   private static native void nglPixelMapusv(int paramInt1, int paramInt2, ShortBuffer paramShortBuffer, int paramInt3, long paramLong);
/*      */   public static void glPixelMapusv(int map, int mapsize, long values_buffer_offset) {
/* 2187 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 2188 */     long function_pointer = caps.GL11_glPixelMapusv_pointer;
/* 2189 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 2190 */     GLChecks.ensureUnpackPBOenabled(caps);
/* 2191 */     nglPixelMapusvBO(map, mapsize, values_buffer_offset, function_pointer);
/*      */   }
/*      */   private static native void nglPixelMapusvBO(int paramInt1, int paramInt2, long paramLong1, long paramLong2);
/*      */   
/*      */   public static void glPassThrough(float token) {
/* 2196 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 2197 */     long function_pointer = caps.GL11_glPassThrough_pointer;
/* 2198 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 2199 */     nglPassThrough(token, function_pointer);
/*      */   }
/*      */   private static native void nglPassThrough(float paramFloat, long paramLong);
/*      */   
/*      */   public static void glOrtho(double left, double right, double bottom, double top, double zNear, double zFar) {
/* 2204 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 2205 */     long function_pointer = caps.GL11_glOrtho_pointer;
/* 2206 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 2207 */     nglOrtho(left, right, bottom, top, zNear, zFar, function_pointer);
/*      */   }
/*      */   private static native void nglOrtho(double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, double paramDouble5, double paramDouble6, long paramLong);
/*      */   
/*      */   public static void glNormalPointer(int stride, ByteBuffer pointer) {
/* 2212 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 2213 */     long function_pointer = caps.GL11_glNormalPointer_pointer;
/* 2214 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 2215 */     GLChecks.ensureArrayVBOdisabled(caps);
/* 2216 */     BufferChecks.checkDirect(pointer);
/* 2217 */     (GLChecks.getReferences(caps)).GL11_glNormalPointer_pointer = pointer;
/* 2218 */     nglNormalPointer(5120, stride, pointer, pointer.position(), function_pointer);
/*      */   }
/*      */   public static void glNormalPointer(int stride, DoubleBuffer pointer) {
/* 2221 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 2222 */     long function_pointer = caps.GL11_glNormalPointer_pointer;
/* 2223 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 2224 */     GLChecks.ensureArrayVBOdisabled(caps);
/* 2225 */     BufferChecks.checkDirect(pointer);
/* 2226 */     (GLChecks.getReferences(caps)).GL11_glNormalPointer_pointer = pointer;
/* 2227 */     nglNormalPointer(5130, stride, pointer, pointer.position() << 3, function_pointer);
/*      */   }
/*      */   public static void glNormalPointer(int stride, FloatBuffer pointer) {
/* 2230 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 2231 */     long function_pointer = caps.GL11_glNormalPointer_pointer;
/* 2232 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 2233 */     GLChecks.ensureArrayVBOdisabled(caps);
/* 2234 */     BufferChecks.checkDirect(pointer);
/* 2235 */     (GLChecks.getReferences(caps)).GL11_glNormalPointer_pointer = pointer;
/* 2236 */     nglNormalPointer(5126, stride, pointer, pointer.position() << 2, function_pointer);
/*      */   }
/*      */   public static void glNormalPointer(int stride, IntBuffer pointer) {
/* 2239 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 2240 */     long function_pointer = caps.GL11_glNormalPointer_pointer;
/* 2241 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 2242 */     GLChecks.ensureArrayVBOdisabled(caps);
/* 2243 */     BufferChecks.checkDirect(pointer);
/* 2244 */     (GLChecks.getReferences(caps)).GL11_glNormalPointer_pointer = pointer;
/* 2245 */     nglNormalPointer(5124, stride, pointer, pointer.position() << 2, function_pointer);
/*      */   }
/*      */   private static native void nglNormalPointer(int paramInt1, int paramInt2, Buffer paramBuffer, int paramInt3, long paramLong);
/*      */   public static void glNormalPointer(int type, int stride, long pointer_buffer_offset) {
/* 2249 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 2250 */     long function_pointer = caps.GL11_glNormalPointer_pointer;
/* 2251 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 2252 */     GLChecks.ensureArrayVBOenabled(caps);
/* 2253 */     nglNormalPointerBO(type, stride, pointer_buffer_offset, function_pointer);
/*      */   }
/*      */   private static native void nglNormalPointerBO(int paramInt1, int paramInt2, long paramLong1, long paramLong2);
/*      */   
/*      */   public static void glNormal3b(byte nx, byte ny, byte nz) {
/* 2258 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 2259 */     long function_pointer = caps.GL11_glNormal3b_pointer;
/* 2260 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 2261 */     nglNormal3b(nx, ny, nz, function_pointer);
/*      */   }
/*      */   private static native void nglNormal3b(byte paramByte1, byte paramByte2, byte paramByte3, long paramLong);
/*      */   
/*      */   public static void glNormal3f(float nx, float ny, float nz) {
/* 2266 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 2267 */     long function_pointer = caps.GL11_glNormal3f_pointer;
/* 2268 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 2269 */     nglNormal3f(nx, ny, nz, function_pointer);
/*      */   }
/*      */   private static native void nglNormal3f(float paramFloat1, float paramFloat2, float paramFloat3, long paramLong);
/*      */   
/*      */   public static void glNormal3d(double nx, double ny, double nz) {
/* 2274 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 2275 */     long function_pointer = caps.GL11_glNormal3d_pointer;
/* 2276 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 2277 */     nglNormal3d(nx, ny, nz, function_pointer);
/*      */   }
/*      */   private static native void nglNormal3d(double paramDouble1, double paramDouble2, double paramDouble3, long paramLong);
/*      */   
/*      */   public static void glNormal3i(int nx, int ny, int nz) {
/* 2282 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 2283 */     long function_pointer = caps.GL11_glNormal3i_pointer;
/* 2284 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 2285 */     nglNormal3i(nx, ny, nz, function_pointer);
/*      */   }
/*      */   private static native void nglNormal3i(int paramInt1, int paramInt2, int paramInt3, long paramLong);
/*      */   
/*      */   public static void glNewList(int list, int mode) {
/* 2290 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 2291 */     long function_pointer = caps.GL11_glNewList_pointer;
/* 2292 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 2293 */     nglNewList(list, mode, function_pointer);
/*      */   }
/*      */   private static native void nglNewList(int paramInt1, int paramInt2, long paramLong);
/*      */   
/*      */   public static void glEndList() {
/* 2298 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 2299 */     long function_pointer = caps.GL11_glEndList_pointer;
/* 2300 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 2301 */     nglEndList(function_pointer);
/*      */   }
/*      */   private static native void nglEndList(long paramLong);
/*      */   
/*      */   public static void glMultMatrix(FloatBuffer m) {
/* 2306 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 2307 */     long function_pointer = caps.GL11_glMultMatrixf_pointer;
/* 2308 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 2309 */     BufferChecks.checkBuffer(m, 16);
/* 2310 */     nglMultMatrixf(m, m.position(), function_pointer);
/*      */   }
/*      */   private static native void nglMultMatrixf(FloatBuffer paramFloatBuffer, int paramInt, long paramLong);
/*      */   
/*      */   public static void glMultMatrix(DoubleBuffer m) {
/* 2315 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 2316 */     long function_pointer = caps.GL11_glMultMatrixd_pointer;
/* 2317 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 2318 */     BufferChecks.checkBuffer(m, 16);
/* 2319 */     nglMultMatrixd(m, m.position(), function_pointer);
/*      */   }
/*      */   private static native void nglMultMatrixd(DoubleBuffer paramDoubleBuffer, int paramInt, long paramLong);
/*      */   
/*      */   public static void glShadeModel(int mode) {
/* 2324 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 2325 */     long function_pointer = caps.GL11_glShadeModel_pointer;
/* 2326 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 2327 */     nglShadeModel(mode, function_pointer);
/*      */   }
/*      */   private static native void nglShadeModel(int paramInt, long paramLong);
/*      */   
/*      */   public static void glSelectBuffer(IntBuffer buffer) {
/* 2332 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 2333 */     long function_pointer = caps.GL11_glSelectBuffer_pointer;
/* 2334 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 2335 */     BufferChecks.checkDirect(buffer);
/* 2336 */     nglSelectBuffer(buffer.remaining(), buffer, buffer.position(), function_pointer);
/*      */   }
/*      */   private static native void nglSelectBuffer(int paramInt1, IntBuffer paramIntBuffer, int paramInt2, long paramLong);
/*      */   
/*      */   public static void glScissor(int x, int y, int width, int height) {
/* 2341 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 2342 */     long function_pointer = caps.GL11_glScissor_pointer;
/* 2343 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 2344 */     nglScissor(x, y, width, height, function_pointer);
/*      */   }
/*      */   private static native void nglScissor(int paramInt1, int paramInt2, int paramInt3, int paramInt4, long paramLong);
/*      */   
/*      */   public static void glScalef(float x, float y, float z) {
/* 2349 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 2350 */     long function_pointer = caps.GL11_glScalef_pointer;
/* 2351 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 2352 */     nglScalef(x, y, z, function_pointer);
/*      */   }
/*      */   private static native void nglScalef(float paramFloat1, float paramFloat2, float paramFloat3, long paramLong);
/*      */   
/*      */   public static void glScaled(double x, double y, double z) {
/* 2357 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 2358 */     long function_pointer = caps.GL11_glScaled_pointer;
/* 2359 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 2360 */     nglScaled(x, y, z, function_pointer);
/*      */   }
/*      */   private static native void nglScaled(double paramDouble1, double paramDouble2, double paramDouble3, long paramLong);
/*      */   
/*      */   public static void glRotatef(float angle, float x, float y, float z) {
/* 2365 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 2366 */     long function_pointer = caps.GL11_glRotatef_pointer;
/* 2367 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 2368 */     nglRotatef(angle, x, y, z, function_pointer);
/*      */   }
/*      */   private static native void nglRotatef(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, long paramLong);
/*      */   
/*      */   public static int glRenderMode(int mode) {
/* 2373 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 2374 */     long function_pointer = caps.GL11_glRenderMode_pointer;
/* 2375 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 2376 */     int __result = nglRenderMode(mode, function_pointer);
/* 2377 */     return __result;
/*      */   }
/*      */   private static native int nglRenderMode(int paramInt, long paramLong);
/*      */   
/*      */   public static void glRectf(float x1, float y1, float x2, float y2) {
/* 2382 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 2383 */     long function_pointer = caps.GL11_glRectf_pointer;
/* 2384 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 2385 */     nglRectf(x1, y1, x2, y2, function_pointer);
/*      */   }
/*      */   private static native void nglRectf(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, long paramLong);
/*      */   
/*      */   public static void glRectd(double x1, double y1, double x2, double y2) {
/* 2390 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 2391 */     long function_pointer = caps.GL11_glRectd_pointer;
/* 2392 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 2393 */     nglRectd(x1, y1, x2, y2, function_pointer);
/*      */   }
/*      */   private static native void nglRectd(double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, long paramLong);
/*      */   
/*      */   public static void glRecti(int x1, int y1, int x2, int y2) {
/* 2398 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 2399 */     long function_pointer = caps.GL11_glRecti_pointer;
/* 2400 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 2401 */     nglRecti(x1, y1, x2, y2, function_pointer);
/*      */   }
/*      */   private static native void nglRecti(int paramInt1, int paramInt2, int paramInt3, int paramInt4, long paramLong);
/*      */   
/*      */   public static void glReadPixels(int x, int y, int width, int height, int format, int type, ByteBuffer pixels) {
/* 2406 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 2407 */     long function_pointer = caps.GL11_glReadPixels_pointer;
/* 2408 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 2409 */     GLChecks.ensurePackPBOdisabled(caps);
/* 2410 */     BufferChecks.checkBuffer(pixels, GLChecks.calculateImageStorage(pixels, format, type, width, height, 1));
/* 2411 */     nglReadPixels(x, y, width, height, format, type, pixels, pixels.position(), function_pointer);
/*      */   }
/*      */   public static void glReadPixels(int x, int y, int width, int height, int format, int type, DoubleBuffer pixels) {
/* 2414 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 2415 */     long function_pointer = caps.GL11_glReadPixels_pointer;
/* 2416 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 2417 */     GLChecks.ensurePackPBOdisabled(caps);
/* 2418 */     BufferChecks.checkBuffer(pixels, GLChecks.calculateImageStorage(pixels, format, type, width, height, 1));
/* 2419 */     nglReadPixels(x, y, width, height, format, type, pixels, pixels.position() << 3, function_pointer);
/*      */   }
/*      */   public static void glReadPixels(int x, int y, int width, int height, int format, int type, FloatBuffer pixels) {
/* 2422 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 2423 */     long function_pointer = caps.GL11_glReadPixels_pointer;
/* 2424 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 2425 */     GLChecks.ensurePackPBOdisabled(caps);
/* 2426 */     BufferChecks.checkBuffer(pixels, GLChecks.calculateImageStorage(pixels, format, type, width, height, 1));
/* 2427 */     nglReadPixels(x, y, width, height, format, type, pixels, pixels.position() << 2, function_pointer);
/*      */   }
/*      */   public static void glReadPixels(int x, int y, int width, int height, int format, int type, IntBuffer pixels) {
/* 2430 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 2431 */     long function_pointer = caps.GL11_glReadPixels_pointer;
/* 2432 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 2433 */     GLChecks.ensurePackPBOdisabled(caps);
/* 2434 */     BufferChecks.checkBuffer(pixels, GLChecks.calculateImageStorage(pixels, format, type, width, height, 1));
/* 2435 */     nglReadPixels(x, y, width, height, format, type, pixels, pixels.position() << 2, function_pointer);
/*      */   }
/*      */   public static void glReadPixels(int x, int y, int width, int height, int format, int type, ShortBuffer pixels) {
/* 2438 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 2439 */     long function_pointer = caps.GL11_glReadPixels_pointer;
/* 2440 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 2441 */     GLChecks.ensurePackPBOdisabled(caps);
/* 2442 */     BufferChecks.checkBuffer(pixels, GLChecks.calculateImageStorage(pixels, format, type, width, height, 1));
/* 2443 */     nglReadPixels(x, y, width, height, format, type, pixels, pixels.position() << 1, function_pointer);
/*      */   }
/*      */   private static native void nglReadPixels(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, Buffer paramBuffer, int paramInt7, long paramLong);
/*      */   public static void glReadPixels(int x, int y, int width, int height, int format, int type, long pixels_buffer_offset) {
/* 2447 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 2448 */     long function_pointer = caps.GL11_glReadPixels_pointer;
/* 2449 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 2450 */     GLChecks.ensurePackPBOenabled(caps);
/* 2451 */     nglReadPixelsBO(x, y, width, height, format, type, pixels_buffer_offset, function_pointer);
/*      */   }
/*      */   private static native void nglReadPixelsBO(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, long paramLong1, long paramLong2);
/*      */   
/*      */   public static void glReadBuffer(int mode) {
/* 2456 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 2457 */     long function_pointer = caps.GL11_glReadBuffer_pointer;
/* 2458 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 2459 */     nglReadBuffer(mode, function_pointer);
/*      */   }
/*      */   private static native void nglReadBuffer(int paramInt, long paramLong);
/*      */   
/*      */   public static void glRasterPos2f(float x, float y) {
/* 2464 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 2465 */     long function_pointer = caps.GL11_glRasterPos2f_pointer;
/* 2466 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 2467 */     nglRasterPos2f(x, y, function_pointer);
/*      */   }
/*      */   private static native void nglRasterPos2f(float paramFloat1, float paramFloat2, long paramLong);
/*      */   
/*      */   public static void glRasterPos2d(double x, double y) {
/* 2472 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 2473 */     long function_pointer = caps.GL11_glRasterPos2d_pointer;
/* 2474 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 2475 */     nglRasterPos2d(x, y, function_pointer);
/*      */   }
/*      */   private static native void nglRasterPos2d(double paramDouble1, double paramDouble2, long paramLong);
/*      */   
/*      */   public static void glRasterPos2i(int x, int y) {
/* 2480 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 2481 */     long function_pointer = caps.GL11_glRasterPos2i_pointer;
/* 2482 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 2483 */     nglRasterPos2i(x, y, function_pointer);
/*      */   }
/*      */   private static native void nglRasterPos2i(int paramInt1, int paramInt2, long paramLong);
/*      */   
/*      */   public static void glRasterPos3f(float x, float y, float z) {
/* 2488 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 2489 */     long function_pointer = caps.GL11_glRasterPos3f_pointer;
/* 2490 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 2491 */     nglRasterPos3f(x, y, z, function_pointer);
/*      */   }
/*      */   private static native void nglRasterPos3f(float paramFloat1, float paramFloat2, float paramFloat3, long paramLong);
/*      */   
/*      */   public static void glRasterPos3d(double x, double y, double z) {
/* 2496 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 2497 */     long function_pointer = caps.GL11_glRasterPos3d_pointer;
/* 2498 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 2499 */     nglRasterPos3d(x, y, z, function_pointer);
/*      */   }
/*      */   private static native void nglRasterPos3d(double paramDouble1, double paramDouble2, double paramDouble3, long paramLong);
/*      */   
/*      */   public static void glRasterPos3i(int x, int y, int z) {
/* 2504 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 2505 */     long function_pointer = caps.GL11_glRasterPos3i_pointer;
/* 2506 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 2507 */     nglRasterPos3i(x, y, z, function_pointer);
/*      */   }
/*      */   private static native void nglRasterPos3i(int paramInt1, int paramInt2, int paramInt3, long paramLong);
/*      */   
/*      */   public static void glRasterPos4f(float x, float y, float z, float w) {
/* 2512 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 2513 */     long function_pointer = caps.GL11_glRasterPos4f_pointer;
/* 2514 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 2515 */     nglRasterPos4f(x, y, z, w, function_pointer);
/*      */   }
/*      */   private static native void nglRasterPos4f(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, long paramLong);
/*      */   
/*      */   public static void glRasterPos4d(double x, double y, double z, double w) {
/* 2520 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 2521 */     long function_pointer = caps.GL11_glRasterPos4d_pointer;
/* 2522 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 2523 */     nglRasterPos4d(x, y, z, w, function_pointer);
/*      */   }
/*      */   private static native void nglRasterPos4d(double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, long paramLong);
/*      */   
/*      */   public static void glRasterPos4i(int x, int y, int z, int w) {
/* 2528 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 2529 */     long function_pointer = caps.GL11_glRasterPos4i_pointer;
/* 2530 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 2531 */     nglRasterPos4i(x, y, z, w, function_pointer);
/*      */   }
/*      */   private static native void nglRasterPos4i(int paramInt1, int paramInt2, int paramInt3, int paramInt4, long paramLong);
/*      */   
/*      */   public static void glPushName(int name) {
/* 2536 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 2537 */     long function_pointer = caps.GL11_glPushName_pointer;
/* 2538 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 2539 */     nglPushName(name, function_pointer);
/*      */   }
/*      */   private static native void nglPushName(int paramInt, long paramLong);
/*      */   
/*      */   public static void glPopName() {
/* 2544 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 2545 */     long function_pointer = caps.GL11_glPopName_pointer;
/* 2546 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 2547 */     nglPopName(function_pointer);
/*      */   }
/*      */   private static native void nglPopName(long paramLong);
/*      */   
/*      */   public static void glPushMatrix() {
/* 2552 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 2553 */     long function_pointer = caps.GL11_glPushMatrix_pointer;
/* 2554 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 2555 */     nglPushMatrix(function_pointer);
/*      */   }
/*      */   private static native void nglPushMatrix(long paramLong);
/*      */   
/*      */   public static void glPopMatrix() {
/* 2560 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 2561 */     long function_pointer = caps.GL11_glPopMatrix_pointer;
/* 2562 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 2563 */     nglPopMatrix(function_pointer);
/*      */   }
/*      */   private static native void nglPopMatrix(long paramLong);
/*      */   
/*      */   public static void glPushClientAttrib(int mask) {
/* 2568 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 2569 */     long function_pointer = caps.GL11_glPushClientAttrib_pointer;
/* 2570 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 2571 */     StateTracker.pushAttrib(caps, mask);
/* 2572 */     nglPushClientAttrib(mask, function_pointer);
/*      */   }
/*      */   private static native void nglPushClientAttrib(int paramInt, long paramLong);
/*      */   
/*      */   public static void glPopClientAttrib() {
/* 2577 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 2578 */     long function_pointer = caps.GL11_glPopClientAttrib_pointer;
/* 2579 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 2580 */     StateTracker.popAttrib(caps);
/* 2581 */     nglPopClientAttrib(function_pointer);
/*      */   }
/*      */   private static native void nglPopClientAttrib(long paramLong);
/*      */   
/*      */   public static void glPushAttrib(int mask) {
/* 2586 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 2587 */     long function_pointer = caps.GL11_glPushAttrib_pointer;
/* 2588 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 2589 */     nglPushAttrib(mask, function_pointer);
/*      */   }
/*      */   private static native void nglPushAttrib(int paramInt, long paramLong);
/*      */   
/*      */   public static void glPopAttrib() {
/* 2594 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 2595 */     long function_pointer = caps.GL11_glPopAttrib_pointer;
/* 2596 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 2597 */     nglPopAttrib(function_pointer);
/*      */   }
/*      */   private static native void nglPopAttrib(long paramLong);
/*      */   
/*      */   public static void glStencilFunc(int func, int ref, int mask) {
/* 2602 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 2603 */     long function_pointer = caps.GL11_glStencilFunc_pointer;
/* 2604 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 2605 */     nglStencilFunc(func, ref, mask, function_pointer);
/*      */   }
/*      */   private static native void nglStencilFunc(int paramInt1, int paramInt2, int paramInt3, long paramLong);
/*      */   
/*      */   public static void glVertexPointer(int size, int stride, DoubleBuffer pointer) {
/* 2610 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 2611 */     long function_pointer = caps.GL11_glVertexPointer_pointer;
/* 2612 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 2613 */     GLChecks.ensureArrayVBOdisabled(caps);
/* 2614 */     BufferChecks.checkDirect(pointer);
/* 2615 */     (GLChecks.getReferences(caps)).GL11_glVertexPointer_pointer = pointer;
/* 2616 */     nglVertexPointer(size, 5130, stride, pointer, pointer.position() << 3, function_pointer);
/*      */   }
/*      */   public static void glVertexPointer(int size, int stride, FloatBuffer pointer) {
/* 2619 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 2620 */     long function_pointer = caps.GL11_glVertexPointer_pointer;
/* 2621 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 2622 */     GLChecks.ensureArrayVBOdisabled(caps);
/* 2623 */     BufferChecks.checkDirect(pointer);
/* 2624 */     (GLChecks.getReferences(caps)).GL11_glVertexPointer_pointer = pointer;
/* 2625 */     nglVertexPointer(size, 5126, stride, pointer, pointer.position() << 2, function_pointer);
/*      */   }
/*      */   public static void glVertexPointer(int size, int stride, IntBuffer pointer) {
/* 2628 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 2629 */     long function_pointer = caps.GL11_glVertexPointer_pointer;
/* 2630 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 2631 */     GLChecks.ensureArrayVBOdisabled(caps);
/* 2632 */     BufferChecks.checkDirect(pointer);
/* 2633 */     (GLChecks.getReferences(caps)).GL11_glVertexPointer_pointer = pointer;
/* 2634 */     nglVertexPointer(size, 5124, stride, pointer, pointer.position() << 2, function_pointer);
/*      */   }
/*      */   public static void glVertexPointer(int size, int stride, ShortBuffer pointer) {
/* 2637 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 2638 */     long function_pointer = caps.GL11_glVertexPointer_pointer;
/* 2639 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 2640 */     GLChecks.ensureArrayVBOdisabled(caps);
/* 2641 */     BufferChecks.checkDirect(pointer);
/* 2642 */     (GLChecks.getReferences(caps)).GL11_glVertexPointer_pointer = pointer;
/* 2643 */     nglVertexPointer(size, 5122, stride, pointer, pointer.position() << 1, function_pointer);
/*      */   }
/*      */   private static native void nglVertexPointer(int paramInt1, int paramInt2, int paramInt3, Buffer paramBuffer, int paramInt4, long paramLong);
/*      */   public static void glVertexPointer(int size, int type, int stride, long pointer_buffer_offset) {
/* 2647 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 2648 */     long function_pointer = caps.GL11_glVertexPointer_pointer;
/* 2649 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 2650 */     GLChecks.ensureArrayVBOenabled(caps);
/* 2651 */     nglVertexPointerBO(size, type, stride, pointer_buffer_offset, function_pointer);
/*      */   }
/*      */   private static native void nglVertexPointerBO(int paramInt1, int paramInt2, int paramInt3, long paramLong1, long paramLong2);
/*      */   
/*      */   public static void glVertex2f(float x, float y) {
/* 2656 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 2657 */     long function_pointer = caps.GL11_glVertex2f_pointer;
/* 2658 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 2659 */     nglVertex2f(x, y, function_pointer);
/*      */   }
/*      */   private static native void nglVertex2f(float paramFloat1, float paramFloat2, long paramLong);
/*      */   
/*      */   public static void glVertex2d(double x, double y) {
/* 2664 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 2665 */     long function_pointer = caps.GL11_glVertex2d_pointer;
/* 2666 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 2667 */     nglVertex2d(x, y, function_pointer);
/*      */   }
/*      */   private static native void nglVertex2d(double paramDouble1, double paramDouble2, long paramLong);
/*      */   
/*      */   public static void glVertex2i(int x, int y) {
/* 2672 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 2673 */     long function_pointer = caps.GL11_glVertex2i_pointer;
/* 2674 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 2675 */     nglVertex2i(x, y, function_pointer);
/*      */   }
/*      */   private static native void nglVertex2i(int paramInt1, int paramInt2, long paramLong);
/*      */   
/*      */   public static void glVertex3f(float x, float y, float z) {
/* 2680 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 2681 */     long function_pointer = caps.GL11_glVertex3f_pointer;
/* 2682 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 2683 */     nglVertex3f(x, y, z, function_pointer);
/*      */   }
/*      */   private static native void nglVertex3f(float paramFloat1, float paramFloat2, float paramFloat3, long paramLong);
/*      */   
/*      */   public static void glVertex3d(double x, double y, double z) {
/* 2688 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 2689 */     long function_pointer = caps.GL11_glVertex3d_pointer;
/* 2690 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 2691 */     nglVertex3d(x, y, z, function_pointer);
/*      */   }
/*      */   private static native void nglVertex3d(double paramDouble1, double paramDouble2, double paramDouble3, long paramLong);
/*      */   
/*      */   public static void glVertex3i(int x, int y, int z) {
/* 2696 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 2697 */     long function_pointer = caps.GL11_glVertex3i_pointer;
/* 2698 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 2699 */     nglVertex3i(x, y, z, function_pointer);
/*      */   }
/*      */   private static native void nglVertex3i(int paramInt1, int paramInt2, int paramInt3, long paramLong);
/*      */   
/*      */   public static void glVertex4f(float x, float y, float z, float w) {
/* 2704 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 2705 */     long function_pointer = caps.GL11_glVertex4f_pointer;
/* 2706 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 2707 */     nglVertex4f(x, y, z, w, function_pointer);
/*      */   }
/*      */   private static native void nglVertex4f(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, long paramLong);
/*      */   
/*      */   public static void glVertex4d(double x, double y, double z, double w) {
/* 2712 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 2713 */     long function_pointer = caps.GL11_glVertex4d_pointer;
/* 2714 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 2715 */     nglVertex4d(x, y, z, w, function_pointer);
/*      */   }
/*      */   private static native void nglVertex4d(double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, long paramLong);
/*      */   
/*      */   public static void glVertex4i(int x, int y, int z, int w) {
/* 2720 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 2721 */     long function_pointer = caps.GL11_glVertex4i_pointer;
/* 2722 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 2723 */     nglVertex4i(x, y, z, w, function_pointer);
/*      */   }
/*      */   private static native void nglVertex4i(int paramInt1, int paramInt2, int paramInt3, int paramInt4, long paramLong);
/*      */   
/*      */   public static void glTranslatef(float x, float y, float z) {
/* 2728 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 2729 */     long function_pointer = caps.GL11_glTranslatef_pointer;
/* 2730 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 2731 */     nglTranslatef(x, y, z, function_pointer);
/*      */   }
/*      */   private static native void nglTranslatef(float paramFloat1, float paramFloat2, float paramFloat3, long paramLong);
/*      */   
/*      */   public static void glTranslated(double x, double y, double z) {
/* 2736 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 2737 */     long function_pointer = caps.GL11_glTranslated_pointer;
/* 2738 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 2739 */     nglTranslated(x, y, z, function_pointer);
/*      */   }
/*      */   private static native void nglTranslated(double paramDouble1, double paramDouble2, double paramDouble3, long paramLong);
/*      */   
/*      */   public static void glTexImage1D(int target, int level, int internalformat, int width, int border, int format, int type, ByteBuffer pixels) {
/* 2744 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 2745 */     long function_pointer = caps.GL11_glTexImage1D_pointer;
/* 2746 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 2747 */     GLChecks.ensureUnpackPBOdisabled(caps);
/* 2748 */     if (pixels != null)
/* 2749 */       BufferChecks.checkBuffer(pixels, GLChecks.calculateTexImage1DStorage(pixels, format, type, width)); 
/* 2750 */     nglTexImage1D(target, level, internalformat, width, border, format, type, pixels, (pixels != null) ? pixels.position() : 0, function_pointer);
/*      */   }
/*      */   public static void glTexImage1D(int target, int level, int internalformat, int width, int border, int format, int type, DoubleBuffer pixels) {
/* 2753 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 2754 */     long function_pointer = caps.GL11_glTexImage1D_pointer;
/* 2755 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 2756 */     GLChecks.ensureUnpackPBOdisabled(caps);
/* 2757 */     if (pixels != null)
/* 2758 */       BufferChecks.checkBuffer(pixels, GLChecks.calculateTexImage1DStorage(pixels, format, type, width)); 
/* 2759 */     nglTexImage1D(target, level, internalformat, width, border, format, type, pixels, (pixels != null) ? (pixels.position() << 3) : 0, function_pointer);
/*      */   }
/*      */   public static void glTexImage1D(int target, int level, int internalformat, int width, int border, int format, int type, FloatBuffer pixels) {
/* 2762 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 2763 */     long function_pointer = caps.GL11_glTexImage1D_pointer;
/* 2764 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 2765 */     GLChecks.ensureUnpackPBOdisabled(caps);
/* 2766 */     if (pixels != null)
/* 2767 */       BufferChecks.checkBuffer(pixels, GLChecks.calculateTexImage1DStorage(pixels, format, type, width)); 
/* 2768 */     nglTexImage1D(target, level, internalformat, width, border, format, type, pixels, (pixels != null) ? (pixels.position() << 2) : 0, function_pointer);
/*      */   }
/*      */   public static void glTexImage1D(int target, int level, int internalformat, int width, int border, int format, int type, IntBuffer pixels) {
/* 2771 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 2772 */     long function_pointer = caps.GL11_glTexImage1D_pointer;
/* 2773 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 2774 */     GLChecks.ensureUnpackPBOdisabled(caps);
/* 2775 */     if (pixels != null)
/* 2776 */       BufferChecks.checkBuffer(pixels, GLChecks.calculateTexImage1DStorage(pixels, format, type, width)); 
/* 2777 */     nglTexImage1D(target, level, internalformat, width, border, format, type, pixels, (pixels != null) ? (pixels.position() << 2) : 0, function_pointer);
/*      */   }
/*      */   public static void glTexImage1D(int target, int level, int internalformat, int width, int border, int format, int type, ShortBuffer pixels) {
/* 2780 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 2781 */     long function_pointer = caps.GL11_glTexImage1D_pointer;
/* 2782 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 2783 */     GLChecks.ensureUnpackPBOdisabled(caps);
/* 2784 */     if (pixels != null)
/* 2785 */       BufferChecks.checkBuffer(pixels, GLChecks.calculateTexImage1DStorage(pixels, format, type, width)); 
/* 2786 */     nglTexImage1D(target, level, internalformat, width, border, format, type, pixels, (pixels != null) ? (pixels.position() << 1) : 0, function_pointer);
/*      */   }
/*      */   private static native void nglTexImage1D(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, Buffer paramBuffer, int paramInt8, long paramLong);
/*      */   public static void glTexImage1D(int target, int level, int internalformat, int width, int border, int format, int type, long pixels_buffer_offset) {
/* 2790 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 2791 */     long function_pointer = caps.GL11_glTexImage1D_pointer;
/* 2792 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 2793 */     GLChecks.ensureUnpackPBOenabled(caps);
/* 2794 */     nglTexImage1DBO(target, level, internalformat, width, border, format, type, pixels_buffer_offset, function_pointer);
/*      */   }
/*      */   private static native void nglTexImage1DBO(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, long paramLong1, long paramLong2);
/*      */   
/*      */   public static void glTexImage2D(int target, int level, int internalformat, int width, int height, int border, int format, int type, ByteBuffer pixels) {
/* 2799 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 2800 */     long function_pointer = caps.GL11_glTexImage2D_pointer;
/* 2801 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 2802 */     GLChecks.ensureUnpackPBOdisabled(caps);
/* 2803 */     if (pixels != null)
/* 2804 */       BufferChecks.checkBuffer(pixels, GLChecks.calculateTexImage2DStorage(pixels, format, type, width, height)); 
/* 2805 */     nglTexImage2D(target, level, internalformat, width, height, border, format, type, pixels, (pixels != null) ? pixels.position() : 0, function_pointer);
/*      */   }
/*      */   public static void glTexImage2D(int target, int level, int internalformat, int width, int height, int border, int format, int type, DoubleBuffer pixels) {
/* 2808 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 2809 */     long function_pointer = caps.GL11_glTexImage2D_pointer;
/* 2810 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 2811 */     GLChecks.ensureUnpackPBOdisabled(caps);
/* 2812 */     if (pixels != null)
/* 2813 */       BufferChecks.checkBuffer(pixels, GLChecks.calculateTexImage2DStorage(pixels, format, type, width, height)); 
/* 2814 */     nglTexImage2D(target, level, internalformat, width, height, border, format, type, pixels, (pixels != null) ? (pixels.position() << 3) : 0, function_pointer);
/*      */   }
/*      */   public static void glTexImage2D(int target, int level, int internalformat, int width, int height, int border, int format, int type, FloatBuffer pixels) {
/* 2817 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 2818 */     long function_pointer = caps.GL11_glTexImage2D_pointer;
/* 2819 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 2820 */     GLChecks.ensureUnpackPBOdisabled(caps);
/* 2821 */     if (pixels != null)
/* 2822 */       BufferChecks.checkBuffer(pixels, GLChecks.calculateTexImage2DStorage(pixels, format, type, width, height)); 
/* 2823 */     nglTexImage2D(target, level, internalformat, width, height, border, format, type, pixels, (pixels != null) ? (pixels.position() << 2) : 0, function_pointer);
/*      */   }
/*      */   public static void glTexImage2D(int target, int level, int internalformat, int width, int height, int border, int format, int type, IntBuffer pixels) {
/* 2826 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 2827 */     long function_pointer = caps.GL11_glTexImage2D_pointer;
/* 2828 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 2829 */     GLChecks.ensureUnpackPBOdisabled(caps);
/* 2830 */     if (pixels != null)
/* 2831 */       BufferChecks.checkBuffer(pixels, GLChecks.calculateTexImage2DStorage(pixels, format, type, width, height)); 
/* 2832 */     nglTexImage2D(target, level, internalformat, width, height, border, format, type, pixels, (pixels != null) ? (pixels.position() << 2) : 0, function_pointer);
/*      */   }
/*      */   public static void glTexImage2D(int target, int level, int internalformat, int width, int height, int border, int format, int type, ShortBuffer pixels) {
/* 2835 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 2836 */     long function_pointer = caps.GL11_glTexImage2D_pointer;
/* 2837 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 2838 */     GLChecks.ensureUnpackPBOdisabled(caps);
/* 2839 */     if (pixels != null)
/* 2840 */       BufferChecks.checkBuffer(pixels, GLChecks.calculateTexImage2DStorage(pixels, format, type, width, height)); 
/* 2841 */     nglTexImage2D(target, level, internalformat, width, height, border, format, type, pixels, (pixels != null) ? (pixels.position() << 1) : 0, function_pointer);
/*      */   }
/*      */   private static native void nglTexImage2D(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, Buffer paramBuffer, int paramInt9, long paramLong);
/*      */   public static void glTexImage2D(int target, int level, int internalformat, int width, int height, int border, int format, int type, long pixels_buffer_offset) {
/* 2845 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 2846 */     long function_pointer = caps.GL11_glTexImage2D_pointer;
/* 2847 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 2848 */     GLChecks.ensureUnpackPBOenabled(caps);
/* 2849 */     nglTexImage2DBO(target, level, internalformat, width, height, border, format, type, pixels_buffer_offset, function_pointer);
/*      */   }
/*      */   private static native void nglTexImage2DBO(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, long paramLong1, long paramLong2);
/*      */   
/*      */   public static void glTexSubImage1D(int target, int level, int xoffset, int width, int format, int type, ByteBuffer pixels) {
/* 2854 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 2855 */     long function_pointer = caps.GL11_glTexSubImage1D_pointer;
/* 2856 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 2857 */     GLChecks.ensureUnpackPBOdisabled(caps);
/* 2858 */     BufferChecks.checkBuffer(pixels, GLChecks.calculateImageStorage(pixels, format, type, width, 1, 1));
/* 2859 */     nglTexSubImage1D(target, level, xoffset, width, format, type, pixels, pixels.position(), function_pointer);
/*      */   }
/*      */   public static void glTexSubImage1D(int target, int level, int xoffset, int width, int format, int type, DoubleBuffer pixels) {
/* 2862 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 2863 */     long function_pointer = caps.GL11_glTexSubImage1D_pointer;
/* 2864 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 2865 */     GLChecks.ensureUnpackPBOdisabled(caps);
/* 2866 */     BufferChecks.checkBuffer(pixels, GLChecks.calculateImageStorage(pixels, format, type, width, 1, 1));
/* 2867 */     nglTexSubImage1D(target, level, xoffset, width, format, type, pixels, pixels.position() << 3, function_pointer);
/*      */   }
/*      */   public static void glTexSubImage1D(int target, int level, int xoffset, int width, int format, int type, FloatBuffer pixels) {
/* 2870 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 2871 */     long function_pointer = caps.GL11_glTexSubImage1D_pointer;
/* 2872 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 2873 */     GLChecks.ensureUnpackPBOdisabled(caps);
/* 2874 */     BufferChecks.checkBuffer(pixels, GLChecks.calculateImageStorage(pixels, format, type, width, 1, 1));
/* 2875 */     nglTexSubImage1D(target, level, xoffset, width, format, type, pixels, pixels.position() << 2, function_pointer);
/*      */   }
/*      */   public static void glTexSubImage1D(int target, int level, int xoffset, int width, int format, int type, IntBuffer pixels) {
/* 2878 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 2879 */     long function_pointer = caps.GL11_glTexSubImage1D_pointer;
/* 2880 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 2881 */     GLChecks.ensureUnpackPBOdisabled(caps);
/* 2882 */     BufferChecks.checkBuffer(pixels, GLChecks.calculateImageStorage(pixels, format, type, width, 1, 1));
/* 2883 */     nglTexSubImage1D(target, level, xoffset, width, format, type, pixels, pixels.position() << 2, function_pointer);
/*      */   }
/*      */   public static void glTexSubImage1D(int target, int level, int xoffset, int width, int format, int type, ShortBuffer pixels) {
/* 2886 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 2887 */     long function_pointer = caps.GL11_glTexSubImage1D_pointer;
/* 2888 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 2889 */     GLChecks.ensureUnpackPBOdisabled(caps);
/* 2890 */     BufferChecks.checkBuffer(pixels, GLChecks.calculateImageStorage(pixels, format, type, width, 1, 1));
/* 2891 */     nglTexSubImage1D(target, level, xoffset, width, format, type, pixels, pixels.position() << 1, function_pointer);
/*      */   }
/*      */   private static native void nglTexSubImage1D(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, Buffer paramBuffer, int paramInt7, long paramLong);
/*      */   public static void glTexSubImage1D(int target, int level, int xoffset, int width, int format, int type, long pixels_buffer_offset) {
/* 2895 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 2896 */     long function_pointer = caps.GL11_glTexSubImage1D_pointer;
/* 2897 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 2898 */     GLChecks.ensureUnpackPBOenabled(caps);
/* 2899 */     nglTexSubImage1DBO(target, level, xoffset, width, format, type, pixels_buffer_offset, function_pointer);
/*      */   }
/*      */   private static native void nglTexSubImage1DBO(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, long paramLong1, long paramLong2);
/*      */   
/*      */   public static void glTexSubImage2D(int target, int level, int xoffset, int yoffset, int width, int height, int format, int type, ByteBuffer pixels) {
/* 2904 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 2905 */     long function_pointer = caps.GL11_glTexSubImage2D_pointer;
/* 2906 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 2907 */     GLChecks.ensureUnpackPBOdisabled(caps);
/* 2908 */     BufferChecks.checkBuffer(pixels, GLChecks.calculateImageStorage(pixels, format, type, width, height, 1));
/* 2909 */     nglTexSubImage2D(target, level, xoffset, yoffset, width, height, format, type, pixels, pixels.position(), function_pointer);
/*      */   }
/*      */   public static void glTexSubImage2D(int target, int level, int xoffset, int yoffset, int width, int height, int format, int type, DoubleBuffer pixels) {
/* 2912 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 2913 */     long function_pointer = caps.GL11_glTexSubImage2D_pointer;
/* 2914 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 2915 */     GLChecks.ensureUnpackPBOdisabled(caps);
/* 2916 */     BufferChecks.checkBuffer(pixels, GLChecks.calculateImageStorage(pixels, format, type, width, height, 1));
/* 2917 */     nglTexSubImage2D(target, level, xoffset, yoffset, width, height, format, type, pixels, pixels.position() << 3, function_pointer);
/*      */   }
/*      */   public static void glTexSubImage2D(int target, int level, int xoffset, int yoffset, int width, int height, int format, int type, FloatBuffer pixels) {
/* 2920 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 2921 */     long function_pointer = caps.GL11_glTexSubImage2D_pointer;
/* 2922 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 2923 */     GLChecks.ensureUnpackPBOdisabled(caps);
/* 2924 */     BufferChecks.checkBuffer(pixels, GLChecks.calculateImageStorage(pixels, format, type, width, height, 1));
/* 2925 */     nglTexSubImage2D(target, level, xoffset, yoffset, width, height, format, type, pixels, pixels.position() << 2, function_pointer);
/*      */   }
/*      */   public static void glTexSubImage2D(int target, int level, int xoffset, int yoffset, int width, int height, int format, int type, IntBuffer pixels) {
/* 2928 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 2929 */     long function_pointer = caps.GL11_glTexSubImage2D_pointer;
/* 2930 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 2931 */     GLChecks.ensureUnpackPBOdisabled(caps);
/* 2932 */     BufferChecks.checkBuffer(pixels, GLChecks.calculateImageStorage(pixels, format, type, width, height, 1));
/* 2933 */     nglTexSubImage2D(target, level, xoffset, yoffset, width, height, format, type, pixels, pixels.position() << 2, function_pointer);
/*      */   }
/*      */   public static void glTexSubImage2D(int target, int level, int xoffset, int yoffset, int width, int height, int format, int type, ShortBuffer pixels) {
/* 2936 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 2937 */     long function_pointer = caps.GL11_glTexSubImage2D_pointer;
/* 2938 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 2939 */     GLChecks.ensureUnpackPBOdisabled(caps);
/* 2940 */     BufferChecks.checkBuffer(pixels, GLChecks.calculateImageStorage(pixels, format, type, width, height, 1));
/* 2941 */     nglTexSubImage2D(target, level, xoffset, yoffset, width, height, format, type, pixels, pixels.position() << 1, function_pointer);
/*      */   }
/*      */   private static native void nglTexSubImage2D(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, Buffer paramBuffer, int paramInt9, long paramLong);
/*      */   public static void glTexSubImage2D(int target, int level, int xoffset, int yoffset, int width, int height, int format, int type, long pixels_buffer_offset) {
/* 2945 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 2946 */     long function_pointer = caps.GL11_glTexSubImage2D_pointer;
/* 2947 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 2948 */     GLChecks.ensureUnpackPBOenabled(caps);
/* 2949 */     nglTexSubImage2DBO(target, level, xoffset, yoffset, width, height, format, type, pixels_buffer_offset, function_pointer);
/*      */   }
/*      */   private static native void nglTexSubImage2DBO(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, long paramLong1, long paramLong2);
/*      */   
/*      */   public static void glTexParameterf(int target, int pname, float param) {
/* 2954 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 2955 */     long function_pointer = caps.GL11_glTexParameterf_pointer;
/* 2956 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 2957 */     nglTexParameterf(target, pname, param, function_pointer);
/*      */   }
/*      */   private static native void nglTexParameterf(int paramInt1, int paramInt2, float paramFloat, long paramLong);
/*      */   
/*      */   public static void glTexParameteri(int target, int pname, int param) {
/* 2962 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 2963 */     long function_pointer = caps.GL11_glTexParameteri_pointer;
/* 2964 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 2965 */     nglTexParameteri(target, pname, param, function_pointer);
/*      */   }
/*      */   private static native void nglTexParameteri(int paramInt1, int paramInt2, int paramInt3, long paramLong);
/*      */   
/*      */   public static void glTexParameter(int target, int pname, FloatBuffer param) {
/* 2970 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 2971 */     long function_pointer = caps.GL11_glTexParameterfv_pointer;
/* 2972 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 2973 */     BufferChecks.checkBuffer(param, 4);
/* 2974 */     nglTexParameterfv(target, pname, param, param.position(), function_pointer);
/*      */   }
/*      */   private static native void nglTexParameterfv(int paramInt1, int paramInt2, FloatBuffer paramFloatBuffer, int paramInt3, long paramLong);
/*      */   
/*      */   public static void glTexParameter(int target, int pname, IntBuffer param) {
/* 2979 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 2980 */     long function_pointer = caps.GL11_glTexParameteriv_pointer;
/* 2981 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 2982 */     BufferChecks.checkBuffer(param, 4);
/* 2983 */     nglTexParameteriv(target, pname, param, param.position(), function_pointer);
/*      */   }
/*      */   private static native void nglTexParameteriv(int paramInt1, int paramInt2, IntBuffer paramIntBuffer, int paramInt3, long paramLong);
/*      */   
/*      */   public static void glTexGenf(int coord, int pname, float param) {
/* 2988 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 2989 */     long function_pointer = caps.GL11_glTexGenf_pointer;
/* 2990 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 2991 */     nglTexGenf(coord, pname, param, function_pointer);
/*      */   }
/*      */   private static native void nglTexGenf(int paramInt1, int paramInt2, float paramFloat, long paramLong);
/*      */   
/*      */   public static void glTexGend(int coord, int pname, double param) {
/* 2996 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 2997 */     long function_pointer = caps.GL11_glTexGend_pointer;
/* 2998 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 2999 */     nglTexGend(coord, pname, param, function_pointer);
/*      */   }
/*      */   private static native void nglTexGend(int paramInt1, int paramInt2, double paramDouble, long paramLong);
/*      */   
/*      */   public static void glTexGen(int coord, int pname, FloatBuffer params) {
/* 3004 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 3005 */     long function_pointer = caps.GL11_glTexGenfv_pointer;
/* 3006 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 3007 */     BufferChecks.checkBuffer(params, 4);
/* 3008 */     nglTexGenfv(coord, pname, params, params.position(), function_pointer);
/*      */   }
/*      */   private static native void nglTexGenfv(int paramInt1, int paramInt2, FloatBuffer paramFloatBuffer, int paramInt3, long paramLong);
/*      */   
/*      */   public static void glTexGen(int coord, int pname, DoubleBuffer params) {
/* 3013 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 3014 */     long function_pointer = caps.GL11_glTexGendv_pointer;
/* 3015 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 3016 */     BufferChecks.checkBuffer(params, 4);
/* 3017 */     nglTexGendv(coord, pname, params, params.position(), function_pointer);
/*      */   }
/*      */   private static native void nglTexGendv(int paramInt1, int paramInt2, DoubleBuffer paramDoubleBuffer, int paramInt3, long paramLong);
/*      */   
/*      */   public static void glTexGeni(int coord, int pname, int param) {
/* 3022 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 3023 */     long function_pointer = caps.GL11_glTexGeni_pointer;
/* 3024 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 3025 */     nglTexGeni(coord, pname, param, function_pointer);
/*      */   }
/*      */   private static native void nglTexGeni(int paramInt1, int paramInt2, int paramInt3, long paramLong);
/*      */   
/*      */   public static void glTexGen(int coord, int pname, IntBuffer params) {
/* 3030 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 3031 */     long function_pointer = caps.GL11_glTexGeniv_pointer;
/* 3032 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 3033 */     BufferChecks.checkBuffer(params, 4);
/* 3034 */     nglTexGeniv(coord, pname, params, params.position(), function_pointer);
/*      */   }
/*      */   private static native void nglTexGeniv(int paramInt1, int paramInt2, IntBuffer paramIntBuffer, int paramInt3, long paramLong);
/*      */   
/*      */   public static void glTexEnvf(int target, int pname, float param) {
/* 3039 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 3040 */     long function_pointer = caps.GL11_glTexEnvf_pointer;
/* 3041 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 3042 */     nglTexEnvf(target, pname, param, function_pointer);
/*      */   }
/*      */   private static native void nglTexEnvf(int paramInt1, int paramInt2, float paramFloat, long paramLong);
/*      */   
/*      */   public static void glTexEnvi(int target, int pname, int param) {
/* 3047 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 3048 */     long function_pointer = caps.GL11_glTexEnvi_pointer;
/* 3049 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 3050 */     nglTexEnvi(target, pname, param, function_pointer);
/*      */   }
/*      */   private static native void nglTexEnvi(int paramInt1, int paramInt2, int paramInt3, long paramLong);
/*      */   
/*      */   public static void glTexEnv(int target, int pname, FloatBuffer params) {
/* 3055 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 3056 */     long function_pointer = caps.GL11_glTexEnvfv_pointer;
/* 3057 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 3058 */     BufferChecks.checkBuffer(params, 4);
/* 3059 */     nglTexEnvfv(target, pname, params, params.position(), function_pointer);
/*      */   }
/*      */   private static native void nglTexEnvfv(int paramInt1, int paramInt2, FloatBuffer paramFloatBuffer, int paramInt3, long paramLong);
/*      */   
/*      */   public static void glTexEnv(int target, int pname, IntBuffer params) {
/* 3064 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 3065 */     long function_pointer = caps.GL11_glTexEnviv_pointer;
/* 3066 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 3067 */     BufferChecks.checkBuffer(params, 4);
/* 3068 */     nglTexEnviv(target, pname, params, params.position(), function_pointer);
/*      */   }
/*      */   private static native void nglTexEnviv(int paramInt1, int paramInt2, IntBuffer paramIntBuffer, int paramInt3, long paramLong);
/*      */   
/*      */   public static void glTexCoordPointer(int size, int stride, DoubleBuffer pointer) {
/* 3073 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 3074 */     long function_pointer = caps.GL11_glTexCoordPointer_pointer;
/* 3075 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 3076 */     GLChecks.ensureArrayVBOdisabled(caps);
/* 3077 */     BufferChecks.checkDirect(pointer);
/* 3078 */     (GLChecks.getReferences(caps)).glTexCoordPointer_buffer[(GLChecks.getReferences(caps)).glClientActiveTexture] = pointer;
/* 3079 */     nglTexCoordPointer(size, 5130, stride, pointer, pointer.position() << 3, function_pointer);
/*      */   }
/*      */   public static void glTexCoordPointer(int size, int stride, FloatBuffer pointer) {
/* 3082 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 3083 */     long function_pointer = caps.GL11_glTexCoordPointer_pointer;
/* 3084 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 3085 */     GLChecks.ensureArrayVBOdisabled(caps);
/* 3086 */     BufferChecks.checkDirect(pointer);
/* 3087 */     (GLChecks.getReferences(caps)).glTexCoordPointer_buffer[(GLChecks.getReferences(caps)).glClientActiveTexture] = pointer;
/* 3088 */     nglTexCoordPointer(size, 5126, stride, pointer, pointer.position() << 2, function_pointer);
/*      */   }
/*      */   public static void glTexCoordPointer(int size, int stride, IntBuffer pointer) {
/* 3091 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 3092 */     long function_pointer = caps.GL11_glTexCoordPointer_pointer;
/* 3093 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 3094 */     GLChecks.ensureArrayVBOdisabled(caps);
/* 3095 */     BufferChecks.checkDirect(pointer);
/* 3096 */     (GLChecks.getReferences(caps)).glTexCoordPointer_buffer[(GLChecks.getReferences(caps)).glClientActiveTexture] = pointer;
/* 3097 */     nglTexCoordPointer(size, 5124, stride, pointer, pointer.position() << 2, function_pointer);
/*      */   }
/*      */   public static void glTexCoordPointer(int size, int stride, ShortBuffer pointer) {
/* 3100 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 3101 */     long function_pointer = caps.GL11_glTexCoordPointer_pointer;
/* 3102 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 3103 */     GLChecks.ensureArrayVBOdisabled(caps);
/* 3104 */     BufferChecks.checkDirect(pointer);
/* 3105 */     (GLChecks.getReferences(caps)).glTexCoordPointer_buffer[(GLChecks.getReferences(caps)).glClientActiveTexture] = pointer;
/* 3106 */     nglTexCoordPointer(size, 5122, stride, pointer, pointer.position() << 1, function_pointer);
/*      */   }
/*      */   private static native void nglTexCoordPointer(int paramInt1, int paramInt2, int paramInt3, Buffer paramBuffer, int paramInt4, long paramLong);
/*      */   public static void glTexCoordPointer(int size, int type, int stride, long pointer_buffer_offset) {
/* 3110 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 3111 */     long function_pointer = caps.GL11_glTexCoordPointer_pointer;
/* 3112 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 3113 */     GLChecks.ensureArrayVBOenabled(caps);
/* 3114 */     nglTexCoordPointerBO(size, type, stride, pointer_buffer_offset, function_pointer);
/*      */   }
/*      */   private static native void nglTexCoordPointerBO(int paramInt1, int paramInt2, int paramInt3, long paramLong1, long paramLong2);
/*      */   
/*      */   public static void glTexCoord1f(float s) {
/* 3119 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 3120 */     long function_pointer = caps.GL11_glTexCoord1f_pointer;
/* 3121 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 3122 */     nglTexCoord1f(s, function_pointer);
/*      */   }
/*      */   private static native void nglTexCoord1f(float paramFloat, long paramLong);
/*      */   
/*      */   public static void glTexCoord1d(double s) {
/* 3127 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 3128 */     long function_pointer = caps.GL11_glTexCoord1d_pointer;
/* 3129 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 3130 */     nglTexCoord1d(s, function_pointer);
/*      */   }
/*      */   private static native void nglTexCoord1d(double paramDouble, long paramLong);
/*      */   
/*      */   public static void glTexCoord2f(float s, float t) {
/* 3135 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 3136 */     long function_pointer = caps.GL11_glTexCoord2f_pointer;
/* 3137 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 3138 */     nglTexCoord2f(s, t, function_pointer);
/*      */   }
/*      */   private static native void nglTexCoord2f(float paramFloat1, float paramFloat2, long paramLong);
/*      */   
/*      */   public static void glTexCoord2d(double s, double t) {
/* 3143 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 3144 */     long function_pointer = caps.GL11_glTexCoord2d_pointer;
/* 3145 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 3146 */     nglTexCoord2d(s, t, function_pointer);
/*      */   }
/*      */   private static native void nglTexCoord2d(double paramDouble1, double paramDouble2, long paramLong);
/*      */   
/*      */   public static void glTexCoord3f(float s, float t, float r) {
/* 3151 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 3152 */     long function_pointer = caps.GL11_glTexCoord3f_pointer;
/* 3153 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 3154 */     nglTexCoord3f(s, t, r, function_pointer);
/*      */   }
/*      */   private static native void nglTexCoord3f(float paramFloat1, float paramFloat2, float paramFloat3, long paramLong);
/*      */   
/*      */   public static void glTexCoord3d(double s, double t, double r) {
/* 3159 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 3160 */     long function_pointer = caps.GL11_glTexCoord3d_pointer;
/* 3161 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 3162 */     nglTexCoord3d(s, t, r, function_pointer);
/*      */   }
/*      */   private static native void nglTexCoord3d(double paramDouble1, double paramDouble2, double paramDouble3, long paramLong);
/*      */   
/*      */   public static void glTexCoord4f(float s, float t, float r, float q) {
/* 3167 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 3168 */     long function_pointer = caps.GL11_glTexCoord4f_pointer;
/* 3169 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 3170 */     nglTexCoord4f(s, t, r, q, function_pointer);
/*      */   }
/*      */   private static native void nglTexCoord4f(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, long paramLong);
/*      */   
/*      */   public static void glTexCoord4d(double s, double t, double r, double q) {
/* 3175 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 3176 */     long function_pointer = caps.GL11_glTexCoord4d_pointer;
/* 3177 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 3178 */     nglTexCoord4d(s, t, r, q, function_pointer);
/*      */   }
/*      */   private static native void nglTexCoord4d(double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, long paramLong);
/*      */   
/*      */   public static void glStencilOp(int fail, int zfail, int zpass) {
/* 3183 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 3184 */     long function_pointer = caps.GL11_glStencilOp_pointer;
/* 3185 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 3186 */     nglStencilOp(fail, zfail, zpass, function_pointer);
/*      */   }
/*      */   private static native void nglStencilOp(int paramInt1, int paramInt2, int paramInt3, long paramLong);
/*      */   
/*      */   public static void glStencilMask(int mask) {
/* 3191 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 3192 */     long function_pointer = caps.GL11_glStencilMask_pointer;
/* 3193 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 3194 */     nglStencilMask(mask, function_pointer);
/*      */   }
/*      */   private static native void nglStencilMask(int paramInt, long paramLong);
/*      */   
/*      */   public static void glViewport(int x, int y, int width, int height) {
/* 3199 */     ContextCapabilities caps = GLContext.getCapabilities();
/* 3200 */     long function_pointer = caps.GL11_glViewport_pointer;
/* 3201 */     BufferChecks.checkFunctionAddress(function_pointer);
/* 3202 */     nglViewport(x, y, width, height, function_pointer);
/*      */   }
/*      */   
/*      */   private static native void nglViewport(int paramInt1, int paramInt2, int paramInt3, int paramInt4, long paramLong);
/*      */ }


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\org\lwjgl\opengl\GL11.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */