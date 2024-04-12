import java.awt.BorderLayout;
import java.awt.Canvas;
import java.io.File;
import net.minecraft.client.FWm;
import net.minecraft.client.Minecraft;

public class KNk extends Minecraft {
  final FWm Dne;
  
  public void Dne() {
    this.Dne = (FWm)Dne();
    this.Dne = (FWm)new fZI(this, (File)this.Dne);
    if (((fZI)this.Dne).zGp > null && ((fZI)this.Dne).aFZ && this.Dne.getParent() != null && this.Dne.getParent().getParent() != null)
      this.Dne.getParent().getParent().setSize(((fZI)this.Dne).aFZ, ((fZI)this.Dne).zGp); 
    super.Dne();
  }
  
  public KNk(FWm paramFWm1, Canvas paramCanvas, FWm paramFWm2, int paramInt1, int paramInt2, boolean paramBoolean) {
    super(paramCanvas, paramFWm2, paramInt1, paramInt2, paramBoolean);
    this.Dne = paramFWm1;
    QXI.Dne = (NMq)this.Dne;
  }
  
  public void Dne(McM paramMcM) {
    this.Dne.removeAll();
    this.Dne.setLayout(new BorderLayout());
    this.Dne.add(new cbQ(paramMcM), "Center");
    this.Dne.validate();
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\KNk.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */