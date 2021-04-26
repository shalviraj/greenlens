package p005b.p051h.p052a.p055m.p062w.p063y;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;
import p005b.p006a.p007a.p024o.C0823f;
import p005b.p051h.p052a.C0934f;
import p005b.p051h.p052a.p055m.C0962a;
import p005b.p051h.p052a.p055m.C0979p;
import p005b.p051h.p052a.p055m.p056u.C0987d;
import p005b.p051h.p052a.p055m.p062w.C1161n;
import p005b.p051h.p052a.p055m.p062w.C1163o;
import p005b.p051h.p052a.p055m.p062w.C1169r;
import p005b.p051h.p052a.p077r.C1366b;

@RequiresApi(29)
/* renamed from: b.h.a.m.w.y.e */
public final class C1201e<DataT> implements C1161n<Uri, DataT> {

    /* renamed from: a */
    public final Context f1461a;

    /* renamed from: b */
    public final C1161n<File, DataT> f1462b;

    /* renamed from: c */
    public final C1161n<Uri, DataT> f1463c;

    /* renamed from: d */
    public final Class<DataT> f1464d;

    /* renamed from: b.h.a.m.w.y.e$a */
    public static abstract class C1202a<DataT> implements C1163o<Uri, DataT> {

        /* renamed from: a */
        public final Context f1465a;

        /* renamed from: b */
        public final Class<DataT> f1466b;

        public C1202a(Context context, Class<DataT> cls) {
            this.f1465a = context;
            this.f1466b = cls;
        }

        @NonNull
        /* renamed from: b */
        public final C1161n<Uri, DataT> mo11033b(@NonNull C1169r rVar) {
            return new C1201e(this.f1465a, rVar.mo11058b(File.class, this.f1466b), rVar.mo11058b(Uri.class, this.f1466b), this.f1466b);
        }
    }

    @RequiresApi(29)
    /* renamed from: b.h.a.m.w.y.e$b */
    public static final class C1203b extends C1202a<ParcelFileDescriptor> {
        public C1203b(Context context) {
            super(context, ParcelFileDescriptor.class);
        }
    }

    @RequiresApi(29)
    /* renamed from: b.h.a.m.w.y.e$c */
    public static final class C1204c extends C1202a<InputStream> {
        public C1204c(Context context) {
            super(context, InputStream.class);
        }
    }

    /* renamed from: b.h.a.m.w.y.e$d */
    public static final class C1205d<DataT> implements C0987d<DataT> {

        /* renamed from: q */
        public static final String[] f1467q = {"_data"};

        /* renamed from: g */
        public final Context f1468g;

        /* renamed from: h */
        public final C1161n<File, DataT> f1469h;

        /* renamed from: i */
        public final C1161n<Uri, DataT> f1470i;

        /* renamed from: j */
        public final Uri f1471j;

        /* renamed from: k */
        public final int f1472k;

        /* renamed from: l */
        public final int f1473l;

        /* renamed from: m */
        public final C0979p f1474m;

        /* renamed from: n */
        public final Class<DataT> f1475n;

        /* renamed from: o */
        public volatile boolean f1476o;
        @Nullable

        /* renamed from: p */
        public volatile C0987d<DataT> f1477p;

        public C1205d(Context context, C1161n<File, DataT> nVar, C1161n<Uri, DataT> nVar2, Uri uri, int i, int i2, C0979p pVar, Class<DataT> cls) {
            this.f1468g = context.getApplicationContext();
            this.f1469h = nVar;
            this.f1470i = nVar2;
            this.f1471j = uri;
            this.f1472k = i;
            this.f1473l = i2;
            this.f1474m = pVar;
            this.f1475n = cls;
        }

        @NonNull
        /* renamed from: a */
        public Class<DataT> mo10839a() {
            return this.f1475n;
        }

