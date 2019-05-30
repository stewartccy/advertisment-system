package com.imooc.ad.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

/**
 * @author CCY
 * @date 2019/5/28 14:51
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "ad_creative")
public class Creative {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Basic
    @Column(name = "name", nullable = false)
    private String name;

    @Basic
    @Column(name = "type", nullable = false)
    private Integer type;

    /**物料的类型，图片可以为bmp，jpg */
    @Basic
    @Column(name = "material_type", nullable = false)
    private Integer materialType;

    @Basic
    @Column(name = "height", nullable = false)
    private Integer height;

    @Basic
    @Column(name = "width", nullable = false)
    private Integer width;

    /**物料大小*/
    @Basic
    @Column(name = "size", nullable = false)
    private Long size;

    /**持续时长 */
    @Basic
    @Column(name = "duration", nullable = false)
    private Integer duration;

    /** 审核状态 */
    @Basic
    @Column(name = "auditStatus", nullable = false)
    private Integer auditStatus;

    @Basic
    @Column(name = "user_id", nullable = false)
    private Long userId;

    @Basic
    @Column(name = "url", nullable = false)
    private String url;

    @Basic
    @Column(name = "createTime", nullable = false)
    private Date createTime;

    @Basic
    @Column(name = "updateTime", nullable = false)
    private Date updateTime;


}
