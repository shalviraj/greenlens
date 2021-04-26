package p005b.p080i.p081a;

import android.graphics.Matrix;
import androidx.core.app.NotificationCompat;
import androidx.core.view.ViewCompat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import p005b.p035e.p036a.p037a.C0843a;
import p005b.p080i.p081a.C1394b;

/* renamed from: b.i.a.f */
public class C1422f {

    /* renamed from: a */
    public C1445e0 f1910a = null;

    /* renamed from: b */
    public C1394b.C1413r f1911b = new C1394b.C1413r();

    /* renamed from: c */
    public Map<String, C1458k0> f1912c = new HashMap();

    /* renamed from: b.i.a.f$a */
    public static class C1423a {

        /* renamed from: a */
        public float f1913a;

        /* renamed from: b */
        public float f1914b;

        /* renamed from: c */
        public float f1915c;

        /* renamed from: d */
        public float f1916d;

        public C1423a(float f, float f2, float f3, float f4) {
            this.f1913a = f;
            this.f1914b = f2;
            this.f1915c = f3;
            this.f1916d = f4;
        }

        public C1423a(C1423a aVar) {
            this.f1913a = aVar.f1913a;
            this.f1914b = aVar.f1914b;
            this.f1915c = aVar.f1915c;
            this.f1916d = aVar.f1916d;
        }

        /* renamed from: a */
        public float mo11304a() {
            return this.f1913a + this.f1915c;
        }

        /* renamed from: b */
        public float mo11305b() {
            return this.f1914b + this.f1916d;
        }

        public String toString() {
            StringBuilder u = C0843a.m460u("[");
            u.append(this.f1913a);
            u.append(" ");
            u.append(this.f1914b);
            u.append(" ");
            u.append(this.f1915c);
            u.append(" ");
            u.append(this.f1916d);
            u.append("]");
            return u.toString();
        }
    }

    /* renamed from: b.i.a.f$a0 */
    public static class C1424a0 extends C1457k {

        /* renamed from: o */
        public C1465o f1917o;

        /* renamed from: p */
        public C1465o f1918p;

        /* renamed from: q */
        public C1465o f1919q;

        /* renamed from: r */
        public C1465o f1920r;

        /* renamed from: s */
        public C1465o f1921s;

        /* renamed from: t */
        public C1465o f1922t;

        /* renamed from: o */
        public String mo11307o() {
            return "rect";
        }
    }

    /* renamed from: b.i.a.f$a1 */
    public interface C1425a1 {
    }

    /* renamed from: b.i.a.f$b */
    public static class C1426b {

        /* renamed from: a */
        public C1465o f1923a;

        /* renamed from: b */
        public C1465o f1924b;

        /* renamed from: c */
        public C1465o f1925c;

        /* renamed from: d */
        public C1465o f1926d;

        public C1426b(C1465o oVar, C1465o oVar2, C1465o oVar3, C1465o oVar4) {
            this.f1923a = oVar;
            this.f1924b = oVar2;
            this.f1925c = oVar3;
            this.f1926d = oVar4;
        }
    }

    /* renamed from: b.i.a.f$b0 */
    public static class C1427b0 extends C1458k0 implements C1454i0 {
        /* renamed from: c */
        public List<C1462m0> mo11308c() {
            return Collections.emptyList();
        }

        /* renamed from: f */
        public void mo11309f(C1462m0 m0Var) {
        }

        /* renamed from: o */
        public String mo11307o() {
            return "solidColor";
        }
    }

    /* renamed from: b.i.a.f$b1 */
    public static class C1428b1 extends C1462m0 implements C1482w0 {

        /* renamed from: c */
        public String f1927c;

        public C1428b1(String str) {
            this.f1927c = str;
        }

        /* renamed from: k */
        public C1425a1 mo11310k() {
            return null;
        }

        public String toString() {
            return C0843a.m455p(C0843a.m460u("TextChild: '"), this.f1927c, "'");
        }
    }

    /* renamed from: b.i.a.f$c */
    public static class C1429c extends C1457k {

        /* renamed from: o */
        public C1465o f1928o;

        /* renamed from: p */
        public C1465o f1929p;

        /* renamed from: q */
        public C1465o f1930q;

        /* renamed from: o */
        public String mo11307o() {
            return "circle";
        }
    }

    /* renamed from: b.i.a.f$c0 */
    public static class C1430c0 extends C1458k0 implements C1454i0 {

        /* renamed from: h */
        public Float f1931h;

        /* renamed from: c */
        public List<C1462m0> mo11308c() {
            return Collections.emptyList();
        }

        /* renamed from: f */
        public void mo11309f(C1462m0 m0Var) {
        }

        /* renamed from: o */
        public String mo11307o() {
            return "stop";
        }
    }

    /* renamed from: b.i.a.f$c1 */
    public enum C1431c1 {
        px,
        em,
        ex,
        in,
        cm,
        mm,
        pt,
        pc,
        percent
    }

    /* renamed from: b.i.a.f$d */
    public static class C1432d extends C1459l implements C1473s {

        /* renamed from: o */
        public Boolean f1942o;

        /* renamed from: o */
        public String mo11307o() {
            return "clipPath";
        }
    }

    /* renamed from: b.i.a.f$d0 */
    public static class C1433d0 implements Cloneable {

        /* renamed from: A */
        public C1439f f1943A;

        /* renamed from: B */
        public Boolean f1944B;

        /* renamed from: C */
        public C1426b f1945C;

        /* renamed from: D */
        public String f1946D;

        /* renamed from: E */
        public String f1947E;

        /* renamed from: F */
        public String f1948F;

        /* renamed from: G */
        public Boolean f1949G;

        /* renamed from: H */
        public Boolean f1950H;

