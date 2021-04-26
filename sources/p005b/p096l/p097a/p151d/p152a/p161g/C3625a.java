package p005b.p096l.p097a.p151d.p152a.p161g;

import android.app.PendingIntent;
import com.google.android.play.core.review.ReviewInfo;
import java.util.Objects;
import p005b.p035e.p036a.p037a.C0843a;

/* renamed from: b.l.a.d.a.g.a */
public final class C3625a extends ReviewInfo {

    /* renamed from: g */
    public final PendingIntent f6689g;

    public C3625a(PendingIntent pendingIntent) {
        Objects.requireNonNull(pendingIntent, "Null pendingIntent");
        this.f6689g = pendingIntent;
    }

    /* renamed from: a */
    public final PendingIntent mo14917a() {
        return this.f6689g;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ReviewInfo) {
            return this.f6689g.equals(((ReviewInfo) obj).mo14917a());
        }
        return false;
    }

    public final int hashCode() {
        return this.f6689g.hashCode() ^ 1000003;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f6689g);
        return C0843a.m456q(new StringBuilder(valueOf.length() + 26), "ReviewInfo{pendingIntent=", valueOf, "}");
    }
}
