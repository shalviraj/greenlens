package p005b.p051h.p052a.p055m.p062w.p063y;

import android.net.Uri;
import androidx.annotation.NonNull;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import p005b.p051h.p052a.p055m.C0979p;
import p005b.p051h.p052a.p055m.p062w.C1148g;
import p005b.p051h.p052a.p055m.p062w.C1161n;
import p005b.p051h.p052a.p055m.p062w.C1163o;
import p005b.p051h.p052a.p055m.p062w.C1169r;

/* renamed from: b.h.a.m.w.y.b */
public class C1195b implements C1161n<Uri, InputStream> {

    /* renamed from: b */
    public static final Set<String> f1455b = Collections.unmodifiableSet(new HashSet(Arrays.asList(new String[]{"http", "https"})));

    /* renamed from: a */
    public final C1161n<C1148g, InputStream> f1456a;

    /* renamed from: b.h.a.m.w.y.b$a */
    public static class C1196a implements C1163o<Uri, InputStream> {
        @NonNull
        /* renamed from: b */
        public C1161n<Uri, InputStream> mo11033b(C1169r rVar) {
            return new C1195b(rVar.mo11058b(C1148g.class, InputStream.class));
        }
    }

    public C1195b(C1161n<C1148g, InputStream> nVar) {
        this.f1456a = nVar;
    }

    /* renamed from: a */
    public C1161n.C1162a mo11030a(@NonNull Object obj, int i, int i2, @NonNull C0979p pVar) {
        return this.f1456a.mo11030a(new C1148g(((Uri) obj).toString()), i, i2, pVar);
    }

    /* renamed from: b */
    public boolean mo11031b(@NonNull Object obj) {
        return f1455b.contains(((Uri) obj).getScheme());
    }
}
