package p005b.p096l.p180d.p216x;

import java.util.Objects;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import p005b.p096l.p180d.p216x.p220o.C4319a;

/* renamed from: b.l.d.x.k */
public final class C4297k {

    /* renamed from: b */
    public static final long f7967b = TimeUnit.HOURS.toSeconds(1);

    /* renamed from: c */
    public static final Pattern f7968c = Pattern.compile("\\AA[\\w-]{38}\\z");

    /* renamed from: d */
    public static C4297k f7969d;

    /* renamed from: a */
    public final C4319a f7970a;

    public C4297k(C4319a aVar) {
        this.f7970a = aVar;
    }

    /* renamed from: c */
    public static C4297k m7868c() {
        if (C4319a.f8026a == null) {
            C4319a.f8026a = new C4319a();
        }
        C4319a aVar = C4319a.f8026a;
        if (f7969d == null) {
            f7969d = new C4297k(aVar);
        }
        return f7969d;
    }

    /* renamed from: a */
    public long mo15905a() {
        Objects.requireNonNull(this.f7970a);
        return System.currentTimeMillis();
    }

    /* renamed from: b */
    public long mo15906b() {
        return TimeUnit.MILLISECONDS.toSeconds(mo15905a());
    }
}
