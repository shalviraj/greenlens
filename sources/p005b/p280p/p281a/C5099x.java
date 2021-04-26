package p005b.p280p.p281a;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p005b.p280p.p281a.C5075l;
import p005b.p280p.p281a.p284z.C5117b;

/* renamed from: b.p.a.x */
public final class C5099x {

    /* renamed from: d */
    public static final List<C5075l.C5076a> f9868d;

    /* renamed from: a */
    public final List<C5075l.C5076a> f9869a;

    /* renamed from: b */
    public final ThreadLocal<C5102c> f9870b = new ThreadLocal<>();

    /* renamed from: c */
    public final Map<Object, C5075l<?>> f9871c = new LinkedHashMap();

    /* renamed from: b.p.a.x$a */
    public static final class C5100a {

        /* renamed from: a */
        public final List<C5075l.C5076a> f9872a = new ArrayList();

        /* renamed from: b */
        public int f9873b = 0;

        /* renamed from: a */
        public C5100a mo16933a(C5075l.C5076a aVar) {
            List<C5075l.C5076a> list = this.f9872a;
            int i = this.f9873b;
            this.f9873b = i + 1;
            list.add(i, aVar);
            return this;
        }
    }

    /* renamed from: b.p.a.x$b */
    public static final class C5101b<T> extends C5075l<T> {

        /* renamed from: a */
        public final Type f9874a;

        /* renamed from: b */
        public final String f9875b;

        /* renamed from: c */
        public final Object f9876c;

        /* renamed from: d */
        public C5075l<T> f9877d;

        public C5101b(Type type, String str, Object obj) {
            this.f9874a = type;
            this.f9875b = str;
            this.f9876c = obj;
        }

        /* renamed from: a */
        public T mo16804a(C5081q qVar) {
            C5075l<T> lVar = this.f9877d;
            if (lVar != null) {
                return lVar.mo16804a(qVar);
            }
            throw new IllegalStateException("JsonAdapter isn't ready");
        }

        /* renamed from: e */
        public void mo16805e(C5087u uVar, T t) {
            C5075l<T> lVar = this.f9877d;
            if (lVar != null) {
                lVar.mo16805e(uVar, t);
                return;
            }
            throw new IllegalStateException("JsonAdapter isn't ready");
        }

        public String toString() {
            C5075l<T> lVar = this.f9877d;
            return lVar != null ? lVar.toString() : super.toString();
        }
    }

    /* renamed from: b.p.a.x$c */
    public final class C5102c {

        /* renamed from: a */
        public final List<C5101b<?>> f9878a = new ArrayList();

        /* renamed from: b */
        public final Deque<C5101b<?>> f9879b = new ArrayDeque();

        /* renamed from: c */
        public boolean f9880c;

        public C5102c() {
        }

        /* renamed from: a */
        public IllegalArgumentException mo16935a(IllegalArgumentException illegalArgumentException) {
            if (this.f9880c) {
                return illegalArgumentException;
            }
            this.f9880c = true;
            if (this.f9879b.size() == 1 && this.f9879b.getFirst().f9875b == null) {
                return illegalArgumentException;
            }
            StringBuilder sb = new StringBuilder(illegalArgumentException.getMessage());
            Iterator<C5101b<?>> descendingIterator = this.f9879b.descendingIterator();
            while (descendingIterator.hasNext()) {
                C5101b next = descendingIterator.next();
                sb.append("\nfor ");
                sb.append(next.f9874a);
                if (next.f9875b != null) {
                    sb.append(' ');
                    sb.append(next.f9875b);
                }
            }
            return new IllegalArgumentException(sb.toString(), illegalArgumentException);
        }

        /* renamed from: b */
        public void mo16936b(boolean z) {
            this.f9879b.removeLast();
            if (this.f9879b.isEmpty()) {
                C5099x.this.f9870b.remove();
                if (z) {
                    synchronized (C5099x.this.f9871c) {
                        int size = this.f9878a.size();
                        for (int i = 0; i < size; i++) {
                            C5101b bVar = this.f9878a.get(i);
                            C5075l<T> put = C5099x.this.f9871c.put(bVar.f9876c, bVar.f9877d);
                            if (put != null) {
                                bVar.f9877d = put;
                                C5099x.this.f9871c.put(bVar.f9876c, put);
                            }
                        }
                    }
                }
            }
        }
    }

    static {
        ArrayList arrayList = new ArrayList(5);
        f9868d = arrayList;
        arrayList.add(C5103y.f9882a);
        arrayList.add(C5070h.f9796b);
        arrayList.add(C5097w.f9865c);
        arrayList.add(C5055a.f9762c);
        arrayList.add(C5067g.f9789d);
    }

    public C5099x(C5100a aVar) {
        int size = aVar.f9872a.size();
        List<C5075l.C5076a> list = f9868d;
        ArrayList arrayList = new ArrayList(list.size() + size);
        arrayList.addAll(aVar.f9872a);
        arrayList.addAll(list);
        this.f9869a = Collections.unmodifiableList(arrayList);
    }

