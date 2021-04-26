package p005b.p096l.p180d;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import app.bravostudio.A01F41WRYKPX5KXQ68EGF1JX39R.R;
import java.util.Arrays;
import java.util.Objects;
import p005b.p006a.p007a.p024o.C0823f;
import p005b.p096l.p097a.p113c.p119b.p122m.C1941q0;
import p005b.p096l.p097a.p113c.p119b.p122m.C1942r;
import p005b.p096l.p097a.p113c.p119b.p126p.C1963g;

/* renamed from: b.l.d.l */
public final class C3838l {

    /* renamed from: a */
    public final String f7058a;

    /* renamed from: b */
    public final String f7059b;

    /* renamed from: c */
    public final String f7060c;

    /* renamed from: d */
    public final String f7061d;

    /* renamed from: e */
    public final String f7062e;

    /* renamed from: f */
    public final String f7063f;

    /* renamed from: g */
    public final String f7064g;

    public C3838l(@NonNull String str, @NonNull String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7) {
        C0823f.m386o(!C1963g.m2881b(str), "ApplicationId must be set.");
        this.f7059b = str;
        this.f7058a = str2;
        this.f7060c = str3;
        this.f7061d = str4;
        this.f7062e = str5;
        this.f7063f = str6;
        this.f7064g = str7;
    }

    @Nullable
    /* renamed from: a */
    public static C3838l m7223a(@NonNull Context context) {
        Objects.requireNonNull(context, "null reference");
        Resources resources = context.getResources();
        String resourcePackageName = resources.getResourcePackageName(R.string.common_google_play_services_unknown_issue);
        int identifier = resources.getIdentifier("google_app_id", "string", resourcePackageName);
        String str = null;
        String string = identifier == 0 ? null : resources.getString(identifier);
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        int identifier2 = resources.getIdentifier("google_api_key", "string", resourcePackageName);
        String string2 = identifier2 == 0 ? null : resources.getString(identifier2);
        int identifier3 = resources.getIdentifier("firebase_database_url", "string", resourcePackageName);
        String string3 = identifier3 == 0 ? null : resources.getString(identifier3);
        int identifier4 = resources.getIdentifier("ga_trackingId", "string", resourcePackageName);
        String string4 = identifier4 == 0 ? null : resources.getString(identifier4);
        int identifier5 = resources.getIdentifier("gcm_defaultSenderId", "string", resourcePackageName);
        String string5 = identifier5 == 0 ? null : resources.getString(identifier5);
        int identifier6 = resources.getIdentifier("google_storage_bucket", "string", resourcePackageName);
        String string6 = identifier6 == 0 ? null : resources.getString(identifier6);
        int identifier7 = resources.getIdentifier("project_id", "string", resourcePackageName);
        if (identifier7 != 0) {
            str = resources.getString(identifier7);
        }
        return new C3838l(string, string2, string3, string4, string5, string6, str);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C3838l)) {
            return false;
        }
        C3838l lVar = (C3838l) obj;
        return C0823f.m330A(this.f7059b, lVar.f7059b) && C0823f.m330A(this.f7058a, lVar.f7058a) && C0823f.m330A(this.f7060c, lVar.f7060c) && C0823f.m330A(this.f7061d, lVar.f7061d) && C0823f.m330A(this.f7062e, lVar.f7062e) && C0823f.m330A(this.f7063f, lVar.f7063f) && C0823f.m330A(this.f7064g, lVar.f7064g);
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f7059b, this.f7058a, this.f7060c, this.f7061d, this.f7062e, this.f7063f, this.f7064g});
    }

    public String toString() {
        C1942r rVar = new C1942r(this, (C1941q0) null);
        rVar.mo12270a("applicationId", this.f7059b);
        rVar.mo12270a("apiKey", this.f7058a);
        rVar.mo12270a("databaseUrl", this.f7060c);
        rVar.mo12270a("gcmSenderId", this.f7062e);
        rVar.mo12270a("storageBucket", this.f7063f);
        rVar.mo12270a("projectId", this.f7064g);
        return rVar.toString();
    }
}
