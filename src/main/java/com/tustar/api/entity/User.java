package com.tustar.api.entity;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class User {
    private Integer id;
    private String created_at;
    private String updated_at;
    private String deleted_at;
    private String mobile;
    private Integer weight;
    private Boolean shared;
    private String nick;
    private String type;
}