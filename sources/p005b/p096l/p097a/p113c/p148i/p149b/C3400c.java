package p005b.p096l.p097a.p113c.p148i.p149b;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.api.Status;
import p005b.p006a.p007a.p024o.C0823f;
import p005b.p096l.p097a.p113c.p119b.p120l.C1789h;
import p005b.p096l.p097a.p113c.p119b.p122m.p123v.C1948a;

/* renamed from: b.l.a.c.i.b.c */
public final class C3400c extends C1948a implements C1789h {
    public static final Parcelable.Creator<C3400c> CREATOR = new C3399b();

    /* renamed from: g */
    public final int f6168g;

    /* renamed from: h */
    public int f6169h;
    @Nullable

    /* renamed from: i */
    public Intent f6170i;

    public C3400c() {
        this.f6168g = 2;
        this.f6169h = 0;
        this.f6170i = null;
    }

    public C3400c(int i, int i2, @Nullable Intent intent) {
        this.f6168g = i;
        this.f6169h = i2;
        this.f6170i = intent;
    }

    /* renamed from: w */
    public final Status mo12039w() {
        return this.f6169h == 0 ? Status.f11278k : Status.f11281n;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int w0 = C0823f.m403w0(parcel, 20293);
        int i2 = this.f6168g;
        C0823f.m333B0(parcel, 1, 4);
        parcel.writeInt(i2);
        int i3 = this.f6169h;
        C0823f.m333B0(parcel, 2, 4);
        parcel.writeInt(i3);
        C0823f.m393r0(parcel, 3, this.f6170i, i, false);
        C0823f.m331A0(parcel, w0);
    }
}
