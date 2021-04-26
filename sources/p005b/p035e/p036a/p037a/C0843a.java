package p005b.p035e.p036a.p037a;

import android.net.Uri;
import android.util.JsonReader;
import android.util.Log;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import androidx.renderscript.Allocation;
import androidx.renderscript.Element;
import com.segment.analytics.Analytics;
import com.segment.analytics.Options;
import com.segment.analytics.Properties;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;
import p005b.p006a.p007a.p015f.C0688a;
import p005b.p038f.p039a.C0849e;
import p298d.p299a.p300a.p301a.p303y0.p326e.C6667q;
import p298d.p299a.p300a.p301a.p303y0.p326e.p330z.C6700b;
import p298d.p299a.p300a.p301a.p303y0.p405l.p408l1.C7535i;
import p298d.p299a.p300a.p301a.p303y0.p405l.p408l1.C7538l;
import p298d.p344x.p346c.C6888i;
import p298d.p344x.p346c.C6902w;

/* renamed from: b.e.a.a.a */
/* compiled from: outline */
public class C0843a {
    /* renamed from: A */
    public static StringBuilder m425A(String str, C7535i iVar, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(iVar);
        sb.append(str2);
        return sb;
    }

    /* renamed from: B */
    public static StringBuilder m426B(String str, C7538l lVar, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(lVar);
        sb.append(str2);
        return sb;
    }

    /* renamed from: C */
    public static C6667q m427C(C6667q qVar, C6667q qVar2) {
        C6667q.C6673c A = C6667q.m12068A(qVar);
        A.mo23694j(qVar2);
        return A.mo23805l();
    }

    /* renamed from: D */
    public static void m428D(int i, HashMap hashMap, String str, int i2, String str2, int i3, String str3, int i4, String str4) {
        hashMap.put(str, Integer.valueOf(i));
        hashMap.put(str2, Integer.valueOf(i2));
        hashMap.put(str3, Integer.valueOf(i3));
        hashMap.put(str4, Integer.valueOf(i4));
    }

    /* renamed from: E */
    public static void m429E(String str, Fragment fragment, String str2) {
        Log.v(str2, str + fragment);
    }

    /* renamed from: F */
    public static void m430F(String str, boolean z, Analytics analytics, String str2, Properties properties) {
        analytics.track(str2, properties, new Options().setIntegration(str, z));
    }

    /* renamed from: G */
    public static void m431G(StringBuilder sb, String str, String str2, String str3, String str4) {
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
        sb.append(str4);
    }

    /* renamed from: H */
    public static int m432H(int i, int i2, int i3, int i4) {
        return ((i * i2) / i3) + i4;
    }

    /* renamed from: I */
    public static boolean m433I(Allocation allocation, Element element) {
        return allocation.getType().getElement().isCompatible(element);
    }

    /* renamed from: J */
    public static boolean m434J(C6700b.C6702b bVar, int i, String str) {
        Boolean f = bVar.mo23840d(i);
        C6888i.m12437d(f, str);
        return f.booleanValue();
    }

    /* renamed from: K */
    public static Analytics m435K(String str, String str2) {
        C6888i.m12438e(str, str2);
        return Analytics.with(C0849e.m505a());
    }

    /* renamed from: L */
    public static Properties m436L(String str, String str2, String str3, String str4, String str5, String str6) {
        String uuid = UUID.randomUUID().toString();
        C6888i.m12437d(uuid, str);
        return C0688a.m184b(str2, uuid).putValue(str3, (Object) str4).putValue(str5, (Object) str6);
    }

    /* renamed from: M */
    public static Object m437M(List list, int i) {
        return list.get(list.size() - i);
    }

    /* renamed from: N */
    public static String m438N(int i, String str, int i2) {
        StringBuilder sb = new StringBuilder(i);
        sb.append(str);
        sb.append(i2);
        return sb.toString();
    }

    /* renamed from: O */
    public static String m439O(int i, String str, int i2, String str2, int i3) {
        StringBuilder sb = new StringBuilder(i);
        sb.append(str);
        sb.append(i2);
        sb.append(str2);
        sb.append(i3);
        return sb.toString();
    }

    /* renamed from: a */
    public static float m440a(float f, float f2, float f3, float f4) {
        return ((f - f2) * f3) + f4;
    }

    /* renamed from: b */
    public static int m441b(int i, int i2, int i3, int i4) {
        return i + i2 + i3 + i4;
    }

    /* renamed from: c */
    public static String m442c(JsonReader jsonReader) {
        String nextName = jsonReader.nextName();
        nextName.hashCode();
        return nextName;
    }

    /* renamed from: d */
    public static String m443d(RecyclerView recyclerView, StringBuilder sb) {
        sb.append(recyclerView.exceptionLabel());
        return sb.toString();
    }

    /* renamed from: e */
    public static String m444e(String str, int i) {
        return str + i;
    }

    /* renamed from: f */
    public static String m445f(String str, int i, String str2) {
        return str + i + str2;
    }

    /* renamed from: g */
    public static String m446g(String str, int i, String str2, int i2) {
        return str + i + str2 + i2;
    }

    /* renamed from: h */
    public static String m447h(String str, int i, String str2, int i2, String str3) {
        return str + i + str2 + i2 + str3;
    }

    /* renamed from: i */
    public static String m448i(String str, long j) {
        return str + j;
    }

    /* renamed from: j */
    public static String m449j(String str, Uri uri) {
        return str + uri;
    }

    /* renamed from: k */
    public static String m450k(String str, Fragment fragment, String str2) {
        return str + fragment + str2;
    }

    /* renamed from: l */
    public static String m451l(String str, String str2) {
        return str + str2;
    }

    /* renamed from: m */
    public static String m452m(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    /* renamed from: n */
    public static String m453n(StringBuilder sb, int i, String str) {
        sb.append(i);
        sb.append(str);
        return sb.toString();
    }

    /* renamed from: o */
    public static String m454o(StringBuilder sb, String str, char c) {
        sb.append(str);
        sb.append(c);
        return sb.toString();
    }

    /* renamed from: p */
    public static String m455p(StringBuilder sb, String str, String str2) {
        sb.append(str);
        sb.append(str2);
        return sb.toString();
    }

    /* renamed from: q */
    public static String m456q(StringBuilder sb, String str, String str2, String str3) {
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
        return sb.toString();
    }

    /* renamed from: r */
    public static String m457r(C7535i iVar, StringBuilder sb) {
        sb.append(C6902w.m12460a(iVar.getClass()));
        return sb.toString();
    }

    /* renamed from: s */
    public static String m458s(C7538l lVar, StringBuilder sb) {
        sb.append(C6902w.m12460a(lVar.getClass()));
        return sb.toString();
    }

    /* renamed from: t */
    public static StringBuilder m459t(char c) {
        StringBuilder sb = new StringBuilder();
        sb.append(c);
        return sb;
    }

    /* renamed from: u */
    public static StringBuilder m460u(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        return sb;
    }

    /* renamed from: v */
    public static StringBuilder m461v(String str, int i, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(i);
        sb.append(str2);
        return sb;
    }

    /* renamed from: w */
    public static int m462w(int i, int i2, int i3, int i4) {
        return ((i - i2) * i3) + i4;
    }

    /* renamed from: x */
    public static StringBuilder m463x(String str, int i, String str2, int i2, String str3) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(i);
        sb.append(str2);
        sb.append(i2);
        sb.append(str3);
        return sb;
    }

    /* renamed from: y */
    public static StringBuilder m464y(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(str2);
        return sb;
    }

    /* renamed from: z */
    public static StringBuilder m465z(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
        return sb;
    }
}
