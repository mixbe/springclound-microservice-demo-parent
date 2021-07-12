package cn.demo.order.feign.api.dto;

import java.math.BigDecimal;

import lombok.Data;

/**
 * Created by IntelliJ IDEA.
 *
 * @Description:
 * @Author: 义云
 * @Created: 2020-04-11 17:30
 */
@Data
public class OrderDTO {

  /**
   * Database Column Remarks:
   *   用户Id
   *
   *
   * @mbg.generated
   */
  private Integer userId;

  /**
   * Database Column Remarks:
   *   付款金额
   *
   *
   * @mbg.generated
   */
  private BigDecimal payMoney;

  /**
   * Database Column Remarks:
   *   商品Id
   *
   *
   * @mbg.generated
   */
  private Integer productId;

  /**
   * Database Column Remarks:
   *   状态
   *
   *
   * @mbg.generated
   */
  private Integer status;

  /**
   * Database Column Remarks:
   *   商品数量
   *

   */
  private Integer count;

}
