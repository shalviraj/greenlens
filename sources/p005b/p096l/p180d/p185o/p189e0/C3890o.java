package p005b.p096l.p180d.p185o.p189e0;

import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.collection.ArrayMap;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;
import p005b.p006a.p007a.p024o.C0823f;
import p005b.p096l.p097a.p113c.p119b.p124n.C1955a;
import p005b.p096l.p097a.p113c.p131e.p136e.C2034ac;
import p005b.p096l.p097a.p113c.p131e.p136e.C2283kc;
import p005b.p096l.p097a.p113c.p131e.p136e.C2341mm;
import p005b.p096l.p097a.p113c.p131e.p136e.C2440r1;

/* renamed from: b.l.d.o.e0.o */
public final class C3890o {

    /* renamed from: a */
    public static final C1955a f7169a = new C1955a("JSONParser", new String[0]);

    @NonNull
    /* renamed from: a */
    public static Map<String, Object> m7279a(String str) {
        byte[] bArr;
        C0823f.m376j(str);
        List<String> b = new C2440r1(new C2341mm(new C2283kc())).mo12961b(str);
        if (b.size() < 2) {
            f7169a.mo12283b(str.length() != 0 ? "Invalid idToken ".concat(str) : new String("Invalid idToken "), new Object[0]);
            return new HashMap();
        }
        String str2 = b.get(1);
        try {
            if (str2 == null) {
                bArr = null;
            } else {
                bArr = Base64.decode(str2, 11);
            }
            Map<String, Object> b2 = m7280b(new String(bArr, "UTF-8"));
            return b2 == null ? new HashMap() : b2;
        } catch (UnsupportedEncodingException e) {
            C1955a aVar = f7169a;
            Log.e(aVar.f3501a, aVar.mo12284c("Unable to decode token", new Object[0]), e);
            return new HashMap();
        }
    }

    @Nullable
    /* renamed from: b */
    public static Map<String, Object> m7280b(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject != JSONObject.NULL) {
                return m7281c(jSONObject);
            }
            return null;
        } catch (Exception e) {
            Log.d("JSONParser", "Failed to parse JSONObject into Map.");
            throw new C2034ac(e);
        }
    }

    /* renamed from: c */
    public static Map<String, Object> m7281c(JSONObject jSONObject) {
        ArrayMap arrayMap = new ArrayMap();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            Object obj = jSONObject.get(next);
            if (obj instanceof JSONArray) {
                obj = m7282d((JSONArray) obj);
            } else if (obj instanceof JSONObject) {
                obj = m7281c((JSONObject) obj);
            }
            arrayMap.put(next, obj);
        }
        return arrayMap;
    }

    /* renamed from: d */
    public static List<Object> m7282d(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            Object obj = jSONArray.get(i);
            if (obj instanceof JSONArray) {
                obj = m7282d((JSONArray) obj);
            } else if (obj instanceof JSONObject) {
                obj = m7281c((JSONObject) obj);
            }
            arrayList.add(obj);
        }
        return arrayList;
    }
}
