package com.github.dhaval2404.imagepicker.util;

import android.content.Context;
import androidx.core.content.ContextCompat;
import com.segment.analytics.integrations.BasePayload;
import java.util.ArrayList;
import kotlin.Metadata;
import p298d.p344x.p346c.C6888i;

@Metadata(mo24460bv = {1, 0, 3}, mo24461d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\t¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\r\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\r\u0010\b¨\u0006\u0010"}, mo24462d2 = {"Lcom/github/dhaval2404/imagepicker/util/PermissionUtil;", "", "Landroid/content/Context;", "context", "", "permission", "", "hasPermission", "(Landroid/content/Context;Ljava/lang/String;)Z", "", "permissions", "isPermissionGranted", "(Landroid/content/Context;[Ljava/lang/String;)Z", "isPermissionInManifest", "<init>", "()V", "imagepicker_release"}, mo24463k = 1, mo24464mv = {1, 4, 0})
public final class PermissionUtil {
    public static final PermissionUtil INSTANCE = new PermissionUtil();

    private PermissionUtil() {
    }

    private final boolean hasPermission(Context context, String str) {
        return ContextCompat.checkSelfPermission(context, str) == 0;
    }

    public final boolean isPermissionGranted(Context context, String[] strArr) {
        C6888i.m12439f(context, BasePayload.CONTEXT_KEY);
        C6888i.m12439f(strArr, "permissions");
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            if (INSTANCE.hasPermission(context, str)) {
                arrayList.add(str);
            }
        }
        return arrayList.size() == strArr.length;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x002c A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean isPermissionInManifest(android.content.Context r6, java.lang.String r7) {
        /*
            r5 = this;
            java.lang.String r0 = "context"
            p298d.p344x.p346c.C6888i.m12439f(r6, r0)
            java.lang.String r0 = "permission"
            p298d.p344x.p346c.C6888i.m12439f(r7, r0)
            android.content.pm.PackageManager r0 = r6.getPackageManager()
            java.lang.String r6 = r6.getPackageName()
            r1 = 4096(0x1000, float:5.74E-42)
            android.content.pm.PackageInfo r6 = r0.getPackageInfo(r6, r1)
            java.lang.String[] r6 = r6.requestedPermissions
            r0 = 1
            r1 = 0
            if (r6 == 0) goto L_0x0029
            int r2 = r6.length
            if (r2 != 0) goto L_0x0023
            r2 = r0
            goto L_0x0024
        L_0x0023:
            r2 = r1
        L_0x0024:
            if (r2 == 0) goto L_0x0027
            goto L_0x0029
        L_0x0027:
            r2 = r1
            goto L_0x002a
        L_0x0029:
            r2 = r0
        L_0x002a:
            if (r2 == 0) goto L_0x002d
            return r1
        L_0x002d:
            int r2 = r6.length
            r3 = r1
        L_0x002f:
            if (r3 >= r2) goto L_0x003d
            r4 = r6[r3]
            boolean r4 = p298d.p344x.p346c.C6888i.m12434a(r4, r7)
            if (r4 == 0) goto L_0x003a
            return r0
        L_0x003a:
            int r3 = r3 + 1
            goto L_0x002f
        L_0x003d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.dhaval2404.imagepicker.util.PermissionUtil.isPermissionInManifest(android.content.Context, java.lang.String):boolean");
    }
}
