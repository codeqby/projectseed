package com.none.model;

import java.io.Serializable;
import java.util.Date;

public class Appointment implements Serializable {
    /**
     * 图书ID
    *@mbg.generated
     */
    private Long bookId;

    /**
     * 学号
    *@mbg.generated
     */
    private Long studentId;

    /**
     * 预约时间
    *@mbg.generated
     */
    private Date appointTime;

    /**
     * appointment
    *@mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * 图书ID
     * @return book_id 图书ID
    *@mbg.generated
     */
    public Long getBookId() {
        return bookId;
    }

    /**
     * 图书ID
     * @param bookId 图书ID
    *@mbg.generated
     */
    public void setBookId(Long bookId) {
        this.bookId = bookId;
    }

    /**
     * 学号
     * @return student_id 学号
    *@mbg.generated
     */
    public Long getStudentId() {
        return studentId;
    }

    /**
     * 学号
     * @param studentId 学号
    *@mbg.generated
     */
    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }

    /**
     * 预约时间
     * @return appoint_time 预约时间
    *@mbg.generated
     */
    public Date getAppointTime() {
        return appointTime;
    }

    /**
     * 预约时间
     * @param appointTime 预约时间
    *@mbg.generated
     */
    public void setAppointTime(Date appointTime) {
        this.appointTime = appointTime;
    }

    /**
    *@mbg.generated
     */
    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Appointment other = (Appointment) that;
        return (this.getBookId() == null ? other.getBookId() == null : this.getBookId().equals(other.getBookId()))
            && (this.getStudentId() == null ? other.getStudentId() == null : this.getStudentId().equals(other.getStudentId()));
    }

    /**
    *@mbg.generated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getBookId() == null) ? 0 : getBookId().hashCode());
        result = prime * result + ((getStudentId() == null) ? 0 : getStudentId().hashCode());
        return result;
    }

    /**
    *@mbg.generated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", bookId=").append(bookId);
        sb.append(", studentId=").append(studentId);
        sb.append(", appointTime=").append(appointTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}