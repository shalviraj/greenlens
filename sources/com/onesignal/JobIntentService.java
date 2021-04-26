package com.onesignal;

import android.app.Service;
import android.app.job.JobInfo;
import android.app.job.JobParameters;
import android.app.job.JobScheduler;
import android.app.job.JobServiceEngine;
import android.app.job.JobWorkItem;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Build;
import android.os.IBinder;
import android.os.PowerManager;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import java.util.ArrayList;
import java.util.HashMap;
import p005b.p035e.p036a.p037a.C0843a;

public abstract class JobIntentService extends Service {

    /* renamed from: l */
    public static final Object f11491l = new Object();

    /* renamed from: m */
    public static final HashMap<ComponentNameWithWakeful, WorkEnqueuer> f11492m = new HashMap<>();

    /* renamed from: g */
    public CompatJobEngine f11493g;

    /* renamed from: h */
    public WorkEnqueuer f11494h;

    /* renamed from: i */
    public CommandProcessor f11495i;

    /* renamed from: j */
    public boolean f11496j = false;

    /* renamed from: k */
    public final ArrayList<CompatWorkItem> f11497k = new ArrayList<>();

    public final class CommandProcessor extends AsyncTask<Void, Void, Void> {
        public CommandProcessor() {
        }

        public Void doInBackground(Void... voidArr) {
            GenericWorkItem genericWorkItem;
            while (true) {
                JobIntentService jobIntentService = JobIntentService.this;
                CompatJobEngine compatJobEngine = jobIntentService.f11493g;
                if (compatJobEngine == null || (genericWorkItem = compatJobEngine.dequeueWork()) == null) {
                    synchronized (jobIntentService.f11497k) {
                        if (jobIntentService.f11497k.size() > 0) {
                            GenericWorkItem remove = jobIntentService.f11497k.remove(0);
                            genericWorkItem = remove;
                        } else {
                            genericWorkItem = null;
                        }
                    }
                }
                if (genericWorkItem == null) {
                    return null;
                }
                JobIntentService.this.mo22334d(genericWorkItem.getIntent());
                genericWorkItem.complete();
            }
            while (true) {
            }
        }

        public void onCancelled(Void voidR) {
            JobIntentService.this.mo22337e();
        }

        public void onPostExecute(Void voidR) {
            JobIntentService.this.mo22337e();
        }
    }

    public interface CompatJobEngine {
        IBinder compatGetBinder();

        GenericWorkItem dequeueWork();
    }

    public static final class CompatWorkEnqueuer extends WorkEnqueuer {
        private final Context mContext;
        private final PowerManager.WakeLock mLaunchWakeLock;
        public boolean mLaunchingService;
        private final PowerManager.WakeLock mRunWakeLock;
        public boolean mServiceProcessing;

        public CompatWorkEnqueuer(Context context, ComponentName componentName) {
            super(componentName);
            this.mContext = context.getApplicationContext();
            PowerManager powerManager = (PowerManager) context.getSystemService("power");
            PowerManager.WakeLock newWakeLock = powerManager.newWakeLock(1, componentName.getClassName() + ":launch");
            this.mLaunchWakeLock = newWakeLock;
            newWakeLock.setReferenceCounted(false);
            PowerManager.WakeLock newWakeLock2 = powerManager.newWakeLock(1, componentName.getClassName() + ":run");
            this.mRunWakeLock = newWakeLock2;
            newWakeLock2.setReferenceCounted(false);
        }

        public void enqueueWork(Intent intent) {
            Intent intent2 = new Intent(intent);
            intent2.setComponent(this.mComponentName);
            if (this.mContext.startService(intent2) != null) {
                synchronized (this) {
                    if (!this.mLaunchingService) {
                        this.mLaunchingService = true;
                        if (!this.mServiceProcessing) {
                            this.mLaunchWakeLock.acquire(60000);
                        }
                    }
                }
            }
        }

        public void serviceProcessingFinished() {
            synchronized (this) {
                if (this.mServiceProcessing) {
                    if (this.mLaunchingService) {
                        this.mLaunchWakeLock.acquire(60000);
                    }
                    this.mServiceProcessing = false;
                    this.mRunWakeLock.release();
                }
            }
        }

        public void serviceProcessingStarted() {
            synchronized (this) {
                if (!this.mServiceProcessing) {
                    this.mServiceProcessing = true;
                    this.mRunWakeLock.acquire(600000);
                    this.mLaunchWakeLock.release();
                }
            }
        }

        public void serviceStartReceived() {
            synchronized (this) {
                this.mLaunchingService = false;
            }
        }
    }

    public final class CompatWorkItem implements GenericWorkItem {
        public final Intent mIntent;
        public final int mStartId;

        public CompatWorkItem(Intent intent, int i) {
            this.mIntent = intent;
            this.mStartId = i;
        }

        public void complete() {
            JobIntentService.this.stopSelf(this.mStartId);
        }

        public Intent getIntent() {
            return this.mIntent;
        }
    }

