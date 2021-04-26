package p005b.p096l.p097a.p113c.p131e.p137f;

import java.io.OutputStream;
import java.util.Objects;

/* renamed from: b.l.a.c.e.f.b */
public final class C2655b extends OutputStream {
    public final String toString() {
        return "ByteStreams.nullOutputStream()";
    }

    public final void write(int i) {
    }

    public final void write(byte[] bArr) {
        Objects.requireNonNull(bArr);
    }

    public final void write(byte[] bArr, int i, int i2) {
        Objects.requireNonNull(bArr);
    }
}
