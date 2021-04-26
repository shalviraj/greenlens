package p005b.p096l.p175c.p177b;

import java.util.Iterator;
import java.util.Objects;
import p005b.p096l.p175c.p177b.C3792o;

/* renamed from: b.l.c.b.h */
public class C3781h extends C3797s<E> {

    /* renamed from: g */
    public final /* synthetic */ C3783i f6981g;

    public C3781h(C3783i iVar) {
        this.f6981g = iVar;
    }

    /* renamed from: d */
    public C3792o<E> mo15176d() {
        return this.f6981g;
    }

    public Iterator<C3792o.C3793a<E>> iterator() {
        C3774g0 g0Var = (C3774g0) ((C3767d) this.f6981g).f6951j;
        Objects.requireNonNull(g0Var);
        return new C3782h0(g0Var);
    }

    public int size() {
        return ((C3767d) this.f6981g).f6951j.entrySet().size();
    }
}
