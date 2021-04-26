package com.appfoundry.previewer.activities;

import android.app.Activity;
import android.app.DownloadManager;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDialogFragment;
import androidx.core.app.NotificationCompat;
import androidx.core.content.ContextCompat;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import app.bravostudio.A01F41WRYKPX5KXQ68EGF1JX39R.R;
import com.androidbuffer.kotlinfilepicker.KotlinFilePicker;
import com.appfoundry.previewer.BravoApp;
import com.appfoundry.previewer.fragments.BottomSheetFragment;
import com.appfoundry.previewer.model.AuthInfoFromBackend;
import com.appfoundry.previewer.model.BackendResponse;
import com.appfoundry.previewer.model.Component;
import com.appfoundry.previewer.model.ExchangeResponse;
import com.appfoundry.previewer.model.JsonApp;
import com.appfoundry.previewer.model.Page;
import com.appfoundry.previewer.model.Params;
import com.auth0.android.provider.AuthenticationActivity;
import com.github.dhaval2404.imagepicker.ImagePicker;
import com.github.dhaval2404.imagepicker.constant.ImageProvider;
import com.google.android.material.snackbar.Snackbar;
import com.google.firebase.auth.FirebaseAuth;
import com.journeyapps.barcodescanner.CaptureActivity;
import com.karumi.dexter.Dexter;
import com.karumi.dexter.PermissionToken;
import com.karumi.dexter.listener.PermissionDeniedResponse;
import com.karumi.dexter.listener.PermissionGrantedResponse;
import com.karumi.dexter.listener.PermissionRequest;
import com.karumi.dexter.listener.single.PermissionListener;
import com.segment.analytics.Analytics;
import com.segment.analytics.AnalyticsContext;
import com.segment.analytics.Options;
import com.segment.analytics.integrations.BasePayload;
import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import kotlin.Metadata;
import org.greenrobot.eventbus.ThreadMode;
import p005b.p006a.p007a.p008a.C0594b;
import p005b.p006a.p007a.p014e.C0664a;
import p005b.p006a.p007a.p014e.C0666c;
import p005b.p006a.p007a.p014e.C0670d;
import p005b.p006a.p007a.p014e.C0672f;
import p005b.p006a.p007a.p014e.C0675g;
import p005b.p006a.p007a.p014e.C0680i;
import p005b.p006a.p007a.p014e.C0685n;
import p005b.p006a.p007a.p015f.C0688a;
import p005b.p006a.p007a.p016g.C0690b;
import p005b.p006a.p007a.p017h.C0692a0;
import p005b.p006a.p007a.p017h.C0693b;
import p005b.p006a.p007a.p017h.C0694b0;
import p005b.p006a.p007a.p017h.C0697d;
import p005b.p006a.p007a.p017h.C0698d0;
import p005b.p006a.p007a.p017h.C0699e;
import p005b.p006a.p007a.p017h.C0700e0;
import p005b.p006a.p007a.p017h.C0702f0;
import p005b.p006a.p007a.p017h.C0703g;
import p005b.p006a.p007a.p017h.C0704g0;
import p005b.p006a.p007a.p017h.C0705h;
import p005b.p006a.p007a.p017h.C0706h0;
import p005b.p006a.p007a.p017h.C0708i0;
import p005b.p006a.p007a.p017h.C0710j0;
import p005b.p006a.p007a.p017h.C0712k0;
import p005b.p006a.p007a.p017h.C0713l;
import p005b.p006a.p007a.p017h.C0714l0;
import p005b.p006a.p007a.p017h.C0715m;
import p005b.p006a.p007a.p017h.C0716m0;
import p005b.p006a.p007a.p017h.C0717n;
import p005b.p006a.p007a.p017h.C0719o;
import p005b.p006a.p007a.p017h.C0720o0;
import p005b.p006a.p007a.p017h.C0721p;
import p005b.p006a.p007a.p017h.C0723q;
import p005b.p006a.p007a.p017h.C0725r;
import p005b.p006a.p007a.p017h.C0726r0;
import p005b.p006a.p007a.p017h.C0727s;
import p005b.p006a.p007a.p017h.C0728s0;
import p005b.p006a.p007a.p017h.C0730t0;
import p005b.p006a.p007a.p017h.C0731u;
import p005b.p006a.p007a.p017h.C0732u0;
import p005b.p006a.p007a.p017h.C0733v;
import p005b.p006a.p007a.p017h.C0734v0;
import p005b.p006a.p007a.p017h.C0735w;
import p005b.p006a.p007a.p017h.C0737y;
import p005b.p006a.p007a.p018i.C0739a;
import p005b.p006a.p007a.p018i.C0744e;
import p005b.p006a.p007a.p018i.C0756o;
import p005b.p006a.p007a.p018i.C0758q;
import p005b.p006a.p007a.p019j.C0770a;
import p005b.p006a.p007a.p019j.C0774e;
import p005b.p006a.p007a.p019j.C0777h;
import p005b.p006a.p007a.p019j.C0779j;
import p005b.p006a.p007a.p021l.C0785b;
import p005b.p006a.p007a.p023n.C0801a;
import p005b.p006a.p007a.p023n.C0812d;
import p005b.p006a.p007a.p023n.C0816e;
import p005b.p006a.p007a.p023n.C0817f;
import p005b.p006a.p007a.p024o.C0820c;
import p005b.p006a.p007a.p024o.C0823f;
import p005b.p035e.p036a.p037a.C0843a;
import p005b.p038f.p039a.C0849e;
import p005b.p040g.p041a.C0850a;
import p005b.p040g.p041a.C0851b;
import p005b.p040g.p041a.p042e.C0855b;
import p005b.p040g.p041a.p042e.C0856c;
import p005b.p040g.p041a.p042e.C0857d;
import p005b.p040g.p041a.p042e.p043f.C0859a;
import p005b.p040g.p041a.p042e.p043f.C0860b;
import p005b.p040g.p041a.p042e.p043f.C0861c;
import p005b.p040g.p041a.p042e.p043f.C0863e;
import p005b.p040g.p041a.p042e.p043f.C0865g;
import p005b.p040g.p041a.p042e.p043f.C0866h;
import p005b.p040g.p041a.p042e.p043f.C0867i;
import p005b.p040g.p041a.p044f.C0869a;
import p005b.p040g.p041a.p046h.C0882d;
import p005b.p040g.p041a.p046h.C0884f;
import p005b.p040g.p041a.p046h.C0891l;
import p005b.p040g.p041a.p046h.C0893n;
import p005b.p040g.p041a.p046h.C0898o;
import p005b.p040g.p041a.p046h.C0905u;
import p005b.p040g.p041a.p046h.C0906v;
import p005b.p040g.p041a.p047i.p048b.C0910c;
import p005b.p040g.p041a.p049j.C0921a;
import p005b.p040g.p041a.p050k.C0926c;
import p005b.p096l.p097a.p113c.p119b.p126p.C1960d;
import p005b.p096l.p097a.p113c.p131e.p136e.C2360nh;
import p005b.p096l.p097a.p113c.p131e.p136e.C2456rh;
import p005b.p096l.p097a.p113c.p131e.p136e.C2479sg;
import p005b.p096l.p097a.p113c.p131e.p136e.C2600xh;
import p005b.p096l.p097a.p113c.p150j.C3418c;
import p005b.p096l.p097a.p113c.p150j.C3428h;
import p005b.p096l.p097a.p151d.p152a.p153a.C3448a;
import p005b.p096l.p097a.p151d.p152a.p153a.C3449b;
import p005b.p096l.p097a.p151d.p152a.p153a.C3454g;
import p005b.p096l.p097a.p151d.p152a.p153a.C3468u;
import p005b.p096l.p097a.p151d.p152a.p153a.C3469v;
import p005b.p096l.p097a.p151d.p152a.p163i.C3638e;
import p005b.p096l.p097a.p151d.p152a.p163i.C3651r;
import p005b.p096l.p180d.C3825d;
import p005b.p096l.p180d.p185o.C3854a;
import p005b.p096l.p180d.p185o.C3922p;
import p005b.p096l.p180d.p185o.C3924q;
import p005b.p096l.p180d.p185o.C3933u0;
import p005b.p096l.p232f.p233a0.p234a.C4485a;
import p005b.p273o.C4857i2;
import p005b.p280p.p281a.C5075l;
import p005b.p280p.p285b.C5245o;
import p005b.p291q.p292a.C5266a;
import p298d.C6764f;
import p298d.C6777r;
import p298d.p334t.C6790h;
import p298d.p337v.C6824d;
import p298d.p337v.C6827f;
import p298d.p337v.p338i.C6833a;
import p298d.p337v.p339j.p340a.C6840e;
import p298d.p337v.p339j.p340a.C6844h;
import p298d.p344x.p345b.C6851a;
import p298d.p344x.p345b.C6862l;
import p298d.p344x.p345b.C6866p;
import p298d.p344x.p346c.C6888i;
import p298d.p344x.p346c.C6890k;
import p298d.p344x.p346c.C6901v;
import p298d.p415c0.C7694h;
import p416l.p417a.C7725h0;
import p416l.p417a.C7748o;
import p416l.p417a.C7815w;
import p416l.p417a.C7819x0;
import p416l.p417a.C7821y;
import p416l.p417a.C7823z;
import p416l.p417a.p419u1.C7785l;
import p421m.C7829b0;
import p421m.C7839e0;
import p421m.C7841f;
import p421m.C7843g;
import p421m.C7844g0;
import p421m.p422m0.p426g.C7887e;
import p437o.p438a.p439a.C8068c;
import p437o.p438a.p439a.C8083m;
import p441p.p442a.C8091a;

@Metadata(mo24460bv = {1, 0, 3}, mo24461d1 = {"\u0000È\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0016\u0018\u00002\u00020\u0001B\b¢\u0006\u0005\bá\u0001\u0010\bJ\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\bJ\u000f\u0010\n\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\n\u0010\bJ\u000f\u0010\u000b\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u000b\u0010\bJ\u000f\u0010\f\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\f\u0010\bJ\u000f\u0010\r\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\r\u0010\bJ)\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0014¢\u0006\u0004\b\u0013\u0010\u0014J/\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000e2\u000e\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u00152\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u001cH\u0007¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010!\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020 H\u0007¢\u0006\u0004\b!\u0010\"J\u0017\u0010$\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020#H\u0007¢\u0006\u0004\b$\u0010%J\u0017\u0010'\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020&H\u0007¢\u0006\u0004\b'\u0010(J\u0017\u0010*\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020)H\u0007¢\u0006\u0004\b*\u0010+J\u0017\u0010-\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020,H\u0007¢\u0006\u0004\b-\u0010.J\u0017\u00100\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020/H\u0007¢\u0006\u0004\b0\u00101J\u0017\u00103\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u000202H\u0007¢\u0006\u0004\b3\u00104J\u0019\u00108\u001a\u0004\u0018\u0001072\b\u00106\u001a\u0004\u0018\u000105¢\u0006\u0004\b8\u00109J\u0017\u0010;\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020:H\u0007¢\u0006\u0004\b;\u0010<J\u0017\u0010>\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020=H\u0007¢\u0006\u0004\b>\u0010?J\u0017\u0010A\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020@H\u0007¢\u0006\u0004\bA\u0010BJ\u0017\u0010D\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020CH\u0007¢\u0006\u0004\bD\u0010EJ\u0017\u0010G\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020FH\u0007¢\u0006\u0004\bG\u0010HJ\u0017\u0010J\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020IH\u0007¢\u0006\u0004\bJ\u0010KJ\u0017\u0010M\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020LH\u0007¢\u0006\u0004\bM\u0010NJ\u0019\u0010P\u001a\u00020\u00042\b\u0010\u001d\u001a\u0004\u0018\u00010OH\u0007¢\u0006\u0004\bP\u0010QJ\u0017\u0010S\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020RH\u0007¢\u0006\u0004\bS\u0010TJ\u0017\u0010V\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020UH\u0007¢\u0006\u0004\bV\u0010WJ\u0017\u0010Z\u001a\u00020\u00042\u0006\u0010Y\u001a\u00020XH\u0007¢\u0006\u0004\bZ\u0010[J\u0017\u0010]\u001a\u00020\u00042\u0006\u0010Y\u001a\u00020\\H\u0007¢\u0006\u0004\b]\u0010^J\u0017\u0010`\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020_H\u0007¢\u0006\u0004\b`\u0010aJ\u0017\u0010c\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020bH\u0007¢\u0006\u0004\bc\u0010dJ\u0017\u0010f\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020eH\u0007¢\u0006\u0004\bf\u0010gJ\u0017\u0010i\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020hH\u0007¢\u0006\u0004\bi\u0010jJ\u0017\u0010l\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020kH\u0007¢\u0006\u0004\bl\u0010mJ\u0017\u0010o\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020nH\u0007¢\u0006\u0004\bo\u0010pJ\u0017\u0010r\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020qH\u0007¢\u0006\u0004\br\u0010sJ\u0017\u0010u\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020tH\u0007¢\u0006\u0004\bu\u0010vJ\u0017\u0010x\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020wH\u0007¢\u0006\u0004\bx\u0010yJ\u0017\u0010{\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020zH\u0007¢\u0006\u0004\b{\u0010|J\u0017\u0010~\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020}H\u0007¢\u0006\u0004\b~\u0010J\u001b\u0010\u0001\u001a\u00020\u00042\u0007\u0010\u001d\u001a\u00030\u0001H\u0007¢\u0006\u0006\b\u0001\u0010\u0001J7\u0010\u0001\u001a\u00020\u00042\n\u0010\u0001\u001a\u0005\u0018\u00010\u00012\f\b\u0002\u0010\u0001\u001a\u0005\u0018\u00010\u00012\u000b\b\u0002\u0010\u0001\u001a\u0004\u0018\u000107¢\u0006\u0006\b\u0001\u0010\u0001J\u001b\u0010\u0001\u001a\u00020\u00042\u0007\u0010\u001d\u001a\u00030\u0001H\u0007¢\u0006\u0006\b\u0001\u0010\u0001J\u001b\u0010\u0001\u001a\u00020\u00042\u0007\u0010\u001d\u001a\u00030\u0001H\u0007¢\u0006\u0006\b\u0001\u0010\u0001J\u001b\u0010\u0001\u001a\u00020\u00042\u0007\u0010\u001d\u001a\u00030\u0001H\u0007¢\u0006\u0006\b\u0001\u0010\u0001J\u001b\u0010\u0001\u001a\u00020\u00042\u0007\u0010\u001d\u001a\u00030\u0001H\u0007¢\u0006\u0006\b\u0001\u0010\u0001J\u001c\u0010\u0001\u001a\u00030\u00012\u0007\u0010\u001d\u001a\u00030\u0001H\u0016¢\u0006\u0006\b\u0001\u0010\u0001J1\u0010\u0001\u001a\u00020\u00042\b\u0010\u0001\u001a\u00030\u00012\t\u0010\u0001\u001a\u0004\u0018\u0001072\n\u0010\u0001\u001a\u0005\u0018\u00010\u0001¢\u0006\u0006\b\u0001\u0010\u0001J\u001c\u0010\u0001\u001a\u00020\u00042\b\u0010\u0001\u001a\u00030\u0001H\u0016¢\u0006\u0006\b\u0001\u0010 \u0001J\u001c\u0010£\u0001\u001a\u00030¢\u00012\u0007\u0010¡\u0001\u001a\u00020\u0016H\u0002¢\u0006\u0006\b£\u0001\u0010¤\u0001J(\u0010§\u0001\u001a\u00020\u00042\t\u0010¥\u0001\u001a\u0004\u0018\u00010\u00162\t\u0010¦\u0001\u001a\u0004\u0018\u00010\u0016H\u0002¢\u0006\u0006\b§\u0001\u0010¨\u0001J\u0011\u0010©\u0001\u001a\u00020\u0004H\u0002¢\u0006\u0005\b©\u0001\u0010\bJ\u0019\u0010ª\u0001\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020zH\u0002¢\u0006\u0005\bª\u0001\u0010|J\u001b\u0010¬\u0001\u001a\u00020\u00042\u0007\u0010«\u0001\u001a\u00020\u0016H\u0002¢\u0006\u0006\b¬\u0001\u0010­\u0001J\u0011\u0010®\u0001\u001a\u00020\u0004H\u0002¢\u0006\u0005\b®\u0001\u0010\bJ\u0013\u0010¯\u0001\u001a\u00030\u0001H\u0002¢\u0006\u0006\b¯\u0001\u0010°\u0001J\u0011\u0010±\u0001\u001a\u00020\u0004H\u0002¢\u0006\u0005\b±\u0001\u0010\bJ\u0011\u0010²\u0001\u001a\u00020\u0004H\u0002¢\u0006\u0005\b²\u0001\u0010\bJ\u0011\u0010³\u0001\u001a\u00020\u0004H\u0002¢\u0006\u0005\b³\u0001\u0010\bJ&\u0010µ\u0001\u001a\u00020\u00042\t\u0010¥\u0001\u001a\u0004\u0018\u00010\u00162\u0007\u0010´\u0001\u001a\u00020\u0016H\u0002¢\u0006\u0006\bµ\u0001\u0010¨\u0001J\u001e\u0010¸\u0001\u001a\u00020\u00042\n\u0010·\u0001\u001a\u0005\u0018\u00010¶\u0001H\u0002¢\u0006\u0006\b¸\u0001\u0010¹\u0001J6\u0010½\u0001\u001a\u00020\u00042\n\u0010»\u0001\u001a\u0005\u0018\u00010º\u00012\n\u0010¼\u0001\u001a\u0005\u0018\u00010º\u00012\n\u0010\u0001\u001a\u0005\u0018\u00010\u0001H\u0002¢\u0006\u0006\b½\u0001\u0010¾\u0001J)\u0010À\u0001\u001a\u00020\u00042\t\u0010¿\u0001\u001a\u0004\u0018\u00010\u00162\n\u0010\u0001\u001a\u0005\u0018\u00010\u0001H\u0002¢\u0006\u0006\bÀ\u0001\u0010Á\u0001J6\u0010Â\u0001\u001a\u00020\u00042\n\u0010»\u0001\u001a\u0005\u0018\u00010º\u00012\n\u0010¼\u0001\u001a\u0005\u0018\u00010º\u00012\n\u0010\u0001\u001a\u0005\u0018\u00010\u0001H\u0002¢\u0006\u0006\bÂ\u0001\u0010¾\u0001J*\u0010Ã\u0001\u001a\u00020\u00042\n\u0010»\u0001\u001a\u0005\u0018\u00010º\u00012\n\u0010\u0001\u001a\u0005\u0018\u00010\u0001H\u0002¢\u0006\u0006\bÃ\u0001\u0010Ä\u0001J\u0011\u0010Å\u0001\u001a\u00020\u0004H\u0002¢\u0006\u0005\bÅ\u0001\u0010\bR\u001a\u0010È\u0001\u001a\u00030Æ\u00018\u0002@\u0002X\u000e¢\u0006\b\n\u0006\bÇ\u0001\u0010¯\u0001R\u001a\u0010Ë\u0001\u001a\u00030\u00018\u0002@\u0002X\u000e¢\u0006\b\n\u0006\bÉ\u0001\u0010Ê\u0001R#\u0010Ñ\u0001\u001a\u00030Ì\u00018B@\u0002X\u0002¢\u0006\u0010\n\u0006\bÍ\u0001\u0010Î\u0001\u001a\u0006\bÏ\u0001\u0010Ð\u0001R\u001c\u0010Ô\u0001\u001a\u0005\u0018\u00010Ò\u00018\u0002@\u0002X\u000e¢\u0006\b\n\u0006\b³\u0001\u0010Ó\u0001R\u001a\u0010Ö\u0001\u001a\u00030\u00018\u0002@\u0002X\u000e¢\u0006\b\n\u0006\bÕ\u0001\u0010Ê\u0001R\u001a\u0010Ø\u0001\u001a\u00030Æ\u00018\u0002@\u0002X\u000e¢\u0006\b\n\u0006\b×\u0001\u0010¯\u0001R\u001a\u0010Û\u0001\u001a\u00030Ù\u00018\u0002@\u0002X\u000e¢\u0006\b\n\u0006\b²\u0001\u0010Ú\u0001R#\u0010à\u0001\u001a\u00030Ü\u00018B@\u0002X\u0002¢\u0006\u0010\n\u0006\bÝ\u0001\u0010Î\u0001\u001a\u0006\bÞ\u0001\u0010ß\u0001¨\u0006â\u0001"}, mo24462d2 = {"Lcom/appfoundry/previewer/activities/BravoActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Landroid/os/Bundle;", "savedInstanceState", "Ld/r;", "onCreate", "(Landroid/os/Bundle;)V", "onResume", "()V", "finish", "onPause", "onStart", "onDestroy", "onBackPressed", "", "requestCode", "resultCode", "Landroid/content/Intent;", "data", "onActivityResult", "(IILandroid/content/Intent;)V", "", "", "permissions", "", "grantResults", "onRequestPermissionsResult", "(I[Ljava/lang/String;[I)V", "Lb/a/a/h/k0;", "event", "onScannedOrEmulatorAppListClicked", "(Lb/a/a/h/k0;)V", "Lb/a/a/h/a0;", "onOpenQrScannerEvent", "(Lb/a/a/h/a0;)V", "Lb/a/a/h/v;", "onNavigationEvent", "(Lb/a/a/h/v;)V", "Lb/a/a/h/t0;", "onUnlinkEvent", "(Lb/a/a/h/t0;)V", "Lb/a/a/h/e0;", "onPhoneEvent", "(Lb/a/a/h/e0;)V", "Lb/a/a/h/h;", "onEmailEvent", "(Lb/a/a/h/h;)V", "Lb/a/a/h/l0;", "onShareEvent", "(Lb/a/a/h/l0;)V", "Lb/a/a/h/g;", "onDownloadEvent", "(Lb/a/a/h/g;)V", "Lcom/appfoundry/previewer/model/Page;", "page", "Landroidx/fragment/app/Fragment;", "q", "(Lcom/appfoundry/previewer/model/Page;)Landroidx/fragment/app/Fragment;", "Lb/a/a/h/v0;", "onVideoEvent", "(Lb/a/a/h/v0;)V", "Lb/a/a/h/d0;", "onPdfEvent", "(Lb/a/a/h/d0;)V", "Lb/a/a/h/u;", "onMapsEvent", "(Lb/a/a/h/u;)V", "Lb/a/a/h/b;", "onAddToCalendarEvent", "(Lb/a/a/h/b;)V", "Lb/a/a/h/b0;", "onOpenUrlEvent", "(Lb/a/a/h/b0;)V", "Lb/a/a/h/u0;", "onUpdateEvent", "(Lb/a/a/h/u0;)V", "Lb/a/a/h/w;", "onNewJsonEvent", "(Lb/a/a/h/w;)V", "Lb/a/a/h/q;", "onIntroCloseEvent", "(Lb/a/a/h/q;)V", "Lb/a/a/h/r;", "onLoginWithProviderEvent", "(Lb/a/a/h/r;)V", "Lb/a/a/h/j0;", "onResetPasswordEvent", "(Lb/a/a/h/j0;)V", "Lb/a/a/h/s;", "logout", "onLogoutEvent", "(Lb/a/a/h/s;)V", "Lb/a/a/h/l;", "onFirebaseLogoutEvent", "(Lb/a/a/h/l;)V", "Lb/a/a/h/r0;", "onTokenExpiredEvent", "(Lb/a/a/h/r0;)V", "Lb/a/a/h/h0;", "onPushDialogEvent", "(Lb/a/a/h/h0;)V", "Lb/a/a/h/z;", "onOpenIntroEvent", "(Lb/a/a/h/z;)V", "Lb/a/a/h/n;", "onGoBackEvent", "(Lb/a/a/h/n;)V", "Lb/a/a/h/g0;", "onPreviewAppEvent", "(Lb/a/a/h/g0;)V", "Lb/a/a/h/m0;", "onShowEmulatorAppListEvent", "(Lb/a/a/h/m0;)V", "Lb/a/a/h/o0;", "onSubmitEvent", "(Lb/a/a/h/o0;)V", "Lb/a/a/h/i0;", "onRemoteActionEvent", "(Lb/a/a/h/i0;)V", "Lb/a/a/h/e;", "onCloseEvent", "(Lb/a/a/h/e;)V", "Lb/a/a/h/f0;", "onPlayEvent", "(Lb/a/a/h/f0;)V", "Lb/a/a/h/m;", "onFirebaseRegisterEvent", "(Lb/a/a/h/m;)V", "Lb/a/a/h/s0;", "onTripleTapEvent", "(Lb/a/a/h/s0;)V", "Lcom/appfoundry/previewer/model/BackendResponse;", "backendResponse", "Landroid/widget/RelativeLayout;", "progressBar", "loadingFragment", "w", "(Lcom/appfoundry/previewer/model/BackendResponse;Landroid/widget/RelativeLayout;Landroidx/fragment/app/Fragment;)V", "Lb/a/a/h/c0;", "onPauseEvent", "(Lb/a/a/h/c0;)V", "Lb/a/a/h/y;", "onOpenAudioEvent", "(Lb/a/a/h/y;)V", "Lb/a/a/h/p;", "onInputImageEvent", "(Lb/a/a/h/p;)V", "Lb/a/a/h/o;", "onInputFileEvent", "(Lb/a/a/h/o;)V", "Landroid/view/MotionEvent;", "", "dispatchTouchEvent", "(Landroid/view/MotionEvent;)Z", "show", "y", "(ZLandroidx/fragment/app/Fragment;Landroid/widget/RelativeLayout;)V", "Landroid/content/res/Configuration;", "newConfig", "onConfigurationChanged", "(Landroid/content/res/Configuration;)V", "path", "Landroid/graphics/Bitmap;", "u", "(Ljava/lang/String;)Landroid/graphics/Bitmap;", "pageId", "triggerUrl", "G", "(Ljava/lang/String;Ljava/lang/String;)V", "v", "p", "provider", "x", "(Ljava/lang/String;)V", "o", "F", "()Z", "C", "h", "g", "action", "r", "Lcom/appfoundry/previewer/model/FirebaseConfigJson;", "firebaseConfigJson", "E", "(Lcom/appfoundry/previewer/model/FirebaseConfigJson;)V", "Lb/a/a/j/e;", "emailInput", "passwordInput", "z", "(Lb/a/a/j/e;Lb/a/a/j/e;Landroid/widget/RelativeLayout;)V", "firebaseIdToken", "t", "(Ljava/lang/String;Landroid/widget/RelativeLayout;)V", "A", "D", "(Lb/a/a/j/e;Landroid/widget/RelativeLayout;)V", "B", "", "j", "actionDownX", "k", "Z", "scrollingGesture", "Lb/l/a/d/a/a/b;", "m", "Ld/f;", "s", "()Lb/l/a/d/a/a/b;", "appUpdateManager", "Landroidx/drawerlayout/widget/DrawerLayout;", "Landroidx/drawerlayout/widget/DrawerLayout;", "drawerMenu", "l", "showDownloading", "i", "actionDownY", "", "J", "actionDownTime", "Lb/l/a/d/a/d/b;", "n", "getAppUpdatedListener", "()Lb/l/a/d/a/d/b;", "appUpdatedListener", "<init>", "app_debug"}, mo24463k = 1, mo24464mv = {1, 4, 2})
public class BravoActivity extends AppCompatActivity {

    /* renamed from: o */
    public static final /* synthetic */ int f10754o = 0;

    /* renamed from: g */
    public DrawerLayout f10755g;

    /* renamed from: h */
    public long f10756h;

    /* renamed from: i */
    public float f10757i;

    /* renamed from: j */
    public float f10758j;

    /* renamed from: k */
    public boolean f10759k;

    /* renamed from: l */
    public boolean f10760l = true;

    /* renamed from: m */
    public final C6764f f10761m = C5266a.m9890U2(new C5408b(this));

    /* renamed from: n */
    public final C6764f f10762n = C5266a.m9890U2(new C5409c(this));

    /* renamed from: com.appfoundry.previewer.activities.BravoActivity$a */
    /* compiled from: java-style lambda group */
    public static final class C5407a implements Runnable {

        /* renamed from: g */
        public final /* synthetic */ int f10763g;

        /* renamed from: h */
        public final /* synthetic */ Object f10764h;

        public C5407a(int i, Object obj) {
            this.f10763g = i;
            this.f10764h = obj;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:8:0x0028, code lost:
            r3 = (p005b.p006a.p007a.p008a.C0605h) r2;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
                r5 = this;
                int r0 = r5.f10763g
                if (r0 == 0) goto L_0x0050
                r1 = 1
                if (r0 != r1) goto L_0x004e
                java.lang.Object r0 = r5.f10764h
                com.appfoundry.previewer.activities.BravoActivity r0 = (com.appfoundry.previewer.activities.BravoActivity) r0
                java.lang.String r2 = "$this$refreshLastFragment"
                p298d.p344x.p346c.C6888i.m12438e(r0, r2)
                com.appfoundry.previewer.BravoApp$b r2 = com.appfoundry.previewer.BravoApp.f10730N
                java.util.List<java.lang.String> r2 = com.appfoundry.previewer.BravoApp.f10733i
                java.lang.Object r2 = p298d.p334t.C6790h.m12371y(r2)
                java.lang.String r2 = (java.lang.String) r2
                androidx.fragment.app.FragmentManager r3 = r0.getSupportFragmentManager()
                androidx.fragment.app.Fragment r2 = r3.findFragmentByTag(r2)
                if (r2 == 0) goto L_0x004d
                boolean r3 = r2 instanceof p005b.p006a.p007a.p008a.C0605h
                if (r3 == 0) goto L_0x003a
                r3 = r2
                b.a.a.a.h r3 = (p005b.p006a.p007a.p008a.C0605h) r3
                com.appfoundry.previewer.model.Page r4 = r3.f210g
                if (r4 == 0) goto L_0x003a
                boolean r4 = p005b.p006a.p007a.p018i.C0744e.m188A(r4)
                if (r4 != r1) goto L_0x003a
                r0 = 0
                p005b.p006a.p007a.p008a.C0605h.m73d(r3, r0, r1, r1)
                goto L_0x004d
            L_0x003a:
                androidx.fragment.app.FragmentManager r0 = r0.getSupportFragmentManager()
                androidx.fragment.app.FragmentTransaction r0 = r0.beginTransaction()
                androidx.fragment.app.FragmentTransaction r0 = r0.detach(r2)
                androidx.fragment.app.FragmentTransaction r0 = r0.attach(r2)
                r0.commit()
            L_0x004d:
                return
            L_0x004e:
                r0 = 0
                throw r0
            L_0x0050:
                java.lang.Object r0 = r5.f10764h
                com.appfoundry.previewer.activities.BravoActivity r0 = (com.appfoundry.previewer.activities.BravoActivity) r0
                r0.onBackPressed()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.appfoundry.previewer.activities.BravoActivity.C5407a.run():void");
        }
    }

    /* renamed from: com.appfoundry.previewer.activities.BravoActivity$b */
    public static final class C5408b extends C6890k implements C6851a<C3449b> {

        /* renamed from: g */
        public final /* synthetic */ BravoActivity f10765g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5408b(BravoActivity bravoActivity) {
            super(0);
            this.f10765g = bravoActivity;
        }

        public Object invoke() {
            C3469v vVar;
            Context context = this.f10765g;
            synchronized (C3468u.class) {
                if (C3468u.f6289a == null) {
                    Context applicationContext = context.getApplicationContext();
                    if (applicationContext != null) {
                        context = applicationContext;
                    }
                    C3454g gVar = new C3454g(context);
                    C1960d.m2790e0(gVar, C3454g.class);
                    C3468u.f6289a = new C3469v(gVar);
                }
                vVar = C3468u.f6289a;
            }
            C3449b a = vVar.f6295f.mo14735a();
            C6888i.m12437d(a, "AppUpdateManagerFactory.create(this)");
            return a;
        }
    }

    /* renamed from: com.appfoundry.previewer.activities.BravoActivity$c */
    public static final class C5409c extends C6890k implements C6851a<C0664a> {

        /* renamed from: g */
        public final /* synthetic */ BravoActivity f10766g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5409c(BravoActivity bravoActivity) {
            super(0);
            this.f10766g = bravoActivity;
        }

        public Object invoke() {
            return new C0664a(this);
        }
    }

    /* renamed from: com.appfoundry.previewer.activities.BravoActivity$d */
    public static final class C5410d implements Runnable {

        /* renamed from: g */
        public final /* synthetic */ TextView f10767g;

        public C5410d(TextView textView) {
            this.f10767g = textView;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:4:0x000a, code lost:
            r1 = r1.f544c;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r3 = this;
                android.widget.TextView r0 = r3.f10767g
                if (r0 == 0) goto L_0x001b
                com.appfoundry.previewer.BravoApp$b r1 = com.appfoundry.previewer.BravoApp.f10730N
                b.a.a.j.h r1 = com.appfoundry.previewer.BravoApp.f10720D
                if (r1 == 0) goto L_0x0017
                android.media.MediaPlayer r1 = r1.f544c
                if (r1 == 0) goto L_0x0017
                int r1 = r1.getCurrentPosition()
                java.lang.String r1 = p005b.p038f.p039a.C0849e.m520h0(r1)
                goto L_0x0018
            L_0x0017:
                r1 = 0
            L_0x0018:
                r0.setText(r1)
            L_0x001b:
                com.appfoundry.previewer.BravoApp$b r0 = com.appfoundry.previewer.BravoApp.f10730N
                b.a.a.j.h r0 = com.appfoundry.previewer.BravoApp.f10720D
                if (r0 == 0) goto L_0x002a
                android.os.Handler r0 = r0.f545d
                if (r0 == 0) goto L_0x002a
                r1 = 1000(0x3e8, double:4.94E-321)
                r0.postDelayed(r3, r1)
            L_0x002a:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.appfoundry.previewer.activities.BravoActivity.C5410d.run():void");
        }
    }

    @C6840e(mo24177c = "com.appfoundry.previewer.activities.BravoActivity$exchangeSecretsWithBackend$1", mo24178f = "BravoActivity.kt", mo24179l = {1474, 1477}, mo24180m = "invokeSuspend")
    /* renamed from: com.appfoundry.previewer.activities.BravoActivity$e */
    public static final class C5411e extends C6844h implements C6866p<C7821y, C6824d<? super C6777r>, Object> {

        /* renamed from: k */
        public Object f10768k;

        /* renamed from: l */
        public Object f10769l;

        /* renamed from: m */
        public int f10770m;

