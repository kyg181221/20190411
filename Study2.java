package n0411;

import java.awt.Button;
import java.awt.Choice;
import java.awt.Color;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.TextField;

class EmpSystem extends Frame{//사원 정보 관리 
	Label[] infos;//안내메세지용 레이블
	TextField[] inputs;//입력용 텍스트필드
	Choice depart;//부서이름 선택용 초이스
	Button[] btns;//버튼용 배열
	String[] depart_name = {"개발부","총무부","홍보부","영업부",
			"배송부","관리부"};
	EmpSystem(String title){
		super(title);
		infos = new Label[3];//레이블3개용 배열생성
		infos[0]=new Label("사번을 입력하세요.");
		infos[1]=new Label("이름을 입력하세요.");
		infos[2]=new Label("부서를 선택하세요.");
		inputs = new TextField[2];//테스트필드 2개용 배열생성
		inputs[0]=new TextField(10);
		inputs[0].setBackground(Color.CYAN);
		inputs[1]=new TextField(20);
		inputs[1].setBackground(Color.cyan);
		depart=new Choice();//초이스 생성
		depart.setBackground(Color.GREEN);
		for(int i=0; i<depart_name.length; i++) {
			depart.add(depart_name[i]);
		}//모든 부서명을 초이이스 추가
		btns = new Button[4];//버튼4개용 배열 생성
		btns[0]=new Button("삽 입"); btns[1]=new Button("삭 제");
		btns[2]=new Button("수 정"); btns[3]=new Button("조 회");
		this.setLayout(new GridLayout(5,4));
		//화면을 5행 4열로 분할해서 각 영역에 컴포넌트를 배치시키는
		//배치관리자(GridLayout) 생성
		this.add(new Label());this.add(new Label());
		this.add(new Label());this.add(new Label());
		this.add(new Label());
		this.add(infos[0]);	this.add(inputs[0]);
		this.add(new Label()); this.add(new Label());
		this.add(infos[1]);	this.add(inputs[1]);
		this.add(new Label()); this.add(new Label());
		this.add(infos[2]);	this.add(depart);
		this.add(new Label());
		this.add(btns[0]);this.add(btns[1]);
		this.add(btns[2]);this.add(btns[3]);
		this.setBackground(Color.YELLOW);
		this.setSize(500, 200);
		this.setVisible(true);
	}
}
public class Study2 {
	public static void main(String[] args) {
		EmpSystem es = new EmpSystem("사원정보관리 ver1.0");
	}
}
