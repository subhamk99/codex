package com.codex.lab.dto.response;

import lombok.*;
@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CodeExecutionResponse {

    private String codeContent;
    private String codeOutput;
    private int language;
}