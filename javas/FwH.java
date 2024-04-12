import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

public class FwH extends xZE {
  public String Dne() {
    return "scoreboard";
  }
  
  protected void Dne(gnI paramgnI, String[] paramArrayOfString, int paramInt) {
    String str1 = paramArrayOfString[paramInt++];
    String str2 = paramArrayOfString[paramInt++];
    SFA sFA = Dne();
    PAf pAf = (PAf)PAf.Dne.get(str2);
    if (pAf == null) {
      String[] arrayOfString = (String[])PAf.Dne.keySet().toArray((Object[])new String[0]);
      throw new fxw("commands.scoreboard.objectives.add.wrongType", new Object[] { Dne(arrayOfString) });
    } 
    if (sFA.Dne(str1) != null)
      throw new WoB("commands.scoreboard.objectives.add.alreadyExists", new Object[] { str1 }); 
    if (str1.length() > 16)
      throw new qwv("commands.scoreboard.objectives.add.tooLong", new Object[] { str1, Integer.valueOf(16) }); 
    vfE vfE = sFA.Dne(str1, pAf);
    if (paramArrayOfString.length > paramInt) {
      String str = Dne(paramgnI, paramArrayOfString, paramInt);
      if (str.length() > 32)
        throw new qwv("commands.scoreboard.objectives.add.displayTooLong", new Object[] { str, Integer.valueOf(32) }); 
      if (str.length() > 0)
        vfE.Dne(str); 
    } 
    Dne(paramgnI, "commands.scoreboard.objectives.add.success", new Object[] { str1 });
  }
  
