package p005b.p051h.p052a.p055m.p062w.p063y;

import android.content.Context;
import android.net.Uri;
import androidx.annotation.NonNull;
import java.io.InputStream;
import p005b.p006a.p007a.p024o.C0823f;
import p005b.p051h.p052a.p055m.C0979p;
import p005b.p051h.p052a.p055m.p056u.p057p.C1009b;
import p005b.p051h.p052a.p055m.p062w.C1161n;
import p005b.p051h.p052a.p055m.p062w.C1163o;
import p005b.p051h.p052a.p055m.p062w.C1169r;
import p005b.p051h.p052a.p077r.C1366b;

/* renamed from: b.h.a.m.w.y.c */
public class C1197c implements C1161n<Uri, InputStream> {

    /* renamed from: a */
    public final Context f1457a;

    /* renamed from: b.h.a.m.w.y.c$a */
    public static class C1198a implements C1163o<Uri, InputStream> {

        /* renamed from: a */
        public final Context f1458a;

        public C1198a(Context context) {
            this.f1458a = context;
        }

        @NonNull
        /* renamed from: b */
        public C1161n<Uri, InputStream> mo11033b(C1169r rVar) {
            return new C1197c(this.f1458a);
        }
    }

    public C1197c(Context context) {
        this.f1457a = context.getApplicationContext();
    }

    /* renamed from: a */
    public C1161n.C1162a mo11030a(@NonNull Object obj, int i, int i2, @NonNull C0979p pVar) {
        Uri uri = (Uri) obj;
        if (!C0823f.m354W(i, i2)) {
            return null;
        }
        C1366b bVar = new C1366b(uri);
        Context context = this.f1457a;
        return new C1161n.C1162a(bVar, C1009b.m810c(context, uri, new C1009b.C1010a(context.getContentResolver())));
    }

    /* renamed from: b */
    public boolean mo11031b(@NonNull Object obj) {
        Uri uri = (Uri) obj;
        return C0823f.m353V(uri) && !uri.getPathSegments().contains("video");
    }
}
