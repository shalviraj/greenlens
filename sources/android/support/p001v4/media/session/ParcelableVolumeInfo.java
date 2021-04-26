package android.support.p001v4.media.session;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: android.support.v4.media.session.ParcelableVolumeInfo */
public class ParcelableVolumeInfo implements Parcelable {
    public static final Parcelable.Creator<ParcelableVolumeInfo> CREATOR = new C0023a();

    /* renamed from: g */
    public int f47g;

    /* renamed from: h */
    public int f48h;

    /* renamed from: i */
    public int f49i;

    /* renamed from: j */
    public int f50j;

    /* renamed from: k */
    public int f51k;

    /* renamed from: android.support.v4.media.session.ParcelableVolumeInfo$a */
    public static class C0023a implements Parcelable.Creator<ParcelableVolumeInfo> {
        public Object createFromParcel(Parcel parcel) {
            return new ParcelableVolumeInfo(parcel);
        }

        public Object[] newArray(int i) {
            return new ParcelableVolumeInfo[i];
        }
    }

    public ParcelableVolumeInfo(Parcel parcel) {
        this.f47g = parcel.readInt();
        this.f49i = parcel.readInt();
        this.f50j = parcel.readInt();
        this.f51k = parcel.readInt();
        this.f48h = parcel.readInt();
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f47g);
        parcel.writeInt(this.f49i);
        parcel.writeInt(this.f50j);
        parcel.writeInt(this.f51k);
        parcel.writeInt(this.f48h);
    }
}
