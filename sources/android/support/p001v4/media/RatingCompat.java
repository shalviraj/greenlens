package android.support.p001v4.media;

import android.os.Parcel;
import android.os.Parcelable;
import p005b.p035e.p036a.p037a.C0843a;

/* renamed from: android.support.v4.media.RatingCompat */
public final class RatingCompat implements Parcelable {
    public static final Parcelable.Creator<RatingCompat> CREATOR = new C0018a();

    /* renamed from: g */
    public final int f33g;

    /* renamed from: h */
    public final float f34h;

    /* renamed from: android.support.v4.media.RatingCompat$a */
    public static class C0018a implements Parcelable.Creator<RatingCompat> {
        public Object createFromParcel(Parcel parcel) {
            return new RatingCompat(parcel.readInt(), parcel.readFloat());
        }

        public Object[] newArray(int i) {
            return new RatingCompat[i];
        }
    }

    public RatingCompat(int i, float f) {
        this.f33g = i;
        this.f34h = f;
    }

    public int describeContents() {
        return this.f33g;
    }

    public String toString() {
        StringBuilder u = C0843a.m460u("Rating:style=");
        u.append(this.f33g);
        u.append(" rating=");
        float f = this.f34h;
        u.append(f < 0.0f ? "unrated" : String.valueOf(f));
        return u.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f33g);
        parcel.writeFloat(this.f34h);
    }
}
