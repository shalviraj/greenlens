package p421m.p422m0.p424e;

import androidx.core.app.NotificationCompat;
import java.util.ArrayList;
import java.util.Objects;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p005b.p035e.p036a.p037a.C0843a;
import p298d.p344x.p346c.C6888i;
import p298d.p415c0.C7694h;
import p421m.C7826a0;
import p421m.C7835d0;
import p421m.C7839e0;
import p421m.C7850h0;
import p421m.C7855j0;
import p421m.C8020x;
import p421m.C8022y;
import p421m.p422m0.C7867c;
import p421m.p422m0.p426g.C7883c;
import p421m.p422m0.p426g.C7887e;
import p421m.p422m0.p427h.C7909g;

/* renamed from: m.m0.e.a */
public final class C7870a implements C7826a0 {

    /* renamed from: a */
    public static final C7871a f15628a = new C7871a((DefaultConstructorMarker) null);

    /* renamed from: m.m0.e.a$a */
    public static final class C7871a {
        public C7871a(DefaultConstructorMarker defaultConstructorMarker) {
        }

        /* renamed from: a */
        public static final C7850h0 m14309a(C7871a aVar, C7850h0 h0Var) {
            C7850h0 h0Var2 = h0Var;
            if ((h0Var2 != null ? h0Var2.f15555m : null) == null) {
                return h0Var2;
            }
            Objects.requireNonNull(h0Var);
            C6888i.m12438e(h0Var2, "response");
            C7839e0 e0Var = h0Var2.f15549g;
            C7835d0 d0Var = h0Var2.f15550h;
            int i = h0Var2.f15552j;
            String str = h0Var2.f15551i;
            C8020x xVar = h0Var2.f15553k;
            C8022y.C8023a n = h0Var2.f15554l.mo25841n();
            C7850h0 h0Var3 = h0Var2.f15556n;
            C7850h0 h0Var4 = h0Var2.f15557o;
            C7850h0 h0Var5 = h0Var2.f15558p;
            long j = h0Var2.f15559q;
            long j2 = h0Var2.f15560r;
            C7883c cVar = h0Var2.f15561s;
            if (!(i >= 0)) {
                throw new IllegalStateException(C0843a.m444e("code < 0: ", i).toString());
            } else if (e0Var == null) {
                throw new IllegalStateException("request == null".toString());
            } else if (d0Var == null) {
                throw new IllegalStateException("protocol == null".toString());
            } else if (str != null) {
                return new C7850h0(e0Var, d0Var, str, i, xVar, n.mo25846b(), (C7855j0) null, h0Var3, h0Var4, h0Var5, j, j2, cVar);
            } else {
                throw new IllegalStateException("message == null".toString());
            }
        }

        /* renamed from: b */
        public final boolean mo25585b(String str) {
            return C7694h.m13928f("Content-Length", str, true) || C7694h.m13928f("Content-Encoding", str, true) || C7694h.m13928f("Content-Type", str, true);
        }

        /* renamed from: c */
        public final boolean mo25586c(String str) {
            return !C7694h.m13928f("Connection", str, true) && !C7694h.m13928f("Keep-Alive", str, true) && !C7694h.m13928f("Proxy-Authenticate", str, true) && !C7694h.m13928f("Proxy-Authorization", str, true) && !C7694h.m13928f("TE", str, true) && !C7694h.m13928f("Trailers", str, true) && !C7694h.m13928f("Transfer-Encoding", str, true) && !C7694h.m13928f("Upgrade", str, true);
        }
    }

