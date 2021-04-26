package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import p005b.p006a.p007a.p024o.C0823f;
import p005b.p096l.p097a.p113c.p119b.p120l.C1885l;
import p005b.p096l.p097a.p113c.p119b.p122m.p123v.C1948a;

public final class Scope extends C1948a implements ReflectedParcelable {
    public static final Parcelable.Creator<Scope> CREATOR = new C1885l();

    /* renamed from: g */
    public final int f11276g;

    /* renamed from: h */
    public final String f11277h;

    public Scope(int i, String str) {
        C0823f.m374i(str, "scopeUri must not be null or empty");
        this.f11276g = i;
        this.f11277h = str;
    }

    public Scope(String str) {
        C0823f.m374i(str, "scopeUri must not be null or empty");
        this.f11276g = 1;
        this.f11277h = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Scope)) {
            return false;
        }
        return this.f11277h.equals(((Scope) obj).f11277h);
    }

    public final int hashCode() {
        return this.f11277h.hashCode();
    }

    public final String toString() {
        return this.f11277h;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int w0 = C0823f.m403w0(parcel, 20293);
        int i2 = this.f11276g;
        C0823f.m333B0(parcel, 1, 4);
        parcel.writeInt(i2);
        C0823f.m395s0(parcel, 2, this.f11277h, false);
        C0823f.m331A0(parcel, w0);
    }
}
