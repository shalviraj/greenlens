package p005b.p051h.p052a.p055m.p058v.p060d0;

import androidx.annotation.NonNull;
import androidx.core.util.Pools;
import androidx.exifinterface.media.ExifInterface;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Objects;
import p005b.p051h.p052a.p055m.C0974m;
import p005b.p051h.p052a.p078s.C1377g;
import p005b.p051h.p052a.p078s.C1380j;
import p005b.p051h.p052a.p078s.p079k.C1382a;
import p005b.p051h.p052a.p078s.p079k.C1390d;

/* renamed from: b.h.a.m.v.d0.k */
public class C1063k {

    /* renamed from: a */
    public final C1377g<C0974m, String> f1160a = new C1377g<>(1000);

    /* renamed from: b */
    public final Pools.Pool<C1065b> f1161b = C1382a.m1478a(10, new C1064a(this));

    /* renamed from: b.h.a.m.v.d0.k$a */
    public class C1064a implements C1382a.C1384b<C1065b> {
        public C1064a(C1063k kVar) {
        }

        /* renamed from: a */
        public Object mo10934a() {
            try {
                return new C1065b(MessageDigest.getInstance("SHA-256"));
            } catch (NoSuchAlgorithmException e) {
                throw new RuntimeException(e);
            }
        }
    }

    /* renamed from: b.h.a.m.v.d0.k$b */
    public static final class C1065b implements C1382a.C1386d {

        /* renamed from: g */
        public final MessageDigest f1162g;

        /* renamed from: h */
        public final C1390d f1163h = new C1390d.C1392b();

        public C1065b(MessageDigest messageDigest) {
            this.f1162g = messageDigest;
        }

        @NonNull
        /* renamed from: k */
        public C1390d mo10935k() {
            return this.f1163h;
        }
    }

    /* renamed from: a */
    public String mo10933a(C0974m mVar) {
        String a;
        synchronized (this.f1160a) {
            a = this.f1160a.mo11252a(mVar);
        }
        if (a == null) {
            C1065b acquire = this.f1161b.acquire();
            Objects.requireNonNull(acquire, "Argument must not be null");
            C1065b bVar = acquire;
            try {
                mVar.mo10372b(bVar.f1162g);
                byte[] digest = bVar.f1162g.digest();
                char[] cArr = C1380j.f1802b;
                synchronized (cArr) {
                    for (int i = 0; i < digest.length; i++) {
                        byte b = digest[i] & ExifInterface.MARKER;
                        int i2 = i * 2;
                        char[] cArr2 = C1380j.f1801a;
                        cArr[i2] = cArr2[b >>> 4];
                        cArr[i2 + 1] = cArr2[b & 15];
                    }
                    a = new String(cArr);
                }
                this.f1161b.release(bVar);
            } catch (Throwable th) {
                this.f1161b.release(bVar);
                throw th;
            }
        }
        synchronized (this.f1160a) {
            this.f1160a.mo11253d(mVar, a);
        }
        return a;
    }
}
