package p005b.p096l.p180d.p191q.p192f.p195g;

import android.content.Context;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import p005b.p035e.p036a.p037a.C0843a;
import p005b.p096l.p180d.p191q.p192f.p197i.C4111n;
import p005b.p096l.p180d.p191q.p192f.p197i.C4115p;
import p005b.p096l.p180d.p191q.p192f.p197i.C4117q;
import p005b.p096l.p180d.p191q.p192f.p197i.C4129v;
import p005b.p096l.p180d.p191q.p192f.p197i.C4155w;
import p005b.p096l.p180d.p191q.p192f.p205n.C4198d;
import p005b.p096l.p180d.p191q.p192f.p205n.C4199e;

/* renamed from: b.l.d.q.f.g.z */
public class C4049z {

    /* renamed from: e */
    public static final Map<String, Integer> f7441e;

    /* renamed from: f */
    public static final String f7442f = String.format(Locale.US, "Crashlytics Android SDK/%s", new Object[]{"17.4.1"});

    /* renamed from: a */
    public final Context f7443a;

    /* renamed from: b */
    public final C4012g0 f7444b;

    /* renamed from: c */
    public final C3995a f7445c;

    /* renamed from: d */
    public final C4198d f7446d;

    static {
        HashMap hashMap = new HashMap();
        f7441e = hashMap;
        C0843a.m428D(5, hashMap, "armeabi", 6, "armeabi-v7a", 9, "arm64-v8a", 0, "x86");
        hashMap.put("x86_64", 1);
    }

    public C4049z(Context context, C4012g0 g0Var, C3995a aVar, C4198d dVar) {
        this.f7443a = context;
        this.f7444b = g0Var;
        this.f7445c = aVar;
        this.f7446d = dVar;
    }

    /* renamed from: a */
    public final C4129v.C4134d.C4140d.C4141a.C4143b.C4145b mo15554a(C4199e eVar, int i, int i2, int i3) {
        String str = eVar.f7789b;
        String str2 = eVar.f7788a;
        StackTraceElement[] stackTraceElementArr = eVar.f7790c;
        int i4 = 0;
        if (stackTraceElementArr == null) {
            stackTraceElementArr = new StackTraceElement[0];
        }
        C4199e eVar2 = eVar.f7791d;
        if (i3 >= i2) {
            C4199e eVar3 = eVar2;
            while (eVar3 != null) {
                eVar3 = eVar3.f7791d;
                i4++;
            }
        }
        C4129v.C4134d.C4140d.C4141a.C4143b.C4145b bVar = null;
        Objects.requireNonNull(str, "Null type");
        C4155w wVar = new C4155w(mo15555b(stackTraceElementArr, i));
        Integer valueOf = Integer.valueOf(i4);
        if (eVar2 != null && i4 == 0) {
            bVar = mo15554a(eVar2, i, i2, i3 + 1);
        }
        String str3 = valueOf == null ? " overflowCount" : "";
        if (str3.isEmpty()) {
            return new C4111n(str, str2, wVar, bVar, valueOf.intValue(), (C4111n.C4112a) null);
        }
        throw new IllegalStateException(C0843a.m451l("Missing required properties:", str3));
    }

    /* renamed from: b */
    public final C4155w<C4129v.C4134d.C4140d.C4141a.C4143b.C4147d.C4148a> mo15555b(StackTraceElement[] stackTraceElementArr, int i) {
        ArrayList arrayList = new ArrayList();
        for (StackTraceElement stackTraceElement : stackTraceElementArr) {
            C4117q.C4119b bVar = new C4117q.C4119b();
            bVar.f7692e = Integer.valueOf(i);
            long j = 0;
            long max = stackTraceElement.isNativeMethod() ? Math.max((long) stackTraceElement.getLineNumber(), 0) : 0;
            String str = stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName();
            String fileName = stackTraceElement.getFileName();
            if (!stackTraceElement.isNativeMethod() && stackTraceElement.getLineNumber() > 0) {
                j = (long) stackTraceElement.getLineNumber();
            }
            bVar.f7688a = Long.valueOf(max);
            Objects.requireNonNull(str, "Null symbol");
            bVar.f7689b = str;
            bVar.f7690c = fileName;
            bVar.f7691d = Long.valueOf(j);
            arrayList.add(bVar.mo15713a());
        }
        return new C4155w<>(arrayList);
    }

    /* renamed from: c */
    public final C4129v.C4134d.C4140d.C4141a.C4143b.C4147d mo15556c(Thread thread, StackTraceElement[] stackTraceElementArr, int i) {
        String name = thread.getName();
        Objects.requireNonNull(name, "Null name");
        Integer valueOf = Integer.valueOf(i);
        C4155w wVar = new C4155w(mo15555b(stackTraceElementArr, i));
        String str = valueOf == null ? " importance" : "";
        if (str.isEmpty()) {
            return new C4115p(name, valueOf.intValue(), wVar, (C4115p.C4116a) null);
        }
        throw new IllegalStateException(C0843a.m451l("Missing required properties:", str));
    }
}
