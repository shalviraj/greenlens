package p364h.p365a.p366a.p367a.p370e;

import android.graphics.Bitmap;
import android.net.Uri;
import androidx.annotation.NonNull;
import java.io.File;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

/* renamed from: h.a.a.a.e.a */
public final class C6983a {

    /* renamed from: a */
    public final Uri f14013a;

    /* renamed from: b */
    public final Bitmap f14014b;

    /* renamed from: c */
    public final Integer f14015c;

    /* renamed from: d */
    public boolean f14016d;

    /* renamed from: e */
    public int f14017e;

    /* renamed from: f */
    public int f14018f;

    /* renamed from: g */
    public boolean f14019g;

    public C6983a(int i) {
        this.f14014b = null;
        this.f14013a = null;
        this.f14015c = Integer.valueOf(i);
        this.f14016d = true;
    }

    public C6983a(Bitmap bitmap, boolean z) {
        this.f14014b = bitmap;
        this.f14013a = null;
        this.f14015c = null;
        this.f14016d = false;
        this.f14017e = bitmap.getWidth();
        this.f14018f = bitmap.getHeight();
        this.f14019g = z;
    }

    public C6983a(@NonNull Uri uri) {
        String uri2 = uri.toString();
        if (uri2.startsWith("file:///") && !new File(uri2.substring(7)).exists()) {
            try {
                uri = Uri.parse(URLDecoder.decode(uri2, "UTF-8"));
            } catch (UnsupportedEncodingException unused) {
            }
        }
        this.f14014b = null;
        this.f14013a = uri;
        this.f14015c = null;
        this.f14016d = true;
    }
}
