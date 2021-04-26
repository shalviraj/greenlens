package p005b.p096l.p175c.p178c;

import java.io.OutputStream;
import java.util.Objects;

/* renamed from: b.l.c.c.b */
public final class C3810b {

    /* renamed from: a */
    public static final /* synthetic */ int f7026a = 0;

    /* renamed from: b.l.c.c.b$a */
    public static class C3811a extends OutputStream {
        public String toString() {
            return "ByteStreams.nullOutputStream()";
        }

        public void write(int i) {
        }

        public void write(byte[] bArr) {
            Objects.requireNonNull(bArr);
        }

        public void write(byte[] bArr, int i, int i2) {
            Objects.requireNonNull(bArr);
        }
    }

    static {
        new C3811a();
    }
}
