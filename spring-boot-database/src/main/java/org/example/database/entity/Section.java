package org.example.database.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.security.PrivateKey;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Section {
    private String sectionId;
    private String specialId;
    private String sectionTitle;
}
