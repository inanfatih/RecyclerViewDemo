package com.example.fatih.recyclerviewdemo.data;

import java.util.List;

/**
 * 1- This is a contract between classes that dictates that how they can talk to each other ea
 * Created by Fatih on 2017-11-19.
 */

public interface DataSourceInterface {

    List<ListItem> getListOfData();

}
