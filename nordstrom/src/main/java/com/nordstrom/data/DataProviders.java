package com.nordstrom.data;

import org.testng.annotations.DataProvider;

public class DataProviders {
    @DataProvider(name = "searchData")
    public Object[] getSearchData(){
        return new Object[]{"Tory Burch Handbags","Charlotte Tilbury Makeup"};
    }
}

