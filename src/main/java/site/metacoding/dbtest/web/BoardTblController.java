package site.metacoding.dbtest.web;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import site.metacoding.dbtest.domain.boardTbl.BoardTbl;
import site.metacoding.dbtest.domain.boardTbl.BoardTblRepository;

@Controller
public class BoardTblController {

    private BoardTblRepository boardTblRepository;

    public BoardTblController(BoardTblRepository boardTblRepository) {
        this.boardTblRepository = boardTblRepository;
    }

    @GetMapping("/search")
    public String search(@RequestParam(defaultValue = "") String keyword, Model model) { // keyword=스프링

        List<BoardTbl> boards = boardTblRepository.mSearch(keyword);
        // System.out.println("크기 : " + boards.size());
        model.addAttribute("boards", boards);
        return "home";
    }
}
