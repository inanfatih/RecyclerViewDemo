package com.example.fatih.recyclerviewdemo.view;

import com.example.fatih.recyclerviewdemo.data.ListItem;

import java.util.List;

/**
 * Created by Fatih on 2017-11-20.
 */

public interface ViewInterface {

    void startDetailActivity(String dateAndTime, String message, int colorResource);

    void setUpAdapterAndView(List<ListItem> listOfData);

}
