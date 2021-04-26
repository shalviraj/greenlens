package p005b.p096l.p164b.p165a.p166a.p168b;

import com.google.api.client.auth.oauth2.TokenRequest;
import p005b.p096l.p164b.p165a.p169b.C3675d;
import p005b.p096l.p164b.p165a.p169b.C3677f;
import p005b.p096l.p164b.p165a.p169b.C3678g;

/* renamed from: b.l.b.a.a.b.j */
public class C3669j implements C3678g {

    /* renamed from: a */
    public final /* synthetic */ TokenRequest f6748a;

    /* renamed from: b.l.b.a.a.b.j$a */
    public class C3670a implements C3675d {

        /* renamed from: a */
        public final /* synthetic */ C3675d f6749a;

        public C3670a(C3675d dVar) {
            this.f6749a = dVar;
        }

        public void intercept(C3677f fVar) {
            C3675d dVar = this.f6749a;
            if (dVar != null) {
                dVar.intercept(fVar);
            }
            C3675d dVar2 = C3669j.this.f6748a.clientAuthentication;
            if (dVar2 != null) {
                dVar2.intercept(fVar);
            }
        }
    }

    public C3669j(TokenRequest tokenRequest) {
        this.f6748a = tokenRequest;
    }

    public void initialize(C3677f fVar) {
        C3678g gVar = this.f6748a.requestInitializer;
        if (gVar != null) {
            gVar.initialize(fVar);
        }
        fVar.f6765a = new C3670a(fVar.f6765a);
    }
}
