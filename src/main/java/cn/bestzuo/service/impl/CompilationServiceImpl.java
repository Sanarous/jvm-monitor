package cn.bestzuo.service.impl;

import cn.bestzuo.entity.CompilationBean;
import cn.bestzuo.service.CompilationService;
import org.springframework.stereotype.Service;

import java.lang.management.CompilationMXBean;
import java.lang.management.ManagementFactory;

/**
 * @author bestzuo
 * @date 2019-05-10
 */
@Service
public class CompilationServiceImpl implements CompilationService {

    @Override
    public CompilationBean get() {
        return init();
    }

    private CompilationBean init() {
        CompilationBean bean = new CompilationBean();
        CompilationMXBean compilationMXBean = ManagementFactory.getCompilationMXBean();
        bean.setName(compilationMXBean.getName());
        bean.setTotalTime(compilationMXBean.getTotalCompilationTime());
        bean.setIsSupport(compilationMXBean.isCompilationTimeMonitoringSupported());
        return bean;
    }
}
