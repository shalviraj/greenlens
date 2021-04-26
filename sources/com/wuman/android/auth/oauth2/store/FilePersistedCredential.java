package com.wuman.android.auth.oauth2.store;

import com.wuman.android.auth.oauth.OAuthHmacCredential;
import p005b.p096l.p164b.p165a.p166a.p168b.C3663f;
import p005b.p096l.p164b.p165a.p171c.C3699b;
import p005b.p096l.p164b.p165a.p173d.C3730k;
import p005b.p096l.p164b.p165a.p173d.C3736n;

public class FilePersistedCredential extends C3699b {
    @C3736n("access_token")
    private String accessToken;
    @C3736n("consumer_key")
    private String consumerKey;
    @C3736n("expiration_time_millis")
    private Long expirationTimeMillis;
    @C3736n("refresh_token")
    private String refreshToken;
    @C3736n("shared_secret")
    private String sharedSecret;
    @C3736n("token_shared_secret")
    private String tokenSharedSecret;

    public FilePersistedCredential clone() {
        return (FilePersistedCredential) super.clone();
    }

    public void load(C3663f fVar) {
        fVar.setAccessToken(this.accessToken);
        fVar.setRefreshToken(this.refreshToken);
        fVar.setExpirationTimeMilliseconds(this.expirationTimeMillis);
        if (fVar instanceof OAuthHmacCredential) {
            OAuthHmacCredential oAuthHmacCredential = (OAuthHmacCredential) fVar;
            oAuthHmacCredential.tokenSharedSecret = this.tokenSharedSecret;
            oAuthHmacCredential.postConstruct();
            oAuthHmacCredential.consumerKey = this.consumerKey;
            oAuthHmacCredential.postConstruct();
            oAuthHmacCredential.sharedSecret = this.sharedSecret;
            oAuthHmacCredential.postConstruct();
        }
    }

    public C3699b set(String str, Object obj) {
        return (FilePersistedCredential) super.set(str, obj);
    }

    public void store(C3663f fVar) {
        this.accessToken = fVar.getAccessToken();
        this.refreshToken = fVar.getRefreshToken();
        this.expirationTimeMillis = fVar.getExpirationTimeMilliseconds();
        if (fVar instanceof OAuthHmacCredential) {
            OAuthHmacCredential oAuthHmacCredential = (OAuthHmacCredential) fVar;
            this.tokenSharedSecret = oAuthHmacCredential.tokenSharedSecret;
            this.consumerKey = oAuthHmacCredential.consumerKey;
            this.sharedSecret = oAuthHmacCredential.sharedSecret;
        }
    }

    /* renamed from: set  reason: collision with other method in class */
    public C3730k m15013set(String str, Object obj) {
        return (FilePersistedCredential) super.set(str, obj);
    }
}
