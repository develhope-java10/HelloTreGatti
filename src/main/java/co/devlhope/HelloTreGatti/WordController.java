package co.devlhope.HelloTreGatti;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/words")
public class WordController {
	@Autowired
	WordRepository wordRepository;
	
	@PostMapping
	public Word postWord(@RequestBody Word word){
		Word savedWord = wordRepository.save(word);
		return savedWord;
	}
	@GetMapping
	public List<Word> getWords(){
		return wordRepository.findAll();
	}
}
