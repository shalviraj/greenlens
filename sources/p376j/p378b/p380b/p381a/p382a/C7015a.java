package p376j.p378b.p380b.p381a.p382a;

import com.amplitude.api.Constants;
import com.google.api.client.http.HttpHeaders;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;
import p005b.p096l.p097a.p113c.p119b.p126p.C1960d;
import p376j.p378b.p383c.C7029h;
import p376j.p378b.p383c.C7041p;
import p376j.p378b.p383c.C7042q;
import p376j.p378b.p383c.C7053w;
import p376j.p378b.p383c.p386z.C7063a;

/* renamed from: j.b.b.a.a.a */
public final class C7015a extends C7063a {

    /* renamed from: a */
    public static final List<String> f14073a = Collections.singletonList("X-Cloud-Trace-Context");

    static {
        new C7053w.C7055b(C7053w.C7055b.f14153b, (C7053w.C7054a) null);
    }

    /* renamed from: a */
    public <C> void mo24399a(C7041p pVar, C c, C7063a.C7064a<C> aVar) {
        String str;
        C7041p pVar2 = pVar;
        C c2 = c;
        C1960d.m2865x(pVar2, "spanContext");
        C1960d.m2865x(aVar, "setter");
        C1960d.m2865x(c2, Constants.AMP_TRACKING_OPTION_CARRIER);
        StringBuilder sb = new StringBuilder();
        sb.append(pVar2.f14111a.mo24452d());
        sb.append('/');
        C7042q qVar = pVar2.f14112b;
        ByteBuffer allocate = ByteBuffer.allocate(8);
        byte[] bArr = new byte[8];
        long j = qVar.f14115g;
        char[] cArr = C7029h.f14091a;
        bArr[7] = (byte) ((int) (j & 255));
        bArr[6] = (byte) ((int) ((j >> 8) & 255));
        bArr[5] = (byte) ((int) ((j >> 16) & 255));
        bArr[4] = (byte) ((int) ((j >> 24) & 255));
        bArr[3] = (byte) ((int) ((j >> 32) & 255));
        bArr[2] = (byte) ((int) ((j >> 40) & 255));
        bArr[1] = (byte) ((int) ((j >> 48) & 255));
        bArr[0] = (byte) ((int) ((j >> 56) & 255));
        allocate.put(bArr);
        long j2 = allocate.getLong(0);
        C1960d.m2841r(true, "radix (%s) must be between Character.MIN_RADIX and Character.MAX_RADIX", 10);
        int i = (j2 > 0 ? 1 : (j2 == 0 ? 0 : -1));
        String str2 = "0";
        if (i == 0) {
            str = str2;
        } else if (i > 0) {
            str = Long.toString(j2, 10);
        } else {
            char[] cArr2 = new char[64];
            long j3 = (j2 >>> 1) / ((long) 5);
            long j4 = (long) 10;
            int i2 = 63;
            cArr2[63] = Character.forDigit((int) (j2 - (j3 * j4)), 10);
            while (j3 > 0) {
                i2--;
                cArr2[i2] = Character.forDigit((int) (j3 % j4), 10);
                j3 /= j4;
            }
            str = new String(cArr2, i2, 64 - i2);
        }
        sb.append(str);
        sb.append(";o=");
        if (pVar2.f14113c.mo24456a()) {
            str2 = "1";
        }
        sb.append(str2);
        ((HttpHeaders) c2).mo22141m("X-Cloud-Trace-Context", sb.toString());
    }
}
