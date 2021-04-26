package p005b.p040g.p041a.p046h;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.ColorRes;

/* renamed from: b.g.a.h.i */
public class C0887i implements Parcelable {
    public static final Parcelable.Creator<C0887i> CREATOR = new C0888a();

    /* renamed from: g */
    public final boolean f764g;
    @ColorRes

    /* renamed from: h */
    public final int f765h;

    /* renamed from: b.g.a.h.i$a */
    public static class C0888a implements Parcelable.Creator<C0887i> {
        public Object createFromParcel(Parcel parcel) {
            return new C0887i(parcel);
        }

        public Object[] newArray(int i) {
            return new C0887i[i];
        }
    }

    public C0887i(Parcel parcel) {
        this.f764g = parcel.readByte() != 0;
        this.f765h = parcel.readInt();
    }

    public C0887i(boolean z, int i, C0888a aVar) {
        this.f764g = z;
        this.f765h = i;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeByte(this.f764g ? (byte) 1 : 0);
        parcel.writeInt(this.f765h);
    }
}
