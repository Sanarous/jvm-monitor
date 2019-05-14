package cn.bestzuo.service.impl;

import cn.bestzuo.entity.ThreadBean;
import cn.bestzuo.service.ThreadInfoService;
import org.springframework.stereotype.Service;

import java.lang.management.ManagementFactory;
import java.lang.management.ThreadMXBean;

/**
 * @author bestzuo
 * @date 2019-05-10
 */
@Service
public class ThreadInfoServiceImpl implements ThreadInfoService {

    @Override
    public ThreadBean get() {
        return init();
    }

    private ThreadBean init() {
        ThreadBean bean = new ThreadBean();
        ThreadMXBean mxBean = ManagementFactory.getThreadMXBean();
        bean.setCurrentTime(mxBean.getCurrentThreadUserTime());
        bean.setDaemonCount(mxBean.getDaemonThreadCount());
        bean.setCount(mxBean.getThreadCount());
        return bean;
    }
}
