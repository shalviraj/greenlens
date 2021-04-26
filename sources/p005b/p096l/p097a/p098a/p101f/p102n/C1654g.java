package p005b.p096l.p097a.p098a.p101f.p102n;

import com.google.auto.value.AutoValue;

@AutoValue
/* renamed from: b.l.a.a.f.n.g */
public abstract class C1654g {

    /* renamed from: b.l.a.a.f.n.g$a */
    public enum C1655a {
        OK,
        TRANSIENT_ERROR,
        FATAL_ERROR
    }

    /* renamed from: a */
    public static C1654g m2180a() {
        return new C1649b(C1655a.FATAL_ERROR, -1);
    }

    /* renamed from: b */
    public abstract long mo11834b();

    /* renamed from: c */
    public abstract C1655a mo11835c();
}