        /* renamed from: I */
        public C1464n0 f1951I;

        /* renamed from: J */
        public Float f1952J;

        /* renamed from: K */
        public String f1953K;

        /* renamed from: L */
        public C1434a f1954L;

        /* renamed from: M */
        public String f1955M;

        /* renamed from: N */
        public C1464n0 f1956N;

        /* renamed from: O */
        public Float f1957O;

        /* renamed from: P */
        public C1464n0 f1958P;

        /* renamed from: Q */
        public Float f1959Q;

        /* renamed from: R */
        public C1442i f1960R;

        /* renamed from: S */
        public C1438e f1961S;

        /* renamed from: g */
        public long f1962g = 0;

        /* renamed from: h */
        public C1464n0 f1963h;

        /* renamed from: i */
        public C1434a f1964i;

        /* renamed from: j */
        public Float f1965j;

        /* renamed from: k */
        public C1464n0 f1966k;

        /* renamed from: l */
        public Float f1967l;

        /* renamed from: m */
        public C1465o f1968m;

        /* renamed from: n */
        public C1436c f1969n;

        /* renamed from: o */
        public C1437d f1970o;

        /* renamed from: p */
        public Float f1971p;

        /* renamed from: q */
        public C1465o[] f1972q;

        /* renamed from: r */
        public C1465o f1973r;

        /* renamed from: s */
        public Float f1974s;

        /* renamed from: t */
        public C1444e f1975t;

        /* renamed from: u */
        public List<String> f1976u;

        /* renamed from: v */
        public C1465o f1977v;

        /* renamed from: w */
        public Integer f1978w;

        /* renamed from: x */
        public C1435b f1979x;

        /* renamed from: y */
        public C1440g f1980y;

        /* renamed from: z */
        public C1441h f1981z;

        /* renamed from: b.i.a.f$d0$a */
        public enum C1434a {
            NonZero,
            EvenOdd
        }

        /* renamed from: b.i.a.f$d0$b */
        public enum C1435b {
            Normal,
            Italic,
            Oblique
        }

        /* renamed from: b.i.a.f$d0$c */
        public enum C1436c {
            Butt,
            Round,
            Square
        }

        /* renamed from: b.i.a.f$d0$d */
        public enum C1437d {
            Miter,
            Round,
            Bevel
        }

        /* renamed from: b.i.a.f$d0$e */
        public enum C1438e {
            auto,
            optimizeQuality,
            optimizeSpeed
        }

        /* renamed from: b.i.a.f$d0$f */
        public enum C1439f {
            Start,
            Middle,
            End
        }

        /* renamed from: b.i.a.f$d0$g */
        public enum C1440g {
            None,
            Underline,
            Overline,
            LineThrough,
            Blink
        }

        /* renamed from: b.i.a.f$d0$h */
        public enum C1441h {
            LTR,
            RTL
        }

        /* renamed from: b.i.a.f$d0$i */
        public enum C1442i {
            None,
            NonScalingStroke
        }

        /* renamed from: a */
        public static C1433d0 m1537a() {
            C1433d0 d0Var = new C1433d0();
            d0Var.f1962g = -1;
            C1444e eVar = C1444e.f2022h;
            d0Var.f1963h = eVar;
            C1434a aVar = C1434a.NonZero;
            d0Var.f1964i = aVar;
            Float valueOf = Float.valueOf(1.0f);
            d0Var.f1965j = valueOf;
            d0Var.f1966k = null;
            d0Var.f1967l = valueOf;
            d0Var.f1968m = new C1465o(1.0f);
            d0Var.f1969n = C1436c.Butt;
            d0Var.f1970o = C1437d.Miter;
            d0Var.f1971p = Float.valueOf(4.0f);
            d0Var.f1972q = null;
            d0Var.f1973r = new C1465o(0.0f);
            d0Var.f1974s = valueOf;
            d0Var.f1975t = eVar;
            d0Var.f1976u = null;
            d0Var.f1977v = new C1465o(12.0f, C1431c1.pt);
            d0Var.f1978w = 400;
            d0Var.f1979x = C1435b.Normal;
            d0Var.f1980y = C1440g.None;
            d0Var.f1981z = C1441h.LTR;
            d0Var.f1943A = C1439f.Start;
            Boolean bool = Boolean.TRUE;
            d0Var.f1944B = bool;
            d0Var.f1945C = null;
            d0Var.f1946D = null;
            d0Var.f1947E = null;
            d0Var.f1948F = null;
            d0Var.f1949G = bool;
            d0Var.f1950H = bool;
            d0Var.f1951I = eVar;
            d0Var.f1952J = valueOf;
            d0Var.f1953K = null;
            d0Var.f1954L = aVar;
            d0Var.f1955M = null;
            d0Var.f1956N = null;
            d0Var.f1957O = valueOf;
            d0Var.f1958P = null;
            d0Var.f1959Q = valueOf;
            d0Var.f1960R = C1442i.None;
            d0Var.f1961S = C1438e.auto;
            return d0Var;
        }

        public Object clone() {
            C1433d0 d0Var = (C1433d0) super.clone();
            C1465o[] oVarArr = this.f1972q;
            if (oVarArr != null) {
                d0Var.f1972q = (C1465o[]) oVarArr.clone();
            }
            return d0Var;
        }
    }

    /* renamed from: b.i.a.f$d1 */
    public static class C1443d1 extends C1459l {

        /* renamed from: o */
        public String f2017o;

        /* renamed from: p */
        public C1465o f2018p;

        /* renamed from: q */
        public C1465o f2019q;

        /* renamed from: r */
        public C1465o f2020r;

        /* renamed from: s */
        public C1465o f2021s;

        /* renamed from: o */
        public String mo11307o() {
            return "use";
        }
    }

