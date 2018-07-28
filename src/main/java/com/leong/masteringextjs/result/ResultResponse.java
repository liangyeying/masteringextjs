package com.tts.exam.core.result;

import org.springframework.util.Assert;

/**
 * Controller 返回结果的封装.
 * @author mike.leong created on Feb 13, 2018
 *
 */
public class ResultResponse<T> {

	private static final String DEFAULT_SUCCESS_MESSAGE = "SUCCESS";
	private static final String DEFAULT_FAILURE_MESSAGE = "FAILURE";

	/**
	 * 返回成功结果，exception 为 {@link #DEFAULT_SUCCESS_MESSAGE}.
	 * @return {@link ResultEntity}
	 */
	public static <T> ResultEntity<T> success() {
		return result(ResultCodeEnum.SUCCESS, DEFAULT_SUCCESS_MESSAGE);
	}
	
	/**
	 * 返回成功结果，返回成功结果，exception 为 {@link #DEFAULT_SUCCESS_MESSAGE}.
	 * @param data 返回的数据
	 * @return {@link ResultEntity}
	 */
	public static <T> ResultEntity<T> success(final T data) {
		return success(DEFAULT_SUCCESS_MESSAGE, data);
	}

	/**
	 * 返回成功结果.
	 * @param message 返回的消息
	 * @param data 返回的数据
	 * @return
	 */
	public static <T> ResultEntity<T> success(final String message, final T data) {
		return result(ResultCodeEnum.SUCCESS, message, data);
	}
	
	/**
	 * 返回失败结果，exception 为 {@link #DEFAULT_FAILURE_MESSAGE}.
	 * @return {@link ResultEntity}
	 */
	public static <T> ResultEntity<T> failure() {
		return result(ResultCodeEnum.FAIL, DEFAULT_FAILURE_MESSAGE);
	}
	
	/**
	 * 返回失败结果.
	 * @param message 返回的消息.
	 * @return {@link ResultEntity}
	 */
	public static <T> ResultEntity<T> failure(final String message) {
		return result(ResultCodeEnum.FAIL, message);
	}
		
	/**
	 * 返回异常消息：code 为 {@linkplain ResultCodeEnum#FAIL}， exception 为 {@linkplain Throwable}, data 为 {@linkplain Throwable}.
	 * @param e 异常
	 * @return {@link ResultEntity}
	 */
	public static ResultEntity<Throwable> failure(final Throwable e) {
		return result(ResultCodeEnum.FAIL, e.getMessage(), e);
	}
	
	
	/**
	 * 返回设置了 code 和 exception 的消息.
	 * @param code 状态码，{@linkplain ResultCodeEnum}
	 * @param message 消息
	 * @return
	 */
	public static <T> ResultEntity<T> result(final ResultCodeEnum code, final String message) {
		Assert.notNull(code, "ResultCodeEnum must not be null");
		return new ResultEntity<T>().setCode(code).setMessage(message);
	}

	/**
	 *  返回设置了 code， exception 和 data 的消息.
	 * @param code code 状态码，{@linkplain ResultCodeEnum}
	 * @param message 消息
	 * @param data 数据
	 * @return
	 */
	public static <T> ResultEntity<T> result(final ResultCodeEnum code, final String message, final T data) {
		Assert.notNull(code, "ResultCodeEnum must not be null");
		return new ResultEntity<T>().setCode(code).setMessage(message).setData(data);
	}

}
