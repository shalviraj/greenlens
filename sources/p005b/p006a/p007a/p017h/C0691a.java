package p005b.p006a.p007a.p017h;

import android.net.Uri;
import java.util.Arrays;
import p005b.p035e.p036a.p037a.C0843a;
import p298d.p344x.p346c.C6888i;

/* renamed from: b.a.a.h.a */
public final class C0691a {

    /* renamed from: a */
    public final Uri[] f397a;

    public C0691a(Uri[] uriArr) {
        this.f397a = uriArr;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof C0691a) && C6888i.m12434a(this.f397a, ((C0691a) obj).f397a);
        }
        return true;
    }

    public int hashCode() {
        Uri[] uriArr = this.f397a;
        if (uriArr != null) {
            return Arrays.hashCode(uriArr);
        }
        return 0;
    }

    public String toString() {
        return C0843a.m455p(C0843a.m460u("AddPictureFromAlbumEvent(results="), Arrays.toString(this.f397a), ")");
    }
}
