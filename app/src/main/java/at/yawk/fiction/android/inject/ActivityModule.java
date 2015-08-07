package at.yawk.fiction.android.inject;

import android.app.Activity;
import android.content.Context;
import at.yawk.fiction.android.ui.MainPreferenceActivity;
import at.yawk.fiction.android.ui.QueryOverviewActivity;
import at.yawk.fiction.android.ui.QueryWrapperActivity;
import at.yawk.fiction.android.ui.StoryActivity;
import dagger.Module;
import dagger.Provides;
import javax.inject.Singleton;

/**
 * @author yawkat
 */
@Module(
        addsTo = BaseModule.class,
        injects = {
                StoryActivity.class,
                QueryOverviewActivity.class,
                QueryWrapperActivity.class,
                MainPreferenceActivity.class,
        },
        library = true
)
public class ActivityModule {
    final Activity activity;

    ActivityModule(Activity activity) {
        this.activity = activity;
    }

    @SuppressWarnings("unused")
    @Deprecated
    ActivityModule() {
        throw new UnsupportedOperationException();
    }

    @Provides
    @Singleton
    Activity activity() {
        return activity;
    }

    @Provides
    @Singleton
    Context context() {
        return activity;
    }
}
