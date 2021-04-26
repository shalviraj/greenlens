package p416l.p417a.p419u1;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import p005b.p035e.p036a.p037a.C0843a;
import p005b.p291q.p292a.C5266a;
import p298d.C6777r;
import p298d.p337v.C6824d;
import p298d.p337v.C6827f;
import p298d.p337v.p339j.p340a.C6839d;
import p298d.p344x.p345b.C6862l;
import p298d.p344x.p346c.C6888i;
import p416l.p417a.C7718f;
import p416l.p417a.C7721g;
import p416l.p417a.C7722g0;
import p416l.p417a.C7737l0;
import p416l.p417a.C7750o1;
import p416l.p417a.C7757r;
import p416l.p417a.C7815w;

@Metadata(mo24460bv = {1, 0, 3}, mo24461d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000\u00022\u00060\u0003j\u0002`\u00042\b\u0012\u0004\u0012\u00028\u00000\u0005B\u001d\u0012\u0006\u00101\u001a\u00020/\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b8\u00109J\u0019\u0010\t\u001a\u00020\b2\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u0006¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\u0010\f\u001a\u0006\u0012\u0002\b\u00030\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\r¢\u0006\u0004\b\u0011\u0010\u0012J\u0011\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0010¢\u0006\u0004\b\u0014\u0010\u0015J \u0010\u0019\u001a\u00020\u00182\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u0016H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ!\u0010\u001c\u001a\u00020\u00182\b\u0010\u001b\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0010\u001a\u00020\rH\u0010¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b\u001f\u0010 R\u001e\u0010%\u001a\u0004\u0018\u00010\u00138\u0000@\u0000X\u000e¢\u0006\f\n\u0004\b!\u0010\"\u0012\u0004\b#\u0010$R\u001c\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00058\u0006@\u0007X\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u001e\u0010*\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u00048V@\u0016X\u0004¢\u0006\u0006\u001a\u0004\b(\u0010)R\u0016\u0010.\u001a\u00020+8\u0016@\u0016X\u0005¢\u0006\u0006\u001a\u0004\b,\u0010-R\u0016\u00101\u001a\u00020/8\u0006@\u0007X\u0004¢\u0006\u0006\n\u0004\b\u0011\u00100R\u001c\u00104\u001a\b\u0012\u0004\u0012\u00028\u00000\u00058P@\u0010X\u0004¢\u0006\u0006\u001a\u0004\b2\u00103R\u0019\u00106\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00068F@\u0006¢\u0006\u0006\u001a\u0004\b!\u00105R\u0016\u00107\u001a\u00020\u00138\u0000@\u0001X\u0004¢\u0006\u0006\n\u0004\b\t\u0010\"\u0002\u0004\n\u0002\b\u0019¨\u0006:"}, mo24462d2 = {"Ll/a/u1/e;", "T", "Ll/a/g0;", "Ld/v/j/a/d;", "Lkotlinx/coroutines/internal/CoroutineStackFrame;", "Ld/v/d;", "Ll/a/g;", "requester", "", "k", "(Ll/a/g;)Z", "Ll/a/f;", "continuation", "", "i", "(Ll/a/f;)Ljava/lang/Throwable;", "cause", "l", "(Ljava/lang/Throwable;)Z", "", "h", "()Ljava/lang/Object;", "Ld/k;", "result", "Ld/r;", "c", "(Ljava/lang/Object;)V", "takenState", "b", "(Ljava/lang/Object;Ljava/lang/Throwable;)V", "", "toString", "()Ljava/lang/String;", "j", "Ljava/lang/Object;", "get_state$kotlinx_coroutines_core$annotations", "()V", "_state", "m", "Ld/v/d;", "a", "()Ld/v/j/a/d;", "callerFrame", "Ld/v/f;", "getContext", "()Ld/v/f;", "context", "Ll/a/w;", "Ll/a/w;", "dispatcher", "d", "()Ld/v/d;", "delegate", "()Ll/a/g;", "reusableCancellableContinuation", "countOrElement", "<init>", "(Ll/a/w;Ld/v/d;)V", "kotlinx-coroutines-core"}, mo24463k = 1, mo24464mv = {1, 4, 2})
/* renamed from: l.a.u1.e */
public final class C7775e<T> extends C7722g0<T> implements C6839d, C6824d<T> {

    /* renamed from: n */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f15327n = AtomicReferenceFieldUpdater.newUpdater(C7775e.class, Object.class, "_reusableCancellableContinuation");
    private volatile /* synthetic */ Object _reusableCancellableContinuation;

    /* renamed from: j */
    public Object f15328j = C7776f.f15332a;

    /* renamed from: k */
    public final Object f15329k;

    /* renamed from: l */
    public final C7815w f15330l;

    /* renamed from: m */
    public final C6824d<T> f15331m;

    public C7775e(C7815w wVar, C6824d<? super T> dVar) {
        super(-1);
        this.f15330l = wVar;
        this.f15331m = dVar;
        Object fold = getContext().fold(0, C7791r.f15357b);
        C6888i.m12436c(fold);
        this.f15329k = fold;
        this._reusableCancellableContinuation = null;
    }

    /* renamed from: a */
    public C6839d mo24172a() {
        C6824d<T> dVar = this.f15331m;
        if (!(dVar instanceof C6839d)) {
            dVar = null;
        }
        return (C6839d) dVar;
    }

    /* renamed from: b */
    public void mo25368b(Object obj, Throwable th) {
        if (obj instanceof C7757r) {
            ((C7757r) obj).f15310b.invoke(th);
        }
    }

    /* renamed from: c */
    public void mo24166c(Object obj) {
        C6827f context;
        Object b;
        C6827f context2 = this.f15331m.getContext();
        Object D4 = C5266a.m9793D4(obj, (C6862l<? super Throwable, C6777r>) null);
        if (this.f15330l.mo25425o0(context2)) {
            this.f15328j = D4;
            this.f15271i = 0;
            this.f15330l.mo25402n0(context2, this);
            return;
        }
        C7750o1 o1Var = C7750o1.f15297b;
        C7737l0 a = C7750o1.m14097a();
        if (a.mo25399t0()) {
            this.f15328j = D4;
            this.f15271i = 0;
            a.mo25396r0(this);
            return;
        }
        a.mo25397s0(true);
        try {
            context = getContext();
            b = C7791r.m14156b(context, this.f15329k);
            this.f15331m.mo24166c(obj);
            C7791r.m14155a(context, b);
            do {
            } while (a.mo25400u0());
        } catch (Throwable th) {
            try {
                mo25385g(th, (Throwable) null);
            } catch (Throwable th2) {
                a.mo25394p0(true);
                throw th2;
            }
        }
        a.mo25394p0(true);
    }

    /* renamed from: d */
    public C6824d<T> mo25369d() {
        return this;
    }

    public C6827f getContext() {
        return this.f15331m.getContext();
    }

    /* renamed from: h */
    public Object mo25372h() {
        Object obj = this.f15328j;
        this.f15328j = C7776f.f15332a;
        return obj;
    }

    /* renamed from: i */
    public final Throwable mo25438i(C7718f<?> fVar) {
        C7789p pVar;
        do {
            Object obj = this._reusableCancellableContinuation;
            pVar = C7776f.f15333b;
            if (obj != pVar) {
                if (obj == null) {
                    return null;
                }
                if (!(obj instanceof Throwable)) {
                    throw new IllegalStateException(("Inconsistent state " + obj).toString());
                } else if (f15327n.compareAndSet(this, obj, (Object) null)) {
                    return (Throwable) obj;
                } else {
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
            }
        } while (!f15327n.compareAndSet(this, pVar, fVar));
        return null;
    }

    /* renamed from: j */
    public final C7721g<?> mo25439j() {
        Object obj = this._reusableCancellableContinuation;
        if (!(obj instanceof C7721g)) {
            obj = null;
        }
        return (C7721g) obj;
    }

    /* renamed from: k */
    public final boolean mo25440k(C7721g<?> gVar) {
        Object obj = this._reusableCancellableContinuation;
        if (obj == null) {
            return false;
        }
        if (obj instanceof C7721g) {
            return obj == gVar;
        }
        return true;
    }

    /* renamed from: l */
    public final boolean mo25441l(Throwable th) {
        while (true) {
            Object obj = this._reusableCancellableContinuation;
            C7789p pVar = C7776f.f15333b;
            if (C6888i.m12434a(obj, pVar)) {
                if (f15327n.compareAndSet(this, pVar, th)) {
                    return true;
                }
            } else if (obj instanceof Throwable) {
                return true;
            } else {
                if (f15327n.compareAndSet(this, obj, (Object) null)) {
                    return false;
                }
            }
        }
    }

    public String toString() {
        StringBuilder u = C0843a.m460u("DispatchedContinuation[");
        u.append(this.f15330l);
        u.append(", ");
        u.append(C5266a.m10036t4(this.f15331m));
        u.append(']');
        return u.toString();
    }
}
