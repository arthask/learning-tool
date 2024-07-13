package com.example.pltool.service.language;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.pltool.domain.entity.UserStudyRecord;

import java.util.List;


/**
 * <p>
 * 用户学习记录表 服务类
 * </p>
 *
 * @author author
 * @since 2024-05-16
 */
public interface UserStudyRecordService extends IService<UserStudyRecord> {
    int insertUserStudyRecord(UserStudyRecord userStudyRecord);

    List<UserStudyRecord> listWordOfDay(Long userId, int day);
}
