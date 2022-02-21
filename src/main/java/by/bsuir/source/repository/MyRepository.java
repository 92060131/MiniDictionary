package by.bsuir.source.repository;

import by.bsuir.source.model.LibEnglish;
import by.bsuir.source.model.LibRus;
import by.bsuir.source.model.RusEng;
import by.bsuir.source.utils.DBUtils;
import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

@Repository
public class MyRepository {
    public List<LibEnglish> findAllEng(int index) //id_rus
    {
        List<LibEnglish> listEngWord = new ArrayList<>();
        try (Connection dbConn = DBUtils.getDBConn();
             Statement allWordsEng = dbConn.createStatement();
             ResultSet rs = allWordsEng.executeQuery("select word_english from LibEnglish join RusEng on RusEng.id_eng=LibEnglish.id_english where id_rus=index;");
        ) {
            while (rs.next()) {
                listEngWord.add(new LibEnglish(
                        rs.getInt("id_english"),
                        rs.getString("word_english")
                        ));
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return listEngWord;
    }
    public List<LibRus> findAllRus(int index)   //id_eng
    {
        List<LibRus> listRusWord = new ArrayList<>();
        try (Connection dbConn = DBUtils.getDBConn();
             Statement allRus = dbConn.createStatement();
             ResultSet rs = allRus.executeQuery("select word_russian from LibRus join RusEng on RusEng.id_rus=LibRus.id_russian  where id_eng=index;");
        ) {
            while (rs.next()) {
                listRusWord.add(new LibRus(
                        rs.getInt("id"),
                        rs.getString("word_russian")
                ));
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return listRusWord;
    }

}
