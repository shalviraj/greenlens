package p005b.p096l.p097a.p113c.p131e.p136e;

import androidx.annotation.Nullable;
import com.google.android.gms.common.api.Status;
import java.util.Objects;
import p005b.p006a.p007a.p024o.C0823f;
import p005b.p096l.p097a.p113c.p119b.p126p.C1960d;
import p005b.p096l.p180d.p185o.C3859c;
import p005b.p096l.p180d.p185o.C3938x;
import p005b.p096l.p180d.p185o.p189e0.C3886l;

/* renamed from: b.l.a.c.e.e.aj */
public final class C2041aj extends C2289ki {

    /* renamed from: a */
    public final /* synthetic */ C2091cj f3599a;

    public C2041aj(C2091cj cjVar) {
        this.f3599a = cjVar;
    }

    /* renamed from: H */
    public final void mo12395H(C2506tj tjVar) {
        int i = this.f3599a.f3675a;
        boolean z = i == 3;
        StringBuilder sb = new StringBuilder(36);
        sb.append("Unexpected response type ");
        sb.append(i);
        C0823f.m386o(z, sb.toString());
        C2091cj cjVar = this.f3599a;
        Objects.requireNonNull(cjVar);
        cjVar.mo12393c();
        C0823f.m386o(cjVar.f3688n, "no success or failure set on method implementation");
    }

    /* renamed from: H0 */
    public final void mo12396H0(String str) {
        int i = this.f3599a.f3675a;
        boolean z = i == 8;
        StringBuilder sb = new StringBuilder(36);
        sb.append("Unexpected response type ");
        sb.append(i);
        C0823f.m386o(z, sb.toString());
        C2091cj cjVar = this.f3599a;
        Objects.requireNonNull(cjVar);
        cjVar.f3688n = true;
        Objects.requireNonNull(this.f3599a);
        throw null;
    }

    /* renamed from: I */
    public final void mo12397I(C3938x xVar) {
        int i = this.f3599a.f3675a;
        boolean z = i == 8;
        StringBuilder sb = new StringBuilder(36);
        sb.append("Unexpected response type ");
        sb.append(i);
        C0823f.m386o(z, sb.toString());
        C2091cj cjVar = this.f3599a;
        cjVar.f3688n = true;
        Objects.requireNonNull(cjVar);
        throw null;
    }

    /* renamed from: O */
    public final void mo12398O(C2381oe oeVar) {
        mo12404k(oeVar.f4170g, oeVar.f4171h, oeVar.f4172i, oeVar.f4173j);
    }

    /* renamed from: Z0 */
    public final void mo12399Z0(Status status) {
        String str = status.f11284i;
        if (str != null) {
            if (str.contains("MISSING_MFA_PENDING_CREDENTIAL")) {
                status = new Status(17081);
            } else if (str.contains("MISSING_MFA_ENROLLMENT_ID")) {
                status = new Status(17082);
            } else if (str.contains("INVALID_MFA_PENDING_CREDENTIAL")) {
                status = new Status(17083);
            } else if (str.contains("MFA_ENROLLMENT_NOT_FOUND")) {
                status = new Status(17084);
            } else if (str.contains("ADMIN_ONLY_OPERATION")) {
                status = new Status(17085);
            } else if (str.contains("UNVERIFIED_EMAIL")) {
                status = new Status(17086);
            } else if (str.contains("SECOND_FACTOR_EXISTS")) {
                status = new Status(17087);
            } else if (str.contains("SECOND_FACTOR_LIMIT_EXCEEDED")) {
                status = new Status(17088);
            } else if (str.contains("UNSUPPORTED_FIRST_FACTOR")) {
                status = new Status(17089);
            } else if (str.contains("EMAIL_CHANGE_NEEDS_VERIFICATION")) {
                status = new Status(17090);
            }
        }
        C2091cj cjVar = this.f3599a;
        if (cjVar.f3675a != 8) {
            C3886l lVar = cjVar.f3680f;
            if (lVar != null) {
                lVar.mo15412a(status);
            }
            C2091cj cjVar2 = this.f3599a;
            cjVar2.f3688n = true;
            cjVar2.f3689o.mo12434a(null, status);
            return;
        }
        cjVar.f3688n = true;
        throw null;
    }

    /* renamed from: f */
    public final void mo12400f() {
        int i = this.f3599a.f3675a;
        boolean z = i == 5;
        StringBuilder sb = new StringBuilder(36);
        sb.append("Unexpected response type ");
        sb.append(i);
        C0823f.m386o(z, sb.toString());
        C2091cj.m3154i(this.f3599a);
    }

