package p435n;

import java.io.InputStream;
import java.nio.channels.ReadableByteChannel;
import java.nio.charset.Charset;

/* renamed from: n.g */
public interface C8043g extends C8030a0, ReadableByteChannel {
    /* renamed from: A */
    byte[] mo25882A();

    /* renamed from: C */
    long mo25885C(C8044h hVar);

    /* renamed from: D */
    boolean mo25886D();

    /* renamed from: G */
    byte[] mo25888G(long j);

    /* renamed from: P */
    long mo25893P(C8044h hVar);

    /* renamed from: U */
    String mo25896U(long j);

    /* renamed from: V */
    long mo25897V(C8064y yVar);

    /* renamed from: X */
    C8043g mo25898X();

    /* renamed from: a */
    C8040e mo25900a();

    /* renamed from: c */
    C8040e mo25901c();

    /* renamed from: d0 */
    void mo25904d0(long j);

    /* renamed from: i0 */
    long mo25911i0();

    /* renamed from: j0 */
    String mo25913j0(Charset charset);

    /* renamed from: k0 */
    InputStream mo25914k0();

    /* renamed from: m0 */
    int mo25917m0(C8054q qVar);

    /* renamed from: p */
    C8044h mo25922p(long j);

    byte readByte();

    int readInt();

    short readShort();

    void skip(long j);

    /* renamed from: t */
    boolean mo25935t(long j);

    /* renamed from: y */
    String mo25944y();
}
