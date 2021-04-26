package com.appfoundry.previewer.model;

import android.view.View;
import androidx.core.app.NotificationCompat;
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

@Metadata(mo24460bv = {1, 0, 3}, mo24461d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0004\u0010\u0005R$\u0010\u0007\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00060\u00018\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u001e\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u00018\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\n\u0010\bR\u001e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0016\u0010\u000f\u001a\u00020\u000e8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00018\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\bR\u001e\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u00018\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\bR$\u0010\u0016\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u00140\u00018\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\bR\u001e\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00018\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\bR$\u0010\u0019\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00060\u00018\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\bR\u001e\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u00018\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\b¨\u0006 "}, mo24462d2 = {"Lcom/appfoundry/previewer/model/ComponentJsonAdapter;", "Lb/p/a/l;", "Lcom/appfoundry/previewer/model/Component;", "", "toString", "()Ljava/lang/String;", "", "nullableMutableListOfComponentAdapter", "Lb/p/a/l;", "Lcom/appfoundry/previewer/model/Text;", "nullableTextAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "Lb/p/a/q$a;", "options", "Lb/p/a/q$a;", "nullableStringAdapter", "Lcom/appfoundry/previewer/model/Params;", "nullableParamsAdapter", "", "Lcom/appfoundry/previewer/model/RichText;", "nullableListOfRichTextAdapter", "Lcom/appfoundry/previewer/model/States;", "nullableStatesAdapter", "nullableMutableListOfStringAdapter", "Lcom/appfoundry/previewer/model/Actions;", "nullableActionsAdapter", "Lb/p/a/x;", "moshi", "<init>", "(Lb/p/a/x;)V", "app_debug"}, mo24463k = 1, mo24464mv = {1, 4, 2})
public final class ComponentJsonAdapter extends C5075l<Component> {
    private volatile Constructor<Component> constructorRef;
    private final C5075l<Actions> nullableActionsAdapter;
    private final C5075l<List<RichText>> nullableListOfRichTextAdapter;
    private final C5075l<List<Component>> nullableMutableListOfComponentAdapter;
    private final C5075l<List<String>> nullableMutableListOfStringAdapter;
    private final C5075l<Params> nullableParamsAdapter;
    private final C5075l<States> nullableStatesAdapter;
    private final C5075l<String> nullableStringAdapter;
    private final C5075l<Text> nullableTextAdapter;
    private final C5081q.C5082a options;

    public ComponentJsonAdapter(C5099x xVar) {
        C5099x xVar2 = xVar;
        Class<String> cls = String.class;
        C6888i.m12438e(xVar2, "moshi");
        C5081q.C5082a a = C5081q.C5082a.m9296a(AnalyticsContext.Device.DEVICE_ID_KEY, "type", NotificationCompat.MessagingStyle.Message.KEY_TEXT, "styleId", "href", "assetId", "tags", "params", "actions", "states", "components", "hrefRemote", "value", "anchor", "richText", "format", "initialState", "name", "nodeId");
        C6888i.m12437d(a, "JsonReader.Options.of(\"i…State\", \"name\", \"nodeId\")");
        this.options = a;
        C6800r rVar = C6800r.f13715g;
        C5075l<String> d = xVar2.mo16932d(cls, rVar, AnalyticsContext.Device.DEVICE_ID_KEY);
        C6888i.m12437d(d, "moshi.adapter(String::cl…,\n      emptySet(), \"id\")");
        this.nullableStringAdapter = d;
        C5075l<Text> d2 = xVar2.mo16932d(Text.class, rVar, NotificationCompat.MessagingStyle.Message.KEY_TEXT);
        C6888i.m12437d(d2, "moshi.adapter(Text::clas…emptySet(),\n      \"text\")");
        this.nullableTextAdapter = d2;
        C5075l<List<String>> d3 = xVar2.mo16932d(C4805c3.m8814m(List.class, cls), rVar, "tags");
        C6888i.m12437d(d3, "moshi.adapter(Types.newP…      emptySet(), \"tags\")");
        this.nullableMutableListOfStringAdapter = d3;
        C5075l<Params> d4 = xVar2.mo16932d(Params.class, rVar, "params");
        C6888i.m12437d(d4, "moshi.adapter(Params::cl…    emptySet(), \"params\")");
        this.nullableParamsAdapter = d4;
        C5075l<Actions> d5 = xVar2.mo16932d(Actions.class, rVar, "actions");
        C6888i.m12437d(d5, "moshi.adapter(Actions::c…   emptySet(), \"actions\")");
        this.nullableActionsAdapter = d5;
        C5075l<States> d6 = xVar2.mo16932d(States.class, rVar, "states");
        C6888i.m12437d(d6, "moshi.adapter(States::cl…    emptySet(), \"states\")");
        this.nullableStatesAdapter = d6;
        C5075l<List<Component>> d7 = xVar2.mo16932d(C4805c3.m8814m(List.class, Component.class), rVar, "components");
        C6888i.m12437d(d7, "moshi.adapter(Types.newP…emptySet(), \"components\")");
        this.nullableMutableListOfComponentAdapter = d7;
        C5075l<List<RichText>> d8 = xVar2.mo16932d(C4805c3.m8814m(List.class, RichText.class), rVar, "richText");
        C6888i.m12437d(d8, "moshi.adapter(Types.newP…ySet(),\n      \"richText\")");
        this.nullableListOfRichTextAdapter = d8;
    }

