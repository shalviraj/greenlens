package com.appfoundry.previewer.model;

import java.util.Objects;
import kotlin.Metadata;
import p005b.p280p.p281a.C5075l;
import p005b.p280p.p281a.C5081q;
import p005b.p280p.p281a.C5087u;
import p005b.p280p.p281a.C5099x;
import p298d.p334t.C6800r;
import p298d.p344x.p346c.C6888i;

@Metadata(mo24460bv = {1, 0, 3}, mo24461d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0004\u0010\u0005R\u001e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00018\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0016\u0010\t\u001a\u00020\b8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000f"}, mo24462d2 = {"Lcom/appfoundry/previewer/model/AuthSettingsJsonAdapter;", "Lb/p/a/l;", "Lcom/appfoundry/previewer/model/AuthSettings;", "", "toString", "()Ljava/lang/String;", "nullableStringAdapter", "Lb/p/a/l;", "Lb/p/a/q$a;", "options", "Lb/p/a/q$a;", "Lb/p/a/x;", "moshi", "<init>", "(Lb/p/a/x;)V", "app_debug"}, mo24463k = 1, mo24464mv = {1, 4, 2})
public final class AuthSettingsJsonAdapter extends C5075l<AuthSettings> {
    private final C5075l<String> nullableStringAdapter;
    private final C5081q.C5082a options;

    public AuthSettingsJsonAdapter(C5099x xVar) {
        C6888i.m12438e(xVar, "moshi");
        C5081q.C5082a a = C5081q.C5082a.m9296a("grant", "scope", "authUrl", "clientId", "tokenUrl", "callbackUrl", "clientSecret", "json", "jsonVision");
        C6888i.m12437d(a, "JsonReader.Options.of(\"g…t\", \"json\", \"jsonVision\")");
        this.options = a;
        C5075l<String> d = xVar.mo16932d(String.class, C6800r.f13715g, "grant");
        C6888i.m12437d(d, "moshi.adapter(String::cl…     emptySet(), \"grant\")");
        this.nullableStringAdapter = d;
    }

    /* renamed from: a */
    public Object mo16804a(C5081q qVar) {
        C6888i.m12438e(qVar, "reader");
        qVar.mo16840e();
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        String str9 = null;
        while (qVar.mo16835N()) {
            switch (qVar.mo16844n0(this.options)) {
                case -1:
                    qVar.mo16845o0();
                    qVar.mo16846p0();
                    break;
                case 0:
                    str = this.nullableStringAdapter.mo16804a(qVar);
                    break;
                case 1:
                    str2 = this.nullableStringAdapter.mo16804a(qVar);
                    break;
                case 2:
                    str3 = this.nullableStringAdapter.mo16804a(qVar);
                    break;
                case 3:
                    str4 = this.nullableStringAdapter.mo16804a(qVar);
                    break;
                case 4:
                    str5 = this.nullableStringAdapter.mo16804a(qVar);
                    break;
                case 5:
                    str6 = this.nullableStringAdapter.mo16804a(qVar);
                    break;
                case 6:
                    str7 = this.nullableStringAdapter.mo16804a(qVar);
                    break;
                case 7:
                    str8 = this.nullableStringAdapter.mo16804a(qVar);
                    break;
                case 8:
                    str9 = this.nullableStringAdapter.mo16804a(qVar);
                    break;
            }
        }
        qVar.mo16849z();
        return new AuthSettings(str, str2, str3, str4, str5, str6, str7, str8, str9);
    }

    /* renamed from: e */
    public void mo16805e(C5087u uVar, Object obj) {
        AuthSettings authSettings = (AuthSettings) obj;
        C6888i.m12438e(uVar, "writer");
        Objects.requireNonNull(authSettings, "value_ was null! Wrap in .nullSafe() to write nullable values.");
        uVar.mo16869e();
        uVar.mo16865O("grant");
        this.nullableStringAdapter.mo16805e(uVar, authSettings.f10906a);
        uVar.mo16865O("scope");
        this.nullableStringAdapter.mo16805e(uVar, authSettings.f10907b);
        uVar.mo16865O("authUrl");
        this.nullableStringAdapter.mo16805e(uVar, authSettings.f10908c);
        uVar.mo16865O("clientId");
        this.nullableStringAdapter.mo16805e(uVar, authSettings.f10909d);
        uVar.mo16865O("tokenUrl");
        this.nullableStringAdapter.mo16805e(uVar, authSettings.f10910e);
        uVar.mo16865O("callbackUrl");
        this.nullableStringAdapter.mo16805e(uVar, authSettings.f10911f);
        uVar.mo16865O("clientSecret");
        this.nullableStringAdapter.mo16805e(uVar, authSettings.f10912g);
        uVar.mo16865O("json");
        this.nullableStringAdapter.mo16805e(uVar, authSettings.f10913h);
        uVar.mo16865O("jsonVision");
        this.nullableStringAdapter.mo16805e(uVar, authSettings.f10914i);
        uVar.mo16864H();
    }

    public String toString() {
        C6888i.m12437d("GeneratedJsonAdapter(AuthSettings)", "StringBuilder(capacity).…builderAction).toString()");
        return "GeneratedJsonAdapter(AuthSettings)";
    }
}
