package android.support.p001v4.media.session;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import p005b.p035e.p036a.p037a.C0843a;

/* renamed from: android.support.v4.media.session.PlaybackStateCompat */
public final class PlaybackStateCompat implements Parcelable {
    public static final Parcelable.Creator<PlaybackStateCompat> CREATOR = new C0025a();

    /* renamed from: g */
    public final int f52g;

    /* renamed from: h */
    public final long f53h;

    /* renamed from: i */
    public final long f54i;

    /* renamed from: j */
    public final float f55j;

    /* renamed from: k */
    public final long f56k;

    /* renamed from: l */
    public final int f57l;

    /* renamed from: m */
    public final CharSequence f58m;

    /* renamed from: n */
    public final long f59n;

    /* renamed from: o */
    public List<CustomAction> f60o;

    /* renamed from: p */
    public final long f61p;

    /* renamed from: q */
    public final Bundle f62q;

    /* renamed from: android.support.v4.media.session.PlaybackStateCompat$CustomAction */
    public static final class CustomAction implements Parcelable {
        public static final Parcelable.Creator<CustomAction> CREATOR = new C0024a();

        /* renamed from: g */
        public final String f63g;

        /* renamed from: h */
        public final CharSequence f64h;

        /* renamed from: i */
        public final int f65i;

        /* renamed from: j */
        public final Bundle f66j;

        /* renamed from: k */
        public Object f67k;

        /* renamed from: android.support.v4.media.session.PlaybackStateCompat$CustomAction$a */
        public static class C0024a implements Parcelable.Creator<CustomAction> {
            public Object createFromParcel(Parcel parcel) {
                return new CustomAction(parcel);
            }

            public Object[] newArray(int i) {
                return new CustomAction[i];
            }
        }

        public CustomAction(Parcel parcel) {
            this.f63g = parcel.readString();
            this.f64h = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f65i = parcel.readInt();
            this.f66j = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
        }

        public CustomAction(String str, CharSequence charSequence, int i, Bundle bundle) {
            this.f63g = str;
            this.f64h = charSequence;
            this.f65i = i;
            this.f66j = bundle;
        }

        public int describeContents() {
            return 0;
        }

        public String toString() {
            StringBuilder u = C0843a.m460u("Action:mName='");
            u.append(this.f64h);
            u.append(", mIcon=");
            u.append(this.f65i);
            u.append(", mExtras=");
            u.append(this.f66j);
            return u.toString();
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f63g);
            TextUtils.writeToParcel(this.f64h, parcel, i);
            parcel.writeInt(this.f65i);
            parcel.writeBundle(this.f66j);
        }
    }

    /* renamed from: android.support.v4.media.session.PlaybackStateCompat$a */
    public static class C0025a implements Parcelable.Creator<PlaybackStateCompat> {
        public Object createFromParcel(Parcel parcel) {
            return new PlaybackStateCompat(parcel);
        }

        public Object[] newArray(int i) {
            return new PlaybackStateCompat[i];
        }
    }

    public PlaybackStateCompat(int i, long j, long j2, float f, long j3, int i2, CharSequence charSequence, long j4, List<CustomAction> list, long j5, Bundle bundle) {
        this.f52g = i;
        this.f53h = j;
        this.f54i = j2;
        this.f55j = f;
        this.f56k = j3;
        this.f57l = i2;
        this.f58m = charSequence;
        this.f59n = j4;
        this.f60o = new ArrayList(list);
        this.f61p = j5;
        this.f62q = bundle;
    }

    public PlaybackStateCompat(Parcel parcel) {
        this.f52g = parcel.readInt();
        this.f53h = parcel.readLong();
        this.f55j = parcel.readFloat();
        this.f59n = parcel.readLong();
        this.f54i = parcel.readLong();
        this.f56k = parcel.readLong();
        this.f58m = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f60o = parcel.createTypedArrayList(CustomAction.CREATOR);
        this.f61p = parcel.readLong();
        this.f62q = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
        this.f57l = parcel.readInt();
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "PlaybackState {" + "state=" + this.f52g + ", position=" + this.f53h + ", buffered position=" + this.f54i + ", speed=" + this.f55j + ", updated=" + this.f59n + ", actions=" + this.f56k + ", error code=" + this.f57l + ", error message=" + this.f58m + ", custom actions=" + this.f60o + ", active item id=" + this.f61p + "}";
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f52g);
        parcel.writeLong(this.f53h);
        parcel.writeFloat(this.f55j);
        parcel.writeLong(this.f59n);
        parcel.writeLong(this.f54i);
        parcel.writeLong(this.f56k);
        TextUtils.writeToParcel(this.f58m, parcel, i);
        parcel.writeTypedList(this.f60o);
        parcel.writeLong(this.f61p);
        parcel.writeBundle(this.f62q);
        parcel.writeInt(this.f57l);
    }
}
