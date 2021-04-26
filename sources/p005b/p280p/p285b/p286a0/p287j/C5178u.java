package p005b.p280p.p285b.p286a0.p287j;

import androidx.appcompat.widget.ActivityChooserView;
import androidx.core.view.ViewCompat;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.ProtocolException;
import java.util.List;
import java.util.zip.Deflater;
import p005b.p035e.p036a.p037a.C0843a;
import p005b.p280p.p285b.p286a0.C5134i;
import p005b.p280p.p285b.p286a0.p287j.C5136b;
import p005b.p280p.p285b.p286a0.p287j.C5139d;
import p005b.p291q.p292a.C5266a;
import p435n.C8040e;
import p435n.C8042f;
import p435n.C8043g;
import p435n.C8044h;
import p435n.C8046i;

/* renamed from: b.p.b.a0.j.u */
public final class C5178u implements C5181v {

    /* renamed from: a */
    public static final byte[] f10124a;

    /* renamed from: b.p.b.a0.j.u$a */
    public static final class C5179a implements C5136b {

        /* renamed from: g */
        public final C8043g f10125g;

        /* renamed from: h */
        public final boolean f10126h;

        /* renamed from: i */
        public final C5171q f10127i;

        public C5179a(C8043g gVar, boolean z) {
            this.f10125g = gVar;
            this.f10127i = new C5171q(gVar);
            this.f10126h = z;
        }

        /* renamed from: d */
        public static IOException m9572d(String str, Object... objArr) {
            throw new IOException(String.format(str, objArr));
        }

        /* renamed from: b0 */
        public boolean mo16988b0(C5136b.C5137a aVar) {
            C5135a aVar2;
            C5135a aVar3;
            boolean z = false;
            try {
                int readInt = this.f10125g.readInt();
                int readInt2 = this.f10125g.readInt();
                boolean z2 = (Integer.MIN_VALUE & readInt) != 0;
                int i = (readInt2 & ViewCompat.MEASURED_STATE_MASK) >>> 24;
                int i2 = readInt2 & ViewCompat.MEASURED_SIZE_MASK;
                if (z2) {
                    int i3 = (2147418112 & readInt) >>> 16;
                    int i4 = readInt & 65535;
                    if (i3 == 3) {
                        switch (i4) {
                            case 1:
                                int readInt3 = this.f10125g.readInt();
                                int readInt4 = this.f10125g.readInt();
                                int i5 = readInt3 & ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
                                int i6 = readInt4 & ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
                                this.f10125g.readShort();
                                ((C5139d.C5145e) aVar).mo17013d((i & 2) != 0, (i & 1) != 0, i5, i6, this.f10127i.mo17060a(i2 - 10), C5160m.SPDY_SYN_STREAM);
                                return true;
                            case 2:
                                ((C5139d.C5145e) aVar).mo17013d(false, (i & 1) != 0, this.f10125g.readInt() & ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED, -1, this.f10127i.mo17060a(i2 - 4), C5160m.SPDY_REPLY);
                                return true;
                            case 3:
                                if (i2 == 8) {
                                    int readInt5 = this.f10125g.readInt() & ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
                                    int readInt6 = this.f10125g.readInt();
                                    C5135a[] values = C5135a.values();
                                    int i7 = 0;
                                    while (true) {
                                        if (i7 < 18) {
                                            aVar2 = values[i7];
                                            if (aVar2.f9976h != readInt6) {
                                                i7++;
                                            }
                                        } else {
                                            aVar2 = null;
                                        }
                                    }
                                    if (aVar2 != null) {
                                        ((C5139d.C5145e) aVar).mo17015f(readInt5, aVar2);
                                        return true;
                                    }
                                    m9572d("TYPE_RST_STREAM unexpected error code: %d", Integer.valueOf(readInt6));
                                    throw null;
                                }
                                m9572d("TYPE_RST_STREAM length: %d != 8", Integer.valueOf(i2));
                                throw null;
                            case 4:
                                int readInt7 = this.f10125g.readInt();
                                if (i2 == (readInt7 * 8) + 4) {
                                    C5177t tVar = new C5177t();
                                    for (int i8 = 0; i8 < readInt7; i8++) {
                                        int readInt8 = this.f10125g.readInt();
                                        tVar.mo17065d(readInt8 & ViewCompat.MEASURED_SIZE_MASK, (readInt8 & ViewCompat.MEASURED_STATE_MASK) >>> 24, this.f10125g.readInt());
                                    }
                                    if ((i & 1) != 0) {
                                        z = true;
                                    }
                                    ((C5139d.C5145e) aVar).mo17016g(z, tVar);
                                    return true;
                                }
                                m9572d("TYPE_SETTINGS length: %d != 4 + 8 * %d", Integer.valueOf(i2), Integer.valueOf(readInt7));
                                throw null;
                            case 6:
                                if (i2 == 4) {
                                    int readInt9 = this.f10125g.readInt();
                                    ((C5139d.C5145e) aVar).mo17014e(this.f10126h == ((readInt9 & 1) == 1), readInt9, 0);
                                    return true;
                                }
                                m9572d("TYPE_PING length: %d != 4", Integer.valueOf(i2));
                                throw null;
                            case 7:
                                if (i2 == 8) {
                                    int readInt10 = this.f10125g.readInt() & ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
                                    int readInt11 = this.f10125g.readInt();
                                    C5135a[] values2 = C5135a.values();
                                    int i9 = 0;
                                    while (true) {
                                        if (i9 < 18) {
                                            aVar3 = values2[i9];
                                            if (aVar3.f9977i != readInt11) {
                                                i9++;
                                            }
                                        } else {
                                            aVar3 = null;
                                        }
                                    }
                                    if (aVar3 != null) {
                                        ((C5139d.C5145e) aVar).mo17012c(readInt10, aVar3, C8044h.f16142j);
                                        return true;
                                    }
                                    m9572d("TYPE_GOAWAY unexpected error code: %d", Integer.valueOf(readInt11));
                                    throw null;
                                }
                                m9572d("TYPE_GOAWAY length: %d != 8", Integer.valueOf(i2));
                                throw null;
                            case 8:
                                ((C5139d.C5145e) aVar).mo17013d(false, false, this.f10125g.readInt() & ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED, -1, this.f10127i.mo17060a(i2 - 4), C5160m.SPDY_HEADERS);
                                return true;
                            case 9:
                                if (i2 == 8) {
                                    int readInt12 = this.f10125g.readInt();
                                    int readInt13 = this.f10125g.readInt();
                                    int i10 = readInt12 & ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
                                    long j = (long) (readInt13 & ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED);
                                    if (j != 0) {
                                        ((C5139d.C5145e) aVar).mo17017h(i10, j);
                                        return true;
                                    }
                                    m9572d("windowSizeIncrement was 0", Long.valueOf(j));
                                    throw null;
                                }
                                m9572d("TYPE_WINDOW_UPDATE length: %d != 8", Integer.valueOf(i2));
                                throw null;
                            default:
                                this.f10125g.skip((long) i2);
                                return true;
                        }
                    } else {
                        throw new ProtocolException(C0843a.m444e("version != 3: ", i3));
                    }
                } else {
                    int i11 = readInt & ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
                    if ((i & 1) != 0) {
                        z = true;
                    }
                    ((C5139d.C5145e) aVar).mo17011b(z, i11, this.f10125g, i2);
                    return true;
                }
            } catch (IOException unused) {
                return false;
            }
        }

