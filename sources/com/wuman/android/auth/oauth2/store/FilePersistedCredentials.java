package com.wuman.android.auth.oauth2.store;

import java.util.HashMap;
import java.util.Map;
import p005b.p096l.p164b.p165a.p171c.C3699b;
import p005b.p096l.p164b.p165a.p173d.C3730k;
import p005b.p096l.p164b.p165a.p173d.C3736n;

public class FilePersistedCredentials extends C3699b {
    @C3736n
    private Map<String, FilePersistedCredential> credentials = new HashMap();

    public FilePersistedCredentials clone() {
        return (FilePersistedCredentials) super.clone();
    }

    public C3699b set(String str, Object obj) {
        return (FilePersistedCredentials) super.set(str, obj);
    }

    /* renamed from: set  reason: collision with other method in class */
    public C3730k m15014set(String str, Object obj) {
        return (FilePersistedCredentials) super.set(str, obj);
    }
}
