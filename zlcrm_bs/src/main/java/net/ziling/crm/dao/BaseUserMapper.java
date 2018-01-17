package net.ziling.crm.dao;

import net.ziling.crm.entity.BaseUser;

import java.util.List;
import java.util.Map;

public interface BaseUserMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table base_user
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(String userId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table base_user
     *
     * @mbggenerated
     */
    int insert(BaseUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table base_user
     *
     * @mbggenerated
     */
    int insertSelective(BaseUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table base_user
     *
     * @mbggenerated
     */
    BaseUser selectByPrimaryKey(String userId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table base_user
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(BaseUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table base_user
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(BaseUser record);

    /**
     * 通过用户查找用户的信息是否存在
     * @param username
     * @return
     */
    BaseUser selectByUsername(String username);

    /**
     * 获取所有的管理员信息
     * @return
     */
    List<BaseUser> getAllAdmin();

    /**
     * Simple版本修改用户信息
     * @param record
     * @return
     */
    int updateUserByUserIdSimple(BaseUser record);

    /**
     * 根据用户Id删除用户
     * @param userId
     * @return
     */
    int deleteByUserId(String userId);

    /**
     * 根据客户Id查找客户信息
     * @param userId
     * @return
     */
    BaseUser selectByUserId(String userId);

    /**
     * 根据客户Id修改客户基本信息
     * @param user
     * @return
     */
    int updateByUserId(BaseUser user);

    /**
     * 根据查询条件查找相关的所有的用户信息
     * @param limits 查询的限制条件
     * @return 查找到的用户的集合
     */
    List<BaseUser> getAllUser(Map<String, Object> limits);

}
