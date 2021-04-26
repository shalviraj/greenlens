package p298d.p337v;

import com.segment.analytics.integrations.BasePayload;
import java.io.Serializable;
import java.util.Objects;
import p005b.p035e.p036a.p037a.C0843a;
import p298d.p337v.C6827f;
import p298d.p344x.p345b.C6866p;
import p298d.p344x.p346c.C6888i;
import p298d.p344x.p346c.C6890k;

/* renamed from: d.v.c */
public final class C6822c implements C6827f, Serializable {

    /* renamed from: g */
    public final C6827f f13747g;

    /* renamed from: h */
    public final C6827f.C6828a f13748h;

    /* renamed from: d.v.c$a */
    public static final class C6823a extends C6890k implements C6866p<String, C6827f.C6828a, String> {

        /* renamed from: g */
        public static final C6823a f13749g = new C6823a();

        public C6823a() {
            super(2);
        }

        public Object invoke(Object obj, Object obj2) {
            String str = (String) obj;
            C6827f.C6828a aVar = (C6827f.C6828a) obj2;
            C6888i.m12438e(str, "acc");
            C6888i.m12438e(aVar, "element");
            if (str.length() == 0) {
                return aVar.toString();
            }
            return str + ", " + aVar;
        }
    }

    public C6822c(C6827f fVar, C6827f.C6828a aVar) {
        C6888i.m12438e(fVar, "left");
        C6888i.m12438e(aVar, "element");
        this.f13747g = fVar;
        this.f13748h = aVar;
    }

    /* renamed from: a */
    public final int mo24162a() {
        int i = 2;
        C6822c cVar = this;
        while (true) {
            C6827f fVar = cVar.f13747g;
            if (!(fVar instanceof C6822c)) {
                fVar = null;
            }
            cVar = (C6822c) fVar;
            if (cVar == null) {
                return i;
            }
            i++;
        }
    }

    public boolean equals(Object obj) {
        boolean z;
        if (this != obj) {
            if (!(obj instanceof C6822c)) {
                return false;
            }
            C6822c cVar = (C6822c) obj;
            if (cVar.mo24162a() != mo24162a()) {
                return false;
            }
            Objects.requireNonNull(cVar);
            C6822c cVar2 = this;
            while (true) {
                C6827f.C6828a aVar = cVar2.f13748h;
                if (C6888i.m12434a(cVar.get(aVar.getKey()), aVar)) {
                    C6827f fVar = cVar2.f13747g;
                    if (!(fVar instanceof C6822c)) {
                        Objects.requireNonNull(fVar, "null cannot be cast to non-null type kotlin.coroutines.CoroutineContext.Element");
                        C6827f.C6828a aVar2 = (C6827f.C6828a) fVar;
                        z = C6888i.m12434a(cVar.get(aVar2.getKey()), aVar2);
                        break;
                    }
                    cVar2 = (C6822c) fVar;
                } else {
                    z = false;
                    break;
                }
            }
            if (z) {
                return true;
            }
            return false;
        }
        return true;
    }

    public <R> R fold(R r, C6866p<? super R, ? super C6827f.C6828a, ? extends R> pVar) {
        C6888i.m12438e(pVar, "operation");
        return pVar.invoke(this.f13747g.fold(r, pVar), this.f13748h);
    }

    public <E extends C6827f.C6828a> E get(C6827f.C6830b<E> bVar) {
        C6888i.m12438e(bVar, "key");
        C6822c cVar = this;
        while (true) {
            E e = cVar.f13748h.get(bVar);
            if (e != null) {
                return e;
            }
            C6827f fVar = cVar.f13747g;
            if (!(fVar instanceof C6822c)) {
                return fVar.get(bVar);
            }
            cVar = (C6822c) fVar;
        }
    }

    public int hashCode() {
        return this.f13748h.hashCode() + this.f13747g.hashCode();
    }

    public C6827f minusKey(C6827f.C6830b<?> bVar) {
        C6888i.m12438e(bVar, "key");
        if (this.f13748h.get(bVar) != null) {
            return this.f13747g;
        }
        C6827f minusKey = this.f13747g.minusKey(bVar);
        return minusKey == this.f13747g ? this : minusKey == C6832h.f13753g ? this.f13748h : new C6822c(minusKey, this.f13748h);
    }

    public C6827f plus(C6827f fVar) {
        C6888i.m12438e(fVar, BasePayload.CONTEXT_KEY);
        C6888i.m12438e(fVar, BasePayload.CONTEXT_KEY);
        return fVar == C6832h.f13753g ? this : (C6827f) fVar.fold(this, C6831g.f13752g);
    }

    public String toString() {
        return C0843a.m455p(C0843a.m460u("["), (String) fold("", C6823a.f13749g), "]");
    }
}
