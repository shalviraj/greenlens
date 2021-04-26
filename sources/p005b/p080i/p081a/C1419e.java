package p005b.p080i.p081a;

/* renamed from: b.i.a.e */
public class C1419e {

    /* renamed from: c */
    public static final C1419e f1892c = new C1419e(C1420a.none, (C1421b) null);

    /* renamed from: d */
    public static final C1419e f1893d = new C1419e(C1420a.xMidYMid, C1421b.meet);

    /* renamed from: a */
    public C1420a f1894a;

    /* renamed from: b */
    public C1421b f1895b;

    /* renamed from: b.i.a.e$a */
    public enum C1420a {
        none,
        xMinYMin,
        xMidYMin,
        xMaxYMin,
        xMinYMid,
        xMidYMid,
        xMaxYMid,
        xMinYMax,
        xMidYMax,
        xMaxYMax
    }

    /* renamed from: b.i.a.e$b */
    public enum C1421b {
        meet,
        slice
    }

    public C1419e(C1420a aVar, C1421b bVar) {
        this.f1894a = aVar;
        this.f1895b = bVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1419e.class != obj.getClass()) {
            return false;
        }
        C1419e eVar = (C1419e) obj;
        return this.f1894a == eVar.f1894a && this.f1895b == eVar.f1895b;
    }

    public String toString() {
        return this.f1894a + " " + this.f1895b;
    }
}
