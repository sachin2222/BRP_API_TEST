package org.DataProviders;

import org.testng.annotations.DataProvider;

public class DataProviders {


    @DataProvider
    public Object[] getGPOData(){
        String[][] gpo={{"39426751","B7A900100"}};
        return gpo;

    }

    @DataProvider
    public Object[] getHINData(){
        String[][] hin={{"B7A900100"}};
        return hin;

    }

}
