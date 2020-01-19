package com.example.demo.mapper;

import java.util.List;

import javax.ws.rs.Path;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.example.demo.model.Doctor;

@Mapper
@Path("/mapper/doctor")
public interface DoctorMapper {
	@Select("SELECT user_name, user_age, user_gender, user_mobile_number, user_email_id, user_address_line1, user_address_line2, user_address_line3, doctor_specialization,doctor_experience FROM t_user JOIN t_doctor ON t_user.pk_user_id=t_doctor.fk_user_id")
	List<Doctor> getAllDoctor();

	@Select("select * from  t_doctor where pk_doctor_id=#{pk_doctor_id}")
	Doctor getDoctorById(int id);

	@Insert("INSERT INTO t_user (user_name, user_password, user_age, user_gender, user_mobile_number, user_email_id, user_address_line1, user_address_line2, user_address_line3, fk_role_id) VALUES (#{userName}, #{userPassword}, #{userAge}, #{userGender}, #{userMobileNumber}, #{userEmailId}, #{userAddressLine1}, #{userAddressLine2}, #{userAddressLine3}, 4)")
	@Options(useGeneratedKeys = true, keyProperty = "userId", keyColumn = "pk_user_id")
	int setUser(Doctor doctor);

	@Insert("INSERT INTO t_doctors (fk_user_id,doctor_specialization,doctor_experience) VALUES (#{userId},#{doctorSpecialization},#{doctorExperience})")
	int setDoctor(Doctor doctor);

	@Update("UPDATE t_user SET is_delete = 1 WHERE pk_user_id = #{userId} AND is_delete= 0")
	int deleteDoctor(int userId);

	@Update("UPDATE t_user SET user_name = #{userName}, user_password=#{userPassword}, user_age=#{userAge}, user_gender=#{userGender}, user_mobile_number=#{userMobileNumber}, user_email_id=#{userEmailId}, user_address_line1=#{userAddressLine1}, user_address_line2=#{userAddressLine2}, user_address_line3 = #{userAddressLine3} WHERE pk_user_id = #{userId}")
	int updateDoctor(Doctor doctor);
}