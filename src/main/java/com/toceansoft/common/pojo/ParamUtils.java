package com.toceansoft.common.pojo;

public class ParamUtils {
	
	/**
	 * 课程最大听课数
	 */
	public static final String COURSE_ATTEND_MAX_MUM = "COURSE_ATTEND_MAX_MUM";
	
	/**
	 * 教师最大听课数
	 */
	public static final String TEACHER_ATTEND_MAX_NUM = "TEACHER_ATTEND_MAX_NUM";
	
	/**
	 * 同一门课程被选择为随堂听课时可选的最大听课次数
	 */
	public static final String ONE_COURSE_STTK_ATTEND_MAX_MUM = "ONE_COURSE_STTK_ATTEND_MAX_MUM";
	
	/**
	 * 随堂听课有效期（超过有效期之后，课程将释放出来，允许其他督导选择，以月为单位）
	 */
	public static final String STTK_VALUEABLE_TIME = "STTK_VALUEABLE_TIME";
	
	/**
	 * 处于未听课章台的随堂听课次数，超过后不再把课程的督导类型设置为随堂听课
	 */
	public static final String WSTTK_NUM = "WSTTK_NUM";
	
	/**
	 * 同一门课程被选择为跟踪评课时候的最大听课次数（不少于一次）
	 */
	public static final String ONE_COURSE_GZPK_ATTEND_MAX_MUM = "ONE_COURSE_GZPK_ATTEND_MAX_MUM";
	
	/**
	 * 跟踪评课有效期（超过有效期之后，课程将释放出来，允许其他督导选择：以月为单位）
	 */
	public static final String GZPK_VALUEABLE_TIME = "GZPK_VALUEABLE_TIME";
	
	/**
	 * 每学期督导课程类型为跟踪评课的最大课程门数
	 */
	public static final String GZPK_MAX_NUM = "GZPK_MAX_NUM";
	
}
