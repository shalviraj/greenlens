package p005b.p051h.p052a.p055m.p062w.p063y;

import androidx.annotation.NonNull;
import java.io.InputStream;
import java.net.URL;
import p005b.p051h.p052a.p055m.C0979p;
import p005b.p051h.p052a.p055m.p062w.C1148g;
import p005b.p051h.p052a.p055m.p062w.C1161n;
import p005b.p051h.p052a.p055m.p062w.C1163o;
import p005b.p051h.p052a.p055m.p062w.C1169r;

/* renamed from: b.h.a.m.w.y.f */
public class C1206f implements C1161n<URL, InputStream> {

    /* renamed from: a */
    public final C1161n<C1148g, InputStream> f1478a;

    /* renamed from: b.h.a.m.w.y.f$a */
    public static class C1207a implements C1163o<URL, InputStream> {
        @NonNull
        /* renamed from: b */
        public C1161n<URL, InputStream> mo11033b(C1169r rVar) {
            return new C1206f(rVar.mo11058b(C1148g.class, InputStream.class));
        }
    }

    public C1206f(C1161n<C1148g, InputStream> nVar) {
        this.f1478a = nVar;
    }

    /* renamed from: a */
    public C1161n.C1162a mo11030a(@NonNull Object obj, int i, int i2, @NonNull C0979p pVar) {
        return this.f1478a.mo11030a(new C1148g((URL) obj), i, i2, pVar);
    }

    /* renamed from: b */
    public /* bridge */ /* synthetic */ boolean mo11031b(@NonNull Object obj) {
        URL url = (URL) obj;
        return true;
    }
}
