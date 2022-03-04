package com.example.beans;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author ShenYu
 * @version 1.0.0
 * @ClassName TemplateSearchParams.java
 * @Description TODO
 * @createTime 2022年03月04日 15:07:00
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TemplateSearchParams {

    private Long id;

    private String name;

    private String type;

    private Long shopId;

    private Boolean available;

    private int page;

    private int pageSize;

}
