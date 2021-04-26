package p005b.p051h.p052a.p055m.p062w;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import java.io.File;
import java.io.FileNotFoundException;
import p005b.p006a.p007a.p024o.C0823f;
import p005b.p035e.p036a.p037a.C0843a;
import p005b.p051h.p052a.C0934f;
import p005b.p051h.p052a.p055m.C0962a;
import p005b.p051h.p052a.p055m.C0979p;
import p005b.p051h.p052a.p055m.p056u.C0987d;
import p005b.p051h.p052a.p055m.p062w.C1161n;
import p005b.p051h.p052a.p077r.C1366b;

/* renamed from: b.h.a.m.w.k */
public final class C1154k implements C1161n<Uri, File> {

    /* renamed from: a */
    public final Context f1399a;

    /* renamed from: b.h.a.m.w.k$a */
    public static final class C1155a implements C1163o<Uri, File> {

        /* renamed from: a */
        public final Context f1400a;

        public C1155a(Context context) {
            this.f1400a = context;
        }

        @NonNull
        /* renamed from: b */
        public C1161n<Uri, File> mo11033b(C1169r rVar) {
            return new C1154k(this.f1400a);
        }
    }

    /* renamed from: b.h.a.m.w.k$b */
    public static class C1156b implements C0987d<File> {

        /* renamed from: i */
        public static final String[] f1401i = {"_data"};

        /* renamed from: g */
        public final Context f1402g;

        /* renamed from: h */
        public final Uri f1403h;

        public C1156b(Context context, Uri uri) {
            this.f1402g = context;
            this.f1403h = uri;
        }

        @NonNull
        /* renamed from: a */
        public Class<File> mo10839a() {
            return File.class;
        }

        /* renamed from: b */
        public void mo10842b() {
        }

        public void cancel() {
        }

        @NonNull
        /* renamed from: e */
        public C0962a mo10846e() {
            return C0962a.LOCAL;
        }

        /* renamed from: f */
        public void mo10847f(@NonNull C0934f fVar, @NonNull C0987d.C0988a<? super File> aVar) {
            Cursor query = this.f1402g.getContentResolver().query(this.f1403h, f1401i, (String) null, (String[]) null, (String) null);
            String str = null;
            if (query != null) {
                try {
                    if (query.moveToFirst()) {
                        str = query.getString(query.getColumnIndexOrThrow("_data"));
                    }
                } finally {
                    query.close();
                }
            }
            if (TextUtils.isEmpty(str)) {
                StringBuilder u = C0843a.m460u("Failed to find file path for: ");
                u.append(this.f1403h);
                aVar.mo10853c(new FileNotFoundException(u.toString()));
                return;
            }
            aVar.mo10854d(new File(str));
        }
    }

    public C1154k(Context context) {
        this.f1399a = context;
    }

    /* renamed from: a */
    public C1161n.C1162a mo11030a(@NonNull Object obj, int i, int i2, @NonNull C0979p pVar) {
        Uri uri = (Uri) obj;
        return new C1161n.C1162a(new C1366b(uri), new C1156b(this.f1399a, uri));
    }

    /* renamed from: b */
    public boolean mo11031b(@NonNull Object obj) {
        return C0823f.m353V((Uri) obj);
    }
}
