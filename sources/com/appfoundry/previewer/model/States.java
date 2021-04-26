package com.appfoundry.previewer.model;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p005b.p035e.p036a.p037a.C0843a;
import p005b.p280p.p281a.C5077m;
import p298d.p344x.p346c.C6888i;

@C5077m(generateAdapter = true)
@Metadata(mo24460bv = {1, 0, 3}, mo24461d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001b\b\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bR\u001b\u0010\u0011\u001a\u0004\u0018\u00010\f8\u0006@\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0014\u001a\u0004\u0018\u00010\f8\u0006@\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u000e\u001a\u0004\b\u0013\u0010\u0010R\u001b\u0010\u0017\u001a\u0004\u0018\u00010\f8\u0006@\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u000e\u001a\u0004\b\u0016\u0010\u0010R$\u0010\u001d\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u0004\"\u0004\b\u001b\u0010\u001cR\u001b\u0010 \u001a\u0004\u0018\u00010\f8\u0006@\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u000e\u001a\u0004\b\u001f\u0010\u0010R\u001b\u0010#\u001a\u0004\u0018\u00010\f8\u0006@\u0006¢\u0006\f\n\u0004\b!\u0010\u000e\u001a\u0004\b\"\u0010\u0010R\u001b\u0010&\u001a\u0004\u0018\u00010\f8\u0006@\u0006¢\u0006\f\n\u0004\b$\u0010\u000e\u001a\u0004\b%\u0010\u0010¨\u0006'"}, mo24462d2 = {"Lcom/appfoundry/previewer/model/States;", "", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/appfoundry/previewer/model/Component;", "a", "Lcom/appfoundry/previewer/model/Component;", "getDefault", "()Lcom/appfoundry/previewer/model/Component;", "default", "c", "getActive", "active", "f", "getLoading", "loading", "g", "Ljava/lang/String;", "getCurrent", "setCurrent", "(Ljava/lang/String;)V", "current", "e", "getError", "error", "d", "getEmpty", "empty", "b", "getPressed", "pressed", "app_debug"}, mo24463k = 1, mo24464mv = {1, 4, 2})
public final class States {

    /* renamed from: a */
    public final Component f11111a;

    /* renamed from: b */
    public final Component f11112b;

    /* renamed from: c */
    public final Component f11113c;

    /* renamed from: d */
    public final Component f11114d;

    /* renamed from: e */
    public final Component f11115e;

    /* renamed from: f */
    public final Component f11116f;

    /* renamed from: g */
    public transient String f11117g;

    public States(Component component, Component component2, Component component3, Component component4, Component component5, Component component6, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        str = (i & 64) != 0 ? null : str;
        this.f11111a = component;
        this.f11112b = component2;
        this.f11113c = component3;
        this.f11114d = component4;
        this.f11115e = component5;
        this.f11116f = component6;
        this.f11117g = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof States)) {
            return false;
        }
        States states = (States) obj;
        return C6888i.m12434a(this.f11111a, states.f11111a) && C6888i.m12434a(this.f11112b, states.f11112b) && C6888i.m12434a(this.f11113c, states.f11113c) && C6888i.m12434a(this.f11114d, states.f11114d) && C6888i.m12434a(this.f11115e, states.f11115e) && C6888i.m12434a(this.f11116f, states.f11116f) && C6888i.m12434a(this.f11117g, states.f11117g);
    }

    public int hashCode() {
        Component component = this.f11111a;
        int i = 0;
        int hashCode = (component != null ? component.hashCode() : 0) * 31;
        Component component2 = this.f11112b;
        int hashCode2 = (hashCode + (component2 != null ? component2.hashCode() : 0)) * 31;
        Component component3 = this.f11113c;
        int hashCode3 = (hashCode2 + (component3 != null ? component3.hashCode() : 0)) * 31;
        Component component4 = this.f11114d;
        int hashCode4 = (hashCode3 + (component4 != null ? component4.hashCode() : 0)) * 31;
        Component component5 = this.f11115e;
        int hashCode5 = (hashCode4 + (component5 != null ? component5.hashCode() : 0)) * 31;
        Component component6 = this.f11116f;
        int hashCode6 = (hashCode5 + (component6 != null ? component6.hashCode() : 0)) * 31;
        String str = this.f11117g;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode6 + i;
    }

    public String toString() {
        StringBuilder u = C0843a.m460u("States(default=");
        u.append(this.f11111a);
        u.append(", pressed=");
        u.append(this.f11112b);
        u.append(", active=");
        u.append(this.f11113c);
        u.append(", empty=");
        u.append(this.f11114d);
        u.append(", error=");
        u.append(this.f11115e);
        u.append(", loading=");
        u.append(this.f11116f);
        u.append(", current=");
        return C0843a.m455p(u, this.f11117g, ")");
    }
}
