package net.ziling.crm.entity;

public class Role {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column zc_role.role_id
     *
     * @mbggenerated
     */
    private String roleId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column zc_role.role_name
     *
     * @mbggenerated
     */
    private String roleName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column zc_role.role_desc
     *
     * @mbggenerated
     */
    private String roleDesc;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table zc_role
     *
     * @mbggenerated
     */
    public Role(String roleId, String roleName, String roleDesc) {
        this.roleId = roleId;
        this.roleName = roleName;
        this.roleDesc = roleDesc;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table zc_role
     *
     * @mbggenerated
     */
    public Role() {
        super();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column zc_role.role_id
     *
     * @return the value of zc_role.role_id
     *
     * @mbggenerated
     */
    public String getRoleId() {
        return roleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column zc_role.role_id
     *
     * @param roleId the value for zc_role.role_id
     *
     * @mbggenerated
     */
    public void setRoleId(String roleId) {
        this.roleId = roleId == null ? null : roleId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column zc_role.role_name
     *
     * @return the value of zc_role.role_name
     *
     * @mbggenerated
     */
    public String getRoleName() {
        return roleName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column zc_role.role_name
     *
     * @param roleName the value for zc_role.role_name
     *
     * @mbggenerated
     */
    public void setRoleName(String roleName) {
        this.roleName = roleName == null ? null : roleName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column zc_role.role_desc
     *
     * @return the value of zc_role.role_desc
     *
     * @mbggenerated
     */
    public String getRoleDesc() {
        return roleDesc;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column zc_role.role_desc
     *
     * @param roleDesc the value for zc_role.role_desc
     *
     * @mbggenerated
     */
    public void setRoleDesc(String roleDesc) {
        this.roleDesc = roleDesc == null ? null : roleDesc.trim();
    }
}