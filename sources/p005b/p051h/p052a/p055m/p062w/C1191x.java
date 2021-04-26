package p005b.p051h.p052a.p055m.p062w;

import android.net.Uri;
import androidx.annotation.NonNull;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import p005b.p051h.p052a.p055m.C0979p;
import p005b.p051h.p052a.p055m.p062w.C1161n;

/* renamed from: b.h.a.m.w.x */
public class C1191x<Data> implements C1161n<Uri, Data> {

    /* renamed from: b */
    public static final Set<String> f1450b = Collections.unmodifiableSet(new HashSet(Arrays.asList(new String[]{"http", "https"})));

    /* renamed from: a */
    public final C1161n<C1148g, Data> f1451a;

    /* renamed from: b.h.a.m.w.x$a */
    public static class C1192a implements C1163o<Uri, InputStream> {
        @NonNull
        /* renamed from: b */
        public C1161n<Uri, InputStream> mo11033b(C1169r rVar) {
            return new C1191x(rVar.mo11058b(C1148g.class, InputStream.class));
        }
    }

    public C1191x(C1161n<C1148g, Data> nVar) {
        this.f1451a = nVar;
    }

    /* renamed from: a */
    public C1161n.C1162a mo11030a(@NonNull Object obj, int i, int i2, @NonNull C0979p pVar) {
        return this.f1451a.mo11030a(new C1148g(((Uri) obj).toString()), i, i2, pVar);
    }

    /* renamed from: b */
    public boolean mo11031b(@NonNull Object obj) {
        return f1450b.contains(((Uri) obj).getScheme());
    }
}
