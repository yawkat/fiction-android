package at.yawk.fiction.android.inject;

import android.support.v4.app.Fragment;
import at.yawk.fiction.android.ui.QueryFragment;
import at.yawk.fiction.android.ui.StoryFragment;
import dagger.Module;

/**
 * @author yawkat
 */
@Module(
        addsTo = ActivityModule.class,
        injects = {
                QueryFragment.class,
                StoryFragment.class,
        }
)
public class FragmentModule {
    final Fragment fragment;

    FragmentModule(Fragment fragment) {
        this.fragment = fragment;
    }

    @SuppressWarnings("unused")
    @Deprecated
    FragmentModule() {
        throw new UnsupportedOperationException();
    }
}