    /* JADX WARNING: type inference failed for: r0v7, types: [java.lang.Throwable, m.d, java.lang.Object] */
    /* renamed from: a */
    public C7850h0 mo18360a(C7826a0.C7827a aVar) {
        C8022y yVar;
        C7826a0.C7827a aVar2 = aVar;
        C6888i.m12438e(aVar2, "chain");
        C7909g gVar = (C7909g) aVar2;
        C7887e eVar = gVar.f15760b;
        System.currentTimeMillis();
        C7839e0 e0Var = gVar.f15764f;
        C6888i.m12438e(e0Var, "request");
        C7872b bVar = new C7872b(e0Var, (C7850h0) null);
        if (e0Var != null && e0Var.mo25532a().f15523j) {
            bVar = new C7872b((C7839e0) null, (C7850h0) null);
        }
        C7839e0 e0Var2 = bVar.f15629a;
        C7850h0 h0Var = bVar.f15630b;
        if (eVar instanceof C7887e) {
            C7887e eVar2 = eVar;
        }
        if (e0Var2 == null && h0Var == null) {
            C7850h0.C7851a aVar3 = new C7850h0.C7851a();
            aVar3.mo25564g(gVar.f15764f);
            aVar3.mo25563f(C7835d0.HTTP_1_1);
            aVar3.f15564c = 504;
            aVar3.mo25562e("Unsatisfiable Request (only-if-cached)");
            aVar3.f15568g = C7867c.f15621c;
            aVar3.f15572k = -1;
            aVar3.f15573l = System.currentTimeMillis();
            C7850h0 a = aVar3.mo25558a();
            C6888i.m12438e(eVar, NotificationCompat.CATEGORY_CALL);
            C6888i.m12438e(a, "response");
            return a;
        } else if (e0Var2 == null) {
            C6888i.m12436c(h0Var);
            C7850h0.C7851a aVar4 = new C7850h0.C7851a(h0Var);
            aVar4.mo25559b(C7871a.m14309a(f15628a, h0Var));
            C7850h0 a2 = aVar4.mo25558a();
            C6888i.m12438e(eVar, NotificationCompat.CATEGORY_CALL);
            C6888i.m12438e(a2, "response");
            return a2;
        } else {
            if (h0Var != null) {
                C6888i.m12438e(eVar, NotificationCompat.CATEGORY_CALL);
                C6888i.m12438e(h0Var, "cachedResponse");
            }
            C7850h0 c = ((C7909g) aVar2).mo25663c(e0Var2);
            if (h0Var != null) {
                if (c.f15552j == 304) {
                    C7850h0.C7851a aVar5 = new C7850h0.C7851a(h0Var);
                    C7871a aVar6 = f15628a;
                    C8022y yVar2 = h0Var.f15554l;
                    C8022y yVar3 = c.f15554l;
                    ArrayList arrayList = new ArrayList(20);
                    int size = yVar2.size();
                    int i = 0;
                    while (i < size) {
                        String l = yVar2.mo25840l(i);
                        String q = yVar2.mo25842q(i);
                        if (C7694h.m13928f("Warning", l, true)) {
                            yVar = yVar2;
                            if (C7694h.m13910A(q, "1", false, 2)) {
                                i++;
                                yVar2 = yVar;
                            }
                        } else {
                            yVar = yVar2;
                        }
                        if (aVar6.mo25585b(l) || !aVar6.mo25586c(l) || yVar3.mo25836e(l) == null) {
                            C6888i.m12438e(l, "name");
                            C6888i.m12438e(q, "value");
                            arrayList.add(l);
                            arrayList.add(C7694h.m13921L(q).toString());
                            i++;
                            yVar2 = yVar;
                        } else {
                            i++;
                            yVar2 = yVar;
                        }
                    }
                    int size2 = yVar3.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        String l2 = yVar3.mo25840l(i2);
                        if (!aVar6.mo25585b(l2) && aVar6.mo25586c(l2)) {
                            String q2 = yVar3.mo25842q(i2);
                            C6888i.m12438e(l2, "name");
                            C6888i.m12438e(q2, "value");
                            arrayList.add(l2);
                            arrayList.add(C7694h.m13921L(q2).toString());
                        }
                    }
                    Object[] array = arrayList.toArray(new String[0]);
                    Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
                    aVar5.mo25561d(new C8022y((String[]) array, (DefaultConstructorMarker) null));
                    aVar5.f15572k = c.f15559q;
                    aVar5.f15573l = c.f15560r;
                    C7871a aVar7 = f15628a;
                    aVar5.mo25559b(C7871a.m14309a(aVar7, h0Var));
                    C7850h0 a3 = C7871a.m14309a(aVar7, c);
                    aVar5.mo25560c("networkResponse", a3);
                    aVar5.f15569h = a3;
                    aVar5.mo25558a();
                    C7855j0 j0Var = c.f15555m;
                    C6888i.m12436c(j0Var);
                    j0Var.close();
                    ? r0 = 0;
                    C6888i.m12436c(r0);
                    r0.mo25527d();
                    throw r0;
                }
                C7855j0 j0Var2 = h0Var.f15555m;
                if (j0Var2 != null) {
                    C7867c.m14283d(j0Var2);
                }
            }
            C6888i.m12436c(c);
            C7850h0.C7851a aVar8 = new C7850h0.C7851a(c);
            C7871a aVar9 = f15628a;
            aVar8.mo25559b(C7871a.m14309a(aVar9, h0Var));
            C7850h0 a4 = C7871a.m14309a(aVar9, c);
            aVar8.mo25560c("networkResponse", a4);
            aVar8.f15569h = a4;
            return aVar8.mo25558a();
        }
    }
}
