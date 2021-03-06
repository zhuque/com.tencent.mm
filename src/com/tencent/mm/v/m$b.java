package com.tencent.mm.v;

import com.tencent.mm.sdk.platformtools.be;
import com.tencent.mm.sdk.platformtools.v;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class m$b
{
  public JSONObject bAX = null;
  private boolean bAY = true;
  public boolean bAZ = false;
  public boolean bBa = false;
  public boolean bBb = false;
  private String bBc;
  private String bBd;
  private List<e> bBe = null;
  private c bBf = null;
  private b bBg = null;
  private d bBh = null;
  m.b.b.b bBi = null;
  private boolean bBj = false;
  boolean bBk = false;
  int bBl;
  public boolean bBm = false;
  public int bBn = 0;
  private int bBo = 0;
  private String bBp;
  private a bBq = null;
  private int bBr = 0;
  private int bBs = m.bAQ;
  private String bBt;
  private boolean bBu = false;
  public int bBv;
  private f bBw;
  private String bBx;
  private String bBy;
  private boolean bBz = false;
  
  static b gS(String paramString)
  {
    b localb = new b();
    if (be.kf(paramString)) {
      return localb;
    }
    try
    {
      System.currentTimeMillis();
      bAX = new JSONObject(paramString);
      return localb;
    }
    catch (Exception paramString)
    {
      v.e("MicroMsg.BizInfo", "exception:%s", new Object[] { be.f(paramString) });
    }
    return localb;
  }
  
  public final boolean wD()
  {
    boolean bool = false;
    if (bAX != null)
    {
      if (be.getInt(bAX.optString("ReportLocationType"), 0) > 0) {
        bool = true;
      }
      bBj = bool;
    }
    return bBj;
  }
  
  public final boolean wN()
  {
    if ((bAX != null) && (bAX.optJSONObject("WifiBizInfo") != null) && (bAX.optJSONObject("WifiBizInfo").optInt("IsWXWiFi") == 1)) {
      bBz = true;
    }
    return bBz;
  }
  
  public final boolean wO()
  {
    if (bAX != null) {
      bBs = be.getInt(bAX.optString("NotifyManage"), m.bAQ);
    }
    return bBs == m.bAP;
  }
  
  public final String wP()
  {
    if (bAX != null) {
      bBc = bAX.optString("VerifyContactPromptTitle");
    }
    return bBc;
  }
  
  public final String wQ()
  {
    if (bAX != null) {
      bBx = bAX.optString("TrademarkUrl");
    }
    return bBx;
  }
  
  public final String wR()
  {
    if (bAX != null) {
      bBy = bAX.optString("TrademarkName");
    }
    return bBy;
  }
  
  public final String wS()
  {
    if (bAX != null) {
      bBd = bAX.optString("ConferenceContactExpireTime");
    }
    return bBd;
  }
  
  public final List<e> wT()
  {
    if ((bAX != null) && (bBe == null)) {
      bBe = e.c(bAX.optJSONArray("Privilege"));
    }
    return bBe;
  }
  
  public final int wU()
  {
    if (bAX != null) {
      bBr = bAX.optInt("InteractiveMode");
    }
    return bBr;
  }
  
  public final d wV()
  {
    if ((bAX != null) && (bBh == null)) {
      bBh = d.gX(bAX.optString("PayShowInfo"));
    }
    return bBh;
  }
  
  public final a wW()
  {
    if ((bAX != null) && (bBq == null))
    {
      String str = bAX.optString("HardwareBizInfo");
      if (str != null) {
        bBq = a.gT(str);
      }
    }
    return bBq;
  }
  
  public final c wX()
  {
    if ((bAX != null) && (bBf == null)) {
      bBf = c.gW(bAX.optString("VerifySource"));
    }
    return bBf;
  }
  
  public final f wY()
  {
    if ((bAX != null) && (bBw == null))
    {
      String str = bAX.optString("RegisterSource");
      if (str != null) {
        bBw = f.gY(str);
      }
    }
    return bBw;
  }
  
  public final boolean wZ()
  {
    boolean bool = true;
    if (bAX != null) {
      if (be.getInt(bAX.optString("IsTrademarkProtection"), 0) != 1) {
        break label37;
      }
    }
    for (;;)
    {
      bBu = bool;
      return bBu;
      label37:
      bool = false;
    }
  }
  
  public final int xa()
  {
    if (bAX != null) {
      bBo = bAX.optInt("ServiceType", 0);
    }
    return bBo;
  }
  
  public final String xb()
  {
    if (bAX != null) {
      bBp = bAX.optString("SupportEmoticonLinkPrefix");
    }
    return bBp;
  }
  
  public final b xc()
  {
    if ((bAX != null) && (bBg == null))
    {
      String str = bAX.optString("MMBizMenu");
      if (str != null) {
        bBg = b.gU(str);
      }
    }
    return bBg;
  }
  
  public final String xd()
  {
    if (bAX != null) {
      bBt = bAX.optString("ServicePhone");
    }
    return bBt;
  }
  
  public final m.b.b.b xe()
  {
    if ((bAX != null) && (bBi == null))
    {
      String str = bAX.optString("EnterpriseBizInfo");
      if (str != null) {
        bBi = m.b.b.b.gV(str);
      }
    }
    return bBi;
  }
  
  public static final class a
  {
    public int bBA;
    public int bBB;
    public int bBC;
    
    public static a gT(String paramString)
    {
      v.i("MicroMsg.BizInfo", "HardwareBizInfo = " + paramString);
      a locala = new a();
      if ((paramString == null) || (paramString.length() <= 0)) {
        return locala;
      }
      try
      {
        paramString = new JSONObject(paramString);
        bBA = paramString.optInt("hardware_flag");
        bBB = paramString.optInt("connect_status_display_mode");
        bBC = paramString.optInt("special_internal_brand_type");
        return locala;
      }
      catch (JSONException paramString)
      {
        v.e("MicroMsg.BizInfo", "exception:%s", new Object[] { be.f(paramString) });
      }
      return locala;
    }
    
    public final boolean xf()
    {
      return (bBA & 0x1) > 0;
    }
  }
  
  public static final class b
  {
    public int bBD;
    public List<a> bBE = null;
    
    public static b gU(String paramString)
    {
      v.i("MicroMsg.BizInfo", "MenuInfo = " + paramString);
      b localb = new b();
      if ((paramString == null) || (paramString.length() <= 0)) {
        return localb;
      }
      try
      {
        paramString = new JSONObject(paramString);
        bBD = paramString.optInt("update_time");
        bBE = a.b(paramString.optJSONArray("button_list"));
        return localb;
      }
      catch (JSONException paramString)
      {
        v.e("MicroMsg.BizInfo", "exception:%s", new Object[] { be.f(paramString) });
      }
      return localb;
    }
    
    public static final class a
    {
      public static String bBF = "menu_click";
      public static String bBG = "menu_action_start";
      public static String bBH = "menu_action_success";
      public String DF;
      public String bBI;
      public List<a> bBJ = null;
      public String bBK;
      public int bBL;
      public String content;
      public int id;
      public String name;
      public int type;
      public String value;
      
      public static List<a> b(JSONArray paramJSONArray)
      {
        Object localObject;
        if (paramJSONArray != null) {
          try
          {
            ArrayList localArrayList = new ArrayList();
            int j = paramJSONArray.length();
            int i = 0;
            for (;;)
            {
              localObject = localArrayList;
              if (i >= j) {
                break;
              }
              localObject = paramJSONArray.getJSONObject(i);
              a locala = new a();
              id = ((JSONObject)localObject).getInt("id");
              type = ((JSONObject)localObject).getInt("type");
              name = ((JSONObject)localObject).getString("name");
              DF = ((JSONObject)localObject).getString("key");
              value = ((JSONObject)localObject).optString("value");
              bBI = ((JSONObject)localObject).optString("native_url");
              v.d("MicroMsg.BizInfo", "menuItem.nativeurl : " + bBI);
              bBJ = b(((JSONObject)localObject).optJSONArray("sub_button_list"));
              bBL = ((JSONObject)localObject).optInt("acttype");
              localArrayList.add(locala);
              i += 1;
            }
            localObject = null;
          }
          catch (JSONException paramJSONArray)
          {
            v.e("MicroMsg.BizInfo", "exception:%s", new Object[] { be.f(paramJSONArray) });
            return null;
          }
        }
        return (List<a>)localObject;
      }
      
      public static LinkedList<a> i(Map<String, String> paramMap)
      {
        if (paramMap == null) {
          return null;
        }
        int j = be.getInt((String)paramMap.get(".msg.appmsg.buttonlist.$count"), 0);
        if (j > 0) {
          try
          {
            LinkedList localLinkedList = new LinkedList();
            v.v("MicroMsg.BizInfo", "menuItem.jsonArray.length : " + j);
            int i = 0;
            if (i < j)
            {
              a locala = new a();
              StringBuilder localStringBuilder = new StringBuilder(".msg.appmsg.buttonlist.button");
              if (i == 0) {}
              for (String str = "";; str = String.valueOf(i))
              {
                str = str;
                id = be.getInt((String)paramMap.get(str + ".id"), 0);
                type = be.getInt((String)paramMap.get(str + ".type"), 0);
                name = ((String)paramMap.get(str + ".name"));
                DF = ((String)paramMap.get(str + ".key"));
                value = ((String)paramMap.get(str + ".value"));
                bBL = be.getInt((String)paramMap.get(str + ".acttype"), 0);
                localLinkedList.add(locala);
                i += 1;
                break;
              }
            }
            return localLinkedList;
          }
          catch (Exception paramMap)
          {
            v.e("MicroMsg.BizInfo", "exception:%s", new Object[] { be.f(paramMap) });
            return null;
          }
        }
        return null;
      }
      
      public final void g(ArrayList<String> paramArrayList)
      {
        if (paramArrayList.size() == 0)
        {
          v.e("MicroMsg.BizInfo", "value null!");
          return;
        }
        JSONArray localJSONArray;
        try
        {
          localJSONArray = new JSONArray();
          paramArrayList = paramArrayList.iterator();
          while (paramArrayList.hasNext())
          {
            String str = (String)paramArrayList.next();
            JSONObject localJSONObject = new JSONObject();
            localJSONObject.put("pic_md5", str);
            localJSONArray.put(localJSONObject);
          }
          paramArrayList = new JSONObject();
        }
        catch (JSONException paramArrayList)
        {
          v.e("MicroMsg.BizInfo", paramArrayList.toString());
          return;
        }
        paramArrayList.put("pics", localJSONArray);
        content = paramArrayList.toString();
        v.v("MicroMsg.BizInfo", content);
      }
      
      public final String getInfo()
      {
        if (content == null) {
          content = "";
        }
        if (bBK == null) {
          if (type != 4) {
            break label82;
          }
        }
        label82:
        for (bBK = bBG;; bBK = bBF) {
          return String.format("%s<info><id><![CDATA[%d]]></id><key><![CDATA[%s]]></key><status><![CDATA[%s]]></status><content><![CDATA[%s]]></content></info>", new Object[] { "#bizmenu#", Integer.valueOf(id), DF, bBK, content });
        }
      }
      
      public final String toString()
      {
        int i = id;
        int j = bBL;
        int k = type;
        String str1;
        String str2;
        label37:
        String str3;
        if (name == null)
        {
          str1 = "";
          if (DF != null) {
            break label122;
          }
          str2 = "";
          if (value != null) {
            break label131;
          }
          str3 = "";
          label48:
          if (content != null) {
            break label140;
          }
        }
        label122:
        label131:
        label140:
        for (String str4 = "";; str4 = content)
        {
          return String.format("id:%d, type:%d, acttype:%s, name:%s, key:%s, value:%s, content:%s", new Object[] { Integer.valueOf(i), Integer.valueOf(j), Integer.valueOf(k), str1, str2, str3, str4 });
          str1 = name;
          break;
          str2 = DF;
          break label37;
          str3 = value;
          break label48;
        }
      }
    }
    
    public static final class b
    {
      public String bBM;
      public String bBN;
      public int bBO;
      public String bBP;
      public String bBQ;
      
      public static b gV(String paramString)
      {
        v.i("MicroMsg.BizInfo", "EnterpriseBizInfo = " + paramString);
        b localb = new b();
        if ((paramString == null) || (paramString.length() <= 0)) {
          return localb;
        }
        try
        {
          paramString = new JSONObject(paramString);
          bBM = paramString.optString("belong");
          bBN = paramString.optString("freeze_wording");
          bBO = paramString.optInt("child_type");
          bBP = paramString.optString("home_url");
          paramString = paramString.optString("exattr");
          if (paramString == null)
          {
            bBQ = null;
            return localb;
          }
        }
        catch (JSONException paramString)
        {
          v.e("MicroMsg.BizInfo", "exception:%s", new Object[] { be.f(paramString) });
          return localb;
        }
        bBQ = new JSONObject(paramString).optString("chat_extension_url");
        return localb;
      }
    }
  }
  
  public static final class c
  {
    public int bBR = 0;
    public String bBS;
    public String bBT;
    public String bBU;
    public String bBV;
    
    public static c gW(String paramString)
    {
      if (be.kf(paramString)) {
        return null;
      }
      v.i("MicroMsg.BizInfo", "biz verify info is [%s]", new Object[] { paramString });
      c localc = new c();
      try
      {
        paramString = new JSONObject(paramString);
        bBR = paramString.optInt("Type");
        bBS = paramString.optString("Description");
        bBT = paramString.optString("Name");
        bBU = paramString.optString("IntroUrl");
        bBV = paramString.optString("VerifySubTitle");
        v.i("MicroMsg.BizInfo", "type[%d],desc[%s],name[%s],url[%s]", new Object[] { Integer.valueOf(bBR), bBS, bBT, bBU });
        return localc;
      }
      catch (Exception paramString)
      {
        for (;;)
        {
          v.e("MicroMsg.BizInfo", "exception:%s", new Object[] { be.f(paramString) });
        }
      }
    }
  }
  
  public static final class d
  {
    public int bBW;
    public String bBX;
    public List<String> bBY;
    public String bBZ;
    
    public static d gX(String paramString)
    {
      if (be.kf(paramString)) {
        return null;
      }
      try
      {
        d locald = new d();
        paramString = new JSONObject(paramString);
        bBW = paramString.optInt("reputation_level", -1);
        bBX = paramString.optString("scope_of_business");
        bBZ = paramString.optString("guarantee_detail_h5_url");
        paramString = paramString.optJSONArray("guarantee_info");
        if (paramString != null)
        {
          int j = paramString.length();
          if (j > 0)
          {
            bBY = new ArrayList();
            int i = 0;
            while (i < j)
            {
              String str = paramString.getString(i);
              if (!be.kf(str)) {
                bBY.add(str);
              }
              i += 1;
            }
          }
        }
        return locald;
      }
      catch (Exception paramString)
      {
        v.e("MicroMsg.BizInfo", "exception:%s", new Object[] { be.f(paramString) });
      }
      return null;
    }
  }
  
  public static final class e
  {
    public String bCa;
    public String description;
    public String iconUrl;
    
    public static List<e> c(JSONArray paramJSONArray)
    {
      localLinkedList = new LinkedList();
      if (paramJSONArray == null) {}
      for (;;)
      {
        return localLinkedList;
        try
        {
          int j = paramJSONArray.length();
          int i = 0;
          while (i < j)
          {
            e locale = new e();
            JSONObject localJSONObject = paramJSONArray.optJSONObject(i);
            iconUrl = localJSONObject.optString("icon");
            description = localJSONObject.optString("description");
            bCa = localJSONObject.optString("description_key");
            localLinkedList.add(locale);
            i += 1;
          }
          return localLinkedList;
        }
        catch (Exception paramJSONArray)
        {
          v.e("MicroMsg.BizInfo", "exception:%s", new Object[] { be.f(paramJSONArray) });
        }
      }
    }
  }
  
  public static final class f
  {
    public String bCb;
    public String bCc;
    
    public static f gY(String paramString)
    {
      v.i("MicroMsg.BizInfo", "RegisterSource = %s", new Object[] { paramString });
      f localf = new f();
      if ((paramString == null) || (paramString.length() <= 0)) {
        return localf;
      }
      try
      {
        paramString = new JSONObject(paramString);
        bCb = paramString.optString("RegisterBody");
        bCc = paramString.optString("IntroUrl");
        return localf;
      }
      catch (JSONException paramString)
      {
        v.e("MicroMsg.BizInfo", "exception in RegisterSource:%s", new Object[] { be.f(paramString) });
      }
      return localf;
    }
  }
}

/* Location:
 * Qualified Name:     com.tencent.mm.v.m.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */