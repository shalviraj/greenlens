package android.support.p001v4.media.session;

import android.media.session.MediaSession;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import android.support.p001v4.media.MediaDescriptionCompat;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import p005b.p035e.p036a.p037a.C0843a;
import p352f.p353a.p355b.p357b.p358g.C6946b;

/* renamed from: android.support.v4.media.session.MediaSessionCompat */
public class MediaSessionCompat {

    /* renamed from: android.support.v4.media.session.MediaSessionCompat$QueueItem */
    public static final class QueueItem implements Parcelable {
        public static final Parcelable.Creator<QueueItem> CREATOR = new C0020a();

        /* renamed from: g */
        public final MediaDescriptionCompat f41g;

        /* renamed from: h */
        public final long f42h;

        /* renamed from: i */
        public Object f43i;

        /* renamed from: android.support.v4.media.session.MediaSessionCompat$QueueItem$a */
        public static class C0020a implements Parcelable.Creator<QueueItem> {
            public Object createFromParcel(Parcel parcel) {
                return new QueueItem(parcel);
            }

            public Object[] newArray(int i) {
                return new QueueItem[i];
            }
        }

        public QueueItem(Parcel parcel) {
            this.f41g = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
            this.f42h = parcel.readLong();
        }

        public QueueItem(Object obj, MediaDescriptionCompat mediaDescriptionCompat, long j) {
            if (mediaDescriptionCompat == null) {
                throw new IllegalArgumentException("Description cannot be null.");
            } else if (j != -1) {
                this.f41g = mediaDescriptionCompat;
                this.f42h = j;
                this.f43i = obj;
            } else {
                throw new IllegalArgumentException("Id cannot be QueueItem.UNKNOWN_ID");
            }
        }

        public int describeContents() {
            return 0;
        }

        public String toString() {
            StringBuilder u = C0843a.m460u("MediaSession.QueueItem {Description=");
            u.append(this.f41g);
            u.append(", Id=");
            u.append(this.f42h);
            u.append(" }");
            return u.toString();
        }

        public void writeToParcel(Parcel parcel, int i) {
            this.f41g.writeToParcel(parcel, i);
            parcel.writeLong(this.f42h);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    /* renamed from: android.support.v4.media.session.MediaSessionCompat$ResultReceiverWrapper */
    public static final class ResultReceiverWrapper implements Parcelable {
        public static final Parcelable.Creator<ResultReceiverWrapper> CREATOR = new C0021a();

        /* renamed from: g */
        public ResultReceiver f44g;

        /* renamed from: android.support.v4.media.session.MediaSessionCompat$ResultReceiverWrapper$a */
        public static class C0021a implements Parcelable.Creator<ResultReceiverWrapper> {
            public Object createFromParcel(Parcel parcel) {
                return new ResultReceiverWrapper(parcel);
            }

            public Object[] newArray(int i) {
                return new ResultReceiverWrapper[i];
            }
        }

        public ResultReceiverWrapper(Parcel parcel) {
            this.f44g = (ResultReceiver) ResultReceiver.CREATOR.createFromParcel(parcel);
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            this.f44g.writeToParcel(parcel, i);
        }
    }

    /* renamed from: android.support.v4.media.session.MediaSessionCompat$Token */
    public static final class Token implements Parcelable {
        public static final Parcelable.Creator<Token> CREATOR = new C0022a();

        /* renamed from: g */
        public final Object f45g;

        /* renamed from: h */
        public C6946b f46h;

        /* renamed from: android.support.v4.media.session.MediaSessionCompat$Token$a */
        public static class C0022a implements Parcelable.Creator<Token> {
            public Object createFromParcel(Parcel parcel) {
                return new Token(parcel.readParcelable((ClassLoader) null));
            }

            public Object[] newArray(int i) {
                return new Token[i];
            }
        }

        public Token(Object obj) {
            this.f45g = obj;
            this.f46h = null;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        /* renamed from: a */
        public static Token m28a(Object obj, C6946b bVar) {
            if (obj == null) {
                return null;
            }
            if (obj instanceof MediaSession.Token) {
                return new Token(obj, bVar);
            }
            throw new IllegalArgumentException("token is not a valid MediaSession.Token object");
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Token)) {
                return false;
            }
            Object obj2 = this.f45g;
            Object obj3 = ((Token) obj).f45g;
            if (obj2 == null) {
                return obj3 == null;
            }
            if (obj3 == null) {
                return false;
            }
            return obj2.equals(obj3);
        }

        public int hashCode() {
            Object obj = this.f45g;
            if (obj == null) {
                return 0;
            }
            return obj.hashCode();
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable((Parcelable) this.f45g, i);
        }

        public Token(Object obj, C6946b bVar) {
            this.f45g = obj;
            this.f46h = bVar;
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: a */
    public static void m27a(@Nullable Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader(MediaSessionCompat.class.getClassLoader());
        }
    }
}
