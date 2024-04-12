import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

public abstract class oNe {
  public static final String[] Dne = new String[] { 
      "END", "BYTE", "SHORT", "INT", "LONG", "FLOAT", "DOUBLE", "BYTE[]", "STRING", "LIST", 
      "COMPOUND", "INT[]" };
  
  private String Dne;
  
  abstract void Dne(DataInput paramDataInput);
  
  public int hashCode() {
    return this.Dne.hashCode() ^ Dne();
  }
  
  public String Dne() {
    return (this.Dne == null) ? "" : this.Dne;
  }
  
  public static oNe Dne(byte paramByte, String paramString) {
    switch (paramByte) {
      case 0:
        return new loG();
      case 1:
        return new bCM(paramString);
      case 2:
        return new phA(paramString);
      case 3:
        return new BYr(paramString);
      case 4:
        return new zCY(paramString);
      case 5:
        return new nOv(paramString);
      case 6:
        return new kJU(paramString);
      case 7:
        return new kfd(paramString);
      case 8:
        return new QNx(paramString);
      case 9:
        return new mbZ(paramString);
      case 10:
        return new WkD(paramString);
      case 11:
        return new xuY(paramString);
    } 
    return null;
  }
  
  public boolean equals(Object paramObject) {
    if (!(paramObject instanceof oNe))
      return false; 
    oNe oNe1 = (oNe)paramObject;
    return (Dne() != oNe1.Dne()) ? false : (((this.Dne != null || oNe1.Dne == null) && (this.Dne == null || oNe1.Dne != null)) ? ((this.Dne == null || this.Dne.equals(oNe1.Dne))) : false);
  }
  
  public oNe FWm(String paramString) {
    if (paramString == null) {
      this.Dne = "";
    } else {
      this.Dne = paramString;
    } 
    return this;
  }
  
  public static String Dne(byte paramByte) {
    switch (paramByte) {
      case 0:
        return "TAG_End";
      case 1:
        return "TAG_Byte";
      case 2:
        return "TAG_Short";
      case 3:
        return "TAG_Int";
      case 4:
        return "TAG_Long";
      case 5:
        return "TAG_Float";
      case 6:
        return "TAG_Double";
      case 7:
        return "TAG_Byte_Array";
      case 8:
        return "TAG_String";
      case 9:
        return "TAG_List";
      case 10:
        return "TAG_Compound";
      case 11:
        return "TAG_Int_Array";
    } 
    return "UNKNOWN";
  }
  
  public static void Dne(oNe paramoNe, DataOutput paramDataOutput) {
    paramDataOutput.writeByte(paramoNe.Dne());
    if (paramoNe.Dne() != 0) {
      paramDataOutput.writeUTF(paramoNe.Dne());
      paramoNe.Dne(paramDataOutput);
    } 
  }
  
  protected oNe(String paramString) {
    if (paramString == null) {
      this.Dne = "";
    } else {
      this.Dne = paramString;
    } 
  }
  
  public static oNe Dne(DataInput paramDataInput) {
    byte b = paramDataInput.readByte();
    if (b == 0)
      return new loG(); 
    String str = paramDataInput.readUTF();
    oNe oNe1 = Dne(b, str);
    try {
      oNe1.Dne(paramDataInput);
      return oNe1;
    } catch (IOException iOException) {
      McM mcM = McM.Dne(iOException, "Loading NBT data");
      Noo noo = mcM.Dne("NBT Tag");
      noo.Dne("Tag name", str);
      noo.Dne("Tag type", Byte.valueOf(b));
      throw new kaJ(mcM);
    } 
  }
  
  public abstract oNe Dne();
  
  abstract void Dne(DataOutput paramDataOutput);
  
  public abstract byte Dne();
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\oNe.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */