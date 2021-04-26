package p005b.p273o;

import android.location.Location;
import com.huawei.hmf.tasks.OnFailureListener;
import com.huawei.hmf.tasks.OnSuccessListener;
import com.huawei.hms.location.FusedLocationProviderClient;
import com.huawei.hms.location.LocationCallback;
import com.huawei.hms.location.LocationRequest;
import com.huawei.hms.location.LocationServices;
import p005b.p273o.C4857i2;

/* renamed from: b.o.u */
public class C4986u extends C4794c0 {

    /* renamed from: j */
    public static FusedLocationProviderClient f9638j;

    /* renamed from: k */
    public static C4989c f9639k;

    /* renamed from: b.o.u$a */
    public static class C4987a implements OnFailureListener {
    }

    /* renamed from: b.o.u$b */
    public static class C4988b implements OnSuccessListener<Location> {
    }

    /* renamed from: b.o.u$c */
    public static class C4989c extends LocationCallback {

        /* renamed from: a */
        public FusedLocationProviderClient f9640a;

        public C4989c(FusedLocationProviderClient fusedLocationProviderClient) {
            this.f9640a = fusedLocationProviderClient;
            mo16721a();
        }

        /* renamed from: a */
        public final void mo16721a() {
            long j = C4857i2.f9363h ? 270000 : 570000;
            LocationRequest priority = LocationRequest.create().setFastestInterval(j).setInterval(j).setMaxWaitTime((long) (((double) j) * 1.5d)).setPriority(102);
            C4857i2.m8933a(C4857i2.C4868k.DEBUG, "HMSLocationController Huawei LocationServices requestLocationUpdates!", (Throwable) null);
            this.f9640a.requestLocationUpdates(priority, this, C4794c0.f9180e.getLooper());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002c, code lost:
        return;
     */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m9143g() {
        /*
            java.lang.Object r0 = p005b.p273o.C4794c0.f9179d
            monitor-enter(r0)
            b.o.i2$k r1 = p005b.p273o.C4857i2.C4868k.DEBUG     // Catch:{ all -> 0x002d }
            java.lang.String r2 = "HMSLocationController onFocusChange!"
            r3 = 0
            p005b.p273o.C4857i2.m8933a(r1, r2, r3)     // Catch:{ all -> 0x002d }
            boolean r1 = p005b.p273o.C4794c0.m8790f()     // Catch:{ all -> 0x002d }
            if (r1 == 0) goto L_0x0017
            com.huawei.hms.location.FusedLocationProviderClient r1 = f9638j     // Catch:{ all -> 0x002d }
            if (r1 != 0) goto L_0x0017
            monitor-exit(r0)     // Catch:{ all -> 0x002d }
            return
        L_0x0017:
            com.huawei.hms.location.FusedLocationProviderClient r1 = f9638j     // Catch:{ all -> 0x002d }
            if (r1 == 0) goto L_0x002b
            b.o.u$c r2 = f9639k     // Catch:{ all -> 0x002d }
            if (r2 == 0) goto L_0x0022
            r1.removeLocationUpdates(r2)     // Catch:{ all -> 0x002d }
        L_0x0022:
            b.o.u$c r1 = new b.o.u$c     // Catch:{ all -> 0x002d }
            com.huawei.hms.location.FusedLocationProviderClient r2 = f9638j     // Catch:{ all -> 0x002d }
            r1.<init>(r2)     // Catch:{ all -> 0x002d }
            f9639k = r1     // Catch:{ all -> 0x002d }
        L_0x002b:
            monitor-exit(r0)     // Catch:{ all -> 0x002d }
            return
        L_0x002d:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x002d }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p273o.C4986u.m9143g():void");
    }

    /* renamed from: k */
    public static void m9144k() {
        synchronized (C4794c0.f9179d) {
            if (f9638j == null) {
                try {
                    f9638j = LocationServices.getFusedLocationProviderClient(C4794c0.f9182g);
                } catch (Exception e) {
                    C4857i2.C4868k kVar = C4857i2.C4868k.ERROR;
                    C4857i2.m8933a(kVar, "Huawei LocationServices getFusedLocationProviderClient failed! " + e, (Throwable) null);
                    synchronized (C4794c0.f9179d) {
                        f9638j = null;
                        return;
                    }
                }
            }
            Location location = C4794c0.f9183h;
            if (location != null) {
                C4794c0.m8786b(location);
            } else {
                f9638j.getLastLocation().addOnSuccessListener(new C4988b()).addOnFailureListener(new C4987a());
            }
        }
    }
}