    public static class ComponentNameWithWakeful {
        private ComponentName componentName;
        private boolean useWakefulService;

        public ComponentNameWithWakeful(ComponentName componentName2, boolean z) {
            this.componentName = componentName2;
            this.useWakefulService = z;
        }
    }

    public interface GenericWorkItem {
        void complete();

        Intent getIntent();
    }

    @RequiresApi(26)
    public static final class JobServiceEngineImpl extends JobServiceEngine implements CompatJobEngine {
        public static final boolean DEBUG = false;
        public static final String TAG = "JobServiceEngineImpl";
        public final Object mLock = new Object();
        public JobParameters mParams;
        public final JobIntentService mService;

        public final class WrapperWorkItem implements GenericWorkItem {
            public final JobWorkItem mJobWork;

            public WrapperWorkItem(JobWorkItem jobWorkItem) {
                this.mJobWork = jobWorkItem;
            }

            public void complete() {
                String str;
                String str2;
                synchronized (JobServiceEngineImpl.this.mLock) {
                    JobParameters jobParameters = JobServiceEngineImpl.this.mParams;
                    if (jobParameters != null) {
                        try {
                            jobParameters.completeWork(this.mJobWork);
                        } catch (SecurityException e) {
                            e = e;
                            str = "JobServiceEngineImpl";
                            str2 = "SecurityException: Failed to run mParams.completeWork(mJobWork)!";
                        } catch (IllegalArgumentException e2) {
                            e = e2;
                            str = "JobServiceEngineImpl";
                            str2 = "IllegalArgumentException: Failed to run mParams.completeWork(mJobWork)!";
                        }
                    }
                }
                Log.e(str, str2, e);
            }

            public Intent getIntent() {
                return this.mJobWork.getIntent();
            }
        }

        public JobServiceEngineImpl(JobIntentService jobIntentService) {
            super(jobIntentService);
            this.mService = jobIntentService;
        }

