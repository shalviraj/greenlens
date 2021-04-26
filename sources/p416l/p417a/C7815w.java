package p416l.p417a;

import kotlin.jvm.internal.DefaultConstructorMarker;
import p005b.p291q.p292a.C5266a;
import p298d.p337v.C6820a;
import p298d.p337v.C6821b;
import p298d.p337v.C6824d;
import p298d.p337v.C6825e;
import p298d.p337v.C6827f;
import p298d.p344x.p346c.C6888i;
import p416l.p417a.p419u1.C7775e;

/* renamed from: l.a.w */
public abstract class C7815w extends C6820a implements C6825e {

    /* renamed from: g */
    public static final C7816a f15424g = new C7816a((DefaultConstructorMarker) null);

    /* renamed from: l.a.w$a */
    public static final class C7816a extends C6821b<C6825e, C7815w> {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C7816a(DefaultConstructorMarker defaultConstructorMarker) {
            super(C6825e.C6826a.f13751g, C7798v.f15368g);
            int i = C6825e.f13750c;
        }
    }

    public C7815w() {
        super(C6825e.C6826a.f13751g);
    }

    /* renamed from: e */
    public void mo24168e(C6824d<?> dVar) {
        C7721g<?> j = ((C7775e) dVar).mo25439j();
        if (j != null) {
            j.mo25377m();
        }
    }

    public <E extends C6827f.C6828a> E get(C6827f.C6830b<E> bVar) {
        C6888i.m12438e(bVar, "key");
        if (bVar instanceof C6821b) {
            C6821b bVar2 = (C6821b) bVar;
            C6827f.C6830b<?> key = getKey();
            C6888i.m12438e(key, "key");
            if (!(key == bVar2 || bVar2.f13745g == key)) {
                return null;
            }
            C6888i.m12438e(this, "element");
            E e = (C6827f.C6828a) bVar2.f13746h.invoke(this);
            if (!(e instanceof C6827f.C6828a)) {
                return null;
            }
            return e;
        } else if (C6825e.C6826a.f13751g == bVar) {
            return this;
        } else {
            return null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002b, code lost:
        if (((p298d.p337v.C6827f.C6828a) r3.f13746h.invoke(r2)) != null) goto L_0x002d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0034, code lost:
        if (p298d.p337v.C6825e.C6826a.f13751g == r3) goto L_0x002d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public p298d.p337v.C6827f minusKey(p298d.p337v.C6827f.C6830b<?> r3) {
        /*
            r2 = this;
            java.lang.String r0 = "key"
            p298d.p344x.p346c.C6888i.m12438e(r3, r0)
            boolean r1 = r3 instanceof p298d.p337v.C6821b
            if (r1 == 0) goto L_0x0032
            d.v.b r3 = (p298d.p337v.C6821b) r3
            d.v.f$b r1 = r2.getKey()
            p298d.p344x.p346c.C6888i.m12438e(r1, r0)
            if (r1 == r3) goto L_0x001b
            d.v.f$b<?> r0 = r3.f13745g
            if (r0 != r1) goto L_0x0019
            goto L_0x001b
        L_0x0019:
            r0 = 0
            goto L_0x001c
        L_0x001b:
            r0 = 1
        L_0x001c:
            if (r0 == 0) goto L_0x0030
            java.lang.String r0 = "element"
            p298d.p344x.p346c.C6888i.m12438e(r2, r0)
            d.x.b.l<d.v.f$a, E> r3 = r3.f13746h
            java.lang.Object r3 = r3.invoke(r2)
            d.v.f$a r3 = (p298d.p337v.C6827f.C6828a) r3
            if (r3 == 0) goto L_0x0030
        L_0x002d:
            d.v.h r3 = p298d.p337v.C6832h.f13753g
            goto L_0x0037
        L_0x0030:
            r3 = r2
            goto L_0x0037
        L_0x0032:
            d.v.e$a r0 = p298d.p337v.C6825e.C6826a.f13751g
            if (r0 != r3) goto L_0x0030
            goto L_0x002d
        L_0x0037:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p416l.p417a.C7815w.minusKey(d.v.f$b):d.v.f");
    }

    /* renamed from: n0 */
    public abstract void mo25402n0(C6827f fVar, Runnable runnable);

    /* renamed from: o0 */
    public boolean mo25425o0(C6827f fVar) {
        return true;
    }

    /* renamed from: q */
    public final <T> C6824d<T> mo24169q(C6824d<? super T> dVar) {
        return new C7775e(this, dVar);
    }

    public String toString() {
        return getClass().getSimpleName() + '@' + C5266a.m10027s1(this);
    }
}
