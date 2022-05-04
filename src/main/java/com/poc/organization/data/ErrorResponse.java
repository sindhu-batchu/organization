package com.poc.organization.data;

import lombok.*;

@Getter
@Setter(AccessLevel.PUBLIC)
@NoArgsConstructor
@AllArgsConstructor
public class ErrorResponse {
    private String message;
}
