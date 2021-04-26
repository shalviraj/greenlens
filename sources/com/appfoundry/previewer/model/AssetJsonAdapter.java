package com.appfoundry.previewer.model;

import com.segment.analytics.AnalyticsContext;
import java.lang.reflect.Constructor;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p005b.p280p.p281a.C5075l;
import p005b.p280p.p281a.C5078n;
import p005b.p280p.p281a.C5081q;
import p005b.p280p.p281a.C5087u;
import p005b.p280p.p281a.C5099x;
import p005b.p280p.p281a.p284z.C5117b;
import p298d.p334t.C6800r;
import p298d.p344x.p346c.C6888i;

@Metadata(mo24460bv = {1, 0, 3}, mo24461d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0007\u001a\u00020\u00068\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u001e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\t8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u001c\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\u00018\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001e\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u00018\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\rR\u001e\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00018\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\rR\u001e\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u00018\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\r¨\u0006\u0017"}, mo24462d2 = {"Lcom/appfoundry/previewer/model/AssetJsonAdapter;", "Lb/p/a/l;", "Lcom/appfoundry/previewer/model/Asset;", "", "toString", "()Ljava/lang/String;", "Lb/p/a/q$a;", "options", "Lb/p/a/q$a;", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "stringAdapter", "Lb/p/a/l;", "Lcom/appfoundry/previewer/model/Resolution;", "nullableResolutionAdapter", "nullableStringAdapter", "", "nullableBooleanAdapter", "Lb/p/a/x;", "moshi", "<init>", "(Lb/p/a/x;)V", "app_debug"}, mo24463k = 1, mo24464mv = {1, 4, 2})
public final class AssetJsonAdapter extends C5075l<Asset> {
    private volatile Constructor<Asset> constructorRef;
    private final C5075l<Boolean> nullableBooleanAdapter;
    private final C5075l<Resolution> nullableResolutionAdapter;
    private final C5075l<String> nullableStringAdapter;
    private final C5081q.C5082a options;
    private final C5075l<String> stringAdapter;

    public AssetJsonAdapter(C5099x xVar) {
        Class<String> cls = String.class;
        C6888i.m12438e(xVar, "moshi");
        C5081q.C5082a a = C5081q.C5082a.m9296a(AnalyticsContext.Device.DEVICE_ID_KEY, "url", "thumbUrl", "preload", "type", "originalSize");
        C6888i.m12437d(a, "JsonReader.Options.of(\"i…, \"type\", \"originalSize\")");
        this.options = a;
        C6800r rVar = C6800r.f13715g;
        C5075l<String> d = xVar.mo16932d(cls, rVar, AnalyticsContext.Device.DEVICE_ID_KEY);
        C6888i.m12437d(d, "moshi.adapter(String::cl…, emptySet(),\n      \"id\")");
        this.stringAdapter = d;
        C5075l<String> d2 = xVar.mo16932d(cls, rVar, "url");
        C6888i.m12437d(d2, "moshi.adapter(String::cl…\n      emptySet(), \"url\")");
        this.nullableStringAdapter = d2;
        C5075l<Boolean> d3 = xVar.mo16932d(Boolean.class, rVar, "preload");
        C6888i.m12437d(d3, "moshi.adapter(Boolean::c…e, emptySet(), \"preload\")");
        this.nullableBooleanAdapter = d3;
        C5075l<Resolution> d4 = xVar.mo16932d(Resolution.class, rVar, "originalSize");
        C6888i.m12437d(d4, "moshi.adapter(Resolution…ptySet(), \"originalSize\")");
        this.nullableResolutionAdapter = d4;
    }

    /* renamed from: a */
    public Object mo16804a(C5081q qVar) {
        C5081q qVar2 = qVar;
        Class<String> cls = String.class;
        C6888i.m12438e(qVar2, "reader");
        qVar.mo16840e();
        String str = null;
        String str2 = null;
        String str3 = null;
        Boolean bool = null;
        String str4 = null;
        Resolution resolution = null;
        while (qVar.mo16835N()) {
            switch (qVar2.mo16844n0(this.options)) {
                case -1:
                    qVar.mo16845o0();
                    qVar.mo16846p0();
                    break;
                case 0:
                    str = this.stringAdapter.mo16804a(qVar2);
                    if (str != null) {
                        break;
                    } else {
                        C5078n m = C5117b.m9426m(AnalyticsContext.Device.DEVICE_ID_KEY, AnalyticsContext.Device.DEVICE_ID_KEY, qVar2);
                        C6888i.m12437d(m, "Util.unexpectedNull(\"id\", \"id\", reader)");
                        throw m;
                    }
                case 1:
                    str2 = this.nullableStringAdapter.mo16804a(qVar2);
                    break;
                case 2:
                    str3 = this.nullableStringAdapter.mo16804a(qVar2);
                    break;
                case 3:
                    bool = this.nullableBooleanAdapter.mo16804a(qVar2);
                    break;
                case 4:
                    str4 = this.nullableStringAdapter.mo16804a(qVar2);
                    break;
                case 5:
                    resolution = this.nullableResolutionAdapter.mo16804a(qVar2);
                    break;
            }
        }
        qVar.mo16849z();
        if (-1 != ((int) 4294967295L)) {
            Constructor<Asset> constructor = this.constructorRef;
            if (constructor == null) {
                constructor = Asset.class.getDeclaredConstructor(new Class[]{cls, cls, cls, Boolean.class, cls, Resolution.class, Boolean.TYPE, Integer.TYPE, C5117b.f9905c});
                this.constructorRef = constructor;
                C6888i.m12437d(constructor, "Asset::class.java.getDec…his.constructorRef = it }");
            }
            Object[] objArr = new Object[9];
            if (str != null) {
                objArr[0] = str;
                objArr[1] = str2;
                objArr[2] = str3;
                objArr[3] = bool;
                objArr[4] = str4;
                objArr[5] = resolution;
                objArr[6] = Boolean.FALSE;
                objArr[7] = -1;
                objArr[8] = null;
                Asset newInstance = constructor.newInstance(objArr);
                C6888i.m12437d(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
                return newInstance;
            }
            C5078n g = C5117b.m9420g(AnalyticsContext.Device.DEVICE_ID_KEY, AnalyticsContext.Device.DEVICE_ID_KEY, qVar2);
            C6888i.m12437d(g, "Util.missingProperty(\"id\", \"id\", reader)");
            throw g;
        } else if (str != null) {
            return new Asset(str, str2, str3, bool, str4, resolution, false, 64, (DefaultConstructorMarker) null);
        } else {
            C5078n g2 = C5117b.m9420g(AnalyticsContext.Device.DEVICE_ID_KEY, AnalyticsContext.Device.DEVICE_ID_KEY, qVar2);
            C6888i.m12437d(g2, "Util.missingProperty(\"id\", \"id\", reader)");
            throw g2;
        }
    }

    /* renamed from: e */
    public void mo16805e(C5087u uVar, Object obj) {
        Asset asset = (Asset) obj;
        C6888i.m12438e(uVar, "writer");
        Objects.requireNonNull(asset, "value_ was null! Wrap in .nullSafe() to write nullable values.");
        uVar.mo16869e();
        uVar.mo16865O(AnalyticsContext.Device.DEVICE_ID_KEY);
        this.stringAdapter.mo16805e(uVar, asset.f10895a);
        uVar.mo16865O("url");
        this.nullableStringAdapter.mo16805e(uVar, asset.f10896b);
        uVar.mo16865O("thumbUrl");
        this.nullableStringAdapter.mo16805e(uVar, asset.f10897c);
        uVar.mo16865O("preload");
        this.nullableBooleanAdapter.mo16805e(uVar, asset.f10898d);
        uVar.mo16865O("type");
        this.nullableStringAdapter.mo16805e(uVar, asset.f10899e);
        uVar.mo16865O("originalSize");
        this.nullableResolutionAdapter.mo16805e(uVar, asset.f10900f);
        uVar.mo16864H();
    }

    public String toString() {
        C6888i.m12437d("GeneratedJsonAdapter(Asset)", "StringBuilder(capacity).…builderAction).toString()");
        return "GeneratedJsonAdapter(Asset)";
    }
}
