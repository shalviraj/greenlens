package p421m;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLSocket;
import p005b.p035e.p036a.p037a.C0843a;
import p298d.p334t.C6790h;
import p298d.p336u.C6818a;
import p298d.p344x.p346c.C6888i;
import p421m.C7857k;
import p421m.p422m0.C7867c;

/* renamed from: m.n */
public final class C8002n {

    /* renamed from: e */
    public static final C7857k[] f16044e;

    /* renamed from: f */
    public static final C7857k[] f16045f;

    /* renamed from: g */
    public static final C8002n f16046g;

    /* renamed from: h */
    public static final C8002n f16047h = new C8002n(false, false, (String[]) null, (String[]) null);

    /* renamed from: a */
    public final boolean f16048a;

    /* renamed from: b */
    public final boolean f16049b;

    /* renamed from: c */
    public final String[] f16050c;

    /* renamed from: d */
    public final String[] f16051d;

    /* renamed from: m.n$a */
    public static final class C8003a {

        /* renamed from: a */
        public boolean f16052a;

        /* renamed from: b */
        public String[] f16053b;

        /* renamed from: c */
        public String[] f16054c;

        /* renamed from: d */
        public boolean f16055d;

        public C8003a(C8002n nVar) {
            C6888i.m12438e(nVar, "connectionSpec");
            this.f16052a = nVar.f16048a;
            this.f16053b = nVar.f16050c;
            this.f16054c = nVar.f16051d;
            this.f16055d = nVar.f16049b;
        }

        public C8003a(boolean z) {
            this.f16052a = z;
        }

        /* renamed from: a */
        public final C8002n mo25807a() {
            return new C8002n(this.f16052a, this.f16055d, this.f16053b, this.f16054c);
        }

        /* renamed from: b */
        public final C8003a mo25808b(String... strArr) {
            C6888i.m12438e(strArr, "cipherSuites");
            if (this.f16052a) {
                if (!(strArr.length == 0)) {
                    Object clone = strArr.clone();
                    Objects.requireNonNull(clone, "null cannot be cast to non-null type kotlin.Array<kotlin.String>");
                    this.f16053b = (String[]) clone;
                    return this;
                }
                throw new IllegalArgumentException("At least one cipher suite is required".toString());
            }
            throw new IllegalArgumentException("no cipher suites for cleartext connections".toString());
        }

        /* renamed from: c */
        public final C8003a mo25809c(C7857k... kVarArr) {
            C6888i.m12438e(kVarArr, "cipherSuites");
            if (this.f16052a) {
                ArrayList arrayList = new ArrayList(kVarArr.length);
                for (C7857k kVar : kVarArr) {
                    arrayList.add(kVar.f15603a);
                }
                Object[] array = arrayList.toArray(new String[0]);
                Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
                String[] strArr = (String[]) array;
                mo25808b((String[]) Arrays.copyOf(strArr, strArr.length));
                return this;
            }
            throw new IllegalArgumentException("no cipher suites for cleartext connections".toString());
        }

        /* renamed from: d */
        public final C8003a mo25810d(boolean z) {
            if (this.f16052a) {
                this.f16055d = z;
                return this;
            }
            throw new IllegalArgumentException("no TLS extensions for cleartext connections".toString());
        }

        /* renamed from: e */
        public final C8003a mo25811e(String... strArr) {
            C6888i.m12438e(strArr, "tlsVersions");
            if (this.f16052a) {
                if (!(strArr.length == 0)) {
                    Object clone = strArr.clone();
                    Objects.requireNonNull(clone, "null cannot be cast to non-null type kotlin.Array<kotlin.String>");
                    this.f16054c = (String[]) clone;
                    return this;
                }
                throw new IllegalArgumentException("At least one TLS version is required".toString());
            }
            throw new IllegalArgumentException("no TLS versions for cleartext connections".toString());
        }

        /* renamed from: f */
        public final C8003a mo25812f(C7862l0... l0VarArr) {
            C6888i.m12438e(l0VarArr, "tlsVersions");
            if (this.f16052a) {
                ArrayList arrayList = new ArrayList(l0VarArr.length);
                for (C7862l0 l0Var : l0VarArr) {
                    arrayList.add(l0Var.f15614g);
                }
                Object[] array = arrayList.toArray(new String[0]);
                Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
                String[] strArr = (String[]) array;
                mo25811e((String[]) Arrays.copyOf(strArr, strArr.length));
                return this;
            }
            throw new IllegalArgumentException("no TLS versions for cleartext connections".toString());
        }
    }

