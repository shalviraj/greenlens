package p005b.p096l.p180d.p191q.p192f.p195g;

import android.content.Context;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicBoolean;
import p005b.p035e.p036a.p037a.C0843a;
import p005b.p096l.p097a.p113c.p119b.p126p.C1960d;
import p005b.p096l.p097a.p113c.p150j.C3423e0;
import p005b.p096l.p097a.p113c.p150j.C3427g;
import p005b.p096l.p097a.p113c.p150j.C3428h;
import p005b.p096l.p097a.p113c.p150j.C3429i;
import p005b.p096l.p097a.p113c.p150j.C3430j;
import p005b.p096l.p180d.p191q.p192f.C3981a;
import p005b.p096l.p180d.p191q.p192f.C3982b;
import p005b.p096l.p180d.p191q.p192f.p193e.C3987a;
import p005b.p096l.p180d.p191q.p192f.p195g.C4004e;
import p005b.p096l.p180d.p191q.p192f.p196h.C4051b;
import p005b.p096l.p180d.p191q.p192f.p197i.C4084b;
import p005b.p096l.p180d.p191q.p192f.p197i.C4093f;
import p005b.p096l.p180d.p191q.p192f.p197i.C4096g;
import p005b.p096l.p180d.p191q.p192f.p197i.C4099i;
import p005b.p096l.p180d.p191q.p192f.p197i.C4125t;
import p005b.p096l.p180d.p191q.p192f.p197i.C4129v;
import p005b.p096l.p180d.p191q.p192f.p200k.C4174g;
import p005b.p096l.p180d.p191q.p192f.p200k.C4175h;
import p005b.p096l.p180d.p191q.p192f.p202m.p203j.C4188a;

/* renamed from: b.l.d.q.f.g.q */
public class C4032q {

    /* renamed from: s */
    public static final /* synthetic */ int f7387s = 0;

    /* renamed from: a */
    public final Context f7388a;

    /* renamed from: b */
    public final C4001c0 f7389b;

    /* renamed from: c */
    public final C4048y f7390c;

    /* renamed from: d */
    public final C4028o0 f7391d;

    /* renamed from: e */
    public final C4008f f7392e;

    /* renamed from: f */
    public final C4012g0 f7393f;

    /* renamed from: g */
    public final C4175h f7394g;

    /* renamed from: h */
    public final C3995a f7395h;

    /* renamed from: i */
    public final C4051b.C4053b f7396i;

    /* renamed from: j */
    public final C4051b f7397j;

    /* renamed from: k */
    public final C3981a f7398k;

    /* renamed from: l */
    public final String f7399l;

    /* renamed from: m */
    public final C3987a f7400m;

    /* renamed from: n */
    public final C4024m0 f7401n;

    /* renamed from: o */
    public C3998b0 f7402o;

    /* renamed from: p */
    public final C3429i<Boolean> f7403p = new C3429i<>();

    /* renamed from: q */
    public final C3429i<Boolean> f7404q = new C3429i<>();

    /* renamed from: r */
    public final C3429i<Void> f7405r = new C3429i<>();

    /* renamed from: b.l.d.q.f.g.q$a */
    public class C4033a implements C3427g<Boolean, Void> {

        /* renamed from: a */
        public final /* synthetic */ C3428h f7406a;

        public C4033a(C3428h hVar) {
            this.f7406a = hVar;
        }

        @NonNull
        /* renamed from: a */
        public C3428h mo14700a(@Nullable Object obj) {
            return C4032q.this.f7392e.mo15519c(new C4030p(this, (Boolean) obj));
        }
    }

    public C4032q(Context context, C4008f fVar, C4012g0 g0Var, C4001c0 c0Var, C4175h hVar, C4048y yVar, C3995a aVar, C4028o0 o0Var, C4051b bVar, C4051b.C4053b bVar2, C4024m0 m0Var, C3981a aVar2, C3987a aVar3) {
        new AtomicBoolean(false);
        this.f7388a = context;
        this.f7392e = fVar;
        this.f7393f = g0Var;
        this.f7389b = c0Var;
        this.f7394g = hVar;
        this.f7390c = yVar;
        this.f7395h = aVar;
        this.f7391d = o0Var;
        this.f7397j = bVar;
        this.f7396i = bVar2;
        this.f7398k = aVar2;
        this.f7399l = aVar.f7302g.mo15794a();
        this.f7400m = aVar3;
        this.f7401n = m0Var;
    }

