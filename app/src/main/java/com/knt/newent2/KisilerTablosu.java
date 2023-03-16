package com.knt.newent2;

import io.realm.RealmObject;
import io.realm.annotations.RealmClass;

@RealmClass
public class KisilerTablosu extends RealmObject {

    private String kisiIsmi, soyisim;
    private Integer yas;

    public String getKisiIsmi() {
        return kisiIsmi;
    }

    public void setKisiIsmi(String kisiIsmi) {
        this.kisiIsmi = kisiIsmi;
    }

    public String getSoyisim() {
        return soyisim;
    }

    public void setSoyisim(String soyisim) {
        this.soyisim = soyisim;
    }

    public Integer getYas() {
        return yas;
    }

    public void setYas(Integer yas) {
        this.yas = yas;
    }
}
