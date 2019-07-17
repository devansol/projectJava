/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author Daus
 */
public class Session {
    private static String sessionName;
    private static String sessionNip;
    private static String sessionAkses;

    /**
     * @return the sessionName
     */
    public static String getSessionName() {
        return sessionName;
    }

    /**
     * @param aSessionName the sessionName to set
     */
    public static void setSessionName(String aSessionName) {
        sessionName = aSessionName;
    }

    /**
     * @return the sessionNip
     */
    public static String getSessionNip() {
        return sessionNip;
    }

    /**
     * @param aSessionNip the sessionNip to set
     */
    public static void setSessionNip(String aSessionNip) {
        sessionNip = aSessionNip;
    }

    /**
     * @return the sessionAkses
     */
    public static String getSessionAkses() {
        return sessionAkses;
    }

    /**
     * @param aSessionAkses the sessionAkses to set
     */
    public static void setSessionAkses(String aSessionAkses) {
        sessionAkses = aSessionAkses;
    }
}
