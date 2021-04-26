package p005b.p096l.p097a.p113c.p145h.p147b;

import android.os.SystemClock;
import android.util.Pair;
import androidx.annotation.WorkerThread;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.Locale;
import java.util.Objects;
import p005b.p096l.p097a.p113c.p119b.p126p.C1959c;
import p005b.p096l.p097a.p113c.p131e.p140i.C2980u8;

/* renamed from: b.l.a.c.h.b.g8 */
public final class C3186g8 extends C3395z8 {

    /* renamed from: d */
    public String f5556d;

    /* renamed from: e */
    public boolean f5557e;

    /* renamed from: f */
    public long f5558f;

    /* renamed from: g */
    public final C3379y3 f5559g;

    /* renamed from: h */
    public final C3379y3 f5560h;

    /* renamed from: i */
    public final C3379y3 f5561i;

    /* renamed from: j */
    public final C3379y3 f5562j;

    /* renamed from: k */
    public final C3379y3 f5563k;

    public C3186g8(C3220j9 j9Var) {
        super(j9Var);
        C3135c4 q = this.f5638a.mo14464q();
        q.getClass();
        this.f5559g = new C3379y3(q, "last_delete_stale", 0);
        C3135c4 q2 = this.f5638a.mo14464q();
        q2.getClass();
        this.f5560h = new C3379y3(q2, "backoff", 0);
        C3135c4 q3 = this.f5638a.mo14464q();
        q3.getClass();
        this.f5561i = new C3379y3(q3, "last_upload", 0);
        C3135c4 q4 = this.f5638a.mo14464q();
        q4.getClass();
        this.f5562j = new C3379y3(q4, "last_upload_attempt", 0);
        C3135c4 q5 = this.f5638a.mo14464q();
        q5.getClass();
        this.f5563k = new C3379y3(q5, "midnight_offset", 0);
    }

    /* renamed from: j */
    public final boolean mo14178j() {
        return false;
    }

    @WorkerThread
    /* renamed from: l */
    public final Pair<String, Boolean> mo14246l(String str, C3177g gVar) {
        C2980u8.m5384b();
        return (!this.f5638a.f5848g.mo14197r((String) null, C3134c3.f5415w0) || gVar.mo14233d()) ? mo14247m(str) : new Pair<>("", Boolean.FALSE);
    }

    @WorkerThread
    @Deprecated
    /* renamed from: m */
    public final Pair<String, Boolean> mo14247m(String str) {
        mo14126h();
        Objects.requireNonNull((C1959c) this.f5638a.f5855n);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        String str2 = this.f5556d;
        if (str2 != null && elapsedRealtime < this.f5558f) {
            return new Pair<>(str2, Boolean.valueOf(this.f5557e));
        }
        this.f5558f = this.f5638a.f5848g.mo14194o(str, C3134c3.f5372b) + elapsedRealtime;
        AdvertisingIdClient.setShouldSkipGmsCoreVersionCheck(true);
        try {
            AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(this.f5638a.f5842a);
            this.f5556d = "";
            String id = advertisingIdInfo.getId();
            if (id != null) {
                this.f5556d = id;
            }
            this.f5557e = advertisingIdInfo.isLimitAdTrackingEnabled();
        } catch (Exception e) {
            this.f5638a.mo14329d().f5806m.mo14415b("Unable to get advertising id", e);
            this.f5556d = "";
        }
        AdvertisingIdClient.setShouldSkipGmsCoreVersionCheck(false);
        return new Pair<>(this.f5556d, Boolean.valueOf(this.f5557e));
    }

    @WorkerThread
    @Deprecated
    /* renamed from: n */
    public final String mo14248n(String str) {
        mo14126h();
        String str2 = (String) mo14247m(str).first;
        MessageDigest B = C3297q9.m6335B();
        if (B == null) {
            return null;
        }
        return String.format(Locale.US, "%032X", new Object[]{new BigInteger(1, B.digest(str2.getBytes()))});
    }
}
