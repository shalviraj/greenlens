package p005b.p096l.p097a.p113c.p145h.p147b;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import p005b.p006a.p007a.p024o.C0823f;
import p005b.p096l.p097a.p113c.p119b.p122m.p123v.C1948a;

/* renamed from: b.l.a.c.h.b.q */
public final class C3287q extends C1948a implements Iterable<String> {
    public static final Parcelable.Creator<C3287q> CREATOR = new C3298r();

    /* renamed from: g */
    public final Bundle f5876g;

    public C3287q(Bundle bundle) {
        this.f5876g = bundle;
    }

    /* renamed from: V */
    public final Object mo14484V(String str) {
        return this.f5876g.get(str);
    }

    /* renamed from: W */
    public final Long mo14485W() {
        return Long.valueOf(this.f5876g.getLong("value"));
    }

    /* renamed from: X */
    public final Double mo14486X() {
        return Double.valueOf(this.f5876g.getDouble("value"));
    }

    /* renamed from: Y */
    public final String mo14487Y(String str) {
        return this.f5876g.getString(str);
    }

    /* renamed from: Z */
    public final Bundle mo14488Z() {
        return new Bundle(this.f5876g);
    }

    public final Iterator<String> iterator() {
        return new C3276p(this);
    }

    public final String toString() {
        return this.f5876g.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int w0 = C0823f.m403w0(parcel, 20293);
        C0823f.m385n0(parcel, 2, mo14488Z(), false);
        C0823f.m331A0(parcel, w0);
    }
}
