package com.annotation.dao;

import com.annotation.model.Task;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 * Created by twinkleStar on 2018/12/9.
 */
@Mapper
@Repository
public interface TaskMapper {

    /**
     * 插入任务
     * @param task
     * @return
     */
    int insertTask(Task task);

    /**
     * 分页查询
     * @param data
     * @return
     */
    List<Task> selectTaskByRelatedInfo(Map<String,Object> data);

    /**
     * 计算用户任务总数
     * @param userid
     * @return
     */
    Integer countTaskNumByUserid(int userid);

    List<Task> getAll();


    /**
     * 根据taskid查询task
     * @param taskid
     * @return
     */
    Task selectTaskById(int taskid);

    /**
     * 根据taskid更新task的完成状态
     * @param task
     * @return
     */
    int updateById(Task task);



}
