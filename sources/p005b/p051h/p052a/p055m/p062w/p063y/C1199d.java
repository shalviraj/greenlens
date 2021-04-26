package p005b.p051h.p052a.p055m.p062w.p063y;

import android.content.Context;
import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.InputStream;
import p005b.p006a.p007a.p024o.C0823f;
import p005b.p051h.p052a.p055m.C0979p;
import p005b.p051h.p052a.p055m.p056u.p057p.C1009b;
import p005b.p051h.p052a.p055m.p062w.C1161n;
import p005b.p051h.p052a.p055m.p062w.C1163o;
import p005b.p051h.p052a.p055m.p062w.C1169r;
import p005b.p051h.p052a.p055m.p064x.p065c.C1216b0;
import p005b.p051h.p052a.p077r.C1366b;

/* renamed from: b.h.a.m.w.y.d */
public class C1199d implements C1161n<Uri, InputStream> {

    /* renamed from: a */
    public final Context f1459a;

    /* renamed from: b.h.a.m.w.y.d$a */
    public static class C1200a implements C1163o<Uri, InputStream> {

        /* renamed from: a */
        public final Context f1460a;

        public C1200a(Context context) {
            this.f1460a = context;
        }

        @NonNull
        /* renamed from: b */
        public C1161n<Uri, InputStream> mo11033b(C1169r rVar) {
            return new C1199d(this.f1460a);
        }
    }

    public C1199d(Context context) {
        this.f1459a = context.getApplicationContext();
    }

    @Nullable
    /* renamed from: a */
    public C1161n.C1162a mo11030a(@NonNull Object obj, int i, int i2, @NonNull C0979p pVar) {
        Uri uri = (Uri) obj;
        if (C0823f.m354W(i, i2)) {
            Long l = (Long) pVar.mo10833c(C1216b0.f1493d);
            if (l != null && l.longValue() == -1) {
                C1366b bVar = new C1366b(uri);
                Context context = this.f1459a;
                return new C1161n.C1162a(bVar, C1009b.m810c(context, uri, new C1009b.C1011b(context.getContentResolver())));
            }
        }
        return null;
    }

    /* renamed from: b */
    public boolean mo11031b(@NonNull Object obj) {
        Uri uri = (Uri) obj;
        return C0823f.m353V(uri) && uri.getPathSegments().contains("video");
    }
}
