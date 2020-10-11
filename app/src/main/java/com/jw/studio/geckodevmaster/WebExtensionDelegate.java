package com.jw.studio.geckodevmaster;

import com.jw.studio.geckodevmaster.session.TabSession;

import org.mozilla.geckoview.GeckoSession;
import org.mozilla.geckoview.WebExtension;

public interface WebExtensionDelegate {
    default GeckoSession toggleBrowserActionPopup(boolean force) {
        return null;
    }

    default void onActionButton(ActionButton button) {
    }

    default TabSession getSession(GeckoSession session) {
        return null;
    }

    default TabSession getCurrentSession() {
        return null;
    }

    default void closeTab(TabSession session) {}

    default void updateTab(TabSession session, WebExtension.UpdateTabDetails details) {}

    default TabSession openNewTab(WebExtension.CreateTabDetails details) {
        return null;
    }
}
