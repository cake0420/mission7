package umc.Study.domain;

import lombok.*;
import umc.Study.domain.common.BaseEntity;
import umc.Study.domain.mapping.MemberPrefer;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Getter
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor

public class foodCategory extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 15)
    private String name;


}
