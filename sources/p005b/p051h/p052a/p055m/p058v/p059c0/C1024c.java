package p005b.p051h.p052a.p055m.p058v.p059c0;

import java.util.ArrayDeque;
import java.util.Queue;
import p005b.p051h.p052a.p055m.p058v.p059c0.C1038l;
import p005b.p051h.p052a.p078s.C1380j;

/* renamed from: b.h.a.m.v.c0.c */
public abstract class C1024c<T extends C1038l> {

    /* renamed from: a */
    public final Queue<T> f1088a = new ArrayDeque(20);

    public C1024c() {
        char[] cArr = C1380j.f1801a;
    }

    /* renamed from: a */
    public abstract T mo10889a();

    /* renamed from: b */
    public T mo10890b() {
        T t = (C1038l) this.f1088a.poll();
        return t == null ? mo10889a() : t;
    }

    /* renamed from: c */
    public void mo10891c(T t) {
        if (this.f1088a.size() < 20) {
            this.f1088a.offer(t);
        }
    }
}
