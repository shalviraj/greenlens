package androidx.core.net;

import android.net.Uri;
import androidx.annotation.NonNull;
import p005b.p035e.p036a.p037a.C0843a;

public final class UriCompat {
    private UriCompat() {
    }

    @NonNull
    public static String toSafeString(@NonNull Uri uri) {
        String scheme = uri.getScheme();
        String schemeSpecificPart = uri.getSchemeSpecificPart();
        if (scheme != null) {
            if (scheme.equalsIgnoreCase("tel") || scheme.equalsIgnoreCase("sip") || scheme.equalsIgnoreCase("sms") || scheme.equalsIgnoreCase("smsto") || scheme.equalsIgnoreCase("mailto") || scheme.equalsIgnoreCase("nfc")) {
                StringBuilder sb = new StringBuilder(64);
                sb.append(scheme);
                sb.append(':');
                if (schemeSpecificPart != null) {
                    for (int i = 0; i < schemeSpecificPart.length(); i++) {
                        char charAt = schemeSpecificPart.charAt(i);
                        if (!(charAt == '-' || charAt == '@' || charAt == '.')) {
                            charAt = 'x';
                        }
                        sb.append(charAt);
                    }
                }
                return sb.toString();
            } else if (scheme.equalsIgnoreCase("http") || scheme.equalsIgnoreCase("https") || scheme.equalsIgnoreCase("ftp") || scheme.equalsIgnoreCase("rtsp")) {
                StringBuilder u = C0843a.m460u("//");
                String str = "";
                u.append(uri.getHost() != null ? uri.getHost() : str);
                if (uri.getPort() != -1) {
                    StringBuilder u2 = C0843a.m460u(":");
                    u2.append(uri.getPort());
                    str = u2.toString();
                }
                schemeSpecificPart = C0843a.m455p(u, str, "/...");
            }
        }
        StringBuilder sb2 = new StringBuilder(64);
        if (scheme != null) {
            sb2.append(scheme);
            sb2.append(':');
        }
        if (schemeSpecificPart != null) {
            sb2.append(schemeSpecificPart);
        }
        return sb2.toString();
    }
}