        /* renamed from: n */
        public final /* synthetic */ BravoActivity f10771n;

        /* renamed from: o */
        public final /* synthetic */ String f10772o;

        /* renamed from: p */
        public final /* synthetic */ String f10773p;

        /* renamed from: q */
        public final /* synthetic */ RelativeLayout f10774q;

        /* renamed from: com.appfoundry.previewer.activities.BravoActivity$e$a */
        public static final class C5412a implements Runnable {

            /* renamed from: g */
            public final /* synthetic */ C5411e f10775g;

            public C5412a(C5411e eVar) {
                this.f10775g = eVar;
            }

            public final void run() {
                RelativeLayout relativeLayout = this.f10775g.f10774q;
                if (relativeLayout != null) {
                    C0758q.m240e(relativeLayout);
                }
            }
        }

        @C6840e(mo24177c = "com.appfoundry.previewer.activities.BravoActivity$exchangeSecretsWithBackend$1$authInfo$1", mo24178f = "BravoActivity.kt", mo24179l = {}, mo24180m = "invokeSuspend")
        /* renamed from: com.appfoundry.previewer.activities.BravoActivity$e$b */
        public static final class C5413b extends C6844h implements C6866p<C7821y, C6824d<? super AuthInfoFromBackend>, Object> {

            /* renamed from: k */
            public final /* synthetic */ C6901v f10776k;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C5413b(C6901v vVar, C6824d dVar) {
                super(2, dVar);
                this.f10776k = vVar;
            }

            /* renamed from: b */
            public final C6824d<C6777r> mo10325b(Object obj, C6824d<?> dVar) {
                C6888i.m12438e(dVar, "completion");
                return new C5413b(this.f10776k, dVar);
            }

            /* renamed from: e */
            public final Object mo10326e(Object obj) {
                C5266a.m10018q4(obj);
                try {
                    C0816e eVar = C0816e.f639l;
                    C5075l<AuthInfoFromBackend> lVar = C0816e.f631d;
                    String str = ((ExchangeResponse) this.f10776k.f13801g).f10994b;
                    if (str == null) {
                        str = "";
                    }
                    return lVar.mo16830b(str);
                } catch (Exception e) {
                    C8091a.f16272d.mo26044b("Exception parsing secrets with backend: %s", e.toString());
                    return null;
                }
            }

            public final Object invoke(Object obj, Object obj2) {
                C6824d dVar = (C6824d) obj2;
                C6888i.m12438e(dVar, "completion");
                C6901v vVar = this.f10776k;
                dVar.getContext();
                C5266a.m10018q4(C6777r.f13694a);
                try {
                    C0816e eVar = C0816e.f639l;
                    C5075l<AuthInfoFromBackend> lVar = C0816e.f631d;
                    String str = ((ExchangeResponse) vVar.f13801g).f10994b;
                    if (str == null) {
                        str = "";
                    }
                    return lVar.mo16830b(str);
                } catch (Exception e) {
                    C8091a.f16272d.mo26044b("Exception parsing secrets with backend: %s", e.toString());
                    return null;
                }
            }
        }

        @C6840e(mo24177c = "com.appfoundry.previewer.activities.BravoActivity$exchangeSecretsWithBackend$1$exchangeResponse$1", mo24178f = "BravoActivity.kt", mo24179l = {}, mo24180m = "invokeSuspend")
        /* renamed from: com.appfoundry.previewer.activities.BravoActivity$e$c */
        public static final class C5414c extends C6844h implements C6866p<C7821y, C6824d<? super ExchangeResponse>, Object> {
            public C5414c(C6824d dVar) {
                super(2, dVar);
            }

            /* renamed from: b */
            public final C6824d<C6777r> mo10325b(Object obj, C6824d<?> dVar) {
                C6888i.m12438e(dVar, "completion");
                return new C5414c(dVar);
            }

            /* renamed from: e */
            public final Object mo10326e(Object obj) {
                C5266a.m10018q4(obj);
                return C0849e.m478F();
            }

