package com.annotation.model;

import java.io.Serializable;

public class TaskDocument implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column task_document.taskid
     *
     * @mbg.generated
     */
    private Integer taskid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column task_document.documentid
     *
     * @mbg.generated
     */
    private Integer documentid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table task_document
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column task_document.taskid
     *
     * @return the value of task_document.taskid
     *
     * @mbg.generated
     */
    public Integer getTaskid() {
        return taskid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column task_document.taskid
     *
     * @param taskid the value for task_document.taskid
     *
     * @mbg.generated
     */
    public void setTaskid(Integer taskid) {
        this.taskid = taskid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column task_document.documentid
     *
     * @return the value of task_document.documentid
     *
     * @mbg.generated
     */
    public Integer getDocumentid() {
        return documentid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column task_document.documentid
     *
     * @param documentid the value for task_document.documentid
     *
     * @mbg.generated
     */
    public void setDocumentid(Integer documentid) {
        this.documentid = documentid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table task_document
     *
     * @mbg.generated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", taskid=").append(taskid);
        sb.append(", documentid=").append(documentid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}