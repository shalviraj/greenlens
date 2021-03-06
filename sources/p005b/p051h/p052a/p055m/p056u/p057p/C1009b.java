package p005b.p051h.p052a.p055m.p056u.p057p;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import p005b.p051h.p052a.C0929c;
import p005b.p051h.p052a.C0934f;
import p005b.p051h.p052a.p055m.C0962a;
import p005b.p051h.p052a.p055m.p056u.C0987d;

/* renamed from: b.h.a.m.u.p.b */
public class C1009b implements C0987d<InputStream> {

    /* renamed from: g */
    public final Uri f1058g;

    /* renamed from: h */
    public final C1013d f1059h;

    /* renamed from: i */
    public InputStream f1060i;

    /* renamed from: b.h.a.m.u.p.b$a */
    public static class C1010a implements C1012c {

        /* renamed from: b */
        public static final String[] f1061b = {"_data"};

        /* renamed from: a */
        public final ContentResolver f1062a;

        public C1010a(ContentResolver contentResolver) {
            this.f1062a = contentResolver;
        }

        /* renamed from: a */
        public Cursor mo10869a(Uri uri) {
            String lastPathSegment = uri.getLastPathSegment();
            return this.f1062a.query(MediaStore.Images.Thumbnails.EXTERNAL_CONTENT_URI, f1061b, "kind = 1 AND image_id = ?", new String[]{lastPathSegment}, (String) null);
        }
    }

    /* renamed from: b.h.a.m.u.p.b$b */
    public static class C1011b implements C1012c {

        /* renamed from: b */
        public static final String[] f1063b = {"_data"};

        /* renamed from: a */
        public final ContentResolver f1064a;

        public C1011b(ContentResolver contentResolver) {
            this.f1064a = contentResolver;
        }

        /* renamed from: a */
        public Cursor mo10869a(Uri uri) {
            String lastPathSegment = uri.getLastPathSegment();
            return this.f1064a.query(MediaStore.Video.Thumbnails.EXTERNAL_CONTENT_URI, f1063b, "kind = 1 AND video_id = ?", new String[]{lastPathSegment}, (String) null);
        }
    }

    @VisibleForTesting
    public C1009b(Uri uri, C1013d dVar) {
        this.f1058g = uri;
        this.f1059h = dVar;
    }

    /* renamed from: c */
    public static C1009b m810c(Context context, Uri uri, C1012c cVar) {
        return new C1009b(uri, new C1013d(C0929c.m652b(context).f842j.mo10765e(), cVar, C0929c.m652b(context).f843k, context.getContentResolver()));
    }

    @NonNull
    /* renamed from: a */
    public Class<InputStream> mo10839a() {
        return InputStream.class;
    }

    /* renamed from: b */
    public void mo10842b() {
        InputStream inputStream = this.f1060i;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
    }

