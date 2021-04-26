package p005b.p040g.p041a.p042e.p043f;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import java.util.Date;
import java.util.Objects;
import p005b.p006a.p007a.p024o.C0823f;
import p005b.p040g.p041a.p042e.C0855b;
import p005b.p040g.p041a.p045g.C0874e;
import p005b.p040g.p041a.p049j.C0921a;
import p005b.p096l.p224e.C4465k;

@RequiresApi(api = 21)
/* renamed from: b.g.a.e.f.h */
public class C0866h {

    /* renamed from: g */
    public static final String f730g = "h";

    /* renamed from: a */
    public final C0855b f731a;

    /* renamed from: b */
    public final C0868j f732b;

    /* renamed from: c */
    public final C0862d f733c;

    /* renamed from: d */
    public final C4465k f734d;

    /* renamed from: e */
    public final C0864f f735e;

    /* renamed from: f */
    public int f736f = -1;

    public C0866h(@NonNull Context context, @NonNull C0855b bVar, @NonNull C0868j jVar) {
        C0862d dVar = new C0862d(context, jVar, "com.auth0.key");
        C0864f fVar = new C0864f();
        this.f731a = bVar;
        this.f732b = jVar;
        this.f733c = dVar;
        this.f734d = C0823f.m358a();
        this.f735e = fVar;
    }

    /* renamed from: a */
    public void mo10702a() {
        this.f732b.mo10709e("com.auth0.credentials");
        this.f732b.mo10709e("com.auth0.credentials_expires_at");
        this.f732b.mo10709e("com.auth0.credentials_can_refresh");
        Log.d(f730g, "Credentials were just removed from the storage");
    }

    /* renamed from: b */
    public boolean mo10703b() {
        String g = this.f732b.mo10711g("com.auth0.credentials");
        Long a = this.f732b.mo10705a("com.auth0.credentials_expires_at");
        Boolean c = this.f732b.mo10707c("com.auth0.credentials_can_refresh");
        return !TextUtils.isEmpty(g) && a != null && (a.longValue() > System.currentTimeMillis() || (c != null && c.booleanValue()));
    }

    /* renamed from: c */
    public void mo10704c(@NonNull C0921a aVar) {
        Date date;
        if ((!TextUtils.isEmpty(aVar.f824a) || !TextUtils.isEmpty(aVar.f826c)) && (date = aVar.f829f) != null) {
            long time = date.getTime();
            String str = aVar.f826c;
            if (str != null) {
                Objects.requireNonNull(this.f735e);
                Date date2 = new C0874e(str).f741i.f744c;
                if (date2 != null) {
                    time = Math.min(date2.getTime(), time);
                }
            }
            String i = this.f734d.mo16123i(aVar);
            boolean z = !TextUtils.isEmpty(aVar.f827d);
            Log.d(f730g, "Trying to encrypt the given data using the private key.");
            try {
                this.f732b.mo10706b("com.auth0.credentials", Base64.encodeToString(this.f733c.mo10696d(i.getBytes()), 0));
                this.f732b.mo10710f("com.auth0.credentials_expires_at", Long.valueOf(time));
                this.f732b.mo10708d("com.auth0.credentials_can_refresh", Boolean.valueOf(z));
            } catch (C0863e e) {
                throw new C0860b(String.format("This device is not compatible with the %s class.", new Object[]{C0866h.class.getSimpleName()}), e);
            } catch (C0861c e2) {
                mo10702a();
                throw new C0860b("A change on the Lock Screen security settings have deemed the encryption keys invalid and have been recreated. Please, try saving the credentials again.", e2);
            }
        } else {
            throw new C0860b("Credentials must have a valid date of expiration and a valid access_token or id_token value.");
        }
    }
}
