package application.controller;

import java.util.List;

import application.DTO.Board;
import application.Service.BoardService;
import application.Service.BoardServiceImpl;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class ListController {

    @FXML
    private TableView<Board> boardTableView;

    @FXML
    private TableColumn<Board, Integer> colNo;
    
    @FXML
    private TableColumn<Board, String> colTitle;


    @FXML
    private TableColumn<Board, String> colWriter;
    
    @FXML
    private TableColumn<Board, String> colRegDate;

    @FXML
    private TableColumn<Board, Integer> colView;
    
    List<Board> boardList = null;
    
    //게시글 목록 서비스
    private BoardService boardService = new BoardServiceImpl();
		   
    @FXML
    public void initialize() {
    		
    	boardList = boardService.list();
    	
    	// TableColumn  에 board 객체의 속성 매핑하기
    	colNo.setCellValueFactory( new PropertyValueFactory<>("No") );
    	colTitle.setCellValueFactory( new PropertyValueFactory<>("Title") );
    	colWriter.setCellValueFactory( new PropertyValueFactory<>("Writer") );
    	colRegDate.setCellValueFactory( new PropertyValueFactory<>("RegDate") );
    	colView.setCellValueFactory( new PropertyValueFactory<>("View") );
    	
    	//(코드설명)
    	// new PropertyValueFactory<>("View") :(게터)이름 값으로 들어갈 객체의 게터이름을 지정
    	// ex) new PropertyValueFactory<>("Title") --> getTitle() 게터메소드의 겟을 제와한 타이틀과 일치
    	//setCellValueFactory()
    	// module-info.java 에 java.base 모듈 추가해야 사용가능
    	
    	
    	
    	//테이블 뷰에 데이터 추가하기
    	ObservableList<Board> list = FXCollections.observableArrayList(boardList);
    	boardTableView.setItems(list);
    }

    @FXML
    void toInsert(ActionEvent event) {

    }

}
