package com.authority.management.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.StringUtils;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
/**
 * 
* @ClassName: DateUtil 
* @Description: TODO 时间工具类
* @author Mr.wang 
* @date 2020年1月10日 下午3:01:52 
*
 */
public class DateUtil{
    public static Logger logger = LoggerFactory.getLogger(DateUtil.class);
    public static final String defaultDatePattern = "yyyy-MM-dd";
    private static SimpleDateFormat lenientDateFormat = new SimpleDateFormat(defaultDatePattern);
    public static final String FullDatePattern = "yyyy-MM-dd HH:mm:ss";
    private static SimpleDateFormat fullDateFormat = new SimpleDateFormat(FullDatePattern);


    //String格式化
    public static String convertDateFormat(Date d){
        if (d == null) {
            return null;
        }
        return fullDateFormat.format(d);
    }



    //String时间加一天
    public static String dateAddOne(String startTime,String endTime){

        Calendar calendar = Calendar.getInstance();
       // if (endTime!=null){
        if (StringUtils.hasText(endTime)){
            try {
                DateFormat df = new SimpleDateFormat("yyyy-MM-dd");/*** 加一天 */
                Date dd = df.parse(endTime);
                calendar.setTime(dd);
                calendar.add(Calendar.DAY_OF_MONTH, 1);// 加一天
                endTime = df.format(calendar.getTime());
            } catch (Exception e) {
                logger.error("getAccessTimes : 日期类型转换错误!,startTime="+startTime+",endTime="+endTime);
            }
        }
        return fullDateFormat.format(calendar.getTime());
    }


    /**
     * 根据传入的模式获取日期的格式类对象SimpleDateFormat
     *
     * @param pattern
     *            :
     *            longFmt19 yyyy-MM-dd HH:mm:ss longFmt15 yyyyMMdd HHmmss
     *            shortFmt10 yyyy-MM-dd shortFmtT8 HH:mm:ss
     */
    public static SimpleDateFormat getFmt(String pattern) {
        SimpleDateFormat formatter = new SimpleDateFormat(pattern);
        return formatter;
    }


    /**
     * 根据格式将 传入日期Date转换成相应格式的String
     *
     * @param pattern
     *            :
     *            longFmt19 yyyy-MM-dd HH:mm:ss longFmt15 yyyyMMdd HHmmss
     *            shortFmt10 yyyy-MM-dd shortFmtT8 HH:mm:ss
     */
    public static String dateToStringByFmt(Date date, String pattern) {

        String dateString = "";
        if (date != null) {
            SimpleDateFormat fmtter = getFmt(pattern);
            dateString = fmtter.format(date);
        }
        return dateString;
    }


    /**
     * 
    * @Title: dateToStamp 
    * @Description: TODO  将时间转换为时间戳
    * @param @param s
    * @param @return
    * @param @throws ParseException    设定文件 
    * @return String    返回类型 
    * @throws
     */
    public static long dateToStamp(String s) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = null;
		try {
			date = simpleDateFormat.parse(s);
		} catch (ParseException e) {
			e.printStackTrace();
		}
        return date.getTime();
    }

    /**
     * 
    * @Title: stampToDate 
    * @Description: TODO 将时间戳转换为时间
    * @param @param s
    * @param @return    设定文件 
    * @return String    返回类型 
    * @throws
     */
    public static String stampToDate(String s){
        String res;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        long lt = new Long(s);
        Date date = new Date(lt);
        res = simpleDateFormat.format(date);
        return res;
    }

}
