package com.wuman.android.auth.oauth2.implicit;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.Objects;
import p005b.p096l.p097a.p113c.p119b.p126p.C1960d;
import p005b.p096l.p164b.p165a.p169b.C3674c;
import p005b.p096l.p164b.p165a.p169b.C3688o;
import p005b.p096l.p164b.p165a.p173d.C3730k;
import p005b.p096l.p164b.p165a.p173d.C3736n;
import p005b.p096l.p164b.p165a.p173d.p174z.C3750a;

public class ImplicitResponseUrl extends C3674c {
    @C3736n("access_token")
    private String accessToken;
    @C3736n
    private String error;
    @C3736n("error_description")
    private String errorDescription;
    @C3736n("error_uri")
    private String errorUri;
    @C3736n("expires_in")
    private Long expiresInSeconds;
    @C3736n
    private String scope;
    @C3736n
    private String state;
    @C3736n("token_type")
    private String tokenType;

    public ImplicitResponseUrl() {
    }

    public ImplicitResponseUrl(String str) {
        try {
            URI uri = new URI(str);
            String scheme = uri.getScheme();
            String host = uri.getHost();
            int port = uri.getPort();
            String rawPath = uri.getRawPath();
            String rawFragment = uri.getRawFragment();
            uri.getRawQuery();
            String rawUserInfo = uri.getRawUserInfo();
            Objects.requireNonNull(scheme);
            this.scheme = scheme;
            Objects.requireNonNull(host);
            this.host = host;
            C1960d.m2833p(port >= -1, "expected port >= -1");
            this.port = port;
            this.pathParts = C3674c.toPathParts(rawPath, false);
            String str2 = null;
            this.fragment = rawFragment != null ? C3750a.m7057a(rawFragment) : null;
            if (rawFragment != null) {
                C3688o.m6957b(rawFragment, this);
            }
            this.userInfo = rawUserInfo != null ? C3750a.m7057a(rawUserInfo) : str2;
        } catch (URISyntaxException e) {
            throw new IllegalArgumentException(e);
        }
    }

    public ImplicitResponseUrl clone() {
        return (ImplicitResponseUrl) super.clone();
    }

    public final String getAccessToken() {
        return this.accessToken;
    }

    public final String getError() {
        return this.error;
    }

    public final String getErrorDescription() {
        return this.errorDescription;
    }

    public final Long getExpiresInSeconds() {
        return this.expiresInSeconds;
    }

    public C3674c set(String str, Object obj) {
        return (ImplicitResponseUrl) super.set(str, obj);
    }

    /* renamed from: set  reason: collision with other method in class */
    public C3730k m15012set(String str, Object obj) {
        return (ImplicitResponseUrl) super.set(str, obj);
    }
}