    /* renamed from: b.i.a.f$e */
    public static class C1444e extends C1464n0 {

        /* renamed from: h */
        public static final C1444e f2022h = new C1444e(ViewCompat.MEASURED_STATE_MASK);

        /* renamed from: i */
        public static final C1444e f2023i = new C1444e(0);

        /* renamed from: g */
        public int f2024g;

        public C1444e(int i) {
            this.f2024g = i;
        }

        public String toString() {
            return String.format("#%08x", new Object[]{Integer.valueOf(this.f2024g)});
        }
    }

    /* renamed from: b.i.a.f$e0 */
    public static class C1445e0 extends C1470q0 {

        /* renamed from: p */
        public C1465o f2025p;

        /* renamed from: q */
        public C1465o f2026q;

        /* renamed from: r */
        public C1465o f2027r;

        /* renamed from: s */
        public C1465o f2028s;

        /* renamed from: o */
        public String mo11307o() {
            return "svg";
        }
    }

    /* renamed from: b.i.a.f$e1 */
    public static class C1446e1 extends C1470q0 implements C1473s {
        /* renamed from: o */
        public String mo11307o() {
            return "view";
        }
    }

    /* renamed from: b.i.a.f$f */
    public static class C1447f extends C1464n0 {

        /* renamed from: g */
        public static C1447f f2029g = new C1447f();
    }

    /* renamed from: b.i.a.f$f0 */
    public interface C1448f0 {
        /* renamed from: a */
        Set<String> mo11314a();

        /* renamed from: b */
        void mo11315b(String str);

        /* renamed from: e */
        Set<String> mo11316e();

        /* renamed from: g */
        void mo11317g(Set<String> set);

        /* renamed from: h */
        String mo11318h();

        /* renamed from: i */
        void mo11319i(Set<String> set);

        /* renamed from: j */
        void mo11320j(Set<String> set);

        /* renamed from: l */
        void mo11321l(Set<String> set);

        /* renamed from: m */
        Set<String> mo11322m();

        /* renamed from: n */
        Set<String> mo11323n();
    }

    /* renamed from: b.i.a.f$g */
    public static class C1449g extends C1459l implements C1473s {
        /* renamed from: o */
        public String mo11307o() {
            return "defs";
        }
    }

    /* renamed from: b.i.a.f$g0 */
    public static abstract class C1450g0 extends C1456j0 implements C1454i0, C1448f0 {

        /* renamed from: i */
        public List<C1462m0> f2030i = new ArrayList();

        /* renamed from: j */
        public Set<String> f2031j = null;

        /* renamed from: k */
        public String f2032k = null;

        /* renamed from: l */
        public Set<String> f2033l = null;

        /* renamed from: m */
        public Set<String> f2034m = null;

        /* renamed from: a */
        public Set<String> mo11314a() {
            return this.f2031j;
        }

        /* renamed from: b */
        public void mo11315b(String str) {
            this.f2032k = str;
        }

        /* renamed from: c */
        public List<C1462m0> mo11308c() {
            return this.f2030i;
        }

        /* renamed from: e */
        public Set<String> mo11316e() {
            return null;
        }

        /* renamed from: f */
        public void mo11309f(C1462m0 m0Var) {
            this.f2030i.add(m0Var);
        }

        /* renamed from: g */
        public void mo11317g(Set<String> set) {
            this.f2033l = set;
        }

        /* renamed from: h */
        public String mo11318h() {
            return this.f2032k;
        }

        /* renamed from: i */
        public void mo11319i(Set<String> set) {
            this.f2034m = set;
        }

        /* renamed from: j */
        public void mo11320j(Set<String> set) {
        }

        /* renamed from: l */
        public void mo11321l(Set<String> set) {
            this.f2031j = set;
        }

        /* renamed from: m */
        public Set<String> mo11322m() {
            return this.f2033l;
        }

        /* renamed from: n */
        public Set<String> mo11323n() {
            return this.f2034m;
        }
    }

    /* renamed from: b.i.a.f$h */
    public static class C1451h extends C1457k {

        /* renamed from: o */
        public C1465o f2035o;

        /* renamed from: p */
        public C1465o f2036p;

        /* renamed from: q */
        public C1465o f2037q;

        /* renamed from: r */
        public C1465o f2038r;

        /* renamed from: o */
        public String mo11307o() {
            return "ellipse";
        }
    }

    /* renamed from: b.i.a.f$h0 */
    public static abstract class C1452h0 extends C1456j0 implements C1448f0 {

        /* renamed from: i */
        public Set<String> f2039i = null;

        /* renamed from: j */
        public String f2040j = null;

        /* renamed from: k */
        public Set<String> f2041k = null;

        /* renamed from: l */
        public Set<String> f2042l = null;

        /* renamed from: m */
        public Set<String> f2043m = null;

        /* renamed from: a */
        public Set<String> mo11314a() {
            return this.f2039i;
        }

        /* renamed from: b */
        public void mo11315b(String str) {
            this.f2040j = str;
        }

        /* renamed from: e */
        public Set<String> mo11316e() {
            return this.f2041k;
        }

        /* renamed from: g */
        public void mo11317g(Set<String> set) {
            this.f2042l = set;
        }

        /* renamed from: h */
        public String mo11318h() {
            return this.f2040j;
        }

        /* renamed from: i */
        public void mo11319i(Set<String> set) {
            this.f2043m = set;
        }

        /* renamed from: j */
        public void mo11320j(Set<String> set) {
            this.f2041k = set;
        }

        /* renamed from: l */
        public void mo11321l(Set<String> set) {
            this.f2039i = set;
        }

        /* renamed from: m */
        public Set<String> mo11322m() {
            return this.f2042l;
        }

