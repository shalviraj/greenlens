package p005b.p096l.p097a.p113c.p131e.p136e;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import java.util.List;
import p005b.p096l.p180d.p185o.C3919n0;

/* renamed from: b.l.a.c.e.e.ye */
public final class C2621ye implements C2116dj<C2142ek> {

    /* renamed from: a */
    public final /* synthetic */ C2116dj f4487a;

    /* renamed from: b */
    public final /* synthetic */ String f4488b;

    /* renamed from: c */
    public final /* synthetic */ String f4489c;

    /* renamed from: d */
    public final /* synthetic */ Boolean f4490d;

    /* renamed from: e */
    public final /* synthetic */ C3919n0 f4491e;

    /* renamed from: f */
    public final /* synthetic */ C2648zh f4492f;

    /* renamed from: g */
    public final /* synthetic */ C2363nk f4493g;

    public C2621ye(C2116dj djVar, String str, String str2, Boolean bool, C3919n0 n0Var, C2648zh zhVar, C2363nk nkVar) {
        this.f4487a = djVar;
        this.f4488b = str;
        this.f4489c = str2;
        this.f4490d = bool;
        this.f4491e = n0Var;
        this.f4492f = zhVar;
        this.f4493g = nkVar;
    }

    /* renamed from: a */
    public final void mo12389a(Object obj) {
        List<C2192gk> list = ((C2142ek) obj).f3830g.f3947g;
        if (list == null || list.isEmpty()) {
            this.f4487a.mo12390d("No users.");
            return;
        }
        int i = 0;
        C2192gk gkVar = list.get(0);
        C2555vk vkVar = gkVar.f3895l;
        List<C2507tk> list2 = vkVar != null ? vkVar.f4373g : null;
        if (list2 != null && !list2.isEmpty()) {
            if (!TextUtils.isEmpty(this.f4488b)) {
                while (true) {
                    if (i >= list2.size()) {
                        break;
                    } else if (list2.get(i).f4325j.equals(this.f4488b)) {
                        break;
                    } else {
                        i++;
                    }
                }
            }
            list2.get(i).f4326k = this.f4489c;
        }
        gkVar.f3900q = this.f4490d.booleanValue();
        gkVar.f3901r = this.f4491e;
        this.f4492f.mo13137a(this.f4493g, gkVar);
    }

    /* renamed from: d */
    public final void mo12390d(@Nullable String str) {
        this.f4487a.mo12390d(str);
    }
}
