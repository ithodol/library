package library_management.model.dto;

import lombok.*;

@Getter @Setter @ToString
@NoArgsConstructor @AllArgsConstructor
public class BookDto {
    private int bno;
    private String bname;
    private String bwriter;
    private String bpub;
}
