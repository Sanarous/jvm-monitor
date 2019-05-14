package cn.bestzuo.service.impl;

import cn.bestzuo.entity.ClassLoaderBean;
import cn.bestzuo.service.ClassLoaderService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

/**
 * @author bestzuo
 * @date 2019-05-10
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ClassLoaderServiceImplTest {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private ClassLoaderService classLoaderService;

    @Test
    public void get() {
        ClassLoaderBean classLoaderBean = classLoaderService.get();
        logger.info("classLoader => {}", classLoaderBean);
    }
}