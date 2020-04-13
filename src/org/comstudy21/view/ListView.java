package org.comstudy21.view;

import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class ListView extends View {
	//IoC 디자인 패턴(제어의 역전) - 사용할 데이터를 외부에서 생성하고 입력한다.
	DefaultTableModel dm;
	public void setTableModel(DefaultTableModel dm){
		this.dm = dm;
	}
	public ListView(DefaultTableModel dm, Object[] colNames) {
		this.dm = dm;
		dm.setColumnIdentifiers(colNames);
		init();
	}

	@Override
	public void init() {
		
		JTable table = new JTable(dm);
		JScrollPane scrollPane = new JScrollPane(table);
		
		add(scrollPane);
	}

	@Override
	public void start() {

	}

}
