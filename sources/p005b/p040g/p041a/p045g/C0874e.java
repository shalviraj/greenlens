package p005b.p040g.p041a.p045g;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Type;
import java.util.Map;
import p005b.p096l.p224e.C4467l;

/* renamed from: b.g.a.g.e */
public class C0874e implements Parcelable {
    public static final Parcelable.Creator<C0874e> CREATOR = new C0875a();

    /* renamed from: g */
    public final String f739g;

    /* renamed from: h */
    public Map<String, String> f740h;

    /* renamed from: i */
    public C0878h f741i;

    /* renamed from: b.g.a.g.e$a */
    public static class C0875a implements Parcelable.Creator<C0874e> {
        public Object createFromParcel(Parcel parcel) {
            return new C0874e(parcel.readString());
        }

        public Object[] newArray(int i) {
            return new C0874e[i];
        }
    }

    static {
        Class<C0874e> cls = C0874e.class;
    }

    public C0874e(@NonNull String str) {
        String[] split = str.split("\\.");
        if (split.length == 2 && str.endsWith(".")) {
            split = new String[]{split[0], split[1], ""};
        }
        if (split.length == 3) {
            this.f740h = (Map) mo10718c(mo10716a(split[0]), new C0876f(this).f8250b);
            this.f741i = (C0878h) mo10718c(mo10716a(split[1]), C0878h.class);
            String str2 = split[2];
            this.f739g = str;
            return;
        }
        throw new C0873d(String.format("The token was expected to have 3 parts, but got %s.", new Object[]{Integer.valueOf(split.length)}));
    }

    @Nullable
    /* renamed from: a */
    public final String mo10716a(String str) {
        try {
            return new String(Base64.decode(str, 11), "UTF-8");
        } catch (IllegalArgumentException e) {
            throw new C0873d("Received bytes didn't correspond to a valid Base64 encoded string.", e);
        } catch (UnsupportedEncodingException e2) {
            throw new C0873d("Device doesn't support UTF-8 charset encoding.", e2);
        }
    }

    @NonNull
    /* renamed from: b */
    public C0871b mo10717b(@NonNull String str) {
        C0871b bVar = this.f741i.f747f.get(str);
        return bVar != null ? bVar : new C0870a();
    }

    /* renamed from: c */
    public final <T> T mo10718c(String str, Type type) {
        try {
            C4467l lVar = new C4467l();
            lVar.mo16128b(C0878h.class, new C0877g());
            return lVar.mo16127a().mo16118d(str, type);
        } catch (Exception e) {
            throw new C0873d("The token's payload had an invalid JSON format.", e);
        }
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        return this.f739g;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f739g);
    }
}
