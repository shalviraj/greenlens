package p298d.p299a.p300a.p301a.p303y0.p326e.p330z;

import kotlin.jvm.internal.DefaultConstructorMarker;
import p005b.p035e.p036a.p037a.C0843a;
import p298d.C6760b;
import p298d.p299a.p300a.p301a.p303y0.p326e.C6687v;
import p298d.p344x.p346c.C6888i;

/* renamed from: d.a.a.a.y0.e.z.f */
public final class C6708f {

    /* renamed from: a */
    public final C6709a f13597a;

    /* renamed from: b */
    public final C6687v.C6691d f13598b;

    /* renamed from: c */
    public final C6760b f13599c;

    /* renamed from: d */
    public final Integer f13600d;

    /* renamed from: e */
    public final String f13601e;

    /* renamed from: d.a.a.a.y0.e.z.f$a */
    public static final class C6709a {

        /* renamed from: d */
        public static final C6710a f13602d = new C6710a((DefaultConstructorMarker) null);

        /* renamed from: e */
        public static final C6709a f13603e = new C6709a(256, 256, 256);

        /* renamed from: a */
        public final int f13604a;

        /* renamed from: b */
        public final int f13605b;

        /* renamed from: c */
        public final int f13606c;

        /* renamed from: d.a.a.a.y0.e.z.f$a$a */
        public static final class C6710a {
            public C6710a(DefaultConstructorMarker defaultConstructorMarker) {
            }
        }

        public C6709a(int i, int i2, int i3) {
            this.f13604a = i;
            this.f13605b = i2;
            this.f13606c = i3;
        }

        public C6709a(int i, int i2, int i3, int i4) {
            i3 = (i4 & 4) != 0 ? 0 : i3;
            this.f13604a = i;
            this.f13605b = i2;
            this.f13606c = i3;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C6709a)) {
                return false;
            }
            C6709a aVar = (C6709a) obj;
            return this.f13604a == aVar.f13604a && this.f13605b == aVar.f13605b && this.f13606c == aVar.f13606c;
        }

        public int hashCode() {
            return (((this.f13604a * 31) + this.f13605b) * 31) + this.f13606c;
        }

        public String toString() {
            int i;
            StringBuilder sb;
            if (this.f13606c == 0) {
                sb = new StringBuilder();
                sb.append(this.f13604a);
                sb.append('.');
                i = this.f13605b;
            } else {
                sb = new StringBuilder();
                sb.append(this.f13604a);
                sb.append('.');
                sb.append(this.f13605b);
                sb.append('.');
                i = this.f13606c;
            }
            sb.append(i);
            return sb.toString();
        }
    }

    public C6708f(C6709a aVar, C6687v.C6691d dVar, C6760b bVar, Integer num, String str) {
        C6888i.m12438e(aVar, "version");
        C6888i.m12438e(dVar, "kind");
        C6888i.m12438e(bVar, "level");
        this.f13597a = aVar;
        this.f13598b = dVar;
        this.f13599c = bVar;
        this.f13600d = num;
        this.f13601e = str;
    }

    public String toString() {
        StringBuilder u = C0843a.m460u("since ");
        u.append(this.f13597a);
        u.append(' ');
        u.append(this.f13599c);
        Integer num = this.f13600d;
        String str = "";
        u.append(num != null ? C6888i.m12444k(" error ", num) : str);
        String str2 = this.f13601e;
        if (str2 != null) {
            str = C6888i.m12444k(": ", str2);
        }
        u.append(str);
        return u.toString();
    }
}