    /* renamed from: a */
    public static void m7430a(C4032q qVar) {
        String str;
        String str2;
        Integer num;
        C4032q qVar2 = qVar;
        Objects.requireNonNull(qVar);
        long time = new Date().getTime() / 1000;
        new C4002d(qVar2.f7393f);
        String str3 = C4002d.f7317b;
        C3982b bVar = C3982b.f7289a;
        bVar.mo15496b("Opening a new session with ID " + str3);
        qVar2.f7398k.mo15493g(str3);
        Locale locale = Locale.US;
        qVar2.f7398k.mo15491e(str3, String.format(locale, "Crashlytics Android SDK/%s", new Object[]{"17.4.1"}), time);
        C4012g0 g0Var = qVar2.f7393f;
        String str4 = g0Var.f7355c;
        C3995a aVar = qVar2.f7395h;
        qVar2.f7398k.mo15490d(str3, str4, aVar.f7300e, aVar.f7301f, g0Var.mo15522b(), (qVar2.f7395h.f7298c != null ? C4003d0.APP_STORE : C4003d0.DEVELOPER).f7323g, qVar2.f7399l);
        String str5 = Build.VERSION.RELEASE;
        String str6 = Build.VERSION.CODENAME;
        qVar2.f7398k.mo15492f(str3, str5, str6, C4004e.m7404l(qVar2.f7388a));
        Context context = qVar2.f7388a;
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        C4004e.C4005a aVar2 = C4004e.C4005a.UNKNOWN;
        String str7 = Build.CPU_ABI;
        if (TextUtils.isEmpty(str7)) {
            bVar.mo15499e("Architecture#getValue()::Build.CPU_ABI returned null or empty");
        } else {
            C4004e.C4005a aVar3 = C4004e.C4005a.f7336q.get(str7.toLowerCase(locale));
            if (aVar3 != null) {
                aVar2 = aVar3;
            }
        }
        int ordinal = aVar2.ordinal();
        String str8 = Build.MODEL;
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        long i = C4004e.m7401i();
        String str9 = str5;
        Locale locale2 = locale;
        long blockCount = ((long) statFs.getBlockCount()) * ((long) statFs.getBlockSize());
        boolean k = C4004e.m7403k(context);
        int e = C4004e.m7397e(context);
        String str10 = Build.MANUFACTURER;
        String str11 = Build.PRODUCT;
        String str12 = str10;
        C3982b bVar2 = bVar;
        String str13 = str7;
        String str14 = str8;
        String str15 = str9;
        String str16 = str6;
        Locale locale3 = locale2;
        qVar2.f7398k.mo15489c(str3, ordinal, str8, availableProcessors, i, blockCount, k, e, str12, str11);
        qVar2.f7397j.mo15560a(str3);
        C4024m0 m0Var = qVar2.f7401n;
        C4049z zVar = m0Var.f7374a;
        Objects.requireNonNull(zVar);
        Charset charset = C4129v.f7711a;
        C4084b.C4086b bVar3 = new C4084b.C4086b();
        bVar3.f7590a = "17.4.1";
        String str17 = zVar.f7445c.f7296a;
        Objects.requireNonNull(str17, "Null gmpAppId");
        bVar3.f7591b = str17;
        String b = zVar.f7444b.mo15522b();
        Objects.requireNonNull(b, "Null installationUuid");
        bVar3.f7593d = b;
        String str18 = zVar.f7445c.f7300e;
        Objects.requireNonNull(str18, "Null buildVersion");
        bVar3.f7594e = str18;
        String str19 = zVar.f7445c.f7301f;
        Objects.requireNonNull(str19, "Null displayVersion");
        bVar3.f7595f = str19;
        bVar3.f7592c = 4;
        C4093f.C4095b bVar4 = new C4093f.C4095b();
        bVar4.mo15626b(false);
        bVar4.f7617c = Long.valueOf(time);
        Objects.requireNonNull(str3, "Null identifier");
        bVar4.f7616b = str3;
        String str20 = C4049z.f7442f;
        Objects.requireNonNull(str20, "Null generator");
        bVar4.f7615a = str20;
        String str21 = zVar.f7444b.f7355c;
        Objects.requireNonNull(str21, "Null identifier");
        String str22 = zVar.f7445c.f7300e;
        Objects.requireNonNull(str22, "Null version");
        String str23 = zVar.f7445c.f7301f;
        String b2 = zVar.f7444b.mo15522b();
        String a = zVar.f7445c.f7302g.mo15794a();
        if (a != null) {
            str = a;
            str2 = "Unity";
        } else {
            str2 = null;
            str = null;
        }
        bVar4.f7620f = new C4096g(str21, str22, str23, (C4129v.C4134d.C4135a.C4136a) null, b2, str2, str, (C4096g.C4097a) null);
        Integer num2 = 3;
        String str24 = str9;
        Objects.requireNonNull(str24, "Null version");
        String str25 = str16;
        Objects.requireNonNull(str25, "Null buildVersion");
        Boolean valueOf = Boolean.valueOf(C4004e.m7404l(zVar.f7443a));
        String str26 = num2 == null ? " platform" : "";
        if (valueOf == null) {
            str26 = C0843a.m451l(str26, " jailbroken");
        }
        if (str26.isEmpty()) {
            bVar4.f7622h = new C4125t(num2.intValue(), str24, str25, valueOf.booleanValue(), (C4125t.C4126a) null);
            StatFs statFs2 = new StatFs(Environment.getDataDirectory().getPath());
            int i2 = 7;
            if (!TextUtils.isEmpty(str13) && (num = C4049z.f7441e.get(str13.toLowerCase(locale3))) != null) {
                i2 = num.intValue();
            }
            int availableProcessors2 = Runtime.getRuntime().availableProcessors();
            long i3 = C4004e.m7401i();
            long blockCount2 = ((long) statFs2.getBlockCount()) * ((long) statFs2.getBlockSize());
            boolean k2 = C4004e.m7403k(zVar.f7443a);
            int e2 = C4004e.m7397e(zVar.f7443a);
            C4099i.C4101b bVar5 = new C4099i.C4101b();
            bVar5.f7642a = Integer.valueOf(i2);
            String str27 = str14;
            Objects.requireNonNull(str27, "Null model");
            bVar5.f7643b = str27;
            bVar5.f7644c = Integer.valueOf(availableProcessors2);
            bVar5.f7645d = Long.valueOf(i3);
            bVar5.f7646e = Long.valueOf(blockCount2);
            bVar5.f7647f = Boolean.valueOf(k2);
            bVar5.f7648g = Integer.valueOf(e2);
            String str28 = str12;
            Objects.requireNonNull(str28, "Null manufacturer");
            bVar5.f7649h = str28;
            String str29 = str11;
            Objects.requireNonNull(str29, "Null modelClass");
            bVar5.f7650i = str29;
            bVar4.f7623i = bVar5.mo15653a();
            bVar4.f7625k = 3;
            bVar3.f7596g = bVar4.mo15625a();
            C4129v a2 = bVar3.mo15594a();
            C4174g gVar = m0Var.f7375b;
            Objects.requireNonNull(gVar);
            C4129v.C4134d h = a2.mo15590h();
            if (h == null) {
                bVar2.mo15496b("Could not get session for report");
                return;
            }
            String g = h.mo15617g();
            try {
                File f = gVar.mo15777f(g);
                C4174g.m7708g(f);
                C4174g.m7711j(new File(f, "report"), C4174g.f7734i.mo15767g(a2));
            } catch (IOException e3) {
                C3982b bVar6 = C3982b.f7289a;
                String l = C0843a.m451l("Could not persist report for session ", g);
                if (bVar6.mo15495a(3)) {
                    Log.d("FirebaseCrashlytics", l, e3);
                }
            }
        } else {
            throw new IllegalStateException(C0843a.m451l("Missing required properties:", str26));
        }
    }

