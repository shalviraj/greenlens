package p435n;

import java.util.concurrent.atomic.AtomicReference;
import p298d.p344x.p346c.C6888i;

/* renamed from: n.w */
public final class C8062w {

    /* renamed from: a */
    public static final C8061v f16190a = new C8061v(new byte[0], 0, 0, false, false);

    /* renamed from: b */
    public static final int f16191b;

    /* renamed from: c */
    public static final AtomicReference<C8061v>[] f16192c;

    /* renamed from: d */
    public static final C8062w f16193d = new C8062w();

    static {
        int highestOneBit = Integer.highestOneBit((Runtime.getRuntime().availableProcessors() * 2) - 1);
        f16191b = highestOneBit;
        AtomicReference<C8061v>[] atomicReferenceArr = new AtomicReference[highestOneBit];
        for (int i = 0; i < highestOneBit; i++) {
            atomicReferenceArr[i] = new AtomicReference<>();
        }
        f16192c = atomicReferenceArr;
    }

    /* renamed from: a */
    public static final void m14927a(C8061v vVar) {
        C6888i.m12438e(vVar, "segment");
        if (!(vVar.f16188f == null && vVar.f16189g == null)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        } else if (!vVar.f16186d) {
            Thread currentThread = Thread.currentThread();
            C6888i.m12437d(currentThread, "Thread.currentThread()");
            AtomicReference<C8061v> atomicReference = f16192c[(int) (currentThread.getId() & (((long) f16191b) - 1))];
            C8061v vVar2 = atomicReference.get();
            if (vVar2 != f16190a) {
                int i = vVar2 != null ? vVar2.f16185c : 0;
                if (i < 65536) {
                    vVar.f16188f = vVar2;
                    vVar.f16184b = 0;
                    vVar.f16185c = i + 8192;
                    if (!atomicReference.compareAndSet(vVar2, vVar)) {
                        vVar.f16188f = null;
                    }
                }
            }
        }
    }

    /* renamed from: b */
    public static final C8061v m14928b() {
        Thread currentThread = Thread.currentThread();
        C6888i.m12437d(currentThread, "Thread.currentThread()");
        AtomicReference<C8061v> atomicReference = f16192c[(int) (currentThread.getId() & (((long) f16191b) - 1))];
        C8061v vVar = f16190a;
        C8061v andSet = atomicReference.getAndSet(vVar);
        if (andSet == vVar) {
            return new C8061v();
        }
        if (andSet == null) {
            atomicReference.set((Object) null);
            return new C8061v();
        }
        atomicReference.set(andSet.f16188f);
        andSet.f16188f = null;
        andSet.f16185c = 0;
        return andSet;
    }
}
