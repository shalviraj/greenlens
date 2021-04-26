package p005b.p096l.p097a.p151d.p152a.p154b;

import androidx.annotation.Nullable;

/* renamed from: b.l.a.d.a.b.r1 */
public final class C3540r1 {

    /* renamed from: a */
    public final int f6544a;

    /* renamed from: b */
    public final String f6545b;

    /* renamed from: c */
    public final long f6546c;

    /* renamed from: d */
    public final long f6547d;

    /* renamed from: e */
    public final int f6548e;

    public C3540r1() {
    }

    public C3540r1(int i, @Nullable String str, long j, long j2, int i2) {
        this.f6544a = i;
        this.f6545b = str;
        this.f6546c = j;
        this.f6547d = j2;
        this.f6548e = i2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0011, code lost:
        r1 = r7.f6545b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r8) {
        /*
            r7 = this;
            r0 = 1
            if (r8 != r7) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r8 instanceof p005b.p096l.p097a.p151d.p152a.p154b.C3540r1
            r2 = 0
            if (r1 == 0) goto L_0x003a
            b.l.a.d.a.b.r1 r8 = (p005b.p096l.p097a.p151d.p152a.p154b.C3540r1) r8
            int r1 = r7.f6544a
            int r3 = r8.f6544a
            if (r1 != r3) goto L_0x003a
            java.lang.String r1 = r7.f6545b
            if (r1 != 0) goto L_0x001a
            java.lang.String r1 = r8.f6545b
            if (r1 != 0) goto L_0x003a
            goto L_0x0023
        L_0x001a:
            java.lang.String r3 = r8.f6545b
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L_0x0023
            goto L_0x003a
        L_0x0023:
            long r3 = r7.f6546c
            long r5 = r8.f6546c
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto L_0x003a
            long r3 = r7.f6547d
            long r5 = r8.f6547d
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto L_0x003a
            int r1 = r7.f6548e
            int r8 = r8.f6548e
            if (r1 != r8) goto L_0x003a
            return r0
        L_0x003a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p096l.p097a.p151d.p152a.p154b.C3540r1.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int i = (this.f6544a ^ 1000003) * 1000003;
        String str = this.f6545b;
        int hashCode = str == null ? 0 : str.hashCode();
        long j = this.f6546c;
        long j2 = this.f6547d;
        return ((((((i ^ hashCode) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ this.f6548e;
    }

    public String toString() {
        int i = this.f6544a;
        String str = this.f6545b;
        long j = this.f6546c;
        long j2 = this.f6547d;
        int i2 = this.f6548e;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 157);
        sb.append("SliceCheckpoint{fileExtractionStatus=");
        sb.append(i);
        sb.append(", filePath=");
        sb.append(str);
        sb.append(", fileOffset=");
        sb.append(j);
        sb.append(", remainingBytes=");
        sb.append(j2);
        sb.append(", previousChunk=");
        sb.append(i2);
        sb.append("}");
        return sb.toString();
    }
}
