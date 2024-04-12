package paulscode.sound;

public class Vector3D {
  public float x = 0.0F;
  
  public float y = 0.0F;
  
  public float z = 0.0F;
  
  public Vector3D subtract(Vector3D paramVector3D1, Vector3D paramVector3D2) {
    return new Vector3D(paramVector3D1.x - paramVector3D2.x, paramVector3D1.y - paramVector3D2.y, paramVector3D1.z - paramVector3D2.z);
  }
  
  public float length() {
    return (float)Math.sqrt((this.x * this.x + this.y * this.y + this.z * this.z));
  }
  
  public Vector3D() {}
  
  public Vector3D subtract(Vector3D paramVector3D) {
    return new Vector3D(this.x - paramVector3D.x, this.y - paramVector3D.y, this.z - paramVector3D.z);
  }
  
  public Vector3D add(Vector3D paramVector3D) {
    return new Vector3D(this.x + paramVector3D.x, this.y + paramVector3D.y, this.z + paramVector3D.z);
  }
  
  public Vector3D add(Vector3D paramVector3D1, Vector3D paramVector3D2) {
    return new Vector3D(paramVector3D1.x + paramVector3D2.x, paramVector3D1.y + paramVector3D2.y, paramVector3D1.z + paramVector3D2.z);
  }
  
  public Vector3D(float paramFloat1, float paramFloat2, float paramFloat3) {}
  
  public Vector3D clone() {
    return new Vector3D(this.x, this.y, this.z);
  }
  
  public float dot(Vector3D paramVector3D1, Vector3D paramVector3D2) {
    return paramVector3D1.x * paramVector3D2.x + paramVector3D1.y * paramVector3D2.y + paramVector3D1.z * paramVector3D2.z;
  }
  
  public String toString() {
    return "Vector3D (" + this.x + ", " + this.y + ", " + this.z + ")";
  }
  
  public float dot(Vector3D paramVector3D) {
    return this.x * paramVector3D.x + this.y * paramVector3D.y + this.z * paramVector3D.z;
  }
  
  public Vector3D cross(Vector3D paramVector3D) {
    return new Vector3D(this.y * paramVector3D.z - paramVector3D.y * this.z, this.z * paramVector3D.x - paramVector3D.z * this.x, this.x * paramVector3D.y - paramVector3D.x * this.y);
  }
  
  public void normalize() {
    double d = Math.sqrt((this.x * this.x + this.y * this.y + this.z * this.z));
    this.x = (float)(this.x / d);
    this.y = (float)(this.y / d);
    this.z = (float)(this.z / d);
  }
  
  public Vector3D cross(Vector3D paramVector3D1, Vector3D paramVector3D2) {
    return new Vector3D(paramVector3D1.y * paramVector3D2.z - paramVector3D2.y * paramVector3D1.z, paramVector3D1.z * paramVector3D2.x - paramVector3D2.z * paramVector3D1.x, paramVector3D1.x * paramVector3D2.y - paramVector3D2.x * paramVector3D1.y);
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\paulscode\sound\Vector3D.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */