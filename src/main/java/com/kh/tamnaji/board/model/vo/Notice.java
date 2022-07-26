package com.kh.tamnaji.board.model.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Notice {

	private int noticeNo;
	private int noticeWriter;
	private String noticeTitle;
	private String noticeContent;
	private String status;
	
}