        /* renamed from: n */
        public Set<String> mo11323n() {
            return this.f2043m;
        }
    }

    /* renamed from: b.i.a.f$i */
    public static abstract class C1453i extends C1458k0 implements C1454i0 {

        /* renamed from: h */
        public List<C1462m0> f2044h = new ArrayList();

        /* renamed from: i */
        public Boolean f2045i;

        /* renamed from: j */
        public Matrix f2046j;

        /* renamed from: k */
        public C1455j f2047k;

        /* renamed from: l */
        public String f2048l;

        /* renamed from: c */
        public List<C1462m0> mo11308c() {
            return this.f2044h;
        }

        /* renamed from: f */
        public void mo11309f(C1462m0 m0Var) {
            if (m0Var instanceof C1430c0) {
                this.f2044h.add(m0Var);
                return;
            }
            throw new C1501h("Gradient elements cannot contain " + m0Var + " elements.");
        }
    }

    /* renamed from: b.i.a.f$i0 */
    public interface C1454i0 {
        /* renamed from: c */
        List<C1462m0> mo11308c();

        /* renamed from: f */
        void mo11309f(C1462m0 m0Var);
    }

    /* renamed from: b.i.a.f$j */
    public enum C1455j {
        pad,
        reflect,
        repeat
    }

    /* renamed from: b.i.a.f$j0 */
    public static abstract class C1456j0 extends C1458k0 {

        /* renamed from: h */
        public C1423a f2053h = null;
    }

    /* renamed from: b.i.a.f$k */
    public static abstract class C1457k extends C1452h0 implements C1461m {

        /* renamed from: n */
        public Matrix f2054n;

        /* renamed from: d */
        public void mo11324d(Matrix matrix) {
            this.f2054n = matrix;
        }
    }

    /* renamed from: b.i.a.f$k0 */
    public static abstract class C1458k0 extends C1462m0 {

        /* renamed from: c */
        public String f2055c = null;

        /* renamed from: d */
        public Boolean f2056d = null;

        /* renamed from: e */
        public C1433d0 f2057e = null;

        /* renamed from: f */
        public C1433d0 f2058f = null;

        /* renamed from: g */
        public List<String> f2059g = null;

        public String toString() {
            return mo11307o();
        }
    }

    /* renamed from: b.i.a.f$l */
    public static class C1459l extends C1450g0 implements C1461m {

        /* renamed from: n */
        public Matrix f2060n;

        /* renamed from: d */
        public void mo11324d(Matrix matrix) {
            this.f2060n = matrix;
        }

        /* renamed from: o */
        public String mo11307o() {
            return "group";
        }
    }

    /* renamed from: b.i.a.f$l0 */
    public static class C1460l0 extends C1453i {

        /* renamed from: m */
        public C1465o f2061m;

        /* renamed from: n */
        public C1465o f2062n;

        /* renamed from: o */
        public C1465o f2063o;

        /* renamed from: p */
        public C1465o f2064p;

        /* renamed from: o */
        public String mo11307o() {
            return "linearGradient";
        }
    }

    /* renamed from: b.i.a.f$m */
    public interface C1461m {
        /* renamed from: d */
        void mo11324d(Matrix matrix);
    }

    /* renamed from: b.i.a.f$m0 */
    public static class C1462m0 {

        /* renamed from: a */
        public C1422f f2065a;

        /* renamed from: b */
        public C1454i0 f2066b;

        /* renamed from: o */
        public String mo11307o() {
            return "";
        }
    }

    /* renamed from: b.i.a.f$n */
    public static class C1463n extends C1466o0 implements C1461m {

        /* renamed from: o */
        public String f2067o;

        /* renamed from: p */
        public C1465o f2068p;

        /* renamed from: q */
        public C1465o f2069q;

        /* renamed from: r */
        public C1465o f2070r;

        /* renamed from: s */
        public C1465o f2071s;

        /* renamed from: t */
        public Matrix f2072t;

        /* renamed from: d */
        public void mo11324d(Matrix matrix) {
            this.f2072t = matrix;
        }

        /* renamed from: o */
        public String mo11307o() {
            return "image";
        }
    }

    /* renamed from: b.i.a.f$n0 */
    public static abstract class C1464n0 implements Cloneable {
    }

    /* renamed from: b.i.a.f$o */
    public static class C1465o implements Cloneable {

        /* renamed from: g */
        public float f2073g;

        /* renamed from: h */
        public C1431c1 f2074h;

        public C1465o(float f) {
            this.f2073g = f;
            this.f2074h = C1431c1.px;
        }

        public C1465o(float f, C1431c1 c1Var) {
            this.f2073g = f;
            this.f2074h = c1Var;
        }

        /* renamed from: a */
        public float mo11326a(float f) {
            int ordinal = this.f2074h.ordinal();
            return ordinal != 0 ? ordinal != 3 ? ordinal != 4 ? ordinal != 5 ? ordinal != 6 ? ordinal != 7 ? this.f2073g : (this.f2073g * f) / 6.0f : (this.f2073g * f) / 72.0f : (this.f2073g * f) / 25.4f : (this.f2073g * f) / 2.54f : this.f2073g * f : this.f2073g;
        }

        /* renamed from: b */
        public float mo11327b(C1489g gVar) {
            if (this.f2074h != C1431c1.percent) {
                return mo11329d(gVar);
            }
            C1423a z = gVar.mo11391z();
            if (z == null) {
                return this.f2073g;
            }
            float f = z.f1915c;
            float f2 = z.f1916d;
            if (f == f2) {
                return (this.f2073g * f) / 100.0f;
            }
            return (this.f2073g * ((float) (Math.sqrt((double) ((f2 * f2) + (f * f))) / 1.414213562373095d))) / 100.0f;
        }

