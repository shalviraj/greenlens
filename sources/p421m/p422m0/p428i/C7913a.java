package p421m.p422m0.p428i;

import java.util.ArrayList;
import java.util.Objects;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p298d.p344x.p346c.C6888i;
import p298d.p415c0.C7694h;
import p421m.C8022y;
import p435n.C8043g;

/* renamed from: m.m0.i.a */
public final class C7913a {

    /* renamed from: a */
    public long f15775a = ((long) 262144);

    /* renamed from: b */
    public final C8043g f15776b;

    public C7913a(C8043g gVar) {
        C6888i.m12438e(gVar, "source");
        this.f15776b = gVar;
    }

    /* renamed from: a */
    public final C8022y mo25668a() {
        ArrayList arrayList = new ArrayList(20);
        while (true) {
            String b = mo25669b();
            if (b.length() == 0) {
                Object[] array = arrayList.toArray(new String[0]);
                Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
                return new C8022y((String[]) array, (DefaultConstructorMarker) null);
            }
            C6888i.m12438e(b, "line");
            int k = C7694h.m13933k(b, ':', 1, false, 4);
            if (k != -1) {
                String substring = b.substring(0, k);
                C6888i.m12437d(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                b = b.substring(k + 1);
                C6888i.m12437d(b, "(this as java.lang.String).substring(startIndex)");
                C6888i.m12438e(substring, "name");
                C6888i.m12438e(b, "value");
                arrayList.add(substring);
            } else {
                if (b.charAt(0) == ':') {
                    b = b.substring(1);
                    C6888i.m12437d(b, "(this as java.lang.String).substring(startIndex)");
                }
                C6888i.m12438e("", "name");
                C6888i.m12438e(b, "value");
                arrayList.add("");
            }
            arrayList.add(C7694h.m13921L(b).toString());
        }
    }

    /* renamed from: b */
    public final String mo25669b() {
        String U = this.f15776b.mo25896U(this.f15775a);
        this.f15775a -= (long) U.length();
        return U;
    }
}
