package com.benny.zlauncher.interfaces;

import com.benny.zlauncher.model.App;

import java.util.List;

public interface AppDeleteListener {
    boolean onAppDeleted(List<App> apps);
}
