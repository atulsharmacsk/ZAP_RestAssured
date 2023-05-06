package org.example;

import org.testng.annotations.*;

import static org.example.ZapUtil.*;

public class ZapTest {

    String urlToTest="http://127.0.0.1:8080/";


    @Test
    public void demoTest() {
        addURLToScanTree(urlToTest);
        startActiveScan(urlToTest);
        waitForActiveScanCompletion();
    }

    @AfterMethod
    public void tearDown(){
    ZapUtil.createReport(urlToTest);
    }
}
