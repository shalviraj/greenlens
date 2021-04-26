package p421m.p434n0;

import androidx.recyclerview.widget.RecyclerView;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import p005b.p035e.p036a.p037a.C0843a;
import p005b.p291q.p292a.C5266a;
import p298d.p334t.C6800r;
import p298d.p344x.p346c.C6888i;
import p298d.p415c0.C7694h;
import p421m.C7826a0;
import p421m.C7829b0;
import p421m.C7835d0;
import p421m.C7839e0;
import p421m.C7844g0;
import p421m.C7850h0;
import p421m.C7855j0;
import p421m.C7861l;
import p421m.C8022y;
import p421m.p422m0.p426g.C7894i;
import p421m.p422m0.p427h.C7907e;
import p421m.p422m0.p427h.C7909g;
import p435n.C8040e;
import p435n.C8043g;
import p435n.C8050m;

/* renamed from: m.n0.a */
public final class C8004a implements C7826a0 {

    /* renamed from: a */
    public volatile Set<String> f16056a;

    /* renamed from: b */
    public volatile C8005a f16057b;

    /* renamed from: c */
    public final C8006b f16058c;

    /* renamed from: m.n0.a$a */
    public enum C8005a {
        NONE,
        HEADERS,
        BODY
    }

    /* renamed from: m.n0.a$b */
    public interface C8006b {

        /* renamed from: a */
        public static final C8006b f16063a = new C8007b();

        /* renamed from: a */
        void mo25815a(String str);
    }

    public C8004a(C8006b bVar, int i) {
        C8006b bVar2 = (i & 1) != 0 ? C8006b.f16063a : null;
        C6888i.m12438e(bVar2, "logger");
        this.f16058c = bVar2;
        this.f16056a = C6800r.f13715g;
        this.f16057b = C8005a.NONE;
    }