    /* renamed from: b */
    public static C3428h m7431b(C4032q qVar) {
        boolean z;
        C3428h hVar;
        Objects.requireNonNull(qVar);
        ArrayList arrayList = new ArrayList();
        File[] listFiles = qVar.mo15540g().listFiles(C4015i.f7358a);
        if (listFiles == null) {
            listFiles = new File[0];
        }
        for (File file : listFiles) {
            try {
                long parseLong = Long.parseLong(file.getName().substring(3));
                try {
                    Class.forName("com.google.firebase.crash.FirebaseCrash");
                    z = true;
                } catch (ClassNotFoundException unused) {
                    z = false;
                }
                if (z) {
                    C3982b.f7289a.mo15500f("Skipping logging Crashlytics event to Firebase, FirebaseCrash exists");
                    hVar = C1960d.m2740P(null);
                } else {
                    C3982b.f7289a.mo15496b("Logging app exception event to Firebase Analytics");
                    hVar = C1960d.m2829o(new ScheduledThreadPoolExecutor(1), new C4017j(qVar, parseLong));
                }
                arrayList.add(hVar);
            } catch (NumberFormatException unused2) {
                C3982b bVar = C3982b.f7289a;
                StringBuilder u = C0843a.m460u("Could not parse app exception timestamp from file ");
                u.append(file.getName());
                bVar.mo15500f(u.toString());
            }
            file.delete();
        }
        return C1960d.m2753T0(arrayList);
    }

