package androidx.media.app;

import android.app.Notification;
import android.app.PendingIntent;
import android.media.session.MediaSession;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.p001v4.media.session.MediaSessionCompat;
import android.widget.RemoteViews;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.core.app.NotificationBuilderWithBuilderAccessor;
import androidx.core.app.NotificationCompat;
import androidx.media.C0403R;
import p352f.p353a.p355b.p357b.p358g.C6946b;

public class NotificationCompat {

    public static class DecoratedMediaCustomViewStyle extends MediaStyle {
        private void setBackgroundColor(RemoteViews remoteViews) {
            remoteViews.setInt(C0403R.C0406id.status_bar_latest_event_content, "setBackgroundColor", this.mBuilder.getColor() != 0 ? this.mBuilder.getColor() : this.mBuilder.mContext.getResources().getColor(C0403R.C0404color.notification_material_background_media_default_color));
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public void apply(NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor) {
            notificationBuilderWithBuilderAccessor.getBuilder().setStyle(fillInMediaStyle(new Notification.DecoratedMediaCustomViewStyle()));
        }

        public int getBigContentViewLayoutResource(int i) {
            return i <= 3 ? C0403R.layout.notification_template_big_media_narrow_custom : C0403R.layout.notification_template_big_media_custom;
        }

        public int getContentViewLayoutResource() {
            return this.mBuilder.getContentView() != null ? C0403R.layout.notification_template_media_custom : super.getContentViewLayoutResource();
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public RemoteViews makeBigContentView(NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor) {
            return null;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public RemoteViews makeContentView(NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor) {
            return null;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public RemoteViews makeHeadsUpContentView(NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor) {
            return null;
        }
    }

    public static class MediaStyle extends NotificationCompat.Style {
        private static final int MAX_MEDIA_BUTTONS = 5;
        private static final int MAX_MEDIA_BUTTONS_IN_COMPACT = 3;
        public int[] mActionsToShowInCompact = null;
        public PendingIntent mCancelButtonIntent;
        public boolean mShowCancelButton;
        public MediaSessionCompat.Token mToken;

        public MediaStyle() {
        }

        public MediaStyle(NotificationCompat.Builder builder) {
            setBuilder(builder);
        }

        private RemoteViews generateMediaActionButton(NotificationCompat.Action action) {
            boolean z = action.getActionIntent() == null;
            RemoteViews remoteViews = new RemoteViews(this.mBuilder.mContext.getPackageName(), C0403R.layout.notification_media_action);
            int i = C0403R.C0406id.action0;
            remoteViews.setImageViewResource(i, action.getIcon());
            if (!z) {
                remoteViews.setOnClickPendingIntent(i, action.getActionIntent());
            }
            remoteViews.setContentDescription(i, action.getTitle());
            return remoteViews;
        }

        public static MediaSessionCompat.Token getMediaSession(Notification notification) {
            Parcelable parcelable;
            Bundle extras = androidx.core.app.NotificationCompat.getExtras(notification);
            if (extras == null || (parcelable = extras.getParcelable(androidx.core.app.NotificationCompat.EXTRA_MEDIA_SESSION)) == null) {
                return null;
            }
            return MediaSessionCompat.Token.m28a(parcelable, (C6946b) null);
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public void apply(NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor) {
            notificationBuilderWithBuilderAccessor.getBuilder().setStyle(fillInMediaStyle(new Notification.MediaStyle()));
        }

        @RequiresApi(21)
        public Notification.MediaStyle fillInMediaStyle(Notification.MediaStyle mediaStyle) {
            int[] iArr = this.mActionsToShowInCompact;
            if (iArr != null) {
                mediaStyle.setShowActionsInCompactView(iArr);
            }
            MediaSessionCompat.Token token = this.mToken;
            if (token != null) {
                mediaStyle.setMediaSession((MediaSession.Token) token.f45g);
            }
            return mediaStyle;
        }

        public RemoteViews generateBigContentView() {
            int min = Math.min(this.mBuilder.mActions.size(), 5);
            RemoteViews applyStandardTemplate = applyStandardTemplate(false, getBigContentViewLayoutResource(min), false);
            applyStandardTemplate.removeAllViews(C0403R.C0406id.media_actions);
            if (min > 0) {
                for (int i = 0; i < min; i++) {
                    applyStandardTemplate.addView(C0403R.C0406id.media_actions, generateMediaActionButton(this.mBuilder.mActions.get(i)));
                }
            }
            if (this.mShowCancelButton) {
                int i2 = C0403R.C0406id.cancel_action;
                applyStandardTemplate.setViewVisibility(i2, 0);
                applyStandardTemplate.setInt(i2, "setAlpha", this.mBuilder.mContext.getResources().getInteger(C0403R.integer.cancel_button_image_alpha));
                applyStandardTemplate.setOnClickPendingIntent(i2, this.mCancelButtonIntent);
            } else {
                applyStandardTemplate.setViewVisibility(C0403R.C0406id.cancel_action, 8);
            }
            return applyStandardTemplate;
        }

        public RemoteViews generateContentView() {
            RemoteViews applyStandardTemplate = applyStandardTemplate(false, getContentViewLayoutResource(), true);
            int size = this.mBuilder.mActions.size();
            int[] iArr = this.mActionsToShowInCompact;
            int min = iArr == null ? 0 : Math.min(iArr.length, 3);
            applyStandardTemplate.removeAllViews(C0403R.C0406id.media_actions);
            if (min > 0) {
                int i = 0;
                while (i < min) {
                    if (i < size) {
                        applyStandardTemplate.addView(C0403R.C0406id.media_actions, generateMediaActionButton(this.mBuilder.mActions.get(this.mActionsToShowInCompact[i])));
                        i++;
                    } else {
                        throw new IllegalArgumentException(String.format("setShowActionsInCompactView: action %d out of bounds (max %d)", new Object[]{Integer.valueOf(i), Integer.valueOf(size - 1)}));
                    }
                }
            }
            if (this.mShowCancelButton) {
                applyStandardTemplate.setViewVisibility(C0403R.C0406id.end_padder, 8);
                int i2 = C0403R.C0406id.cancel_action;
                applyStandardTemplate.setViewVisibility(i2, 0);
                applyStandardTemplate.setOnClickPendingIntent(i2, this.mCancelButtonIntent);
                applyStandardTemplate.setInt(i2, "setAlpha", this.mBuilder.mContext.getResources().getInteger(C0403R.integer.cancel_button_image_alpha));
            } else {
                applyStandardTemplate.setViewVisibility(C0403R.C0406id.end_padder, 0);
                applyStandardTemplate.setViewVisibility(C0403R.C0406id.cancel_action, 8);
            }
            return applyStandardTemplate;
        }

        public int getBigContentViewLayoutResource(int i) {
            return i <= 3 ? C0403R.layout.notification_template_big_media_narrow : C0403R.layout.notification_template_big_media;
        }

        public int getContentViewLayoutResource() {
            return C0403R.layout.notification_template_media;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public RemoteViews makeBigContentView(NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor) {
            return null;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public RemoteViews makeContentView(NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor) {
            return null;
        }

        public MediaStyle setCancelButtonIntent(PendingIntent pendingIntent) {
            this.mCancelButtonIntent = pendingIntent;
            return this;
        }

        public MediaStyle setMediaSession(MediaSessionCompat.Token token) {
            this.mToken = token;
            return this;
        }

        public MediaStyle setShowActionsInCompactView(int... iArr) {
            this.mActionsToShowInCompact = iArr;
            return this;
        }

        public MediaStyle setShowCancelButton(boolean z) {
            return this;
        }
    }

    private NotificationCompat() {
    }
}
