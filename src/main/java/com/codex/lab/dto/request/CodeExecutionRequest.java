package com.codex.lab.dto.request;

import lombok.*;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CodeExecutionRequest {

    private String codeContent;

    private int language;
}
