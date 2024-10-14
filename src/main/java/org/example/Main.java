package org.example;

import javax.management.MBeanServer;
import javax.management.ObjectName;
import java.lang.management.ManagementFactory;

public class Main {
    public static void main(String[] args) throws Exception {

        //Mbean 서버를 가져온다
        MBeanServer mBeanServer = ManagementFactory.getPlatformMBeanServer();
        ObjectName objectName = new ObjectName("org.example:type=Server");

        HelloMBean hello = new Hello();

        //서버에 빈으로 등록한다
        mBeanServer.registerMBean(hello, objectName);
        System.out.println("registered Server!!");


        Thread.sleep(Long.MAX_VALUE);


    }
}