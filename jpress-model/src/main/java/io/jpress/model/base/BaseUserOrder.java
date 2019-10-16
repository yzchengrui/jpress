package io.jpress.model.base;

import com.jfinal.plugin.activerecord.IBean;
import io.jpress.base.BaseOptionsModel;

/**
 * Generated by JPress, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseUserOrder<M extends BaseUserOrder<M>> extends BaseOptionsModel<M> implements IBean {

    private static final long serialVersionUID = 1L;

	public void setId(java.lang.Long id) {
		set("id", id);
	}

	public java.lang.Long getId() {
		return getLong("id");
	}

    /**
     * 订单号
     */
	public void setNs(java.lang.String ns) {
		set("ns", ns);
	}

    /**
     * 订单号
     */
	public java.lang.String getNs() {
		return getStr("ns");
	}

    /**
     * 一般情况下商品的名称
     */
	public void setTitle(java.lang.String title) {
		set("title", title);
	}

    /**
     * 一般情况下商品的名称
     */
	public java.lang.String getTitle() {
		return getStr("title");
	}

    /**
     * 购买人
     */
	public void setBuyerId(java.lang.Long buyerId) {
		set("buyer_id", buyerId);
	}

    /**
     * 购买人
     */
	public java.lang.Long getBuyerId() {
		return getLong("buyer_id");
	}

    /**
     * 购买人昵称
     */
	public void setBuyerNickname(java.lang.String buyerNickname) {
		set("buyer_nickname", buyerNickname);
	}

    /**
     * 购买人昵称
     */
	public java.lang.String getBuyerNickname() {
		return getStr("buyer_nickname");
	}

    /**
     * 用户留言
     */
	public void setBuyerMsg(java.lang.String buyerMsg) {
		set("buyer_msg", buyerMsg);
	}

    /**
     * 用户留言
     */
	public java.lang.String getBuyerMsg() {
		return getStr("buyer_msg");
	}

    /**
     * 分销员
     */
	public void setDistUserId(java.lang.Long distUserId) {
		set("dist_user_id", distUserId);
	}

    /**
     * 分销员
     */
	public java.lang.Long getDistUserId() {
		return getLong("dist_user_id");
	}

    /**
     * 分销金额，分销人员应该获得的推广金额
     */
	public void setDistAmount(java.math.BigDecimal distAmount) {
		set("dist_amount", distAmount);
	}

    /**
     * 分销金额，分销人员应该获得的推广金额
     */
	public java.math.BigDecimal getDistAmount() {
		return get("dist_amount");
	}

    /**
     * 订单总金额，购买人员应该付款的金额
     */
	public void setOrderTotalAmount(java.math.BigDecimal orderTotalAmount) {
		set("order_total_amount", orderTotalAmount);
	}

    /**
     * 订单总金额，购买人员应该付款的金额
     */
	public java.math.BigDecimal getOrderTotalAmount() {
		return get("order_total_amount");
	}

    /**
     * 订单的真实金额，销售人员可以在后台修改支付金额，一般情况下 order_real_amount = order_total_amount
     */
	public void setOrderRealAmount(java.math.BigDecimal orderRealAmount) {
		set("order_real_amount", orderRealAmount);
	}

    /**
     * 订单的真实金额，销售人员可以在后台修改支付金额，一般情况下 order_real_amount = order_total_amount
     */
	public java.math.BigDecimal getOrderRealAmount() {
		return get("order_real_amount");
	}

    /**
     * 优惠码
     */
	public void setCouponCode(java.lang.String couponCode) {
		set("coupon_code", couponCode);
	}

    /**
     * 优惠码
     */
	public java.lang.String getCouponCode() {
		return getStr("coupon_code");
	}

    /**
     * 优惠金额
     */
	public void setCouponAmount(java.math.BigDecimal couponAmount) {
		set("coupon_amount", couponAmount);
	}

    /**
     * 优惠金额
     */
	public java.math.BigDecimal getCouponAmount() {
		return get("coupon_amount");
	}

    /**
     * 支付状态：1未付款、 2用户标识已经线下付款完成、3用户标识已经通过微信或者支付宝等工具支付完成 、9已经付款（线上支付）、10已经下线支付、11已经通过微信或支付宝等工具支付
     */
	public void setPayStatus(java.lang.Integer payStatus) {
		set("pay_status", payStatus);
	}

    /**
     * 支付状态：1未付款、 2用户标识已经线下付款完成、3用户标识已经通过微信或者支付宝等工具支付完成 、9已经付款（线上支付）、10已经下线支付、11已经通过微信或支付宝等工具支付
     */
	public java.lang.Integer getPayStatus() {
		return getInt("pay_status");
	}

    /**
     * 支付成功的金额
     */
	public void setPaidAmount(java.math.BigDecimal paidAmount) {
		set("paid_amount", paidAmount);
	}

    /**
     * 支付成功的金额
     */
	public java.math.BigDecimal getPaidAmount() {
		return get("paid_amount");
	}

    /**
     * 支付时间
     */
	public void setPaidTime(java.util.Date paidTime) {
		set("paid_time", paidTime);
	}

    /**
     * 支付时间
     */
	public java.util.Date getPaidTime() {
		return get("paid_time");
	}

    /**
     * 支付证明，手动入账时需要截图
     */
	public void setPaidProof(java.lang.String paidProof) {
		set("paid_proof", paidProof);
	}

    /**
     * 支付证明，手动入账时需要截图
     */
	public java.lang.String getPaidProof() {
		return getStr("paid_proof");
	}

    /**
     * 支付备注
     */
	public void setPaidRemarks(java.lang.String paidRemarks) {
		set("paid_remarks", paidRemarks);
	}

    /**
     * 支付备注
     */
	public java.lang.String getPaidRemarks() {
		return getStr("paid_remarks");
	}

    /**
     * 支付记录
     */
	public void setPaymentId(java.lang.Long paymentId) {
		set("payment_id", paymentId);
	}

    /**
     * 支付记录
     */
	public java.lang.Long getPaymentId() {
		return getLong("payment_id");
	}

    /**
     * 第三方订单号
     */
	public void setPaymentOuterNo(java.lang.String paymentOuterNo) {
		set("payment_outer_no", paymentOuterNo);
	}

    /**
     * 第三方订单号
     */
	public java.lang.String getPaymentOuterNo() {
		return getStr("payment_outer_no");
	}

    /**
     * 发货状态
     */
	public void setDeliveryStatus(java.lang.Integer deliveryStatus) {
		set("delivery_status", deliveryStatus);
	}

    /**
     * 发货状态
     */
	public java.lang.Integer getDeliveryStatus() {
		return getInt("delivery_status");
	}

    /**
     * 配送方式 1快递    2自己送     3无需配送（虚拟商品）
     */
	public void setDeliveryType(java.lang.Integer deliveryType) {
		set("delivery_type", deliveryType);
	}

    /**
     * 配送方式 1快递    2自己送     3无需配送（虚拟商品）
     */
	public java.lang.Integer getDeliveryType() {
		return getInt("delivery_type");
	}

    /**
     * 快递公司
     */
	public void setDeliveryCompany(java.lang.String deliveryCompany) {
		set("delivery_company", deliveryCompany);
	}

    /**
     * 快递公司
     */
	public java.lang.String getDeliveryCompany() {
		return getStr("delivery_company");
	}

    /**
     * 快递单号
     */
	public void setDeliveryNo(java.lang.String deliveryNo) {
		set("delivery_no", deliveryNo);
	}

    /**
     * 快递单号
     */
	public java.lang.String getDeliveryNo() {
		return getStr("delivery_no");
	}

    /**
     * 快递发货时间
     */
	public void setDeliveryStartTime(java.util.Date deliveryStartTime) {
		set("delivery_start_time", deliveryStartTime);
	}

    /**
     * 快递发货时间
     */
	public java.util.Date getDeliveryStartTime() {
		return get("delivery_start_time");
	}

    /**
     * 快递送达时间
     */
	public void setDeliveryFinishTime(java.util.Date deliveryFinishTime) {
		set("delivery_finish_time", deliveryFinishTime);
	}

    /**
     * 快递送达时间
     */
	public java.util.Date getDeliveryFinishTime() {
		return get("delivery_finish_time");
	}

    /**
     * 收货人地址
     */
	public void setDeliveryAddrUsername(java.lang.String deliveryAddrUsername) {
		set("delivery_addr_username", deliveryAddrUsername);
	}

    /**
     * 收货人地址
     */
	public java.lang.String getDeliveryAddrUsername() {
		return getStr("delivery_addr_username");
	}

    /**
     * 收货人手机号（电话）
     */
	public void setDeliveryAddrMobile(java.lang.String deliveryAddrMobile) {
		set("delivery_addr_mobile", deliveryAddrMobile);
	}

    /**
     * 收货人手机号（电话）
     */
	public java.lang.String getDeliveryAddrMobile() {
		return getStr("delivery_addr_mobile");
	}

    /**
     * 收件人省
     */
	public void setDeliveryAddrProvince(java.lang.String deliveryAddrProvince) {
		set("delivery_addr_province", deliveryAddrProvince);
	}

    /**
     * 收件人省
     */
	public java.lang.String getDeliveryAddrProvince() {
		return getStr("delivery_addr_province");
	}

    /**
     * 收件人的城市
     */
	public void setDeliveryAddrCity(java.lang.String deliveryAddrCity) {
		set("delivery_addr_city", deliveryAddrCity);
	}

    /**
     * 收件人的城市
     */
	public java.lang.String getDeliveryAddrCity() {
		return getStr("delivery_addr_city");
	}

    /**
     * 收件人的区（县）
     */
	public void setDeliveryAddrDistrict(java.lang.String deliveryAddrDistrict) {
		set("delivery_addr_district", deliveryAddrDistrict);
	}

    /**
     * 收件人的区（县）
     */
	public java.lang.String getDeliveryAddrDistrict() {
		return getStr("delivery_addr_district");
	}

    /**
     * 收件人的详细地址
     */
	public void setDeliveryAddrDetail(java.lang.String deliveryAddrDetail) {
		set("delivery_addr_detail", deliveryAddrDetail);
	}

    /**
     * 收件人的详细地址
     */
	public java.lang.String getDeliveryAddrDetail() {
		return getStr("delivery_addr_detail");
	}

    /**
     * 收件人地址邮政编码
     */
	public void setDeliveryAddrZipcode(java.lang.String deliveryAddrZipcode) {
		set("delivery_addr_zipcode", deliveryAddrZipcode);
	}

    /**
     * 收件人地址邮政编码
     */
	public java.lang.String getDeliveryAddrZipcode() {
		return getStr("delivery_addr_zipcode");
	}

    /**
     * 发票类型
     */
	public void setInvoiceType(java.lang.String invoiceType) {
		set("invoice_type", invoiceType);
	}

    /**
     * 发票类型
     */
	public java.lang.String getInvoiceType() {
		return getStr("invoice_type");
	}

    /**
     * 发票抬头
     */
	public void setInvoiceTitle(java.lang.String invoiceTitle) {
		set("invoice_title", invoiceTitle);
	}

    /**
     * 发票抬头
     */
	public java.lang.String getInvoiceTitle() {
		return getStr("invoice_title");
	}

    /**
     * 发票内容
     */
	public void setInvoiceContent(java.lang.String invoiceContent) {
		set("invoice_content", invoiceContent);
	}

    /**
     * 发票内容
     */
	public java.lang.String getInvoiceContent() {
		return getStr("invoice_content");
	}

    /**
     * 纳税人识别号
     */
	public void setInvoiceIdentity(java.lang.String invoiceIdentity) {
		set("invoice_identity", invoiceIdentity);
	}

    /**
     * 纳税人识别号
     */
	public java.lang.String getInvoiceIdentity() {
		return getStr("invoice_identity");
	}

    /**
     * 单位名称
     */
	public void setInvoiceName(java.lang.String invoiceName) {
		set("invoice_name", invoiceName);
	}

    /**
     * 单位名称
     */
	public java.lang.String getInvoiceName() {
		return getStr("invoice_name");
	}

    /**
     * 发票收取人手机号
     */
	public void setInvoiceMobile(java.lang.String invoiceMobile) {
		set("invoice_mobile", invoiceMobile);
	}

    /**
     * 发票收取人手机号
     */
	public java.lang.String getInvoiceMobile() {
		return getStr("invoice_mobile");
	}

    /**
     * 发票收取人邮箱
     */
	public void setInvoiceEmail(java.lang.String invoiceEmail) {
		set("invoice_email", invoiceEmail);
	}

    /**
     * 发票收取人邮箱
     */
	public java.lang.String getInvoiceEmail() {
		return getStr("invoice_email");
	}

    /**
     * 发票开具状态
     */
	public void setInvoiceStatus(java.lang.Integer invoiceStatus) {
		set("invoice_status", invoiceStatus);
	}

    /**
     * 发票开具状态
     */
	public java.lang.Integer getInvoiceStatus() {
		return getInt("invoice_status");
	}

    /**
     * 管理员后台憋住
     */
	public void setRemarks(java.lang.String remarks) {
		set("remarks", remarks);
	}

    /**
     * 管理员后台憋住
     */
	public java.lang.String getRemarks() {
		return getStr("remarks");
	}

    /**
     * json字段扩展
     */
	public void setOptions(java.lang.String options) {
		set("options", options);
	}

    /**
     * json字段扩展
     */
	public java.lang.String getOptions() {
		return getStr("options");
	}

    /**
     * 交易状态： 0进行中、1完成  、2取消交易 、3退款中  、4退款完成
     */
	public void setTradeStatus(java.lang.Integer tradeStatus) {
		set("trade_status", tradeStatus);
	}

    /**
     * 交易状态： 0进行中、1完成  、2取消交易 、3退款中  、4退款完成
     */
	public java.lang.Integer getTradeStatus() {
		return getInt("trade_status");
	}

    /**
     * 删除状态：1 正常 ，2 回收站 3 已经删除
     */
	public void setDelStatus(java.lang.Integer delStatus) {
		set("del_status", delStatus);
	}

    /**
     * 删除状态：1 正常 ，2 回收站 3 已经删除
     */
	public java.lang.Integer getDelStatus() {
		return getInt("del_status");
	}

    /**
     * 修改时间
     */
	public void setModified(java.util.Date modified) {
		set("modified", modified);
	}

    /**
     * 修改时间
     */
	public java.util.Date getModified() {
		return get("modified");
	}

    /**
     * 创建时间
     */
	public void setCreated(java.util.Date created) {
		set("created", created);
	}

    /**
     * 创建时间
     */
	public java.util.Date getCreated() {
		return get("created");
	}

}
