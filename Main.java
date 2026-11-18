package com.bugtracking;

import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import java.util.List;

/**
 * Main application entry point for the Online Shopping Bug Tracking System.
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("==================================================");
        System.out.println("        ONLINE SHOPPING BUG TRACKING SYSTEM       ");
        System.out.println("==================================================");
        System.out.println("Initializing core storage and components...");

        BugStorage storage = new BugStorage();
        BugManager manager = new BugManager(storage);
ee
        System.out.println("Storage File: " + storage.getStorageFile().getAbsolutePath());
        System.out.println("Total bugs loaded: " + manager.getTotalBugsCount());
        System.out.println("  - Open: " + manager.getOpenBugsCount());
        System.out.println("  - In Progress: " + manager.getInProgressBugsCount());
        System.out.println("  - Resolved: " + manager.getResolvedBugsCount());

        // Check if user requested CLI mode
        if (args.length > 0 && "--cli".equalsIgnoreCase(args[0])) {
            System.out.println("\n[CLI Mode] Displaying all reported bugs:");
            List<BugReport> allBugs = manager.getAllBugs();
            for (BugReport bug : allBugs) {
                bug.displayBug();
            }
            return;
        }

        // Launch Modern Java Swing GUI
        System.out.println("Starting graphical desktop user interface...");
        SwingUtilities.invokeLater(() -> {
            try {
                // Apply modern OS system look and feel
                UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            } catch (Exception e) {
                System.err.println("Notice: Using standard look and feel: " + e.getMessage());
            }

            BugTrackerUI ui = new BugTrackerUI(manager);
            ui.setVisible(true);
            System.out.println("Online Shopping Bug Tracker GUI is now active and ready!");
        });
    }
}
