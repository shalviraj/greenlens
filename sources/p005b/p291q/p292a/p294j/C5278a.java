package p005b.p291q.p292a.p294j;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;

/* renamed from: b.q.a.j.a */
public class C5278a implements Parcelable {
    public static final Parcelable.Creator<C5278a> CREATOR = new C5279a();
    @Nullable

    /* renamed from: g */
    public final String f10534g;

    /* renamed from: h */
    public final float f10535h;

    /* renamed from: i */
    public final float f10536i;

    /* renamed from: b.q.a.j.a$a */
    public static class C5279a implements Parcelable.Creator<C5278a> {
        public Object createFromParcel(Parcel parcel) {
            return new C5278a(parcel);
        }

        public Object[] newArray(int i) {
            return new C5278a[i];
        }
    }

    public C5278a(Parcel parcel) {
        this.f10534g = parcel.readString();
        this.f10535h = parcel.readFloat();
        this.f10536i = parcel.readFloat();
    }

    public C5278a(@Nullable String str, float f, float f2) {
        this.f10534g = str;
        this.f10535h = f;
        this.f10536i = f2;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f10534g);
        parcel.writeFloat(this.f10535h);
        parcel.writeFloat(this.f10536i);
    }
}
