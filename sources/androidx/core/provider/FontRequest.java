package androidx.core.provider;

import android.util.Base64;
import androidx.annotation.ArrayRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.core.util.Preconditions;
import java.util.List;
import p005b.p035e.p036a.p037a.C0843a;

public final class FontRequest {
    private final List<List<byte[]>> mCertificates;
    private final int mCertificatesArray;
    private final String mIdentifier;
    private final String mProviderAuthority;
    private final String mProviderPackage;
    private final String mQuery;

    public FontRequest(@NonNull String str, @NonNull String str2, @NonNull String str3, @ArrayRes int i) {
        String str4 = (String) Preconditions.checkNotNull(str);
        this.mProviderAuthority = str4;
        String str5 = (String) Preconditions.checkNotNull(str2);
        this.mProviderPackage = str5;
        String str6 = (String) Preconditions.checkNotNull(str3);
        this.mQuery = str6;
        this.mCertificates = null;
        Preconditions.checkArgument(i != 0);
        this.mCertificatesArray = i;
        this.mIdentifier = str4 + "-" + str5 + "-" + str6;
    }

    public FontRequest(@NonNull String str, @NonNull String str2, @NonNull String str3, @NonNull List<List<byte[]>> list) {
        String str4 = (String) Preconditions.checkNotNull(str);
        this.mProviderAuthority = str4;
        String str5 = (String) Preconditions.checkNotNull(str2);
        this.mProviderPackage = str5;
        String str6 = (String) Preconditions.checkNotNull(str3);
        this.mQuery = str6;
        this.mCertificates = (List) Preconditions.checkNotNull(list);
        this.mCertificatesArray = 0;
        this.mIdentifier = str4 + "-" + str5 + "-" + str6;
    }

    @Nullable
    public List<List<byte[]>> getCertificates() {
        return this.mCertificates;
    }

    @ArrayRes
    public int getCertificatesArrayResId() {
        return this.mCertificatesArray;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public String getIdentifier() {
        return this.mIdentifier;
    }

    @NonNull
    public String getProviderAuthority() {
        return this.mProviderAuthority;
    }

    @NonNull
    public String getProviderPackage() {
        return this.mProviderPackage;
    }

    @NonNull
    public String getQuery() {
        return this.mQuery;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        StringBuilder u = C0843a.m460u("FontRequest {mProviderAuthority: ");
        u.append(this.mProviderAuthority);
        u.append(", mProviderPackage: ");
        u.append(this.mProviderPackage);
        u.append(", mQuery: ");
        u.append(this.mQuery);
        u.append(", mCertificates:");
        sb.append(u.toString());
        for (int i = 0; i < this.mCertificates.size(); i++) {
            sb.append(" [");
            List list = this.mCertificates.get(i);
            for (int i2 = 0; i2 < list.size(); i2++) {
                sb.append(" \"");
                sb.append(Base64.encodeToString((byte[]) list.get(i2), 0));
                sb.append("\"");
            }
            sb.append(" ]");
        }
        sb.append("}");
        sb.append("mCertificatesArray: " + this.mCertificatesArray);
        return sb.toString();
    }
}
