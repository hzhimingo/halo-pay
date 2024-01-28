package com.hzhimingo.halopay.channel.alipay;

import com.hzhimingo.halopay.channel.PaymentService;
import com.hzhimingo.halopay.channel.support.PayChannel;
import com.hzhimingo.halopay.channel.support.PayType;
import org.springframework.stereotype.Service;

@Service
public class AliPayService implements PaymentService {


    @Override
    public PayChannel getPayChannel() {
        return PayChannel.AliPay;
    }

    @Override
    public boolean isSupport(PayType payType) {
        return false;
    }

    @Override
    public void validate() {

    }

    @Override
    public void pay() {

    }
}
