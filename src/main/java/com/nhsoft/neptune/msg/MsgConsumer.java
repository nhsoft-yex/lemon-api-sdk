package com.nhsoft.neptune.msg;

/**
 * @auther nhsoft.yex
 * @description 消息队列
 */
public interface MsgConsumer {

    /**
     * 消费消息
     *
     * @param message 消息
     */
    void consume(Message message);

}
