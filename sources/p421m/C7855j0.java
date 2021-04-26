package p421m;

import java.io.Closeable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p421m.p422m0.C7867c;
import p435n.C8043g;

/* renamed from: m.j0 */
public abstract class C7855j0 implements Closeable {

    /* renamed from: g */
    public static final C7856a f15583g = new C7856a((DefaultConstructorMarker) null);

    /* renamed from: m.j0$a */
    public static final class C7856a {
        public C7856a(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public void close() {
        C7867c.m14283d(mo25567q());
    }

    /* renamed from: d */
    public abstract long mo25565d();

    /* renamed from: e */
    public abstract C7829b0 mo25566e();

    /* renamed from: q */
    public abstract C8043g mo25567q();

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0024, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0025, code lost:
        p005b.p291q.p292a.C5266a.m9877S(r0, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0028, code lost:
        throw r2;
     */
    /* renamed from: z */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String mo25572z() {
        /*
            r3 = this;
            n.g r0 = r3.mo25567q()
            m.b0 r1 = r3.mo25566e()     // Catch:{ all -> 0x0022 }
            if (r1 == 0) goto L_0x0013
            java.nio.charset.Charset r2 = p298d.p415c0.C7685a.f15210a     // Catch:{ all -> 0x0022 }
            java.nio.charset.Charset r1 = r1.mo25521a(r2)     // Catch:{ all -> 0x0022 }
            if (r1 == 0) goto L_0x0013
            goto L_0x0015
        L_0x0013:
            java.nio.charset.Charset r1 = p298d.p415c0.C7685a.f15210a     // Catch:{ all -> 0x0022 }
        L_0x0015:
            java.nio.charset.Charset r1 = p421m.p422m0.C7867c.m14297r(r0, r1)     // Catch:{ all -> 0x0022 }
            java.lang.String r1 = r0.mo25913j0(r1)     // Catch:{ all -> 0x0022 }
            r2 = 0
            p005b.p291q.p292a.C5266a.m9877S(r0, r2)
            return r1
        L_0x0022:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0024 }
        L_0x0024:
            r2 = move-exception
            p005b.p291q.p292a.C5266a.m9877S(r0, r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p421m.C7855j0.mo25572z():java.lang.String");
    }
}