        public void close() {
            this.f10127i.f10116c.close();
        }

        /* renamed from: u */
        public void mo16989u() {
        }
    }

    /* renamed from: b.p.b.a0.j.u$b */
    public static final class C5180b implements C5138c {

        /* renamed from: g */
        public final C8042f f10128g;

        /* renamed from: h */
        public final C8040e f10129h;

        /* renamed from: i */
        public final C8042f f10130i;

        /* renamed from: j */
        public final boolean f10131j;

        /* renamed from: k */
        public boolean f10132k;

        public C5180b(C8042f fVar, boolean z) {
            this.f10128g = fVar;
            this.f10131j = z;
            Deflater deflater = new Deflater();
            deflater.setDictionary(C5178u.f10124a);
            C8040e eVar = new C8040e();
            this.f10129h = eVar;
            this.f10130i = C5266a.m9806G(new C8046i(eVar, deflater));
        }

        /* renamed from: F */
        public synchronized void mo16990F() {
        }

        /* renamed from: L */
        public synchronized void mo16991L(boolean z, int i, C8040e eVar, int i2) {
            mo17068d(i, z ? 1 : 0, eVar, i2);
        }

        /* renamed from: a0 */
        public int mo16992a0() {
            return 16383;
        }

        /* renamed from: b */
        public synchronized void mo16993b(boolean z, int i, int i2) {
            if (!this.f10132k) {
                boolean z2 = false;
                if (this.f10131j != ((i & 1) == 1)) {
                    z2 = true;
                }
                if (z == z2) {
                    this.f10128g.mo25939v(-2147287034);
                    this.f10128g.mo25939v(4);
                    this.f10128g.mo25939v(i);
                    this.f10128g.flush();
                } else {
                    throw new IllegalArgumentException("payload != reply");
                }
            } else {
                throw new IOException("closed");
            }
        }

