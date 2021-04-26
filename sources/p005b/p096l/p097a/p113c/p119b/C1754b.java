package p005b.p096l.p097a.p113c.p119b;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import java.util.Arrays;
import p005b.p006a.p007a.p024o.C0823f;
import p005b.p096l.p097a.p113c.p119b.p122m.C1941q0;
import p005b.p096l.p097a.p113c.p119b.p122m.C1942r;
import p005b.p096l.p097a.p113c.p119b.p122m.p123v.C1948a;

/* renamed from: b.l.a.c.b.b */
public final class C1754b extends C1948a {
    public static final Parcelable.Creator<C1754b> CREATOR = new C1969r();

    /* renamed from: k */
    public static final C1754b f3093k = new C1754b(0);

    /* renamed from: g */
    public final int f3094g;

    /* renamed from: h */
    public final int f3095h;

    /* renamed from: i */
    public final PendingIntent f3096i;

    /* renamed from: j */
    public final String f3097j;

    public C1754b(int i) {
        this.f3094g = 1;
        this.f3095h = i;
        this.f3096i = null;
        this.f3097j = null;
    }

    public C1754b(int i, int i2, PendingIntent pendingIntent, String str) {
        this.f3094g = i;
        this.f3095h = i2;
        this.f3096i = pendingIntent;
        this.f3097j = str;
    }

    /* renamed from: X */
    public static String m2323X(int i) {
        if (i == 99) {
            return "UNFINISHED";
        }
        if (i == 1500) {
            return "DRIVE_EXTERNAL_STORAGE_REQUIRED";
        }
        switch (i) {
            case -1:
                return "UNKNOWN";
            case 0:
                return "SUCCESS";
            case 1:
                return "SERVICE_MISSING";
            case 2:
                return "SERVICE_VERSION_UPDATE_REQUIRED";
            case 3:
                return "SERVICE_DISABLED";
            case 4:
                return "SIGN_IN_REQUIRED";
            case 5:
                return "INVALID_ACCOUNT";
            case 6:
                return "RESOLUTION_REQUIRED";
            case 7:
                return "NETWORK_ERROR";
            case 8:
                return "INTERNAL_ERROR";
            case 9:
                return "SERVICE_INVALID";
            case 10:
                return "DEVELOPER_ERROR";
            case 11:
                return "LICENSE_CHECK_FAILED";
            default:
                switch (i) {
                    case 13:
                        return "CANCELED";
                    case 14:
                        return "TIMEOUT";
                    case 15:
                        return "INTERRUPTED";
                    case 16:
                        return "API_UNAVAILABLE";
                    case 17:
                        return "SIGN_IN_FAILED";
                    case 18:
                        return "SERVICE_UPDATING";
                    case 19:
                        return "SERVICE_MISSING_PERMISSION";
                    case 20:
                        return "RESTRICTED_PROFILE";
                    case 21:
                        return "API_VERSION_UPDATE_REQUIRED";
                    default:
                        StringBuilder sb = new StringBuilder(31);
                        sb.append("UNKNOWN_ERROR_CODE(");
                        sb.append(i);
                        sb.append(")");
                        return sb.toString();
                }
        }
    }

    /* renamed from: V */
    public final boolean mo11985V() {
        return (this.f3095h == 0 || this.f3096i == null) ? false : true;
    }

    /* renamed from: W */
    public final boolean mo11986W() {
        return this.f3095h == 0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1754b)) {
            return false;
        }
        C1754b bVar = (C1754b) obj;
        return this.f3095h == bVar.f3095h && C0823f.m330A(this.f3096i, bVar.f3096i) && C0823f.m330A(this.f3097j, bVar.f3097j);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f3095h), this.f3096i, this.f3097j});
    }

    public final String toString() {
        C1942r rVar = new C1942r(this, (C1941q0) null);
        rVar.mo12270a("statusCode", m2323X(this.f3095h));
        rVar.mo12270a("resolution", this.f3096i);
        rVar.mo12270a("message", this.f3097j);
        return rVar.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int w0 = C0823f.m403w0(parcel, 20293);
        int i2 = this.f3094g;
        C0823f.m333B0(parcel, 1, 4);
        parcel.writeInt(i2);
        int i3 = this.f3095h;
        C0823f.m333B0(parcel, 2, 4);
        parcel.writeInt(i3);
        C0823f.m393r0(parcel, 3, this.f3096i, i, false);
        C0823f.m395s0(parcel, 4, this.f3097j, false);
        C0823f.m331A0(parcel, w0);
    }

    public C1754b(int i, @Nullable PendingIntent pendingIntent) {
        this.f3094g = 1;
        this.f3095h = i;
        this.f3096i = pendingIntent;
        this.f3097j = null;
    }
}
