package org.example.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@AllArgsConstructor
@ToString(includeFieldNames=true)
public class User {
    private Long id;
    private String logIn;
    private String password;
}
