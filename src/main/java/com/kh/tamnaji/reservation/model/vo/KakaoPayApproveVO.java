package com.kh.tamnaji.reservation.model.vo;

import java.util.Date;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@NoArgsConstructor
public class KakaoPayApproveVO {
	private String aid;
	private String tid;
	private String cid;
	private String sid;
    private String partner_order_id;
    private String partner_user_id;
    private String payment_method_type;
    private AmountVO amount;
    private CardVO card_info;
    private String item_name;
    private String item_code;
    private String payload;
    private Integer quantity;
    private Integer tax_free_amount;
    private Integer vat_amount;
    private Date created_at;
    private Date approved_at;
    private String checkInDate, checkOutDate;
}

