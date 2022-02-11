package com.benny.zlauncher.fragment;

import android.os.Bundle;
import android.support.v7.preference.Preference;

import com.benny.zlauncher.R;
import com.benny.zlauncher.activity.HomeActivity;
import com.benny.zlauncher.util.LauncherAction;

import net.gsantner.opoc.util.ContextUtils;

public class SettingsDesktopFragment extends SettingsBaseFragment {
    @Override
    public void onCreatePreferences(Bundle savedInstanceState, String rootKey) {
        super.onCreatePreferences(savedInstanceState, rootKey);
        addPreferencesFromResource(R.xml.preferences_desktop);
    }

    @Override
    public boolean onPreferenceTreeClick(Preference preference) {
        HomeActivity homeActivity = HomeActivity._launcher;
        int key = new ContextUtils(homeActivity).getResId(ContextUtils.ResType.STRING, preference.getKey());
        switch (key) {
            case R.string.pref_key__minibar:
                LauncherAction.RunAction(LauncherAction.Action.EditMinibar, getActivity());
                return true;
        }
        return false;
    }
}
