package p005b.p040g.p041a.p049j;

import androidx.annotation.Nullable;
import java.util.Date;
import p005b.p096l.p224e.p225d0.C4343b;

/* renamed from: b.g.a.j.a */
public class C0921a {
    @C4343b("access_token")

    /* renamed from: a */
    public String f824a;
    @C4343b("token_type")

    /* renamed from: b */
    public String f825b;
    @C4343b("id_token")

    /* renamed from: c */
    public String f826c;
    @C4343b("refresh_token")

    /* renamed from: d */
    public String f827d;
    @C4343b("scope")

    /* renamed from: e */
    public String f828e;
    @C4343b("expires_at")

    /* renamed from: f */
    public Date f829f;

    public C0921a(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable Date date, @Nullable String str5) {
        this.f826c = str;
        this.f824a = str2;
        this.f825b = str3;
        this.f827d = str4;
        this.f828e = str5;
        this.f829f = date;
        if (date != null) {
            long time = (date.getTime() - System.currentTimeMillis()) / 1000;
        }
    }
}
