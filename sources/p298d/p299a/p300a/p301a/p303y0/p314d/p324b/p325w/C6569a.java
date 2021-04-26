package p298d.p299a.p300a.p301a.p303y0.p314d.p324b.p325w;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p005b.p291q.p292a.C5266a;
import p298d.p299a.p300a.p301a.p303y0.p326e.p327a0.p328b.C6602c;
import p298d.p299a.p300a.p301a.p303y0.p326e.p327a0.p328b.C6607f;
import p298d.p344x.p346c.C6888i;

/* renamed from: d.a.a.a.y0.d.b.w.a */
public final class C6569a {

    /* renamed from: a */
    public final C6570a f12871a;

    /* renamed from: b */
    public final C6607f f12872b;

    /* renamed from: c */
    public final String[] f12873c;

    /* renamed from: d */
    public final String[] f12874d;

    /* renamed from: e */
    public final String[] f12875e;

    /* renamed from: f */
    public final String f12876f;

    /* renamed from: g */
    public final int f12877g;

    /* renamed from: d.a.a.a.y0.d.b.w.a$a */
    public enum C6570a {
        UNKNOWN(0),
        CLASS(1),
        FILE_FACADE(2),
        SYNTHETIC_CLASS(3),
        MULTIFILE_CLASS(4),
        MULTIFILE_CLASS_PART(5);
        

        /* renamed from: h */
        public static final C6571a f12878h = null;

        /* renamed from: i */
        public static final Map<Integer, C6570a> f12879i = null;

        /* renamed from: g */
        public final int f12887g;

        /* renamed from: d.a.a.a.y0.d.b.w.a$a$a */
        public static final class C6571a {
            public C6571a(DefaultConstructorMarker defaultConstructorMarker) {
            }
        }

        /* access modifiers changed from: public */
        static {
            int i;
            f12878h = new C6571a((DefaultConstructorMarker) null);
            C6570a[] values = values();
            int g3 = C5266a.m9957g3(6);
            if (g3 < 16) {
                g3 = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(g3);
            for (C6570a aVar : values) {
                linkedHashMap.put(Integer.valueOf(aVar.f12887g), aVar);
            }
            f12879i = linkedHashMap;
        }

        /* access modifiers changed from: public */
        C6570a(int i) {
            this.f12887g = i;
        }
    }

    public C6569a(C6570a aVar, C6607f fVar, C6602c cVar, String[] strArr, String[] strArr2, String[] strArr3, String str, int i, String str2) {
        C6888i.m12438e(aVar, "kind");
        C6888i.m12438e(fVar, "metadataVersion");
        C6888i.m12438e(cVar, "bytecodeVersion");
        this.f12871a = aVar;
        this.f12872b = fVar;
        this.f12873c = strArr;
        this.f12874d = strArr2;
        this.f12875e = strArr3;
        this.f12876f = str;
        this.f12877g = i;
    }

    /* renamed from: a */
    public final String mo23679a() {
        String str = this.f12876f;
        if (this.f12871a == C6570a.MULTIFILE_CLASS_PART) {
            return str;
        }
        return null;
    }

    /* renamed from: b */
    public final boolean mo23680b(int i, int i2) {
        return (i & i2) != 0;
    }

    public String toString() {
        return this.f12871a + " version=" + this.f12872b;
    }
}
