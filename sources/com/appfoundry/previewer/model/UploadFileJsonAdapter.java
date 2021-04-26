package com.appfoundry.previewer.model;

import java.util.Objects;
import kotlin.Metadata;
import p005b.p280p.p281a.C5075l;
import p005b.p280p.p281a.C5081q;
import p005b.p280p.p281a.C5087u;
import p005b.p280p.p281a.C5099x;
import p298d.p334t.C6800r;
import p298d.p344x.p346c.C6888i;

@Metadata(mo24460bv = {1, 0, 3}, mo24461d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0007\u001a\u00020\u00068\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u001e\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u00018\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u001e\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00018\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000b¨\u0006\u0011"}, mo24462d2 = {"Lcom/appfoundry/previewer/model/UploadFileJsonAdapter;", "Lb/p/a/l;", "Lcom/appfoundry/previewer/model/UploadFile;", "", "toString", "()Ljava/lang/String;", "Lb/p/a/q$a;", "options", "Lb/p/a/q$a;", "", "nullableIntAdapter", "Lb/p/a/l;", "nullableStringAdapter", "Lb/p/a/x;", "moshi", "<init>", "(Lb/p/a/x;)V", "app_debug"}, mo24463k = 1, mo24464mv = {1, 4, 2})
public final class UploadFileJsonAdapter extends C5075l<UploadFile> {
    private final C5075l<Integer> nullableIntAdapter;
    private final C5075l<String> nullableStringAdapter;
    private final C5081q.C5082a options;

    public UploadFileJsonAdapter(C5099x xVar) {
        C6888i.m12438e(xVar, "moshi");
        C5081q.C5082a a = C5081q.C5082a.m9296a("originalname", "mimetype", "url", "size");
        C6888i.m12437d(a, "JsonReader.Options.of(\"o…pe\", \"url\",\n      \"size\")");
        this.options = a;
        C6800r rVar = C6800r.f13715g;
        C5075l<String> d = xVar.mo16932d(String.class, rVar, "originalname");
        C6888i.m12437d(d, "moshi.adapter(String::cl…ptySet(), \"originalname\")");
        this.nullableStringAdapter = d;
        C5075l<Integer> d2 = xVar.mo16932d(Integer.class, rVar, "size");
        C6888i.m12437d(d2, "moshi.adapter(Int::class…      emptySet(), \"size\")");
        this.nullableIntAdapter = d2;
    }

    /* renamed from: a */
    public Object mo16804a(C5081q qVar) {
        C6888i.m12438e(qVar, "reader");
        qVar.mo16840e();
        String str = null;
        String str2 = null;
        String str3 = null;
        Integer num = null;
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
                str3 = this.nullableStringAdapter.mo16804a(qVar);
            } else if (n0 == 3) {
                num = this.nullableIntAdapter.mo16804a(qVar);
            }
        }
        qVar.mo16849z();
        return new UploadFile(str, str2, str3, num);
    }

    /* renamed from: e */
    public void mo16805e(C5087u uVar, Object obj) {
        UploadFile uploadFile = (UploadFile) obj;
        C6888i.m12438e(uVar, "writer");
        Objects.requireNonNull(uploadFile, "value_ was null! Wrap in .nullSafe() to write nullable values.");
        uVar.mo16869e();
        uVar.mo16865O("originalname");
        this.nullableStringAdapter.mo16805e(uVar, uploadFile.f11169a);
        uVar.mo16865O("mimetype");
        this.nullableStringAdapter.mo16805e(uVar, uploadFile.f11170b);
        uVar.mo16865O("url");
        this.nullableStringAdapter.mo16805e(uVar, uploadFile.f11171c);
        uVar.mo16865O("size");
        this.nullableIntAdapter.mo16805e(uVar, uploadFile.f11172d);
        uVar.mo16864H();
    }

    public String toString() {
        C6888i.m12437d("GeneratedJsonAdapter(UploadFile)", "StringBuilder(capacity).…builderAction).toString()");
        return "GeneratedJsonAdapter(UploadFile)";
    }
}
