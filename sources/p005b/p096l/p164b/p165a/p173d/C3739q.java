package p005b.p096l.p164b.p165a.p173d;

import java.io.FilterOutputStream;
import java.io.OutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: b.l.b.a.d.q */
public class C3739q extends FilterOutputStream {

    /* renamed from: g */
    public final C3737o f6922g;

    public C3739q(OutputStream outputStream, Logger logger, Level level, int i) {
        super(outputStream);
        this.f6922g = new C3737o(logger, level, i);
    }

    public void close() {
        this.f6922g.close();
        super.close();
    }

    public void write(int i) {
        this.out.write(i);
        this.f6922g.write(i);
    }

    public void write(byte[] bArr, int i, int i2) {
        this.out.write(bArr, i, i2);
        this.f6922g.write(bArr, i, i2);
    }
}
