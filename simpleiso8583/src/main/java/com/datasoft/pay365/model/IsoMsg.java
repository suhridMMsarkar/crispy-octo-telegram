package com.datasoft.pay365.model;

import java.util.BitSet;

/**
 * Created by suhrid on 1/12/17.
 */
public class IsoMsg {
    private int length;
    private int type;
    private BitSet binaryBitmap;
    private String hexBitMap;
    private boolean forceSecondaryBitmap;
    private IsoValue[] fields;

    public IsoMsg() {
        this.fields = new IsoValue[128];
    }

    public void setField(int pos, IsoValue isoValue) {

    }

    private String generateBitmap() {

        return null;
    }

    public String generateMessageString() {
        return null;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getHexBitMap() {
        return hexBitMap;
    }

    public void setHexBitMap(String hexBitMap) {
        this.hexBitMap = hexBitMap;
    }

    public IsoValue[] getFields() {
        return fields;
    }

    public void setFields(IsoValue[] fields) {
        this.fields = fields;
    }

    public BitSet getBinaryBitmap() {
        return binaryBitmap;
    }

    public void setBinaryBitmap(BitSet binaryBitmap) {
        this.binaryBitmap = binaryBitmap;
    }

    public boolean isForceSecondaryBitmap() {
        return forceSecondaryBitmap;
    }

    public void setForceSecondaryBitmap(boolean forceSecondaryBitmap) {
        this.forceSecondaryBitmap = forceSecondaryBitmap;
    }
}
