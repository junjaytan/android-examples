package criminalintent.android.junjaytan.com.criminalintent;

import android.support.v4.app.Fragment;

/**
 * Created by junjaytan on 1/2/16.
 */
public class CrimeListActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
}
