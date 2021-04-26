package com.appfoundry.previewer.model;

import java.lang.reflect.Constructor;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p005b.p280p.p281a.C5075l;
import p005b.p280p.p281a.C5081q;
import p005b.p280p.p281a.C5087u;
import p005b.p280p.p281a.C5099x;
import p005b.p280p.p281a.p284z.C5117b;
import p298d.p334t.C6800r;
import p298d.p344x.p346c.C6888i;

@Metadata(mo24460bv = {1, 0, 3}, mo24461d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0004\u0010\u0005R\u001e\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00018\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u001e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\t8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0016\u0010\r\u001a\u00020\f8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0013"}, mo24462d2 = {"Lcom/appfoundry/previewer/model/StatesJsonAdapter;", "Lb/p/a/l;", "Lcom/appfoundry/previewer/model/States;", "", "toString", "()Ljava/lang/String;", "Lcom/appfoundry/previewer/model/Component;", "nullableComponentAdapter", "Lb/p/a/l;", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "Lb/p/a/q$a;", "options", "Lb/p/a/q$a;", "Lb/p/a/x;", "moshi", "<init>", "(Lb/p/a/x;)V", "app_debug"}, mo24463k = 1, mo24464mv = {1, 4, 2})
public final class StatesJsonAdapter extends C5075l<States> {
    private volatile Constructor<States> constructorRef;
    private final C5075l<Component> nullableComponentAdapter;
    private final C5081q.C5082a options;

    public StatesJsonAdapter(C5099x xVar) {
        C6888i.m12438e(xVar, "moshi");
        C5081q.C5082a a = C5081q.C5082a.m9296a("default", "pressed", "active", "empty", "error", "loading");
        C6888i.m12437d(a, "JsonReader.Options.of(\"d…pty\", \"error\", \"loading\")");
        this.options = a;
        C5075l<Component> d = xVar.mo16932d(Component.class, C6800r.f13715g, "default");
        C6888i.m12437d(d, "moshi.adapter(Component:…a, emptySet(), \"default\")");
        this.nullableComponentAdapter = d;
    }

    /* renamed from: a */
    public Object mo16804a(C5081q qVar) {
        C5081q qVar2 = qVar;
        Class<Component> cls = Component.class;
        C6888i.m12438e(qVar2, "reader");
        qVar.mo16840e();
        Component component = null;
        Component component2 = null;
        Component component3 = null;
        Component component4 = null;
        Component component5 = null;
        Component component6 = null;
        while (qVar.mo16835N()) {
            switch (qVar2.mo16844n0(this.options)) {
                case -1:
                    qVar.mo16845o0();
                    qVar.mo16846p0();
                    break;
                case 0:
                    component = this.nullableComponentAdapter.mo16804a(qVar2);
                    break;
                case 1:
                    component2 = this.nullableComponentAdapter.mo16804a(qVar2);
                    break;
                case 2:
                    component3 = this.nullableComponentAdapter.mo16804a(qVar2);
                    break;
                case 3:
                    component4 = this.nullableComponentAdapter.mo16804a(qVar2);
                    break;
                case 4:
                    component5 = this.nullableComponentAdapter.mo16804a(qVar2);
                    break;
                case 5:
                    component6 = this.nullableComponentAdapter.mo16804a(qVar2);
                    break;
            }
        }
        qVar.mo16849z();
        if (-1 == ((int) 4294967295L)) {
            return new States(component, component2, component3, component4, component5, component6, (String) null, 64, (DefaultConstructorMarker) null);
        }
        Constructor<States> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = States.class.getDeclaredConstructor(new Class[]{cls, cls, cls, cls, cls, cls, String.class, Integer.TYPE, C5117b.f9905c});
            this.constructorRef = constructor;
            C6888i.m12437d(constructor, "States::class.java.getDe…his.constructorRef = it }");
        }
        States newInstance = constructor.newInstance(new Object[]{component, component2, component3, component4, component5, component6, null, -1, null});
        C6888i.m12437d(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
        return newInstance;
    }

    /* renamed from: e */
    public void mo16805e(C5087u uVar, Object obj) {
        States states = (States) obj;
        C6888i.m12438e(uVar, "writer");
        Objects.requireNonNull(states, "value_ was null! Wrap in .nullSafe() to write nullable values.");
        uVar.mo16869e();
        uVar.mo16865O("default");
        this.nullableComponentAdapter.mo16805e(uVar, states.f11111a);
        uVar.mo16865O("pressed");
        this.nullableComponentAdapter.mo16805e(uVar, states.f11112b);
        uVar.mo16865O("active");
        this.nullableComponentAdapter.mo16805e(uVar, states.f11113c);
        uVar.mo16865O("empty");
        this.nullableComponentAdapter.mo16805e(uVar, states.f11114d);
        uVar.mo16865O("error");
        this.nullableComponentAdapter.mo16805e(uVar, states.f11115e);
        uVar.mo16865O("loading");
        this.nullableComponentAdapter.mo16805e(uVar, states.f11116f);
        uVar.mo16864H();
    }

    public String toString() {
        C6888i.m12437d("GeneratedJsonAdapter(States)", "StringBuilder(capacity).…builderAction).toString()");
        return "GeneratedJsonAdapter(States)";
    }
}
