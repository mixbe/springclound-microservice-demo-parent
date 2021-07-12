package cn.demo.order.server;

import cn.demo.order.entity.OrderBaseEntity;
import cn.demo.order.feign.api.dto.OrderDTO;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 * 订单表 服务类
 * </p>
 *
 * @author
 * @since 2021-07-05
 */
public interface OrderBaseService extends IService<OrderBaseEntity> {

  void createOrder(OrderDTO order) throws Exception;

}
