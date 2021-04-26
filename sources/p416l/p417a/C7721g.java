package p416l.p417a;

import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import p005b.p291q.p292a.C5266a;
import p298d.C6777r;
import p298d.p337v.C6824d;
import p298d.p337v.C6827f;
import p298d.p337v.p338i.C6833a;
import p298d.p337v.p339j.p340a.C6839d;
import p298d.p344x.p345b.C6862l;
import p416l.p417a.p419u1.C7775e;

@Metadata(mo24460bv = {1, 0, 3}, mo24461d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0011\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u00032\u00060\u0004j\u0002`\u0005B\u001d\u0012\f\u0010?\u001a\b\u0012\u0004\u0012\u00028\u00000;\u0012\u0006\u0010H\u001a\u00020\u0015¢\u0006\u0004\bI\u0010JJ\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ3\u0010\u000f\u001a\u00020\u000b2\u0018\u0010\r\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0004\u0012\u00020\u000b0\tj\u0002`\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J3\u0010\u0013\u001a\u00020\u000b2\u0018\u0010\r\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0004\u0012\u00020\u000b0\tj\u0002`\f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0011\u0010\u001b\u001a\u0004\u0018\u00010\u0011H\u0010¢\u0006\u0004\b\u001b\u0010\u001cJ!\u0010\u001e\u001a\u00020\u000b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u000e\u001a\u00020\nH\u0010¢\u0006\u0004\b\u001e\u0010\u001fJ\u0019\u0010 \u001a\u00020\u00062\b\u0010\u000e\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b \u0010!J\u001f\u0010#\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\"2\b\u0010\u000e\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b#\u0010$J)\u0010&\u001a\u00020\u000b2\u0012\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t2\u0006\u0010\u000e\u001a\u00020\n¢\u0006\u0004\b&\u0010\u0010J\u0017\u0010)\u001a\u00020\n2\u0006\u0010(\u001a\u00020'H\u0016¢\u0006\u0004\b)\u0010*J\u0011\u0010+\u001a\u0004\u0018\u00010\u0011H\u0001¢\u0006\u0004\b+\u0010\u001cJ \u0010.\u001a\u00020\u000b2\f\u0010-\u001a\b\u0012\u0004\u0012\u00028\u00000,H\u0016ø\u0001\u0000¢\u0006\u0004\b.\u0010/J)\u00100\u001a\u00020\u000b2\u0018\u0010\r\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0004\u0012\u00020\u000b0\tj\u0002`\fH\u0016¢\u0006\u0004\b0\u00101J\u000f\u00102\u001a\u00020\u000bH\u0000¢\u0006\u0004\b2\u0010\u001aJ\u001f\u00103\u001a\u00028\u0001\"\u0004\b\u0001\u0010\u00012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0010¢\u0006\u0004\b3\u00104J\u001b\u00105\u001a\u0004\u0018\u00010\n2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0010¢\u0006\u0004\b5\u00106J\u000f\u00108\u001a\u000207H\u0016¢\u0006\u0004\b8\u00109J\u000f\u0010:\u001a\u000207H\u0014¢\u0006\u0004\b:\u00109R\"\u0010?\u001a\b\u0012\u0004\u0012\u00028\u00000;8\u0000@\u0000X\u0004¢\u0006\f\n\u0004\b&\u0010<\u001a\u0004\b=\u0010>R\u001c\u0010D\u001a\u00020@8\u0016@\u0016X\u0004¢\u0006\f\n\u0004\b#\u0010A\u001a\u0004\bB\u0010CR\u001e\u0010G\u001a\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u00058V@\u0016X\u0004¢\u0006\u0006\u001a\u0004\bE\u0010F\u0002\u0004\n\u0002\b\u0019¨\u0006K"}, mo24462d2 = {"Ll/a/g;", "T", "Ll/a/g0;", "Ll/a/f;", "Ld/v/j/a/d;", "Lkotlinx/coroutines/internal/CoroutineStackFrame;", "", "s", "()Z", "Lkotlin/Function1;", "", "Ld/r;", "Lkotlinx/coroutines/CompletionHandler;", "handler", "cause", "i", "(Ld/x/b/l;Ljava/lang/Throwable;)V", "", "state", "t", "(Ld/x/b/l;Ljava/lang/Object;)V", "", "mode", "o", "(I)V", "n", "()V", "h", "()Ljava/lang/Object;", "takenState", "b", "(Ljava/lang/Object;Ljava/lang/Throwable;)V", "l", "(Ljava/lang/Throwable;)Z", "Ll/a/d;", "j", "(Ll/a/d;Ljava/lang/Throwable;)V", "onCancellation", "k", "Ll/a/x0;", "parent", "p", "(Ll/a/x0;)Ljava/lang/Throwable;", "q", "Ld/k;", "result", "c", "(Ljava/lang/Object;)V", "r", "(Ld/x/b/l;)V", "m", "f", "(Ljava/lang/Object;)Ljava/lang/Object;", "e", "(Ljava/lang/Object;)Ljava/lang/Throwable;", "", "toString", "()Ljava/lang/String;", "u", "Ld/v/d;", "Ld/v/d;", "d", "()Ld/v/d;", "delegate", "Ld/v/f;", "Ld/v/f;", "getContext", "()Ld/v/f;", "context", "a", "()Ld/v/j/a/d;", "callerFrame", "resumeMode", "<init>", "(Ld/v/d;I)V", "kotlinx-coroutines-core"}, mo24463k = 1, mo24464mv = {1, 4, 2})
/* renamed from: l.a.g */
public class C7721g<T> extends C7722g0<T> implements C7718f<T>, C6839d {

