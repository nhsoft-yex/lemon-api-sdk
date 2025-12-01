package com.nhsoft.neptune.msg;

import com.nhsoft.neptune.api.internal.util.Asserts;
import lombok.extern.slf4j.Slf4j;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @auther nhsoft.yex
 * @description 消息服务
 */
@Slf4j
public class MsgService {

    private final String secret;

    private final MsgStorage msgStorage;

    private final Map<String/*topic*/, ExecutorService> executors;

    private final Map<String/*topic*/, Method /*method with MsgListener*/> listenerMethods;

    private final ExecutorService startUpService = Executors.newSingleThreadExecutor(r -> new Thread(r, "msg_start_up"));

    public MsgService(String secret, MsgStorage msgStorage) {
        this.secret = secret;
        listenerMethods = new ConcurrentHashMap<>();
        executors = new ConcurrentHashMap<>();
        this.msgStorage = msgStorage;
    }

//    private void consume(Message message) {
//        if (!message.checkSign(secret)) {
//            //验签失败
//            return;
//        }
//        String topic = message.getNoticeType();
//        Method method = listenerMethods.get(topic);
//        Asserts.notNull(method, () -> new MsgException("no listener for topic: " + topic));
//        ExecutorService executorService = executors.get(topic);
//        Runnable callable = () -> {
//            ConsumeStatus consumeStatus;
//            try {
//                consumeStatus = (ConsumeStatus) method.invoke(o, message);
//            } catch (IllegalAccessException | InvocationTargetException e) {
//                //消费失败
//                consumeStatus = ConsumeStatus.FAILURE;
//            }
//            if (consumeStatus.equals(ConsumeStatus.SUCCESS)) {
//                //消费成功 todo
//            } else {
//                //消费失败 todo
//            }
//        };
//        executorService.submit(callable);
//    }

//    public void init() {
//        //扫描包下所有监听器
//        List<Method> listenerMethods = MsgListenerScanner.scan();//todo
//        for (Method method : listenerMethods) {
//            MsgListener msgListener = method.getAnnotation(MsgListener.class);
//            String topic = msgListener.topic();
//            this.listenerMethods.put(topic, method);
//            ExecutorService executorService = Executors.newFixedThreadPool(msgListener.consumeThreads(), r -> new Thread(r, "msg-listener-" + topic));
//            executors.put(topic, executorService);
//        }
//        onConsume();
//    }

//    private void onConsume() {
//        Runnable runnable = () -> {
//            while (!Thread.currentThread().isInterrupted()) {
//                List<Message> messages = msgStorage.loadFromOffset(0, 100);
//                messages.forEach(this::consume);
//            }
//        };
//        startUpService.submit(runnable);
//    }
}
