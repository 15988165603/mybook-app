package com.mybook.app.aop;


import com.mybook.app.utils.UserContext;
import com.mybook.app.core.BaseEntity;
import com.mybook.app.utils.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.sql.Timestamp;
import java.util.List;
import java.util.Optional;

@Component
@Aspect
public class MybatisAspect {

    private static final String CREATE_UPDATE_BY = "-1";

    @Before("execution(* com.web.project.mapper..*.insert*(..))")
    public void doBeforeInsert(JoinPoint joinPoint) {
        String className = joinPoint.getThis().toString();
        String methodName = joinPoint.getSignature().getName(); // 获得方法名  
        String typeName = joinPoint.getSignature().getDeclaringTypeName();
        Logger.debug(this, "位于：" + className + "调用" + methodName + "()方法-开始！代理类名字：" + typeName);
        Object[] args = joinPoint.getArgs(); // 获得参数列表  
        if (args.length <= 0) {
            Logger.debug(this, "====" + methodName + "方法没有参数");
        } else {
            for (int i = 0; i < args.length; i++) {
                Logger.debug(this, "====参数  " + (i + 1) + "：" + args[i]);
                if (args[i] instanceof BaseEntity) {
                    setBaseEntityData(args[i]);
                }
                if (args[i] instanceof List<?>) {
                    List<?> list = (List<?>) args[i];
                    for (int j = 0; j < list.size(); j++) {
                        if (list.get(j) instanceof BaseEntity) {
                            setBaseEntityData(list.get(j));
                        }
                    }
                }
            }
        }

    }

    @Before("execution(* com.web.project.mapper..*.update*(..))")
    public void doBeforeUpdate(JoinPoint joinPoint) {
        String className = joinPoint.getThis().toString();
        String methodName = joinPoint.getSignature().getName(); // 获得方法名  
        Logger.debug(this, "位于：" + className + "调用" + methodName + "()方法-开始！");
        Object[] args = joinPoint.getArgs(); // 获得参数列表  
        if (args.length <= 0) {
            Logger.debug(this, "====" + methodName + "方法没有参数");
        } else {
            for (int i = 0; i < args.length; i++) {
                Logger.debug(this, "====参数  " + (i + 1) + "：" + args[i]);
                if (args[i] instanceof BaseEntity) {
                    setBaseEntityData(args[i]);
                }
            }
        }
    }

    /**
     * 设置表基本信息
     * <p>
     * setBaseEntityData:(这里用一句话描述这个方法的作用). <br/>
     * (这里描述这个方法适用条件 – 可选).<br/>
     * (这里描述这个方法的执行流程 – 可选).<br/>
     * (这里描述这个方法的使用方法 – 可选).<br/>
     * (这里描述这个方法的注意事项 – 可选).<br/>
     *
     * @param data
     * @author zengxinyan
     * @since JDK 1.8
     */
    private void setBaseEntityData(Object data) {
        if (data instanceof BaseEntity) {
            BaseEntity baseEntity = (BaseEntity) data;
            /**
             *
             * 获取用户编号
             *
             */
            Optional<String> optional = UserContext.getCurrentuserNo();
            String userNo = null;
            if (optional.isPresent()) {
                userNo = optional.get();
            }

            if (baseEntity.getId() == null) {
                if (baseEntity.getCreatedBy() == null) {
                    baseEntity.setCreatedBy(userNo == null ? CREATE_UPDATE_BY : userNo);
                    baseEntity.setCreatedAt(new Timestamp(System.currentTimeMillis()));
                }
            } else {
                baseEntity.setUpdatedBy(userNo == null ? CREATE_UPDATE_BY : userNo);
                baseEntity.setUpdatedAt(new Timestamp(System.currentTimeMillis()));
            }
         }
    }


}
