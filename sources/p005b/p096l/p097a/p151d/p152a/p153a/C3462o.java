package p005b.p096l.p097a.p151d.p152a.p153a;

import android.app.PendingIntent;
import android.os.Bundle;
import java.io.File;
import java.util.Objects;
import p005b.p096l.p097a.p151d.p152a.p157d.C3570a;
import p005b.p096l.p097a.p151d.p152a.p159e.C3584f;
import p005b.p096l.p097a.p151d.p152a.p163i.C3647n;

/* renamed from: b.l.a.d.a.a.o */
public final class C3462o extends C3460m<C3448a> {

    /* renamed from: d */
    public final String f6262d;

    /* renamed from: e */
    public final /* synthetic */ C3463p f6263e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C3462o(C3463p pVar, C3647n<C3448a> nVar, String str) {
        super(pVar, new C3584f("OnRequestInstallCallback"), nVar);
        this.f6263e = pVar;
        this.f6262d = str;
    }

    /* renamed from: X0 */
    public final void mo14739X0(Bundle bundle) {
        Bundle bundle2 = bundle;
        this.f6261c.f6266a.mo14905b();
        this.f6259a.mo14884b(4, "onRequestInfo", new Object[0]);
        if (bundle2.getInt("error.code", -2) != 0) {
            this.f6260b.mo14928a(new C3570a(bundle2.getInt("error.code", -2)));
            return;
        }
        C3647n<T> nVar = this.f6260b;
        C3463p pVar = this.f6263e;
        String str = this.f6262d;
        int i = bundle2.getInt("version.code", -1);
        int i2 = bundle2.getInt("update.availability");
        int i3 = bundle2.getInt("install.status", 0);
        Integer valueOf = bundle2.getInt("client.version.staleness", -1) == -1 ? null : Integer.valueOf(bundle2.getInt("client.version.staleness"));
        int i4 = bundle2.getInt("in.app.update.priority", 0);
        long j = bundle2.getLong("bytes.downloaded");
        long j2 = bundle2.getLong("total.bytes.to.download");
        long j3 = bundle2.getLong("additional.size.required");
        C3465r rVar = pVar.f6269d;
        Objects.requireNonNull(rVar);
        nVar.mo14929b(new C3466s(str, i, i2, i3, valueOf, i4, j, j2, j3, C3465r.m6617a(new File(rVar.f6272a.getFilesDir(), "assetpacks")), (PendingIntent) bundle2.getParcelable("blocking.intent"), (PendingIntent) bundle2.getParcelable("nonblocking.intent"), (PendingIntent) bundle2.getParcelable("blocking.destructive.intent"), (PendingIntent) bundle2.getParcelable("nonblocking.destructive.intent")));
    }
}
