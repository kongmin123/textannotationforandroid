package com.annotation.model;

import java.io.Serializable;
import java.util.List;

public class Task implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column task.tid
     *
     * @mbg.generated
     */
    private Integer tid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column task.title
     *
     * @mbg.generated
     */
    private String title;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column task.description
     *
     * @mbg.generated
     */
    private String description;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column task.createtime
     *
     * @mbg.generated
     */
    private String createtime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column task.deadline
     *
     * @mbg.generated
     */
    private String deadline;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column task.taskcomptime
     *
     * @mbg.generated
     */
    private String taskcomptime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column task.taskcompstatus
     *
     * @mbg.generated
     */
    private String taskcompstatus;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column task.otherinfo
     *
     * @mbg.generated
     */
    private String otherinfo;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column task.userid
     *
     * @mbg.generated
     */
    private Integer userid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column task.type
     *
     * @mbg.generated
     */
    private String type;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table task
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column task.tid
     *
     * @return the value of task.tid
     *
     * @mbg.generated
     */
    public Integer getTid() {
        return tid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column task.tid
     *
     * @param tid the value for task.tid
     *
     * @mbg.generated
     */
    public void setTid(Integer tid) {
        this.tid = tid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column task.title
     *
     * @return the value of task.title
     *
     * @mbg.generated
     */
    public String getTitle() {
        return title;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column task.title
     *
     * @param title the value for task.title
     *
     * @mbg.generated
     */
    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column task.description
     *
     * @return the value of task.description
     *
     * @mbg.generated
     */
    public String getDescription() {
        return description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column task.description
     *
     * @param description the value for task.description
     *
     * @mbg.generated
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column task.createtime
     *
     * @return the value of task.createtime
     *
     * @mbg.generated
     */
    public String getCreatetime() {
        return createtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column task.createtime
     *
     * @param createtime the value for task.createtime
     *
     * @mbg.generated
     */
    public void setCreatetime(String createtime) {
        this.createtime = createtime == null ? null : createtime.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column task.deadline
     *
     * @return the value of task.deadline
     *
     * @mbg.generated
     */
    public String getDeadline() {
        return deadline;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column task.deadline
     *
     * @param deadline the value for task.deadline
     *
     * @mbg.generated
     */
    public void setDeadline(String deadline) {
        this.deadline = deadline == null ? null : deadline.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column task.taskcomptime
     *
     * @return the value of task.taskcomptime
     *
     * @mbg.generated
     */
    public String getTaskcomptime() {
        return taskcomptime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column task.taskcomptime
     *
     * @param taskcomptime the value for task.taskcomptime
     *
     * @mbg.generated
     */
    public void setTaskcomptime(String taskcomptime) {
        this.taskcomptime = taskcomptime == null ? null : taskcomptime.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column task.taskcompstatus
     *
     * @return the value of task.taskcompstatus
     *
     * @mbg.generated
     */
    public String getTaskcompstatus() {
        return taskcompstatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column task.taskcompstatus
     *
     * @param taskcompstatus the value for task.taskcompstatus
     *
     * @mbg.generated
     */
    public void setTaskcompstatus(String taskcompstatus) {
        this.taskcompstatus = taskcompstatus == null ? null : taskcompstatus.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column task.otherinfo
     *
     * @return the value of task.otherinfo
     *
     * @mbg.generated
     */
    public String getOtherinfo() {
        return otherinfo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column task.otherinfo
     *
     * @param otherinfo the value for task.otherinfo
     *
     * @mbg.generated
     */
    public void setOtherinfo(String otherinfo) {
        this.otherinfo = otherinfo == null ? null : otherinfo.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column task.userid
     *
     * @return the value of task.userid
     *
     * @mbg.generated
     */
    public Integer getUserid() {
        return userid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column task.userid
     *
     * @param userid the value for task.userid
     *
     * @mbg.generated
     */
    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column task.type
     *
     * @return the value of task.type
     *
     * @mbg.generated
     */
    public String getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column task.type
     *
     * @param type the value for task.type
     *
     * @mbg.generated
     */
    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table task
     *
     * @mbg.generated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", tid=").append(tid);
        sb.append(", title=").append(title);
        sb.append(", description=").append(description);
        sb.append(", createtime=").append(createtime);
        sb.append(", deadline=").append(deadline);
        sb.append(", taskcomptime=").append(taskcomptime);
        sb.append(", taskcompstatus=").append(taskcompstatus);
        sb.append(", otherinfo=").append(otherinfo);
        sb.append(", userid=").append(userid);
        sb.append(", type=").append(type);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }


    private List<Label> labelList;
    public List<Label> getLabelList(){
        return labelList;
    }
    public void setLabelList(List<Label> labelList){
        this.labelList = labelList;
    }
}