  public void Dne(gnI paramgnI, String[] paramArrayOfString) {
    if (paramArrayOfString.length >= 1) {
      if (paramArrayOfString[0].equalsIgnoreCase("objectives")) {
        if (paramArrayOfString.length == 1)
          throw new fxw("commands.scoreboard.objectives.usage", new Object[0]); 
        if (paramArrayOfString[1].equalsIgnoreCase("list")) {
          Dne(paramgnI);
        } else if (paramArrayOfString[1].equalsIgnoreCase("add")) {
          if (paramArrayOfString.length < 4)
            throw new fxw("commands.scoreboard.objectives.add.usage", new Object[0]); 
          Dne(paramgnI, paramArrayOfString, 2);
        } else if (paramArrayOfString[1].equalsIgnoreCase("remove")) {
          if (paramArrayOfString.length != 3)
            throw new fxw("commands.scoreboard.objectives.remove.usage", new Object[0]); 
          Dne(paramgnI, paramArrayOfString[2]);
        } else {
          if (!paramArrayOfString[1].equalsIgnoreCase("setdisplay"))
            throw new fxw("commands.scoreboard.objectives.usage", new Object[0]); 
          if (paramArrayOfString.length != 3 && paramArrayOfString.length != 4)
            throw new fxw("commands.scoreboard.objectives.setdisplay.usage", new Object[0]); 
          IjH(paramgnI, paramArrayOfString, 2);
        } 
        return;
      } 
      if (paramArrayOfString[0].equalsIgnoreCase("players")) {
        if (paramArrayOfString.length == 1)
          throw new fxw("commands.scoreboard.players.usage", new Object[0]); 
        if (paramArrayOfString[1].equalsIgnoreCase("list")) {
          if (paramArrayOfString.length > 3)
            throw new fxw("commands.scoreboard.players.list.usage", new Object[0]); 
          mrb(paramgnI, paramArrayOfString, 2);
        } else if (paramArrayOfString[1].equalsIgnoreCase("add")) {
          if (paramArrayOfString.length != 5)
            throw new fxw("commands.scoreboard.players.add.usage", new Object[0]); 
          XHL(paramgnI, paramArrayOfString, 2);
        } else if (paramArrayOfString[1].equalsIgnoreCase("remove")) {
          if (paramArrayOfString.length != 5)
            throw new fxw("commands.scoreboard.players.remove.usage", new Object[0]); 
          XHL(paramgnI, paramArrayOfString, 2);
        } else if (paramArrayOfString[1].equalsIgnoreCase("set")) {
          if (paramArrayOfString.length != 5)
            throw new fxw("commands.scoreboard.players.set.usage", new Object[0]); 
          XHL(paramgnI, paramArrayOfString, 2);
        } else {
          if (!paramArrayOfString[1].equalsIgnoreCase("reset"))
            throw new fxw("commands.scoreboard.players.usage", new Object[0]); 
          if (paramArrayOfString.length != 3)
            throw new fxw("commands.scoreboard.players.reset.usage", new Object[0]); 
          Zpi(paramgnI, paramArrayOfString, 2);
        } 
        return;
      } 
      if (paramArrayOfString[0].equalsIgnoreCase("teams")) {
        if (paramArrayOfString.length == 1)
          throw new fxw("commands.scoreboard.teams.usage", new Object[0]); 
        if (paramArrayOfString[1].equalsIgnoreCase("list")) {
          if (paramArrayOfString.length > 3)
            throw new fxw("commands.scoreboard.teams.list.usage", new Object[0]); 
          aFZ(paramgnI, paramArrayOfString, 2);
        } else if (paramArrayOfString[1].equalsIgnoreCase("add")) {
          if (paramArrayOfString.length < 3)
            throw new fxw("commands.scoreboard.teams.add.usage", new Object[0]); 
          FWm(paramgnI, paramArrayOfString, 2);
        } else if (paramArrayOfString[1].equalsIgnoreCase("remove")) {
          if (paramArrayOfString.length != 3)
            throw new fxw("commands.scoreboard.teams.remove.usage", new Object[0]); 
          Qnq(paramgnI, paramArrayOfString, 2);
        } else if (paramArrayOfString[1].equalsIgnoreCase("empty")) {
          if (paramArrayOfString.length != 3)
            throw new fxw("commands.scoreboard.teams.empty.usage", new Object[0]); 
          div(paramgnI, paramArrayOfString, 2);
        } else if (paramArrayOfString[1].equalsIgnoreCase("join")) {
          if (paramArrayOfString.length < 4 && (paramArrayOfString.length != 3 || !(paramgnI instanceof FiG)))
            throw new fxw("commands.scoreboard.teams.join.usage", new Object[0]); 
          zGp(paramgnI, paramArrayOfString, 2);
        } else if (paramArrayOfString[1].equalsIgnoreCase("leave")) {
          if (paramArrayOfString.length < 3 && !(paramgnI instanceof FiG))
            throw new fxw("commands.scoreboard.teams.leave.usage", new Object[0]); 
          DyG(paramgnI, paramArrayOfString, 2);
        } else {
          if (!paramArrayOfString[1].equalsIgnoreCase("option"))
            throw new fxw("commands.scoreboard.teams.usage", new Object[0]); 
          if (paramArrayOfString.length != 4 && paramArrayOfString.length != 5)
            throw new fxw("commands.scoreboard.teams.option.usage", new Object[0]); 
          bzF(paramgnI, paramArrayOfString, 2);
        } 
        return;
      } 
    } 
    throw new fxw("commands.scoreboard.usage", new Object[0]);
  }
  
  protected void XHL(gnI paramgnI, String[] paramArrayOfString, int paramInt) {
    String str1 = paramArrayOfString[paramInt - 1];
    String str2 = Dne(paramgnI, paramArrayOfString[paramInt++]);
    vfE vfE = Dne(paramArrayOfString[paramInt++], true);
    int i = str1.equalsIgnoreCase("set") ? FWm(paramgnI, paramArrayOfString[paramInt++]) : Dne(paramgnI, paramArrayOfString[paramInt++], 1);
    SFA sFA = Dne();
    OHz oHz = sFA.Dne(str2, vfE);
    if (str1.equalsIgnoreCase("set")) {
      oHz.bzF(i);
    } else if (str1.equalsIgnoreCase("add")) {
      oHz.Dne(i);
    } else {
      oHz.FWm(i);
    } 
    Dne(paramgnI, "commands.scoreboard.players.set.success", new Object[] { vfE.Dne(), str2, Integer.valueOf(oHz.Dne()) });
  }
  
