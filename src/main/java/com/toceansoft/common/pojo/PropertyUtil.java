package com.toceansoft.common.pojo;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class PropertyUtil {
    
	private static final Log log = LogFactory.getLog(PropertyUtil.class);
	
    private static Properties props;
    static{
        loadProps();
    }

    synchronized static private void loadProps(){
    	log.info("开始加载properties文件内容.......");
        props = new Properties();
        InputStream in = null;
        try {
        	in = PropertyUtil.class.getClassLoader().getResourceAsStream("config.properties");
        	props.load(in);
        } catch (FileNotFoundException e) {
        	log.error("jdbc.properties文件未找到");
        } catch (IOException e) {
        	log.error("出现IOException");
        } finally {
            try {
                if(null != in) {
                    in.close();
                }
            } catch (IOException e) {
            	log.error("jdbc.properties文件流关闭出现异常");
            }
        }
        log.info("加载properties文件内容完成...........");
        log.info("properties文件内容：" + props);
    }

    public static String getProperty(String key){
        if(null == props) {
            loadProps();
        }
        return props.getProperty(key);
    }

    public static String getProperty(String key, String defaultValue) {
        if(null == props) {
            loadProps();
        }
        return props.getProperty(key, defaultValue);
    }
}
