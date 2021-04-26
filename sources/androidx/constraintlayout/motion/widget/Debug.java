package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.karumi.dexter.BuildConfig;
import java.io.PrintStream;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import p005b.p035e.p036a.p037a.C0843a;

public class Debug {
    public static void dumpLayoutParams(ViewGroup.LayoutParams layoutParams, String str) {
        StackTraceElement stackTraceElement = new Throwable().getStackTrace()[1];
        StringBuilder u = C0843a.m460u(".(");
        u.append(stackTraceElement.getFileName());
        u.append(":");
        u.append(stackTraceElement.getLineNumber());
        u.append(") ");
        u.append(str);
        u.append("  ");
        String sb = u.toString();
        PrintStream printStream = System.out;
        StringBuilder z = C0843a.m465z(" >>>>>>>>>>>>>>>>>>. dump ", sb, "  ");
        z.append(layoutParams.getClass().getName());
        printStream.println(z.toString());
        Field[] fields = layoutParams.getClass().getFields();
        for (Field field : fields) {
            try {
                Object obj = field.get(layoutParams);
                String name = field.getName();
                if (name.contains("To")) {
                    if (!obj.toString().equals("-1")) {
                        System.out.println(sb + "       " + name + " " + obj);
                    }
                }
            } catch (IllegalAccessException unused) {
            }
        }
        System.out.println(" <<<<<<<<<<<<<<<<< dump " + sb);
    }

