/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ministry;

/**
 *
 * @author HP
 */
public class AdminSession {
    private static boolean isLoggedIn = false;
    private static int adminId = -1;
    private static String ministryAdminEmail = null;

    public static boolean isLoggedIn() {
        return isLoggedIn;
    }

    public static void setLoggedIn(boolean loggedIn, int id) {
        isLoggedIn = loggedIn;
        adminId = id;
    }
    
    public static int getAdminId() {
        return adminId;
    }
    
    public static void setMinistryAdminEmail(boolean loggedIn,String email) {
        isLoggedIn = loggedIn;
        ministryAdminEmail = email;
    }

    public static String getMinistryAdminEmail() {
        return ministryAdminEmail;
    }
}

