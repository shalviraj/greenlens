package p005b.p006a.p007a.p018i;

import androidx.fragment.app.FragmentTransaction;
import p005b.p006a.p007a.p008a.C0594b;
import p298d.p344x.p345b.C6862l;
import p298d.p344x.p346c.C6888i;
import p298d.p344x.p346c.C6890k;

/* renamed from: b.a.a.i.b */
public final class C0741b extends C6890k implements C6862l<FragmentTransaction, FragmentTransaction> {

    /* renamed from: g */
    public final /* synthetic */ int f452g;

    /* renamed from: h */
    public final /* synthetic */ C0594b f453h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0741b(int i, C0594b bVar) {
        super(1);
        this.f452g = i;
        this.f453h = bVar;
    }

    public Object invoke(Object obj) {
        FragmentTransaction fragmentTransaction = (FragmentTransaction) obj;
        C6888i.m12438e(fragmentTransaction, "$receiver");
        int i = this.f452g;
        C0594b bVar = this.f453h;
        FragmentTransaction replace = fragmentTransaction.replace(i, bVar, bVar.getTag());
        C6888i.m12437d(replace, "replace(frameId, fragment, fragment.tag)");
        return replace;
    }
}
