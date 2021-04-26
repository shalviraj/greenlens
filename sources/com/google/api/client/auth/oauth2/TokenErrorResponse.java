package com.google.api.client.auth.oauth2;

import p005b.p096l.p164b.p165a.p171c.C3699b;
import p005b.p096l.p164b.p165a.p173d.C3730k;
import p005b.p096l.p164b.p165a.p173d.C3736n;

public class TokenErrorResponse extends C3699b {
    @C3736n
    private String error;
    @C3736n("error_description")
    private String errorDescription;
    @C3736n("error_uri")
    private String errorUri;

    /* renamed from: a */
    public TokenErrorResponse clone() {
        return (TokenErrorResponse) super.clone();
    }

    public final String getError() {
        return this.error;
    }

    public final String getErrorDescription() {
        return this.errorDescription;
    }

    public C3699b set(String str, Object obj) {
        return (TokenErrorResponse) super.set(str, obj);
    }

    /* renamed from: set  reason: collision with other method in class */
    public C3730k m14997set(String str, Object obj) {
        return (TokenErrorResponse) super.set(str, obj);
    }
}
