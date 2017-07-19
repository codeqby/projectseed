package com.none.dao;

import com.none.model.Appointment;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AppointmentMapper {
    /**
    *@mbg.generated
     */
    int deleteByPrimaryKey(@Param("bookId") Long bookId, @Param("studentId") Long studentId);

    /**
    *@mbg.generated
     */
    int insert(Appointment record);

    /**
    *@mbg.generated
     */
    Appointment selectByPrimaryKey(@Param("bookId") Long bookId, @Param("studentId") Long studentId);

    /**
    *@mbg.generated
     */
    List<Appointment> selectAll();

    /**
    *@mbg.generated
     */
    int updateByPrimaryKey(Appointment record);
}