package com.nhsoft.neptune.msg;

import com.nhsoft.neptune.api.internal.util.JsonUtil;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;

/**
 * @auther nhsoft.yex
 */
public class MgsReceiver extends HttpServlet {

    private final String secret;

    public MgsReceiver(String secret) {
        this.secret = secret;
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 设置请求编码
        req.setCharacterEncoding("UTF-8");

        // 读取请求体中的JSON数据
        StringBuilder sb = new StringBuilder();
        String line;
        BufferedReader reader = req.getReader();
        while ((line = reader.readLine()) != null) {
            sb.append(line);
        }
        String jsonString = sb.toString();
        Message message = JsonUtil.fromJson(jsonString, Message.class);
        message.checkSign(secret);
        super.doPost(req, resp);
    }
}
