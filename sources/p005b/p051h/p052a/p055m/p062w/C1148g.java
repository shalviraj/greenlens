package p005b.p051h.p052a.p055m.p062w;

import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.net.URL;
import java.security.MessageDigest;
import java.util.Objects;
import p005b.p051h.p052a.p055m.C0974m;

/* renamed from: b.h.a.m.w.g */
public class C1148g implements C0974m {

    /* renamed from: b */
    public final C1149h f1385b;
    @Nullable

    /* renamed from: c */
    public final URL f1386c;
    @Nullable

    /* renamed from: d */
    public final String f1387d;
    @Nullable

    /* renamed from: e */
    public String f1388e;
    @Nullable

    /* renamed from: f */
    public URL f1389f;
    @Nullable

    /* renamed from: g */
    public volatile byte[] f1390g;

    /* renamed from: h */
    public int f1391h;

    public C1148g(String str) {
        C1149h hVar = C1149h.f1392a;
        this.f1386c = null;
        if (!TextUtils.isEmpty(str)) {
            this.f1387d = str;
            Objects.requireNonNull(hVar, "Argument must not be null");
            this.f1385b = hVar;
            return;
        }
        throw new IllegalArgumentException("Must not be null or empty");
    }

    /* renamed from: b */
    public void mo10372b(@NonNull MessageDigest messageDigest) {
        if (this.f1390g == null) {
            this.f1390g = mo11040c().getBytes(C0974m.f1018a);
        }
        messageDigest.update(this.f1390g);
    }

    /* renamed from: c */
    public String mo11040c() {
        String str = this.f1387d;
        if (str != null) {
            return str;
        }
        URL url = this.f1386c;
        Objects.requireNonNull(url, "Argument must not be null");
        return url.toString();
    }

    /* renamed from: d */
    public URL mo11041d() {
        if (this.f1389f == null) {
            if (TextUtils.isEmpty(this.f1388e)) {
                String str = this.f1387d;
                if (TextUtils.isEmpty(str)) {
                    URL url = this.f1386c;
                    Objects.requireNonNull(url, "Argument must not be null");
                    str = url.toString();
                }
                this.f1388e = Uri.encode(str, "@#&=*+-_.,:!?()/~'%;$");
            }
            this.f1389f = new URL(this.f1388e);
        }
        return this.f1389f;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C1148g)) {
            return false;
        }
        C1148g gVar = (C1148g) obj;
        return mo11040c().equals(gVar.mo11040c()) && this.f1385b.equals(gVar.f1385b);
    }

    public int hashCode() {
        if (this.f1391h == 0) {
            int hashCode = mo11040c().hashCode();
            this.f1391h = hashCode;
            this.f1391h = this.f1385b.hashCode() + (hashCode * 31);
        }
        return this.f1391h;
    }

    public String toString() {
        return mo11040c();
    }

    public C1148g(URL url) {
        C1149h hVar = C1149h.f1392a;
        Objects.requireNonNull(url, "Argument must not be null");
        this.f1386c = url;
        this.f1387d = null;
        Objects.requireNonNull(hVar, "Argument must not be null");
        this.f1385b = hVar;
    }
}
