package com.google.api.client.googleapis.json;

import java.util.List;
import p005b.p096l.p164b.p165a.p171c.C3699b;
import p005b.p096l.p164b.p165a.p173d.C3723g;
import p005b.p096l.p164b.p165a.p173d.C3730k;
import p005b.p096l.p164b.p165a.p173d.C3736n;

public class GoogleJsonError extends C3699b {
    @C3736n
    private int code;
    @C3736n
    private List<ErrorInfo> errors;
    @C3736n
    private String message;

    public static class ErrorInfo extends C3699b {
        @C3736n
        private String domain;
        @C3736n
        private String location;
        @C3736n
        private String locationType;
        @C3736n
        private String message;
        @C3736n
        private String reason;

        /* renamed from: a */
        public ErrorInfo clone() {
            return (ErrorInfo) super.clone();
        }

        public C3699b set(String str, Object obj) {
            return (ErrorInfo) super.set(str, obj);
        }

        /* renamed from: set  reason: collision with other method in class */
        public C3730k m15006set(String str, Object obj) {
            return (ErrorInfo) super.set(str, obj);
        }
    }

    static {
        C3723g.m7025h(ErrorInfo.class);
    }

    /* renamed from: a */
    public GoogleJsonError clone() {
        return (GoogleJsonError) super.clone();
    }

    public C3699b set(String str, Object obj) {
        return (GoogleJsonError) super.set(str, obj);
    }

    /* renamed from: set  reason: collision with other method in class */
    public C3730k m15005set(String str, Object obj) {
        return (GoogleJsonError) super.set(str, obj);
    }
}
