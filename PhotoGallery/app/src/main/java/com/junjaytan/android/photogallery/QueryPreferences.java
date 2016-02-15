package com.junjaytan.android.photogallery;

import android.content.Context;
import android.preference.PreferenceManager;

/**
 * Created by junjaytan on 2/21/16.
 */
public class QueryPreferences {
    // used as the key for the query preference
    private static final String PREF_SEARCH_QUERY = "searchQuery";

    /*
     * returns the query valued stored in shared preferences by first acquiring
     * the default SharedPreferences for the given context
     */
    public static String getStoredQuery(Context context) {
        return PreferenceManager.getDefaultSharedPreferences(context)
                .getString(PREF_SEARCH_QUERY, null);
    }

    // writes the input query to the default shared preferences for the given context
    public static void setStoredQuery(Context context, String query) {
        PreferenceManager.getDefaultSharedPreferences(context)
                .edit()
                .putString(PREF_SEARCH_QUERY, query)
                .apply();
    }
}
