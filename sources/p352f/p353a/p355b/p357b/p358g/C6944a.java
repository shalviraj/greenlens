package p352f.p353a.p355b.p357b.p358g;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.support.p001v4.media.MediaMetadataCompat;
import android.support.p001v4.media.session.MediaSessionCompat;
import android.support.p001v4.media.session.ParcelableVolumeInfo;
import java.util.List;

/* renamed from: f.a.b.b.g.a */
public interface C6944a extends IInterface {

    /* renamed from: f.a.b.b.g.a$a */
    public static abstract class C6945a extends Binder implements C6944a {
        public C6945a() {
            attachInterface(this, "android.support.v4.media.session.IMediaControllerCallback");
        }

        public IBinder asBinder() {
            return this;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: android.support.v4.media.MediaMetadataCompat} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v8, resolved type: android.os.Bundle} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v11, resolved type: android.support.v4.media.session.ParcelableVolumeInfo} */
        /* JADX WARNING: type inference failed for: r0v1 */
        /* JADX WARNING: type inference failed for: r0v5, types: [java.lang.CharSequence] */
        /* JADX WARNING: type inference failed for: r0v14 */
        /* JADX WARNING: type inference failed for: r0v15 */
        /* JADX WARNING: type inference failed for: r0v16 */
        /* JADX WARNING: type inference failed for: r0v17 */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean onTransact(int r4, android.os.Parcel r5, android.os.Parcel r6, int r7) {
            /*
                r3 = this;
                r0 = 1598968902(0x5f4e5446, float:1.4867585E19)
                r1 = 1
                java.lang.String r2 = "android.support.v4.media.session.IMediaControllerCallback"
                if (r4 == r0) goto L_0x0108
                r0 = 0
                switch(r4) {
                    case 1: goto L_0x00e8;
                    case 2: goto L_0x00e1;
                    case 3: goto L_0x00c4;
                    case 4: goto L_0x00ae;
                    case 5: goto L_0x00a1;
                    case 6: goto L_0x008b;
                    case 7: goto L_0x0075;
                    case 8: goto L_0x005f;
                    case 9: goto L_0x004d;
                    case 10: goto L_0x0045;
                    case 11: goto L_0x0032;
                    case 12: goto L_0x0020;
                    case 13: goto L_0x0011;
                    default: goto L_0x000c;
                }
            L_0x000c:
                boolean r4 = super.onTransact(r4, r5, r6, r7)
                return r4
            L_0x0011:
                r5.enforceInterface(r2)
                r4 = r3
                f.a.b.b.g.c$b r4 = (p352f.p353a.p355b.p357b.p358g.C6949c.C6951b) r4
                java.lang.ref.WeakReference<f.a.b.b.g.c> r4 = r4.f13954a
                java.lang.Object r4 = r4.get()
                f.a.b.b.g.c r4 = (p352f.p353a.p355b.p357b.p358g.C6949c) r4
                return r1
            L_0x0020:
                r5.enforceInterface(r2)
                r5.readInt()
                r4 = r3
                f.a.b.b.g.c$b r4 = (p352f.p353a.p355b.p357b.p358g.C6949c.C6951b) r4
                java.lang.ref.WeakReference<f.a.b.b.g.c> r4 = r4.f13954a
                java.lang.Object r4 = r4.get()
                f.a.b.b.g.c r4 = (p352f.p353a.p355b.p357b.p358g.C6949c) r4
                return r1
            L_0x0032:
                r5.enforceInterface(r2)
                int r4 = r5.readInt()
                r4 = r3
                f.a.b.b.g.c$b r4 = (p352f.p353a.p355b.p357b.p358g.C6949c.C6951b) r4
                java.lang.ref.WeakReference<f.a.b.b.g.c> r4 = r4.f13954a
                java.lang.Object r4 = r4.get()
                f.a.b.b.g.c r4 = (p352f.p353a.p355b.p357b.p358g.C6949c) r4
                return r1
            L_0x0045:
                r5.enforceInterface(r2)
                int r4 = r5.readInt()
                return r1
            L_0x004d:
                r5.enforceInterface(r2)
                r5.readInt()
                r4 = r3
                f.a.b.b.g.c$b r4 = (p352f.p353a.p355b.p357b.p358g.C6949c.C6951b) r4
                java.lang.ref.WeakReference<f.a.b.b.g.c> r4 = r4.f13954a
                java.lang.Object r4 = r4.get()
                f.a.b.b.g.c r4 = (p352f.p353a.p355b.p357b.p358g.C6949c) r4
                return r1
            L_0x005f:
                r5.enforceInterface(r2)
                int r4 = r5.readInt()
                if (r4 == 0) goto L_0x0071
                android.os.Parcelable$Creator<android.support.v4.media.session.ParcelableVolumeInfo> r4 = android.support.p001v4.media.session.ParcelableVolumeInfo.CREATOR
                java.lang.Object r4 = r4.createFromParcel(r5)
                r0 = r4
                android.support.v4.media.session.ParcelableVolumeInfo r0 = (android.support.p001v4.media.session.ParcelableVolumeInfo) r0
            L_0x0071:
                r3.mo41m1(r0)
                return r1
            L_0x0075:
                r5.enforceInterface(r2)
                int r4 = r5.readInt()
                if (r4 == 0) goto L_0x0087
                android.os.Parcelable$Creator r4 = android.os.Bundle.CREATOR
                java.lang.Object r4 = r4.createFromParcel(r5)
                r0 = r4
                android.os.Bundle r0 = (android.os.Bundle) r0
            L_0x0087:
                r3.mo40i0(r0)
                return r1
            L_0x008b:
                r5.enforceInterface(r2)
                int r4 = r5.readInt()
                if (r4 == 0) goto L_0x009d
                android.os.Parcelable$Creator r4 = android.text.TextUtils.CHAR_SEQUENCE_CREATOR
                java.lang.Object r4 = r4.createFromParcel(r5)
                r0 = r4
                java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            L_0x009d:
                r3.mo43s(r0)
                return r1
            L_0x00a1:
                r5.enforceInterface(r2)
                android.os.Parcelable$Creator<android.support.v4.media.session.MediaSessionCompat$QueueItem> r4 = android.support.p001v4.media.session.MediaSessionCompat.QueueItem.CREATOR
                java.util.ArrayList r4 = r5.createTypedArrayList(r4)
                r3.mo42o0(r4)
                return r1
            L_0x00ae:
                r5.enforceInterface(r2)
                int r4 = r5.readInt()
                if (r4 == 0) goto L_0x00c0
                android.os.Parcelable$Creator<android.support.v4.media.MediaMetadataCompat> r4 = android.support.p001v4.media.MediaMetadataCompat.CREATOR
                java.lang.Object r4 = r4.createFromParcel(r5)
                r0 = r4
                android.support.v4.media.MediaMetadataCompat r0 = (android.support.p001v4.media.MediaMetadataCompat) r0
            L_0x00c0:
                r3.mo39B(r0)
                return r1
            L_0x00c4:
                r5.enforceInterface(r2)
                int r4 = r5.readInt()
                if (r4 == 0) goto L_0x00d5
                android.os.Parcelable$Creator<android.support.v4.media.session.PlaybackStateCompat> r4 = android.support.p001v4.media.session.PlaybackStateCompat.CREATOR
                java.lang.Object r4 = r4.createFromParcel(r5)
                android.support.v4.media.session.PlaybackStateCompat r4 = (android.support.p001v4.media.session.PlaybackStateCompat) r4
            L_0x00d5:
                r4 = r3
                f.a.b.b.g.c$b r4 = (p352f.p353a.p355b.p357b.p358g.C6949c.C6951b) r4
                java.lang.ref.WeakReference<f.a.b.b.g.c> r4 = r4.f13954a
                java.lang.Object r4 = r4.get()
                f.a.b.b.g.c r4 = (p352f.p353a.p355b.p357b.p358g.C6949c) r4
                return r1
            L_0x00e1:
                r5.enforceInterface(r2)
                r3.mo38A()
                return r1
            L_0x00e8:
                r5.enforceInterface(r2)
                r5.readString()
                int r4 = r5.readInt()
                if (r4 == 0) goto L_0x00fc
                android.os.Parcelable$Creator r4 = android.os.Bundle.CREATOR
                java.lang.Object r4 = r4.createFromParcel(r5)
                android.os.Bundle r4 = (android.os.Bundle) r4
            L_0x00fc:
                r4 = r3
                f.a.b.b.g.c$b r4 = (p352f.p353a.p355b.p357b.p358g.C6949c.C6951b) r4
                java.lang.ref.WeakReference<f.a.b.b.g.c> r4 = r4.f13954a
                java.lang.Object r4 = r4.get()
                f.a.b.b.g.c r4 = (p352f.p353a.p355b.p357b.p358g.C6949c) r4
                return r1
            L_0x0108:
                r6.writeString(r2)
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: p352f.p353a.p355b.p357b.p358g.C6944a.C6945a.onTransact(int, android.os.Parcel, android.os.Parcel, int):boolean");
        }
    }

    /* renamed from: A */
    void mo38A();

    /* renamed from: B */
    void mo39B(MediaMetadataCompat mediaMetadataCompat);

    /* renamed from: i0 */
    void mo40i0(Bundle bundle);

    /* renamed from: m1 */
    void mo41m1(ParcelableVolumeInfo parcelableVolumeInfo);

    /* renamed from: o0 */
    void mo42o0(List<MediaSessionCompat.QueueItem> list);

    /* renamed from: s */
    void mo43s(CharSequence charSequence);
}
