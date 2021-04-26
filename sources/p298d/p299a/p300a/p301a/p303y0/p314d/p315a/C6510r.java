package p298d.p299a.p300a.p301a.p303y0.p314d.p315a;

import java.util.Arrays;
import java.util.Set;
import p005b.p035e.p036a.p037a.C0843a;
import p298d.p299a.p300a.p301a.p303y0.p314d.p315a.p322j0.C6420g;
import p298d.p299a.p300a.p301a.p303y0.p314d.p315a.p322j0.C6433t;
import p298d.p299a.p300a.p301a.p303y0.p331f.C6713a;
import p298d.p299a.p300a.p301a.p303y0.p331f.C6714b;
import p298d.p344x.p346c.C6888i;

/* renamed from: d.a.a.a.y0.d.a.r */
public interface C6510r {

    /* renamed from: d.a.a.a.y0.d.a.r$a */
    public static final class C6511a {

        /* renamed from: a */
        public final C6713a f12755a;

        /* renamed from: b */
        public final byte[] f12756b;

        /* renamed from: c */
        public final C6420g f12757c;

        public C6511a(C6713a aVar, byte[] bArr, C6420g gVar, int i) {
            int i2 = i & 2;
            gVar = (i & 4) != 0 ? null : gVar;
            C6888i.m12438e(aVar, "classId");
            this.f12755a = aVar;
            this.f12756b = null;
            this.f12757c = gVar;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C6511a)) {
                return false;
            }
            C6511a aVar = (C6511a) obj;
            return C6888i.m12434a(this.f12755a, aVar.f12755a) && C6888i.m12434a(this.f12756b, aVar.f12756b) && C6888i.m12434a(this.f12757c, aVar.f12757c);
        }

        public int hashCode() {
            int hashCode = this.f12755a.hashCode() * 31;
            byte[] bArr = this.f12756b;
            int i = 0;
            int hashCode2 = (hashCode + (bArr == null ? 0 : Arrays.hashCode(bArr))) * 31;
            C6420g gVar = this.f12757c;
            if (gVar != null) {
                i = gVar.hashCode();
            }
            return hashCode2 + i;
        }

        public String toString() {
            StringBuilder u = C0843a.m460u("Request(classId=");
            u.append(this.f12755a);
            u.append(", previouslyFoundClassFileContent=");
            u.append(Arrays.toString(this.f12756b));
            u.append(", outerClass=");
            u.append(this.f12757c);
            u.append(')');
            return u.toString();
        }
    }

    /* renamed from: a */
    C6433t mo23319a(C6714b bVar);

    /* renamed from: b */
    C6420g mo23320b(C6511a aVar);

    /* renamed from: c */
    Set<String> mo23321c(C6714b bVar);
}
