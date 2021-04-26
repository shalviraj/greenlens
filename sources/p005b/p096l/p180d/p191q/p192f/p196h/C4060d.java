package p005b.p096l.p180d.p191q.p192f.p196h;

import java.io.InputStream;
import p005b.p096l.p180d.p191q.p192f.p196h.C4055c;

/* renamed from: b.l.d.q.f.h.d */
public class C4060d implements C4055c.C4059d {

    /* renamed from: a */
    public final /* synthetic */ byte[] f7466a;

    /* renamed from: b */
    public final /* synthetic */ int[] f7467b;

    public C4060d(C4061e eVar, byte[] bArr, int[] iArr) {
        this.f7466a = bArr;
        this.f7467b = iArr;
    }

    public void read(InputStream inputStream, int i) {
        try {
            inputStream.read(this.f7466a, this.f7467b[0], i);
            int[] iArr = this.f7467b;
            iArr[0] = iArr[0] + i;
        } finally {
            inputStream.close();
        }
    }
}
