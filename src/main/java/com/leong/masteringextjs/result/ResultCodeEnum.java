package com.tts.exam.core.result;

/**
 * 响应码枚举，参考HTTP状态码的语义.
 * <ul>
 * <li>{@link #CHECK_FAIL}</li>
 * <li>{@link #SUCCESS}</li>
 * <li>{@link #FAIL}</li>
 * <li>{@link #UNAUTHORIZED}</li>
 * <li>{@link #FORBIDDEN}</li>
 * <li>{@link #NOT_FOUND}</li>
 * <li>{@link #NOT_ACCEPTABLE}</li>
 * <li>{@link #INTERNAL_SERVER_ERROR}</li>
 * <li>{@link #UNKNOWN_ERROR}</li>
 * </ul>
 * 
 * @author mike.leong created on Feb 12, 2018
 *
 */
public enum ResultCodeEnum {
	/**
	 * 检查异常：4
	 */
	CHECK_FAIL(0),
	/**
	 * 成功：200
	 */
	SUCCESS(200),
	/**
	 * 失败：400
	 */
	FAIL(400),
	/**
	 * 未认证（签名错误）: 401
	 */
	UNAUTHORIZED(401),
	/**
	 * 禁止访问: 403
	 */
	FORBIDDEN(403),
	/**
	 * 接口不存在:404
	 */
	NOT_FOUND(404),
	/**
	 * 服务端不支持所需表示:406
	 */
	NOT_ACCEPTABLE(406),
	/**
	 * 服务器内部错误: 500
	 */
	INTERNAL_SERVER_ERROR(500),
	/**
	 * 未知异常
	 */
	UNKNOWN_ERROR(-99);

	private final int code;

	ResultCodeEnum(int code) {
		this.code = code;
	}

	public int code() {
		return code;
	}
}
