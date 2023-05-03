package com.aye.issuetrackerdto.entityDto;

import javax.validation.constraints.NotNull;

public class DepartmentDto {

    @NotNull
    private Long id;
    @NotNull
    private String name;
    @NotNull
    private String description;

    public DepartmentDto() {
    }

    public DepartmentDto(Long id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
