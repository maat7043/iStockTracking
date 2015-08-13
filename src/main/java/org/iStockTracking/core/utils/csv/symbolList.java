package org.iStockTracking.core.utils.csv;

import org.iStockTracking.core.globals;
import org.iStockTracking.core.utils.csv.types.deserializeSymbols;

import java.io.IOException;

/**
 * Created by Matt on 8/1/2015.
 */
public class symbolList {

    private static String AMEX = "http://www.nasdaq.com/screening/companies-by-name.aspx?letter=0&exchange=amex&render=download";
    private static String NYSE = "http://www.nasdaq.com/screening/companies-by-name.aspx?letter=0&exchange=nyse&render=download";
    private static String NASDAQ = "http://www.nasdaq.com/screening/companies-by-name.aspx?letter=0&exchange=nasdaq&render=download";


    public static void getHTTP() throws IOException {
        httpDownloadUtility.downloadFile(AMEX, globals.DATA_DIR + "AMEX.csv");
        httpDownloadUtility.downloadFile(NYSE, globals.DATA_DIR + "NYSE.csv");
        httpDownloadUtility.downloadFile(NASDAQ, globals.DATA_DIR + "NASDAQ.csv");
    }

    public static void map() {
        deserializeSymbols.parse(globals.DATA_DIR + "AMEX.csv");
    }
}