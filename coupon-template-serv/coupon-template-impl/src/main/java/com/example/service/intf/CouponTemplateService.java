package com.example.service.intf;

import com.example.beans.CouponTemplateInfo;
import com.example.beans.PagedCouponTemplateInfo;
import com.example.beans.TemplateSearchParams;

import java.util.Collection;
import java.util.Map;

/**
 * @author ShenYu
 * @version 1.0.0
 * @ClassName CouponTemplateController.java
 * @Description TODO
 * @createTime 2022年03月04日 15:01:00
 */
public interface CouponTemplateService {
    CouponTemplateInfo createTemplate(CouponTemplateInfo request);

    CouponTemplateInfo loadTemplateInfo(Long id);

    CouponTemplateInfo cloneTemplate(Long templateId);

    PagedCouponTemplateInfo search(TemplateSearchParams request);

    void deleteTemplate(Long id);

    Map<Long, CouponTemplateInfo> getTemplateInfoMap(Collection<Long> ids);
}
