package p005b.p096l.p164b.p165a.p173d;

import java.io.FilterInputStream;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: b.l.b.a.d.p */
public class C3738p extends FilterInputStream {

    /* renamed from: g */
    public final C3737o f6921g;

    public C3738p(InputStream inputStream, Logger logger, Level level, int i) {
        super(inputStream);
        this.f6921g = new C3737o(logger, level, i);
    }

    public void close() {
        this.f6921g.close();
        super.close();
    }

    public int read() {
        int read = super.read();
        this.f6921g.write(read);
        return read;
    }

    public int read(byte[] bArr, int i, int i2) {
        int read = super.read(bArr, i, i2);
        if (read > 0) {
            this.f6921g.write(bArr, i, read);
        }
        return read;
    }
}
