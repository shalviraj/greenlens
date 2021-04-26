package p005b.p006a.p007a.p021l;

import com.google.api.client.auth.oauth2.TokenErrorResponse;
import com.google.api.client.auth.oauth2.TokenResponse;
import p005b.p096l.p164b.p165a.p166a.p168b.C3663f;
import p005b.p096l.p164b.p165a.p166a.p168b.C3666g;

/* renamed from: b.a.a.l.e */
public final class C0790e implements C3666g {

    /* renamed from: a */
    public final /* synthetic */ C0785b f581a;

    public C0790e(C0785b bVar) {
        this.f581a = bVar;
    }

    /* renamed from: a */
    public void mo10623a(C3663f fVar, TokenErrorResponse tokenErrorResponse) {
        C0794i iVar = this.f581a.f567d;
        if (iVar != null && iVar != null) {
            iVar.mo10327a(String.valueOf(tokenErrorResponse));
        }
    }

    /* renamed from: b */
    public void mo10624b(C3663f fVar, TokenResponse tokenResponse) {
        C0794i iVar = this.f581a.f567d;
        if (iVar != null) {
            iVar.mo10328b(fVar);
        }
    }
}
