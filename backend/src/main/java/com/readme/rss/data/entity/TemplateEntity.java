package com.readme.rss.data.entity;

import com.readme.rss.data.dto.TemplateDTO;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
@Table(name = "Template")
public class TemplateEntity {
    @Id
    String templateId;
    String templateContributor;


    public TemplateDTO toDto(){
        return TemplateDTO.builder()
                .templateId(templateId)
                .templateContributor(templateContributor)
                .build();
    }
}
