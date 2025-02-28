package library_management.controller;

import library_management.model.dto.BookDto;
import library_management.service.BookService;
import org.apache.ibatis.annotations.Delete;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/book")
public class BookController {
    @Autowired
    private BookService bookService;

    // 도서 등록
    @PostMapping
    public boolean bookSave(@RequestBody BookDto bookDto) {
        System.out.println("BookController.bookSave");
        System.out.println("bookDto = " + bookDto);
        return bookService.bookSave(bookDto);
    }

    // 도서 전체 조회
    @GetMapping
    public List<BookDto> bookFindAll() {
        System.out.println("BookController.bookFindAll");
        return bookService.bookFindAll();
    }

    // 도서 개별 조회
    @GetMapping("/view")
    public BookDto bookFindBno(@RequestParam int bno) {
        System.out.println("BookController.bookFindBno");
        System.out.println("bno = " + bno);
        return bookService.bookFindBno(bno);
    }


    // 도서 수정
    @PutMapping
    public boolean bookUpdate(@RequestBody BookDto bookDto) {
        System.out.println("BookController.bookUpdate");
        System.out.println("bookDto = " + bookDto);
        return bookService.bookUpdate(bookDto);
    }

    // 도서 삭제
    @DeleteMapping
    public boolean bookDelete(@RequestParam int bno) {
        System.out.println("BookController.bookDelete");
        System.out.println("bno = " + bno);
        return bookService.bookDelete(bno);
    }
}
