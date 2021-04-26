package com.wuman.android.auth;

import com.wuman.android.auth.oauth2.implicit.ImplicitResponseUrl;
import p005b.p096l.p164b.p165a.p166a.p168b.C3658b;
import p005b.p096l.p164b.p165a.p166a.p168b.C3661d;

public interface AuthorizationUIController {
    String getRedirectUri();

    void requestAuthorization(C3658b bVar);

    void requestAuthorization(C3661d dVar);

    void stop();

    String waitForExplicitCode();

    ImplicitResponseUrl waitForImplicitResponseUrl();
}