  protected void IjH(gnI paramgnI, String[] paramArrayOfString, int paramInt) {
    SFA sFA = Dne();
    String str = paramArrayOfString[paramInt++];
    int i = SFA.Dne(str);
    vfE vfE = null;
    if (paramArrayOfString.length == 4)
      vfE = Dne(paramArrayOfString[paramInt++], false); 
    if (i < 0)
      throw new WoB("commands.scoreboard.objectives.setdisplay.invalidSlot", new Object[] { str }); 
    sFA.Dne(i, vfE);
    if (vfE != null) {
      Dne(paramgnI, "commands.scoreboard.objectives.setdisplay.successSet", new Object[] { SFA.Dne(i), vfE.Dne() });
    } else {
      Dne(paramgnI, "commands.scoreboard.objectives.setdisplay.successCleared", new Object[] { SFA.Dne(i) });
    } 
  }
  
  protected void DyG(gnI paramgnI, String[] paramArrayOfString, int paramInt) {
    SFA sFA = Dne();
    HashSet<String> hashSet1 = new HashSet();
    HashSet<String> hashSet2 = new HashSet();
    if (paramgnI instanceof FiG && paramInt == paramArrayOfString.length) {
      String str = Dne(paramgnI).Dne();
      if (sFA.Dne(str)) {
        hashSet1.add(str);
      } else {
        hashSet2.add(str);
      } 
    } else {
      while (paramInt < paramArrayOfString.length) {
        String str = Dne(paramgnI, paramArrayOfString[paramInt++]);
        if (sFA.Dne(str)) {
          hashSet1.add(str);
          continue;
        } 
        hashSet2.add(str);
      } 
    } 
    if (!hashSet1.isEmpty())
      Dne(paramgnI, "commands.scoreboard.teams.leave.success", new Object[] { Integer.valueOf(hashSet1.size()), Dne(hashSet1.toArray((Object[])new String[0])) }); 
    if (!hashSet2.isEmpty())
      throw new WoB("commands.scoreboard.teams.leave.failure", new Object[] { Integer.valueOf(hashSet2.size()), Dne(hashSet2.toArray(new String[0])) }); 
  }
  
  static {
  
  }
  
  protected void Qnq(gnI paramgnI, String[] paramArrayOfString, int paramInt) {
    SFA sFA = Dne();
    YGE yGE = Dne(paramArrayOfString[paramInt++]);
    sFA.Dne(yGE);
    Dne(paramgnI, "commands.scoreboard.teams.remove.success", new Object[] { yGE.Dne() });
  }
  
  public boolean Dne(String[] paramArrayOfString, int paramInt) {
    return paramArrayOfString[0].equalsIgnoreCase("players") ? ((paramInt == 2)) : (!paramArrayOfString[0].equalsIgnoreCase("teams") ? false : ((paramInt == 2 || paramInt == 3)));
  }
  
  protected void mrb(gnI paramgnI, String[] paramArrayOfString, int paramInt) {
    SFA sFA = Dne();
    if (paramArrayOfString.length > paramInt) {
      String str = Dne(paramgnI, paramArrayOfString[paramInt++]);
      Map map = sFA.Dne(str);
      if (map.size() <= 0)
        throw new WoB("commands.scoreboard.players.list.player.empty", new Object[] { str }); 
      paramgnI.Dne(Dne.bzF + paramgnI.Dne("commands.scoreboard.players.list.player.count", new Object[] { Integer.valueOf(map.size()), str }));
      for (OHz oHz : map.values()) {
        paramgnI.Dne(paramgnI.Dne("commands.scoreboard.players.list.player.entry", new Object[] { Integer.valueOf(oHz.Dne()), oHz.Dne().FWm(), oHz.Dne().Dne() }));
      } 
    } else {
      Collection collection = sFA.FWm();
      if (collection.size() <= 0)
        throw new WoB("commands.scoreboard.players.list.empty", new Object[0]); 
      paramgnI.Dne(Dne.bzF + paramgnI.Dne("commands.scoreboard.players.list.count", new Object[] { Integer.valueOf(collection.size()) }));
      paramgnI.Dne(Dne(collection.toArray()));
    } 
  }
  
  protected YGE Dne(String paramString) {
    SFA sFA = Dne();
    YGE yGE = sFA.Dne(paramString);
    if (yGE == null)
      throw new WoB("commands.scoreboard.teamNotFound", new Object[] { paramString }); 
    return yGE;
  }
  
  protected SFA Dne() {
    return Jwh.Dne().Dne(0).Dne();
  }
  
