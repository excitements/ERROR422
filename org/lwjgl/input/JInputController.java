/*     */ package org.lwjgl.input;
/*     */ 
/*     */ import java.util.ArrayList;
/*     */ import net.java.games.input.Component;
/*     */ import net.java.games.input.Controller;
/*     */ import net.java.games.input.Event;
/*     */ import net.java.games.input.EventQueue;
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
/*     */ class JInputController
/*     */   implements Controller
/*     */ {
/*     */   private Controller target;
/*     */   private int index;
/*  52 */   private ArrayList buttons = new ArrayList();
/*     */   
/*  54 */   private ArrayList axes = new ArrayList();
/*     */   
/*  56 */   private ArrayList pov = new ArrayList();
/*     */   
/*     */   private boolean[] buttonState;
/*     */   
/*     */   private float[] povValues;
/*     */   
/*     */   private float[] axesValue;
/*     */   
/*     */   private float[] axesMax;
/*     */   
/*     */   private float[] deadZones;
/*     */   
/*  68 */   private int xaxis = -1;
/*     */   
/*  70 */   private int yaxis = -1;
/*     */   
/*  72 */   private int zaxis = -1;
/*     */   
/*  74 */   private int rxaxis = -1;
/*     */   
/*  76 */   private int ryaxis = -1;
/*     */   
/*  78 */   private int rzaxis = -1;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public JInputController(int index, Controller target) {
/*  88 */     this.target = target;
/*  89 */     this.index = index;
/*     */     
/*  91 */     Component[] sourceAxes = target.getComponents();
/*     */     
/*  93 */     for (int i = 0; i < sourceAxes.length; i++) {
/*  94 */       if (sourceAxes[i].getIdentifier() instanceof Component.Identifier.Button) {
/*  95 */         this.buttons.add(sourceAxes[i]);
/*  96 */       } else if (sourceAxes[i].getIdentifier().equals(Component.Identifier.Axis.POV)) {
/*  97 */         this.pov.add(sourceAxes[i]);
/*     */       } else {
/*  99 */         this.axes.add(sourceAxes[i]);
/*     */       } 
/*     */     } 
/*     */     
/* 103 */     this.buttonState = new boolean[this.buttons.size()];
/* 104 */     this.povValues = new float[this.pov.size()];
/* 105 */     this.axesValue = new float[this.axes.size()];
/* 106 */     int buttonsCount = 0;
/* 107 */     int axesCount = 0;
/*     */     
/*     */     int j;
/* 110 */     for (j = 0; j < sourceAxes.length; j++) {
/* 111 */       if (sourceAxes[j].getIdentifier() instanceof Component.Identifier.Button) {
/* 112 */         this.buttonState[buttonsCount] = (sourceAxes[j].getPollData() != 0.0F);
/* 113 */         buttonsCount++;
/* 114 */       } else if (!sourceAxes[j].getIdentifier().equals(Component.Identifier.Axis.POV)) {
/*     */ 
/*     */ 
/*     */         
/* 118 */         this.axesValue[axesCount] = sourceAxes[j].getPollData();
/* 119 */         if (sourceAxes[j].getIdentifier().equals(Component.Identifier.Axis.X)) {
/* 120 */           this.xaxis = axesCount;
/*     */         }
/* 122 */         if (sourceAxes[j].getIdentifier().equals(Component.Identifier.Axis.Y)) {
/* 123 */           this.yaxis = axesCount;
/*     */         }
/* 125 */         if (sourceAxes[j].getIdentifier().equals(Component.Identifier.Axis.Z)) {
/* 126 */           this.zaxis = axesCount;
/*     */         }
/* 128 */         if (sourceAxes[j].getIdentifier().equals(Component.Identifier.Axis.RX)) {
/* 129 */           this.rxaxis = axesCount;
/*     */         }
/* 131 */         if (sourceAxes[j].getIdentifier().equals(Component.Identifier.Axis.RY)) {
/* 132 */           this.ryaxis = axesCount;
/*     */         }
/* 134 */         if (sourceAxes[j].getIdentifier().equals(Component.Identifier.Axis.RZ)) {
/* 135 */           this.rzaxis = axesCount;
/*     */         }
/*     */         
/* 138 */         axesCount++;
/*     */       } 
/*     */     } 
/*     */     
/* 142 */     this.axesMax = new float[this.axes.size()];
/* 143 */     this.deadZones = new float[this.axes.size()];
/*     */     
/* 145 */     for (j = 0; j < this.axesMax.length; j++) {
/* 146 */       this.axesMax[j] = 1.0F;
/* 147 */       this.deadZones[j] = 0.05F;
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getName() {
/* 155 */     String name = this.target.getName();
/* 156 */     return name;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getIndex() {
/* 163 */     return this.index;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getButtonCount() {
/* 170 */     return this.buttons.size();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getButtonName(int index) {
/* 177 */     Component button = this.buttons.get(index);
/*     */     
/* 179 */     return button.getName();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean isButtonPressed(int index) {
/* 186 */     return this.buttonState[index];
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void poll() {
/* 193 */     this.target.poll();
/*     */     
/* 195 */     Event event = new Event();
/* 196 */     EventQueue queue = this.target.getEventQueue();
/*     */     
/* 198 */     while (queue.getNextEvent(event)) {
/*     */       
/* 200 */       if (this.buttons.contains(event.getComponent())) {
/* 201 */         Component button = event.getComponent();
/* 202 */         int buttonIndex = this.buttons.indexOf(button);
/* 203 */         this.buttonState[buttonIndex] = (event.getValue() != 0.0F);
/*     */ 
/*     */         
/* 206 */         Controllers.addEvent(new ControllerEvent(this, event.getNanos(), 1, buttonIndex, false, false));
/*     */       } 
/*     */ 
/*     */       
/* 210 */       if (this.pov.contains(event.getComponent())) {
/* 211 */         Component povComponent = event.getComponent();
/* 212 */         int povIndex = this.pov.indexOf(povComponent);
/* 213 */         float prevX = getPovX();
/* 214 */         float prevY = getPovY();
/* 215 */         this.povValues[povIndex] = event.getValue();
/*     */         
/* 217 */         if (prevX != getPovX()) {
/* 218 */           Controllers.addEvent(new ControllerEvent(this, event.getNanos(), 3, 0, false, false));
/*     */         }
/* 220 */         if (prevY != getPovY()) {
/* 221 */           Controllers.addEvent(new ControllerEvent(this, event.getNanos(), 4, 0, false, false));
/*     */         }
/*     */       } 
/*     */ 
/*     */       
/* 226 */       if (this.axes.contains(event.getComponent())) {
/* 227 */         Component axis = event.getComponent();
/* 228 */         int axisIndex = this.axes.indexOf(axis);
/* 229 */         float value = axis.getPollData();
/*     */ 
/*     */         
/* 232 */         if (Math.abs(value) < this.deadZones[axisIndex]) {
/* 233 */           value = 0.0F;
/*     */         }
/* 235 */         if (Math.abs(value) < axis.getDeadZone()) {
/* 236 */           value = 0.0F;
/*     */         }
/* 238 */         if (Math.abs(value) > this.axesMax[axisIndex]) {
/* 239 */           this.axesMax[axisIndex] = Math.abs(value);
/*     */         }
/*     */ 
/*     */         
/* 243 */         value /= this.axesMax[axisIndex];
/*     */         
/* 245 */         Controllers.addEvent(new ControllerEvent(this, event.getNanos(), 2, axisIndex, (axisIndex == this.xaxis), (axisIndex == this.yaxis)));
/*     */         
/* 247 */         this.axesValue[axisIndex] = value;
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getAxisCount() {
/* 256 */     return this.axes.size();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getAxisName(int index) {
/* 263 */     Component axis = this.axes.get(index);
/*     */     
/* 265 */     return axis.getName();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public float getAxisValue(int index) {
/* 272 */     return this.axesValue[index];
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public float getXAxisValue() {
/* 279 */     if (this.xaxis == -1) {
/* 280 */       return 0.0F;
/*     */     }
/*     */     
/* 283 */     return getAxisValue(this.xaxis);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public float getYAxisValue() {
/* 290 */     if (this.yaxis == -1) {
/* 291 */       return 0.0F;
/*     */     }
/*     */     
/* 294 */     return getAxisValue(this.yaxis);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public float getXAxisDeadZone() {
/* 301 */     if (this.xaxis == -1) {
/* 302 */       return 0.0F;
/*     */     }
/*     */     
/* 305 */     return getDeadZone(this.xaxis);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public float getYAxisDeadZone() {
/* 312 */     if (this.yaxis == -1) {
/* 313 */       return 0.0F;
/*     */     }
/*     */     
/* 316 */     return getDeadZone(this.yaxis);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setXAxisDeadZone(float zone) {
/* 323 */     setDeadZone(this.xaxis, zone);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setYAxisDeadZone(float zone) {
/* 330 */     setDeadZone(this.yaxis, zone);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public float getDeadZone(int index) {
/* 337 */     return this.deadZones[index];
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setDeadZone(int index, float zone) {
/* 344 */     this.deadZones[index] = zone;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public float getZAxisValue() {
/* 351 */     if (this.zaxis == -1) {
/* 352 */       return 0.0F;
/*     */     }
/*     */     
/* 355 */     return getAxisValue(this.zaxis);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public float getZAxisDeadZone() {
/* 362 */     if (this.zaxis == -1) {
/* 363 */       return 0.0F;
/*     */     }
/*     */     
/* 366 */     return getDeadZone(this.zaxis);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setZAxisDeadZone(float zone) {
/* 373 */     setDeadZone(this.zaxis, zone);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public float getRXAxisValue() {
/* 380 */     if (this.rxaxis == -1) {
/* 381 */       return 0.0F;
/*     */     }
/*     */     
/* 384 */     return getAxisValue(this.rxaxis);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public float getRXAxisDeadZone() {
/* 391 */     if (this.rxaxis == -1) {
/* 392 */       return 0.0F;
/*     */     }
/*     */     
/* 395 */     return getDeadZone(this.rxaxis);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setRXAxisDeadZone(float zone) {
/* 402 */     setDeadZone(this.rxaxis, zone);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public float getRYAxisValue() {
/* 409 */     if (this.ryaxis == -1) {
/* 410 */       return 0.0F;
/*     */     }
/*     */     
/* 413 */     return getAxisValue(this.ryaxis);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public float getRYAxisDeadZone() {
/* 420 */     if (this.ryaxis == -1) {
/* 421 */       return 0.0F;
/*     */     }
/*     */     
/* 424 */     return getDeadZone(this.ryaxis);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setRYAxisDeadZone(float zone) {
/* 431 */     setDeadZone(this.ryaxis, zone);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public float getRZAxisValue() {
/* 438 */     if (this.rzaxis == -1) {
/* 439 */       return 0.0F;
/*     */     }
/*     */     
/* 442 */     return getAxisValue(this.rzaxis);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public float getRZAxisDeadZone() {
/* 449 */     if (this.rzaxis == -1) {
/* 450 */       return 0.0F;
/*     */     }
/*     */     
/* 453 */     return getDeadZone(this.rzaxis);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setRZAxisDeadZone(float zone) {
/* 460 */     setDeadZone(this.rzaxis, zone);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public float getPovX() {
/* 467 */     if (this.pov.size() == 0) {
/* 468 */       return 0.0F;
/*     */     }
/*     */     
/* 471 */     float value = this.povValues[0];
/*     */     
/* 473 */     if (value == 0.875F || value == 0.125F || value == 1.0F)
/*     */     {
/*     */       
/* 476 */       return -1.0F;
/*     */     }
/* 478 */     if (value == 0.625F || value == 0.375F || value == 0.5F)
/*     */     {
/*     */       
/* 481 */       return 1.0F;
/*     */     }
/*     */     
/* 484 */     return 0.0F;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public float getPovY() {
/* 491 */     if (this.pov.size() == 0) {
/* 492 */       return 0.0F;
/*     */     }
/*     */     
/* 495 */     float value = this.povValues[0];
/*     */     
/* 497 */     if (value == 0.875F || value == 0.625F || value == 0.75F)
/*     */     {
/*     */       
/* 500 */       return 1.0F;
/*     */     }
/* 502 */     if (value == 0.125F || value == 0.375F || value == 0.25F)
/*     */     {
/*     */       
/* 505 */       return -1.0F;
/*     */     }
/*     */     
/* 508 */     return 0.0F;
/*     */   }
/*     */ }


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\org\lwjgl\input\JInputController.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */