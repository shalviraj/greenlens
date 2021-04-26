package p005b.p096l.p224e;

import java.lang.reflect.Field;
import java.util.Locale;
import p005b.p035e.p036a.p037a.C0843a;

/* renamed from: b.l.e.d */
public enum C4335d implements C4344e {
    IDENTITY {
        /* renamed from: d */
        public String mo15966d(Field field) {
            return field.getName();
        }
    },
    UPPER_CAMEL_CASE {
        /* renamed from: d */
        public String mo15966d(Field field) {
            return C4335d.m7953i(field.getName());
        }
    },
    UPPER_CAMEL_CASE_WITH_SPACES {
        /* renamed from: d */
        public String mo15966d(Field field) {
            return C4335d.m7953i(C4335d.m7952e(field.getName(), " "));
        }
    },
    LOWER_CASE_WITH_UNDERSCORES {
        /* renamed from: d */
        public String mo15966d(Field field) {
            return C4335d.m7952e(field.getName(), "_").toLowerCase(Locale.ENGLISH);
        }
    },
    LOWER_CASE_WITH_DASHES {
        /* renamed from: d */
        public String mo15966d(Field field) {
            return C4335d.m7952e(field.getName(), "-").toLowerCase(Locale.ENGLISH);
        }
    },
    LOWER_CASE_WITH_DOTS {
        /* renamed from: d */
        public String mo15966d(Field field) {
            return C4335d.m7952e(field.getName(), ".").toLowerCase(Locale.ENGLISH);
        }
    };

    /* access modifiers changed from: public */
    C4335d(C4336a aVar) {
    }

    /* renamed from: e */
    public static String m7952e(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (Character.isUpperCase(charAt) && sb.length() != 0) {
                sb.append(str2);
            }
            sb.append(charAt);
        }
        return sb.toString();
    }

    /* renamed from: i */
    public static String m7953i(String str) {
        int length = str.length() - 1;
        int i = 0;
        while (!Character.isLetter(str.charAt(i)) && i < length) {
            i++;
        }
        char charAt = str.charAt(i);
        if (Character.isUpperCase(charAt)) {
            return str;
        }
        char upperCase = Character.toUpperCase(charAt);
        if (i == 0) {
            StringBuilder t = C0843a.m459t(upperCase);
            t.append(str.substring(1));
            return t.toString();
        }
        return str.substring(0, i) + upperCase + str.substring(i + 1);
    }
}
