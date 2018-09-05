package com.hotweather.android.db;

import org.litepal.crud.DataSupport;

/**
 * Created by Administrator on 2018/9/5 0005.
 */

public class Province extends DataSupport {
    private int id;    //id号

    private String provinceName;  //省的名字

    private int provinceCode;    //省的代号

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public int getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(int provinceCode) {
        this.provinceCode = provinceCode;
    }
}