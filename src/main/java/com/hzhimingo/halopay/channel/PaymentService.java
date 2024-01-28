package com.hzhimingo.halopay.channel;

import com.hzhimingo.halopay.channel.support.PayChannel;
import com.hzhimingo.halopay.channel.support.PayType;
import com.hzhimingo.halopay.request.OrderRequest;
import com.hzhimingo.halopay.response.OrderResponse;

/**
 * 支付服务
 */
public interface PaymentService {

    /**
     * 获取支付渠道
     */
    PayChannel getPayChannel();

    /**
     * 判断当前支付渠道是否支持传入的支付方式
     * @param payType 支付方式
     */
    boolean isSupport(PayType payType);

    /**
     * 校验支付参数
     */
    void validate(OrderRequest request);

    /**
     * 支付
     */
    OrderResponse pay(OrderRequest request);

}
