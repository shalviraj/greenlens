package p005b.p006a.p007a.p017h;

import androidx.core.app.NotificationCompat;
import p005b.p035e.p036a.p037a.C0843a;
import p298d.p344x.p346c.C6888i;

/* renamed from: b.a.a.h.h */
public final class C0705h {

    /* renamed from: a */
    public final String f411a;

    public C0705h(String str) {
        C6888i.m12438e(str, NotificationCompat.CATEGORY_EMAIL);
        this.f411a = str;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof C0705h) && C6888i.m12434a(this.f411a, ((C0705h) obj).f411a);
        }
        return true;
    }

    public int hashCode() {
        String str = this.f411a;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public String toString() {
        return C0843a.m455p(C0843a.m460u("EmailEvent(email="), this.f411a, ")");
    }
}
