package p005b.p006a.p007a.p023n;

import android.text.Editable;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.Toast;
import androidx.core.app.NotificationCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import app.bravostudio.A01F41WRYKPX5KXQ68EGF1JX39R.R;
import com.appfoundry.previewer.BravoApp;
import com.appfoundry.previewer.activities.BravoActivity;
import com.appfoundry.previewer.model.UploadFile;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.regex.Pattern;
import p005b.p006a.p007a.p008a.C0605h;
import p005b.p006a.p007a.p017h.C0719o;
import p005b.p006a.p007a.p017h.C0721p;
import p005b.p006a.p007a.p019j.C0774e;
import p005b.p006a.p007a.p019j.C0775f;
import p005b.p006a.p007a.p019j.C0776g;
import p005b.p006a.p007a.p024o.C0820c;
import p005b.p035e.p036a.p037a.C0843a;
import p005b.p038f.p039a.C0849e;
import p298d.p344x.p346c.C6888i;
import p298d.p344x.p346c.C6901v;
import p298d.p415c0.C7685a;
import p298d.p415c0.C7694h;
import p421m.C7829b0;
import p421m.C7839e0;
import p421m.C7841f;
import p421m.C7843g;
import p421m.C7844g0;
import p421m.C7850h0;
import p421m.p422m0.C7867c;
import p421m.p422m0.p426g.C7887e;
import p441p.p442a.C8091a;

/* renamed from: b.a.a.n.d */
public final class C0812d {

    /* renamed from: a */
    public static Map<String, List<C0774e>> f617a = new LinkedHashMap();

    /* renamed from: b */
    public static List<C0775f> f618b = new ArrayList();

    /* renamed from: c */
    public static List<C0776g> f619c = new ArrayList();

    /* renamed from: d */
    public static C0721p f620d;

    /* renamed from: e */
    public static C0719o f621e;

    /* renamed from: f */
    public static final C0812d f622f = new C0812d();

    /* renamed from: b.a.a.n.d$a */
    public static final class C0813a implements C7843g {

        /* renamed from: a */
        public final /* synthetic */ BravoActivity f623a;

        /* renamed from: b */
        public final /* synthetic */ C6901v f624b;

        /* renamed from: c */
        public final /* synthetic */ C6901v f625c;

        /* renamed from: b.a.a.n.d$a$a */
        public static final class C0814a implements Runnable {

            /* renamed from: g */
            public final /* synthetic */ C0813a f626g;

            public C0814a(C0813a aVar) {
                this.f626g = aVar;
            }

            public final void run() {
                C0813a aVar = this.f626g;
                aVar.f623a.mo18426y(false, (Fragment) aVar.f624b.f13801g, (RelativeLayout) aVar.f625c.f13801g);
            }
        }

        /* renamed from: b.a.a.n.d$a$b */
        public static final class C0815b implements Runnable {

            /* renamed from: g */
            public final /* synthetic */ C0813a f627g;

            public C0815b(C0813a aVar, C7850h0 h0Var) {
                this.f627g = aVar;
            }

            public final void run() {
                C0813a aVar = this.f627g;
                aVar.f623a.mo18426y(false, (Fragment) aVar.f624b.f13801g, (RelativeLayout) aVar.f625c.f13801g);
            }
        }

