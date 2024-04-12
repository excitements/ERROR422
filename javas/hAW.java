import java.nio.FloatBuffer;
import org.lwjgl.opengl.GL11;

public class hAW extends DOP {
  private FloatBuffer bzF = pZS.Dne(16);
  
  private static hAW Dne = new hAW();
  
  private FloatBuffer Dne = pZS.Dne(16);
  
  private FloatBuffer FWm = pZS.Dne(16);
  
  public static DOP Dne() {
    Dne.Dne();
    return (DOP)Dne;
  }
  
  private void Dne(float[][] paramArrayOffloat, int paramInt) {
    float f = geR.bzF(paramArrayOffloat[paramInt][0] * paramArrayOffloat[paramInt][0] + paramArrayOffloat[paramInt][1] * paramArrayOffloat[paramInt][1] + paramArrayOffloat[paramInt][2] * paramArrayOffloat[paramInt][2]);
    paramArrayOffloat[paramInt][0] = paramArrayOffloat[paramInt][0] / f;
    paramArrayOffloat[paramInt][1] = paramArrayOffloat[paramInt][1] / f;
    paramArrayOffloat[paramInt][2] = paramArrayOffloat[paramInt][2] / f;
    paramArrayOffloat[paramInt][3] = paramArrayOffloat[paramInt][3] / f;
  }
  
  private void Dne() {
    this.Dne.clear();
    this.FWm.clear();
    this.bzF.clear();
    GL11.glGetFloat(2983, this.Dne);
    GL11.glGetFloat(2982, this.FWm);
    this.Dne.flip().limit(16);
    this.Dne.get((float[])this.Dne);
    this.FWm.flip().limit(16);
    this.FWm.get((float[])this.FWm);
    this.bzF[0] = this.FWm[0] * this.Dne[0] + this.FWm[1] * this.Dne[4] + this.FWm[2] * this.Dne[8] + this.FWm[3] * this.Dne[12];
    this.bzF[1] = this.FWm[0] * this.Dne[1] + this.FWm[1] * this.Dne[5] + this.FWm[2] * this.Dne[9] + this.FWm[3] * this.Dne[13];
    this.bzF[2] = this.FWm[0] * this.Dne[2] + this.FWm[1] * this.Dne[6] + this.FWm[2] * this.Dne[10] + this.FWm[3] * this.Dne[14];
    this.bzF[3] = this.FWm[0] * this.Dne[3] + this.FWm[1] * this.Dne[7] + this.FWm[2] * this.Dne[11] + this.FWm[3] * this.Dne[15];
    this.bzF[4] = this.FWm[4] * this.Dne[0] + this.FWm[5] * this.Dne[4] + this.FWm[6] * this.Dne[8] + this.FWm[7] * this.Dne[12];
    this.bzF[5] = this.FWm[4] * this.Dne[1] + this.FWm[5] * this.Dne[5] + this.FWm[6] * this.Dne[9] + this.FWm[7] * this.Dne[13];
    this.bzF[6] = this.FWm[4] * this.Dne[2] + this.FWm[5] * this.Dne[6] + this.FWm[6] * this.Dne[10] + this.FWm[7] * this.Dne[14];
    this.bzF[7] = this.FWm[4] * this.Dne[3] + this.FWm[5] * this.Dne[7] + this.FWm[6] * this.Dne[11] + this.FWm[7] * this.Dne[15];
    this.bzF[8] = this.FWm[8] * this.Dne[0] + this.FWm[9] * this.Dne[4] + this.FWm[10] * this.Dne[8] + this.FWm[11] * this.Dne[12];
    this.bzF[9] = this.FWm[8] * this.Dne[1] + this.FWm[9] * this.Dne[5] + this.FWm[10] * this.Dne[9] + this.FWm[11] * this.Dne[13];
    this.bzF[10] = this.FWm[8] * this.Dne[2] + this.FWm[9] * this.Dne[6] + this.FWm[10] * this.Dne[10] + this.FWm[11] * this.Dne[14];
    this.bzF[11] = this.FWm[8] * this.Dne[3] + this.FWm[9] * this.Dne[7] + this.FWm[10] * this.Dne[11] + this.FWm[11] * this.Dne[15];
    this.bzF[12] = this.FWm[12] * this.Dne[0] + this.FWm[13] * this.Dne[4] + this.FWm[14] * this.Dne[8] + this.FWm[15] * this.Dne[12];
    this.bzF[13] = this.FWm[12] * this.Dne[1] + this.FWm[13] * this.Dne[5] + this.FWm[14] * this.Dne[9] + this.FWm[15] * this.Dne[13];
    this.bzF[14] = this.FWm[12] * this.Dne[2] + this.FWm[13] * this.Dne[6] + this.FWm[14] * this.Dne[10] + this.FWm[15] * this.Dne[14];
    this.bzF[15] = this.FWm[12] * this.Dne[3] + this.FWm[13] * this.Dne[7] + this.FWm[14] * this.Dne[11] + this.FWm[15] * this.Dne[15];
    this.Dne[0][0] = this.bzF[3] - this.bzF[0];
    this.Dne[0][1] = this.bzF[7] - this.bzF[4];
    this.Dne[0][2] = this.bzF[11] - this.bzF[8];
    this.Dne[0][3] = this.bzF[15] - this.bzF[12];
    Dne((float[][])this.Dne, 0);
    this.Dne[1][0] = this.bzF[3] + this.bzF[0];
    this.Dne[1][1] = this.bzF[7] + this.bzF[4];
    this.Dne[1][2] = this.bzF[11] + this.bzF[8];
    this.Dne[1][3] = this.bzF[15] + this.bzF[12];
    Dne((float[][])this.Dne, 1);
    this.Dne[2][0] = this.bzF[3] + this.bzF[1];
    this.Dne[2][1] = this.bzF[7] + this.bzF[5];
    this.Dne[2][2] = this.bzF[11] + this.bzF[9];
    this.Dne[2][3] = this.bzF[15] + this.bzF[13];
    Dne((float[][])this.Dne, 2);
    this.Dne[3][0] = this.bzF[3] - this.bzF[1];
    this.Dne[3][1] = this.bzF[7] - this.bzF[5];
    this.Dne[3][2] = this.bzF[11] - this.bzF[9];
    this.Dne[3][3] = this.bzF[15] - this.bzF[13];
    Dne((float[][])this.Dne, 3);
    this.Dne[4][0] = this.bzF[3] - this.bzF[2];
    this.Dne[4][1] = this.bzF[7] - this.bzF[6];
    this.Dne[4][2] = this.bzF[11] - this.bzF[10];
    this.Dne[4][3] = this.bzF[15] - this.bzF[14];
    Dne((float[][])this.Dne, 4);
    this.Dne[5][0] = this.bzF[3] + this.bzF[2];
    this.Dne[5][1] = this.bzF[7] + this.bzF[6];
    this.Dne[5][2] = this.bzF[11] + this.bzF[10];
    this.Dne[5][3] = this.bzF[15] + this.bzF[14];
    Dne((float[][])this.Dne, 5);
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\hAW.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */