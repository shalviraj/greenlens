package com.appfoundry.previewer.model;

import com.segment.analytics.AnalyticsContext;
import java.lang.reflect.Constructor;
import java.util.List;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p005b.p273o.C4805c3;
import p005b.p280p.p281a.C5075l;
import p005b.p280p.p281a.C5078n;
import p005b.p280p.p281a.C5081q;
import p005b.p280p.p281a.C5087u;
import p005b.p280p.p281a.C5099x;
import p005b.p280p.p281a.p284z.C5117b;
import p298d.p334t.C6800r;
import p298d.p344x.p346c.C6888i;

@Metadata(mo24460bv = {1, 0, 3}, mo24461d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0004\u0010\u0005R\u001e\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00018\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0016\u0010\n\u001a\u00020\t8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u001e\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u00018\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010\bR$\u0010\u0010\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e0\u00018\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\bR$\u0010\u0011\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000e0\u00018\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\bR\u001e\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u00018\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\bR\u001c\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00030\u00018\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\bR\u001e\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00158\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R$\u0010\u0019\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00180\u00018\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\bR\u001e\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00018\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\bR\u001e\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u00018\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\b¨\u0006 "}, mo24462d2 = {"Lcom/appfoundry/previewer/model/PageJsonAdapter;", "Lb/p/a/l;", "Lcom/appfoundry/previewer/model/Page;", "", "toString", "()Ljava/lang/String;", "Lcom/appfoundry/previewer/model/Animation;", "nullableAnimationAdapter", "Lb/p/a/l;", "Lb/p/a/q$a;", "options", "Lb/p/a/q$a;", "Lcom/appfoundry/previewer/model/States;", "nullableStatesAdapter", "", "Lcom/appfoundry/previewer/model/Container;", "nullableMutableListOfContainerAdapter", "nullableMutableListOfStringAdapter", "", "nullableBooleanAdapter", "stringAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "", "nullableListOfStringAdapter", "nullableStringAdapter", "nullableContainerAdapter", "Lb/p/a/x;", "moshi", "<init>", "(Lb/p/a/x;)V", "app_debug"}, mo24463k = 1, mo24464mv = {1, 4, 2})
public final class PageJsonAdapter extends C5075l<Page> {
    private volatile Constructor<Page> constructorRef;
    private final C5075l<Animation> nullableAnimationAdapter;
    private final C5075l<Boolean> nullableBooleanAdapter;
    private final C5075l<Container> nullableContainerAdapter;
    private final C5075l<List<String>> nullableListOfStringAdapter;
    private final C5075l<List<Container>> nullableMutableListOfContainerAdapter;
    private final C5075l<List<String>> nullableMutableListOfStringAdapter;
    private final C5075l<States> nullableStatesAdapter;
    private final C5075l<String> nullableStringAdapter;
    private final C5081q.C5082a options;
    private final C5075l<String> stringAdapter;