    /* renamed from: l */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f15267l = AtomicIntegerFieldUpdater.newUpdater(C7721g.class, "_decision");

    /* renamed from: m */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f15268m = AtomicReferenceFieldUpdater.newUpdater(C7721g.class, Object.class, "_state");
    private volatile /* synthetic */ int _decision = 0;
    private volatile /* synthetic */ Object _parentHandle = null;
    private volatile /* synthetic */ Object _state = C7702b.f15240g;

    /* renamed from: j */
    public final C6827f f15269j;

    /* renamed from: k */
    public final C6824d<T> f15270k;

    public C7721g(C6824d<? super T> dVar, int i) {
        super(i);
        this.f15270k = dVar;
        this.f15269j = dVar.getContext();
    }

    /* renamed from: a */
    public C6839d mo24172a() {
        C6824d<T> dVar = this.f15270k;
        if (!(dVar instanceof C6839d)) {
            dVar = null;
        }
        return (C6839d) dVar;
    }

    /* renamed from: b */
    public void mo25368b(Object obj, Throwable th) {
        while (true) {
            Object obj2 = this._state;
            if (obj2 instanceof C7732j1) {
                throw new IllegalStateException("Not completed".toString());
            } else if (!(obj2 instanceof C7754q)) {
                if (obj2 instanceof C7751p) {
                    C7751p pVar = (C7751p) obj2;
                    if (!(pVar.f15302e != null)) {
                        if (f15268m.compareAndSet(this, obj2, C7751p.m14098a(pVar, (Object) null, (C7712d) null, (C6862l) null, (Object) null, th, 15))) {
                            C7712d dVar = pVar.f15299b;
                            if (dVar != null) {
                                mo25374j(dVar, th);
                            }
                            C6862l<Throwable, C6777r> lVar = pVar.f15300c;
                            if (lVar != null) {
                                mo25375k(lVar, th);
                                return;
                            }
                            return;
                        }
                    } else {
                        throw new IllegalStateException("Must be called at most once".toString());
                    }
                } else if (f15268m.compareAndSet(this, obj2, new C7751p(obj2, (C7712d) null, (C6862l) null, (Object) null, th, 14))) {
                    return;
                }
            } else {
                return;
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v0, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v1, resolved type: l.a.p} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v8, resolved type: l.a.p} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo24166c(java.lang.Object r13) {
        /*
            r12 = this;
            java.lang.Throwable r0 = p298d.C6769k.m12309a(r13)
            r1 = 0
            if (r0 != 0) goto L_0x0008
            goto L_0x000e
        L_0x0008:
            l.a.q r13 = new l.a.q
            r2 = 2
            r13.<init>(r0, r1, r2)
        L_0x000e:
            int r0 = r12.f15271i
            r2 = 0
        L_0x0011:
            r6 = 0
            java.lang.Object r10 = r12._state
            boolean r3 = r10 instanceof p416l.p417a.C7732j1
            if (r3 == 0) goto L_0x0050
            r3 = r10
            l.a.j1 r3 = (p416l.p417a.C7732j1) r3
            boolean r4 = r13 instanceof p416l.p417a.C7754q
            if (r4 == 0) goto L_0x0020
            goto L_0x003f
        L_0x0020:
            boolean r4 = p005b.p291q.p292a.C5266a.m10010p2(r0)
            if (r4 != 0) goto L_0x0027
            goto L_0x003f
        L_0x0027:
            boolean r4 = r3 instanceof p416l.p417a.C7712d
            if (r4 == 0) goto L_0x003f
            l.a.p r11 = new l.a.p
            boolean r4 = r3 instanceof p416l.p417a.C7712d
            if (r4 != 0) goto L_0x0032
            r3 = r2
        L_0x0032:
            r5 = r3
            l.a.d r5 = (p416l.p417a.C7712d) r5
            r8 = 0
            r9 = 16
            r7 = 0
            r3 = r11
            r4 = r13
            r3.<init>(r4, r5, r6, r7, r8, r9)
            goto L_0x0040
        L_0x003f:
            r11 = r13
        L_0x0040:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = f15268m
            boolean r3 = r3.compareAndSet(r12, r10, r11)
            if (r3 != 0) goto L_0x0049
            goto L_0x0011
        L_0x0049:
            r12.mo25378n()
            r12.mo25379o(r0)
            goto L_0x0062
        L_0x0050:
            boolean r0 = r10 instanceof p416l.p417a.C7724h
            if (r0 == 0) goto L_0x0063
            l.a.h r10 = (p416l.p417a.C7724h) r10
            java.util.Objects.requireNonNull(r10)
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = p416l.p417a.C7724h.f15272c
            r2 = 1
            boolean r0 = r0.compareAndSet(r10, r1, r2)
            if (r0 == 0) goto L_0x0063
        L_0x0062:
            return
        L_0x0063:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Already resumed, but proposed with update "
            r0.append(r1)
            r0.append(r13)
            java.lang.String r13 = r0.toString()
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r13 = r13.toString()
            r0.<init>(r13)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p416l.p417a.C7721g.mo24166c(java.lang.Object):void");
    }

    /* renamed from: d */
    public final C6824d<T> mo25369d() {
        return this.f15270k;
    }

    /* renamed from: e */
    public Throwable mo25370e(Object obj) {
        Throwable e = super.mo25370e(obj);
        if (e != null) {
            return e;
        }
        return null;
    }

    /* renamed from: f */
    public <T> T mo25371f(Object obj) {
        return obj instanceof C7751p ? ((C7751p) obj).f15298a : obj;
    }

    public C6827f getContext() {
        return this.f15269j;
    }

    /* renamed from: h */
    public Object mo25372h() {
        return this._state;
    }

    /* renamed from: i */
    public final void mo25373i(C6862l<? super Throwable, C6777r> lVar, Throwable th) {
        try {
            lVar.invoke(th);
        } catch (Throwable th2) {
            C6827f fVar = this.f15269j;
            C5266a.m9904X1(fVar, new C7764t("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    /* renamed from: j */
    public final void mo25374j(C7712d dVar, Throwable th) {
        try {
            dVar.mo25366a(th);
        } catch (Throwable th2) {
            C6827f fVar = this.f15269j;
            C5266a.m9904X1(fVar, new C7764t("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    /* renamed from: k */
    public final void mo25375k(C6862l<? super Throwable, C6777r> lVar, Throwable th) {
        try {
            lVar.invoke(th);
        } catch (Throwable th2) {
            C6827f fVar = this.f15269j;
            C5266a.m9904X1(fVar, new C7764t("Exception in resume onCancellation handler for " + this, th2));
        }
    }

    /* renamed from: l */
    public boolean mo25376l(Throwable th) {
        Object obj;
        boolean z;
        do {
            obj = this._state;
            if (!(obj instanceof C7732j1)) {
                return false;
            }
            z = obj instanceof C7712d;
        } while (!f15268m.compareAndSet(this, obj, new C7724h(this, th, z)));
        if (!z) {
            obj = null;
        }
        C7712d dVar = (C7712d) obj;
        if (dVar != null) {
            mo25374j(dVar, th);
        }
        mo25378n();
        mo25379o(this.f15271i);
        return true;
    }

    /* renamed from: m */
    public final void mo25377m() {
        C7728i0 i0Var = (C7728i0) this._parentHandle;
        if (i0Var != null) {
            i0Var.dispose();
        }
        this._parentHandle = C7729i1.f15276g;
    }

    /* renamed from: n */
    public final void mo25378n() {
        if (!mo25382s()) {
            C7728i0 i0Var = (C7728i0) this._parentHandle;
            if (i0Var != null) {
                i0Var.dispose();
            }
            this._parentHandle = C7729i1.f15276g;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP_START, MTH_ENTER_BLOCK] */
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo25379o(int r5) {
        /*
            r4 = this;
        L_0x0000:
            int r0 = r4._decision
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0016
            if (r0 != r1) goto L_0x000a
            r0 = r2
            goto L_0x0020
        L_0x000a:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "Already resumed"
            java.lang.String r0 = r0.toString()
            r5.<init>(r0)
            throw r5
        L_0x0016:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = f15267l
            r3 = 2
            boolean r0 = r0.compareAndSet(r4, r2, r3)
            if (r0 == 0) goto L_0x0000
            r0 = r1
        L_0x0020:
            if (r0 == 0) goto L_0x0023
            return
        L_0x0023:
            d.v.d r0 = r4.mo25369d()
            r3 = 4
            if (r5 != r3) goto L_0x002b
            r2 = r1
        L_0x002b:
            if (r2 != 0) goto L_0x007f
            boolean r3 = r0 instanceof p416l.p417a.p419u1.C7775e
            if (r3 == 0) goto L_0x007f
            boolean r5 = p005b.p291q.p292a.C5266a.m10010p2(r5)
            int r3 = r4.f15271i
            boolean r3 = p005b.p291q.p292a.C5266a.m10010p2(r3)
            if (r5 != r3) goto L_0x007f
            r5 = r0
            l.a.u1.e r5 = (p416l.p417a.p419u1.C7775e) r5
            l.a.w r5 = r5.f15330l
            d.v.f r0 = r0.getContext()
            boolean r2 = r5.mo25425o0(r0)
            if (r2 == 0) goto L_0x0050
            r5.mo25402n0(r0, r4)
            goto L_0x0082
        L_0x0050:
            l.a.o1 r5 = p416l.p417a.C7750o1.f15297b
            l.a.l0 r5 = p416l.p417a.C7750o1.m14097a()
            boolean r0 = r5.mo25399t0()
            if (r0 == 0) goto L_0x0060
            r5.mo25396r0(r4)
            goto L_0x0082
        L_0x0060:
            r5.mo25397s0(r1)
            d.v.d r0 = r4.mo25369d()     // Catch:{ all -> 0x0071 }
            p005b.p291q.p292a.C5266a.m9840L3(r4, r0, r1)     // Catch:{ all -> 0x0071 }
        L_0x006a:
            boolean r0 = r5.mo25400u0()     // Catch:{ all -> 0x0071 }
            if (r0 != 0) goto L_0x006a
            goto L_0x0076
        L_0x0071:
            r0 = move-exception
            r2 = 0
            r4.mo25385g(r0, r2)     // Catch:{ all -> 0x007a }
        L_0x0076:
            r5.mo25394p0(r1)
            goto L_0x0082
        L_0x007a:
            r0 = move-exception
            r5.mo25394p0(r1)
            throw r0
        L_0x007f:
            p005b.p291q.p292a.C5266a.m9840L3(r4, r0, r2)
        L_0x0082:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p416l.p417a.C7721g.mo25379o(int):void");
    }

    /* renamed from: p */
    public Throwable mo25353p(C7819x0 x0Var) {
        return ((C7707c1) x0Var).mo25334S();
    }

    /* renamed from: q */
    public final Object mo25380q() {
        C7819x0 x0Var;
        C7819x0 x0Var2;
        Throwable i;
        boolean z = true;
        boolean z2 = !(this._state instanceof C7732j1);
        if (this.f15271i == 2) {
            C6824d<T> dVar = this.f15270k;
            if (!(dVar instanceof C7775e)) {
                dVar = null;
            }
            C7775e eVar = (C7775e) dVar;
            if (!(eVar == null || (i = eVar.mo25438i(this)) == null)) {
                if (!z2) {
                    mo25376l(i);
                }
                z2 = true;
            }
        }
        if (!z2 && ((C7728i0) this._parentHandle) == null && (x0Var2 = (C7819x0) this.f15270k.getContext().get(C7819x0.f15427f)) != null) {
            C7728i0 n2 = C5266a.m9998n2(x0Var2, true, false, new C7727i(this), 2, (Object) null);
            this._parentHandle = n2;
            if ((!(this._state instanceof C7732j1)) && !mo25382s()) {
                n2.dispose();
                this._parentHandle = C7729i1.f15276g;
            }
        }
        while (true) {
            int i2 = this._decision;
            if (i2 == 0) {
                if (f15267l.compareAndSet(this, 0, 1)) {
                    break;
                }
            } else if (i2 == 2) {
                z = false;
            } else {
                throw new IllegalStateException("Already suspended".toString());
            }
        }
        if (z) {
            return C6833a.COROUTINE_SUSPENDED;
        }
        Object obj = this._state;
        if (obj instanceof C7754q) {
            throw ((C7754q) obj).f15306a;
        } else if (!C5266a.m10010p2(this.f15271i) || (x0Var = (C7819x0) this.f15269j.get(C7819x0.f15427f)) == null || x0Var.mo25307d()) {
            return mo25371f(obj);
        } else {
            CancellationException S = x0Var.mo25334S();
            mo25368b(obj, S);
            throw S;
        }
    }

    /* renamed from: r */
    public void mo25381r(C6862l<? super Throwable, C6777r> lVar) {
        C7712d dVar = (C7712d) lVar;
        while (true) {
            Object obj = this._state;
            if (!(obj instanceof C7702b)) {
                Throwable th = null;
                if (!(obj instanceof C7712d)) {
                    boolean z = obj instanceof C7754q;
                    boolean z2 = true;
                    if (z) {
                        C7754q qVar = (C7754q) obj;
                        Objects.requireNonNull(qVar);
                        if (!C7754q.f15305b.compareAndSet(qVar, 0, 1)) {
                            mo25383t(lVar, obj);
                            throw null;
                        } else if (obj instanceof C7724h) {
                            if (!z) {
                                obj = null;
                            }
                            C7754q qVar2 = (C7754q) obj;
                            if (qVar2 != null) {
                                th = qVar2.f15306a;
                            }
                            mo25373i(lVar, th);
                            return;
                        } else {
                            return;
                        }
                    } else if (obj instanceof C7751p) {
                        C7751p pVar = (C7751p) obj;
                        if (pVar.f15299b == null) {
                            Throwable th2 = pVar.f15302e;
                            if (th2 == null) {
                                z2 = false;
                            }
                            if (z2) {
                                mo25373i(lVar, th2);
                                return;
                            }
                            if (f15268m.compareAndSet(this, obj, C7751p.m14098a(pVar, (Object) null, dVar, (C6862l) null, (Object) null, (Throwable) null, 29))) {
                                return;
                            }
                        } else {
                            mo25383t(lVar, obj);
                            throw null;
                        }
                    } else {
                        if (f15268m.compareAndSet(this, obj, new C7751p(obj, dVar, (C6862l) null, (Object) null, (Throwable) null, 28))) {
                            return;
                        }
                    }
                } else {
                    mo25383t(lVar, obj);
                    throw null;
                }
            } else if (f15268m.compareAndSet(this, obj, dVar)) {
                return;
            }
        }
    }

    /* renamed from: s */
    public final boolean mo25382s() {
        C6824d<T> dVar = this.f15270k;
        return (dVar instanceof C7775e) && ((C7775e) dVar).mo25440k(this);
    }

    /* renamed from: t */
    public final void mo25383t(C6862l<? super Throwable, C6777r> lVar, Object obj) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + lVar + ", already has " + obj).toString());
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(mo25354u());
        sb.append('(');
        sb.append(C5266a.m10036t4(this.f15270k));
        sb.append("){");
        Object obj = this._state;
        sb.append(obj instanceof C7732j1 ? "Active" : obj instanceof C7724h ? "Cancelled" : "Completed");
        sb.append("}@");
        sb.append(C5266a.m10027s1(this));
        return sb.toString();
    }

    /* renamed from: u */
    public String mo25354u() {
        return "CancellableContinuation";
    }
}