            public final Object invoke(Object obj, Object obj2) {
                C6824d dVar = (C6824d) obj2;
                C6888i.m12438e(dVar, "completion");
                dVar.getContext();
                C5266a.m10018q4(C6777r.f13694a);
                return C0849e.m478F();
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5411e(BravoActivity bravoActivity, String str, String str2, RelativeLayout relativeLayout, C6824d dVar) {
            super(2, dVar);
            this.f10771n = bravoActivity;
            this.f10772o = str;
            this.f10773p = str2;
            this.f10774q = relativeLayout;
        }

        /* renamed from: b */
        public final C6824d<C6777r> mo10325b(Object obj, C6824d<?> dVar) {
            C6888i.m12438e(dVar, "completion");
            return new C5411e(this.f10771n, this.f10772o, this.f10773p, this.f10774q, dVar);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:69:0x0147, code lost:
            if (r6 == null) goto L_0x01fe;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:71:0x0153, code lost:
            if (r6 != null) goto L_0x0155;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:72:0x0155, code lost:
            p005b.p006a.p007a.p018i.C0758q.m240e(r6);
         */
        /* JADX WARNING: Removed duplicated region for block: B:19:0x0076  */
        /* JADX WARNING: Removed duplicated region for block: B:20:0x0079  */
        /* JADX WARNING: Removed duplicated region for block: B:23:0x0082  */
        /* JADX WARNING: Removed duplicated region for block: B:94:0x01a1  */
        /* renamed from: e */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object mo10326e(T r14) {
            /*
                r13 = this;
                d.v.i.a r0 = p298d.p337v.p338i.C6833a.COROUTINE_SUSPENDED
                int r1 = r13.f10770m
                r2 = 2
                r3 = 0
                r4 = 1
                r5 = 0
                if (r1 == 0) goto L_0x0026
                if (r1 == r4) goto L_0x001a
                if (r1 != r2) goto L_0x0012
                p005b.p291q.p292a.C5266a.m10018q4(r14)
                goto L_0x0072
            L_0x0012:
                java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r14.<init>(r0)
                throw r14
            L_0x001a:
                java.lang.Object r1 = r13.f10769l
                d.x.c.v r1 = (p298d.p344x.p346c.C6901v) r1
                java.lang.Object r6 = r13.f10768k
                d.x.c.v r6 = (p298d.p344x.p346c.C6901v) r6
                p005b.p291q.p292a.C5266a.m10018q4(r14)
                goto L_0x0043
            L_0x0026:
                p005b.p291q.p292a.C5266a.m10018q4(r14)
                d.x.c.v r1 = new d.x.c.v
                r1.<init>()
                l.a.w r14 = p416l.p417a.C7725h0.f15274b
                com.appfoundry.previewer.activities.BravoActivity$e$c r6 = new com.appfoundry.previewer.activities.BravoActivity$e$c
                r6.<init>(r5)
                r13.f10768k = r1
                r13.f10769l = r1
                r13.f10770m = r4
                java.lang.Object r14 = p005b.p291q.p292a.C5266a.m9853N4(r14, r6, r13)
                if (r14 != r0) goto L_0x0042
                return r0
            L_0x0042:
                r6 = r1
            L_0x0043:
                com.appfoundry.previewer.model.ExchangeResponse r14 = (com.appfoundry.previewer.model.ExchangeResponse) r14
                r1.f13801g = r14
                T r14 = r6.f13801g
                com.appfoundry.previewer.model.ExchangeResponse r14 = (com.appfoundry.previewer.model.ExchangeResponse) r14
                int r1 = r14.f10993a
                r7 = 200(0xc8, float:2.8E-43)
                if (r1 != r7) goto L_0x01e8
                java.lang.Object[] r1 = new java.lang.Object[r4]
                java.lang.String r14 = r14.f10994b
                r1[r3] = r14
                p.a.a$b r14 = p441p.p442a.C8091a.f16272d
                java.lang.String r7 = "Exchange JSON = %s"
                r14.mo26043a(r7, r1)
                l.a.w r14 = p416l.p417a.C7725h0.f15274b
                com.appfoundry.previewer.activities.BravoActivity$e$b r1 = new com.appfoundry.previewer.activities.BravoActivity$e$b
                r1.<init>(r6, r5)
                r13.f10768k = r5
                r13.f10769l = r5
                r13.f10770m = r2
                java.lang.Object r14 = p005b.p291q.p292a.C5266a.m9853N4(r14, r1, r13)
                if (r14 != r0) goto L_0x0072
                return r0
            L_0x0072:
                com.appfoundry.previewer.model.AuthInfoFromBackend r14 = (com.appfoundry.previewer.model.AuthInfoFromBackend) r14
                if (r14 == 0) goto L_0x0079
                java.lang.String r0 = r14.f10903b
                goto L_0x007a
            L_0x0079:
                r0 = r5
            L_0x007a:
                java.lang.String r1 = "firebase"
                boolean r0 = p298d.p344x.p346c.C6888i.m12434a(r0, r1)
                if (r0 == 0) goto L_0x01a1
                com.appfoundry.previewer.activities.BravoActivity r0 = r13.f10771n
                java.lang.String r1 = r13.f10772o
                java.lang.String r2 = r13.f10773p
                android.widget.RelativeLayout r6 = r13.f10774q
                int r7 = com.appfoundry.previewer.activities.BravoActivity.f10754o
                java.util.Objects.requireNonNull(r0)
                if (r2 == 0) goto L_0x0192
                b.a.a.n.d r7 = p005b.p006a.p007a.p023n.C0812d.f622f
                java.util.Map<java.lang.String, java.util.List<b.a.a.j.e>> r8 = p005b.p006a.p007a.p023n.C0812d.f617a
                java.lang.Object r2 = r8.get(r2)
                java.util.List r2 = (java.util.List) r2
                if (r2 == 0) goto L_0x01fe
                java.lang.String r8 = "component:input-email"
                b.a.a.j.e r8 = r7.mo10639e(r2, r8)
                java.lang.String r9 = "component:input-password"
                b.a.a.j.e r2 = r7.mo10639e(r2, r9)
                java.lang.String r9 = "firebase-email-password"
                boolean r10 = p298d.p344x.p346c.C6888i.m12434a(r1, r9)
                java.lang.String r11 = "register:firebase-email-password"
                if (r10 != 0) goto L_0x00c5
                java.lang.String r10 = "action:"
                boolean r10 = p298d.p344x.p346c.C6888i.m12434a(r10, r11)
                if (r10 == 0) goto L_0x00bc
                goto L_0x00c5
            L_0x00bc:
                if (r8 == 0) goto L_0x00d6
                boolean r7 = r7.mo10642h(r8)
                if (r7 != r4) goto L_0x00d6
                goto L_0x00d7
            L_0x00c5:
                if (r8 == 0) goto L_0x00d6
                boolean r10 = r7.mo10642h(r8)
                if (r10 != r4) goto L_0x00d6
                if (r2 == 0) goto L_0x00d6
                boolean r7 = r7.mo10642h(r2)
                if (r7 != r4) goto L_0x00d6
                goto L_0x00d7
            L_0x00d6:
                r4 = r3
            L_0x00d7:
                if (r4 == 0) goto L_0x018a
                com.appfoundry.previewer.BravoApp$b r4 = com.appfoundry.previewer.BravoApp.f10730N
                com.google.firebase.auth.FirebaseAuth r4 = com.appfoundry.previewer.BravoApp.f10718B
                java.lang.String r7 = "reset-password"
                r10 = -96312741(0xfffffffffa42625b, float:-2.5232512E35)
                r12 = -346707623(0xffffffffeb55a959, float:-2.5830092E26)
                if (r4 != 0) goto L_0x015a
                boolean r4 = p005b.p006a.p007a.p024o.C0820c.m302b()
                if (r4 == 0) goto L_0x00f6
                if (r14 == 0) goto L_0x00fe
                com.appfoundry.previewer.model.AuthSettings r14 = r14.f10905d
                if (r14 == 0) goto L_0x00fe
                java.lang.String r5 = r14.f10914i
                goto L_0x00fe
            L_0x00f6:
                if (r14 == 0) goto L_0x00fe
                com.appfoundry.previewer.model.AuthSettings r14 = r14.f10905d
                if (r14 == 0) goto L_0x00fe
                java.lang.String r5 = r14.f10913h
            L_0x00fe:
                if (r5 == 0) goto L_0x014a
                b.a.a.n.e r14 = p005b.p006a.p007a.p023n.C0816e.f639l     // Catch:{ Exception -> 0x0135 }
                b.p.a.l<com.appfoundry.previewer.model.FirebaseConfigJson> r14 = p005b.p006a.p007a.p023n.C0816e.f638k     // Catch:{ Exception -> 0x0135 }
                java.lang.String r4 = p005b.p006a.p007a.p018i.C0756o.m223a(r5)     // Catch:{ Exception -> 0x0135 }
                java.lang.Object r14 = r14.mo16830b(r4)     // Catch:{ Exception -> 0x0135 }
                com.appfoundry.previewer.model.FirebaseConfigJson r14 = (com.appfoundry.previewer.model.FirebaseConfigJson) r14     // Catch:{ Exception -> 0x0135 }
                r0.mo18373E(r14)     // Catch:{ Exception -> 0x0135 }
                int r14 = r1.hashCode()     // Catch:{ Exception -> 0x0135 }
                if (r14 == r12) goto L_0x0125
                if (r14 == r10) goto L_0x011a
                goto L_0x0130
            L_0x011a:
                boolean r14 = r1.equals(r11)     // Catch:{ Exception -> 0x0135 }
                if (r14 == 0) goto L_0x0130
                r0.mo18369A(r8, r2, r6)     // Catch:{ Exception -> 0x0135 }
                goto L_0x01fe
            L_0x0125:
                boolean r14 = r1.equals(r7)     // Catch:{ Exception -> 0x0135 }
                if (r14 == 0) goto L_0x0130
                r0.mo18372D(r8, r6)     // Catch:{ Exception -> 0x0135 }
                goto L_0x01fe
            L_0x0130:
                r0.mo18427z(r8, r2, r6)     // Catch:{ Exception -> 0x0135 }
                goto L_0x01fe
            L_0x0135:
                r14 = move-exception
                java.lang.Object[] r1 = new java.lang.Object[r3]
                p.a.a$b r2 = p441p.p442a.C8091a.f16272d
                java.lang.String r4 = "Error parsing google-services.json"
                r2.mo26044b(r4, r1)
                java.lang.String r14 = r14.getLocalizedMessage()
                r1 = 4
                p005b.p038f.p039a.C0849e.m483H0(r0, r4, r14, r3, r1)
                if (r6 == 0) goto L_0x01fe
                goto L_0x0155
            L_0x014a:
                java.lang.String r14 = "Missing json config file"
                android.widget.Toast r14 = android.widget.Toast.makeText(r0, r14, r3)
                r14.show()
                if (r6 == 0) goto L_0x01fe
            L_0x0155:
                p005b.p006a.p007a.p018i.C0758q.m240e(r6)
                goto L_0x01fe
            L_0x015a:
                int r14 = r1.hashCode()
                if (r14 == r12) goto L_0x017f
                if (r14 == r10) goto L_0x0174
                r3 = 108318258(0x674ce32, float:4.6042788E-35)
                if (r14 == r3) goto L_0x0169
                goto L_0x01fe
            L_0x0169:
                boolean r14 = r1.equals(r9)
                if (r14 == 0) goto L_0x01fe
                r0.mo18427z(r8, r2, r6)
                goto L_0x01fe
            L_0x0174:
                boolean r14 = r1.equals(r11)
                if (r14 == 0) goto L_0x01fe
                r0.mo18369A(r8, r2, r6)
                goto L_0x01fe
            L_0x017f:
                boolean r14 = r1.equals(r7)
                if (r14 == 0) goto L_0x01fe
                r0.mo18372D(r8, r6)
                goto L_0x01fe
            L_0x018a:
                if (r6 == 0) goto L_0x018f
                p005b.p006a.p007a.p018i.C0758q.m240e(r6)
            L_0x018f:
                java.lang.String r14 = "Missing email and/or password inputs"
                goto L_0x0199
            L_0x0192:
                if (r6 == 0) goto L_0x0197
                p005b.p006a.p007a.p018i.C0758q.m240e(r6)
            L_0x0197:
                java.lang.String r14 = "PageId is null"
            L_0x0199:
                android.widget.Toast r14 = android.widget.Toast.makeText(r0, r14, r3)
                r14.show()
                goto L_0x01fe
            L_0x01a1:
                com.appfoundry.previewer.activities.BravoActivity r0 = r13.f10771n
                android.widget.RelativeLayout r1 = r13.f10774q
                int r2 = com.appfoundry.previewer.activities.BravoActivity.f10754o
                b.a.a.l.b r2 = new b.a.a.l.b
                androidx.fragment.app.FragmentManager r8 = r0.getSupportFragmentManager()
                java.lang.String r4 = "supportFragmentManager"
                p298d.p344x.p346c.C6888i.m12437d(r8, r4)
                if (r14 == 0) goto L_0x01b8
                com.appfoundry.previewer.model.AuthSettings r14 = r14.f10905d
                r9 = r14
                goto L_0x01b9
            L_0x01b8:
                r9 = r5
            L_0x01b9:
                r10 = 0
                r11 = 8
                r6 = r2
                r7 = r0
                r6.<init>(r7, r8, r9, r10, r11)
                com.appfoundry.previewer.BravoApp$b r14 = com.appfoundry.previewer.BravoApp.f10730N
                com.appfoundry.previewer.BravoApp.f10717A = r2
                androidx.loader.app.LoaderManager r14 = androidx.loader.app.LoaderManager.getInstance(r0)
                java.lang.String r4 = "LoaderManager.getInstance(this@BravoActivity)"
                p298d.p344x.p346c.C6888i.m12437d(r14, r4)
                java.lang.String r4 = "loaderManager"
                p298d.p344x.p346c.C6888i.m12438e(r14, r4)
                androidx.loader.content.Loader r4 = r14.getLoader(r3)
                if (r4 != 0) goto L_0x01dd
                r14.initLoader(r3, r5, r2)
                goto L_0x01e0
            L_0x01dd:
                r14.restartLoader(r3, r5, r2)
            L_0x01e0:
                b.a.a.e.h r14 = new b.a.a.e.h
                r14.<init>(r0, r1)
                r2.f566c = r14
                goto L_0x01fe
            L_0x01e8:
                com.appfoundry.previewer.activities.BravoActivity r14 = r13.f10771n
                com.appfoundry.previewer.activities.BravoActivity$e$a r0 = new com.appfoundry.previewer.activities.BravoActivity$e$a
                r0.<init>(r13)
                r14.runOnUiThread(r0)
                com.appfoundry.previewer.activities.BravoActivity r14 = r13.f10771n
                T r0 = r6.f13801g
                com.appfoundry.previewer.model.ExchangeResponse r0 = (com.appfoundry.previewer.model.ExchangeResponse) r0
                java.lang.String r0 = r0.f10994b
                r1 = 6
                p005b.p038f.p039a.C0849e.m483H0(r14, r0, r5, r3, r1)
            L_0x01fe:
                d.r r14 = p298d.C6777r.f13694a
                return r14
            */
            throw new UnsupportedOperationException("Method not decompiled: com.appfoundry.previewer.activities.BravoActivity.C5411e.mo10326e(java.lang.Object):java.lang.Object");
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((C5411e) mo10325b(obj, (C6824d) obj2)).mo10326e(C6777r.f13694a);
        }
    }

    /* renamed from: com.appfoundry.previewer.activities.BravoActivity$f */
    public static final class C5415f implements Runnable {

        /* renamed from: g */
        public final /* synthetic */ BravoActivity f10777g;

        /* renamed from: h */
        public final /* synthetic */ BackendResponse f10778h;

        public C5415f(BravoActivity bravoActivity, BackendResponse backendResponse) {
            this.f10777g = bravoActivity;
            this.f10778h = backendResponse;
        }

        public final void run() {
            String str;
            BravoActivity bravoActivity = this.f10777g;
            Params params = this.f10778h.f10916b;
            if (params == null || (str = params.f11073m) == null) {
                str = "Form sent successfully";
            }
            C0849e.m471B0(bravoActivity, str);
        }
    }

    /* renamed from: com.appfoundry.previewer.activities.BravoActivity$g */
    public static final class C5416g implements Runnable {

        /* renamed from: g */
        public final /* synthetic */ BravoActivity f10779g;

        /* renamed from: h */
        public final /* synthetic */ Fragment f10780h;

        /* renamed from: i */
        public final /* synthetic */ RelativeLayout f10781i;

        /* renamed from: com.appfoundry.previewer.activities.BravoActivity$g$a */
        public static final class C5417a implements Runnable {

            /* renamed from: g */
            public final /* synthetic */ C5416g f10782g;

            public C5417a(C5416g gVar) {
                this.f10782g = gVar;
            }

            public final void run() {
                C5416g gVar = this.f10782g;
                gVar.f10779g.mo18426y(false, gVar.f10780h, gVar.f10781i);
            }
        }

        public C5416g(BravoActivity bravoActivity, Fragment fragment, RelativeLayout relativeLayout) {
            this.f10779g = bravoActivity;
            this.f10780h = fragment;
            this.f10781i = relativeLayout;
        }

        public final void run() {
            new Handler().postDelayed(new C5417a(this), 400);
        }
    }

    /* renamed from: com.appfoundry.previewer.activities.BravoActivity$h */
    public static final class C5418h implements C0869a<C0921a, C0860b> {

        /* renamed from: a */
        public final /* synthetic */ BravoActivity f10783a;

        /* renamed from: b */
        public final /* synthetic */ C0866h f10784b;

        /* renamed from: c */
        public final /* synthetic */ RelativeLayout f10785c;

        public C5418h(BravoActivity bravoActivity, C0866h hVar, RelativeLayout relativeLayout) {
            this.f10783a = bravoActivity;
            this.f10784b = hVar;
            this.f10785c = relativeLayout;
        }

        /* renamed from: a */
        public void mo10712a(Object obj) {
            BravoActivity.m10140b(this.f10783a, this.f10784b, (C0921a) obj, this.f10785c);
        }

        /* renamed from: b */
        public void mo10713b(C0851b bVar) {
            C0860b bVar2 = (C0860b) bVar;
            BravoActivity.m10139a(this.f10783a, this.f10785c);
        }
    }

    /* renamed from: com.appfoundry.previewer.activities.BravoActivity$i */
    public static final class C5419i implements C0882d {

        /* renamed from: a */
        public final /* synthetic */ BravoActivity f10786a;

        /* renamed from: b */
        public final /* synthetic */ RelativeLayout f10787b;

        /* renamed from: c */
        public final /* synthetic */ C0866h f10788c;

        public C5419i(BravoActivity bravoActivity, RelativeLayout relativeLayout, C0866h hVar) {
            this.f10786a = bravoActivity;
            this.f10787b = relativeLayout;
            this.f10788c = hVar;
        }

        /* renamed from: a */
        public void mo10730a(@NonNull C0921a aVar) {
            C6888i.m12438e(aVar, "credentials");
            BravoActivity.m10140b(this.f10786a, this.f10788c, aVar, this.f10787b);
        }

        /* renamed from: b */
        public void mo10731b(C0856c cVar) {
            C6888i.m12438e(cVar, "exception");
            BravoActivity.m10139a(this.f10786a, this.f10787b);
        }
    }

    /* renamed from: com.appfoundry.previewer.activities.BravoActivity$j */
    public static final class C5420j<TResult> implements C3418c<Object> {

        /* renamed from: a */
        public final /* synthetic */ BravoActivity f10789a;

        /* renamed from: b */
        public final /* synthetic */ RelativeLayout f10790b;

        /* renamed from: com.appfoundry.previewer.activities.BravoActivity$j$a */
        public static final class C5421a implements Runnable {

            /* renamed from: g */
            public final /* synthetic */ C5420j f10791g;

            public C5421a(C5420j jVar) {
                this.f10791g = jVar;
            }

            public final void run() {
                RelativeLayout relativeLayout = this.f10791g.f10790b;
                if (relativeLayout != null) {
                    C0758q.m240e(relativeLayout);
                }
            }
        }

        public C5420j(BravoActivity bravoActivity, RelativeLayout relativeLayout) {
            this.f10789a = bravoActivity;
            this.f10790b = relativeLayout;
        }

        /* renamed from: c */
        public final void mo10462c(C3428h<Object> hVar) {
            C6888i.m12438e(hVar, "task");
            String str = null;
            if (hVar.mo14692n()) {
                BravoApp.C5403b bVar = BravoApp.f10730N;
                FirebaseAuth firebaseAuth = BravoApp.f10718B;
                C3922p pVar = firebaseAuth != null ? firebaseAuth.f11420f : null;
                Object[] objArr = new Object[1];
                if (pVar != null) {
                    str = pVar.mo15394V();
                }
                objArr[0] = str;
                C8091a.f16272d.mo26043a("User: %s", objArr);
                BravoActivity.m10141c(this.f10789a, pVar, this.f10790b);
                return;
            }
            this.f10789a.runOnUiThread(new C5421a(this));
            Object[] objArr2 = new Object[1];
            Exception i = hVar.mo14687i();
            objArr2[0] = i != null ? i.getLocalizedMessage() : null;
            C8091a.f16272d.mo26044b("createUserWithEmail:failure %s", objArr2);
            BravoActivity bravoActivity = this.f10789a;
            Exception i2 = hVar.mo14687i();
            if (i2 != null) {
                str = i2.getLocalizedMessage();
            }
            C0849e.m483H0(bravoActivity, "Login failed", str, 0, 4);
        }
    }

    /* renamed from: com.appfoundry.previewer.activities.BravoActivity$k */
    public static final class C5422k<TResult> implements C3418c<Object> {

        /* renamed from: a */
        public final /* synthetic */ BravoActivity f10792a;

        /* renamed from: b */
        public final /* synthetic */ RelativeLayout f10793b;

        /* renamed from: com.appfoundry.previewer.activities.BravoActivity$k$a */
        public static final class C5423a implements Runnable {

            /* renamed from: g */
            public final /* synthetic */ C5422k f10794g;

            public C5423a(C5422k kVar) {
                this.f10794g = kVar;
            }

            public final void run() {
                RelativeLayout relativeLayout = this.f10794g.f10793b;
                if (relativeLayout != null) {
                    C0758q.m240e(relativeLayout);
                }
            }
        }

        public C5422k(BravoActivity bravoActivity, RelativeLayout relativeLayout) {
            this.f10792a = bravoActivity;
            this.f10793b = relativeLayout;
        }

        /* renamed from: c */
        public final void mo10462c(C3428h<Object> hVar) {
            C6888i.m12438e(hVar, "task");
            String str = null;
            if (hVar.mo14692n()) {
                BravoApp.C5403b bVar = BravoApp.f10730N;
                FirebaseAuth firebaseAuth = BravoApp.f10718B;
                C3922p pVar = firebaseAuth != null ? firebaseAuth.f11420f : null;
                Object[] objArr = new Object[1];
                if (pVar != null) {
                    str = pVar.mo15394V();
                }
                objArr[0] = str;
                C8091a.f16272d.mo26043a("User: %s", objArr);
                BravoActivity.m10141c(this.f10792a, pVar, this.f10793b);
                return;
            }
            this.f10792a.runOnUiThread(new C5423a(this));
            Object[] objArr2 = new Object[1];
            Exception i = hVar.mo14687i();
            objArr2[0] = i != null ? i.getLocalizedMessage() : null;
            C8091a.f16272d.mo26044b("createUserWithEmail:failure %s", objArr2);
            BravoActivity bravoActivity = this.f10792a;
            Exception i2 = hVar.mo14687i();
            if (i2 != null) {
                str = i2.getLocalizedMessage();
            }
            C0849e.m483H0(bravoActivity, "Login failed", str, 0, 4);
        }
    }

    /* renamed from: com.appfoundry.previewer.activities.BravoActivity$l */
    public static final class C5424l implements PermissionListener {

        /* renamed from: a */
        public final /* synthetic */ BravoActivity f10795a;

        /* renamed from: b */
        public final /* synthetic */ C0703g f10796b;

        public C5424l(BravoActivity bravoActivity, C0703g gVar) {
            this.f10795a = bravoActivity;
            this.f10796b = gVar;
        }

        public void onPermissionDenied(PermissionDeniedResponse permissionDeniedResponse) {
            C8091a.f16272d.mo26044b("Permission denied for file download: %s", this.f10796b.f409a);
        }

        public void onPermissionGranted(PermissionGrantedResponse permissionGrantedResponse) {
            String str;
            BravoActivity bravoActivity = this.f10795a;
            String str2 = this.f10796b.f409a;
            int i = BravoActivity.f10754o;
            Objects.requireNonNull(bravoActivity);
            C6888i.m12438e(str2, "$this$getFilename");
            String substring = str2.substring(C0756o.m230h(str2, "/", 1, true) + 1);
            C6888i.m12437d(substring, "(this as java.lang.String).substring(startIndex)");
            C6888i.m12438e(substring, "$this$extension");
            String substring2 = substring.substring(C7694h.m13937o(substring, '.', 0, false, 6) + 1);
            C6888i.m12437d(substring2, "(this as java.lang.String).substring(startIndex)");
            C6888i.m12438e(substring2, "$this$isImage");
            if (C7694h.m13928f(substring2, "png", true) || C7694h.m13928f(substring2, "jpg", true) || C7694h.m13928f(substring2, "jpeg", true) || C7694h.m13928f(substring2, "gif", true)) {
                str = Environment.DIRECTORY_PICTURES;
            } else {
                C6888i.m12438e(substring2, "$this$isVideo");
                if (C7694h.m13928f(substring2, "mp4", true) || C7694h.m13928f(substring2, "3gp", true) || C7694h.m13928f(substring2, "mpeg", true) || C7694h.m13928f(substring2, "mov", true)) {
                    str = Environment.DIRECTORY_MOVIES;
                } else {
                    C6888i.m12438e(substring2, "$this$isDocument");
                    if (C7694h.m13928f(substring2, "pdf", true) || C7694h.m13928f(substring2, "txt", true) || C7694h.m13928f(substring2, "doc", true) || C7694h.m13928f(substring2, "docx", true) || C7694h.m13928f(substring2, "xls", true)) {
                        str = Environment.DIRECTORY_DOCUMENTS;
                    } else {
                        C6888i.m12438e(substring2, "$this$isAudio");
                        str = C7694h.m13928f(substring2, "mp3", true) || C7694h.m13928f(substring2, "wav", true) || C7694h.m13928f(substring2, "m4a", true) || C7694h.m13928f(substring2, "aac", true) || C7694h.m13928f(substring2, "ogg", true) ? Environment.DIRECTORY_MUSIC : Environment.DIRECTORY_DOWNLOADS;
                    }
                }
            }
            DownloadManager.Request request = new DownloadManager.Request(Uri.parse(str2));
            DownloadManager.Request title = request.setAllowedNetworkTypes(3).setAllowedOverRoaming(false).setTitle(substring);
            DownloadManager.Request notificationVisibility = title.setDescription("Downloading " + substring).setNotificationVisibility(1);
            notificationVisibility.setDestinationInExternalPublicDir(str, File.separator + substring).allowScanningByMediaScanner();
            Object systemService = bravoActivity.getSystemService("download");
            Objects.requireNonNull(systemService, "null cannot be cast to non-null type android.app.DownloadManager");
            ((DownloadManager) systemService).enqueue(request);
            Toast.makeText(bravoActivity, "Downloading " + substring, 0).show();
        }

        public void onPermissionRationaleShouldBeShown(PermissionRequest permissionRequest, PermissionToken permissionToken) {
        }
    }

    /* renamed from: com.appfoundry.previewer.activities.BravoActivity$m */
    public static final class C5425m extends C6890k implements C6862l<ImageProvider, C6777r> {

        /* renamed from: g */
        public static final C5425m f10797g = new C5425m();

        public C5425m() {
            super(1);
        }

        public Object invoke(Object obj) {
            ImageProvider imageProvider = (ImageProvider) obj;
            C6888i.m12438e(imageProvider, "imageProvider");
            C8091a.f16272d.mo26043a("Selected ImageProvider: %s", imageProvider.name());
            return C6777r.f13694a;
        }
    }

    /* renamed from: com.appfoundry.previewer.activities.BravoActivity$n */
    public static final class C5426n implements C0905u {

        /* renamed from: a */
        public final /* synthetic */ BravoActivity f10798a;

        /* renamed from: b */
        public final /* synthetic */ C0859a f10799b;

        public C5426n(BravoActivity bravoActivity, C0859a aVar) {
            this.f10798a = bravoActivity;
            this.f10799b = aVar;
        }

        /* renamed from: a */
        public void mo10712a(Object obj) {
            Void voidR = (Void) obj;
            C0859a aVar = this.f10799b;
            aVar.f721a.mo10709e("com.auth0.access_token");
            aVar.f721a.mo10709e("com.auth0.refresh_token");
            aVar.f721a.mo10709e("com.auth0.id_token");
            aVar.f721a.mo10709e("com.auth0.token_type");
            aVar.f721a.mo10709e("com.auth0.expires_at");
            aVar.f721a.mo10709e("com.auth0.scope");
            aVar.f721a.mo10709e("com.auth0.cache_expires_at");
            BravoActivity bravoActivity = this.f10798a;
            int i = BravoActivity.f10754o;
            bravoActivity.mo18371C();
        }

        /* renamed from: b */
        public void mo10713b(C0851b bVar) {
            C6888i.m12438e(bVar, "error");
            C8091a.f16272d.mo26044b("ERROR: onFailure dialog: %s", bVar.getLocalizedMessage());
        }
    }

    /* renamed from: com.appfoundry.previewer.activities.BravoActivity$o */
    public static final class C5427o implements Runnable {

        /* renamed from: g */
        public final /* synthetic */ BravoActivity f10800g;

        /* renamed from: h */
        public final /* synthetic */ C0733v f10801h;

        /* renamed from: com.appfoundry.previewer.activities.BravoActivity$o$a */
        public static final class C5428a implements Runnable {

            /* renamed from: g */
            public final /* synthetic */ Fragment f10802g;

            /* renamed from: h */
            public final /* synthetic */ C5427o f10803h;

            public C5428a(Fragment fragment, C5427o oVar, C6901v vVar) {
                this.f10802g = fragment;
                this.f10803h = oVar;
            }

            public final void run() {
                this.f10803h.f10800g.mo18426y(false, this.f10802g, (RelativeLayout) null);
            }
        }

        @C6840e(mo24177c = "com.appfoundry.previewer.activities.BravoActivity$onNavigationEvent$1$1", mo24178f = "BravoActivity.kt", mo24179l = {346}, mo24180m = "invokeSuspend")
        /* renamed from: com.appfoundry.previewer.activities.BravoActivity$o$b */
        public static final class C5429b extends C6844h implements C6866p<C7821y, C6824d<? super C6777r>, Object> {

            /* renamed from: k */
            public int f10804k;

            /* renamed from: l */
            public final /* synthetic */ C5427o f10805l;

            /* renamed from: m */
            public final /* synthetic */ C6901v f10806m;

            /* renamed from: n */
            public final /* synthetic */ RelativeLayout f10807n;

            /* renamed from: o */
            public final /* synthetic */ String f10808o;

            @C6840e(mo24177c = "com.appfoundry.previewer.activities.BravoActivity$onNavigationEvent$1$1$remoteResponse$1", mo24178f = "BravoActivity.kt", mo24179l = {}, mo24180m = "invokeSuspend")
            /* renamed from: com.appfoundry.previewer.activities.BravoActivity$o$b$a */
            public static final class C5430a extends C6844h implements C6866p<C7821y, C6824d<? super C0779j>, Object> {

                /* renamed from: k */
                public final /* synthetic */ C5429b f10809k;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C5430a(C5429b bVar, C6824d dVar) {
                    super(2, dVar);
                    this.f10809k = bVar;
                }

                /* renamed from: b */
                public final C6824d<C6777r> mo10325b(Object obj, C6824d<?> dVar) {
                    C6888i.m12438e(dVar, "completion");
                    return new C5430a(this.f10809k, dVar);
                }

                /* renamed from: e */
                public final Object mo10326e(Object obj) {
                    C5266a.m10018q4(obj);
                    return C0820c.m311k((Page) this.f10809k.f10806m.f13801g, false, 2);
                }

                public final Object invoke(Object obj, Object obj2) {
                    C6824d dVar = (C6824d) obj2;
                    C6888i.m12438e(dVar, "completion");
                    C5429b bVar = this.f10809k;
                    dVar.getContext();
                    C5266a.m10018q4(C6777r.f13694a);
                    return C0820c.m311k((Page) bVar.f10806m.f13801g, false, 2);
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C5429b(C5427o oVar, C6901v vVar, RelativeLayout relativeLayout, String str, C6824d dVar) {
                super(2, dVar);
                this.f10805l = oVar;
                this.f10806m = vVar;
                this.f10807n = relativeLayout;
                this.f10808o = str;
            }

            /* renamed from: b */
            public final C6824d<C6777r> mo10325b(Object obj, C6824d<?> dVar) {
                C6888i.m12438e(dVar, "completion");
                return new C5429b(this.f10805l, this.f10806m, this.f10807n, this.f10808o, dVar);
            }

            /* renamed from: e */
            public final Object mo10326e(Object obj) {
                C6833a aVar = C6833a.COROUTINE_SUSPENDED;
                int i = this.f10804k;
                T t = null;
                if (i == 0) {
                    C5266a.m10018q4(obj);
                    C7815w wVar = C7725h0.f15274b;
                    C5430a aVar2 = new C5430a(this, (C6824d) null);
                    this.f10804k = 1;
                    obj = C5266a.m9853N4(wVar, aVar2, this);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else if (i == 1) {
                    C5266a.m10018q4(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C0779j jVar = (C0779j) obj;
                RelativeLayout relativeLayout = this.f10807n;
                C6888i.m12437d(relativeLayout, "loading");
                C0758q.m240e(relativeLayout);
                C6901v vVar = this.f10806m;
                if (jVar != null) {
                    t = jVar.f549a;
                }
                vVar.f13801g = t;
                if (t != null) {
                    t.f11043k = this.f10808o;
                }
                BravoActivity.m10143e(this.f10805l.f10800g, t);
                return C6777r.f13694a;
            }

            public final Object invoke(Object obj, Object obj2) {
                return ((C5429b) mo10325b(obj, (C6824d) obj2)).mo10326e(C6777r.f13694a);
            }
        }

        public C5427o(BravoActivity bravoActivity, C0733v vVar) {
            this.f10800g = bravoActivity;
            this.f10801h = vVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:24:0x0066, code lost:
            if ((r0 != null ? r0.f11134K : null) == null) goto L_0x007b;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:30:0x0079, code lost:
            if (r0.f11038f == null) goto L_0x007b;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:8:0x002a, code lost:
            if (r0 != null) goto L_0x0031;
         */
        /* JADX WARNING: Removed duplicated region for block: B:34:0x0080  */
        /* JADX WARNING: Removed duplicated region for block: B:35:0x00bd  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
                r12 = this;
                b.a.a.h.v r0 = r12.f10801h
                java.lang.String r0 = r0.f443b
                p005b.p006a.p007a.p024o.C0823f.m377j0(r0)
                d.x.c.v r3 = new d.x.c.v
                r3.<init>()
                b.a.a.h.v r0 = r12.f10801h
                java.lang.String r1 = r0.f442a
                java.lang.String r0 = r0.f443b
                r2 = 0
                r4 = 1
                if (r0 == 0) goto L_0x002d
                boolean r5 = p005b.p006a.p007a.p018i.C0756o.m228f(r0)
                if (r5 != r4) goto L_0x002d
                com.appfoundry.previewer.BravoApp$b r5 = com.appfoundry.previewer.BravoApp.f10730N
                java.util.Map<java.lang.String, com.appfoundry.previewer.model.Page> r5 = com.appfoundry.previewer.BravoApp.f10739o
                if (r5 == 0) goto L_0x0029
                java.lang.Object r0 = r5.get(r0)
                com.appfoundry.previewer.model.Page r0 = (com.appfoundry.previewer.model.Page) r0
                goto L_0x002a
            L_0x0029:
                r0 = r2
            L_0x002a:
                if (r0 == 0) goto L_0x002d
                goto L_0x0031
            L_0x002d:
                com.appfoundry.previewer.model.Page r0 = p005b.p006a.p007a.p024o.C0823f.m339H(r1)
            L_0x0031:
                r3.f13801g = r0
                r1 = 0
                if (r0 == 0) goto L_0x00c5
                boolean r0 = p005b.p006a.p007a.p018i.C0744e.m221y(r0)
                if (r0 != r4) goto L_0x00c5
                T r0 = r3.f13801g
                com.appfoundry.previewer.model.Page r0 = (com.appfoundry.previewer.model.Page) r0
                java.lang.String r5 = "$this$shouldGetRemoteData"
                p298d.p344x.p346c.C6888i.m12438e(r0, r5)
                java.lang.Boolean r5 = p005b.p006a.p007a.p018i.C0744e.m220x(r0)
                java.lang.Boolean r6 = java.lang.Boolean.TRUE
                boolean r5 = p298d.p344x.p346c.C6888i.m12434a(r5, r6)
                if (r5 == 0) goto L_0x0069
                java.lang.String r5 = r0.f11043k
                if (r5 == 0) goto L_0x007c
                java.util.List<com.appfoundry.previewer.model.Container> r5 = r0.f11038f
                if (r5 != 0) goto L_0x007c
                java.lang.String r0 = r0.f11050r
                r5 = 2
                com.appfoundry.previewer.model.Style r0 = p005b.p006a.p007a.p024o.C0823f.m346O(r0, r2, r5)
                if (r0 == 0) goto L_0x0065
                java.lang.Integer r0 = r0.f11134K
                goto L_0x0066
            L_0x0065:
                r0 = r2
            L_0x0066:
                if (r0 != 0) goto L_0x007c
                goto L_0x007b
            L_0x0069:
                java.lang.Boolean r5 = p005b.p006a.p007a.p018i.C0744e.m222z(r0)
                boolean r5 = p298d.p344x.p346c.C6888i.m12434a(r5, r6)
                if (r5 == 0) goto L_0x007c
                java.lang.String r5 = r0.f11043k
                if (r5 == 0) goto L_0x007c
                java.util.List<com.appfoundry.previewer.model.Container> r0 = r0.f11038f
                if (r0 != 0) goto L_0x007c
            L_0x007b:
                r1 = r4
            L_0x007c:
                com.appfoundry.previewer.activities.BravoActivity r0 = r12.f10800g
                if (r1 == 0) goto L_0x00bd
                r1 = 2131231008(0x7f080120, float:1.8078085E38)
                android.view.View r0 = r0.findViewById(r1)
                android.widget.RelativeLayout r0 = (android.widget.RelativeLayout) r0
                java.lang.String r1 = "loading"
                p298d.p344x.p346c.C6888i.m12437d(r0, r1)
                p005b.p006a.p007a.p018i.C0758q.m247l(r0)
                T r1 = r3.f13801g
                com.appfoundry.previewer.model.Page r1 = (com.appfoundry.previewer.model.Page) r1
                java.lang.String r5 = r1.f11043k
                l.a.w r1 = p416l.p417a.C7725h0.f15273a
                l.a.g1 r1 = p416l.p417a.p419u1.C7785l.f15351b
                l.a.o r2 = p005b.p291q.p292a.C5266a.m9959h(r2, r4, r2)
                d.v.f r1 = r1.plus(r2)
                l.a.y r7 = p005b.p291q.p292a.C5266a.m9953g(r1)
                r8 = 0
                r9 = 0
                com.appfoundry.previewer.activities.BravoActivity$o$b r10 = new com.appfoundry.previewer.activities.BravoActivity$o$b
                r6 = 0
                r1 = r10
                r2 = r12
                r4 = r0
                r1.<init>(r2, r3, r4, r5, r6)
                r0 = 3
                r11 = 0
                r6 = r7
                r7 = r8
                r8 = r9
                r9 = r10
                r10 = r0
                p005b.p291q.p292a.C5266a.m9880S2(r6, r7, r8, r9, r10, r11)
                goto L_0x010f
            L_0x00bd:
                T r1 = r3.f13801g
                com.appfoundry.previewer.model.Page r1 = (com.appfoundry.previewer.model.Page) r1
                com.appfoundry.previewer.activities.BravoActivity.m10143e(r0, r1)
                goto L_0x010f
            L_0x00c5:
                T r0 = r3.f13801g
                com.appfoundry.previewer.model.Page r0 = (com.appfoundry.previewer.model.Page) r0
                if (r0 == 0) goto L_0x010f
                boolean r2 = p005b.p006a.p007a.p018i.C0744e.m188A(r0)
                if (r2 == 0) goto L_0x0103
                com.appfoundry.previewer.activities.BravoActivity r2 = r12.f10800g
                com.appfoundry.previewer.BravoApp$b r5 = com.appfoundry.previewer.BravoApp.f10730N
                java.lang.String r5 = com.appfoundry.previewer.BravoApp.f10727K
                androidx.fragment.app.Fragment r2 = p005b.p038f.p039a.C0849e.m539r(r2, r5)
                if (r2 == 0) goto L_0x00e7
                com.appfoundry.previewer.activities.BravoActivity r5 = r12.f10800g
                com.appfoundry.previewer.activities.BravoActivity$o$a r6 = new com.appfoundry.previewer.activities.BravoActivity$o$a
                r6.<init>(r2, r12, r3)
                r5.runOnUiThread(r6)
            L_0x00e7:
                java.lang.String r2 = "$this$shouldShowLoading"
                p298d.p344x.p346c.C6888i.m12438e(r0, r2)
                boolean r2 = p005b.p006a.p007a.p018i.C0744e.m214r(r0)
                if (r2 != 0) goto L_0x00f8
                java.util.List<com.appfoundry.previewer.model.Container> r0 = r0.f11038f
                if (r0 != 0) goto L_0x00f7
                goto L_0x00f8
            L_0x00f7:
                r4 = r1
            L_0x00f8:
                if (r4 == 0) goto L_0x0103
                com.appfoundry.previewer.activities.BravoActivity r0 = r12.f10800g
                T r1 = r3.f13801g
                com.appfoundry.previewer.model.Page r1 = (com.appfoundry.previewer.model.Page) r1
                r0.mo18418q(r1)
            L_0x0103:
                com.appfoundry.previewer.activities.BravoActivity r0 = r12.f10800g
                T r1 = r3.f13801g
                com.appfoundry.previewer.model.Page r1 = (com.appfoundry.previewer.model.Page) r1
                r2 = 2131230859(0x7f08008b, float:1.8077783E38)
                p005b.p038f.p039a.C0849e.m542s0(r0, r1, r2)
            L_0x010f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.appfoundry.previewer.activities.BravoActivity.C5427o.run():void");
        }
    }

    /* renamed from: com.appfoundry.previewer.activities.BravoActivity$p */
    public static final class C5431p implements MediaPlayer.OnCompletionListener {

        /* renamed from: a */
        public final /* synthetic */ View f10810a;

        /* renamed from: b */
        public final /* synthetic */ C0702f0 f10811b;

        public C5431p(View view, C0702f0 f0Var) {
            this.f10810a = view;
            this.f10811b = f0Var;
        }

        public final void onCompletion(MediaPlayer mediaPlayer) {
            Object obj;
            View view;
            C8091a.f16272d.mo26043a(">> MYMEDIAPLAYER completed", new Object[0]);
            View view2 = this.f10810a;
            if (view2 != null) {
                C0758q.m247l(view2);
            }
            BravoApp.C5403b bVar = BravoApp.f10730N;
            List list = BravoApp.f10719C.get(this.f10811b.f407b);
            if (list != null) {
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (C6888i.m12434a(((C0770a) obj).f512c, "action:pause")) {
                        break;
                    }
                }
                C0770a aVar = (C0770a) obj;
                if (aVar != null && (view = aVar.f513d) != null) {
                    C0758q.m240e(view);
                }
            }
        }
    }

    /* renamed from: com.appfoundry.previewer.activities.BravoActivity$q */
    public static final class C5432q implements MediaPlayer.OnErrorListener {

        /* renamed from: a */
        public final /* synthetic */ View f10812a;

        public C5432q(View view) {
            this.f10812a = view;
        }

        public final boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
            C8091a.f16272d.mo26044b(">> MYMEDIAPLAYER error: %s, %s", String.valueOf(i), String.valueOf(i2));
            View view = this.f10812a;
            if (view != null) {
                C0758q.m240e(view);
            }
            return true;
        }
    }

    /* renamed from: com.appfoundry.previewer.activities.BravoActivity$r */
    public static final class C5433r implements MediaPlayer.OnPreparedListener {

        /* renamed from: a */
        public final /* synthetic */ BravoActivity f10813a;

        /* renamed from: b */
        public final /* synthetic */ View f10814b;

        /* renamed from: c */
        public final /* synthetic */ View f10815c;

        /* renamed from: d */
        public final /* synthetic */ C0702f0 f10816d;

        /* renamed from: e */
        public final /* synthetic */ MediaPlayer f10817e;

        public C5433r(BravoActivity bravoActivity, View view, View view2, C0702f0 f0Var, MediaPlayer mediaPlayer) {
            this.f10813a = bravoActivity;
            this.f10814b = view;
            this.f10815c = view2;
            this.f10816d = f0Var;
            this.f10817e = mediaPlayer;
        }

        public final void onPrepared(MediaPlayer mediaPlayer) {
            C8091a.f16272d.mo26043a(">> MYMEDIAPLAYER prepared", new Object[0]);
            View view = this.f10814b;
            if (view != null) {
                C0758q.m240e(view);
            }
            View view2 = this.f10815c;
            if (view2 != null) {
                view2.setClickable(true);
            }
            C0702f0 f0Var = this.f10816d;
            C0777h hVar = new C0777h(f0Var.f407b, f0Var.f406a, this.f10817e, new Handler(), this.f10816d.f408c);
            BravoApp.C5403b bVar = BravoApp.f10730N;
            BravoApp.f10720D = hVar;
            BravoActivity bravoActivity = this.f10813a;
            C0702f0 f0Var2 = this.f10816d;
            int i = BravoActivity.f10754o;
            bravoActivity.mo18417p(f0Var2);
        }
    }

    /* renamed from: com.appfoundry.previewer.activities.BravoActivity$s */
    public static final class C5434s implements DialogInterface.OnClickListener {

        /* renamed from: g */
        public final /* synthetic */ BravoActivity f10818g;

        /* renamed from: h */
        public final /* synthetic */ C0708i0 f10819h;

        public C5434s(BravoActivity bravoActivity, C0708i0 i0Var) {
            this.f10818g = bravoActivity;
            this.f10819h = i0Var;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            BravoActivity bravoActivity = this.f10818g;
            C0708i0 i0Var = this.f10819h;
            String str = i0Var.f412a;
            String str2 = i0Var.f413b;
            int i2 = BravoActivity.f10754o;
            bravoActivity.mo18375G(str, str2);
        }
    }

    /* renamed from: com.appfoundry.previewer.activities.BravoActivity$t */
    public static final class C5435t implements DialogInterface.OnClickListener {

        /* renamed from: g */
        public static final C5435t f10820g = new C5435t();

        public final void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
        }
    }

    /* renamed from: com.appfoundry.previewer.activities.BravoActivity$u */
    public static final class C5436u<TResult> implements C3418c<Void> {

        /* renamed from: a */
        public final /* synthetic */ BravoActivity f10821a;

        /* renamed from: b */
        public final /* synthetic */ RelativeLayout f10822b;

        public C5436u(BravoActivity bravoActivity, RelativeLayout relativeLayout) {
            this.f10821a = bravoActivity;
            this.f10822b = relativeLayout;
        }

        /* renamed from: c */
        public final void mo10462c(C3428h<Void> hVar) {
            C6888i.m12438e(hVar, "task");
            RelativeLayout relativeLayout = this.f10822b;
            if (relativeLayout != null) {
                C0758q.m240e(relativeLayout);
            }
            String str = null;
            if (hVar.mo14692n()) {
                C0849e.m483H0(this.f10821a, "Check your email to reset your password", (String) null, 0, 6);
                return;
            }
            BravoActivity bravoActivity = this.f10821a;
            Exception i = hVar.mo14687i();
            if (i != null) {
                str = i.getLocalizedMessage();
            }
            C0849e.m483H0(bravoActivity, "Error occurred sending reset email", str, 0, 4);
        }
    }

    /* renamed from: com.appfoundry.previewer.activities.BravoActivity$v */
    public static final class C5437v implements C7843g {

        /* renamed from: a */
        public final /* synthetic */ BravoActivity f10823a;

        /* renamed from: b */
        public final /* synthetic */ Fragment f10824b;

        /* renamed from: c */
        public final /* synthetic */ RelativeLayout f10825c;

        /* renamed from: com.appfoundry.previewer.activities.BravoActivity$v$a */
        public static final class C5438a implements Runnable {

            /* renamed from: g */
            public final /* synthetic */ C5437v f10826g;

            public C5438a(C5437v vVar) {
                this.f10826g = vVar;
            }

            public final void run() {
                C5437v vVar = this.f10826g;
                vVar.f10823a.mo18426y(false, vVar.f10824b, vVar.f10825c);
            }
        }

        /* renamed from: com.appfoundry.previewer.activities.BravoActivity$v$b */
        public static final class C5439b implements Runnable {

            /* renamed from: g */
            public final /* synthetic */ C5437v f10827g;

            public C5439b(C5437v vVar) {
                this.f10827g = vVar;
            }

            public final void run() {
                C5437v vVar = this.f10827g;
                vVar.f10823a.mo18426y(false, vVar.f10824b, vVar.f10825c);
            }
        }

        public C5437v(BravoActivity bravoActivity, Fragment fragment, RelativeLayout relativeLayout) {
            this.f10823a = bravoActivity;
            this.f10824b = fragment;
            this.f10825c = relativeLayout;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:23:0x006a, code lost:
            r0 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:24:0x006b, code lost:
            p005b.p291q.p292a.C5266a.m9877S(r8, r7);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:25:0x006e, code lost:
            throw r0;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo10629a(p421m.C7841f r7, p421m.C7850h0 r8) {
            /*
                r6 = this;
                java.lang.String r0 = "call"
                p298d.p344x.p346c.C6888i.m12438e(r7, r0)
                java.lang.String r7 = "response"
                p298d.p344x.p346c.C6888i.m12438e(r8, r7)
                com.appfoundry.previewer.activities.BravoActivity r7 = r6.f10823a
                com.appfoundry.previewer.activities.BravoActivity$v$b r0 = new com.appfoundry.previewer.activities.BravoActivity$v$b
                r0.<init>(r6)
                r7.runOnUiThread(r0)
                boolean r7 = r8.isSuccessful()     // Catch:{ all -> 0x0068 }
                r0 = 0
                r1 = 0
                if (r7 != 0) goto L_0x0035
                com.appfoundry.previewer.activities.BravoActivity r7 = r6.f10823a     // Catch:{ all -> 0x0068 }
                java.lang.String r2 = "ERROR: Remote Action not successful. "
                java.lang.String r3 = r8.f15551i     // Catch:{ all -> 0x0068 }
                r4 = 4
                p005b.p038f.p039a.C0849e.m483H0(r7, r2, r3, r0, r4)     // Catch:{ all -> 0x0068 }
                java.lang.String r7 = "Remote Action ERROR: %s"
                r2 = 1
                java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ all -> 0x0068 }
                java.lang.String r3 = r8.f15551i     // Catch:{ all -> 0x0068 }
                r2[r0] = r3     // Catch:{ all -> 0x0068 }
                p.a.a$b r0 = p441p.p442a.C8091a.f16272d     // Catch:{ all -> 0x0068 }
                r0.mo26044b(r7, r2)     // Catch:{ all -> 0x0068 }
                goto L_0x0064
            L_0x0035:
                m.j0 r7 = r8.f15555m     // Catch:{ all -> 0x0068 }
                if (r7 == 0) goto L_0x003e
                java.lang.String r7 = r7.mo25572z()     // Catch:{ all -> 0x0068 }
                goto L_0x003f
            L_0x003e:
                r7 = r1
            L_0x003f:
                r2 = 6
                java.lang.String r3 = "ERROR: Backend response is null"
                if (r7 == 0) goto L_0x005f
                com.appfoundry.previewer.activities.BravoActivity r4 = r6.f10823a     // Catch:{ Exception -> 0x0056 }
                b.a.a.n.e r5 = p005b.p006a.p007a.p023n.C0816e.f639l     // Catch:{ Exception -> 0x0056 }
                b.p.a.l<com.appfoundry.previewer.model.BackendResponse> r5 = p005b.p006a.p007a.p023n.C0816e.f637j     // Catch:{ Exception -> 0x0056 }
                java.lang.Object r7 = r5.mo16830b(r7)     // Catch:{ Exception -> 0x0056 }
                com.appfoundry.previewer.model.BackendResponse r7 = (com.appfoundry.previewer.model.BackendResponse) r7     // Catch:{ Exception -> 0x0056 }
                int r5 = com.appfoundry.previewer.activities.BravoActivity.f10754o     // Catch:{ Exception -> 0x0056 }
                r4.mo18424w(r7, r1, r1)     // Catch:{ Exception -> 0x0056 }
                goto L_0x0064
            L_0x0056:
                java.lang.String r7 = "Error parsing BackendResponse"
                java.lang.Object[] r4 = new java.lang.Object[r0]     // Catch:{ all -> 0x0068 }
                p.a.a$b r5 = p441p.p442a.C8091a.f16272d     // Catch:{ all -> 0x0068 }
                r5.mo26044b(r7, r4)     // Catch:{ all -> 0x0068 }
            L_0x005f:
                com.appfoundry.previewer.activities.BravoActivity r7 = r6.f10823a     // Catch:{ all -> 0x0068 }
                p005b.p038f.p039a.C0849e.m483H0(r7, r3, r1, r0, r2)     // Catch:{ all -> 0x0068 }
            L_0x0064:
                p005b.p291q.p292a.C5266a.m9877S(r8, r1)
                return
            L_0x0068:
                r7 = move-exception
                throw r7     // Catch:{ all -> 0x006a }
            L_0x006a:
                r0 = move-exception
                p005b.p291q.p292a.C5266a.m9877S(r8, r7)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.appfoundry.previewer.activities.BravoActivity.C5437v.mo10629a(m.f, m.h0):void");
        }

        /* renamed from: b */
        public void mo10630b(C7841f fVar, IOException iOException) {
            C6888i.m12438e(fVar, NotificationCompat.CATEGORY_CALL);
            C6888i.m12438e(iOException, "e");
            this.f10823a.runOnUiThread(new C5438a(this));
            C0849e.m483H0(this.f10823a, "ERROR: Remote Action failure. ", iOException.getMessage(), 0, 4);
        }
    }

    /* renamed from: a */
    public static final void m10139a(BravoActivity bravoActivity, RelativeLayout relativeLayout) {
        Objects.requireNonNull(bravoActivity);
        C8091a.f16272d.mo26044b("ERROR: onFailure dialog", new Object[0]);
        bravoActivity.runOnUiThread(new C0670d(relativeLayout));
        bravoActivity.mo18379h();
        Bundle bundle = new Bundle();
        bundle.putBoolean("showIntro", false);
        bundle.putBoolean("showLogin", true);
        Intent intent = new Intent(bravoActivity, BravoActivity.class);
        intent.putExtras(bundle);
        bravoActivity.startActivity(intent);
        bravoActivity.finish();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x002c, code lost:
        r3 = r10.f829f;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m10140b(com.appfoundry.previewer.activities.BravoActivity r8, p005b.p040g.p041a.p042e.p043f.C0866h r9, p005b.p040g.p041a.p049j.C0921a r10, android.widget.RelativeLayout r11) {
        /*
            java.util.Objects.requireNonNull(r8)
            b.a.a.n.f r0 = p005b.p006a.p007a.p023n.C0817f.f641b
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            android.content.Context r1 = p005b.p038f.p039a.C0849e.m505a()
            java.lang.String r2 = "appContext()"
            p298d.p344x.p346c.C6888i.m12437d(r1, r2)
            java.lang.String r1 = r1.getPackageName()
            r0.append(r1)
            java.lang.String r1 = "user_logged_in"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            p005b.p006a.p007a.p023n.C0817f.m297e(r0)
            r0 = 1
            java.lang.Object[] r1 = new java.lang.Object[r0]
            r2 = 0
            if (r10 == 0) goto L_0x0035
            java.util.Date r3 = r10.f829f
            if (r3 == 0) goto L_0x0035
            java.lang.String r3 = r3.toString()
            goto L_0x0036
        L_0x0035:
            r3 = r2
        L_0x0036:
            r4 = 0
            r1[r4] = r3
            p.a.a$b r3 = p441p.p442a.C8091a.f16272d
            java.lang.String r5 = "REFRESH TOKEN EXPIRATION DATE: %s"
            r3.mo26043a(r5, r1)
            java.lang.String r1 = "bravo_vision_refresh_token_expiration"
            if (r10 == 0) goto L_0x0050
            java.util.Date r5 = r10.f829f
            if (r5 == 0) goto L_0x0050
            long r5 = r5.getTime()
            java.lang.Long r2 = java.lang.Long.valueOf(r5)
        L_0x0050:
            java.lang.String r5 = "key"
            p298d.p344x.p346c.C6888i.m12438e(r1, r5)
            if (r2 == 0) goto L_0x0068
            android.content.SharedPreferences r5 = p005b.p006a.p007a.p023n.C0817f.f640a
            android.content.SharedPreferences$Editor r5 = r5.edit()
            long r6 = r2.longValue()
            android.content.SharedPreferences$Editor r1 = r5.putLong(r1, r6)
            r1.apply()
        L_0x0068:
            if (r10 == 0) goto L_0x00ac
            java.lang.Object[] r1 = new java.lang.Object[r0]
            java.lang.String r2 = r10.f826c
            r1[r4] = r2
            java.lang.String r2 = "onSuccess: %s"
            r3.mo26043a(r2, r1)
            r9.mo10704c(r10)     // Catch:{ Exception -> 0x0079 }
            goto L_0x0098
        L_0x0079:
            r1 = move-exception
            java.lang.Object[] r2 = new java.lang.Object[r0]
            java.lang.String r1 = r1.getLocalizedMessage()
            r2[r4] = r1
            p.a.a$b r1 = p441p.p442a.C8091a.f16272d
            java.lang.String r3 = "Error on credentialsManager.saveCredentials: %s"
            r1.mo26044b(r3, r2)
            r9.mo10702a()
            o.a.a.c r9 = p437o.p438a.p439a.C8068c.m14948b()
            b.a.a.h.s r1 = new b.a.a.h.s
            r1.<init>(r4, r0)
            r9.mo26008g(r1)
        L_0x0098:
            b.a.a.n.f r9 = p005b.p006a.p007a.p023n.C0817f.f641b
            java.lang.String r9 = r10.f826c
            if (r9 == 0) goto L_0x009f
            goto L_0x00a1
        L_0x009f:
            java.lang.String r9 = ""
        L_0x00a1:
            java.lang.String r10 = "credentials.idToken ?: \"\""
            p298d.p344x.p346c.C6888i.m12437d(r9, r10)
            java.lang.String r10 = "auth_token"
            p005b.p006a.p007a.p023n.C0817f.m298f(r10, r9)
            goto L_0x00bb
        L_0x00ac:
            r9.mo10702a()
            o.a.a.c r9 = p437o.p438a.p439a.C8068c.m14948b()
            b.a.a.h.s r10 = new b.a.a.h.s
            r10.<init>(r4, r0)
            r9.mo26008g(r10)
        L_0x00bb:
            b.a.a.e.e r9 = new b.a.a.e.e
            r9.<init>(r11)
            r8.runOnUiThread(r9)
            com.appfoundry.previewer.BravoApp$b r9 = com.appfoundry.previewer.BravoApp.f10730N
            r9.mo18365e()
            android.os.Bundle r9 = new android.os.Bundle
            r9.<init>()
            java.lang.String r10 = "showIntro"
            r9.putBoolean(r10, r4)
            java.lang.String r10 = "showLogin"
            r9.putBoolean(r10, r4)
            android.content.Intent r10 = new android.content.Intent
            java.lang.Class<com.appfoundry.previewer.activities.BravoActivity> r11 = com.appfoundry.previewer.activities.BravoActivity.class
            r10.<init>(r8, r11)
            r10.putExtras(r9)
            r8.startActivity(r10)
            r8.finish()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appfoundry.previewer.activities.BravoActivity.m10140b(com.appfoundry.previewer.activities.BravoActivity, b.g.a.e.f.h, b.g.a.j.a, android.widget.RelativeLayout):void");
    }

    /* renamed from: c */
    public static final void m10141c(BravoActivity bravoActivity, C3922p pVar, RelativeLayout relativeLayout) {
        C3428h<C3924q> g;
        Objects.requireNonNull(bravoActivity);
        if (pVar != null && (g = FirebaseAuth.getInstance(pVar.mo15403e0()).mo22158g(pVar, true)) != null) {
            g.mo14681c(new C0675g(bravoActivity, relativeLayout));
        }
    }

    /* renamed from: d */
    public static final void m10142d(BravoActivity bravoActivity) {
        Objects.requireNonNull(bravoActivity);
        BravoApp.f10730N.mo18365e();
        Bundle bundle = new Bundle();
        bundle.putBoolean("showIntro", false);
        bundle.putBoolean("showLogin", false);
        Intent intent = new Intent(bravoActivity, BravoActivity.class);
        intent.putExtras(bundle);
        bravoActivity.startActivity(intent);
        bravoActivity.finish();
    }

    /* JADX WARNING: Removed duplicated region for block: B:42:0x00e0  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m10143e(com.appfoundry.previewer.activities.BravoActivity r9, com.appfoundry.previewer.model.Page r10) {
        /*
            java.util.Objects.requireNonNull(r9)
            r0 = 0
            if (r10 == 0) goto L_0x000b
            java.lang.Boolean r1 = p005b.p006a.p007a.p018i.C0744e.m220x(r10)
            goto L_0x000c
        L_0x000b:
            r1 = r0
        L_0x000c:
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            boolean r1 = p298d.p344x.p346c.C6888i.m12434a(r1, r2)
            r3 = 0
            r4 = 1
            r5 = 2
            if (r1 == 0) goto L_0x00e7
            java.lang.String r1 = "$this$showBottomSheetFor"
            p298d.p344x.p346c.C6888i.m12438e(r9, r1)
            com.appfoundry.previewer.fragments.BottomSheetFragment r1 = new com.appfoundry.previewer.fragments.BottomSheetFragment
            r1.<init>()
            if (r10 == 0) goto L_0x0026
            java.lang.String r2 = r10.f11050r
            goto L_0x0027
        L_0x0026:
            r2 = r0
        L_0x0027:
            com.appfoundry.previewer.model.Style r2 = p005b.p006a.p007a.p024o.C0823f.m346O(r2, r0, r5)
            r1.f10876s = r10
            if (r10 == 0) goto L_0x0034
            int r5 = p005b.p006a.p007a.p018i.C0744e.m208l(r10, r9)
            goto L_0x0035
        L_0x0034:
            r5 = r3
        L_0x0035:
            java.lang.Object[] r6 = new java.lang.Object[r4]
            java.lang.Integer r7 = java.lang.Integer.valueOf(r5)
            r6[r3] = r7
            p.a.a$b r7 = p441p.p442a.C8091a.f16272d
            java.lang.String r8 = ">>>>> calculatedModalHeight = %d"
            r7.mo26043a(r8, r6)
            java.lang.Object[] r6 = new java.lang.Object[r4]
            com.appfoundry.previewer.BravoApp$b r8 = com.appfoundry.previewer.BravoApp.f10730N
            int r8 = com.appfoundry.previewer.BravoApp.f10726J
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r6[r3] = r8
            java.lang.String r8 = ">>>>> screenHeight = %d"
            r7.mo26043a(r8, r6)
            java.lang.Object[] r6 = new java.lang.Object[r4]
            if (r2 == 0) goto L_0x0062
            java.lang.Integer r8 = r2.f11134K
            if (r8 == 0) goto L_0x0062
            int r8 = r8.intValue()
            goto L_0x0063
        L_0x0062:
            r8 = -1
        L_0x0063:
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r6[r3] = r8
            java.lang.String r8 = ">>>>> modalStyle?.modalHeight = %d"
            r7.mo26043a(r8, r6)
            int r6 = com.appfoundry.previewer.BravoApp.f10726J
            if (r5 >= r6) goto L_0x0090
            if (r2 == 0) goto L_0x0077
            java.lang.Boolean r6 = r2.f11135L
            goto L_0x0078
        L_0x0077:
            r6 = r0
        L_0x0078:
            java.lang.Boolean r8 = java.lang.Boolean.FALSE
            boolean r6 = p298d.p344x.p346c.C6888i.m12434a(r6, r8)
            if (r6 == 0) goto L_0x0090
            r1.f10877t = r5
            java.lang.Object[] r6 = new java.lang.Object[r4]
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r6[r3] = r5
            java.lang.String r3 = ">>>>> fragment.height = calculatedModalHeight = %d"
            r7.mo26043a(r3, r6)
            goto L_0x00c9
        L_0x0090:
            if (r2 == 0) goto L_0x0095
            java.lang.Integer r5 = r2.f11134K
            goto L_0x0096
        L_0x0095:
            r5 = r0
        L_0x0096:
            if (r5 == 0) goto L_0x00c0
            java.lang.Integer r5 = r2.f11134K
            int r5 = r5.intValue()
            r6 = 100
            if (r5 >= r6) goto L_0x00c0
            java.lang.Integer r5 = r2.f11134K
            int r5 = r5.intValue()
            int r6 = com.appfoundry.previewer.BravoApp.f10726J
            int r5 = r5 * r6
            float r5 = (float) r5
            r6 = 1120403456(0x42c80000, float:100.0)
            float r5 = r5 / r6
            int r5 = (int) r5
            r1.f10877t = r5
            java.lang.Object[] r6 = new java.lang.Object[r4]
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r6[r3] = r5
            java.lang.String r3 = ">>>>> fragment.height = ((modalStyle.modalHeight * screenHeight()) / 100f) = %d"
            r7.mo26043a(r3, r6)
            goto L_0x00c9
        L_0x00c0:
            r1.f10877t = r3
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.String r5 = ">>>>> fragment.height = calculatedModalHeight = 0"
            r7.mo26043a(r5, r3)
        L_0x00c9:
            if (r2 == 0) goto L_0x00d3
            java.lang.Boolean r2 = r2.f11135L
            if (r2 == 0) goto L_0x00d3
            boolean r4 = r2.booleanValue()
        L_0x00d3:
            r1.f10878u = r4
            androidx.fragment.app.FragmentManager r9 = r9.getSupportFragmentManager()
            java.lang.String r2 = "supportFragmentManager"
            p298d.p344x.p346c.C6888i.m12437d(r9, r2)
            if (r10 == 0) goto L_0x00e2
            java.lang.String r0 = r10.f11033a
        L_0x00e2:
            r1.show(r9, r0)
            goto L_0x014c
        L_0x00e7:
            if (r10 == 0) goto L_0x0123
            java.lang.String r1 = "$this$isBlurPopUp"
            p298d.p344x.p346c.C6888i.m12438e(r10, r1)
            java.lang.Boolean r1 = p005b.p006a.p007a.p018i.C0744e.m222z(r10)
            boolean r1 = p298d.p344x.p346c.C6888i.m12434a(r1, r2)
            if (r1 == 0) goto L_0x010b
            java.lang.String r1 = r10.f11050r
            com.appfoundry.previewer.model.Style r1 = p005b.p006a.p007a.p024o.C0823f.m346O(r1, r0, r5)
            if (r1 == 0) goto L_0x0103
            java.lang.Boolean r1 = r1.f11137N
            goto L_0x0104
        L_0x0103:
            r1 = r0
        L_0x0104:
            boolean r1 = p298d.p344x.p346c.C6888i.m12434a(r1, r2)
            if (r1 == 0) goto L_0x010b
            r3 = r4
        L_0x010b:
            if (r3 != r4) goto L_0x0123
            java.lang.String r0 = "$this$showBlurPopupFor"
            p298d.p344x.p346c.C6888i.m12438e(r9, r0)
            b.a.a.a.c r0 = new b.a.a.a.c
            r0.<init>()
            r0.f213h = r10
            androidx.fragment.app.FragmentManager r9 = r9.getSupportFragmentManager()
            java.lang.String r10 = r10.f11033a
            r0.show((androidx.fragment.app.FragmentManager) r9, (java.lang.String) r10)
            goto L_0x014c
        L_0x0123:
            java.lang.String r1 = "$this$showPopupFor"
            p298d.p344x.p346c.C6888i.m12438e(r9, r1)
            b.a.a.a.i r1 = new b.a.a.a.i
            r1.<init>()
            r1.f244g = r10
            if (r10 == 0) goto L_0x0134
            java.lang.String r2 = r10.f11050r
            goto L_0x0135
        L_0x0134:
            r2 = r0
        L_0x0135:
            com.appfoundry.previewer.model.Style r2 = p005b.p006a.p007a.p024o.C0823f.m346O(r2, r0, r5)
            if (r2 == 0) goto L_0x013e
            java.lang.String r2 = r2.f11136M
            goto L_0x013f
        L_0x013e:
            r2 = r0
        L_0x013f:
            r1.f245h = r2
            androidx.fragment.app.FragmentManager r9 = r9.getSupportFragmentManager()
            if (r10 == 0) goto L_0x0149
            java.lang.String r0 = r10.f11033a
        L_0x0149:
            r1.show((androidx.fragment.app.FragmentManager) r9, (java.lang.String) r0)
        L_0x014c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appfoundry.previewer.activities.BravoActivity.m10143e(com.appfoundry.previewer.activities.BravoActivity, com.appfoundry.previewer.model.Page):void");
    }

    /* renamed from: f */
    public static final void m10144f(BravoActivity bravoActivity, int i) {
        RelativeLayout relativeLayout = (RelativeLayout) bravoActivity.findViewById(R.id.parent_layout);
        if (relativeLayout != null) {
            Snackbar make = Snackbar.make((View) relativeLayout, (CharSequence) "", i == 99 ? -2 : -1);
            C6888i.m12437d(make, "Snackbar.make(parentLayout, \"\", duration)");
            int dimension = (int) bravoActivity.getResources().getDimension(R.dimen.snackbar_height);
            View inflate = bravoActivity.getLayoutInflater().inflate(i == 99 ? R.layout.snackbar_update_layout : R.layout.snackbar_downloading_update_layout, (ViewGroup) null);
            TextView textView = (TextView) inflate.findViewById(R.id.snackbar_update_text);
            if (textView != null) {
                textView.setTypeface(C0801a.f597b.mo10628b("01DZ4603S1A99S0MKRX805Z15F"));
            }
            if (i == 500) {
                C6888i.m12437d(textView, NotificationCompat.MessagingStyle.Message.KEY_TEXT);
                textView.setText(bravoActivity.getString(R.string.snackbar_download_failed));
            }
            if (i == 99) {
                TextView textView2 = (TextView) inflate.findViewById(R.id.snackbar_update_yes);
                if (textView2 != null) {
                    textView2.setTypeface(C0801a.f597b.mo10628b("01DZ4603RX0X7SJMZFXAMWZQ4T"));
                }
                textView2.setOnClickListener(new C0685n(bravoActivity));
            }
            View view = make.getView();
            Objects.requireNonNull(view, "null cannot be cast to non-null type com.google.android.material.snackbar.Snackbar.SnackbarLayout");
            Snackbar.SnackbarLayout snackbarLayout = (Snackbar.SnackbarLayout) view;
            ViewGroup.LayoutParams layoutParams = snackbarLayout.getLayoutParams();
            Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            layoutParams2.height = dimension;
            layoutParams2.width = -1;
            snackbarLayout.setLayoutParams(layoutParams2);
            snackbarLayout.setBackgroundColor(ContextCompat.getColor(bravoActivity, R.color.bravoPurple));
            snackbarLayout.addView(inflate, 0);
            make.show();
        }
    }

    /* renamed from: A */
    public final void mo18369A(C0774e eVar, C0774e eVar2, RelativeLayout relativeLayout) {
        BravoApp.C5403b bVar = BravoApp.f10730N;
        FirebaseAuth firebaseAuth = BravoApp.f10718B;
        if (firebaseAuth != null) {
            String str = "";
            String d = eVar != null ? C0812d.f622f.mo10638d(eVar) : str;
            if (eVar2 != null) {
                str = C0812d.f622f.mo10638d(eVar2);
            }
            C0823f.m376j(d);
            C0823f.m376j(str);
            C2600xh xhVar = firebaseAuth.f11419e;
            C3825d dVar = firebaseAuth.f11415a;
            String str2 = firebaseAuth.f11423i;
            C3933u0 u0Var = new C3933u0(firebaseAuth);
            Objects.requireNonNull(xhVar);
            C2479sg sgVar = new C2479sg(d, str, str2);
            sgVar.mo12468d(dVar);
            sgVar.mo12470f(u0Var);
            C3428h b = xhVar.mo12920b(sgVar);
            if (b != null) {
                b.mo14680b(this, new C5422k(this, relativeLayout));
            }
        }
    }

    /* renamed from: B */
    public final void mo18370B() {
        Object systemService = getSystemService("input_method");
        Objects.requireNonNull(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        InputMethodManager inputMethodManager = (InputMethodManager) systemService;
        if (inputMethodManager.isAcceptingText() && getCurrentFocus() != null) {
            View currentFocus = getCurrentFocus();
            C6888i.m12436c(currentFocus);
            C6888i.m12437d(currentFocus, "currentFocus!!");
            inputMethodManager.hideSoftInputFromWindow(currentFocus.getWindowToken(), 0);
        }
    }

    /* renamed from: C */
    public final void mo18371C() {
        mo18379h();
        Bundle bundle = new Bundle();
        bundle.putBoolean("showLogin", true);
        Intent intent = new Intent(this, BravoActivity.class);
        intent.putExtras(bundle);
        startActivity(intent);
        finish();
    }

    /* renamed from: D */
    public final void mo18372D(C0774e eVar, RelativeLayout relativeLayout) {
        BravoApp.C5403b bVar = BravoApp.f10730N;
        FirebaseAuth firebaseAuth = BravoApp.f10718B;
        if (firebaseAuth != null) {
            String d = eVar != null ? C0812d.f622f.mo10638d(eVar) : "";
            C0823f.m376j(d);
            C0823f.m376j(d);
            C3854a aVar = new C3854a(new C3854a.C3855a());
            aVar.f7095o = 1;
            C2600xh xhVar = firebaseAuth.f11419e;
            C3825d dVar = firebaseAuth.f11415a;
            String str = firebaseAuth.f11423i;
            Objects.requireNonNull(xhVar);
            aVar.f7095o = 1;
            C2360nh nhVar = new C2360nh(d, aVar, str, "sendPasswordResetEmail");
            nhVar.mo12468d(dVar);
            C3428h b = xhVar.mo12920b(nhVar);
            if (b != null) {
                b.mo14681c(new C5436u(this, relativeLayout));
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000e, code lost:
        r0 = r0.f11010c;
     */
    /* renamed from: E */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo18373E(com.appfoundry.previewer.model.FirebaseConfigJson r13) {
        /*
            r12 = this;
            if (r13 == 0) goto L_0x00a9
            r5 = 0
            java.lang.String r8 = "$this$getProjectId"
            p298d.p344x.p346c.C6888i.m12438e(r13, r8)
            com.appfoundry.previewer.model.FirebaseProjectInfo r0 = r13.f11006a
            java.lang.String r9 = ""
            if (r0 == 0) goto L_0x0014
            java.lang.String r0 = r0.f11010c
            if (r0 == 0) goto L_0x0014
            r7 = r0
            goto L_0x0015
        L_0x0014:
            r7 = r9
        L_0x0015:
            java.lang.String r0 = "$this$getApplicationId"
            p298d.p344x.p346c.C6888i.m12438e(r13, r0)
            java.util.List<com.appfoundry.previewer.model.FirebaseClient> r0 = r13.f11007b
            r1 = 0
            if (r0 == 0) goto L_0x0031
            java.lang.Object r0 = r0.get(r1)
            com.appfoundry.previewer.model.FirebaseClient r0 = (com.appfoundry.previewer.model.FirebaseClient) r0
            if (r0 == 0) goto L_0x0031
            com.appfoundry.previewer.model.FirebaseClientInfo r0 = r0.f11002a
            if (r0 == 0) goto L_0x0031
            java.lang.String r0 = r0.f11004a
            if (r0 == 0) goto L_0x0031
            r2 = r0
            goto L_0x0032
        L_0x0031:
            r2 = r9
        L_0x0032:
            java.lang.String r0 = "ApplicationId must be set."
            p005b.p006a.p007a.p024o.C0823f.m374i(r2, r0)
            java.lang.String r0 = "$this$getApiKey"
            p298d.p344x.p346c.C6888i.m12438e(r13, r0)
            java.util.List<com.appfoundry.previewer.model.FirebaseClient> r0 = r13.f11007b
            if (r0 == 0) goto L_0x005a
            java.lang.Object r0 = r0.get(r1)
            com.appfoundry.previewer.model.FirebaseClient r0 = (com.appfoundry.previewer.model.FirebaseClient) r0
            if (r0 == 0) goto L_0x005a
            java.util.List<com.appfoundry.previewer.model.FirebaseApiKey> r0 = r0.f11003b
            if (r0 == 0) goto L_0x005a
            java.lang.Object r0 = r0.get(r1)
            com.appfoundry.previewer.model.FirebaseApiKey r0 = (com.appfoundry.previewer.model.FirebaseApiKey) r0
            if (r0 == 0) goto L_0x005a
            java.lang.String r0 = r0.f11001a
            if (r0 == 0) goto L_0x005a
            r3 = r0
            goto L_0x005b
        L_0x005a:
            r3 = r9
        L_0x005b:
            java.lang.String r0 = "ApiKey must be set."
            p005b.p006a.p007a.p024o.C0823f.m374i(r3, r0)
            b.l.d.l r10 = new b.l.d.l
            r4 = 0
            r6 = 0
            r11 = 0
            r0 = r10
            r1 = r2
            r2 = r3
            r3 = r4
            r4 = r6
            r6 = r11
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            java.lang.String r0 = "FirebaseOptions.Builder(…\n                .build()"
            p298d.p344x.p346c.C6888i.m12437d(r10, r0)
            com.appfoundry.previewer.BravoApp$b r0 = com.appfoundry.previewer.BravoApp.f10730N
            p298d.p344x.p346c.C6888i.m12438e(r13, r8)
            com.appfoundry.previewer.model.FirebaseProjectInfo r13 = r13.f11006a
            if (r13 == 0) goto L_0x0081
            java.lang.String r13 = r13.f11010c
            if (r13 == 0) goto L_0x0081
            r9 = r13
        L_0x0081:
            java.lang.String r13 = "context"
            p298d.p344x.p346c.C6888i.m12439f(r12, r13)
            java.lang.String r13 = "options"
            p298d.p344x.p346c.C6888i.m12439f(r10, r13)
            java.lang.String r13 = "name"
            p298d.p344x.p346c.C6888i.m12439f(r9, r13)
            b.l.d.d r13 = p005b.p096l.p180d.C3825d.m7210g(r12, r10, r9)
            java.lang.String r0 = "FirebaseApp.initializeApp(context, options, name)"
            p298d.p344x.p346c.C6888i.m12435b(r13, r0)
            java.lang.String r0 = "app"
            p298d.p344x.p346c.C6888i.m12438e(r13, r0)
            com.google.firebase.auth.FirebaseAuth r13 = com.google.firebase.auth.FirebaseAuth.getInstance(r13)
            java.lang.String r0 = "FirebaseAuth.getInstance(app)"
            p298d.p344x.p346c.C6888i.m12437d(r13, r0)
            com.appfoundry.previewer.BravoApp.f10718B = r13
        L_0x00a9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appfoundry.previewer.activities.BravoActivity.mo18373E(com.appfoundry.previewer.model.FirebaseConfigJson):void");
    }

    /* renamed from: F */
    public final boolean mo18374F() {
        DrawerLayout drawerLayout;
        if (!C0849e.m475D0() || (drawerLayout = (DrawerLayout) findViewById(R.id.drawer_menu)) == null) {
            return false;
        }
        return drawerLayout.isDrawerOpen((int) GravityCompat.START);
    }

    /* renamed from: G */
    public final void mo18375G(String str, String str2) {
        if (str2 != null) {
            C7844g0 b = C7844g0.C7845a.m14247b(C7844g0.f15540a, (C7829b0) null, new byte[0], 0, 0, 12);
            C7839e0.C7840a m = C0820c.m313m();
            m.mo25540f(str2);
            m.mo25538d(b);
            C7839e0 a = m.mo25535a();
            Fragment q = mo18418q(C0823f.m339H(str));
            RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.main_progressbar);
            relativeLayout.setBackgroundResource(0);
            mo18426y(true, q, relativeLayout);
            ((C7887e) BravoApp.f10730N.mo18363c().mo25525a(a)).mo25622g(new C5437v(this, q, relativeLayout));
            return;
        }
        C8091a.f16272d.mo26044b("TriggerUrl is null", new Object[0]);
        Toast.makeText(this, "Missing trigger url", 0).show();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0096, code lost:
        if (r2 != false) goto L_0x0098;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean dispatchTouchEvent(android.view.MotionEvent r11) {
        /*
            r10 = this;
            java.lang.String r0 = "event"
            p298d.p344x.p346c.C6888i.m12438e(r11, r0)
            com.appfoundry.previewer.BravoApp$b r0 = com.appfoundry.previewer.BravoApp.f10730N
            boolean r0 = com.appfoundry.previewer.BravoApp.f10721E
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L_0x001b
            boolean r0 = p005b.p006a.p007a.p024o.C0820c.m302b()
            if (r0 == 0) goto L_0x001b
            boolean r0 = p005b.p006a.p007a.p024o.C0820c.m324x()
            if (r0 != 0) goto L_0x001b
            r0 = r1
            goto L_0x001c
        L_0x001b:
            r0 = r2
        L_0x001c:
            if (r0 == 0) goto L_0x00d4
            int r0 = r11.getAction()
            if (r0 != 0) goto L_0x003b
            long r0 = java.lang.System.currentTimeMillis()
            r10.f10756h = r0
            float r0 = r11.getY()
            r10.f10757i = r0
            float r0 = r11.getX()
            r10.f10758j = r0
        L_0x0036:
            boolean r11 = super.dispatchTouchEvent(r11)
            return r11
        L_0x003b:
            int r0 = r11.getAction()
            r3 = 2
            r4 = 700(0x2bc, double:3.46E-321)
            if (r0 != r3) goto L_0x009f
            long r6 = java.lang.System.currentTimeMillis()
            long r8 = r10.f10756h
            long r6 = r6 - r8
            int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x0061
            boolean r0 = p005b.p006a.p007a.p024o.C0820c.m302b()
            if (r0 == 0) goto L_0x0061
            boolean r0 = p005b.p006a.p007a.p024o.C0820c.m324x()
            if (r0 != 0) goto L_0x0061
            boolean r0 = r10.f10759k
            if (r0 != 0) goto L_0x0061
            r0 = r1
            goto L_0x0062
        L_0x0061:
            r0 = r2
        L_0x0062:
            if (r0 == 0) goto L_0x0068
            p005b.p038f.p039a.C0849e.m528l0(r10)
            return r2
        L_0x0068:
            float r0 = r11.getY()
            float r0 = java.lang.Math.abs(r0)
            float r3 = r10.f10757i
            float r0 = r0 - r3
            float r0 = java.lang.Math.abs(r0)
            r3 = 1106247680(0x41f00000, float:30.0)
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 <= 0) goto L_0x007f
            r0 = r1
            goto L_0x0080
        L_0x007f:
            r0 = r2
        L_0x0080:
            if (r0 != 0) goto L_0x0098
            float r0 = r11.getX()
            float r0 = java.lang.Math.abs(r0)
            float r4 = r10.f10758j
            float r0 = r0 - r4
            float r0 = java.lang.Math.abs(r0)
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 <= 0) goto L_0x0096
            r2 = r1
        L_0x0096:
            if (r2 == 0) goto L_0x009a
        L_0x0098:
            r10.f10759k = r1
        L_0x009a:
            boolean r11 = super.dispatchTouchEvent(r11)
            return r11
        L_0x009f:
            int r0 = r11.getAction()
            if (r0 != r1) goto L_0x00d4
            long r6 = java.lang.System.currentTimeMillis()
            long r8 = r10.f10756h
            long r6 = r6 - r8
            int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r0 < 0) goto L_0x00b1
            goto L_0x00b2
        L_0x00b1:
            r1 = r2
        L_0x00b2:
            r3 = 0
            if (r1 == 0) goto L_0x00ce
            boolean r0 = r10.f10759k
            if (r0 != 0) goto L_0x00ce
            r10.f10756h = r3
            r10.f10759k = r2
            boolean r11 = p005b.p006a.p007a.p024o.C0820c.m302b()
            if (r11 == 0) goto L_0x00cd
            boolean r11 = p005b.p006a.p007a.p024o.C0820c.m324x()
            if (r11 != 0) goto L_0x00cd
            p005b.p038f.p039a.C0849e.m528l0(r10)
        L_0x00cd:
            return r2
        L_0x00ce:
            r10.f10756h = r3
            r10.f10759k = r2
            goto L_0x0036
        L_0x00d4:
            boolean r11 = super.dispatchTouchEvent(r11)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appfoundry.previewer.activities.BravoActivity.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    public void finish() {
        C0817f fVar = C0817f.f641b;
        C0817f.m297e("restart_with_previewer");
        super.finish();
    }

    /* renamed from: g */
    public final void mo18378g() {
        C0817f fVar = C0817f.f641b;
        StringBuilder sb = new StringBuilder();
        Context a = C0849e.m505a();
        C6888i.m12437d(a, "appContext()");
        sb.append(a.getPackageName());
        sb.append(C0823f.m332B());
        sb.append("app_user_logged_in");
        C0817f.m293a(sb.toString());
        StringBuilder sb2 = new StringBuilder();
        Context a2 = C0849e.m505a();
        C6888i.m12437d(a2, "appContext()");
        sb2.append(a2.getPackageName());
        sb2.append(C0823f.m332B());
        sb2.append("app_oauth_token");
        C0817f.m293a(sb2.toString());
        StringBuilder sb3 = new StringBuilder();
        Context a3 = C0849e.m505a();
        C6888i.m12437d(a3, "appContext()");
        sb3.append(a3.getPackageName());
        sb3.append(C0823f.m332B());
        sb3.append("firebase_id_token");
        C0817f.m293a(sb3.toString());
        StringBuilder sb4 = new StringBuilder();
        Context a4 = C0849e.m505a();
        C6888i.m12437d(a4, "appContext()");
        sb4.append(a4.getPackageName());
        sb4.append(C0823f.m332B());
        sb4.append("bravo_id_token");
        C0817f.m293a(sb4.toString());
        BravoApp.f10730N.mo18365e();
    }

    /* renamed from: h */
    public final void mo18379h() {
        C0817f fVar = C0817f.f641b;
        StringBuilder sb = new StringBuilder();
        Context a = C0849e.m505a();
        C6888i.m12437d(a, "appContext()");
        sb.append(a.getPackageName());
        sb.append("after_logout");
        C0817f.m297e(sb.toString());
        StringBuilder sb2 = new StringBuilder();
        Context a2 = C0849e.m505a();
        C6888i.m12437d(a2, "appContext()");
        sb2.append(a2.getPackageName());
        sb2.append("user_logged_in");
        C0817f.m293a(sb2.toString());
        C0817f.m293a("auth_token");
        BravoApp.C5403b bVar = BravoApp.f10730N;
        JsonApp u = C0820c.m321u(R.raw.previewer_figma);
        BravoApp.f10737m = u;
        BravoApp.f10738n = u;
        bVar.mo18365e();
    }

    /* renamed from: o */
    public final void mo18380o() {
        if (C0849e.m475D0()) {
            if (this.f10755g == null) {
                this.f10755g = (DrawerLayout) findViewById(R.id.drawer_menu);
            }
            DrawerLayout drawerLayout = this.f10755g;
            C6888i.m12436c(drawerLayout);
            if (drawerLayout.isDrawerOpen((int) GravityCompat.START)) {
                DrawerLayout drawerLayout2 = this.f10755g;
                C6888i.m12436c(drawerLayout2);
                drawerLayout2.closeDrawer((int) GravityCompat.START);
            }
        } else if (C6888i.m12434a(C0849e.m490L(), "menu:modal")) {
            BravoApp.C5403b bVar = BravoApp.f10730N;
            BravoApp.f10744t = false;
            BottomSheetFragment bottomSheetFragment = BravoApp.f10743s;
            if (bottomSheetFragment != null) {
                bottomSheetFragment.dismiss();
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: b.a.a.j.e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: b.a.a.j.e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v15, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v6, resolved type: b.a.a.j.e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v4, resolved type: b.a.a.j.e} */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0026, code lost:
        r3 = (r3 = (android.net.ConnectivityManager) r3).getNetworkCapabilities((r4 = r3.getActiveNetwork()));
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onActivityResult(int r23, int r24, android.content.Intent r25) {
        /*
            r22 = this;
            r8 = r22
            r0 = r23
            r1 = r24
            r2 = r25
            super.onActivityResult(r23, r24, r25)
            java.lang.String r3 = "$this$isNetworkAvailable"
            p298d.p344x.p346c.C6888i.m12438e(r8, r3)
            java.lang.String r3 = "connectivity"
            java.lang.Object r3 = r8.getSystemService(r3)
            r9 = 1
            r10 = 0
            if (r3 == 0) goto L_0x0043
            boolean r4 = r3 instanceof android.net.ConnectivityManager
            if (r4 == 0) goto L_0x0043
            android.net.ConnectivityManager r3 = (android.net.ConnectivityManager) r3
            android.net.Network r4 = r3.getActiveNetwork()
            if (r4 == 0) goto L_0x0043
            android.net.NetworkCapabilities r3 = r3.getNetworkCapabilities(r4)
            if (r3 == 0) goto L_0x0043
            boolean r4 = r3.hasTransport(r9)
            if (r4 == 0) goto L_0x0033
            goto L_0x0041
        L_0x0033:
            boolean r4 = r3.hasTransport(r10)
            if (r4 == 0) goto L_0x003a
            goto L_0x0041
        L_0x003a:
            r4 = 3
            boolean r3 = r3.hasTransport(r4)
            if (r3 == 0) goto L_0x0043
        L_0x0041:
            r3 = r9
            goto L_0x0044
        L_0x0043:
            r3 = r10
        L_0x0044:
            if (r3 == 0) goto L_0x03b0
            java.util.Collection<java.lang.String> r3 = p005b.p096l.p232f.p233a0.p234a.C4485a.f8342e
            r3 = 49374(0xc0de, float:6.9188E-41)
            r4 = 0
            if (r0 != r3) goto L_0x008d
            r3 = -1
            if (r1 != r3) goto L_0x0087
            java.lang.String r3 = "SCAN_RESULT"
            java.lang.String r12 = r2.getStringExtra(r3)
            java.lang.String r3 = "SCAN_RESULT_FORMAT"
            java.lang.String r13 = r2.getStringExtra(r3)
            java.lang.String r3 = "SCAN_RESULT_BYTES"
            byte[] r14 = r2.getByteArrayExtra(r3)
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            java.lang.String r5 = "SCAN_RESULT_ORIENTATION"
            int r5 = r2.getIntExtra(r5, r3)
            if (r5 != r3) goto L_0x006f
            r15 = r4
            goto L_0x0074
        L_0x006f:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r5)
            r15 = r3
        L_0x0074:
            java.lang.String r3 = "SCAN_RESULT_ERROR_CORRECTION_LEVEL"
            java.lang.String r16 = r2.getStringExtra(r3)
            java.lang.String r3 = "SCAN_RESULT_IMAGE_PATH"
            java.lang.String r17 = r2.getStringExtra(r3)
            b.l.f.a0.a.b r3 = new b.l.f.a0.a.b
            r11 = r3
            r11.<init>(r12, r13, r14, r15, r16, r17)
            goto L_0x008e
        L_0x0087:
            b.l.f.a0.a.b r3 = new b.l.f.a0.a.b
            r3.<init>()
            goto L_0x008e
        L_0x008d:
            r3 = r4
        L_0x008e:
            r5 = 2
            if (r3 == 0) goto L_0x0107
            java.lang.String r3 = r3.f8348a
            if (r3 == 0) goto L_0x0107
            java.lang.String r6 = "$this$containsBravoJson"
            p298d.p344x.p346c.C6888i.m12438e(r3, r6)
            java.lang.String r6 = "^https:\\/\\/[^\\/]+\\/devices\\/apps\\/.*$"
            java.util.regex.Pattern r6 = java.util.regex.Pattern.compile(r6)
            java.util.regex.Matcher r6 = r6.matcher(r3)
            boolean r6 = r6.find()
            if (r6 == 0) goto L_0x00d4
            b.a.a.f.a r6 = p005b.p006a.p007a.p015f.C0688a.f391b
            java.lang.String r6 = "url"
            com.segment.analytics.Analytics r7 = p005b.p035e.p036a.p037a.C0843a.m435K(r3, r6)
            java.lang.String r11 = p005b.p006a.p007a.p015f.C0688a.m185c()
            java.util.UUID r12 = java.util.UUID.randomUUID()
            java.lang.String r12 = r12.toString()
            java.lang.String r13 = "java.util.UUID.randomUUID().toString()"
            p298d.p344x.p346c.C6888i.m12437d(r12, r13)
            com.segment.analytics.Properties r11 = p005b.p006a.p007a.p015f.C0688a.m184b(r11, r12)
            com.segment.analytics.Properties r6 = r11.putValue((java.lang.String) r6, (java.lang.Object) r3)
            java.lang.String r11 = "QR Scanned"
            r7.track(r11, r6)
            p005b.p038f.p039a.C0849e.m477E0(r8, r3, r9)
            goto L_0x0107
        L_0x00d4:
            java.lang.String r6 = "$this$isUrl"
            p298d.p344x.p346c.C6888i.m12438e(r3, r6)
            java.util.regex.Pattern r6 = android.util.Patterns.WEB_URL
            java.util.regex.Matcher r6 = r6.matcher(r3)
            boolean r6 = r6.matches()
            if (r6 == 0) goto L_0x0104
            java.lang.String r6 = "http"
            boolean r6 = p298d.p415c0.C7694h.m13910A(r3, r6, r10, r5)
            if (r6 != 0) goto L_0x00f1
            java.lang.String r3 = android.webkit.URLUtil.guessUrl(r3)
        L_0x00f1:
            android.content.Intent r6 = new android.content.Intent
            java.lang.String r7 = "android.intent.action.VIEW"
            r6.<init>(r7)
            android.net.Uri r3 = android.net.Uri.parse(r3)
            android.content.Intent r3 = r6.setData(r3)
            r8.startActivity(r3)
            goto L_0x0107
        L_0x0104:
            p005b.p038f.p039a.C0849e.m471B0(r8, r3)
        L_0x0107:
            if (r1 != r5) goto L_0x010b
            r3 = r9
            goto L_0x010c
        L_0x010b:
            r3 = r10
        L_0x010c:
            if (r3 == 0) goto L_0x012c
            r3 = 21
            if (r0 == r3) goto L_0x011d
            r3 = 22
            if (r0 == r3) goto L_0x011d
            r3 = 23
            if (r0 != r3) goto L_0x011b
            goto L_0x011d
        L_0x011b:
            r3 = r10
            goto L_0x011e
        L_0x011d:
            r3 = r9
        L_0x011e:
            if (r3 == 0) goto L_0x012c
            o.a.a.c r3 = p437o.p438a.p439a.C8068c.m14948b()
            b.a.a.h.j r5 = new b.a.a.h.j
            r5.<init>()
            r3.mo26008g(r5)
        L_0x012c:
            r3 = 55
            if (r0 == r3) goto L_0x039c
            java.lang.String r3 = "null cannot be cast to non-null type android.widget.FrameLayout"
            r5 = 1051260355(0x3ea8f5c3, float:0.33)
            java.lang.String r6 = "context"
            switch(r0) {
                case 21: goto L_0x037a;
                case 22: goto L_0x036d;
                case 23: goto L_0x0363;
                case 24: goto L_0x0244;
                case 25: goto L_0x013c;
                default: goto L_0x013a;
            }
        L_0x013a:
            goto L_0x03b5
        L_0x013c:
            boolean r0 = p005b.p038f.p039a.C0849e.m526k0(r24)
            if (r0 == 0) goto L_0x03b5
            b.a.a.n.d r0 = p005b.p006a.p007a.p023n.C0812d.f622f
            if (r2 == 0) goto L_0x015d
            java.lang.String r1 = "$this$getFilePickResult"
            p298d.p344x.p346c.C6888i.m12438e(r2, r1)
            java.lang.String r1 = "extraFileResults"
            java.util.ArrayList r1 = r2.getParcelableArrayListExtra(r1)
            if (r1 == 0) goto L_0x015a
            java.lang.Object r1 = r1.get(r10)
            b.f.a.a r1 = (p005b.p038f.p039a.C0844a) r1
            goto L_0x015b
        L_0x015a:
            r1 = r4
        L_0x015b:
            r11 = r1
            goto L_0x015e
        L_0x015d:
            r11 = r4
        L_0x015e:
            p298d.p344x.p346c.C6888i.m12438e(r8, r6)
            if (r11 == 0) goto L_0x03b5
            b.a.a.h.o r1 = p005b.p006a.p007a.p023n.C0812d.f621e     // Catch:{ SecurityException -> 0x0216 }
            if (r1 == 0) goto L_0x0170
            android.widget.TextView r1 = r1.f425c     // Catch:{ SecurityException -> 0x0216 }
            if (r1 == 0) goto L_0x0170
            java.lang.String r2 = r11.f699h     // Catch:{ SecurityException -> 0x0216 }
            r1.setText(r2)     // Catch:{ SecurityException -> 0x0216 }
        L_0x0170:
            android.widget.ProgressBar r1 = new android.widget.ProgressBar     // Catch:{ SecurityException -> 0x0216 }
            r1.<init>(r8)     // Catch:{ SecurityException -> 0x0216 }
            r1.setScaleX(r5)     // Catch:{ SecurityException -> 0x0216 }
            r1.setScaleY(r5)     // Catch:{ SecurityException -> 0x0216 }
            b.a.a.j.f r7 = new b.a.a.j.f     // Catch:{ SecurityException -> 0x0216 }
            b.a.a.h.o r2 = p005b.p006a.p007a.p023n.C0812d.f621e     // Catch:{ SecurityException -> 0x0216 }
            if (r2 == 0) goto L_0x0184
            java.lang.String r2 = r2.f424b     // Catch:{ SecurityException -> 0x0216 }
            goto L_0x0185
        L_0x0184:
            r2 = r4
        L_0x0185:
            r7.<init>(r2, r1, r10)     // Catch:{ SecurityException -> 0x0216 }
            java.util.List<b.a.a.j.f> r2 = p005b.p006a.p007a.p023n.C0812d.f618b     // Catch:{ SecurityException -> 0x0216 }
            java.util.Iterator r5 = r2.iterator()     // Catch:{ SecurityException -> 0x0216 }
        L_0x018e:
            boolean r6 = r5.hasNext()     // Catch:{ SecurityException -> 0x0216 }
            if (r6 == 0) goto L_0x01a6
            java.lang.Object r6 = r5.next()     // Catch:{ SecurityException -> 0x0216 }
            r12 = r6
            b.a.a.j.f r12 = (p005b.p006a.p007a.p019j.C0775f) r12     // Catch:{ SecurityException -> 0x0216 }
            java.lang.String r12 = r12.f536a     // Catch:{ SecurityException -> 0x0216 }
            java.lang.String r13 = r7.f536a     // Catch:{ SecurityException -> 0x0216 }
            boolean r12 = p298d.p344x.p346c.C6888i.m12434a(r12, r13)     // Catch:{ SecurityException -> 0x0216 }
            if (r12 == 0) goto L_0x018e
            goto L_0x01a7
        L_0x01a6:
            r6 = r4
        L_0x01a7:
            if (r6 != 0) goto L_0x01ac
            r2.add(r7)     // Catch:{ SecurityException -> 0x0216 }
        L_0x01ac:
            b.a.a.h.o r2 = p005b.p006a.p007a.p023n.C0812d.f621e     // Catch:{ SecurityException -> 0x0216 }
            if (r2 == 0) goto L_0x01ca
            android.widget.TextView r2 = r2.f425c     // Catch:{ SecurityException -> 0x0216 }
            if (r2 == 0) goto L_0x01ca
            android.view.ViewParent r5 = r2.getParent()     // Catch:{ SecurityException -> 0x0216 }
            if (r5 == 0) goto L_0x01c4
            android.widget.FrameLayout r5 = (android.widget.FrameLayout) r5     // Catch:{ SecurityException -> 0x0216 }
            android.view.ViewGroup$LayoutParams r2 = r2.getLayoutParams()     // Catch:{ SecurityException -> 0x0216 }
            r5.addView(r1, r2)     // Catch:{ SecurityException -> 0x0216 }
            goto L_0x01ca
        L_0x01c4:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException     // Catch:{ SecurityException -> 0x0216 }
            r0.<init>(r3)     // Catch:{ SecurityException -> 0x0216 }
            throw r0     // Catch:{ SecurityException -> 0x0216 }
        L_0x01ca:
            d.x.c.t r12 = new d.x.c.t     // Catch:{ SecurityException -> 0x0216 }
            r12.<init>()     // Catch:{ SecurityException -> 0x0216 }
            r12.f13799g = r10     // Catch:{ SecurityException -> 0x0216 }
            java.util.Map<java.lang.String, java.util.List<b.a.a.j.e>> r1 = p005b.p006a.p007a.p023n.C0812d.f617a     // Catch:{ SecurityException -> 0x0216 }
            b.a.a.h.o r2 = p005b.p006a.p007a.p023n.C0812d.f621e     // Catch:{ SecurityException -> 0x0216 }
            if (r2 == 0) goto L_0x01da
            java.lang.String r2 = r2.f423a     // Catch:{ SecurityException -> 0x0216 }
            goto L_0x01db
        L_0x01da:
            r2 = r4
        L_0x01db:
            java.lang.Object r1 = r1.get(r2)     // Catch:{ SecurityException -> 0x0216 }
            r2 = r1
            java.util.List r2 = (java.util.List) r2     // Catch:{ SecurityException -> 0x0216 }
            if (r2 == 0) goto L_0x0209
            l.a.w r1 = p416l.p417a.C7725h0.f15273a     // Catch:{ SecurityException -> 0x0216 }
            l.a.g1 r1 = p416l.p417a.p419u1.C7785l.f15351b     // Catch:{ SecurityException -> 0x0216 }
            l.a.o r3 = p005b.p291q.p292a.C5266a.m9959h(r4, r9, r4)     // Catch:{ SecurityException -> 0x0216 }
            d.v.f r1 = r1.plus(r3)     // Catch:{ SecurityException -> 0x0216 }
            l.a.y r13 = p005b.p291q.p292a.C5266a.m9953g(r1)     // Catch:{ SecurityException -> 0x0216 }
            r14 = 0
            r15 = 0
            b.a.a.n.b r16 = new b.a.a.n.b     // Catch:{ SecurityException -> 0x0216 }
            r3 = 0
            r1 = r16
            r4 = r11
            r5 = r22
            r6 = r12
            r1.<init>(r2, r3, r4, r5, r6, r7)     // Catch:{ SecurityException -> 0x0216 }
            r17 = 3
            r18 = 0
            p005b.p291q.p292a.C5266a.m9880S2(r13, r14, r15, r16, r17, r18)     // Catch:{ SecurityException -> 0x0216 }
        L_0x0209:
            int r1 = r12.f13799g     // Catch:{ SecurityException -> 0x0216 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ SecurityException -> 0x0216 }
            b.a.a.h.o r2 = p005b.p006a.p007a.p023n.C0812d.f621e     // Catch:{ SecurityException -> 0x0216 }
            r0.mo10635a(r11, r1, r2)     // Catch:{ SecurityException -> 0x0216 }
            goto L_0x03b5
        L_0x0216:
            r0 = move-exception
            java.lang.Object[] r1 = new java.lang.Object[r9]
            java.lang.String r2 = r0.getLocalizedMessage()
            r1[r10] = r2
            p.a.a$b r2 = p441p.p442a.C8091a.f16272d
            java.lang.String r3 = "Error processing file upload: %s"
            r2.mo26044b(r3, r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Error processing file upload: "
            r1.append(r2)
            java.lang.String r0 = r0.getLocalizedMessage()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            android.widget.Toast r0 = android.widget.Toast.makeText(r8, r0, r10)
            r0.show()
            goto L_0x03b5
        L_0x0244:
            boolean r0 = p005b.p038f.p039a.C0849e.m526k0(r24)
            if (r0 == 0) goto L_0x03b5
            b.a.a.n.d r0 = p005b.p006a.p007a.p023n.C0812d.f622f
            com.github.dhaval2404.imagepicker.ImagePicker$Companion r0 = com.github.dhaval2404.imagepicker.ImagePicker.Companion
            java.io.File r0 = r0.getFile(r2)
            p298d.p344x.p346c.C6888i.m12438e(r8, r6)
            if (r0 == 0) goto L_0x0359
            b.a.a.h.p r1 = p005b.p006a.p007a.p023n.C0812d.f620d
            if (r1 == 0) goto L_0x029e
            android.widget.ImageView r11 = r1.f429c
            if (r11 == 0) goto L_0x029e
            java.lang.String r2 = "$this$setupWithInputImageEvent"
            p298d.p344x.p346c.C6888i.m12438e(r11, r2)
            com.appfoundry.previewer.model.Asset r2 = new com.appfoundry.previewer.model.Asset
            java.lang.String r6 = r0.getAbsolutePath()
            if (r6 == 0) goto L_0x026d
            goto L_0x026f
        L_0x026d:
            java.lang.String r6 = ""
        L_0x026f:
            r13 = r6
            java.lang.String r14 = r0.getAbsolutePath()
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 64
            r21 = 0
            r12 = r2
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20, r21)
            java.lang.String r12 = r1.f427a
            java.lang.String r13 = r1.f428b
            com.appfoundry.previewer.model.Style r15 = r1.f430d
            int r6 = r1.f431e
            int r7 = r1.f432f
            int r1 = r1.f433g
            java.lang.String r14 = "component:input-image"
            r16 = r6
            r17 = r7
            r18 = r2
            r19 = r1
            p005b.p006a.p007a.p018i.C0744e.m192E(r11, r12, r13, r14, r15, r16, r17, r18, r19)
        L_0x029e:
            android.widget.ProgressBar r1 = new android.widget.ProgressBar
            r1.<init>(r8)
            r1.setScaleX(r5)
            r1.setScaleY(r5)
            b.a.a.j.g r2 = new b.a.a.j.g
            b.a.a.h.p r5 = p005b.p006a.p007a.p023n.C0812d.f620d
            if (r5 == 0) goto L_0x02b2
            java.lang.String r5 = r5.f428b
            goto L_0x02b3
        L_0x02b2:
            r5 = r4
        L_0x02b3:
            r2.<init>(r5, r1, r10)
            java.util.List<b.a.a.j.g> r5 = p005b.p006a.p007a.p023n.C0812d.f619c
            java.util.Iterator r6 = r5.iterator()
        L_0x02bc:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x02d4
            java.lang.Object r7 = r6.next()
            r10 = r7
            b.a.a.j.g r10 = (p005b.p006a.p007a.p019j.C0776g) r10
            java.lang.String r10 = r10.f539a
            java.lang.String r11 = r2.f539a
            boolean r10 = p298d.p344x.p346c.C6888i.m12434a(r10, r11)
            if (r10 == 0) goto L_0x02bc
            goto L_0x02d5
        L_0x02d4:
            r7 = r4
        L_0x02d5:
            if (r7 != 0) goto L_0x02da
            r5.add(r2)
        L_0x02da:
            b.a.a.h.p r5 = p005b.p006a.p007a.p023n.C0812d.f620d
            if (r5 == 0) goto L_0x02f2
            android.widget.ImageView r5 = r5.f429c
            if (r5 == 0) goto L_0x02f2
            android.view.ViewParent r6 = r5.getParent()
            java.util.Objects.requireNonNull(r6, r3)
            android.widget.FrameLayout r6 = (android.widget.FrameLayout) r6
            android.view.ViewGroup$LayoutParams r3 = r5.getLayoutParams()
            r6.addView(r1, r3)
        L_0x02f2:
            java.util.Map<java.lang.String, java.util.List<b.a.a.j.e>> r1 = p005b.p006a.p007a.p023n.C0812d.f617a
            b.a.a.h.p r3 = p005b.p006a.p007a.p023n.C0812d.f620d
            if (r3 == 0) goto L_0x02fb
            java.lang.String r3 = r3.f427a
            goto L_0x02fc
        L_0x02fb:
            r3 = r4
        L_0x02fc:
            java.lang.Object r1 = r1.get(r3)
            java.util.List r1 = (java.util.List) r1
            if (r1 == 0) goto L_0x0320
            l.a.w r3 = p416l.p417a.C7725h0.f15273a
            l.a.g1 r3 = p416l.p417a.p419u1.C7785l.f15351b
            l.a.o r5 = p005b.p291q.p292a.C5266a.m9959h(r4, r9, r4)
            d.v.f r3 = r3.plus(r5)
            l.a.y r9 = p005b.p291q.p292a.C5266a.m9953g(r3)
            r10 = 0
            r11 = 0
            b.a.a.n.c r12 = new b.a.a.n.c
            r12.<init>(r1, r4, r8, r2)
            r13 = 3
            r14 = 0
            p005b.p291q.p292a.C5266a.m9880S2(r9, r10, r11, r12, r13, r14)
        L_0x0320:
            b.a.a.h.p r1 = p005b.p006a.p007a.p023n.C0812d.f620d
            java.util.Map<java.lang.String, java.util.List<b.a.a.j.e>> r2 = p005b.p006a.p007a.p023n.C0812d.f617a
            if (r1 == 0) goto L_0x0329
            java.lang.String r3 = r1.f427a
            goto L_0x032a
        L_0x0329:
            r3 = r4
        L_0x032a:
            java.lang.Object r2 = r2.get(r3)
            java.util.List r2 = (java.util.List) r2
            if (r2 == 0) goto L_0x03b5
            java.util.Iterator r2 = r2.iterator()
        L_0x0336:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0352
            java.lang.Object r3 = r2.next()
            r5 = r3
            b.a.a.j.e r5 = (p005b.p006a.p007a.p019j.C0774e) r5
            java.lang.String r5 = r5.f528b
            if (r1 == 0) goto L_0x034a
            java.lang.String r6 = r1.f428b
            goto L_0x034b
        L_0x034a:
            r6 = r4
        L_0x034b:
            boolean r5 = p298d.p344x.p346c.C6888i.m12434a(r5, r6)
            if (r5 == 0) goto L_0x0336
            r4 = r3
        L_0x0352:
            b.a.a.j.e r4 = (p005b.p006a.p007a.p019j.C0774e) r4
            if (r4 == 0) goto L_0x03b5
            r4.f530d = r0
            goto L_0x03b5
        L_0x0359:
            java.lang.Object[] r0 = new java.lang.Object[r10]
            p.a.a$b r1 = p441p.p442a.C8091a.f16272d
            java.lang.String r2 = "input image file is null"
            r1.mo26044b(r2, r0)
            goto L_0x03b5
        L_0x0363:
            o.a.a.c r0 = p437o.p438a.p439a.C8068c.m14948b()
            b.a.a.h.q0 r1 = new b.a.a.h.q0
            r1.<init>()
            goto L_0x0376
        L_0x036d:
            o.a.a.c r0 = p437o.p438a.p439a.C8068c.m14948b()
            b.a.a.h.p0 r1 = new b.a.a.h.p0
            r1.<init>()
        L_0x0376:
            r0.mo26008g(r1)
            goto L_0x03b5
        L_0x037a:
            if (r2 == 0) goto L_0x03b5
            java.lang.String r0 = r25.getDataString()
            if (r0 == 0) goto L_0x03b5
            o.a.a.c r1 = p437o.p438a.p439a.C8068c.m14948b()
            b.a.a.h.a r2 = new b.a.a.h.a
            android.net.Uri[] r3 = new android.net.Uri[r9]
            android.net.Uri r0 = android.net.Uri.parse(r0)
            java.lang.String r4 = "Uri.parse(it)"
            p298d.p344x.p346c.C6888i.m12437d(r0, r4)
            r3[r10] = r0
            r2.<init>(r3)
            r1.mo26008g(r2)
            goto L_0x03b5
        L_0x039c:
            boolean r0 = p005b.p038f.p039a.C0849e.m526k0(r24)
            if (r0 != 0) goto L_0x03b5
            java.lang.String r0 = "Update flow failed! Result code: "
            java.lang.String r0 = p005b.p035e.p036a.p037a.C0843a.m444e(r0, r1)
            java.lang.Object[] r1 = new java.lang.Object[r10]
            p.a.a$b r2 = p441p.p442a.C8091a.f16272d
            r2.mo26044b(r0, r1)
            goto L_0x03b5
        L_0x03b0:
            java.lang.String r0 = "There is no Internet connection available. Please connect to a WiFi network or make sure your mobile data is enabled"
            p005b.p038f.p039a.C0849e.m471B0(r8, r0)
        L_0x03b5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appfoundry.previewer.activities.BravoActivity.onActivityResult(int, int, android.content.Intent):void");
    }

    @C8083m(threadMode = ThreadMode.MAIN)
    public final void onAddToCalendarEvent(C0693b bVar) {
        Intent intent;
        String str;
        C6888i.m12438e(bVar, "event");
        C0688a aVar = C0688a.f391b;
        String str2 = bVar.f399b;
        C0843a.m435K(str2, "dateString").track("Action Started", C0843a.m436L("java.util.UUID.randomUUID().toString()", C0688a.m185c(), "action_type", "date", "action_data", str2), new Options().setIntegration("Slack", false));
        Intent putExtra = new Intent("android.intent.action.EDIT").setType("vnd.android.cursor.item/event").putExtra("beginTime", bVar.f399b).putExtra("title", bVar.f398a);
        C6888i.m12437d(putExtra, "Intent(Intent.ACTION_EDI…s.TITLE, event.eventName)");
        String str3 = bVar.f400c;
        if (str3 == null || !C0756o.m228f(str3)) {
            intent = putExtra.putExtra("allDay", true);
            str = "calendarIntent.putExtra(…XTRA_EVENT_ALL_DAY, true)";
        } else {
            intent = putExtra.putExtra("endTime", bVar.f400c);
            str = "calendarIntent.putExtra(…_END_TIME, event.endDate)";
        }
        C6888i.m12437d(intent, str);
        startActivity(intent);
    }

    public void onBackPressed() {
        if (mo18374F()) {
            if (this.f10755g == null) {
                this.f10755g = (DrawerLayout) findViewById(R.id.drawer_menu);
            }
            DrawerLayout drawerLayout = this.f10755g;
            if (drawerLayout != null) {
                drawerLayout.closeDrawer((int) GravityCompat.START);
                return;
            }
            return;
        }
        mo18423v();
    }

    @C8083m(threadMode = ThreadMode.MAIN)
    public final void onCloseEvent(C0699e eVar) {
        C6888i.m12438e(eVar, "event");
        BravoApp.C5403b bVar = BravoApp.f10730N;
        Activity activity = BravoApp.f10734j;
        if (activity == null) {
            C6888i.m12446m("foregroundActivity");
            throw null;
        } else if (activity instanceof LongPressActivity) {
            BravoApp.f10746v = false;
            activity.finish();
        } else if (mo18374F()) {
            mo18380o();
        } else if (BravoApp.f10744t && BravoApp.f10743s != null) {
            BravoApp.f10744t = false;
            BottomSheetFragment bottomSheetFragment = BravoApp.f10743s;
            if (bottomSheetFragment != null) {
                bottomSheetFragment.dismiss();
            }
        } else if (C0849e.m533o(this) instanceof AppCompatDialogFragment) {
            Fragment o = C0849e.m533o(this);
            Objects.requireNonNull(o, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatDialogFragment");
            ((AppCompatDialogFragment) o).dismiss();
        } else if (BravoApp.f10724H) {
            onIntroCloseEvent((C0723q) null);
        } else {
            onBackPressed();
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        C6888i.m12438e(configuration, "newConfig");
        super.onConfigurationChanged(configuration);
        int i = configuration.orientation;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:131:0x023d, code lost:
        if (r1 != null) goto L_0x020a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0066, code lost:
        r0 = r0.f11021d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x01d7  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x01da  */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x020c  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x025e  */
    /* JADX WARNING: Removed duplicated region for block: B:161:0x02a9  */
    /* JADX WARNING: Removed duplicated region for block: B:172:0x02f5  */
    /* JADX WARNING: Removed duplicated region for block: B:237:0x03f7  */
    /* JADX WARNING: Removed duplicated region for block: B:242:0x0408  */
    /* JADX WARNING: Removed duplicated region for block: B:250:0x04b1  */
    /* JADX WARNING: Removed duplicated region for block: B:255:0x04d4  */
    /* JADX WARNING: Removed duplicated region for block: B:290:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00ee  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00f1  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00f4  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0125  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x012a  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x013a  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0141  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x014f  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0162  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0165  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x017b A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x0192  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x01ac  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r24) {
        /*
            r23 = this;
            r6 = r23
            super.onCreate(r24)
            r0 = 17432576(0x10a0000, float:2.5346597E-38)
            r1 = 17432577(0x10a0001, float:2.53466E-38)
            r6.overridePendingTransition(r0, r1)
            p005b.p038f.p039a.C0849e.m554y0(r23)
            p005b.p038f.p039a.C0849e.m512d0(r23)
            java.lang.String r0 = p005b.p038f.p039a.C0849e.m490L()
            int r1 = r0.hashCode()
            r2 = -1560939335(0xffffffffa2f5f4b9, float:-6.6666493E-18)
            java.lang.String r3 = "menu:tabs"
            if (r1 == r2) goto L_0x0034
            r2 = -1150525230(0xffffffffbb6c60d2, float:-0.0036068452)
            if (r1 == r2) goto L_0x0028
            goto L_0x003e
        L_0x0028:
            java.lang.String r1 = "menu:modal"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x003e
            r0 = 2131427363(0x7f0b0023, float:1.847634E38)
            goto L_0x0041
        L_0x0034:
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x003e
            r0 = 2131427364(0x7f0b0024, float:1.8476342E38)
            goto L_0x0041
        L_0x003e:
            r0 = 2131427362(0x7f0b0022, float:1.8476338E38)
        L_0x0041:
            r6.setContentView((int) r0)
            r7 = 1
            java.lang.Object[] r0 = new java.lang.Object[r7]
            java.lang.String r1 = p005b.p006a.p007a.p024o.C0823f.m332B()
            r8 = 0
            r0[r8] = r1
            p.a.a$b r1 = p441p.p442a.C8091a.f16272d
            java.lang.String r2 = "BravoActivity created for appId: %s"
            r1.mo26043a(r2, r0)
            p005b.p006a.p007a.p024o.C0820c.m301a()
            boolean r0 = p005b.p006a.p007a.p024o.C0820c.m301a()
            r9 = 2
            r10 = 0
            if (r0 == 0) goto L_0x00dc
            com.appfoundry.previewer.BravoApp$b r0 = com.appfoundry.previewer.BravoApp.f10730N
            com.appfoundry.previewer.model.JsonApp r0 = com.appfoundry.previewer.BravoApp.f10738n
            if (r0 == 0) goto L_0x006d
            com.appfoundry.previewer.model.App r0 = r0.f11021d
            if (r0 == 0) goto L_0x006d
            com.appfoundry.previewer.model.Paywall r0 = r0.f10894h
            goto L_0x006e
        L_0x006d:
            r0 = r10
        L_0x006e:
            if (r0 == 0) goto L_0x0072
            r0 = r7
            goto L_0x0073
        L_0x0072:
            r0 = r8
        L_0x0073:
            if (r0 == 0) goto L_0x00dc
            java.lang.Object[] r0 = new java.lang.Object[r9]
            java.lang.String r2 = p005b.p038f.p039a.C0849e.m507b()
            r0[r8] = r2
            com.appfoundry.previewer.model.JsonApp r2 = com.appfoundry.previewer.BravoApp.f10738n
            if (r2 == 0) goto L_0x0092
            com.appfoundry.previewer.model.App r2 = r2.f11021d
            if (r2 == 0) goto L_0x0092
            com.appfoundry.previewer.model.Paywall r2 = r2.f10894h
            if (r2 == 0) goto L_0x0092
            java.util.List<java.lang.String> r2 = r2.f11088b
            if (r2 == 0) goto L_0x0092
            java.lang.String r2 = r2.toString()
            goto L_0x0093
        L_0x0092:
            r2 = r10
        L_0x0093:
            r0[r7] = r2
            java.lang.String r2 = "User with paywall. App id: %s, Paid features used: %s"
            r1.mo26044b(r2, r0)
            androidx.appcompat.app.AlertDialog$Builder r0 = new androidx.appcompat.app.AlertDialog$Builder
            r0.<init>(r6)
            r1 = 2131755089(0x7f100051, float:1.9141047E38)
            r0.setTitle((int) r1)
            r0.setCancelable(r8)
            com.appfoundry.previewer.model.JsonApp r1 = com.appfoundry.previewer.BravoApp.f10738n
            if (r1 == 0) goto L_0x00b7
            com.appfoundry.previewer.model.App r1 = r1.f11021d
            if (r1 == 0) goto L_0x00b7
            com.appfoundry.previewer.model.Paywall r1 = r1.f10894h
            if (r1 == 0) goto L_0x00b7
            java.lang.String r1 = r1.f11087a
            goto L_0x00b8
        L_0x00b7:
            r1 = r10
        L_0x00b8:
            if (r1 == 0) goto L_0x00bb
            goto L_0x00c7
        L_0x00bb:
            r1 = 2131755087(0x7f10004f, float:1.9141043E38)
            java.lang.String r1 = r6.getString(r1)
            java.lang.String r2 = "getString(R.string.downgraded_user_message)"
            p298d.p344x.p346c.C6888i.m12437d(r1, r2)
        L_0x00c7:
            r0.setMessage((java.lang.CharSequence) r1)
            r1 = 2131755088(0x7f100050, float:1.9141045E38)
            b.a.a.e.o r2 = new b.a.a.e.o
            r2.<init>(r6)
            r0.setPositiveButton((int) r1, (android.content.DialogInterface.OnClickListener) r2)
            androidx.appcompat.app.AlertDialog r0 = r0.create()
            r0.show()
        L_0x00dc:
            com.appfoundry.previewer.model.Page r0 = p005b.p006a.p007a.p024o.C0823f.m336E()
            com.appfoundry.previewer.BravoApp$b r1 = com.appfoundry.previewer.BravoApp.f10730N
            com.appfoundry.previewer.model.JsonApp r1 = com.appfoundry.previewer.BravoApp.f10738n
            if (r1 == 0) goto L_0x00f1
            com.appfoundry.previewer.model.App r2 = r1.f11021d
            if (r2 == 0) goto L_0x00f1
            com.appfoundry.previewer.model.Data r2 = r2.f10891e
            if (r2 == 0) goto L_0x00f1
            java.util.List<com.appfoundry.previewer.model.Page> r2 = r2.f10985b
            goto L_0x00f2
        L_0x00f1:
            r2 = r10
        L_0x00f2:
            if (r2 == 0) goto L_0x011e
            if (r1 == 0) goto L_0x0101
            com.appfoundry.previewer.model.App r1 = r1.f11021d
            if (r1 == 0) goto L_0x0101
            com.appfoundry.previewer.model.Data r1 = r1.f10891e
            if (r1 == 0) goto L_0x0101
            java.util.List<com.appfoundry.previewer.model.Page> r1 = r1.f10985b
            goto L_0x0102
        L_0x0101:
            r1 = r10
        L_0x0102:
            p298d.p344x.p346c.C6888i.m12436c(r1)
            java.util.Iterator r1 = r1.iterator()
        L_0x0109:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x011e
            java.lang.Object r2 = r1.next()
            com.appfoundry.previewer.model.Page r2 = (com.appfoundry.previewer.model.Page) r2
            java.lang.String r4 = "login"
            boolean r4 = p005b.p006a.p007a.p018i.C0744e.m216t(r2, r4)
            if (r4 == 0) goto L_0x0109
            goto L_0x011f
        L_0x011e:
            r2 = r10
        L_0x011f:
            boolean r1 = p005b.p006a.p007a.p024o.C0820c.m324x()
            if (r1 != 0) goto L_0x012a
            com.appfoundry.previewer.model.Page r1 = p005b.p006a.p007a.p024o.C0820c.m307g()
            goto L_0x012b
        L_0x012a:
            r1 = r10
        L_0x012b:
            android.content.Intent r4 = r23.getIntent()
            java.lang.String r5 = "intent"
            p298d.p344x.p346c.C6888i.m12437d(r4, r5)
            android.os.Bundle r4 = r4.getExtras()
            if (r4 == 0) goto L_0x0141
            java.lang.String r11 = "showIntro"
            boolean r4 = r4.getBoolean(r11, r7)
            goto L_0x0142
        L_0x0141:
            r4 = r7
        L_0x0142:
            android.content.Intent r11 = r23.getIntent()
            p298d.p344x.p346c.C6888i.m12437d(r11, r5)
            android.os.Bundle r5 = r11.getExtras()
            if (r5 == 0) goto L_0x0154
            java.lang.String r11 = "showLogin"
            r5.getBoolean(r11, r7)
        L_0x0154:
            b.a.a.n.f r5 = p005b.p006a.p007a.p023n.C0817f.f641b
            java.lang.String r5 = "intro_already_displayed_"
            java.lang.StringBuilder r11 = p005b.p035e.p036a.p037a.C0843a.m460u(r5)
            com.appfoundry.previewer.BravoApp$b r12 = com.appfoundry.previewer.BravoApp.f10730N
            com.appfoundry.previewer.model.JsonApp r12 = com.appfoundry.previewer.BravoApp.f10738n
            if (r12 == 0) goto L_0x0165
            java.lang.String r12 = r12.f11018a
            goto L_0x0166
        L_0x0165:
            r12 = r10
        L_0x0166:
            r11.append(r12)
            java.lang.String r11 = r11.toString()
            boolean r11 = p005b.p006a.p007a.p023n.C0817f.m295c(r11)
            java.lang.Boolean r12 = com.appfoundry.previewer.BravoApp.f10729M
            java.lang.Boolean r13 = java.lang.Boolean.FALSE
            boolean r12 = p298d.p344x.p346c.C6888i.m12434a(r12, r13)
            if (r12 == 0) goto L_0x018f
            if (r0 == 0) goto L_0x018f
            if (r4 == 0) goto L_0x018f
            java.lang.String r4 = r0.f11046n
            if (r4 == 0) goto L_0x018b
            java.lang.String r12 = "always"
            boolean r4 = r4.equals(r12)
            if (r4 == r7) goto L_0x018d
        L_0x018b:
            if (r11 != 0) goto L_0x018f
        L_0x018d:
            r4 = r7
            goto L_0x0190
        L_0x018f:
            r4 = r8
        L_0x0190:
            if (r4 == 0) goto L_0x01ac
            com.appfoundry.previewer.BravoApp.f10724H = r7
            java.lang.StringBuilder r1 = p005b.p035e.p036a.p037a.C0843a.m460u(r5)
            com.appfoundry.previewer.model.JsonApp r2 = com.appfoundry.previewer.BravoApp.f10738n
            if (r2 == 0) goto L_0x019f
            java.lang.String r2 = r2.f11018a
            goto L_0x01a0
        L_0x019f:
            r2 = r10
        L_0x01a0:
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            p005b.p006a.p007a.p023n.C0817f.m297e(r1)
            goto L_0x0258
        L_0x01ac:
            java.lang.String r0 = "appContext()"
            if (r2 == 0) goto L_0x01d4
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            android.content.Context r5 = p005b.p038f.p039a.C0849e.m505a()
            p298d.p344x.p346c.C6888i.m12437d(r5, r0)
            java.lang.String r5 = r5.getPackageName()
            r4.append(r5)
            java.lang.String r5 = "user_logged_in"
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            boolean r4 = p005b.p006a.p007a.p023n.C0817f.m295c(r4)
            if (r4 != 0) goto L_0x01d4
            r4 = r7
            goto L_0x01d5
        L_0x01d4:
            r4 = r8
        L_0x01d5:
            if (r4 == 0) goto L_0x01da
            r11 = r2
            goto L_0x025b
        L_0x01da:
            if (r1 == 0) goto L_0x0207
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            android.content.Context r4 = p005b.p038f.p039a.C0849e.m505a()
            p298d.p344x.p346c.C6888i.m12437d(r4, r0)
            java.lang.String r0 = r4.getPackageName()
            r2.append(r0)
            java.lang.String r0 = p005b.p006a.p007a.p024o.C0823f.m332B()
            r2.append(r0)
            java.lang.String r0 = "app_user_logged_in"
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            boolean r0 = p005b.p006a.p007a.p023n.C0817f.m295c(r0)
            if (r0 != 0) goto L_0x0207
            r0 = r7
            goto L_0x0208
        L_0x0207:
            r0 = r8
        L_0x0208:
            if (r0 == 0) goto L_0x020c
        L_0x020a:
            r0 = r1
            goto L_0x0258
        L_0x020c:
            com.appfoundry.previewer.model.JsonApp r0 = com.appfoundry.previewer.BravoApp.f10738n
            if (r0 == 0) goto L_0x0240
            com.appfoundry.previewer.model.App r0 = r0.f11021d
            if (r0 == 0) goto L_0x0240
            com.appfoundry.previewer.model.Data r0 = r0.f10891e
            if (r0 == 0) goto L_0x0240
            java.util.List<com.appfoundry.previewer.model.Page> r0 = r0.f10985b
            if (r0 == 0) goto L_0x0240
            java.util.Iterator r0 = r0.iterator()
        L_0x0220:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x023a
            java.lang.Object r1 = r0.next()
            r2 = r1
            com.appfoundry.previewer.model.Page r2 = (com.appfoundry.previewer.model.Page) r2
            java.lang.Boolean r2 = r2.f11042j
            if (r2 == 0) goto L_0x0236
            boolean r2 = r2.booleanValue()
            goto L_0x0237
        L_0x0236:
            r2 = r8
        L_0x0237:
            if (r2 == 0) goto L_0x0220
            goto L_0x023b
        L_0x023a:
            r1 = r10
        L_0x023b:
            com.appfoundry.previewer.model.Page r1 = (com.appfoundry.previewer.model.Page) r1
            if (r1 == 0) goto L_0x0240
            goto L_0x020a
        L_0x0240:
            com.appfoundry.previewer.BravoApp$b r0 = com.appfoundry.previewer.BravoApp.f10730N
            com.appfoundry.previewer.model.JsonApp r0 = com.appfoundry.previewer.BravoApp.f10738n
            if (r0 == 0) goto L_0x025a
            com.appfoundry.previewer.model.App r0 = r0.f11021d
            if (r0 == 0) goto L_0x025a
            com.appfoundry.previewer.model.Data r0 = r0.f10891e
            if (r0 == 0) goto L_0x025a
            java.util.List<com.appfoundry.previewer.model.Page> r0 = r0.f10985b
            if (r0 == 0) goto L_0x025a
            java.lang.Object r0 = r0.get(r8)
            com.appfoundry.previewer.model.Page r0 = (com.appfoundry.previewer.model.Page) r0
        L_0x0258:
            r11 = r0
            goto L_0x025b
        L_0x025a:
            r11 = r10
        L_0x025b:
            r12 = 4
            if (r11 == 0) goto L_0x028b
            java.lang.String r0 = "$this$shouldHideMenu"
            p298d.p344x.p346c.C6888i.m12438e(r11, r0)
            java.lang.String r0 = "$this$isIntro"
            p298d.p344x.p346c.C6888i.m12438e(r11, r0)
            java.lang.String r0 = r11.f11033a
            com.appfoundry.previewer.model.Page r1 = p005b.p006a.p007a.p024o.C0823f.m336E()
            if (r1 == 0) goto L_0x0273
            java.lang.String r1 = r1.f11033a
            goto L_0x0274
        L_0x0273:
            r1 = r10
        L_0x0274:
            boolean r0 = p298d.p344x.p346c.C6888i.m12434a(r0, r1)
            if (r0 != 0) goto L_0x0283
            boolean r0 = p005b.p006a.p007a.p018i.C0744e.m219w(r11)
            if (r0 == 0) goto L_0x0281
            goto L_0x0283
        L_0x0281:
            r0 = r8
            goto L_0x0284
        L_0x0283:
            r0 = r7
        L_0x0284:
            if (r0 != r7) goto L_0x028b
            p005b.p038f.p039a.C0849e.m510c0(r23)
            goto L_0x03db
        L_0x028b:
            java.lang.String r0 = "$this$setupMenu"
            p298d.p344x.p346c.C6888i.m12438e(r6, r0)
            com.appfoundry.previewer.model.Page r13 = p005b.p038f.p039a.C0849e.m488K()
            java.lang.String r0 = p005b.p038f.p039a.C0849e.m490L()
            java.lang.String r1 = "menu:slide"
            boolean r1 = p298d.p344x.p346c.C6888i.m12434a(r0, r1)
            if (r1 != 0) goto L_0x02f5
            java.lang.String r1 = "menu:side"
            boolean r1 = p298d.p344x.p346c.C6888i.m12434a(r0, r1)
            if (r1 == 0) goto L_0x02a9
            goto L_0x02f5
        L_0x02a9:
            boolean r0 = p298d.p344x.p346c.C6888i.m12434a(r0, r3)
            if (r0 == 0) goto L_0x03db
            r0 = 2131231223(0x7f0801f7, float:1.807852E38)
            android.view.View r0 = r6.findViewById(r0)
            r14 = r0
            android.widget.FrameLayout r14 = (android.widget.FrameLayout) r14
            java.lang.String r0 = "tabMenu"
            p298d.p344x.p346c.C6888i.m12437d(r14, r0)
            r14.setVisibility(r8)
            android.view.ViewGroup$LayoutParams r0 = r14.getLayoutParams()
            int r1 = p005b.p038f.p039a.C0849e.m494P(r23)
            r0.height = r1
            if (r13 == 0) goto L_0x02d0
            java.util.List<com.appfoundry.previewer.model.Container> r0 = r13.f11038f
            goto L_0x02d1
        L_0x02d0:
            r0 = r10
        L_0x02d1:
            if (r0 == 0) goto L_0x03db
            java.util.List<com.appfoundry.previewer.model.Container> r0 = r13.f11038f
            p298d.p344x.p346c.C6888i.m12436c(r0)
            java.util.Iterator r15 = r0.iterator()
        L_0x02dc:
            boolean r0 = r15.hasNext()
            if (r0 == 0) goto L_0x03db
            java.lang.Object r0 = r15.next()
            com.appfoundry.previewer.model.Container r0 = (com.appfoundry.previewer.model.Container) r0
            java.lang.String r2 = r13.f11033a
            java.lang.Boolean r4 = java.lang.Boolean.FALSE
            r5 = 1120403456(0x42c80000, float:100.0)
            r1 = r23
            r3 = r14
            p005b.p006a.p007a.p018i.C0744e.m201e(r0, r1, r2, r3, r4, r5)
            goto L_0x02dc
        L_0x02f5:
            r0 = 2131231178(0x7f0801ca, float:1.807843E38)
            android.view.View r0 = r6.findViewById(r0)
            com.google.android.material.navigation.NavigationView r0 = (com.google.android.material.navigation.NavigationView) r0
            java.lang.String r1 = "slideMenu"
            p298d.p344x.p346c.C6888i.m12437d(r0, r1)
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
            com.appfoundry.previewer.model.Page r2 = p005b.p038f.p039a.C0849e.m488K()
            if (r2 == 0) goto L_0x0338
            java.util.List<com.appfoundry.previewer.model.Container> r2 = r2.f11038f
            if (r2 == 0) goto L_0x0338
            java.util.Iterator r2 = r2.iterator()
            r3 = r8
        L_0x0316:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x0339
            java.lang.Object r4 = r2.next()
            com.appfoundry.previewer.model.Container r4 = (com.appfoundry.previewer.model.Container) r4
            java.lang.String r4 = r4.f10969c
            com.appfoundry.previewer.model.Style r4 = p005b.p006a.p007a.p024o.C0823f.m346O(r4, r10, r9)
            if (r4 == 0) goto L_0x032d
            java.lang.Float r5 = r4.f11148i
            goto L_0x032e
        L_0x032d:
            r5 = r10
        L_0x032e:
            if (r5 == 0) goto L_0x0316
            int r4 = p005b.p038f.p039a.C0849e.m550w0(r4)
            if (r4 <= r3) goto L_0x0316
            r3 = r4
            goto L_0x0316
        L_0x0338:
            r3 = r8
        L_0x0339:
            r1.width = r3
            r1 = 2131230917(0x7f0800c5, float:1.80779E38)
            android.view.View r1 = r6.findViewById(r1)
            androidx.drawerlayout.widget.DrawerLayout r1 = (androidx.drawerlayout.widget.DrawerLayout) r1
            if (r1 == 0) goto L_0x0349
            r1.setDrawerLockMode(r8)
        L_0x0349:
            if (r13 == 0) goto L_0x034e
            com.appfoundry.previewer.model.Container r1 = r13.f11041i
            goto L_0x034f
        L_0x034e:
            r1 = r10
        L_0x034f:
            if (r1 == 0) goto L_0x03ad
            com.appfoundry.previewer.model.Page r1 = p005b.p038f.p039a.C0849e.m488K()
            if (r1 == 0) goto L_0x0370
            java.util.List<com.appfoundry.previewer.model.Container> r1 = r1.f11038f
            if (r1 == 0) goto L_0x0370
            java.lang.Object r1 = r1.get(r8)
            com.appfoundry.previewer.model.Container r1 = (com.appfoundry.previewer.model.Container) r1
            if (r1 == 0) goto L_0x0370
            java.util.List<java.lang.String> r1 = r1.f10976j
            if (r1 == 0) goto L_0x0370
            boolean r1 = p005b.p038f.p039a.C0849e.m500V(r1)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            goto L_0x0371
        L_0x0370:
            r1 = r10
        L_0x0371:
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            boolean r1 = p298d.p344x.p346c.C6888i.m12434a(r1, r2)
            if (r1 == 0) goto L_0x03a6
            com.appfoundry.previewer.model.Container r1 = r13.f11041i
            if (r1 == 0) goto L_0x0380
            java.util.List<java.lang.String> r2 = r1.f10976j
            goto L_0x0381
        L_0x0380:
            r2 = r10
        L_0x0381:
            java.lang.String r3 = "display:fullscreen"
            if (r2 != 0) goto L_0x038c
            if (r1 == 0) goto L_0x03a6
            java.util.List r2 = p005b.p291q.p292a.C5266a.m9910Y2(r3)
            goto L_0x03a4
        L_0x038c:
            if (r1 == 0) goto L_0x03a6
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            com.appfoundry.previewer.model.Container r4 = r13.f11041i
            if (r4 == 0) goto L_0x039a
            java.util.List<java.lang.String> r4 = r4.f10976j
            goto L_0x039b
        L_0x039a:
            r4 = r10
        L_0x039b:
            p298d.p344x.p346c.C6888i.m12436c(r4)
            r2.addAll(r4)
            r2.add(r3)
        L_0x03a4:
            r1.f10976j = r2
        L_0x03a6:
            java.lang.String r1 = r13.f11033a
            com.appfoundry.previewer.model.Container r2 = r13.f11041i
            p005b.p006a.p007a.p018i.C0758q.m237b(r0, r1, r2, r10, r12)
        L_0x03ad:
            r0 = 2131231131(0x7f08019b, float:1.8078334E38)
            android.view.View r0 = r6.findViewById(r0)
            java.lang.String r1 = "findViewById(R.id.recyclerView)"
            p298d.p344x.p346c.C6888i.m12437d(r0, r1)
            r14 = r0
            androidx.recyclerview.widget.RecyclerView r14 = (androidx.recyclerview.widget.RecyclerView) r14
            if (r13 == 0) goto L_0x03c2
            java.lang.String r0 = r13.f11033a
            r15 = r0
            goto L_0x03c3
        L_0x03c2:
            r15 = r10
        L_0x03c3:
            if (r13 == 0) goto L_0x03ca
            java.util.List<com.appfoundry.previewer.model.Container> r0 = r13.f11038f
            r16 = r0
            goto L_0x03cc
        L_0x03ca:
            r16 = r10
        L_0x03cc:
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 124(0x7c, float:1.74E-43)
            p005b.p038f.p039a.C0849e.m556z0(r14, r15, r16, r17, r18, r19, r20, r21, r22)
        L_0x03db:
            r0 = 2131230859(0x7f08008b, float:1.8077783E38)
            p005b.p038f.p039a.C0849e.m542s0(r6, r11, r0)
            boolean r0 = p005b.p006a.p007a.p024o.C0820c.m324x()
            java.lang.String r1 = "shake_toast_displayed"
            if (r0 != 0) goto L_0x0405
            boolean r0 = p005b.p006a.p007a.p024o.C0820c.m302b()
            if (r0 == 0) goto L_0x0405
            b.a.a.n.f r0 = p005b.p006a.p007a.p023n.C0817f.f641b
            boolean r0 = p005b.p006a.p007a.p023n.C0817f.m295c(r1)
            if (r0 != 0) goto L_0x0405
            com.appfoundry.previewer.BravoApp$b r0 = com.appfoundry.previewer.BravoApp.f10730N
            java.lang.Boolean r0 = com.appfoundry.previewer.BravoApp.f10728L
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            boolean r0 = p298d.p344x.p346c.C6888i.m12434a(r0, r2)
            if (r0 == 0) goto L_0x0405
            r0 = r7
            goto L_0x0406
        L_0x0405:
            r0 = r8
        L_0x0406:
            if (r0 == 0) goto L_0x0491
            b.a.a.n.f r0 = p005b.p006a.p007a.p023n.C0817f.f641b
            p005b.p006a.p007a.p023n.C0817f.m297e(r1)
            r0 = 2131231113(0x7f080189, float:1.8078298E38)
            android.view.View r0 = r6.findViewById(r0)
            android.widget.RelativeLayout r0 = (android.widget.RelativeLayout) r0
            if (r0 == 0) goto L_0x0491
            java.lang.String r1 = ""
            com.google.android.material.snackbar.Snackbar r0 = com.google.android.material.snackbar.Snackbar.make((android.view.View) r0, (java.lang.CharSequence) r1, (int) r8)
            java.lang.String r1 = "Snackbar.make(parentLayo…\"\", Snackbar.LENGTH_LONG)"
            p298d.p344x.p346c.C6888i.m12437d(r0, r1)
            android.content.res.Resources r1 = r23.getResources()
            r2 = 2131100083(0x7f0601b3, float:1.7812537E38)
            float r1 = r1.getDimension(r2)
            int r1 = (int) r1
            android.content.res.Resources r2 = r23.getResources()
            r3 = 2131100081(0x7f0601b1, float:1.7812533E38)
            float r2 = r2.getDimension(r3)
            int r2 = (int) r2
            android.view.LayoutInflater r3 = r23.getLayoutInflater()
            r4 = 2131427475(0x7f0b0093, float:1.8476567E38)
            android.view.View r3 = r3.inflate(r4, r10)
            r4 = 2131231182(0x7f0801ce, float:1.8078438E38)
            android.view.View r4 = r3.findViewById(r4)
            android.widget.TextView r4 = (android.widget.TextView) r4
            if (r4 == 0) goto L_0x045c
            b.a.a.n.a r5 = p005b.p006a.p007a.p023n.C0801a.f597b
            java.lang.String r10 = "01DZ4603S1A99S0MKRX805Z15F"
            android.graphics.Typeface r5 = r5.mo10628b(r10)
            r4.setTypeface(r5)
        L_0x045c:
            android.view.View r4 = r0.getView()
            r5 = 2131034148(0x7f050024, float:1.7678805E38)
            int r5 = androidx.core.content.ContextCompat.getColor(r6, r5)
            r4.setBackgroundColor(r5)
            android.view.View r4 = r0.getView()
            java.lang.String r5 = "null cannot be cast to non-null type com.google.android.material.snackbar.Snackbar.SnackbarLayout"
            java.util.Objects.requireNonNull(r4, r5)
            com.google.android.material.snackbar.Snackbar$SnackbarLayout r4 = (com.google.android.material.snackbar.Snackbar.SnackbarLayout) r4
            android.view.ViewGroup$LayoutParams r5 = r4.getLayoutParams()
            java.lang.String r10 = "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams"
            java.util.Objects.requireNonNull(r5, r10)
            android.widget.FrameLayout$LayoutParams r5 = (android.widget.FrameLayout.LayoutParams) r5
            r5.setMargins(r1, r8, r1, r1)
            r5.height = r2
            r1 = -1
            r5.width = r1
            r4.setLayoutParams(r5)
            r4.addView(r3, r8)
            r0.show()
        L_0x0491:
            b.a.a.n.f r0 = p005b.p006a.p007a.p023n.C0817f.f641b
            java.lang.String r0 = "app_process_id"
            int r1 = android.os.Process.myPid()
            java.lang.String r2 = "key"
            p298d.p344x.p346c.C6888i.m12438e(r0, r2)
            android.content.SharedPreferences r3 = p005b.p006a.p007a.p023n.C0817f.f640a
            android.content.SharedPreferences$Editor r4 = r3.edit()
            android.content.SharedPreferences$Editor r0 = r4.putInt(r0, r1)
            r0.apply()
            com.appfoundry.previewer.BravoApp$b r0 = com.appfoundry.previewer.BravoApp.f10730N
            boolean r0 = com.appfoundry.previewer.BravoApp.f10750z
            if (r0 == 0) goto L_0x04c8
            b.l.a.d.a.a.b r0 = r23.mo18420s()
            b.l.a.d.a.i.r r0 = r0.mo14728b()
            java.lang.String r1 = "appUpdateManager.appUpdateInfo"
            p298d.p344x.p346c.C6888i.m12437d(r0, r1)
            b.a.a.e.b r1 = new b.a.a.e.b
            r1.<init>(r6)
            java.util.concurrent.Executor r4 = p005b.p096l.p097a.p151d.p152a.p163i.C3638e.f6702a
            r0.mo14934c(r4, r1)
        L_0x04c8:
            boolean r0 = p005b.p006a.p007a.p024o.C0820c.m302b()
            if (r0 != 0) goto L_0x04d4
            java.lang.Integer r0 = p005b.p006a.p007a.p024o.C0823f.m343L()
            if (r0 == 0) goto L_0x05a8
        L_0x04d4:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = p005b.p038f.p039a.C0849e.m507b()
            r0.append(r1)
            java.lang.String r1 = "app_sessions"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            p298d.p344x.p346c.C6888i.m12438e(r0, r2)
            int r1 = p005b.p006a.p007a.p023n.C0817f.m296d(r0)
            android.content.SharedPreferences$Editor r2 = r3.edit()
            int r1 = r1 + r7
            android.content.SharedPreferences$Editor r0 = r2.putInt(r0, r1)
            r0.apply()
            boolean r0 = p005b.p006a.p007a.p024o.C0820c.m302b()
            if (r0 == 0) goto L_0x0504
            r0 = 5
            goto L_0x0510
        L_0x0504:
            java.lang.Integer r0 = p005b.p006a.p007a.p024o.C0823f.m343L()
            if (r0 == 0) goto L_0x050f
            int r0 = r0.intValue()
            goto L_0x0510
        L_0x050f:
            r0 = 3
        L_0x0510:
            java.lang.Object[] r2 = new java.lang.Object[r9]
            java.lang.Integer r3 = java.lang.Integer.valueOf(r1)
            r2[r8] = r3
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            r2[r7] = r3
            p.a.a$b r3 = p441p.p442a.C8091a.f16272d
            java.lang.String r4 = "APP_SESSIONS = %d, ratingAppAlert = %d"
            r3.mo26043a(r4, r2)
            if (r1 <= 0) goto L_0x052d
            int r0 = r1 % r0
            if (r0 != 0) goto L_0x052d
            r0 = r7
            goto L_0x052e
        L_0x052d:
            r0 = r8
        L_0x052e:
            if (r0 == 0) goto L_0x05a8
            android.content.pm.PackageManager r0 = r23.getPackageManager()
            android.content.ComponentName r2 = new android.content.ComponentName
            java.lang.String r3 = r23.getPackageName()
            java.lang.String r4 = "com.google.android.play.core.common.PlayCoreDialogWrapperActivity"
            r2.<init>(r3, r4)
            p005b.p096l.p097a.p113c.p119b.p126p.C1960d.m2782c0(r0, r2, r7)
            android.content.Context r0 = r23.getApplicationContext()
            if (r0 == 0) goto L_0x0549
            goto L_0x054a
        L_0x0549:
            r0 = r6
        L_0x054a:
            b.l.a.d.a.g.c r2 = new b.l.a.d.a.g.c
            b.l.a.d.a.g.h r3 = new b.l.a.d.a.g.h
            r3.<init>(r0)
            r2.<init>(r3)
            java.lang.String r0 = "ReviewManagerFactory.create(this)"
            p298d.p344x.p346c.C6888i.m12437d(r2, r0)
            b.l.a.d.a.g.h r0 = r2.f6691a
            b.l.a.d.a.e.f r3 = p005b.p096l.p097a.p151d.p152a.p161g.C3632h.f6699c
            java.lang.Object[] r4 = new java.lang.Object[r7]
            java.lang.String r5 = r0.f6701b
            r4[r8] = r5
            java.lang.String r5 = "requestInAppReview (%s)"
            r3.mo14884b(r12, r5, r4)
            b.l.a.d.a.e.p<b.l.a.d.a.e.c> r4 = r0.f6700a
            if (r4 != 0) goto L_0x057e
            java.lang.Object[] r0 = new java.lang.Object[r8]
            r4 = 6
            java.lang.String r5 = "Play Store app is either not installed or not the official version"
            r3.mo14884b(r4, r5, r0)
            b.l.a.d.a.g.e r0 = new b.l.a.d.a.g.e
            r0.<init>()
            b.l.a.d.a.i.r r0 = p005b.p096l.p097a.p113c.p119b.p126p.C1960d.m2805i(r0)
            goto L_0x058f
        L_0x057e:
            b.l.a.d.a.i.n r3 = new b.l.a.d.a.i.n
            r3.<init>()
            b.l.a.d.a.e.p<b.l.a.d.a.e.c> r4 = r0.f6700a
            b.l.a.d.a.g.f r5 = new b.l.a.d.a.g.f
            r5.<init>(r0, r3, r3)
            r4.mo14904a(r5)
            b.l.a.d.a.i.r<ResultT> r0 = r3.f6722a
        L_0x058f:
            java.lang.String r3 = "manager.requestReviewFlow()"
            p298d.p344x.p346c.C6888i.m12437d(r0, r3)
            b.a.a.e.m r3 = new b.a.a.e.m
            r3.<init>(r6, r2, r1)
            java.util.concurrent.Executor r1 = p005b.p096l.p097a.p151d.p152a.p163i.C3638e.f6702a
            b.l.a.d.a.i.m<ResultT> r2 = r0.f6725b
            b.l.a.d.a.i.g r4 = new b.l.a.d.a.i.g
            r4.<init>(r1, r3)
            r2.mo14926a(r4)
            r0.mo14936e()
        L_0x05a8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appfoundry.previewer.activities.BravoActivity.onCreate(android.os.Bundle):void");
    }

    public void onDestroy() {
        super.onDestroy();
        C0849e.m487J0(this);
    }

    @C8083m(threadMode = ThreadMode.MAIN)
    public final void onDownloadEvent(C0703g gVar) {
        C6888i.m12438e(gVar, "event");
        C0688a aVar = C0688a.f391b;
        String str = gVar.f409a;
        C0843a.m430F("Slack", false, C0843a.m435K(str, "url"), "Action Started", C0843a.m436L("java.util.UUID.randomUUID().toString()", C0688a.m185c(), "action_type", "download", "action_data", str));
        Dexter.withContext(this).withPermission("android.permission.WRITE_EXTERNAL_STORAGE").withListener(new C5424l(this, gVar)).check();
    }

    @C8083m(threadMode = ThreadMode.MAIN)
    public final void onEmailEvent(C0705h hVar) {
        C6888i.m12438e(hVar, "event");
        C0688a aVar = C0688a.f391b;
        String str = hVar.f411a;
        C0843a.m435K(str, NotificationCompat.CATEGORY_EMAIL).track("Action Started", C0843a.m436L("java.util.UUID.randomUUID().toString()", C0688a.m185c(), "action_type", NotificationCompat.CATEGORY_EMAIL, "action_data", str), new Options().setIntegration("Slack", false));
        startActivity(new Intent("android.intent.action.SENDTO", Uri.fromParts("mailto", hVar.f411a, (String) null)));
    }

    @C8083m(threadMode = ThreadMode.MAIN)
    public final void onFirebaseLogoutEvent(C0713l lVar) {
        C6888i.m12438e(lVar, "logout");
        mo18378g();
        BravoApp.C5403b bVar = BravoApp.f10730N;
        FirebaseAuth firebaseAuth = BravoApp.f10718B;
        if (firebaseAuth != null) {
            firebaseAuth.mo22155a();
        }
        C6888i.m12438e(this, "$this$removeAllFragments");
        C0594b bVar2 = null;
        getSupportFragmentManager().popBackStack((String) null, 1);
        mo18380o();
        Page g = C0820c.m307g();
        if (g != null) {
            bVar2 = C0744e.m200d(g, (Boolean) null, 1);
        }
        C0849e.m540r0(this, bVar2, R.id.container);
    }

    @C8083m(threadMode = ThreadMode.MAIN)
    public final void onFirebaseRegisterEvent(C0715m mVar) {
        C6888i.m12438e(mVar, "event");
        mo18370B();
        mo18419r(mVar.f420a, "register:firebase-email-password");
    }

    @C8083m(threadMode = ThreadMode.MAIN)
    public final void onGoBackEvent(C0717n nVar) {
        C6888i.m12438e(nVar, "event");
        onBackPressed();
    }

    @C8083m(threadMode = ThreadMode.MAIN)
    public final void onInputFileEvent(C0719o oVar) {
        C6888i.m12438e(oVar, "event");
        C0812d dVar = C0812d.f622f;
        C6888i.m12438e(oVar, "event");
        C0812d.f621e = oVar;
        C6888i.m12439f(this, BasePayload.CONTEXT_KEY);
        C6888i.m12439f(this, BasePayload.CONTEXT_KEY);
        Intent intent = new Intent(this, KotlinFilePicker.class);
        intent.putExtra("extraFileSelection", "File");
        intent.putExtra("extraMultipleEnabled", false);
        intent.putExtra("extraMultipleEnabled", false);
        C6888i.m12439f("*/*", "mimeType");
        intent.putExtra("extraFileMimeType", "*/*");
        startActivityForResult(intent, 25);
    }

    @C8083m(threadMode = ThreadMode.MAIN)
    public final void onInputImageEvent(C0721p pVar) {
        C6888i.m12438e(pVar, "event");
        C0812d dVar = C0812d.f622f;
        C6888i.m12438e(pVar, "event");
        C0812d.f620d = pVar;
        ImagePicker.Companion.with((Activity) this).setImageProviderInterceptor(C5425m.f10797g).start(24);
    }

    @C8083m(threadMode = ThreadMode.MAIN)
    public final void onIntroCloseEvent(C0723q qVar) {
        BravoApp.f10730N.mo18365e();
        if (!BravoApp.f10747w) {
            BravoApp.f10724H = false;
            Bundle bundle = new Bundle();
            bundle.putBoolean("showIntro", false);
            bundle.putBoolean("showLogin", true);
            Intent intent = new Intent(this, BravoActivity.class);
            intent.putExtras(bundle);
            startActivity(intent);
            finish();
        }
    }

    @C8083m(threadMode = ThreadMode.MAIN)
    public final void onLoginWithProviderEvent(C0725r rVar) {
        C6888i.m12438e(rVar, "event");
        mo18370B();
        String str = rVar.f435b;
        int hashCode = str.hashCode();
        if (hashCode == -1188976132 ? !str.equals("app-with-oauth") : hashCode != 108318258 || !str.equals("firebase-email-password")) {
            BravoApp.C5403b bVar = BravoApp.f10730N;
            String str2 = rVar.f435b;
            C6888i.m12438e(str2, "<set-?>");
            BravoApp.f10723G = str2;
            mo18425x(rVar.f435b);
            return;
        }
        mo18419r(rVar.f434a, "firebase-email-password");
    }

    @C8083m(threadMode = ThreadMode.MAIN)
    public final void onLogoutEvent(C0727s sVar) {
        C6888i.m12438e(sVar, "logout");
        C0849e.m510c0(this);
        C0594b bVar = null;
        if (sVar.f436a) {
            C0850a aVar = new C0850a(this);
            C0859a aVar2 = new C0859a(new C0855b(aVar), new C0867i(this));
            String str = C0906v.f811a;
            if (!"bravovision".equals("bravovision".toLowerCase())) {
                Log.w(C0906v.f811a, "Please provide the scheme in lowercase and make sure it's the same configured in the intent filter. Android expects the scheme to be lowercase.");
            }
            C5426n nVar = new C5426n(this, aVar2);
            C0906v.f812b = null;
            if (!C0906v.m636a(getPackageManager())) {
                nVar.mo10713b(new C0851b("Cannot perform web log out", new ActivityNotFoundException("No Browser application installed.")));
                return;
            }
            C0891l lVar = new C0891l(aVar, nVar, C0884f.m611a("bravovision", getApplicationContext().getPackageName(), aVar.f708b.f10428i));
            lVar.f777d = null;
            C0906v.f812b = lVar;
            Map<String, String> map = lVar.f776c;
            C0926c cVar = aVar.f709c;
            if (cVar != null) {
                map.put("auth0Client", cVar.f836b);
            }
            map.put("client_id", lVar.f774a.f707a);
            C5245o.C5247b k = lVar.f774a.f708b.mo17170k();
            k.mo17175a("v2");
            k.mo17175a("logout");
            Uri.Builder buildUpon = Uri.parse(k.mo17177c().f10428i).buildUpon();
            for (Map.Entry next : lVar.f776c.entrySet()) {
                buildUpon.appendQueryParameter((String) next.getKey(), (String) next.getValue());
            }
            Uri build = buildUpon.build();
            build.toString();
            Objects.requireNonNull(lVar.f774a);
            AuthenticationActivity.m10312a(this, build, lVar.f777d);
        } else if (C0820c.m324x()) {
            mo18371C();
        } else {
            mo18378g();
            BravoApp.C5403b bVar2 = BravoApp.f10730N;
            C0785b bVar3 = BravoApp.f10717A;
            if (bVar3 != null) {
                bVar3.mo10620a(this);
            }
            C6888i.m12438e(this, "$this$removeAllFragments");
            getSupportFragmentManager().popBackStack((String) null, 1);
            mo18380o();
            Page g = C0820c.m307g();
            if (g != null) {
                bVar = C0744e.m200d(g, (Boolean) null, 1);
            }
            C0849e.m540r0(this, bVar, R.id.container);
        }
    }

    @C8083m(threadMode = ThreadMode.MAIN)
    public final void onMapsEvent(C0731u uVar) {
        StringBuilder sb;
        C6888i.m12438e(uVar, "event");
        String str = uVar.f437a;
        if (str == null || !(!C6888i.m12434a(str, ""))) {
            sb = C0843a.m460u("geo:");
            sb.append(uVar.f438b);
            sb.append(",");
            sb.append(uVar.f439c);
            sb.append("?z=");
            sb.append(uVar.f440d);
        } else {
            sb = C0843a.m460u("geo:0,0?q=");
            sb.append(uVar.f437a);
        }
        String sb2 = sb.toString();
        C0688a aVar = C0688a.f391b;
        C0688a.m186d(sb2);
        startActivity(new Intent("android.intent.action.VIEW", Uri.parse(sb2)).setPackage("com.google.android.apps.maps"));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0087, code lost:
        if (p298d.p344x.p346c.C6888i.m12434a(r11.f444c, java.lang.Boolean.FALSE) != false) goto L_0x00eb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00e9, code lost:
        if (p298d.p344x.p346c.C6888i.m12434a(r11.f444c, java.lang.Boolean.FALSE) != false) goto L_0x00eb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00eb, code lost:
        r1 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0124, code lost:
        if (p298d.p415c0.C7694h.m13926d(r1, r9, false, 2) == false) goto L_0x0126;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x013e, code lost:
        if (p298d.p415c0.C7694h.m13926d(r1, r0, false, 2) != false) goto L_0x0140;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0140, code lost:
        r0 = true;
     */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00f0  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00fe  */
    @p437o.p438a.p439a.C8083m(threadMode = org.greenrobot.eventbus.ThreadMode.MAIN)
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onNavigationEvent(p005b.p006a.p007a.p017h.C0733v r11) {
        /*
            r10 = this;
            java.lang.String r0 = "event"
            p298d.p344x.p346c.C6888i.m12438e(r11, r0)
            com.appfoundry.previewer.BravoApp$b r1 = com.appfoundry.previewer.BravoApp.f10730N
            boolean r1 = com.appfoundry.previewer.BravoApp.f10747w
            if (r1 != 0) goto L_0x023d
            java.lang.String r1 = "$this$fragmentAlreadyVisible"
            p298d.p344x.p346c.C6888i.m12438e(r10, r1)
            p298d.p344x.p346c.C6888i.m12438e(r11, r0)
            boolean r1 = com.appfoundry.previewer.BravoApp.f10745u
            java.lang.String r2 = "null cannot be cast to non-null type com.appfoundry.previewer.fragments.BravoFragment"
            java.lang.String r3 = "supportFragmentManager.fragments"
            java.lang.String r4 = "supportFragmentManager"
            r5 = 1
            r6 = 0
            r7 = 0
            if (r1 != 0) goto L_0x008a
            androidx.fragment.app.FragmentManager r1 = r10.getSupportFragmentManager()
            p298d.p344x.p346c.C6888i.m12437d(r1, r4)
            java.util.List r1 = r1.getFragments()
            p298d.p344x.p346c.C6888i.m12437d(r1, r3)
            java.lang.Object r1 = p298d.p334t.C6790h.m12371y(r1)
            boolean r1 = r1 instanceof com.appfoundry.previewer.fragments.BottomSheetFragment
            if (r1 == 0) goto L_0x0037
            goto L_0x008a
        L_0x0037:
            androidx.fragment.app.FragmentManager r1 = r10.getSupportFragmentManager()
            p298d.p344x.p346c.C6888i.m12437d(r1, r4)
            java.util.List r1 = r1.getFragments()
            p298d.p344x.p346c.C6888i.m12437d(r1, r3)
            java.lang.Object r1 = p298d.p334t.C6790h.m12371y(r1)
            boolean r1 = r1 instanceof p005b.p006a.p007a.p008a.C0605h
            if (r1 == 0) goto L_0x00ed
            androidx.fragment.app.FragmentManager r1 = r10.getSupportFragmentManager()
            p298d.p344x.p346c.C6888i.m12437d(r1, r4)
            java.util.List r1 = r1.getFragments()
            p298d.p344x.p346c.C6888i.m12437d(r1, r3)
            java.lang.Object r1 = p298d.p334t.C6790h.m12371y(r1)
            java.util.Objects.requireNonNull(r1, r2)
            b.a.a.a.h r1 = (p005b.p006a.p007a.p008a.C0605h) r1
            com.appfoundry.previewer.model.Page r1 = r1.f210g
            if (r1 == 0) goto L_0x0071
            boolean r2 = p005b.p006a.p007a.p018i.C0744e.m188A(r1)
            if (r2 != r5) goto L_0x0071
            java.lang.String r1 = r1.f11057y
            goto L_0x0077
        L_0x0071:
            if (r1 == 0) goto L_0x0076
            java.lang.String r1 = r1.f11033a
            goto L_0x0077
        L_0x0076:
            r1 = r6
        L_0x0077:
            java.lang.String r2 = r11.f442a
            boolean r1 = p298d.p344x.p346c.C6888i.m12434a(r1, r2)
            if (r1 == 0) goto L_0x00ed
            java.lang.Boolean r1 = r11.f444c
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            boolean r1 = p298d.p344x.p346c.C6888i.m12434a(r1, r2)
            if (r1 == 0) goto L_0x00ed
            goto L_0x00eb
        L_0x008a:
            androidx.fragment.app.FragmentManager r1 = r10.getSupportFragmentManager()
            p298d.p344x.p346c.C6888i.m12437d(r1, r4)
            java.util.List r1 = r1.getFragments()
            p298d.p344x.p346c.C6888i.m12437d(r1, r3)
            int r1 = p298d.p334t.C6790h.m12364r(r1)
            int r1 = r1 - r5
            if (r1 < 0) goto L_0x00ed
            androidx.fragment.app.FragmentManager r8 = r10.getSupportFragmentManager()
            p298d.p344x.p346c.C6888i.m12437d(r8, r4)
            java.util.List r8 = r8.getFragments()
            java.lang.Object r8 = r8.get(r1)
            boolean r8 = r8 instanceof p005b.p006a.p007a.p008a.C0605h
            if (r8 == 0) goto L_0x00ed
            androidx.fragment.app.FragmentManager r8 = r10.getSupportFragmentManager()
            p298d.p344x.p346c.C6888i.m12437d(r8, r4)
            java.util.List r8 = r8.getFragments()
            java.lang.Object r1 = r8.get(r1)
            java.util.Objects.requireNonNull(r1, r2)
            b.a.a.a.h r1 = (p005b.p006a.p007a.p008a.C0605h) r1
            com.appfoundry.previewer.model.Page r1 = r1.f210g
            if (r1 == 0) goto L_0x00d3
            boolean r2 = p005b.p006a.p007a.p018i.C0744e.m188A(r1)
            if (r2 != r5) goto L_0x00d3
            java.lang.String r1 = r1.f11057y
            goto L_0x00d9
        L_0x00d3:
            if (r1 == 0) goto L_0x00d8
            java.lang.String r1 = r1.f11033a
            goto L_0x00d9
        L_0x00d8:
            r1 = r6
        L_0x00d9:
            java.lang.String r2 = r11.f442a
            boolean r1 = p298d.p344x.p346c.C6888i.m12434a(r1, r2)
            if (r1 == 0) goto L_0x00ed
            java.lang.Boolean r1 = r11.f444c
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            boolean r1 = p298d.p344x.p346c.C6888i.m12434a(r1, r2)
            if (r1 == 0) goto L_0x00ed
        L_0x00eb:
            r1 = r5
            goto L_0x00ee
        L_0x00ed:
            r1 = r7
        L_0x00ee:
            if (r1 == 0) goto L_0x00fe
            r10.mo18380o()
            java.lang.Object[] r11 = new java.lang.Object[r7]
            p.a.a$b r0 = p441p.p442a.C8091a.f16272d
            java.lang.String r1 = "onNavigationEvent: identified as fragmentAlreadyVisible"
            r0.mo26043a(r1, r11)
            goto L_0x023d
        L_0x00fe:
            p298d.p344x.p346c.C6888i.m12438e(r11, r0)
            java.lang.String r0 = r11.f443b
            if (r0 == 0) goto L_0x0106
            goto L_0x0108
        L_0x0106:
            java.lang.String r0 = r11.f442a
        L_0x0108:
            java.util.List<java.lang.String> r1 = com.appfoundry.previewer.BravoApp.f10733i
            int r1 = r1.size()
            java.lang.String r2 = ""
            r8 = 2
            if (r1 < r8) goto L_0x0126
            java.util.List<java.lang.String> r1 = com.appfoundry.previewer.BravoApp.f10733i
            java.lang.Object r1 = p005b.p035e.p036a.p037a.C0843a.m437M(r1, r8)
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            if (r0 == 0) goto L_0x011f
            r9 = r0
            goto L_0x0120
        L_0x011f:
            r9 = r2
        L_0x0120:
            boolean r1 = p298d.p415c0.C7694h.m13926d(r1, r9, r7, r8)
            if (r1 != 0) goto L_0x0140
        L_0x0126:
            java.util.List<java.lang.String> r1 = com.appfoundry.previewer.BravoApp.f10733i
            int r1 = r1.size()
            if (r1 != r5) goto L_0x0142
            java.util.List<java.lang.String> r1 = com.appfoundry.previewer.BravoApp.f10733i
            java.lang.Object r1 = r1.get(r7)
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            if (r0 == 0) goto L_0x0139
            goto L_0x013a
        L_0x0139:
            r0 = r2
        L_0x013a:
            boolean r0 = p298d.p415c0.C7694h.m13926d(r1, r0, r7, r8)
            if (r0 == 0) goto L_0x0142
        L_0x0140:
            r0 = r5
            goto L_0x0143
        L_0x0142:
            r0 = r7
        L_0x0143:
            if (r0 == 0) goto L_0x0151
            java.lang.Boolean r0 = r11.f444c
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            boolean r0 = p298d.p344x.p346c.C6888i.m12434a(r0, r1)
            if (r0 == 0) goto L_0x0151
            r0 = r5
            goto L_0x0152
        L_0x0151:
            r0 = r7
        L_0x0152:
            if (r0 == 0) goto L_0x0165
            java.lang.Object[] r11 = new java.lang.Object[r7]
            p.a.a$b r0 = p441p.p442a.C8091a.f16272d
            java.lang.String r1 = "onNavigationEvent: identified as backButtonEvent"
            r0.mo26043a(r1, r11)
            r10.mo18380o()
            r10.mo18423v()
            goto L_0x023d
        L_0x0165:
            java.lang.String r0 = r11.f442a
            com.appfoundry.previewer.model.JsonApp r1 = com.appfoundry.previewer.BravoApp.f10738n
            if (r1 == 0) goto L_0x0182
            com.appfoundry.previewer.model.App r1 = r1.f11021d
            if (r1 == 0) goto L_0x0182
            com.appfoundry.previewer.model.Data r1 = r1.f10891e
            if (r1 == 0) goto L_0x0182
            java.util.List<com.appfoundry.previewer.model.Page> r1 = r1.f10984a
            if (r1 == 0) goto L_0x0182
            java.lang.Object r1 = r1.get(r7)
            com.appfoundry.previewer.model.Page r1 = (com.appfoundry.previewer.model.Page) r1
            if (r1 == 0) goto L_0x0182
            java.lang.String r1 = r1.f11033a
            goto L_0x0183
        L_0x0182:
            r1 = r6
        L_0x0183:
            boolean r0 = p298d.p344x.p346c.C6888i.m12434a(r1, r0)
            if (r0 == 0) goto L_0x01e0
            java.lang.String r11 = r11.f442a
            boolean r0 = p005b.p038f.p039a.C0849e.m475D0()
            if (r0 == 0) goto L_0x01ac
            androidx.drawerlayout.widget.DrawerLayout r11 = r10.f10755g
            if (r11 != 0) goto L_0x01a0
            r11 = 2131230917(0x7f0800c5, float:1.80779E38)
            android.view.View r11 = r10.findViewById(r11)
            androidx.drawerlayout.widget.DrawerLayout r11 = (androidx.drawerlayout.widget.DrawerLayout) r11
            r10.f10755g = r11
        L_0x01a0:
            androidx.drawerlayout.widget.DrawerLayout r11 = r10.f10755g
            if (r11 == 0) goto L_0x023d
            r0 = 8388611(0x800003, float:1.1754948E-38)
            r11.openDrawer((int) r0)
            goto L_0x023d
        L_0x01ac:
            java.lang.String r0 = p005b.p038f.p039a.C0849e.m490L()
            java.lang.String r1 = "menu:modal"
            boolean r0 = p298d.p344x.p346c.C6888i.m12434a(r0, r1)
            if (r0 == 0) goto L_0x023d
            if (r11 == 0) goto L_0x023d
            com.appfoundry.previewer.BravoApp.f10744t = r5
            com.appfoundry.previewer.model.Page r0 = p005b.p038f.p039a.C0849e.m488K()
            if (r0 == 0) goto L_0x023d
            java.lang.String r1 = "$this$createBottomSheetFragment"
            p298d.p344x.p346c.C6888i.m12438e(r0, r1)
            com.appfoundry.previewer.fragments.BottomSheetFragment r1 = new com.appfoundry.previewer.fragments.BottomSheetFragment
            r1.<init>()
            java.lang.String r2 = r0.f11050r
            p005b.p006a.p007a.p024o.C0823f.m346O(r2, r6, r8)
            r1.f10876s = r0
            com.appfoundry.previewer.BravoApp.f10743s = r1
            androidx.fragment.app.FragmentManager r0 = r10.getSupportFragmentManager()
            p298d.p344x.p346c.C6888i.m12437d(r0, r4)
            r1.show(r0, r11)
            goto L_0x023d
        L_0x01e0:
            r10.mo18380o()
            java.lang.String r0 = r11.f445d
            com.appfoundry.previewer.model.Page r0 = p005b.p006a.p007a.p024o.C0823f.m339H(r0)
            if (r0 == 0) goto L_0x01f0
            java.lang.Boolean r0 = p005b.p006a.p007a.p018i.C0744e.m222z(r0)
            goto L_0x01f1
        L_0x01f0:
            r0 = r6
        L_0x01f1:
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            boolean r0 = p298d.p344x.p346c.C6888i.m12434a(r0, r1)
            if (r0 == 0) goto L_0x022e
            androidx.fragment.app.FragmentManager r0 = r10.getSupportFragmentManager()
            p298d.p344x.p346c.C6888i.m12437d(r0, r4)
            java.util.List r0 = r0.getFragments()
            p298d.p344x.p346c.C6888i.m12437d(r0, r3)
            int r1 = r0.size()
            java.util.ListIterator r0 = r0.listIterator(r1)
        L_0x020f:
            boolean r1 = r0.hasPrevious()
            if (r1 == 0) goto L_0x0221
            java.lang.Object r1 = r0.previous()
            r2 = r1
            androidx.fragment.app.Fragment r2 = (androidx.fragment.app.Fragment) r2
            boolean r2 = r2 instanceof androidx.appcompat.app.AppCompatDialogFragment
            if (r2 == 0) goto L_0x020f
            r6 = r1
        L_0x0221:
            androidx.fragment.app.Fragment r6 = (androidx.fragment.app.Fragment) r6
            if (r6 == 0) goto L_0x022e
            boolean r0 = r6 instanceof androidx.appcompat.app.AppCompatDialogFragment
            if (r0 == 0) goto L_0x022e
            androidx.appcompat.app.AppCompatDialogFragment r6 = (androidx.appcompat.app.AppCompatDialogFragment) r6
            r6.dismiss()
        L_0x022e:
            android.os.Handler r0 = new android.os.Handler
            r0.<init>()
            com.appfoundry.previewer.activities.BravoActivity$o r1 = new com.appfoundry.previewer.activities.BravoActivity$o
            r1.<init>(r10, r11)
            r2 = 200(0xc8, double:9.9E-322)
            r0.postDelayed(r1, r2)
        L_0x023d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appfoundry.previewer.activities.BravoActivity.onNavigationEvent(b.a.a.h.v):void");
    }

    @C8083m(threadMode = ThreadMode.MAIN)
    public final void onNewJsonEvent(C0735w wVar) {
        C6888i.m12438e(wVar, "event");
        BravoApp.C5403b bVar = BravoApp.f10730N;
        String str = BravoApp.f10748x;
        if (str == null) {
            C0817f fVar = C0817f.f641b;
            str = C0817f.m294b("current_app_url");
        }
        if (str != null && (!C6888i.m12434a(str, ""))) {
            Bundle bundle = new Bundle();
            bundle.putBoolean("new_json", true);
            Intent intent = new Intent(this, InitActivity.class);
            intent.putExtras(bundle);
            startActivity(intent);
            finish();
        }
    }

    @C8083m(threadMode = ThreadMode.MAIN)
    public final void onOpenAudioEvent(C0737y yVar) {
        C6888i.m12438e(yVar, "event");
        Intent intent = new Intent();
        intent.setAction("android.intent.action.VIEW");
        intent.setDataAndType(Uri.parse(yVar.f447a), "audio/*");
        startActivity(intent);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0015, code lost:
        r1 = r4.f10891e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x002d  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0041 A[EDGE_INSN: B:20:0x0041->B:17:0x0041 ?: BREAK  , SYNTHETIC] */
    @p437o.p438a.p439a.C8083m(threadMode = org.greenrobot.eventbus.ThreadMode.MAIN)
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onOpenIntroEvent(p005b.p006a.p007a.p017h.C0738z r4) {
        /*
            r3 = this;
            java.lang.String r0 = "event"
            p298d.p344x.p346c.C6888i.m12438e(r4, r0)
            com.appfoundry.previewer.model.JsonApp r4 = p005b.p006a.p007a.p024o.C0820c.m309i()
            r0 = 0
            if (r4 == 0) goto L_0x0041
            java.lang.String r1 = "$this$getIntroPageId"
            p298d.p344x.p346c.C6888i.m12438e(r4, r1)
            com.appfoundry.previewer.model.App r4 = r4.f11021d
            if (r4 == 0) goto L_0x001c
            com.appfoundry.previewer.model.Data r1 = r4.f10891e
            if (r1 == 0) goto L_0x001c
            java.util.List<com.appfoundry.previewer.model.Page> r1 = r1.f10985b
            goto L_0x001d
        L_0x001c:
            r1 = r0
        L_0x001d:
            if (r1 == 0) goto L_0x0041
            com.appfoundry.previewer.model.Data r4 = r4.f10891e
            java.util.List<com.appfoundry.previewer.model.Page> r4 = r4.f10985b
            java.util.Iterator r4 = r4.iterator()
        L_0x0027:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L_0x0041
            java.lang.Object r1 = r4.next()
            com.appfoundry.previewer.model.Page r1 = (com.appfoundry.previewer.model.Page) r1
            java.lang.String r2 = r1.f11046n
            if (r2 != 0) goto L_0x003f
            java.lang.String r2 = "intro"
            boolean r2 = p005b.p006a.p007a.p018i.C0744e.m216t(r1, r2)
            if (r2 == 0) goto L_0x0027
        L_0x003f:
            java.lang.String r0 = r1.f11033a
        L_0x0041:
            r4 = 0
            r1 = 1
            p005b.p038f.p039a.C0849e.m530m0(r3, r0, r4, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appfoundry.previewer.activities.BravoActivity.onOpenIntroEvent(b.a.a.h.z):void");
    }

    @C8083m(threadMode = ThreadMode.MAIN)
    public final void onOpenQrScannerEvent(C0692a0 a0Var) {
        Serializable serializable;
        C6888i.m12438e(a0Var, "event");
        C0817f fVar = C0817f.f641b;
        if (!C0817f.m295c("user_disabled_ask_for_camera_permission") || checkCallingOrSelfPermission("android.permission.CAMERA") != -1) {
            C4485a aVar = new C4485a(this);
            aVar.f8345b.put("PROMPT_MESSAGE", "");
            aVar.f8345b.put("BEEP_ENABLED", Boolean.FALSE);
            aVar.f8345b.put("SCAN_ORIENTATION_LOCKED", Boolean.TRUE);
            aVar.f8346c = QrScannerActivity.class;
            Activity activity = aVar.f8344a;
            if (aVar.f8346c == null) {
                aVar.f8346c = CaptureActivity.class;
            }
            Intent intent = new Intent(activity, aVar.f8346c);
            intent.setAction("com.google.zxing.client.android.SCAN");
            intent.addFlags(67108864);
            intent.addFlags(524288);
            for (Map.Entry next : aVar.f8345b.entrySet()) {
                String str = (String) next.getKey();
                Object value = next.getValue();
                if (value instanceof Integer) {
                    serializable = (Integer) value;
                } else if (value instanceof Long) {
                    serializable = (Long) value;
                } else if (value instanceof Boolean) {
                    serializable = (Boolean) value;
                } else if (value instanceof Double) {
                    serializable = (Double) value;
                } else if (value instanceof Float) {
                    serializable = (Float) value;
                } else if (value instanceof Bundle) {
                    intent.putExtra(str, (Bundle) value);
                } else if (value instanceof int[]) {
                    intent.putExtra(str, (int[]) value);
                } else if (value instanceof long[]) {
                    intent.putExtra(str, (long[]) value);
                } else if (value instanceof boolean[]) {
                    intent.putExtra(str, (boolean[]) value);
                } else if (value instanceof double[]) {
                    intent.putExtra(str, (double[]) value);
                } else if (value instanceof float[]) {
                    intent.putExtra(str, (float[]) value);
                } else if (value instanceof String[]) {
                    intent.putExtra(str, (String[]) value);
                } else {
                    intent.putExtra(str, value.toString());
                }
                intent.putExtra(str, serializable);
            }
            aVar.f8344a.startActivityForResult(intent, aVar.f8347d);
            return;
        }
        Page K = C0823f.m342K("error:noCamera");
        C0849e.m530m0(this, K != null ? K.f11033a : null, false, false);
    }

    @C8083m(threadMode = ThreadMode.MAIN)
    public final void onOpenUrlEvent(C0694b0 b0Var) {
        C6888i.m12438e(b0Var, "event");
        mo18380o();
        C0688a aVar = C0688a.f391b;
        String str = b0Var.f401a;
        C0843a.m435K(str, "url").track("Action Started", C0843a.m436L("java.util.UUID.randomUUID().toString()", C0688a.m185c(), "action_type", "url", "action_data", str), new Options().setIntegration("Slack", false));
        startActivity(new Intent("android.intent.action.VIEW").setData(Uri.parse(b0Var.f401a)));
    }

    public void onPause() {
        super.onPause();
        C4857i2.m8926C("foreground", "false");
        C0688a aVar = C0688a.f391b;
        Analytics with = Analytics.with(C0849e.m505a());
        String c = C0688a.m185c();
        String uuid = UUID.randomUUID().toString();
        C6888i.m12437d(uuid, "java.util.UUID.randomUUID().toString()");
        C0843a.m430F("Slack", false, with, "App Closed", C0688a.m184b(c, uuid));
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
    @p437o.p438a.p439a.C8083m(threadMode = org.greenrobot.eventbus.ThreadMode.MAIN)
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onPauseEvent(p005b.p006a.p007a.p017h.C0696c0 r6) {
        /*
            r5 = this;
            java.lang.String r0 = "event"
            p298d.p344x.p346c.C6888i.m12438e(r6, r0)
            com.appfoundry.previewer.BravoApp$b r6 = com.appfoundry.previewer.BravoApp.f10730N
            java.util.Map<java.lang.String, java.util.List<b.a.a.j.a>> r6 = com.appfoundry.previewer.BravoApp.f10719C
            b.a.a.j.h r0 = com.appfoundry.previewer.BravoApp.f10720D
            r1 = 0
            if (r0 == 0) goto L_0x0011
            java.lang.String r0 = r0.f542a
            goto L_0x0012
        L_0x0011:
            r0 = r1
        L_0x0012:
            java.lang.Object r6 = r6.get(r0)
            java.util.List r6 = (java.util.List) r6
            if (r6 == 0) goto L_0x003e
            java.util.Iterator r6 = r6.iterator()
        L_0x001e:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x0036
            java.lang.Object r0 = r6.next()
            r2 = r0
            b.a.a.j.a r2 = (p005b.p006a.p007a.p019j.C0770a) r2
            java.lang.String r2 = r2.f512c
            java.lang.String r3 = "action:play"
            boolean r2 = p298d.p344x.p346c.C6888i.m12434a(r2, r3)
            if (r2 == 0) goto L_0x001e
            goto L_0x0037
        L_0x0036:
            r0 = r1
        L_0x0037:
            b.a.a.j.a r0 = (p005b.p006a.p007a.p019j.C0770a) r0
            if (r0 == 0) goto L_0x003e
            android.view.View r6 = r0.f513d
            goto L_0x003f
        L_0x003e:
            r6 = r1
        L_0x003f:
            com.appfoundry.previewer.BravoApp$b r0 = com.appfoundry.previewer.BravoApp.f10730N
            java.util.Map<java.lang.String, java.util.List<b.a.a.j.a>> r0 = com.appfoundry.previewer.BravoApp.f10719C
            b.a.a.j.h r2 = com.appfoundry.previewer.BravoApp.f10720D
            if (r2 == 0) goto L_0x004a
            java.lang.String r2 = r2.f542a
            goto L_0x004b
        L_0x004a:
            r2 = r1
        L_0x004b:
            java.lang.Object r0 = r0.get(r2)
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto L_0x0076
            java.util.Iterator r0 = r0.iterator()
        L_0x0057:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x006f
            java.lang.Object r2 = r0.next()
            r3 = r2
            b.a.a.j.a r3 = (p005b.p006a.p007a.p019j.C0770a) r3
            java.lang.String r3 = r3.f512c
            java.lang.String r4 = "action:pause"
            boolean r3 = p298d.p344x.p346c.C6888i.m12434a(r3, r4)
            if (r3 == 0) goto L_0x0057
            goto L_0x0070
        L_0x006f:
            r2 = r1
        L_0x0070:
            b.a.a.j.a r2 = (p005b.p006a.p007a.p019j.C0770a) r2
            if (r2 == 0) goto L_0x0076
            android.view.View r1 = r2.f513d
        L_0x0076:
            com.appfoundry.previewer.BravoApp$b r0 = com.appfoundry.previewer.BravoApp.f10730N
            b.a.a.j.h r0 = com.appfoundry.previewer.BravoApp.f10720D
            if (r0 == 0) goto L_0x0083
            android.media.MediaPlayer r0 = r0.f544c
            if (r0 == 0) goto L_0x0083
            r0.pause()
        L_0x0083:
            if (r6 == 0) goto L_0x0088
            p005b.p006a.p007a.p018i.C0758q.m247l(r6)
        L_0x0088:
            if (r1 == 0) goto L_0x008d
            p005b.p006a.p007a.p018i.C0758q.m240e(r1)
        L_0x008d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appfoundry.previewer.activities.BravoActivity.onPauseEvent(b.a.a.h.c0):void");
    }

    @C8083m(threadMode = ThreadMode.MAIN)
    public final void onPdfEvent(C0698d0 d0Var) {
        C6888i.m12438e(d0Var, "event");
        C0688a aVar = C0688a.f391b;
        String str = d0Var.f404a;
        C0843a.m435K(str, "url").track("Action Started", C0843a.m436L("java.util.UUID.randomUUID().toString()", C0688a.m185c(), "action_type", "pdf", "action_data", str), new Options().setIntegration("Slack", false));
        startActivity(new Intent("android.intent.action.VIEW").setDataAndType(Uri.parse(d0Var.f404a), "application/pdf"));
    }

    @C8083m(threadMode = ThreadMode.MAIN)
    public final void onPhoneEvent(C0700e0 e0Var) {
        C6888i.m12438e(e0Var, "event");
        C0688a aVar = C0688a.f391b;
        String str = e0Var.f405a;
        C0843a.m435K(str, "phone").track("Action Started", C0843a.m436L("java.util.UUID.randomUUID().toString()", C0688a.m185c(), "action_type", "phone_call", "action_data", str), new Options().setIntegration("Slack", false));
        Intent intent = new Intent("android.intent.action.DIAL");
        StringBuilder u = C0843a.m460u("tel:");
        u.append(e0Var.f405a);
        startActivity(intent.setData(Uri.parse(u.toString())));
    }

    /* JADX WARNING: Removed duplicated region for block: B:66:0x0113  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0124  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0148  */
    @p437o.p438a.p439a.C8083m(threadMode = org.greenrobot.eventbus.ThreadMode.MAIN)
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onPlayEvent(p005b.p006a.p007a.p017h.C0702f0 r11) {
        /*
            r10 = this;
            java.lang.String r0 = "event"
            p298d.p344x.p346c.C6888i.m12438e(r11, r0)
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r1 = r11.f407b
            r2 = 0
            r0[r2] = r1
            java.lang.String r1 = r11.f406a
            r3 = 1
            r0[r3] = r1
            p.a.a$b r1 = p441p.p442a.C8091a.f16272d
            java.lang.String r4 = "PlayEvent with url: %s and containerId: %s"
            r1.mo26043a(r4, r0)
            com.appfoundry.previewer.BravoApp$b r0 = com.appfoundry.previewer.BravoApp.f10730N
            b.a.a.j.h r0 = com.appfoundry.previewer.BravoApp.f10720D
            if (r0 == 0) goto L_0x0040
            java.lang.String r0 = r0.f542a
            java.lang.String r1 = r11.f407b
            boolean r0 = p298d.p344x.p346c.C6888i.m12434a(r0, r1)
            r0 = r0 ^ r3
            if (r0 == 0) goto L_0x002b
            goto L_0x0040
        L_0x002b:
            b.a.a.j.h r0 = com.appfoundry.previewer.BravoApp.f10720D
            if (r0 == 0) goto L_0x003b
            android.os.Handler r1 = new android.os.Handler
            r1.<init>()
            java.lang.String r2 = "<set-?>"
            p298d.p344x.p346c.C6888i.m12438e(r1, r2)
            r0.f545d = r1
        L_0x003b:
            r10.mo18417p(r11)
            goto L_0x016a
        L_0x0040:
            b.a.a.j.h r0 = com.appfoundry.previewer.BravoApp.f10720D
            r1 = 0
            if (r0 == 0) goto L_0x0048
            java.lang.String r0 = r0.f542a
            goto L_0x0049
        L_0x0048:
            r0 = r1
        L_0x0049:
            java.lang.String r4 = r11.f407b
            boolean r0 = p298d.p344x.p346c.C6888i.m12434a(r0, r4)
            r0 = r0 ^ r3
            java.lang.String r3 = "action:play"
            if (r0 == 0) goto L_0x00d3
            b.a.a.j.h r0 = com.appfoundry.previewer.BravoApp.f10720D
            if (r0 == 0) goto L_0x005f
            android.media.MediaPlayer r0 = r0.f544c
            if (r0 == 0) goto L_0x005f
            r0.stop()
        L_0x005f:
            java.util.Map<java.lang.String, java.util.List<b.a.a.j.a>> r0 = com.appfoundry.previewer.BravoApp.f10719C
            b.a.a.j.h r4 = com.appfoundry.previewer.BravoApp.f10720D
            if (r4 == 0) goto L_0x0068
            java.lang.String r4 = r4.f542a
            goto L_0x0069
        L_0x0068:
            r4 = r1
        L_0x0069:
            java.lang.Object r0 = r0.get(r4)
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto L_0x0099
            java.util.Iterator r0 = r0.iterator()
        L_0x0075:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L_0x008d
            java.lang.Object r4 = r0.next()
            r5 = r4
            b.a.a.j.a r5 = (p005b.p006a.p007a.p019j.C0770a) r5
            java.lang.String r5 = r5.f512c
            java.lang.String r6 = "action:pause"
            boolean r5 = p298d.p344x.p346c.C6888i.m12434a(r5, r6)
            if (r5 == 0) goto L_0x0075
            goto L_0x008e
        L_0x008d:
            r4 = r1
        L_0x008e:
            b.a.a.j.a r4 = (p005b.p006a.p007a.p019j.C0770a) r4
            if (r4 == 0) goto L_0x0099
            android.view.View r0 = r4.f513d
            if (r0 == 0) goto L_0x0099
            p005b.p006a.p007a.p018i.C0758q.m240e(r0)
        L_0x0099:
            com.appfoundry.previewer.BravoApp$b r0 = com.appfoundry.previewer.BravoApp.f10730N
            java.util.Map<java.lang.String, java.util.List<b.a.a.j.a>> r0 = com.appfoundry.previewer.BravoApp.f10719C
            b.a.a.j.h r4 = com.appfoundry.previewer.BravoApp.f10720D
            if (r4 == 0) goto L_0x00a4
            java.lang.String r4 = r4.f542a
            goto L_0x00a5
        L_0x00a4:
            r4 = r1
        L_0x00a5:
            java.lang.Object r0 = r0.get(r4)
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto L_0x00d3
            java.util.Iterator r0 = r0.iterator()
        L_0x00b1:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L_0x00c7
            java.lang.Object r4 = r0.next()
            r5 = r4
            b.a.a.j.a r5 = (p005b.p006a.p007a.p019j.C0770a) r5
            java.lang.String r5 = r5.f512c
            boolean r5 = p298d.p344x.p346c.C6888i.m12434a(r5, r3)
            if (r5 == 0) goto L_0x00b1
            goto L_0x00c8
        L_0x00c7:
            r4 = r1
        L_0x00c8:
            b.a.a.j.a r4 = (p005b.p006a.p007a.p019j.C0770a) r4
            if (r4 == 0) goto L_0x00d3
            android.view.View r0 = r4.f513d
            if (r0 == 0) goto L_0x00d3
            p005b.p006a.p007a.p018i.C0758q.m247l(r0)
        L_0x00d3:
            android.media.MediaPlayer r0 = new android.media.MediaPlayer
            r0.<init>()
            java.lang.String r4 = r11.f407b
            r0.setDataSource(r4)
            com.appfoundry.previewer.BravoApp$b r4 = com.appfoundry.previewer.BravoApp.f10730N
            java.util.Map<java.lang.String, java.util.List<b.a.a.j.a>> r4 = com.appfoundry.previewer.BravoApp.f10719C
            java.lang.String r5 = r11.f407b
            java.lang.Object r4 = r4.get(r5)
            java.util.List r4 = (java.util.List) r4
            if (r4 == 0) goto L_0x0110
            java.util.Iterator r4 = r4.iterator()
        L_0x00ef:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0107
            java.lang.Object r5 = r4.next()
            r6 = r5
            b.a.a.j.a r6 = (p005b.p006a.p007a.p019j.C0770a) r6
            java.lang.String r6 = r6.f512c
            java.lang.String r7 = "audio:loading"
            boolean r6 = p298d.p344x.p346c.C6888i.m12434a(r6, r7)
            if (r6 == 0) goto L_0x00ef
            goto L_0x0108
        L_0x0107:
            r5 = r1
        L_0x0108:
            b.a.a.j.a r5 = (p005b.p006a.p007a.p019j.C0770a) r5
            if (r5 == 0) goto L_0x0110
            android.view.View r4 = r5.f513d
            r6 = r4
            goto L_0x0111
        L_0x0110:
            r6 = r1
        L_0x0111:
            if (r6 == 0) goto L_0x0116
            p005b.p006a.p007a.p018i.C0758q.m247l(r6)
        L_0x0116:
            com.appfoundry.previewer.BravoApp$b r4 = com.appfoundry.previewer.BravoApp.f10730N
            java.util.Map<java.lang.String, java.util.List<b.a.a.j.a>> r4 = com.appfoundry.previewer.BravoApp.f10719C
            java.lang.String r5 = r11.f407b
            java.lang.Object r4 = r4.get(r5)
            java.util.List r4 = (java.util.List) r4
            if (r4 == 0) goto L_0x0145
            java.util.Iterator r4 = r4.iterator()
        L_0x0128:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x013e
            java.lang.Object r5 = r4.next()
            r7 = r5
            b.a.a.j.a r7 = (p005b.p006a.p007a.p019j.C0770a) r7
            java.lang.String r7 = r7.f512c
            boolean r7 = p298d.p344x.p346c.C6888i.m12434a(r7, r3)
            if (r7 == 0) goto L_0x0128
            goto L_0x013f
        L_0x013e:
            r5 = r1
        L_0x013f:
            b.a.a.j.a r5 = (p005b.p006a.p007a.p019j.C0770a) r5
            if (r5 == 0) goto L_0x0145
            android.view.View r1 = r5.f513d
        L_0x0145:
            r7 = r1
            if (r7 == 0) goto L_0x014b
            r7.setClickable(r2)
        L_0x014b:
            com.appfoundry.previewer.activities.BravoActivity$p r1 = new com.appfoundry.previewer.activities.BravoActivity$p
            r1.<init>(r7, r11)
            r0.setOnCompletionListener(r1)
            com.appfoundry.previewer.activities.BravoActivity$q r1 = new com.appfoundry.previewer.activities.BravoActivity$q
            r1.<init>(r6)
            r0.setOnErrorListener(r1)
            r0.prepareAsync()
            com.appfoundry.previewer.activities.BravoActivity$r r1 = new com.appfoundry.previewer.activities.BravoActivity$r
            r4 = r1
            r5 = r10
            r8 = r11
            r9 = r0
            r4.<init>(r5, r6, r7, r8, r9)
            r0.setOnPreparedListener(r1)
        L_0x016a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appfoundry.previewer.activities.BravoActivity.onPlayEvent(b.a.a.h.f0):void");
    }

    @C8083m(threadMode = ThreadMode.MAIN)
    public final void onPreviewAppEvent(C0704g0 g0Var) {
        String str;
        C6888i.m12438e(g0Var, "event");
        String str2 = g0Var.f410a;
        if (str2 == null || !C7694h.m13926d(str2, "https", false, 2)) {
            StringBuilder u = C0843a.m460u("https://apps-service.bravostudio.app/devices/apps/");
            u.append(g0Var.f410a);
            str = u.toString();
        } else {
            str = g0Var.f410a;
        }
        C0849e.m479F0(this, str, false, 2);
    }

    @C8083m(threadMode = ThreadMode.MAIN)
    public final void onPushDialogEvent(C0706h0 h0Var) {
        C6888i.m12438e(h0Var, "event");
        BravoApp.C5403b bVar = BravoApp.f10730N;
        if (!BravoApp.f10746v && !BravoApp.f10747w) {
            C0849e.m473C0(this);
        }
    }

    @C8083m(threadMode = ThreadMode.MAIN)
    public final void onRemoteActionEvent(C0708i0 i0Var) {
        Fragment r;
        C6888i.m12438e(i0Var, "event");
        Page H = C0823f.m339H(i0Var.f412a);
        if (H != null && C0744e.m221y(H) && (r = C0849e.m539r(this, i0Var.f412a)) != null && (r instanceof AppCompatDialogFragment)) {
            ((AppCompatDialogFragment) r).dismiss();
        }
        String str = i0Var.f414c;
        if (str == null || !(!C6888i.m12434a(str, ""))) {
            mo18375G(i0Var.f412a, i0Var.f413b);
            return;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage((CharSequence) i0Var.f414c);
        builder.setPositiveButton((CharSequence) "Yes", (DialogInterface.OnClickListener) new C5434s(this, i0Var));
        builder.setNegativeButton((CharSequence) "Cancel", (DialogInterface.OnClickListener) C5435t.f10820g);
        builder.create().show();
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        C6888i.m12438e(strArr, "permissions");
        C6888i.m12438e(iArr, "grantResults");
        super.onRequestPermissionsResult(i, strArr, iArr);
        if (i == 1) {
            if ((!(iArr.length == 0)) && iArr[0] == 0) {
                C8068c.m14948b().mo26008g(new C0697d());
            }
        }
    }

    @C8083m(threadMode = ThreadMode.MAIN)
    public final void onResetPasswordEvent(C0710j0 j0Var) {
        C6888i.m12438e(j0Var, "event");
        mo18370B();
        mo18419r(j0Var.f415a, "reset-password");
    }

    public void onResume() {
        super.onResume();
        C4857i2.m8926C("foreground", "true");
        C0688a aVar = C0688a.f391b;
        Analytics with = Analytics.with(C0849e.m505a());
        String c = C0688a.m185c();
        String uuid = UUID.randomUUID().toString();
        C6888i.m12437d(uuid, "java.util.UUID.randomUUID().toString()");
        with.track("App Opened", C0688a.m184b(c, uuid), new Options().setIntegration("Slack", false));
        if ((C0820c.m302b() && C0820c.m324x()) || C0820c.m301a()) {
            C7748o h = C5266a.m9959h((C7819x0) null, 1, (Object) null);
            C7815w wVar = C7725h0.f15273a;
            C5266a.m9880S2(C5266a.m9953g(C7785l.f15351b.plus(h)), (C6827f) null, (C7823z) null, new C0666c(this, (C6824d) null), 3, (Object) null);
        }
        BravoApp.C5403b bVar = BravoApp.f10730N;
        if (BravoApp.f10750z) {
            C3651r<C3448a> b = mo18420s().mo14728b();
            C0680i iVar = new C0680i(this);
            Objects.requireNonNull(b);
            b.mo14934c(C3638e.f6702a, iVar);
        }
    }

    @C8083m(threadMode = ThreadMode.MAIN)
    public final void onScannedOrEmulatorAppListClicked(C0712k0 k0Var) {
        C6888i.m12438e(k0Var, "event");
        String str = k0Var.f418a;
        if (str != null) {
            C0688a aVar = C0688a.f391b;
            Analytics K = C0843a.m435K(str, "url");
            String c = C0688a.m185c();
            String uuid = UUID.randomUUID().toString();
            C6888i.m12437d(uuid, "java.util.UUID.randomUUID().toString()");
            C0843a.m430F("Slack", false, K, "Scanned App Loaded", C0688a.m184b(c, uuid).putValue("url", (Object) str));
            C0849e.m479F0(this, str, false, 2);
            C8068c.m14948b().mo26008g(new C0699e());
        }
    }

    @C8083m(threadMode = ThreadMode.MAIN)
    public final void onShareEvent(C0714l0 l0Var) {
        C6888i.m12438e(l0Var, "event");
        C0688a aVar = C0688a.f391b;
        String str = l0Var.f419a;
        C0843a.m435K(str, "url").track("Action Started", C0843a.m436L("java.util.UUID.randomUUID().toString()", C0688a.m185c(), "action_type", "share", "action_data", str), new Options().setIntegration("Slack", false));
        startActivity(new Intent("android.intent.action.SEND").putExtra("android.intent.extra.TEXT", l0Var.f419a).setType("text/plain"));
    }

    @C8083m(threadMode = ThreadMode.MAIN)
    public final void onShowEmulatorAppListEvent(C0716m0 m0Var) {
        C6888i.m12438e(m0Var, "event");
        C6888i.m12438e(this, "$this$showDebugAppsActivity");
        startActivity(new Intent(this, DebugAppsActivity.class));
    }

    public void onStart() {
        super.onStart();
        C0849e.m536p0(this);
    }

    @C8083m(threadMode = ThreadMode.MAIN)
    public final void onSubmitEvent(C0720o0 o0Var) {
        String str;
        Fragment r;
        C6888i.m12438e(o0Var, "event");
        mo18370B();
        C0812d dVar = C0812d.f622f;
        String str2 = o0Var.f426a;
        C6888i.m12438e(this, BasePayload.CONTEXT_KEY);
        if (str2 != null) {
            Page H = C0823f.m339H(str2);
            if (H != null && C0744e.m221y(H) && (r = C0849e.m539r(this, str2)) != null && (r instanceof AppCompatDialogFragment)) {
                ((AppCompatDialogFragment) r).dismiss();
            }
            List list = C0812d.f617a.get(str2);
            if (list != null) {
                Page H2 = C0823f.m339H(str2);
                String str3 = H2 != null ? H2.f11049q : null;
                if (!dVar.mo10641g(list) || !dVar.mo10640f(list)) {
                    if (!dVar.mo10641g(list) ? !(!dVar.mo10640f(list) || dVar.mo10636b()) : !dVar.mo10637c()) {
                        str = "Images are not uploaded yet";
                    }
                    dVar.mo10643i(this, str3, list);
                    return;
                }
                if (!dVar.mo10637c() || !dVar.mo10636b()) {
                    str = "Files are not uploaded yet";
                }
                dVar.mo10643i(this, str3, list);
                return;
                Toast.makeText(this, str, 0).show();
            }
        }
    }

    @C8083m(threadMode = ThreadMode.MAIN)
    public final void onTokenExpiredEvent(C0726r0 r0Var) {
        C6888i.m12438e(r0Var, "event");
        BravoApp.C5403b bVar = BravoApp.f10730N;
        mo18425x(BravoApp.f10723G);
    }

    @C8083m(threadMode = ThreadMode.MAIN)
    public final void onTripleTapEvent(C0728s0 s0Var) {
        C6888i.m12438e(s0Var, "event");
        C8068c.m14948b().mo26008g(new C0692a0());
    }

    @C8083m(threadMode = ThreadMode.MAIN)
    public final void onUnlinkEvent(C0730t0 t0Var) {
        C6888i.m12438e(t0Var, "event");
        C0688a aVar = C0688a.f391b;
        Analytics with = Analytics.with(C0849e.m505a());
        String c = C0688a.m185c();
        String uuid = UUID.randomUUID().toString();
        C6888i.m12437d(uuid, "java.util.UUID.randomUUID().toString()");
        C0843a.m430F("Slack", false, with, "Action Started", C0688a.m184b(c, uuid).putValue("action_type", (Object) "unlink"));
        C0817f fVar = C0817f.f641b;
        C6888i.m12438e("unlinks", "key");
        C0817f.f640a.edit().putInt("unlinks", C0817f.m296d("unlinks") + 1).apply();
        mo18378g();
        C0812d dVar = C0812d.f622f;
        C0812d.f617a.clear();
        C0812d.f618b.clear();
        C0812d.f619c.clear();
        C0812d.f620d = null;
        C0812d.f621e = null;
        BravoApp.C5403b bVar = BravoApp.f10730N;
        C0785b bVar2 = BravoApp.f10717A;
        if (bVar2 != null) {
            bVar2.mo10620a(this);
        }
        bVar.mo18361a();
        C6888i.m12438e(this, "$this$unlinkActivity");
        C0849e.m519h();
        Intent intent = new Intent(this, InitActivity.class);
        intent.putExtra("unlink", true);
        startActivity(intent);
        finish();
    }

    @C8083m(threadMode = ThreadMode.MAIN)
    public final void onUpdateEvent(C0732u0 u0Var) {
        C6888i.m12438e(u0Var, "event");
        if (!C0820c.m324x()) {
            BravoApp.C5403b bVar = BravoApp.f10730N;
            String str = BravoApp.f10748x;
            if (str == null) {
                C0817f fVar = C0817f.f641b;
                str = C0817f.m294b("current_app_url");
            }
            if (str != null && (!C6888i.m12434a(str, ""))) {
                C0688a aVar = C0688a.f391b;
                boolean z = u0Var.f441a;
                C6888i.m12438e(str, "url");
                C0843a.m430F("Slack", false, Analytics.with(C0849e.m505a()), "App Updated", C0843a.m436L("java.util.UUID.randomUUID().toString()", C0688a.m185c(), "url", str, "type", z ? "live_push" : "manual"));
                C8091a.f16272d.mo26043a("Update event received: %s", str);
                C0849e.m519h();
                C0849e.m479F0(this, str, false, 2);
                return;
            }
            return;
        }
        C8091a.f16272d.mo26043a("Silent PUSH Update received, but previewer is loaded, so ignoring.", new Object[0]);
    }

    @C8083m(threadMode = ThreadMode.MAIN)
    public final void onVideoEvent(C0734v0 v0Var) {
        Intent intent;
        C6888i.m12438e(v0Var, "event");
        C0688a aVar = C0688a.f391b;
        String str = v0Var.f446a;
        C0843a.m430F("Slack", false, C0843a.m435K(str, "url"), "Action Started", C0843a.m436L("java.util.UUID.randomUUID().toString()", C0688a.m185c(), "action_type", "video", "action_data", str));
        String str2 = v0Var.f446a;
        C6888i.m12438e(str2, "$this$isYoutubeVideo");
        if (C7694h.m13924b(str2, "youtu", true)) {
            intent = new Intent("android.intent.action.VIEW", Uri.parse(v0Var.f446a)).putExtra("force_fullscreen", true);
            C6888i.m12437d(intent, "Intent(Intent.ACTION_VIE…\"force_fullscreen\", true)");
        } else {
            intent = new Intent("android.intent.action.VIEW").setDataAndType(Uri.parse(v0Var.f446a), "video/*");
        }
        startActivity(intent);
    }

    /* renamed from: p */
    public final void mo18417p(C0702f0 f0Var) {
        C0770a aVar;
        TextView textView;
        C0770a aVar2;
        TextView textView2;
        C0770a aVar3;
        C0770a aVar4;
        MediaPlayer mediaPlayer;
        MediaPlayer mediaPlayer2;
        MediaPlayer mediaPlayer3;
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        BravoApp.C5403b bVar = BravoApp.f10730N;
        List list = BravoApp.f10719C.get(f0Var.f407b);
        String str = null;
        if (list != null) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj4 = null;
                    break;
                }
                obj4 = it.next();
                if (C6888i.m12434a(((C0770a) obj4).f512c, "audio:currenttime")) {
                    break;
                }
            }
            aVar = (C0770a) obj4;
        } else {
            aVar = null;
        }
        if (aVar != null) {
            View view = aVar.f513d;
            Objects.requireNonNull(view, "null cannot be cast to non-null type android.widget.TextView");
            textView = (TextView) view;
        } else {
            textView = null;
        }
        BravoApp.C5403b bVar2 = BravoApp.f10730N;
        List list2 = BravoApp.f10719C.get(f0Var.f407b);
        if (list2 != null) {
            Iterator it2 = list2.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    obj3 = null;
                    break;
                }
                obj3 = it2.next();
                if (C6888i.m12434a(((C0770a) obj3).f512c, "audio:totaltime")) {
                    break;
                }
            }
            aVar2 = (C0770a) obj3;
        } else {
            aVar2 = null;
        }
        if (aVar2 != null) {
            View view2 = aVar2.f513d;
            Objects.requireNonNull(view2, "null cannot be cast to non-null type android.widget.TextView");
            textView2 = (TextView) view2;
        } else {
            textView2 = null;
        }
        BravoApp.C5403b bVar3 = BravoApp.f10730N;
        List list3 = BravoApp.f10719C.get(f0Var.f407b);
        if (list3 != null) {
            Iterator it3 = list3.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it3.next();
                if (C6888i.m12434a(((C0770a) obj2).f512c, "action:play")) {
                    break;
                }
            }
            aVar3 = (C0770a) obj2;
        } else {
            aVar3 = null;
        }
        View view3 = aVar3 != null ? aVar3.f513d : null;
        BravoApp.C5403b bVar4 = BravoApp.f10730N;
        List list4 = BravoApp.f10719C.get(f0Var.f407b);
        if (list4 != null) {
            Iterator it4 = list4.iterator();
            while (true) {
                if (!it4.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it4.next();
                if (C6888i.m12434a(((C0770a) obj).f512c, "action:pause")) {
                    break;
                }
            }
            aVar4 = (C0770a) obj;
        } else {
            aVar4 = null;
        }
        View view4 = aVar4 != null ? aVar4.f513d : null;
        Object[] objArr = new Object[1];
        BravoApp.C5403b bVar5 = BravoApp.f10730N;
        C0777h hVar = BravoApp.f10720D;
        objArr[0] = (hVar == null || (mediaPlayer3 = hVar.f544c) == null) ? null : String.valueOf(mediaPlayer3.getDuration());
        C8091a.f16272d.mo26043a("Audio File duration = %s", objArr);
        C0777h hVar2 = BravoApp.f10720D;
        if (!(hVar2 == null || (mediaPlayer2 = hVar2.f544c) == null)) {
            mediaPlayer2.start();
        }
        if (view3 != null) {
            C0758q.m240e(view3);
        }
        if (view4 != null) {
            C0758q.m247l(view4);
        }
        if (textView2 != null) {
            C0758q.m247l(textView2);
        }
        if (textView2 != null) {
            C0777h hVar3 = BravoApp.f10720D;
            if (!(hVar3 == null || (mediaPlayer = hVar3.f544c) == null)) {
                str = C0849e.m520h0(mediaPlayer.getDuration());
            }
            textView2.setText(str);
        }
        if (textView != null) {
            textView.setText(String.valueOf(0));
        }
        runOnUiThread(new C5410d(textView));
    }

    /* renamed from: q */
    public final Fragment mo18418q(Page page) {
        Page page2;
        if (page == null || (page2 = C0744e.m207k(page)) == null) {
            page2 = C0823f.m335D();
        }
        C0594b bVar = null;
        if (page2 != null) {
            File A = C0820c.m299A(this);
            bVar = C0744e.m200d(page2, (Boolean) null, 1);
            BravoApp.C5403b bVar2 = BravoApp.f10730N;
            String str = page2.f11033a;
            BravoApp.f10727K = str;
            C6888i.m12438e(this, "$this$addFragment");
            FragmentManager supportFragmentManager = getSupportFragmentManager();
            C6888i.m12437d(supportFragmentManager, "supportFragmentManager");
            C0849e.m514e0(supportFragmentManager, new C0739a(R.id.containerLoading, bVar, str));
            if (A != null) {
                View findViewById = findViewById(R.id.containerLoading);
                C6888i.m12437d(findViewById, "findViewById<FrameLayout>(R.id.containerLoading)");
                Resources resources = getResources();
                String absolutePath = A.getAbsolutePath();
                C6888i.m12437d(absolutePath, "it.absolutePath");
                ((FrameLayout) findViewById).setBackground(new BitmapDrawable(resources, mo18422u(absolutePath)));
            }
        }
        return bVar;
    }

    /* renamed from: r */
    public final void mo18419r(String str, String str2) {
        RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.main_progressbar);
        if (relativeLayout != null) {
            C0758q.m247l(relativeLayout);
        }
        C7815w wVar = C7725h0.f15273a;
        C5266a.m9880S2(C5266a.m9953g(C7785l.f15351b.plus(C5266a.m9959h((C7819x0) null, 1, (Object) null))), (C6827f) null, (C7823z) null, new C5411e(this, str2, str, relativeLayout, (C6824d) null), 3, (Object) null);
    }

    /* renamed from: s */
    public final C3449b mo18420s() {
        return (C3449b) this.f10761m.getValue();
    }

    /* renamed from: t */
    public final void mo18421t(String str) {
        C7815w wVar = C7725h0.f15273a;
        C5266a.m9880S2(C5266a.m9953g(C7785l.f15351b.plus(C5266a.m9959h((C7819x0) null, 1, (Object) null))), (C6827f) null, (C7823z) null, new C0672f(this, str, (C6824d) null), 3, (Object) null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x004c, code lost:
        if (r0.getStableInsetBottom() == 0) goto L_0x004f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0054  */
    /* renamed from: u */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.graphics.Bitmap mo18422u(java.lang.String r8) {
        /*
            r7 = this;
            android.graphics.BitmapFactory$Options r0 = new android.graphics.BitmapFactory$Options
            r0.<init>()
            r1 = 1
            r0.inMutable = r1
            android.graphics.Bitmap r8 = android.graphics.BitmapFactory.decodeFile(r8, r0)
            android.view.Window r0 = r7.getWindow()
            java.lang.String r2 = "context.window"
            p298d.p344x.p346c.C6888i.m12437d(r0, r2)
            android.view.View r0 = r0.getDecorView()
            java.lang.String r3 = "context.window.decorView"
            p298d.p344x.p346c.C6888i.m12437d(r0, r3)
            int r0 = r0.getVisibility()
            r0 = r0 & 2
            r4 = 0
            if (r0 == 0) goto L_0x0029
            r0 = r1
            goto L_0x002a
        L_0x0029:
            r0 = r4
        L_0x002a:
            if (r0 == 0) goto L_0x002d
            goto L_0x004f
        L_0x002d:
            android.view.Window r0 = r7.getWindow()
            p298d.p344x.p346c.C6888i.m12437d(r0, r2)
            android.view.View r0 = r0.getDecorView()
            p298d.p344x.p346c.C6888i.m12437d(r0, r3)
            android.view.WindowInsets r2 = r0.getRootWindowInsets()
            if (r2 != 0) goto L_0x0042
            goto L_0x004f
        L_0x0042:
            android.view.WindowInsets r0 = r0.getRootWindowInsets()
            if (r0 == 0) goto L_0x0050
            int r0 = r0.getStableInsetBottom()
            if (r0 == 0) goto L_0x004f
            goto L_0x0050
        L_0x004f:
            r1 = r4
        L_0x0050:
            java.lang.String r0 = "bitmap"
            if (r1 == 0) goto L_0x0089
            p298d.p344x.p346c.C6888i.m12437d(r8, r0)
            android.view.Window r1 = r7.getWindow()
            java.lang.String r2 = "window"
            p298d.p344x.p346c.C6888i.m12437d(r1, r2)
            android.view.View r1 = r1.getDecorView()
            java.lang.String r2 = "window.decorView"
            p298d.p344x.p346c.C6888i.m12437d(r1, r2)
            int r1 = r1.getHeight()
            android.content.res.Resources r2 = android.content.res.Resources.getSystem()
            java.lang.String r3 = "navigation_bar_height"
            java.lang.String r5 = "dimen"
            java.lang.String r6 = "android"
            int r2 = r2.getIdentifier(r3, r5, r6)
            if (r2 <= 0) goto L_0x0085
            android.content.res.Resources r3 = android.content.res.Resources.getSystem()
            int r4 = r3.getDimensionPixelSize(r2)
        L_0x0085:
            int r1 = r1 - r4
            r8.setHeight(r1)
        L_0x0089:
            p298d.p344x.p346c.C6888i.m12437d(r8, r0)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appfoundry.previewer.activities.BravoActivity.mo18422u(java.lang.String):android.graphics.Bitmap");
    }

    /* renamed from: v */
    public final void mo18423v() {
        File A;
        BravoApp.C5403b bVar = BravoApp.f10730N;
        if (BravoApp.f10732h <= 1) {
            bVar.mo18361a();
            finish();
            return;
        }
        BravoApp.f10722F = true;
        BravoApp.f10732h--;
        List<String> list = BravoApp.f10733i;
        list.remove(list.size() - 1);
        Page H = C0823f.m339H((String) C6790h.m12371y(BravoApp.f10733i));
        Page k = H != null ? C0744e.m207k(H) : null;
        if (!(k == null || (A = C0820c.m299A(this)) == null)) {
            View findViewById = findViewById(R.id.containerLoading);
            C6888i.m12437d(findViewById, "findViewById<FrameLayout>(R.id.containerLoading)");
            Resources resources = getResources();
            String absolutePath = A.getAbsolutePath();
            C6888i.m12437d(absolutePath, "it.absolutePath");
            ((FrameLayout) findViewById).setBackground(new BitmapDrawable(resources, mo18422u(absolutePath)));
        }
        super.onBackPressed();
        C8091a.f16272d.mo26043a("NavigatedPages: current list, after onBackPressed: \n%s", bVar.mo18364d());
        if (k != null) {
            BravoApp.f10727K = k.f11033a;
            C0594b d = C0744e.m200d(k, (Boolean) null, 1);
            String str = BravoApp.f10727K;
            C6888i.m12438e(this, "$this$addFragment");
            FragmentManager supportFragmentManager = getSupportFragmentManager();
            C6888i.m12437d(supportFragmentManager, "supportFragmentManager");
            C0849e.m514e0(supportFragmentManager, new C0739a(R.id.containerLoading, d, str));
        }
        C6888i.m12438e(this, "$this$getVisiblePageId");
        FragmentManager supportFragmentManager2 = getSupportFragmentManager();
        C6888i.m12437d(supportFragmentManager2, "supportFragmentManager");
        List<Fragment> fragments = supportFragmentManager2.getFragments();
        C6888i.m12437d(fragments, "supportFragmentManager.fragments");
        if (!fragments.isEmpty()) {
            FragmentManager supportFragmentManager3 = getSupportFragmentManager();
            C6888i.m12437d(supportFragmentManager3, "supportFragmentManager");
            List<Fragment> fragments2 = supportFragmentManager3.getFragments();
            C6888i.m12437d(fragments2, "supportFragmentManager.fragments");
            Fragment fragment = (Fragment) C6790h.m12371y(fragments2);
            if (fragment != null) {
                if (!(fragment instanceof C0594b)) {
                }
            }
        }
        String str2 = "";
        C6888i.m12438e(str2, "pageId");
        Component s = C0849e.m541s(str2);
        if (s != null) {
            C0849e.m469A0(s);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: b.a.a.h.b0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v6, resolved type: b.a.a.h.v} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v5, resolved type: b.a.a.h.v} */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0037, code lost:
        r6 = r4.f11074n;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0098, code lost:
        r0.mo26008g(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00a9, code lost:
        runOnUiThread(r0);
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: w */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo18424w(com.appfoundry.previewer.model.BackendResponse r13, android.widget.RelativeLayout r14, androidx.fragment.app.Fragment r15) {
        /*
            r12 = this;
            r0 = 0
            r1 = 0
            if (r13 == 0) goto L_0x00c5
            java.lang.String r2 = r13.f10915a
            java.lang.String r3 = "goto"
            if (r2 != 0) goto L_0x000c
            goto L_0x00ac
        L_0x000c:
            int r4 = r2.hashCode()
            java.lang.String r5 = ""
            r6 = 1
            switch(r4) {
                case -1901722497: goto L_0x009c;
                case -1263172891: goto L_0x0060;
                case -1240638001: goto L_0x0051;
                case 3178851: goto L_0x0027;
                case 1085444827: goto L_0x0018;
                default: goto L_0x0016;
            }
        L_0x0016:
            goto L_0x00ac
        L_0x0018:
            java.lang.String r0 = "refresh"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x00ac
            com.appfoundry.previewer.activities.BravoActivity$a r0 = new com.appfoundry.previewer.activities.BravoActivity$a
            r0.<init>(r6, r12)
            goto L_0x00a9
        L_0x0027:
            boolean r0 = r2.equals(r3)
            if (r0 == 0) goto L_0x00ac
            o.a.a.c r0 = p437o.p438a.p439a.C8068c.m14948b()
            b.a.a.h.v r2 = new b.a.a.h.v
            com.appfoundry.previewer.model.Params r4 = r13.f10916b
            if (r4 == 0) goto L_0x003d
            java.lang.String r6 = r4.f11074n
            if (r6 == 0) goto L_0x003d
            r7 = r6
            goto L_0x003e
        L_0x003d:
            r7 = r5
        L_0x003e:
            if (r4 == 0) goto L_0x0046
            java.lang.String r4 = r4.f11059A
            if (r4 == 0) goto L_0x0046
            r8 = r4
            goto L_0x0047
        L_0x0046:
            r8 = r5
        L_0x0047:
            java.lang.Boolean r9 = java.lang.Boolean.TRUE
            r10 = 0
            r11 = 8
            r6 = r2
            r6.<init>(r7, r8, r9, r10, r11)
            goto L_0x0098
        L_0x0051:
            java.lang.String r4 = "goback"
            boolean r2 = r2.equals(r4)
            if (r2 == 0) goto L_0x00ac
            com.appfoundry.previewer.activities.BravoActivity$a r2 = new com.appfoundry.previewer.activities.BravoActivity$a
            r2.<init>(r0, r12)
            r0 = r2
            goto L_0x00a9
        L_0x0060:
            java.lang.String r0 = "openurl"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x00ac
            o.a.a.c r0 = p437o.p438a.p439a.C8068c.m14948b()
            b.a.a.h.b0 r2 = new b.a.a.h.b0
            com.appfoundry.previewer.model.Params r4 = r13.f10916b
            if (r4 == 0) goto L_0x0095
            java.lang.String r4 = r4.f11061a
            if (r4 == 0) goto L_0x0095
            java.lang.String r7 = "$this$appendHttpsIfNeeded"
            p298d.p344x.p346c.C6888i.m12438e(r4, r7)
            java.lang.String r7 = "http"
            boolean r7 = p298d.p415c0.C7694h.m13947y(r4, r7, r6)
            if (r7 != 0) goto L_0x0092
            java.lang.String r7 = "https"
            boolean r6 = p298d.p415c0.C7694h.m13947y(r4, r7, r6)
            if (r6 == 0) goto L_0x008c
            goto L_0x0092
        L_0x008c:
            java.lang.String r6 = "https://"
            java.lang.String r4 = p005b.p035e.p036a.p037a.C0843a.m451l(r6, r4)
        L_0x0092:
            if (r4 == 0) goto L_0x0095
            r5 = r4
        L_0x0095:
            r2.<init>(r5, r1)
        L_0x0098:
            r0.mo26008g(r2)
            goto L_0x00ac
        L_0x009c:
            java.lang.String r0 = "showalert"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x00ac
            com.appfoundry.previewer.activities.BravoActivity$f r0 = new com.appfoundry.previewer.activities.BravoActivity$f
            r0.<init>(r12, r13)
        L_0x00a9:
            r12.runOnUiThread(r0)
        L_0x00ac:
            java.lang.String r0 = r13.f10915a
            boolean r0 = p298d.p344x.p346c.C6888i.m12434a(r0, r3)
            if (r0 == 0) goto L_0x00bc
            com.appfoundry.previewer.model.Params r13 = r13.f10916b
            if (r13 == 0) goto L_0x00ba
            java.lang.String r1 = r13.f11059A
        L_0x00ba:
            if (r1 != 0) goto L_0x00d4
        L_0x00bc:
            com.appfoundry.previewer.activities.BravoActivity$g r13 = new com.appfoundry.previewer.activities.BravoActivity$g
            r13.<init>(r12, r15, r14)
            r12.runOnUiThread(r13)
            goto L_0x00d4
        L_0x00c5:
            java.lang.Object[] r13 = new java.lang.Object[r0]
            p.a.a$b r14 = p441p.p442a.C8091a.f16272d
            java.lang.String r15 = "Error parsing FormResponse"
            r14.mo26044b(r15, r13)
            r13 = 6
            java.lang.String r14 = "ERROR: Form response is null"
            p005b.p038f.p039a.C0849e.m483H0(r12, r14, r1, r0, r13)
        L_0x00d4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appfoundry.previewer.activities.BravoActivity.mo18424w(com.appfoundry.previewer.model.BackendResponse, android.widget.RelativeLayout, androidx.fragment.app.Fragment):void");
    }

    /* JADX WARNING: type inference failed for: r3v34, types: [b.g.a.e.f.g, b.g.a.f.a] */
    /* renamed from: x */
    public final void mo18425x(String str) {
        C0860b bVar;
        C0860b bVar2;
        Date date;
        C5245o.C5247b bVar3;
        C0850a aVar = new C0850a(this);
        aVar.f710d = true;
        C0866h hVar = new C0866h(this, new C0855b(aVar), new C0867i(this));
        RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.main_progressbar);
        if (relativeLayout != null) {
            C0758q.m247l(relativeLayout);
        }
        boolean b = hVar.mo10703b();
        String str2 = AnalyticsContext.Device.DEVICE_TOKEN_KEY;
        if (!b || C0849e.m545u()) {
            String str3 = C0906v.f811a;
            HashMap hashMap = new HashMap();
            StringBuilder sb = new StringBuilder();
            if (C0823f.m350S(1, 1)) {
                sb.append("code");
                sb.append(" ");
            }
            if (C0823f.m350S(1, 4)) {
                sb.append("id_token");
                sb.append(" ");
            }
            if (C0823f.m350S(1, 2)) {
                sb.append(str2);
            }
            hashMap.put("response_type", sb.toString().trim());
            hashMap.put("scope", "openid");
            if (!"bravovision".equals("bravovision".toLowerCase())) {
                Log.w(C0906v.f811a, "Please provide the scheme in lowercase and make sure it's the same configured in the intent filter. Android expects the scheme to be lowercase.");
            }
            hashMap.put("scope", "openid profile offline_access");
            String format = String.format("https://%s/api/v2/", Arrays.copyOf(new Object[]{C0849e.m505a().getString(R.string.com_auth0_domain)}, 1));
            C6888i.m12437d(format, "java.lang.String.format(format, *args)");
            hashMap.put("audience", format);
            if (true ^ C6888i.m12434a(str, "passwordless")) {
                hashMap.put("connection", str);
            }
            if (C0849e.m545u()) {
                C0690b bVar4 = C0690b.f396b;
                for (Map.Entry next : C0690b.f395a.entrySet()) {
                    if (next.getValue() != null) {
                        hashMap.put(next.getKey(), next.getValue().toString());
                    }
                }
                C0817f fVar = C0817f.f641b;
                StringBuilder sb2 = new StringBuilder();
                Context a = C0849e.m505a();
                C6888i.m12437d(a, "appContext()");
                sb2.append(a.getPackageName());
                sb2.append("after_logout");
                C0817f.m293a(sb2.toString());
            }
            C5419i iVar = new C5419i(this, relativeLayout, hVar);
            C0906v.f812b = null;
            if (!C0906v.m636a(getPackageManager())) {
                iVar.mo10731b(new C0856c("a0.browser_not_available", "No Browser application installed to perform web authentication."));
                return;
            }
            C0893n nVar = new C0893n(aVar, iVar, hashMap);
            nVar.f784e = false;
            boolean z = true;
            nVar.f785f = true;
            nVar.f788i = null;
            nVar.f787h = null;
            nVar.f789j = null;
            C0906v.f812b = nVar;
            String a2 = C0884f.m611a("bravovision", getApplicationContext().getPackageName(), aVar.f708b.f10428i);
            Map<String, String> map = nVar.f782c;
            if (nVar.mo10744f()) {
                try {
                    if (nVar.f787h == null) {
                        nVar.f787h = new C0898o(nVar.f783d, a2);
                    }
                    map.put("code_challenge", nVar.f787h.f804d);
                    map.put("code_challenge_method", "S256");
                    Log.v(C0893n.f779k, "Using PKCE authentication flow");
                } catch (IllegalStateException e) {
                    Log.e(C0893n.f779k, "Some algorithms aren't available on this device and PKCE can't be used. Defaulting to token response_type.", e);
                }
            }
            Map<String, String> map2 = nVar.f782c;
            C0926c cVar = nVar.f780a.f709c;
            if (cVar != null) {
                map2.put("auth0Client", cVar.f836b);
            }
            map2.put("client_id", nVar.f780a.f707a);
            map2.put("redirect_uri", a2);
            Map<String, String> map3 = nVar.f782c;
            map3.put("state", C0893n.m615d(map3.get("state")));
            if (!map3.containsKey("response_type") || (!map3.get("response_type").contains("id_token") && !map3.get("response_type").contains("code"))) {
                z = false;
            }
            if (z) {
                map3.put("nonce", C0893n.m615d(map3.get("nonce")));
            }
            C5245o.C5247b k = nVar.f780a.f708b.mo17170k();
            k.mo17175a("authorize");
            Uri.Builder buildUpon = Uri.parse(k.mo17177c().f10428i).buildUpon();
            for (Map.Entry next2 : nVar.f782c.entrySet()) {
                buildUpon.appendQueryParameter((String) next2.getKey(), (String) next2.getValue());
            }
            Uri build = buildUpon.build();
            build.toString();
            Objects.requireNonNull(nVar.f780a);
            nVar.f786g = 110;
            if (nVar.f785f) {
                AuthenticationActivity.m10312a(this, build, nVar.f788i);
                return;
            }
            boolean z2 = nVar.f784e;
            Intent intent = new Intent(this, AuthenticationActivity.class);
            intent.putExtra("com.auth0.android.EXTRA_AUTHORIZE_URI", build);
            intent.putExtra("com.auth0.android.EXTRA_USE_BROWSER", false);
            intent.putExtra("com.auth0.android.EXTRA_USE_FULL_SCREEN", z2);
            intent.putExtra("com.auth0.android.EXTRA_CONNECTION_NAME", nVar.f782c.get("connection"));
            intent.addFlags(67108864);
            startActivityForResult(intent, 110);
            return;
        }
        C8091a.f16272d.mo26043a("HAS VALID CREDENTIALS AND NO FORCELOGIN", new Object[0]);
        C5418h hVar2 = new C5418h(this, hVar, relativeLayout);
        if (!hVar.mo10703b()) {
            hVar2.mo10713b(new C0860b("No Credentials were previously set."));
            return;
        }
        try {
            C0921a aVar2 = (C0921a) hVar.f734d.mo16117c(new String(hVar.f733c.mo10694b(Base64.decode(hVar.f732b.mo10711g("com.auth0.credentials"), 0))), C0921a.class);
            if ((TextUtils.isEmpty(aVar2.f824a) && TextUtils.isEmpty(aVar2.f826c)) || (date = aVar2.f829f) == null) {
                bVar2 = new C0860b("No Credentials were previously set.");
            } else if (date.getTime() > System.currentTimeMillis()) {
                hVar2.mo10712a(aVar2);
                return;
            } else if (aVar2.f827d == null) {
                bVar2 = new C0860b("No Credentials were previously set.");
            } else {
                Log.d(C0866h.f730g, "Credentials have expired. Renewing them now...");
                C0855b bVar5 = hVar.f731a;
                String str4 = aVar2.f827d;
                Objects.requireNonNull(bVar5);
                C0857d b2 = C0857d.m561b();
                String str5 = bVar5.f711a.f707a;
                if (str5 == null) {
                    b2.f719a.remove("client_id");
                } else {
                    b2.f719a.put("client_id", str5);
                }
                String str6 = "refresh_token";
                if (str4 == null) {
                    b2.f719a.remove(str6);
                } else {
                    b2.f719a.put(str6, str4);
                }
                if (!bVar5.f711a.f710d) {
                    str6 = "urn:ietf:params:oauth:grant-type:jwt-bearer";
                }
                b2.f719a.put("grant_type", str6);
                Map<String, Object> a3 = b2.mo10692a();
                C0850a aVar3 = bVar5.f711a;
                if (aVar3.f710d) {
                    bVar3 = C5245o.m9723l(aVar3.f708b.f10428i).mo17170k();
                    bVar3.mo17176b("oauth");
                } else {
                    bVar3 = C5245o.m9723l(aVar3.f708b.f10428i).mo17170k();
                    str2 = "delegation";
                }
                bVar3.mo17176b(str2);
                C0910c cVar2 = (C0910c) bVar5.f714d.mo10751a(bVar3.mo17177c(), bVar5.f712b, bVar5.f713c, C0921a.class, bVar5.f715e);
                cVar2.mo10748a(a3);
                cVar2.mo10750c(new C0865g(hVar, aVar2, hVar2));
                return;
            }
            hVar2.mo10713b(bVar2);
        } catch (C0863e e2) {
            bVar = new C0860b(String.format("This device is not compatible with the %s class.", new Object[]{C0866h.class.getSimpleName()}), e2);
            hVar2.mo10713b(bVar);
        } catch (C0861c e3) {
            hVar.mo10702a();
            bVar = new C0860b("A change on the Lock Screen security settings have deemed the encryption keys invalid and have been recreated. Any previously stored content is now lost. Please, try saving the credentials again.", e3);
            hVar2.mo10713b(bVar);
        }
    }

    /* renamed from: y */
    public final void mo18426y(boolean z, Fragment fragment, RelativeLayout relativeLayout) {
        if (fragment != null) {
            if (!z) {
                C0849e.m538q0(this, fragment);
            }
        } else if (z) {
            if (relativeLayout != null) {
                C0758q.m247l(relativeLayout);
            }
        } else if (relativeLayout != null) {
            C0758q.m240e(relativeLayout);
        }
    }

    /* renamed from: z */
    public final void mo18427z(C0774e eVar, C0774e eVar2, RelativeLayout relativeLayout) {
        BravoApp.C5403b bVar = BravoApp.f10730N;
        FirebaseAuth firebaseAuth = BravoApp.f10718B;
        if (firebaseAuth != null) {
            String str = "";
            String d = eVar != null ? C0812d.f622f.mo10638d(eVar) : str;
            if (eVar2 != null) {
                str = C0812d.f622f.mo10638d(eVar2);
            }
            C0823f.m376j(d);
            C0823f.m376j(str);
            C2600xh xhVar = firebaseAuth.f11419e;
            C3825d dVar = firebaseAuth.f11415a;
            String str2 = firebaseAuth.f11423i;
            C3933u0 u0Var = new C3933u0(firebaseAuth);
            Objects.requireNonNull(xhVar);
            C2456rh rhVar = new C2456rh(d, str, str2);
            rhVar.mo12468d(dVar);
            rhVar.mo12470f(u0Var);
            C3428h b = xhVar.mo12920b(rhVar);
            if (b != null) {
                b.mo14680b(this, new C5420j(this, relativeLayout));
            }
        }
    }
}
