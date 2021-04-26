package p298d.p299a.p300a.p301a.p303y0.p304b.p309j1.p311b;

import java.lang.reflect.Member;
import p298d.p299a.C6728g;
import p298d.p344x.p345b.C6862l;
import p298d.p344x.p346c.C6886g;
import p298d.p344x.p346c.C6888i;
import p298d.p344x.p346c.C6902w;

/* renamed from: d.a.a.a.y0.b.j1.b.k */
public final /* synthetic */ class C6190k extends C6886g implements C6862l<Member, Boolean> {

    /* renamed from: p */
    public static final C6190k f12216p = new C6190k();

    public C6190k() {
        super(1);
    }

    public final String getName() {
        return "isSynthetic";
    }

    public Object invoke(Object obj) {
        Member member = (Member) obj;
        C6888i.m12438e(member, "p0");
        return Boolean.valueOf(member.isSynthetic());
    }

    /* renamed from: w */
    public final C6728g mo22957w() {
        return C6902w.m12460a(Member.class);
    }

    /* renamed from: y */
    public final String mo22958y() {
        return "isSynthetic()Z";
    }
}
