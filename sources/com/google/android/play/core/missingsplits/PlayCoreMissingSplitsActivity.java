package com.google.android.play.core.missingsplits;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Process;
import android.util.Log;
import p005b.p035e.p036a.p037a.C0843a;
import p005b.p096l.p097a.p151d.p152a.p159e.C3584f;
import p005b.p096l.p097a.p151d.p152a.p159e.C3608r;

public class PlayCoreMissingSplitsActivity extends Activity implements DialogInterface.OnClickListener {
    public final void onClick(DialogInterface dialogInterface, int i) {
        if (i == -1) {
            String packageName = getPackageName();
            try {
                startActivity(new Intent("android.intent.action.VIEW").setData(Uri.parse(C0843a.m456q(new StringBuilder(String.valueOf(packageName).length() + 66), "market://details?id=", packageName, "&referrer=utm_source%3Dplay.core.missingsplits"))).setPackage("com.android.vending"));
            } catch (ActivityNotFoundException e) {
                String name = getClass().getName();
                int myUid = Process.myUid();
                int myPid = Process.myPid();
                StringBuilder sb = new StringBuilder(39);
                sb.append("UID: [");
                sb.append(myUid);
                sb.append("]  PID: [");
                sb.append(myPid);
                sb.append("] ");
                String valueOf = String.valueOf(sb.toString());
                String concat = name.length() != 0 ? valueOf.concat(name) : new String(valueOf);
                Object[] objArr = {packageName};
                if (Log.isLoggable("PlayCore", 6)) {
                    Log.e("PlayCore", C3584f.m6804c(concat, "Couldn't start missing splits activity for %s", objArr), e);
                }
            }
        }
        finish();
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        AlertDialog.Builder neutralButton = new AlertDialog.Builder(this).setTitle("Installation failed").setCancelable(false).setNeutralButton("Close", this);
        if (C3608r.m6844a(this)) {
            String charSequence = getApplicationInfo().loadLabel(getPackageManager()).toString();
            StringBuilder sb = new StringBuilder(String.valueOf(charSequence).length() + 91);
            sb.append("The app ");
            sb.append(charSequence);
            sb.append(" is missing required components and must be reinstalled from the Google Play Store.");
            neutralButton.setMessage(sb.toString()).setPositiveButton("Reinstall", this);
        } else {
            String charSequence2 = getApplicationInfo().loadLabel(getPackageManager()).toString();
            StringBuilder sb2 = new StringBuilder(String.valueOf(charSequence2).length() + 87);
            sb2.append("The app ");
            sb2.append(charSequence2);
            sb2.append(" is missing required components and must be reinstalled from an official store.");
            neutralButton.setMessage(sb2.toString());
        }
        neutralButton.create().show();
    }
}
