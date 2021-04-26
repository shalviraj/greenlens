package com.airbnb.lottie.parser.moshi;

import java.io.Closeable;
import java.io.IOException;
import java.util.Arrays;
import p005b.p035e.p036a.p037a.C0843a;
import p435n.C8040e;
import p435n.C8042f;
import p435n.C8043g;
import p435n.C8044h;
import p435n.C8054q;

public abstract class JsonReader implements Closeable {
    private static final String[] REPLACEMENT_CHARS = new String[128];
    public boolean failOnUnknown;
    public boolean lenient;
    public int[] pathIndices = new int[32];
    public String[] pathNames = new String[32];
    public int[] scopes = new int[32];
    public int stackSize;

    public static final class Options {
        public final C8054q doubleQuoteSuffix;
        public final String[] strings;

        private Options(String[] strArr, C8054q qVar) {
            this.strings = strArr;
            this.doubleQuoteSuffix = qVar;
        }

        /* renamed from: of */
        public static Options m10110of(String... strArr) {
            try {
                C8044h[] hVarArr = new C8044h[strArr.length];
                C8040e eVar = new C8040e();
                for (int i = 0; i < strArr.length; i++) {
                    JsonReader.string(eVar, strArr[i]);
                    eVar.readByte();
                    hVarArr[i] = eVar.mo25907f0();
                }
                return new Options((String[]) strArr.clone(), C8054q.f16165i.mo25981c(hVarArr));
            } catch (IOException e) {
                throw new AssertionError(e);
            }
        }
    }

    public enum Token {
        BEGIN_ARRAY,
        END_ARRAY,
        BEGIN_OBJECT,
        END_OBJECT,
        NAME,
        STRING,
        NUMBER,
        BOOLEAN,
        NULL,
        END_DOCUMENT
    }

    static {
        for (int i = 0; i <= 31; i++) {
            REPLACEMENT_CHARS[i] = String.format("\\u%04x", new Object[]{Integer.valueOf(i)});
        }
        String[] strArr = REPLACEMENT_CHARS;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
    }

    /* renamed from: of */
    public static JsonReader m10109of(C8043g gVar) {
        return new JsonUtf8Reader(gVar);
    }

    /* access modifiers changed from: private */
    public static void string(C8042f fVar, String str) {
        String str2;
        String[] strArr = REPLACEMENT_CHARS;
        fVar.mo25887E(34);
        int length = str.length();
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            char charAt = str.charAt(i2);
            if (charAt < 128) {
                str2 = strArr[charAt];
                if (str2 == null) {
                }
            } else if (charAt == 8232) {
                str2 = "\\u2028";
            } else if (charAt == 8233) {
                str2 = "\\u2029";
            }
            if (i < i2) {
                fVar.mo25916m(str, i, i2);
            }
            fVar.mo25905e0(str2);
            i = i2 + 1;
        }
        if (i < length) {
            fVar.mo25916m(str, i, length);
        }
        fVar.mo25887E(34);
    }

    public abstract void beginArray();

    public abstract void beginObject();

    public abstract void endArray();

    public abstract void endObject();

    public final String getPath() {
        return JsonScope.getPath(this.stackSize, this.scopes, this.pathNames, this.pathIndices);
    }

    public abstract boolean hasNext();

    public abstract boolean nextBoolean();

    public abstract double nextDouble();

    public abstract int nextInt();

    public abstract String nextName();

    public abstract String nextString();

    public abstract Token peek();

    public final void pushScope(int i) {
        int i2 = this.stackSize;
        int[] iArr = this.scopes;
        if (i2 == iArr.length) {
            if (i2 != 256) {
                this.scopes = Arrays.copyOf(iArr, iArr.length * 2);
                String[] strArr = this.pathNames;
                this.pathNames = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
                int[] iArr2 = this.pathIndices;
                this.pathIndices = Arrays.copyOf(iArr2, iArr2.length * 2);
            } else {
                StringBuilder u = C0843a.m460u("Nesting too deep at ");
                u.append(getPath());
                throw new JsonDataException(u.toString());
            }
        }
        int[] iArr3 = this.scopes;
        int i3 = this.stackSize;
        this.stackSize = i3 + 1;
        iArr3[i3] = i;
    }

    public abstract int selectName(Options options);

    public abstract void skipName();

    public abstract void skipValue();

    public final JsonEncodingException syntaxError(String str) {
        StringBuilder y = C0843a.m464y(str, " at path ");
        y.append(getPath());
        throw new JsonEncodingException(y.toString());
    }
}
