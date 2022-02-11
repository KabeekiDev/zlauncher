package com.benny.zlauncher.interfaces;

import com.benny.zlauncher.model.App;

import java.util.List;

public interface AppUpdateListener {
    boolean onAppUpdated(List<App> apps);
}
