package com.appfoundry.previewer.model;

import com.segment.analytics.AnalyticsContext;
import java.util.List;
import java.util.Objects;
import kotlin.Metadata;
import p005b.p273o.C4805c3;
import p005b.p280p.p281a.C5075l;
import p005b.p280p.p281a.C5078n;
import p005b.p280p.p281a.C5081q;
import p005b.p280p.p281a.C5087u;
import p005b.p280p.p281a.C5099x;
import p005b.p280p.p281a.p284z.C5117b;
import p298d.p334t.C6800r;
import p298d.p344x.p346c.C6888i;

@Metadata(mo24460bv = {1, 0, 3}, mo24461d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0007\u001a\u00020\u00068\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR$\u0010\n\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\t0\u00018\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u001e\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u00018\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000bR$\u0010\u000f\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000e0\u00018\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u000bR\u001e\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00018\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u000bR\u001e\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u00018\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u000bR\u001c\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\u00018\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u000b¨\u0006\u0018"}, mo24462d2 = {"Lcom/appfoundry/previewer/model/BoundNodeJsonAdapter;", "Lb/p/a/l;", "Lcom/appfoundry/previewer/model/BoundNode;", "", "toString", "()Ljava/lang/String;", "Lb/p/a/q$a;", "options", "Lb/p/a/q$a;", "", "nullableListOfStringAdapter", "Lb/p/a/l;", "Lcom/appfoundry/previewer/model/Container;", "nullableContainerAdapter", "", "nullableMutableListOfContainerAdapter", "nullableStringAdapter", "", "nullableBooleanAdapter", "stringAdapter", "Lb/p/a/x;", "moshi", "<init>", "(Lb/p/a/x;)V", "app_debug"}, mo24463k = 1, mo24464mv = {1, 4, 2})
public final class BoundNodeJsonAdapter extends C5075l<BoundNode> {
    private final C5075l<Boolean> nullableBooleanAdapter;
    private final C5075l<Container> nullableContainerAdapter;
    private final C5075l<List<String>> nullableListOfStringAdapter;
    private final C5075l<List<Container>> nullableMutableListOfContainerAdapter;
    private final C5075l<String> nullableStringAdapter;
    private final C5081q.C5082a options;
    private final C5075l<String> stringAdapter;

    public BoundNodeJsonAdapter(C5099x xVar) {
        Class<Container> cls = Container.class;
        Class<String> cls2 = String.class;
        C6888i.m12438e(xVar, "moshi");
        C5081q.C5082a a = C5081q.C5082a.m9296a(AnalyticsContext.Device.DEVICE_ID_KEY, "type", "tags", "start", "background", "topBar", "body", "layers", "remote", "remoteForm");
        C6888i.m12437d(a, "JsonReader.Options.of(\"i…, \"remote\", \"remoteForm\")");
        this.options = a;
        C6800r rVar = C6800r.f13715g;
        C5075l<String> d = xVar.mo16932d(cls2, rVar, AnalyticsContext.Device.DEVICE_ID_KEY);
        C6888i.m12437d(d, "moshi.adapter(String::cl…, emptySet(),\n      \"id\")");
        this.stringAdapter = d;
        C5075l<String> d2 = xVar.mo16932d(cls2, rVar, "type");
        C6888i.m12437d(d2, "moshi.adapter(String::cl…      emptySet(), \"type\")");
        this.nullableStringAdapter = d2;
        C5075l<List<String>> d3 = xVar.mo16932d(C4805c3.m8814m(List.class, cls2), rVar, "tags");
        C6888i.m12437d(d3, "moshi.adapter(Types.newP…emptySet(),\n      \"tags\")");
        this.nullableListOfStringAdapter = d3;
        C5075l<Boolean> d4 = xVar.mo16932d(Boolean.class, rVar, "start");
        C6888i.m12437d(d4, "moshi.adapter(Boolean::c…ype, emptySet(), \"start\")");
        this.nullableBooleanAdapter = d4;
        C5075l<Container> d5 = xVar.mo16932d(cls, rVar, "background");
        C6888i.m12437d(d5, "moshi.adapter(Container:…emptySet(), \"background\")");
        this.nullableContainerAdapter = d5;
        C5075l<List<Container>> d6 = xVar.mo16932d(C4805c3.m8814m(List.class, cls), rVar, "body");
        C6888i.m12437d(d6, "moshi.adapter(Types.newP…      emptySet(), \"body\")");
        this.nullableMutableListOfContainerAdapter = d6;
    }

    /* renamed from: a */
    public Object mo16804a(C5081q qVar) {
        C6888i.m12438e(qVar, "reader");
        qVar.mo16840e();
        String str = null;
        String str2 = null;
        List list = null;
        Boolean bool = null;
        Container container = null;
        Container container2 = null;
        List list2 = null;
        List list3 = null;
        String str3 = null;
        String str4 = null;
        while (qVar.mo16835N()) {
            switch (qVar.mo16844n0(this.options)) {
                case -1:
                    qVar.mo16845o0();
                    qVar.mo16846p0();
                    break;
                case 0:
                    str = this.stringAdapter.mo16804a(qVar);
                    if (str != null) {
                        break;
                    } else {
                        C5078n m = C5117b.m9426m(AnalyticsContext.Device.DEVICE_ID_KEY, AnalyticsContext.Device.DEVICE_ID_KEY, qVar);
                        C6888i.m12437d(m, "Util.unexpectedNull(\"id\", \"id\", reader)");
                        throw m;
                    }
                case 1:
                    str2 = this.nullableStringAdapter.mo16804a(qVar);
                    break;
                case 2:
                    list = this.nullableListOfStringAdapter.mo16804a(qVar);
                    break;
                case 3:
                    bool = this.nullableBooleanAdapter.mo16804a(qVar);
                    break;
                case 4:
                    container = this.nullableContainerAdapter.mo16804a(qVar);
                    break;
                case 5:
                    container2 = this.nullableContainerAdapter.mo16804a(qVar);
                    break;
                case 6:
                    list2 = this.nullableMutableListOfContainerAdapter.mo16804a(qVar);
                    break;
                case 7:
                    list3 = this.nullableMutableListOfContainerAdapter.mo16804a(qVar);
                    break;
                case 8:
                    str3 = this.nullableStringAdapter.mo16804a(qVar);
                    break;
                case 9:
                    str4 = this.nullableStringAdapter.mo16804a(qVar);
                    break;
            }
        }
        qVar.mo16849z();
        if (str != null) {
            return new BoundNode(str, str2, list, bool, container, container2, list2, list3, str3, str4);
        }
        C5078n g = C5117b.m9420g(AnalyticsContext.Device.DEVICE_ID_KEY, AnalyticsContext.Device.DEVICE_ID_KEY, qVar);
        C6888i.m12437d(g, "Util.missingProperty(\"id\", \"id\", reader)");
        throw g;
    }

    /* renamed from: e */
    public void mo16805e(C5087u uVar, Object obj) {
        BoundNode boundNode = (BoundNode) obj;
        C6888i.m12438e(uVar, "writer");
        Objects.requireNonNull(boundNode, "value_ was null! Wrap in .nullSafe() to write nullable values.");
        uVar.mo16869e();
        uVar.mo16865O(AnalyticsContext.Device.DEVICE_ID_KEY);
        this.stringAdapter.mo16805e(uVar, boundNode.f10923a);
        uVar.mo16865O("type");
        this.nullableStringAdapter.mo16805e(uVar, boundNode.f10924b);
        uVar.mo16865O("tags");
        this.nullableListOfStringAdapter.mo16805e(uVar, boundNode.f10925c);
        uVar.mo16865O("start");
        this.nullableBooleanAdapter.mo16805e(uVar, boundNode.f10926d);
        uVar.mo16865O("background");
        this.nullableContainerAdapter.mo16805e(uVar, boundNode.f10927e);
        uVar.mo16865O("topBar");
        this.nullableContainerAdapter.mo16805e(uVar, boundNode.f10928f);
        uVar.mo16865O("body");
        this.nullableMutableListOfContainerAdapter.mo16805e(uVar, boundNode.f10929g);
        uVar.mo16865O("layers");
        this.nullableMutableListOfContainerAdapter.mo16805e(uVar, boundNode.f10930h);
        uVar.mo16865O("remote");
        this.nullableStringAdapter.mo16805e(uVar, boundNode.f10931i);
        uVar.mo16865O("remoteForm");
        this.nullableStringAdapter.mo16805e(uVar, boundNode.f10932j);
        uVar.mo16864H();
    }

    public String toString() {
        C6888i.m12437d("GeneratedJsonAdapter(BoundNode)", "StringBuilder(capacity).…builderAction).toString()");
        return "GeneratedJsonAdapter(BoundNode)";
    }
}