        /* renamed from: c */
        public float mo11328c(C1489g gVar, float f) {
            return this.f2074h == C1431c1.percent ? (this.f2073g * f) / 100.0f : mo11329d(gVar);
        }

        /* renamed from: d */
        public float mo11329d(C1489g gVar) {
            float f;
            float f2;
            switch (this.f2074h.ordinal()) {
                case 0:
                    return this.f2073g;
                case 1:
                    return this.f2073g * gVar.f2127c.f2160d.getTextSize();
                case 2:
                    return this.f2073g * (gVar.f2127c.f2160d.getTextSize() / 2.0f);
                case 3:
                    float f3 = this.f2073g;
                    Objects.requireNonNull(gVar);
                    return f3 * 96.0f;
                case 4:
                    float f4 = this.f2073g;
                    Objects.requireNonNull(gVar);
                    f2 = f4 * 96.0f;
                    f = 2.54f;
                    break;
                case 5:
                    float f5 = this.f2073g;
                    Objects.requireNonNull(gVar);
                    f2 = f5 * 96.0f;
                    f = 25.4f;
                    break;
                case 6:
                    float f6 = this.f2073g;
                    Objects.requireNonNull(gVar);
                    f2 = f6 * 96.0f;
                    f = 72.0f;
                    break;
                case 7:
                    float f7 = this.f2073g;
                    Objects.requireNonNull(gVar);
                    f2 = f7 * 96.0f;
                    f = 6.0f;
                    break;
                case 8:
                    C1423a z = gVar.mo11391z();
                    if (z != null) {
                        f2 = this.f2073g * z.f1915c;
                        f = 100.0f;
                        break;
                    } else {
                        return this.f2073g;
                    }
                default:
                    return this.f2073g;
            }
            return f2 / f;
        }

        /* renamed from: f */
        public float mo11330f(C1489g gVar) {
            if (this.f2074h != C1431c1.percent) {
                return mo11329d(gVar);
            }
            C1423a z = gVar.mo11391z();
            return z == null ? this.f2073g : (this.f2073g * z.f1916d) / 100.0f;
        }

        /* renamed from: g */
        public boolean mo11331g() {
            return this.f2073g < 0.0f;
        }

        /* renamed from: h */
        public boolean mo11332h() {
            return this.f2073g == 0.0f;
        }

        public String toString() {
            return String.valueOf(this.f2073g) + this.f2074h;
        }
    }

    /* renamed from: b.i.a.f$o0 */
    public static abstract class C1466o0 extends C1450g0 {

        /* renamed from: n */
        public C1419e f2075n = null;
    }

    /* renamed from: b.i.a.f$p */
    public static class C1467p extends C1457k {

        /* renamed from: o */
        public C1465o f2076o;

        /* renamed from: p */
        public C1465o f2077p;

        /* renamed from: q */
        public C1465o f2078q;

        /* renamed from: r */
        public C1465o f2079r;

        /* renamed from: o */
        public String mo11307o() {
            return "line";
        }
    }

    /* renamed from: b.i.a.f$p0 */
    public static class C1468p0 extends C1453i {

        /* renamed from: m */
        public C1465o f2080m;

        /* renamed from: n */
        public C1465o f2081n;

        /* renamed from: o */
        public C1465o f2082o;

        /* renamed from: p */
        public C1465o f2083p;

        /* renamed from: q */
        public C1465o f2084q;

        /* renamed from: o */
        public String mo11307o() {
            return "radialGradient";
        }
    }

    /* renamed from: b.i.a.f$q */
    public static class C1469q extends C1470q0 implements C1473s {

        /* renamed from: p */
        public boolean f2085p;

        /* renamed from: q */
        public C1465o f2086q;

        /* renamed from: r */
        public C1465o f2087r;

        /* renamed from: s */
        public C1465o f2088s;

        /* renamed from: t */
        public C1465o f2089t;

        /* renamed from: u */
        public Float f2090u;

        /* renamed from: o */
        public String mo11307o() {
            return "marker";
        }
    }

    /* renamed from: b.i.a.f$q0 */
    public static abstract class C1470q0 extends C1466o0 {

        /* renamed from: o */
        public C1423a f2091o;
    }

    /* renamed from: b.i.a.f$r */
    public static class C1471r extends C1450g0 implements C1473s {

        /* renamed from: n */
        public Boolean f2092n;

        /* renamed from: o */
        public Boolean f2093o;

        /* renamed from: p */
        public C1465o f2094p;

        /* renamed from: q */
        public C1465o f2095q;

        /* renamed from: o */
        public String mo11307o() {
            return "mask";
        }
    }

    /* renamed from: b.i.a.f$r0 */
    public static class C1472r0 extends C1459l {
        /* renamed from: o */
        public String mo11307o() {
            return "switch";
        }
    }

    /* renamed from: b.i.a.f$s */
    public interface C1473s {
    }

    /* renamed from: b.i.a.f$s0 */
    public static class C1474s0 extends C1470q0 implements C1473s {
        /* renamed from: o */
        public String mo11307o() {
            return "symbol";
        }
    }

    /* renamed from: b.i.a.f$t */
    public static class C1475t extends C1464n0 {

        /* renamed from: g */
        public String f2096g;

        /* renamed from: h */
        public C1464n0 f2097h;

        public C1475t(String str, C1464n0 n0Var) {
            this.f2096g = str;
            this.f2097h = n0Var;
        }

        public String toString() {
            return this.f2096g + " " + this.f2097h;
        }
    }

    /* renamed from: b.i.a.f$t0 */
    public static class C1476t0 extends C1484x0 implements C1482w0 {

        /* renamed from: n */
        public String f2098n;

