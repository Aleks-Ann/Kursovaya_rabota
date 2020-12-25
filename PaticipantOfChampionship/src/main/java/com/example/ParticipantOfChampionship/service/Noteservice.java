package com.example.ParticipantOfChampionship.service;


import com.example.ParticipantOfChampionship.model.Note;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.ParticipantOfChampionship.repository.Noterepository;
import java.util.List;

@Service
public class Noteservice {

    private final Noterepository noterepository;

    @Autowired
    public Noteservice(Noterepository noteRepository) {
        this.noterepository = noteRepository;
    }

    public Note findById(Long id){
        return noterepository.getOne(id);
    }
    public List<Note> findAll(){
        return noterepository.findAll();
    }
    public Note saveNote(Note note){
        return noterepository.save(note);
    }
    public void deleteById(Long id){
        noterepository.deleteById(id);
    }
}