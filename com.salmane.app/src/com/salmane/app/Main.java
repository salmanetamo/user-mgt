package com.salmane.app;

import com.salmane.core.ui.Menu;
import com.salmane.usermanagement.UserManagement;

public class Main {
    private static final UserManagement userManagement = new UserManagement();
    private static final Menu menu = new Menu(
            choice -> {
                switch (choice) {
                    case 0:
                        System.out.println("Back to main menu");
                        break;
                    case 1:
                        userManagement.connect();
                        break;
                    case 2:
                        System.out.println("showReportsMenu()");
                        break;
                    case 3:
                        System.out.println("showCourseManagementMenu()");
                        break;
                    case 4:
                        System.out.println("showMessagesManagementMenu()");
                        break;
                    case 5:
                        System.out.println("showAssessmentManagementMenu()");
                        break;
                    default:
                        System.out.println("Invalid choice!");
                }
            }
    );

    public static void main(String[] args) {
        menu.showMenu();
    }
}