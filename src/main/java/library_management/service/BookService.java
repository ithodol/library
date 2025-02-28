package library_management.service;

import library_management.model.dto.BookDto;
import library_management.model.mapper.BookMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
    @Autowired
    private BookMapper bookMapper;

    public boolean bookSave(BookDto bookDto){
        return bookMapper.bookSave(bookDto);
    }

    public List<BookDto> bookFindAll(){
        return bookMapper.bookFindAll();
    }

    public BookDto bookFindBno(int bno){
        return bookMapper.bookFindBno(bno);
    }

    public boolean bookUpdate(BookDto bookDto){
        return bookMapper.bookUpdate(bookDto);
    }

    public boolean bookDelete(int bno){
        return bookMapper.bookDelete(bno);
    }
}
