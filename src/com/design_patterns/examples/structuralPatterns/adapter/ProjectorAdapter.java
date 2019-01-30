package com.design_patterns.examples.structuralPatterns.adapter;

import java.util.Map;

class ProjectorAdapter {

    static String adapt(Map map) {
        StringBuffer text = new StringBuffer();
        for (Object o : map.entrySet()) {
            Map.Entry entry = (Map.Entry) o;
            text.append(entry.getKey());
            text.append("---");
            text.append(entry.getValue());
            text.append("\n");
        }
        return text.toString();
    }
}
