package com.sjtu.charles.simplewebview2;

import com.sjtu.charles.model.SampleModel;

import java.util.ArrayList;

/**
 * [description]
 * author: yifei
 * created at 17/4/7 下午4:07
 */

public class DataHelp {
    public static ArrayList<SampleModel> getSampleData (int size) {
        ArrayList<SampleModel> sampleData = new ArrayList<SampleModel>(size);
        for (int i = 0; i < size; i++) {
            sampleData.add(new SampleModel("Element "+i));
        }
        return sampleData;

    }
}
