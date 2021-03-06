package com.snehpandya.databindingdemo;

import android.databinding.BaseObservable;
import android.databinding.Bindable;
import android.databinding.BindingAdapter;
import android.widget.ImageView;

/**
 * Created by Sneh on 06-06-2017.
 */

public class User extends BaseObservable {
    private String name, surname, age;
    private int image;

    public User(String name, String surname, String age, int image) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.image = image;
    }

    @Bindable
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        notifyPropertyChanged(BR.name);
    }

    @Bindable
    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
        notifyPropertyChanged(BR.surname);
    }

    public int getImage() { return image; }

    @Bindable
    public String getAge() { return age; }

    public void setAge(String age) { this.age = age; }


    @BindingAdapter("android:src")
    public static void setImageResource(ImageView imageView, int resource) {
        imageView.setImageResource(resource);
    }
}
