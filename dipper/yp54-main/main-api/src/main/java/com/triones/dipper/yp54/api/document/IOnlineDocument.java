package com.triones.dipper.yp54.api.document;


/**
 * 在线文档操作接口
 * */
public interface IOnlineDocument {

    /**
     * 测试文档接口
     * */
    void test();

    /**
     * 新建文档
     * */
    void createOnlineDocument();

    void openPermission();

    /**
     * 广播文档变更
     * */
    void broadcastChange();

}
