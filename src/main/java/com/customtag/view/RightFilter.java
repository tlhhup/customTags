package com.customtag.view;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.PageContext;
import javax.servlet.jsp.tagext.Tag;

import com.customtag.entity.User;

public class RightFilter implements Tag {

	private String url;
	private PageContext pageContext;

	@Override
	public int doStartTag() throws JspException {
		HttpServletRequest request=(HttpServletRequest) this.pageContext.getRequest();
		//获取登录的用户
		User user=(User) request.getSession().getAttribute("user");
		//判断该用户是否具有该权限
		return user.hasRight(url)?EVAL_BODY_INCLUDE:SKIP_BODY;
	}

	@Override
	public int doEndTag() throws JspException {
		return 0;
	}

	@Override
	public void setPageContext(PageContext pc) {
		this.pageContext = pc;
	}

	@Override
	public void setParent(Tag t) {

	}

	@Override
	public Tag getParent() {
		return null;
	}

	@Override
	public void release() {

	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

}
