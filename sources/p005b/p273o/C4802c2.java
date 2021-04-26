package p005b.p273o;

/* renamed from: b.o.c2 */
public class C4802c2 {

    /* renamed from: b */
    public static final String f9196b = "b.o.c2";

    /* renamed from: a */
    public final C4804b f9197a;

    /* renamed from: b.o.c2$a */
    public interface C4803a {
    }

    /* renamed from: b.o.c2$b */
    public interface C4804b {
        /* renamed from: b */
        void mo16546b();
    }

    public C4802c2(C4804b bVar) {
        this.f9197a = bVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0047 A[Catch:{ NoClassDefFoundError -> 0x004d }] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x007f  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo16545a() {
        /*
            r9 = this;
            b.o.i2$k r0 = p005b.p273o.C4857i2.C4868k.WARN
            android.app.Activity r1 = p005b.p273o.C4857i2.m8943k()
            r2 = 0
            r3 = 0
            if (r1 != 0) goto L_0x0010
            java.lang.String r1 = "OSSystemConditionObserver curActivity null"
            p005b.p273o.C4857i2.m8933a(r0, r1, r3)
            return r2
        L_0x0010:
            r1 = 1
            android.app.Activity r4 = p005b.p273o.C4857i2.m8943k()     // Catch:{ NoClassDefFoundError -> 0x004d }
            boolean r5 = r4 instanceof androidx.appcompat.app.AppCompatActivity     // Catch:{ NoClassDefFoundError -> 0x004d }
            if (r5 == 0) goto L_0x0044
            androidx.appcompat.app.AppCompatActivity r4 = (androidx.appcompat.app.AppCompatActivity) r4     // Catch:{ NoClassDefFoundError -> 0x004d }
            androidx.fragment.app.FragmentManager r4 = r4.getSupportFragmentManager()     // Catch:{ NoClassDefFoundError -> 0x004d }
            b.o.b2 r5 = new b.o.b2     // Catch:{ NoClassDefFoundError -> 0x004d }
            r5.<init>(r9, r4)     // Catch:{ NoClassDefFoundError -> 0x004d }
            r4.registerFragmentLifecycleCallbacks(r5, r1)     // Catch:{ NoClassDefFoundError -> 0x004d }
            java.util.List r4 = r4.getFragments()     // Catch:{ NoClassDefFoundError -> 0x004d }
            int r5 = r4.size()     // Catch:{ NoClassDefFoundError -> 0x004d }
            if (r5 <= 0) goto L_0x0044
            int r5 = r5 - r1
            java.lang.Object r4 = r4.get(r5)     // Catch:{ NoClassDefFoundError -> 0x004d }
            androidx.fragment.app.Fragment r4 = (androidx.fragment.app.Fragment) r4     // Catch:{ NoClassDefFoundError -> 0x004d }
            boolean r5 = r4.isVisible()     // Catch:{ NoClassDefFoundError -> 0x004d }
            if (r5 == 0) goto L_0x0044
            boolean r4 = r4 instanceof androidx.fragment.app.DialogFragment     // Catch:{ NoClassDefFoundError -> 0x004d }
            if (r4 == 0) goto L_0x0044
            r4 = r1
            goto L_0x0045
        L_0x0044:
            r4 = r2
        L_0x0045:
            if (r4 == 0) goto L_0x0064
            java.lang.String r4 = "OSSystemConditionObserver dialog fragment detected"
            p005b.p273o.C4857i2.m8933a(r0, r4, r3)     // Catch:{ NoClassDefFoundError -> 0x004d }
            return r2
        L_0x004d:
            r2 = move-exception
            b.o.i2$k r4 = p005b.p273o.C4857i2.C4868k.INFO
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "AppCompatActivity is not used in this app, skipping 'isDialogFragmentShowing' check: "
            r5.append(r6)
            r5.append(r2)
            java.lang.String r2 = r5.toString()
            p005b.p273o.C4857i2.m8933a(r4, r2, r3)
        L_0x0064:
            b.o.a r2 = p005b.p273o.C4793c.f9174h
            java.lang.ref.WeakReference r4 = new java.lang.ref.WeakReference
            android.app.Activity r5 = p005b.p273o.C4857i2.m8943k()
            r4.<init>(r5)
            boolean r4 = p005b.p273o.C4843g2.m8883e(r4)
            if (r4 == 0) goto L_0x00a2
            if (r2 == 0) goto L_0x00a2
            java.lang.String r5 = f9196b
            b.o.c2$b r6 = r9.f9197a
            android.app.Activity r7 = r2.f9119a
            if (r7 == 0) goto L_0x0098
            android.view.Window r7 = r7.getWindow()
            android.view.View r7 = r7.getDecorView()
            android.view.ViewTreeObserver r7 = r7.getViewTreeObserver()
            b.o.a$e r8 = new b.o.a$e
            r8.<init>(r2, r6, r5, r3)
            r7.addOnGlobalLayoutListener(r8)
            java.util.Map<java.lang.String, b.o.a$e> r2 = p005b.p273o.C4771a.f9117e
            r2.put(r5, r8)
        L_0x0098:
            java.util.Map<java.lang.String, b.o.c2$b> r2 = p005b.p273o.C4771a.f9116d
            r2.put(r5, r6)
            java.lang.String r2 = "OSSystemConditionObserver keyboard up detected"
            p005b.p273o.C4857i2.m8933a(r0, r2, r3)
        L_0x00a2:
            r0 = r4 ^ 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p273o.C4802c2.mo16545a():boolean");
    }
}