    public void cancel() {
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [java.io.InputStream] */
    /* JADX WARNING: type inference failed for: r5v1, types: [android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r5v4 */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0024, code lost:
        if (r6 != null) goto L_0x0049;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0047, code lost:
        if (r6 == null) goto L_0x004c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0049, code lost:
        r6.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x004c, code lost:
        r7 = r5;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0033 A[Catch:{ all -> 0x00f1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00c4  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00f5  */
    /* JADX WARNING: Removed duplicated region for block: B:69:? A[RETURN, SYNTHETIC] */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.io.InputStream mo10868d() {
        /*
            r11 = this;
            java.lang.String r0 = "ThumbStreamOpener"
            b.h.a.m.u.p.d r1 = r11.f1059h
            android.net.Uri r2 = r11.f1058g
            java.util.Objects.requireNonNull(r1)
            r3 = 0
            r4 = 3
            r5 = 0
            b.h.a.m.u.p.c r6 = r1.f1066a     // Catch:{ SecurityException -> 0x002a, all -> 0x0027 }
            android.database.Cursor r6 = r6.mo10869a(r2)     // Catch:{ SecurityException -> 0x002a, all -> 0x0027 }
            if (r6 == 0) goto L_0x0024
            boolean r7 = r6.moveToFirst()     // Catch:{ SecurityException -> 0x0022 }
            if (r7 == 0) goto L_0x0024
            java.lang.String r7 = r6.getString(r3)     // Catch:{ SecurityException -> 0x0022 }
            r6.close()
            goto L_0x004d
        L_0x0022:
            r7 = move-exception
            goto L_0x002d
        L_0x0024:
            if (r6 == 0) goto L_0x004c
            goto L_0x0049
        L_0x0027:
            r0 = move-exception
            goto L_0x00f3
        L_0x002a:
            r6 = move-exception
            r7 = r6
            r6 = r5
        L_0x002d:
            boolean r8 = android.util.Log.isLoggable(r0, r4)     // Catch:{ all -> 0x00f1 }
            if (r8 == 0) goto L_0x0047
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x00f1 }
            r8.<init>()     // Catch:{ all -> 0x00f1 }
            java.lang.String r9 = "Failed to query for thumbnail for Uri: "
            r8.append(r9)     // Catch:{ all -> 0x00f1 }
            r8.append(r2)     // Catch:{ all -> 0x00f1 }
            java.lang.String r8 = r8.toString()     // Catch:{ all -> 0x00f1 }
            android.util.Log.d(r0, r8, r7)     // Catch:{ all -> 0x00f1 }
        L_0x0047:
            if (r6 == 0) goto L_0x004c
        L_0x0049:
            r6.close()
        L_0x004c:
            r7 = r5
        L_0x004d:
            boolean r6 = android.text.TextUtils.isEmpty(r7)
            if (r6 == 0) goto L_0x0054
            goto L_0x006c
        L_0x0054:
            java.io.File r6 = new java.io.File
            r6.<init>(r7)
            boolean r7 = r6.exists()
            if (r7 == 0) goto L_0x006a
            r7 = 0
            long r9 = r6.length()
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 >= 0) goto L_0x006a
            r3 = 1
        L_0x006a:
            if (r3 != 0) goto L_0x006e
        L_0x006c:
            r1 = r5
            goto L_0x0078
        L_0x006e:
            android.net.Uri r3 = android.net.Uri.fromFile(r6)
            android.content.ContentResolver r1 = r1.f1068c     // Catch:{ NullPointerException -> 0x00cb }
            java.io.InputStream r1 = r1.openInputStream(r3)     // Catch:{ NullPointerException -> 0x00cb }
        L_0x0078:
            r2 = -1
            if (r1 == 0) goto L_0x00c1
            b.h.a.m.u.p.d r3 = r11.f1059h
            android.net.Uri r6 = r11.f1058g
            java.util.Objects.requireNonNull(r3)
            android.content.ContentResolver r7 = r3.f1068c     // Catch:{ IOException -> 0x009a, NullPointerException -> 0x0098 }
            java.io.InputStream r5 = r7.openInputStream(r6)     // Catch:{ IOException -> 0x009a, NullPointerException -> 0x0098 }
            java.util.List<com.bumptech.glide.load.ImageHeaderParser> r7 = r3.f1069d     // Catch:{ IOException -> 0x009a, NullPointerException -> 0x0098 }
            b.h.a.m.v.c0.b r3 = r3.f1067b     // Catch:{ IOException -> 0x009a, NullPointerException -> 0x0098 }
            int r0 = p005b.p006a.p007a.p024o.C0823f.m337F(r7, r5, r3)     // Catch:{ IOException -> 0x009a, NullPointerException -> 0x0098 }
            if (r5 == 0) goto L_0x00c2
            r5.close()     // Catch:{ IOException -> 0x00c2 }
            goto L_0x00c2
        L_0x0096:
            r0 = move-exception
            goto L_0x00bb
        L_0x0098:
            r3 = move-exception
            goto L_0x009b
        L_0x009a:
            r3 = move-exception
        L_0x009b:
            boolean r4 = android.util.Log.isLoggable(r0, r4)     // Catch:{ all -> 0x0096 }
            if (r4 == 0) goto L_0x00b5
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0096 }
            r4.<init>()     // Catch:{ all -> 0x0096 }
            java.lang.String r7 = "Failed to open uri: "
            r4.append(r7)     // Catch:{ all -> 0x0096 }
            r4.append(r6)     // Catch:{ all -> 0x0096 }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x0096 }
            android.util.Log.d(r0, r4, r3)     // Catch:{ all -> 0x0096 }
        L_0x00b5:
            if (r5 == 0) goto L_0x00c1
            r5.close()     // Catch:{ IOException -> 0x00c1 }
            goto L_0x00c1
        L_0x00bb:
            if (r5 == 0) goto L_0x00c0
            r5.close()     // Catch:{ IOException -> 0x00c0 }
        L_0x00c0:
            throw r0
        L_0x00c1:
            r0 = r2
        L_0x00c2:
            if (r0 == r2) goto L_0x00ca
            b.h.a.m.u.g r2 = new b.h.a.m.u.g
            r2.<init>(r1, r0)
            r1 = r2
        L_0x00ca:
            return r1
        L_0x00cb:
            r0 = move-exception
            java.io.FileNotFoundException r1 = new java.io.FileNotFoundException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "NPE opening uri: "
            r4.append(r5)
            r4.append(r2)
            java.lang.String r2 = " -> "
            r4.append(r2)
            r4.append(r3)
            java.lang.String r2 = r4.toString()
            r1.<init>(r2)
            java.lang.Throwable r0 = r1.initCause(r0)
            java.io.FileNotFoundException r0 = (java.io.FileNotFoundException) r0
            throw r0
        L_0x00f1:
            r0 = move-exception
            r5 = r6
        L_0x00f3:
            if (r5 == 0) goto L_0x00f8
            r5.close()
        L_0x00f8:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p051h.p052a.p055m.p056u.p057p.C1009b.mo10868d():java.io.InputStream");
    }

    @NonNull
    /* renamed from: e */
    public C0962a mo10846e() {
        return C0962a.LOCAL;
    }

    /* renamed from: f */
    public void mo10847f(@NonNull C0934f fVar, @NonNull C0987d.C0988a<? super InputStream> aVar) {
        try {
            InputStream d = mo10868d();
            this.f1060i = d;
            aVar.mo10854d(d);
        } catch (FileNotFoundException e) {
            if (Log.isLoggable("MediaStoreThumbFetcher", 3)) {
                Log.d("MediaStoreThumbFetcher", "Failed to find thumbnail file", e);
            }
            aVar.mo10853c(e);
        }
    }
}
