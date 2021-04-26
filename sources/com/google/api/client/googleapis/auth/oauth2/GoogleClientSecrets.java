package com.google.api.client.googleapis.auth.oauth2;

import java.util.List;
import p005b.p096l.p164b.p165a.p171c.C3699b;
import p005b.p096l.p164b.p165a.p173d.C3730k;
import p005b.p096l.p164b.p165a.p173d.C3736n;

public final class GoogleClientSecrets extends C3699b {
    @C3736n
    private Details installed;
    @C3736n
    private Details web;

    public static final class Details extends C3699b {
        @C3736n("auth_uri")
        private String authUri;
        @C3736n("client_id")
        private String clientId;
        @C3736n("client_secret")
        private String clientSecret;
        @C3736n("redirect_uris")
        private List<String> redirectUris;
        @C3736n("token_uri")
        private String tokenUri;

        /* renamed from: a */
        public Details clone() {
            return (Details) super.clone();
        }

        public C3699b set(String str, Object obj) {
            return (Details) super.set(str, obj);
        }

        /* renamed from: set  reason: collision with other method in class */
        public C3730k m15002set(String str, Object obj) {
            return (Details) super.set(str, obj);
        }
    }

    /* renamed from: a */
    public GoogleClientSecrets clone() {
        return (GoogleClientSecrets) super.clone();
    }

    public C3699b set(String str, Object obj) {
        return (GoogleClientSecrets) super.set(str, obj);
    }

    /* renamed from: set  reason: collision with other method in class */
    public C3730k m15001set(String str, Object obj) {
        return (GoogleClientSecrets) super.set(str, obj);
    }
}
