package p421m.p422m0.p430k.p431i;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.logging.Logger;
import p005b.p291q.p292a.C5266a;
import p298d.p334t.C6790h;
import p298d.p334t.C6799q;
import p298d.p344x.p346c.C6888i;
import p421m.C7831c0;
import p421m.p422m0.p425f.C7876d;
import p421m.p422m0.p429j.C7928e;

/* renamed from: m.m0.k.i.c */
public final class C7981c {

    /* renamed from: a */
    public static final CopyOnWriteArraySet<Logger> f16018a = new CopyOnWriteArraySet<>();

    /* renamed from: b */
    public static final Map<String, String> f16019b;

    /* renamed from: c */
    public static final C7981c f16020c = null;

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Package packageR = C7831c0.class.getPackage();
        String name = packageR != null ? packageR.getName() : null;
        if (name != null) {
            linkedHashMap.put(name, "OkHttp");
        }
        String name2 = C7831c0.class.getName();
        C6888i.m12437d(name2, "OkHttpClient::class.java.name");
        linkedHashMap.put(name2, "okhttp.OkHttpClient");
        String name3 = C7928e.class.getName();
        C6888i.m12437d(name3, "Http2::class.java.name");
        linkedHashMap.put(name3, "okhttp.Http2");
        String name4 = C7876d.class.getName();
        C6888i.m12437d(name4, "TaskRunner::class.java.name");
        linkedHashMap.put(name4, "okhttp.TaskRunner");
        linkedHashMap.put("okhttp3.mockwebserver.MockWebServer", "okhttp.MockWebServer");
        C6888i.m12438e(linkedHashMap, "$this$toMap");
        int size = linkedHashMap.size();
        f16019b = size != 0 ? size != 1 ? C6790h.m12345c0(linkedHashMap) : C5266a.m9787C4(linkedHashMap) : C6799q.f13714g;
    }
}
