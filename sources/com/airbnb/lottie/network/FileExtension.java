package com.airbnb.lottie.network;

import com.airbnb.lottie.utils.Logger;
import p005b.p035e.p036a.p037a.C0843a;

public enum FileExtension {
    JSON(".json"),
    ZIP(".zip");
    
    public final String extension;

    private FileExtension(String str) {
        this.extension = str;
    }

    public static FileExtension forFile(String str) {
        FileExtension[] values = values();
        for (int i = 0; i < 2; i++) {
            FileExtension fileExtension = values[i];
            if (str.endsWith(fileExtension.extension)) {
                return fileExtension;
            }
        }
        Logger.warning("Unable to find correct extension for " + str);
        return JSON;
    }

    public String tempExtension() {
        StringBuilder u = C0843a.m460u(".temp");
        u.append(this.extension);
        return u.toString();
    }

    public String toString() {
        return this.extension;
    }
}
