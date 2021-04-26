package p005b.p080i.p081a;

import android.graphics.Matrix;
import android.util.Log;
import androidx.core.internal.view.SupportMenu;
import androidx.core.view.InputDeviceCompat;
import androidx.core.view.ViewCompat;
import com.appfoundry.previewer.constants.AnimationStrength;
import com.segment.analytics.AnalyticsContext;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.zip.GZIPInputStream;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.Attributes;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.ext.DefaultHandler2;
import org.xmlpull.v1.XmlPullParser;
import p005b.p035e.p036a.p037a.C0843a;
import p005b.p080i.p081a.C1394b;
import p005b.p080i.p081a.C1419e;
import p005b.p080i.p081a.C1422f;

/* renamed from: b.i.a.i */
public class C1502i {

    /* renamed from: a */
    public C1422f f2171a = null;

    /* renamed from: b */
    public C1422f.C1454i0 f2172b = null;

    /* renamed from: c */
    public boolean f2173c = false;

    /* renamed from: d */
    public int f2174d;

    /* renamed from: e */
    public boolean f2175e = false;

    /* renamed from: f */
    public C1510h f2176f = null;

    /* renamed from: g */
    public StringBuilder f2177g = null;

    /* renamed from: h */
    public boolean f2178h = false;

    /* renamed from: i */
    public StringBuilder f2179i = null;

    /* renamed from: b.i.a.i$b */
    public static class C1504b {

        /* renamed from: a */
        public static final Map<String, C1419e.C1420a> f2180a;

        static {
            HashMap hashMap = new HashMap(10);
            f2180a = hashMap;
            hashMap.put("none", C1419e.C1420a.none);
            hashMap.put("xMinYMin", C1419e.C1420a.xMinYMin);
            hashMap.put("xMidYMin", C1419e.C1420a.xMidYMin);
            hashMap.put("xMaxYMin", C1419e.C1420a.xMaxYMin);
            hashMap.put("xMinYMid", C1419e.C1420a.xMinYMid);
            hashMap.put("xMidYMid", C1419e.C1420a.xMidYMid);
            hashMap.put("xMaxYMid", C1419e.C1420a.xMaxYMid);
            hashMap.put("xMinYMax", C1419e.C1420a.xMinYMax);
            hashMap.put("xMidYMax", C1419e.C1420a.xMidYMax);
            hashMap.put("xMaxYMax", C1419e.C1420a.xMaxYMax);
        }
    }

    /* renamed from: b.i.a.i$c */
    public static class C1505c {

        /* renamed from: a */
        public static final Map<String, Integer> f2181a;

        static {
            HashMap hashMap = new HashMap(47);
            f2181a = hashMap;
            hashMap.put("aliceblue", -984833);
            hashMap.put("antiquewhite", -332841);
            hashMap.put("aqua", -16711681);
            HashMap hashMap2 = hashMap;
            C0843a.m428D(-8388652, hashMap2, "aquamarine", -983041, "azure", -657956, "beige", -6972, "bisque");
            C0843a.m428D(ViewCompat.MEASURED_STATE_MASK, hashMap2, "black", -5171, "blanchedalmond", -16776961, "blue", -7722014, "blueviolet");
            C0843a.m428D(-5952982, hashMap2, "brown", -2180985, "burlywood", -10510688, "cadetblue", -8388864, "chartreuse");
            C0843a.m428D(-2987746, hashMap2, "chocolate", -32944, "coral", -10185235, "cornflowerblue", -1828, "cornsilk");
            hashMap.put("crimson", -2354116);
            hashMap.put("cyan", -16711681);
            hashMap.put("darkblue", -16777077);
            hashMap.put("darkcyan", -16741493);
            hashMap.put("darkgoldenrod", -4684277);
            hashMap.put("darkgray", -5658199);
            hashMap.put("darkgreen", -16751616);
            hashMap.put("darkgrey", -5658199);
            hashMap.put("darkkhaki", -4343957);
            HashMap hashMap3 = hashMap;
            C0843a.m428D(-7667573, hashMap3, "darkmagenta", -11179217, "darkolivegreen", -29696, "darkorange", -6737204, "darkorchid");
            C0843a.m428D(-7667712, hashMap3, "darkred", -1468806, "darksalmon", -7357297, "darkseagreen", -12042869, "darkslateblue");
            hashMap.put("darkslategray", -13676721);
            hashMap.put("darkslategrey", -13676721);
            hashMap.put("darkturquoise", -16724271);
            hashMap.put("darkviolet", -7077677);
            hashMap.put("deeppink", -60269);
            hashMap.put("deepskyblue", -16728065);
            hashMap.put("dimgray", -9868951);
            hashMap.put("dimgrey", -9868951);
            C0843a.m428D(-14774017, hashMap, "dodgerblue", -5103070, "firebrick", -1296, "floralwhite", -14513374, "forestgreen");
            hashMap.put("fuchsia", -65281);
            hashMap.put("gainsboro", -2302756);
            hashMap.put("ghostwhite", -460545);
            hashMap.put("gold", -10496);
            hashMap.put("goldenrod", -2448096);
            hashMap.put("gray", -8355712);
            hashMap.put("green", -16744448);
            hashMap.put("greenyellow", -5374161);
            hashMap.put("grey", -8355712);
            HashMap hashMap4 = hashMap;
            C0843a.m428D(-983056, hashMap4, "honeydew", -38476, "hotpink", -3318692, "indianred", -11861886, "indigo");
            C0843a.m428D(-16, hashMap4, "ivory", -989556, "khaki", -1644806, "lavender", -3851, "lavenderblush");
            C0843a.m428D(-8586240, hashMap4, "lawngreen", -1331, "lemonchiffon", -5383962, "lightblue", -1015680, "lightcoral");
            hashMap.put("lightcyan", -2031617);
            hashMap.put("lightgoldenrodyellow", -329006);
            hashMap.put("lightgray", -2894893);
            hashMap.put("lightgreen", -7278960);
            hashMap.put("lightgrey", -2894893);
            hashMap.put("lightpink", -18751);
            hashMap.put("lightsalmon", -24454);
            hashMap.put("lightseagreen", -14634326);
            hashMap.put("lightskyblue", -7876870);
            hashMap.put("lightslategray", -8943463);
            hashMap.put("lightslategrey", -8943463);
            hashMap.put("lightsteelblue", -5192482);
            hashMap.put("lightyellow", -32);
            hashMap.put("lime", -16711936);
            hashMap.put("limegreen", -13447886);
            hashMap.put("linen", -331546);
            hashMap.put("magenta", -65281);
            hashMap.put("maroon", -8388608);
            hashMap.put("mediumaquamarine", -10039894);
            HashMap hashMap5 = hashMap;
            C0843a.m428D(-16777011, hashMap5, "mediumblue", -4565549, "mediumorchid", -7114533, "mediumpurple", -12799119, "mediumseagreen");
            C0843a.m428D(-8689426, hashMap5, "mediumslateblue", -16713062, "mediumspringgreen", -12004916, "mediumturquoise", -3730043, "mediumvioletred");
            C0843a.m428D(-15132304, hashMap5, "midnightblue", -655366, "mintcream", -6943, "mistyrose", -6987, "moccasin");
            C0843a.m428D(-8531, hashMap5, "navajowhite", -16777088, "navy", -133658, "oldlace", -8355840, "olive");
            C0843a.m428D(-9728477, hashMap5, "olivedrab", -23296, "orange", -47872, "orangered", -2461482, "orchid");
            C0843a.m428D(-1120086, hashMap5, "palegoldenrod", -6751336, "palegreen", -5247250, "paleturquoise", -2396013, "palevioletred");
            C0843a.m428D(-4139, hashMap5, "papayawhip", -9543, "peachpuff", -3308225, "peru", -16181, "pink");
            C0843a.m428D(-2252579, hashMap5, "plum", -5185306, "powderblue", -8388480, "purple", -10079335, "rebeccapurple");
            C0843a.m428D(SupportMenu.CATEGORY_MASK, hashMap5, "red", -4419697, "rosybrown", -12490271, "royalblue", -7650029, "saddlebrown");
            C0843a.m428D(-360334, hashMap5, "salmon", -744352, "sandybrown", -13726889, "seagreen", -2578, "seashell");
            C0843a.m428D(-6270419, hashMap5, "sienna", -4144960, "silver", -7876885, "skyblue", -9807155, "slateblue");
            hashMap.put("slategray", -9404272);
            hashMap.put("slategrey", -9404272);
            hashMap.put("snow", -1286);
            hashMap.put("springgreen", -16711809);
            HashMap hashMap6 = hashMap;
            C0843a.m428D(-12156236, hashMap6, "steelblue", -2968436, "tan", -16744320, "teal", -2572328, "thistle");
            C0843a.m428D(-40121, hashMap6, "tomato", -12525360, "turquoise", -1146130, "violet", -663885, "wheat");
            C0843a.m428D(-1, hashMap6, "white", -657931, "whitesmoke", InputDeviceCompat.SOURCE_ANY, "yellow", -6632142, "yellowgreen");
            hashMap.put("transparent", 0);
        }
    }

    /* renamed from: b.i.a.i$d */
    public static class C1506d {

        /* renamed from: a */
        public static final Map<String, C1422f.C1465o> f2182a;

        static {
            HashMap hashMap = new HashMap(9);
            f2182a = hashMap;
            C1422f.C1431c1 c1Var = C1422f.C1431c1.pt;
            hashMap.put("xx-small", new C1422f.C1465o(0.694f, c1Var));
            hashMap.put("x-small", new C1422f.C1465o(0.833f, c1Var));
            hashMap.put("small", new C1422f.C1465o(10.0f, c1Var));
            hashMap.put(AnimationStrength.MEDIUM, new C1422f.C1465o(12.0f, c1Var));
            hashMap.put("large", new C1422f.C1465o(14.4f, c1Var));
            hashMap.put("x-large", new C1422f.C1465o(17.3f, c1Var));
            hashMap.put("xx-large", new C1422f.C1465o(20.7f, c1Var));
            C1422f.C1431c1 c1Var2 = C1422f.C1431c1.percent;
            hashMap.put("smaller", new C1422f.C1465o(83.33f, c1Var2));
            hashMap.put("larger", new C1422f.C1465o(120.0f, c1Var2));
        }
    }

    /* renamed from: b.i.a.i$e */
    public static class C1507e {

        /* renamed from: a */
        public static final Map<String, Integer> f2183a;

        static {
            HashMap hashMap = new HashMap(13);
            f2183a = hashMap;
            hashMap.put("normal", 400);
            hashMap.put("bold", 700);
            C0843a.m428D(1, hashMap, "bolder", -1, "lighter", 100, "100", 200, "200");
            hashMap.put("300", 300);
            hashMap.put("400", 400);
            hashMap.put("500", 500);
            hashMap.put("600", 600);
            hashMap.put("700", 700);
            hashMap.put("800", 800);
            hashMap.put("900", 900);
        }
    }

    /* renamed from: b.i.a.i$f */
    public class C1508f extends DefaultHandler2 {
        public C1508f(C1503a aVar) {
        }

        public void characters(char[] cArr, int i, int i2) {
            C1502i.this.mo11404N(new String(cArr, i, i2));
        }

        public void endDocument() {
            Objects.requireNonNull(C1502i.this);
        }

        public void endElement(String str, String str2, String str3) {
            C1502i.this.mo11408c(str, str2, str3);
        }

        public void processingInstruction(String str, String str2) {
            C1502i.this.mo11397F(new C1511i(str2));
            Objects.requireNonNull(C1502i.this);
            str.equals("xml-stylesheet");
        }

        public void startDocument() {
            C1502i iVar = C1502i.this;
            Objects.requireNonNull(iVar);
            iVar.f2171a = new C1422f();
        }

        public void startElement(String str, String str2, String str3, Attributes attributes) {
            C1502i.this.mo11402L(str, str2, str3, attributes);
        }
    }

    /* renamed from: b.i.a.i$g */
    public enum C1509g {
        CLASS,
        clip,
        clip_path,
        clipPathUnits,
        clip_rule,
        color,
        cx,
        cy,
        direction,
        dx,
        dy,
        fx,
        fy,
        d,
        display,
        fill,
        fill_rule,
        fill_opacity,
        font,
        font_family,
        font_size,
        f2187B,
        font_style,
        gradientTransform,
        gradientUnits,
        height,
        href,
        image_rendering,
        marker,
        marker_start,
        marker_mid,
        marker_end,
        markerHeight,
        markerUnits,
        markerWidth,
        mask,
        maskContentUnits,
        maskUnits,
        media,
        offset,
        opacity,
        orient,
        overflow,
        pathLength,
        patternContentUnits,
        patternTransform,
        patternUnits,
        points,
        preserveAspectRatio,
        r,
        refX,
        refY,
        requiredFeatures,
        requiredExtensions,
        requiredFormats,
        requiredFonts,
        rx,
        ry,
        solid_color,
        solid_opacity,
        spreadMethod,
        startOffset,
        stop_color,
        stop_opacity,
        stroke,
        stroke_dasharray,
        stroke_dashoffset,
        stroke_linecap,
        stroke_linejoin,
        stroke_miterlimit,
        stroke_opacity,
        stroke_width,
        style,
        systemLanguage,
        text_anchor,
        text_decoration,
        transform,
        type,
        vector_effect,
        version,
        viewBox,
        width,
        x,
        y,
        x1,
        y1,
        x2,
        y2,
        viewport_fill,
        viewport_fill_opacity,
        visibility,
        UNSUPPORTED;
        

        /* renamed from: U0 */
        public static final Map<String, C1509g> f2226U0 = null;

        /* access modifiers changed from: public */
        static {
            f2226U0 = new HashMap();
            C1509g[] values = values();
            for (int i = 0; i < 92; i++) {
                C1509g gVar = values[i];
                if (gVar == CLASS) {
                    f2226U0.put("class", gVar);
                } else if (gVar != UNSUPPORTED) {
                    f2226U0.put(gVar.name().replace('_', '-'), gVar);
                }
            }
        }

        /* renamed from: d */
        public static C1509g m1743d(String str) {
            C1509g gVar = f2226U0.get(str);
            return gVar != null ? gVar : UNSUPPORTED;
        }
    }

    /* renamed from: b.i.a.i$h */
    public enum C1510h {
        svg,
        a,
        circle,
        clipPath,
        defs,
        desc,
        ellipse,
        g,
        image,
        line,
        linearGradient,
        marker,
        mask,
        path,
        pattern,
        polygon,
        polyline,
        radialGradient,
        rect,
        solidColor,
        stop,
        style,
        SWITCH,
        symbol,
        f2283E,
        textPath,
        title,
        tref,
        tspan,
        use,
        view,
        UNSUPPORTED;
        

        /* renamed from: M */
        public static final Map<String, C1510h> f2291M = null;

        /* access modifiers changed from: public */
        static {
            f2291M = new HashMap();
            C1510h[] values = values();
            for (int i = 0; i < 32; i++) {
                C1510h hVar = values[i];
                if (hVar == SWITCH) {
                    f2291M.put("switch", hVar);
                } else if (hVar != UNSUPPORTED) {
                    f2291M.put(hVar.name(), hVar);
                }
            }
        }
    }

    /* renamed from: b.i.a.i$i */
    public static class C1511i {

        /* renamed from: a */
        public String f2313a;

        /* renamed from: b */
        public int f2314b = 0;

        /* renamed from: c */
        public int f2315c = 0;

        /* renamed from: d */
        public C1418d f2316d = new C1418d();

        public C1511i(String str) {
            String trim = str.trim();
            this.f2313a = trim;
            this.f2315c = trim.length();
        }

        /* renamed from: a */
        public int mo11427a() {
            int i = this.f2314b;
            int i2 = this.f2315c;
            if (i == i2) {
                return -1;
            }
            int i3 = i + 1;
            this.f2314b = i3;
            if (i3 < i2) {
                return this.f2313a.charAt(i3);
            }
            return -1;
        }

        /* renamed from: b */
        public Boolean mo11428b(Object obj) {
            if (obj == null) {
                return null;
            }
            mo11443q();
            int i = this.f2314b;
            if (i == this.f2315c) {
                return null;
            }
            char charAt = this.f2313a.charAt(i);
            if (charAt != '0' && charAt != '1') {
                return null;
            }
            boolean z = true;
            this.f2314b++;
            if (charAt != '1') {
                z = false;
            }
            return Boolean.valueOf(z);
        }

        /* renamed from: c */
        public float mo11429c(float f) {
            if (Float.isNaN(f)) {
                return Float.NaN;
            }
            mo11443q();
            return mo11435i();
        }

        /* renamed from: d */
        public boolean mo11430d(char c) {
            int i = this.f2314b;
            boolean z = i < this.f2315c && this.f2313a.charAt(i) == c;
            if (z) {
                this.f2314b++;
            }
            return z;
        }

        /* renamed from: e */
        public boolean mo11431e(String str) {
            int length = str.length();
            int i = this.f2314b;
            boolean z = i <= this.f2315c - length && this.f2313a.substring(i, i + length).equals(str);
            if (z) {
                this.f2314b += length;
            }
            return z;
        }

        /* renamed from: f */
        public boolean mo11432f() {
            return this.f2314b == this.f2315c;
        }

        /* renamed from: g */
        public boolean mo11433g(int i) {
            return i == 32 || i == 10 || i == 13 || i == 9;
        }

        /* renamed from: h */
        public Integer mo11434h() {
            int i = this.f2314b;
            if (i == this.f2315c) {
                return null;
            }
            String str = this.f2313a;
            this.f2314b = i + 1;
            return Integer.valueOf(str.charAt(i));
        }

        /* renamed from: i */
        public float mo11435i() {
            float a = this.f2316d.mo11292a(this.f2313a, this.f2314b, this.f2315c);
            if (!Float.isNaN(a)) {
                this.f2314b = this.f2316d.f1891a;
            }
            return a;
        }

        /* renamed from: j */
        public C1422f.C1465o mo11436j() {
            float i = mo11435i();
            if (Float.isNaN(i)) {
                return null;
            }
            C1422f.C1431c1 o = mo11441o();
            return o == null ? new C1422f.C1465o(i, C1422f.C1431c1.px) : new C1422f.C1465o(i, o);
        }

        /* renamed from: k */
        public String mo11437k() {
            int a;
            if (mo11432f()) {
                return null;
            }
            int i = this.f2314b;
            char charAt = this.f2313a.charAt(i);
            if (charAt != '\'' && charAt != '\"') {
                return null;
            }
            do {
                a = mo11427a();
                if (a == -1) {
                    break;
                }
            } while (a != charAt);
            if (a == -1) {
                this.f2314b = i;
                return null;
            }
            int i2 = this.f2314b + 1;
            this.f2314b = i2;
            return this.f2313a.substring(i + 1, i2 - 1);
        }

        /* renamed from: l */
        public String mo11438l() {
            return mo11440n(' ', false);
        }

        /* renamed from: m */
        public String mo11439m(char c) {
            return mo11440n(c, false);
        }

        /* renamed from: n */
        public String mo11440n(char c, boolean z) {
            if (mo11432f()) {
                return null;
            }
            char charAt = this.f2313a.charAt(this.f2314b);
            if ((!z && mo11433g(charAt)) || charAt == c) {
                return null;
            }
            int i = this.f2314b;
            while (true) {
                int a = mo11427a();
                if (a == -1 || a == c || (!z && mo11433g(a))) {
                }
            }
            return this.f2313a.substring(i, this.f2314b);
        }

