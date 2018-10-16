package com.qilinxx.shareAct.util;

import java.math.BigInteger;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeTransform {									//用于时间格式转换
	public String stampToTime(BigInteger stamp) {				//把时间戳转化为好看的时间格式
		long timeStamp = Long.valueOf(stamp.toString())*1000l;
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");// 这个是你要转成后的时间的格式
		String time = sdf.format(new Date(timeStamp)); // 时间戳转换成时间
		return time;

	}

	public BigInteger getStamp() {								//获取当前时间戳
		long timeStamp = System.currentTimeMillis()/1000l;//获取当前时间戳,也可以是你自已给的一个随机的或是别人给你的时间戳(一定是long型的数据)
		BigInteger stamp= BigInteger.valueOf(timeStamp);
		return stamp;
	}
	
}
