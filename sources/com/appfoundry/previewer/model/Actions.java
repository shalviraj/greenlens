package com.appfoundry.previewer.model;

import p005b.p035e.p036a.p037a.C0843a;
import p005b.p280p.p281a.C5077m;
import p298d.p344x.p346c.C6888i;

@C5077m(generateAdapter = true)
public final class Actions {

    /* renamed from: a */
    public final Tap f10886a;

    public Actions(Tap tap) {
        this.f10886a = tap;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof Actions) && C6888i.m12434a(this.f10886a, ((Actions) obj).f10886a);
        }
        return true;
    }

    public int hashCode() {
        Tap tap = this.f10886a;
        if (tap != null) {
            return tap.hashCode();
        }
        return 0;
    }

    public String toString() {
        StringBuilder u = C0843a.m460u("Actions(tap=");
        u.append(this.f10886a);
        u.append(")");
        return u.toString();
    }
}
