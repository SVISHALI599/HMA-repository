package com.example.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.example.demo.model.User;
@Mapper
public interface UserMapper {
	@Select("select * from t_user")
	List<User> getAllUser();

	@Select("select * from t_user where pk_user_id=#{pk_user_id}")
	User getUserById(int id);
	@Insert("INSERT INTO t_user (user_name, user_password, user_age, user_gender, user_mobile_number, user_email_id, user_address_line1, user_address_line2, user_address_line3) VALUES (#{userName}, #{userPassword}, #{userAge}, #{userGender}, #{userMobileNumber}, #{userEmailId}, #{userAddressLine1}, #{userAddressLine2}, #{userAddressLine3})")
	User setUser();

}