        /* renamed from: o */
        public C1425a1 f2099o;

        /* renamed from: k */
        public C1425a1 mo11310k() {
            return this.f2099o;
        }

        /* renamed from: o */
        public String mo11307o() {
            return "tref";
        }
    }

    /* renamed from: b.i.a.f$u */
    public static class C1477u extends C1457k {

        /* renamed from: o */
        public C1479v f2100o;

        /* renamed from: p */
        public Float f2101p;

        /* renamed from: o */
        public String mo11307o() {
            return "path";
        }
    }

    /* renamed from: b.i.a.f$u0 */
    public static class C1478u0 extends C1488z0 implements C1482w0 {

        /* renamed from: r */
        public C1425a1 f2102r;

        /* renamed from: k */
        public C1425a1 mo11310k() {
            return this.f2102r;
        }

        /* renamed from: o */
        public String mo11307o() {
            return "tspan";
        }
    }

    /* renamed from: b.i.a.f$v */
    public static class C1479v implements C1481w {

        /* renamed from: a */
        public byte[] f2103a = new byte[8];

        /* renamed from: b */
        public int f2104b = 0;

        /* renamed from: c */
        public float[] f2105c = new float[16];

        /* renamed from: d */
        public int f2106d = 0;

        /* renamed from: a */
        public void mo11335a(float f, float f2) {
            mo11341f((byte) 0);
            mo11342g(2);
            float[] fArr = this.f2105c;
            int i = this.f2106d;
            int i2 = i + 1;
            this.f2106d = i2;
            fArr[i] = f;
            this.f2106d = i2 + 1;
            fArr[i2] = f2;
        }

        /* renamed from: b */
        public void mo11336b(float f, float f2, float f3, float f4, float f5, float f6) {
            mo11341f((byte) 2);
            mo11342g(6);
            float[] fArr = this.f2105c;
            int i = this.f2106d;
            int i2 = i + 1;
            this.f2106d = i2;
            fArr[i] = f;
            int i3 = i2 + 1;
            this.f2106d = i3;
            fArr[i2] = f2;
            int i4 = i3 + 1;
            this.f2106d = i4;
            fArr[i3] = f3;
            int i5 = i4 + 1;
            this.f2106d = i5;
            fArr[i4] = f4;
            int i6 = i5 + 1;
            this.f2106d = i6;
            fArr[i5] = f5;
            this.f2106d = i6 + 1;
            fArr[i6] = f6;
        }

        /* renamed from: c */
        public void mo11337c(float f, float f2, float f3, boolean z, boolean z2, float f4, float f5) {
            mo11341f(((z ? (char) 2 : 0) | true) | z2 ? (byte) 1 : 0);
            mo11342g(5);
            float[] fArr = this.f2105c;
            int i = this.f2106d;
            int i2 = i + 1;
            this.f2106d = i2;
            fArr[i] = f;
            int i3 = i2 + 1;
            this.f2106d = i3;
            fArr[i2] = f2;
            int i4 = i3 + 1;
            this.f2106d = i4;
            fArr[i3] = f3;
            int i5 = i4 + 1;
            this.f2106d = i5;
            fArr[i4] = f4;
            this.f2106d = i5 + 1;
            fArr[i5] = f5;
        }

        public void close() {
            mo11341f((byte) 8);
        }

        /* renamed from: d */
        public void mo11339d(float f, float f2, float f3, float f4) {
            mo11341f((byte) 3);
            mo11342g(4);
            float[] fArr = this.f2105c;
            int i = this.f2106d;
            int i2 = i + 1;
            this.f2106d = i2;
            fArr[i] = f;
            int i3 = i2 + 1;
            this.f2106d = i3;
            fArr[i2] = f2;
            int i4 = i3 + 1;
            this.f2106d = i4;
            fArr[i3] = f3;
            this.f2106d = i4 + 1;
            fArr[i4] = f4;
        }

        /* renamed from: e */
        public void mo11340e(float f, float f2) {
            mo11341f((byte) 1);
            mo11342g(2);
            float[] fArr = this.f2105c;
            int i = this.f2106d;
            int i2 = i + 1;
            this.f2106d = i2;
            fArr[i] = f;
            this.f2106d = i2 + 1;
            fArr[i2] = f2;
        }

        /* renamed from: f */
        public final void mo11341f(byte b) {
            int i = this.f2104b;
            byte[] bArr = this.f2103a;
            if (i == bArr.length) {
                byte[] bArr2 = new byte[(bArr.length * 2)];
                System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                this.f2103a = bArr2;
            }
            byte[] bArr3 = this.f2103a;
            int i2 = this.f2104b;
            this.f2104b = i2 + 1;
            bArr3[i2] = b;
        }

        /* renamed from: g */
        public final void mo11342g(int i) {
            float[] fArr = this.f2105c;
            if (fArr.length < this.f2106d + i) {
                float[] fArr2 = new float[(fArr.length * 2)];
                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                this.f2105c = fArr2;
            }
        }

