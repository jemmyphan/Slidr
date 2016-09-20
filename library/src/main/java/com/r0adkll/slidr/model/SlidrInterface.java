package com.r0adkll.slidr.model;

import android.view.View;

/**
 * Created by r0adkll on 1/9/15.
 */
public interface SlidrInterface {
    void lock();
    void unlock();
    void updatePosition(SlidrPosition position);
    View getContentView();
}
