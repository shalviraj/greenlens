package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.Keep;
import androidx.annotation.MainThread;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import p005b.p096l.p097a.p113c.p119b.p120l.p121k.C1808d2;
import p005b.p096l.p097a.p113c.p119b.p120l.p121k.C1823g2;
import p005b.p096l.p097a.p113c.p119b.p120l.p121k.C1824h;
import p005b.p096l.p097a.p113c.p119b.p120l.p121k.C1827i;

public class LifecycleCallback {

    /* renamed from: a */
    public final C1827i f11301a;

    public LifecycleCallback(C1827i iVar) {
        this.f11301a = iVar;
    }

    /* renamed from: b */
    public static C1827i m10387b(C1824h hVar) {
        C1808d2 d2Var;
        C1823g2 g2Var;
        Object obj = hVar.f3218a;
        if (obj instanceof FragmentActivity) {
            FragmentActivity fragmentActivity = (FragmentActivity) obj;
            WeakReference weakReference = C1823g2.f3214j.get(fragmentActivity);
            if (weakReference == null || (g2Var = (C1823g2) weakReference.get()) == null) {
                try {
                    g2Var = (C1823g2) fragmentActivity.getSupportFragmentManager().findFragmentByTag("SupportLifecycleFragmentImpl");
                    if (g2Var == null || g2Var.isRemoving()) {
                        g2Var = new C1823g2();
                        fragmentActivity.getSupportFragmentManager().beginTransaction().add((Fragment) g2Var, "SupportLifecycleFragmentImpl").commitAllowingStateLoss();
                    }
                    C1823g2.f3214j.put(fragmentActivity, new WeakReference(g2Var));
                } catch (ClassCastException e) {
                    throw new IllegalStateException("Fragment with tag SupportLifecycleFragmentImpl is not a SupportLifecycleFragmentImpl", e);
                }
            }
            return g2Var;
        } else if (obj instanceof Activity) {
            Activity activity = (Activity) obj;
            WeakReference weakReference2 = C1808d2.f3162j.get(activity);
            if (weakReference2 == null || (d2Var = (C1808d2) weakReference2.get()) == null) {
                try {
                    d2Var = (C1808d2) activity.getFragmentManager().findFragmentByTag("LifecycleFragmentImpl");
                    if (d2Var == null || d2Var.isRemoving()) {
                        d2Var = new C1808d2();
                        activity.getFragmentManager().beginTransaction().add(d2Var, "LifecycleFragmentImpl").commitAllowingStateLoss();
                    }
                    C1808d2.f3162j.put(activity, new WeakReference(d2Var));
                } catch (ClassCastException e2) {
                    throw new IllegalStateException("Fragment with tag LifecycleFragmentImpl is not a LifecycleFragmentImpl", e2);
                }
            }
            return d2Var;
        } else {
            throw new IllegalArgumentException("Can't get fragment for unexpected activity.");
        }
    }

    @Keep
    private static C1827i getChimeraLifecycleFragmentImpl(C1824h hVar) {
        throw new IllegalStateException("Method not available in SDK.");
    }

    @MainThread
    /* renamed from: a */
    public void mo18871a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }

    @MainThread
    /* renamed from: c */
    public void mo18872c(int i, int i2, Intent intent) {
    }

    @MainThread
    /* renamed from: d */
    public void mo18873d(Bundle bundle) {
    }

    @MainThread
    /* renamed from: e */
    public void mo18874e(Bundle bundle) {
    }

    @MainThread
    /* renamed from: f */
    public void mo18875f() {
    }

    @MainThread
    /* renamed from: g */
    public void mo14698g() {
    }
}