    /* renamed from: a */
    public Object mo16804a(C5081q qVar) {
        C5081q qVar2 = qVar;
        Class<String> cls = String.class;
        C6888i.m12438e(qVar2, "reader");
        qVar.mo16840e();
        String str = null;
        String str2 = null;
        Text text = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        List list = null;
        Params params = null;
        Actions actions = null;
        States states = null;
        List list2 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        List list3 = null;
        String str9 = null;
        String str10 = null;
        String str11 = null;
        String str12 = null;
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
                    text = this.nullableTextAdapter.mo16804a(qVar2);
                    break;
                case 3:
                    str3 = this.nullableStringAdapter.mo16804a(qVar2);
                    break;
                case 4:
                    str4 = this.nullableStringAdapter.mo16804a(qVar2);
                    break;
                case 5:
                    str5 = this.nullableStringAdapter.mo16804a(qVar2);
                    break;
                case 6:
                    list = this.nullableMutableListOfStringAdapter.mo16804a(qVar2);
                    break;
                case 7:
                    params = this.nullableParamsAdapter.mo16804a(qVar2);
                    break;
                case 8:
                    actions = this.nullableActionsAdapter.mo16804a(qVar2);
                    break;
                case 9:
                    states = this.nullableStatesAdapter.mo16804a(qVar2);
                    break;
                case 10:
                    list2 = this.nullableMutableListOfComponentAdapter.mo16804a(qVar2);
                    break;
                case 11:
                    str6 = this.nullableStringAdapter.mo16804a(qVar2);
                    break;
                case 12:
                    str7 = this.nullableStringAdapter.mo16804a(qVar2);
                    break;
                case 13:
                    str8 = this.nullableStringAdapter.mo16804a(qVar2);
                    break;
                case 14:
                    list3 = this.nullableListOfRichTextAdapter.mo16804a(qVar2);
                    break;
                case 15:
                    str9 = this.nullableStringAdapter.mo16804a(qVar2);
                    break;
                case 16:
                    str10 = this.nullableStringAdapter.mo16804a(qVar2);
                    break;
                case 17:
                    str11 = this.nullableStringAdapter.mo16804a(qVar2);
                    break;
                case 18:
                    str12 = this.nullableStringAdapter.mo16804a(qVar2);
                    break;
            }
        }
        qVar.mo16849z();
        if (-1 == ((int) 4294967295L)) {
            return new Component(str, str2, text, str3, str4, str5, (String) null, (Integer) null, list, params, actions, states, list2, str6, str7, str8, list3, str9, str10, str11, str12, (String) null, (String) null, (View) null, 14680256, (DefaultConstructorMarker) null);
        }
        Constructor<Component> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = Component.class.getDeclaredConstructor(new Class[]{cls, cls, Text.class, cls, cls, cls, cls, Integer.class, List.class, Params.class, Actions.class, States.class, List.class, cls, cls, cls, List.class, cls, cls, cls, cls, cls, cls, View.class, Integer.TYPE, C5117b.f9905c});
            this.constructorRef = constructor;
            C6888i.m12437d(constructor, "Component::class.java.ge…his.constructorRef = it }");
        }
        Component newInstance = constructor.newInstance(new Object[]{str, str2, text, str3, str4, str5, null, null, list, params, actions, states, list2, str6, str7, str8, list3, str9, str10, str11, str12, null, null, null, -1, null});
        C6888i.m12437d(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
        return newInstance;
    }

    /* renamed from: e */
    public void mo16805e(C5087u uVar, Object obj) {
        Component component = (Component) obj;
        C6888i.m12438e(uVar, "writer");
        Objects.requireNonNull(component, "value_ was null! Wrap in .nullSafe() to write nullable values.");
        uVar.mo16869e();
        uVar.mo16865O(AnalyticsContext.Device.DEVICE_ID_KEY);
        this.nullableStringAdapter.mo16805e(uVar, component.f10939a);
        uVar.mo16865O("type");
        this.nullableStringAdapter.mo16805e(uVar, component.f10940b);
        uVar.mo16865O(NotificationCompat.MessagingStyle.Message.KEY_TEXT);
        this.nullableTextAdapter.mo16805e(uVar, component.f10941c);
        uVar.mo16865O("styleId");
        this.nullableStringAdapter.mo16805e(uVar, component.f10942d);
        uVar.mo16865O("href");
        this.nullableStringAdapter.mo16805e(uVar, component.f10943e);
        uVar.mo16865O("assetId");
        this.nullableStringAdapter.mo16805e(uVar, component.f10944f);
        uVar.mo16865O("tags");
        this.nullableMutableListOfStringAdapter.mo16805e(uVar, component.f10947i);
        uVar.mo16865O("params");
        this.nullableParamsAdapter.mo16805e(uVar, component.f10948j);
        uVar.mo16865O("actions");
        this.nullableActionsAdapter.mo16805e(uVar, component.f10949k);
        uVar.mo16865O("states");
        this.nullableStatesAdapter.mo16805e(uVar, component.f10950l);
        uVar.mo16865O("components");
        this.nullableMutableListOfComponentAdapter.mo16805e(uVar, component.f10951m);
        uVar.mo16865O("hrefRemote");
        this.nullableStringAdapter.mo16805e(uVar, component.f10952n);
        uVar.mo16865O("value");
        this.nullableStringAdapter.mo16805e(uVar, component.f10953o);
        uVar.mo16865O("anchor");
        this.nullableStringAdapter.mo16805e(uVar, component.f10954p);
        uVar.mo16865O("richText");
        this.nullableListOfRichTextAdapter.mo16805e(uVar, component.f10955q);
        uVar.mo16865O("format");
        this.nullableStringAdapter.mo16805e(uVar, component.f10956r);
        uVar.mo16865O("initialState");
        this.nullableStringAdapter.mo16805e(uVar, component.f10957s);
        uVar.mo16865O("name");
        this.nullableStringAdapter.mo16805e(uVar, component.f10958t);
        uVar.mo16865O("nodeId");
        this.nullableStringAdapter.mo16805e(uVar, component.f10959u);
        uVar.mo16864H();
    }

    public String toString() {
        C6888i.m12437d("GeneratedJsonAdapter(Component)", "StringBuilder(capacity).…builderAction).toString()");
        return "GeneratedJsonAdapter(Component)";
    }
}