  protected List Dne(boolean paramBoolean) {
    Collection collection = Dne().Dne();
    ArrayList<String> arrayList = new ArrayList();
    for (vfE vfE : collection) {
      if (!paramBoolean || !vfE.Dne().Dne())
        arrayList.add(vfE.Dne()); 
    } 
    return arrayList;
  }
  
  protected void aFZ(gnI paramgnI, String[] paramArrayOfString, int paramInt) {
    SFA sFA = Dne();
    if (paramArrayOfString.length > paramInt) {
      YGE yGE = Dne(paramArrayOfString[paramInt++]);
      Collection collection = yGE.Dne();
      if (collection.size() <= 0)
        throw new WoB("commands.scoreboard.teams.list.player.empty", new Object[] { yGE.Dne() }); 
      paramgnI.Dne(Dne.bzF + paramgnI.Dne("commands.scoreboard.teams.list.player.count", new Object[] { Integer.valueOf(collection.size()), yGE.Dne() }));
      paramgnI.Dne(Dne(collection.toArray()));
    } else {
      Collection collection = sFA.aFZ();
      if (collection.size() <= 0)
        throw new WoB("commands.scoreboard.teams.list.empty", new Object[0]); 
      paramgnI.Dne(Dne.bzF + paramgnI.Dne("commands.scoreboard.teams.list.count", new Object[] { Integer.valueOf(collection.size()) }));
      for (YGE yGE : collection) {
        paramgnI.Dne(paramgnI.Dne("commands.scoreboard.teams.list.entry", new Object[] { yGE.Dne(), yGE.FWm(), Integer.valueOf(yGE.Dne().size()) }));
      } 
    } 
  }
  
  protected vfE Dne(String paramString, boolean paramBoolean) {
    SFA sFA = Dne();
    vfE vfE = sFA.Dne(paramString);
    if (vfE == null)
      throw new WoB("commands.scoreboard.objectiveNotFound", new Object[] { paramString }); 
    if (paramBoolean && vfE.Dne().Dne())
      throw new WoB("commands.scoreboard.objectiveReadOnly", new Object[] { paramString }); 
    return vfE;
  }
  
  protected void Zpi(gnI paramgnI, String[] paramArrayOfString, int paramInt) {
    SFA sFA = Dne();
    String str = Dne(paramgnI, paramArrayOfString[paramInt++]);
    sFA.Dne(str);
    Dne(paramgnI, "commands.scoreboard.players.reset.success", new Object[] { str });
  }
  
  protected void bzF(gnI paramgnI, String[] paramArrayOfString, int paramInt) {
    YGE yGE = Dne(paramArrayOfString[paramInt++]);
    String str1 = paramArrayOfString[paramInt++].toLowerCase();
    if (!str1.equalsIgnoreCase("color") && !str1.equalsIgnoreCase("friendlyfire") && !str1.equalsIgnoreCase("seeFriendlyInvisibles"))
      throw new fxw("commands.scoreboard.teams.option.usage", new Object[0]); 
    if (paramArrayOfString.length == 4) {
      if (str1.equalsIgnoreCase("color"))
        throw new fxw("commands.scoreboard.teams.option.noValue", new Object[] { str1, Dne(Dne.Dne(true, false)) }); 
      if (!str1.equalsIgnoreCase("friendlyfire") && !str1.equalsIgnoreCase("seeFriendlyInvisibles"))
        throw new fxw("commands.scoreboard.teams.option.usage", new Object[0]); 
      throw new fxw("commands.scoreboard.teams.option.noValue", new Object[] { str1, Dne(Arrays.asList(new String[] { "true", "false" })) });
    } 
    String str2 = paramArrayOfString[paramInt++];
    if (str1.equalsIgnoreCase("color")) {
      Dne dne = Dne.Dne(str2);
      if (str2 == null)
        throw new fxw("commands.scoreboard.teams.option.noValue", new Object[] { str1, Dne(Dne.Dne(true, false)) }); 
      yGE.FWm(dne.toString());
      yGE.bzF(Dne.FfS.toString());
    } else if (str1.equalsIgnoreCase("friendlyfire")) {
      if (!str2.equalsIgnoreCase("true") && !str2.equalsIgnoreCase("false"))
        throw new fxw("commands.scoreboard.teams.option.noValue", new Object[] { str1, Dne(Arrays.asList(new String[] { "true", "false" })) }); 
      yGE.Dne(str2.equalsIgnoreCase("true"));
    } else if (str1.equalsIgnoreCase("seeFriendlyInvisibles")) {
      if (!str2.equalsIgnoreCase("true") && !str2.equalsIgnoreCase("false"))
        throw new fxw("commands.scoreboard.teams.option.noValue", new Object[] { str1, Dne(Arrays.asList(new String[] { "true", "false" })) }); 
      yGE.FWm(str2.equalsIgnoreCase("true"));
    } 
    Dne(paramgnI, "commands.scoreboard.teams.option.success", new Object[] { str1, yGE.Dne(), str2 });
  }
  
