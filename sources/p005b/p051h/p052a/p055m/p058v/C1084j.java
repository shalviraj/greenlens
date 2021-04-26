package p005b.p051h.p052a.p055m.p058v;

import android.util.Log;
import androidx.annotation.NonNull;
import androidx.core.util.Pools;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import p005b.p035e.p036a.p037a.C0843a;
import p005b.p051h.p052a.p055m.C0979p;
import p005b.p051h.p052a.p055m.C0981r;
import p005b.p051h.p052a.p055m.p056u.C0989e;
import p005b.p051h.p052a.p055m.p064x.p070h.C1298e;

/* renamed from: b.h.a.m.v.j */
public class C1084j<DataType, ResourceType, Transcode> {

    /* renamed from: a */
    public final Class<DataType> f1246a;

    /* renamed from: b */
    public final List<? extends C0981r<DataType, ResourceType>> f1247b;

    /* renamed from: c */
    public final C1298e<ResourceType, Transcode> f1248c;

    /* renamed from: d */
    public final Pools.Pool<List<Throwable>> f1249d;

    /* renamed from: e */
    public final String f1250e;

    /* renamed from: b.h.a.m.v.j$a */
    public interface C1085a<ResourceType> {
    }

    public C1084j(Class<DataType> cls, Class<ResourceType> cls2, Class<Transcode> cls3, List<? extends C0981r<DataType, ResourceType>> list, C1298e<ResourceType, Transcode> eVar, Pools.Pool<List<Throwable>> pool) {
        this.f1246a = cls;
        this.f1247b = list;
        this.f1248c = eVar;
        this.f1249d = pool;
        StringBuilder u = C0843a.m460u("Failed DecodePath{");
        u.append(cls.getSimpleName());
        u.append("->");
        u.append(cls2.getSimpleName());
        u.append("->");
        u.append(cls3.getSimpleName());
        u.append("}");
        this.f1250e = u.toString();
    }

