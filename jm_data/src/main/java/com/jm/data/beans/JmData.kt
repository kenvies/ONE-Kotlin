package com.jm.data.beans

import java.io.Serializable

/**
 * Created by shunq-wang on 2016/11/23.
 * 实体bean
 */


/**
 * 基础请求参数
 */
data class RequestParams(
        var AppUserId: Int? = 0,
        var Timestamp: String? = "",
        var Sign: String? = "",
        var SignId: String? = "",
        var Ver: String? = "",
        val Platform: Int = 2,
        var DeviceId: String? = "",
        var Args: String = "{}",
        val rtype: Int = 1,
        var VerCode: Int = 0
) : Serializable
/**
 * 接口返回实体
 */
class _ResponseData<T : Any> : Serializable {
    var code: Int? = null
    var timeStamp: String? = null
    var result: T? = null
}
/**
 * 用户信息
 */
class UserInfo( var AppUserId: Int? = null,
                   var UserName: String? = null) : Serializable