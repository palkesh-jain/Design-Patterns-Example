package com.design_patterns.examples.structuralPatterns.adapter;

import java.util.HashMap;
import java.util.Map;

class DataSource {

    Map getData() {
        Map map = new HashMap<String, String>();
        map.put("Customer name", "Eastern connection");
        map.put("Order Date", "01/01/2018");
        map.put("Required date", "01/02/2018");
        map.put("Shipped date", "29/01/2018");
        map.put("Ship name", "Vins");
        map.put("Ship address", "16th street, HSR");
        return map;
    }
}