        public IBinder compatGetBinder() {
            return getBinder();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:11:0x000f, code lost:
            if (r1 == null) goto L_0x0024;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0011, code lost:
            r1.getIntent().setExtrasClassLoader(r5.mService.getClassLoader());
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x0023, code lost:
            return new com.onesignal.JobIntentService.JobServiceEngineImpl.WrapperWorkItem(r5, r1);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0024, code lost:
            return null;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public com.onesignal.JobIntentService.GenericWorkItem dequeueWork() {
            /*
                r5 = this;
                java.lang.Object r0 = r5.mLock
                monitor-enter(r0)
                android.app.job.JobParameters r1 = r5.mParams     // Catch:{ all -> 0x002f }
                r2 = 0
                if (r1 != 0) goto L_0x000a
                monitor-exit(r0)     // Catch:{ all -> 0x002f }
                return r2
            L_0x000a:
                android.app.job.JobWorkItem r1 = r1.dequeueWork()     // Catch:{ SecurityException -> 0x0025 }
                monitor-exit(r0)     // Catch:{ all -> 0x002f }
                if (r1 == 0) goto L_0x0024
                android.content.Intent r0 = r1.getIntent()
                com.onesignal.JobIntentService r2 = r5.mService
                java.lang.ClassLoader r2 = r2.getClassLoader()
                r0.setExtrasClassLoader(r2)
                com.onesignal.JobIntentService$JobServiceEngineImpl$WrapperWorkItem r0 = new com.onesignal.JobIntentService$JobServiceEngineImpl$WrapperWorkItem
                r0.<init>(r1)
                return r0
            L_0x0024:
                return r2
            L_0x0025:
                r1 = move-exception
                java.lang.String r3 = "JobServiceEngineImpl"
                java.lang.String r4 = "Failed to run mParams.dequeueWork()!"
                android.util.Log.e(r3, r4, r1)     // Catch:{ all -> 0x002f }
                monitor-exit(r0)     // Catch:{ all -> 0x002f }
                return r2
            L_0x002f:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x002f }
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.onesignal.JobIntentService.JobServiceEngineImpl.dequeueWork():com.onesignal.JobIntentService$GenericWorkItem");
        }

        public boolean onStartJob(JobParameters jobParameters) {
            this.mParams = jobParameters;
            this.mService.mo22336b(false);
            return true;
        }

        public boolean onStopJob(JobParameters jobParameters) {
            CommandProcessor commandProcessor = this.mService.f11495i;
            if (commandProcessor != null) {
                commandProcessor.cancel(false);
            }
            synchronized (this.mLock) {
                this.mParams = null;
            }
            return true;
        }
    }

    @RequiresApi(26)
    public static final class JobWorkEnqueuer extends WorkEnqueuer {
        private final JobInfo mJobInfo;
        private final JobScheduler mJobScheduler;

        public JobWorkEnqueuer(Context context, ComponentName componentName, int i) {
            super(componentName);
            ensureJobId(i);
            this.mJobInfo = new JobInfo.Builder(i, this.mComponentName).setOverrideDeadline(0).build();
            this.mJobScheduler = (JobScheduler) context.getApplicationContext().getSystemService("jobscheduler");
        }

        public void enqueueWork(Intent intent) {
            this.mJobScheduler.enqueue(this.mJobInfo, new JobWorkItem(intent));
        }
    }

    public static abstract class WorkEnqueuer {
        public final ComponentName mComponentName;
        public boolean mHasJobId;
        public int mJobId;

        public WorkEnqueuer(ComponentName componentName) {
            this.mComponentName = componentName;
        }

        public abstract void enqueueWork(Intent intent);

        public void ensureJobId(int i) {
            if (!this.mHasJobId) {
                this.mHasJobId = true;
                this.mJobId = i;
            } else if (this.mJobId != i) {
                StringBuilder v = C0843a.m461v("Given job ID ", i, " is different than previous ");
                v.append(this.mJobId);
                throw new IllegalArgumentException(v.toString());
            }
        }

        public void serviceProcessingFinished() {
        }

        public void serviceProcessingStarted() {
        }

        public void serviceStartReceived() {
        }
    }

    /* renamed from: a */
    public static void m10584a(@NonNull Context context, @NonNull ComponentName componentName, int i, @NonNull Intent intent, boolean z) {
        if (intent != null) {
            synchronized (f11491l) {
                WorkEnqueuer c = m10585c(context, componentName, true, i, z);
                c.ensureJobId(i);
                try {
                    c.enqueueWork(intent);
                } catch (IllegalStateException e) {
                    if (z) {
                        m10585c(context, componentName, true, i, false).enqueueWork(intent);
                    } else {
                        throw e;
                    }
                }
            }
            return;
        }
        throw new IllegalArgumentException("work must not be null");
    }

    /* renamed from: c */
    public static WorkEnqueuer m10585c(Context context, ComponentName componentName, boolean z, int i, boolean z2) {
        WorkEnqueuer workEnqueuer;
        ComponentNameWithWakeful componentNameWithWakeful = new ComponentNameWithWakeful(componentName, z2);
        HashMap<ComponentNameWithWakeful, WorkEnqueuer> hashMap = f11492m;
        WorkEnqueuer workEnqueuer2 = hashMap.get(componentNameWithWakeful);
        if (workEnqueuer2 != null) {
            return workEnqueuer2;
        }
        if (Build.VERSION.SDK_INT < 26 || z2) {
            workEnqueuer = new CompatWorkEnqueuer(context, componentName);
        } else if (z) {
            workEnqueuer = new JobWorkEnqueuer(context, componentName, i);
        } else {
            throw new IllegalArgumentException("Can't be here without a job id");
        }
        WorkEnqueuer workEnqueuer3 = workEnqueuer;
        hashMap.put(componentNameWithWakeful, workEnqueuer3);
        return workEnqueuer3;
    }

    /* renamed from: b */
    public void mo22336b(boolean z) {
        if (this.f11495i == null) {
            this.f11495i = new CommandProcessor();
            WorkEnqueuer workEnqueuer = this.f11494h;
            if (workEnqueuer != null && z) {
                workEnqueuer.serviceProcessingStarted();
            }
            this.f11495i.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
        }
    }

    /* renamed from: d */
    public abstract void mo22334d(@NonNull Intent intent);

    /* renamed from: e */
    public void mo22337e() {
        ArrayList<CompatWorkItem> arrayList = this.f11497k;
        if (arrayList != null) {
            synchronized (arrayList) {
                this.f11495i = null;
                ArrayList<CompatWorkItem> arrayList2 = this.f11497k;
                if (arrayList2 != null && arrayList2.size() > 0) {
                    mo22336b(false);
                } else if (!this.f11496j) {
                    this.f11494h.serviceProcessingFinished();
                }
            }
        }
    }

    public IBinder onBind(@NonNull Intent intent) {
        CompatJobEngine compatJobEngine = this.f11493g;
        if (compatJobEngine != null) {
            return compatJobEngine.compatGetBinder();
        }
        return null;
    }

    public void onCreate() {
        super.onCreate();
        if (Build.VERSION.SDK_INT >= 26) {
            this.f11493g = new JobServiceEngineImpl(this);
            this.f11494h = null;
        }
        this.f11494h = m10585c(this, new ComponentName(this, getClass()), false, 0, true);
    }

    public void onDestroy() {
        super.onDestroy();
        CommandProcessor commandProcessor = this.f11495i;
        if (commandProcessor != null) {
            commandProcessor.cancel(false);
        }
        synchronized (this.f11497k) {
            this.f11496j = true;
            this.f11494h.serviceProcessingFinished();
        }
    }

    public int onStartCommand(@Nullable Intent intent, int i, int i2) {
        this.f11494h.serviceStartReceived();
        synchronized (this.f11497k) {
            ArrayList<CompatWorkItem> arrayList = this.f11497k;
            if (intent == null) {
                intent = new Intent();
            }
            arrayList.add(new CompatWorkItem(intent, i2));
            mo22336b(true);
        }
        return 3;
    }
}
