package com.mjc.studyjava;

import com.mjc813.mjc_library.IMarketInfo;

public class Study01 implements IMarketInfo {

    @Override
    public String getMessageOfMarketInfo() {
        return "정현서의 가게입니다. 전화번호 -> 010-0000-0000";
    }

    @Override
    public String getMessageOfNotValidData() {
        return "잘못된 값입니다.";
    }
}
