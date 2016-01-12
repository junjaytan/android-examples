package criminalintent.android.junjaytan.com.criminalintent;

import java.util.UUID;
import java.util.Date;

/**
 * Created by junjaytan on 12/28/15.
 */
public class Crime {

    private UUID mId;
    private String mTitle;

    private Date mDate;

    private boolean mSolved;

    public Crime() {
        this(UUID.randomUUID());
    }

    public Crime(UUID id) {
        // Generate unique identifier
        mId = id;
        mDate = new Date();
    }

    public UUID getId() {
        return mId;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }

    public Date getDate() {
        return mDate;
    }

    public void setDate(Date date) {
        mDate = date;
    }

    public boolean isSolved() {
        return mSolved;
    }

    public void setSolved(boolean solved) {
        mSolved = solved;
    }
}
