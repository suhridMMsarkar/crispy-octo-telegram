package com.datasoft.pay365.parser;

import com.datasoft.pay365.model.IsoMsg;

/**
 * Created by suhrid on 1/12/17.
 */
public interface IsoMsgParser {
    public IsoMsg parse(String msg);
}
