package p005b.p006a.p007a.p024o;

import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.internal.view.SupportMenu;
import com.appfoundry.previewer.BravoApp;
import com.appfoundry.previewer.model.App;
import com.appfoundry.previewer.model.Asset;
import com.appfoundry.previewer.model.Container;
import com.appfoundry.previewer.model.Data;
import com.appfoundry.previewer.model.JsonApp;
import com.appfoundry.previewer.model.Page;
import com.appfoundry.previewer.model.Store;
import com.appfoundry.previewer.model.Style;
import com.bumptech.glide.load.ImageHeaderParser;
import java.io.InputStream;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p005b.p006a.p007a.p018i.C0744e;
import p005b.p006a.p007a.p018i.C0756o;
import p005b.p035e.p036a.p037a.C0843a;
import p005b.p040g.p041a.p047i.p048b.C0911d;
import p005b.p040g.p041a.p047i.p048b.C0912e;
import p005b.p040g.p041a.p047i.p048b.C0914g;
import p005b.p040g.p041a.p047i.p048b.C0920m;
import p005b.p040g.p041a.p049j.C0921a;
import p005b.p040g.p041a.p049j.C0922b;
import p005b.p040g.p041a.p050k.C0924b;
import p005b.p051h.p052a.p055m.C0967f;
import p005b.p051h.p052a.p055m.C0970i;
import p005b.p051h.p052a.p055m.C0972k;
import p005b.p051h.p052a.p055m.C0973l;
import p005b.p051h.p052a.p055m.p058v.p059c0.C1023b;
import p005b.p051h.p052a.p055m.p064x.p065c.C1260w;
import p005b.p096l.p097a.p113c.p119b.p122m.p123v.C1949b;
import p005b.p096l.p224e.C4465k;
import p005b.p096l.p224e.C4467l;
import p298d.p344x.p346c.C6888i;
import p298d.p415c0.C7694h;

/* renamed from: b.a.a.o.f */
public final class C0823f {
    /* renamed from: A */
    public static boolean m330A(@Nullable Object obj, @Nullable Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    /* renamed from: A0 */
    public static void m331A0(Parcel parcel, int i) {
        int dataPosition = parcel.dataPosition();
        parcel.setDataPosition(i - 4);
        parcel.writeInt(dataPosition - i);
        parcel.setDataPosition(dataPosition);
    }

    /* renamed from: B */
    public static final String m332B() {
        BravoApp.C5403b bVar = BravoApp.f10730N;
        JsonApp jsonApp = BravoApp.f10738n;
        if (jsonApp != null) {
            return jsonApp.f11018a;
        }
        return null;
    }

    /* renamed from: B0 */
    public static void m333B0(Parcel parcel, int i, int i2) {
        if (i2 >= 65535) {
            parcel.writeInt(i | SupportMenu.CATEGORY_MASK);
            parcel.writeInt(i2);
            return;
        }
        parcel.writeInt(i | (i2 << 16));
    }

    /* renamed from: C */
    public static final Asset m334C(String str, Boolean bool) {
        App app2;
        List<Asset> list;
        BravoApp.C5403b bVar = BravoApp.f10730N;
        T t = null;
        if (BravoApp.f10746v || BravoApp.f10747w || C6888i.m12434a(bool, Boolean.TRUE)) {
            JsonApp i = C0820c.m309i();
            if (i == null || (app2 = i.f11021d) == null || (list = app2.f10888b) == null) {
                return null;
            }
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                T next = it.next();
                if (C6888i.m12434a(((Asset) next).f10895a, str)) {
                    t = next;
                    break;
                }
            }
            return (Asset) t;
        }
        Map<String, Asset> map = BravoApp.f10741q;
        if (map != null) {
            return map.get(str);
        }
        return null;
    }

