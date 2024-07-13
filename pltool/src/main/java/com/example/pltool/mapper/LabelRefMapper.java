package com.example.pltool.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import com.example.pltool.domain.dto.label.LabelInfo;
import com.example.pltool.domain.dto.language.wordcollection.WordCollectionData;
import com.example.pltool.domain.entity.LabelRef;
import com.example.pltool.domain.entity.Word;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * <p>
 * 标签关联表 Mapper 接口
 * </p>
 *
 * @author author
 * @since 2024-04-12
 */
@Mapper
public interface LabelRefMapper extends BaseMapper<LabelRef> {
    List<LabelInfo> getLabelInfoByRefUUID(@Param("refUUID") String refUUID);

    List<WordCollectionData> getAllCollectionByType(@Param("type") Integer type);

    List<Word> getWordsOfCollection(@Param("uuid") String uuid);
}
