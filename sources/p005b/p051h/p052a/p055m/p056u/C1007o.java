package p005b.p051h.p052a.p055m.p056u;

import android.content.ContentResolver;
import android.content.UriMatcher;
import android.net.Uri;
import androidx.annotation.NonNull;
import java.io.InputStream;

/* renamed from: b.h.a.m.u.o */
public class C1007o extends C1002l<InputStream> {

    /* renamed from: j */
    public static final UriMatcher f1057j;

    static {
        UriMatcher uriMatcher = new UriMatcher(-1);
        f1057j = uriMatcher;
        uriMatcher.addURI("com.android.contacts", "contacts/lookup/*/#", 1);
        uriMatcher.addURI("com.android.contacts", "contacts/lookup/*", 1);
        uriMatcher.addURI("com.android.contacts", "contacts/#/photo", 2);
        uriMatcher.addURI("com.android.contacts", "contacts/#", 3);
        uriMatcher.addURI("com.android.contacts", "contacts/#/display_photo", 4);
        uriMatcher.addURI("com.android.contacts", "phone_lookup/*", 5);
    }

    public C1007o(ContentResolver contentResolver, Uri uri) {
        super(contentResolver, uri);
    }

    @NonNull
    /* renamed from: a */
    public Class<InputStream> mo10839a() {
        return InputStream.class;
    }

    /* renamed from: c */
    public void mo10840c(Object obj) {
        ((InputStream) obj).close();
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0025 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0026  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object mo10841d(android.net.Uri r4, android.content.ContentResolver r5) {
        /*
            r3 = this;
            android.content.UriMatcher r0 = f1057j
            int r0 = r0.match(r4)
            r1 = 1
            if (r0 == r1) goto L_0x0019
            r2 = 3
            if (r0 == r2) goto L_0x0014
            r2 = 5
            if (r0 == r2) goto L_0x0019
            java.io.InputStream r5 = r5.openInputStream(r4)
            goto L_0x0023
        L_0x0014:
            java.io.InputStream r5 = android.provider.ContactsContract.Contacts.openContactPhotoInputStream(r5, r4, r1)
            goto L_0x0023
        L_0x0019:
            android.net.Uri r0 = android.provider.ContactsContract.Contacts.lookupContact(r5, r4)
            if (r0 == 0) goto L_0x0032
            java.io.InputStream r5 = android.provider.ContactsContract.Contacts.openContactPhotoInputStream(r5, r0, r1)
        L_0x0023:
            if (r5 == 0) goto L_0x0026
            return r5
        L_0x0026:
            java.io.FileNotFoundException r5 = new java.io.FileNotFoundException
            java.lang.String r0 = "InputStream is null for "
            java.lang.String r4 = p005b.p035e.p036a.p037a.C0843a.m449j(r0, r4)
            r5.<init>(r4)
            throw r5
        L_0x0032:
            java.io.FileNotFoundException r4 = new java.io.FileNotFoundException
            java.lang.String r5 = "Contact cannot be found"
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p051h.p052a.p055m.p056u.C1007o.mo10841d(android.net.Uri, android.content.ContentResolver):java.lang.Object");
    }
}
