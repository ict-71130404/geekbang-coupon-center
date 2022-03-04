package com.example.beans;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author ShenYu
 * @version 1.0.0
 * @ClassName PagedCouponTemplateInfo.java
 * @Description TODO
 * @createTime 2022年03月04日 15:06:00
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PagedCouponTemplateInfo {

    public List<CouponTemplateInfo> templates;

    public int page;

    public long total;

}