        /* renamed from: c0 */
        public synchronized void mo16994c0(boolean z, boolean z2, int i, int i2, List<C5159l> list) {
            if (!this.f10132k) {
                mo17069e(list);
                int i3 = (int) (this.f10129h.f16140h + 10);
                boolean z3 = z | (z2 ? (char) 2 : 0);
                this.f10128g.mo25939v(-2147287039);
                this.f10128g.mo25939v(((z3 & true ? 1 : 0) << true) | (i3 & ViewCompat.MEASURED_SIZE_MASK));
                this.f10128g.mo25939v(i & ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED);
                this.f10128g.mo25939v(Integer.MAX_VALUE & i2);
                this.f10128g.mo25926r(0);
                this.f10128g.mo25918n(this.f10129h);
                this.f10128g.flush();
            } else {
                throw new IOException("closed");
            }
        }

        public synchronized void close() {
            this.f10132k = true;
            C5134i.m9457b(this.f10128g, this.f10130i);
        }

        /* renamed from: d */
        public void mo17068d(int i, int i2, C8040e eVar, int i3) {
            if (!this.f10132k) {
                long j = (long) i3;
                if (j <= 16777215) {
                    this.f10128g.mo25939v(i & ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED);
                    this.f10128g.mo25939v(((i2 & 255) << 24) | (16777215 & i3));
                    if (i3 > 0) {
                        this.f10128g.mo17030j(eVar, j);
                        return;
                    }
                    return;
                }
                throw new IllegalArgumentException(C0843a.m444e("FRAME_TOO_LARGE max size is 16Mib: ", i3));
            }
            throw new IOException("closed");
        }

        /* renamed from: e */
        public final void mo17069e(List<C5159l> list) {
            this.f10130i.mo25939v(list.size());
            int size = list.size();
            for (int i = 0; i < size; i++) {
                C8044h hVar = list.get(i).f10067a;
                this.f10130i.mo25939v(hVar.mo25959l());
                this.f10130i.mo25890M(hVar);
                C8044h hVar2 = list.get(i).f10068b;
                this.f10130i.mo25939v(hVar2.mo25959l());
                this.f10130i.mo25890M(hVar2);
            }
            this.f10130i.flush();
        }

        public synchronized void flush() {
            if (!this.f10132k) {
                this.f10128g.flush();
            } else {
                throw new IOException("closed");
            }
        }

        /* renamed from: g */
        public synchronized void mo16996g(int i, long j) {
            if (this.f10132k) {
                throw new IOException("closed");
            } else if (j == 0 || j > 2147483647L) {
                throw new IllegalArgumentException("windowSizeIncrement must be between 1 and 0x7fffffff: " + j);
            } else {
                this.f10128g.mo25939v(-2147287031);
                this.f10128g.mo25939v(8);
                this.f10128g.mo25939v(i);
                this.f10128g.mo25939v((int) j);
                this.f10128g.flush();
            }
        }

        /* renamed from: g0 */
        public synchronized void mo16997g0(C5177t tVar) {
            if (!this.f10132k) {
                int bitCount = Integer.bitCount(tVar.f10120a);
                this.f10128g.mo25939v(-2147287036);
                this.f10128g.mo25939v((((bitCount * 8) + 4) & ViewCompat.MEASURED_SIZE_MASK) | 0);
                this.f10128g.mo25939v(bitCount);
                for (int i = 0; i <= 10; i++) {
                    if (tVar.mo17064c(i)) {
                        this.f10128g.mo25939v(((tVar.mo17062a(i) & 255) << 24) | (i & ViewCompat.MEASURED_SIZE_MASK));
                        this.f10128g.mo25939v(tVar.f10123d[i]);
                    }
                }
                this.f10128g.flush();
            } else {
                throw new IOException("closed");
            }
        }

        /* renamed from: k */
        public void mo16998k(C5177t tVar) {
        }

        /* renamed from: s */
        public synchronized void mo16999s(int i, C5135a aVar) {
            if (this.f10132k) {
                throw new IOException("closed");
            } else if (aVar.f9976h != -1) {
                this.f10128g.mo25939v(-2147287037);
                this.f10128g.mo25939v(8);
                this.f10128g.mo25939v(i & ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED);
                this.f10128g.mo25939v(aVar.f9976h);
                this.f10128g.flush();
            } else {
                throw new IllegalArgumentException();
            }
        }

