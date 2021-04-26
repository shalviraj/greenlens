package p005b.p096l.p164b.p165a.p166a.p168b;

import com.google.api.client.auth.oauth2.TokenErrorResponse;
import com.google.api.client.auth.oauth2.TokenResponse;
import java.util.Objects;

@Deprecated
/* renamed from: b.l.b.a.a.b.i */
public final class C3668i implements C3666g {

    /* renamed from: a */
    public final C3667h f6746a;

    /* renamed from: b */
    public final String f6747b;

    public C3668i(String str, C3667h hVar) {
        Objects.requireNonNull(str);
        this.f6747b = str;
        Objects.requireNonNull(hVar);
        this.f6746a = hVar;
    }

    /* renamed from: a */
    public void mo10623a(C3663f fVar, TokenErrorResponse tokenErrorResponse) {
        this.f6746a.store(this.f6747b, fVar);
    }

    /* renamed from: b */
    public void mo10624b(C3663f fVar, TokenResponse tokenResponse) {
        this.f6746a.store(this.f6747b, fVar);
    }
}
