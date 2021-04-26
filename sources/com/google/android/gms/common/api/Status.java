package com.google.android.gms.common.api;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.Arrays;
import p005b.p006a.p007a.p024o.C0823f;
import p005b.p096l.p097a.p113c.p119b.p120l.C1789h;
import p005b.p096l.p097a.p113c.p119b.p120l.C1886m;
import p005b.p096l.p097a.p113c.p119b.p122m.C1941q0;
import p005b.p096l.p097a.p113c.p119b.p122m.C1942r;
import p005b.p096l.p097a.p113c.p119b.p122m.p123v.C1948a;

public final class Status extends C1948a implements C1789h, ReflectedParcelable {
    public static final Parcelable.Creator<Status> CREATOR = new C1886m();

    /* renamed from: k */
    public static final Status f11278k = new Status(0);

    /* renamed from: l */
    public static final Status f11279l = new Status(8);

    /* renamed from: m */
    public static final Status f11280m = new Status(15);

    /* renamed from: n */
    public static final Status f11281n = new Status(16);

    /* renamed from: g */
    public final int f11282g;

    /* renamed from: h */
    public final int f11283h;
    @Nullable

    /* renamed from: i */
    public final String f11284i;
    @Nullable

    /* renamed from: j */
    public final PendingIntent f11285j;

    public Status(int i) {
        this(1, i, (String) null, (PendingIntent) null);
    }

    public Status(int i, int i2, @Nullable String str, @Nullable PendingIntent pendingIntent) {
        this.f11282g = i;
        this.f11283h = i2;
        this.f11284i = str;
        this.f11285j = pendingIntent;
    }

    public Status(int i, @Nullable String str) {
        this(1, i, str, (PendingIntent) null);
    }

    /* renamed from: V */
    public final boolean mo18856V() {
        return this.f11283h <= 0;
    }

    /* renamed from: W */
    public final String mo18857W() {
        String str = this.f11284i;
        return str != null ? str : C0823f.m344M(this.f11283h);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Status)) {
            return false;
        }
        Status status = (Status) obj;
        return this.f11282g == status.f11282g && this.f11283h == status.f11283h && C0823f.m330A(this.f11284i, status.f11284i) && C0823f.m330A(this.f11285j, status.f11285j);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f11282g), Integer.valueOf(this.f11283h), this.f11284i, this.f11285j});
    }

    public final String toString() {
        C1942r rVar = new C1942r(this, (C1941q0) null);
        rVar.mo12270a("statusCode", mo18857W());
        rVar.mo12270a("resolution", this.f11285j);
        return rVar.toString();
    }

    /* renamed from: w */
    public final Status mo12039w() {
        return this;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int w0 = C0823f.m403w0(parcel, 20293);
        int i2 = this.f11283h;
        C0823f.m333B0(parcel, 1, 4);
        parcel.writeInt(i2);
        C0823f.m395s0(parcel, 2, this.f11284i, false);
        C0823f.m393r0(parcel, 3, this.f11285j, i, false);
        int i3 = this.f11282g;
        C0823f.m333B0(parcel, 1000, 4);
        parcel.writeInt(i3);
        C0823f.m331A0(parcel, w0);
    }
}
