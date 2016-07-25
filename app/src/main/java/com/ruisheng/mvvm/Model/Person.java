package com.ruisheng.mvvm.Model;

import android.databinding.ObservableField;
import android.databinding.ObservableInt;

/**
 * Created by tony on 2016/7/25.
 */
public class Person {

    public final ObservableField<String> Name = new ObservableField<>();
    public final ObservableInt Age = new ObservableInt();
    public final ObservableField<String> Career = new ObservableField<>();



}
