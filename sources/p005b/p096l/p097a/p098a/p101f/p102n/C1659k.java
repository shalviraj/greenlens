package p005b.p096l.p097a.p098a.p101f.p102n;

import android.content.Context;
import androidx.annotation.Nullable;
import java.util.HashMap;
import java.util.Map;

/* renamed from: b.l.a.a.f.n.k */
public class C1659k implements C1652e {

    /* renamed from: a */
    public final C1660a f2915a;

    /* renamed from: b */
    public final C1657i f2916b;

    /* renamed from: c */
    public final Map<String, C1662m> f2917c = new HashMap();

    /* renamed from: b.l.a.a.f.n.k$a */
    public static class C1660a {

        /* renamed from: a */
        public final Context f2918a;

        /* renamed from: b */
        public Map<String, String> f2919b = null;

        public C1660a(Context context) {
            this.f2918a = context;
        }

        /* JADX WARNING: Removed duplicated region for block: B:16:0x0037  */
        /* JADX WARNING: Removed duplicated region for block: B:17:0x0041  */
        @androidx.annotation.Nullable
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public p005b.p096l.p097a.p098a.p101f.p102n.C1651d mo11849a(java.lang.String r15) {
            /*
                r14 = this;
                java.lang.String r0 = "Could not instantiate %s"
                java.lang.String r1 = "Could not instantiate %s."
                java.util.Map<java.lang.String, java.lang.String> r2 = r14.f2919b
                r3 = 0
                java.lang.String r4 = "BackendRegistry"
                r5 = 0
                if (r2 != 0) goto L_0x0093
                android.content.Context r2 = r14.f2918a
                android.content.pm.PackageManager r6 = r2.getPackageManager()     // Catch:{ NameNotFoundException -> 0x002f }
                if (r6 != 0) goto L_0x0017
                java.lang.String r2 = "Context has no PackageManager."
                goto L_0x0028
            L_0x0017:
                android.content.ComponentName r7 = new android.content.ComponentName     // Catch:{ NameNotFoundException -> 0x002f }
                java.lang.Class<com.google.android.datatransport.runtime.backends.TransportBackendDiscovery> r8 = com.google.android.datatransport.runtime.backends.TransportBackendDiscovery.class
                r7.<init>(r2, r8)     // Catch:{ NameNotFoundException -> 0x002f }
                r2 = 128(0x80, float:1.794E-43)
                android.content.pm.ServiceInfo r2 = r6.getServiceInfo(r7, r2)     // Catch:{ NameNotFoundException -> 0x002f }
                if (r2 != 0) goto L_0x002c
                java.lang.String r2 = "TransportBackendDiscovery has no service info."
            L_0x0028:
                android.util.Log.w(r4, r2)     // Catch:{ NameNotFoundException -> 0x002f }
                goto L_0x0034
            L_0x002c:
                android.os.Bundle r2 = r2.metaData     // Catch:{ NameNotFoundException -> 0x002f }
                goto L_0x0035
            L_0x002f:
                java.lang.String r2 = "Application info not found."
                android.util.Log.w(r4, r2)
            L_0x0034:
                r2 = r3
            L_0x0035:
                if (r2 != 0) goto L_0x0041
                java.lang.String r2 = "Could not retrieve metadata, returning empty list of transport backends."
                android.util.Log.w(r4, r2)
                java.util.Map r2 = java.util.Collections.emptyMap()
                goto L_0x0091
            L_0x0041:
                java.util.HashMap r6 = new java.util.HashMap
                r6.<init>()
                java.util.Set r7 = r2.keySet()
                java.util.Iterator r7 = r7.iterator()
            L_0x004e:
                boolean r8 = r7.hasNext()
                if (r8 == 0) goto L_0x0090
                java.lang.Object r8 = r7.next()
                java.lang.String r8 = (java.lang.String) r8
                java.lang.Object r9 = r2.get(r8)
                boolean r10 = r9 instanceof java.lang.String
                if (r10 == 0) goto L_0x004e
                java.lang.String r10 = "backend:"
                boolean r10 = r8.startsWith(r10)
                if (r10 == 0) goto L_0x004e
                java.lang.String r9 = (java.lang.String) r9
                r10 = -1
                java.lang.String r11 = ","
                java.lang.String[] r9 = r9.split(r11, r10)
                int r10 = r9.length
                r11 = r5
            L_0x0075:
                if (r11 >= r10) goto L_0x004e
                r12 = r9[r11]
                java.lang.String r12 = r12.trim()
                boolean r13 = r12.isEmpty()
                if (r13 == 0) goto L_0x0084
                goto L_0x008d
            L_0x0084:
                r13 = 8
                java.lang.String r13 = r8.substring(r13)
                r6.put(r12, r13)
            L_0x008d:
                int r11 = r11 + 1
                goto L_0x0075
            L_0x0090:
                r2 = r6
            L_0x0091:
                r14.f2919b = r2
            L_0x0093:
                java.util.Map<java.lang.String, java.lang.String> r2 = r14.f2919b
                java.lang.Object r15 = r2.get(r15)
                java.lang.String r15 = (java.lang.String) r15
                if (r15 != 0) goto L_0x009e
                return r3
            L_0x009e:
                r2 = 1
                java.lang.Class r6 = java.lang.Class.forName(r15)     // Catch:{ ClassNotFoundException -> 0x00e3, IllegalAccessException -> 0x00d9, InstantiationException -> 0x00cf, NoSuchMethodException -> 0x00c2, InvocationTargetException -> 0x00b8 }
                java.lang.Class<b.l.a.a.f.n.d> r7 = p005b.p096l.p097a.p098a.p101f.p102n.C1651d.class
                java.lang.Class r6 = r6.asSubclass(r7)     // Catch:{ ClassNotFoundException -> 0x00e3, IllegalAccessException -> 0x00d9, InstantiationException -> 0x00cf, NoSuchMethodException -> 0x00c2, InvocationTargetException -> 0x00b8 }
                java.lang.Class[] r7 = new java.lang.Class[r5]     // Catch:{ ClassNotFoundException -> 0x00e3, IllegalAccessException -> 0x00d9, InstantiationException -> 0x00cf, NoSuchMethodException -> 0x00c2, InvocationTargetException -> 0x00b8 }
                java.lang.reflect.Constructor r6 = r6.getDeclaredConstructor(r7)     // Catch:{ ClassNotFoundException -> 0x00e3, IllegalAccessException -> 0x00d9, InstantiationException -> 0x00cf, NoSuchMethodException -> 0x00c2, InvocationTargetException -> 0x00b8 }
                java.lang.Object[] r7 = new java.lang.Object[r5]     // Catch:{ ClassNotFoundException -> 0x00e3, IllegalAccessException -> 0x00d9, InstantiationException -> 0x00cf, NoSuchMethodException -> 0x00c2, InvocationTargetException -> 0x00b8 }
                java.lang.Object r6 = r6.newInstance(r7)     // Catch:{ ClassNotFoundException -> 0x00e3, IllegalAccessException -> 0x00d9, InstantiationException -> 0x00cf, NoSuchMethodException -> 0x00c2, InvocationTargetException -> 0x00b8 }
                b.l.a.a.f.n.d r6 = (p005b.p096l.p097a.p098a.p101f.p102n.C1651d) r6     // Catch:{ ClassNotFoundException -> 0x00e3, IllegalAccessException -> 0x00d9, InstantiationException -> 0x00cf, NoSuchMethodException -> 0x00c2, InvocationTargetException -> 0x00b8 }
                return r6
            L_0x00b8:
                r1 = move-exception
                java.lang.Object[] r2 = new java.lang.Object[r2]
                r2[r5] = r15
                java.lang.String r15 = java.lang.String.format(r0, r2)
                goto L_0x00cb
            L_0x00c2:
                r1 = move-exception
                java.lang.Object[] r2 = new java.lang.Object[r2]
                r2[r5] = r15
                java.lang.String r15 = java.lang.String.format(r0, r2)
            L_0x00cb:
                android.util.Log.w(r4, r15, r1)
                goto L_0x00f1
            L_0x00cf:
                r0 = move-exception
                java.lang.Object[] r2 = new java.lang.Object[r2]
                r2[r5] = r15
                java.lang.String r15 = java.lang.String.format(r1, r2)
                goto L_0x00ee
            L_0x00d9:
                r0 = move-exception
                java.lang.Object[] r2 = new java.lang.Object[r2]
                r2[r5] = r15
                java.lang.String r15 = java.lang.String.format(r1, r2)
                goto L_0x00ee
            L_0x00e3:
                r0 = move-exception
                java.lang.Object[] r1 = new java.lang.Object[r2]
                r1[r5] = r15
                java.lang.String r15 = "Class %s is not found."
                java.lang.String r15 = java.lang.String.format(r15, r1)
            L_0x00ee:
                android.util.Log.w(r4, r15, r0)
            L_0x00f1:
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: p005b.p096l.p097a.p098a.p101f.p102n.C1659k.C1660a.mo11849a(java.lang.String):b.l.a.a.f.n.d");
        }
    }

    public C1659k(Context context, C1657i iVar) {
        C1660a aVar = new C1660a(context);
        this.f2915a = aVar;
        this.f2916b = iVar;
    }

    @Nullable
    public synchronized C1662m get(String str) {
        if (this.f2917c.containsKey(str)) {
            return this.f2917c.get(str);
        }
        C1651d a = this.f2915a.mo11849a(str);
        if (a == null) {
            return null;
        }
        C1657i iVar = this.f2916b;
        C1662m create = a.create(new C1650c(iVar.f2909a, iVar.f2910b, iVar.f2911c, str));
        this.f2917c.put(str, create);
        return create;
    }
}
