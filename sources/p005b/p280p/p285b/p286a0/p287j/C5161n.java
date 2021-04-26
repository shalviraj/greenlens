package p005b.p280p.p285b.p286a0.p287j;

import androidx.exifinterface.media.ExifInterface;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import p005b.p035e.p036a.p037a.C0843a;
import p005b.p280p.p285b.p286a0.p287j.C5169p;
import p005b.p291q.p292a.C5266a;
import p435n.C8030a0;
import p435n.C8040e;
import p435n.C8043g;
import p435n.C8044h;

/* renamed from: b.p.b.a0.j.n */
public final class C5161n {

    /* renamed from: a */
    public static final C5159l[] f10075a;

    /* renamed from: b */
    public static final Map<C8044h, Integer> f10076b;

    /* renamed from: b.p.b.a0.j.n$a */
    public static final class C5162a {

        /* renamed from: a */
        public final List<C5159l> f10077a = new ArrayList();

        /* renamed from: b */
        public final C8043g f10078b;

        /* renamed from: c */
        public int f10079c;

        /* renamed from: d */
        public int f10080d;

        /* renamed from: e */
        public C5159l[] f10081e = new C5159l[8];

        /* renamed from: f */
        public int f10082f = 7;

        /* renamed from: g */
        public int f10083g = 0;

        /* renamed from: h */
        public int f10084h = 0;

        public C5162a(int i, C8030a0 a0Var) {
            this.f10079c = i;
            this.f10080d = i;
            this.f10078b = C5266a.m9812H(a0Var);
        }

        /* renamed from: a */
        public final void mo17042a() {
            this.f10077a.clear();
            Arrays.fill(this.f10081e, (Object) null);
            this.f10082f = this.f10081e.length - 1;
            this.f10083g = 0;
            this.f10084h = 0;
        }

        /* renamed from: b */
        public final int mo17043b(int i) {
            return this.f10082f + 1 + i;
        }

        /* renamed from: c */
        public final int mo17044c(int i) {
            int i2;
            int i3 = 0;
            if (i > 0) {
                int length = this.f10081e.length;
                while (true) {
                    length--;
                    i2 = this.f10082f;
                    if (length < i2 || i <= 0) {
                        C5159l[] lVarArr = this.f10081e;
                        System.arraycopy(lVarArr, i2 + 1, lVarArr, i2 + 1 + i3, this.f10083g);
                        this.f10082f += i3;
                    } else {
                        C5159l[] lVarArr2 = this.f10081e;
                        i -= lVarArr2[length].f10069c;
                        this.f10084h -= lVarArr2[length].f10069c;
                        this.f10083g--;
                        i3++;
                    }
                }
                C5159l[] lVarArr3 = this.f10081e;
                System.arraycopy(lVarArr3, i2 + 1, lVarArr3, i2 + 1 + i3, this.f10083g);
                this.f10082f += i3;
            }
            return i3;
        }

        /* renamed from: d */
        public final C8044h mo17045d(int i) {
            C5159l lVar;
            boolean z = true;
            if (i < 0 || i > C5161n.f10075a.length - 1) {
                z = false;
            }
            if (z) {
                lVar = C5161n.f10075a[i];
            } else {
                lVar = this.f10081e[mo17043b(i - C5161n.f10075a.length)];
            }
            return lVar.f10067a;
        }

        /* renamed from: e */
        public final void mo17046e(int i, C5159l lVar) {
            this.f10077a.add(lVar);
            int i2 = lVar.f10069c;
            if (i != -1) {
                i2 -= this.f10081e[(this.f10082f + 1) + i].f10069c;
            }
            int i3 = this.f10080d;
            if (i2 > i3) {
                mo17042a();
                return;
            }
            int c = mo17044c((this.f10084h + i2) - i3);
            if (i == -1) {
                int i4 = this.f10083g + 1;
                C5159l[] lVarArr = this.f10081e;
                if (i4 > lVarArr.length) {
                    C5159l[] lVarArr2 = new C5159l[(lVarArr.length * 2)];
                    System.arraycopy(lVarArr, 0, lVarArr2, lVarArr.length, lVarArr.length);
                    this.f10082f = this.f10081e.length - 1;
                    this.f10081e = lVarArr2;
                }
                int i5 = this.f10082f;
                this.f10082f = i5 - 1;
                this.f10081e[i5] = lVar;
                this.f10083g++;
            } else {
                this.f10081e[this.f10082f + 1 + i + c + i] = lVar;
            }
            this.f10084h += i2;
        }

        /* renamed from: f */
        public C8044h mo17047f() {
            byte readByte = this.f10078b.readByte() & ExifInterface.MARKER;
            boolean z = (readByte & 128) == 128;
            int g = mo17048g(readByte, 127);
            if (!z) {
                return this.f10078b.mo25922p((long) g);
            }
            C5169p pVar = C5169p.f10109d;
            byte[] G = this.f10078b.mo25888G((long) g);
            Objects.requireNonNull(pVar);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            int i = 0;
            C5169p.C5170a aVar = pVar.f10110a;
            byte b = 0;
            for (byte b2 : G) {
                b = (b << 8) | (b2 & ExifInterface.MARKER);
                i += 8;
                while (i >= 8) {
                    int i2 = i - 8;
                    aVar = aVar.f10111a[(b >>> i2) & 255];
                    if (aVar.f10111a == null) {
                        byteArrayOutputStream.write(aVar.f10112b);
                        i -= aVar.f10113c;
                        aVar = pVar.f10110a;
                    } else {
                        i = i2;
                    }
                }
            }
            while (i > 0) {
                C5169p.C5170a aVar2 = aVar.f10111a[(b << (8 - i)) & 255];
                if (aVar2.f10111a != null || aVar2.f10113c > i) {
                    break;
                }
                byteArrayOutputStream.write(aVar2.f10112b);
                i -= aVar2.f10113c;
                aVar = pVar.f10110a;
            }
            return C8044h.m14840t(byteArrayOutputStream.toByteArray());
        }