  public List Dne(gnI paramgnI, String[] paramArrayOfString) {
    if (paramArrayOfString.length == 1)
      return Dne(paramArrayOfString, new String[] { "objectives", "players", "teams" }); 
    if (paramArrayOfString[0].equalsIgnoreCase("objectives")) {
      if (paramArrayOfString.length == 2)
        return Dne(paramArrayOfString, new String[] { "list", "add", "remove", "setdisplay" }); 
      if (paramArrayOfString[1].equalsIgnoreCase("add")) {
        if (paramArrayOfString.length == 4)
          return Dne(paramArrayOfString, PAf.Dne.keySet()); 
      } else if (paramArrayOfString[1].equalsIgnoreCase("remove")) {
        if (paramArrayOfString.length == 3)
          return Dne(paramArrayOfString, Dne(false)); 
      } else if (paramArrayOfString[1].equalsIgnoreCase("setdisplay")) {
        if (paramArrayOfString.length == 3)
          return Dne(paramArrayOfString, new String[] { "list", "sidebar", "belowName" }); 
        if (paramArrayOfString.length == 4)
          return Dne(paramArrayOfString, Dne(false)); 
      } 
    } else if (paramArrayOfString[0].equalsIgnoreCase("players")) {
      if (paramArrayOfString.length == 2)
        return Dne(paramArrayOfString, new String[] { "set", "add", "remove", "reset", "list" }); 
      if (!paramArrayOfString[1].equalsIgnoreCase("set") && !paramArrayOfString[1].equalsIgnoreCase("add") && !paramArrayOfString[1].equalsIgnoreCase("remove")) {
        if ((paramArrayOfString[1].equalsIgnoreCase("reset") || paramArrayOfString[1].equalsIgnoreCase("list")) && paramArrayOfString.length == 3)
          return Dne(paramArrayOfString, Dne().FWm()); 
      } else {
        if (paramArrayOfString.length == 3)
          return Dne(paramArrayOfString, Jwh.Dne().Dne()); 
        if (paramArrayOfString.length == 4)
          return Dne(paramArrayOfString, Dne(true)); 
      } 
    } else if (paramArrayOfString[0].equalsIgnoreCase("teams")) {
      if (paramArrayOfString.length == 2)
        return Dne(paramArrayOfString, new String[] { "add", "remove", "join", "leave", "empty", "list", "option" }); 
      if (paramArrayOfString[1].equalsIgnoreCase("join")) {
        if (paramArrayOfString.length == 3)
          return Dne(paramArrayOfString, Dne().Qnq()); 
        if (paramArrayOfString.length >= 4)
          return Dne(paramArrayOfString, Jwh.Dne().Dne()); 
      } else {
        if (paramArrayOfString[1].equalsIgnoreCase("leave"))
          return Dne(paramArrayOfString, Jwh.Dne().Dne()); 
        if (!paramArrayOfString[1].equalsIgnoreCase("empty") && !paramArrayOfString[1].equalsIgnoreCase("list") && !paramArrayOfString[1].equalsIgnoreCase("remove")) {
          if (paramArrayOfString[1].equalsIgnoreCase("option")) {
            if (paramArrayOfString.length == 3)
              return Dne(paramArrayOfString, Dne().Qnq()); 
            if (paramArrayOfString.length == 4)
              return Dne(paramArrayOfString, new String[] { "color", "friendlyfire", "seeFriendlyInvisibles" }); 
            if (paramArrayOfString.length == 5) {
              if (paramArrayOfString[3].equalsIgnoreCase("color"))
                return Dne(paramArrayOfString, Dne.Dne(true, false)); 
              if (paramArrayOfString[3].equalsIgnoreCase("friendlyfire") || paramArrayOfString[3].equalsIgnoreCase("seeFriendlyInvisibles"))
                return Dne(paramArrayOfString, new String[] { "true", "false" }); 
            } 
          } 
        } else if (paramArrayOfString.length == 3) {
          return Dne(paramArrayOfString, Dne().Qnq());
        } 
      } 
    } 
    return null;
  }
  
