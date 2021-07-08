package cn.demo.storage.feigapi.fallback;

import org.springframework.stereotype.Component;

import cn.demo.common.model.base.BaseCode;
import cn.demo.common.model.pojo.ResponseResult;
import cn.demo.storage.feigapi.api.StorageApi;
import cn.demo.storage.feigapi.dto.StorageSelectDTO;
import cn.demo.storage.feigapi.entity.StorageEntity;
import feign.hystrix.FallbackFactory;
import lombok.extern.slf4j.Slf4j;

/**
 * @version 1.0
 * @Author 义云
 * @Description 熔断
 * @Date 2020/4/21 19:57
 */
@Component
@Slf4j
public class StorageApiFallbackFactory implements FallbackFactory<StorageApi> {


    @Override
    public StorageApi create(Throwable throwable) {
        // 对所有方法做降级处理
        return new StorageApi() {
            @Override
            public ResponseResult findById(StorageSelectDTO data) {
                log.info("findById熔断！", throwable);
                return ResponseResult.fail(BaseCode.CALL_TIME);
            }

            @Override
            public ResponseResult insert(StorageEntity data) {
                log.info("insert熔断！", throwable);
                return ResponseResult.fail(BaseCode.CALL_TIME);
            }

            @Override
            public ResponseResult deleteById(Integer requestObject) {
                log.info("deleteById熔断！", throwable);
                return ResponseResult.fail(BaseCode.CALL_TIME);
            }

            @Override
            public ResponseResult update(StorageEntity data) {
                log.info("update熔断！", throwable);
                return ResponseResult.fail(BaseCode.CALL_TIME);
            }

            @Override
            public ResponseResult findPage(StorageSelectDTO data) {
                log.info("findPage熔断！", throwable);
                return ResponseResult.fail("服务熔断降级！");
            }

        };
    }
}
