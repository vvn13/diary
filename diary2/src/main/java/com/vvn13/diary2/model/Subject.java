package com.vvn13.diary2.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "subject")
public class Subject {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "subject_id")
    private Long subjectId;

    @Column(name = "title")
    private String title;

    @OneToMany(mappedBy = "subject", cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    private Set<ModelsLink> modelsLinks;
}
