package space.wsq.grave;

import android.app.Application;
import android.content.Context;

import com.lody.virtual.client.core.VirtualCore;

import space.wsq.kit.devkit.ILogger;

public class GraveApp extends Application {
    private static final String TAG = "GraveApp";

    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
        try {
            VirtualCore.get().startup(base);
        } catch (Throwable e) {
            ILogger.defaultLogger.wtf(TAG, e);
        }
    }

    @Override
    public void onCreate() {
        super.onCreate();
    }

}
