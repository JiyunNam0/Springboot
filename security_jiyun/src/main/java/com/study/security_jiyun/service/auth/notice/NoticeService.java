package com.study.security_jiyun.service.auth.notice;

import com.study.security_jiyun.web.dto.notice.AddNoticeReqDto;
import com.study.security_jiyun.web.dto.notice.GetNoticeRespDto;

public interface NoticeService {
	public int addNotice(AddNoticeReqDto addNoticeReqDto) throws Exception;
	
	public GetNoticeRespDto getNotice(String flag, int noticeCode) throws Exception;
}
