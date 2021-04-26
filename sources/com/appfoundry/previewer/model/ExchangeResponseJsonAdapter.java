package com.appfoundry.previewer.model;

import java.util.Objects;
import kotlin.Metadata;
import p005b.p280p.p281a.C5075l;
import p005b.p280p.p281a.C5078n;
import p005b.p280p.p281a.C5081q;
import p005b.p280p.p281a.C5087u;
import p005b.p280p.p281a.C5099x;
import p005b.p280p.p281a.p284z.C5117b;
import p298d.p334t.C6800r;
import p298d.p344x.p346c.C6888i;

@Metadata(mo24460bv = {1, 0, 3}, mo24461d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0007\u001a\u00020\u00068\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u00018\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u001c\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00018\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\n¨\u0006\u0011"}, mo24462d2 = {"Lcom/appfoundry/previewer/model/ExchangeResponseJsonAdapter;", "Lb/p/a/l;", "Lcom/appfoundry/previewer/model/ExchangeResponse;", "", "toString", "()Ljava/lang/String;", "Lb/p/a/q$a;", "options", "Lb/p/a/q$a;", "stringAdapter", "Lb/p/a/l;", "", "intAdapter", "Lb/p/a/x;", "moshi", "<init>", "(Lb/p/a/x;)V", "app_debug"}, mo24463k = 1, mo24464mv = {1, 4, 2})
public final class ExchangeResponseJsonAdapter extends C5075l<ExchangeResponse> {
    private final C5075l<Integer> intAdapter;
    private final C5081q.C5082a options;
    private final C5075l<String> stringAdapter;

    public ExchangeResponseJsonAdapter(C5099x xVar) {
        C6888i.m12438e(xVar, "moshi");
        C5081q.C5082a a = C5081q.C5082a.m9296a("statusCode", "response");
        C6888i.m12437d(a, "JsonReader.Options.of(\"statusCode\", \"response\")");
        this.options = a;
        Class cls = Integer.TYPE;
        C6800r rVar = C6800r.f13715g;
        C5075l<Integer> d = xVar.mo16932d(cls, rVar, "statusCode");
        C6888i.m12437d(d, "moshi.adapter(Int::class…et(),\n      \"statusCode\")");
        this.intAdapter = d;
        C5075l<String> d2 = xVar.mo16932d(String.class, rVar, "response");
        C6888i.m12437d(d2, "moshi.adapter(String::cl…ySet(),\n      \"response\")");
        this.stringAdapter = d2;
    }

    /* renamed from: a */
    public Object mo16804a(C5081q qVar) {
        C6888i.m12438e(qVar, "reader");
        qVar.mo16840e();
        Integer num = null;
        String str = null;
        while (qVar.mo16835N()) {
            int n0 = qVar.mo16844n0(this.options);
            if (n0 == -1) {
                qVar.mo16845o0();
                qVar.mo16846p0();
            } else if (n0 == 0) {
                Integer a = this.intAdapter.mo16804a(qVar);
                if (a != null) {
                    num = Integer.valueOf(a.intValue());
                } else {
                    C5078n m = C5117b.m9426m("statusCode", "statusCode", qVar);
                    C6888i.m12437d(m, "Util.unexpectedNull(\"sta…    \"statusCode\", reader)");
                    throw m;
                }
            } else if (n0 == 1 && (str = this.stringAdapter.mo16804a(qVar)) == null) {
                C5078n m2 = C5117b.m9426m("response", "response", qVar);
                C6888i.m12437d(m2, "Util.unexpectedNull(\"res…      \"response\", reader)");
                throw m2;
            }
        }
        qVar.mo16849z();
        if (num != null) {
            int intValue = num.intValue();
            if (str != null) {
                return new ExchangeResponse(intValue, str);
            }
            C5078n g = C5117b.m9420g("response", "response", qVar);
            C6888i.m12437d(g, "Util.missingProperty(\"re…nse\", \"response\", reader)");
            throw g;
        }
        C5078n g2 = C5117b.m9420g("statusCode", "statusCode", qVar);
        C6888i.m12437d(g2, "Util.missingProperty(\"st…e\", \"statusCode\", reader)");
        throw g2;
    }

    /* renamed from: e */
    public void mo16805e(C5087u uVar, Object obj) {
        ExchangeResponse exchangeResponse = (ExchangeResponse) obj;
        C6888i.m12438e(uVar, "writer");
        Objects.requireNonNull(exchangeResponse, "value_ was null! Wrap in .nullSafe() to write nullable values.");
        uVar.mo16869e();
        uVar.mo16865O("statusCode");
        this.intAdapter.mo16805e(uVar, Integer.valueOf(exchangeResponse.f10993a));
        uVar.mo16865O("response");
        this.stringAdapter.mo16805e(uVar, exchangeResponse.f10994b);
        uVar.mo16864H();
    }

    public String toString() {
        C6888i.m12437d("GeneratedJsonAdapter(ExchangeResponse)", "StringBuilder(capacity).…builderAction).toString()");
        return "GeneratedJsonAdapter(ExchangeResponse)";
    }
}