        /* renamed from: o */
        public C1422f.C1431c1 mo11441o() {
            if (mo11432f()) {
                return null;
            }
            if (this.f2313a.charAt(this.f2314b) == '%') {
                this.f2314b++;
                return C1422f.C1431c1.percent;
            }
            int i = this.f2314b;
            if (i > this.f2315c - 2) {
                return null;
            }
            try {
                C1422f.C1431c1 valueOf = C1422f.C1431c1.valueOf(this.f2313a.substring(i, i + 2).toLowerCase(Locale.US));
                this.f2314b += 2;
                return valueOf;
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }

        /* renamed from: p */
        public float mo11442p() {
            mo11443q();
            float a = this.f2316d.mo11292a(this.f2313a, this.f2314b, this.f2315c);
            if (!Float.isNaN(a)) {
                this.f2314b = this.f2316d.f1891a;
            }
            return a;
        }

        /* renamed from: q */
        public boolean mo11443q() {
            mo11444r();
            int i = this.f2314b;
            if (i == this.f2315c || this.f2313a.charAt(i) != ',') {
                return false;
            }
            this.f2314b++;
            mo11444r();
            return true;
        }

        /* renamed from: r */
        public void mo11444r() {
            while (true) {
                int i = this.f2314b;
                if (i < this.f2315c && mo11433g(this.f2313a.charAt(i))) {
                    this.f2314b++;
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: b.i.a.i$j */
    public class C1512j implements Attributes {

        /* renamed from: a */
        public XmlPullParser f2317a;

        public C1512j(C1502i iVar, XmlPullParser xmlPullParser) {
            this.f2317a = xmlPullParser;
        }

        public int getIndex(String str) {
            return -1;
        }

        public int getIndex(String str, String str2) {
            return -1;
        }

        public int getLength() {
            return this.f2317a.getAttributeCount();
        }

        public String getLocalName(int i) {
            return this.f2317a.getAttributeName(i);
        }

        public String getQName(int i) {
            String attributeName = this.f2317a.getAttributeName(i);
            if (this.f2317a.getAttributePrefix(i) == null) {
                return attributeName;
            }
            return this.f2317a.getAttributePrefix(i) + ':' + attributeName;
        }

        public String getType(int i) {
            return null;
        }

        public String getType(String str) {
            return null;
        }

        public String getType(String str, String str2) {
            return null;
        }

        public String getURI(int i) {
            return this.f2317a.getAttributeNamespace(i);
        }

        public String getValue(int i) {
            return this.f2317a.getAttributeValue(i);
        }

        public String getValue(String str) {
            return null;
        }

        public String getValue(String str, String str2) {
            return null;
        }
    }

    /* renamed from: A */
    public static List<C1422f.C1465o> m1701A(String str) {
        if (str.length() != 0) {
            ArrayList arrayList = new ArrayList(1);
            C1511i iVar = new C1511i(str);
            iVar.mo11444r();
            while (!iVar.mo11432f()) {
                float i = iVar.mo11435i();
                if (Float.isNaN(i)) {
                    StringBuilder u = C0843a.m460u("Invalid length list value: ");
                    int i2 = iVar.f2314b;
                    while (!iVar.mo11432f() && !iVar.mo11433g(iVar.f2313a.charAt(iVar.f2314b))) {
                        iVar.f2314b++;
                    }
                    String substring = iVar.f2313a.substring(i2, iVar.f2314b);
                    iVar.f2314b = i2;
                    u.append(substring);
                    throw new C1501h(u.toString());
                }
                C1422f.C1431c1 o = iVar.mo11441o();
                if (o == null) {
                    o = C1422f.C1431c1.px;
                }
                arrayList.add(new C1422f.C1465o(i, o));
                iVar.mo11443q();
            }
            return arrayList;
        }
        throw new C1501h("Invalid length list (empty string)");
    }

    /* renamed from: B */
    public static C1422f.C1465o m1702B(C1511i iVar) {
        return iVar.mo11431e("auto") ? new C1422f.C1465o(0.0f) : iVar.mo11436j();
    }

    /* renamed from: C */
    public static Float m1703C(String str) {
        try {
            float u = m1713u(str);
            if (u < 0.0f) {
                u = 0.0f;
            } else if (u > 1.0f) {
                u = 1.0f;
            }
            return Float.valueOf(u);
        } catch (C1501h unused) {
            return null;
        }
    }

    /* renamed from: D */
    public static C1422f.C1464n0 m1704D(String str) {
        if (!str.startsWith("url(")) {
            return m1711s(str);
        }
        int indexOf = str.indexOf(")");
        C1422f.C1464n0 n0Var = null;
        if (indexOf == -1) {
            return new C1422f.C1475t(str.substring(4).trim(), (C1422f.C1464n0) null);
        }
        String trim = str.substring(4, indexOf).trim();
        String trim2 = str.substring(indexOf + 1).trim();
        if (trim2.length() > 0) {
            n0Var = m1711s(trim2);
        }
        return new C1422f.C1475t(trim, n0Var);
    }

    /* renamed from: E */
    public static void m1705E(C1422f.C1466o0 o0Var, String str) {
        C1511i iVar = new C1511i(str);
        iVar.mo11444r();
        String l = iVar.mo11438l();
        if ("defer".equals(l)) {
            iVar.mo11444r();
            l = iVar.mo11438l();
        }
        C1419e.C1420a aVar = C1504b.f2180a.get(l);
        C1419e.C1421b bVar = null;
        iVar.mo11444r();
        if (!iVar.mo11432f()) {
            String l2 = iVar.mo11438l();
            l2.hashCode();
            if (l2.equals("meet")) {
                bVar = C1419e.C1421b.meet;
            } else if (l2.equals("slice")) {
                bVar = C1419e.C1421b.slice;
            } else {
                throw new C1501h(C0843a.m451l("Invalid preserveAspectRatio definition: ", str));
            }
        }
        o0Var.f2075n = new C1419e(aVar, bVar);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: b.i.a.f$b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: b.i.a.f$d0$h} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: java.lang.Boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v9, resolved type: b.i.a.f$d0$i} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v12, resolved type: b.i.a.f$d0$f} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v16, resolved type: b.i.a.f$d0$g} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v22, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v25, resolved type: b.i.a.f$o} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v27, resolved type: b.i.a.f$d0$e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v31, resolved type: b.i.a.f$o[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v34, resolved type: b.i.a.f$d0$c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v38, resolved type: b.i.a.f$d0$d} */
    /* JADX WARNING: type inference failed for: r1v0 */
    /* JADX WARNING: type inference failed for: r1v26 */
    /* JADX WARNING: type inference failed for: r1v42 */
    /* JADX WARNING: type inference failed for: r1v43 */
    /* JADX WARNING: type inference failed for: r1v44 */
    /* JADX WARNING: type inference failed for: r1v45 */
    /* JADX WARNING: type inference failed for: r1v46 */
    /* JADX WARNING: type inference failed for: r1v47 */
    /* JADX WARNING: type inference failed for: r1v48 */
    /* JADX WARNING: type inference failed for: r1v49 */
    /* JADX WARNING: type inference failed for: r1v50 */
    /* JADX WARNING: type inference failed for: r1v51 */
    /* JADX WARNING: type inference failed for: r1v52 */
    /* JADX WARNING: type inference failed for: r1v53 */
    /* JADX WARNING: type inference failed for: r1v54 */
    /* JADX WARNING: type inference failed for: r1v55 */
    /* JADX WARNING: type inference failed for: r1v56 */
    /* JADX WARNING: type inference failed for: r1v57 */
    /* JADX WARNING: type inference failed for: r1v58 */
    /* JADX WARNING: type inference failed for: r1v59 */
    /* JADX WARNING: type inference failed for: r1v60 */
    /* JADX WARNING: type inference failed for: r1v61 */
    /* JADX WARNING: type inference failed for: r1v62 */
    /* JADX WARNING: type inference failed for: r1v63 */
    /* JADX WARNING: type inference failed for: r1v64 */
    /* JADX WARNING: type inference failed for: r1v65 */
    /* JADX WARNING: type inference failed for: r1v66 */
    /* JADX WARNING: type inference failed for: r1v67 */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x021d, code lost:
        if (r14.equals("auto") == false) goto L_0x020c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:228:0x03f2, code lost:
        if (r14.equals("underline") == false) goto L_0x03cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:248:0x0436, code lost:
        if (r14.equals("end") == false) goto L_0x0423;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:287:0x04d1, code lost:
        if (r14.equals("scroll") == false) goto L_0x04b7;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: J */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m1706J(p005b.p080i.p081a.C1422f.C1433d0 r12, java.lang.String r13, java.lang.String r14) {
        /*
            int r0 = r14.length()
            if (r0 != 0) goto L_0x0007
            return
        L_0x0007:
            java.lang.String r0 = "inherit"
            boolean r0 = r14.equals(r0)
            if (r0 == 0) goto L_0x0010
            return
        L_0x0010:
            b.i.a.i$g r13 = p005b.p080i.p081a.C1502i.C1509g.m1743d(r13)
            int r13 = r13.ordinal()
            r0 = 5
            r1 = 0
            java.lang.String r2 = "auto"
            r3 = 1
            if (r13 == r3) goto L_0x0555
            r4 = 2
            if (r13 == r4) goto L_0x0549
            r5 = 4
            if (r13 == r5) goto L_0x053d
            if (r13 == r0) goto L_0x052e
            r0 = 8
            if (r13 == r0) goto L_0x050b
            r0 = 35
            if (r13 == r0) goto L_0x04fe
            r0 = 40
            if (r13 == r0) goto L_0x04f2
            r0 = 42
            r6 = 3
            java.lang.String r7 = "visible"
            r8 = 0
            r9 = -1
            if (r13 == r0) goto L_0x04b0
            r0 = 78
            java.lang.String r10 = "none"
            if (r13 == r0) goto L_0x048f
            r0 = 58
            java.lang.String r11 = "currentColor"
            if (r13 == r0) goto L_0x0469
            r0 = 59
            if (r13 == r0) goto L_0x045a
            r0 = 74
            if (r13 == r0) goto L_0x041c
            r0 = 75
            if (r13 == r0) goto L_0x03c4
            r0 = 124(0x7c, float:1.74E-43)
            switch(r13) {
                case 14: goto L_0x0199;
                case 15: goto L_0x018b;
                case 16: goto L_0x017d;
                case 17: goto L_0x016f;
                case 18: goto L_0x00af;
                case 19: goto L_0x00a1;
                case 20: goto L_0x0088;
                case 21: goto L_0x0075;
                case 22: goto L_0x0066;
                default: goto L_0x0059;
            }
        L_0x0059:
            switch(r13) {
                case 27: goto L_0x0205;
                case 28: goto L_0x01f4;
                case 29: goto L_0x01e7;
                case 30: goto L_0x01da;
                case 31: goto L_0x01cd;
                default: goto L_0x005c;
            }
        L_0x005c:
            java.lang.String r2 = "round"
            switch(r13) {
                case 62: goto L_0x0350;
                case 63: goto L_0x0343;
                case 64: goto L_0x0335;
                case 65: goto L_0x02c9;
                case 66: goto L_0x02bd;
                case 67: goto L_0x0295;
                case 68: goto L_0x026d;
                case 69: goto L_0x025d;
                case 70: goto L_0x024f;
                case 71: goto L_0x0243;
                default: goto L_0x0061;
            }
        L_0x0061:
            switch(r13) {
                case 88: goto L_0x03aa;
                case 89: goto L_0x039b;
                case 90: goto L_0x0368;
                default: goto L_0x0064;
            }
        L_0x0064:
            goto L_0x05ad
        L_0x0066:
            b.i.a.f$d0$b r13 = m1716x(r14)
            r12.f1979x = r13
            if (r13 == 0) goto L_0x05ad
            long r13 = r12.f1962g
            r0 = 65536(0x10000, double:3.2379E-319)
            goto L_0x05aa
        L_0x0075:
            java.util.Map<java.lang.String, java.lang.Integer> r13 = p005b.p080i.p081a.C1502i.C1507e.f2183a
            java.lang.Object r13 = r13.get(r14)
            java.lang.Integer r13 = (java.lang.Integer) r13
            r12.f1978w = r13
            if (r13 == 0) goto L_0x05ad
            long r13 = r12.f1962g
            r0 = 32768(0x8000, double:1.61895E-319)
            goto L_0x05aa
        L_0x0088:
            java.util.Map<java.lang.String, b.i.a.f$o> r13 = p005b.p080i.p081a.C1502i.C1506d.f2182a     // Catch:{ h -> 0x0097 }
            java.lang.Object r13 = r13.get(r14)     // Catch:{ h -> 0x0097 }
            b.i.a.f$o r13 = (p005b.p080i.p081a.C1422f.C1465o) r13     // Catch:{ h -> 0x0097 }
            if (r13 != 0) goto L_0x0096
            b.i.a.f$o r13 = m1718z(r14)     // Catch:{ h -> 0x0097 }
        L_0x0096:
            r1 = r13
        L_0x0097:
            r12.f1977v = r1
            if (r1 == 0) goto L_0x05ad
            long r13 = r12.f1962g
            r0 = 16384(0x4000, double:8.0948E-320)
            goto L_0x05aa
        L_0x00a1:
            java.util.List r13 = m1715w(r14)
            r12.f1976u = r13
            if (r13 == 0) goto L_0x05ad
            long r13 = r12.f1962g
            r0 = 8192(0x2000, double:4.0474E-320)
            goto L_0x05aa
        L_0x00af:
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            r13.append(r0)
            r13.append(r14)
            r13.append(r0)
            java.lang.String r13 = r13.toString()
            java.lang.String r0 = "|caption|icon|menu|message-box|small-caption|status-bar|"
            boolean r13 = r0.contains(r13)
            if (r13 != 0) goto L_0x00cb
            goto L_0x05ad
        L_0x00cb:
            b.i.a.i$i r13 = new b.i.a.i$i
            r13.<init>(r14)
            r14 = r1
            r0 = r14
            r2 = r0
        L_0x00d3:
            r3 = 47
            java.lang.String r4 = r13.mo11439m(r3)
            r13.mo11444r()
            if (r4 != 0) goto L_0x00e0
            goto L_0x05ad
        L_0x00e0:
            if (r14 == 0) goto L_0x00e5
            if (r0 == 0) goto L_0x00e5
            goto L_0x0110
        L_0x00e5:
            java.lang.String r5 = "normal"
            boolean r5 = r4.equals(r5)
            if (r5 == 0) goto L_0x00ee
            goto L_0x00d3
        L_0x00ee:
            if (r14 != 0) goto L_0x00fb
            java.util.Map<java.lang.String, java.lang.Integer> r14 = p005b.p080i.p081a.C1502i.C1507e.f2183a
            java.lang.Object r14 = r14.get(r4)
            java.lang.Integer r14 = (java.lang.Integer) r14
            if (r14 == 0) goto L_0x00fb
            goto L_0x00d3
        L_0x00fb:
            if (r0 != 0) goto L_0x0104
            b.i.a.f$d0$b r0 = m1716x(r4)
            if (r0 == 0) goto L_0x0104
            goto L_0x00d3
        L_0x0104:
            if (r2 != 0) goto L_0x0110
            java.lang.String r2 = "small-caps"
            boolean r2 = r4.equals(r2)
            if (r2 == 0) goto L_0x0110
            r2 = r4
            goto L_0x00d3
        L_0x0110:
            java.util.Map<java.lang.String, b.i.a.f$o> r2 = p005b.p080i.p081a.C1502i.C1506d.f2182a     // Catch:{ h -> 0x011f }
            java.lang.Object r2 = r2.get(r4)     // Catch:{ h -> 0x011f }
            b.i.a.f$o r2 = (p005b.p080i.p081a.C1422f.C1465o) r2     // Catch:{ h -> 0x011f }
            if (r2 != 0) goto L_0x0120
            b.i.a.f$o r2 = m1718z(r4)     // Catch:{ h -> 0x011f }
            goto L_0x0120
        L_0x011f:
            r2 = r1
        L_0x0120:
            boolean r3 = r13.mo11430d(r3)
            if (r3 == 0) goto L_0x0135
            r13.mo11444r()
            java.lang.String r3 = r13.mo11438l()
            if (r3 == 0) goto L_0x0132
            m1718z(r3)     // Catch:{ h -> 0x05ad }
        L_0x0132:
            r13.mo11444r()
        L_0x0135:
            boolean r3 = r13.mo11432f()
            if (r3 == 0) goto L_0x013c
            goto L_0x0148
        L_0x013c:
            int r1 = r13.f2314b
            int r3 = r13.f2315c
            r13.f2314b = r3
            java.lang.String r13 = r13.f2313a
            java.lang.String r1 = r13.substring(r1)
        L_0x0148:
            java.util.List r13 = m1715w(r1)
            r12.f1976u = r13
            r12.f1977v = r2
            if (r14 != 0) goto L_0x0155
            r13 = 400(0x190, float:5.6E-43)
            goto L_0x0159
        L_0x0155:
            int r13 = r14.intValue()
        L_0x0159:
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            r12.f1978w = r13
            if (r0 != 0) goto L_0x0163
            b.i.a.f$d0$b r0 = p005b.p080i.p081a.C1422f.C1433d0.C1435b.Normal
        L_0x0163:
            r12.f1979x = r0
            long r13 = r12.f1962g
            r0 = 122880(0x1e000, double:6.0711E-319)
            long r13 = r13 | r0
            r12.f1962g = r13
            goto L_0x05ad
        L_0x016f:
            java.lang.Float r13 = m1703C(r14)
            r12.f1965j = r13
            if (r13 == 0) goto L_0x05ad
            long r13 = r12.f1962g
            r0 = 4
            goto L_0x05aa
        L_0x017d:
            b.i.a.f$d0$a r13 = m1712t(r14)
            r12.f1964i = r13
            if (r13 == 0) goto L_0x05ad
            long r13 = r12.f1962g
            r0 = 2
            goto L_0x05aa
        L_0x018b:
            b.i.a.f$n0 r13 = m1704D(r14)
            r12.f1963h = r13
            if (r13 == 0) goto L_0x05ad
            long r13 = r12.f1962g
            r0 = 1
            goto L_0x05aa
        L_0x0199:
            int r13 = r14.indexOf(r0)
            if (r13 >= 0) goto L_0x05ad
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            r13.append(r0)
            r13.append(r14)
            r13.append(r0)
            java.lang.String r13 = r13.toString()
            java.lang.String r0 = "|inline|block|list-item|run-in|compact|marker|table|inline-table|table-row-group|table-header-group|table-footer-group|table-row|table-column-group|table-column|table-cell|table-caption|none|"
            boolean r13 = r0.contains(r13)
            if (r13 != 0) goto L_0x01bb
            goto L_0x05ad
        L_0x01bb:
            boolean r13 = r14.equals(r10)
            r13 = r13 ^ r3
            java.lang.Boolean r13 = java.lang.Boolean.valueOf(r13)
            r12.f1949G = r13
            long r13 = r12.f1962g
            r0 = 16777216(0x1000000, double:8.289046E-317)
            goto L_0x05aa
        L_0x01cd:
            java.lang.String r13 = m1717y(r14)
            r12.f1948F = r13
            long r13 = r12.f1962g
            r0 = 8388608(0x800000, double:4.144523E-317)
            goto L_0x05aa
        L_0x01da:
            java.lang.String r13 = m1717y(r14)
            r12.f1947E = r13
            long r13 = r12.f1962g
            r0 = 4194304(0x400000, double:2.0722615E-317)
            goto L_0x05aa
        L_0x01e7:
            java.lang.String r13 = m1717y(r14)
            r12.f1946D = r13
            long r13 = r12.f1962g
            r0 = 2097152(0x200000, double:1.0361308E-317)
            goto L_0x05aa
        L_0x01f4:
            java.lang.String r13 = m1717y(r14)
            r12.f1946D = r13
            r12.f1947E = r13
            r12.f1948F = r13
            long r13 = r12.f1962g
            r0 = 14680064(0xe00000, double:7.2529153E-317)
            goto L_0x05aa
        L_0x0205:
            int r13 = r14.hashCode()
            switch(r13) {
                case -933002398: goto L_0x0220;
                case 3005871: goto L_0x0219;
                case 362741610: goto L_0x020e;
                default: goto L_0x020c;
            }
        L_0x020c:
            r3 = r9
            goto L_0x022a
        L_0x020e:
            java.lang.String r13 = "optimizeSpeed"
            boolean r13 = r14.equals(r13)
            if (r13 != 0) goto L_0x0217
            goto L_0x020c
        L_0x0217:
            r3 = r4
            goto L_0x022a
        L_0x0219:
            boolean r13 = r14.equals(r2)
            if (r13 != 0) goto L_0x022a
            goto L_0x020c
        L_0x0220:
            java.lang.String r13 = "optimizeQuality"
            boolean r13 = r14.equals(r13)
            if (r13 != 0) goto L_0x0229
            goto L_0x020c
        L_0x0229:
            r3 = r8
        L_0x022a:
            switch(r3) {
                case 0: goto L_0x0234;
                case 1: goto L_0x0231;
                case 2: goto L_0x022e;
                default: goto L_0x022d;
            }
        L_0x022d:
            goto L_0x0236
        L_0x022e:
            b.i.a.f$d0$e r1 = p005b.p080i.p081a.C1422f.C1433d0.C1438e.optimizeSpeed
            goto L_0x0236
        L_0x0231:
            b.i.a.f$d0$e r1 = p005b.p080i.p081a.C1422f.C1433d0.C1438e.auto
            goto L_0x0236
        L_0x0234:
            b.i.a.f$d0$e r1 = p005b.p080i.p081a.C1422f.C1433d0.C1438e.optimizeQuality
        L_0x0236:
            r12.f1961S = r1
            if (r1 == 0) goto L_0x05ad
            long r13 = r12.f1962g
            r0 = 137438953472(0x2000000000, double:6.7903865311E-313)
            goto L_0x05aa
        L_0x0243:
            b.i.a.f$o r13 = m1718z(r14)     // Catch:{ h -> 0x05ad }
            r12.f1968m = r13     // Catch:{ h -> 0x05ad }
            long r13 = r12.f1962g     // Catch:{ h -> 0x05ad }
            r0 = 32
            goto L_0x0538
        L_0x024f:
            java.lang.Float r13 = m1703C(r14)
            r12.f1967l = r13
            if (r13 == 0) goto L_0x05ad
            long r13 = r12.f1962g
            r0 = 16
            goto L_0x05aa
        L_0x025d:
            float r13 = m1713u(r14)     // Catch:{ h -> 0x05ad }
            java.lang.Float r13 = java.lang.Float.valueOf(r13)     // Catch:{ h -> 0x05ad }
            r12.f1971p = r13     // Catch:{ h -> 0x05ad }
            long r13 = r12.f1962g     // Catch:{ h -> 0x05ad }
            r0 = 256(0x100, double:1.265E-321)
            goto L_0x0538
        L_0x026d:
            java.lang.String r13 = "miter"
            boolean r13 = r13.equals(r14)
            if (r13 == 0) goto L_0x0278
            b.i.a.f$d0$d r1 = p005b.p080i.p081a.C1422f.C1433d0.C1437d.Miter
            goto L_0x028b
        L_0x0278:
            boolean r13 = r2.equals(r14)
            if (r13 == 0) goto L_0x0281
            b.i.a.f$d0$d r1 = p005b.p080i.p081a.C1422f.C1433d0.C1437d.Round
            goto L_0x028b
        L_0x0281:
            java.lang.String r13 = "bevel"
            boolean r13 = r13.equals(r14)
            if (r13 == 0) goto L_0x028b
            b.i.a.f$d0$d r1 = p005b.p080i.p081a.C1422f.C1433d0.C1437d.Bevel
        L_0x028b:
            r12.f1970o = r1
            if (r1 == 0) goto L_0x05ad
            long r13 = r12.f1962g
            r0 = 128(0x80, double:6.32E-322)
            goto L_0x05aa
        L_0x0295:
            java.lang.String r13 = "butt"
            boolean r13 = r13.equals(r14)
            if (r13 == 0) goto L_0x02a0
            b.i.a.f$d0$c r1 = p005b.p080i.p081a.C1422f.C1433d0.C1436c.Butt
            goto L_0x02b3
        L_0x02a0:
            boolean r13 = r2.equals(r14)
            if (r13 == 0) goto L_0x02a9
            b.i.a.f$d0$c r1 = p005b.p080i.p081a.C1422f.C1433d0.C1436c.Round
            goto L_0x02b3
        L_0x02a9:
            java.lang.String r13 = "square"
            boolean r13 = r13.equals(r14)
            if (r13 == 0) goto L_0x02b3
            b.i.a.f$d0$c r1 = p005b.p080i.p081a.C1422f.C1433d0.C1436c.Square
        L_0x02b3:
            r12.f1969n = r1
            if (r1 == 0) goto L_0x05ad
            long r13 = r12.f1962g
            r0 = 64
            goto L_0x05aa
        L_0x02bd:
            b.i.a.f$o r13 = m1718z(r14)     // Catch:{ h -> 0x05ad }
            r12.f1973r = r13     // Catch:{ h -> 0x05ad }
            long r13 = r12.f1962g     // Catch:{ h -> 0x05ad }
            r0 = 1024(0x400, double:5.06E-321)
            goto L_0x0538
        L_0x02c9:
            boolean r13 = r10.equals(r14)
            r2 = 512(0x200, double:2.53E-321)
            if (r13 == 0) goto L_0x02d4
            r12.f1972q = r1
            goto L_0x0330
        L_0x02d4:
            b.i.a.i$i r13 = new b.i.a.i$i
            r13.<init>(r14)
            r13.mo11444r()
            boolean r14 = r13.mo11432f()
            if (r14 == 0) goto L_0x02e3
            goto L_0x032c
        L_0x02e3:
            b.i.a.f$o r14 = r13.mo11436j()
            if (r14 != 0) goto L_0x02ea
            goto L_0x032c
        L_0x02ea:
            boolean r0 = r14.mo11331g()
            if (r0 == 0) goto L_0x02f1
            goto L_0x032c
        L_0x02f1:
            float r0 = r14.f2073g
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r4.add(r14)
        L_0x02fb:
            boolean r14 = r13.mo11432f()
            if (r14 != 0) goto L_0x0319
            r13.mo11443q()
            b.i.a.f$o r14 = r13.mo11436j()
            if (r14 != 0) goto L_0x030b
            goto L_0x032c
        L_0x030b:
            boolean r5 = r14.mo11331g()
            if (r5 == 0) goto L_0x0312
            goto L_0x032c
        L_0x0312:
            r4.add(r14)
            float r14 = r14.f2073g
            float r0 = r0 + r14
            goto L_0x02fb
        L_0x0319:
            r13 = 0
            int r13 = (r0 > r13 ? 1 : (r0 == r13 ? 0 : -1))
            if (r13 != 0) goto L_0x031f
            goto L_0x032c
        L_0x031f:
            int r13 = r4.size()
            b.i.a.f$o[] r13 = new p005b.p080i.p081a.C1422f.C1465o[r13]
            java.lang.Object[] r13 = r4.toArray(r13)
            r1 = r13
            b.i.a.f$o[] r1 = (p005b.p080i.p081a.C1422f.C1465o[]) r1
        L_0x032c:
            r12.f1972q = r1
            if (r1 == 0) goto L_0x05ad
        L_0x0330:
            long r13 = r12.f1962g
            r0 = r2
            goto L_0x05aa
        L_0x0335:
            b.i.a.f$n0 r13 = m1704D(r14)
            r12.f1966k = r13
            if (r13 == 0) goto L_0x05ad
            long r13 = r12.f1962g
            r0 = 8
            goto L_0x05aa
        L_0x0343:
            java.lang.Float r13 = m1703C(r14)
            r12.f1952J = r13
            long r13 = r12.f1962g
            r0 = 134217728(0x8000000, double:6.63123685E-316)
            goto L_0x05aa
        L_0x0350:
            boolean r13 = r14.equals(r11)
            if (r13 == 0) goto L_0x035b
            b.i.a.f$f r13 = p005b.p080i.p081a.C1422f.C1447f.f2029g
            r12.f1951I = r13
            goto L_0x0361
        L_0x035b:
            b.i.a.f$e r13 = m1710r(r14)     // Catch:{ h -> 0x0483 }
            r12.f1951I = r13     // Catch:{ h -> 0x0483 }
        L_0x0361:
            long r13 = r12.f1962g
            r0 = 67108864(0x4000000, double:3.31561842E-316)
            goto L_0x05aa
        L_0x0368:
            int r13 = r14.indexOf(r0)
            if (r13 >= 0) goto L_0x05ad
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            r13.append(r0)
            r13.append(r14)
            r13.append(r0)
            java.lang.String r13 = r13.toString()
            java.lang.String r0 = "|visible|hidden|collapse|"
            boolean r13 = r0.contains(r13)
            if (r13 != 0) goto L_0x038a
            goto L_0x05ad
        L_0x038a:
            boolean r13 = r14.equals(r7)
            java.lang.Boolean r13 = java.lang.Boolean.valueOf(r13)
            r12.f1950H = r13
            long r13 = r12.f1962g
            r0 = 33554432(0x2000000, double:1.6578092E-316)
            goto L_0x05aa
        L_0x039b:
            java.lang.Float r13 = m1703C(r14)
            r12.f1959Q = r13
            long r13 = r12.f1962g
            r0 = 17179869184(0x400000000, double:8.4879831639E-314)
            goto L_0x05aa
        L_0x03aa:
            boolean r13 = r14.equals(r11)
            if (r13 == 0) goto L_0x03b5
            b.i.a.f$f r13 = p005b.p080i.p081a.C1422f.C1447f.f2029g
            r12.f1958P = r13
            goto L_0x03bb
        L_0x03b5:
            b.i.a.f$e r13 = m1710r(r14)     // Catch:{ h -> 0x0483 }
            r12.f1958P = r13     // Catch:{ h -> 0x0483 }
        L_0x03bb:
            long r13 = r12.f1962g
            r0 = 8589934592(0x200000000, double:4.243991582E-314)
            goto L_0x05aa
        L_0x03c4:
            int r13 = r14.hashCode()
            switch(r13) {
                case -1171789332: goto L_0x03f5;
                case -1026963764: goto L_0x03ec;
                case 3387192: goto L_0x03e3;
                case 93826908: goto L_0x03d8;
                case 529818312: goto L_0x03cd;
                default: goto L_0x03cb;
            }
        L_0x03cb:
            r3 = r9
            goto L_0x03ff
        L_0x03cd:
            java.lang.String r13 = "overline"
            boolean r13 = r14.equals(r13)
            if (r13 != 0) goto L_0x03d6
            goto L_0x03cb
        L_0x03d6:
            r3 = r5
            goto L_0x03ff
        L_0x03d8:
            java.lang.String r13 = "blink"
            boolean r13 = r14.equals(r13)
            if (r13 != 0) goto L_0x03e1
            goto L_0x03cb
        L_0x03e1:
            r3 = r6
            goto L_0x03ff
        L_0x03e3:
            boolean r13 = r14.equals(r10)
            if (r13 != 0) goto L_0x03ea
            goto L_0x03cb
        L_0x03ea:
            r3 = r4
            goto L_0x03ff
        L_0x03ec:
            java.lang.String r13 = "underline"
            boolean r13 = r14.equals(r13)
            if (r13 != 0) goto L_0x03ff
            goto L_0x03cb
        L_0x03f5:
            java.lang.String r13 = "line-through"
            boolean r13 = r14.equals(r13)
            if (r13 != 0) goto L_0x03fe
            goto L_0x03cb
        L_0x03fe:
            r3 = r8
        L_0x03ff:
            switch(r3) {
                case 0: goto L_0x040f;
                case 1: goto L_0x040c;
                case 2: goto L_0x0409;
                case 3: goto L_0x0406;
                case 4: goto L_0x0403;
                default: goto L_0x0402;
            }
        L_0x0402:
            goto L_0x0411
        L_0x0403:
            b.i.a.f$d0$g r1 = p005b.p080i.p081a.C1422f.C1433d0.C1440g.Overline
            goto L_0x0411
        L_0x0406:
            b.i.a.f$d0$g r1 = p005b.p080i.p081a.C1422f.C1433d0.C1440g.Blink
            goto L_0x0411
        L_0x0409:
            b.i.a.f$d0$g r1 = p005b.p080i.p081a.C1422f.C1433d0.C1440g.None
            goto L_0x0411
        L_0x040c:
            b.i.a.f$d0$g r1 = p005b.p080i.p081a.C1422f.C1433d0.C1440g.Underline
            goto L_0x0411
        L_0x040f:
            b.i.a.f$d0$g r1 = p005b.p080i.p081a.C1422f.C1433d0.C1440g.LineThrough
        L_0x0411:
            r12.f1980y = r1
            if (r1 == 0) goto L_0x05ad
            long r13 = r12.f1962g
            r0 = 131072(0x20000, double:6.47582E-319)
            goto L_0x05aa
        L_0x041c:
            int r13 = r14.hashCode()
            switch(r13) {
                case -1074341483: goto L_0x0439;
                case 100571: goto L_0x0430;
                case 109757538: goto L_0x0425;
                default: goto L_0x0423;
            }
        L_0x0423:
            r3 = r9
            goto L_0x0443
        L_0x0425:
            java.lang.String r13 = "start"
            boolean r13 = r14.equals(r13)
            if (r13 != 0) goto L_0x042e
            goto L_0x0423
        L_0x042e:
            r3 = r4
            goto L_0x0443
        L_0x0430:
            java.lang.String r13 = "end"
            boolean r13 = r14.equals(r13)
            if (r13 != 0) goto L_0x0443
            goto L_0x0423
        L_0x0439:
            java.lang.String r13 = "middle"
            boolean r13 = r14.equals(r13)
            if (r13 != 0) goto L_0x0442
            goto L_0x0423
        L_0x0442:
            r3 = r8
        L_0x0443:
            switch(r3) {
                case 0: goto L_0x044d;
                case 1: goto L_0x044a;
                case 2: goto L_0x0447;
                default: goto L_0x0446;
            }
        L_0x0446:
            goto L_0x044f
        L_0x0447:
            b.i.a.f$d0$f r1 = p005b.p080i.p081a.C1422f.C1433d0.C1439f.Start
            goto L_0x044f
        L_0x044a:
            b.i.a.f$d0$f r1 = p005b.p080i.p081a.C1422f.C1433d0.C1439f.End
            goto L_0x044f
        L_0x044d:
            b.i.a.f$d0$f r1 = p005b.p080i.p081a.C1422f.C1433d0.C1439f.Middle
        L_0x044f:
            r12.f1943A = r1
            if (r1 == 0) goto L_0x05ad
            long r13 = r12.f1962g
            r0 = 262144(0x40000, double:1.295163E-318)
            goto L_0x05aa
        L_0x045a:
            java.lang.Float r13 = m1703C(r14)
            r12.f1957O = r13
            long r13 = r12.f1962g
            r0 = 4294967296(0x100000000, double:2.121995791E-314)
            goto L_0x05aa
        L_0x0469:
            boolean r13 = r14.equals(r11)
            if (r13 == 0) goto L_0x0474
            b.i.a.f$f r13 = p005b.p080i.p081a.C1422f.C1447f.f2029g
            r12.f1956N = r13
            goto L_0x047a
        L_0x0474:
            b.i.a.f$e r13 = m1710r(r14)     // Catch:{ h -> 0x0483 }
            r12.f1956N = r13     // Catch:{ h -> 0x0483 }
        L_0x047a:
            long r13 = r12.f1962g
            r0 = 2147483648(0x80000000, double:1.0609978955E-314)
            goto L_0x05aa
        L_0x0483:
            r12 = move-exception
            java.lang.String r12 = r12.getMessage()
            java.lang.String r13 = "SVGParser"
            android.util.Log.w(r13, r12)
            goto L_0x05ad
        L_0x048f:
            boolean r13 = r14.equals(r10)
            if (r13 != 0) goto L_0x04a1
            java.lang.String r13 = "non-scaling-stroke"
            boolean r13 = r14.equals(r13)
            if (r13 != 0) goto L_0x049e
            goto L_0x04a3
        L_0x049e:
            b.i.a.f$d0$i r1 = p005b.p080i.p081a.C1422f.C1433d0.C1442i.NonScalingStroke
            goto L_0x04a3
        L_0x04a1:
            b.i.a.f$d0$i r1 = p005b.p080i.p081a.C1422f.C1433d0.C1442i.None
        L_0x04a3:
            r12.f1960R = r1
            if (r1 == 0) goto L_0x05ad
            long r13 = r12.f1962g
            r0 = 34359738368(0x800000000, double:1.69759663277E-313)
            goto L_0x05aa
        L_0x04b0:
            int r13 = r14.hashCode()
            switch(r13) {
                case -1217487446: goto L_0x04d4;
                case -907680051: goto L_0x04cb;
                case 3005871: goto L_0x04c2;
                case 466743410: goto L_0x04b9;
                default: goto L_0x04b7;
            }
        L_0x04b7:
            r3 = r9
            goto L_0x04de
        L_0x04b9:
            boolean r13 = r14.equals(r7)
            if (r13 != 0) goto L_0x04c0
            goto L_0x04b7
        L_0x04c0:
            r3 = r6
            goto L_0x04de
        L_0x04c2:
            boolean r13 = r14.equals(r2)
            if (r13 != 0) goto L_0x04c9
            goto L_0x04b7
        L_0x04c9:
            r3 = r4
            goto L_0x04de
        L_0x04cb:
            java.lang.String r13 = "scroll"
            boolean r13 = r14.equals(r13)
            if (r13 != 0) goto L_0x04de
            goto L_0x04b7
        L_0x04d4:
            java.lang.String r13 = "hidden"
            boolean r13 = r14.equals(r13)
            if (r13 != 0) goto L_0x04dd
            goto L_0x04b7
        L_0x04dd:
            r3 = r8
        L_0x04de:
            switch(r3) {
                case 0: goto L_0x04e5;
                case 1: goto L_0x04e5;
                case 2: goto L_0x04e2;
                case 3: goto L_0x04e2;
                default: goto L_0x04e1;
            }
        L_0x04e1:
            goto L_0x04e7
        L_0x04e2:
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            goto L_0x04e7
        L_0x04e5:
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
        L_0x04e7:
            r12.f1944B = r1
            if (r1 == 0) goto L_0x05ad
            long r13 = r12.f1962g
            r0 = 524288(0x80000, double:2.590327E-318)
            goto L_0x05aa
        L_0x04f2:
            java.lang.Float r13 = m1703C(r14)
            r12.f1974s = r13
            long r13 = r12.f1962g
            r0 = 2048(0x800, double:1.0118E-320)
            goto L_0x05aa
        L_0x04fe:
            java.lang.String r13 = m1717y(r14)
            r12.f1955M = r13
            long r13 = r12.f1962g
            r0 = 1073741824(0x40000000, double:5.304989477E-315)
            goto L_0x05aa
        L_0x050b:
            java.lang.String r13 = "ltr"
            boolean r13 = r14.equals(r13)
            if (r13 != 0) goto L_0x051f
            java.lang.String r13 = "rtl"
            boolean r13 = r14.equals(r13)
            if (r13 != 0) goto L_0x051c
            goto L_0x0521
        L_0x051c:
            b.i.a.f$d0$h r1 = p005b.p080i.p081a.C1422f.C1433d0.C1441h.RTL
            goto L_0x0521
        L_0x051f:
            b.i.a.f$d0$h r1 = p005b.p080i.p081a.C1422f.C1433d0.C1441h.LTR
        L_0x0521:
            r12.f1981z = r1
            if (r1 == 0) goto L_0x05ad
            long r13 = r12.f1962g
            r0 = 68719476736(0x1000000000, double:3.39519326554E-313)
            goto L_0x05aa
        L_0x052e:
            b.i.a.f$e r13 = m1710r(r14)     // Catch:{ h -> 0x05ad }
            r12.f1975t = r13     // Catch:{ h -> 0x05ad }
            long r13 = r12.f1962g     // Catch:{ h -> 0x05ad }
            r0 = 4096(0x1000, double:2.0237E-320)
        L_0x0538:
            long r13 = r13 | r0
            r12.f1962g = r13     // Catch:{ h -> 0x05ad }
            goto L_0x05ad
        L_0x053d:
            b.i.a.f$d0$a r13 = m1712t(r14)
            r12.f1954L = r13
            long r13 = r12.f1962g
            r0 = 536870912(0x20000000, double:2.652494739E-315)
            goto L_0x05aa
        L_0x0549:
            java.lang.String r13 = m1717y(r14)
            r12.f1953K = r13
            long r13 = r12.f1962g
            r0 = 268435456(0x10000000, double:1.32624737E-315)
            goto L_0x05aa
        L_0x0555:
            boolean r13 = r2.equals(r14)
            if (r13 == 0) goto L_0x055c
            goto L_0x05a1
        L_0x055c:
            java.lang.String r13 = "rect("
            boolean r13 = r14.startsWith(r13)
            if (r13 != 0) goto L_0x0565
            goto L_0x05a1
        L_0x0565:
            b.i.a.i$i r13 = new b.i.a.i$i
            java.lang.String r14 = r14.substring(r0)
            r13.<init>(r14)
            r13.mo11444r()
            b.i.a.f$o r14 = m1702B(r13)
            r13.mo11443q()
            b.i.a.f$o r0 = m1702B(r13)
            r13.mo11443q()
            b.i.a.f$o r2 = m1702B(r13)
            r13.mo11443q()
            b.i.a.f$o r3 = m1702B(r13)
            r13.mo11444r()
            r4 = 41
            boolean r4 = r13.mo11430d(r4)
            if (r4 != 0) goto L_0x059c
            boolean r13 = r13.mo11432f()
            if (r13 != 0) goto L_0x059c
            goto L_0x05a1
        L_0x059c:
            b.i.a.f$b r1 = new b.i.a.f$b
            r1.<init>(r14, r0, r2, r3)
        L_0x05a1:
            r12.f1945C = r1
            if (r1 == 0) goto L_0x05ad
            long r13 = r12.f1962g
            r0 = 1048576(0x100000, double:5.180654E-318)
        L_0x05aa:
            long r13 = r13 | r0
            r12.f1962g = r13
        L_0x05ad:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p080i.p081a.C1502i.m1706J(b.i.a.f$d0, java.lang.String, java.lang.String):void");
    }

    /* renamed from: b */
    public static int m1707b(float f) {
        if (f < 0.0f) {
            return 0;
        }
        if (f > 255.0f) {
            return 255;
        }
        return Math.round(f);
    }

    /* renamed from: d */
    public static int m1708d(float f, float f2, float f3) {
        float f4 = 0.0f;
        int i = (f > 0.0f ? 1 : (f == 0.0f ? 0 : -1));
        float f5 = f % 360.0f;
        if (i < 0) {
            f5 += 360.0f;
        }
        float f6 = f5 / 60.0f;
        float f7 = f2 / 100.0f;
        float f8 = f3 / 100.0f;
        if (f7 < 0.0f) {
            f7 = 0.0f;
        } else if (f7 > 1.0f) {
            f7 = 1.0f;
        }
        if (f8 >= 0.0f) {
            f4 = f8 > 1.0f ? 1.0f : f8;
        }
        float f9 = f4 <= 0.5f ? (f7 + 1.0f) * f4 : (f4 + f7) - (f7 * f4);
        float f10 = (f4 * 2.0f) - f9;
        return m1707b(m1709e(f10, f9, f6 - 2.0f) * 256.0f) | (m1707b(m1709e(f10, f9, f6 + 2.0f) * 256.0f) << 16) | (m1707b(m1709e(f10, f9, f6) * 256.0f) << 8);
    }

    /* renamed from: e */
    public static float m1709e(float f, float f2, float f3) {
        if (f3 < 0.0f) {
            f3 += 6.0f;
        }
        if (f3 >= 6.0f) {
            f3 -= 6.0f;
        }
        return f3 < 1.0f ? C0843a.m440a(f2, f, f3, f) : f3 < 3.0f ? f2 : f3 < 4.0f ? C0843a.m440a(4.0f, f3, f2 - f, f) : f;
    }

    /* renamed from: r */
    public static C1422f.C1444e m1710r(String str) {
        int i;
        long j;
        int i2 = 4;
        if (str.charAt(0) == '#') {
            int length = str.length();
            C1417c cVar = null;
            if (1 < length) {
                long j2 = 0;
                int i3 = 1;
                while (true) {
                    if (i3 >= length) {
                        break;
                    }
                    char charAt = str.charAt(i3);
                    if (charAt < '0' || charAt > '9') {
                        if (charAt < 'A' || charAt > 'F') {
                            if (charAt < 'a' || charAt > 'f') {
                                break;
                            }
                            j = j2 * 16;
                            i = charAt - 'a';
                        } else {
                            j = j2 * 16;
                            i = charAt - 'A';
                        }
                        j2 = j + ((long) i) + 10;
                    } else {
                        j2 = (j2 * 16) + ((long) (charAt - '0'));
                    }
                    if (j2 > 4294967295L) {
                        break;
                    }
                    i3++;
                }
                if (i3 != 1) {
                    cVar = new C1417c(j2, i3);
                }
            }
            if (cVar != null) {
                int i4 = cVar.f1887a;
                if (i4 == 4) {
                    int i5 = (int) cVar.f1888b;
                    int i6 = i5 & 3840;
                    int i7 = i5 & 240;
                    int i8 = i5 & 15;
                    return new C1422f.C1444e(i8 | (i6 << 8) | -16777216 | (i6 << 12) | (i7 << 8) | (i7 << 4) | (i8 << 4));
                } else if (i4 == 5) {
                    int i9 = (int) cVar.f1888b;
                    int i10 = 61440 & i9;
                    int i11 = i9 & 3840;
                    int i12 = i9 & 240;
                    int i13 = i9 & 15;
                    return new C1422f.C1444e((i13 << 24) | (i13 << 28) | (i10 << 8) | (i10 << 4) | (i11 << 4) | i11 | i12 | (i12 >> 4));
                } else if (i4 == 7) {
                    return new C1422f.C1444e(((int) cVar.f1888b) | ViewCompat.MEASURED_STATE_MASK);
                } else {
                    if (i4 == 9) {
                        int i14 = (int) cVar.f1888b;
                        return new C1422f.C1444e((i14 >>> 8) | (i14 << 24));
                    }
                    throw new C1501h(C0843a.m451l("Bad hex colour value: ", str));
                }
            } else {
                throw new C1501h(C0843a.m451l("Bad hex colour value: ", str));
            }
        } else {
            String lowerCase = str.toLowerCase(Locale.US);
            boolean startsWith = lowerCase.startsWith("rgba(");
            if (startsWith || lowerCase.startsWith("rgb(")) {
                if (startsWith) {
                    i2 = 5;
                }
                C1511i iVar = new C1511i(str.substring(i2));
                iVar.mo11444r();
                float i15 = iVar.mo11435i();
                if (!Float.isNaN(i15) && iVar.mo11430d('%')) {
                    i15 = (i15 * 256.0f) / 100.0f;
                }
                float c = iVar.mo11429c(i15);
                if (!Float.isNaN(c) && iVar.mo11430d('%')) {
                    c = (c * 256.0f) / 100.0f;
                }
                float c2 = iVar.mo11429c(c);
                if (!Float.isNaN(c2) && iVar.mo11430d('%')) {
                    c2 = (c2 * 256.0f) / 100.0f;
                }
                if (startsWith) {
                    float c3 = iVar.mo11429c(c2);
                    iVar.mo11444r();
                    if (!Float.isNaN(c3) && iVar.mo11430d(')')) {
                        return new C1422f.C1444e((m1707b(c3 * 256.0f) << 24) | (m1707b(i15) << 16) | (m1707b(c) << 8) | m1707b(c2));
                    }
                    throw new C1501h(C0843a.m451l("Bad rgba() colour value: ", str));
                }
                iVar.mo11444r();
                if (!Float.isNaN(c2) && iVar.mo11430d(')')) {
                    return new C1422f.C1444e((m1707b(i15) << 16) | ViewCompat.MEASURED_STATE_MASK | (m1707b(c) << 8) | m1707b(c2));
                }
                throw new C1501h(C0843a.m451l("Bad rgb() colour value: ", str));
            }
            boolean startsWith2 = lowerCase.startsWith("hsla(");
            if (startsWith2 || lowerCase.startsWith("hsl(")) {
                if (startsWith2) {
                    i2 = 5;
                }
                C1511i iVar2 = new C1511i(str.substring(i2));
                iVar2.mo11444r();
                float i16 = iVar2.mo11435i();
                float c4 = iVar2.mo11429c(i16);
                if (!Float.isNaN(c4)) {
                    iVar2.mo11430d('%');
                }
                float c5 = iVar2.mo11429c(c4);
                if (!Float.isNaN(c5)) {
                    iVar2.mo11430d('%');
                }
                if (startsWith2) {
                    float c6 = iVar2.mo11429c(c5);
                    iVar2.mo11444r();
                    if (!Float.isNaN(c6) && iVar2.mo11430d(')')) {
                        return new C1422f.C1444e((m1707b(c6 * 256.0f) << 24) | m1708d(i16, c4, c5));
                    }
                    throw new C1501h(C0843a.m451l("Bad hsla() colour value: ", str));
                }
                iVar2.mo11444r();
                if (!Float.isNaN(c5) && iVar2.mo11430d(')')) {
                    return new C1422f.C1444e(m1708d(i16, c4, c5) | ViewCompat.MEASURED_STATE_MASK);
                }
                throw new C1501h(C0843a.m451l("Bad hsl() colour value: ", str));
            }
            Integer num = C1505c.f2181a.get(lowerCase);
            if (num != null) {
                return new C1422f.C1444e(num.intValue());
            }
            throw new C1501h(C0843a.m451l("Invalid colour keyword: ", lowerCase));
        }
    }

    /* renamed from: s */
    public static C1422f.C1464n0 m1711s(String str) {
        if (str.equals("none")) {
            return C1422f.C1444e.f2023i;
        }
        if (str.equals("currentColor")) {
            return C1422f.C1447f.f2029g;
        }
        try {
            return m1710r(str);
        } catch (C1501h unused) {
            return null;
        }
    }

    /* renamed from: t */
    public static C1422f.C1433d0.C1434a m1712t(String str) {
        if ("nonzero".equals(str)) {
            return C1422f.C1433d0.C1434a.NonZero;
        }
        if ("evenodd".equals(str)) {
            return C1422f.C1433d0.C1434a.EvenOdd;
        }
        return null;
    }

    /* renamed from: u */
    public static float m1713u(String str) {
        int length = str.length();
        if (length != 0) {
            return m1714v(str, 0, length);
        }
        throw new C1501h("Invalid float value (empty string)");
    }

    /* renamed from: v */
    public static float m1714v(String str, int i, int i2) {
        float a = new C1418d().mo11292a(str, i, i2);
        if (!Float.isNaN(a)) {
            return a;
        }
        throw new C1501h(C0843a.m451l("Invalid float value: ", str));
    }

    /* renamed from: w */
    public static List<String> m1715w(String str) {
        C1511i iVar = new C1511i(str);
        ArrayList arrayList = null;
        do {
            String k = iVar.mo11437k();
            if (k == null) {
                k = iVar.mo11440n(',', true);
            }
            if (k == null) {
                break;
            }
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            arrayList.add(k);
            iVar.mo11443q();
        } while (!iVar.mo11432f());
        return arrayList;
    }

    /* renamed from: x */
    public static C1422f.C1433d0.C1435b m1716x(String str) {
        char c = 65535;
        switch (str.hashCode()) {
            case -1657669071:
                if (str.equals("oblique")) {
                    c = 0;
                    break;
                }
                break;
            case -1178781136:
                if (str.equals("italic")) {
                    c = 1;
                    break;
                }
                break;
            case -1039745817:
                if (str.equals("normal")) {
                    c = 2;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return C1422f.C1433d0.C1435b.Oblique;
            case 1:
                return C1422f.C1433d0.C1435b.Italic;
            case 2:
                return C1422f.C1433d0.C1435b.Normal;
            default:
                return null;
        }
    }

    /* renamed from: y */
    public static String m1717y(String str) {
        if (str.equals("none") || !str.startsWith("url(")) {
            return null;
        }
        return (str.endsWith(")") ? str.substring(4, str.length() - 1) : str.substring(4)).trim();
    }

    /* renamed from: z */
    public static C1422f.C1465o m1718z(String str) {
        if (str.length() != 0) {
            int length = str.length();
            C1422f.C1431c1 c1Var = C1422f.C1431c1.px;
            char charAt = str.charAt(length - 1);
            if (charAt == '%') {
                length--;
                c1Var = C1422f.C1431c1.percent;
            } else if (length > 2 && Character.isLetter(charAt) && Character.isLetter(str.charAt(length - 2))) {
                length -= 2;
                try {
                    c1Var = C1422f.C1431c1.valueOf(str.substring(length).toLowerCase(Locale.US));
                } catch (IllegalArgumentException unused) {
                    throw new C1501h(C0843a.m451l("Invalid length unit specifier: ", str));
                }
            }
            try {
                return new C1422f.C1465o(m1714v(str, 0, length), c1Var);
            } catch (NumberFormatException e) {
                throw new C1501h(C0843a.m451l("Invalid length value: ", str), e);
            }
        } else {
            throw new C1501h("Invalid length value (empty string)");
        }
    }

    /* renamed from: F */
    public final Map<String, String> mo11397F(C1511i iVar) {
        HashMap hashMap = new HashMap();
        iVar.mo11444r();
        while (true) {
            String m = iVar.mo11439m('=');
            if (m == null) {
                return hashMap;
            }
            iVar.mo11430d('=');
            hashMap.put(m, iVar.mo11437k());
            iVar.mo11444r();
        }
    }

    /* renamed from: G */
    public final Matrix mo11398G(String str) {
        String str2 = str;
        Matrix matrix = new Matrix();
        C1511i iVar = new C1511i(str2);
        iVar.mo11444r();
        while (!iVar.mo11432f()) {
            String str3 = null;
            if (!iVar.mo11432f()) {
                int i = iVar.f2314b;
                int charAt = iVar.f2313a.charAt(i);
                while (true) {
                    if ((charAt < 97 || charAt > 122) && (charAt < 65 || charAt > 90)) {
                        int i2 = iVar.f2314b;
                    } else {
                        charAt = iVar.mo11427a();
                    }
                }
                int i22 = iVar.f2314b;
                while (iVar.mo11433g(charAt)) {
                    charAt = iVar.mo11427a();
                }
                if (charAt == 40) {
                    iVar.f2314b++;
                    str3 = iVar.f2313a.substring(i, i22);
                } else {
                    iVar.f2314b = i;
                }
            }
            if (str3 != null) {
                char c = 65535;
                switch (str3.hashCode()) {
                    case -1081239615:
                        if (str3.equals("matrix")) {
                            c = 0;
                            break;
                        }
                        break;
                    case -925180581:
                        if (str3.equals("rotate")) {
                            c = 1;
                            break;
                        }
                        break;
                    case 109250890:
                        if (str3.equals("scale")) {
                            c = 2;
                            break;
                        }
                        break;
                    case 109493390:
                        if (str3.equals("skewX")) {
                            c = 3;
                            break;
                        }
                        break;
                    case 109493391:
                        if (str3.equals("skewY")) {
                            c = 4;
                            break;
                        }
                        break;
                    case 1052832078:
                        if (str3.equals("translate")) {
                            c = 5;
                            break;
                        }
                        break;
                }
                switch (c) {
                    case 0:
                        iVar.mo11444r();
                        float i3 = iVar.mo11435i();
                        iVar.mo11443q();
                        float i4 = iVar.mo11435i();
                        iVar.mo11443q();
                        float i5 = iVar.mo11435i();
                        iVar.mo11443q();
                        float i6 = iVar.mo11435i();
                        iVar.mo11443q();
                        float i7 = iVar.mo11435i();
                        iVar.mo11443q();
                        float i8 = iVar.mo11435i();
                        iVar.mo11444r();
                        if (!Float.isNaN(i8) && iVar.mo11430d(')')) {
                            Matrix matrix2 = new Matrix();
                            matrix2.setValues(new float[]{i3, i5, i7, i4, i6, i8, 0.0f, 0.0f, 1.0f});
                            matrix.preConcat(matrix2);
                            break;
                        } else {
                            throw new C1501h(C0843a.m451l("Invalid transform list: ", str2));
                        }
                    case 1:
                        iVar.mo11444r();
                        float i9 = iVar.mo11435i();
                        float p = iVar.mo11442p();
                        float p2 = iVar.mo11442p();
                        iVar.mo11444r();
                        if (Float.isNaN(i9) || !iVar.mo11430d(')')) {
                            throw new C1501h(C0843a.m451l("Invalid transform list: ", str2));
                        } else if (Float.isNaN(p)) {
                            matrix.preRotate(i9);
                            break;
                        } else if (!Float.isNaN(p2)) {
                            matrix.preRotate(i9, p, p2);
                            break;
                        } else {
                            throw new C1501h(C0843a.m451l("Invalid transform list: ", str2));
                        }
                    case 2:
                        iVar.mo11444r();
                        float i10 = iVar.mo11435i();
                        float p3 = iVar.mo11442p();
                        iVar.mo11444r();
                        if (!Float.isNaN(i10) && iVar.mo11430d(')')) {
                            if (!Float.isNaN(p3)) {
                                matrix.preScale(i10, p3);
                                break;
                            } else {
                                matrix.preScale(i10, i10);
                                break;
                            }
                        } else {
                            throw new C1501h(C0843a.m451l("Invalid transform list: ", str2));
                        }
                        break;
                    case 3:
                        iVar.mo11444r();
                        float i11 = iVar.mo11435i();
                        iVar.mo11444r();
                        if (!Float.isNaN(i11) && iVar.mo11430d(')')) {
                            matrix.preSkew((float) Math.tan(Math.toRadians((double) i11)), 0.0f);
                            break;
                        } else {
                            throw new C1501h(C0843a.m451l("Invalid transform list: ", str2));
                        }
                        break;
                    case 4:
                        iVar.mo11444r();
                        float i12 = iVar.mo11435i();
                        iVar.mo11444r();
                        if (!Float.isNaN(i12) && iVar.mo11430d(')')) {
                            matrix.preSkew(0.0f, (float) Math.tan(Math.toRadians((double) i12)));
                            break;
                        } else {
                            throw new C1501h(C0843a.m451l("Invalid transform list: ", str2));
                        }
                        break;
                    case 5:
                        iVar.mo11444r();
                        float i13 = iVar.mo11435i();
                        float p4 = iVar.mo11442p();
                        iVar.mo11444r();
                        if (!Float.isNaN(i13) && iVar.mo11430d(')')) {
                            if (!Float.isNaN(p4)) {
                                matrix.preTranslate(i13, p4);
                                break;
                            } else {
                                matrix.preTranslate(i13, 0.0f);
                                break;
                            }
                        } else {
                            throw new C1501h(C0843a.m451l("Invalid transform list: ", str2));
                        }
                        break;
                    default:
                        throw new C1501h(C0843a.m452m("Invalid transform list fn: ", str3, ")"));
                }
                if (iVar.mo11432f()) {
                    return matrix;
                }
                iVar.mo11443q();
            } else {
                throw new C1501h(C0843a.m451l("Bad transform function encountered in transform list: ", str2));
            }
        }
        return matrix;
    }

    /* renamed from: H */
    public final void mo11399H(InputStream inputStream) {
        Log.d("SVGParser", "Falling back to SAX parser");
        try {
            SAXParserFactory newInstance = SAXParserFactory.newInstance();
            newInstance.setFeature("http://xml.org/sax/features/external-general-entities", false);
            newInstance.setFeature("http://xml.org/sax/features/external-parameter-entities", false);
            XMLReader xMLReader = newInstance.newSAXParser().getXMLReader();
            C1508f fVar = new C1508f((C1503a) null);
            xMLReader.setContentHandler(fVar);
            xMLReader.setProperty("http://xml.org/sax/properties/lexical-handler", fVar);
            xMLReader.parse(new InputSource(inputStream));
        } catch (ParserConfigurationException e) {
            throw new C1501h("XML parser problem", e);
        } catch (SAXException e2) {
            throw new C1501h("SVG parse error", e2);
        } catch (IOException e3) {
            throw new C1501h("Stream error", e3);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:43:0x010e, code lost:
        r9 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0116, code lost:
        throw new p005b.p080i.p081a.C1501h("Stream error", r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0117, code lost:
        r9 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x011f, code lost:
        throw new p005b.p080i.p081a.C1501h("XML parser problem", r9);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0117 A[ExcHandler: XmlPullParserException (r9v1 'e' org.xmlpull.v1.XmlPullParserException A[CUSTOM_DECLARE]), Splitter:B:0:0x0000] */
    /* renamed from: I */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo11400I(java.io.InputStream r9, boolean r10) {
        /*
            r8 = this;
            org.xmlpull.v1.XmlPullParser r0 = android.util.Xml.newPullParser()     // Catch:{ XmlPullParserException -> 0x0117, IOException -> 0x010e }
            b.i.a.i$j r1 = new b.i.a.i$j     // Catch:{ XmlPullParserException -> 0x0117, IOException -> 0x010e }
            r1.<init>(r8, r0)     // Catch:{ XmlPullParserException -> 0x0117, IOException -> 0x010e }
            java.lang.String r2 = "http://xmlpull.org/v1/doc/features.html#process-docdecl"
            r3 = 0
            r0.setFeature(r2, r3)     // Catch:{ XmlPullParserException -> 0x0117, IOException -> 0x010e }
            java.lang.String r2 = "http://xmlpull.org/v1/doc/features.html#process-namespaces"
            r4 = 1
            r0.setFeature(r2, r4)     // Catch:{ XmlPullParserException -> 0x0117, IOException -> 0x010e }
            r2 = 0
            r0.setInput(r9, r2)     // Catch:{ XmlPullParserException -> 0x0117, IOException -> 0x010e }
            int r2 = r0.getEventType()     // Catch:{ XmlPullParserException -> 0x0117, IOException -> 0x010e }
        L_0x001d:
            if (r2 == r4) goto L_0x010d
            if (r2 == 0) goto L_0x0100
            r5 = 8
            java.lang.String r6 = "SVGParser"
            if (r2 == r5) goto L_0x00d2
            r5 = 10
            if (r2 == r5) goto L_0x00ac
            r5 = 58
            r6 = 2
            if (r2 == r6) goto L_0x0080
            r7 = 3
            if (r2 == r7) goto L_0x0053
            r5 = 4
            if (r2 == r5) goto L_0x0044
            r5 = 5
            if (r2 == r5) goto L_0x003b
            goto L_0x0107
        L_0x003b:
            java.lang.String r2 = r0.getText()     // Catch:{ XmlPullParserException -> 0x0117, IOException -> 0x010e }
            r8.mo11404N(r2)     // Catch:{ XmlPullParserException -> 0x0117, IOException -> 0x010e }
            goto L_0x0107
        L_0x0044:
            int[] r2 = new int[r6]     // Catch:{ XmlPullParserException -> 0x0117, IOException -> 0x010e }
            char[] r5 = r0.getTextCharacters(r2)     // Catch:{ XmlPullParserException -> 0x0117, IOException -> 0x010e }
            r6 = r2[r3]     // Catch:{ XmlPullParserException -> 0x0117, IOException -> 0x010e }
            r2 = r2[r4]     // Catch:{ XmlPullParserException -> 0x0117, IOException -> 0x010e }
            r8.mo11405O(r5, r6, r2)     // Catch:{ XmlPullParserException -> 0x0117, IOException -> 0x010e }
            goto L_0x0107
        L_0x0053:
            java.lang.String r2 = r0.getName()     // Catch:{ XmlPullParserException -> 0x0117, IOException -> 0x010e }
            java.lang.String r6 = r0.getPrefix()     // Catch:{ XmlPullParserException -> 0x0117, IOException -> 0x010e }
            if (r6 == 0) goto L_0x0073
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ XmlPullParserException -> 0x0117, IOException -> 0x010e }
            r6.<init>()     // Catch:{ XmlPullParserException -> 0x0117, IOException -> 0x010e }
            java.lang.String r7 = r0.getPrefix()     // Catch:{ XmlPullParserException -> 0x0117, IOException -> 0x010e }
            r6.append(r7)     // Catch:{ XmlPullParserException -> 0x0117, IOException -> 0x010e }
            r6.append(r5)     // Catch:{ XmlPullParserException -> 0x0117, IOException -> 0x010e }
            r6.append(r2)     // Catch:{ XmlPullParserException -> 0x0117, IOException -> 0x010e }
            java.lang.String r2 = r6.toString()     // Catch:{ XmlPullParserException -> 0x0117, IOException -> 0x010e }
        L_0x0073:
            java.lang.String r5 = r0.getNamespace()     // Catch:{ XmlPullParserException -> 0x0117, IOException -> 0x010e }
            java.lang.String r6 = r0.getName()     // Catch:{ XmlPullParserException -> 0x0117, IOException -> 0x010e }
            r8.mo11408c(r5, r6, r2)     // Catch:{ XmlPullParserException -> 0x0117, IOException -> 0x010e }
            goto L_0x0107
        L_0x0080:
            java.lang.String r2 = r0.getName()     // Catch:{ XmlPullParserException -> 0x0117, IOException -> 0x010e }
            java.lang.String r6 = r0.getPrefix()     // Catch:{ XmlPullParserException -> 0x0117, IOException -> 0x010e }
            if (r6 == 0) goto L_0x00a0
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ XmlPullParserException -> 0x0117, IOException -> 0x010e }
            r6.<init>()     // Catch:{ XmlPullParserException -> 0x0117, IOException -> 0x010e }
            java.lang.String r7 = r0.getPrefix()     // Catch:{ XmlPullParserException -> 0x0117, IOException -> 0x010e }
            r6.append(r7)     // Catch:{ XmlPullParserException -> 0x0117, IOException -> 0x010e }
            r6.append(r5)     // Catch:{ XmlPullParserException -> 0x0117, IOException -> 0x010e }
            r6.append(r2)     // Catch:{ XmlPullParserException -> 0x0117, IOException -> 0x010e }
            java.lang.String r2 = r6.toString()     // Catch:{ XmlPullParserException -> 0x0117, IOException -> 0x010e }
        L_0x00a0:
            java.lang.String r5 = r0.getNamespace()     // Catch:{ XmlPullParserException -> 0x0117, IOException -> 0x010e }
            java.lang.String r6 = r0.getName()     // Catch:{ XmlPullParserException -> 0x0117, IOException -> 0x010e }
            r8.mo11402L(r5, r6, r2, r1)     // Catch:{ XmlPullParserException -> 0x0117, IOException -> 0x010e }
            goto L_0x0107
        L_0x00ac:
            if (r10 == 0) goto L_0x0107
            b.i.a.f r2 = r8.f2171a     // Catch:{ XmlPullParserException -> 0x0117, IOException -> 0x010e }
            b.i.a.f$e0 r2 = r2.f1910a     // Catch:{ XmlPullParserException -> 0x0117, IOException -> 0x010e }
            if (r2 != 0) goto L_0x0107
            java.lang.String r2 = r0.getText()     // Catch:{ XmlPullParserException -> 0x0117, IOException -> 0x010e }
            java.lang.String r5 = "<!ENTITY "
            boolean r2 = r2.contains(r5)     // Catch:{ XmlPullParserException -> 0x0117, IOException -> 0x010e }
            if (r2 == 0) goto L_0x0107
            java.lang.String r10 = "Switching to SAX parser to process entities"
            android.util.Log.d(r6, r10)     // Catch:{ IOException -> 0x00cc, XmlPullParserException -> 0x0117 }
            r9.reset()     // Catch:{ IOException -> 0x00cc, XmlPullParserException -> 0x0117 }
            r8.mo11399H(r9)     // Catch:{ IOException -> 0x00cc, XmlPullParserException -> 0x0117 }
            goto L_0x00d1
        L_0x00cc:
            java.lang.String r9 = "Detected internal entity definitions, but could not parse them."
            android.util.Log.w(r6, r9)     // Catch:{ XmlPullParserException -> 0x0117, IOException -> 0x010e }
        L_0x00d1:
            return
        L_0x00d2:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ XmlPullParserException -> 0x0117, IOException -> 0x010e }
            r2.<init>()     // Catch:{ XmlPullParserException -> 0x0117, IOException -> 0x010e }
            java.lang.String r5 = "PROC INSTR: "
            r2.append(r5)     // Catch:{ XmlPullParserException -> 0x0117, IOException -> 0x010e }
            java.lang.String r5 = r0.getText()     // Catch:{ XmlPullParserException -> 0x0117, IOException -> 0x010e }
            r2.append(r5)     // Catch:{ XmlPullParserException -> 0x0117, IOException -> 0x010e }
            java.lang.String r2 = r2.toString()     // Catch:{ XmlPullParserException -> 0x0117, IOException -> 0x010e }
            android.util.Log.d(r6, r2)     // Catch:{ XmlPullParserException -> 0x0117, IOException -> 0x010e }
            b.i.a.i$i r2 = new b.i.a.i$i     // Catch:{ XmlPullParserException -> 0x0117, IOException -> 0x010e }
            java.lang.String r5 = r0.getText()     // Catch:{ XmlPullParserException -> 0x0117, IOException -> 0x010e }
            r2.<init>(r5)     // Catch:{ XmlPullParserException -> 0x0117, IOException -> 0x010e }
            java.lang.String r5 = r2.mo11438l()     // Catch:{ XmlPullParserException -> 0x0117, IOException -> 0x010e }
            r8.mo11397F(r2)     // Catch:{ XmlPullParserException -> 0x0117, IOException -> 0x010e }
            java.lang.String r2 = "xml-stylesheet"
            r5.equals(r2)     // Catch:{ XmlPullParserException -> 0x0117, IOException -> 0x010e }
            goto L_0x0107
        L_0x0100:
            b.i.a.f r2 = new b.i.a.f     // Catch:{ XmlPullParserException -> 0x0117, IOException -> 0x010e }
            r2.<init>()     // Catch:{ XmlPullParserException -> 0x0117, IOException -> 0x010e }
            r8.f2171a = r2     // Catch:{ XmlPullParserException -> 0x0117, IOException -> 0x010e }
        L_0x0107:
            int r2 = r0.nextToken()     // Catch:{ XmlPullParserException -> 0x0117, IOException -> 0x010e }
            goto L_0x001d
        L_0x010d:
            return
        L_0x010e:
            r9 = move-exception
            b.i.a.h r10 = new b.i.a.h
            java.lang.String r0 = "Stream error"
            r10.<init>(r0, r9)
            throw r10
        L_0x0117:
            r9 = move-exception
            b.i.a.h r10 = new b.i.a.h
            java.lang.String r0 = "XML parser problem"
            r10.<init>(r0, r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p080i.p081a.C1502i.mo11400I(java.io.InputStream, boolean):void");
    }

    /* renamed from: K */
    public final void mo11401K(Attributes attributes) {
        C1422f.C1454i0 i0Var = this.f2172b;
        if (i0Var != null) {
            C1422f.C1427b0 b0Var = new C1422f.C1427b0();
            b0Var.f2065a = this.f2171a;
            b0Var.f2066b = i0Var;
            mo11413j(b0Var, attributes);
            mo11416m(b0Var, attributes);
            this.f2172b.mo11309f(b0Var);
            this.f2172b = b0Var;
            return;
        }
        throw new C1501h("Invalid document. Root element must be <svg>");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:315:0x06b7, code lost:
        r24 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:334:0x072c, code lost:
        r0.mo11339d(r14, r11, r9, r10);
        r12 = r28;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:356:0x0783, code lost:
        r12 = r28;
        r10 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:364:0x07a4, code lost:
        r14 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:365:0x07a5, code lost:
        r6 = r9;
        r9 = r14;
        r25 = r11;
        r11 = r10;
        r10 = r25;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:374:0x07e8, code lost:
        r7 = 109;
        r0.mo11336b(r17, r18, r9, r11, r14, r15);
        r12 = r28;
        r13 = r29;
        r10 = r11;
        r6 = r14;
        r11 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:375:0x07fe, code lost:
        r24 = 0.0f;
        r25 = r11;
        r11 = r10;
        r10 = r25;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:390:0x086c, code lost:
        r4.mo11443q();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:391:0x0873, code lost:
        if (r4.mo11432f() == false) goto L_0x0876;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:392:0x0876, code lost:
        r14 = r4.f2314b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:393:0x087a, code lost:
        if (r14 != r4.f2315c) goto L_0x087d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:394:0x087d, code lost:
        r14 = r4.f2313a.charAt(r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:395:0x0885, code lost:
        if (r14 < 'a') goto L_0x088b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:397:0x0889, code lost:
        if (r14 <= 'z') goto L_0x0893;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:399:0x088d, code lost:
        if (r14 < 'A') goto L_0x0895;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:401:0x0891, code lost:
        if (r14 > 'Z') goto L_0x0895;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:402:0x0893, code lost:
        r14 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:403:0x0895, code lost:
        r14 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:404:0x0896, code lost:
        if (r14 == false) goto L_0x08a0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:405:0x0898, code lost:
        r5 = r4.mo11434h().intValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:593:0x00e3, code lost:
        continue;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:616:0x0403, code lost:
        continue;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:641:0x05c7, code lost:
        continue;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:670:0x098b, code lost:
        continue;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:710:0x0c94, code lost:
        continue;
     */
    /* renamed from: L */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo11402L(java.lang.String r27, java.lang.String r28, java.lang.String r29, org.xml.sax.Attributes r30) {
        /*
            r26 = this;
            r1 = r26
            r0 = r27
            r2 = r30
            boolean r3 = r1.f2173c
            r4 = 1
            if (r3 == 0) goto L_0x0011
            int r0 = r1.f2174d
            int r0 = r0 + r4
            r1.f2174d = r0
            return
        L_0x0011:
            java.lang.String r3 = "http://www.w3.org/2000/svg"
            boolean r3 = r3.equals(r0)
            java.lang.String r5 = ""
            if (r3 != 0) goto L_0x0022
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L_0x0022
            return
        L_0x0022:
            int r0 = r28.length()
            if (r0 <= 0) goto L_0x002b
            r0 = r28
            goto L_0x002d
        L_0x002b:
            r0 = r29
        L_0x002d:
            java.util.Map<java.lang.String, b.i.a.i$h> r3 = p005b.p080i.p081a.C1502i.C1510h.f2291M
            java.lang.Object r0 = r3.get(r0)
            b.i.a.i$h r0 = (p005b.p080i.p081a.C1502i.C1510h) r0
            if (r0 == 0) goto L_0x0038
            goto L_0x003a
        L_0x0038:
            b.i.a.i$h r0 = p005b.p080i.p081a.C1502i.C1510h.UNSUPPORTED
        L_0x003a:
            int r3 = r0.ordinal()
            java.lang.String r6 = "objectBoundingBox"
            java.lang.String r7 = "userSpaceOnUse"
            java.lang.String r9 = "http://www.w3.org/1999/xlink"
            r10 = 26
            r11 = 25
            java.lang.String r12 = "Invalid document. Root element must be <svg>"
            r13 = 57
            r14 = 56
            r15 = 0
            r8 = 0
            switch(r3) {
                case 0: goto L_0x0c28;
                case 1: goto L_0x0bfc;
                case 2: goto L_0x0b8a;
                case 3: goto L_0x0b22;
                case 4: goto L_0x0af9;
                case 5: goto L_0x0af3;
                case 6: goto L_0x0a6c;
                case 7: goto L_0x0bfc;
                case 8: goto L_0x0a67;
                case 9: goto L_0x0a03;
                case 10: goto L_0x099e;
                case 11: goto L_0x08da;
                case 12: goto L_0x08d5;
                case 13: goto L_0x05e2;
                case 14: goto L_0x04fe;
                case 15: goto L_0x04d1;
                case 16: goto L_0x04a4;
                case 17: goto L_0x041b;
                case 18: goto L_0x036b;
                case 19: goto L_0x0366;
                case 20: goto L_0x02c7;
                case 21: goto L_0x02c2;
                case 22: goto L_0x0296;
                case 23: goto L_0x026a;
                case 24: goto L_0x023b;
                case 25: goto L_0x01c0;
                case 26: goto L_0x0af3;
                case 27: goto L_0x0146;
                case 28: goto L_0x00fd;
                case 29: goto L_0x005e;
                case 30: goto L_0x0059;
                default: goto L_0x0053;
            }
        L_0x0053:
            r1.f2173c = r4
            r1.f2174d = r4
            goto L_0x0cad
        L_0x0059:
            r1.mo11406P(r2)
            goto L_0x0cad
        L_0x005e:
            b.i.a.f$i0 r0 = r1.f2172b
            if (r0 == 0) goto L_0x00f7
            b.i.a.f$d1 r0 = new b.i.a.f$d1
            r0.<init>()
            b.i.a.f r3 = r1.f2171a
            r0.f2065a = r3
            b.i.a.f$i0 r3 = r1.f2172b
            r0.f2066b = r3
            r1.mo11413j(r0, r2)
            r1.mo11416m(r0, r2)
            r1.mo11418o(r0, r2)
            r1.mo11412i(r0, r2)
        L_0x007b:
            int r3 = r30.getLength()
            if (r8 >= r3) goto L_0x00ee
            java.lang.String r3 = r2.getValue(r8)
            java.lang.String r3 = r3.trim()
            java.lang.String r4 = r2.getLocalName(r8)
            b.i.a.i$g r4 = p005b.p080i.p081a.C1502i.C1509g.m1743d(r4)
            int r4 = r4.ordinal()
            if (r4 == r11) goto L_0x00d7
            if (r4 == r10) goto L_0x00c0
            switch(r4) {
                case 81: goto L_0x00ab;
                case 82: goto L_0x00a4;
                case 83: goto L_0x009d;
                default: goto L_0x009c;
            }
        L_0x009c:
            goto L_0x00e3
        L_0x009d:
            b.i.a.f$o r3 = m1718z(r3)
            r0.f2019q = r3
            goto L_0x00e3
        L_0x00a4:
            b.i.a.f$o r3 = m1718z(r3)
            r0.f2018p = r3
            goto L_0x00e3
        L_0x00ab:
            b.i.a.f$o r3 = m1718z(r3)
            r0.f2020r = r3
            boolean r3 = r3.mo11331g()
            if (r3 != 0) goto L_0x00b8
            goto L_0x00e3
        L_0x00b8:
            b.i.a.h r0 = new b.i.a.h
            java.lang.String r2 = "Invalid <use> element. width cannot be negative"
            r0.<init>(r2)
            throw r0
        L_0x00c0:
            java.lang.String r4 = r2.getURI(r8)
            boolean r4 = r5.equals(r4)
            if (r4 != 0) goto L_0x00d4
            java.lang.String r4 = r2.getURI(r8)
            boolean r4 = r9.equals(r4)
            if (r4 == 0) goto L_0x00e3
        L_0x00d4:
            r0.f2017o = r3
            goto L_0x00e3
        L_0x00d7:
            b.i.a.f$o r3 = m1718z(r3)
            r0.f2021s = r3
            boolean r3 = r3.mo11331g()
            if (r3 != 0) goto L_0x00e6
        L_0x00e3:
            int r8 = r8 + 1
            goto L_0x007b
        L_0x00e6:
            b.i.a.h r0 = new b.i.a.h
            java.lang.String r2 = "Invalid <use> element. height cannot be negative"
            r0.<init>(r2)
            throw r0
        L_0x00ee:
            b.i.a.f$i0 r2 = r1.f2172b
            r2.mo11309f(r0)
            r1.f2172b = r0
            goto L_0x0cad
        L_0x00f7:
            b.i.a.h r0 = new b.i.a.h
            r0.<init>(r12)
            throw r0
        L_0x00fd:
            b.i.a.f$i0 r0 = r1.f2172b
            if (r0 == 0) goto L_0x0140
            boolean r0 = r0 instanceof p005b.p080i.p081a.C1422f.C1484x0
            if (r0 == 0) goto L_0x0138
            b.i.a.f$u0 r0 = new b.i.a.f$u0
            r0.<init>()
            b.i.a.f r3 = r1.f2171a
            r0.f2065a = r3
            b.i.a.f$i0 r3 = r1.f2172b
            r0.f2066b = r3
            r1.mo11413j(r0, r2)
            r1.mo11416m(r0, r2)
            r1.mo11412i(r0, r2)
            r1.mo11417n(r0, r2)
            b.i.a.f$i0 r2 = r1.f2172b
            r2.mo11309f(r0)
            r1.f2172b = r0
            b.i.a.f$i0 r2 = r0.f2066b
            boolean r3 = r2 instanceof p005b.p080i.p081a.C1422f.C1425a1
            if (r3 == 0) goto L_0x012e
            b.i.a.f$a1 r2 = (p005b.p080i.p081a.C1422f.C1425a1) r2
            goto L_0x0134
        L_0x012e:
            b.i.a.f$w0 r2 = (p005b.p080i.p081a.C1422f.C1482w0) r2
            b.i.a.f$a1 r2 = r2.mo11310k()
        L_0x0134:
            r0.f2102r = r2
            goto L_0x0cad
        L_0x0138:
            b.i.a.h r0 = new b.i.a.h
            java.lang.String r2 = "Invalid document. <tspan> elements are only valid inside <text> or other <tspan> elements."
            r0.<init>(r2)
            throw r0
        L_0x0140:
            b.i.a.h r0 = new b.i.a.h
            r0.<init>(r12)
            throw r0
        L_0x0146:
            b.i.a.f$i0 r0 = r1.f2172b
            if (r0 == 0) goto L_0x01ba
            boolean r0 = r0 instanceof p005b.p080i.p081a.C1422f.C1484x0
            if (r0 == 0) goto L_0x01b2
            b.i.a.f$t0 r0 = new b.i.a.f$t0
            r0.<init>()
            b.i.a.f r3 = r1.f2171a
            r0.f2065a = r3
            b.i.a.f$i0 r3 = r1.f2172b
            r0.f2066b = r3
            r1.mo11413j(r0, r2)
            r1.mo11416m(r0, r2)
            r1.mo11412i(r0, r2)
        L_0x0164:
            int r3 = r30.getLength()
            if (r8 >= r3) goto L_0x019a
            java.lang.String r3 = r2.getValue(r8)
            java.lang.String r3 = r3.trim()
            java.lang.String r4 = r2.getLocalName(r8)
            b.i.a.i$g r4 = p005b.p080i.p081a.C1502i.C1509g.m1743d(r4)
            int r4 = r4.ordinal()
            if (r4 == r10) goto L_0x0181
            goto L_0x0197
        L_0x0181:
            java.lang.String r4 = r2.getURI(r8)
            boolean r4 = r5.equals(r4)
            if (r4 != 0) goto L_0x0195
            java.lang.String r4 = r2.getURI(r8)
            boolean r4 = r9.equals(r4)
            if (r4 == 0) goto L_0x0197
        L_0x0195:
            r0.f2098n = r3
        L_0x0197:
            int r8 = r8 + 1
            goto L_0x0164
        L_0x019a:
            b.i.a.f$i0 r2 = r1.f2172b
            r2.mo11309f(r0)
            b.i.a.f$i0 r2 = r0.f2066b
            boolean r3 = r2 instanceof p005b.p080i.p081a.C1422f.C1425a1
            if (r3 == 0) goto L_0x01a8
            b.i.a.f$a1 r2 = (p005b.p080i.p081a.C1422f.C1425a1) r2
            goto L_0x01ae
        L_0x01a8:
            b.i.a.f$w0 r2 = (p005b.p080i.p081a.C1422f.C1482w0) r2
            b.i.a.f$a1 r2 = r2.mo11310k()
        L_0x01ae:
            r0.f2099o = r2
            goto L_0x0cad
        L_0x01b2:
            b.i.a.h r0 = new b.i.a.h
            java.lang.String r2 = "Invalid document. <tref> elements are only valid inside <text> or <tspan> elements."
            r0.<init>(r2)
            throw r0
        L_0x01ba:
            b.i.a.h r0 = new b.i.a.h
            r0.<init>(r12)
            throw r0
        L_0x01c0:
            b.i.a.f$i0 r0 = r1.f2172b
            if (r0 == 0) goto L_0x0235
            b.i.a.f$y0 r0 = new b.i.a.f$y0
            r0.<init>()
            b.i.a.f r3 = r1.f2171a
            r0.f2065a = r3
            b.i.a.f$i0 r3 = r1.f2172b
            r0.f2066b = r3
            r1.mo11413j(r0, r2)
            r1.mo11416m(r0, r2)
            r1.mo11412i(r0, r2)
        L_0x01da:
            int r3 = r30.getLength()
            if (r8 >= r3) goto L_0x021b
            java.lang.String r3 = r2.getValue(r8)
            java.lang.String r3 = r3.trim()
            java.lang.String r4 = r2.getLocalName(r8)
            b.i.a.i$g r4 = p005b.p080i.p081a.C1502i.C1509g.m1743d(r4)
            int r4 = r4.ordinal()
            if (r4 == r10) goto L_0x0202
            r6 = 61
            if (r4 == r6) goto L_0x01fb
            goto L_0x0218
        L_0x01fb:
            b.i.a.f$o r3 = m1718z(r3)
            r0.f2118o = r3
            goto L_0x0218
        L_0x0202:
            java.lang.String r4 = r2.getURI(r8)
            boolean r4 = r5.equals(r4)
            if (r4 != 0) goto L_0x0216
            java.lang.String r4 = r2.getURI(r8)
            boolean r4 = r9.equals(r4)
            if (r4 == 0) goto L_0x0218
        L_0x0216:
            r0.f2117n = r3
        L_0x0218:
            int r8 = r8 + 1
            goto L_0x01da
        L_0x021b:
            b.i.a.f$i0 r2 = r1.f2172b
            r2.mo11309f(r0)
            r1.f2172b = r0
            b.i.a.f$i0 r2 = r0.f2066b
            boolean r3 = r2 instanceof p005b.p080i.p081a.C1422f.C1425a1
            if (r3 == 0) goto L_0x022b
            b.i.a.f$a1 r2 = (p005b.p080i.p081a.C1422f.C1425a1) r2
            goto L_0x0231
        L_0x022b:
            b.i.a.f$w0 r2 = (p005b.p080i.p081a.C1422f.C1482w0) r2
            b.i.a.f$a1 r2 = r2.mo11310k()
        L_0x0231:
            r0.f2119p = r2
            goto L_0x0cad
        L_0x0235:
            b.i.a.h r0 = new b.i.a.h
            r0.<init>(r12)
            throw r0
        L_0x023b:
            b.i.a.f$i0 r0 = r1.f2172b
            if (r0 == 0) goto L_0x0264
            b.i.a.f$v0 r0 = new b.i.a.f$v0
            r0.<init>()
            b.i.a.f r3 = r1.f2171a
            r0.f2065a = r3
            b.i.a.f$i0 r3 = r1.f2172b
            r0.f2066b = r3
            r1.mo11413j(r0, r2)
            r1.mo11416m(r0, r2)
            r1.mo11418o(r0, r2)
            r1.mo11412i(r0, r2)
            r1.mo11417n(r0, r2)
            b.i.a.f$i0 r2 = r1.f2172b
            r2.mo11309f(r0)
            r1.f2172b = r0
            goto L_0x0cad
        L_0x0264:
            b.i.a.h r0 = new b.i.a.h
            r0.<init>(r12)
            throw r0
        L_0x026a:
            b.i.a.f$i0 r0 = r1.f2172b
            if (r0 == 0) goto L_0x0290
            b.i.a.f$s0 r0 = new b.i.a.f$s0
            r0.<init>()
            b.i.a.f r3 = r1.f2171a
            r0.f2065a = r3
            b.i.a.f$i0 r3 = r1.f2172b
            r0.f2066b = r3
            r1.mo11413j(r0, r2)
            r1.mo11416m(r0, r2)
            r1.mo11412i(r0, r2)
            r1.mo11419p(r0, r2)
            b.i.a.f$i0 r2 = r1.f2172b
            r2.mo11309f(r0)
            r1.f2172b = r0
            goto L_0x0cad
        L_0x0290:
            b.i.a.h r0 = new b.i.a.h
            r0.<init>(r12)
            throw r0
        L_0x0296:
            b.i.a.f$i0 r0 = r1.f2172b
            if (r0 == 0) goto L_0x02bc
            b.i.a.f$r0 r0 = new b.i.a.f$r0
            r0.<init>()
            b.i.a.f r3 = r1.f2171a
            r0.f2065a = r3
            b.i.a.f$i0 r3 = r1.f2172b
            r0.f2066b = r3
            r1.mo11413j(r0, r2)
            r1.mo11416m(r0, r2)
            r1.mo11418o(r0, r2)
            r1.mo11412i(r0, r2)
            b.i.a.f$i0 r2 = r1.f2172b
            r2.mo11309f(r0)
            r1.f2172b = r0
            goto L_0x0cad
        L_0x02bc:
            b.i.a.h r0 = new b.i.a.h
            r0.<init>(r12)
            throw r0
        L_0x02c2:
            r1.mo11403M(r2)
            goto L_0x0cad
        L_0x02c7:
            b.i.a.f$i0 r0 = r1.f2172b
            if (r0 == 0) goto L_0x0360
            boolean r3 = r0 instanceof p005b.p080i.p081a.C1422f.C1453i
            if (r3 == 0) goto L_0x0358
            b.i.a.f$c0 r3 = new b.i.a.f$c0
            r3.<init>()
            b.i.a.f r5 = r1.f2171a
            r3.f2065a = r5
            r3.f2066b = r0
            r1.mo11413j(r3, r2)
            r1.mo11416m(r3, r2)
            r0 = r8
        L_0x02e1:
            int r5 = r30.getLength()
            if (r0 >= r5) goto L_0x034f
            java.lang.String r5 = r2.getValue(r0)
            java.lang.String r5 = r5.trim()
            java.lang.String r6 = r2.getLocalName(r0)
            b.i.a.i$g r6 = p005b.p080i.p081a.C1502i.C1509g.m1743d(r6)
            int r6 = r6.ordinal()
            r7 = 39
            if (r6 == r7) goto L_0x0300
            goto L_0x0337
        L_0x0300:
            int r6 = r5.length()
            if (r6 == 0) goto L_0x0347
            int r6 = r5.length()
            int r7 = r5.length()
            int r7 = r7 - r4
            char r7 = r5.charAt(r7)
            r9 = 37
            if (r7 != r9) goto L_0x031b
            int r6 = r6 + -1
            r7 = r4
            goto L_0x031c
        L_0x031b:
            r7 = r8
        L_0x031c:
            float r6 = m1714v(r5, r8, r6)     // Catch:{ NumberFormatException -> 0x033a }
            r9 = 1120403456(0x42c80000, float:100.0)
            if (r7 == 0) goto L_0x0325
            float r6 = r6 / r9
        L_0x0325:
            int r7 = (r6 > r15 ? 1 : (r6 == r15 ? 0 : -1))
            if (r7 >= 0) goto L_0x032b
            r9 = r15
            goto L_0x0331
        L_0x032b:
            int r7 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r7 <= 0) goto L_0x0330
            goto L_0x0331
        L_0x0330:
            r9 = r6
        L_0x0331:
            java.lang.Float r5 = java.lang.Float.valueOf(r9)     // Catch:{ NumberFormatException -> 0x033a }
            r3.f1931h = r5
        L_0x0337:
            int r0 = r0 + 1
            goto L_0x02e1
        L_0x033a:
            r0 = move-exception
            b.i.a.h r2 = new b.i.a.h
            java.lang.String r3 = "Invalid offset value in <stop>: "
            java.lang.String r3 = p005b.p035e.p036a.p037a.C0843a.m451l(r3, r5)
            r2.<init>(r3, r0)
            throw r2
        L_0x0347:
            b.i.a.h r0 = new b.i.a.h
            java.lang.String r2 = "Invalid offset value in <stop> (empty string)"
            r0.<init>(r2)
            throw r0
        L_0x034f:
            b.i.a.f$i0 r0 = r1.f2172b
            r0.mo11309f(r3)
            r1.f2172b = r3
            goto L_0x0cad
        L_0x0358:
            b.i.a.h r0 = new b.i.a.h
            java.lang.String r2 = "Invalid document. <stop> elements are only valid inside <linearGradient> or <radialGradient> elements."
            r0.<init>(r2)
            throw r0
        L_0x0360:
            b.i.a.h r0 = new b.i.a.h
            r0.<init>(r12)
            throw r0
        L_0x0366:
            r1.mo11401K(r2)
            goto L_0x0cad
        L_0x036b:
            b.i.a.f$i0 r0 = r1.f2172b
            if (r0 == 0) goto L_0x0415
            b.i.a.f$a0 r3 = new b.i.a.f$a0
            r3.<init>()
            b.i.a.f r4 = r1.f2171a
            r3.f2065a = r4
            r3.f2066b = r0
            r1.mo11413j(r3, r2)
            r1.mo11416m(r3, r2)
            r1.mo11418o(r3, r2)
            r1.mo11412i(r3, r2)
        L_0x0386:
            int r0 = r30.getLength()
            if (r8 >= r0) goto L_0x040e
            java.lang.String r0 = r2.getValue(r8)
            java.lang.String r0 = r0.trim()
            java.lang.String r4 = r2.getLocalName(r8)
            b.i.a.i$g r4 = p005b.p080i.p081a.C1502i.C1509g.m1743d(r4)
            int r4 = r4.ordinal()
            if (r4 == r11) goto L_0x03f7
            if (r4 == r14) goto L_0x03e2
            if (r4 == r13) goto L_0x03cd
            switch(r4) {
                case 81: goto L_0x03b8;
                case 82: goto L_0x03b1;
                case 83: goto L_0x03aa;
                default: goto L_0x03a9;
            }
        L_0x03a9:
            goto L_0x0403
        L_0x03aa:
            b.i.a.f$o r0 = m1718z(r0)
            r3.f1918p = r0
            goto L_0x0403
        L_0x03b1:
            b.i.a.f$o r0 = m1718z(r0)
            r3.f1917o = r0
            goto L_0x0403
        L_0x03b8:
            b.i.a.f$o r0 = m1718z(r0)
            r3.f1919q = r0
            boolean r0 = r0.mo11331g()
            if (r0 != 0) goto L_0x03c5
            goto L_0x0403
        L_0x03c5:
            b.i.a.h r0 = new b.i.a.h
            java.lang.String r2 = "Invalid <rect> element. width cannot be negative"
            r0.<init>(r2)
            throw r0
        L_0x03cd:
            b.i.a.f$o r0 = m1718z(r0)
            r3.f1922t = r0
            boolean r0 = r0.mo11331g()
            if (r0 != 0) goto L_0x03da
            goto L_0x0403
        L_0x03da:
            b.i.a.h r0 = new b.i.a.h
            java.lang.String r2 = "Invalid <rect> element. ry cannot be negative"
            r0.<init>(r2)
            throw r0
        L_0x03e2:
            b.i.a.f$o r0 = m1718z(r0)
            r3.f1921s = r0
            boolean r0 = r0.mo11331g()
            if (r0 != 0) goto L_0x03ef
            goto L_0x0403
        L_0x03ef:
            b.i.a.h r0 = new b.i.a.h
            java.lang.String r2 = "Invalid <rect> element. rx cannot be negative"
            r0.<init>(r2)
            throw r0
        L_0x03f7:
            b.i.a.f$o r0 = m1718z(r0)
            r3.f1920r = r0
            boolean r0 = r0.mo11331g()
            if (r0 != 0) goto L_0x0406
        L_0x0403:
            int r8 = r8 + 1
            goto L_0x0386
        L_0x0406:
            b.i.a.h r0 = new b.i.a.h
            java.lang.String r2 = "Invalid <rect> element. height cannot be negative"
            r0.<init>(r2)
            throw r0
        L_0x040e:
            b.i.a.f$i0 r0 = r1.f2172b
            r0.mo11309f(r3)
            goto L_0x0cad
        L_0x0415:
            b.i.a.h r0 = new b.i.a.h
            r0.<init>(r12)
            throw r0
        L_0x041b:
            b.i.a.f$i0 r0 = r1.f2172b
            if (r0 == 0) goto L_0x049e
            b.i.a.f$p0 r0 = new b.i.a.f$p0
            r0.<init>()
            b.i.a.f r3 = r1.f2171a
            r0.f2065a = r3
            b.i.a.f$i0 r3 = r1.f2172b
            r0.f2066b = r3
            r1.mo11413j(r0, r2)
            r1.mo11416m(r0, r2)
            r1.mo11414k(r0, r2)
        L_0x0435:
            int r3 = r30.getLength()
            if (r8 >= r3) goto L_0x0495
            java.lang.String r3 = r2.getValue(r8)
            java.lang.String r3 = r3.trim()
            java.lang.String r4 = r2.getLocalName(r8)
            b.i.a.i$g r4 = p005b.p080i.p081a.C1502i.C1509g.m1743d(r4)
            int r4 = r4.ordinal()
            r5 = 6
            if (r4 == r5) goto L_0x048c
            r5 = 7
            if (r4 == r5) goto L_0x0485
            r5 = 11
            if (r4 == r5) goto L_0x047e
            r5 = 12
            if (r4 == r5) goto L_0x0477
            r5 = 49
            if (r4 == r5) goto L_0x0462
            goto L_0x0492
        L_0x0462:
            b.i.a.f$o r3 = m1718z(r3)
            r0.f2082o = r3
            boolean r3 = r3.mo11331g()
            if (r3 != 0) goto L_0x046f
            goto L_0x0492
        L_0x046f:
            b.i.a.h r0 = new b.i.a.h
            java.lang.String r2 = "Invalid <radialGradient> element. r cannot be negative"
            r0.<init>(r2)
            throw r0
        L_0x0477:
            b.i.a.f$o r3 = m1718z(r3)
            r0.f2084q = r3
            goto L_0x0492
        L_0x047e:
            b.i.a.f$o r3 = m1718z(r3)
            r0.f2083p = r3
            goto L_0x0492
        L_0x0485:
            b.i.a.f$o r3 = m1718z(r3)
            r0.f2081n = r3
            goto L_0x0492
        L_0x048c:
            b.i.a.f$o r3 = m1718z(r3)
            r0.f2080m = r3
        L_0x0492:
            int r8 = r8 + 1
            goto L_0x0435
        L_0x0495:
            b.i.a.f$i0 r2 = r1.f2172b
            r2.mo11309f(r0)
            r1.f2172b = r0
            goto L_0x0cad
        L_0x049e:
            b.i.a.h r0 = new b.i.a.h
            r0.<init>(r12)
            throw r0
        L_0x04a4:
            b.i.a.f$i0 r0 = r1.f2172b
            if (r0 == 0) goto L_0x04cb
            b.i.a.f$y r3 = new b.i.a.f$y
            r3.<init>()
            b.i.a.f r4 = r1.f2171a
            r3.f2065a = r4
            r3.f2066b = r0
            r1.mo11413j(r3, r2)
            r1.mo11416m(r3, r2)
            r1.mo11418o(r3, r2)
            r1.mo11412i(r3, r2)
            java.lang.String r0 = "polyline"
            r1.mo11415l(r3, r2, r0)
            b.i.a.f$i0 r0 = r1.f2172b
            r0.mo11309f(r3)
            goto L_0x0cad
        L_0x04cb:
            b.i.a.h r0 = new b.i.a.h
            r0.<init>(r12)
            throw r0
        L_0x04d1:
            b.i.a.f$i0 r0 = r1.f2172b
            if (r0 == 0) goto L_0x04f8
            b.i.a.f$z r3 = new b.i.a.f$z
            r3.<init>()
            b.i.a.f r4 = r1.f2171a
            r3.f2065a = r4
            r3.f2066b = r0
            r1.mo11413j(r3, r2)
            r1.mo11416m(r3, r2)
            r1.mo11418o(r3, r2)
            r1.mo11412i(r3, r2)
            java.lang.String r0 = "polygon"
            r1.mo11415l(r3, r2, r0)
            b.i.a.f$i0 r0 = r1.f2172b
            r0.mo11309f(r3)
            goto L_0x0cad
        L_0x04f8:
            b.i.a.h r0 = new b.i.a.h
            r0.<init>(r12)
            throw r0
        L_0x04fe:
            b.i.a.f$i0 r0 = r1.f2172b
            if (r0 == 0) goto L_0x05dc
            b.i.a.f$x r0 = new b.i.a.f$x
            r0.<init>()
            b.i.a.f r3 = r1.f2171a
            r0.f2065a = r3
            b.i.a.f$i0 r3 = r1.f2172b
            r0.f2066b = r3
            r1.mo11413j(r0, r2)
            r1.mo11416m(r0, r2)
            r1.mo11412i(r0, r2)
            r1.mo11419p(r0, r2)
        L_0x051b:
            int r3 = r30.getLength()
            if (r8 >= r3) goto L_0x05d3
            java.lang.String r3 = r2.getValue(r8)
            java.lang.String r3 = r3.trim()
            java.lang.String r4 = r2.getLocalName(r8)
            b.i.a.i$g r4 = p005b.p080i.p081a.C1502i.C1509g.m1743d(r4)
            int r4 = r4.ordinal()
            if (r4 == r11) goto L_0x05bb
            if (r4 == r10) goto L_0x05a4
            switch(r4) {
                case 44: goto L_0x0565;
                case 45: goto L_0x055e;
                case 46: goto L_0x0541;
                default: goto L_0x053c;
            }
        L_0x053c:
            switch(r4) {
                case 81: goto L_0x058f;
                case 82: goto L_0x0588;
                case 83: goto L_0x0581;
                default: goto L_0x053f;
            }
        L_0x053f:
            goto L_0x05c7
        L_0x0541:
            boolean r4 = r6.equals(r3)
            if (r4 == 0) goto L_0x054a
            java.lang.Boolean r3 = java.lang.Boolean.FALSE
            goto L_0x0552
        L_0x054a:
            boolean r3 = r7.equals(r3)
            if (r3 == 0) goto L_0x0556
            java.lang.Boolean r3 = java.lang.Boolean.TRUE
        L_0x0552:
            r0.f2108p = r3
            goto L_0x05c7
        L_0x0556:
            b.i.a.h r0 = new b.i.a.h
            java.lang.String r2 = "Invalid value for attribute patternUnits"
            r0.<init>(r2)
            throw r0
        L_0x055e:
            android.graphics.Matrix r3 = r1.mo11398G(r3)
            r0.f2110r = r3
            goto L_0x05c7
        L_0x0565:
            boolean r4 = r6.equals(r3)
            if (r4 == 0) goto L_0x056e
            java.lang.Boolean r3 = java.lang.Boolean.FALSE
            goto L_0x0576
        L_0x056e:
            boolean r3 = r7.equals(r3)
            if (r3 == 0) goto L_0x0579
            java.lang.Boolean r3 = java.lang.Boolean.TRUE
        L_0x0576:
            r0.f2109q = r3
            goto L_0x05c7
        L_0x0579:
            b.i.a.h r0 = new b.i.a.h
            java.lang.String r2 = "Invalid value for attribute patternContentUnits"
            r0.<init>(r2)
            throw r0
        L_0x0581:
            b.i.a.f$o r3 = m1718z(r3)
            r0.f2112t = r3
            goto L_0x05c7
        L_0x0588:
            b.i.a.f$o r3 = m1718z(r3)
            r0.f2111s = r3
            goto L_0x05c7
        L_0x058f:
            b.i.a.f$o r3 = m1718z(r3)
            r0.f2113u = r3
            boolean r3 = r3.mo11331g()
            if (r3 != 0) goto L_0x059c
            goto L_0x05c7
        L_0x059c:
            b.i.a.h r0 = new b.i.a.h
            java.lang.String r2 = "Invalid <pattern> element. width cannot be negative"
            r0.<init>(r2)
            throw r0
        L_0x05a4:
            java.lang.String r4 = r2.getURI(r8)
            boolean r4 = r5.equals(r4)
            if (r4 != 0) goto L_0x05b8
            java.lang.String r4 = r2.getURI(r8)
            boolean r4 = r9.equals(r4)
            if (r4 == 0) goto L_0x05c7
        L_0x05b8:
            r0.f2115w = r3
            goto L_0x05c7
        L_0x05bb:
            b.i.a.f$o r3 = m1718z(r3)
            r0.f2114v = r3
            boolean r3 = r3.mo11331g()
            if (r3 != 0) goto L_0x05cb
        L_0x05c7:
            int r8 = r8 + 1
            goto L_0x051b
        L_0x05cb:
            b.i.a.h r0 = new b.i.a.h
            java.lang.String r2 = "Invalid <pattern> element. height cannot be negative"
            r0.<init>(r2)
            throw r0
        L_0x05d3:
            b.i.a.f$i0 r2 = r1.f2172b
            r2.mo11309f(r0)
            r1.f2172b = r0
            goto L_0x0cad
        L_0x05dc:
            b.i.a.h r0 = new b.i.a.h
            r0.<init>(r12)
            throw r0
        L_0x05e2:
            b.i.a.f$i0 r0 = r1.f2172b
            if (r0 == 0) goto L_0x08cf
            b.i.a.f$u r3 = new b.i.a.f$u
            r3.<init>()
            b.i.a.f r4 = r1.f2171a
            r3.f2065a = r4
            r3.f2066b = r0
            r1.mo11413j(r3, r2)
            r1.mo11416m(r3, r2)
            r1.mo11418o(r3, r2)
            r1.mo11412i(r3, r2)
        L_0x05fd:
            int r0 = r30.getLength()
            if (r8 >= r0) goto L_0x08c8
            java.lang.String r0 = r2.getValue(r8)
            java.lang.String r0 = r0.trim()
            java.lang.String r4 = r2.getLocalName(r8)
            b.i.a.i$g r4 = p005b.p080i.p081a.C1502i.C1509g.m1743d(r4)
            int r4 = r4.ordinal()
            r5 = 13
            if (r4 == r5) goto L_0x063e
            r5 = 43
            if (r4 == r5) goto L_0x0623
        L_0x061f:
            r24 = r15
            goto L_0x08c2
        L_0x0623:
            float r0 = m1713u(r0)
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            r3.f2101p = r0
            float r0 = r0.floatValue()
            int r0 = (r0 > r15 ? 1 : (r0 == r15 ? 0 : -1))
            if (r0 < 0) goto L_0x0636
            goto L_0x061f
        L_0x0636:
            b.i.a.h r0 = new b.i.a.h
            java.lang.String r2 = "Invalid <path> element. pathLength cannot be negative"
            r0.<init>(r2)
            throw r0
        L_0x063e:
            b.i.a.i$i r4 = new b.i.a.i$i
            r4.<init>(r0)
            b.i.a.f$v r0 = new b.i.a.f$v
            r0.<init>()
            boolean r5 = r4.mo11432f()
            if (r5 == 0) goto L_0x0652
        L_0x064e:
            r24 = r15
            goto L_0x08c0
        L_0x0652:
            java.lang.Integer r5 = r4.mo11434h()
            int r5 = r5.intValue()
            r6 = 77
            r7 = 109(0x6d, float:1.53E-43)
            if (r5 == r6) goto L_0x0663
            if (r5 == r7) goto L_0x0663
            goto L_0x064e
        L_0x0663:
            r6 = r15
            r9 = r6
            r10 = r9
            r11 = r10
            r12 = r11
            r13 = r12
        L_0x0669:
            r4.mo11444r()
            r14 = 108(0x6c, float:1.51E-43)
            r16 = 1073741824(0x40000000, float:2.0)
            switch(r5) {
                case 65: goto L_0x0807;
                case 67: goto L_0x07ad;
                case 72: goto L_0x0788;
                case 76: goto L_0x0764;
                case 77: goto L_0x0733;
                case 81: goto L_0x06ff;
                case 83: goto L_0x06c7;
                case 84: goto L_0x069d;
                case 86: goto L_0x0681;
                case 90: goto L_0x0674;
                case 97: goto L_0x0807;
                case 99: goto L_0x07ad;
                case 104: goto L_0x0788;
                case 108: goto L_0x0764;
                case 109: goto L_0x0733;
                case 113: goto L_0x06ff;
                case 115: goto L_0x06c7;
                case 116: goto L_0x069d;
                case 118: goto L_0x0681;
                case 122: goto L_0x0674;
                default: goto L_0x0673;
            }
        L_0x0673:
            goto L_0x064e
        L_0x0674:
            r6 = 8
            r0.mo11341f(r6)
            r28 = r12
            r6 = r28
            r9 = r6
            r11 = r13
            goto L_0x0783
        L_0x0681:
            float r11 = r4.mo11435i()
            boolean r14 = java.lang.Float.isNaN(r11)
            if (r14 == 0) goto L_0x0691
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            goto L_0x06b7
        L_0x0691:
            r14 = 118(0x76, float:1.65E-43)
            if (r5 != r14) goto L_0x0696
            float r11 = r11 + r10
        L_0x0696:
            r0.mo11340e(r6, r11)
            r28 = r12
            goto L_0x0783
        L_0x069d:
            float r14 = r6 * r16
            float r14 = r14 - r9
            float r16 = r16 * r10
            float r16 = r16 - r11
            float r9 = r4.mo11435i()
            float r11 = r4.mo11429c(r9)
            boolean r17 = java.lang.Float.isNaN(r11)
            if (r17 == 0) goto L_0x06bb
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
        L_0x06b7:
            r24 = r15
            goto L_0x08a9
        L_0x06bb:
            r15 = 116(0x74, float:1.63E-43)
            if (r5 != r15) goto L_0x06c1
            float r9 = r9 + r6
            float r11 = r11 + r10
        L_0x06c1:
            r10 = r11
            r28 = r12
            r11 = r16
            goto L_0x072c
        L_0x06c7:
            float r7 = r6 * r16
            float r7 = r7 - r9
            float r16 = r16 * r10
            float r16 = r16 - r11
            float r9 = r4.mo11435i()
            float r11 = r4.mo11429c(r9)
            float r14 = r4.mo11429c(r11)
            float r15 = r4.mo11429c(r14)
            boolean r17 = java.lang.Float.isNaN(r15)
            if (r17 == 0) goto L_0x06eb
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            goto L_0x07d2
        L_0x06eb:
            r28 = r7
            r7 = 115(0x73, float:1.61E-43)
            if (r5 != r7) goto L_0x06f5
            float r14 = r14 + r6
            float r15 = r15 + r10
            float r9 = r9 + r6
            float r11 = r11 + r10
        L_0x06f5:
            r17 = r28
            r28 = r12
            r29 = r13
            r18 = r16
            goto L_0x07e8
        L_0x06ff:
            float r9 = r4.mo11435i()
            float r11 = r4.mo11429c(r9)
            float r14 = r4.mo11429c(r11)
            float r15 = r4.mo11429c(r14)
            boolean r16 = java.lang.Float.isNaN(r15)
            if (r16 == 0) goto L_0x071c
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            goto L_0x07d2
        L_0x071c:
            r28 = r12
            r12 = 113(0x71, float:1.58E-43)
            if (r5 != r12) goto L_0x0726
            float r14 = r14 + r6
            float r15 = r15 + r10
            float r9 = r9 + r6
            float r11 = r11 + r10
        L_0x0726:
            r25 = r14
            r14 = r9
            r9 = r25
            r10 = r15
        L_0x072c:
            r0.mo11339d(r14, r11, r9, r10)
            r12 = r28
            goto L_0x07a5
        L_0x0733:
            float r9 = r4.mo11435i()
            float r11 = r4.mo11429c(r9)
            boolean r12 = java.lang.Float.isNaN(r11)
            if (r12 == 0) goto L_0x0748
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            goto L_0x07d2
        L_0x0748:
            if (r5 != r7) goto L_0x0755
            int r12 = r0.f2104b
            if (r12 != 0) goto L_0x0750
            r12 = 1
            goto L_0x0751
        L_0x0750:
            r12 = 0
        L_0x0751:
            if (r12 != 0) goto L_0x0755
            float r9 = r9 + r6
            float r11 = r11 + r10
        L_0x0755:
            r12 = r9
            r10 = r11
            r0.mo11335a(r12, r10)
            if (r5 != r7) goto L_0x075e
            r5 = r14
            goto L_0x0760
        L_0x075e:
            r5 = 76
        L_0x0760:
            r11 = r10
            r13 = r11
            r9 = r12
            goto L_0x07a4
        L_0x0764:
            r28 = r12
            float r9 = r4.mo11435i()
            float r11 = r4.mo11429c(r9)
            boolean r12 = java.lang.Float.isNaN(r11)
            if (r12 == 0) goto L_0x077a
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            goto L_0x07d2
        L_0x077a:
            if (r5 != r14) goto L_0x077e
            float r9 = r9 + r6
            float r11 = r11 + r10
        L_0x077e:
            r6 = r9
            r0.mo11340e(r6, r11)
            r9 = r6
        L_0x0783:
            r12 = r28
            r10 = r11
            goto L_0x07fe
        L_0x0788:
            r28 = r12
            float r9 = r4.mo11435i()
            boolean r12 = java.lang.Float.isNaN(r9)
            if (r12 == 0) goto L_0x079a
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            goto L_0x07d2
        L_0x079a:
            r12 = 104(0x68, float:1.46E-43)
            if (r5 != r12) goto L_0x079f
            float r9 = r9 + r6
        L_0x079f:
            r0.mo11340e(r9, r10)
            r12 = r28
        L_0x07a4:
            r14 = r9
        L_0x07a5:
            r6 = r9
            r9 = r14
            r25 = r11
            r11 = r10
            r10 = r25
            goto L_0x07fe
        L_0x07ad:
            r28 = r12
            float r7 = r4.mo11435i()
            float r9 = r4.mo11429c(r7)
            float r11 = r4.mo11429c(r9)
            float r12 = r4.mo11429c(r11)
            float r14 = r4.mo11429c(r12)
            float r15 = r4.mo11429c(r14)
            boolean r16 = java.lang.Float.isNaN(r15)
            if (r16 == 0) goto L_0x07d6
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
        L_0x07d2:
            r24 = 0
            goto L_0x08a9
        L_0x07d6:
            r29 = r13
            r13 = 99
            if (r5 != r13) goto L_0x07e2
            float r14 = r14 + r6
            float r15 = r15 + r10
            float r7 = r7 + r6
            float r9 = r9 + r10
            float r11 = r11 + r6
            float r12 = r12 + r10
        L_0x07e2:
            r17 = r7
            r18 = r9
            r9 = r11
            r11 = r12
        L_0x07e8:
            r7 = 109(0x6d, float:1.53E-43)
            r16 = r0
            r19 = r9
            r20 = r11
            r21 = r14
            r22 = r15
            r16.mo11336b(r17, r18, r19, r20, r21, r22)
            r12 = r28
            r13 = r29
            r10 = r11
            r6 = r14
            r11 = r15
        L_0x07fe:
            r24 = 0
            r25 = r11
            r11 = r10
            r10 = r25
            goto L_0x086c
        L_0x0807:
            r28 = r12
            r29 = r13
            float r9 = r4.mo11435i()
            float r11 = r4.mo11429c(r9)
            float r19 = r4.mo11429c(r11)
            java.lang.Float r12 = java.lang.Float.valueOf(r19)
            java.lang.Boolean r12 = r4.mo11428b(r12)
            java.lang.Boolean r13 = r4.mo11428b(r12)
            if (r13 != 0) goto L_0x0828
            r14 = 2143289344(0x7fc00000, float:NaN)
            goto L_0x082f
        L_0x0828:
            r4.mo11443q()
            float r14 = r4.mo11435i()
        L_0x082f:
            float r15 = r4.mo11429c(r14)
            boolean r16 = java.lang.Float.isNaN(r15)
            r24 = 0
            if (r16 != 0) goto L_0x08a4
            int r16 = (r9 > r24 ? 1 : (r9 == r24 ? 0 : -1))
            if (r16 < 0) goto L_0x08a4
            int r16 = (r11 > r24 ? 1 : (r11 == r24 ? 0 : -1))
            if (r16 >= 0) goto L_0x0845
            goto L_0x08a4
        L_0x0845:
            r27 = r7
            r7 = 97
            if (r5 != r7) goto L_0x084d
            float r14 = r14 + r6
            float r15 = r15 + r10
        L_0x084d:
            boolean r20 = r12.booleanValue()
            boolean r21 = r13.booleanValue()
            r16 = r0
            r17 = r9
            r18 = r11
            r22 = r14
            r23 = r15
            r16.mo11337c(r17, r18, r19, r20, r21, r22, r23)
            r7 = r27
            r12 = r28
            r13 = r29
            r6 = r14
            r9 = r6
            r10 = r15
            r11 = r10
        L_0x086c:
            r4.mo11443q()
            boolean r14 = r4.mo11432f()
            if (r14 == 0) goto L_0x0876
            goto L_0x08c0
        L_0x0876:
            int r14 = r4.f2314b
            int r15 = r4.f2315c
            if (r14 != r15) goto L_0x087d
            goto L_0x0895
        L_0x087d:
            java.lang.String r15 = r4.f2313a
            char r14 = r15.charAt(r14)
            r15 = 97
            if (r14 < r15) goto L_0x088b
            r15 = 122(0x7a, float:1.71E-43)
            if (r14 <= r15) goto L_0x0893
        L_0x088b:
            r15 = 65
            if (r14 < r15) goto L_0x0895
            r15 = 90
            if (r14 > r15) goto L_0x0895
        L_0x0893:
            r14 = 1
            goto L_0x0896
        L_0x0895:
            r14 = 0
        L_0x0896:
            if (r14 == 0) goto L_0x08a0
            java.lang.Integer r5 = r4.mo11434h()
            int r5 = r5.intValue()
        L_0x08a0:
            r15 = r24
            goto L_0x0669
        L_0x08a4:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
        L_0x08a9:
            java.lang.String r6 = "Bad path coords for "
            r4.append(r6)
            char r5 = (char) r5
            r4.append(r5)
            java.lang.String r5 = " path segment"
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            java.lang.String r5 = "SVGParser"
            android.util.Log.e(r5, r4)
        L_0x08c0:
            r3.f2100o = r0
        L_0x08c2:
            int r8 = r8 + 1
            r15 = r24
            goto L_0x05fd
        L_0x08c8:
            b.i.a.f$i0 r0 = r1.f2172b
            r0.mo11309f(r3)
            goto L_0x0cad
        L_0x08cf:
            b.i.a.h r0 = new b.i.a.h
            r0.<init>(r12)
            throw r0
        L_0x08d5:
            r1.mo11410g(r2)
            goto L_0x0cad
        L_0x08da:
            b.i.a.f$i0 r0 = r1.f2172b
            if (r0 == 0) goto L_0x0998
            b.i.a.f$q r0 = new b.i.a.f$q
            r0.<init>()
            b.i.a.f r3 = r1.f2171a
            r0.f2065a = r3
            b.i.a.f$i0 r3 = r1.f2172b
            r0.f2066b = r3
            r1.mo11413j(r0, r2)
            r1.mo11416m(r0, r2)
            r1.mo11412i(r0, r2)
            r1.mo11419p(r0, r2)
            r3 = 0
        L_0x08f8:
            int r4 = r30.getLength()
            if (r3 >= r4) goto L_0x098f
            java.lang.String r4 = r2.getValue(r3)
            java.lang.String r4 = r4.trim()
            java.lang.String r5 = r2.getLocalName(r3)
            b.i.a.i$g r5 = p005b.p080i.p081a.C1502i.C1509g.m1743d(r5)
            int r5 = r5.ordinal()
            r6 = 41
            if (r5 == r6) goto L_0x0976
            r6 = 50
            if (r5 == r6) goto L_0x096f
            r6 = 51
            if (r5 == r6) goto L_0x0968
            switch(r5) {
                case 32: goto L_0x0953;
                case 33: goto L_0x0937;
                case 34: goto L_0x0922;
                default: goto L_0x0921;
            }
        L_0x0921:
            goto L_0x098b
        L_0x0922:
            b.i.a.f$o r4 = m1718z(r4)
            r0.f2088s = r4
            boolean r4 = r4.mo11331g()
            if (r4 != 0) goto L_0x092f
            goto L_0x098b
        L_0x092f:
            b.i.a.h r0 = new b.i.a.h
            java.lang.String r2 = "Invalid <marker> element. markerWidth cannot be negative"
            r0.<init>(r2)
            throw r0
        L_0x0937:
            java.lang.String r5 = "strokeWidth"
            boolean r5 = r5.equals(r4)
            if (r5 == 0) goto L_0x0943
            r4 = 0
        L_0x0940:
            r0.f2085p = r4
            goto L_0x098b
        L_0x0943:
            boolean r4 = r7.equals(r4)
            if (r4 == 0) goto L_0x094b
            r4 = 1
            goto L_0x0940
        L_0x094b:
            b.i.a.h r0 = new b.i.a.h
            java.lang.String r2 = "Invalid value for attribute markerUnits"
            r0.<init>(r2)
            throw r0
        L_0x0953:
            b.i.a.f$o r4 = m1718z(r4)
            r0.f2089t = r4
            boolean r4 = r4.mo11331g()
            if (r4 != 0) goto L_0x0960
            goto L_0x098b
        L_0x0960:
            b.i.a.h r0 = new b.i.a.h
            java.lang.String r2 = "Invalid <marker> element. markerHeight cannot be negative"
            r0.<init>(r2)
            throw r0
        L_0x0968:
            b.i.a.f$o r4 = m1718z(r4)
            r0.f2087r = r4
            goto L_0x098b
        L_0x096f:
            b.i.a.f$o r4 = m1718z(r4)
            r0.f2086q = r4
            goto L_0x098b
        L_0x0976:
            java.lang.String r5 = "auto"
            boolean r5 = r5.equals(r4)
            if (r5 == 0) goto L_0x0981
            r4 = 2143289344(0x7fc00000, float:NaN)
            goto L_0x0985
        L_0x0981:
            float r4 = m1713u(r4)
        L_0x0985:
            java.lang.Float r4 = java.lang.Float.valueOf(r4)
            r0.f2090u = r4
        L_0x098b:
            int r3 = r3 + 1
            goto L_0x08f8
        L_0x098f:
            b.i.a.f$i0 r2 = r1.f2172b
            r2.mo11309f(r0)
            r1.f2172b = r0
            goto L_0x0cad
        L_0x0998:
            b.i.a.h r0 = new b.i.a.h
            r0.<init>(r12)
            throw r0
        L_0x099e:
            b.i.a.f$i0 r0 = r1.f2172b
            if (r0 == 0) goto L_0x09fd
            b.i.a.f$l0 r0 = new b.i.a.f$l0
            r0.<init>()
            b.i.a.f r3 = r1.f2171a
            r0.f2065a = r3
            b.i.a.f$i0 r3 = r1.f2172b
            r0.f2066b = r3
            r1.mo11413j(r0, r2)
            r1.mo11416m(r0, r2)
            r1.mo11414k(r0, r2)
        L_0x09b8:
            int r3 = r30.getLength()
            if (r8 >= r3) goto L_0x09f4
            java.lang.String r3 = r2.getValue(r8)
            java.lang.String r3 = r3.trim()
            java.lang.String r4 = r2.getLocalName(r8)
            b.i.a.i$g r4 = p005b.p080i.p081a.C1502i.C1509g.m1743d(r4)
            int r4 = r4.ordinal()
            switch(r4) {
                case 84: goto L_0x09eb;
                case 85: goto L_0x09e4;
                case 86: goto L_0x09dd;
                case 87: goto L_0x09d6;
                default: goto L_0x09d5;
            }
        L_0x09d5:
            goto L_0x09f1
        L_0x09d6:
            b.i.a.f$o r3 = m1718z(r3)
            r0.f2064p = r3
            goto L_0x09f1
        L_0x09dd:
            b.i.a.f$o r3 = m1718z(r3)
            r0.f2063o = r3
            goto L_0x09f1
        L_0x09e4:
            b.i.a.f$o r3 = m1718z(r3)
            r0.f2062n = r3
            goto L_0x09f1
        L_0x09eb:
            b.i.a.f$o r3 = m1718z(r3)
            r0.f2061m = r3
        L_0x09f1:
            int r8 = r8 + 1
            goto L_0x09b8
        L_0x09f4:
            b.i.a.f$i0 r2 = r1.f2172b
            r2.mo11309f(r0)
            r1.f2172b = r0
            goto L_0x0cad
        L_0x09fd:
            b.i.a.h r0 = new b.i.a.h
            r0.<init>(r12)
            throw r0
        L_0x0a03:
            b.i.a.f$i0 r0 = r1.f2172b
            if (r0 == 0) goto L_0x0a61
            b.i.a.f$p r3 = new b.i.a.f$p
            r3.<init>()
            b.i.a.f r4 = r1.f2171a
            r3.f2065a = r4
            r3.f2066b = r0
            r1.mo11413j(r3, r2)
            r1.mo11416m(r3, r2)
            r1.mo11418o(r3, r2)
            r1.mo11412i(r3, r2)
        L_0x0a1e:
            int r0 = r30.getLength()
            if (r8 >= r0) goto L_0x0a5a
            java.lang.String r0 = r2.getValue(r8)
            java.lang.String r0 = r0.trim()
            java.lang.String r4 = r2.getLocalName(r8)
            b.i.a.i$g r4 = p005b.p080i.p081a.C1502i.C1509g.m1743d(r4)
            int r4 = r4.ordinal()
            switch(r4) {
                case 84: goto L_0x0a51;
                case 85: goto L_0x0a4a;
                case 86: goto L_0x0a43;
                case 87: goto L_0x0a3c;
                default: goto L_0x0a3b;
            }
        L_0x0a3b:
            goto L_0x0a57
        L_0x0a3c:
            b.i.a.f$o r0 = m1718z(r0)
            r3.f2079r = r0
            goto L_0x0a57
        L_0x0a43:
            b.i.a.f$o r0 = m1718z(r0)
            r3.f2078q = r0
            goto L_0x0a57
        L_0x0a4a:
            b.i.a.f$o r0 = m1718z(r0)
            r3.f2077p = r0
            goto L_0x0a57
        L_0x0a51:
            b.i.a.f$o r0 = m1718z(r0)
            r3.f2076o = r0
        L_0x0a57:
            int r8 = r8 + 1
            goto L_0x0a1e
        L_0x0a5a:
            b.i.a.f$i0 r0 = r1.f2172b
            r0.mo11309f(r3)
            goto L_0x0cad
        L_0x0a61:
            b.i.a.h r0 = new b.i.a.h
            r0.<init>(r12)
            throw r0
        L_0x0a67:
            r1.mo11409f(r2)
            goto L_0x0cad
        L_0x0a6c:
            b.i.a.f$i0 r0 = r1.f2172b
            if (r0 == 0) goto L_0x0aed
            b.i.a.f$h r3 = new b.i.a.f$h
            r3.<init>()
            b.i.a.f r4 = r1.f2171a
            r3.f2065a = r4
            r3.f2066b = r0
            r1.mo11413j(r3, r2)
            r1.mo11416m(r3, r2)
            r1.mo11418o(r3, r2)
            r1.mo11412i(r3, r2)
        L_0x0a87:
            int r0 = r30.getLength()
            if (r8 >= r0) goto L_0x0ae6
            java.lang.String r0 = r2.getValue(r8)
            java.lang.String r0 = r0.trim()
            java.lang.String r4 = r2.getLocalName(r8)
            b.i.a.i$g r4 = p005b.p080i.p081a.C1502i.C1509g.m1743d(r4)
            int r4 = r4.ordinal()
            r5 = 6
            if (r4 == r5) goto L_0x0add
            r5 = 7
            if (r4 == r5) goto L_0x0ad6
            if (r4 == r14) goto L_0x0ac1
            if (r4 == r13) goto L_0x0aac
            goto L_0x0ae3
        L_0x0aac:
            b.i.a.f$o r0 = m1718z(r0)
            r3.f2038r = r0
            boolean r0 = r0.mo11331g()
            if (r0 != 0) goto L_0x0ab9
            goto L_0x0ae3
        L_0x0ab9:
            b.i.a.h r0 = new b.i.a.h
            java.lang.String r2 = "Invalid <ellipse> element. ry cannot be negative"
            r0.<init>(r2)
            throw r0
        L_0x0ac1:
            b.i.a.f$o r0 = m1718z(r0)
            r3.f2037q = r0
            boolean r0 = r0.mo11331g()
            if (r0 != 0) goto L_0x0ace
            goto L_0x0ae3
        L_0x0ace:
            b.i.a.h r0 = new b.i.a.h
            java.lang.String r2 = "Invalid <ellipse> element. rx cannot be negative"
            r0.<init>(r2)
            throw r0
        L_0x0ad6:
            b.i.a.f$o r0 = m1718z(r0)
            r3.f2036p = r0
            goto L_0x0ae3
        L_0x0add:
            b.i.a.f$o r0 = m1718z(r0)
            r3.f2035o = r0
        L_0x0ae3:
            int r8 = r8 + 1
            goto L_0x0a87
        L_0x0ae6:
            b.i.a.f$i0 r0 = r1.f2172b
            r0.mo11309f(r3)
            goto L_0x0cad
        L_0x0aed:
            b.i.a.h r0 = new b.i.a.h
            r0.<init>(r12)
            throw r0
        L_0x0af3:
            r1.f2175e = r4
            r1.f2176f = r0
            goto L_0x0cad
        L_0x0af9:
            b.i.a.f$i0 r0 = r1.f2172b
            if (r0 == 0) goto L_0x0b1c
            b.i.a.f$g r0 = new b.i.a.f$g
            r0.<init>()
            b.i.a.f r3 = r1.f2171a
            r0.f2065a = r3
            b.i.a.f$i0 r3 = r1.f2172b
            r0.f2066b = r3
            r1.mo11413j(r0, r2)
            r1.mo11416m(r0, r2)
            r1.mo11418o(r0, r2)
            b.i.a.f$i0 r2 = r1.f2172b
            r2.mo11309f(r0)
            r1.f2172b = r0
            goto L_0x0cad
        L_0x0b1c:
            b.i.a.h r0 = new b.i.a.h
            r0.<init>(r12)
            throw r0
        L_0x0b22:
            b.i.a.f$i0 r0 = r1.f2172b
            if (r0 == 0) goto L_0x0b84
            b.i.a.f$d r0 = new b.i.a.f$d
            r0.<init>()
            b.i.a.f r3 = r1.f2171a
            r0.f2065a = r3
            b.i.a.f$i0 r3 = r1.f2172b
            r0.f2066b = r3
            r1.mo11413j(r0, r2)
            r1.mo11416m(r0, r2)
            r1.mo11418o(r0, r2)
            r1.mo11412i(r0, r2)
        L_0x0b3f:
            int r3 = r30.getLength()
            if (r8 >= r3) goto L_0x0b7b
            java.lang.String r3 = r2.getValue(r8)
            java.lang.String r3 = r3.trim()
            java.lang.String r4 = r2.getLocalName(r8)
            b.i.a.i$g r4 = p005b.p080i.p081a.C1502i.C1509g.m1743d(r4)
            int r4 = r4.ordinal()
            r5 = 3
            if (r4 == r5) goto L_0x0b5d
            goto L_0x0b70
        L_0x0b5d:
            boolean r4 = r6.equals(r3)
            if (r4 == 0) goto L_0x0b66
            java.lang.Boolean r3 = java.lang.Boolean.FALSE
            goto L_0x0b6e
        L_0x0b66:
            boolean r3 = r7.equals(r3)
            if (r3 == 0) goto L_0x0b73
            java.lang.Boolean r3 = java.lang.Boolean.TRUE
        L_0x0b6e:
            r0.f1942o = r3
        L_0x0b70:
            int r8 = r8 + 1
            goto L_0x0b3f
        L_0x0b73:
            b.i.a.h r0 = new b.i.a.h
            java.lang.String r2 = "Invalid value for attribute clipPathUnits"
            r0.<init>(r2)
            throw r0
        L_0x0b7b:
            b.i.a.f$i0 r2 = r1.f2172b
            r2.mo11309f(r0)
            r1.f2172b = r0
            goto L_0x0cad
        L_0x0b84:
            b.i.a.h r0 = new b.i.a.h
            r0.<init>(r12)
            throw r0
        L_0x0b8a:
            b.i.a.f$i0 r0 = r1.f2172b
            if (r0 == 0) goto L_0x0bf6
            b.i.a.f$c r3 = new b.i.a.f$c
            r3.<init>()
            b.i.a.f r4 = r1.f2171a
            r3.f2065a = r4
            r3.f2066b = r0
            r1.mo11413j(r3, r2)
            r1.mo11416m(r3, r2)
            r1.mo11418o(r3, r2)
            r1.mo11412i(r3, r2)
        L_0x0ba5:
            int r0 = r30.getLength()
            if (r8 >= r0) goto L_0x0bef
            java.lang.String r0 = r2.getValue(r8)
            java.lang.String r0 = r0.trim()
            java.lang.String r4 = r2.getLocalName(r8)
            b.i.a.i$g r4 = p005b.p080i.p081a.C1502i.C1509g.m1743d(r4)
            int r4 = r4.ordinal()
            r5 = 7
            r6 = 49
            r7 = 6
            if (r4 == r7) goto L_0x0be6
            if (r4 == r5) goto L_0x0bdf
            if (r4 == r6) goto L_0x0bca
            goto L_0x0bec
        L_0x0bca:
            b.i.a.f$o r0 = m1718z(r0)
            r3.f1930q = r0
            boolean r0 = r0.mo11331g()
            if (r0 != 0) goto L_0x0bd7
            goto L_0x0bec
        L_0x0bd7:
            b.i.a.h r0 = new b.i.a.h
            java.lang.String r2 = "Invalid <circle> element. r cannot be negative"
            r0.<init>(r2)
            throw r0
        L_0x0bdf:
            b.i.a.f$o r0 = m1718z(r0)
            r3.f1929p = r0
            goto L_0x0bec
        L_0x0be6:
            b.i.a.f$o r0 = m1718z(r0)
            r3.f1928o = r0
        L_0x0bec:
            int r8 = r8 + 1
            goto L_0x0ba5
        L_0x0bef:
            b.i.a.f$i0 r0 = r1.f2172b
            r0.mo11309f(r3)
            goto L_0x0cad
        L_0x0bf6:
            b.i.a.h r0 = new b.i.a.h
            r0.<init>(r12)
            throw r0
        L_0x0bfc:
            b.i.a.f$i0 r0 = r1.f2172b
            if (r0 == 0) goto L_0x0c22
            b.i.a.f$l r0 = new b.i.a.f$l
            r0.<init>()
            b.i.a.f r3 = r1.f2171a
            r0.f2065a = r3
            b.i.a.f$i0 r3 = r1.f2172b
            r0.f2066b = r3
            r1.mo11413j(r0, r2)
            r1.mo11416m(r0, r2)
            r1.mo11418o(r0, r2)
            r1.mo11412i(r0, r2)
            b.i.a.f$i0 r2 = r1.f2172b
            r2.mo11309f(r0)
            r1.f2172b = r0
            goto L_0x0cad
        L_0x0c22:
            b.i.a.h r0 = new b.i.a.h
            r0.<init>(r12)
            throw r0
        L_0x0c28:
            b.i.a.f$e0 r0 = new b.i.a.f$e0
            r0.<init>()
            b.i.a.f r3 = r1.f2171a
            r0.f2065a = r3
            b.i.a.f$i0 r3 = r1.f2172b
            r0.f2066b = r3
            r1.mo11413j(r0, r2)
            r1.mo11416m(r0, r2)
            r1.mo11412i(r0, r2)
            r1.mo11419p(r0, r2)
        L_0x0c41:
            int r3 = r30.getLength()
            if (r8 >= r3) goto L_0x0c9f
            java.lang.String r3 = r2.getValue(r8)
            java.lang.String r3 = r3.trim()
            java.lang.String r4 = r2.getLocalName(r8)
            b.i.a.i$g r4 = p005b.p080i.p081a.C1502i.C1509g.m1743d(r4)
            int r4 = r4.ordinal()
            if (r4 == r11) goto L_0x0c88
            r5 = 79
            if (r4 == r5) goto L_0x0c94
            switch(r4) {
                case 81: goto L_0x0c73;
                case 82: goto L_0x0c6c;
                case 83: goto L_0x0c65;
                default: goto L_0x0c64;
            }
        L_0x0c64:
            goto L_0x0c94
        L_0x0c65:
            b.i.a.f$o r3 = m1718z(r3)
            r0.f2026q = r3
            goto L_0x0c94
        L_0x0c6c:
            b.i.a.f$o r3 = m1718z(r3)
            r0.f2025p = r3
            goto L_0x0c94
        L_0x0c73:
            b.i.a.f$o r3 = m1718z(r3)
            r0.f2027r = r3
            boolean r3 = r3.mo11331g()
            if (r3 != 0) goto L_0x0c80
            goto L_0x0c94
        L_0x0c80:
            b.i.a.h r0 = new b.i.a.h
            java.lang.String r2 = "Invalid <svg> element. width cannot be negative"
            r0.<init>(r2)
            throw r0
        L_0x0c88:
            b.i.a.f$o r3 = m1718z(r3)
            r0.f2028s = r3
            boolean r3 = r3.mo11331g()
            if (r3 != 0) goto L_0x0c97
        L_0x0c94:
            int r8 = r8 + 1
            goto L_0x0c41
        L_0x0c97:
            b.i.a.h r0 = new b.i.a.h
            java.lang.String r2 = "Invalid <svg> element. height cannot be negative"
            r0.<init>(r2)
            throw r0
        L_0x0c9f:
            b.i.a.f$i0 r2 = r1.f2172b
            if (r2 != 0) goto L_0x0ca8
            b.i.a.f r2 = r1.f2171a
            r2.f1910a = r0
            goto L_0x0cab
        L_0x0ca8:
            r2.mo11309f(r0)
        L_0x0cab:
            r1.f2172b = r0
        L_0x0cad:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p080i.p081a.C1502i.mo11402L(java.lang.String, java.lang.String, java.lang.String, org.xml.sax.Attributes):void");
    }

    /* renamed from: M */
    public final void mo11403M(Attributes attributes) {
        if (this.f2172b != null) {
            String str = "all";
            boolean z = true;
            for (int i = 0; i < attributes.getLength(); i++) {
                String trim = attributes.getValue(i).trim();
                int ordinal = C1509g.m1743d(attributes.getLocalName(i)).ordinal();
                if (ordinal == 38) {
                    str = trim;
                } else if (ordinal == 77) {
                    z = trim.equals("text/css");
                }
            }
            if (z) {
                C1394b.C1401f fVar = C1394b.C1401f.screen;
                C1394b.C1398d dVar = new C1394b.C1398d(str);
                dVar.mo11444r();
                if (C1394b.m1488b(C1394b.m1489d(dVar), fVar)) {
                    this.f2178h = true;
                    return;
                }
            }
            this.f2173c = true;
            this.f2174d = 1;
            return;
        }
        throw new C1501h("Invalid document. Root element must be <svg>");
    }

    /* renamed from: N */
    public final void mo11404N(String str) {
        StringBuilder sb;
        if (!this.f2173c) {
            if (this.f2175e) {
                if (this.f2177g == null) {
                    this.f2177g = new StringBuilder(str.length());
                }
                sb = this.f2177g;
            } else if (this.f2178h) {
                if (this.f2179i == null) {
                    this.f2179i = new StringBuilder(str.length());
                }
                sb = this.f2179i;
            } else if (this.f2172b instanceof C1422f.C1484x0) {
                mo11407a(str);
                return;
            } else {
                return;
            }
            sb.append(str);
        }
    }

    /* renamed from: O */
    public final void mo11405O(char[] cArr, int i, int i2) {
        StringBuilder sb;
        if (!this.f2173c) {
            if (this.f2175e) {
                if (this.f2177g == null) {
                    this.f2177g = new StringBuilder(i2);
                }
                sb = this.f2177g;
            } else if (this.f2178h) {
                if (this.f2179i == null) {
                    this.f2179i = new StringBuilder(i2);
                }
                sb = this.f2179i;
            } else if (this.f2172b instanceof C1422f.C1484x0) {
                mo11407a(new String(cArr, i, i2));
                return;
            } else {
                return;
            }
            sb.append(cArr, i, i2);
        }
    }

    /* renamed from: P */
    public final void mo11406P(Attributes attributes) {
        if (this.f2172b != null) {
            C1422f.C1446e1 e1Var = new C1422f.C1446e1();
            e1Var.f2065a = this.f2171a;
            e1Var.f2066b = this.f2172b;
            mo11413j(e1Var, attributes);
            mo11412i(e1Var, attributes);
            mo11419p(e1Var, attributes);
            this.f2172b.mo11309f(e1Var);
            this.f2172b = e1Var;
            return;
        }
        throw new C1501h("Invalid document. Root element must be <svg>");
    }

    /* renamed from: a */
    public final void mo11407a(String str) {
        C1422f.C1450g0 g0Var = (C1422f.C1450g0) this.f2172b;
        int size = g0Var.f2030i.size();
        C1422f.C1462m0 m0Var = size == 0 ? null : g0Var.f2030i.get(size - 1);
        if (m0Var instanceof C1422f.C1428b1) {
            C1422f.C1428b1 b1Var = (C1422f.C1428b1) m0Var;
            b1Var.f1927c = C0843a.m455p(new StringBuilder(), b1Var.f1927c, str);
            return;
        }
        this.f2172b.mo11309f(new C1422f.C1428b1(str));
    }

    /* renamed from: c */
    public final void mo11408c(String str, String str2, String str3) {
        if (this.f2173c) {
            int i = this.f2174d - 1;
            this.f2174d = i;
            if (i == 0) {
                this.f2173c = false;
                return;
            }
        }
        if ("http://www.w3.org/2000/svg".equals(str) || "".equals(str)) {
            if (str2.length() <= 0) {
                str2 = str3;
            }
            C1510h hVar = C1510h.f2291M.get(str2);
            if (hVar == null) {
                hVar = C1510h.UNSUPPORTED;
            }
            switch (hVar.ordinal()) {
                case 0:
                case 3:
                case 4:
                case 7:
                case 8:
                case 10:
                case 11:
                case 12:
                case 14:
                case 17:
                case 19:
                case 20:
                case 22:
                case 23:
                case 24:
                case 25:
                case 28:
                case 29:
                case 30:
                    this.f2172b = ((C1422f.C1462m0) this.f2172b).f2066b;
                    return;
                case 5:
                case 26:
                    this.f2175e = false;
                    StringBuilder sb = this.f2177g;
                    if (sb != null) {
                        C1510h hVar2 = this.f2176f;
                        if (hVar2 == C1510h.title) {
                            C1422f fVar = this.f2171a;
                            sb.toString();
                            Objects.requireNonNull(fVar);
                        } else if (hVar2 == C1510h.desc) {
                            C1422f fVar2 = this.f2171a;
                            sb.toString();
                            Objects.requireNonNull(fVar2);
                        }
                        this.f2177g.setLength(0);
                        return;
                    }
                    return;
                case 21:
                    StringBuilder sb2 = this.f2179i;
                    if (sb2 != null) {
                        this.f2178h = false;
                        mo11420q(sb2.toString());
                        this.f2179i.setLength(0);
                        return;
                    }
                    return;
                default:
                    return;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0096, code lost:
        continue;
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo11409f(org.xml.sax.Attributes r6) {
        /*
            r5 = this;
            b.i.a.f$i0 r0 = r5.f2172b
            if (r0 == 0) goto L_0x00a9
            b.i.a.f$n r0 = new b.i.a.f$n
            r0.<init>()
            b.i.a.f r1 = r5.f2171a
            r0.f2065a = r1
            b.i.a.f$i0 r1 = r5.f2172b
            r0.f2066b = r1
            r5.mo11413j(r0, r6)
            r5.mo11416m(r0, r6)
            r5.mo11418o(r0, r6)
            r5.mo11412i(r0, r6)
            r1 = 0
        L_0x001e:
            int r2 = r6.getLength()
            if (r1 >= r2) goto L_0x00a1
            java.lang.String r2 = r6.getValue(r1)
            java.lang.String r2 = r2.trim()
            java.lang.String r3 = r6.getLocalName(r1)
            b.i.a.i$g r3 = p005b.p080i.p081a.C1502i.C1509g.m1743d(r3)
            int r3 = r3.ordinal()
            r4 = 25
            if (r3 == r4) goto L_0x008a
            r4 = 26
            if (r3 == r4) goto L_0x006f
            r4 = 48
            if (r3 == r4) goto L_0x006b
            switch(r3) {
                case 81: goto L_0x0056;
                case 82: goto L_0x004f;
                case 83: goto L_0x0048;
                default: goto L_0x0047;
            }
        L_0x0047:
            goto L_0x0096
        L_0x0048:
            b.i.a.f$o r2 = m1718z(r2)
            r0.f2069q = r2
            goto L_0x0096
        L_0x004f:
            b.i.a.f$o r2 = m1718z(r2)
            r0.f2068p = r2
            goto L_0x0096
        L_0x0056:
            b.i.a.f$o r2 = m1718z(r2)
            r0.f2070r = r2
            boolean r2 = r2.mo11331g()
            if (r2 != 0) goto L_0x0063
            goto L_0x0096
        L_0x0063:
            b.i.a.h r6 = new b.i.a.h
            java.lang.String r0 = "Invalid <use> element. width cannot be negative"
            r6.<init>(r0)
            throw r6
        L_0x006b:
            m1705E(r0, r2)
            goto L_0x0096
        L_0x006f:
            java.lang.String r3 = r6.getURI(r1)
            java.lang.String r4 = ""
            boolean r3 = r4.equals(r3)
            if (r3 != 0) goto L_0x0087
            java.lang.String r3 = r6.getURI(r1)
            java.lang.String r4 = "http://www.w3.org/1999/xlink"
            boolean r3 = r4.equals(r3)
            if (r3 == 0) goto L_0x0096
        L_0x0087:
            r0.f2067o = r2
            goto L_0x0096
        L_0x008a:
            b.i.a.f$o r2 = m1718z(r2)
            r0.f2071s = r2
            boolean r2 = r2.mo11331g()
            if (r2 != 0) goto L_0x0099
        L_0x0096:
            int r1 = r1 + 1
            goto L_0x001e
        L_0x0099:
            b.i.a.h r6 = new b.i.a.h
            java.lang.String r0 = "Invalid <use> element. height cannot be negative"
            r6.<init>(r0)
            throw r6
        L_0x00a1:
            b.i.a.f$i0 r6 = r5.f2172b
            r6.mo11309f(r0)
            r5.f2172b = r0
            return
        L_0x00a9:
            b.i.a.h r6 = new b.i.a.h
            java.lang.String r0 = "Invalid document. Root element must be <svg>"
            r6.<init>(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p080i.p081a.C1502i.mo11409f(org.xml.sax.Attributes):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00a6, code lost:
        continue;
     */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo11410g(org.xml.sax.Attributes r8) {
        /*
            r7 = this;
            b.i.a.f$i0 r0 = r7.f2172b
            if (r0 == 0) goto L_0x00ba
            b.i.a.f$r r0 = new b.i.a.f$r
            r0.<init>()
            b.i.a.f r1 = r7.f2171a
            r0.f2065a = r1
            b.i.a.f$i0 r1 = r7.f2172b
            r0.f2066b = r1
            r7.mo11413j(r0, r8)
            r7.mo11416m(r0, r8)
            r7.mo11412i(r0, r8)
            r1 = 0
        L_0x001b:
            int r2 = r8.getLength()
            if (r1 >= r2) goto L_0x00b2
            java.lang.String r2 = r8.getValue(r1)
            java.lang.String r2 = r2.trim()
            java.lang.String r3 = r8.getLocalName(r1)
            b.i.a.i$g r3 = p005b.p080i.p081a.C1502i.C1509g.m1743d(r3)
            int r3 = r3.ordinal()
            r4 = 25
            if (r3 == r4) goto L_0x009a
            r4 = 36
            java.lang.String r5 = "userSpaceOnUse"
            java.lang.String r6 = "objectBoundingBox"
            if (r3 == r4) goto L_0x007e
            r4 = 37
            if (r3 == r4) goto L_0x0062
            switch(r3) {
                case 81: goto L_0x004d;
                case 82: goto L_0x0049;
                case 83: goto L_0x0049;
                default: goto L_0x0048;
            }
        L_0x0048:
            goto L_0x00a6
        L_0x0049:
            m1718z(r2)
            goto L_0x00a6
        L_0x004d:
            b.i.a.f$o r2 = m1718z(r2)
            r0.f2094p = r2
            boolean r2 = r2.mo11331g()
            if (r2 != 0) goto L_0x005a
            goto L_0x00a6
        L_0x005a:
            b.i.a.h r8 = new b.i.a.h
            java.lang.String r0 = "Invalid <mask> element. width cannot be negative"
            r8.<init>(r0)
            throw r8
        L_0x0062:
            boolean r3 = r6.equals(r2)
            if (r3 == 0) goto L_0x006b
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            goto L_0x0073
        L_0x006b:
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L_0x0076
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
        L_0x0073:
            r0.f2092n = r2
            goto L_0x00a6
        L_0x0076:
            b.i.a.h r8 = new b.i.a.h
            java.lang.String r0 = "Invalid value for attribute maskUnits"
            r8.<init>(r0)
            throw r8
        L_0x007e:
            boolean r3 = r6.equals(r2)
            if (r3 == 0) goto L_0x0087
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            goto L_0x008f
        L_0x0087:
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L_0x0092
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
        L_0x008f:
            r0.f2093o = r2
            goto L_0x00a6
        L_0x0092:
            b.i.a.h r8 = new b.i.a.h
            java.lang.String r0 = "Invalid value for attribute maskContentUnits"
            r8.<init>(r0)
            throw r8
        L_0x009a:
            b.i.a.f$o r2 = m1718z(r2)
            r0.f2095q = r2
            boolean r2 = r2.mo11331g()
            if (r2 != 0) goto L_0x00aa
        L_0x00a6:
            int r1 = r1 + 1
            goto L_0x001b
        L_0x00aa:
            b.i.a.h r8 = new b.i.a.h
            java.lang.String r0 = "Invalid <mask> element. height cannot be negative"
            r8.<init>(r0)
            throw r8
        L_0x00b2:
            b.i.a.f$i0 r8 = r7.f2172b
            r8.mo11309f(r0)
            r7.f2172b = r0
            return
        L_0x00ba:
            b.i.a.h r8 = new b.i.a.h
            java.lang.String r0 = "Invalid document. Root element must be <svg>"
            r8.<init>(r0)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p080i.p081a.C1502i.mo11410g(org.xml.sax.Attributes):void");
    }

    /* renamed from: h */
    public C1422f mo11411h(BufferedInputStream bufferedInputStream, boolean z) {
        if (!bufferedInputStream.markSupported()) {
            bufferedInputStream = new BufferedInputStream(bufferedInputStream);
        }
        try {
            bufferedInputStream.mark(3);
            int read = bufferedInputStream.read() + (bufferedInputStream.read() << 8);
            bufferedInputStream.reset();
            if (read == 35615) {
                bufferedInputStream = new BufferedInputStream(new GZIPInputStream(bufferedInputStream));
            }
        } catch (IOException unused) {
        }
        try {
            bufferedInputStream.mark(4096);
            mo11400I(bufferedInputStream, z);
            return this.f2171a;
        } finally {
            try {
                bufferedInputStream.close();
            } catch (IOException unused2) {
                Log.e("SVGParser", "Exception thrown closing input stream");
            }
        }
    }

    /* renamed from: i */
    public final void mo11412i(C1422f.C1448f0 f0Var, Attributes attributes) {
        HashSet hashSet;
        for (int i = 0; i < attributes.getLength(); i++) {
            String trim = attributes.getValue(i).trim();
            int ordinal = C1509g.m1743d(attributes.getLocalName(i)).ordinal();
            if (ordinal != 73) {
                switch (ordinal) {
                    case 52:
                        C1511i iVar = new C1511i(trim);
                        HashSet hashSet2 = new HashSet();
                        while (!iVar.mo11432f()) {
                            String l = iVar.mo11438l();
                            hashSet2.add(l.startsWith("http://www.w3.org/TR/SVG11/feature#") ? l.substring(35) : "UNSUPPORTED");
                            iVar.mo11444r();
                        }
                        f0Var.mo11321l(hashSet2);
                        break;
                    case 53:
                        f0Var.mo11315b(trim);
                        break;
                    case 54:
                        C1511i iVar2 = new C1511i(trim);
                        HashSet hashSet3 = new HashSet();
                        while (!iVar2.mo11432f()) {
                            hashSet3.add(iVar2.mo11438l());
                            iVar2.mo11444r();
                        }
                        f0Var.mo11317g(hashSet3);
                        break;
                    case 55:
                        List<String> w = m1715w(trim);
                        if (w == null) {
                            hashSet = new HashSet(0);
                        }
                        f0Var.mo11319i(hashSet);
                        break;
                }
            } else {
                C1511i iVar3 = new C1511i(trim);
                HashSet hashSet4 = new HashSet();
                while (!iVar3.mo11432f()) {
                    String l2 = iVar3.mo11438l();
                    int indexOf = l2.indexOf(45);
                    if (indexOf != -1) {
                        l2 = l2.substring(0, indexOf);
                    }
                    hashSet4.add(new Locale(l2, "", "").getLanguage());
                    iVar3.mo11444r();
                }
                f0Var.mo11320j(hashSet4);
            }
        }
    }

    /* renamed from: j */
    public final void mo11413j(C1422f.C1458k0 k0Var, Attributes attributes) {
        Boolean bool;
        int i = 0;
        while (i < attributes.getLength()) {
            String qName = attributes.getQName(i);
            if (qName.equals(AnalyticsContext.Device.DEVICE_ID_KEY) || qName.equals("xml:id")) {
                k0Var.f2055c = attributes.getValue(i).trim();
                return;
            } else if (qName.equals("xml:space")) {
                String trim = attributes.getValue(i).trim();
                if ("default".equals(trim)) {
                    bool = Boolean.FALSE;
                } else if ("preserve".equals(trim)) {
                    bool = Boolean.TRUE;
                } else {
                    throw new C1501h(C0843a.m451l("Invalid value for \"xml:space\" attribute: ", trim));
                }
                k0Var.f2056d = bool;
                return;
            } else {
                i++;
            }
        }
    }

    /* renamed from: k */
    public final void mo11414k(C1422f.C1453i iVar, Attributes attributes) {
        Boolean bool;
        for (int i = 0; i < attributes.getLength(); i++) {
            String trim = attributes.getValue(i).trim();
            int ordinal = C1509g.m1743d(attributes.getLocalName(i)).ordinal();
            if (ordinal == 23) {
                iVar.f2046j = mo11398G(trim);
            } else if (ordinal == 24) {
                if ("objectBoundingBox".equals(trim)) {
                    bool = Boolean.FALSE;
                } else if ("userSpaceOnUse".equals(trim)) {
                    bool = Boolean.TRUE;
                } else {
                    throw new C1501h("Invalid value for attribute gradientUnits");
                }
                iVar.f2045i = bool;
            } else if (ordinal != 26) {
                if (ordinal == 60) {
                    try {
                        iVar.f2047k = C1422f.C1455j.valueOf(trim);
                    } catch (IllegalArgumentException unused) {
                        throw new C1501h(C0843a.m452m("Invalid spreadMethod attribute. \"", trim, "\" is not a valid value."));
                    }
                }
            } else if ("".equals(attributes.getURI(i)) || "http://www.w3.org/1999/xlink".equals(attributes.getURI(i))) {
                iVar.f2048l = trim;
            }
        }
    }

    /* renamed from: l */
    public final void mo11415l(C1422f.C1485y yVar, Attributes attributes, String str) {
        for (int i = 0; i < attributes.getLength(); i++) {
            if (C1509g.m1743d(attributes.getLocalName(i)) == C1509g.points) {
                C1511i iVar = new C1511i(attributes.getValue(i));
                ArrayList arrayList = new ArrayList();
                iVar.mo11444r();
                while (!iVar.mo11432f()) {
                    float i2 = iVar.mo11435i();
                    if (!Float.isNaN(i2)) {
                        iVar.mo11443q();
                        float i3 = iVar.mo11435i();
                        if (!Float.isNaN(i3)) {
                            iVar.mo11443q();
                            arrayList.add(Float.valueOf(i2));
                            arrayList.add(Float.valueOf(i3));
                        } else {
                            throw new C1501h(C0843a.m452m("Invalid <", str, "> points attribute. There should be an even number of coordinates."));
                        }
                    } else {
                        throw new C1501h(C0843a.m452m("Invalid <", str, "> points attribute. Non-coordinate content found in list."));
                    }
                }
                yVar.f2116o = new float[arrayList.size()];
                Iterator it = arrayList.iterator();
                int i4 = 0;
                while (it.hasNext()) {
                    yVar.f2116o[i4] = ((Float) it.next()).floatValue();
                    i4++;
                }
            }
        }
    }

    /* renamed from: m */
    public final void mo11416m(C1422f.C1458k0 k0Var, Attributes attributes) {
        for (int i = 0; i < attributes.getLength(); i++) {
            String trim = attributes.getValue(i).trim();
            if (trim.length() != 0) {
                int ordinal = C1509g.m1743d(attributes.getLocalName(i)).ordinal();
                if (ordinal == 0) {
                    C1394b.C1398d dVar = new C1394b.C1398d(trim);
                    ArrayList arrayList = null;
                    while (!dVar.mo11432f()) {
                        String l = dVar.mo11438l();
                        if (l != null) {
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                            }
                            arrayList.add(l);
                            dVar.mo11444r();
                        }
                    }
                    k0Var.f2059g = arrayList;
                } else if (ordinal != 72) {
                    if (k0Var.f2057e == null) {
                        k0Var.f2057e = new C1422f.C1433d0();
                    }
                    m1706J(k0Var.f2057e, attributes.getLocalName(i), attributes.getValue(i).trim());
                } else {
                    C1511i iVar = new C1511i(trim.replaceAll("/\\*.*?\\*/", ""));
                    while (true) {
                        String m = iVar.mo11439m(':');
                        iVar.mo11444r();
                        if (!iVar.mo11430d(':')) {
                            break;
                        }
                        iVar.mo11444r();
                        String n = iVar.mo11440n(';', true);
                        if (n == null) {
                            break;
                        }
                        iVar.mo11444r();
                        if (iVar.mo11432f() || iVar.mo11430d(';')) {
                            if (k0Var.f2058f == null) {
                                k0Var.f2058f = new C1422f.C1433d0();
                            }
                            m1706J(k0Var.f2058f, m, n);
                            iVar.mo11444r();
                        }
                    }
                }
            }
        }
    }

    /* renamed from: n */
    public final void mo11417n(C1422f.C1488z0 z0Var, Attributes attributes) {
        for (int i = 0; i < attributes.getLength(); i++) {
            String trim = attributes.getValue(i).trim();
            int ordinal = C1509g.m1743d(attributes.getLocalName(i)).ordinal();
            if (ordinal == 9) {
                z0Var.f2122p = m1701A(trim);
            } else if (ordinal == 10) {
                z0Var.f2123q = m1701A(trim);
            } else if (ordinal == 82) {
                z0Var.f2120n = m1701A(trim);
            } else if (ordinal == 83) {
                z0Var.f2121o = m1701A(trim);
            }
        }
    }

    /* renamed from: o */
    public final void mo11418o(C1422f.C1461m mVar, Attributes attributes) {
        for (int i = 0; i < attributes.getLength(); i++) {
            if (C1509g.m1743d(attributes.getLocalName(i)) == C1509g.transform) {
                mVar.mo11324d(mo11398G(attributes.getValue(i)));
            }
        }
    }

    /* renamed from: p */
    public final void mo11419p(C1422f.C1470q0 q0Var, Attributes attributes) {
        for (int i = 0; i < attributes.getLength(); i++) {
            String trim = attributes.getValue(i).trim();
            int ordinal = C1509g.m1743d(attributes.getLocalName(i)).ordinal();
            if (ordinal == 48) {
                m1705E(q0Var, trim);
            } else if (ordinal != 80) {
                continue;
            } else {
                C1511i iVar = new C1511i(trim);
                iVar.mo11444r();
                float i2 = iVar.mo11435i();
                iVar.mo11443q();
                float i3 = iVar.mo11435i();
                iVar.mo11443q();
                float i4 = iVar.mo11435i();
                iVar.mo11443q();
                float i5 = iVar.mo11435i();
                if (Float.isNaN(i2) || Float.isNaN(i3) || Float.isNaN(i4) || Float.isNaN(i5)) {
                    throw new C1501h("Invalid viewBox definition - should have four numbers");
                } else if (i4 < 0.0f) {
                    throw new C1501h("Invalid viewBox. width cannot be negative");
                } else if (i5 >= 0.0f) {
                    q0Var.f2091o = new C1422f.C1423a(i2, i3, i4, i5);
                } else {
                    throw new C1501h("Invalid viewBox. height cannot be negative");
                }
            }
        }
    }

    /* renamed from: q */
    public final void mo11420q(String str) {
        C1394b bVar = new C1394b(C1394b.C1401f.screen, C1394b.C1416u.Document);
        C1422f fVar = this.f2171a;
        C1394b.C1398d dVar = new C1394b.C1398d(str);
        dVar.mo11444r();
        fVar.f1911b.mo11285b(bVar.mo11270f(dVar));
    }
}
