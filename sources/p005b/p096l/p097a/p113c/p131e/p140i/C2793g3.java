package p005b.p096l.p097a.p113c.p131e.p140i;

import android.net.Uri;
import androidx.annotation.GuardedBy;
import androidx.collection.ArrayMap;

/* renamed from: b.l.a.c.e.i.g3 */
public final class C2793g3 {
    @GuardedBy("PhenotypeConstants.class")

    /* renamed from: a */
    public static final ArrayMap<String, Uri> f4746a = new ArrayMap<>();

    /* renamed from: a */
    public static synchronized Uri m4771a(String str) {
        Uri uri;
        synchronized (C2793g3.class) {
            ArrayMap<String, Uri> arrayMap = f4746a;
            uri = arrayMap.get("com.google.android.gms.measurement");
            if (uri == null) {
                String valueOf = String.valueOf(Uri.encode("com.google.android.gms.measurement"));
                uri = Uri.parse(valueOf.length() != 0 ? "content://com.google.android.gms.phenotype/".concat(valueOf) : new String("content://com.google.android.gms.phenotype/"));
                arrayMap.put("com.google.android.gms.measurement", uri);
            }
        }
        return uri;
    }
}
