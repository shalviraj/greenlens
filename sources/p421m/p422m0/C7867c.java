package p421m.p422m0;

import androidx.appcompat.widget.ActivityChooserView;
import androidx.exifinterface.media.ExifInterface;
import com.segment.analytics.internal.Iso8601Utils;
import java.io.Closeable;
import java.io.IOException;
import java.lang.reflect.Field;
import java.net.Socket;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p005b.p035e.p036a.p037a.C0843a;
import p005b.p291q.p292a.C5266a;
import p298d.p334t.C6790h;
import p298d.p344x.p346c.C6888i;
import p298d.p415c0.C7685a;
import p298d.p415c0.C7690d;
import p298d.p415c0.C7694h;
import p421m.C7829b0;
import p421m.C7831c0;
import p421m.C7844g0;
import p421m.C7850h0;
import p421m.C7853i0;
import p421m.C7855j0;
import p421m.C8022y;
import p421m.C8025z;
import p421m.p422m0.p429j.C7924c;
import p435n.C8030a0;
import p435n.C8040e;
import p435n.C8043g;
import p435n.C8044h;
import p435n.C8054q;

/* renamed from: m.m0.c */
public final class C7867c {

    /* renamed from: a */
    public static final byte[] f15619a;

    /* renamed from: b */
    public static final C8022y f15620b = C8022y.f16097h.mo25850c(new String[0]);

    /* renamed from: c */
    public static final C7855j0 f15621c;

    /* renamed from: d */
    public static final C8054q f15622d;

    /* renamed from: e */
    public static final TimeZone f15623e;

    /* renamed from: f */
    public static final C7690d f15624f = new C7690d("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");

    /* renamed from: g */
    public static final String f15625g;