        /* renamed from: b */
        public void mo10842b() {
            C0987d<DataT> dVar = this.f1477p;
            if (dVar != null) {
                dVar.mo10842b();
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:22:0x007a  */
        @androidx.annotation.Nullable
        /* renamed from: c */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final p005b.p051h.p052a.p055m.p056u.C0987d<DataT> mo11062c() {
            /*
                r9 = this;
                boolean r0 = android.os.Environment.isExternalStorageLegacy()
                r1 = 0
                if (r0 == 0) goto L_0x007e
                b.h.a.m.w.n<java.io.File, DataT> r0 = r9.f1469h
                android.net.Uri r8 = r9.f1471j
                android.content.Context r2 = r9.f1468g     // Catch:{ all -> 0x0077 }
                android.content.ContentResolver r2 = r2.getContentResolver()     // Catch:{ all -> 0x0077 }
                java.lang.String[] r4 = f1467q     // Catch:{ all -> 0x0077 }
                r5 = 0
                r6 = 0
                r7 = 0
                r3 = r8
                android.database.Cursor r2 = r2.query(r3, r4, r5, r6, r7)     // Catch:{ all -> 0x0077 }
                if (r2 == 0) goto L_0x005d
                boolean r3 = r2.moveToFirst()     // Catch:{ all -> 0x0074 }
                if (r3 == 0) goto L_0x005d
                java.lang.String r3 = "_data"
                int r3 = r2.getColumnIndexOrThrow(r3)     // Catch:{ all -> 0x0074 }
                java.lang.String r3 = r2.getString(r3)     // Catch:{ all -> 0x0074 }
                boolean r4 = android.text.TextUtils.isEmpty(r3)     // Catch:{ all -> 0x0074 }
                if (r4 != 0) goto L_0x0046
                java.io.File r4 = new java.io.File     // Catch:{ all -> 0x0074 }
                r4.<init>(r3)     // Catch:{ all -> 0x0074 }
                r2.close()
                int r2 = r9.f1472k
                int r3 = r9.f1473l
                b.h.a.m.p r5 = r9.f1474m
                b.h.a.m.w.n$a r0 = r0.mo11030a(r4, r2, r3, r5)
                goto L_0x00a2
            L_0x0046:
                java.io.FileNotFoundException r0 = new java.io.FileNotFoundException     // Catch:{ all -> 0x0074 }
                java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0074 }
                r1.<init>()     // Catch:{ all -> 0x0074 }
                java.lang.String r3 = "File path was empty in media store for: "
                r1.append(r3)     // Catch:{ all -> 0x0074 }
                r1.append(r8)     // Catch:{ all -> 0x0074 }
                java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0074 }
                r0.<init>(r1)     // Catch:{ all -> 0x0074 }
                throw r0     // Catch:{ all -> 0x0074 }
            L_0x005d:
                java.io.FileNotFoundException r0 = new java.io.FileNotFoundException     // Catch:{ all -> 0x0074 }
                java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0074 }
                r1.<init>()     // Catch:{ all -> 0x0074 }
                java.lang.String r3 = "Failed to media store entry for: "
                r1.append(r3)     // Catch:{ all -> 0x0074 }
                r1.append(r8)     // Catch:{ all -> 0x0074 }
                java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0074 }
                r0.<init>(r1)     // Catch:{ all -> 0x0074 }
                throw r0     // Catch:{ all -> 0x0074 }
            L_0x0074:
                r0 = move-exception
                r1 = r2
                goto L_0x0078
            L_0x0077:
                r0 = move-exception
            L_0x0078:
                if (r1 == 0) goto L_0x007d
                r1.close()
            L_0x007d:
                throw r0
            L_0x007e:
                android.content.Context r0 = r9.f1468g
                java.lang.String r2 = "android.permission.ACCESS_MEDIA_LOCATION"
                int r0 = r0.checkSelfPermission(r2)
                if (r0 != 0) goto L_0x008a
                r0 = 1
                goto L_0x008b
            L_0x008a:
                r0 = 0
            L_0x008b:
                if (r0 == 0) goto L_0x0094
                android.net.Uri r0 = r9.f1471j
                android.net.Uri r0 = android.provider.MediaStore.setRequireOriginal(r0)
                goto L_0x0096
            L_0x0094:
                android.net.Uri r0 = r9.f1471j
            L_0x0096:
                b.h.a.m.w.n<android.net.Uri, DataT> r2 = r9.f1470i
                int r3 = r9.f1472k
                int r4 = r9.f1473l
                b.h.a.m.p r5 = r9.f1474m
                b.h.a.m.w.n$a r0 = r2.mo11030a(r0, r3, r4, r5)
            L_0x00a2:
                if (r0 == 0) goto L_0x00a6
                b.h.a.m.u.d<Data> r1 = r0.f1411c
            L_0x00a6:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: p005b.p051h.p052a.p055m.p062w.p063y.C1201e.C1205d.mo11062c():b.h.a.m.u.d");
        }

        public void cancel() {
            this.f1476o = true;
            C0987d<DataT> dVar = this.f1477p;
            if (dVar != null) {
                dVar.cancel();
            }
        }

        @NonNull
        /* renamed from: e */
        public C0962a mo10846e() {
            return C0962a.LOCAL;
        }

        /* renamed from: f */
        public void mo10847f(@NonNull C0934f fVar, @NonNull C0987d.C0988a<? super DataT> aVar) {
            try {
                C0987d<DataT> c = mo11062c();
                if (c == null) {
                    aVar.mo10853c(new IllegalArgumentException("Failed to build fetcher for: " + this.f1471j));
                    return;
                }
                this.f1477p = c;
                if (this.f1476o) {
                    cancel();
                } else {
                    c.mo10847f(fVar, aVar);
                }
            } catch (FileNotFoundException e) {
                aVar.mo10853c(e);
            }
        }
    }

    public C1201e(Context context, C1161n<File, DataT> nVar, C1161n<Uri, DataT> nVar2, Class<DataT> cls) {
        this.f1461a = context.getApplicationContext();
        this.f1462b = nVar;
        this.f1463c = nVar2;
        this.f1464d = cls;
    }

    /* renamed from: a */
    public C1161n.C1162a mo11030a(@NonNull Object obj, int i, int i2, @NonNull C0979p pVar) {
        Uri uri = (Uri) obj;
        return new C1161n.C1162a(new C1366b(uri), new C1205d(this.f1461a, this.f1462b, this.f1463c, uri, i, i2, pVar, this.f1464d));
    }

    /* renamed from: b */
    public boolean mo11031b(@NonNull Object obj) {
        return Build.VERSION.SDK_INT >= 29 && C0823f.m353V((Uri) obj);
    }
}