    /* renamed from: f1 */
    public final void mo12401f1(C2363nk nkVar, C2192gk gkVar) {
        int i = this.f3599a.f3675a;
        boolean z = i == 2;
        StringBuilder sb = new StringBuilder(37);
        sb.append("Unexpected response type: ");
        sb.append(i);
        C0823f.m386o(z, sb.toString());
        C2091cj cjVar = this.f3599a;
        cjVar.f3682h = nkVar;
        cjVar.f3683i = gkVar;
        cjVar.mo12393c();
        C0823f.m386o(cjVar.f3688n, "no success or failure set on method implementation");
    }

    /* renamed from: h */
    public final void mo12402h() {
        int i = this.f3599a.f3675a;
        boolean z = i == 6;
        StringBuilder sb = new StringBuilder(36);
        sb.append("Unexpected response type ");
        sb.append(i);
        C0823f.m386o(z, sb.toString());
        C2091cj.m3154i(this.f3599a);
    }

    /* renamed from: i1 */
    public final void mo12403i1(Status status, C3938x xVar) {
        int i = this.f3599a.f3675a;
        boolean z = i == 2;
        StringBuilder sb = new StringBuilder(36);
        sb.append("Unexpected response type ");
        sb.append(i);
        C0823f.m386o(z, sb.toString());
        mo12404k(status, xVar, (String) null, (String) null);
    }

    /* renamed from: k */
    public final void mo12404k(Status status, C3859c cVar, @Nullable String str, @Nullable String str2) {
        C3886l lVar = this.f3599a.f3680f;
        if (lVar != null) {
            lVar.mo15412a(status);
        }
        C2091cj cjVar = this.f3599a;
        cjVar.f3684j = cVar;
        cjVar.f3685k = str;
        cjVar.f3686l = str2;
        C3886l lVar2 = cjVar.f3680f;
        if (lVar2 != null) {
            lVar2.mo15412a(status);
        }
        C2091cj cjVar2 = this.f3599a;
        cjVar2.f3688n = true;
        cjVar2.f3689o.mo12434a(null, status);
    }

    /* renamed from: l */
    public final void mo12405l() {
        int i = this.f3599a.f3675a;
        boolean z = i == 9;
        StringBuilder sb = new StringBuilder(36);
        sb.append("Unexpected response type ");
        sb.append(i);
        C0823f.m386o(z, sb.toString());
        C2091cj.m3154i(this.f3599a);
    }

    /* renamed from: l0 */
    public final void mo12406l0(C2429qe qeVar) {
        C2091cj cjVar = this.f3599a;
        cjVar.f3687m = qeVar;
        Status Y0 = C1960d.m2768Y0("REQUIRES_SECOND_FACTOR_AUTH");
        cjVar.f3688n = true;
        cjVar.f3689o.mo12434a(null, Y0);
    }

    /* renamed from: m */
    public final void mo12407m(String str) {
        int i = this.f3599a.f3675a;
        boolean z = i == 8;
        StringBuilder sb = new StringBuilder(36);
        sb.append("Unexpected response type ");
        sb.append(i);
        C0823f.m386o(z, sb.toString());
        Objects.requireNonNull(this.f3599a);
        Objects.requireNonNull(this.f3599a);
        throw null;
    }

    /* renamed from: m0 */
    public final void mo12408m0(String str) {
        int i = this.f3599a.f3675a;
        boolean z = i == 7;
        StringBuilder sb = new StringBuilder(36);
        sb.append("Unexpected response type ");
        sb.append(i);
        C0823f.m386o(z, sb.toString());
        C2091cj cjVar = this.f3599a;
        Objects.requireNonNull(cjVar);
        cjVar.mo12393c();
        C0823f.m386o(cjVar.f3688n, "no success or failure set on method implementation");
    }

    /* renamed from: t */
    public final void mo12409t(@Nullable C2627yk ykVar) {
        int i = this.f3599a.f3675a;
        boolean z = i == 4;
        StringBuilder sb = new StringBuilder(36);
        sb.append("Unexpected response type ");
        sb.append(i);
        C0823f.m386o(z, sb.toString());
        C2091cj cjVar = this.f3599a;
        Objects.requireNonNull(cjVar);
        cjVar.mo12393c();
        C0823f.m386o(cjVar.f3688n, "no success or failure set on method implementation");
    }

    /* renamed from: v0 */
    public final void mo12410v0(C2363nk nkVar) {
        int i = this.f3599a.f3675a;
        boolean z = true;
        if (i != 1) {
            z = false;
        }
        StringBuilder sb = new StringBuilder(37);
        sb.append("Unexpected response type: ");
        sb.append(i);
        C0823f.m386o(z, sb.toString());
        C2091cj cjVar = this.f3599a;
        cjVar.f3682h = nkVar;
        cjVar.mo12393c();
        C0823f.m386o(cjVar.f3688n, "no success or failure set on method implementation");
    }
}