    static {
        C7857k kVar = C7857k.f15599q;
        C7857k kVar2 = C7857k.f15600r;
        C7857k kVar3 = C7857k.f15601s;
        C7857k kVar4 = C7857k.f15593k;
        C7857k kVar5 = C7857k.f15595m;
        C7857k kVar6 = C7857k.f15594l;
        C7857k kVar7 = C7857k.f15596n;
        C7857k kVar8 = C7857k.f15598p;
        C7857k kVar9 = C7857k.f15597o;
        C7857k[] kVarArr = {kVar, kVar2, kVar3, kVar4, kVar5, kVar6, kVar7, kVar8, kVar9};
        f16044e = kVarArr;
        C7857k[] kVarArr2 = {kVar, kVar2, kVar3, kVar4, kVar5, kVar6, kVar7, kVar8, kVar9, C7857k.f15591i, C7857k.f15592j, C7857k.f15589g, C7857k.f15590h, C7857k.f15587e, C7857k.f15588f, C7857k.f15586d};
        f16045f = kVarArr2;
        C8003a aVar = new C8003a(true);
        aVar.mo25809c((C7857k[]) Arrays.copyOf(kVarArr, kVarArr.length));
        C7862l0 l0Var = C7862l0.TLS_1_3;
        C7862l0 l0Var2 = C7862l0.TLS_1_2;
        aVar.mo25812f(l0Var, l0Var2);
        aVar.mo25810d(true);
        aVar.mo25807a();
        C8003a aVar2 = new C8003a(true);
        aVar2.mo25809c((C7857k[]) Arrays.copyOf(kVarArr2, kVarArr2.length));
        aVar2.mo25812f(l0Var, l0Var2);
        aVar2.mo25810d(true);
        f16046g = aVar2.mo25807a();
        C8003a aVar3 = new C8003a(true);
        aVar3.mo25809c((C7857k[]) Arrays.copyOf(kVarArr2, kVarArr2.length));
        aVar3.mo25812f(l0Var, l0Var2, C7862l0.TLS_1_1, C7862l0.TLS_1_0);
        aVar3.mo25810d(true);
        aVar3.mo25807a();
    }

    public C8002n(boolean z, boolean z2, String[] strArr, String[] strArr2) {
        this.f16048a = z;
        this.f16049b = z2;
        this.f16050c = strArr;
        this.f16051d = strArr2;
    }

    /* renamed from: a */
    public final List<C7857k> mo25801a() {
        String[] strArr = this.f16050c;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String b : strArr) {
            arrayList.add(C7857k.f15602t.mo25575b(b));
        }
        return C6790h.m12337X(arrayList);
    }

    /* renamed from: b */
    public final boolean mo25802b(SSLSocket sSLSocket) {
        C6888i.m12438e(sSLSocket, "socket");
        if (!this.f16048a) {
            return false;
        }
        String[] strArr = this.f16051d;
        if (strArr != null && !C7867c.m14289j(strArr, sSLSocket.getEnabledProtocols(), C6818a.f13743g)) {
            return false;
        }
        String[] strArr2 = this.f16050c;
        if (strArr2 == null) {
            return true;
        }
        String[] enabledCipherSuites = sSLSocket.getEnabledCipherSuites();
        C7857k.C7859b bVar = C7857k.f15602t;
        Comparator<String> comparator = C7857k.f15584b;
        if (!C7867c.m14289j(strArr2, enabledCipherSuites, C7857k.f15584b)) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public final List<C7862l0> mo25803c() {
        String[] strArr = this.f16051d;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String a : strArr) {
            arrayList.add(C7862l0.f15613n.mo25581a(a));
        }
        return C6790h.m12337X(arrayList);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C8002n)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        boolean z = this.f16048a;
        C8002n nVar = (C8002n) obj;
        if (z != nVar.f16048a) {
            return false;
        }
        return !z || (Arrays.equals(this.f16050c, nVar.f16050c) && Arrays.equals(this.f16051d, nVar.f16051d) && this.f16049b == nVar.f16049b);
    }

    public int hashCode() {
        if (!this.f16048a) {
            return 17;
        }
        String[] strArr = this.f16050c;
        int i = 0;
        int hashCode = (527 + (strArr != null ? Arrays.hashCode(strArr) : 0)) * 31;
        String[] strArr2 = this.f16051d;
        if (strArr2 != null) {
            i = Arrays.hashCode(strArr2);
        }
        return ((hashCode + i) * 31) + (this.f16049b ^ true ? 1 : 0);
    }

    public String toString() {
        if (!this.f16048a) {
            return "ConnectionSpec()";
        }
        StringBuilder y = C0843a.m464y("ConnectionSpec(", "cipherSuites=");
        y.append(Objects.toString(mo25801a(), "[all enabled]"));
        y.append(", ");
        y.append("tlsVersions=");
        y.append(Objects.toString(mo25803c(), "[all enabled]"));
        y.append(", ");
        y.append("supportsTlsExtensions=");
        y.append(this.f16049b);
        y.append(')');
        return y.toString();
    }
}
