package com.mybook.app.conf;

import net.bull.javamelody.MonitoringFilter;
import net.bull.javamelody.MonitoringSpringAdvisor;
import org.springframework.aop.support.JdkRegexpMethodPointcut;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

/**
 * 监控性能配置
 * Created by ShanLin on 2017/4/3.
 */

@Configuration
@ImportResource({"classpath*:net/bull/javamelody/monitoring-spring-aspectj.xml"})
public class JavaMelodyConfig {
    @Bean
    public FilterRegistrationBean getJavaMelodyFilterRegistration() {
        FilterRegistrationBean registration = new FilterRegistrationBean(new MonitoringFilter());
        registration.setAsyncSupported(true);
        return registration;
    }
    @Bean
    public MonitoringSpringAdvisor getMonitoringSpringAdvisor(@Value("${web-project.javaMedoly.classPattern:com.web.project}") String[] classPatterns) {
        MonitoringSpringAdvisor monitoringSpringAdvisor = new MonitoringSpringAdvisor();
        JdkRegexpMethodPointcut pointcut = new JdkRegexpMethodPointcut();
        pointcut.setPatterns(classPatterns);
        monitoringSpringAdvisor.setPointcut(pointcut);
        return monitoringSpringAdvisor;
    }
    
}
