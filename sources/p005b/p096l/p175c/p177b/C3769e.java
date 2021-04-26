package p005b.p096l.p175c.p177b;

import java.util.Comparator;
import java.util.NavigableSet;
import java.util.Objects;
import java.util.Set;
import p005b.p096l.p175c.p177b.C3774g0;
import p005b.p096l.p175c.p177b.C3792o;

/* renamed from: b.l.c.b.e */
public abstract class C3769e<E> extends C3763c<E> implements C3762b0<E> {

    /* renamed from: i */
    public final Comparator<? super E> f6952i;

    /* renamed from: j */
    public transient C3762b0<E> f6953j;

    public C3769e() {
        this.f6952i = C3800v.f7009g;
    }

    /* renamed from: C */
    public C3792o.C3793a<E> mo15150C() {
        C3774g0.C3775a aVar = new C3774g0.C3775a();
        if (aVar.hasNext()) {
            return (C3792o.C3793a) aVar.next();
        }
        return null;
    }

    /* renamed from: Q */
    public C3762b0<E> mo15152Q(E e, C3771f fVar, E e2, C3771f fVar2) {
        Objects.requireNonNull(fVar);
        Objects.requireNonNull(fVar2);
        return ((C3774g0) ((C3774g0) this).mo15156m(e, fVar)).mo15151O(e2, fVar2);
    }

    /* renamed from: c */
    public NavigableSet<E> m7092c() {
        return (NavigableSet) super.mo15163c();
    }

    public Comparator<? super E> comparator() {
        return this.f6952i;
    }

    /* renamed from: d */
    public Set mo15165d() {
        return new C3768d0(this);
    }

    /* renamed from: p */
    public C3792o.C3793a<E> mo15157p() {
        C3782h0 h0Var = new C3782h0((C3774g0) this);
        if (!h0Var.hasNext()) {
            return null;
        }
        C3792o.C3793a aVar = (C3792o.C3793a) h0Var.next();
        C3798t tVar = new C3798t(aVar.mo15201d(), aVar.getCount());
        h0Var.remove();
        return tVar;
    }

    /* renamed from: s */
    public C3762b0<E> mo15158s() {
        C3762b0<E> b0Var = this.f6953j;
        if (b0Var != null) {
            return b0Var;
        }
        C3767d dVar = new C3767d(this);
        this.f6953j = dVar;
        return dVar;
    }

    /* renamed from: x */
    public C3792o.C3793a<E> mo15159x() {
        C3774g0.C3775a aVar = new C3774g0.C3775a();
        if (!aVar.hasNext()) {
            return null;
        }
        C3792o.C3793a aVar2 = (C3792o.C3793a) aVar.next();
        C3798t tVar = new C3798t(aVar2.mo15201d(), aVar2.getCount());
        aVar.remove();
        return tVar;
    }

    /* renamed from: y */
    public C3792o.C3793a<E> mo15160y() {
        C3782h0 h0Var = new C3782h0((C3774g0) this);
        if (h0Var.hasNext()) {
            return (C3792o.C3793a) h0Var.next();
        }
        return null;
    }

    public C3769e(Comparator<? super E> comparator) {
        Objects.requireNonNull(comparator);
        this.f6952i = comparator;
    }
}