        /* renamed from: h */
        public void mo11343h(C1481w wVar) {
            int i;
            int i2 = 0;
            for (int i3 = 0; i3 < this.f2104b; i3++) {
                byte b = this.f2103a[i3];
                if (b == 0) {
                    float[] fArr = this.f2105c;
                    int i4 = i2 + 1;
                    i = i4 + 1;
                    wVar.mo11335a(fArr[i2], fArr[i4]);
                } else if (b != 1) {
                    if (b == 2) {
                        float[] fArr2 = this.f2105c;
                        int i5 = i2 + 1;
                        float f = fArr2[i2];
                        int i6 = i5 + 1;
                        float f2 = fArr2[i5];
                        int i7 = i6 + 1;
                        float f3 = fArr2[i6];
                        int i8 = i7 + 1;
                        float f4 = fArr2[i7];
                        int i9 = i8 + 1;
                        float f5 = fArr2[i8];
                        i2 = i9 + 1;
                        wVar.mo11336b(f, f2, f3, f4, f5, fArr2[i9]);
                    } else if (b == 3) {
                        float[] fArr3 = this.f2105c;
                        int i10 = i2 + 1;
                        int i11 = i10 + 1;
                        int i12 = i11 + 1;
                        wVar.mo11339d(fArr3[i2], fArr3[i10], fArr3[i11], fArr3[i12]);
                        i2 = i12 + 1;
                    } else if (b != 8) {
                        boolean z = (b & 2) != 0;
                        boolean z2 = (b & 1) != 0;
                        float[] fArr4 = this.f2105c;
                        int i13 = i2 + 1;
                        float f6 = fArr4[i2];
                        int i14 = i13 + 1;
                        float f7 = fArr4[i13];
                        int i15 = i14 + 1;
                        float f8 = fArr4[i14];
                        int i16 = i15 + 1;
                        wVar.mo11337c(f6, f7, f8, z, z2, fArr4[i15], fArr4[i16]);
                        i2 = i16 + 1;
                    } else {
                        wVar.close();
                    }
                } else {
                    float[] fArr5 = this.f2105c;
                    int i17 = i2 + 1;
                    i = i17 + 1;
                    wVar.mo11340e(fArr5[i2], fArr5[i17]);
                }
                i2 = i;
            }
        }
    }

    /* renamed from: b.i.a.f$v0 */
    public static class C1480v0 extends C1488z0 implements C1425a1, C1461m {

        /* renamed from: r */
        public Matrix f2107r;

        /* renamed from: d */
        public void mo11324d(Matrix matrix) {
            this.f2107r = matrix;
        }

        /* renamed from: o */
        public String mo11307o() {
            return NotificationCompat.MessagingStyle.Message.KEY_TEXT;
        }
    }

    /* renamed from: b.i.a.f$w */
    public interface C1481w {
        /* renamed from: a */
        void mo11335a(float f, float f2);

        /* renamed from: b */
        void mo11336b(float f, float f2, float f3, float f4, float f5, float f6);

        /* renamed from: c */
        void mo11337c(float f, float f2, float f3, boolean z, boolean z2, float f4, float f5);

        void close();

        /* renamed from: d */
        void mo11339d(float f, float f2, float f3, float f4);

        /* renamed from: e */
        void mo11340e(float f, float f2);
    }

    /* renamed from: b.i.a.f$w0 */
    public interface C1482w0 {
        /* renamed from: k */
        C1425a1 mo11310k();
    }

    /* renamed from: b.i.a.f$x */
    public static class C1483x extends C1470q0 implements C1473s {

        /* renamed from: p */
        public Boolean f2108p;

        /* renamed from: q */
        public Boolean f2109q;

        /* renamed from: r */
        public Matrix f2110r;

        /* renamed from: s */
        public C1465o f2111s;

        /* renamed from: t */
        public C1465o f2112t;

        /* renamed from: u */
        public C1465o f2113u;

        /* renamed from: v */
        public C1465o f2114v;

        /* renamed from: w */
        public String f2115w;

        /* renamed from: o */
        public String mo11307o() {
            return "pattern";
        }
    }

    /* renamed from: b.i.a.f$x0 */
    public static abstract class C1484x0 extends C1450g0 {
        /* renamed from: f */
        public void mo11309f(C1462m0 m0Var) {
            if (m0Var instanceof C1482w0) {
                this.f2030i.add(m0Var);
                return;
            }
            throw new C1501h("Text content elements cannot contain " + m0Var + " elements.");
        }
    }

    /* renamed from: b.i.a.f$y */
    public static class C1485y extends C1457k {

        /* renamed from: o */
        public float[] f2116o;

        /* renamed from: o */
        public String mo11307o() {
            return "polyline";
        }
    }

    /* renamed from: b.i.a.f$y0 */
    public static class C1486y0 extends C1484x0 implements C1482w0 {

        /* renamed from: n */
        public String f2117n;

        /* renamed from: o */
        public C1465o f2118o;

        /* renamed from: p */
        public C1425a1 f2119p;

        /* renamed from: k */
        public C1425a1 mo11310k() {
            return this.f2119p;
        }

        /* renamed from: o */
        public String mo11307o() {
            return "textPath";
        }
    }

    /* renamed from: b.i.a.f$z */
    public static class C1487z extends C1485y {
        /* renamed from: o */
        public String mo11307o() {
            return "polygon";
        }
    }

    /* renamed from: b.i.a.f$z0 */
    public static abstract class C1488z0 extends C1484x0 {

        /* renamed from: n */
        public List<C1465o> f2120n;

        /* renamed from: o */
        public List<C1465o> f2121o;

        /* renamed from: p */
        public List<C1465o> f2122p;

        /* renamed from: q */
        public List<C1465o> f2123q;
    }

    /* renamed from: a */
    public float mo11295a() {
        C1431c1 c1Var;
        C1445e0 e0Var = this.f1910a;
        if (e0Var != null) {
            C1465o oVar = e0Var.f2027r;
            C1465o oVar2 = e0Var.f2028s;
            if (oVar == null || oVar2 == null || oVar.f2074h == (c1Var = C1431c1.percent) || oVar2.f2074h == c1Var) {
                C1423a aVar = e0Var.f2091o;
                if (aVar != null) {
                    float f = aVar.f1915c;
                    if (f != 0.0f) {
                        float f2 = aVar.f1916d;
                        if (f2 != 0.0f) {
                            return f / f2;
                        }
                    }
                }
                return -1.0f;
            } else if (oVar.mo11332h() || oVar2.mo11332h()) {
                return -1.0f;
            } else {
                return oVar.mo11326a(96.0f) / oVar2.mo11326a(96.0f);
            }
        } else {
            throw new IllegalArgumentException("SVG document is empty");
        }
    }

