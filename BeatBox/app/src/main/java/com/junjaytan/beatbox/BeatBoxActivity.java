package com.junjaytan.beatbox;

import android.app.Fragment;
import com.junjaytan.beatbox.SingleFragmentActivity;

public class BeatBoxActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment() {
        return BeatBoxFragment.newInstance();
    }
}
