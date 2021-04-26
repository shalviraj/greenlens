package p298d.p299a.p300a.p301a.p303y0.p389g;

import java.io.FilterInputStream;
import java.io.InputStream;
import p298d.p299a.p300a.p301a.p303y0.p389g.C7117p;

/* renamed from: d.a.a.a.y0.g.a */
public abstract class C7081a implements C7117p {

    /* renamed from: d.a.a.a.y0.g.a$a */
    public static abstract class C7082a<BuilderType extends C7082a> implements C7117p.C7118a {

        /* renamed from: d.a.a.a.y0.g.a$a$a */
        public static final class C7083a extends FilterInputStream {

            /* renamed from: g */
            public int f14159g;

            public C7083a(InputStream inputStream, int i) {
                super(inputStream);
                this.f14159g = i;
            }

            public int available() {
                return Math.min(super.available(), this.f14159g);
            }

            public int read() {
                if (this.f14159g <= 0) {
                    return -1;
                }
                int read = super.read();
                if (read >= 0) {
                    this.f14159g--;
                }
                return read;
            }

            public int read(byte[] bArr, int i, int i2) {
                int i3 = this.f14159g;
                if (i3 <= 0) {
                    return -1;
                }
                int read = super.read(bArr, i, Math.min(i2, i3));
                if (read >= 0) {
                    this.f14159g -= read;
                }
                return read;
            }

            public long skip(long j) {
                long skip = super.skip(Math.min(j, (long) this.f14159g));
                if (skip >= 0) {
                    this.f14159g = (int) (((long) this.f14159g) - skip);
                }
                return skip;
            }
        }

        /* renamed from: h */
        public abstract BuilderType mo23689H(C7088d dVar, C7091f fVar);
    }
}
