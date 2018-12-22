package com.annotation.model;

import java.io.Serializable;

public class Document implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column document.did
     *
     * @mbg.generated
     */
    private Integer did;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column document.filename
     *
     * @mbg.generated
     */
    private String filename;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column document.filetype
     *
     * @mbg.generated
     */
    private String filetype;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column document.filesize
     *
     * @mbg.generated
     */
    private Integer filesize;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column document.relativepath
     *
     * @mbg.generated
     */
    private String relativepath;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column document.absolutepath
     *
     * @mbg.generated
     */
    private String absolutepath;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column document.docuploadtime
     *
     * @mbg.generated
     */
    private String docuploadtime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column document.doccomptime
     *
     * @mbg.generated
     */
    private String doccomptime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column document.docstatus
     *
     * @mbg.generated
     */
    private String docstatus;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column document.userid
     *
     * @mbg.generated
     */
    private Integer userid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table document
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column document.did
     *
     * @return the value of document.did
     *
     * @mbg.generated
     */
    public Integer getDid() {
        return did;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column document.did
     *
     * @param did the value for document.did
     *
     * @mbg.generated
     */
    public void setDid(Integer did) {
        this.did = did;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column document.filename
     *
     * @return the value of document.filename
     *
     * @mbg.generated
     */
    public String getFilename() {
        return filename;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column document.filename
     *
     * @param filename the value for document.filename
     *
     * @mbg.generated
     */
    public void setFilename(String filename) {
        this.filename = filename == null ? null : filename.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column document.filetype
     *
     * @return the value of document.filetype
     *
     * @mbg.generated
     */
    public String getFiletype() {
        return filetype;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column document.filetype
     *
     * @param filetype the value for document.filetype
     *
     * @mbg.generated
     */
    public void setFiletype(String filetype) {
        this.filetype = filetype == null ? null : filetype.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column document.filesize
     *
     * @return the value of document.filesize
     *
     * @mbg.generated
     */
    public Integer getFilesize() {
        return filesize;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column document.filesize
     *
     * @param filesize the value for document.filesize
     *
     * @mbg.generated
     */
    public void setFilesize(Integer filesize) {
        this.filesize = filesize;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column document.relativepath
     *
     * @return the value of document.relativepath
     *
     * @mbg.generated
     */
    public String getRelativepath() {
        return relativepath;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column document.relativepath
     *
     * @param relativepath the value for document.relativepath
     *
     * @mbg.generated
     */
    public void setRelativepath(String relativepath) {
        this.relativepath = relativepath == null ? null : relativepath.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column document.absolutepath
     *
     * @return the value of document.absolutepath
     *
     * @mbg.generated
     */
    public String getAbsolutepath() {
        return absolutepath;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column document.absolutepath
     *
     * @param absolutepath the value for document.absolutepath
     *
     * @mbg.generated
     */
    public void setAbsolutepath(String absolutepath) {
        this.absolutepath = absolutepath == null ? null : absolutepath.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column document.docuploadtime
     *
     * @return the value of document.docuploadtime
     *
     * @mbg.generated
     */
    public String getDocuploadtime() {
        return docuploadtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column document.docuploadtime
     *
     * @param docuploadtime the value for document.docuploadtime
     *
     * @mbg.generated
     */
    public void setDocuploadtime(String docuploadtime) {
        this.docuploadtime = docuploadtime == null ? null : docuploadtime.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column document.doccomptime
     *
     * @return the value of document.doccomptime
     *
     * @mbg.generated
     */
    public String getDoccomptime() {
        return doccomptime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column document.doccomptime
     *
     * @param doccomptime the value for document.doccomptime
     *
     * @mbg.generated
     */
    public void setDoccomptime(String doccomptime) {
        this.doccomptime = doccomptime == null ? null : doccomptime.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column document.docstatus
     *
     * @return the value of document.docstatus
     *
     * @mbg.generated
     */
    public String getDocstatus() {
        return docstatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column document.docstatus
     *
     * @param docstatus the value for document.docstatus
     *
     * @mbg.generated
     */
    public void setDocstatus(String docstatus) {
        this.docstatus = docstatus == null ? null : docstatus.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column document.userid
     *
     * @return the value of document.userid
     *
     * @mbg.generated
     */
    public Integer getUserid() {
        return userid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column document.userid
     *
     * @param userid the value for document.userid
     *
     * @mbg.generated
     */
    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table document
     *
     * @mbg.generated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", did=").append(did);
        sb.append(", filename=").append(filename);
        sb.append(", filetype=").append(filetype);
        sb.append(", filesize=").append(filesize);
        sb.append(", relativepath=").append(relativepath);
        sb.append(", absolutepath=").append(absolutepath);
        sb.append(", docuploadtime=").append(docuploadtime);
        sb.append(", doccomptime=").append(doccomptime);
        sb.append(", docstatus=").append(docstatus);
        sb.append(", userid=").append(userid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}