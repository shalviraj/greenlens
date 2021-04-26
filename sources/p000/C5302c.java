package p000;

import android.content.DialogInterface;
import com.appfoundry.previewer.BravoApp;
import java.util.List;
import p005b.p006a.p007a.p019j.C0778i;
import p005b.p006a.p007a.p023n.C0817f;
import p005b.p038f.p039a.C0849e;
import p005b.p273o.C4815d3;
import p005b.p273o.C4857i2;
import p005b.p273o.C4886k;
import p298d.p344x.p346c.C6888i;
import p441p.p442a.C8091a;

/* renamed from: c */
/* compiled from: java-style lambda group */
public final class C5302c implements DialogInterface.OnClickListener {

    /* renamed from: h */
    public static final C5302c f10643h = new C5302c(0);

    /* renamed from: i */
    public static final C5302c f10644i = new C5302c(1);

    /* renamed from: j */
    public static final C5302c f10645j = new C5302c(2);

    /* renamed from: g */
    public final /* synthetic */ int f10646g;

    public C5302c(int i) {
        this.f10646g = i;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        C4886k kVar;
        int i2 = this.f10646g;
        if (i2 == 0) {
            return;
        }
        if (i2 == 1) {
            String str = C4857i2.f9356a;
            String str2 = C4815d3.f9230a;
            boolean b = C4815d3.m8827b(str2, "ONESIGNAL_USER_PROVIDED_CONSENT", false);
            C4815d3.m8834i(str2, "ONESIGNAL_USER_PROVIDED_CONSENT", true);
            if (!b && (kVar = C4857i2.f9345O) != null) {
                C4857i2.m8953u(kVar.f9429a, kVar.f9430b, kVar.f9431c, kVar.f9432d, kVar.f9433e);
                C4857i2.f9345O = null;
            }
            C0817f fVar = C0817f.f641b;
            C0817f.m297e(C0849e.m507b() + "user_allowed_push");
            BravoApp.C5403b bVar = BravoApp.f10730N;
            List<C0778i> list = BravoApp.f10749y;
            C6888i.m12438e(list, "$this$hide");
            for (C0778i iVar : list) {
                iVar.f548b.setVisibility(4);
            }
            list.clear();
        } else if (i2 == 2) {
            C8091a.f16272d.mo26043a("User denied push notifications", new Object[0]);
        } else {
            throw null;
        }
    }
}
