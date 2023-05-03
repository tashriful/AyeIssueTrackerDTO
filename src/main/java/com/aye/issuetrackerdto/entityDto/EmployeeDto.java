package com.aye.issuetrackerdto.entityDto;

public class EmployeeDto {

    private Long id;
    private String name;
    private String designation;
    private String address;
    private Long userId;
    private String userName;
    private Long departmentId;
    private String departmentName;
    private Boolean deptHead;
    private Long teamId;
    private String teamName;
    private Boolean teamHead;

    public EmployeeDto() {
    }

    public EmployeeDto(Long id, String name, String designation, String address, Long userId, String userName, Long departmentId, String departmentName, Boolean deptHead, Long teamId, String teamName, Boolean teamHead) {
        this.id = id;
        this.name = name;
        this.designation = designation;
        this.address = address;
        this.userId = userId;
        this.userName = userName;
        this.departmentId = departmentId;
        this.departmentName = departmentName;
        this.deptHead = deptHead;
        this.teamId = teamId;
        this.teamName = teamName;
        this.teamHead = teamHead;
    }



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Long getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Long departmentId) {
        this.departmentId = departmentId;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public Boolean getDeptHead() {
        return deptHead;
    }

    public void setDeptHead(Boolean deptHead) {
        this.deptHead = deptHead;
    }

    public Long getTeamId() {
        return teamId;
    }

    public void setTeamId(Long teamId) {
        this.teamId = teamId;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public Boolean getTeamHead() {
        return teamHead;
    }

    public void setTeamHead(Boolean teamHead) {
        this.teamHead = teamHead;
    }

    @Override
    public String toString() {
        return "EmployeeDto{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", designation='" + designation + '\'' +
                ", address='" + address + '\'' +
                ", userId=" + userId +
                ", userName='" + userName + '\'' +
                ", departmentId=" + departmentId +
                ", departmentName='" + departmentName + '\'' +
                ", deptHead=" + deptHead +
                ", teamId=" + teamId +
                ", teamName='" + teamName + '\'' +
                ", teamHead=" + teamHead +
                '}';
    }
}
