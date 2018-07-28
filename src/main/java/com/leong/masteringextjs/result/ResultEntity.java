package com.leong.masteringextjs.result;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

/**
 * 统一API响应结果封装，只建议在 Controller 中使用. <br/>
 * 所有字段：
 * <ul>
 * <li>状态码：{@link #code}</li>
 * <li>消息：{@link #message}</li>
 * <li>数据：{@link #data}</li>
 * </ul>
 * 
 * @author mike.leong created on Feb 12, 2018
 *
 */
@AllArgsConstructor
public class ResultEntity<T> implements Serializable {

	private static final long serialVersionUID = 2172855571451440092L;
	/**
	 * 状态码.
	 */
	private int code;
	/**
	 * 消息.
	 */
	private String message;
	/**
	 * 数据.
	 */
	private T data;

	public ResultEntity() {

	}
	public ResultEntity(T data) {
		super();
		this.data = data;
	}

	public ResultEntity(Throwable e) {
		super();
		this.message = e.getMessage();
		this.code = ResultCodeEnum.FAIL.code();
	}


	public int getCode() {
		return code;
	}

	public ResultEntity<T> setCode(ResultCodeEnum code) {
		this.code = code.code();
		return this;
	}

	public String getMessage() {
		return message;
	}

	public ResultEntity<T> setMessage(String message) {
		this.message = message;
		return this;
	}

	public T getData() {
		return data;
	}

	public ResultEntity<T> setData(T data) {
		this.data = data;
		return this;
	}

	@Override
	public String toString() {
		return "ResultEntity(code=" + this.code + ", exception=" + this.message + ", data="
				+ this.data.toString() + ")";
	}
}
