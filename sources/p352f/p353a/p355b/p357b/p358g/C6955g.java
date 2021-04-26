package p352f.p353a.p355b.p357b.p358g;

import android.media.AudioAttributes;
import android.media.MediaMetadata;
import android.media.session.MediaController;
import android.media.session.MediaSession;
import android.media.session.PlaybackState;
import android.os.Bundle;
import android.os.Parcel;
import android.support.p001v4.media.MediaDescriptionCompat;
import android.support.p001v4.media.MediaMetadataCompat;
import android.support.p001v4.media.session.MediaSessionCompat;
import android.support.p001v4.media.session.PlaybackStateCompat;
import androidx.collection.ArrayMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import p352f.p353a.p355b.p357b.p358g.C6949c;
import p352f.p353a.p355b.p357b.p358g.C6954f;

/* renamed from: f.a.b.b.g.g */
public class C6955g<T extends C6954f> extends MediaController.Callback {

    /* renamed from: a */
    public final T f13955a;

    public C6955g(T t) {
        this.f13955a = t;
    }

    public void onAudioInfoChanged(MediaController.PlaybackInfo playbackInfo) {
        T t = this.f13955a;
        playbackInfo.getPlaybackType();
        AudioAttributes audioAttributes = playbackInfo.getAudioAttributes();
        if (!((audioAttributes.getFlags() & 1) == 1 || (audioAttributes.getFlags() & 4) == 4)) {
            int usage = audioAttributes.getUsage();
        }
        playbackInfo.getVolumeControl();
        playbackInfo.getMaxVolume();
        playbackInfo.getCurrentVolume();
        C6949c cVar = (C6949c) ((C6949c.C6950a) t).f13953a.get();
    }

    public void onExtrasChanged(Bundle bundle) {
        MediaSessionCompat.m27a(bundle);
        C6949c cVar = (C6949c) ((C6949c.C6950a) this.f13955a).f13953a.get();
    }

    public void onMetadataChanged(MediaMetadata mediaMetadata) {
        if (((C6949c) ((C6949c.C6950a) this.f13955a).f13953a.get()) != null) {
            ArrayMap<String, Integer> arrayMap = MediaMetadataCompat.f31h;
            if (mediaMetadata != null) {
                Parcel obtain = Parcel.obtain();
                mediaMetadata.writeToParcel(obtain, 0);
                obtain.setDataPosition(0);
                obtain.recycle();
                Objects.requireNonNull(MediaMetadataCompat.CREATOR.createFromParcel(obtain));
            }
        }
    }

    public void onPlaybackStateChanged(PlaybackState playbackState) {
        ArrayList arrayList;
        PlaybackStateCompat.CustomAction customAction;
        C6949c cVar = (C6949c) ((C6949c.C6950a) this.f13955a).f13953a.get();
        if (cVar != null && cVar.f13952a == null && playbackState != null) {
            List<PlaybackState.CustomAction> customActions = playbackState.getCustomActions();
            if (customActions != null) {
                ArrayList arrayList2 = new ArrayList(customActions.size());
                for (PlaybackState.CustomAction next : customActions) {
                    if (next != null) {
                        PlaybackState.CustomAction customAction2 = next;
                        customAction = new PlaybackStateCompat.CustomAction(customAction2.getAction(), customAction2.getName(), customAction2.getIcon(), customAction2.getExtras());
                        customAction.f67k = next;
                    } else {
                        customAction = null;
                    }
                    arrayList2.add(customAction);
                }
                arrayList = arrayList2;
            } else {
                arrayList = null;
            }
            new PlaybackStateCompat(playbackState.getState(), playbackState.getPosition(), playbackState.getBufferedPosition(), playbackState.getPlaybackSpeed(), playbackState.getActions(), 0, playbackState.getErrorMessage(), playbackState.getLastPositionUpdateTime(), arrayList, playbackState.getActiveQueueItemId(), playbackState.getExtras());
        }
    }

    public void onQueueChanged(List<MediaSession.QueueItem> list) {
        MediaSessionCompat.QueueItem queueItem;
        if (((C6949c) ((C6949c.C6950a) this.f13955a).f13953a.get()) != null && list != null) {
            ArrayList arrayList = new ArrayList();
            for (MediaSession.QueueItem next : list) {
                if (next != null) {
                    MediaSession.QueueItem queueItem2 = next;
                    queueItem = new MediaSessionCompat.QueueItem(next, MediaDescriptionCompat.m19a(queueItem2.getDescription()), queueItem2.getQueueId());
                } else {
                    queueItem = null;
                }
                arrayList.add(queueItem);
            }
        }
    }

    public void onQueueTitleChanged(CharSequence charSequence) {
        C6949c cVar = (C6949c) ((C6949c.C6950a) this.f13955a).f13953a.get();
    }

    public void onSessionDestroyed() {
        C6949c cVar = (C6949c) ((C6949c.C6950a) this.f13955a).f13953a.get();
    }

    public void onSessionEvent(String str, Bundle bundle) {
        MediaSessionCompat.m27a(bundle);
        C6949c cVar = (C6949c) ((C6949c.C6950a) this.f13955a).f13953a.get();
    }
}