    static {
        byte[] bArr = new byte[0];
        f15619a = bArr;
        C6888i.m12438e(bArr, "$this$toResponseBody");
        C8040e eVar = new C8040e();
        eVar.mo25936t0(bArr);
        C6888i.m12438e(eVar, "$this$asResponseBody");
        f15621c = new C7853i0(eVar, (C7829b0) null, (long) 0);
        C7844g0.C7845a.m14248c(C7844g0.f15540a, bArr, (C7829b0) null, 0, 0, 7);
        C8054q.C8055a aVar = C8054q.f16165i;
        C8044h.C8045a aVar2 = C8044h.f16143k;
        f15622d = aVar.mo25981c(aVar2.mo25969a("efbbbf"), aVar2.mo25969a("feff"), aVar2.mo25969a("fffe"), aVar2.mo25969a("0000ffff"), aVar2.mo25969a("ffff0000"));
        TimeZone timeZone = TimeZone.getTimeZone(Iso8601Utils.GMT_ID);
        C6888i.m12436c(timeZone);
        f15623e = timeZone;
        Class<C7831c0> cls = C7831c0.class;
        String name = C7831c0.class.getName();
        C6888i.m12437d(name, "OkHttpClient::class.java.name");
        String s = C7694h.m13941s(name, "okhttp3.");
        C6888i.m12438e(s, "$this$removeSuffix");
        C6888i.m12438e("Client", "suffix");
        C6888i.m12438e(s, "$this$endsWith");
        C6888i.m12438e("Client", "suffix");
        if (C7694h.m13927e(s, "Client", false, 2)) {
            s = s.substring(0, s.length() - "Client".length());
            C6888i.m12437d(s, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        }
        f15625g = s;
    }

    /* renamed from: A */
    public static final String m14278A(String str, int i, int i2) {
        C6888i.m12438e(str, "$this$trimSubstring");
        int n = m14293n(str, i, i2);
        String substring = str.substring(n, m14294o(str, n, i2));
        C6888i.m12437d(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return substring;
    }

    /* renamed from: B */
    public static final Throwable m14279B(Exception exc, List<? extends Exception> list) {
        C6888i.m12438e(exc, "$this$withSuppressed");
        C6888i.m12438e(list, "suppressed");
        if (list.size() > 1) {
            System.out.println(list);
        }
        for (Exception p : list) {
            C5266a.m10007p(exc, p);
        }
        return exc;
    }

    /* renamed from: a */
    public static final boolean m14280a(C8025z zVar, C8025z zVar2) {
        C6888i.m12438e(zVar, "$this$canReuseConnectionFor");
        C6888i.m12438e(zVar2, "other");
        return C6888i.m12434a(zVar.f16106e, zVar2.f16106e) && zVar.f16107f == zVar2.f16107f && C6888i.m12434a(zVar.f16103b, zVar2.f16103b);
    }

    /* renamed from: b */
    public static final int m14281b(String str, long j, TimeUnit timeUnit) {
        C6888i.m12438e(str, "name");
        int i = (j > 0 ? 1 : (j == 0 ? 0 : -1));
        boolean z = true;
        if (!(i >= 0)) {
            throw new IllegalStateException(C0843a.m451l(str, " < 0").toString());
        } else if (1 != 0) {
            long millis = timeUnit.toMillis(j);
            if (millis <= ((long) ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED)) {
                if (millis == 0 && i > 0) {
                    z = false;
                }
                if (z) {
                    return (int) millis;
                }
                throw new IllegalArgumentException(C0843a.m451l(str, " too small.").toString());
            }
            throw new IllegalArgumentException(C0843a.m451l(str, " too large.").toString());
        } else {
            throw new IllegalStateException("unit == null".toString());
        }
    }

    /* renamed from: c */
    public static final void m14282c(long j, long j2, long j3) {
        if ((j2 | j3) < 0 || j2 > j || j - j2 < j3) {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    /* renamed from: d */
    public static final void m14283d(Closeable closeable) {
        C6888i.m12438e(closeable, "$this$closeQuietly");
        try {
            closeable.close();
        } catch (RuntimeException e) {
            throw e;
        } catch (Exception unused) {
        }
    }

    /* renamed from: e */
    public static final void m14284e(Socket socket) {
        C6888i.m12438e(socket, "$this$closeQuietly");
        try {
            socket.close();
        } catch (AssertionError e) {
            throw e;
        } catch (RuntimeException e2) {
            if (!C6888i.m12434a(e2.getMessage(), "bio == null")) {
                throw e2;
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: f */
    public static final int m14285f(String str, char c, int i, int i2) {
        C6888i.m12438e(str, "$this$delimiterOffset");
        while (i < i2) {
            if (str.charAt(i) == c) {
                return i;
            }
            i++;
        }
        return i2;
    }

    /* renamed from: g */
    public static final int m14286g(String str, String str2, int i, int i2) {
        C6888i.m12438e(str, "$this$delimiterOffset");
        C6888i.m12438e(str2, "delimiters");
        while (i < i2) {
            if (C7694h.m13925c(str2, str.charAt(i), false, 2)) {
                return i;
            }
            i++;
        }
        return i2;
    }

    /* renamed from: h */
    public static final boolean m14287h(C8030a0 a0Var, int i, TimeUnit timeUnit) {
        C6888i.m12438e(a0Var, "$this$discard");
        C6888i.m12438e(timeUnit, "timeUnit");
        try {
            return m14301v(a0Var, i, timeUnit);
        } catch (IOException unused) {
            return false;
        }
    }

    /* renamed from: i */
    public static final String m14288i(String str, Object... objArr) {
        C6888i.m12438e(str, "format");
        C6888i.m12438e(objArr, "args");
        Locale locale = Locale.US;
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        String format = String.format(locale, str, Arrays.copyOf(copyOf, copyOf.length));
        C6888i.m12437d(format, "java.lang.String.format(locale, format, *args)");
        return format;
    }

    /* renamed from: j */
    public static final boolean m14289j(String[] strArr, String[] strArr2, Comparator<? super String> comparator) {
        C6888i.m12438e(strArr, "$this$hasIntersection");
        C6888i.m12438e(comparator, "comparator");
        if (!(strArr.length == 0) && strArr2 != null) {
            if (!(strArr2.length == 0)) {
                for (String str : strArr) {
                    for (String compare : strArr2) {
                        if (comparator.compare(str, compare) == 0) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    /* renamed from: k */
    public static final long m14290k(C7850h0 h0Var) {
        C6888i.m12438e(h0Var, "$this$headersContentLength");
        String e = h0Var.f15554l.mo25836e("Content-Length");
        if (e != null) {
            C6888i.m12438e(e, "$this$toLongOrDefault");
            try {
                return Long.parseLong(e);
            } catch (NumberFormatException unused) {
            }
        }
        return -1;
    }

    @SafeVarargs
    /* renamed from: l */
    public static final <T> List<T> m14291l(T... tArr) {
        C6888i.m12438e(tArr, "elements");
        Object[] objArr = (Object[]) tArr.clone();
        List<T> unmodifiableList = Collections.unmodifiableList(C6790h.m12314A(Arrays.copyOf(objArr, objArr.length)));
        C6888i.m12437d(unmodifiableList, "Collections.unmodifiable…istOf(*elements.clone()))");
        return unmodifiableList;
    }

    /* renamed from: m */
    public static final int m14292m(String str) {
        C6888i.m12438e(str, "$this$indexOfControlOrNonAscii");
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (C6888i.m12440g(charAt, 31) <= 0 || C6888i.m12440g(charAt, 127) >= 0) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: n */
    public static final int m14293n(String str, int i, int i2) {
        C6888i.m12438e(str, "$this$indexOfFirstNonAsciiWhitespace");
        while (i < i2) {
            char charAt = str.charAt(i);
            if (charAt != 9 && charAt != 10 && charAt != 12 && charAt != 13 && charAt != ' ') {
                return i;
            }
            i++;
        }
        return i2;
    }

    /* renamed from: o */
    public static final int m14294o(String str, int i, int i2) {
        C6888i.m12438e(str, "$this$indexOfLastNonAsciiWhitespace");
        int i3 = i2 - 1;
        if (i3 >= i) {
            while (true) {
                char charAt = str.charAt(i3);
                if (charAt == 9 || charAt == 10 || charAt == 12 || charAt == 13 || charAt == ' ') {
                    if (i3 == i) {
                        break;
                    }
                    i3--;
                } else {
                    return i3 + 1;
                }
            }
        }
        return i;
    }

    /* renamed from: p */
    public static final String[] m14295p(String[] strArr, String[] strArr2, Comparator<? super String> comparator) {
        C6888i.m12438e(strArr, "$this$intersect");
        C6888i.m12438e(strArr2, "other");
        C6888i.m12438e(comparator, "comparator");
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            int length = strArr2.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                } else if (comparator.compare(str, strArr2[i]) == 0) {
                    arrayList.add(str);
                    break;
                } else {
                    i++;
                }
            }
        }
        Object[] array = arrayList.toArray(new String[0]);
        Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
        return (String[]) array;
    }

    /* renamed from: q */
    public static final int m14296q(char c) {
        if ('0' <= c && '9' >= c) {
            return c - '0';
        }
        char c2 = 'a';
        if ('a' > c || 'f' < c) {
            c2 = 'A';
            if ('A' > c || 'F' < c) {
                return -1;
            }
        }
        return (c - c2) + 10;
    }

    /* renamed from: r */
    public static final Charset m14297r(C8043g gVar, Charset charset) {
        String str;
        Charset charset2;
        Charset charset3;
        C6888i.m12438e(gVar, "$this$readBomAsCharset");
        C6888i.m12438e(charset, "default");
        int m0 = gVar.mo25917m0(f15622d);
        if (m0 == -1) {
            return charset;
        }
        if (m0 == 0) {
            charset2 = StandardCharsets.UTF_8;
            str = "UTF_8";
        } else if (m0 == 1) {
            charset2 = StandardCharsets.UTF_16BE;
            str = "UTF_16BE";
        } else if (m0 != 2) {
            if (m0 == 3) {
                C7685a aVar = C7685a.f15213d;
                charset3 = C7685a.f15212c;
                if (charset3 == null) {
                    charset3 = Charset.forName("UTF-32BE");
                    C6888i.m12437d(charset3, "Charset.forName(\"UTF-32BE\")");
                    C7685a.f15212c = charset3;
                }
            } else if (m0 == 4) {
                C7685a aVar2 = C7685a.f15213d;
                charset3 = C7685a.f15211b;
                if (charset3 == null) {
                    charset3 = Charset.forName("UTF-32LE");
                    C6888i.m12437d(charset3, "Charset.forName(\"UTF-32LE\")");
                    C7685a.f15211b = charset3;
                }
            } else {
                throw new AssertionError();
            }
            return charset3;
        } else {
            charset2 = StandardCharsets.UTF_16LE;
            str = "UTF_16LE";
        }
        String str2 = str;
        Charset charset4 = charset2;
        C6888i.m12437d(charset4, str2);
        return charset4;
    }

    /* renamed from: s */
    public static final <T> T m14298s(Object obj, Class<T> cls, String str) {
        Object s;
        Class<Object> cls2 = Object.class;
        C6888i.m12438e(obj, "instance");
        C6888i.m12438e(cls, "fieldType");
        C6888i.m12438e(str, "fieldName");
        Class cls3 = obj.getClass();
        while (!C6888i.m12434a(cls3, cls2)) {
            try {
                Field declaredField = cls3.getDeclaredField(str);
                C6888i.m12437d(declaredField, "field");
                declaredField.setAccessible(true);
                Object obj2 = declaredField.get(obj);
                if (!cls.isInstance(obj2)) {
                    return null;
                }
                return cls.cast(obj2);
            } catch (NoSuchFieldException unused) {
                cls3 = cls3.getSuperclass();
                C6888i.m12437d(cls3, "c.superclass");
            }
        }
        if (!(!C6888i.m12434a(str, "delegate")) || (s = m14298s(obj, cls2, "delegate")) == null) {
            return null;
        }
        return m14298s(s, cls, str);
    }

    /* renamed from: t */
    public static final int m14299t(C8043g gVar) {
        C6888i.m12438e(gVar, "$this$readMedium");
        return (gVar.readByte() & ExifInterface.MARKER) | ((gVar.readByte() & ExifInterface.MARKER) << 16) | ((gVar.readByte() & ExifInterface.MARKER) << 8);
    }

    /* renamed from: u */
    public static final int m14300u(C8040e eVar, byte b) {
        C6888i.m12438e(eVar, "$this$skipAll");
        int i = 0;
        while (!eVar.mo25886D() && eVar.mo25891N(0) == b) {
            i++;
            eVar.readByte();
        }
        return i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0053, code lost:
        if (r5 == androidx.recyclerview.widget.RecyclerView.FOREVER_NS) goto L_0x006d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x006b, code lost:
        if (r5 != androidx.recyclerview.widget.RecyclerView.FOREVER_NS) goto L_0x0075;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x006d, code lost:
        r11.mo17035f().mo25873a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0075, code lost:
        r11.mo17035f().mo25876d(r0 + r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x007d, code lost:
        return r12;
     */
    /* renamed from: v */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean m14301v(p435n.C8030a0 r11, int r12, java.util.concurrent.TimeUnit r13) {
        /*
            java.lang.String r0 = "$this$skipAll"
            p298d.p344x.p346c.C6888i.m12438e(r11, r0)
            java.lang.String r0 = "timeUnit"
            p298d.p344x.p346c.C6888i.m12438e(r13, r0)
            long r0 = java.lang.System.nanoTime()
            n.b0 r2 = r11.mo17035f()
            boolean r2 = r2.mo25877e()
            r3 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            if (r2 == 0) goto L_0x0027
            n.b0 r2 = r11.mo17035f()
            long r5 = r2.mo25875c()
            long r5 = r5 - r0
            goto L_0x0028
        L_0x0027:
            r5 = r3
        L_0x0028:
            n.b0 r2 = r11.mo17035f()
            long r7 = (long) r12
            long r12 = r13.toNanos(r7)
            long r12 = java.lang.Math.min(r5, r12)
            long r12 = r12 + r0
            r2.mo25876d(r12)
            n.e r12 = new n.e     // Catch:{ InterruptedIOException -> 0x0068, all -> 0x0056 }
            r12.<init>()     // Catch:{ InterruptedIOException -> 0x0068, all -> 0x0056 }
        L_0x003e:
            r7 = 8192(0x2000, double:4.0474E-320)
            long r7 = r11.mo17031T(r12, r7)     // Catch:{ InterruptedIOException -> 0x0068, all -> 0x0056 }
            r9 = -1
            int r13 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r13 == 0) goto L_0x0050
            long r7 = r12.f16140h     // Catch:{ InterruptedIOException -> 0x0068, all -> 0x0056 }
            r12.skip(r7)     // Catch:{ InterruptedIOException -> 0x0068, all -> 0x0056 }
            goto L_0x003e
        L_0x0050:
            r12 = 1
            int r13 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r13 != 0) goto L_0x0075
            goto L_0x006d
        L_0x0056:
            r12 = move-exception
            int r13 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            n.b0 r11 = r11.mo17035f()
            if (r13 != 0) goto L_0x0063
            r11.mo25873a()
            goto L_0x0067
        L_0x0063:
            long r0 = r0 + r5
            r11.mo25876d(r0)
        L_0x0067:
            throw r12
        L_0x0068:
            r12 = 0
            int r13 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r13 != 0) goto L_0x0075
        L_0x006d:
            n.b0 r11 = r11.mo17035f()
            r11.mo25873a()
            goto L_0x007d
        L_0x0075:
            n.b0 r11 = r11.mo17035f()
            long r0 = r0 + r5
            r11.mo25876d(r0)
        L_0x007d:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: p421m.p422m0.C7867c.m14301v(n.a0, int, java.util.concurrent.TimeUnit):boolean");
    }

    /* renamed from: w */
    public static final C8022y m14302w(List<C7924c> list) {
        C6888i.m12438e(list, "$this$toHeaders");
        ArrayList arrayList = new ArrayList(20);
        for (C7924c next : list) {
            C8044h hVar = next.f15816b;
            C8044h hVar2 = next.f15817c;
            String z = hVar.mo25968z();
            String z2 = hVar2.mo25968z();
            C6888i.m12438e(z, "name");
            C6888i.m12438e(z2, "value");
            arrayList.add(z);
            arrayList.add(C7694h.m13921L(z2).toString());
        }
        Object[] array = arrayList.toArray(new String[0]);
        Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
        return new C8022y((String[]) array, (DefaultConstructorMarker) null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* renamed from: x */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.String m14303x(p421m.C8025z r4, boolean r5) {
        /*
            java.lang.String r0 = "$this$toHostHeader"
            p298d.p344x.p346c.C6888i.m12438e(r4, r0)
            java.lang.String r0 = r4.f16106e
            r1 = 0
            r2 = 2
            java.lang.String r3 = ":"
            boolean r0 = p298d.p415c0.C7694h.m13926d(r0, r3, r1, r2)
            if (r0 == 0) goto L_0x0020
            r0 = 91
            java.lang.StringBuilder r0 = p005b.p035e.p036a.p037a.C0843a.m459t(r0)
            java.lang.String r1 = r4.f16106e
            r2 = 93
            java.lang.String r0 = p005b.p035e.p036a.p037a.C0843a.m454o(r0, r1, r2)
            goto L_0x0022
        L_0x0020:
            java.lang.String r0 = r4.f16106e
        L_0x0022:
            if (r5 != 0) goto L_0x0055
            int r5 = r4.f16107f
            java.lang.String r1 = r4.f16103b
            java.lang.String r2 = "scheme"
            p298d.p344x.p346c.C6888i.m12438e(r1, r2)
            int r2 = r1.hashCode()
            r3 = 3213448(0x310888, float:4.503E-39)
            if (r2 == r3) goto L_0x0047
            r3 = 99617003(0x5f008eb, float:2.2572767E-35)
            if (r2 == r3) goto L_0x003c
            goto L_0x0052
        L_0x003c:
            java.lang.String r2 = "https"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0052
            r1 = 443(0x1bb, float:6.21E-43)
            goto L_0x0053
        L_0x0047:
            java.lang.String r2 = "http"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0052
            r1 = 80
            goto L_0x0053
        L_0x0052:
            r1 = -1
        L_0x0053:
            if (r5 == r1) goto L_0x006b
        L_0x0055:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r0)
            r0 = 58
            r5.append(r0)
            int r4 = r4.f16107f
            r5.append(r4)
            java.lang.String r0 = r5.toString()
        L_0x006b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p421m.p422m0.C7867c.m14303x(m.z, boolean):java.lang.String");
    }

    /* renamed from: y */
    public static final <T> List<T> m14304y(List<? extends T> list) {
        C6888i.m12438e(list, "$this$toImmutableList");
        List<T> unmodifiableList = Collections.unmodifiableList(C6790h.m12343b0(list));
        C6888i.m12437d(unmodifiableList, "Collections.unmodifiableList(toMutableList())");
        return unmodifiableList;
    }

    /* renamed from: z */
    public static final int m14305z(String str, int i) {
        if (str != null) {
            try {
                long parseLong = Long.parseLong(str);
                if (parseLong > ((long) ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED)) {
                    return ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
                }
                if (parseLong < 0) {
                    return 0;
                }
                return (int) parseLong;
            } catch (NumberFormatException unused) {
            }
        }
        return i;
    }
}
