package p421m.p422m0.p429j;

import androidx.appcompat.widget.ActivityChooserView;
import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import p005b.p035e.p036a.p037a.C0843a;
import p298d.p344x.p346c.C6888i;
import p421m.p422m0.C7867c;
import p421m.p422m0.p429j.C7925d;
import p435n.C8040e;
import p435n.C8042f;

/* renamed from: m.m0.j.p */
public final class C7954p implements Closeable {

    /* renamed from: m */
    public static final Logger f15966m = Logger.getLogger(C7928e.class.getName());

    /* renamed from: g */
    public final C8040e f15967g;

    /* renamed from: h */
    public int f15968h = 16384;

    /* renamed from: i */
    public boolean f15969i;

    /* renamed from: j */
    public final C7925d.C7927b f15970j;

    /* renamed from: k */
    public final C8042f f15971k;

    /* renamed from: l */
    public final boolean f15972l;

    public C7954p(C8042f fVar, boolean z) {
        C6888i.m12438e(fVar, "sink");
        this.f15971k = fVar;
        this.f15972l = z;
        C8040e eVar = new C8040e();
        this.f15967g = eVar;
        this.f15970j = new C7925d.C7927b(0, false, eVar, 3);
    }

    /* renamed from: H */
    public final synchronized void mo25733H(int i, C7922b bVar) {
        C6888i.m12438e(bVar, "errorCode");
        if (!this.f15969i) {
            if (bVar.f15808g != -1) {
                mo25739e(i, 4, 3, 0);
                this.f15971k.mo25939v(bVar.f15808g);
                this.f15971k.flush();
            } else {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
        } else {
            throw new IOException("closed");
        }
    }

    /* renamed from: L */
    public final synchronized void mo25734L(boolean z, int i, C8040e eVar, int i2) {
        if (!this.f15969i) {
            mo25739e(i, i2, 0, z ? 1 : 0);
            if (i2 > 0) {
                C8042f fVar = this.f15971k;
                C6888i.m12436c(eVar);
                fVar.mo17030j(eVar, (long) i2);
            }
        } else {
            throw new IOException("closed");
        }
    }

    /* renamed from: N */
    public final void mo25735N(int i, long j) {
        while (j > 0) {
            long min = Math.min((long) this.f15968h, j);
            j -= min;
            mo25739e(i, (int) min, 9, j == 0 ? 4 : 0);
            this.f15971k.mo17030j(this.f15967g, min);
        }
    }

    /* renamed from: b */
    public final synchronized void mo25736b(boolean z, int i, int i2) {
        if (!this.f15969i) {
            mo25739e(0, 8, 6, z ? 1 : 0);
            this.f15971k.mo25939v(i);
            this.f15971k.mo25939v(i2);
            this.f15971k.flush();
        } else {
            throw new IOException("closed");
        }
    }

    public synchronized void close() {
        this.f15969i = true;
        this.f15971k.close();
    }

    /* renamed from: d */
    public final synchronized void mo25738d(C7959t tVar) {
        C6888i.m12438e(tVar, "peerSettings");
        if (!this.f15969i) {
            int i = this.f15968h;
            int i2 = tVar.f15981a;
            if ((i2 & 32) != 0) {
                i = tVar.f15982b[5];
            }
            this.f15968h = i;
            int i3 = i2 & 2;
            int i4 = -1;
            if ((i3 != 0 ? tVar.f15982b[1] : -1) != -1) {
                C7925d.C7927b bVar = this.f15970j;
                if (i3 != 0) {
                    i4 = tVar.f15982b[1];
                }
                bVar.f15836h = i4;
                int min = Math.min(i4, 16384);
                int i5 = bVar.f15831c;
                if (i5 != min) {
                    if (min < i5) {
                        bVar.f15829a = Math.min(bVar.f15829a, min);
                    }
                    bVar.f15830b = true;
                    bVar.f15831c = min;
                    int i6 = bVar.f15835g;
                    if (min < i6) {
                        if (min == 0) {
                            bVar.mo25684a();
                        } else {
                            bVar.mo25685b(i6 - min);
                        }
                    }
                }
            }
            mo25739e(0, 0, 4, 1);
            this.f15971k.flush();
        } else {
            throw new IOException("closed");
        }
    }

    /* renamed from: e */
    public final void mo25739e(int i, int i2, int i3, int i4) {
        Logger logger = f15966m;
        if (logger.isLoggable(Level.FINE)) {
            logger.fine(C7928e.f15843e.mo25691b(false, i, i2, i3, i4));
        }
        boolean z = true;
        if (i2 <= this.f15968h) {
            if ((((int) 2147483648L) & i) != 0) {
                z = false;
            }
            if (z) {
                C8042f fVar = this.f15971k;
                byte[] bArr = C7867c.f15619a;
                C6888i.m12438e(fVar, "$this$writeMedium");
                fVar.mo25887E((i2 >>> 16) & 255);
                fVar.mo25887E((i2 >>> 8) & 255);
                fVar.mo25887E(i2 & 255);
                this.f15971k.mo25887E(i3 & 255);
                this.f15971k.mo25887E(i4 & 255);
                this.f15971k.mo25939v(i & ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED);
                return;
            }
            throw new IllegalArgumentException(C0843a.m444e("reserved bit set: ", i).toString());
        }
        StringBuilder u = C0843a.m460u("FRAME_SIZE_ERROR length > ");
        u.append(this.f15968h);
        u.append(": ");
        u.append(i2);
        throw new IllegalArgumentException(u.toString().toString());
    }

    public final synchronized void flush() {
        if (!this.f15969i) {
            this.f15971k.flush();
        } else {
            throw new IOException("closed");
        }
    }

    /* renamed from: g */
    public final synchronized void mo25741g(int i, long j) {
        if (!this.f15969i) {
            if (j != 0 && j <= 2147483647L) {
                mo25739e(i, 4, 8, 0);
                this.f15971k.mo25939v((int) j);
                this.f15971k.flush();
            } else {
                throw new IllegalArgumentException(("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: " + j).toString());
            }
        } else {
            throw new IOException("closed");
        }
    }

    /* renamed from: q */
    public final synchronized void mo25742q(int i, C7922b bVar, byte[] bArr) {
        C6888i.m12438e(bVar, "errorCode");
        C6888i.m12438e(bArr, "debugData");
        if (!this.f15969i) {
            boolean z = false;
            if (bVar.f15808g != -1) {
                mo25739e(0, bArr.length + 8, 7, 0);
                this.f15971k.mo25939v(i);
                this.f15971k.mo25939v(bVar.f15808g);
                if (bArr.length == 0) {
                    z = true;
                }
                if (!z) {
                    this.f15971k.mo25889K(bArr);
                }
                this.f15971k.flush();
            } else {
                throw new IllegalArgumentException("errorCode.httpCode == -1".toString());
            }
        } else {
            throw new IOException("closed");
        }
    }

    /* renamed from: z */
    public final synchronized void mo25743z(boolean z, int i, List<C7924c> list) {
        C6888i.m12438e(list, "headerBlock");
        if (!this.f15969i) {
            this.f15970j.mo25688e(list);
            long j = this.f15967g.f16140h;
            long min = Math.min((long) this.f15968h, j);
            int i2 = (j > min ? 1 : (j == min ? 0 : -1));
            int i3 = i2 == 0 ? 4 : 0;
            if (z) {
                i3 |= 1;
            }
            mo25739e(i, (int) min, 1, i3);
            this.f15971k.mo17030j(this.f15967g, min);
            if (i2 > 0) {
                mo25735N(i, j - min);
            }
        } else {
            throw new IOException("closed");
        }
    }
}