    public PageJsonAdapter(C5099x xVar) {
        C5099x xVar2 = xVar;
        Class<Container> cls = Container.class;
        Class<String> cls2 = String.class;
        C6888i.m12438e(xVar2, "moshi");
        C5081q.C5082a a = C5081q.C5082a.m9296a(AnalyticsContext.Device.DEVICE_ID_KEY, "name", "type", "topBar", "header", "body", "layers", "footer", "background", "start", "remote", "nextLink", "tags", "intro", "swipeHref", "states", "remoteForm", "styleId", "state", "stateSetId", "animation");
        C6888i.m12437d(a, "JsonReader.Options.of(\"i…stateSetId\", \"animation\")");
        this.options = a;
        C6800r rVar = C6800r.f13715g;
        C5075l<String> d = xVar2.mo16932d(cls2, rVar, AnalyticsContext.Device.DEVICE_ID_KEY);
        C6888i.m12437d(d, "moshi.adapter(String::cl…, emptySet(),\n      \"id\")");
        this.stringAdapter = d;
        C5075l<String> d2 = xVar2.mo16932d(cls2, rVar, "name");
        C6888i.m12437d(d2, "moshi.adapter(String::cl…      emptySet(), \"name\")");
        this.nullableStringAdapter = d2;
        C5075l<Container> d3 = xVar2.mo16932d(cls, rVar, "topBar");
        C6888i.m12437d(d3, "moshi.adapter(Container:…va, emptySet(), \"topBar\")");
        this.nullableContainerAdapter = d3;
        C5075l<List<Container>> d4 = xVar2.mo16932d(C4805c3.m8814m(List.class, cls), rVar, "body");
        C6888i.m12437d(d4, "moshi.adapter(Types.newP…      emptySet(), \"body\")");
        this.nullableMutableListOfContainerAdapter = d4;
        C5075l<Boolean> d5 = xVar2.mo16932d(Boolean.class, rVar, "start");
        C6888i.m12437d(d5, "moshi.adapter(Boolean::c…ype, emptySet(), \"start\")");
        this.nullableBooleanAdapter = d5;
        C5075l<List<String>> d6 = xVar2.mo16932d(C4805c3.m8814m(List.class, cls2), rVar, "tags");
        C6888i.m12437d(d6, "moshi.adapter(Types.newP…emptySet(),\n      \"tags\")");
        this.nullableListOfStringAdapter = d6;
        C5075l<List<String>> d7 = xVar2.mo16932d(C4805c3.m8814m(List.class, cls2), rVar, "swipeHref");
        C6888i.m12437d(d7, "moshi.adapter(Types.newP… emptySet(), \"swipeHref\")");
        this.nullableMutableListOfStringAdapter = d7;
        C5075l<States> d8 = xVar2.mo16932d(States.class, rVar, "states");
        C6888i.m12437d(d8, "moshi.adapter(States::cl…    emptySet(), \"states\")");
        this.nullableStatesAdapter = d8;
        C5075l<Animation> d9 = xVar2.mo16932d(Animation.class, rVar, "animation");
        C6888i.m12437d(d9, "moshi.adapter(Animation:… emptySet(), \"animation\")");
        this.nullableAnimationAdapter = d9;
    }

