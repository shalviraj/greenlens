package com.appfoundry.previewer.model;

import java.util.Objects;
import kotlin.Metadata;
import p005b.p280p.p281a.C5075l;
import p005b.p280p.p281a.C5081q;
import p005b.p280p.p281a.C5087u;
import p005b.p280p.p281a.C5099x;
import p298d.p334t.C6800r;
import p298d.p344x.p346c.C6888i;

@Metadata(mo24460bv = {1, 0, 3}, mo24461d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0004\u0010\u0005R\u001e\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00018\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0016\u0010\n\u001a\u00020\t8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u001e\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u00018\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010\bR\u001e\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00018\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\b¨\u0006\u0013"}, mo24462d2 = {"Lcom/appfoundry/previewer/model/AuthInfoFromBackendJsonAdapter;", "Lb/p/a/l;", "Lcom/appfoundry/previewer/model/AuthInfoFromBackend;", "", "toString", "()Ljava/lang/String;", "Lcom/appfoundry/previewer/model/AuthSettings;", "nullableAuthSettingsAdapter", "Lb/p/a/l;", "Lb/p/a/q$a;", "options", "Lb/p/a/q$a;", "", "nullableBooleanAdapter", "nullableStringAdapter", "Lb/p/a/x;", "moshi", "<init>", "(Lb/p/a/x;)V", "app_debug"}, mo24463k = 1, mo24464mv = {1, 4, 2})
public final class AuthInfoFromBackendJsonAdapter extends C5075l<AuthInfoFromBackend> {
    private final C5075l<AuthSettings> nullableAuthSettingsAdapter;
    private final C5075l<Boolean> nullableBooleanAdapter;
    private final C5075l<String> nullableStringAdapter;
    private final C5081q.C5082a options;

    public AuthInfoFromBackendJsonAdapter(C5099x xVar) {
        C6888i.m12438e(xVar, "moshi");
        C5081q.C5082a a = C5081q.C5082a.m9296a("collectionId", "type", "interactive", "settings");
        C6888i.m12437d(a, "JsonReader.Options.of(\"c…interactive\", \"settings\")");
        this.options = a;
        C6800r rVar = C6800r.f13715g;
        C5075l<String> d = xVar.mo16932d(String.class, rVar, "collectionId");
        C6888i.m12437d(d, "moshi.adapter(String::cl…ptySet(), \"collectionId\")");
        this.nullableStringAdapter = d;
        C5075l<Boolean> d2 = xVar.mo16932d(Boolean.class, rVar, "interactive");
        C6888i.m12437d(d2, "moshi.adapter(Boolean::c…mptySet(), \"interactive\")");
        this.nullableBooleanAdapter = d2;
        C5075l<AuthSettings> d3 = xVar.mo16932d(AuthSettings.class, rVar, "settings");
        C6888i.m12437d(d3, "moshi.adapter(AuthSettin…, emptySet(), \"settings\")");
        this.nullableAuthSettingsAdapter = d3;
    }

    /* renamed from: a */
    public Object mo16804a(C5081q qVar) {
        C6888i.m12438e(qVar, "reader");
        qVar.mo16840e();
        String str = null;
        String str2 = null;
        Boolean bool = null;
        AuthSettings authSettings = null;
        while (qVar.mo16835N()) {
            int n0 = qVar.mo16844n0(this.options);
            if (n0 == -1) {
                qVar.mo16845o0();
                qVar.mo16846p0();
            } else if (n0 == 0) {
                str = this.nullableStringAdapter.mo16804a(qVar);
            } else if (n0 == 1) {
                str2 = this.nullableStringAdapter.mo16804a(qVar);
            } else if (n0 == 2) {
                bool = this.nullableBooleanAdapter.mo16804a(qVar);
            } else if (n0 == 3) {
                authSettings = this.nullableAuthSettingsAdapter.mo16804a(qVar);
            }
        }
        qVar.mo16849z();
        return new AuthInfoFromBackend(str, str2, bool, authSettings);
    }

    /* renamed from: e */
    public void mo16805e(C5087u uVar, Object obj) {
        AuthInfoFromBackend authInfoFromBackend = (AuthInfoFromBackend) obj;
        C6888i.m12438e(uVar, "writer");
        Objects.requireNonNull(authInfoFromBackend, "value_ was null! Wrap in .nullSafe() to write nullable values.");
        uVar.mo16869e();
        uVar.mo16865O("collectionId");
        this.nullableStringAdapter.mo16805e(uVar, authInfoFromBackend.f10902a);
        uVar.mo16865O("type");
        this.nullableStringAdapter.mo16805e(uVar, authInfoFromBackend.f10903b);
        uVar.mo16865O("interactive");
        this.nullableBooleanAdapter.mo16805e(uVar, authInfoFromBackend.f10904c);
        uVar.mo16865O("settings");
        this.nullableAuthSettingsAdapter.mo16805e(uVar, authInfoFromBackend.f10905d);
        uVar.mo16864H();
    }

    public String toString() {
        C6888i.m12437d("GeneratedJsonAdapter(AuthInfoFromBackend)", "StringBuilder(capacity).…builderAction).toString()");
        return "GeneratedJsonAdapter(AuthInfoFromBackend)";
    }
}