        /* renamed from: g */
        public int mo17048g(int i, int i2) {
            int i3 = i & i2;
            if (i3 < i2) {
                return i3;
            }
            int i4 = 0;
            while (true) {
                byte readByte = this.f10078b.readByte() & ExifInterface.MARKER;
                if ((readByte & 128) == 0) {
                    return i2 + (readByte << i4);
                }
                i2 += (readByte & Byte.MAX_VALUE) << i4;
                i4 += 7;
            }
        }
    }

    /* renamed from: b.p.b.a0.j.n$b */
    public static final class C5163b {

        /* renamed from: a */
        public final C8040e f10085a;

        public C5163b(C8040e eVar) {
            this.f10085a = eVar;
        }

        /* renamed from: a */
        public void mo17049a(C8044h hVar) {
            mo17051c(hVar.mo25959l(), 127, 0);
            this.f10085a.mo25933s0(hVar);
        }

        /* renamed from: b */
        public void mo17050b(List<C5159l> list) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                C8044h x = list.get(i).f10067a.mo25966x();
                Integer num = C5161n.f10076b.get(x);
                if (num != null) {
                    mo17051c(num.intValue() + 1, 15, 0);
                } else {
                    this.f10085a.mo25940v0(0);
                    mo17049a(x);
                }
                mo17049a(list.get(i).f10068b);
            }
        }

        /* renamed from: c */
        public void mo17051c(int i, int i2, int i3) {
            int i4;
            C8040e eVar;
            if (i < i2) {
                eVar = this.f10085a;
                i4 = i | i3;
            } else {
                this.f10085a.mo25940v0(i3 | i2);
                i4 = i - i2;
                while (i4 >= 128) {
                    this.f10085a.mo25940v0(128 | (i4 & 127));
                    i4 >>>= 7;
                }
                eVar = this.f10085a;
            }
            eVar.mo25940v0(i4);
        }
    }

    static {
        C5159l lVar = new C5159l(C5159l.f10064h, "");
        int i = 0;
        C8044h hVar = C5159l.f10061e;
        C8044h hVar2 = C5159l.f10062f;
        C8044h hVar3 = C5159l.f10063g;
        C8044h hVar4 = C5159l.f10060d;
        C5159l[] lVarArr = {lVar, new C5159l(hVar, "GET"), new C5159l(hVar, "POST"), new C5159l(hVar2, "/"), new C5159l(hVar2, "/index.html"), new C5159l(hVar3, "http"), new C5159l(hVar3, "https"), new C5159l(hVar4, "200"), new C5159l(hVar4, "204"), new C5159l(hVar4, "206"), new C5159l(hVar4, "304"), new C5159l(hVar4, "400"), new C5159l(hVar4, "404"), new C5159l(hVar4, "500"), new C5159l("accept-charset", ""), new C5159l("accept-encoding", "gzip, deflate"), new C5159l("accept-language", ""), new C5159l("accept-ranges", ""), new C5159l("accept", ""), new C5159l("access-control-allow-origin", ""), new C5159l("age", ""), new C5159l("allow", ""), new C5159l("authorization", ""), new C5159l("cache-control", ""), new C5159l("content-disposition", ""), new C5159l("content-encoding", ""), new C5159l("content-language", ""), new C5159l("content-length", ""), new C5159l("content-location", ""), new C5159l("content-range", ""), new C5159l("content-type", ""), new C5159l("cookie", ""), new C5159l("date", ""), new C5159l("etag", ""), new C5159l("expect", ""), new C5159l("expires", ""), new C5159l("from", ""), new C5159l("host", ""), new C5159l("if-match", ""), new C5159l("if-modified-since", ""), new C5159l("if-none-match", ""), new C5159l("if-range", ""), new C5159l("if-unmodified-since", ""), new C5159l("last-modified", ""), new C5159l("link", ""), new C5159l("location", ""), new C5159l("max-forwards", ""), new C5159l("proxy-authenticate", ""), new C5159l("proxy-authorization", ""), new C5159l("range", ""), new C5159l("referer", ""), new C5159l("refresh", ""), new C5159l("retry-after", ""), new C5159l("server", ""), new C5159l("set-cookie", ""), new C5159l("strict-transport-security", ""), new C5159l("transfer-encoding", ""), new C5159l("user-agent", ""), new C5159l("vary", ""), new C5159l("via", ""), new C5159l("www-authenticate", "")};
        f10075a = lVarArr;
        LinkedHashMap linkedHashMap = new LinkedHashMap(lVarArr.length);
        while (true) {
            C5159l[] lVarArr2 = f10075a;
            if (i < lVarArr2.length) {
                if (!linkedHashMap.containsKey(lVarArr2[i].f10067a)) {
                    linkedHashMap.put(lVarArr2[i].f10067a, Integer.valueOf(i));
                }
                i++;
            } else {
                f10076b = Collections.unmodifiableMap(linkedHashMap);
                return;
            }
        }
    }

    /* renamed from: a */
    public static C8044h m9528a(C8044h hVar) {
        int l = hVar.mo25959l();
        int i = 0;
        while (i < l) {
            byte s = hVar.mo25962s(i);
            if (s < 65 || s > 90) {
                i++;
            } else {
                StringBuilder u = C0843a.m460u("PROTOCOL_ERROR response malformed: mixed case name: ");
                u.append(hVar.mo25968z());
                throw new IOException(u.toString());
            }
        }
        return hVar;
    }
}
