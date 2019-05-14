package cn.bestzuo.service;

import cn.bestzuo.entity.GarbageCollectorBean;
import cn.bestzuo.entity.MemoryPoolBean;

import java.util.List;

/**
 * @author bestzuo
 * @date 2019-05-11
 */
public interface GarbageCollectorService {

    GarbageCollectorBean get();

    List<MemoryPoolBean> getPools();
}
