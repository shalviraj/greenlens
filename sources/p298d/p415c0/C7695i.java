package p298d.p415c0;

import p298d.C6768j;
import p298d.p344x.p345b.C6866p;
import p298d.p344x.p346c.C6888i;
import p298d.p344x.p346c.C6890k;

/* renamed from: d.c0.i */
public final class C7695i extends C6890k implements C6866p<CharSequence, Integer, C6768j<? extends Integer, ? extends Integer>> {

    /* renamed from: g */
    public final /* synthetic */ char[] f15230g;

    /* renamed from: h */
    public final /* synthetic */ boolean f15231h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C7695i(char[] cArr, boolean z) {
        super(2);
        this.f15230g = cArr;
        this.f15231h = z;
    }

    public Object invoke(Object obj, Object obj2) {
        CharSequence charSequence = (CharSequence) obj;
        int intValue = ((Number) obj2).intValue();
        C6888i.m12438e(charSequence, "$receiver");
        int m = C7694h.m13935m(charSequence, this.f15230g, intValue, this.f15231h);
        if (m < 0) {
            return null;
        }
        return new C6768j(Integer.valueOf(m), 1);
    }
}
