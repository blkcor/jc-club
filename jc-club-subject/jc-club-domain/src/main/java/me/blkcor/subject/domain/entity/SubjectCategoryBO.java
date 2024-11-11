package me.blkcor.subject.domain.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @author blkcor
 * @since 2024-11-10 22:36:50
 */
@Data
public class SubjectCategoryBO  {
    /**
     * 主键
     */
    private Long id;
    /**
     * 分类名称
     */
    private String categoryName;
    /**
     * 分类类型
     */
    private Integer categoryType;
    /**
     * 图标链接
     */
    private String imageUrl;
    /**
     * 父级id
     */
    private Long parentId;
}

