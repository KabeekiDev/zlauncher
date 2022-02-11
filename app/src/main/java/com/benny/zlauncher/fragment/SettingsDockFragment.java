package com.benny.zlauncher.fragment;

import android.os.Bundle;

import com.benny.zlauncher.R;

public class SettingsDockFragment extends SettingsBaseFragment {
    @Override
    public void onCreatePreferences(Bundle savedInstanceState, String rootKey) {
        super.onCreatePreferences(savedInstanceState, rootKey);
        addPreferencesFromResource(R.xml.preferences_dock);
    }
}
