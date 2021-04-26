package com.wuman.android.auth.oauth2.store;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import java.util.Objects;
import p005b.p096l.p164b.p165a.p166a.p168b.C3663f;
import p005b.p096l.p164b.p165a.p166a.p168b.C3667h;
import p005b.p096l.p164b.p165a.p171c.C3698a;
import p005b.p096l.p164b.p165a.p171c.C3700c;

@TargetApi(9)
public class SharedPreferencesCredentialStore implements C3667h {
    public final C3700c jsonFactory;
    public final SharedPreferences prefs;

    public SharedPreferencesCredentialStore(Context context, String str, C3700c cVar) {
        Objects.requireNonNull(context);
        SharedPreferences sharedPreferences = context.getSharedPreferences(str, 0);
        Objects.requireNonNull(sharedPreferences);
        this.prefs = sharedPreferences;
        this.jsonFactory = cVar;
    }

    public void delete(String str, C3663f fVar) {
        Objects.requireNonNull(str);
        this.prefs.edit().remove(str).apply();
    }

    public boolean load(String str, C3663f fVar) {
        Objects.requireNonNull(str);
        String string = this.prefs.getString(str, (String) null);
        if (TextUtils.isEmpty(string)) {
            return false;
        }
        FilePersistedCredential filePersistedCredential = (FilePersistedCredential) this.jsonFactory.mo15027d(string).mo15032H(FilePersistedCredential.class, false, (C3698a) null);
        if (filePersistedCredential == null) {
            return false;
        }
        filePersistedCredential.load(fVar);
        return true;
    }

    public void store(String str, C3663f fVar) {
        Objects.requireNonNull(str);
        FilePersistedCredential filePersistedCredential = new FilePersistedCredential();
        filePersistedCredential.store(fVar);
        this.prefs.edit().putString(str, this.jsonFactory.mo15028e(filePersistedCredential, false)).apply();
    }
}
