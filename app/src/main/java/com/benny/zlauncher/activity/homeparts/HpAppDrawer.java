package com.benny.zlauncher.activity.homeparts;

import com.benny.zlauncher.activity.HomeActivity;
import com.benny.zlauncher.manager.Setup;
import com.benny.zlauncher.util.Tool;
import com.benny.zlauncher.widget.AppDrawerController;
import com.benny.zlauncher.widget.PagerIndicator;

import net.gsantner.opoc.util.Callback;

public class HpAppDrawer implements Callback.a2<Boolean, Boolean> {
    private HomeActivity _homeActivity;
    private PagerIndicator _appDrawerIndicator;

    public HpAppDrawer(HomeActivity homeActivity, PagerIndicator appDrawerIndicator) {
        _homeActivity = homeActivity;
        _appDrawerIndicator = appDrawerIndicator;
    }

    public void initAppDrawer(AppDrawerController appDrawerController) {
        appDrawerController.setCallBack(this);
    }

    @Override
    public void callback(Boolean openingOrClosing, Boolean startOrEnd) {
        if (openingOrClosing) {
            if (startOrEnd) {
                _homeActivity.getAppDrawerController().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        Tool.visibleViews(200, _appDrawerIndicator);
                        Tool.invisibleViews(200, _homeActivity.getDesktop());
                        _homeActivity.updateDesktopIndicator(false);
                        _homeActivity.updateDock(false);
                        _homeActivity.updateSearchBar(false);
                    }
                }, 100);
            }
        } else {
            if (startOrEnd) {
                Tool.invisibleViews(200, _appDrawerIndicator);
                Tool.visibleViews(200, _homeActivity.getDesktop());
                _homeActivity.updateDesktopIndicator(true);
                _homeActivity.updateDock(true);
                _homeActivity.updateSearchBar(true);
            } else {
                if (!Setup.appSettings().getDrawerRememberPosition()) {
                    _homeActivity.getAppDrawerController().reset();
                }
            }
        }
    }
}
