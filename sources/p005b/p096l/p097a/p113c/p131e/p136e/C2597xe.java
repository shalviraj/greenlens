package p005b.p096l.p097a.p113c.p131e.p136e;

import android.text.TextUtils;
import android.util.Base64;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import p005b.p006a.p007a.p024o.C0823f;

/* renamed from: b.l.a.c.e.e.xe */
public final class C2597xe implements C2116dj<C2143el> {

    /* renamed from: a */
    public final /* synthetic */ C2118dl f4440a;

    /* renamed from: b */
    public final /* synthetic */ C2192gk f4441b;

    /* renamed from: c */
    public final /* synthetic */ C2648zh f4442c;

    /* renamed from: d */
    public final /* synthetic */ C2363nk f4443d;

    /* renamed from: e */
    public final /* synthetic */ C2116dj f4444e;

    public C2597xe(C2263jg jgVar, C2118dl dlVar, C2192gk gkVar, C2648zh zhVar, C2363nk nkVar, C2116dj djVar) {
        this.f4440a = dlVar;
        this.f4441b = gkVar;
        this.f4442c = zhVar;
        this.f4443d = nkVar;
        this.f4444e = djVar;
    }

    /* renamed from: a */
    public final void mo12389a(Object obj) {
        String str;
        C2143el elVar = (C2143el) obj;
        List<C2507tk> list = null;
        if (this.f4440a.mo12537b("EMAIL")) {
            this.f4441b.f3891h = null;
        } else {
            String str2 = this.f4440a.f3735i;
            if (str2 != null) {
                this.f4441b.f3891h = str2;
            }
        }
        if (this.f4440a.mo12537b("DISPLAY_NAME")) {
            this.f4441b.f3893j = null;
        } else {
            String str3 = this.f4440a.f3734h;
            if (str3 != null) {
                this.f4441b.f3893j = str3;
            }
        }
        if (this.f4440a.mo12537b("PHOTO_URL")) {
            this.f4441b.f3894k = null;
        } else {
            String str4 = this.f4440a.f3738l;
            if (str4 != null) {
                this.f4441b.f3894k = str4;
            }
        }
        if (!TextUtils.isEmpty(this.f4440a.f3736j)) {
            C2192gk gkVar = this.f4441b;
            byte[] bytes = "redacted".getBytes();
            if (bytes == null) {
                str = null;
            } else {
                str = Base64.encodeToString(bytes, 0);
            }
            Objects.requireNonNull(gkVar);
            C0823f.m376j(str);
            gkVar.f3896m = str;
        }
        C2555vk vkVar = elVar.f3833h;
        if (vkVar != null) {
            list = vkVar.f4373g;
        }
        if (list == null) {
            list = new ArrayList<>();
        }
        C2192gk gkVar2 = this.f4441b;
        Objects.requireNonNull(gkVar2);
        C2555vk vkVar2 = new C2555vk();
        gkVar2.f3895l = vkVar2;
        vkVar2.f4373g.addAll(list);
        C2648zh zhVar = this.f4442c;
        C2363nk nkVar = this.f4443d;
        Objects.requireNonNull(nkVar, "null reference");
        String str5 = elVar.f3834i;
        String str6 = elVar.f3835j;
        if (!TextUtils.isEmpty(str5) && !TextUtils.isEmpty(str6)) {
            nkVar = new C2363nk(str6, str5, Long.valueOf(elVar.f3836k), nkVar.f4106j);
        }
        zhVar.mo13137a(nkVar, this.f4441b);
    }

    /* renamed from: d */
    public final void mo12390d(@Nullable String str) {
        this.f4444e.mo12390d(str);
    }
}
