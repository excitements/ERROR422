import java.io.Reader;
import java.util.Arrays;

public final class gJi {
  private int Dne(bKn parambKn) {
    char[] arrayOfChar = new char[4];
    int i = parambKn.Dne(arrayOfChar);
    if (i != 4)
      throw new pPp("Expected a 4 digit hexidecimal number but got only [" + i + "], namely [" + String.valueOf(arrayOfChar, 0, i) + "].", parambKn); 
    try {
      return Integer.parseInt(String.valueOf(arrayOfChar), 16);
    } catch (NumberFormatException numberFormatException) {
      parambKn.Dne(arrayOfChar);
      throw new pPp("Unable to parse [" + String.valueOf(arrayOfChar) + "] as a hexidecimal number.", numberFormatException, parambKn);
    } 
  }
  
  private void FWm(bKn parambKn, Lkt paramLkt) {
    char c1 = (char)FWm(parambKn);
    if (c1 != '{')
      throw new pPp("Expected object to start with { but got [" + c1 + "].", parambKn); 
    paramLkt.aFZ();
    char c2 = (char)FWm(parambKn);
    parambKn.Dne(c2);
    if (c2 != '}')
      bzF(parambKn, paramLkt); 
    boolean bool = false;
    while (!bool) {
      char c = (char)FWm(parambKn);
      switch (c) {
        case ',':
          bzF(parambKn, paramLkt);
          continue;
        case '}':
          bool = true;
          continue;
      } 
      throw new pPp("Expected either , or } but got [" + c + "].", parambKn);
    } 
    paramLkt.zGp();
  }
  
  private char bzF(bKn parambKn) {
    char c = (char)parambKn.Dne();
    switch (c) {
      case '"':
        return '"';
      case '/':
        return '/';
      case '\\':
        return '\\';
      case 'b':
        return '\b';
      case 'f':
        return '\f';
      case 'n':
        return '\n';
      case 'r':
        return '\r';
      case 't':
        return '\t';
      case 'u':
        return (char)Dne(parambKn);
    } 
    throw new pPp("Unrecognised escape character [" + c + "].", parambKn);
  }
  
  private String DyG(bKn parambKn) {
    StringBuilder stringBuilder = new StringBuilder();
    char c = (char)parambKn.Dne();
    if ('"' != c)
      throw new pPp("Expected [\"] but got [" + c + "].", parambKn); 
    boolean bool = false;
    while (!bool) {
      char c2;
      char c1 = (char)parambKn.Dne();
      switch (c1) {
        case '"':
          bool = true;
          continue;
        case '\\':
          c2 = bzF(parambKn);
          stringBuilder.append(c2);
          continue;
      } 
      stringBuilder.append(c1);
    } 
    return stringBuilder.toString();
  }
  
  private String zGp(bKn parambKn) {
    StringBuilder stringBuilder = new StringBuilder();
    char c = (char)parambKn.Dne();
    if (c != '+' && c != '-') {
      parambKn.Dne(c);
    } else {
      stringBuilder.append(c);
    } 
    return stringBuilder.toString();
  }
  
  private char FWm(bKn parambKn) {
    char c = (char)parambKn.Dne();
    switch (c) {
      case '0':
      case '1':
      case '2':
      case '3':
      case '4':
      case '5':
      case '6':
      case '7':
      case '8':
      case '9':
        return c;
    } 
    throw new pPp("Expected a digit 1 - 9 but got [" + c + "].", parambKn);
  }
  
  public void Dne(Reader paramReader, Lkt paramLkt) {
    bKn bKn = new bKn(paramReader);
    char c = (char)bKn.Dne();
    switch (c) {
      case '[':
        bKn.Dne(c);
        paramLkt.Dne();
        Dne(bKn, paramLkt);
        break;
      case '{':
        bKn.Dne(c);
        paramLkt.Dne();
        FWm(bKn, paramLkt);
        break;
      default:
        throw new pPp("Expected either [ or { but got [" + c + "].", bKn);
    } 
    int i = FWm(bKn);
    if (i != -1)
      throw new pPp("Got unexpected trailing character [" + (char)i + "].", bKn); 
    paramLkt.FWm();
  }
  
  private char Dne(bKn parambKn) {
    char c = (char)parambKn.Dne();
    switch (c) {
      case '1':
      case '2':
      case '3':
      case '4':
      case '5':
      case '6':
      case '7':
      case '8':
      case '9':
        return c;
    } 
    throw new pPp("Expected a digit 1 - 9 but got [" + c + "].", parambKn);
  }
  
  private int FWm(bKn parambKn) {
    boolean bool = false;
    while (true) {
      int i = parambKn.Dne();
      switch (i) {
        case 9:
        case 10:
        case 13:
        case 32:
          break;
        default:
          bool = true;
          break;
      } 
      if (bool)
        return i; 
    } 
  }
  
  static {
  
  }
  
