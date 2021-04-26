package androidx.core.p003os;

import android.content.res.Configuration;
import androidx.annotation.NonNull;

/* renamed from: androidx.core.os.ConfigurationCompat */
public final class ConfigurationCompat {
    private ConfigurationCompat() {
    }

    @NonNull
    public static LocaleListCompat getLocales(@NonNull Configuration configuration) {
        return LocaleListCompat.wrap(configuration.getLocales());
    }
}
