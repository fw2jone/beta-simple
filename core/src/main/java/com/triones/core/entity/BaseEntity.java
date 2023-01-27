package com.triones.core.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.time.LocalDateTime;

@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class BaseEntity {

    @EqualsAndHashCode.Include
    protected String id;

    protected LocalDateTime createAt;

    protected Long updateAt;

    @Builder.Default
    protected Integer versionNum = 0;

}
