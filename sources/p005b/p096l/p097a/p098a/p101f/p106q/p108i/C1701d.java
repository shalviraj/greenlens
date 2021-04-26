package p005b.p096l.p097a.p098a.p101f.p106q.p108i;

import com.google.auto.value.AutoValue;
import p005b.p035e.p036a.p037a.C0843a;
import p005b.p096l.p097a.p098a.p101f.p106q.p108i.C1696a;

@AutoValue
/* renamed from: b.l.a.a.f.q.i.d */
public abstract class C1701d {

    /* renamed from: a */
    public static final C1701d f3017a;

    static {
        Long l = 10485760L;
        Integer num = 200;
        Integer num2 = 10000;
        Long l2 = 604800000L;
        Integer num3 = 81920;
        String str = l == null ? " maxStorageSizeInBytes" : "";
        if (num == null) {
            str = C0843a.m451l(str, " loadBatchSize");
        }
        if (num2 == null) {
            str = C0843a.m451l(str, " criticalSectionEnterTimeoutMs");
        }
        if (l2 == null) {
            str = C0843a.m451l(str, " eventCleanUpAge");
        }
        if (num3 == null) {
            str = C0843a.m451l(str, " maxBlobByteSizePerRow");
        }
        if (str.isEmpty()) {
            f3017a = new C1696a(l.longValue(), num.intValue(), num2.intValue(), l2.longValue(), num3.intValue(), (C1696a.C1697a) null);
            return;
        }
        throw new IllegalStateException(C0843a.m451l("Missing required properties:", str));
    }

    /* renamed from: a */
    public abstract int mo11883a();

    /* renamed from: b */
    public abstract long mo11884b();

    /* renamed from: c */
    public abstract int mo11885c();

    /* renamed from: d */
    public abstract int mo11886d();

    /* renamed from: e */
    public abstract long mo11887e();
}