    public static void dumpLayoutParams(ViewGroup viewGroup, String str) {
        StackTraceElement stackTraceElement = new Throwable().getStackTrace()[1];
        StringBuilder u = C0843a.m460u(".(");
        u.append(stackTraceElement.getFileName());
        u.append(":");
        u.append(stackTraceElement.getLineNumber());
        u.append(") ");
        u.append(str);
        u.append("  ");
        String sb = u.toString();
        int childCount = viewGroup.getChildCount();
        System.out.println(str + " children " + childCount);
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            PrintStream printStream = System.out;
            StringBuilder y = C0843a.m464y(sb, "     ");
            y.append(getName(childAt));
            printStream.println(y.toString());
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            Field[] fields = layoutParams.getClass().getFields();
            for (Field field : fields) {
                try {
                    Object obj = field.get(layoutParams);
                    if (field.getName().contains("To")) {
                        if (!obj.toString().equals("-1")) {
                            System.out.println(sb + "       " + field.getName() + " " + obj);
                        }
                    }
                } catch (IllegalAccessException unused) {
                }
            }
        }
    }

    public static void dumpPoc(Object obj) {
        StackTraceElement stackTraceElement = new Throwable().getStackTrace()[1];
        StringBuilder u = C0843a.m460u(".(");
        u.append(stackTraceElement.getFileName());
        u.append(":");
        u.append(stackTraceElement.getLineNumber());
        u.append(")");
        String sb = u.toString();
        Class<?> cls = obj.getClass();
        PrintStream printStream = System.out;
        StringBuilder y = C0843a.m464y(sb, "------------- ");
        y.append(cls.getName());
        y.append(" --------------------");
        printStream.println(y.toString());
        Field[] fields = cls.getFields();
        for (Field field : fields) {
            try {
                Object obj2 = field.get(obj);
                if (field.getName().startsWith("layout_constraint")) {
                    if (!(obj2 instanceof Integer) || !obj2.toString().equals("-1")) {
                        if (!(obj2 instanceof Integer) || !obj2.toString().equals("0")) {
                            if (!(obj2 instanceof Float) || !obj2.toString().equals(BuildConfig.VERSION_NAME)) {
                                if (!(obj2 instanceof Float) || !obj2.toString().equals("0.5")) {
                                    System.out.println(sb + "    " + field.getName() + " " + obj2);
                                }
                            }
                        }
                    }
                }
            } catch (IllegalAccessException unused) {
            }
        }
        PrintStream printStream2 = System.out;
        StringBuilder y2 = C0843a.m464y(sb, "------------- ");
        y2.append(cls.getSimpleName());
        y2.append(" --------------------");
        printStream2.println(y2.toString());
    }

    public static String getActionType(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        Field[] fields = MotionEvent.class.getFields();
        for (Field field : fields) {
            try {
                if (Modifier.isStatic(field.getModifiers()) && field.getType().equals(Integer.TYPE) && field.getInt((Object) null) == action) {
                    return field.getName();
                }
            } catch (IllegalAccessException unused) {
            }
        }
        return "---";
    }

    public static String getCallFrom(int i) {
        StackTraceElement stackTraceElement = new Throwable().getStackTrace()[i + 2];
        StringBuilder u = C0843a.m460u(".(");
        u.append(stackTraceElement.getFileName());
        u.append(":");
        u.append(stackTraceElement.getLineNumber());
        u.append(")");
        return u.toString();
    }

    public static String getLoc() {
        StackTraceElement stackTraceElement = new Throwable().getStackTrace()[1];
        StringBuilder u = C0843a.m460u(".(");
        u.append(stackTraceElement.getFileName());
        u.append(":");
        u.append(stackTraceElement.getLineNumber());
        u.append(") ");
        u.append(stackTraceElement.getMethodName());
        u.append("()");
        return u.toString();
    }

    public static String getLocation() {
        StackTraceElement stackTraceElement = new Throwable().getStackTrace()[1];
        StringBuilder u = C0843a.m460u(".(");
        u.append(stackTraceElement.getFileName());
        u.append(":");
        u.append(stackTraceElement.getLineNumber());
        u.append(")");
        return u.toString();
    }

    public static String getLocation2() {
        StackTraceElement stackTraceElement = new Throwable().getStackTrace()[2];
        StringBuilder u = C0843a.m460u(".(");
        u.append(stackTraceElement.getFileName());
        u.append(":");
        u.append(stackTraceElement.getLineNumber());
        u.append(")");
        return u.toString();
    }

    public static String getName(Context context, int i) {
        if (i == -1) {
            return "UNKNOWN";
        }
        try {
            return context.getResources().getResourceEntryName(i);
        } catch (Exception unused) {
            return C0843a.m444e("?", i);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
        r0 = "? " + r6[r1] + " ";
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0038 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String getName(android.content.Context r5, int[] r6) {
        /*
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0072 }
            r0.<init>()     // Catch:{ Exception -> 0x0072 }
            int r1 = r6.length     // Catch:{ Exception -> 0x0072 }
            r0.append(r1)     // Catch:{ Exception -> 0x0072 }
            java.lang.String r1 = "["
            r0.append(r1)     // Catch:{ Exception -> 0x0072 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x0072 }
            r1 = 0
        L_0x0013:
            int r2 = r6.length     // Catch:{ Exception -> 0x0072 }
            if (r1 >= r2) goto L_0x0060
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0072 }
            r2.<init>()     // Catch:{ Exception -> 0x0072 }
            r2.append(r0)     // Catch:{ Exception -> 0x0072 }
            java.lang.String r0 = " "
            if (r1 != 0) goto L_0x0025
            java.lang.String r3 = ""
            goto L_0x0026
        L_0x0025:
            r3 = r0
        L_0x0026:
            r2.append(r3)     // Catch:{ Exception -> 0x0072 }
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x0072 }
            android.content.res.Resources r3 = r5.getResources()     // Catch:{ NotFoundException -> 0x0038 }
            r4 = r6[r1]     // Catch:{ NotFoundException -> 0x0038 }
            java.lang.String r0 = r3.getResourceEntryName(r4)     // Catch:{ NotFoundException -> 0x0038 }
            goto L_0x004e
        L_0x0038:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0072 }
            r3.<init>()     // Catch:{ Exception -> 0x0072 }
            java.lang.String r4 = "? "
            r3.append(r4)     // Catch:{ Exception -> 0x0072 }
            r4 = r6[r1]     // Catch:{ Exception -> 0x0072 }
            r3.append(r4)     // Catch:{ Exception -> 0x0072 }
            r3.append(r0)     // Catch:{ Exception -> 0x0072 }
            java.lang.String r0 = r3.toString()     // Catch:{ Exception -> 0x0072 }
        L_0x004e:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0072 }
            r3.<init>()     // Catch:{ Exception -> 0x0072 }
            r3.append(r2)     // Catch:{ Exception -> 0x0072 }
            r3.append(r0)     // Catch:{ Exception -> 0x0072 }
            java.lang.String r0 = r3.toString()     // Catch:{ Exception -> 0x0072 }
            int r1 = r1 + 1
            goto L_0x0013
        L_0x0060:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0072 }
            r5.<init>()     // Catch:{ Exception -> 0x0072 }
            r5.append(r0)     // Catch:{ Exception -> 0x0072 }
            java.lang.String r6 = "]"
            r5.append(r6)     // Catch:{ Exception -> 0x0072 }
            java.lang.String r5 = r5.toString()     // Catch:{ Exception -> 0x0072 }
            return r5
        L_0x0072:
            r5 = move-exception
            java.lang.String r5 = r5.toString()
            java.lang.String r6 = "DEBUG"
            android.util.Log.v(r6, r5)
            java.lang.String r5 = "UNKNOWN"
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.Debug.getName(android.content.Context, int[]):java.lang.String");
    }

    public static String getName(View view) {
        try {
            return view.getContext().getResources().getResourceEntryName(view.getId());
        } catch (Exception unused) {
            return "UNKNOWN";
        }
    }

    public static String getState(MotionLayout motionLayout, int i) {
        return i == -1 ? "UNDEFINED" : motionLayout.getContext().getResources().getResourceEntryName(i);
    }

    public static void logStack(String str, String str2, int i) {
        StackTraceElement[] stackTrace = new Throwable().getStackTrace();
        int min = Math.min(i, stackTrace.length - 1);
        String str3 = " ";
        for (int i2 = 1; i2 <= min; i2++) {
            StackTraceElement stackTraceElement = stackTrace[i2];
            StringBuilder u = C0843a.m460u(".(");
            u.append(stackTrace[i2].getFileName());
            u.append(":");
            u.append(stackTrace[i2].getLineNumber());
            u.append(") ");
            u.append(stackTrace[i2].getMethodName());
            String sb = u.toString();
            str3 = C0843a.m451l(str3, " ");
            Log.v(str, str2 + str3 + sb + str3);
        }
    }

    public static void printStack(String str, int i) {
        StackTraceElement[] stackTrace = new Throwable().getStackTrace();
        int min = Math.min(i, stackTrace.length - 1);
        String str2 = " ";
        for (int i2 = 1; i2 <= min; i2++) {
            StackTraceElement stackTraceElement = stackTrace[i2];
            StringBuilder u = C0843a.m460u(".(");
            u.append(stackTrace[i2].getFileName());
            u.append(":");
            u.append(stackTrace[i2].getLineNumber());
            u.append(") ");
            String sb = u.toString();
            str2 = C0843a.m451l(str2, " ");
            PrintStream printStream = System.out;
            printStream.println(str + str2 + sb + str2);
        }
    }
}
