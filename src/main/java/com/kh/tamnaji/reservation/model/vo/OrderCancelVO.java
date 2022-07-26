package com.kh.tamnaji.reservation.model.vo;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@NoArgsConstructor
public class OrderCancelVO {
	private String cid; //	String	가맹점 코드, 10자	O
	private String tid; //	String	결제 고유번호	O
	private Integer cancel_amount; //	Integer	취소 금액	O
	private Integer cancel_tax_free_amount; //	Integer	취소 비과세 금액	O
	private Integer cancel_vat_amount; //	Integer	취소 부가세 금액
	// 요청 시 값을 전달하지 않을 경우, (취소 금액 - 취소 비과세 금액)/11, 소숫점이하 반올림	X
	private Integer cancel_available_amount; //	Integer	취소 가능 금액(결제 취소 요청 금액 포함)	X
	private String payload; //	String	해당 요청에 대해 저장하고 싶은 값, 최대 200자	X
	
}
