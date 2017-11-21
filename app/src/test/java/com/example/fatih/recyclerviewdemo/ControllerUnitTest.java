package com.example.fatih.recyclerviewdemo;

import com.example.fatih.recyclerviewdemo.data.DataSourceInterface;
import com.example.fatih.recyclerviewdemo.view.ViewInterface;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */

@RunWith(MockitoJUnitRunner.class)

public class ControllerUnitTest {

    @Mock
    DataSourceInterface dataSource;

    @Mock
    ViewInterface view;

    @Test
    public void addition_isCorrect() throws Exception {
        assertEquals(4, 2 + 2);
    }
}