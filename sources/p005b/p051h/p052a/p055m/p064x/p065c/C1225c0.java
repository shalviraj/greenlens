package p005b.p051h.p052a.p055m.p064x.p065c;

import android.media.MediaDataSource;
import java.nio.ByteBuffer;
import p005b.p051h.p052a.p055m.p064x.p065c.C1216b0;

/* renamed from: b.h.a.m.x.c.c0 */
public class C1225c0 extends MediaDataSource {

    /* renamed from: g */
    public final /* synthetic */ ByteBuffer f1504g;

    public C1225c0(C1216b0.C1220d dVar, ByteBuffer byteBuffer) {
        this.f1504g = byteBuffer;
    }

    public void close() {
    }

    public long getSize() {
        return (long) this.f1504g.limit();
    }

    public int readAt(long j, byte[] bArr, int i, int i2) {
        if (j >= ((long) this.f1504g.limit())) {
            return -1;
        }
        this.f1504g.position((int) j);
        int min = Math.min(i2, this.f1504g.remaining());
        this.f1504g.get(bArr, i, min);
        return min;
    }
}
