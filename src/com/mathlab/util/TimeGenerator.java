package com.mathlab.util;

import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class TimeGenerator {

	/**
	 * 以一种较为友好的方式格式化日期时间�?�，用于生成日期和时�?
	 * 
	 * @return 格式化后的日期时间字符串
	 */
	public static String getCurrentTime() {
		Calendar c = Calendar.getInstance();
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		return df.format(c.getTime());

	}
	
	/**
	 * 以一种较为友好的方式格式化日期时间�?�，用于生成日期
	 * 
	 * @return 格式化后的日期时间字符串
	 */
	public static String getCurrentDate() {
		Calendar c = Calendar.getInstance();
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		return df.format(c.getTime());

	}
	
	/**
	 * 将時間的字符串表示形式转换层Time类型
	 * 
	 * @return 格式化后的時間類�?
	 */
	public static Time parseTime(String object) {
		return Time.valueOf(object);
	}
	
	/**
	 * 将日期的字符串表示形式转换层Date类型
	 * 
	 * @return 格式化后的日期類�?
	 */
	public static Date parseDate(String object) {
		return Date.valueOf(object);
	}
	
	/**
	 * 将日期的字符串表示形式转换层Date类型
	 * 
	 * @return 格式化后的日期類�?
	 */
	public static Timestamp parseTimestamp(String object) {
		return Timestamp.valueOf(object);
	}
}
