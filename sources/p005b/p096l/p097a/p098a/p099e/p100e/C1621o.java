package p005b.p096l.p097a.p098a.p099e.p100e;

import android.util.SparseArray;
import androidx.annotation.Nullable;
import com.google.auto.value.AutoValue;

@AutoValue
/* renamed from: b.l.a.a.e.e.o */
public abstract class C1621o {

    /* renamed from: b.l.a.a.e.e.o$a */
    public enum C1622a {
        UNKNOWN_MOBILE_SUBTYPE(0),
        GPRS(1),
        EDGE(2),
        UMTS(3),
        CDMA(4),
        EVDO_0(5),
        EVDO_A(6),
        RTT(7),
        HSDPA(8),
        HSUPA(9),
        HSPA(10),
        IDEN(11),
        EVDO_B(12),
        LTE(13),
        EHRPD(14),
        HSPAP(15),
        GSM(16),
        TD_SCDMA(17),
        IWLAN(18),
        LTE_CA(19),
        COMBINED(100);
        

        /* renamed from: C */
        public static final SparseArray<C1622a> f2795C = null;

        /* renamed from: g */
        public final int f2816g;

        /* access modifiers changed from: public */
        static {
            C1622a aVar;
            C1622a aVar2;
            C1622a aVar3;
            C1622a aVar4;
            C1622a aVar5;
            C1622a aVar6;
            C1622a aVar7;
            C1622a aVar8;
            C1622a aVar9;
            C1622a aVar10;
            C1622a aVar11;
            C1622a aVar12;
            C1622a aVar13;
            C1622a aVar14;
            C1622a aVar15;
            C1622a aVar16;
            C1622a aVar17;
            C1622a aVar18;
            C1622a aVar19;
            C1622a aVar20;
            SparseArray<C1622a> sparseArray = new SparseArray<>();
            f2795C = sparseArray;
            sparseArray.put(0, aVar);
            sparseArray.put(1, aVar2);
            sparseArray.put(2, aVar3);
            sparseArray.put(3, aVar4);
            sparseArray.put(4, aVar5);
            sparseArray.put(5, aVar6);
            sparseArray.put(6, aVar7);
            sparseArray.put(7, aVar8);
            sparseArray.put(8, aVar9);
            sparseArray.put(9, aVar10);
            sparseArray.put(10, aVar11);
            sparseArray.put(11, aVar12);
            sparseArray.put(12, aVar20);
            sparseArray.put(13, aVar13);
            sparseArray.put(14, aVar14);
            sparseArray.put(15, aVar15);
            sparseArray.put(16, aVar16);
            sparseArray.put(17, aVar17);
            sparseArray.put(18, aVar18);
            sparseArray.put(19, aVar19);
        }

        /* access modifiers changed from: public */
        C1622a(int i) {
            this.f2816g = i;
        }
    }

    /* renamed from: b.l.a.a.e.e.o$b */
    public enum C1623b {
        MOBILE(0),
        WIFI(1),
        MOBILE_MMS(2),
        MOBILE_SUPL(3),
        MOBILE_DUN(4),
        MOBILE_HIPRI(5),
        WIMAX(6),
        BLUETOOTH(7),
        DUMMY(8),
        ETHERNET(9),
        MOBILE_FOTA(10),
        MOBILE_IMS(11),
        MOBILE_CBS(12),
        WIFI_P2P(13),
        MOBILE_IA(14),
        MOBILE_EMERGENCY(15),
        PROXY(16),
        VPN(17),
        NONE(-1);
        

        /* renamed from: A */
        public static final SparseArray<C1623b> f2817A = null;

        /* renamed from: g */
        public final int f2838g;

        /* access modifiers changed from: public */
        static {
            C1623b bVar;
            C1623b bVar2;
            C1623b bVar3;
            C1623b bVar4;
            C1623b bVar5;
            C1623b bVar6;
            C1623b bVar7;
            C1623b bVar8;
            C1623b bVar9;
            C1623b bVar10;
            C1623b bVar11;
            C1623b bVar12;
            C1623b bVar13;
            C1623b bVar14;
            C1623b bVar15;
            C1623b bVar16;
            C1623b bVar17;
            C1623b bVar18;
            C1623b bVar19;
            SparseArray<C1623b> sparseArray = new SparseArray<>();
            f2817A = sparseArray;
            sparseArray.put(0, bVar);
            sparseArray.put(1, bVar2);
            sparseArray.put(2, bVar3);
            sparseArray.put(3, bVar4);
            sparseArray.put(4, bVar5);
            sparseArray.put(5, bVar6);
            sparseArray.put(6, bVar7);
            sparseArray.put(7, bVar8);
            sparseArray.put(8, bVar9);
            sparseArray.put(9, bVar10);
            sparseArray.put(10, bVar11);
            sparseArray.put(11, bVar12);
            sparseArray.put(12, bVar19);
            sparseArray.put(13, bVar13);
            sparseArray.put(14, bVar14);
            sparseArray.put(15, bVar15);
            sparseArray.put(16, bVar16);
            sparseArray.put(17, bVar18);
            sparseArray.put(-1, bVar17);
        }

        /* access modifiers changed from: public */
        C1623b(int i) {
            this.f2838g = i;
        }
    }

    @Nullable
    /* renamed from: a */
    public abstract C1622a mo11788a();

    @Nullable
    /* renamed from: b */
    public abstract C1623b mo11789b();
}
