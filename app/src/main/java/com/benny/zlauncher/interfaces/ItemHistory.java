package com.benny.zlauncher.interfaces;

import android.view.View;

import com.benny.zlauncher.model.Item;

public interface ItemHistory {
    void setLastItem(Item item, View view);

    void revertLastItem();

    void consumeLastItem();
}
