class qoF {
  static {
  
  }
  
  public static void Dne(String[] paramArrayOfString) {
    JQZ jQZ = null;
    try {
      if (paramArrayOfString.length > 0) {
        jQZ = new JQZ(paramArrayOfString[0]);
      } else {
        jQZ = new JQZ(System.in, null, -1);
      } 
    } catch (Exception exception) {
      System.err.println(exception);
      return;
    } 
    if (jQZ.Dne()) {
      System.out.println("Input bitstream contained " + jQZ.Qnq() + " logical bitstream section(s).");
      System.out.println("Total bitstream playing time: " + jQZ.Dne(-1) + " seconds\n");
    } else {
      System.out.println("Standard input was not seekable.");
      System.out.println("First logical bitstream information:\n");
    } 
    for (byte b = 0; b < jQZ.Qnq(); b++) {
      Lth lth = jQZ.Dne(b);
      System.out.println("\tlogical bitstream section " + (b + 1) + " information:");
      System.out.println("\t\t" + lth.bzF + "Hz " + lth.FWm + " channels bitrate " + (jQZ.FWm(b) / 1000) + "kbps serial number=" + jQZ.bzF(b));
      System.out.print("\t\tcompressed length: " + jQZ.Dne(b) + " bytes ");
      System.out.println(" play time: " + jQZ.Dne(b) + "s");
      PRc pRc = jQZ.Dne(b);
      System.out.println(pRc);
    } 
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\qoF.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */