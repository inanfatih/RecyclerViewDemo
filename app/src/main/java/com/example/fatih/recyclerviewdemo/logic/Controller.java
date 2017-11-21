package com.example.fatih.recyclerviewdemo.logic;

import com.example.fatih.recyclerviewdemo.data.DataSourceInterface;
import com.example.fatih.recyclerviewdemo.view.ViewInterface;

/**
 * Created by Fatih on 2017-11-20.
 */

public class Controller {

    private ViewInterface view;
    private DataSourceInterface dataSource;

    public Controller(ViewInterface view, DataSourceInterface dataSource) {
        this.view = view;
        this.dataSource = dataSource;
    }
}
