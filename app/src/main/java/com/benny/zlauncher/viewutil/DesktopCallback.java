package com.benny.zlauncher.viewutil;

import android.view.View;

import com.benny.zlauncher.interfaces.ItemHistory;
import com.benny.zlauncher.model.Item;

public interface DesktopCallback extends ItemHistory {
    boolean addItemToPoint(Item item, int x, int y);

    boolean addItemToPage(Item item, int page);

    boolean addItemToCell(Item item, int x, int y);

    void removeItem(View view, boolean animate);
}
