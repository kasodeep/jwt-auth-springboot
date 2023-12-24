package dev.deep.security.book;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;

@Data
@Builder
@Entity
@EntityListeners(AuditingEntityListener.class)
public class Book {

    @Id
    @GeneratedValue
    private Integer id;

    private String author;

    private String isbn;

    @CreatedDate
    @Column(
            nullable = false,
            updatable = false
    )
    private LocalDateTime createDate;

    @LastModifiedDate
    @Column(insertable = false)
    private LocalDateTime lastModified;

    @CreatedBy
    @Column(
            nullable = false,
            updatable = false
    )
    private Integer createdBy;

    @LastModifiedBy
    @Column(insertable = false)
    private Integer lastModifiedBy;

    public Book() {
    }

    public Book(Integer id, String author, String isbn, LocalDateTime createDate, LocalDateTime lastModified, Integer createdBy, Integer lastModifiedBy) {
        this.id = id;
        this.author = author;
        this.isbn = isbn;
        this.createDate = createDate;
        this.lastModified = lastModified;
        this.createdBy = createdBy;
        this.lastModifiedBy = lastModifiedBy;
    }
}
