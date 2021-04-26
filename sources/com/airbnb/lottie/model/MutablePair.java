package com.airbnb.lottie.model;

import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.core.util.Pair;
import p005b.p035e.p036a.p037a.C0843a;

@RestrictTo({RestrictTo.Scope.LIBRARY})
public class MutablePair<T> {
    @Nullable
    public T first;
    @Nullable
    public T second;

    private static boolean objectsEqual(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Pair)) {
            return false;
        }
        Pair pair = (Pair) obj;
        return objectsEqual(pair.first, this.first) && objectsEqual(pair.second, this.second);
    }

    public int hashCode() {
        T t = this.first;
        int i = 0;
        int hashCode = t == null ? 0 : t.hashCode();
        T t2 = this.second;
        if (t2 != null) {
            i = t2.hashCode();
        }
        return hashCode ^ i;
    }

    public void set(T t, T t2) {
        this.first = t;
        this.second = t2;
    }

    public String toString() {
        StringBuilder u = C0843a.m460u("Pair{");
        u.append(String.valueOf(this.first));
        u.append(" ");
        u.append(String.valueOf(this.second));
        u.append("}");
        return u.toString();
    }
}
