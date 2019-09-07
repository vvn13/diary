package com.vvn13.diary2.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "modelslink")
public class ModelsLink {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "modelslink_id")
    private Long modelsLinkId;

    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinColumn(name = "student_id")
    private Student student;

    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinColumn(name = "subject_id")
    private Subject subject;

    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinColumn(name = "mark_id")
    private SubjectMark subjectMark;
}
