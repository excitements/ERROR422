/*     */ package net.java.games.input;
/*     */ 
/*     */ import java.io.IOException;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ abstract class LinuxForceFeedbackEffect
/*     */   implements Rumbler
/*     */ {
/*     */   private final LinuxEventDevice device;
/*     */   private final int ff_id;
/*  36 */   private final WriteTask write_task = new WriteTask();
/*  37 */   private final UploadTask upload_task = new UploadTask();
/*     */   
/*     */   public LinuxForceFeedbackEffect(LinuxEventDevice device) throws IOException {
/*  40 */     this.device = device;
/*  41 */     this.ff_id = this.upload_task.doUpload(-1, 0.0F);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected final LinuxEventDevice getDevice() {
/*  47 */     return this.device;
/*     */   }
/*     */   
/*     */   public final synchronized void rumble(float intensity) {
/*     */     try {
/*  52 */       if (intensity > 0.0F) {
/*  53 */         this.upload_task.doUpload(this.ff_id, intensity);
/*  54 */         this.write_task.write(1);
/*     */       } else {
/*  56 */         this.write_task.write(0);
/*     */       } 
/*  58 */     } catch (IOException e) {
/*  59 */       LinuxEnvironmentPlugin.logln("Failed to rumble: " + e);
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public final String getAxisName() {
/*  73 */     return null;
/*     */   }
/*     */   
/*     */   public final Component.Identifier getAxisIdentifier() {
/*  77 */     return null;
/*     */   }
/*     */   protected abstract int upload(int paramInt, float paramFloat) throws IOException;
/*     */   
/*     */   private final class UploadTask extends LinuxDeviceTask { private int id;
/*     */     private float intensity;
/*     */     
/*     */     public final int doUpload(int id, float intensity) throws IOException {
/*  85 */       this.id = id;
/*  86 */       this.intensity = intensity;
/*  87 */       LinuxEnvironmentPlugin.execute(this);
/*  88 */       return this.id;
/*     */     } private final LinuxForceFeedbackEffect this$0;
/*     */     private UploadTask() {}
/*     */     protected final Object execute() throws IOException {
/*  92 */       this.id = LinuxForceFeedbackEffect.this.upload(this.id, this.intensity);
/*  93 */       return null;
/*     */     } }
/*     */   private final class WriteTask extends LinuxDeviceTask { private int value;
/*     */     private final LinuxForceFeedbackEffect this$0;
/*     */     
/*     */     private WriteTask() {}
/*     */     
/*     */     public final void write(int value) throws IOException {
/* 101 */       this.value = value;
/* 102 */       LinuxEnvironmentPlugin.execute(this);
/*     */     }
/*     */     
/*     */     protected final Object execute() throws IOException {
/* 106 */       LinuxForceFeedbackEffect.this.device.writeEvent(21, LinuxForceFeedbackEffect.this.ff_id, this.value);
/* 107 */       return null;
/*     */     } }
/*     */ 
/*     */ }


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\net\java\games\input\LinuxForceFeedbackEffect.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */