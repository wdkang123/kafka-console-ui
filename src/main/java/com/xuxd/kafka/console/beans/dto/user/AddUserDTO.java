package com.xuxd.kafka.console.beans.dto.user;

import com.xuxd.kafka.console.beans.enums.Role;
import lombok.Data;

@Data
public class AddUserDTO {
    private String username;
    private String password;
    private Role role;
}
