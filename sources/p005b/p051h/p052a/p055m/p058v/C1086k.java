package p005b.p051h.p052a.p055m.p058v;

import p005b.p051h.p052a.p055m.C0962a;
import p005b.p051h.p052a.p055m.C0964c;

/* renamed from: b.h.a.m.v.k */
public abstract class C1086k {

    /* renamed from: a */
    public static final C1086k f1251a = new C1087a();

    /* renamed from: b */
    public static final C1086k f1252b = new C1088b();

    /* renamed from: c */
    public static final C1086k f1253c = new C1089c();

    /* renamed from: b.h.a.m.v.k$a */
    public class C1087a extends C1086k {
        /* renamed from: a */
        public boolean mo10978a() {
            return false;
        }

        /* renamed from: b */
        public boolean mo10979b() {
            return false;
        }

        /* renamed from: c */
        public boolean mo10980c(C0962a aVar) {
            return false;
        }

        /* renamed from: d */
        public boolean mo10981d(boolean z, C0962a aVar, C0964c cVar) {
            return false;
        }
    }

    /* renamed from: b.h.a.m.v.k$b */
    public class C1088b extends C1086k {
        /* renamed from: a */
        public boolean mo10978a() {
            return true;
        }

        /* renamed from: b */
        public boolean mo10979b() {
            return false;
        }

        /* renamed from: c */
        public boolean mo10980c(C0962a aVar) {
            return (aVar == C0962a.DATA_DISK_CACHE || aVar == C0962a.MEMORY_CACHE) ? false : true;
        }

        /* renamed from: d */
        public boolean mo10981d(boolean z, C0962a aVar, C0964c cVar) {
            return false;
        }
    }

    /* renamed from: b.h.a.m.v.k$c */
    public class C1089c extends C1086k {
        /* renamed from: a */
        public boolean mo10978a() {
            return true;
        }

        /* renamed from: b */
        public boolean mo10979b() {
            return true;
        }

        /* renamed from: c */
        public boolean mo10980c(C0962a aVar) {
            return aVar == C0962a.REMOTE;
        }

        /* renamed from: d */
        public boolean mo10981d(boolean z, C0962a aVar, C0964c cVar) {
            return ((z && aVar == C0962a.DATA_DISK_CACHE) || aVar == C0962a.LOCAL) && cVar == C0964c.TRANSFORMED;
        }
    }

    /* renamed from: a */
    public abstract boolean mo10978a();

    /* renamed from: b */
    public abstract boolean mo10979b();

    /* renamed from: c */
    public abstract boolean mo10980c(C0962a aVar);

    /* renamed from: d */
    public abstract boolean mo10981d(boolean z, C0962a aVar, C0964c cVar);
}
