import com.intellij.ide.ui.LafManager;

import javax.swing.*;

public class DumptruckApplicationComponent implements LafManagerListener, ApplicationActivationListener {
    public DumptruckApplicationComponent() {
    }

    @Override
    public void lookAndFeelChanged(@NotNull LafManager lafManager) {
        // see https://plugins.jetbrains.com/docs/intellij/plugin-listeners.html
        updateProgressBarUi();
    }

    @Override
    public void applicationActivated(@NotNull IdeFrame ideFrame) {
        updateProgressBarUi();
    }
    private void updateProgressBarUi() {
        UIManager.put("ProgressBarUI", DumptruckProgressBarUi.class.getName());
        UIManager.getDefaults().put(DumptruckProgressBarUi.class.getName(), DumptruckProgressBarUi.class);
    }
}
