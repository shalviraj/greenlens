package p005b.p268n.p269a.p270a.p271e;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import java.io.IOException;
import java.util.List;
import p005b.p051h.p052a.p055m.C0979p;
import p005b.p096l.p097a.p113c.p119b.p126p.C1960d;

@RestrictTo({RestrictTo.Scope.LIBRARY})
/* renamed from: b.n.a.a.e.f */
public final class C4765f extends C4767h<Uri> {

    /* renamed from: a */
    public final Resources f9114a;

    public C4765f(@NonNull Context context) {
        this.f9114a = context.getResources();
    }

    /* renamed from: b */
    public boolean mo10837b(@NonNull Object obj, @NonNull C0979p pVar) {
        Uri uri = (Uri) obj;
        Resources resources = this.f9114a;
        if (!"android.resource".equals(uri.getScheme())) {
            return false;
        }
        List<String> pathSegments = uri.getPathSegments();
        if (pathSegments.size() == 2) {
            return "raw".equals(pathSegments.get(0));
        }
        if (pathSegments.size() != 1) {
            return false;
        }
        try {
            int parseInt = Integer.parseInt(pathSegments.get(0));
            return parseInt != 0 && "raw".equals(resources.getResourceTypeName(parseInt));
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    /* renamed from: d */
    public int mo16485d(@NonNull Object obj) {
        try {
            return C1960d.m2764X(this.f9114a.openRawResourceFd(C1960d.m2761W(this.f9114a, (Uri) obj)).getFileDescriptor());
        } catch (Resources.NotFoundException e) {
            throw new IOException(e);
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:10|11|12|13|14) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x001e */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public p005b.p080i.p081a.C1422f mo16486e(@androidx.annotation.NonNull java.lang.Object r1, int r2, int r3, @androidx.annotation.NonNull p005b.p051h.p052a.p055m.C0979p r4) {
        /*
            r0 = this;
            android.net.Uri r1 = (android.net.Uri) r1
            android.content.res.Resources r2 = r0.f9114a     // Catch:{ h -> 0x001f }
            int r1 = p005b.p096l.p097a.p113c.p119b.p126p.C1960d.m2761W(r2, r1)     // Catch:{ h -> 0x001f }
            b.i.a.i r3 = new b.i.a.i     // Catch:{ h -> 0x001f }
            r3.<init>()     // Catch:{ h -> 0x001f }
            java.io.InputStream r1 = r2.openRawResource(r1)     // Catch:{ h -> 0x001f }
            r2 = 1
            b.i.a.f r2 = r3.mo11411h(r1, r2)     // Catch:{ all -> 0x001a }
            r1.close()     // Catch:{ IOException -> 0x0019 }
        L_0x0019:
            return r2
        L_0x001a:
            r2 = move-exception
            r1.close()     // Catch:{ IOException -> 0x001e }
        L_0x001e:
            throw r2     // Catch:{ h -> 0x001f }
        L_0x001f:
            r1 = move-exception
            b.n.a.a.e.i r2 = new b.n.a.a.e.i
            r2.<init>(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p268n.p269a.p270a.p271e.C4765f.mo16486e(java.lang.Object, int, int, b.h.a.m.p):b.i.a.f");
    }
}
