package p005b.p096l.p097a.p113c.p145h.p147b;

import androidx.annotation.WorkerThread;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@WorkerThread
/* renamed from: b.l.a.c.h.b.r3 */
public final class C3302r3 implements Runnable {

    /* renamed from: g */
    public final C3291q3 f5919g;

    /* renamed from: h */
    public final int f5920h;

    /* renamed from: i */
    public final Throwable f5921i;

    /* renamed from: j */
    public final byte[] f5922j;

    /* renamed from: k */
    public final String f5923k;

    /* renamed from: l */
    public final Map<String, List<String>> f5924l;

    public C3302r3(String str, C3291q3 q3Var, int i, Throwable th, byte[] bArr, Map map) {
        Objects.requireNonNull(q3Var, "null reference");
        this.f5919g = q3Var;
        this.f5920h = i;
        this.f5921i = th;
        this.f5922j = bArr;
        this.f5923k = str;
        this.f5924l = map;
    }

    public final void run() {
        this.f5919g.mo14177a(this.f5923k, this.f5920h, this.f5921i, this.f5922j, this.f5924l);
    }
}
