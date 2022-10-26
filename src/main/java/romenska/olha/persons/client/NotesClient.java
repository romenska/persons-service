package romenska.olha.persons.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import romenska.olha.persons.dto.NoteDto;

import java.util.List;

@FeignClient(name="notes")
public interface NotesClient {
    @GetMapping("/notes")
    public List<NoteDto> getNotesByPersonId(@RequestParam Long personId);
}
