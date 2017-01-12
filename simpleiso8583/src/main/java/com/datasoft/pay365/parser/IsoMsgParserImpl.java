package com.datasoft.pay365.parser;

import com.datasoft.pay365.model.IsoMsg;
import com.datasoft.pay365.model.IsoType;
import com.datasoft.pay365.model.IsoValue;

import java.util.HashMap;
import java.util.Map;


/**
 * Created by suhrid on 1/12/17.
 */
public class IsoMsgParserImpl implements IsoMsgParser {
    private Map<Integer, IsoValue> parserConfig;
    private String msgString;

    public IsoMsgParserImpl(String msgString) {
        this.msgString = msgString;
        parserConfig = getDefaultParserConfig();
    }

    public IsoMsgParserImpl(String msgString, Map<Integer, IsoValue> parserConfig) {
        this.parserConfig = parserConfig;
    }

    @Override
    public IsoMsg parse(String msg) {

        return null;
    }

    private Map<Integer, IsoValue> getDefaultParserConfig() {
        Map<Integer, IsoValue> defaultConfig = new HashMap<>();
        defaultConfig.put(2, new IsoValue(IsoType.LLVAR, null, null));
        defaultConfig.put(3, new IsoValue(IsoType.NUMERIC, 6, null));
        return defaultConfig;
    }
}
