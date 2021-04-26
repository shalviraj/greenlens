package com.appfoundry.previewer.model;

import com.segment.analytics.AnalyticsContext;
import java.lang.reflect.Constructor;
import java.util.List;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p005b.p273o.C4805c3;
import p005b.p280p.p281a.C5075l;
import p005b.p280p.p281a.C5081q;
import p005b.p280p.p281a.C5087u;
import p005b.p280p.p281a.C5099x;
import p005b.p280p.p281a.p284z.C5117b;
import p298d.p334t.C6800r;
import p298d.p344x.p346c.C6888i;

@Metadata(mo24460bv = {1, 0, 3}, mo24461d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0004\u0010\u0005R\u001e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00018\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u001e\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00018\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0007R$\u0010\u000b\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t0\u00018\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0007R\u001e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\f8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000eR$\u0010\u000f\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\t0\u00018\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0007R\u001e\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u00018\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0007R\u001e\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u00018\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0007R\u0016\u0010\u0015\u001a\u00020\u00148\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R$\u0010\u0018\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00170\u00018\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0007R\u001e\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u00018\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0007¨\u0006\u001f"}, mo24462d2 = {"Lcom/appfoundry/previewer/model/ContainerJsonAdapter;", "Lb/p/a/l;", "Lcom/appfoundry/previewer/model/Container;", "", "toString", "()Ljava/lang/String;", "nullableStringAdapter", "Lb/p/a/l;", "nullableContainerAdapter", "", "Lcom/appfoundry/previewer/model/Component;", "nullableMutableListOfComponentAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "nullableMutableListOfContainerAdapter", "Lcom/appfoundry/previewer/model/Params;", "nullableParamsAdapter", "Lcom/appfoundry/previewer/model/Actions;", "nullableActionsAdapter", "Lb/p/a/q$a;", "options", "Lb/p/a/q$a;", "", "nullableListOfStringAdapter", "", "nullableBooleanAdapter", "Lb/p/a/x;", "moshi", "<init>", "(Lb/p/a/x;)V", "app_debug"}, mo24463k = 1, mo24464mv = {1, 4, 2})
public final class ContainerJsonAdapter extends C5075l<Container> {
    private volatile Constructor<Container> constructorRef;
    private final C5075l<Actions> nullableActionsAdapter;
    private final C5075l<Boolean> nullableBooleanAdapter;
    private final C5075l<Container> nullableContainerAdapter;
    private final C5075l<List<String>> nullableListOfStringAdapter;
    private final C5075l<List<Component>> nullableMutableListOfComponentAdapter;
    private final C5075l<List<Container>> nullableMutableListOfContainerAdapter;
    private final C5075l<Params> nullableParamsAdapter;
    private final C5075l<String> nullableStringAdapter;
    private final C5081q.C5082a options;

    public ContainerJsonAdapter(C5099x xVar) {
        C5099x xVar2 = xVar;
        Class<Container> cls = Container.class;
        Class<String> cls2 = String.class;
        C6888i.m12438e(xVar2, "moshi");
        C5081q.C5082a a = C5081q.C5082a.m9296a(AnalyticsContext.Device.DEVICE_ID_KEY, "type", "styleId", "href", "hrefRemote", "components", "background", "statusBar", "scrollable", "tags", "actions", "containers", "params");
        C6888i.m12437d(a, "JsonReader.Options.of(\"i…  \"containers\", \"params\")");
        this.options = a;
        C6800r rVar = C6800r.f13715g;
        C5075l<String> d = xVar2.mo16932d(cls2, rVar, AnalyticsContext.Device.DEVICE_ID_KEY);
        C6888i.m12437d(d, "moshi.adapter(String::cl…,\n      emptySet(), \"id\")");
        this.nullableStringAdapter = d;
        C5075l<List<Component>> d2 = xVar2.mo16932d(C4805c3.m8814m(List.class, Component.class), rVar, "components");
        C6888i.m12437d(d2, "moshi.adapter(Types.newP…emptySet(), \"components\")");
        this.nullableMutableListOfComponentAdapter = d2;
        C5075l<Container> d3 = xVar2.mo16932d(cls, rVar, "background");
        C6888i.m12437d(d3, "moshi.adapter(Container:…emptySet(), \"background\")");
        this.nullableContainerAdapter = d3;
        C5075l<Boolean> d4 = xVar2.mo16932d(Boolean.class, rVar, "scrollable");
        C6888i.m12437d(d4, "moshi.adapter(Boolean::c…emptySet(), \"scrollable\")");
        this.nullableBooleanAdapter = d4;
        C5075l<List<String>> d5 = xVar2.mo16932d(C4805c3.m8814m(List.class, cls2), rVar, "tags");
        C6888i.m12437d(d5, "moshi.adapter(Types.newP…emptySet(),\n      \"tags\")");
        this.nullableListOfStringAdapter = d5;
        C5075l<Actions> d6 = xVar2.mo16932d(Actions.class, rVar, "actions");
        C6888i.m12437d(d6, "moshi.adapter(Actions::c…   emptySet(), \"actions\")");
        this.nullableActionsAdapter = d6;
        C5075l<List<Container>> d7 = xVar2.mo16932d(C4805c3.m8814m(List.class, cls), rVar, "containers");
        C6888i.m12437d(d7, "moshi.adapter(Types.newP…emptySet(), \"containers\")");
        this.nullableMutableListOfContainerAdapter = d7;
        C5075l<Params> d8 = xVar2.mo16932d(Params.class, rVar, "params");
        C6888i.m12437d(d8, "moshi.adapter(Params::cl…    emptySet(), \"params\")");
        this.nullableParamsAdapter = d8;
    }

