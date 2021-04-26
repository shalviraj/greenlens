package p005b.p040g.p041a.p042e.p043f;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* renamed from: b.g.a.e.f.i */
public class C0867i implements C0868j {

    /* renamed from: a */
    public final SharedPreferences f737a;

    public C0867i(@NonNull Context context) {
        if (!TextUtils.isEmpty("com.auth0.authentication.storage")) {
            this.f737a = context.getSharedPreferences("com.auth0.authentication.storage", 0);
            return;
        }
        throw new IllegalArgumentException("The SharedPreferences name is invalid.");
    }

    @Nullable
    /* renamed from: a */
    public Long mo10705a(@NonNull String str) {
        if (!this.f737a.contains(str)) {
            return null;
        }
        return Long.valueOf(this.f737a.getLong(str, 0));
    }

    /* renamed from: b */
    public void mo10706b(@NonNull String str, @Nullable String str2) {
        (str2 == null ? this.f737a.edit().remove(str) : this.f737a.edit().putString(str, str2)).apply();
    }

    @Nullable
    /* renamed from: c */
    public Boolean mo10707c(@NonNull String str) {
        if (!this.f737a.contains(str)) {
            return null;
        }
        return Boolean.valueOf(this.f737a.getBoolean(str, false));
    }

    /* renamed from: d */
    public void mo10708d(@NonNull String str, @Nullable Boolean bool) {
        (bool == null ? this.f737a.edit().remove(str) : this.f737a.edit().putBoolean(str, bool.booleanValue())).apply();
    }

    /* renamed from: e */
    public void mo10709e(@NonNull String str) {
        this.f737a.edit().remove(str).apply();
    }

    /* renamed from: f */
    public void mo10710f(@NonNull String str, @Nullable Long l) {
        (l == null ? this.f737a.edit().remove(str) : this.f737a.edit().putLong(str, l.longValue())).apply();
    }

    @Nullable
    /* renamed from: g */
    public String mo10711g(@NonNull String str) {
        if (!this.f737a.contains(str)) {
            return null;
        }
        return this.f737a.getString(str, (String) null);
    }
}
