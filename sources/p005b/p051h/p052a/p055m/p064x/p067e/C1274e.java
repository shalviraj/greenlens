package p005b.p051h.p052a.p055m.p064x.p067e;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p005b.p051h.p052a.p055m.C0979p;
import p005b.p051h.p052a.p055m.C0981r;
import p005b.p051h.p052a.p055m.p058v.C1115w;

/* renamed from: b.h.a.m.x.e.e */
public class C1274e implements C0981r<Uri, Drawable> {

    /* renamed from: a */
    public final Context f1581a;

    public C1274e(Context context) {
        this.f1581a = context.getApplicationContext();
    }

    @Nullable
    /* renamed from: a */
    public /* bridge */ /* synthetic */ C1115w mo10836a(@NonNull Object obj, int i, int i2, @NonNull C0979p pVar) {
        return mo11110c((Uri) obj);
    }

    /* renamed from: b */
    public boolean mo10837b(@NonNull Object obj, @NonNull C0979p pVar) {
        return ((Uri) obj).getScheme().equals("android.resource");
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    @androidx.annotation.Nullable
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public p005b.p051h.p052a.p055m.p058v.C1115w mo11110c(@androidx.annotation.NonNull android.net.Uri r7) {
        /*
            r6 = this;
            java.lang.String r0 = r7.getAuthority()
            android.content.Context r1 = r6.f1581a
            java.lang.String r1 = r1.getPackageName()
            boolean r1 = r0.equals(r1)
            r2 = 0
            if (r1 == 0) goto L_0x0012
            goto L_0x0026
        L_0x0012:
            android.content.Context r1 = r6.f1581a     // Catch:{ NameNotFoundException -> 0x0019 }
            android.content.Context r0 = r1.createPackageContext(r0, r2)     // Catch:{ NameNotFoundException -> 0x0019 }
            goto L_0x0028
        L_0x0019:
            r1 = move-exception
            android.content.Context r3 = r6.f1581a
            java.lang.String r3 = r3.getPackageName()
            boolean r0 = r0.contains(r3)
            if (r0 == 0) goto L_0x00a5
        L_0x0026:
            android.content.Context r0 = r6.f1581a
        L_0x0028:
            java.util.List r1 = r7.getPathSegments()
            int r3 = r1.size()
            r4 = 1
            r5 = 2
            if (r3 != r5) goto L_0x006b
            java.util.List r1 = r7.getPathSegments()
            java.lang.String r3 = r7.getAuthority()
            java.lang.Object r2 = r1.get(r2)
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r1 = r1.get(r4)
            java.lang.String r1 = (java.lang.String) r1
            android.content.res.Resources r4 = r0.getResources()
            int r3 = r4.getIdentifier(r1, r2, r3)
            if (r3 != 0) goto L_0x005c
            android.content.res.Resources r3 = android.content.res.Resources.getSystem()
            java.lang.String r4 = "android"
            int r3 = r3.getIdentifier(r1, r2, r4)
        L_0x005c:
            if (r3 == 0) goto L_0x005f
            goto L_0x0081
        L_0x005f:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Failed to find resource id for: "
            java.lang.String r7 = p005b.p035e.p036a.p037a.C0843a.m449j(r1, r7)
            r0.<init>(r7)
            throw r0
        L_0x006b:
            int r1 = r1.size()
            java.lang.String r3 = "Unrecognized Uri format: "
            if (r1 != r4) goto L_0x009b
            java.util.List r1 = r7.getPathSegments()
            java.lang.Object r1 = r1.get(r2)     // Catch:{ NumberFormatException -> 0x0090 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ NumberFormatException -> 0x0090 }
            int r3 = java.lang.Integer.parseInt(r1)     // Catch:{ NumberFormatException -> 0x0090 }
        L_0x0081:
            android.content.Context r7 = r6.f1581a
            r1 = 0
            android.graphics.drawable.Drawable r7 = p005b.p051h.p052a.p055m.p064x.p067e.C1270a.m1271a(r7, r0, r3, r1)
            if (r7 == 0) goto L_0x008f
            b.h.a.m.x.e.d r1 = new b.h.a.m.x.e.d
            r1.<init>(r7)
        L_0x008f:
            return r1
        L_0x0090:
            r0 = move-exception
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r7 = p005b.p035e.p036a.p037a.C0843a.m449j(r3, r7)
            r1.<init>(r7, r0)
            throw r1
        L_0x009b:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r7 = p005b.p035e.p036a.p037a.C0843a.m449j(r3, r7)
            r0.<init>(r7)
            throw r0
        L_0x00a5:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "Failed to obtain context or unrecognized Uri format for: "
            java.lang.String r7 = p005b.p035e.p036a.p037a.C0843a.m449j(r2, r7)
            r0.<init>(r7, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p051h.p052a.p055m.p064x.p067e.C1274e.mo11110c(android.net.Uri):b.h.a.m.v.w");
    }
}