    /* renamed from: b */
    public final C1423a mo11296b(float f) {
        C1431c1 c1Var;
        C1431c1 c1Var2;
        C1431c1 c1Var3;
        C1431c1 c1Var4;
        float f2;
        C1431c1 c1Var5;
        C1445e0 e0Var = this.f1910a;
        C1465o oVar = e0Var.f2027r;
        C1465o oVar2 = e0Var.f2028s;
        if (oVar == null || oVar.mo11332h() || (c1Var = oVar.f2074h) == (c1Var2 = C1431c1.percent) || c1Var == (c1Var3 = C1431c1.em) || c1Var == (c1Var4 = C1431c1.ex)) {
            return new C1423a(-1.0f, -1.0f, -1.0f, -1.0f);
        }
        float a = oVar.mo11326a(f);
        if (oVar2 == null) {
            C1423a aVar = this.f1910a.f2091o;
            f2 = aVar != null ? (aVar.f1916d * a) / aVar.f1915c : a;
        } else if (oVar2.mo11332h() || (c1Var5 = oVar2.f2074h) == c1Var2 || c1Var5 == c1Var3 || c1Var5 == c1Var4) {
            return new C1423a(-1.0f, -1.0f, -1.0f, -1.0f);
        } else {
            f2 = oVar2.mo11326a(f);
        }
        return new C1423a(0.0f, 0.0f, a, f2);
    }

    /* renamed from: c */
    public float mo11297c() {
        if (this.f1910a != null) {
            return mo11296b(96.0f).f1916d;
        }
        throw new IllegalArgumentException("SVG document is empty");
    }

    /* renamed from: d */
    public float mo11298d() {
        if (this.f1910a != null) {
            return mo11296b(96.0f).f1915c;
        }
        throw new IllegalArgumentException("SVG document is empty");
    }

    /* renamed from: e */
    public final C1458k0 mo11299e(C1454i0 i0Var, String str) {
        C1458k0 e;
        C1458k0 k0Var = (C1458k0) i0Var;
        if (str.equals(k0Var.f2055c)) {
            return k0Var;
        }
        for (C1462m0 next : i0Var.mo11308c()) {
            if (next instanceof C1458k0) {
                C1458k0 k0Var2 = (C1458k0) next;
                if (str.equals(k0Var2.f2055c)) {
                    return k0Var2;
                }
                if ((next instanceof C1454i0) && (e = mo11299e((C1454i0) next, str)) != null) {
                    return e;
                }
            }
        }
        return null;
    }

    /* renamed from: f */
    public C1458k0 mo11300f(String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        if (str.equals(this.f1910a.f2055c)) {
            return this.f1910a;
        }
        if (this.f1912c.containsKey(str)) {
            return this.f1912c.get(str);
        }
        C1458k0 e = mo11299e(this.f1910a, str);
        this.f1912c.put(str, e);
        return e;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0063 A[RETURN] */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public p005b.p080i.p081a.C1422f.C1462m0 mo11301g(java.lang.String r5) {
        /*
            r4 = this;
            r0 = 0
            if (r5 != 0) goto L_0x0004
            return r0
        L_0x0004:
            java.lang.String r1 = "\""
            boolean r2 = r5.startsWith(r1)
            r3 = 1
            if (r2 == 0) goto L_0x001f
            boolean r2 = r5.endsWith(r1)
            if (r2 == 0) goto L_0x001f
            int r2 = r5.length()
            int r2 = r2 - r3
            java.lang.String r5 = r5.substring(r3, r2)
            java.lang.String r2 = "\\\""
            goto L_0x0038
        L_0x001f:
            java.lang.String r1 = "'"
            boolean r2 = r5.startsWith(r1)
            if (r2 == 0) goto L_0x003c
            boolean r2 = r5.endsWith(r1)
            if (r2 == 0) goto L_0x003c
            int r2 = r5.length()
            int r2 = r2 - r3
            java.lang.String r5 = r5.substring(r3, r2)
            java.lang.String r2 = "\\'"
        L_0x0038:
            java.lang.String r5 = r5.replace(r2, r1)
        L_0x003c:
            java.lang.String r1 = "\\\n"
            java.lang.String r2 = ""
            java.lang.String r5 = r5.replace(r1, r2)
            java.lang.String r1 = "\\A"
            java.lang.String r2 = "\n"
            java.lang.String r5 = r5.replace(r1, r2)
            int r1 = r5.length()
            if (r1 <= r3) goto L_0x0063
            java.lang.String r1 = "#"
            boolean r1 = r5.startsWith(r1)
            if (r1 == 0) goto L_0x0063
            java.lang.String r5 = r5.substring(r3)
            b.i.a.f$k0 r5 = r4.mo11300f(r5)
            return r5
        L_0x0063:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p080i.p081a.C1422f.mo11301g(java.lang.String):b.i.a.f$m0");
    }

    /* renamed from: h */
    public void mo11302h(float f) {
        C1445e0 e0Var = this.f1910a;
        if (e0Var != null) {
            e0Var.f2028s = new C1465o(f);
            return;
        }
        throw new IllegalArgumentException("SVG document is empty");
    }

    /* renamed from: i */
    public void mo11303i(float f) {
        C1445e0 e0Var = this.f1910a;
        if (e0Var != null) {
            e0Var.f2027r = new C1465o(f);
            return;
        }
        throw new IllegalArgumentException("SVG document is empty");
    }
}
