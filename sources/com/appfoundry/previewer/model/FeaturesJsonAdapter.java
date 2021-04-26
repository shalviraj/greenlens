package com.appfoundry.previewer.model;

import java.util.Objects;
import kotlin.Metadata;
import p005b.p280p.p281a.C5075l;
import p005b.p280p.p281a.C5081q;
import p005b.p280p.p281a.C5087u;
import p005b.p280p.p281a.C5099x;
import p298d.p334t.C6800r;
import p298d.p344x.p346c.C6888i;

@Metadata(mo24460bv = {1, 0, 3}, mo24461d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0007\u001a\u00020\u00068\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u001e\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u00018\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u0010"}, mo24462d2 = {"Lcom/appfoundry/previewer/model/FeaturesJsonAdapter;", "Lb/p/a/l;", "Lcom/appfoundry/previewer/model/Features;", "", "toString", "()Ljava/lang/String;", "Lb/p/a/q$a;", "options", "Lb/p/a/q$a;", "", "nullableBooleanAdapter", "Lb/p/a/l;", "Lb/p/a/x;", "moshi", "<init>", "(Lb/p/a/x;)V", "app_debug"}, mo24463k = 1, mo24464mv = {1, 4, 2})
public final class FeaturesJsonAdapter extends C5075l<Features> {
    private final C5075l<Boolean> nullableBooleanAdapter;
    private final C5081q.C5082a options;

    public FeaturesJsonAdapter(C5099x xVar) {
        C6888i.m12438e(xVar, "moshi");
        C5081q.C5082a a = C5081q.C5082a.m9296a("auth", "audio", "watermark");
        C6888i.m12437d(a, "JsonReader.Options.of(\"a…h\", \"audio\", \"watermark\")");
        this.options = a;
        C5075l<Boolean> d = xVar.mo16932d(Boolean.class, C6800r.f13715g, "auth");
        C6888i.m12437d(d, "moshi.adapter(Boolean::c…Type, emptySet(), \"auth\")");
        this.nullableBooleanAdapter = d;
    }

    /* renamed from: a */
    public Object mo16804a(C5081q qVar) {
        C6888i.m12438e(qVar, "reader");
        qVar.mo16840e();
        Boolean bool = null;
        Boolean bool2 = null;
        Boolean bool3 = null;
        while (qVar.mo16835N()) {
            int n0 = qVar.mo16844n0(this.options);
            if (n0 == -1) {
                qVar.mo16845o0();
                qVar.mo16846p0();
            } else if (n0 == 0) {
                bool = this.nullableBooleanAdapter.mo16804a(qVar);
            } else if (n0 == 1) {
                bool2 = this.nullableBooleanAdapter.mo16804a(qVar);
            } else if (n0 == 2) {
                bool3 = this.nullableBooleanAdapter.mo16804a(qVar);
            }
        }
        qVar.mo16849z();
        return new Features(bool, bool2, bool3);
    }

    /* renamed from: e */
    public void mo16805e(C5087u uVar, Object obj) {
        Features features = (Features) obj;
        C6888i.m12438e(uVar, "writer");
        Objects.requireNonNull(features, "value_ was null! Wrap in .nullSafe() to write nullable values.");
        uVar.mo16869e();
        uVar.mo16865O("auth");
        this.nullableBooleanAdapter.mo16805e(uVar, features.f10995a);
        uVar.mo16865O("audio");
        this.nullableBooleanAdapter.mo16805e(uVar, features.f10996b);
        uVar.mo16865O("watermark");
        this.nullableBooleanAdapter.mo16805e(uVar, features.f10997c);
        uVar.mo16864H();
    }

    public String toString() {
        C6888i.m12437d("GeneratedJsonAdapter(Features)", "StringBuilder(capacity).…builderAction).toString()");
        return "GeneratedJsonAdapter(Features)";
    }
}
