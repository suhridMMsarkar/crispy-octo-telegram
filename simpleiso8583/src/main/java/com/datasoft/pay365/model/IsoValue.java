package com.datasoft.pay365.model;

/**
 * Created by suhrid on 1/12/17.
 */
public class IsoValue {
    private IsoType isoType;
    private Integer length;
    private Object value;

    public IsoValue(IsoType isoType, Integer length, Object value) {
        this.isoType = isoType;
        this.length = length;
        this.value = value;
    }

    public IsoType getIsoType() {
        return isoType;
    }

    public void setIsoType(IsoType isoType) {
        this.isoType = isoType;
    }

    public Integer getLength() {
        return length;
    }

    public void setLength(Integer length) {
        this.length = length;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }
}
