package p005b.p096l.p097a.p151d.p152a.p153a;

import android.app.PendingIntent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* renamed from: b.l.a.d.a.a.a */
public abstract class C3448a {
    /* renamed from: a */
    public abstract int mo14711a();

    /* renamed from: b */
    public abstract long mo14712b();

    /* renamed from: c */
    public abstract long mo14713c();

    /* renamed from: d */
    public abstract long mo14714d();

    @Nullable
    /* renamed from: e */
    public abstract Integer mo14715e();

    @Nullable
    /* renamed from: f */
    public abstract PendingIntent mo14716f();

    @Nullable
    /* renamed from: g */
    public abstract PendingIntent mo14717g();

    @Nullable
    /* renamed from: h */
    public abstract PendingIntent mo14718h();

    @Nullable
    /* renamed from: i */
    public abstract PendingIntent mo14719i();

    @Nullable
    /* renamed from: j */
    public final PendingIntent mo14720j(C3450c cVar) {
        if (cVar.mo14733b() != 0) {
            if (cVar.mo14733b() == 1) {
                if (mo14716f() != null) {
                    return mo14716f();
                }
                if (mo14721k(cVar)) {
                    return mo14718h();
                }
            }
            return null;
        } else if (mo14717g() != null) {
            return mo14717g();
        } else {
            if (mo14721k(cVar)) {
                return mo14719i();
            }
            return null;
        }
    }

    /* renamed from: k */
    public final boolean mo14721k(C3450c cVar) {
        return cVar.mo14732a() && mo14712b() <= mo14714d();
    }

    /* renamed from: l */
    public abstract int mo14722l();

    @NonNull
    /* renamed from: m */
    public abstract String mo14723m();

    /* renamed from: n */
    public abstract long mo14724n();

    /* renamed from: o */
    public abstract int mo14725o();

    /* renamed from: p */
    public abstract int mo14726p();
}
