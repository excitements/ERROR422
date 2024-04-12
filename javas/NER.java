import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.net.Socket;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public abstract class NER {
  public static long FWm;
  
  protected dLs Dne;
  
  private static Map Dne;
  
  private static Set Dne;
  
  public boolean Qnq = 0L;
  
  public static long bzF;
  
  public final long Dne = System.currentTimeMillis();
  
  public static ZGT Dne = new ZGT();
  
  public static long aFZ;
  
  private static Set FWm;
  
  public static long Qnq;
  
  public static byte[] Dne(DataInputStream paramDataInputStream) {
    short s = paramDataInputStream.readShort();
    if (s < 0)
      throw new IOException("Key was smaller than nothing!  Weird key!"); 
    byte[] arrayOfByte = new byte[s];
    paramDataInputStream.readFully(arrayOfByte);
    return arrayOfByte;
  }
  
  public abstract void Dne(DataOutputStream paramDataOutputStream);
  
  public static void Dne(DataOutputStream paramDataOutputStream, byte[] paramArrayOfbyte) {
    paramDataOutputStream.writeShort(paramArrayOfbyte.length);
    paramDataOutputStream.write(paramArrayOfbyte);
  }
  
  public abstract int Dne();
  
  public static NER Dne(dLs paramdLs, DataInputStream paramDataInputStream, boolean paramBoolean, Socket paramSocket) {
    int j;
    boolean bool = false;
    NER nER = null;
    int i = paramSocket.getSoTimeout();
    try {
      j = paramDataInputStream.read();
      if (j == -1)
        return null; 
      if ((paramBoolean && !FWm.contains(Integer.valueOf(j))) || (!paramBoolean && !Dne.contains(Integer.valueOf(j))))
        throw new IOException("Bad packet id " + j); 
      nER = Dne(paramdLs, j);
      if (nER == null)
        throw new IOException("Bad packet id " + j); 
      nER.Dne = (ZGT)paramdLs;
      if (nER instanceof prJ)
        paramSocket.setSoTimeout(1500); 
      nER.Dne(paramDataInputStream);
      FWm++;
      bzF += nER.Dne();
    } catch (EOFException eOFException) {
      paramdLs.bzF("Reached end of stream");
      return null;
    } 
    qXI.Dne(j, nER.Dne());
    FWm++;
    bzF += nER.Dne();
    paramSocket.setSoTimeout(i);
    return nER;
  }
  
  protected static void Dne(WkD paramWkD, DataOutputStream paramDataOutputStream) {
    if (paramWkD == null) {
      paramDataOutputStream.writeShort(-1);
    } else {
      byte[] arrayOfByte = VVx.Dne(paramWkD);
      paramDataOutputStream.writeShort((short)arrayOfByte.length);
      paramDataOutputStream.write(arrayOfByte);
    } 
  }
  
  public static void Dne(String paramString, DataOutputStream paramDataOutputStream) {
    if (paramString.length() > 32767)
      throw new IOException("String too big"); 
    paramDataOutputStream.writeShort(paramString.length());
    paramDataOutputStream.writeChars(paramString);
  }
  
  public abstract void Dne(DataInputStream paramDataInputStream);
  
  public boolean Dne(NER paramNER) {
    return false;
  }
  
  public static NMq Dne(DataInputStream paramDataInputStream) {
    NMq nMq = null;
    short s = paramDataInputStream.readShort();
    if (s >= 0) {
      byte b = paramDataInputStream.readByte();
      short s1 = paramDataInputStream.readShort();
      nMq = new NMq(s, b, s1);
      nMq.Dne = Dne(paramDataInputStream);
    } 
    return nMq;
  }
  
  static {
    Dne = (ZGT)new HashMap<>();
    Dne = (ZGT)new HashSet();
    FWm = new HashSet();
    Dne(0, true, true, Phv.class);
    Dne(1, true, true, VPw.class);
    Dne(2, false, true, ike.class);
    Dne(3, true, true, rXx.class);
    Dne(4, true, false, uYm.class);
    Dne(5, true, false, qHm.class);
    Dne(6, true, false, ROw.class);
    Dne(7, false, true, EHr.class);
    Dne(8, true, false, zqT.class);
    Dne(9, true, true, fmA.class);
    Dne(10, true, true, FQJ.class);
    Dne(11, true, true, QEr.class);
    Dne(12, true, true, FTJ.class);
    Dne(13, true, true, eMn.class);
    Dne(14, false, true, Wbc.class);
    Dne(15, false, true, DtJ.class);
    Dne(16, true, true, aig.class);
    Dne(17, true, false, kwp.class);
    Dne(18, true, true, UVb.class);
    Dne(19, false, true, Pkw.class);
    Dne(20, true, false, MwE.class);
    Dne(22, true, false, liE.class);
    Dne(23, true, false, wXa.class);
    Dne(24, true, false, QZR.class);
    Dne(25, true, false, bia.class);
    Dne(26, true, false, mPe.class);
    Dne(28, true, false, wFl.class);
    Dne(29, true, false, tXK.class);
    Dne(30, true, false, iET.class);
    Dne(31, true, false, GKq.class);
    Dne(32, true, false, wXr.class);
    Dne(33, true, false, DyR.class);
    Dne(34, true, false, NVL.class);
    Dne(35, true, false, eNn.class);
    Dne(38, true, false, JGj.class);
    Dne(39, true, false, YVz.class);
    Dne(40, true, false, SnO.class);
    Dne(41, true, false, ziQ.class);
    Dne(42, true, false, gzk.class);
    Dne(43, true, false, WXC.class);
    Dne(51, true, false, pKI.class);
    Dne(52, true, false, Ylf.class);
    Dne(53, true, false, cSs.class);
    Dne(54, true, false, VJn.class);
    Dne(55, true, false, bEj.class);
    Dne(56, true, false, nPC.class);
    Dne(60, true, false, UdA.class);
    Dne(61, true, false, wwJ.class);
    Dne(62, true, false, AQV.class);
    Dne(63, true, false, YLL.class);
    Dne(70, true, false, Tnn.class);
    Dne(71, true, false, Rle.class);
    Dne(100, true, false, XGq.class);
    Dne(101, true, true, Krr.class);
    Dne(102, false, true, mZp.class);
    Dne(103, true, false, RZL.class);
    Dne(104, true, false, Pwq.class);
    Dne(105, true, false, QKM.class);
    Dne(106, true, true, pDZ.class);
    Dne(107, true, true, pRp.class);
    Dne(108, false, true, fwI.class);
    Dne(130, true, true, eFM.class);
    Dne(131, true, false, XsD.class);
    Dne(132, true, false, ipQ.class);
    Dne(200, true, false, Raa.class);
    Dne(201, true, false, fPl.class);
    Dne(202, true, true, pSe.class);
    Dne(203, true, true, efs.class);
    Dne(204, false, true, yUQ.class);
    Dne(205, false, true, Gle.class);
    Dne(206, true, false, iQd.class);
    Dne(207, true, false, niw.class);
    Dne(208, true, false, LjQ.class);
    Dne(209, true, false, SPR.class);
    Dne(250, true, true, FaB.class);
    Dne(252, true, true, nsl.class);
    Dne(253, true, false, GJK.class);
    Dne(254, false, true, prJ.class);
    Dne(255, true, true, yZV.class);
  }
  
  public final int aFZ() {
    return ((Integer)Dne.get(getClass())).intValue();
  }
  
  public abstract void Dne(pPV parampPV);
  
  public boolean FWm() {
    return false;
  }
  
  public static void Dne(NER paramNER, DataOutputStream paramDataOutputStream) {
    paramDataOutputStream.write(paramNER.aFZ());
    paramNER.Dne(paramDataOutputStream);
    Qnq++;
    aFZ += paramNER.Dne();
  }
  
  public static void Dne(NMq paramNMq, DataOutputStream paramDataOutputStream) {
    if (paramNMq == null) {
      paramDataOutputStream.writeShort(-1);
    } else {
      int i;
      paramDataOutputStream.writeShort(paramNMq.bzF);
      paramDataOutputStream.writeByte(paramNMq.Dne);
      paramDataOutputStream.writeShort(paramNMq.Qnq());
      Object object = null;
      if (paramNMq.Dne().DyG() || paramNMq.Dne().div())
        i = paramNMq.Dne; 
      Dne(i, paramDataOutputStream);
    } 
  }
  
  public boolean Dne() {
    return false;
  }
  
  public static String Dne(DataInputStream paramDataInputStream, int paramInt) {
    short s = paramDataInputStream.readShort();
    if (s > paramInt)
      throw new IOException("Received string length longer than maximum allowed (" + s + " > " + paramInt + ")"); 
    if (s < 0)
      throw new IOException("Received string length is less than zero! Weird string!"); 
    StringBuilder stringBuilder = new StringBuilder();
    for (byte b = 0; b < s; b++)
      stringBuilder.append(paramDataInputStream.readChar()); 
    return stringBuilder.toString();
  }
  
  public static NER Dne(dLs paramdLs, int paramInt) {
    try {
      Class<NER> clazz = (Class)Dne.Dne(paramInt);
      return (clazz == null) ? null : clazz.newInstance();
    } catch (Exception exception) {
      exception.printStackTrace();
      paramdLs.bzF("Skipping packet with id " + paramInt);
      return null;
    } 
  }
  
  public String toString() {
    return getClass().getSimpleName();
  }
  
  public static WkD Dne(DataInputStream paramDataInputStream) {
    short s = paramDataInputStream.readShort();
    if (s < 0)
      return null; 
    byte[] arrayOfByte = new byte[s];
    paramDataInputStream.readFully(arrayOfByte);
    return VVx.Dne(arrayOfByte);
  }
  
  static void Dne(int paramInt, boolean paramBoolean1, boolean paramBoolean2, Class<?> paramClass) {
    if (Dne.Dne(paramInt))
      throw new IllegalArgumentException("Duplicate packet id:" + paramInt); 
    if (Dne.containsKey(paramClass))
      throw new IllegalArgumentException("Duplicate packet class:" + paramClass); 
    Dne.Dne(paramInt, paramClass);
    Dne.put(paramClass, Integer.valueOf(paramInt));
    if (paramBoolean1)
      Dne.add(Integer.valueOf(paramInt)); 
    if (paramBoolean2)
      FWm.add(Integer.valueOf(paramInt)); 
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\NER.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */