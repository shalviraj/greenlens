package p416l.p417a;

import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import p005b.p035e.p036a.p037a.C0843a;
import p005b.p291q.p292a.C5266a;
import p298d.C6777r;
import p298d.p337v.C6824d;
import p298d.p337v.C6827f;
import p298d.p344x.p345b.C6866p;
import p298d.p344x.p346c.C6888i;
import p416l.p417a.p419u1.C7778h;
import p416l.p417a.p419u1.C7779i;
import p416l.p417a.p419u1.C7786m;

@Metadata(mo24460bv = {1, 0, 3}, mo24461d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u001a\b\u0017\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0003vwxB\u000f\u0012\u0006\u0010s\u001a\u00020\u0015¢\u0006\u0004\bt\u0010uJ#\u0010\b\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\b\u0010\tJ!\u0010\r\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0019\u0010\u0019\u001a\u00020\u00182\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ'\u0010\u001e\u001a\u00020\u00152\u0006\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010 \u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\u001cH\u0002¢\u0006\u0004\b \u0010!J\u0019\u0010\"\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\"\u0010#J\u0019\u0010$\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0006\u001a\u00020\nH\u0002¢\u0006\u0004\b$\u0010%J%\u0010&\u001a\u0004\u0018\u00010\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b&\u0010'J*\u0010*\u001a\u00020\u00152\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010)\u001a\u00020(2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004H\u0010¢\u0006\u0004\b*\u0010+J\u0015\u0010-\u001a\u0004\u0018\u00010(*\u00020,H\u0002¢\u0006\u0004\b-\u0010.J\u0019\u00100\u001a\u00020/2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b0\u00101J\u0019\u00103\u001a\u00020\f2\b\u00102\u001a\u0004\u0018\u00010\u0001H\u0000¢\u0006\u0004\b3\u00104J\r\u00105\u001a\u00020\u0015¢\u0006\u0004\b5\u00106J\u000f\u00107\u001a\u00020\fH\u0010¢\u0006\u0004\b7\u00108J\u0011\u0010;\u001a\u000609j\u0002`:¢\u0006\u0004\b;\u0010<J#\u0010>\u001a\u000609j\u0002`:*\u00020\u00112\n\b\u0002\u0010=\u001a\u0004\u0018\u00010/H\u0004¢\u0006\u0004\b>\u0010?J7\u0010F\u001a\u00020E2\u0006\u0010@\u001a\u00020\u00152\u0006\u0010A\u001a\u00020\u00152\u0018\u0010D\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0012\u0004\u0012\u00020\f0Bj\u0002`C¢\u0006\u0004\bF\u0010GJ\u000f\u0010H\u001a\u00020/H\u0014¢\u0006\u0004\bH\u0010IJ\u0015\u0010K\u001a\u00020\f2\u0006\u0010J\u001a\u00020\u0003¢\u0006\u0004\bK\u0010LJ\u0019\u0010M\u001a\u00020\u00152\b\u0010\u0012\u001a\u0004\u0018\u00010\u0004H\u0000¢\u0006\u0004\bM\u0010NJ\u0013\u0010O\u001a\u000609j\u0002`:H\u0016¢\u0006\u0004\bO\u0010<J\u001b\u0010P\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004H\u0000¢\u0006\u0004\bP\u0010QJ\u0015\u0010S\u001a\u00020R2\u0006\u0010)\u001a\u00020\u0002¢\u0006\u0004\bS\u0010TJ\u0017\u0010V\u001a\u00020\f2\u0006\u0010U\u001a\u00020\u0011H\u0010¢\u0006\u0004\bV\u0010WJ\u0019\u0010X\u001a\u00020\f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0014¢\u0006\u0004\bX\u0010WJ\u0017\u0010Y\u001a\u00020\u00152\u0006\u0010U\u001a\u00020\u0011H\u0014¢\u0006\u0004\bY\u0010\u0017J\u0019\u0010Z\u001a\u00020\f2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\bZ\u0010[J\u0019\u0010\\\u001a\u00020\f2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b\\\u0010[J\u000f\u0010]\u001a\u00020/H\u0016¢\u0006\u0004\b]\u0010IJ\u000f\u0010^\u001a\u00020/H\u0010¢\u0006\u0004\b^\u0010IR\u0017\u0010b\u001a\u0006\u0012\u0002\b\u00030_8F@\u0006¢\u0006\u0006\u001a\u0004\b`\u0010aR(\u0010h\u001a\u0004\u0018\u00010R2\b\u0010c\u001a\u0004\u0018\u00010R8@@@X\u000e¢\u0006\f\u001a\u0004\bd\u0010e\"\u0004\bf\u0010gR\u0016\u0010j\u001a\u00020\u00158P@\u0010X\u0004¢\u0006\u0006\u001a\u0004\bi\u00106R\u0016\u0010l\u001a\u00020\u00158V@\u0016X\u0004¢\u0006\u0006\u001a\u0004\bk\u00106R\u0016\u0010n\u001a\u00020\u00158T@\u0014X\u0004¢\u0006\u0006\u001a\u0004\bm\u00106R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00048@@\u0000X\u0004¢\u0006\u0006\u001a\u0004\bo\u0010pR\u0016\u0010r\u001a\u00020\u00158P@\u0010X\u0004¢\u0006\u0006\u001a\u0004\bq\u00106¨\u0006y"}, mo24462d2 = {"Ll/a/c1;", "Ll/a/x0;", "Ll/a/l;", "Ll/a/k1;", "", "Ll/a/c1$c;", "state", "proposedUpdate", "m", "(Ll/a/c1$c;Ljava/lang/Object;)Ljava/lang/Object;", "Ll/a/t0;", "update", "Ld/r;", "k", "(Ll/a/t0;Ljava/lang/Object;)V", "Ll/a/h1;", "list", "", "cause", "B", "(Ll/a/h1;Ljava/lang/Throwable;)V", "", "i", "(Ljava/lang/Throwable;)Z", "", "G", "(Ljava/lang/Object;)I", "expect", "Ll/a/b1;", "node", "f", "(Ljava/lang/Object;Ll/a/h1;Ll/a/b1;)Z", "F", "(Ll/a/b1;)V", "l", "(Ljava/lang/Object;)Ljava/lang/Throwable;", "p", "(Ll/a/t0;)Ll/a/h1;", "J", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "Ll/a/k;", "child", "K", "(Ll/a/c1$c;Ll/a/k;Ljava/lang/Object;)Z", "Ll/a/u1/i;", "A", "(Ll/a/u1/i;)Ll/a/k;", "", "H", "(Ljava/lang/Object;)Ljava/lang/String;", "parent", "v", "(Ll/a/x0;)V", "start", "()Z", "E", "()V", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "S", "()Ljava/util/concurrent/CancellationException;", "message", "I", "(Ljava/lang/Throwable;Ljava/lang/String;)Ljava/util/concurrent/CancellationException;", "onCancelling", "invokeImmediately", "Lkotlin/Function1;", "Lkotlinx/coroutines/CompletionHandler;", "handler", "Ll/a/i0;", "O", "(ZZLd/x/b/l;)Ll/a/i0;", "j", "()Ljava/lang/String;", "parentJob", "Z", "(Ll/a/k1;)V", "h", "(Ljava/lang/Object;)Z", "N", "x", "(Ljava/lang/Object;)Ljava/lang/Object;", "Ll/a/j;", "l0", "(Ll/a/l;)Ll/a/j;", "exception", "u", "(Ljava/lang/Throwable;)V", "C", "t", "D", "(Ljava/lang/Object;)V", "g", "toString", "y", "Ld/v/f$b;", "getKey", "()Ld/v/f$b;", "key", "value", "r", "()Ll/a/j;", "setParentHandle$kotlinx_coroutines_core", "(Ll/a/j;)V", "parentHandle", "n", "handlesException", "d", "isActive", "w", "isScopedCoroutine", "s", "()Ljava/lang/Object;", "o", "onCancelComplete", "active", "<init>", "(Z)V", "a", "b", "c", "kotlinx-coroutines-core"}, mo24463k = 1, mo24464mv = {1, 4, 2})
/* renamed from: l.a.c1 */
public class C7707c1 implements C7819x0, C7736l, C7735k1 {

    /* renamed from: g */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f15245g = AtomicReferenceFieldUpdater.newUpdater(C7707c1.class, Object.class, "_state");
    private volatile /* synthetic */ Object _parentHandle;
    private volatile /* synthetic */ Object _state;

    @Metadata(mo24460bv = {1, 0, 3}, mo24461d1 = {"\u0000.\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001d\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f\u0012\u0006\u0010\u000e\u001a\u00020\u000b¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\t\u0010\nR\u0016\u0010\u000e\u001a\u00020\u000b8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0013"}, mo24462d2 = {"l/a/c1$a", "T", "Ll/a/g;", "Ll/a/x0;", "parent", "", "p", "(Ll/a/x0;)Ljava/lang/Throwable;", "", "u", "()Ljava/lang/String;", "Ll/a/c1;", "n", "Ll/a/c1;", "job", "Ld/v/d;", "delegate", "<init>", "(Ld/v/d;Ll/a/c1;)V", "kotlinx-coroutines-core"}, mo24463k = 1, mo24464mv = {1, 4, 2})
    /* renamed from: l.a.c1$a */
    public static final class C7708a<T> extends C7721g<T> {

        /* renamed from: n */
        public final C7707c1 f15246n;

        public C7708a(C6824d<? super T> dVar, C7707c1 c1Var) {
            super(dVar, 1);
            this.f15246n = c1Var;
        }

        /* renamed from: p */
        public Throwable mo25353p(C7819x0 x0Var) {
            Throwable c;
            Object s = this.f15246n.mo25346s();
            return (!(s instanceof C7710c) || (c = ((C7710c) s).mo25358c()) == null) ? s instanceof C7754q ? ((C7754q) s).f15306a : ((C7707c1) x0Var).mo25334S() : c;
        }

        /* renamed from: u */
        public String mo25354u() {
            return "AwaitContinuation";
        }
    }

    @Metadata(mo24460bv = {1, 0, 3}, mo24461d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\u0006\u0010\u0015\u001a\u00020\u0012\u0012\u0006\u0010\u0011\u001a\u00020\u000f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\n\u001a\u00020\u00078\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0016\u0010\u0011\u001a\u00020\u000f8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0010R\u0016\u0010\u0015\u001a\u00020\u00128\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0018"}, mo24462d2 = {"l/a/c1$b", "Ll/a/b1;", "", "cause", "Ld/r;", "m", "(Ljava/lang/Throwable;)V", "Ll/a/c1;", "k", "Ll/a/c1;", "parent", "", "n", "Ljava/lang/Object;", "proposedUpdate", "Ll/a/k;", "Ll/a/k;", "child", "Ll/a/c1$c;", "l", "Ll/a/c1$c;", "state", "<init>", "(Ll/a/c1;Ll/a/c1$c;Ll/a/k;Ljava/lang/Object;)V", "kotlinx-coroutines-core"}, mo24463k = 1, mo24464mv = {1, 4, 2})
    /* renamed from: l.a.c1$b */
    public static final class C7709b extends C7704b1 {

        /* renamed from: k */
        public final C7707c1 f15247k;

        /* renamed from: l */
        public final C7710c f15248l;

        /* renamed from: m */
        public final C7733k f15249m;

        /* renamed from: n */
        public final Object f15250n;

        public C7709b(C7707c1 c1Var, C7710c cVar, C7733k kVar, Object obj) {
            this.f15247k = c1Var;
            this.f15248l = cVar;
            this.f15249m = kVar;
            this.f15250n = obj;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo25355m((Throwable) obj);
            return C6777r.f13694a;
        }

        /* renamed from: m */
        public void mo25355m(Throwable th) {
            C7707c1 c1Var = this.f15247k;
            C7710c cVar = this.f15248l;
            C7733k kVar = this.f15249m;
            Object obj = this.f15250n;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C7707c1.f15245g;
            C7733k A = c1Var.mo25323A(kVar);
            if (A == null || !c1Var.mo25331K(cVar, A, obj)) {
                c1Var.mo25337g(c1Var.mo25343m(cVar, obj));
            }
        }
    }

    @Metadata(mo24460bv = {1, 0, 3}, mo24461d1 = {"\u0000H\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\r\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u00022\u00020\u0003B!\u0012\u0006\u0010$\u001a\u00020\u001f\u0012\u0006\u0010)\u001a\u00020\u0014\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b*\u0010+J\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0012\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0010j\b\u0012\u0004\u0012\u00020\u0004`\u0011H\u0002¢\u0006\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0017\u001a\u00020\u00148F@\u0006¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R(\u0010\u001c\u001a\u0004\u0018\u00010\u00042\b\u0010\u0018\u001a\u0004\u0018\u00010\u00048F@FX\u000e¢\u0006\f\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\fR\u0016\u0010\u001e\u001a\u00020\u00148V@\u0016X\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u0016R\u001c\u0010$\u001a\u00020\u001f8\u0016@\u0016X\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0013\u0010&\u001a\u00020\u00148F@\u0006¢\u0006\u0006\u001a\u0004\b%\u0010\u0016R$\u0010)\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u00148F@FX\u000e¢\u0006\f\u001a\u0004\b \u0010\u0016\"\u0004\b'\u0010(¨\u0006,"}, mo24462d2 = {"l/a/c1$c", "", "Lkotlinx/coroutines/internal/SynchronizedObject;", "Ll/a/t0;", "", "proposedException", "", "i", "(Ljava/lang/Throwable;)Ljava/util/List;", "exception", "Ld/r;", "a", "(Ljava/lang/Throwable;)V", "", "toString", "()Ljava/lang/String;", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "b", "()Ljava/util/ArrayList;", "", "f", "()Z", "isCancelling", "value", "c", "()Ljava/lang/Throwable;", "setRootCause", "rootCause", "d", "isActive", "Ll/a/h1;", "g", "Ll/a/h1;", "e", "()Ll/a/h1;", "list", "h", "isSealed", "j", "(Z)V", "isCompleting", "<init>", "(Ll/a/h1;ZLjava/lang/Throwable;)V", "kotlinx-coroutines-core"}, mo24463k = 1, mo24464mv = {1, 4, 2})
    /* renamed from: l.a.c1$c */
    public static final class C7710c implements C7765t0 {
        private volatile /* synthetic */ Object _exceptionsHolder = null;
        private volatile /* synthetic */ int _isCompleting;
        private volatile /* synthetic */ Object _rootCause;

        /* renamed from: g */
        public final C7726h1 f15251g;

        public C7710c(C7726h1 h1Var, boolean z, Throwable th) {
            this.f15251g = h1Var;
            this._isCompleting = z ? 1 : 0;
            this._rootCause = th;
        }

        /* renamed from: a */
        public final void mo25356a(Throwable th) {
            Throwable th2 = (Throwable) this._rootCause;
            if (th2 == null) {
                this._rootCause = th;
            } else if (th != th2) {
                Object obj = this._exceptionsHolder;
                if (obj == null) {
                    this._exceptionsHolder = th;
                } else if (obj instanceof Throwable) {
                    if (th != obj) {
                        ArrayList<Throwable> b = mo25357b();
                        b.add(obj);
                        b.add(th);
                        this._exceptionsHolder = b;
                    }
                } else if (obj instanceof ArrayList) {
                    ((ArrayList) obj).add(th);
                } else {
                    throw new IllegalStateException(("State is " + obj).toString());
                }
            }
        }

        /* renamed from: b */
        public final ArrayList<Throwable> mo25357b() {
            return new ArrayList<>(4);
        }

        /* renamed from: c */
        public final Throwable mo25358c() {
            return (Throwable) this._rootCause;
        }

        /* renamed from: d */
        public boolean mo25318d() {
            return ((Throwable) this._rootCause) == null;
        }

        /* renamed from: e */
        public C7726h1 mo25320e() {
            return this.f15251g;
        }

        /* renamed from: f */
        public final boolean mo25359f() {
            return ((Throwable) this._rootCause) != null;
        }

        /* JADX WARNING: type inference failed for: r0v0, types: [int, boolean] */
        /* renamed from: g */
        public final boolean mo25360g() {
            return this._isCompleting;
        }

        /* renamed from: h */
        public final boolean mo25361h() {
            return this._exceptionsHolder == C7714d1.f15261e;
        }

        /* renamed from: i */
        public final List<Throwable> mo25362i(Throwable th) {
            ArrayList<Throwable> arrayList;
            Object obj = this._exceptionsHolder;
            if (obj == null) {
                arrayList = mo25357b();
            } else if (obj instanceof Throwable) {
                ArrayList<Throwable> b = mo25357b();
                b.add(obj);
                arrayList = b;
            } else if (obj instanceof ArrayList) {
                arrayList = (ArrayList) obj;
            } else {
                throw new IllegalStateException(("State is " + obj).toString());
            }
            Throwable th2 = (Throwable) this._rootCause;
            if (th2 != null) {
                arrayList.add(0, th2);
            }
            if (th != null && (!C6888i.m12434a(th, th2))) {
                arrayList.add(th);
            }
            this._exceptionsHolder = C7714d1.f15261e;
            return arrayList;
        }

        /* renamed from: j */
        public final void mo25363j(boolean z) {
            this._isCompleting = z ? 1 : 0;
        }

        /* JADX WARNING: type inference failed for: r1v2, types: [int, boolean] */
        public String toString() {
            StringBuilder u = C0843a.m460u("Finishing[cancelling=");
            u.append(mo25359f());
            u.append(", completing=");
            u.append(this._isCompleting);
            u.append(", rootCause=");
            u.append((Throwable) this._rootCause);
            u.append(", exceptions=");
            u.append(this._exceptionsHolder);
            u.append(", list=");
            u.append(this.f15251g);
            u.append(']');
            return u.toString();
        }
    }

    @Metadata(mo24460bv = {1, 0, 3}, mo24461d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo24462d2 = {"l/a/c1$d", "Ll/a/u1/i$a;", "kotlinx-coroutines-core"}, mo24463k = 1, mo24464mv = {1, 4, 2})
    /* renamed from: l.a.c1$d */
    public static final class C7711d extends C7779i.C7780a {

        /* renamed from: d */
        public final /* synthetic */ C7707c1 f15252d;

        /* renamed from: e */
        public final /* synthetic */ Object f15253e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C7711d(C7779i iVar, C7779i iVar2, C7707c1 c1Var, Object obj) {
            super(iVar2);
            this.f15252d = c1Var;
            this.f15253e = obj;
        }

        /* renamed from: c */
        public Object mo25365c(Object obj) {
            C7779i iVar = (C7779i) obj;
            if (this.f15252d.mo25346s() == this.f15253e) {
                return null;
            }
            return C7778h.f15334a;
        }
    }

    public C7707c1(boolean z) {
        this._state = z ? C7714d1.f15263g : C7714d1.f15262f;
        this._parentHandle = null;
    }

    /* renamed from: A */
    public final C7733k mo25323A(C7779i iVar) {
        while (iVar.mo25443j()) {
            iVar = iVar.mo25448i();
        }
        while (true) {
            iVar = iVar.mo25447h();
            if (!iVar.mo25443j()) {
                if (iVar instanceof C7733k) {
                    return (C7733k) iVar;
                }
                if (iVar instanceof C7726h1) {
                    return null;
                }
            }
        }
    }

    /* renamed from: B */
    public final void mo25324B(C7726h1 h1Var, Throwable th) {
        mo25325C();
        Object g = h1Var.mo25446g();
        Objects.requireNonNull(g, "null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */");
        C7764t tVar = null;
        for (C7779i iVar = (C7779i) g; !C6888i.m12434a(iVar, h1Var); iVar = iVar.mo25447h()) {
            if (iVar instanceof C7824z0) {
                C7704b1 b1Var = (C7704b1) iVar;
                try {
                    b1Var.mo25355m(th);
                } catch (Throwable th2) {
                    if (tVar != null) {
                        C5266a.m10007p(tVar, th2);
                    } else {
                        tVar = new C7764t("Exception in completion handler " + b1Var + " for " + this, th2);
                    }
                }
            }
        }
        if (tVar != null) {
            mo25309u(tVar);
        }
        mo25339i(th);
    }

    /* renamed from: C */
    public void mo25325C() {
    }

    /* renamed from: D */
    public void mo25298D(Object obj) {
    }

    /* renamed from: E */
    public void mo25299E() {
    }

    /* renamed from: F */
    public final void mo25326F(C7704b1 b1Var) {
        C7726h1 h1Var = new C7726h1();
        C7779i.f15336h.lazySet(h1Var, b1Var);
        C7779i.f15335g.lazySet(h1Var, b1Var);
        while (true) {
            if (b1Var.mo25446g() == b1Var) {
                if (C7779i.f15335g.compareAndSet(b1Var, b1Var, h1Var)) {
                    h1Var.mo25445f(b1Var);
                    break;
                }
            } else {
                break;
            }
        }
        f15245g.compareAndSet(this, b1Var, b1Var.mo25447h());
    }

    /* renamed from: G */
    public final int mo25327G(Object obj) {
        if (obj instanceof C7734k0) {
            if (((C7734k0) obj).f15279g) {
                return 0;
            }
            if (!f15245g.compareAndSet(this, obj, C7714d1.f15263g)) {
                return -1;
            }
            mo25299E();
            return 1;
        } else if (!(obj instanceof C7761s0)) {
            return 0;
        } else {
            if (!f15245g.compareAndSet(this, obj, ((C7761s0) obj).f15313g)) {
                return -1;
            }
            mo25299E();
            return 1;
        }
    }

    /* renamed from: H */
    public final String mo25328H(Object obj) {
        if (!(obj instanceof C7710c)) {
            return obj instanceof C7765t0 ? ((C7765t0) obj).mo25318d() ? "Active" : "New" : obj instanceof C7754q ? "Cancelled" : "Completed";
        }
        C7710c cVar = (C7710c) obj;
        return cVar.mo25359f() ? "Cancelling" : cVar.mo25360g() ? "Completing" : "Active";
    }

    /* renamed from: I */
    public final CancellationException mo25329I(Throwable th, String str) {
        CancellationException cancellationException = (CancellationException) (!(th instanceof CancellationException) ? null : th);
        if (cancellationException == null) {
            if (str == null) {
                str = mo25308j();
            }
            cancellationException = new C7822y0(str, th, this);
        }
        return cancellationException;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0096, code lost:
        if (r5 == null) goto L_0x009b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0098, code lost:
        mo25324B(r0, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x009d, code lost:
        if ((r7 instanceof p416l.p417a.C7733k) != false) goto L_0x00a1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x009f, code lost:
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x00a1, code lost:
        r0 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x00a2, code lost:
        r0 = (p416l.p417a.C7733k) r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x00a4, code lost:
        if (r0 == null) goto L_0x00a8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x00a6, code lost:
        r4 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x00a8, code lost:
        r7 = r7.mo25320e();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x00ac, code lost:
        if (r7 == null) goto L_0x00b2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x00ae, code lost:
        r4 = mo25323A(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x00b2, code lost:
        if (r4 == null) goto L_0x00bd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x00b8, code lost:
        if (mo25331K(r3, r4, r8) == false) goto L_0x00bd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:?, code lost:
        return p416l.p417a.C7714d1.f15258b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:?, code lost:
        return mo25343m(r3, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:?, code lost:
        return r7;
     */
    /* renamed from: J */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo25330J(java.lang.Object r7, java.lang.Object r8) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof p416l.p417a.C7765t0
            if (r0 != 0) goto L_0x0007
            l.a.u1.p r7 = p416l.p417a.C7714d1.f15257a
            return r7
        L_0x0007:
            boolean r0 = r7 instanceof p416l.p417a.C7734k0
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L_0x0011
            boolean r0 = r7 instanceof p416l.p417a.C7704b1
            if (r0 == 0) goto L_0x0042
        L_0x0011:
            boolean r0 = r7 instanceof p416l.p417a.C7733k
            if (r0 != 0) goto L_0x0042
            boolean r0 = r8 instanceof p416l.p417a.C7754q
            if (r0 != 0) goto L_0x0042
            l.a.t0 r7 = (p416l.p417a.C7765t0) r7
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = f15245g
            boolean r3 = r8 instanceof p416l.p417a.C7765t0
            if (r3 == 0) goto L_0x002a
            l.a.u0 r3 = new l.a.u0
            r4 = r8
            l.a.t0 r4 = (p416l.p417a.C7765t0) r4
            r3.<init>(r4)
            goto L_0x002b
        L_0x002a:
            r3 = r8
        L_0x002b:
            boolean r0 = r0.compareAndSet(r6, r7, r3)
            if (r0 != 0) goto L_0x0033
            r1 = r2
            goto L_0x003c
        L_0x0033:
            r6.mo25325C()
            r6.mo25298D(r8)
            r6.mo25340k(r7, r8)
        L_0x003c:
            if (r1 == 0) goto L_0x003f
            return r8
        L_0x003f:
            l.a.u1.p r7 = p416l.p417a.C7714d1.f15259c
            return r7
        L_0x0042:
            l.a.t0 r7 = (p416l.p417a.C7765t0) r7
            l.a.h1 r0 = r6.mo25344p(r7)
            if (r0 == 0) goto L_0x00c5
            boolean r3 = r7 instanceof p416l.p417a.C7707c1.C7710c
            r4 = 0
            if (r3 != 0) goto L_0x0051
            r3 = r4
            goto L_0x0052
        L_0x0051:
            r3 = r7
        L_0x0052:
            l.a.c1$c r3 = (p416l.p417a.C7707c1.C7710c) r3
            if (r3 == 0) goto L_0x0057
            goto L_0x005c
        L_0x0057:
            l.a.c1$c r3 = new l.a.c1$c
            r3.<init>(r0, r2, r4)
        L_0x005c:
            monitor-enter(r3)
            boolean r2 = r3.mo25360g()     // Catch:{ all -> 0x00c2 }
            if (r2 == 0) goto L_0x0068
            l.a.u1.p r7 = p416l.p417a.C7714d1.f15257a     // Catch:{ all -> 0x00c2 }
        L_0x0065:
            monitor-exit(r3)
            goto L_0x00c7
        L_0x0068:
            r3.mo25363j(r1)     // Catch:{ all -> 0x00c2 }
            if (r3 == r7) goto L_0x0078
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r2 = f15245g     // Catch:{ all -> 0x00c2 }
            boolean r2 = r2.compareAndSet(r6, r7, r3)     // Catch:{ all -> 0x00c2 }
            if (r2 != 0) goto L_0x0078
            l.a.u1.p r7 = p416l.p417a.C7714d1.f15259c     // Catch:{ all -> 0x00c2 }
            goto L_0x0065
        L_0x0078:
            boolean r2 = r3.mo25359f()     // Catch:{ all -> 0x00c2 }
            boolean r5 = r8 instanceof p416l.p417a.C7754q     // Catch:{ all -> 0x00c2 }
            if (r5 != 0) goto L_0x0082
            r5 = r4
            goto L_0x0083
        L_0x0082:
            r5 = r8
        L_0x0083:
            l.a.q r5 = (p416l.p417a.C7754q) r5     // Catch:{ all -> 0x00c2 }
            if (r5 == 0) goto L_0x008c
            java.lang.Throwable r5 = r5.f15306a     // Catch:{ all -> 0x00c2 }
            r3.mo25356a(r5)     // Catch:{ all -> 0x00c2 }
        L_0x008c:
            java.lang.Throwable r5 = r3.mo25358c()     // Catch:{ all -> 0x00c2 }
            r1 = r1 ^ r2
            if (r1 == 0) goto L_0x0094
            goto L_0x0095
        L_0x0094:
            r5 = r4
        L_0x0095:
            monitor-exit(r3)
            if (r5 == 0) goto L_0x009b
            r6.mo25324B(r0, r5)
        L_0x009b:
            boolean r0 = r7 instanceof p416l.p417a.C7733k
            if (r0 != 0) goto L_0x00a1
            r0 = r4
            goto L_0x00a2
        L_0x00a1:
            r0 = r7
        L_0x00a2:
            l.a.k r0 = (p416l.p417a.C7733k) r0
            if (r0 == 0) goto L_0x00a8
            r4 = r0
            goto L_0x00b2
        L_0x00a8:
            l.a.h1 r7 = r7.mo25320e()
            if (r7 == 0) goto L_0x00b2
            l.a.k r4 = r6.mo25323A(r7)
        L_0x00b2:
            if (r4 == 0) goto L_0x00bd
            boolean r7 = r6.mo25331K(r3, r4, r8)
            if (r7 == 0) goto L_0x00bd
            l.a.u1.p r7 = p416l.p417a.C7714d1.f15258b
            goto L_0x00c7
        L_0x00bd:
            java.lang.Object r7 = r6.mo25343m(r3, r8)
            goto L_0x00c7
        L_0x00c2:
            r7 = move-exception
            monitor-exit(r3)
            throw r7
        L_0x00c5:
            l.a.u1.p r7 = p416l.p417a.C7714d1.f15259c
        L_0x00c7:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p416l.p417a.C7707c1.mo25330J(java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* renamed from: K */
    public final boolean mo25331K(C7710c cVar, C7733k kVar, Object obj) {
        while (C5266a.m9998n2(kVar.f15278k, false, false, new C7709b(this, cVar, kVar, obj), 1, (Object) null) == C7729i1.f15276g) {
            kVar = mo25323A(kVar);
            if (kVar == null) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: N */
    public CancellationException mo25332N() {
        Throwable th;
        Object s = mo25346s();
        CancellationException cancellationException = null;
        if (s instanceof C7710c) {
            th = ((C7710c) s).mo25358c();
        } else if (s instanceof C7754q) {
            th = ((C7754q) s).f15306a;
        } else if (!(s instanceof C7765t0)) {
            th = null;
        } else {
            throw new IllegalStateException(("Cannot be cancelling child in this state: " + s).toString());
        }
        if (th instanceof CancellationException) {
            cancellationException = th;
        }
        CancellationException cancellationException2 = cancellationException;
        if (cancellationException2 != null) {
            return cancellationException2;
        }
        StringBuilder u = C0843a.m460u("Parent job is ");
        u.append(mo25328H(s));
        return new C7822y0(u.toString(), th, this);
    }

    /* JADX WARNING: type inference failed for: r4v8, types: [l.a.s0] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: O */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p416l.p417a.C7728i0 mo25333O(boolean r8, boolean r9, p298d.p344x.p345b.C6862l<? super java.lang.Throwable, p298d.C6777r> r10) {
        /*
            r7 = this;
            r0 = 0
            if (r8 == 0) goto L_0x0015
            boolean r1 = r10 instanceof p416l.p417a.C7824z0
            if (r1 != 0) goto L_0x0009
            r1 = r0
            goto L_0x000a
        L_0x0009:
            r1 = r10
        L_0x000a:
            l.a.z0 r1 = (p416l.p417a.C7824z0) r1
            if (r1 == 0) goto L_0x000f
            goto L_0x0026
        L_0x000f:
            l.a.v0 r1 = new l.a.v0
            r1.<init>(r10)
            goto L_0x0026
        L_0x0015:
            boolean r1 = r10 instanceof p416l.p417a.C7704b1
            if (r1 != 0) goto L_0x001b
            r1 = r0
            goto L_0x001c
        L_0x001b:
            r1 = r10
        L_0x001c:
            l.a.b1 r1 = (p416l.p417a.C7704b1) r1
            if (r1 == 0) goto L_0x0021
            goto L_0x0026
        L_0x0021:
            l.a.w0 r1 = new l.a.w0
            r1.<init>(r10)
        L_0x0026:
            r1.f15243j = r7
        L_0x0028:
            java.lang.Object r2 = r7.mo25346s()
            boolean r3 = r2 instanceof p416l.p417a.C7734k0
            if (r3 == 0) goto L_0x0056
            r3 = r2
            l.a.k0 r3 = (p416l.p417a.C7734k0) r3
            boolean r4 = r3.f15279g
            if (r4 == 0) goto L_0x0040
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = f15245g
            boolean r2 = r3.compareAndSet(r7, r2, r1)
            if (r2 == 0) goto L_0x0028
            return r1
        L_0x0040:
            l.a.h1 r2 = new l.a.h1
            r2.<init>()
            boolean r4 = r3.f15279g
            if (r4 == 0) goto L_0x004a
            goto L_0x0050
        L_0x004a:
            l.a.s0 r4 = new l.a.s0
            r4.<init>(r2)
            r2 = r4
        L_0x0050:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = f15245g
            r4.compareAndSet(r7, r3, r2)
            goto L_0x0028
        L_0x0056:
            boolean r3 = r2 instanceof p416l.p417a.C7765t0
            if (r3 == 0) goto L_0x00af
            r3 = r2
            l.a.t0 r3 = (p416l.p417a.C7765t0) r3
            l.a.h1 r3 = r3.mo25320e()
            if (r3 != 0) goto L_0x006e
            java.lang.String r3 = "null cannot be cast to non-null type kotlinx.coroutines.JobNode"
            java.util.Objects.requireNonNull(r2, r3)
            l.a.b1 r2 = (p416l.p417a.C7704b1) r2
            r7.mo25326F(r2)
            goto L_0x0028
        L_0x006e:
            l.a.i1 r4 = p416l.p417a.C7729i1.f15276g
            if (r8 == 0) goto L_0x009f
            boolean r5 = r2 instanceof p416l.p417a.C7707c1.C7710c
            if (r5 == 0) goto L_0x009f
            monitor-enter(r2)
            r5 = r2
            l.a.c1$c r5 = (p416l.p417a.C7707c1.C7710c) r5     // Catch:{ all -> 0x009c }
            java.lang.Throwable r5 = r5.mo25358c()     // Catch:{ all -> 0x009c }
            if (r5 == 0) goto L_0x008d
            boolean r6 = r10 instanceof p416l.p417a.C7733k     // Catch:{ all -> 0x009c }
            if (r6 == 0) goto L_0x009a
            r6 = r2
            l.a.c1$c r6 = (p416l.p417a.C7707c1.C7710c) r6     // Catch:{ all -> 0x009c }
            boolean r6 = r6.mo25360g()     // Catch:{ all -> 0x009c }
            if (r6 != 0) goto L_0x009a
        L_0x008d:
            boolean r4 = r7.mo25336f(r2, r3, r1)     // Catch:{ all -> 0x009c }
            if (r4 != 0) goto L_0x0095
            monitor-exit(r2)
            goto L_0x0028
        L_0x0095:
            if (r5 != 0) goto L_0x0099
            monitor-exit(r2)
            return r1
        L_0x0099:
            r4 = r1
        L_0x009a:
            monitor-exit(r2)
            goto L_0x00a0
        L_0x009c:
            r8 = move-exception
            monitor-exit(r2)
            throw r8
        L_0x009f:
            r5 = r0
        L_0x00a0:
            if (r5 == 0) goto L_0x00a8
            if (r9 == 0) goto L_0x00a7
            r10.invoke(r5)
        L_0x00a7:
            return r4
        L_0x00a8:
            boolean r2 = r7.mo25336f(r2, r3, r1)
            if (r2 == 0) goto L_0x0028
            return r1
        L_0x00af:
            if (r9 == 0) goto L_0x00bf
            boolean r8 = r2 instanceof p416l.p417a.C7754q
            if (r8 != 0) goto L_0x00b6
            r2 = r0
        L_0x00b6:
            l.a.q r2 = (p416l.p417a.C7754q) r2
            if (r2 == 0) goto L_0x00bc
            java.lang.Throwable r0 = r2.f15306a
        L_0x00bc:
            r10.invoke(r0)
        L_0x00bf:
            l.a.i1 r8 = p416l.p417a.C7729i1.f15276g
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p416l.p417a.C7707c1.mo25333O(boolean, boolean, d.x.b.l):l.a.i0");
    }

    /* renamed from: S */
    public final CancellationException mo25334S() {
        Object s = mo25346s();
        if (s instanceof C7710c) {
            Throwable c = ((C7710c) s).mo25358c();
            if (c != null) {
                return mo25329I(c, getClass().getSimpleName() + " is cancelling");
            }
            throw new IllegalStateException(("Job is still new or active: " + this).toString());
        } else if (s instanceof C7765t0) {
            throw new IllegalStateException(("Job is still new or active: " + this).toString());
        } else if (s instanceof C7754q) {
            return mo25329I(((C7754q) s).f15306a, (String) null);
        } else {
            return new C7822y0(getClass().getSimpleName() + " has completed normally", (Throwable) null, this);
        }
    }

    /* renamed from: Z */
    public final void mo25335Z(C7735k1 k1Var) {
        mo25338h(k1Var);
    }

    /* renamed from: d */
    public boolean mo25307d() {
        Object s = mo25346s();
        return (s instanceof C7765t0) && ((C7765t0) s).mo25318d();
    }

    /* renamed from: f */
    public final boolean mo25336f(Object obj, C7726h1 h1Var, C7704b1 b1Var) {
        boolean z;
        C7711d dVar = new C7711d(b1Var, b1Var, this, obj);
        do {
            C7779i i = h1Var.mo25448i();
            C7779i.f15336h.lazySet(b1Var, i);
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C7779i.f15335g;
            atomicReferenceFieldUpdater.lazySet(b1Var, h1Var);
            dVar.f15338b = h1Var;
            z = !atomicReferenceFieldUpdater.compareAndSet(i, h1Var, dVar) ? false : dVar.mo25435a(i) == null ? true : true;
            if (z) {
                return true;
            }
        } while (!z);
        return false;
    }

    public <R> R fold(R r, C6866p<? super R, ? super C6827f.C6828a, ? extends R> pVar) {
        return C6827f.C6828a.C6829a.m12392a(this, r, pVar);
    }

    /* renamed from: g */
    public void mo25337g(Object obj) {
    }

    public <E extends C6827f.C6828a> E get(C6827f.C6830b<E> bVar) {
        return C6827f.C6828a.C6829a.m12393b(this, bVar);
    }

    public final C6827f.C6830b<?> getKey() {
        return C7819x0.f15427f;
    }

    /* JADX WARNING: Removed duplicated region for block: B:84:0x00b9 A[EDGE_INSN: B:84:0x00b9->B:58:0x00b9 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0040 A[SYNTHETIC] */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo25338h(java.lang.Object r10) {
        /*
            r9 = this;
            l.a.u1.p r0 = p416l.p417a.C7714d1.f15257a
            boolean r1 = r9.mo25312o()
            r2 = 2
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L_0x003a
        L_0x000b:
            java.lang.Object r0 = r9.mo25346s()
            boolean r1 = r0 instanceof p416l.p417a.C7765t0
            if (r1 == 0) goto L_0x0033
            boolean r1 = r0 instanceof p416l.p417a.C7707c1.C7710c
            if (r1 == 0) goto L_0x0021
            r1 = r0
            l.a.c1$c r1 = (p416l.p417a.C7707c1.C7710c) r1
            boolean r1 = r1.mo25360g()
            if (r1 == 0) goto L_0x0021
            goto L_0x0033
        L_0x0021:
            l.a.q r1 = new l.a.q
            java.lang.Throwable r5 = r9.mo25341l(r10)
            r1.<init>(r5, r3, r2)
            java.lang.Object r0 = r9.mo25330J(r0, r1)
            l.a.u1.p r1 = p416l.p417a.C7714d1.f15259c
            if (r0 == r1) goto L_0x000b
            goto L_0x0035
        L_0x0033:
            l.a.u1.p r0 = p416l.p417a.C7714d1.f15257a
        L_0x0035:
            l.a.u1.p r1 = p416l.p417a.C7714d1.f15258b
            if (r0 != r1) goto L_0x003a
            return r4
        L_0x003a:
            l.a.u1.p r1 = p416l.p417a.C7714d1.f15257a
            if (r0 != r1) goto L_0x00ef
            r0 = 0
            r1 = r0
        L_0x0040:
            java.lang.Object r5 = r9.mo25346s()
            boolean r6 = r5 instanceof p416l.p417a.C7707c1.C7710c
            if (r6 == 0) goto L_0x0089
            monitor-enter(r5)
            r2 = r5
            l.a.c1$c r2 = (p416l.p417a.C7707c1.C7710c) r2     // Catch:{ all -> 0x0086 }
            boolean r2 = r2.mo25361h()     // Catch:{ all -> 0x0086 }
            if (r2 == 0) goto L_0x0057
            l.a.u1.p r10 = p416l.p417a.C7714d1.f15260d     // Catch:{ all -> 0x0086 }
            monitor-exit(r5)
            goto L_0x00ee
        L_0x0057:
            r2 = r5
            l.a.c1$c r2 = (p416l.p417a.C7707c1.C7710c) r2     // Catch:{ all -> 0x0086 }
            boolean r2 = r2.mo25359f()     // Catch:{ all -> 0x0086 }
            if (r10 != 0) goto L_0x0062
            if (r2 != 0) goto L_0x006f
        L_0x0062:
            if (r1 == 0) goto L_0x0065
            goto L_0x0069
        L_0x0065:
            java.lang.Throwable r1 = r9.mo25341l(r10)     // Catch:{ all -> 0x0086 }
        L_0x0069:
            r10 = r5
            l.a.c1$c r10 = (p416l.p417a.C7707c1.C7710c) r10     // Catch:{ all -> 0x0086 }
            r10.mo25356a(r1)     // Catch:{ all -> 0x0086 }
        L_0x006f:
            r10 = r5
            l.a.c1$c r10 = (p416l.p417a.C7707c1.C7710c) r10     // Catch:{ all -> 0x0086 }
            java.lang.Throwable r10 = r10.mo25358c()     // Catch:{ all -> 0x0086 }
            r1 = r2 ^ 1
            if (r1 == 0) goto L_0x007b
            r0 = r10
        L_0x007b:
            monitor-exit(r5)
            if (r0 == 0) goto L_0x00b9
            l.a.c1$c r5 = (p416l.p417a.C7707c1.C7710c) r5
            l.a.h1 r10 = r5.f15251g
            r9.mo25324B(r10, r0)
            goto L_0x00b9
        L_0x0086:
            r10 = move-exception
            monitor-exit(r5)
            throw r10
        L_0x0089:
            boolean r6 = r5 instanceof p416l.p417a.C7765t0
            if (r6 == 0) goto L_0x00ec
            if (r1 == 0) goto L_0x0090
            goto L_0x0094
        L_0x0090:
            java.lang.Throwable r1 = r9.mo25341l(r10)
        L_0x0094:
            r6 = r5
            l.a.t0 r6 = (p416l.p417a.C7765t0) r6
            boolean r7 = r6.mo25318d()
            if (r7 == 0) goto L_0x00bc
            l.a.h1 r5 = r9.mo25344p(r6)
            if (r5 == 0) goto L_0x00b6
            l.a.c1$c r7 = new l.a.c1$c
            r7.<init>(r5, r3, r1)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r8 = f15245g
            boolean r6 = r8.compareAndSet(r9, r6, r7)
            if (r6 != 0) goto L_0x00b1
            goto L_0x00b6
        L_0x00b1:
            r9.mo25324B(r5, r1)
            r5 = r4
            goto L_0x00b7
        L_0x00b6:
            r5 = r3
        L_0x00b7:
            if (r5 == 0) goto L_0x0040
        L_0x00b9:
            l.a.u1.p r10 = p416l.p417a.C7714d1.f15257a
            goto L_0x00ee
        L_0x00bc:
            l.a.q r6 = new l.a.q
            r6.<init>(r1, r3, r2)
            java.lang.Object r6 = r9.mo25330J(r5, r6)
            l.a.u1.p r7 = p416l.p417a.C7714d1.f15257a
            if (r6 == r7) goto L_0x00d1
            l.a.u1.p r5 = p416l.p417a.C7714d1.f15259c
            if (r6 != r5) goto L_0x00cf
            goto L_0x0040
        L_0x00cf:
            r0 = r6
            goto L_0x00ef
        L_0x00d1:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r0 = "Cannot happen in "
            r10.append(r0)
            r10.append(r5)
            java.lang.String r10 = r10.toString()
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r10 = r10.toString()
            r0.<init>(r10)
            throw r0
        L_0x00ec:
            l.a.u1.p r10 = p416l.p417a.C7714d1.f15260d
        L_0x00ee:
            r0 = r10
        L_0x00ef:
            l.a.u1.p r10 = p416l.p417a.C7714d1.f15257a
            if (r0 != r10) goto L_0x00f5
        L_0x00f3:
            r3 = r4
            goto L_0x0103
        L_0x00f5:
            l.a.u1.p r10 = p416l.p417a.C7714d1.f15258b
            if (r0 != r10) goto L_0x00fa
            goto L_0x00f3
        L_0x00fa:
            l.a.u1.p r10 = p416l.p417a.C7714d1.f15260d
            if (r0 != r10) goto L_0x00ff
            goto L_0x0103
        L_0x00ff:
            r9.mo25337g(r0)
            goto L_0x00f3
        L_0x0103:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p416l.p417a.C7707c1.mo25338h(java.lang.Object):boolean");
    }

    /* renamed from: i */
    public final boolean mo25339i(Throwable th) {
        if (mo25351w()) {
            return true;
        }
        boolean z = th instanceof CancellationException;
        C7730j jVar = (C7730j) this._parentHandle;
        if (jVar == null || jVar == C7729i1.f15276g) {
            return z;
        }
        if (jVar.mo25390k(th) || z) {
            return true;
        }
        return false;
    }

    /* renamed from: j */
    public String mo25308j() {
        return "Job was cancelled";
    }

    /* renamed from: k */
    public final void mo25340k(C7765t0 t0Var, Object obj) {
        C7730j jVar = (C7730j) this._parentHandle;
        if (jVar != null) {
            jVar.dispose();
            this._parentHandle = C7729i1.f15276g;
        }
        C7764t tVar = null;
        if (!(obj instanceof C7754q)) {
            obj = null;
        }
        C7754q qVar = (C7754q) obj;
        Throwable th = qVar != null ? qVar.f15306a : null;
        if (t0Var instanceof C7704b1) {
            try {
                ((C7704b1) t0Var).mo25355m(th);
            } catch (Throwable th2) {
                mo25309u(new C7764t("Exception in completion handler " + t0Var + " for " + this, th2));
            }
        } else {
            C7726h1 e = t0Var.mo25320e();
            if (e != null) {
                Object g = e.mo25446g();
                Objects.requireNonNull(g, "null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */");
                for (C7779i iVar = (C7779i) g; !C6888i.m12434a(iVar, e); iVar = iVar.mo25447h()) {
                    if (iVar instanceof C7704b1) {
                        C7704b1 b1Var = (C7704b1) iVar;
                        try {
                            b1Var.mo25355m(th);
                        } catch (Throwable th3) {
                            if (tVar != null) {
                                C5266a.m10007p(tVar, th3);
                            } else {
                                tVar = new C7764t("Exception in completion handler " + b1Var + " for " + this, th3);
                            }
                        }
                    }
                }
                if (tVar != null) {
                    mo25309u(tVar);
                }
            }
        }
    }

    /* renamed from: l */
    public final Throwable mo25341l(Object obj) {
        if (!(obj != null ? obj instanceof Throwable : true)) {
            Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.ParentJob");
            return ((C7735k1) obj).mo25332N();
        } else if (obj != null) {
            return (Throwable) obj;
        } else {
            return new C7822y0(mo25308j(), (Throwable) null, this);
        }
    }

    /* renamed from: l0 */
    public final C7730j mo25342l0(C7736l lVar) {
        C7728i0 n2 = C5266a.m9998n2(this, true, false, new C7733k(lVar), 2, (Object) null);
        Objects.requireNonNull(n2, "null cannot be cast to non-null type kotlinx.coroutines.ChildHandle");
        return (C7730j) n2;
    }

    /* renamed from: m */
    public final Object mo25343m(C7710c cVar, Object obj) {
        boolean f;
        T t = null;
        C7754q qVar = (C7754q) (!(obj instanceof C7754q) ? null : obj);
        T t2 = qVar != null ? qVar.f15306a : null;
        synchronized (cVar) {
            f = cVar.mo25359f();
            List<Throwable> i = cVar.mo25362i(t2);
            if (!i.isEmpty()) {
                Iterator<T> it = i.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    T next = it.next();
                    if (!(((Throwable) next) instanceof CancellationException)) {
                        t = next;
                        break;
                    }
                }
                t = (Throwable) t;
                if (t == null) {
                    t = (Throwable) i.get(0);
                }
            } else if (cVar.mo25359f()) {
                t = new C7822y0(mo25308j(), (Throwable) null, this);
            }
            if (t != null) {
                if (i.size() > 1) {
                    Set newSetFromMap = Collections.newSetFromMap(new IdentityHashMap(i.size()));
                    for (T next2 : i) {
                        if (next2 != t && next2 != t && !(next2 instanceof CancellationException) && newSetFromMap.add(next2)) {
                            C5266a.m10007p(t, next2);
                        }
                    }
                }
            }
        }
        if (!(t == null || t == t2)) {
            obj = new C7754q(t, false, 2);
        }
        if (t != null) {
            if (mo25339i(t) || mo25348t(t)) {
                Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally");
                C7754q.f15305b.compareAndSet((C7754q) obj, 0, 1);
            }
        }
        if (!f) {
            mo25325C();
        }
        mo25298D(obj);
        f15245g.compareAndSet(this, cVar, obj instanceof C7765t0 ? new C7770u0((C7765t0) obj) : obj);
        mo25340k(cVar, obj);
        return obj;
    }

    public C6827f minusKey(C6827f.C6830b<?> bVar) {
        return C6827f.C6828a.C6829a.m12394c(this, bVar);
    }

    /* renamed from: n */
    public boolean mo25311n() {
        return true;
    }

    /* renamed from: o */
    public boolean mo25312o() {
        return false;
    }

    /* renamed from: p */
    public final C7726h1 mo25344p(C7765t0 t0Var) {
        C7726h1 e = t0Var.mo25320e();
        if (e != null) {
            return e;
        }
        if (t0Var instanceof C7734k0) {
            return new C7726h1();
        }
        if (t0Var instanceof C7704b1) {
            mo25326F((C7704b1) t0Var);
            return null;
        }
        throw new IllegalStateException(("State should have list: " + t0Var).toString());
    }

    public C6827f plus(C6827f fVar) {
        return C6827f.C6828a.C6829a.m12395d(this, fVar);
    }

    /* renamed from: r */
    public final C7730j mo25345r() {
        return (C7730j) this._parentHandle;
    }

    /* renamed from: s */
    public final Object mo25346s() {
        while (true) {
            Object obj = this._state;
            if (!(obj instanceof C7786m)) {
                return obj;
            }
            ((C7786m) obj).mo25435a(this);
        }
    }

    public final boolean start() {
        int G;
        do {
            G = mo25327G(mo25346s());
            if (G == 0) {
                return false;
            }
        } while (G != 1);
        return true;
    }

    /* renamed from: t */
    public boolean mo25348t(Throwable th) {
        return false;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(mo25310y() + '{' + mo25328H(mo25346s()) + '}');
        sb.append('@');
        sb.append(C5266a.m10027s1(this));
        return sb.toString();
    }

    /* renamed from: u */
    public void mo25309u(Throwable th) {
        throw th;
    }

    /* renamed from: v */
    public final void mo25350v(C7819x0 x0Var) {
        if (x0Var == null) {
            this._parentHandle = C7729i1.f15276g;
            return;
        }
        x0Var.start();
        C7730j l0 = x0Var.mo25342l0(this);
        this._parentHandle = l0;
        if (!(mo25346s() instanceof C7765t0)) {
            l0.dispose();
            this._parentHandle = C7729i1.f15276g;
        }
    }

    /* renamed from: w */
    public boolean mo25351w() {
        return false;
    }

    /* renamed from: x */
    public final Object mo25352x(Object obj) {
        Object J;
        do {
            J = mo25330J(mo25346s(), obj);
            if (J == C7714d1.f15257a) {
                String str = "Job " + this + " is already complete or completing, " + "but is being completed with " + obj;
                Throwable th = null;
                if (!(obj instanceof C7754q)) {
                    obj = null;
                }
                C7754q qVar = (C7754q) obj;
                if (qVar != null) {
                    th = qVar.f15306a;
                }
                throw new IllegalStateException(str, th);
            }
        } while (J == C7714d1.f15259c);
        return J;
    }

    /* renamed from: y */
    public String mo25310y() {
        return getClass().getSimpleName();
    }
}
