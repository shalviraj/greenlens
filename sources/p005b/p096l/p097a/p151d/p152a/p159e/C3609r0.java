package p005b.p096l.p097a.p151d.p152a.p159e;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import p005b.p096l.p097a.p151d.p152a.p154b.C3498h;
import p005b.p096l.p097a.p151d.p152a.p154b.C3518m;

/* renamed from: b.l.a.d.a.e.r0 */
public abstract class C3609r0 extends C3589h0 implements C3611s0 {
    public C3609r0() {
        super("com.google.android.play.core.assetpacks.protocol.IAssetModuleServiceCallback");
    }

    /* renamed from: g */
    public final boolean mo14882g(int i, Parcel parcel) {
        switch (i) {
            case 2:
                int readInt = parcel.readInt();
                Bundle bundle = (Bundle) C3591i0.m6813a(parcel, Bundle.CREATOR);
                ((C3498h) this).f6414b.f6471c.mo14905b();
                C3518m.f6467f.mo14884b(4, "onStartDownload(%d)", new Object[]{Integer.valueOf(readInt)});
                break;
            case 3:
                int readInt2 = parcel.readInt();
                Bundle bundle2 = (Bundle) C3591i0.m6813a(parcel, Bundle.CREATOR);
                ((C3498h) this).f6414b.f6471c.mo14905b();
                C3518m.f6467f.mo14884b(4, "onCancelDownload(%d)", new Object[]{Integer.valueOf(readInt2)});
                break;
            case 4:
                int readInt3 = parcel.readInt();
                Bundle bundle3 = (Bundle) C3591i0.m6813a(parcel, Bundle.CREATOR);
                ((C3498h) this).f6414b.f6471c.mo14905b();
                C3518m.f6467f.mo14884b(4, "onGetSession(%d)", new Object[]{Integer.valueOf(readInt3)});
                break;
            case 5:
                mo14779I0(parcel.createTypedArrayList(Bundle.CREATOR));
                break;
            case 6:
                Parcelable.Creator creator = Bundle.CREATOR;
                Bundle bundle4 = (Bundle) C3591i0.m6813a(parcel, creator);
                Bundle bundle5 = (Bundle) C3591i0.m6813a(parcel, creator);
                ((C3498h) this).f6414b.f6471c.mo14905b();
                C3518m.f6467f.mo14884b(4, "onNotifyChunkTransferred(%s, %s, %d, session=%d)", new Object[]{bundle4.getString("module_name"), bundle4.getString("slice_id"), Integer.valueOf(bundle4.getInt("chunk_number")), Integer.valueOf(bundle4.getInt("session_id"))});
                break;
            case 7:
                mo14781r0((Bundle) C3591i0.m6813a(parcel, Bundle.CREATOR));
                break;
            case 8:
                Parcelable.Creator creator2 = Bundle.CREATOR;
                Bundle bundle6 = (Bundle) C3591i0.m6813a(parcel, creator2);
                Bundle bundle7 = (Bundle) C3591i0.m6813a(parcel, creator2);
                ((C3498h) this).f6414b.f6471c.mo14905b();
                C3518m.f6467f.mo14884b(4, "onNotifyModuleCompleted(%s, sessionId=%d)", new Object[]{bundle6.getString("module_name"), Integer.valueOf(bundle6.getInt("session_id"))});
                break;
            case 10:
                Parcelable.Creator creator3 = Bundle.CREATOR;
                Bundle bundle8 = (Bundle) C3591i0.m6813a(parcel, creator3);
                ((C3498h) this).f6414b.f6471c.mo14905b();
                C3518m.f6467f.mo14884b(4, "onNotifySessionFailed(%d)", new Object[]{Integer.valueOf(((Bundle) C3591i0.m6813a(parcel, creator3)).getInt("session_id"))});
                break;
            case 11:
                Parcelable.Creator creator4 = Bundle.CREATOR;
                mo14780d0((Bundle) C3591i0.m6813a(parcel, creator4), (Bundle) C3591i0.m6813a(parcel, creator4));
                break;
            case 12:
                Parcelable.Creator creator5 = Bundle.CREATOR;
                mo14782t0((Bundle) C3591i0.m6813a(parcel, creator5), (Bundle) C3591i0.m6813a(parcel, creator5));
                break;
            case 13:
                Parcelable.Creator creator6 = Bundle.CREATOR;
                Bundle bundle9 = (Bundle) C3591i0.m6813a(parcel, creator6);
                Bundle bundle10 = (Bundle) C3591i0.m6813a(parcel, creator6);
                ((C3498h) this).f6414b.f6471c.mo14905b();
                C3518m.f6467f.mo14884b(4, "onRequestDownloadInfo()", new Object[0]);
                break;
            case 14:
                Parcelable.Creator creator7 = Bundle.CREATOR;
                Bundle bundle11 = (Bundle) C3591i0.m6813a(parcel, creator7);
                Bundle bundle12 = (Bundle) C3591i0.m6813a(parcel, creator7);
                ((C3498h) this).f6414b.f6471c.mo14905b();
                C3518m.f6467f.mo14884b(4, "onRemoveModule()", new Object[0]);
                break;
            case 15:
                Bundle bundle13 = (Bundle) C3591i0.m6813a(parcel, Bundle.CREATOR);
                ((C3498h) this).f6414b.f6471c.mo14905b();
                C3518m.f6467f.mo14884b(4, "onCancelDownloads()", new Object[0]);
                break;
            default:
                return false;
        }
        return true;
    }
}
