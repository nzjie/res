package com.ajie.res.JMX;

/**
 * 将对象注册到JMX管理
 * 
 * @author niezhenjie
 */
public interface MBean {

	void register();

	void unregister();

}
