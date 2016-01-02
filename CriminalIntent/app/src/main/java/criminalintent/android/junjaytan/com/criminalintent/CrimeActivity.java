package criminalintent.android.junjaytan.com.criminalintent;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;

public class CrimeActivity extends SingleFragmentActivity {
    /** Called when the activity is first created **/
    @Override
    protected Fragment createFragment() {
        return new CrimeFragment();
    }
}
