package com.example.paitientscheduling.models;

import javax.persistence.Embeddable;

@Embeddable
public class Insurance {

    private String providerName;
    private String copay;

    public Insurance() {

    }

    public String getProviderName() {
        return providerName;
    }

    public void setProviderName(String providerName) {
        this.providerName = providerName;
    }

    public String getCopay() {
        return copay;
    }

    public void setCopay(String copay) {
        this.copay = copay;
    }

    @Override
    public String toString() {
        return "Insurance{" +
                "providerName='" + providerName + '\'' +
                ", copay='" + copay + '\'' +
                '}';
    }
}
