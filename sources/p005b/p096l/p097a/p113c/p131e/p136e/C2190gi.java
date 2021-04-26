package p005b.p096l.p097a.p113c.p131e.p136e;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.google.android.gms.common.api.Status;
import java.net.HttpURLConnection;
import java.net.URL;
import p005b.p096l.p097a.p113c.p119b.p124n.C1955a;

/* renamed from: b.l.a.c.e.e.gi */
public interface C2190gi {

    /* renamed from: b */
    public static final C1955a f3889b = new C1955a("FirebaseAuth", "GetAuthDomainTaskResponseHandler");

    /* renamed from: i */
    Context mo12681i();

    /* renamed from: j */
    String mo12682j(String str);

    /* renamed from: k */
    void mo12683k(Uri uri, String str);

    /* renamed from: l */
    Uri.Builder mo12684l(Intent intent, String str, String str2);

    /* renamed from: m */
    HttpURLConnection mo12685m(URL url);

    /* renamed from: n */
    void mo12686n(String str, Status status);
}