    /* renamed from: a */
    public C7850h0 mo18360a(C7826a0.C7827a aVar) {
        String str;
        String str2;
        String str3;
        char c;
        String str4;
        String str5;
        String str6;
        C8006b bVar;
        Charset charset;
        String str7;
        Throwable th;
        C8006b bVar2;
        String str8;
        String str9;
        StringBuilder sb;
        C8006b bVar3;
        Charset charset2;
        StringBuilder sb2;
        C7826a0.C7827a aVar2 = aVar;
        C6888i.m12438e(aVar2, "chain");
        C8005a aVar3 = this.f16057b;
        C7909g gVar = (C7909g) aVar2;
        C7839e0 e0Var = gVar.f15764f;
        if (aVar3 == C8005a.NONE) {
            return gVar.mo25663c(e0Var);
        }
        boolean z = aVar3 == C8005a.BODY;
        boolean z2 = z || aVar3 == C8005a.HEADERS;
        C7844g0 g0Var = e0Var.f15531e;
        C7861l a = gVar.mo25662a();
        StringBuilder u = C0843a.m460u("--> ");
        u.append(e0Var.f15529c);
        u.append(' ');
        u.append(e0Var.f15528b);
        if (a != null) {
            StringBuilder u2 = C0843a.m460u(" ");
            C7835d0 d0Var = ((C7894i) a).f15717e;
            C6888i.m12436c(d0Var);
            u2.append(d0Var);
            str = u2.toString();
        } else {
            str = "";
        }
        u.append(str);
        String sb3 = u.toString();
        if (!z2 && g0Var != null) {
            StringBuilder y = C0843a.m464y(sb3, " (");
            y.append(g0Var.mo25542a());
            y.append("-byte body)");
            sb3 = y.toString();
        }
        this.f16058c.mo25815a(sb3);
        if (z2) {
            C8022y yVar = e0Var.f15530d;
            if (g0Var != null) {
                C7829b0 b = g0Var.mo25543b();
                if (b != null && yVar.mo25836e("Content-Type") == null) {
                    this.f16058c.mo25815a("Content-Type: " + b);
                }
                if (g0Var.mo25542a() != -1 && yVar.mo25836e("Content-Length") == null) {
                    C8006b bVar4 = this.f16058c;
                    StringBuilder u3 = C0843a.m460u("Content-Length: ");
                    u3.append(g0Var.mo25542a());
                    bVar4.mo25815a(u3.toString());
                }
            }
            int size = yVar.size();
            for (int i = 0; i < size; i++) {
                mo25814c(yVar, i);
            }
            if (!z || g0Var == null) {
                bVar3 = this.f16058c;
                sb = C0843a.m460u("--> END ");
                str9 = e0Var.f15529c;
            } else if (mo25813b(e0Var.f15530d)) {
                bVar3 = this.f16058c;
                sb = C0843a.m460u("--> END ");
                sb.append(e0Var.f15529c);
                str9 = " (encoded body omitted)";
            } else {
                C8040e eVar = new C8040e();
                g0Var.mo25544c(eVar);
                C7829b0 b2 = g0Var.mo25543b();
                if (b2 == null || (charset2 = b2.mo25521a(StandardCharsets.UTF_8)) == null) {
                    charset2 = StandardCharsets.UTF_8;
                    C6888i.m12437d(charset2, "UTF_8");
                }
                this.f16058c.mo25815a("");
                if (C5266a.m9809G2(eVar)) {
                    this.f16058c.mo25815a(eVar.mo25913j0(charset2));
                    bVar2 = this.f16058c;
                    sb2 = C0843a.m460u("--> END ");
                    sb2.append(e0Var.f15529c);
                    sb2.append(" (");
                    sb2.append(g0Var.mo25542a());
                    sb2.append("-byte body)");
                } else {
                    bVar2 = this.f16058c;
                    sb2 = C0843a.m460u("--> END ");
                    sb2.append(e0Var.f15529c);
                    sb2.append(" (binary ");
                    sb2.append(g0Var.mo25542a());
                    sb2.append("-byte body omitted)");
                }
                str8 = sb2.toString();
                bVar2.mo25815a(str8);
            }
            sb.append(str9);
            bVar2 = bVar3;
            str8 = sb.toString();
            bVar2.mo25815a(str8);
        }
        long nanoTime = System.nanoTime();
        try {
            C7850h0 c2 = gVar.mo25663c(e0Var);
            long millis = TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - nanoTime);
            C7855j0 j0Var = c2.f15555m;
            C6888i.m12436c(j0Var);
            long d = j0Var.mo25565d();
            if (d != -1) {
                str2 = d + "-byte";
            } else {
                str2 = "unknown-length";
            }
            C8006b bVar5 = this.f16058c;
            String str10 = "-byte body)";
            StringBuilder u4 = C0843a.m460u("<-- ");
            long j = d;
            u4.append(c2.f15552j);
            if (c2.f15551i.length() == 0) {
                c = ' ';
                str3 = "-byte body omitted)";
                str4 = "";
            } else {
                String str11 = c2.f15551i;
                StringBuilder sb4 = new StringBuilder();
                str3 = "-byte body omitted)";
                sb4.append(String.valueOf(' '));
                sb4.append(str11);
                str4 = sb4.toString();
                c = ' ';
            }
            u4.append(str4);
            u4.append(c);
            u4.append(c2.f15549g.f15528b);
            u4.append(" (");
            u4.append(millis);
            u4.append("ms");
            if (!z2) {
                str5 = C0843a.m452m(", ", str2, " body");
            } else {
                str5 = "";
            }
            u4.append(str5);
            u4.append(')');
            bVar5.mo25815a(u4.toString());
            if (z2) {
                C8022y yVar2 = c2.f15554l;
                int size2 = yVar2.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    mo25814c(yVar2, i2);
                }
                if (!z || !C7907e.m14391a(c2)) {
                    bVar = this.f16058c;
                    str6 = "<-- END HTTP";
                } else if (mo25813b(c2.f15554l)) {
                    bVar = this.f16058c;
                    str6 = "<-- END HTTP (encoded body omitted)";
                } else {
                    C8043g q = j0Var.mo25567q();
                    q.mo25935t(RecyclerView.FOREVER_NS);
                    C8040e c3 = q.mo25901c();
                    Long l = null;
                    if (C7694h.m13928f("gzip", yVar2.mo25836e("Content-Encoding"), true)) {
                        Long valueOf = Long.valueOf(c3.f16140h);
                        C8050m mVar = new C8050m(c3.clone());
                        try {
                            c3 = new C8040e();
                            c3.mo25918n(mVar);
                            C5266a.m9877S(mVar, (Throwable) null);
                            l = valueOf;
                        } catch (Throwable th2) {
                            Throwable th3 = th2;
                            C5266a.m9877S(mVar, th);
                            throw th3;
                        }
                    }
                    C7829b0 e = j0Var.mo25566e();
                    if (e == null || (charset = e.mo25521a(StandardCharsets.UTF_8)) == null) {
                        charset = StandardCharsets.UTF_8;
                        C6888i.m12437d(charset, "UTF_8");
                    }
                    if (!C5266a.m9809G2(c3)) {
                        this.f16058c.mo25815a("");
                        C8006b bVar6 = this.f16058c;
                        StringBuilder u5 = C0843a.m460u("<-- END HTTP (binary ");
                        u5.append(c3.f16140h);
                        u5.append(str3);
                        bVar6.mo25815a(u5.toString());
                        return c2;
                    }
                    if (j != 0) {
                        this.f16058c.mo25815a("");
                        this.f16058c.mo25815a(c3.clone().mo25913j0(charset));
                    }
                    C8006b bVar7 = this.f16058c;
                    StringBuilder u6 = C0843a.m460u("<-- END HTTP (");
                    if (l != null) {
                        u6.append(c3.f16140h);
                        u6.append("-byte, ");
                        u6.append(l);
                        str7 = "-gzipped-byte body)";
                    } else {
                        u6.append(c3.f16140h);
                        str7 = str10;
                    }
                    u6.append(str7);
                    bVar7.mo25815a(u6.toString());
                }
                bVar.mo25815a(str6);
            }
            return c2;
        } catch (Exception e2) {
            Exception exc = e2;
            this.f16058c.mo25815a("<-- HTTP FAILED: " + exc);
            throw exc;
        }
    }

    /* renamed from: b */
    public final boolean mo25813b(C8022y yVar) {
        String e = yVar.mo25836e("Content-Encoding");
        return e != null && !C7694h.m13928f(e, "identity", true) && !C7694h.m13928f(e, "gzip", true);
    }

    /* renamed from: c */
    public final void mo25814c(C8022y yVar, int i) {
        String str;
        int i2 = i * 2;
        if (this.f16056a.contains(yVar.f16098g[i2])) {
            str = "██";
        } else {
            str = yVar.f16098g[i2 + 1];
        }
        C8006b bVar = this.f16058c;
        bVar.mo25815a(yVar.f16098g[i2] + ": " + str);
    }
}
