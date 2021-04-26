package p005b.p096l.p097a.p098a.p099e.p100e;

import androidx.annotation.Nullable;
import java.util.Arrays;
import p005b.p035e.p036a.p037a.C0843a;
import p005b.p096l.p097a.p098a.p099e.p100e.C1617l;

/* renamed from: b.l.a.a.e.e.f */
public final class C1606f extends C1617l {

    /* renamed from: a */
    public final long f2766a;

    /* renamed from: b */
    public final Integer f2767b;

    /* renamed from: c */
    public final long f2768c;

    /* renamed from: d */
    public final byte[] f2769d;

    /* renamed from: e */
    public final String f2770e;

    /* renamed from: f */
    public final long f2771f;

    /* renamed from: g */
    public final C1621o f2772g;

    /* renamed from: b.l.a.a.e.e.f$b */
    public static final class C1608b extends C1617l.C1618a {

        /* renamed from: a */
        public Long f2773a;

        /* renamed from: b */
        public Integer f2774b;

        /* renamed from: c */
        public Long f2775c;

        /* renamed from: d */
        public byte[] f2776d;

        /* renamed from: e */
        public String f2777e;

        /* renamed from: f */
        public Long f2778f;

        /* renamed from: g */
        public C1621o f2779g;
    }

    public C1606f(long j, Integer num, long j2, byte[] bArr, String str, long j3, C1621o oVar, C1607a aVar) {
        this.f2766a = j;
        this.f2767b = num;
        this.f2768c = j2;
        this.f2769d = bArr;
        this.f2770e = str;
        this.f2771f = j3;
        this.f2772g = oVar;
    }

    @Nullable
    /* renamed from: a */
    public Integer mo11764a() {
        return this.f2767b;
    }

    /* renamed from: b */
    public long mo11765b() {
        return this.f2766a;
    }

    /* renamed from: c */
    public long mo11766c() {
        return this.f2768c;
    }

    @Nullable
    /* renamed from: d */
    public C1621o mo11767d() {
        return this.f2772g;
    }

    @Nullable
    /* renamed from: e */
    public byte[] mo11768e() {
        return this.f2769d;
    }

    public boolean equals(Object obj) {
        Integer num;
        String str;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1617l)) {
            return false;
        }
        C1617l lVar = (C1617l) obj;
        if (this.f2766a == lVar.mo11765b() && ((num = this.f2767b) != null ? num.equals(lVar.mo11764a()) : lVar.mo11764a() == null) && this.f2768c == lVar.mo11766c()) {
            if (Arrays.equals(this.f2769d, lVar instanceof C1606f ? ((C1606f) lVar).f2769d : lVar.mo11768e()) && ((str = this.f2770e) != null ? str.equals(lVar.mo11770f()) : lVar.mo11770f() == null) && this.f2771f == lVar.mo11771g()) {
                C1621o oVar = this.f2772g;
                C1621o d = lVar.mo11767d();
                if (oVar == null) {
                    if (d == null) {
                        return true;
                    }
                } else if (oVar.equals(d)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Nullable
    /* renamed from: f */
    public String mo11770f() {
        return this.f2770e;
    }

    /* renamed from: g */
    public long mo11771g() {
        return this.f2771f;
    }

    public int hashCode() {
        long j = this.f2766a;
        int i = (((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003;
        Integer num = this.f2767b;
        int i2 = 0;
        int hashCode = num == null ? 0 : num.hashCode();
        long j2 = this.f2768c;
        int hashCode2 = (((((i ^ hashCode) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ Arrays.hashCode(this.f2769d)) * 1000003;
        String str = this.f2770e;
        int hashCode3 = str == null ? 0 : str.hashCode();
        long j3 = this.f2771f;
        int i3 = (((hashCode2 ^ hashCode3) * 1000003) ^ ((int) ((j3 >>> 32) ^ j3))) * 1000003;
        C1621o oVar = this.f2772g;
        if (oVar != null) {
            i2 = oVar.hashCode();
        }
        return i3 ^ i2;
    }

    public String toString() {
        StringBuilder u = C0843a.m460u("LogEvent{eventTimeMs=");
        u.append(this.f2766a);
        u.append(", eventCode=");
        u.append(this.f2767b);
        u.append(", eventUptimeMs=");
        u.append(this.f2768c);
        u.append(", sourceExtension=");
        u.append(Arrays.toString(this.f2769d));
        u.append(", sourceExtensionJsonProto3=");
        u.append(this.f2770e);
        u.append(", timezoneOffsetSeconds=");
        u.append(this.f2771f);
        u.append(", networkConnectionInfo=");
        u.append(this.f2772g);
        u.append("}");
        return u.toString();
    }
}
