package com.angentle.novel.web.enums;

import java.util.LinkedHashMap;
import java.util.Map;

/** 章节状态 1-草稿 2-已发布 3-回收站 4-删除 */
public enum EnumChapterStatus {
	DRAFT("1", "草稿"), //
	PUBLISHED("2", "已发布"), 
	RECYCLED("3", "回收站"),
	DELETEED("4", "删除");

	private String code;
	private String msg;
	private boolean display;

	private EnumChapterStatus(String code, String msg) {
		this.code = code;
		this.msg = msg;
		this.display = true;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMsg() {
		return this.msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public boolean isDisplay() {
		return this.display;
	}

	public void setDisplay(boolean display) {
		this.display = display;
	}

	/**
	 * 根据枚举的code返回枚举对象
	 * 
	 * @param code
	 *            枚举code值
	 * @return 枚举对象
	 */
	public static EnumChapterStatus getEnumByCode(String code) {
		if (code == null) {
			return null;
		}
		for (EnumChapterStatus type : values()) {
			if (type.getCode().equals(code.trim())) {
				return type;
			}
		}
		return null;
	}

	/**
	 * 将枚举转换成code-msg形式的集合 可通过<code>EnumXXX.setDisplay(false);</code>
	 * 的方式将不需要的枚举类型不转换成map
	 * 
	 * @return 转换后的map集合
	 */
	public static Map<String, String> toMap() {
		Map<String, String> enumDataMap = new LinkedHashMap<String, String>();
		for (EnumChapterStatus type : values()) {
			if (type.isDisplay()) {
				enumDataMap.put(type.getCode(), type.getMsg());
			}
		}
		return enumDataMap;
	}

	/**
	 * 将枚举转换成code-code-msg形式的集合 可通过<code>EnumXXX.setDisplay(false);</code>
	 * 的方式将不需要的枚举类型不转换成map
	 * 
	 * @return 转换后的map集合
	 */
	public static Map<String, String> toMixMap() {
		Map<String, String> enumDataMap = new LinkedHashMap<String, String>();
		for (EnumChapterStatus type : values()) {
			if (type.isDisplay()) {
				enumDataMap.put(type.getCode(), type.getCode() + "-" + type.getMsg());
			}
		}
		return enumDataMap;
	}
}
