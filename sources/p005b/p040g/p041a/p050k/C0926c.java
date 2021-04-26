package p005b.p040g.p041a.p050k;

import android.os.Build;
import android.text.TextUtils;
import android.util.Base64;
import com.amplitude.api.DeviceInfo;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import p005b.p096l.p224e.C4465k;

/* renamed from: b.g.a.k.c */
public class C0926c {

    /* renamed from: a */
    public final Map<String, String> f835a;

    /* renamed from: b */
    public final String f836b;

    public C0926c(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            this.f835a = Collections.emptyMap();
            this.f836b = null;
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put(DeviceInfo.OS_NAME, String.valueOf(Build.VERSION.SDK_INT));
        if (!TextUtils.isEmpty((CharSequence) null)) {
            hashMap.put("auth0.android", (Object) null);
        }
        Map<String, String> unmodifiableMap = Collections.unmodifiableMap(hashMap);
        this.f835a = unmodifiableMap;
        HashMap hashMap2 = new HashMap();
        hashMap2.put("name", str);
        if (!TextUtils.isEmpty(str2)) {
            hashMap2.put("version", str2);
        }
        hashMap2.put("env", unmodifiableMap);
        String i = new C4465k().mo16123i(hashMap2);
        Charset forName = Charset.forName("UTF-8");
        this.f836b = new String(Base64.encode(i.getBytes(forName), 10), forName);
    }
}
