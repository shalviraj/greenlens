package p005b.p096l.p097a.p151d.p152a.p156c;

import android.os.Bundle;
import android.os.Process;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* renamed from: b.l.a.d.a.c.b */
public class C3566b {

    /* renamed from: a */
    public static final Map<String, Map<String, Integer>> f6631a = new HashMap();

    static {
        new HashSet(Arrays.asList(new String[]{"app_update", "review"}));
        new HashSet(Arrays.asList(new String[]{"native", "unity"}));
        int myUid = Process.myUid();
        int myPid = Process.myPid();
        StringBuilder sb = new StringBuilder(39);
        sb.append("UID: [");
        sb.append(myUid);
        sb.append("]  PID: [");
        sb.append(myPid);
        sb.append("] ");
        String valueOf = String.valueOf(sb.toString());
        if ("PlayCoreVersion".length() != 0) {
            valueOf.concat("PlayCoreVersion");
        } else {
            new String(valueOf);
        }
    }

    /* renamed from: a */
    public static Bundle m6788a(String str) {
        Map map;
        Bundle bundle = new Bundle();
        synchronized (C3566b.class) {
            Map<String, Map<String, Integer>> map2 = f6631a;
            if (!map2.containsKey(str)) {
                HashMap hashMap = new HashMap();
                hashMap.put("java", 11000);
                map2.put(str, hashMap);
            }
            map = map2.get(str);
        }
        bundle.putInt("playcore_version_code", ((Integer) map.get("java")).intValue());
        if (map.containsKey("native")) {
            bundle.putInt("playcore_native_version", ((Integer) map.get("native")).intValue());
        }
        if (map.containsKey("unity")) {
            bundle.putInt("playcore_unity_version", ((Integer) map.get("unity")).intValue());
        }
        return bundle;
    }
}
