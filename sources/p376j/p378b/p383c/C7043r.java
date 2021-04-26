package p376j.p378b.p383c;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.TreeMap;
import p005b.p035e.p036a.p037a.C0843a;
import p005b.p291q.p292a.C5266a;

/* renamed from: j.b.c.r */
public final class C7043r {

    /* renamed from: c */
    public static final List<C7043r> f14116c;

    /* renamed from: d */
    public static final C7043r f14117d = C7044a.OK.mo24448d();

    /* renamed from: e */
    public static final C7043r f14118e = C7044a.UNKNOWN.mo24448d();

    /* renamed from: f */
    public static final C7043r f14119f = C7044a.INVALID_ARGUMENT.mo24448d();

    /* renamed from: g */
    public static final C7043r f14120g = C7044a.NOT_FOUND.mo24448d();

    /* renamed from: h */
    public static final C7043r f14121h = C7044a.PERMISSION_DENIED.mo24448d();

    /* renamed from: i */
    public static final C7043r f14122i = C7044a.UNAUTHENTICATED.mo24448d();

    /* renamed from: j */
    public static final C7043r f14123j = C7044a.FAILED_PRECONDITION.mo24448d();

    /* renamed from: k */
    public static final C7043r f14124k = C7044a.UNAVAILABLE.mo24448d();

    /* renamed from: a */
    public final C7044a f14125a;

    /* renamed from: b */
    public final String f14126b = null;

    /* renamed from: j.b.c.r$a */
    public enum C7044a {
        OK(0),
        CANCELLED(1),
        UNKNOWN(2),
        INVALID_ARGUMENT(3),
        DEADLINE_EXCEEDED(4),
        NOT_FOUND(5),
        ALREADY_EXISTS(6),
        PERMISSION_DENIED(7),
        RESOURCE_EXHAUSTED(8),
        FAILED_PRECONDITION(9),
        ABORTED(10),
        OUT_OF_RANGE(11),
        UNIMPLEMENTED(12),
        INTERNAL(13),
        UNAVAILABLE(14),
        DATA_LOSS(15),
        UNAUTHENTICATED(16);
        

        /* renamed from: g */
        public final int f14145g;

        /* access modifiers changed from: public */
        C7044a(int i) {
            this.f14145g = i;
        }

        /* renamed from: d */
        public C7043r mo24448d() {
            return C7043r.f14116c.get(this.f14145g);
        }
    }

    static {
        TreeMap treeMap = new TreeMap();
        C7044a[] values = C7044a.values();
        int i = 0;
        while (i < 17) {
            C7044a aVar = values[i];
            C7043r rVar = (C7043r) treeMap.put(Integer.valueOf(aVar.f14145g), new C7043r(aVar, (String) null));
            if (rVar == null) {
                i++;
            } else {
                StringBuilder u = C0843a.m460u("Code value duplication between ");
                u.append(rVar.f14125a.name());
                u.append(" & ");
                u.append(aVar.name());
                throw new IllegalStateException(u.toString());
            }
        }
        f14116c = Collections.unmodifiableList(new ArrayList(treeMap.values()));
        C7044a.CANCELLED.mo24448d();
        C7044a.DEADLINE_EXCEEDED.mo24448d();
        C7044a.ALREADY_EXISTS.mo24448d();
        C7044a.RESOURCE_EXHAUSTED.mo24448d();
        C7044a.ABORTED.mo24448d();
        C7044a.OUT_OF_RANGE.mo24448d();
        C7044a.UNIMPLEMENTED.mo24448d();
        C7044a.INTERNAL.mo24448d();
        C7044a.DATA_LOSS.mo24448d();
    }

    public C7043r(C7044a aVar, String str) {
        C5266a.m9842M(aVar, "canonicalCode");
        this.f14125a = aVar;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C7043r)) {
            return false;
        }
        C7043r rVar = (C7043r) obj;
        if (this.f14125a == rVar.f14125a) {
            String str = this.f14126b;
            String str2 = rVar.f14126b;
            if (str == null ? str2 == null : str.equals(str2)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f14125a, this.f14126b});
    }

    public String toString() {
        StringBuilder u = C0843a.m460u("Status{canonicalCode=");
        u.append(this.f14125a);
        u.append(", description=");
        return C0843a.m455p(u, this.f14126b, "}");
    }
}
