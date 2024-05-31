package com.ruoyi.system.gencode.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.time.LocalDateTime;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

/**
 * <p>
 * 闪卡表
 * </p>
 *
 * @author author
 * @since 2024-05-23
 */
@Getter
@Setter
@Accessors(chain = true)
@TableName("flashcard_attribute")
public class FlashcardAttribute implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 记录uuid
     */
    @TableField("uuid")
    private String uuid;

    /**
     * 闪卡uuid
     */
    @TableField("card_uuid")
    private String cardUuid;

    /**
     * 熟悉类型（0不会 1会 2待定）
     */
    @TableField("familiarity")
    private Integer familiarity;

    /**
     * 下次学习时间
     */
    @TableField("next_study_time")
    private LocalDateTime nextStudyTime;

    /**
     * 创建时间
     */
    @TableField("create_time")
    private LocalDateTime createTime;

    /**
     * 更新时间
     */
    @TableField("update_time")
    private LocalDateTime updateTime;
}