  private void Qnq(bKn parambKn, Lkt paramLkt) {
    char[] arrayOfChar1;
    int i;
    char[] arrayOfChar2;
    int j;
    char[] arrayOfChar3;
    int k;
    char c = (char)FWm(parambKn);
    switch (c) {
      case '"':
        parambKn.Dne(c);
        paramLkt.bzF(DyG(parambKn));
        return;
      case '-':
      case '0':
      case '1':
      case '2':
      case '3':
      case '4':
      case '5':
      case '6':
      case '7':
      case '8':
      case '9':
        parambKn.Dne(c);
        paramLkt.FWm(Dne(parambKn));
        return;
      case '[':
        parambKn.Dne(c);
        Dne(parambKn, paramLkt);
        return;
      case 'f':
        arrayOfChar1 = new char[4];
        i = parambKn.Dne(arrayOfChar1);
        if (i != 4 || arrayOfChar1[0] != 'a' || arrayOfChar1[1] != 'l' || arrayOfChar1[2] != 's' || arrayOfChar1[3] != 'e') {
          parambKn.Dne(arrayOfChar1);
          throw new pPp("Expected 'f' to be followed by [[a, l, s, e]], but got [" + Arrays.toString(arrayOfChar1) + "].", parambKn);
        } 
        paramLkt.IjH();
        return;
      case 'n':
        arrayOfChar2 = new char[3];
        j = parambKn.Dne(arrayOfChar2);
        if (j != 3 || arrayOfChar2[0] != 'u' || arrayOfChar2[1] != 'l' || arrayOfChar2[2] != 'l') {
          parambKn.Dne(arrayOfChar2);
          throw new pPp("Expected 'n' to be followed by [[u, l, l]], but got [" + Arrays.toString(arrayOfChar2) + "].", parambKn);
        } 
        paramLkt.mrb();
        return;
      case 't':
        arrayOfChar3 = new char[3];
        k = parambKn.Dne(arrayOfChar3);
        if (k != 3 || arrayOfChar3[0] != 'r' || arrayOfChar3[1] != 'u' || arrayOfChar3[2] != 'e') {
          parambKn.Dne(arrayOfChar3);
          throw new pPp("Expected 't' to be followed by [[r, u, e]], but got [" + Arrays.toString(arrayOfChar3) + "].", parambKn);
        } 
        paramLkt.div();
        return;
      case '{':
        parambKn.Dne(c);
        FWm(parambKn, paramLkt);
        return;
    } 
    throw new pPp("Invalid character at start of value [" + c + "].", parambKn);
  }
  
  private String Qnq(bKn parambKn) {
    StringBuilder stringBuilder = new StringBuilder();
    char c = (char)parambKn.Dne();
    if (c == '.') {
      stringBuilder.append('.');
      stringBuilder.append(FWm(parambKn));
      stringBuilder.append(bzF(parambKn));
    } else {
      parambKn.Dne(c);
    } 
    return stringBuilder.toString();
  }
  
  private String FWm(bKn parambKn) {
    StringBuilder stringBuilder = new StringBuilder();
    char c = (char)parambKn.Dne();
    if ('0' == c) {
      stringBuilder.append('0');
      stringBuilder.append(Qnq(parambKn));
      stringBuilder.append(aFZ(parambKn));
    } else {
      parambKn.Dne(c);
      stringBuilder.append(Dne(parambKn));
      stringBuilder.append(bzF(parambKn));
      stringBuilder.append(Qnq(parambKn));
      stringBuilder.append(aFZ(parambKn));
    } 
    return stringBuilder.toString();
  }
  
  private String Dne(bKn parambKn) {
    StringBuilder stringBuilder = new StringBuilder();
    char c = (char)parambKn.Dne();
    if ('-' == c) {
      stringBuilder.append('-');
    } else {
      parambKn.Dne(c);
    } 
    stringBuilder.append(FWm(parambKn));
    return stringBuilder.toString();
  }
  
  private String aFZ(bKn parambKn) {
    StringBuilder stringBuilder = new StringBuilder();
    char c = (char)parambKn.Dne();
    if (c != '.' && c != 'E') {
      parambKn.Dne(c);
    } else {
      stringBuilder.append('E');
      stringBuilder.append(zGp(parambKn));
      stringBuilder.append(FWm(parambKn));
      stringBuilder.append(bzF(parambKn));
    } 
    return stringBuilder.toString();
  }
  
  private void Dne(bKn parambKn, Lkt paramLkt) {
    char c1 = (char)FWm(parambKn);
    if (c1 != '[')
      throw new pPp("Expected object to start with [ but got [" + c1 + "].", parambKn); 
    paramLkt.bzF();
    char c2 = (char)FWm(parambKn);
    parambKn.Dne(c2);
    if (c2 != ']')
      Qnq(parambKn, paramLkt); 
    boolean bool = false;
    while (!bool) {
      char c = (char)FWm(parambKn);
      switch (c) {
        case ',':
          Qnq(parambKn, paramLkt);
          continue;
        case ']':
          bool = true;
          continue;
      } 
      throw new pPp("Expected either , or ] but got [" + c + "].", parambKn);
    } 
    paramLkt.Qnq();
  }
  
  private void bzF(bKn parambKn, Lkt paramLkt) {
    char c1 = (char)FWm(parambKn);
    if ('"' != c1)
      throw new pPp("Expected object identifier to begin with [\"] but got [" + c1 + "].", parambKn); 
    parambKn.Dne(c1);
    paramLkt.Dne(DyG(parambKn));
    char c2 = (char)FWm(parambKn);
    if (c2 != ':')
      throw new pPp("Expected object identifier to be followed by : but got [" + c2 + "].", parambKn); 
    Qnq(parambKn, paramLkt);
    paramLkt.DyG();
  }
  
  private String bzF(bKn parambKn) {
    StringBuilder stringBuilder = new StringBuilder();
    boolean bool = false;
    while (!bool) {
      char c = (char)parambKn.Dne();
      switch (c) {
        case '0':
        case '1':
        case '2':
        case '3':
        case '4':
        case '5':
        case '6':
        case '7':
        case '8':
        case '9':
          stringBuilder.append(c);
          continue;
      } 
      bool = true;
      parambKn.Dne(c);
    } 
    return stringBuilder.toString();
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\gJi.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */