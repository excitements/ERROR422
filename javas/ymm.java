import net.minecraft.client.Minecraft;

public class ymm {
  public static void Dne(int paramInt1, int paramInt2) {
    ((Minecraft)QXI.Dne).Dne.Dne("§mMinecraft " + QXI.Dne + " §r§cERR422§r", 2, 2, 16777215);
    String str = "Copyright Mojang AB. §rDo not distribute!§r";
    ((Minecraft)QXI.Dne).Dne.Dne(str, paramInt1 - ((Minecraft)QXI.Dne).Dne.Dne(str) - 2, paramInt2 - 10, 16777215);
    sRv.Dne();
    if (QXI.Dne != null) {
      String[] arrayOfString = new String[13];
      arrayOfString[0] = "java.lang.NullPointerException";
      arrayOfString[1] = "updateRenderer(EntityRenderer.java:450)";
      arrayOfString[2] = "renderWorld(EntityRenderer.java:870)";
      arrayOfString[3] = "refreshTextures(RenderEngine.java:41)";
      arrayOfString[4] = "createTexture(RenderEngine.java:216)";
      arrayOfString[5] = "renderEntity(§k??????????§r.java:870)";
      arrayOfString[6] = "getTexture(RenderEngine.java:612)";
      arrayOfString[7] = "refreshTextureMaps(?.java:130)";
      arrayOfString[8] = "updateLightmap(EntityRenderer.java:582)";
      arrayOfString[9] = "updateCameraAndRender(EntityRenderer.java:135)";
      arrayOfString[10] = "Minecraft.runGameLoop(Minecraft.java:385)";
      arrayOfString[11] = "Minecraft.run(Minecraft.java:521)";
      arrayOfString[12] = "java.lang.Thread.run(Thread.java:048)";
      for (String str1 : arrayOfString)
        ((Minecraft)QXI.Dne).Dne.Dne(str1, eCD.Dne(paramInt1), eCD.Dne(paramInt2), 16711680); 
      for (byte b = 0; b < 60; b++)
        ((Minecraft)QXI.Dne).Dne.Dne("§k??????????§r(§k??????????§r.tmp:" + eCD.Dne(10000) + ")", eCD.Dne(paramInt1), eCD.Dne(paramInt2), 16711680); 
    } 
  }
  
  static {
  
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\ymm.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */