package com.karumi.dexter.listener;

import androidx.annotation.NonNull;
import p005b.p035e.p036a.p037a.C0843a;

public final class PermissionRequest {
    private final String name;

    public PermissionRequest(@NonNull String str) {
        this.name = str;
    }

    public String getName() {
        return this.name;
    }

    public String toString() {
        StringBuilder u = C0843a.m460u("Permission name: ");
        u.append(this.name);
        return u.toString();
    }
}
