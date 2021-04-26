package p005b.p006a.p007a.p018i;

import androidx.fragment.app.FragmentTransaction;
import p005b.p006a.p007a.p008a.C0594b;
import p298d.p344x.p345b.C6862l;
import p298d.p344x.p346c.C6888i;
import p298d.p344x.p346c.C6890k;

/* renamed from: b.a.a.i.a */
public final class C0739a extends C6890k implements C6862l<FragmentTransaction, FragmentTransaction> {

    /* renamed from: g */
    public final /* synthetic */ int f448g;

    /* renamed from: h */
    public final /* synthetic */ C0594b f449h;

    /* renamed from: i */
    public final /* synthetic */ String f450i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0739a(int i, C0594b bVar, String str) {
        super(1);
        this.f448g = i;
        this.f449h = bVar;
        this.f450i = str;
    }

    public Object invoke(Object obj) {
        FragmentTransaction fragmentTransaction = (FragmentTransaction) obj;
        C6888i.m12438e(fragmentTransaction, "$receiver");
        int i = this.f448g;
        C0594b bVar = this.f449h;
        C6888i.m12436c(bVar);
        FragmentTransaction add = fragmentTransaction.add(i, bVar, this.f450i);
        C6888i.m12437d(add, "add(frameId, fragment!!, fragmentTag)");
        return add;
    }
}
