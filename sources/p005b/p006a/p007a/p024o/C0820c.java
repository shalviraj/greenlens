package p005b.p006a.p007a.p024o;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.os.Build;
import android.text.format.DateFormat;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.Window;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.ActivityChooserModel;
import app.bravostudio.A01F41WRYKPX5KXQ68EGF1JX39R.R;
import com.amplitude.api.DeviceInfo;
import com.appfoundry.previewer.BravoApp;
import com.appfoundry.previewer.model.App;
import com.appfoundry.previewer.model.Asset;
import com.appfoundry.previewer.model.BoundJsonResponse;
import com.appfoundry.previewer.model.BoundNode;
import com.appfoundry.previewer.model.Component;
import com.appfoundry.previewer.model.Container;
import com.appfoundry.previewer.model.JsonApp;
import com.appfoundry.previewer.model.Marker;
import com.appfoundry.previewer.model.Page;
import com.appfoundry.previewer.model.Properties;
import com.appfoundry.previewer.model.ResponseBody;
import com.appfoundry.previewer.model.Style;
import com.appfoundry.previewer.model.UploadInfoResponse;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import p005b.p006a.p007a.p018i.C0744e;
import p005b.p006a.p007a.p018i.C0756o;
import p005b.p006a.p007a.p019j.C0779j;
import p005b.p006a.p007a.p023n.C0816e;
import p005b.p006a.p007a.p023n.C0817f;
import p005b.p035e.p036a.p037a.C0843a;
import p005b.p038f.p039a.C0849e;
import p005b.p096l.p097a.p113c.p142g.p144g.C3095c;
import p005b.p280p.p281a.C5075l;
import p005b.p280p.p281a.C5084r;
import p005b.p291q.p292a.C5266a;
import p298d.p334t.C6790h;
import p298d.p344x.p346c.C6888i;
import p298d.p415c0.C7694h;
import p421m.C7829b0;
import p421m.C7831c0;
import p421m.C7839e0;
import p421m.C7844g0;
import p421m.C7850h0;
import p421m.C7855j0;
import p421m.p422m0.C7867c;
import p421m.p422m0.p426g.C7887e;
import p435n.C8043g;
import p441p.p442a.C8091a;

/* renamed from: b.a.a.o.c */
public final class C0820c {
    /* renamed from: A */
    public static final File m299A(AppCompatActivity appCompatActivity) {
        C6888i.m12438e(appCompatActivity, ActivityChooserModel.ATTRIBUTE_ACTIVITY);
        Date date = new Date();
        DateFormat.format("yyyy-MM-dd_hh:mm:ss", date);
        String str = C0849e.m472C() + date + ".jpg";
        try {
            Window window = appCompatActivity.getWindow();
            C6888i.m12437d(window, "activity.window");
            View decorView = window.getDecorView();
            C6888i.m12437d(decorView, "activity.window.decorView");
            View rootView = decorView.getRootView();
            C6888i.m12437d(rootView, "v1");
            rootView.setDrawingCacheEnabled(true);
            Bitmap createBitmap = Bitmap.createBitmap(rootView.getDrawingCache());
            rootView.setDrawingCacheEnabled(false);
            File file = new File(str);
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            createBitmap.compress(Bitmap.CompressFormat.JPEG, 100, fileOutputStream);
            fileOutputStream.flush();
            fileOutputStream.close();
            return file;
        } catch (Throwable th) {
            C8091a.f16272d.mo26044b("Error taking screenshot %s: %s", str, th.getLocalizedMessage());
            return null;
        }
    }

    /* renamed from: B */
    public static final C3095c m300B(Marker marker) {
        C6888i.m12438e(marker, "marker");
        C3095c cVar = new C3095c();
        cVar.f5224g = C0849e.m484I(marker);
        Properties properties = marker.f11031c;
        if ((properties != null ? properties.f11091c : null) != null) {
            cVar.f5225h = properties.f11091c;
        }
        return cVar;
    }

    /* renamed from: a */
    public static final boolean m301a() {
        return !C6888i.m12434a(C0849e.m507b(), "01DZ4603RKEVSFT7ST3YCM592G");
    }

