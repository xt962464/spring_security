package com.test.security.springsecurity.model.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Date;

/**
 * Description: 【 路径权限关联表 实体 】
 *
 * @author : 摇曳的狗尾巴草
 * @version : 1.0.0
 * @email : "m962464oo@gmail.com"
 * @date : 2020-11-12 13:38:25
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("SYS_REQUEST_PATH_PERMISSION_RELATION")
public class SysRequestPathPermissionRelationEntity  {

    // ==================== FIELDS ====================

    /**
     * 请求路径ID
     */
    @TableField(value = "url_id")
    private Integer urlId;

    /**
     * 权限ID
     */
    @TableField(value = "permission_id")
    private Integer permissionId;

    // ==================== NON-PERSISTENT ====================

    // ==================== GET AND SET METHODS ====================

}
