package by.bsuir.source.service;

import by.bsuir.source.model.LibEnglish;
import by.bsuir.source.model.LibRus;
import by.bsuir.source.repository.MyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MyService {
    @Autowired
    private MyRepository repository;
    public List<LibEnglish> getAllEng(int id) {
        return repository.findAllEng(id);            //id_rus
    }
    public List<LibRus> getAllRus(int id){
        return repository.findAllRus(id);        //id_eng
    }

}


