package com.google.api.client.googleapis.auth.oauth2;

import com.google.api.client.auth.oauth2.AuthorizationRequestUrl;
import java.util.Collection;
import p005b.p096l.p164b.p165a.p166a.p168b.C3658b;
import p005b.p096l.p164b.p165a.p169b.C3674c;
import p005b.p096l.p164b.p165a.p173d.C3730k;
import p005b.p096l.p164b.p165a.p173d.C3736n;

public class GoogleAuthorizationCodeRequestUrl extends C3658b {
    @C3736n("access_type")
    private String accessType;
    @C3736n("approval_prompt")
    private String approvalPrompt;

    /* renamed from: b */
    public AuthorizationRequestUrl mo14947b(String str, Object obj) {
        return (GoogleAuthorizationCodeRequestUrl) super.set(str, obj);
    }

    /* renamed from: c */
    public AuthorizationRequestUrl mo14948c(String str) {
        return (GoogleAuthorizationCodeRequestUrl) super.mo14948c(str);
    }

    /* renamed from: g */
    public AuthorizationRequestUrl mo14950g(Collection collection) {
        return (GoogleAuthorizationCodeRequestUrl) super.mo14950g(collection);
    }

    /* renamed from: j */
    public C3658b mo14952j(String str, Object obj) {
        return (GoogleAuthorizationCodeRequestUrl) super.set(str, obj);
    }

    /* renamed from: k */
    public C3658b mo14953k(String str) {
        return (GoogleAuthorizationCodeRequestUrl) super.mo14948c(str);
    }

    /* renamed from: l */
    public C3658b mo14954l(Collection collection) {
        return (GoogleAuthorizationCodeRequestUrl) super.mo14950g(collection);
    }

    /* renamed from: m */
    public GoogleAuthorizationCodeRequestUrl mo14951i() {
        return (GoogleAuthorizationCodeRequestUrl) super.clone();
    }

    public C3674c set(String str, Object obj) {
        return (GoogleAuthorizationCodeRequestUrl) super.set(str, obj);
    }

    /* renamed from: set  reason: collision with other method in class */
    public C3730k m14999set(String str, Object obj) {
        return (GoogleAuthorizationCodeRequestUrl) super.set(str, obj);
    }
}
