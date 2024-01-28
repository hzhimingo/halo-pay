package com.hzhimingo.halopay.channel.support;

/**
 * 支付方式
 */
public enum PayType {

    /**
     * 支付宝付款码支付（商家扫用户付款码）
     */
    AliPay_DisplayCode,

    /**
     * 支付宝扫码支付（用户扫商家二维码）
     */
    AliPay_Native,

    /**
     * 支付宝App支付
     */
    AliPay_App,

    /**
     * 支付宝手机网站支付
     */
    AliPay_Wap,

    /**
     * 支付宝电脑网站支付
     */
    AliPay_PC,

    /**
     * 支付宝JSAPI支付
     */
    AliPay_JSAPI,

    /**
     * 支付宝刷脸支付
     */
    AliPay_Face,

    /**
     * 微信支付付款码支付
     */
    WxPay_DisplayCode,

    /**
     * 微信支付JSAPI
     */
    WxPay_JSAPI,

    /**
     * 微信支付小程序支付
     */
    WxPay_MiniProgram,

    /**
     * 微信支付Native支付
     */
    WxPay_Native,

    /**
     * 微信支付APP支付
     */
    WxPay_App,

    /**
     * 微信支付刷脸支付
     */
    WxPay_Face,
}
