package com.qodev.tech.domain.masterdata;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "mst_role")
public class role extends PanacheEntityBase {
    @Id
    @Column(name = "id_role")
    private String roleId;

    @Column(name = "name_role")
    private String nameRole;

    @Column(name = "status_role")
    private Integer statusRole;

    @Column(name = "created_at")
    private Date createdAt;

    @Column(name = "created_by")
    private String createdBy;

    @Column(name = "updated_at")
    private Date updatedAt;

    @Column(name = "updated_by")
    private String updatedBy;

    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    public String getNameRole() {
        return nameRole;
    }

    public void setNameRole(String nameRole) {
        this.nameRole = nameRole;
    }

    public Integer getStatusRole() {
        return statusRole;
    }

    public void setStatusRole(Integer statusRole) {
        this.statusRole = statusRole;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }
}
