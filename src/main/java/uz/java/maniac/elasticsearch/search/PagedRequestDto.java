package uz.java.maniac.elasticsearch.search;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PagedRequestDto {
    private static final int DEFAULT_SIZE = 100;

    private int page;
    private int size;
}