  protected void div(gnI paramgnI, String[] paramArrayOfString, int paramInt) {
    SFA sFA = Dne();
    YGE yGE = Dne(paramArrayOfString[paramInt++]);
    ArrayList arrayList = new ArrayList(yGE.Dne());
    if (arrayList.isEmpty())
      throw new WoB("commands.scoreboard.teams.empty.alreadyEmpty", new Object[] { yGE.Dne() }); 
    for (String str : arrayList)
      sFA.FWm(str, yGE); 
    Dne(paramgnI, "commands.scoreboard.teams.empty.success", new Object[] { Integer.valueOf(arrayList.size()), yGE.Dne() });
  }
  
  protected void Dne(gnI paramgnI) {
    SFA sFA = Dne();
    Collection collection = sFA.Dne();
    if (collection.size() <= 0)
      throw new WoB("commands.scoreboard.objectives.list.empty", new Object[0]); 
    paramgnI.Dne(Dne.bzF + paramgnI.Dne("commands.scoreboard.objectives.list.count", new Object[] { Integer.valueOf(collection.size()) }));
    for (vfE vfE : collection) {
      paramgnI.Dne(paramgnI.Dne("commands.scoreboard.objectives.list.entry", new Object[] { vfE.Dne(), vfE.FWm(), vfE.Dne().Dne() }));
    } 
  }
  
  protected void zGp(gnI paramgnI, String[] paramArrayOfString, int paramInt) {
    SFA sFA = Dne();
    YGE yGE = sFA.Dne(paramArrayOfString[paramInt++]);
    HashSet<String> hashSet = new HashSet();
    if (paramgnI instanceof FiG && paramInt == paramArrayOfString.length) {
      String str = Dne(paramgnI).Dne();
      sFA.Dne(str, yGE);
      hashSet.add(str);
    } else {
      while (paramInt < paramArrayOfString.length) {
        String str = Dne(paramgnI, paramArrayOfString[paramInt++]);
        sFA.Dne(str, yGE);
        hashSet.add(str);
      } 
    } 
    if (!hashSet.isEmpty())
      Dne(paramgnI, "commands.scoreboard.teams.join.success", new Object[] { Integer.valueOf(hashSet.size()), yGE.Dne(), Dne(hashSet.toArray((Object[])new String[0])) }); 
  }
  
  protected void FWm(gnI paramgnI, String[] paramArrayOfString, int paramInt) {
    String str = paramArrayOfString[paramInt++];
    SFA sFA = Dne();
    if (sFA.Dne(str) != null)
      throw new WoB("commands.scoreboard.teams.add.alreadyExists", new Object[] { str }); 
    if (str.length() > 16)
      throw new qwv("commands.scoreboard.teams.add.tooLong", new Object[] { str, Integer.valueOf(16) }); 
    YGE yGE = sFA.FWm(str);
    if (paramArrayOfString.length > paramInt) {
      String str1 = Dne(paramgnI, paramArrayOfString, paramInt);
      if (str1.length() > 32)
        throw new qwv("commands.scoreboard.teams.add.displayTooLong", new Object[] { str1, Integer.valueOf(32) }); 
      if (str1.length() > 0)
        yGE.Dne(str1); 
    } 
    Dne(paramgnI, "commands.scoreboard.teams.add.success", new Object[] { str });
  }
  
  protected void Dne(gnI paramgnI, String paramString) {
    SFA sFA = Dne();
    vfE vfE = Dne(paramString, false);
    sFA.Dne(vfE);
    Dne(paramgnI, "commands.scoreboard.objectives.remove.success", new Object[] { paramString });
  }
  
  public int Dne() {
    return 2;
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\FwH.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */