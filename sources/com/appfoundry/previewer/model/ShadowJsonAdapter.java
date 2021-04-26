package com.appfoundry.previewer.model;

import java.util.Objects;
import kotlin.Metadata;
import p005b.p280p.p281a.C5075l;
import p005b.p280p.p281a.C5081q;
import p005b.p280p.p281a.C5087u;
import p005b.p280p.p281a.C5099x;
import p298d.p334t.C6800r;
import p298d.p344x.p346c.C6888i;

@Metadata(mo24460bv = {1, 0, 3}, mo24461d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0004\u0010\u0005R\u001e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00018\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u001e\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00018\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0007R\u0016\u0010\u000b\u001a\u00020\n8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001e\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00018\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0007¨\u0006\u0013"}, mo24462d2 = {"Lcom/appfoundry/previewer/model/ShadowJsonAdapter;", "Lb/p/a/l;", "Lcom/appfoundry/previewer/model/Shadow;", "", "toString", "()Ljava/lang/String;", "nullableStringAdapter", "Lb/p/a/l;", "", "nullableFloatAdapter", "Lb/p/a/q$a;", "options", "Lb/p/a/q$a;", "Lcom/appfoundry/previewer/model/ShadowOffset;", "nullableShadowOffsetAdapter", "Lb/p/a/x;", "moshi", "<init>", "(Lb/p/a/x;)V", "app_debug"}, mo24463k = 1, mo24464mv = {1, 4, 2})
public final class ShadowJsonAdapter extends C5075l<Shadow> {
    private final C5075l<Float> nullableFloatAdapter;
    private final C5075l<ShadowOffset> nullableShadowOffsetAdapter;
    private final C5075l<String> nullableStringAdapter;
    private final C5081q.C5082a options;

    public ShadowJsonAdapter(C5099x xVar) {
        C6888i.m12438e(xVar, "moshi");
        C5081q.C5082a a = C5081q.C5082a.m9296a("color", "radius", "offset");
        C6888i.m12437d(a, "JsonReader.Options.of(\"color\", \"radius\", \"offset\")");
        this.options = a;
        C6800r rVar = C6800r.f13715g;
        C5075l<String> d = xVar.mo16932d(String.class, rVar, "color");
        C6888i.m12437d(d, "moshi.adapter(String::cl…     emptySet(), \"color\")");
        this.nullableStringAdapter = d;
        C5075l<Float> d2 = xVar.mo16932d(Float.class, rVar, "radius");
        C6888i.m12437d(d2, "moshi.adapter(Float::cla…    emptySet(), \"radius\")");
        this.nullableFloatAdapter = d2;
        C5075l<ShadowOffset> d3 = xVar.mo16932d(ShadowOffset.class, rVar, "offset");
        C6888i.m12437d(d3, "moshi.adapter(ShadowOffs…va, emptySet(), \"offset\")");
        this.nullableShadowOffsetAdapter = d3;
    }

    /* renamed from: a */
    public Object mo16804a(C5081q qVar) {
        C6888i.m12438e(qVar, "reader");
        qVar.mo16840e();
        String str = null;
        Float f = null;
        ShadowOffset shadowOffset = null;
        while (qVar.mo16835N()) {
            int n0 = qVar.mo16844n0(this.options);
            if (n0 == -1) {
                qVar.mo16845o0();
                qVar.mo16846p0();
            } else if (n0 == 0) {
                str = this.nullableStringAdapter.mo16804a(qVar);
            } else if (n0 == 1) {
                f = this.nullableFloatAdapter.mo16804a(qVar);
            } else if (n0 == 2) {
                shadowOffset = this.nullableShadowOffsetAdapter.mo16804a(qVar);
            }
        }
        qVar.mo16849z();
        return new Shadow(str, f, shadowOffset);
    }

    /* renamed from: e */
    public void mo16805e(C5087u uVar, Object obj) {
        Shadow shadow = (Shadow) obj;
        C6888i.m12438e(uVar, "writer");
        Objects.requireNonNull(shadow, "value_ was null! Wrap in .nullSafe() to write nullable values.");
        uVar.mo16869e();
        uVar.mo16865O("color");
        this.nullableStringAdapter.mo16805e(uVar, shadow.f11104a);
        uVar.mo16865O("radius");
        this.nullableFloatAdapter.mo16805e(uVar, shadow.f11105b);
        uVar.mo16865O("offset");
        this.nullableShadowOffsetAdapter.mo16805e(uVar, shadow.f11106c);
        uVar.mo16864H();
    }

    public String toString() {
        C6888i.m12437d("GeneratedJsonAdapter(Shadow)", "StringBuilder(capacity).…builderAction).toString()");
        return "GeneratedJsonAdapter(Shadow)";
    }
}
