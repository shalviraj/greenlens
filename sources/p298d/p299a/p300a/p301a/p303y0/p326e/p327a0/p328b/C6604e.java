package p298d.p299a.p300a.p301a.p303y0.p326e.p327a0.p328b;

import kotlin.jvm.internal.DefaultConstructorMarker;
import p298d.p344x.p346c.C6888i;

/* renamed from: d.a.a.a.y0.e.a0.b.e */
public abstract class C6604e {

    /* renamed from: d.a.a.a.y0.e.a0.b.e$a */
    public static final class C6605a extends C6604e {

        /* renamed from: a */
        public final String f13001a;

        /* renamed from: b */
        public final String f13002b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C6605a(String str, String str2) {
            super((DefaultConstructorMarker) null);
            C6888i.m12438e(str, "name");
            C6888i.m12438e(str2, "desc");
            this.f13001a = str;
            this.f13002b = str2;
        }

        /* renamed from: a */
        public String mo23716a() {
            return this.f13001a + ':' + this.f13002b;
        }

        /* renamed from: b */
        public String mo23717b() {
            return this.f13002b;
        }

        /* renamed from: c */
        public String mo23718c() {
            return this.f13001a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C6605a)) {
                return false;
            }
            C6605a aVar = (C6605a) obj;
            return C6888i.m12434a(this.f13001a, aVar.f13001a) && C6888i.m12434a(this.f13002b, aVar.f13002b);
        }

        public int hashCode() {
            return this.f13002b.hashCode() + (this.f13001a.hashCode() * 31);
        }
    }

    /* renamed from: d.a.a.a.y0.e.a0.b.e$b */
    public static final class C6606b extends C6604e {

        /* renamed from: a */
        public final String f13003a;

        /* renamed from: b */
        public final String f13004b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C6606b(String str, String str2) {
            super((DefaultConstructorMarker) null);
            C6888i.m12438e(str, "name");
            C6888i.m12438e(str2, "desc");
            this.f13003a = str;
            this.f13004b = str2;
        }

        /* renamed from: a */
        public String mo23716a() {
            return C6888i.m12444k(this.f13003a, this.f13004b);
        }

        /* renamed from: b */
        public String mo23717b() {
            return this.f13004b;
        }

        /* renamed from: c */
        public String mo23718c() {
            return this.f13003a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C6606b)) {
                return false;
            }
            C6606b bVar = (C6606b) obj;
            return C6888i.m12434a(this.f13003a, bVar.f13003a) && C6888i.m12434a(this.f13004b, bVar.f13004b);
        }

        public int hashCode() {
            return this.f13004b.hashCode() + (this.f13003a.hashCode() * 31);
        }
    }

    public C6604e(DefaultConstructorMarker defaultConstructorMarker) {
    }

    /* renamed from: a */
    public abstract String mo23716a();

    /* renamed from: b */
    public abstract String mo23717b();

    /* renamed from: c */
    public abstract String mo23718c();

    public final String toString() {
        return mo23716a();
    }
}
