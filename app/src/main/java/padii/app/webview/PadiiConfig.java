package padii.app.webview;

class PadiiConfig {

    /* -- CONFIG VARIABLES -- */

    //complete URL of your Padii website
    static String Padii_URL ="https://padii.com.ng/";


    /* -- PERMISSION VARIABLES -- */

    // enable JavaScript for webview
    static boolean PadiiApp_JSCRIPT = true;

    // upload file from webview
    static boolean PadiiApp_FUPLOAD = true;

    // enable upload from camera for photos
    static boolean PadiiApp_CAMUPLOAD = true;

    // incase you want only camera files to upload
    static boolean PadiiApp_ONLYCAM = false;

    // upload multiple files in webview
    static boolean PadiiApp_MULFILE = true;

    // track GPS locations
    static boolean PadiiApp_LOCATION = true;

    // show ratings dialog; auto configured
    // edit method get_rating() for customizations
    static boolean PadiiApp_RATINGS = true;

    // pull refresh current url
    static boolean PadiiApp_PULLFRESH = true;

    // show progress bar in app
    static boolean PadiiApp_PBAR = true;

    // zoom control for webpages view
    static boolean PadiiApp_ZOOM = false;

    // save form cache and auto-fill information
    static boolean PadiiApp_SFORM = false;

    // whether the loading webpages are offline or online
    static boolean PadiiApp_OFFLINE = false;

    // open external url with default browser instead of app webview
    static boolean PadiiApp_EXTURL = false;


    /* -- SECURITY VARIABLES -- */

    // verify whether HTTPS port needs certificate verification
    static boolean PadiiApp_CERT_VERIFICATION = true;

    //to upload any file type using "*/*"; check file type references for more
    static String Padii_F_TYPE = "*/*";


    /* -- RATING SYSTEM VARIABLES -- */

   // static int ASWR_DAYS = 3;    // after how many days of usage would you like to show the dialoge
  //  static int ASWR_TIMES = 10;  // overall request launch times being ignored
   // static int ASWR_INTERVAL = 2;   // reminding users to rate after days interval
}