        /* renamed from: w */
        public synchronized void mo17000w(int i, C5135a aVar, byte[] bArr) {
            if (this.f10132k) {
                throw new IOException("closed");
            } else if (aVar.f9977i != -1) {
                this.f10128g.mo25939v(-2147287033);
                this.f10128g.mo25939v(8);
                this.f10128g.mo25939v(i);
                this.f10128g.mo25939v(aVar.f9977i);
                this.f10128g.flush();
            } else {
                throw new IllegalArgumentException("errorCode.spdyGoAwayCode == -1");
            }
        }
    }

    static {
        try {
            f10124a = "\u0000\u0000\u0000\u0007options\u0000\u0000\u0000\u0004head\u0000\u0000\u0000\u0004post\u0000\u0000\u0000\u0003put\u0000\u0000\u0000\u0006delete\u0000\u0000\u0000\u0005trace\u0000\u0000\u0000\u0006accept\u0000\u0000\u0000\u000eaccept-charset\u0000\u0000\u0000\u000faccept-encoding\u0000\u0000\u0000\u000faccept-language\u0000\u0000\u0000\raccept-ranges\u0000\u0000\u0000\u0003age\u0000\u0000\u0000\u0005allow\u0000\u0000\u0000\rauthorization\u0000\u0000\u0000\rcache-control\u0000\u0000\u0000\nconnection\u0000\u0000\u0000\fcontent-base\u0000\u0000\u0000\u0010content-encoding\u0000\u0000\u0000\u0010content-language\u0000\u0000\u0000\u000econtent-length\u0000\u0000\u0000\u0010content-location\u0000\u0000\u0000\u000bcontent-md5\u0000\u0000\u0000\rcontent-range\u0000\u0000\u0000\fcontent-type\u0000\u0000\u0000\u0004date\u0000\u0000\u0000\u0004etag\u0000\u0000\u0000\u0006expect\u0000\u0000\u0000\u0007expires\u0000\u0000\u0000\u0004from\u0000\u0000\u0000\u0004host\u0000\u0000\u0000\bif-match\u0000\u0000\u0000\u0011if-modified-since\u0000\u0000\u0000\rif-none-match\u0000\u0000\u0000\bif-range\u0000\u0000\u0000\u0013if-unmodified-since\u0000\u0000\u0000\rlast-modified\u0000\u0000\u0000\blocation\u0000\u0000\u0000\fmax-forwards\u0000\u0000\u0000\u0006pragma\u0000\u0000\u0000\u0012proxy-authenticate\u0000\u0000\u0000\u0013proxy-authorization\u0000\u0000\u0000\u0005range\u0000\u0000\u0000\u0007referer\u0000\u0000\u0000\u000bretry-after\u0000\u0000\u0000\u0006server\u0000\u0000\u0000\u0002te\u0000\u0000\u0000\u0007trailer\u0000\u0000\u0000\u0011transfer-encoding\u0000\u0000\u0000\u0007upgrade\u0000\u0000\u0000\nuser-agent\u0000\u0000\u0000\u0004vary\u0000\u0000\u0000\u0003via\u0000\u0000\u0000\u0007warning\u0000\u0000\u0000\u0010www-authenticate\u0000\u0000\u0000\u0006method\u0000\u0000\u0000\u0003get\u0000\u0000\u0000\u0006status\u0000\u0000\u0000\u0006200 OK\u0000\u0000\u0000\u0007version\u0000\u0000\u0000\bHTTP/1.1\u0000\u0000\u0000\u0003url\u0000\u0000\u0000\u0006public\u0000\u0000\u0000\nset-cookie\u0000\u0000\u0000\nkeep-alive\u0000\u0000\u0000\u0006origin100101201202205206300302303304305306307402405406407408409410411412413414415416417502504505203 Non-Authoritative Information204 No Content301 Moved Permanently400 Bad Request401 Unauthorized403 Forbidden404 Not Found500 Internal Server Error501 Not Implemented503 Service UnavailableJan Feb Mar Apr May Jun Jul Aug Sept Oct Nov Dec 00:00:00 Mon, Tue, Wed, Thu, Fri, Sat, Sun, GMTchunked,text/html,image/png,image/jpg,image/gif,application/xml,application/xhtml+xml,text/plain,text/javascript,publicprivatemax-age=gzip,deflate,sdchcharset=utf-8charset=iso-8859-1,utf-,*,enq=0.".getBytes(C5134i.f9955c.name());
        } catch (UnsupportedEncodingException unused) {
            throw new AssertionError();
        }
    }

    /* renamed from: a */
    public C5136b mo17052a(C8043g gVar, boolean z) {
        return new C5179a(gVar, z);
    }

    /* renamed from: b */
    public C5138c mo17053b(C8042f fVar, boolean z) {
        return new C5180b(fVar, z);
    }
}
