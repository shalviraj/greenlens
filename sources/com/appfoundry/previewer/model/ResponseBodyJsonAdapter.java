package com.appfoundry.previewer.model;

import java.util.Objects;
import kotlin.Metadata;
import p005b.p280p.p281a.C5075l;
import p005b.p280p.p281a.C5081q;
import p005b.p280p.p281a.C5087u;
import p005b.p280p.p281a.C5099x;
import p298d.p334t.C6800r;
import p298d.p344x.p346c.C6888i;

@Metadata(mo24460bv = {1, 0, 3}, mo24461d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0004\u0010\u0005R\u001e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00018\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u001e\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00018\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0007R\u001e\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00018\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0007R\u0016\u0010\r\u001a\u00020\f8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0013"}, mo24462d2 = {"Lcom/appfoundry/previewer/model/ResponseBodyJsonAdapter;", "Lb/p/a/l;", "Lcom/appfoundry/previewer/model/ResponseBody;", "", "toString", "()Ljava/lang/String;", "nullableStringAdapter", "Lb/p/a/l;", "", "nullableIntAdapter", "Lcom/appfoundry/previewer/model/DebugRequest;", "nullableDebugRequestAdapter", "Lb/p/a/q$a;", "options", "Lb/p/a/q$a;", "Lb/p/a/x;", "moshi", "<init>", "(Lb/p/a/x;)V", "app_debug"}, mo24463k = 1, mo24464mv = {1, 4, 2})
public final class ResponseBodyJsonAdapter extends C5075l<ResponseBody> {
    private final C5075l<DebugRequest> nullableDebugRequestAdapter;
    private final C5075l<Integer> nullableIntAdapter;
    private final C5075l<String> nullableStringAdapter;
    private final C5081q.C5082a options;

    public ResponseBodyJsonAdapter(C5099x xVar) {
        C6888i.m12438e(xVar, "moshi");
        C5081q.C5082a a = C5081q.C5082a.m9296a("statusCode", "error", "message", "reason", "debugRequest");
        C6888i.m12437d(a, "JsonReader.Options.of(\"s…\"reason\", \"debugRequest\")");
        this.options = a;
        C6800r rVar = C6800r.f13715g;
        C5075l<Integer> d = xVar.mo16932d(Integer.class, rVar, "statusCode");
        C6888i.m12437d(d, "moshi.adapter(Int::class…emptySet(), \"statusCode\")");
        this.nullableIntAdapter = d;
        C5075l<String> d2 = xVar.mo16932d(String.class, rVar, "error");
        C6888i.m12437d(d2, "moshi.adapter(String::cl…     emptySet(), \"error\")");
        this.nullableStringAdapter = d2;
        C5075l<DebugRequest> d3 = xVar.mo16932d(DebugRequest.class, rVar, "debugRequest");
        C6888i.m12437d(d3, "moshi.adapter(DebugReque…ptySet(), \"debugRequest\")");
        this.nullableDebugRequestAdapter = d3;
    }

    /* renamed from: a */
    public Object mo16804a(C5081q qVar) {
        C6888i.m12438e(qVar, "reader");
        qVar.mo16840e();
        Integer num = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        DebugRequest debugRequest = null;
        while (qVar.mo16835N()) {
            int n0 = qVar.mo16844n0(this.options);
            if (n0 == -1) {
                qVar.mo16845o0();
                qVar.mo16846p0();
            } else if (n0 == 0) {
                num = this.nullableIntAdapter.mo16804a(qVar);
            } else if (n0 == 1) {
                str = this.nullableStringAdapter.mo16804a(qVar);
            } else if (n0 == 2) {
                str2 = this.nullableStringAdapter.mo16804a(qVar);
            } else if (n0 == 3) {
                str3 = this.nullableStringAdapter.mo16804a(qVar);
            } else if (n0 == 4) {
                debugRequest = this.nullableDebugRequestAdapter.mo16804a(qVar);
            }
        }
        qVar.mo16849z();
        return new ResponseBody(num, str, str2, str3, debugRequest);
    }

    /* renamed from: e */
    public void mo16805e(C5087u uVar, Object obj) {
        ResponseBody responseBody = (ResponseBody) obj;
        C6888i.m12438e(uVar, "writer");
        Objects.requireNonNull(responseBody, "value_ was null! Wrap in .nullSafe() to write nullable values.");
        uVar.mo16869e();
        uVar.mo16865O("statusCode");
        this.nullableIntAdapter.mo16805e(uVar, responseBody.f11096a);
        uVar.mo16865O("error");
        this.nullableStringAdapter.mo16805e(uVar, responseBody.f11097b);
        uVar.mo16865O("message");
        this.nullableStringAdapter.mo16805e(uVar, responseBody.f11098c);
        uVar.mo16865O("reason");
        this.nullableStringAdapter.mo16805e(uVar, responseBody.f11099d);
        uVar.mo16865O("debugRequest");
        this.nullableDebugRequestAdapter.mo16805e(uVar, responseBody.f11100e);
        uVar.mo16864H();
    }

    public String toString() {
        C6888i.m12437d("GeneratedJsonAdapter(ResponseBody)", "StringBuilder(capacity).…builderAction).toString()");
        return "GeneratedJsonAdapter(ResponseBody)";
    }
}
