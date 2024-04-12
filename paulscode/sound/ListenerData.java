package paulscode.sound;

public class ListenerData {
  public Vector3D lookAt = new Vector3D(0.0F, 0.0F, -1.0F);
  
  public float angle = 0.0F;
  
  public Vector3D position = new Vector3D(0.0F, 0.0F, 0.0F);
  
  public Vector3D velocity = new Vector3D(0.0F, 0.0F, 0.0F);
  
  public Vector3D up = new Vector3D(0.0F, 1.0F, 0.0F);
  
  public void setVelocity(Vector3D paramVector3D) {
    this.velocity.x = paramVector3D.x;
    this.velocity.y = paramVector3D.y;
    this.velocity.z = paramVector3D.z;
  }
  
  public void setData(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6, float paramFloat7, float paramFloat8, float paramFloat9, float paramFloat10) {
    this.position.x = paramFloat1;
    this.position.y = paramFloat2;
    this.position.z = paramFloat3;
    this.lookAt.x = paramFloat4;
    this.lookAt.y = paramFloat5;
    this.lookAt.z = paramFloat6;
    this.up.x = paramFloat7;
    this.up.y = paramFloat8;
    this.up.z = paramFloat9;
    this.angle = paramFloat10;
  }
  
  public ListenerData() {
    this.angle = 0.0F;
  }
  
  public void setVelocity(float paramFloat1, float paramFloat2, float paramFloat3) {
    this.velocity.x = paramFloat1;
    this.velocity.y = paramFloat2;
    this.velocity.z = paramFloat3;
  }
  
  public ListenerData(Vector3D paramVector3D1, Vector3D paramVector3D2, Vector3D paramVector3D3, float paramFloat) {
    this.angle = paramFloat;
  }
  
  public ListenerData(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6, float paramFloat7, float paramFloat8, float paramFloat9, float paramFloat10) {
    this.angle = paramFloat10;
  }
  
  public void setOrientation(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6) {
    this.lookAt.x = paramFloat1;
    this.lookAt.y = paramFloat2;
    this.lookAt.z = paramFloat3;
    this.up.x = paramFloat4;
    this.up.y = paramFloat5;
    this.up.z = paramFloat6;
  }
  
  public void setPosition(float paramFloat1, float paramFloat2, float paramFloat3) {
    this.position.x = paramFloat1;
    this.position.y = paramFloat2;
    this.position.z = paramFloat3;
  }
  
  public void setPosition(Vector3D paramVector3D) {
    this.position.x = paramVector3D.x;
    this.position.y = paramVector3D.y;
    this.position.z = paramVector3D.z;
  }
  
  public void setAngle(float paramFloat) {
    this.angle = paramFloat;
    this.lookAt.x = -1.0F * (float)Math.sin(this.angle);
    this.lookAt.z = -1.0F * (float)Math.cos(this.angle);
  }
  
  public void setData(Vector3D paramVector3D1, Vector3D paramVector3D2, Vector3D paramVector3D3, float paramFloat) {
    this.position.x = paramVector3D1.x;
    this.position.y = paramVector3D1.y;
    this.position.z = paramVector3D1.z;
    this.lookAt.x = paramVector3D2.x;
    this.lookAt.y = paramVector3D2.y;
    this.lookAt.z = paramVector3D2.z;
    this.up.x = paramVector3D3.x;
    this.up.y = paramVector3D3.y;
    this.up.z = paramVector3D3.z;
    this.angle = paramFloat;
  }
  
  public void setOrientation(Vector3D paramVector3D1, Vector3D paramVector3D2) {
    this.lookAt.x = paramVector3D1.x;
    this.lookAt.y = paramVector3D1.y;
    this.lookAt.z = paramVector3D1.z;
    this.up.x = paramVector3D2.x;
    this.up.y = paramVector3D2.y;
    this.up.z = paramVector3D2.z;
  }
  
  public void setData(ListenerData paramListenerData) {
    this.position.x = paramListenerData.position.x;
    this.position.y = paramListenerData.position.y;
    this.position.z = paramListenerData.position.z;
    this.lookAt.x = paramListenerData.lookAt.x;
    this.lookAt.y = paramListenerData.lookAt.y;
    this.lookAt.z = paramListenerData.lookAt.z;
    this.up.x = paramListenerData.up.x;
    this.up.y = paramListenerData.up.y;
    this.up.z = paramListenerData.up.z;
    this.angle = paramListenerData.angle;
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\paulscode\sound\ListenerData.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */