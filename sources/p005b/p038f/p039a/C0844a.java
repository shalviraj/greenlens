package p005b.p038f.p039a;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.app.NotificationCompat;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p005b.p035e.p036a.p037a.C0843a;
import p298d.p344x.p346c.C6888i;

/* renamed from: b.f.a.a */
public final class C0844a implements Parcelable {
    public static final C0845a CREATOR = new C0845a((DefaultConstructorMarker) null);

    /* renamed from: g */
    public final Uri f698g;

    /* renamed from: h */
    public final String f699h;

    /* renamed from: i */
    public final String f700i;

    /* renamed from: j */
    public final String f701j;

    /* renamed from: k */
    public final String f702k;

    /* renamed from: l */
    public final String f703l;

    /* renamed from: b.f.a.a$a */
    public static final class C0845a implements Parcelable.Creator<C0844a> {
        public C0845a(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public Object createFromParcel(Parcel parcel) {
            C6888i.m12439f(parcel, "parcel");
            return new C0844a(parcel);
        }

        public Object[] newArray(int i) {
            return new C0844a[i];
        }
    }

    public C0844a(Uri uri, String str, String str2, String str3, String str4, String str5) {
        C6888i.m12439f(uri, NotificationCompat.MessagingStyle.Message.KEY_DATA_URI);
        this.f698g = uri;
        this.f699h = str;
        this.f700i = str2;
        this.f701j = str3;
        this.f702k = str4;
        this.f703l = str5;
    }

    public C0844a(Parcel parcel) {
        C6888i.m12439f(parcel, "parcel");
        Parcelable readParcelable = parcel.readParcelable(Uri.class.getClassLoader());
        C6888i.m12435b(readParcelable, "parcel.readParcelable(Uri::class.java.classLoader)");
        Uri uri = (Uri) readParcelable;
        String readString = parcel.readString();
        String readString2 = parcel.readString();
        String readString3 = parcel.readString();
        String readString4 = parcel.readString();
        String readString5 = parcel.readString();
        C6888i.m12439f(uri, NotificationCompat.MessagingStyle.Message.KEY_DATA_URI);
        this.f698g = uri;
        this.f699h = readString;
        this.f700i = readString2;
        this.f701j = readString3;
        this.f702k = readString4;
        this.f703l = readString5;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0844a)) {
            return false;
        }
        C0844a aVar = (C0844a) obj;
        return C6888i.m12434a(this.f698g, aVar.f698g) && C6888i.m12434a(this.f699h, aVar.f699h) && C6888i.m12434a(this.f700i, aVar.f700i) && C6888i.m12434a(this.f701j, aVar.f701j) && C6888i.m12434a(this.f702k, aVar.f702k) && C6888i.m12434a(this.f703l, aVar.f703l);
    }

    public int hashCode() {
        Uri uri = this.f698g;
        int i = 0;
        int hashCode = (uri != null ? uri.hashCode() : 0) * 31;
        String str = this.f699h;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f700i;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f701j;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f702k;
        int hashCode5 = (hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.f703l;
        if (str5 != null) {
            i = str5.hashCode();
        }
        return hashCode5 + i;
    }

    public String toString() {
        StringBuilder u = C0843a.m460u("KotResult(uri=");
        u.append(this.f698g);
        u.append(", name=");
        u.append(this.f699h);
        u.append(", size=");
        u.append(this.f700i);
        u.append(", location=");
        u.append(this.f701j);
        u.append(", type=");
        u.append(this.f702k);
        u.append(", modified=");
        return C0843a.m455p(u, this.f703l, ")");
    }

    public void writeToParcel(Parcel parcel, int i) {
        C6888i.m12439f(parcel, "parcel");
        parcel.writeParcelable(this.f698g, i);
        parcel.writeString(this.f699h);
        parcel.writeString(this.f700i);
        parcel.writeString(this.f701j);
        parcel.writeString(this.f702k);
        parcel.writeString(this.f703l);
    }
}