    /* JADX INFO: finally extract failed */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: b.h.a.m.u.e<DataType>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v2, resolved type: b.h.a.m.v.w<ResourceType>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v4, resolved type: b.h.a.m.v.v<T>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: java.lang.Class<T>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v5, resolved type: b.h.a.m.v.v<T>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v4, resolved type: T} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v14, resolved type: b.h.a.m.v.e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v10, resolved type: java.lang.Class<T>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v8, resolved type: java.lang.Class<T>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v7, resolved type: b.h.a.m.v.w<T>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v11, resolved type: b.h.a.m.v.v<T>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v12, resolved type: b.h.a.m.v.v<Z>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v27, resolved type: b.h.a.m.v.y} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v12, resolved type: b.h.a.m.v.y} */
    /* JADX WARNING: type inference failed for: r11v13, types: [b.h.a.m.m] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public p005b.p051h.p052a.p055m.p058v.C1115w<Transcode> mo10975a(p005b.p051h.p052a.p055m.p056u.C0989e<DataType> r11, int r12, int r13, @androidx.annotation.NonNull p005b.p051h.p052a.p055m.C0979p r14, p005b.p051h.p052a.p055m.p058v.C1084j.C1085a<ResourceType> r15) {
        /*
            r10 = this;
            androidx.core.util.Pools$Pool<java.util.List<java.lang.Throwable>> r0 = r10.f1249d
            java.lang.Object r0 = r0.acquire()
            java.lang.String r1 = "Argument must not be null"
            java.util.Objects.requireNonNull(r0, r1)
            java.util.List r0 = (java.util.List) r0
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            r6 = r14
            r7 = r0
            b.h.a.m.v.w r11 = r2.mo10976b(r3, r4, r5, r6, r7)     // Catch:{ all -> 0x011e }
            androidx.core.util.Pools$Pool<java.util.List<java.lang.Throwable>> r12 = r10.f1249d
            r12.release(r0)
            b.h.a.m.v.i$b r15 = (p005b.p051h.p052a.p055m.p058v.C1076i.C1078b) r15
            b.h.a.m.v.i r12 = p005b.p051h.p052a.p055m.p058v.C1076i.this
            b.h.a.m.a r13 = r15.f1227a
            java.util.Objects.requireNonNull(r12)
            java.lang.Object r15 = r11.get()
            java.lang.Class r7 = r15.getClass()
            b.h.a.m.a r15 = p005b.p051h.p052a.p055m.C0962a.RESOURCE_DISK_CACHE
            r0 = 0
            if (r13 == r15) goto L_0x0045
            b.h.a.m.v.h<R> r15 = r12.f1207g
            b.h.a.m.t r15 = r15.mo10959f(r7)
            b.h.a.e r1 = r12.f1214n
            int r2 = r12.f1218r
            int r3 = r12.f1219s
            b.h.a.m.v.w r1 = r15.mo10828a(r1, r11, r2, r3)
            r6 = r15
            r15 = r1
            goto L_0x0047
        L_0x0045:
            r15 = r11
            r6 = r0
        L_0x0047:
            boolean r1 = r11.equals(r15)
            if (r1 != 0) goto L_0x0050
            r11.recycle()
        L_0x0050:
            b.h.a.m.v.h<R> r11 = r12.f1207g
            b.h.a.e r11 = r11.f1180c
            b.h.a.g r11 = r11.f864b
            b.h.a.p.f r11 = r11.f881d
            java.lang.Class r1 = r15.mo11005b()
            b.h.a.m.s r11 = r11.mo11173a(r1)
            r1 = 0
            r2 = 1
            if (r11 == 0) goto L_0x0066
            r11 = r2
            goto L_0x0067
        L_0x0066:
            r11 = r1
        L_0x0067:
            if (r11 == 0) goto L_0x008c
            b.h.a.m.v.h<R> r11 = r12.f1207g
            b.h.a.e r11 = r11.f1180c
            b.h.a.g r11 = r11.f864b
            b.h.a.p.f r11 = r11.f881d
            java.lang.Class r0 = r15.mo11005b()
            b.h.a.m.s r0 = r11.mo11173a(r0)
            if (r0 == 0) goto L_0x0082
            b.h.a.m.p r11 = r12.f1221u
            b.h.a.m.c r11 = r0.mo10838b(r11)
            goto L_0x008e
        L_0x0082:
            b.h.a.g$d r11 = new b.h.a.g$d
            java.lang.Class r12 = r15.mo11005b()
            r11.<init>(r12)
            throw r11
        L_0x008c:
            b.h.a.m.c r11 = p005b.p051h.p052a.p055m.C0964c.NONE
        L_0x008e:
            r9 = r0
            b.h.a.m.v.h<R> r0 = r12.f1207g
            b.h.a.m.m r3 = r12.f1199D
            java.util.List r0 = r0.mo10956c()
            int r4 = r0.size()
            r5 = r1
        L_0x009c:
            if (r5 >= r4) goto L_0x00b1
            java.lang.Object r8 = r0.get(r5)
            b.h.a.m.w.n$a r8 = (p005b.p051h.p052a.p055m.p062w.C1161n.C1162a) r8
            b.h.a.m.m r8 = r8.f1409a
            boolean r8 = r8.equals(r3)
            if (r8 == 0) goto L_0x00ae
            r1 = r2
            goto L_0x00b1
        L_0x00ae:
            int r5 = r5 + 1
            goto L_0x009c
        L_0x00b1:
            r0 = r1 ^ 1
            b.h.a.m.v.k r1 = r12.f1220t
            boolean r13 = r1.mo10981d(r0, r13, r11)
            if (r13 == 0) goto L_0x0117
            if (r9 == 0) goto L_0x0109
            int r13 = r11.ordinal()
            if (r13 == 0) goto L_0x00f3
            if (r13 != r2) goto L_0x00dc
            b.h.a.m.v.y r11 = new b.h.a.m.v.y
            b.h.a.m.v.h<R> r13 = r12.f1207g
            b.h.a.e r13 = r13.f1180c
            b.h.a.m.v.c0.b r1 = r13.f863a
            b.h.a.m.m r2 = r12.f1199D
            b.h.a.m.m r3 = r12.f1215o
            int r4 = r12.f1218r
            int r5 = r12.f1219s
            b.h.a.m.p r8 = r12.f1221u
            r0 = r11
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            goto L_0x00fc
        L_0x00dc:
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r14 = "Unknown strategy: "
            r13.append(r14)
            r13.append(r11)
            java.lang.String r11 = r13.toString()
            r12.<init>(r11)
            throw r12
        L_0x00f3:
            b.h.a.m.v.e r11 = new b.h.a.m.v.e
            b.h.a.m.m r13 = r12.f1199D
            b.h.a.m.m r0 = r12.f1215o
            r11.<init>(r13, r0)
        L_0x00fc:
            b.h.a.m.v.v r15 = p005b.p051h.p052a.p055m.p058v.C1113v.m988c(r15)
            b.h.a.m.v.i$c<?> r12 = r12.f1212l
            r12.f1229a = r11
            r12.f1230b = r9
            r12.f1231c = r15
            goto L_0x0117
        L_0x0109:
            b.h.a.g$d r11 = new b.h.a.g$d
            java.lang.Object r12 = r15.get()
            java.lang.Class r12 = r12.getClass()
            r11.<init>(r12)
            throw r11
        L_0x0117:
            b.h.a.m.x.h.e<ResourceType, Transcode> r11 = r10.f1248c
            b.h.a.m.v.w r11 = r11.mo11138a(r15, r14)
            return r11
        L_0x011e:
            r11 = move-exception
            androidx.core.util.Pools$Pool<java.util.List<java.lang.Throwable>> r12 = r10.f1249d
            r12.release(r0)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p051h.p052a.p055m.p058v.C1084j.mo10975a(b.h.a.m.u.e, int, int, b.h.a.m.p, b.h.a.m.v.j$a):b.h.a.m.v.w");
    }

    @NonNull
    /* renamed from: b */
    public final C1115w<ResourceType> mo10976b(C0989e<DataType> eVar, int i, int i2, @NonNull C0979p pVar, List<Throwable> list) {
        int size = this.f1247b.size();
        C1115w<ResourceType> wVar = null;
        for (int i3 = 0; i3 < size; i3++) {
            C0981r rVar = (C0981r) this.f1247b.get(i3);
            try {
                if (rVar.mo10837b(eVar.mo10855a(), pVar)) {
                    wVar = rVar.mo10836a(eVar.mo10855a(), i, i2, pVar);
                }
            } catch (IOException | OutOfMemoryError | RuntimeException e) {
                if (Log.isLoggable("DecodePath", 2)) {
                    Log.v("DecodePath", "Failed to decode data for " + rVar, e);
                }
                list.add(e);
            }
            if (wVar != null) {
                break;
            }
        }
        if (wVar != null) {
            return wVar;
        }
        throw new C1108r(this.f1250e, (List<Throwable>) new ArrayList(list));
    }

    public String toString() {
        StringBuilder u = C0843a.m460u("DecodePath{ dataClass=");
        u.append(this.f1246a);
        u.append(", decoders=");
        u.append(this.f1247b);
        u.append(", transcoder=");
        u.append(this.f1248c);
        u.append('}');
        return u.toString();
    }
}
