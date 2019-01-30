package com.design_patterns.examples.structuralPatterns.adapter;

import java.util.Map;

public class AdapterPatternTest {

    public static void main(String[] args) {

        DataSource dataSource = new DataSource();
        Map map = dataSource.getData();

        Projector projector = new Projector();

        projector.show(ProjectorAdapter.adapt(map));
    }

}