        public C0813a(BravoActivity bravoActivity, C6901v vVar, C6901v vVar2) {
            this.f623a = bravoActivity;
            this.f624b = vVar;
            this.f625c = vVar2;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:23:0x0076, code lost:
            r0 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:24:0x0077, code lost:
            p005b.p291q.p292a.C5266a.m9877S(r9, r8);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:25:0x007a, code lost:
            throw r0;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo10629a(p421m.C7841f r8, p421m.C7850h0 r9) {
            /*
                r7 = this;
                java.lang.String r0 = "call"
                p298d.p344x.p346c.C6888i.m12438e(r8, r0)
                java.lang.String r8 = "response"
                p298d.p344x.p346c.C6888i.m12438e(r9, r8)
                boolean r8 = r9.isSuccessful()     // Catch:{ all -> 0x0074 }
                r0 = 0
                r1 = 0
                if (r8 != 0) goto L_0x0037
                com.appfoundry.previewer.activities.BravoActivity r8 = r7.f623a     // Catch:{ all -> 0x0074 }
                b.a.a.n.d$a$b r2 = new b.a.a.n.d$a$b     // Catch:{ all -> 0x0074 }
                r2.<init>(r7, r9)     // Catch:{ all -> 0x0074 }
                r8.runOnUiThread(r2)     // Catch:{ all -> 0x0074 }
                com.appfoundry.previewer.activities.BravoActivity r8 = r7.f623a     // Catch:{ all -> 0x0074 }
                java.lang.String r2 = "ERROR: Form was not sent"
                java.lang.String r3 = p005b.p038f.p039a.C0849e.m474D(r9)     // Catch:{ all -> 0x0074 }
                r4 = 4
                p005b.p038f.p039a.C0849e.m483H0(r8, r2, r3, r1, r4)     // Catch:{ all -> 0x0074 }
                java.lang.String r8 = "ERROR: %s"
                r2 = 1
                java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ all -> 0x0074 }
                java.lang.String r3 = r9.f15551i     // Catch:{ all -> 0x0074 }
                r2[r1] = r3     // Catch:{ all -> 0x0074 }
                p.a.a$b r1 = p441p.p442a.C8091a.f16272d     // Catch:{ all -> 0x0074 }
                r1.mo26044b(r8, r2)     // Catch:{ all -> 0x0074 }
                goto L_0x0070
            L_0x0037:
                m.j0 r8 = r9.f15555m     // Catch:{ all -> 0x0074 }
                if (r8 == 0) goto L_0x0040
                java.lang.String r8 = r8.mo25572z()     // Catch:{ all -> 0x0074 }
                goto L_0x0041
            L_0x0040:
                r8 = r0
            L_0x0041:
                r2 = 6
                java.lang.String r3 = "ERROR: Form response is null"
                if (r8 == 0) goto L_0x006b
                com.appfoundry.previewer.activities.BravoActivity r4 = r7.f623a     // Catch:{ Exception -> 0x0062 }
                b.a.a.n.e r5 = p005b.p006a.p007a.p023n.C0816e.f639l     // Catch:{ Exception -> 0x0062 }
                b.p.a.l<com.appfoundry.previewer.model.BackendResponse> r5 = p005b.p006a.p007a.p023n.C0816e.f637j     // Catch:{ Exception -> 0x0062 }
                java.lang.Object r8 = r5.mo16830b(r8)     // Catch:{ Exception -> 0x0062 }
                com.appfoundry.previewer.model.BackendResponse r8 = (com.appfoundry.previewer.model.BackendResponse) r8     // Catch:{ Exception -> 0x0062 }
                d.x.c.v r5 = r7.f625c     // Catch:{ Exception -> 0x0062 }
                T r5 = r5.f13801g     // Catch:{ Exception -> 0x0062 }
                android.widget.RelativeLayout r5 = (android.widget.RelativeLayout) r5     // Catch:{ Exception -> 0x0062 }
                d.x.c.v r6 = r7.f624b     // Catch:{ Exception -> 0x0062 }
                T r6 = r6.f13801g     // Catch:{ Exception -> 0x0062 }
                androidx.fragment.app.Fragment r6 = (androidx.fragment.app.Fragment) r6     // Catch:{ Exception -> 0x0062 }
                r4.mo18424w(r8, r5, r6)     // Catch:{ Exception -> 0x0062 }
                goto L_0x0070
            L_0x0062:
                java.lang.String r8 = "Error parsing FormResponse"
                java.lang.Object[] r4 = new java.lang.Object[r1]     // Catch:{ all -> 0x0074 }
                p.a.a$b r5 = p441p.p442a.C8091a.f16272d     // Catch:{ all -> 0x0074 }
                r5.mo26044b(r8, r4)     // Catch:{ all -> 0x0074 }
            L_0x006b:
                com.appfoundry.previewer.activities.BravoActivity r8 = r7.f623a     // Catch:{ all -> 0x0074 }
                p005b.p038f.p039a.C0849e.m483H0(r8, r3, r0, r1, r2)     // Catch:{ all -> 0x0074 }
            L_0x0070:
                p005b.p291q.p292a.C5266a.m9877S(r9, r0)
                return
            L_0x0074:
                r8 = move-exception
                throw r8     // Catch:{ all -> 0x0076 }
            L_0x0076:
                r0 = move-exception
                p005b.p291q.p292a.C5266a.m9877S(r9, r8)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p005b.p006a.p007a.p023n.C0812d.C0813a.mo10629a(m.f, m.h0):void");
        }

        /* renamed from: b */
        public void mo10630b(C7841f fVar, IOException iOException) {
            C6888i.m12438e(fVar, NotificationCompat.CATEGORY_CALL);
            C6888i.m12438e(iOException, "e");
            this.f623a.runOnUiThread(new C0814a(this));
            C0849e.m483H0(this.f623a, "ERROR: Form was not sent", iOException.getMessage(), 0, 4);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: b.a.a.j.e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: b.a.a.j.e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: b.a.a.j.e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: b.a.a.j.e} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo10635a(p005b.p038f.p039a.C0844a r6, java.lang.Integer r7, p005b.p006a.p007a.p017h.C0719o r8) {
        /*
            r5 = this;
            java.util.Map<java.lang.String, java.util.List<b.a.a.j.e>> r0 = f617a
            r1 = 0
            if (r8 == 0) goto L_0x0008
            java.lang.String r2 = r8.f423a
            goto L_0x0009
        L_0x0008:
            r2 = r1
        L_0x0009:
            java.lang.Object r0 = r0.get(r2)
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto L_0x003f
            java.util.Iterator r0 = r0.iterator()
        L_0x0015:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x0031
            java.lang.Object r2 = r0.next()
            r3 = r2
            b.a.a.j.e r3 = (p005b.p006a.p007a.p019j.C0774e) r3
            java.lang.String r3 = r3.f528b
            if (r8 == 0) goto L_0x0029
            java.lang.String r4 = r8.f424b
            goto L_0x002a
        L_0x0029:
            r4 = r1
        L_0x002a:
            boolean r3 = p298d.p344x.p346c.C6888i.m12434a(r3, r4)
            if (r3 == 0) goto L_0x0015
            r1 = r2
        L_0x0031:
            b.a.a.j.e r1 = (p005b.p006a.p007a.p019j.C0774e) r1
            if (r1 == 0) goto L_0x003f
            java.lang.String r8 = r6.f699h
            r1.f531e = r8
            r1.f532f = r7
            java.lang.String r6 = r6.f702k
            r1.f533g = r6
        L_0x003f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p006a.p007a.p023n.C0812d.mo10635a(b.f.a.a, java.lang.Integer, b.a.a.h.o):void");
    }

    /* renamed from: b */
    public final boolean mo10636b() {
        T t;
        Iterator<T> it = f618b.iterator();
        while (true) {
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            if (!((C0775f) t).f538c) {
                break;
            }
        }
        if (t == null) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public final boolean mo10637c() {
        T t;
        Iterator<T> it = f619c.iterator();
        while (true) {
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            if (!((C0776g) t).f541c) {
                break;
            }
        }
        if (t == null) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000f, code lost:
        r2 = (r2 = r2.getText()).toString();
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String mo10638d(p005b.p006a.p007a.p019j.C0774e r2) {
        /*
            r1 = this;
            java.lang.String r0 = "$this$getText"
            p298d.p344x.p346c.C6888i.m12438e(r2, r0)
            android.widget.EditText r2 = r2.f529c
            if (r2 == 0) goto L_0x0016
            android.text.Editable r2 = r2.getText()
            if (r2 == 0) goto L_0x0016
            java.lang.String r2 = r2.toString()
            if (r2 == 0) goto L_0x0016
            goto L_0x0018
        L_0x0016:
            java.lang.String r2 = ""
        L_0x0018:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p006a.p007a.p023n.C0812d.mo10638d(b.a.a.j.e):java.lang.String");
    }

    /* renamed from: e */
    public final C0774e mo10639e(List<C0774e> list, String str) {
        T t;
        C6888i.m12438e(list, "$this$getType");
        C6888i.m12438e(str, "inputType");
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            if (C6888i.m12434a(((C0774e) t).f527a, str)) {
                break;
            }
        }
        return (C0774e) t;
    }

    /* renamed from: f */
    public final boolean mo10640f(List<C0774e> list) {
        T t;
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            if (C6888i.m12434a(((C0774e) t).f527a, "component:input-file")) {
                break;
            }
        }
        return t != null;
    }

    /* renamed from: g */
    public final boolean mo10641g(List<C0774e> list) {
        T t;
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            if (C6888i.m12434a(((C0774e) t).f527a, "component:input-image")) {
                break;
            }
        }
        return t != null;
    }

    /* renamed from: h */
    public final boolean mo10642h(C0774e eVar) {
        String str;
        Editable text;
        if (eVar == null) {
            return false;
        }
        C6888i.m12438e(eVar, "$this$getText");
        EditText editText = eVar.f529c;
        if (editText == null || (text = editText.getText()) == null || (str = text.toString()) == null) {
            str = "";
        }
        String str2 = eVar.f527a;
        C6888i.m12438e(str, "$this$isValidInput");
        C6888i.m12438e(str2, "type");
        int hashCode = str2.hashCode();
        if (hashCode != -1794194085) {
            if (hashCode == -996722468 && str2.equals("component:input-email")) {
                return Pattern.compile("^(([\\w-]+\\.)+[\\w-]+|([a-zA-Z]{1}|[\\w-]{2,}))@((([0-1]?[0-9]{1,2}|25[0-5]|2[0-4][0-9])\\.([0-1]?[0-9]{1,2}|25[0-5]|2[0-4][0-9])\\.([0-1]?[0-9]{1,2}|25[0-5]|2[0-4][0-9])\\.([0-1]?[0-9]{1,2}|25[0-5]|2[0-4][0-9])){1}|([a-zA-Z]+[\\w-]+\\.)+[a-zA-Z]{2,4})$").matcher(str).matches();
            }
        } else if (str2.equals("component:input-password") && C7694h.m13936n(str)) {
            return false;
        }
        return true;
    }

    /* renamed from: i */
    public final void mo10643i(BravoActivity bravoActivity, String str, List<C0774e> list) {
        String str2;
        Toast toast;
        C0605h hVar;
        T t;
        String str3;
        String str4;
        StringBuilder u;
        String str5;
        BravoActivity bravoActivity2 = bravoActivity;
        String str6 = str;
        for (C0774e next : list) {
            if (!mo10642h(next)) {
                u = C0843a.m460u("Field ");
                u.append(next.f527a);
                str5 = " is not valid. ";
            } else if (C6888i.m12434a(next.f535i, Boolean.TRUE)) {
                if (mo10638d(next).length() == 0) {
                    u = C0843a.m460u("Field ");
                    u.append(next.f527a);
                    str5 = " is required.";
                }
            }
            u.append(str5);
            str2 = u.toString();
        }
        str2 = null;
        if (str2 != null) {
            toast = Toast.makeText(bravoActivity2, str2, 0);
        } else if (str6 != null) {
            C6888i.m12438e(bravoActivity2, "$this$getLastBravoFragment");
            FragmentManager supportFragmentManager = bravoActivity.getSupportFragmentManager();
            C6888i.m12437d(supportFragmentManager, "supportFragmentManager");
            int size = supportFragmentManager.getFragments().size();
            while (true) {
                size--;
                if (size < 0) {
                    hVar = null;
                    break;
                }
                FragmentManager supportFragmentManager2 = bravoActivity.getSupportFragmentManager();
                C6888i.m12437d(supportFragmentManager2, "supportFragmentManager");
                if (supportFragmentManager2.getFragments().get(size) instanceof C0605h) {
                    FragmentManager supportFragmentManager3 = bravoActivity.getSupportFragmentManager();
                    C6888i.m12437d(supportFragmentManager3, "supportFragmentManager");
                    Fragment fragment = supportFragmentManager3.getFragments().get(size);
                    Objects.requireNonNull(fragment, "null cannot be cast to non-null type com.appfoundry.previewer.fragments.BravoFragment");
                    hVar = (C0605h) fragment;
                    break;
                }
            }
            C6901v vVar = new C6901v();
            vVar.f13801g = null;
            C6901v vVar2 = new C6901v();
            vVar2.f13801g = null;
            if (hVar != null) {
                vVar.f13801g = bravoActivity2.mo18418q(hVar.f210g);
                C6888i.m12438e(hVar, "$this$getFragmentLoading");
                t = (RelativeLayout) hVar.mo10333c().findViewById(R.id.fragment_loading);
            } else {
                t = (RelativeLayout) bravoActivity2.findViewById(R.id.main_progressbar);
            }
            vVar2.f13801g = t;
            bravoActivity2.mo18426y(true, (Fragment) vVar.f13801g, (RelativeLayout) t);
            C7839e0.C7840a m = C0820c.m313m();
            m.mo25540f(str6);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (C0774e next2 : list) {
                if (C6888i.m12434a(next2.f527a, "component:input-date") || C6888i.m12434a(next2.f527a, "component:date")) {
                    str3 = next2.f528b;
                    EditText editText = next2.f529c;
                    String valueOf = String.valueOf(editText != null ? editText.getText() : null);
                    C6888i.m12438e(valueOf, "$this$formatToISO8601DateString");
                    DateFormat dateFormat = android.text.format.DateFormat.getDateFormat(C0849e.m505a());
                    C6888i.m12437d(dateFormat, "DateFormat.getDateFormat(appContext())");
                    try {
                        str4 = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'", Locale.getDefault()).format(new SimpleDateFormat(((SimpleDateFormat) dateFormat).toLocalizedPattern(), Locale.getDefault()).parse(valueOf));
                        C6888i.m12437d(str4, "dfFinal.format(parsed)");
                    } catch (ParseException e) {
                        C8091a.f16272d.mo26044b("Error parsing date %s: %s", valueOf, e.getLocalizedMessage());
                        str4 = "";
                    }
                } else if (C6888i.m12434a(next2.f527a, "component:input-image")) {
                    File file = next2.f530d;
                    if (file != null) {
                        String str7 = next2.f528b;
                        String name = file.getName();
                        String str8 = next2.f534h;
                        String valueOf2 = String.valueOf(file.length());
                        C6888i.m12437d(valueOf2, "java.lang.String.valueOf(imageFile.length())");
                        linkedHashMap.put(str7, new UploadFile(name, "image/jpeg", str8, Integer.valueOf(Integer.parseInt(valueOf2))));
                    }
                } else if (C6888i.m12434a(next2.f527a, "component:input-file")) {
                    linkedHashMap.put(next2.f528b, new UploadFile(next2.f531e, next2.f533g, next2.f534h, next2.f532f));
                } else {
                    str3 = next2.f528b;
                    EditText editText2 = next2.f529c;
                    str4 = String.valueOf(editText2 != null ? editText2.getText() : null);
                }
                linkedHashMap.put(str3, str4);
            }
            C0816e eVar = C0816e.f639l;
            String d = C0816e.f634g.mo16832d(linkedHashMap);
            C6888i.m12437d(d, "Moshify.formInputsWithIm…stance.toJson(idValueMap)");
            C7829b0 b0Var = C7829b0.f15448e;
            C7829b0 c = C7829b0.m14223c("application/json; charset=utf-8");
            C6888i.m12438e(d, "$this$toRequestBody");
            Charset charset = C7685a.f15210a;
            if (c != null) {
                Pattern pattern = C7829b0.f15446c;
                Charset a = c.mo25521a((Charset) null);
                if (a == null) {
                    c = C7829b0.m14223c(c + "; charset=utf-8");
                } else {
                    charset = a;
                }
            }
            byte[] bytes = d.getBytes(charset);
            C6888i.m12437d(bytes, "(this as java.lang.String).getBytes(charset)");
            int length = bytes.length;
            C6888i.m12438e(bytes, "$this$toRequestBody");
            C7867c.m14282c((long) bytes.length, (long) 0, (long) length);
            m.mo25538d(new C7844g0.C7845a.C7846a(bytes, c, length, 0));
            ((C7887e) BravoApp.f10730N.mo18363c().mo25525a(m.mo25535a())).mo25622g(new C0813a(bravoActivity2, vVar, vVar2));
            return;
        } else {
            C8091a.f16272d.mo26044b("Form URL does not exist", new Object[0]);
            toast = Toast.makeText(bravoActivity2, "Missing form url", 0);
        }
        toast.show();
    }

    /* renamed from: j */
    public final void mo10644j(List<C0774e> list, String str, String str2) {
        T t;
        C6888i.m12438e(list, "$this$updateFileUrl");
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            if (C6888i.m12434a(((C0774e) t).f528b, str)) {
                break;
            }
        }
        C0774e eVar = (C0774e) t;
        if (eVar != null) {
            eVar.f534h = str2;
        }
    }
}