    /* renamed from: D */
    public static final Page m335D() {
        App app2;
        Data data;
        List<Page> list;
        String str;
        T t;
        BravoApp.C5403b bVar = BravoApp.f10730N;
        JsonApp jsonApp = BravoApp.f10738n;
        T t2 = null;
        if (jsonApp == null || (app2 = jsonApp.f11021d) == null || (data = app2.f10891e) == null || (list = data.f10985b) == null) {
            return null;
        }
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            T next = it.next();
            Page page = (Page) next;
            C6888i.m12438e(page, "$this$hasTagWithExactName");
            C6888i.m12438e("state:loading", "tag");
            List<String> list2 = page.f11045m;
            boolean z = true;
            if (list2 != null) {
                Iterator<T> it2 = list2.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        t = null;
                        break;
                    }
                    t = it2.next();
                    if (C7694h.m13928f((String) t, "state:loading", true)) {
                        break;
                    }
                }
                str = (String) t;
            } else {
                str = null;
            }
            if (str == null) {
                z = false;
                continue;
            }
            if (z) {
                t2 = next;
                break;
            }
        }
        return (Page) t2;
    }

    /* renamed from: E */
    public static final Page m336E() {
        App app2;
        Data data;
        List<Page> list;
        boolean z;
        BravoApp.C5403b bVar = BravoApp.f10730N;
        JsonApp jsonApp = BravoApp.f10738n;
        T t = null;
        if (jsonApp == null || (app2 = jsonApp.f11021d) == null || (data = app2.f10891e) == null || (list = data.f10985b) == null) {
            return null;
        }
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            T next = it.next();
            Page page = (Page) next;
            if (page.f11046n != null || C0744e.m216t(page, "intro")) {
                z = true;
                continue;
            } else {
                z = false;
                continue;
            }
            if (z) {
                t = next;
                break;
            }
        }
        return (Page) t;
    }

    /* renamed from: F */
    public static int m337F(@NonNull List<ImageHeaderParser> list, @Nullable InputStream inputStream, @NonNull C1023b bVar) {
        if (inputStream == null) {
            return -1;
        }
        if (!inputStream.markSupported()) {
            inputStream = new C1260w(inputStream, bVar);
        }
        inputStream.mark(5242880);
        return m338G(list, new C0970i(inputStream, bVar));
    }

    /* renamed from: G */
    public static int m338G(@NonNull List<ImageHeaderParser> list, C0972k kVar) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            int a = kVar.mo10827a(list.get(i));
            if (a != -1) {
                return a;
            }
        }
        return -1;
    }

    /* renamed from: H */
    public static final Page m339H(String str) {
        BravoApp.C5403b bVar = BravoApp.f10730N;
        if (BravoApp.f10746v || BravoApp.f10747w || C0820c.m324x()) {
            return m341J(str);
        }
        Map<String, Page> map = BravoApp.f10739o;
        if (map != null) {
            return map.get(str);
        }
        return null;
    }

    /* renamed from: I */
    public static final Page m340I(String str) {
        App app2;
        Data data;
        List<Page> list;
        C6888i.m12438e(str, "tag");
        BravoApp.C5403b bVar = BravoApp.f10730N;
        JsonApp jsonApp = BravoApp.f10738n;
        T t = null;
        if (jsonApp == null || (app2 = jsonApp.f11021d) == null || (data = app2.f10891e) == null || (list = data.f10985b) == null) {
            return null;
        }
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            T next = it.next();
            if (C0744e.m216t((Page) next, str)) {
                t = next;
                break;
            }
        }
        return (Page) t;
    }

    /* renamed from: J */
    public static final Page m341J(String str) {
        App app2;
        Data data;
        List<Page> list;
        JsonApp i = C0820c.m309i();
        T t = null;
        if (i == null || (app2 = i.f11021d) == null || (data = app2.f10891e) == null || (list = data.f10985b) == null) {
            return null;
        }
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            T next = it.next();
            if (C6888i.m12434a(((Page) next).f11033a, str)) {
                t = next;
                break;
            }
        }
        return (Page) t;
    }

    /* renamed from: K */
    public static final Page m342K(String str) {
        App app2;
        Data data;
        List<Page> list;
        C6888i.m12438e(str, "tag");
        JsonApp i = C0820c.m309i();
        T t = null;
        if (i == null || (app2 = i.f11021d) == null || (data = app2.f10891e) == null || (list = data.f10985b) == null) {
            return null;
        }
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            T next = it.next();
            if (C0744e.m216t((Page) next, str)) {
                t = next;
                break;
            }
        }
        return (Page) t;
    }

    /* renamed from: L */
    public static final Integer m343L() {
        App app2;
        Store store;
        BravoApp.C5403b bVar = BravoApp.f10730N;
        JsonApp jsonApp = BravoApp.f10738n;
        if (jsonApp == null || (app2 = jsonApp.f11021d) == null || (store = app2.f10889c) == null) {
            return null;
        }
        return store.f11123f;
    }

    @NonNull
    /* renamed from: M */
    public static String m344M(int i) {
        switch (i) {
            case -1:
                return "SUCCESS_CACHE";
            case 0:
                return "SUCCESS";
            case 2:
                return "SERVICE_VERSION_UPDATE_REQUIRED";
            case 3:
                return "SERVICE_DISABLED";
            case 4:
                return "SIGN_IN_REQUIRED";
            case 5:
                return "INVALID_ACCOUNT";
            case 6:
                return "RESOLUTION_REQUIRED";
            case 7:
                return "NETWORK_ERROR";
            case 8:
                return "INTERNAL_ERROR";
            case 10:
                return "DEVELOPER_ERROR";
            case 13:
                return "ERROR";
            case 14:
                return "INTERRUPTED";
            case 15:
                return "TIMEOUT";
            case 16:
                return "CANCELED";
            case 17:
                return "API_NOT_CONNECTED";
            case 18:
                return "DEAD_CLIENT";
            default:
                return C0843a.m438N(32, "unknown status code: ", i);
        }
    }

    /* renamed from: N */
    public static final Style m345N(String str, Boolean bool) {
        App app2;
        List<Style> list;
        BravoApp.C5403b bVar = BravoApp.f10730N;
        T t = null;
        if (BravoApp.f10746v || BravoApp.f10747w || C6888i.m12434a(bool, Boolean.TRUE)) {
            JsonApp i = C0820c.m309i();
            if (i == null || (app2 = i.f11021d) == null || (list = app2.f10892f) == null) {
                return null;
            }
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                T next = it.next();
                if (C6888i.m12434a(((Style) next).f11140a, str)) {
                    t = next;
                    break;
                }
            }
            return (Style) t;
        }
        Map<String, Style> map = BravoApp.f10740p;
        if (map != null) {
            return map.get(str);
        }
        return null;
    }

    /* renamed from: O */
    public static /* synthetic */ Style m346O(String str, Boolean bool, int i) {
        return m345N(str, (i & 2) != 0 ? Boolean.FALSE : null);
    }

    /* renamed from: P */
    public static String m347P(String str) {
        return C0843a.m451l("TransportRuntime.", str);
    }

    @NonNull
    /* renamed from: Q */
    public static ImageHeaderParser.ImageType m348Q(@NonNull List<ImageHeaderParser> list, @Nullable InputStream inputStream, @NonNull C1023b bVar) {
        if (inputStream == null) {
            return ImageHeaderParser.ImageType.UNKNOWN;
        }
        if (!inputStream.markSupported()) {
            inputStream = new C1260w(inputStream, bVar);
        }
        inputStream.mark(5242880);
        return m349R(list, new C0967f(inputStream));
    }

    @NonNull
    /* renamed from: R */
    public static ImageHeaderParser.ImageType m349R(@NonNull List<ImageHeaderParser> list, C0973l lVar) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ImageHeaderParser.ImageType a = lVar.mo10826a(list.get(i));
            if (a != ImageHeaderParser.ImageType.UNKNOWN) {
                return a;
            }
        }
        return ImageHeaderParser.ImageType.UNKNOWN;
    }

    /* renamed from: S */
    public static boolean m350S(int i, int i2) {
        return (i & i2) == i2;
    }

    /* renamed from: T */
    public static void m351T(String str, String str2) {
        Log.i(m347P(str), str2);
    }

    /* renamed from: U */
    public static final Boolean m352U(String str) {
        String str2 = null;
        if (str == null) {
            return null;
        }
        Container p = m388p();
        if (p != null) {
            str2 = p.f10967a;
        }
        return Boolean.valueOf(str.equals(str2));
    }

    /* renamed from: V */
    public static boolean m353V(Uri uri) {
        return uri != null && "content".equals(uri.getScheme()) && "media".equals(uri.getAuthority());
    }

    /* renamed from: W */
    public static boolean m354W(int i, int i2) {
        return i != Integer.MIN_VALUE && i2 != Integer.MIN_VALUE && i <= 512 && i2 <= 384;
    }

    /* renamed from: X */
    public static String m355X(String str, String str2) {
        int length = str.length() - str2.length();
        if (length < 0 || length > 1) {
            throw new IllegalArgumentException("Invalid input received");
        }
        StringBuilder sb = new StringBuilder(str2.length() + str.length());
        for (int i = 0; i < str.length(); i++) {
            sb.append(str.charAt(i));
            if (str2.length() > i) {
                sb.append(str2.charAt(i));
            }
        }
        return sb.toString();
    }

    /* renamed from: Y */
    public static boolean m356Y(Parcel parcel, int i) {
        m405x0(parcel, i, 4);
        return parcel.readInt() != 0;
    }

    /* renamed from: Z */
    public static Boolean m357Z(Parcel parcel, int i) {
        int h0 = m373h0(parcel, i);
        if (h0 == 0) {
            return null;
        }
        m409z0(parcel, h0, 4);
        return Boolean.valueOf(parcel.readInt() != 0);
    }

    /* renamed from: a */
    public static C4465k m358a() {
        Type type = new C0912e().f8250b;
        C4467l lVar = new C4467l();
        lVar.f8311e.add(new C0924b());
        lVar.mo16128b(C0922b.class, new C0920m());
        lVar.mo16128b(C0921a.class, new C0911d());
        lVar.mo16128b(type, new C0914g());
        lVar.f8313g = "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'";
        return lVar.mo16127a();
    }

    /* renamed from: a0 */
    public static byte m359a0(Parcel parcel, int i) {
        m405x0(parcel, i, 4);
        return (byte) parcel.readInt();
    }

    /* renamed from: b */
    public static void m360b(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: b0 */
    public static float m361b0(Parcel parcel, int i) {
        m405x0(parcel, i, 4);
        return parcel.readFloat();
    }

    /* renamed from: c */
    public static void m362c(boolean z, Object obj) {
        if (!z) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    /* renamed from: c0 */
    public static Float m363c0(Parcel parcel, int i) {
        int h0 = m373h0(parcel, i);
        if (h0 == 0) {
            return null;
        }
        m409z0(parcel, h0, 4);
        return Float.valueOf(parcel.readFloat());
    }

    /* renamed from: d */
    public static void m364d(boolean z, String str, Object... objArr) {
        if (!z) {
            throw new IllegalArgumentException(String.format(str, objArr));
        }
    }

    /* renamed from: d0 */
    public static IBinder m365d0(Parcel parcel, int i) {
        int h0 = m373h0(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (h0 == 0) {
            return null;
        }
        IBinder readStrongBinder = parcel.readStrongBinder();
        parcel.setDataPosition(dataPosition + h0);
        return readStrongBinder;
    }

    /* renamed from: e */
    public static void m366e(boolean z, @NonNull String str) {
        if (!z) {
            throw new IllegalArgumentException(str);
        }
    }

    /* renamed from: e0 */
    public static int m367e0(Parcel parcel, int i) {
        m405x0(parcel, i, 4);
        return parcel.readInt();
    }

    /* renamed from: f */
    public static void m368f(Handler handler) {
        String name = Looper.myLooper() != null ? Looper.myLooper().getThread().getName() : "null current looper";
        String name2 = handler.getLooper().getThread().getName();
        StringBuilder sb = new StringBuilder(String.valueOf(name).length() + String.valueOf(name2).length() + 36);
        sb.append("Must be called on ");
        sb.append(name2);
        sb.append(" thread, but got ");
        sb.append(name);
        sb.append(".");
        m370g(handler, sb.toString());
    }

    /* renamed from: f0 */
    public static long m369f0(Parcel parcel, int i) {
        m405x0(parcel, i, 8);
        return parcel.readLong();
    }

    /* renamed from: g */
    public static void m370g(Handler handler, String str) {
        if (Looper.myLooper() != handler.getLooper()) {
            throw new IllegalStateException(str);
        }
    }

    /* renamed from: g0 */
    public static Long m371g0(Parcel parcel, int i) {
        int h0 = m373h0(parcel, i);
        if (h0 == 0) {
            return null;
        }
        m409z0(parcel, h0, 8);
        return Long.valueOf(parcel.readLong());
    }

    /* renamed from: h */
    public static void m372h(String str) {
        if (!(Looper.getMainLooper() == Looper.myLooper())) {
            throw new IllegalStateException(str);
        }
    }

    /* renamed from: h0 */
    public static int m373h0(Parcel parcel, int i) {
        return (i & SupportMenu.CATEGORY_MASK) != -65536 ? (i >> 16) & 65535 : parcel.readInt();
    }

    /* renamed from: i */
    public static String m374i(String str, Object obj) {
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        throw new IllegalArgumentException(String.valueOf(obj));
    }

    /* JADX WARNING: Removed duplicated region for block: B:6:0x0015  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0029  */
    /* renamed from: i0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static <TInput, TResult, TException extends java.lang.Throwable> TResult m375i0(int r5, TInput r6, p005b.p096l.p097a.p098a.p099e.C1588b<TInput, TResult, TException> r7, p005b.p096l.p097a.p098a.p101f.p105p.C1665a<TInput, TResult> r8) {
        /*
            r8 = 1
            if (r5 >= r8) goto L_0x0008
            java.lang.Object r5 = r7.mo11735a(r6)
            return r5
        L_0x0008:
            java.lang.Object r0 = r7.mo11735a(r6)
            b.l.a.a.e.d$a r6 = (p005b.p096l.p097a.p098a.p099e.C1590d.C1591a) r6
            r1 = r0
            b.l.a.a.e.d$b r1 = (p005b.p096l.p097a.p098a.p099e.C1590d.C1592b) r1
            java.net.URL r2 = r1.f2711b
            if (r2 == 0) goto L_0x0029
            java.lang.String r3 = "CctTransportBackend"
            java.lang.String r4 = "Following redirect to: %s"
            m402w(r3, r4, r2)
            java.net.URL r1 = r1.f2711b
            b.l.a.a.e.d$a r2 = new b.l.a.a.e.d$a
            b.l.a.a.e.e.j r3 = r6.f2708b
            java.lang.String r6 = r6.f2709c
            r2.<init>(r1, r3, r6)
            r6 = r2
            goto L_0x002a
        L_0x0029:
            r6 = 0
        L_0x002a:
            if (r6 == 0) goto L_0x0030
            int r5 = r5 + -1
            if (r5 >= r8) goto L_0x0008
        L_0x0030:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p006a.p007a.p024o.C0823f.m375i0(int, java.lang.Object, b.l.a.a.e.b, b.l.a.a.f.p.a):java.lang.Object");
    }

    /* renamed from: j */
    public static String m376j(String str) {
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        throw new IllegalArgumentException("Given String is empty or null");
    }

    /* renamed from: j0 */
    public static final void m377j0(String str) {
        Page page;
        App app2;
        Data data;
        List<Page> list;
        String str2 = str;
        if (str2 != null && C0756o.m228f(str)) {
            BravoApp.C5403b bVar = BravoApp.f10730N;
            Map<String, Page> map = BravoApp.f10739o;
            if ((map != null ? map.get(str2) : null) == null) {
                C6888i.m12438e(str2, "hrefRemote");
                C6888i.m12438e(str2, "$this$getPageIdFromHrefRemote");
                String substring = str2.substring(C0756o.m231i(str2, "/", 7, false, 4) + 1, C7694h.m13926d(str2, "?", false, 2) ? C0756o.m231i(str2, "?", 1, false, 4) : str.length() > 0 ? str.length() : 0);
                C6888i.m12437d(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                Page H = m339H(substring);
                Page page2 = r0;
                Page page3 = new Page(str, C0843a.m451l("remotePage:", str2), H != null ? H.f11035c : null, (Container) null, (Container) null, (List) null, (List) null, (Container) null, (Container) null, (Boolean) null, str, (String) null, H != null ? H.f11045m : null, (String) null, (List) null, H != null ? H.f11048p : null, (String) null, H != null ? H.f11050r : null, (String) null, (String) null, H != null ? H.f11053u : null, false, (List) null, false, (String) null, false, 65891320, (DefaultConstructorMarker) null);
                JsonApp f = C0820c.m306f();
                if (f == null || (app2 = f.f11021d) == null || (data = app2.f10891e) == null || (list = data.f10985b) == null) {
                    page = page2;
                } else {
                    C6888i.m12438e(list, "$this$addOrReplace");
                    page = page2;
                    C6888i.m12438e(page, "newPage");
                    if (list.contains(page)) {
                        Iterator<Page> it = list.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            Page next = it.next();
                            if (C6888i.m12434a(next.f11033a, page.f11033a)) {
                                list.remove(next);
                                break;
                            }
                        }
                    }
                    list.add(page);
                }
                BravoApp.C5403b bVar2 = BravoApp.f10730N;
                Map<String, Page> map2 = BravoApp.f10739o;
                if (map2 != null) {
                    Page put = map2.put(str, page);
                }
            }
        }
    }

    /* renamed from: k */
    public static void m378k(String str) {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            throw new IllegalStateException(str);
        }
    }

    /* renamed from: k0 */
    public static void m379k0(Parcel parcel, int i) {
        parcel.setDataPosition(parcel.dataPosition() + m373h0(parcel, i));
    }

    @NonNull
    /* renamed from: l */
    public static <T> T m380l(T t, Object obj) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(String.valueOf(obj));
    }

    /* renamed from: l0 */
    public static int m381l0(Parcel parcel) {
        int readInt = parcel.readInt();
        int h0 = m373h0(parcel, readInt);
        int dataPosition = parcel.dataPosition();
        if ((65535 & readInt) != 20293) {
            String valueOf = String.valueOf(Integer.toHexString(readInt));
            throw new C1949b(valueOf.length() != 0 ? "Expected object header. Got 0x".concat(valueOf) : new String("Expected object header. Got 0x"), parcel);
        }
        int i = h0 + dataPosition;
        if (i >= dataPosition && i <= parcel.dataSize()) {
            return i;
        }
        throw new C1949b(C0843a.m439O(54, "Size read is invalid start=", dataPosition, " end=", i), parcel);
    }

    @NonNull
    /* renamed from: m */
    public static <T> T m382m(@Nullable T t) {
        Objects.requireNonNull(t, "null reference");
        return t;
    }

    /* renamed from: m0 */
    public static void m383m0(Parcel parcel, int i, Boolean bool, boolean z) {
        if (bool != null) {
            m333B0(parcel, i, 4);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        } else if (z) {
            m333B0(parcel, i, 0);
        }
    }

    /* renamed from: n */
    public static void m384n(boolean z) {
        if (!z) {
            throw new IllegalStateException();
        }
    }

    /* renamed from: n0 */
    public static void m385n0(Parcel parcel, int i, Bundle bundle, boolean z) {
        if (bundle != null) {
            int w0 = m403w0(parcel, i);
            parcel.writeBundle(bundle);
            m331A0(parcel, w0);
        } else if (z) {
            m333B0(parcel, i, 0);
        }
    }

    /* renamed from: o */
    public static void m386o(boolean z, Object obj) {
        if (!z) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }

    /* renamed from: o0 */
    public static void m387o0(Parcel parcel, int i, Float f, boolean z) {
        if (f != null) {
            m333B0(parcel, i, 4);
            parcel.writeFloat(f.floatValue());
        } else if (z) {
            m333B0(parcel, i, 0);
        }
    }

    /* renamed from: p */
    public static final Container m388p() {
        App app2;
        Data data;
        List<Page> list;
        Page page;
        List<Container> list2;
        BravoApp.C5403b bVar = BravoApp.f10730N;
        JsonApp jsonApp = BravoApp.f10738n;
        if (jsonApp == null || (app2 = jsonApp.f11021d) == null || (data = app2.f10891e) == null || (list = data.f10984a) == null || (page = list.get(0)) == null || (list2 = page.f11038f) == null) {
            return null;
        }
        return list2.get(0);
    }

    /* renamed from: p0 */
    public static void m389p0(Parcel parcel, int i, IBinder iBinder, boolean z) {
        if (iBinder != null) {
            int w0 = m403w0(parcel, i);
            parcel.writeStrongBinder(iBinder);
            m331A0(parcel, w0);
        } else if (z) {
            m333B0(parcel, i, 0);
        }
    }

    /* renamed from: q */
    public static Bundle m390q(Parcel parcel, int i) {
        int h0 = m373h0(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (h0 == 0) {
            return null;
        }
        Bundle readBundle = parcel.readBundle();
        parcel.setDataPosition(dataPosition + h0);
        return readBundle;
    }

    /* renamed from: q0 */
    public static void m391q0(Parcel parcel, int i, Long l, boolean z) {
        if (l != null) {
            m333B0(parcel, i, 8);
            parcel.writeLong(l.longValue());
        } else if (z) {
            m333B0(parcel, i, 0);
        }
    }

    /* renamed from: r */
    public static <T extends Parcelable> T m392r(Parcel parcel, int i, Parcelable.Creator<T> creator) {
        int h0 = m373h0(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (h0 == 0) {
            return null;
        }
        T t = (Parcelable) creator.createFromParcel(parcel);
        parcel.setDataPosition(dataPosition + h0);
        return t;
    }

    /* renamed from: r0 */
    public static void m393r0(Parcel parcel, int i, Parcelable parcelable, int i2, boolean z) {
        if (parcelable != null) {
            int w0 = m403w0(parcel, i);
            parcelable.writeToParcel(parcel, i2);
            m331A0(parcel, w0);
        } else if (z) {
            m333B0(parcel, i, 0);
        }
    }

    /* renamed from: s */
    public static String m394s(Parcel parcel, int i) {
        int h0 = m373h0(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (h0 == 0) {
            return null;
        }
        String readString = parcel.readString();
        parcel.setDataPosition(dataPosition + h0);
        return readString;
    }

    /* renamed from: s0 */
    public static void m395s0(Parcel parcel, int i, String str, boolean z) {
        if (str != null) {
            int w0 = m403w0(parcel, i);
            parcel.writeString(str);
            m331A0(parcel, w0);
        } else if (z) {
            m333B0(parcel, i, 0);
        }
    }

    /* renamed from: t */
    public static ArrayList<String> m396t(Parcel parcel, int i) {
        int h0 = m373h0(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (h0 == 0) {
            return null;
        }
        ArrayList<String> createStringArrayList = parcel.createStringArrayList();
        parcel.setDataPosition(dataPosition + h0);
        return createStringArrayList;
    }

    /* renamed from: t0 */
    public static void m397t0(Parcel parcel, int i, List<String> list, boolean z) {
        if (list != null) {
            int w0 = m403w0(parcel, i);
            parcel.writeStringList(list);
            m331A0(parcel, w0);
        } else if (z) {
            m333B0(parcel, i, 0);
        }
    }

    /* renamed from: u */
    public static <T> T[] m398u(Parcel parcel, int i, Parcelable.Creator<T> creator) {
        int h0 = m373h0(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (h0 == 0) {
            return null;
        }
        T[] createTypedArray = parcel.createTypedArray(creator);
        parcel.setDataPosition(dataPosition + h0);
        return createTypedArray;
    }

    /* renamed from: u0 */
    public static <T extends Parcelable> void m399u0(Parcel parcel, int i, T[] tArr, int i2, boolean z) {
        if (tArr != null) {
            int w0 = m403w0(parcel, i);
            parcel.writeInt(r7);
            for (T t : tArr) {
                if (t == null) {
                    parcel.writeInt(0);
                } else {
                    m407y0(parcel, t, i2);
                }
            }
            m331A0(parcel, w0);
        } else if (z) {
            m333B0(parcel, i, 0);
        }
    }

    /* renamed from: v */
    public static <T> ArrayList<T> m400v(Parcel parcel, int i, Parcelable.Creator<T> creator) {
        int h0 = m373h0(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (h0 == 0) {
            return null;
        }
        ArrayList<T> createTypedArrayList = parcel.createTypedArrayList(creator);
        parcel.setDataPosition(dataPosition + h0);
        return createTypedArrayList;
    }

    /* renamed from: v0 */
    public static <T extends Parcelable> void m401v0(Parcel parcel, int i, List<T> list, boolean z) {
        if (list != null) {
            int w0 = m403w0(parcel, i);
            int size = list.size();
            parcel.writeInt(size);
            for (int i2 = 0; i2 < size; i2++) {
                Parcelable parcelable = (Parcelable) list.get(i2);
                if (parcelable == null) {
                    parcel.writeInt(0);
                } else {
                    m407y0(parcel, parcelable, 0);
                }
            }
            m331A0(parcel, w0);
        } else if (z) {
            m333B0(parcel, i, 0);
        }
    }

    /* renamed from: w */
    public static void m402w(String str, String str2, Object obj) {
        Log.d(m347P(str), String.format(str2, new Object[]{obj}));
    }

    /* renamed from: w0 */
    public static int m403w0(Parcel parcel, int i) {
        parcel.writeInt(i | SupportMenu.CATEGORY_MASK);
        parcel.writeInt(0);
        return parcel.dataPosition();
    }

    /* renamed from: x */
    public static void m404x(String str, String str2, Object... objArr) {
        Log.d(m347P(str), String.format(str2, objArr));
    }

    /* renamed from: x0 */
    public static void m405x0(Parcel parcel, int i, int i2) {
        int h0 = m373h0(parcel, i);
        if (h0 != i2) {
            String hexString = Integer.toHexString(h0);
            StringBuilder sb = new StringBuilder(String.valueOf(hexString).length() + 46);
            sb.append("Expected size ");
            sb.append(i2);
            sb.append(" got ");
            sb.append(h0);
            throw new C1949b(C0843a.m456q(sb, " (0x", hexString, ")"), parcel);
        }
    }

    /* renamed from: y */
    public static void m406y(String str, String str2, Throwable th) {
        Log.e(m347P(str), str2, th);
    }

    /* renamed from: y0 */
    public static <T extends Parcelable> void m407y0(Parcel parcel, T t, int i) {
        int dataPosition = parcel.dataPosition();
        parcel.writeInt(1);
        int dataPosition2 = parcel.dataPosition();
        t.writeToParcel(parcel, i);
        int dataPosition3 = parcel.dataPosition();
        parcel.setDataPosition(dataPosition);
        parcel.writeInt(dataPosition3 - dataPosition2);
        parcel.setDataPosition(dataPosition3);
    }

    /* renamed from: z */
    public static void m408z(Parcel parcel, int i) {
        if (parcel.dataPosition() != i) {
            throw new C1949b(C0843a.m438N(37, "Overread allowed size end=", i), parcel);
        }
    }

    /* renamed from: z0 */
    public static void m409z0(Parcel parcel, int i, int i2) {
        if (i != i2) {
            String hexString = Integer.toHexString(i);
            StringBuilder sb = new StringBuilder(String.valueOf(hexString).length() + 46);
            sb.append("Expected size ");
            sb.append(i2);
            sb.append(" got ");
            sb.append(i);
            throw new C1949b(C0843a.m456q(sb, " (0x", hexString, ")"), parcel);
        }
    }
}
