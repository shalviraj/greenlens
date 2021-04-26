package p005b.p051h.p052a.p055m.p056u;

import androidx.annotation.NonNull;
import java.io.InputStream;
import p005b.p051h.p052a.p055m.p056u.C0989e;
import p005b.p051h.p052a.p055m.p058v.p059c0.C1023b;
import p005b.p051h.p052a.p055m.p064x.p065c.C1260w;

/* renamed from: b.h.a.m.u.k */
public final class C1000k implements C0989e<InputStream> {

    /* renamed from: a */
    public final C1260w f1050a;

    /* renamed from: b.h.a.m.u.k$a */
    public static final class C1001a implements C0989e.C0990a<InputStream> {

        /* renamed from: a */
        public final C1023b f1051a;

        public C1001a(C1023b bVar) {
            this.f1051a = bVar;
        }

        @NonNull
        /* renamed from: a */
        public Class<InputStream> mo10857a() {
            return InputStream.class;
        }

        @NonNull
        /* renamed from: b */
        public C0989e mo10858b(Object obj) {
            return new C1000k((InputStream) obj, this.f1051a);
        }
    }

    public C1000k(InputStream inputStream, C1023b bVar) {
        C1260w wVar = new C1260w(inputStream, bVar);
        this.f1050a = wVar;
        wVar.mark(5242880);
    }

    /* renamed from: b */
    public void mo10856b() {
        this.f1050a.mo11097e();
    }

    @NonNull
    /* renamed from: c */
    public InputStream mo10855a() {
        this.f1050a.reset();
        return this.f1050a;
    }
}
