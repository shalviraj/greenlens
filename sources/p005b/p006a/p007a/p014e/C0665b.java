package p005b.p006a.p007a.p014e;

import android.content.IntentSender;
import android.os.Build;
import com.appfoundry.previewer.activities.BravoActivity;
import p005b.p096l.p097a.p151d.p152a.p153a.C3448a;
import p005b.p096l.p097a.p151d.p152a.p153a.C3450c;
import p005b.p096l.p097a.p151d.p152a.p157d.C3571b;
import p005b.p096l.p097a.p151d.p152a.p163i.C3636c;
import p441p.p442a.C8091a;

/* renamed from: b.a.a.e.b */
public final class C0665b<ResultT> implements C3636c<C3448a> {

    /* renamed from: a */
    public final /* synthetic */ BravoActivity f356a;

    public C0665b(BravoActivity bravoActivity) {
        this.f356a = bravoActivity;
    }

    /* renamed from: a */
    public void mo10458a(Object obj) {
        C3448a aVar = (C3448a) obj;
        if (aVar.mo14725o() == 2) {
            try {
                Integer num = aVar.mo14720j(C3450c.m6594c(0)) != null ? 0 : null;
                if (num != null) {
                    if (num.intValue() == 0) {
                        BravoActivity bravoActivity = this.f356a;
                        int i = BravoActivity.f10754o;
                        bravoActivity.mo18420s().mo14729c((C3571b) this.f356a.f10762n.getValue());
                    }
                }
                if (num != null) {
                    BravoActivity bravoActivity2 = this.f356a;
                    int i2 = BravoActivity.f10754o;
                    bravoActivity2.mo18420s().mo14730d(aVar, num.intValue(), this.f356a, 55);
                    return;
                }
                C8091a.f16272d.mo26044b("Google Play In-App Updates not allowed: %s - %s - %s", Build.BRAND, Build.MODEL, Build.PRODUCT);
            } catch (IntentSender.SendIntentException e) {
                e.printStackTrace();
            }
        }
    }
}