    /* renamed from: a */
    public <T> C5075l<T> mo16929a(Class<T> cls) {
        return mo16932d(cls, C5117b.f9903a, (String) null);
    }

    /* renamed from: b */
    public <T> C5075l<T> mo16930b(Type type) {
        return mo16931c(type, C5117b.f9903a);
    }

    /* renamed from: c */
    public <T> C5075l<T> mo16931c(Type type, Set<? extends Annotation> set) {
        return mo16932d(type, set, (String) null);
    }

    /* JADX WARNING: type inference failed for: r11v7, types: [b.p.a.l<T>] */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x004c, code lost:
        r3 = r8.f9870b.get();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0054, code lost:
        if (r3 != null) goto L_0x0060;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0056, code lost:
        r3 = new p005b.p280p.p281a.C5099x.C5102c(r8);
        r8.f9870b.set(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0060, code lost:
        r4 = r3.f9878a.size();
        r5 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0067, code lost:
        if (r5 >= r4) goto L_0x0087;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0069, code lost:
        r6 = r3.f9878a.get(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0077, code lost:
        if (r6.f9876c.equals(r0) == false) goto L_0x0084;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0079, code lost:
        r3.f9879b.add(r6);
        r11 = r6.f9877d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0080, code lost:
        if (r11 == 0) goto L_0x0097;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0082, code lost:
        r6 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0084, code lost:
        r5 = r5 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0087, code lost:
        r4 = new p005b.p280p.p281a.C5099x.C5101b(r9, r11, r0);
        r3.f9878a.add(r4);
        r3.f9879b.add(r4);
        r6 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0097, code lost:
        if (r6 == null) goto L_0x009d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0099, code lost:
        r3.mo16936b(false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x009c, code lost:
        return r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:?, code lost:
        r11 = r8.f9869a.size();
        r0 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00a4, code lost:
        if (r0 >= r11) goto L_0x00c5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00a6, code lost:
        r4 = r8.f9869a.get(r0).mo16807a(r9, r10, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00b2, code lost:
        if (r4 != null) goto L_0x00b7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00b4, code lost:
        r0 = r0 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00b7, code lost:
        r3.f9879b.getLast().f9877d = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00c1, code lost:
        r3.mo16936b(true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00c4, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00df, code lost:
        throw new java.lang.IllegalArgumentException("No JsonAdapter for " + p005b.p280p.p281a.p284z.C5117b.m9424k(r9, r10));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00e0, code lost:
        r9 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00e2, code lost:
        r9 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00e7, code lost:
        throw r3.mo16935a(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00e8, code lost:
        r3.mo16936b(false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00eb, code lost:
        throw r9;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public <T> p005b.p280p.p281a.C5075l<T> mo16932d(java.lang.reflect.Type r9, java.util.Set<? extends java.lang.annotation.Annotation> r10, java.lang.String r11) {
        /*
            r8 = this;
            java.lang.String r0 = "type == null"
            java.util.Objects.requireNonNull(r9, r0)
            java.lang.String r0 = "annotations == null"
            java.util.Objects.requireNonNull(r10, r0)
            java.lang.reflect.Type r9 = p005b.p280p.p281a.p284z.C5117b.m9414a(r9)
            boolean r0 = r9 instanceof java.lang.reflect.WildcardType
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L_0x0015
            goto L_0x0029
        L_0x0015:
            r0 = r9
            java.lang.reflect.WildcardType r0 = (java.lang.reflect.WildcardType) r0
            java.lang.reflect.Type[] r3 = r0.getLowerBounds()
            int r3 = r3.length
            if (r3 == 0) goto L_0x0020
            goto L_0x0029
        L_0x0020:
            java.lang.reflect.Type[] r9 = r0.getUpperBounds()
            int r0 = r9.length
            if (r0 != r2) goto L_0x00ef
            r9 = r9[r1]
        L_0x0029:
            boolean r0 = r10.isEmpty()
            if (r0 == 0) goto L_0x0031
            r0 = r9
            goto L_0x003c
        L_0x0031:
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r0[r1] = r9
            r0[r2] = r10
            java.util.List r0 = java.util.Arrays.asList(r0)
        L_0x003c:
            java.util.Map<java.lang.Object, b.p.a.l<?>> r3 = r8.f9871c
            monitor-enter(r3)
            java.util.Map<java.lang.Object, b.p.a.l<?>> r4 = r8.f9871c     // Catch:{ all -> 0x00ec }
            java.lang.Object r4 = r4.get(r0)     // Catch:{ all -> 0x00ec }
            b.p.a.l r4 = (p005b.p280p.p281a.C5075l) r4     // Catch:{ all -> 0x00ec }
            if (r4 == 0) goto L_0x004b
            monitor-exit(r3)     // Catch:{ all -> 0x00ec }
            return r4
        L_0x004b:
            monitor-exit(r3)     // Catch:{ all -> 0x00ec }
            java.lang.ThreadLocal<b.p.a.x$c> r3 = r8.f9870b
            java.lang.Object r3 = r3.get()
            b.p.a.x$c r3 = (p005b.p280p.p281a.C5099x.C5102c) r3
            if (r3 != 0) goto L_0x0060
            b.p.a.x$c r3 = new b.p.a.x$c
            r3.<init>()
            java.lang.ThreadLocal<b.p.a.x$c> r4 = r8.f9870b
            r4.set(r3)
        L_0x0060:
            java.util.List<b.p.a.x$b<?>> r4 = r3.f9878a
            int r4 = r4.size()
            r5 = r1
        L_0x0067:
            if (r5 >= r4) goto L_0x0087
            java.util.List<b.p.a.x$b<?>> r6 = r3.f9878a
            java.lang.Object r6 = r6.get(r5)
            b.p.a.x$b r6 = (p005b.p280p.p281a.C5099x.C5101b) r6
            java.lang.Object r7 = r6.f9876c
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L_0x0084
            java.util.Deque<b.p.a.x$b<?>> r11 = r3.f9879b
            r11.add(r6)
            b.p.a.l<T> r11 = r6.f9877d
            if (r11 == 0) goto L_0x0097
            r6 = r11
            goto L_0x0097
        L_0x0084:
            int r5 = r5 + 1
            goto L_0x0067
        L_0x0087:
            b.p.a.x$b r4 = new b.p.a.x$b
            r4.<init>(r9, r11, r0)
            java.util.List<b.p.a.x$b<?>> r11 = r3.f9878a
            r11.add(r4)
            java.util.Deque<b.p.a.x$b<?>> r11 = r3.f9879b
            r11.add(r4)
            r6 = 0
        L_0x0097:
            if (r6 == 0) goto L_0x009d
            r3.mo16936b(r1)
            return r6
        L_0x009d:
            java.util.List<b.p.a.l$a> r11 = r8.f9869a     // Catch:{ IllegalArgumentException -> 0x00e2 }
            int r11 = r11.size()     // Catch:{ IllegalArgumentException -> 0x00e2 }
            r0 = r1
        L_0x00a4:
            if (r0 >= r11) goto L_0x00c5
            java.util.List<b.p.a.l$a> r4 = r8.f9869a     // Catch:{ IllegalArgumentException -> 0x00e2 }
            java.lang.Object r4 = r4.get(r0)     // Catch:{ IllegalArgumentException -> 0x00e2 }
            b.p.a.l$a r4 = (p005b.p280p.p281a.C5075l.C5076a) r4     // Catch:{ IllegalArgumentException -> 0x00e2 }
            b.p.a.l r4 = r4.mo16807a(r9, r10, r8)     // Catch:{ IllegalArgumentException -> 0x00e2 }
            if (r4 != 0) goto L_0x00b7
            int r0 = r0 + 1
            goto L_0x00a4
        L_0x00b7:
            java.util.Deque<b.p.a.x$b<?>> r9 = r3.f9879b     // Catch:{ IllegalArgumentException -> 0x00e2 }
            java.lang.Object r9 = r9.getLast()     // Catch:{ IllegalArgumentException -> 0x00e2 }
            b.p.a.x$b r9 = (p005b.p280p.p281a.C5099x.C5101b) r9     // Catch:{ IllegalArgumentException -> 0x00e2 }
            r9.f9877d = r4     // Catch:{ IllegalArgumentException -> 0x00e2 }
            r3.mo16936b(r2)
            return r4
        L_0x00c5:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException     // Catch:{ IllegalArgumentException -> 0x00e2 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ IllegalArgumentException -> 0x00e2 }
            r0.<init>()     // Catch:{ IllegalArgumentException -> 0x00e2 }
            java.lang.String r2 = "No JsonAdapter for "
            r0.append(r2)     // Catch:{ IllegalArgumentException -> 0x00e2 }
            java.lang.String r9 = p005b.p280p.p281a.p284z.C5117b.m9424k(r9, r10)     // Catch:{ IllegalArgumentException -> 0x00e2 }
            r0.append(r9)     // Catch:{ IllegalArgumentException -> 0x00e2 }
            java.lang.String r9 = r0.toString()     // Catch:{ IllegalArgumentException -> 0x00e2 }
            r11.<init>(r9)     // Catch:{ IllegalArgumentException -> 0x00e2 }
            throw r11     // Catch:{ IllegalArgumentException -> 0x00e2 }
        L_0x00e0:
            r9 = move-exception
            goto L_0x00e8
        L_0x00e2:
            r9 = move-exception
            java.lang.IllegalArgumentException r9 = r3.mo16935a(r9)     // Catch:{ all -> 0x00e0 }
            throw r9     // Catch:{ all -> 0x00e0 }
        L_0x00e8:
            r3.mo16936b(r1)
            throw r9
        L_0x00ec:
            r9 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x00ec }
            throw r9
        L_0x00ef:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            r9.<init>()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p280p.p281a.C5099x.mo16932d(java.lang.reflect.Type, java.util.Set, java.lang.String):b.p.a.l");
    }
}
