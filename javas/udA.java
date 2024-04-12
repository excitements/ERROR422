import java.io.PrintWriter;
import java.io.StringWriter;
import java.text.SimpleDateFormat;
import java.util.logging.Formatter;
import java.util.logging.LogRecord;

class udA extends Formatter {
  private SimpleDateFormat Dne;
  
  final WQU Dne;
  
  udA(WQU paramWQU, UHl paramUHl) {
    this(paramWQU);
  }
  
  public String format(LogRecord paramLogRecord) {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(this.Dne.format(Long.valueOf(paramLogRecord.getMillis())));
    if (WQU.Dne(this.Dne) != null)
      stringBuilder.append(WQU.Dne(this.Dne)); 
    stringBuilder.append(" [").append(paramLogRecord.getLevel().getName()).append("] ");
    stringBuilder.append(formatMessage(paramLogRecord));
    stringBuilder.append('\n');
    Throwable throwable = paramLogRecord.getThrown();
    if (throwable != null) {
      StringWriter stringWriter = new StringWriter();
      throwable.printStackTrace(new PrintWriter(stringWriter));
      stringBuilder.append(stringWriter.toString());
    } 
    return stringBuilder.toString();
  }
  
  private udA(WQU paramWQU) {
    this.Dne = paramWQU;
    this.Dne = (WQU)new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar\\udA.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */