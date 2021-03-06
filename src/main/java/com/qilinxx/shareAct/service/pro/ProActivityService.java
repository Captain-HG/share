package com.qilinxx.shareAct.service.pro;

import com.qilinxx.shareAct.domain.model.Activity;

import java.util.List;

/**
 * @Auther: 余小北
 * @Date: 2018/10/15 16:47
 * @Description:
 */
public interface ProActivityService {
    /**
     *@Author: pengxiaoyu
     * @Description: 根据商户Id查询所有的Activity
     * @Param: [pId]
     * @return: java.util.List<com.qilinxx.shareAct.domain.model.Activity>
     * @Date: 2018/10/15
     */
    List<Activity> findAllActivitiesById(String pId);
    /**
     *@Author: pengxiaoyu
     * @Description: 根据活动Id查询活动详情
     * @Param: [id]
     * @return: com.qilinxx.shareAct.domain.model.Activity
     * @Date: 2018/10/15
     */
    Activity selectActivityById(String id);

    Integer stopActivityById(String id);

    int updateActivity(Activity activity);
}
