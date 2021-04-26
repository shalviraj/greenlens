package p005b.p006a.p007a.p019j;

import android.widget.EditText;
import com.segment.analytics.AnalyticsContext;
import java.io.File;
import p005b.p035e.p036a.p037a.C0843a;
import p298d.p344x.p346c.C6888i;

/* renamed from: b.a.a.j.e */
public final class C0774e {

    /* renamed from: a */
    public final String f527a;

    /* renamed from: b */
    public final String f528b;

    /* renamed from: c */
    public final EditText f529c;

    /* renamed from: d */
    public File f530d;

    /* renamed from: e */
    public String f531e;

    /* renamed from: f */
    public Integer f532f;

    /* renamed from: g */
    public String f533g;

    /* renamed from: h */
    public String f534h;

    /* renamed from: i */
    public Boolean f535i;

    public C0774e(String str, String str2, EditText editText, File file, String str3, Integer num, String str4, String str5, Boolean bool, int i) {
        int i2 = i & 8;
        int i3 = i & 16;
        int i4 = (i & 32) != 0 ? 0 : null;
        int i5 = i & 64;
        int i6 = i & 128;
        bool = (i & 256) != 0 ? Boolean.FALSE : bool;
        C6888i.m12438e(str, "type");
        C6888i.m12438e(str2, AnalyticsContext.Device.DEVICE_ID_KEY);
        this.f527a = str;
        this.f528b = str2;
        this.f529c = editText;
        this.f530d = null;
        this.f531e = null;
        this.f532f = i4;
        this.f533g = null;
        this.f534h = null;
        this.f535i = bool;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0774e)) {
            return false;
        }
        C0774e eVar = (C0774e) obj;
        return C6888i.m12434a(this.f527a, eVar.f527a) && C6888i.m12434a(this.f528b, eVar.f528b) && C6888i.m12434a(this.f529c, eVar.f529c) && C6888i.m12434a(this.f530d, eVar.f530d) && C6888i.m12434a(this.f531e, eVar.f531e) && C6888i.m12434a(this.f532f, eVar.f532f) && C6888i.m12434a(this.f533g, eVar.f533g) && C6888i.m12434a(this.f534h, eVar.f534h) && C6888i.m12434a(this.f535i, eVar.f535i);
    }

    public int hashCode() {
        String str = this.f527a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f528b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        EditText editText = this.f529c;
        int hashCode3 = (hashCode2 + (editText != null ? editText.hashCode() : 0)) * 31;
        File file = this.f530d;
        int hashCode4 = (hashCode3 + (file != null ? file.hashCode() : 0)) * 31;
        String str3 = this.f531e;
        int hashCode5 = (hashCode4 + (str3 != null ? str3.hashCode() : 0)) * 31;
        Integer num = this.f532f;
        int hashCode6 = (hashCode5 + (num != null ? num.hashCode() : 0)) * 31;
        String str4 = this.f533g;
        int hashCode7 = (hashCode6 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.f534h;
        int hashCode8 = (hashCode7 + (str5 != null ? str5.hashCode() : 0)) * 31;
        Boolean bool = this.f535i;
        if (bool != null) {
            i = bool.hashCode();
        }
        return hashCode8 + i;
    }

    public String toString() {
        StringBuilder u = C0843a.m460u("FormInput(type=");
        u.append(this.f527a);
        u.append(", id=");
        u.append(this.f528b);
        u.append(", editText=");
        u.append(this.f529c);
        u.append(", imageFile=");
        u.append(this.f530d);
        u.append(", fileName=");
        u.append(this.f531e);
        u.append(", fileSize=");
        u.append(this.f532f);
        u.append(", fileType=");
        u.append(this.f533g);
        u.append(", fileUrl=");
        u.append(this.f534h);
        u.append(", required=");
        u.append(this.f535i);
        u.append(")");
        return u.toString();
    }
}