    /* JADX WARNING: type inference failed for: r15v0, types: [int, boolean] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:53:0x016d */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x01de  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x01e1  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x01fd A[Catch:{ IOException -> 0x023d }] */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x0235 A[SYNTHETIC] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo15536c(boolean r15) {
        /*
            r14 = this;
            b.l.d.q.f.g.m0 r0 = r14.f7401n
            java.util.List r0 = r0.mo15532b()
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            int r1 = r0.size()
            if (r1 > r15) goto L_0x0016
            b.l.d.q.f.b r15 = p005b.p096l.p180d.p191q.p192f.C3982b.f7289a
            java.lang.String r0 = "No open sessions to be closed."
            r15.mo15499e(r0)
            return
        L_0x0016:
            java.lang.Object r1 = r0.get(r15)
            java.lang.String r1 = (java.lang.String) r1
            b.l.d.q.f.a r2 = r14.f7398k
            boolean r2 = r2.mo15494h(r1)
            if (r2 == 0) goto L_0x0073
            b.l.d.q.f.b r2 = p005b.p096l.p180d.p191q.p192f.C3982b.f7289a
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Finalizing native report for session "
            r3.append(r4)
            r3.append(r1)
            java.lang.String r3 = r3.toString()
            r2.mo15499e(r3)
            b.l.d.q.f.a r3 = r14.f7398k
            b.l.d.q.f.d r3 = r3.mo15488b(r1)
            java.util.Objects.requireNonNull(r3)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "No minidump data found for session "
            r3.append(r4)
            r3.append(r1)
            java.lang.String r3 = r3.toString()
            r2.mo15500f(r3)
            b.l.d.q.f.a r3 = r14.f7398k
            boolean r3 = r3.mo15487a(r1)
            if (r3 != 0) goto L_0x0073
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Could not finalize native session: "
            r3.append(r4)
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r2.mo15500f(r1)
        L_0x0073:
            r1 = 0
            r2 = 0
            if (r15 == 0) goto L_0x007e
            java.lang.Object r15 = r0.get(r1)
            java.lang.String r15 = (java.lang.String) r15
            goto L_0x007f
        L_0x007e:
            r15 = r2
        L_0x007f:
            b.l.d.q.f.g.m0 r0 = r14.f7401n
            java.util.Date r3 = new java.util.Date
            r3.<init>()
            long r3 = r3.getTime()
            r5 = 1000(0x3e8, double:4.94E-321)
            long r3 = r3 / r5
            b.l.d.q.f.k.g r0 = r0.f7375b
            b.l.d.q.f.k.b r5 = new b.l.d.q.f.k.b
            r5.<init>(r15)
            java.io.File r15 = r0.f7738b
            java.util.List r15 = p005b.p096l.p180d.p191q.p192f.p200k.C4174g.m7706d(r15, r5)
            java.util.Comparator<? super java.io.File> r5 = p005b.p096l.p180d.p191q.p192f.p200k.C4174g.f7735j
            java.util.Collections.sort(r15, r5)
            int r5 = r15.size()
            r6 = 8
            if (r5 > r6) goto L_0x00a8
            goto L_0x00c8
        L_0x00a8:
            int r5 = r15.size()
            java.util.List r5 = r15.subList(r6, r5)
            java.util.Iterator r5 = r5.iterator()
        L_0x00b4:
            boolean r7 = r5.hasNext()
            if (r7 == 0) goto L_0x00c4
            java.lang.Object r7 = r5.next()
            java.io.File r7 = (java.io.File) r7
            p005b.p096l.p180d.p191q.p192f.p200k.C4174g.m7710i(r7)
            goto L_0x00b4
        L_0x00c4:
            java.util.List r15 = r15.subList(r1, r6)
        L_0x00c8:
            java.util.Iterator r15 = r15.iterator()
        L_0x00cc:
            boolean r5 = r15.hasNext()
            if (r5 == 0) goto L_0x0259
            java.lang.Object r5 = r15.next()
            java.io.File r5 = (java.io.File) r5
            b.l.d.q.f.b r6 = p005b.p096l.p180d.p191q.p192f.C3982b.f7289a
            java.lang.String r7 = "Finalizing report for session "
            java.lang.StringBuilder r7 = p005b.p035e.p036a.p037a.C0843a.m460u(r7)
            java.lang.String r8 = r5.getName()
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            r6.mo15499e(r7)
            java.io.FilenameFilter r7 = p005b.p096l.p180d.p191q.p192f.p200k.C4174g.f7736k
            java.util.List r7 = p005b.p096l.p180d.p191q.p192f.p200k.C4174g.m7707e(r5, r7)
            boolean r8 = r7.isEmpty()
            if (r8 == 0) goto L_0x0115
            java.lang.String r7 = "Session "
            java.lang.StringBuilder r7 = p005b.p035e.p036a.p037a.C0843a.m460u(r7)
            java.lang.String r8 = r5.getName()
            r7.append(r8)
            java.lang.String r8 = " has no events."
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            r6.mo15499e(r7)
            goto L_0x0254
        L_0x0115:
            java.util.Collections.sort(r7)
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Iterator r7 = r7.iterator()
        L_0x0121:
            r8 = r1
        L_0x0122:
            boolean r9 = r7.hasNext()
            if (r9 == 0) goto L_0x018d
            java.lang.Object r9 = r7.next()
            java.io.File r9 = (java.io.File) r9
            b.l.d.q.f.i.x.h r10 = p005b.p096l.p180d.p191q.p192f.p200k.C4174g.f7734i     // Catch:{ IOException -> 0x0175 }
            java.lang.String r11 = p005b.p096l.p180d.p191q.p192f.p200k.C4174g.m7709h(r9)     // Catch:{ IOException -> 0x0175 }
            java.util.Objects.requireNonNull(r10)     // Catch:{ IOException -> 0x0175 }
            android.util.JsonReader r10 = new android.util.JsonReader     // Catch:{ IllegalStateException -> 0x016e }
            java.io.StringReader r12 = new java.io.StringReader     // Catch:{ IllegalStateException -> 0x016e }
            r12.<init>(r11)     // Catch:{ IllegalStateException -> 0x016e }
            r10.<init>(r12)     // Catch:{ IllegalStateException -> 0x016e }
            b.l.d.q.f.i.v$d$d r11 = p005b.p096l.p180d.p191q.p192f.p197i.p198x.C4163h.m7695b(r10)     // Catch:{ all -> 0x0169 }
            r10.close()     // Catch:{ IllegalStateException -> 0x016e }
            r6.add(r11)     // Catch:{ IOException -> 0x0175 }
            r10 = 1
            if (r8 != 0) goto L_0x0167
            java.lang.String r11 = r9.getName()     // Catch:{ IOException -> 0x0175 }
            java.lang.String r12 = "event"
            boolean r12 = r11.startsWith(r12)     // Catch:{ IOException -> 0x0175 }
            if (r12 == 0) goto L_0x0164
            java.lang.String r12 = "_"
            boolean r8 = r11.endsWith(r12)     // Catch:{ IOException -> 0x0175 }
            if (r8 == 0) goto L_0x0164
            r8 = r10
            goto L_0x0165
        L_0x0164:
            r8 = r1
        L_0x0165:
            if (r8 == 0) goto L_0x0121
        L_0x0167:
            r8 = r10
            goto L_0x0122
        L_0x0169:
            r11 = move-exception
            r10.close()     // Catch:{ all -> 0x016d }
        L_0x016d:
            throw r11     // Catch:{ IllegalStateException -> 0x016e }
        L_0x016e:
            r10 = move-exception
            java.io.IOException r11 = new java.io.IOException     // Catch:{ IOException -> 0x0175 }
            r11.<init>(r10)     // Catch:{ IOException -> 0x0175 }
            throw r11     // Catch:{ IOException -> 0x0175 }
        L_0x0175:
            r10 = move-exception
            b.l.d.q.f.b r11 = p005b.p096l.p180d.p191q.p192f.C3982b.f7289a
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r13 = "Could not add event to report for "
            r12.append(r13)
            r12.append(r9)
            java.lang.String r9 = r12.toString()
            r11.mo15501g(r9, r10)
            goto L_0x0122
        L_0x018d:
            boolean r7 = r6.isEmpty()
            if (r7 == 0) goto L_0x01ab
            b.l.d.q.f.b r6 = p005b.p096l.p180d.p191q.p192f.C3982b.f7289a
            java.lang.String r7 = "Could not parse event files for session "
            java.lang.StringBuilder r7 = p005b.p035e.p036a.p037a.C0843a.m460u(r7)
            java.lang.String r8 = r5.getName()
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            r6.mo15500f(r7)
            goto L_0x0254
        L_0x01ab:
            java.io.File r7 = new java.io.File
            java.lang.String r9 = "user"
            r7.<init>(r5, r9)
            boolean r9 = r7.isFile()
            if (r9 == 0) goto L_0x01d4
            java.lang.String r7 = p005b.p096l.p180d.p191q.p192f.p200k.C4174g.m7709h(r7)     // Catch:{ IOException -> 0x01bd }
            goto L_0x01d5
        L_0x01bd:
            r7 = move-exception
            b.l.d.q.f.b r9 = p005b.p096l.p180d.p191q.p192f.C3982b.f7289a
            java.lang.String r10 = "Could not read user ID file in "
            java.lang.StringBuilder r10 = p005b.p035e.p036a.p037a.C0843a.m460u(r10)
            java.lang.String r11 = r5.getName()
            r10.append(r11)
            java.lang.String r10 = r10.toString()
            r9.mo15501g(r10, r7)
        L_0x01d4:
            r7 = r2
        L_0x01d5:
            java.io.File r9 = new java.io.File
            java.lang.String r10 = "report"
            r9.<init>(r5, r10)
            if (r8 == 0) goto L_0x01e1
            java.io.File r10 = r0.f7739c
            goto L_0x01e3
        L_0x01e1:
            java.io.File r10 = r0.f7740d
        L_0x01e3:
            b.l.d.q.f.i.x.h r11 = p005b.p096l.p180d.p191q.p192f.p200k.C4174g.f7734i     // Catch:{ IOException -> 0x023d }
            java.lang.String r12 = p005b.p096l.p180d.p191q.p192f.p200k.C4174g.m7709h(r9)     // Catch:{ IOException -> 0x023d }
            b.l.d.q.f.i.v r12 = r11.mo15766f(r12)     // Catch:{ IOException -> 0x023d }
            b.l.d.q.f.i.v r7 = r12.mo15739j(r3, r8, r7)     // Catch:{ IOException -> 0x023d }
            b.l.d.q.f.i.w r8 = new b.l.d.q.f.i.w     // Catch:{ IOException -> 0x023d }
            r8.<init>(r6)     // Catch:{ IOException -> 0x023d }
            r6 = r7
            b.l.d.q.f.i.b r6 = (p005b.p096l.p180d.p191q.p192f.p197i.C4084b) r6     // Catch:{ IOException -> 0x023d }
            b.l.d.q.f.i.v$d r6 = r6.f7588h     // Catch:{ IOException -> 0x023d }
            if (r6 == 0) goto L_0x0235
            b.l.d.q.f.i.v$a r6 = r7.mo15592i()     // Catch:{ IOException -> 0x023d }
            b.l.d.q.f.i.b r7 = (p005b.p096l.p180d.p191q.p192f.p197i.C4084b) r7     // Catch:{ IOException -> 0x023d }
            b.l.d.q.f.i.v$d r7 = r7.f7588h     // Catch:{ IOException -> 0x023d }
            b.l.d.q.f.i.v$d$b r7 = r7.mo15623l()     // Catch:{ IOException -> 0x023d }
            b.l.d.q.f.i.f$b r7 = (p005b.p096l.p180d.p191q.p192f.p197i.C4093f.C4095b) r7     // Catch:{ IOException -> 0x023d }
            r7.f7624j = r8     // Catch:{ IOException -> 0x023d }
            b.l.d.q.f.i.v$d r7 = r7.mo15625a()     // Catch:{ IOException -> 0x023d }
            b.l.d.q.f.i.b$b r6 = (p005b.p096l.p180d.p191q.p192f.p197i.C4084b.C4086b) r6     // Catch:{ IOException -> 0x023d }
            r6.f7596g = r7     // Catch:{ IOException -> 0x023d }
            b.l.d.q.f.i.v r6 = r6.mo15594a()     // Catch:{ IOException -> 0x023d }
            r7 = r6
            b.l.d.q.f.i.b r7 = (p005b.p096l.p180d.p191q.p192f.p197i.C4084b) r7     // Catch:{ IOException -> 0x023d }
            b.l.d.q.f.i.v$d r7 = r7.f7588h     // Catch:{ IOException -> 0x023d }
            if (r7 != 0) goto L_0x0221
            goto L_0x0254
        L_0x0221:
            java.io.File r8 = new java.io.File     // Catch:{ IOException -> 0x023d }
            p005b.p096l.p180d.p191q.p192f.p200k.C4174g.m7708g(r10)     // Catch:{ IOException -> 0x023d }
            java.lang.String r7 = r7.mo15617g()     // Catch:{ IOException -> 0x023d }
            r8.<init>(r10, r7)     // Catch:{ IOException -> 0x023d }
            java.lang.String r6 = r11.mo15767g(r6)     // Catch:{ IOException -> 0x023d }
            p005b.p096l.p180d.p191q.p192f.p200k.C4174g.m7711j(r8, r6)     // Catch:{ IOException -> 0x023d }
            goto L_0x0254
        L_0x0235:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException     // Catch:{ IOException -> 0x023d }
            java.lang.String r7 = "Reports without sessions cannot have events added to them."
            r6.<init>(r7)     // Catch:{ IOException -> 0x023d }
            throw r6     // Catch:{ IOException -> 0x023d }
        L_0x023d:
            r6 = move-exception
            b.l.d.q.f.b r7 = p005b.p096l.p180d.p191q.p192f.C3982b.f7289a
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r10 = "Could not synthesize final report file for "
            r8.append(r10)
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            r7.mo15501g(r8, r6)
        L_0x0254:
            p005b.p096l.p180d.p191q.p192f.p200k.C4174g.m7710i(r5)
            goto L_0x00cc
        L_0x0259:
            b.l.d.q.f.m.f r15 = r0.f7742f
            b.l.d.q.f.m.e r15 = (p005b.p096l.p180d.p191q.p192f.p202m.C4183e) r15
            b.l.d.q.f.m.j.d r15 = r15.mo15784b()
            b.l.d.q.f.m.j.c r15 = r15.mo15787a()
            java.util.Objects.requireNonNull(r15)
            java.util.List r15 = r0.mo15776c()
            java.util.ArrayList r15 = (java.util.ArrayList) r15
            int r0 = r15.size()
            r1 = 4
            if (r0 > r1) goto L_0x0276
            goto L_0x028e
        L_0x0276:
            java.util.List r15 = r15.subList(r1, r0)
            java.util.Iterator r15 = r15.iterator()
        L_0x027e:
            boolean r0 = r15.hasNext()
            if (r0 == 0) goto L_0x028e
            java.lang.Object r0 = r15.next()
            java.io.File r0 = (java.io.File) r0
            r0.delete()
            goto L_0x027e
        L_0x028e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p096l.p180d.p191q.p192f.p195g.C4032q.mo15536c(boolean):void");
    }

    /* renamed from: d */
    public final void mo15537d(long j) {
        try {
            File g = mo15540g();
            new File(g, ".ae" + j).createNewFile();
        } catch (IOException e) {
            if (C3982b.f7289a.mo15495a(5)) {
                Log.w("FirebaseCrashlytics", "Could not create app exception marker file.", e);
            }
        }
    }

    /* renamed from: e */
    public boolean mo15538e() {
        this.f7392e.mo15517a();
        C3998b0 b0Var = this.f7402o;
        if (b0Var != null && b0Var.f7308d.get()) {
            C3982b.f7289a.mo15500f("Skipping session finalization because a crash has already occurred.");
            return false;
        }
        C3982b bVar = C3982b.f7289a;
        bVar.mo15499e("Finalizing previously open sessions.");
        try {
            mo15536c(true);
            bVar.mo15499e("Closed all previously open sessions.");
            return true;
        } catch (Exception e) {
            if (C3982b.f7289a.mo15495a(6)) {
                Log.e("FirebaseCrashlytics", "Unable to finalize previously open sessions.", e);
            }
            return false;
        }
    }

    @Nullable
    /* renamed from: f */
    public final String mo15539f() {
        ArrayList arrayList = (ArrayList) this.f7401n.mo15532b();
        if (!arrayList.isEmpty()) {
            return (String) arrayList.get(0);
        }
        return null;
    }

    /* renamed from: g */
    public File mo15540g() {
        return this.f7394g.mo15778a();
    }

    /* renamed from: h */
    public C3428h<Void> mo15541h(C3428h<C4188a> hVar) {
        Object obj;
        C3423e0<TResult> e0Var;
        if (!(!((ArrayList) this.f7401n.f7375b.mo15776c()).isEmpty())) {
            C3982b.f7289a.mo15499e("No crash reports are available to be sent.");
            this.f7403p.mo14702b(Boolean.FALSE);
            return C1960d.m2740P(null);
        }
        C3982b bVar = C3982b.f7289a;
        bVar.mo15499e("Crash reports are available to be sent.");
        if (this.f7389b.mo15513a()) {
            bVar.mo15496b("Automatic data collection is enabled. Allowing upload.");
            this.f7403p.mo14702b(Boolean.FALSE);
            obj = C1960d.m2740P(Boolean.TRUE);
        } else {
            bVar.mo15496b("Automatic data collection is disabled.");
            bVar.mo15499e("Notifying that unsent reports are available.");
            this.f7403p.mo14702b(Boolean.TRUE);
            C4001c0 c0Var = this.f7389b;
            synchronized (c0Var.f7311c) {
                e0Var = c0Var.f7312d.f6197a;
            }
            C4025n nVar = new C4025n(this);
            Objects.requireNonNull(e0Var);
            C3428h<TContinuationResult> o = e0Var.mo14693o(C3430j.f6198a, nVar);
            bVar.mo15496b("Waiting for send/deleteUnsentReports to be called.");
            C3423e0<TResult> e0Var2 = this.f7404q.f6197a;
            ExecutorService executorService = C4039s0.f7417a;
            C3429i iVar = new C3429i();
            C4034q0 q0Var = new C4034q0(iVar);
            o.mo14684f(q0Var);
            e0Var2.mo14684f(q0Var);
            obj = iVar.f6197a;
        }
        C4033a aVar = new C4033a(hVar);
        C3423e0 e0Var3 = (C3423e0) obj;
        Objects.requireNonNull(e0Var3);
        return e0Var3.mo14693o(C3430j.f6198a, aVar);
    }
}