    /* renamed from: b */
    public static final boolean m302b() {
        return C6888i.m12434a(C0849e.m507b(), "01DZ4603RKEVSFT7ST3YCM592G");
    }

    /* renamed from: c */
    public static final void m303c(String str) {
        int i;
        if (str != null) {
            int i2 = 0;
            if (C7694h.m13926d(str, "modal", false, 2)) {
                BravoApp.C5403b bVar = BravoApp.f10730N;
                int i3 = BravoApp.f10725I;
                int identifier = Resources.getSystem().getIdentifier("status_bar_height", "dimen", DeviceInfo.OS_NAME);
                if (identifier > 0) {
                    i2 = Resources.getSystem().getDimensionPixelSize(identifier);
                }
                i = i3 - i2;
                BravoApp.f10726J = i;
            }
        }
        BravoApp.C5403b bVar2 = BravoApp.f10730N;
        i = BravoApp.f10725I;
        BravoApp.f10726J = i;
    }

    /* renamed from: d */
    public static final float m304d() {
        Resources system = Resources.getSystem();
        C6888i.m12437d(system, "Resources.getSystem()");
        return system.getDisplayMetrics().density;
    }

    /* renamed from: e */
    public static final float m305e(float f) {
        Resources system = Resources.getSystem();
        C6888i.m12437d(system, "Resources.getSystem()");
        DisplayMetrics displayMetrics = system.getDisplayMetrics();
        C6888i.m12437d(displayMetrics, "Resources.getSystem().displayMetrics");
        return (((float) displayMetrics.densityDpi) / 160.0f) * f;
    }

