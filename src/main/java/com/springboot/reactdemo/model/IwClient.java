package com.springboot.reactdemo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "client")
public class IwClient {

    @Id
    private String id;

    @Field("code")
    @Indexed(unique = true, dropDups = true)
    private String code;

    @Field("name")
    private String name;

    @Field("site")
    @Indexed(unique = true, dropDups = true)
    private String site;

    @Field("vendor_id")
    private Long vendorId;

    @Field("api_version")
    private String apiVersion;

    @Field("ongoing_permission")
    private String ongoingPermission;

    @Field("status")
    private String status;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
    }

    public Long getVendorId() {
        return vendorId;
    }

    public void setVendorId(Long vendorId) {
        this.vendorId = vendorId;
    }

    public String getApiVersion() {
        return apiVersion;
    }

    public void setApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
    }

    public String getOngoingPermission() {
        return ongoingPermission;
    }

    public void setOngoingPermission(String ongoingPermission) {
        this.ongoingPermission = ongoingPermission;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
