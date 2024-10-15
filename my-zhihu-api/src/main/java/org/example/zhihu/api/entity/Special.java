package org.example.zhihu.api.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Special {
    private String id;
    private String title;
    private String banner;
    private String description;
    private String isFollowing;
    private Integer followersCount;
    private Integer viewCount;
    private String updated;
}
