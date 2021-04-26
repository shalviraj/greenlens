package com.segment.analytics.integrations;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.segment.analytics.Traits;
import com.segment.analytics.integrations.BasePayload;
import com.segment.analytics.internal.Utils;
import java.util.Collections;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Map;
import p005b.p035e.p036a.p037a.C0843a;

public class IdentifyPayload extends BasePayload {
    public static final String TRAITS_KEY = "traits";

    public static class Builder extends BasePayload.Builder<IdentifyPayload, Builder> {
        private Map<String, Object> traits;

        public Builder() {
        }

        public Builder(IdentifyPayload identifyPayload) {
            super(identifyPayload);
            this.traits = identifyPayload.traits();
        }

        public IdentifyPayload realBuild(@NonNull String str, @NonNull Date date, @NonNull Map<String, Object> map, @NonNull Map<String, Object> map2, String str2, @NonNull String str3, boolean z) {
            if (!Utils.isNullOrEmpty((CharSequence) str2) || !Utils.isNullOrEmpty((Map) this.traits)) {
                return new IdentifyPayload(str, date, map, map2, str2, str3, this.traits, z);
            }
            throw new NullPointerException("either userId or traits are required");
        }

        public Builder self() {
            return this;
        }

        @NonNull
        public Builder traits(@NonNull Map<String, ?> map) {
            Utils.assertNotNull(map, "traits");
            this.traits = Collections.unmodifiableMap(new LinkedHashMap(map));
            return this;
        }
    }

    public IdentifyPayload(@NonNull String str, @NonNull Date date, @NonNull Map<String, Object> map, @NonNull Map<String, Object> map2, @Nullable String str2, @NonNull String str3, @NonNull Map<String, Object> map3, boolean z) {
        super(BasePayload.Type.identify, str, date, map, map2, str2, str3, z);
        put("traits", (Object) map3);
    }

    @NonNull
    public Builder toBuilder() {
        return new Builder(this);
    }

    public String toString() {
        StringBuilder u = C0843a.m460u("IdentifyPayload{\"userId=\"");
        u.append(userId());
        u.append("\"}");
        return u.toString();
    }

    @NonNull
    public Traits traits() {
        return (Traits) getValueMap("traits", Traits.class);
    }
}
