import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class aXt {
  private static final aXt Dne = new aXt();
  
  private List Dne = new ArrayList();
  
  public NMq Dne(Uqm paramUqm, Qnq paramQnq) {
    byte b1 = 0;
    NMq nMq1 = null;
    NMq nMq2 = null;
    byte b2;
    for (b2 = 0; b2 < paramUqm.Qnq(); b2++) {
      NMq nMq = paramUqm.Dne(b2);
      if (nMq != null) {
        if (!b1)
          nMq1 = nMq; 
        if (b1 == 1)
          nMq2 = nMq; 
        b1++;
      } 
    } 
    if (b1 == 2 && nMq1.bzF == nMq2.bzF && nMq1.Dne == 1 && nMq2.Dne == 1 && dEr.Dne[nMq1.bzF].DyG()) {
      mva mva = dEr.Dne[nMq1.bzF];
      int i = mva.aFZ() - nMq1.bzF();
      int j = mva.aFZ() - nMq2.bzF();
      int k = i + j + mva.aFZ() * 5 / 100;
      int m = mva.aFZ() - k;
      if (m < 0)
        m = 0; 
      return new NMq(nMq1.bzF, 1, m);
    } 
    for (b2 = 0; b2 < this.Dne.size(); b2++) {
      iQt iQt = this.Dne.get(b2);
      if (iQt.Dne(paramUqm, paramQnq))
        return iQt.Dne(paramUqm); 
    } 
    return null;
  }
  
  void Dne(NMq paramNMq, Object... paramVarArgs) {
    ArrayList<NMq> arrayList = new ArrayList();
    Object[] arrayOfObject = paramVarArgs;
    int i = paramVarArgs.length;
    for (byte b = 0; b < i; b++) {
      Object object = arrayOfObject[b];
      if (object instanceof NMq) {
        arrayList.add(((NMq)object).Dne());
      } else if (object instanceof dEr) {
        arrayList.add(new NMq((dEr)object));
      } else {
        if (!(object instanceof zKP))
          throw new RuntimeException("Invalid shapeless recipy!"); 
        arrayList.add(new NMq((zKP)object));
      } 
    } 
    this.Dne.add(new NDp(paramNMq, arrayList));
  }
  
  public List Dne() {
    return this.Dne;
  }
  
  UgS Dne(NMq paramNMq, Object... paramVarArgs) {
    String str = "";
    byte b1 = 0;
    int i = 0;
    byte b2 = 0;
    if (paramVarArgs[b1] instanceof String[]) {
      String[] arrayOfString = (String[])paramVarArgs[b1++];
      for (byte b = 0; b < arrayOfString.length; b++) {
        String str1 = arrayOfString[b];
        b2++;
        i = str1.length();
        str = str + str1;
      } 
    } else {
      while (paramVarArgs[b1] instanceof String) {
        String str1 = (String)paramVarArgs[b1++];
        b2++;
        i = str1.length();
        str = str + str1;
      } 
    } 
    HashMap<Object, Object> hashMap = new HashMap<>();
    while (b1 < paramVarArgs.length) {
      Character character = (Character)paramVarArgs[b1];
      NMq nMq = null;
      if (paramVarArgs[b1 + 1] instanceof dEr) {
        nMq = new NMq((dEr)paramVarArgs[b1 + 1]);
      } else if (paramVarArgs[b1 + 1] instanceof zKP) {
        nMq = new NMq((zKP)paramVarArgs[b1 + 1], 1, 32767);
      } else if (paramVarArgs[b1 + 1] instanceof NMq) {
        nMq = (NMq)paramVarArgs[b1 + 1];
      } 
      hashMap.put(character, nMq);
      b1 += 2;
    } 
    NMq[] arrayOfNMq = new NMq[i * b2];
    for (byte b3 = 0; b3 < i * b2; b3++) {
      char c = str.charAt(b3);
      if (hashMap.containsKey(Character.valueOf(c))) {
        arrayOfNMq[b3] = ((NMq)hashMap.get(Character.valueOf(c))).Dne();
      } else {
        arrayOfNMq[b3] = null;
      } 
    } 
    UgS ugS = new UgS(i, b2, arrayOfNMq, paramNMq);
    this.Dne.add(ugS);
    return ugS;
  }
  
  private aXt() {
    (new oPB()).Dne(this);
    (new RTA()).Dne(this);
    (new Gmj()).Dne(this);
    (new HeS()).Dne(this);
    (new Olj()).Dne(this);
    (new jWh()).Dne(this);
    (new ILu()).Dne(this);
    this.Dne.add(new MTP());
    this.Dne.add(new pnl());
    this.Dne.add(new JxZ());
    this.Dne.add(new VfL());
    Dne(new NMq(dEr.lMz, 3), new Object[] { "###", Character.valueOf('#'), dEr.XjO });
    Dne(new NMq(dEr.TKg, 1), new Object[] { dEr.lMz, dEr.lMz, dEr.lMz, dEr.LoG });
    Dne(new NMq(dEr.Jjb, 1), new Object[] { dEr.TKg, new NMq(dEr.edi, 1, 0), dEr.yMz });
    Dne(new NMq(zKP.sly, 2), new Object[] { "###", "###", Character.valueOf('#'), dEr.oIf });
    Dne(new NMq(zKP.dYY, 6, 0), new Object[] { "###", "###", Character.valueOf('#'), zKP.bzF });
    Dne(new NMq(zKP.dYY, 6, 1), new Object[] { "###", "###", Character.valueOf('#'), zKP.yMz });
    Dne(new NMq(zKP.TpV, 6), new Object[] { "###", "###", Character.valueOf('#'), zKP.iNH });
    Dne(new NMq(zKP.mzX, 1), new Object[] { "#W#", "#W#", Character.valueOf('#'), dEr.oIf, Character.valueOf('W'), zKP.Qnq });
    Dne(new NMq(zKP.jBE, 1), new Object[] { "###", "#X#", "###", Character.valueOf('#'), zKP.Qnq, Character.valueOf('X'), dEr.div });
    Dne(new NMq(zKP.EyB, 1), new Object[] { "###", "#X#", "###", Character.valueOf('#'), zKP.Qnq, Character.valueOf('X'), dEr.exS });
    Dne(new NMq(zKP.AgF, 1), new Object[] { "###", "XXX", "###", Character.valueOf('#'), zKP.Qnq, Character.valueOf('X'), dEr.TKg });
    Dne(new NMq(zKP.Jik, 1), new Object[] { "##", "##", Character.valueOf('#'), dEr.iNQ });
    Dne(new NMq(zKP.EwP, 6), new Object[] { "###", Character.valueOf('#'), zKP.Jik });
    Dne(new NMq(zKP.lMz, 1), new Object[] { "##", "##", Character.valueOf('#'), dEr.Jik });
    Dne(new NMq(zKP.tgc, 1), new Object[] { "##", "##", Character.valueOf('#'), dEr.xEx });
    Dne(new NMq(zKP.fYA, 1), new Object[] { "##", "##", Character.valueOf('#'), dEr.XwR });
    Dne(new NMq(zKP.PpL, 1), new Object[] { "##", "##", Character.valueOf('#'), dEr.RMv });
    Dne(new NMq(zKP.RPx, 1), new Object[] { "##", "##", Character.valueOf('#'), dEr.AgF });
    Dne(new NMq(zKP.qXo, 1), new Object[] { "X#X", "#X#", "X#X", Character.valueOf('X'), dEr.cot, Character.valueOf('#'), zKP.IjH });
    Dne(new NMq(zKP.FWm, 6, 3), new Object[] { "###", Character.valueOf('#'), zKP.bzF });
    Dne(new NMq(zKP.FWm, 6, 0), new Object[] { "###", Character.valueOf('#'), zKP.Dne });
    Dne(new NMq(zKP.FWm, 6, 1), new Object[] { "###", Character.valueOf('#'), zKP.ceE });
    Dne(new NMq(zKP.FWm, 6, 4), new Object[] { "###", Character.valueOf('#'), zKP.tgc });
    Dne(new NMq(zKP.FWm, 6, 5), new Object[] { "###", Character.valueOf('#'), zKP.WvN });
    Dne(new NMq(zKP.FWm, 6, 6), new Object[] { "###", Character.valueOf('#'), zKP.iNH });
    Dne(new NMq(zKP.FWm, 6, 7), new Object[] { "###", Character.valueOf('#'), zKP.PpL });
    Dne(new NMq((zKP)zKP.Qnq, 6, 0), new Object[] { "###", Character.valueOf('#'), new NMq((zKP)zKP.Qnq, 1, 0) });
    Dne(new NMq((zKP)zKP.Qnq, 6, 2), new Object[] { "###", Character.valueOf('#'), new NMq((zKP)zKP.Qnq, 1, 2) });
    Dne(new NMq((zKP)zKP.Qnq, 6, 1), new Object[] { "###", Character.valueOf('#'), new NMq((zKP)zKP.Qnq, 1, 1) });
    Dne(new NMq((zKP)zKP.Qnq, 6, 3), new Object[] { "###", Character.valueOf('#'), new NMq((zKP)zKP.Qnq, 1, 3) });
    Dne(new NMq(zKP.ZfC, 3), new Object[] { "# #", "###", "# #", Character.valueOf('#'), dEr.oIf });
    Dne(new NMq(dEr.BJH, 1), new Object[] { "##", "##", "##", Character.valueOf('#'), zKP.Qnq });
    Dne(new NMq(zKP.edi, 2), new Object[] { "###", "###", Character.valueOf('#'), zKP.Qnq });
    Dne(new NMq(dEr.JLG, 1), new Object[] { "##", "##", "##", Character.valueOf('#'), dEr.IjH });
    Dne(new NMq(dEr.FYZ, 3), new Object[] { "###", "###", " X ", Character.valueOf('#'), zKP.Qnq, Character.valueOf('X'), dEr.oIf });
    Dne(new NMq(dEr.iXU, 1), new Object[] { 
          "AAA", "BEB", "CCC", Character.valueOf('A'), dEr.EwP, Character.valueOf('B'), dEr.WvN, Character.valueOf('C'), dEr.EWz, Character.valueOf('E'), 
          dEr.KLR });
    Dne(new NMq(dEr.WvN, 1), new Object[] { "#", Character.valueOf('#'), dEr.XjO });
    Dne(new NMq((zKP)zKP.Qnq, 4, 0), new Object[] { "#", Character.valueOf('#'), new NMq(zKP.udO, 1, 0) });
    Dne(new NMq((zKP)zKP.Qnq, 4, 1), new Object[] { "#", Character.valueOf('#'), new NMq(zKP.udO, 1, 1) });
    Dne(new NMq((zKP)zKP.Qnq, 4, 2), new Object[] { "#", Character.valueOf('#'), new NMq(zKP.udO, 1, 2) });
    Dne(new NMq((zKP)zKP.Qnq, 4, 3), new Object[] { "#", Character.valueOf('#'), new NMq(zKP.udO, 1, 3) });
    Dne(new NMq(dEr.oIf, 4), new Object[] { "#", "#", Character.valueOf('#'), zKP.Qnq });
    Dne(new NMq(zKP.Wwe, 4), new Object[] { "X", "#", Character.valueOf('X'), dEr.DyG, Character.valueOf('#'), dEr.oIf });
    Dne(new NMq(zKP.Wwe, 4), new Object[] { "X", "#", Character.valueOf('X'), new NMq(dEr.DyG, 1, 1), Character.valueOf('#'), dEr.oIf });
    Dne(new NMq(dEr.vSL, 4), new Object[] { "# #", " # ", Character.valueOf('#'), zKP.Qnq });
    Dne(new NMq(dEr.OCU, 3), new Object[] { "# #", " # ", Character.valueOf('#'), zKP.trS });
    Dne(new NMq(zKP.FYZ, 16), new Object[] { "X X", "X#X", "X X", Character.valueOf('X'), dEr.IjH, Character.valueOf('#'), dEr.oIf });
    Dne(new NMq(zKP.OdI, 6), new Object[] { "X X", "X#X", "XRX", Character.valueOf('X'), dEr.mrb, Character.valueOf('R'), dEr.exS, Character.valueOf('#'), dEr.oIf });
    Dne(new NMq(zKP.Dsg, 6), new Object[] { "XSX", "X#X", "XSX", Character.valueOf('X'), dEr.IjH, Character.valueOf('#'), zKP.CZC, Character.valueOf('S'), dEr.oIf });
    Dne(new NMq(zKP.oIf, 6), new Object[] { "X X", "X#X", "XRX", Character.valueOf('X'), dEr.IjH, Character.valueOf('R'), dEr.exS, Character.valueOf('#'), zKP.xXN });
    Dne(new NMq(dEr.IYC, 1), new Object[] { "# #", "###", Character.valueOf('#'), dEr.IjH });
    Dne(new NMq(dEr.yaZ, 1), new Object[] { "# #", "# #", "###", Character.valueOf('#'), dEr.IjH });
    Dne(new NMq(dEr.ZkM, 1), new Object[] { " B ", "###", Character.valueOf('#'), zKP.bzF, Character.valueOf('B'), dEr.TpV });
    Dne(new NMq(zKP.XwR, 1), new Object[] { "A", "B", Character.valueOf('A'), zKP.aJO, Character.valueOf('B'), zKP.Wwe });
    Dne(new NMq(dEr.sly, 1), new Object[] { "A", "B", Character.valueOf('A'), zKP.Dne, Character.valueOf('B'), dEr.IYC });
    Dne(new NMq(dEr.aJO, 1), new Object[] { "A", "B", Character.valueOf('A'), zKP.haP, Character.valueOf('B'), dEr.IYC });
    Dne(new NMq(dEr.Dsg, 1), new Object[] { "A", "B", Character.valueOf('A'), zKP.qXo, Character.valueOf('B'), dEr.IYC });
    Dne(new NMq(dEr.yHt, 1), new Object[] { "A", "B", Character.valueOf('A'), zKP.Dne, Character.valueOf('B'), dEr.IYC });
    Dne(new NMq(dEr.CZC, 1), new Object[] { "# #", "###", Character.valueOf('#'), zKP.Qnq });
    Dne(new NMq(dEr.qMV, 1), new Object[] { "# #", " # ", Character.valueOf('#'), dEr.IjH });
    Dne(new NMq(dEr.ZeN, 1), new Object[] { "# #", " # ", Character.valueOf('#'), dEr.xEx });
    Dne(new NMq(dEr.Qnq, 1), new Object[] { "A ", " B", Character.valueOf('A'), dEr.IjH, Character.valueOf('B'), dEr.haP });
    Dne(new NMq(dEr.rPc, 1), new Object[] { "###", Character.valueOf('#'), dEr.EWz });
    Dne(new NMq(zKP.One, 4), new Object[] { "#  ", "## ", "###", Character.valueOf('#'), new NMq((zKP)zKP.Qnq, 1, 0) });
    Dne(new NMq(zKP.Kvh, 4), new Object[] { "#  ", "## ", "###", Character.valueOf('#'), new NMq((zKP)zKP.Qnq, 1, 2) });
    Dne(new NMq(zKP.CLK, 4), new Object[] { "#  ", "## ", "###", Character.valueOf('#'), new NMq((zKP)zKP.Qnq, 1, 1) });
    Dne(new NMq(zKP.FUM, 4), new Object[] { "#  ", "## ", "###", Character.valueOf('#'), new NMq((zKP)zKP.Qnq, 1, 3) });
    Dne(new NMq(dEr.Dne, 1), new Object[] { "  #", " #X", "# X", Character.valueOf('#'), dEr.oIf, Character.valueOf('X'), dEr.AgF });
    Dne(new NMq(dEr.etZ, 1), new Object[] { "# ", " X", Character.valueOf('#'), dEr.Dne, Character.valueOf('X'), dEr.dYY }).Dne();
    Dne(new NMq(zKP.BJH, 4), new Object[] { "#  ", "## ", "###", Character.valueOf('#'), zKP.bzF });
    Dne(new NMq(zKP.qqL, 4), new Object[] { "#  ", "## ", "###", Character.valueOf('#'), zKP.tgc });
    Dne(new NMq(zKP.yIR, 4), new Object[] { "#  ", "## ", "###", Character.valueOf('#'), zKP.WvN });
    Dne(new NMq(zKP.ivB, 4), new Object[] { "#  ", "## ", "###", Character.valueOf('#'), zKP.iNH });
    Dne(new NMq(zKP.Wnd, 4), new Object[] { "#  ", "## ", "###", Character.valueOf('#'), zKP.ceE });
    Dne(new NMq(zKP.RMv, 4), new Object[] { "#  ", "## ", "###", Character.valueOf('#'), zKP.PpL });
    Dne(new NMq(dEr.ICU, 1), new Object[] { "###", "#X#", "###", Character.valueOf('#'), dEr.oIf, Character.valueOf('X'), zKP.RPx });
    Dne(new NMq(dEr.FUM, 1), new Object[] { "###", "#X#", "###", Character.valueOf('#'), dEr.oIf, Character.valueOf('X'), dEr.LoG });
    Dne(new NMq(dEr.ZfC, 1, 0), new Object[] { "###", "#X#", "###", Character.valueOf('#'), dEr.uzC, Character.valueOf('X'), dEr.aFZ });
    Dne(new NMq(dEr.ZfC, 1, 1), new Object[] { "###", "#X#", "###", Character.valueOf('#'), zKP.Fnk, Character.valueOf('X'), dEr.aFZ });
    Dne(new NMq(dEr.gpt, 1, 0), new Object[] { "###", "#X#", "###", Character.valueOf('#'), dEr.uzC, Character.valueOf('X'), dEr.dYY });
    Dne(new NMq(zKP.cHy, 1), new Object[] { "X", "#", Character.valueOf('#'), zKP.bzF, Character.valueOf('X'), dEr.oIf });
    Dne(new NMq(zKP.Dne, 2), new Object[] { "I", "S", "#", Character.valueOf('#'), zKP.Qnq, Character.valueOf('S'), dEr.oIf, Character.valueOf('I'), dEr.IjH });
    Dne(new NMq(zKP.CZC, 1), new Object[] { "X", "#", Character.valueOf('#'), dEr.oIf, Character.valueOf('X'), dEr.exS });
    Dne(new NMq(dEr.Sdr, 1), new Object[] { "#X#", "III", Character.valueOf('#'), zKP.CZC, Character.valueOf('X'), dEr.exS, Character.valueOf('I'), zKP.Dne });
    Dne(new NMq(dEr.NEG, 1), new Object[] { " # ", "#X#", "III", Character.valueOf('#'), zKP.CZC, Character.valueOf('X'), dEr.RMv, Character.valueOf('I'), zKP.Dne });
    Dne(new NMq(dEr.fYA, 1), new Object[] { " # ", "#X#", " # ", Character.valueOf('#'), dEr.mrb, Character.valueOf('X'), dEr.exS });
    Dne(new NMq(dEr.Suj, 1), new Object[] { " # ", "#X#", " # ", Character.valueOf('#'), dEr.IjH, Character.valueOf('X'), dEr.exS });
    Dne(new NMq(dEr.Dne, 1), new Object[] { "###", "#X#", "###", Character.valueOf('#'), dEr.lMz, Character.valueOf('X'), dEr.Suj });
    Dne(new NMq(zKP.LoG, 1), new Object[] { "#", Character.valueOf('#'), zKP.Dne });
    Dne(new NMq(zKP.gpt, 1), new Object[] { "#", Character.valueOf('#'), zKP.Qnq });
    Dne(new NMq(zKP.xXN, 1), new Object[] { "##", Character.valueOf('#'), zKP.Dne });
    Dne(new NMq(zKP.YHU, 1), new Object[] { "##", Character.valueOf('#'), zKP.Qnq });
    Dne(new NMq(zKP.kQw, 1), new Object[] { "##", Character.valueOf('#'), dEr.IjH });
    Dne(new NMq(zKP.Pwe, 1), new Object[] { "##", Character.valueOf('#'), dEr.mrb });
    Dne(new NMq(zKP.Vxn, 1), new Object[] { "###", "#X#", "#R#", Character.valueOf('#'), zKP.bzF, Character.valueOf('X'), dEr.Dne, Character.valueOf('R'), dEr.exS });
    Dne(new NMq(zKP.yHt, 1), new Object[] { "###", "# #", "#R#", Character.valueOf('#'), zKP.bzF, Character.valueOf('R'), dEr.exS });
    Dne(new NMq(zKP.FWm, 1), new Object[] { 
          "TTT", "#X#", "#R#", Character.valueOf('#'), zKP.bzF, Character.valueOf('X'), dEr.IjH, Character.valueOf('R'), dEr.exS, Character.valueOf('T'), 
          zKP.Qnq });
    Dne(new NMq(zKP.Dne, 1), new Object[] { "S", "P", Character.valueOf('S'), dEr.jBE, Character.valueOf('P'), zKP.FWm });
    Dne(new NMq(dEr.Kmf, 1), new Object[] { "###", "XXX", Character.valueOf('#'), zKP.RPx, Character.valueOf('X'), zKP.Qnq });
    Dne(new NMq(zKP.KkE, 1), new Object[] { " B ", "D#D", "###", Character.valueOf('#'), zKP.cot, Character.valueOf('B'), dEr.TKg, Character.valueOf('D'), dEr.div });
    Dne(new NMq(zKP.etZ, 1), new Object[] { "III", " i ", "iii", Character.valueOf('I'), zKP.gnI, Character.valueOf('i'), dEr.IjH });
    Dne(new NMq(dEr.Woy, 1), new Object[] { dEr.iNH, dEr.dNY });
    Dne(new NMq(dEr.lDk, 3), new Object[] { dEr.cot, dEr.dNY, dEr.DyG });
    Dne(new NMq(dEr.lDk, 3), new Object[] { dEr.cot, dEr.dNY, new NMq(dEr.DyG, 1, 1) });
    Dne(new NMq(zKP.Dne), new Object[] { "GGG", "QQQ", "WWW", Character.valueOf('G'), zKP.trS, Character.valueOf('Q'), dEr.RMv, Character.valueOf('W'), zKP.Qnq });
    Dne(new NMq(zKP.Dne), new Object[] { "I I", "ICI", " I ", Character.valueOf('I'), dEr.IjH, Character.valueOf('C'), zKP.Dne });
    Collections.sort(this.Dne, new Ddl(this));
    System.out.println(this.Dne.size() + " recipes");
  }
  
  public static final aXt Dne() {
    return (aXt)Dne;
  }
}


/* Location:              C:\Users\fract\Downloads\ERROR422.jar!\aXt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */