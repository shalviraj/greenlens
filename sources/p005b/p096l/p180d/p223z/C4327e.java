package p005b.p096l.p180d.p223z;

import android.graphics.Bitmap;
import androidx.annotation.Nullable;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import p005b.p096l.p097a.p113c.p131e.p137f.C2657d;
import p005b.p096l.p097a.p113c.p131e.p137f.C2660g;
import p005b.p096l.p097a.p113c.p150j.C3428h;

/* renamed from: b.l.d.z.e */
public final class C4327e implements Closeable {

    /* renamed from: g */
    public final URL f8040g;
    @Nullable

    /* renamed from: h */
    public C3428h<Bitmap> f8041h;
    @Nullable

    /* renamed from: i */
    public volatile InputStream f8042i;

    public C4327e(URL url) {
        this.f8040g = url;
    }

    /* renamed from: d */
    public static void m7941d(Throwable th, InputStream inputStream) {
        if (th != null) {
            try {
                inputStream.close();
            } catch (Throwable th2) {
                C2660g.f4547a.mo13157a(th, th2);
            }
        } else {
            inputStream.close();
        }
    }

    public final void close() {
        InputStream inputStream = this.f8042i;
        Logger logger = C2657d.f4544a;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException e) {
                try {
                    C2657d.f4544a.logp(Level.WARNING, "com.google.common.io.Closeables", "close", "IOException thrown while closing Closeable.", e);
                } catch (IOException e2) {
                    throw new AssertionError(e2);
                }
            }
        }
    }
}
