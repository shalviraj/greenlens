package p005b.p280p.p285b.p286a0.p287j;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.Inflater;
import p005b.p035e.p036a.p037a.C0843a;
import p005b.p291q.p292a.C5266a;
import p435n.C8030a0;
import p435n.C8040e;
import p435n.C8043g;
import p435n.C8044h;
import p435n.C8048k;
import p435n.C8051n;

/* renamed from: b.p.b.a0.j.q */
public class C5171q {

    /* renamed from: a */
    public final C8051n f10114a;

    /* renamed from: b */
    public int f10115b;

    /* renamed from: c */
    public final C8043g f10116c;

    /* renamed from: b.p.b.a0.j.q$a */
    public class C5172a extends C8048k {
        public C5172a(C8030a0 a0Var) {
            super(a0Var);
        }

        /* renamed from: T */
        public long mo17031T(C8040e eVar, long j) {
            int i = C5171q.this.f10115b;
            if (i == 0) {
                return -1;
            }
            long T = super.mo17031T(eVar, Math.min(j, (long) i));
            if (T == -1) {
                return -1;
            }
            C5171q qVar = C5171q.this;
            qVar.f10115b = (int) (((long) qVar.f10115b) - T);
            return T;
        }
    }

    /* renamed from: b.p.b.a0.j.q$b */
    public class C5173b extends Inflater {
        public C5173b(C5171q qVar) {
        }

        public int inflate(byte[] bArr, int i, int i2) {
            int inflate = super.inflate(bArr, i, i2);
            if (inflate != 0 || !needsDictionary()) {
                return inflate;
            }
            setDictionary(C5178u.f10124a);
            return super.inflate(bArr, i, i2);
        }
    }

    public C5171q(C8043g gVar) {
        C8051n nVar = new C8051n((C8030a0) new C5172a(gVar), (Inflater) new C5173b(this));
        this.f10114a = nVar;
        this.f10116c = C5266a.m9812H(nVar);
    }

    /* renamed from: a */
    public List<C5159l> mo17060a(int i) {
        this.f10115b += i;
        int readInt = this.f10116c.readInt();
        if (readInt < 0) {
            throw new IOException(C0843a.m444e("numberOfPairs < 0: ", readInt));
        } else if (readInt <= 1024) {
            ArrayList arrayList = new ArrayList(readInt);
            int i2 = 0;
            while (i2 < readInt) {
                C8044h x = this.f10116c.mo25922p((long) this.f10116c.readInt()).mo25966x();
                C8044h p = this.f10116c.mo25922p((long) this.f10116c.readInt());
                if (x.mo25959l() != 0) {
                    arrayList.add(new C5159l(x, p));
                    i2++;
                } else {
                    throw new IOException("name.size == 0");
                }
            }
            if (this.f10115b > 0) {
                this.f10114a.mo25977d();
                if (this.f10115b != 0) {
                    StringBuilder u = C0843a.m460u("compressedLimit > 0: ");
                    u.append(this.f10115b);
                    throw new IOException(u.toString());
                }
            }
            return arrayList;
        } else {
            throw new IOException(C0843a.m444e("numberOfPairs > 1024: ", readInt));
        }
    }
}
