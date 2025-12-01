package com.nhsoft.neptune.msg;

import java.util.List;

/**
 * @auther nhsoft.yex
 * @description 消息存储
 */
public interface MsgStorage {
    /**
     * 存储消息
     *
     * @param message 待存储的消息
     */
    void store(Message message);

    /**
     * 删除消息
     *
     * @param messageId 消息ID
     */
    void delete(String messageId);

    /**
     * 从消费位点获取一批消息
     *
     * @param offset
     * @param limit
     * @return
     */
    List<Message> loadFromOffset(int offset, int limit);
}
