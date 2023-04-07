package com.kraken.wakala.models;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;
import androidx.databinding.library.baseAdapters.BR;

public class User extends BaseObservable {
    String id;
    String email, name, dob, address, phone;
    int gender;
    double activeHour;
    double distance;

    public User() {
    }

    public User(String email, String name, String address, String phone, int activeHour, int distance) {
        this.email = email;
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.activeHour = activeHour;
        this.distance = distance;
    }

    @Bindable
    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
        notifyPropertyChanged(BR.dob);
    }

    @Bindable
    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
        notifyPropertyChanged(BR.gender);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Bindable
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
        notifyPropertyChanged(BR.email);
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
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
        notifyPropertyChanged(BR.address);
    }

    @Bindable
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
        notifyPropertyChanged(BR.phone);
    }

    @Bindable
    public double getActiveHour() {
        return activeHour;
    }

    public void setActiveHour(double activeHour) {
        this.activeHour = activeHour;
        notifyPropertyChanged(BR.activeHour);
    }

    @Bindable
    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
        notifyPropertyChanged(BR.distance);
    }
}