package p005b.p096l.p097a.p151d.p152a.p159e;

/* renamed from: b.l.a.d.a.e.y */
public final class C3620y extends C3616v {

    /* renamed from: a */
    public final C3619x f6681a = new C3619x();

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0028, code lost:
        r1 = new java.util.Vector(2);
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo14880a(java.lang.Throwable r5, java.lang.Throwable r6) {
        /*
            r4 = this;
            if (r6 == r5) goto L_0x0045
            java.lang.String r0 = "The suppressed exception cannot be null."
            java.util.Objects.requireNonNull(r6, r0)
            b.l.a.d.a.e.x r0 = r4.f6681a
        L_0x0009:
            java.lang.ref.ReferenceQueue<java.lang.Throwable> r1 = r0.f6680b
            java.lang.ref.Reference r1 = r1.poll()
            if (r1 == 0) goto L_0x0017
            java.util.concurrent.ConcurrentHashMap<b.l.a.d.a.e.w, java.util.List<java.lang.Throwable>> r2 = r0.f6679a
            r2.remove(r1)
            goto L_0x0009
        L_0x0017:
            b.l.a.d.a.e.w r1 = new b.l.a.d.a.e.w
            r2 = 0
            r1.<init>(r5, r2)
            java.util.concurrent.ConcurrentHashMap<b.l.a.d.a.e.w, java.util.List<java.lang.Throwable>> r2 = r0.f6679a
            java.lang.Object r1 = r2.get(r1)
            java.util.List r1 = (java.util.List) r1
            if (r1 == 0) goto L_0x0028
            goto L_0x0041
        L_0x0028:
            java.util.Vector r1 = new java.util.Vector
            r2 = 2
            r1.<init>(r2)
            java.util.concurrent.ConcurrentHashMap<b.l.a.d.a.e.w, java.util.List<java.lang.Throwable>> r2 = r0.f6679a
            b.l.a.d.a.e.w r3 = new b.l.a.d.a.e.w
            java.lang.ref.ReferenceQueue<java.lang.Throwable> r0 = r0.f6680b
            r3.<init>(r5, r0)
            java.lang.Object r5 = r2.putIfAbsent(r3, r1)
            java.util.List r5 = (java.util.List) r5
            if (r5 != 0) goto L_0x0040
            goto L_0x0041
        L_0x0040:
            r1 = r5
        L_0x0041:
            r1.add(r6)
            return
        L_0x0045:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Self suppression is not allowed."
            r5.<init>(r0, r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p096l.p097a.p151d.p152a.p159e.C3620y.mo14880a(java.lang.Throwable, java.lang.Throwable):void");
    }
}
