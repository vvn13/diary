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
@Table(name = "subjectmark")
public class SubjectMark {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "mark_id")
    private Long markId;

    @Column(name = "mark")
    private int mark;

    @OneToMany(mappedBy = "subjectMark", cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    private Set<ModelsLink> modelsLinks;
}
