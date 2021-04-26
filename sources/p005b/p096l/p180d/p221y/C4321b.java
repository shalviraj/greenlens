package p005b.p096l.p180d.p221y;

import androidx.annotation.Nullable;
import com.segment.analytics.AnalyticsContext;
import java.util.Arrays;
import p005b.p006a.p007a.p024o.C0823f;
import p005b.p096l.p097a.p113c.p119b.p122m.C1941q0;
import p005b.p096l.p097a.p113c.p119b.p122m.C1942r;

/* renamed from: b.l.d.y.b */
public class C4321b {

    /* renamed from: a */
    public String f8031a;

    public C4321b(@Nullable String str) {
        this.f8031a = str;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C4321b)) {
            return false;
        }
        return C0823f.m330A(this.f8031a, ((C4321b) obj).f8031a);
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f8031a});
    }

    public String toString() {
        C1942r rVar = new C1942r(this, (C1941q0) null);
        rVar.mo12270a(AnalyticsContext.Device.DEVICE_TOKEN_KEY, this.f8031a);
        return rVar.toString();
    }
}