    /* renamed from: f */
    public static final JsonApp m306f() {
        BravoApp.C5403b bVar = BravoApp.f10730N;
        JsonApp jsonApp = BravoApp.f10738n;
        if (jsonApp != null) {
            return jsonApp;
        }
        C0817f fVar = C0817f.f641b;
        String b = C0817f.m294b("current_json");
        if (b == null || !C0756o.m228f(b)) {
            JsonApp jsonApp2 = BravoApp.f10737m;
            if (jsonApp2 != null) {
                return jsonApp2;
            }
            JsonApp u = m321u(R.raw.previewer_figma);
            BravoApp.f10737m = u;
            return u;
        }
        C0816e eVar = C0816e.f639l;
        return C0816e.f628a.mo16830b(b);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000b, code lost:
        r2 = (r2 = r0.f11021d).f10891e;
     */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final com.appfoundry.previewer.model.Page m307g() {
        /*
            com.appfoundry.previewer.BravoApp$b r0 = com.appfoundry.previewer.BravoApp.f10730N
            com.appfoundry.previewer.model.JsonApp r0 = com.appfoundry.previewer.BravoApp.f10738n
            r1 = 0
            if (r0 == 0) goto L_0x0012
            com.appfoundry.previewer.model.App r2 = r0.f11021d
            if (r2 == 0) goto L_0x0012
            com.appfoundry.previewer.model.Data r2 = r2.f10891e
            if (r2 == 0) goto L_0x0012
            java.util.List<com.appfoundry.previewer.model.Page> r2 = r2.f10985b
            goto L_0x0013
        L_0x0012:
            r2 = r1
        L_0x0013:
            if (r2 == 0) goto L_0x003d
            if (r0 == 0) goto L_0x0022
            com.appfoundry.previewer.model.App r0 = r0.f11021d
            if (r0 == 0) goto L_0x0022
            com.appfoundry.previewer.model.Data r0 = r0.f10891e
            if (r0 == 0) goto L_0x0022
            java.util.List<com.appfoundry.previewer.model.Page> r0 = r0.f10985b
            goto L_0x0023
        L_0x0022:
            r0 = r1
        L_0x0023:
            p298d.p344x.p346c.C6888i.m12436c(r0)
            java.util.Iterator r0 = r0.iterator()
        L_0x002a:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x003d
            java.lang.Object r2 = r0.next()
            com.appfoundry.previewer.model.Page r2 = (com.appfoundry.previewer.model.Page) r2
            boolean r3 = p005b.p006a.p007a.p018i.C0744e.m219w(r2)
            if (r3 == 0) goto L_0x002a
            return r2
        L_0x003d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p006a.p007a.p024o.C0820c.m307g():com.appfoundry.previewer.model.Page");
    }

    /* renamed from: h */
    public static final C7831c0 m308h(String str) {
        if (str != null && C7694h.m13926d(str, "bravostudio", false, 2)) {
            return BravoApp.f10730N.mo18363c();
        }
        C7831c0.C7832a aVar = new C7831c0.C7832a();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        C6888i.m12438e(timeUnit, "unit");
        aVar.f15500u = C7867c.m14281b("timeout", 60, timeUnit);
        C6888i.m12438e(timeUnit, "unit");
        aVar.f15501v = C7867c.m14281b("timeout", 60, timeUnit);
        C6888i.m12438e(timeUnit, "unit");
        aVar.f15502w = C7867c.m14281b("timeout", 60, timeUnit);
        return new C7831c0(aVar);
    }

    /* renamed from: i */
    public static final JsonApp m309i() {
        BravoApp.C5403b bVar = BravoApp.f10730N;
        JsonApp jsonApp = BravoApp.f10737m;
        if (jsonApp != null) {
            return jsonApp;
        }
        JsonApp u = m321u(R.raw.previewer_figma);
        BravoApp.f10737m = u;
        return u;
    }

    /* renamed from: j */
    public static final C0779j m310j(Page page, boolean z) {
        String str;
        boolean z2;
        Page page2 = null;
        if (page == null || (str = page.f11044l) == null) {
            str = page != null ? page.f11043k : null;
        }
        if (str == null) {
            return null;
        }
        try {
            C7850h0 l = m312l(str);
            C8091a.f16272d.mo26043a("getRemoteJson: response = %s", l.toString());
            int i = l.f15552j;
            if (i == 200) {
                return m318r(l, page, z);
            }
            if (i != 401 || !m324x()) {
                return (l.f15552j != 500 || !m324x() || page == null || !C0744e.m217u(page)) ? m316p(C0849e.m553y(l), (String) null, 2) : m317q(page);
            }
            return m319s(page);
        } catch (UnknownHostException e) {
            Object[] objArr = new Object[2];
            objArr[0] = page != null ? page.f11033a : null;
            objArr[1] = e.getLocalizedMessage();
            C8091a.f16272d.mo26044b("getRemoteJson: possible no connection exception %s : %s", objArr);
            Page K = C0823f.m342K("error:noConnection");
            if (K != null) {
                C6888i.m12438e(K, "$this$addNoConnectionImage");
                List<Container> list = K.f11038f;
                if (list != null) {
                    C6888i.m12436c(list);
                    Iterator<Container> it = list.iterator();
                    loop0:
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        List<Component> list2 = it.next().f10972f;
                        if (list2 != null) {
                            C6888i.m12436c(list2);
                            for (Component next : list2) {
                                C6888i.m12438e(next, "$this$hasNoConnectionImageTag");
                                List<String> list3 = next.f10947i;
                                if (list3 != null) {
                                    z2 = C0849e.m508b0(list3, "dev:noConnectionImage");
                                    continue;
                                } else {
                                    z2 = false;
                                    continue;
                                }
                                if (z2) {
                                    next.f10940b = "component:localImage";
                                    next.f10946h = Integer.valueOf(R.drawable.trex_offline);
                                    break loop0;
                                }
                            }
                            continue;
                        }
                    }
                }
                K.f11056x = true;
                page2 = K;
            }
            return new C0779j(page2, false, 2);
        } catch (Exception e2) {
            StringBuilder u = C0843a.m460u("Exception getting remote json: ");
            u.append(e2.getLocalizedMessage());
            return m316p((ResponseBody) null, u.toString(), 1);
        }
    }

    /* renamed from: k */
    public static /* synthetic */ C0779j m311k(Page page, boolean z, int i) {
        if ((i & 2) != 0) {
            z = false;
        }
        return m310j(page, z);
    }

    /* renamed from: l */
    public static final C7850h0 m312l(String str) {
        C7831c0 c = BravoApp.f10730N.mo18363c();
        C7839e0.C7840a m = m313m();
        m.mo25540f(str);
        return ((C7887e) c.mo25525a(m.mo25535a())).mo25623h();
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x007d  */
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final p421m.C7839e0.C7840a m313m() {
        /*
            boolean r0 = m324x()
            java.lang.String r1 = ""
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L_0x001d
            java.lang.String r0 = p005b.p038f.p039a.C0849e.m513e()
            if (r0 == 0) goto L_0x001d
            java.lang.String r0 = p005b.p038f.p039a.C0849e.m513e()
            boolean r0 = p298d.p344x.p346c.C6888i.m12434a(r0, r1)
            r0 = r0 ^ r3
            if (r0 == 0) goto L_0x001d
            r0 = r3
            goto L_0x001e
        L_0x001d:
            r0 = r2
        L_0x001e:
            java.lang.String r4 = "Bearer "
            java.lang.String r5 = "X-App-Authorization"
            if (r0 == 0) goto L_0x0032
            m.e0$a r0 = new m.e0$a
            r0.<init>()
            java.lang.StringBuilder r1 = p005b.p035e.p036a.p037a.C0843a.m460u(r4)
            java.lang.String r2 = p005b.p038f.p039a.C0849e.m513e()
            goto L_0x006d
        L_0x0032:
            boolean r0 = p005b.p038f.p039a.C0849e.m499U()
            if (r0 == 0) goto L_0x0046
            m.e0$a r0 = new m.e0$a
            r0.<init>()
            java.lang.StringBuilder r1 = p005b.p035e.p036a.p037a.C0843a.m460u(r4)
            java.lang.String r2 = p005b.p038f.p039a.C0849e.m509c()
            goto L_0x006d
        L_0x0046:
            boolean r0 = m324x()
            if (r0 != 0) goto L_0x005e
            java.lang.String r0 = p005b.p038f.p039a.C0849e.m543t()
            if (r0 == 0) goto L_0x005e
            java.lang.String r0 = p005b.p038f.p039a.C0849e.m543t()
            boolean r0 = p298d.p344x.p346c.C6888i.m12434a(r0, r1)
            r0 = r0 ^ r3
            if (r0 == 0) goto L_0x005e
            r2 = r3
        L_0x005e:
            m.e0$a r0 = new m.e0$a
            r0.<init>()
            if (r2 == 0) goto L_0x0077
            java.lang.StringBuilder r1 = p005b.p035e.p036a.p037a.C0843a.m460u(r4)
            java.lang.String r2 = p005b.p038f.p039a.C0849e.m543t()
        L_0x006d:
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.mo25536b(r5, r1)
        L_0x0077:
            boolean r1 = p005b.p038f.p039a.C0849e.m506a0()
            if (r1 == 0) goto L_0x008a
            java.lang.String r1 = p005b.p038f.p039a.C0849e.m515f()
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r2 = "X-App-Identity"
            r0.mo25536b(r2, r1)
        L_0x008a:
            java.lang.String r1 = m315o()
            java.lang.String r2 = "User-Agent"
            r0.mo25536b(r2, r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "id="
            r1.append(r2)
            java.lang.String r2 = p005b.p038f.p039a.C0849e.m470B()
            r1.append(r2)
            java.lang.String r2 = ", lang="
            r1.append(r2)
            java.util.Locale r2 = java.util.Locale.getDefault()
            java.lang.String r3 = "Locale.getDefault()"
            p298d.p344x.p346c.C6888i.m12437d(r2, r3)
            java.lang.String r2 = r2.getLanguage()
            r1.append(r2)
            java.lang.String r2 = ", platform=android"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "X-App-Device"
            r0.mo25536b(r2, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p006a.p007a.p024o.C0820c.m313m():m.e0$a");
    }

    /* renamed from: n */
    public static final UploadInfoResponse m314n(String str) {
        String l = C0843a.m451l("https://dd7h0o2dfb.execute-api.eu-central-1.amazonaws.com/dev/upload?mimetype=", str);
        C7831c0 c = BravoApp.f10730N.mo18363c();
        C7839e0.C7840a aVar = new C7839e0.C7840a();
        aVar.mo25540f(l);
        aVar.mo25538d(C7844g0.C7845a.m14247b(C7844g0.f15540a, (C7829b0) null, new byte[0], 0, 0, 12));
        C7850h0 h = ((C7887e) c.mo25525a(aVar.mo25535a())).mo25623h();
        int i = h.f15552j;
        C7855j0 j0Var = h.f15555m;
        String z = j0Var != null ? j0Var.mo25572z() : null;
        if (i != 200 || z == null) {
            return null;
        }
        C0816e eVar = C0816e.f639l;
        return C0816e.f632e.mo16830b(z);
    }

    /* renamed from: o */
    public static final String m315o() {
        return C0843a.m455p(C0843a.m460u("Bravo/1.0 (Android "), Build.VERSION.RELEASE, ")");
    }

    /* renamed from: p */
    public static C0779j m316p(ResponseBody responseBody, String str, int i) {
        String str2;
        T t;
        boolean z;
        T t2;
        String str3;
        boolean z2;
        T t3;
        String str4;
        Integer num;
        boolean z3;
        Page page = null;
        if ((i & 1) != 0) {
            responseBody = null;
        }
        if ((i & 2) != 0) {
            str = null;
        }
        Page K = C0823f.m342K("error:remotePage");
        if (K != null) {
            C6888i.m12438e(K, "$this$fillErrorTags");
            if (responseBody != null) {
                str2 = responseBody.f11098c + "\n" + responseBody.f11099d;
            } else {
                str2 = "";
            }
            List<Container> list = K.f11038f;
            if (list != null) {
                for (Container container : list) {
                    List<Component> list2 = container.f10972f;
                    if (list2 != null) {
                        Iterator<T> it = list2.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                t3 = null;
                                break;
                            }
                            t3 = it.next();
                            Component component = (Component) t3;
                            C6888i.m12438e(component, "$this$hasErrorStatusTag");
                            List<String> list3 = component.f10947i;
                            if (list3 != null) {
                                z3 = C0849e.m508b0(list3, "dev:errorstatus");
                                continue;
                            } else {
                                z3 = false;
                                continue;
                            }
                            if (z3) {
                                break;
                            }
                        }
                        Component component2 = (Component) t3;
                        if (component2 != null) {
                            if (responseBody == null || (num = responseBody.f11096a) == null || (str4 = String.valueOf(num.intValue())) == null) {
                                str4 = "";
                            }
                            C0744e.m191D(component2, str4);
                        }
                    }
                    List<Component> list4 = container.f10972f;
                    if (list4 != null) {
                        Iterator<T> it2 = list4.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                t2 = null;
                                break;
                            }
                            t2 = it2.next();
                            Component component3 = (Component) t2;
                            C6888i.m12438e(component3, "$this$hasErrorMessageTag");
                            List<String> list5 = component3.f10947i;
                            if (list5 != null) {
                                z2 = C0849e.m508b0(list5, "dev:errormessage");
                                continue;
                            } else {
                                z2 = false;
                                continue;
                            }
                            if (z2) {
                                break;
                            }
                        }
                        Component component4 = (Component) t2;
                        if (component4 != null) {
                            if (responseBody == null || (str3 = responseBody.f11097b) == null) {
                                str3 = str;
                            }
                            C0744e.m191D(component4, str3);
                        }
                    }
                    List<Component> list6 = container.f10972f;
                    if (list6 != null) {
                        Iterator<T> it3 = list6.iterator();
                        while (true) {
                            if (!it3.hasNext()) {
                                t = null;
                                break;
                            }
                            t = it3.next();
                            Component component5 = (Component) t;
                            C6888i.m12438e(component5, "$this$hasErrorInfoTag");
                            List<String> list7 = component5.f10947i;
                            if (list7 != null) {
                                z = C0849e.m508b0(list7, "dev:errorinfo");
                                continue;
                            } else {
                                z = false;
                                continue;
                            }
                            if (z) {
                                break;
                            }
                        }
                        Component component6 = (Component) t;
                        if (component6 != null) {
                            C0744e.m191D(component6, str2);
                        }
                    }
                }
            }
            K.f11056x = true;
            page = K;
        }
        return new C0779j(page, false, 2);
    }

    /* renamed from: q */
    public static final C0779j m317q(Page page) {
        C8091a.f16272d.mo26044b("Error with login: %s", page.f11033a);
        return new C0779j((Page) null, false, 2);
    }

    /* renamed from: r */
    public static final C0779j m318r(C7850h0 h0Var, Page page, boolean z) {
        String z2;
        Page page2;
        C7855j0 j0Var = h0Var.f15555m;
        Page page3 = null;
        if (j0Var == null || (z2 = j0Var.mo25572z()) == null) {
            StringBuilder u = C0843a.m460u("Error parsing json: ");
            u.append(page != null ? page.f11033a : null);
            return m316p((ResponseBody) null, u.toString(), 1);
        }
        JsonApp f = m306f();
        if (f != null) {
            String str = page != null ? page.f11033a : null;
            C0816e eVar = C0816e.f639l;
            BoundJsonResponse b = C0816e.f629b.mo16830b(z2);
            C6888i.m12438e(f, "$this$mergeAndReturnBoundPage");
            if (b != null) {
                App app2 = f.f11021d;
                if ((app2 != null ? app2.f10892f : null) != null) {
                    ArrayList arrayList = new ArrayList();
                    List<Style> list = f.f11021d.f10892f;
                    C6888i.m12436c(list);
                    arrayList.addAll(list);
                    List<Style> list2 = b.f10918b;
                    if (list2 != null) {
                        arrayList.addAll(list2);
                        f.f11021d.f10892f = C6790h.m12356j(arrayList);
                    }
                }
                App app3 = f.f11021d;
                if ((app3 != null ? app3.f10888b : null) != null) {
                    ArrayList arrayList2 = new ArrayList();
                    List<Asset> list3 = f.f11021d.f10888b;
                    C6888i.m12436c(list3);
                    arrayList2.addAll(list3);
                    List<Asset> list4 = b.f10919c;
                    if (list4 != null) {
                        arrayList2.addAll(list4);
                        f.f11021d.f10888b = C6790h.m12343b0(C6790h.m12356j(arrayList2));
                    }
                }
                BoundNode boundNode = b.f10917a;
                if ((boundNode != null ? boundNode.f10923a : null) != null) {
                    if (str == null || !C7694h.m13910A(str, "http", false, 2)) {
                        page2 = C0823f.m339H(b.f10917a.f10923a);
                    } else {
                        page2 = C0823f.m339H(str);
                    }
                    if (page2 != null) {
                        BoundNode boundNode2 = b.f10917a;
                        Container container = boundNode2.f10927e;
                        if (container != null) {
                            page2.f11041i = container;
                        }
                        Container container2 = boundNode2.f10928f;
                        if (container2 != null) {
                            page2.f11036d = container2;
                        }
                        List<String> list5 = boundNode2.f10925c;
                        if (list5 != null) {
                            page2.f11045m = list5;
                        }
                        List<Container> list6 = boundNode2.f10930h;
                        if (list6 != null) {
                            page2.f11039g = list6;
                        }
                        if (z) {
                            page2.f11055w = boundNode2.f10929g;
                        } else {
                            page2.f11038f = boundNode2.f10929g;
                        }
                        String str2 = boundNode2.f10932j;
                        if (str2 != null) {
                            page2.f11049q = str2;
                        }
                        page2.f11044l = b.f10920d;
                        page2.f11057y = str;
                        BravoApp.f10730N.mo18366f(f, (String) null);
                        page3 = page2;
                    }
                }
            }
        }
        return new C0779j(page3, false, 2);
    }

    /* renamed from: s */
    public static final C0779j m319s(Page page) {
        Object[] objArr = new Object[1];
        objArr[0] = page != null ? page.f11033a : null;
        C8091a.f16272d.mo26044b("Unauthorized Error: %s", objArr);
        return new C0779j((Page) null, false, 2);
    }

    /* renamed from: t */
    public static final JsonApp m320t(String str) {
        try {
            C8091a.C8093b bVar = C8091a.f16272d;
            bVar.mo26043a("Getting json from url: %s", str);
            C7831c0 h = m308h(str);
            C7839e0.C7840a aVar = new C7839e0.C7840a();
            aVar.mo25540f(str != null ? str : "");
            C7850h0 h2 = ((C7887e) h.mo25525a(aVar.mo25535a())).mo25623h();
            C7855j0 j0Var = h2.f15555m;
            String str2 = null;
            String z = j0Var != null ? j0Var.mo25572z() : null;
            if (h2.f15552j == 200) {
                return m326z(z);
            }
            C0816e eVar = C0816e.f639l;
            JsonApp b = C0816e.f628a.mo16830b(z);
            Object[] objArr = new Object[2];
            objArr[0] = b != null ? b.f11022e : null;
            if (b != null) {
                str2 = b.f11023f;
            }
            objArr[1] = str2;
            bVar.mo26044b("ERROR in getJsonFromUrlAndParseIt: %d - %s", objArr);
            return b;
        } catch (Exception e) {
            C6888i.m12438e(e, "e");
            return e instanceof UnknownHostException ? new JsonApp("UnknownHostException", (String) null, (String) null, (App) null, 12163, "The Internet connection has been lost", "Disconnected", (Long) null) : new JsonApp("Exception", (String) null, (String) null, (App) null, 12164, "An error occurred, please try again later", "Server Unreachable", (Long) null);
        }
    }

    /* renamed from: u */
    public static final JsonApp m321u(int i) {
        Context a = C0849e.m505a();
        C6888i.m12437d(a, "appContext()");
        InputStream openRawResource = a.getResources().openRawResource(i);
        C6888i.m12437d(openRawResource, "appContext().resources.openRawResource(rawId)");
        C8043g H = C5266a.m9812H(C5266a.m9940d4(openRawResource));
        C0816e eVar = C0816e.f639l;
        C5075l<JsonApp> lVar = C0816e.f628a;
        Objects.requireNonNull(lVar);
        return lVar.mo16804a(new C5084r(H));
    }

    /* renamed from: v */
    public static final float m322v(float f, int i) {
        return (f * ((float) i)) / 100.0f;
    }

    /* renamed from: w */
    public static final float m323w(float f) {
        Context a = C0849e.m505a();
        C6888i.m12437d(a, "appContext()");
        Resources resources = a.getResources();
        C6888i.m12437d(resources, "appContext().resources");
        float f2 = f / resources.getDisplayMetrics().scaledDensity;
        boolean z = true;
        float f3 = 2.5f;
        if (((double) m304d()) <= 1.0d) {
            f3 = 0.5f;
        } else {
            if (((double) m304d()) <= 2.0d) {
                f3 = 1.5f;
            } else {
                if (!(((double) m304d()) <= 3.0d)) {
                    if (((double) m304d()) > 4.0d) {
                        z = false;
                    }
                    if (z) {
                        f3 = 3.5f;
                    }
                }
            }
        }
        return f2 * f3;
    }

    /* renamed from: x */
    public static final boolean m324x() {
        BravoApp.C5403b bVar = BravoApp.f10730N;
        JsonApp jsonApp = BravoApp.f10738n;
        return C6888i.m12434a(jsonApp != null ? jsonApp.f11018a : null, "01DZ4603RKEVSFT7ST3YCM592G");
    }

    /* renamed from: y */
    public static final int m325y() {
        Resources system = Resources.getSystem();
        C6888i.m12437d(system, "Resources.getSystem()");
        return system.getDisplayMetrics().widthPixels;
    }

    /* renamed from: z */
    public static final JsonApp m326z(String str) {
        if (str == null) {
            return null;
        }
        try {
            C0816e eVar = C0816e.f639l;
            return C0816e.f628a.mo16830b(str);
        } catch (IOException e) {
            C8091a.f16272d.mo26044b("getJsonFromUrlAndParseIt: Error getting json: %s", e.getLocalizedMessage());
            return null;
        }
    }
}