    /* renamed from: a */
    public Object mo16804a(C5081q qVar) {
        C5081q qVar2 = qVar;
        Class<Boolean> cls = Boolean.class;
        Class<Container> cls2 = Container.class;
        Class<String> cls3 = String.class;
        C6888i.m12438e(qVar2, "reader");
        qVar.mo16840e();
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        List list = null;
        Container container = null;
        String str6 = null;
        Boolean bool = null;
        List list2 = null;
        Actions actions = null;
        List list3 = null;
        Params params = null;
        while (qVar.mo16835N()) {
            switch (qVar2.mo16844n0(this.options)) {
                case -1:
                    qVar.mo16845o0();
                    qVar.mo16846p0();
                    break;
                case 0:
                    str = this.nullableStringAdapter.mo16804a(qVar2);
                    break;
                case 1:
                    str2 = this.nullableStringAdapter.mo16804a(qVar2);
                    break;
                case 2:
                    str3 = this.nullableStringAdapter.mo16804a(qVar2);
                    break;
                case 3:
                    str4 = this.nullableStringAdapter.mo16804a(qVar2);
                    break;
                case 4:
                    str5 = this.nullableStringAdapter.mo16804a(qVar2);
                    break;
                case 5:
                    list = this.nullableMutableListOfComponentAdapter.mo16804a(qVar2);
                    break;
                case 6:
                    container = this.nullableContainerAdapter.mo16804a(qVar2);
                    break;
                case 7:
                    str6 = this.nullableStringAdapter.mo16804a(qVar2);
                    break;
                case 8:
                    bool = this.nullableBooleanAdapter.mo16804a(qVar2);
                    break;
                case 9:
                    list2 = this.nullableListOfStringAdapter.mo16804a(qVar2);
                    break;
                case 10:
                    actions = this.nullableActionsAdapter.mo16804a(qVar2);
                    break;
                case 11:
                    list3 = this.nullableMutableListOfContainerAdapter.mo16804a(qVar2);
                    break;
                case 12:
                    params = this.nullableParamsAdapter.mo16804a(qVar2);
                    break;
            }
        }
        qVar.mo16849z();
        if (-1 == ((int) 4294967295L)) {
            return new Container(str, str2, str3, str4, str5, list, container, str6, bool, list2, actions, list3, params, (String) null, (Boolean) null, 24576, (DefaultConstructorMarker) null);
        }
        Constructor<Container> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = cls2.getDeclaredConstructor(new Class[]{cls3, cls3, cls3, cls3, cls3, List.class, cls2, cls3, cls, List.class, Actions.class, List.class, Params.class, cls3, cls, Integer.TYPE, C5117b.f9905c});
            this.constructorRef = constructor;
            C6888i.m12437d(constructor, "Container::class.java.ge…his.constructorRef = it }");
        }
        Container newInstance = constructor.newInstance(new Object[]{str, str2, str3, str4, str5, list, container, str6, bool, list2, actions, list3, params, null, null, -1, null});
        C6888i.m12437d(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
        return newInstance;
    }

    /* renamed from: e */
    public void mo16805e(C5087u uVar, Object obj) {
        Container container = (Container) obj;
        C6888i.m12438e(uVar, "writer");
        Objects.requireNonNull(container, "value_ was null! Wrap in .nullSafe() to write nullable values.");
        uVar.mo16869e();
        uVar.mo16865O(AnalyticsContext.Device.DEVICE_ID_KEY);
        this.nullableStringAdapter.mo16805e(uVar, container.f10967a);
        uVar.mo16865O("type");
        this.nullableStringAdapter.mo16805e(uVar, container.f10968b);
        uVar.mo16865O("styleId");
        this.nullableStringAdapter.mo16805e(uVar, container.f10969c);
        uVar.mo16865O("href");
        this.nullableStringAdapter.mo16805e(uVar, container.f10970d);
        uVar.mo16865O("hrefRemote");
        this.nullableStringAdapter.mo16805e(uVar, container.f10971e);
        uVar.mo16865O("components");
        this.nullableMutableListOfComponentAdapter.mo16805e(uVar, container.f10972f);
        uVar.mo16865O("background");
        this.nullableContainerAdapter.mo16805e(uVar, container.f10973g);
        uVar.mo16865O("statusBar");
        this.nullableStringAdapter.mo16805e(uVar, container.f10974h);
        uVar.mo16865O("scrollable");
        this.nullableBooleanAdapter.mo16805e(uVar, container.f10975i);
        uVar.mo16865O("tags");
        this.nullableListOfStringAdapter.mo16805e(uVar, container.f10976j);
        uVar.mo16865O("actions");
        this.nullableActionsAdapter.mo16805e(uVar, container.f10977k);
        uVar.mo16865O("containers");
        this.nullableMutableListOfContainerAdapter.mo16805e(uVar, container.f10978l);
        uVar.mo16865O("params");
        this.nullableParamsAdapter.mo16805e(uVar, container.f10979m);
        uVar.mo16864H();
    }

    public String toString() {
        C6888i.m12437d("GeneratedJsonAdapter(Container)", "StringBuilder(capacity).…builderAction).toString()");
        return "GeneratedJsonAdapter(Container)";
    }
}
