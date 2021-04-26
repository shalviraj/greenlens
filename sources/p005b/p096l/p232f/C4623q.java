package p005b.p096l.p232f;

import java.util.EnumMap;
import java.util.Map;

/* renamed from: b.l.f.q */
public final class C4623q {

    /* renamed from: a */
    public final String f8691a;

    /* renamed from: b */
    public final byte[] f8692b;

    /* renamed from: c */
    public C4625s[] f8693c;

    /* renamed from: d */
    public final C4484a f8694d;

    /* renamed from: e */
    public Map<C4624r, Object> f8695e = null;

    public C4623q(String str, byte[] bArr, int i, C4625s[] sVarArr, C4484a aVar, long j) {
        this.f8691a = str;
        this.f8692b = bArr;
        this.f8693c = sVarArr;
        this.f8694d = aVar;
    }

    public C4623q(String str, byte[] bArr, C4625s[] sVarArr, C4484a aVar) {
        System.currentTimeMillis();
        this.f8691a = str;
        this.f8692b = bArr;
        this.f8693c = sVarArr;
        this.f8694d = aVar;
    }

    /* renamed from: a */
    public void mo16282a(Map<C4624r, Object> map) {
        if (map != null) {
            Map<C4624r, Object> map2 = this.f8695e;
            if (map2 == null) {
                this.f8695e = map;
            } else {
                map2.putAll(map);
            }
        }
    }

    /* renamed from: b */
    public void mo16283b(C4624r rVar, Object obj) {
        if (this.f8695e == null) {
            this.f8695e = new EnumMap(C4624r.class);
        }
        this.f8695e.put(rVar, obj);
    }

    public String toString() {
        return this.f8691a;
    }
}