    /* renamed from: a */
    public Object mo16804a(C5081q qVar) {
        long j;
        C5081q qVar2 = qVar;
        Class<Container> cls = Container.class;
        Class<String> cls2 = String.class;
        C6888i.m12438e(qVar2, "reader");
        qVar.mo16840e();
        int i = -1;
        String str = null;
        String str2 = null;
        String str3 = null;
        Container container = null;
        Container container2 = null;
        List list = null;
        List list2 = null;
        Container container3 = null;
        Container container4 = null;
        Boolean bool = null;
        String str4 = null;
        String str5 = null;
        List list3 = null;
        String str6 = null;
        List list4 = null;
        States states = null;
        String str7 = null;
        String str8 = null;
        String str9 = null;
        String str10 = null;
        Animation animation = null;
        while (qVar.mo16835N()) {
            switch (qVar2.mo16844n0(this.options)) {
                case -1:
                    qVar.mo16845o0();
                    qVar.mo16846p0();
                    continue;
                case 0:
                    str = this.stringAdapter.mo16804a(qVar2);
                    if (str != null) {
                        continue;
                    } else {
                        C5078n m = C5117b.m9426m(AnalyticsContext.Device.DEVICE_ID_KEY, AnalyticsContext.Device.DEVICE_ID_KEY, qVar2);
                        C6888i.m12437d(m, "Util.unexpectedNull(\"id\", \"id\", reader)");
                        throw m;
                    }
                case 1:
                    str2 = this.nullableStringAdapter.mo16804a(qVar2);
                    j = 4294967293L;
                    break;
                case 2:
                    str3 = this.nullableStringAdapter.mo16804a(qVar2);
                    j = 4294967291L;
                    break;
                case 3:
                    container = this.nullableContainerAdapter.mo16804a(qVar2);
                    j = 4294967287L;
                    break;
                case 4:
                    container2 = this.nullableContainerAdapter.mo16804a(qVar2);
                    j = 4294967279L;
                    break;
                case 5:
                    list = this.nullableMutableListOfContainerAdapter.mo16804a(qVar2);
                    j = 4294967263L;
                    break;
                case 6:
                    list2 = this.nullableMutableListOfContainerAdapter.mo16804a(qVar2);
                    j = 4294967231L;
                    break;
                case 7:
                    container3 = this.nullableContainerAdapter.mo16804a(qVar2);
                    j = 4294967167L;
                    break;
                case 8:
                    container4 = this.nullableContainerAdapter.mo16804a(qVar2);
                    j = 4294967039L;
                    break;
                case 9:
                    bool = this.nullableBooleanAdapter.mo16804a(qVar2);
                    j = 4294966783L;
                    break;
                case 10:
                    str4 = this.nullableStringAdapter.mo16804a(qVar2);
                    j = 4294966271L;
                    break;
                case 11:
                    str5 = this.nullableStringAdapter.mo16804a(qVar2);
                    j = 4294965247L;
                    break;
                case 12:
                    list3 = this.nullableListOfStringAdapter.mo16804a(qVar2);
                    j = 4294963199L;
                    break;
                case 13:
                    str6 = this.nullableStringAdapter.mo16804a(qVar2);
                    j = 4294959103L;
                    break;
                case 14:
                    list4 = this.nullableMutableListOfStringAdapter.mo16804a(qVar2);
                    j = 4294950911L;
                    break;
                case 15:
                    states = this.nullableStatesAdapter.mo16804a(qVar2);
                    j = 4294934527L;
                    break;
                case 16:
                    str7 = this.nullableStringAdapter.mo16804a(qVar2);
                    j = 4294901759L;
                    break;
                case 17:
                    str8 = this.nullableStringAdapter.mo16804a(qVar2);
                    j = 4294836223L;
                    break;
                case 18:
                    str9 = this.nullableStringAdapter.mo16804a(qVar2);
                    j = 4294705151L;
                    break;
                case 19:
                    str10 = this.nullableStringAdapter.mo16804a(qVar2);
                    j = 4294443007L;
                    break;
                case 20:
                    animation = this.nullableAnimationAdapter.mo16804a(qVar2);
                    j = 4293918719L;
                    break;
            }
            i &= (int) j;
        }
        qVar.mo16849z();
        Class<Container> cls3 = cls;
        Class<String> cls4 = cls2;
        if (i != ((int) 4292870145L)) {
            Constructor<Page> constructor = this.constructorRef;
            String str11 = "Util.missingProperty(\"id\", \"id\", reader)";
            if (constructor == null) {
                Class cls5 = Boolean.TYPE;
                constructor = Page.class.getDeclaredConstructor(new Class[]{cls4, cls4, cls4, cls3, cls3, List.class, List.class, cls3, cls3, Boolean.class, cls4, cls4, List.class, cls4, List.class, States.class, cls4, cls4, cls4, cls4, Animation.class, cls5, List.class, cls5, cls4, cls5, Integer.TYPE, C5117b.f9905c});
                this.constructorRef = constructor;
                C6888i.m12437d(constructor, "Page::class.java.getDecl…his.constructorRef = it }");
            }
            Object[] objArr = new Object[28];
            if (str != null) {
                objArr[0] = str;
                objArr[1] = str2;
                objArr[2] = str3;
                objArr[3] = container;
                objArr[4] = container2;
                objArr[5] = list;
                objArr[6] = list2;
                objArr[7] = container3;
                objArr[8] = container4;
                objArr[9] = bool;
                objArr[10] = str4;
                objArr[11] = str5;
                objArr[12] = list3;
                objArr[13] = str6;
                objArr[14] = list4;
                objArr[15] = states;
                objArr[16] = str7;
                objArr[17] = str8;
                objArr[18] = str9;
                objArr[19] = str10;
                objArr[20] = animation;
                Boolean bool2 = Boolean.FALSE;
                objArr[21] = bool2;
                objArr[22] = null;
                objArr[23] = bool2;
                objArr[24] = null;
                objArr[25] = bool2;
                objArr[26] = Integer.valueOf(i);
                objArr[27] = null;
                Page newInstance = constructor.newInstance(objArr);
                C6888i.m12437d(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
                return newInstance;
            }
            C5078n g = C5117b.m9420g(AnalyticsContext.Device.DEVICE_ID_KEY, AnalyticsContext.Device.DEVICE_ID_KEY, qVar);
            C6888i.m12437d(g, str11);
            throw g;
        } else if (str != null) {
            return new Page(str, str2, str3, container, container2, list, list2, container3, container4, bool, str4, str5, list3, str6, list4, states, str7, str8, str9, str10, animation, false, (List) null, false, (String) null, false, 65011712, (DefaultConstructorMarker) null);
        } else {
            C5078n g2 = C5117b.m9420g(AnalyticsContext.Device.DEVICE_ID_KEY, AnalyticsContext.Device.DEVICE_ID_KEY, qVar2);
            C6888i.m12437d(g2, "Util.missingProperty(\"id\", \"id\", reader)");
            throw g2;
        }
    }

    /* renamed from: e */
    public void mo16805e(C5087u uVar, Object obj) {
        Page page = (Page) obj;
        C6888i.m12438e(uVar, "writer");
        Objects.requireNonNull(page, "value_ was null! Wrap in .nullSafe() to write nullable values.");
        uVar.mo16869e();
        uVar.mo16865O(AnalyticsContext.Device.DEVICE_ID_KEY);
        this.stringAdapter.mo16805e(uVar, page.f11033a);
        uVar.mo16865O("name");
        this.nullableStringAdapter.mo16805e(uVar, page.f11034b);
        uVar.mo16865O("type");
        this.nullableStringAdapter.mo16805e(uVar, page.f11035c);
        uVar.mo16865O("topBar");
        this.nullableContainerAdapter.mo16805e(uVar, page.f11036d);
        uVar.mo16865O("header");
        this.nullableContainerAdapter.mo16805e(uVar, page.f11037e);
        uVar.mo16865O("body");
        this.nullableMutableListOfContainerAdapter.mo16805e(uVar, page.f11038f);
        uVar.mo16865O("layers");
        this.nullableMutableListOfContainerAdapter.mo16805e(uVar, page.f11039g);
        uVar.mo16865O("footer");
        this.nullableContainerAdapter.mo16805e(uVar, page.f11040h);
        uVar.mo16865O("background");
        this.nullableContainerAdapter.mo16805e(uVar, page.f11041i);
        uVar.mo16865O("start");
        this.nullableBooleanAdapter.mo16805e(uVar, page.f11042j);
        uVar.mo16865O("remote");
        this.nullableStringAdapter.mo16805e(uVar, page.f11043k);
        uVar.mo16865O("nextLink");
        this.nullableStringAdapter.mo16805e(uVar, page.f11044l);
        uVar.mo16865O("tags");
        this.nullableListOfStringAdapter.mo16805e(uVar, page.f11045m);
        uVar.mo16865O("intro");
        this.nullableStringAdapter.mo16805e(uVar, page.f11046n);
        uVar.mo16865O("swipeHref");
        this.nullableMutableListOfStringAdapter.mo16805e(uVar, page.f11047o);
        uVar.mo16865O("states");
        this.nullableStatesAdapter.mo16805e(uVar, page.f11048p);
        uVar.mo16865O("remoteForm");
        this.nullableStringAdapter.mo16805e(uVar, page.f11049q);
        uVar.mo16865O("styleId");
        this.nullableStringAdapter.mo16805e(uVar, page.f11050r);
        uVar.mo16865O("state");
        this.nullableStringAdapter.mo16805e(uVar, page.f11051s);
        uVar.mo16865O("stateSetId");
        this.nullableStringAdapter.mo16805e(uVar, page.f11052t);
        uVar.mo16865O("animation");
        this.nullableAnimationAdapter.mo16805e(uVar, page.f11053u);
        uVar.mo16864H();
    }

    public String toString() {
        C6888i.m12437d("GeneratedJsonAdapter(Page)", "StringBuilder(capacity).…builderAction).toString()");
        return "GeneratedJsonAdapter(Page)";
    }
}
