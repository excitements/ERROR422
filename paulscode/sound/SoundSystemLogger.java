package paulscode.sound;

public class SoundSystemLogger {
  public void message(String paramString, int paramInt) {
    String str2 = "";
    for (byte b = 0; b < paramInt; b++)
      str2 = str2 + "    "; 
    String str1 = str2 + paramString;
    System.out.println(str1);
  }
  
  public void errorMessage(String paramString1, String paramString2, int paramInt) {
    String str3 = "";
    for (byte b = 0; b < paramInt; b++)
      str3 = str3 + "    "; 
    String str1 = str3 + "Error in class '" + paramString1 + "'";
    String str2 = "    " + str3 + paramString2;
    System.out.println(str1);
    System.out.println(str2);
  }
  
  public boolean errorCheck(boolean paramBoolean, String paramString1, String paramString2, int paramInt) {
    if (paramBoolean)
      errorMessage(paramString1, paramString2, paramInt); 
    return paramBoolean;
  }
  
  public void printStackTrace(Exception paramException, int paramInt) {
    printExceptionMessage(paramException, paramInt);
    importantMessage("STACK TRACE:", paramInt);
    if (paramException == null)
      return; 
    StackTraceElement[] arrayOfStackTraceElement = paramException.getStackTrace();
    if (arrayOfStackTraceElement == null)
      return; 
    for (byte b = 0; b < arrayOfStackTraceElement.length; b++) {
      StackTraceElement stackTraceElement = arrayOfStackTraceElement[b];
      if (stackTraceElement != null)
        message(stackTraceElement.toString(), paramInt + 1); 
    } 
  }
  
  public void printExceptionMessage(Exception paramException, int paramInt) {
    importantMessage("ERROR MESSAGE:", paramInt);
    if (paramException.getMessage() == null) {
      message("(none)", paramInt + 1);
    } else {
      message(paramException.getMessage(), paramInt + 1);
    } 
  }
  
  static {
  
  }
  
  public void importantMessage(String paramString, int paramInt) {
    String str2 = "";
    for (byte b = 0; b < paramInt; b++)
      str2 = str2 + "    "; 
    String str1 = str2 + paramString;
    System.out.println(str1);
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\paulscode\sound\SoundSystemLogger.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */