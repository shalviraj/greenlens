package p005b.p096l.p164b.p165a.p169b;

import java.io.FilterInputStream;
import java.io.InputStream;
import p005b.p096l.p175c.p178c.C3810b;

/* renamed from: b.l.b.a.b.b */
public final class C3673b extends FilterInputStream {

    /* renamed from: g */
    public boolean f6754g = false;

    public C3673b(InputStream inputStream) {
        super(inputStream);
    }

    public void close() {
        if (!this.f6754g && this.in != null) {
            try {
                int i = C3810b.f7026a;
                while (((long) read(new byte[8192])) != -1) {
                }
                this.in.close();
            } finally {
                this.f6754g = true;
            }
        }
    }
}
